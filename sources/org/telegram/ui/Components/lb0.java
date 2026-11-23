package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lb0 implements Runnable {
    public boolean a;
    public final /* synthetic */ qb0 b;

    public lb0(qb0 qb0Var) {
        this.b = qb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        qb0 qb0Var = this.b;
        qb0Var.a(z10);
        qb0Var.postDelayed(this, qb0Var.N);
    }
}
