package bi;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jx0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class d4 extends o4 {
    public final /* synthetic */ p4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(p4 p4Var) {
        super(p4Var);
        this.x = p4Var;
    }

    @Override // bi.o4
    public final void F(boolean z10) {
        p4 p4Var = this.x;
        org.telegram.ui.ActionBar.w0 w0Var = p4Var.G;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        p4Var.s.e(z10, true);
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
