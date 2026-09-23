package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class oc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ tc0 b;

    public oc0(tc0 tc0Var) {
        this.b = tc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        tc0 tc0Var = this.b;
        tc0Var.a(z10);
        tc0Var.postDelayed(this, tc0Var.L);
    }
}
