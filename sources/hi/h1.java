package hi;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h1 implements TextWatcher {
    public final /* synthetic */ k1 a;

    public h1(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        k1 k1Var = this.a;
        if (k1Var.h || k1Var.c == null) {
            return;
        }
        if (!k1Var.E || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            i6.o(editable2, 0, editable.length(), 1, true, k1Var.L);
        }
        if (k1Var.w || k1Var.n || k1Var.r) {
            k1Var.c.G(editable2);
            return;
        }
        k1Var.h = true;
        boolean z10 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z10 = true;
            }
        }
        k1Var.h = false;
        if (z10) {
            k1Var.c.x(k1Var);
        } else {
            k1Var.c.G(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        j1 j1Var;
        k1 k1Var = this.a;
        if (k1Var.h || (j1Var = k1Var.c) == null) {
            return;
        }
        j1Var.h(i11, i12);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k1 k1Var = this.a;
        k1Var.J = true;
        k1Var.q();
        k1Var.setLongClickable(k1Var.length() == 0);
    }
}
