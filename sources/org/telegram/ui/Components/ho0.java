package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ho0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ ho0(ap0 ap0Var, int i7) {
        this.a = i7;
        this.b = ap0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new hb0(this, 28));
                break;
            default:
                ap0 ap0Var = this.b;
                to0 to0Var = ap0Var.G1;
                nv0 nv0Var = ap0Var.M1;
                e10 e10Var = ap0Var.u2;
                if (!TextUtils.isEmpty(e10Var.r.getText())) {
                    ap0Var.L0(false);
                }
                if (ap0Var.w2) {
                    String obj = e10Var.r.getText().toString();
                    if (obj.length() != 0) {
                        if (nv0Var != null) {
                            nv0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
                        }
                    } else if (ap0Var.B1.getAdapter() != to0Var) {
                        int K0 = ap0.K0(ap0Var);
                        nv0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
                        nv0Var.e(false, true);
                        ap0Var.L0(false);
                        to0Var.f();
                        if (K0 > 0) {
                            ap0Var.D1.h1(0, -K0);
                        }
                    }
                    xo0 xo0Var = ap0Var.I1;
                    if (xo0Var != null) {
                        xo0Var.E(obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
