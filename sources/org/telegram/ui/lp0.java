package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lp0 extends q61 {
    public final /* synthetic */ op0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(op0 op0Var, kp0 kp0Var) {
        super(kp0Var);
        this.e = op0Var;
    }

    @Override // org.telegram.ui.q61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
