package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class kq0 extends org.telegram.ui.ActionBar.e5 {
    public final il0 f = new il0(this, 11);
    public final /* synthetic */ tq0 h;

    public kq0(tq0 tq0Var) {
        this.h = tq0Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(ci.h2 h2Var) {
        this.h.b0(h2Var);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            il0 il0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(il0Var);
            AndroidUtilities.runOnUIThread(il0Var, 1200L);
            return;
        }
        tq0 tq0Var = this.h;
        tq0Var.f.clear();
        tq0Var.h.clear();
        tq0Var.v = null;
        tq0Var.s = true;
        tq0Var.r = false;
        if (tq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.m2) tq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(tq0Var.x, true);
            tq0Var.x = 0;
        }
        tq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        tq0Var.N.e(false, true);
        tq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
