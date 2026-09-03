package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k70 implements TextWatcher {
    public final /* synthetic */ l70 a;

    public k70(l70 l70Var) {
        this.a = l70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        l70 l70Var = this.a;
        o70 o70Var = l70Var.h;
        if (l70Var.c != 0) {
            o70Var.getConnectionsManager().cancelRequest(l70Var.c, true);
            l70Var.c = 0;
        }
        w10 w10Var = l70Var.d;
        if (w10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w10Var);
        }
        l70Var.e = null;
        if (trim.isEmpty()) {
            o70.a0(o70Var, null);
            return;
        }
        w10 w10Var2 = new w10(7, this, trim);
        l70Var.d = w10Var2;
        AndroidUtilities.runOnUIThread(w10Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
