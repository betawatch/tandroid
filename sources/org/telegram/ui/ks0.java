package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ks0 extends e11 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(PremiumPreviewFragment premiumPreviewFragment, js0 js0Var) {
        super(js0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.e11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.v0 = null;
    }
}
