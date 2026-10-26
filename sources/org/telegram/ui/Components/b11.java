package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b11 implements TextWatcher {
    public final /* synthetic */ i11 a;

    public b11(i11 i11Var) {
        this.a = i11Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        i11 i11Var = this.a;
        s6 s6Var = i11Var.n;
        if (i11Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            s6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            s6Var.setText("");
        }
        Utilities.Callback callback = i11Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = i11Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            i11Var.d.Z3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
