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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ag1 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.ActionBar.l0 A;
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
    public org.telegram.ui.Cells.e3 X;
    public org.telegram.ui.Components.j10 Y;
    public org.telegram.ui.Components.j21 Z;
    public org.telegram.ui.Components.pi0 a;
    public org.telegram.ui.Components.kr a0;
    public TextView b;
    public org.telegram.ui.Components.mi0[] b0;
    public TextView c;
    public sf1 c0;
    public dh.u d;
    public final Runnable d0;
    public TextView e;
    public final Runnable e0;
    public TextView f;
    public fb0 f0;
    public TextView h;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public org.telegram.ui.Components.fc0 s;
    public org.telegram.ui.Components.fc0 v;
    public ld0 w;
    public zf1 x;
    public kh.h6 y;

    public ag1(int i9, int i10, TL_account.Password password) {
        super(null);
        this.B = false;
        this.C = -1;
        this.F = new ArrayList();
        this.R = new byte[0];
        this.d0 = new sf1(this, 2);
        this.e0 = new sf1(this, 3);
        this.currentAccount = i9;
        this.K = i10;
        this.Q = password;
        this.P = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.Q == null) {
            if (i10 == 6 || i10 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new tf1(this, 0), 10);
            }
        }
    }

    public static void T(ag1 ag1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = ag1Var.Q;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.startCheck(ag1Var.R, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z10 || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = ag1Var.Q.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
                bArr2 = stringBytes;
            } else {
                bArr2 = stringBytes;
                bArr = null;
            }
        }
        eh.g gVar = new eh.g(ag1Var, bArr, str, passwordinputsettings, z10, 4);
        if (z10) {
            ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(tLObject, gVar, 10);
            return;
        }
        if (str != null && (bArr3 = ag1Var.T) != null && bArr3.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = ag1Var.Q.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr4 = new byte[32];
                System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                byte[] bArr5 = new byte[16];
                System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(ag1Var.T, 0, bArr6, 0, 32);
                Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr6;
                tL_secureSecretSettings.secure_secret_id = ag1Var.S;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = ag1Var.Q.new_algo;
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
        ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(tLObject, gVar, 10);
    }

    public static void U(ag1 ag1Var) {
        ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ih.q5(5));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        ag1Var.showDialog(alertDialog$Builder.a);
    }

    public static void V(ag1 ag1Var, byte[] bArr) {
        ArrayList arrayList = ag1Var.F;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i9)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = ag1Var.Q;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = ag1Var.Q;
        if (bArr == null) {
            bArr = ag1Var.R;
        }
        twoStepVerificationActivity.u0(password2, bArr, ag1Var.S, ag1Var.T);
        twoStepVerificationActivity.T = ag1Var.C;
        ag1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
        fb0 fb0Var = ag1Var.f0;
        if (fb0Var != null) {
            AndroidUtilities.runOnUIThread(fb0Var);
            ag1Var.f0 = null;
        }
    }

    public static void W(ag1 ag1Var) {
        ArrayList arrayList = ag1Var.F;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i9)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(ag1Var.currentAccount);
        int i10 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = ag1Var.R;
        TL_account.Password password = ag1Var.Q;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, bArr, password.new_algo, password.new_secure_algo, password.secure_random, ag1Var.N, ag1Var.M, null, ag1Var.L);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = ag1Var.Q;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.u0(password2, ag1Var.R, ag1Var.S, ag1Var.T);
        twoStepVerificationActivity.T = ag1Var.C;
        ag1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
        fb0 fb0Var = ag1Var.f0;
        if (fb0Var != null) {
            AndroidUtilities.runOnUIThread(fb0Var);
            ag1Var.f0 = null;
        }
    }

    public static /* synthetic */ void X(ag1 ag1Var, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = ag1Var.Q.current_algo;
        byte[] x10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        o71 o71Var = new o71(6, ag1Var, x10);
        TL_account.Password password = ag1Var.Q;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            o71Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(getpasswordsettings, o71Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        o71Var.run(null, tL_error2);
    }

    public static void Y(ag1 ag1Var, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(new TL_account.getPassword(), new tf1(ag1Var, 4), 8);
            return;
        }
        ag1Var.v0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            ag1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            ag1Var.d.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
            ag1Var.y0(ag1Var.s, ag1Var.n, true);
            ag1Var.G0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            ag1Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            ag1Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
        }
    }

    public static /* synthetic */ void Z(ag1 ag1Var) {
        ArrayList arrayList = ag1Var.F;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i9)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        ag1Var.finishFragment();
    }

    public static /* synthetic */ void a0(ag1 ag1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            ag1Var.Q = password;
            if (!TwoStepVerificationActivity.h0(password, false)) {
                org.telegram.ui.Components.y4.x0(ag1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            ag1Var.P = !TextUtils.isEmpty(ag1Var.Q.email_unconfirmed_pattern);
            TwoStepVerificationActivity.l0(ag1Var.Q);
            if (!ag1Var.O && ag1Var.U) {
                TL_account.Password password2 = ag1Var.Q;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!ag1Var.P && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        ag1Var.finishFragment();
                    }
                }
            }
            if (ag1Var.J) {
                ag1Var.v0();
                ag1Var.B0();
            }
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
        }
    }

    public static /* synthetic */ void b0(ag1 ag1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            ag1Var.Q = password;
            TwoStepVerificationActivity.l0(password);
            ag1Var.D0(z10);
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
        }
    }

    public static void c0(ag1 ag1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        ArrayList arrayList = ag1Var.F;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(ag1Var.currentAccount).sendRequest(new TL_account.getPassword(), new kh.o3(12, ag1Var, z10), 8);
            return;
        }
        ag1Var.v0();
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        ag1Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        ag1Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        ag1Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        return;
                    }
                }
                NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((org.telegram.ui.ActionBar.o2) arrayList.get(i9)).removeSelfFromStack();
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(ag1Var.currentAccount);
                int i10 = NotificationCenter.twoStepPasswordChanged;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                TL_account.Password password2 = ag1Var.Q;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                byte[] bArr2 = password2.secure_random;
                String str2 = ag1Var.N;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, ag1Var.M, str2, ag1Var.L);
                TL_account.Password password3 = ag1Var.Q;
                password3.email_unconfirmed_pattern = ag1Var.N;
                ag1 ag1Var2 = new ag1(5, password3);
                ag1Var2.D = ag1Var.D;
                ag1Var2.C0(bArr != null ? bArr : ag1Var.R, ag1Var.S, ag1Var.T, ag1Var.V);
                ag1Var2.U = ag1Var.U;
                ag1Var2.C = ag1Var.C;
                ag1Var.presentFragment(ag1Var2, true);
                return;
            }
            return;
        }
        ag1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        if (z10) {
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((org.telegram.ui.ActionBar.o2) arrayList.get(i11)).removeSelfFromStack();
            }
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            ag1Var.finishFragment();
            return;
        }
        if (ag1Var.getParentActivity() == null) {
            return;
        }
        if (ag1Var.Q.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(27, ag1Var, bArr));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            if (str == null && (password = ag1Var.Q) != null && password.has_password) {
                c2Var.P = LocaleController.getString(R.string.YourEmailSuccessText);
            } else {
                c2Var.P = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
            }
            c2Var.N = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = ag1Var.showDialog(c2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i12)).removeSelfFromStack();
        }
        TL_account.Password password4 = ag1Var.Q;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (ag1Var.U) {
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        }
        ag1 ag1Var3 = new ag1(7, ag1Var.Q);
        ag1Var3.D = ag1Var.D;
        ag1Var3.C0(bArr != null ? bArr : ag1Var.R, ag1Var.S, ag1Var.T, ag1Var.V);
        ag1Var3.U = ag1Var.U;
        ag1Var3.C = ag1Var.C;
        ag1Var.presentFragment(ag1Var3, true);
        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
    }

    public static void d0(ag1 ag1Var, TLRPC.TL_error tL_error) {
        ag1Var.v0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = ag1Var.Q;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.u0(password, ag1Var.R, ag1Var.S, ag1Var.T);
            twoStepVerificationActivity.T = ag1Var.C;
            ag1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            fb0 fb0Var = ag1Var.f0;
            if (fb0Var != null) {
                AndroidUtilities.runOnUIThread(fb0Var);
                ag1Var.f0 = null;
            }
        }
    }

    public static void e0(ag1 ag1Var) {
        ArrayList arrayList = ag1Var.F;
        int i9 = 4;
        if (ag1Var.Q.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rf1(ag1Var, i9));
            boolean z10 = ag1Var.Q.has_recovery;
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            if (z10) {
                c2Var.P = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                c2Var.P = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            c2Var.N = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = ag1Var.showDialog(c2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.o2) arrayList.get(i10)).removeSelfFromStack();
        }
        TL_account.Password password = ag1Var.Q;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        ag1 ag1Var2 = new ag1(7, password);
        ag1Var2.D = ag1Var.D;
        ag1Var2.C0(ag1Var.R, ag1Var.S, ag1Var.T, ag1Var.V);
        ag1Var2.F.addAll(arrayList);
        ag1Var2.U = ag1Var.U;
        ag1Var2.C = ag1Var.C;
        ag1Var.presentFragment(ag1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(ag1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = ag1Var.R;
        TL_account.Password password2 = ag1Var.Q;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, ag1Var.N, ag1Var.M, null, ag1Var.L);
        NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
    }

    public static void f0(ag1 ag1Var, String str) {
        ag1 ag1Var2 = new ag1(ag1Var.currentAccount, 0, ag1Var.Q);
        ag1Var2.D = ag1Var.D;
        ag1Var2.F.addAll(ag1Var.F);
        ag1Var2.F.add(ag1Var);
        ag1Var2.W = str;
        ag1Var2.C = ag1Var.C;
        ag1Var.presentFragment(ag1Var2, true);
    }

    public static /* synthetic */ void g0(ag1 ag1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            ag1Var.Q = password;
            TwoStepVerificationActivity.l0(password);
            NotificationCenter.getInstance(ag1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, ag1Var.Q);
            ag1Var.B0();
        }
    }

    public final void B0() {
        if (getParentActivity() == null) {
            return;
        }
        switch (this.K) {
            case 0:
            case 1:
                if (this.n.length() == 0) {
                    y0(this.s, this.n, false);
                    break;
                } else if (this.n.getText().toString().equals(this.L) || this.K != 1) {
                    ag1 ag1Var = new ag1(this.currentAccount, this.K != 0 ? 2 : 1, this.Q);
                    ag1Var.D = this.D;
                    ag1Var.L = this.n.getText().toString();
                    ag1Var.C0(this.R, this.S, this.T, this.V);
                    ag1Var.W = this.W;
                    ag1Var.F.addAll(this.F);
                    ag1Var.F.add(this);
                    ag1Var.U = this.U;
                    ag1Var.C = this.C;
                    presentFragment(ag1Var);
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
                    z0();
                    break;
                } else {
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    y0(this.s, this.n, false);
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
                        D0(false);
                        break;
                    }
                }
                y0(this.s, this.n, false);
                break;
            case 4:
                String code = this.w.getCode();
                TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                tL_auth_checkRecoveryPassword.code = code;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new o71(5, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.w.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new tf1(this, 2), 10);
                w0();
                break;
            case 6:
                TL_account.Password password = this.Q;
                if (password != null) {
                    ag1 ag1Var2 = new ag1(this.currentAccount, 0, password);
                    ag1Var2.D = this.D;
                    ag1Var2.U = this.U;
                    ag1Var2.C = this.C;
                    presentFragment(ag1Var2, true);
                    break;
                } else {
                    w0();
                    this.J = true;
                    break;
                }
            case 7:
                if (!this.U) {
                    if (!this.D) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.u0(this.Q, this.R, this.S, this.T);
                        twoStepVerificationActivity.T = this.C;
                        presentFragment(twoStepVerificationActivity, true);
                        fb0 fb0Var = this.f0;
                        if (fb0Var != null) {
                            AndroidUtilities.runOnUIThread(fb0Var);
                            this.f0 = null;
                            break;
                        }
                    } else {
                        Bundle i9 = aa.d.i("afterSignup", true);
                        ng0 ng0Var = new ng0();
                        ng0Var.k0(i9);
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
                        w0();
                        Utilities.globalQueue.postRunnable(new uf1(this, stringBytes, 0));
                        break;
                    } else {
                        y0(this.s, this.n, false);
                        break;
                    }
                } else {
                    w0();
                    this.J = true;
                    break;
                }
            case 9:
                finishFragment();
                break;
        }
    }

    public final void C0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.R = bArr;
        this.T = bArr2;
        this.S = j10;
        this.V = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.P && this.Q.has_password) {
            w0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new tf1(this, 3));
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
        w0();
        Utilities.globalQueue.postRunnable(new bg.m(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.h0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(boolean z10) {
        if (this.K != 0) {
            return;
        }
        sf1 sf1Var = this.c0;
        if (sf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sf1Var);
        }
        org.telegram.ui.Components.mi0 animatedDrawable = this.a.getAnimatedDrawable();
        if (!z10) {
            org.telegram.ui.Components.mi0[] mi0VarArr = this.b0;
            if (animatedDrawable != mi0VarArr[0]) {
                if (animatedDrawable != mi0VarArr[1]) {
                    if (this.n.length() == 0) {
                        if (animatedDrawable != null) {
                        }
                    }
                    sf1 sf1Var2 = new sf1(this, 4);
                    this.c0 = sf1Var2;
                    AndroidUtilities.runOnUIThread(sf1Var2, Utilities.random.nextInt(2000) + 5000);
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
        sf1 sf1Var22 = new sf1(this, 4);
        this.c0 = sf1Var22;
        AndroidUtilities.runOnUIThread(sf1Var22, Utilities.random.nextInt(2000) + 5000);
    }

    public final void F0(String str, String str2) {
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

    public final void G0(boolean z10) {
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
        this.E.addListener(new n60(11, this, z10));
        this.E.setDuration(150L);
        this.E.start();
    }

    public final void H0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.a.P = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.C, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new rf1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i9;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i11, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new yf1(this));
        final int i12 = 1;
        int i13 = this.K;
        if (i13 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
        this.Y = j10Var;
        this.X = new org.telegram.ui.Cells.e3(j10Var);
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of1
            public final /* synthetic */ ag1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.B0();
                        break;
                    case 1:
                        ag1 ag1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.P = string;
                        ag1Var.showDialog(c2Var);
                        break;
                    case 2:
                        ag1.U(this.b);
                        break;
                    case 3:
                        ag1 ag1Var2 = this.b;
                        if (ag1Var2.h.getAlpha() >= 0.5f) {
                            int i14 = ag1Var2.K;
                            if (i14 != 0) {
                                if (i14 != 3) {
                                    if (i14 == 2) {
                                        ag1Var2.z0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                    ag1Var2.showDialog(c2Var2);
                                    TextView textView = (TextView) c2Var2.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                ag1Var2.w0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ag1Var2.W;
                                ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        ag1 ag1Var3 = this.b;
                        if (ag1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = ag1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = ag1Var3.C;
                            ag1Var3.presentFragment(twoStepVerificationActivity, true);
                            fb0 fb0Var = ag1Var3.f0;
                            if (fb0Var != null) {
                                AndroidUtilities.runOnUIThread(fb0Var);
                                ag1Var3.f0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.B0();
                        break;
                    default:
                        ag1 ag1Var4 = this.b;
                        int i15 = ag1Var4.K;
                        ag1Var4.I = true;
                        if (ag1Var4.n.getTransformationMethod() == null) {
                            ag1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i15 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                ag1Var4.b0[3].N(-1);
                                org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var = ag1Var4.b0[3];
                                if (animatedDrawable != mi0Var) {
                                    ag1Var4.a.setAnimation(mi0Var);
                                    ag1Var4.b0[3].L(18, false, false);
                                }
                                ag1Var4.a.d();
                            }
                        } else {
                            ag1Var4.n.setTransformationMethod(null);
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i15 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                ag1Var4.b0[3].N(18);
                                org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.b0[3];
                                if (animatedDrawable2 != mi0Var2) {
                                    ag1Var4.a.setAnimation(mi0Var2);
                                }
                                ag1Var4.b0[3].Q(0.0f, false);
                                ag1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ag1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ag1Var4.I = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.j21 j21Var = new org.telegram.ui.Components.j21(context);
        this.Z = j21Var;
        j21Var.setTransformType(1);
        this.Z.setProgress(0.0f);
        this.Z.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.O9, false));
        this.Z.setDrawBackground(false);
        this.Y.setContentDescription(LocaleController.getString(R.string.Next));
        this.Y.addView(this.Z, g7.e6.e(56, 56, 17));
        this.Y.a(this.Z);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        org.telegram.ui.Cells.e3.s2(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        final int i14 = 3;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of1
            public final /* synthetic */ ag1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.B0();
                        break;
                    case 1:
                        ag1 ag1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.P = string;
                        ag1Var.showDialog(c2Var);
                        break;
                    case 2:
                        ag1.U(this.b);
                        break;
                    case 3:
                        ag1 ag1Var2 = this.b;
                        if (ag1Var2.h.getAlpha() >= 0.5f) {
                            int i142 = ag1Var2.K;
                            if (i142 != 0) {
                                if (i142 != 3) {
                                    if (i142 == 2) {
                                        ag1Var2.z0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                    ag1Var2.showDialog(c2Var2);
                                    TextView textView2 = (TextView) c2Var2.d(-1);
                                    if (textView2 != null) {
                                        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                ag1Var2.w0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ag1Var2.W;
                                ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        ag1 ag1Var3 = this.b;
                        if (ag1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = ag1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = ag1Var3.C;
                            ag1Var3.presentFragment(twoStepVerificationActivity, true);
                            fb0 fb0Var = ag1Var3.f0;
                            if (fb0Var != null) {
                                AndroidUtilities.runOnUIThread(fb0Var);
                                ag1Var3.f0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.B0();
                        break;
                    default:
                        ag1 ag1Var4 = this.b;
                        int i15 = ag1Var4.K;
                        ag1Var4.I = true;
                        if (ag1Var4.n.getTransformationMethod() == null) {
                            ag1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i15 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                ag1Var4.b0[3].N(-1);
                                org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var = ag1Var4.b0[3];
                                if (animatedDrawable != mi0Var) {
                                    ag1Var4.a.setAnimation(mi0Var);
                                    ag1Var4.b0[3].L(18, false, false);
                                }
                                ag1Var4.a.d();
                            }
                        } else {
                            ag1Var4.n.setTransformationMethod(null);
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i15 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                ag1Var4.b0[3].N(18);
                                org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.b0[3];
                                if (animatedDrawable2 != mi0Var2) {
                                    ag1Var4.a.setAnimation(mi0Var2);
                                }
                                ag1Var4.b0[3].Q(0.0f, false);
                                ag1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ag1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ag1Var4.I = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.a = pi0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        pi0Var.setScaleType(scaleType);
        if (i13 == 2 && AndroidUtilities.isSmallScreen()) {
            this.a.setVisibility(8);
        } else if (i13 != 6 && i13 != 9 && i13 != 7) {
            org.telegram.ui.Components.pi0 pi0Var2 = this.a;
            Point point = AndroidUtilities.displaySize;
            pi0Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.c.setGravity(1);
        this.c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        dh.u uVar = new dh.u(context);
        this.d = uVar;
        int i15 = org.telegram.ui.ActionBar.f6.D6;
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setVisibility(8);
        final int i16 = 4;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of1
            public final /* synthetic */ ag1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.B0();
                        break;
                    case 1:
                        ag1 ag1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.P = string;
                        ag1Var.showDialog(c2Var);
                        break;
                    case 2:
                        ag1.U(this.b);
                        break;
                    case 3:
                        ag1 ag1Var2 = this.b;
                        if (ag1Var2.h.getAlpha() >= 0.5f) {
                            int i142 = ag1Var2.K;
                            if (i142 != 0) {
                                if (i142 != 3) {
                                    if (i142 == 2) {
                                        ag1Var2.z0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                    ag1Var2.showDialog(c2Var2);
                                    TextView textView22 = (TextView) c2Var2.d(-1);
                                    if (textView22 != null) {
                                        textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                ag1Var2.w0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ag1Var2.W;
                                ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        ag1 ag1Var3 = this.b;
                        if (ag1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = ag1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = ag1Var3.C;
                            ag1Var3.presentFragment(twoStepVerificationActivity, true);
                            fb0 fb0Var = ag1Var3.f0;
                            if (fb0Var != null) {
                                AndroidUtilities.runOnUIThread(fb0Var);
                                ag1Var3.f0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.B0();
                        break;
                    default:
                        ag1 ag1Var4 = this.b;
                        int i152 = ag1Var4.K;
                        ag1Var4.I = true;
                        if (ag1Var4.n.getTransformationMethod() == null) {
                            ag1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i152 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                ag1Var4.b0[3].N(-1);
                                org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var = ag1Var4.b0[3];
                                if (animatedDrawable != mi0Var) {
                                    ag1Var4.a.setAnimation(mi0Var);
                                    ag1Var4.b0[3].L(18, false, false);
                                }
                                ag1Var4.a.d();
                            }
                        } else {
                            ag1Var4.n.setTransformationMethod(null);
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i152 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                ag1Var4.b0[3].N(18);
                                org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.b0[3];
                                if (animatedDrawable2 != mi0Var2) {
                                    ag1Var4.a.setAnimation(mi0Var2);
                                }
                                ag1Var4.b0[3].Q(0.0f, false);
                                ag1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ag1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ag1Var4.I = false;
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.b.setGravity(17);
        this.b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(AndroidUtilities.bold());
        this.b.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.f6.Oh));
        final int i17 = 5;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of1
            public final /* synthetic */ ag1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.B0();
                        break;
                    case 1:
                        ag1 ag1Var = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.P = string;
                        ag1Var.showDialog(c2Var);
                        break;
                    case 2:
                        ag1.U(this.b);
                        break;
                    case 3:
                        ag1 ag1Var2 = this.b;
                        if (ag1Var2.h.getAlpha() >= 0.5f) {
                            int i142 = ag1Var2.K;
                            if (i142 != 0) {
                                if (i142 != 3) {
                                    if (i142 == 2) {
                                        ag1Var2.z0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                    ag1Var2.showDialog(c2Var2);
                                    TextView textView22 = (TextView) c2Var2.d(-1);
                                    if (textView22 != null) {
                                        textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                        break;
                                    }
                                }
                            } else {
                                ag1Var2.w0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = ag1Var2.W;
                                ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                break;
                            }
                        }
                        break;
                    case 4:
                        ag1 ag1Var3 = this.b;
                        if (ag1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = ag1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = ag1Var3.C;
                            ag1Var3.presentFragment(twoStepVerificationActivity, true);
                            fb0 fb0Var = ag1Var3.f0;
                            if (fb0Var != null) {
                                AndroidUtilities.runOnUIThread(fb0Var);
                                ag1Var3.f0 = null;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.b.B0();
                        break;
                    default:
                        ag1 ag1Var4 = this.b;
                        int i152 = ag1Var4.K;
                        ag1Var4.I = true;
                        if (ag1Var4.n.getTransformationMethod() == null) {
                            ag1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i152 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                ag1Var4.b0[3].N(-1);
                                org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var = ag1Var4.b0[3];
                                if (animatedDrawable != mi0Var) {
                                    ag1Var4.a.setAnimation(mi0Var);
                                    ag1Var4.b0[3].L(18, false, false);
                                }
                                ag1Var4.a.d();
                            }
                        } else {
                            ag1Var4.n.setTransformationMethod(null);
                            ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i152 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                ag1Var4.b0[3].N(18);
                                org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.a.getAnimatedDrawable();
                                org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.b0[3];
                                if (animatedDrawable2 != mi0Var2) {
                                    ag1Var4.a.setAnimation(mi0Var2);
                                }
                                ag1Var4.b0[3].Q(0.0f, false);
                                ag1Var4.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = ag1Var4.n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        ag1Var4.I = false;
                        break;
                }
            }
        });
        if (i13 == 6 || i13 == 7 || i13 == 9) {
            this.c.setTypeface(Typeface.DEFAULT);
            this.c.setTextSize(1, 24.0f);
        } else {
            this.c.setTypeface(AndroidUtilities.bold());
            this.c.setTextSize(1, 18.0f);
        }
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                m0 m0Var = new m0(this, context, 26);
                org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(this, context, m0Var, 2);
                e90Var.addView(m0Var);
                p9 p9Var = new p9(this, context, e90Var);
                zf1 zf1Var = new zf1(this, context);
                this.x = zf1Var;
                zf1Var.setVerticalScrollBarEnabled(false);
                m0Var.addView(this.x, g7.e6.c(-1.0f, -1));
                m0Var.addView(this.h, g7.e6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                m0Var.addView(this.Y, org.telegram.ui.Components.j10.b());
                p9Var.addView(e90Var, g7.e6.c(-1.0f, -1));
                ta1 ta1Var = new ta1(this, context, 16);
                ta1Var.setOrientation(1);
                this.x.addView(ta1Var, g7.e6.x(-1, -1, 51));
                ta1Var.addView(this.a, g7.e6.t(-2, -2, 49, 0, 69, 0, 0));
                ta1Var.addView(this.c, g7.e6.t(-2, -2, 49, 0, 8, 0, 0));
                ta1Var.addView(this.d, g7.e6.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, null);
                this.s = fc0Var;
                fc0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i18 = org.telegram.ui.ActionBar.f6.l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
                this.n.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.pf1
                    public final /* synthetic */ ag1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (i12) {
                            case 0:
                                ag1 ag1Var = this.b;
                                ag1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                ag1Var.B0();
                                return true;
                            default:
                                ag1 ag1Var2 = this.b;
                                ag1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (ag1Var2.v.getVisibility() == 0) {
                                    ag1Var2.r.requestFocus();
                                } else {
                                    ag1Var2.B0();
                                }
                                return true;
                        }
                    }
                });
                this.s.e(this.n);
                final int i19 = 2;
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.qf1
                    public final /* synthetic */ ag1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.Components.fc0 fc0Var2 = this.b.v;
                                float f10 = z10 ? 1.0f : 0.0f;
                                fc0Var2.b(f10, f10, true);
                                break;
                            case 1:
                                ag1 ag1Var = this.b;
                                if (!z10) {
                                    ag1Var.getClass();
                                    break;
                                } else {
                                    ag1Var.a0.setEditText((EditText) view);
                                    ag1Var.a0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.fc0 fc0Var3 = this.b.s;
                                float f11 = z10 ? 1.0f : 0.0f;
                                fc0Var3.b(f11, f11, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, g7.e6.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, context, 3);
                this.A = l0Var;
                l0Var.setImageResource(R.drawable.msg_message);
                this.A.setScaleType(scaleType);
                this.A.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.A.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 1, -1));
                this.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.A, false, 0.1f, false);
                final int i20 = 6;
                this.A.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of1
                    public final /* synthetic */ ag1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                this.b.B0();
                                break;
                            case 1:
                                ag1 ag1Var = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.P = string;
                                ag1Var.showDialog(c2Var);
                                break;
                            case 2:
                                ag1.U(this.b);
                                break;
                            case 3:
                                ag1 ag1Var2 = this.b;
                                if (ag1Var2.h.getAlpha() >= 0.5f) {
                                    int i142 = ag1Var2.K;
                                    if (i142 != 0) {
                                        if (i142 != 3) {
                                            if (i142 == 2) {
                                                ag1Var2.z0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                            alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                            ag1Var2.showDialog(c2Var2);
                                            TextView textView22 = (TextView) c2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                                break;
                                            }
                                        }
                                    } else {
                                        ag1Var2.w0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = ag1Var2.W;
                                        ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                ag1 ag1Var3 = this.b;
                                if (ag1Var3.K == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.S = true;
                                    twoStepVerificationActivity.E = ag1Var3.Q;
                                    twoStepVerificationActivity.F = false;
                                    twoStepVerificationActivity.T = ag1Var3.C;
                                    ag1Var3.presentFragment(twoStepVerificationActivity, true);
                                    fb0 fb0Var = ag1Var3.f0;
                                    if (fb0Var != null) {
                                        AndroidUtilities.runOnUIThread(fb0Var);
                                        ag1Var3.f0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.b.B0();
                                break;
                            default:
                                ag1 ag1Var4 = this.b;
                                int i152 = ag1Var4.K;
                                ag1Var4.I = true;
                                if (ag1Var4.n.getTransformationMethod() == null) {
                                    ag1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i152 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                        ag1Var4.b0[3].N(-1);
                                        org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mi0 mi0Var = ag1Var4.b0[3];
                                        if (animatedDrawable != mi0Var) {
                                            ag1Var4.a.setAnimation(mi0Var);
                                            ag1Var4.b0[3].L(18, false, false);
                                        }
                                        ag1Var4.a.d();
                                    }
                                } else {
                                    ag1Var4.n.setTransformationMethod(null);
                                    ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i152 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                        ag1Var4.b0[3].N(18);
                                        org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.b0[3];
                                        if (animatedDrawable2 != mi0Var2) {
                                            ag1Var4.a.setAnimation(mi0Var2);
                                        }
                                        ag1Var4.b0[3].Q(0.0f, false);
                                        ag1Var4.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = ag1Var4.n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                ag1Var4.I = false;
                                break;
                        }
                    }
                });
                linearLayout.addView(this.A, g7.e6.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new xf1(this, 2));
                this.s.addView(linearLayout, g7.e6.c(-2.0f, -1));
                ta1Var.addView(this.s, g7.e6.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.fc0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.r.setPadding(dp2, dp2, dp2, dp2);
                this.r.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
                this.r.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.pf1
                    public final /* synthetic */ ag1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i192, KeyEvent keyEvent) {
                        switch (i10) {
                            case 0:
                                ag1 ag1Var = this.b;
                                ag1Var.getClass();
                                if (i192 != 5 && i192 != 6) {
                                    return false;
                                }
                                ag1Var.B0();
                                return true;
                            default:
                                ag1 ag1Var2 = this.b;
                                ag1Var2.getClass();
                                if (i192 != 5 && i192 != 6) {
                                    return false;
                                }
                                if (ag1Var2.v.getVisibility() == 0) {
                                    ag1Var2.r.requestFocus();
                                } else {
                                    ag1Var2.B0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.qf1
                    public final /* synthetic */ ag1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i10) {
                            case 0:
                                org.telegram.ui.Components.fc0 fc0Var2 = this.b.v;
                                float f10 = z10 ? 1.0f : 0.0f;
                                fc0Var2.b(f10, f10, true);
                                break;
                            case 1:
                                ag1 ag1Var = this.b;
                                if (!z10) {
                                    ag1Var.getClass();
                                    break;
                                } else {
                                    ag1Var.a0.setEditText((EditText) view);
                                    ag1Var.a0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                            default:
                                org.telegram.ui.Components.fc0 fc0Var3 = this.b.s;
                                float f11 = z10 ? 1.0f : 0.0f;
                                fc0Var3.b(f11, f11, true);
                                break;
                        }
                    }
                });
                this.v.addView(this.r, g7.e6.c(-2.0f, -1));
                ta1Var.addView(this.v, g7.e6.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.kr krVar = new org.telegram.ui.Components.kr(context);
                this.a0 = krVar;
                krVar.setVisibility(8);
                e90Var.addView(this.a0);
                ld0 ld0Var = new ld0(this, context, 3);
                this.w = ld0Var;
                final int i21 = 1;
                ld0Var.b(6, 1);
                vr[] vrVarArr = this.w.f;
                int length = vrVarArr.length;
                int i22 = 0;
                while (i22 < length) {
                    vr vrVar = vrVarArr[i22];
                    vrVar.setShowSoftInputOnFocusCompat((u0() ? 1 : 0) ^ i21);
                    vrVar.addTextChangedListener(new xf1(this, i10));
                    vrVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.qf1
                        public final /* synthetic */ ag1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z10) {
                            switch (i21) {
                                case 0:
                                    org.telegram.ui.Components.fc0 fc0Var2 = this.b.v;
                                    float f10 = z10 ? 1.0f : 0.0f;
                                    fc0Var2.b(f10, f10, true);
                                    break;
                                case 1:
                                    ag1 ag1Var = this.b;
                                    if (!z10) {
                                        ag1Var.getClass();
                                        break;
                                    } else {
                                        ag1Var.a0.setEditText((EditText) view);
                                        ag1Var.a0.setDispatchBackWhenEmpty(true);
                                        break;
                                    }
                                default:
                                    org.telegram.ui.Components.fc0 fc0Var3 = this.b.s;
                                    float f11 = z10 ? 1.0f : 0.0f;
                                    fc0Var3.b(f11, f11, true);
                                    break;
                            }
                        }
                    });
                    i22++;
                    i21 = 1;
                }
                this.w.setVisibility(8);
                ta1Var.addView(this.w, g7.e6.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                ta1Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, g7.e6.e(-2, -2, 49));
                if (i13 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    ta1Var.addView(this.f, g7.e6.t(-2, -2, 49, 0, 0, 0, 25));
                    final int i23 = 1;
                    this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of1
                        public final /* synthetic */ ag1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    this.b.B0();
                                    break;
                                case 1:
                                    ag1 ag1Var = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                    c2Var.P = string;
                                    ag1Var.showDialog(c2Var);
                                    break;
                                case 2:
                                    ag1.U(this.b);
                                    break;
                                case 3:
                                    ag1 ag1Var2 = this.b;
                                    if (ag1Var2.h.getAlpha() >= 0.5f) {
                                        int i142 = ag1Var2.K;
                                        if (i142 != 0) {
                                            if (i142 != 3) {
                                                if (i142 == 2) {
                                                    ag1Var2.z0();
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                                alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                                alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                                ag1Var2.showDialog(c2Var2);
                                                TextView textView22 = (TextView) c2Var2.d(-1);
                                                if (textView22 != null) {
                                                    textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                                    break;
                                                }
                                            }
                                        } else {
                                            ag1Var2.w0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = ag1Var2.W;
                                            ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    ag1 ag1Var3 = this.b;
                                    if (ag1Var3.K == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.S = true;
                                        twoStepVerificationActivity.E = ag1Var3.Q;
                                        twoStepVerificationActivity.F = false;
                                        twoStepVerificationActivity.T = ag1Var3.C;
                                        ag1Var3.presentFragment(twoStepVerificationActivity, true);
                                        fb0 fb0Var = ag1Var3.f0;
                                        if (fb0Var != null) {
                                            AndroidUtilities.runOnUIThread(fb0Var);
                                            ag1Var3.f0 = null;
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    this.b.B0();
                                    break;
                                default:
                                    ag1 ag1Var4 = this.b;
                                    int i152 = ag1Var4.K;
                                    ag1Var4.I = true;
                                    if (ag1Var4.n.getTransformationMethod() == null) {
                                        ag1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i152 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                            ag1Var4.b0[3].N(-1);
                                            org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.mi0 mi0Var = ag1Var4.b0[3];
                                            if (animatedDrawable != mi0Var) {
                                                ag1Var4.a.setAnimation(mi0Var);
                                                ag1Var4.b0[3].L(18, false, false);
                                            }
                                            ag1Var4.a.d();
                                        }
                                    } else {
                                        ag1Var4.n.setTransformationMethod(null);
                                        ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i152 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                            ag1Var4.b0[3].N(18);
                                            org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.a.getAnimatedDrawable();
                                            org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.b0[3];
                                            if (animatedDrawable2 != mi0Var2) {
                                                ag1Var4.a.setAnimation(mi0Var2);
                                            }
                                            ag1Var4.b0[3].Q(0.0f, false);
                                            ag1Var4.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = ag1Var4.n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    ag1Var4.I = false;
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = p9Var;
                kh.h6 h6Var = new kh.h6(this, context);
                this.y = h6Var;
                h6Var.setAlpha(0.0f);
                p9Var.addView(this.y);
                p9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.H = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.H.setAlpha(0.0f);
                this.H.setScaleX(0.1f);
                this.H.setScaleY(0.1f);
                this.H.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l6, false));
                m0Var.addView(this.H, g7.e6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                f fVar = new f(this, context, 3);
                fVar.setOnTouchListener(new jh.d(2));
                fVar.addView(this.actionBar);
                fVar.addView(this.a);
                fVar.addView(this.c);
                fVar.addView(this.d);
                fVar.addView(this.b);
                this.fragmentView = fVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        switch (i13) {
            case 0:
            case 1:
                if (this.Q.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    String string = LocaleController.getString(i13 == 0 ? R.string.CreatePassword : R.string.ReEnterPassword);
                    this.actionBar.setTitle(string);
                    this.c.setText(string);
                }
                if (!TextUtils.isEmpty(this.W)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.s.setText(LocaleController.getString(i13 == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.n.setContentDescription(LocaleController.getString(i13 == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.n.setImeOptions(268435461);
                this.n.setInputType(129);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.B = i13 == 0;
                AndroidUtilities.updateViewVisibilityAnimated(this.A, false, 0.1f, false);
                org.telegram.ui.Components.mi0[] mi0VarArr = new org.telegram.ui.Components.mi0[7];
                this.b0 = mi0VarArr;
                mi0VarArr[0] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_idle1, "" + R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[1] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_idle2, "" + R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[2] = new org.telegram.ui.Components.mi0(R.raw.tsv_monkey_close, "" + R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[3] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_peek, "" + R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[4] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, "" + R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[5] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_close_and_peek, "" + R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.b0[6] = new org.telegram.ui.Components.mi0(R.raw.tsv_setup_monkey_tracking, "" + R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.mi0 mi0Var = this.b0[6];
                mi0Var.h = true;
                mi0Var.N(19);
                this.b0[2].P(97, this.e0);
                E0(true);
                if (i13 != 1) {
                    this.n.dispatchTextWatchersTextChanged();
                    i9 = 1;
                    E0(true);
                    break;
                } else {
                    sf1 sf1Var = this.c0;
                    if (sf1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(sf1Var);
                    }
                    this.a.setAnimation(this.b0[6]);
                    this.a.d();
                    i9 = 1;
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
                i9 = 1;
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
                i9 = 1;
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
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.vz0 vz0Var = new org.telegram.ui.Components.vz0();
                    vz0Var.a |= 256;
                    vz0Var.b = indexOf;
                    int i24 = lastIndexOf + 1;
                    vz0Var.c = i24;
                    valueOf.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), indexOf, i24, 0);
                }
                this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf));
                this.d.setVisibility(0);
                this.Y.e(false, false);
                this.w.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i9 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(LocaleController.getString(R.string.VerificationCode));
                this.s.setVisibility(8);
                this.a0.setVisibility(0);
                dh.u uVar2 = this.d;
                int i25 = R.string.EmailPasswordConfirmText2;
                String str3 = this.Q.email_unconfirmed_pattern;
                uVar2.setText(LocaleController.formatString("EmailPasswordConfirmText2", i25, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.Y.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                final int i26 = 2;
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.of1
                    public final /* synthetic */ ag1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i26) {
                            case 0:
                                this.b.B0();
                                break;
                            case 1:
                                ag1 ag1Var = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rf1(ag1Var, 1));
                                alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetPassword);
                                String string2 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.P = string2;
                                ag1Var.showDialog(c2Var);
                                break;
                            case 2:
                                ag1.U(this.b);
                                break;
                            case 3:
                                ag1 ag1Var2 = this.b;
                                if (ag1Var2.h.getAlpha() >= 0.5f) {
                                    int i142 = ag1Var2.K;
                                    if (i142 != 0) {
                                        if (i142 != 3) {
                                            if (i142 == 2) {
                                                ag1Var2.z0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ag1Var2.getParentActivity());
                                            alertDialog$Builder2.a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new rf1(ag1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                                            ag1Var2.showDialog(c2Var2);
                                            TextView textView22 = (TextView) c2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                                break;
                                            }
                                        }
                                    } else {
                                        ag1Var2.w0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = ag1Var2.W;
                                        ag1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new tf1(ag1Var2, 1));
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                ag1 ag1Var3 = this.b;
                                if (ag1Var3.K == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.S = true;
                                    twoStepVerificationActivity.E = ag1Var3.Q;
                                    twoStepVerificationActivity.F = false;
                                    twoStepVerificationActivity.T = ag1Var3.C;
                                    ag1Var3.presentFragment(twoStepVerificationActivity, true);
                                    fb0 fb0Var = ag1Var3.f0;
                                    if (fb0Var != null) {
                                        AndroidUtilities.runOnUIThread(fb0Var);
                                        ag1Var3.f0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.b.B0();
                                break;
                            default:
                                ag1 ag1Var4 = this.b;
                                int i152 = ag1Var4.K;
                                ag1Var4.I = true;
                                if (ag1Var4.n.getTransformationMethod() == null) {
                                    ag1Var4.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i152 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                        ag1Var4.b0[3].N(-1);
                                        org.telegram.ui.Components.mi0 animatedDrawable = ag1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mi0 mi0Var2 = ag1Var4.b0[3];
                                        if (animatedDrawable != mi0Var2) {
                                            ag1Var4.a.setAnimation(mi0Var2);
                                            ag1Var4.b0[3].L(18, false, false);
                                        }
                                        ag1Var4.a.d();
                                    }
                                } else {
                                    ag1Var4.n.setTransformationMethod(null);
                                    ag1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i152 == 0 && ag1Var4.n.length() > 0 && ag1Var4.n.hasFocus()) {
                                        ag1Var4.b0[3].N(18);
                                        org.telegram.ui.Components.mi0 animatedDrawable2 = ag1Var4.a.getAnimatedDrawable();
                                        org.telegram.ui.Components.mi0 mi0Var22 = ag1Var4.b0[3];
                                        if (animatedDrawable2 != mi0Var22) {
                                            ag1Var4.a.setAnimation(mi0Var22);
                                        }
                                        ag1Var4.b0[3].Q(0.0f, false);
                                        ag1Var4.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = ag1Var4.n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                ag1Var4.I = false;
                                break;
                        }
                    }
                });
                this.w.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.a.d();
                i9 = 1;
                break;
            case 6:
                this.c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.a.d();
                i9 = 1;
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
                i9 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(LocaleController.getString(R.string.ForgotPassword));
                this.e.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.o6, false));
                this.s.setText(LocaleController.getString(R.string.LoginPassword));
                this.n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.n.setImeOptions(268435462);
                this.n.setInputType(129);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.a.f(R.raw.wallet_science, 120, 120, null);
                this.a.d();
                i9 = 1;
                break;
            case 9:
                this.c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_perfect, 140, 140, null);
                this.a.d();
                i9 = 1;
                break;
            default:
                i9 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor4 = this.n;
        if (editTextBoldCursor4 != null) {
            editTextBoldCursor4.addTextChangedListener(new xf1(this, i9));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
            if (o2Var != this && (o2Var instanceof ag1)) {
                ((org.telegram.ui.Components.v51) ((ag1) o2Var).X.b).b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hideKeyboardOnShow() {
        int i9 = this.K;
        return i9 == 7 || i9 == 9;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, true)) > 0.699999988079071d;
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
        H0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a != null) {
            int i9 = this.K;
            if (i9 == 2 && AndroidUtilities.isSmallScreen()) {
                this.a.setVisibility(8);
            } else if (i9 != 6 && i9 != 9 && i9 != 7) {
                org.telegram.ui.Components.pi0 pi0Var = this.a;
                Point point = AndroidUtilities.displaySize;
                pi0Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        org.telegram.ui.Components.kr krVar = this.a0;
        if (krVar != null) {
            krVar.setVisibility(u0() ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.J = false;
        sf1 sf1Var = this.c0;
        if (sf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sf1Var);
            this.c0 = null;
        }
        if (this.b0 != null) {
            int i9 = 0;
            while (true) {
                org.telegram.ui.Components.mi0[] mi0VarArr = this.b0;
                if (i9 >= mi0VarArr.length) {
                    break;
                }
                mi0VarArr[i9].A(false);
                i9++;
            }
            this.b0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (u0()) {
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
        if (u0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.n != null && !u0()) {
                AndroidUtilities.runOnUIThread(new sf1(this, 0), 200L);
            }
            ld0 ld0Var = this.w;
            if (ld0Var == null || ld0Var.getVisibility() != 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new sf1(this, 1), 200L);
        }
    }

    public final void t0(Runnable runnable) {
        int i9 = 0;
        while (true) {
            ld0 ld0Var = this.w;
            vr[] vrVarArr = ld0Var.f;
            if (i9 >= vrVarArr.length) {
                ld0Var.postDelayed(new n21(25, this, runnable), (vrVarArr.length * 75) + 350);
                return;
            } else {
                vr vrVar = vrVarArr[i9];
                vrVar.postDelayed(new wk0(vrVar, 1), i9 * 75);
                i9++;
            }
        }
    }

    public final boolean u0() {
        int i9 = this.K;
        if ((i9 != 5 && i9 != 4) || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final void v0() {
        this.Y.f(false, true);
    }

    public final void w0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.Y.f(true, true);
    }

    public final void x0() {
        for (vr vrVar : this.w.f) {
            vrVar.setText("");
            vrVar.i(1.0f);
        }
        this.w.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.w, 8.0f, new sf1(this, 6));
    }

    public final void y0(org.telegram.ui.Components.fc0 fc0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(fc0Var, 5.0f);
    }

    public final void z0() {
        TL_account.Password password = this.Q;
        if (password.has_recovery) {
            this.N = "";
            D0(false);
            return;
        }
        ag1 ag1Var = new ag1(this.currentAccount, 3, password);
        ag1Var.D = this.D;
        ag1Var.C0(this.R, this.S, this.T, this.V);
        ag1Var.L = this.L;
        ag1Var.M = this.M;
        ag1Var.F.addAll(this.F);
        ag1Var.F.add(this);
        ag1Var.U = this.U;
        ag1Var.C = this.C;
        presentFragment(ag1Var);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void finishFragment() {
        if (this.C >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle i9 = aa.d.i("afterSignup", true);
            ng0 ng0Var = new ng0();
            ng0Var.k0(i9);
            presentFragment(ng0Var, true);
            return;
        }
        super.finishFragment();
    }

    public ag1(int i9, TL_account.Password password) {
        super(null);
        this.B = false;
        this.C = -1;
        this.F = new ArrayList();
        this.R = new byte[0];
        this.d0 = new sf1(this, 2);
        this.e0 = new sf1(this, 3);
        this.K = i9;
        this.Q = password;
        if (password == null && (i9 == 6 || i9 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new tf1(this, 0), 10);
        } else {
            this.P = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }

    public void A0() {
    }
}
