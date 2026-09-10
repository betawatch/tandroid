package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        uv uvVar = p70Var.d;
        if (uvVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uvVar);
        }
        p70Var.e = null;
        if (trim.isEmpty()) {
            s70.a0(s70Var, null);
            return;
        }
        uv uvVar2 = new uv(23, this, trim);
        p70Var.d = uvVar2;
        AndroidUtilities.runOnUIThread(uvVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
