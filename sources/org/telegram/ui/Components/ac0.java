package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ac0 implements Runnable {
    public boolean a;
    public final /* synthetic */ fc0 b;

    public ac0(fc0 fc0Var) {
        this.b = fc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        fc0 fc0Var = this.b;
        fc0Var.a(z10);
        fc0Var.postDelayed(this, fc0Var.H);
    }
}
