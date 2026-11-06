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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public ScrollView D;
    public org.telegram.ui.Components.p00 E;
    public org.telegram.ui.Components.t11 F;
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
    public final ea1 V;
    public boolean W;
    public int X;
    public ia1 Y;
    public int Z;
    public ka1 a;
    public String a0;
    public org.telegram.ui.Components.pj0 b;
    public la1 b0;
    public org.telegram.ui.Components.ch0 c;
    public final ea1 c0;
    private int changePasswordRow;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.ActionBar.k5 n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.lb0 w;
    public org.telegram.ui.ActionBar.u1 x;
    public org.telegram.ui.Components.iy y;

    public TwoStepVerificationActivity() {
        super(null);
        this.J = true;
        this.K = new byte[0];
        this.V = new ea1(this, 2);
        this.X = -1;
        this.c0 = new ea1(this, 3);
    }

    public static /* synthetic */ void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            r0(password);
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.p0();
        }
    }

    public static /* synthetic */ void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            r0(password);
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.y0();
        }
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new da1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.v0(twoStepVerificationActivity.w, twoStepVerificationActivity.s, true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, byte[] bArr) {
        if (twoStepVerificationActivity.b0 == null || !z9) {
            twoStepVerificationActivity.t0();
        }
        if (!z9) {
            org.telegram.ui.Components.v4.u0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
            return;
        }
        twoStepVerificationActivity.K = bArr;
        twoStepVerificationActivity.J = true;
        if (twoStepVerificationActivity.b0 != null) {
            org.telegram.messenger.g0.v1(twoStepVerificationActivity.s);
            twoStepVerificationActivity.b0.j(twoStepVerificationActivity.q0());
            return;
        }
        if (!TextUtils.isEmpty(twoStepVerificationActivity.I.email_unconfirmed_pattern)) {
            ya1 ya1Var = new ya1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.I);
            ya1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
            twoStepVerificationActivity.presentFragment(ya1Var, true);
            return;
        }
        org.telegram.messenger.g0.v1(twoStepVerificationActivity.s);
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
        byte[] c10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.pv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        lo0 lo0Var = new lo0(twoStepVerificationActivity, bArr, c10, 12);
        TL_account.Password password = twoStepVerificationActivity.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            lo0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(c10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, lo0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        lo0Var.run(null, tL_error2);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new da1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.I = null;
            twoStepVerificationActivity.K = new byte[0];
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.r0, new Object[0]);
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.q0, new Object[0]);
            twoStepVerificationActivity.finishFragment();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error.text);
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
            }
        }
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, boolean z10, Runnable runnable) {
        if (tL_error == null) {
            twoStepVerificationActivity.G = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            if (!n0(password, false)) {
                org.telegram.ui.Components.v4.u0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
                return;
            }
            if (!z9 || z10) {
                byte[] bArr = twoStepVerificationActivity.K;
                twoStepVerificationActivity.J = (bArr != null && bArr.length > 0) || !twoStepVerificationActivity.I.has_password;
            }
            r0(twoStepVerificationActivity.I);
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.q0, twoStepVerificationActivity.I);
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
            org.telegram.messenger.qs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.qs.q0, twoStepVerificationActivity.I);
            twoStepVerificationActivity.p0();
        }
    }

    public static void h0(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        if (i7 == twoStepVerificationActivity.O || i7 == twoStepVerificationActivity.changePasswordRow) {
            ya1 ya1Var = new ya1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.I);
            ya1Var.J.add(twoStepVerificationActivity);
            ya1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
            twoStepVerificationActivity.presentFragment(ya1Var);
            return;
        }
        if (i7 == twoStepVerificationActivity.Q || i7 == twoStepVerificationActivity.R) {
            ya1 ya1Var2 = new ya1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.I);
            ya1Var2.J.add(twoStepVerificationActivity);
            ya1Var2.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, true);
            twoStepVerificationActivity.presentFragment(ya1Var2);
            return;
        }
        if (i7 == twoStepVerificationActivity.turnPasswordOffRow) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131743941, null);
            if (twoStepVerificationActivity.I.has_secure_values) {
                M0 = jg.g.l(2131743942, null, rf.b.j(M0, "\n\n"));
            }
            String M02 = org.telegram.messenger.hd.M0(2131743940, null);
            String M03 = org.telegram.messenger.hd.M0(2131751436, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.T = M0;
            u1Var.R = M02;
            alertDialog$Builder.k(M03, new ca1(twoStepVerificationActivity, 2));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            twoStepVerificationActivity.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
            }
        }
    }

    public static /* synthetic */ void i0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.I.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new da1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.q0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new da1(twoStepVerificationActivity, 4), 10);
    }

    public static void j0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z9;
        byte[] s5;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.M = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z9 = false;
            if (!(securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000)) {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    s5 = Utilities.s(bArr3, bArr, bArr3);
                }
                org.telegram.messenger.g0.h3(new g60(twoStepVerificationActivity, z9, bArr2, 11));
            }
            s5 = Utilities.m(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            twoStepVerificationActivity.L = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s5, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s5, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.M;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!bk0.d1(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
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
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new di.u5(9));
                twoStepVerificationActivity.M = null;
                twoStepVerificationActivity.L = 0L;
            }
        } else {
            twoStepVerificationActivity.M = null;
            twoStepVerificationActivity.L = 0L;
        }
        z9 = true;
        org.telegram.messenger.g0.h3(new g60(twoStepVerificationActivity, z9, bArr2, 11));
    }

    public static void k0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        twoStepVerificationActivity.t0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        TL_account.Password password = twoStepVerificationActivity.I;
        password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
        ja1 ja1Var = new ja1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
        ja1Var.J.add(twoStepVerificationActivity);
        ja1Var.I0(twoStepVerificationActivity.K, twoStepVerificationActivity.L, twoStepVerificationActivity.M, false);
        twoStepVerificationActivity.presentFragment(ja1Var);
    }

    public static boolean n0(TL_account.Password password, boolean z9) {
        return z9 ? !(password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) : ((password.new_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown)) ? false : true;
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

    public final void A0(TL_account.Password password, byte[] bArr, long j3, byte[] bArr2) {
        this.I = password;
        this.K = bArr;
        this.M = bArr2;
        this.L = j3;
        this.J = (bArr != null && bArr.length > 0) || !password.has_password;
    }

    public final void B0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = str;
        u1Var.T = str2;
        showDialog(u1Var);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131742949, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.G(this.X, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131743934, null), null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131750595, null), new ca1(this, 0));
        org.telegram.ui.ActionBar.r6.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.k6.q7, null);
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
        int i7 = this.I.pending_reset_date;
        ea1 ea1Var = this.c0;
        if (i7 != 0) {
            int currentTime = getConnectionsManager().getCurrentTime();
            int i10 = this.I.pending_reset_date;
            if (currentTime <= i10) {
                int max = Math.max(1, i10 - getConnectionsManager().getCurrentTime());
                this.h.setText(org.telegram.messenger.hd.a0("RestorePasswordResetIn", null, 2131746070, max > 86400 ? org.telegram.messenger.hd.G(max / 86400, "Days", new Object[0]) : max >= 3600 ? org.telegram.messenger.hd.G(max / 3600, "Hours", new Object[0]) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(max / 60), Integer.valueOf(max % 60))));
                org.telegram.ui.ActionBar.r6.V(this.h, org.telegram.ui.ActionBar.k6.D6, null);
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                }
                if (this.h.getVisibility() != 0) {
                    this.h.setVisibility(0);
                }
                this.r.setVisibility(0);
                org.telegram.messenger.g0.r(ea1Var);
                org.telegram.messenger.g0.i3(ea1Var, 1000L);
                if (this.I == null && this.n != null && this.h.getVisibility() == 0) {
                    return;
                }
                org.telegram.messenger.g0.r(ea1Var);
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
            this.n.l(org.telegram.messenger.hd.M0(2131750592, null), false);
            this.r.setVisibility(8);
            this.n.setVisibility(0);
        } else {
            this.n.l(org.telegram.messenger.hd.M0(2131746094, null), false);
            this.r.setVisibility(0);
            this.n.setVisibility(0);
        }
        org.telegram.ui.ActionBar.r6.Y(this.n, org.telegram.ui.ActionBar.k6.q6, null);
        org.telegram.messenger.g0.r(ea1Var);
        if (this.I == null) {
        }
        org.telegram.messenger.g0.r(ea1Var);
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
                int i7 = this.T;
                this.T = i7 + 1;
                this.S = i7;
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
                org.telegram.ui.Components.pj0 pj0Var = this.b;
                if (pj0Var != null) {
                    pj0Var.setVisibility(0);
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
                int i10 = org.telegram.ui.ActionBar.k6.a7;
                org.telegram.ui.ActionBar.r6.i(i10, view, null);
                this.fragmentView.setTag(Integer.valueOf(i10));
                return;
            }
            org.telegram.ui.Components.pj0 pj0Var2 = this.b;
            if (pj0Var2 != null) {
                pj0Var2.setEmptyView(null);
                this.b.setVisibility(4);
                this.D.setVisibility(0);
                this.y.setVisibility(4);
            }
            if (this.s != null) {
                this.E.e(true, false);
                this.s.setVisibility(0);
                View view2 = this.fragmentView;
                int i11 = org.telegram.ui.ActionBar.k6.d6;
                org.telegram.ui.ActionBar.r6.i(i11, view2, null);
                this.fragmentView.setTag(Integer.valueOf(i11));
                this.d.setVisibility(0);
                this.n.setVisibility(0);
                D0();
                this.f.setVisibility(8);
                if (TextUtils.isEmpty(this.I.hint)) {
                    this.s.setHint((CharSequence) null);
                } else {
                    this.s.setHint(this.I.hint);
                }
                org.telegram.messenger.g0.i3(new ea1(this, 0), 200L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fb  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i7;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        final int i11 = 1;
        if (!this.J || this.b0 != null) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.actionBar, null);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.m(kVar, 5, i12, null);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i12, null);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.u8, null);
            this.actionBar.setCastShadows(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i13 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i13, frameLayout, null);
        ScrollView scrollView = new ScrollView(context);
        this.D = scrollView;
        scrollView.setFillViewport(true);
        frameLayout.addView(this.D, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.D.addView(linearLayout, c8.ha.x(-1, -2, 51));
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        this.c = ch0Var;
        ch0Var.f(R.raw.tsv_setup_intro, 100, 100, null);
        this.c.d();
        org.telegram.ui.Components.ch0 ch0Var2 = this.c;
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                ch0Var2.setVisibility(i7);
                linearLayout.addView(this.c, c8.ha.r(100, 100, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                int i14 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.V(textView, i14, null);
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                this.d.setTypeface(org.telegram.messenger.g0.o());
                TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, this.d, c8.ha.t(-2, -2, 1, 24, 8, 24, 0), context);
                this.e = f10;
                int i15 = org.telegram.ui.ActionBar.k6.D6;
                org.telegram.ui.ActionBar.r6.V(f10, i15, null);
                this.e.setTextSize(1, 15.0f);
                this.e.setGravity(1);
                this.e.setVisibility(8);
                linearLayout.addView(this.e, c8.ha.t(-2, -2, 1, 42, 8, 42, 0));
                org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context, null);
                this.w = lb0Var;
                lb0Var.setText(org.telegram.messenger.hd.M0(2131751117, null));
                this.w.b(1.0f, 1.0f, false);
                linearLayout.addView(this.w, c8.ha.t(-1, -2, 1, 24, 24, 24, 0));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.s = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                org.telegram.ui.ActionBar.r6.V(this.s, i14, null);
                org.telegram.ui.ActionBar.r6.E(this.s, org.telegram.ui.ActionBar.k6.H6, null);
                this.s.setBackground(null);
                this.s.setSingleLine(true);
                this.s.setInputType(org.telegram.messenger.qs.N1);
                this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.s.setTypeface(Typeface.DEFAULT);
                EditTextBoldCursor editTextBoldCursor2 = this.s;
                int i16 = org.telegram.ui.ActionBar.k6.l6;
                org.telegram.ui.ActionBar.r6.w(editTextBoldCursor2, i16, null);
                this.s.setCursorWidth(1.5f);
                this.s.setContentDescription(org.telegram.messenger.hd.M0(2131751117, null));
                int L = org.telegram.messenger.g0.L(16.0f);
                this.s.setPadding(L, L, L, L);
                this.w.addView(this.s, c8.ha.c(-2.0f, -1));
                this.w.e(this.s);
                int i17 = 12;
                this.s.setOnFocusChangeListener(new fd(this, i17));
                this.s.setOnEditorActionListener(new fa(this, i17));
                this.s.addTextChangedListener(new m0(this, 18));
                TextView textView2 = new TextView(context);
                this.f = textView2;
                org.telegram.ui.ActionBar.r6.V(textView2, i15, null);
                this.f.setTextSize(1, 14.0f);
                this.f.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                this.f.setText(org.telegram.messenger.hd.M0(2131742819, null));
                TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, this.f, c8.ha.t(-2, -2, (!org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
                this.h = f11;
                org.telegram.ui.ActionBar.r6.V(f11, i15, null);
                this.h.setTextSize(1, 12.0f);
                this.h.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                linearLayout.addView(this.h, c8.ha.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(80);
                linearLayout2.setClipChildren(false);
                linearLayout.addView(linearLayout2, c8.ha.l(1.0f, -1, 0));
                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                this.n = k5Var;
                k5Var.setTextSize(15);
                this.n.setGravity(19);
                this.n.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                frameLayout.addView(this.n, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ha1
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
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
                h6.m.g(this.n);
                TextView textView3 = new TextView(context);
                this.r = textView3;
                textView3.setTextSize(1, 15.0f);
                this.r.setGravity(19);
                this.r.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                this.r.setText(org.telegram.messenger.hd.M0(2131752571, null));
                org.telegram.ui.ActionBar.r6.V(this.r, org.telegram.ui.ActionBar.k6.q6, null);
                this.r.setVisibility(8);
                frameLayout.addView(this.r, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ha1
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
                h6.m.g(this.r);
                org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
                this.E = p00Var;
                h6.m.g(p00Var);
                final int i18 = 2;
                this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ha1
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
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
                org.telegram.ui.Components.t11 t11Var = new org.telegram.ui.Components.t11(context);
                this.F = t11Var;
                t11Var.setTransformType(1);
                this.F.setProgress(0.0f);
                this.F.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
                this.F.setDrawBackground(false);
                this.E.setContentDescription(org.telegram.messenger.hd.M0(2131748249, null));
                this.E.addView(this.F, c8.ha.e(56, 56, 17));
                this.E.a(this.F);
                frameLayout.addView(this.E, org.telegram.ui.Components.p00.b());
                org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
                this.y = iyVar;
                iyVar.b();
                frameLayout.addView(this.y, c8.ha.c(-1.0f, -1));
                org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
                this.b = pj0Var;
                pj0Var.setSections(true);
                this.b.setLayoutManager(new v4.b0(1, false));
                this.b.setEmptyView(this.y);
                this.b.setVerticalScrollBarEnabled(false);
                frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
                org.telegram.ui.Components.pj0 pj0Var2 = this.b;
                ka1 ka1Var = new ka1(this, context);
                this.a = ka1Var;
                pj0Var2.setAdapter(ka1Var);
                this.b.setOnItemClickListener(new vx0(this, 11));
                ia1 ia1Var = new ia1(context, null);
                this.Y = ia1Var;
                ia1Var.setSize(org.telegram.messenger.g0.L(20.0f));
                this.Y.setAlpha(0.0f);
                this.Y.setScaleX(0.1f);
                this.Y.setScaleY(0.1f);
                this.Y.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i16, false));
                this.actionBar.addView(this.Y, c8.ha.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
                E0();
                if (this.J || this.b0 != null) {
                    this.actionBar.setTitle(null);
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131743932, null));
                }
                if (this.b0 == null) {
                    this.d.setText(org.telegram.messenger.hd.M0(2131742806, null));
                    int i19 = this.Z;
                    if (i19 == 1) {
                        this.e.setText(org.telegram.messenger.hd.M0(2131747212, null));
                    } else if (i19 == 2) {
                        org.telegram.messenger.k5.r(null, null, 2131747215, new Object[]{this.a0}, this.e);
                    } else if (i19 == 3) {
                        org.telegram.messenger.k5.r(null, null, 2131747214, new Object[]{this.a0}, this.e);
                    } else {
                        this.e.setText(org.telegram.messenger.hd.M0(2131747213, null));
                    }
                    this.e.setVisibility(0);
                } else {
                    this.d.setText(org.telegram.messenger.hd.M0(2131742806, null));
                    this.e.setVisibility(0);
                    this.e.setText(org.telegram.messenger.hd.M0(2131748723, null));
                }
                if (this.J) {
                    org.telegram.ui.ActionBar.r6.i(i13, this.fragmentView, null);
                    this.fragmentView.setTag(Integer.valueOf(i13));
                } else {
                    View view = this.fragmentView;
                    int i20 = org.telegram.ui.ActionBar.k6.a7;
                    org.telegram.ui.ActionBar.r6.i(i20, view, null);
                    this.fragmentView.setTag(Integer.valueOf(i20));
                }
                return this.fragmentView;
            }
        }
        i7 = 8;
        ch0Var2.setVisibility(i7);
        linearLayout.addView(this.c, c8.ha.r(100, 100, 1));
        TextView textView4 = new TextView(context);
        this.d = textView4;
        int i142 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView4, i142, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setGravity(1);
        this.d.setTypeface(org.telegram.messenger.g0.o());
        TextView f102 = org.telegram.messenger.camera.q.f(linearLayout, this.d, c8.ha.t(-2, -2, 1, 24, 8, 24, 0), context);
        this.e = f102;
        int i152 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.V(f102, i152, null);
        this.e.setTextSize(1, 15.0f);
        this.e.setGravity(1);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, c8.ha.t(-2, -2, 1, 42, 8, 42, 0));
        org.telegram.ui.Components.lb0 lb0Var2 = new org.telegram.ui.Components.lb0(context, null);
        this.w = lb0Var2;
        lb0Var2.setText(org.telegram.messenger.hd.M0(2131751117, null));
        this.w.b(1.0f, 1.0f, false);
        linearLayout.addView(this.w, c8.ha.t(-1, -2, 1, 24, 24, 24, 0));
        EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
        this.s = editTextBoldCursor3;
        editTextBoldCursor3.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(this.s, i142, null);
        org.telegram.ui.ActionBar.r6.E(this.s, org.telegram.ui.ActionBar.k6.H6, null);
        this.s.setBackground(null);
        this.s.setSingleLine(true);
        this.s.setInputType(org.telegram.messenger.qs.N1);
        this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.s.setTypeface(Typeface.DEFAULT);
        EditTextBoldCursor editTextBoldCursor22 = this.s;
        int i162 = org.telegram.ui.ActionBar.k6.l6;
        org.telegram.ui.ActionBar.r6.w(editTextBoldCursor22, i162, null);
        this.s.setCursorWidth(1.5f);
        this.s.setContentDescription(org.telegram.messenger.hd.M0(2131751117, null));
        int L2 = org.telegram.messenger.g0.L(16.0f);
        this.s.setPadding(L2, L2, L2, L2);
        this.w.addView(this.s, c8.ha.c(-2.0f, -1));
        this.w.e(this.s);
        int i172 = 12;
        this.s.setOnFocusChangeListener(new fd(this, i172));
        this.s.setOnEditorActionListener(new fa(this, i172));
        this.s.addTextChangedListener(new m0(this, 18));
        TextView textView22 = new TextView(context);
        this.f = textView22;
        org.telegram.ui.ActionBar.r6.V(textView22, i152, null);
        this.f.setTextSize(1, 14.0f);
        this.f.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        this.f.setText(org.telegram.messenger.hd.M0(2131742819, null));
        TextView f112 = org.telegram.messenger.camera.q.f(linearLayout, this.f, c8.ha.t(-2, -2, (!org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
        this.h = f112;
        org.telegram.ui.ActionBar.r6.V(f112, i152, null);
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        linearLayout.addView(this.h, c8.ha.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(1);
        linearLayout22.setGravity(80);
        linearLayout22.setClipChildren(false);
        linearLayout.addView(linearLayout22, c8.ha.l(1.0f, -1, 0));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.n = k5Var2;
        k5Var2.setTextSize(15);
        this.n.setGravity(19);
        this.n.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        frameLayout.addView(this.n, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ha1
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
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
        h6.m.g(this.n);
        TextView textView32 = new TextView(context);
        this.r = textView32;
        textView32.setTextSize(1, 15.0f);
        this.r.setGravity(19);
        this.r.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.r.setText(org.telegram.messenger.hd.M0(2131752571, null));
        org.telegram.ui.ActionBar.r6.V(this.r, org.telegram.ui.ActionBar.k6.q6, null);
        this.r.setVisibility(8);
        frameLayout.addView(this.r, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ha1
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
        h6.m.g(this.r);
        org.telegram.ui.Components.p00 p00Var2 = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.E = p00Var2;
        h6.m.g(p00Var2);
        final int i182 = 2;
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ha1
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i182) {
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
        org.telegram.ui.Components.t11 t11Var2 = new org.telegram.ui.Components.t11(context);
        this.F = t11Var2;
        t11Var2.setTransformType(1);
        this.F.setProgress(0.0f);
        this.F.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.F.setDrawBackground(false);
        this.E.setContentDescription(org.telegram.messenger.hd.M0(2131748249, null));
        this.E.addView(this.F, c8.ha.e(56, 56, 17));
        this.E.a(this.F);
        frameLayout.addView(this.E, org.telegram.ui.Components.p00.b());
        org.telegram.ui.Components.iy iyVar2 = new org.telegram.ui.Components.iy(context, null);
        this.y = iyVar2;
        iyVar2.b();
        frameLayout.addView(this.y, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.pj0 pj0Var3 = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var3;
        pj0Var3.setSections(true);
        this.b.setLayoutManager(new v4.b0(1, false));
        this.b.setEmptyView(this.y);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.pj0 pj0Var22 = this.b;
        ka1 ka1Var2 = new ka1(this, context);
        this.a = ka1Var2;
        pj0Var22.setAdapter(ka1Var2);
        this.b.setOnItemClickListener(new vx0(this, 11));
        ia1 ia1Var2 = new ia1(context, null);
        this.Y = ia1Var2;
        ia1Var2.setSize(org.telegram.messenger.g0.L(20.0f));
        this.Y.setAlpha(0.0f);
        this.Y.setScaleX(0.1f);
        this.Y.setScaleY(0.1f);
        this.Y.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i162, false));
        this.actionBar.addView(this.Y, c8.ha.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
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

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Object obj;
        if (i7 == org.telegram.messenger.qs.p0) {
            if (objArr.length > 0 && (obj = objArr[0]) != null) {
                this.K = (byte[]) obj;
            }
            s0(null, false, false);
            E0();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void finishFragment() {
        if (this.X < 0) {
            super.finishFragment();
            return;
        }
        Bundle k10 = a8.p0.k("afterSignup", true);
        je0 je0Var = new je0();
        je0Var.r0(k10);
        presentFragment(je0Var, true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    public final void o0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752575, null), new ca1(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752576, null), null);
        String M0 = org.telegram.messenger.hd.M0(2131752571, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131752577, null);
        showDialog(u1Var);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (this.X < 0) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        C0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.ch0 ch0Var = this.c;
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                ch0Var.setVisibility(i7);
            }
        }
        i7 = 8;
        ch0Var.setVisibility(i7);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.p0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.c0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.p0);
        this.H = true;
        org.telegram.ui.ActionBar.u1 u1Var = this.x;
        if (u1Var != null) {
            try {
                u1Var.dismiss();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.x = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.iy iyVar = this.y;
            if (iyVar != null) {
                iyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
            }
            org.telegram.ui.Components.t11 t11Var = this.F;
            if (t11Var != null) {
                t11Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
            }
            ia1 ia1Var = this.Y;
            if (ia1Var != null) {
                ia1Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (z9) {
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
        org.telegram.messenger.p10.i(this.currentAccount).u();
        this.M = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        u0(false);
        Utilities.e.c(new by0(23, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP q0() {
        TL_account.Password password = this.I;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return org.telegram.messenger.pv.d(this.K, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    public final void s0(Runnable runnable, boolean z9, boolean z10) {
        if (!z10) {
            this.G = true;
            ka1 ka1Var = this.a;
            if (ka1Var != null) {
                ka1Var.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new di.f6(this, z10, z9, runnable), 10);
    }

    public final void t0() {
        if (!this.J) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<ia1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Y, (Property<ia1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Y, (Property<ia1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.x;
        if (u1Var == null) {
            return;
        }
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.x = null;
    }

    public final void u0(boolean z9) {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.x != null) {
            return;
        }
        if (!this.J) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<ia1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<ia1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<ia1, Float>) View.SCALE_Y, 1.0f));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
        this.x = u1Var;
        u1Var.i0 = false;
        if (z9) {
            u1Var.r(300L);
        } else {
            u1Var.show();
        }
    }

    public final void v0(org.telegram.ui.Components.lb0 lb0Var, EditTextBoldCursor editTextBoldCursor, boolean z9) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z9) {
            editTextBoldCursor.setText("");
        }
        lb0Var.a(1.0f);
        org.telegram.messenger.g0.G3(5.0f, lb0Var, new ea1(this, 1));
    }

    public final void w0() {
        TL_account.Password password = this.I;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            u0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new da1(this, 1), 10);
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        if (this.I.pending_reset_date == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746119, null), new ca1(this, 4));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            String M0 = org.telegram.messenger.hd.M0(2131746094, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131746073, null);
            showDialog(u1Var);
            return;
        }
        if (getConnectionsManager().getCurrentTime() <= this.I.pending_reset_date) {
            o0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746119, null), new ca1(this, 3));
        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        String M02 = org.telegram.messenger.hd.M0(2131746094, null);
        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
        u1Var2.R = M02;
        u1Var2.T = org.telegram.messenger.hd.M0(2131746067, null);
        showDialog(u1Var2);
        TextView textView = (TextView) u1Var2.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
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
        byte[] h12 = org.telegram.messenger.g0.h1(obj);
        u0(false);
        Utilities.e.c(new by0(22, this, h12));
    }

    public final void z0() {
        u0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new da1(this, 0));
    }
}
