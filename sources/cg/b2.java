package cg;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b2 extends d2 {
    public final /* synthetic */ int f;
    public final /* synthetic */ a2 g;
    public final /* synthetic */ e2 h;

    public /* synthetic */ b2(e2 e2Var, a2 a2Var, int i10) {
        this.f = i10;
        this.h = e2Var;
        this.g = a2Var;
    }

    @Override // cg.d2
    public final void a() {
        switch (this.f) {
            case 0:
                s1 s1Var = this.h.h;
                float f10 = s1Var.i;
                float f11 = s1Var.j;
                this.d = f10;
                this.e = f11;
                break;
            default:
                s1 s1Var2 = this.h.h;
                float f12 = s1Var2.d;
                float f13 = s1Var2.e;
                this.d = f12;
                this.e = f13;
                break;
        }
    }

    @Override // cg.d2
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                s1 s1Var = this.h.h;
                s1Var.i = f10;
                s1Var.j = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
            default:
                s1 s1Var2 = this.h.h;
                s1Var2.d = f10;
                s1Var2.e = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
        }
    }
}
