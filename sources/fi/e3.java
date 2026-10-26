package fi;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ey0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e3 extends n3 {
    public final /* synthetic */ o3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(o3 o3Var) {
        super(o3Var);
        this.x = o3Var;
    }

    @Override // fi.n3
    public final void F(boolean z10) {
        o3 o3Var = this.x;
        org.telegram.ui.ActionBar.w0 w0Var = o3Var.G;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        o3Var.s.e(z10, true);
    }

    @Override // s4.h0
    public final void l() {
        ey0 ey0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            ey0Var.setStickerType(11);
            ey0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            ey0Var.setStickerType(1);
            ey0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
