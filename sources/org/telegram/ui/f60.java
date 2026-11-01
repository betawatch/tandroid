package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f60 implements TextWatcher {
    public final /* synthetic */ g60 a;

    public f60(g60 g60Var) {
        this.a = g60Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        g60 g60Var = this.a;
        j60 j60Var = g60Var.h;
        if (g60Var.c != 0) {
            j60Var.getConnectionsManager().cancelRequest(g60Var.c, true);
            g60Var.c = 0;
        }
        org.telegram.ui.Components.voip.u uVar = g60Var.d;
        if (uVar != null) {
            org.telegram.messenger.i0.r(uVar);
        }
        g60Var.e = null;
        if (trim.isEmpty()) {
            j60.f0(j60Var, null);
            return;
        }
        org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(27, this, trim);
        g60Var.d = uVar2;
        org.telegram.messenger.i0.h3(uVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
