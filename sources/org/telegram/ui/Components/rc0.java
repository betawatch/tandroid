package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ wc0 b;

    public rc0(wc0 wc0Var) {
        this.b = wc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.a;
        wc0 wc0Var = this.b;
        wc0Var.a(z4);
        wc0Var.postDelayed(this, wc0Var.I);
    }
}
