package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ys;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h3 d;

    public g3(h3 h3Var, int i7, ys ysVar, boolean z9) {
        this.d = h3Var;
        this.a = i7;
        this.b = ysVar;
        this.c = z9;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z9 = h3Var.a;
        int i7 = this.a;
        if (!z9) {
            if (i7 > 0 && editable != null && editable.length() > i7) {
                h3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i7);
                ys ysVar = this.b;
                ysVar.setText(subSequence);
                ysVar.setSelection(ysVar.length());
                h3Var.a = false;
            }
            h3Var.b(editable);
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
        org.telegram.ui.Components.i6 i6Var = h3Var.y;
        if (i6Var == null || i7 <= 0) {
            return;
        }
        i6Var.a();
        h3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
