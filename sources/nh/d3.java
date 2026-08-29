package nh;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qw0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d3 extends m3 {
    public final /* synthetic */ n3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(n3 n3Var) {
        super(n3Var);
        this.x = n3Var;
    }

    @Override // nh.m3
    public final void F(boolean z10) {
        n3 n3Var = this.x;
        org.telegram.ui.ActionBar.w0 w0Var = n3Var.C;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
        n3Var.s.e(z10, true);
    }

    @Override // f2.p0
    public final void l() {
        qw0 qw0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            qw0Var.setStickerType(11);
            qw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            qw0Var.setStickerType(1);
            qw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
