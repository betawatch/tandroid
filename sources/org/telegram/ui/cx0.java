package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cx0 extends z61 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx0(PremiumPreviewFragment premiumPreviewFragment, bx0 bx0Var) {
        super(bx0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.z61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.s0 = null;
    }
}
