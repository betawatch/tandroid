// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gd5 implements TextWatcher {
    public final /* synthetic */ hd5 a;

    public gd5(hd5 hd5Var) {
        this.a = hd5Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        hd5 hd5Var = this.a;
        kd5 kd5Var = hd5Var.h;
        if (hd5Var.c != 0) {
            kd5Var.getConnectionsManager().cancelRequest(hd5Var.c, true);
            hd5Var.c = 0;
        }
        fd5 fd5Var = hd5Var.d;
        if (fd5Var != null) {
            gm.r(fd5Var);
        }
        hd5Var.e = null;
        if (trim.isEmpty()) {
            kd5Var.i0(null);
            return;
        }
        fd5 fd5Var2 = new fd5(this, trim, (byte) 0);
        hd5Var.d = fd5Var2;
        gm.d3(fd5Var2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
