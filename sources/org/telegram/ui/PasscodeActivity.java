package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.KeyguardManager;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int E;
    public int F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public org.telegram.ui.ActionBar.q0 R;
    public boolean S;
    public final ai0 T;
    public bi0 U;
    public i90 V;
    public ma1 W;
    public org.telegram.ui.Components.fh0 a;
    private int autoLockRow;
    public n4 b;
    public org.telegram.ui.Components.tj0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.vy0 e;
    public org.telegram.ui.Components.gb0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public ib0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.br w;
    public org.telegram.ui.Components.l00 x;
    public final int y;

    public PasscodeActivity(int i3) {
        super(null);
        this.E = 0;
        this.F = 0;
        this.T = new ai0(this, 5);
        this.y = i3;
    }

    public static /* synthetic */ void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.cb0 cb0Var, int i3) {
        int value = cb0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.az.y = 0;
        } else if (value == 1) {
            org.telegram.messenger.az.y = 60;
        } else if (value == 2) {
            org.telegram.messenger.az.y = org.telegram.messenger.hs.X4;
        } else if (value == 3) {
            org.telegram.messenger.az.y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.az.y = 18000;
        }
        passcodeActivity.b.g(i3);
        org.telegram.messenger.h10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i3) {
        if (view.isEnabled()) {
            int i10 = 0;
            if (i3 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131751434, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131751433, null);
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751432, null), new ci0(passcodeActivity, i10));
                s1Var.show();
                org.telegram.ui.ActionBar.r6.V((TextView) s1Var.d(-1), org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            if (i3 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
                return;
            }
            if (i3 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String M02 = org.telegram.messenger.bd.M0(2131753800, null);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                s1Var2.S = M02;
                org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(passcodeActivity.getParentActivity(), null);
                cb0Var.setMinValue(0);
                cb0Var.setMaxValue(4);
                int i11 = org.telegram.messenger.az.y;
                int i12 = 3;
                if (i11 == 0) {
                    cb0Var.setValue(0);
                } else if (i11 == 60) {
                    cb0Var.setValue(1);
                } else if (i11 == 300) {
                    cb0Var.setValue(2);
                } else if (i11 == 3600) {
                    cb0Var.setValue(3);
                } else if (i11 == 18000) {
                    cb0Var.setValue(4);
                }
                cb0Var.setFormatter(new u70(i12));
                alertDialog$Builder2.o(cb0Var);
                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131751355, null), new k2.y(passcodeActivity, cb0Var, i3, 14));
                passcodeActivity.showDialog(s1Var2);
                return;
            }
            if (i3 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.az.D = !org.telegram.messenger.az.D;
                org.telegram.messenger.h10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.D);
                return;
            }
            if (i3 == passcodeActivity.O) {
                org.telegram.messenger.az.A = !org.telegram.messenger.az.A;
                org.telegram.messenger.h10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.A);
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.n0, Boolean.FALSE);
                if (org.telegram.messenger.az.A) {
                    return;
                }
                org.telegram.ui.Components.t4.t0(passcodeActivity, null, org.telegram.messenger.bd.M0(2131745854, null), null);
                return;
            }
            if (i3 == passcodeActivity.K) {
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(passcodeActivity.currentAccount);
                boolean z10 = !x10.K();
                if (x10.m != z10) {
                    x10.m = z10;
                    try {
                        org.telegram.ui.Wallet.k0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x10.m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.k0.k("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.h10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(x10.K());
                return;
            }
            if (i3 == passcodeActivity.L) {
                org.telegram.ui.Wallet.k0 x11 = org.telegram.ui.Wallet.k0.x(passcodeActivity.currentAccount);
                boolean J = x11.J();
                boolean z11 = !J;
                ci.b8 b8Var = new ci.b8(7, view, J);
                org.telegram.ui.Wallet.o0 o0Var = x11.c;
                if (o0Var == null) {
                    b8Var.a(Boolean.FALSE);
                } else {
                    org.telegram.ui.Wallet.o0.h.execute(new org.telegram.messenger.video.o(o0Var, o0Var.l(), z11, new org.telegram.ui.Wallet.k(b8Var, i10), 3));
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.d2 p0() {
        return !org.telegram.messenger.az.s.isEmpty() ? new PasscodeActivity(2) : new g(6);
    }

    public final void A0() {
        this.J = -1;
        this.K = -1;
        this.fingerprintRow = -1;
        this.L = -1;
        this.M = -1;
        this.H = 1;
        this.Q = 3;
        this.changePasscodeRow = 2;
        try {
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.b, 0)).b(15) == 0) {
                Typeface typeface = org.telegram.messenger.g0.a;
                if (((KeyguardManager) org.telegram.messenger.t0.b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i3 = this.Q;
                    this.Q = i3 + 1;
                    this.fingerprintRow = i3;
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        int i10 = this.Q;
        this.autoLockRow = i10;
        this.Q = i10 + 2;
        this.I = i10 + 1;
        if (((org.telegram.messenger.h0) getMessagesController().x7.j0.b).c) {
            int i11 = this.Q;
            this.J = i11;
            this.Q = i11 + 2;
            this.K = i11 + 1;
            if (org.telegram.ui.Wallet.o0.i(org.telegram.messenger.t0.b)) {
                int i12 = this.Q;
                this.Q = i12 + 1;
                this.L = i12;
            }
            int i13 = this.Q;
            this.Q = i13 + 1;
            this.M = i13;
        }
        int i14 = this.Q;
        this.N = i14;
        this.O = i14 + 1;
        this.P = i14 + 2;
        this.Q = i14 + 4;
        this.disablePasscodeRow = i14 + 3;
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e0 A[LOOP:0: B:54:0x03de->B:55:0x03e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i3;
        org.telegram.ui.ActionBar.y0 y0Var;
        hx hxVar = new hx(this, 21);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        if (y4Var != null) {
            y4Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(hxVar);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setAllowOverlayTitle(false);
            this.actionBar.setActionBarMenuOnItemClick(hxVar);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = this.y;
        int i12 = 1;
        if (i11 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, b8.mf.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        ei0 ei0Var = new ei0(this, context, frameLayout, i10);
        ei0Var.setDelegate(new ua0(i12, this));
        this.fragmentView = ei0Var;
        ei0Var.addView(frameLayout, b8.mf.l(1.0f, -1, 0));
        org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(context);
        this.w = brVar;
        brVar.setVisibility(q0() ? 0 : 8);
        ei0Var.addView(this.w, b8.mf.o(-1, org.telegram.messenger.hs.G3));
        if (i11 == 0) {
            setHasOwnBackground(true);
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747665, null));
            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
            org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
            this.c = tj0Var;
            tj0Var.r1();
            this.c.setSectionsDrawBackground(true);
            this.c.setLayoutManager(new kg.y(i12, z10 ? 1 : 0, 14));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, b8.mf.c(-1.0f, -1));
            org.telegram.ui.Components.tj0 tj0Var2 = this.c;
            n4 n4Var = new n4(12, this, context);
            this.b = n4Var;
            tj0Var2.setAdapter(n4Var);
            this.c.setOnItemClickListener(new h(this, 19));
        } else if (i11 == 1 || i11 == 2 || i11 == 3) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, kVar, null);
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.G6, null);
                org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.u8, null);
                this.actionBar.setCastShadows(false);
                org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
                if (i11 == 1) {
                    org.telegram.ui.ActionBar.q0 a10 = q10.a(0, R.drawable.ic_ab_other);
                    this.R = a10;
                    y0Var = a10.e(1, R.drawable.msg_permissions, org.telegram.messenger.bd.M0(2131747661, null));
                } else {
                    y0Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new fi0(this, y0Var, z11 ? 1 : 0));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, b8.mf.c(-1.0f, -1));
            org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
            this.a = fh0Var;
            fh0Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            org.telegram.ui.Components.fh0 fh0Var2 = this.a;
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x < point.y) {
                    i3 = 0;
                    fh0Var2.setVisibility(i3);
                    linearLayout.addView(this.a, b8.mf.r(120, 120, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i13 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(textView, i13, null);
                    this.d.setTypeface(org.telegram.messenger.g0.o());
                    if (i11 == 1) {
                        this.d.setText(org.telegram.messenger.bd.M0(2131751113, null));
                    } else if (org.telegram.messenger.az.s.isEmpty()) {
                        this.d.setText(org.telegram.messenger.bd.M0(2131751709, null));
                    } else {
                        this.d.setText(org.telegram.messenger.bd.M0(2131751120, null));
                    }
                    this.d.setTextSize(1, 18.0f);
                    this.d.setGravity(1);
                    linearLayout.addView(this.d, b8.mf.t(-2, -2, 1, 0, 16, 0, 0));
                    org.telegram.ui.Components.vy0 vy0Var = new org.telegram.ui.Components.vy0(context);
                    this.e = vy0Var;
                    vy0Var.setFactory(new td0(context, i12));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, b8.mf.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Ci, null);
                    textView2.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                    textView2.setGravity((!r0() ? 3 : 1) | 16);
                    int i14 = 13;
                    textView2.setOnClickListener(new b40(context, i14));
                    textView2.setVisibility(i11 != 2 ? 0 : 8);
                    textView2.setText(org.telegram.messenger.bd.M0(2131750594, null));
                    frameLayout2.addView(textView2, b8.mf.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    k4.j.k(textView2);
                    TextView textView3 = new TextView(context);
                    this.r = textView3;
                    textView3.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(this.r, org.telegram.ui.ActionBar.k6.D6, null);
                    this.r.setText(org.telegram.messenger.bd.M0(2131747660, null));
                    this.r.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                    org.telegram.messenger.g0.Z3(this.r, false, 1.0f, true, false);
                    frameLayout2.addView(this.r, b8.mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, null);
                    this.f = gb0Var;
                    gb0Var.setText(org.telegram.messenger.bd.M0(2131751117, null));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    org.telegram.ui.ActionBar.r6.V(this.h, i13, null);
                    this.h.setBackground(null);
                    this.h.setMaxLines(1);
                    this.h.setLines(1);
                    int i15 = 5;
                    this.h.setGravity(!org.telegram.messenger.bd.a0 ? 5 : 3);
                    this.h.setSingleLine(true);
                    if (i11 != 1) {
                        this.F = 0;
                        this.h.setImeOptions(5);
                    } else {
                        this.F = 1;
                        this.h.setImeOptions(6);
                    }
                    this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.h.setTypeface(Typeface.DEFAULT);
                    org.telegram.ui.ActionBar.r6.w(this.h, org.telegram.ui.ActionBar.k6.l6, null);
                    this.h.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int L = org.telegram.messenger.g0.L(16.0f);
                    this.h.setPadding(L, L, L, L);
                    this.h.setOnFocusChangeListener(new ed(this, 10));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, b8.mf.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    org.telegram.ui.ActionBar.r6.t(this.s, org.telegram.ui.ActionBar.k6.H6, null, PorterDuff.Mode.SRC_ATOP);
                    ImageView imageView2 = this.s;
                    int i16 = org.telegram.ui.ActionBar.k6.i6;
                    org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i16), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i16), getResourceProvider());
                    org.telegram.messenger.g0.Z3(this.s, i11 != 1 && this.F == 0, 0.1f, true, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new ai.a0(i14, this, atomicBoolean));
                    this.s.setOnClickListener(new hb0(i15, this, atomicBoolean));
                    linearLayout2.addView(this.s, b8.mf.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, b8.mf.c(-2.0f, -1));
                    frameLayout3.addView(this.f, b8.mf.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new ea(this, 8));
                    this.h.addTextChangedListener(new gi0(this, 0));
                    this.h.setCustomSelectionActionModeCallback(new mi.b1(2));
                    ib0 ib0Var = new ib0(2, context, this);
                    this.n = ib0Var;
                    ib0Var.b(4, 10);
                    for (zq zqVar : this.n.f) {
                        zqVar.setShowSoftInputOnFocusCompat(!q0());
                        zqVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        zqVar.setTextSize(1, 24.0f);
                        zqVar.addTextChangedListener(new gi0(this, 1));
                        zqVar.setOnFocusChangeListener(new ci.y9(this, zqVar, 3));
                    }
                    frameLayout3.addView(this.n, b8.mf.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, b8.mf.t(-1, -2, 1, 0, 32, 0, 72));
                    if (i11 == 1) {
                        frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
                    }
                    org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
                    this.x = l00Var;
                    k4.j.k(l00Var);
                    frameLayout2.addView(this.x, b8.mf.d(56, 56.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.x.setOnClickListener(new b40(this, 14));
                    org.telegram.ui.Components.n11 n11Var = new org.telegram.ui.Components.n11(context);
                    n11Var.setTransformType(1);
                    n11Var.setProgress(0.0f);
                    n11Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
                    n11Var.setDrawBackground(false);
                    this.x.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
                    this.x.addView(n11Var, b8.mf.e(56, 56, 17));
                    org.telegram.ui.Components.l00 l00Var2 = this.x;
                    l00Var2.a(l00Var2);
                    z0();
                }
            }
            i3 = 8;
            fh0Var2.setVisibility(i3);
            linearLayout.addView(this.a, b8.mf.r(120, 120, 1));
            TextView textView4 = new TextView(context);
            this.d = textView4;
            int i132 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(textView4, i132, null);
            this.d.setTypeface(org.telegram.messenger.g0.o());
            if (i11 == 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, b8.mf.t(-2, -2, 1, 0, 16, 0, 0));
            org.telegram.ui.Components.vy0 vy0Var2 = new org.telegram.ui.Components.vy0(context);
            this.e = vy0Var2;
            vy0Var2.setFactory(new td0(context, i12));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, b8.mf.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView22 = new TextView(context);
            textView22.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.Ci, null);
            textView22.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
            textView22.setGravity((!r0() ? 3 : 1) | 16);
            int i142 = 13;
            textView22.setOnClickListener(new b40(context, i142));
            textView22.setVisibility(i11 != 2 ? 0 : 8);
            textView22.setText(org.telegram.messenger.bd.M0(2131750594, null));
            frameLayout2.addView(textView22, b8.mf.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            k4.j.k(textView22);
            TextView textView32 = new TextView(context);
            this.r = textView32;
            textView32.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(this.r, org.telegram.ui.ActionBar.k6.D6, null);
            this.r.setText(org.telegram.messenger.bd.M0(2131747660, null));
            this.r.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
            org.telegram.messenger.g0.Z3(this.r, false, 1.0f, true, false);
            frameLayout2.addView(this.r, b8.mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            org.telegram.ui.Components.gb0 gb0Var2 = new org.telegram.ui.Components.gb0(context, null);
            this.f = gb0Var2;
            gb0Var2.setText(org.telegram.messenger.bd.M0(2131751117, null));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.V(this.h, i132, null);
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            int i152 = 5;
            this.h.setGravity(!org.telegram.messenger.bd.a0 ? 5 : 3);
            this.h.setSingleLine(true);
            if (i11 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            org.telegram.ui.ActionBar.r6.w(this.h, org.telegram.ui.ActionBar.k6.l6, null);
            this.h.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.h.setCursorWidth(1.5f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            this.h.setPadding(L2, L2, L2, L2);
            this.h.setOnFocusChangeListener(new ed(this, 10));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, b8.mf.l(1.0f, 0, -2));
            ImageView imageView3 = new ImageView(context);
            this.s = imageView3;
            imageView3.setImageResource(R.drawable.msg_message);
            org.telegram.ui.ActionBar.r6.t(this.s, org.telegram.ui.ActionBar.k6.H6, null, PorterDuff.Mode.SRC_ATOP);
            ImageView imageView22 = this.s;
            int i162 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.R(imageView22, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i162), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i162), getResourceProvider());
            org.telegram.messenger.g0.Z3(this.s, i11 != 1 && this.F == 0, 0.1f, true, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new ai.a0(i142, this, atomicBoolean2));
            this.s.setOnClickListener(new hb0(i152, this, atomicBoolean2));
            linearLayout22.addView(this.s, b8.mf.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, b8.mf.c(-2.0f, -1));
            frameLayout3.addView(this.f, b8.mf.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new ea(this, 8));
            this.h.addTextChangedListener(new gi0(this, 0));
            this.h.setCustomSelectionActionModeCallback(new mi.b1(2));
            ib0 ib0Var2 = new ib0(2, context, this);
            this.n = ib0Var2;
            ib0Var2.b(4, 10);
            while (r11 < r6) {
            }
            frameLayout3.addView(this.n, b8.mf.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, b8.mf.t(-1, -2, 1, 0, 32, 0, 72));
            if (i11 == 1) {
            }
            org.telegram.ui.Components.l00 l00Var3 = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
            this.x = l00Var3;
            k4.j.k(l00Var3);
            frameLayout2.addView(this.x, b8.mf.d(56, 56.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.x.setOnClickListener(new b40(this, 14));
            org.telegram.ui.Components.n11 n11Var2 = new org.telegram.ui.Components.n11(context);
            n11Var2.setTransformType(1);
            n11Var2.setProgress(0.0f);
            n11Var2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
            n11Var2.setDrawBackground(false);
            this.x.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
            this.x.addView(n11Var2, b8.mf.e(56, 56, 17));
            org.telegram.ui.Components.l00 l00Var22 = this.x;
            l00Var22.a(l00Var22);
            z0();
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                A0();
                n4 n4Var = this.b;
                if (n4Var != null) {
                    n4Var.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        if (this.y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean hasForceLightStatusBar() {
        return this.y != 0;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return this.y == 0;
    }

    public final void o0(Runnable runnable) {
        if (!s0()) {
            runnable.run();
            return;
        }
        int i3 = 0;
        while (true) {
            ib0 ib0Var = this.n;
            zq[] zqVarArr = ib0Var.f;
            if (i3 >= zqVarArr.length) {
                ib0Var.postDelayed(new tb0(20, this, runnable), (zqVarArr.length * 75) + 350);
                return;
            } else {
                zq zqVar = zqVarArr[i3];
                zqVar.postDelayed(new di0(zqVar, 0), i3 * 75);
                i3++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        zq[] zqVarArr;
        int i3;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.fh0 fh0Var = this.a;
        if (fh0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x < point.y) {
                    i3 = 0;
                    fh0Var.setVisibility(i3);
                }
            }
            i3 = 8;
            fh0Var.setVisibility(i3);
        }
        ib0 ib0Var = this.n;
        if (ib0Var == null || (zqVarArr = ib0Var.f) == null) {
            return;
        }
        for (zq zqVar : zqVarArr) {
            zqVar.setShowSoftInputOnFocusCompat(!q0());
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.y != 0) {
            return true;
        }
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.n0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.n0);
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.b;
        if (n4Var != null) {
            n4Var.f();
        }
        if (this.y != 0 && !q0()) {
            org.telegram.messenger.g0.i3(new ai0(this, 6), 200L);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        if (q0()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.y == 0) {
            return;
        }
        y0();
    }

    public final boolean q0() {
        if (!s0() || this.y == 0 || org.telegram.messenger.g0.Q1()) {
            return false;
        }
        Point point = org.telegram.messenger.g0.q;
        return point.x < point.y && !org.telegram.messenger.g0.C1();
    }

    public final boolean r0() {
        int i3 = this.y;
        return (i3 == 1 && this.E == 1) || ((i3 == 2 || i3 == 3) && org.telegram.messenger.az.r == 1);
    }

    public final boolean s0() {
        int i3 = this.y;
        return (i3 == 1 && this.E == 0) || ((i3 == 2 || i3 == 3) && org.telegram.messenger.az.r == 0);
    }

    public final void t0() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (s0()) {
            for (zq zqVar : this.n.f) {
                zqVar.z(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        org.telegram.messenger.g0.G3(s0() ? 10.0f : 4.0f, s0() ? this.n : this.f, new ai0(this, 3));
    }

    public final void u0() {
        if (r0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        String code = s0() ? this.n.getCode() : this.h.getText().toString();
        int i3 = this.y;
        int i10 = 0;
        if (i3 == 1) {
            if (!this.G.equals(code)) {
                org.telegram.messenger.g0.X3(this.r, true);
                for (zq zqVar : this.n.f) {
                    zqVar.setText("");
                }
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.n.removeCallbacks(this.T);
                this.n.post(new ai0(this, 0));
                return;
            }
            boolean isEmpty = org.telegram.messenger.az.s.isEmpty();
            try {
                org.telegram.messenger.az.w = new byte[16];
                Utilities.b.nextBytes(org.telegram.messenger.az.w);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.az.w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.az.w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.az.s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.az.A = true;
            org.telegram.messenger.az.r = this.E;
            org.telegram.messenger.az.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            for (zq zqVar2 : this.n.f) {
                zqVar2.clearFocus();
                org.telegram.messenger.g0.v1(zqVar2);
            }
            this.w.setEditText(null);
            o0(new bi0(this, isEmpty, i10));
            return;
        }
        if (i3 == 2 || i3 == 3) {
            long j10 = org.telegram.messenger.az.t;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.bd.a0("TooManyTries", null, 2131744046, org.telegram.messenger.bd.G(Math.max(1, (int) Math.ceil(j10 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (zq zqVar3 : this.n.f) {
                    zqVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
                return;
            }
            if (!org.telegram.messenger.az.g(code)) {
                org.telegram.messenger.az.r();
                this.h.setText("");
                for (zq zqVar4 : this.n.f) {
                    zqVar4.setText("");
                }
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
                return;
            }
            org.telegram.messenger.az.v = 0;
            org.telegram.messenger.az.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            zq[] zqVarArr = this.n.f;
            int length2 = zqVarArr.length;
            while (i10 < length2) {
                zq zqVar5 = zqVarArr[i10];
                zqVar5.clearFocus();
                org.telegram.messenger.g0.v1(zqVar5);
                i10++;
            }
            this.w.setEditText(null);
            if (i3 == 3) {
                o0(new ai0(this, 1));
            } else {
                o0(new ai0(this, 2));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return this.y == 0;
    }

    public final void v0() {
        if ((this.E == 1 && this.h.getText().length() == 0) || (this.E == 0 && this.n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.R;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.bd.M0(2131751815, null));
        this.e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747664, null)));
        this.G = s0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (zq zqVar : this.n.f) {
            zqVar.setText("");
        }
        y0();
        this.F = 1;
    }

    public final void w0(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
        if (!z11) {
            this.w.setVisibility(z10 ? 0 : 8);
            this.w.setAlpha(z10 ? 1.0f : 0.0f);
            this.w.setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(230.0f));
            this.fragmentView.requestLayout();
            return;
        }
        int i3 = 2;
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z10 ? org.telegram.ui.Components.xq.f : org.telegram.ui.Components.ks.e);
        duration.addUpdateListener(new b3(this, 17));
        duration.addListener(new u40(i3, this, z10));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.V = (i90) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.n.f[0].requestFocus();
            if (q0()) {
                return;
            }
            org.telegram.messenger.g0.K3(this.n.f[0]);
            return;
        }
        if (r0()) {
            this.h.requestFocus();
            org.telegram.messenger.g0.K3(this.h);
        }
    }

    public final void z0() {
        String charSequence;
        int i3 = this.y;
        if (i3 == 2) {
            charSequence = org.telegram.messenger.bd.M0(2131751112, null);
        } else if (i3 == 3) {
            charSequence = org.telegram.messenger.bd.M0(2131743203, null);
        } else if (this.F == 0) {
            charSequence = org.telegram.messenger.bd.M0(this.E == 0 ? 2131751708 : 2131751707, null);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        int i10 = 1;
        boolean z10 = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (i3 == 2) {
            this.e.a(org.telegram.messenger.bd.M0(2131751112, null), z10, false);
        } else if (i3 == 3) {
            this.e.setText(org.telegram.messenger.bd.M0(2131743203, null));
        } else if (this.F == 0) {
            this.e.a(org.telegram.messenger.bd.M0(this.E == 0 ? 2131751708 : 2131751707, null), z10, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.Z3(this.n, true, 1.0f, true, z10);
            org.telegram.messenger.g0.Z3(this.f, false, 1.0f, true, z10);
        } else if (r0()) {
            org.telegram.messenger.g0.Z3(this.n, false, 1.0f, true, z10);
            org.telegram.messenger.g0.Z3(this.f, true, 1.0f, true, z10);
        }
        if (r0()) {
            bi0 bi0Var = new bi0(this, z10, i10);
            this.U = bi0Var;
            org.telegram.messenger.g0.i3(bi0Var, 3000L);
        } else {
            this.x.e(false, z10);
        }
        w0(q0(), z10);
        y0();
    }
}
