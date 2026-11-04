package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c50 implements TextWatcher {
    public final /* synthetic */ d50 a;

    public c50(d50 d50Var) {
        this.a = d50Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        d50 d50Var = this.a;
        g50 g50Var = d50Var.h;
        if (d50Var.c != 0) {
            g50Var.getConnectionsManager().cancelRequest(d50Var.c, true);
            d50Var.c = 0;
        }
        ly lyVar = d50Var.d;
        if (lyVar != null) {
            org.telegram.messenger.g0.r(lyVar);
        }
        d50Var.e = null;
        if (trim.isEmpty()) {
            g50.f0(g50Var, null);
            return;
        }
        ly lyVar2 = new ly(8, this, trim);
        d50Var.d = lyVar2;
        org.telegram.messenger.g0.i3(lyVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
