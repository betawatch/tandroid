// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hr7 implements e84 {
    public g84 a;
    public ucb b;
    public boolean c;

    /* JADX WARN: Removed duplicated region for block: B:60:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
        byte b;
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            cb3 cb3Var = (cb3) f84Var;
            if (!g(cb3Var)) {
                throw hy7.a("Failed to determine bitstream type", null);
            }
            cb3Var.f = 0;
        }
        if (!this.c) {
            x1c e0 = this.a.e0(0, 1);
            this.a.D();
            ucb ucbVar = this.b;
            ucbVar.c = this.a;
            ucbVar.b = e0;
            ucbVar.d(true);
            this.c = true;
        }
        ucb ucbVar2 = this.b;
        jr7 jr7Var = ucbVar2.a;
        ey7 ey7Var = jr7Var.b;
        ucbVar2.b.getClass();
        String str = gcc.a;
        byte b2 = ucbVar2.h;
        if (b2 != 0) {
            if (b2 == 1) {
                ((cb3) f84Var).l((int) ucbVar2.f, false);
                ucbVar2.h = (byte) 2;
                return 0;
            }
            if (b2 != 2) {
                if (b2 == 3) {
                    return -1;
                }
                grb.g();
                return 0;
            }
            cb3 cb3Var2 = (cb3) f84Var;
            long p = ucbVar2.d.p(cb3Var2);
            if (p >= 0) {
                v11Var.a = p;
                return 1;
            }
            if (p < -1) {
                ucbVar2.a(-(p + 2));
            }
            if (!ucbVar2.l) {
                zy9 C = ucbVar2.d.C();
                C.getClass();
                ucbVar2.c.m0(C);
                ucbVar2.b.d(C.h());
                ucbVar2.l = true;
            }
            if (ucbVar2.k <= 0 && !jr7Var.b(cb3Var2)) {
                ucbVar2.h = (byte) 3;
                return -1;
            }
            ucbVar2.k = 0L;
            long b3 = ucbVar2.b(ey7Var);
            if (b3 >= 0) {
                long j = ucbVar2.g;
                if (j + b3 >= ucbVar2.e) {
                    ucbVar2.b.e(ey7Var.c, ey7Var);
                    ucbVar2.b.a((j * 1000000) / ucbVar2.i, 1, ey7Var.c, 0, null);
                    ucbVar2.e = -1L;
                }
            }
            ucbVar2.g += b3;
            return 0;
        }
        while (true) {
            cb3 cb3Var3 = (cb3) f84Var;
            if (!jr7Var.b(cb3Var3)) {
                ucbVar2.h = (byte) 3;
                return -1;
            }
            long j2 = cb3Var3.d;
            long j3 = ucbVar2.f;
            ucbVar2.k = j2 - j3;
            if (ucbVar2.c(ey7Var, j3, ucbVar2.j)) {
                ucbVar2.f = ((cb3) f84Var).d;
            } else {
                ko4 ko4Var = (ko4) ucbVar2.j.b;
                ucbVar2.i = ko4Var.P;
                if (!ucbVar2.m) {
                    ucbVar2.b.g(ko4Var);
                    ucbVar2.m = true;
                }
                ty0 ty0Var = (ty0) ucbVar2.j.c;
                if (ty0Var != null) {
                    ucbVar2.d = ty0Var;
                } else {
                    long j4 = ((cb3) f84Var).c;
                    if (j4 != -1) {
                        kr7 kr7Var = jr7Var.a;
                        boolean z = (kr7Var.a & 4) != 0;
                        long j5 = ucbVar2.f;
                        long j6 = kr7Var.d + kr7Var.e;
                        long j7 = kr7Var.b;
                        b = 2;
                        ucbVar2.d = new lc3(ucbVar2, j5, j4, j6, j7, z);
                        ucbVar2.h = b;
                        bArr = ey7Var.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        ey7Var.L(ey7Var.c, Arrays.copyOf(bArr, Math.max(65025, ey7Var.c)));
                        return 0;
                    }
                    ucbVar2.d = new faf((byte) 26);
                }
                b = 2;
                ucbVar2.h = b;
                bArr = ey7Var.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        try {
            return g((cb3) f84Var);
        } catch (hy7 unused) {
            return false;
        }
    }

    @Override // e84
    public final void d(long j, long j2) {
        ucb ucbVar = this.b;
        if (ucbVar != null) {
            jr7 jr7Var = ucbVar.a;
            kr7 kr7Var = jr7Var.a;
            kr7Var.a = (short) 0;
            kr7Var.b = 0L;
            kr7Var.c = (short) 0;
            kr7Var.d = 0;
            kr7Var.e = 0;
            jr7Var.b.K(0);
            jr7Var.c = -1;
            jr7Var.e = false;
            if (j == 0) {
                ucbVar.d(!ucbVar.l);
                return;
            }
            if (ucbVar.h != 0) {
                long j3 = (ucbVar.i * j2) / 1000000;
                ucbVar.e = j3;
                lr7 lr7Var = ucbVar.d;
                String str = gcc.a;
                lr7Var.p0(j3);
                ucbVar.h = (byte) 2;
            }
        }
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.a = g84Var;
    }

    public final boolean g(cb3 cb3Var) {
        boolean z;
        kr7 kr7Var = new kr7();
        if (kr7Var.a(cb3Var, true) && (kr7Var.a & 2) == 2) {
            int min = Math.min(kr7Var.e, 8);
            ey7 ey7Var = new ey7(min);
            cb3Var.d(ey7Var.a, 0, min, false);
            ey7Var.N(0);
            if (ey7Var.a() >= 5 && ey7Var.A() == 127 && ey7Var.C() == 1179402563) {
                this.b = new fk4();
                return true;
            }
            ey7Var.N(0);
            try {
                z = s2f.c(1, ey7Var, true);
            } catch (hy7 unused) {
                z = false;
            }
            if (z) {
                this.b = new koc();
            } else {
                ey7Var.N(0);
                if (cu7.e(ey7Var, cu7.o)) {
                    this.b = new cu7();
                }
            }
            return true;
        }
        return false;
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
