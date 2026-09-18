package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        cu cuVar = q70Var.d;
        if (cuVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cuVar);
        }
        q70Var.e = null;
        if (trim.isEmpty()) {
            t70.a0(t70Var, null);
            return;
        }
        cu cuVar2 = new cu(24, this, trim);
        q70Var.d = cuVar2;
        AndroidUtilities.runOnUIThread(cuVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
