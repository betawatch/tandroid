package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p30 implements TextWatcher {
    public final /* synthetic */ o50 a;

    public p30(o50 o50Var) {
        this.a = o50Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        o50 o50Var = this.a;
        o50Var.w3.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i9 = o50Var.Z;
        if (codePointCount + 25 > i9) {
            str = "" + (i9 - codePointCount);
        } else {
            str = null;
        }
        o50Var.I.a();
        o50Var.I.setText(str);
        o50Var.I.setTextColor(codePointCount >= i9 ? -1280137 : -1);
        if (codePointCount > i9) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
