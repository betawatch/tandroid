package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
