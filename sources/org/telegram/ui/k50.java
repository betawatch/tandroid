package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k50 implements TextWatcher {
    public final /* synthetic */ l50 a;

    public k50(l50 l50Var) {
        this.a = l50Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        l50 l50Var = this.a;
        o50 o50Var = l50Var.h;
        if (l50Var.c != 0) {
            o50Var.getConnectionsManager().cancelRequest(l50Var.c, true);
            l50Var.c = 0;
        }
        s10 s10Var = l50Var.d;
        if (s10Var != null) {
            org.telegram.messenger.g0.r(s10Var);
        }
        l50Var.e = null;
        if (trim.isEmpty()) {
            o50.f0(o50Var, null);
            return;
        }
        s10 s10Var2 = new s10(3, this, trim);
        l50Var.d = s10Var2;
        org.telegram.messenger.g0.i3(s10Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
