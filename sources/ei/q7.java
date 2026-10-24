package ei;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class q7 implements TextWatcher {
    public final /* synthetic */ s7 a;

    public q7(s7 s7Var) {
        this.a = s7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        s7 s7Var = this.a;
        s7Var.t0 = obj;
        if (!s7Var.Z) {
            String str = s7Var.y0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                s7Var.Z();
                String str2 = s7Var.t0;
                s7Var.x0 = str2 != null && str2.length() > 0;
            }
            String str3 = s7Var.J0;
            String str4 = s7Var.t0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                s7Var.Y();
                String str5 = s7Var.t0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.h3) s7Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                s7Var.E0 = z10;
            }
            l7 l7Var = s7Var.A0;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            AndroidUtilities.runOnUIThread(l7Var, 400L);
            l7 l7Var2 = s7Var.L0;
            AndroidUtilities.cancelRunOnUIThread(l7Var2);
            AndroidUtilities.runOnUIThread(l7Var2, 400L);
        }
        s7Var.r0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
