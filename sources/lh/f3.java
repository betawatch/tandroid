package lh;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.iw0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class f3 extends o3 {
    public final /* synthetic */ p3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(p3 p3Var) {
        super(p3Var);
        this.x = p3Var;
    }

    @Override // lh.o3
    public final void F(boolean z10) {
        p3 p3Var = this.x;
        org.telegram.ui.ActionBar.v0 v0Var = p3Var.C;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
        p3Var.s.e(z10, true);
    }

    @Override // f2.q0
    public final void l() {
        iw0 iw0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            iw0Var.setStickerType(11);
            iw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            iw0Var.setStickerType(1);
            iw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
