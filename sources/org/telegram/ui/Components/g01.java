package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class g01 implements TextWatcher {
    public final /* synthetic */ n01 a;

    public g01(n01 n01Var) {
        this.a = n01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        n01 n01Var = this.a;
        p6 p6Var = n01Var.n;
        if (n01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            p6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            p6Var.setText("");
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
