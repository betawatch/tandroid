package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j50 implements TextWatcher {
    public final /* synthetic */ k50 a;

    public j50(k50 k50Var) {
        this.a = k50Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        k50 k50Var = this.a;
        n50 n50Var = k50Var.h;
        if (k50Var.c != 0) {
            n50Var.getConnectionsManager().cancelRequest(k50Var.c, true);
            k50Var.c = 0;
        }
        i50 i50Var = k50Var.d;
        if (i50Var != null) {
            org.telegram.messenger.g0.r(i50Var);
        }
        k50Var.e = null;
        if (trim.isEmpty()) {
            n50.f0(n50Var, null);
            return;
        }
        i50 i50Var2 = new i50(0, this, trim);
        k50Var.d = i50Var2;
        org.telegram.messenger.g0.h3(i50Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
