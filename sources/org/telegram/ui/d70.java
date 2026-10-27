package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d70 implements TextWatcher {
    public final /* synthetic */ e70 a;

    public d70(e70 e70Var) {
        this.a = e70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        e70 e70Var = this.a;
        h70 h70Var = e70Var.h;
        if (e70Var.c != 0) {
            h70Var.getConnectionsManager().cancelRequest(e70Var.c, true);
            e70Var.c = 0;
        }
        kz kzVar = e70Var.d;
        if (kzVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kzVar);
        }
        e70Var.e = null;
        if (trim.isEmpty()) {
            h70.b0(h70Var, null);
            return;
        }
        kz kzVar2 = new kz(13, this, trim);
        e70Var.d = kzVar2;
        AndroidUtilities.runOnUIThread(kzVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
