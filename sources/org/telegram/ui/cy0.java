package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
