package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
