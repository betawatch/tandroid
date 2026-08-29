package ag;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f2 extends h2 {
    public final /* synthetic */ int f;
    public final /* synthetic */ e2 g;
    public final /* synthetic */ i2 h;

    public /* synthetic */ f2(i2 i2Var, e2 e2Var, int i10) {
        this.f = i10;
        this.h = i2Var;
        this.g = e2Var;
    }

    @Override // ag.h2
    public final void a() {
        switch (this.f) {
            case 0:
                w1 w1Var = this.h.h;
                float f9 = w1Var.i;
                float f10 = w1Var.j;
                this.d = f9;
                this.e = f10;
                break;
            default:
                w1 w1Var2 = this.h.h;
                float f11 = w1Var2.d;
                float f12 = w1Var2.e;
                this.d = f11;
                this.e = f12;
                break;
        }
    }

    @Override // ag.h2
    public final void b(float f9, float f10) {
        switch (this.f) {
            case 0:
                w1 w1Var = this.h.h;
                w1Var.i = f9;
                w1Var.j = f10;
                this.d = f9;
                this.e = f10;
                this.g.a();
                break;
            default:
                w1 w1Var2 = this.h.h;
                w1Var2.d = f9;
                w1Var2.e = f10;
                this.d = f9;
                this.e = f10;
                this.g.a();
                break;
        }
    }
}
