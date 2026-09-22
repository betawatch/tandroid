package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.bu;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class g3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ bu b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h3 d;

    public g3(h3 h3Var, int i10, bu buVar, boolean z10) {
        this.d = h3Var;
        this.a = i10;
        this.b = buVar;
        this.c = z10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z10 = h3Var.a;
        int i10 = this.a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                h3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                bu buVar = this.b;
                buVar.setText(subSequence);
                buVar.setSelection(buVar.length());
                h3Var.a = false;
            }
            h3Var.b();
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
        org.telegram.ui.Components.n6 n6Var = h3Var.v;
        if (n6Var == null || i10 <= 0) {
            return;
        }
        n6Var.b();
        h3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
