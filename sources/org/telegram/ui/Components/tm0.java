package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm0 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn0 b;
    public final /* synthetic */ r1.g c;

    public /* synthetic */ tm0(bn0 bn0Var, r1.g gVar, int i7) {
        this.a = i7;
        this.b = bn0Var;
        this.c = gVar;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z9) {
                    this.b.z.remove(this.c);
                    gVar.d();
                    break;
                }
                break;
            default:
                bn0 bn0Var = this.b;
                if (!z9) {
                    bn0Var.z.remove(this.c);
                    gVar.d();
                    break;
                } else {
                    bn0Var.getClass();
                    break;
                }
        }
    }
}
