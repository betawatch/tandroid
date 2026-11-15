package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ft;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ft b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h3 d;

    public g3(h3 h3Var, int i7, ft ftVar, boolean z10) {
        this.d = h3Var;
        this.a = i7;
        this.b = ftVar;
        this.c = z10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z10 = h3Var.a;
        int i7 = this.a;
        if (!z10) {
            if (i7 > 0 && editable != null && editable.length() > i7) {
                h3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i7);
                ft ftVar = this.b;
                ftVar.setText(subSequence);
                ftVar.setSelection(ftVar.length());
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
        if (g6Var == null || i7 <= 0) {
            return;
        }
        g6Var.a();
        h3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
