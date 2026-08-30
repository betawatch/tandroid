package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fw0 extends g61 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw0(PremiumPreviewFragment premiumPreviewFragment, ew0 ew0Var) {
        super(ew0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.g61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.p0 = null;
    }
}
