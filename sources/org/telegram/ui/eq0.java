package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class eq0 extends org.telegram.ui.ActionBar.h5 {
    public final gl0 f = new gl0(this, 11);
    public final /* synthetic */ mq0 h;

    public eq0(mq0 mq0Var) {
        this.h = mq0Var;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void p(kg.f fVar) {
        this.h.b0(fVar);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() != 0) {
            gl0 gl0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(gl0Var);
            AndroidUtilities.runOnUIThread(gl0Var, 1200L);
            return;
        }
        mq0 mq0Var = this.h;
        mq0Var.f.clear();
        mq0Var.h.clear();
        mq0Var.v = null;
        mq0Var.s = true;
        mq0Var.r = false;
        if (mq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) mq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(mq0Var.x, true);
            mq0Var.x = 0;
        }
        mq0Var.K.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        mq0Var.K.e(false, true);
        mq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
    }
}
