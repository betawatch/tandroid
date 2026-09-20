package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class f01 implements TextWatcher {
    public final /* synthetic */ m01 a;

    public f01(m01 m01Var) {
        this.a = m01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m01 m01Var = this.a;
        o6 o6Var = m01Var.n;
        if (m01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            o6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            o6Var.setText("");
        }
        Utilities.Callback callback = m01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = m01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            m01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
