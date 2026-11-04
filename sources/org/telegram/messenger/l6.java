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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l6 {
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
    public l6() {
        int i3;
        char c2;
        int i10;
        int i11;
        AssetFileDescriptor openFd = t0.b.getAssets().openFd("emoji.pack");
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
                int i12 = map.getInt(16);
                this.b = i12;
                int i13 = map.getInt(20);
                this.c = i13;
                if (i12 >= 1) {
                    int i14 = 65535;
                    if (i12 <= 65535 && i13 >= 0 && i13 <= i12 && (i12 * 20) + 32 <= map.capacity()) {
                        int i15 = (i12 * 20) + 32;
                        int i16 = 0;
                        while (i16 < i12) {
                            int f10 = f(i16);
                            if (i16 != 0 && i16 != i13 && o(f10) <= o(f10 - 20)) {
                                throw new IOException("Unsorted EPK3 IDs");
                            }
                            int o10 = o(f10 + 2);
                            if ((i16 >= i13 && o10 != i14) || (i16 < i13 && o10 != i14 && g(o10, i13, i12) < 0)) {
                                throw new IOException(k2.p1.i(i16, "Invalid mask reference at record "));
                            }
                            int i17 = map.getInt(f10 + 4);
                            int o11 = o(f10 + 8);
                            int o12 = o(f10 + 10);
                            int o13 = o(f10 + 12);
                            int o14 = o(f10 + 14);
                            int p10 = p(f10 + 16);
                            int p11 = p(f10 + 17);
                            int i18 = f10 + 18;
                            int p12 = p(i18) & hs.L1;
                            if (i17 < i15 || o11 == 0) {
                                i3 = i16;
                            } else {
                                int i19 = i15;
                                int i20 = i16;
                                if (i17 + o11 <= map.capacity()) {
                                    char c10 = 4;
                                    if (p10 <= 4 && p11 <= 6) {
                                        if (p10 != 2 && p10 != 3) {
                                            if (o14 >= 1 && o14 <= 256 && p12 != 2 && p12 <= 4 && (p12 != 0 || o14 == 256)) {
                                                if (p10 == 4) {
                                                    if (j(f10) != o11) {
                                                    }
                                                    if (p12 == 0 || ((p(f10 + 19) & 1) == 0 && (p(i18) & 128) == 0)) {
                                                        c10 = 4;
                                                        if ((p10 != 4) == (p11 != 4)) {
                                                            throw new IOException("Invalid map reference encoding");
                                                        }
                                                        if (p10 == 4 && (o12 >= i12 || o14 != o(f(o12) + 14))) {
                                                            throw new IOException("Map reference palette size mismatch");
                                                        }
                                                        if (p11 != 0) {
                                                            i11 = i20;
                                                            q(o12, i11);
                                                            if (p11 == 3 || p11 == 5) {
                                                                c2 = 6;
                                                            } else {
                                                                c2 = 6;
                                                                if (p11 != 6) {
                                                                    i10 = 65535;
                                                                    if (o13 != 65535) {
                                                                        throw new IOException("Unexpected second root");
                                                                    }
                                                                }
                                                            }
                                                            q(o13, i11);
                                                            i10 = 65535;
                                                        } else {
                                                            if (o12 != 65535 || o13 != 65535) {
                                                                throw new IOException("Unexpected root reference");
                                                            }
                                                            i10 = 65535;
                                                            i11 = i20;
                                                            c2 = 6;
                                                        }
                                                        i16 = i11 + 1;
                                                        i14 = i10;
                                                        i15 = i19;
                                                    }
                                                } else {
                                                    if (j(f10) >= o11) {
                                                    }
                                                    if (p12 == 0) {
                                                    }
                                                    c10 = 4;
                                                    if ((p10 != 4) == (p11 != 4)) {
                                                    }
                                                }
                                            }
                                            throw new IOException(k2.p1.i(i20, "Invalid palette at record "));
                                        }
                                        i11 = i20;
                                        c2 = 6;
                                        if (o14 == 0 && p(i18) == 0 && p11 == 0 && (p(f10 + 19) & hs.L1) == 0) {
                                            i10 = 65535;
                                            if (o12 == 65535 && o13 == 65535) {
                                                i16 = i11 + 1;
                                                i14 = i10;
                                                i15 = i19;
                                            }
                                        }
                                        throw new IOException(k2.p1.i(i11, "Invalid full image record "));
                                    }
                                }
                                i3 = i20;
                            }
                            throw new IOException(k2.p1.i(i3, "Invalid EPK3 record "));
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

    public static int f(int i3) {
        return (i3 * 20) + 32;
    }

    public static int n(int i3, int i10) {
        int i11 = i3 & 63;
        int i12 = i3 >>> 6;
        if ((i10 & 1) != 0) {
            i11 = 63 - i11;
        }
        if ((i10 & 2) != 0) {
            i12 = 63 - i12;
        }
        return (i10 & 4) != 0 ? i12 | (i11 << 6) : (i12 << 6) | i11;
    }

    public final Bitmap b(int i3, int i10) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(this.f, i3, i10, this.e);
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
    public final void c(int i3, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int f10 = f(i3);
        int p10 = p(f10 + 17);
        if (p10 != 0) {
            int o10 = o(f10 + 10);
            bArr2 = m(o10);
            i11 = o(f(o10) + 14);
            if (p10 == 3 || p10 == 5 || p10 == 6) {
                int o11 = o(f10 + 12);
                bArr3 = m(o11);
                i10 = o(f(o11) + 14);
            } else {
                bArr3 = null;
                i10 = 0;
            }
        } else {
            bArr2 = null;
            bArr3 = null;
            i10 = 0;
            i11 = 0;
        }
        int i15 = f10 + 19;
        int p11 = (p(i15) >>> 1) & 7;
        int p12 = (p(i15) >>> 4) & 7;
        if (p10 == 4) {
            for (int i16 = 0; i16 < 4096; i16++) {
                bArr[i16] = bArr2[n(i16, p11)];
            }
            return;
        }
        int i17 = i11 + i10;
        int j10 = j(f10);
        int i18 = this.a.getInt(f10 + 4) + j10;
        int o12 = o(f10 + 8) - j10;
        if (p10 == 5 || p10 == 6) {
            if (o12 < 2) {
                throw a("Truncated split record");
            }
            int i19 = i18 + 1;
            int p13 = p(i18);
            o12--;
            if (p13 < 1 || p13 >= 64) {
                throw a("Invalid split position");
            }
            i12 = p13;
            i18 = i19;
        } else {
            i12 = 32;
        }
        l(i18, o12);
        int p14 = p(f10 + 16);
        byte[] bArr4 = this.g;
        if (p14 == 0) {
            i(o12, i17 + TLObject.FLAG_12);
            i13 = 0;
            System.arraycopy(bArr4, i17, bArr, 0, TLObject.FLAG_12);
            i14 = f10;
        } else {
            i13 = 0;
            if (o12 <= i17) {
                throw a("Truncated index WebP");
            }
            i14 = f10;
            System.arraycopy(this.f, 20, bArr4, 0, i17);
            Bitmap e10 = e(i17 + 20, o12 - i17);
            try {
                e10.getPixels(this.i, 0, 64, 0, 0, 64, 64);
                for (int i20 = 0; i20 < 4096; i20++) {
                    bArr[i20] = (byte) this.i[i20];
                }
            } finally {
                e10.recycle();
            }
        }
        if (p10 == 1 || p10 == 2) {
            for (int i21 = i13; i21 < 4096; i21++) {
                int i22 = bArr2[n(i21, p11)] & 255;
                if (i22 >= i11) {
                    throw a("Root index out of range");
                }
                int i23 = bArr4[i22] & 255;
                bArr[i21] = p10 == 1 ? (byte) (i23 ^ (bArr[i21] & 255)) : (byte) ((bArr[i21] & 255) + i23);
            }
        } else {
            int i24 = (p10 == 3 || p10 == 5) ? 6 : 6;
            int i25 = i13;
            while (i25 < 4096) {
                int i26 = (p10 != i24 ? (i25 & 63) >= i12 : (i25 >>> 6) >= i12) ? i13 : 1;
                int i27 = (i26 != 0 ? bArr2[n(i25, p11)] : bArr3[n(i25, p12)]) & 255;
                if (i27 >= (i26 != 0 ? i11 : i10)) {
                    throw a("Half root index out of range");
                }
                bArr[i25] = (byte) ((bArr[i25] & 255) + (bArr4[(i26 != 0 ? i13 : i11) + i27] & 255));
                i25++;
                i24 = 6;
            }
        }
        int o13 = o(i14 + 14);
        if (o13 < 256) {
            int length = bArr.length;
            for (int i28 = i13; i28 < length; i28++) {
                if ((bArr[i28] & 255) >= o13) {
                    throw a("Decoded index out of range");
                }
            }
        }
    }

    public final void d(int[] iArr, int i3) {
        Bitmap e10;
        int[] iArr2;
        int i10;
        int f10 = f(i3);
        MappedByteBuffer mappedByteBuffer = this.a;
        int i11 = mappedByteBuffer.getInt(f10 + 4);
        int o10 = o(f10 + 8);
        int p10 = p(f10 + 16);
        if (p10 != 2) {
            int i12 = 3;
            if (p10 != 3) {
                byte[] bArr = this.h;
                c(i3, bArr);
                int o11 = o(f10 + 14);
                int i13 = f10 + 18;
                int p11 = p(i13) & hs.L1;
                int i14 = o11 * p11;
                boolean z10 = (p(i13) & 128) != 0;
                if (z10) {
                    int j10 = j(f10) - 2;
                    l(i11 + 2, j10);
                    i(j10, (p(f10 + 19) & 1) != 0 ? ((i14 * 7) + 7) / 8 : i14);
                }
                int p12 = p(f10 + 19) & 1;
                byte[] bArr2 = this.g;
                byte[] bArr3 = this.l;
                if (p12 != 0) {
                    int i15 = 0;
                    while (i15 < i14) {
                        int i16 = i15 * 7;
                        int i17 = i16 & 7;
                        int i18 = i16 >>> i12;
                        int p13 = (z10 ? bArr2[i18] & 255 : p(i11 + i18)) >>> i17;
                        if (i17 > 1) {
                            p13 |= (z10 ? bArr2[i18 + 1] & 255 : p((i18 + i11) + 1)) << (8 - i17);
                        }
                        int i19 = p13 & hs.L1;
                        bArr3[i15] = (byte) ((i19 >>> 6) | (i19 << 1));
                        i15++;
                        i12 = 3;
                    }
                } else if (z10) {
                    System.arraycopy(bArr2, 0, bArr3, 0, i14);
                } else {
                    for (int i20 = 0; i20 < i14; i20++) {
                        bArr3[i20] = mappedByteBuffer.get(i11 + i20);
                    }
                }
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    iArr2 = this.k;
                    if (i21 >= o11) {
                        break;
                    }
                    if (p11 == 0) {
                        iArr2[i21] = (65793 * i21) | (-16777216);
                    } else if (p11 == 1) {
                        iArr2[i21] = ((bArr3[i22] & 255) * 65793) | (-16777216);
                        i22++;
                    } else {
                        int i23 = bArr3[i22] & 255;
                        int i24 = bArr3[i22 + 1] & 255;
                        int i25 = i22 + 3;
                        int i26 = bArr3[i22 + 2] & 255;
                        if (p11 == 4) {
                            i22 += 4;
                            i10 = bArr3[i25] & 255;
                        } else {
                            i22 = i25;
                            i10 = 255;
                        }
                        iArr2[i21] = (i24 << 8) | (i23 << 16) | (i10 << 24) | i26;
                    }
                    i21++;
                }
                for (int i27 = 0; i27 < 4096; i27++) {
                    int i28 = bArr[i27] & 255;
                    if (i28 >= o11) {
                        throw a("Palette index out of range");
                    }
                    iArr[i27] = iArr2[i28];
                }
                return;
            }
        }
        l(i11, o10);
        BitmapFactory.Options options = this.e;
        options.inPremultiplied = false;
        Bitmap bitmap = null;
        try {
            e10 = p10 == 2 ? e(20, o10) : b(20, o10);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            e10.getPixels(iArr, 0, 64, 0, 0, 64, 64);
            options.inPremultiplied = true;
            e10.recycle();
        } catch (Throwable th3) {
            th = th3;
            bitmap = e10;
            options.inPremultiplied = true;
            if (bitmap != null) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    public final Bitmap e(int i3, int i10) {
        int i11 = i3 - 20;
        int i12 = i10 & 1;
        k(i11, 1179011410);
        k(i3 - 16, i10 + 12 + i12);
        k(i3 - 12, 1346520407);
        k(i3 - 8, 1278758998);
        k(i3 - 4, i10);
        if (i12 != 0) {
            this.f[i3 + i10] = 0;
        }
        return b(i11, i10 + 20 + i12);
    }

    public final int g(int i3, int i10, int i11) {
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int o10 = o(f(i13));
            if (o10 < i3) {
                i10 = i13 + 1;
            } else {
                if (o10 <= i3) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -1;
    }

    public final synchronized Bitmap h(int i3, int i10) {
        int i11;
        Bitmap e10;
        if (i3 < 0 || i3 > 15 || i10 < 0 || i10 >= 4096) {
            i11 = -1;
        } else {
            try {
                i11 = g((i3 * TLObject.FLAG_12) + i10, 0, this.c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 < 0) {
            return null;
        }
        int o10 = o(f(i11) + 2);
        if (o10 != 65535) {
            d(this.j, i11);
            d(this.i, g(o10, this.c, this.b));
            for (int i12 = 0; i12 < 4096; i12++) {
                int[] iArr = this.j;
                int i13 = iArr[i12];
                iArr[i12] = (i13 & 16777215) | (((((i13 >>> 24) * (this.i[i12] & hs.e4)) + hs.L1) / hs.e4) << 24);
            }
            return Bitmap.createBitmap(this.j, 64, 64, Bitmap.Config.ARGB_8888);
        }
        int[] iArr2 = this.i;
        int f10 = f(i11);
        int i14 = this.a.getInt(f10 + 4);
        int o11 = o(f10 + 8);
        int p10 = p(f10 + 16);
        if (p10 != 2 && p10 != 3) {
            d(iArr2, i11);
            e10 = Bitmap.createBitmap(iArr2, 64, 64, Bitmap.Config.ARGB_8888);
            return e10;
        }
        l(i14, o11);
        e10 = p10 == 2 ? e(20, o11) : b(20, o11);
        return e10;
    }

    public final void i(int i3, int i10) {
        Inflater inflater = this.d;
        inflater.reset();
        inflater.setInput(this.f, 20, i3);
        int i11 = 0;
        while (i11 < i10) {
            try {
                int inflate = inflater.inflate(this.g, i11, i10 - i11);
                if (inflate == 0) {
                    throw a("Truncated DEFLATE stream");
                }
                i11 += inflate;
            } catch (DataFormatException e10) {
                throw new IllegalStateException("Damaged EPK3 DEFLATE stream", e10);
            }
        }
        if (!inflater.finished() && (inflater.inflate(this.h, 0, 1) != 0 || !inflater.finished())) {
            throw a("Oversized DEFLATE stream");
        }
        if (inflater.getRemaining() != 0) {
            throw a("Trailing DEFLATE bytes");
        }
    }

    public final int j(int i3) {
        int i10;
        int i11 = i3 + 18;
        if ((p(i11) & 128) == 0) {
            int o10 = o(i3 + 14) * (p(i11) & hs.L1);
            return (p(i3 + 19) & 1) != 0 ? ((o10 * 7) + 7) / 8 : o10;
        }
        int i12 = i3 + 8;
        if (o(i12) < 3) {
            throw a("Truncated compressed palette");
        }
        int o11 = o(this.a.getInt(i3 + 4));
        if (o11 == 0 || (i10 = o11 + 2) > o(i12)) {
            throw a("Invalid compressed palette");
        }
        return i10;
    }

    public final void k(int i3, int i10) {
        byte[] bArr = this.f;
        bArr[i3] = (byte) i10;
        bArr[i3 + 1] = (byte) (i10 >>> 8);
        bArr[i3 + 2] = (byte) (i10 >>> 16);
        bArr[i3 + 3] = (byte) (i10 >>> 24);
    }

    public final void l(int i3, int i10) {
        byte[] bArr = this.f;
        int i11 = i10 + 21;
        if (bArr.length < i11) {
            int length = bArr.length;
            while (length < i11) {
                length <<= 1;
            }
            this.f = new byte[length];
        }
        MappedByteBuffer mappedByteBuffer = this.a;
        mappedByteBuffer.position(i3);
        mappedByteBuffer.get(this.f, 20, i10);
    }

    public final byte[] m(int i3) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr = this.o;
            long[] jArr = this.n;
            int[] iArr = this.m;
            if (i10 >= 8) {
                if (bArr[i11] == null) {
                    bArr[i11] = new byte[TLObject.FLAG_12];
                }
                iArr[i11] = -1;
                c(i3, bArr[i11]);
                iArr[i11] = i3;
                long j10 = this.p + 1;
                this.p = j10;
                jArr[i11] = j10;
                return bArr[i11];
            }
            if (iArr[i10] == i3) {
                long j11 = this.p + 1;
                this.p = j11;
                jArr[i10] = j11;
                return bArr[i10];
            }
            if (jArr[i10] < jArr[i11]) {
                i11 = i10;
            }
            i10++;
        }
    }

    public final int o(int i3) {
        return this.a.getShort(i3) & 65535;
    }

    public final int p(int i3) {
        return this.a.get(i3) & 255;
    }

    public final void q(int i3, int i10) {
        if (i3 >= this.b || i3 == i10) {
            throw new IOException("Invalid root reference");
        }
        int f10 = f(i3);
        if (p(f10 + 16) > 1 || p(f10 + 17) != 0 || o(f10 + 10) != 65535 || o(f10 + 12) != 65535) {
            throw new IOException("EPK3 dependency chains are forbidden");
        }
    }
}
