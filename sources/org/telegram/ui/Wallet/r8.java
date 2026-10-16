package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.o9;
import org.telegram.ui.y9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class r8 implements y9 {
    public final /* synthetic */ s8 a;

    public r8(s8 s8Var) {
        this.a = s8Var;
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.y9
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
                AndroidUtilities.runOnUIThread(new n(s8Var, 14));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
            String str2 = parse.getPathSegments().get(0);
            if (!WalletEngine2.isValidRecipientAddress(str2)) {
                AndroidUtilities.runOnUIThread(new n(s8Var, 14));
                return;
            }
            s8Var.M.setText(str2);
            di.g2 g2Var = s8Var.M;
            g2Var.setSelection(g2Var.length());
            AndroidUtilities.hideKeyboard(s8Var.M);
            s8Var.f0(str2, null);
            return;
        }
        AndroidUtilities.runOnUIThread(new n(s8Var, 14));
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ void V0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ void onDismiss() {
    }
}
