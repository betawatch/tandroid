package kh;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gw0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g3 extends p3 {
    public final /* synthetic */ q3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(q3 q3Var) {
        super(q3Var);
        this.x = q3Var;
    }

    @Override // kh.p3
    public final void F(boolean z10) {
        q3 q3Var = this.x;
        org.telegram.ui.ActionBar.w0 w0Var = q3Var.C;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        q3Var.s.e(z10, true);
    }

    @Override // f2.r0
    public final void l() {
        gw0 gw0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            gw0Var.setStickerType(11);
            gw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            gw0Var.setStickerType(1);
            gw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
