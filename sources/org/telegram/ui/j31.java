package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class j31 extends x61 {
    public final /* synthetic */ l31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j31(l31 l31Var, i31 i31Var) {
        super(i31Var);
        this.e = l31Var;
    }

    @Override // org.telegram.ui.x61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
