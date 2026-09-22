package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ax0 extends y61 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax0(PremiumPreviewFragment premiumPreviewFragment, zw0 zw0Var) {
        super(zw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.y61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.s0 = null;
    }
}
