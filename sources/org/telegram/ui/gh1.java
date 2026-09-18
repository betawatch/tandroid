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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public class gh1 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.ActionBar.k0 E;
    public boolean F;
    public int G;
    public boolean H;
    public AnimatorSet I;
    public final ArrayList J;
    public AnimatorSet K;
    public RadialProgressView L;
    public boolean M;
    public boolean N;
    public final int O;
    public String P;
    public String Q;
    public String R;
    public boolean S;
    public boolean T;
    public TL_account.Password U;
    public byte[] V;
    public long W;
    public byte[] X;
    public boolean Y;
    public boolean Z;
    public org.telegram.ui.Components.lj0 a;
    public String a0;
    public TextView b;
    public n7.z0 b0;
    public TextView c;
    public org.telegram.ui.Components.y10 c0;
    public vh.o d;
    public org.telegram.ui.Components.u31 d0;
    public TextView e;
    public org.telegram.ui.Components.ur e0;
    public TextView f;
    public org.telegram.ui.Components.ij0[] f0;
    public yg1 g0;
    public TextView h;
    public final Runnable h0;
    public final Runnable i0;
    public bc0 j0;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public org.telegram.ui.Components.id0 s;
    public org.telegram.ui.Components.id0 v;
    public ee0 w;
    public fh1 x;
    public ci.s6 y;

    public gh1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.h0 = new yg1(this, 2);
        this.i0 = new yg1(this, 3);
        this.currentAccount = i10;
        this.O = i11;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new zg1(this, 0), 10);
            }
        }
    }

    public static void U(gh1 gh1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = gh1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.startCheck(gh1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z10 || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = gh1Var.U.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
                bArr2 = stringBytes;
            } else {
                bArr2 = stringBytes;
                bArr = null;
            }
        }
        hg.o0 o0Var = new hg.o0(gh1Var, bArr, str, passwordinputsettings, z10, 4);
        if (z10) {
            ConnectionsManager.getInstance(gh1Var.currentAccount).sendRequest(tLObject, o0Var, 10);
            return;
        }
        if (str != null && (bArr3 = gh1Var.X) != null && bArr3.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = gh1Var.U.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr4 = new byte[32];
                System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                byte[] bArr5 = new byte[16];
                System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(gh1Var.X, 0, bArr6, 0, 32);
                Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr6;
                tL_secureSecretSettings.secure_secret_id = gh1Var.W;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = gh1Var.U.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            o0Var.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] vBytes = SRPHelper.getVBytes(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = vBytes;
            if (vBytes == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                o0Var.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(gh1Var.currentAccount).sendRequest(tLObject, o0Var, 10);
    }

    public static void V(gh1 gh1Var) {
        ConnectionsManager.getInstance(gh1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ai.t7(8));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        gh1Var.showDialog(alertDialog$Builder.a);
    }

    public static void W(gh1 gh1Var, byte[] bArr) {
        ArrayList arrayList = gh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = gh1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = gh1Var.U;
        if (bArr == null) {
            bArr = gh1Var.V;
        }
        twoStepVerificationActivity.v0(password2, bArr, gh1Var.W, gh1Var.X);
        twoStepVerificationActivity.X = gh1Var.G;
        gh1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, gh1Var.U);
        bc0 bc0Var = gh1Var.j0;
        if (bc0Var != null) {
            AndroidUtilities.runOnUIThread(bc0Var);
            gh1Var.j0 = null;
        }
    }

    public static void X(gh1 gh1Var) {
        ArrayList arrayList = gh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(gh1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = gh1Var.V;
        TL_account.Password password = gh1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, gh1Var.R, gh1Var.Q, null, gh1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = gh1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, gh1Var.V, gh1Var.W, gh1Var.X);
        twoStepVerificationActivity.X = gh1Var.G;
        gh1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, gh1Var.U);
        bc0 bc0Var = gh1Var.j0;
        if (bc0Var != null) {
            AndroidUtilities.runOnUIThread(bc0Var);
            gh1Var.j0 = null;
        }
    }

    public static /* synthetic */ void Y(gh1 gh1Var, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = gh1Var.U.current_algo;
        byte[] x10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        cc0 cc0Var = new cc0(29, gh1Var, x10);
        TL_account.Password password = gh1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            cc0Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(gh1Var.currentAccount).sendRequest(getpasswordsettings, cc0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        cc0Var.run(null, tL_error2);
    }

    public static void Z(gh1 gh1Var, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(gh1Var.currentAccount).sendRequest(new TL_account.getPassword(), new zg1(gh1Var, 4), 8);
            return;
        }
        gh1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            gh1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            gh1Var.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
            gh1Var.z0(gh1Var.s, gh1Var.n, true);
            gh1Var.H0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            gh1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            gh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
        }
    }

    public static /* synthetic */ void a0(gh1 gh1Var) {
        ArrayList arrayList = gh1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        gh1Var.finishFragment();
    }

    public static /* synthetic */ void b0(gh1 gh1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            gh1Var.U = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.e5.x0(gh1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            gh1Var.T = !TextUtils.isEmpty(gh1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(gh1Var.U);
            if (!gh1Var.S && gh1Var.Y) {
                TL_account.Password password2 = gh1Var.U;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!gh1Var.T && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        gh1Var.finishFragment();
                    }
                }
            }
            if (gh1Var.N) {
                gh1Var.w0();
                gh1Var.C0();
            }
            NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, gh1Var.U);
        }
    }

    public static /* synthetic */ void c0(gh1 gh1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            gh1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            gh1Var.E0(z10);
            NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, gh1Var.U);
        }
    }

    public static void d0(gh1 gh1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        ArrayList arrayList = gh1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(gh1Var.currentAccount).sendRequest(new TL_account.getPassword(), new ci.u3(12, gh1Var, z10), 8);
            return;
        }
        gh1Var.w0();
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        gh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        gh1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        gh1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        return;
                    }
                }
                NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(gh1Var.currentAccount);
                int i11 = NotificationCenter.twoStepPasswordChanged;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                TL_account.Password password2 = gh1Var.U;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                byte[] bArr2 = password2.secure_random;
                String str2 = gh1Var.R;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, gh1Var.Q, str2, gh1Var.P);
                TL_account.Password password3 = gh1Var.U;
                password3.email_unconfirmed_pattern = gh1Var.R;
                gh1 gh1Var2 = new gh1(5, password3);
                gh1Var2.H = gh1Var.H;
                gh1Var2.D0(bArr != null ? bArr : gh1Var.V, gh1Var.W, gh1Var.X, gh1Var.Z);
                gh1Var2.Y = gh1Var.Y;
                gh1Var2.G = gh1Var.G;
                gh1Var.presentFragment(gh1Var2, true);
                return;
            }
            return;
        }
        gh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        if (z10) {
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((org.telegram.ui.ActionBar.n2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            gh1Var.finishFragment();
            return;
        }
        if (gh1Var.getParentActivity() == null) {
            return;
        }
        if (gh1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rv0(18, gh1Var, bArr));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            if (str == null && (password = gh1Var.U) != null && password.has_password) {
                b2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
            } else {
                b2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
            }
            b2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = gh1Var.showDialog(b2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i13)).removeSelfFromStack();
        }
        TL_account.Password password4 = gh1Var.U;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (gh1Var.Y) {
            NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        }
        gh1 gh1Var3 = new gh1(7, gh1Var.U);
        gh1Var3.H = gh1Var.H;
        gh1Var3.D0(bArr != null ? bArr : gh1Var.V, gh1Var.W, gh1Var.X, gh1Var.Z);
        gh1Var3.Y = gh1Var.Y;
        gh1Var3.G = gh1Var.G;
        gh1Var.presentFragment(gh1Var3, true);
        NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, gh1Var.U);
    }

    public static void e0(gh1 gh1Var, TLRPC.TL_error tL_error) {
        gh1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = gh1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, gh1Var.V, gh1Var.W, gh1Var.X);
            twoStepVerificationActivity.X = gh1Var.G;
            gh1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            bc0 bc0Var = gh1Var.j0;
            if (bc0Var != null) {
                AndroidUtilities.runOnUIThread(bc0Var);
                gh1Var.j0 = null;
            }
        }
    }

    public static void f0(gh1 gh1Var) {
        ArrayList arrayList = gh1Var.J;
        int i10 = 4;
        if (gh1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new xg1(gh1Var, i10));
            boolean z10 = gh1Var.U.has_recovery;
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            if (z10) {
                b2Var.T = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                b2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            b2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = gh1Var.showDialog(b2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i11)).removeSelfFromStack();
        }
        TL_account.Password password = gh1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        gh1 gh1Var2 = new gh1(7, password);
        gh1Var2.H = gh1Var.H;
        gh1Var2.D0(gh1Var.V, gh1Var.W, gh1Var.X, gh1Var.Z);
        gh1Var2.J.addAll(arrayList);
        gh1Var2.Y = gh1Var.Y;
        gh1Var2.G = gh1Var.G;
        gh1Var.presentFragment(gh1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(gh1Var.currentAccount);
        int i12 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = gh1Var.V;
        TL_account.Password password2 = gh1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, gh1Var.R, gh1Var.Q, null, gh1Var.P);
        NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, gh1Var.U);
    }

    public static void g0(gh1 gh1Var, String str) {
        gh1 gh1Var2 = new gh1(gh1Var.currentAccount, 0, gh1Var.U);
        gh1Var2.H = gh1Var.H;
        gh1Var2.J.addAll(gh1Var.J);
        gh1Var2.J.add(gh1Var);
        gh1Var2.a0 = str;
        gh1Var2.G = gh1Var.G;
        gh1Var.presentFragment(gh1Var2, true);
    }

    public static /* synthetic */ void h0(gh1 gh1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            gh1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(gh1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, gh1Var.U);
            gh1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.U;
        if (password.has_recovery) {
            this.R = "";
            E0(false);
            return;
        }
        gh1 gh1Var = new gh1(this.currentAccount, 3, password);
        gh1Var.H = this.H;
        gh1Var.D0(this.V, this.W, this.X, this.Z);
        gh1Var.P = this.P;
        gh1Var.Q = this.Q;
        gh1Var.J.addAll(this.J);
        gh1Var.J.add(this);
        gh1Var.Y = this.Y;
        gh1Var.G = this.G;
        presentFragment(gh1Var);
    }

    public final void C0() {
        if (getParentActivity() == null) {
            return;
        }
        switch (this.O) {
            case 0:
            case 1:
                if (this.n.length() == 0) {
                    z0(this.s, this.n, false);
                    break;
                } else if (this.n.getText().toString().equals(this.P) || this.O != 1) {
                    gh1 gh1Var = new gh1(this.currentAccount, this.O != 0 ? 2 : 1, this.U);
                    gh1Var.H = this.H;
                    gh1Var.P = this.n.getText().toString();
                    gh1Var.D0(this.V, this.W, this.X, this.Z);
                    gh1Var.a0 = this.a0;
                    gh1Var.J.addAll(this.J);
                    gh1Var.J.add(this);
                    gh1Var.Y = this.Y;
                    gh1Var.G = this.G;
                    presentFragment(gh1Var);
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
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
            case 2:
                String obj = this.n.getText().toString();
                this.Q = obj;
                if (!obj.equalsIgnoreCase(this.P)) {
                    A0();
                    break;
                } else {
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    z0(this.s, this.n, false);
                    break;
                }
            case 3:
                if (!this.Z && this.h.getAlpha() < 1.0f) {
                    this.h.animate().cancel();
                    this.h.animate().alpha(1.0f).start();
                }
                String obj2 = this.n.getText().toString();
                this.R = obj2;
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new cc0(28, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.w.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new zg1(this, 2), 10);
                x0();
                break;
            case 6:
                TL_account.Password password = this.U;
                if (password != null) {
                    gh1 gh1Var2 = new gh1(this.currentAccount, 0, password);
                    gh1Var2.H = this.H;
                    gh1Var2.Y = this.Y;
                    gh1Var2.G = this.G;
                    presentFragment(gh1Var2, true);
                    break;
                } else {
                    x0();
                    this.N = true;
                    break;
                }
            case 7:
                if (!this.Y) {
                    if (!this.H) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.v0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        bc0 bc0Var = this.j0;
                        if (bc0Var != null) {
                            AndroidUtilities.runOnUIThread(bc0Var);
                            this.j0 = null;
                            break;
                        }
                    } else {
                        Bundle i10 = a4.a.i("afterSignup", true);
                        fh0 fh0Var = new fh0();
                        fh0Var.l0(i10);
                        presentFragment(fh0Var, true);
                        break;
                    }
                } else {
                    finishFragment();
                    break;
                }
                break;
            case 8:
                if (this.U != null) {
                    String obj3 = this.n.getText().toString();
                    if (obj3.length() != 0) {
                        byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                        x0();
                        Utilities.globalQueue.postRunnable(new ah1(this, stringBytes, 0));
                        break;
                    } else {
                        z0(this.s, this.n, false);
                        break;
                    }
                } else {
                    x0();
                    this.N = true;
                    break;
                }
            case 9:
                finishFragment();
                break;
        }
    }

    public final void D0(byte[] bArr, long j3, byte[] bArr2, boolean z10) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j3;
        this.Z = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.T && this.U.has_password) {
            x0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new zg1(this, 3));
            return;
        }
        String str = this.P;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
            this.X = null;
            if (this.T) {
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
            if (this.Q == null && (password = this.U) != null) {
                this.Q = password.hint;
            }
            if (this.Q == null) {
                this.Q = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.Q;
                passwordinputsettings.new_algo = this.U.new_algo;
            }
            if (this.R.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.R.trim();
            }
        }
        if (this.a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.a0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.V;
            if (bArr == null || bArr.length == 0 || (z10 && this.T)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        x0();
        Utilities.globalQueue.postRunnable(new ci.u1(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.k0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(boolean z10) {
        if (this.O != 0) {
            return;
        }
        yg1 yg1Var = this.g0;
        if (yg1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
        }
        org.telegram.ui.Components.ij0 animatedDrawable = this.a.getAnimatedDrawable();
        if (!z10) {
            org.telegram.ui.Components.ij0[] ij0VarArr = this.f0;
            if (animatedDrawable != ij0VarArr[0]) {
                if (animatedDrawable != ij0VarArr[1]) {
                    if (this.n.length() == 0) {
                        if (animatedDrawable != null) {
                        }
                    }
                    yg1 yg1Var2 = new yg1(this, 4);
                    this.g0 = yg1Var2;
                    AndroidUtilities.runOnUIThread(yg1Var2, Utilities.random.nextInt(2000) + 5000);
                }
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            this.a.setAnimation(this.f0[0]);
            this.f0[0].T(0.0f, true);
        } else {
            this.a.setAnimation(this.f0[1]);
            this.f0[1].T(0.0f, true);
        }
        if (!z10) {
            this.a.d();
        }
        yg1 yg1Var22 = new yg1(this, 4);
        this.g0 = yg1Var22;
        AndroidUtilities.runOnUIThread(yg1Var22, Utilities.random.nextInt(2000) + 5000);
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = str;
        b2Var.T = str2;
        showDialog(b2Var);
    }

    public final void H0(boolean z10) {
        if (z10 == (this.b.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b.setTag(z10 ? 1 : null);
        this.I = new AnimatorSet();
        if (z10) {
            this.b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
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
            AnimatorSet animatorSet3 = this.I;
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
        this.I.addListener(new h70(11, this, z10));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.a.T = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.G, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new xg1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new eh1(this));
        final int i13 = 1;
        int i14 = this.O;
        if (i14 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider, false);
        this.c0 = y10Var;
        this.b0 = new n7.z0(y10Var);
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ug1
            public final /* synthetic */ gh1 b;

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
                        gh1 gh1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new xg1(gh1Var, 1));
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.T = string;
                        gh1Var.showDialog(b2Var);
                        break;
                    case 2:
                        gh1.V(this.b);
                        break;
                    case 3:
                        gh1 gh1Var2 = this.b;
                        if (gh1Var2.h.getAlpha() >= 0.5f) {
                            int i15 = gh1Var2.O;
                            if (i15 != 0) {
                                if (i15 != 3) {
                                    if (i15 == 2) {
                                        gh1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gh1Var2.getParentActivity());
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new xg1(gh1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                    gh1Var2.showDialog(b2Var2);
                                    TextView textView = (TextView) b2Var2.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                gh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = gh1Var2.a0;
                                gh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new zg1(gh1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        gh1 gh1Var3 = this.b;
                        if (gh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = gh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = gh1Var3.G;
                            gh1Var3.presentFragment(twoStepVerificationActivity, true);
                            bc0 bc0Var = gh1Var3.j0;
                            if (bc0Var != null) {
                                AndroidUtilities.runOnUIThread(bc0Var);
                                gh1Var3.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        gh1 gh1Var4 = this.b;
                        int i16 = gh1Var4.O;
                        gh1Var4.M = true;
                        if (gh1Var4.n.getTransformationMethod() == null) {
                            gh1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                gh1Var4.f0[3].P(-1);
                                org.telegram.ui.Components.ij0 animatedDrawable = gh1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ij0 ij0Var = gh1Var4.f0[3];
                                if (animatedDrawable != ij0Var) {
                                    gh1Var4.a.setAnimation(ij0Var);
                                    gh1Var4.f0[3].N(18, false, false);
                                }
                                gh1Var4.a.d();
                            }
                        } else {
                            gh1Var4.n.setTransformationMethod(null);
                            gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                gh1Var4.f0[3].P(18);
                                org.telegram.ui.Components.ij0 animatedDrawable2 = gh1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ij0 ij0Var2 = gh1Var4.f0[3];
                                if (animatedDrawable2 != ij0Var2) {
                                    gh1Var4.a.setAnimation(ij0Var2);
                                }
                                gh1Var4.f0[3].T(0.0f, false);
                                gh1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = gh1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        gh1Var4.M = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.u31 u31Var = new org.telegram.ui.Components.u31(context);
        this.d0 = u31Var;
        u31Var.setTransformType(1);
        this.d0.setProgress(0.0f);
        this.d0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false));
        this.d0.setDrawBackground(false);
        this.c0.setContentDescription(LocaleController.getString(R.string.Next));
        this.c0.addView(this.d0, w7.y5.e(56, 56, 17));
        this.c0.a(this.d0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        n7.z0.k(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        final int i15 = 3;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ug1
            public final /* synthetic */ gh1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        gh1 gh1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new xg1(gh1Var, 1));
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.T = string;
                        gh1Var.showDialog(b2Var);
                        break;
                    case 2:
                        gh1.V(this.b);
                        break;
                    case 3:
                        gh1 gh1Var2 = this.b;
                        if (gh1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = gh1Var2.O;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        gh1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gh1Var2.getParentActivity());
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new xg1(gh1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                    gh1Var2.showDialog(b2Var2);
                                    TextView textView2 = (TextView) b2Var2.d(-1);
                                    if (textView2 != null) {
                                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                gh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = gh1Var2.a0;
                                gh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new zg1(gh1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        gh1 gh1Var3 = this.b;
                        if (gh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = gh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = gh1Var3.G;
                            gh1Var3.presentFragment(twoStepVerificationActivity, true);
                            bc0 bc0Var = gh1Var3.j0;
                            if (bc0Var != null) {
                                AndroidUtilities.runOnUIThread(bc0Var);
                                gh1Var3.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        gh1 gh1Var4 = this.b;
                        int i16 = gh1Var4.O;
                        gh1Var4.M = true;
                        if (gh1Var4.n.getTransformationMethod() == null) {
                            gh1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                gh1Var4.f0[3].P(-1);
                                org.telegram.ui.Components.ij0 animatedDrawable = gh1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ij0 ij0Var = gh1Var4.f0[3];
                                if (animatedDrawable != ij0Var) {
                                    gh1Var4.a.setAnimation(ij0Var);
                                    gh1Var4.f0[3].N(18, false, false);
                                }
                                gh1Var4.a.d();
                            }
                        } else {
                            gh1Var4.n.setTransformationMethod(null);
                            gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                gh1Var4.f0[3].P(18);
                                org.telegram.ui.Components.ij0 animatedDrawable2 = gh1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ij0 ij0Var2 = gh1Var4.f0[3];
                                if (animatedDrawable2 != ij0Var2) {
                                    gh1Var4.a.setAnimation(ij0Var2);
                                }
                                gh1Var4.f0[3].T(0.0f, false);
                                gh1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = gh1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        gh1Var4.M = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(context);
        this.a = lj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        lj0Var.setScaleType(scaleType);
        if (i14 == 2 && AndroidUtilities.isSmallScreen()) {
            this.a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.lj0 lj0Var2 = this.a;
            Point point = AndroidUtilities.displaySize;
            lj0Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.c.setGravity(1);
        this.c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        vh.o oVar = new vh.o(context);
        this.d = oVar;
        int i16 = org.telegram.ui.ActionBar.j6.D6;
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setVisibility(8);
        final int i17 = 4;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ug1
            public final /* synthetic */ gh1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.C0();
                        break;
                    case 1:
                        gh1 gh1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new xg1(gh1Var, 1));
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.T = string;
                        gh1Var.showDialog(b2Var);
                        break;
                    case 2:
                        gh1.V(this.b);
                        break;
                    case 3:
                        gh1 gh1Var2 = this.b;
                        if (gh1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = gh1Var2.O;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        gh1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gh1Var2.getParentActivity());
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new xg1(gh1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                    gh1Var2.showDialog(b2Var2);
                                    TextView textView22 = (TextView) b2Var2.d(-1);
                                    if (textView22 != null) {
                                        textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                gh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = gh1Var2.a0;
                                gh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new zg1(gh1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        gh1 gh1Var3 = this.b;
                        if (gh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = gh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = gh1Var3.G;
                            gh1Var3.presentFragment(twoStepVerificationActivity, true);
                            bc0 bc0Var = gh1Var3.j0;
                            if (bc0Var != null) {
                                AndroidUtilities.runOnUIThread(bc0Var);
                                gh1Var3.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        gh1 gh1Var4 = this.b;
                        int i162 = gh1Var4.O;
                        gh1Var4.M = true;
                        if (gh1Var4.n.getTransformationMethod() == null) {
                            gh1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                gh1Var4.f0[3].P(-1);
                                org.telegram.ui.Components.ij0 animatedDrawable = gh1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ij0 ij0Var = gh1Var4.f0[3];
                                if (animatedDrawable != ij0Var) {
                                    gh1Var4.a.setAnimation(ij0Var);
                                    gh1Var4.f0[3].N(18, false, false);
                                }
                                gh1Var4.a.d();
                            }
                        } else {
                            gh1Var4.n.setTransformationMethod(null);
                            gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                gh1Var4.f0[3].P(18);
                                org.telegram.ui.Components.ij0 animatedDrawable2 = gh1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ij0 ij0Var2 = gh1Var4.f0[3];
                                if (animatedDrawable2 != ij0Var2) {
                                    gh1Var4.a.setAnimation(ij0Var2);
                                }
                                gh1Var4.f0[3].T(0.0f, false);
                                gh1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = gh1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        gh1Var4.M = false;
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.b.setGravity(17);
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(AndroidUtilities.bold());
        this.b.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        final int i18 = 5;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ug1
            public final /* synthetic */ gh1 b;

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
                        gh1 gh1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new xg1(gh1Var, 1));
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.T = string;
                        gh1Var.showDialog(b2Var);
                        break;
                    case 2:
                        gh1.V(this.b);
                        break;
                    case 3:
                        gh1 gh1Var2 = this.b;
                        if (gh1Var2.h.getAlpha() >= 0.5f) {
                            int i152 = gh1Var2.O;
                            if (i152 != 0) {
                                if (i152 != 3) {
                                    if (i152 == 2) {
                                        gh1Var2.A0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gh1Var2.getParentActivity());
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new xg1(gh1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                    gh1Var2.showDialog(b2Var2);
                                    TextView textView22 = (TextView) b2Var2.d(-1);
                                    if (textView22 != null) {
                                        textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                gh1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = gh1Var2.a0;
                                gh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new zg1(gh1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        gh1 gh1Var3 = this.b;
                        if (gh1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = gh1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = gh1Var3.G;
                            gh1Var3.presentFragment(twoStepVerificationActivity, true);
                            bc0 bc0Var = gh1Var3.j0;
                            if (bc0Var != null) {
                                AndroidUtilities.runOnUIThread(bc0Var);
                                gh1Var3.j0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.C0();
                        break;
                    default:
                        gh1 gh1Var4 = this.b;
                        int i162 = gh1Var4.O;
                        gh1Var4.M = true;
                        if (gh1Var4.n.getTransformationMethod() == null) {
                            gh1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                gh1Var4.f0[3].P(-1);
                                org.telegram.ui.Components.ij0 animatedDrawable = gh1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ij0 ij0Var = gh1Var4.f0[3];
                                if (animatedDrawable != ij0Var) {
                                    gh1Var4.a.setAnimation(ij0Var);
                                    gh1Var4.f0[3].N(18, false, false);
                                }
                                gh1Var4.a.d();
                            }
                        } else {
                            gh1Var4.n.setTransformationMethod(null);
                            gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i162 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                gh1Var4.f0[3].P(18);
                                org.telegram.ui.Components.ij0 animatedDrawable2 = gh1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.ij0 ij0Var2 = gh1Var4.f0[3];
                                if (animatedDrawable2 != ij0Var2) {
                                    gh1Var4.a.setAnimation(ij0Var2);
                                }
                                gh1Var4.f0[3].T(0.0f, false);
                                gh1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = gh1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        gh1Var4.M = false;
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
                j0 j0Var = new j0(this, context, 25);
                org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(this, context, j0Var, 2);
                ea0Var.addView(j0Var);
                s9 s9Var = new s9(this, context, ea0Var);
                fh1 fh1Var = new fh1(this, context);
                this.x = fh1Var;
                fh1Var.setVerticalScrollBarEnabled(false);
                j0Var.addView(this.x, w7.y5.c(-1.0f, -1));
                j0Var.addView(this.h, w7.y5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                j0Var.addView(this.c0, org.telegram.ui.Components.y10.b());
                s9Var.addView(ea0Var, w7.y5.c(-1.0f, -1));
                bc1 bc1Var = new bc1(this, context, 15);
                bc1Var.setOrientation(1);
                this.x.addView(bc1Var, w7.y5.x(-1, -1, 51));
                bc1Var.addView(this.a, w7.y5.t(-2, -2, 49, 0, 69, 0, 0));
                bc1Var.addView(this.c, w7.y5.t(-2, -2, 49, 0, 8, 0, 0));
                bc1Var.addView(this.d, w7.y5.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.id0 id0Var = new org.telegram.ui.Components.id0(context, null);
                this.s = id0Var;
                id0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i19 = org.telegram.ui.ActionBar.j6.l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                this.n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.vg1
                    public final /* synthetic */ gh1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i20, KeyEvent keyEvent) {
                        switch (i13) {
                            case 0:
                                gh1 gh1Var = this.b;
                                gh1Var.getClass();
                                if (i20 != 5 && i20 != 6) {
                                    return false;
                                }
                                gh1Var.C0();
                                return true;
                            default:
                                gh1 gh1Var2 = this.b;
                                gh1Var2.getClass();
                                if (i20 != 5 && i20 != 6) {
                                    return false;
                                }
                                if (gh1Var2.v.getVisibility() == 0) {
                                    gh1Var2.r.requestFocus();
                                } else {
                                    gh1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.s.e(this.n);
                final int i20 = 2;
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.wg1
                    public final /* synthetic */ gh1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i20) {
                            case 0:
                                org.telegram.ui.Components.id0 id0Var2 = this.b.v;
                                float f7 = z10 ? 1.0f : 0.0f;
                                id0Var2.b(f7, f7, true);
                                break;
                            case 1:
                                gh1 gh1Var = this.b;
                                if (!z10) {
                                    gh1Var.getClass();
                                    break;
                                } else {
                                    gh1Var.e0.setEditText((EditText) view);
                                    gh1Var.e0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.id0 id0Var3 = this.b.s;
                                float f10 = z10 ? 1.0f : 0.0f;
                                id0Var3.b(f10, f10, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, w7.y5.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.k0 k0Var = new org.telegram.ui.ActionBar.k0(this, context, 3);
                this.E = k0Var;
                k0Var.setImageResource(R.drawable.msg_message);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.E.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 1, -1));
                this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                final int i21 = 6;
                this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ug1
                    public final /* synthetic */ gh1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                this.b.C0();
                                break;
                            case 1:
                                gh1 gh1Var = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new xg1(gh1Var, 1));
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.T = string;
                                gh1Var.showDialog(b2Var);
                                break;
                            case 2:
                                gh1.V(this.b);
                                break;
                            case 3:
                                gh1 gh1Var2 = this.b;
                                if (gh1Var2.h.getAlpha() >= 0.5f) {
                                    int i152 = gh1Var2.O;
                                    if (i152 != 0) {
                                        if (i152 != 3) {
                                            if (i152 == 2) {
                                                gh1Var2.A0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gh1Var2.getParentActivity());
                                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new xg1(gh1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                            gh1Var2.showDialog(b2Var2);
                                            TextView textView22 = (TextView) b2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                                break;
                                            }
                                        }
                                    } else {
                                        gh1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = gh1Var2.a0;
                                        gh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new zg1(gh1Var2, 1));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                gh1 gh1Var3 = this.b;
                                if (gh1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = gh1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = gh1Var3.G;
                                    gh1Var3.presentFragment(twoStepVerificationActivity, true);
                                    bc0 bc0Var = gh1Var3.j0;
                                    if (bc0Var != null) {
                                        AndroidUtilities.runOnUIThread(bc0Var);
                                        gh1Var3.j0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.b.C0();
                                break;
                            default:
                                gh1 gh1Var4 = this.b;
                                int i162 = gh1Var4.O;
                                gh1Var4.M = true;
                                if (gh1Var4.n.getTransformationMethod() == null) {
                                    gh1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                        gh1Var4.f0[3].P(-1);
                                        org.telegram.ui.Components.ij0 animatedDrawable = gh1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ij0 ij0Var = gh1Var4.f0[3];
                                        if (animatedDrawable != ij0Var) {
                                            gh1Var4.a.setAnimation(ij0Var);
                                            gh1Var4.f0[3].N(18, false, false);
                                        }
                                        gh1Var4.a.d();
                                    }
                                } else {
                                    gh1Var4.n.setTransformationMethod(null);
                                    gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                        gh1Var4.f0[3].P(18);
                                        org.telegram.ui.Components.ij0 animatedDrawable2 = gh1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ij0 ij0Var2 = gh1Var4.f0[3];
                                        if (animatedDrawable2 != ij0Var2) {
                                            gh1Var4.a.setAnimation(ij0Var2);
                                        }
                                        gh1Var4.f0[3].T(0.0f, false);
                                        gh1Var4.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = gh1Var4.n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                gh1Var4.M = false;
                                break;
                        }
                    }
                });
                linearLayout.addView(this.E, w7.y5.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new dh1(this, 2));
                this.s.addView(linearLayout, w7.y5.c(-2.0f, -1));
                bc1Var.addView(this.s, w7.y5.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.id0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.r.setPadding(dp2, dp2, dp2, dp2);
                this.r.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                this.r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.vg1
                    public final /* synthetic */ gh1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i202, KeyEvent keyEvent) {
                        switch (i11) {
                            case 0:
                                gh1 gh1Var = this.b;
                                gh1Var.getClass();
                                if (i202 != 5 && i202 != 6) {
                                    return false;
                                }
                                gh1Var.C0();
                                return true;
                            default:
                                gh1 gh1Var2 = this.b;
                                gh1Var2.getClass();
                                if (i202 != 5 && i202 != 6) {
                                    return false;
                                }
                                if (gh1Var2.v.getVisibility() == 0) {
                                    gh1Var2.r.requestFocus();
                                } else {
                                    gh1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.wg1
                    public final /* synthetic */ gh1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i11) {
                            case 0:
                                org.telegram.ui.Components.id0 id0Var2 = this.b.v;
                                float f7 = z10 ? 1.0f : 0.0f;
                                id0Var2.b(f7, f7, true);
                                break;
                            case 1:
                                gh1 gh1Var = this.b;
                                if (!z10) {
                                    gh1Var.getClass();
                                    break;
                                } else {
                                    gh1Var.e0.setEditText((EditText) view);
                                    gh1Var.e0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.id0 id0Var3 = this.b.s;
                                float f10 = z10 ? 1.0f : 0.0f;
                                id0Var3.b(f10, f10, true);
                                break;
                        }
                    }
                });
                this.v.addView(this.r, w7.y5.c(-2.0f, -1));
                bc1Var.addView(this.v, w7.y5.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.ur urVar = new org.telegram.ui.Components.ur(context);
                this.e0 = urVar;
                urVar.setVisibility(8);
                ea0Var.addView(this.e0);
                ee0 ee0Var = new ee0(this, context, 3);
                this.w = ee0Var;
                final int i22 = 1;
                ee0Var.b(6, 1);
                gs[] gsVarArr = this.w.f;
                int length = gsVarArr.length;
                int i23 = 0;
                while (i23 < length) {
                    gs gsVar = gsVarArr[i23];
                    gsVar.setShowSoftInputOnFocusCompat((v0() ? 1 : 0) ^ i22);
                    gsVar.addTextChangedListener(new dh1(this, i11));
                    gsVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.wg1
                        public final /* synthetic */ gh1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z10) {
                            switch (i22) {
                                case 0:
                                    org.telegram.ui.Components.id0 id0Var2 = this.b.v;
                                    float f7 = z10 ? 1.0f : 0.0f;
                                    id0Var2.b(f7, f7, true);
                                    break;
                                case 1:
                                    gh1 gh1Var = this.b;
                                    if (!z10) {
                                        gh1Var.getClass();
                                        break;
                                    } else {
                                        gh1Var.e0.setEditText((EditText) view);
                                        gh1Var.e0.setDispatchBackWhenEmpty(true);
                                        break;
                                    }
                                default:
                                    org.telegram.ui.Components.id0 id0Var3 = this.b.s;
                                    float f10 = z10 ? 1.0f : 0.0f;
                                    id0Var3.b(f10, f10, true);
                                    break;
                            }
                        }
                    });
                    i23++;
                    i22 = 1;
                }
                this.w.setVisibility(8);
                bc1Var.addView(this.w, w7.y5.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                bc1Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, w7.y5.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    bc1Var.addView(this.f, w7.y5.t(-2, -2, 49, 0, 0, 0, 25));
                    final int i24 = 1;
                    this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ug1
                        public final /* synthetic */ gh1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    this.b.C0();
                                    break;
                                case 1:
                                    gh1 gh1Var = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new xg1(gh1Var, 1));
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                    b2Var.T = string;
                                    gh1Var.showDialog(b2Var);
                                    break;
                                case 2:
                                    gh1.V(this.b);
                                    break;
                                case 3:
                                    gh1 gh1Var2 = this.b;
                                    if (gh1Var2.h.getAlpha() >= 0.5f) {
                                        int i152 = gh1Var2.O;
                                        if (i152 != 0) {
                                            if (i152 != 3) {
                                                if (i152 == 2) {
                                                    gh1Var2.A0();
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gh1Var2.getParentActivity());
                                                alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                                alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new xg1(gh1Var2, 2));
                                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                                gh1Var2.showDialog(b2Var2);
                                                TextView textView22 = (TextView) b2Var2.d(-1);
                                                if (textView22 != null) {
                                                    textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                                    break;
                                                }
                                            }
                                        } else {
                                            gh1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = gh1Var2.a0;
                                            gh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new zg1(gh1Var2, 1));
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    gh1 gh1Var3 = this.b;
                                    if (gh1Var3.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = gh1Var3.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = gh1Var3.G;
                                        gh1Var3.presentFragment(twoStepVerificationActivity, true);
                                        bc0 bc0Var = gh1Var3.j0;
                                        if (bc0Var != null) {
                                            AndroidUtilities.runOnUIThread(bc0Var);
                                            gh1Var3.j0 = null;
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    this.b.C0();
                                    break;
                                default:
                                    gh1 gh1Var4 = this.b;
                                    int i162 = gh1Var4.O;
                                    gh1Var4.M = true;
                                    if (gh1Var4.n.getTransformationMethod() == null) {
                                        gh1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i162 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                            gh1Var4.f0[3].P(-1);
                                            org.telegram.ui.Components.ij0 animatedDrawable = gh1Var4.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.ij0 ij0Var = gh1Var4.f0[3];
                                            if (animatedDrawable != ij0Var) {
                                                gh1Var4.a.setAnimation(ij0Var);
                                                gh1Var4.f0[3].N(18, false, false);
                                            }
                                            gh1Var4.a.d();
                                        }
                                    } else {
                                        gh1Var4.n.setTransformationMethod(null);
                                        gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i162 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                            gh1Var4.f0[3].P(18);
                                            org.telegram.ui.Components.ij0 animatedDrawable2 = gh1Var4.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.ij0 ij0Var2 = gh1Var4.f0[3];
                                            if (animatedDrawable2 != ij0Var2) {
                                                gh1Var4.a.setAnimation(ij0Var2);
                                            }
                                            gh1Var4.f0[3].T(0.0f, false);
                                            gh1Var4.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = gh1Var4.n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    gh1Var4.M = false;
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = s9Var;
                ci.s6 s6Var = new ci.s6(this, context);
                this.y = s6Var;
                s6Var.setAlpha(0.0f);
                s9Var.addView(this.y);
                s9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false));
                j0Var.addView(this.L, w7.y5.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                f fVar = new f(this, context, 3);
                fVar.setOnTouchListener(new bi.d(2));
                fVar.addView(this.actionBar);
                fVar.addView(this.a);
                fVar.addView(this.c);
                fVar.addView(this.d);
                fVar.addView(this.b);
                this.fragmentView = fVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        switch (i14) {
            case 0:
            case 1:
                if (this.U.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    String string = LocaleController.getString(i14 == 0 ? R.string.CreatePassword : R.string.ReEnterPassword);
                    this.actionBar.setTitle(string);
                    this.c.setText(string);
                }
                if (!TextUtils.isEmpty(this.a0)) {
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
                this.F = i14 == 0;
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                org.telegram.ui.Components.ij0[] ij0VarArr = new org.telegram.ui.Components.ij0[7];
                this.f0 = ij0VarArr;
                ij0VarArr[0] = new org.telegram.ui.Components.ij0(R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[1] = new org.telegram.ui.Components.ij0(R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[2] = new org.telegram.ui.Components.ij0(R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[3] = new org.telegram.ui.Components.ij0(R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[4] = new org.telegram.ui.Components.ij0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[5] = new org.telegram.ui.Components.ij0(R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f0[6] = new org.telegram.ui.Components.ij0(R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.ij0 ij0Var = this.f0[6];
                ij0Var.h = true;
                ij0Var.P(19);
                this.f0[2].S(97, this.i0);
                F0(true);
                if (i14 != 1) {
                    this.n.dispatchTextWatchersTextChanged();
                    i10 = 1;
                    F0(true);
                    break;
                } else {
                    yg1 yg1Var = this.g0;
                    if (yg1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(yg1Var);
                    }
                    this.a.setAnimation(this.f0[6]);
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
                if (!this.Z) {
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
                this.e0.setVisibility(0);
                this.s.setVisibility(8);
                String str = this.U.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str2);
                int indexOf = str2.indexOf(42);
                int lastIndexOf = str2.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.d11 d11Var = new org.telegram.ui.Components.d11();
                    d11Var.a |= 256;
                    d11Var.b = indexOf;
                    int i25 = lastIndexOf + 1;
                    d11Var.c = i25;
                    valueOf.setSpan(new org.telegram.ui.Components.e11(d11Var, 0), indexOf, i25, 0);
                }
                this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf));
                this.d.setVisibility(0);
                this.c0.e(false, false);
                this.w.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i10 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(LocaleController.getString(R.string.VerificationCode));
                this.s.setVisibility(8);
                this.e0.setVisibility(0);
                vh.o oVar2 = this.d;
                int i26 = R.string.EmailPasswordConfirmText2;
                String str3 = this.U.email_unconfirmed_pattern;
                oVar2.setText(LocaleController.formatString("EmailPasswordConfirmText2", i26, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                final int i27 = 2;
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ug1
                    public final /* synthetic */ gh1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i27) {
                            case 0:
                                this.b.C0();
                                break;
                            case 1:
                                gh1 gh1Var = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new xg1(gh1Var, 1));
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetPassword);
                                String string2 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.T = string2;
                                gh1Var.showDialog(b2Var);
                                break;
                            case 2:
                                gh1.V(this.b);
                                break;
                            case 3:
                                gh1 gh1Var2 = this.b;
                                if (gh1Var2.h.getAlpha() >= 0.5f) {
                                    int i152 = gh1Var2.O;
                                    if (i152 != 0) {
                                        if (i152 != 3) {
                                            if (i152 == 2) {
                                                gh1Var2.A0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gh1Var2.getParentActivity());
                                            alertDialog$Builder2.a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new xg1(gh1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                            gh1Var2.showDialog(b2Var2);
                                            TextView textView22 = (TextView) b2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                                break;
                                            }
                                        }
                                    } else {
                                        gh1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = gh1Var2.a0;
                                        gh1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new zg1(gh1Var2, 1));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                gh1 gh1Var3 = this.b;
                                if (gh1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = gh1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = gh1Var3.G;
                                    gh1Var3.presentFragment(twoStepVerificationActivity, true);
                                    bc0 bc0Var = gh1Var3.j0;
                                    if (bc0Var != null) {
                                        AndroidUtilities.runOnUIThread(bc0Var);
                                        gh1Var3.j0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.b.C0();
                                break;
                            default:
                                gh1 gh1Var4 = this.b;
                                int i162 = gh1Var4.O;
                                gh1Var4.M = true;
                                if (gh1Var4.n.getTransformationMethod() == null) {
                                    gh1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                        gh1Var4.f0[3].P(-1);
                                        org.telegram.ui.Components.ij0 animatedDrawable = gh1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ij0 ij0Var2 = gh1Var4.f0[3];
                                        if (animatedDrawable != ij0Var2) {
                                            gh1Var4.a.setAnimation(ij0Var2);
                                            gh1Var4.f0[3].N(18, false, false);
                                        }
                                        gh1Var4.a.d();
                                    }
                                } else {
                                    gh1Var4.n.setTransformationMethod(null);
                                    gh1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i162 == 0 && gh1Var4.n.length() > 0 && gh1Var4.n.hasFocus()) {
                                        gh1Var4.f0[3].P(18);
                                        org.telegram.ui.Components.ij0 animatedDrawable2 = gh1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ij0 ij0Var22 = gh1Var4.f0[3];
                                        if (animatedDrawable2 != ij0Var22) {
                                            gh1Var4.a.setAnimation(ij0Var22);
                                        }
                                        gh1Var4.f0[3].T(0.0f, false);
                                        gh1Var4.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = gh1Var4.n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                gh1Var4.M = false;
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
                if (this.Y) {
                    this.b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.H) {
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
                this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.o6, false));
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
            editTextBoldCursor4.addTextChangedListener(new dh1(this, i10));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
            if (n2Var != this && (n2Var instanceof gh1)) {
                ((org.telegram.ui.Components.g71) ((gh1) n2Var).b0.b).b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean hideKeyboardOnShow() {
        int i10 = this.O;
        return i10 == 7 || i10 == 9;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.G < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (this.G < 0 || this.parentLayout.getFragmentStack().size() != 1) {
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a != null) {
            int i10 = this.O;
            if (i10 == 2 && AndroidUtilities.isSmallScreen()) {
                this.a.setVisibility(8);
            } else if (i10 != 6 && i10 != 9 && i10 != 7) {
                org.telegram.ui.Components.lj0 lj0Var = this.a;
                Point point = AndroidUtilities.displaySize;
                lj0Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        org.telegram.ui.Components.ur urVar = this.e0;
        if (urVar != null) {
            urVar.setVisibility(v0() ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        yg1 yg1Var = this.g0;
        if (yg1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            this.g0 = null;
        }
        if (this.f0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.ij0[] ij0VarArr = this.f0;
                if (i10 >= ij0VarArr.length) {
                    break;
                }
                ij0VarArr[i10].C(false);
                i10++;
            }
            this.f0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        this.S = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        this.S = false;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new yg1(this, 0), 200L);
            }
            ee0 ee0Var = this.w;
            if (ee0Var == null || ee0Var.getVisibility() != 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new yg1(this, 1), 200L);
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            ee0 ee0Var = this.w;
            gs[] gsVarArr = ee0Var.f;
            if (i10 >= gsVarArr.length) {
                ee0Var.postDelayed(new x81(17, this, runnable), (gsVarArr.length * 75) + 350);
                return;
            } else {
                gs gsVar = gsVarArr[i10];
                gsVar.postDelayed(new pl0(gsVar, 1), i10 * 75);
                i10++;
            }
        }
    }

    public final boolean v0() {
        int i10 = this.O;
        if ((i10 != 5 && i10 != 4) || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final void w0() {
        this.c0.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.c0.f(true, true);
    }

    public final void y0() {
        for (gs gsVar : this.w.f) {
            gsVar.setText("");
            gsVar.i(1.0f);
        }
        this.w.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.w, 8.0f, new yg1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.id0 id0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(id0Var, 5.0f);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle i10 = a4.a.i("afterSignup", true);
            fh0 fh0Var = new fh0();
            fh0Var.l0(i10);
            presentFragment(fh0Var, true);
            return;
        }
        super.finishFragment();
    }

    public gh1(int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.h0 = new yg1(this, 2);
        this.i0 = new yg1(this, 3);
        this.O = i10;
        this.U = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new zg1(this, 0), 10);
        } else {
            this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }

    public void B0() {
    }
}
