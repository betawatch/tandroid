package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ej implements TextWatcher {
    public final /* synthetic */ jj a;

    public ej(jj jjVar) {
        this.a = jjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        jj jjVar = this.a;
        zi ziVar = jjVar.g0;
        TextUtils.isEmpty(jjVar.E);
        jjVar.E = editable.toString().trim();
        zi ziVar2 = jjVar.b0;
        AndroidUtilities.cancelRunOnUIThread(ziVar2);
        if (!TextUtils.isEmpty(jjVar.E)) {
            String str = jjVar.E;
            jjVar.a0 = str != null && str.length() >= 0;
            if (!TextUtils.equals(jjVar.W, jjVar.E)) {
                jjVar.M.clear();
                jjVar.c0 = 0;
                jjVar.d0 = false;
            }
            AndroidUtilities.runOnUIThread(ziVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(ziVar);
        if (!TextUtils.isEmpty(jjVar.E)) {
            String str2 = jjVar.E;
            jjVar.n0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(jjVar.b.J1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(jjVar.f0, jjVar.E)) {
                jjVar.N.clear();
                jjVar.h0 = false;
            }
            AndroidUtilities.runOnUIThread(ziVar, 1500L);
        }
        jjVar.P();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
