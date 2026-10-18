package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class v9 implements org.telegram.ui.x9 {
    public final /* synthetic */ w9 a;

    public v9(w9 w9Var) {
        this.a = w9Var;
    }

    @Override // org.telegram.ui.x9
    public final void E(String str) {
        String trim;
        w9 w9Var = this.a;
        if (w9Var.isFinished || w9Var.M == null) {
            return;
        }
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new n(w9Var, 16));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
            String str2 = parse.getPathSegments().get(0);
            if (!WalletEngine2.isValidRecipientAddress(str2)) {
                AndroidUtilities.runOnUIThread(new n(w9Var, 16));
                return;
            }
            w9Var.M.setText(str2);
            ei.e2 e2Var = w9Var.M;
            e2Var.setSelection(e2Var.length());
            AndroidUtilities.hideKeyboard(w9Var.M);
            w9Var.f0(str2, null);
            return;
        }
        AndroidUtilities.runOnUIThread(new n(w9Var, 16));
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ boolean U0(String str, org.telegram.ui.n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ String p0() {
        return null;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void F0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void onDismiss() {
    }
}
