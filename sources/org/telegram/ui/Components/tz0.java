package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class tz0 implements TextWatcher {
    public final /* synthetic */ a01 a;

    public tz0(a01 a01Var) {
        this.a = a01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        a01 a01Var = this.a;
        q6 q6Var = a01Var.n;
        if (a01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            q6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            q6Var.setText("");
        }
        Utilities.Callback callback = a01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = a01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            a01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
