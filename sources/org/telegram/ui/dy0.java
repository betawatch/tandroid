package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dy0 extends k11 {
    public final /* synthetic */ fy0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(fy0 fy0Var, cy0 cy0Var) {
        super(cy0Var);
        this.e = fy0Var;
    }

    @Override // org.telegram.ui.k11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
