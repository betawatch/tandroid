package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class db0 implements Runnable {
    public boolean a;
    public final /* synthetic */ ib0 b;

    public db0(ib0 ib0Var) {
        this.b = ib0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        ib0 ib0Var = this.b;
        ib0Var.a(z10);
        ib0Var.postDelayed(this, ib0Var.N);
    }
}
