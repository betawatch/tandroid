package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e90 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ i90 b;

    public /* synthetic */ e90(i90 i90Var, int i7) {
        this.a = i7;
        this.b = i90Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                i90 i90Var = this.b;
                if (!i90Var.O) {
                    if (editable.toString().equals("0")) {
                        i90Var.G.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                i90Var.b0(parseInt);
                                break;
                            } else {
                                i90Var.c0();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            i90Var.c0();
                            return;
                        }
                    }
                }
                break;
            default:
                org.telegram.messenger.j6.l(editable, this.b.L.getPaint().getFontMetricsInt(), false);
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
