package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s01 implements TextWatcher {
    public final /* synthetic */ z01 a;

    public s01(z01 z01Var) {
        this.a = z01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        z01 z01Var = this.a;
        s6 s6Var = z01Var.n;
        if (z01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            s6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            s6Var.setText("");
        }
        Utilities.Callback callback = z01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = z01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            z01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
