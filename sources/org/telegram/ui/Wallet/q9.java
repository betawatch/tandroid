package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class q9 implements org.telegram.ui.x9 {
    public final /* synthetic */ r9 a;

    public q9(r9 r9Var) {
        this.a = r9Var;
    }

    @Override // org.telegram.ui.x9
    public final void E(String str) {
        String trim;
        r9 r9Var = this.a;
        if (r9Var.isFinished || r9Var.M == null) {
            return;
        }
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new n(r9Var, 13));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
            String str2 = parse.getPathSegments().get(0);
            if (!WalletEngine2.isValidRecipientAddress(str2)) {
                AndroidUtilities.runOnUIThread(new n(r9Var, 13));
                return;
            }
            r9Var.M.setText(str2);
            ei.e2 e2Var = r9Var.M;
            e2Var.setSelection(e2Var.length());
            AndroidUtilities.hideKeyboard(r9Var.M);
            r9Var.f0(str2, null);
            return;
        }
        AndroidUtilities.runOnUIThread(new n(r9Var, 13));
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
