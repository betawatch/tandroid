package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class bq0 extends org.telegram.ui.ActionBar.g5 {
    public final ek0 r = new ek0(this, 12);
    public final /* synthetic */ kq0 s;

    public bq0(kq0 kq0Var) {
        this.s = kq0Var;
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
        kq0 kq0Var = this.s;
        kq0Var.f.clear();
        kq0Var.h.clear();
        kq0Var.v = null;
        kq0Var.s = true;
        kq0Var.r = false;
        if (kq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) kq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(kq0Var.x, true);
            kq0Var.x = 0;
        }
        kq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        kq0Var.N.e(false, true);
        kq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
