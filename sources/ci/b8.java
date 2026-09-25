package ci;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class b8 implements TextWatcher {
    public final /* synthetic */ d8 a;

    public b8(d8 d8Var) {
        this.a = d8Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        d8 d8Var = this.a;
        d8Var.s0 = obj;
        if (!d8Var.Z) {
            String str = d8Var.x0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                d8Var.Z();
                String str2 = d8Var.s0;
                d8Var.w0 = str2 != null && str2.length() > 0;
            }
            String str3 = d8Var.I0;
            String str4 = d8Var.s0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                d8Var.Y();
                String str5 = d8Var.s0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.e3) d8Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                d8Var.D0 = z10;
            }
            v7 v7Var = d8Var.z0;
            AndroidUtilities.cancelRunOnUIThread(v7Var);
            AndroidUtilities.runOnUIThread(v7Var, 400L);
            v7 v7Var2 = d8Var.K0;
            AndroidUtilities.cancelRunOnUIThread(v7Var2);
            AndroidUtilities.runOnUIThread(v7Var2, 400L);
        }
        d8Var.q0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
