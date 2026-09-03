package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jb0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb0 b;

    public /* synthetic */ jb0(pb0 pb0Var, int i10) {
        this.a = i10;
        this.b = pb0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                Emoji.replaceEmoji(editable, this.b.H.getPaint().getFontMetricsInt(), false);
                break;
            default:
                pb0 pb0Var = this.b;
                if (!pb0Var.L) {
                    if (editable.toString().equals("0")) {
                        pb0Var.C.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                pb0Var.W(parseInt);
                                break;
                            } else {
                                pb0Var.X();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            pb0Var.X();
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
