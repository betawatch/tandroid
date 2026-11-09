package fi;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import bi.ec;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gc;
import org.telegram.messenger.hf;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.we;
import org.telegram.messenger.ye;
import org.telegram.messenger.yr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class va implements ls {
    public static va F2;
    public final ia A0;
    public View A1;
    public boolean A2;
    public y9 B0;
    public td0 B1;
    public boolean B2;
    public c6 C0;
    public final sd0 C1;
    public da C2;
    public final bg.v0 D;
    public final q6 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final gb E0;
    public kd0 E1;
    public ValueAnimator E2;
    public qa F;
    public final hb F0;
    public md0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final gb H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final kb J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public e7 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public i3 M0;
    public long M1;
    public long N;
    public u0 N0;
    public boolean N1;
    public boolean O;
    public final g6 O0;
    public int O1;
    public final h2.f P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final o9 Q0;
    public boolean Q1;
    public z10 R;
    public final n2 R0;
    public boolean R1;
    public int S;
    public final n2 S0;
    public boolean S1;
    public int T;
    public final k3 T0;
    public float T1;
    public int U;
    public final k3 U0;
    public int U1;
    public boolean V;
    public final s71 V0;
    public boolean V1;
    public boolean W;
    public final m3 W0;
    public boolean W1;
    public boolean X;
    public final ja X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final fb Z0;
    public AnimatorSet Z1;
    public final di.b a;
    public int a0;
    public final jb a1;
    public boolean a2;
    public final Activity b;
    public int b0;
    public final s5 b1;
    public boolean b2;
    public final int c;
    public final RectF c0;
    public final la c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final n9 d1;
    public boolean d2;
    public boolean e;
    public final Path e0;
    public final t0 e1;
    public Runnable e2;
    public final WindowManager f;
    public int f0;
    public ah0 f1;
    public AnimatorSet f2;
    public int g0;
    public final dh0 g1;
    public a9 g2;
    public final WindowManager.LayoutParams h;
    public final ha h0;
    public ah0 h1;
    public boolean h2;
    public final FrameLayout i0;
    public ImageView i1;
    public AnimatorSet i2;
    public final LinearLayout j0;
    public final p5 j1;
    public ValueAnimator j2;
    public final FrameLayout k0;
    public final m3 k1;
    public boolean k2;
    public final bi.e5 l0;
    public final m3 l1;
    public v4.a0 l2;
    public final FrameLayout m0;
    public final m3 m1;
    public we m2;
    public final ua n;
    public final n2 n0;
    public final m3 n1;
    public ValueAnimator n2;
    public final x6 o0;
    public final t5 o1;
    public r1.g o2;
    public final org.telegram.ui.ActionBar.l5 p0;
    public final ib p1;
    public Boolean p2;
    public s8 q0;
    public p q1;
    public e9 q2;
    public final na r;
    public final org.telegram.ui.Components.y9 r0;
    public fa r1;
    public AnimatorSet r2;
    public final p2 s;
    public final x5 s0;
    public ga s1;
    public boolean s2;
    public final ec t0;
    public final fb t1;
    public int t2;
    public boolean u0;
    public final d u1;
    public ArrayList u2;
    public long v0;
    public x9 v1;
    public FrameLayout v2;
    public boolean w;
    public String w0;
    public sg.v0 w1;
    public boolean w2;
    public long x;
    public TLRPC.InputPeer x0;
    public View x1;
    public u8 x2;
    public ma y;
    public q8 y0;
    public View y1;
    public bg.m0 y2;
    public t z0;
    public View z1;
    public boolean z2;

    public va(Activity activity, int i7) {
        di.b bVar = new di.b();
        this.a = bVar;
        this.x = 0L;
        this.H = new RectF();
        int i10 = 1;
        this.M = true;
        this.P = new h2.f((int[]) null);
        this.c0 = new RectF();
        this.d0 = new RectF();
        this.e0 = new Path();
        new Rect();
        this.f0 = 0;
        this.g0 = -1;
        this.y0 = new q8();
        this.H1 = null;
        this.I1 = null;
        this.J1 = null;
        this.O1 = 0;
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.U1 = -3;
        this.W1 = false;
        r9 r9Var = new r9(this);
        this.d2 = true;
        this.k2 = true;
        this.t2 = -1;
        this.b = activity;
        this.c = i7;
        LaunchActivity launchActivity = LaunchActivity.G1;
        this.D = launchActivity != null ? new bg.v0(launchActivity, true) : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        org.telegram.messenger.g0.m(layoutParams);
        layoutParams.flags = -2013200128;
        int i11 = 16;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        ua uaVar = new ua(this, activity);
        this.n = uaVar;
        d9 d9Var = new d9(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(uaVar, d9Var);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        p2 p2Var = new p2(activity, windowManager, this.n, layoutParams);
        this.s = p2Var;
        p2Var.a(new ba(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        ua uaVar2 = this.n;
        na naVar = new na(this, activity);
        this.r = naVar;
        uaVar2.addView(naVar);
        na naVar2 = this.r;
        ha haVar = new ha(this, activity);
        this.h0 = haVar;
        naVar2.addView(haVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.r0 = new org.telegram.ui.Components.y9(this.h0);
        this.s0 = new x5();
        na naVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.i0 = frameLayout;
        naVar3.addView(frameLayout);
        na naVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.k0 = frameLayout2;
        naVar4.addView(frameLayout2);
        na naVar5 = this.r;
        int i12 = 4;
        bi.e5 e5Var = new bi.e5(i12, activity, this);
        this.l0 = e5Var;
        naVar5.addView(e5Var);
        int i13 = 8;
        this.l0.setVisibility(8);
        this.l0.setAlpha(0.0f);
        na naVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        naVar6.addView(frameLayout3);
        cc.a(this.n, new r7(2));
        ia iaVar = new ia(this, activity, this.r0, this.r, bVar);
        this.A0 = iaVar;
        ua uaVar3 = this.n;
        Objects.requireNonNull(uaVar3);
        iaVar.setCancelGestures(new di.f8(uaVar3, 29));
        this.A0.setResetState(new u8(this, 13));
        this.h0.addView(this.A0, c8.ha.e(-1, -1, qs.E1));
        this.A0.setOnClickListener(new w8(this, 12));
        ha haVar2 = this.h0;
        int i14 = this.J;
        haVar2.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
        ha haVar3 = this.h0;
        float L = org.telegram.messenger.g0.L(12.0f);
        bg.q0 q0Var = bg.u0.a;
        haVar3.setOutlineProvider(new bg.s0(0, L));
        this.h0.setClipToOutline(true);
        u8 u8Var = new u8(this, 14);
        sd0 sd0Var = new sd0(activity);
        sd0Var.a = new TextPaint(1);
        sd0Var.b = new TextPaint(1);
        xq xqVar = xq.h;
        sd0Var.s = new org.telegram.ui.Components.w5(sd0Var, 0L, 350L, xqVar);
        sd0Var.I = new pb0(sd0Var, i12);
        sd0Var.y = u8Var;
        this.C1 = sd0Var;
        ja jaVar = new ja(this, activity, this.r0, this.s0);
        this.X0 = jaVar;
        jaVar.setCollageView(this.A0);
        ja jaVar2 = this.X0;
        jaVar2.w = new u8(this, 15);
        jaVar2.setOnTapListener(new u8(this, i11));
        this.X0.setVisibility(8);
        ja jaVar3 = this.X0;
        jaVar3.N = new u8(this, 17);
        this.h0.addView(jaVar3, c8.ha.e(-1, -1, qs.E1));
        this.h0.addView(this.C1, c8.ha.e(-1, -1, qs.E1));
        ua uaVar4 = this.n;
        int i15 = 2;
        la laVar = new la(this, activity, uaVar4, uaVar4, this.r, bVar, this.r0);
        this.c1 = laVar;
        laVar.setAccount(i7);
        this.c1.setUiBlurBitmap(new di.a1(24));
        cc.a(this.l0, new ch.v(this, i12));
        this.c1.setOnHeightUpdate(new v8(this, 13));
        this.c1.setOnPeriodUpdate(new v8(this, i12));
        long j3 = this.N;
        if (j3 != 0) {
            this.c1.setDialogId(j3);
        }
        this.c1.setOnPremiumHint(new v8(this, 5));
        this.c1.setOnKeyboardOpen(new v8(this, 6));
        ec ecVar = new ec(i15, activity, this);
        this.t0 = ecVar;
        this.r.addView(ecVar);
        fb fbVar = new fb(activity, this.r, this.h0, bVar, this.r0);
        this.Z0 = fbVar;
        fbVar.setOnTimelineClick(new u8(this, 10));
        this.Z0.setOnHeightChange(new u8(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f10 = 388;
        frameLayout4.addView(this.Z0, c8.ha.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        jb jbVar = new jb(activity);
        this.a1 = jbVar;
        jbVar.setVisibility(8);
        this.a1.a(false);
        this.Y0.addView(this.a1, c8.ha.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.l0.addView(this.Y0, c8.ha.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.l0.addView(this.c1, c8.ha.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        fb fbVar2 = new fb(activity, this.r, this.h0, bVar, this.r0);
        this.t1 = fbVar2;
        fbVar2.X0 = true;
        fbVar2.setVisibility(8);
        this.t1.setAlpha(0.0f);
        this.l0.addView(this.t1, c8.ha.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        n9 n9Var = new n9(this, activity, bVar, this.r0);
        this.d1 = n9Var;
        n9Var.setVisibility(8);
        this.l0.addView(this.d1, c8.ha.e(-1, -2, 85));
        n2 n2Var = new n2(activity);
        this.n0 = n2Var;
        n2Var.setContentDescription(id.M0(2131754878, null));
        n2 n2Var2 = this.n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        n2Var2.setScaleType(scaleType);
        this.n0.setImageResource(R.drawable.msg_photo_back);
        n2 n2Var3 = this.n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        n2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.n0.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.n0.setOnClickListener(new w8(this, i10));
        this.i0.addView(this.n0, c8.ha.e(56, 56, 51));
        this.s.a(this.n0);
        x6 x6Var = new x6(activity, i7);
        this.o0 = x6Var;
        x6Var.a(false, false);
        this.o0.setOnClickListener(new bi.r(15, this, activity));
        this.i0.addView(this.o0, c8.ha.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.p0 = l5Var;
        l5Var.setTextSize(20);
        this.p0.setGravity(19);
        this.p0.setTextColor(-1);
        this.p0.setTypeface(org.telegram.messenger.g0.o());
        this.p0.l(id.M0(2131746353, null), false);
        this.p0.getPaint().setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.p0.setAlpha(0.0f);
        this.p0.setVisibility(8);
        this.p0.setEllipsizeByGradient(true);
        this.p0.setRightPadding(org.telegram.messenger.g0.L(144.0f));
        this.i0.addView(this.p0, c8.ha.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.j0.setGravity(5);
        this.i0.addView(this.j0, c8.ha.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        v8 v8Var = new v8(this, 7);
        ua uaVar5 = this.n;
        t0 t0Var = new t0(activity);
        t0Var.x = true;
        t0Var.y = true;
        t0Var.h = v8Var;
        t0Var.a = i7;
        t0Var.b = uaVar5;
        t0Var.setScaleType(scaleType);
        t0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        t0Var.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        t0Var.setVisibility(8);
        t0Var.setAlpha(0.0f);
        t0Var.setOnClickListener(new ah.d(t0Var, 22));
        t0Var.f = new cp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        t0Var.d();
        this.e1 = t0Var;
        m3 m3Var = new m3(activity, 1);
        m3Var.o(1.0f, -71.0f);
        m3Var.d = 2000L;
        m3Var.U = false;
        m3Var.H.r(true, false);
        this.k1 = m3Var;
        m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.i0.addView(this.k1, c8.ha.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        dh0 dh0Var = new dh0(activity);
        this.g1 = dh0Var;
        dh0Var.setScaleType(scaleType);
        dh0 dh0Var2 = this.g1;
        e7 e7Var = this.K1;
        dh0Var2.setImageResource((e7Var == null || !e7Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.g1.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.g1.setOnClickListener(new w8(this, i15));
        this.g1.setVisibility(8);
        this.g1.setAlpha(0.0f);
        p5 p5Var = new p5(activity);
        this.j1 = p5Var;
        p5Var.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.j1.setVisibility(8);
        this.j1.setAlpha(0.0f);
        this.j1.setOnClickListener(new w8(this, 3));
        this.j0.addView(this.j1, c8.ha.r(46, 56, 53));
        this.j0.addView(this.g1, c8.ha.r(46, 56, 53));
        this.j0.addView(this.e1, c8.ha.e(46, 56, 53));
        gb gbVar = new gb(activity);
        this.E0 = gbVar;
        gbVar.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.E0.setOnClickListener(new w8(this, 4));
        this.E0.setOnLongClickListener(new s4(this, i10));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.s.a(this.E0);
        this.i0.addView(this.E0, c8.ha.e(56, 56, 53));
        hb hbVar = new hb(activity);
        this.F0 = hbVar;
        hbVar.setContentDescription(id.M0(2131754886, null));
        this.F0.setOnClickListener(new w8(this, 5));
        boolean q10 = b1.q(activity);
        this.F0.setVisibility(q10 ? 0 : 8);
        this.F0.setAlpha(q10 ? 1.0f : 0.0f);
        this.s.a(this.F0);
        this.i0.addView(this.F0, c8.ha.e(56, 56, 53));
        z zVar = new z(activity);
        this.G0 = zVar;
        zVar.setContentDescription(id.M0(2131754895, null));
        this.G0.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        if (this.z0 == null) {
            this.z0 = (t) t.a().get(6);
        }
        this.G0.setOnClickListener(new w8(this, 6));
        this.G0.a(new u(this.z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.s.a(this.G0);
        this.i0.addView(this.G0, c8.ha.e(56, 56, 53));
        gb gbVar2 = new gb(activity);
        this.H0 = gbVar2;
        gbVar2.setContentDescription(id.M0(2131754894, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new w8(this, 7));
        this.s.a(this.H0);
        this.i0.addView(this.H0, c8.ha.e(56, 56, 53));
        y yVar = new y(activity, this.s);
        this.I0 = yVar;
        yVar.a.v0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new v8(this, i13));
        this.i0.addView(this.I0, c8.ha.e(-1, 56, 53));
        m3 m3Var2 = new m3(activity, 1);
        m3Var2.o(1.0f, -20.0f);
        m3Var2.d = 5000L;
        m3Var2.k(true);
        m3Var2.u(id.M0(2131744713, null));
        m3Var2.q0 = new ai.m0(13);
        this.l1 = m3Var2;
        m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.i0.addView(this.l1, c8.ha.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        m3 m3Var3 = new m3(activity, 2);
        m3Var3.o(0.0f, 28.0f);
        m3Var3.d = 5000L;
        m3Var3.r(true);
        this.m1 = m3Var3;
        this.i0.addView(m3Var3, c8.ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        m3 m3Var4 = new m3(activity, 1);
        m3Var4.o(1.0f, -20.0f);
        m3Var4.d = 5000L;
        m3Var4.u(id.M0(2131744704, null));
        this.n1 = m3Var4;
        m3Var4.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.i0.addView(this.n1, c8.ha.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        kb kbVar = new kb(activity);
        Paint paint = new Paint(1);
        kbVar.a = paint;
        Paint paint2 = new Paint(1);
        kbVar.b = paint2;
        kbVar.e = new org.telegram.ui.Components.w5(kbVar, 0L, 250L, xqVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        kbVar.c = i6Var;
        i6Var.n(0.3f, 250L, xqVar);
        i6Var.w(org.telegram.messenger.g0.L(13.0f));
        i6Var.u(-1);
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.setCallback(kbVar);
        i6Var.b = 1;
        kbVar.a(0L, false);
        this.J0 = kbVar;
        h0(false, false);
        this.i0.addView(this.J0, c8.ha.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.J0);
        MediaController.O(0);
        g6 g6Var = new g6(activity);
        this.O0 = g6Var;
        g6Var.setDelegate(r9Var);
        g6 g6Var2 = this.O0;
        boolean z9 = this.O1 == 1;
        g6Var2.n0 = -1.0f;
        g6Var2.o0 = z9;
        g6Var2.invalidate();
        this.k0.addView(this.O0, c8.ha.e(-1, 100, 87));
        this.s.a(this.O0);
        this.O0.e(true, this.A0.j() ? this.A0.getFilledProgress() : 0.0f);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.i(id.M0(2131748788, null), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.k0.addView(this.P0, c8.ha.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new w8(this, 8));
        m3 m3Var5 = new m3(activity, 3);
        m3Var5.r(true);
        m3Var5.u(id.M0(2131744711, null));
        m3Var5.h = org.telegram.messenger.g0.L(320.0f);
        m3Var5.d = 5000L;
        m3Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = m3Var5;
        this.k0.addView(m3Var5, c8.ha.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        s71 s71Var = new s71(activity);
        this.V0 = s71Var;
        s71Var.M = false;
        s71Var.setAlpha(0.0f);
        this.k0.addView(this.V0, c8.ha.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new d9(this, 4));
        s71 s71Var2 = this.V0;
        this.T1 = 0.0f;
        s71Var2.b(false, 0.0f);
        int i16 = 12;
        q6 q6Var = new q6(activity, i7, new u8(this, i16));
        this.D0 = q6Var;
        q6Var.c = new v8(this, 9);
        this.k0.addView(q6Var, c8.ha.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        o9 o9Var = new o9(this, activity);
        this.Q0 = o9Var;
        o9Var.setOnSwitchModeListener(new v8(this, 10));
        this.Q0.setOnSwitchingModeListener(new v8(this, 11));
        this.m0.addView(this.Q0, c8.ha.e(-1, 48, 55));
        this.s.a(this.Q0);
        n2 n2Var4 = new n2(activity);
        this.R0 = n2Var4;
        n2Var4.setContentDescription(id.M0(2131754752, null));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.m0.addView(this.R0, c8.ha.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.R0);
        this.R0.setOnClickListener(new w8(this, 9));
        n2 n2Var5 = new n2(activity);
        this.S0 = n2Var5;
        n2Var5.setContentDescription(id.M0(2131748790, null));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
        this.m0.addView(this.S0, c8.ha.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new w8(this, 10));
        k3 k3Var = new k3(activity);
        this.T0 = k3Var;
        this.m0.addView(k3Var, c8.ha.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.T0);
        k3 k3Var2 = new k3(activity);
        this.U0 = k3Var2;
        k3Var2.a.t(id.M0(2131744703, null), false, true);
        k3Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, c8.ha.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.u1 = dVar2;
        dVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.u1.i(id.M0(2131744689, null), false, true);
        this.u1.setOnClickListener(new w8(this, 11));
        this.m0.addView(this.u1, c8.ha.d(-1, 48.0f, qs.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        s5 s5Var = new s5(activity);
        s5Var.b = new ArrayList();
        s5Var.e = true;
        s5Var.h = true;
        View view = new View(activity);
        s5Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        s5Var.addView(view, c8.ha.e(-1, -1, qs.E1));
        s5Var.a(0, R.drawable.media_draw, id.M0(2131754814, null));
        s5Var.a(2, R.drawable.msg_photo_sticker, id.M0(2131754756, null));
        s5Var.a(1, R.drawable.msg_photo_text2, id.M0(2131754807, null));
        s5Var.a(3, R.drawable.media_crop, id.M0(2131751699, null));
        s5Var.a(4, R.drawable.msg_photo_settings, id.M0(2131754811, null));
        String M0 = id.M0(2131745640, null);
        s5Var.d = M0;
        s5Var.e = true;
        r5 r5Var = new r5(s5Var, activity, M0, true);
        s5Var.c = r5Var;
        r5Var.setContentDescription(id.M0(2131745640, null));
        s5Var.addView(s5Var.c, c8.ha.c(-2.0f, -2));
        s5Var.e();
        this.b1 = s5Var;
        s5Var.setVisibility(8);
        this.b1.setOnClickListener(new v8(this, i16));
        this.m0.addView(this.b1, c8.ha.e(-1, 52, 23));
        ib ibVar = new ib(activity);
        this.p1 = ibVar;
        ibVar.setAlpha(0.0f);
        this.p1.setVisibility(8);
        this.h0.addView(this.p1, c8.ha.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        t5 t5Var = new t5(activity, i7, bVar);
        this.o1 = t5Var;
        this.h0.addView(t5Var, c8.ha.e(-1, -1, qs.E1));
        l0(false);
    }

    public static va D(Activity activity, int i7) {
        va vaVar = F2;
        if (vaVar != null && (vaVar.b != activity || vaVar.c != i7)) {
            vaVar.p(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new va(activity, i7);
        }
        return F2;
    }

    public static void Z(boolean z9) {
        qp.e1().edit().putBoolean("stories_camera", z9).apply();
    }

    public static void a(va vaVar) {
        y9 y9Var = vaVar.B0;
        if (y9Var == null || y9Var.getTextureView() == null) {
            vaVar.c2 = false;
            return;
        }
        Bitmap bitmap = vaVar.B0.getTextureView().getBitmap();
        if (bitmap == null) {
            vaVar.c2 = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float f10 = 0.0f;
        for (int i7 = 0; i7 < 10; i7++) {
            int i10 = 0;
            while (i10 < 10) {
                i10++;
                f10 += org.telegram.messenger.g0.B(bitmap.getPixel((i7 + 1) * width, i10 * height));
            }
        }
        float f11 = f10 / 100.0f;
        bitmap.recycle();
        vaVar.c2 = f11 < 0.22f;
    }

    public static void b(va vaVar) {
        ValueAnimator valueAnimator = vaVar.j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            vaVar.j2 = null;
        }
        int i7 = 0;
        vaVar.k2 = false;
        na naVar = vaVar.r;
        float f10 = naVar.a;
        float f11 = naVar.b;
        naVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        vaVar.j2 = ofFloat;
        ofFloat.addUpdateListener(new k9(vaVar, f10, f11, i7));
        vaVar.j2.setDuration(340L);
        vaVar.j2.setInterpolator(xq.h);
        vaVar.j2.addListener(new u9(vaVar, i7));
        vaVar.j2.start();
    }

    public static boolean c(va vaVar) {
        Activity activity = vaVar.b;
        if (activity == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, qs.x1);
        return false;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable h = jg.g.h(context, R.drawable.story_camera);
        int L = org.telegram.messenger.g0.L(35.0f);
        int i7 = -L;
        h.setBounds(i7 / 4, i7, (L / 4) * 3, 0);
        spannableString.setSpan(new ca(h, h), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        va vaVar = F2;
        if (vaVar != null) {
            vaVar.p(false);
        }
        F2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        e7 e7Var = this.K1;
        if (e7Var != null) {
            return e7Var.r();
        }
        return 1;
    }

    public final String B() {
        y9 y9Var = this.B0;
        if (y9Var == null || y9Var.getCameraSession() == null) {
            return null;
        }
        if (!this.B0.isFrontface() || this.B0.getCameraSession().hasFlashModes()) {
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        o();
        return (String) this.u2.get(this.t2);
    }

    public final u0 C() {
        if (this.N0 == null) {
            u0 u0Var = new u0(this.b);
            this.N0 = u0Var;
            this.k0.addView(u0Var, c8.ha.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String E() {
        y9 y9Var = this.B0;
        if (y9Var == null || y9Var.getCameraSession() == null) {
            return null;
        }
        if (!this.B0.isFrontface() || this.B0.getCameraSession().hasFlashModes()) {
            return this.B0.getCameraSession().getNextFlashMode();
        }
        o();
        ArrayList arrayList = this.u2;
        return (String) arrayList.get(this.t2 + 1 >= arrayList.size() ? 0 : this.t2 + 1);
    }

    public final ImageView F() {
        if (this.i1 == null) {
            ah0 ah0Var = new ah0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.h1 = ah0Var;
            ah0Var.h = true;
            e7 e7Var = this.K1;
            int i7 = 0;
            if (e7Var == null || !e7Var.y0) {
                ah0Var.P(0);
                this.h1.M(0);
            } else {
                ah0Var.M(35);
                this.h1.P(36);
            }
            this.h1.Z = true;
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.J9, this.a);
            this.h1.Q(w02, "Sunny");
            this.h1.Q(w02, "Path 6");
            this.h1.Q(w02, "Path");
            this.h1.Q(w02, "Path 5");
            this.h1.o();
            ImageView imageView = new ImageView(this.b);
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.i1.setBackground(org.telegram.ui.ActionBar.l6.h0(553648127, 1, -1));
            this.i1.setOnClickListener(new w8(this, i7));
            this.i1.setVisibility(8);
            this.i1.setImageDrawable(this.h1);
            this.i1.setAlpha(0.0f);
            this.j0.addView(this.i1, 0, c8.ha.r(46, 56, 53));
        }
        return this.i1;
    }

    public final void G() {
        x9 x9Var = this.v1;
        if (x9Var == null) {
            return;
        }
        this.v2 = null;
        x9Var.getTopLayout().setAlpha(0.0f);
        this.v1.getTopLayout().setTranslationY(-org.telegram.messenger.g0.L(16.0f));
        this.v1.getBottomLayout().setAlpha(0.0f);
        this.v1.getBottomLayout().setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.v1.getWeightChooserView().setTranslationX(-org.telegram.messenger.g0.L(32.0f));
        this.v1.setVisibility(8);
    }

    public final boolean H() {
        return !this.a2 && (this.A0.j() ? this.A0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean I() {
        i3 i3Var;
        if (this.W || (i3Var = this.M0) == null) {
            return false;
        }
        return i3Var.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) org.telegram.messenger.g0.q.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)));
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(int i7, boolean z9) {
        e7 e7Var;
        e7 e7Var2;
        d dVar;
        org.telegram.ui.ActionBar.l5 l5Var;
        int i10;
        int i11;
        float L;
        ImageView imageView;
        e7 e7Var3;
        e7 e7Var4;
        e7 e7Var5;
        e7 e7Var6;
        y9 y9Var;
        int i12 = this.f0;
        if (i7 == i12) {
            return;
        }
        this.f0 = i7;
        AnimatorSet animatorSet = this.i2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        N(i12, i7);
        s5 s5Var = this.b1;
        if (s5Var != null) {
            s5Var.b(i7 == 1, z9);
        }
        y yVar = this.I0;
        h0(i7 == 0 && this.O1 == 1 && !yVar.e && !H(), z9);
        if (i7 != 1) {
            this.a1.a(z9);
        }
        b0(this.n0, !yVar.e, z9);
        b0(this.E0, (this.a2 || i7 != 0 || yVar.e || this.Y1 == null || H()) ? false : true, z9);
        boolean z10 = this.a2;
        ia iaVar = this.A0;
        b0(this.F0, (z10 || i7 != 0 || (y9Var = this.B0) == null || !y9Var.a || yVar.e || iaVar.j()) ? false : true, true);
        b0(this.G0, (this.a2 || i7 != 0 || yVar.e) ? false : true, z9);
        l0(z9);
        t0 t0Var = this.e1;
        p5 p5Var = this.j1;
        dh0 dh0Var = this.g1;
        fb fbVar = this.t1;
        fb fbVar2 = this.Z0;
        d dVar2 = this.u1;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.p0;
        la laVar = this.c1;
        k3 k3Var = this.U0;
        k3 k3Var2 = this.T0;
        q6 q6Var = this.D0;
        ja jaVar = this.X0;
        bi.e5 e5Var = this.l0;
        o9 o9Var = this.Q0;
        g6 g6Var = this.O0;
        if (!z9) {
            y9 y9Var2 = this.B0;
            if (y9Var2 != null) {
                y9Var2.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            }
            jaVar.setAlpha(((i7 != 1 || iaVar.j()) && i7 != 2) ? 0.0f : 1.0f);
            iaVar.setAlpha((i7 == 0 || (i7 == 1 && iaVar.j())) ? 1.0f : 0.0f);
            g6Var.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            g6Var.setTranslationY(i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            q6Var.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            o9Var.setAlpha((i7 != 0 || H()) ? 0.0f : 1.0f);
            o9Var.setTranslationY((i7 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            k3Var2.setAlpha((i7 == 0 && this.a2 && !H()) ? 1.0f : 0.0f);
            k3Var.setAlpha((i7 == 0 && !this.a2 && H()) ? 0.6f : 0.0f);
            e5Var.setAlpha((i7 == 1 || i7 == 2) ? 1.0f : 0.0f);
            e5Var.setTranslationY((i7 == 1 || i7 == 2) ? 0.0f : org.telegram.messenger.g0.L(12.0f));
            laVar.setAlpha(i7 == 2 ? 0.0f : 1.0f);
            dh0Var.setAlpha((i7 == 1 && this.O1 == 1) ? 1.0f : 0.0f);
            p5Var.setAlpha((i7 != 1 || (this.O1 != 1 && ((e7Var2 = this.K1) == null || TextUtils.isEmpty(e7Var2.y)))) ? 0.0f : 1.0f);
            int i13 = 1;
            t0Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.i1;
            if (imageView2 != null) {
                imageView2.setAlpha((i7 == 1 && (e7Var = this.K1) != null && e7Var.u) ? 1.0f : 0.0f);
                i13 = 1;
            }
            fbVar2.setAlpha(i7 == i13 ? 1.0f : 0.0f);
            fbVar.setAlpha(i7 == 2 ? 1.0f : 0.0f);
            l5Var2.setAlpha((i7 == i13 || i7 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i7 == 2 ? 1.0f : 0.0f);
            M(i12, i7);
            return;
        }
        this.i2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        y9 y9Var3 = this.B0;
        if (y9Var3 != null) {
            dVar = dVar2;
            l5Var = l5Var2;
            i10 = 1;
            arrayList.add(ObjectAnimator.ofFloat(y9Var3, (Property<y9, Float>) View.ALPHA, i7 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            l5Var = l5Var2;
            i10 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i10];
        fArr[0] = ((i7 != i10 || iaVar.j()) && i7 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(jaVar, (Property<ja, Float>) property, fArr));
        float[] fArr2 = new float[i10];
        fArr2[0] = (i7 == 0 || (i7 == i10 && iaVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(iaVar, (Property<ia, Float>) property, fArr2));
        float[] fArr3 = new float[i10];
        fArr3[0] = i7 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(g6Var, (Property<g6, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i10];
        fArr4[0] = i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(g6Var, (Property<g6, Float>) property2, fArr4));
        float[] fArr5 = new float[i10];
        fArr5[0] = i7 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(q6Var, (Property<q6, Float>) property, fArr5));
        float[] fArr6 = new float[i10];
        fArr6[0] = (i7 != 0 || H()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(o9Var, (Property<o9, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(o9Var, (Property<o9, Float>) property2, (i7 != 0 || H()) ? org.telegram.messenger.g0.L(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(k3Var2, (Property<k3, Float>) property, (i7 == 0 && this.a2 && !H()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property, (i7 == 0 && !this.a2 && H()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) property, ((i7 == 1 && ((e7Var6 = this.K1) == null || e7Var6.J0 == 0)) || i7 == 2) ? 1.0f : 0.0f));
        if (i7 == 1 && ((e7Var5 = this.K1) == null || e7Var5.J0 == 0)) {
            i11 = 2;
        } else {
            i11 = 2;
            if (i7 != 2) {
                L = org.telegram.messenger.g0.L(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) property2, L));
                arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property, i7 != i11 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property, (i7 != 1 || i7 == i11) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i7 != i11 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(fbVar2, (Property<fb, Float>) property, i7 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) property, i7 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) property, (i7 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(p5Var, (Property<p5, Float>) property, (i7 == 1 || (this.O1 != 1 && ((e7Var4 = this.K1) == null || TextUtils.isEmpty(e7Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property, i7 != 1 ? 1.0f : 0.0f));
                imageView = this.i1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i7 == 1 && (e7Var3 = this.K1) != null && e7Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<s71, Float>) property, 0.0f));
                this.i2.playTogether(arrayList);
                this.i2.addListener(new t9(this, i12, i7, 0));
                this.i2.setDuration(460L);
                this.i2.setInterpolator(xq.h);
                this.i2.start();
            }
        }
        L = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) property2, L));
        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property, i7 != i11 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property, (i7 != 1 || i7 == i11) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i7 != i11 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(fbVar2, (Property<fb, Float>) property, i7 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) property, i7 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) property, (i7 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(p5Var, (Property<p5, Float>) property, (i7 == 1 || (this.O1 != 1 && ((e7Var4 = this.K1) == null || TextUtils.isEmpty(e7Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property, i7 != 1 ? 1.0f : 0.0f));
        imageView = this.i1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<s71, Float>) property, 0.0f));
        this.i2.playTogether(arrayList);
        this.i2.addListener(new t9(this, i12, i7, 0));
        this.i2.setDuration(460L);
        this.i2.setInterpolator(xq.h);
        this.i2.start();
    }

    public final void K(Runnable runnable, long j3) {
        if (this.S1 || this.K1 == null) {
            return;
        }
        a9 a9Var = this.g2;
        if (a9Var != null) {
            org.telegram.messenger.g0.r(a9Var);
        }
        this.h2 = true;
        this.S1 = true;
        this.g2 = new a9(this, runnable, 1);
        this.X0.setAlpha(0.0f);
        this.X0.setVisibility(0);
        this.X0.n(this.K1, this.g2, j3);
        this.X0.p(this.K1, false);
        org.telegram.messenger.g0.i3(this.g2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fa, code lost:
    
        if (r0.k == false) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L() {
        e7 e7Var;
        e7 e7Var2;
        e7 e7Var3;
        x9 x9Var;
        e7 e7Var4;
        x9 x9Var2;
        x9 x9Var3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            la laVar = this.c1;
            if (laVar != null && laVar.N1) {
                laVar.M1 = false;
                laVar.z(false, false);
                return false;
            }
            if (this.Q1) {
                g6 g6Var = this.O0;
                if (g6Var.r0) {
                    g6Var.r0 = false;
                    g6Var.v0 = SystemClock.elapsedRealtime();
                    g6Var.u0 = true;
                    ((r9) g6Var.a).e(false);
                    g6Var.J.c(false);
                    g6Var.K.c(false);
                    g6Var.L.c(false);
                    g6Var.invalidate();
                    return false;
                }
            } else if (!this.P1 && !laVar.p()) {
                n9 n9Var = this.d1;
                if (n9Var.M) {
                    n9Var.c(false, true);
                    return false;
                }
                i3 i3Var = this.M0;
                if (i3Var != null) {
                    org.telegram.ui.ActionBar.r0 r0Var = i3Var.G;
                    if (r0Var == null || !r0Var.v()) {
                        e(false);
                        this.m2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = r0Var.getSearchField();
                    if (i3Var.w.c()) {
                        org.telegram.messenger.g0.v1(searchField);
                        return false;
                    }
                    i3Var.y.z(r0Var.T(true));
                    return false;
                }
                if (this.g0 != 0 || (x9Var3 = this.v1) == null || !x9Var3.v0()) {
                    if (this.g0 > -1) {
                        k0(-1, false, true);
                        return false;
                    }
                    int i7 = this.f0;
                    ia iaVar = this.A0;
                    if (i7 == 0) {
                        ArrayList arrayList = iaVar.h;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            if (((d0) obj).n != null) {
                                iaVar.c();
                                l0(true);
                                return false;
                            }
                        }
                    }
                    if (this.f0 == 1 && (((e7Var2 = this.K1) == null || (!e7Var2.n && !e7Var2.u)) && !this.u0)) {
                        if (e7Var2 != null && e7Var2.g && ((x9Var2 = this.v1) == null || !x9Var2.r0())) {
                            e7 e7Var5 = this.K1;
                            if (!e7Var5.j) {
                            }
                        }
                        x9 x9Var4 = this.v1;
                        if (x9Var4 == null || !x9Var4.v0()) {
                            if (this.v0 == 0 && (((this.L1 && !iaVar.j() && (((x9Var = this.v1) == null || !x9Var.r0()) && ((e7Var4 = this.K1) == null || e7Var4.Z0 == null))) || !this.b1.h) && (((e7Var3 = this.K1) == null || !e7Var3.g || (!e7Var3.n && !e7Var3.u)) && !this.u0 && (e7Var3 == null || !e7Var3.o)))) {
                                J(0, true);
                                return false;
                            }
                            if (this.v0 != 0) {
                                p(true);
                                return false;
                            }
                            Activity activity = this.b;
                            di.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                            String M0 = id.M0(2131751405, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            u1Var.T = id.M0(2131747278, null);
                            e7 e7Var6 = this.K1;
                            if (e7Var6 != null && !e7Var6.g && !e7Var6.o) {
                                alertDialog$Builder.i(id.M0(e7Var6.c ? 2131744653 : 2131744485, null), new d9(this, 7));
                            }
                            e7 e7Var7 = this.K1;
                            alertDialog$Builder.k(id.M0((e7Var7 == null || !e7Var7.c || e7Var7.g) ? 2131751406 : 2131744686, null), new d9(this, 8));
                            alertDialog$Builder.h(id.M0(2131752589, null), null);
                            u1Var.show();
                            View d = u1Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.l6.q7;
                                org.telegram.ui.ActionBar.s6.U((TextView) d, i11, bVar);
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.l6.a0(i0.a.o(org.telegram.ui.ActionBar.l6.w0(i11, bVar), 51), 6, 6);
                                org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i11, 51);
                                d.setBackground(a02);
                                org.telegram.ui.ActionBar.s6.j(d, a02, null, g10, bVar);
                            }
                        }
                    }
                    if (this.f0 != 2 || (e7Var = this.K1) == null || e7Var.b0) {
                        p(true);
                        return true;
                    }
                    W();
                    J(1, true);
                    return false;
                }
            }
        }
        return false;
    }

    public final void M(int i7, int i10) {
        int i11;
        if (i7 == 0) {
            u(false);
            this.O0.setVisibility(8);
            this.V0.setVisibility(8);
            this.Q0.setVisibility(8);
            g(false, false);
            c0(false);
        }
        if (i7 == 2) {
            this.t1.setVisibility(8);
            this.l0.setVisibility(i10 == 1 ? 0 : 8);
            this.c1.setVisibility(8);
            this.u1.setVisibility(8);
        }
        if (i7 == 1) {
            this.b1.setVisibility(8);
            this.l0.setVisibility(i10 == 2 ? 0 : 8);
            this.g1.setVisibility(8);
            this.j1.setVisibility(8);
            this.e1.setVisibility(8);
            ImageView imageView = this.i1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.X0.setVisibility(i10 == 2 ? 0 : 8);
            this.Z0.setVisibility(8);
            if (i10 != 2) {
                y();
                x();
            }
            this.p0.setVisibility(i10 == 2 ? 0 : 8);
            v();
            this.p1.setAlpha(0.0f);
            this.p1.setVisibility(8);
            this.a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i10 == 1) {
            e7 e7Var = this.K1;
            if (e7Var == null || !e7Var.n) {
                t();
                G();
            }
            sd0 sd0Var = this.C1;
            if (sd0Var != null) {
                sd0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            e7 e7Var2 = this.K1;
            this.a1.setVisibility((e7Var2 == null || e7Var2.h0 < 30000) ? 8 : 0);
            this.l0.setAlpha(1.0f);
            this.l0.setTranslationY(0.0f);
            e7 e7Var3 = this.K1;
            this.c1.setVisibility((e7Var3 == null || e7Var3.J0 == 0) ? 0 : 8);
        }
        if (i10 == 0 && this.V1) {
            C().setVisibility(0);
            u0 C = C();
            C.r.e(true, 0.0f);
            C.a(true);
            di.f8 f8Var = C.h;
            if (f8Var != null) {
                org.telegram.messenger.g0.r(f8Var);
            }
            di.f8 f8Var2 = new di.f8(C, 15);
            C.h = f8Var2;
            org.telegram.messenger.g0.i3(f8Var2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        sd0 sd0Var2 = this.C1;
        if (sd0Var2 != null) {
            sd0Var2.setAllowTouch(i10 == 1 && ((i11 = this.g0) == -1 || i11 == 1));
        }
        la laVar = this.c1;
        if (laVar != null) {
            laVar.d0 = i10 != 1;
        }
        if (i10 == 1) {
            int i12 = this.c;
            ui.b0(i12).B(0);
            ui.b0(i12).V0(0, false, true, false);
            ui.b0(i12).V0(2, false, true, false);
            di.z6 P1 = qp.s1(i12).P1();
            if (P1.Q == 0) {
                P1.S();
            }
            qp.s1(i12).P1().U();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04ca  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(int i7, int i10) {
        ia iaVar;
        ?? r82;
        CharSequence charSequence;
        int i11;
        int i12;
        SpannableStringBuilder append;
        String str;
        e7 e7Var;
        boolean z9;
        String str2;
        y5 y5Var;
        l60 l60Var;
        sd0 sd0Var;
        boolean z10;
        m3 m3Var;
        x9 x9Var;
        m3 m3Var2;
        e7 e7Var2;
        e7 e7Var3;
        File file;
        ab abVar;
        boolean z11;
        CharSequence charSequence2;
        boolean z12;
        e7 e7Var4;
        di.t6 o4;
        e7 e7Var5;
        i51 textureView;
        e7 e7Var6;
        ia iaVar2 = this.A0;
        if (i10 == 0) {
            Y(false);
            g6 g6Var = this.O0;
            g6Var.setVisibility(0);
            if (g6Var != null) {
                g6Var.g(false);
            }
            this.Q0.setVisibility(0);
            s71 s71Var = this.V0;
            s71Var.setVisibility(0);
            s71Var.setAlpha(0.0f);
            this.J0.a(0L, true);
            e7 e7Var7 = this.K1;
            if (e7Var7 != null) {
                e7Var7.i(false);
                this.K1 = null;
            }
            if (iaVar2 != null) {
                iaVar2.c();
                g6Var.e(false, 0.0f);
            }
        }
        if (i7 == 0) {
            d0(null);
            a0(new u8(this, 18));
            u0 u0Var = this.N0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            this.W0.f(true);
            m3 m3Var3 = this.l1;
            if (m3Var3 != null) {
                m3Var3.f(true);
            }
        }
        fb fbVar = this.Z0;
        bi.e5 e5Var = this.l0;
        dh0 dh0Var = this.g1;
        s5 s5Var = this.b1;
        ja jaVar = this.X0;
        la laVar = this.c1;
        org.telegram.ui.ActionBar.l5 l5Var = this.p0;
        int i13 = this.c;
        if (i10 == 1 || i7 == 1) {
            e7 e7Var8 = i10 == 1 ? this.K1 : null;
            t0 t0Var = this.e1;
            t0Var.setEntry(e7Var8);
            int i14 = this.O1;
            iaVar = iaVar2;
            p5 p5Var = this.j1;
            if (i14 == 1) {
                dh0Var.setVisibility(0);
                e7 e7Var9 = this.K1;
                e0(e7Var9 != null && e7Var9.Y, false);
                p5Var.setVisibility(0);
                jaVar.x(-9982, false);
                ((ie0) p5Var.c).a(jaVar.k(), false);
                l5Var.setRightPadding(org.telegram.messenger.g0.L(144.0f));
                r82 = 0;
            } else {
                e7 e7Var10 = this.K1;
                if (e7Var10 == null || TextUtils.isEmpty(e7Var10.y)) {
                    r82 = 0;
                    l5Var.setRightPadding(org.telegram.messenger.g0.L(48.0f));
                } else {
                    dh0Var.setVisibility(8);
                    r82 = 0;
                    p5Var.setVisibility(0);
                    ((ie0) p5Var.c).a(true, false);
                    l5Var.setRightPadding(org.telegram.messenger.g0.L(48.0f));
                }
            }
            t0Var.setVisibility(r82);
            e7 e7Var11 = this.K1;
            if (e7Var11 == null || !e7Var11.u) {
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                F().setVisibility(r82);
                n0(r82);
            }
            s5Var.setVisibility(r82);
            jaVar.setVisibility(r82);
            e7 e7Var12 = this.K1;
            laVar.setVisibility(((e7Var12 == null || e7Var12.J0 == 0) && this.v0 == 0) ? 0 : 8);
            FrameLayout frameLayout = this.Y0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            e7 e7Var13 = this.K1;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(((e7Var13 == null || e7Var13.J0 == 0) && this.v0 == 0) ? 68.0f : 12.0f);
            frameLayout.setLayoutParams(layoutParams);
            e5Var.setVisibility(0);
            e5Var.clearFocus();
            e7 e7Var14 = this.K1;
            laVar.A(e7Var14 == null ? 86400 : e7Var14.I0, false);
            laVar.setPeriodVisible(!qp.s1(i13).D3() && ((e7Var = this.K1) == null || !e7Var.g));
            e7 e7Var15 = this.K1;
            laVar.setHasRoundVideo((e7Var15 == null || e7Var15.o0 == null) ? false : true);
            if (laVar == null) {
                charSequence = "";
                i11 = i13;
            } else {
                e7 e7Var16 = this.K1;
                if (e7Var16 == null || !e7Var16.n) {
                    charSequence = "";
                    i11 = i13;
                    laVar.v(null, null);
                } else {
                    TLRPC.Peer peer = e7Var16.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        String p10 = t10.p(qp.s1(i13).a2(Long.valueOf(peer.user_id)));
                        e7 e7Var17 = this.K1;
                        charSequence = "";
                        append = new SpannableStringBuilder(ij.h6()).append((CharSequence) " ").append((CharSequence) p10);
                        e7Var17.p = append;
                        i12 = i13;
                    } else {
                        charSequence = "";
                        i12 = i13;
                        TLRPC.Chat M0 = qp.s1(i13).M0(Long.valueOf(-org.telegram.messenger.m5.o(peer)));
                        CharSequence charSequence3 = M0 == null ? charSequence : M0.title;
                        e7 e7Var18 = this.K1;
                        append = new SpannableStringBuilder(ij.h6()).append((CharSequence) " ").append(charSequence3);
                        e7Var18.p = append;
                    }
                    String str3 = this.K1.s;
                    if (TextUtils.isEmpty(str3)) {
                        SpannableString spannableString = new SpannableString(id.M0(2131744735, null));
                        i11 = i12;
                        spannableString.setSpan(new s9(0), 0, spannableString.length(), 33);
                        str = spannableString;
                    } else {
                        i11 = i12;
                        str = str3;
                    }
                    laVar.v(append, str);
                }
            }
            e7 e7Var19 = this.K1;
            boolean z13 = (e7Var19 != null && e7Var19.v() && this.K1.t()) ? false : true;
            boolean z14 = fbVar.j0;
            fbVar.j0 = z13;
            fbVar.i0.f(z13, true);
            fbVar.invalidate();
        } else {
            iaVar = iaVar2;
            charSequence = "";
            i11 = i13;
        }
        d dVar = this.u1;
        fb fbVar2 = this.t1;
        int i15 = 2;
        if (i10 == 2 || i7 == 2) {
            z9 = false;
            l5Var.setVisibility(0);
            fbVar2.setVisibility(0);
            e7 e7Var20 = this.K1;
            if (e7Var20 == null || !e7Var20.b0) {
                str2 = null;
            } else {
                str2 = null;
                l5Var.l(id.M0(2131746355, null), false);
            }
            e5Var.setVisibility(0);
            dVar.setVisibility(0);
            i15 = 2;
        } else {
            z9 = false;
            str2 = null;
        }
        if (i10 == i15) {
            l5Var.l(id.M0(2131746355, str2), z9);
        }
        n9 n9Var = this.d1;
        if (i10 == 1) {
            this.N1 = z9;
            e7 e7Var21 = this.K1;
            boolean z15 = (e7Var21 == null || e7Var21.J0 == 0) ? false : true;
            boolean z16 = e7Var21 != null && e7Var21.g;
            String M02 = id.M0(z16 ? 2131751354 : z15 ? 2131743804 : 2131748250, null);
            boolean z17 = !z15;
            boolean z18 = z16;
            if (TextUtils.equals(M02, s5Var.d) && z17 == s5Var.e) {
                z11 = z15;
            } else {
                s5Var.removeView(s5Var.c);
                z11 = z15;
                Context context = s5Var.getContext();
                s5Var.d = M02;
                s5Var.e = z17;
                r5 r5Var = new r5(s5Var, context, M02, z17);
                s5Var.c = r5Var;
                r5Var.setContentDescription(M02);
                s5Var.addView(s5Var.c, c8.ha.c(-2.0f, -2));
                s5Var.e();
            }
            fbVar2.setVisibility(8);
            dVar.setVisibility(8);
            if (!this.h2) {
                e7 e7Var22 = this.K1;
                if (e7Var22 == null || !e7Var22.u) {
                    jaVar.set(e7Var22);
                } else {
                    jaVar.l(e7Var22);
                }
            }
            this.h2 = false;
            laVar.f.getEditText().setOnPremiumMenuLockClickListener(qp.s1(i11).X4() ? null : new u8(this, 19));
            n9Var.setVisibility(this.H1 == null ? 8 : 0);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                n9Var.c(false, false);
                n9Var.c = arrayList;
                n9Var.d = arrayList2;
                n9Var.e = arrayList3;
                n9Var.x = new ny0(Integer.toString(arrayList.size()), 20.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                n9Var.K = new ny0(id.H(',', "HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                n9Var.b.f3.O(false);
                n9Var.setSelected(this.H1.indexOf(this.K1));
            }
            fbVar.setMaxCount((z11 || z18 || this.H1 != null || ((e7Var6 = this.K1) != null && (e7Var6.v() || !this.K1.K))) ? 1 : 3);
            if (i7 != 2) {
                e7 e7Var23 = this.K1;
                if (e7Var23 != null && (e7Var23.c || e7Var23.g || this.u0)) {
                    if (e7Var23.P0 != null) {
                        y();
                        t();
                        G();
                    }
                    e7 e7Var24 = this.K1;
                    if (e7Var24.K && e7Var24.a1 != null && (textureView = jaVar.getTextureView()) != null) {
                        textureView.setDelegate(new d9(this, 6));
                    }
                    laVar.setText(this.K1.C0);
                } else if (i7 != 2) {
                    laVar.V = true;
                    charSequence2 = charSequence;
                    laVar.f.setText(charSequence2);
                    e7 e7Var25 = this.K1;
                    s5Var.d(4, e7Var25 != null || ((!e7Var25.u || e7Var25.K) && !e7Var25.v()));
                    boolean z19 = org.telegram.messenger.r2.a;
                    s5Var.d(3, false);
                    if (!this.N1 && !laVar.o()) {
                        di.z6 P1 = qp.s1(i11).P1();
                        int A = A();
                        o4 = P1.o();
                        if (o4 != null || !o4.a(P1.a, A) || ((e7Var5 = this.K1) != null && (e7Var5.g || e7Var5.J0 != 0))) {
                            z12 = true;
                            s5Var.setShareEnabled(z12);
                            e7 e7Var26 = this.K1;
                            dh0Var.setImageResource((e7Var26 == null && e7Var26.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                            jaVar.setVisibility(0);
                            fbVar.setVisibility(0);
                            l5Var.setVisibility(0);
                            l5Var.setTranslationX(0.0f);
                            e7Var4 = this.K1;
                            if (e7Var4 != null || e7Var4.J0 == 0) {
                                if (e7Var4 == null && e7Var4.g) {
                                    l5Var.l(id.M0(2131746354, null), false);
                                    l60Var = null;
                                    y5Var = jaVar;
                                } else if (e7Var4 == null && e7Var4.u) {
                                    l5Var.l(id.M0(2131746352, null), false);
                                } else if (e7Var4 == null && e7Var4.n) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    int i16 = i11;
                                    org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(32.0f, i16, l5Var);
                                    l5Var.setTranslationX(-org.telegram.messenger.g0.L(6.0f));
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(f5Var, 0, 1, 33);
                                    if (this.K1.q instanceof TLRPC.TL_peerUser) {
                                        TLRPC.User a22 = qp.s1(i16).a2(Long.valueOf(this.K1.q.user_id));
                                        f5Var.e(a22);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append((CharSequence) t10.p(a22));
                                        y5Var = jaVar;
                                    } else {
                                        y5Var = jaVar;
                                        TLRPC.Chat M03 = qp.s1(i16).M0(Long.valueOf(-org.telegram.messenger.m5.o(this.K1.q)));
                                        f5Var.b(M03);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append(M03 != null ? M03.title : charSequence2);
                                    }
                                    l5Var.l(spannableStringBuilder, false);
                                    l60Var = null;
                                } else {
                                    y5Var = jaVar;
                                    l60Var = null;
                                    l5Var.l(id.M0(2131746353, null), false);
                                }
                                if (i7 == 1) {
                                    l60 l60Var2 = laVar.U0;
                                    if (l60Var2 != null) {
                                        l60Var2.u();
                                        laVar.U0 = l60Var;
                                    }
                                    this.k1.f(true);
                                    if (n9Var.M) {
                                        n9Var.c(false, true);
                                    }
                                }
                                if (i10 == 2 && (e7Var2 = this.K1) != null) {
                                    if (e7Var2.e0 < 0) {
                                        e7Var2.e0 = 0L;
                                    }
                                    this.M1 = e7Var2.e0;
                                    long duration = y5Var.getDuration() >= 100 ? this.K1.h0 : y5Var.getDuration();
                                    e7Var3 = this.K1;
                                    if (e7Var3.h0 <= 0) {
                                        e7Var3.h0 = duration;
                                    }
                                    file = e7Var3.Z0;
                                    if (file == null) {
                                        file = e7Var3.L;
                                    }
                                    String absolutePath = file.getAbsolutePath();
                                    e7 e7Var27 = this.K1;
                                    this.t1.o(false, absolutePath, e7Var27.h0, e7Var27.P);
                                    e7 e7Var28 = this.K1;
                                    float f10 = duration;
                                    long j3 = (long) (e7Var28.Z * f10);
                                    long j10 = (long) (e7Var28.a0 * f10);
                                    fbVar2.Z0 = j3;
                                    fbVar2.a1 = j10;
                                    abVar = fbVar2.h;
                                    if (abVar != null) {
                                        ab.a(abVar, true);
                                    }
                                    ai.e eVar = new ai.e(this, 22);
                                    fbVar2.setDelegate(new cb.c(eVar, 27));
                                    float max = (this.M1 / Math.max(1L, duration)) * 0.96f;
                                    fbVar2.setVideoLeft(max);
                                    fbVar2.setVideoRight(0.04f + max);
                                    eVar.a(Boolean.TRUE, Float.valueOf(max));
                                }
                                sd0Var = this.C1;
                                z10 = false;
                                if (sd0Var != null) {
                                    sd0Var.setAllowTouch(false);
                                }
                                m3Var = this.m1;
                                if (m3Var != null) {
                                    m3Var.f(true);
                                }
                                cc.e();
                                if (laVar != null) {
                                    g gVar = laVar.f;
                                    gVar.d();
                                    gVar.k(true);
                                    laVar.d0 = true;
                                }
                                if (y5Var != null) {
                                    y5Var.x(8, i10 != 1);
                                }
                                x9Var = this.v1;
                                if (x9Var != null) {
                                    x9Var.setCoverPreview(i10 != 1);
                                }
                                m3Var2 = this.n1;
                                if (m3Var2 != null) {
                                    m3Var2.f(true);
                                }
                                if (i10 == 1 && iaVar.j()) {
                                    z10 = true;
                                }
                                iaVar.setPreview(z10);
                            }
                            l5Var.l(charSequence2, false);
                        }
                    }
                    z12 = false;
                    s5Var.setShareEnabled(z12);
                    e7 e7Var262 = this.K1;
                    dh0Var.setImageResource((e7Var262 == null && e7Var262.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    jaVar.setVisibility(0);
                    fbVar.setVisibility(0);
                    l5Var.setVisibility(0);
                    l5Var.setTranslationX(0.0f);
                    e7Var4 = this.K1;
                    if (e7Var4 != null) {
                    }
                    if (e7Var4 == null) {
                    }
                    if (e7Var4 == null) {
                    }
                    if (e7Var4 == null) {
                    }
                    y5Var = jaVar;
                    l60Var = null;
                    l5Var.l(id.M0(2131746353, null), false);
                    if (i7 == 1) {
                    }
                    if (i10 == 2) {
                        if (e7Var2.e0 < 0) {
                        }
                        this.M1 = e7Var2.e0;
                        if (y5Var.getDuration() >= 100) {
                        }
                        e7Var3 = this.K1;
                        if (e7Var3.h0 <= 0) {
                        }
                        file = e7Var3.Z0;
                        if (file == null) {
                        }
                        String absolutePath2 = file.getAbsolutePath();
                        e7 e7Var272 = this.K1;
                        this.t1.o(false, absolutePath2, e7Var272.h0, e7Var272.P);
                        e7 e7Var282 = this.K1;
                        float f102 = duration;
                        long j32 = (long) (e7Var282.Z * f102);
                        long j102 = (long) (e7Var282.a0 * f102);
                        fbVar2.Z0 = j32;
                        fbVar2.a1 = j102;
                        abVar = fbVar2.h;
                        if (abVar != null) {
                        }
                        ai.e eVar2 = new ai.e(this, 22);
                        fbVar2.setDelegate(new cb.c(eVar2, 27));
                        float max2 = (this.M1 / Math.max(1L, duration)) * 0.96f;
                        fbVar2.setVideoLeft(max2);
                        fbVar2.setVideoRight(0.04f + max2);
                        eVar2.a(Boolean.TRUE, Float.valueOf(max2));
                    }
                    sd0Var = this.C1;
                    z10 = false;
                    if (sd0Var != null) {
                    }
                    m3Var = this.m1;
                    if (m3Var != null) {
                    }
                    cc.e();
                    if (laVar != null) {
                    }
                    if (y5Var != null) {
                    }
                    x9Var = this.v1;
                    if (x9Var != null) {
                    }
                    m3Var2 = this.n1;
                    if (m3Var2 != null) {
                    }
                    if (i10 == 1) {
                        z10 = true;
                    }
                    iaVar.setPreview(z10);
                }
            }
            charSequence2 = charSequence;
            e7 e7Var252 = this.K1;
            s5Var.d(4, e7Var252 != null || ((!e7Var252.u || e7Var252.K) && !e7Var252.v()));
            boolean z192 = org.telegram.messenger.r2.a;
            s5Var.d(3, false);
            if (!this.N1) {
                di.z6 P12 = qp.s1(i11).P1();
                int A2 = A();
                o4 = P12.o();
                if (o4 != null) {
                }
                z12 = true;
                s5Var.setShareEnabled(z12);
                e7 e7Var2622 = this.K1;
                dh0Var.setImageResource((e7Var2622 == null && e7Var2622.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                jaVar.setVisibility(0);
                fbVar.setVisibility(0);
                l5Var.setVisibility(0);
                l5Var.setTranslationX(0.0f);
                e7Var4 = this.K1;
                if (e7Var4 != null) {
                }
                if (e7Var4 == null) {
                }
                if (e7Var4 == null) {
                }
                if (e7Var4 == null) {
                }
                y5Var = jaVar;
                l60Var = null;
                l5Var.l(id.M0(2131746353, null), false);
                if (i7 == 1) {
                }
                if (i10 == 2) {
                }
                sd0Var = this.C1;
                z10 = false;
                if (sd0Var != null) {
                }
                m3Var = this.m1;
                if (m3Var != null) {
                }
                cc.e();
                if (laVar != null) {
                }
                if (y5Var != null) {
                }
                x9Var = this.v1;
                if (x9Var != null) {
                }
                m3Var2 = this.n1;
                if (m3Var2 != null) {
                }
                if (i10 == 1) {
                }
                iaVar.setPreview(z10);
            }
            z12 = false;
            s5Var.setShareEnabled(z12);
            e7 e7Var26222 = this.K1;
            dh0Var.setImageResource((e7Var26222 == null && e7Var26222.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            jaVar.setVisibility(0);
            fbVar.setVisibility(0);
            l5Var.setVisibility(0);
            l5Var.setTranslationX(0.0f);
            e7Var4 = this.K1;
            if (e7Var4 != null) {
            }
            if (e7Var4 == null) {
            }
            if (e7Var4 == null) {
            }
            if (e7Var4 == null) {
            }
            y5Var = jaVar;
            l60Var = null;
            l5Var.l(id.M0(2131746353, null), false);
            if (i7 == 1) {
            }
            if (i10 == 2) {
            }
            sd0Var = this.C1;
            z10 = false;
            if (sd0Var != null) {
            }
            m3Var = this.m1;
            if (m3Var != null) {
            }
            cc.e();
            if (laVar != null) {
            }
            if (y5Var != null) {
            }
            x9Var = this.v1;
            if (x9Var != null) {
            }
            m3Var2 = this.n1;
            if (m3Var2 != null) {
            }
            if (i10 == 1) {
            }
            iaVar.setPreview(z10);
        }
        y5Var = jaVar;
        l60Var = null;
        if (i7 == 1) {
        }
        if (i10 == 2) {
        }
        sd0Var = this.C1;
        z10 = false;
        if (sd0Var != null) {
        }
        m3Var = this.m1;
        if (m3Var != null) {
        }
        cc.e();
        if (laVar != null) {
        }
        if (y5Var != null) {
        }
        x9Var = this.v1;
        if (x9Var != null) {
        }
        m3Var2 = this.n1;
        if (m3Var2 != null) {
        }
        if (i10 == 1) {
        }
        iaVar.setPreview(z10);
    }

    public final void O() {
        sg.t0 t0Var;
        boolean z9 = false;
        if (this.f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Y(false);
            } else {
                this.x2 = new u8(this, 3);
            }
        }
        la laVar = this.c1;
        if (laVar != null) {
            laVar.f.s();
        }
        g6 g6Var = this.O0;
        if (g6Var != null) {
            g6Var.h();
        }
        t5 t5Var = this.o1;
        if (t5Var != null) {
            di.z6 P1 = qp.s1(t5Var.a).P1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) P1.i.f(p10.i(P1.a).n);
            t5Var.b = P1.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            t5Var.c.invalidate();
        }
        x9 x9Var = this.v1;
        if (x9Var != null && (t0Var = x9Var.x0.d) != null) {
            t0Var.postRunnable(t0Var.x);
        }
        ja jaVar = this.X0;
        if (jaVar != null) {
            jaVar.x(0, false);
        }
        z0 z0Var = qp.s1(this.c).P1().w;
        if (z0Var.c || z0Var.d) {
            return;
        }
        z0Var.d = true;
        v0 v0Var = new v0(z0Var, 1);
        yr a02 = yr.a0(z0Var.a);
        a02.a.c(new bi.u7(a02, z9, v0Var, 3));
    }

    public final void P(int i7, int i10) {
        x9 x9Var;
        fa faVar;
        ga gaVar;
        x9 x9Var2;
        if (i10 == 0) {
            this.n0.setVisibility(8);
        }
        if (i7 == 0 && (x9Var2 = this.v1) != null) {
            x9Var2.setVisibility(8);
        }
        if (i7 == -1) {
            this.c1.setVisibility(8);
            this.g1.setVisibility(i10 == 2 ? 0 : 8);
            this.j1.setVisibility(i10 == 2 ? 0 : 8);
            this.e1.setVisibility(i10 == 2 ? 0 : 8);
            ImageView imageView = this.i1;
            if (imageView != null) {
                imageView.setVisibility(i10 == 2 ? 0 : 8);
            }
            this.Z0.setVisibility(i10 == 2 ? 0 : 8);
            this.p0.setVisibility(8);
        }
        boolean z9 = true;
        this.X0.setAllowCropping(i10 == -1);
        if ((i10 == 0 || i7 == 0) && (x9Var = this.v1) != null) {
            x9Var.M0.setLayerType(0, null);
        }
        sd0 sd0Var = this.C1;
        if (sd0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z9 = false;
            }
            sd0Var.setAllowTouch(z9);
        }
        if (i10 == 3) {
            fa faVar2 = this.r1;
            if (faVar2 != null) {
                faVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 3 && (faVar = this.r1) != null) {
            faVar.setVisibility(8);
            this.r1.setAppearProgress(0.0f);
            fa faVar3 = this.r1;
            faVar3.y = null;
            g0 g0Var = faVar3.f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            faVar3.d.setVisibility(8);
            faVar3.a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            ga gaVar2 = this.s1;
            if (gaVar2 != null) {
                gaVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i7 != 4 || (gaVar = this.s1) == null) {
            return;
        }
        gaVar.setVisibility(8);
        this.s1.setAppearProgress(0.0f);
        ga gaVar3 = this.s1;
        gaVar3.b = null;
        g0 g0Var2 = gaVar3.h;
        g0Var2.L = null;
        g0Var2.d = null;
        g0Var2.J = false;
        gaVar3.e.setVisibility(8);
        gaVar3.setVisibility(8);
    }

    public final void Q(pa paVar) {
        di.t6 o4;
        ua uaVar;
        if (this.d) {
            return;
        }
        int i7 = this.c;
        if (qp.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        int i10 = 0;
        this.u0 = false;
        this.e = false;
        this.B2 = false;
        this.s0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (uaVar = this.n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.A0.setCameraThumb(z());
        if (this.v0 == 0 && (o4 = qp.s1(i7).P1().o()) != null && o4.a(i7, 1)) {
            g0(o4, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.H;
        if (paVar != null) {
            this.F = paVar;
            this.J = paVar.a;
            rectF.set(paVar.c);
            this.G = paVar.b;
            this.F.e();
        } else {
            this.J = 0;
            float L = org.telegram.messenger.g0.L(100.0f);
            Point point = org.telegram.messenger.g0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.g0.L(8.0f);
        }
        this.r.c();
        int i11 = this.J;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.h0.setBackgroundColor(i10);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.g0.g2(this.b);
        f(1.0f, true, new u8(this, 6));
        d();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void R(oa oaVar, e7 e7Var, long j3) {
        ua uaVar;
        if (this.d) {
            return;
        }
        int i7 = this.c;
        if (qp.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        this.u0 = false;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (uaVar = this.n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.K1 = e7Var;
        this.O1 = e7Var.K ? 1 : 0;
        this.s0.g = false;
        RectF rectF = this.H;
        if (oaVar != null) {
            this.F = oaVar;
            this.J = oaVar.a;
            rectF.set(oaVar.c);
            this.G = oaVar.b;
            this.F.e();
        } else {
            this.J = 0;
            float L = org.telegram.messenger.g0.L(100.0f);
            Point point = org.telegram.messenger.g0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.g0.L(8.0f);
        }
        this.r.c();
        int i10 = this.J;
        this.h0.setBackgroundColor((i10 == 1 || i10 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.g0.g2(this.b);
        e7 e7Var2 = this.K1;
        if (e7Var2 != null) {
            this.c1.setText(e7Var2.C0);
        }
        K(new m9(this, 0), j3);
        J(this.K1.b0 ? 2 : 1, false);
        k0(-1, false, false);
        this.b1.b(false, false);
        d();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void S() {
        l60 l60Var;
        ja jaVar = this.X0;
        if (jaVar != null) {
            jaVar.x(4, true);
        }
        la laVar = this.c1;
        if (laVar != null && (l60Var = laVar.U0) != null) {
            l60Var.u();
            laVar.U0 = null;
        }
        ug.w0 w0Var = new ug.w0((org.telegram.ui.ActionBar.f2) new z9(this, 1), 14, false);
        w0Var.setOnDismissListener(new i9(this, 1));
        w0Var.show();
    }

    public final void T(oa oaVar, e7 e7Var) {
        di.t6 o4;
        ua uaVar;
        if (this.d) {
            return;
        }
        int i7 = this.c;
        if (qp.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        this.u0 = true;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (uaVar = this.n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.K1 = e7Var;
        t8.a(i7, e7Var);
        e7 e7Var2 = this.K1;
        int i10 = (e7Var2 == null || !e7Var2.K) ? 0 : 1;
        this.O1 = i10;
        this.s0.g = e7Var2 != null && e7Var2.u && i10 == 1;
        if (this.v0 == 0 && (o4 = qp.s1(i7).P1().o()) != null && o4.a(i7, 1)) {
            g0(o4, true);
        }
        RectF rectF = this.H;
        if (oaVar != null) {
            this.F = oaVar;
            this.J = oaVar.a;
            rectF.set(oaVar.c);
            this.G = oaVar.b;
            this.F.e();
        } else {
            this.J = 0;
            float L = org.telegram.messenger.g0.L(100.0f);
            Point point = org.telegram.messenger.g0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.g0.L(8.0f);
        }
        this.r.c();
        int i11 = this.J;
        this.h0.setBackgroundColor((i11 == 1 || i11 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.K = 0.0f;
        org.telegram.messenger.g0.g2(this.b);
        e7 e7Var3 = this.K1;
        if (e7Var3 != null) {
            this.c1.setText(e7Var3.C0);
        }
        this.b1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new u8(this, 6));
        d();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void U() {
        sg.v0 v0Var = this.w1;
        if (v0Var != null) {
            v0Var.bringToFront();
        }
        View view = this.x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        ib ibVar = this.p1;
        if (ibVar != null) {
            ibVar.bringToFront();
        }
        sd0 sd0Var = this.C1;
        if (sd0Var != null) {
            sd0Var.bringToFront();
        }
        kd0 kd0Var = this.E1;
        if (kd0Var != null) {
            kd0Var.bringToFront();
        }
        md0 md0Var = this.F1;
        if (md0Var != null) {
            md0Var.bringToFront();
        }
        t5 t5Var = this.o1;
        if (t5Var != null) {
            t5Var.bringToFront();
        }
        p pVar = this.q1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void V(e7 e7Var, boolean z9) {
        e7 e7Var2;
        boolean z10;
        if (e7Var == null || this.X0.getWidth() <= 0 || this.X0.getHeight() <= 0) {
            return;
        }
        File file = z9 ? e7Var.O0 : e7Var.N0;
        if (file != null) {
            file.delete();
        }
        View view = this.A0.j() ? this.A0 : this.X0;
        float f10 = z9 ? 0.33333334f : 1.0f;
        int width = (int) (view.getWidth() * f10);
        Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f10), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(f10, f10);
        org.telegram.messenger.g0.m0 = true;
        view.draw(canvas);
        org.telegram.messenger.g0.m0 = false;
        canvas.restore();
        Paint paint = new Paint(2);
        i51 textureView = this.X0.getTextureView();
        if (e7Var.K && !e7Var.u && textureView != null) {
            Bitmap bitmap = textureView.getBitmap();
            Matrix transform = textureView.getTransform(null);
            if (transform != null) {
                Matrix matrix = new Matrix(transform);
                matrix.postScale(f10, f10);
                transform = matrix;
            }
            canvas.drawBitmap(bitmap, transform, paint);
            bitmap.recycle();
        }
        File file2 = e7Var.Q0;
        if (file2 != null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                canvas.save();
                float width2 = width / decodeFile.getWidth();
                canvas.scale(width2, width2);
                canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile.recycle();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        File file3 = e7Var.P0;
        if (file3 != null) {
            try {
                Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                canvas.save();
                float width3 = width / decodeFile2.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile2.recycle();
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        x9 x9Var = this.v1;
        if (x9Var != null && x9Var.A0 != null) {
            canvas.save();
            canvas.scale(f10, f10);
            x9 x9Var2 = this.v1;
            x9Var2.r0 = true;
            j5 j5Var = x9Var2.A0;
            j5Var.a = true;
            j5Var.draw(canvas);
            x9 x9Var3 = this.v1;
            x9Var3.A0.a = false;
            x9Var3.r0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = e7.w(this.c, "jpg");
        if (z9) {
            e7Var2 = e7Var;
            z10 = z9;
            Utilities.g.c(new q1(this, createBitmap, z10, w10, e7Var2, 1));
        } else {
            e7Var2 = e7Var;
            z10 = z9;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z10 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        if (!z10) {
            e7Var2.N0 = w10;
        }
        e7Var2.b1 = createScaledBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    public final void W() {
        di.t6 o4;
        ?? r16;
        s8 s8Var = this.q0;
        BitmapDrawable bitmapDrawable = null;
        if (s8Var != null) {
            s8Var.dismiss();
            this.q0 = null;
        }
        boolean z9 = this.N1;
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.D;
        if (z9) {
            t0 t0Var = this.e1;
            t0Var.getClass();
            t0Var.c(id.N0("VideoConvertFail"));
            p2Var.a();
            r5 r5Var = this.b1.c;
            int i7 = -this.U1;
            this.U1 = i7;
            org.telegram.messenger.g0.G3(i7, r5Var, null);
            return;
        }
        la laVar = this.c1;
        if (laVar != null && laVar.o()) {
            p2Var.a();
            org.telegram.ui.Components.j6 j6Var = laVar.w;
            int i10 = -this.U1;
            this.U1 = i10;
            org.telegram.messenger.g0.G3(i10, j6Var, null);
            laVar.e();
            return;
        }
        e7 e7Var = this.K1;
        int i11 = this.c;
        int i12 = 0;
        if ((e7Var == null || (!e7Var.g && e7Var.J0 == 0)) && (o4 = qp.s1(i11).h0.o()) != null && o4.a(i11, A())) {
            g0(o4, false);
            return;
        }
        this.K1.D0 = qp.s1(i11).X4();
        di.b bVar = this.a;
        boolean z10 = true;
        if (laVar != null && !this.K1.D0) {
            CharSequence text = laVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((wy0[]) spannable.getSpans(0, text.length(), wy0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new hc(this.n, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.g0.S2(id.M0(2131744581, null), org.telegram.ui.ActionBar.l6.Uc, 0, new u8(this, 27), bVar)).k(true);
                    int i13 = -this.U1;
                    this.U1 = i13;
                    org.telegram.messenger.g0.G3(i13, laVar, null);
                    return;
                }
            }
        }
        e7 e7Var2 = this.K1;
        if (e7Var2.g || e7Var2.J0 != 0) {
            e7Var2.l = false;
            h(null);
            o0();
            return;
        }
        if (this.N != 0) {
            e7Var2.v0 = qp.s1(i11).j1(this.N);
        }
        ja jaVar = this.X0;
        jaVar.x(3, true);
        s8 s8Var2 = new s8(this.K1.I0, this.b, bVar);
        s8Var2.W0(this.K1.E0);
        s8Var2.V0(this.K1.v0);
        s8Var2.w1 = this.M;
        s8Var2.L1 = new v8(this, 14);
        s8Var2.L0(!this.A0.j());
        ArrayList arrayList = this.I1;
        s8Var2.S0(arrayList == null ? this.K1.r() : arrayList.size());
        s8Var2.Q0(false);
        CharSequence text2 = laVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (f41 f41Var : (f41[]) ((Spanned) text2).getSpans(0, text2.length(), f41.class)) {
                if (f41Var != null) {
                    try {
                        TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(Long.parseLong(f41Var.getURL())));
                        if (a22 != null && !t10.B(a22) && t10.n(a22) != null && !arrayList2.contains(a22)) {
                            arrayList2.add(t10.n(a22));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (text2 != null) {
            int i14 = 0;
            int i15 = -1;
            while (i14 < text2.length()) {
                char charAt = text2.charAt(i14);
                boolean z11 = z10;
                if (charAt == '@') {
                    i15 = i14 + 1;
                } else if (charAt == ' ') {
                    if (i15 != -1) {
                        String charSequence = text2.subSequence(i15, i14).toString();
                        TLObject f22 = qp.s1(i11).f2(charSequence);
                        if (f22 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) f22;
                            if (!user.bot && !t10.B(user) && user.id != 777000 && !t10.z(user) && !arrayList2.contains(charSequence)) {
                                arrayList2.add(charSequence);
                            }
                        }
                    }
                    i15 = -1;
                }
                i14++;
                z10 = z11;
            }
            boolean z12 = z10;
            r16 = z12;
            if (i15 != -1) {
                String charSequence2 = text2.subSequence(i15, text2.length()).toString();
                TLObject f23 = qp.s1(i11).f2(charSequence2);
                r16 = z12;
                if (f23 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) f23;
                    r16 = z12;
                    if (!user2.bot) {
                        r16 = z12;
                        if (!t10.B(user2)) {
                            r16 = z12;
                            if (user2.id != 777000) {
                                r16 = z12;
                                if (!t10.z(user2)) {
                                    r16 = z12;
                                    if (!arrayList2.contains(charSequence2)) {
                                        arrayList2.add(charSequence2);
                                        r16 = z12;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            r16 = 1;
        }
        s8Var2.J1 = arrayList2;
        s8Var2.N1 = new v8(this, 15);
        s8Var2.O1 = new v8(this, 16);
        s8Var2.K1 = new d9(this, 9);
        this.q0 = s8Var2;
        e7 e7Var3 = this.K1;
        if (e7Var3.K) {
            if (jaVar != null && !e7Var3.f0 && this.f0 != 2) {
                e7Var3.e0 = jaVar.getCurrentPosition();
                v8 v8Var = new v8(this, 17);
                sg.v0 v0Var = this.w1;
                View view = this.z1;
                View[] viewArr = new View[3];
                viewArr[0] = jaVar;
                viewArr[r16] = v0Var;
                viewArr[2] = view;
                jaVar.h(v8Var, viewArr);
            }
            s8 s8Var3 = this.q0;
            Bitmap bitmap = this.K1.g0;
            u8 u8Var = new u8(this, 20);
            if (bitmap != null) {
                s8Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            s8Var3.S1 = bitmapDrawable;
            s8Var3.T1 = u8Var;
            g1 g1Var = s8Var3.i1;
            if (g1Var != null) {
                for (View view2 : g1Var.getViewPages()) {
                    if (view2 instanceof n8) {
                        n8 n8Var = (n8) view2;
                        n8Var.h(false);
                        n8Var.f(false);
                    }
                }
            }
        }
        this.q0.setOnDismissListener(new i9(this, i12));
        this.q0.show();
    }

    public final void X(qa qaVar) {
        int i7 = 0;
        RectF rectF = this.H;
        if (qaVar != null) {
            this.F = qaVar;
            this.J = qaVar.a;
            rectF.set(qaVar.c);
            this.G = qaVar.b;
        } else {
            this.F = null;
            this.J = 0;
            float L = org.telegram.messenger.g0.L(100.0f);
            Point point = org.telegram.messenger.g0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.G = org.telegram.messenger.g0.L(8.0f);
        }
        int i10 = this.J;
        if (i10 != 1 && i10 != 0) {
            i7 = -14737633;
        }
        this.h0.setBackgroundColor(i7);
    }

    public final void Y(boolean z9) {
        if (!this.w2 || z9) {
            int i7 = 0;
            this.s2 = false;
            Activity activity = this.b;
            if (activity != null) {
                boolean z10 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.s2 = z10;
                if (z10) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    xp xpVar = new xp(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.g0.L(64.0f);
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    xpVar.e = L;
                    xpVar.f = L2;
                    this.A0.setCameraThumb(xpVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.a);
                        int i10 = org.telegram.ui.ActionBar.l6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.l6.x0(null, i10, false), null);
                        alertDialog$Builder.n(i10, null);
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.M0(2131747308, null));
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.T = X2;
                        alertDialog$Builder.k(id.M0(2131747300, null), new d9(this, 12));
                        alertDialog$Builder.h(id.M0(2131751772, null), null);
                        u1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, qs.w1);
                    this.w2 = true;
                }
            }
            if (this.s2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                q();
            } else {
                CameraController.getInstance().initCamera(new u8(this, i7));
            }
        }
    }

    public final void a0(Runnable runnable) {
        y9 y9Var = this.B0;
        if (y9Var == null || y9Var.getTextureView() == null) {
            return;
        }
        try {
            Utilities.i.c(new x1(this, this.B0.getTextureView().getBitmap(), runnable, 8));
        } catch (Throwable unused) {
        }
    }

    public final void b0(View view, boolean z9, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
            view.animate().alpha(z9 ? 1.0f : 0.0f).setUpdateListener(new w9(this, 1)).setListener(new ai.g0(this, z9, view, 4)).setDuration(320L).setInterpolator(xq.h).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z9 ? 0 : 8);
            view.setAlpha(z9 ? 1.0f : 0.0f);
            m0();
        }
    }

    public final void c0(boolean z9) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z9) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f.updateViewLayout(this.n, layoutParams);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d() {
        qs.e().b(this, qs.r2);
        int i7 = this.c;
        qs.f(i7).b(this, qs.y5);
        qs.f(i7).b(this, qs.b3);
    }

    public final void d0(String str) {
        int i7;
        gb gbVar = this.E0;
        gbVar.clearAnimation();
        y9 y9Var = this.B0;
        if ((y9Var != null && y9Var.isDual()) || this.a2) {
            str = null;
        }
        this.Y1 = str;
        boolean z9 = false;
        if (str == null) {
            b0(gbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals("auto")) {
                gbVar.setContentDescription(id.M0(2131754915, null));
                i7 = R.drawable.media_photo_flash_auto2;
            }
            gbVar.setContentDescription(id.M0(2131754914, null));
            i7 = R.drawable.media_photo_flash_off2;
        } else {
            if (str.equals("on")) {
                gbVar.setContentDescription(id.M0(2131754913, null));
                i7 = R.drawable.media_photo_flash_on2;
            }
            gbVar.setContentDescription(id.M0(2131754914, null));
            i7 = R.drawable.media_photo_flash_off2;
        }
        if (gbVar.n != i7) {
            gbVar.n = i7;
            ValueAnimator valueAnimator = gbVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                gbVar.r = null;
            }
            gbVar.setDrawable(i7);
        }
        if (this.f0 == 0 && !this.I0.e && this.Y1 != null && !H()) {
            z9 = true;
        }
        b0(gbVar, z9, true);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        di.t6 o4;
        e7 e7Var;
        boolean z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        if (i7 == qs.r2) {
            g6 g6Var = this.O0;
            if (g6Var != null) {
                g6Var.h();
            }
            if (this.m2 == null || MediaController.b2 == null) {
                return;
            }
            for (int i11 = 0; i11 < MediaController.b2.size(); i11++) {
                we weVar = (we) MediaController.b2.get(i11);
                int i12 = weVar.a;
                we weVar2 = this.m2;
                if (i12 == weVar2.a && weVar.b == weVar2.b) {
                    this.m2 = weVar;
                    return;
                }
            }
            return;
        }
        if (i7 == qs.y5) {
            g6 g6Var2 = this.O0;
            if (g6Var2 == null || this.V1) {
                return;
            }
            g6Var2.h();
            return;
        }
        if (i7 == qs.b3) {
            int i13 = this.f0;
            int i14 = this.c;
            if (i13 != 1) {
                if (i13 == 0 && (o4 = qp.s1(i14).P1().o()) != null && o4.a(i14, 1)) {
                    e7 e7Var2 = this.K1;
                    if (e7Var2 == null || e7Var2.J0 == 0) {
                        g0(o4, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.N1 && !this.c1.o()) {
                di.z6 P1 = qp.s1(i14).P1();
                int A = A();
                di.t6 o10 = P1.o();
                if (o10 == null || !o10.a(P1.a, A) || ((e7Var = this.K1) != null && (e7Var.g || e7Var.J0 != 0))) {
                    z9 = true;
                }
            }
            this.b1.setShareEnabled(z9);
        }
    }

    public final void e(boolean z9) {
        u0 u0Var;
        this.K0 = z9;
        Boolean bool = this.p2;
        if (bool == null || bool.booleanValue() != z9) {
            int i7 = 0;
            if (this.M0 == null) {
                if (z9) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            if (this.M0.U) {
                this.q2 = new e9(this, z9, i7);
                return;
            }
            ValueAnimator valueAnimator = this.n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.n2 = null;
            }
            r1.g gVar = this.o2;
            if (gVar != null) {
                gVar.d();
                this.o2 = null;
            }
            if (this.M0 == null) {
                if (z9) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            i3 i3Var = this.M0;
            if (i3Var != null) {
                i3Var.K = false;
            }
            if (z9 && (u0Var = this.N0) != null) {
                u0Var.a(false);
            }
            na naVar = this.r;
            if (naVar != null) {
                naVar.setImportantForAccessibility(z9 ? 4 : 0);
            }
            this.M0.setImportantForAccessibility(z9 ? 0 : 4);
            this.p2 = Boolean.valueOf(z9);
            float translationY = this.M0.getTranslationY();
            ua uaVar = this.n;
            float height = z9 ? 0.0f : (uaVar.getHeight() - this.M0.g()) + (org.telegram.messenger.g0.n * 2.5f);
            int i10 = 1;
            Math.max(1, uaVar.getHeight());
            i3 i3Var2 = this.M0;
            i3Var2.K = !z9;
            this.k2 = this.j2 == null;
            if (z9) {
                r1.g gVar2 = new r1.g(i3Var2, r1.g.p, height);
                this.o2 = gVar2;
                gVar2.m.a(0.75f);
                this.o2.m.b(350.0f);
                this.o2.a(new f9(this, height, i7));
                this.o2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.n2 = ofFloat;
                ofFloat.addUpdateListener(new g9(this, i7));
                this.n2.addListener(new u9(this, i10));
                this.n2.setDuration(450L);
                this.n2.setInterpolator(xq.h);
                this.n2.start();
            }
            if (!z9 && !this.S1) {
                this.l2 = null;
            }
            if (z9 || this.f0 != 0 || this.s2) {
                return;
            }
            q();
        }
    }

    public final void e0(boolean z9, boolean z10) {
        if (this.f1 == null) {
            ah0 ah0Var = new ah0(R.raw.media_mute_unmute, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.f1 = ah0Var;
            ah0Var.F *= 1.5f;
        }
        this.g1.setAnimation(this.f1);
        if (!z10) {
            this.f1.N(z9 ? 20 : 0, false, false);
            return;
        }
        if (z9) {
            ah0 ah0Var2 = this.f1;
            if (ah0Var2.a0 > 20) {
                ah0Var2.N(0, false, false);
            }
            this.f1.P(20);
            this.f1.start();
            return;
        }
        ah0 ah0Var3 = this.f1;
        int i7 = ah0Var3.a0;
        if (i7 == 0 || i7 >= 43) {
            return;
        }
        ah0Var3.P(43);
        this.f1.start();
    }

    public final void f(float f10, boolean z9, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        na naVar = this.r;
        if (!z9) {
            this.L = null;
            this.I = f10;
            j();
            naVar.invalidate();
            this.n.invalidate();
            runnable.run();
            n();
            return;
        }
        this.P.d();
        qs.e().k(qs.j1, 512);
        this.L = Float.valueOf(this.K);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new g9(this, 5));
        this.E.addListener(new bi.o7(this, f10, runnable, 3));
        if (f10 < 1.0f && this.w) {
            this.E.setDuration(250L);
            this.E.setInterpolator(xq.h);
        } else if (f10 > 0.0f || naVar.a < org.telegram.messenger.g0.L(20.0f)) {
            this.E.setDuration(300L);
            this.E.setInterpolator(new x1.a());
        } else if (f10 >= 0.0f || !this.O) {
            this.E.setDuration(400L);
            this.E.setInterpolator(xq.h);
        } else {
            this.E.setDuration(200L);
            this.E.setInterpolator(xq.h);
            this.O = false;
        }
        this.E.start();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 2));
        }
    }

    public final void g(boolean z9, boolean z10) {
        y yVar;
        if (z9) {
            m3 m3Var = this.l1;
            if (m3Var != null) {
                m3Var.f(true);
            }
            m3 m3Var2 = this.m1;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
            m3 m3Var3 = this.k1;
            if (m3Var3 != null) {
                m3Var3.f(true);
            }
            m3 m3Var4 = this.W0;
            if (m3Var4 != null) {
                m3Var4.f(true);
            }
        }
        if (this.a2 == z9 && this.b2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z9;
        this.b2 = H();
        if (z9 && (yVar = this.I0) != null && yVar.e) {
            yVar.a(false, z10);
        }
        l0(z10);
        o9 o9Var = this.Q0;
        k3 k3Var = this.U0;
        k3 k3Var2 = this.T0;
        if (!z10) {
            k3Var2.setAlpha((z9 && this.f0 == 0 && !H()) ? 1.0f : 0.0f);
            k3Var2.setTranslationY((z9 && this.f0 == 0 && !H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            k3Var.setAlpha((!z9 && this.f0 == 0 && H()) ? 0.6f : 0.0f);
            k3Var.setTranslationY((!z9 && this.f0 == 0 && H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            o9Var.setAlpha((z9 || this.f0 != 0 || H()) ? 0.0f : 1.0f);
            o9Var.setTranslationY((z9 || this.f0 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Z1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k3Var2, (Property<k3, Float>) property, (z9 && this.f0 == 0 && !H()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(k3Var2, (Property<k3, Float>) property2, (z9 && this.f0 == 0 && !H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property, (!z9 && this.f0 == 0 && H()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property2, (!z9 && this.f0 == 0 && H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(o9Var, (Property<o9, Float>) property, (z9 || this.f0 != 0 || H()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(o9Var, (Property<o9, Float>) property2, (z9 || this.f0 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f));
        this.Z1.setDuration(260L);
        this.Z1.setInterpolator(xq.h);
        this.Z1.start();
    }

    public final void g0(di.t6 t6Var, boolean z9) {
        if (this.z2) {
            return;
        }
        aa aaVar = new aa(t6Var.b(), this.c, this.b, new z9(this, 0), null);
        aaVar.P1 = A();
        aaVar.setOnDismissListener(new y60(2, this, z9));
        this.X0.x(7, true);
        this.z2 = true;
        aaVar.show();
    }

    public final void h(Runnable runnable) {
        e7 e7Var;
        Runnable runnable2;
        ja jaVar;
        td0 td0Var = this.B1;
        if (td0Var == null || (e7Var = this.K1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        e7Var.j = td0Var.a() | e7Var.j;
        e7 e7Var2 = this.K1;
        td0 td0Var2 = this.B1;
        File file = e7Var2.Z0;
        if (file != null) {
            file.delete();
            e7Var2.Z0 = null;
        }
        hf savedFilterState = td0Var2.getSavedFilterState();
        e7Var2.a1 = savedFilterState;
        if (e7Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.a()) {
                Bitmap bitmap = td0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i7 = e7Var2.R;
                    matrix.postScale(i7 == 1 ? -1.0f : 1.0f, i7 == 2 ? -1.0f : 1.0f, e7Var2.k0 / 2.0f, e7Var2.l0 / 2.0f);
                    matrix.postRotate(-e7Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    e7Var2.n0.preScale(e7Var2.k0 / createBitmap.getWidth(), e7Var2.l0 / createBitmap.getHeight());
                    e7Var2.k0 = createBitmap.getWidth();
                    e7Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = e7Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        e7Var2.Z0.delete();
                    }
                    String k10 = e7.k(e7Var2.L);
                    boolean z9 = "png".equals(k10) || "webp".equals(k10);
                    e7Var2.Z0 = e7.w(e7Var2.a, z9 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z9 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(e7Var2.Z0));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.i.c(new aa.d0(e7Var2, createBitmap, z9, runnable2, 4));
                    }
                } else if (runnable != null) {
                    runnable.run();
                }
            } else if (runnable != null) {
                runnable.run();
            }
            runnable2 = runnable;
        }
        if (runnable2 == null) {
            e7 e7Var3 = this.K1;
            if (e7Var3.K || (jaVar = this.X0) == null) {
                return;
            }
            jaVar.set(e7Var3);
        }
    }

    public final void h0(boolean z9, boolean z10) {
        if (this.d2 == z9) {
            return;
        }
        this.d2 = z9;
        if (z10) {
            this.J0.animate().alpha(z9 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(xq.h).withEndAction(new e9(this, z9, 1)).start();
            return;
        }
        this.J0.clearAnimation();
        this.J0.setAlpha(z9 ? 1.0f : 0.0f);
        if (z9) {
            return;
        }
        this.J0.b(false, false);
    }

    public final void i() {
        if (this.K1 == null || this.D1 == null || this.h0.getMeasuredWidth() <= 0 || this.h0.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        if (this.K1.Q != 0) {
            matrix.postRotate(-r1, this.h0.getMeasuredWidth() / 2.0f, this.h0.getMeasuredHeight() / 2.0f);
            if ((this.K1.Q / 90) % 2 == 1) {
                matrix.postScale(this.h0.getMeasuredWidth() / this.h0.getMeasuredHeight(), this.h0.getMeasuredHeight() / this.h0.getMeasuredWidth(), this.h0.getMeasuredWidth() / 2.0f, this.h0.getMeasuredHeight() / 2.0f);
            }
        }
        matrix.postScale((1.0f / this.h0.getMeasuredWidth()) * this.K1.k0, (1.0f / this.h0.getMeasuredHeight()) * this.K1.l0);
        matrix.postConcat(this.K1.n0);
        matrix.postScale(this.h0.getMeasuredWidth() / this.K1.i0, this.h0.getMeasuredHeight() / this.K1.j0);
        this.D1.setTransform(matrix);
        this.D1.invalidate();
    }

    public final void i0(boolean z9) {
        s71 s71Var = this.V0;
        if ((s71Var.getTag() != null && z9) || (s71Var.getTag() == null && !z9)) {
            if (z9) {
                Runnable runnable = this.e2;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                u8 u8Var = new u8(this, 25);
                this.e2 = u8Var;
                org.telegram.messenger.g0.i3(u8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        s71Var.setTag(z9 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z9) {
            s71Var.setVisibility(0);
        }
        this.f2.playTogether(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        this.f2.addListener(new ch.y(13, this, z9));
        this.f2.start();
        if (z9) {
            u8 u8Var2 = new u8(this, 26);
            this.e2 = u8Var2;
            org.telegram.messenger.g0.i3(u8Var2, 2000L);
        }
    }

    public final void j() {
        di.j3 j3Var;
        if (this.J != 1) {
            return;
        }
        float left = this.h0.getLeft();
        float top = this.h0.getTop();
        float measuredWidth = this.h0.getMeasuredWidth();
        float measuredHeight = this.h0.getMeasuredHeight();
        RectF rectF = this.d0;
        rectF.set(left, top, measuredWidth, measuredHeight);
        rectF.offset(this.r.getX(), this.r.getY());
        float f10 = this.I;
        RectF rectF2 = this.H;
        RectF rectF3 = this.c0;
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
        this.h0.setAlpha(this.I);
        float f11 = rectF3.left;
        this.h0.setTranslationX((f11 - r3.getLeft()) - this.r.getX());
        float f12 = rectF3.top;
        this.h0.setTranslationY((f12 - r3.getTop()) - this.r.getY());
        qa qaVar = this.F;
        if (qaVar != null && (j3Var = qaVar.f) != null) {
            j3Var.setTranslationX((rectF.left - rectF2.left) * this.I);
            this.F.f.setTranslationY((rectF.top - rectF2.top) * this.I);
        }
        this.h0.setScaleX(rectF3.width() / this.h0.getMeasuredWidth());
        this.h0.setScaleY(rectF3.height() / this.h0.getMeasuredHeight());
        this.i0.setAlpha(this.I);
        this.k0.setAlpha(this.I);
        this.l0.setAlpha(this.I);
        if (this.f0 == 2) {
            this.u1.setAlpha(this.I);
        }
    }

    public final void j0() {
        s8 s8Var = this.q0;
        if (s8Var != null) {
            s8Var.dismiss();
            this.q0 = null;
        }
        s8 s8Var2 = new s8(86400, this.b, this.a);
        s8Var2.U0();
        s8Var2.W0(this.y0);
        TLRPC.InputPeer inputPeer = this.x0;
        if (inputPeer == null) {
            inputPeer = this.N != 0 ? qp.s1(this.c).j1(this.N) : new TLRPC.TL_inputPeerSelf();
        }
        s8Var2.V0(inputPeer);
        s8Var2.w1 = this.M;
        s8Var2.L1 = new v8(this, 18);
        s8Var2.L0(false);
        s8Var2.S0(1);
        s8Var2.Q0(false);
        s8Var2.N1 = new v8(this, 19);
        s8Var2.K1 = new d9(this, 11);
        this.q0 = s8Var2;
        s8Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        if (r2.isRecycled() != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        e7 e7Var;
        ImageReceiver photoImage;
        float f10;
        if (this.v1 == null || (e7Var = this.K1) == null) {
            return;
        }
        e7Var.f();
        this.K1.j |= this.v1.r0();
        e7 e7Var2 = this.K1;
        ArrayList arrayList = e7Var2.T0;
        if (arrayList == null) {
            e7Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        x9 x9Var = this.v1;
        e7 e7Var3 = this.K1;
        x9Var.q0(e7Var3.T0, false, false, false, false, e7Var3);
        e7 e7Var4 = this.K1;
        if (!e7Var4.K) {
            e7Var4.S0 = Utilities.k(this.v1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.v1.getMasks();
        this.K1.U0 = masks != null ? new ArrayList(masks) : null;
        e7 e7Var5 = this.K1;
        boolean z9 = e7Var5.K;
        boolean E = e7Var5.E();
        this.K1.T0 = new ArrayList();
        x9 x9Var2 = this.v1;
        e7 e7Var6 = this.K1;
        Bitmap q02 = x9Var2.q0(e7Var6.T0, true, false, false, !z9, e7Var6);
        if (this.K1.T0.isEmpty()) {
            this.K1.T0 = null;
        }
        try {
            File file = this.K1.P0;
            if (file != null) {
                file.delete();
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = this.K1.R0;
            if (file2 != null) {
                file2.delete();
            }
        } catch (Exception unused2) {
        }
        try {
            File file3 = this.K1.Q0;
            if (file3 != null) {
                file3.delete();
            }
        } catch (Exception unused3) {
        }
        e7 e7Var7 = this.K1;
        e7Var7.P0 = null;
        e7Var7.R0 = null;
        e7Var7.Q0 = null;
        int i7 = this.c;
        org.telegram.messenger.w7.G(i7);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        e7 e7Var8 = this.K1;
        e7Var7.P0 = org.telegram.messenger.w7.J(gc.a0(q02, compressFormat, e7Var8.i0, e7Var8.j0, 87), null, true, true);
        if (q02 != null && !q02.isRecycled()) {
            q02.recycle();
        }
        e7 e7Var9 = this.K1;
        if (e7Var9.u) {
            File file4 = e7Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.K1.Y0 = null;
            }
            e7 e7Var10 = this.K1;
            long j3 = e7Var10.z0;
            if (j3 != Long.MIN_VALUE) {
                Drawable drawable = e7Var10.x0;
                if (drawable == null) {
                    drawable = y5.e(null, i7, j3, this.c2);
                }
                if (drawable != null) {
                    this.K1.Y0 = e7.w(i7, "webp");
                    e7 e7Var11 = this.K1;
                    Bitmap createBitmap = Bitmap.createBitmap(e7Var11.i0, e7Var11.j0, Bitmap.Config.ARGB_8888);
                    e7.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.Y0));
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                    } finally {
                        if (!createBitmap.isRecycled()) {
                            createBitmap.recycle();
                        }
                    }
                }
            }
        }
        e7 e7Var12 = this.K1;
        if (e7Var12.u) {
            File file5 = e7Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                this.K1.X0 = null;
            }
            e7 e7Var13 = this.K1;
            if (e7Var13.u && e7Var13.K) {
                int i10 = e7Var13.k0;
                int i11 = e7Var13.l0;
                tg.u0 p02 = this.v1.p0();
                if (p02 != null) {
                    tg.p0 p0Var = p02.r0;
                    if (p0Var.getChildCount() == 1 && i10 > 0 && i11 > 0) {
                        int i12 = 0;
                        if ((p0Var.getChildAt(0) instanceof org.telegram.ui.Cells.q1) && (photoImage = ((org.telegram.ui.Cells.q1) p0Var.getChildAt(0)).getPhotoImage()) != null) {
                            float f11 = photoImage.M0;
                            if (((int) f11) > 0) {
                                float f12 = photoImage.N0;
                                if (((int) f12) > 0) {
                                    float f13 = i10;
                                    float f14 = i11;
                                    float max = Math.max(f11 / f13, f12 / f14);
                                    float f15 = 2.0f;
                                    int i13 = (int) ((f13 * max) / 2.0f);
                                    int i14 = (int) ((f14 * max) / 2.0f);
                                    Bitmap createBitmap2 = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
                                    float[] fArr = new float[8];
                                    while (true) {
                                        int[] iArr = photoImage.W0;
                                        f10 = f15;
                                        if (i12 >= iArr.length) {
                                            break;
                                        }
                                        int i15 = i12 * 2;
                                        float f16 = iArr[i12];
                                        fArr[i15] = f16;
                                        fArr[i15 + 1] = f16;
                                        i12++;
                                        f15 = f10;
                                    }
                                    Canvas canvas = new Canvas(createBitmap2);
                                    Path path = new Path();
                                    canvas.scale(0.5f, 0.5f);
                                    RectF rectF = org.telegram.messenger.g0.P;
                                    float f17 = (i13 * f10) / f10;
                                    float f18 = photoImage.M0 / f10;
                                    float f19 = (i14 * f10) / f10;
                                    float f20 = photoImage.N0 / f10;
                                    rectF.set(f17 - f18, f19 - f20, f18 + f17, f20 + f19);
                                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                    Paint paint = new Paint(1);
                                    paint.setColor(-1);
                                    canvas.drawPath(path, paint);
                                    try {
                                        this.K1.X0 = e7.w(i7, "webp");
                                        createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.X0));
                                    } catch (Exception e13) {
                                        org.telegram.messenger.a8.g(e13, true);
                                        this.K1.X0 = null;
                                    }
                                    createBitmap2.recycle();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!E) {
            x9 x9Var3 = this.v1;
            ArrayList arrayList2 = new ArrayList();
            e7 e7Var14 = this.K1;
            int i16 = e7Var14.i0;
            Bitmap q03 = x9Var3.q0(arrayList2, false, true, false, false, e7Var14);
            e7 e7Var15 = this.K1;
            org.telegram.messenger.w7.G(i7);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            e7 e7Var16 = this.K1;
            e7Var15.R0 = org.telegram.messenger.w7.J(gc.a0(q03, compressFormat2, e7Var16.i0, e7Var16.j0, 87), null, true, true);
            if (q03 != null && !q03.isRecycled()) {
                q03.recycle();
            }
        }
        if (this.v1.x0.getPainting().E) {
            Bitmap blurBitmap = this.v1.getBlurBitmap();
            e7 e7Var17 = this.K1;
            org.telegram.messenger.w7.G(i7);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            e7 e7Var18 = this.K1;
            e7Var17.Q0 = org.telegram.messenger.w7.J(gc.a0(blurBitmap, compressFormat3, e7Var18.i0, e7Var18.j0, 87), null, true, true);
            if (blurBitmap == null || blurBitmap.isRecycled()) {
                return;
            }
            blurBitmap.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x068d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07c3 A[LOOP:0: B:238:0x07c3->B:240:0x07c9, LOOP_START, PHI: r15
      0x07c3: PHI (r15v17 int) = (r15v16 int), (r15v18 int) binds: [B:232:0x078f, B:240:0x07c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0(int i7, boolean z9, boolean z10) {
        float f10;
        boolean z11;
        fa faVar;
        float f11;
        int i10;
        ga gaVar;
        int i11;
        float f12;
        e7 e7Var;
        ImageView imageView;
        int i12;
        int i13;
        float f13;
        float f14;
        md0 md0Var;
        kd0 kd0Var;
        ImageView imageView2;
        int i14;
        e7 e7Var2;
        x9 x9Var;
        x9 x9Var2;
        int i15 = this.g0;
        if (i15 == i7 && !z9) {
            return;
        }
        la laVar = this.c1;
        if (i7 != -1 && laVar != null && laVar.N1) {
            return;
        }
        this.g0 = i7;
        AnimatorSet animatorSet = this.r2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r2 = null;
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.p0;
        fb fbVar = this.Z0;
        t0 t0Var = this.e1;
        n2 n2Var = this.n0;
        p5 p5Var = this.j1;
        dh0 dh0Var = this.g1;
        if (i15 != i7) {
            if (i7 == -1) {
                n2Var.setVisibility(0);
                laVar.setVisibility(0);
                x9 x9Var3 = this.v1;
                if (x9Var3 != null) {
                    x9Var3.A0(null, true);
                }
                t0Var.setVisibility(0);
                e7 e7Var3 = this.K1;
                if (e7Var3 == null || !e7Var3.u) {
                    ImageView imageView3 = this.i1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    F().setVisibility(0);
                    n0(false);
                }
                l5Var.setVisibility(0);
                if (this.O1 == 1) {
                    dh0Var.setVisibility(0);
                    p5Var.setVisibility(0);
                } else {
                    e7 e7Var4 = this.K1;
                    if (e7Var4 != null && !TextUtils.isEmpty(e7Var4.y)) {
                        dh0Var.setVisibility(8);
                        p5Var.setVisibility(0);
                    }
                }
                fbVar.setVisibility(0);
            }
            if (i7 == 0 && (x9Var2 = this.v1) != null) {
                x9Var2.setVisibility(0);
            }
            if ((i7 == 0 || i15 == 0) && (x9Var = this.v1) != null) {
                x9Var.M0.setLayerType(2, null);
            }
            x9 x9Var4 = this.v1;
            if (x9Var4 != null) {
                x9Var4.x1.b(i7 != 0);
            }
            laVar.L.b(i7 != -1);
            cc.e();
            if (this.B1 != null && i15 == 1) {
                h(null);
            }
            sd0 sd0Var = this.C1;
            if (sd0Var != null) {
                sd0Var.setAllowTouch(false);
            }
            this.k1.f(true);
            ua uaVar = this.n;
            ja jaVar = this.X0;
            Activity activity = this.b;
            if (i7 == 3) {
                if (this.r1 == null) {
                    fa faVar2 = new fa(this, activity, jaVar);
                    this.r1 = faVar2;
                    uaVar.addView(faVar2.d);
                    uaVar.addView(this.r1);
                }
                this.r1.setVisibility(0);
                e7 e7Var5 = this.K1;
                if (e7Var5 != null) {
                    this.r1.setEntry(e7Var5);
                }
            } else if (i15 == 3) {
                jaVar.b();
                fa faVar3 = this.r1;
                if (faVar3 != null) {
                    faVar3.a.setCropEditorDrawing(faVar3);
                    faVar3.D = true;
                }
            }
            if (i7 == 4) {
                if (this.s1 == null) {
                    ga gaVar2 = new ga(this, activity, jaVar);
                    this.s1 = gaVar2;
                    uaVar.addView(gaVar2.e);
                    uaVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
            } else if (i15 == 4) {
                jaVar.b();
                ga gaVar3 = this.s1;
                if (gaVar3 != null) {
                    gaVar3.E = true;
                }
            }
        }
        this.b1.b((i7 == -1 || i7 == 2) && this.I > 0.0f, z10);
        ArrayList arrayList = new ArrayList();
        td0 td0Var = this.B1;
        boolean z12 = td0Var == null && i7 == 1;
        float f15 = 1.0f;
        if (i7 == 1) {
            r();
            td0 td0Var2 = this.B1;
            this.v2 = td0Var2;
            FrameLayout toolsView = td0Var2 != null ? td0Var2.getToolsView() : null;
            if (toolsView != null) {
                toolsView.setAlpha(0.0f);
                toolsView.setVisibility(0);
                f10 = 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
            if (i15 == 1 && td0Var != null) {
                this.v2 = null;
                z11 = z12;
                arrayList.add(ObjectAnimator.ofFloat(td0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.B1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i7 != 0) {
                    t();
                    this.v2 = this.v1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(n2Var, (Property<n2, Float>) property, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.v1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -org.telegram.messenger.g0.L(16.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property2, org.telegram.messenger.g0.L(48.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -org.telegram.messenger.g0.L(32.0f), f10));
                } else if (i15 == 0 && this.v1 != null) {
                    this.v2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(n2Var, (Property<n2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getTopLayout(), (Property<View, Float>) property3, f10));
                    View topLayout2 = this.v1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -org.telegram.messenger.g0.L(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property3, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property4, org.telegram.messenger.g0.L(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -org.telegram.messenger.g0.L(32.0f)));
                }
                faVar = this.r1;
                if (faVar == null) {
                    og.f fVar = faVar.h;
                    if (i7 == 3) {
                        Property property5 = View.ALPHA;
                        i10 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<og.f, Float>) property5, 0.0f, 1.0f));
                        og.f fVar2 = this.r1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f11 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar2, (Property<og.f, Float>) property6, org.telegram.messenger.g0.L(52.0f), f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property6, org.telegram.messenger.g0.L(52.0f), f10));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new g9(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        f11 = 52.0f;
                        i10 = 2;
                        if (i15 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<og.f, Float>) property7, 1.0f, 0.0f));
                            og.f fVar3 = this.r1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(fVar3, (Property<og.f, Float>) property8, f10, org.telegram.messenger.g0.L(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property8, f10, org.telegram.messenger.g0.L(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.r1.getAppearProgress(), f10);
                            ofFloat2.addUpdateListener(new g9(this, i10));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    f11 = 52.0f;
                    i10 = 2;
                }
                gaVar = this.s1;
                if (gaVar != null) {
                    og.f fVar4 = gaVar.n;
                    if (i7 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i10];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<og.f, Float>) property9, fArr));
                        og.f fVar5 = this.s1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i10];
                        fArr2[0] = org.telegram.messenger.g0.L(f11);
                        fArr2[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(fVar5, (Property<og.f, Float>) property10, fArr2));
                        float[] fArr3 = new float[i10];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.s1.r;
                        float[] fArr4 = new float[i10];
                        fArr4[0] = org.telegram.messenger.g0.L(f11);
                        fArr4[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i10];
                        fArr5[0] = this.s1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new g9(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i15 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i10];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<og.f, Float>) property11, fArr6));
                        og.f fVar6 = this.s1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float L = org.telegram.messenger.g0.L(f11);
                        float[] fArr7 = new float[i10];
                        fArr7[0] = f10;
                        fArr7[1] = L;
                        arrayList.add(ObjectAnimator.ofFloat(fVar6, (Property<og.f, Float>) property12, fArr7));
                        float[] fArr8 = new float[i10];
                        // fill-array-data instruction
                        fArr8[0] = 1.0f;
                        fArr8[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.s1.r;
                        float L2 = org.telegram.messenger.g0.L(f11);
                        float[] fArr9 = new float[i10];
                        fArr9[0] = f10;
                        fArr9[1] = L2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i10];
                        fArr10[0] = this.s1.getAppearProgress();
                        fArr10[1] = f10;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new g9(this, 4));
                        arrayList.add(ofFloat4);
                    }
                }
                Property property13 = View.ALPHA;
                if (i7 != -1 || i7 == 2) {
                    i11 = 1;
                    if (this.O1 == 1) {
                        f12 = 1.0f;
                        float[] fArr11 = new float[i11];
                        fArr11[0] = f12;
                        arrayList.add(ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(p5Var, (Property<p5, Float>) property13, ((i7 != -1 || i7 == 2) && (this.O1 == i11 || !((e7Var = this.K1) == null || TextUtils.isEmpty(e7Var.y)))) ? 1.0f : f10));
                        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property13, (i7 != -1 || i7 == 2) ? 1.0f : f10));
                        imageView = this.i1;
                        if (imageView != null) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i7 == -1 || i7 == 2) && (e7Var2 = this.K1) != null && e7Var2.u) ? 1.0f : f10));
                        } else {
                            i12 = 1;
                        }
                        int i16 = this.f0;
                        float[] fArr12 = new float[i12];
                        fArr12[0] = ((i16 != i12 || i16 == 2) && i7 == -1) ? 1.0f : f10;
                        arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property13, fArr12));
                        ha haVar = this.h0;
                        if (i7 == i12) {
                            haVar.setPivotY(haVar.getMeasuredHeight() * 0.2f);
                            i13 = org.telegram.messenger.g0.L(164.0f);
                        } else if (i7 == 0) {
                            haVar.setPivotY(haVar.getMeasuredHeight() * 0.6f);
                            i13 = org.telegram.messenger.g0.L(40.0f);
                        } else if (i7 == 2) {
                            haVar.setPivotY(f10);
                            i13 = fbVar.getContentHeight() + org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i13 = 0;
                        }
                        if (i13 > 0) {
                            f13 = (r10 - i13) / (haVar.getHeight() - ((int) haVar.getPivotY()));
                        } else {
                            f13 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) View.SCALE_X, f13));
                        arrayList.add(ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) View.SCALE_Y, f13));
                        if (i7 == -1) {
                            f14 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) View.TRANSLATION_Y, 0.0f));
                        } else {
                            f14 = 0.0f;
                        }
                        md0Var = this.F1;
                        if (md0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(md0Var, (Property<md0, Float>) property13, i7 == 1 ? 1.0f : f14));
                        }
                        kd0Var = this.E1;
                        if (kd0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(kd0Var, (Property<kd0, Float>) property13, i7 == 1 ? 1.0f : f14));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property13, i7 == -1 ? 1.0f : f14));
                        float[] fArr13 = {(i7 != -1 || i7 == 2) ? 1.0f : f14};
                        bi.e5 e5Var = this.l0;
                        arrayList.add(ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) property14, (i7 != -1 || i7 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
                        if (i7 != -1 && i7 != 2) {
                            f15 = f14;
                        }
                        FrameLayout frameLayout3 = this.Y0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f15));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i7 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + laVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.j0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i7 == 2 ? -90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(p5Var, (Property<p5, Float>) property15, i7 == 2 ? 90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) property15, i7 == 2 ? 90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property15, i7 == 2 ? 90.0f : f14));
                        imageView2 = this.i1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i7 == 2 ? 90.0f : f14));
                        }
                        if (this.r0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i14 = 0;
                            ofFloat5.addUpdateListener(new w9(this, i14));
                            arrayList.add(ofFloat5);
                        } else {
                            i14 = 0;
                        }
                        if (fbVar != null) {
                            e7 e7Var6 = this.K1;
                            boolean z13 = (e7Var6 == null || !e7Var6.v() || !this.K1.t() || i7 == 2) ? 1 : i14;
                            if (fbVar.j0 != z13 || !z10) {
                                fbVar.j0 = z13;
                                if (!z10) {
                                    fbVar.i0.f(z13, true);
                                }
                                fbVar.invalidate();
                            }
                        }
                        if (!z10) {
                            while (i14 < arrayList.size()) {
                                Animator animator = (Animator) arrayList.get(i14);
                                animator.setDuration(1L);
                                animator.start();
                                i14++;
                            }
                            if (i15 != i7) {
                                P(i15, i7);
                                return;
                            }
                            return;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.r2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.r2.setDuration(320L);
                        this.r2.setInterpolator(xq.h);
                        this.r2.addListener(new t9(this, i15, i7, 1));
                        if (z11) {
                            this.r2.setStartDelay(120L);
                        }
                        this.r2.start();
                        return;
                    }
                } else {
                    i11 = 1;
                }
                f12 = f10;
                float[] fArr112 = new float[i11];
                fArr112[0] = f12;
                arrayList.add(ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(p5Var, (Property<p5, Float>) property13, ((i7 != -1 || i7 == 2) && (this.O1 == i11 || !((e7Var = this.K1) == null || TextUtils.isEmpty(e7Var.y)))) ? 1.0f : f10));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property13, (i7 != -1 || i7 == 2) ? 1.0f : f10));
                imageView = this.i1;
                if (imageView != null) {
                }
                int i162 = this.f0;
                float[] fArr122 = new float[i12];
                fArr122[0] = ((i162 != i12 || i162 == 2) && i7 == -1) ? 1.0f : f10;
                arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property13, fArr122));
                ha haVar2 = this.h0;
                if (i7 == i12) {
                }
                if (i13 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(haVar2, (Property<ha, Float>) View.SCALE_X, f13));
                arrayList.add(ObjectAnimator.ofFloat(haVar2, (Property<ha, Float>) View.SCALE_Y, f13));
                if (i7 == -1) {
                }
                md0Var = this.F1;
                if (md0Var != null) {
                }
                kd0Var = this.E1;
                if (kd0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property13, i7 == -1 ? 1.0f : f14));
                float[] fArr132 = {(i7 != -1 || i7 == 2) ? 1.0f : f14};
                bi.e5 e5Var2 = this.l0;
                arrayList.add(ObjectAnimator.ofFloat(e5Var2, (Property<bi.e5, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(e5Var2, (Property<bi.e5, Float>) property142, (i7 != -1 || i7 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
                if (i7 != -1) {
                    f15 = f14;
                }
                FrameLayout frameLayout32 = this.Y0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f15));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i7 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + laVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.j0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i7 == 2 ? -90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(p5Var, (Property<p5, Float>) property152, i7 == 2 ? 90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) property152, i7 == 2 ? 90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property152, i7 == 2 ? 90.0f : f14));
                imageView2 = this.i1;
                if (imageView2 != null) {
                }
                if (this.r0.c()) {
                }
                if (fbVar != null) {
                }
                if (!z10) {
                }
            }
        }
        z11 = z12;
        if (i7 != 0) {
        }
        faVar = this.r1;
        if (faVar == null) {
        }
        gaVar = this.s1;
        if (gaVar != null) {
        }
        Property property132 = View.ALPHA;
        if (i7 != -1) {
        }
        i11 = 1;
        if (this.O1 == 1) {
        }
        f12 = f10;
        float[] fArr1122 = new float[i11];
        fArr1122[0] = f12;
        arrayList.add(ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(p5Var, (Property<p5, Float>) property132, ((i7 != -1 || i7 == 2) && (this.O1 == i11 || !((e7Var = this.K1) == null || TextUtils.isEmpty(e7Var.y)))) ? 1.0f : f10));
        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property132, (i7 != -1 || i7 == 2) ? 1.0f : f10));
        imageView = this.i1;
        if (imageView != null) {
        }
        int i1622 = this.f0;
        float[] fArr1222 = new float[i12];
        fArr1222[0] = ((i1622 != i12 || i1622 == 2) && i7 == -1) ? 1.0f : f10;
        arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property132, fArr1222));
        ha haVar22 = this.h0;
        if (i7 == i12) {
        }
        if (i13 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(haVar22, (Property<ha, Float>) View.SCALE_X, f13));
        arrayList.add(ObjectAnimator.ofFloat(haVar22, (Property<ha, Float>) View.SCALE_Y, f13));
        if (i7 == -1) {
        }
        md0Var = this.F1;
        if (md0Var != null) {
        }
        kd0Var = this.E1;
        if (kd0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property132, i7 == -1 ? 1.0f : f14));
        float[] fArr1322 = {(i7 != -1 || i7 == 2) ? 1.0f : f14};
        bi.e5 e5Var22 = this.l0;
        arrayList.add(ObjectAnimator.ofFloat(e5Var22, (Property<bi.e5, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(e5Var22, (Property<bi.e5, Float>) property1422, (i7 != -1 || i7 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
        if (i7 != -1) {
        }
        FrameLayout frameLayout322 = this.Y0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f15));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i7 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + laVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.j0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i7 == 2 ? -90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(p5Var, (Property<p5, Float>) property1522, i7 == 2 ? 90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) property1522, i7 == 2 ? 90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property1522, i7 == 2 ? 90.0f : f14));
        imageView2 = this.i1;
        if (imageView2 != null) {
        }
        if (this.r0.c()) {
        }
        if (fbVar != null) {
        }
        if (!z10) {
        }
    }

    public final void l() {
        e7 e7Var;
        if (this.v1 == null || (e7Var = this.K1) == null || !e7Var.u) {
            return;
        }
        File file = e7Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.K1.W0 = null;
        }
        this.K1.W0 = e7.w(this.c, "webp");
        x9 x9Var = this.v1;
        e7 e7Var2 = this.K1;
        Bitmap q02 = x9Var.q0(e7Var2.T0, false, false, true, this.O1 != 1, e7Var2);
        try {
            try {
                q02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                if (q02.isRecycled()) {
                    return;
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                try {
                    this.K1.W0.delete();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                this.K1.W0 = null;
                if (q02 == null || q02.isRecycled()) {
                    return;
                }
            }
            q02.recycle();
        } catch (Throwable th2) {
            if (q02 != null && !q02.isRecycled()) {
                q02.recycle();
            }
            throw th2;
        }
    }

    public final void l0(boolean z9) {
        y9 y9Var;
        boolean z10 = false;
        h0(this.f0 == 0 && this.O1 == 1 && !this.I0.e && !H(), z9);
        this.G0.setSelected(this.A0.j());
        y yVar = this.I0;
        b0(this.n0, yVar == null || !yVar.e, z9);
        b0(this.E0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.Y1 == null || this.I0.e || H()) ? false : true, z9);
        b0(this.F0, (this.a2 || this.O1 == -1 || this.f0 != 0 || (y9Var = this.B0) == null || !y9Var.a || this.I0.e || this.A0.j()) ? false : true, z9);
        b0(this.G0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.I0.e) ? false : true, z9);
        b0(this.H0, this.I0.e, z9);
        this.O0.e(z9, this.A0.j() ? this.A0.getFilledProgress() : 0.0f);
        boolean z11 = this.I0.e;
        m3 m3Var = this.n1;
        if (z11) {
            m3Var.w();
        } else {
            m3Var.f(true);
        }
        g(this.a2, z9);
        org.telegram.messenger.g0.V3(this.S0, this.O1 == -1 && this.f0 == 0, true);
        if (this.O1 == -1 && this.f0 == 0) {
            z10 = true;
        }
        org.telegram.messenger.g0.V3(this.R0, z10, true);
    }

    public final void m0() {
        this.H0.setTranslationX(-0.0f);
        float alpha = (this.H0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + 0.0f;
        this.F0.setTranslationX(-alpha);
        float alpha2 = (this.F0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + alpha;
        this.G0.setTranslationX(-alpha2);
        float alpha3 = (this.G0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + alpha2;
        this.E0.setTranslationX(-alpha3);
        float alpha4 = (this.E0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + alpha3;
        this.n0.setTranslationX(0.0f);
        v vVar = this.I0.a;
        vVar.setPadding((int) ((this.n0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + 0.0f + org.telegram.messenger.g0.L(8.0f)), 0, (int) (alpha4 + org.telegram.messenger.g0.L(8.0f)), 0);
        vVar.invalidate();
    }

    public final void n() {
        boolean z9 = this.K != 0.0f || this.I < 1.0f || this.B2;
        if (z9 == this.A2) {
            return;
        }
        bg.v0 v0Var = this.D;
        if (v0Var != null) {
            v0Var.c(!z9);
        }
        this.A2 = z9;
    }

    public final void n0(boolean z9) {
        ah0 ah0Var = this.h1;
        if (ah0Var != null) {
            int[] iArr = ah0Var.e;
            int i7 = 0;
            if (!z9) {
                e7 e7Var = this.K1;
                int i10 = (e7Var == null || !e7Var.y0) ? 0 : iArr[0] - 1;
                ah0Var.N(i10, false, true);
                this.h1.P(i10);
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            e7 e7Var2 = this.K1;
            if (e7Var2 != null && e7Var2.y0) {
                i7 = iArr[0];
            }
            ah0Var.P(i7);
            ah0 ah0Var2 = this.h1;
            if (ah0Var2 != null) {
                ah0Var2.start();
            }
        }
    }

    public final void o() {
        if (this.t2 < 0) {
            this.t2 = qp.e1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.u2 = arrayList;
            arrayList.add("off");
            this.u2.add("auto");
            this.u2.add("on");
            float f10 = qp.e1().getFloat("frontflash_warmth", 0.9f);
            p2 p2Var = this.s;
            p2Var.o = f10;
            p2Var.n = p2.f(f10);
            p2Var.g();
            float f11 = qp.e1().getFloat("frontflash_intensity", 1.0f);
            p2 p2Var2 = this.s;
            p2Var2.p = f11;
            p2Var2.i();
        }
    }

    public final void o0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        u8 u8Var = new u8(this, 2);
        x9 x9Var = this.v1;
        e7 e7Var = this.K1;
        if (x9Var == null || e7Var == null) {
            u8Var.run();
            return;
        }
        e7Var.f();
        boolean r02 = x9Var.r0();
        boolean z9 = x9Var.x0.getPainting().E;
        Utilities.g.c(new x8(this, x9Var, e7Var.i0, e7Var.j0, e7Var, z9, r02, u8Var, 1));
    }

    public final void p(boolean z9) {
        ja jaVar;
        if (this.d) {
            s8 s8Var = this.q0;
            if (s8Var != null) {
                s8Var.dismiss();
                this.q0 = null;
            }
            e7 e7Var = this.K1;
            long j3 = 0;
            if (e7Var != null && !e7Var.h) {
                if ((this.w && e7Var.g) || e7Var.b != 0) {
                    e7Var.j = false;
                }
                e7Var.i(false);
            }
            this.K1 = null;
            z10 z10Var = this.R;
            if (z10Var == null || (jaVar = this.X0) == null) {
                ja jaVar2 = this.X0;
                if (jaVar2 != null && !z9) {
                    jaVar2.set(null);
                }
                f(0.0f, z9, new u8(this, 23));
                int i7 = this.J;
                if (i7 == 1 || i7 == 0) {
                    this.n.setBackgroundColor(0);
                    this.b1.b(false, true);
                }
                qs.e().n(this, qs.r2);
                int i10 = this.c;
                qs.f(i10).n(this, qs.y5);
                qs.f(i10).n(this, qs.b3);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            u51 u51Var = jaVar.D;
            if (u51Var != null) {
                u51Var.g0();
                jaVar.D.m0();
                jaVar.D = null;
            }
            u51 u51Var2 = jaVar.y;
            if (u51Var2 != null) {
                j3 = u51Var2.S();
                jaVar.y.g0();
                jaVar.y.m0();
                jaVar.y = null;
            }
            u51 u51Var3 = jaVar.e;
            if (u51Var3 != null) {
                j3 = u51Var3.S();
                jaVar.e.g0();
                jaVar.e.m0();
                jaVar.e = null;
            }
            z10Var.a(Long.valueOf(j3), new e9(this, z9, 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
        }
    }

    public final boolean p0() {
        y9 y9Var;
        if ((!this.P1 && !this.Q1) || (y9Var = this.B0) == null || !y9Var.isFrontface()) {
            return false;
        }
        int i7 = this.t2;
        return i7 == 2 || (i7 == 1 && this.c2);
    }

    public final void q() {
        Activity activity = this.b;
        if (this.B0 != null || activity == null) {
            return;
        }
        this.B0 = new y9(this, activity, qp.e1().getBoolean("stories_camera", false));
        g6 g6Var = this.O0;
        if (g6Var != null) {
            g6Var.g0 = 0.0f;
            g6Var.h0.e(true, 0.0f);
        }
        this.B0.recordHevc = !this.A0.j();
        this.B0.setThumbDrawable(z());
        this.B0.initTexture();
        this.B0.setDelegate(new d9(this, 0));
        b0(this.F0, this.B0.a && this.f0 == 0, true);
        this.G0.setTranslationX(this.B0.a ? 0.0f : org.telegram.messenger.g0.L(46.0f));
        this.A0.setCameraView(this.B0);
        if (qp.e1().getInt("storyhint2", 0) < 1) {
            this.W0.w();
            qp.e1().edit().putInt("storyhint2", qp.e1().getInt("storyhint2", 0) + 1).apply();
        } else if ((!b1.q(this.B0.getContext()) || !qp.e1().getBoolean("dualcam", b1.p(org.telegram.messenger.t0.b, false))) && this.B0.a && qp.e1().getInt("storydualhint", 0) < 2) {
            this.l1.w();
        }
        if (this.C0 == null) {
            this.C0 = new c6(activity, new v8(this, 3));
        }
        this.C0.a(this.B0);
        q6 q6Var = this.D0;
        if (q6Var != null) {
            ia iaVar = this.A0;
            Object blurRenderNode = iaVar.getBlurRenderNode();
            q6Var.F = iaVar;
            q6Var.G = blurRenderNode;
            q6Var.invalidate();
        }
    }

    public final void r() {
        e7 e7Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.B1 != null || (e7Var = this.K1) == null) {
            return;
        }
        if (e7Var.K) {
            bitmap = null;
        } else {
            if (e7Var.Z0 == null) {
                q10 = this.X0.getPhotoBitmap();
            } else {
                d9 d9Var = new d9(this, 10);
                Point point = org.telegram.messenger.g0.q;
                q10 = e7.q(d9Var, point.x, point.y, 0, true);
            }
            bitmap = q10;
        }
        if (bitmap != null || this.K1.K) {
            i51 textureView = this.X0.getTextureView();
            int orientation = this.X0.getOrientation();
            e7 e7Var2 = this.K1;
            td0 td0Var = new td0(this.b, textureView, bitmap, null, orientation, e7Var2 != null ? e7Var2.a1 : null, null, 0, false, false, this.r0, this.a);
            this.B1 = td0Var;
            this.r.addView(td0Var);
            sd0 sd0Var = this.C1;
            if (sd0Var != null) {
                sd0Var.setFilterView(this.B1);
            }
            TextureView myTextureView = this.B1.getMyTextureView();
            this.D1 = myTextureView;
            if (myTextureView != null) {
                myTextureView.setOpaque(false);
            }
            this.X0.o(this.D1, this.B1);
            TextureView textureView2 = this.D1;
            if (textureView2 != null) {
                textureView2.setAlpha(0.0f);
                this.D1.animate().alpha(1.0f).setDuration(220L).start();
            }
            i();
            kd0 blurControl = this.B1.getBlurControl();
            this.E1 = blurControl;
            if (blurControl != null) {
                this.h0.addView(blurControl);
            }
            md0 curveControl = this.B1.getCurveControl();
            this.F1 = curveControl;
            if (curveControl != null) {
                this.h0.addView(curveControl);
            }
            U();
            this.B1.getDoneTextView().setOnClickListener(new w8(this, 13));
            this.B1.getCancelTextView().setOnClickListener(new w8(this, 14));
            this.B1.getToolsView().setVisibility(8);
            this.B1.getToolsView().setAlpha(0.0f);
            this.B1.getToolsView().setTranslationY(org.telegram.messenger.g0.L(186.0f));
            this.B1.i0.setVisibility(0);
        }
    }

    public final void s(boolean z9) {
        if (this.M0 != null) {
            ia iaVar = this.A0;
            if ((iaVar != null && iaVar.j()) == this.M0.P) {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (this.M0 != null) {
            v();
        }
        we weVar = this.m2;
        boolean z10 = !z9;
        ia iaVar2 = this.A0;
        i3 i3Var = new i3(this, this.c, this.b, this.a, weVar, z9, z10, iaVar2 != null && iaVar2.j());
        this.M0 = i3Var;
        i3Var.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new m9(this, 1));
        this.M0.setOnSelectListener(new l9(0, this, z9));
        this.M0.setOnSelectMultipleListener(new bi.h2(this, 2));
        v4.a0 a0Var = this.l2;
        if (a0Var != null) {
            ei.h hVar = this.M0.e;
            hVar.B = a0Var;
            hVar.l0();
        }
        this.n.addView(this.M0, c8.ha.e(-1, -1, qs.E1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a6  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        Bitmap bitmap;
        boolean z9;
        e7 e7Var;
        File file;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        boolean z13;
        e7 e7Var2;
        sg.v0 renderView;
        View renderInputView;
        View textDimView;
        View entitiesView;
        View selectionEntitiesView;
        File file2;
        File file3;
        if (this.v1 != null) {
            return;
        }
        Pair<Integer, Integer> paintSize = this.X0.getPaintSize();
        e7 e7Var3 = this.K1;
        Bitmap decodeFile = (e7Var3 == null || !(e7Var3.c || e7Var3.g || this.H1 != null) || (file3 = e7Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        e7 e7Var4 = this.K1;
        if (e7Var4 == null || (!(e7Var4.c || e7Var4.g || this.H1 != null) || (file2 = e7Var4.Q0) == null)) {
            bitmap = null;
        } else {
            bitmap = BitmapFactory.decodeFile(file2.getPath());
            if (bitmap != null) {
                z9 = true;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap3 = bitmap;
                int measuredWidth = this.h0.getMeasuredWidth();
                int measuredHeight = this.h0.getMeasuredHeight();
                e7Var = this.K1;
                if (e7Var != null || e7Var.M) {
                    file = null;
                    z10 = false;
                } else {
                    file = null;
                    z10 = true;
                }
                File file4 = e7Var != null ? file : e7Var.L;
                if (e7Var == null && e7Var.K) {
                    z11 = z9;
                    z12 = true;
                } else {
                    z11 = z9;
                    z12 = false;
                }
                if (e7Var != null || e7Var.J0 == 0) {
                    obj = file;
                    z13 = false;
                } else {
                    obj = file;
                    z13 = true;
                }
                int orientation = this.X0.getOrientation();
                e7Var2 = this.K1;
                Object obj2 = obj;
                if (e7Var2 != null) {
                    obj2 = e7Var2.T0;
                }
                ?? r13 = obj2;
                ye yeVar = new ye();
                x5 x5Var = this.s0;
                ja jaVar = this.X0;
                Activity activity = this.b;
                boolean z14 = z11;
                x9 x9Var = new x9(this, activity, z10, file4, z12, z13, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, e7Var2, measuredWidth, measuredHeight, yeVar, this.r0, this.a, x5Var, jaVar);
                this.v1 = x9Var;
                e7 e7Var5 = this.K1;
                x9Var.setHasAudio(e7Var5 == null && e7Var5.y != null);
                this.v1.setBlurManager(this.r0);
                this.r.addView(this.v1);
                renderView = this.v1.getRenderView();
                this.w1 = renderView;
                if (renderView != null) {
                    renderView.getPainting().E = z14;
                    this.h0.addView(this.w1);
                }
                renderInputView = this.v1.getRenderInputView();
                this.x1 = renderInputView;
                if (renderInputView != null) {
                    this.h0.addView(renderInputView);
                }
                textDimView = this.v1.getTextDimView();
                this.y1 = textDimView;
                if (textDimView != null) {
                    this.h0.addView(textDimView);
                }
                entitiesView = this.v1.getEntitiesView();
                this.z1 = entitiesView;
                if (entitiesView != null) {
                    this.h0.addView(entitiesView);
                }
                selectionEntitiesView = this.v1.getSelectionEntitiesView();
                this.A1 = selectionEntitiesView;
                if (selectionEntitiesView != null) {
                    this.h0.addView(selectionEntitiesView);
                }
                U();
                this.v1.setOnDoneButtonClickedListener(new u8(this, 21));
                this.v1.setOnCancelButtonClickedListener(new u8(this, 22));
                x9 x9Var2 = this.v1;
                x9Var2.A0.setVisibility(0);
                x9Var2.x0.setVisibility(0);
                x9Var2.y0.setVisibility(0);
            }
        }
        z9 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.h0.getMeasuredWidth();
        int measuredHeight2 = this.h0.getMeasuredHeight();
        e7Var = this.K1;
        if (e7Var != null) {
        }
        file = null;
        z10 = false;
        if (e7Var != null) {
        }
        if (e7Var == null) {
        }
        z11 = z9;
        z12 = false;
        if (e7Var != null) {
        }
        obj = file;
        z13 = false;
        int orientation2 = this.X0.getOrientation();
        e7Var2 = this.K1;
        Object obj22 = obj;
        if (e7Var2 != null) {
        }
        ?? r132 = obj22;
        ye yeVar2 = new ye();
        x5 x5Var2 = this.s0;
        ja jaVar2 = this.X0;
        Activity activity2 = this.b;
        boolean z142 = z11;
        x9 x9Var3 = new x9(this, activity2, z10, file4, z12, z13, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, e7Var2, measuredWidth2, measuredHeight2, yeVar2, this.r0, this.a, x5Var2, jaVar2);
        this.v1 = x9Var3;
        e7 e7Var52 = this.K1;
        x9Var3.setHasAudio(e7Var52 == null && e7Var52.y != null);
        this.v1.setBlurManager(this.r0);
        this.r.addView(this.v1);
        renderView = this.v1.getRenderView();
        this.w1 = renderView;
        if (renderView != null) {
        }
        renderInputView = this.v1.getRenderInputView();
        this.x1 = renderInputView;
        if (renderInputView != null) {
        }
        textDimView = this.v1.getTextDimView();
        this.y1 = textDimView;
        if (textDimView != null) {
        }
        entitiesView = this.v1.getEntitiesView();
        this.z1 = entitiesView;
        if (entitiesView != null) {
        }
        selectionEntitiesView = this.v1.getSelectionEntitiesView();
        this.A1 = selectionEntitiesView;
        if (selectionEntitiesView != null) {
        }
        U();
        this.v1.setOnDoneButtonClickedListener(new u8(this, 21));
        this.v1.setOnCancelButtonClickedListener(new u8(this, 22));
        x9 x9Var22 = this.v1;
        x9Var22.A0.setVisibility(0);
        x9Var22.x0.setVisibility(0);
        x9Var22.y0.setVisibility(0);
    }

    public final void u(boolean z9) {
        c6 c6Var = this.C0;
        if (c6Var != null) {
            c6Var.f = null;
            Utilities.e.a(c6Var.h);
            this.C0 = null;
            ia iaVar = this.A0;
            if (iaVar != null) {
                iaVar.c.a(null);
            }
        }
        q6 q6Var = this.D0;
        if (q6Var != null) {
            q6Var.F = null;
            q6Var.G = null;
            q6Var.invalidate();
        }
        if (this.B0 != null) {
            if (z9) {
                a0(new u8(this, 8));
                return;
            }
            a0(new u8(this, 9));
            this.B0.destroy(true, null);
            org.telegram.messenger.g0.E2(this.B0);
            ia iaVar2 = this.A0;
            if (iaVar2 != null) {
                iaVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void v() {
        i3 i3Var = this.M0;
        if (i3Var == null) {
            return;
        }
        this.n.removeView(i3Var);
        this.M0 = null;
        ValueAnimator valueAnimator = this.n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n2 = null;
        }
        r1.g gVar = this.o2;
        if (gVar != null) {
            gVar.d();
            this.o2 = null;
        }
        this.p2 = null;
    }

    public final void x() {
        td0 td0Var = this.B1;
        if (td0Var == null) {
            return;
        }
        td0Var.b();
        this.C1.setFilterView(null);
        this.r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        kd0 kd0Var = this.E1;
        if (kd0Var != null) {
            this.h0.removeView(kd0Var);
            this.E1 = null;
        }
        md0 md0Var = this.F1;
        if (md0Var != null) {
            this.h0.removeView(md0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void y() {
        x9 x9Var = this.v1;
        if (x9Var == null) {
            return;
        }
        x9Var.A0.removeAllViews();
        x9 x9Var2 = this.v1;
        x9Var2.x0.h();
        x9Var2.A0.setVisibility(8);
        x9Var2.z0.setVisibility(8);
        x9Var2.n0.postRunnable(new ai.m0(11));
        c5 c5Var = x9Var2.T1;
        if (c5Var != null) {
            c5Var.dismiss();
        }
        sg.q qVar = x9Var2.C1;
        if (qVar != null) {
            qVar.dismiss();
        }
        this.r.removeView(this.v1);
        this.v1 = null;
        sg.v0 v0Var = this.w1;
        if (v0Var != null) {
            this.h0.removeView(v0Var);
            this.w1 = null;
        }
        View view = this.y1;
        if (view != null) {
            this.h0.removeView(view);
            this.y1 = null;
        }
        View view2 = this.x1;
        if (view2 != null) {
            this.h0.removeView(view2);
            this.x1 = null;
        }
        View view3 = this.z1;
        if (view3 != null) {
            this.h0.removeView(view3);
            this.z1 = null;
        }
        View view4 = this.A1;
        if (view4 != null) {
            this.h0.removeView(view4);
            this.A1 = null;
        }
    }

    public final Drawable z() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        return bitmap != null ? new BitmapDrawable(bitmap) : this.b.getResources().getDrawable(R.drawable.icplaceholder);
    }
}
