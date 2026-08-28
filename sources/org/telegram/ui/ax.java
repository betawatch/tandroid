package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ax extends s51 {
    public final /* synthetic */ dy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(dy dyVar, zw zwVar) {
        super(zwVar);
        this.e = dyVar;
    }

    @Override // org.telegram.ui.s51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.I0 = null;
    }
}
