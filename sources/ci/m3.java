package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jx0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        jx0 jx0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            jx0Var.setStickerType(11);
            jx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            jx0Var.setStickerType(1);
            jx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
