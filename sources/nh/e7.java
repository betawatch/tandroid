package nh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e7 implements TextWatcher {
    public final /* synthetic */ g7 a;

    public e7(g7 g7Var) {
        this.a = g7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        g7 g7Var = this.a;
        g7Var.o0 = obj;
        if (!g7Var.V) {
            String str = g7Var.t0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                g7Var.Z();
                String str2 = g7Var.o0;
                g7Var.s0 = str2 != null && str2.length() > 0;
            }
            String str3 = g7Var.E0;
            String str4 = g7Var.o0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                g7Var.Y();
                String str5 = g7Var.o0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.f3) g7Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                g7Var.z0 = z10;
            }
            a7 a7Var = g7Var.v0;
            AndroidUtilities.cancelRunOnUIThread(a7Var);
            AndroidUtilities.runOnUIThread(a7Var, 400L);
            a7 a7Var2 = g7Var.G0;
            AndroidUtilities.cancelRunOnUIThread(a7Var2);
            AndroidUtilities.runOnUIThread(a7Var2, 400L);
        }
        g7Var.m0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
