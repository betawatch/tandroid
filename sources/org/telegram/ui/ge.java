package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.jk0 b;

    public /* synthetic */ ge(org.telegram.ui.Components.jk0 jk0Var, int i7) {
        this.a = i7;
        this.b = jk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.jk0 jk0Var = this.b;
                if (!jk0Var.M) {
                    jk0Var.M = true;
                    jk0Var.c(new org.telegram.ui.Components.hk0(jk0Var, 0), false);
                    jk0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
