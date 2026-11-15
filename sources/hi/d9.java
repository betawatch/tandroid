package hi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d9 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d9(Object obj, float f10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = f10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                sa saVar = (sa) this.c;
                if (!z10) {
                    saVar.N0.setTranslationY(this.b);
                    saVar.N0.L = false;
                    saVar.p2 = null;
                    saVar.q2 = null;
                    break;
                }
                break;
            default:
                ki.x3 x3Var = (ki.x3) this.c;
                x3Var.w = null;
                float f12 = this.b;
                if (!z10) {
                    x3Var.f = f12;
                    x3Var.c();
                    break;
                } else {
                    x3Var.h = f12;
                    break;
                }
        }
    }
}
