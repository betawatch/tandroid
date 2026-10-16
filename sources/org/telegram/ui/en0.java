package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class en0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ sn0 e;

    public en0(sn0 sn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = sn0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i11;
        sn0 sn0Var = this.e;
        if (sn0Var.Y == null) {
            return;
        }
        if (!this.a) {
            i11 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.b, sn0Var.e1);
        }
        AndroidUtilities.hideKeyboard(sn0Var.Y[0]);
        sn0Var.f1 = true;
        long j10 = sn0Var.c;
        sn0 sn0Var2 = new sn0(j10 == 0 ? 8 : 0, j10, sn0Var.h, sn0Var.r, sn0Var.d, sn0Var.e, sn0Var.n, sn0Var.y, sn0Var.J);
        sn0Var2.d1 = sn0Var.d1;
        i10 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.m2) sn0Var2).currentAccount = i10;
        sn0Var2.e1 = sn0Var.e1;
        sn0Var2.c1 = sn0Var.c1;
        sn0Var2.b1 = sn0Var.b1;
        sn0Var2.C1 = sn0Var.C1;
        b5Var = ((org.telegram.ui.ActionBar.m2) sn0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) sn0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                sn0Var.h1 = sn0Var2;
                return;
            }
        }
        sn0Var.presentFragment(sn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        sn0 sn0Var = this.e;
        TL_account.Password password = sn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        updatepasswordsettings.new_settings = passwordinputsettings;
        passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = updatepasswordsettings.new_settings.new_secure_settings;
        tL_secureSecretSettings.secure_secret = new byte[0];
        tL_secureSecretSettings.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
        TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
        passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
        passwordinputsettings2.flags |= 4;
        i10 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.c, new cn0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new bi.h4(this, tLObject, this.d, this.a, 23));
                return;
            } else {
                AndroidUtilities.runOnUIThread(new gm0(this, this.a, tL_error, 1));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i10 = ((org.telegram.ui.ActionBar.m2) this.e).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new di.s3(9, this, this.a), 8);
    }
}
