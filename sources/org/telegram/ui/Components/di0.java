package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class di0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi0 b;

    public /* synthetic */ di0(gi0 gi0Var, int i7) {
        this.a = i7;
        this.b = gi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().B() != null && !this.b.a.getImageReceiver().B().k0 && !this.b.a.getImageReceiver().B().y()) {
                    this.b.a.getImageReceiver().B().start();
                }
                this.b.E = false;
                break;
            default:
                gi0 gi0Var = this.b;
                ii0 ii0Var = gi0Var.P;
                try {
                    gi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ii0Var.m0 = ii0Var.T.indexOf(gi0Var.e);
                ii0Var.l0 = gi0Var.e;
                ii0Var.invalidate();
                break;
        }
    }
}
