package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g90 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ k90 b;

    public /* synthetic */ g90(k90 k90Var, int i7) {
        this.a = i7;
        this.b = k90Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                k90 k90Var = this.b;
                if (!k90Var.N) {
                    if (editable.toString().equals("0")) {
                        k90Var.F.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                k90Var.b0(parseInt);
                                break;
                            } else {
                                k90Var.c0();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            k90Var.c0();
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
