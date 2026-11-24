// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ib5 implements TextWatcher {
    public final /* synthetic */ jb5 a;

    public ib5(jb5 jb5Var) {
        this.a = jb5Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        jb5 jb5Var = this.a;
        mb5 mb5Var = jb5Var.h;
        if (jb5Var.c != 0) {
            mb5Var.getConnectionsManager().cancelRequest(jb5Var.c, true);
            jb5Var.c = 0;
        }
        vc4 vc4Var = jb5Var.d;
        if (vc4Var != null) {
            gl.r(vc4Var);
        }
        jb5Var.e = null;
        if (trim.isEmpty()) {
            mb5Var.h0(null);
            return;
        }
        vc4 vc4Var2 = new vc4(this, trim, (byte) 29);
        jb5Var.d = vc4Var2;
        gl.d3(vc4Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
