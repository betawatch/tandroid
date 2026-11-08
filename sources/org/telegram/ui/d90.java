package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d90 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ h90 b;

    public /* synthetic */ d90(h90 h90Var, int i7) {
        this.a = i7;
        this.b = h90Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                h90 h90Var = this.b;
                if (!h90Var.N) {
                    if (editable.toString().equals("0")) {
                        h90Var.F.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                h90Var.b0(parseInt);
                                break;
                            } else {
                                h90Var.c0();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            h90Var.c0();
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
