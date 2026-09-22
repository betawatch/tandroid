package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lx0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class m3 extends w3 {
    public final /* synthetic */ x3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(x3 x3Var) {
        super(x3Var);
        this.x = x3Var;
    }

    @Override // ci.w3
    public final void F(boolean z10) {
        x3 x3Var = this.x;
        org.telegram.ui.ActionBar.v0 v0Var = x3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        x3Var.s.e(z10, true);
    }

    @Override // s4.h0
    public final void l() {
        lx0 lx0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            lx0Var.setStickerType(11);
            lx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            lx0Var.setStickerType(1);
            lx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
