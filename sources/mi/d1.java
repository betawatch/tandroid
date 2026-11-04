package mi;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class d1 implements TextWatcher {
    public final /* synthetic */ h1 a;

    public d1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        h1 h1Var = this.a;
        if (h1Var.d2 || h1Var.Z1 == null) {
            return;
        }
        if (!h1Var.l2 || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            d6.o(editable2, 0, editable.length(), 1, true, h1Var.s2);
        }
        if (h1Var.i2 || h1Var.e2 || h1Var.f2) {
            h1Var.Z1.B1(editable2);
            return;
        }
        h1Var.d2 = true;
        boolean z10 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z10 = true;
            }
        }
        h1Var.d2 = false;
        if (z10) {
            h1Var.Z1.V0(h1Var);
        } else {
            h1Var.Z1.B1(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        g1 g1Var;
        h1 h1Var = this.a;
        if (h1Var.d2 || (g1Var = h1Var.Z1) == null) {
            return;
        }
        g1Var.A(i10, i11);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        h1 h1Var = this.a;
        if (i10 > 0 && i11 == 0) {
            h1Var.t2 = SystemClock.uptimeMillis();
        }
        h1Var.q2 = true;
        h1Var.M();
        h1Var.setLongClickable(h1Var.length() == 0);
    }
}
