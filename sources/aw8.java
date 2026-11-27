// default package

import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class aw8 implements at9 {
    public final int a;
    public final boolean b;
    public final /* synthetic */ cw8 c;

    public aw8(cw8 cw8Var, int i, boolean z) {
        this.c = cw8Var;
        this.a = i;
        this.b = z;
    }

    @Override // at9
    public final int a() {
        return this.b ? 4 : 0;
    }

    @Override // at9
    public final void g() {
        int i = this.a;
        cw8 cw8Var = this.c;
        cw8Var.M[i].C();
        rx6 rx6Var = cw8Var.y;
        int v3 = cw8Var.d.v3(cw8Var.W);
        IOException iOException = (IOException) rx6Var.d;
        if (iOException != null) {
            throw iOException;
        }
        na6 na6Var = (na6) rx6Var.c;
        if (na6Var != null) {
            if (v3 == Integer.MIN_VALUE) {
                v3 = na6Var.a;
            }
            IOException iOException2 = na6Var.e;
            if (iOException2 != null && na6Var.f > v3) {
                throw iOException2;
            }
        }
    }

    @Override // at9
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        cw8 cw8Var = this.c;
        if (cw8Var.B()) {
            return -3;
        }
        int i2 = this.a;
        cw8Var.w(i2);
        int F = cw8Var.M[i2].F(ym4Var, s93Var, i, cw8Var.j0);
        if (F == -3) {
            cw8Var.x(i2);
        }
        return F;
    }

    @Override // at9
    public final boolean k() {
        cw8 cw8Var = this.c;
        return !cw8Var.B() && cw8Var.M[this.a].A(cw8Var.j0);
    }

    @Override // at9
    public final int o(long j) {
        cw8 cw8Var = this.c;
        if (cw8Var.B()) {
            return 0;
        }
        int i = this.a;
        cw8Var.w(i);
        ys9 ys9Var = cw8Var.M[i];
        int x = ys9Var.x(j, cw8Var.j0);
        ys9Var.L(x);
        if (x == 0) {
            cw8Var.x(i);
        }
        return x;
    }
}
