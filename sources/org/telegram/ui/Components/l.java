package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l implements TextWatcher {
    public final /* synthetic */ g0 a;

    public l(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        f0 f0Var;
        g0 g0Var = this.a;
        f0 f0Var2 = g0Var.o2;
        if ((f0Var2 != null ? f0Var2.getSelectedTab() : 0) == 1 && (f0Var = g0Var.p2) != null && (f0Var.getSelectedTone() instanceof b0)) {
            g0Var.h1();
            g0Var.v1();
            g0Var.u1(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
