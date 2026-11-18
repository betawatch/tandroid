package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka0 b;

    public /* synthetic */ ja0(ka0 ka0Var, int i7) {
        this.a = i7;
        this.b = ka0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ka0 ka0Var = this.b;
                if (ka0Var.W != -1) {
                    org.telegram.messenger.ks.f(ka0Var.Y.d0.x).j(ka0Var.W);
                    ka0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                ka0 ka0Var2 = this.b;
                if (ka0Var2.W != -1) {
                    org.telegram.messenger.ks.f(ka0Var2.Y.d0.x).j(ka0Var2.W);
                    ka0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
