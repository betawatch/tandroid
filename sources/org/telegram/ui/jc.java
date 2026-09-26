package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class jc extends r61 {
    public final /* synthetic */ ad e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(ad adVar, ic icVar) {
        super(icVar);
        this.e = adVar;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
