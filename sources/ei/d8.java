package ei;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        org.telegram.ui.Cells.i3 i3Var = j8Var.Y;
        if (j8Var.c0) {
            return;
        }
        if (!j8Var.d0 || editable == null) {
            j8.T(j8Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        j8Var.c0 = true;
        i3Var.b.setText(substring);
        org.telegram.ui.Cells.g3 g3Var = i3Var.b;
        g3Var.setSelection(0, g3Var.getText().length());
        j8Var.c0 = false;
        j8Var.d0 = false;
        j8.T(j8Var, substring);
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
