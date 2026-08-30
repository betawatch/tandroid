package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ri implements TextWatcher {
    public final /* synthetic */ wi a;

    public ri(wi wiVar) {
        this.a = wiVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        wi wiVar = this.a;
        mi miVar = wiVar.d0;
        TextUtils.isEmpty(wiVar.B);
        wiVar.B = editable.toString().trim();
        mi miVar2 = wiVar.V;
        AndroidUtilities.cancelRunOnUIThread(miVar2);
        if (!TextUtils.isEmpty(wiVar.B)) {
            String str = wiVar.B;
            wiVar.U = str != null && str.length() >= 0;
            if (!TextUtils.equals(wiVar.T, wiVar.B)) {
                wiVar.J.clear();
                wiVar.W = 0;
                wiVar.a0 = false;
            }
            AndroidUtilities.runOnUIThread(miVar2, 1500L);
        }
        AndroidUtilities.cancelRunOnUIThread(miVar);
        if (!TextUtils.isEmpty(wiVar.B)) {
            String str2 = wiVar.B;
            wiVar.k0 = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(wiVar.b.G1).config.musicSearchUsername.get())) ? false : true;
            if (!TextUtils.equals(wiVar.c0, wiVar.B)) {
                wiVar.K.clear();
                wiVar.e0 = false;
            }
            AndroidUtilities.runOnUIThread(miVar, 1500L);
        }
        wiVar.P();
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
