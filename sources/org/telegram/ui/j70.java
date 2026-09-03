package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        z10 z10Var = k70Var.d;
        if (z10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z10Var);
        }
        k70Var.e = null;
        if (trim.isEmpty()) {
            n70.a0(n70Var, null);
            return;
        }
        z10 z10Var2 = new z10(6, this, trim);
        k70Var.d = z10Var2;
        AndroidUtilities.runOnUIThread(z10Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
