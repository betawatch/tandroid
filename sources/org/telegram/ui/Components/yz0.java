package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yz0 implements TextWatcher {
    public final /* synthetic */ f01 a;

    public yz0(f01 f01Var) {
        this.a = f01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        f01 f01Var = this.a;
        k6 k6Var = f01Var.n;
        if (f01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            k6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            k6Var.setText("");
        }
        Utilities.Callback callback = f01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = f01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            f01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
