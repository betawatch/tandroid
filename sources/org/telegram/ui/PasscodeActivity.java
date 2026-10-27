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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.ActionBar.w0 Q;
    public boolean R;
    public final hl0 S;
    public il0 T;
    public jb0 U;
    public yc1 V;
    public org.telegram.ui.Components.bk0 a;
    private int autoLockRow;
    public ol0 b;
    public org.telegram.ui.Components.nm0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.b21 e;
    public org.telegram.ui.Components.sd0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public nd0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.hs v;
    public org.telegram.ui.Components.j20 w;
    public final int x;
    public int y;

    public PasscodeActivity(int i10) {
        super(null);
        this.y = 0;
        this.E = 0;
        this.S = new hl0(this, 5);
        this.x = i10;
    }

    public static /* synthetic */ void V(PasscodeActivity passcodeActivity, org.telegram.ui.Components.nd0 nd0Var, int i10) {
        int value = nd0Var.getValue();
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

    public static void W(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            int i11 = 0;
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                e2Var.T = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new jl0(passcodeActivity, i11));
                e2Var.show();
                org.telegram.ui.ActionBar.f7.V((TextView) e2Var.d(-1), org.telegram.ui.ActionBar.y6.q7, null);
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
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                e2Var2.R = string2;
                org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(passcodeActivity.getParentActivity(), null);
                nd0Var.setMinValue(0);
                nd0Var.setMaxValue(4);
                int i12 = SharedConfig.autoLockIn;
                if (i12 == 0) {
                    nd0Var.setValue(0);
                } else if (i12 == 60) {
                    nd0Var.setValue(1);
                } else if (i12 == 300) {
                    nd0Var.setValue(2);
                } else if (i12 == 3600) {
                    nd0Var.setValue(3);
                } else if (i12 == 18000) {
                    nd0Var.setValue(4);
                }
                nd0Var.setFormatter(new org.telegram.ui.Components.voip.c1(14));
                alertDialog$Builder2.o(nd0Var);
                alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new i2.z(passcodeActivity, nd0Var, i10, 15));
                passcodeActivity.showDialog(e2Var2);
                return;
            }
            if (i10 == passcodeActivity.fingerprintRow) {
                SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.useFingerprintLock);
                return;
            }
            if (i10 == passcodeActivity.N) {
                SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.allowScreenCapture);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                if (SharedConfig.allowScreenCapture) {
                    return;
                }
                org.telegram.ui.Components.g5.t0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                return;
            }
            if (i10 == passcodeActivity.J) {
                org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean z10 = !x9.K();
                if (x9.m != z10) {
                    x9.m = z10;
                    try {
                        org.telegram.ui.Wallet.l0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x9.m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.l0.k("failed to save prefs", e);
                    }
                }
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.a9) view).setChecked(x9.K());
                return;
            }
            if (i10 == passcodeActivity.K) {
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean J = x10.J();
                boolean z11 = !J;
                bi.t8 t8Var = new bi.t8(7, view, J);
                org.telegram.ui.Wallet.p0 p0Var = x10.c;
                if (p0Var == null) {
                    t8Var.run(Boolean.FALSE);
                } else {
                    org.telegram.ui.Wallet.p0.h.execute(new org.telegram.messenger.v8(p0Var, p0Var.l(), z11, new org.telegram.ui.Wallet.k(t8Var, i11), 10));
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.r2 l0() {
        return !SharedConfig.passcodeHash.isEmpty() ? new PasscodeActivity(2) : new g(6);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e3 A[LOOP:0: B:54:0x03e1->B:55:0x03e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var;
        c20 c20Var = new c20(this, 18);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        boolean z10 = false;
        if (r5Var != null) {
            r5Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(c20Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setAllowOverlayTitle(false);
            this.actionBar.setActionBarMenuOnItemClick(c20Var);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = this.x;
        int i12 = 1;
        if (i11 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, org.telegram.ui.Components.kb1.g(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        ll0 ll0Var = new ll0(this, context, frameLayout, 0);
        ll0Var.setDelegate(new ad0(1, this));
        this.fragmentView = ll0Var;
        ll0Var.addView(frameLayout, org.telegram.ui.Components.kb1.p(1.0f, -1, 0));
        org.telegram.ui.Components.hs hsVar = new org.telegram.ui.Components.hs(context);
        this.v = hsVar;
        hsVar.setVisibility(m0() ? 0 : 8);
        ll0Var.addView(this.v, org.telegram.ui.Components.kb1.r(-1, 230));
        if (i11 == 0) {
            setHasOwnBackground(true);
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Passcode));
            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.a7));
            org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
            this.c = nm0Var;
            nm0Var.u1();
            this.c.setSectionsDrawBackground(true);
            this.c.setLayoutManager(new ig.a0(i12, z10, 14));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            org.telegram.ui.Components.nm0 nm0Var2 = this.c;
            ol0 ol0Var = new ol0(this, context);
            this.b = ol0Var;
            nm0Var2.setAdapter(ol0Var);
            this.c.setOnItemClickListener(new h(this, 20));
        } else if (i11 == 1 || i11 == 2 || i11 == 3) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, kVar, null);
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, org.telegram.ui.ActionBar.y6.G6, null);
                org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.u8, null);
                this.actionBar.setCastShadows(false);
                org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
                if (i11 == 1) {
                    org.telegram.ui.ActionBar.w0 a2 = l4.a(0, R.drawable.ic_ab_other);
                    this.Q = a2;
                    g1Var = a2.e(1, R.drawable.msg_permissions, LocaleController.getString(R.string.PasscodeSwitchToPassword));
                } else {
                    g1Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new ml0(this, g1Var));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, org.telegram.ui.Components.kb1.g(-1.0f, -1));
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
                    linearLayout.addView(this.a, org.telegram.ui.Components.kb1.u(120, 120, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i13 = org.telegram.ui.ActionBar.y6.G6;
                    org.telegram.ui.ActionBar.f7.V(textView, i13, null);
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
                    linearLayout.addView(this.d, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 16, 0, 0));
                    org.telegram.ui.Components.b21 b21Var = new org.telegram.ui.Components.b21(context);
                    this.e = b21Var;
                    b21Var.setFactory(new dg0(context, 1));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, org.telegram.ui.Components.kb1.x(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.Oh, null);
                    textView2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    textView2.setGravity((!n0() ? 3 : 1) | 16);
                    textView2.setOnClickListener(new z50(context, 14));
                    textView2.setVisibility(i11 != 2 ? 0 : 8);
                    textView2.setText(LocaleController.getString(R.string.ForgotPasscode));
                    frameLayout2.addView(textView2, org.telegram.ui.Components.kb1.h(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    k6.c.h(textView2);
                    TextView textView3 = new TextView(context);
                    this.r = textView3;
                    textView3.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.f7.V(this.r, org.telegram.ui.ActionBar.y6.D6, null);
                    this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
                    this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                    AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
                    frameLayout2.addView(this.r, org.telegram.ui.Components.kb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context, null);
                    this.f = sd0Var;
                    sd0Var.setText(LocaleController.getString(R.string.EnterPassword));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    org.telegram.ui.ActionBar.f7.V(this.h, i13, null);
                    this.h.setBackground(null);
                    this.h.setMaxLines(1);
                    this.h.setLines(1);
                    this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
                    this.h.setSingleLine(true);
                    if (i11 != 1) {
                        this.E = 0;
                        this.h.setImeOptions(5);
                    } else {
                        this.E = 1;
                        this.h.setImeOptions(6);
                    }
                    this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.h.setTypeface(Typeface.DEFAULT);
                    org.telegram.ui.ActionBar.f7.w(this.h, org.telegram.ui.ActionBar.y6.l6, null);
                    this.h.setCursorSize(AndroidUtilities.dp(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int dp = AndroidUtilities.dp(16.0f);
                    this.h.setPadding(dp, dp, dp, dp);
                    this.h.setOnFocusChangeListener(new rd(this, 10));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, org.telegram.ui.Components.kb1.p(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    org.telegram.ui.ActionBar.f7.t(this.s, org.telegram.ui.ActionBar.y6.H6, null, PorterDuff.Mode.SRC_ATOP);
                    ImageView imageView2 = this.s;
                    int i14 = org.telegram.ui.ActionBar.y6.i6;
                    org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i14), getResourceProvider());
                    AndroidUtilities.updateViewVisibilityAnimated(this.s, i11 != 1 && this.E == 0, 0.1f, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new org.telegram.ui.Components.bo(3, this, atomicBoolean));
                    this.s.setOnClickListener(new zd0(4, this, atomicBoolean));
                    linearLayout2.addView(this.s, org.telegram.ui.Components.kb1.y(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, org.telegram.ui.Components.kb1.g(-2.0f, -1));
                    frameLayout3.addView(this.f, org.telegram.ui.Components.kb1.x(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new la(this, 8));
                    this.h.addTextChangedListener(new nl0(this, 0));
                    this.h.setCustomSelectionActionModeCallback(new li.b1(2));
                    nd0 nd0Var = new nd0(this, context, 2);
                    this.n = nd0Var;
                    nd0Var.b(4, 10);
                    for (zr zrVar : this.n.f) {
                        zrVar.setShowSoftInputOnFocusCompat(!m0());
                        zrVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        zrVar.setTextSize(1, 24.0f);
                        zrVar.addTextChangedListener(new nl0(this, 1));
                        zrVar.setOnFocusChangeListener(new bi.gb(this, zrVar, 3));
                    }
                    frameLayout3.addView(this.n, org.telegram.ui.Components.kb1.h(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, org.telegram.ui.Components.kb1.x(-1, -2, 1, 0, 32, 0, 72));
                    if (i11 == 1) {
                        frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
                    }
                    org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
                    this.w = j20Var;
                    k6.c.h(j20Var);
                    frameLayout2.addView(this.w, org.telegram.ui.Components.kb1.h(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.w.setOnClickListener(new z50(this, 15));
                    org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(context);
                    n41Var.setTransformType(1);
                    n41Var.setProgress(0.0f);
                    n41Var.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.O9, false));
                    n41Var.setDrawBackground(false);
                    this.w.setContentDescription(LocaleController.getString(R.string.Next));
                    this.w.addView(n41Var, org.telegram.ui.Components.kb1.i(56, 56, 17));
                    org.telegram.ui.Components.j20 j20Var2 = this.w;
                    j20Var2.a(j20Var2);
                    v0();
                }
            }
            i10 = 8;
            bk0Var2.setVisibility(i10);
            linearLayout.addView(this.a, org.telegram.ui.Components.kb1.u(120, 120, 1));
            TextView textView4 = new TextView(context);
            this.d = textView4;
            int i132 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(textView4, i132, null);
            this.d.setTypeface(AndroidUtilities.bold());
            if (i11 == 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 16, 0, 0));
            org.telegram.ui.Components.b21 b21Var2 = new org.telegram.ui.Components.b21(context);
            this.e = b21Var2;
            b21Var2.setFactory(new dg0(context, 1));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, org.telegram.ui.Components.kb1.x(-2, -2, 1, 20, 8, 20, 0));
            TextView textView22 = new TextView(context);
            textView22.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView22, org.telegram.ui.ActionBar.y6.Oh, null);
            textView22.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            textView22.setGravity((!n0() ? 3 : 1) | 16);
            textView22.setOnClickListener(new z50(context, 14));
            textView22.setVisibility(i11 != 2 ? 0 : 8);
            textView22.setText(LocaleController.getString(R.string.ForgotPasscode));
            frameLayout2.addView(textView22, org.telegram.ui.Components.kb1.h(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            k6.c.h(textView22);
            TextView textView32 = new TextView(context);
            this.r = textView32;
            textView32.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(this.r, org.telegram.ui.ActionBar.y6.D6, null);
            this.r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
            this.r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.r, false, 1.0f, false);
            frameLayout2.addView(this.r, org.telegram.ui.Components.kb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            org.telegram.ui.Components.sd0 sd0Var2 = new org.telegram.ui.Components.sd0(context, null);
            this.f = sd0Var2;
            sd0Var2.setText(LocaleController.getString(R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.f7.V(this.h, i132, null);
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(!LocaleController.isRTL ? 5 : 3);
            this.h.setSingleLine(true);
            if (i11 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            org.telegram.ui.ActionBar.f7.w(this.h, org.telegram.ui.ActionBar.y6.l6, null);
            this.h.setCursorSize(AndroidUtilities.dp(20.0f));
            this.h.setCursorWidth(1.5f);
            int dp2 = AndroidUtilities.dp(16.0f);
            this.h.setPadding(dp2, dp2, dp2, dp2);
            this.h.setOnFocusChangeListener(new rd(this, 10));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, org.telegram.ui.Components.kb1.p(1.0f, 0, -2));
            ImageView imageView3 = new ImageView(context);
            this.s = imageView3;
            imageView3.setImageResource(R.drawable.msg_message);
            org.telegram.ui.ActionBar.f7.t(this.s, org.telegram.ui.ActionBar.y6.H6, null, PorterDuff.Mode.SRC_ATOP);
            ImageView imageView22 = this.s;
            int i142 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.ActionBar.f7.R(imageView22, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i142), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i142), getResourceProvider());
            AndroidUtilities.updateViewVisibilityAnimated(this.s, i11 != 1 && this.E == 0, 0.1f, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new org.telegram.ui.Components.bo(3, this, atomicBoolean2));
            this.s.setOnClickListener(new zd0(4, this, atomicBoolean2));
            linearLayout22.addView(this.s, org.telegram.ui.Components.kb1.y(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, org.telegram.ui.Components.kb1.g(-2.0f, -1));
            frameLayout3.addView(this.f, org.telegram.ui.Components.kb1.x(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new la(this, 8));
            this.h.addTextChangedListener(new nl0(this, 0));
            this.h.setCustomSelectionActionModeCallback(new li.b1(2));
            nd0 nd0Var2 = new nd0(this, context, 2);
            this.n = nd0Var2;
            nd0Var2.b(4, 10);
            while (r10 < r5) {
            }
            frameLayout3.addView(this.n, org.telegram.ui.Components.kb1.h(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, org.telegram.ui.Components.kb1.x(-1, -2, 1, 0, 32, 0, 72));
            if (i11 == 1) {
            }
            org.telegram.ui.Components.j20 j20Var3 = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
            this.w = j20Var3;
            k6.c.h(j20Var3);
            frameLayout2.addView(this.w, org.telegram.ui.Components.kb1.h(56, 56.0f, (!LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.w.setOnClickListener(new z50(this, 15));
            org.telegram.ui.Components.n41 n41Var2 = new org.telegram.ui.Components.n41(context);
            n41Var2.setTransformType(1);
            n41Var2.setProgress(0.0f);
            n41Var2.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.O9, false));
            n41Var2.setDrawBackground(false);
            this.w.setContentDescription(LocaleController.getString(R.string.Next));
            this.w.addView(n41Var2, org.telegram.ui.Components.kb1.i(56, 56, 17));
            org.telegram.ui.Components.j20 j20Var22 = this.w;
            j20Var22.a(j20Var22);
            v0();
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.x == 0) {
                w0();
                ol0 ol0Var = this.b;
                if (ol0Var != null) {
                    ol0Var.l();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.a7));
        if (this.x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean hasForceLightStatusBar() {
        return this.x != 0;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return this.x == 0;
    }

    public final void k0(Runnable runnable) {
        if (!o0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            nd0 nd0Var = this.n;
            zr[] zrVarArr = nd0Var.f;
            if (i10 >= zrVarArr.length) {
                nd0Var.postDelayed(new kb0(27, this, runnable), (zrVarArr.length * 75) + 350);
                return;
            } else {
                zr zrVar = zrVarArr[i10];
                zrVar.postDelayed(new kl0(zrVar, 0), i10 * 75);
                i10++;
            }
        }
    }

    public final boolean m0() {
        if (!o0() || this.x == 0 || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final boolean n0() {
        int i10 = this.x;
        return (i10 == 1 && this.y == 1) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 1);
    }

    public final boolean o0() {
        int i10 = this.x;
        return (i10 == 1 && this.y == 0) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 0);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onConfigurationChanged(Configuration configuration) {
        zr[] zrVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        s0(m0(), false);
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
        nd0 nd0Var = this.n;
        if (nd0Var == null || (zrVarArr = nd0Var.f) == null) {
            return;
        }
        for (zr zrVar : zrVarArr) {
            zrVar.setShowSoftInputOnFocusCompat(!m0());
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0();
        if (this.x != 0) {
            return true;
        }
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.didSetPasscode);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.x == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetPasscode);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        ol0 ol0Var = this.b;
        if (ol0Var != null) {
            ol0Var.l();
        }
        if (this.x != 0 && !m0()) {
            AndroidUtilities.runOnUIThread(new hl0(this, 6), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (m0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.y6.l6, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.x == 0) {
            return;
        }
        u0();
    }

    public final void p0() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (o0()) {
            for (zr zrVar : this.n.f) {
                zrVar.i(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        AndroidUtilities.shakeViewSpring(o0() ? this.n : this.f, o0() ? 10.0f : 4.0f, new hl0(this, 3));
    }

    public final void q0() {
        if (n0() && this.h.getText().length() == 0) {
            p0();
            return;
        }
        String code = o0() ? this.n.getCode() : this.h.getText().toString();
        int i10 = this.x;
        int i11 = 0;
        if (i10 == 1) {
            if (!this.F.equals(code)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.r, true);
                for (zr zrVar : this.n.f) {
                    zrVar.setText("");
                }
                if (o0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                p0();
                this.n.removeCallbacks(this.S);
                this.n.post(new hl0(this, 0));
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
            for (zr zrVar2 : this.n.f) {
                zrVar2.clearFocus();
                AndroidUtilities.hideKeyboard(zrVar2);
            }
            this.v.setEditText(null);
            k0(new il0(this, isEmpty, i11));
            return;
        }
        if (i10 == 2 || i10 == 3) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (zr zrVar3 : this.n.f) {
                    zrVar3.setText("");
                }
                this.h.setText("");
                if (o0()) {
                    this.n.f[0].requestFocus();
                }
                p0();
                return;
            }
            if (!SharedConfig.checkPasscode(code)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (zr zrVar4 : this.n.f) {
                    zrVar4.setText("");
                }
                if (o0()) {
                    this.n.f[0].requestFocus();
                }
                p0();
                return;
            }
            SharedConfig.badPasscodeTries = 0;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            zr[] zrVarArr = this.n.f;
            int length2 = zrVarArr.length;
            while (i11 < length2) {
                zr zrVar5 = zrVarArr[i11];
                zrVar5.clearFocus();
                AndroidUtilities.hideKeyboard(zrVar5);
                i11++;
            }
            this.v.setEditText(null);
            if (i10 == 3) {
                k0(new hl0(this, 1));
            } else {
                k0(new hl0(this, 2));
            }
        }
    }

    public final void r0() {
        if ((this.y == 1 && this.h.getText().length() == 0) || (this.y == 0 && this.n.getCode().length() != 4)) {
            p0();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.Q;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        this.F = o0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (zr zrVar : this.n.f) {
            zrVar.setText("");
        }
        u0();
        this.E = 1;
    }

    public final void s0(boolean z10, boolean z11) {
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
        duration.setInterpolator(z10 ? org.telegram.ui.Components.ds.f : org.telegram.ui.Components.ut.e);
        duration.addUpdateListener(new b3(this, 18));
        duration.addListener(new s40(3, this, z10));
        duration.start();
    }

    public final void t0(Runnable runnable) {
        this.U = (jb0) runnable;
    }

    public final void u0() {
        if (o0()) {
            this.n.f[0].requestFocus();
            if (m0()) {
                return;
            }
            AndroidUtilities.showKeyboard(this.n.f[0]);
            return;
        }
        if (n0()) {
            this.h.requestFocus();
            AndroidUtilities.showKeyboard(this.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return this.x == 0;
    }

    public final void v0() {
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
        if (o0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f, false, 1.0f, z10);
        } else if (n0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f, true, 1.0f, z10);
        }
        if (n0()) {
            il0 il0Var = new il0(this, z10, 1);
            this.T = il0Var;
            AndroidUtilities.runOnUIThread(il0Var, 3000L);
        } else {
            this.w.e(false, z10);
        }
        s0(m0(), z10);
        u0();
    }

    public final void w0() {
        this.I = -1;
        this.J = -1;
        this.fingerprintRow = -1;
        this.K = -1;
        this.L = -1;
        this.G = 1;
        this.P = 3;
        this.changePasscodeRow = 2;
        try {
            if (new a8.h0(new l6.h(ApplicationLoader.applicationContext, 1)).h(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
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
