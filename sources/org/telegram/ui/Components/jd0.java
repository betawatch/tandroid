package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
