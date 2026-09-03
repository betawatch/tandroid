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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public String C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public org.telegram.ui.ActionBar.w0 J;
    public boolean K;
    public final al0 L;
    public bl0 M;
    public sb0 N;
    public org.telegram.ui.Components.jj0 a;
    private int autoLockRow;
    public hl0 b;
    public org.telegram.ui.Components.rl0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.u01 e;
    public org.telegram.ui.Components.bd0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public xd0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.rr v;
    public org.telegram.ui.Components.a20 w;
    public final int x;
    public int y;

    public PasscodeActivity(int i10) {
        super(null);
        this.y = 0;
        this.B = 0;
        this.L = new al0(this, 4);
        this.x = i10;
    }

    public static /* synthetic */ void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.xc0 xc0Var, int i10) {
        int value = xc0Var.getValue();
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
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new hu(passcodeActivity, 29));
                d2Var.show();
                ((TextView) d2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
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
                    ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.useFingerprintLock);
                    return;
                } else {
                    if (i10 == passcodeActivity.G) {
                        SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                        ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.allowScreenCapture);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                        if (SharedConfig.allowScreenCapture) {
                            return;
                        }
                        org.telegram.ui.Components.z4.u0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
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
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.O = string2;
            org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(passcodeActivity.getParentActivity(), null);
            xc0Var.setMinValue(0);
            xc0Var.setMaxValue(4);
            int i12 = SharedConfig.autoLockIn;
            if (i12 == 0) {
                xc0Var.setValue(0);
            } else if (i12 == 60) {
                xc0Var.setValue(1);
            } else if (i12 == 300) {
                xc0Var.setValue(2);
            } else if (i12 == 3600) {
                xc0Var.setValue(3);
            } else if (i12 == 18000) {
                xc0Var.setValue(4);
            }
            xc0Var.setFormatter(new cl0(i11));
            alertDialog$Builder2.n(xc0Var);
            alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new e3.d(passcodeActivity, xc0Var, i10, 11));
            passcodeActivity.showDialog(d2Var2);
        }
    }

    public static org.telegram.ui.ActionBar.p2 b0() {
        return !SharedConfig.passcodeHash.isEmpty() ? new PasscodeActivity(2) : new i(6);
    }

    public final void a0(Runnable runnable) {
        if (!e0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            xd0 xd0Var = this.n;
            ds[] dsVarArr = xd0Var.f;
            if (i10 >= dsVarArr.length) {
                xd0Var.postDelayed(new ie0(16, this, runnable), (dsVarArr.length * 75) + 350);
                return;
            } else {
                ds dsVar = dsVarArr[i10];
                dsVar.postDelayed(new dl0(dsVar, 0), i10 * 75);
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
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z4 = false;
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 29));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = 1;
        int i12 = this.x;
        if (i12 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, k7.b6.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(this, context, frameLayout, 1);
        y90Var.setDelegate(new ld0(1, this));
        this.fragmentView = y90Var;
        y90Var.addView(frameLayout, k7.b6.l(1.0f, -1, 0));
        org.telegram.ui.Components.rr rrVar = new org.telegram.ui.Components.rr(context);
        this.v = rrVar;
        rrVar.setVisibility(c0() ? 0 : 8);
        y90Var.addView(this.v, k7.b6.n(-1, 230));
        if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Passcode));
            int i13 = org.telegram.ui.ActionBar.j6.a7;
            frameLayout2.setTag(Integer.valueOf(i13));
            frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
            this.c = rl0Var;
            rl0Var.o1();
            this.actionBar.setAdaptiveBackground(this.c);
            this.c.setLayoutManager(new k(i11, z4, 12));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, k7.b6.c(-1.0f, -1));
            org.telegram.ui.Components.rl0 rl0Var2 = this.c;
            hl0 hl0Var = new hl0(this, context);
            this.b = hl0Var;
            rl0Var2.setAdapter(hl0Var);
            this.c.setOnItemClickListener(new j(this, 19));
        } else if (i12 == 1 || i12 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), false);
                this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u8, false), false);
                this.actionBar.setCastShadows(false);
                org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
                if (i12 == 1) {
                    org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.ic_ab_other);
                    this.J = a2;
                    g1Var = a2.e(1, R.drawable.msg_permissions, LocaleController.getString(R.string.PasscodeSwitchToPassword));
                } else {
                    g1Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new el0(this, g1Var));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, k7.b6.c(-1.0f, -1));
            org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
            this.a = jj0Var;
            jj0Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            org.telegram.ui.Components.jj0 jj0Var2 = this.a;
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    jj0Var2.setVisibility(i10);
                    linearLayout.addView(this.a, k7.b6.q(120, 120, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i14 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
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
                    linearLayout.addView(this.d, k7.b6.t(-2, -2, 1, 0, 16, 0, 0));
                    org.telegram.ui.Components.u01 u01Var = new org.telegram.ui.Components.u01(context);
                    this.e = u01Var;
                    u01Var.setFactory(new kg0(context, 1));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, k7.b6.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
                    textView2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    textView2.setGravity((!d0() ? 3 : 1) | 16);
                    textView2.setOnClickListener(new g60(context, 12));
                    textView2.setVisibility(i12 != 2 ? 0 : 8);
                    textView2.setText(LocaleController.getString(R.string.ForgotPasscode));
                    frameLayout2.addView(textView2, k7.b6.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    n7.qa.V(textView2);
                    TextView textView3 = new TextView(context);
                    this.r = textView3;
                    textView3.setTextSize(1, 14.0f);
                    this.r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
                    this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
                    this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                    AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
                    frameLayout2.addView(this.r, k7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    org.telegram.ui.Components.bd0 bd0Var = new org.telegram.ui.Components.bd0(context, null);
                    this.f = bd0Var;
                    bd0Var.setText(LocaleController.getString(R.string.EnterPassword));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                    this.h.setBackground(null);
                    this.h.setMaxLines(1);
                    this.h.setLines(1);
                    this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
                    this.h.setSingleLine(true);
                    if (i12 != 1) {
                        this.B = 0;
                        this.h.setImeOptions(5);
                    } else {
                        this.B = 1;
                        this.h.setImeOptions(6);
                    }
                    this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.h.setTypeface(Typeface.DEFAULT);
                    this.h.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false));
                    this.h.setCursorSize(AndroidUtilities.dp(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int dp = AndroidUtilities.dp(16.0f);
                    this.h.setPadding(dp, dp, dp, dp);
                    this.h.setOnFocusChangeListener(new sd(this, 10));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, k7.b6.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    this.s.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
                    this.s.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 1, -1));
                    AndroidUtilities.updateViewVisibilityAnimated(this.s, i12 != 1 && this.B == 0, 0.1f, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new cg.b0(this, atomicBoolean, false, 10));
                    this.s.setOnClickListener(new ib0(8, this, atomicBoolean));
                    linearLayout2.addView(this.s, k7.b6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, k7.b6.c(-2.0f, -1));
                    frameLayout3.addView(this.f, k7.b6.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new ja(this, 8));
                    this.h.addTextChangedListener(new fl0(this, 0));
                    this.h.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(2));
                    xd0 xd0Var = new xd0(this, context, 2);
                    this.n = xd0Var;
                    xd0Var.b(4, 10);
                    for (ds dsVar : this.n.f) {
                        dsVar.setShowSoftInputOnFocusCompat(!c0());
                        dsVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        dsVar.setTextSize(1, 24.0f);
                        dsVar.addTextChangedListener(new fl0(this, 1));
                        dsVar.setOnFocusChangeListener(new lh.n8(this, dsVar, 3));
                    }
                    frameLayout3.addView(this.n, k7.b6.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, k7.b6.t(-1, -2, 1, 0, 32, 0, 72));
                    if (i12 == 1) {
                        frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
                    }
                    org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
                    this.w = a20Var;
                    n7.qa.V(a20Var);
                    frameLayout2.addView(this.w, k7.b6.d(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.w.setOnClickListener(new g60(this, 13));
                    org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(context);
                    e31Var.setTransformType(1);
                    e31Var.setProgress(0.0f);
                    e31Var.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false));
                    e31Var.setDrawBackground(false);
                    this.w.setContentDescription(LocaleController.getString(R.string.Next));
                    this.w.addView(e31Var, k7.b6.e(56, 56, 17));
                    org.telegram.ui.Components.a20 a20Var2 = this.w;
                    a20Var2.a(a20Var2);
                    l0();
                }
            }
            i10 = 8;
            jj0Var2.setVisibility(i10);
            linearLayout.addView(this.a, k7.b6.q(120, 120, 1));
            TextView textView4 = new TextView(context);
            this.d = textView4;
            int i142 = org.telegram.ui.ActionBar.j6.G6;
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i142, false));
            this.d.setTypeface(AndroidUtilities.bold());
            if (i12 == 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, k7.b6.t(-2, -2, 1, 0, 16, 0, 0));
            org.telegram.ui.Components.u01 u01Var2 = new org.telegram.ui.Components.u01(context);
            this.e = u01Var2;
            u01Var2.setFactory(new kg0(context, 1));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, k7.b6.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView22 = new TextView(context);
            textView22.setTextSize(1, 14.0f);
            textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
            textView22.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            textView22.setGravity((!d0() ? 3 : 1) | 16);
            textView22.setOnClickListener(new g60(context, 12));
            textView22.setVisibility(i12 != 2 ? 0 : 8);
            textView22.setText(LocaleController.getString(R.string.ForgotPasscode));
            frameLayout2.addView(textView22, k7.b6.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            n7.qa.V(textView22);
            TextView textView32 = new TextView(context);
            this.r = textView32;
            textView32.setTextSize(1, 14.0f);
            this.r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
            this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
            this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
            frameLayout2.addView(this.r, k7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            org.telegram.ui.Components.bd0 bd0Var2 = new org.telegram.ui.Components.bd0(context, null);
            this.f = bd0Var2;
            bd0Var2.setText(LocaleController.getString(R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i142, false));
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
            this.h.setSingleLine(true);
            if (i12 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            this.h.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false));
            this.h.setCursorSize(AndroidUtilities.dp(20.0f));
            this.h.setCursorWidth(1.5f);
            int dp2 = AndroidUtilities.dp(16.0f);
            this.h.setPadding(dp2, dp2, dp2, dp2);
            this.h.setOnFocusChangeListener(new sd(this, 10));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, k7.b6.l(1.0f, 0, -2));
            ImageView imageView2 = new ImageView(context);
            this.s = imageView2;
            imageView2.setImageResource(R.drawable.msg_message);
            this.s.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            this.s.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 1, -1));
            AndroidUtilities.updateViewVisibilityAnimated(this.s, i12 != 1 && this.B == 0, 0.1f, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new cg.b0(this, atomicBoolean2, false, 10));
            this.s.setOnClickListener(new ib0(8, this, atomicBoolean2));
            linearLayout22.addView(this.s, k7.b6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, k7.b6.c(-2.0f, -1));
            frameLayout3.addView(this.f, k7.b6.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new ja(this, 8));
            this.h.addTextChangedListener(new fl0(this, 0));
            this.h.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(2));
            xd0 xd0Var2 = new xd0(this, context, 2);
            this.n = xd0Var2;
            xd0Var2.b(4, 10);
            while (r10 < r5) {
            }
            frameLayout3.addView(this.n, k7.b6.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, k7.b6.t(-1, -2, 1, 0, 32, 0, 72));
            if (i12 == 1) {
            }
            org.telegram.ui.Components.a20 a20Var3 = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
            this.w = a20Var3;
            n7.qa.V(a20Var3);
            frameLayout2.addView(this.w, k7.b6.d(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.w.setOnClickListener(new g60(this, 13));
            org.telegram.ui.Components.e31 e31Var2 = new org.telegram.ui.Components.e31(context);
            e31Var2.setTransformType(1);
            e31Var2.setProgress(0.0f);
            e31Var2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false));
            e31Var2.setDrawBackground(false);
            this.w.setContentDescription(LocaleController.getString(R.string.Next));
            this.w.addView(e31Var2, k7.b6.e(56, 56, 17));
            org.telegram.ui.Components.a20 a20Var22 = this.w;
            a20Var22.a(a20Var22);
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
                hl0 hl0Var = this.b;
                if (hl0Var != null) {
                    hl0Var.l();
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
            for (ds dsVar : this.n.f) {
                dsVar.i(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        AndroidUtilities.shakeViewSpring(e0() ? this.n : this.f, e0() ? 10.0f : 4.0f, new al0(this, 2));
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
            if (!this.C.equals(code)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.r, true);
                for (ds dsVar : this.n.f) {
                    dsVar.setText("");
                }
                if (e0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                f0();
                this.n.removeCallbacks(this.L);
                this.n.post(new al0(this, 0));
                return;
            }
            boolean isEmpty = SharedConfig.passcodeHash.isEmpty();
            try {
                SharedConfig.passcodeSalt = new byte[16];
                Utilities.random.nextBytes(SharedConfig.passcodeSalt);
                byte[] bytes = this.C.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, bytes.length + 16, 16);
                SharedConfig.passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length));
            } catch (Exception e) {
                FileLog.e(e);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (ds dsVar2 : this.n.f) {
                dsVar2.clearFocus();
                AndroidUtilities.hideKeyboard(dsVar2);
            }
            this.v.setEditText(null);
            a0(new bl0(this, isEmpty, i10));
            return;
        }
        if (i11 == 2) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (ds dsVar3 : this.n.f) {
                    dsVar3.setText("");
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
                for (ds dsVar4 : this.n.f) {
                    dsVar4.setText("");
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
            ds[] dsVarArr = this.n.f;
            int length2 = dsVarArr.length;
            while (i10 < length2) {
                ds dsVar5 = dsVarArr[i10];
                dsVar5.clearFocus();
                AndroidUtilities.hideKeyboard(dsVar5);
                i10++;
            }
            this.v.setEditText(null);
            a0(new al0(this, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 16, new Class[]{org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.z9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        if (this.x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    public final void h0() {
        if ((this.y == 1 && this.h.getText().length() == 0) || (this.y == 0 && this.n.getCode().length() != 4)) {
            f0();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.J;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        this.C = e0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (ds dsVar : this.n.f) {
            dsVar.setText("");
        }
        k0();
        this.B = 1;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean hasForceLightStatusBar() {
        return this.x != 0;
    }

    public final void i0(boolean z4, boolean z10) {
        if (z4) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
        if (!z10) {
            this.v.setVisibility(z4 ? 0 : 8);
            this.v.setAlpha(z4 ? 1.0f : 0.0f);
            this.v.setTranslationY(z4 ? 0.0f : AndroidUtilities.dp(230.0f));
            this.fragmentView.requestLayout();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z4 ? org.telegram.ui.Components.mr.f : org.telegram.ui.Components.ft.e);
        duration.addUpdateListener(new g3(this, 19));
        duration.addListener(new org.telegram.ui.Components.m00(24, this, z4));
        duration.start();
    }

    public final void j0(Runnable runnable) {
        this.N = (sb0) runnable;
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
        } else if (this.B == 0) {
            charSequence = LocaleController.getString(this.y == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        boolean z4 = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (i10 == 2) {
            this.e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z4, false);
        } else if (this.B == 0) {
            this.e.a(LocaleController.getString(this.y == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword), z4, false);
        }
        if (e0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, true, 1.0f, z4);
            AndroidUtilities.updateViewVisibilityAnimated(this.f, false, 1.0f, z4);
        } else if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, false, 1.0f, z4);
            AndroidUtilities.updateViewVisibilityAnimated(this.f, true, 1.0f, z4);
        }
        if (d0()) {
            bl0 bl0Var = new bl0(this, z4, 1);
            this.M = bl0Var;
            AndroidUtilities.runOnUIThread(bl0Var, 3000L);
        } else {
            this.w.e(false, z4);
        }
        i0(c0(), z4);
        k0();
    }

    public final void m0() {
        this.fingerprintRow = -1;
        this.D = 1;
        this.I = 3;
        this.changePasscodeRow = 2;
        try {
            if (Build.VERSION.SDK_INT >= 23 && new af.d(new androidx.biometric.t(ApplicationLoader.applicationContext, 0)).i(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i10 = this.I;
                this.I = i10 + 1;
                this.fingerprintRow = i10;
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        int i11 = this.I;
        this.autoLockRow = i11;
        this.E = i11 + 1;
        this.F = i11 + 2;
        this.G = i11 + 3;
        this.H = i11 + 4;
        this.I = i11 + 6;
        this.disablePasscodeRow = i11 + 5;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        ds[] dsVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        i0(c0(), false);
        org.telegram.ui.Components.jj0 jj0Var = this.a;
        if (jj0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    jj0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            jj0Var.setVisibility(i10);
        }
        xd0 xd0Var = this.n;
        if (xd0Var == null || (dsVarArr = xd0Var.f) == null) {
            return;
        }
        for (ds dsVar : dsVarArr) {
            dsVar.setShowSoftInputOnFocusCompat(!c0());
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        if (this.x != 0) {
            return true;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.x == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetPasscode);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        hl0 hl0Var = this.b;
        if (hl0Var != null) {
            hl0Var.l();
        }
        if (this.x != 0 && !c0()) {
            AndroidUtilities.runOnUIThread(new al0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (c0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 || this.x == 0) {
            return;
        }
        k0();
    }
}
