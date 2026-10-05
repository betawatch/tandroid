package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class b31 extends r61 {
    public final /* synthetic */ d31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b31(d31 d31Var, a31 a31Var) {
        super(a31Var);
        this.e = d31Var;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
