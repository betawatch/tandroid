package di;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class a8 implements TextWatcher {
    public final /* synthetic */ c8 a;

    public a8(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        c8 c8Var = this.a;
        c8Var.s0 = obj;
        if (!c8Var.Z) {
            String str = c8Var.x0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                c8Var.a0();
                String str2 = c8Var.s0;
                c8Var.w0 = str2 != null && str2.length() > 0;
            }
            String str3 = c8Var.I0;
            String str4 = c8Var.s0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                c8Var.Z();
                String str5 = c8Var.s0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.e3) c8Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                c8Var.D0 = z10;
            }
            u7 u7Var = c8Var.z0;
            AndroidUtilities.cancelRunOnUIThread(u7Var);
            AndroidUtilities.runOnUIThread(u7Var, 400L);
            u7 u7Var2 = c8Var.K0;
            AndroidUtilities.cancelRunOnUIThread(u7Var2);
            AndroidUtilities.runOnUIThread(u7Var2, 400L);
        }
        c8Var.q0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
