package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ot;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ot b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ i3 d;

    public h3(i3 i3Var, int i7, ot otVar, boolean z10) {
        this.d = i3Var;
        this.a = i7;
        this.b = otVar;
        this.c = z10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        i3 i3Var = this.d;
        boolean z10 = i3Var.a;
        int i7 = this.a;
        if (!z10) {
            if (i7 > 0 && editable != null && editable.length() > i7) {
                i3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i7);
                ot otVar = this.b;
                otVar.setText(subSequence);
                otVar.setSelection(otVar.length());
                i3Var.a = false;
            }
            i3Var.b(editable);
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
        org.telegram.ui.Components.n6 n6Var = i3Var.y;
        if (n6Var == null || i7 <= 0) {
            return;
        }
        n6Var.a();
        i3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
