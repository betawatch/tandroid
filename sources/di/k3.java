package di;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wx0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class k3 extends u3 {
    public final /* synthetic */ v3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(v3 v3Var) {
        super(v3Var);
        this.x = v3Var;
    }

    @Override // di.u3
    public final void F(boolean z10) {
        v3 v3Var = this.x;
        org.telegram.ui.ActionBar.u0 u0Var = v3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        v3Var.s.e(z10, true);
    }

    @Override // s4.g0
    public final void l() {
        wx0 wx0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            wx0Var.setStickerType(11);
            wx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            wx0Var.setStickerType(1);
            wx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
