package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w01 implements TextWatcher {
    public final /* synthetic */ d11 a;

    public w01(d11 d11Var) {
        this.a = d11Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        d11 d11Var = this.a;
        r6 r6Var = d11Var.n;
        if (d11Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            r6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            r6Var.setText("");
        }
        Utilities.Callback callback = d11Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = d11Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            d11Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
