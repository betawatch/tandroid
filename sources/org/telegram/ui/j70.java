package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j70 implements TextWatcher {
    public final /* synthetic */ k70 a;

    public j70(k70 k70Var) {
        this.a = k70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        k70 k70Var = this.a;
        n70 n70Var = k70Var.h;
        if (k70Var.c != 0) {
            n70Var.getConnectionsManager().cancelRequest(k70Var.c, true);
            k70Var.c = 0;
        }
        v10 v10Var = k70Var.d;
        if (v10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v10Var);
        }
        k70Var.e = null;
        if (trim.isEmpty()) {
            n70.a0(n70Var, null);
            return;
        }
        v10 v10Var2 = new v10(7, this, trim);
        k70Var.d = v10Var2;
        AndroidUtilities.runOnUIThread(v10Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
