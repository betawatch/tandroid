package ci;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        org.telegram.ui.ActionBar.w0 w0Var = x3Var.G;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        x3Var.s.e(z10, true);
    }

    @Override // s4.h0
    public final void l() {
        zw0 zw0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            zw0Var.setStickerType(11);
            zw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            zw0Var.setStickerType(1);
            zw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
