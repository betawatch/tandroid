package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ll0 b;

    public /* synthetic */ ke(org.telegram.ui.Components.ll0 ll0Var, int i9) {
        this.a = i9;
        this.b = ll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.ll0 ll0Var = this.b;
                if (!ll0Var.I) {
                    ll0Var.I = true;
                    ll0Var.c(new org.telegram.ui.Components.jl0(ll0Var, 0), false);
                    ll0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
