package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.cu;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class f3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ cu b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ g3 d;

    public f3(g3 g3Var, int i10, cu cuVar, boolean z10) {
        this.d = g3Var;
        this.a = i10;
        this.b = cuVar;
        this.c = z10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        g3 g3Var = this.d;
        boolean z10 = g3Var.a;
        int i10 = this.a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                g3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                cu cuVar = this.b;
                cuVar.setText(subSequence);
                cuVar.setSelection(cuVar.length());
                g3Var.a = false;
            }
            g3Var.b();
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
        org.telegram.ui.Components.o6 o6Var = g3Var.v;
        if (o6Var == null || i10 <= 0) {
            return;
        }
        o6Var.b();
        g3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
