package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class lb0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb0 b;

    public /* synthetic */ lb0(rb0 rb0Var, int i10) {
        this.a = i10;
        this.b = rb0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                Emoji.replaceEmoji(editable, this.b.K.getPaint().getFontMetricsInt(), false);
                break;
            default:
                rb0 rb0Var = this.b;
                if (!rb0Var.O) {
                    if (editable.toString().equals("0")) {
                        rb0Var.F.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                rb0Var.W(parseInt);
                                break;
                            } else {
                                rb0Var.X();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            rb0Var.X();
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
