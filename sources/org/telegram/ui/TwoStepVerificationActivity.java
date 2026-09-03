package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Typeface;
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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class TwoStepVerificationActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.a20 B;
    public org.telegram.ui.Components.e31 C;
    public boolean D;
    public boolean E;
    public TL_account.Password F;
    public boolean G;
    public byte[] H;
    public long I;
    public byte[] J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public final bg1 S;
    public boolean T;
    public int U;
    public fg1 V;
    public int W;
    public String X;
    public ig1 Y;
    public final bg1 Z;
    public hg1 a;
    public org.telegram.ui.Components.rl0 b;
    public org.telegram.ui.Components.jj0 c;
    private int changePasswordRow;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.ActionBar.k5 n;
    public TextView r;
    public EditTextBoldCursor s;
    private int turnPasswordOffRow;
    public org.telegram.ui.Components.bd0 v;
    public org.telegram.ui.ActionBar.d2 w;
    public org.telegram.ui.Components.mz x;
    public ScrollView y;

    public TwoStepVerificationActivity() {
        super(null);
        this.G = true;
        this.H = new byte[0];
        this.S = new bg1(this, 1);
        this.U = -1;
        this.Z = new bg1(this, 2);
    }

    public static /* synthetic */ void U(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.F = password;
            m0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.F);
            twoStepVerificationActivity.k0();
        }
    }

    public static /* synthetic */ void V(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.F = password;
            m0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.F);
            twoStepVerificationActivity.t0();
        }
    }

    public static /* synthetic */ void W(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ag1(twoStepVerificationActivity, 5), 8);
            return;
        }
        twoStepVerificationActivity.o0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationActivity.q0(twoStepVerificationActivity.v, twoStepVerificationActivity.s, true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
        }
    }

    public static /* synthetic */ void X(TwoStepVerificationActivity twoStepVerificationActivity, boolean z4, byte[] bArr) {
        if (twoStepVerificationActivity.Y == null || !z4) {
            twoStepVerificationActivity.o0();
        }
        if (!z4) {
            org.telegram.ui.Components.z4.x0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
            return;
        }
        twoStepVerificationActivity.H = bArr;
        twoStepVerificationActivity.G = true;
        if (twoStepVerificationActivity.Y != null) {
            AndroidUtilities.hideKeyboard(twoStepVerificationActivity.s);
            twoStepVerificationActivity.Y.g(twoStepVerificationActivity.l0());
            return;
        }
        if (!TextUtils.isEmpty(twoStepVerificationActivity.F.email_unconfirmed_pattern)) {
            wg1 wg1Var = new wg1(twoStepVerificationActivity.currentAccount, 5, twoStepVerificationActivity.F);
            wg1Var.D0(twoStepVerificationActivity.H, twoStepVerificationActivity.I, twoStepVerificationActivity.J, true);
            twoStepVerificationActivity.presentFragment(wg1Var, true);
            return;
        }
        AndroidUtilities.hideKeyboard(twoStepVerificationActivity.s);
        TwoStepVerificationActivity twoStepVerificationActivity2 = new TwoStepVerificationActivity();
        twoStepVerificationActivity2.G = true;
        twoStepVerificationActivity2.H = twoStepVerificationActivity.H;
        twoStepVerificationActivity2.F = twoStepVerificationActivity.F;
        twoStepVerificationActivity2.J = twoStepVerificationActivity.J;
        twoStepVerificationActivity2.I = twoStepVerificationActivity.I;
        twoStepVerificationActivity.presentFragment(twoStepVerificationActivity2, true);
    }

    public static /* synthetic */ void Y(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationActivity.F.current_algo;
        byte[] x10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        yr0 yr0Var = new yr0(twoStepVerificationActivity, bArr, x10, 12);
        TL_account.Password password = twoStepVerificationActivity.F;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            yr0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(getpasswordsettings, yr0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        yr0Var.run(null, tL_error2);
    }

    public static /* synthetic */ void Z(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ag1(twoStepVerificationActivity, 6), 8);
            return;
        }
        twoStepVerificationActivity.o0();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            twoStepVerificationActivity.F = null;
            twoStepVerificationActivity.H = new byte[0];
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            twoStepVerificationActivity.finishFragment();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), tL_error.text);
            } else {
                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
            }
        }
    }

    public static /* synthetic */ void a0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4, boolean z10, Runnable runnable) {
        if (tL_error == null) {
            twoStepVerificationActivity.D = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.F = password;
            if (!i0(password, false)) {
                org.telegram.ui.Components.z4.x0(twoStepVerificationActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            if (!z4 || z10) {
                byte[] bArr = twoStepVerificationActivity.H;
                twoStepVerificationActivity.G = (bArr != null && bArr.length > 0) || !twoStepVerificationActivity.F.has_password;
            }
            m0(twoStepVerificationActivity.F);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.F);
        }
        if (runnable != null) {
            runnable.run();
        }
        twoStepVerificationActivity.z0();
    }

    public static /* synthetic */ void b0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.F = password;
            m0(password);
            NotificationCenter.getInstance(twoStepVerificationActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationActivity.F);
            twoStepVerificationActivity.k0();
        }
    }

    public static void c0(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        if (i10 == twoStepVerificationActivity.L || i10 == twoStepVerificationActivity.changePasswordRow) {
            wg1 wg1Var = new wg1(twoStepVerificationActivity.currentAccount, 0, twoStepVerificationActivity.F);
            wg1Var.G.add(twoStepVerificationActivity);
            wg1Var.D0(twoStepVerificationActivity.H, twoStepVerificationActivity.I, twoStepVerificationActivity.J, false);
            twoStepVerificationActivity.presentFragment(wg1Var);
            return;
        }
        if (i10 == twoStepVerificationActivity.N || i10 == twoStepVerificationActivity.O) {
            wg1 wg1Var2 = new wg1(twoStepVerificationActivity.currentAccount, 3, twoStepVerificationActivity.F);
            wg1Var2.G.add(twoStepVerificationActivity);
            wg1Var2.D0(twoStepVerificationActivity.H, twoStepVerificationActivity.I, twoStepVerificationActivity.J, true);
            twoStepVerificationActivity.presentFragment(wg1Var2);
            return;
        }
        if (i10 == twoStepVerificationActivity.turnPasswordOffRow) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity.getParentActivity());
            String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
            if (twoStepVerificationActivity.F.has_secure_values) {
                string = org.telegram.messenger.y3.h(R.string.TurnPasswordOffPassport, vh.w2.f(string, "\n\n"));
            }
            String string2 = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
            String string3 = LocaleController.getString(R.string.Disable);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.Q = string;
            d2Var.O = string2;
            alertDialog$Builder.k(string3, new zf1(twoStepVerificationActivity, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
            twoStepVerificationActivity.showDialog(d2Var2);
            TextView textView = (TextView) d2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
            }
        }
    }

    public static /* synthetic */ void d0(TwoStepVerificationActivity twoStepVerificationActivity, TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (twoStepVerificationActivity.F.current_algo == null) {
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(new TL_account.getPassword(), new ag1(twoStepVerificationActivity, 3), 8);
                return;
            }
            updatepasswordsettings.password = twoStepVerificationActivity.l0();
        }
        ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new ag1(twoStepVerificationActivity, 4), 10);
    }

    public static void e0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z4;
        byte[] computeSHA512;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            twoStepVerificationActivity.J = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z4 = false;
            if (!(securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000)) {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    computeSHA512 = Utilities.computeSHA512(bArr3, bArr, bArr3);
                }
                AndroidUtilities.runOnUIThread(new cr0(twoStepVerificationActivity, z4, bArr2, 4));
            }
            computeSHA512 = Utilities.computePBKDF2(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            twoStepVerificationActivity.I = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
            byte[] bArr6 = twoStepVerificationActivity.J;
            Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!fn0.Z0(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = twoStepVerificationActivity.l0();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(twoStepVerificationActivity.currentAccount).sendRequest(updatepasswordsettings, new nh.p5(4));
                twoStepVerificationActivity.J = null;
                twoStepVerificationActivity.I = 0L;
            }
        } else {
            twoStepVerificationActivity.J = null;
            twoStepVerificationActivity.I = 0L;
        }
        z4 = true;
        AndroidUtilities.runOnUIThread(new cr0(twoStepVerificationActivity, z4, bArr2, 4));
    }

    public static void f0(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        twoStepVerificationActivity.o0();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), tL_error.text);
                return;
            } else {
                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                twoStepVerificationActivity.w0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                return;
            }
        }
        TL_account.Password password = twoStepVerificationActivity.F;
        password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
        gg1 gg1Var = new gg1(twoStepVerificationActivity, twoStepVerificationActivity.currentAccount, password);
        gg1Var.G.add(twoStepVerificationActivity);
        gg1Var.D0(twoStepVerificationActivity.H, twoStepVerificationActivity.I, twoStepVerificationActivity.J, false);
        twoStepVerificationActivity.presentFragment(gg1Var);
    }

    public static boolean i0(TL_account.Password password, boolean z4) {
        return z4 ? !(password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) : ((password.new_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown)) ? false : true;
    }

    public static void m0(TL_account.Password password) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.new_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow = (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo;
            byte[] bArr = new byte[tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1.length + 32];
            Utilities.random.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.random.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0223  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        if (!this.G || this.Y != null) {
            this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.j6.G6;
            kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u8, false), false);
            this.actionBar.setCastShadows(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 23));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i13 = org.telegram.ui.ActionBar.j6.d6;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        ScrollView scrollView = new ScrollView(context);
        this.y = scrollView;
        final int i14 = 1;
        scrollView.setFillViewport(true);
        frameLayout.addView(this.y, k7.b6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.y.addView(linearLayout, k7.b6.x(-1, -2, 51));
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
        this.c = jj0Var;
        jj0Var.f(R.raw.tsv_setup_intro, 100, 100, null);
        this.c.d();
        org.telegram.ui.Components.jj0 jj0Var2 = this.c;
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                jj0Var2.setVisibility(i10);
                linearLayout.addView(this.c, k7.b6.q(100, 100, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                int i15 = org.telegram.ui.ActionBar.j6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                this.d.setTypeface(AndroidUtilities.bold());
                TextView i16 = ai.i(linearLayout, this.d, k7.b6.t(-2, -2, 1, 24, 8, 24, 0), context);
                this.e = i16;
                int i17 = org.telegram.ui.ActionBar.j6.D6;
                i16.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                this.e.setTextSize(1, 15.0f);
                this.e.setGravity(1);
                this.e.setVisibility(8);
                linearLayout.addView(this.e, k7.b6.t(-2, -2, 1, 42, 8, 42, 0));
                org.telegram.ui.Components.bd0 bd0Var = new org.telegram.ui.Components.bd0(context, null);
                this.v = bd0Var;
                bd0Var.setText(LocaleController.getString(R.string.EnterPassword));
                this.v.b(1.0f, 1.0f, false);
                linearLayout.addView(this.v, k7.b6.t(-1, -2, 1, 24, 24, 24, 0));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.s = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                this.s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                this.s.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
                this.s.setBackground(null);
                this.s.setSingleLine(true);
                this.s.setInputType(129);
                this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.s.setTypeface(Typeface.DEFAULT);
                EditTextBoldCursor editTextBoldCursor2 = this.s;
                int i18 = org.telegram.ui.ActionBar.j6.l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                this.s.setCursorWidth(1.5f);
                this.s.setContentDescription(LocaleController.getString(R.string.EnterPassword));
                int dp = AndroidUtilities.dp(16.0f);
                this.s.setPadding(dp, dp, dp, dp);
                this.v.addView(this.s, k7.b6.c(-2.0f, -1));
                this.v.e(this.s);
                int i19 = 12;
                this.s.setOnFocusChangeListener(new sd(this, i19));
                this.s.setOnEditorActionListener(new ja(this, i19));
                this.s.addTextChangedListener(new p0(this, 17));
                TextView textView2 = new TextView(context);
                this.f = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                this.f.setTextSize(1, 14.0f);
                this.f.setGravity((!LocaleController.isRTL ? 5 : 3) | 48);
                this.f.setText(LocaleController.getString(R.string.YourEmailInfo));
                TextView i20 = ai.i(linearLayout, this.f, k7.b6.t(-2, -2, (!LocaleController.isRTL ? 5 : 3) | 48, 40, 30, 40, 0), context);
                this.h = i20;
                i20.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                this.h.setTextSize(1, 12.0f);
                this.h.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                linearLayout.addView(this.h, k7.b6.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(80);
                linearLayout2.setClipChildren(false);
                linearLayout.addView(linearLayout2, k7.b6.l(1.0f, -1, 0));
                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                this.n = k5Var;
                k5Var.setTextSize(15);
                this.n.setGravity(19);
                this.n.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                frameLayout.addView(this.n, k7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eg1
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                this.b.r0();
                                break;
                            case 1:
                                this.b.j0();
                                break;
                            default:
                                this.b.t0();
                                break;
                        }
                    }
                });
                n7.qa.V(this.n);
                TextView textView3 = new TextView(context);
                this.r = textView3;
                textView3.setTextSize(1, 15.0f);
                this.r.setGravity(19);
                this.r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                this.r.setText(LocaleController.getString(R.string.CancelReset));
                this.r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
                this.r.setVisibility(8);
                frameLayout.addView(this.r, k7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eg1
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                this.b.r0();
                                break;
                            case 1:
                                this.b.j0();
                                break;
                            default:
                                this.b.t0();
                                break;
                        }
                    }
                });
                n7.qa.V(this.r);
                org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
                this.B = a20Var;
                n7.qa.V(a20Var);
                final int i21 = 2;
                this.B.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eg1
                    public final /* synthetic */ TwoStepVerificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                this.b.r0();
                                break;
                            case 1:
                                this.b.j0();
                                break;
                            default:
                                this.b.t0();
                                break;
                        }
                    }
                });
                org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(context);
                this.C = e31Var;
                e31Var.setTransformType(1);
                this.C.setProgress(0.0f);
                this.C.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false));
                this.C.setDrawBackground(false);
                this.B.setContentDescription(LocaleController.getString(R.string.Next));
                this.B.addView(this.C, k7.b6.e(56, 56, 17));
                this.B.a(this.C);
                frameLayout.addView(this.B, org.telegram.ui.Components.a20.b());
                org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
                this.x = mzVar;
                mzVar.b();
                frameLayout.addView(this.x, k7.b6.c(-1.0f, -1));
                org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
                this.b = rl0Var;
                rl0Var.setSections(true);
                this.b.setLayoutManager(new f2.i0(1, false));
                this.b.setEmptyView(this.x);
                this.b.setVerticalScrollBarEnabled(false);
                frameLayout.addView(this.b, k7.b6.c(-1.0f, -1));
                org.telegram.ui.Components.rl0 rl0Var2 = this.b;
                hg1 hg1Var = new hg1(this, context);
                this.a = hg1Var;
                rl0Var2.setAdapter(hg1Var);
                this.b.setOnItemClickListener(new p21(this, 11));
                fg1 fg1Var = new fg1(context, null);
                this.V = fg1Var;
                fg1Var.setSize(AndroidUtilities.dp(20.0f));
                this.V.setAlpha(0.0f);
                this.V.setScaleX(0.1f);
                this.V.setScaleY(0.1f);
                this.V.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                this.actionBar.addView(this.V, k7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
                z0();
                if (this.G || this.Y != null) {
                    this.actionBar.setTitle(null);
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.TwoStepVerificationTitle));
                }
                if (this.Y == null) {
                    this.d.setText(LocaleController.getString(R.string.YourPassword));
                    int i22 = this.W;
                    if (i22 == 1) {
                        this.e.setText(LocaleController.getString(R.string.PleaseEnterCurrentPasswordWithdraw));
                    } else if (i22 == 2) {
                        b.o(R.string.PleaseEnterCurrentPasswordGiftTransfer, new Object[]{this.X}, this.e);
                    } else {
                        this.e.setText(LocaleController.getString(R.string.PleaseEnterCurrentPasswordTransfer));
                    }
                    this.e.setVisibility(0);
                } else {
                    this.d.setText(LocaleController.getString(R.string.YourPassword));
                    this.e.setVisibility(0);
                    this.e.setText(LocaleController.getString(R.string.LoginPasswordTextShort));
                }
                if (this.G) {
                    this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                    this.fragmentView.setTag(Integer.valueOf(i13));
                } else {
                    View view = this.fragmentView;
                    int i23 = org.telegram.ui.ActionBar.j6.a7;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                    this.fragmentView.setTag(Integer.valueOf(i23));
                }
                return this.fragmentView;
            }
        }
        i10 = 8;
        jj0Var2.setVisibility(i10);
        linearLayout.addView(this.c, k7.b6.q(100, 100, 1));
        TextView textView4 = new TextView(context);
        this.d = textView4;
        int i152 = org.telegram.ui.ActionBar.j6.G6;
        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i152, false));
        this.d.setTextSize(1, 18.0f);
        this.d.setGravity(1);
        this.d.setTypeface(AndroidUtilities.bold());
        TextView i162 = ai.i(linearLayout, this.d, k7.b6.t(-2, -2, 1, 24, 8, 24, 0), context);
        this.e = i162;
        int i172 = org.telegram.ui.ActionBar.j6.D6;
        i162.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i172, false));
        this.e.setTextSize(1, 15.0f);
        this.e.setGravity(1);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, k7.b6.t(-2, -2, 1, 42, 8, 42, 0));
        org.telegram.ui.Components.bd0 bd0Var2 = new org.telegram.ui.Components.bd0(context, null);
        this.v = bd0Var2;
        bd0Var2.setText(LocaleController.getString(R.string.EnterPassword));
        this.v.b(1.0f, 1.0f, false);
        linearLayout.addView(this.v, k7.b6.t(-1, -2, 1, 24, 24, 24, 0));
        EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
        this.s = editTextBoldCursor3;
        editTextBoldCursor3.setTextSize(1, 18.0f);
        this.s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i152, false));
        this.s.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
        this.s.setBackground(null);
        this.s.setSingleLine(true);
        this.s.setInputType(129);
        this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.s.setTypeface(Typeface.DEFAULT);
        EditTextBoldCursor editTextBoldCursor22 = this.s;
        int i182 = org.telegram.ui.ActionBar.j6.l6;
        editTextBoldCursor22.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i182, false));
        this.s.setCursorWidth(1.5f);
        this.s.setContentDescription(LocaleController.getString(R.string.EnterPassword));
        int dp2 = AndroidUtilities.dp(16.0f);
        this.s.setPadding(dp2, dp2, dp2, dp2);
        this.v.addView(this.s, k7.b6.c(-2.0f, -1));
        this.v.e(this.s);
        int i192 = 12;
        this.s.setOnFocusChangeListener(new sd(this, i192));
        this.s.setOnEditorActionListener(new ja(this, i192));
        this.s.addTextChangedListener(new p0(this, 17));
        TextView textView22 = new TextView(context);
        this.f = textView22;
        textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i172, false));
        this.f.setTextSize(1, 14.0f);
        this.f.setGravity((!LocaleController.isRTL ? 5 : 3) | 48);
        this.f.setText(LocaleController.getString(R.string.YourEmailInfo));
        TextView i202 = ai.i(linearLayout, this.f, k7.b6.t(-2, -2, (!LocaleController.isRTL ? 5 : 3) | 48, 40, 30, 40, 0), context);
        this.h = i202;
        i202.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i172, false));
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        linearLayout.addView(this.h, k7.b6.k(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(1);
        linearLayout22.setGravity(80);
        linearLayout22.setClipChildren(false);
        linearLayout.addView(linearLayout22, k7.b6.l(1.0f, -1, 0));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.n = k5Var2;
        k5Var2.setTextSize(15);
        this.n.setGravity(19);
        this.n.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        frameLayout.addView(this.n, k7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eg1
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.b.r0();
                        break;
                    case 1:
                        this.b.j0();
                        break;
                    default:
                        this.b.t0();
                        break;
                }
            }
        });
        n7.qa.V(this.n);
        TextView textView32 = new TextView(context);
        this.r = textView32;
        textView32.setTextSize(1, 15.0f);
        this.r.setGravity(19);
        this.r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.r.setText(LocaleController.getString(R.string.CancelReset));
        this.r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.r.setVisibility(8);
        frameLayout.addView(this.r, k7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eg1
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.b.r0();
                        break;
                    case 1:
                        this.b.j0();
                        break;
                    default:
                        this.b.t0();
                        break;
                }
            }
        });
        n7.qa.V(this.r);
        org.telegram.ui.Components.a20 a20Var2 = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.B = a20Var2;
        n7.qa.V(a20Var2);
        final int i212 = 2;
        this.B.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eg1
            public final /* synthetic */ TwoStepVerificationActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i212) {
                    case 0:
                        this.b.r0();
                        break;
                    case 1:
                        this.b.j0();
                        break;
                    default:
                        this.b.t0();
                        break;
                }
            }
        });
        org.telegram.ui.Components.e31 e31Var2 = new org.telegram.ui.Components.e31(context);
        this.C = e31Var2;
        e31Var2.setTransformType(1);
        this.C.setProgress(0.0f);
        this.C.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false));
        this.C.setDrawBackground(false);
        this.B.setContentDescription(LocaleController.getString(R.string.Next));
        this.B.addView(this.C, k7.b6.e(56, 56, 17));
        this.B.a(this.C);
        frameLayout.addView(this.B, org.telegram.ui.Components.a20.b());
        org.telegram.ui.Components.mz mzVar2 = new org.telegram.ui.Components.mz(context, null);
        this.x = mzVar2;
        mzVar2.b();
        frameLayout.addView(this.x, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.rl0 rl0Var3 = new org.telegram.ui.Components.rl0(context, null);
        this.b = rl0Var3;
        rl0Var3.setSections(true);
        this.b.setLayoutManager(new f2.i0(1, false));
        this.b.setEmptyView(this.x);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.rl0 rl0Var22 = this.b;
        hg1 hg1Var2 = new hg1(this, context);
        this.a = hg1Var2;
        rl0Var22.setAdapter(hg1Var2);
        this.b.setOnItemClickListener(new p21(this, 11));
        fg1 fg1Var2 = new fg1(context, null);
        this.V = fg1Var2;
        fg1Var2.setSize(AndroidUtilities.dp(20.0f));
        this.V.setAlpha(0.0f);
        this.V.setScaleX(0.1f);
        this.V.setScaleY(0.1f);
        this.V.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, i182, false));
        this.actionBar.addView(this.V, k7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        z0();
        if (this.G) {
        }
        this.actionBar.setTitle(null);
        if (this.Y == null) {
        }
        if (this.G) {
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Object obj;
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.H = (byte[]) obj;
            }
            n0(false, false, null);
            z0();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void finishFragment() {
        if (this.U < 0) {
            super.finishFragment();
            return;
        }
        Bundle i10 = android.support.v4.media.a.i("afterSignup", true);
        xg0 xg0Var = new xg0();
        xg0Var.l0(i10);
        presentFragment(xg0Var, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.z9.class, org.telegram.ui.Cells.i3.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, new Class[]{org.telegram.ui.Cells.i3.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.i3.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        TextView textView = this.d;
        int i14 = org.telegram.ui.ActionBar.j6.D6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, TLObject.FLAG_23, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, true)) > 0.699999988079071d;
    }

    public final void j0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.CancelPasswordResetYes), new zf1(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.CancelPasswordResetNo), null);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.CancelReset);
        String string = LocaleController.getString(R.string.CancelPasswordReset);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.Q = string;
        showDialog(d2Var);
    }

    public final void k0() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.H;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        UserConfig.getInstance(this.currentAccount).resetSavedPassword();
        this.J = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        p0(false);
        Utilities.globalQueue.postRunnable(new b11(27, this, updatepasswordsettings));
    }

    public final TLRPC.TL_inputCheckPasswordSRP l0() {
        TL_account.Password password = this.F;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return SRPHelper.startCheck(this.H, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    public final void n0(boolean z4, boolean z10, Runnable runnable) {
        if (!z10) {
            this.D = true;
            hg1 hg1Var = this.a;
            if (hg1Var != null) {
                hg1Var.l();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new nh.z5(this, z10, z4, runnable), 10);
    }

    public final void o0() {
        if (!this.G) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.V, (Property<fg1, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.V, (Property<fg1, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.V, (Property<fg1, Float>) View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(org.telegram.ui.Components.mr.f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.w;
        if (d2Var == null) {
            return;
        }
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.w = null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (this.U < 0) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        x0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.jj0 jj0Var = this.c;
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                jj0Var.setVisibility(i10);
            }
        }
        i10 = 8;
        jj0Var.setVisibility(i10);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        s0(null);
        z0();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.Z);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        this.E = true;
        org.telegram.ui.ActionBar.d2 d2Var = this.w;
        if (d2Var != null) {
            try {
                d2Var.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.w = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (z4) {
            if (this.T) {
                r0();
                this.T = false;
            } else if (this.K) {
                u0();
                this.K = false;
            }
        }
    }

    public final void p0(boolean z4) {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.w != null) {
            return;
        }
        if (!this.G) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.V, (Property<fg1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<fg1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<fg1, Float>) View.SCALE_Y, 1.0f));
            animatorSet.setInterpolator(org.telegram.ui.Components.mr.f);
            animatorSet.start();
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
        this.w = d2Var;
        d2Var.d0 = false;
        if (z4) {
            d2Var.q(300L);
        } else {
            d2Var.show();
        }
    }

    public final void q0(org.telegram.ui.Components.bd0 bd0Var, EditTextBoldCursor editTextBoldCursor, boolean z4) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z4) {
            editTextBoldCursor.setText("");
        }
        bd0Var.a(1.0f);
        AndroidUtilities.shakeViewSpring(bd0Var, 5.0f, new bg1(this, 3));
    }

    public final void r0() {
        TL_account.Password password = this.F;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            p0(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ag1(this, 1), 10);
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        if (this.F.pending_reset_date == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new zf1(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ResetPassword);
            String string = LocaleController.getString(R.string.RestorePasswordNoEmailText2);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.Q = string;
            showDialog(d2Var);
            return;
        }
        if (getConnectionsManager().getCurrentTime() <= this.F.pending_reset_date) {
            j0();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new zf1(this, 3));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder2.a.O = LocaleController.getString(R.string.ResetPassword);
        String string2 = LocaleController.getString(R.string.RestorePasswordResetPasswordText);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
        d2Var2.Q = string2;
        showDialog(d2Var2);
        TextView textView = (TextView) d2Var2.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public final void s0(Runnable runnable) {
        byte[] bArr;
        TL_account.Password password = this.F;
        if (password == null || password.current_algo == null || (bArr = this.H) == null || bArr.length <= 0) {
            n0(true, password != null, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void t0() {
        if (this.G) {
            return;
        }
        String obj = this.s.getText().toString();
        if (obj.length() == 0) {
            q0(this.v, this.s, false);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(obj);
        p0(false);
        Utilities.globalQueue.postRunnable(new b11(26, this, stringBytes));
    }

    public final void u0() {
        p0(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new ag1(this, 0));
    }

    public final void v0(TL_account.Password password, byte[] bArr, long j10, byte[] bArr2) {
        this.F = password;
        this.H = bArr;
        this.J = bArr2;
        this.I = j10;
        this.G = (bArr != null && bArr.length > 0) || !password.has_password;
    }

    public final void w0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = str;
        d2Var.Q = str2;
        showDialog(d2Var);
    }

    public final void x0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.a.Q = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.U, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new zf1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0() {
        TextView textView;
        if (this.G) {
            return;
        }
        int i10 = this.F.pending_reset_date;
        bg1 bg1Var = this.Z;
        if (i10 != 0) {
            int currentTime = getConnectionsManager().getCurrentTime();
            int i11 = this.F.pending_reset_date;
            if (currentTime <= i11) {
                int max = Math.max(1, i11 - getConnectionsManager().getCurrentTime());
                this.h.setText(LocaleController.formatString("RestorePasswordResetIn", R.string.RestorePasswordResetIn, max > 86400 ? LocaleController.formatPluralString("Days", max / 86400, new Object[0]) : max >= 3600 ? LocaleController.formatPluralString("Hours", max / 3600, new Object[0]) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(max / 60), Integer.valueOf(max % 60))));
                this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                }
                if (this.h.getVisibility() != 0) {
                    this.h.setVisibility(0);
                }
                this.r.setVisibility(0);
                AndroidUtilities.cancelRunOnUIThread(bg1Var);
                AndroidUtilities.runOnUIThread(bg1Var, 1000L);
                if (this.F == null && this.n != null && this.h.getVisibility() == 0) {
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(bg1Var);
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
        if (this.F.pending_reset_date == 0) {
            this.n.l(LocaleController.getString(R.string.ForgotPassword), false);
            this.r.setVisibility(8);
            this.n.setVisibility(0);
        } else {
            this.n.l(LocaleController.getString(R.string.ResetPassword), false);
            this.r.setVisibility(0);
            this.n.setVisibility(0);
        }
        this.n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        AndroidUtilities.cancelRunOnUIThread(bg1Var);
        if (this.F == null) {
        }
        AndroidUtilities.cancelRunOnUIThread(bg1Var);
        textView = this.r;
        if (textView == null) {
        }
    }

    public final void z0() {
        TL_account.Password password;
        StringBuilder sb = new StringBuilder();
        sb.append(this.L);
        sb.append(this.M);
        sb.append(this.changePasswordRow);
        sb.append(this.turnPasswordOffRow);
        sb.append(this.N);
        sb.append(this.O);
        sb.append(this.P);
        sb.append(this.Q);
        this.Q = 0;
        this.L = -1;
        this.M = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        if (!this.D && (password = this.F) != null && this.G) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.Q = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.Q = 3;
                    this.O = 2;
                } else {
                    this.Q = 3;
                    this.N = 2;
                }
                int i10 = this.Q;
                this.Q = i10 + 1;
                this.P = i10;
            } else {
                this.L = 0;
                this.Q = 2;
                this.M = 1;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.L);
        sb2.append(this.M);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.N);
        sb2.append(this.O);
        sb2.append(this.P);
        sb2.append(this.Q);
        if (this.a != null && !sb.toString().equals(sb2.toString())) {
            this.a.l();
        }
        if (this.fragmentView != null) {
            if (this.D || this.G) {
                org.telegram.ui.Components.rl0 rl0Var = this.b;
                if (rl0Var != null) {
                    rl0Var.setVisibility(0);
                    this.y.setVisibility(4);
                    this.b.setEmptyView(this.x);
                }
                if (this.s != null) {
                    this.B.e(false, false);
                    this.s.setVisibility(4);
                    this.d.setVisibility(4);
                    this.f.setVisibility(8);
                    this.n.setVisibility(4);
                    y0();
                }
                View view = this.fragmentView;
                int i11 = org.telegram.ui.ActionBar.j6.a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                this.fragmentView.setTag(Integer.valueOf(i11));
                return;
            }
            org.telegram.ui.Components.rl0 rl0Var2 = this.b;
            if (rl0Var2 != null) {
                rl0Var2.setEmptyView(null);
                this.b.setVisibility(4);
                this.y.setVisibility(0);
                this.x.setVisibility(4);
            }
            if (this.s != null) {
                this.B.e(true, false);
                this.s.setVisibility(0);
                View view2 = this.fragmentView;
                int i12 = org.telegram.ui.ActionBar.j6.d6;
                view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                this.fragmentView.setTag(Integer.valueOf(i12));
                this.d.setVisibility(0);
                this.n.setVisibility(0);
                y0();
                this.f.setVisibility(8);
                if (TextUtils.isEmpty(this.F.hint)) {
                    this.s.setHint((CharSequence) null);
                } else {
                    this.s.setHint(this.F.hint);
                }
                AndroidUtilities.runOnUIThread(new bg1(this, 0), 200L);
            }
        }
    }
}
