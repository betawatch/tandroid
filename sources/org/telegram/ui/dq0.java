package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dq0 extends org.telegram.ui.ActionBar.k5 {
    public final oj0 r = new oj0(this, 13);
    public final /* synthetic */ mq0 s;

    public dq0(mq0 mq0Var) {
        this.s = mq0Var;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final boolean b() {
        this.s.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void p(ei.e2 e2Var) {
        this.s.b0(e2Var);
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            oj0 oj0Var = this.r;
            AndroidUtilities.cancelRunOnUIThread(oj0Var);
            AndroidUtilities.runOnUIThread(oj0Var, 1200L);
            return;
        }
        mq0 mq0Var = this.s;
        mq0Var.f.clear();
        mq0Var.h.clear();
        mq0Var.v = null;
        mq0Var.s = true;
        mq0Var.r = false;
        if (mq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.o2) mq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(mq0Var.x, true);
            mq0Var.x = 0;
        }
        mq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        mq0Var.N.e(false, true);
        mq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void n() {
    }
}
