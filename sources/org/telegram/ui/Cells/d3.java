package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ut;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ut b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ e3 d;

    public d3(e3 e3Var, int i10, ut utVar, boolean z4) {
        this.d = e3Var;
        this.a = i10;
        this.b = utVar;
        this.c = z4;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        e3 e3Var = this.d;
        boolean z4 = e3Var.a;
        int i10 = this.a;
        if (!z4) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                e3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                ut utVar = this.b;
                utVar.setText(subSequence);
                utVar.setSelection(utVar.length());
                e3Var.a = false;
            }
            e3Var.b();
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
        org.telegram.ui.Components.j6 j6Var = e3Var.v;
        if (j6Var == null || i10 <= 0) {
            return;
        }
        j6Var.b();
        e3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
