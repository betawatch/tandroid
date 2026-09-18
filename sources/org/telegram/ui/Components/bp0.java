package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ bp0(jp0 jp0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = jp0Var;
        this.c = kVar;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    hVar.c();
                    break;
                }
                break;
            default:
                jp0 jp0Var = this.b;
                if (!z10) {
                    jp0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    jp0Var.getClass();
                    break;
                }
        }
    }
}
