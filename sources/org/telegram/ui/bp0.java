package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class bp0 extends q51 {
    public final /* synthetic */ ep0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(ep0 ep0Var, ap0 ap0Var) {
        super(ap0Var);
        this.e = ep0Var;
    }

    @Override // org.telegram.ui.q51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
