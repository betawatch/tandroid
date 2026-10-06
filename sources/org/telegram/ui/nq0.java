package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class nq0 extends org.telegram.ui.ActionBar.f5 {
    public final nl0 f = new nl0(this, 12);
    public final /* synthetic */ wq0 h;

    public nq0(wq0 wq0Var) {
        this.h = wq0Var;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void p(ci.h2 h2Var) {
        this.h.b0(h2Var);
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            nl0 nl0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(nl0Var);
            AndroidUtilities.runOnUIThread(nl0Var, 1200L);
            return;
        }
        wq0 wq0Var = this.h;
        wq0Var.f.clear();
        wq0Var.h.clear();
        wq0Var.v = null;
        wq0Var.s = true;
        wq0Var.r = false;
        if (wq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) wq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(wq0Var.x, true);
            wq0Var.x = 0;
        }
        wq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        wq0Var.N.e(false, true);
        wq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
    }
}
