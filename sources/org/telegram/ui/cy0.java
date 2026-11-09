package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cy0 extends j11 {
    public final /* synthetic */ ey0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(ey0 ey0Var, by0 by0Var) {
        super(by0Var);
        this.e = ey0Var;
    }

    @Override // org.telegram.ui.j11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
