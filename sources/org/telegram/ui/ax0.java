package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ax0 extends a71 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax0(PremiumPreviewFragment premiumPreviewFragment, zw0 zw0Var) {
        super(zw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.a71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.s0 = null;
    }
}
