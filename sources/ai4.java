// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ai4 implements j74 {
    public l74 f;
    public wxb g;
    public ld7 i;
    public ci4 j;
    public int k;
    public int l;
    public zh4 m;
    public int n;
    public long o;
    public final byte[] a = new byte[42];
    public final xu7 b = new xu7(0, new byte[32768]);
    public final boolean c = false;
    public final boolean d = false;
    public final m11 e = new m11();
    public byte h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        ci4 ci4Var;
        int i;
        fv9 oc0Var;
        long j;
        long j2;
        boolean z;
        long I;
        long j3;
        byte b = this.h;
        boolean z2 = this.d;
        if (b == 0) {
            boolean z3 = !this.c;
            ((ja3) k74Var).f = 0;
            ja3 ja3Var = (ja3) k74Var;
            long f = ja3Var.f();
            ld7 a = qge.a(ja3Var, z3, z2);
            ja3Var.l((int) (ja3Var.f() - f), false);
            this.i = a;
            this.h = (byte) 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (b == 1) {
            ((ja3) k74Var).d(bArr, 0, bArr.length, false);
            ((ja3) k74Var).f = 0;
            this.h = (byte) 2;
            return 0;
        }
        int i2 = 4;
        int i3 = 3;
        if (b == 2) {
            xu7 xu7Var = new xu7(4);
            ((ja3) k74Var).c(xu7Var.a, 0, 4, false);
            if (xu7Var.C() != 1716281667) {
                throw av7.a("Failed to read FLAC stream marker.", null);
            }
            this.h = (byte) 3;
            return 0;
        }
        int i4 = 6;
        if (b == 3) {
            boolean z4 = false;
            ci4 ci4Var2 = this.j;
            boolean z5 = false;
            while (!z5) {
                ((ja3) k74Var).f = z4 ? 1 : 0;
                byte[] bArr2 = new byte[i2];
                qd1 qd1Var = new qd1(i2, bArr2);
                ja3 ja3Var2 = (ja3) k74Var;
                ja3Var2.d(bArr2, z4 ? 1 : 0, i2, z4);
                boolean e = qd1Var.e();
                int f2 = qd1Var.f(r10);
                int f3 = qd1Var.f(24) + i2;
                if (f2 == 0) {
                    byte[] bArr3 = new byte[38];
                    ja3Var2.c(bArr3, z4 ? 1 : 0, 38, z4);
                    ci4Var2 = new ci4(i2, bArr3);
                } else {
                    if (ci4Var2 == null) {
                        sc8.e();
                        return z4 ? 1 : 0;
                    }
                    ld7 ld7Var = ci4Var2.l;
                    if (f2 == i3) {
                        xu7 xu7Var2 = new xu7(f3);
                        ja3Var2.c(xu7Var2.a, z4 ? 1 : 0, f3, z4);
                        ci4Var2 = new ci4(ci4Var2.a, ci4Var2.b, ci4Var2.c, ci4Var2.d, ci4Var2.e, ci4Var2.g, ci4Var2.h, ci4Var2.j, qge.b(xu7Var2), ci4Var2.l);
                    } else {
                        if (f2 == i2) {
                            xu7 xu7Var3 = new xu7(f3);
                            ja3Var2.c(xu7Var3.a, 0, f3, false);
                            xu7Var3.O(i2);
                            ld7 a2 = zjc.a(Arrays.asList((String[]) aye.b(xu7Var3, false, false).b));
                            if (ld7Var != null) {
                                a2 = ld7Var.b(a2);
                            }
                            ci4Var = new ci4(ci4Var2.a, ci4Var2.b, ci4Var2.c, ci4Var2.d, ci4Var2.e, ci4Var2.g, ci4Var2.h, ci4Var2.j, ci4Var2.k, a2);
                        } else {
                            z4 = false;
                            z4 = false;
                            if (f2 != i4) {
                                ja3Var2.l(f3, false);
                            } else if (z2) {
                                ja3Var2.l(f3, false);
                            } else {
                                xu7 xu7Var4 = new xu7(f3);
                                ja3Var2.c(xu7Var4.a, 0, f3, false);
                                xu7Var4.O(4);
                                ld7 ld7Var2 = new ld7(mm5.u(ba8.d(xu7Var4)));
                                if (ld7Var != null) {
                                    ld7Var2 = ld7Var.b(ld7Var2);
                                }
                                ci4Var = new ci4(ci4Var2.a, ci4Var2.b, ci4Var2.c, ci4Var2.d, ci4Var2.e, ci4Var2.g, ci4Var2.h, ci4Var2.j, ci4Var2.k, ld7Var2);
                            }
                        }
                        ci4Var2 = ci4Var;
                    }
                    z4 = false;
                }
                String str = g8c.a;
                this.j = ci4Var2;
                z5 = e;
                i2 = 4;
                i3 = 3;
                r10 = 7;
                i4 = 6;
            }
            this.j.getClass();
            this.k = Math.max(this.j.c, 6);
            fm4 c = this.j.c(bArr, this.i);
            wxb wxbVar = this.g;
            String str2 = g8c.a;
            em4 a3 = c.a();
            a3.r = ud7.n("audio/flac");
            yjb.v(a3, wxbVar);
            this.g.d(this.j.b());
            this.h = (byte) 4;
            return 0;
        }
        long j4 = 0;
        if (b == 4) {
            ((ja3) k74Var).f = 0;
            xu7 xu7Var5 = new xu7(2);
            ja3 ja3Var3 = (ja3) k74Var;
            ja3Var3.d(xu7Var5.a, 0, 2, false);
            int H = xu7Var5.H();
            if ((H >> 2) != 16382) {
                ja3Var3.f = 0;
                throw av7.a("First frame does not start with sync code.", null);
            }
            ja3Var3.f = 0;
            this.l = H;
            l74 l74Var = this.f;
            String str3 = g8c.a;
            long j5 = ja3Var3.d;
            long j6 = ja3Var3.c;
            this.j.getClass();
            ci4 ci4Var3 = this.j;
            lv6 lv6Var = ci4Var3.k;
            if (lv6Var != null && ((long[]) lv6Var.b).length > 0) {
                oc0Var = new oc0(ci4Var3, j5, (byte) 1);
                i = 0;
            } else if (j6 == -1 || ci4Var3.j <= 0) {
                i = 0;
                oc0Var = new oc0(ci4Var3.b());
            } else {
                int i5 = this.l;
                int i6 = ci4Var3.c;
                kx3 kx3Var = new kx3(ci4Var3, (byte) 19);
                kp kpVar = new kp(ci4Var3, i5);
                long b2 = ci4Var3.b();
                long j7 = ci4Var3.j;
                int i7 = ci4Var3.d;
                i = 0;
                if (i7 > 0) {
                    j = ((i7 + i6) / 2) + 1;
                } else {
                    int i8 = ci4Var3.a;
                    j = 64 + (((((i8 != ci4Var3.b || i8 <= 0) ? 4096L : i8) * ci4Var3.g) * ci4Var3.h) / 8);
                }
                zh4 zh4Var = new zh4(kx3Var, kpVar, b2, j7, j5, j6, j, Math.max(6, i6));
                this.m = zh4Var;
                oc0Var = zh4Var.a;
            }
            l74Var.g0(oc0Var);
            this.h = (byte) 5;
            return i;
        }
        if (b != 5) {
            sdb.a();
            return 0;
        }
        this.g.getClass();
        this.j.getClass();
        zh4 zh4Var2 = this.m;
        if (zh4Var2 != null && zh4Var2.c != null) {
            return zh4Var2.a((ja3) k74Var, m11Var);
        }
        if (this.o == -1) {
            ci4 ci4Var4 = this.j;
            ((ja3) k74Var).f = 0;
            ja3 ja3Var4 = (ja3) k74Var;
            ja3Var4.a(1, false);
            byte[] bArr4 = new byte[1];
            ja3Var4.d(bArr4, 0, 1, false);
            Object[] objArr = (bArr4[0] & 1) == 1;
            ja3Var4.a(2, false);
            r10 = objArr == true ? 7 : 6;
            xu7 xu7Var6 = new xu7(r10);
            byte[] bArr5 = xu7Var6.a;
            int i9 = 0;
            while (i9 < r10) {
                int i10 = ja3Var4.i(i9, r10 - i9, bArr5);
                if (i10 == -1) {
                    break;
                }
                i9 += i10;
            }
            xu7Var6.M(i9);
            ja3Var4.f = 0;
            try {
                I = xu7Var6.I();
                if (objArr == false) {
                    I *= ci4Var4.b;
                }
                j3 = ci4Var4.j;
            } catch (NumberFormatException unused) {
            }
            if (j3 == 0 || I <= j3) {
                j4 = I;
                if (r3) {
                    throw av7.a(null, null);
                }
                this.o = j4;
            }
            r3 = false;
            if (r3) {
            }
        } else {
            xu7 xu7Var7 = this.b;
            int i11 = xu7Var7.c;
            if (i11 < 32768) {
                int read = ((ja3) k74Var).read(xu7Var7.a, i11, 32768 - i11);
                r3 = read == -1;
                if (!r3) {
                    xu7Var7.M(i11 + read);
                } else if (xu7Var7.a() == 0) {
                    long j8 = this.o * 1000000;
                    ci4 ci4Var5 = this.j;
                    String str4 = g8c.a;
                    this.g.a(j8 / ci4Var5.e, 1, this.n, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i12 = xu7Var7.b;
            int i13 = this.n;
            int i14 = this.k;
            if (i13 < i14) {
                xu7Var7.O(Math.min(i14 - i13, xu7Var7.a()));
            }
            this.j.getClass();
            int i15 = xu7Var7.b;
            while (true) {
                int i16 = xu7Var7.c - 16;
                m11 m11Var2 = this.e;
                if (i15 <= i16) {
                    xu7Var7.N(i15);
                    if (nge.a(xu7Var7, this.j, this.l, m11Var2)) {
                        xu7Var7.N(i15);
                        j2 = m11Var2.a;
                        break;
                    }
                    i15++;
                } else {
                    if (r3) {
                        while (true) {
                            int i17 = xu7Var7.c;
                            if (i15 > i17 - this.k) {
                                xu7Var7.N(i17);
                                break;
                            }
                            xu7Var7.N(i15);
                            try {
                                z = nge.a(xu7Var7, this.j, this.l, m11Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z = false;
                            }
                            if (xu7Var7.b > xu7Var7.c) {
                                z = false;
                            }
                            if (z) {
                                xu7Var7.N(i15);
                                j2 = m11Var2.a;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        xu7Var7.N(i15);
                    }
                    j2 = -1;
                }
            }
            int i18 = xu7Var7.b - i12;
            xu7Var7.N(i12);
            this.g.e(i18, xu7Var7);
            int i19 = this.n + i18;
            this.n = i19;
            if (j2 != -1) {
                long j9 = this.o * 1000000;
                ci4 ci4Var6 = this.j;
                String str5 = g8c.a;
                this.g.a(j9 / ci4Var6.e, 1, i19, 0, null);
                this.n = 0;
                this.o = j2;
            }
            int length = xu7Var7.a.length - xu7Var7.c;
            if (xu7Var7.a() < 16 && length < 16) {
                int a4 = xu7Var7.a();
                byte[] bArr6 = xu7Var7.a;
                System.arraycopy(bArr6, xu7Var7.b, bArr6, 0, a4);
                xu7Var7.N(0);
                xu7Var7.M(a4);
            }
        }
        return 0;
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        ja3 ja3Var = (ja3) k74Var;
        qge.a(ja3Var, false, false);
        xu7 xu7Var = new xu7(4);
        ja3Var.d(xu7Var.a, 0, 4, false);
        return xu7Var.C() == 1716281667;
    }

    @Override // j74
    public final void d(long j, long j2) {
        if (j == 0) {
            this.h = (byte) 0;
        } else {
            zh4 zh4Var = this.m;
            if (zh4Var != null) {
                zh4Var.d(j2);
            }
        }
        this.o = j2 != 0 ? -1L : 0L;
        this.n = 0;
        this.b.K(0);
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        this.f = l74Var;
        this.g = l74Var.S(0, 1);
        l74Var.z();
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
