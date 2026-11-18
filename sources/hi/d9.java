package hi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
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
                ta taVar = (ta) this.c;
                if (!z10) {
                    taVar.N0.setTranslationY(this.b);
                    taVar.N0.L = false;
                    taVar.p2 = null;
                    taVar.q2 = null;
                    break;
                }
                break;
            default:
                ki.s3 s3Var = (ki.s3) this.c;
                s3Var.w = null;
                float f12 = this.b;
                if (!z10) {
                    s3Var.f = f12;
                    s3Var.c();
                    break;
                } else {
                    s3Var.h = f12;
                    break;
                }
        }
    }
}
