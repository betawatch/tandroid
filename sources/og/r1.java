package og;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r1 extends t1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ q1 g;
    public final /* synthetic */ u1 h;

    public /* synthetic */ r1(u1 u1Var, q1 q1Var, int i10) {
        this.f = i10;
        this.h = u1Var;
        this.g = q1Var;
    }

    @Override // og.t1
    public final void a() {
        switch (this.f) {
            case 0:
                k1 k1Var = this.h.h;
                float f7 = k1Var.i;
                float f10 = k1Var.j;
                this.d = f7;
                this.e = f10;
                break;
            default:
                k1 k1Var2 = this.h.h;
                float f11 = k1Var2.d;
                float f12 = k1Var2.e;
                this.d = f11;
                this.e = f12;
                break;
        }
    }

    @Override // og.t1
    public final void b(float f7, float f10) {
        switch (this.f) {
            case 0:
                k1 k1Var = this.h.h;
                k1Var.i = f7;
                k1Var.j = f10;
                this.d = f7;
                this.e = f10;
                this.g.a();
                break;
            default:
                k1 k1Var2 = this.h.h;
                k1Var2.d = f7;
                k1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.g.a();
                break;
        }
    }
}
