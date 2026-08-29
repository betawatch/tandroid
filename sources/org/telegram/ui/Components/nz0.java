package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nz0 implements TextWatcher {
    public final /* synthetic */ uz0 a;

    public nz0(uz0 uz0Var) {
        this.a = uz0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        uz0 uz0Var = this.a;
        o6 o6Var = uz0Var.n;
        if (uz0Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            o6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            o6Var.setText("");
        }
        Utilities.Callback callback = uz0Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = uz0Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            uz0Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
