package ii;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class f1 implements TextWatcher {
    public final /* synthetic */ i1 a;

    public f1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        i1 i1Var = this.a;
        if (i1Var.h || i1Var.c == null) {
            return;
        }
        if (!i1Var.E || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            g6.o(editable2, 0, editable.length(), 1, true, i1Var.L);
        }
        if (i1Var.w || i1Var.n || i1Var.r) {
            i1Var.c.W(editable2);
            return;
        }
        i1Var.h = true;
        boolean z10 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z10 = true;
            }
        }
        i1Var.h = false;
        if (z10) {
            i1Var.c.m(i1Var);
        } else {
            i1Var.c.W(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        h1 h1Var;
        i1 i1Var = this.a;
        if (i1Var.h || (h1Var = i1Var.c) == null) {
            return;
        }
        h1Var.j(i11, i12);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        i1 i1Var = this.a;
        i1Var.J = true;
        i1Var.q();
        i1Var.setLongClickable(i1Var.length() == 0);
    }
}
