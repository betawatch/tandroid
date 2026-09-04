package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class bj implements TextWatcher {
    public final /* synthetic */ gj a;

    public bj(gj gjVar) {
        this.a = gjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        gj gjVar = this.a;
        wi wiVar = gjVar.g0;
        TextUtils.isEmpty(gjVar.E);
        gjVar.E = editable.toString().trim();
        wi wiVar2 = gjVar.b0;
        AndroidUtilities.cancelRunOnUIThread(wiVar2);
        if (!TextUtils.isEmpty(gjVar.E)) {
            String str = gjVar.E;
            gjVar.a0 = str != null && str.length() >= 0;
            if (!TextUtils.equals(gjVar.W, gjVar.E)) {
                gjVar.M.clear();
                gjVar.c0 = 0;
                gjVar.d0 = false;
            }
            AndroidUtilities.runOnUIThread(wiVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(wiVar);
        if (!TextUtils.isEmpty(gjVar.E)) {
            String str2 = gjVar.E;
            gjVar.n0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(gjVar.b.J1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(gjVar.f0, gjVar.E)) {
                gjVar.N.clear();
                gjVar.h0 = false;
            }
            AndroidUtilities.runOnUIThread(wiVar, 1500L);
        }
        gjVar.P();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
