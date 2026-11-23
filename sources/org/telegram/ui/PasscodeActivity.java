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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
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
    public final ii0 T;
    public ji0 U;
    public l90 V;
    public mz0 W;
    public org.telegram.ui.Components.rh0 a;
    private int autoLockRow;
    public l4 b;
    public org.telegram.ui.Components.ek0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.hz0 e;
    public org.telegram.ui.Components.yb0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public mb0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.rr w;
    public org.telegram.ui.Components.c10 x;
    public final int y;

    public PasscodeActivity(int i7) {
        super(null);
        this.E = 0;
        this.F = 0;
        this.T = new ii0(this, 5);
        this.y = i7;
    }

    public static /* synthetic */ void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.tb0 tb0Var, int i7) {
        int value = tb0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.cz.y = 0;
        } else if (value == 1) {
            org.telegram.messenger.cz.y = 60;
        } else if (value == 2) {
            org.telegram.messenger.cz.y = org.telegram.messenger.ls.X4;
        } else if (value == 3) {
            org.telegram.messenger.cz.y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.cz.y = 18000;
        }
        passcodeActivity.b.g(i7);
        org.telegram.messenger.k10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i7) {
        if (view.isEnabled()) {
            if (i7 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String N0 = org.telegram.messenger.hd.N0(2131751421, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131751420, null);
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751419, null), new zr(passcodeActivity, 29));
                t1Var.show();
                org.telegram.ui.ActionBar.t6.U((TextView) t1Var.d(-1), org.telegram.ui.ActionBar.m6.q7, null);
                return;
            }
            if (i7 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
                return;
            }
            int i10 = 0;
            if (i7 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String N02 = org.telegram.messenger.hd.N0(2131753797, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = N02;
                org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(passcodeActivity.getParentActivity(), null);
                tb0Var.setMinValue(0);
                tb0Var.setMaxValue(4);
                int i11 = org.telegram.messenger.cz.y;
                if (i11 == 0) {
                    tb0Var.setValue(0);
                } else if (i11 == 60) {
                    tb0Var.setValue(1);
                } else if (i11 == 300) {
                    tb0Var.setValue(2);
                } else if (i11 == 3600) {
                    tb0Var.setValue(3);
                } else if (i11 == 18000) {
                    tb0Var.setValue(4);
                }
                tb0Var.setFormatter(new m60(5));
                alertDialog$Builder2.o(tb0Var);
                alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131751342, null), new ai.u1(passcodeActivity, tb0Var, i7, 14));
                passcodeActivity.showDialog(t1Var2);
                return;
            }
            if (i7 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.cz.D = !org.telegram.messenger.cz.D;
                org.telegram.messenger.k10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.D);
                return;
            }
            if (i7 == passcodeActivity.O) {
                org.telegram.messenger.cz.A = !org.telegram.messenger.cz.A;
                org.telegram.messenger.k10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.A);
                org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.n0, Boolean.FALSE);
                if (org.telegram.messenger.cz.A) {
                    return;
                }
                org.telegram.ui.Components.c5.r0(passcodeActivity, null, org.telegram.messenger.hd.N0(2131745648, null), null);
                return;
            }
            if (i7 == passcodeActivity.K) {
                org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(passcodeActivity.currentAccount);
                boolean z10 = !D.S();
                if (D.m != z10) {
                    D.m = z10;
                    try {
                        org.telegram.ui.Wallet.u0.C().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", D.m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.u0.o("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.k10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(D.S());
                return;
            }
            if (i7 == passcodeActivity.L) {
                org.telegram.ui.Wallet.u0 D2 = org.telegram.ui.Wallet.u0.D(passcodeActivity.currentAccount);
                boolean R = D2.R();
                boolean z11 = !R;
                ai.x2 x2Var = new ai.x2(8, view, R);
                org.telegram.ui.Wallet.z0 z0Var = D2.c;
                if (z0Var == null) {
                    x2Var.a(Boolean.FALSE);
                } else {
                    org.telegram.ui.Wallet.z0.i.execute(new ai.o2(z0Var, z0Var.l(), z11, new org.telegram.ui.Wallet.k(x2Var, i10), 4));
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.g2 p0() {
        return !org.telegram.messenger.cz.s.isEmpty() ? new PasscodeActivity(2) : new g(6);
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
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.b, 0)).c(15) == 0) {
                Typeface typeface = org.telegram.messenger.g0.a;
                if (((KeyguardManager) org.telegram.messenger.t0.b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i7 = this.Q;
                    this.Q = i7 + 1;
                    this.fingerprintRow = i7;
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        int i10 = this.Q;
        this.autoLockRow = i10;
        this.Q = i10 + 2;
        this.I = i10 + 1;
        if (((org.telegram.messenger.h0) getMessagesController().A7.p0.b).c) {
            int i11 = this.Q;
            this.J = i11;
            this.Q = i11 + 2;
            this.K = i11 + 1;
            if (org.telegram.ui.Wallet.z0.i(org.telegram.messenger.t0.b)) {
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03df A[LOOP:0: B:54:0x03dd->B:55:0x03df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i7;
        org.telegram.ui.ActionBar.y0 y0Var;
        dv dvVar = new dv(this, 23);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        if (z4Var != null) {
            z4Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(dvVar);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setAllowOverlayTitle(false);
            this.actionBar.setActionBarMenuOnItemClick(dvVar);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = this.y;
        int i12 = 1;
        if (i11 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, c8.ma.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        li0 li0Var = new li0(this, context, frameLayout, i10);
        li0Var.setDelegate(new za0(i12, this));
        this.fragmentView = li0Var;
        li0Var.addView(frameLayout, c8.ma.l(1.0f, -1, 0));
        org.telegram.ui.Components.rr rrVar = new org.telegram.ui.Components.rr(context);
        this.w = rrVar;
        rrVar.setVisibility(q0() ? 0 : 8);
        li0Var.addView(this.w, c8.ma.o(-1, org.telegram.messenger.ls.G3));
        if (i11 != 0) {
            int i13 = 2;
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, kVar, null);
                    this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                    org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, org.telegram.ui.ActionBar.m6.G6, null);
                    org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.u8, null);
                    this.actionBar.setCastShadows(false);
                    org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
                    if (i11 == 1) {
                        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, R.drawable.ic_ab_other);
                        this.R = a10;
                        y0Var = a10.e(1, R.drawable.msg_permissions, org.telegram.messenger.hd.N0(2131747459, null));
                    } else {
                        y0Var = null;
                    }
                    this.actionBar.setActionBarMenuOnItemClick(new mi0(this, y0Var, z12 ? 1 : 0));
                }
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, c8.ma.c(-1.0f, -1));
                org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
                this.a = rh0Var;
                rh0Var.setFocusable(false);
                this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
                this.a.setAutoRepeat(false);
                this.a.d();
                org.telegram.ui.Components.rh0 rh0Var2 = this.a;
                if (!org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x < point.y) {
                        i7 = 0;
                        rh0Var2.setVisibility(i7);
                        linearLayout.addView(this.a, c8.ma.r(120, 120, 1));
                        TextView textView = new TextView(context);
                        this.d = textView;
                        int i14 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(textView, i14, null);
                        this.d.setTypeface(org.telegram.messenger.g0.o());
                        if (i11 == 1) {
                            this.d.setText(org.telegram.messenger.hd.N0(2131751100, null));
                        } else if (org.telegram.messenger.cz.s.isEmpty()) {
                            this.d.setText(org.telegram.messenger.hd.N0(2131751696, null));
                        } else {
                            this.d.setText(org.telegram.messenger.hd.N0(2131751107, null));
                        }
                        this.d.setTextSize(1, 18.0f);
                        this.d.setGravity(1);
                        linearLayout.addView(this.d, c8.ma.t(-2, -2, 1, 0, 16, 0, 0));
                        org.telegram.ui.Components.hz0 hz0Var = new org.telegram.ui.Components.hz0(context);
                        this.e = hz0Var;
                        hz0Var.setFactory(new zd0(context, i12));
                        this.e.setInAnimation(context, R.anim.alpha_in);
                        this.e.setOutAnimation(context, R.anim.alpha_out);
                        linearLayout.addView(this.e, c8.ma.t(-2, -2, 1, 20, 8, 20, 0));
                        TextView textView2 = new TextView(context);
                        textView2.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Fi, null);
                        textView2.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                        textView2.setGravity((!r0() ? 3 : 1) | 16);
                        int i15 = 13;
                        textView2.setOnClickListener(new j40(context, i15));
                        textView2.setVisibility(i11 != 2 ? 0 : 8);
                        textView2.setText(org.telegram.messenger.hd.N0(2131750576, null));
                        frameLayout2.addView(textView2, c8.ma.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                        h6.m.i(textView2);
                        TextView textView3 = new TextView(context);
                        this.r = textView3;
                        textView3.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.t6.U(this.r, org.telegram.ui.ActionBar.m6.D6, null);
                        this.r.setText(org.telegram.messenger.hd.N0(2131747458, null));
                        this.r.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.messenger.g0.X3(this.r, false, 1.0f, true, false);
                        frameLayout2.addView(this.r, c8.ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                        org.telegram.ui.Components.yb0 yb0Var = new org.telegram.ui.Components.yb0(context, null);
                        this.f = yb0Var;
                        yb0Var.setText(org.telegram.messenger.hd.N0(2131751104, null));
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                        this.h = editTextBoldCursor;
                        editTextBoldCursor.setInputType(524417);
                        this.h.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.t6.U(this.h, i14, null);
                        this.h.setBackground(null);
                        this.h.setMaxLines(1);
                        this.h.setLines(1);
                        this.h.setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
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
                        org.telegram.ui.ActionBar.t6.v(this.h, org.telegram.ui.ActionBar.m6.l6, null);
                        this.h.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.h.setCursorWidth(1.5f);
                        int L = org.telegram.messenger.g0.L(16.0f);
                        this.h.setPadding(L, L, L, L);
                        this.h.setOnFocusChangeListener(new ed(this, 10));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        linearLayout2.addView(this.h, c8.ma.l(1.0f, 0, -2));
                        ImageView imageView = new ImageView(context);
                        this.s = imageView;
                        imageView.setImageResource(R.drawable.msg_message);
                        org.telegram.ui.ActionBar.t6.s(this.s, org.telegram.ui.ActionBar.m6.H6, null, PorterDuff.Mode.SRC_ATOP);
                        ImageView imageView2 = this.s;
                        int i16 = org.telegram.ui.ActionBar.m6.i6;
                        org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i16), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i16), getResourceProvider());
                        org.telegram.messenger.g0.X3(this.s, i11 != 1 && this.F == 0, 0.1f, true, false);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        this.h.addTextChangedListener(new bi.v(i15, this, atomicBoolean));
                        this.s.setOnClickListener(new jg0(i12, this, atomicBoolean));
                        linearLayout2.addView(this.s, c8.ma.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                        this.f.addView(linearLayout2, c8.ma.c(-2.0f, -1));
                        frameLayout3.addView(this.f, c8.ma.t(-1, -2, 1, 32, 0, 32, 0));
                        this.h.setOnEditorActionListener(new fa(this, 8));
                        this.h.addTextChangedListener(new ni0(this, z11 ? 1 : 0));
                        this.h.setCustomSelectionActionModeCallback(new oi.z0(2));
                        mb0 mb0Var = new mb0(i13, context, this);
                        this.n = mb0Var;
                        mb0Var.b(4, 10);
                        for (er erVar : this.n.f) {
                            erVar.setShowSoftInputOnFocusCompat(!q0());
                            erVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            erVar.setTextSize(1, 24.0f);
                            erVar.addTextChangedListener(new ni0(this, i12));
                            erVar.setOnFocusChangeListener(new di.r9(this, erVar, 3));
                        }
                        frameLayout3.addView(this.n, c8.ma.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                        linearLayout.addView(frameLayout3, c8.ma.t(-1, -2, 1, 0, 32, 0, 72));
                        if (i11 == 1) {
                            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
                        }
                        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
                        this.x = c10Var;
                        h6.m.i(c10Var);
                        frameLayout2.addView(this.x, c8.ma.d(56, 56.0f, (!org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                        this.x.setOnClickListener(new j40(this, 14));
                        org.telegram.ui.Components.k21 k21Var = new org.telegram.ui.Components.k21(context);
                        k21Var.setTransformType(1);
                        k21Var.setProgress(0.0f);
                        k21Var.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.O9, false));
                        k21Var.setDrawBackground(false);
                        this.x.setContentDescription(org.telegram.messenger.hd.N0(2131748057, null));
                        this.x.addView(k21Var, c8.ma.e(56, 56, 17));
                        org.telegram.ui.Components.c10 c10Var2 = this.x;
                        c10Var2.a(c10Var2);
                        z0();
                    }
                }
                i7 = 8;
                rh0Var2.setVisibility(i7);
                linearLayout.addView(this.a, c8.ma.r(120, 120, 1));
                TextView textView4 = new TextView(context);
                this.d = textView4;
                int i142 = org.telegram.ui.ActionBar.m6.G6;
                org.telegram.ui.ActionBar.t6.U(textView4, i142, null);
                this.d.setTypeface(org.telegram.messenger.g0.o());
                if (i11 == 1) {
                }
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                linearLayout.addView(this.d, c8.ma.t(-2, -2, 1, 0, 16, 0, 0));
                org.telegram.ui.Components.hz0 hz0Var2 = new org.telegram.ui.Components.hz0(context);
                this.e = hz0Var2;
                hz0Var2.setFactory(new zd0(context, i12));
                this.e.setInAnimation(context, R.anim.alpha_in);
                this.e.setOutAnimation(context, R.anim.alpha_out);
                linearLayout.addView(this.e, c8.ma.t(-2, -2, 1, 20, 8, 20, 0));
                TextView textView22 = new TextView(context);
                textView22.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView22, org.telegram.ui.ActionBar.m6.Fi, null);
                textView22.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                textView22.setGravity((!r0() ? 3 : 1) | 16);
                int i152 = 13;
                textView22.setOnClickListener(new j40(context, i152));
                textView22.setVisibility(i11 != 2 ? 0 : 8);
                textView22.setText(org.telegram.messenger.hd.N0(2131750576, null));
                frameLayout2.addView(textView22, c8.ma.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                h6.m.i(textView22);
                TextView textView32 = new TextView(context);
                this.r = textView32;
                textView32.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(this.r, org.telegram.ui.ActionBar.m6.D6, null);
                this.r.setText(org.telegram.messenger.hd.N0(2131747458, null));
                this.r.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                org.telegram.messenger.g0.X3(this.r, false, 1.0f, true, false);
                frameLayout2.addView(this.r, c8.ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                org.telegram.ui.Components.yb0 yb0Var2 = new org.telegram.ui.Components.yb0(context, null);
                this.f = yb0Var2;
                yb0Var2.setText(org.telegram.messenger.hd.N0(2131751104, null));
                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
                this.h = editTextBoldCursor2;
                editTextBoldCursor2.setInputType(524417);
                this.h.setTextSize(1, 18.0f);
                org.telegram.ui.ActionBar.t6.U(this.h, i142, null);
                this.h.setBackground(null);
                this.h.setMaxLines(1);
                this.h.setLines(1);
                this.h.setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
                this.h.setSingleLine(true);
                if (i11 != 1) {
                }
                this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.h.setTypeface(Typeface.DEFAULT);
                org.telegram.ui.ActionBar.t6.v(this.h, org.telegram.ui.ActionBar.m6.l6, null);
                this.h.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.h.setCursorWidth(1.5f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                this.h.setPadding(L2, L2, L2, L2);
                this.h.setOnFocusChangeListener(new ed(this, 10));
                LinearLayout linearLayout22 = new LinearLayout(context);
                linearLayout22.setOrientation(0);
                linearLayout22.setGravity(16);
                linearLayout22.addView(this.h, c8.ma.l(1.0f, 0, -2));
                ImageView imageView3 = new ImageView(context);
                this.s = imageView3;
                imageView3.setImageResource(R.drawable.msg_message);
                org.telegram.ui.ActionBar.t6.s(this.s, org.telegram.ui.ActionBar.m6.H6, null, PorterDuff.Mode.SRC_ATOP);
                ImageView imageView22 = this.s;
                int i162 = org.telegram.ui.ActionBar.m6.i6;
                org.telegram.ui.ActionBar.t6.Q(imageView22, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i162), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i162), getResourceProvider());
                org.telegram.messenger.g0.X3(this.s, i11 != 1 && this.F == 0, 0.1f, true, false);
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                this.h.addTextChangedListener(new bi.v(i152, this, atomicBoolean2));
                this.s.setOnClickListener(new jg0(i12, this, atomicBoolean2));
                linearLayout22.addView(this.s, c8.ma.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                this.f.addView(linearLayout22, c8.ma.c(-2.0f, -1));
                frameLayout3.addView(this.f, c8.ma.t(-1, -2, 1, 32, 0, 32, 0));
                this.h.setOnEditorActionListener(new fa(this, 8));
                this.h.addTextChangedListener(new ni0(this, z11 ? 1 : 0));
                this.h.setCustomSelectionActionModeCallback(new oi.z0(2));
                mb0 mb0Var2 = new mb0(i13, context, this);
                this.n = mb0Var2;
                mb0Var2.b(4, 10);
                while (r10 < r6) {
                }
                frameLayout3.addView(this.n, c8.ma.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                linearLayout.addView(frameLayout3, c8.ma.t(-1, -2, 1, 0, 32, 0, 72));
                if (i11 == 1) {
                }
                org.telegram.ui.Components.c10 c10Var3 = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
                this.x = c10Var3;
                h6.m.i(c10Var3);
                frameLayout2.addView(this.x, c8.ma.d(56, 56.0f, (!org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                this.x.setOnClickListener(new j40(this, 14));
                org.telegram.ui.Components.k21 k21Var2 = new org.telegram.ui.Components.k21(context);
                k21Var2.setTransformType(1);
                k21Var2.setProgress(0.0f);
                k21Var2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.O9, false));
                k21Var2.setDrawBackground(false);
                this.x.setContentDescription(org.telegram.messenger.hd.N0(2131748057, null));
                this.x.addView(k21Var2, c8.ma.e(56, 56, 17));
                org.telegram.ui.Components.c10 c10Var22 = this.x;
                c10Var22.a(c10Var22);
                z0();
            }
        } else {
            setHasOwnBackground(true);
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131747463, null));
            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.a7));
            org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
            this.c = ek0Var;
            ek0Var.r1();
            this.c.setSectionsDrawBackground(true);
            this.c.setLayoutManager(new jg.b0(i12, z10 ? 1 : 0, 14));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, c8.ma.c(-1.0f, -1));
            org.telegram.ui.Components.ek0 ek0Var2 = this.c;
            l4 l4Var = new l4(12, this, context);
            this.b = l4Var;
            ek0Var2.setAdapter(l4Var);
            this.c.setOnItemClickListener(new h(this, 19));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                A0();
                l4 l4Var = this.b;
                if (l4Var != null) {
                    l4Var.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.a7));
        if (this.y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean hasForceLightStatusBar() {
        return this.y != 0;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return this.y == 0;
    }

    public final void o0(Runnable runnable) {
        if (!s0()) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            mb0 mb0Var = this.n;
            er[] erVarArr = mb0Var.f;
            if (i7 >= erVarArr.length) {
                mb0Var.postDelayed(new fe0(9, this, runnable), (erVarArr.length * 75) + 350);
                return;
            } else {
                er erVar = erVarArr[i7];
                erVar.postDelayed(new ki0(erVar, 0), i7 * 75);
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onConfigurationChanged(Configuration configuration) {
        er[] erVarArr;
        int i7;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.rh0 rh0Var = this.a;
        if (rh0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x < point.y) {
                    i7 = 0;
                    rh0Var.setVisibility(i7);
                }
            }
            i7 = 8;
            rh0Var.setVisibility(i7);
        }
        mb0 mb0Var = this.n;
        if (mb0Var == null || (erVarArr = mb0Var.f) == null) {
            return;
        }
        for (er erVar : erVarArr) {
            erVar.setShowSoftInputOnFocusCompat(!q0());
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.y != 0) {
            return true;
        }
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.n0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.n0);
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.b;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.y != 0 && !q0()) {
            org.telegram.messenger.g0.h3(new ii0(this, 6), 200L);
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        if (q0()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.m6.l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
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
        int i7 = this.y;
        return (i7 == 1 && this.E == 1) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.cz.r == 1);
    }

    public final boolean s0() {
        int i7 = this.y;
        return (i7 == 1 && this.E == 0) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.cz.r == 0);
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
            for (er erVar : this.n.f) {
                erVar.A(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        org.telegram.messenger.g0.E3(s0() ? 10.0f : 4.0f, s0() ? this.n : this.f, new ii0(this, 3));
    }

    public final void u0() {
        if (r0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        String code = s0() ? this.n.getCode() : this.h.getText().toString();
        int i7 = this.y;
        int i10 = 1;
        int i11 = 0;
        if (i7 == 1) {
            if (!this.G.equals(code)) {
                org.telegram.messenger.g0.V3(this.r, true);
                for (er erVar : this.n.f) {
                    erVar.setText("");
                }
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.n.removeCallbacks(this.T);
                this.n.post(new ii0(this, i11));
                return;
            }
            boolean isEmpty = org.telegram.messenger.cz.s.isEmpty();
            try {
                org.telegram.messenger.cz.w = new byte[16];
                Utilities.b.nextBytes(org.telegram.messenger.cz.w);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.cz.w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.cz.w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.cz.s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.cz.A = true;
            org.telegram.messenger.cz.r = this.E;
            org.telegram.messenger.cz.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            for (er erVar2 : this.n.f) {
                erVar2.clearFocus();
                org.telegram.messenger.g0.v1(erVar2);
            }
            this.w.setEditText(null);
            o0(new ji0(this, isEmpty, i11));
            return;
        }
        int i12 = 2;
        if (i7 == 2 || i7 == 3) {
            long j3 = org.telegram.messenger.cz.t;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.hd.a0("TooManyTries", null, 2131743793, org.telegram.messenger.hd.G(Math.max(1, (int) Math.ceil(j3 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (er erVar3 : this.n.f) {
                    erVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
                return;
            }
            if (!org.telegram.messenger.cz.g(code)) {
                org.telegram.messenger.cz.r();
                this.h.setText("");
                for (er erVar4 : this.n.f) {
                    erVar4.setText("");
                }
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
                return;
            }
            org.telegram.messenger.cz.v = 0;
            org.telegram.messenger.cz.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            er[] erVarArr = this.n.f;
            int length2 = erVarArr.length;
            while (i11 < length2) {
                er erVar5 = erVarArr[i11];
                erVar5.clearFocus();
                org.telegram.messenger.g0.v1(erVar5);
                i11++;
            }
            this.w.setEditText(null);
            if (i7 == 3) {
                o0(new ii0(this, i10));
            } else {
                o0(new ii0(this, i12));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
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
        this.d.setText(org.telegram.messenger.hd.N0(2131751803, null));
        this.e.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131747462, null)));
        this.G = s0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (er erVar : this.n.f) {
            erVar.setText("");
        }
        y0();
        this.F = 1;
    }

    public final void w0(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
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
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z10 ? org.telegram.ui.Components.nr.f : org.telegram.ui.Components.zs.e);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new c30(3, this, z10));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.V = (l90) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.n.f[0].requestFocus();
            if (q0()) {
                return;
            }
            org.telegram.messenger.g0.I3(this.n.f[0]);
            return;
        }
        if (r0()) {
            this.h.requestFocus();
            org.telegram.messenger.g0.I3(this.h);
        }
    }

    public final void z0() {
        String charSequence;
        int i7 = this.y;
        if (i7 == 2) {
            charSequence = org.telegram.messenger.hd.N0(2131751099, null);
        } else if (i7 == 3) {
            charSequence = org.telegram.messenger.hd.N0(2131742947, null);
        } else if (this.F == 0) {
            charSequence = org.telegram.messenger.hd.N0(this.E == 0 ? 2131751695 : 2131751694, null);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        int i10 = 1;
        boolean z10 = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (i7 == 2) {
            this.e.a(org.telegram.messenger.hd.N0(2131751099, null), z10, false);
        } else if (i7 == 3) {
            this.e.setText(org.telegram.messenger.hd.N0(2131742947, null));
        } else if (this.F == 0) {
            this.e.a(org.telegram.messenger.hd.N0(this.E == 0 ? 2131751695 : 2131751694, null), z10, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.X3(this.n, true, 1.0f, true, z10);
            org.telegram.messenger.g0.X3(this.f, false, 1.0f, true, z10);
        } else if (r0()) {
            org.telegram.messenger.g0.X3(this.n, false, 1.0f, true, z10);
            org.telegram.messenger.g0.X3(this.f, true, 1.0f, true, z10);
        }
        if (r0()) {
            ji0 ji0Var = new ji0(this, z10, i10);
            this.U = ji0Var;
            org.telegram.messenger.g0.h3(ji0Var, 3000L);
        } else {
            this.x.e(false, z10);
        }
        w0(q0(), z10);
        y0();
    }
}
