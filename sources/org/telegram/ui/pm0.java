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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pm0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ dn0 e;

    public pm0(dn0 dn0Var, boolean z4, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = dn0Var;
        this.a = z4;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        int i11;
        dn0 dn0Var = this.e;
        if (dn0Var.V == null) {
            return;
        }
        if (!this.a) {
            i11 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.b, dn0Var.b1);
        }
        AndroidUtilities.hideKeyboard(dn0Var.V[0]);
        dn0Var.c1 = true;
        long j10 = dn0Var.c;
        dn0 dn0Var2 = new dn0(j10 == 0 ? 8 : 0, j10, dn0Var.h, dn0Var.r, dn0Var.d, dn0Var.e, dn0Var.n, dn0Var.y, dn0Var.G);
        dn0Var2.a1 = dn0Var.a1;
        i10 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.p2) dn0Var2).currentAccount = i10;
        dn0Var2.b1 = dn0Var.b1;
        dn0Var2.Z0 = dn0Var.Z0;
        dn0Var2.Y0 = dn0Var.Y0;
        dn0Var2.z1 = dn0Var.z1;
        e5Var = ((org.telegram.ui.ActionBar.p2) dn0Var).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) dn0Var).parentLayout;
            if (((ActionBarLayout) e5Var2).j()) {
                dn0Var.e1 = dn0Var2;
                return;
            }
        }
        dn0Var.presentFragment(dn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        dn0 dn0Var = this.e;
        TL_account.Password password = dn0Var.G;
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
        i10 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.c, new nm0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new cg.u0(this, tLObject, this.d, this.a, 20));
                return;
            } else {
                AndroidUtilities.runOnUIThread(new lh.r5(this, this.a, tL_error, 27));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i10 = ((org.telegram.ui.ActionBar.p2) this.e).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new org.telegram.messenger.zd(8, this, this.a), 8);
    }
}
