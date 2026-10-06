package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class o70 implements TextWatcher {
    public final /* synthetic */ p70 a;

    public o70(p70 p70Var) {
        this.a = p70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        p70 p70Var = this.a;
        s70 s70Var = p70Var.h;
        if (p70Var.c != 0) {
            s70Var.getConnectionsManager().cancelRequest(p70Var.c, true);
            p70Var.c = 0;
        }
        cu cuVar = p70Var.d;
        if (cuVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cuVar);
        }
        p70Var.e = null;
        if (trim.isEmpty()) {
            s70.Z(s70Var, null);
            return;
        }
        cu cuVar2 = new cu(23, this, trim);
        p70Var.d = cuVar2;
        AndroidUtilities.runOnUIThread(cuVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
