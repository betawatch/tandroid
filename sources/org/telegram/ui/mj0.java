package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mj0 implements RequestDelegate {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ TL_account.getPasswordSettings c;
    public final /* synthetic */ String d;
    public final /* synthetic */ yj0 e;

    public mj0(yj0 yj0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = yj0Var;
        this.a = z10;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i3;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        int i10;
        yj0 yj0Var = this.e;
        if (yj0Var.Z == null) {
            return;
        }
        if (!this.a) {
            i10 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
            org.telegram.messenger.h10 i11 = org.telegram.messenger.h10.i(i10);
            byte[] bArr = this.b;
            byte[] bArr2 = this.e.f1;
            i11.m0 = SystemClock.elapsedRealtime();
            i11.k0 = bArr;
            i11.l0 = bArr2;
        }
        org.telegram.messenger.g0.v1(this.e.Z[0]);
        yj0 yj0Var2 = this.e;
        yj0Var2.g1 = true;
        long j10 = yj0Var2.c;
        yj0 yj0Var3 = new yj0(j10 == 0 ? 8 : 0, j10, yj0Var2.h, yj0Var2.r, yj0Var2.d, yj0Var2.e, yj0Var2.n, yj0Var2.E, yj0Var2.K);
        yj0 yj0Var4 = this.e;
        yj0Var3.e1 = yj0Var4.e1;
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.d2) yj0Var3).currentAccount = i3;
        yj0 yj0Var5 = this.e;
        yj0Var3.f1 = yj0Var5.f1;
        yj0Var3.d1 = yj0Var5.d1;
        yj0Var3.c1 = yj0Var5.c1;
        yj0Var3.D1 = yj0Var5.D1;
        q4Var = ((org.telegram.ui.ActionBar.d2) yj0Var5).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) this.e).parentLayout;
            if (((ActionBarLayout) q4Var2).i()) {
                this.e.i1 = yj0Var3;
                return;
            }
        }
        this.e.presentFragment(yj0Var3, true);
    }

    public final void b() {
        int i3;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        yj0 yj0Var = this.e;
        TL_account.Password password = yj0Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.hv.d(this.b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(this.c, new kj0(this, 1));
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        if (tL_error == null || !"SRP_ID_INVALID".equals(tL_error.text)) {
            if (tL_error == null) {
                Utilities.e.c(new rn((Object) this, tLObject, (Object) this.d, this.a, 11));
                return;
            } else {
                org.telegram.messenger.g0.h3(new a60(this, this.a, tL_error, 4));
                return;
            }
        }
        TL_account.getPassword getpassword = new TL_account.getPassword();
        i3 = ((org.telegram.ui.ActionBar.d2) this.e).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(getpassword, new gi.b3(8, this, this.a), 8);
    }
}
