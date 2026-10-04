package ci;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class n8 implements TextWatcher {
    public final /* synthetic */ ai.ba a;
    public final /* synthetic */ t8 b;

    public n8(t8 t8Var, ai.ba baVar) {
        this.b = t8Var;
        this.a = baVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        t8 t8Var = this.b;
        org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
        if (t8Var.c0) {
            return;
        }
        if (!t8Var.d0 || editable == null) {
            t8.Q(t8Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        t8Var.c0 = true;
        j3Var.b.setText(substring);
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setSelection(0, h3Var.getText().length());
        t8Var.c0 = false;
        t8Var.d0 = false;
        t8.Q(t8Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        t8 t8Var = this.b;
        if (t8Var.c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        t8Var.d0 = z10;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
