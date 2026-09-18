package ci;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class r8 implements TextWatcher {
    public final /* synthetic */ ai.ba a;
    public final /* synthetic */ x8 b;

    public r8(x8 x8Var, ai.ba baVar) {
        this.b = x8Var;
        this.a = baVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        x8 x8Var = this.b;
        org.telegram.ui.Cells.j3 j3Var = x8Var.Y;
        if (x8Var.c0) {
            return;
        }
        if (!x8Var.d0 || editable == null) {
            x8.S(x8Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        x8Var.c0 = true;
        j3Var.b.setText(substring);
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setSelection(0, h3Var.getText().length());
        x8Var.c0 = false;
        x8Var.d0 = false;
        x8.S(x8Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        x8 x8Var = this.b;
        if (x8Var.c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        x8Var.d0 = z10;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
