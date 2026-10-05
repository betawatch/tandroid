package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ox extends r61 {
    public final /* synthetic */ uy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(uy uyVar, nx nxVar) {
        super(nxVar);
        this.e = uyVar;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
