package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class d20 extends org.telegram.ui.Components.hg0 {
    public final /* synthetic */ f40 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d20(f40 f40Var, LaunchActivity launchActivity, d30 d30Var, n30 n30Var, c20 c20Var) {
        super(launchActivity, d30Var, n30Var, c20Var);
        this.t1 = f40Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.t1.b.invalidate();
    }
}
