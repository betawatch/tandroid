package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ mt b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ g3 d;

    public f3(g3 g3Var, int i9, mt mtVar, boolean z10) {
        this.d = g3Var;
        this.a = i9;
        this.b = mtVar;
        this.c = z10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        g3 g3Var = this.d;
        boolean z10 = g3Var.a;
        int i9 = this.a;
        if (!z10) {
            if (i9 > 0 && editable != null && editable.length() > i9) {
                g3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i9);
                mt mtVar = this.b;
                mtVar.setText(subSequence);
                mtVar.setSelection(mtVar.length());
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
        org.telegram.ui.Components.i6 i6Var = g3Var.v;
        if (i6Var == null || i9 <= 0) {
            return;
        }
        i6Var.b();
        g3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
