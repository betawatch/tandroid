package di;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class e8 implements TextWatcher {
    public final /* synthetic */ g8 a;

    public e8(g8 g8Var) {
        this.a = g8Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        g8 g8Var = this.a;
        g8Var.s0 = obj;
        if (!g8Var.Z) {
            String str = g8Var.x0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                g8Var.Z();
                String str2 = g8Var.s0;
                g8Var.w0 = str2 != null && str2.length() > 0;
            }
            String str3 = g8Var.I0;
            String str4 = g8Var.s0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                g8Var.Y();
                String str5 = g8Var.s0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.f3) g8Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                g8Var.D0 = z10;
            }
            y7 y7Var = g8Var.z0;
            AndroidUtilities.cancelRunOnUIThread(y7Var);
            AndroidUtilities.runOnUIThread(y7Var, 400L);
            y7 y7Var2 = g8Var.K0;
            AndroidUtilities.cancelRunOnUIThread(y7Var2);
            AndroidUtilities.runOnUIThread(y7Var2, 400L);
        }
        g8Var.q0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
