package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bz0 implements TextWatcher {
    public final /* synthetic */ iz0 a;

    public bz0(iz0 iz0Var) {
        this.a = iz0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        iz0 iz0Var = this.a;
        j6 j6Var = iz0Var.n;
        if (iz0Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            j6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            j6Var.setText("");
        }
        Utilities.Callback callback = iz0Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = iz0Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            iz0Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
