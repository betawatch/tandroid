package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class uz0 implements TextWatcher {
    public final /* synthetic */ b01 a;

    public uz0(b01 b01Var) {
        this.a = b01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        b01 b01Var = this.a;
        n6 n6Var = b01Var.n;
        if (b01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            n6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            n6Var.setText("");
        }
        Utilities.Callback callback = b01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = b01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            b01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
