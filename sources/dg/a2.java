package dg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a2 extends c2 {
    public final /* synthetic */ int f;
    public final /* synthetic */ z1 g;
    public final /* synthetic */ d2 h;

    public /* synthetic */ a2(d2 d2Var, z1 z1Var, int i10) {
        this.f = i10;
        this.h = d2Var;
        this.g = z1Var;
    }

    @Override // dg.c2
    public final void a() {
        switch (this.f) {
            case 0:
                r1 r1Var = this.h.h;
                float f10 = r1Var.i;
                float f11 = r1Var.j;
                this.d = f10;
                this.e = f11;
                break;
            default:
                r1 r1Var2 = this.h.h;
                float f12 = r1Var2.d;
                float f13 = r1Var2.e;
                this.d = f12;
                this.e = f13;
                break;
        }
    }

    @Override // dg.c2
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                r1 r1Var = this.h.h;
                r1Var.i = f10;
                r1Var.j = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
            default:
                r1 r1Var2 = this.h.h;
                r1Var2.d = f10;
                r1Var2.e = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
        }
    }
}
