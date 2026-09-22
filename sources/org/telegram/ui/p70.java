package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class p70 implements TextWatcher {
    public final /* synthetic */ q70 a;

    public p70(q70 q70Var) {
        this.a = q70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        q70 q70Var = this.a;
        t70 t70Var = q70Var.h;
        if (q70Var.c != 0) {
            t70Var.getConnectionsManager().cancelRequest(q70Var.c, true);
            q70Var.c = 0;
        }
        kw kwVar = q70Var.d;
        if (kwVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kwVar);
        }
        q70Var.e = null;
        if (trim.isEmpty()) {
            t70.a0(t70Var, null);
            return;
        }
        kw kwVar2 = new kw(20, this, trim);
        q70Var.d = kwVar2;
        AndroidUtilities.runOnUIThread(kwVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
