package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class dj implements TextWatcher {
    public final /* synthetic */ jj a;

    public dj(jj jjVar) {
        this.a = jjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        jj jjVar = this.a;
        yi yiVar = jjVar.f0;
        TextUtils.isEmpty(jjVar.y);
        jjVar.y = editable.toString().trim();
        yi yiVar2 = jjVar.a0;
        AndroidUtilities.cancelRunOnUIThread(yiVar2);
        if (!TextUtils.isEmpty(jjVar.y)) {
            String str = jjVar.y;
            jjVar.W = str != null && str.length() >= 0;
            if (!TextUtils.equals(jjVar.V, jjVar.y)) {
                jjVar.L.clear();
                jjVar.b0 = 0;
                jjVar.c0 = false;
            }
            AndroidUtilities.runOnUIThread(yiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(yiVar);
        if (!TextUtils.isEmpty(jjVar.y)) {
            String str2 = jjVar.y;
            jjVar.m0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(jjVar.b.J1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(jjVar.e0, jjVar.y)) {
                jjVar.M.clear();
                jjVar.g0 = false;
            }
            AndroidUtilities.runOnUIThread(yiVar, 1500L);
        }
        jjVar.N();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
