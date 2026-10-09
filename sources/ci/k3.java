package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ay0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k3 extends u3 {
    public final /* synthetic */ v3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(v3 v3Var) {
        super(v3Var);
        this.x = v3Var;
    }

    @Override // ci.u3
    public final void F(boolean z10) {
        v3 v3Var = this.x;
        org.telegram.ui.ActionBar.v0 v0Var = v3Var.G;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        v3Var.s.e(z10, true);
    }

    @Override // s4.i0
    public final void l() {
        ay0 ay0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            ay0Var.setStickerType(11);
            ay0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            ay0Var.setStickerType(1);
            ay0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
