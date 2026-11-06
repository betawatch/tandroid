package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2 b;

    public /* synthetic */ j0(org.telegram.ui.ActionBar.u2 u2Var, int i7) {
        this.a = i7;
        this.b = u2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                break;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.b;
                ((w5) u2Var.d).e(true, 0.0f);
                u2Var.invalidateSelf();
                break;
        }
    }
}
