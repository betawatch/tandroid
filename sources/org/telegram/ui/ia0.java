package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ia0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma0 b;

    public /* synthetic */ ia0(ma0 ma0Var, int i10) {
        this.a = i10;
        this.b = ma0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                ma0 ma0Var = this.b;
                if (!ma0Var.N) {
                    if (editable.toString().equals("0")) {
                        ma0Var.F.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                ma0Var.a0(parseInt);
                                break;
                            } else {
                                ma0Var.b0();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            ma0Var.b0();
                            return;
                        }
                    }
                }
                break;
            default:
                org.telegram.messenger.k6.l(editable, this.b.K.getPaint().getFontMetricsInt(), false);
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
