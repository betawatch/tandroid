// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
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
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class o7c extends e {
    public a81 E;
    public d7 F;
    public boolean G;
    public int H;
    public boolean I;
    public AnimatorSet J;
    public final ArrayList K;
    public AnimatorSet L;
    public RadialProgressView M;
    public boolean N;
    public boolean O;
    public final byte P;
    public String Q;
    public String R;
    public String S;
    public boolean T;
    public boolean U;
    public TL_account.Password V;
    public byte[] W;
    public long X;
    public byte[] Y;
    public boolean Z;
    public e29 a;
    public boolean a0;
    public TextView b;
    public String b0;
    public TextView c;
    public ko9 c0;
    public tpa d;
    public zp4 d0;
    public TextView e;
    public w2c e0;
    public TextView f;
    public k53 f0;
    public b29[] g0;
    public TextView h;
    public f7c h0;
    public final Runnable i0;
    public final Runnable j0;
    public w56 k0;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public lu7 s;
    public lu7 w;
    public bf6 x;
    public n7c y;

    /* JADX WARN: Multi-variable type inference failed */
    public o7c(int i, int i2, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.i0 = new f7c(this, (byte) 0);
        this.j0 = new f7c(this, (byte) 1);
        this.currentAccount = i;
        this.P = i2;
        this.V = password;
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.V == null) {
            if (i2 == 6 || i2 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h7c(this, (byte) 0), 10);
            }
        }
    }

    public final void A0(TLObject tLObject, boolean z, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = this.V;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? es9.d(this.W, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] g1 = hl.g1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = this.V.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = g1;
                bArr = es9.c(g1, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = g1;
                bArr = null;
            }
        }
        gg2 gg2Var = new gg2(this, z, bArr, str, passwordinputsettings, (byte) 5);
        if (z) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, gg2Var, 10);
            return;
        }
        if (str != null && (bArr3 = this.Y) != null && bArr3.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = this.V.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] m = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr4 = new byte[32];
                System.arraycopy(m, 0, bArr4, 0, 32);
                byte[] bArr5 = new byte[16];
                System.arraycopy(m, 32, bArr5, 0, 16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(this.Y, 0, bArr6, 0, 32);
                Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr6;
                tL_secureSecretSettings.secure_secret_id = this.X;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = this.V.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            gg2Var.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] b = es9.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = b;
            if (b == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                gg2Var.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, gg2Var, 10);
    }

    public final void B0() {
        this.d0.f(false, true);
    }

    public final void C0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.d0.f(true, true);
    }

    public final void D0() {
        for (ok2 ok2Var : this.x.f) {
            ok2Var.setText("");
            ok2Var.A(1.0f);
        }
        this.x.f[0].requestFocus();
        hl.A3(8.0f, this.x, new f7c(this, (byte) 6));
    }

    public final void E0(lu7 lu7Var, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            editTextBoldCursor.setText("");
        }
        hl.A3(5.0f, lu7Var, null);
    }

    public final void F0() {
        TL_account.Password password = this.V;
        if (password.has_recovery) {
            this.S = "";
            J0(false);
            return;
        }
        o7c o7cVar = new o7c(this.currentAccount, 3, password);
        o7cVar.I = this.I;
        o7cVar.I0(this.W, this.X, this.Y, this.a0);
        o7cVar.Q = this.Q;
        o7cVar.R = this.R;
        ArrayList arrayList = this.K;
        ArrayList arrayList2 = o7cVar.K;
        arrayList2.addAll(arrayList);
        arrayList2.add(this);
        o7cVar.Z = this.Z;
        o7cVar.H = this.H;
        presentFragment(o7cVar);
    }

    public final void H0() {
        if (getParentActivity() != null) {
            byte b = 0;
            switch (this.P) {
                case 0:
                case 1:
                    if (this.n.length() == 0) {
                        E0(this.s, this.n, false);
                        break;
                    } else if (this.n.getText().toString().equals(this.Q) || this.P != 1) {
                        o7c o7cVar = new o7c(this.currentAccount, this.P == 0 ? (byte) 1 : (byte) 2, this.V);
                        o7cVar.I = this.I;
                        o7cVar.Q = this.n.getText().toString();
                        o7cVar.I0(this.W, this.X, this.Y, this.a0);
                        o7cVar.b0 = this.b0;
                        o7cVar.K.addAll(this.K);
                        o7cVar.K.add(this);
                        o7cVar.Z = this.Z;
                        o7cVar.H = this.H;
                        presentFragment(o7cVar);
                        break;
                    } else {
                        hl.A3(5.0f, this.s, null);
                        try {
                            this.s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), ob6.M0(2131747173, null), 0).show();
                            break;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                    break;
                case 2:
                    String obj = this.n.getText().toString();
                    this.R = obj;
                    if (!obj.equalsIgnoreCase(this.Q)) {
                        F0();
                        break;
                    } else {
                        try {
                            Toast.makeText(getParentActivity(), ob6.M0(2131747175, null), 0).show();
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        E0(this.s, this.n, false);
                        break;
                    }
                case 3:
                    if (!this.a0 && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.n.getText().toString();
                    this.S = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            J0(false);
                            break;
                        }
                    }
                    E0(this.s, this.n, false);
                    break;
                case 4:
                    String code = this.x.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new isa(this, code, (byte) 19), 10);
                    break;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.x.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new h7c(this, r1), 10);
                    C0();
                    break;
                case 6:
                    TL_account.Password password = this.V;
                    if (password != null) {
                        o7c o7cVar2 = new o7c(this.currentAccount, 0, password);
                        o7cVar2.I = this.I;
                        o7cVar2.Z = this.Z;
                        o7cVar2.H = this.H;
                        presentFragment(o7cVar2, true);
                        break;
                    } else {
                        C0();
                        this.O = true;
                        break;
                    }
                case 7:
                    if (!this.Z) {
                        if (!this.I) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.A0(this.V, this.W, this.X, this.Y);
                            twoStepVerificationActivity.Y = this.H;
                            presentFragment(twoStepVerificationActivity, true);
                            w56 w56Var = this.k0;
                            if (w56Var != null) {
                                hl.c3(w56Var);
                                this.k0 = null;
                                break;
                            }
                        } else {
                            Bundle l = bs2.l("afterSignup", true);
                            fj6 fj6Var = new fj6();
                            fj6Var.s0(l);
                            presentFragment(fj6Var, true);
                            break;
                        }
                    } else {
                        finishFragment();
                        break;
                    }
                    break;
                case 8:
                    if (this.V != null) {
                        String obj3 = this.n.getText().toString();
                        if (obj3.length() != 0) {
                            byte[] g1 = hl.g1(obj3);
                            C0();
                            Utilities.e.c(new i7c(this, g1, b));
                            break;
                        } else {
                            E0(this.s, this.n, false);
                            break;
                        }
                    } else {
                        C0();
                        this.O = true;
                        break;
                    }
                case 9:
                    finishFragment();
                    break;
            }
        }
    }

    public final void I0(byte[] bArr, long j, byte[] bArr2, boolean z) {
        this.W = bArr;
        this.Y = bArr2;
        this.X = j;
        this.a0 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0(boolean z) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        byte b = 3;
        if (z && this.U && this.V.has_password) {
            C0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new h7c(this, b));
            return;
        }
        String str = this.Q;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        String str2 = "";
        if (z) {
            yac.h(this.currentAccount).t();
            this.Y = null;
            if (this.U) {
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
            String str3 = this.R;
            if (str3 == null && (password = this.V) != null) {
                str3 = password.hint;
                this.R = str3;
            }
            if (str3 == null) {
                this.R = "";
            } else {
                str2 = str3;
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = str2;
                passwordinputsettings.new_algo = this.V.new_algo;
            }
            if (this.S.length() > 0) {
                passwordinputsettings.flags |= 2;
                passwordinputsettings.email = this.S.trim();
            }
        }
        if (this.b0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.b0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.W;
            if (bArr == null || bArr.length == 0 || (z && this.U)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        C0();
        Utilities.e.c(new va7((Object) this, (Object) updatepasswordsettings3, z, (Object) str, (Object) passwordinputsettings, (byte) 23));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.l0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(boolean z) {
        if (this.P != 0) {
            return;
        }
        f7c f7cVar = this.h0;
        if (f7cVar != null) {
            hl.r(f7cVar);
        }
        b29 animatedDrawable = this.a.getAnimatedDrawable();
        if (!z) {
            b29[] b29VarArr = this.g0;
            if (animatedDrawable != b29VarArr[0]) {
                if (animatedDrawable != b29VarArr[1]) {
                    if (this.n.length() == 0) {
                        if (animatedDrawable != null) {
                        }
                    }
                    f7c f7cVar2 = new f7c(this, (byte) 4);
                    this.h0 = f7cVar2;
                    hl.d3(f7cVar2, Utilities.b.nextInt(2000) + 5000);
                }
            }
        }
        int nextInt = Utilities.b.nextInt() % 2;
        e29 e29Var = this.a;
        b29[] b29VarArr2 = this.g0;
        if (nextInt == 0) {
            e29Var.setAnimation(b29VarArr2[0]);
            this.g0[0].O(true, 0.0f);
        } else {
            e29Var.setAnimation(b29VarArr2[1]);
            this.g0[1].O(true, 0.0f);
        }
        if (!z) {
            this.a.d();
        }
        f7c f7cVar22 = new f7c(this, (byte) 4);
        this.h0 = f7cVar22;
        hl.d3(f7cVar22, Utilities.b.nextInt(2000) + 5000);
    }

    public final void L0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = str2;
        showDialog(idVar);
    }

    public final void M0(boolean z) {
        if (z == (this.b.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b.setTag(z ? 1 : null);
        this.J = new AnimatorSet();
        if (z) {
            this.b.setVisibility(0);
            AnimatorSet animatorSet2 = this.J;
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
            AnimatorSet animatorSet3 = this.J;
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
        this.J.addListener(new i1a((byte) 12, this, z));
        this.J.setDuration(150L);
        this.J.start();
    }

    public final void N0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131742579, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.G(this.H, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.j(ob6.M0(2131743588, null), null);
        alertDialog$Builder.g(ob6.M0(2131750554, null), new g7c(this, (byte) 0));
        yob.X((TextView) alertDialog$Builder.o().c(-2), aob.q7, null);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v81, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v82 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v22 */
    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        char c;
        byte b;
        ?? r12;
        ?? r10;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final byte b2 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        a aVar = this.actionBar;
        int i = aob.G6;
        final byte b3 = 5;
        yob.l(aVar, 5, i, null);
        final byte b4 = 1;
        yob.l(this.actionBar, 1, i, null);
        yob.l(this.actionBar, 3, aob.u8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new m7c(this));
        byte b5 = this.P;
        if (b5 == 5) {
            this.actionBar.u().a(0, R.drawable.ic_ab_other).g(1, ob6.M0(2131754943, null));
        }
        zp4 zp4Var = new zp4(this.resourceProvider, context, false);
        this.d0 = zp4Var;
        this.c0 = new ko9(zp4Var);
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: c7c
            public final /* synthetic */ o7c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b6 = b2;
                byte b7 = 1;
                o7c o7cVar = this.b;
                switch (b6) {
                    case 0:
                        o7cVar.H0();
                        break;
                    case 1:
                        byte b8 = o7cVar.P;
                        o7cVar.N = true;
                        TransformationMethod transformationMethod = o7cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = o7cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            yob.s(o7cVar.F, aob.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                o7cVar.g0[3].K(-1);
                                b29 animatedDrawable = o7cVar.a.getAnimatedDrawable();
                                b29 b29Var = o7cVar.g0[3];
                                if (animatedDrawable != b29Var) {
                                    o7cVar.a.setAnimation(b29Var);
                                    o7cVar.g0[3].I(18, false, false);
                                }
                                o7cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            yob.s(o7cVar.F, aob.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                o7cVar.g0[3].K(18);
                                b29 animatedDrawable2 = o7cVar.a.getAnimatedDrawable();
                                b29 b29Var2 = o7cVar.g0[3];
                                if (animatedDrawable2 != b29Var2) {
                                    o7cVar.a.setAnimation(b29Var2);
                                }
                                o7cVar.g0[3].O(false, 0.0f);
                                o7cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = o7cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        o7cVar.N = false;
                        break;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        alertDialog$Builder.j(ob6.M0(2131745845, null), new g7c(o7cVar, (byte) 1));
                        String M0 = ob6.M0(2131745820, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131745801, null);
                        o7cVar.showDialog(idVar);
                        break;
                    case 3:
                        o7cVar.m0();
                        break;
                    case 4:
                        if (o7cVar.h.getAlpha() >= 0.5f) {
                            byte b9 = o7cVar.P;
                            if (b9 != 0) {
                                if (b9 != 3) {
                                    if (b9 == 2) {
                                        o7cVar.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o7cVar.getParentActivity());
                                    String M02 = ob6.M0(2131742446, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.U = M02;
                                    idVar2.S = ob6.M0(2131742447, null);
                                    alertDialog$Builder2.j(ob6.M0(2131742448, null), new g7c(o7cVar, (byte) 2));
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    o7cVar.showDialog(idVar2);
                                    TextView textView = (TextView) idVar2.c(-1);
                                    if (textView != null) {
                                        yob.X(textView, aob.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                o7cVar.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = o7cVar.b0;
                                o7cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h7c(o7cVar, b7));
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (o7cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = o7cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = o7cVar.H;
                            o7cVar.presentFragment(twoStepVerificationActivity, true);
                            w56 w56Var = o7cVar.k0;
                            if (w56Var != null) {
                                hl.c3(w56Var);
                                o7cVar.k0 = null;
                                break;
                            }
                        }
                        break;
                    default:
                        o7cVar.H0();
                        break;
                }
            }
        });
        w2c w2cVar = new w2c(context);
        this.e0 = w2cVar;
        w2cVar.setTransformType(1);
        this.e0.setProgress(0.0f);
        this.e0.setColor(aob.w0(null, aob.O9, false));
        this.e0.setDrawBackground(false);
        this.d0.setContentDescription(ob6.M0(2131747981, null));
        this.d0.addView(this.e0, tre.e(56, 56, 17));
        this.d0.a(this.e0);
        TextView textView = new TextView(context);
        this.h = textView;
        yob.X(textView, aob.o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        ko9.e(this.h);
        this.h.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        final byte b6 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: c7c
            public final /* synthetic */ o7c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b62 = b6;
                byte b7 = 1;
                o7c o7cVar = this.b;
                switch (b62) {
                    case 0:
                        o7cVar.H0();
                        break;
                    case 1:
                        byte b8 = o7cVar.P;
                        o7cVar.N = true;
                        TransformationMethod transformationMethod = o7cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = o7cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            yob.s(o7cVar.F, aob.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                o7cVar.g0[3].K(-1);
                                b29 animatedDrawable = o7cVar.a.getAnimatedDrawable();
                                b29 b29Var = o7cVar.g0[3];
                                if (animatedDrawable != b29Var) {
                                    o7cVar.a.setAnimation(b29Var);
                                    o7cVar.g0[3].I(18, false, false);
                                }
                                o7cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            yob.s(o7cVar.F, aob.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                o7cVar.g0[3].K(18);
                                b29 animatedDrawable2 = o7cVar.a.getAnimatedDrawable();
                                b29 b29Var2 = o7cVar.g0[3];
                                if (animatedDrawable2 != b29Var2) {
                                    o7cVar.a.setAnimation(b29Var2);
                                }
                                o7cVar.g0[3].O(false, 0.0f);
                                o7cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = o7cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        o7cVar.N = false;
                        break;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        alertDialog$Builder.j(ob6.M0(2131745845, null), new g7c(o7cVar, (byte) 1));
                        String M0 = ob6.M0(2131745820, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131745801, null);
                        o7cVar.showDialog(idVar);
                        break;
                    case 3:
                        o7cVar.m0();
                        break;
                    case 4:
                        if (o7cVar.h.getAlpha() >= 0.5f) {
                            byte b9 = o7cVar.P;
                            if (b9 != 0) {
                                if (b9 != 3) {
                                    if (b9 == 2) {
                                        o7cVar.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o7cVar.getParentActivity());
                                    String M02 = ob6.M0(2131742446, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.U = M02;
                                    idVar2.S = ob6.M0(2131742447, null);
                                    alertDialog$Builder2.j(ob6.M0(2131742448, null), new g7c(o7cVar, (byte) 2));
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    o7cVar.showDialog(idVar2);
                                    TextView textView2 = (TextView) idVar2.c(-1);
                                    if (textView2 != null) {
                                        yob.X(textView2, aob.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                o7cVar.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = o7cVar.b0;
                                o7cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h7c(o7cVar, b7));
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (o7cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = o7cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = o7cVar.H;
                            o7cVar.presentFragment(twoStepVerificationActivity, true);
                            w56 w56Var = o7cVar.k0;
                            if (w56Var != null) {
                                hl.c3(w56Var);
                                o7cVar.k0 = null;
                                break;
                            }
                        }
                        break;
                    default:
                        o7cVar.H0();
                        break;
                }
            }
        });
        e29 e29Var = new e29(context);
        this.a = e29Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        e29Var.setScaleType(scaleType);
        if (b5 == 2 && hl.M1()) {
            this.a.setVisibility(8);
        } else if (b5 != 6 && b5 != 9 && b5 != 7) {
            e29 e29Var2 = this.a;
            Point point = hl.q;
            e29Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        yob.X(textView2, i, null);
        this.c.setGravity(1);
        this.c.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        tpa tpaVar = new tpa(context);
        this.d = tpaVar;
        int i2 = aob.D6;
        yob.X(tpaVar, i2, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(hl.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        yob.X(textView3, i2, null);
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(hl.L(2.0f), 1.0f);
        this.e.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: c7c
            public final /* synthetic */ o7c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b62 = b3;
                byte b7 = 1;
                o7c o7cVar = this.b;
                switch (b62) {
                    case 0:
                        o7cVar.H0();
                        break;
                    case 1:
                        byte b8 = o7cVar.P;
                        o7cVar.N = true;
                        TransformationMethod transformationMethod = o7cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = o7cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            yob.s(o7cVar.F, aob.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                o7cVar.g0[3].K(-1);
                                b29 animatedDrawable = o7cVar.a.getAnimatedDrawable();
                                b29 b29Var = o7cVar.g0[3];
                                if (animatedDrawable != b29Var) {
                                    o7cVar.a.setAnimation(b29Var);
                                    o7cVar.g0[3].I(18, false, false);
                                }
                                o7cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            yob.s(o7cVar.F, aob.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                o7cVar.g0[3].K(18);
                                b29 animatedDrawable2 = o7cVar.a.getAnimatedDrawable();
                                b29 b29Var2 = o7cVar.g0[3];
                                if (animatedDrawable2 != b29Var2) {
                                    o7cVar.a.setAnimation(b29Var2);
                                }
                                o7cVar.g0[3].O(false, 0.0f);
                                o7cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = o7cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        o7cVar.N = false;
                        break;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        alertDialog$Builder.j(ob6.M0(2131745845, null), new g7c(o7cVar, (byte) 1));
                        String M0 = ob6.M0(2131745820, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131745801, null);
                        o7cVar.showDialog(idVar);
                        break;
                    case 3:
                        o7cVar.m0();
                        break;
                    case 4:
                        if (o7cVar.h.getAlpha() >= 0.5f) {
                            byte b9 = o7cVar.P;
                            if (b9 != 0) {
                                if (b9 != 3) {
                                    if (b9 == 2) {
                                        o7cVar.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o7cVar.getParentActivity());
                                    String M02 = ob6.M0(2131742446, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.U = M02;
                                    idVar2.S = ob6.M0(2131742447, null);
                                    alertDialog$Builder2.j(ob6.M0(2131742448, null), new g7c(o7cVar, (byte) 2));
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    o7cVar.showDialog(idVar2);
                                    TextView textView22 = (TextView) idVar2.c(-1);
                                    if (textView22 != null) {
                                        yob.X(textView22, aob.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                o7cVar.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = o7cVar.b0;
                                o7cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h7c(o7cVar, b7));
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (o7cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = o7cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = o7cVar.H;
                            o7cVar.presentFragment(twoStepVerificationActivity, true);
                            w56 w56Var = o7cVar.k0;
                            if (w56Var != null) {
                                hl.c3(w56Var);
                                o7cVar.k0 = null;
                                break;
                            }
                        }
                        break;
                    default:
                        o7cVar.H0();
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(hl.L(220.0f));
        this.b.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        this.b.setGravity(17);
        yob.X(this.b, aob.Ji, null);
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(hl.o());
        this.b.setBackground(rnb.f(aob.Fi, 24.0f));
        final byte b7 = 6;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: c7c
            public final /* synthetic */ o7c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b62 = b7;
                byte b72 = 1;
                o7c o7cVar = this.b;
                switch (b62) {
                    case 0:
                        o7cVar.H0();
                        break;
                    case 1:
                        byte b8 = o7cVar.P;
                        o7cVar.N = true;
                        TransformationMethod transformationMethod = o7cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = o7cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            yob.s(o7cVar.F, aob.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                o7cVar.g0[3].K(-1);
                                b29 animatedDrawable = o7cVar.a.getAnimatedDrawable();
                                b29 b29Var = o7cVar.g0[3];
                                if (animatedDrawable != b29Var) {
                                    o7cVar.a.setAnimation(b29Var);
                                    o7cVar.g0[3].I(18, false, false);
                                }
                                o7cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            yob.s(o7cVar.F, aob.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (b8 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                o7cVar.g0[3].K(18);
                                b29 animatedDrawable2 = o7cVar.a.getAnimatedDrawable();
                                b29 b29Var2 = o7cVar.g0[3];
                                if (animatedDrawable2 != b29Var2) {
                                    o7cVar.a.setAnimation(b29Var2);
                                }
                                o7cVar.g0[3].O(false, 0.0f);
                                o7cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = o7cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        o7cVar.N = false;
                        break;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        alertDialog$Builder.j(ob6.M0(2131745845, null), new g7c(o7cVar, (byte) 1));
                        String M0 = ob6.M0(2131745820, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131745801, null);
                        o7cVar.showDialog(idVar);
                        break;
                    case 3:
                        o7cVar.m0();
                        break;
                    case 4:
                        if (o7cVar.h.getAlpha() >= 0.5f) {
                            byte b9 = o7cVar.P;
                            if (b9 != 0) {
                                if (b9 != 3) {
                                    if (b9 == 2) {
                                        o7cVar.F0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o7cVar.getParentActivity());
                                    String M02 = ob6.M0(2131742446, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.U = M02;
                                    idVar2.S = ob6.M0(2131742447, null);
                                    alertDialog$Builder2.j(ob6.M0(2131742448, null), new g7c(o7cVar, (byte) 2));
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    o7cVar.showDialog(idVar2);
                                    TextView textView22 = (TextView) idVar2.c(-1);
                                    if (textView22 != null) {
                                        yob.X(textView22, aob.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                o7cVar.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = o7cVar.b0;
                                o7cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h7c(o7cVar, b72));
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (o7cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = o7cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = o7cVar.H;
                            o7cVar.presentFragment(twoStepVerificationActivity, true);
                            w56 w56Var = o7cVar.k0;
                            if (w56Var != null) {
                                hl.c3(w56Var);
                                o7cVar.k0 = null;
                                break;
                            }
                        }
                        break;
                    default:
                        o7cVar.H0();
                        break;
                }
            }
        });
        if (b5 == 6 || b5 == 7 || b5 == 9) {
            this.c.setTypeface(Typeface.DEFAULT);
            this.c.setTextSize(1, 24.0f);
        } else {
            this.c.setTypeface(hl.o());
            this.c.setTextSize(1, 18.0f);
        }
        switch (b5) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                c = 5;
                h8b h8bVar = new h8b((byte) 6, context, this);
                oy7 oy7Var = new oy7(this, context, h8bVar, b4);
                oy7Var.addView(h8bVar);
                ia1 ia1Var = new ia1(this, context, oy7Var);
                n7c n7cVar = new n7c(this, context);
                this.y = n7cVar;
                n7cVar.setVerticalScrollBarEnabled(false);
                h8bVar.addView(this.y, tre.c(-1.0f, -1));
                h8bVar.addView(this.h, tre.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                h8bVar.addView(this.d0, zp4.b());
                ia1Var.addView(oy7Var, tre.c(-1.0f, -1));
                oob oobVar = new oob((byte) 22, context, this);
                oobVar.setOrientation(1);
                this.y.addView(oobVar, tre.x(-1, -1, 51));
                oobVar.addView(this.a, tre.t(-2, -2, 49, 0, 69, 0, 0));
                oobVar.addView(this.c, tre.t(-2, -2, 49, 0, 8, 0, 0));
                oobVar.addView(this.d, tre.t(-2, -2, 49, 0, 9, 0, 0));
                lu7 lu7Var = new lu7(context, null);
                this.s = lu7Var;
                lu7Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = hl.L(16.0f);
                this.n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i3 = aob.l6;
                yob.v(editTextBoldCursor2, i3, null);
                yob.X(this.n, i, null);
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(hl.L(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: d7c
                    public final /* synthetic */ o7c b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i4, KeyEvent keyEvent) {
                        byte b8 = b4;
                        o7c o7cVar = this.b;
                        switch (b8) {
                            case 0:
                                if (i4 != 5 && i4 != 6) {
                                    return false;
                                }
                                o7cVar.H0();
                                return true;
                            default:
                                if (i4 != 5 && i4 != 6) {
                                    return false;
                                }
                                if (o7cVar.w.getVisibility() == 0) {
                                    o7cVar.r.requestFocus();
                                } else {
                                    o7cVar.H0();
                                }
                                return true;
                        }
                    }
                });
                this.s.e(this.n);
                final byte b8 = 2;
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: e7c
                    public final /* synthetic */ o7c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        float f;
                        byte b9 = b8;
                        o7c o7cVar = this.b;
                        switch (b9) {
                            case 0:
                                lu7 lu7Var2 = o7cVar.w;
                                f = z ? 1.0f : 0.0f;
                                lu7Var2.b(f, f, true);
                                break;
                            case 1:
                                if (z) {
                                    o7cVar.f0.setEditText((EditText) view);
                                    o7cVar.f0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                                break;
                            default:
                                lu7 lu7Var3 = o7cVar.s;
                                f = z ? 1.0f : 0.0f;
                                lu7Var3.b(f, f, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, tre.l(1.0f, 0, -2));
                d7 d7Var = new d7((byte) 4, context, this);
                this.F = d7Var;
                d7Var.setImageResource(R.drawable.msg_message);
                this.F.setScaleType(scaleType);
                this.F.setContentDescription(ob6.M0(2131743587, null));
                d7 d7Var2 = this.F;
                int i4 = aob.i6;
                final byte b9 = 1;
                yob.R(d7Var2, aob.f0(aob.w0(null, i4, false), 1, -1), null, yob.M(i4), null);
                yob.s(this.F, aob.Oe, null, PorterDuff.Mode.MULTIPLY);
                hl.T3(this.F, false, 0.1f, true, false);
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: c7c
                    public final /* synthetic */ o7c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b62 = b9;
                        byte b72 = 1;
                        o7c o7cVar = this.b;
                        switch (b62) {
                            case 0:
                                o7cVar.H0();
                                break;
                            case 1:
                                byte b82 = o7cVar.P;
                                o7cVar.N = true;
                                TransformationMethod transformationMethod = o7cVar.n.getTransformationMethod();
                                EditTextBoldCursor editTextBoldCursor3 = o7cVar.n;
                                if (transformationMethod == null) {
                                    editTextBoldCursor3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    yob.s(o7cVar.F, aob.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (b82 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                        o7cVar.g0[3].K(-1);
                                        b29 animatedDrawable = o7cVar.a.getAnimatedDrawable();
                                        b29 b29Var = o7cVar.g0[3];
                                        if (animatedDrawable != b29Var) {
                                            o7cVar.a.setAnimation(b29Var);
                                            o7cVar.g0[3].I(18, false, false);
                                        }
                                        o7cVar.a.d();
                                    }
                                } else {
                                    editTextBoldCursor3.setTransformationMethod(null);
                                    yob.s(o7cVar.F, aob.Pe, null, PorterDuff.Mode.MULTIPLY);
                                    if (b82 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                        o7cVar.g0[3].K(18);
                                        b29 animatedDrawable2 = o7cVar.a.getAnimatedDrawable();
                                        b29 b29Var2 = o7cVar.g0[3];
                                        if (animatedDrawable2 != b29Var2) {
                                            o7cVar.a.setAnimation(b29Var2);
                                        }
                                        o7cVar.g0[3].O(false, 0.0f);
                                        o7cVar.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor22 = o7cVar.n;
                                editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                o7cVar.N = false;
                                break;
                            case 2:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                alertDialog$Builder.j(ob6.M0(2131745845, null), new g7c(o7cVar, (byte) 1));
                                String M0 = ob6.M0(2131745820, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.M0(2131745801, null);
                                o7cVar.showDialog(idVar);
                                break;
                            case 3:
                                o7cVar.m0();
                                break;
                            case 4:
                                if (o7cVar.h.getAlpha() >= 0.5f) {
                                    byte b92 = o7cVar.P;
                                    if (b92 != 0) {
                                        if (b92 != 3) {
                                            if (b92 == 2) {
                                                o7cVar.F0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o7cVar.getParentActivity());
                                            String M02 = ob6.M0(2131742446, null);
                                            id idVar2 = alertDialog$Builder2.a;
                                            idVar2.U = M02;
                                            idVar2.S = ob6.M0(2131742447, null);
                                            alertDialog$Builder2.j(ob6.M0(2131742448, null), new g7c(o7cVar, (byte) 2));
                                            alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                            o7cVar.showDialog(idVar2);
                                            TextView textView22 = (TextView) idVar2.c(-1);
                                            if (textView22 != null) {
                                                yob.X(textView22, aob.q7, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        o7cVar.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = o7cVar.b0;
                                        o7cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h7c(o7cVar, b72));
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                if (o7cVar.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = o7cVar.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = o7cVar.H;
                                    o7cVar.presentFragment(twoStepVerificationActivity, true);
                                    w56 w56Var = o7cVar.k0;
                                    if (w56Var != null) {
                                        hl.c3(w56Var);
                                        o7cVar.k0 = null;
                                        break;
                                    }
                                }
                                break;
                            default:
                                o7cVar.H0();
                                break;
                        }
                    }
                });
                linearLayout.addView(this.F, tre.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new l7c(this, (byte) 1));
                this.s.addView(linearLayout, tre.c(-2.0f, -1));
                oobVar.addView(this.s, tre.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.w = new lu7(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = hl.L(16.0f);
                this.r.setPadding(L2, L2, L2, L2);
                yob.v(this.r, i3, null);
                yob.X(this.r, i, null);
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(hl.L(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                final byte b10 = 0;
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: d7c
                    public final /* synthetic */ o7c b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView5, int i42, KeyEvent keyEvent) {
                        byte b82 = b10;
                        o7c o7cVar = this.b;
                        switch (b82) {
                            case 0:
                                if (i42 != 5 && i42 != 6) {
                                    return false;
                                }
                                o7cVar.H0();
                                return true;
                            default:
                                if (i42 != 5 && i42 != 6) {
                                    return false;
                                }
                                if (o7cVar.w.getVisibility() == 0) {
                                    o7cVar.r.requestFocus();
                                } else {
                                    o7cVar.H0();
                                }
                                return true;
                        }
                    }
                });
                this.w.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: e7c
                    public final /* synthetic */ o7c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        float f;
                        byte b92 = b10;
                        o7c o7cVar = this.b;
                        switch (b92) {
                            case 0:
                                lu7 lu7Var2 = o7cVar.w;
                                f = z ? 1.0f : 0.0f;
                                lu7Var2.b(f, f, true);
                                break;
                            case 1:
                                if (z) {
                                    o7cVar.f0.setEditText((EditText) view);
                                    o7cVar.f0.setDispatchBackWhenEmpty(true);
                                    break;
                                }
                                break;
                            default:
                                lu7 lu7Var3 = o7cVar.s;
                                f = z ? 1.0f : 0.0f;
                                lu7Var3.b(f, f, true);
                                break;
                        }
                    }
                });
                this.w.addView(this.r, tre.c(-2.0f, -1));
                oobVar.addView(this.w, tre.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.w.setVisibility(8);
                k53 k53Var = new k53(context);
                this.f0 = k53Var;
                k53Var.setVisibility(8);
                oy7Var.addView(this.f0);
                bf6 bf6Var = new bf6((byte) 3, context, this);
                this.x = bf6Var;
                final byte b11 = 1;
                bf6Var.b(6, 1);
                ok2[] ok2VarArr = this.x.f;
                int length = ok2VarArr.length;
                int i5 = 0;
                while (i5 < length) {
                    ok2 ok2Var = ok2VarArr[i5];
                    ok2Var.setShowSoftInputOnFocusCompat((l0() ? 1 : 0) ^ b11);
                    ok2Var.addTextChangedListener(new fi1(this));
                    ok2Var.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: e7c
                        public final /* synthetic */ o7c b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z) {
                            float f;
                            byte b92 = b11;
                            o7c o7cVar = this.b;
                            switch (b92) {
                                case 0:
                                    lu7 lu7Var2 = o7cVar.w;
                                    f = z ? 1.0f : 0.0f;
                                    lu7Var2.b(f, f, true);
                                    break;
                                case 1:
                                    if (z) {
                                        o7cVar.f0.setEditText((EditText) view);
                                        o7cVar.f0.setDispatchBackWhenEmpty(true);
                                        break;
                                    }
                                    break;
                                default:
                                    lu7 lu7Var3 = o7cVar.s;
                                    f = z ? 1.0f : 0.0f;
                                    lu7Var3.b(f, f, true);
                                    break;
                            }
                        }
                    });
                    i5++;
                    b11 = 1;
                }
                this.x.setVisibility(8);
                oobVar.addView(this.x, tre.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                oobVar.addView(frameLayout, tre.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, tre.e(-2, -2, 49));
                if (b5 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    yob.X(textView5, aob.J6, null);
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(hl.L(2.0f), 1.0f);
                    this.f.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
                    this.f.setText(ob6.M0(2131745803, null));
                    oobVar.addView(this.f, tre.t(-2, -2, 49, 0, 0, 0, 25));
                    final byte b12 = 2;
                    this.f.setOnClickListener(new View.OnClickListener(this) { // from class: c7c
                        public final /* synthetic */ o7c b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b62 = b12;
                            byte b72 = 1;
                            o7c o7cVar = this.b;
                            switch (b62) {
                                case 0:
                                    o7cVar.H0();
                                    break;
                                case 1:
                                    byte b82 = o7cVar.P;
                                    o7cVar.N = true;
                                    TransformationMethod transformationMethod = o7cVar.n.getTransformationMethod();
                                    EditTextBoldCursor editTextBoldCursor32 = o7cVar.n;
                                    if (transformationMethod == null) {
                                        editTextBoldCursor32.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        yob.s(o7cVar.F, aob.Oe, null, PorterDuff.Mode.MULTIPLY);
                                        if (b82 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                            o7cVar.g0[3].K(-1);
                                            b29 animatedDrawable = o7cVar.a.getAnimatedDrawable();
                                            b29 b29Var = o7cVar.g0[3];
                                            if (animatedDrawable != b29Var) {
                                                o7cVar.a.setAnimation(b29Var);
                                                o7cVar.g0[3].I(18, false, false);
                                            }
                                            o7cVar.a.d();
                                        }
                                    } else {
                                        editTextBoldCursor32.setTransformationMethod(null);
                                        yob.s(o7cVar.F, aob.Pe, null, PorterDuff.Mode.MULTIPLY);
                                        if (b82 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                            o7cVar.g0[3].K(18);
                                            b29 animatedDrawable2 = o7cVar.a.getAnimatedDrawable();
                                            b29 b29Var2 = o7cVar.g0[3];
                                            if (animatedDrawable2 != b29Var2) {
                                                o7cVar.a.setAnimation(b29Var2);
                                            }
                                            o7cVar.g0[3].O(false, 0.0f);
                                            o7cVar.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor22 = o7cVar.n;
                                    editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                    o7cVar.N = false;
                                    break;
                                case 2:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    alertDialog$Builder.j(ob6.M0(2131745845, null), new g7c(o7cVar, (byte) 1));
                                    String M0 = ob6.M0(2131745820, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M0;
                                    idVar.U = ob6.M0(2131745801, null);
                                    o7cVar.showDialog(idVar);
                                    break;
                                case 3:
                                    o7cVar.m0();
                                    break;
                                case 4:
                                    if (o7cVar.h.getAlpha() >= 0.5f) {
                                        byte b92 = o7cVar.P;
                                        if (b92 != 0) {
                                            if (b92 != 3) {
                                                if (b92 == 2) {
                                                    o7cVar.F0();
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o7cVar.getParentActivity());
                                                String M02 = ob6.M0(2131742446, null);
                                                id idVar2 = alertDialog$Builder2.a;
                                                idVar2.U = M02;
                                                idVar2.S = ob6.M0(2131742447, null);
                                                alertDialog$Builder2.j(ob6.M0(2131742448, null), new g7c(o7cVar, (byte) 2));
                                                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                                o7cVar.showDialog(idVar2);
                                                TextView textView22 = (TextView) idVar2.c(-1);
                                                if (textView22 != null) {
                                                    yob.X(textView22, aob.q7, null);
                                                    break;
                                                }
                                            }
                                        } else {
                                            o7cVar.C0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = o7cVar.b0;
                                            o7cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h7c(o7cVar, b72));
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    if (o7cVar.P == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.X = true;
                                        twoStepVerificationActivity.J = o7cVar.V;
                                        twoStepVerificationActivity.K = false;
                                        twoStepVerificationActivity.Y = o7cVar.H;
                                        o7cVar.presentFragment(twoStepVerificationActivity, true);
                                        w56 w56Var = o7cVar.k0;
                                        if (w56Var != null) {
                                            hl.c3(w56Var);
                                            o7cVar.k0 = null;
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    o7cVar.H0();
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = ia1Var;
                a81 a81Var = new a81(this, context);
                this.E = a81Var;
                a81Var.setAlpha(0.0f);
                ia1Var.addView(this.E);
                ia1Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.M = radialProgressView;
                radialProgressView.setSize(hl.L(20.0f));
                this.M.setAlpha(0.0f);
                this.M.setScaleX(0.1f);
                this.M.setScaleY(0.1f);
                this.M.setProgressColor(aob.w0(null, aob.l6, false));
                h8bVar.addView(this.M, tre.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                t8 t8Var = new t8(this, context, b4);
                t8Var.setOnTouchListener(new vqb((byte) 3));
                t8Var.addView(this.actionBar);
                t8Var.addView(this.a);
                t8Var.addView(this.c);
                t8Var.addView(this.d);
                t8Var.addView(this.b);
                this.fragmentView = t8Var;
            default:
                c = 5;
                break;
        }
        yob.h(aob.d6, null, this.fragmentView);
        switch (b5) {
            case 0:
            case 1:
                if (this.V.has_password) {
                    this.actionBar.setTitle(ob6.M0(2131746938, null));
                    this.c.setText(ob6.M0(2131746938, null));
                } else {
                    String M0 = ob6.M0(b5 == 0 ? 2131751670 : 2131746140, null);
                    this.actionBar.setTitle(M0);
                    this.c.setText(M0);
                }
                if (!TextUtils.isEmpty(this.b0)) {
                    this.h.setVisibility(0);
                    this.h.setText(ob6.M0(2131742448, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.s.setText(ob6.M0(b5 == 0 ? 2131751081 : 2131746140, null));
                this.n.setContentDescription(ob6.M0(b5 == 0 ? 2131751081 : 2131746140, null));
                this.n.setImeOptions(268435461);
                this.n.setInputType(jn7.M1);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.G = b5 == 0;
                hl.T3(this.F, false, 0.1f, true, false);
                b29[] b29VarArr = new b29[7];
                this.g0 = b29VarArr;
                b29VarArr[0] = new b29(R.raw.tsv_setup_monkey_idle1, hl.L(120.0f), hl.L(120.0f), true, null);
                this.g0[1] = new b29(R.raw.tsv_setup_monkey_idle2, hl.L(120.0f), hl.L(120.0f), true, null);
                this.g0[2] = new b29(R.raw.tsv_monkey_close, hl.L(120.0f), hl.L(120.0f), true, null);
                this.g0[3] = new b29(R.raw.tsv_setup_monkey_peek, hl.L(120.0f), hl.L(120.0f), true, null);
                this.g0[4] = new b29(R.raw.tsv_setup_monkey_close_and_peek_to_idle, hl.L(120.0f), hl.L(120.0f), true, null);
                this.g0[c] = new b29(R.raw.tsv_setup_monkey_close_and_peek, hl.L(120.0f), hl.L(120.0f), true, null);
                this.g0[6] = new b29(R.raw.tsv_setup_monkey_tracking, hl.L(120.0f), hl.L(120.0f), true, null);
                b29 b29Var = this.g0[6];
                b29Var.h = true;
                b29Var.K(19);
                this.g0[2].N(97, this.j0);
                K0(true);
                if (!(b5 == 1)) {
                    EditTextBoldCursor editTextBoldCursor4 = this.n;
                    ArrayList arrayList = editTextBoldCursor4.g1;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        TextWatcher textWatcher = (TextWatcher) obj;
                        textWatcher.beforeTextChanged("", 0, editTextBoldCursor4.length(), editTextBoldCursor4.length());
                        textWatcher.onTextChanged(editTextBoldCursor4.getText(), 0, editTextBoldCursor4.length(), editTextBoldCursor4.length());
                        textWatcher.afterTextChanged(editTextBoldCursor4.getText());
                    }
                    b = 0;
                    K0(true);
                    break;
                } else {
                    f7c f7cVar = this.h0;
                    if (f7cVar != null) {
                        hl.r(f7cVar);
                    }
                    this.a.setAnimation(this.g0[6]);
                    this.a.d();
                    b = 0;
                    break;
                }
            case 2:
                this.actionBar.setTitle(ob6.M0(2131747171, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(ob6.M0(2131742448, null));
                this.c.setText(ob6.M0(2131747171, null));
                this.d.setText(ob6.M0(2131747170, null));
                this.d.setVisibility(0);
                this.s.setText(ob6.M0(2131747169, null));
                this.n.setContentDescription(ob6.M0(2131747169, null));
                this.n.setImeOptions(268435461);
                this.w.setVisibility(8);
                this.a.f(R.raw.tsv_setup_hint, jn7.E1, jn7.E1, null);
                this.a.d();
                b = 0;
                break;
            case 3:
                this.actionBar.setTitle(ob6.M0(2131746071, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (this.a0) {
                    r12 = 0;
                } else {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(ob6.M0(2131742448, null));
                }
                this.c.setText(ob6.M0(2131746071, r12));
                this.d.setText(ob6.M0(2131746072, r12));
                this.d.setVisibility(0);
                this.s.setText(ob6.M0(2131747103, r12));
                this.n.setContentDescription(ob6.M0(2131747103, r12));
                this.n.setImeOptions(268435461);
                this.n.setInputType(33);
                this.w.setVisibility(8);
                this.a.f(R.raw.tsv_setup_email_sent, jn7.E1, jn7.E1, r12);
                this.a.d();
                b = 0;
                break;
            case 4:
                this.actionBar.setTitle(ob6.M0(2131747164, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(ob6.M0(2131747164, null));
                this.f0.setVisibility(0);
                this.s.setVisibility(8);
                String str = this.V.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str2);
                int indexOf = str2.indexOf(42);
                int lastIndexOf = str2.lastIndexOf(42);
                if (indexOf == lastIndexOf || indexOf == -1 || lastIndexOf == -1) {
                    r10 = 0;
                } else {
                    rmb rmbVar = new rmb();
                    rmbVar.a |= 256;
                    rmbVar.b = indexOf;
                    int i7 = lastIndexOf + 1;
                    rmbVar.c = i7;
                    r10 = 0;
                    valueOf.setSpan(new smb(rmbVar, 0), indexOf, i7, 0);
                }
                tpa tpaVar2 = this.d;
                String M02 = ob6.M0(2131745807, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r10] = valueOf;
                tpaVar2.setText(hl.m0(M02, charSequenceArr));
                this.d.setVisibility(r10);
                this.d0.e(r10, r10);
                this.x.setVisibility(r10);
                this.a.f(R.raw.tsv_setup_mail, jn7.E1, jn7.E1, null);
                this.a.d();
                b = 0;
                break;
            case 5:
                this.actionBar.setTitle(ob6.M0(2131743274, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(ob6.M0(2131743274, null));
                this.s.setVisibility(8);
                this.f0.setVisibility(0);
                tpa tpaVar3 = this.d;
                String str3 = this.V.email_unconfirmed_pattern;
                tpaVar3.setText(ob6.a0("EmailPasswordConfirmText2", null, 2131751164, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.d0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(ob6.M0(2131745848, null));
                final byte b13 = 3;
                this.h.setOnClickListener(new View.OnClickListener(this) { // from class: c7c
                    public final /* synthetic */ o7c b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b62 = b13;
                        byte b72 = 1;
                        o7c o7cVar = this.b;
                        switch (b62) {
                            case 0:
                                o7cVar.H0();
                                break;
                            case 1:
                                byte b82 = o7cVar.P;
                                o7cVar.N = true;
                                TransformationMethod transformationMethod = o7cVar.n.getTransformationMethod();
                                EditTextBoldCursor editTextBoldCursor32 = o7cVar.n;
                                if (transformationMethod == null) {
                                    editTextBoldCursor32.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    yob.s(o7cVar.F, aob.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (b82 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                        o7cVar.g0[3].K(-1);
                                        b29 animatedDrawable = o7cVar.a.getAnimatedDrawable();
                                        b29 b29Var2 = o7cVar.g0[3];
                                        if (animatedDrawable != b29Var2) {
                                            o7cVar.a.setAnimation(b29Var2);
                                            o7cVar.g0[3].I(18, false, false);
                                        }
                                        o7cVar.a.d();
                                    }
                                } else {
                                    editTextBoldCursor32.setTransformationMethod(null);
                                    yob.s(o7cVar.F, aob.Pe, null, PorterDuff.Mode.MULTIPLY);
                                    if (b82 == 0 && o7cVar.n.length() > 0 && o7cVar.n.hasFocus()) {
                                        o7cVar.g0[3].K(18);
                                        b29 animatedDrawable2 = o7cVar.a.getAnimatedDrawable();
                                        b29 b29Var22 = o7cVar.g0[3];
                                        if (animatedDrawable2 != b29Var22) {
                                            o7cVar.a.setAnimation(b29Var22);
                                        }
                                        o7cVar.g0[3].O(false, 0.0f);
                                        o7cVar.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor22 = o7cVar.n;
                                editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                o7cVar.N = false;
                                break;
                            case 2:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                alertDialog$Builder.j(ob6.M0(2131745845, null), new g7c(o7cVar, (byte) 1));
                                String M03 = ob6.M0(2131745820, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M03;
                                idVar.U = ob6.M0(2131745801, null);
                                o7cVar.showDialog(idVar);
                                break;
                            case 3:
                                o7cVar.m0();
                                break;
                            case 4:
                                if (o7cVar.h.getAlpha() >= 0.5f) {
                                    byte b92 = o7cVar.P;
                                    if (b92 != 0) {
                                        if (b92 != 3) {
                                            if (b92 == 2) {
                                                o7cVar.F0();
                                                break;
                                            }
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o7cVar.getParentActivity());
                                            String M022 = ob6.M0(2131742446, null);
                                            id idVar2 = alertDialog$Builder2.a;
                                            idVar2.U = M022;
                                            idVar2.S = ob6.M0(2131742447, null);
                                            alertDialog$Builder2.j(ob6.M0(2131742448, null), new g7c(o7cVar, (byte) 2));
                                            alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                            o7cVar.showDialog(idVar2);
                                            TextView textView22 = (TextView) idVar2.c(-1);
                                            if (textView22 != null) {
                                                yob.X(textView22, aob.q7, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        o7cVar.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = o7cVar.b0;
                                        o7cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h7c(o7cVar, b72));
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                if (o7cVar.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = o7cVar.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = o7cVar.H;
                                    o7cVar.presentFragment(twoStepVerificationActivity, true);
                                    w56 w56Var = o7cVar.k0;
                                    if (w56Var != null) {
                                        hl.c3(w56Var);
                                        o7cVar.k0 = null;
                                        break;
                                    }
                                }
                                break;
                            default:
                                o7cVar.H0();
                                break;
                        }
                    }
                });
                this.x.setVisibility(0);
                this.a.f(R.raw.tsv_setup_mail, jn7.E1, jn7.E1, null);
                this.a.d();
                b = 0;
                break;
            case 6:
                this.c.setText(ob6.M0(2131743586, null));
                this.d.setText(ob6.M0(2131745276, null));
                this.b.setText(ob6.M0(2131743588, null));
                this.d.setVisibility(0);
                this.a.f(R.raw.tsv_setup_intro, jn7.V1, jn7.V1, null);
                this.a.d();
                b = 0;
                break;
            case 7:
                this.c.setText(ob6.M0(2131743590, null));
                this.d.setText(ob6.M0(2131743589, null));
                if (this.Z) {
                    this.b.setText(ob6.M0(2131743592, null));
                } else {
                    boolean z = this.I;
                    TextView textView6 = this.b;
                    if (z) {
                        textView6.setText(ob6.M0(2131751736, null));
                    } else {
                        textView6.setText(ob6.M0(2131743591, null));
                    }
                }
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_allset, jn7.p2, jn7.p2, null);
                this.a.d();
                b = 0;
                break;
            case 8:
                this.actionBar.setTitle(ob6.M0(2131746944, null));
                this.c.setText(ob6.M0(2131746944, null));
                this.d.setText(ob6.M0(2131752125, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(ob6.M0(2131750551, null));
                yob.X(this.e, aob.o6, null);
                this.s.setText(ob6.M0(2131748480, null));
                this.n.setContentDescription(ob6.M0(2131748480, null));
                this.n.setImeOptions(268435462);
                this.n.setInputType(jn7.M1);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.a.f(R.raw.wallet_science, jn7.E1, jn7.E1, null);
                this.a.d();
                b = 0;
                break;
            case 9:
                this.c.setText(ob6.M0(2131752124, null));
                this.d.setText(ob6.M0(2131752123, null));
                this.b.setText(ob6.M0(2131752126, null));
                this.d.setVisibility(0);
                this.a.f(R.raw.wallet_perfect, jn7.V1, jn7.V1, null);
                this.a.d();
                b = 0;
                break;
            default:
                b = 0;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new l7c(this, b));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean finishFragment(boolean z) {
        for (e eVar : getParentLayout().getFragmentStack()) {
            if (eVar != this && (eVar instanceof o7c)) {
                ((bec) ((o7c) eVar).c0.b).b = true;
            }
        }
        return super.finishFragment(z);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        arrayList.add(new apb(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D6));
        arrayList.add(new apb(this.n, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.H6));
        arrayList.add(new apb(this.n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb(this.n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean hideKeyboardOnShow() {
        byte b = this.P;
        return b == 7 || b == 9;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.H < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void k0(Runnable runnable) {
        int i = 0;
        while (true) {
            bf6 bf6Var = this.x;
            ok2[] ok2VarArr = bf6Var.f;
            if (i >= ok2VarArr.length) {
                bf6Var.postDelayed(new bcb((Object) this, (Object) runnable, (byte) 28), (ok2VarArr.length * 75) + 350);
                return;
            } else {
                ok2 ok2Var = ok2VarArr[i];
                ok2Var.postDelayed(new ny7(ok2Var, (byte) 1), i * 75);
                i++;
            }
        }
    }

    public final boolean l0() {
        byte b = this.P;
        if ((b != 5 && b != 4) || hl.O1()) {
            return false;
        }
        Point point = hl.q;
        return point.x < point.y && !hl.A1();
    }

    public final void m0() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new xe2((byte) 0));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131745847, null);
        id idVar = alertDialog$Builder.a;
        idVar.U = M0;
        idVar.S = ob6.M0(2131743586, null);
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        showDialog(idVar);
    }

    public final /* synthetic */ void n0() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e) arrayList.get(i)).removeSelfFromStack();
        }
        jn7.f(this.currentAccount).k(jn7.p0, new Object[0]);
        finishFragment();
    }

    public final void o0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            if (!TwoStepVerificationActivity.a0(password, false)) {
                jj.u0(getParentActivity(), ob6.M0(2131743475, null), true);
                return;
            }
            this.U = !TextUtils.isEmpty(this.V.email_unconfirmed_pattern);
            TwoStepVerificationActivity.e0(this.V);
            if (!this.T && this.Z) {
                TL_account.Password password2 = this.V;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!this.U && passwordKdfAlgo != null) {
                        jn7.f(this.currentAccount).k(jn7.p0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        finishFragment();
                    }
                }
            }
            if (this.O) {
                B0();
                H0();
            }
            jn7.f(this.currentAccount).k(jn7.q0, this.V);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (this.H < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            if (z) {
                finishFragment();
            }
            return true;
        }
        if (!z) {
            return false;
        }
        N0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a != null) {
            byte b = this.P;
            if (b == 2 && hl.M1()) {
                this.a.setVisibility(8);
            } else if (b != 6 && b != 9 && b != 7) {
                e29 e29Var = this.a;
                Point point = hl.q;
                e29Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        k53 k53Var = this.f0;
        if (k53Var != null) {
            k53Var.setVisibility(l0() ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.O = false;
        f7c f7cVar = this.h0;
        if (f7cVar != null) {
            hl.r(f7cVar);
            this.h0 = null;
        }
        if (this.g0 != null) {
            int i = 0;
            while (true) {
                b29[] b29VarArr = this.g0;
                if (i >= b29VarArr.length) {
                    break;
                }
                b29VarArr[i].x(false);
                i++;
            }
            this.g0 = null;
        }
        hl.y2(getParentActivity(), this.classGuid);
        if (l0()) {
            hl.z2(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        this.T = true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        this.T = false;
        hl.V2(getParentActivity(), this.classGuid);
        if (l0()) {
            hl.W2(getParentActivity(), this.classGuid);
            hl.t1(this.fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            w2c w2cVar = this.e0;
            if (w2cVar != null) {
                w2cVar.setColor(aob.w0(null, aob.O9, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            int w0 = aob.w0(null, aob.l6, false);
            RadialProgressView radialProgressView = this.M;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(w0);
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            if (this.n != null && !l0()) {
                hl.d3(new f7c(this, (byte) 2), 200L);
            }
            bf6 bf6Var = this.x;
            if (bf6Var == null || bf6Var.getVisibility() != 0) {
                return;
            }
            hl.d3(new f7c(this, (byte) 3), 200L);
        }
    }

    public final /* synthetic */ void p0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            TwoStepVerificationActivity.e0(password);
            jn7.f(this.currentAccount).k(jn7.q0, this.V);
            H0();
        }
    }

    public final void q0(TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h7c(this, (byte) 4), 8);
            return;
        }
        B0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            this.d.setText(ob6.M0(2131752122, null));
            yob.X(this.d, aob.p7, null);
            E0(this.s, this.n, true);
            M0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            L0(ob6.M0(R.string.AppName, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            L0(ob6.M0(R.string.AppName, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    public final /* synthetic */ void r0(byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.V.current_algo;
        byte[] c = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? es9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        isa isaVar = new isa(this, c, (byte) 20);
        TL_account.Password password = this.V;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            isaVar.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = es9.d(c, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, isaVar, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        isaVar.run(null, tL_error2);
    }

    public final void s0(String str) {
        o7c o7cVar = new o7c(this.currentAccount, 0, this.V);
        o7cVar.I = this.I;
        o7cVar.K.addAll(this.K);
        o7cVar.K.add(this);
        o7cVar.b0 = str;
        o7cVar.H = this.H;
        presentFragment(o7cVar, true);
    }

    public final void t0() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e) arrayList.get(i)).removeSelfFromStack();
        }
        jn7 f = jn7.f(this.currentAccount);
        byte[] bArr = this.W;
        TL_account.Password password = this.V;
        f.k(jn7.p0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, this.S, this.R, null, this.Q);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = this.V;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.A0(password2, this.W, this.X, this.Y);
        twoStepVerificationActivity.Y = this.H;
        presentFragment(twoStepVerificationActivity, true);
        jn7.f(this.currentAccount).k(jn7.q0, this.V);
        w56 w56Var = this.k0;
        if (w56Var != null) {
            hl.c3(w56Var);
            this.k0 = null;
        }
    }

    public final void u0() {
        byte b = 4;
        if (this.V.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.j(ob6.M0(2131747558, null), new g7c(this, b));
            boolean z = this.V.has_recovery;
            id idVar = alertDialog$Builder.a;
            if (z) {
                idVar.U = ob6.M0(2131742445, null);
            } else {
                idVar.U = ob6.M0(2131742444, null);
            }
            idVar.S = ob6.M0(2131742429, null);
            Dialog showDialog = showDialog(idVar);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e) arrayList.get(i)).removeSelfFromStack();
        }
        TL_account.Password password = this.V;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        o7c o7cVar = new o7c(7, password);
        o7cVar.I = this.I;
        o7cVar.I0(this.W, this.X, this.Y, this.a0);
        o7cVar.K.addAll(arrayList);
        o7cVar.Z = this.Z;
        o7cVar.H = this.H;
        presentFragment(o7cVar, true);
        jn7 f = jn7.f(this.currentAccount);
        byte[] bArr = this.W;
        TL_account.Password password2 = this.V;
        f.k(jn7.p0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, this.S, this.R, null, this.Q);
        jn7.f(this.currentAccount).k(jn7.q0, this.V);
    }

    public final void w0(TLRPC.TL_error tL_error) {
        B0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = this.V;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.A0(password, this.W, this.X, this.Y);
            twoStepVerificationActivity.Y = this.H;
            presentFragment(twoStepVerificationActivity, true);
            jn7.f(this.currentAccount).k(jn7.r0, new Object[0]);
            w56 w56Var = this.k0;
            if (w56Var != null) {
                hl.c3(w56Var);
                this.k0 = null;
            }
        }
    }

    public final /* synthetic */ void x0(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            TwoStepVerificationActivity.e0(password);
            J0(z);
            jn7.f(this.currentAccount).k(jn7.q0, this.V);
        }
    }

    public final void y0(byte[] bArr) {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e) arrayList.get(i)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = this.V;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = this.V;
        if (bArr == null) {
            bArr = this.W;
        }
        twoStepVerificationActivity.A0(password2, bArr, this.X, this.Y);
        twoStepVerificationActivity.Y = this.H;
        presentFragment(twoStepVerificationActivity, true);
        jn7.f(this.currentAccount).k(jn7.q0, this.V);
        w56 w56Var = this.k0;
        if (w56Var != null) {
            hl.c3(w56Var);
            this.k0 = null;
        }
    }

    public final void z0(TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new q81((byte) 11, this, z), 8);
            return;
        }
        B0();
        int i = jn7.p0;
        ArrayList arrayList = this.K;
        if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    L0(ob6.M0(R.string.AppName, null), ob6.M0(2131747172, null));
                    return;
                }
                if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                    L0(ob6.M0(R.string.AppName, null), ob6.M0(2131751165, null));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    L0(ob6.M0(R.string.AppName, null), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    L0(ob6.M0(R.string.AppName, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                    return;
                }
            }
            jn7.f(this.currentAccount).k(i, new Object[0]);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((e) arrayList.get(i2)).removeSelfFromStack();
            }
            jn7 f = jn7.f(this.currentAccount);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password2 = this.V;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
            byte[] bArr2 = password2.secure_random;
            String str2 = this.S;
            f.k(i, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, this.R, str2, this.Q);
            TL_account.Password password3 = this.V;
            password3.email_unconfirmed_pattern = this.S;
            o7c o7cVar = new o7c(5, password3);
            o7cVar.I = this.I;
            o7cVar.I0(bArr != null ? bArr : this.W, this.X, this.Y, this.a0);
            o7cVar.Z = this.Z;
            o7cVar.H = this.H;
            presentFragment(o7cVar, true);
            return;
        }
        if ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization)) {
            getMessagesController().v4(0L, "VALIDATE_PASSWORD");
            int i3 = jn7.q0;
            if (z) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((e) arrayList.get(i4)).removeSelfFromStack();
                }
                jn7.f(this.currentAccount).k(jn7.r0, new Object[0]);
                jn7.f(this.currentAccount).k(i3, new Object[0]);
                finishFragment();
                return;
            }
            if (getParentActivity() != null) {
                if (this.V.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.j(ob6.M0(2131747558, null), new yw9(this, bArr, (byte) 17));
                    id idVar = alertDialog$Builder.a;
                    if (str == null && (password = this.V) != null && password.has_password) {
                        idVar.U = ob6.M0(2131742444, null);
                    } else {
                        idVar.U = ob6.M0(2131742435, null);
                    }
                    idVar.S = ob6.M0(2131742429, null);
                    Dialog showDialog = showDialog(idVar);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    ((e) arrayList.get(i5)).removeSelfFromStack();
                }
                TL_account.Password password4 = this.V;
                password4.has_password = true;
                if (!password4.has_recovery) {
                    password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
                }
                if (this.Z) {
                    jn7.f(this.currentAccount).k(i, new Object[0]);
                }
                o7c o7cVar2 = new o7c(7, this.V);
                o7cVar2.I = this.I;
                o7cVar2.I0(bArr != null ? bArr : this.W, this.X, this.Y, this.a0);
                o7cVar2.Z = this.Z;
                o7cVar2.H = this.H;
                presentFragment(o7cVar2, true);
                jn7.f(this.currentAccount).k(i3, this.V);
            }
        }
    }

    public void G0() {
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void finishFragment() {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle l = bs2.l("afterSignup", true);
            fj6 fj6Var = new fj6();
            fj6Var.s0(l);
            presentFragment(fj6Var, true);
            return;
        }
        super.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o7c(int i, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.i0 = new f7c(this, (byte) 0);
        this.j0 = new f7c(this, (byte) 1);
        this.P = i;
        this.V = password;
        if (password == null && (i == 6 || i == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h7c(this, (byte) 0), 10);
        } else {
            this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }
}
