package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ew0 extends o51 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew0(PremiumPreviewFragment premiumPreviewFragment, dw0 dw0Var) {
        super(dw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.o51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.s0 = null;
    }
}
