package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ mt b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ j3 d;

    public i3(j3 j3Var, int i10, mt mtVar, boolean z10) {
        this.d = j3Var;
        this.a = i10;
        this.b = mtVar;
        this.c = z10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        j3 j3Var = this.d;
        boolean z10 = j3Var.a;
        int i10 = this.a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                j3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                mt mtVar = this.b;
                mtVar.setText(subSequence);
                mtVar.setSelection(mtVar.length());
                j3Var.a = false;
            }
            j3Var.b(editable);
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
        org.telegram.ui.Components.e6 e6Var = j3Var.y;
        if (e6Var == null || i10 <= 0) {
            return;
        }
        e6Var.a();
        j3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
