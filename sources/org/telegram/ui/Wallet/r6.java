package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                w6.b((w6) this.b, z9, f10);
                break;
            default:
                n9 n9Var = (n9) this.b;
                n9Var.a0 = null;
                n9Var.b0 = 1.0f;
                n9Var.G0();
                break;
        }
    }
}
