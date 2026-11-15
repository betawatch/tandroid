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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public ScrollView E;
    public org.telegram.ui.Components.t00 F;
    public org.telegram.ui.Components.y11 G;
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
    public final da1 W;
    public boolean X;
    public int Y;
    public ha1 Z;
    public ja1 a;
    public int a0;
    public org.telegram.ui.Components.uj0 b;
    public String b0;
    public org.telegram.ui.Components.fh0 c;
    public ka1 c0;
    private int changePasswordRow;
    public TextView d;
    public final da1 d0;
    public TextView e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.ActionBar.j5 n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.mb0 w;
    public org.telegram.ui.ActionBar.t1 x;
    public org.telegram.ui.Components.ny y;

    public TwoStepVerificationActivity() {
        super(null);
        this.K = true;
        this.L = new byte[0];
        this.W = new da1(this, 2);
        this.Y = -1;
        this.d0 = new da1(this, 3);
    }

    public static /* synthetic */ void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            r0(password);
            org.telegram.messenger.ns.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ns.q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.p0();
        }
    }

    public static /* synthetic */ void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            r0(password);
            org.telegram.messenger.ns.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ns.q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.y0();
        }
    }

    public static void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ca1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.v0(twoStepVerificationActivity.w, twoStepVerificationActivity.s, true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, byte[] bArr) {
        if (twoStepVerificationActivity.c0 == null || !z10) {
            twoStepVerificationActivity.t0();
        }
        if (!z10) {
            org.telegram.ui.Components.t4.u0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
            return;
        }
        twoStepVerificationActivity.L = bArr;
        twoStepVerificationActivity.K = true;
        if (twoStepVerificationActivity.c0 != null) {
            org.telegram.messenger.g0.v1(twoStepVerificationActivity.s);
            twoStepVerificationActivity.c0.k(twoStepVerificationActivity.q0());
            return;
        }
        if (!TextUtils.isEmpty(twoStepVerificationActivity.J.email_unconfirmed_pattern)) {
            xa1 xa1Var = new xa1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.J);
            xa1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, true);
            twoStepVerificationActivity.presentFragment(xa1Var, true);
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
        byte[] c10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? org.telegram.messenger.nv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        jo0 jo0Var = new jo0(twoStepVerificationActivity, bArr, c10, 12);
        TL_account.Password password = twoStepVerificationActivity.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            jo0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.nv.d(c10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, jo0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        jo0Var.run(null, tL_error2);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ca1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.t0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.J = null;
            twoStepVerificationActivity.L = new byte[0];
            org.telegram.messenger.ns.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ns.r0, new Object[0]);
            org.telegram.messenger.ns.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ns.q0, new Object[0]);
            twoStepVerificationActivity.finishFragment();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error.text);
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
            }
        }
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, boolean z11, Runnable runnable) {
        if (tL_error == null) {
            twoStepVerificationActivity.H = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.J = password;
            if (!n0(password, false)) {
                org.telegram.ui.Components.t4.u0(twoStepVerificationActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                return;
            }
            if (!z10 || z11) {
                byte[] bArr = twoStepVerificationActivity.L;
                twoStepVerificationActivity.K = (bArr != null && bArr.length > 0) || !twoStepVerificationActivity.J.has_password;
            }
            r0(twoStepVerificationActivity.J);
            org.telegram.messenger.ns.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ns.q0, twoStepVerificationActivity.J);
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
            org.telegram.messenger.ns.f(twoStepVerificationActivity.currentAccount).k(org.telegram.messenger.ns.q0, twoStepVerificationActivity.J);
            twoStepVerificationActivity.p0();
        }
    }

    public static void h0(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        if (i7 == twoStepVerificationActivity.P || i7 == twoStepVerificationActivity.changePasswordRow) {
            xa1 xa1Var = new xa1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.J);
            xa1Var.K.add(twoStepVerificationActivity);
            xa1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, false);
            twoStepVerificationActivity.presentFragment(xa1Var);
            return;
        }
        if (i7 == twoStepVerificationActivity.R || i7 == twoStepVerificationActivity.S) {
            xa1 xa1Var2 = new xa1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.J);
            xa1Var2.K.add(twoStepVerificationActivity);
            xa1Var2.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, true);
            twoStepVerificationActivity.presentFragment(xa1Var2);
            return;
        }
        if (i7 == twoStepVerificationActivity.turnPasswordOffRow) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131743940, null);
            if (twoStepVerificationActivity.J.has_secure_values) {
                M0 = i5.c.k(2131743941, null, r.b.m(M0, "\n\n"));
            }
            String M02 = org.telegram.messenger.hd.M0(2131743939, null);
            String M03 = org.telegram.messenger.hd.M0(2131751435, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.U = M0;
            t1Var.S = M02;
            alertDialog$Builder.k(M03, new ba1(twoStepVerificationActivity, 2));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            twoStepVerificationActivity.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
            }
        }
    }

    public static /* synthetic */ void i0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.J.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ca1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.q0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ca1(twoStepVerificationActivity, 4), 10);
    }

    public static void j0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z10;
        byte[] s5;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.N = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z10 = false;
            if (!(securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000)) {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    s5 = Utilities.s(bArr3, bArr, bArr3);
                }
                org.telegram.messenger.g0.h3(new f60(twoStepVerificationActivity, z10, bArr2, 11));
            }
            s5 = Utilities.m(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            twoStepVerificationActivity.M = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(s5, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(s5, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.N;
            Utilities.b(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!ek0.d1(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
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
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new fi.m5(9));
                twoStepVerificationActivity.N = null;
                twoStepVerificationActivity.M = 0L;
            }
        } else {
            twoStepVerificationActivity.N = null;
            twoStepVerificationActivity.M = 0L;
        }
        z10 = true;
        org.telegram.messenger.g0.h3(new f60(twoStepVerificationActivity, z10, bArr2, 11));
    }

    public static void k0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        twoStepVerificationActivity.t0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                twoStepVerificationActivity.B0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        TL_account.Password password = twoStepVerificationActivity.J;
        password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
        ia1 ia1Var = new ia1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
        ia1Var.K.add(twoStepVerificationActivity);
        ia1Var.I0(twoStepVerificationActivity.L, twoStepVerificationActivity.M, twoStepVerificationActivity.N, false);
        twoStepVerificationActivity.presentFragment(ia1Var);
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

    public final void A0(TL_account.Password password, byte[] bArr, long j3, byte[] bArr2) {
        this.J = password;
        this.L = bArr;
        this.N = bArr2;
        this.M = j3;
        this.K = (bArr != null && bArr.length > 0) || !password.has_password;
    }

    public final void B0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = str;
        t1Var.U = str2;
        showDialog(t1Var);
    }

    public final void C0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131742948, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.G(this.Y, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131743933, null), null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131750594, null), new ba1(this, 0));
        org.telegram.ui.ActionBar.q6.U((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.j6.q7, null);
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
        int i7 = this.J.pending_reset_date;
        da1 da1Var = this.d0;
        if (i7 != 0) {
            int currentTime = getConnectionsManager().getCurrentTime();
            int i10 = this.J.pending_reset_date;
            if (currentTime <= i10) {
                int max = Math.max(1, i10 - getConnectionsManager().getCurrentTime());
                this.h.setText(org.telegram.messenger.hd.a0("RestorePasswordResetIn", null, 2131746069, max > 86400 ? org.telegram.messenger.hd.G(max / 86400, "Days", new Object[0]) : max >= 3600 ? org.telegram.messenger.hd.G(max / 3600, "Hours", new Object[0]) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(max / 60), Integer.valueOf(max % 60))));
                org.telegram.ui.ActionBar.q6.U(this.h, org.telegram.ui.ActionBar.j6.D6, null);
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                }
                if (this.h.getVisibility() != 0) {
                    this.h.setVisibility(0);
                }
                this.r.setVisibility(0);
                org.telegram.messenger.g0.r(da1Var);
                org.telegram.messenger.g0.i3(da1Var, 1000L);
                if (this.J == null && this.n != null && this.h.getVisibility() == 0) {
                    return;
                }
                org.telegram.messenger.g0.r(da1Var);
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
            this.n.l(org.telegram.messenger.hd.M0(2131750591, null), false);
            this.r.setVisibility(8);
            this.n.setVisibility(0);
        } else {
            this.n.l(org.telegram.messenger.hd.M0(2131746093, null), false);
            this.r.setVisibility(0);
            this.n.setVisibility(0);
        }
        org.telegram.ui.ActionBar.q6.X(this.n, org.telegram.ui.ActionBar.j6.q6, null);
        org.telegram.messenger.g0.r(da1Var);
        if (this.J == null) {
        }
        org.telegram.messenger.g0.r(da1Var);
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
                int i7 = this.U;
                this.U = i7 + 1;
                this.T = i7;
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
                org.telegram.ui.Components.uj0 uj0Var = this.b;
                if (uj0Var != null) {
                    uj0Var.setVisibility(0);
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
                int i10 = org.telegram.ui.ActionBar.j6.a7;
                org.telegram.ui.ActionBar.q6.h(i10, view, null);
                this.fragmentView.setTag(Integer.valueOf(i10));
                return;
            }
            org.telegram.ui.Components.uj0 uj0Var2 = this.b;
            if (uj0Var2 != null) {
                uj0Var2.setEmptyView(null);
                this.b.setVisibility(4);
                this.E.setVisibility(0);
                this.y.setVisibility(4);
            }
            if (this.s != null) {
                this.F.e(true, false);
                this.s.setVisibility(0);
                View view2 = this.fragmentView;
                int i11 = org.telegram.ui.ActionBar.j6.d6;
                org.telegram.ui.ActionBar.q6.h(i11, view2, null);
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
                org.telegram.messenger.g0.i3(new da1(this, 0), 200L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
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
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i7;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        final int i11 = 1;
        if (!this.K || this.c0 != null) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, this.actionBar, null);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.l(kVar, 5, i12, null);
            org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, i12, null);
            org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.u8, null);
            this.actionBar.setCastShadows(false);
        }
        int i13 = 18;
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, i13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i14 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.q6.h(i14, frameLayout, null);
        ScrollView scrollView = new ScrollView(context);
        this.E = scrollView;
        scrollView.setFillViewport(true);
        frameLayout.addView(this.E, c8.ja.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.E.addView(linearLayout, c8.ja.x(-1, -2, 51));
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.c = fh0Var;
        fh0Var.f(R.raw.tsv_setup_intro, 100, 100, null);
        this.c.d();
        org.telegram.ui.Components.fh0 fh0Var2 = this.c;
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                fh0Var2.setVisibility(i7);
                linearLayout.addView(this.c, c8.ja.r(100, 100, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                int i15 = org.telegram.ui.ActionBar.j6.G6;
                org.telegram.ui.ActionBar.q6.U(textView, i15, null);
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                this.d.setTypeface(org.telegram.messenger.g0.o());
                TextView f10 = org.telegram.messenger.i20.f(linearLayout, this.d, c8.ja.t(-2, -2, 1, 24, 8, 24, 0), context);
                this.e = f10;
                int i16 = org.telegram.ui.ActionBar.j6.D6;
                org.telegram.ui.ActionBar.q6.U(f10, i16, null);
                this.e.setTextSize(1, 15.0f);
                this.e.setGravity(1);
                this.e.setVisibility(8);
                linearLayout.addView(this.e, c8.ja.t(-2, -2, 1, 42, 8, 42, 0));
                org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(context, null);
                this.w = mb0Var;
                mb0Var.setText(org.telegram.messenger.hd.M0(2131751116, null));
                this.w.b(1.0f, 1.0f, false);
                linearLayout.addView(this.w, c8.ja.t(-1, -2, 1, 24, 24, 24, 0));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.s = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                org.telegram.ui.ActionBar.q6.U(this.s, i15, null);
                org.telegram.ui.ActionBar.q6.D(this.s, org.telegram.ui.ActionBar.j6.H6, null);
                this.s.setBackground(null);
                this.s.setSingleLine(true);
                this.s.setInputType(org.telegram.messenger.ns.N1);
                this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.s.setTypeface(Typeface.DEFAULT);
                EditTextBoldCursor editTextBoldCursor2 = this.s;
                int i17 = org.telegram.ui.ActionBar.j6.l6;
                org.telegram.ui.ActionBar.q6.v(editTextBoldCursor2, i17, null);
                this.s.setCursorWidth(1.5f);
                this.s.setContentDescription(org.telegram.messenger.hd.M0(2131751116, null));
                int L = org.telegram.messenger.g0.L(16.0f);
                this.s.setPadding(L, L, L, L);
                this.w.addView(this.s, c8.ja.c(-2.0f, -1));
                this.w.e(this.s);
                int i18 = 12;
                this.s.setOnFocusChangeListener(new ed(this, i18));
                this.s.setOnEditorActionListener(new fa(this, i18));
                this.s.addTextChangedListener(new m0(this, i13));
                TextView textView2 = new TextView(context);
                this.f = textView2;
                org.telegram.ui.ActionBar.q6.U(textView2, i16, null);
                this.f.setTextSize(1, 14.0f);
                this.f.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                this.f.setText(org.telegram.messenger.hd.M0(2131742818, null));
                TextView f11 = org.telegram.messenger.i20.f(linearLayout, this.f, c8.ja.t(-2, -2, (!org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
                this.h = f11;
                org.telegram.ui.ActionBar.q6.U(f11, i16, null);
                this.h.setTextSize(1, 12.0f);
                this.h.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                linearLayout.addView(this.h, c8.ja.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(80);
                linearLayout2.setClipChildren(false);
                linearLayout.addView(linearLayout2, c8.ja.l(1.0f, -1, 0));
                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                this.n = j5Var;
                j5Var.setTextSize(15);
                this.n.setGravity(19);
                this.n.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                frameLayout.addView(this.n, c8.ja.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ga1
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
                org.telegram.ui.ActionBar.q6.U(this.r, org.telegram.ui.ActionBar.j6.q6, null);
                this.r.setVisibility(8);
                frameLayout.addView(this.r, c8.ja.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ga1
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
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
                this.F = t00Var;
                h6.m.g(t00Var);
                final int i19 = 2;
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ga1
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
                org.telegram.ui.Components.y11 y11Var = new org.telegram.ui.Components.y11(context);
                this.G = y11Var;
                y11Var.setTransformType(1);
                this.G.setProgress(0.0f);
                this.G.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.O9, false));
                this.G.setDrawBackground(false);
                this.F.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
                this.F.addView(this.G, c8.ja.e(56, 56, 17));
                this.F.a(this.G);
                frameLayout.addView(this.F, org.telegram.ui.Components.t00.b());
                org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
                this.y = nyVar;
                nyVar.b();
                frameLayout.addView(this.y, c8.ja.c(-1.0f, -1));
                org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
                this.b = uj0Var;
                uj0Var.setSections(true);
                this.b.setLayoutManager(new v4.b0(1, false));
                this.b.setEmptyView(this.y);
                this.b.setVerticalScrollBarEnabled(false);
                frameLayout.addView(this.b, c8.ja.c(-1.0f, -1));
                org.telegram.ui.Components.uj0 uj0Var2 = this.b;
                ja1 ja1Var = new ja1(this, context);
                this.a = ja1Var;
                uj0Var2.setAdapter(ja1Var);
                this.b.setOnItemClickListener(new ux0(this, 11));
                ha1 ha1Var = new ha1(context, null);
                this.Z = ha1Var;
                ha1Var.setSize(org.telegram.messenger.g0.L(20.0f));
                this.Z.setAlpha(0.0f);
                this.Z.setScaleX(0.1f);
                this.Z.setScaleY(0.1f);
                this.Z.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, i17, false));
                this.actionBar.addView(this.Z, c8.ja.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
                E0();
                if (this.K || this.c0 != null) {
                    this.actionBar.setTitle(null);
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131743931, null));
                }
                if (this.c0 == null) {
                    this.d.setText(org.telegram.messenger.hd.M0(2131742805, null));
                    int i20 = this.a0;
                    if (i20 == 1) {
                        this.e.setText(org.telegram.messenger.hd.M0(2131747213, null));
                    } else if (i20 == 2) {
                        org.telegram.messenger.k5.q(null, null, 2131747216, new Object[]{this.b0}, this.e);
                    } else if (i20 == 3) {
                        org.telegram.messenger.k5.q(null, null, 2131747215, new Object[]{this.b0}, this.e);
                    } else {
                        this.e.setText(org.telegram.messenger.hd.M0(2131747214, null));
                    }
                    this.e.setVisibility(0);
                } else {
                    this.d.setText(org.telegram.messenger.hd.M0(2131742805, null));
                    this.e.setVisibility(0);
                    this.e.setText(org.telegram.messenger.hd.M0(2131748724, null));
                }
                if (this.K) {
                    org.telegram.ui.ActionBar.q6.h(i14, this.fragmentView, null);
                    this.fragmentView.setTag(Integer.valueOf(i14));
                } else {
                    View view = this.fragmentView;
                    int i21 = org.telegram.ui.ActionBar.j6.a7;
                    org.telegram.ui.ActionBar.q6.h(i21, view, null);
                    this.fragmentView.setTag(Integer.valueOf(i21));
                }
                return this.fragmentView;
            }
        }
        i7 = 8;
        fh0Var2.setVisibility(i7);
        linearLayout.addView(this.c, c8.ja.r(100, 100, 1));
        TextView textView4 = new TextView(context);
        this.d = textView4;
        int i152 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView4, i152, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setGravity(1);
        this.d.setTypeface(org.telegram.messenger.g0.o());
        TextView f102 = org.telegram.messenger.i20.f(linearLayout, this.d, c8.ja.t(-2, -2, 1, 24, 8, 24, 0), context);
        this.e = f102;
        int i162 = org.telegram.ui.ActionBar.j6.D6;
        org.telegram.ui.ActionBar.q6.U(f102, i162, null);
        this.e.setTextSize(1, 15.0f);
        this.e.setGravity(1);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, c8.ja.t(-2, -2, 1, 42, 8, 42, 0));
        org.telegram.ui.Components.mb0 mb0Var2 = new org.telegram.ui.Components.mb0(context, null);
        this.w = mb0Var2;
        mb0Var2.setText(org.telegram.messenger.hd.M0(2131751116, null));
        this.w.b(1.0f, 1.0f, false);
        linearLayout.addView(this.w, c8.ja.t(-1, -2, 1, 24, 24, 24, 0));
        EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
        this.s = editTextBoldCursor3;
        editTextBoldCursor3.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.U(this.s, i152, null);
        org.telegram.ui.ActionBar.q6.D(this.s, org.telegram.ui.ActionBar.j6.H6, null);
        this.s.setBackground(null);
        this.s.setSingleLine(true);
        this.s.setInputType(org.telegram.messenger.ns.N1);
        this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.s.setTypeface(Typeface.DEFAULT);
        EditTextBoldCursor editTextBoldCursor22 = this.s;
        int i172 = org.telegram.ui.ActionBar.j6.l6;
        org.telegram.ui.ActionBar.q6.v(editTextBoldCursor22, i172, null);
        this.s.setCursorWidth(1.5f);
        this.s.setContentDescription(org.telegram.messenger.hd.M0(2131751116, null));
        int L2 = org.telegram.messenger.g0.L(16.0f);
        this.s.setPadding(L2, L2, L2, L2);
        this.w.addView(this.s, c8.ja.c(-2.0f, -1));
        this.w.e(this.s);
        int i182 = 12;
        this.s.setOnFocusChangeListener(new ed(this, i182));
        this.s.setOnEditorActionListener(new fa(this, i182));
        this.s.addTextChangedListener(new m0(this, i13));
        TextView textView22 = new TextView(context);
        this.f = textView22;
        org.telegram.ui.ActionBar.q6.U(textView22, i162, null);
        this.f.setTextSize(1, 14.0f);
        this.f.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        this.f.setText(org.telegram.messenger.hd.M0(2131742818, null));
        TextView f112 = org.telegram.messenger.i20.f(linearLayout, this.f, c8.ja.t(-2, -2, (!org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 40, 30, 40, 0), context);
        this.h = f112;
        org.telegram.ui.ActionBar.q6.U(f112, i162, null);
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity((!org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        linearLayout.addView(this.h, c8.ja.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(1);
        linearLayout22.setGravity(80);
        linearLayout22.setClipChildren(false);
        linearLayout.addView(linearLayout22, c8.ja.l(1.0f, -1, 0));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.n = j5Var2;
        j5Var2.setTextSize(15);
        this.n.setGravity(19);
        this.n.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        frameLayout.addView(this.n, c8.ja.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ga1
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
        org.telegram.ui.ActionBar.q6.U(this.r, org.telegram.ui.ActionBar.j6.q6, null);
        this.r.setVisibility(8);
        frameLayout.addView(this.r, c8.ja.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ga1
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
        org.telegram.ui.Components.t00 t00Var2 = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
        this.F = t00Var2;
        h6.m.g(t00Var2);
        final int i192 = 2;
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ga1
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
        org.telegram.ui.Components.y11 y11Var2 = new org.telegram.ui.Components.y11(context);
        this.G = y11Var2;
        y11Var2.setTransformType(1);
        this.G.setProgress(0.0f);
        this.G.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.O9, false));
        this.G.setDrawBackground(false);
        this.F.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
        this.F.addView(this.G, c8.ja.e(56, 56, 17));
        this.F.a(this.G);
        frameLayout.addView(this.F, org.telegram.ui.Components.t00.b());
        org.telegram.ui.Components.ny nyVar2 = new org.telegram.ui.Components.ny(context, null);
        this.y = nyVar2;
        nyVar2.b();
        frameLayout.addView(this.y, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Components.uj0 uj0Var3 = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var3;
        uj0Var3.setSections(true);
        this.b.setLayoutManager(new v4.b0(1, false));
        this.b.setEmptyView(this.y);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Components.uj0 uj0Var22 = this.b;
        ja1 ja1Var2 = new ja1(this, context);
        this.a = ja1Var2;
        uj0Var22.setAdapter(ja1Var2);
        this.b.setOnItemClickListener(new ux0(this, 11));
        ha1 ha1Var2 = new ha1(context, null);
        this.Z = ha1Var2;
        ha1Var2.setSize(org.telegram.messenger.g0.L(20.0f));
        this.Z.setAlpha(0.0f);
        this.Z.setScaleX(0.1f);
        this.Z.setScaleY(0.1f);
        this.Z.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, i172, false));
        this.actionBar.addView(this.Z, c8.ja.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
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

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Object obj;
        if (i7 == org.telegram.messenger.ns.p0) {
            if (objArr.length > 0 && (obj = objArr[0]) != null) {
                this.L = (byte[]) obj;
            }
            s0(null, false, false);
            E0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void finishFragment() {
        if (this.Y < 0) {
            super.finishFragment();
            return;
        }
        Bundle k10 = a8.p0.k("afterSignup", true);
        je0 je0Var = new je0();
        je0Var.r0(k10);
        presentFragment(je0Var, true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.y, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, true)) > 0.699999988079071d;
    }

    public final void o0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752575, null), new ba1(this, 1));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752576, null), null);
        String M0 = org.telegram.messenger.hd.M0(2131752571, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752577, null);
        showDialog(t1Var);
    }

    @Override // org.telegram.ui.ActionBar.e2
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.fh0 fh0Var = this.c;
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                fh0Var.setVisibility(i7);
            }
        }
        i7 = 8;
        fh0Var.setVisibility(i7);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0(null);
        E0();
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.p0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.d0);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.p0);
        this.I = true;
        org.telegram.ui.ActionBar.t1 t1Var = this.x;
        if (t1Var != null) {
            try {
                t1Var.dismiss();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.x = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.ny nyVar = this.y;
            if (nyVar != null) {
                nyVar.setProgressBarColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h6, false));
            }
            org.telegram.ui.Components.y11 y11Var = this.G;
            if (y11Var != null) {
                y11Var.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.O9, false));
            }
            ha1 ha1Var = this.Z;
            if (ha1Var != null) {
                ha1Var.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.l6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
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
        org.telegram.messenger.m10.i(this.currentAccount).u();
        this.N = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        u0(false);
        Utilities.e.c(new fy0(20, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP q0() {
        TL_account.Password password = this.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return org.telegram.messenger.nv.d(this.L, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    public final void s0(Runnable runnable, boolean z10, boolean z11) {
        if (!z11) {
            this.H = true;
            ja1 ja1Var = this.a;
            if (ja1Var != null) {
                ja1Var.f();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new fi.y5(this, z11, z10, runnable), 10);
    }

    public final void t0() {
        if (!this.K) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<ha1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.Z, (Property<ha1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.Z, (Property<ha1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.er.f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.x;
        if (t1Var == null) {
            return;
        }
        try {
            t1Var.dismiss();
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
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<ha1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<ha1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<ha1, Float>) View.SCALE_Y, 1.0f));
            animatorSet.setInterpolator(org.telegram.ui.Components.er.f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
        this.x = t1Var;
        t1Var.j0 = false;
        if (z10) {
            t1Var.r(300L);
        } else {
            t1Var.show();
        }
    }

    public final void v0(org.telegram.ui.Components.mb0 mb0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        mb0Var.a(1.0f);
        org.telegram.messenger.g0.F3(5.0f, mb0Var, new da1(this, 1));
    }

    public final void w0() {
        TL_account.Password password = this.J;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            u0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ca1(this, 1), 10);
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        if (this.J.pending_reset_date == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new ba1(this, 4));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            String M0 = org.telegram.messenger.hd.M0(2131746093, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131746072, null);
            showDialog(t1Var);
            return;
        }
        if (getConnectionsManager().getCurrentTime() <= this.J.pending_reset_date) {
            o0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746118, null), new ba1(this, 3));
        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        String M02 = org.telegram.messenger.hd.M0(2131746093, null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
        t1Var2.S = M02;
        t1Var2.U = org.telegram.messenger.hd.M0(2131746066, null);
        showDialog(t1Var2);
        TextView textView = (TextView) t1Var2.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
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
        Utilities.e.c(new fy0(19, this, h12));
    }

    public final void z0() {
        u0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new ca1(this, 0));
    }
}
