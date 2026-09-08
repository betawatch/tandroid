package di;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class m3 extends w3 {
    public final /* synthetic */ x3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(x3 x3Var) {
        super(x3Var);
        this.x = x3Var;
    }

    @Override // di.w3
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
