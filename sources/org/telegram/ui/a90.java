package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a90 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ e90 b;

    public /* synthetic */ a90(e90 e90Var, int i3) {
        this.a = i3;
        this.b = e90Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                e90 e90Var = this.b;
                if (!e90Var.O) {
                    if (editable.toString().equals("0")) {
                        e90Var.G.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                e90Var.b0(parseInt);
                                break;
                            } else {
                                e90Var.c0();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            e90Var.c0();
                            return;
                        }
                    }
                }
                break;
            default:
                org.telegram.messenger.i6.l(editable, this.b.L.getPaint().getFontMetricsInt(), false);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
