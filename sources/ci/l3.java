package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ux0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class l3 extends v3 {
    public final /* synthetic */ w3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(w3 w3Var) {
        super(w3Var);
        this.x = w3Var;
    }

    @Override // ci.v3
    public final void F(boolean z10) {
        w3 w3Var = this.x;
        org.telegram.ui.ActionBar.v0 v0Var = w3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        w3Var.s.e(z10, true);
    }

    @Override // s4.h0
    public final void l() {
        ux0 ux0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            ux0Var.setStickerType(11);
            ux0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            ux0Var.setStickerType(1);
            ux0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
