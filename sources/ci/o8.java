package ci;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class o8 implements TextWatcher {
    public final /* synthetic */ ai.ba a;
    public final /* synthetic */ u8 b;

    public o8(u8 u8Var, ai.ba baVar) {
        this.b = u8Var;
        this.a = baVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        u8 u8Var = this.b;
        org.telegram.ui.Cells.j3 j3Var = u8Var.Y;
        if (u8Var.c0) {
            return;
        }
        if (!u8Var.d0 || editable == null) {
            u8.S(u8Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        u8Var.c0 = true;
        j3Var.b.setText(substring);
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setSelection(0, h3Var.getText().length());
        u8Var.c0 = false;
        u8Var.d0 = false;
        u8.S(u8Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        u8 u8Var = this.b;
        if (u8Var.c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        u8Var.d0 = z10;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
