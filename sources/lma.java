// default package

import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lma implements e84 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public byte e;
    public g84 f;
    public x1c g;

    public lma(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // e84
    public final int b(f84 f84Var, v11 v11Var) {
        byte b = this.e;
        if (b != 1) {
            if (b == 2) {
                return -1;
            }
            grb.g();
            return 0;
        }
        x1c x1cVar = this.g;
        x1cVar.getClass();
        int f = x1cVar.f(f84Var, 1024, true);
        if (f != -1) {
            this.d += f;
            return 0;
        }
        this.e = (byte) 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        int i = this.b;
        int i2 = this.a;
        yve.p((i2 == -1 || i == -1) ? false : true);
        ey7 ey7Var = new ey7(i);
        ((cb3) f84Var).d(ey7Var.a, 0, i, false);
        return ey7Var.H() == i2;
    }

    @Override // e84
    public final void d(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = (byte) 1;
            this.d = 0;
        }
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.f = g84Var;
        x1c e0 = g84Var.e0(1024, 4);
        this.g = e0;
        jo4 jo4Var = new jo4();
        String str = this.c;
        jo4Var.r = dg7.n(str);
        jo4Var.s = dg7.n(str);
        xnb.v(jo4Var, e0);
        this.f.D();
        this.f.m0(new nma());
        this.e = (byte) 1;
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
