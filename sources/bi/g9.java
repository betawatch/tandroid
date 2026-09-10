package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g9 implements TextWatcher {
    public final /* synthetic */ i9 a;

    public g9(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        i9 i9Var = this.a;
        i9Var.s0 = obj;
        if (!i9Var.Z) {
            String str = i9Var.x0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                i9Var.Z();
                String str2 = i9Var.s0;
                i9Var.w0 = str2 != null && str2.length() > 0;
            }
            String str3 = i9Var.I0;
            String str4 = i9Var.s0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                i9Var.Y();
                String str5 = i9Var.s0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.h3) i9Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                i9Var.D0 = z10;
            }
            z8 z8Var = i9Var.z0;
            AndroidUtilities.cancelRunOnUIThread(z8Var);
            AndroidUtilities.runOnUIThread(z8Var, 400L);
            z8 z8Var2 = i9Var.K0;
            AndroidUtilities.cancelRunOnUIThread(z8Var2);
            AndroidUtilities.runOnUIThread(z8Var2, 400L);
        }
        i9Var.q0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
