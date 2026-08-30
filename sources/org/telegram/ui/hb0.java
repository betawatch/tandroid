package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hb0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb0 b;

    public /* synthetic */ hb0(nb0 nb0Var, int i10) {
        this.a = i10;
        this.b = nb0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                Emoji.replaceEmoji(editable, this.b.H.getPaint().getFontMetricsInt(), false);
                break;
            default:
                nb0 nb0Var = this.b;
                if (!nb0Var.L) {
                    if (editable.toString().equals("0")) {
                        nb0Var.C.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                nb0Var.W(parseInt);
                                break;
                            } else {
                                nb0Var.X();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            nb0Var.X();
                        }
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
