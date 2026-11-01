package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wo0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp0 b;

    public /* synthetic */ wo0(pp0 pp0Var, int i10) {
        this.a = i10;
        this.b = pp0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new vo0(this, i10));
                break;
            default:
                pp0 pp0Var = this.b;
                ip0 ip0Var = pp0Var.C1;
                ew0 ew0Var = pp0Var.I1;
                h10 h10Var = pp0Var.q2;
                if (!TextUtils.isEmpty(h10Var.r.getText())) {
                    pp0Var.K0(false);
                }
                if (pp0Var.s2) {
                    String obj = h10Var.r.getText().toString();
                    if (obj.length() != 0) {
                        if (ew0Var != null) {
                            ew0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
                        }
                    } else if (pp0Var.x1.getAdapter() != ip0Var) {
                        int J0 = pp0.J0(pp0Var);
                        ew0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
                        ew0Var.e(false, true);
                        pp0Var.K0(false);
                        ip0Var.f();
                        if (J0 > 0) {
                            pp0Var.z1.h1(0, -J0);
                        }
                    }
                    mp0 mp0Var = pp0Var.E1;
                    if (mp0Var != null) {
                        mp0Var.E(obj);
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
