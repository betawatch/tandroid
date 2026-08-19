package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
abstract class AtomParsers {
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    private interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static List parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, Function function) {
        Track track;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerAtom.containerChildren.size(); i++) {
            Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) containerAtom.containerChildren.get(i);
            if (containerAtom2.type == 1953653099 && (track = (Track) function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(track, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835297121))).getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Pair parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = null;
        Metadata metadata2 = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = parseUdtaMeta(parsableByteArray, position + readInt);
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata2 = parseSmta(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return Pair.create(metadata, metadata2);
    }

    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1751411826);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1801812339);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1768715124);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != 1835299937) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i] = parsableByteArray.readString(readInt2 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int readInt3 = parsableByteArray2.readInt();
            int readInt4 = parsableByteArray2.readInt() - 1;
            if (readInt4 >= 0 && readInt4 < readInt) {
                MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                if (parseMdtaMetadataEntryFromIlst != null) {
                    arrayList.add(parseMdtaMetadataEntryFromIlst);
                }
            } else {
                Log.w("AtomParsers", "Skipped metadata with unknown key index: " + readInt4);
            }
            parsableByteArray2.setPosition(position + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) {
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair parseEdts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1751411826))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1953196132))).data);
        long j2 = j == -9223372036854775807L ? parseTkhd.duration : j;
        long parseMvhd = parseMvhd(leafAtom.data);
        long scaleLargeTimestamp = j2 != -9223372036854775807L ? Util.scaleLargeTimestamp(j2, 1000000L, parseMvhd) : -9223372036854775807L;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212));
        Pair parseMdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1835296868))).data);
        Atom.LeafAtom leafAtomOfType = containerAtom3.getLeafAtomOfType(1937011556);
        if (leafAtomOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData parseStsd = parseStsd(leafAtomOfType.data, parseTkhd.id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom.getContainerAtomOfType(1701082227)) == null || (parseEdts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) parseEdts.first;
            jArr2 = (long[]) parseEdts.second;
            jArr = jArr3;
        }
        if (parseStsd.format == null) {
            return null;
        }
        return new Track(parseTkhd.id, trackTypeForHdlr, ((Long) parseMdhd.first).longValue(), parseMvhd, scaleLargeTimestamp, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        long j;
        long[] jArr;
        int i4;
        int i5;
        long j2;
        boolean z3;
        int[] iArr;
        long[] jArr2;
        int i6;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i7;
        int i8;
        int i9;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1937011578);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType, track.format);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1937013298);
            if (leafAtomOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1937007471);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1668232756));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1937011555))).data;
        ParsableByteArray parsableByteArray3 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1937011827))).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(1937011571);
        ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(1668576371);
        ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray3.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray3.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i = parsableByteArray5.readUnsignedIntToInt();
        } else {
            i = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            i2 = parsableByteArray4.readUnsignedIntToInt();
            if (i2 > 0) {
                i3 = parsableByteArray4.readUnsignedIntToInt() - 1;
                int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
                String str = track.format.sampleMimeType;
                z2 = fixedSampleSize == -1 && ("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && readUnsignedIntToInt == 0 && i == 0 && i2 == 0;
                SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
                if (!z2) {
                    int i10 = chunkIterator.length;
                    long[] jArr4 = new long[i10];
                    int[] iArr6 = new int[i10];
                    while (chunkIterator.moveNext()) {
                        int i11 = chunkIterator.index;
                        jArr4[i11] = chunkIterator.offset;
                        iArr6[i11] = chunkIterator.numSamples;
                    }
                    FixedSampleSizeRechunker.Results rechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr4, iArr6, readUnsignedIntToInt3);
                    long[] jArr5 = rechunk.offsets;
                    iArr = rechunk.sizes;
                    int i12 = rechunk.maximumSize;
                    long[] jArr6 = rechunk.timestamps;
                    int[] iArr7 = rechunk.flags;
                    j2 = rechunk.duration;
                    jArr2 = jArr5;
                    i6 = i12;
                    jArr = jArr6;
                    iArr2 = iArr7;
                    j = 0;
                } else {
                    long[] jArr7 = new long[sampleCount];
                    j = 0;
                    int[] iArr8 = new int[sampleCount];
                    jArr = new long[sampleCount];
                    ParsableByteArray parsableByteArray6 = parsableByteArray5;
                    int[] iArr9 = new int[sampleCount];
                    ParsableByteArray parsableByteArray7 = parsableByteArray4;
                    int i13 = i3;
                    long j3 = 0;
                    long j4 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = i;
                    int i19 = readUnsignedIntToInt3;
                    int i20 = readUnsignedIntToInt2;
                    int i21 = readUnsignedIntToInt;
                    int i22 = 0;
                    while (true) {
                        if (i14 >= sampleCount) {
                            i4 = i20;
                            i5 = i16;
                            break;
                        }
                        long j5 = j4;
                        int i23 = i16;
                        boolean z4 = true;
                        while (i23 == 0) {
                            z4 = chunkIterator.moveNext();
                            if (!z4) {
                                break;
                            }
                            int i24 = i20;
                            long j6 = chunkIterator.offset;
                            i23 = chunkIterator.numSamples;
                            j5 = j6;
                            i20 = i24;
                            i19 = i19;
                            sampleCount = sampleCount;
                        }
                        int i25 = sampleCount;
                        i4 = i20;
                        int i26 = i19;
                        if (!z4) {
                            Log.w("AtomParsers", "Unexpected end of chunk data");
                            long[] copyOf = Arrays.copyOf(jArr7, i14);
                            iArr8 = Arrays.copyOf(iArr8, i14);
                            jArr = Arrays.copyOf(jArr, i14);
                            iArr9 = Arrays.copyOf(iArr9, i14);
                            jArr7 = copyOf;
                            sampleCount = i14;
                            i5 = i23;
                            break;
                        }
                        if (parsableByteArray6 != null) {
                            int i27 = i17;
                            while (i27 == 0 && i18 > 0) {
                                i27 = parsableByteArray6.readUnsignedIntToInt();
                                i15 = parsableByteArray6.readInt();
                                i18--;
                            }
                            i17 = i27 - 1;
                        }
                        jArr7[i14] = j5;
                        int readNextSampleSize = sampleSizeBox.readNextSampleSize();
                        iArr8[i14] = readNextSampleSize;
                        if (readNextSampleSize > i22) {
                            i22 = readNextSampleSize;
                        }
                        jArr[i14] = j3 + i15;
                        iArr9[i14] = parsableByteArray7 == null ? 1 : 0;
                        if (i14 == i13) {
                            iArr9[i14] = 1;
                            i2--;
                            if (i2 > 0) {
                                i13 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray7)).readUnsignedIntToInt() - 1;
                            }
                        }
                        j3 += i26;
                        int i28 = i4 - 1;
                        if (i28 != 0 || i21 <= 0) {
                            i19 = i26;
                        } else {
                            i28 = parsableByteArray3.readUnsignedIntToInt();
                            i21--;
                            i19 = parsableByteArray3.readInt();
                        }
                        i20 = i28;
                        long j7 = j5 + iArr8[i14];
                        i16 = i23 - 1;
                        i14++;
                        j4 = j7;
                        sampleCount = i25;
                    }
                    j2 = j3 + i15;
                    if (parsableByteArray6 != null) {
                        while (i18 > 0) {
                            if (parsableByteArray6.readUnsignedIntToInt() != 0) {
                                z3 = false;
                                break;
                            }
                            parsableByteArray6.readInt();
                            i18--;
                        }
                    }
                    z3 = true;
                    if (i2 != 0 || i4 != 0 || i5 != 0 || i21 != 0 || i17 != 0 || !z3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Inconsistent stbl box for track ");
                        sb.append(track.id);
                        sb.append(": remainingSynchronizationSamples ");
                        sb.append(i2);
                        sb.append(", remainingSamplesAtTimestampDelta ");
                        sb.append(i4);
                        sb.append(", remainingSamplesInChunk ");
                        sb.append(i5);
                        sb.append(", remainingTimestampDeltaChanges ");
                        sb.append(i21);
                        sb.append(", remainingSamplesAtTimestampOffset ");
                        sb.append(i17);
                        sb.append(!z3 ? ", ctts invalid" : "");
                        Log.w("AtomParsers", sb.toString());
                    }
                    iArr = iArr8;
                    jArr2 = jArr7;
                    i6 = i22;
                    iArr2 = iArr9;
                }
                long j8 = j2;
                long scaleLargeTimestamp = Util.scaleLargeTimestamp(j8, 1000000L, track.timescale);
                jArr3 = track.editListDurations;
                if (jArr3 != null) {
                    Util.scaleLargeTimestampsInPlace(jArr, 1000000L, track.timescale);
                    return new TrackSampleTable(track, jArr2, iArr, i6, jArr, iArr2, scaleLargeTimestamp);
                }
                int[] iArr10 = iArr;
                int i29 = sampleCount;
                int[] iArr11 = iArr10;
                if (jArr3.length == 1 && track.type == 1 && jArr.length >= 2) {
                    long j9 = ((long[]) Assertions.checkNotNull(track.editListMediaTimes))[0];
                    long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(track.editListDurations[0], track.timescale, track.movieTimescale) + j9;
                    long[] jArr8 = jArr2;
                    long[] jArr9 = jArr;
                    boolean canApplyEditWithGaplessInfo = canApplyEditWithGaplessInfo(jArr9, j8, j9, scaleLargeTimestamp2);
                    jArr = jArr9;
                    j8 = j8;
                    if (canApplyEditWithGaplessInfo) {
                        long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j9 - jArr[0], track.format.sampleRate, track.timescale);
                        long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j8 - scaleLargeTimestamp2, track.format.sampleRate, track.timescale);
                        if ((scaleLargeTimestamp3 != j || scaleLargeTimestamp4 != j) && scaleLargeTimestamp3 <= 2147483647L && scaleLargeTimestamp4 <= 2147483647L) {
                            gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                            gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                            Util.scaleLargeTimestampsInPlace(jArr, 1000000L, track.timescale);
                            return new TrackSampleTable(track, jArr8, iArr11, i6, jArr, iArr2, Util.scaleLargeTimestamp(track.editListDurations[0], 1000000L, track.movieTimescale));
                        }
                    }
                    jArr2 = jArr8;
                    iArr11 = iArr11;
                }
                long[] jArr10 = track.editListDurations;
                if (jArr10.length == 1 && jArr10[0] == j) {
                    long j10 = ((long[]) Assertions.checkNotNull(track.editListMediaTimes))[0];
                    for (int i30 = 0; i30 < jArr.length; i30++) {
                        jArr[i30] = Util.scaleLargeTimestamp(jArr[i30] - j10, 1000000L, track.timescale);
                    }
                    return new TrackSampleTable(track, jArr2, iArr11, i6, jArr, iArr2, Util.scaleLargeTimestamp(j8 - j10, 1000000L, track.timescale));
                }
                boolean z5 = track.type == 1;
                int[] iArr12 = new int[jArr10.length];
                int[] iArr13 = new int[jArr10.length];
                long[] jArr11 = (long[]) Assertions.checkNotNull(track.editListMediaTimes);
                int i31 = 0;
                int i32 = 0;
                boolean z6 = false;
                int i33 = 0;
                while (true) {
                    long[] jArr12 = track.editListDurations;
                    iArr3 = iArr13;
                    if (i31 >= jArr12.length) {
                        break;
                    }
                    int[] iArr14 = iArr12;
                    long[] jArr13 = jArr11;
                    long j11 = jArr13[i31];
                    if (j11 != -1) {
                        long j12 = jArr12[i31];
                        iArr5 = iArr11;
                        i7 = i6;
                        long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(j12, track.timescale, track.movieTimescale);
                        iArr4 = iArr14;
                        iArr4[i31] = Util.binarySearchFloor(jArr, j11, true, true);
                        iArr3[i31] = Util.binarySearchCeil(jArr, j11 + scaleLargeTimestamp5, z5, false);
                        while (true) {
                            i8 = iArr4[i31];
                            i9 = iArr3[i31];
                            if (i8 >= i9 || (iArr2[i8] & 1) != 0) {
                                break;
                            }
                            iArr4[i31] = i8 + 1;
                        }
                        i32 += i9 - i8;
                        z6 |= i33 != i8;
                        i33 = i9;
                    } else {
                        iArr4 = iArr14;
                        iArr5 = iArr11;
                        i7 = i6;
                    }
                    i31++;
                    jArr11 = jArr13;
                    i6 = i7;
                    iArr11 = iArr5;
                    iArr13 = iArr3;
                    iArr12 = iArr4;
                }
                int[] iArr15 = iArr11;
                int i34 = i6;
                int[] iArr16 = iArr12;
                int i35 = 0;
                boolean z7 = z6 | (i32 != i29);
                long[] jArr14 = z7 ? new long[i32] : jArr2;
                int[] iArr17 = z7 ? new int[i32] : iArr15;
                int i36 = z7 ? 0 : i34;
                int[] iArr18 = z7 ? new int[i32] : iArr2;
                long[] jArr15 = new long[i32];
                int i37 = i36;
                long j13 = j;
                int i38 = 0;
                while (i35 < track.editListDurations.length) {
                    long j14 = track.editListMediaTimes[i35];
                    int i39 = iArr16[i35];
                    boolean z8 = z7;
                    int i40 = iArr3[i35];
                    int i41 = i35;
                    if (z8) {
                        int i42 = i40 - i39;
                        System.arraycopy(jArr2, i39, jArr14, i38, i42);
                        System.arraycopy(iArr15, i39, iArr17, i38, i42);
                        System.arraycopy(iArr2, i39, iArr18, i38, i42);
                    }
                    while (i39 < i40) {
                        long[] jArr16 = jArr2;
                        long[] jArr17 = jArr14;
                        long[] jArr18 = jArr;
                        long j15 = j;
                        jArr15[i38] = Util.scaleLargeTimestamp(j13, 1000000L, track.movieTimescale) + Util.scaleLargeTimestamp(Math.max(j15, jArr[i39] - j14), 1000000L, track.timescale);
                        if (z8 && iArr17[i38] > i37) {
                            i37 = iArr15[i39];
                        }
                        i38++;
                        i39++;
                        jArr2 = jArr16;
                        j = j15;
                        jArr14 = jArr17;
                        jArr = jArr18;
                    }
                    j13 += track.editListDurations[i41];
                    jArr2 = jArr2;
                    jArr14 = jArr14;
                    jArr = jArr;
                    i35 = i41 + 1;
                    z7 = z8;
                }
                return new TrackSampleTable(track, jArr14, iArr17, i37, jArr15, iArr18, Util.scaleLargeTimestamp(j13, 1000000L, track.movieTimescale));
            }
            parsableByteArray4 = null;
        } else {
            i2 = 0;
        }
        i3 = -1;
        int fixedSampleSize2 = stz2SampleSizeBox.getFixedSampleSize();
        String str2 = track.format.sampleMimeType;
        if (fixedSampleSize2 == -1) {
        }
        SampleSizeBox sampleSizeBox2 = stz2SampleSizeBox;
        if (!z2) {
        }
        long j82 = j2;
        long scaleLargeTimestamp6 = Util.scaleLargeTimestamp(j82, 1000000L, track.timescale);
        jArr3 = track.editListDurations;
        if (jArr3 != null) {
        }
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Metadata parseSmta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (readInt < 14) {
                    return null;
                }
                parsableByteArray.skipBytes(5);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if (readUnsignedByte != 12 && readUnsignedByte != 13) {
                    return null;
                }
                float f = readUnsignedByte == 12 ? 240.0f : 120.0f;
                parsableByteArray.skipBytes(1);
                return new Metadata(new SmtaMetadataEntry(f, parsableByteArray.readUnsignedByte()));
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i = parseFullAtomVersion == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i3 < i) {
                if (parsableByteArray.getData()[position + i3] != -1) {
                    long readUnsignedInt = parseFullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                    if (readUnsignedInt != 0) {
                        j = readUnsignedInt;
                    }
                } else {
                    i3++;
                }
            } else {
                parsableByteArray.skipBytes(i);
                break;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i2 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i2 = NotificationCenter.locationPermissionGranted;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i2 = NotificationCenter.needDeleteDialog;
        }
        return new TkhdData(readInt, j, i2);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Pair parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 4 : 8);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(readUnsignedInt), "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) {
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        int i3 = 0;
        while (i3 < readInt) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521) {
                StsdData stsdData2 = stsdData;
                int i4 = i3;
                parseVideoSampleEntry(parsableByteArray, readInt3, position, readInt2, i, i2, drmInitData, stsdData2, i4);
                stsdData = stsdData2;
                i3 = i4;
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667) {
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, z, drmInitData, stsdData3, i3);
                stsdData = stsdData3;
            } else if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672) {
                parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, stsdData);
            } else if (readInt3 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, readInt3, position, i, stsdData);
            } else if (readInt3 == 1667329389) {
                stsdData.format = new Format.Builder().setId(i).setSampleMimeType("application/x-camera-motion").build();
            }
            parsableByteArray.setPosition(position + readInt2);
            i3++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableList = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableList = ImmutableList.of((Object) bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableList).build();
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) {
        String str;
        int i7;
        DrmInitData drmInitData2;
        int i8;
        String str2;
        byte[] bArr;
        float f;
        List list;
        String str3;
        int i9 = i2;
        int i10 = i3;
        DrmInitData drmInitData3 = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i9 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int i11 = i;
        if (i11 == 1701733238) {
            Pair parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i9, i10);
            if (parseSampleEntryEncryptionData != null) {
                i11 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = "video/3gpp";
        if (i11 == 1831958048) {
            str = "video/mpeg";
        } else {
            str = i11 == 1211250227 ? "video/3gpp" : null;
        }
        float f2 = 1.0f;
        byte[] bArr2 = null;
        String str5 = null;
        List list2 = null;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        ByteBuffer byteBuffer = null;
        EsdsData esdsData = null;
        boolean z = false;
        while (position - i9 < i10) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0) {
                i7 = position;
                if (parsableByteArray.getPosition() - i2 == i10) {
                    break;
                }
            } else {
                i7 = position;
            }
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1635148611) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                list2 = parse.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z) {
                    f2 = parse.pixelWidthHeightRatio;
                }
                str5 = parse.codecs;
                str3 = MediaController.VIDEO_MIME_TYPE;
            } else if (readInt2 == 1752589123) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                list2 = parse2.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                if (!z) {
                    f2 = parse2.pixelWidthHeightRatio;
                }
                str5 = parse2.codecs;
                str3 = "video/hevc";
            } else {
                if (readInt2 == 1685480259 || readInt2 == 1685485123) {
                    drmInitData2 = drmInitData3;
                    i8 = i11;
                    str2 = str4;
                    bArr = bArr2;
                    f = f2;
                    list = list2;
                    DolbyVisionConfig parse3 = DolbyVisionConfig.parse(parsableByteArray);
                    if (parse3 != null) {
                        str5 = parse3.codecs;
                        str = "video/dolby-vision";
                    }
                } else if (readInt2 == 1987076931) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    str3 = i11 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (readInt2 == 1635135811) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    str3 = "video/av01";
                } else if (readInt2 == 1668050025) {
                    if (byteBuffer == null) {
                        byteBuffer = allocateHdrStaticInfo();
                    }
                    ByteBuffer byteBuffer2 = byteBuffer;
                    byteBuffer2.position(21);
                    byteBuffer2.putShort(parsableByteArray.readShort());
                    byteBuffer2.putShort(parsableByteArray.readShort());
                    byteBuffer = byteBuffer2;
                    drmInitData2 = drmInitData3;
                    i8 = i11;
                    str2 = str4;
                    position = i7 + readInt;
                    i9 = i2;
                    i10 = i3;
                    stsdData2 = stsdData;
                    i11 = i8;
                    str4 = str2;
                    drmInitData3 = drmInitData2;
                } else if (readInt2 == 1835295606) {
                    if (byteBuffer == null) {
                        byteBuffer = allocateHdrStaticInfo();
                    }
                    ByteBuffer byteBuffer3 = byteBuffer;
                    short readShort = parsableByteArray.readShort();
                    short readShort2 = parsableByteArray.readShort();
                    i8 = i11;
                    short readShort3 = parsableByteArray.readShort();
                    str2 = str4;
                    short readShort4 = parsableByteArray.readShort();
                    short readShort5 = parsableByteArray.readShort();
                    drmInitData2 = drmInitData3;
                    short readShort6 = parsableByteArray.readShort();
                    List list3 = list2;
                    short readShort7 = parsableByteArray.readShort();
                    byte[] bArr3 = bArr2;
                    short readShort8 = parsableByteArray.readShort();
                    long readUnsignedInt = parsableByteArray.readUnsignedInt();
                    long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
                    byteBuffer3.position(1);
                    byteBuffer3.putShort(readShort5);
                    byteBuffer3.putShort(readShort6);
                    byteBuffer3.putShort(readShort);
                    byteBuffer3.putShort(readShort2);
                    byteBuffer3.putShort(readShort3);
                    byteBuffer3.putShort(readShort4);
                    byteBuffer3.putShort(readShort7);
                    byteBuffer3.putShort(readShort8);
                    byteBuffer3.putShort((short) (readUnsignedInt / 10000));
                    byteBuffer3.putShort((short) (readUnsignedInt2 / 10000));
                    byteBuffer = byteBuffer3;
                    list2 = list3;
                    bArr2 = bArr3;
                    f2 = f2;
                    position = i7 + readInt;
                    i9 = i2;
                    i10 = i3;
                    stsdData2 = stsdData;
                    i11 = i8;
                    str4 = str2;
                    drmInitData3 = drmInitData2;
                } else {
                    drmInitData2 = drmInitData3;
                    i8 = i11;
                    str2 = str4;
                    bArr = bArr2;
                    f = f2;
                    list = list2;
                    if (readInt2 == 1681012275) {
                        ExtractorUtil.checkContainerInput(str == null, null);
                        str = str2;
                    } else if (readInt2 == 1702061171) {
                        ExtractorUtil.checkContainerInput(str == null, null);
                        esdsData = parseEsdsFromParent(parsableByteArray, position2);
                        String str6 = esdsData.mimeType;
                        byte[] bArr4 = esdsData.initializationData;
                        list2 = bArr4 != null ? ImmutableList.of((Object) bArr4) : list;
                        str = str6;
                        bArr2 = bArr;
                        f2 = f;
                        position = i7 + readInt;
                        i9 = i2;
                        i10 = i3;
                        stsdData2 = stsdData;
                        i11 = i8;
                        str4 = str2;
                        drmInitData3 = drmInitData2;
                    } else {
                        if (readInt2 == 1885434736) {
                            f2 = parsePaspFromParent(parsableByteArray, position2);
                            list2 = list;
                            bArr2 = bArr;
                            z = true;
                        } else if (readInt2 == 1937126244) {
                            bArr2 = parseProjFromParent(parsableByteArray, position2, readInt);
                            list2 = list;
                            f2 = f;
                        } else if (readInt2 == 1936995172) {
                            int readUnsignedByte = parsableByteArray.readUnsignedByte();
                            parsableByteArray.skipBytes(3);
                            if (readUnsignedByte == 0) {
                                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                                if (readUnsignedByte2 == 0) {
                                    list2 = list;
                                    bArr2 = bArr;
                                    f2 = f;
                                    i12 = 0;
                                } else if (readUnsignedByte2 == 1) {
                                    list2 = list;
                                    bArr2 = bArr;
                                    f2 = f;
                                    i12 = 1;
                                } else if (readUnsignedByte2 == 2) {
                                    list2 = list;
                                    bArr2 = bArr;
                                    f2 = f;
                                    i12 = 2;
                                } else if (readUnsignedByte2 == 3) {
                                    list2 = list;
                                    bArr2 = bArr;
                                    f2 = f;
                                    i12 = 3;
                                }
                            }
                        } else if (readInt2 == 1668246642) {
                            int readInt3 = parsableByteArray.readInt();
                            if (readInt3 == 1852009592 || readInt3 == 1852009571) {
                                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                                int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                                parsableByteArray.skipBytes(2);
                                boolean z2 = readInt == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                i13 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedShort3);
                                i14 = z2 ? 1 : 2;
                                i15 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedShort4);
                            } else {
                                Log.w("AtomParsers", "Unsupported color type: " + Atom.getAtomTypeString(readInt3));
                            }
                        }
                        position = i7 + readInt;
                        i9 = i2;
                        i10 = i3;
                        stsdData2 = stsdData;
                        i11 = i8;
                        str4 = str2;
                        drmInitData3 = drmInitData2;
                    }
                }
                list2 = list;
                bArr2 = bArr;
                f2 = f;
                position = i7 + readInt;
                i9 = i2;
                i10 = i3;
                stsdData2 = stsdData;
                i11 = i8;
                str4 = str2;
                drmInitData3 = drmInitData2;
            }
            str = str3;
            drmInitData2 = drmInitData3;
            i8 = i11;
            str2 = str4;
            position = i7 + readInt;
            i9 = i2;
            i10 = i3;
            stsdData2 = stsdData;
            i11 = i8;
            str4 = str2;
            drmInitData3 = drmInitData2;
        }
        DrmInitData drmInitData4 = drmInitData3;
        byte[] bArr5 = bArr2;
        float f3 = f2;
        List list4 = list2;
        if (str == null) {
            return;
        }
        Format.Builder drmInitData5 = new Format.Builder().setId(i4).setSampleMimeType(str).setCodecs(str5).setWidth(readUnsignedShort).setHeight(readUnsignedShort2).setPixelWidthHeightRatio(f3).setRotationDegrees(i5).setProjectionData(bArr5).setStereoMode(i12).setInitializationData(list4).setDrmInitData(drmInitData4);
        int i16 = i13;
        int i17 = i14;
        int i18 = i15;
        if (i16 != -1 || i17 != -1 || i18 != -1 || byteBuffer != null) {
            drmInitData5.setColorInfo(new ColorInfo(i16, i17, i18, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (esdsData != null) {
            drmInitData5.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
        }
        stsdData.format = drmInitData5.build();
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(readNullTerminatedString).build();
            }
        }
    }

    private static Pair parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1701606260);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            jArr[i] = parseFullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = parseFullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, StsdData stsdData, int i5) {
        int i6;
        int readUnsignedFixedPoint1616;
        int readInt;
        int i7;
        String str2;
        String str3;
        int i8;
        int i9 = i2;
        int i10 = i3;
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i9 + 16);
        if (z) {
            i6 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            readInt = parsableByteArray.readInt();
            if (i6 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i7 = readUnsignedShort;
        } else {
            if (i6 != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            i7 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
            readInt = 0;
        }
        int position = parsableByteArray.getPosition();
        int i11 = i;
        if (i11 == 1701733217) {
            Pair parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i9, i10);
            if (parseSampleEntryEncryptionData != null) {
                i11 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        if (i11 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i11 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i11 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i11 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i11 == 1685353320 || i11 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i11 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i11 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i11 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i11 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            str3 = "audio/raw";
            if (i11 == 1819304813 || i11 == 1936684916) {
                i8 = 2;
            } else if (i11 == 1953984371) {
                i8 = TLObject.FLAG_28;
            } else if (i11 == 778924082 || i11 == 778924083) {
                str2 = "audio/mpeg";
            } else if (i11 == 1835557169) {
                str2 = "audio/mha1";
            } else if (i11 == 1835560241) {
                str2 = "audio/mhm1";
            } else if (i11 == 1634492771) {
                str2 = "audio/alac";
            } else if (i11 == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (i11 == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (i11 == 1332770163) {
                str2 = "audio/opus";
            } else if (i11 == 1716281667) {
                str2 = "audio/flac";
            } else if (i11 == 1835823201) {
                str2 = "audio/true-hd";
            } else {
                i8 = -1;
                str3 = null;
            }
            String str4 = str3;
            EsdsData esdsData = null;
            String str5 = null;
            List list = null;
            while (position - i9 < i10) {
                parsableByteArray.setPosition(position);
                int readInt2 = parsableByteArray.readInt();
                ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
                int readInt3 = parsableByteArray.readInt();
                if (readInt3 == 1835557187) {
                    int i12 = readInt2 - 13;
                    byte[] bArr = new byte[i12];
                    parsableByteArray.setPosition(position + 13);
                    parsableByteArray.readBytes(bArr, 0, i12);
                    list = ImmutableList.of((Object) bArr);
                } else {
                    if (readInt3 == 1702061171 || (z && readInt3 == 2002876005)) {
                        int findBoxPosition = readInt3 == 1702061171 ? position : findBoxPosition(parsableByteArray, 1702061171, position, readInt2);
                        if (findBoxPosition != -1) {
                            esdsData = parseEsdsFromParent(parsableByteArray, findBoxPosition);
                            String str6 = esdsData.mimeType;
                            byte[] bArr2 = esdsData.initializationData;
                            if (bArr2 != null) {
                                if (MediaController.AUDIO_MIME_TYPE.equals(str6)) {
                                    AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr2);
                                    readUnsignedFixedPoint1616 = parseAudioSpecificConfig.sampleRateHz;
                                    i7 = parseAudioSpecificConfig.channelCount;
                                    str5 = parseAudioSpecificConfig.codecs;
                                }
                                list = ImmutableList.of((Object) bArr2);
                            }
                            str4 = str6;
                        }
                    } else if (readInt3 == 1684103987) {
                        parsableByteArray.setPosition(position + 8);
                        stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                    } else if (readInt3 == 1684366131) {
                        parsableByteArray.setPosition(position + 8);
                        stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                    } else if (readInt3 == 1684103988) {
                        parsableByteArray.setPosition(position + 8);
                        stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                    } else if (readInt3 == 1684892784) {
                        if (readInt <= 0) {
                            throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + readInt, null);
                        }
                        readUnsignedFixedPoint1616 = readInt;
                        i7 = 2;
                    } else if (readInt3 == 1684305011) {
                        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str4).setChannelCount(i7).setSampleRate(readUnsignedFixedPoint1616).setDrmInitData(drmInitData2).setLanguage(str).build();
                    } else if (readInt3 == 1682927731) {
                        int i13 = readInt2 - 8;
                        byte[] bArr3 = opusMagic;
                        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i13);
                        parsableByteArray.setPosition(position + 8);
                        parsableByteArray.readBytes(copyOf, bArr3.length, i13);
                        list = OpusUtil.buildInitializationData(copyOf);
                    } else if (readInt3 == 1684425825) {
                        byte[] bArr4 = new byte[readInt2 - 8];
                        bArr4[0] = 102;
                        bArr4[1] = 76;
                        bArr4[2] = 97;
                        bArr4[3] = 67;
                        parsableByteArray.setPosition(position + 12);
                        parsableByteArray.readBytes(bArr4, 4, readInt2 - 12);
                        list = ImmutableList.of((Object) bArr4);
                    } else if (readInt3 == 1634492771) {
                        int i14 = readInt2 - 12;
                        byte[] bArr5 = new byte[i14];
                        parsableByteArray.setPosition(position + 12);
                        parsableByteArray.readBytes(bArr5, 0, i14);
                        Pair parseAlacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr5);
                        int intValue = ((Integer) parseAlacAudioSpecificConfig.first).intValue();
                        int intValue2 = ((Integer) parseAlacAudioSpecificConfig.second).intValue();
                        list = ImmutableList.of((Object) bArr5);
                        readUnsignedFixedPoint1616 = intValue;
                        i7 = intValue2;
                    }
                    position += readInt2;
                    i9 = i2;
                    i10 = i3;
                }
                position += readInt2;
                i9 = i2;
                i10 = i3;
            }
            if (stsdData.format == null || str4 == null) {
            }
            Format.Builder language = new Format.Builder().setId(i4).setSampleMimeType(str4).setCodecs(str5).setChannelCount(i7).setSampleRate(readUnsignedFixedPoint1616).setPcmEncoding(i8).setInitializationData(list).setDrmInitData(drmInitData2).setLanguage(str);
            if (esdsData != null) {
                language.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
            }
            stsdData.format = language.build();
            return;
        }
        str3 = str2;
        i8 = -1;
        String str42 = str3;
        EsdsData esdsData2 = null;
        String str52 = null;
        List list2 = null;
        while (position - i9 < i10) {
        }
        if (stsdData.format == null) {
        }
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j = readUnsignedInt2;
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        if (j <= 0) {
            j = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j, readUnsignedInt > 0 ? readUnsignedInt : -1L);
    }

    private static Pair parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) {
        Pair parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    static Pair parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
        ExtractorUtil.checkContainerInput(parseSchiFromParent != null, "tenc atom is mandatory");
        return Pair.create(num, (TrackEncryptionBox) Util.castNonNull(parseSchiFromParent));
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = readUnsignedByte & 15;
                    i4 = (readUnsignedByte & NotificationCenter.appConfigUpdated) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += readInt;
        }
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & NotificationCenter.needDeleteBusinessLink;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & NotificationCenter.needDeleteBusinessLink);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long readUnsignedInt;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                readUnsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                readUnsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = readUnsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    private static final class StsdData {
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    private static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & NotificationCenter.didReceiveSmsCode;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 == 0) {
                int readUnsignedByte = this.data.readUnsignedByte();
                this.currentByte = readUnsignedByte;
                return (readUnsignedByte & NotificationCenter.appConfigUpdated) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}
