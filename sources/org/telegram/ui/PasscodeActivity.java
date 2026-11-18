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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
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
    public org.telegram.ui.ActionBar.r0 R;
    public boolean S;
    public final ii0 T;
    public ji0 U;
    public l90 V;
    public b31 W;
    public org.telegram.ui.Components.ph0 a;
    private int autoLockRow;
    public l4 b;
    public org.telegram.ui.Components.ck0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.fz0 e;
    public org.telegram.ui.Components.xb0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public mb0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.pr w;
    public org.telegram.ui.Components.a10 x;
    public final int y;

    public PasscodeActivity(int i7) {
        super(null);
        this.E = 0;
        this.F = 0;
        this.T = new ii0(this, 5);
        this.y = i7;
    }

    public static /* synthetic */ void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.sb0 sb0Var, int i7) {
        int value = sb0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.bz.y = 0;
        } else if (value == 1) {
            org.telegram.messenger.bz.y = 60;
        } else if (value == 2) {
            org.telegram.messenger.bz.y = org.telegram.messenger.ks.X4;
        } else if (value == 3) {
            org.telegram.messenger.bz.y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.bz.y = 18000;
        }
        passcodeActivity.b.g(i7);
        org.telegram.messenger.j10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i7) {
        if (view.isEnabled()) {
            if (i7 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131751422, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131751421, null);
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751420, null), new zr(passcodeActivity, 29));
                u1Var.show();
                org.telegram.ui.ActionBar.u6.U((TextView) u1Var.d(-1), org.telegram.ui.ActionBar.n6.q7, null);
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
                String M02 = org.telegram.messenger.gd.M0(2131753798, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.S = M02;
                org.telegram.ui.Components.sb0 sb0Var = new org.telegram.ui.Components.sb0(passcodeActivity.getParentActivity(), null);
                sb0Var.setMinValue(0);
                sb0Var.setMaxValue(4);
                int i11 = org.telegram.messenger.bz.y;
                if (i11 == 0) {
                    sb0Var.setValue(0);
                } else if (i11 == 60) {
                    sb0Var.setValue(1);
                } else if (i11 == 300) {
                    sb0Var.setValue(2);
                } else if (i11 == 3600) {
                    sb0Var.setValue(3);
                } else if (i11 == 18000) {
                    sb0Var.setValue(4);
                }
                sb0Var.setFormatter(new l60(5));
                alertDialog$Builder2.o(sb0Var);
                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131751343, null), new ai.r1(passcodeActivity, sb0Var, i7, 14));
                passcodeActivity.showDialog(u1Var2);
                return;
            }
            if (i7 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.bz.D = !org.telegram.messenger.bz.D;
                org.telegram.messenger.j10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.bz.D);
                return;
            }
            if (i7 == passcodeActivity.O) {
                org.telegram.messenger.bz.A = !org.telegram.messenger.bz.A;
                org.telegram.messenger.j10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.bz.A);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.n0, Boolean.FALSE);
                if (org.telegram.messenger.bz.A) {
                    return;
                }
                org.telegram.ui.Components.b5.r0(passcodeActivity, null, org.telegram.messenger.gd.M0(2131745649, null), null);
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
                org.telegram.messenger.j10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(D.S());
                return;
            }
            if (i7 == passcodeActivity.L) {
                org.telegram.ui.Wallet.u0 D2 = org.telegram.ui.Wallet.u0.D(passcodeActivity.currentAccount);
                boolean R = D2.R();
                boolean z11 = !R;
                ai.u2 u2Var = new ai.u2(8, view, R);
                org.telegram.ui.Wallet.z0 z0Var = D2.c;
                if (z0Var == null) {
                    u2Var.a(Boolean.FALSE);
                } else {
                    org.telegram.ui.Wallet.z0.i.execute(new ai.l2(z0Var, z0Var.l(), z11, new org.telegram.ui.Wallet.k(u2Var, i10), 4));
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.h2 p0() {
        return !org.telegram.messenger.bz.s.isEmpty() ? new PasscodeActivity(2) : new g(6);
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

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e0 A[LOOP:0: B:54:0x03de->B:55:0x03e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    @Override // org.telegram.ui.ActionBar.h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i7;
        org.telegram.ui.ActionBar.z0 z0Var;
        dv dvVar = new dv(this, 23);
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        if (a5Var != null) {
            a5Var.setBackButtonImage(R.drawable.ic_ab_back);
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
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(context);
        this.w = prVar;
        prVar.setVisibility(q0() ? 0 : 8);
        li0Var.addView(this.w, c8.ma.o(-1, org.telegram.messenger.ks.G3));
        if (i11 != 0) {
            int i13 = 2;
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, kVar, null);
                    this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                    org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, org.telegram.ui.ActionBar.n6.G6, null);
                    org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.u8, null);
                    this.actionBar.setCastShadows(false);
                    org.telegram.ui.ActionBar.z t6 = this.actionBar.t();
                    if (i11 == 1) {
                        org.telegram.ui.ActionBar.r0 a10 = t6.a(0, R.drawable.ic_ab_other);
                        this.R = a10;
                        z0Var = a10.e(1, R.drawable.msg_permissions, org.telegram.messenger.gd.M0(2131747460, null));
                    } else {
                        z0Var = null;
                    }
                    this.actionBar.setActionBarMenuOnItemClick(new mi0(this, z0Var, z12 ? 1 : 0));
                }
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, c8.ma.c(-1.0f, -1));
                org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(context);
                this.a = ph0Var;
                ph0Var.setFocusable(false);
                this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
                this.a.setAutoRepeat(false);
                this.a.d();
                org.telegram.ui.Components.ph0 ph0Var2 = this.a;
                if (!org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x < point.y) {
                        i7 = 0;
                        ph0Var2.setVisibility(i7);
                        linearLayout.addView(this.a, c8.ma.r(120, 120, 1));
                        TextView textView = new TextView(context);
                        this.d = textView;
                        int i14 = org.telegram.ui.ActionBar.n6.G6;
                        org.telegram.ui.ActionBar.u6.U(textView, i14, null);
                        this.d.setTypeface(org.telegram.messenger.g0.o());
                        if (i11 == 1) {
                            this.d.setText(org.telegram.messenger.gd.M0(2131751101, null));
                        } else if (org.telegram.messenger.bz.s.isEmpty()) {
                            this.d.setText(org.telegram.messenger.gd.M0(2131751697, null));
                        } else {
                            this.d.setText(org.telegram.messenger.gd.M0(2131751108, null));
                        }
                        this.d.setTextSize(1, 18.0f);
                        this.d.setGravity(1);
                        linearLayout.addView(this.d, c8.ma.t(-2, -2, 1, 0, 16, 0, 0));
                        org.telegram.ui.Components.fz0 fz0Var = new org.telegram.ui.Components.fz0(context);
                        this.e = fz0Var;
                        fz0Var.setFactory(new ae0(context, i12));
                        this.e.setInAnimation(context, R.anim.alpha_in);
                        this.e.setOutAnimation(context, R.anim.alpha_out);
                        linearLayout.addView(this.e, c8.ma.t(-2, -2, 1, 20, 8, 20, 0));
                        TextView textView2 = new TextView(context);
                        textView2.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Fi, null);
                        textView2.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                        textView2.setGravity((!r0() ? 3 : 1) | 16);
                        int i15 = 13;
                        textView2.setOnClickListener(new j40(context, i15));
                        textView2.setVisibility(i11 != 2 ? 0 : 8);
                        textView2.setText(org.telegram.messenger.gd.M0(2131750577, null));
                        frameLayout2.addView(textView2, c8.ma.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                        h6.m.i(textView2);
                        TextView textView3 = new TextView(context);
                        this.r = textView3;
                        textView3.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.u6.U(this.r, org.telegram.ui.ActionBar.n6.D6, null);
                        this.r.setText(org.telegram.messenger.gd.M0(2131747459, null));
                        this.r.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.messenger.g0.X3(this.r, false, 1.0f, true, false);
                        frameLayout2.addView(this.r, c8.ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                        org.telegram.ui.Components.xb0 xb0Var = new org.telegram.ui.Components.xb0(context, null);
                        this.f = xb0Var;
                        xb0Var.setText(org.telegram.messenger.gd.M0(2131751105, null));
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                        this.h = editTextBoldCursor;
                        editTextBoldCursor.setInputType(524417);
                        this.h.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.u6.U(this.h, i14, null);
                        this.h.setBackground(null);
                        this.h.setMaxLines(1);
                        this.h.setLines(1);
                        this.h.setGravity(!org.telegram.messenger.gd.a0 ? 5 : 3);
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
                        org.telegram.ui.ActionBar.u6.v(this.h, org.telegram.ui.ActionBar.n6.l6, null);
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
                        org.telegram.ui.ActionBar.u6.s(this.s, org.telegram.ui.ActionBar.n6.H6, null, PorterDuff.Mode.SRC_ATOP);
                        ImageView imageView2 = this.s;
                        int i16 = org.telegram.ui.ActionBar.n6.i6;
                        org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i16), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i16), getResourceProvider());
                        org.telegram.messenger.g0.X3(this.s, i11 != 1 && this.F == 0, 0.1f, true, false);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        this.h.addTextChangedListener(new bi.v(i15, this, atomicBoolean));
                        this.s.setOnClickListener(new cd0(3, this, atomicBoolean));
                        linearLayout2.addView(this.s, c8.ma.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                        this.f.addView(linearLayout2, c8.ma.c(-2.0f, -1));
                        frameLayout3.addView(this.f, c8.ma.t(-1, -2, 1, 32, 0, 32, 0));
                        this.h.setOnEditorActionListener(new fa(this, 8));
                        this.h.addTextChangedListener(new ni0(this, z11 ? 1 : 0));
                        this.h.setCustomSelectionActionModeCallback(new oi.y0(2));
                        mb0 mb0Var = new mb0(i13, context, this);
                        this.n = mb0Var;
                        mb0Var.b(4, 10);
                        for (er erVar : this.n.f) {
                            erVar.setShowSoftInputOnFocusCompat(!q0());
                            erVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            erVar.setTextSize(1, 24.0f);
                            erVar.addTextChangedListener(new ni0(this, i12));
                            erVar.setOnFocusChangeListener(new di.q9(this, erVar, 3));
                        }
                        frameLayout3.addView(this.n, c8.ma.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                        linearLayout.addView(frameLayout3, c8.ma.t(-1, -2, 1, 0, 32, 0, 72));
                        if (i11 == 1) {
                            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
                        }
                        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
                        this.x = a10Var;
                        h6.m.i(a10Var);
                        frameLayout2.addView(this.x, c8.ma.d(56, 56.0f, (!org.telegram.messenger.gd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                        this.x.setOnClickListener(new j40(this, 14));
                        org.telegram.ui.Components.h21 h21Var = new org.telegram.ui.Components.h21(context);
                        h21Var.setTransformType(1);
                        h21Var.setProgress(0.0f);
                        h21Var.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O9, false));
                        h21Var.setDrawBackground(false);
                        this.x.setContentDescription(org.telegram.messenger.gd.M0(2131748058, null));
                        this.x.addView(h21Var, c8.ma.e(56, 56, 17));
                        org.telegram.ui.Components.a10 a10Var2 = this.x;
                        a10Var2.a(a10Var2);
                        z0();
                    }
                }
                i7 = 8;
                ph0Var2.setVisibility(i7);
                linearLayout.addView(this.a, c8.ma.r(120, 120, 1));
                TextView textView4 = new TextView(context);
                this.d = textView4;
                int i142 = org.telegram.ui.ActionBar.n6.G6;
                org.telegram.ui.ActionBar.u6.U(textView4, i142, null);
                this.d.setTypeface(org.telegram.messenger.g0.o());
                if (i11 == 1) {
                }
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                linearLayout.addView(this.d, c8.ma.t(-2, -2, 1, 0, 16, 0, 0));
                org.telegram.ui.Components.fz0 fz0Var2 = new org.telegram.ui.Components.fz0(context);
                this.e = fz0Var2;
                fz0Var2.setFactory(new ae0(context, i12));
                this.e.setInAnimation(context, R.anim.alpha_in);
                this.e.setOutAnimation(context, R.anim.alpha_out);
                linearLayout.addView(this.e, c8.ma.t(-2, -2, 1, 20, 8, 20, 0));
                TextView textView22 = new TextView(context);
                textView22.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView22, org.telegram.ui.ActionBar.n6.Fi, null);
                textView22.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                textView22.setGravity((!r0() ? 3 : 1) | 16);
                int i152 = 13;
                textView22.setOnClickListener(new j40(context, i152));
                textView22.setVisibility(i11 != 2 ? 0 : 8);
                textView22.setText(org.telegram.messenger.gd.M0(2131750577, null));
                frameLayout2.addView(textView22, c8.ma.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                h6.m.i(textView22);
                TextView textView32 = new TextView(context);
                this.r = textView32;
                textView32.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(this.r, org.telegram.ui.ActionBar.n6.D6, null);
                this.r.setText(org.telegram.messenger.gd.M0(2131747459, null));
                this.r.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                org.telegram.messenger.g0.X3(this.r, false, 1.0f, true, false);
                frameLayout2.addView(this.r, c8.ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                org.telegram.ui.Components.xb0 xb0Var2 = new org.telegram.ui.Components.xb0(context, null);
                this.f = xb0Var2;
                xb0Var2.setText(org.telegram.messenger.gd.M0(2131751105, null));
                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
                this.h = editTextBoldCursor2;
                editTextBoldCursor2.setInputType(524417);
                this.h.setTextSize(1, 18.0f);
                org.telegram.ui.ActionBar.u6.U(this.h, i142, null);
                this.h.setBackground(null);
                this.h.setMaxLines(1);
                this.h.setLines(1);
                this.h.setGravity(!org.telegram.messenger.gd.a0 ? 5 : 3);
                this.h.setSingleLine(true);
                if (i11 != 1) {
                }
                this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.h.setTypeface(Typeface.DEFAULT);
                org.telegram.ui.ActionBar.u6.v(this.h, org.telegram.ui.ActionBar.n6.l6, null);
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
                org.telegram.ui.ActionBar.u6.s(this.s, org.telegram.ui.ActionBar.n6.H6, null, PorterDuff.Mode.SRC_ATOP);
                ImageView imageView22 = this.s;
                int i162 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.ActionBar.u6.Q(imageView22, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i162), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i162), getResourceProvider());
                org.telegram.messenger.g0.X3(this.s, i11 != 1 && this.F == 0, 0.1f, true, false);
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                this.h.addTextChangedListener(new bi.v(i152, this, atomicBoolean2));
                this.s.setOnClickListener(new cd0(3, this, atomicBoolean2));
                linearLayout22.addView(this.s, c8.ma.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                this.f.addView(linearLayout22, c8.ma.c(-2.0f, -1));
                frameLayout3.addView(this.f, c8.ma.t(-1, -2, 1, 32, 0, 32, 0));
                this.h.setOnEditorActionListener(new fa(this, 8));
                this.h.addTextChangedListener(new ni0(this, z11 ? 1 : 0));
                this.h.setCustomSelectionActionModeCallback(new oi.y0(2));
                mb0 mb0Var2 = new mb0(i13, context, this);
                this.n = mb0Var2;
                mb0Var2.b(4, 10);
                while (r10 < r6) {
                }
                frameLayout3.addView(this.n, c8.ma.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                linearLayout.addView(frameLayout3, c8.ma.t(-1, -2, 1, 0, 32, 0, 72));
                if (i11 == 1) {
                }
                org.telegram.ui.Components.a10 a10Var3 = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
                this.x = a10Var3;
                h6.m.i(a10Var3);
                frameLayout2.addView(this.x, c8.ma.d(56, 56.0f, (!org.telegram.messenger.gd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                this.x.setOnClickListener(new j40(this, 14));
                org.telegram.ui.Components.h21 h21Var2 = new org.telegram.ui.Components.h21(context);
                h21Var2.setTransformType(1);
                h21Var2.setProgress(0.0f);
                h21Var2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O9, false));
                h21Var2.setDrawBackground(false);
                this.x.setContentDescription(org.telegram.messenger.gd.M0(2131748058, null));
                this.x.addView(h21Var2, c8.ma.e(56, 56, 17));
                org.telegram.ui.Components.a10 a10Var22 = this.x;
                a10Var22.a(a10Var22);
                z0();
            }
        } else {
            setHasOwnBackground(true);
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747464, null));
            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.a7));
            org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
            this.c = ck0Var;
            ck0Var.r1();
            this.c.setSectionsDrawBackground(true);
            this.c.setLayoutManager(new jg.b0(i12, z10 ? 1 : 0, 14));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, c8.ma.c(-1.0f, -1));
            org.telegram.ui.Components.ck0 ck0Var2 = this.c;
            l4 l4Var = new l4(12, this, context);
            this.b = l4Var;
            ck0Var2.setAdapter(l4Var);
            this.c.setOnItemClickListener(new h(this, 19));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                A0();
                l4 l4Var = this.b;
                if (l4Var != null) {
                    l4Var.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.a7));
        if (this.y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean hasForceLightStatusBar() {
        return this.y != 0;
    }

    @Override // org.telegram.ui.ActionBar.h2
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
                mb0Var.postDelayed(new we0(7, this, runnable), (erVarArr.length * 75) + 350);
                return;
            } else {
                er erVar = erVarArr[i7];
                erVar.postDelayed(new ki0(erVar, 0), i7 * 75);
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onConfigurationChanged(Configuration configuration) {
        er[] erVarArr;
        int i7;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.ph0 ph0Var = this.a;
        if (ph0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x < point.y) {
                    i7 = 0;
                    ph0Var.setVisibility(i7);
                }
            }
            i7 = 8;
            ph0Var.setVisibility(i7);
        }
        mb0 mb0Var = this.n;
        if (mb0Var == null || (erVarArr = mb0Var.f) == null) {
            return;
        }
        for (er erVar : erVarArr) {
            erVar.setShowSoftInputOnFocusCompat(!q0());
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.y != 0) {
            return true;
        }
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.n0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.n0);
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.h2
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

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.n6.l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
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
        return (i7 == 1 && this.E == 1) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.bz.r == 1);
    }

    public final boolean s0() {
        int i7 = this.y;
        return (i7 == 1 && this.E == 0) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.bz.r == 0);
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
            boolean isEmpty = org.telegram.messenger.bz.s.isEmpty();
            try {
                org.telegram.messenger.bz.w = new byte[16];
                Utilities.b.nextBytes(org.telegram.messenger.bz.w);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.bz.w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.bz.w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.bz.s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.bz.A = true;
            org.telegram.messenger.bz.r = this.E;
            org.telegram.messenger.bz.y();
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
            long j3 = org.telegram.messenger.bz.t;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.gd.a0("TooManyTries", null, 2131743801, org.telegram.messenger.gd.G(Math.max(1, (int) Math.ceil(j3 / 1000.0d)), "Seconds", new Object[0])), 0).show();
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
            if (!org.telegram.messenger.bz.g(code)) {
                org.telegram.messenger.bz.r();
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
            org.telegram.messenger.bz.v = 0;
            org.telegram.messenger.bz.y();
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

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return this.y == 0;
    }

    public final void v0() {
        if ((this.E == 1 && this.h.getText().length() == 0) || (this.E == 0 && this.n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.R;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.gd.M0(2131751804, null));
        this.e.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131747463, null)));
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
        duration.setInterpolator(z10 ? org.telegram.ui.Components.lr.f : org.telegram.ui.Components.xs.e);
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
            charSequence = org.telegram.messenger.gd.M0(2131751100, null);
        } else if (i7 == 3) {
            charSequence = org.telegram.messenger.gd.M0(2131742955, null);
        } else if (this.F == 0) {
            charSequence = org.telegram.messenger.gd.M0(this.E == 0 ? 2131751696 : 2131751695, null);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        int i10 = 1;
        boolean z10 = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (i7 == 2) {
            this.e.a(org.telegram.messenger.gd.M0(2131751100, null), z10, false);
        } else if (i7 == 3) {
            this.e.setText(org.telegram.messenger.gd.M0(2131742955, null));
        } else if (this.F == 0) {
            this.e.a(org.telegram.messenger.gd.M0(this.E == 0 ? 2131751696 : 2131751695, null), z10, false);
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
