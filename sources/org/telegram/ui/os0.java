package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class os0 extends i11 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(PremiumPreviewFragment premiumPreviewFragment, ns0 ns0Var) {
        super(ns0Var);
        this.e = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.i11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.v0 = null;
    }
}
