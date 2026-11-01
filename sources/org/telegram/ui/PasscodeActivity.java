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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class PasscodeActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
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
    public org.telegram.ui.ActionBar.t0 Q;
    public boolean R;
    public final jj0 S;
    public kj0 T;
    public pa0 U;
    public y01 V;
    public org.telegram.ui.Components.fi0 a;
    private int autoLockRow;
    public fg.j b;
    public org.telegram.ui.Components.uk0 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.b01 e;
    public org.telegram.ui.Components.ec0 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public tc0 n;
    public TextView r;
    public ImageView s;
    public org.telegram.ui.Components.lr w;
    public org.telegram.ui.Components.f10 x;
    public final int y;

    public PasscodeActivity(int i10) {
        super(null);
        this.D = 0;
        this.E = 0;
        this.S = new jj0(this, 5);
        this.y = i10;
    }

    public static /* synthetic */ void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.ac0 ac0Var, int i10) {
        int value = ac0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.uz.y = 0;
        } else if (value == 1) {
            org.telegram.messenger.uz.y = 60;
        } else if (value == 2) {
            org.telegram.messenger.uz.y = org.telegram.messenger.at.X4;
        } else if (value == 3) {
            org.telegram.messenger.uz.y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.uz.y = 18000;
        }
        passcodeActivity.b.g(i10);
        org.telegram.messenger.e20.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131751434, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131751433, null);
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751432, null), new st(passcodeActivity, 29));
                x1Var.show();
                org.telegram.ui.ActionBar.a7.V((TextView) x1Var.d(-1), org.telegram.ui.ActionBar.t6.q7, null);
                return;
            }
            if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
                return;
            }
            int i11 = 3;
            int i12 = 0;
            if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String L02 = org.telegram.messenger.dd.L0(2131753800, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                x1Var2.R = L02;
                org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(passcodeActivity.getParentActivity(), null);
                ac0Var.setMinValue(0);
                ac0Var.setMaxValue(4);
                int i13 = org.telegram.messenger.uz.y;
                if (i13 == 0) {
                    ac0Var.setValue(0);
                } else if (i13 == 60) {
                    ac0Var.setValue(1);
                } else if (i13 == 300) {
                    ac0Var.setValue(2);
                } else if (i13 == 3600) {
                    ac0Var.setValue(3);
                } else if (i13 == 18000) {
                    ac0Var.setValue(4);
                }
                ac0Var.setFormatter(new org.telegram.ui.Components.a21(18));
                alertDialog$Builder2.o(ac0Var);
                alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131751355, null), new ag.b0(passcodeActivity, ac0Var, i10, 13));
                passcodeActivity.showDialog(x1Var2);
                return;
            }
            if (i10 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.uz.D = !org.telegram.messenger.uz.D;
                org.telegram.messenger.e20.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.D);
                return;
            }
            if (i10 == passcodeActivity.N) {
                org.telegram.messenger.uz.A = !org.telegram.messenger.uz.A;
                org.telegram.messenger.e20.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.uz.A);
                org.telegram.messenger.at.e().k(org.telegram.messenger.at.n0, Boolean.FALSE);
                if (org.telegram.messenger.uz.A) {
                    return;
                }
                org.telegram.ui.Components.s4.t0(passcodeActivity, null, org.telegram.messenger.dd.L0(2131745861, null), null);
                return;
            }
            if (i10 == passcodeActivity.J) {
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(passcodeActivity.currentAccount);
                boolean z10 = !x10.K();
                if (x10.m != z10) {
                    x10.m = z10;
                    try {
                        org.telegram.ui.Wallet.k0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x10.m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.k0.k("failed to save prefs", e);
                    }
                }
                org.telegram.messenger.e20.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.t8) view).setChecked(x10.K());
                return;
            }
            if (i10 == passcodeActivity.K) {
                org.telegram.ui.Wallet.k0 x11 = org.telegram.ui.Wallet.k0.x(passcodeActivity.currentAccount);
                boolean J = x11.J();
                boolean z11 = !J;
                nc ncVar = new nc(i11, view, J);
                org.telegram.ui.Wallet.p0 p0Var = x11.c;
                if (p0Var == null) {
                    ncVar.a(Boolean.FALSE);
                } else {
                    org.telegram.ui.Wallet.p0.h.execute(new org.telegram.messenger.video.o(p0Var, p0Var.l(), z11, new org.telegram.ui.Wallet.k(ncVar, i12), 3));
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.k2 p0() {
        return !org.telegram.messenger.uz.s.isEmpty() ? new PasscodeActivity(2) : new f(6);
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
            if (new android.support.v4.media.session.a0(new androidx.biometric.s(org.telegram.messenger.w0.b, 0)).h(15) == 0) {
                Typeface typeface = org.telegram.messenger.i0.a;
                if (((KeyguardManager) org.telegram.messenger.w0.b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i10 = this.P;
                    this.P = i10 + 1;
                    this.fingerprintRow = i10;
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
        int i11 = this.P;
        this.autoLockRow = i11;
        this.P = i11 + 2;
        this.H = i11 + 1;
        if (((org.telegram.messenger.j0) getMessagesController().y7.j0.b).c) {
            int i12 = this.P;
            this.I = i12;
            this.P = i12 + 2;
            this.J = i12 + 1;
            if (org.telegram.ui.Wallet.p0.i(org.telegram.messenger.w0.b)) {
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

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e3 A[LOOP:0: B:54:0x03e1->B:55:0x03e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i10;
        org.telegram.ui.ActionBar.b1 b1Var;
        s60 s60Var = new s60(this, 11);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        if (i5Var != null) {
            i5Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(s60Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setAllowOverlayTitle(false);
            this.actionBar.setActionBarMenuOnItemClick(s60Var);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i12 = this.y;
        int i13 = 1;
        if (i12 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, w7.b6.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        mj0 mj0Var = new mj0(this, context, frameLayout, i11);
        mj0Var.setDelegate(new gc0(i13, this));
        this.fragmentView = mj0Var;
        mj0Var.addView(frameLayout, w7.b6.l(1.0f, -1, 0));
        org.telegram.ui.Components.lr lrVar = new org.telegram.ui.Components.lr(context);
        this.w = lrVar;
        lrVar.setVisibility(q0() ? 0 : 8);
        mj0Var.addView(this.w, w7.b6.o(-1, org.telegram.messenger.at.G3));
        int i14 = 13;
        if (i12 == 0) {
            setHasOwnBackground(true);
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747673, null));
            frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.a7));
            org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
            this.c = uk0Var;
            uk0Var.r1();
            this.c.setSectionsDrawBackground(true);
            this.c.setLayoutManager(new dh.f(i13, z10 ? 1 : 0, i14));
            this.c.setVerticalScrollBarEnabled(false);
            this.c.setItemAnimator(null);
            this.c.setLayoutAnimation(null);
            frameLayout2.addView(this.c, w7.b6.c(-1.0f, -1));
            org.telegram.ui.Components.uk0 uk0Var2 = this.c;
            fg.j jVar = new fg.j(i14, this, context);
            this.b = jVar;
            uk0Var2.setAdapter(jVar);
            this.c.setOnItemClickListener(new g(this, 19));
        } else if (i12 == 1 || i12 == 2 || i12 == 3) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, lVar, null);
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, org.telegram.ui.ActionBar.t6.G6, null);
                org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.u8, null);
                this.actionBar.setCastShadows(false);
                org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
                if (i12 == 1) {
                    org.telegram.ui.ActionBar.t0 a2 = p5.a(0, R.drawable.ic_ab_other);
                    this.Q = a2;
                    b1Var = a2.e(1, R.drawable.msg_permissions, org.telegram.messenger.dd.L0(2131747669, null));
                } else {
                    b1Var = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new nj0(this, b1Var, z12 ? 1 : 0));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, w7.b6.c(-1.0f, -1));
            org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(context);
            this.a = fi0Var;
            fi0Var.setFocusable(false);
            this.a.f(R.raw.tsv_setup_intro, 120, 120, null);
            this.a.setAutoRepeat(false);
            this.a.d();
            org.telegram.ui.Components.fi0 fi0Var2 = this.a;
            if (!org.telegram.messenger.i0.O1()) {
                Point point = org.telegram.messenger.i0.q;
                if (point.x < point.y) {
                    i10 = 0;
                    fi0Var2.setVisibility(i10);
                    linearLayout.addView(this.a, w7.b6.r(120, 120, 1));
                    TextView textView = new TextView(context);
                    this.d = textView;
                    int i15 = org.telegram.ui.ActionBar.t6.G6;
                    org.telegram.ui.ActionBar.a7.V(textView, i15, null);
                    this.d.setTypeface(org.telegram.messenger.i0.o());
                    if (i12 == 1) {
                        this.d.setText(org.telegram.messenger.dd.L0(2131751113, null));
                    } else if (org.telegram.messenger.uz.s.isEmpty()) {
                        this.d.setText(org.telegram.messenger.dd.L0(2131751709, null));
                    } else {
                        this.d.setText(org.telegram.messenger.dd.L0(2131751120, null));
                    }
                    this.d.setTextSize(1, 18.0f);
                    this.d.setGravity(1);
                    linearLayout.addView(this.d, w7.b6.t(-2, -2, 1, 0, 16, 0, 0));
                    org.telegram.ui.Components.b01 b01Var = new org.telegram.ui.Components.b01(context);
                    this.e = b01Var;
                    b01Var.setFactory(new cf0(context, i13));
                    this.e.setInAnimation(context, R.anim.alpha_in);
                    this.e.setOutAnimation(context, R.anim.alpha_out);
                    linearLayout.addView(this.e, w7.b6.t(-2, -2, 1, 20, 8, 20, 0));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Ci, null);
                    textView2.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
                    textView2.setGravity((!r0() ? 3 : 1) | 16);
                    textView2.setOnClickListener(new e50(context, i14));
                    textView2.setVisibility(i12 != 2 ? 0 : 8);
                    textView2.setText(org.telegram.messenger.dd.L0(2131750594, null));
                    frameLayout2.addView(textView2, w7.b6.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    li.k.i(textView2);
                    TextView textView3 = new TextView(context);
                    this.r = textView3;
                    textView3.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.a7.V(this.r, org.telegram.ui.ActionBar.t6.D6, null);
                    this.r.setText(org.telegram.messenger.dd.L0(2131747668, null));
                    this.r.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
                    org.telegram.messenger.i0.Y3(this.r, false, 1.0f, true, false);
                    frameLayout2.addView(this.r, w7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
                    org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, null);
                    this.f = ec0Var;
                    ec0Var.setText(org.telegram.messenger.dd.L0(2131751117, null));
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.h = editTextBoldCursor;
                    editTextBoldCursor.setInputType(524417);
                    this.h.setTextSize(1, 18.0f);
                    org.telegram.ui.ActionBar.a7.V(this.h, i15, null);
                    this.h.setBackground(null);
                    this.h.setMaxLines(1);
                    this.h.setLines(1);
                    this.h.setGravity(!org.telegram.messenger.dd.X ? 5 : 3);
                    this.h.setSingleLine(true);
                    int i16 = 6;
                    if (i12 != 1) {
                        this.E = 0;
                        this.h.setImeOptions(5);
                    } else {
                        this.E = 1;
                        this.h.setImeOptions(6);
                    }
                    this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.h.setTypeface(Typeface.DEFAULT);
                    org.telegram.ui.ActionBar.a7.w(this.h, org.telegram.ui.ActionBar.t6.l6, null);
                    this.h.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                    this.h.setCursorWidth(1.5f);
                    int L = org.telegram.messenger.i0.L(16.0f);
                    this.h.setPadding(L, L, L, L);
                    this.h.setOnFocusChangeListener(new od(this, 10));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(16);
                    linearLayout2.addView(this.h, w7.b6.l(1.0f, 0, -2));
                    ImageView imageView = new ImageView(context);
                    this.s = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    org.telegram.ui.ActionBar.a7.t(this.s, org.telegram.ui.ActionBar.t6.H6, null, PorterDuff.Mode.SRC_ATOP);
                    ImageView imageView2 = this.s;
                    int i17 = org.telegram.ui.ActionBar.t6.i6;
                    org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i17), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i17), getResourceProvider());
                    org.telegram.messenger.i0.Y3(this.s, i12 != 1 && this.E == 0, 0.1f, true, false);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    this.h.addTextChangedListener(new ag.u2(this, atomicBoolean, z11 ? 1 : 0, i16));
                    this.s.setOnClickListener(new vu(23, this, atomicBoolean));
                    linearLayout2.addView(this.s, w7.b6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    this.f.addView(linearLayout2, w7.b6.c(-2.0f, -1));
                    frameLayout3.addView(this.f, w7.b6.t(-1, -2, 1, 32, 0, 32, 0));
                    this.h.setOnEditorActionListener(new ha(this, 8));
                    this.h.addTextChangedListener(new oj0(this, 0));
                    this.h.setCustomSelectionActionModeCallback(new bi.i1(2));
                    tc0 tc0Var = new tc0(this, context, 2);
                    this.n = tc0Var;
                    tc0Var.b(4, 10);
                    for (bs bsVar : this.n.f) {
                        bsVar.setShowSoftInputOnFocusCompat(!q0());
                        bsVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        bsVar.setTextSize(1, 24.0f);
                        bsVar.addTextChangedListener(new oj0(this, 1));
                        bsVar.setOnFocusChangeListener(new g51(this, bsVar, 3));
                    }
                    frameLayout3.addView(this.n, w7.b6.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
                    linearLayout.addView(frameLayout3, w7.b6.t(-1, -2, 1, 0, 32, 0, 72));
                    if (i12 == 1) {
                        frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
                    }
                    org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
                    this.x = f10Var;
                    li.k.i(f10Var);
                    frameLayout2.addView(this.x, w7.b6.d(56, 56.0f, (!org.telegram.messenger.dd.X ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
                    this.x.setOnClickListener(new e50(this, 14));
                    org.telegram.ui.Components.w21 w21Var = new org.telegram.ui.Components.w21(context);
                    w21Var.setTransformType(1);
                    w21Var.setProgress(0.0f);
                    w21Var.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
                    w21Var.setDrawBackground(false);
                    this.x.setContentDescription(org.telegram.messenger.dd.L0(2131748267, null));
                    this.x.addView(w21Var, w7.b6.e(56, 56, 17));
                    org.telegram.ui.Components.f10 f10Var2 = this.x;
                    f10Var2.a(f10Var2);
                    z0();
                }
            }
            i10 = 8;
            fi0Var2.setVisibility(i10);
            linearLayout.addView(this.a, w7.b6.r(120, 120, 1));
            TextView textView4 = new TextView(context);
            this.d = textView4;
            int i152 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(textView4, i152, null);
            this.d.setTypeface(org.telegram.messenger.i0.o());
            if (i12 == 1) {
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, w7.b6.t(-2, -2, 1, 0, 16, 0, 0));
            org.telegram.ui.Components.b01 b01Var2 = new org.telegram.ui.Components.b01(context);
            this.e = b01Var2;
            b01Var2.setFactory(new cf0(context, i13));
            this.e.setInAnimation(context, R.anim.alpha_in);
            this.e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.e, w7.b6.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView22 = new TextView(context);
            textView22.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.Ci, null);
            textView22.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
            textView22.setGravity((!r0() ? 3 : 1) | 16);
            textView22.setOnClickListener(new e50(context, i14));
            textView22.setVisibility(i12 != 2 ? 0 : 8);
            textView22.setText(org.telegram.messenger.dd.L0(2131750594, null));
            frameLayout2.addView(textView22, w7.b6.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            li.k.i(textView22);
            TextView textView32 = new TextView(context);
            this.r = textView32;
            textView32.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(this.r, org.telegram.ui.ActionBar.t6.D6, null);
            this.r.setText(org.telegram.messenger.dd.L0(2131747668, null));
            this.r.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
            org.telegram.messenger.i0.Y3(this.r, false, 1.0f, true, false);
            frameLayout2.addView(this.r, w7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0(context, null);
            this.f = ec0Var2;
            ec0Var2.setText(org.telegram.messenger.dd.L0(2131751117, null));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor2;
            editTextBoldCursor2.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.a7.V(this.h, i152, null);
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(!org.telegram.messenger.dd.X ? 5 : 3);
            this.h.setSingleLine(true);
            int i162 = 6;
            if (i12 != 1) {
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            org.telegram.ui.ActionBar.a7.w(this.h, org.telegram.ui.ActionBar.t6.l6, null);
            this.h.setCursorSize(org.telegram.messenger.i0.L(20.0f));
            this.h.setCursorWidth(1.5f);
            int L2 = org.telegram.messenger.i0.L(16.0f);
            this.h.setPadding(L2, L2, L2, L2);
            this.h.setOnFocusChangeListener(new od(this, 10));
            LinearLayout linearLayout22 = new LinearLayout(context);
            linearLayout22.setOrientation(0);
            linearLayout22.setGravity(16);
            linearLayout22.addView(this.h, w7.b6.l(1.0f, 0, -2));
            ImageView imageView3 = new ImageView(context);
            this.s = imageView3;
            imageView3.setImageResource(R.drawable.msg_message);
            org.telegram.ui.ActionBar.a7.t(this.s, org.telegram.ui.ActionBar.t6.H6, null, PorterDuff.Mode.SRC_ATOP);
            ImageView imageView22 = this.s;
            int i172 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.ActionBar.a7.R(imageView22, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i172), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i172), getResourceProvider());
            org.telegram.messenger.i0.Y3(this.s, i12 != 1 && this.E == 0, 0.1f, true, false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            this.h.addTextChangedListener(new ag.u2(this, atomicBoolean2, z11 ? 1 : 0, i162));
            this.s.setOnClickListener(new vu(23, this, atomicBoolean2));
            linearLayout22.addView(this.s, w7.b6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f.addView(linearLayout22, w7.b6.c(-2.0f, -1));
            frameLayout3.addView(this.f, w7.b6.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new ha(this, 8));
            this.h.addTextChangedListener(new oj0(this, 0));
            this.h.setCustomSelectionActionModeCallback(new bi.i1(2));
            tc0 tc0Var2 = new tc0(this, context, 2);
            this.n = tc0Var2;
            tc0Var2.b(4, 10);
            while (r10 < r9) {
            }
            frameLayout3.addView(this.n, w7.b6.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, w7.b6.t(-1, -2, 1, 0, 32, 0, 72));
            if (i12 == 1) {
            }
            org.telegram.ui.Components.f10 f10Var3 = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
            this.x = f10Var3;
            li.k.i(f10Var3);
            frameLayout2.addView(this.x, w7.b6.d(56, 56.0f, (!org.telegram.messenger.dd.X ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.x.setOnClickListener(new e50(this, 14));
            org.telegram.ui.Components.w21 w21Var2 = new org.telegram.ui.Components.w21(context);
            w21Var2.setTransformType(1);
            w21Var2.setProgress(0.0f);
            w21Var2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
            w21Var2.setDrawBackground(false);
            this.x.setContentDescription(org.telegram.messenger.dd.L0(2131748267, null));
            this.x.addView(w21Var2, w7.b6.e(56, 56, 17));
            org.telegram.ui.Components.f10 f10Var22 = this.x;
            f10Var22.a(f10Var22);
            z0();
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                A0();
                fg.j jVar = this.b;
                if (jVar != null) {
                    jVar.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.a7));
        if (this.y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean hasForceLightStatusBar() {
        return this.y != 0;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return this.y == 0;
    }

    public final void o0(Runnable runnable) {
        if (!s0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            tc0 tc0Var = this.n;
            bs[] bsVarArr = tc0Var.f;
            if (i10 >= bsVarArr.length) {
                tc0Var.postDelayed(new if0(9, this, runnable), (bsVarArr.length * 75) + 350);
                return;
            } else {
                bs bsVar = bsVarArr[i10];
                bsVar.postDelayed(new lj0(bsVar, 0), i10 * 75);
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        bs[] bsVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.fi0 fi0Var = this.a;
        if (fi0Var != null) {
            if (!org.telegram.messenger.i0.O1()) {
                Point point = org.telegram.messenger.i0.q;
                if (point.x < point.y) {
                    i10 = 0;
                    fi0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            fi0Var.setVisibility(i10);
        }
        tc0 tc0Var = this.n;
        if (tc0Var == null || (bsVarArr = tc0Var.f) == null) {
            return;
        }
        for (bs bsVar : bsVarArr) {
            bsVar.setShowSoftInputOnFocusCompat(!q0());
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.y != 0) {
            return true;
        }
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.n0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.n0);
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.i0.C2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.b;
        if (jVar != null) {
            jVar.f();
        }
        if (this.y != 0 && !q0()) {
            org.telegram.messenger.i0.h3(new jj0(this, 6), 200L);
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        if (q0()) {
            org.telegram.messenger.i0.v1(this.fragmentView);
            org.telegram.messenger.i0.a3(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.l6, null);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.y == 0) {
            return;
        }
        y0();
    }

    public final boolean q0() {
        if (!s0() || this.y == 0 || org.telegram.messenger.i0.Q1()) {
            return false;
        }
        Point point = org.telegram.messenger.i0.q;
        return point.x < point.y && !org.telegram.messenger.i0.C1();
    }

    public final boolean r0() {
        int i10 = this.y;
        return (i10 == 1 && this.D == 1) || ((i10 == 2 || i10 == 3) && org.telegram.messenger.uz.r == 1);
    }

    public final boolean s0() {
        int i10 = this.y;
        return (i10 == 1 && this.D == 0) || ((i10 == 2 || i10 == 3) && org.telegram.messenger.uz.r == 0);
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
            for (bs bsVar : this.n.f) {
                bsVar.z(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        org.telegram.messenger.i0.F3(s0() ? 10.0f : 4.0f, s0() ? this.n : this.f, new jj0(this, 3));
    }

    public final void u0() {
        if (r0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        String code = s0() ? this.n.getCode() : this.h.getText().toString();
        int i10 = this.y;
        int i11 = 0;
        if (i10 == 1) {
            if (!this.F.equals(code)) {
                org.telegram.messenger.i0.W3(this.r, true);
                for (bs bsVar : this.n.f) {
                    bsVar.setText("");
                }
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.n.removeCallbacks(this.S);
                this.n.post(new jj0(this, 0));
                return;
            }
            boolean isEmpty = org.telegram.messenger.uz.s.isEmpty();
            try {
                org.telegram.messenger.uz.w = new byte[16];
                Utilities.b.nextBytes(org.telegram.messenger.uz.w);
                byte[] bytes = this.F.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.uz.w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.uz.w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.uz.s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            org.telegram.messenger.uz.A = true;
            org.telegram.messenger.uz.r = this.D;
            org.telegram.messenger.uz.y();
            this.h.clearFocus();
            org.telegram.messenger.i0.v1(this.h);
            for (bs bsVar2 : this.n.f) {
                bsVar2.clearFocus();
                org.telegram.messenger.i0.v1(bsVar2);
            }
            this.w.setEditText(null);
            o0(new kj0(this, isEmpty, i11));
            return;
        }
        if (i10 == 2 || i10 == 3) {
            long j10 = org.telegram.messenger.uz.t;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.dd.a0("TooManyTries", null, 2131744061, org.telegram.messenger.dd.G(Math.max(1, (int) Math.ceil(j10 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (bs bsVar3 : this.n.f) {
                    bsVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
                return;
            }
            if (!org.telegram.messenger.uz.g(code)) {
                org.telegram.messenger.uz.r();
                this.h.setText("");
                for (bs bsVar4 : this.n.f) {
                    bsVar4.setText("");
                }
                if (s0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
                return;
            }
            org.telegram.messenger.uz.v = 0;
            org.telegram.messenger.uz.y();
            this.h.clearFocus();
            org.telegram.messenger.i0.v1(this.h);
            bs[] bsVarArr = this.n.f;
            int length2 = bsVarArr.length;
            while (i11 < length2) {
                bs bsVar5 = bsVarArr[i11];
                bsVar5.clearFocus();
                org.telegram.messenger.i0.v1(bsVar5);
                i11++;
            }
            this.w.setEditText(null);
            if (i10 == 3) {
                o0(new jj0(this, 1));
            } else {
                o0(new jj0(this, 2));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return this.y == 0;
    }

    public final void v0() {
        if ((this.D == 1 && this.h.getText().length() == 0) || (this.D == 0 && this.n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.Q;
        if (t0Var != null) {
            t0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.dd.L0(2131751815, null));
        this.e.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131747672, null)));
        this.F = s0() ? this.n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (bs bsVar : this.n.f) {
            bsVar.setText("");
        }
        y0();
        this.E = 1;
    }

    public final void w0(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.i0.v1(this.fragmentView);
            org.telegram.messenger.i0.a3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.i0.C2(getParentActivity(), this.classGuid);
        }
        if (!z11) {
            this.w.setVisibility(z10 ? 0 : 8);
            this.w.setAlpha(z10 ? 1.0f : 0.0f);
            this.w.setTranslationY(z10 ? 0.0f : org.telegram.messenger.i0.L(230.0f));
            this.fragmentView.requestLayout();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z10 ? org.telegram.ui.Components.gr.f : org.telegram.ui.Components.vs.e);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new org.telegram.ui.Components.ha0(18, this, z10));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.U = (pa0) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.n.f[0].requestFocus();
            if (q0()) {
                return;
            }
            org.telegram.messenger.i0.J3(this.n.f[0]);
            return;
        }
        if (r0()) {
            this.h.requestFocus();
            org.telegram.messenger.i0.J3(this.h);
        }
    }

    public final void z0() {
        String charSequence;
        int i10 = this.y;
        if (i10 == 2) {
            charSequence = org.telegram.messenger.dd.L0(2131751112, null);
        } else if (i10 == 3) {
            charSequence = org.telegram.messenger.dd.L0(2131743219, null);
        } else if (this.E == 0) {
            charSequence = org.telegram.messenger.dd.L0(this.D == 0 ? 2131751708 : 2131751707, null);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        int i11 = 1;
        boolean z10 = (this.e.getCurrentView().getText().equals(charSequence) || TextUtils.isEmpty(this.e.getCurrentView().getText())) ? false : true;
        if (i10 == 2) {
            this.e.a(org.telegram.messenger.dd.L0(2131751112, null), z10, false);
        } else if (i10 == 3) {
            this.e.setText(org.telegram.messenger.dd.L0(2131743219, null));
        } else if (this.E == 0) {
            this.e.a(org.telegram.messenger.dd.L0(this.D == 0 ? 2131751708 : 2131751707, null), z10, false);
        }
        if (s0()) {
            org.telegram.messenger.i0.Y3(this.n, true, 1.0f, true, z10);
            org.telegram.messenger.i0.Y3(this.f, false, 1.0f, true, z10);
        } else if (r0()) {
            org.telegram.messenger.i0.Y3(this.n, false, 1.0f, true, z10);
            org.telegram.messenger.i0.Y3(this.f, true, 1.0f, true, z10);
        }
        if (r0()) {
            kj0 kj0Var = new kj0(this, z10, i11);
            this.T = kj0Var;
            org.telegram.messenger.i0.h3(kj0Var, 3000L);
        } else {
            this.x.e(false, z10);
        }
        w0(q0(), z10);
        y0();
    }
}
