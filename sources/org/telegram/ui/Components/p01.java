package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class p01 implements TextWatcher {
    public final /* synthetic */ w01 a;

    public p01(w01 w01Var) {
        this.a = w01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        w01 w01Var = this.a;
        q6 q6Var = w01Var.n;
        if (w01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            q6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            q6Var.setText("");
        }
        Utilities.Callback callback = w01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = w01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            w01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
