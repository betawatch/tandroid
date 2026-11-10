package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e20 extends org.telegram.ui.Components.sf0 {
    public final /* synthetic */ f40 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(f40 f40Var, LaunchActivity launchActivity, c30 c30Var, n30 n30Var, d20 d20Var) {
        super(launchActivity, c30Var, n30Var, d20Var);
        this.s1 = f40Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.s1.b.invalidate();
    }
}
