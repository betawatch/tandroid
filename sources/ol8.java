// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
