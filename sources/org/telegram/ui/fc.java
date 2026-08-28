package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fc extends s51 {
    public final /* synthetic */ xc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(xc xcVar, ec ecVar) {
        super(ecVar);
        this.e = xcVar;
    }

    @Override // org.telegram.ui.s51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M = null;
    }
}
