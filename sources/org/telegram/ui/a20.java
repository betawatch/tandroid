package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a20 extends org.telegram.ui.Components.vf0 {
    public final /* synthetic */ c40 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(c40 c40Var, LaunchActivity launchActivity, a30 a30Var, k30 k30Var, z10 z10Var) {
        super(launchActivity, a30Var, k30Var, z10Var);
        this.t1 = c40Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.t1.b.invalidate();
    }
}
