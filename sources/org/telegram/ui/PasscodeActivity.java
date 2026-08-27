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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public String B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public org.telegram.ui.ActionBar.v0 I;
    public boolean J;
    public final uk0 K;
    public vk0 L;
    public jb0 M;
    public org.telegram.ui.Components.ri0 a;
    private int autoLockRow;
    public al0 b;
    public org.telegram.ui.Components.zk0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.zz0 e;
    public org.telegram.ui.Components.jc0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public od0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.ir v;
    public org.telegram.ui.Components.m10 w;
    public final int x;
    public int y;

    public PasscodeActivity(int i10) {
        super(null);
        this.y = 0;
        this.A = 0;
        this.K = new uk0(this, 4);
        this.x = i10;
    }

    public static /* synthetic */ void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.fc0 fc0Var, int i10) {
        int value = fc0Var.getValue();
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
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.N = string;
                b2Var.P = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new zt(passcodeActivity, 29));
                b2Var.show();
                ((TextView) b2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
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
                    ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.useFingerprintLock);
                    return;
                } else {
                    if (i10 == passcodeActivity.F) {
                        SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                        ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.allowScreenCapture);
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
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.N = string2;
            org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(passcodeActivity.getParentActivity(), null);
            fc0Var.setMinValue(0);
            fc0Var.setMaxValue(4);
            int i11 = SharedConfig.autoLockIn;
            if (i11 == 0) {
                fc0Var.setValue(0);
            } else if (i11 == 60) {
                fc0Var.setValue(1);
            } else if (i11 == 300) {
                fc0Var.setValue(2);
            } else if (i11 == 3600) {
                fc0Var.setValue(3);
            } else if (i11 == 18000) {
                fc0Var.setValue(4);
            }
            fc0Var.setFormatter(new j70(6));
            alertDialog$Builder2.n(fc0Var);
            alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new c3.d(passcodeActivity, fc0Var, i10, 11));
            passcodeActivity.showDialog(b2Var2);
        }
    }

    public static org.telegram.ui.ActionBar.n2 b0() {
        return !SharedConfig.passcodeHash.isEmpty() ? new PasscodeActivity(2) : new h(6);
    }

    public final void a0(Runnable runnable) {
        if (!e0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            od0 od0Var = this.n;
            wr[] wrVarArr = od0Var.f;
            if (i10 >= wrVarArr.length) {
                od0Var.postDelayed(new ff0(11, this, runnable), (wrVarArr.length * 75) + 350);
                return;
            } else {
                wr wrVar = wrVarArr[i10];
                wrVar.postDelayed(new wk0(wrVar, 0), i10 * 75);
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
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 8));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = 1;
        int i12 = this.x;
        if (i12 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, h7.z5.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        org.telegram.ui.Components.i90 i90Var = new org.telegram.ui.Components.i90(this, context, frameLayout, 1);
        i90Var.setDelegate(new cd0(1, this));
        this.fragmentView = i90Var;
        i90Var.addView(frameLayout, h7.z5.l(1.0f, -1, 0));
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(context);
        this.v = irVar;
        irVar.setVisibility(c0() ? 0 : 8);
        i90Var.addView(this.v, h7.z5.n(-1, 230));
        if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Passcode));
            int i13 = org.telegram.ui.ActionBar.g6.a7;
            frameLayout2.setTag(Integer.valueOf(i13));
            frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
            this.c = zk0Var;
            zk0Var.p1();
            this.actionBar.setAdaptiveBackground(this.c);
            this.c.setLayoutManager(new j(i11, z10, 12));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, h7.z5.c(-1.0f, -1));
            org.telegram.ui.Components.zk0 zk0Var2 = this.c;
            al0 al0Var = new al0(this, context);
            this.b = al0Var;
            zk0Var2.setAdapter(al0Var);
            this.c.setOnItemClickListener(new i(this, 19));
        } else if (i12 == 1 || i12 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), false);
                this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.u8, false), false);
                this.actionBar.setCastShadows(false);
                org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
                if (i12 == 1) {
                    org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.ic_ab_other);
                    this.I = a2;
                    f1Var = a2.e(1, R.drawable.msg_permissions, LocaleController.getString(R.string.PasscodeSwitchToPassword));
                } else {
                    f1Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new xk0(this, f1Var));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, h7.z5.c(-1.0f, -1));
            org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
            this.a = ri0Var;
            ri0Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            org.telegram.ui.Components.ri0 ri0Var2 = this.a;
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    ri0Var2.setVisibility(i10);
                    linearLayout.addView(this.a, h7.z5.q(120, 120, 1));
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
                    linearLayout.addView(this.d, h7.z5.t(-2, -2, 1, 0, 16, 0, 0));
                    org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0(context);
                    this.e = zz0Var;
                    zz0Var.setFactory(new dg0(context, 1));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, h7.z5.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
                    textView2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    textView2.setGravity((!d0() ? 3 : 1) | 16);
                    textView2.setOnClickListener(new u50(context, 12));
                    textView2.setVisibility(i12 != 2 ? 0 : 8);
                    textView2.setText(LocaleController.getString(R.string.ForgotPasscode));
                    frameLayout2.addView(textView2, h7.z5.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    i6.q2(textView2);
                    TextView textView3 = new TextView(context);
                    this.r = textView3;
                    textView3.setTextSize(1, 14.0f);
                    this.r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
                    this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
                    this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                    AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
                    frameLayout2.addView(this.r, h7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, null);
                    this.f = jc0Var;
                    jc0Var.setText(LocaleController.getString(R.string.EnterPassword));
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
                    this.h.setOnFocusChangeListener(new ld(this, 10));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, h7.z5.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    this.s.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                    this.s.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
                    AndroidUtilities.updateViewVisibilityAnimated(this.s, i12 != 1 && this.A == 0, 0.1f, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new gh.n4(this, atomicBoolean, false, 9));
                    this.s.setOnClickListener(new u70(11, this, atomicBoolean));
                    linearLayout2.addView(this.s, h7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, h7.z5.c(-2.0f, -1));
                    frameLayout3.addView(this.f, h7.z5.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new fa(this, 8));
                    this.h.addTextChangedListener(new yk0(this, 0));
                    this.h.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(2));
                    od0 od0Var = new od0(this, context, 2);
                    this.n = od0Var;
                    od0Var.b(4, 10);
                    for (wr wrVar : this.n.f) {
                        wrVar.setShowSoftInputOnFocusCompat(!c0());
                        wrVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        wrVar.setTextSize(1, 24.0f);
                        wrVar.addTextChangedListener(new yk0(this, 1));
                        wrVar.setOnFocusChangeListener(new hh.p8(this, wrVar, 3));
                    }
                    frameLayout3.addView(this.n, h7.z5.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, h7.z5.t(-1, -2, 1, 0, 32, 0, 72));
                    if (i12 == 1) {
                        frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.d6));
                    }
                    org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
                    this.w = m10Var;
                    i6.q2(m10Var);
                    frameLayout2.addView(this.w, h7.z5.d(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.w.setOnClickListener(new u50(this, 13));
                    org.telegram.ui.Components.l21 l21Var = new org.telegram.ui.Components.l21(context);
                    l21Var.setTransformType(1);
                    l21Var.setProgress(0.0f);
                    l21Var.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
                    l21Var.setDrawBackground(false);
                    this.w.setContentDescription(LocaleController.getString(R.string.Next));
                    this.w.addView(l21Var, h7.z5.e(56, 56, 17));
                    org.telegram.ui.Components.m10 m10Var2 = this.w;
                    m10Var2.a(m10Var2);
                    l0();
                }
            }
            i10 = 8;
            ri0Var2.setVisibility(i10);
            linearLayout.addView(this.a, h7.z5.q(120, 120, 1));
            TextView textView4 = new TextView(context);
            this.d = textView4;
            int i142 = org.telegram.ui.ActionBar.g6.G6;
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i142, false));
            this.d.setTypeface(AndroidUtilities.bold());
            if (i12 == 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, h7.z5.t(-2, -2, 1, 0, 16, 0, 0));
            org.telegram.ui.Components.zz0 zz0Var2 = new org.telegram.ui.Components.zz0(context);
            this.e = zz0Var2;
            zz0Var2.setFactory(new dg0(context, 1));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, h7.z5.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView22 = new TextView(context);
            textView22.setTextSize(1, 14.0f);
            textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
            textView22.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            textView22.setGravity((!d0() ? 3 : 1) | 16);
            textView22.setOnClickListener(new u50(context, 12));
            textView22.setVisibility(i12 != 2 ? 0 : 8);
            textView22.setText(LocaleController.getString(R.string.ForgotPasscode));
            frameLayout2.addView(textView22, h7.z5.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            i6.q2(textView22);
            TextView textView32 = new TextView(context);
            this.r = textView32;
            textView32.setTextSize(1, 14.0f);
            this.r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
            this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
            this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
            frameLayout2.addView(this.r, h7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            org.telegram.ui.Components.jc0 jc0Var2 = new org.telegram.ui.Components.jc0(context, null);
            this.f = jc0Var2;
            jc0Var2.setText(LocaleController.getString(R.string.EnterPassword));
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
            this.h.setOnFocusChangeListener(new ld(this, 10));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, h7.z5.l(1.0f, 0, -2));
            ImageView imageView2 = new ImageView(context);
            this.s = imageView2;
            imageView2.setImageResource(R.drawable.msg_message);
            this.s.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            this.s.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
            AndroidUtilities.updateViewVisibilityAnimated(this.s, i12 != 1 && this.A == 0, 0.1f, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new gh.n4(this, atomicBoolean2, false, 9));
            this.s.setOnClickListener(new u70(11, this, atomicBoolean2));
            linearLayout22.addView(this.s, h7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, h7.z5.c(-2.0f, -1));
            frameLayout3.addView(this.f, h7.z5.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new fa(this, 8));
            this.h.addTextChangedListener(new yk0(this, 0));
            this.h.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(2));
            od0 od0Var2 = new od0(this, context, 2);
            this.n = od0Var2;
            od0Var2.b(4, 10);
            while (r10 < r5) {
            }
            frameLayout3.addView(this.n, h7.z5.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, h7.z5.t(-1, -2, 1, 0, 32, 0, 72));
            if (i12 == 1) {
            }
            org.telegram.ui.Components.m10 m10Var3 = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
            this.w = m10Var3;
            i6.q2(m10Var3);
            frameLayout2.addView(this.w, h7.z5.d(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.w.setOnClickListener(new u50(this, 13));
            org.telegram.ui.Components.l21 l21Var2 = new org.telegram.ui.Components.l21(context);
            l21Var2.setTransformType(1);
            l21Var2.setProgress(0.0f);
            l21Var2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
            l21Var2.setDrawBackground(false);
            this.w.setContentDescription(LocaleController.getString(R.string.Next));
            this.w.addView(l21Var2, h7.z5.e(56, 56, 17));
            org.telegram.ui.Components.m10 m10Var22 = this.w;
            m10Var22.a(m10Var22);
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
                al0 al0Var = this.b;
                if (al0Var != null) {
                    al0Var.l();
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
            for (wr wrVar : this.n.f) {
                wrVar.i(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        AndroidUtilities.shakeViewSpring(e0() ? this.n : this.f, e0() ? 10.0f : 4.0f, new uk0(this, 2));
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
                for (wr wrVar : this.n.f) {
                    wrVar.setText("");
                }
                if (e0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                f0();
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
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (wr wrVar2 : this.n.f) {
                wrVar2.clearFocus();
                AndroidUtilities.hideKeyboard(wrVar2);
            }
            this.v.setEditText(null);
            a0(new vk0(this, isEmpty, i10));
            return;
        }
        if (i11 == 2) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (wr wrVar3 : this.n.f) {
                    wrVar3.setText("");
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
                for (wr wrVar4 : this.n.f) {
                    wrVar4.setText("");
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
            wr[] wrVarArr = this.n.f;
            int length2 = wrVarArr.length;
            while (i10 < length2) {
                wr wrVar5 = wrVarArr[i10];
                wrVar5.clearFocus();
                AndroidUtilities.hideKeyboard(wrVar5);
                i10++;
            }
            this.v.setEditText(null);
            a0(new uk0(this, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 16, new Class[]{org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.x9.class}, null, null, null, i10));
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 262144, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    public final void h0() {
        if ((this.y == 1 && this.h.getText().length() == 0) || (this.y == 0 && this.n.getCode().length() != 4)) {
            f0();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.I;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        this.B = e0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (wr wrVar : this.n.f) {
            wrVar.setText("");
        }
        k0();
        this.A = 1;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z10 ? org.telegram.ui.Components.er.f : org.telegram.ui.Components.ws.e);
        duration.addUpdateListener(new g3(this, 19));
        duration.addListener(new n40(3, this, z10));
        duration.start();
    }

    public final void j0(Runnable runnable) {
        this.M = (jb0) runnable;
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
            vk0 vk0Var = new vk0(this, z10, 1);
            this.L = vk0Var;
            AndroidUtilities.runOnUIThread(vk0Var, 3000L);
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
            if (Build.VERSION.SDK_INT >= 23 && new a5.n(new androidx.biometric.s(ApplicationLoader.applicationContext, 0)).g(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i10 = this.H;
                this.H = i10 + 1;
                this.fingerprintRow = i10;
            }
        } catch (Throwable th) {
            FileLog.e(th);
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        wr[] wrVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        i0(c0(), false);
        org.telegram.ui.Components.ri0 ri0Var = this.a;
        if (ri0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    ri0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            ri0Var.setVisibility(i10);
        }
        od0 od0Var = this.n;
        if (od0Var == null || (wrVarArr = od0Var.f) == null) {
            return;
        }
        for (wr wrVar : wrVarArr) {
            wrVar.setShowSoftInputOnFocusCompat(!c0());
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        if (this.x != 0) {
            return true;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
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
        al0 al0Var = this.b;
        if (al0Var != null) {
            al0Var.l();
        }
        if (this.x != 0 && !c0()) {
            AndroidUtilities.runOnUIThread(new uk0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (c0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.x == 0) {
            return;
        }
        k0();
    }
}
