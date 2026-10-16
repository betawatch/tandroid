package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.nu;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class f3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ nu b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ g3 d;

    public f3(g3 g3Var, int i10, nu nuVar, boolean z10) {
        this.d = g3Var;
        this.a = i10;
        this.b = nuVar;
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
                nu nuVar = this.b;
                nuVar.setText(subSequence);
                nuVar.setSelection(nuVar.length());
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
        org.telegram.ui.Components.r6 r6Var = g3Var.v;
        if (r6Var == null || i10 <= 0) {
            return;
        }
        r6Var.a();
        g3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
