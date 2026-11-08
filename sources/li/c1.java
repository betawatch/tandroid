package li;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class c1 implements TextWatcher {
    public final /* synthetic */ g1 a;

    public c1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        g1 g1Var = this.a;
        if (g1Var.c2 || g1Var.Y1 == null) {
            return;
        }
        if (!g1Var.k2 || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            c6.o(editable2, 0, editable.length(), 1, true, g1Var.r2);
        }
        if (g1Var.h2 || g1Var.d2 || g1Var.e2) {
            g1Var.Y1.f1(editable2);
            return;
        }
        g1Var.c2 = true;
        boolean z9 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z9 = true;
            }
        }
        g1Var.c2 = false;
        if (z9) {
            g1Var.Y1.F(g1Var);
        } else {
            g1Var.Y1.f1(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        f1 f1Var;
        g1 g1Var = this.a;
        if (g1Var.c2 || (f1Var = g1Var.Y1) == null) {
            return;
        }
        f1Var.w(i10, i11);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        g1 g1Var = this.a;
        if (i10 > 0 && i11 == 0) {
            g1Var.s2 = SystemClock.uptimeMillis();
        }
        g1Var.p2 = true;
        g1Var.M();
        g1Var.setLongClickable(g1Var.length() == 0);
    }
}
