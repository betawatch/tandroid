package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zz0 implements TextWatcher {
    public final /* synthetic */ g01 a;

    public zz0(g01 g01Var) {
        this.a = g01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        g01 g01Var = this.a;
        k6 k6Var = g01Var.n;
        if (g01Var.x) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() > 16) {
            k6Var.setText("-" + (trim.length() - 16));
            trim = trim.substring(0, 16);
        } else {
            k6Var.setText("");
        }
        Utilities.Callback callback = g01Var.w;
        if (callback != null) {
            callback.run(trim);
        }
        MessageObject messageObject = g01Var.r;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
            g01Var.d.X3(messageObject, null, false, false, false, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
