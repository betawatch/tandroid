package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa0 b;

    public /* synthetic */ fa0(oa0 oa0Var, int i7) {
        this.a = i7;
        this.b = oa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oa0 oa0Var = this.b;
                di.b1 b1Var = oa0Var.f;
                if (!oa0Var.d0.d.r) {
                    b1Var.x0(b1Var.computeVerticalScrollRange() - (b1Var.computeVerticalScrollExtent() + b1Var.computeVerticalScrollOffset()), org.telegram.messenger.ks.Z3, pi.k.V);
                    break;
                } else {
                    b1Var.x0(-b1Var.computeVerticalScrollOffset(), org.telegram.messenger.ks.Z3, pi.k.V);
                    break;
                }
            default:
                this.b.h(true, false);
                break;
        }
    }
}
