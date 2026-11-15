package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h50 implements TextWatcher {
    public final /* synthetic */ i50 a;

    public h50(i50 i50Var) {
        this.a = i50Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        i50 i50Var = this.a;
        l50 l50Var = i50Var.h;
        if (i50Var.c != 0) {
            l50Var.getConnectionsManager().cancelRequest(i50Var.c, true);
            i50Var.c = 0;
        }
        org.telegram.ui.Components.voip.u uVar = i50Var.d;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
        }
        i50Var.e = null;
        if (trim.isEmpty()) {
            l50.f0(l50Var, null);
            return;
        }
        org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(29, this, trim);
        i50Var.d = uVar2;
        org.telegram.messenger.g0.i3(uVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
