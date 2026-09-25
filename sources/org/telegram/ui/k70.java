package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        tt ttVar = l70Var.d;
        if (ttVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ttVar);
        }
        l70Var.e = null;
        if (trim.isEmpty()) {
            o70.a0(o70Var, null);
            return;
        }
        tt ttVar2 = new tt(25, this, trim);
        l70Var.d = ttVar2;
        AndroidUtilities.runOnUIThread(ttVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
