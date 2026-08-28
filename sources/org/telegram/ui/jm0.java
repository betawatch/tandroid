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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jm0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ wm0 e;

    public jm0(wm0 wm0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = wm0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i9;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i10;
        wm0 wm0Var = this.e;
        if (wm0Var.U == null) {
            return;
        }
        if (!this.a) {
            i10 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
            UserConfig.getInstance(i10).savePassword(this.b, wm0Var.a1);
        }
        AndroidUtilities.hideKeyboard(wm0Var.U[0]);
        wm0Var.b1 = true;
        long j10 = wm0Var.c;
        wm0 wm0Var2 = new wm0(j10 == 0 ? 8 : 0, j10, wm0Var.h, wm0Var.r, wm0Var.d, wm0Var.e, wm0Var.n, wm0Var.y, wm0Var.F);
        wm0Var2.Z0 = wm0Var.Z0;
        i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        ((org.telegram.ui.ActionBar.o2) wm0Var2).currentAccount = i9;
        wm0Var2.a1 = wm0Var.a1;
        wm0Var2.Y0 = wm0Var.Y0;
        wm0Var2.X0 = wm0Var.X0;
        wm0Var2.y1 = wm0Var.y1;
        b5Var = ((org.telegram.ui.ActionBar.o2) wm0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) wm0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                wm0Var.d1 = wm0Var2;
                return;
            }
        }
        wm0Var.presentFragment(wm0Var2, true);
    }

    public final void b() {
        int i9;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        wm0 wm0Var = this.e;
        TL_account.Password password = wm0Var.F;
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
        i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(this.c, new hm0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new bg.d(this, tLObject, this.d, this.a, 22));
                return;
            } else {
                AndroidUtilities.runOnUIThread(new gh.u5(this, this.a, tL_error, 29));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i9 = ((org.telegram.ui.ActionBar.o2) this.e).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(getpassword, new kh.o3(9, this, this.a), 8);
    }
}
