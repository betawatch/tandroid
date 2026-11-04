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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public ScrollView E;
    public org.telegram.ui.Components.l00 F;
    public org.telegram.ui.Components.n11 G;
    public boolean H;
    public boolean I;
    public TL_account.Password J;
    public boolean K;
    public byte[] L;
    public long M;
    public byte[] N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public final v91 W;
    public boolean X;
    public int Y;
    public z91 Z;
    public ba1 a;
    public int a0;
    public org.telegram.ui.Components.tj0 b;
    public String b0;
    public org.telegram.ui.Components.fh0 c;
    public ca1 c0;
    private int changePasswordRow;
    public TextView d;
    public final v91 d0;
    public TextView e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.ActionBar.k5 n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.gb0 w;
    public org.telegram.ui.ActionBar.s1 x;
    public org.telegram.ui.Components.gy y;

    public TwoStepVerificationActivity() {
        super(null);
        this.K = true;
        this.L = new byte[0];
        this.W = new v91(this, 2);
        this.Y = -1;
        this.d0 = new v91(this, 3);
    }

    public static /* synthetic */ void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            r0(password);
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.p0();
        }
    }

    public static /* synthetic */ void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            r0(password);
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.y0();
        }
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new u91(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.v0(twoStepVerificationActivity.w, twoStepVerificationActivity.s, true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.c0 == null || !z10) {
            twoStepVerificationActivity.t0();
        }
        if (!z10) {
            org.telegram.ui.Components.t4.w0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
            return;
        }
        twoStepVerificationActivity.L = bArr;
        twoStepVerificationActivity.K = true;
        if (twoStepVerificationActivity.c0 != null) {
            org.telegram.messenger.g0.v1(twoStepVerificationActivity.s);
            twoStepVerificationActivity.c0.l(twoStepVerificationActivity.q0());
            return;
        }
        if (!TextUtils.isEmpty(twoStepVerificationActivity.J.email_unconfirmed_pattern)) {
            ra1 ra1Var = new ra1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.J);
            ra1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, true);
            twoStepVerificationActivity.presentFragment(ra1Var, true);
            return;
        }
        org.telegram.messenger.g0.v1(twoStepVerificationActivity.s);
        TwoStepVerificationActivity twoStepVerificationActivity2 = new TwoStepVerificationActivity();
        twoStepVerificationActivity2.K = true;
        twoStepVerificationActivity2.L = twoStepVerificationActivity.L;
        twoStepVerificationActivity2.J = twoStepVerificationActivity.J;
        twoStepVerificationActivity2.N = twoStepVerificationActivity.N;
        twoStepVerificationActivity2.M = twoStepVerificationActivity.M;
        twoStepVerificationActivity.presentFragment(twoStepVerificationActivity2, true);
    }

    public static /* synthetic */ void d0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.J.current_algo;
        byte[] c2 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.hv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        co0 co0Var = new co0(twoStepVerificationActivity, bArr, c2, 12);
        TL_account.Password password = twoStepVerificationActivity.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            co0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.hv.d(c2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, co0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        co0Var.run(null, tL_error2);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new u91(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.J = null;
            twoStepVerificationActivity.L = new byte[0];
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.r0, new Object[0]);
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.q0, new Object[0]);
            twoStepVerificationActivity.finishFragment();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error.text);
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
            }
        }
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        if (tL_error == null) {
            twoStepVerificationActivity.H = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            if (!n0(password, false)) {
                org.telegram.ui.Components.t4.w0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                return;
            }
            if (!z10 || z11) {
                byte[] bArr = twoStepVerificationActivity.L;
                twoStepVerificationActivity.K = (bArr != null && bArr.length > 0) || !twoStepVerificationActivity.J.has_password;
            }
            r0(twoStepVerificationActivity.J);
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.q0, twoStepVerificationActivity.J);
        }
        if (runnable != null) {
            runnable.run();
        }
        twoStepVerificationActivity.E0();
    }

    public static /* synthetic */ void g0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            r0(password);
            org.telegram.messenger.hs.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.hs.q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.p0();
        }
    }

    public static void h0(TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        if (i3 == twoStepVerificationActivity.P || i3 == twoStepVerificationActivity.changePasswordRow) {
            ra1 ra1Var = new ra1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.J);
            ra1Var.K.add(twoStepVerificationActivity);
            ra1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, false);
            twoStepVerificationActivity.presentFragment(ra1Var);
            return;
        }
        if (i3 == twoStepVerificationActivity.R || i3 == twoStepVerificationActivity.S) {
            ra1 ra1Var2 = new ra1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.J);
            ra1Var2.K.add(twoStepVerificationActivity);
            ra1Var2.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, true);
            twoStepVerificationActivity.presentFragment(ra1Var2);
            return;
        }
        if (i3 == twoStepVerificationActivity.turnPasswordOffRow) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131743950, null);
            if (twoStepVerificationActivity.J.has_secure_values) {
                M0 = k2.p1.k(2131743951, null, t4.c.h(M0, "\n\n"));
            }
            String M02 = org.telegram.messenger.bd.M0(2131743949, null);
            String M03 = org.telegram.messenger.bd.M0(2131751436, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.U = M0;
            s1Var.S = M02;
            alertDialog$Builder.k(M03, new t91(twoStepVerificationActivity, 2));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            twoStepVerificationActivity.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
            }
        }
    }

    public static /* synthetic */ void i0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.J.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new u91(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.q0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new u91(twoStepVerificationActivity, 4), 10);
    }

    public static void j0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z10;
        byte[] s6;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.N = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z10 = false;
            if (!(securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000)) {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    s6 = Utilities.s(bArr3, bArr, bArr3);
                }
                org.telegram.messenger.g0.h3(new a60(twoStepVerificationActivity, z10, bArr2, 11));
            }
            s6 = Utilities.m(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            twoStepVerificationActivity.M = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s6, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s6, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.N;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!yj0.d1(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
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
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ei.u5(9));
                twoStepVerificationActivity.N = null;
                twoStepVerificationActivity.M = 0L;
            }
        } else {
            twoStepVerificationActivity.N = null;
            twoStepVerificationActivity.M = 0L;
        }
        z10 = true;
        org.telegram.messenger.g0.h3(new a60(twoStepVerificationActivity, z10, bArr2, 11));
    }

    public static void k0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        twoStepVerificationActivity.t0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                twoStepVerificationActivity.B0(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        TL_account.Password password = twoStepVerificationActivity.J;
        password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
        aa1 aa1Var = new aa1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
        aa1Var.K.add(twoStepVerificationActivity);
        aa1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, false);
        twoStepVerificationActivity.presentFragment(aa1Var);
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
        this.J = password;
        this.L = bArr;
        this.N = bArr2;
        this.M = j10;
        this.K = (bArr != null && bArr.length > 0) || !password.has_password;
    }

    public final void B0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = str;
        s1Var.U = str2;
        showDialog(s1Var);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131742958, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.G(this.Y, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743943, null), null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131750595, null), new t91(this, 0));
        org.telegram.ui.ActionBar.r6.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.k6.q7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() {
        TextView textView;
        if (this.K) {
            return;
        }
        int i3 = this.J.pending_reset_date;
        v91 v91Var = this.d0;
        if (i3 != 0) {
            int currentTime = getConnectionsManager().getCurrentTime();
            int i10 = this.J.pending_reset_date;
            if (currentTime <= i10) {
                int max = Math.max(1, i10 - getConnectionsManager().getCurrentTime());
                this.h.setText(org.telegram.messenger.bd.a0("RestorePasswordResetIn", null, 2131746079, max > 86400 ? org.telegram.messenger.bd.G(max / 86400, "Days", new Object[0]) : max >= 3600 ? org.telegram.messenger.bd.G(max / 3600, "Hours", new Object[0]) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(max / 60), Integer.valueOf(max % 60))));
                org.telegram.ui.ActionBar.r6.V(this.h, org.telegram.ui.ActionBar.k6.D6, null);
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                }
                if (this.h.getVisibility() != 0) {
                    this.h.setVisibility(0);
                }
                this.r.setVisibility(0);
                org.telegram.messenger.g0.r(v91Var);
                org.telegram.messenger.g0.i3(v91Var, 1000L);
                if (this.J == null && this.n != null && this.h.getVisibility() == 0) {
                    return;
                }
                org.telegram.messenger.g0.r(v91Var);
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
        if (this.J.pending_reset_date == 0) {
            this.n.l(org.telegram.messenger.bd.M0(2131750592, null), false);
            this.r.setVisibility(8);
            this.n.setVisibility(0);
        } else {
            this.n.l(org.telegram.messenger.bd.M0(2131746103, null), false);
            this.r.setVisibility(0);
            this.n.setVisibility(0);
        }
        org.telegram.ui.ActionBar.r6.Y(this.n, org.telegram.ui.ActionBar.k6.q6, null);
        org.telegram.messenger.g0.r(v91Var);
        if (this.J == null) {
        }
        org.telegram.messenger.g0.r(v91Var);
        textView = this.r;
        if (textView == null) {
        }
    }

    public final void E0() {
        TL_account.Password password;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.P);
        sb2.append(this.Q);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.R);
        sb2.append(this.S);
        sb2.append(this.T);
        sb2.append(this.U);
        this.U = 0;
        this.P = -1;
        this.Q = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        if (!this.H && (password = this.J) != null && this.K) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.U = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.U = 3;
                    this.S = 2;
                } else {
                    this.U = 3;
                    this.R = 2;
                }
                int i3 = this.U;
                this.U = i3 + 1;
                this.T = i3;
            } else {
                this.P = 0;
                this.U = 2;
                this.Q = 1;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.P);
        sb3.append(this.Q);
        sb3.append(this.changePasswordRow);
        sb3.append(this.turnPasswordOffRow);
        sb3.append(this.R);
        sb3.append(this.S);
        sb3.append(this.T);
        sb3.append(this.U);
        if (this.a != null && !sb2.toString().equals(sb3.toString())) {
            this.a.f();
        }
        if (this.fragmentView != null) {
            if (this.H || this.K) {
                org.telegram.ui.Components.tj0 tj0Var = this.b;
                if (tj0Var != null) {
                    tj0Var.setVisibility(0);
                    this.E.setVisibility(4);
                    this.b.setEmptyView(this.y);
                }
                if (this.s != null) {
                    this.F.e(false, false);
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
            org.telegram.ui.Components.tj0 tj0Var2 = this.b;
            if (tj0Var2 != null) {
                tj0Var2.setEmptyView(null);
                this.b.setVisibility(4);
                this.E.setVisibility(0);
                this.y.setVisibility(4);
            }
            if (this.s != null) {
                this.F.e(true, false);
                this.s.setVisibility(0);
                View view2 = this.fragmentView;
                int i11 = org.telegram.ui.ActionBar.k6.d6;
                org.telegram.ui.ActionBar.r6.i(i11, view2, null);
                this.fragmentView.setTag(Integer.valueOf(i11));
                this.d.setVisibility(0);
                this.n.setVisibility(0);
                D0();
                this.f.setVisibility(8);
                if (TextUtils.isEmpty(this.J.hint)) {
                    this.s.setHint((CharSequence) null);
                } else {
                    this.s.setHint(this.J.hint);
                }
                org.telegram.messenger.g0.i3(new v91(this, 0), 200L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f9  */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i3;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        final int i11 = 1;
        if (!this.K || this.c0 != null) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.actionBar, null);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.m(kVar, 5, i12, null);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i12, null);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.u8, null);
            this.actionBar.setCastShadows(false);
        }
        int i13 = 18;
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, i13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i14 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i14, frameLayout, null);
        ScrollView scrollView = new ScrollView(context);
        this.E = scrollView;
        scrollView.setFillViewport(true);
        frameLayout.addView(this.E, b8.mf.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.E.addView(linearLayout, b8.mf.x(-1, -2, 51));
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.c = fh0Var;
        fh0Var.f(R.raw.tsv_setup_intro, 100, 100, null);
        this.c.d();
        org.telegram.ui.Components.fh0 fh0Var2 = this.c;
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i3 = 0;
                fh0Var2.setVisibility(i3);
                linearLayout.addView(this.c, b8.mf.r(100, 100, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                int i15 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.V(textView, i15, null);
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                this.d.setTypeface(org.telegram.messenger.g0.o());
                TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, this.d, b8.mf.t(-2, -2, 1, 24, 8, 24, 0), context);
                this.e = f10;
                int i16 = org.telegram.ui.ActionBar.k6.D6;
                org.telegram.ui.ActionBar.r6.V(f10, i16, null);
                this.e.setTextSize(1, 15.0f);
                this.e.setGravity(1);
                this.e.setVisibility(8);
                linearLayout.addView(this.e, b8.mf.t(-2, -2, 1, 42, 8, 42, 0));
                org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, null);
                this.w = gb0Var;
                gb0Var.setText(org.telegram.messenger.bd.M0(2131751117, null));
                this.w.b(1.0f, 1.0f, false);
                linearLayout.addView(this.w, b8.mf.t(-1, -2, 1, 24, 24, 24, 0));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.s = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                org.telegram.ui.ActionBar.r6.V(this.s, i15, null);
                org.telegram.ui.ActionBar.r6.E(this.s, org.telegram.ui.ActionBar.k6.H6, null);
                this.s.setBackground(null);
                this.s.setSingleLine(true);
                this.s.setInputType(org.telegram.messenger.hs.N1);
                this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.s.setTypeface(Typeface.DEFAULT);
                EditTextBoldCursor editTextBoldCursor2 = this.s;
                int i17 = org.telegram.ui.ActionBar.k6.l6;
                org.telegram.ui.ActionBar.r6.w(editTextBoldCursor2, i17, null);
                this.s.setCursorWidth(1.5f);
                this.s.setContentDescription(org.telegram.messenger.bd.M0(2131751117, null));
                int L = org.telegram.messenger.g0.L(16.0f);
                this.s.setPadding(L, L, L, L);
                this.w.addView(this.s, b8.mf.c(-2.0f, -1));
                this.w.e(this.s);
                int i18 = 12;
                this.s.setOnFocusChangeListener(new ed(this, i18));
                this.s.setOnEditorActionListener(new ea(this, i18));
                this.s.addTextChangedListener(new n0(this, i13));
                TextView textView2 = new TextView(context);
                this.f = textView2;
                org.telegram.ui.ActionBar.r6.V(textView2, i16, null);
                this.f.setTextSize(1, 14.0f);
                this.f.setGravity((!org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
                this.f.setText(org.telegram.messenger.bd.M0(2131742828, null));
                TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, this.f, b8.mf.t(-2, -2, (!org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
                this.h = f11;
                org.telegram.ui.ActionBar.r6.V(f11, i16, null);
                this.h.setTextSize(1, 12.0f);
                this.h.setGravity((!org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
                linearLayout.addView(this.h, b8.mf.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(80);
                linearLayout2.setClipChildren(false);
                linearLayout.addView(linearLayout2, b8.mf.l(1.0f, -1, 0));
                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                this.n = k5Var;
                k5Var.setTextSize(15);
                this.n.setGravity(19);
                this.n.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                frameLayout.addView(this.n, b8.mf.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y91
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
                k4.j.k(this.n);
                TextView textView3 = new TextView(context);
                this.r = textView3;
                textView3.setTextSize(1, 15.0f);
                this.r.setGravity(19);
                this.r.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                this.r.setText(org.telegram.messenger.bd.M0(2131752571, null));
                org.telegram.ui.ActionBar.r6.V(this.r, org.telegram.ui.ActionBar.k6.q6, null);
                this.r.setVisibility(8);
                frameLayout.addView(this.r, b8.mf.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y91
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
                k4.j.k(this.r);
                org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
                this.F = l00Var;
                k4.j.k(l00Var);
                final int i19 = 2;
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y91
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
                org.telegram.ui.Components.n11 n11Var = new org.telegram.ui.Components.n11(context);
                this.G = n11Var;
                n11Var.setTransformType(1);
                this.G.setProgress(0.0f);
                this.G.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
                this.G.setDrawBackground(false);
                this.F.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
                this.F.addView(this.G, b8.mf.e(56, 56, 17));
                this.F.a(this.G);
                frameLayout.addView(this.F, org.telegram.ui.Components.l00.b());
                org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
                this.y = gyVar;
                gyVar.b();
                frameLayout.addView(this.y, b8.mf.c(-1.0f, -1));
                org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
                this.b = tj0Var;
                tj0Var.setSections(true);
                this.b.setLayoutManager(new u4.b0(1, false));
                this.b.setEmptyView(this.y);
                this.b.setVerticalScrollBarEnabled(false);
                frameLayout.addView(this.b, b8.mf.c(-1.0f, -1));
                org.telegram.ui.Components.tj0 tj0Var2 = this.b;
                ba1 ba1Var = new ba1(this, context);
                this.a = ba1Var;
                tj0Var2.setAdapter(ba1Var);
                this.b.setOnItemClickListener(new nx0(this, 11));
                z91 z91Var = new z91(context, null);
                this.Z = z91Var;
                z91Var.setSize(org.telegram.messenger.g0.L(20.0f));
                this.Z.setAlpha(0.0f);
                this.Z.setScaleX(0.1f);
                this.Z.setScaleY(0.1f);
                this.Z.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
                this.actionBar.addView(this.Z, b8.mf.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
                E0();
                if (this.K || this.c0 != null) {
                    this.actionBar.setTitle(null);
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131743941, null));
                }
                if (this.c0 == null) {
                    this.d.setText(org.telegram.messenger.bd.M0(2131742815, null));
                    int i20 = this.a0;
                    if (i20 == 1) {
                        this.e.setText(org.telegram.messenger.bd.M0(2131747221, null));
                    } else if (i20 == 2) {
                        org.telegram.messenger.k5.r(null, null, 2131747224, new Object[]{this.b0}, this.e);
                    } else if (i20 == 3) {
                        org.telegram.messenger.k5.r(null, null, 2131747223, new Object[]{this.b0}, this.e);
                    } else {
                        this.e.setText(org.telegram.messenger.bd.M0(2131747222, null));
                    }
                    this.e.setVisibility(0);
                } else {
                    this.d.setText(org.telegram.messenger.bd.M0(2131742815, null));
                    this.e.setVisibility(0);
                    this.e.setText(org.telegram.messenger.bd.M0(2131748732, null));
                }
                if (this.K) {
                    org.telegram.ui.ActionBar.r6.i(i14, this.fragmentView, null);
                    this.fragmentView.setTag(Integer.valueOf(i14));
                } else {
                    View view = this.fragmentView;
                    int i21 = org.telegram.ui.ActionBar.k6.a7;
                    org.telegram.ui.ActionBar.r6.i(i21, view, null);
                    this.fragmentView.setTag(Integer.valueOf(i21));
                }
                return this.fragmentView;
            }
        }
        i3 = 8;
        fh0Var2.setVisibility(i3);
        linearLayout.addView(this.c, b8.mf.r(100, 100, 1));
        TextView textView4 = new TextView(context);
        this.d = textView4;
        int i152 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView4, i152, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setGravity(1);
        this.d.setTypeface(org.telegram.messenger.g0.o());
        TextView f102 = org.telegram.messenger.camera.q.f(linearLayout, this.d, b8.mf.t(-2, -2, 1, 24, 8, 24, 0), context);
        this.e = f102;
        int i162 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.V(f102, i162, null);
        this.e.setTextSize(1, 15.0f);
        this.e.setGravity(1);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, b8.mf.t(-2, -2, 1, 42, 8, 42, 0));
        org.telegram.ui.Components.gb0 gb0Var2 = new org.telegram.ui.Components.gb0(context, null);
        this.w = gb0Var2;
        gb0Var2.setText(org.telegram.messenger.bd.M0(2131751117, null));
        this.w.b(1.0f, 1.0f, false);
        linearLayout.addView(this.w, b8.mf.t(-1, -2, 1, 24, 24, 24, 0));
        EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
        this.s = editTextBoldCursor3;
        editTextBoldCursor3.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(this.s, i152, null);
        org.telegram.ui.ActionBar.r6.E(this.s, org.telegram.ui.ActionBar.k6.H6, null);
        this.s.setBackground(null);
        this.s.setSingleLine(true);
        this.s.setInputType(org.telegram.messenger.hs.N1);
        this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.s.setTypeface(Typeface.DEFAULT);
        EditTextBoldCursor editTextBoldCursor22 = this.s;
        int i172 = org.telegram.ui.ActionBar.k6.l6;
        org.telegram.ui.ActionBar.r6.w(editTextBoldCursor22, i172, null);
        this.s.setCursorWidth(1.5f);
        this.s.setContentDescription(org.telegram.messenger.bd.M0(2131751117, null));
        int L2 = org.telegram.messenger.g0.L(16.0f);
        this.s.setPadding(L2, L2, L2, L2);
        this.w.addView(this.s, b8.mf.c(-2.0f, -1));
        this.w.e(this.s);
        int i182 = 12;
        this.s.setOnFocusChangeListener(new ed(this, i182));
        this.s.setOnEditorActionListener(new ea(this, i182));
        this.s.addTextChangedListener(new n0(this, i13));
        TextView textView22 = new TextView(context);
        this.f = textView22;
        org.telegram.ui.ActionBar.r6.V(textView22, i162, null);
        this.f.setTextSize(1, 14.0f);
        this.f.setGravity((!org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
        this.f.setText(org.telegram.messenger.bd.M0(2131742828, null));
        TextView f112 = org.telegram.messenger.camera.q.f(linearLayout, this.f, b8.mf.t(-2, -2, (!org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
        this.h = f112;
        org.telegram.ui.ActionBar.r6.V(f112, i162, null);
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity((!org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
        linearLayout.addView(this.h, b8.mf.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(1);
        linearLayout22.setGravity(80);
        linearLayout22.setClipChildren(false);
        linearLayout.addView(linearLayout22, b8.mf.l(1.0f, -1, 0));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.n = k5Var2;
        k5Var2.setTextSize(15);
        this.n.setGravity(19);
        this.n.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        frameLayout.addView(this.n, b8.mf.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y91
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
        k4.j.k(this.n);
        TextView textView32 = new TextView(context);
        this.r = textView32;
        textView32.setTextSize(1, 15.0f);
        this.r.setGravity(19);
        this.r.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.r.setText(org.telegram.messenger.bd.M0(2131752571, null));
        org.telegram.ui.ActionBar.r6.V(this.r, org.telegram.ui.ActionBar.k6.q6, null);
        this.r.setVisibility(8);
        frameLayout.addView(this.r, b8.mf.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y91
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
        k4.j.k(this.r);
        org.telegram.ui.Components.l00 l00Var2 = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.F = l00Var2;
        k4.j.k(l00Var2);
        final int i192 = 2;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y91
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
        org.telegram.ui.Components.n11 n11Var2 = new org.telegram.ui.Components.n11(context);
        this.G = n11Var2;
        n11Var2.setTransformType(1);
        this.G.setProgress(0.0f);
        this.G.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.G.setDrawBackground(false);
        this.F.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
        this.F.addView(this.G, b8.mf.e(56, 56, 17));
        this.F.a(this.G);
        frameLayout.addView(this.F, org.telegram.ui.Components.l00.b());
        org.telegram.ui.Components.gy gyVar2 = new org.telegram.ui.Components.gy(context, null);
        this.y = gyVar2;
        gyVar2.b();
        frameLayout.addView(this.y, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.tj0 tj0Var3 = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var3;
        tj0Var3.setSections(true);
        this.b.setLayoutManager(new u4.b0(1, false));
        this.b.setEmptyView(this.y);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.tj0 tj0Var22 = this.b;
        ba1 ba1Var2 = new ba1(this, context);
        this.a = ba1Var2;
        tj0Var22.setAdapter(ba1Var2);
        this.b.setOnItemClickListener(new nx0(this, 11));
        z91 z91Var2 = new z91(context, null);
        this.Z = z91Var2;
        z91Var2.setSize(org.telegram.messenger.g0.L(20.0f));
        this.Z.setAlpha(0.0f);
        this.Z.setScaleX(0.1f);
        this.Z.setScaleY(0.1f);
        this.Z.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i172, false));
        this.actionBar.addView(this.Z, b8.mf.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        E0();
        if (this.K) {
        }
        this.actionBar.setTitle(null);
        if (this.c0 == null) {
        }
        if (this.K) {
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Object obj;
        if (i3 == org.telegram.messenger.hs.p0) {
            if (objArr.length > 0 && (obj = objArr[0]) != null) {
                this.L = (byte[]) obj;
            }
            s0(null, false, false);
            E0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void finishFragment() {
        if (this.Y < 0) {
            super.finishFragment();
            return;
        }
        Bundle k10 = a1.g.k("afterSignup", true);
        ee0 ee0Var = new ee0();
        ee0Var.r0(k10);
        presentFragment(ee0Var, true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    public final void o0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752575, null), new t91(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752576, null), null);
        String M0 = org.telegram.messenger.bd.M0(2131752571, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752577, null);
        showDialog(s1Var);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (this.Y < 0) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        C0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        int i3;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.fh0 fh0Var = this.c;
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i3 = 0;
                fh0Var.setVisibility(i3);
            }
        }
        i3 = 8;
        fh0Var.setVisibility(i3);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.p0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.d0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.p0);
        this.I = true;
        org.telegram.ui.ActionBar.s1 s1Var = this.x;
        if (s1Var != null) {
            try {
                s1Var.dismiss();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.x = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.gy gyVar = this.y;
            if (gyVar != null) {
                gyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
            }
            org.telegram.ui.Components.n11 n11Var = this.G;
            if (n11Var != null) {
                n11Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
            }
            z91 z91Var = this.Z;
            if (z91Var != null) {
                z91Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            if (this.X) {
                w0();
                this.X = false;
            } else if (this.O) {
                z0();
                this.O = false;
            }
        }
    }

    public final void p0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.L;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        org.telegram.messenger.h10.i(this.currentAccount).u();
        this.N = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        u0(false);
        Utilities.e.c(new qv0(28, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP q0() {
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return org.telegram.messenger.hv.d(this.L, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    public final void s0(Runnable runnable, boolean z10, boolean z11) {
        if (!z11) {
            this.H = true;
            ba1 ba1Var = this.a;
            if (ba1Var != null) {
                ba1Var.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ei.g6(this, z11, z10, runnable), 10);
    }

    public final void t0() {
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<z91, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<z91, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Z, (Property<z91, Float>) View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = this.x;
        if (s1Var == null) {
            return;
        }
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.x = null;
    }

    public final void u0(boolean z10) {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.x != null) {
            return;
        }
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<z91, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<z91, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<z91, Float>) View.SCALE_Y, 1.0f));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
        this.x = s1Var;
        s1Var.j0 = false;
        if (z10) {
            s1Var.r(300L);
        } else {
            s1Var.show();
        }
    }

    public final void v0(org.telegram.ui.Components.gb0 gb0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        gb0Var.a(1.0f);
        org.telegram.messenger.g0.G3(5.0f, gb0Var, new v91(this, 1));
    }

    public final void w0() {
        TL_account.Password password = this.J;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            u0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new u91(this, 1), 10);
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        if (this.J.pending_reset_date == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new t91(this, 4));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            String M0 = org.telegram.messenger.bd.M0(2131746103, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746082, null);
            showDialog(s1Var);
            return;
        }
        if (getConnectionsManager().getCurrentTime() <= this.J.pending_reset_date) {
            o0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746128, null), new t91(this, 3));
        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        String M02 = org.telegram.messenger.bd.M0(2131746103, null);
        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
        s1Var2.S = M02;
        s1Var2.U = org.telegram.messenger.bd.M0(2131746076, null);
        showDialog(s1Var2);
        TextView textView = (TextView) s1Var2.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public final void x0(Runnable runnable) {
        byte[] bArr;
        TL_account.Password password = this.J;
        if (password == null || password.current_algo == null || (bArr = this.L) == null || bArr.length <= 0) {
            s0(runnable, true, password != null);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void y0() {
        if (this.K) {
            return;
        }
        String obj = this.s.getText().toString();
        if (obj.length() == 0) {
            v0(this.w, this.s, false);
            return;
        }
        byte[] h12 = org.telegram.messenger.g0.h1(obj);
        u0(false);
        Utilities.e.c(new qv0(27, this, h12));
    }

    public final void z0() {
        u0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new u91(this, 0));
    }
}
