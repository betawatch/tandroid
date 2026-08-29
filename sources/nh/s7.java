package nh;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class s7 implements TextWatcher {
    public final /* synthetic */ b6 a;
    public final /* synthetic */ y7 b;

    public s7(y7 y7Var, b6 b6Var) {
        this.b = y7Var;
        this.a = b6Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        y7 y7Var = this.b;
        org.telegram.ui.Cells.g3 g3Var = y7Var.U;
        if (y7Var.Y) {
            return;
        }
        if (!y7Var.Z || editable == null) {
            y7.S(y7Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        y7Var.Y = true;
        g3Var.b.setText(substring);
        org.telegram.ui.Cells.e3 e3Var = g3Var.b;
        e3Var.setSelection(0, e3Var.getText().length());
        y7Var.Y = false;
        y7Var.Z = false;
        y7.S(y7Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        y7 y7Var = this.b;
        if (y7Var.Y) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        y7Var.Z = z10;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
