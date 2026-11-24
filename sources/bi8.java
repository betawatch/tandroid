// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bi8 extends kx9 {
    public final /* synthetic */ PremiumPreviewFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi8(PremiumPreviewFragment premiumPreviewFragment, ai8 ai8Var) {
        super(ai8Var);
        this.e = premiumPreviewFragment;
    }

    @Override // kx9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.v0 = null;
    }
}
