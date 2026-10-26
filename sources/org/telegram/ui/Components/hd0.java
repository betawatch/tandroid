package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hd0 implements Runnable {
    public boolean a;
    public final /* synthetic */ md0 b;

    public hd0(md0 md0Var) {
        this.b = md0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        md0 md0Var = this.b;
        md0Var.a(z10);
        md0Var.postDelayed(this, md0Var.M);
    }
}
