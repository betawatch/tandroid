package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wb0 implements Runnable {
    public boolean a;
    public final /* synthetic */ bc0 b;

    public wb0(bc0 bc0Var) {
        this.b = bc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        bc0 bc0Var = this.b;
        bc0Var.a(z10);
        bc0Var.postDelayed(this, bc0Var.H);
    }
}
