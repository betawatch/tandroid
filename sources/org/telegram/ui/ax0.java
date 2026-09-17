package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
