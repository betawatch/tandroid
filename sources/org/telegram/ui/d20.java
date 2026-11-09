package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d20 extends org.telegram.ui.Components.tf0 {
    public final /* synthetic */ e40 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d20(e40 e40Var, LaunchActivity launchActivity, b30 b30Var, m30 m30Var, c20 c20Var) {
        super(launchActivity, b30Var, m30Var, c20Var);
        this.s1 = e40Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.s1.b.invalidate();
    }
}
