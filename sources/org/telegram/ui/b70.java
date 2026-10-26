package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b70 implements TextWatcher {
    public final /* synthetic */ c70 a;

    public b70(c70 c70Var) {
        this.a = c70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        c70 c70Var = this.a;
        f70 f70Var = c70Var.h;
        if (c70Var.c != 0) {
            f70Var.getConnectionsManager().cancelRequest(c70Var.c, true);
            c70Var.c = 0;
        }
        sz szVar = c70Var.d;
        if (szVar != null) {
            AndroidUtilities.cancelRunOnUIThread(szVar);
        }
        c70Var.e = null;
        if (trim.isEmpty()) {
            f70.b0(f70Var, null);
            return;
        }
        sz szVar2 = new sz(12, this, trim);
        c70Var.d = szVar2;
        AndroidUtilities.runOnUIThread(szVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
