package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dz0 implements TextWatcher {
    public final /* synthetic */ kz0 a;

    public dz0(kz0 kz0Var) {
        this.a = kz0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        kz0 kz0Var = this.a;
        j6 j6Var = kz0Var.n;
        if (kz0Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            j6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            j6Var.setText("");
        }
        Utilities.Callback callback = kz0Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = kz0Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            kz0Var.d.W3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
