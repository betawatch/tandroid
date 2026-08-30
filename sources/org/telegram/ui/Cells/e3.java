package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.vt;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f3 d;

    public e3(f3 f3Var, int i10, vt vtVar, boolean z4) {
        this.d = f3Var;
        this.a = i10;
        this.b = vtVar;
        this.c = z4;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        f3 f3Var = this.d;
        boolean z4 = f3Var.a;
        int i10 = this.a;
        if (!z4) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                f3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                vt vtVar = this.b;
                vtVar.setText(subSequence);
                vtVar.setSelection(vtVar.length());
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
        org.telegram.ui.Components.j6 j6Var = f3Var.v;
        if (j6Var == null || i10 <= 0) {
            return;
        }
        j6Var.b();
        f3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
