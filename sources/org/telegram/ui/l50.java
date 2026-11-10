package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l50 implements TextWatcher {
    public final /* synthetic */ m50 a;

    public l50(m50 m50Var) {
        this.a = m50Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        m50 m50Var = this.a;
        p50 p50Var = m50Var.h;
        if (m50Var.c != 0) {
            p50Var.getConnectionsManager().cancelRequest(m50Var.c, true);
            m50Var.c = 0;
        }
        f10 f10Var = m50Var.d;
        if (f10Var != null) {
            org.telegram.messenger.g0.r(f10Var);
        }
        m50Var.e = null;
        if (trim.isEmpty()) {
            p50.f0(p50Var, null);
            return;
        }
        f10 f10Var2 = new f10(4, this, trim);
        m50Var.d = f10Var2;
        org.telegram.messenger.g0.i3(f10Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
