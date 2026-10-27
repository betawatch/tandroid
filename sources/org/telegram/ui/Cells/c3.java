package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ju;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ju b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ d3 d;

    public c3(d3 d3Var, int i10, ju juVar, boolean z10) {
        this.d = d3Var;
        this.a = i10;
        this.b = juVar;
        this.c = z10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        d3 d3Var = this.d;
        boolean z10 = d3Var.a;
        int i10 = this.a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                d3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                ju juVar = this.b;
                juVar.setText(subSequence);
                juVar.setSelection(juVar.length());
                d3Var.a = false;
            }
            d3Var.b(editable);
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
        org.telegram.ui.Components.r6 r6Var = d3Var.w;
        if (r6Var == null || i10 <= 0) {
            return;
        }
        r6Var.a();
        d3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
