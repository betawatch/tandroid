package ei;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rx0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class g3 extends p3 {
    public final /* synthetic */ q3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(q3 q3Var) {
        super(q3Var);
        this.x = q3Var;
    }

    @Override // ei.p3
    public final void F(boolean z10) {
        q3 q3Var = this.x;
        org.telegram.ui.ActionBar.u0 u0Var = q3Var.G;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
        q3Var.s.e(z10, true);
    }

    @Override // s4.g0
    public final void l() {
        rx0 rx0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            rx0Var.setStickerType(11);
            rx0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            rx0Var.setStickerType(1);
            rx0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
