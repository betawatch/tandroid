package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kb0 extends ym0 {
    public final /* synthetic */ qb0 d;

    public kb0(qb0 qb0Var) {
        this.d = qb0Var;
    }

    @Override // org.telegram.ui.Components.ym0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.ym0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.ym0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.ym0
    public final CharSequence d() {
        qb0 qb0Var = this.d;
        org.telegram.messenger.x10 x10Var = qb0Var.v0;
        return x10Var != null ? (CharSequence) x10Var.a(Integer.valueOf(qb0Var.I)) : qb0Var.d(qb0Var.I);
    }
}
