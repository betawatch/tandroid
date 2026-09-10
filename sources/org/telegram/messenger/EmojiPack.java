package org.telegram.messenger;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class EmojiPack {
    private static final String ASSET_NAME = "emoji.pack";
    private static final int DEFLATE = 0;
    private static final int ENTRY_SIZE = 20;
    private static final int FULL_IMAGE = 3;
    private static final int HEADER_SIZE = 32;
    private static final int INDEX_WEBP = 1;
    private static final int MAP_REFERENCE = 4;
    private static final int NO_MASK = 65535;
    private static final int PIXELS = 4096;
    private static final int RGBA_WEBP = 2;
    private static final int ROOT_CACHE_SIZE = 8;
    private static final int SIDE = 64;
    private long age;
    private final MappedByteBuffer buffer;
    private final int count;
    private final byte[] decoded;
    private final int emojiCount;
    private final int[] emojiPixels;
    private byte[] encoded;
    private final byte[] indices;
    private final Inflater inflater;
    private final BitmapFactory.Options options;
    private final int[] palette;
    private final byte[] paletteBytes;
    private final int[] pixels;
    private final long[] rootAges;
    private final int[] rootIds;
    private final byte[][] rootMaps;

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static final class Holder {
        static final EmojiPack INSTANCE = open();

        private Holder() {
        }

        private static EmojiPack open() {
            try {
                return new EmojiPack();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to open emoji.pack", e);
            }
        }
    }

    private static IllegalStateException damaged(String str) {
        return new IllegalStateException(org.telegram.ui.Cells.r6.i("Damaged emoji.pack: ", str));
    }

    private Bitmap decode(int i10) {
        int entry = entry(i10);
        int i11 = this.buffer.getInt(entry + 4);
        int u16 = u16(entry + 8);
        int u82 = u8(entry + 16);
        if (u82 == 2 || u82 == 3) {
            readBytes(i11, u16);
            return u82 == 2 ? decodeWebp(20, u16) : decodeBitmap(20, u16);
        }
        decodePixels(i10, this.pixels);
        return Bitmap.createBitmap(this.pixels, 64, 64, Bitmap.Config.ARGB_8888);
    }

    private Bitmap decodeBitmap(int i10, int i11) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(this.encoded, i10, i11, this.options);
        if (decodeByteArray == null) {
            throw damaged("Bitmap decoder rejected image");
        }
        if (decodeByteArray.getWidth() == 64 && decodeByteArray.getHeight() == 64) {
            return decodeByteArray;
        }
        decodeByteArray.recycle();
        throw damaged("Unexpected bitmap dimensions");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        if (r3 == 6) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void decodeIndices(int i10, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        int i11;
        int i12;
        int i13;
        int i14;
        byte[] bArr4;
        int entry = entry(i10);
        int u82 = u8(entry + 17);
        if (u82 != 0) {
            int u16 = u16(entry + 10);
            bArr2 = rootMap(u16);
            i12 = u16(entry(u16) + 14);
            if (u82 == 3 || u82 == 5 || u82 == 6) {
                int u162 = u16(entry + 12);
                bArr3 = rootMap(u162);
                i11 = u16(entry(u162) + 14);
            } else {
                bArr3 = null;
                i11 = 0;
            }
        } else {
            bArr2 = null;
            bArr3 = null;
            i11 = 0;
            i12 = 0;
        }
        int i15 = entry + 19;
        int u83 = (u8(i15) >>> 1) & 7;
        int u84 = (u8(i15) >>> 4) & 7;
        if (u82 == 4) {
            for (int i16 = 0; i16 < 4096; i16++) {
                bArr[i16] = bArr2[sourceIndex(i16, u83)];
            }
            return;
        }
        int i17 = i12 + i11;
        int paletteLength = paletteLength(entry);
        int i18 = this.buffer.getInt(entry + 4) + paletteLength;
        int u163 = u16(entry + 8) - paletteLength;
        if (u82 == 5 || u82 == 6) {
            if (u163 < 2) {
                throw damaged("Truncated split record");
            }
            int i19 = i18 + 1;
            int u85 = u8(i18);
            u163--;
            if (u85 < 1 || u85 >= 64) {
                throw damaged("Invalid split position");
            }
            i13 = u85;
            i18 = i19;
        } else {
            i13 = 32;
        }
        readBytes(i18, u163);
        if (u8(entry + 16) == 0) {
            inflate(u163, i17 + 4096);
            byte[] bArr5 = this.decoded;
            System.arraycopy(bArr5, i17, bArr, 0, 4096);
            i14 = entry;
            bArr4 = bArr5;
        } else {
            if (u163 <= i17) {
                throw damaged("Truncated index WebP");
            }
            i14 = entry;
            System.arraycopy(this.encoded, 20, this.decoded, 0, i17);
            Bitmap decodeWebp = decodeWebp(i17 + 20, u163 - i17);
            try {
                decodeWebp.getPixels(this.pixels, 0, 64, 0, 0, 64, 64);
                for (int i20 = 0; i20 < 4096; i20++) {
                    bArr[i20] = (byte) this.pixels[i20];
                }
                decodeWebp.recycle();
                bArr4 = this.decoded;
            } catch (Throwable th2) {
                decodeWebp.recycle();
                throw th2;
            }
        }
        if (u82 == 1 || u82 == 2) {
            for (int i21 = 0; i21 < 4096; i21++) {
                int i22 = bArr2[sourceIndex(i21, u83)] & 255;
                if (i22 >= i12) {
                    throw damaged("Root index out of range");
                }
                int i23 = bArr4[i22] & 255;
                bArr[i21] = u82 == 1 ? (byte) (i23 ^ (bArr[i21] & 255)) : (byte) ((bArr[i21] & 255) + i23);
            }
        } else {
            int i24 = (u82 == 3 || u82 == 5) ? 6 : 6;
            for (int i25 = 0; i25 < 4096; i25++) {
                boolean z10 = u82 != i24 ? (i25 & 63) < i13 : (i25 >>> 6) < i13;
                int i26 = (z10 ? bArr2[sourceIndex(i25, u83)] : bArr3[sourceIndex(i25, u84)]) & 255;
                if (i26 >= (z10 ? i12 : i11)) {
                    throw damaged("Half root index out of range");
                }
                bArr[i25] = (byte) ((bArr[i25] & 255) + (bArr4[(z10 ? 0 : i12) + i26] & 255));
            }
        }
        int u164 = u16(i14 + 14);
        if (u164 < 256) {
            for (byte b10 : bArr) {
                if ((b10 & 255) >= u164) {
                    throw damaged("Decoded index out of range");
                }
            }
        }
    }

    private void decodePixels(int i10, int[] iArr) {
        Throwable th2;
        int i11;
        int entry = entry(i10);
        int i12 = this.buffer.getInt(entry + 4);
        int u16 = u16(entry + 8);
        int u82 = u8(entry + 16);
        if (u82 != 2 && u82 != 3) {
            decodeIndices(i10, this.indices);
            int u162 = u16(entry + 14);
            int i13 = entry + 18;
            int u83 = u8(i13) & 127;
            int i14 = u162 * u83;
            boolean z10 = (u8(i13) & 128) != 0;
            if (z10) {
                int paletteLength = paletteLength(entry) - 2;
                readBytes(i12 + 2, paletteLength);
                inflate(paletteLength, (u8(entry + 19) & 1) != 0 ? ((i14 * 7) + 7) / 8 : i14);
            }
            if ((u8(entry + 19) & 1) != 0) {
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = i15 * 7;
                    int i17 = i16 & 7;
                    int i18 = i16 >>> 3;
                    int u84 = (z10 ? this.decoded[i18] & 255 : u8(i12 + i18)) >>> i17;
                    if (i17 > 1) {
                        u84 |= (z10 ? this.decoded[i18 + 1] & 255 : u8((i18 + i12) + 1)) << (8 - i17);
                    }
                    int i19 = u84 & 127;
                    this.paletteBytes[i15] = (byte) ((i19 >>> 6) | (i19 << 1));
                }
            } else if (z10) {
                System.arraycopy(this.decoded, 0, this.paletteBytes, 0, i14);
            } else {
                for (int i20 = 0; i20 < i14; i20++) {
                    this.paletteBytes[i20] = this.buffer.get(i12 + i20);
                }
            }
            int i21 = 0;
            for (int i22 = 0; i22 < u162; i22++) {
                if (u83 == 0) {
                    this.palette[i22] = (65793 * i22) | (-16777216);
                } else if (u83 == 1) {
                    this.palette[i22] = ((this.paletteBytes[i21] & 255) * 65793) | (-16777216);
                    i21++;
                } else {
                    byte[] bArr = this.paletteBytes;
                    int i23 = bArr[i21] & 255;
                    int i24 = bArr[i21 + 1] & 255;
                    int i25 = i21 + 3;
                    int i26 = bArr[i21 + 2] & 255;
                    if (u83 == 4) {
                        i21 += 4;
                        i11 = bArr[i25] & 255;
                    } else {
                        i21 = i25;
                        i11 = 255;
                    }
                    this.palette[i22] = (i11 << 24) | (i23 << 16) | (i24 << 8) | i26;
                }
            }
            for (int i27 = 0; i27 < 4096; i27++) {
                int i28 = this.indices[i27] & 255;
                if (i28 >= u162) {
                    throw damaged("Palette index out of range");
                }
                iArr[i27] = this.palette[i28];
            }
            return;
        }
        readBytes(i12, u16);
        this.options.inPremultiplied = false;
        Bitmap bitmap = null;
        try {
            Bitmap decodeWebp = u82 == 2 ? decodeWebp(20, u16) : decodeBitmap(20, u16);
            try {
                decodeWebp.getPixels(iArr, 0, 64, 0, 0, 64, 64);
                this.options.inPremultiplied = true;
                decodeWebp.recycle();
            } catch (Throwable th3) {
                th2 = th3;
                bitmap = decodeWebp;
                this.options.inPremultiplied = true;
                if (bitmap == null) {
                    throw th2;
                }
                bitmap.recycle();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private Bitmap decodeWebp(int i10, int i11) {
        int i12 = i10 - 20;
        int i13 = i11 & 1;
        putInt(i12, 1179011410);
        putInt(i10 - 16, i11 + 12 + i13);
        putInt(i10 - 12, 1346520407);
        putInt(i10 - 8, 1278758998);
        putInt(i10 - 4, i11);
        if (i13 != 0) {
            this.encoded[i10 + i11] = 0;
        }
        return decodeBitmap(i12, i11 + 20 + i13);
    }

    private static int entry(int i10) {
        return (i10 * 20) + 32;
    }

    private int find(int i10, int i11, int i12) {
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int u16 = u16(entry(i14));
            if (u16 < i10) {
                i11 = i14 + 1;
            } else {
                if (u16 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -1;
    }

    private int findEmoji(int i10, int i11) {
        if (i10 < 0 || i10 > 15 || i11 < 0 || i11 >= 4096) {
            return -1;
        }
        return find((i10 * 4096) + i11, 0, this.emojiCount);
    }

    public static EmojiPack getInstance() {
        return Holder.INSTANCE;
    }

    private void inflate(int i10, int i11) {
        this.inflater.reset();
        this.inflater.setInput(this.encoded, 20, i10);
        int i12 = 0;
        while (i12 < i11) {
            try {
                int inflate = this.inflater.inflate(this.decoded, i12, i11 - i12);
                if (inflate == 0) {
                    throw damaged("Truncated DEFLATE stream");
                }
                i12 += inflate;
            } catch (DataFormatException e) {
                throw new IllegalStateException("Damaged EPK3 DEFLATE stream", e);
            }
        }
        if (!this.inflater.finished() && (this.inflater.inflate(this.indices, 0, 1) != 0 || !this.inflater.finished())) {
            throw damaged("Oversized DEFLATE stream");
        }
        if (this.inflater.getRemaining() != 0) {
            throw damaged("Trailing DEFLATE bytes");
        }
    }

    private int paletteLength(int i10) {
        int i11;
        int i12 = i10 + 18;
        if ((u8(i12) & 128) == 0) {
            int u16 = u16(i10 + 14) * (u8(i12) & 127);
            return (u8(i10 + 19) & 1) != 0 ? ((u16 * 7) + 7) / 8 : u16;
        }
        int i13 = i10 + 8;
        if (u16(i13) < 3) {
            throw damaged("Truncated compressed palette");
        }
        int u162 = u16(this.buffer.getInt(i10 + 4));
        if (u162 == 0 || (i11 = u162 + 2) > u16(i13)) {
            throw damaged("Invalid compressed palette");
        }
        return i11;
    }

    private void putInt(int i10, int i11) {
        byte[] bArr = this.encoded;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >>> 8);
        bArr[i10 + 2] = (byte) (i11 >>> 16);
        bArr[i10 + 3] = (byte) (i11 >>> 24);
    }

    private void readBytes(int i10, int i11) {
        byte[] bArr = this.encoded;
        int i12 = i11 + 21;
        if (bArr.length < i12) {
            int length = bArr.length;
            while (length < i12) {
                length <<= 1;
            }
            this.encoded = new byte[length];
        }
        this.buffer.position(i10);
        this.buffer.get(this.encoded, 20, i11);
    }

    private byte[] rootMap(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            if (this.rootIds[i12] == i10) {
                long[] jArr = this.rootAges;
                long j3 = this.age + 1;
                this.age = j3;
                jArr[i12] = j3;
                return this.rootMaps[i12];
            }
            long[] jArr2 = this.rootAges;
            if (jArr2[i12] < jArr2[i11]) {
                i11 = i12;
            }
        }
        byte[][] bArr = this.rootMaps;
        if (bArr[i11] == null) {
            bArr[i11] = new byte[4096];
        }
        this.rootIds[i11] = -1;
        decodeIndices(i10, bArr[i11]);
        this.rootIds[i11] = i10;
        long[] jArr3 = this.rootAges;
        long j10 = this.age + 1;
        this.age = j10;
        jArr3[i11] = j10;
        return this.rootMaps[i11];
    }

    private static int sourceIndex(int i10, int i11) {
        int i12 = i10 & 63;
        int i13 = i10 >>> 6;
        if ((i11 & 1) != 0) {
            i12 = 63 - i12;
        }
        if ((i11 & 2) != 0) {
            i13 = 63 - i13;
        }
        return (i11 & 4) != 0 ? i13 | (i12 << 6) : (i13 << 6) | i12;
    }

    private int u16(int i10) {
        return this.buffer.getShort(i10) & NO_MASK;
    }

    private int u8(int i10) {
        return this.buffer.get(i10) & 255;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void validateMetadata() {
        int i10;
        int i11;
        int i12;
        int i13 = (this.count * 20) + 32;
        int i14 = 0;
        while (i14 < this.count) {
            int entry = entry(i14);
            if (i14 != 0 && i14 != this.emojiCount && u16(entry) <= u16(entry - 20)) {
                throw new IOException("Unsorted EPK3 IDs");
            }
            int u16 = u16(entry + 2);
            int i15 = this.emojiCount;
            if ((i14 >= i15 && u16 != NO_MASK) || (i14 < i15 && u16 != NO_MASK && find(u16, i15, this.count) < 0)) {
                throw new IOException(hc.b.j(i14, "Invalid mask reference at record "));
            }
            int i16 = this.buffer.getInt(entry + 4);
            int u162 = u16(entry + 8);
            int u163 = u16(entry + 10);
            int u164 = u16(entry + 12);
            int u165 = u16(entry + 14);
            int u82 = u8(entry + 16);
            int u83 = u8(entry + 17);
            int i17 = entry + 18;
            int u84 = u8(i17) & 127;
            if (i16 < i13 || u162 == 0) {
                i10 = i14;
            } else {
                int i18 = i14;
                if (i16 + u162 > this.buffer.capacity() || u82 > 4 || u83 > 6) {
                    i10 = i18;
                } else {
                    if (u82 != 2 && u82 != 3) {
                        if (u165 >= 1 && u165 <= 256 && u84 != 2 && u84 <= 4 && (u84 != 0 || u165 == 256)) {
                            if (u82 == 4) {
                                if (paletteLength(entry) != u162) {
                                }
                                if (u84 == 0 || ((u8(entry + 19) & 1) == 0 && (u8(i17) & 128) == 0)) {
                                    if ((u82 != 4) == (u83 != 4)) {
                                        throw new IOException("Invalid map reference encoding");
                                    }
                                    if (u82 == 4) {
                                        i12 = u163;
                                        if (i12 >= this.count || u165 != u16(entry(i12) + 14)) {
                                            throw new IOException("Map reference palette size mismatch");
                                        }
                                    } else {
                                        i12 = u163;
                                    }
                                    if (u83 != 0) {
                                        i11 = i18;
                                        validateRoot(i12, i11);
                                        if (u83 == 3 || u83 == 5 || u83 == 6) {
                                            validateRoot(u164, i11);
                                        } else if (u164 != NO_MASK) {
                                            throw new IOException("Unexpected second root");
                                        }
                                    } else {
                                        if (i12 != NO_MASK || u164 != NO_MASK) {
                                            throw new IOException("Unexpected root reference");
                                        }
                                        i11 = i18;
                                    }
                                }
                            } else {
                                if (paletteLength(entry) >= u162) {
                                }
                                if (u84 == 0) {
                                }
                                if ((u82 != 4) == (u83 != 4)) {
                                }
                            }
                        }
                        throw new IOException(hc.b.j(i18, "Invalid palette at record "));
                    }
                    i11 = i18;
                    if (u165 != 0 || u8(i17) != 0 || u83 != 0 || (u8(entry + 19) & 127) != 0 || u163 != NO_MASK || u164 != NO_MASK) {
                        throw new IOException(hc.b.j(i11, "Invalid full image record "));
                    }
                    i14 = i11 + 1;
                }
            }
            throw new IOException(hc.b.j(i10, "Invalid EPK3 record "));
        }
    }

    private void validateRoot(int i10, int i11) {
        if (i10 >= this.count || i10 == i11) {
            throw new IOException("Invalid root reference");
        }
        int entry = entry(i10);
        if (u8(entry + 16) > 1 || u8(entry + 17) != 0 || u16(entry + 10) != NO_MASK || u16(entry + 12) != NO_MASK) {
            throw new IOException("EPK3 dependency chains are forbidden");
        }
    }

    public synchronized void clearCache() {
        Arrays.fill(this.rootIds, -1);
        Arrays.fill(this.rootMaps, (Object) null);
        Arrays.fill(this.rootAges, 0L);
        this.age = 0L;
    }

    public synchronized Bitmap getEmoji(int i10, int i11) {
        int findEmoji = findEmoji(i10, i11);
        if (findEmoji < 0) {
            return null;
        }
        int u16 = u16(entry(findEmoji) + 2);
        if (u16 == NO_MASK) {
            return decode(findEmoji);
        }
        decodePixels(findEmoji, this.emojiPixels);
        decodePixels(find(u16, this.emojiCount, this.count), this.pixels);
        for (int i12 = 0; i12 < 4096; i12++) {
            int[] iArr = this.emojiPixels;
            int i13 = iArr[i12];
            iArr[i12] = (i13 & 16777215) | (((((i13 >>> 24) * (this.pixels[i12] & 255)) + 127) / 255) << 24);
        }
        return Bitmap.createBitmap(this.emojiPixels, 64, 64, Bitmap.Config.ARGB_8888);
    }

    private EmojiPack() {
        this.inflater = new Inflater(true);
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.options = options;
        this.encoded = new byte[4096];
        this.decoded = new byte[4608];
        this.indices = new byte[4096];
        this.pixels = new int[4096];
        this.emojiPixels = new int[4096];
        this.palette = new int[256];
        this.paletteBytes = new byte[1024];
        int[] iArr = new int[8];
        this.rootIds = iArr;
        this.rootAges = new long[8];
        this.rootMaps = new byte[8][];
        AssetFileDescriptor openFd = ApplicationLoader.applicationContext.getAssets().openFd(ASSET_NAME);
        try {
            FileInputStream createInputStream = openFd.createInputStream();
            try {
                long length = openFd.getLength();
                if (length < 32 || length > 2147483647L) {
                    throw new IOException("Invalid emoji pack length: " + length);
                }
                MappedByteBuffer map = createInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), length);
                this.buffer = map;
                createInputStream.close();
                openFd.close();
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (map.getInt(0) != 860573765 || ((u16(4) != 2 && u16(4) != 3) || u16(6) != 20 || map.getInt(8) != 64 || map.getInt(12) != 64 || map.getInt(24) != map.capacity() || map.getInt(28) != 0)) {
                    throw new IOException("Unsupported or damaged EPK3 header");
                }
                int i10 = map.getInt(16);
                this.count = i10;
                int i11 = map.getInt(20);
                this.emojiCount = i11;
                if (i10 < 1 || i10 > NO_MASK || i11 < 0 || i11 > i10 || (i10 * 20) + 32 > map.capacity()) {
                    throw new IOException("Invalid EPK3 record count");
                }
                validateMetadata();
                Arrays.fill(iArr, -1);
                options.inScaled = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inPremultiplied = true;
            } finally {
            }
        } finally {
        }
    }
}
