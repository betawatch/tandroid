package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.o9;
import org.telegram.ui.y9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class q8 implements y9 {
    public final /* synthetic */ r8 a;

    public q8(r8 r8Var) {
        this.a = r8Var;
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.y9
    public final void K(String str) {
        String trim;
        r8 r8Var = this.a;
        if (r8Var.isFinished || r8Var.M == null) {
            return;
        }
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new m(r8Var, 14));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
            String str2 = parse.getPathSegments().get(0);
            if (!WalletEngine2.isValidRecipientAddress(str2)) {
                AndroidUtilities.runOnUIThread(new m(r8Var, 14));
                return;
            }
            r8Var.M.setText(str2);
            di.g2 g2Var = r8Var.M;
            g2Var.setSelection(g2Var.length());
            AndroidUtilities.hideKeyboard(r8Var.M);
            r8Var.f0(str2, null);
            return;
        }
        AndroidUtilities.runOnUIThread(new m(r8Var, 14));
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ boolean e1(String str, o9 o9Var) {
        return false;
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ void W0(MrzRecognizer.Result result) {
    }
}
