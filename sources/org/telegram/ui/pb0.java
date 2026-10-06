package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class pb0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb0 b;

    public /* synthetic */ pb0(vb0 vb0Var, int i10) {
        this.a = i10;
        this.b = vb0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                Emoji.replaceEmoji(editable, this.b.K.getPaint().getFontMetricsInt(), false);
                break;
            default:
                vb0 vb0Var = this.b;
                if (!vb0Var.O) {
                    if (editable.toString().equals("0")) {
                        vb0Var.F.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                vb0Var.U(parseInt);
                                break;
                            } else {
                                vb0Var.W();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            vb0Var.W();
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
