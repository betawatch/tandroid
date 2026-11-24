// default package

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
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hy3 {
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

    /* JADX WARN: Removed duplicated region for block: B:122:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hy3() {
        int i;
        int o;
        Throwable th;
        int o2;
        int o3;
        int p;
        MappedByteBuffer mappedByteBuffer;
        int i2;
        int i3;
        AssetFileDescriptor openFd = a.b.getAssets().openFd("emoji.pack");
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
                Throwable th2 = null;
                if (map.getInt(0) != 860573765 || ((o(4) != 2 && o(4) != 3) || o(6) != 20 || map.getInt(8) != 64 || map.getInt(12) != 64 || map.getInt(24) != map.capacity() || map.getInt(28) != 0)) {
                    wa3.d("Unsupported or damaged EPK3 header");
                    throw null;
                }
                int i4 = map.getInt(16);
                this.b = i4;
                int i5 = map.getInt(20);
                this.c = i5;
                if (i4 >= 1) {
                    int i6 = 65535;
                    if (i4 <= 65535 && i5 >= 0 && i5 <= i4 && (i4 * 20) + 32 <= map.capacity()) {
                        int i7 = (i4 * 20) + 32;
                        int i8 = 0;
                        while (i8 < i4) {
                            int f = f(i8);
                            if (i8 != 0 && i8 != i5 && o(f) <= o(f - 20)) {
                                wa3.d("Unsorted EPK3 IDs");
                                throw th2;
                            }
                            int o4 = o(f + 2);
                            if (i8 < i5) {
                                if (o4 != i6 && g(o4, i5, i4) < 0) {
                                    wa3.d(hg9.j(i8, "Invalid mask reference at record "));
                                    throw th2;
                                }
                                i = map.getInt(f + 4);
                                o = o(f + 8);
                                th = th2;
                                o2 = o(f + 10);
                                int o5 = o(f + 12);
                                o3 = o(f + 14);
                                p = p(f + 16);
                                int p2 = p(f + 17);
                                int i9 = f + 18;
                                int p3 = p(i9) & nm7.K1;
                                if (i >= i7) {
                                    mappedByteBuffer = map;
                                    i2 = i7;
                                    if (i + o <= mappedByteBuffer.capacity()) {
                                        if (p != 2) {
                                        }
                                        if (o3 == 0) {
                                            i3 = 65535;
                                            if (o2 == 65535) {
                                                i8++;
                                                i6 = i3;
                                                th2 = th;
                                                i7 = i2;
                                                map = mappedByteBuffer;
                                            }
                                        }
                                        wa3.d(hg9.j(i8, "Invalid full image record "));
                                        throw th;
                                    }
                                }
                                wa3.d(hg9.j(i8, "Invalid EPK3 record "));
                                throw th;
                            }
                            if (o4 != i6) {
                                wa3.d(hg9.j(i8, "Invalid mask reference at record "));
                                throw th2;
                            }
                            i = map.getInt(f + 4);
                            o = o(f + 8);
                            th = th2;
                            o2 = o(f + 10);
                            int o52 = o(f + 12);
                            o3 = o(f + 14);
                            p = p(f + 16);
                            int p22 = p(f + 17);
                            int i92 = f + 18;
                            int p32 = p(i92) & nm7.K1;
                            if (i >= i7 && o != 0) {
                                mappedByteBuffer = map;
                                i2 = i7;
                                if (i + o <= mappedByteBuffer.capacity() && p <= 4 && p22 <= 6) {
                                    if (p != 2 || p == 3) {
                                        if (o3 == 0 && p(i92) == 0 && p22 == 0 && (p(f + 19) & nm7.K1) == 0) {
                                            i3 = 65535;
                                            if (o2 == 65535 && o52 == 65535) {
                                            }
                                        }
                                        wa3.d(hg9.j(i8, "Invalid full image record "));
                                        throw th;
                                    }
                                    if (o3 >= 1 && o3 <= 256 && p32 != 2 && p32 <= 4 && (p32 != 0 || o3 == 256)) {
                                        if (p == 4) {
                                            if (j(f) != o) {
                                            }
                                            if (p32 == 0 || ((p(f + 19) & 1) == 0 && (p(i92) & 128) == 0)) {
                                                if ((p != 4) == (p22 != 4)) {
                                                    wa3.d("Invalid map reference encoding");
                                                    throw th;
                                                }
                                                if (p == 4 && (o2 >= i4 || o3 != o(f(o2) + 14))) {
                                                    wa3.d("Map reference palette size mismatch");
                                                    throw th;
                                                }
                                                if (p22 != 0) {
                                                    q(o2, i8);
                                                    if (p22 == 3 || p22 == 5 || p22 == 6) {
                                                        q(o52, i8);
                                                        i3 = 65535;
                                                    } else {
                                                        i3 = 65535;
                                                        if (o52 != 65535) {
                                                            wa3.d("Unexpected second root");
                                                            throw th;
                                                        }
                                                    }
                                                } else {
                                                    if (o2 != 65535 || o52 != 65535) {
                                                        wa3.d("Unexpected root reference");
                                                        throw th;
                                                    }
                                                    i3 = 65535;
                                                }
                                            }
                                        } else {
                                            if (j(f) >= o) {
                                            }
                                            if (p32 == 0) {
                                            }
                                            if ((p != 4) == (p22 != 4)) {
                                            }
                                        }
                                    }
                                    wa3.d(hg9.j(i8, "Invalid palette at record "));
                                    throw th;
                                    i8++;
                                    i6 = i3;
                                    th2 = th;
                                    i7 = i2;
                                    map = mappedByteBuffer;
                                }
                            }
                            wa3.d(hg9.j(i8, "Invalid EPK3 record "));
                            throw th;
                        }
                        Arrays.fill(this.m, -1);
                        BitmapFactory.Options options = this.e;
                        options.inScaled = false;
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inPremultiplied = true;
                        return;
                    }
                }
                wa3.d("Invalid EPK3 record count");
                throw null;
            } finally {
            }
        } finally {
        }
    }

    public static IllegalStateException a(String str) {
        return new IllegalStateException("Damaged emoji.pack: ".concat(str));
    }

    public static int f(int i) {
        return (i * 20) + 32;
    }

    public static int n(int i, int i2) {
        int i3 = i & 63;
        int i4 = i >>> 6;
        if ((i2 & 1) != 0) {
            i3 = 63 - i3;
        }
        if ((i2 & 2) != 0) {
            i4 = 63 - i4;
        }
        return (i2 & 4) != 0 ? (i3 << 6) | i4 : (i4 << 6) | i3;
    }

    public final Bitmap b(int i, int i2) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(this.f, i, i2, this.e);
        if (decodeByteArray == null) {
            throw a("Bitmap decoder rejected image");
        }
        if (decodeByteArray.getWidth() == 64 && decodeByteArray.getHeight() == 64) {
            return decodeByteArray;
        }
        decodeByteArray.recycle();
        throw a("Unexpected bitmap dimensions");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0104, code lost:
    
        if (r3 == 6) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int f = f(i);
        int p = p(f + 17);
        if (p != 0) {
            int o = o(f + 10);
            bArr2 = m(o);
            i3 = o(f(o) + 14);
            if (p == 3 || p == 5 || p == 6) {
                int o2 = o(f + 12);
                bArr3 = m(o2);
                i2 = o(f(o2) + 14);
            } else {
                bArr3 = null;
                i2 = 0;
            }
        } else {
            bArr2 = null;
            bArr3 = null;
            i2 = 0;
            i3 = 0;
        }
        int i7 = f + 19;
        int p2 = (p(i7) >>> 1) & 7;
        int p3 = (p(i7) >>> 4) & 7;
        if (p == 4) {
            for (int i8 = 0; i8 < 4096; i8++) {
                bArr[i8] = bArr2[n(i8, p2)];
            }
            return;
        }
        int i9 = i3 + i2;
        int j = j(f);
        int i10 = this.a.getInt(f + 4) + j;
        int o3 = o(f + 8) - j;
        if (p == 5 || p == 6) {
            if (o3 < 2) {
                throw a("Truncated split record");
            }
            int i11 = i10 + 1;
            int p4 = p(i10);
            o3--;
            if (p4 < 1 || p4 >= 64) {
                throw a("Invalid split position");
            }
            i4 = p4;
            i10 = i11;
        } else {
            i4 = 32;
        }
        l(i10, o3);
        int p5 = p(f + 16);
        byte[] bArr4 = this.g;
        if (p5 == 0) {
            i(o3, i9 + TLObject.FLAG_12);
            i5 = 0;
            System.arraycopy(bArr4, i9, bArr, 0, TLObject.FLAG_12);
            i6 = f;
        } else {
            i5 = 0;
            if (o3 <= i9) {
                throw a("Truncated index WebP");
            }
            i6 = f;
            System.arraycopy(this.f, 20, bArr4, 0, i9);
            Bitmap e = e(i9 + 20, o3 - i9);
            try {
                e.getPixels(this.i, 0, 64, 0, 0, 64, 64);
                for (int i12 = 0; i12 < 4096; i12++) {
                    bArr[i12] = (byte) this.i[i12];
                }
            } finally {
                e.recycle();
            }
        }
        if (p == 1 || p == 2) {
            for (int i13 = i5; i13 < 4096; i13++) {
                int i14 = bArr2[n(i13, p2)] & 255;
                if (i14 >= i3) {
                    throw a("Root index out of range");
                }
                int i15 = bArr4[i14] & 255;
                bArr[i13] = (byte) (p == 1 ? (bArr[i13] & 255) ^ i15 : (bArr[i13] & 255) + i15);
            }
        } else {
            int i16 = (p == 3 || p == 5) ? 6 : 6;
            int i17 = i5;
            while (i17 < 4096) {
                int i18 = (p != i16 ? (i17 & 63) >= i4 : (i17 >>> 6) >= i4) ? i5 : 1;
                int i19 = (i18 != 0 ? bArr2[n(i17, p2)] : bArr3[n(i17, p3)]) & 255;
                if (i19 >= (i18 != 0 ? i3 : i2)) {
                    throw a("Half root index out of range");
                }
                bArr[i17] = (byte) ((bArr[i17] & 255) + (bArr4[(i18 != 0 ? i5 : i3) + i19] & 255));
                i17++;
                i16 = 6;
            }
        }
        int o4 = o(i6 + 14);
        if (o4 < 256) {
            int length = bArr.length;
            for (int i20 = i5; i20 < length; i20++) {
                if ((bArr[i20] & 255) >= o4) {
                    throw a("Decoded index out of range");
                }
            }
        }
    }

    public final void d(int[] iArr, int i) {
        int[] iArr2;
        int i2;
        int f = f(i);
        MappedByteBuffer mappedByteBuffer = this.a;
        int i3 = mappedByteBuffer.getInt(f + 4);
        int o = o(f + 8);
        int p = p(f + 16);
        if (p != 2) {
            int i4 = 3;
            if (p != 3) {
                byte[] bArr = this.h;
                c(i, bArr);
                int o2 = o(f + 14);
                int i5 = f + 18;
                int p2 = p(i5) & nm7.K1;
                int i6 = o2 * p2;
                boolean z = (p(i5) & 128) != 0;
                if (z) {
                    int j = j(f) - 2;
                    l(i3 + 2, j);
                    i(j, (p(f + 19) & 1) != 0 ? ((i6 * 7) + 7) / 8 : i6);
                }
                int p3 = p(f + 19) & 1;
                byte[] bArr2 = this.g;
                byte[] bArr3 = this.l;
                if (p3 != 0) {
                    int i7 = 0;
                    while (i7 < i6) {
                        int i8 = i7 * 7;
                        int i9 = i8 & 7;
                        int i10 = i8 >>> i4;
                        int p4 = (z ? bArr2[i10] & 255 : p(i3 + i10)) >>> i9;
                        if (i9 > 1) {
                            p4 |= (z ? bArr2[i10 + 1] & 255 : p((i10 + i3) + 1)) << (8 - i9);
                        }
                        int i11 = p4 & nm7.K1;
                        bArr3[i7] = (byte) ((i11 << 1) | (i11 >>> 6));
                        i7++;
                        i4 = 3;
                    }
                } else if (z) {
                    System.arraycopy(bArr2, 0, bArr3, 0, i6);
                } else {
                    for (int i12 = 0; i12 < i6; i12++) {
                        bArr3[i12] = mappedByteBuffer.get(i3 + i12);
                    }
                }
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    iArr2 = this.k;
                    if (i13 >= o2) {
                        break;
                    }
                    if (p2 == 0) {
                        iArr2[i13] = (65793 * i13) | (-16777216);
                    } else if (p2 == 1) {
                        iArr2[i13] = ((bArr3[i14] & 255) * 65793) | (-16777216);
                        i14++;
                    } else {
                        int i15 = bArr3[i14] & 255;
                        int i16 = bArr3[i14 + 1] & 255;
                        int i17 = i14 + 3;
                        int i18 = bArr3[i14 + 2] & 255;
                        if (p2 == 4) {
                            i14 += 4;
                            i2 = bArr3[i17] & 255;
                        } else {
                            i14 = i17;
                            i2 = 255;
                        }
                        iArr2[i13] = (i2 << 24) | (i15 << 16) | (i16 << 8) | i18;
                    }
                    i13++;
                }
                for (int i19 = 0; i19 < 4096; i19++) {
                    int i20 = bArr[i19] & 255;
                    if (i20 >= o2) {
                        throw a("Palette index out of range");
                    }
                    iArr[i19] = iArr2[i20];
                }
                return;
            }
        }
        l(i3, o);
        BitmapFactory.Options options = this.e;
        options.inPremultiplied = false;
        Bitmap bitmap = null;
        try {
            Bitmap e = p == 2 ? e(20, o) : b(20, o);
            try {
                e.getPixels(iArr, 0, 64, 0, 0, 64, 64);
                options.inPremultiplied = true;
                e.recycle();
            } catch (Throwable th) {
                th = th;
                bitmap = e;
                options.inPremultiplied = true;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Bitmap e(int i, int i2) {
        int i3 = i - 20;
        int i4 = i2 & 1;
        k(i3, 1179011410);
        k(i - 16, i2 + 12 + i4);
        k(i - 12, 1346520407);
        k(i - 8, 1278758998);
        k(i - 4, i2);
        if (i4 != 0) {
            this.f[i + i2] = 0;
        }
        return b(i3, i2 + 20 + i4);
    }

    public final int g(int i, int i2, int i3) {
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int o = o(f(i5));
            if (o < i) {
                i2 = i5 + 1;
            } else {
                if (o <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -1;
    }

    public final synchronized Bitmap h(int i, int i2) {
        int i3;
        Bitmap e;
        int i4 = 0;
        if (i < 0 || i > 15 || i2 < 0 || i2 >= 4096) {
            i3 = -1;
        } else {
            i3 = g((i << 12) + i2, 0, this.c);
        }
        if (i3 < 0) {
            return null;
        }
        int o = o(f(i3) + 2);
        if (o == 65535) {
            int[] iArr = this.i;
            int f = f(i3);
            int i5 = this.a.getInt(f + 4);
            int o2 = o(f + 8);
            int p = p(f + 16);
            if (p == 2 || p == 3) {
                l(i5, o2);
                e = p == 2 ? e(20, o2) : b(20, o2);
            } else {
                d(iArr, i3);
                e = Bitmap.createBitmap(iArr, 64, 64, Bitmap.Config.ARGB_8888);
            }
            return e;
        }
        d(this.j, i3);
        d(this.i, g(o, this.c, this.b));
        while (true) {
            int[] iArr2 = this.j;
            if (i4 >= 4096) {
                return Bitmap.createBitmap(iArr2, 64, 64, Bitmap.Config.ARGB_8888);
            }
            int i6 = iArr2[i4];
            iArr2[i4] = (i6 & 16777215) | (((((i6 >>> 24) * (this.i[i4] & nm7.d4)) + nm7.K1) / nm7.d4) << 24);
            i4++;
        }
    }

    public final void i(int i, int i2) {
        Inflater inflater = this.d;
        inflater.reset();
        inflater.setInput(this.f, 20, i);
        int i3 = 0;
        while (i3 < i2) {
            try {
                int inflate = inflater.inflate(this.g, i3, i2 - i3);
                if (inflate == 0) {
                    throw a("Truncated DEFLATE stream");
                }
                i3 += inflate;
            } catch (DataFormatException e) {
                wa3.h("Damaged EPK3 DEFLATE stream", e);
                return;
            }
        }
        if (!inflater.finished() && (inflater.inflate(this.h, 0, 1) != 0 || !inflater.finished())) {
            throw a("Oversized DEFLATE stream");
        }
        if (inflater.getRemaining() != 0) {
            throw a("Trailing DEFLATE bytes");
        }
    }

    public final int j(int i) {
        int i2;
        int i3 = i + 18;
        if ((p(i3) & 128) == 0) {
            int o = o(i + 14) * (p(i3) & nm7.K1);
            return (p(i + 19) & 1) != 0 ? ((o * 7) + 7) / 8 : o;
        }
        int i4 = i + 8;
        if (o(i4) < 3) {
            throw a("Truncated compressed palette");
        }
        int o2 = o(this.a.getInt(i + 4));
        if (o2 == 0 || (i2 = o2 + 2) > o(i4)) {
            throw a("Invalid compressed palette");
        }
        return i2;
    }

    public final void k(int i, int i2) {
        byte[] bArr = this.f;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 3] = (byte) (i2 >>> 24);
    }

    public final void l(int i, int i2) {
        byte[] bArr = this.f;
        int i3 = i2 + 21;
        if (bArr.length < i3) {
            int length = bArr.length;
            while (length < i3) {
                length <<= 1;
            }
            this.f = new byte[length];
        }
        MappedByteBuffer mappedByteBuffer = this.a;
        mappedByteBuffer.position(i);
        mappedByteBuffer.get(this.f, 20, i2);
    }

    public final byte[] m(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long[] jArr = this.n;
            byte[][] bArr = this.o;
            int[] iArr = this.m;
            if (i2 >= 8) {
                if (bArr[i3] == null) {
                    bArr[i3] = new byte[TLObject.FLAG_12];
                }
                iArr[i3] = -1;
                c(i, bArr[i3]);
                iArr[i3] = i;
                long j = this.p + 1;
                this.p = j;
                jArr[i3] = j;
                return bArr[i3];
            }
            if (iArr[i2] == i) {
                long j2 = this.p + 1;
                this.p = j2;
                jArr[i2] = j2;
                return bArr[i2];
            }
            if (jArr[i2] < jArr[i3]) {
                i3 = i2;
            }
            i2++;
        }
    }

    public final int o(int i) {
        return this.a.getShort(i) & 65535;
    }

    public final int p(int i) {
        return this.a.get(i) & 255;
    }

    public final void q(int i, int i2) {
        if (i >= this.b || i == i2) {
            wa3.d("Invalid root reference");
            return;
        }
        int f = f(i);
        if (p(f + 16) <= 1 && p(f + 17) == 0 && o(f + 10) == 65535 && o(f + 12) == 65535) {
            return;
        }
        wa3.d("EPK3 dependency chains are forbidden");
    }
}
