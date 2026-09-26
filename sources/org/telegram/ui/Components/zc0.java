package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class zc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ ed0 b;

    public zc0(ed0 ed0Var) {
        this.b = ed0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        ed0 ed0Var = this.b;
        ed0Var.a(z10);
        ed0Var.postDelayed(this, ed0Var.L);
    }
}
