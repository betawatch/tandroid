package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class iq0 extends org.telegram.ui.ActionBar.s0 {
    public final lj0 a = new lj0(this, 14);
    public final /* synthetic */ rq0 b;

    public iq0(rq0 rq0Var) {
        this.b = rq0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean b() {
        this.b.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        this.b.c0(editTextBoldCursor);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            lj0 lj0Var = this.a;
            AndroidUtilities.cancelRunOnUIThread(lj0Var);
            AndroidUtilities.runOnUIThread(lj0Var, 1200L);
            return;
        }
        rq0 rq0Var = this.b;
        rq0Var.f.clear();
        rq0Var.h.clear();
        rq0Var.v = null;
        rq0Var.s = true;
        rq0Var.r = false;
        if (rq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.r2) rq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(rq0Var.x, true);
            rq0Var.x = 0;
        }
        rq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        rq0Var.N.e(false, true);
        rq0Var.k0();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
    }
}
