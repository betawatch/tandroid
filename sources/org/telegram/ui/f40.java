package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f40 implements TextWatcher {
    public final /* synthetic */ d60 a;

    public f40(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        d60 d60Var = this.a;
        d60Var.x3.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i10 = d60Var.a0;
        if (codePointCount + 25 > i10) {
            str = "" + (i10 - codePointCount);
        } else {
            str = null;
        }
        d60Var.J.a();
        d60Var.J.setText(str);
        d60Var.J.setTextColor(codePointCount >= i10 ? -1280137 : -1);
        if (codePointCount > i10) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
