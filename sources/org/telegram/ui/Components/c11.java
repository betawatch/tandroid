package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c11 implements TextWatcher {
    public final /* synthetic */ j11 a;

    public c11(j11 j11Var) {
        this.a = j11Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        j11 j11Var = this.a;
        s6 s6Var = j11Var.n;
        if (j11Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            s6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            s6Var.setText("");
        }
        Utilities.Callback callback = j11Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = j11Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            j11Var.d.Z3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
