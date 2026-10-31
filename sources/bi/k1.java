package bi;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class k1 implements TextWatcher {
    public final /* synthetic */ n1 a;

    public k1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        n1 n1Var = this.a;
        if (n1Var.c2 || n1Var.Y1 == null) {
            return;
        }
        if (!n1Var.k2 || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            s6.o(editable2, 0, editable.length(), 1, true, n1Var.r2);
        }
        if (n1Var.h2 || n1Var.d2 || n1Var.e2) {
            n1Var.Y1.B(editable2);
            return;
        }
        n1Var.c2 = true;
        boolean z10 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z10 = true;
            }
        }
        n1Var.c2 = false;
        if (z10) {
            n1Var.Y1.e(n1Var);
        } else {
            n1Var.Y1.B(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m1 m1Var;
        n1 n1Var = this.a;
        if (n1Var.c2 || (m1Var = n1Var.Y1) == null) {
            return;
        }
        m1Var.h(i11, i12);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        n1 n1Var = this.a;
        n1Var.p2 = true;
        n1Var.M();
        n1Var.setLongClickable(n1Var.length() == 0);
    }
}
