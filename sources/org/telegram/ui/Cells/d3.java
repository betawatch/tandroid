package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.iu;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class d3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ iu b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ e3 d;

    public d3(e3 e3Var, int i10, iu iuVar, boolean z10) {
        this.d = e3Var;
        this.a = i10;
        this.b = iuVar;
        this.c = z10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        e3 e3Var = this.d;
        boolean z10 = e3Var.a;
        int i10 = this.a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                e3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                iu iuVar = this.b;
                iuVar.setText(subSequence);
                iuVar.setSelection(iuVar.length());
                e3Var.a = false;
            }
            e3Var.b(editable);
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
        org.telegram.ui.Components.p6 p6Var = e3Var.w;
        if (p6Var == null || i10 <= 0) {
            return;
        }
        p6Var.a();
        e3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
