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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n6 {
    public final MappedByteBuffer a;
    public final int b;
    public final int c;
    public final Inflater d = new Inflater(true);
    public final BitmapFactory.Options e = new BitmapFactory.Options();
    public byte[] f = new byte[TLObject.FLAG_12];
    public final byte[] g = new byte[4608];
    public final byte[] h = new byte[TLObject.FLAG_12];
    public final int[] i = new int[TLObject.FLAG_12];
    public final int[] j = new int[TLObject.FLAG_12];
    public final int[] k = new int[256];
    public final byte[] l = new byte[1024];
    public final int[] m = new int[8];
    public final long[] n = new long[8];
    public final byte[][] o = new byte[8][];
    public long p;

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n6() {
        int i10;
        char c10;
        int i11;
        int i12;
        AssetFileDescriptor openFd = w0.b.getAssets().openFd("emoji.pack");
        try {
            FileInputStream createInputStream = openFd.createInputStream();
            try {
                long length = openFd.getLength();
                if (length < 32 || length > 2147483647L) {
                    throw new IOException("Invalid emoji pack length: " + length);
                }
                MappedByteBuffer map = createInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), length);
                this.a = map;
                createInputStream.close();
                openFd.close();
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (map.getInt(0) != 860573765 || ((o(4) != 2 && o(4) != 3) || o(6) != 20 || map.getInt(8) != 64 || map.getInt(12) != 64 || map.getInt(24) != map.capacity() || map.getInt(28) != 0)) {
                    throw new IOException("Unsupported or damaged EPK3 header");
                }
                int i13 = map.getInt(16);
                this.b = i13;
                int i14 = map.getInt(20);
                this.c = i14;
                if (i13 >= 1) {
                    int i15 = 65535;
                    if (i13 <= 65535 && i14 >= 0 && i14 <= i13 && (i13 * 20) + 32 <= map.capacity()) {
                        int i16 = (i13 * 20) + 32;
                        int i17 = 0;
                        while (i17 < i13) {
                            int f7 = f(i17);
                            if (i17 != 0 && i17 != i14 && o(f7) <= o(f7 - 20)) {
                                throw new IOException("Unsorted EPK3 IDs");
                            }
                            int o10 = o(f7 + 2);
                            if ((i17 >= i14 && o10 != i15) || (i17 < i14 && o10 != i15 && g(o10, i14, i13) < 0)) {
                                throw new IOException(i0.a.i(i17, "Invalid mask reference at record "));
                            }
                            int i18 = map.getInt(f7 + 4);
                            int o11 = o(f7 + 8);
                            int o12 = o(f7 + 10);
                            int o13 = o(f7 + 12);
                            int o14 = o(f7 + 14);
                            int p5 = p(f7 + 16);
                            int p9 = p(f7 + 17);
                            int i19 = f7 + 18;
                            int p10 = p(i19) & zs.L1;
                            if (i18 < i16 || o11 == 0) {
                                i10 = i17;
                            } else {
                                int i20 = i16;
                                int i21 = i17;
                                if (i18 + o11 <= map.capacity()) {
                                    char c11 = 4;
                                    if (p5 <= 4 && p9 <= 6) {
                                        if (p5 != 2 && p5 != 3) {
                                            if (o14 >= 1 && o14 <= 256 && p10 != 2 && p10 <= 4 && (p10 != 0 || o14 == 256)) {
                                                if (p5 == 4) {
                                                    if (j(f7) != o11) {
                                                    }
                                                    if (p10 == 0 || ((p(f7 + 19) & 1) == 0 && (p(i19) & 128) == 0)) {
                                                        c11 = 4;
                                                        if ((p5 != 4) == (p9 != 4)) {
                                                            throw new IOException("Invalid map reference encoding");
                                                        }
                                                        if (p5 == 4 && (o12 >= i13 || o14 != o(f(o12) + 14))) {
                                                            throw new IOException("Map reference palette size mismatch");
                                                        }
                                                        if (p9 != 0) {
                                                            i12 = i21;
                                                            q(o12, i12);
                                                            if (p9 == 3 || p9 == 5) {
                                                                c10 = 6;
                                                            } else {
                                                                c10 = 6;
                                                                if (p9 != 6) {
                                                                    i11 = 65535;
                                                                    if (o13 != 65535) {
                                                                        throw new IOException("Unexpected second root");
                                                                    }
                                                                }
                                                            }
                                                            q(o13, i12);
                                                            i11 = 65535;
                                                        } else {
                                                            if (o12 != 65535 || o13 != 65535) {
                                                                throw new IOException("Unexpected root reference");
                                                            }
                                                            i11 = 65535;
                                                            i12 = i21;
                                                            c10 = 6;
                                                        }
                                                        i17 = i12 + 1;
                                                        i15 = i11;
                                                        i16 = i20;
                                                    }
                                                } else {
                                                    if (j(f7) >= o11) {
                                                    }
                                                    if (p10 == 0) {
                                                    }
                                                    c11 = 4;
                                                    if ((p5 != 4) == (p9 != 4)) {
                                                    }
                                                }
                                            }
                                            throw new IOException(i0.a.i(i21, "Invalid palette at record "));
                                        }
                                        i12 = i21;
                                        c10 = 6;
                                        if (o14 == 0 && p(i19) == 0 && p9 == 0 && (p(f7 + 19) & zs.L1) == 0) {
                                            i11 = 65535;
                                            if (o12 == 65535 && o13 == 65535) {
                                                i17 = i12 + 1;
                                                i15 = i11;
                                                i16 = i20;
                                            }
                                        }
                                        throw new IOException(i0.a.i(i12, "Invalid full image record "));
                                    }
                                }
                                i10 = i21;
                            }
                            throw new IOException(i0.a.i(i10, "Invalid EPK3 record "));
                        }
                        Arrays.fill(this.m, -1);
                        BitmapFactory.Options options = this.e;
                        options.inScaled = false;
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inPremultiplied = true;
                        return;
                    }
                }
                throw new IOException("Invalid EPK3 record count");
            } finally {
            }
        } finally {
        }
    }

    public static IllegalStateException a(String str) {
        return new IllegalStateException("Damaged emoji.pack: ".concat(str));
    }

    public static int f(int i10) {
        return (i10 * 20) + 32;
    }

    public static int n(int i10, int i11) {
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

    public final Bitmap b(int i10, int i11) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(this.f, i10, i11, this.e);
        if (decodeByteArray == null) {
            throw a("Bitmap decoder rejected image");
        }
        if (decodeByteArray.getWidth() == 64 && decodeByteArray.getHeight() == 64) {
            return decodeByteArray;
        }
        decodeByteArray.recycle();
        throw a("Unexpected bitmap dimensions");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        if (r3 == 6) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int f7 = f(i10);
        int p5 = p(f7 + 17);
        if (p5 != 0) {
            int o10 = o(f7 + 10);
            bArr2 = m(o10);
            i12 = o(f(o10) + 14);
            if (p5 == 3 || p5 == 5 || p5 == 6) {
                int o11 = o(f7 + 12);
                bArr3 = m(o11);
                i11 = o(f(o11) + 14);
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
        int i16 = f7 + 19;
        int p9 = (p(i16) >>> 1) & 7;
        int p10 = (p(i16) >>> 4) & 7;
        if (p5 == 4) {
            for (int i17 = 0; i17 < 4096; i17++) {
                bArr[i17] = bArr2[n(i17, p9)];
            }
            return;
        }
        int i18 = i12 + i11;
        int j10 = j(f7);
        int i19 = this.a.getInt(f7 + 4) + j10;
        int o12 = o(f7 + 8) - j10;
        if (p5 == 5 || p5 == 6) {
            if (o12 < 2) {
                throw a("Truncated split record");
            }
            int i20 = i19 + 1;
            int p11 = p(i19);
            o12--;
            if (p11 < 1 || p11 >= 64) {
                throw a("Invalid split position");
            }
            i13 = p11;
            i19 = i20;
        } else {
            i13 = 32;
        }
        l(i19, o12);
        int p12 = p(f7 + 16);
        byte[] bArr4 = this.g;
        if (p12 == 0) {
            i(o12, i18 + TLObject.FLAG_12);
            i14 = 0;
            System.arraycopy(bArr4, i18, bArr, 0, TLObject.FLAG_12);
            i15 = f7;
        } else {
            i14 = 0;
            if (o12 <= i18) {
                throw a("Truncated index WebP");
            }
            i15 = f7;
            System.arraycopy(this.f, 20, bArr4, 0, i18);
            Bitmap e = e(i18 + 20, o12 - i18);
            try {
                e.getPixels(this.i, 0, 64, 0, 0, 64, 64);
                for (int i21 = 0; i21 < 4096; i21++) {
                    bArr[i21] = (byte) this.i[i21];
                }
            } finally {
                e.recycle();
            }
        }
        if (p5 == 1 || p5 == 2) {
            for (int i22 = i14; i22 < 4096; i22++) {
                int i23 = bArr2[n(i22, p9)] & 255;
                if (i23 >= i12) {
                    throw a("Root index out of range");
                }
                int i24 = bArr4[i23] & 255;
                bArr[i22] = p5 == 1 ? (byte) (i24 ^ (bArr[i22] & 255)) : (byte) ((bArr[i22] & 255) + i24);
            }
        } else {
            int i25 = (p5 == 3 || p5 == 5) ? 6 : 6;
            int i26 = i14;
            while (i26 < 4096) {
                int i27 = (p5 != i25 ? (i26 & 63) >= i13 : (i26 >>> 6) >= i13) ? i14 : 1;
                int i28 = (i27 != 0 ? bArr2[n(i26, p9)] : bArr3[n(i26, p10)]) & 255;
                if (i28 >= (i27 != 0 ? i12 : i11)) {
                    throw a("Half root index out of range");
                }
                bArr[i26] = (byte) ((bArr[i26] & 255) + (bArr4[(i27 != 0 ? i14 : i12) + i28] & 255));
                i26++;
                i25 = 6;
            }
        }
        int o13 = o(i15 + 14);
        if (o13 < 256) {
            int length = bArr.length;
            for (int i29 = i14; i29 < length; i29++) {
                if ((bArr[i29] & 255) >= o13) {
                    throw a("Decoded index out of range");
                }
            }
        }
    }

    public final void d(int[] iArr, int i10) {
        Bitmap e;
        int[] iArr2;
        int i11;
        int f7 = f(i10);
        MappedByteBuffer mappedByteBuffer = this.a;
        int i12 = mappedByteBuffer.getInt(f7 + 4);
        int o10 = o(f7 + 8);
        int p5 = p(f7 + 16);
        if (p5 != 2) {
            int i13 = 3;
            if (p5 != 3) {
                byte[] bArr = this.h;
                c(i10, bArr);
                int o11 = o(f7 + 14);
                int i14 = f7 + 18;
                int p9 = p(i14) & zs.L1;
                int i15 = o11 * p9;
                boolean z10 = (p(i14) & 128) != 0;
                if (z10) {
                    int j10 = j(f7) - 2;
                    l(i12 + 2, j10);
                    i(j10, (p(f7 + 19) & 1) != 0 ? ((i15 * 7) + 7) / 8 : i15);
                }
                int p10 = p(f7 + 19) & 1;
                byte[] bArr2 = this.g;
                byte[] bArr3 = this.l;
                if (p10 != 0) {
                    int i16 = 0;
                    while (i16 < i15) {
                        int i17 = i16 * 7;
                        int i18 = i17 & 7;
                        int i19 = i17 >>> i13;
                        int p11 = (z10 ? bArr2[i19] & 255 : p(i12 + i19)) >>> i18;
                        if (i18 > 1) {
                            p11 |= (z10 ? bArr2[i19 + 1] & 255 : p((i19 + i12) + 1)) << (8 - i18);
                        }
                        int i20 = p11 & zs.L1;
                        bArr3[i16] = (byte) ((i20 >>> 6) | (i20 << 1));
                        i16++;
                        i13 = 3;
                    }
                } else if (z10) {
                    System.arraycopy(bArr2, 0, bArr3, 0, i15);
                } else {
                    for (int i21 = 0; i21 < i15; i21++) {
                        bArr3[i21] = mappedByteBuffer.get(i12 + i21);
                    }
                }
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    iArr2 = this.k;
                    if (i22 >= o11) {
                        break;
                    }
                    if (p9 == 0) {
                        iArr2[i22] = (65793 * i22) | (-16777216);
                    } else if (p9 == 1) {
                        iArr2[i22] = ((bArr3[i23] & 255) * 65793) | (-16777216);
                        i23++;
                    } else {
                        int i24 = bArr3[i23] & 255;
                        int i25 = bArr3[i23 + 1] & 255;
                        int i26 = i23 + 3;
                        int i27 = bArr3[i23 + 2] & 255;
                        if (p9 == 4) {
                            i23 += 4;
                            i11 = bArr3[i26] & 255;
                        } else {
                            i23 = i26;
                            i11 = 255;
                        }
                        iArr2[i22] = (i25 << 8) | (i24 << 16) | (i11 << 24) | i27;
                    }
                    i22++;
                }
                for (int i28 = 0; i28 < 4096; i28++) {
                    int i29 = bArr[i28] & 255;
                    if (i29 >= o11) {
                        throw a("Palette index out of range");
                    }
                    iArr[i28] = iArr2[i29];
                }
                return;
            }
        }
        l(i12, o10);
        BitmapFactory.Options options = this.e;
        options.inPremultiplied = false;
        Bitmap bitmap = null;
        try {
            e = p5 == 2 ? e(20, o10) : b(20, o10);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            e.getPixels(iArr, 0, 64, 0, 0, 64, 64);
            options.inPremultiplied = true;
            e.recycle();
        } catch (Throwable th3) {
            th = th3;
            bitmap = e;
            options.inPremultiplied = true;
            if (bitmap != null) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    public final Bitmap e(int i10, int i11) {
        int i12 = i10 - 20;
        int i13 = i11 & 1;
        k(i12, 1179011410);
        k(i10 - 16, i11 + 12 + i13);
        k(i10 - 12, 1346520407);
        k(i10 - 8, 1278758998);
        k(i10 - 4, i11);
        if (i13 != 0) {
            this.f[i10 + i11] = 0;
        }
        return b(i12, i11 + 20 + i13);
    }

    public final int g(int i10, int i11, int i12) {
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int o10 = o(f(i14));
            if (o10 < i10) {
                i11 = i14 + 1;
            } else {
                if (o10 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -1;
    }

    public final synchronized Bitmap h(int i10, int i11) {
        int i12;
        Bitmap e;
        if (i10 < 0 || i10 > 15 || i11 < 0 || i11 >= 4096) {
            i12 = -1;
        } else {
            try {
                i12 = g((i10 * TLObject.FLAG_12) + i11, 0, this.c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i12 < 0) {
            return null;
        }
        int o10 = o(f(i12) + 2);
        if (o10 != 65535) {
            d(this.j, i12);
            d(this.i, g(o10, this.c, this.b));
            for (int i13 = 0; i13 < 4096; i13++) {
                int[] iArr = this.j;
                int i14 = iArr[i13];
                iArr[i13] = (i14 & 16777215) | (((((i14 >>> 24) * (this.i[i13] & zs.e4)) + zs.L1) / zs.e4) << 24);
            }
            return Bitmap.createBitmap(this.j, 64, 64, Bitmap.Config.ARGB_8888);
        }
        int[] iArr2 = this.i;
        int f7 = f(i12);
        int i15 = this.a.getInt(f7 + 4);
        int o11 = o(f7 + 8);
        int p5 = p(f7 + 16);
        if (p5 != 2 && p5 != 3) {
            d(iArr2, i12);
            e = Bitmap.createBitmap(iArr2, 64, 64, Bitmap.Config.ARGB_8888);
            return e;
        }
        l(i15, o11);
        e = p5 == 2 ? e(20, o11) : b(20, o11);
        return e;
    }

    public final void i(int i10, int i11) {
        Inflater inflater = this.d;
        inflater.reset();
        inflater.setInput(this.f, 20, i10);
        int i12 = 0;
        while (i12 < i11) {
            try {
                int inflate = inflater.inflate(this.g, i12, i11 - i12);
                if (inflate == 0) {
                    throw a("Truncated DEFLATE stream");
                }
                i12 += inflate;
            } catch (DataFormatException e) {
                throw new IllegalStateException("Damaged EPK3 DEFLATE stream", e);
            }
        }
        if (!inflater.finished() && (inflater.inflate(this.h, 0, 1) != 0 || !inflater.finished())) {
            throw a("Oversized DEFLATE stream");
        }
        if (inflater.getRemaining() != 0) {
            throw a("Trailing DEFLATE bytes");
        }
    }

    public final int j(int i10) {
        int i11;
        int i12 = i10 + 18;
        if ((p(i12) & 128) == 0) {
            int o10 = o(i10 + 14) * (p(i12) & zs.L1);
            return (p(i10 + 19) & 1) != 0 ? ((o10 * 7) + 7) / 8 : o10;
        }
        int i13 = i10 + 8;
        if (o(i13) < 3) {
            throw a("Truncated compressed palette");
        }
        int o11 = o(this.a.getInt(i10 + 4));
        if (o11 == 0 || (i11 = o11 + 2) > o(i13)) {
            throw a("Invalid compressed palette");
        }
        return i11;
    }

    public final void k(int i10, int i11) {
        byte[] bArr = this.f;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >>> 8);
        bArr[i10 + 2] = (byte) (i11 >>> 16);
        bArr[i10 + 3] = (byte) (i11 >>> 24);
    }

    public final void l(int i10, int i11) {
        byte[] bArr = this.f;
        int i12 = i11 + 21;
        if (bArr.length < i12) {
            int length = bArr.length;
            while (length < i12) {
                length <<= 1;
            }
            this.f = new byte[length];
        }
        MappedByteBuffer mappedByteBuffer = this.a;
        mappedByteBuffer.position(i10);
        mappedByteBuffer.get(this.f, 20, i11);
    }

    public final byte[] m(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[][] bArr = this.o;
            long[] jArr = this.n;
            int[] iArr = this.m;
            if (i11 >= 8) {
                if (bArr[i12] == null) {
                    bArr[i12] = new byte[TLObject.FLAG_12];
                }
                iArr[i12] = -1;
                c(i10, bArr[i12]);
                iArr[i12] = i10;
                long j10 = this.p + 1;
                this.p = j10;
                jArr[i12] = j10;
                return bArr[i12];
            }
            if (iArr[i11] == i10) {
                long j11 = this.p + 1;
                this.p = j11;
                jArr[i11] = j11;
                return bArr[i11];
            }
            if (jArr[i11] < jArr[i12]) {
                i12 = i11;
            }
            i11++;
        }
    }

    public final int o(int i10) {
        return this.a.getShort(i10) & 65535;
    }

    public final int p(int i10) {
        return this.a.get(i10) & 255;
    }

    public final void q(int i10, int i11) {
        if (i10 >= this.b || i10 == i11) {
            throw new IOException("Invalid root reference");
        }
        int f7 = f(i10);
        if (p(f7 + 16) > 1 || p(f7 + 17) != 0 || o(f7 + 10) != 65535 || o(f7 + 12) != 65535) {
            throw new IOException("EPK3 dependency chains are forbidden");
        }
    }
}
