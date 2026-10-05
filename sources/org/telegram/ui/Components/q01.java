package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class q01 implements TextWatcher {
    public final /* synthetic */ x01 a;

    public q01(x01 x01Var) {
        this.a = x01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        x01 x01Var = this.a;
        p6 p6Var = x01Var.n;
        if (x01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            p6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            p6Var.setText("");
        }
        Utilities.Callback callback = x01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = x01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            x01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
