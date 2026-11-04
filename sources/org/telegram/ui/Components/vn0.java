package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vn0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    public /* synthetic */ vn0(oo0 oo0Var, int i3) {
        this.a = i3;
        this.b = oo0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new jb0(this, 27));
                break;
            default:
                oo0 oo0Var = this.b;
                ho0 ho0Var = oo0Var.D1;
                zu0 zu0Var = oo0Var.J1;
                n00 n00Var = oo0Var.r2;
                if (!TextUtils.isEmpty(n00Var.r.getText())) {
                    oo0Var.K0(false);
                }
                if (oo0Var.t2) {
                    String obj = n00Var.r.getText().toString();
                    if (obj.length() != 0) {
                        if (zu0Var != null) {
                            zu0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
                        }
                    } else if (oo0Var.y1.getAdapter() != ho0Var) {
                        int J0 = oo0.J0(oo0Var);
                        zu0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
                        zu0Var.e(false, true);
                        oo0Var.K0(false);
                        ho0Var.f();
                        if (J0 > 0) {
                            oo0Var.A1.h1(0, -J0);
                        }
                    }
                    lo0 lo0Var = oo0Var.F1;
                    if (lo0Var != null) {
                        lo0Var.E(obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
