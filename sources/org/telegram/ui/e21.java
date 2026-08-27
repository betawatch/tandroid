package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e21 extends r51 {
    public final /* synthetic */ g21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e21(g21 g21Var, d21 d21Var) {
        super(d21Var);
        this.e = g21Var;
    }

    @Override // org.telegram.ui.r51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
