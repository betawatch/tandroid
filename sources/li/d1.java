package li;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d1 implements TextWatcher {
    public final /* synthetic */ g1 a;

    public d1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        g1 g1Var = this.a;
        if (g1Var.h || g1Var.c == null) {
            return;
        }
        if (!g1Var.E || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            f6.o(editable2, 0, editable.length(), 1, true, g1Var.L);
        }
        if (g1Var.w || g1Var.n || g1Var.r) {
            g1Var.c.Y(editable2);
            return;
        }
        g1Var.h = true;
        boolean z10 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z10 = true;
            }
        }
        g1Var.h = false;
        if (z10) {
            g1Var.c.t(g1Var);
        } else {
            g1Var.c.Y(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        f1 f1Var;
        g1 g1Var = this.a;
        if (g1Var.h || (f1Var = g1Var.c) == null) {
            return;
        }
        f1Var.k(i11, i12);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        g1 g1Var = this.a;
        g1Var.J = true;
        g1Var.q();
        g1Var.setLongClickable(g1Var.length() == 0);
    }
}
