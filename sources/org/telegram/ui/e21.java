package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e21 extends t51 {
    public final /* synthetic */ g21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e21(g21 g21Var, d21 d21Var) {
        super(d21Var);
        this.e = g21Var;
    }

    @Override // org.telegram.ui.t51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
