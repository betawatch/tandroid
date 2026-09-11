package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class q70 implements TextWatcher {
    public final /* synthetic */ r70 a;

    public q70(r70 r70Var) {
        this.a = r70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        r70 r70Var = this.a;
        u70 u70Var = r70Var.h;
        if (r70Var.c != 0) {
            u70Var.getConnectionsManager().cancelRequest(r70Var.c, true);
            r70Var.c = 0;
        }
        yt ytVar = r70Var.d;
        if (ytVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ytVar);
        }
        r70Var.e = null;
        if (trim.isEmpty()) {
            u70.a0(u70Var, null);
            return;
        }
        yt ytVar2 = new yt(26, this, trim);
        r70Var.d = ytVar2;
        AndroidUtilities.runOnUIThread(ytVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
