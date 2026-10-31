package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vo0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;

    public /* synthetic */ vo0(op0 op0Var, int i10) {
        this.a = i10;
        this.b = op0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new uo0(this, i10));
                break;
            default:
                op0 op0Var = this.b;
                hp0 hp0Var = op0Var.C1;
                dw0 dw0Var = op0Var.I1;
                h10 h10Var = op0Var.q2;
                if (!TextUtils.isEmpty(h10Var.r.getText())) {
                    op0Var.K0(false);
                }
                if (op0Var.s2) {
                    String obj = h10Var.r.getText().toString();
                    if (obj.length() != 0) {
                        if (dw0Var != null) {
                            dw0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
                        }
                    } else if (op0Var.x1.getAdapter() != hp0Var) {
                        int J0 = op0.J0(op0Var);
                        dw0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
                        dw0Var.e(false, true);
                        op0Var.K0(false);
                        hp0Var.f();
                        if (J0 > 0) {
                            op0Var.z1.h1(0, -J0);
                        }
                    }
                    lp0 lp0Var = op0Var.E1;
                    if (lp0Var != null) {
                        lp0Var.E(obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
