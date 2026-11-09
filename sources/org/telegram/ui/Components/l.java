package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
