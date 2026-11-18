package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d20 extends org.telegram.ui.Components.fg0 {
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
