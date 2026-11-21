package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        ss ssVar = k50Var.d;
        if (ssVar != null) {
            org.telegram.messenger.g0.r(ssVar);
        }
        k50Var.e = null;
        if (trim.isEmpty()) {
            n50.f0(n50Var, null);
            return;
        }
        ss ssVar2 = new ss(26, this, trim);
        k50Var.d = ssVar2;
        org.telegram.messenger.g0.h3(ssVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
