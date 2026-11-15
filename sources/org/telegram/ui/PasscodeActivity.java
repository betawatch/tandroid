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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
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
    public final fi0 T;
    public gi0 U;
    public m90 V;
    public fy0 W;
    public org.telegram.ui.Components.fh0 a;
    private int autoLockRow;
    public l4 b;
    public org.telegram.ui.Components.uj0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.yy0 e;
    public org.telegram.ui.Components.mb0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public lb0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.ir w;
    public org.telegram.ui.Components.t00 x;
    public final int y;

    public PasscodeActivity(int i7) {
        super(null);
        this.E = 0;
        this.F = 0;
        this.T = new fi0(this, 5);
        this.y = i7;
    }

    public static /* synthetic */ void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.ib0 ib0Var, int i7) {
        int value = ib0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.gz.y = 0;
        } else if (value == 1) {
            org.telegram.messenger.gz.y = 60;
        } else if (value == 2) {
            org.telegram.messenger.gz.y = org.telegram.messenger.ns.X4;
        } else if (value == 3) {
            org.telegram.messenger.gz.y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.gz.y = 18000;
        }
        passcodeActivity.b.g(i7);
        org.telegram.messenger.m10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i7) {
        if (view.isEnabled()) {
            if (i7 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131751433, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131751432, null);
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751431, null), new zr(passcodeActivity, 29));
                t1Var.show();
                org.telegram.ui.ActionBar.q6.U((TextView) t1Var.d(-1), org.telegram.ui.ActionBar.j6.q7, null);
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
                String M02 = org.telegram.messenger.hd.M0(2131753800, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = M02;
                org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(passcodeActivity.getParentActivity(), null);
                ib0Var.setMinValue(0);
                int i11 = 4;
                ib0Var.setMaxValue(4);
                int i12 = org.telegram.messenger.gz.y;
                if (i12 == 0) {
                    ib0Var.setValue(0);
                } else if (i12 == 60) {
                    ib0Var.setValue(1);
                } else if (i12 == 300) {
                    ib0Var.setValue(2);
                } else if (i12 == 3600) {
                    ib0Var.setValue(3);
                } else if (i12 == 18000) {
                    ib0Var.setValue(4);
                }
                ib0Var.setFormatter(new t70(i11));
                alertDialog$Builder2.o(ib0Var);
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131751354, null), new ai.q1(passcodeActivity, ib0Var, i7, 13));
                passcodeActivity.showDialog(t1Var2);
                return;
            }
            if (i7 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.gz.D = !org.telegram.messenger.gz.D;
                org.telegram.messenger.m10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.D);
                return;
            }
            if (i7 == passcodeActivity.O) {
                org.telegram.messenger.gz.A = !org.telegram.messenger.gz.A;
                org.telegram.messenger.m10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.A);
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.n0, Boolean.FALSE);
                if (org.telegram.messenger.gz.A) {
                    return;
                }
                org.telegram.ui.Components.t4.r0(passcodeActivity, null, org.telegram.messenger.hd.M0(2131745844, null), null);
                return;
            }
            if (i7 == passcodeActivity.K) {
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean z10 = !x10.K();
                if (x10.m != z10) {
                    x10.m = z10;
                    try {
                        org.telegram.ui.Wallet.l0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x10.m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.l0.k("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.m10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(x10.K());
                return;
            }
            if (i7 == passcodeActivity.L) {
                org.telegram.ui.Wallet.l0 x11 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean J = x11.J();
                boolean z11 = !J;
                di.t7 t7Var = new di.t7(7, view, J);
                org.telegram.ui.Wallet.p0 p0Var = x11.c;
                if (p0Var == null) {
                    t7Var.a(Boolean.FALSE);
                } else {
                    org.telegram.ui.Wallet.p0.h.execute(new ai.k2(p0Var, p0Var.l(), z11, new org.telegram.ui.Wallet.k(t7Var, i10), 4));
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.e2 p0() {
        return !org.telegram.messenger.gz.s.isEmpty() ? new PasscodeActivity(2) : new g(6);
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
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.b)).c(15) == 0) {
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
        if (((org.telegram.messenger.h0) getMessagesController().y7.j0.b).c) {
            int i11 = this.Q;
            this.J = i11;
            this.Q = i11 + 2;
            this.K = i11 + 1;
            if (org.telegram.ui.Wallet.p0.i(org.telegram.messenger.t0.b)) {
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
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
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i7;
        org.telegram.ui.ActionBar.z0 z0Var;
        lx lxVar = new lx(this, 21);
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        if (w4Var != null) {
            w4Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(lxVar);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setAllowOverlayTitle(false);
            this.actionBar.setActionBarMenuOnItemClick(lxVar);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = this.y;
        int i12 = 1;
        if (i11 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, c8.ja.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        ii0 ii0Var = new ii0(this, context, frameLayout, i10);
        ii0Var.setDelegate(new ya0(i12, this));
        this.fragmentView = ii0Var;
        ii0Var.addView(frameLayout, c8.ja.l(1.0f, -1, 0));
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(context);
        this.w = irVar;
        irVar.setVisibility(q0() ? 0 : 8);
        ii0Var.addView(this.w, c8.ja.o(-1, org.telegram.messenger.ns.G3));
        if (i11 != 0) {
            int i13 = 2;
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, kVar, null);
                    this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                    org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, org.telegram.ui.ActionBar.j6.G6, null);
                    org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.u8, null);
                    this.actionBar.setCastShadows(false);
                    org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
                    if (i11 == 1) {
                        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, R.drawable.ic_ab_other);
                        this.R = a10;
                        z0Var = a10.e(1, R.drawable.msg_permissions, org.telegram.messenger.hd.M0(2131747653, null));
                    } else {
                        z0Var = null;
                    }
                    this.actionBar.setActionBarMenuOnItemClick(new ji0(this, z0Var, z12 ? 1 : 0));
                }
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, c8.ja.c(-1.0f, -1));
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
                        i7 = 0;
                        fh0Var2.setVisibility(i7);
                        linearLayout.addView(this.a, c8.ja.r(120, 120, 1));
                        TextView textView = new TextView(context);
                        this.d = textView;
                        int i14 = org.telegram.ui.ActionBar.j6.G6;
                        org.telegram.ui.ActionBar.q6.U(textView, i14, null);
                        this.d.setTypeface(org.telegram.messenger.g0.o());
                        if (i11 == 1) {
                            this.d.setText(org.telegram.messenger.hd.M0(2131751112, null));
                        } else if (org.telegram.messenger.gz.s.isEmpty()) {
                            this.d.setText(org.telegram.messenger.hd.M0(2131751708, null));
                        } else {
                            this.d.setText(org.telegram.messenger.hd.M0(2131751119, null));
                        }
                        this.d.setTextSize(1, 18.0f);
                        this.d.setGravity(1);
                        linearLayout.addView(this.d, c8.ja.t(-2, -2, 1, 0, 16, 0, 0));
                        org.telegram.ui.Components.yy0 yy0Var = new org.telegram.ui.Components.yy0(context);
                        this.e = yy0Var;
                        yy0Var.setFactory(new yd0(context, i12));
                        this.e.setInAnimation(context, R.anim.alpha_in);
                        this.e.setOutAnimation(context, R.anim.alpha_out);
                        linearLayout.addView(this.e, c8.ja.t(-2, -2, 1, 20, 8, 20, 0));
                        TextView textView2 = new TextView(context);
                        textView2.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Fi, null);
                        textView2.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                        textView2.setGravity((!r0() ? 3 : 1) | 16);
                        int i15 = 13;
                        textView2.setOnClickListener(new g40(context, i15));
                        textView2.setVisibility(i11 != 2 ? 0 : 8);
                        textView2.setText(org.telegram.messenger.hd.M0(2131750593, null));
                        frameLayout2.addView(textView2, c8.ja.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                        h6.m.g(textView2);
                        TextView textView3 = new TextView(context);
                        this.r = textView3;
                        textView3.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.q6.U(this.r, org.telegram.ui.ActionBar.j6.D6, null);
                        this.r.setText(org.telegram.messenger.hd.M0(2131747652, null));
                        this.r.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.messenger.g0.Y3(this.r, false, 1.0f, true, false);
                        frameLayout2.addView(this.r, c8.ja.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                        org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(context, null);
                        this.f = mb0Var;
                        mb0Var.setText(org.telegram.messenger.hd.M0(2131751116, null));
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                        this.h = editTextBoldCursor;
                        editTextBoldCursor.setInputType(524417);
                        this.h.setTextSize(1, 18.0f);
                        org.telegram.ui.ActionBar.q6.U(this.h, i14, null);
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
                        org.telegram.ui.ActionBar.q6.v(this.h, org.telegram.ui.ActionBar.j6.l6, null);
                        this.h.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                        this.h.setCursorWidth(1.5f);
                        int L = org.telegram.messenger.g0.L(16.0f);
                        this.h.setPadding(L, L, L, L);
                        this.h.setOnFocusChangeListener(new ed(this, 10));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        linearLayout2.addView(this.h, c8.ja.l(1.0f, 0, -2));
                        ImageView imageView = new ImageView(context);
                        this.s = imageView;
                        imageView.setImageResource(R.drawable.msg_message);
                        org.telegram.ui.ActionBar.q6.s(this.s, org.telegram.ui.ActionBar.j6.H6, null, PorterDuff.Mode.SRC_ATOP);
                        ImageView imageView2 = this.s;
                        int i16 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.ActionBar.q6.Q(imageView2, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i16), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i16), getResourceProvider());
                        org.telegram.messenger.g0.Y3(this.s, i11 != 1 && this.F == 0, 0.1f, true, false);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        this.h.addTextChangedListener(new bi.v(i15, this, atomicBoolean));
                        this.s.setOnClickListener(new a90(7, this, atomicBoolean));
                        linearLayout2.addView(this.s, c8.ja.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                        this.f.addView(linearLayout2, c8.ja.c(-2.0f, -1));
                        frameLayout3.addView(this.f, c8.ja.t(-1, -2, 1, 32, 0, 32, 0));
                        this.h.setOnEditorActionListener(new fa(this, 8));
                        this.h.addTextChangedListener(new ki0(this, z11 ? 1 : 0));
                        this.h.setCustomSelectionActionModeCallback(new oi.y0(2));
                        lb0 lb0Var = new lb0(i13, context, this);
                        this.n = lb0Var;
                        lb0Var.b(4, 10);
                        for (dr drVar : this.n.f) {
                            drVar.setShowSoftInputOnFocusCompat(!q0());
                            drVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            drVar.setTextSize(1, 24.0f);
                            drVar.addTextChangedListener(new ki0(this, i12));
                            drVar.setOnFocusChangeListener(new di.o9(this, drVar, 3));
                        }
                        frameLayout3.addView(this.n, c8.ja.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                        linearLayout.addView(frameLayout3, c8.ja.t(-1, -2, 1, 0, 32, 0, 72));
                        if (i11 == 1) {
                            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
                        }
                        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
                        this.x = t00Var;
                        h6.m.g(t00Var);
                        frameLayout2.addView(this.x, c8.ja.d(56, 56.0f, (!org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                        this.x.setOnClickListener(new g40(this, 14));
                        org.telegram.ui.Components.y11 y11Var = new org.telegram.ui.Components.y11(context);
                        y11Var.setTransformType(1);
                        y11Var.setProgress(0.0f);
                        y11Var.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.O9, false));
                        y11Var.setDrawBackground(false);
                        this.x.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
                        this.x.addView(y11Var, c8.ja.e(56, 56, 17));
                        org.telegram.ui.Components.t00 t00Var2 = this.x;
                        t00Var2.a(t00Var2);
                        z0();
                    }
                }
                i7 = 8;
                fh0Var2.setVisibility(i7);
                linearLayout.addView(this.a, c8.ja.r(120, 120, 1));
                TextView textView4 = new TextView(context);
                this.d = textView4;
                int i142 = org.telegram.ui.ActionBar.j6.G6;
                org.telegram.ui.ActionBar.q6.U(textView4, i142, null);
                this.d.setTypeface(org.telegram.messenger.g0.o());
                if (i11 == 1) {
                }
                this.d.setTextSize(1, 18.0f);
                this.d.setGravity(1);
                linearLayout.addView(this.d, c8.ja.t(-2, -2, 1, 0, 16, 0, 0));
                org.telegram.ui.Components.yy0 yy0Var2 = new org.telegram.ui.Components.yy0(context);
                this.e = yy0Var2;
                yy0Var2.setFactory(new yd0(context, i12));
                this.e.setInAnimation(context, R.anim.alpha_in);
                this.e.setOutAnimation(context, R.anim.alpha_out);
                linearLayout.addView(this.e, c8.ja.t(-2, -2, 1, 20, 8, 20, 0));
                TextView textView22 = new TextView(context);
                textView22.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView22, org.telegram.ui.ActionBar.j6.Fi, null);
                textView22.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                textView22.setGravity((!r0() ? 3 : 1) | 16);
                int i152 = 13;
                textView22.setOnClickListener(new g40(context, i152));
                textView22.setVisibility(i11 != 2 ? 0 : 8);
                textView22.setText(org.telegram.messenger.hd.M0(2131750593, null));
                frameLayout2.addView(textView22, c8.ja.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                h6.m.g(textView22);
                TextView textView32 = new TextView(context);
                this.r = textView32;
                textView32.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(this.r, org.telegram.ui.ActionBar.j6.D6, null);
                this.r.setText(org.telegram.messenger.hd.M0(2131747652, null));
                this.r.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                org.telegram.messenger.g0.Y3(this.r, false, 1.0f, true, false);
                frameLayout2.addView(this.r, c8.ja.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                org.telegram.ui.Components.mb0 mb0Var2 = new org.telegram.ui.Components.mb0(context, null);
                this.f = mb0Var2;
                mb0Var2.setText(org.telegram.messenger.hd.M0(2131751116, null));
                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
                this.h = editTextBoldCursor2;
                editTextBoldCursor2.setInputType(524417);
                this.h.setTextSize(1, 18.0f);
                org.telegram.ui.ActionBar.q6.U(this.h, i142, null);
                this.h.setBackground(null);
                this.h.setMaxLines(1);
                this.h.setLines(1);
                this.h.setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
                this.h.setSingleLine(true);
                if (i11 != 1) {
                }
                this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.h.setTypeface(Typeface.DEFAULT);
                org.telegram.ui.ActionBar.q6.v(this.h, org.telegram.ui.ActionBar.j6.l6, null);
                this.h.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.h.setCursorWidth(1.5f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                this.h.setPadding(L2, L2, L2, L2);
                this.h.setOnFocusChangeListener(new ed(this, 10));
                LinearLayout linearLayout22 = new LinearLayout(context);
                linearLayout22.setOrientation(0);
                linearLayout22.setGravity(16);
                linearLayout22.addView(this.h, c8.ja.l(1.0f, 0, -2));
                ImageView imageView3 = new ImageView(context);
                this.s = imageView3;
                imageView3.setImageResource(R.drawable.msg_message);
                org.telegram.ui.ActionBar.q6.s(this.s, org.telegram.ui.ActionBar.j6.H6, null, PorterDuff.Mode.SRC_ATOP);
                ImageView imageView22 = this.s;
                int i162 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.ActionBar.q6.Q(imageView22, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i162), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i162), getResourceProvider());
                org.telegram.messenger.g0.Y3(this.s, i11 != 1 && this.F == 0, 0.1f, true, false);
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                this.h.addTextChangedListener(new bi.v(i152, this, atomicBoolean2));
                this.s.setOnClickListener(new a90(7, this, atomicBoolean2));
                linearLayout22.addView(this.s, c8.ja.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                this.f.addView(linearLayout22, c8.ja.c(-2.0f, -1));
                frameLayout3.addView(this.f, c8.ja.t(-1, -2, 1, 32, 0, 32, 0));
                this.h.setOnEditorActionListener(new fa(this, 8));
                this.h.addTextChangedListener(new ki0(this, z11 ? 1 : 0));
                this.h.setCustomSelectionActionModeCallback(new oi.y0(2));
                lb0 lb0Var2 = new lb0(i13, context, this);
                this.n = lb0Var2;
                lb0Var2.b(4, 10);
                while (r10 < r6) {
                }
                frameLayout3.addView(this.n, c8.ja.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                linearLayout.addView(frameLayout3, c8.ja.t(-1, -2, 1, 0, 32, 0, 72));
                if (i11 == 1) {
                }
                org.telegram.ui.Components.t00 t00Var3 = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
                this.x = t00Var3;
                h6.m.g(t00Var3);
                frameLayout2.addView(this.x, c8.ja.d(56, 56.0f, (!org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                this.x.setOnClickListener(new g40(this, 14));
                org.telegram.ui.Components.y11 y11Var2 = new org.telegram.ui.Components.y11(context);
                y11Var2.setTransformType(1);
                y11Var2.setProgress(0.0f);
                y11Var2.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.O9, false));
                y11Var2.setDrawBackground(false);
                this.x.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
                this.x.addView(y11Var2, c8.ja.e(56, 56, 17));
                org.telegram.ui.Components.t00 t00Var22 = this.x;
                t00Var22.a(t00Var22);
                z0();
            }
        } else {
            setHasOwnBackground(true);
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747657, null));
            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.a7));
            org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
            this.c = uj0Var;
            uj0Var.r1();
            this.c.setSectionsDrawBackground(true);
            this.c.setLayoutManager(new jg.b0(i12, z10 ? 1 : 0, 14));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, c8.ja.c(-1.0f, -1));
            org.telegram.ui.Components.uj0 uj0Var2 = this.c;
            l4 l4Var = new l4(12, this, context);
            this.b = l4Var;
            uj0Var2.setAdapter(l4Var);
            this.c.setOnItemClickListener(new h(this, 19));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                A0();
                l4 l4Var = this.b;
                if (l4Var != null) {
                    l4Var.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.a7));
        if (this.y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean hasForceLightStatusBar() {
        return this.y != 0;
    }

    @Override // org.telegram.ui.ActionBar.e2
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
            lb0 lb0Var = this.n;
            dr[] drVarArr = lb0Var.f;
            if (i7 >= drVarArr.length) {
                lb0Var.postDelayed(new jd0(12, this, runnable), (drVarArr.length * 75) + 350);
                return;
            } else {
                dr drVar = drVarArr[i7];
                drVar.postDelayed(new hi0(drVar, 0), i7 * 75);
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onConfigurationChanged(Configuration configuration) {
        dr[] drVarArr;
        int i7;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.fh0 fh0Var = this.a;
        if (fh0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x < point.y) {
                    i7 = 0;
                    fh0Var.setVisibility(i7);
                }
            }
            i7 = 8;
            fh0Var.setVisibility(i7);
        }
        lb0 lb0Var = this.n;
        if (lb0Var == null || (drVarArr = lb0Var.f) == null) {
            return;
        }
        for (dr drVar : drVarArr) {
            drVar.setShowSoftInputOnFocusCompat(!q0());
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.y != 0) {
            return true;
        }
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.n0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.n0);
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e2
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.j6.l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
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
        return (i7 == 1 && this.E == 1) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.gz.r == 1);
    }

    public final boolean s0() {
        int i7 = this.y;
        return (i7 == 1 && this.E == 0) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.gz.r == 0);
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
                drVar.A(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        org.telegram.messenger.g0.F3(s0() ? 10.0f : 4.0f, s0() ? this.n : this.f, new fi0(this, 3));
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
                org.telegram.messenger.g0.W3(this.r, true);
                for (dr drVar : this.n.f) {
                    drVar.setText("");
                }
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.n.removeCallbacks(this.T);
                this.n.post(new fi0(this, i11));
                return;
            }
            boolean isEmpty = org.telegram.messenger.gz.s.isEmpty();
            try {
                org.telegram.messenger.gz.w = new byte[16];
                Utilities.b.nextBytes(org.telegram.messenger.gz.w);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.gz.w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.gz.w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.gz.s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.gz.A = true;
            org.telegram.messenger.gz.r = this.E;
            org.telegram.messenger.gz.y();
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
            long j3 = org.telegram.messenger.gz.t;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.hd.a0("TooManyTries", null, 2131744036, org.telegram.messenger.hd.G(Math.max(1, (int) Math.ceil(j3 / 1000.0d)), "Seconds", new Object[0])), 0).show();
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
            if (!org.telegram.messenger.gz.g(code)) {
                org.telegram.messenger.gz.r();
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
            org.telegram.messenger.gz.v = 0;
            org.telegram.messenger.gz.y();
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

    @Override // org.telegram.ui.ActionBar.e2
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
        this.d.setText(org.telegram.messenger.hd.M0(2131751815, null));
        this.e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747656, null)));
        this.G = s0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (dr drVar : this.n.f) {
            drVar.setText("");
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
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z10 ? org.telegram.ui.Components.er.f : org.telegram.ui.Components.qs.e);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new z20(3, this, z10));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.V = (m90) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.n.f[0].requestFocus();
            if (q0()) {
                return;
            }
            org.telegram.messenger.g0.J3(this.n.f[0]);
            return;
        }
        if (r0()) {
            this.h.requestFocus();
            org.telegram.messenger.g0.J3(this.h);
        }
    }

    public final void z0() {
        String charSequence;
        int i7 = this.y;
        if (i7 == 2) {
            charSequence = org.telegram.messenger.hd.M0(2131751111, null);
        } else if (i7 == 3) {
            charSequence = org.telegram.messenger.hd.M0(2131743193, null);
        } else if (this.F == 0) {
            charSequence = org.telegram.messenger.hd.M0(this.E == 0 ? 2131751707 : 2131751706, null);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        int i10 = 1;
        boolean z10 = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (i7 == 2) {
            this.e.a(org.telegram.messenger.hd.M0(2131751111, null), z10, false);
        } else if (i7 == 3) {
            this.e.setText(org.telegram.messenger.hd.M0(2131743193, null));
        } else if (this.F == 0) {
            this.e.a(org.telegram.messenger.hd.M0(this.E == 0 ? 2131751707 : 2131751706, null), z10, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.Y3(this.n, true, 1.0f, true, z10);
            org.telegram.messenger.g0.Y3(this.f, false, 1.0f, true, z10);
        } else if (r0()) {
            org.telegram.messenger.g0.Y3(this.n, false, 1.0f, true, z10);
            org.telegram.messenger.g0.Y3(this.f, true, 1.0f, true, z10);
        }
        if (r0()) {
            gi0 gi0Var = new gi0(this, z10, i10);
            this.U = gi0Var;
            org.telegram.messenger.g0.i3(gi0Var, 3000L);
        } else {
            this.x.e(false, z10);
        }
        w0(q0(), z10);
        y0();
    }
}
