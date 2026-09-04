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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class bn0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ pn0 e;

    public bn0(pn0 pn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = pn0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        int i11;
        pn0 pn0Var = this.e;
        if (pn0Var.Y == null) {
            return;
        }
        if (!this.a) {
            i11 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.b, pn0Var.e1);
        }
        AndroidUtilities.hideKeyboard(pn0Var.Y[0]);
        pn0Var.f1 = true;
        long j3 = pn0Var.c;
        pn0 pn0Var2 = new pn0(j3 == 0 ? 8 : 0, j3, pn0Var.h, pn0Var.r, pn0Var.d, pn0Var.e, pn0Var.n, pn0Var.y, pn0Var.J);
        pn0Var2.d1 = pn0Var.d1;
        i10 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.n2) pn0Var2).currentAccount = i10;
        pn0Var2.e1 = pn0Var.e1;
        pn0Var2.c1 = pn0Var.c1;
        pn0Var2.b1 = pn0Var.b1;
        pn0Var2.C1 = pn0Var.C1;
        d5Var = ((org.telegram.ui.ActionBar.n2) pn0Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) pn0Var).parentLayout;
            if (((ActionBarLayout) d5Var2).j()) {
                pn0Var.h1 = pn0Var2;
                return;
            }
        }
        pn0Var.presentFragment(pn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        pn0 pn0Var = this.e;
        TL_account.Password password = pn0Var.J;
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
        i10 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.c, new zm0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new bi.e4(this, tLObject, this.d, this.a, 24));
                return;
            } else {
                AndroidUtilities.runOnUIThread(new dm0(this, this.a, tL_error, 1));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i10 = ((org.telegram.ui.ActionBar.n2) this.e).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new di.u3(9, this, this.a), 8);
    }
}
