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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class km0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ xm0 e;

    public km0(xm0 xm0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = xm0Var;
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
        xm0 xm0Var = this.e;
        if (xm0Var.U == null) {
            return;
        }
        if (!this.a) {
            i11 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.b, xm0Var.a1);
        }
        AndroidUtilities.hideKeyboard(xm0Var.U[0]);
        xm0Var.b1 = true;
        long j10 = xm0Var.c;
        xm0 xm0Var2 = new xm0(j10 == 0 ? 8 : 0, j10, xm0Var.h, xm0Var.r, xm0Var.d, xm0Var.e, xm0Var.n, xm0Var.y, xm0Var.F);
        xm0Var2.Z0 = xm0Var.Z0;
        i10 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
        ((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount = i10;
        xm0Var2.a1 = xm0Var.a1;
        xm0Var2.Y0 = xm0Var.Y0;
        xm0Var2.X0 = xm0Var.X0;
        xm0Var2.y1 = xm0Var.y1;
        b5Var = ((org.telegram.ui.ActionBar.n2) xm0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.n2) xm0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                xm0Var.d1 = xm0Var2;
                return;
            }
        }
        xm0Var.presentFragment(xm0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        xm0 xm0Var = this.e;
        TL_account.Password password = xm0Var.F;
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
        i10 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.c, new im0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new cg.c(this, tLObject, this.d, this.a, 21));
                return;
            } else {
                AndroidUtilities.runOnUIThread(new hh.t5(this, this.a, tL_error, 29));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i10 = ((org.telegram.ui.ActionBar.n2) this.e).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new lh.n3(9, this, this.a), 8);
    }
}
