package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g60 implements TextWatcher {
    public final /* synthetic */ h60 a;

    public g60(h60 h60Var) {
        this.a = h60Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        h60 h60Var = this.a;
        k60 k60Var = h60Var.h;
        if (h60Var.c != 0) {
            k60Var.getConnectionsManager().cancelRequest(h60Var.c, true);
            h60Var.c = 0;
        }
        xs xsVar = h60Var.d;
        if (xsVar != null) {
            org.telegram.messenger.i0.r(xsVar);
        }
        h60Var.e = null;
        if (trim.isEmpty()) {
            k60.e0(k60Var, null);
            return;
        }
        xs xsVar2 = new xs(26, this, trim);
        h60Var.d = xsVar2;
        org.telegram.messenger.i0.h3(xsVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
