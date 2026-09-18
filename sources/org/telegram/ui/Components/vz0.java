package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vz0 implements TextWatcher {
    public final /* synthetic */ c01 a;

    public vz0(c01 c01Var) {
        this.a = c01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        c01 c01Var = this.a;
        n6 n6Var = c01Var.n;
        if (c01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            n6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            n6Var.setText("");
        }
        Utilities.Callback callback = c01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = c01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            c01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
