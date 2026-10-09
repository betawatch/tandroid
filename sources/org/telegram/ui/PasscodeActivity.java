package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public String F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public org.telegram.ui.ActionBar.v0 Q;
    public boolean R;
    public final nl0 S;
    public ol0 T;
    public zb0 U;
    public ii1 V;
    public org.telegram.ui.Components.fk0 a;
    private int autoLockRow;
    public sl0 b;
    public org.telegram.ui.Components.qm0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.v11 e;
    public org.telegram.ui.Components.zd0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public ce0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.ls v;
    public org.telegram.ui.Components.p20 w;
    public final int x;
    public int y;

    public PasscodeActivity(int i10) {
        super(null);
        this.y = 0;
        this.E = 0;
        this.S = new nl0(this, 5);
        this.x = i10;
    }

    public static /* synthetic */ void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.ud0 ud0Var, int i10) {
        int value = ud0Var.getValue();
        if (value == 0) {
            SharedConfig.autoLockIn = 0;
        } else if (value == 1) {
            SharedConfig.autoLockIn = 60;
        } else if (value == 2) {
            SharedConfig.autoLockIn = 300;
        } else if (value == 3) {
            SharedConfig.autoLockIn = 3600;
        } else if (value == 4) {
            SharedConfig.autoLockIn = 18000;
        }
        passcodeActivity.b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void V(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            int i11 = 0;
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new gu(passcodeActivity, 28));
                b2Var.show();
                ((TextView) b2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                return;
            }
            if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
                return;
            }
            if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string2 = LocaleController.getString(R.string.AutoLock);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.R = string2;
                org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(passcodeActivity.getParentActivity(), null);
                ud0Var.setMinValue(0);
                ud0Var.setMaxValue(4);
                int i12 = SharedConfig.autoLockIn;
                if (i12 == 0) {
                    ud0Var.setValue(0);
                } else if (i12 == 60) {
                    ud0Var.setValue(1);
                } else if (i12 == 300) {
                    ud0Var.setValue(2);
                } else if (i12 == 3600) {
                    ud0Var.setValue(3);
                } else if (i12 == 18000) {
                    ud0Var.setValue(4);
                }
                ud0Var.setFormatter(new a80(5));
                alertDialog$Builder2.n(ud0Var);
                alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new gg.c2(passcodeActivity, ud0Var, i10, 14));
                passcodeActivity.showDialog(b2Var2);
                return;
            }
            if (i10 == passcodeActivity.fingerprintRow) {
                SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.useFingerprintLock);
                return;
            }
            if (i10 == passcodeActivity.N) {
                SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.allowScreenCapture);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                if (SharedConfig.allowScreenCapture) {
                    return;
                }
                org.telegram.ui.Components.g5.t0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                return;
            }
            if (i10 == passcodeActivity.J) {
                org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(passcodeActivity.currentAccount);
                boolean z10 = !v.H();
                if (v.m != z10) {
                    v.m = z10;
                    try {
                        org.telegram.ui.Wallet.k0.u().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", v.m).apply();
                    } catch (Exception e7) {
                        org.telegram.ui.Wallet.k0.j("failed to save prefs", e7);
                    }
                }
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.w8) view).setChecked(v.H());
                return;
            }
            if (i10 == passcodeActivity.K) {
                org.telegram.ui.Wallet.k0 v9 = org.telegram.ui.Wallet.k0.v(passcodeActivity.currentAccount);
                boolean G = v9.G();
                boolean z11 = !G;
                ai.j3 j3Var = new ai.j3(6, view, G);
                org.telegram.ui.Wallet.p0 p0Var = v9.c;
                if (p0Var == null) {
                    j3Var.run(Boolean.FALSE);
                } else {
                    org.telegram.ui.Wallet.p0.h.execute(new org.telegram.messenger.o8(p0Var, p0Var.l(), z11, new org.telegram.ui.Wallet.j(j3Var, i11), 10));
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 e0() {
        return !SharedConfig.passcodeHash.isEmpty() ? new PasscodeActivity(2) : new h(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03ef A[LOOP:0: B:51:0x03ed->B:52:0x03ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i10;
        org.telegram.ui.ActionBar.f1 f1Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = false;
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 12));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = 1;
        int i12 = this.x;
        if (i12 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, w7.x5.d(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        org.telegram.ui.Components.xa0 xa0Var = new org.telegram.ui.Components.xa0(this, context, frameLayout, 1);
        xa0Var.setDelegate(new qd0(1, this));
        this.fragmentView = xa0Var;
        xa0Var.addView(frameLayout, w7.x5.l(1.0f, -1, 0));
        org.telegram.ui.Components.ls lsVar = new org.telegram.ui.Components.ls(context);
        this.v = lsVar;
        lsVar.setVisibility(f0() ? 0 : 8);
        xa0Var.addView(this.v, w7.x5.n(-1, 230));
        if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Passcode));
            int i13 = org.telegram.ui.ActionBar.i6.a7;
            frameLayout2.setTag(Integer.valueOf(i13));
            frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
            org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
            this.c = qm0Var;
            qm0Var.p1();
            this.actionBar.setAdaptiveBackground(this.c);
            this.c.setLayoutManager(new gg.a0(i11, z10, 14));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, w7.x5.d(-1.0f, -1));
            org.telegram.ui.Components.qm0 qm0Var2 = this.c;
            sl0 sl0Var = new sl0(this, context);
            this.b = sl0Var;
            qm0Var2.setAdapter(sl0Var);
            this.c.setOnItemClickListener(new i(this, 19));
        } else if (i12 == 1 || i12 == 2 || i12 == 3) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.actionBar.D(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false), false);
                this.actionBar.C(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.u8, false), false);
                this.actionBar.setCastShadows(false);
                org.telegram.ui.ActionBar.z o9 = this.actionBar.o();
                if (i12 == 1) {
                    org.telegram.ui.ActionBar.v0 a2 = o9.a(0, R.drawable.ic_ab_other);
                    this.Q = a2;
                    f1Var = a2.e(1, R.drawable.msg_permissions, LocaleController.getString(R.string.PasscodeSwitchToPassword));
                } else {
                    f1Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new ql0(this, f1Var));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, w7.x5.d(-1.0f, -1));
            org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(context);
            this.a = fk0Var;
            fk0Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            org.telegram.ui.Components.fk0 fk0Var2 = this.a;
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    fk0Var2.setVisibility(i10);
                    linearLayout.addView(this.a, w7.x5.q(120, 120, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i14 = org.telegram.ui.ActionBar.i6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
                    this.d.setTypeface(AndroidUtilities.bold());
                    if (i12 == 1) {
                        this.d.setText(LocaleController.getString(R.string.EnterYourPasscode));
                    } else if (SharedConfig.passcodeHash.isEmpty()) {
                        this.d.setText(LocaleController.getString(R.string.CreatePasscode));
                    } else {
                        this.d.setText(LocaleController.getString(R.string.EnterNewPasscode));
                    }
                    this.d.setTextSize(1, 18.0f);
                    this.d.setGravity(1);
                    linearLayout.addView(this.d, w7.x5.t(-2, -2, 1, 0, 16, 0, 0));
                    org.telegram.ui.Components.v11 v11Var = new org.telegram.ui.Components.v11(context);
                    this.e = v11Var;
                    v11Var.setFactory(new rg0(context, 1));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, w7.x5.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false));
                    textView2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    textView2.setGravity((!g0() ? 3 : 1) | 16);
                    textView2.setOnClickListener(new m60(context, 11));
                    textView2.setVisibility(i12 != 2 ? 0 : 8);
                    textView2.setText(LocaleController.getString(R.string.ForgotPasscode));
                    frameLayout2.addView(textView2, w7.x5.a(56.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 81));
                    la.h.n(textView2);
                    TextView textView3 = new TextView(context);
                    this.r = textView3;
                    textView3.setTextSize(1, 14.0f);
                    this.r.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false));
                    this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
                    this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                    AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
                    frameLayout2.addView(this.r, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 16.0f, -2, 81));
                    org.telegram.ui.Components.zd0 zd0Var = new org.telegram.ui.Components.zd0(context, null);
                    this.f = zd0Var;
                    zd0Var.setText(LocaleController.getString(R.string.EnterPassword));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    this.h.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
                    this.h.setBackground(null);
                    this.h.setMaxLines(1);
                    this.h.setLines(1);
                    this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
                    this.h.setSingleLine(true);
                    if (i12 != 1) {
                        this.E = 0;
                        this.h.setImeOptions(5);
                    } else {
                        this.E = 1;
                        this.h.setImeOptions(6);
                    }
                    this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.h.setTypeface(Typeface.DEFAULT);
                    this.h.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.l6, false));
                    this.h.setCursorSize(AndroidUtilities.dp(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int dp = AndroidUtilities.dp(16.0f);
                    this.h.setPadding(dp, dp, dp, dp);
                    this.h.setOnFocusChangeListener(new pd(this, 10));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, w7.x5.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    this.s.setColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.H6, false));
                    this.s.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.i6), 1, -1));
                    AndroidUtilities.updateViewVisibilityAnimated(this.s, i12 != 1 && this.E == 0, 0.1f, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new org.telegram.ui.Components.ho(3, this, atomicBoolean));
                    this.s.setOnClickListener(new rv(23, this, atomicBoolean));
                    linearLayout2.addView(this.s, w7.x5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, w7.x5.d(-2.0f, -1));
                    frameLayout3.addView(this.f, w7.x5.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new ja(this, 8));
                    this.h.addTextChangedListener(new rl0(this, 0));
                    this.h.setCustomSelectionActionModeCallback(new ii.d1(2));
                    ce0 ce0Var = new ce0(this, context, 2);
                    this.n = ce0Var;
                    ce0Var.b(4, 10);
                    for (es esVar : this.n.f) {
                        esVar.setShowSoftInputOnFocusCompat(!f0());
                        esVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        esVar.setTextSize(1, 24.0f);
                        esVar.addTextChangedListener(new rl0(this, 1));
                        esVar.setOnFocusChangeListener(new ei.w1(this, esVar, 3));
                    }
                    frameLayout3.addView(this.n, w7.x5.a(-2.0f, 40.0f, 10.0f, 40.0f, 0.0f, -2, 1));
                    linearLayout.addView(frameLayout3, w7.x5.t(-1, -2, 1, 0, 32, 0, 72));
                    if (i12 == 1) {
                        frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.i6.d6));
                    }
                    org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(context, this.resourceProvider, false);
                    this.w = p20Var;
                    la.h.n(p20Var);
                    frameLayout2.addView(this.w, w7.x5.a(56.0f, 20.0f, 0.0f, 20.0f, 14.0f, 56, (!LocaleController.isRTL ? 3 : 5) | 80));
                    this.w.setOnClickListener(new m60(this, 12));
                    org.telegram.ui.Components.k41 k41Var = new org.telegram.ui.Components.k41(context);
                    k41Var.setTransformType(1);
                    k41Var.setProgress(0.0f);
                    k41Var.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.O9, false));
                    k41Var.setDrawBackground(false);
                    this.w.setContentDescription(LocaleController.getString(R.string.Next));
                    this.w.addView(k41Var, w7.x5.e(56, 56, 17));
                    org.telegram.ui.Components.p20 p20Var2 = this.w;
                    p20Var2.a(p20Var2);
                    o0();
                }
            }
            i10 = 8;
            fk0Var2.setVisibility(i10);
            linearLayout.addView(this.a, w7.x5.q(120, 120, 1));
            TextView textView4 = new TextView(context);
            this.d = textView4;
            int i142 = org.telegram.ui.ActionBar.i6.G6;
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i142, false));
            this.d.setTypeface(AndroidUtilities.bold());
            if (i12 == 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, w7.x5.t(-2, -2, 1, 0, 16, 0, 0));
            org.telegram.ui.Components.v11 v11Var2 = new org.telegram.ui.Components.v11(context);
            this.e = v11Var2;
            v11Var2.setFactory(new rg0(context, 1));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, w7.x5.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView22 = new TextView(context);
            textView22.setTextSize(1, 14.0f);
            textView22.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false));
            textView22.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            textView22.setGravity((!g0() ? 3 : 1) | 16);
            textView22.setOnClickListener(new m60(context, 11));
            textView22.setVisibility(i12 != 2 ? 0 : 8);
            textView22.setText(LocaleController.getString(R.string.ForgotPasscode));
            frameLayout2.addView(textView22, w7.x5.a(56.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 81));
            la.h.n(textView22);
            TextView textView32 = new TextView(context);
            this.r = textView32;
            textView32.setTextSize(1, 14.0f);
            this.r.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false));
            this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
            this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
            frameLayout2.addView(this.r, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 16.0f, -2, 81));
            org.telegram.ui.Components.zd0 zd0Var2 = new org.telegram.ui.Components.zd0(context, null);
            this.f = zd0Var2;
            zd0Var2.setText(LocaleController.getString(R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            this.h.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i142, false));
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
            this.h.setSingleLine(true);
            if (i12 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            this.h.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.l6, false));
            this.h.setCursorSize(AndroidUtilities.dp(20.0f));
            this.h.setCursorWidth(1.5f);
            int dp2 = AndroidUtilities.dp(16.0f);
            this.h.setPadding(dp2, dp2, dp2, dp2);
            this.h.setOnFocusChangeListener(new pd(this, 10));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, w7.x5.l(1.0f, 0, -2));
            ImageView imageView2 = new ImageView(context);
            this.s = imageView2;
            imageView2.setImageResource(R.drawable.msg_message);
            this.s.setColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.H6, false));
            this.s.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.i6), 1, -1));
            AndroidUtilities.updateViewVisibilityAnimated(this.s, i12 != 1 && this.E == 0, 0.1f, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new org.telegram.ui.Components.ho(3, this, atomicBoolean2));
            this.s.setOnClickListener(new rv(23, this, atomicBoolean2));
            linearLayout22.addView(this.s, w7.x5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, w7.x5.d(-2.0f, -1));
            frameLayout3.addView(this.f, w7.x5.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new ja(this, 8));
            this.h.addTextChangedListener(new rl0(this, 0));
            this.h.setCustomSelectionActionModeCallback(new ii.d1(2));
            ce0 ce0Var2 = new ce0(this, context, 2);
            this.n = ce0Var2;
            ce0Var2.b(4, 10);
            while (r10 < r5) {
            }
            frameLayout3.addView(this.n, w7.x5.a(-2.0f, 40.0f, 10.0f, 40.0f, 0.0f, -2, 1));
            linearLayout.addView(frameLayout3, w7.x5.t(-1, -2, 1, 0, 32, 0, 72));
            if (i12 == 1) {
            }
            org.telegram.ui.Components.p20 p20Var3 = new org.telegram.ui.Components.p20(context, this.resourceProvider, false);
            this.w = p20Var3;
            la.h.n(p20Var3);
            frameLayout2.addView(this.w, w7.x5.a(56.0f, 20.0f, 0.0f, 20.0f, 14.0f, 56, (!LocaleController.isRTL ? 3 : 5) | 80));
            this.w.setOnClickListener(new m60(this, 12));
            org.telegram.ui.Components.k41 k41Var2 = new org.telegram.ui.Components.k41(context);
            k41Var2.setTransformType(1);
            k41Var2.setProgress(0.0f);
            k41Var2.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.O9, false));
            k41Var2.setDrawBackground(false);
            this.w.setContentDescription(LocaleController.getString(R.string.Next));
            this.w.addView(k41Var2, w7.x5.e(56, 56, 17));
            org.telegram.ui.Components.p20 p20Var22 = this.w;
            p20Var22.a(p20Var22);
            o0();
        }
        return this.fragmentView;
    }

    public final void d0(Runnable runnable) {
        if (!h0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            ce0 ce0Var = this.n;
            es[] esVarArr = ce0Var.f;
            if (i10 >= esVarArr.length) {
                ce0Var.postDelayed(new tf0(13, this, runnable), (esVarArr.length * 75) + 350);
                return;
            } else {
                es esVar = esVarArr[i10];
                esVar.postDelayed(new pl0(esVar, 0), i10 * 75);
                i10++;
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.x == 0) {
                p0();
                sl0 sl0Var = this.b;
                if (sl0Var != null) {
                    sl0Var.l();
                }
            }
        }
    }

    public final boolean f0() {
        if (!h0() || this.x == 0 || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final boolean g0() {
        int i10 = this.x;
        return (i10 == 1 && this.y == 1) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 1);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.i6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 16, new Class[]{org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.ca.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.i6.a7));
        if (this.x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 262144, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 262144, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        return arrayList;
    }

    public final boolean h0() {
        int i10 = this.x;
        return (i10 == 1 && this.y == 0) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean hasForceLightStatusBar() {
        return this.x != 0;
    }

    public final void i0() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (h0()) {
            for (es esVar : this.n.f) {
                esVar.i(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        AndroidUtilities.shakeViewSpring(h0() ? this.n : this.f, h0() ? 10.0f : 4.0f, new nl0(this, 3));
    }

    public final void j0() {
        if (g0() && this.h.getText().length() == 0) {
            i0();
            return;
        }
        String code = h0() ? this.n.getCode() : this.h.getText().toString();
        int i10 = this.x;
        int i11 = 0;
        if (i10 == 1) {
            if (!this.F.equals(code)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.r, true);
                for (es esVar : this.n.f) {
                    esVar.setText("");
                }
                if (h0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                i0();
                this.n.removeCallbacks(this.S);
                this.n.post(new nl0(this, 0));
                return;
            }
            boolean isEmpty = SharedConfig.passcodeHash.isEmpty();
            try {
                SharedConfig.passcodeSalt = new byte[16];
                Utilities.random.nextBytes(SharedConfig.passcodeSalt);
                byte[] bytes = this.F.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, bytes.length + 16, 16);
                SharedConfig.passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (es esVar2 : this.n.f) {
                esVar2.clearFocus();
                AndroidUtilities.hideKeyboard(esVar2);
            }
            this.v.setEditText(null);
            d0(new ol0(this, isEmpty, i11));
            return;
        }
        if (i10 == 2 || i10 == 3) {
            long j3 = SharedConfig.passcodeRetryInMs;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j3 / 1000.0d)), new Object[0])), 0).show();
                for (es esVar3 : this.n.f) {
                    esVar3.setText("");
                }
                this.h.setText("");
                if (h0()) {
                    this.n.f[0].requestFocus();
                }
                i0();
                return;
            }
            if (!SharedConfig.checkPasscode(code)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (es esVar4 : this.n.f) {
                    esVar4.setText("");
                }
                if (h0()) {
                    this.n.f[0].requestFocus();
                }
                i0();
                return;
            }
            SharedConfig.badPasscodeTries = 0;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            es[] esVarArr = this.n.f;
            int length2 = esVarArr.length;
            while (i11 < length2) {
                es esVar5 = esVarArr[i11];
                esVar5.clearFocus();
                AndroidUtilities.hideKeyboard(esVar5);
                i11++;
            }
            this.v.setEditText(null);
            if (i10 == 3) {
                d0(new nl0(this, 1));
            } else {
                d0(new nl0(this, 2));
            }
        }
    }

    public final void k0() {
        if ((this.y == 1 && this.h.getText().length() == 0) || (this.y == 0 && this.n.getCode().length() != 4)) {
            i0();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.Q;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        this.F = h0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (es esVar : this.n.f) {
            esVar.setText("");
        }
        n0();
        this.E = 1;
    }

    public final void l0(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
        if (!z11) {
            this.v.setVisibility(z10 ? 0 : 8);
            this.v.setAlpha(z10 ? 1.0f : 0.0f);
            this.v.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(230.0f));
            this.fragmentView.requestLayout();
            return;
        }
        int i10 = 2;
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z10 ? org.telegram.ui.Components.hs.f : org.telegram.ui.Components.au.e);
        duration.addUpdateListener(new c3(this, 19));
        duration.addListener(new f70(i10, this, z10));
        duration.start();
    }

    public final void m0(Runnable runnable) {
        this.U = (zb0) runnable;
    }

    public final void n0() {
        if (h0()) {
            this.n.f[0].requestFocus();
            if (f0()) {
                return;
            }
            AndroidUtilities.showKeyboard(this.n.f[0]);
            return;
        }
        if (g0()) {
            this.h.requestFocus();
            AndroidUtilities.showKeyboard(this.h);
        }
    }

    public final void o0() {
        String charSequence;
        int i10 = this.x;
        if (i10 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (i10 == 3) {
            charSequence = LocaleController.getString(R.string.WalletAuthorizeTransactionPasscode);
        } else if (this.E == 0) {
            charSequence = LocaleController.getString(this.y == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        boolean z10 = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (i10 == 2) {
            this.e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z10, false);
        } else if (i10 == 3) {
            this.e.setText(LocaleController.getString(R.string.WalletAuthorizeTransactionPasscode));
        } else if (this.E == 0) {
            this.e.a(LocaleController.getString(this.y == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword), z10, false);
        }
        if (h0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f, false, 1.0f, z10);
        } else if (g0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f, true, 1.0f, z10);
        }
        if (g0()) {
            ol0 ol0Var = new ol0(this, z10, 1);
            this.T = ol0Var;
            AndroidUtilities.runOnUIThread(ol0Var, 3000L);
        } else {
            this.w.e(false, z10);
        }
        l0(f0(), z10);
        n0();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        es[] esVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        l0(f0(), false);
        org.telegram.ui.Components.fk0 fk0Var = this.a;
        if (fk0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    fk0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            fk0Var.setVisibility(i10);
        }
        ce0 ce0Var = this.n;
        if (ce0Var == null || (esVarArr = ce0Var.f) == null) {
            return;
        }
        for (es esVar : esVarArr) {
            esVar.setShowSoftInputOnFocusCompat(!f0());
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        p0();
        if (this.x != 0) {
            return true;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.x == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetPasscode);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        sl0 sl0Var = this.b;
        if (sl0Var != null) {
            sl0Var.l();
        }
        if (this.x != 0 && !f0()) {
            AndroidUtilities.runOnUIThread(new nl0(this, 6), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (f0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.x == 0) {
            return;
        }
        n0();
    }

    public final void p0() {
        this.I = -1;
        this.J = -1;
        this.fingerprintRow = -1;
        this.K = -1;
        this.L = -1;
        this.G = 1;
        this.P = 3;
        this.changePasscodeRow = 2;
        try {
            if (new aa.a(new k6.h(ApplicationLoader.applicationContext, 1)).f(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i10 = this.P;
                this.P = i10 + 1;
                this.fingerprintRow = i10;
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        int i11 = this.P;
        this.autoLockRow = i11;
        this.P = i11 + 2;
        this.H = i11 + 1;
        if (getMessagesController().config.walletAvailable.get()) {
            int i12 = this.P;
            this.I = i12;
            this.P = i12 + 2;
            this.J = i12 + 1;
            if (org.telegram.ui.Wallet.p0.i(ApplicationLoader.applicationContext)) {
                int i13 = this.P;
                this.P = i13 + 1;
                this.K = i13;
            }
            int i14 = this.P;
            this.P = i14 + 1;
            this.L = i14;
        }
        int i15 = this.P;
        this.M = i15;
        this.N = i15 + 1;
        this.O = i15 + 2;
        this.P = i15 + 4;
        this.disablePasscodeRow = i15 + 3;
    }
}
