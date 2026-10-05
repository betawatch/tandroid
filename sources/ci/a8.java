package ci;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        c8Var.q0 = obj;
        if (!c8Var.Z) {
            String str = c8Var.v0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                c8Var.Y();
                String str2 = c8Var.q0;
                c8Var.u0 = str2 != null && str2.length() > 0;
            }
            String str3 = c8Var.G0;
            String str4 = c8Var.q0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                c8Var.X();
                String str5 = c8Var.q0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.f3) c8Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                c8Var.B0 = z10;
            }
            v7 v7Var = c8Var.x0;
            AndroidUtilities.cancelRunOnUIThread(v7Var);
            AndroidUtilities.runOnUIThread(v7Var, 400L);
            v7 v7Var2 = c8Var.I0;
            AndroidUtilities.cancelRunOnUIThread(v7Var2);
            AndroidUtilities.runOnUIThread(v7Var2, 400L);
        }
        c8Var.o0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
