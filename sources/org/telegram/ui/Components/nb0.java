package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class nb0 implements Runnable {
    public boolean a;
    public final /* synthetic */ sb0 b;

    public nb0(sb0 sb0Var) {
        this.b = sb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        sb0 sb0Var = this.b;
        sb0Var.a(z10);
        sb0Var.postDelayed(this, sb0Var.N);
    }
}
