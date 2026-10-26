package fi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class m7 implements TextWatcher {
    public final /* synthetic */ o7 a;

    public m7(o7 o7Var) {
        this.a = o7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        o7 o7Var = this.a;
        o7Var.r0 = obj;
        if (!o7Var.Z) {
            String str = o7Var.w0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z10 = false;
            if (!equals) {
                o7Var.Z();
                String str2 = o7Var.r0;
                o7Var.v0 = str2 != null && str2.length() > 0;
            }
            String str3 = o7Var.H0;
            String str4 = o7Var.r0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                o7Var.Y();
                String str5 = o7Var.r0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.k3) o7Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z10 = true;
                    }
                }
                o7Var.C0 = z10;
            }
            i7 i7Var = o7Var.y0;
            AndroidUtilities.cancelRunOnUIThread(i7Var);
            AndroidUtilities.runOnUIThread(i7Var, 400L);
            i7 i7Var2 = o7Var.J0;
            AndroidUtilities.cancelRunOnUIThread(i7Var2);
            AndroidUtilities.runOnUIThread(i7Var2, 400L);
        }
        o7Var.p0.O(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
