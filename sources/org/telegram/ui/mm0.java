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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class mm0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ an0 e;

    public mm0(an0 an0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = an0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        int i11;
        an0 an0Var = this.e;
        if (an0Var.Y == null) {
            return;
        }
        if (!this.a) {
            i11 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.b, an0Var.e1);
        }
        AndroidUtilities.hideKeyboard(an0Var.Y[0]);
        an0Var.f1 = true;
        long j10 = an0Var.c;
        an0 an0Var2 = new an0(j10 == 0 ? 8 : 0, j10, an0Var.h, an0Var.r, an0Var.d, an0Var.e, an0Var.n, an0Var.y, an0Var.J);
        an0Var2.d1 = an0Var.d1;
        i10 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
        ((org.telegram.ui.ActionBar.o2) an0Var2).currentAccount = i10;
        an0Var2.e1 = an0Var.e1;
        an0Var2.c1 = an0Var.c1;
        an0Var2.b1 = an0Var.b1;
        an0Var2.C1 = an0Var.C1;
        h5Var = ((org.telegram.ui.ActionBar.o2) an0Var).parentLayout;
        if (h5Var != null) {
            h5Var2 = ((org.telegram.ui.ActionBar.o2) an0Var).parentLayout;
            if (((ActionBarLayout) h5Var2).i()) {
                an0Var.h1 = an0Var2;
                return;
            }
        }
        an0Var.presentFragment(an0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        an0 an0Var = this.e;
        TL_account.Password password = an0Var.J;
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
        i10 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.c, new km0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.globalQueue.postRunnable(new ai.x9((Object) this, tLObject, (Object) this.d, this.a, 25));
                return;
            } else {
                AndroidUtilities.runOnUIThread(new v90(this, this.a, tL_error, 3));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i10 = ((org.telegram.ui.ActionBar.o2) this.e).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ei.o3(9, this, this.a), 8);
    }
}
