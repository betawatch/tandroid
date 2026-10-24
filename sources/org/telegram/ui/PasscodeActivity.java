package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.ActionBar.u0 Q;
    public boolean R;
    public final zk0 S;
    public al0 T;
    public kb0 U;
    public o71 V;
    public org.telegram.ui.Components.bk0 a;
    private int autoLockRow;
    public el0 b;
    public org.telegram.ui.Components.mm0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.s11 e;
    public org.telegram.ui.Components.vd0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public od0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.fs v;
    public org.telegram.ui.Components.h20 w;
    public final int x;
    public int y;

    public PasscodeActivity(int i10) {
        super(null);
        this.y = 0;
        this.E = 0;
        this.S = new zk0(this, 5);
        this.x = i10;
    }

    public static /* synthetic */ void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.qd0 qd0Var, int i10) {
        int value = qd0Var.getValue();
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
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new xt(passcodeActivity, 28));
                c2Var.show();
                org.telegram.ui.ActionBar.r6.W((TextView) c2Var.d(-1), org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
                return;
            }
            int i11 = 0;
            if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string2 = LocaleController.getString(R.string.AutoLock);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.R = string2;
                org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(passcodeActivity.getParentActivity(), null);
                qd0Var.setMinValue(0);
                qd0Var.setMaxValue(4);
                int i12 = SharedConfig.autoLockIn;
                if (i12 == 0) {
                    qd0Var.setValue(0);
                } else if (i12 == 60) {
                    qd0Var.setValue(1);
                } else if (i12 == 300) {
                    qd0Var.setValue(2);
                } else if (i12 == 3600) {
                    qd0Var.setValue(3);
                } else if (i12 == 18000) {
                    qd0Var.setValue(4);
                }
                qd0Var.setFormatter(new wv(11));
                alertDialog$Builder2.o(qd0Var);
                alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new hg.b2(passcodeActivity, qd0Var, i10, 14));
                passcodeActivity.showDialog(c2Var2);
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
                org.telegram.ui.Components.f5.u0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                return;
            }
            if (i10 == passcodeActivity.J) {
                org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(passcodeActivity.currentAccount);
                boolean z10 = !w9.I();
                if (w9.m != z10) {
                    w9.m = z10;
                    try {
                        org.telegram.ui.Wallet.l0.v().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", w9.m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.l0.j("failed to save prefs", e);
                    }
                }
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.w8) view).setChecked(w9.I());
                return;
            }
            if (i10 == passcodeActivity.K) {
                org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(passcodeActivity.currentAccount);
                boolean H = w10.H();
                boolean z11 = !H;
                ai.y8 y8Var = new ai.y8(7, view, H);
                org.telegram.ui.Wallet.p0 p0Var = w10.c;
                if (p0Var == null) {
                    y8Var.run(Boolean.FALSE);
                } else {
                    org.telegram.ui.Wallet.p0.h.execute(new org.telegram.messenger.s8(p0Var, p0Var.l(), z11, new org.telegram.ui.Wallet.k(y8Var, i11), 10));
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 e0() {
        return !SharedConfig.passcodeHash.isEmpty() ? new PasscodeActivity(2) : new g(6);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03d4 A[LOOP:0: B:51:0x03d2->B:52:0x03d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i10;
        org.telegram.ui.ActionBar.e1 e1Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = false;
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 15));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = 1;
        int i12 = this.x;
        if (i12 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, w7.z5.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        org.telegram.ui.Components.ra0 ra0Var = new org.telegram.ui.Components.ra0(this, context, frameLayout, 1);
        ra0Var.setDelegate(new bd0(1, this));
        this.fragmentView = ra0Var;
        ra0Var.addView(frameLayout, w7.z5.l(1.0f, -1, 0));
        org.telegram.ui.Components.fs fsVar = new org.telegram.ui.Components.fs(context);
        this.v = fsVar;
        fsVar.setVisibility(f0() ? 0 : 8);
        ra0Var.addView(this.v, w7.z5.n(-1, 230));
        if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Passcode));
            int i13 = org.telegram.ui.ActionBar.k6.a7;
            frameLayout2.setTag(Integer.valueOf(i13));
            org.telegram.ui.ActionBar.r6.i(i13, frameLayout2, null);
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
            this.c = mm0Var;
            mm0Var.t1();
            this.actionBar.setAdaptiveBackground(this.c);
            this.c.setLayoutManager(new hg.a0(i11, z10, 14));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, w7.z5.c(-1.0f, -1));
            org.telegram.ui.Components.mm0 mm0Var2 = this.c;
            el0 el0Var = new el0(this, context);
            this.b = el0Var;
            mm0Var2.setAdapter(el0Var);
            this.c.setOnItemClickListener(new h(this, 20));
        } else if (i12 == 1 || i12 == 2 || i12 == 3) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, kVar, null);
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.G6, null);
                org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.u8, null);
                this.actionBar.setCastShadows(false);
                org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
                if (i12 == 1) {
                    org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.ic_ab_other);
                    this.Q = a2;
                    e1Var = a2.e(1, R.drawable.msg_permissions, LocaleController.getString(R.string.PasscodeSwitchToPassword));
                } else {
                    e1Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new cl0(this, e1Var));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, w7.z5.c(-1.0f, -1));
            org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
            this.a = bk0Var;
            bk0Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            org.telegram.ui.Components.bk0 bk0Var2 = this.a;
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    bk0Var2.setVisibility(i10);
                    linearLayout.addView(this.a, w7.z5.q(120, 120, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i14 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.W(textView, i14, null);
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
                    linearLayout.addView(this.d, w7.z5.t(-2, -2, 1, 0, 16, 0, 0));
                    org.telegram.ui.Components.s11 s11Var = new org.telegram.ui.Components.s11(context);
                    this.e = s11Var;
                    s11Var.setFactory(new dg0(context, 1));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, w7.z5.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Oh, null);
                    textView2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    textView2.setGravity((!g0() ? 3 : 1) | 16);
                    textView2.setOnClickListener(new w50(context, 12));
                    textView2.setVisibility(i12 != 2 ? 0 : 8);
                    textView2.setText(LocaleController.getString(R.string.ForgotPasscode));
                    frameLayout2.addView(textView2, w7.z5.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    m.g3.p(textView2);
                    TextView textView3 = new TextView(context);
                    this.r = textView3;
                    textView3.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.W(this.r, org.telegram.ui.ActionBar.k6.D6, null);
                    this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
                    this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                    AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
                    frameLayout2.addView(this.r, w7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0(context, null);
                    this.f = vd0Var;
                    vd0Var.setText(LocaleController.getString(R.string.EnterPassword));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    org.telegram.ui.ActionBar.r6.W(this.h, i14, null);
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
                    org.telegram.ui.ActionBar.r6.x(this.h, org.telegram.ui.ActionBar.k6.l6, null);
                    this.h.setCursorSize(AndroidUtilities.dp(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int dp = AndroidUtilities.dp(16.0f);
                    this.h.setPadding(dp, dp, dp, dp);
                    this.h.setOnFocusChangeListener(new pd(this, 10));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, w7.z5.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    org.telegram.ui.ActionBar.r6.t(this.s, org.telegram.ui.ActionBar.k6.H6, null, PorterDuff.Mode.SRC_ATOP);
                    ImageView imageView2 = this.s;
                    int i15 = org.telegram.ui.ActionBar.k6.i6;
                    org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i15), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i15), getResourceProvider());
                    AndroidUtilities.updateViewVisibilityAnimated(this.s, i12 != 1 && this.E == 0, 0.1f, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new org.telegram.ui.Components.ao(3, this, atomicBoolean));
                    this.s.setOnClickListener(new ae0(4, this, atomicBoolean));
                    linearLayout2.addView(this.s, w7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, w7.z5.c(-2.0f, -1));
                    frameLayout3.addView(this.f, w7.z5.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new ka(this, 8));
                    this.h.addTextChangedListener(new dl0(this, 0));
                    this.h.setCustomSelectionActionModeCallback(new ki.c1(2));
                    od0 od0Var = new od0(this, context, 2);
                    this.n = od0Var;
                    od0Var.b(4, 10);
                    for (vr vrVar : this.n.f) {
                        vrVar.setShowSoftInputOnFocusCompat(!f0());
                        vrVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        vrVar.setTextSize(1, 24.0f);
                        vrVar.addTextChangedListener(new dl0(this, 1));
                        vrVar.setOnFocusChangeListener(new ai.ib(this, vrVar, 3));
                    }
                    frameLayout3.addView(this.n, w7.z5.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, w7.z5.t(-1, -2, 1, 0, 32, 0, 72));
                    if (i12 == 1) {
                        frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
                    }
                    org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
                    this.w = h20Var;
                    m.g3.p(h20Var);
                    frameLayout2.addView(this.w, w7.z5.d(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.w.setOnClickListener(new w50(this, 13));
                    org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(context);
                    f41Var.setTransformType(1);
                    f41Var.setProgress(0.0f);
                    f41Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
                    f41Var.setDrawBackground(false);
                    this.w.setContentDescription(LocaleController.getString(R.string.Next));
                    this.w.addView(f41Var, w7.z5.e(56, 56, 17));
                    org.telegram.ui.Components.h20 h20Var2 = this.w;
                    h20Var2.a(h20Var2);
                    o0();
                }
            }
            i10 = 8;
            bk0Var2.setVisibility(i10);
            linearLayout.addView(this.a, w7.z5.q(120, 120, 1));
            TextView textView4 = new TextView(context);
            this.d = textView4;
            int i142 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(textView4, i142, null);
            this.d.setTypeface(AndroidUtilities.bold());
            if (i12 == 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, w7.z5.t(-2, -2, 1, 0, 16, 0, 0));
            org.telegram.ui.Components.s11 s11Var2 = new org.telegram.ui.Components.s11(context);
            this.e = s11Var2;
            s11Var2.setFactory(new dg0(context, 1));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, w7.z5.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView22 = new TextView(context);
            textView22.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.W(textView22, org.telegram.ui.ActionBar.k6.Oh, null);
            textView22.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            textView22.setGravity((!g0() ? 3 : 1) | 16);
            textView22.setOnClickListener(new w50(context, 12));
            textView22.setVisibility(i12 != 2 ? 0 : 8);
            textView22.setText(LocaleController.getString(R.string.ForgotPasscode));
            frameLayout2.addView(textView22, w7.z5.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            m.g3.p(textView22);
            TextView textView32 = new TextView(context);
            this.r = textView32;
            textView32.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.W(this.r, org.telegram.ui.ActionBar.k6.D6, null);
            this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
            this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
            frameLayout2.addView(this.r, w7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            org.telegram.ui.Components.vd0 vd0Var2 = new org.telegram.ui.Components.vd0(context, null);
            this.f = vd0Var2;
            vd0Var2.setText(LocaleController.getString(R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.W(this.h, i142, null);
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
            this.h.setSingleLine(true);
            if (i12 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            org.telegram.ui.ActionBar.r6.x(this.h, org.telegram.ui.ActionBar.k6.l6, null);
            this.h.setCursorSize(AndroidUtilities.dp(20.0f));
            this.h.setCursorWidth(1.5f);
            int dp2 = AndroidUtilities.dp(16.0f);
            this.h.setPadding(dp2, dp2, dp2, dp2);
            this.h.setOnFocusChangeListener(new pd(this, 10));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, w7.z5.l(1.0f, 0, -2));
            ImageView imageView3 = new ImageView(context);
            this.s = imageView3;
            imageView3.setImageResource(R.drawable.msg_message);
            org.telegram.ui.ActionBar.r6.t(this.s, org.telegram.ui.ActionBar.k6.H6, null, PorterDuff.Mode.SRC_ATOP);
            ImageView imageView22 = this.s;
            int i152 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.S(imageView22, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i152), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i152), getResourceProvider());
            AndroidUtilities.updateViewVisibilityAnimated(this.s, i12 != 1 && this.E == 0, 0.1f, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new org.telegram.ui.Components.ao(3, this, atomicBoolean2));
            this.s.setOnClickListener(new ae0(4, this, atomicBoolean2));
            linearLayout22.addView(this.s, w7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, w7.z5.c(-2.0f, -1));
            frameLayout3.addView(this.f, w7.z5.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new ka(this, 8));
            this.h.addTextChangedListener(new dl0(this, 0));
            this.h.setCustomSelectionActionModeCallback(new ki.c1(2));
            od0 od0Var2 = new od0(this, context, 2);
            this.n = od0Var2;
            od0Var2.b(4, 10);
            while (r10 < r5) {
            }
            frameLayout3.addView(this.n, w7.z5.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, w7.z5.t(-1, -2, 1, 0, 32, 0, 72));
            if (i12 == 1) {
            }
            org.telegram.ui.Components.h20 h20Var3 = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
            this.w = h20Var3;
            m.g3.p(h20Var3);
            frameLayout2.addView(this.w, w7.z5.d(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.w.setOnClickListener(new w50(this, 13));
            org.telegram.ui.Components.f41 f41Var2 = new org.telegram.ui.Components.f41(context);
            f41Var2.setTransformType(1);
            f41Var2.setProgress(0.0f);
            f41Var2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
            f41Var2.setDrawBackground(false);
            this.w.setContentDescription(LocaleController.getString(R.string.Next));
            this.w.addView(f41Var2, w7.z5.e(56, 56, 17));
            org.telegram.ui.Components.h20 h20Var22 = this.w;
            h20Var22.a(h20Var22);
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
            od0 od0Var = this.n;
            vr[] vrVarArr = od0Var.f;
            if (i10 >= vrVarArr.length) {
                od0Var.postDelayed(new bh0(7, this, runnable), (vrVarArr.length * 75) + 350);
                return;
            } else {
                vr vrVar = vrVarArr[i10];
                vrVar.postDelayed(new bl0(vrVar, 0), i10 * 75);
                i10++;
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.x == 0) {
                p0();
                el0 el0Var = this.b;
                if (el0Var != null) {
                    el0Var.l();
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

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        if (this.x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    public final boolean h0() {
        int i10 = this.x;
        return (i10 == 1 && this.y == 0) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 0);
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            for (vr vrVar : this.n.f) {
                vrVar.i(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        AndroidUtilities.shakeViewSpring(h0() ? this.n : this.f, h0() ? 10.0f : 4.0f, new zk0(this, 3));
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
                for (vr vrVar : this.n.f) {
                    vrVar.setText("");
                }
                if (h0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                i0();
                this.n.removeCallbacks(this.S);
                this.n.post(new zk0(this, 0));
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
            } catch (Exception e) {
                FileLog.e(e);
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
            d0(new al0(this, isEmpty, i11));
            return;
        }
        if (i10 == 2 || i10 == 3) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (vr vrVar3 : this.n.f) {
                    vrVar3.setText("");
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
                for (vr vrVar4 : this.n.f) {
                    vrVar4.setText("");
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
            vr[] vrVarArr = this.n.f;
            int length2 = vrVarArr.length;
            while (i11 < length2) {
                vr vrVar5 = vrVarArr[i11];
                vrVar5.clearFocus();
                AndroidUtilities.hideKeyboard(vrVar5);
                i11++;
            }
            this.v.setEditText(null);
            if (i10 == 3) {
                d0(new zk0(this, 1));
            } else {
                d0(new zk0(this, 2));
            }
        }
    }

    public final void k0() {
        if ((this.y == 1 && this.h.getText().length() == 0) || (this.y == 0 && this.n.getCode().length() != 4)) {
            i0();
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.Q;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        this.F = h0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (vr vrVar : this.n.f) {
            vrVar.setText("");
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
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z10 ? org.telegram.ui.Components.bs.f : org.telegram.ui.Components.st.e);
        duration.addUpdateListener(new d3(this, 19));
        duration.addListener(new o40(3, this, z10));
        duration.start();
    }

    public final void m0(Runnable runnable) {
        this.U = (kb0) runnable;
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
            al0 al0Var = new al0(this, z10, 1);
            this.T = al0Var;
            AndroidUtilities.runOnUIThread(al0Var, 3000L);
        } else {
            this.w.e(false, z10);
        }
        l0(f0(), z10);
        n0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        vr[] vrVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        l0(f0(), false);
        org.telegram.ui.Components.bk0 bk0Var = this.a;
        if (bk0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    bk0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            bk0Var.setVisibility(i10);
        }
        od0 od0Var = this.n;
        if (od0Var == null || (vrVarArr = od0Var.f) == null) {
            return;
        }
        for (vr vrVar : vrVarArr) {
            vrVar.setShowSoftInputOnFocusCompat(!f0());
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        p0();
        if (this.x != 0) {
            return true;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onFragmentDestroy() {
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
        el0 el0Var = this.b;
        if (el0Var != null) {
            el0Var.l();
        }
        if (this.x != 0 && !f0()) {
            AndroidUtilities.runOnUIThread(new zk0(this, 6), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (f0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.l6, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            if (new androidx.biometric.e(new k6.h(ApplicationLoader.applicationContext, 1)).f(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
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
