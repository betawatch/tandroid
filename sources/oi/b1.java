package oi;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class b1 implements TextWatcher {
    public final /* synthetic */ f1 a;

    public b1(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        f1 f1Var = this.a;
        if (f1Var.i2 || f1Var.e2 == null) {
            return;
        }
        if (!f1Var.q2 || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            c6.o(editable2, 0, editable.length(), 1, true, f1Var.x2);
        }
        if (f1Var.n2 || f1Var.j2 || f1Var.k2) {
            f1Var.e2.s1(editable2);
            return;
        }
        f1Var.i2 = true;
        boolean z10 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z10 = true;
            }
        }
        f1Var.i2 = false;
        if (z10) {
            f1Var.e2.x0(f1Var);
        } else {
            f1Var.e2.s1(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        e1 e1Var;
        f1 f1Var = this.a;
        if (f1Var.i2 || (e1Var = f1Var.e2) == null) {
            return;
        }
        e1Var.A(i10, i11);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        f1 f1Var = this.a;
        if (i10 > 0 && i11 == 0) {
            f1Var.y2 = SystemClock.uptimeMillis();
        }
        f1Var.v2 = true;
        f1Var.N();
        f1Var.setLongClickable(f1Var.length() == 0);
    }
}
