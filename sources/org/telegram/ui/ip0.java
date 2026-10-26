package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ip0 extends t51 {
    public final /* synthetic */ lp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip0(lp0 lp0Var, hp0 hp0Var) {
        super(hp0Var);
        this.e = lp0Var;
    }

    @Override // org.telegram.ui.t51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
