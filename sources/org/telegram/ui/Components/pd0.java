package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
