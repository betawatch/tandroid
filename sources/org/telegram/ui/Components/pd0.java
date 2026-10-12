package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pd0 implements Runnable {
    public boolean a;
    public final /* synthetic */ ud0 b;

    public pd0(ud0 ud0Var) {
        this.b = ud0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        ud0 ud0Var = this.b;
        ud0Var.a(z10);
        ud0Var.postDelayed(this, ud0Var.L);
    }
}
