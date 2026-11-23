package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c20 extends org.telegram.ui.Components.gg0 {
    public final /* synthetic */ e40 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c20(e40 e40Var, LaunchActivity launchActivity, c30 c30Var, m30 m30Var, b20 b20Var) {
        super(launchActivity, c30Var, m30Var, b20Var);
        this.t1 = e40Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.t1.b.invalidate();
    }
}
