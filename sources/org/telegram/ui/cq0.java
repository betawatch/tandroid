package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class cq0 extends org.telegram.ui.ActionBar.g5 {
    public final ek0 r = new ek0(this, 12);
    public final /* synthetic */ lq0 s;

    public cq0(lq0 lq0Var) {
        this.s = lq0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean b() {
        this.s.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ei.e2 e2Var) {
        this.s.b0(e2Var);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            ek0 ek0Var = this.r;
            AndroidUtilities.cancelRunOnUIThread(ek0Var);
            AndroidUtilities.runOnUIThread(ek0Var, 1200L);
            return;
        }
        lq0 lq0Var = this.s;
        lq0Var.f.clear();
        lq0Var.h.clear();
        lq0Var.v = null;
        lq0Var.s = true;
        lq0Var.r = false;
        if (lq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) lq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(lq0Var.x, true);
            lq0Var.x = 0;
        }
        lq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        lq0Var.N.e(false, true);
        lq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
