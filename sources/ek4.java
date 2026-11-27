// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ek4 implements e84 {
    public g84 f;
    public x1c g;
    public vf7 i;
    public gk4 j;
    public int k;
    public int l;
    public dk4 m;
    public int n;
    public long o;
    public final byte[] a = new byte[42];
    public final ey7 b = new ey7(0, new byte[32768]);
    public final boolean c = false;
    public final boolean d = false;
    public final v11 e = new v11();
    public byte h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
        gk4 gk4Var;
        int i;
        zy9 qc0Var;
        long j;
        long j2;
        boolean z;
        long I;
        long j3;
        byte b = this.h;
        boolean z2 = this.d;
        if (b == 0) {
            boolean z3 = !this.c;
            ((cb3) f84Var).f = 0;
            cb3 cb3Var = (cb3) f84Var;
            long e = cb3Var.e();
            vf7 a = lle.a(cb3Var, z3, z2);
            cb3Var.l((int) (cb3Var.e() - e), false);
            this.i = a;
            this.h = (byte) 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (b == 1) {
            ((cb3) f84Var).d(bArr, 0, bArr.length, false);
            ((cb3) f84Var).f = 0;
            this.h = (byte) 2;
            return 0;
        }
        int i2 = 4;
        int i3 = 3;
        if (b == 2) {
            ey7 ey7Var = new ey7(4);
            ((cb3) f84Var).c(ey7Var.a, 0, 4, false);
            if (ey7Var.C() != 1716281667) {
                throw hy7.a("Failed to read FLAC stream marker.", null);
            }
            this.h = (byte) 3;
            return 0;
        }
        int i4 = 6;
        if (b == 3) {
            boolean z4 = false;
            gk4 gk4Var2 = this.j;
            boolean z5 = false;
            while (!z5) {
                ((cb3) f84Var).f = z4 ? 1 : 0;
                byte[] bArr2 = new byte[i2];
                zd1 zd1Var = new zd1(i2, bArr2);
                cb3 cb3Var2 = (cb3) f84Var;
                cb3Var2.d(bArr2, z4 ? 1 : 0, i2, z4);
                boolean e2 = zd1Var.e();
                int f = zd1Var.f(r10);
                int f2 = zd1Var.f(24) + i2;
                if (f == 0) {
                    byte[] bArr3 = new byte[38];
                    cb3Var2.c(bArr3, z4 ? 1 : 0, 38, z4);
                    gk4Var2 = new gk4(i2, bArr3);
                } else {
                    if (gk4Var2 == null) {
                        iy8.d();
                        return z4 ? 1 : 0;
                    }
                    vf7 vf7Var = gk4Var2.l;
                    if (f == i3) {
                        ey7 ey7Var2 = new ey7(f2);
                        cb3Var2.c(ey7Var2.a, z4 ? 1 : 0, f2, z4);
                        gk4Var2 = new gk4(gk4Var2.a, gk4Var2.b, gk4Var2.c, gk4Var2.d, gk4Var2.e, gk4Var2.g, gk4Var2.h, gk4Var2.j, lle.b(ey7Var2), gk4Var2.l);
                    } else {
                        if (f == i2) {
                            ey7 ey7Var3 = new ey7(f2);
                            cb3Var2.c(ey7Var3.a, 0, f2, false);
                            ey7Var3.O(i2);
                            vf7 a2 = moc.a(Arrays.asList((String[]) s2f.b(ey7Var3, false, false).b));
                            if (vf7Var != null) {
                                a2 = vf7Var.b(a2);
                            }
                            gk4Var = new gk4(gk4Var2.a, gk4Var2.b, gk4Var2.c, gk4Var2.d, gk4Var2.e, gk4Var2.g, gk4Var2.h, gk4Var2.j, gk4Var2.k, a2);
                        } else {
                            z4 = false;
                            z4 = false;
                            if (f != i4) {
                                cb3Var2.l(f2, false);
                            } else if (z2) {
                                cb3Var2.l(f2, false);
                            } else {
                                ey7 ey7Var4 = new ey7(f2);
                                cb3Var2.c(ey7Var4.a, 0, f2, false);
                                ey7Var4.O(4);
                                vf7 vf7Var2 = new vf7(po5.u(rd8.d(ey7Var4)));
                                if (vf7Var != null) {
                                    vf7Var2 = vf7Var.b(vf7Var2);
                                }
                                gk4Var = new gk4(gk4Var2.a, gk4Var2.b, gk4Var2.c, gk4Var2.d, gk4Var2.e, gk4Var2.g, gk4Var2.h, gk4Var2.j, gk4Var2.k, vf7Var2);
                            }
                        }
                        gk4Var2 = gk4Var;
                    }
                    z4 = false;
                }
                String str = gcc.a;
                this.j = gk4Var2;
                z5 = e2;
                i2 = 4;
                i3 = 3;
                r10 = 7;
                i4 = 6;
            }
            this.j.getClass();
            this.k = Math.max(this.j.c, 6);
            ko4 c = this.j.c(bArr, this.i);
            x1c x1cVar = this.g;
            String str2 = gcc.a;
            jo4 a3 = c.a();
            a3.r = eg7.n("audio/flac");
            xnb.v(a3, x1cVar);
            this.g.d(this.j.b());
            this.h = (byte) 4;
            return 0;
        }
        long j4 = 0;
        if (b == 4) {
            ((cb3) f84Var).f = 0;
            ey7 ey7Var5 = new ey7(2);
            cb3 cb3Var3 = (cb3) f84Var;
            cb3Var3.d(ey7Var5.a, 0, 2, false);
            int H = ey7Var5.H();
            if ((H >> 2) != 16382) {
                cb3Var3.f = 0;
                throw hy7.a("First frame does not start with sync code.", null);
            }
            cb3Var3.f = 0;
            this.l = H;
            g84 g84Var = this.f;
            String str3 = gcc.a;
            long j5 = cb3Var3.d;
            long j6 = cb3Var3.c;
            this.j.getClass();
            gk4 gk4Var3 = this.j;
            lh2 lh2Var = gk4Var3.k;
            if (lh2Var != null && ((long[]) lh2Var.b).length > 0) {
                qc0Var = new qc0(gk4Var3, j5, (byte) 1);
                i = 0;
            } else if (j6 == -1 || gk4Var3.j <= 0) {
                i = 0;
                qc0Var = new qc0(gk4Var3.b());
            } else {
                int i5 = this.l;
                int i6 = gk4Var3.c;
                lu3 lu3Var = new lu3(gk4Var3, (byte) 22);
                lp lpVar = new lp(gk4Var3, i5);
                long b2 = gk4Var3.b();
                long j7 = gk4Var3.j;
                int i7 = gk4Var3.d;
                i = 0;
                if (i7 > 0) {
                    j = ((i7 + i6) / 2) + 1;
                } else {
                    int i8 = gk4Var3.a;
                    j = 64 + (((((i8 != gk4Var3.b || i8 <= 0) ? 4096L : i8) * gk4Var3.g) * gk4Var3.h) / 8);
                }
                dk4 dk4Var = new dk4(lu3Var, lpVar, b2, j7, j5, j6, j, Math.max(6, i6));
                this.m = dk4Var;
                qc0Var = dk4Var.a;
            }
            g84Var.m0(qc0Var);
            this.h = (byte) 5;
            return i;
        }
        if (b != 5) {
            grb.g();
            return 0;
        }
        this.g.getClass();
        this.j.getClass();
        dk4 dk4Var2 = this.m;
        if (dk4Var2 != null && dk4Var2.c != null) {
            return dk4Var2.a((cb3) f84Var, v11Var);
        }
        if (this.o == -1) {
            gk4 gk4Var4 = this.j;
            ((cb3) f84Var).f = 0;
            cb3 cb3Var4 = (cb3) f84Var;
            cb3Var4.a(1, false);
            byte[] bArr4 = new byte[1];
            cb3Var4.d(bArr4, 0, 1, false);
            Object[] objArr = (bArr4[0] & 1) == 1;
            cb3Var4.a(2, false);
            r10 = objArr == true ? 7 : 6;
            ey7 ey7Var6 = new ey7(r10);
            byte[] bArr5 = ey7Var6.a;
            int i9 = 0;
            while (i9 < r10) {
                int i10 = cb3Var4.i(i9, r10 - i9, bArr5);
                if (i10 == -1) {
                    break;
                }
                i9 += i10;
            }
            ey7Var6.M(i9);
            cb3Var4.f = 0;
            try {
                I = ey7Var6.I();
                if (objArr == false) {
                    I *= gk4Var4.b;
                }
                j3 = gk4Var4.j;
            } catch (NumberFormatException unused) {
            }
            if (j3 == 0 || I <= j3) {
                j4 = I;
                if (r3) {
                    throw hy7.a(null, null);
                }
                this.o = j4;
            }
            r3 = false;
            if (r3) {
            }
        } else {
            ey7 ey7Var7 = this.b;
            int i11 = ey7Var7.c;
            if (i11 < 32768) {
                int read = ((cb3) f84Var).read(ey7Var7.a, i11, 32768 - i11);
                r3 = read == -1;
                if (!r3) {
                    ey7Var7.M(i11 + read);
                } else if (ey7Var7.a() == 0) {
                    long j8 = this.o * 1000000;
                    gk4 gk4Var5 = this.j;
                    String str4 = gcc.a;
                    this.g.a(j8 / gk4Var5.e, 1, this.n, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i12 = ey7Var7.b;
            int i13 = this.n;
            int i14 = this.k;
            if (i13 < i14) {
                ey7Var7.O(Math.min(i14 - i13, ey7Var7.a()));
            }
            this.j.getClass();
            int i15 = ey7Var7.b;
            while (true) {
                int i16 = ey7Var7.c - 16;
                v11 v11Var2 = this.e;
                if (i15 <= i16) {
                    ey7Var7.N(i15);
                    if (hle.a(ey7Var7, this.j, this.l, v11Var2)) {
                        ey7Var7.N(i15);
                        j2 = v11Var2.a;
                        break;
                    }
                    i15++;
                } else {
                    if (r3) {
                        while (true) {
                            int i17 = ey7Var7.c;
                            if (i15 > i17 - this.k) {
                                ey7Var7.N(i17);
                                break;
                            }
                            ey7Var7.N(i15);
                            try {
                                z = hle.a(ey7Var7, this.j, this.l, v11Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z = false;
                            }
                            if (ey7Var7.b > ey7Var7.c) {
                                z = false;
                            }
                            if (z) {
                                ey7Var7.N(i15);
                                j2 = v11Var2.a;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        ey7Var7.N(i15);
                    }
                    j2 = -1;
                }
            }
            int i18 = ey7Var7.b - i12;
            ey7Var7.N(i12);
            this.g.e(i18, ey7Var7);
            int i19 = this.n + i18;
            this.n = i19;
            if (j2 != -1) {
                long j9 = this.o * 1000000;
                gk4 gk4Var6 = this.j;
                String str5 = gcc.a;
                this.g.a(j9 / gk4Var6.e, 1, i19, 0, null);
                this.n = 0;
                this.o = j2;
            }
            int length = ey7Var7.a.length - ey7Var7.c;
            if (ey7Var7.a() < 16 && length < 16) {
                int a4 = ey7Var7.a();
                byte[] bArr6 = ey7Var7.a;
                System.arraycopy(bArr6, ey7Var7.b, bArr6, 0, a4);
                ey7Var7.N(0);
                ey7Var7.M(a4);
            }
        }
        return 0;
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        cb3 cb3Var = (cb3) f84Var;
        lle.a(cb3Var, false, false);
        ey7 ey7Var = new ey7(4);
        cb3Var.d(ey7Var.a, 0, 4, false);
        return ey7Var.C() == 1716281667;
    }

    @Override // e84
    public final void d(long j, long j2) {
        if (j == 0) {
            this.h = (byte) 0;
        } else {
            dk4 dk4Var = this.m;
            if (dk4Var != null) {
                dk4Var.d(j2);
            }
        }
        this.o = j2 != 0 ? -1L : 0L;
        this.n = 0;
        this.b.K(0);
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.f = g84Var;
        this.g = g84Var.e0(0, 1);
        g84Var.D();
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
