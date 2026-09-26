package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class e01 implements TextWatcher {
    public final /* synthetic */ l01 a;

    public e01(l01 l01Var) {
        this.a = l01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        l01 l01Var = this.a;
        p6 p6Var = l01Var.n;
        if (l01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            p6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            p6Var.setText("");
        }
        Utilities.Callback callback = l01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = l01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            l01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
