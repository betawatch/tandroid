package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public ScrollView D;
    public org.telegram.ui.Components.f10 E;
    public org.telegram.ui.Components.w21 F;
    public boolean G;
    public boolean H;
    public TL_account.Password I;
    public boolean J;
    public byte[] K;
    public long L;
    public byte[] M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public final wb1 V;
    public boolean W;
    public int X;
    public bc1 Y;
    public int Z;
    public dc1 a;
    public String a0;
    public org.telegram.ui.Components.uk0 b;
    public ec1 b0;
    public org.telegram.ui.Components.fi0 c;
    public final wb1 c0;
    private int changePasswordRow;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.ActionBar.u5 n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.ec0 w;
    public org.telegram.ui.ActionBar.x1 x;
    public org.telegram.ui.Components.xy y;

    public TwoStepVerificationActivity() {
        super(null);
        this.J = true;
        this.K = new byte[0];
        this.V = new wb1(this, 2);
        this.X = -1;
        this.c0 = new wb1(this, 3);
    }

    public static /* synthetic */ void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            r0(password);
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.p0();
        }
    }

    public static /* synthetic */ void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            r0(password);
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.y0();
        }
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new vb1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.v0(twoStepVerificationActivity.w, twoStepVerificationActivity.s, true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(R.string.AppName, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.b0 == null || !z10) {
            twoStepVerificationActivity.t0();
        }
        if (!z10) {
            org.telegram.ui.Components.s4.w0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, null), true);
            return;
        }
        twoStepVerificationActivity.K = bArr;
        twoStepVerificationActivity.J = true;
        if (twoStepVerificationActivity.b0 != null) {
            org.telegram.messenger.i0.v1(twoStepVerificationActivity.s);
            twoStepVerificationActivity.b0.m(twoStepVerificationActivity.q0());
            return;
        }
        if (!TextUtils.isEmpty(twoStepVerificationActivity.I.email_unconfirmed_pattern)) {
            rc1 rc1Var = new rc1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.I);
            rc1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
            twoStepVerificationActivity.presentFragment(rc1Var, true);
            return;
        }
        org.telegram.messenger.i0.v1(twoStepVerificationActivity.s);
        TwoStepVerificationActivity twoStepVerificationActivity2 = new TwoStepVerificationActivity();
        twoStepVerificationActivity2.J = true;
        twoStepVerificationActivity2.K = twoStepVerificationActivity.K;
        twoStepVerificationActivity2.I = twoStepVerificationActivity.I;
        twoStepVerificationActivity2.M = twoStepVerificationActivity.M;
        twoStepVerificationActivity2.L = twoStepVerificationActivity.L;
        twoStepVerificationActivity.presentFragment(twoStepVerificationActivity2, true);
    }

    public static /* synthetic */ void d0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.I.current_algo;
        byte[] c10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.bw.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        tp0 tp0Var = new tp0(twoStepVerificationActivity, bArr, c10, 12);
        TL_account.Password password = twoStepVerificationActivity.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            tp0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.bw.d(c10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, tp0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        tp0Var.run(null, tL_error2);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new vb1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.I = null;
            twoStepVerificationActivity.K = new byte[0];
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.r0, new Object[0]);
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.q0, new Object[0]);
            twoStepVerificationActivity.finishFragment();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(R.string.AppName, null), tL_error.text);
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(R.string.AppName, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0])));
            }
        }
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        if (tL_error == null) {
            twoStepVerificationActivity.G = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            if (!n0(password, false)) {
                org.telegram.ui.Components.s4.w0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, null), true);
                return;
            }
            if (!z10 || z11) {
                byte[] bArr = twoStepVerificationActivity.K;
                twoStepVerificationActivity.J = (bArr != null && bArr.length > 0) || !twoStepVerificationActivity.I.has_password;
            }
            r0(twoStepVerificationActivity.I);
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.q0, twoStepVerificationActivity.I);
        }
        if (runnable != null) {
            runnable.run();
        }
        twoStepVerificationActivity.E0();
    }

    public static /* synthetic */ void g0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            r0(password);
            org.telegram.messenger.at.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.at.q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.p0();
        }
    }

    public static void h0(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        if (i10 == twoStepVerificationActivity.O || i10 == twoStepVerificationActivity.changePasswordRow) {
            rc1 rc1Var = new rc1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.I);
            rc1Var.J.add(twoStepVerificationActivity);
            rc1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
            twoStepVerificationActivity.presentFragment(rc1Var);
            return;
        }
        if (i10 == twoStepVerificationActivity.Q || i10 == twoStepVerificationActivity.R) {
            rc1 rc1Var2 = new rc1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.I);
            rc1Var2.J.add(twoStepVerificationActivity);
            rc1Var2.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
            twoStepVerificationActivity.presentFragment(rc1Var2);
            return;
        }
        if (i10 == twoStepVerificationActivity.turnPasswordOffRow) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131743965, null);
            if (twoStepVerificationActivity.I.has_secure_values) {
                L0 = a1.g.m(null, 2131743966, sc.e.i(L0, "\n\n"));
            }
            String L02 = org.telegram.messenger.dd.L0(2131743964, null);
            String L03 = org.telegram.messenger.dd.L0(2131751436, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.T = L0;
            x1Var.R = L02;
            alertDialog$Builder.k(L03, new ub1(twoStepVerificationActivity, 2));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            twoStepVerificationActivity.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
            }
        }
    }

    public static /* synthetic */ void i0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.I.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new vb1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.q0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new vb1(twoStepVerificationActivity, 4), 10);
    }

    public static void j0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z10;
        byte[] s10;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.M = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z10 = false;
            if (!(securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000)) {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    s10 = Utilities.s(bArr3, bArr, bArr3);
                }
                org.telegram.messenger.i0.g3(new zj0(twoStepVerificationActivity, z10, bArr2, 8));
            }
            s10 = Utilities.m(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            twoStepVerificationActivity.L = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s10, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s10, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.M;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!jl0.d1(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = twoStepVerificationActivity.q0();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ag.c3(4));
                twoStepVerificationActivity.M = null;
                twoStepVerificationActivity.L = 0L;
            }
        } else {
            twoStepVerificationActivity.M = null;
            twoStepVerificationActivity.L = 0L;
        }
        z10 = true;
        org.telegram.messenger.i0.g3(new zj0(twoStepVerificationActivity, z10, bArr2, 8));
    }

    public static void k0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        twoStepVerificationActivity.t0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                twoStepVerificationActivity.B0(org.telegram.messenger.dd.L0(R.string.AppName, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        TL_account.Password password = twoStepVerificationActivity.I;
        password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
        cc1 cc1Var = new cc1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
        cc1Var.J.add(twoStepVerificationActivity);
        cc1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
        twoStepVerificationActivity.presentFragment(cc1Var);
    }

    public static boolean n0(TL_account.Password password, boolean z10) {
        return z10 ? !(password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) : ((password.new_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown)) ? false : true;
    }

    public static void r0(TL_account.Password password) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.new_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow = (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo;
            byte[] bArr = new byte[tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1.length + 32];
            Utilities.b.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.b.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    public final void A0(TL_account.Password password, byte[] bArr, long j10, byte[] bArr2) {
        this.I = password;
        this.K = bArr;
        this.M = bArr2;
        this.L = j10;
        this.J = (bArr != null && bArr.length > 0) || !password.has_password;
    }

    public final void B0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = str;
        x1Var.T = str2;
        showDialog(x1Var);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131742974, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.G(this.X, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131743958, null), null);
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131750595, null), new ub1(this, 0));
        org.telegram.ui.ActionBar.a7.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.t6.q7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() {
        TextView textView;
        if (this.J) {
            return;
        }
        int i10 = this.I.pending_reset_date;
        wb1 wb1Var = this.c0;
        if (i10 != 0) {
            int currentTime = getConnectionsManager().getCurrentTime();
            int i11 = this.I.pending_reset_date;
            if (currentTime <= i11) {
                int max = Math.max(1, i11 - getConnectionsManager().getCurrentTime());
                this.h.setText(org.telegram.messenger.dd.a0("RestorePasswordResetIn", null, 2131746086, max > 86400 ? org.telegram.messenger.dd.G(max / 86400, "Days", new Object[0]) : max >= 3600 ? org.telegram.messenger.dd.G(max / 3600, "Hours", new Object[0]) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(max / 60), Integer.valueOf(max % 60))));
                org.telegram.ui.ActionBar.a7.V(this.h, org.telegram.ui.ActionBar.t6.D6, null);
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                }
                if (this.h.getVisibility() != 0) {
                    this.h.setVisibility(0);
                }
                this.r.setVisibility(0);
                org.telegram.messenger.i0.r(wb1Var);
                org.telegram.messenger.i0.h3(wb1Var, 1000L);
                if (this.I == null && this.n != null && this.h.getVisibility() == 0) {
                    return;
                }
                org.telegram.messenger.i0.r(wb1Var);
                textView = this.r;
                if (textView == null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        if (this.I.pending_reset_date == 0) {
            this.n.l(org.telegram.messenger.dd.L0(2131750592, null), false);
            this.r.setVisibility(8);
            this.n.setVisibility(0);
        } else {
            this.n.l(org.telegram.messenger.dd.L0(2131746110, null), false);
            this.r.setVisibility(0);
            this.n.setVisibility(0);
        }
        org.telegram.ui.ActionBar.a7.Y(this.n, org.telegram.ui.ActionBar.t6.q6, null);
        org.telegram.messenger.i0.r(wb1Var);
        if (this.I == null) {
        }
        org.telegram.messenger.i0.r(wb1Var);
        textView = this.r;
        if (textView == null) {
        }
    }

    public final void E0() {
        TL_account.Password password;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.O);
        sb2.append(this.P);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.Q);
        sb2.append(this.R);
        sb2.append(this.S);
        sb2.append(this.T);
        this.T = 0;
        this.O = -1;
        this.P = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        if (!this.G && (password = this.I) != null && this.J) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.T = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.T = 3;
                    this.R = 2;
                } else {
                    this.T = 3;
                    this.Q = 2;
                }
                int i10 = this.T;
                this.T = i10 + 1;
                this.S = i10;
            } else {
                this.O = 0;
                this.T = 2;
                this.P = 1;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.O);
        sb3.append(this.P);
        sb3.append(this.changePasswordRow);
        sb3.append(this.turnPasswordOffRow);
        sb3.append(this.Q);
        sb3.append(this.R);
        sb3.append(this.S);
        sb3.append(this.T);
        if (this.a != null && !sb2.toString().equals(sb3.toString())) {
            this.a.f();
        }
        if (this.fragmentView != null) {
            if (this.G || this.J) {
                org.telegram.ui.Components.uk0 uk0Var = this.b;
                if (uk0Var != null) {
                    uk0Var.setVisibility(0);
                    this.D.setVisibility(4);
                    this.b.setEmptyView(this.y);
                }
                if (this.s != null) {
                    this.E.e(false, false);
                    this.s.setVisibility(4);
                    this.d.setVisibility(4);
                    this.f.setVisibility(8);
                    this.n.setVisibility(4);
                    D0();
                }
                View view = this.fragmentView;
                int i11 = org.telegram.ui.ActionBar.t6.a7;
                org.telegram.ui.ActionBar.a7.i(i11, view, null);
                this.fragmentView.setTag(Integer.valueOf(i11));
                return;
            }
            org.telegram.ui.Components.uk0 uk0Var2 = this.b;
            if (uk0Var2 != null) {
                uk0Var2.setEmptyView(null);
                this.b.setVisibility(4);
                this.D.setVisibility(0);
                this.y.setVisibility(4);
            }
            if (this.s != null) {
                this.E.e(true, false);
                this.s.setVisibility(0);
                View view2 = this.fragmentView;
                int i12 = org.telegram.ui.ActionBar.t6.d6;
                org.telegram.ui.ActionBar.a7.i(i12, view2, null);
                this.fragmentView.setTag(Integer.valueOf(i12));
                this.d.setVisibility(0);
                this.n.setVisibility(0);
                D0();
                this.f.setVisibility(8);
                if (TextUtils.isEmpty(this.I.hint)) {
                    this.s.setHint((CharSequence) null);
                } else {
                    this.s.setHint(this.I.hint);
                }
                org.telegram.messenger.i0.h3(new wb1(this, 0), 200L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f9  */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        final int i12 = 1;
        if (!this.J || this.b0 != null) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.actionBar, null);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i13 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.m(lVar, 5, i13, null);
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i13, null);
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.u8, null);
            this.actionBar.setCastShadows(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i14 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i14, frameLayout, null);
        ScrollView scrollView = new ScrollView(context);
        this.D = scrollView;
        scrollView.setFillViewport(true);
        frameLayout.addView(this.D, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.D.addView(linearLayout, w7.b6.x(-1, -2, 51));
        org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(context);
        this.c = fi0Var;
        fi0Var.f(R.raw.tsv_setup_intro, 100, 100, null);
        this.c.d();
        org.telegram.ui.Components.fi0 fi0Var2 = this.c;
        if (!org.telegram.messenger.i0.O1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x <= point.y || org.telegram.messenger.i0.Q1()) {
                i10 = 0;
                fi0Var2.setVisibility(i10);
                linearLayout.addView(this.c, w7.b6.r(100, 100, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                int i15 = org.telegram.ui.ActionBar.t6.G6;
                org.telegram.ui.ActionBar.a7.V(textView, i15, null);
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                this.d.setTypeface(org.telegram.messenger.i0.o());
                TextView f7 = org.telegram.messenger.a30.f(linearLayout, this.d, w7.b6.t(-2, -2, 1, 24, 8, 24, 0), context);
                this.e = f7;
                int i16 = org.telegram.ui.ActionBar.t6.D6;
                org.telegram.ui.ActionBar.a7.V(f7, i16, null);
                this.e.setTextSize(1, 15.0f);
                this.e.setGravity(1);
                this.e.setVisibility(8);
                linearLayout.addView(this.e, w7.b6.t(-2, -2, 1, 42, 8, 42, 0));
                org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, null);
                this.w = ec0Var;
                ec0Var.setText(org.telegram.messenger.dd.L0(2131751117, null));
                this.w.b(1.0f, 1.0f, false);
                linearLayout.addView(this.w, w7.b6.t(-1, -2, 1, 24, 24, 24, 0));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.s = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                org.telegram.ui.ActionBar.a7.V(this.s, i15, null);
                org.telegram.ui.ActionBar.a7.E(this.s, org.telegram.ui.ActionBar.t6.H6, null);
                this.s.setBackground(null);
                this.s.setSingleLine(true);
                this.s.setInputType(org.telegram.messenger.at.N1);
                this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.s.setTypeface(Typeface.DEFAULT);
                EditTextBoldCursor editTextBoldCursor2 = this.s;
                int i17 = org.telegram.ui.ActionBar.t6.l6;
                org.telegram.ui.ActionBar.a7.w(editTextBoldCursor2, i17, null);
                this.s.setCursorWidth(1.5f);
                this.s.setContentDescription(org.telegram.messenger.dd.L0(2131751117, null));
                int L = org.telegram.messenger.i0.L(16.0f);
                this.s.setPadding(L, L, L, L);
                this.w.addView(this.s, w7.b6.c(-2.0f, -1));
                this.w.e(this.s);
                int i18 = 12;
                this.s.setOnFocusChangeListener(new od(this, i18));
                this.s.setOnEditorActionListener(new ha(this, i18));
                this.s.addTextChangedListener(new n0(this, 18));
                TextView textView2 = new TextView(context);
                this.f = textView2;
                org.telegram.ui.ActionBar.a7.V(textView2, i16, null);
                this.f.setTextSize(1, 14.0f);
                this.f.setGravity((!org.telegram.messenger.dd.X ? 5 : 3) | 48);
                this.f.setText(org.telegram.messenger.dd.L0(2131742843, null));
                TextView f10 = org.telegram.messenger.a30.f(linearLayout, this.f, w7.b6.t(-2, -2, (!org.telegram.messenger.dd.X ? 5 : 3) | 48, 40, 30, 40, 0), context);
                this.h = f10;
                org.telegram.ui.ActionBar.a7.V(f10, i16, null);
                this.h.setTextSize(1, 12.0f);
                this.h.setGravity((!org.telegram.messenger.dd.X ? 5 : 3) | 48);
                linearLayout.addView(this.h, w7.b6.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(80);
                linearLayout2.setClipChildren(false);
                linearLayout.addView(linearLayout2, w7.b6.l(1.0f, -1, 0));
                org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
                this.n = u5Var;
                u5Var.setTextSize(15);
                this.n.setGravity(19);
                this.n.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
                frameLayout.addView(this.n, w7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ac1
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                this.b.w0();
                                break;
                            case 1:
                                this.b.o0();
                                break;
                            default:
                                this.b.y0();
                                break;
                        }
                    }
                });
                li.k.i(this.n);
                TextView textView3 = new TextView(context);
                this.r = textView3;
                textView3.setTextSize(1, 15.0f);
                this.r.setGravity(19);
                this.r.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
                this.r.setText(org.telegram.messenger.dd.L0(2131752571, null));
                org.telegram.ui.ActionBar.a7.V(this.r, org.telegram.ui.ActionBar.t6.q6, null);
                this.r.setVisibility(8);
                frameLayout.addView(this.r, w7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ac1
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                this.b.w0();
                                break;
                            case 1:
                                this.b.o0();
                                break;
                            default:
                                this.b.y0();
                                break;
                        }
                    }
                });
                li.k.i(this.r);
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
                this.E = f10Var;
                li.k.i(f10Var);
                final int i19 = 2;
                this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ac1
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                this.b.w0();
                                break;
                            case 1:
                                this.b.o0();
                                break;
                            default:
                                this.b.y0();
                                break;
                        }
                    }
                });
                org.telegram.ui.Components.w21 w21Var = new org.telegram.ui.Components.w21(context);
                this.F = w21Var;
                w21Var.setTransformType(1);
                this.F.setProgress(0.0f);
                this.F.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
                this.F.setDrawBackground(false);
                this.E.setContentDescription(org.telegram.messenger.dd.L0(2131748267, null));
                this.E.addView(this.F, w7.b6.e(56, 56, 17));
                this.E.a(this.F);
                frameLayout.addView(this.E, org.telegram.ui.Components.f10.b());
                org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
                this.y = xyVar;
                xyVar.b();
                frameLayout.addView(this.y, w7.b6.c(-1.0f, -1));
                org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
                this.b = uk0Var;
                uk0Var.setSections(true);
                this.b.setLayoutManager(new s4.a0(1, false));
                this.b.setEmptyView(this.y);
                this.b.setVerticalScrollBarEnabled(false);
                frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
                org.telegram.ui.Components.uk0 uk0Var2 = this.b;
                dc1 dc1Var = new dc1(this, context);
                this.a = dc1Var;
                uk0Var2.setAdapter(dc1Var);
                this.b.setOnItemClickListener(new jz0(this, 11));
                bc1 bc1Var = new bc1(context, null);
                this.Y = bc1Var;
                bc1Var.setSize(org.telegram.messenger.i0.L(20.0f));
                this.Y.setAlpha(0.0f);
                this.Y.setScaleX(0.1f);
                this.Y.setScaleY(0.1f);
                this.Y.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, i17, false));
                this.actionBar.addView(this.Y, w7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
                E0();
                if (this.J || this.b0 != null) {
                    this.actionBar.setTitle(null);
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131743956, null));
                }
                if (this.b0 == null) {
                    this.d.setText(org.telegram.messenger.dd.L0(2131742830, null));
                    int i20 = this.Z;
                    if (i20 == 1) {
                        this.e.setText(org.telegram.messenger.dd.L0(2131747228, null));
                    } else if (i20 == 2) {
                        org.telegram.messenger.m5.q(null, null, 2131747231, new Object[]{this.a0}, this.e);
                    } else if (i20 == 3) {
                        org.telegram.messenger.m5.q(null, null, 2131747230, new Object[]{this.a0}, this.e);
                    } else {
                        this.e.setText(org.telegram.messenger.dd.L0(2131747229, null));
                    }
                    this.e.setVisibility(0);
                } else {
                    this.d.setText(org.telegram.messenger.dd.L0(2131742830, null));
                    this.e.setVisibility(0);
                    this.e.setText(org.telegram.messenger.dd.L0(2131748735, null));
                }
                if (this.J) {
                    org.telegram.ui.ActionBar.a7.i(i14, this.fragmentView, null);
                    this.fragmentView.setTag(Integer.valueOf(i14));
                } else {
                    View view = this.fragmentView;
                    int i21 = org.telegram.ui.ActionBar.t6.a7;
                    org.telegram.ui.ActionBar.a7.i(i21, view, null);
                    this.fragmentView.setTag(Integer.valueOf(i21));
                }
                return this.fragmentView;
            }
        }
        i10 = 8;
        fi0Var2.setVisibility(i10);
        linearLayout.addView(this.c, w7.b6.r(100, 100, 1));
        TextView textView4 = new TextView(context);
        this.d = textView4;
        int i152 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView4, i152, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setGravity(1);
        this.d.setTypeface(org.telegram.messenger.i0.o());
        TextView f72 = org.telegram.messenger.a30.f(linearLayout, this.d, w7.b6.t(-2, -2, 1, 24, 8, 24, 0), context);
        this.e = f72;
        int i162 = org.telegram.ui.ActionBar.t6.D6;
        org.telegram.ui.ActionBar.a7.V(f72, i162, null);
        this.e.setTextSize(1, 15.0f);
        this.e.setGravity(1);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, w7.b6.t(-2, -2, 1, 42, 8, 42, 0));
        org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0(context, null);
        this.w = ec0Var2;
        ec0Var2.setText(org.telegram.messenger.dd.L0(2131751117, null));
        this.w.b(1.0f, 1.0f, false);
        linearLayout.addView(this.w, w7.b6.t(-1, -2, 1, 24, 24, 24, 0));
        EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
        this.s = editTextBoldCursor3;
        editTextBoldCursor3.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.V(this.s, i152, null);
        org.telegram.ui.ActionBar.a7.E(this.s, org.telegram.ui.ActionBar.t6.H6, null);
        this.s.setBackground(null);
        this.s.setSingleLine(true);
        this.s.setInputType(org.telegram.messenger.at.N1);
        this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.s.setTypeface(Typeface.DEFAULT);
        EditTextBoldCursor editTextBoldCursor22 = this.s;
        int i172 = org.telegram.ui.ActionBar.t6.l6;
        org.telegram.ui.ActionBar.a7.w(editTextBoldCursor22, i172, null);
        this.s.setCursorWidth(1.5f);
        this.s.setContentDescription(org.telegram.messenger.dd.L0(2131751117, null));
        int L2 = org.telegram.messenger.i0.L(16.0f);
        this.s.setPadding(L2, L2, L2, L2);
        this.w.addView(this.s, w7.b6.c(-2.0f, -1));
        this.w.e(this.s);
        int i182 = 12;
        this.s.setOnFocusChangeListener(new od(this, i182));
        this.s.setOnEditorActionListener(new ha(this, i182));
        this.s.addTextChangedListener(new n0(this, 18));
        TextView textView22 = new TextView(context);
        this.f = textView22;
        org.telegram.ui.ActionBar.a7.V(textView22, i162, null);
        this.f.setTextSize(1, 14.0f);
        this.f.setGravity((!org.telegram.messenger.dd.X ? 5 : 3) | 48);
        this.f.setText(org.telegram.messenger.dd.L0(2131742843, null));
        TextView f102 = org.telegram.messenger.a30.f(linearLayout, this.f, w7.b6.t(-2, -2, (!org.telegram.messenger.dd.X ? 5 : 3) | 48, 40, 30, 40, 0), context);
        this.h = f102;
        org.telegram.ui.ActionBar.a7.V(f102, i162, null);
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity((!org.telegram.messenger.dd.X ? 5 : 3) | 48);
        linearLayout.addView(this.h, w7.b6.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(1);
        linearLayout22.setGravity(80);
        linearLayout22.setClipChildren(false);
        linearLayout.addView(linearLayout22, w7.b6.l(1.0f, -1, 0));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.n = u5Var2;
        u5Var2.setTextSize(15);
        this.n.setGravity(19);
        this.n.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        frameLayout.addView(this.n, w7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ac1
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.b.w0();
                        break;
                    case 1:
                        this.b.o0();
                        break;
                    default:
                        this.b.y0();
                        break;
                }
            }
        });
        li.k.i(this.n);
        TextView textView32 = new TextView(context);
        this.r = textView32;
        textView32.setTextSize(1, 15.0f);
        this.r.setGravity(19);
        this.r.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.r.setText(org.telegram.messenger.dd.L0(2131752571, null));
        org.telegram.ui.ActionBar.a7.V(this.r, org.telegram.ui.ActionBar.t6.q6, null);
        this.r.setVisibility(8);
        frameLayout.addView(this.r, w7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ac1
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.b.w0();
                        break;
                    case 1:
                        this.b.o0();
                        break;
                    default:
                        this.b.y0();
                        break;
                }
            }
        });
        li.k.i(this.r);
        org.telegram.ui.Components.f10 f10Var2 = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.E = f10Var2;
        li.k.i(f10Var2);
        final int i192 = 2;
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ac1
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i192) {
                    case 0:
                        this.b.w0();
                        break;
                    case 1:
                        this.b.o0();
                        break;
                    default:
                        this.b.y0();
                        break;
                }
            }
        });
        org.telegram.ui.Components.w21 w21Var2 = new org.telegram.ui.Components.w21(context);
        this.F = w21Var2;
        w21Var2.setTransformType(1);
        this.F.setProgress(0.0f);
        this.F.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
        this.F.setDrawBackground(false);
        this.E.setContentDescription(org.telegram.messenger.dd.L0(2131748267, null));
        this.E.addView(this.F, w7.b6.e(56, 56, 17));
        this.E.a(this.F);
        frameLayout.addView(this.E, org.telegram.ui.Components.f10.b());
        org.telegram.ui.Components.xy xyVar2 = new org.telegram.ui.Components.xy(context, null);
        this.y = xyVar2;
        xyVar2.b();
        frameLayout.addView(this.y, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.uk0 uk0Var3 = new org.telegram.ui.Components.uk0(context, null);
        this.b = uk0Var3;
        uk0Var3.setSections(true);
        this.b.setLayoutManager(new s4.a0(1, false));
        this.b.setEmptyView(this.y);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.uk0 uk0Var22 = this.b;
        dc1 dc1Var2 = new dc1(this, context);
        this.a = dc1Var2;
        uk0Var22.setAdapter(dc1Var2);
        this.b.setOnItemClickListener(new jz0(this, 11));
        bc1 bc1Var2 = new bc1(context, null);
        this.Y = bc1Var2;
        bc1Var2.setSize(org.telegram.messenger.i0.L(20.0f));
        this.Y.setAlpha(0.0f);
        this.Y.setScaleX(0.1f);
        this.Y.setScaleY(0.1f);
        this.Y.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, i172, false));
        this.actionBar.addView(this.Y, w7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        E0();
        if (this.J) {
        }
        this.actionBar.setTitle(null);
        if (this.b0 == null) {
        }
        if (this.J) {
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Object obj;
        if (i10 == org.telegram.messenger.at.p0) {
            if (objArr.length > 0 && (obj = objArr[0]) != null) {
                this.K = (byte[]) obj;
            }
            s0(null, false, false);
            E0();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void finishFragment() {
        if (this.X < 0) {
            super.finishFragment();
            return;
        }
        Bundle g10 = a1.g.g("afterSignup", true);
        of0 of0Var = new of0();
        of0Var.r0(g10);
        presentFragment(of0Var, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, true)) > 0.699999988079071d;
    }

    public final void o0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752575, null), new ub1(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752576, null), null);
        String L0 = org.telegram.messenger.dd.L0(2131752571, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131752577, null);
        showDialog(x1Var);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (this.X < 0) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        C0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.fi0 fi0Var = this.c;
        if (!org.telegram.messenger.i0.O1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x <= point.y || org.telegram.messenger.i0.Q1()) {
                i10 = 0;
                fi0Var.setVisibility(i10);
            }
        }
        i10 = 8;
        fi0Var.setVisibility(i10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.p0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.i0.r(this.c0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.p0);
        this.H = true;
        org.telegram.ui.ActionBar.x1 x1Var = this.x;
        if (x1Var != null) {
            try {
                x1Var.dismiss();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.x = null;
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.xy xyVar = this.y;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h6, false));
            }
            org.telegram.ui.Components.w21 w21Var = this.F;
            if (w21Var != null) {
                w21Var.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
            }
            bc1 bc1Var = this.Y;
            if (bc1Var != null) {
                bc1Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.l6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            if (this.W) {
                w0();
                this.W = false;
            } else if (this.N) {
                z0();
                this.N = false;
            }
        }
    }

    public final void p0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.K;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        org.telegram.messenger.e20.i(this.currentAccount).u();
        this.M = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        u0(false);
        Utilities.e.c(new y01(17, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP q0() {
        TL_account.Password password = this.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return org.telegram.messenger.bw.d(this.K, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    public final void s0(Runnable runnable, boolean z10, boolean z11) {
        if (!z11) {
            this.G = true;
            dc1 dc1Var = this.a;
            if (dc1Var != null) {
                dc1Var.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new xb1(this, z11, z10, runnable), 10);
    }

    public final void t0() {
        if (!this.J) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<bc1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Y, (Property<bc1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Y, (Property<bc1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.x;
        if (x1Var == null) {
            return;
        }
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.x = null;
    }

    public final void u0(boolean z10) {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.x != null) {
            return;
        }
        if (!this.J) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<bc1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<bc1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<bc1, Float>) View.SCALE_Y, 1.0f));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
        this.x = x1Var;
        x1Var.i0 = false;
        if (z10) {
            x1Var.r(300L);
        } else {
            x1Var.show();
        }
    }

    public final void v0(org.telegram.ui.Components.ec0 ec0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            editTextBoldCursor.setText("");
        }
        ec0Var.a(1.0f);
        org.telegram.messenger.i0.F3(5.0f, ec0Var, new wb1(this, 1));
    }

    public final void w0() {
        TL_account.Password password = this.I;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            u0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new vb1(this, 1), 10);
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        if (this.I.pending_reset_date == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746135, null), new ub1(this, 4));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            String L0 = org.telegram.messenger.dd.L0(2131746110, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131746089, null);
            showDialog(x1Var);
            return;
        }
        if (getConnectionsManager().getCurrentTime() <= this.I.pending_reset_date) {
            o0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131746135, null), new ub1(this, 3));
        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        String L02 = org.telegram.messenger.dd.L0(2131746110, null);
        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
        x1Var2.R = L02;
        x1Var2.T = org.telegram.messenger.dd.L0(2131746083, null);
        showDialog(x1Var2);
        TextView textView = (TextView) x1Var2.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }

    public final void x0(Runnable runnable) {
        byte[] bArr;
        TL_account.Password password = this.I;
        if (password == null || password.current_algo == null || (bArr = this.K) == null || bArr.length <= 0) {
            s0(runnable, true, password != null);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void y0() {
        if (this.J) {
            return;
        }
        String obj = this.s.getText().toString();
        if (obj.length() == 0) {
            v0(this.w, this.s, false);
            return;
        }
        byte[] h12 = org.telegram.messenger.i0.h1(obj);
        u0(false);
        Utilities.e.c(new y01(16, this, h12));
    }

    public final void z0() {
        u0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new vb1(this, 0));
    }
}
