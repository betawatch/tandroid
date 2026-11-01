package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ha0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ la0 b;

    public /* synthetic */ ha0(la0 la0Var, int i10) {
        this.a = i10;
        this.b = la0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                la0 la0Var = this.b;
                if (!la0Var.N) {
                    if (editable.toString().equals("0")) {
                        la0Var.F.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                la0Var.b0(parseInt);
                                break;
                            } else {
                                la0Var.c0();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            la0Var.c0();
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
