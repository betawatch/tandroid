package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c31 extends q61 {
    public final /* synthetic */ e31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c31(e31 e31Var, b31 b31Var) {
        super(b31Var);
        this.e = e31Var;
    }

    @Override // org.telegram.ui.q61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
