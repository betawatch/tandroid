package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class h01 implements TextWatcher {
    public final /* synthetic */ o01 a;

    public h01(o01 o01Var) {
        this.a = o01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        o01 o01Var = this.a;
        o6 o6Var = o01Var.n;
        if (o01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            o6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            o6Var.setText("");
        }
        Utilities.Callback callback = o01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = o01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            o01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
