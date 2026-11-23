package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ob0 implements Runnable {
    public boolean a;
    public final /* synthetic */ tb0 b;

    public ob0(tb0 tb0Var) {
        this.b = tb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        tb0 tb0Var = this.b;
        tb0Var.a(z10);
        tb0Var.postDelayed(this, tb0Var.N);
    }
}
