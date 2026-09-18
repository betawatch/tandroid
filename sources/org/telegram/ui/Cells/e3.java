package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.bu;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ bu b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f3 d;

    public e3(f3 f3Var, int i10, bu buVar, boolean z10) {
        this.d = f3Var;
        this.a = i10;
        this.b = buVar;
        this.c = z10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        f3 f3Var = this.d;
        boolean z10 = f3Var.a;
        int i10 = this.a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                f3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                bu buVar = this.b;
                buVar.setText(subSequence);
                buVar.setSelection(buVar.length());
                f3Var.a = false;
            }
            f3Var.b();
        }
        if (this.c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                } else {
                    editable.delete(indexOf, indexOf + 1);
                }
            }
        }
        org.telegram.ui.Components.m6 m6Var = f3Var.v;
        if (m6Var == null || i10 <= 0) {
            return;
        }
        m6Var.b();
        f3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
