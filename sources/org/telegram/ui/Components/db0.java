package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class db0 implements Runnable {
    public boolean a;
    public final /* synthetic */ ib0 b;

    public db0(ib0 ib0Var) {
        this.b = ib0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9 = this.a;
        ib0 ib0Var = this.b;
        ib0Var.a(z9);
        ib0Var.postDelayed(this, ib0Var.M);
    }
}
