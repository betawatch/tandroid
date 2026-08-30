package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i70 implements TextWatcher {
    public final /* synthetic */ j70 a;

    public i70(j70 j70Var) {
        this.a = j70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        j70 j70Var = this.a;
        m70 m70Var = j70Var.h;
        if (j70Var.c != 0) {
            m70Var.getConnectionsManager().cancelRequest(j70Var.c, true);
            j70Var.c = 0;
        }
        g00 g00Var = j70Var.d;
        if (g00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g00Var);
        }
        j70Var.e = null;
        if (trim.isEmpty()) {
            m70.a0(m70Var, null);
            return;
        }
        g00 g00Var2 = new g00(8, this, trim);
        j70Var.d = g00Var2;
        AndroidUtilities.runOnUIThread(g00Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
