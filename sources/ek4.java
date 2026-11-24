// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ek4 implements s84 {
    public u84 f;
    public yzb g;
    public nf7 i;
    public gk4 j;
    public int k;
    public int l;
    public dk4 m;
    public int n;
    public long o;
    public final byte[] a = new byte[42];
    public final yw7 b = new yw7(0, new byte[32768]);
    public final boolean c = false;
    public final boolean d = false;
    public final u21 e = new u21();
    public byte h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
        gk4 gk4Var;
        int i;
        ix9 od0Var;
        long j;
        long j2;
        boolean z;
        long I;
        long j3;
        byte b = this.h;
        boolean z2 = this.d;
        if (b == 0) {
            boolean z3 = !this.c;
            ((vb3) t84Var).f = 0;
            vb3 vb3Var = (vb3) t84Var;
            long f = vb3Var.f();
            nf7 a = rie.a(vb3Var, z3, z2);
            vb3Var.m((int) (vb3Var.f() - f), false);
            this.i = a;
            this.h = (byte) 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (b == 1) {
            ((vb3) t84Var).d(bArr, 0, bArr.length, false);
            ((vb3) t84Var).f = 0;
            this.h = (byte) 2;
            return 0;
        }
        int i2 = 4;
        int i3 = 3;
        if (b == 2) {
            yw7 yw7Var = new yw7(4);
            ((vb3) t84Var).c(yw7Var.a, 0, 4, false);
            if (yw7Var.C() != 1716281667) {
                throw bx7.a("Failed to read FLAC stream marker.", null);
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
                ((vb3) t84Var).f = z4 ? 1 : 0;
                byte[] bArr2 = new byte[i2];
                ye1 ye1Var = new ye1(i2, bArr2);
                vb3 vb3Var2 = (vb3) t84Var;
                vb3Var2.d(bArr2, z4 ? 1 : 0, i2, z4);
                boolean e = ye1Var.e();
                int f2 = ye1Var.f(r10);
                int f3 = ye1Var.f(24) + i2;
                if (f2 == 0) {
                    byte[] bArr3 = new byte[38];
                    vb3Var2.c(bArr3, z4 ? 1 : 0, 38, z4);
                    gk4Var2 = new gk4(i2, bArr3);
                } else {
                    if (gk4Var2 == null) {
                        i98.g();
                        return z4 ? 1 : 0;
                    }
                    nf7 nf7Var = gk4Var2.l;
                    if (f2 == i3) {
                        yw7 yw7Var2 = new yw7(f3);
                        vb3Var2.c(yw7Var2.a, z4 ? 1 : 0, f3, z4);
                        gk4Var2 = new gk4(gk4Var2.a, gk4Var2.b, gk4Var2.c, gk4Var2.d, gk4Var2.e, gk4Var2.g, gk4Var2.h, gk4Var2.j, rie.b(yw7Var2), gk4Var2.l);
                    } else {
                        if (f2 == i2) {
                            yw7 yw7Var3 = new yw7(f3);
                            vb3Var2.c(yw7Var3.a, 0, f3, false);
                            yw7Var3.O(i2);
                            nf7 a2 = zlc.a(Arrays.asList((String[]) c0f.b(yw7Var3, false, false).b));
                            if (nf7Var != null) {
                                a2 = nf7Var.b(a2);
                            }
                            gk4Var = new gk4(gk4Var2.a, gk4Var2.b, gk4Var2.c, gk4Var2.d, gk4Var2.e, gk4Var2.g, gk4Var2.h, gk4Var2.j, gk4Var2.k, a2);
                        } else {
                            z4 = false;
                            z4 = false;
                            if (f2 != i4) {
                                vb3Var2.m(f3, false);
                            } else if (z2) {
                                vb3Var2.m(f3, false);
                            } else {
                                yw7 yw7Var4 = new yw7(f3);
                                vb3Var2.c(yw7Var4.a, 0, f3, false);
                                yw7Var4.O(4);
                                nf7 nf7Var2 = new nf7(mo5.u(cc8.d(yw7Var4)));
                                if (nf7Var != null) {
                                    nf7Var2 = nf7Var.b(nf7Var2);
                                }
                                gk4Var = new gk4(gk4Var2.a, gk4Var2.b, gk4Var2.c, gk4Var2.d, gk4Var2.e, gk4Var2.g, gk4Var2.h, gk4Var2.j, gk4Var2.k, nf7Var2);
                            }
                        }
                        gk4Var2 = gk4Var;
                    }
                    z4 = false;
                }
                String str = hac.a;
                this.j = gk4Var2;
                z5 = e;
                i2 = 4;
                i3 = 3;
                r10 = 7;
                i4 = 6;
            }
            this.j.getClass();
            this.k = Math.max(this.j.c, 6);
            go4 c = this.j.c(bArr, this.i);
            yzb yzbVar = this.g;
            String str2 = hac.a;
            fo4 a3 = c.a();
            a3.r = wf7.n("audio/flac");
            mlb.w(a3, yzbVar);
            this.g.d(this.j.b());
            this.h = (byte) 4;
            return 0;
        }
        long j4 = 0;
        if (b == 4) {
            ((vb3) t84Var).f = 0;
            yw7 yw7Var5 = new yw7(2);
            vb3 vb3Var3 = (vb3) t84Var;
            vb3Var3.d(yw7Var5.a, 0, 2, false);
            int H = yw7Var5.H();
            if ((H >> 2) != 16382) {
                vb3Var3.f = 0;
                throw bx7.a("First frame does not start with sync code.", null);
            }
            vb3Var3.f = 0;
            this.l = H;
            u84 u84Var = this.f;
            String str3 = hac.a;
            long j5 = vb3Var3.d;
            long j6 = vb3Var3.c;
            this.j.getClass();
            gk4 gk4Var3 = this.j;
            lx6 lx6Var = gk4Var3.k;
            if (lx6Var != null && ((long[]) lx6Var.b).length > 0) {
                od0Var = new od0(gk4Var3, j5, (byte) 1);
                i = 0;
            } else if (j6 == -1 || gk4Var3.j <= 0) {
                i = 0;
                od0Var = new od0(gk4Var3.b());
            } else {
                int i5 = this.l;
                int i6 = gk4Var3.c;
                yu3 yu3Var = new yu3(gk4Var3, (byte) 22);
                kq kqVar = new kq(gk4Var3, i5);
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
                dk4 dk4Var = new dk4(yu3Var, kqVar, b2, j7, j5, j6, j, Math.max(6, i6));
                this.m = dk4Var;
                od0Var = dk4Var.a;
            }
            u84Var.f0(od0Var);
            this.h = (byte) 5;
            return i;
        }
        if (b != 5) {
            rjb.h();
            return 0;
        }
        this.g.getClass();
        this.j.getClass();
        dk4 dk4Var2 = this.m;
        if (dk4Var2 != null && dk4Var2.c != null) {
            return dk4Var2.a((vb3) t84Var, u21Var);
        }
        if (this.o == -1) {
            gk4 gk4Var4 = this.j;
            ((vb3) t84Var).f = 0;
            vb3 vb3Var4 = (vb3) t84Var;
            vb3Var4.a(1, false);
            byte[] bArr4 = new byte[1];
            vb3Var4.d(bArr4, 0, 1, false);
            Object[] objArr = (bArr4[0] & 1) == 1;
            vb3Var4.a(2, false);
            r10 = objArr == true ? 7 : 6;
            yw7 yw7Var6 = new yw7(r10);
            byte[] bArr5 = yw7Var6.a;
            int i9 = 0;
            while (i9 < r10) {
                int h = vb3Var4.h(i9, r10 - i9, bArr5);
                if (h == -1) {
                    break;
                }
                i9 += h;
            }
            yw7Var6.M(i9);
            vb3Var4.f = 0;
            try {
                I = yw7Var6.I();
                if (objArr == false) {
                    I *= gk4Var4.b;
                }
                j3 = gk4Var4.j;
            } catch (NumberFormatException unused) {
            }
            if (j3 == 0 || I <= j3) {
                j4 = I;
                if (r3) {
                    throw bx7.a(null, null);
                }
                this.o = j4;
            }
            r3 = false;
            if (r3) {
            }
        } else {
            yw7 yw7Var7 = this.b;
            int i10 = yw7Var7.c;
            if (i10 < 32768) {
                int read = ((vb3) t84Var).read(yw7Var7.a, i10, 32768 - i10);
                r3 = read == -1;
                if (!r3) {
                    yw7Var7.M(i10 + read);
                } else if (yw7Var7.a() == 0) {
                    long j8 = this.o * 1000000;
                    gk4 gk4Var5 = this.j;
                    String str4 = hac.a;
                    this.g.a(j8 / gk4Var5.e, 1, this.n, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i11 = yw7Var7.b;
            int i12 = this.n;
            int i13 = this.k;
            if (i12 < i13) {
                yw7Var7.O(Math.min(i13 - i12, yw7Var7.a()));
            }
            this.j.getClass();
            int i14 = yw7Var7.b;
            while (true) {
                int i15 = yw7Var7.c - 16;
                u21 u21Var2 = this.e;
                if (i14 <= i15) {
                    yw7Var7.N(i14);
                    if (oie.a(yw7Var7, this.j, this.l, u21Var2)) {
                        yw7Var7.N(i14);
                        j2 = u21Var2.a;
                        break;
                    }
                    i14++;
                } else {
                    if (r3) {
                        while (true) {
                            int i16 = yw7Var7.c;
                            if (i14 > i16 - this.k) {
                                yw7Var7.N(i16);
                                break;
                            }
                            yw7Var7.N(i14);
                            try {
                                z = oie.a(yw7Var7, this.j, this.l, u21Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z = false;
                            }
                            if (yw7Var7.b > yw7Var7.c) {
                                z = false;
                            }
                            if (z) {
                                yw7Var7.N(i14);
                                j2 = u21Var2.a;
                                break;
                            }
                            i14++;
                        }
                    } else {
                        yw7Var7.N(i14);
                    }
                    j2 = -1;
                }
            }
            int i17 = yw7Var7.b - i11;
            yw7Var7.N(i11);
            this.g.e(i17, yw7Var7);
            int i18 = this.n + i17;
            this.n = i18;
            if (j2 != -1) {
                long j9 = this.o * 1000000;
                gk4 gk4Var6 = this.j;
                String str5 = hac.a;
                this.g.a(j9 / gk4Var6.e, 1, i18, 0, null);
                this.n = 0;
                this.o = j2;
            }
            int length = yw7Var7.a.length - yw7Var7.c;
            if (yw7Var7.a() < 16 && length < 16) {
                int a4 = yw7Var7.a();
                byte[] bArr6 = yw7Var7.a;
                System.arraycopy(bArr6, yw7Var7.b, bArr6, 0, a4);
                yw7Var7.N(0);
                yw7Var7.M(a4);
            }
        }
        return 0;
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        vb3 vb3Var = (vb3) t84Var;
        rie.a(vb3Var, false, false);
        yw7 yw7Var = new yw7(4);
        vb3Var.d(yw7Var.a, 0, 4, false);
        return yw7Var.C() == 1716281667;
    }

    @Override // s84
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

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.f = u84Var;
        this.g = u84Var.c0(0, 1);
        u84Var.B();
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
