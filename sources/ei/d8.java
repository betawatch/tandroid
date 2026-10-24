package ei;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class d8 implements TextWatcher {
    public final /* synthetic */ p6 a;
    public final /* synthetic */ j8 b;

    public d8(j8 j8Var, p6 p6Var) {
        this.b = j8Var;
        this.a = p6Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        j8 j8Var = this.b;
        org.telegram.ui.Cells.h3 h3Var = j8Var.Y;
        if (j8Var.c0) {
            return;
        }
        if (!j8Var.d0 || editable == null) {
            j8.S(j8Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        j8Var.c0 = true;
        h3Var.d.setText(substring);
        org.telegram.ui.Cells.f3 f3Var = h3Var.d;
        f3Var.setSelection(0, f3Var.getText().length());
        j8Var.c0 = false;
        j8Var.d0 = false;
        j8.S(j8Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        j8 j8Var = this.b;
        if (j8Var.c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        j8Var.d0 = z10;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
