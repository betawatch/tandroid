package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class aq0 extends org.telegram.ui.ActionBar.g5 {
    public final ck0 r = new ck0(this, 12);
    public final /* synthetic */ jq0 s;

    public aq0(jq0 jq0Var) {
        this.s = jq0Var;
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
            ck0 ck0Var = this.r;
            AndroidUtilities.cancelRunOnUIThread(ck0Var);
            AndroidUtilities.runOnUIThread(ck0Var, 1200L);
            return;
        }
        jq0 jq0Var = this.s;
        jq0Var.f.clear();
        jq0Var.h.clear();
        jq0Var.v = null;
        jq0Var.s = true;
        jq0Var.r = false;
        if (jq0Var.x != 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) jq0Var).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(jq0Var.x, true);
            jq0Var.x = 0;
        }
        jq0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        jq0Var.N.e(false, true);
        jq0Var.j0();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
