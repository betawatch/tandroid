package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class b20 extends org.telegram.ui.Components.sf0 {
    public final /* synthetic */ c40 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(c40 c40Var, LaunchActivity launchActivity, z20 z20Var, k30 k30Var, a20 a20Var) {
        super(launchActivity, z20Var, k30Var, a20Var);
        this.s1 = c40Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.s1.b.invalidate();
    }
}
