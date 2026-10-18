package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
