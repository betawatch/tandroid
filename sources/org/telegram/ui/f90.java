package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f90 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ j90 b;

    public /* synthetic */ f90(j90 j90Var, int i7) {
        this.a = i7;
        this.b = j90Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                j90 j90Var = this.b;
                if (!j90Var.N) {
                    if (editable.toString().equals("0")) {
                        j90Var.F.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                j90Var.b0(parseInt);
                                break;
                            } else {
                                j90Var.c0();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            j90Var.c0();
                            return;
                        }
                    }
                }
                break;
            default:
                org.telegram.messenger.i6.l(editable, this.b.K.getPaint().getFontMetricsInt(), false);
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
