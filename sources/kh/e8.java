package kh;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e8 implements TextWatcher {
    public final /* synthetic */ ih.j7 a;
    public final /* synthetic */ k8 b;

    public e8(k8 k8Var, ih.j7 j7Var) {
        this.b = k8Var;
        this.a = j7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        k8 k8Var = this.b;
        org.telegram.ui.Cells.j3 j3Var = k8Var.U;
        if (k8Var.Y) {
            return;
        }
        if (!k8Var.Z || editable == null) {
            k8.R(k8Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        k8Var.Y = true;
        j3Var.b.setText(substring);
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setSelection(0, h3Var.getText().length());
        k8Var.Y = false;
        k8Var.Z = false;
        k8.R(k8Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12;
        k8 k8Var = this.b;
        if (k8Var.Y) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i9 == 8 && charSequence.subSequence(0, i9).toString().equals("https://") && charSequence.length() >= (i12 = i11 + i9) && charSequence.subSequence(i9, i12).toString().startsWith("https://")) {
            z10 = true;
        }
        k8Var.Z = z10;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
