package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y90 b;

    public /* synthetic */ x90(y90 y90Var, int i7) {
        this.a = i7;
        this.b = y90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y90 y90Var = this.b;
                if (y90Var.W != -1) {
                    org.telegram.messenger.qs.f(y90Var.Y.c0.x).j(y90Var.W);
                    y90Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                y90 y90Var2 = this.b;
                if (y90Var2.W != -1) {
                    org.telegram.messenger.qs.f(y90Var2.Y.c0.x).j(y90Var2.W);
                    y90Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
