package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: com.google.android.exoplayer2.metadata.id3.Id3Decoder$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return Id3Decoder.$r8$lambda$qybkd67L1bf5IrQRNgWj3sxvPfg(i, i2, i3, i4, i5);
        }
    };
    private final FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    public static /* synthetic */ boolean $r8$lambda$qybkd67L1bf5IrQRNgWj3sxvPfg(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    private static int delimiterLength(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public Id3Decoder() {
        this(null);
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    protected Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Metadata decode(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        Id3Header decodeHeader = decodeHeader(parsableByteArray);
        if (decodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i2 = decodeHeader.majorVersion == 2 ? 6 : 10;
        int i3 = decodeHeader.framesSize;
        if (decodeHeader.isUnsynchronized) {
            i3 = removeUnsynchronization(parsableByteArray, decodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + i3);
        boolean z = false;
        if (!validateFrames(parsableByteArray, decodeHeader.majorVersion, i2, false)) {
            if (decodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i2, true)) {
                Log.w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + decodeHeader.majorVersion);
                return null;
            }
            z = true;
        }
        while (parsableByteArray.bytesLeft() >= i2) {
            Id3Frame decodeFrame = decodeFrame(decodeHeader.majorVersion, parsableByteArray, z, i2, this.framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new Metadata(arrayList);
    }

    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        boolean z = false;
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (readUnsignedInt24 != 4801587) {
            Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(readUnsignedInt24)));
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
        if (readUnsignedByte == 2) {
            if ((readUnsignedByte2 & 64) != 0) {
                Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (readUnsignedByte == 3) {
            if ((readUnsignedByte2 & 64) != 0) {
                int readInt = parsableByteArray.readInt();
                parsableByteArray.skipBytes(readInt);
                readSynchSafeInt -= readInt + 4;
            }
        } else {
            if (readUnsignedByte != 4) {
                Log.w("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + readUnsignedByte);
                return null;
            }
            if ((readUnsignedByte2 & 64) != 0) {
                int readSynchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(readSynchSafeInt2 - 4);
                readSynchSafeInt -= readSynchSafeInt2;
            }
            if ((readUnsignedByte2 & 16) != 0) {
                readSynchSafeInt -= 10;
            }
        }
        if (readUnsignedByte < 4 && (readUnsignedByte2 & 128) != 0) {
            z = true;
        }
        return new Id3Header(readUnsignedByte, z, readSynchSafeInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i, int i2, boolean z) {
        int readUnsignedInt24;
        long readUnsignedInt242;
        int i3;
        int i4;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z2 = true;
                if (parsableByteArray.bytesLeft() < i2) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i >= 3) {
                    readUnsignedInt24 = parsableByteArray.readInt();
                    readUnsignedInt242 = parsableByteArray.readUnsignedInt();
                    i3 = parsableByteArray.readUnsignedShort();
                } else {
                    readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
                    readUnsignedInt242 = parsableByteArray.readUnsignedInt24();
                    i3 = 0;
                }
                if (readUnsignedInt24 == 0 && readUnsignedInt242 == 0 && i3 == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & readUnsignedInt242) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    readUnsignedInt242 = (((readUnsignedInt242 >> 24) & 255) << 21) | (readUnsignedInt242 & 255) | (((readUnsignedInt242 >> 8) & 255) << 7) | (((readUnsignedInt242 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i4 = (i3 & 64) != 0 ? 1 : 0;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                    }
                    z2 = false;
                    if (z2) {
                        i4 += 4;
                    }
                    if (readUnsignedInt242 < i4) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    if (parsableByteArray.bytesLeft() >= readUnsignedInt242) {
                        parsableByteArray.skipBytes((int) readUnsignedInt242);
                    } else {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                }
            } catch (Throwable th) {
                parsableByteArray.setPosition(position);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x018b, code lost:
    
        if (r4 == 67) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0202 A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #1 {all -> 0x01e3, blocks: (B:61:0x0202, B:128:0x01de, B:135:0x01f3, B:136:0x01f8), top: B:52:0x010c }] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Id3Frame decodeFrame(int i, ParsableByteArray parsableByteArray, boolean z, int i2, FramePredicate framePredicate) {
        int readUnsignedInt24;
        ?? r1;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ParsableByteArray parsableByteArray2;
        int i6;
        int i7;
        int i8;
        int i9;
        ParsableByteArray parsableByteArray3;
        Id3Frame decodeBinaryFrame;
        int i10 = i;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
        boolean z6 = false;
        int readUnsignedByte4 = i10 >= 3 ? parsableByteArray.readUnsignedByte() : 0;
        if (i10 == 4) {
            readUnsignedInt24 = parsableByteArray.readUnsignedIntToInt();
            if (!z) {
                readUnsignedInt24 = (((readUnsignedInt24 >> 24) & NotificationCenter.didReceiveSmsCode) << 21) | (readUnsignedInt24 & NotificationCenter.didReceiveSmsCode) | (((readUnsignedInt24 >> 8) & NotificationCenter.didReceiveSmsCode) << 7) | (((readUnsignedInt24 >> 16) & NotificationCenter.didReceiveSmsCode) << 14);
            }
        } else if (i10 == 3) {
            readUnsignedInt24 = parsableByteArray.readUnsignedIntToInt();
        } else {
            readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        }
        int i11 = readUnsignedInt24;
        int readUnsignedShort = i10 >= 3 ? parsableByteArray.readUnsignedShort() : 0;
        if (readUnsignedByte == 0 && readUnsignedByte2 == 0 && readUnsignedByte3 == 0 && readUnsignedByte4 == 0 && i11 == 0 && readUnsignedShort == 0) {
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        int position = parsableByteArray.getPosition() + i11;
        if (position > parsableByteArray.limit()) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        if (framePredicate != null) {
            boolean evaluate = framePredicate.evaluate(i10, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4);
            i10 = i10;
            r1 = readUnsignedByte2;
            i3 = readUnsignedByte;
            i4 = readUnsignedByte3;
            i5 = readUnsignedByte4;
            if (!evaluate) {
                parsableByteArray.setPosition(position);
                return null;
            }
        } else {
            r1 = readUnsignedByte2;
            i3 = readUnsignedByte;
            i4 = readUnsignedByte3;
            i5 = readUnsignedByte4;
        }
        if (i10 == 3) {
            z6 = (readUnsignedShort & 128) != 0;
            z4 = (readUnsignedShort & 64) != 0;
            z5 = false;
            z2 = (readUnsignedShort & 32) != 0;
            z3 = z6;
        } else if (i10 == 4) {
            z2 = (readUnsignedShort & 64) != 0;
            boolean z7 = (readUnsignedShort & 8) != 0;
            z4 = (readUnsignedShort & 4) != 0;
            z5 = (readUnsignedShort & 2) != 0;
            z6 = z7;
            z3 = (readUnsignedShort & 1) != 0;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        if (z6 || z4) {
            Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.setPosition(position);
            return null;
        }
        if (z2) {
            i11--;
            parsableByteArray.skipBytes(1);
        }
        if (z3) {
            i11 -= 4;
            parsableByteArray.skipBytes(4);
        }
        if (z5) {
            i11 = removeUnsynchronization(parsableByteArray, i11);
        }
        try {
            try {
                if (i3 == 84 && r1 == 88 && i4 == 88 && (i10 == 2 || i5 == 88)) {
                    decodeBinaryFrame = decodeTxxxFrame(parsableByteArray, i11);
                } else if (i3 == 84) {
                    decodeBinaryFrame = decodeTextInformationFrame(parsableByteArray, i11, getFrameId(i10, i3, r1, i4, i5));
                } else if (i3 == 87 && r1 == 88 && i4 == 88 && (i10 == 2 || i5 == 88)) {
                    decodeBinaryFrame = decodeWxxxFrame(parsableByteArray, i11);
                } else if (i3 == 87) {
                    decodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray, i11, getFrameId(i10, i3, r1, i4, i5));
                } else if (i3 == 80 && r1 == 82 && i4 == 73 && i5 == 86) {
                    decodeBinaryFrame = decodePrivFrame(parsableByteArray, i11);
                } else if (i3 == 71 && r1 == 69 && i4 == 79 && (i5 == 66 || i10 == 2)) {
                    decodeBinaryFrame = decodeGeobFrame(parsableByteArray, i11);
                } else {
                    if (i10 != 2) {
                        if (i3 == 65) {
                            if (r1 == 80) {
                                if (i4 == 73) {
                                }
                            }
                        }
                        if (i3 != 67) {
                        }
                        if (i3 != 67) {
                        }
                        i6 = r1;
                        i7 = i4;
                        i8 = i11;
                        i9 = i5;
                        if (i3 != 67) {
                        }
                        i10 = i;
                        parsableByteArray3 = parsableByteArray;
                        if (i3 != 77) {
                        }
                        decodeBinaryFrame = decodeBinaryFrame(parsableByteArray3, i8, getFrameId(i10, i3, i6, i7, i9));
                        r1 = parsableByteArray3;
                        if (decodeBinaryFrame == null) {
                        }
                        r1.setPosition(position);
                        return decodeBinaryFrame;
                    }
                    if (i3 == 80 && r1 == 73 && i4 == 67) {
                        decodeBinaryFrame = decodeApicFrame(parsableByteArray, i11, i10);
                    }
                    if (i3 != 67 && r1 == 79 && i4 == 77 && (i5 == 77 || i10 == 2)) {
                        decodeBinaryFrame = decodeCommentFrame(parsableByteArray, i11);
                    } else {
                        if (i3 != 67 && r1 == 72 && i4 == 65 && i5 == 80) {
                            i6 = r1;
                            i7 = i4;
                            i8 = i11;
                            i9 = i5;
                            try {
                                decodeBinaryFrame = decodeChapterFrame(parsableByteArray, i8, i10, z, i2, framePredicate);
                                i10 = i;
                                r1 = parsableByteArray;
                            } catch (Throwable th) {
                                th = th;
                                parsableByteArray2 = parsableByteArray;
                                parsableByteArray2.setPosition(position);
                                throw th;
                            }
                        } else {
                            i6 = r1;
                            i7 = i4;
                            i8 = i11;
                            i9 = i5;
                            if (i3 != 67 && i6 == 84 && i7 == 79 && i9 == 67) {
                                i10 = i;
                                ParsableByteArray parsableByteArray4 = parsableByteArray;
                                decodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray4, i8, i10, z, i2, framePredicate);
                                r1 = parsableByteArray4;
                            } else {
                                i10 = i;
                                parsableByteArray3 = parsableByteArray;
                                if (i3 != 77 && i6 == 76 && i7 == 76 && i9 == 84) {
                                    decodeBinaryFrame = decodeMlltFrame(parsableByteArray3, i8);
                                    r1 = parsableByteArray3;
                                } else {
                                    decodeBinaryFrame = decodeBinaryFrame(parsableByteArray3, i8, getFrameId(i10, i3, i6, i7, i9));
                                    r1 = parsableByteArray3;
                                }
                            }
                        }
                        if (decodeBinaryFrame == null) {
                            Log.w("Id3Decoder", "Failed to decode frame: id=" + getFrameId(i10, i3, i6, i7, i9) + ", frameSize=" + i8);
                        }
                        r1.setPosition(position);
                        return decodeBinaryFrame;
                    }
                }
                i6 = r1;
                i7 = i4;
                r1 = parsableByteArray;
                i8 = i11;
                i9 = i5;
                if (decodeBinaryFrame == null) {
                }
                r1.setPosition(position);
                return decodeBinaryFrame;
            } catch (Throwable th2) {
                th = th2;
                parsableByteArray2 = r1;
            }
        } catch (Throwable th3) {
            th = th3;
            parsableByteArray2 = parsableByteArray;
        }
    }

    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int indexOfTerminator = indexOfTerminator(bArr, 0, readUnsignedByte);
        return new TextInformationFrame("TXXX", new String(bArr, 0, indexOfTerminator, getCharset(readUnsignedByte)), decodeTextInformationFrameValues(bArr, readUnsignedByte, indexOfTerminator + delimiterLength(readUnsignedByte)));
    }

    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i, String str) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new TextInformationFrame(str, null, decodeTextInformationFrameValues(bArr, readUnsignedByte, 0));
    }

    private static ImmutableList decodeTextInformationFrameValues(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.of((Object) "");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int indexOfTerminator = indexOfTerminator(bArr, i2, i);
        while (i2 < indexOfTerminator) {
            builder.add((Object) new String(bArr, i2, indexOfTerminator - i2, getCharset(i)));
            i2 = delimiterLength(i) + indexOfTerminator;
            indexOfTerminator = indexOfTerminator(bArr, i2, i);
        }
        ImmutableList build = builder.build();
        return build.isEmpty() ? ImmutableList.of((Object) "") : build;
    }

    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int indexOfTerminator = indexOfTerminator(bArr, 0, readUnsignedByte);
        String str = new String(bArr, 0, indexOfTerminator, getCharset(readUnsignedByte));
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, delimiterLength, indexOfZeroByte(bArr, delimiterLength), Charsets.ISO_8859_1));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), Charsets.ISO_8859_1));
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, indexOfZeroByte, Charsets.ISO_8859_1), copyOfRangeIfValid(bArr, indexOfZeroByte + 1, i));
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, indexOfZeroByte, Charsets.ISO_8859_1);
        int i3 = indexOfZeroByte + 1;
        int indexOfTerminator = indexOfTerminator(bArr, i3, readUnsignedByte);
        String decodeStringIfValid = decodeStringIfValid(bArr, i3, indexOfTerminator, charset);
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        int indexOfTerminator2 = indexOfTerminator(bArr, delimiterLength, readUnsignedByte);
        return new GeobFrame(str, decodeStringIfValid, decodeStringIfValid(bArr, delimiterLength, indexOfTerminator2, charset), copyOfRangeIfValid(bArr, indexOfTerminator2 + delimiterLength(readUnsignedByte), i2));
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i, int i2) {
        int indexOfZeroByte;
        String str;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, Charsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            indexOfZeroByte = 2;
        } else {
            indexOfZeroByte = indexOfZeroByte(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, indexOfZeroByte, Charsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = bArr[indexOfZeroByte + 1] & 255;
        int i5 = indexOfZeroByte + 2;
        int indexOfTerminator = indexOfTerminator(bArr, i5, readUnsignedByte);
        return new ApicFrame(str, new String(bArr, i5, indexOfTerminator - i5, charset), i4, copyOfRangeIfValid(bArr, indexOfTerminator + delimiterLength(readUnsignedByte), i3));
    }

    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i) {
        if (i < 4) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.readBytes(bArr2, 0, i2);
        int indexOfTerminator = indexOfTerminator(bArr2, 0, readUnsignedByte);
        String str2 = new String(bArr2, 0, indexOfTerminator, charset);
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, delimiterLength, indexOfTerminator(bArr2, delimiterLength, readUnsignedByte), charset));
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) {
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, indexOfZeroByte - position, Charsets.ISO_8859_1);
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (readUnsignedInt == 4294967295L) {
            readUnsignedInt = -1;
        }
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        long j = readUnsignedInt2 == 4294967295L ? -1L : readUnsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i4 = position + i;
        while (parsableByteArray.getPosition() < i4) {
            Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new ChapterFrame(str, readInt, readInt2, readUnsignedInt, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) {
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, indexOfZeroByte - position, Charsets.ISO_8859_1);
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        boolean z2 = (readUnsignedByte & 2) != 0;
        boolean z3 = (readUnsignedByte & 1) != 0;
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[readUnsignedByte2];
        for (int i4 = 0; i4 < readUnsignedByte2; i4++) {
            int position2 = parsableByteArray.getPosition();
            int indexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i4] = new String(parsableByteArray.getData(), position2, indexOfZeroByte2 - position2, Charsets.ISO_8859_1);
            parsableByteArray.setPosition(indexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = position + i;
        while (parsableByteArray.getPosition() < i5) {
            Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        int readUnsignedInt242 = parsableByteArray.readUnsignedInt24();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i2 = ((i - 10) * 8) / (readUnsignedByte + readUnsignedByte2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int readBits = parsableBitArray.readBits(readUnsignedByte);
            int readBits2 = parsableBitArray.readBits(readUnsignedByte2);
            iArr[i3] = readBits;
            iArr2[i3] = readBits2;
        }
        return new MlltFrame(readUnsignedShort, readUnsignedInt24, readUnsignedInt242, iArr, iArr2);
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i2 = position;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= position + i) {
                return i;
            }
            if ((data[i2] & 255) == 255 && data[i3] == 0) {
                System.arraycopy(data, i2 + 2, data, i3, (i - (i2 - position)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static Charset getCharset(int i) {
        if (i == 1) {
            return Charsets.UTF_16;
        }
        if (i == 2) {
            return Charsets.UTF_16BE;
        }
        if (i == 3) {
            return Charsets.UTF_8;
        }
        return Charsets.ISO_8859_1;
    }

    private static String getFrameId(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int indexOfTerminator(byte[] bArr, int i, int i2) {
        int indexOfZeroByte = indexOfZeroByte(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return indexOfZeroByte;
        }
        while (indexOfZeroByte < bArr.length - 1) {
            if ((indexOfZeroByte - i) % 2 == 0 && bArr[indexOfZeroByte + 1] == 0) {
                return indexOfZeroByte;
            }
            indexOfZeroByte = indexOfZeroByte(bArr, indexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return Util.EMPTY_BYTE_ARRAY;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static String decodeStringIfValid(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 <= i || i2 > bArr.length) {
            return "";
        }
        return new String(bArr, i, i2 - i, charset);
    }

    private static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i, boolean z, int i2) {
            this.majorVersion = i;
            this.isUnsynchronized = z;
            this.framesSize = i2;
        }
    }
}
