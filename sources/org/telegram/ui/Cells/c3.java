package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.lt;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ lt b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ d3 d;

    public c3(d3 d3Var, int i10, lt ltVar, boolean z10) {
        this.d = d3Var;
        this.a = i10;
        this.b = ltVar;
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
                lt ltVar = this.b;
                ltVar.setText(subSequence);
                ltVar.setSelection(ltVar.length());
                d3Var.a = false;
            }
            d3Var.b();
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
        org.telegram.ui.Components.i6 i6Var = d3Var.v;
        if (i6Var == null || i10 <= 0) {
            return;
        }
        i6Var.b();
        d3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
