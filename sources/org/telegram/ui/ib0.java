package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ib0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob0 b;

    public /* synthetic */ ib0(ob0 ob0Var, int i10) {
        this.a = i10;
        this.b = ob0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                Emoji.replaceEmoji(editable, this.b.H.getPaint().getFontMetricsInt(), false);
                break;
            default:
                ob0 ob0Var = this.b;
                if (!ob0Var.L) {
                    if (editable.toString().equals("0")) {
                        ob0Var.C.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                ob0Var.W(parseInt);
                                break;
                            } else {
                                ob0Var.X();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            ob0Var.X();
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
