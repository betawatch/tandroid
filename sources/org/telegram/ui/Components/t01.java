package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class t01 implements TextWatcher {
    public final /* synthetic */ a11 a;

    public t01(a11 a11Var) {
        this.a = a11Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        a11 a11Var = this.a;
        s6 s6Var = a11Var.n;
        if (a11Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            s6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            s6Var.setText("");
        }
        Utilities.Callback callback = a11Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = a11Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            a11Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
