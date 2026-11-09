package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class un0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ no0 b;

    public /* synthetic */ un0(no0 no0Var, int i7) {
        this.a = i7;
        this.b = no0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new pb0(this, 25));
                break;
            default:
                no0 no0Var = this.b;
                go0 go0Var = no0Var.C1;
                cv0 cv0Var = no0Var.I1;
                s00 s00Var = no0Var.q2;
                if (!TextUtils.isEmpty(s00Var.r.getText())) {
                    no0Var.K0(false);
                }
                if (no0Var.s2) {
                    String obj = s00Var.r.getText().toString();
                    if (obj.length() != 0) {
                        if (cv0Var != null) {
                            cv0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
                        }
                    } else if (no0Var.x1.getAdapter() != go0Var) {
                        int J0 = no0.J0(no0Var);
                        cv0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
                        cv0Var.e(false, true);
                        no0Var.K0(false);
                        go0Var.f();
                        if (J0 > 0) {
                            no0Var.z1.h1(0, -J0);
                        }
                    }
                    ko0 ko0Var = no0Var.E1;
                    if (ko0Var != null) {
                        ko0Var.E(obj);
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
