package hi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c9(Object obj, float f10, int i7) {
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
                ki.r3 r3Var = (ki.r3) this.c;
                r3Var.w = null;
                float f12 = this.b;
                if (!z10) {
                    r3Var.f = f12;
                    r3Var.c();
                    break;
                } else {
                    r3Var.h = f12;
                    break;
                }
        }
    }
}
