package fi;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f9 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f9(Object obj, float f10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = f10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                va vaVar = (va) this.c;
                if (!z9) {
                    vaVar.M0.setTranslationY(this.b);
                    vaVar.M0.K = false;
                    vaVar.o2 = null;
                    vaVar.p2 = null;
                    break;
                }
                break;
            default:
                hi.b4 b4Var = (hi.b4) this.c;
                b4Var.w = null;
                float f12 = this.b;
                if (!z9) {
                    b4Var.f = f12;
                    b4Var.c();
                    break;
                } else {
                    b4Var.h = f12;
                    break;
                }
        }
    }
}
