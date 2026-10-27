package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kq0 extends org.telegram.ui.ActionBar.s0 {
    public final nj0 a = new nj0(this, 14);
    public final /* synthetic */ tq0 b;

    public kq0(tq0 tq0Var) {
        this.b = tq0Var;
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
            nj0 nj0Var = this.a;
            AndroidUtilities.cancelRunOnUIThread(nj0Var);
            AndroidUtilities.runOnUIThread(nj0Var, 1200L);
            return;
        }
        tq0 tq0Var = this.b;
        tq0Var.f.clear();
        tq0Var.h.clear();
        tq0Var.v = null;
        tq0Var.s = true;
        tq0Var.r = false;
        if (tq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.r2) tq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(tq0Var.x, true);
            tq0Var.x = 0;
        }
        tq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        tq0Var.N.e(false, true);
        tq0Var.k0();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
    }
}
