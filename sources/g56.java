// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class g56 extends x1 {
    public final f56 a = new f56();
    public final int b;
    public boolean c;

    public g56(int i) {
        this.b = i;
    }

    @Override // x1
    public final boolean b(gk0 gk0Var) {
        if (!this.c) {
            return true;
        }
        return true;
    }

    @Override // x1
    public final gk0 e() {
        return this.a;
    }

    @Override // x1
    public final boolean f() {
        return true;
    }

    @Override // x1
    public final vj2 h(vo3 vo3Var) {
        if (vo3Var.h) {
            if (((tg6) this.a.c) == null) {
                return null;
            }
            gk0 e = vo3Var.h().e();
            this.c = (e instanceof tu7) || (e instanceof f56);
            return vj2.a(vo3Var.e);
        }
        int i = vo3Var.g;
        int i2 = this.b;
        if (i >= i2) {
            return new vj2(-1, vo3Var.c + i2, false);
        }
        return null;
    }
}
