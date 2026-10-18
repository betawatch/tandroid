package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class o01 implements TextWatcher {
    public final /* synthetic */ v01 a;

    public o01(v01 v01Var) {
        this.a = v01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        v01 v01Var = this.a;
        q6 q6Var = v01Var.n;
        if (v01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            q6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            q6Var.setText("");
        }
        Utilities.Callback callback = v01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = v01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            v01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
