package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a30 extends org.telegram.ui.Components.ug0 {
    public final /* synthetic */ b50 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(b50 b50Var, LaunchActivity launchActivity, y30 y30Var, i40 i40Var, z20 z20Var) {
        super(launchActivity, y30Var, i40Var, z20Var);
        this.s1 = b50Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.s1.b.invalidate();
    }
}
