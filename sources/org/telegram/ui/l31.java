package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class l31 extends a71 {
    public final /* synthetic */ n31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l31(n31 n31Var, k31 k31Var) {
        super(k31Var);
        this.e = n31Var;
    }

    @Override // org.telegram.ui.a71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
