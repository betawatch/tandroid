package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m70 implements TextWatcher {
    public final /* synthetic */ n70 a;

    public m70(n70 n70Var) {
        this.a = n70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        n70 n70Var = this.a;
        q70 q70Var = n70Var.h;
        if (n70Var.c != 0) {
            q70Var.getConnectionsManager().cancelRequest(n70Var.c, true);
            n70Var.c = 0;
        }
        hw hwVar = n70Var.d;
        if (hwVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hwVar);
        }
        n70Var.e = null;
        if (trim.isEmpty()) {
            q70.a0(q70Var, null);
            return;
        }
        hw hwVar2 = new hw(20, this, trim);
        n70Var.d = hwVar2;
        AndroidUtilities.runOnUIThread(hwVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
