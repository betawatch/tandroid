package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wn0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;

    public /* synthetic */ wn0(po0 po0Var, int i7) {
        this.a = i7;
        this.b = po0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new wa0(this, 28));
                break;
            default:
                po0 po0Var = this.b;
                io0 io0Var = po0Var.G1;
                cv0 cv0Var = po0Var.M1;
                v00 v00Var = po0Var.u2;
                if (!TextUtils.isEmpty(v00Var.r.getText())) {
                    po0Var.K0(false);
                }
                if (po0Var.w2) {
                    String obj = v00Var.r.getText().toString();
                    if (obj.length() != 0) {
                        if (cv0Var != null) {
                            cv0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
                        }
                    } else if (po0Var.B1.getAdapter() != io0Var) {
                        int J0 = po0.J0(po0Var);
                        cv0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
                        cv0Var.e(false, true);
                        po0Var.K0(false);
                        io0Var.f();
                        if (J0 > 0) {
                            po0Var.D1.h1(0, -J0);
                        }
                    }
                    mo0 mo0Var = po0Var.I1;
                    if (mo0Var != null) {
                        mo0Var.E(obj);
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
