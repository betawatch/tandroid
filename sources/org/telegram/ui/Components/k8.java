package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ k8(t8 t8Var, int i7) {
        this.a = i7;
        this.b = t8Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == -1) {
                    t8.Z(this.b);
                    break;
                }
                break;
            default:
                t8 t8Var = this.b;
                if (i7 == -1) {
                    t8.Z(t8Var);
                }
                if (i7 == 1) {
                    t8Var.k0();
                    break;
                }
                break;
        }
    }
}
