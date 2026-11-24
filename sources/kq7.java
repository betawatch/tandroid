// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kq7 implements s84 {
    public u84 a;
    public yab b;
    public boolean c;

    /* JADX WARN: Removed duplicated region for block: B:60:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
        byte b;
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            vb3 vb3Var = (vb3) t84Var;
            if (!g(vb3Var)) {
                throw bx7.a("Failed to determine bitstream type", null);
            }
            vb3Var.f = 0;
        }
        if (!this.c) {
            yzb c0 = this.a.c0(0, 1);
            this.a.B();
            yab yabVar = this.b;
            yabVar.c = this.a;
            yabVar.b = c0;
            yabVar.d(true);
            this.c = true;
        }
        yab yabVar2 = this.b;
        mq7 mq7Var = yabVar2.a;
        yw7 yw7Var = mq7Var.b;
        yabVar2.b.getClass();
        String str = hac.a;
        byte b2 = yabVar2.h;
        if (b2 != 0) {
            if (b2 == 1) {
                ((vb3) t84Var).m((int) yabVar2.f, false);
                yabVar2.h = (byte) 2;
                return 0;
            }
            if (b2 != 2) {
                if (b2 == 3) {
                    return -1;
                }
                rjb.h();
                return 0;
            }
            vb3 vb3Var2 = (vb3) t84Var;
            long p = yabVar2.d.p(vb3Var2);
            if (p >= 0) {
                u21Var.a = p;
                return 1;
            }
            if (p < -1) {
                yabVar2.a(-(p + 2));
            }
            if (!yabVar2.l) {
                ix9 D = yabVar2.d.D();
                D.getClass();
                yabVar2.c.f0(D);
                yabVar2.b.d(D.h());
                yabVar2.l = true;
            }
            if (yabVar2.k <= 0 && !mq7Var.b(vb3Var2)) {
                yabVar2.h = (byte) 3;
                return -1;
            }
            yabVar2.k = 0L;
            long b3 = yabVar2.b(yw7Var);
            if (b3 >= 0) {
                long j = yabVar2.g;
                if (j + b3 >= yabVar2.e) {
                    yabVar2.b.e(yw7Var.c, yw7Var);
                    yabVar2.b.a((j * 1000000) / yabVar2.i, 1, yw7Var.c, 0, null);
                    yabVar2.e = -1L;
                }
            }
            yabVar2.g += b3;
            return 0;
        }
        while (true) {
            vb3 vb3Var3 = (vb3) t84Var;
            if (!mq7Var.b(vb3Var3)) {
                yabVar2.h = (byte) 3;
                return -1;
            }
            long j2 = vb3Var3.d;
            long j3 = yabVar2.f;
            yabVar2.k = j2 - j3;
            if (yabVar2.c(yw7Var, j3, yabVar2.j)) {
                yabVar2.f = ((vb3) t84Var).d;
            } else {
                go4 go4Var = (go4) yabVar2.j.b;
                yabVar2.i = go4Var.P;
                if (!yabVar2.m) {
                    yabVar2.b.g(go4Var);
                    yabVar2.m = true;
                }
                sz0 sz0Var = (sz0) yabVar2.j.c;
                if (sz0Var != null) {
                    yabVar2.d = sz0Var;
                } else {
                    long j4 = ((vb3) t84Var).c;
                    if (j4 != -1) {
                        nq7 nq7Var = mq7Var.a;
                        boolean z = (nq7Var.a & 4) != 0;
                        long j5 = yabVar2.f;
                        long j6 = nq7Var.d + nq7Var.e;
                        long j7 = nq7Var.b;
                        b = 2;
                        yabVar2.d = new ed3(yabVar2, j5, j4, j6, j7, z);
                        yabVar2.h = b;
                        bArr = yw7Var.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        yw7Var.L(yw7Var.c, Arrays.copyOf(bArr, Math.max(65025, yw7Var.c)));
                        return 0;
                    }
                    yabVar2.d = new q7f((byte) 26);
                }
                b = 2;
                yabVar2.h = b;
                bArr = yw7Var.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        try {
            return g((vb3) t84Var);
        } catch (bx7 unused) {
            return false;
        }
    }

    @Override // s84
    public final void d(long j, long j2) {
        yab yabVar = this.b;
        if (yabVar != null) {
            mq7 mq7Var = yabVar.a;
            nq7 nq7Var = mq7Var.a;
            nq7Var.a = (short) 0;
            nq7Var.b = 0L;
            nq7Var.c = (short) 0;
            nq7Var.d = 0;
            nq7Var.e = 0;
            mq7Var.b.K(0);
            mq7Var.c = -1;
            mq7Var.e = false;
            if (j == 0) {
                yabVar.d(!yabVar.l);
                return;
            }
            if (yabVar.h != 0) {
                long j3 = (yabVar.i * j2) / 1000000;
                yabVar.e = j3;
                oq7 oq7Var = yabVar.d;
                String str = hac.a;
                oq7Var.u0(j3);
                yabVar.h = (byte) 2;
            }
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.a = u84Var;
    }

    public final boolean g(vb3 vb3Var) {
        boolean z;
        nq7 nq7Var = new nq7();
        if (nq7Var.a(vb3Var, true) && (nq7Var.a & 2) == 2) {
            int min = Math.min(nq7Var.e, 8);
            yw7 yw7Var = new yw7(min);
            vb3Var.d(yw7Var.a, 0, min, false);
            yw7Var.N(0);
            if (yw7Var.a() >= 5 && yw7Var.A() == 127 && yw7Var.C() == 1179402563) {
                this.b = new fk4();
                return true;
            }
            yw7Var.N(0);
            try {
                z = c0f.c(1, yw7Var, true);
            } catch (bx7 unused) {
                z = false;
            }
            if (z) {
                this.b = new xlc();
            } else {
                yw7Var.N(0);
                if (ys7.e(yw7Var, ys7.o)) {
                    this.b = new ys7();
                }
            }
            return true;
        }
        return false;
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
