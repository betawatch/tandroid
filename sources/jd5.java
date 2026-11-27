// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jd5 implements TextWatcher {
    public final /* synthetic */ kd5 a;

    public jd5(kd5 kd5Var) {
        this.a = kd5Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        kd5 kd5Var = this.a;
        nd5 nd5Var = kd5Var.h;
        if (kd5Var.c != 0) {
            nd5Var.getConnectionsManager().cancelRequest(kd5Var.c, true);
            kd5Var.c = 0;
        }
        se4 se4Var = kd5Var.d;
        if (se4Var != null) {
            hl.r(se4Var);
        }
        kd5Var.e = null;
        if (trim.isEmpty()) {
            nd5Var.h0(null);
            return;
        }
        se4 se4Var2 = new se4(this, trim, (byte) 27);
        kd5Var.d = se4Var2;
        hl.d3(se4Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
