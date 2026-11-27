// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dwc implements ewc {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, jn7.r1, jn7.C1, jn7.N1, jn7.Y1, jn7.m2, jn7.C2, jn7.T2, jn7.m3, 230, jn7.b4, jn7.B4, jn7.d5, jn7.H5, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final g84 a;
    public final x1c b;
    public final go9 c;
    public final int d;
    public final byte[] e;
    public final ey7 f;
    public final int g;
    public final ko4 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public dwc(g84 g84Var, x1c x1cVar, go9 go9Var) {
        this.a = g84Var;
        this.b = x1cVar;
        this.c = go9Var;
        int i = go9Var.b;
        int max = Math.max(1, i / 10);
        this.g = max;
        ey7 ey7Var = new ey7((byte[]) go9Var.f);
        ey7Var.t();
        int t = ey7Var.t();
        this.d = t;
        int i2 = go9Var.a;
        int i3 = go9Var.c;
        int i4 = (((i3 - (i2 << 2)) << 3) / (go9Var.d * i2)) + 1;
        if (t != i4) {
            throw hy7.a("Expected frames per block: " + i4 + "; got: " + t, null);
        }
        int g = gcc.g(max, t);
        this.e = new byte[g * i3];
        this.f = new ey7((t << 1) * i2 * g);
        int i5 = ((i3 * i) << 3) / t;
        jo4 jo4Var = new jo4();
        jo4Var.s = eg7.n("audio/raw");
        jo4Var.i = i5;
        jo4Var.j = i5;
        jo4Var.t = (max << 1) * i2;
        jo4Var.M = i2;
        int i6 = go9Var.e;
        jo4Var.N = i6 == 0 ? -1 : i6 << 2;
        jo4Var.O = i;
        jo4Var.P = 2;
        this.h = new ko4(jo4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0021, code lost:
    
        r9 = true;
     */
    @Override // ewc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(cb3 cb3Var, long j) {
        boolean z;
        byte[] bArr;
        int i;
        ey7 ey7Var;
        int i2;
        int i3 = this.k;
        go9 go9Var = this.c;
        boolean z2 = true;
        int i4 = i3 / (go9Var.a << 1);
        int i5 = this.g;
        int i6 = this.d;
        int g = gcc.g(i5 - i4, i6);
        int i7 = go9Var.c;
        int i8 = g * i7;
        if (j != 0) {
            z = false;
            while (true) {
                bArr = this.e;
                if (z || (i2 = this.i) >= i8) {
                    break;
                }
                int read = cb3Var.read(bArr, this.i, (int) Math.min(i8 - i2, j));
                if (read != -1) {
                    this.i += read;
                }
            }
            int i9 = this.i / i7;
            if (i9 > 0) {
                int i10 = 0;
                while (true) {
                    ey7Var = this.f;
                    if (i10 >= i9) {
                        break;
                    }
                    int i11 = 0;
                    while (true) {
                        int i12 = go9Var.a;
                        if (i11 < i12) {
                            byte[] bArr2 = ey7Var.a;
                            int i13 = (i10 * i7) + (i11 << 2);
                            int i14 = i13 + (i12 << 2);
                            int i15 = (i7 / i12) - 4;
                            boolean z3 = z2;
                            int i16 = (short) (((bArr[i13 + 1] & 255) << 8) | (bArr[i13] & 255));
                            int min = Math.min(bArr[i13 + 2] & 255, 88);
                            int[] iArr = n;
                            int i17 = iArr[min];
                            int i18 = (((i10 * i6) * i12) + i11) << 1;
                            bArr2[i18] = (byte) (i16 & jn7.d4);
                            int i19 = i9;
                            bArr2[i18 + 1] = (byte) (i16 >> 8);
                            int i20 = 0;
                            while (i20 < (i15 << 1)) {
                                byte b = bArr[i14 + (((i20 / 8) * i12) << 2) + ((i20 / 2) % 4)];
                                int i21 = i20;
                                int i22 = i21 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                                int i23 = ((((i22 & 7) << 1) + 1) * i17) >> 3;
                                if ((i22 & 8) != 0) {
                                    i23 = -i23;
                                }
                                i16 = gcc.i(i16 + i23, -32768, 32767);
                                i18 += i12 << 1;
                                bArr2[i18] = (byte) (i16 & jn7.d4);
                                bArr2[i18 + 1] = (byte) (i16 >> 8);
                                min = gcc.i(min + m[i22], 0, 88);
                                i10 = i10;
                                i17 = iArr[min];
                                i20 = i21 + 1;
                            }
                            i11++;
                            i9 = i19;
                            z2 = z3;
                        }
                    }
                    i10++;
                }
                int i24 = i9;
                int i25 = ((i6 * i24) << 1) * go9Var.a;
                ey7Var.N(0);
                ey7Var.M(i25);
                this.i -= i24 * i7;
                int i26 = ey7Var.c;
                this.b.e(i26, ey7Var);
                int i27 = this.k + i26;
                this.k = i27;
                if (i27 / (go9Var.a << 1) >= i5) {
                    d(i5);
                }
            }
            if (z && (i = this.k / (go9Var.a << 1)) > 0) {
                d(i);
            }
            return z;
        }
        z = true;
    }

    @Override // ewc
    public final void b(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    @Override // ewc
    public final void c(int i, long j) {
        iwc iwcVar = new iwc(this.c, this.d, i, j);
        this.a.m0(iwcVar);
        ko4 ko4Var = this.h;
        x1c x1cVar = this.b;
        x1cVar.g(ko4Var);
        x1cVar.d(iwcVar.e);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        go9 go9Var = this.c;
        long j3 = go9Var.b;
        String str = gcc.a;
        long b0 = j + gcc.b0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = (i << 1) * go9Var.a;
        this.b.a(b0, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }
}
