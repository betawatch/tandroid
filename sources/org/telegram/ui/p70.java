package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        yt ytVar = q70Var.d;
        if (ytVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ytVar);
        }
        q70Var.e = null;
        if (trim.isEmpty()) {
            t70.a0(t70Var, null);
            return;
        }
        yt ytVar2 = new yt(26, this, trim);
        q70Var.d = ytVar2;
        AndroidUtilities.runOnUIThread(ytVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
