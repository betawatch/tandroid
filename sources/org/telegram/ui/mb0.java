package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class mb0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb0 b;

    public /* synthetic */ mb0(sb0 sb0Var, int i10) {
        this.a = i10;
        this.b = sb0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                Emoji.replaceEmoji(editable, this.b.K.getPaint().getFontMetricsInt(), false);
                break;
            default:
                sb0 sb0Var = this.b;
                if (!sb0Var.O) {
                    if (editable.toString().equals("0")) {
                        sb0Var.F.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                sb0Var.W(parseInt);
                                break;
                            } else {
                                sb0Var.X();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            sb0Var.X();
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
