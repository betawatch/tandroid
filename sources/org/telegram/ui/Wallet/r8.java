package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.k9;
import org.telegram.ui.u9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class r8 implements u9 {
    public final /* synthetic */ s8 a;

    public r8(s8 s8Var) {
        this.a = s8Var;
    }

    @Override // org.telegram.ui.u9
    public final void K(String str) {
        String trim;
        s8 s8Var = this.a;
        if (s8Var.isFinished || s8Var.M == null) {
            return;
        }
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new m(s8Var, 14));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
            String str2 = parse.getPathSegments().get(0);
            if (!WalletEngine2.isValidRecipientAddress(str2)) {
                AndroidUtilities.runOnUIThread(new m(s8Var, 14));
                return;
            }
            s8Var.M.setText(str2);
            ci.g2 g2Var = s8Var.M;
            g2Var.setSelection(g2Var.length());
            AndroidUtilities.hideKeyboard(s8Var.M);
            s8Var.f0(str2, null);
            return;
        }
        AndroidUtilities.runOnUIThread(new m(s8Var, 14));
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ String z0() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void onDismiss() {
    }
}
