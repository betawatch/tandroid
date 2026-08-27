package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dx extends r51 {
    public final /* synthetic */ gy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(gy gyVar, cx cxVar) {
        super(cxVar);
        this.e = gyVar;
    }

    @Override // org.telegram.ui.r51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.I0 = null;
    }
}
