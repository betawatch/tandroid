package oi;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class a1 implements TextWatcher {
    public final /* synthetic */ e1 a;

    public a1(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        e1 e1Var = this.a;
        if (e1Var.i2 || e1Var.e2 == null) {
            return;
        }
        if (!e1Var.q2 || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            a6.o(editable2, 0, editable.length(), 1, true, e1Var.x2);
        }
        if (e1Var.n2 || e1Var.j2 || e1Var.k2) {
            e1Var.e2.b0(editable2);
            return;
        }
        e1Var.i2 = true;
        boolean z10 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z10 = true;
            }
        }
        e1Var.i2 = false;
        if (z10) {
            e1Var.e2.z(e1Var);
        } else {
            e1Var.e2.b0(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        d1 d1Var;
        e1 e1Var = this.a;
        if (e1Var.i2 || (d1Var = e1Var.e2) == null) {
            return;
        }
        d1Var.m(i10, i11);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        e1 e1Var = this.a;
        if (i10 > 0 && i11 == 0) {
            e1Var.y2 = SystemClock.uptimeMillis();
        }
        e1Var.v2 = true;
        e1Var.N();
        e1Var.setLongClickable(e1Var.length() == 0);
    }
}
