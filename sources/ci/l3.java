package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        xw0 xw0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            xw0Var.setStickerType(11);
            xw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            xw0Var.setStickerType(1);
            xw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
