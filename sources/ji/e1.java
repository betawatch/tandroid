package ji;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class e1 implements TextWatcher {
    public final /* synthetic */ h1 a;

    public e1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        h1 h1Var = this.a;
        if (h1Var.h || h1Var.c == null) {
            return;
        }
        if (!h1Var.E || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            i6.o(editable2, 0, editable.length(), 1, true, h1Var.L);
        }
        if (h1Var.w || h1Var.n || h1Var.r) {
            h1Var.c.N(editable2);
            return;
        }
        h1Var.h = true;
        boolean z10 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z10 = true;
            }
        }
        h1Var.h = false;
        if (z10) {
            h1Var.c.C(h1Var);
        } else {
            h1Var.c.N(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        g1 g1Var;
        h1 h1Var = this.a;
        if (h1Var.h || (g1Var = h1Var.c) == null) {
            return;
        }
        g1Var.i(i11, i12);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        h1 h1Var = this.a;
        h1Var.J = true;
        h1Var.q();
        h1Var.setLongClickable(h1Var.length() == 0);
    }
}
