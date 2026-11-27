// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ol8 extends d1a {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol8(PremiumPreviewFragment premiumPreviewFragment, nl8 nl8Var) {
        super(nl8Var);
        this.e = premiumPreviewFragment;
    }

    @Override // d1a, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.v0 = null;
    }
}
