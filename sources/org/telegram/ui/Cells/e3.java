package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.cu;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class e3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ cu b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f3 d;

    public e3(f3 f3Var, int i10, cu cuVar, boolean z10) {
        this.d = f3Var;
        this.a = i10;
        this.b = cuVar;
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
                cu cuVar = this.b;
                cuVar.setText(subSequence);
                cuVar.setSelection(cuVar.length());
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
        org.telegram.ui.Components.o6 o6Var = f3Var.v;
        if (o6Var == null || i10 <= 0) {
            return;
        }
        o6Var.b();
        f3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
