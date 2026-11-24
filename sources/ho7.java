// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ho7 implements j74 {
    public l74 a;
    public w8b b;
    public boolean c;

    /* JADX WARN: Removed duplicated region for block: B:60:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        byte b;
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            ja3 ja3Var = (ja3) k74Var;
            if (!g(ja3Var)) {
                throw av7.a("Failed to determine bitstream type", null);
            }
            ja3Var.f = 0;
        }
        if (!this.c) {
            wxb T = this.a.T(0, 1);
            this.a.B();
            w8b w8bVar = this.b;
            w8bVar.c = this.a;
            w8bVar.b = T;
            w8bVar.d(true);
            this.c = true;
        }
        w8b w8bVar2 = this.b;
        jo7 jo7Var = w8bVar2.a;
        xu7 xu7Var = jo7Var.b;
        w8bVar2.b.getClass();
        String str = g8c.a;
        byte b2 = w8bVar2.h;
        if (b2 != 0) {
            if (b2 == 1) {
                ((ja3) k74Var).l((int) w8bVar2.f, false);
                w8bVar2.h = (byte) 2;
                return 0;
            }
            if (b2 != 2) {
                if (b2 == 3) {
                    return -1;
                }
                sdb.a();
                return 0;
            }
            ja3 ja3Var2 = (ja3) k74Var;
            long h = w8bVar2.d.h(ja3Var2);
            if (h >= 0) {
                m11Var.a = h;
                return 1;
            }
            if (h < -1) {
                w8bVar2.a(-(h + 2));
            }
            if (!w8bVar2.l) {
                fv9 k = w8bVar2.d.k();
                k.getClass();
                w8bVar2.c.f0(k);
                w8bVar2.b.d(k.h());
                w8bVar2.l = true;
            }
            if (w8bVar2.k <= 0 && !jo7Var.b(ja3Var2)) {
                w8bVar2.h = (byte) 3;
                return -1;
            }
            w8bVar2.k = 0L;
            long b3 = w8bVar2.b(xu7Var);
            if (b3 >= 0) {
                long j = w8bVar2.g;
                if (j + b3 >= w8bVar2.e) {
                    w8bVar2.b.e(xu7Var.c, xu7Var);
                    w8bVar2.b.a((j * 1000000) / w8bVar2.i, 1, xu7Var.c, 0, null);
                    w8bVar2.e = -1L;
                }
            }
            w8bVar2.g += b3;
            return 0;
        }
        while (true) {
            ja3 ja3Var3 = (ja3) k74Var;
            if (!jo7Var.b(ja3Var3)) {
                w8bVar2.h = (byte) 3;
                return -1;
            }
            long j2 = ja3Var3.d;
            long j3 = w8bVar2.f;
            w8bVar2.k = j2 - j3;
            if (w8bVar2.c(xu7Var, j3, w8bVar2.j)) {
                w8bVar2.f = ((ja3) k74Var).d;
            } else {
                fm4 fm4Var = (fm4) w8bVar2.j.b;
                w8bVar2.i = fm4Var.P;
                if (!w8bVar2.m) {
                    w8bVar2.b.g(fm4Var);
                    w8bVar2.m = true;
                }
                ly0 ly0Var = (ly0) w8bVar2.j.c;
                if (ly0Var != null) {
                    w8bVar2.d = ly0Var;
                } else {
                    long j4 = ((ja3) k74Var).c;
                    if (j4 != -1) {
                        ko7 ko7Var = jo7Var.a;
                        boolean z = (ko7Var.a & 4) != 0;
                        long j5 = w8bVar2.f;
                        long j6 = ko7Var.d + ko7Var.e;
                        long j7 = ko7Var.b;
                        b = 2;
                        w8bVar2.d = new sb3(w8bVar2, j5, j4, j6, j7, z);
                        w8bVar2.h = b;
                        bArr = xu7Var.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        xu7Var.L(xu7Var.c, Arrays.copyOf(bArr, Math.max(65025, xu7Var.c)));
                        return 0;
                    }
                    w8bVar2.d = new o5f((byte) 26);
                }
                b = 2;
                w8bVar2.h = b;
                bArr = xu7Var.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        try {
            return g((ja3) k74Var);
        } catch (av7 unused) {
            return false;
        }
    }

    @Override // j74
    public final void d(long j, long j2) {
        w8b w8bVar = this.b;
        if (w8bVar != null) {
            jo7 jo7Var = w8bVar.a;
            ko7 ko7Var = jo7Var.a;
            ko7Var.a = (short) 0;
            ko7Var.b = 0L;
            ko7Var.c = (short) 0;
            ko7Var.d = 0;
            ko7Var.e = 0;
            jo7Var.b.K(0);
            jo7Var.c = -1;
            jo7Var.e = false;
            if (j == 0) {
                w8bVar.d(!w8bVar.l);
                return;
            }
            if (w8bVar.h != 0) {
                long j3 = (w8bVar.i * j2) / 1000000;
                w8bVar.e = j3;
                lo7 lo7Var = w8bVar.d;
                String str = g8c.a;
                lo7Var.j0(j3);
                w8bVar.h = (byte) 2;
            }
        }
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        this.a = l74Var;
    }

    public final boolean g(ja3 ja3Var) {
        boolean z;
        ko7 ko7Var = new ko7();
        if (ko7Var.a(ja3Var, true) && (ko7Var.a & 2) == 2) {
            int min = Math.min(ko7Var.e, 8);
            xu7 xu7Var = new xu7(min);
            ja3Var.d(xu7Var.a, 0, min, false);
            xu7Var.N(0);
            if (xu7Var.a() >= 5 && xu7Var.A() == 127 && xu7Var.C() == 1179402563) {
                this.b = new bi4();
                return true;
            }
            xu7Var.N(0);
            try {
                z = aye.c(1, xu7Var, true);
            } catch (av7 unused) {
                z = false;
            }
            if (z) {
                this.b = new xjc();
            } else {
                xu7Var.N(0);
                if (wq7.e(xu7Var, wq7.o)) {
                    this.b = new wq7();
                }
            }
            return true;
        }
        return false;
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
