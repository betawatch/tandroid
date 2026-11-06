package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class i50 implements TextWatcher {
    public final /* synthetic */ j50 a;

    public i50(j50 j50Var) {
        this.a = j50Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        j50 j50Var = this.a;
        m50 m50Var = j50Var.h;
        if (j50Var.c != 0) {
            m50Var.getConnectionsManager().cancelRequest(j50Var.c, true);
            j50Var.c = 0;
        }
        q10 q10Var = j50Var.d;
        if (q10Var != null) {
            org.telegram.messenger.g0.r(q10Var);
        }
        j50Var.e = null;
        if (trim.isEmpty()) {
            m50.f0(m50Var, null);
            return;
        }
        q10 q10Var2 = new q10(3, this, trim);
        j50Var.d = q10Var2;
        org.telegram.messenger.g0.i3(q10Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
