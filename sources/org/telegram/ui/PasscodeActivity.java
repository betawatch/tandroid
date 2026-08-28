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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final uk0 K;
    public vk0 L;
    public fb0 M;
    public org.telegram.ui.Components.pi0 a;
    private int autoLockRow;
    public al0 b;
    public org.telegram.ui.Components.wk0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.xz0 e;
    public org.telegram.ui.Components.fc0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public ld0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.kr v;
    public org.telegram.ui.Components.j10 w;
    public final int x;
    public int y;

    public PasscodeActivity(int i9) {
        super(null);
        this.y = 0;
        this.A = 0;
        this.K = new uk0(this, 4);
        this.x = i9;
    }

    public static /* synthetic */ void T(PasscodeActivity passcodeActivity, org.telegram.ui.Components.bc0 bc0Var, int i9) {
        int value = bc0Var.getValue();
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
        passcodeActivity.b.m(i9);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void U(PasscodeActivity passcodeActivity, View view, int i9) {
        if (view.isEnabled()) {
            if (i9 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new wt(passcodeActivity, 29));
                c2Var.show();
                ((TextView) c2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            int i10 = 1;
            if (i9 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
                return;
            }
            if (i9 != passcodeActivity.autoLockRow) {
                if (i9 == passcodeActivity.fingerprintRow) {
                    SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                    UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                    ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.useFingerprintLock);
                    return;
                } else {
                    if (i9 == passcodeActivity.F) {
                        SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                        ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.allowScreenCapture);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                        if (SharedConfig.allowScreenCapture) {
                            return;
                        }
                        org.telegram.ui.Components.y4.u0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
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
            org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(passcodeActivity.getParentActivity(), null);
            bc0Var.setMinValue(0);
            bc0Var.setMaxValue(4);
            int i11 = SharedConfig.autoLockIn;
            if (i11 == 0) {
                bc0Var.setValue(0);
            } else if (i11 == 60) {
                bc0Var.setValue(1);
            } else if (i11 == 300) {
                bc0Var.setValue(2);
            } else if (i11 == 3600) {
                bc0Var.setValue(3);
            } else if (i11 == 18000) {
                bc0Var.setValue(4);
            }
            bc0Var.setFormatter(new fk0(i10));
            alertDialog$Builder2.n(bc0Var);
            alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new c3.e(passcodeActivity, bc0Var, i9, 12));
            passcodeActivity.showDialog(c2Var2);
        }
    }

    public static org.telegram.ui.ActionBar.o2 a0() {
        return !SharedConfig.passcodeHash.isEmpty() ? new PasscodeActivity(2) : new h(6);
    }

    public final void Z(Runnable runnable) {
        if (!d0()) {
            runnable.run();
            return;
        }
        int i9 = 0;
        while (true) {
            ld0 ld0Var = this.n;
            vr[] vrVarArr = ld0Var.f;
            if (i9 >= vrVarArr.length) {
                ld0Var.postDelayed(new cf0(11, this, runnable), (vrVarArr.length * 75) + 350);
                return;
            } else {
                vr vrVar = vrVarArr[i9];
                vrVar.postDelayed(new wk0(vrVar, 0), i9 * 75);
                i9++;
            }
        }
    }

    public final boolean b0() {
        if (!d0() || this.x == 0 || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final boolean c0() {
        int i9 = this.x;
        return (i9 == 1 && this.y == 1) || (i9 == 2 && SharedConfig.passcodeType == 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03ed A[LOOP:0: B:50:0x03eb->B:51:0x03ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i9;
        org.telegram.ui.ActionBar.g1 g1Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = false;
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 7));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = 1;
        int i11 = this.x;
        if (i11 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, g7.e6.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(this, context, frameLayout, 1);
        e90Var.setDelegate(new yc0(1, this));
        this.fragmentView = e90Var;
        e90Var.addView(frameLayout, g7.e6.l(1.0f, -1, 0));
        org.telegram.ui.Components.kr krVar = new org.telegram.ui.Components.kr(context);
        this.v = krVar;
        krVar.setVisibility(b0() ? 0 : 8);
        e90Var.addView(this.v, g7.e6.n(-1, 230));
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Passcode));
            int i12 = org.telegram.ui.ActionBar.f6.a7;
            frameLayout2.setTag(Integer.valueOf(i12));
            frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
            this.c = wk0Var;
            wk0Var.p1();
            this.actionBar.setAdaptiveBackground(this.c);
            this.c.setLayoutManager(new of.y(i10, z10, 13));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, g7.e6.c(-1.0f, -1));
            org.telegram.ui.Components.wk0 wk0Var2 = this.c;
            al0 al0Var = new al0(this, context);
            this.b = al0Var;
            wk0Var2.setAdapter(al0Var);
            this.c.setOnItemClickListener(new i(this, 19));
        } else if (i11 == 1 || i11 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), false);
                this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.u8, false), false);
                this.actionBar.setCastShadows(false);
                org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
                if (i11 == 1) {
                    org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.ic_ab_other);
                    this.I = a2;
                    g1Var = a2.e(1, R.drawable.msg_permissions, LocaleController.getString(R.string.PasscodeSwitchToPassword));
                } else {
                    g1Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new xk0(this, g1Var));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, g7.e6.c(-1.0f, -1));
            org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
            this.a = pi0Var;
            pi0Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            org.telegram.ui.Components.pi0 pi0Var2 = this.a;
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i9 = 0;
                    pi0Var2.setVisibility(i9);
                    linearLayout.addView(this.a, g7.e6.q(120, 120, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i13 = org.telegram.ui.ActionBar.f6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                    this.d.setTypeface(AndroidUtilities.bold());
                    if (i11 == 1) {
                        this.d.setText(LocaleController.getString(R.string.EnterYourPasscode));
                    } else if (SharedConfig.passcodeHash.isEmpty()) {
                        this.d.setText(LocaleController.getString(R.string.CreatePasscode));
                    } else {
                        this.d.setText(LocaleController.getString(R.string.EnterNewPasscode));
                    }
                    this.d.setTextSize(1, 18.0f);
                    this.d.setGravity(1);
                    linearLayout.addView(this.d, g7.e6.t(-2, -2, 1, 0, 16, 0, 0));
                    org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0(context);
                    this.e = xz0Var;
                    xz0Var.setFactory(new ag0(context, 1));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, g7.e6.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false));
                    textView2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    textView2.setGravity((!c0() ? 3 : 1) | 16);
                    textView2.setOnClickListener(new q50(context, 12));
                    textView2.setVisibility(i11 != 2 ? 0 : 8);
                    textView2.setText(LocaleController.getString(R.string.ForgotPasscode));
                    frameLayout2.addView(textView2, g7.e6.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    org.telegram.ui.Cells.e3.s2(textView2);
                    TextView textView3 = new TextView(context);
                    this.r = textView3;
                    textView3.setTextSize(1, 14.0f);
                    this.r.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false));
                    this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
                    this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                    AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
                    frameLayout2.addView(this.r, g7.e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, null);
                    this.f = fc0Var;
                    fc0Var.setText(LocaleController.getString(R.string.EnterPassword));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    this.h.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                    this.h.setBackground(null);
                    this.h.setMaxLines(1);
                    this.h.setLines(1);
                    this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
                    this.h.setSingleLine(true);
                    if (i11 != 1) {
                        this.A = 0;
                        this.h.setImeOptions(5);
                    } else {
                        this.A = 1;
                        this.h.setImeOptions(6);
                    }
                    this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.h.setTypeface(Typeface.DEFAULT);
                    this.h.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l6, false));
                    this.h.setCursorSize(AndroidUtilities.dp(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int dp = AndroidUtilities.dp(16.0f);
                    this.h.setPadding(dp, dp, dp, dp);
                    this.h.setOnFocusChangeListener(new ld(this, 10));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, g7.e6.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    this.s.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
                    this.s.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.i6), 1, -1));
                    AndroidUtilities.updateViewVisibilityAnimated(this.s, i11 != 1 && this.A == 0, 0.1f, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new fh.t4(this, atomicBoolean, false, 9));
                    this.s.setOnClickListener(new v80(10, this, atomicBoolean));
                    linearLayout2.addView(this.s, g7.e6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, g7.e6.c(-2.0f, -1));
                    frameLayout3.addView(this.f, g7.e6.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new ea(this, 8));
                    this.h.addTextChangedListener(new yk0(this, 0));
                    this.h.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(2));
                    ld0 ld0Var = new ld0(this, context, 2);
                    this.n = ld0Var;
                    ld0Var.b(4, 10);
                    for (vr vrVar : this.n.f) {
                        vrVar.setShowSoftInputOnFocusCompat(!b0());
                        vrVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        vrVar.setTextSize(1, 24.0f);
                        vrVar.addTextChangedListener(new yk0(this, 1));
                        vrVar.setOnFocusChangeListener(new gh.q8(this, vrVar, 3));
                    }
                    frameLayout3.addView(this.n, g7.e6.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, g7.e6.t(-1, -2, 1, 0, 32, 0, 72));
                    if (i11 == 1) {
                        frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.d6));
                    }
                    org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
                    this.w = j10Var;
                    org.telegram.ui.Cells.e3.s2(j10Var);
                    frameLayout2.addView(this.w, g7.e6.d(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.w.setOnClickListener(new q50(this, 13));
                    org.telegram.ui.Components.j21 j21Var = new org.telegram.ui.Components.j21(context);
                    j21Var.setTransformType(1);
                    j21Var.setProgress(0.0f);
                    j21Var.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.O9, false));
                    j21Var.setDrawBackground(false);
                    this.w.setContentDescription(LocaleController.getString(R.string.Next));
                    this.w.addView(j21Var, g7.e6.e(56, 56, 17));
                    org.telegram.ui.Components.j10 j10Var2 = this.w;
                    j10Var2.a(j10Var2);
                    k0();
                }
            }
            i9 = 8;
            pi0Var2.setVisibility(i9);
            linearLayout.addView(this.a, g7.e6.q(120, 120, 1));
            TextView textView4 = new TextView(context);
            this.d = textView4;
            int i132 = org.telegram.ui.ActionBar.f6.G6;
            textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i132, false));
            this.d.setTypeface(AndroidUtilities.bold());
            if (i11 == 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, g7.e6.t(-2, -2, 1, 0, 16, 0, 0));
            org.telegram.ui.Components.xz0 xz0Var2 = new org.telegram.ui.Components.xz0(context);
            this.e = xz0Var2;
            xz0Var2.setFactory(new ag0(context, 1));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, g7.e6.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView22 = new TextView(context);
            textView22.setTextSize(1, 14.0f);
            textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false));
            textView22.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            textView22.setGravity((!c0() ? 3 : 1) | 16);
            textView22.setOnClickListener(new q50(context, 12));
            textView22.setVisibility(i11 != 2 ? 0 : 8);
            textView22.setText(LocaleController.getString(R.string.ForgotPasscode));
            frameLayout2.addView(textView22, g7.e6.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            org.telegram.ui.Cells.e3.s2(textView22);
            TextView textView32 = new TextView(context);
            this.r = textView32;
            textView32.setTextSize(1, 14.0f);
            this.r.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false));
            this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
            this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
            frameLayout2.addView(this.r, g7.e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(context, null);
            this.f = fc0Var2;
            fc0Var2.setText(LocaleController.getString(R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            this.h.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i132, false));
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
            this.h.setSingleLine(true);
            if (i11 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            this.h.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l6, false));
            this.h.setCursorSize(AndroidUtilities.dp(20.0f));
            this.h.setCursorWidth(1.5f);
            int dp2 = AndroidUtilities.dp(16.0f);
            this.h.setPadding(dp2, dp2, dp2, dp2);
            this.h.setOnFocusChangeListener(new ld(this, 10));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, g7.e6.l(1.0f, 0, -2));
            ImageView imageView2 = new ImageView(context);
            this.s = imageView2;
            imageView2.setImageResource(R.drawable.msg_message);
            this.s.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
            this.s.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.i6), 1, -1));
            AndroidUtilities.updateViewVisibilityAnimated(this.s, i11 != 1 && this.A == 0, 0.1f, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new fh.t4(this, atomicBoolean2, false, 9));
            this.s.setOnClickListener(new v80(10, this, atomicBoolean2));
            linearLayout22.addView(this.s, g7.e6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, g7.e6.c(-2.0f, -1));
            frameLayout3.addView(this.f, g7.e6.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new ea(this, 8));
            this.h.addTextChangedListener(new yk0(this, 0));
            this.h.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(2));
            ld0 ld0Var2 = new ld0(this, context, 2);
            this.n = ld0Var2;
            ld0Var2.b(4, 10);
            while (r10 < r5) {
            }
            frameLayout3.addView(this.n, g7.e6.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, g7.e6.t(-1, -2, 1, 0, 32, 0, 72));
            if (i11 == 1) {
            }
            org.telegram.ui.Components.j10 j10Var3 = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
            this.w = j10Var3;
            org.telegram.ui.Cells.e3.s2(j10Var3);
            frameLayout2.addView(this.w, g7.e6.d(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.w.setOnClickListener(new q50(this, 13));
            org.telegram.ui.Components.j21 j21Var2 = new org.telegram.ui.Components.j21(context);
            j21Var2.setTransformType(1);
            j21Var2.setProgress(0.0f);
            j21Var2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.O9, false));
            j21Var2.setDrawBackground(false);
            this.w.setContentDescription(LocaleController.getString(R.string.Next));
            this.w.addView(j21Var2, g7.e6.e(56, 56, 17));
            org.telegram.ui.Components.j10 j10Var22 = this.w;
            j10Var22.a(j10Var22);
            k0();
        }
        return this.fragmentView;
    }

    public final boolean d0() {
        int i9 = this.x;
        return (i9 == 1 && this.y == 0) || (i9 == 2 && SharedConfig.passcodeType == 0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.x == 0) {
                l0();
                al0 al0Var = this.b;
                if (al0Var != null) {
                    al0Var.l();
                }
            }
        }
    }

    public final void e0() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (d0()) {
            for (vr vrVar : this.n.f) {
                vrVar.i(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        AndroidUtilities.shakeViewSpring(d0() ? this.n : this.f, d0() ? 10.0f : 4.0f, new uk0(this, 2));
    }

    public final void f0() {
        if (c0() && this.h.getText().length() == 0) {
            e0();
            return;
        }
        String code = d0() ? this.n.getCode() : this.h.getText().toString();
        int i9 = 0;
        int i10 = this.x;
        if (i10 == 1) {
            if (!this.B.equals(code)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.r, true);
                for (vr vrVar : this.n.f) {
                    vrVar.setText("");
                }
                if (d0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                e0();
                this.n.removeCallbacks(this.K);
                this.n.post(new uk0(this, 0));
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
            for (vr vrVar2 : this.n.f) {
                vrVar2.clearFocus();
                AndroidUtilities.hideKeyboard(vrVar2);
            }
            this.v.setEditText(null);
            Z(new vk0(this, isEmpty, i9));
            return;
        }
        if (i10 == 2) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (vr vrVar3 : this.n.f) {
                    vrVar3.setText("");
                }
                this.h.setText("");
                if (d0()) {
                    this.n.f[0].requestFocus();
                }
                e0();
                return;
            }
            if (!SharedConfig.checkPasscode(code)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (vr vrVar4 : this.n.f) {
                    vrVar4.setText("");
                }
                if (d0()) {
                    this.n.f[0].requestFocus();
                }
                e0();
                return;
            }
            SharedConfig.badPasscodeTries = 0;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            vr[] vrVarArr = this.n.f;
            int length2 = vrVarArr.length;
            while (i9 < length2) {
                vr vrVar5 = vrVarArr[i9];
                vrVar5.clearFocus();
                AndroidUtilities.hideKeyboard(vrVar5);
                i9++;
            }
            this.v.setEditText(null);
            Z(new uk0(this, 1));
        }
    }

    public final void g0() {
        if ((this.y == 1 && this.h.getText().length() == 0) || (this.y == 0 && this.n.getCode().length() != 4)) {
            e0();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.I;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        this.B = d0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (vr vrVar : this.n.f) {
            vrVar.setText("");
        }
        j0();
        this.A = 1;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 16, new Class[]{org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.ba.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        if (this.x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursor, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 262144, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 262144, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        return arrayList;
    }

    public final void h0(boolean z10, boolean z11) {
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
        int i9 = 2;
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z10 ? org.telegram.ui.Components.gr.f : org.telegram.ui.Components.xs.e);
        duration.addUpdateListener(new f3(this, 19));
        duration.addListener(new n60(i9, this, z10));
        duration.start();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hasForceLightStatusBar() {
        return this.x != 0;
    }

    public final void i0(Runnable runnable) {
        this.M = (fb0) runnable;
    }

    public final void j0() {
        if (d0()) {
            this.n.f[0].requestFocus();
            if (b0()) {
                return;
            }
            AndroidUtilities.showKeyboard(this.n.f[0]);
            return;
        }
        if (c0()) {
            this.h.requestFocus();
            AndroidUtilities.showKeyboard(this.h);
        }
    }

    public final void k0() {
        String charSequence;
        int i9 = this.x;
        if (i9 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.A == 0) {
            charSequence = LocaleController.getString(this.y == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        boolean z10 = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (i9 == 2) {
            this.e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z10, false);
        } else if (this.A == 0) {
            this.e.a(LocaleController.getString(this.y == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword), z10, false);
        }
        if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f, false, 1.0f, z10);
        } else if (c0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f, true, 1.0f, z10);
        }
        if (c0()) {
            vk0 vk0Var = new vk0(this, z10, 1);
            this.L = vk0Var;
            AndroidUtilities.runOnUIThread(vk0Var, 3000L);
        } else {
            this.w.e(false, z10);
        }
        h0(b0(), z10);
        j0();
    }

    public final void l0() {
        this.fingerprintRow = -1;
        this.C = 1;
        this.H = 3;
        this.changePasscodeRow = 2;
        try {
            if (Build.VERSION.SDK_INT >= 23 && new a5.m(new u5.h(ApplicationLoader.applicationContext, 1)).e(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i9 = this.H;
                this.H = i9 + 1;
                this.fingerprintRow = i9;
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        int i10 = this.H;
        this.autoLockRow = i10;
        this.D = i10 + 1;
        this.E = i10 + 2;
        this.F = i10 + 3;
        this.G = i10 + 4;
        this.H = i10 + 6;
        this.disablePasscodeRow = i10 + 5;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        vr[] vrVarArr;
        int i9;
        super.onConfigurationChanged(configuration);
        h0(b0(), false);
        org.telegram.ui.Components.pi0 pi0Var = this.a;
        if (pi0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i9 = 0;
                    pi0Var.setVisibility(i9);
                }
            }
            i9 = 8;
            pi0Var.setVisibility(i9);
        }
        ld0 ld0Var = this.n;
        if (ld0Var == null || (vrVarArr = ld0Var.f) == null) {
            return;
        }
        for (vr vrVar : vrVarArr) {
            vrVar.setShowSoftInputOnFocusCompat(!b0());
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        l0();
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
        al0 al0Var = this.b;
        if (al0Var != null) {
            al0Var.l();
        }
        if (this.x != 0 && !b0()) {
            AndroidUtilities.runOnUIThread(new uk0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (b0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.x == 0) {
            return;
        }
        j0();
    }
}
