package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ix0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        org.telegram.ui.ActionBar.u0 u0Var = w3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        w3Var.s.e(z10, true);
    }

    @Override // s4.h0
    public final void l() {
        ix0 ix0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            ix0Var.setStickerType(11);
            ix0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            ix0Var.setStickerType(1);
            ix0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
