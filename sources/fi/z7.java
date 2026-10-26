package fi;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class z7 implements TextWatcher {
    public final /* synthetic */ e2.q0 a;
    public final /* synthetic */ f8 b;

    public z7(f8 f8Var, e2.q0 q0Var) {
        this.b = f8Var;
        this.a = q0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        f8 f8Var = this.b;
        org.telegram.ui.Cells.g3 g3Var = f8Var.Y;
        if (f8Var.c0) {
            return;
        }
        if (!f8Var.d0 || editable == null) {
            f8.S(f8Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        f8Var.c0 = true;
        g3Var.d.setText(substring);
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        e3Var.setSelection(0, e3Var.getText().length());
        f8Var.c0 = false;
        f8Var.d0 = false;
        f8.S(f8Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        f8 f8Var = this.b;
        if (f8Var.c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        f8Var.d0 = z10;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
