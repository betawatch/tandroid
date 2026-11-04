package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h3 d;

    public g3(h3 h3Var, int i3, xs xsVar, boolean z10) {
        this.d = h3Var;
        this.a = i3;
        this.b = xsVar;
        this.c = z10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z10 = h3Var.a;
        int i3 = this.a;
        if (!z10) {
            if (i3 > 0 && editable != null && editable.length() > i3) {
                h3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i3);
                xs xsVar = this.b;
                xsVar.setText(subSequence);
                xsVar.setSelection(xsVar.length());
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
        org.telegram.ui.Components.g6 g6Var = h3Var.y;
        if (g6Var == null || i3 <= 0) {
            return;
        }
        g6Var.a();
        h3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
