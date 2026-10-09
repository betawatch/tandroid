package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ru;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class f3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ru b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ g3 d;

    public f3(g3 g3Var, int i10, ru ruVar, boolean z10) {
        this.d = g3Var;
        this.a = i10;
        this.b = ruVar;
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
                ru ruVar = this.b;
                ruVar.setText(subSequence);
                ruVar.setSelection(ruVar.length());
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
        org.telegram.ui.Components.q6 q6Var = g3Var.v;
        if (q6Var == null || i10 <= 0) {
            return;
        }
        q6Var.a();
        g3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
