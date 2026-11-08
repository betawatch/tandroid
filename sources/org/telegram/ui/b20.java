package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
