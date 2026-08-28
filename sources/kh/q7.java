package kh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q7 implements TextWatcher {
    public final /* synthetic */ s7 a;

    public q7(s7 s7Var) {
        this.a = s7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i9;
        String obj = editable.toString();
        s7 s7Var = this.a;
        s7Var.o0 = obj;
        if (!s7Var.V) {
            String str = s7Var.t0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                s7Var.Y();
                String str2 = s7Var.o0;
                s7Var.s0 = str2 != null && str2.length() > 0;
            }
            String str3 = s7Var.E0;
            String str4 = s7Var.o0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                s7Var.X();
                String str5 = s7Var.o0;
                if (str5 != null && str5.length() > 3) {
                    i9 = ((org.telegram.ui.ActionBar.f3) s7Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i9).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                s7Var.z0 = z10;
            }
            m7 m7Var = s7Var.v0;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            AndroidUtilities.runOnUIThread(m7Var, 400L);
            m7 m7Var2 = s7Var.G0;
            AndroidUtilities.cancelRunOnUIThread(m7Var2);
            AndroidUtilities.runOnUIThread(m7Var2, 400L);
        }
        s7Var.m0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
