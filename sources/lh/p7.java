package lh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class p7 implements TextWatcher {
    public final /* synthetic */ r7 a;

    public p7(r7 r7Var) {
        this.a = r7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        r7 r7Var = this.a;
        r7Var.o0 = obj;
        if (!r7Var.V) {
            String str = r7Var.t0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                r7Var.Z();
                String str2 = r7Var.o0;
                r7Var.s0 = str2 != null && str2.length() > 0;
            }
            String str3 = r7Var.E0;
            String str4 = r7Var.o0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                r7Var.Y();
                String str5 = r7Var.o0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.e3) r7Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                r7Var.z0 = z10;
            }
            l7 l7Var = r7Var.v0;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            AndroidUtilities.runOnUIThread(l7Var, 400L);
            l7 l7Var2 = r7Var.G0;
            AndroidUtilities.cancelRunOnUIThread(l7Var2);
            AndroidUtilities.runOnUIThread(l7Var2, 400L);
        }
        r7Var.m0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
