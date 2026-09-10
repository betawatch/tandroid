package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g01 implements TextWatcher {
    public final /* synthetic */ n01 a;

    public g01(n01 n01Var) {
        this.a = n01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        n01 n01Var = this.a;
        o6 o6Var = n01Var.n;
        if (n01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            o6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            o6Var.setText("");
        }
        Utilities.Callback callback = n01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = n01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            n01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
