package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
