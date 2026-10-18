package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ax extends q51 {
    public final /* synthetic */ ey e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(ey eyVar, zw zwVar) {
        super(zwVar);
        this.e = eyVar;
    }

    @Override // org.telegram.ui.q51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
