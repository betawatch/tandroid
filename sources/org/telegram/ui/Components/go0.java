package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class go0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo0 b;

    public /* synthetic */ go0(zo0 zo0Var, int i7) {
        this.a = i7;
        this.b = zo0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new eb0(this, 28));
                break;
            default:
                zo0 zo0Var = this.b;
                so0 so0Var = zo0Var.G1;
                mv0 mv0Var = zo0Var.M1;
                c10 c10Var = zo0Var.u2;
                if (!TextUtils.isEmpty(c10Var.r.getText())) {
                    zo0Var.L0(false);
                }
                if (zo0Var.w2) {
                    String obj = c10Var.r.getText().toString();
                    if (obj.length() != 0) {
                        if (mv0Var != null) {
                            mv0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
                        }
                    } else if (zo0Var.B1.getAdapter() != so0Var) {
                        int K0 = zo0.K0(zo0Var);
                        mv0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
                        mv0Var.e(false, true);
                        zo0Var.L0(false);
                        so0Var.f();
                        if (K0 > 0) {
                            zo0Var.D1.h1(0, -K0);
                        }
                    }
                    wo0 wo0Var = zo0Var.I1;
                    if (wo0Var != null) {
                        wo0Var.E(obj);
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
