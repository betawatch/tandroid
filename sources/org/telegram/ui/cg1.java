package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
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
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class cg1 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.ActionBar.m0 A;
    public boolean B;
    public int C;
    public boolean D;
    public AnimatorSet E;
    public final ArrayList F;
    public AnimatorSet G;
    public RadialProgressView H;
    public boolean I;
    public boolean J;
    public final int K;
    public String L;
    public String M;
    public String N;
    public boolean O;
    public boolean P;
    public TL_account.Password Q;
    public byte[] R;
    public long S;
    public byte[] T;
    public boolean U;
    public boolean V;
    public String W;
    public oc.i X;
    public org.telegram.ui.Components.u10 Y;
    public org.telegram.ui.Components.u21 Z;
    public org.telegram.ui.Components.aj0 a;
    public org.telegram.ui.Components.or a0;
    public TextView b;
    public org.telegram.ui.Components.xi0[] b0;
    public TextView c;
    public uf1 c0;
    public gh.s d;
    public final Runnable d0;
    public TextView e;
    public final Runnable e0;
    public TextView f;
    public hb0 f0;
    public TextView h;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public org.telegram.ui.Components.uc0 s;
    public org.telegram.ui.Components.uc0 v;
    public md0 w;
    public bg1 x;
    public cg.i0 y;

    public cg1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.B = false;
        this.C = -1;
        this.F = new ArrayList();
        this.R = new byte[0];
        this.d0 = new uf1(this, 2);
        this.e0 = new uf1(this, 3);
        this.currentAccount = i10;
        this.K = i11;
        this.Q = password;
        this.P = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.Q == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new vf1(this, 0), 10);
            }
        }
    }

    public static void U(cg1 cg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = cg1Var.Q;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.startCheck(cg1Var.R, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z10 || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = cg1Var.Q.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
                bArr2 = stringBytes;
            } else {
                bArr2 = stringBytes;
                bArr = null;
            }
        }
        hh.g gVar = new hh.g(cg1Var, bArr, str, passwordinputsettings, z10, 4);
        if (z10) {
            ConnectionsManager.getInstance(cg1Var.currentAccount).sendRequest(tLObject, gVar, 10);
            return;
        }
        if (str != null && (bArr3 = cg1Var.T) != null && bArr3.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = cg1Var.Q.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr4 = new byte[32];
                System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                byte[] bArr5 = new byte[16];
                System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(cg1Var.T, 0, bArr6, 0, 32);
                Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr6;
                tL_secureSecretSettings.secure_secret_id = cg1Var.S;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = cg1Var.Q.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            gVar.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] vBytes = SRPHelper.getVBytes(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = vBytes;
            if (vBytes == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                gVar.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(cg1Var.currentAccount).sendRequest(tLObject, gVar, 10);
    }

    public static void V(cg1 cg1Var) {
        ConnectionsManager.getInstance(cg1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new lh.o5(5));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        cg1Var.showDialog(alertDialog$Builder.a);
    }

    public static void W(cg1 cg1Var, byte[] bArr) {
        ArrayList arrayList = cg1Var.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = cg1Var.Q;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = cg1Var.Q;
        if (bArr == null) {
            bArr = cg1Var.R;
        }
        twoStepVerificationActivity.v0(password2, bArr, cg1Var.S, cg1Var.T);
        twoStepVerificationActivity.T = cg1Var.C;
        cg1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, cg1Var.Q);
        hb0 hb0Var = cg1Var.f0;
        if (hb0Var != null) {
            AndroidUtilities.runOnUIThread(hb0Var);
            cg1Var.f0 = null;
        }
    }

    public static void X(cg1 cg1Var) {
        ArrayList arrayList = cg1Var.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(cg1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = cg1Var.R;
        TL_account.Password password = cg1Var.Q;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, cg1Var.N, cg1Var.M, null, cg1Var.L);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = cg1Var.Q;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, cg1Var.R, cg1Var.S, cg1Var.T);
        twoStepVerificationActivity.T = cg1Var.C;
        cg1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, cg1Var.Q);
        hb0 hb0Var = cg1Var.f0;
        if (hb0Var != null) {
            AndroidUtilities.runOnUIThread(hb0Var);
            cg1Var.f0 = null;
        }
    }

    public static /* synthetic */ void Y(cg1 cg1Var, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = cg1Var.Q.current_algo;
        byte[] x4 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        qe1 qe1Var = new qe1(2, cg1Var, x4);
        TL_account.Password password = cg1Var.Q;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            qe1Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x4, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(cg1Var.currentAccount).sendRequest(getpasswordsettings, qe1Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        qe1Var.run(null, tL_error2);
    }

    public static void Z(cg1 cg1Var, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(cg1Var.currentAccount).sendRequest(new TL_account.getPassword(), new vf1(cg1Var, 4), 8);
            return;
        }
        cg1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            cg1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            cg1Var.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
            cg1Var.z0(cg1Var.s, cg1Var.n, true);
            cg1Var.H0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            cg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            cg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
        }
    }

    public static /* synthetic */ void a0(cg1 cg1Var) {
        ArrayList arrayList = cg1Var.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        cg1Var.finishFragment();
    }

    public static /* synthetic */ void b0(cg1 cg1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            cg1Var.Q = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.c5.x0(cg1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            cg1Var.P = !TextUtils.isEmpty(cg1Var.Q.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(cg1Var.Q);
            if (!cg1Var.O && cg1Var.U) {
                TL_account.Password password2 = cg1Var.Q;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!cg1Var.P && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        cg1Var.finishFragment();
                    }
                }
            }
            if (cg1Var.J) {
                cg1Var.w0();
                cg1Var.C0();
            }
            NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, cg1Var.Q);
        }
    }

    public static /* synthetic */ void c0(cg1 cg1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            cg1Var.Q = password;
            TwoStepVerificationActivity.m0(password);
            cg1Var.E0(z10);
            NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, cg1Var.Q);
        }
    }

    public static void d0(cg1 cg1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        ArrayList arrayList = cg1Var.F;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(cg1Var.currentAccount).sendRequest(new TL_account.getPassword(), new nh.l3(12, cg1Var, z10), 8);
            return;
        }
        cg1Var.w0();
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        cg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        cg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        cg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        return;
                    }
                }
                NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(cg1Var.currentAccount);
                int i11 = NotificationCenter.twoStepPasswordChanged;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                TL_account.Password password2 = cg1Var.Q;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                byte[] bArr2 = password2.secure_random;
                String str2 = cg1Var.N;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, cg1Var.M, str2, cg1Var.L);
                TL_account.Password password3 = cg1Var.Q;
                password3.email_unconfirmed_pattern = cg1Var.N;
                cg1 cg1Var2 = new cg1(5, password3);
                cg1Var2.D = cg1Var.D;
                cg1Var2.D0(bArr != null ? bArr : cg1Var.R, cg1Var.S, cg1Var.T, cg1Var.V);
                cg1Var2.U = cg1Var.U;
                cg1Var2.C = cg1Var.C;
                cg1Var.presentFragment(cg1Var2, true);
                return;
            }
            return;
        }
        cg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        if (z10) {
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((org.telegram.ui.ActionBar.o2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            cg1Var.finishFragment();
            return;
        }
        if (cg1Var.getParentActivity() == null) {
            return;
        }
        if (cg1Var.Q.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new kl0(27, cg1Var, bArr));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            if (str == null && (password = cg1Var.Q) != null && password.has_password) {
                c2Var.P = LocaleController.getString(R.string.YourEmailSuccessText);
            } else {
                c2Var.P = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
            }
            c2Var.N = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = cg1Var.showDialog(c2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i13)).removeSelfFromStack();
        }
        TL_account.Password password4 = cg1Var.Q;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (cg1Var.U) {
            NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        }
        cg1 cg1Var3 = new cg1(7, cg1Var.Q);
        cg1Var3.D = cg1Var.D;
        cg1Var3.D0(bArr != null ? bArr : cg1Var.R, cg1Var.S, cg1Var.T, cg1Var.V);
        cg1Var3.U = cg1Var.U;
        cg1Var3.C = cg1Var.C;
        cg1Var.presentFragment(cg1Var3, true);
        NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, cg1Var.Q);
    }

    public static void e0(cg1 cg1Var, TLRPC.TL_error tL_error) {
        cg1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = cg1Var.Q;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, cg1Var.R, cg1Var.S, cg1Var.T);
            twoStepVerificationActivity.T = cg1Var.C;
            cg1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            hb0 hb0Var = cg1Var.f0;
            if (hb0Var != null) {
                AndroidUtilities.runOnUIThread(hb0Var);
                cg1Var.f0 = null;
            }
        }
    }

    public static void f0(cg1 cg1Var) {
        ArrayList arrayList = cg1Var.F;
        int i10 = 4;
        if (cg1Var.Q.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new tf1(cg1Var, i10));
            boolean z10 = cg1Var.Q.has_recovery;
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            if (z10) {
                c2Var.P = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                c2Var.P = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            c2Var.N = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = cg1Var.showDialog(c2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i11)).removeSelfFromStack();
        }
        TL_account.Password password = cg1Var.Q;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        cg1 cg1Var2 = new cg1(7, password);
        cg1Var2.D = cg1Var.D;
        cg1Var2.D0(cg1Var.R, cg1Var.S, cg1Var.T, cg1Var.V);
        cg1Var2.F.addAll(arrayList);
        cg1Var2.U = cg1Var.U;
        cg1Var2.C = cg1Var.C;
        cg1Var.presentFragment(cg1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(cg1Var.currentAccount);
        int i12 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = cg1Var.R;
        TL_account.Password password2 = cg1Var.Q;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, cg1Var.N, cg1Var.M, null, cg1Var.L);
        NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, cg1Var.Q);
    }

    public static void g0(cg1 cg1Var, String str) {
        cg1 cg1Var2 = new cg1(cg1Var.currentAccount, 0, cg1Var.Q);
        cg1Var2.D = cg1Var.D;
        cg1Var2.F.addAll(cg1Var.F);
        cg1Var2.F.add(cg1Var);
        cg1Var2.W = str;
        cg1Var2.C = cg1Var.C;
        cg1Var.presentFragment(cg1Var2, true);
    }

    public static /* synthetic */ void h0(cg1 cg1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            cg1Var.Q = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(cg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, cg1Var.Q);
            cg1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.Q;
        if (password.has_recovery) {
            this.N = "";
            E0(false);
            return;
        }
        cg1 cg1Var = new cg1(this.currentAccount, 3, password);
        cg1Var.D = this.D;
        cg1Var.D0(this.R, this.S, this.T, this.V);
        cg1Var.L = this.L;
        cg1Var.M = this.M;
        cg1Var.F.addAll(this.F);
        cg1Var.F.add(this);
        cg1Var.U = this.U;
        cg1Var.C = this.C;
        presentFragment(cg1Var);
    }

    public final void C0() {
        if (getParentActivity() == null) {
            return;
        }
        switch (this.K) {
            case 0:
            case 1:
                if (this.n.length() == 0) {
                    z0(this.s, this.n, false);
                    break;
                } else if (this.n.getText().toString().equals(this.L) || this.K != 1) {
                    cg1 cg1Var = new cg1(this.currentAccount, this.K != 0 ? 2 : 1, this.Q);
                    cg1Var.D = this.D;
                    cg1Var.L = this.n.getText().toString();
                    cg1Var.D0(this.R, this.S, this.T, this.V);
                    cg1Var.W = this.W;
                    cg1Var.F.addAll(this.F);
                    cg1Var.F.add(this);
                    cg1Var.U = this.U;
                    cg1Var.C = this.C;
                    presentFragment(cg1Var);
                    break;
                } else {
                    AndroidUtilities.shakeViewSpring(this.s, 5.0f);
                    try {
                        this.s.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
            case 2:
                String obj = this.n.getText().toString();
                this.M = obj;
                if (!obj.equalsIgnoreCase(this.L)) {
                    A0();
                    break;
                } else {
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    z0(this.s, this.n, false);
                    break;
                }
            case 3:
                if (!this.V && this.h.getAlpha() < 1.0f) {
                    this.h.animate().cancel();
                    this.h.animate().alpha(1.0f).start();
                }
                String obj2 = this.n.getText().toString();
                this.N = obj2;
                if (obj2 != null && obj2.length() >= 3) {
                    int lastIndexOf = obj2.lastIndexOf(46);
                    int lastIndexOf2 = obj2.lastIndexOf(64);
                    if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                        E0(false);
                        break;
                    }
                }
                z0(this.s, this.n, false);
                break;
            case 4:
                String code = this.w.getCode();
                TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                tL_auth_checkRecoveryPassword.code = code;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new qe1(1, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.w.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new vf1(this, 2), 10);
                x0();
                break;
            case 6:
                TL_account.Password password = this.Q;
                if (password != null) {
                    cg1 cg1Var2 = new cg1(this.currentAccount, 0, password);
                    cg1Var2.D = this.D;
                    cg1Var2.U = this.U;
                    cg1Var2.C = this.C;
                    presentFragment(cg1Var2, true);
                    break;
                } else {
                    x0();
                    this.J = true;
                    break;
                }
            case 7:
                if (!this.U) {
                    if (!this.D) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.v0(this.Q, this.R, this.S, this.T);
                        twoStepVerificationActivity.T = this.C;
                        presentFragment(twoStepVerificationActivity, true);
                        hb0 hb0Var = this.f0;
                        if (hb0Var != null) {
                            AndroidUtilities.runOnUIThread(hb0Var);
                            this.f0 = null;
                            break;
                        }
                    } else {
                        Bundle i10 = a4.w.i("afterSignup", true);
                        ng0 ng0Var = new ng0();
                        ng0Var.l0(i10);
                        presentFragment(ng0Var, true);
                        break;
                    }
                } else {
                    finishFragment();
                    break;
                }
                break;
            case 8:
                if (this.Q != null) {
                    String obj3 = this.n.getText().toString();
                    if (obj3.length() != 0) {
                        byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                        x0();
                        Utilities.globalQueue.postRunnable(new wf1(this, stringBytes, 0));
                        break;
                    } else {
                        z0(this.s, this.n, false);
                        break;
                    }
                } else {
                    x0();
                    this.J = true;
                    break;
                }
            case 9:
                finishFragment();
                break;
        }
    }

    public final void D0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.R = bArr;
        this.T = bArr2;
        this.S = j10;
        this.V = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.P && this.Q.has_password) {
            x0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new vf1(this, 3));
            return;
        }
        String str = this.L;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
            this.T = null;
            if (this.P) {
                passwordinputsettings.flags = 2;
                passwordinputsettings.email = "";
            } else {
                passwordinputsettings.flags = 3;
                passwordinputsettings.hint = "";
                passwordinputsettings.new_password_hash = new byte[0];
                passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
                passwordinputsettings.email = "";
            }
        } else {
            if (this.M == null && (password = this.Q) != null) {
                this.M = password.hint;
            }
            if (this.M == null) {
                this.M = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.M;
                passwordinputsettings.new_algo = this.Q.new_algo;
            }
            if (this.N.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.N.trim();
            }
        }
        if (this.W != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.W;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.R;
            if (bArr == null || bArr.length == 0 || (z10 && this.P)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        x0();
        Utilities.globalQueue.postRunnable(new eg.j(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.h0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(boolean z10) {
        if (this.K != 0) {
            return;
        }
        uf1 uf1Var = this.c0;
        if (uf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(uf1Var);
        }
        org.telegram.ui.Components.xi0 animatedDrawable = this.a.getAnimatedDrawable();
        if (!z10) {
            org.telegram.ui.Components.xi0[] xi0VarArr = this.b0;
            if (animatedDrawable != xi0VarArr[0]) {
                if (animatedDrawable != xi0VarArr[1]) {
                    if (this.n.length() == 0) {
                        if (animatedDrawable != null) {
                        }
                    }
                    uf1 uf1Var2 = new uf1(this, 4);
                    this.c0 = uf1Var2;
                    AndroidUtilities.runOnUIThread(uf1Var2, Utilities.random.nextInt(2000) + 5000);
                }
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            this.a.setAnimation(this.b0[0]);
            this.b0[0].Q(0.0f, true);
        } else {
            this.a.setAnimation(this.b0[1]);
            this.b0[1].Q(0.0f, true);
        }
        if (!z10) {
            this.a.d();
        }
        uf1 uf1Var22 = new uf1(this, 4);
        this.c0 = uf1Var22;
        AndroidUtilities.runOnUIThread(uf1Var22, Utilities.random.nextInt(2000) + 5000);
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = str;
        c2Var.P = str2;
        showDialog(c2Var);
    }

    public final void H0(boolean z10) {
        if (z10 == (this.b.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b.setTag(z10 ? 1 : null);
        this.E = new AnimatorSet();
        if (z10) {
            this.b.setVisibility(0);
            AnimatorSet animatorSet2 = this.E;
            TextView textView = this.e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.9f);
            TextView textView2 = this.e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.9f);
            TextView textView3 = this.e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.b, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<TextView, Float>) property3, 1.0f));
        } else {
            this.e.setVisibility(0);
            AnimatorSet animatorSet3 = this.E;
            TextView textView4 = this.b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property4, 0.9f);
            TextView textView5 = this.b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, 0.9f);
            TextView textView6 = this.b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.e, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.e, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.e, (Property<TextView, Float>) property6, 1.0f));
        }
        this.E.addListener(new p60(11, this, z10));
        this.E.setDuration(150L);
        this.E.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.a.P = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.C, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new tf1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v72 */
    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i10;
        ?? r82;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        lVar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ag1(this));
        final int i13 = 1;
        int i14 = this.K;
        if (i14 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
        this.Y = u10Var;
        this.X = new oc.i(u10Var);
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qf1
            public final /* synthetic */ cg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        cg1 cg1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new tf1(cg1Var, 1));
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.P = string;
                        cg1Var.showDialog(c2Var);
                        break;
                    case 2:
                        cg1.V(this.b);
                        break;
                    case 3:
                        cg1 cg1Var2 = this.b;
                        if (cg1Var2.h.getAlpha() >= 0.5f) {
                            int i15 = cg1Var2.K;
                            if (i15 != 0) {
                                if (i15 != 3) {
                                    if (i15 == 2) {
                                        cg1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cg1Var2.getParentActivity());
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new tf1(cg1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                    cg1Var2.showDialog(c2Var2);
                                    TextView textView = (TextView) c2Var2.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                cg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = cg1Var2.W;
                                cg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new vf1(cg1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        cg1 cg1Var3 = this.b;
                        if (cg1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = cg1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = cg1Var3.C;
                            cg1Var3.presentFragment(twoStepVerificationActivity, true);
                            hb0 hb0Var = cg1Var3.f0;
                            if (hb0Var != null) {
                                AndroidUtilities.runOnUIThread(hb0Var);
                                cg1Var3.f0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        cg1 cg1Var4 = this.b;
                        int i16 = cg1Var4.K;
                        cg1Var4.I = true;
                        if (cg1Var4.n.getTransformationMethod() == null) {
                            cg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                cg1Var4.b0[3].N(-1);
                                org.telegram.ui.Components.xi0 animatedDrawable = cg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var = cg1Var4.b0[3];
                                if (animatedDrawable != xi0Var) {
                                    cg1Var4.a.setAnimation(xi0Var);
                                    cg1Var4.b0[3].L(18, false, false);
                                }
                                cg1Var4.a.d();
                            }
                        } else {
                            cg1Var4.n.setTransformationMethod(null);
                            cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                cg1Var4.b0[3].N(18);
                                org.telegram.ui.Components.xi0 animatedDrawable2 = cg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var2 = cg1Var4.b0[3];
                                if (animatedDrawable2 != xi0Var2) {
                                    cg1Var4.a.setAnimation(xi0Var2);
                                }
                                cg1Var4.b0[3].Q(0.0f, false);
                                cg1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = cg1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        cg1Var4.I = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.u21 u21Var = new org.telegram.ui.Components.u21(context);
        this.Z = u21Var;
        u21Var.setTransformType(1);
        this.Z.setProgress(0.0f);
        this.Z.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
        this.Z.setDrawBackground(false);
        this.Y.setContentDescription(LocaleController.getString(R.string.Next));
        int i15 = 17;
        this.Y.addView(this.Z, i7.f6.e(56, 56, 17));
        this.Y.a(this.Z);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        oc.i.K1(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        final int i16 = 3;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qf1
            public final /* synthetic */ cg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        cg1 cg1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new tf1(cg1Var, 1));
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.P = string;
                        cg1Var.showDialog(c2Var);
                        break;
                    case 2:
                        cg1.V(this.b);
                        break;
                    case 3:
                        cg1 cg1Var2 = this.b;
                        if (cg1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = cg1Var2.K;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        cg1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cg1Var2.getParentActivity());
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new tf1(cg1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                    cg1Var2.showDialog(c2Var2);
                                    TextView textView2 = (TextView) c2Var2.d(-1);
                                    if (textView2 != null) {
                                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                cg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = cg1Var2.W;
                                cg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new vf1(cg1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        cg1 cg1Var3 = this.b;
                        if (cg1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = cg1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = cg1Var3.C;
                            cg1Var3.presentFragment(twoStepVerificationActivity, true);
                            hb0 hb0Var = cg1Var3.f0;
                            if (hb0Var != null) {
                                AndroidUtilities.runOnUIThread(hb0Var);
                                cg1Var3.f0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        cg1 cg1Var4 = this.b;
                        int i162 = cg1Var4.K;
                        cg1Var4.I = true;
                        if (cg1Var4.n.getTransformationMethod() == null) {
                            cg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                cg1Var4.b0[3].N(-1);
                                org.telegram.ui.Components.xi0 animatedDrawable = cg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var = cg1Var4.b0[3];
                                if (animatedDrawable != xi0Var) {
                                    cg1Var4.a.setAnimation(xi0Var);
                                    cg1Var4.b0[3].L(18, false, false);
                                }
                                cg1Var4.a.d();
                            }
                        } else {
                            cg1Var4.n.setTransformationMethod(null);
                            cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                cg1Var4.b0[3].N(18);
                                org.telegram.ui.Components.xi0 animatedDrawable2 = cg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var2 = cg1Var4.b0[3];
                                if (animatedDrawable2 != xi0Var2) {
                                    cg1Var4.a.setAnimation(xi0Var2);
                                }
                                cg1Var4.b0[3].Q(0.0f, false);
                                cg1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = cg1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        cg1Var4.I = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        this.a = aj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        aj0Var.setScaleType(scaleType);
        if (i14 == 2 && AndroidUtilities.isSmallScreen()) {
            this.a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.aj0 aj0Var2 = this.a;
            Point point = AndroidUtilities.displaySize;
            aj0Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.c.setGravity(1);
        this.c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        gh.s sVar = new gh.s(context);
        this.d = sVar;
        int i17 = org.telegram.ui.ActionBar.g6.D6;
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setVisibility(8);
        final int i18 = 4;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qf1
            public final /* synthetic */ cg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        cg1 cg1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new tf1(cg1Var, 1));
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.P = string;
                        cg1Var.showDialog(c2Var);
                        break;
                    case 2:
                        cg1.V(this.b);
                        break;
                    case 3:
                        cg1 cg1Var2 = this.b;
                        if (cg1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = cg1Var2.K;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        cg1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cg1Var2.getParentActivity());
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new tf1(cg1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                    cg1Var2.showDialog(c2Var2);
                                    TextView textView22 = (TextView) c2Var2.d(-1);
                                    if (textView22 != null) {
                                        textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                cg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = cg1Var2.W;
                                cg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new vf1(cg1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        cg1 cg1Var3 = this.b;
                        if (cg1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = cg1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = cg1Var3.C;
                            cg1Var3.presentFragment(twoStepVerificationActivity, true);
                            hb0 hb0Var = cg1Var3.f0;
                            if (hb0Var != null) {
                                AndroidUtilities.runOnUIThread(hb0Var);
                                cg1Var3.f0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        cg1 cg1Var4 = this.b;
                        int i162 = cg1Var4.K;
                        cg1Var4.I = true;
                        if (cg1Var4.n.getTransformationMethod() == null) {
                            cg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                cg1Var4.b0[3].N(-1);
                                org.telegram.ui.Components.xi0 animatedDrawable = cg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var = cg1Var4.b0[3];
                                if (animatedDrawable != xi0Var) {
                                    cg1Var4.a.setAnimation(xi0Var);
                                    cg1Var4.b0[3].L(18, false, false);
                                }
                                cg1Var4.a.d();
                            }
                        } else {
                            cg1Var4.n.setTransformationMethod(null);
                            cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                cg1Var4.b0[3].N(18);
                                org.telegram.ui.Components.xi0 animatedDrawable2 = cg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var2 = cg1Var4.b0[3];
                                if (animatedDrawable2 != xi0Var2) {
                                    cg1Var4.a.setAnimation(xi0Var2);
                                }
                                cg1Var4.b0[3].Q(0.0f, false);
                                cg1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = cg1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        cg1Var4.I = false;
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.b.setGravity(17);
        this.b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(AndroidUtilities.bold());
        this.b.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.g6.Oh));
        final int i19 = 5;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qf1
            public final /* synthetic */ cg1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        cg1 cg1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new tf1(cg1Var, 1));
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.P = string;
                        cg1Var.showDialog(c2Var);
                        break;
                    case 2:
                        cg1.V(this.b);
                        break;
                    case 3:
                        cg1 cg1Var2 = this.b;
                        if (cg1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = cg1Var2.K;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        cg1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cg1Var2.getParentActivity());
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new tf1(cg1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                    cg1Var2.showDialog(c2Var2);
                                    TextView textView22 = (TextView) c2Var2.d(-1);
                                    if (textView22 != null) {
                                        textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                cg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = cg1Var2.W;
                                cg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new vf1(cg1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        cg1 cg1Var3 = this.b;
                        if (cg1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = cg1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = cg1Var3.C;
                            cg1Var3.presentFragment(twoStepVerificationActivity, true);
                            hb0 hb0Var = cg1Var3.f0;
                            if (hb0Var != null) {
                                AndroidUtilities.runOnUIThread(hb0Var);
                                cg1Var3.f0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        cg1 cg1Var4 = this.b;
                        int i162 = cg1Var4.K;
                        cg1Var4.I = true;
                        if (cg1Var4.n.getTransformationMethod() == null) {
                            cg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                cg1Var4.b0[3].N(-1);
                                org.telegram.ui.Components.xi0 animatedDrawable = cg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var = cg1Var4.b0[3];
                                if (animatedDrawable != xi0Var) {
                                    cg1Var4.a.setAnimation(xi0Var);
                                    cg1Var4.b0[3].L(18, false, false);
                                }
                                cg1Var4.a.d();
                            }
                        } else {
                            cg1Var4.n.setTransformationMethod(null);
                            cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                cg1Var4.b0[3].N(18);
                                org.telegram.ui.Components.xi0 animatedDrawable2 = cg1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.xi0 xi0Var2 = cg1Var4.b0[3];
                                if (animatedDrawable2 != xi0Var2) {
                                    cg1Var4.a.setAnimation(xi0Var2);
                                }
                                cg1Var4.b0[3].Q(0.0f, false);
                                cg1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = cg1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        cg1Var4.I = false;
                        break;
                }
            }
        });
        if (i14 == 6 || i14 == 7 || i14 == 9) {
            this.c.setTypeface(Typeface.DEFAULT);
            this.c.setTextSize(1, 24.0f);
        } else {
            this.c.setTypeface(AndroidUtilities.bold());
            this.c.setTextSize(1, 18.0f);
        }
        switch (i14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                n0 n0Var = new n0(this, context, 26);
                org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(this, context, n0Var, 2);
                s90Var.addView(n0Var);
                o9 o9Var = new o9(this, context, s90Var);
                bg1 bg1Var = new bg1(this, context);
                this.x = bg1Var;
                bg1Var.setVerticalScrollBarEnabled(false);
                n0Var.addView(this.x, i7.f6.c(-1.0f, -1));
                n0Var.addView(this.h, i7.f6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                n0Var.addView(this.Y, org.telegram.ui.Components.u10.b());
                o9Var.addView(s90Var, i7.f6.c(-1.0f, -1));
                ua1 ua1Var = new ua1(this, context, i15);
                ua1Var.setOrientation(1);
                this.x.addView(ua1Var, i7.f6.x(-1, -1, 51));
                ua1Var.addView(this.a, i7.f6.t(-2, -2, 49, 0, 69, 0, 0));
                ua1Var.addView(this.c, i7.f6.t(-2, -2, 49, 0, 8, 0, 0));
                ua1Var.addView(this.d, i7.f6.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(context, null);
                this.s = uc0Var;
                uc0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i20 = org.telegram.ui.ActionBar.g6.l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
                this.n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.rf1
                    public final /* synthetic */ cg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i21, KeyEvent keyEvent) {
                        switch (i13) {
                            case 0:
                                cg1 cg1Var = this.b;
                                cg1Var.getClass();
                                if (i21 != 5 && i21 != 6) {
                                    return false;
                                }
                                cg1Var.C0();
                                return true;
                            default:
                                cg1 cg1Var2 = this.b;
                                cg1Var2.getClass();
                                if (i21 != 5 && i21 != 6) {
                                    return false;
                                }
                                if (cg1Var2.v.getVisibility() == 0) {
                                    cg1Var2.r.requestFocus();
                                } else {
                                    cg1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.s.e(this.n);
                final int i21 = 2;
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.sf1
                    public final /* synthetic */ cg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.Components.uc0 uc0Var2 = this.b.v;
                                float f9 = z10 ? 1.0f : 0.0f;
                                uc0Var2.b(f9, f9, true);
                                break;
                            case 1:
                                cg1 cg1Var = this.b;
                                if (!z10) {
                                    cg1Var.getClass();
                                    break;
                                } else {
                                    cg1Var.a0.setEditText((EditText) view);
                                    cg1Var.a0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.uc0 uc0Var3 = this.b.s;
                                float f10 = z10 ? 1.0f : 0.0f;
                                uc0Var3.b(f10, f10, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, i7.f6.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.m0 m0Var = new org.telegram.ui.ActionBar.m0(this, context, 3);
                this.A = m0Var;
                m0Var.setImageResource(R.drawable.msg_message);
                this.A.setScaleType(scaleType);
                this.A.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.A.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 1, -1));
                this.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.A, false, 0.1f, false);
                final int i22 = 6;
                this.A.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qf1
                    public final /* synthetic */ cg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                this.b.C0();
                                break;
                            case 1:
                                cg1 cg1Var = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new tf1(cg1Var, 1));
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.P = string;
                                cg1Var.showDialog(c2Var);
                                break;
                            case 2:
                                cg1.V(this.b);
                                break;
                            case 3:
                                cg1 cg1Var2 = this.b;
                                if (cg1Var2.h.getAlpha() >= 0.5f) {
                                    int i152 = cg1Var2.K;
                                    if (i152 != 0) {
                                        if (i152 != 3) {
                                            if (i152 == 2) {
                                                cg1Var2.A0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cg1Var2.getParentActivity());
                                            alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new tf1(cg1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                            cg1Var2.showDialog(c2Var2);
                                            TextView textView22 = (TextView) c2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                                break;
                                            }
                                        }
                                    } else {
                                        cg1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = cg1Var2.W;
                                        cg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new vf1(cg1Var2, 1));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                cg1 cg1Var3 = this.b;
                                if (cg1Var3.K == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.S = true;
                                    twoStepVerificationActivity.E = cg1Var3.Q;
                                    twoStepVerificationActivity.F = false;
                                    twoStepVerificationActivity.T = cg1Var3.C;
                                    cg1Var3.presentFragment(twoStepVerificationActivity, true);
                                    hb0 hb0Var = cg1Var3.f0;
                                    if (hb0Var != null) {
                                        AndroidUtilities.runOnUIThread(hb0Var);
                                        cg1Var3.f0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.b.C0();
                                break;
                            default:
                                cg1 cg1Var4 = this.b;
                                int i162 = cg1Var4.K;
                                cg1Var4.I = true;
                                if (cg1Var4.n.getTransformationMethod() == null) {
                                    cg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                        cg1Var4.b0[3].N(-1);
                                        org.telegram.ui.Components.xi0 animatedDrawable = cg1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xi0 xi0Var = cg1Var4.b0[3];
                                        if (animatedDrawable != xi0Var) {
                                            cg1Var4.a.setAnimation(xi0Var);
                                            cg1Var4.b0[3].L(18, false, false);
                                        }
                                        cg1Var4.a.d();
                                    }
                                } else {
                                    cg1Var4.n.setTransformationMethod(null);
                                    cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                        cg1Var4.b0[3].N(18);
                                        org.telegram.ui.Components.xi0 animatedDrawable2 = cg1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xi0 xi0Var2 = cg1Var4.b0[3];
                                        if (animatedDrawable2 != xi0Var2) {
                                            cg1Var4.a.setAnimation(xi0Var2);
                                        }
                                        cg1Var4.b0[3].Q(0.0f, false);
                                        cg1Var4.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = cg1Var4.n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                cg1Var4.I = false;
                                break;
                        }
                    }
                });
                linearLayout.addView(this.A, i7.f6.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new zf1(this, 2));
                this.s.addView(linearLayout, i7.f6.c(-2.0f, -1));
                ua1Var.addView(this.s, i7.f6.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.uc0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.r.setPadding(dp2, dp2, dp2, dp2);
                this.r.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
                this.r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                final int i23 = 0;
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.rf1
                    public final /* synthetic */ cg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i212, KeyEvent keyEvent) {
                        switch (i23) {
                            case 0:
                                cg1 cg1Var = this.b;
                                cg1Var.getClass();
                                if (i212 != 5 && i212 != 6) {
                                    return false;
                                }
                                cg1Var.C0();
                                return true;
                            default:
                                cg1 cg1Var2 = this.b;
                                cg1Var2.getClass();
                                if (i212 != 5 && i212 != 6) {
                                    return false;
                                }
                                if (cg1Var2.v.getVisibility() == 0) {
                                    cg1Var2.r.requestFocus();
                                } else {
                                    cg1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.sf1
                    public final /* synthetic */ cg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i23) {
                            case 0:
                                org.telegram.ui.Components.uc0 uc0Var2 = this.b.v;
                                float f9 = z10 ? 1.0f : 0.0f;
                                uc0Var2.b(f9, f9, true);
                                break;
                            case 1:
                                cg1 cg1Var = this.b;
                                if (!z10) {
                                    cg1Var.getClass();
                                    break;
                                } else {
                                    cg1Var.a0.setEditText((EditText) view);
                                    cg1Var.a0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.uc0 uc0Var3 = this.b.s;
                                float f10 = z10 ? 1.0f : 0.0f;
                                uc0Var3.b(f10, f10, true);
                                break;
                        }
                    }
                });
                this.v.addView(this.r, i7.f6.c(-2.0f, -1));
                ua1Var.addView(this.v, i7.f6.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(context);
                this.a0 = orVar;
                orVar.setVisibility(8);
                s90Var.addView(this.a0);
                md0 md0Var = new md0(this, context, 3);
                this.w = md0Var;
                final int i24 = 1;
                md0Var.b(6, 1);
                ur[] urVarArr = this.w.f;
                int length = urVarArr.length;
                int i25 = 0;
                while (i25 < length) {
                    ur urVar = urVarArr[i25];
                    urVar.setShowSoftInputOnFocusCompat((v0() ? 1 : 0) ^ i24);
                    urVar.addTextChangedListener(new zf1(this, 0));
                    urVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.sf1
                        public final /* synthetic */ cg1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z10) {
                            switch (i24) {
                                case 0:
                                    org.telegram.ui.Components.uc0 uc0Var2 = this.b.v;
                                    float f9 = z10 ? 1.0f : 0.0f;
                                    uc0Var2.b(f9, f9, true);
                                    break;
                                case 1:
                                    cg1 cg1Var = this.b;
                                    if (!z10) {
                                        cg1Var.getClass();
                                        break;
                                    } else {
                                        cg1Var.a0.setEditText((EditText) view);
                                        cg1Var.a0.setDispatchBackWhenEmpty(true);
                                        break;
                                    }
                                default:
                                    org.telegram.ui.Components.uc0 uc0Var3 = this.b.s;
                                    float f10 = z10 ? 1.0f : 0.0f;
                                    uc0Var3.b(f10, f10, true);
                                    break;
                            }
                        }
                    });
                    i25++;
                    i24 = 1;
                }
                this.w.setVisibility(8);
                ua1Var.addView(this.w, i7.f6.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                ua1Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, i7.f6.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    ua1Var.addView(this.f, i7.f6.t(-2, -2, 49, 0, 0, 0, 25));
                    final int i26 = 1;
                    this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qf1
                        public final /* synthetic */ cg1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
                                case 0:
                                    this.b.C0();
                                    break;
                                case 1:
                                    cg1 cg1Var = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new tf1(cg1Var, 1));
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                    c2Var.P = string;
                                    cg1Var.showDialog(c2Var);
                                    break;
                                case 2:
                                    cg1.V(this.b);
                                    break;
                                case 3:
                                    cg1 cg1Var2 = this.b;
                                    if (cg1Var2.h.getAlpha() >= 0.5f) {
                                        int i152 = cg1Var2.K;
                                        if (i152 != 0) {
                                            if (i152 != 3) {
                                                if (i152 == 2) {
                                                    cg1Var2.A0();
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cg1Var2.getParentActivity());
                                                alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                                alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new tf1(cg1Var2, 2));
                                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                                cg1Var2.showDialog(c2Var2);
                                                TextView textView22 = (TextView) c2Var2.d(-1);
                                                if (textView22 != null) {
                                                    textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                                    break;
                                                }
                                            }
                                        } else {
                                            cg1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = cg1Var2.W;
                                            cg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new vf1(cg1Var2, 1));
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    cg1 cg1Var3 = this.b;
                                    if (cg1Var3.K == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.S = true;
                                        twoStepVerificationActivity.E = cg1Var3.Q;
                                        twoStepVerificationActivity.F = false;
                                        twoStepVerificationActivity.T = cg1Var3.C;
                                        cg1Var3.presentFragment(twoStepVerificationActivity, true);
                                        hb0 hb0Var = cg1Var3.f0;
                                        if (hb0Var != null) {
                                            AndroidUtilities.runOnUIThread(hb0Var);
                                            cg1Var3.f0 = null;
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    this.b.C0();
                                    break;
                                default:
                                    cg1 cg1Var4 = this.b;
                                    int i162 = cg1Var4.K;
                                    cg1Var4.I = true;
                                    if (cg1Var4.n.getTransformationMethod() == null) {
                                        cg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                            cg1Var4.b0[3].N(-1);
                                            org.telegram.ui.Components.xi0 animatedDrawable = cg1Var4.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.xi0 xi0Var = cg1Var4.b0[3];
                                            if (animatedDrawable != xi0Var) {
                                                cg1Var4.a.setAnimation(xi0Var);
                                                cg1Var4.b0[3].L(18, false, false);
                                            }
                                            cg1Var4.a.d();
                                        }
                                    } else {
                                        cg1Var4.n.setTransformationMethod(null);
                                        cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                            cg1Var4.b0[3].N(18);
                                            org.telegram.ui.Components.xi0 animatedDrawable2 = cg1Var4.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.xi0 xi0Var2 = cg1Var4.b0[3];
                                            if (animatedDrawable2 != xi0Var2) {
                                                cg1Var4.a.setAnimation(xi0Var2);
                                            }
                                            cg1Var4.b0[3].Q(0.0f, false);
                                            cg1Var4.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = cg1Var4.n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    cg1Var4.I = false;
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = o9Var;
                cg.i0 i0Var = new cg.i0(this, context);
                this.y = i0Var;
                i0Var.setAlpha(0.0f);
                o9Var.addView(this.y);
                o9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.H = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.H.setAlpha(0.0f);
                this.H.setScaleX(0.1f);
                this.H.setScaleY(0.1f);
                this.H.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l6, false));
                n0Var.addView(this.H, i7.f6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                g gVar = new g(this, context, 3);
                gVar.setOnTouchListener(new mh.d(2));
                gVar.addView(this.actionBar);
                gVar.addView(this.a);
                gVar.addView(this.c);
                gVar.addView(this.d);
                gVar.addView(this.b);
                this.fragmentView = gVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        switch (i14) {
            case 0:
            case 1:
                if (this.Q.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    String string = LocaleController.getString(i14 == 0 ? R.string.CreatePassword : R.string.ReEnterPassword);
                    this.actionBar.setTitle(string);
                    this.c.setText(string);
                }
                if (!TextUtils.isEmpty(this.W)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.s.setText(LocaleController.getString(i14 == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.n.setContentDescription(LocaleController.getString(i14 == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.n.setImeOptions(268435461);
                this.n.setInputType(129);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.B = i14 == 0;
                AndroidUtilities.updateViewVisibilityAnimated(this.A, false, 0.1f, false);
                org.telegram.ui.Components.xi0[] xi0VarArr = new org.telegram.ui.Components.xi0[7];
                this.b0 = xi0VarArr;
                xi0VarArr[0] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_idle1, "" + R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[1] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_idle2, "" + R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[2] = new org.telegram.ui.Components.xi0(R.raw.tsv_monkey_close, "" + R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[3] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_peek, "" + R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[4] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, "" + R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[5] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_close_and_peek, "" + R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[6] = new org.telegram.ui.Components.xi0(R.raw.tsv_setup_monkey_tracking, "" + R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.xi0 xi0Var = this.b0[6];
                xi0Var.h = true;
                xi0Var.N(19);
                this.b0[2].P(97, this.e0);
                F0(true);
                if (i14 != 1) {
                    this.n.dispatchTextWatchersTextChanged();
                    i10 = 1;
                    F0(true);
                    break;
                } else {
                    uf1 uf1Var = this.c0;
                    if (uf1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(uf1Var);
                    }
                    this.a.setAnimation(this.b0[6]);
                    this.a.d();
                    i10 = 1;
                    break;
                }
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 3:
                this.actionBar.setTitle(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.V) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.n.setImeOptions(268435461);
                this.n.setInputType(33);
                this.v.setVisibility(8);
                this.a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.a0.setVisibility(0);
                this.s.setVisibility(8);
                String str = this.Q.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str2);
                int indexOf = str2.indexOf(42);
                int lastIndexOf = str2.lastIndexOf(42);
                if (indexOf == lastIndexOf || indexOf == -1 || lastIndexOf == -1) {
                    r82 = 0;
                } else {
                    org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01();
                    h01Var.a |= 256;
                    h01Var.b = indexOf;
                    int i27 = lastIndexOf + 1;
                    h01Var.c = i27;
                    r82 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.i01(h01Var, 0), indexOf, i27, 0);
                }
                gh.s sVar2 = this.d;
                String string2 = LocaleController.getString(R.string.RestoreEmailSent);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r82] = valueOf;
                sVar2.setText(AndroidUtilities.formatSpannable(string2, charSequenceArr));
                this.d.setVisibility(r82);
                this.Y.e(r82, r82);
                this.w.setVisibility(r82);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(LocaleController.getString(R.string.VerificationCode));
                this.s.setVisibility(8);
                this.a0.setVisibility(0);
                gh.s sVar3 = this.d;
                int i28 = R.string.EmailPasswordConfirmText2;
                String str3 = this.Q.email_unconfirmed_pattern;
                sVar3.setText(LocaleController.formatString("EmailPasswordConfirmText2", i28, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.Y.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                final int i29 = 2;
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qf1
                    public final /* synthetic */ cg1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i29) {
                            case 0:
                                this.b.C0();
                                break;
                            case 1:
                                cg1 cg1Var = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new tf1(cg1Var, 1));
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                                String string3 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.P = string3;
                                cg1Var.showDialog(c2Var);
                                break;
                            case 2:
                                cg1.V(this.b);
                                break;
                            case 3:
                                cg1 cg1Var2 = this.b;
                                if (cg1Var2.h.getAlpha() >= 0.5f) {
                                    int i152 = cg1Var2.K;
                                    if (i152 != 0) {
                                        if (i152 != 3) {
                                            if (i152 == 2) {
                                                cg1Var2.A0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cg1Var2.getParentActivity());
                                            alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new tf1(cg1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                            cg1Var2.showDialog(c2Var2);
                                            TextView textView22 = (TextView) c2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                                break;
                                            }
                                        }
                                    } else {
                                        cg1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = cg1Var2.W;
                                        cg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new vf1(cg1Var2, 1));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                cg1 cg1Var3 = this.b;
                                if (cg1Var3.K == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.S = true;
                                    twoStepVerificationActivity.E = cg1Var3.Q;
                                    twoStepVerificationActivity.F = false;
                                    twoStepVerificationActivity.T = cg1Var3.C;
                                    cg1Var3.presentFragment(twoStepVerificationActivity, true);
                                    hb0 hb0Var = cg1Var3.f0;
                                    if (hb0Var != null) {
                                        AndroidUtilities.runOnUIThread(hb0Var);
                                        cg1Var3.f0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.b.C0();
                                break;
                            default:
                                cg1 cg1Var4 = this.b;
                                int i162 = cg1Var4.K;
                                cg1Var4.I = true;
                                if (cg1Var4.n.getTransformationMethod() == null) {
                                    cg1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                        cg1Var4.b0[3].N(-1);
                                        org.telegram.ui.Components.xi0 animatedDrawable = cg1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xi0 xi0Var2 = cg1Var4.b0[3];
                                        if (animatedDrawable != xi0Var2) {
                                            cg1Var4.a.setAnimation(xi0Var2);
                                            cg1Var4.b0[3].L(18, false, false);
                                        }
                                        cg1Var4.a.d();
                                    }
                                } else {
                                    cg1Var4.n.setTransformationMethod(null);
                                    cg1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && cg1Var4.n.length() > 0 && cg1Var4.n.hasFocus()) {
                                        cg1Var4.b0[3].N(18);
                                        org.telegram.ui.Components.xi0 animatedDrawable2 = cg1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.xi0 xi0Var22 = cg1Var4.b0[3];
                                        if (animatedDrawable2 != xi0Var22) {
                                            cg1Var4.a.setAnimation(xi0Var22);
                                        }
                                        cg1Var4.b0[3].Q(0.0f, false);
                                        cg1Var4.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = cg1Var4.n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                cg1Var4.I = false;
                                break;
                        }
                    }
                });
                this.w.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 6:
                this.c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.a.d();
                i10 = 1;
                break;
            case 7:
                this.c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.U) {
                    this.b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.D) {
                    this.b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_allset, 160, 160, null);
                this.a.d();
                i10 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(LocaleController.getString(R.string.ForgotPassword));
                this.e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.o6, false));
                this.s.setText(LocaleController.getString(R.string.LoginPassword));
                this.n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.n.setImeOptions(268435462);
                this.n.setInputType(129);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.a.f(R.raw.wallet_science, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 9:
                this.c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_perfect, 140, 140, null);
                this.a.d();
                i10 = 1;
                break;
            default:
                i10 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor4 = this.n;
        if (editTextBoldCursor4 != null) {
            editTextBoldCursor4.addTextChangedListener(new zf1(this, i10));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
            if (o2Var != this && (o2Var instanceof cg1)) {
                ((org.telegram.ui.Components.i61) ((cg1) o2Var).X.b).b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.n, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hideKeyboardOnShow() {
        int i10 = this.K;
        return i10 == 7 || i10 == 9;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.C < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.C < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            if (z10) {
                finishFragment();
            }
            return true;
        }
        if (!z10) {
            return false;
        }
        I0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a != null) {
            int i10 = this.K;
            if (i10 == 2 && AndroidUtilities.isSmallScreen()) {
                this.a.setVisibility(8);
            } else if (i10 != 6 && i10 != 9 && i10 != 7) {
                org.telegram.ui.Components.aj0 aj0Var = this.a;
                Point point = AndroidUtilities.displaySize;
                aj0Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        org.telegram.ui.Components.or orVar = this.a0;
        if (orVar != null) {
            orVar.setVisibility(v0() ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.J = false;
        uf1 uf1Var = this.c0;
        if (uf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(uf1Var);
            this.c0 = null;
        }
        if (this.b0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.xi0[] xi0VarArr = this.b0;
                if (i10 >= xi0VarArr.length) {
                    break;
                }
                xi0VarArr[i10].A(false);
                i10++;
            }
            this.b0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        this.O = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        this.O = false;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new uf1(this, 0), 200L);
            }
            md0 md0Var = this.w;
            if (md0Var == null || md0Var.getVisibility() != 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new uf1(this, 1), 200L);
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            md0 md0Var = this.w;
            ur[] urVarArr = md0Var.f;
            if (i10 >= urVarArr.length) {
                md0Var.postDelayed(new t31(22, this, runnable), (urVarArr.length * 75) + 350);
                return;
            } else {
                ur urVar = urVarArr[i10];
                urVar.postDelayed(new sk0(urVar, 1), i10 * 75);
                i10++;
            }
        }
    }

    public final boolean v0() {
        int i10 = this.K;
        if ((i10 != 5 && i10 != 4) || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final void w0() {
        this.Y.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.Y.f(true, true);
    }

    public final void y0() {
        for (ur urVar : this.w.f) {
            urVar.setText("");
            urVar.i(1.0f);
        }
        this.w.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.w, 8.0f, new uf1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.uc0 uc0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(uc0Var, 5.0f);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void finishFragment() {
        if (this.C >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle i10 = a4.w.i("afterSignup", true);
            ng0 ng0Var = new ng0();
            ng0Var.l0(i10);
            presentFragment(ng0Var, true);
            return;
        }
        super.finishFragment();
    }

    public cg1(int i10, TL_account.Password password) {
        super(null);
        this.B = false;
        this.C = -1;
        this.F = new ArrayList();
        this.R = new byte[0];
        this.d0 = new uf1(this, 2);
        this.e0 = new uf1(this, 3);
        this.K = i10;
        this.Q = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new vf1(this, 0), 10);
        } else {
            this.P = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }

    public void B0() {
    }
}
