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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class an0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ on0 e;

    public an0(on0 on0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = on0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        int i11;
        on0 on0Var = this.e;
        if (on0Var.Y == null) {
            return;
        }
        if (!this.a) {
            i11 = ((org.telegram.ui.ActionBar.p2) on0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.b, on0Var.e1);
        }
        AndroidUtilities.hideKeyboard(on0Var.Y[0]);
        on0Var.f1 = true;
        long j3 = on0Var.c;
        on0 on0Var2 = new on0(j3 == 0 ? 8 : 0, j3, on0Var.h, on0Var.r, on0Var.d, on0Var.e, on0Var.n, on0Var.y, on0Var.J);
        on0Var2.d1 = on0Var.d1;
        i10 = ((org.telegram.ui.ActionBar.p2) on0Var).currentAccount;
        ((org.telegram.ui.ActionBar.p2) on0Var2).currentAccount = i10;
        on0Var2.e1 = on0Var.e1;
        on0Var2.c1 = on0Var.c1;
        on0Var2.b1 = on0Var.b1;
        on0Var2.C1 = on0Var.C1;
        f5Var = ((org.telegram.ui.ActionBar.p2) on0Var).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) on0Var).parentLayout;
            if (((ActionBarLayout) f5Var2).j()) {
                on0Var.h1 = on0Var2;
                return;
            }
        }
        on0Var.presentFragment(on0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        on0 on0Var = this.e;
        TL_account.Password password = on0Var.J;
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
        i10 = ((org.telegram.ui.ActionBar.p2) on0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.c, new ym0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new bi.g2(this, tLObject, this.d, this.a, 24));
                return;
            } else {
                AndroidUtilities.runOnUIThread(new cm0(this, this.a, tL_error, 1));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i10 = ((org.telegram.ui.ActionBar.p2) this.e).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new bi.m4(9, this, this.a), 8);
    }
}
