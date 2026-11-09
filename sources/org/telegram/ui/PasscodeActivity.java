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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int D;
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
    public org.telegram.ui.ActionBar.r0 Q;
    public boolean R;
    public final fi0 S;
    public gi0 T;
    public n90 U;
    public wb1 V;
    public org.telegram.ui.Components.dh0 a;
    private int autoLockRow;
    public l4 b;
    public org.telegram.ui.Components.qj0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.xy0 e;
    public org.telegram.ui.Components.mb0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public nb0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.br w;
    public org.telegram.ui.Components.q00 x;
    public final int y;

    public PasscodeActivity(int i7) {
        super(null);
        this.D = 0;
        this.E = 0;
        this.S = new fi0(this, 5);
        this.y = i7;
    }

    public static /* synthetic */ void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.ib0 ib0Var, int i7) {
        int value = ib0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.iz.y = 0;
        } else if (value == 1) {
            org.telegram.messenger.iz.y = 60;
        } else if (value == 2) {
            org.telegram.messenger.iz.y = org.telegram.messenger.qs.X4;
        } else if (value == 3) {
            org.telegram.messenger.iz.y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.iz.y = 18000;
        }
        passcodeActivity.b.g(i7);
        org.telegram.messenger.p10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i7) {
        if (view.isEnabled()) {
            if (i7 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131751433, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131751432, null);
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751431, null), new yr(passcodeActivity, 29));
                u1Var.show();
                org.telegram.ui.ActionBar.s6.U((TextView) u1Var.d(-1), org.telegram.ui.ActionBar.l6.q7, null);
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
                String M02 = org.telegram.messenger.id.M0(2131753800, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.R = M02;
                org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(passcodeActivity.getParentActivity(), null);
                ib0Var.setMinValue(0);
                ib0Var.setMaxValue(4);
                int i11 = org.telegram.messenger.iz.y;
                if (i11 == 0) {
                    ib0Var.setValue(0);
                } else if (i11 == 60) {
                    ib0Var.setValue(1);
                } else if (i11 == 300) {
                    ib0Var.setValue(2);
                } else if (i11 == 3600) {
                    ib0Var.setValue(3);
                } else if (i11 == 18000) {
                    ib0Var.setValue(4);
                }
                ib0Var.setFormatter(new org.telegram.ui.Components.jl0(28));
                alertDialog$Builder2.o(ib0Var);
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131751354, null), new jg.a2(passcodeActivity, ib0Var, i7, 12));
                passcodeActivity.showDialog(u1Var2);
                return;
            }
            if (i7 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.iz.D = !org.telegram.messenger.iz.D;
                org.telegram.messenger.p10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.D);
                return;
            }
            if (i7 == passcodeActivity.N) {
                org.telegram.messenger.iz.A = !org.telegram.messenger.iz.A;
                org.telegram.messenger.p10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.A);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.n0, Boolean.FALSE);
                if (org.telegram.messenger.iz.A) {
                    return;
                }
                org.telegram.ui.Components.v4.r0(passcodeActivity, null, org.telegram.messenger.id.M0(2131745844, null), null);
                return;
            }
            if (i7 == passcodeActivity.J) {
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean z9 = !x10.K();
                if (x10.m != z9) {
                    x10.m = z9;
                    try {
                        org.telegram.ui.Wallet.l0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x10.m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.l0.k("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.p10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.r8) view).setChecked(x10.K());
                return;
            }
            if (i7 == passcodeActivity.K) {
                org.telegram.ui.Wallet.l0 x11 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean J = x11.J();
                boolean z10 = !J;
                bi.b9 b9Var = new bi.b9(7, view, J);
                org.telegram.ui.Wallet.p0 p0Var = x11.c;
                if (p0Var == null) {
                    b9Var.a(Boolean.FALSE);
                } else {
                    org.telegram.ui.Wallet.p0.h.execute(new org.telegram.messenger.video.n(p0Var, p0Var.l(), z10, new org.telegram.ui.Wallet.k(b9Var, i10), 3));
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.f2 p0() {
        return !org.telegram.messenger.iz.s.isEmpty() ? new PasscodeActivity(2) : new g(6);
    }

    public final void A0() {
        this.I = -1;
        this.J = -1;
        this.fingerprintRow = -1;
        this.K = -1;
        this.L = -1;
        this.G = 1;
        this.P = 3;
        this.changePasscodeRow = 2;
        try {
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.b, 0)).d(15) == 0) {
                Typeface typeface = org.telegram.messenger.g0.a;
                if (((KeyguardManager) org.telegram.messenger.t0.b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i7 = this.P;
                    this.P = i7 + 1;
                    this.fingerprintRow = i7;
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        int i10 = this.P;
        this.autoLockRow = i10;
        this.P = i10 + 2;
        this.H = i10 + 1;
        if (((org.telegram.messenger.h0) getMessagesController().x7.j0.b).c) {
            int i11 = this.P;
            this.I = i11;
            this.P = i11 + 2;
            this.J = i11 + 1;
            if (org.telegram.ui.Wallet.p0.i(org.telegram.messenger.t0.b)) {
                int i12 = this.P;
                this.P = i12 + 1;
                this.K = i12;
            }
            int i13 = this.P;
            this.P = i13 + 1;
            this.L = i13;
        }
        int i14 = this.P;
        this.M = i14;
        this.N = i14 + 1;
        this.O = i14 + 2;
        this.P = i14 + 4;
        this.disablePasscodeRow = i14 + 3;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.s8));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e1 A[LOOP:0: B:54:0x03df->B:55:0x03e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i7;
        org.telegram.ui.ActionBar.z0 z0Var;
        wx wxVar = new wx(this, 20);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        if (y4Var != null) {
            y4Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(wxVar);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setAllowOverlayTitle(false);
            this.actionBar.setActionBarMenuOnItemClick(wxVar);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = this.y;
        int i12 = 1;
        if (i11 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, c8.ha.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        ii0 ii0Var = new ii0(this, context, frameLayout, i10);
        ii0Var.setDelegate(new ab0(i12, this));
        this.fragmentView = ii0Var;
        ii0Var.addView(frameLayout, c8.ha.l(1.0f, -1, 0));
        org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(context);
        this.w = brVar;
        brVar.setVisibility(q0() ? 0 : 8);
        ii0Var.addView(this.w, c8.ha.o(-1, org.telegram.messenger.qs.G3));
        if (i11 != 0) {
            int i13 = 2;
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, kVar, null);
                    this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                    org.telegram.ui.ActionBar.s6.l(this.actionBar, 1, org.telegram.ui.ActionBar.l6.G6, null);
                    org.telegram.ui.ActionBar.s6.l(this.actionBar, 3, org.telegram.ui.ActionBar.l6.u8, null);
                    this.actionBar.setCastShadows(false);
                    org.telegram.ui.ActionBar.y r10 = this.actionBar.r();
                    if (i11 == 1) {
                        org.telegram.ui.ActionBar.r0 a10 = r10.a(0, R.drawable.ic_ab_other);
                        this.Q = a10;
                        z0Var = a10.e(1, R.drawable.msg_permissions, org.telegram.messenger.id.M0(2131747653, null));
                    } else {
                        z0Var = null;
                    }
                    this.actionBar.setActionBarMenuOnItemClick(new ji0(this, z0Var, z11 ? 1 : 0));
                }
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, c8.ha.c(-1.0f, -1));
                org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
                this.a = dh0Var;
                dh0Var.setFocusable(false);
                this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
                this.a.setAutoRepeat(false);
                this.a.d();
                org.telegram.ui.Components.dh0 dh0Var2 = this.a;
                if (!org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x < point.y) {
                        i7 = 0;
                        dh0Var2.setVisibility(i7);
                        linearLayout.addView(this.a, c8.ha.r(120, 120, 1));
                        TextView textView = new TextView(context);
                        this.d = textView;
                        int i14 = org.telegram.ui.ActionBar.l6.G6;
                        org.telegram.ui.ActionBar.s6.U(textView, i14, null);
                        this.d.setTypeface(org.telegram.messenger.g0.o());
                        if (i11 == 1) {
                            this.d.setText(org.telegram.messenger.id.M0(2131751112, null));
                        } else if (org.telegram.messenger.iz.s.isEmpty()) {
                            this.d.setText(org.telegram.messenger.id.M0(2131751708, null));
                        } else {
                            this.d.setText(org.telegram.messenger.id.M0(2131751119, null));
                        }
                        this.d.setTextSize(1, 18.0f);
                        this.d.setGravity(1);
                        linearLayout.addView(this.d, c8.ha.t(-2, -2, 1, 0, 16, 0, 0));
                        org.telegram.ui.Components.xy0 xy0Var = new org.telegram.ui.Components.xy0(context);
                        this.e = xy0Var;
                        xy0Var.setFactory(new ae0(context, i12));
                        this.e.setInAnimation(context, R.anim.alpha_in);
                        this.e.setOutAnimation(context, R.anim.alpha_out);
                        linearLayout.addView(this.e, c8.ha.t(-2, -2, 1, 20, 8, 20, 0));
                        TextView textView2 = new TextView(context);
                        textView2.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.Ci, null);
                        textView2.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                        textView2.setGravity((!r0() ? 3 : 1) | 16);
                        textView2.setOnClickListener(new i40(context, 13));
                        textView2.setVisibility(i11 != 2 ? 0 : 8);
                        textView2.setText(org.telegram.messenger.id.M0(2131750593, null));
                        frameLayout2.addView(textView2, c8.ha.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                        h6.m.g(textView2);
                        TextView textView3 = new TextView(context);
                        this.r = textView3;
                        textView3.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.s6.U(this.r, org.telegram.ui.ActionBar.l6.D6, null);
                        this.r.setText(org.telegram.messenger.id.M0(2131747652, null));
                        this.r.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.messenger.g0.Z3(this.r, false, 1.0f, true, false);
                        frameLayout2.addView(this.r, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                        org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(context, null);
                        this.f = mb0Var;
                        mb0Var.setText(org.telegram.messenger.id.M0(2131751116, null));
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                        this.h = editTextBoldCursor;
                        editTextBoldCursor.setInputType(524417);
                        this.h.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.s6.U(this.h, i14, null);
                        this.h.setBackground(null);
                        this.h.setMaxLines(1);
                        this.h.setLines(1);
                        this.h.setGravity(!org.telegram.messenger.id.a0 ? 5 : 3);
                        this.h.setSingleLine(true);
                        int i15 = 6;
                        if (i11 != 1) {
                            this.E = 0;
                            this.h.setImeOptions(5);
                        } else {
                            this.E = 1;
                            this.h.setImeOptions(6);
                        }
                        this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        this.h.setTypeface(Typeface.DEFAULT);
                        org.telegram.ui.ActionBar.s6.v(this.h, org.telegram.ui.ActionBar.l6.l6, null);
                        this.h.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.h.setCursorWidth(1.5f);
                        int L = org.telegram.messenger.g0.L(16.0f);
                        this.h.setPadding(L, L, L, L);
                        this.h.setOnFocusChangeListener(new fd(this, 10));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        linearLayout2.addView(this.h, c8.ha.l(1.0f, 0, -2));
                        ImageView imageView = new ImageView(context);
                        this.s = imageView;
                        imageView.setImageResource(R.drawable.msg_message);
                        org.telegram.ui.ActionBar.s6.s(this.s, org.telegram.ui.ActionBar.l6.H6, null, PorterDuff.Mode.SRC_ATOP);
                        ImageView imageView2 = this.s;
                        int i16 = org.telegram.ui.ActionBar.l6.i6;
                        org.telegram.ui.ActionBar.s6.Q(imageView2, org.telegram.ui.ActionBar.l6.h0(getThemedColor(i16), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i16), getResourceProvider());
                        org.telegram.messenger.g0.Z3(this.s, i11 != 1 && this.E == 0, 0.1f, true, false);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        this.h.addTextChangedListener(new fi.h7(i15, this, atomicBoolean));
                        this.s.setOnClickListener(new org.telegram.ui.Components.u41(29, this, atomicBoolean));
                        linearLayout2.addView(this.s, c8.ha.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                        this.f.addView(linearLayout2, c8.ha.c(-2.0f, -1));
                        frameLayout3.addView(this.f, c8.ha.t(-1, -2, 1, 32, 0, 32, 0));
                        this.h.setOnEditorActionListener(new fa(this, 8));
                        this.h.addTextChangedListener(new ki0(this, z10 ? 1 : 0));
                        this.h.setCustomSelectionActionModeCallback(new li.a1(2));
                        nb0 nb0Var = new nb0(i13, context, this);
                        this.n = nb0Var;
                        nb0Var.b(4, 10);
                        for (dr drVar : this.n.f) {
                            drVar.setShowSoftInputOnFocusCompat(!q0());
                            drVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            drVar.setTextSize(1, 24.0f);
                            drVar.addTextChangedListener(new ki0(this, i12));
                            drVar.setOnFocusChangeListener(new bi.bb(this, drVar, 3));
                        }
                        frameLayout3.addView(this.n, c8.ha.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                        linearLayout.addView(frameLayout3, c8.ha.t(-1, -2, 1, 0, 32, 0, 72));
                        if (i11 == 1) {
                            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.l6.d6));
                        }
                        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
                        this.x = q00Var;
                        h6.m.g(q00Var);
                        frameLayout2.addView(this.x, c8.ha.d(56, 56.0f, (!org.telegram.messenger.id.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                        this.x.setOnClickListener(new i40(this, 14));
                        org.telegram.ui.Components.u11 u11Var = new org.telegram.ui.Components.u11(context);
                        u11Var.setTransformType(1);
                        u11Var.setProgress(0.0f);
                        u11Var.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.O9, false));
                        u11Var.setDrawBackground(false);
                        this.x.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
                        this.x.addView(u11Var, c8.ha.e(56, 56, 17));
                        org.telegram.ui.Components.q00 q00Var2 = this.x;
                        q00Var2.a(q00Var2);
                        z0();
                    }
                }
                i7 = 8;
                dh0Var2.setVisibility(i7);
                linearLayout.addView(this.a, c8.ha.r(120, 120, 1));
                TextView textView4 = new TextView(context);
                this.d = textView4;
                int i142 = org.telegram.ui.ActionBar.l6.G6;
                org.telegram.ui.ActionBar.s6.U(textView4, i142, null);
                this.d.setTypeface(org.telegram.messenger.g0.o());
                if (i11 == 1) {
                }
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                linearLayout.addView(this.d, c8.ha.t(-2, -2, 1, 0, 16, 0, 0));
                org.telegram.ui.Components.xy0 xy0Var2 = new org.telegram.ui.Components.xy0(context);
                this.e = xy0Var2;
                xy0Var2.setFactory(new ae0(context, i12));
                this.e.setInAnimation(context, R.anim.alpha_in);
                this.e.setOutAnimation(context, R.anim.alpha_out);
                linearLayout.addView(this.e, c8.ha.t(-2, -2, 1, 20, 8, 20, 0));
                TextView textView22 = new TextView(context);
                textView22.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(textView22, org.telegram.ui.ActionBar.l6.Ci, null);
                textView22.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                textView22.setGravity((!r0() ? 3 : 1) | 16);
                textView22.setOnClickListener(new i40(context, 13));
                textView22.setVisibility(i11 != 2 ? 0 : 8);
                textView22.setText(org.telegram.messenger.id.M0(2131750593, null));
                frameLayout2.addView(textView22, c8.ha.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                h6.m.g(textView22);
                TextView textView32 = new TextView(context);
                this.r = textView32;
                textView32.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(this.r, org.telegram.ui.ActionBar.l6.D6, null);
                this.r.setText(org.telegram.messenger.id.M0(2131747652, null));
                this.r.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                org.telegram.messenger.g0.Z3(this.r, false, 1.0f, true, false);
                frameLayout2.addView(this.r, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                org.telegram.ui.Components.mb0 mb0Var2 = new org.telegram.ui.Components.mb0(context, null);
                this.f = mb0Var2;
                mb0Var2.setText(org.telegram.messenger.id.M0(2131751116, null));
                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
                this.h = editTextBoldCursor2;
                editTextBoldCursor2.setInputType(524417);
                this.h.setTextSize(1, 18.0f);
                org.telegram.ui.ActionBar.s6.U(this.h, i142, null);
                this.h.setBackground(null);
                this.h.setMaxLines(1);
                this.h.setLines(1);
                this.h.setGravity(!org.telegram.messenger.id.a0 ? 5 : 3);
                this.h.setSingleLine(true);
                int i152 = 6;
                if (i11 != 1) {
                }
                this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.h.setTypeface(Typeface.DEFAULT);
                org.telegram.ui.ActionBar.s6.v(this.h, org.telegram.ui.ActionBar.l6.l6, null);
                this.h.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.h.setCursorWidth(1.5f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                this.h.setPadding(L2, L2, L2, L2);
                this.h.setOnFocusChangeListener(new fd(this, 10));
                LinearLayout linearLayout22 = new LinearLayout(context);
                linearLayout22.setOrientation(0);
                linearLayout22.setGravity(16);
                linearLayout22.addView(this.h, c8.ha.l(1.0f, 0, -2));
                ImageView imageView3 = new ImageView(context);
                this.s = imageView3;
                imageView3.setImageResource(R.drawable.msg_message);
                org.telegram.ui.ActionBar.s6.s(this.s, org.telegram.ui.ActionBar.l6.H6, null, PorterDuff.Mode.SRC_ATOP);
                ImageView imageView22 = this.s;
                int i162 = org.telegram.ui.ActionBar.l6.i6;
                org.telegram.ui.ActionBar.s6.Q(imageView22, org.telegram.ui.ActionBar.l6.h0(getThemedColor(i162), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i162), getResourceProvider());
                org.telegram.messenger.g0.Z3(this.s, i11 != 1 && this.E == 0, 0.1f, true, false);
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                this.h.addTextChangedListener(new fi.h7(i152, this, atomicBoolean2));
                this.s.setOnClickListener(new org.telegram.ui.Components.u41(29, this, atomicBoolean2));
                linearLayout22.addView(this.s, c8.ha.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                this.f.addView(linearLayout22, c8.ha.c(-2.0f, -1));
                frameLayout3.addView(this.f, c8.ha.t(-1, -2, 1, 32, 0, 32, 0));
                this.h.setOnEditorActionListener(new fa(this, 8));
                this.h.addTextChangedListener(new ki0(this, z10 ? 1 : 0));
                this.h.setCustomSelectionActionModeCallback(new li.a1(2));
                nb0 nb0Var2 = new nb0(i13, context, this);
                this.n = nb0Var2;
                nb0Var2.b(4, 10);
                while (r10 < r6) {
                }
                frameLayout3.addView(this.n, c8.ha.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                linearLayout.addView(frameLayout3, c8.ha.t(-1, -2, 1, 0, 32, 0, 72));
                if (i11 == 1) {
                }
                org.telegram.ui.Components.q00 q00Var3 = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
                this.x = q00Var3;
                h6.m.g(q00Var3);
                frameLayout2.addView(this.x, c8.ha.d(56, 56.0f, (!org.telegram.messenger.id.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                this.x.setOnClickListener(new i40(this, 14));
                org.telegram.ui.Components.u11 u11Var2 = new org.telegram.ui.Components.u11(context);
                u11Var2.setTransformType(1);
                u11Var2.setProgress(0.0f);
                u11Var2.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.O9, false));
                u11Var2.setDrawBackground(false);
                this.x.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
                this.x.addView(u11Var2, c8.ha.e(56, 56, 17));
                org.telegram.ui.Components.q00 q00Var22 = this.x;
                q00Var22.a(q00Var22);
                z0();
            }
        } else {
            setHasOwnBackground(true);
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747657, null));
            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.l6.a7));
            org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
            this.c = qj0Var;
            qj0Var.r1();
            this.c.setSectionsDrawBackground(true);
            this.c.setLayoutManager(new jg.b0(i12, z9 ? 1 : 0, 14));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, c8.ha.c(-1.0f, -1));
            org.telegram.ui.Components.qj0 qj0Var2 = this.c;
            l4 l4Var = new l4(12, this, context);
            this.b = l4Var;
            qj0Var2.setAdapter(l4Var);
            this.c.setOnItemClickListener(new h(this, 19));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                A0();
                l4 l4Var = this.b;
                if (l4Var != null) {
                    l4Var.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.a7));
        if (this.y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean hasForceLightStatusBar() {
        return this.y != 0;
    }

    @Override // org.telegram.ui.ActionBar.f2
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
            nb0 nb0Var = this.n;
            dr[] drVarArr = nb0Var.f;
            if (i7 >= drVarArr.length) {
                nb0Var.postDelayed(new bd0(16, this, runnable), (drVarArr.length * 75) + 350);
                return;
            } else {
                dr drVar = drVarArr[i7];
                drVar.postDelayed(new hi0(drVar, 0), i7 * 75);
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onConfigurationChanged(Configuration configuration) {
        dr[] drVarArr;
        int i7;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.dh0 dh0Var = this.a;
        if (dh0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x < point.y) {
                    i7 = 0;
                    dh0Var.setVisibility(i7);
                }
            }
            i7 = 8;
            dh0Var.setVisibility(i7);
        }
        nb0 nb0Var = this.n;
        if (nb0Var == null || (drVarArr = nb0Var.f) == null) {
            return;
        }
        for (dr drVar : drVarArr) {
            drVar.setShowSoftInputOnFocusCompat(!q0());
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.y != 0) {
            return true;
        }
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.n0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.n0);
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.b;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.y != 0 && !q0()) {
            org.telegram.messenger.g0.i3(new fi0(this, 6), 200L);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        if (q0()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.s6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.l6.l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 || this.y == 0) {
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
        return (i7 == 1 && this.D == 1) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.iz.r == 1);
    }

    public final boolean s0() {
        int i7 = this.y;
        return (i7 == 1 && this.D == 0) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.iz.r == 0);
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
            for (dr drVar : this.n.f) {
                drVar.z(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        org.telegram.messenger.g0.G3(s0() ? 10.0f : 4.0f, s0() ? this.n : this.f, new fi0(this, 3));
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
            if (!this.F.equals(code)) {
                org.telegram.messenger.g0.X3(this.r, true);
                for (dr drVar : this.n.f) {
                    drVar.setText("");
                }
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.n.removeCallbacks(this.S);
                this.n.post(new fi0(this, i11));
                return;
            }
            boolean isEmpty = org.telegram.messenger.iz.s.isEmpty();
            try {
                org.telegram.messenger.iz.w = new byte[16];
                Utilities.b.nextBytes(org.telegram.messenger.iz.w);
                byte[] bytes = this.F.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.iz.w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.iz.w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.iz.s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.iz.A = true;
            org.telegram.messenger.iz.r = this.D;
            org.telegram.messenger.iz.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            for (dr drVar2 : this.n.f) {
                drVar2.clearFocus();
                org.telegram.messenger.g0.v1(drVar2);
            }
            this.w.setEditText(null);
            o0(new gi0(this, isEmpty, i11));
            return;
        }
        int i12 = 2;
        if (i7 == 2 || i7 == 3) {
            long j3 = org.telegram.messenger.iz.t;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.id.a0("TooManyTries", null, 2131744036, org.telegram.messenger.id.G(Math.max(1, (int) Math.ceil(j3 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (dr drVar3 : this.n.f) {
                    drVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
                return;
            }
            if (!org.telegram.messenger.iz.g(code)) {
                org.telegram.messenger.iz.r();
                this.h.setText("");
                for (dr drVar4 : this.n.f) {
                    drVar4.setText("");
                }
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
                return;
            }
            org.telegram.messenger.iz.v = 0;
            org.telegram.messenger.iz.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            dr[] drVarArr = this.n.f;
            int length2 = drVarArr.length;
            while (i11 < length2) {
                dr drVar5 = drVarArr[i11];
                drVar5.clearFocus();
                org.telegram.messenger.g0.v1(drVar5);
                i11++;
            }
            this.w.setEditText(null);
            if (i7 == 3) {
                o0(new fi0(this, i10));
            } else {
                o0(new fi0(this, i12));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return this.y == 0;
    }

    public final void v0() {
        if ((this.D == 1 && this.h.getText().length() == 0) || (this.D == 0 && this.n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.Q;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.id.M0(2131751815, null));
        this.e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747656, null)));
        this.F = s0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (dr drVar : this.n.f) {
            drVar.setText("");
        }
        y0();
        this.E = 1;
    }

    public final void w0(boolean z9, boolean z10) {
        if (z9) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
        if (!z10) {
            this.w.setVisibility(z9 ? 0 : 8);
            this.w.setAlpha(z9 ? 1.0f : 0.0f);
            this.w.setTranslationY(z9 ? 0.0f : org.telegram.messenger.g0.L(230.0f));
            this.fragmentView.requestLayout();
            return;
        }
        int i7 = 2;
        ValueAnimator duration = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z9 ? org.telegram.ui.Components.xq.f : org.telegram.ui.Components.ks.e);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new b50(i7, this, z9));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.U = (n90) runnable;
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
        int i7 = this.y;
        if (i7 == 2) {
            charSequence = org.telegram.messenger.id.M0(2131751111, null);
        } else if (i7 == 3) {
            charSequence = org.telegram.messenger.id.M0(2131743193, null);
        } else if (this.E == 0) {
            charSequence = org.telegram.messenger.id.M0(this.D == 0 ? 2131751707 : 2131751706, null);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        int i10 = 1;
        boolean z9 = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (i7 == 2) {
            this.e.a(org.telegram.messenger.id.M0(2131751111, null), z9, false);
        } else if (i7 == 3) {
            this.e.setText(org.telegram.messenger.id.M0(2131743193, null));
        } else if (this.E == 0) {
            this.e.a(org.telegram.messenger.id.M0(this.D == 0 ? 2131751707 : 2131751706, null), z9, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.Z3(this.n, true, 1.0f, true, z9);
            org.telegram.messenger.g0.Z3(this.f, false, 1.0f, true, z9);
        } else if (r0()) {
            org.telegram.messenger.g0.Z3(this.n, false, 1.0f, true, z9);
            org.telegram.messenger.g0.Z3(this.f, true, 1.0f, true, z9);
        }
        if (r0()) {
            gi0 gi0Var = new gi0(this, z9, i10);
            this.T = gi0Var;
            org.telegram.messenger.g0.i3(gi0Var, 3000L);
        } else {
            this.x.e(false, z9);
        }
        w0(q0(), z9);
        y0();
    }
}
