package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kx0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
        kx0 kx0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            kx0Var.setStickerType(11);
            kx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            kx0Var.setStickerType(1);
            kx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
