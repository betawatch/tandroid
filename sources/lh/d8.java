package lh;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d8 implements TextWatcher {
    public final /* synthetic */ k7 a;
    public final /* synthetic */ j8 b;

    public d8(j8 j8Var, k7 k7Var) {
        this.b = j8Var;
        this.a = k7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        j8 j8Var = this.b;
        org.telegram.ui.Cells.g3 g3Var = j8Var.U;
        if (j8Var.Y) {
            return;
        }
        if (!j8Var.Z || editable == null) {
            j8.S(j8Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        j8Var.Y = true;
        g3Var.b.setText(substring);
        org.telegram.ui.Cells.e3 e3Var = g3Var.b;
        e3Var.setSelection(0, e3Var.getText().length());
        j8Var.Y = false;
        j8Var.Z = false;
        j8.S(j8Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        j8 j8Var = this.b;
        if (j8Var.Y) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        j8Var.Z = z10;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
