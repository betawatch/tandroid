package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ow0 extends w51 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(PremiumPreviewFragment premiumPreviewFragment, nw0 nw0Var) {
        super(nw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.w51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.v0 = null;
    }
}
