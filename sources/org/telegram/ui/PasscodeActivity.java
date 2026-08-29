package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public String B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public org.telegram.ui.ActionBar.w0 I;
    public boolean J;
    public final qk0 K;
    public rk0 L;
    public hb0 M;
    public org.telegram.ui.Components.aj0 a;
    private int autoLockRow;
    public wk0 b;
    public org.telegram.ui.Components.jl0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.j01 e;
    public org.telegram.ui.Components.uc0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public md0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.or v;
    public org.telegram.ui.Components.u10 w;
    public final int x;
    public int y;

    public PasscodeActivity(int i10) {
        super(null);
        this.y = 0;
        this.A = 0;
        this.K = new qk0(this, 4);
        this.x = i10;
    }

    public static /* synthetic */ void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.qc0 qc0Var, int i10) {
        int value = qc0Var.getValue();
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
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new xt(passcodeActivity, 29));
                c2Var.show();
                ((TextView) c2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                return;
            }
            if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
                return;
            }
            if (i10 != passcodeActivity.autoLockRow) {
                if (i10 == passcodeActivity.fingerprintRow) {
                    SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                    UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                    ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.useFingerprintLock);
                    return;
                } else {
                    if (i10 == passcodeActivity.F) {
                        SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                        ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.allowScreenCapture);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                        if (SharedConfig.allowScreenCapture) {
                            return;
                        }
                        org.telegram.ui.Components.c5.u0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                        return;
                    }
                    return;
                }
            }
            if (passcodeActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
            String string2 = LocaleController.getString(R.string.AutoLock);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.N = string2;
            org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(passcodeActivity.getParentActivity(), null);
            qc0Var.setMinValue(0);
            qc0Var.setMaxValue(4);
            int i11 = SharedConfig.autoLockIn;
            if (i11 == 0) {
                qc0Var.setValue(0);
            } else if (i11 == 60) {
                qc0Var.setValue(1);
            } else if (i11 == 300) {
                qc0Var.setValue(2);
            } else if (i11 == 3600) {
                qc0Var.setValue(3);
            } else if (i11 == 18000) {
                qc0Var.setValue(4);
            }
            qc0Var.setFormatter(new org.telegram.ui.Components.xo0(25));
            alertDialog$Builder2.n(qc0Var);
            alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new e3.d(passcodeActivity, qc0Var, i10, 11));
            passcodeActivity.showDialog(c2Var2);
        }
    }

    public static org.telegram.ui.ActionBar.o2 b0() {
        return !SharedConfig.passcodeHash.isEmpty() ? new PasscodeActivity(2) : new i(6);
    }

    public final void a0(Runnable runnable) {
        if (!e0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            md0 md0Var = this.n;
            ur[] urVarArr = md0Var.f;
            if (i10 >= urVarArr.length) {
                md0Var.postDelayed(new lf0(8, this, runnable), (urVarArr.length * 75) + 350);
                return;
            } else {
                ur urVar = urVarArr[i10];
                urVar.postDelayed(new sk0(urVar, 0), i10 * 75);
                i10++;
            }
        }
    }

    public final boolean c0() {
        if (!e0() || this.x == 0 || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03ee A[LOOP:0: B:50:0x03ec->B:51:0x03ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = false;
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 29));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = 1;
        int i12 = this.x;
        if (i12 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, i7.f6.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(this, context, frameLayout, 1);
        s90Var.setDelegate(new ad0(1, this));
        this.fragmentView = s90Var;
        s90Var.addView(frameLayout, i7.f6.l(1.0f, -1, 0));
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(context);
        this.v = orVar;
        orVar.setVisibility(c0() ? 0 : 8);
        s90Var.addView(this.v, i7.f6.n(-1, 230));
        if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Passcode));
            int i13 = org.telegram.ui.ActionBar.g6.a7;
            frameLayout2.setTag(Integer.valueOf(i13));
            frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
            this.c = jl0Var;
            jl0Var.p1();
            this.actionBar.setAdaptiveBackground(this.c);
            this.c.setLayoutManager(new k(i11, z10, 12));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, i7.f6.c(-1.0f, -1));
            org.telegram.ui.Components.jl0 jl0Var2 = this.c;
            wk0 wk0Var = new wk0(this, context);
            this.b = wk0Var;
            jl0Var2.setAdapter(wk0Var);
            this.c.setOnItemClickListener(new j(this, 19));
        } else if (i12 == 1 || i12 == 2) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), false);
                this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.u8, false), false);
                this.actionBar.setCastShadows(false);
                org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
                if (i12 == 1) {
                    org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.ic_ab_other);
                    this.I = a2;
                    g1Var = a2.e(1, R.drawable.msg_permissions, LocaleController.getString(R.string.PasscodeSwitchToPassword));
                } else {
                    g1Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new tk0(this, g1Var));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, i7.f6.c(-1.0f, -1));
            org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
            this.a = aj0Var;
            aj0Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            org.telegram.ui.Components.aj0 aj0Var2 = this.a;
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    aj0Var2.setVisibility(i10);
                    linearLayout.addView(this.a, i7.f6.q(120, 120, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i14 = org.telegram.ui.ActionBar.g6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
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
                    linearLayout.addView(this.d, i7.f6.t(-2, -2, 1, 0, 16, 0, 0));
                    org.telegram.ui.Components.j01 j01Var = new org.telegram.ui.Components.j01(context);
                    this.e = j01Var;
                    j01Var.setFactory(new ag0(context, 1));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, i7.f6.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
                    textView2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    textView2.setGravity((!d0() ? 3 : 1) | 16);
                    textView2.setOnClickListener(new t50(context, 12));
                    textView2.setVisibility(i12 != 2 ? 0 : 8);
                    textView2.setText(LocaleController.getString(R.string.ForgotPasscode));
                    frameLayout2.addView(textView2, i7.f6.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    oc.i.K1(textView2);
                    TextView textView3 = new TextView(context);
                    this.r = textView3;
                    textView3.setTextSize(1, 14.0f);
                    this.r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
                    this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
                    this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                    AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
                    frameLayout2.addView(this.r, i7.f6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(context, null);
                    this.f = uc0Var;
                    uc0Var.setText(LocaleController.getString(R.string.EnterPassword));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                    this.h.setBackground(null);
                    this.h.setMaxLines(1);
                    this.h.setLines(1);
                    this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
                    this.h.setSingleLine(true);
                    if (i12 != 1) {
                        this.A = 0;
                        this.h.setImeOptions(5);
                    } else {
                        this.A = 1;
                        this.h.setImeOptions(6);
                    }
                    this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.h.setTypeface(Typeface.DEFAULT);
                    this.h.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l6, false));
                    this.h.setCursorSize(AndroidUtilities.dp(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int dp = AndroidUtilities.dp(16.0f);
                    this.h.setPadding(dp, dp, dp, dp);
                    this.h.setOnFocusChangeListener(new kd(this, 10));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, i7.f6.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    this.s.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                    this.s.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
                    AndroidUtilities.updateViewVisibilityAnimated(this.s, i12 != 1 && this.A == 0, 0.1f, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new ag.c0(this, atomicBoolean, false, 10));
                    this.s.setOnClickListener(new t70(11, this, atomicBoolean));
                    linearLayout2.addView(this.s, i7.f6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, i7.f6.c(-2.0f, -1));
                    frameLayout3.addView(this.f, i7.f6.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new da(this, 8));
                    this.h.addTextChangedListener(new uk0(this, 0));
                    this.h.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.k0(2));
                    md0 md0Var = new md0(this, context, 2);
                    this.n = md0Var;
                    md0Var.b(4, 10);
                    for (ur urVar : this.n.f) {
                        urVar.setShowSoftInputOnFocusCompat(!c0());
                        urVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        urVar.setTextSize(1, 24.0f);
                        urVar.addTextChangedListener(new uk0(this, 1));
                        urVar.setOnFocusChangeListener(new jh.m8(this, urVar, 3));
                    }
                    frameLayout3.addView(this.n, i7.f6.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, i7.f6.t(-1, -2, 1, 0, 32, 0, 72));
                    if (i12 == 1) {
                        frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.d6));
                    }
                    org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
                    this.w = u10Var;
                    oc.i.K1(u10Var);
                    frameLayout2.addView(this.w, i7.f6.d(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.w.setOnClickListener(new t50(this, 13));
                    org.telegram.ui.Components.u21 u21Var = new org.telegram.ui.Components.u21(context);
                    u21Var.setTransformType(1);
                    u21Var.setProgress(0.0f);
                    u21Var.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
                    u21Var.setDrawBackground(false);
                    this.w.setContentDescription(LocaleController.getString(R.string.Next));
                    this.w.addView(u21Var, i7.f6.e(56, 56, 17));
                    org.telegram.ui.Components.u10 u10Var2 = this.w;
                    u10Var2.a(u10Var2);
                    l0();
                }
            }
            i10 = 8;
            aj0Var2.setVisibility(i10);
            linearLayout.addView(this.a, i7.f6.q(120, 120, 1));
            TextView textView4 = new TextView(context);
            this.d = textView4;
            int i142 = org.telegram.ui.ActionBar.g6.G6;
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i142, false));
            this.d.setTypeface(AndroidUtilities.bold());
            if (i12 == 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, i7.f6.t(-2, -2, 1, 0, 16, 0, 0));
            org.telegram.ui.Components.j01 j01Var2 = new org.telegram.ui.Components.j01(context);
            this.e = j01Var2;
            j01Var2.setFactory(new ag0(context, 1));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, i7.f6.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView22 = new TextView(context);
            textView22.setTextSize(1, 14.0f);
            textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
            textView22.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            textView22.setGravity((!d0() ? 3 : 1) | 16);
            textView22.setOnClickListener(new t50(context, 12));
            textView22.setVisibility(i12 != 2 ? 0 : 8);
            textView22.setText(LocaleController.getString(R.string.ForgotPasscode));
            frameLayout2.addView(textView22, i7.f6.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            oc.i.K1(textView22);
            TextView textView32 = new TextView(context);
            this.r = textView32;
            textView32.setTextSize(1, 14.0f);
            this.r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
            this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
            this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
            frameLayout2.addView(this.r, i7.f6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            org.telegram.ui.Components.uc0 uc0Var2 = new org.telegram.ui.Components.uc0(context, null);
            this.f = uc0Var2;
            uc0Var2.setText(LocaleController.getString(R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i142, false));
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
            this.h.setSingleLine(true);
            if (i12 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            this.h.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l6, false));
            this.h.setCursorSize(AndroidUtilities.dp(20.0f));
            this.h.setCursorWidth(1.5f);
            int dp2 = AndroidUtilities.dp(16.0f);
            this.h.setPadding(dp2, dp2, dp2, dp2);
            this.h.setOnFocusChangeListener(new kd(this, 10));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, i7.f6.l(1.0f, 0, -2));
            ImageView imageView2 = new ImageView(context);
            this.s = imageView2;
            imageView2.setImageResource(R.drawable.msg_message);
            this.s.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            this.s.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
            AndroidUtilities.updateViewVisibilityAnimated(this.s, i12 != 1 && this.A == 0, 0.1f, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new ag.c0(this, atomicBoolean2, false, 10));
            this.s.setOnClickListener(new t70(11, this, atomicBoolean2));
            linearLayout22.addView(this.s, i7.f6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, i7.f6.c(-2.0f, -1));
            frameLayout3.addView(this.f, i7.f6.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new da(this, 8));
            this.h.addTextChangedListener(new uk0(this, 0));
            this.h.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.k0(2));
            md0 md0Var2 = new md0(this, context, 2);
            this.n = md0Var2;
            md0Var2.b(4, 10);
            while (r10 < r5) {
            }
            frameLayout3.addView(this.n, i7.f6.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, i7.f6.t(-1, -2, 1, 0, 32, 0, 72));
            if (i12 == 1) {
            }
            org.telegram.ui.Components.u10 u10Var3 = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
            this.w = u10Var3;
            oc.i.K1(u10Var3);
            frameLayout2.addView(this.w, i7.f6.d(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.w.setOnClickListener(new t50(this, 13));
            org.telegram.ui.Components.u21 u21Var2 = new org.telegram.ui.Components.u21(context);
            u21Var2.setTransformType(1);
            u21Var2.setProgress(0.0f);
            u21Var2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
            u21Var2.setDrawBackground(false);
            this.w.setContentDescription(LocaleController.getString(R.string.Next));
            this.w.addView(u21Var2, i7.f6.e(56, 56, 17));
            org.telegram.ui.Components.u10 u10Var22 = this.w;
            u10Var22.a(u10Var22);
            l0();
        }
        return this.fragmentView;
    }

    public final boolean d0() {
        int i10 = this.x;
        return (i10 == 1 && this.y == 1) || (i10 == 2 && SharedConfig.passcodeType == 1);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.x == 0) {
                m0();
                wk0 wk0Var = this.b;
                if (wk0Var != null) {
                    wk0Var.l();
                }
            }
        }
    }

    public final boolean e0() {
        int i10 = this.x;
        return (i10 == 1 && this.y == 0) || (i10 == 2 && SharedConfig.passcodeType == 0);
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (e0()) {
            for (ur urVar : this.n.f) {
                urVar.i(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        AndroidUtilities.shakeViewSpring(e0() ? this.n : this.f, e0() ? 10.0f : 4.0f, new qk0(this, 2));
    }

    public final void g0() {
        if (d0() && this.h.getText().length() == 0) {
            f0();
            return;
        }
        String code = e0() ? this.n.getCode() : this.h.getText().toString();
        int i10 = 0;
        int i11 = this.x;
        if (i11 == 1) {
            if (!this.B.equals(code)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.r, true);
                for (ur urVar : this.n.f) {
                    urVar.setText("");
                }
                if (e0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                f0();
                this.n.removeCallbacks(this.K);
                this.n.post(new qk0(this, 0));
                return;
            }
            boolean isEmpty = SharedConfig.passcodeHash.isEmpty();
            try {
                SharedConfig.passcodeSalt = new byte[16];
                Utilities.random.nextBytes(SharedConfig.passcodeSalt);
                byte[] bytes = this.B.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, bytes.length + 16, 16);
                SharedConfig.passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (ur urVar2 : this.n.f) {
                urVar2.clearFocus();
                AndroidUtilities.hideKeyboard(urVar2);
            }
            this.v.setEditText(null);
            a0(new rk0(this, isEmpty, i10));
            return;
        }
        if (i11 == 2) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (ur urVar3 : this.n.f) {
                    urVar3.setText("");
                }
                this.h.setText("");
                if (e0()) {
                    this.n.f[0].requestFocus();
                }
                f0();
                return;
            }
            if (!SharedConfig.checkPasscode(code)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (ur urVar4 : this.n.f) {
                    urVar4.setText("");
                }
                if (e0()) {
                    this.n.f[0].requestFocus();
                }
                f0();
                return;
            }
            SharedConfig.badPasscodeTries = 0;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            ur[] urVarArr = this.n.f;
            int length2 = urVarArr.length;
            while (i10 < length2) {
                ur urVar5 = urVarArr[i10];
                urVar5.clearFocus();
                AndroidUtilities.hideKeyboard(urVar5);
                i10++;
            }
            this.v.setEditText(null);
            a0(new qk0(this, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 16, new Class[]{org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.y9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        if (this.x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    public final void h0() {
        if ((this.y == 1 && this.h.getText().length() == 0) || (this.y == 0 && this.n.getCode().length() != 4)) {
            f0();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.I;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        this.B = e0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (ur urVar : this.n.f) {
            urVar.setText("");
        }
        k0();
        this.A = 1;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hasForceLightStatusBar() {
        return this.x != 0;
    }

    public final void i0(boolean z10, boolean z11) {
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
        duration.setInterpolator(z10 ? org.telegram.ui.Components.jr.f : org.telegram.ui.Components.ct.e);
        duration.addUpdateListener(new g3(this, 19));
        duration.addListener(new p60(i10, this, z10));
        duration.start();
    }

    public final void j0(Runnable runnable) {
        this.M = (hb0) runnable;
    }

    public final void k0() {
        if (e0()) {
            this.n.f[0].requestFocus();
            if (c0()) {
                return;
            }
            AndroidUtilities.showKeyboard(this.n.f[0]);
            return;
        }
        if (d0()) {
            this.h.requestFocus();
            AndroidUtilities.showKeyboard(this.h);
        }
    }

    public final void l0() {
        String charSequence;
        int i10 = this.x;
        if (i10 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.A == 0) {
            charSequence = LocaleController.getString(this.y == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        boolean z10 = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (i10 == 2) {
            this.e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z10, false);
        } else if (this.A == 0) {
            this.e.a(LocaleController.getString(this.y == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword), z10, false);
        }
        if (e0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f, false, 1.0f, z10);
        } else if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f, true, 1.0f, z10);
        }
        if (d0()) {
            rk0 rk0Var = new rk0(this, z10, 1);
            this.L = rk0Var;
            AndroidUtilities.runOnUIThread(rk0Var, 3000L);
        } else {
            this.w.e(false, z10);
        }
        i0(c0(), z10);
        k0();
    }

    public final void m0() {
        this.fingerprintRow = -1;
        this.C = 1;
        this.H = 3;
        this.changePasscodeRow = 2;
        try {
            if (Build.VERSION.SDK_INT >= 23 && new androidx.biometric.e(new androidx.biometric.t(ApplicationLoader.applicationContext, 0)).d(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i10 = this.H;
                this.H = i10 + 1;
                this.fingerprintRow = i10;
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        int i11 = this.H;
        this.autoLockRow = i11;
        this.D = i11 + 1;
        this.E = i11 + 2;
        this.F = i11 + 3;
        this.G = i11 + 4;
        this.H = i11 + 6;
        this.disablePasscodeRow = i11 + 5;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        ur[] urVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        i0(c0(), false);
        org.telegram.ui.Components.aj0 aj0Var = this.a;
        if (aj0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    aj0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            aj0Var.setVisibility(i10);
        }
        md0 md0Var = this.n;
        if (md0Var == null || (urVarArr = md0Var.f) == null) {
            return;
        }
        for (ur urVar : urVarArr) {
            urVar.setShowSoftInputOnFocusCompat(!c0());
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        if (this.x != 0) {
            return true;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.x == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetPasscode);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        wk0 wk0Var = this.b;
        if (wk0Var != null) {
            wk0Var.l();
        }
        if (this.x != 0 && !c0()) {
            AndroidUtilities.runOnUIThread(new qk0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (c0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.x == 0) {
            return;
        }
        k0();
    }
}
