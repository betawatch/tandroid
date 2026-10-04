package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class d31 extends t61 {
    public final /* synthetic */ f31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d31(f31 f31Var, c31 c31Var) {
        super(c31Var);
        this.e = f31Var;
    }

    @Override // org.telegram.ui.t61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
