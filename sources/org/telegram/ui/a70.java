package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a70 implements TextWatcher {
    public final /* synthetic */ b70 a;

    public a70(b70 b70Var) {
        this.a = b70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        b70 b70Var = this.a;
        e70 e70Var = b70Var.h;
        if (b70Var.c != 0) {
            e70Var.getConnectionsManager().cancelRequest(b70Var.c, true);
            b70Var.c = 0;
        }
        ot otVar = b70Var.d;
        if (otVar != null) {
            AndroidUtilities.cancelRunOnUIThread(otVar);
        }
        b70Var.e = null;
        if (trim.isEmpty()) {
            e70.a0(e70Var, null);
            return;
        }
        ot otVar2 = new ot(25, this, trim);
        b70Var.d = otVar2;
        AndroidUtilities.runOnUIThread(otVar2, 300L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
