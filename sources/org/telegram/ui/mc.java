package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class mc extends q51 {
    public final /* synthetic */ dd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(dd ddVar, lc lcVar) {
        super(lcVar);
        this.e = ddVar;
    }

    @Override // org.telegram.ui.q51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
