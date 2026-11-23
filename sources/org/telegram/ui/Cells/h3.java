package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ mt b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ i3 d;

    public h3(i3 i3Var, int i7, mt mtVar, boolean z10) {
        this.d = i3Var;
        this.a = i7;
        this.b = mtVar;
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
                mt mtVar = this.b;
                mtVar.setText(subSequence);
                mtVar.setSelection(mtVar.length());
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
        org.telegram.ui.Components.m6 m6Var = i3Var.y;
        if (m6Var == null || i7 <= 0) {
            return;
        }
        m6Var.a();
        i3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
