package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class np0 extends r61 {
    public final /* synthetic */ qp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np0(qp0 qp0Var, mp0 mp0Var) {
        super(mp0Var);
        this.e = qp0Var;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
