package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class o70 implements TextWatcher {
    public final /* synthetic */ p70 a;

    public o70(p70 p70Var) {
        this.a = p70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        p70 p70Var = this.a;
        s70 s70Var = p70Var.h;
        if (p70Var.c != 0) {
            s70Var.getConnectionsManager().cancelRequest(p70Var.c, true);
            p70Var.c = 0;
        }
        m70 m70Var = p70Var.d;
        if (m70Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m70Var);
        }
        p70Var.e = null;
        if (trim.isEmpty()) {
            s70.a0(s70Var, null);
            return;
        }
        m70 m70Var2 = new m70(1, this, trim);
        p70Var.d = m70Var2;
        AndroidUtilities.runOnUIThread(m70Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
