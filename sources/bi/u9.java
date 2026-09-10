package bi;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u9 implements TextWatcher {
    public final /* synthetic */ a1.e a;
    public final /* synthetic */ aa b;

    public u9(aa aaVar, a1.e eVar) {
        this.b = aaVar;
        this.a = eVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        aa aaVar = this.b;
        org.telegram.ui.Cells.i3 i3Var = aaVar.Y;
        if (aaVar.c0) {
            return;
        }
        if (!aaVar.d0 || editable == null) {
            aa.S(aaVar, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        aaVar.c0 = true;
        i3Var.b.setText(substring);
        org.telegram.ui.Cells.g3 g3Var = i3Var.b;
        g3Var.setSelection(0, g3Var.getText().length());
        aaVar.c0 = false;
        aaVar.d0 = false;
        aa.S(aaVar, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        aa aaVar = this.b;
        if (aaVar.c0) {
            return;
        }
        boolean z10 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z10 = true;
        }
        aaVar.d0 = z10;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
