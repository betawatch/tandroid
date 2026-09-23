package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lq0 extends org.telegram.ui.ActionBar.f5 {
    public final jl0 f = new jl0(this, 11);
    public final /* synthetic */ uq0 h;

    public lq0(uq0 uq0Var) {
        this.h = uq0Var;
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
            jl0 jl0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(jl0Var);
            AndroidUtilities.runOnUIThread(jl0Var, 1200L);
            return;
        }
        uq0 uq0Var = this.h;
        uq0Var.f.clear();
        uq0Var.h.clear();
        uq0Var.v = null;
        uq0Var.s = true;
        uq0Var.r = false;
        if (uq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) uq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(uq0Var.x, true);
            uq0Var.x = 0;
        }
        uq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        uq0Var.N.e(false, true);
        uq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
    }
}
