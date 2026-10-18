package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class jd0 implements Runnable {
    public boolean a;
    public final /* synthetic */ od0 b;

    public jd0(od0 od0Var) {
        this.b = od0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        od0 od0Var = this.b;
        od0Var.a(z10);
        od0Var.postDelayed(this, od0Var.L);
    }
}
