package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class cy0 extends i11 {
    public final /* synthetic */ ey0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(ey0 ey0Var, by0 by0Var) {
        super(by0Var);
        this.e = ey0Var;
    }

    @Override // org.telegram.ui.i11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
