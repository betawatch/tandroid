package hi;

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
import org.telegram.messenger.ff;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.t10;
import org.telegram.messenger.tr;
import org.telegram.messenger.ue;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class nb implements fs {
    public static nb G2;
    public c0 A0;
    public View A1;
    public boolean A2;
    public final ab B0;
    public View B1;
    public boolean B2;
    public qa C0;
    public de0 C1;
    public boolean C2;
    public j6 D0;
    public final ce0 D1;
    public va D2;
    public final bg.v0 E;
    public final x6 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final yb F0;
    public ud0 F1;
    public ValueAnimator F2;
    public ib G;
    public final zb G0;
    public wd0 G1;
    public float H;
    public final i0 H0;
    public File H1;
    public final RectF I;
    public final yb I0;
    public ArrayList I1;
    public float J;
    public final h0 J0;
    public ArrayList J1;
    public int K;
    public final cc K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public x7 L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public p3 N0;
    public long N1;
    public long O;
    public e1 O0;
    public boolean O1;
    public boolean P;
    public final n6 P0;
    public int P1;
    public final h2.f Q;
    public final e Q0;
    public boolean Q1;
    public Runnable R;
    public final ha R0;
    public boolean R1;
    public t10 S;
    public final u2 S0;
    public boolean S1;
    public int T;
    public final u2 T0;
    public boolean T1;
    public int U;
    public final r3 U0;
    public float U1;
    public int V;
    public final r3 V0;
    public int V1;
    public boolean W;
    public final g81 W0;
    public boolean W1;
    public boolean X;
    public final u3 X0;
    public boolean X1;
    public boolean Y;
    public final bb Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final fi.b a;
    public int a0;
    public final xb a1;
    public AnimatorSet a2;
    public final Activity b;
    public int b0;
    public final bc b1;
    public boolean b2;
    public final int c;
    public int c0;
    public final z5 c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final db d1;
    public boolean d2;
    public boolean e;
    public final RectF e0;
    public final ga e1;
    public boolean e2;
    public final WindowManager f;
    public final Path f0;
    public final d1 f1;
    public Runnable f2;
    public int g0;
    public nh0 g1;
    public AnimatorSet g2;
    public final WindowManager.LayoutParams h;
    public int h0;
    public final qh0 h1;
    public s9 h2;
    public final za i0;
    public nh0 i1;
    public boolean i2;
    public final FrameLayout j0;
    public ImageView j1;
    public AnimatorSet j2;
    public final LinearLayout k0;
    public final w5 k1;
    public ValueAnimator k2;
    public final FrameLayout l0;
    public final u3 l1;
    public boolean l2;
    public final bi.g3 m0;
    public final u3 m1;
    public v4.b0 m2;
    public final mb n;
    public final FrameLayout n0;
    public final u3 n1;
    public ue n2;
    public final u2 o0;
    public final u3 o1;
    public ValueAnimator o2;
    public final f7 p0;
    public final a6 p1;
    public r1.g p2;
    public final org.telegram.ui.ActionBar.n5 q0;
    public final ac q1;
    public Boolean q2;
    public final fb r;
    public k9 r0;
    public q r1;
    public w9 r2;
    public final w2 s;
    public final org.telegram.ui.Components.ba s0;
    public xa s1;
    public AnimatorSet s2;
    public final e6 t0;
    public ya t1;
    public boolean t2;
    public final bi.o3 u0;
    public final xb u1;
    public int u2;
    public boolean v0;
    public final e v1;
    public ArrayList v2;
    public boolean w;
    public long w0;
    public pa w1;
    public FrameLayout w2;
    public long x;
    public String x0;
    public sg.t0 x1;
    public boolean x2;
    public eb y;
    public TLRPC.InputPeer y0;
    public View y1;
    public m9 y2;
    public i9 z0;
    public View z1;
    public ai.u0 z2;

    public nb(Activity activity, int i7) {
        int i10;
        fi.b bVar = new fi.b();
        this.a = bVar;
        this.x = 0L;
        this.I = new RectF();
        int i11 = 1;
        this.N = true;
        this.Q = new h2.f((int[]) null);
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new Path();
        new Rect();
        int i12 = 0;
        this.g0 = 0;
        this.h0 = -1;
        this.z0 = new i9();
        this.I1 = null;
        this.J1 = null;
        this.K1 = null;
        this.P1 = 0;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.V1 = -3;
        this.X1 = false;
        ka kaVar = new ka(this);
        this.e2 = true;
        this.l2 = true;
        this.u2 = -1;
        this.b = activity;
        this.c = i7;
        LaunchActivity launchActivity = LaunchActivity.H1;
        this.E = launchActivity != null ? new bg.v0(launchActivity, true) : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        org.telegram.messenger.g0.m(layoutParams);
        layoutParams.flags = -2013200128;
        int i13 = 16;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        mb mbVar = new mb(this, activity);
        this.n = mbVar;
        v9 v9Var = new v9(this, i11);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(mbVar, v9Var);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        w2 w2Var = new w2(activity, windowManager, this.n, layoutParams);
        this.s = w2Var;
        w2Var.a(new ta(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        mb mbVar2 = this.n;
        fb fbVar = new fb(this, activity);
        this.r = fbVar;
        mbVar2.addView(fbVar);
        fb fbVar2 = this.r;
        za zaVar = new za(this, activity);
        this.i0 = zaVar;
        fbVar2.addView(zaVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.s0 = new org.telegram.ui.Components.ba(this.i0);
        this.t0 = new e6();
        fb fbVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.j0 = frameLayout;
        fbVar3.addView(frameLayout);
        fb fbVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.l0 = frameLayout2;
        fbVar4.addView(frameLayout2);
        fb fbVar5 = this.r;
        bi.g3 g3Var = new bi.g3(5, activity, this);
        this.m0 = g3Var;
        fbVar5.addView(g3Var);
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        fb fbVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        fbVar6.addView(frameLayout3);
        int i14 = 3;
        org.telegram.ui.Components.fc.a(this.n, new bi.t(i14));
        int i15 = 8;
        ab abVar = new ab(this, activity, this.s0, this.r, bVar);
        this.B0 = abVar;
        mb mbVar3 = this.n;
        Objects.requireNonNull(mbVar3);
        abVar.setCancelGestures(new w(mbVar3, 18));
        this.B0.setResetState(new m9(this, 13));
        this.i0.addView(this.B0, c8.na.e(-1, -1, ks.E1));
        this.B0.setOnClickListener(new o9(this, 12));
        za zaVar2 = this.i0;
        int i16 = this.K;
        zaVar2.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
        za zaVar3 = this.i0;
        float L = org.telegram.messenger.g0.L(12.0f);
        bg.q0 q0Var = bg.u0.a;
        zaVar3.setOutlineProvider(new bg.s0(0, L));
        this.i0.setClipToOutline(true);
        m9 m9Var = new m9(this, 14);
        ce0 ce0Var = new ce0(activity);
        ce0Var.a = new TextPaint(1);
        ce0Var.b = new TextPaint(1);
        kr krVar = kr.h;
        ce0Var.s = new org.telegram.ui.Components.c6(ce0Var, 0L, 350L, krVar);
        int i17 = 6;
        ce0Var.J = new eb0(ce0Var, i17);
        ce0Var.y = m9Var;
        this.D1 = ce0Var;
        bb bbVar = new bb(this, activity, this.s0, this.t0);
        this.Y0 = bbVar;
        bbVar.setCollageView(this.B0);
        bb bbVar2 = this.Y0;
        bbVar2.w = new m9(this, 15);
        bbVar2.setOnTapListener(new m9(this, i13));
        this.Y0.setVisibility(8);
        bb bbVar3 = this.Y0;
        bbVar3.O = new m9(this, 17);
        this.i0.addView(bbVar3, c8.na.e(-1, -1, ks.E1));
        this.i0.addView(this.D1, c8.na.e(-1, -1, ks.E1));
        mb mbVar4 = this.n;
        int i18 = 5;
        db dbVar = new db(this, activity, mbVar4, mbVar4, this.r, bVar, this.s0);
        this.d1 = dbVar;
        dbVar.setAccount(i7);
        this.d1.setUiBlurBitmap(new z9(i12));
        org.telegram.ui.Components.fc.a(this.m0, new bi.i1(this, i18));
        this.d1.setOnHeightUpdate(new n9(this, 13));
        this.d1.setOnPeriodUpdate(new n9(this, 4));
        long j3 = this.O;
        if (j3 != 0) {
            this.d1.setDialogId(j3);
        }
        this.d1.setOnPremiumHint(new n9(this, i18));
        this.d1.setOnKeyboardOpen(new n9(this, i17));
        bi.o3 o3Var = new bi.o3(i14, activity, this);
        this.u0 = o3Var;
        this.r.addView(o3Var);
        xb xbVar = new xb(activity, this.r, this.i0, bVar, this.s0);
        this.a1 = xbVar;
        xbVar.setOnTimelineClick(new m9(this, 10));
        this.a1.setOnHeightChange(new m9(this, 11));
        this.Y0.setVideoTimelineView(this.a1);
        this.a1.setVisibility(8);
        this.a1.setAlpha(0.0f);
        this.a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        float f10 = 388;
        frameLayout4.addView(this.a1, c8.na.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        bc bcVar = new bc(activity);
        this.b1 = bcVar;
        bcVar.setVisibility(8);
        this.b1.a(false);
        this.Z0.addView(this.b1, c8.na.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, c8.na.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.d1, c8.na.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.a1);
        this.B0.setPreviewView(this.Y0);
        xb xbVar2 = new xb(activity, this.r, this.i0, bVar, this.s0);
        this.u1 = xbVar2;
        xbVar2.Y0 = true;
        xbVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.m0.addView(this.u1, c8.na.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        ga gaVar = new ga(this, activity, bVar, this.s0);
        this.e1 = gaVar;
        gaVar.setVisibility(8);
        this.m0.addView(this.e1, c8.na.e(-1, -2, 85));
        u2 u2Var = new u2(activity);
        this.o0 = u2Var;
        u2Var.setContentDescription(gd.N0(2131754878, null));
        u2 u2Var2 = this.o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        u2Var2.setScaleType(scaleType);
        this.o0.setImageResource(R.drawable.msg_photo_back);
        u2 u2Var3 = this.o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        u2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.o0.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.o0.setOnClickListener(new o9(this, 1));
        this.j0.addView(this.o0, c8.na.e(56, 56, 51));
        this.s.a(this.o0);
        f7 f7Var = new f7(activity, i7);
        this.p0 = f7Var;
        f7Var.a(false, false);
        this.p0.setOnClickListener(new ai.p2(23, this, activity));
        this.j0.addView(this.p0, c8.na.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(activity);
        this.q0 = n5Var;
        n5Var.setTextSize(20);
        this.q0.setGravity(19);
        this.q0.setTextColor(-1);
        this.q0.setTypeface(org.telegram.messenger.g0.o());
        this.q0.l(gd.N0(2131746157, null), false);
        this.q0.getPaint().setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.q0.setAlpha(0.0f);
        this.q0.setVisibility(8);
        this.q0.setEllipsizeByGradient(true);
        this.q0.setRightPadding(org.telegram.messenger.g0.L(144.0f));
        this.j0.addView(this.q0, c8.na.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.k0.setGravity(5);
        this.j0.addView(this.k0, c8.na.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        n9 n9Var = new n9(this, 7);
        mb mbVar5 = this.n;
        d1 d1Var = new d1(activity);
        d1Var.x = true;
        d1Var.y = true;
        d1Var.h = n9Var;
        d1Var.a = i7;
        d1Var.b = mbVar5;
        d1Var.setScaleType(scaleType);
        d1Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        d1Var.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        d1Var.setVisibility(8);
        d1Var.setAlpha(0.0f);
        d1Var.setOnClickListener(new ah.d(d1Var, 29));
        d1Var.f = new rp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        d1Var.d();
        this.f1 = d1Var;
        u3 u3Var = new u3(activity, 1);
        u3Var.o(1.0f, -71.0f);
        u3Var.d = 2000L;
        u3Var.V = false;
        u3Var.I.r(true, false);
        this.l1 = u3Var;
        u3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.j0.addView(this.l1, c8.na.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        qh0 qh0Var = new qh0(activity);
        this.h1 = qh0Var;
        qh0Var.setScaleType(scaleType);
        qh0 qh0Var2 = this.h1;
        x7 x7Var = this.L1;
        qh0Var2.setImageResource((x7Var == null || !x7Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.h1.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.h1.setOnClickListener(new o9(this, 2));
        this.h1.setVisibility(8);
        this.h1.setAlpha(0.0f);
        w5 w5Var = new w5(activity);
        this.k1 = w5Var;
        w5Var.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.k1.setVisibility(8);
        this.k1.setAlpha(0.0f);
        this.k1.setOnClickListener(new o9(this, i14));
        this.k0.addView(this.k1, c8.na.r(46, 56, 53));
        this.k0.addView(this.h1, c8.na.r(46, 56, 53));
        this.k0.addView(this.f1, c8.na.e(46, 56, 53));
        yb ybVar = new yb(activity);
        this.F0 = ybVar;
        ybVar.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.F0.setOnClickListener(new o9(this, 4));
        this.F0.setOnLongClickListener(new y4(this, 1));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.s.a(this.F0);
        this.j0.addView(this.F0, c8.na.e(56, 56, 53));
        zb zbVar = new zb(activity);
        this.G0 = zbVar;
        zbVar.setContentDescription(gd.N0(2131754886, null));
        this.G0.setOnClickListener(new o9(this, 5));
        boolean q10 = l1.q(activity);
        this.G0.setVisibility(q10 ? 0 : 8);
        this.G0.setAlpha(q10 ? 1.0f : 0.0f);
        this.s.a(this.G0);
        this.j0.addView(this.G0, c8.na.e(56, 56, 53));
        i0 i0Var = new i0(activity);
        this.H0 = i0Var;
        i0Var.setContentDescription(gd.N0(2131754895, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        if (this.A0 == null) {
            i10 = 6;
            this.A0 = (c0) c0.a().get(6);
        } else {
            i10 = 6;
        }
        this.H0.setOnClickListener(new o9(this, i10));
        this.H0.a(new d0(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.s.a(this.H0);
        this.j0.addView(this.H0, c8.na.e(56, 56, 53));
        yb ybVar2 = new yb(activity);
        this.I0 = ybVar2;
        ybVar2.setContentDescription(gd.N0(2131754894, null));
        this.I0.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.I0.a(new d0(new c0("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new o9(this, 7));
        this.s.a(this.I0);
        this.j0.addView(this.I0, c8.na.e(56, 56, 53));
        h0 h0Var = new h0(activity, this.s);
        this.J0 = h0Var;
        h0Var.a.v0(6);
        this.J0.setSelected((c0) null);
        this.J0.setOnLayoutClick(new n9(this, i15));
        this.j0.addView(this.J0, c8.na.e(-1, 56, 53));
        u3 u3Var2 = new u3(activity, 1);
        u3Var2.o(1.0f, -20.0f);
        u3Var2.d = 5000L;
        u3Var2.k(true);
        u3Var2.v(gd.N0(2131744472, null));
        u3Var2.r0 = new ai.k(19);
        this.m1 = u3Var2;
        u3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.j0.addView(this.m1, c8.na.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        u3 u3Var3 = new u3(activity, 2);
        u3Var3.o(0.0f, 28.0f);
        u3Var3.d = 5000L;
        u3Var3.r(true);
        this.n1 = u3Var3;
        this.j0.addView(u3Var3, c8.na.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        u3 u3Var4 = new u3(activity, 1);
        u3Var4.o(1.0f, -20.0f);
        u3Var4.d = 5000L;
        u3Var4.v(gd.N0(2131744460, null));
        this.o1 = u3Var4;
        u3Var4.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.j0.addView(this.o1, c8.na.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        cc ccVar = new cc(activity);
        Paint paint = new Paint(1);
        ccVar.a = paint;
        Paint paint2 = new Paint(1);
        ccVar.b = paint2;
        ccVar.e = new org.telegram.ui.Components.c6(ccVar, 0L, 250L, krVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        ccVar.c = m6Var;
        m6Var.n(0.3f, 250L, krVar);
        m6Var.w(org.telegram.messenger.g0.L(13.0f));
        m6Var.u(-1);
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.setCallback(ccVar);
        m6Var.b = 1;
        ccVar.a(0L, false);
        this.K0 = ccVar;
        h0(false, false);
        this.j0.addView(this.K0, c8.na.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.K0);
        MediaController.O(0);
        n6 n6Var = new n6(activity);
        this.P0 = n6Var;
        n6Var.setDelegate(kaVar);
        n6 n6Var2 = this.P0;
        boolean z10 = this.P1 == 1;
        n6Var2.o0 = -1.0f;
        n6Var2.p0 = z10;
        n6Var2.invalidate();
        this.l0.addView(this.P0, c8.na.e(-1, 100, 87));
        this.s.a(this.P0);
        this.P0.e(true, this.B0.j() ? this.B0.getFilledProgress() : 0.0f);
        e eVar = new e(activity, bVar, true);
        this.Q0 = eVar;
        eVar.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(gd.N0(2131748595, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.l0.addView(this.Q0, c8.na.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new o9(this, i15));
        u3 u3Var5 = new u3(activity, 3);
        u3Var5.r(true);
        u3Var5.v(gd.N0(2131744470, null));
        u3Var5.h = org.telegram.messenger.g0.L(320.0f);
        u3Var5.d = 5000L;
        u3Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = u3Var5;
        this.l0.addView(u3Var5, c8.na.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        g81 g81Var = new g81(activity);
        this.W0 = g81Var;
        g81Var.N = false;
        g81Var.setAlpha(0.0f);
        this.l0.addView(this.W0, c8.na.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new v9(this, 4));
        g81 g81Var2 = this.W0;
        this.U1 = 0.0f;
        g81Var2.b(false, 0.0f);
        int i19 = 12;
        x6 x6Var = new x6(activity, i7, new m9(this, i19));
        this.E0 = x6Var;
        x6Var.c = new n9(this, 9);
        this.l0.addView(x6Var, c8.na.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        ha haVar = new ha(this, activity);
        this.R0 = haVar;
        haVar.setOnSwitchModeListener(new n9(this, 10));
        this.R0.setOnSwitchingModeListener(new n9(this, 11));
        this.n0.addView(this.R0, c8.na.e(-1, 48, 55));
        this.s.a(this.R0);
        u2 u2Var4 = new u2(activity);
        this.S0 = u2Var4;
        u2Var4.setContentDescription(gd.N0(2131754751, null));
        this.S0.setImageResource(R.drawable.stream_flip);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.n0.addView(this.S0, c8.na.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new o9(this, 9));
        u2 u2Var5 = new u2(activity);
        this.T0 = u2Var5;
        u2Var5.setContentDescription(gd.N0(2131748597, null));
        this.T0.setImageResource(R.drawable.stream_settings);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        this.n0.addView(this.T0, c8.na.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.T0);
        this.T0.setOnClickListener(new o9(this, 10));
        r3 r3Var = new r3(activity);
        this.U0 = r3Var;
        this.n0.addView(r3Var, c8.na.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        r3 r3Var2 = new r3(activity);
        this.V0 = r3Var2;
        r3Var2.a.t(gd.N0(2131744459, null), false, true);
        r3Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.n0.addView(this.V0, c8.na.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.V0);
        e eVar2 = new e(activity, bVar, true);
        eVar2.setRoundRadius(24);
        this.v1 = eVar2;
        eVar2.setVisibility(8);
        this.v1.setAlpha(0.0f);
        this.v1.i(gd.N0(2131744445, null), false, true);
        this.v1.setOnClickListener(new o9(this, 11));
        this.n0.addView(this.v1, c8.na.d(-1, 48.0f, ks.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        z5 z5Var = new z5(activity);
        z5Var.b = new ArrayList();
        z5Var.e = true;
        z5Var.h = true;
        View view = new View(activity);
        z5Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        z5Var.addView(view, c8.na.e(-1, -1, ks.E1));
        z5Var.a(0, R.drawable.media_draw, gd.N0(2131754813, null));
        z5Var.a(2, R.drawable.msg_photo_sticker, gd.N0(2131754755, null));
        z5Var.a(1, R.drawable.msg_photo_text2, gd.N0(2131754806, null));
        z5Var.a(3, R.drawable.media_crop, gd.N0(2131751687, null));
        z5Var.a(4, R.drawable.msg_photo_settings, gd.N0(2131754810, null));
        String N0 = gd.N0(2131745444, null);
        z5Var.d = N0;
        z5Var.e = true;
        y5 y5Var = new y5(z5Var, activity, N0, true);
        z5Var.c = y5Var;
        y5Var.setContentDescription(gd.N0(2131745444, null));
        z5Var.addView(z5Var.c, c8.na.c(-2.0f, -2));
        z5Var.e();
        this.c1 = z5Var;
        z5Var.setVisibility(8);
        this.c1.setOnClickListener(new n9(this, i19));
        this.n0.addView(this.c1, c8.na.e(-1, 52, 23));
        ac acVar = new ac(activity);
        this.q1 = acVar;
        acVar.setAlpha(0.0f);
        this.q1.setVisibility(8);
        this.i0.addView(this.q1, c8.na.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        a6 a6Var = new a6(activity, i7, bVar);
        this.p1 = a6Var;
        this.i0.addView(a6Var, c8.na.e(-1, -1, ks.E1));
        l0(false);
    }

    public static nb D(Activity activity, int i7) {
        nb nbVar = G2;
        if (nbVar != null && (nbVar.b != activity || nbVar.c != i7)) {
            nbVar.p(false);
            G2 = null;
        }
        if (G2 == null) {
            G2 = new nb(activity, i7);
        }
        return G2;
    }

    public static void Z(boolean z10) {
        mp.g1().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(nb nbVar) {
        qa qaVar = nbVar.C0;
        if (qaVar == null || qaVar.getTextureView() == null) {
            nbVar.d2 = false;
            return;
        }
        Bitmap bitmap = nbVar.C0.getTextureView().getBitmap();
        if (bitmap == null) {
            nbVar.d2 = false;
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
        nbVar.d2 = f11 < 0.22f;
    }

    public static void b(nb nbVar) {
        ValueAnimator valueAnimator = nbVar.k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            nbVar.k2 = null;
        }
        int i7 = 0;
        nbVar.l2 = false;
        fb fbVar = nbVar.r;
        float f10 = fbVar.a;
        float f11 = fbVar.b;
        fbVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        nbVar.k2 = ofFloat;
        ofFloat.addUpdateListener(new da(nbVar, f10, f11, i7));
        nbVar.k2.setDuration(340L);
        nbVar.k2.setInterpolator(kr.h);
        nbVar.k2.addListener(new na(nbVar, i7));
        nbVar.k2.start();
    }

    public static boolean c(nb nbVar) {
        Activity activity = nbVar.b;
        if (activity == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, ks.x1);
        return false;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable g10 = i5.c.g(context, R.drawable.story_camera);
        int L = org.telegram.messenger.g0.L(35.0f);
        int i7 = -L;
        g10.setBounds(i7 / 4, i7, (L / 4) * 3, 0);
        spannableString.setSpan(new ua(g10, g10), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        nb nbVar = G2;
        if (nbVar != null) {
            nbVar.p(false);
        }
        G2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            return arrayList.size();
        }
        x7 x7Var = this.L1;
        if (x7Var != null) {
            return x7Var.r();
        }
        return 1;
    }

    public final String B() {
        qa qaVar = this.C0;
        if (qaVar == null || qaVar.getCameraSession() == null) {
            return null;
        }
        if (!this.C0.isFrontface() || this.C0.getCameraSession().hasFlashModes()) {
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        o();
        return (String) this.v2.get(this.u2);
    }

    public final e1 C() {
        if (this.O0 == null) {
            e1 e1Var = new e1(this.b);
            this.O0 = e1Var;
            this.l0.addView(e1Var, c8.na.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String E() {
        qa qaVar = this.C0;
        if (qaVar == null || qaVar.getCameraSession() == null) {
            return null;
        }
        if (!this.C0.isFrontface() || this.C0.getCameraSession().hasFlashModes()) {
            return this.C0.getCameraSession().getNextFlashMode();
        }
        o();
        ArrayList arrayList = this.v2;
        return (String) arrayList.get(this.u2 + 1 >= arrayList.size() ? 0 : this.u2 + 1);
    }

    public final ImageView F() {
        if (this.j1 == null) {
            nh0 nh0Var = new nh0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.i1 = nh0Var;
            nh0Var.h = true;
            x7 x7Var = this.L1;
            int i7 = 0;
            if (x7Var == null || !x7Var.y0) {
                nh0Var.P(0);
                this.i1.M(0);
            } else {
                nh0Var.M(35);
                this.i1.P(36);
            }
            this.i1.a0 = true;
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.J9, this.a);
            this.i1.Q(w02, "Sunny");
            this.i1.Q(w02, "Path 6");
            this.i1.Q(w02, "Path");
            this.i1.Q(w02, "Path 5");
            this.i1.o();
            ImageView imageView = new ImageView(this.b);
            this.j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.j1.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
            this.j1.setOnClickListener(new o9(this, i7));
            this.j1.setVisibility(8);
            this.j1.setImageDrawable(this.i1);
            this.j1.setAlpha(0.0f);
            this.k0.addView(this.j1, 0, c8.na.r(46, 56, 53));
        }
        return this.j1;
    }

    public final void G() {
        pa paVar = this.w1;
        if (paVar == null) {
            return;
        }
        this.w2 = null;
        paVar.getTopLayout().setAlpha(0.0f);
        this.w1.getTopLayout().setTranslationY(-org.telegram.messenger.g0.L(16.0f));
        this.w1.getBottomLayout().setAlpha(0.0f);
        this.w1.getBottomLayout().setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.w1.getWeightChooserView().setTranslationX(-org.telegram.messenger.g0.L(32.0f));
        this.w1.setVisibility(8);
    }

    public final boolean H() {
        return !this.b2 && (this.B0.j() ? this.B0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean I() {
        p3 p3Var;
        if (this.X || (p3Var = this.N0) == null) {
            return false;
        }
        return p3Var.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) org.telegram.messenger.g0.q.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)));
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
    public final void J(int i7, boolean z10) {
        x7 x7Var;
        x7 x7Var2;
        e eVar;
        org.telegram.ui.ActionBar.n5 n5Var;
        int i10;
        int i11;
        float L;
        ImageView imageView;
        x7 x7Var3;
        x7 x7Var4;
        x7 x7Var5;
        x7 x7Var6;
        qa qaVar;
        int i12 = this.g0;
        if (i7 == i12) {
            return;
        }
        this.g0 = i7;
        AnimatorSet animatorSet = this.j2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        N(i12, i7);
        z5 z5Var = this.c1;
        if (z5Var != null) {
            z5Var.b(i7 == 1, z10);
        }
        h0 h0Var = this.J0;
        h0(i7 == 0 && this.P1 == 1 && !h0Var.e && !H(), z10);
        if (i7 != 1) {
            this.b1.a(z10);
        }
        b0(this.o0, !h0Var.e, z10);
        b0(this.F0, (this.b2 || i7 != 0 || h0Var.e || this.Z1 == null || H()) ? false : true, z10);
        boolean z11 = this.b2;
        ab abVar = this.B0;
        b0(this.G0, (z11 || i7 != 0 || (qaVar = this.C0) == null || !qaVar.a || h0Var.e || abVar.j()) ? false : true, true);
        b0(this.H0, (this.b2 || i7 != 0 || h0Var.e) ? false : true, z10);
        l0(z10);
        d1 d1Var = this.f1;
        w5 w5Var = this.k1;
        qh0 qh0Var = this.h1;
        xb xbVar = this.u1;
        xb xbVar2 = this.a1;
        e eVar2 = this.v1;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.q0;
        db dbVar = this.d1;
        r3 r3Var = this.V0;
        r3 r3Var2 = this.U0;
        x6 x6Var = this.E0;
        bb bbVar = this.Y0;
        bi.g3 g3Var = this.m0;
        ha haVar = this.R0;
        n6 n6Var = this.P0;
        if (!z10) {
            qa qaVar2 = this.C0;
            if (qaVar2 != null) {
                qaVar2.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            }
            bbVar.setAlpha(((i7 != 1 || abVar.j()) && i7 != 2) ? 0.0f : 1.0f);
            abVar.setAlpha((i7 == 0 || (i7 == 1 && abVar.j())) ? 1.0f : 0.0f);
            n6Var.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            n6Var.setTranslationY(i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            x6Var.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            haVar.setAlpha((i7 != 0 || H()) ? 0.0f : 1.0f);
            haVar.setTranslationY((i7 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            r3Var2.setAlpha((i7 == 0 && this.b2 && !H()) ? 1.0f : 0.0f);
            r3Var.setAlpha((i7 == 0 && !this.b2 && H()) ? 0.6f : 0.0f);
            g3Var.setAlpha((i7 == 1 || i7 == 2) ? 1.0f : 0.0f);
            g3Var.setTranslationY((i7 == 1 || i7 == 2) ? 0.0f : org.telegram.messenger.g0.L(12.0f));
            dbVar.setAlpha(i7 == 2 ? 0.0f : 1.0f);
            qh0Var.setAlpha((i7 == 1 && this.P1 == 1) ? 1.0f : 0.0f);
            w5Var.setAlpha((i7 != 1 || (this.P1 != 1 && ((x7Var2 = this.L1) == null || TextUtils.isEmpty(x7Var2.y)))) ? 0.0f : 1.0f);
            int i13 = 1;
            d1Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.j1;
            if (imageView2 != null) {
                imageView2.setAlpha((i7 == 1 && (x7Var = this.L1) != null && x7Var.u) ? 1.0f : 0.0f);
                i13 = 1;
            }
            xbVar2.setAlpha(i7 == i13 ? 1.0f : 0.0f);
            xbVar.setAlpha(i7 == 2 ? 1.0f : 0.0f);
            n5Var2.setAlpha((i7 == i13 || i7 == 2) ? 1.0f : 0.0f);
            eVar2.setAlpha(i7 == 2 ? 1.0f : 0.0f);
            M(i12, i7);
            return;
        }
        this.j2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        qa qaVar3 = this.C0;
        if (qaVar3 != null) {
            eVar = eVar2;
            n5Var = n5Var2;
            i10 = 1;
            arrayList.add(ObjectAnimator.ofFloat(qaVar3, (Property<qa, Float>) View.ALPHA, i7 == 0 ? 1.0f : 0.0f));
        } else {
            eVar = eVar2;
            n5Var = n5Var2;
            i10 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i10];
        fArr[0] = ((i7 != i10 || abVar.j()) && i7 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(bbVar, (Property<bb, Float>) property, fArr));
        float[] fArr2 = new float[i10];
        fArr2[0] = (i7 == 0 || (i7 == i10 && abVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(abVar, (Property<ab, Float>) property, fArr2));
        float[] fArr3 = new float[i10];
        fArr3[0] = i7 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(n6Var, (Property<n6, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i10];
        fArr4[0] = i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(n6Var, (Property<n6, Float>) property2, fArr4));
        float[] fArr5 = new float[i10];
        fArr5[0] = i7 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(x6Var, (Property<x6, Float>) property, fArr5));
        float[] fArr6 = new float[i10];
        fArr6[0] = (i7 != 0 || H()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) property2, (i7 != 0 || H()) ? org.telegram.messenger.g0.L(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(r3Var2, (Property<r3, Float>) property, (i7 == 0 && this.b2 && !H()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(r3Var, (Property<r3, Float>) property, (i7 == 0 && !this.b2 && H()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(g3Var, (Property<bi.g3, Float>) property, ((i7 == 1 && ((x7Var6 = this.L1) == null || x7Var6.J0 == 0)) || i7 == 2) ? 1.0f : 0.0f));
        if (i7 == 1 && ((x7Var5 = this.L1) == null || x7Var5.J0 == 0)) {
            i11 = 2;
        } else {
            i11 = 2;
            if (i7 != 2) {
                L = org.telegram.messenger.g0.L(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(g3Var, (Property<bi.g3, Float>) property2, L));
                arrayList.add(ObjectAnimator.ofFloat(dbVar, (Property<db, Float>) property, i7 != i11 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property, (i7 != 1 || i7 == i11) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<e, Float>) property, i7 != i11 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(xbVar2, (Property<xb, Float>) property, i7 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(xbVar, (Property<xb, Float>) property, i7 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(qh0Var, (Property<qh0, Float>) property, (i7 == 1 || this.P1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(w5Var, (Property<w5, Float>) property, (i7 == 1 || (this.P1 != 1 && ((x7Var4 = this.L1) == null || TextUtils.isEmpty(x7Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(d1Var, (Property<d1, Float>) property, i7 != 1 ? 1.0f : 0.0f));
                imageView = this.j1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i7 == 1 && (x7Var3 = this.L1) != null && x7Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<g81, Float>) property, 0.0f));
                this.j2.playTogether(arrayList);
                this.j2.addListener(new ma(this, i12, i7, 0));
                this.j2.setDuration(460L);
                this.j2.setInterpolator(kr.h);
                this.j2.start();
            }
        }
        L = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(g3Var, (Property<bi.g3, Float>) property2, L));
        arrayList.add(ObjectAnimator.ofFloat(dbVar, (Property<db, Float>) property, i7 != i11 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property, (i7 != 1 || i7 == i11) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<e, Float>) property, i7 != i11 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(xbVar2, (Property<xb, Float>) property, i7 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(xbVar, (Property<xb, Float>) property, i7 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(qh0Var, (Property<qh0, Float>) property, (i7 == 1 || this.P1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(w5Var, (Property<w5, Float>) property, (i7 == 1 || (this.P1 != 1 && ((x7Var4 = this.L1) == null || TextUtils.isEmpty(x7Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(d1Var, (Property<d1, Float>) property, i7 != 1 ? 1.0f : 0.0f));
        imageView = this.j1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<g81, Float>) property, 0.0f));
        this.j2.playTogether(arrayList);
        this.j2.addListener(new ma(this, i12, i7, 0));
        this.j2.setDuration(460L);
        this.j2.setInterpolator(kr.h);
        this.j2.start();
    }

    public final void K(Runnable runnable, long j3) {
        if (this.T1 || this.L1 == null) {
            return;
        }
        s9 s9Var = this.h2;
        if (s9Var != null) {
            org.telegram.messenger.g0.r(s9Var);
        }
        this.i2 = true;
        this.T1 = true;
        this.h2 = new s9(this, runnable, 1);
        this.Y0.setAlpha(0.0f);
        this.Y0.setVisibility(0);
        this.Y0.n(this.L1, this.h2, j3);
        this.Y0.p(this.L1, false);
        org.telegram.messenger.g0.h3(this.h2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fa, code lost:
    
        if (r0.k == false) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L() {
        x7 x7Var;
        x7 x7Var2;
        x7 x7Var3;
        pa paVar;
        x7 x7Var4;
        pa paVar2;
        pa paVar3;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            db dbVar = this.d1;
            if (dbVar != null && dbVar.O1) {
                dbVar.N1 = false;
                dbVar.z(false, false);
                return false;
            }
            if (this.R1) {
                n6 n6Var = this.P0;
                if (n6Var.s0) {
                    n6Var.s0 = false;
                    n6Var.w0 = SystemClock.elapsedRealtime();
                    n6Var.v0 = true;
                    ((ka) n6Var.a).e(false);
                    n6Var.K.c(false);
                    n6Var.L.c(false);
                    n6Var.M.c(false);
                    n6Var.invalidate();
                    return false;
                }
            } else if (!this.Q1 && !dbVar.p()) {
                ga gaVar = this.e1;
                if (gaVar.N) {
                    gaVar.c(false, true);
                    return false;
                }
                p3 p3Var = this.N0;
                if (p3Var != null) {
                    org.telegram.ui.ActionBar.q0 q0Var = p3Var.H;
                    if (q0Var == null || !q0Var.w()) {
                        e(false);
                        this.n2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = q0Var.getSearchField();
                    if (p3Var.w.c()) {
                        org.telegram.messenger.g0.v1(searchField);
                        return false;
                    }
                    p3Var.y.A(q0Var.U(true));
                    return false;
                }
                if (this.h0 != 0 || (paVar3 = this.w1) == null || !paVar3.x0()) {
                    if (this.h0 > -1) {
                        k0(-1, false, true);
                        return false;
                    }
                    int i7 = this.g0;
                    ab abVar = this.B0;
                    if (i7 == 0) {
                        ArrayList arrayList = abVar.h;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            if (((m0) obj).n != null) {
                                abVar.c();
                                l0(true);
                                return false;
                            }
                        }
                    }
                    if (this.g0 == 1 && (((x7Var2 = this.L1) == null || (!x7Var2.n && !x7Var2.u)) && !this.v0)) {
                        if (x7Var2 != null && x7Var2.g && ((paVar2 = this.w1) == null || !paVar2.t0())) {
                            x7 x7Var5 = this.L1;
                            if (!x7Var5.j) {
                            }
                        }
                        pa paVar4 = this.w1;
                        if (paVar4 == null || !paVar4.x0()) {
                            if (this.w0 == 0 && (((this.M1 && !abVar.j() && (((paVar = this.w1) == null || !paVar.t0()) && ((x7Var4 = this.L1) == null || x7Var4.Z0 == null))) || !this.c1.h) && (((x7Var3 = this.L1) == null || !x7Var3.g || (!x7Var3.n && !x7Var3.u)) && !this.v0 && (x7Var3 == null || !x7Var3.o)))) {
                                J(0, true);
                                return false;
                            }
                            if (this.w0 != 0) {
                                p(true);
                                return false;
                            }
                            Activity activity = this.b;
                            fi.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                            String N0 = gd.N0(2131751393, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            t1Var.U = gd.N0(2131747084, null);
                            x7 x7Var6 = this.L1;
                            if (x7Var6 != null && !x7Var6.g && !x7Var6.o) {
                                alertDialog$Builder.i(gd.N0(x7Var6.c ? 2131744409 : 2131744241, null), new v9(this, 7));
                            }
                            x7 x7Var7 = this.L1;
                            alertDialog$Builder.k(gd.N0((x7Var7 == null || !x7Var7.c || x7Var7.g) ? 2131751394 : 2131744442, null), new v9(this, 8));
                            alertDialog$Builder.h(gd.N0(2131752577, null), null);
                            t1Var.show();
                            View d = t1Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.n6.q7;
                                org.telegram.ui.ActionBar.u6.U((TextView) d, i11, bVar);
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i11, bVar), 51), 6, 6);
                                org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i11, 51);
                                d.setBackground(a02);
                                org.telegram.ui.ActionBar.u6.j(d, a02, null, g10, bVar);
                            }
                        }
                    }
                    if (this.g0 != 2 || (x7Var = this.L1) == null || x7Var.b0) {
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
            this.P0.setVisibility(8);
            this.W0.setVisibility(8);
            this.R0.setVisibility(8);
            g(false, false);
            c0(false);
        }
        if (i7 == 2) {
            this.u1.setVisibility(8);
            this.m0.setVisibility(i10 == 1 ? 0 : 8);
            this.d1.setVisibility(8);
            this.v1.setVisibility(8);
        }
        if (i7 == 1) {
            this.c1.setVisibility(8);
            this.m0.setVisibility(i10 == 2 ? 0 : 8);
            this.h1.setVisibility(8);
            this.k1.setVisibility(8);
            this.f1.setVisibility(8);
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.Y0.setVisibility(i10 == 2 ? 0 : 8);
            this.a1.setVisibility(8);
            if (i10 != 2) {
                y();
                x();
            }
            this.q0.setVisibility(i10 == 2 ? 0 : 8);
            v();
            this.q1.setAlpha(0.0f);
            this.q1.setVisibility(8);
            this.b1.setVisibility(8);
            this.I1 = null;
            this.J1 = null;
            this.K1 = null;
        }
        if (i10 == 1) {
            x7 x7Var = this.L1;
            if (x7Var == null || !x7Var.n) {
                t();
                G();
            }
            ce0 ce0Var = this.D1;
            if (ce0Var != null) {
                ce0Var.setAllowTouch(false);
            }
            this.Y0.x(2, false);
            this.Y0.x(3, false);
            this.Y0.x(4, false);
            this.Y0.x(5, false);
            this.Y0.x(7, false);
            x7 x7Var2 = this.L1;
            this.b1.setVisibility((x7Var2 == null || x7Var2.h0 < 30000) ? 8 : 0);
            this.m0.setAlpha(1.0f);
            this.m0.setTranslationY(0.0f);
            x7 x7Var3 = this.L1;
            this.d1.setVisibility((x7Var3 == null || x7Var3.J0 == 0) ? 0 : 8);
        }
        if (i10 == 0 && this.W1) {
            C().setVisibility(0);
            e1 C = C();
            C.r.e(true, 0.0f);
            C.a(true);
            w wVar = C.h;
            if (wVar != null) {
                org.telegram.messenger.g0.r(wVar);
            }
            w wVar2 = new w(C, 4);
            C.h = wVar2;
            org.telegram.messenger.g0.h3(wVar2, 3500L);
            this.P0.h();
        }
        this.W1 = false;
        ce0 ce0Var2 = this.D1;
        if (ce0Var2 != null) {
            ce0Var2.setAllowTouch(i10 == 1 && ((i11 = this.h0) == -1 || i11 == 1));
        }
        db dbVar = this.d1;
        if (dbVar != null) {
            dbVar.e0 = i10 != 1;
        }
        if (i10 == 1) {
            int i12 = this.c;
            ri.d0(i12).D(0);
            ri.d0(i12).Y0(0, false, true, false);
            ri.d0(i12).Y0(2, false, true, false);
            fi.p6 R1 = mp.u1(i12).R1();
            if (R1.Q == 0) {
                R1.S();
            }
            mp.u1(i12).R1().U();
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
    /* JADX WARN: Removed duplicated region for block: B:167:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ca  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(int i7, int i10) {
        ab abVar;
        ?? r82;
        CharSequence charSequence;
        int i11;
        int i12;
        SpannableStringBuilder append;
        String str;
        x7 x7Var;
        boolean z10;
        String str2;
        f6 f6Var;
        x60 x60Var;
        ce0 ce0Var;
        boolean z11;
        u3 u3Var;
        pa paVar;
        u3 u3Var2;
        x7 x7Var2;
        x7 x7Var3;
        File file;
        sb sbVar;
        int i13;
        boolean z12;
        CharSequence charSequence2;
        boolean z13;
        x7 x7Var4;
        fi.j6 o4;
        x7 x7Var5;
        x51 textureView;
        x7 x7Var6;
        ab abVar2 = this.B0;
        if (i10 == 0) {
            Y(false);
            n6 n6Var = this.P0;
            n6Var.setVisibility(0);
            if (n6Var != null) {
                n6Var.g(false);
            }
            this.R0.setVisibility(0);
            g81 g81Var = this.W0;
            g81Var.setVisibility(0);
            g81Var.setAlpha(0.0f);
            this.K0.a(0L, true);
            x7 x7Var7 = this.L1;
            if (x7Var7 != null) {
                x7Var7.i(false);
                this.L1 = null;
            }
            if (abVar2 != null) {
                abVar2.c();
                n6Var.e(false, 0.0f);
            }
        }
        if (i7 == 0) {
            d0(null);
            a0(new m9(this, 18));
            e1 e1Var = this.O0;
            if (e1Var != null) {
                e1Var.setVisibility(8);
            }
            this.X0.f(true);
            u3 u3Var3 = this.m1;
            if (u3Var3 != null) {
                u3Var3.f(true);
            }
        }
        xb xbVar = this.a1;
        bi.g3 g3Var = this.m0;
        qh0 qh0Var = this.h1;
        z5 z5Var = this.c1;
        bb bbVar = this.Y0;
        db dbVar = this.d1;
        org.telegram.ui.ActionBar.n5 n5Var = this.q0;
        int i14 = this.c;
        if (i10 == 1 || i7 == 1) {
            x7 x7Var8 = i10 == 1 ? this.L1 : null;
            d1 d1Var = this.f1;
            d1Var.setEntry(x7Var8);
            int i15 = this.P1;
            abVar = abVar2;
            w5 w5Var = this.k1;
            if (i15 == 1) {
                qh0Var.setVisibility(0);
                x7 x7Var9 = this.L1;
                e0(x7Var9 != null && x7Var9.Y, false);
                w5Var.setVisibility(0);
                bbVar.x(-9982, false);
                ((ve0) w5Var.c).a(bbVar.k(), false);
                n5Var.setRightPadding(org.telegram.messenger.g0.L(144.0f));
                r82 = 0;
            } else {
                x7 x7Var10 = this.L1;
                if (x7Var10 == null || TextUtils.isEmpty(x7Var10.y)) {
                    r82 = 0;
                    n5Var.setRightPadding(org.telegram.messenger.g0.L(48.0f));
                } else {
                    qh0Var.setVisibility(8);
                    r82 = 0;
                    w5Var.setVisibility(0);
                    ((ve0) w5Var.c).a(true, false);
                    n5Var.setRightPadding(org.telegram.messenger.g0.L(48.0f));
                }
            }
            d1Var.setVisibility(r82);
            x7 x7Var11 = this.L1;
            if (x7Var11 == null || !x7Var11.u) {
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                F().setVisibility(r82);
                n0(r82);
            }
            z5Var.setVisibility(r82);
            bbVar.setVisibility(r82);
            x7 x7Var12 = this.L1;
            dbVar.setVisibility(((x7Var12 == null || x7Var12.J0 == 0) && this.w0 == 0) ? 0 : 8);
            FrameLayout frameLayout = this.Z0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            x7 x7Var13 = this.L1;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(((x7Var13 == null || x7Var13.J0 == 0) && this.w0 == 0) ? 68.0f : 12.0f);
            frameLayout.setLayoutParams(layoutParams);
            g3Var.setVisibility(0);
            g3Var.clearFocus();
            x7 x7Var14 = this.L1;
            dbVar.A(x7Var14 == null ? 86400 : x7Var14.I0, false);
            dbVar.setPeriodVisible(!mp.u1(i14).K3() && ((x7Var = this.L1) == null || !x7Var.g));
            x7 x7Var15 = this.L1;
            dbVar.setHasRoundVideo((x7Var15 == null || x7Var15.o0 == null) ? false : true);
            if (dbVar == null) {
                charSequence = "";
                i11 = i14;
            } else {
                x7 x7Var16 = this.L1;
                if (x7Var16 == null || !x7Var16.n) {
                    charSequence = "";
                    i11 = i14;
                    dbVar.v(null, null);
                } else {
                    TLRPC.Peer peer = x7Var16.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        String q10 = n10.q(mp.u1(i14).c2(Long.valueOf(peer.user_id)));
                        x7 x7Var17 = this.L1;
                        charSequence = "";
                        append = new SpannableStringBuilder(fj.h6()).append((CharSequence) " ").append((CharSequence) q10);
                        x7Var17.p = append;
                        i12 = i14;
                    } else {
                        charSequence = "";
                        i12 = i14;
                        TLRPC.Chat O0 = mp.u1(i14).O0(Long.valueOf(-org.telegram.messenger.n5.o(peer)));
                        CharSequence charSequence3 = O0 == null ? charSequence : O0.title;
                        x7 x7Var18 = this.L1;
                        append = new SpannableStringBuilder(fj.h6()).append((CharSequence) " ").append(charSequence3);
                        x7Var18.p = append;
                    }
                    String str3 = this.L1.s;
                    if (TextUtils.isEmpty(str3)) {
                        SpannableString spannableString = new SpannableString(gd.N0(2131744494, null));
                        i11 = i12;
                        spannableString.setSpan(new la(0), 0, spannableString.length(), 33);
                        str = spannableString;
                    } else {
                        i11 = i12;
                        str = str3;
                    }
                    dbVar.v(append, str);
                }
            }
            x7 x7Var19 = this.L1;
            boolean z14 = (x7Var19 != null && x7Var19.v() && this.L1.t()) ? false : true;
            boolean z15 = xbVar.k0;
            xbVar.k0 = z14;
            xbVar.j0.f(z14, true);
            xbVar.invalidate();
        } else {
            abVar = abVar2;
            charSequence = "";
            i11 = i14;
        }
        e eVar = this.v1;
        xb xbVar2 = this.u1;
        int i16 = 2;
        if (i10 == 2 || i7 == 2) {
            z10 = false;
            n5Var.setVisibility(0);
            xbVar2.setVisibility(0);
            x7 x7Var20 = this.L1;
            if (x7Var20 == null || !x7Var20.b0) {
                str2 = null;
            } else {
                str2 = null;
                n5Var.l(gd.N0(2131746159, null), false);
            }
            g3Var.setVisibility(0);
            eVar.setVisibility(0);
            i16 = 2;
        } else {
            z10 = false;
            str2 = null;
        }
        if (i10 == i16) {
            n5Var.l(gd.N0(2131746159, str2), z10);
        }
        ga gaVar = this.e1;
        if (i10 == 1) {
            this.O1 = z10;
            x7 x7Var21 = this.L1;
            boolean z16 = (x7Var21 == null || x7Var21.J0 == 0) ? false : true;
            boolean z17 = x7Var21 != null && x7Var21.g;
            String N0 = gd.N0(z17 ? 2131751342 : z16 ? 2131743557 : 2131748057, null);
            boolean z18 = !z16;
            boolean z19 = z17;
            if (TextUtils.equals(N0, z5Var.d) && z18 == z5Var.e) {
                z12 = z16;
            } else {
                z5Var.removeView(z5Var.c);
                z12 = z16;
                Context context = z5Var.getContext();
                z5Var.d = N0;
                z5Var.e = z18;
                y5 y5Var = new y5(z5Var, context, N0, z18);
                z5Var.c = y5Var;
                y5Var.setContentDescription(N0);
                z5Var.addView(z5Var.c, c8.na.c(-2.0f, -2));
                z5Var.e();
            }
            xbVar2.setVisibility(8);
            eVar.setVisibility(8);
            if (!this.i2) {
                x7 x7Var22 = this.L1;
                if (x7Var22 == null || !x7Var22.u) {
                    bbVar.set(x7Var22);
                } else {
                    bbVar.l(x7Var22);
                }
            }
            this.i2 = false;
            dbVar.f.getEditText().setOnPremiumMenuLockClickListener(mp.u1(i11).j5() ? null : new m9(this, 19));
            gaVar.setVisibility(this.I1 == null ? 8 : 0);
            ArrayList arrayList = this.I1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.K1;
                ArrayList arrayList3 = this.J1;
                gaVar.c(false, false);
                gaVar.c = arrayList;
                gaVar.d = arrayList2;
                gaVar.e = arrayList3;
                gaVar.x = new wy0(Integer.toString(arrayList.size()), 20.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                gaVar.L = new wy0(gd.H(',', "HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                gaVar.b.g3.O(false);
                gaVar.setSelected(this.I1.indexOf(this.L1));
            }
            xbVar.setMaxCount((z12 || z19 || this.I1 != null || ((x7Var6 = this.L1) != null && (x7Var6.v() || !this.L1.K))) ? 1 : 3);
            if (i7 != 2) {
                x7 x7Var23 = this.L1;
                if (x7Var23 != null && (x7Var23.c || x7Var23.g || this.v0)) {
                    if (x7Var23.P0 != null) {
                        y();
                        t();
                        G();
                    }
                    x7 x7Var24 = this.L1;
                    if (x7Var24.K && x7Var24.a1 != null && (textureView = bbVar.getTextureView()) != null) {
                        textureView.setDelegate(new v9(this, 6));
                    }
                    dbVar.setText(this.L1.C0);
                } else if (i7 != 2) {
                    dbVar.W = true;
                    charSequence2 = charSequence;
                    dbVar.f.setText(charSequence2);
                    x7 x7Var25 = this.L1;
                    z5Var.d(4, x7Var25 != null || ((!x7Var25.u || x7Var25.K) && !x7Var25.v()));
                    boolean z20 = org.telegram.messenger.s2.a;
                    z5Var.d(3, false);
                    if (!this.O1 && !dbVar.o()) {
                        fi.p6 R1 = mp.u1(i11).R1();
                        int A = A();
                        o4 = R1.o();
                        if (o4 != null || !o4.a(R1.a, A) || ((x7Var5 = this.L1) != null && (x7Var5.g || x7Var5.J0 != 0))) {
                            z13 = true;
                            z5Var.setShareEnabled(z13);
                            x7 x7Var26 = this.L1;
                            qh0Var.setImageResource((x7Var26 == null && x7Var26.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                            bbVar.setVisibility(0);
                            xbVar.setVisibility(0);
                            n5Var.setVisibility(0);
                            n5Var.setTranslationX(0.0f);
                            x7Var4 = this.L1;
                            if (x7Var4 != null || x7Var4.J0 == 0) {
                                if (x7Var4 == null && x7Var4.g) {
                                    n5Var.l(gd.N0(2131746158, null), false);
                                    x60Var = null;
                                    f6Var = bbVar;
                                } else if (x7Var4 == null && x7Var4.u) {
                                    n5Var.l(gd.N0(2131746156, null), false);
                                } else if (x7Var4 == null && x7Var4.n) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    int i17 = i11;
                                    org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(32.0f, i17, n5Var);
                                    n5Var.setTranslationX(-org.telegram.messenger.g0.L(6.0f));
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(f5Var, 0, 1, 33);
                                    if (this.L1.q instanceof TLRPC.TL_peerUser) {
                                        TLRPC.User c22 = mp.u1(i17).c2(Long.valueOf(this.L1.q.user_id));
                                        f5Var.e(c22);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append((CharSequence) n10.q(c22));
                                        f6Var = bbVar;
                                    } else {
                                        f6Var = bbVar;
                                        TLRPC.Chat O02 = mp.u1(i17).O0(Long.valueOf(-org.telegram.messenger.n5.o(this.L1.q)));
                                        f5Var.b(O02);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append(O02 != null ? O02.title : charSequence2);
                                    }
                                    n5Var.l(spannableStringBuilder, false);
                                    x60Var = null;
                                } else {
                                    f6Var = bbVar;
                                    x60Var = null;
                                    n5Var.l(gd.N0(2131746157, null), false);
                                }
                                if (i7 == 1) {
                                    x60 x60Var2 = dbVar.V0;
                                    if (x60Var2 != null) {
                                        x60Var2.v();
                                        dbVar.V0 = x60Var;
                                    }
                                    this.l1.f(true);
                                    if (gaVar.N) {
                                        gaVar.c(false, true);
                                    }
                                }
                                if (i10 == 2 && (x7Var2 = this.L1) != null) {
                                    if (x7Var2.e0 < 0) {
                                        x7Var2.e0 = 0L;
                                    }
                                    this.N1 = x7Var2.e0;
                                    long duration = f6Var.getDuration() >= 100 ? this.L1.h0 : f6Var.getDuration();
                                    x7Var3 = this.L1;
                                    if (x7Var3.h0 <= 0) {
                                        x7Var3.h0 = duration;
                                    }
                                    file = x7Var3.Z0;
                                    if (file == null) {
                                        file = x7Var3.L;
                                    }
                                    String absolutePath = file.getAbsolutePath();
                                    x7 x7Var27 = this.L1;
                                    this.u1.o(false, absolutePath, x7Var27.h0, x7Var27.P);
                                    x7 x7Var28 = this.L1;
                                    float f10 = duration;
                                    long j3 = (long) (x7Var28.Z * f10);
                                    long j10 = (long) (x7Var28.a0 * f10);
                                    xbVar2.a1 = j3;
                                    xbVar2.b1 = j10;
                                    sbVar = xbVar2.h;
                                    if (sbVar == null) {
                                        i13 = 1;
                                        sb.a(sbVar, true);
                                    } else {
                                        i13 = 1;
                                    }
                                    y7 y7Var = new y7(this, i13);
                                    xbVar2.setDelegate(new h6.o(y7Var, 5));
                                    float max = (this.N1 / Math.max(1L, duration)) * 0.96f;
                                    xbVar2.setVideoLeft(max);
                                    xbVar2.setVideoRight(0.04f + max);
                                    y7Var.a(Boolean.TRUE, Float.valueOf(max));
                                }
                                ce0Var = this.D1;
                                z11 = false;
                                if (ce0Var != null) {
                                    ce0Var.setAllowTouch(false);
                                }
                                u3Var = this.n1;
                                if (u3Var != null) {
                                    u3Var.f(true);
                                }
                                org.telegram.ui.Components.fc.e();
                                if (dbVar != null) {
                                    h hVar = dbVar.f;
                                    hVar.d();
                                    hVar.k(true);
                                    dbVar.e0 = true;
                                }
                                if (f6Var != null) {
                                    f6Var.x(8, i10 != 1);
                                }
                                paVar = this.w1;
                                if (paVar != null) {
                                    paVar.setCoverPreview(i10 != 1);
                                }
                                u3Var2 = this.o1;
                                if (u3Var2 != null) {
                                    u3Var2.f(true);
                                }
                                if (i10 == 1 && abVar.j()) {
                                    z11 = true;
                                }
                                abVar.setPreview(z11);
                            }
                            n5Var.l(charSequence2, false);
                        }
                    }
                    z13 = false;
                    z5Var.setShareEnabled(z13);
                    x7 x7Var262 = this.L1;
                    qh0Var.setImageResource((x7Var262 == null && x7Var262.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    bbVar.setVisibility(0);
                    xbVar.setVisibility(0);
                    n5Var.setVisibility(0);
                    n5Var.setTranslationX(0.0f);
                    x7Var4 = this.L1;
                    if (x7Var4 != null) {
                    }
                    if (x7Var4 == null) {
                    }
                    if (x7Var4 == null) {
                    }
                    if (x7Var4 == null) {
                    }
                    f6Var = bbVar;
                    x60Var = null;
                    n5Var.l(gd.N0(2131746157, null), false);
                    if (i7 == 1) {
                    }
                    if (i10 == 2) {
                        if (x7Var2.e0 < 0) {
                        }
                        this.N1 = x7Var2.e0;
                        if (f6Var.getDuration() >= 100) {
                        }
                        x7Var3 = this.L1;
                        if (x7Var3.h0 <= 0) {
                        }
                        file = x7Var3.Z0;
                        if (file == null) {
                        }
                        String absolutePath2 = file.getAbsolutePath();
                        x7 x7Var272 = this.L1;
                        this.u1.o(false, absolutePath2, x7Var272.h0, x7Var272.P);
                        x7 x7Var282 = this.L1;
                        float f102 = duration;
                        long j32 = (long) (x7Var282.Z * f102);
                        long j102 = (long) (x7Var282.a0 * f102);
                        xbVar2.a1 = j32;
                        xbVar2.b1 = j102;
                        sbVar = xbVar2.h;
                        if (sbVar == null) {
                        }
                        y7 y7Var2 = new y7(this, i13);
                        xbVar2.setDelegate(new h6.o(y7Var2, 5));
                        float max2 = (this.N1 / Math.max(1L, duration)) * 0.96f;
                        xbVar2.setVideoLeft(max2);
                        xbVar2.setVideoRight(0.04f + max2);
                        y7Var2.a(Boolean.TRUE, Float.valueOf(max2));
                    }
                    ce0Var = this.D1;
                    z11 = false;
                    if (ce0Var != null) {
                    }
                    u3Var = this.n1;
                    if (u3Var != null) {
                    }
                    org.telegram.ui.Components.fc.e();
                    if (dbVar != null) {
                    }
                    if (f6Var != null) {
                    }
                    paVar = this.w1;
                    if (paVar != null) {
                    }
                    u3Var2 = this.o1;
                    if (u3Var2 != null) {
                    }
                    if (i10 == 1) {
                        z11 = true;
                    }
                    abVar.setPreview(z11);
                }
            }
            charSequence2 = charSequence;
            x7 x7Var252 = this.L1;
            z5Var.d(4, x7Var252 != null || ((!x7Var252.u || x7Var252.K) && !x7Var252.v()));
            boolean z202 = org.telegram.messenger.s2.a;
            z5Var.d(3, false);
            if (!this.O1) {
                fi.p6 R12 = mp.u1(i11).R1();
                int A2 = A();
                o4 = R12.o();
                if (o4 != null) {
                }
                z13 = true;
                z5Var.setShareEnabled(z13);
                x7 x7Var2622 = this.L1;
                qh0Var.setImageResource((x7Var2622 == null && x7Var2622.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                bbVar.setVisibility(0);
                xbVar.setVisibility(0);
                n5Var.setVisibility(0);
                n5Var.setTranslationX(0.0f);
                x7Var4 = this.L1;
                if (x7Var4 != null) {
                }
                if (x7Var4 == null) {
                }
                if (x7Var4 == null) {
                }
                if (x7Var4 == null) {
                }
                f6Var = bbVar;
                x60Var = null;
                n5Var.l(gd.N0(2131746157, null), false);
                if (i7 == 1) {
                }
                if (i10 == 2) {
                }
                ce0Var = this.D1;
                z11 = false;
                if (ce0Var != null) {
                }
                u3Var = this.n1;
                if (u3Var != null) {
                }
                org.telegram.ui.Components.fc.e();
                if (dbVar != null) {
                }
                if (f6Var != null) {
                }
                paVar = this.w1;
                if (paVar != null) {
                }
                u3Var2 = this.o1;
                if (u3Var2 != null) {
                }
                if (i10 == 1) {
                }
                abVar.setPreview(z11);
            }
            z13 = false;
            z5Var.setShareEnabled(z13);
            x7 x7Var26222 = this.L1;
            qh0Var.setImageResource((x7Var26222 == null && x7Var26222.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            bbVar.setVisibility(0);
            xbVar.setVisibility(0);
            n5Var.setVisibility(0);
            n5Var.setTranslationX(0.0f);
            x7Var4 = this.L1;
            if (x7Var4 != null) {
            }
            if (x7Var4 == null) {
            }
            if (x7Var4 == null) {
            }
            if (x7Var4 == null) {
            }
            f6Var = bbVar;
            x60Var = null;
            n5Var.l(gd.N0(2131746157, null), false);
            if (i7 == 1) {
            }
            if (i10 == 2) {
            }
            ce0Var = this.D1;
            z11 = false;
            if (ce0Var != null) {
            }
            u3Var = this.n1;
            if (u3Var != null) {
            }
            org.telegram.ui.Components.fc.e();
            if (dbVar != null) {
            }
            if (f6Var != null) {
            }
            paVar = this.w1;
            if (paVar != null) {
            }
            u3Var2 = this.o1;
            if (u3Var2 != null) {
            }
            if (i10 == 1) {
            }
            abVar.setPreview(z11);
        }
        f6Var = bbVar;
        x60Var = null;
        if (i7 == 1) {
        }
        if (i10 == 2) {
        }
        ce0Var = this.D1;
        z11 = false;
        if (ce0Var != null) {
        }
        u3Var = this.n1;
        if (u3Var != null) {
        }
        org.telegram.ui.Components.fc.e();
        if (dbVar != null) {
        }
        if (f6Var != null) {
        }
        paVar = this.w1;
        if (paVar != null) {
        }
        u3Var2 = this.o1;
        if (u3Var2 != null) {
        }
        if (i10 == 1) {
        }
        abVar.setPreview(z11);
    }

    public final void O() {
        sg.r0 r0Var;
        boolean z10 = false;
        if (this.g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Y(false);
            } else {
                this.y2 = new m9(this, 3);
            }
        }
        db dbVar = this.d1;
        if (dbVar != null) {
            dbVar.f.s();
        }
        n6 n6Var = this.P0;
        if (n6Var != null) {
            n6Var.h();
        }
        a6 a6Var = this.p1;
        if (a6Var != null) {
            fi.p6 R1 = mp.u1(a6Var.a).R1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) R1.i.f(i10.i(R1.a).n);
            a6Var.b = R1.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            a6Var.c.invalidate();
        }
        pa paVar = this.w1;
        if (paVar != null && (r0Var = paVar.y0.d) != null) {
            r0Var.postRunnable(r0Var.x);
        }
        bb bbVar = this.Y0;
        if (bbVar != null) {
            bbVar.x(0, false);
        }
        j1 j1Var = mp.u1(this.c).R1().w;
        if (j1Var.c || j1Var.d) {
            return;
        }
        j1Var.d = true;
        f1 f1Var = new f1(j1Var, 1);
        tr a02 = tr.a0(j1Var.a);
        a02.a.c(new di.p6(a02, z10, f1Var, 3));
    }

    public final void P(int i7, int i10) {
        pa paVar;
        xa xaVar;
        ya yaVar;
        pa paVar2;
        if (i10 == 0) {
            this.o0.setVisibility(8);
        }
        if (i7 == 0 && (paVar2 = this.w1) != null) {
            paVar2.setVisibility(8);
        }
        if (i7 == -1) {
            this.d1.setVisibility(8);
            this.h1.setVisibility(i10 == 2 ? 0 : 8);
            this.k1.setVisibility(i10 == 2 ? 0 : 8);
            this.f1.setVisibility(i10 == 2 ? 0 : 8);
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.setVisibility(i10 == 2 ? 0 : 8);
            }
            this.a1.setVisibility(i10 == 2 ? 0 : 8);
            this.q0.setVisibility(8);
        }
        boolean z10 = true;
        this.Y0.setAllowCropping(i10 == -1);
        if ((i10 == 0 || i7 == 0) && (paVar = this.w1) != null) {
            paVar.N0.setLayerType(0, null);
        }
        ce0 ce0Var = this.D1;
        if (ce0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z10 = false;
            }
            ce0Var.setAllowTouch(z10);
        }
        if (i10 == 3) {
            xa xaVar2 = this.s1;
            if (xaVar2 != null) {
                xaVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 3 && (xaVar = this.s1) != null) {
            xaVar.setVisibility(8);
            this.s1.setAppearProgress(0.0f);
            xa xaVar3 = this.s1;
            xaVar3.y = null;
            p0 p0Var = xaVar3.f;
            p0Var.M = null;
            p0Var.d = null;
            p0Var.K = false;
            xaVar3.d.setVisibility(8);
            xaVar3.a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            ya yaVar2 = this.t1;
            if (yaVar2 != null) {
                yaVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i7 != 4 || (yaVar = this.t1) == null) {
            return;
        }
        yaVar.setVisibility(8);
        this.t1.setAppearProgress(0.0f);
        ya yaVar3 = this.t1;
        yaVar3.b = null;
        p0 p0Var2 = yaVar3.h;
        p0Var2.M = null;
        p0Var2.d = null;
        p0Var2.K = false;
        yaVar3.e.setVisibility(8);
        yaVar3.setVisibility(8);
    }

    public final void Q(hb hbVar) {
        fi.j6 o4;
        mb mbVar;
        if (this.d) {
            return;
        }
        int i7 = this.c;
        if (mp.u1(i7).A2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        int i10 = 0;
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        this.t0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (mbVar = this.n) != null && mbVar.getParent() == null) {
            mb mbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.w3(windowManager, mbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(z());
        if (this.w0 == 0 && (o4 = mp.u1(i7).R1().o()) != null && o4.a(i7, 1)) {
            g0(o4, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (hbVar != null) {
            this.G = hbVar;
            this.K = hbVar.a;
            rectF.set(hbVar.c);
            this.H = hbVar.b;
            this.G.e();
        } else {
            this.K = 0;
            float L = org.telegram.messenger.g0.L(100.0f);
            Point point = org.telegram.messenger.g0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.r.c();
        int i11 = this.K;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.i0.setBackgroundColor(i10);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.b);
        f(1.0f, true, new m9(this, 6));
        d();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void R(gb gbVar, x7 x7Var, long j3) {
        mb mbVar;
        if (this.d) {
            return;
        }
        int i7 = this.c;
        if (mp.u1(i7).A2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (mbVar = this.n) != null && mbVar.getParent() == null) {
            mb mbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.w3(windowManager, mbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.L1 = x7Var;
        this.P1 = x7Var.K ? 1 : 0;
        this.t0.g = false;
        RectF rectF = this.I;
        if (gbVar != null) {
            this.G = gbVar;
            this.K = gbVar.a;
            rectF.set(gbVar.c);
            this.H = gbVar.b;
            this.G.e();
        } else {
            this.K = 0;
            float L = org.telegram.messenger.g0.L(100.0f);
            Point point = org.telegram.messenger.g0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.r.c();
        int i10 = this.K;
        this.i0.setBackgroundColor((i10 == 1 || i10 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.b);
        x7 x7Var2 = this.L1;
        if (x7Var2 != null) {
            this.d1.setText(x7Var2.C0);
        }
        K(new fa(this, 0), j3);
        J(this.L1.b0 ? 2 : 1, false);
        k0(-1, false, false);
        this.c1.b(false, false);
        d();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void S() {
        x60 x60Var;
        bb bbVar = this.Y0;
        if (bbVar != null) {
            bbVar.x(4, true);
        }
        db dbVar = this.d1;
        if (dbVar != null && (x60Var = dbVar.V0) != null) {
            x60Var.v();
            dbVar.V0 = null;
        }
        ug.y0 y0Var = new ug.y0((org.telegram.ui.ActionBar.g2) new ra(this, 1), 14, false);
        y0Var.setOnDismissListener(new ba(this, 1));
        y0Var.show();
    }

    public final void T(gb gbVar, x7 x7Var) {
        fi.j6 o4;
        mb mbVar;
        if (this.d) {
            return;
        }
        int i7 = this.c;
        if (mp.u1(i7).A2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        this.v0 = true;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (mbVar = this.n) != null && mbVar.getParent() == null) {
            mb mbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.w3(windowManager, mbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.L1 = x7Var;
        l9.a(i7, x7Var);
        x7 x7Var2 = this.L1;
        int i10 = (x7Var2 == null || !x7Var2.K) ? 0 : 1;
        this.P1 = i10;
        this.t0.g = x7Var2 != null && x7Var2.u && i10 == 1;
        if (this.w0 == 0 && (o4 = mp.u1(i7).R1().o()) != null && o4.a(i7, 1)) {
            g0(o4, true);
        }
        RectF rectF = this.I;
        if (gbVar != null) {
            this.G = gbVar;
            this.K = gbVar.a;
            rectF.set(gbVar.c);
            this.H = gbVar.b;
            this.G.e();
        } else {
            this.K = 0;
            float L = org.telegram.messenger.g0.L(100.0f);
            Point point = org.telegram.messenger.g0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        this.r.c();
        int i11 = this.K;
        this.i0.setBackgroundColor((i11 == 1 || i11 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.L = 0.0f;
        org.telegram.messenger.g0.g2(this.b);
        x7 x7Var3 = this.L1;
        if (x7Var3 != null) {
            this.d1.setText(x7Var3.C0);
        }
        this.c1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new m9(this, 6));
        d();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void U() {
        sg.t0 t0Var = this.x1;
        if (t0Var != null) {
            t0Var.bringToFront();
        }
        View view = this.y1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.z1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.A1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.B1;
        if (view4 != null) {
            view4.bringToFront();
        }
        ac acVar = this.q1;
        if (acVar != null) {
            acVar.bringToFront();
        }
        ce0 ce0Var = this.D1;
        if (ce0Var != null) {
            ce0Var.bringToFront();
        }
        ud0 ud0Var = this.F1;
        if (ud0Var != null) {
            ud0Var.bringToFront();
        }
        wd0 wd0Var = this.G1;
        if (wd0Var != null) {
            wd0Var.bringToFront();
        }
        a6 a6Var = this.p1;
        if (a6Var != null) {
            a6Var.bringToFront();
        }
        q qVar = this.r1;
        if (qVar != null) {
            qVar.bringToFront();
        }
    }

    public final void V(x7 x7Var, boolean z10) {
        x7 x7Var2;
        boolean z11;
        if (x7Var == null || this.Y0.getWidth() <= 0 || this.Y0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? x7Var.O0 : x7Var.N0;
        if (file != null) {
            file.delete();
        }
        View view = this.B0.j() ? this.B0 : this.Y0;
        float f10 = z10 ? 0.33333334f : 1.0f;
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
        x51 textureView = this.Y0.getTextureView();
        if (x7Var.K && !x7Var.u && textureView != null) {
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
        File file2 = x7Var.Q0;
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
        File file3 = x7Var.P0;
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
        pa paVar = this.w1;
        if (paVar != null && paVar.B0 != null) {
            canvas.save();
            canvas.scale(f10, f10);
            pa paVar2 = this.w1;
            paVar2.s0 = true;
            q5 q5Var = paVar2.B0;
            q5Var.a = true;
            q5Var.draw(canvas);
            pa paVar3 = this.w1;
            paVar3.B0.a = false;
            paVar3.s0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = x7.w(this.c, "jpg");
        if (z10) {
            x7Var2 = x7Var;
            z11 = z10;
            Utilities.g.c(new ai.e(this, createBitmap, z11, w10, x7Var2, 2));
        } else {
            x7Var2 = x7Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        if (!z11) {
            x7Var2.N0 = w10;
        }
        x7Var2.b1 = createScaledBitmap;
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
        fi.j6 o4;
        ?? r16;
        k9 k9Var = this.r0;
        BitmapDrawable bitmapDrawable = null;
        if (k9Var != null) {
            k9Var.dismiss();
            this.r0 = null;
        }
        boolean z10 = this.O1;
        org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
        if (z10) {
            d1 d1Var = this.f1;
            d1Var.getClass();
            d1Var.c(gd.O0("VideoConvertFail"));
            q2Var.a();
            y5 y5Var = this.c1.c;
            int i7 = -this.V1;
            this.V1 = i7;
            org.telegram.messenger.g0.E3(i7, y5Var, null);
            return;
        }
        db dbVar = this.d1;
        if (dbVar != null && dbVar.o()) {
            q2Var.a();
            org.telegram.ui.Components.n6 n6Var = dbVar.w;
            int i10 = -this.V1;
            this.V1 = i10;
            org.telegram.messenger.g0.E3(i10, n6Var, null);
            dbVar.e();
            return;
        }
        x7 x7Var = this.L1;
        int i11 = this.c;
        int i12 = 0;
        if ((x7Var == null || (!x7Var.g && x7Var.J0 == 0)) && (o4 = mp.u1(i11).i0.o()) != null && o4.a(i11, A())) {
            g0(o4, false);
            return;
        }
        this.L1.D0 = mp.u1(i11).j5();
        fi.b bVar = this.a;
        boolean z11 = true;
        if (dbVar != null && !this.L1.D0) {
            CharSequence text = dbVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((fz0[]) spannable.getSpans(0, text.length(), fz0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.kc(this.n, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.g0.R2(gd.N0(2131744337, null), org.telegram.ui.ActionBar.n6.Xc, 0, new m9(this, 27), bVar)).k(true);
                    int i13 = -this.V1;
                    this.V1 = i13;
                    org.telegram.messenger.g0.E3(i13, dbVar, null);
                    return;
                }
            }
        }
        x7 x7Var2 = this.L1;
        if (x7Var2.g || x7Var2.J0 != 0) {
            x7Var2.l = false;
            h(null);
            o0();
            return;
        }
        if (this.O != 0) {
            x7Var2.v0 = mp.u1(i11).l1(this.O);
        }
        bb bbVar = this.Y0;
        bbVar.x(3, true);
        k9 k9Var2 = new k9(this.L1.I0, this.b, bVar);
        k9Var2.X0(this.L1.E0);
        k9Var2.W0(this.L1.v0);
        k9Var2.A1 = this.N;
        k9Var2.P1 = new n9(this, 14);
        k9Var2.M0(!this.B0.j());
        ArrayList arrayList = this.J1;
        k9Var2.T0(arrayList == null ? this.L1.r() : arrayList.size());
        k9Var2.R0(false);
        CharSequence text2 = dbVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (u41 u41Var : (u41[]) ((Spanned) text2).getSpans(0, text2.length(), u41.class)) {
                if (u41Var != null) {
                    try {
                        TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(Long.parseLong(u41Var.getURL())));
                        if (c22 != null && !n10.C(c22) && n10.o(c22) != null && !arrayList2.contains(c22)) {
                            arrayList2.add(n10.o(c22));
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
                boolean z12 = z11;
                if (charAt == '@') {
                    i15 = i14 + 1;
                } else if (charAt == ' ') {
                    if (i15 != -1) {
                        String charSequence = text2.subSequence(i15, i14).toString();
                        TLObject h22 = mp.u1(i11).h2(charSequence);
                        if (h22 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) h22;
                            if (!user.bot && !n10.C(user) && user.id != 777000 && !n10.A(user) && !arrayList2.contains(charSequence)) {
                                arrayList2.add(charSequence);
                            }
                        }
                    }
                    i15 = -1;
                }
                i14++;
                z11 = z12;
            }
            boolean z13 = z11;
            r16 = z13;
            if (i15 != -1) {
                String charSequence2 = text2.subSequence(i15, text2.length()).toString();
                TLObject h23 = mp.u1(i11).h2(charSequence2);
                r16 = z13;
                if (h23 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) h23;
                    r16 = z13;
                    if (!user2.bot) {
                        r16 = z13;
                        if (!n10.C(user2)) {
                            r16 = z13;
                            if (user2.id != 777000) {
                                r16 = z13;
                                if (!n10.A(user2)) {
                                    r16 = z13;
                                    if (!arrayList2.contains(charSequence2)) {
                                        arrayList2.add(charSequence2);
                                        r16 = z13;
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
        k9Var2.N1 = arrayList2;
        k9Var2.R1 = new n9(this, 15);
        k9Var2.S1 = new n9(this, 16);
        k9Var2.O1 = new v9(this, 9);
        this.r0 = k9Var2;
        x7 x7Var3 = this.L1;
        if (x7Var3.K) {
            if (bbVar != null && !x7Var3.f0 && this.g0 != 2) {
                x7Var3.e0 = bbVar.getCurrentPosition();
                n9 n9Var = new n9(this, 17);
                sg.t0 t0Var = this.x1;
                View view = this.A1;
                View[] viewArr = new View[3];
                viewArr[0] = bbVar;
                viewArr[r16] = t0Var;
                viewArr[2] = view;
                bbVar.h(n9Var, viewArr);
            }
            k9 k9Var3 = this.r0;
            Bitmap bitmap = this.L1.g0;
            m9 m9Var = new m9(this, 20);
            if (bitmap != null) {
                k9Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            k9Var3.W1 = bitmapDrawable;
            k9Var3.X1 = m9Var;
            q1 q1Var = k9Var3.m1;
            if (q1Var != null) {
                for (View view2 : q1Var.getViewPages()) {
                    if (view2 instanceof f9) {
                        f9 f9Var = (f9) view2;
                        f9Var.h(false);
                        f9Var.f(false);
                    }
                }
            }
        }
        this.r0.setOnDismissListener(new ba(this, i12));
        this.r0.show();
    }

    public final void X(ib ibVar) {
        int i7 = 0;
        RectF rectF = this.I;
        if (ibVar != null) {
            this.G = ibVar;
            this.K = ibVar.a;
            rectF.set(ibVar.c);
            this.H = ibVar.b;
        } else {
            this.G = null;
            this.K = 0;
            float L = org.telegram.messenger.g0.L(100.0f);
            Point point = org.telegram.messenger.g0.q;
            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
            this.H = org.telegram.messenger.g0.L(8.0f);
        }
        int i10 = this.K;
        if (i10 != 1 && i10 != 0) {
            i7 = -14737633;
        }
        this.i0.setBackgroundColor(i7);
    }

    public final void Y(boolean z10) {
        if (!this.x2 || z10) {
            int i7 = 0;
            this.t2 = false;
            Activity activity = this.b;
            if (activity != null) {
                boolean z11 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.t2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    lq lqVar = new lq(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.g0.L(64.0f);
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    lqVar.e = L;
                    lqVar.f = L2;
                    this.B0.setCameraThumb(lqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.a);
                        int i10 = org.telegram.ui.ActionBar.n6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.n6.x0(null, i10, false), null);
                        alertDialog$Builder.n(i10, null);
                        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.N0(2131747114, null));
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.U = W2;
                        alertDialog$Builder.k(gd.N0(2131747106, null), new v9(this, 12));
                        alertDialog$Builder.h(gd.N0(2131751760, null), null);
                        t1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, ks.w1);
                    this.x2 = true;
                }
            }
            if (this.t2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                q();
            } else {
                CameraController.getInstance().initCamera(new m9(this, i7));
            }
        }
    }

    public final void a0(Runnable runnable) {
        qa qaVar = this.C0;
        if (qaVar == null || qaVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.i.c(new di.a8(this, this.C0.getTextureView().getBitmap(), runnable, 21));
        } catch (Throwable unused) {
        }
    }

    public final void b0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new oa(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 4)).setDuration(320L).setInterpolator(kr.h).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z10 ? 0 : 8);
            view.setAlpha(z10 ? 1.0f : 0.0f);
            m0();
        }
    }

    public final void c0(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z10) {
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
        ks.e().b(this, ks.r2);
        int i7 = this.c;
        ks.f(i7).b(this, ks.B5);
        ks.f(i7).b(this, ks.d3);
    }

    public final void d0(String str) {
        int i7;
        yb ybVar = this.F0;
        ybVar.clearAnimation();
        qa qaVar = this.C0;
        if ((qaVar != null && qaVar.isDual()) || this.b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(ybVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals("auto")) {
                ybVar.setContentDescription(gd.N0(2131754915, null));
                i7 = R.drawable.media_photo_flash_auto2;
            }
            ybVar.setContentDescription(gd.N0(2131754914, null));
            i7 = R.drawable.media_photo_flash_off2;
        } else {
            if (str.equals("on")) {
                ybVar.setContentDescription(gd.N0(2131754913, null));
                i7 = R.drawable.media_photo_flash_on2;
            }
            ybVar.setContentDescription(gd.N0(2131754914, null));
            i7 = R.drawable.media_photo_flash_off2;
        }
        if (ybVar.n != i7) {
            ybVar.n = i7;
            ValueAnimator valueAnimator = ybVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ybVar.r = null;
            }
            ybVar.setDrawable(i7);
        }
        if (this.g0 == 0 && !this.J0.e && this.Z1 != null && !H()) {
            z10 = true;
        }
        b0(ybVar, z10, true);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.j6 o4;
        x7 x7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i7 == ks.r2) {
            n6 n6Var = this.P0;
            if (n6Var != null) {
                n6Var.h();
            }
            if (this.n2 == null || MediaController.c2 == null) {
                return;
            }
            for (int i11 = 0; i11 < MediaController.c2.size(); i11++) {
                ue ueVar = (ue) MediaController.c2.get(i11);
                int i12 = ueVar.a;
                ue ueVar2 = this.n2;
                if (i12 == ueVar2.a && ueVar.b == ueVar2.b) {
                    this.n2 = ueVar;
                    return;
                }
            }
            return;
        }
        if (i7 == ks.B5) {
            n6 n6Var2 = this.P0;
            if (n6Var2 == null || this.W1) {
                return;
            }
            n6Var2.h();
            return;
        }
        if (i7 == ks.d3) {
            int i13 = this.g0;
            int i14 = this.c;
            if (i13 != 1) {
                if (i13 == 0 && (o4 = mp.u1(i14).R1().o()) != null && o4.a(i14, 1)) {
                    x7 x7Var2 = this.L1;
                    if (x7Var2 == null || x7Var2.J0 == 0) {
                        g0(o4, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.O1 && !this.d1.o()) {
                fi.p6 R1 = mp.u1(i14).R1();
                int A = A();
                fi.j6 o10 = R1.o();
                if (o10 == null || !o10.a(R1.a, A) || ((x7Var = this.L1) != null && (x7Var.g || x7Var.J0 != 0))) {
                    z10 = true;
                }
            }
            this.c1.setShareEnabled(z10);
        }
    }

    public final void e(boolean z10) {
        e1 e1Var;
        this.L0 = z10;
        Boolean bool = this.q2;
        if (bool == null || bool.booleanValue() != z10) {
            int i7 = 0;
            if (this.N0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.N0 == null) {
                    return;
                }
            }
            if (this.N0.V) {
                this.r2 = new w9(this, z10, i7);
                return;
            }
            ValueAnimator valueAnimator = this.o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o2 = null;
            }
            r1.g gVar = this.p2;
            if (gVar != null) {
                gVar.d();
                this.p2 = null;
            }
            if (this.N0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.N0 == null) {
                    return;
                }
            }
            p3 p3Var = this.N0;
            if (p3Var != null) {
                p3Var.L = false;
            }
            if (z10 && (e1Var = this.O0) != null) {
                e1Var.a(false);
            }
            fb fbVar = this.r;
            if (fbVar != null) {
                fbVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.N0.setImportantForAccessibility(z10 ? 0 : 4);
            this.q2 = Boolean.valueOf(z10);
            float translationY = this.N0.getTranslationY();
            mb mbVar = this.n;
            float height = z10 ? 0.0f : (mbVar.getHeight() - this.N0.g()) + (org.telegram.messenger.g0.n * 2.5f);
            int i10 = 1;
            Math.max(1, mbVar.getHeight());
            p3 p3Var2 = this.N0;
            p3Var2.L = !z10;
            this.l2 = this.k2 == null;
            if (z10) {
                r1.g gVar2 = new r1.g(p3Var2, r1.g.p, height);
                this.p2 = gVar2;
                gVar2.m.a(0.75f);
                this.p2.m.b(350.0f);
                this.p2.a(new x9(this, height, i7));
                this.p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.o2 = ofFloat;
                ofFloat.addUpdateListener(new y9(this, i7));
                this.o2.addListener(new na(this, i10));
                this.o2.setDuration(450L);
                this.o2.setInterpolator(kr.h);
                this.o2.start();
            }
            if (!z10 && !this.T1) {
                this.m2 = null;
            }
            if (z10 || this.g0 != 0 || this.t2) {
                return;
            }
            q();
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.g1 == null) {
            nh0 nh0Var = new nh0(R.raw.media_mute_unmute, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.g1 = nh0Var;
            nh0Var.G *= 1.5f;
        }
        this.h1.setAnimation(this.g1);
        if (!z11) {
            this.g1.N(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            nh0 nh0Var2 = this.g1;
            if (nh0Var2.b0 > 20) {
                nh0Var2.N(0, false, false);
            }
            this.g1.P(20);
            this.g1.start();
            return;
        }
        nh0 nh0Var3 = this.g1;
        int i7 = nh0Var3.b0;
        if (i7 == 0 || i7 >= 43) {
            return;
        }
        nh0Var3.P(43);
        this.g1.start();
    }

    public final void f(float f10, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        fb fbVar = this.r;
        if (!z10) {
            this.M = null;
            this.J = f10;
            j();
            fbVar.invalidate();
            this.n.invalidate();
            runnable.run();
            n();
            return;
        }
        this.Q.d();
        ks.e().k(ks.j1, 512);
        this.M = Float.valueOf(this.L);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new y9(this, 5));
        this.F.addListener(new di.j6(this, f10, runnable, 3));
        if (f10 < 1.0f && this.w) {
            this.F.setDuration(250L);
            this.F.setInterpolator(kr.h);
        } else if (f10 > 0.0f || fbVar.a < org.telegram.messenger.g0.L(20.0f)) {
            this.F.setDuration(300L);
            this.F.setInterpolator(new x1.a());
        } else if (f10 >= 0.0f || !this.P) {
            this.F.setDuration(400L);
            this.F.setInterpolator(kr.h);
        } else {
            this.F.setDuration(200L);
            this.F.setInterpolator(kr.h);
            this.P = false;
        }
        this.F.start();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 3));
        }
    }

    public final void g(boolean z10, boolean z11) {
        h0 h0Var;
        if (z10) {
            u3 u3Var = this.m1;
            if (u3Var != null) {
                u3Var.f(true);
            }
            u3 u3Var2 = this.n1;
            if (u3Var2 != null) {
                u3Var2.f(true);
            }
            u3 u3Var3 = this.l1;
            if (u3Var3 != null) {
                u3Var3.f(true);
            }
            u3 u3Var4 = this.X0;
            if (u3Var4 != null) {
                u3Var4.f(true);
            }
        }
        if (this.b2 == z10 && this.c2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.a2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.a2 = null;
        }
        this.b2 = z10;
        this.c2 = H();
        if (z10 && (h0Var = this.J0) != null && h0Var.e) {
            h0Var.a(false, z11);
        }
        l0(z11);
        ha haVar = this.R0;
        r3 r3Var = this.V0;
        r3 r3Var2 = this.U0;
        if (!z11) {
            r3Var2.setAlpha((z10 && this.g0 == 0 && !H()) ? 1.0f : 0.0f);
            r3Var2.setTranslationY((z10 && this.g0 == 0 && !H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            r3Var.setAlpha((!z10 && this.g0 == 0 && H()) ? 0.6f : 0.0f);
            r3Var.setTranslationY((!z10 && this.g0 == 0 && H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            haVar.setAlpha((z10 || this.g0 != 0 || H()) ? 0.0f : 1.0f);
            haVar.setTranslationY((z10 || this.g0 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a2 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r3Var2, (Property<r3, Float>) property, (z10 && this.g0 == 0 && !H()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(r3Var2, (Property<r3, Float>) property2, (z10 && this.g0 == 0 && !H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(r3Var, (Property<r3, Float>) property, (!z10 && this.g0 == 0 && H()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(r3Var, (Property<r3, Float>) property2, (!z10 && this.g0 == 0 && H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) property, (z10 || this.g0 != 0 || H()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) property2, (z10 || this.g0 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f));
        this.a2.setDuration(260L);
        this.a2.setInterpolator(kr.h);
        this.a2.start();
    }

    public final void g0(fi.j6 j6Var, boolean z10) {
        if (this.A2) {
            return;
        }
        sa saVar = new sa(j6Var.b(), this.c, this.b, new ra(this, 0), null);
        saVar.T1 = A();
        saVar.setOnDismissListener(new k70(2, this, z10));
        this.Y0.x(7, true);
        this.A2 = true;
        saVar.show();
    }

    public final void h(Runnable runnable) {
        x7 x7Var;
        Runnable runnable2;
        bb bbVar;
        de0 de0Var = this.C1;
        if (de0Var == null || (x7Var = this.L1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        x7Var.j = de0Var.a() | x7Var.j;
        x7 x7Var2 = this.L1;
        de0 de0Var2 = this.C1;
        File file = x7Var2.Z0;
        if (file != null) {
            file.delete();
            x7Var2.Z0 = null;
        }
        ff savedFilterState = de0Var2.getSavedFilterState();
        x7Var2.a1 = savedFilterState;
        if (x7Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.a()) {
                Bitmap bitmap = de0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i7 = x7Var2.R;
                    matrix.postScale(i7 == 1 ? -1.0f : 1.0f, i7 == 2 ? -1.0f : 1.0f, x7Var2.k0 / 2.0f, x7Var2.l0 / 2.0f);
                    matrix.postRotate(-x7Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    x7Var2.n0.preScale(x7Var2.k0 / createBitmap.getWidth(), x7Var2.l0 / createBitmap.getHeight());
                    x7Var2.k0 = createBitmap.getWidth();
                    x7Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = x7Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        x7Var2.Z0.delete();
                    }
                    String k10 = x7.k(x7Var2.L);
                    boolean z10 = "png".equals(k10) || "webp".equals(k10);
                    x7Var2.Z0 = x7.w(x7Var2.a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(x7Var2.Z0));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.i.c(new aa.c0(x7Var2, createBitmap, z10, runnable2, 4));
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
            x7 x7Var3 = this.L1;
            if (x7Var3.K || (bbVar = this.Y0) == null) {
                return;
            }
            bbVar.set(x7Var3);
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.e2 == z10) {
            return;
        }
        this.e2 = z10;
        if (z11) {
            this.K0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(kr.h).withEndAction(new w9(this, z10, 1)).start();
            return;
        }
        this.K0.clearAnimation();
        this.K0.setAlpha(z10 ? 1.0f : 0.0f);
        if (z10) {
            return;
        }
        this.K0.b(false, false);
    }

    public final void i() {
        if (this.L1 == null || this.E1 == null || this.i0.getMeasuredWidth() <= 0 || this.i0.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        if (this.L1.Q != 0) {
            matrix.postRotate(-r1, this.i0.getMeasuredWidth() / 2.0f, this.i0.getMeasuredHeight() / 2.0f);
            if ((this.L1.Q / 90) % 2 == 1) {
                matrix.postScale(this.i0.getMeasuredWidth() / this.i0.getMeasuredHeight(), this.i0.getMeasuredHeight() / this.i0.getMeasuredWidth(), this.i0.getMeasuredWidth() / 2.0f, this.i0.getMeasuredHeight() / 2.0f);
            }
        }
        matrix.postScale((1.0f / this.i0.getMeasuredWidth()) * this.L1.k0, (1.0f / this.i0.getMeasuredHeight()) * this.L1.l0);
        matrix.postConcat(this.L1.n0);
        matrix.postScale(this.i0.getMeasuredWidth() / this.L1.i0, this.i0.getMeasuredHeight() / this.L1.j0);
        this.E1.setTransform(matrix);
        this.E1.invalidate();
    }

    public final void i0(boolean z10) {
        g81 g81Var = this.W0;
        if ((g81Var.getTag() != null && z10) || (g81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f2;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                m9 m9Var = new m9(this, 25);
                this.f2 = m9Var;
                org.telegram.messenger.g0.h3(m9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.g2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        g81Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.g2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            g81Var.setVisibility(0);
        }
        this.g2.playTogether(ObjectAnimator.ofFloat(g81Var, (Property<g81, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.g2.addListener(new bi.j7(14, this, z10));
        this.g2.start();
        if (z10) {
            m9 m9Var2 = new m9(this, 26);
            this.f2 = m9Var2;
            org.telegram.messenger.g0.h3(m9Var2, 2000L);
        }
    }

    public final void j() {
        fi.c3 c3Var;
        if (this.K != 1) {
            return;
        }
        float left = this.i0.getLeft();
        float top = this.i0.getTop();
        float measuredWidth = this.i0.getMeasuredWidth();
        float measuredHeight = this.i0.getMeasuredHeight();
        RectF rectF = this.e0;
        rectF.set(left, top, measuredWidth, measuredHeight);
        rectF.offset(this.r.getX(), this.r.getY());
        float f10 = this.J;
        RectF rectF2 = this.I;
        RectF rectF3 = this.d0;
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
        this.i0.setAlpha(this.J);
        float f11 = rectF3.left;
        this.i0.setTranslationX((f11 - r3.getLeft()) - this.r.getX());
        float f12 = rectF3.top;
        this.i0.setTranslationY((f12 - r3.getTop()) - this.r.getY());
        ib ibVar = this.G;
        if (ibVar != null && (c3Var = ibVar.f) != null) {
            c3Var.setTranslationX((rectF.left - rectF2.left) * this.J);
            this.G.f.setTranslationY((rectF.top - rectF2.top) * this.J);
        }
        this.i0.setScaleX(rectF3.width() / this.i0.getMeasuredWidth());
        this.i0.setScaleY(rectF3.height() / this.i0.getMeasuredHeight());
        this.j0.setAlpha(this.J);
        this.l0.setAlpha(this.J);
        this.m0.setAlpha(this.J);
        if (this.g0 == 2) {
            this.v1.setAlpha(this.J);
        }
    }

    public final void j0() {
        k9 k9Var = this.r0;
        if (k9Var != null) {
            k9Var.dismiss();
            this.r0 = null;
        }
        k9 k9Var2 = new k9(86400, this.b, this.a);
        k9Var2.V0();
        k9Var2.X0(this.z0);
        TLRPC.InputPeer inputPeer = this.y0;
        if (inputPeer == null) {
            inputPeer = this.O != 0 ? mp.u1(this.c).l1(this.O) : new TLRPC.TL_inputPeerSelf();
        }
        k9Var2.W0(inputPeer);
        k9Var2.A1 = this.N;
        k9Var2.P1 = new n9(this, 18);
        k9Var2.M0(false);
        k9Var2.T0(1);
        k9Var2.R0(false);
        k9Var2.R1 = new n9(this, 19);
        k9Var2.O1 = new v9(this, 11);
        this.r0 = k9Var2;
        k9Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        if (r2.isRecycled() != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        x7 x7Var;
        ImageReceiver photoImage;
        float f10;
        if (this.w1 == null || (x7Var = this.L1) == null) {
            return;
        }
        x7Var.f();
        this.L1.j |= this.w1.t0();
        x7 x7Var2 = this.L1;
        ArrayList arrayList = x7Var2.T0;
        if (arrayList == null) {
            x7Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        pa paVar = this.w1;
        x7 x7Var3 = this.L1;
        paVar.s0(x7Var3.T0, false, false, false, false, x7Var3);
        x7 x7Var4 = this.L1;
        if (!x7Var4.K) {
            x7Var4.S0 = Utilities.k(this.w1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.w1.getMasks();
        this.L1.U0 = masks != null ? new ArrayList(masks) : null;
        x7 x7Var5 = this.L1;
        boolean z10 = x7Var5.K;
        boolean E = x7Var5.E();
        this.L1.T0 = new ArrayList();
        pa paVar2 = this.w1;
        x7 x7Var6 = this.L1;
        Bitmap s02 = paVar2.s0(x7Var6.T0, true, false, false, !z10, x7Var6);
        if (this.L1.T0.isEmpty()) {
            this.L1.T0 = null;
        }
        try {
            File file = this.L1.P0;
            if (file != null) {
                file.delete();
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = this.L1.R0;
            if (file2 != null) {
                file2.delete();
            }
        } catch (Exception unused2) {
        }
        try {
            File file3 = this.L1.Q0;
            if (file3 != null) {
                file3.delete();
            }
        } catch (Exception unused3) {
        }
        x7 x7Var7 = this.L1;
        x7Var7.P0 = null;
        x7Var7.R0 = null;
        x7Var7.Q0 = null;
        int i7 = this.c;
        org.telegram.messenger.w7.G(i7);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        x7 x7Var8 = this.L1;
        x7Var7.P0 = org.telegram.messenger.w7.J(org.telegram.messenger.ec.a0(s02, compressFormat, x7Var8.i0, x7Var8.j0, 87), null, true, true);
        if (s02 != null && !s02.isRecycled()) {
            s02.recycle();
        }
        x7 x7Var9 = this.L1;
        if (x7Var9.u) {
            File file4 = x7Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.L1.Y0 = null;
            }
            x7 x7Var10 = this.L1;
            long j3 = x7Var10.z0;
            if (j3 != Long.MIN_VALUE) {
                Drawable drawable = x7Var10.x0;
                if (drawable == null) {
                    drawable = f6.e(null, i7, j3, this.d2);
                }
                if (drawable != null) {
                    this.L1.Y0 = x7.w(i7, "webp");
                    x7 x7Var11 = this.L1;
                    Bitmap createBitmap = Bitmap.createBitmap(x7Var11.i0, x7Var11.j0, Bitmap.Config.ARGB_8888);
                    x7.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.Y0));
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
        x7 x7Var12 = this.L1;
        if (x7Var12.u) {
            File file5 = x7Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                this.L1.X0 = null;
            }
            x7 x7Var13 = this.L1;
            if (x7Var13.u && x7Var13.K) {
                int i10 = x7Var13.k0;
                int i11 = x7Var13.l0;
                tg.z0 r02 = this.w1.r0();
                if (r02 != null) {
                    tg.u0 u0Var = r02.t0;
                    if (u0Var.getChildCount() == 1 && i10 > 0 && i11 > 0) {
                        int i12 = 0;
                        if ((u0Var.getChildAt(0) instanceof org.telegram.ui.Cells.r1) && (photoImage = ((org.telegram.ui.Cells.r1) u0Var.getChildAt(0)).getPhotoImage()) != null) {
                            float f11 = photoImage.N0;
                            if (((int) f11) > 0) {
                                float f12 = photoImage.O0;
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
                                        int[] iArr = photoImage.X0;
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
                                    float f18 = photoImage.N0 / f10;
                                    float f19 = (i14 * f10) / f10;
                                    float f20 = photoImage.O0 / f10;
                                    rectF.set(f17 - f18, f19 - f20, f18 + f17, f20 + f19);
                                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                                    Paint paint = new Paint(1);
                                    paint.setColor(-1);
                                    canvas.drawPath(path, paint);
                                    try {
                                        this.L1.X0 = x7.w(i7, "webp");
                                        createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.X0));
                                    } catch (Exception e13) {
                                        org.telegram.messenger.a8.g(e13, true);
                                        this.L1.X0 = null;
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
            pa paVar3 = this.w1;
            ArrayList arrayList2 = new ArrayList();
            x7 x7Var14 = this.L1;
            int i16 = x7Var14.i0;
            Bitmap s03 = paVar3.s0(arrayList2, false, true, false, false, x7Var14);
            x7 x7Var15 = this.L1;
            org.telegram.messenger.w7.G(i7);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            x7 x7Var16 = this.L1;
            x7Var15.R0 = org.telegram.messenger.w7.J(org.telegram.messenger.ec.a0(s03, compressFormat2, x7Var16.i0, x7Var16.j0, 87), null, true, true);
            if (s03 != null && !s03.isRecycled()) {
                s03.recycle();
            }
        }
        if (this.w1.y0.getPainting().E) {
            Bitmap blurBitmap = this.w1.getBlurBitmap();
            x7 x7Var17 = this.L1;
            org.telegram.messenger.w7.G(i7);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            x7 x7Var18 = this.L1;
            x7Var17.Q0 = org.telegram.messenger.w7.J(org.telegram.messenger.ec.a0(blurBitmap, compressFormat3, x7Var18.i0, x7Var18.j0, 87), null, true, true);
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
    public final void k0(int i7, boolean z10, boolean z11) {
        float f10;
        boolean z12;
        xa xaVar;
        float f11;
        int i10;
        ya yaVar;
        int i11;
        float f12;
        x7 x7Var;
        ImageView imageView;
        int i12;
        int i13;
        float f13;
        float f14;
        wd0 wd0Var;
        ud0 ud0Var;
        ImageView imageView2;
        int i14;
        x7 x7Var2;
        pa paVar;
        pa paVar2;
        int i15 = this.h0;
        if (i15 == i7 && !z10) {
            return;
        }
        db dbVar = this.d1;
        if (i7 != -1 && dbVar != null && dbVar.O1) {
            return;
        }
        this.h0 = i7;
        AnimatorSet animatorSet = this.s2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s2 = null;
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.q0;
        xb xbVar = this.a1;
        d1 d1Var = this.f1;
        u2 u2Var = this.o0;
        w5 w5Var = this.k1;
        qh0 qh0Var = this.h1;
        if (i15 != i7) {
            if (i7 == -1) {
                u2Var.setVisibility(0);
                dbVar.setVisibility(0);
                pa paVar3 = this.w1;
                if (paVar3 != null) {
                    paVar3.C0();
                }
                d1Var.setVisibility(0);
                x7 x7Var3 = this.L1;
                if (x7Var3 == null || !x7Var3.u) {
                    ImageView imageView3 = this.j1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    F().setVisibility(0);
                    n0(false);
                }
                n5Var.setVisibility(0);
                if (this.P1 == 1) {
                    qh0Var.setVisibility(0);
                    w5Var.setVisibility(0);
                } else {
                    x7 x7Var4 = this.L1;
                    if (x7Var4 != null && !TextUtils.isEmpty(x7Var4.y)) {
                        qh0Var.setVisibility(8);
                        w5Var.setVisibility(0);
                    }
                }
                xbVar.setVisibility(0);
            }
            if (i7 == 0 && (paVar2 = this.w1) != null) {
                paVar2.setVisibility(0);
            }
            if ((i7 == 0 || i15 == 0) && (paVar = this.w1) != null) {
                paVar.N0.setLayerType(2, null);
            }
            pa paVar4 = this.w1;
            if (paVar4 != null) {
                paVar4.y1.b(i7 != 0);
            }
            dbVar.M.b(i7 != -1);
            org.telegram.ui.Components.fc.e();
            if (this.C1 != null && i15 == 1) {
                h(null);
            }
            ce0 ce0Var = this.D1;
            if (ce0Var != null) {
                ce0Var.setAllowTouch(false);
            }
            this.l1.f(true);
            mb mbVar = this.n;
            bb bbVar = this.Y0;
            Activity activity = this.b;
            if (i7 == 3) {
                if (this.s1 == null) {
                    xa xaVar2 = new xa(this, activity, bbVar);
                    this.s1 = xaVar2;
                    mbVar.addView(xaVar2.d);
                    mbVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
                x7 x7Var5 = this.L1;
                if (x7Var5 != null) {
                    this.s1.setEntry(x7Var5);
                }
            } else if (i15 == 3) {
                bbVar.b();
                xa xaVar3 = this.s1;
                if (xaVar3 != null) {
                    xaVar3.a.setCropEditorDrawing(xaVar3);
                    xaVar3.E = true;
                }
            }
            if (i7 == 4) {
                if (this.t1 == null) {
                    ya yaVar2 = new ya(this, activity, bbVar);
                    this.t1 = yaVar2;
                    mbVar.addView(yaVar2.e);
                    mbVar.addView(this.t1);
                }
                this.t1.setVisibility(0);
            } else if (i15 == 4) {
                bbVar.b();
                ya yaVar3 = this.t1;
                if (yaVar3 != null) {
                    yaVar3.F = true;
                }
            }
        }
        this.c1.b((i7 == -1 || i7 == 2) && this.J > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        de0 de0Var = this.C1;
        boolean z13 = de0Var == null && i7 == 1;
        float f15 = 1.0f;
        if (i7 == 1) {
            r();
            de0 de0Var2 = this.C1;
            this.w2 = de0Var2;
            FrameLayout toolsView = de0Var2 != null ? de0Var2.getToolsView() : null;
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
            if (i15 == 1 && de0Var != null) {
                this.w2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(de0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.C1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i7 != 0) {
                    t();
                    this.w2 = this.w1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(u2Var, (Property<u2, Float>) property, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.w1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -org.telegram.messenger.g0.L(16.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property2, org.telegram.messenger.g0.L(48.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -org.telegram.messenger.g0.L(32.0f), f10));
                } else if (i15 == 0 && this.w1 != null) {
                    this.w2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(u2Var, (Property<u2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getTopLayout(), (Property<View, Float>) property3, f10));
                    View topLayout2 = this.w1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -org.telegram.messenger.g0.L(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property3, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property4, org.telegram.messenger.g0.L(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -org.telegram.messenger.g0.L(32.0f)));
                }
                xaVar = this.s1;
                if (xaVar == null) {
                    og.f fVar = xaVar.h;
                    if (i7 == 3) {
                        Property property5 = View.ALPHA;
                        i10 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<og.f, Float>) property5, 0.0f, 1.0f));
                        og.f fVar2 = this.s1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f11 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar2, (Property<og.f, Float>) property6, org.telegram.messenger.g0.L(52.0f), f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property6, org.telegram.messenger.g0.L(52.0f), f10));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new y9(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        f11 = 52.0f;
                        i10 = 2;
                        if (i15 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<og.f, Float>) property7, 1.0f, 0.0f));
                            og.f fVar3 = this.s1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(fVar3, (Property<og.f, Float>) property8, f10, org.telegram.messenger.g0.L(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property8, f10, org.telegram.messenger.g0.L(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.s1.getAppearProgress(), f10);
                            ofFloat2.addUpdateListener(new y9(this, i10));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    f11 = 52.0f;
                    i10 = 2;
                }
                yaVar = this.t1;
                if (yaVar != null) {
                    og.f fVar4 = yaVar.n;
                    if (i7 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i10];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<og.f, Float>) property9, fArr));
                        og.f fVar5 = this.t1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i10];
                        fArr2[0] = org.telegram.messenger.g0.L(f11);
                        fArr2[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(fVar5, (Property<og.f, Float>) property10, fArr2));
                        float[] fArr3 = new float[i10];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.t1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.t1.r;
                        float[] fArr4 = new float[i10];
                        fArr4[0] = org.telegram.messenger.g0.L(f11);
                        fArr4[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i10];
                        fArr5[0] = this.t1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new y9(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i15 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i10];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<og.f, Float>) property11, fArr6));
                        og.f fVar6 = this.t1.n;
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
                        arrayList.add(ObjectAnimator.ofFloat(this.t1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.t1.r;
                        float L2 = org.telegram.messenger.g0.L(f11);
                        float[] fArr9 = new float[i10];
                        fArr9[0] = f10;
                        fArr9[1] = L2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i10];
                        fArr10[0] = this.t1.getAppearProgress();
                        fArr10[1] = f10;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new y9(this, 4));
                        arrayList.add(ofFloat4);
                    }
                }
                Property property13 = View.ALPHA;
                if (i7 != -1 || i7 == 2) {
                    i11 = 1;
                    if (this.P1 == 1) {
                        f12 = 1.0f;
                        float[] fArr11 = new float[i11];
                        fArr11[0] = f12;
                        arrayList.add(ObjectAnimator.ofFloat(qh0Var, (Property<qh0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(w5Var, (Property<w5, Float>) property13, ((i7 != -1 || i7 == 2) && (this.P1 == i11 || !((x7Var = this.L1) == null || TextUtils.isEmpty(x7Var.y)))) ? 1.0f : f10));
                        arrayList.add(ObjectAnimator.ofFloat(d1Var, (Property<d1, Float>) property13, (i7 != -1 || i7 == 2) ? 1.0f : f10));
                        imageView = this.j1;
                        if (imageView != null) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i7 == -1 || i7 == 2) && (x7Var2 = this.L1) != null && x7Var2.u) ? 1.0f : f10));
                        } else {
                            i12 = 1;
                        }
                        int i16 = this.g0;
                        float[] fArr12 = new float[i12];
                        fArr12[0] = ((i16 != i12 || i16 == 2) && i7 == -1) ? 1.0f : f10;
                        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property13, fArr12));
                        za zaVar = this.i0;
                        if (i7 == i12) {
                            zaVar.setPivotY(zaVar.getMeasuredHeight() * 0.2f);
                            i13 = org.telegram.messenger.g0.L(164.0f);
                        } else if (i7 == 0) {
                            zaVar.setPivotY(zaVar.getMeasuredHeight() * 0.6f);
                            i13 = org.telegram.messenger.g0.L(40.0f);
                        } else if (i7 == 2) {
                            zaVar.setPivotY(f10);
                            i13 = xbVar.getContentHeight() + org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i13 = 0;
                        }
                        if (i13 > 0) {
                            f13 = (r10 - i13) / (zaVar.getHeight() - ((int) zaVar.getPivotY()));
                        } else {
                            f13 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(zaVar, (Property<za, Float>) View.SCALE_X, f13));
                        arrayList.add(ObjectAnimator.ofFloat(zaVar, (Property<za, Float>) View.SCALE_Y, f13));
                        if (i7 == -1) {
                            f14 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(zaVar, (Property<za, Float>) View.TRANSLATION_Y, 0.0f));
                        } else {
                            f14 = 0.0f;
                        }
                        wd0Var = this.G1;
                        if (wd0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(wd0Var, (Property<wd0, Float>) property13, i7 == 1 ? 1.0f : f14));
                        }
                        ud0Var = this.F1;
                        if (ud0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(ud0Var, (Property<ud0, Float>) property13, i7 == 1 ? 1.0f : f14));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(dbVar, (Property<db, Float>) property13, i7 == -1 ? 1.0f : f14));
                        float[] fArr13 = {(i7 != -1 || i7 == 2) ? 1.0f : f14};
                        bi.g3 g3Var = this.m0;
                        arrayList.add(ObjectAnimator.ofFloat(g3Var, (Property<bi.g3, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(g3Var, (Property<bi.g3, Float>) property14, (i7 != -1 || i7 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
                        if (i7 != -1 && i7 != 2) {
                            f15 = f14;
                        }
                        FrameLayout frameLayout3 = this.Z0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f15));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i7 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + dbVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.k0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i7 == 2 ? -90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(w5Var, (Property<w5, Float>) property15, i7 == 2 ? 90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(qh0Var, (Property<qh0, Float>) property15, i7 == 2 ? 90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(d1Var, (Property<d1, Float>) property15, i7 == 2 ? 90.0f : f14));
                        imageView2 = this.j1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i7 == 2 ? 90.0f : f14));
                        }
                        if (this.s0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i14 = 0;
                            ofFloat5.addUpdateListener(new oa(this, i14));
                            arrayList.add(ofFloat5);
                        } else {
                            i14 = 0;
                        }
                        if (xbVar != null) {
                            x7 x7Var6 = this.L1;
                            boolean z14 = (x7Var6 == null || !x7Var6.v() || !this.L1.t() || i7 == 2) ? 1 : i14;
                            if (xbVar.k0 != z14 || !z11) {
                                xbVar.k0 = z14;
                                if (!z11) {
                                    xbVar.j0.f(z14, true);
                                }
                                xbVar.invalidate();
                            }
                        }
                        if (!z11) {
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
                        this.s2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.s2.setDuration(320L);
                        this.s2.setInterpolator(kr.h);
                        this.s2.addListener(new ma(this, i15, i7, 1));
                        if (z12) {
                            this.s2.setStartDelay(120L);
                        }
                        this.s2.start();
                        return;
                    }
                } else {
                    i11 = 1;
                }
                f12 = f10;
                float[] fArr112 = new float[i11];
                fArr112[0] = f12;
                arrayList.add(ObjectAnimator.ofFloat(qh0Var, (Property<qh0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(w5Var, (Property<w5, Float>) property13, ((i7 != -1 || i7 == 2) && (this.P1 == i11 || !((x7Var = this.L1) == null || TextUtils.isEmpty(x7Var.y)))) ? 1.0f : f10));
                arrayList.add(ObjectAnimator.ofFloat(d1Var, (Property<d1, Float>) property13, (i7 != -1 || i7 == 2) ? 1.0f : f10));
                imageView = this.j1;
                if (imageView != null) {
                }
                int i162 = this.g0;
                float[] fArr122 = new float[i12];
                fArr122[0] = ((i162 != i12 || i162 == 2) && i7 == -1) ? 1.0f : f10;
                arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property13, fArr122));
                za zaVar2 = this.i0;
                if (i7 == i12) {
                }
                if (i13 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(zaVar2, (Property<za, Float>) View.SCALE_X, f13));
                arrayList.add(ObjectAnimator.ofFloat(zaVar2, (Property<za, Float>) View.SCALE_Y, f13));
                if (i7 == -1) {
                }
                wd0Var = this.G1;
                if (wd0Var != null) {
                }
                ud0Var = this.F1;
                if (ud0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(dbVar, (Property<db, Float>) property13, i7 == -1 ? 1.0f : f14));
                float[] fArr132 = {(i7 != -1 || i7 == 2) ? 1.0f : f14};
                bi.g3 g3Var2 = this.m0;
                arrayList.add(ObjectAnimator.ofFloat(g3Var2, (Property<bi.g3, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(g3Var2, (Property<bi.g3, Float>) property142, (i7 != -1 || i7 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
                if (i7 != -1) {
                    f15 = f14;
                }
                FrameLayout frameLayout32 = this.Z0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f15));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i7 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + dbVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.k0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i7 == 2 ? -90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(w5Var, (Property<w5, Float>) property152, i7 == 2 ? 90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(qh0Var, (Property<qh0, Float>) property152, i7 == 2 ? 90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(d1Var, (Property<d1, Float>) property152, i7 == 2 ? 90.0f : f14));
                imageView2 = this.j1;
                if (imageView2 != null) {
                }
                if (this.s0.c()) {
                }
                if (xbVar != null) {
                }
                if (!z11) {
                }
            }
        }
        z12 = z13;
        if (i7 != 0) {
        }
        xaVar = this.s1;
        if (xaVar == null) {
        }
        yaVar = this.t1;
        if (yaVar != null) {
        }
        Property property132 = View.ALPHA;
        if (i7 != -1) {
        }
        i11 = 1;
        if (this.P1 == 1) {
        }
        f12 = f10;
        float[] fArr1122 = new float[i11];
        fArr1122[0] = f12;
        arrayList.add(ObjectAnimator.ofFloat(qh0Var, (Property<qh0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(w5Var, (Property<w5, Float>) property132, ((i7 != -1 || i7 == 2) && (this.P1 == i11 || !((x7Var = this.L1) == null || TextUtils.isEmpty(x7Var.y)))) ? 1.0f : f10));
        arrayList.add(ObjectAnimator.ofFloat(d1Var, (Property<d1, Float>) property132, (i7 != -1 || i7 == 2) ? 1.0f : f10));
        imageView = this.j1;
        if (imageView != null) {
        }
        int i1622 = this.g0;
        float[] fArr1222 = new float[i12];
        fArr1222[0] = ((i1622 != i12 || i1622 == 2) && i7 == -1) ? 1.0f : f10;
        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property132, fArr1222));
        za zaVar22 = this.i0;
        if (i7 == i12) {
        }
        if (i13 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(zaVar22, (Property<za, Float>) View.SCALE_X, f13));
        arrayList.add(ObjectAnimator.ofFloat(zaVar22, (Property<za, Float>) View.SCALE_Y, f13));
        if (i7 == -1) {
        }
        wd0Var = this.G1;
        if (wd0Var != null) {
        }
        ud0Var = this.F1;
        if (ud0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(dbVar, (Property<db, Float>) property132, i7 == -1 ? 1.0f : f14));
        float[] fArr1322 = {(i7 != -1 || i7 == 2) ? 1.0f : f14};
        bi.g3 g3Var22 = this.m0;
        arrayList.add(ObjectAnimator.ofFloat(g3Var22, (Property<bi.g3, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(g3Var22, (Property<bi.g3, Float>) property1422, (i7 != -1 || i7 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
        if (i7 != -1) {
        }
        FrameLayout frameLayout322 = this.Z0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f15));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i7 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + dbVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.k0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i7 == 2 ? -90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(w5Var, (Property<w5, Float>) property1522, i7 == 2 ? 90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(qh0Var, (Property<qh0, Float>) property1522, i7 == 2 ? 90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(d1Var, (Property<d1, Float>) property1522, i7 == 2 ? 90.0f : f14));
        imageView2 = this.j1;
        if (imageView2 != null) {
        }
        if (this.s0.c()) {
        }
        if (xbVar != null) {
        }
        if (!z11) {
        }
    }

    public final void l() {
        x7 x7Var;
        if (this.w1 == null || (x7Var = this.L1) == null || !x7Var.u) {
            return;
        }
        File file = x7Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.L1.W0 = null;
        }
        this.L1.W0 = x7.w(this.c, "webp");
        pa paVar = this.w1;
        x7 x7Var2 = this.L1;
        Bitmap s02 = paVar.s0(x7Var2.T0, false, false, true, this.P1 != 1, x7Var2);
        try {
            try {
                s02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.W0));
                if (s02.isRecycled()) {
                    return;
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                try {
                    this.L1.W0.delete();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                this.L1.W0 = null;
                if (s02 == null || s02.isRecycled()) {
                    return;
                }
            }
            s02.recycle();
        } catch (Throwable th2) {
            if (s02 != null && !s02.isRecycled()) {
                s02.recycle();
            }
            throw th2;
        }
    }

    public final void l0(boolean z10) {
        qa qaVar;
        boolean z11 = false;
        h0(this.g0 == 0 && this.P1 == 1 && !this.J0.e && !H(), z10);
        this.H0.setSelected(this.B0.j());
        h0 h0Var = this.J0;
        b0(this.o0, h0Var == null || !h0Var.e, z10);
        b0(this.F0, (this.b2 || this.P1 == -1 || this.g0 != 0 || this.Z1 == null || this.J0.e || H()) ? false : true, z10);
        b0(this.G0, (this.b2 || this.P1 == -1 || this.g0 != 0 || (qaVar = this.C0) == null || !qaVar.a || this.J0.e || this.B0.j()) ? false : true, z10);
        b0(this.H0, (this.b2 || this.P1 == -1 || this.g0 != 0 || this.J0.e) ? false : true, z10);
        b0(this.I0, this.J0.e, z10);
        this.P0.e(z10, this.B0.j() ? this.B0.getFilledProgress() : 0.0f);
        boolean z12 = this.J0.e;
        u3 u3Var = this.o1;
        if (z12) {
            u3Var.x();
        } else {
            u3Var.f(true);
        }
        g(this.b2, z10);
        org.telegram.messenger.g0.T3(this.T0, this.P1 == -1 && this.g0 == 0, true);
        if (this.P1 == -1 && this.g0 == 0) {
            z11 = true;
        }
        org.telegram.messenger.g0.T3(this.S0, z11, true);
    }

    public final void m0() {
        this.I0.setTranslationX(-0.0f);
        float alpha = (this.I0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + 0.0f;
        this.G0.setTranslationX(-alpha);
        float alpha2 = (this.G0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + alpha;
        this.H0.setTranslationX(-alpha2);
        float alpha3 = (this.H0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + alpha2;
        this.F0.setTranslationX(-alpha3);
        float alpha4 = (this.F0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + alpha3;
        this.o0.setTranslationX(0.0f);
        e0 e0Var = this.J0.a;
        e0Var.setPadding((int) ((this.o0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + 0.0f + org.telegram.messenger.g0.L(8.0f)), 0, (int) (alpha4 + org.telegram.messenger.g0.L(8.0f)), 0);
        e0Var.invalidate();
    }

    public final void n() {
        boolean z10 = this.L != 0.0f || this.J < 1.0f || this.C2;
        if (z10 == this.B2) {
            return;
        }
        bg.v0 v0Var = this.E;
        if (v0Var != null) {
            v0Var.b(!z10);
        }
        this.B2 = z10;
    }

    public final void n0(boolean z10) {
        nh0 nh0Var = this.i1;
        if (nh0Var != null) {
            int[] iArr = nh0Var.e;
            int i7 = 0;
            if (!z10) {
                x7 x7Var = this.L1;
                int i10 = (x7Var == null || !x7Var.y0) ? 0 : iArr[0] - 1;
                nh0Var.N(i10, false, true);
                this.i1.P(i10);
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            x7 x7Var2 = this.L1;
            if (x7Var2 != null && x7Var2.y0) {
                i7 = iArr[0];
            }
            nh0Var.P(i7);
            nh0 nh0Var2 = this.i1;
            if (nh0Var2 != null) {
                nh0Var2.start();
            }
        }
    }

    public final void o() {
        if (this.u2 < 0) {
            this.u2 = mp.g1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.v2 = arrayList;
            arrayList.add("off");
            this.v2.add("auto");
            this.v2.add("on");
            float f10 = mp.g1().getFloat("frontflash_warmth", 0.9f);
            w2 w2Var = this.s;
            w2Var.o = f10;
            w2Var.n = w2.f(f10);
            w2Var.g();
            float f11 = mp.g1().getFloat("frontflash_intensity", 1.0f);
            w2 w2Var2 = this.s;
            w2Var2.p = f11;
            w2Var2.i();
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        m9 m9Var = new m9(this, 2);
        pa paVar = this.w1;
        x7 x7Var = this.L1;
        if (paVar == null || x7Var == null) {
            m9Var.run();
            return;
        }
        x7Var.f();
        boolean t02 = paVar.t0();
        boolean z10 = paVar.y0.getPainting().E;
        Utilities.g.c(new p9(this, paVar, x7Var.i0, x7Var.j0, x7Var, z10, t02, m9Var, 1));
    }

    public final void p(boolean z10) {
        bb bbVar;
        if (this.d) {
            k9 k9Var = this.r0;
            if (k9Var != null) {
                k9Var.dismiss();
                this.r0 = null;
            }
            x7 x7Var = this.L1;
            long j3 = 0;
            if (x7Var != null && !x7Var.h) {
                if ((this.w && x7Var.g) || x7Var.b != 0) {
                    x7Var.j = false;
                }
                x7Var.i(false);
            }
            this.L1 = null;
            t10 t10Var = this.S;
            if (t10Var == null || (bbVar = this.Y0) == null) {
                bb bbVar2 = this.Y0;
                if (bbVar2 != null && !z10) {
                    bbVar2.set(null);
                }
                f(0.0f, z10, new m9(this, 23));
                int i7 = this.K;
                if (i7 == 1 || i7 == 0) {
                    this.n.setBackgroundColor(0);
                    this.c1.b(false, true);
                }
                ks.e().n(this, ks.r2);
                int i10 = this.c;
                ks.f(i10).n(this, ks.B5);
                ks.f(i10).n(this, ks.d3);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            h61 h61Var = bbVar.E;
            if (h61Var != null) {
                h61Var.g0();
                bbVar.E.m0();
                bbVar.E = null;
            }
            h61 h61Var2 = bbVar.y;
            if (h61Var2 != null) {
                j3 = h61Var2.S();
                bbVar.y.g0();
                bbVar.y.m0();
                bbVar.y = null;
            }
            h61 h61Var3 = bbVar.e;
            if (h61Var3 != null) {
                j3 = h61Var3.S();
                bbVar.e.g0();
                bbVar.e.m0();
                bbVar.e = null;
            }
            t10Var.a(Long.valueOf(j3), new w9(this, z10, 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
        }
    }

    public final boolean p0() {
        qa qaVar;
        if ((!this.Q1 && !this.R1) || (qaVar = this.C0) == null || !qaVar.isFrontface()) {
            return false;
        }
        int i7 = this.u2;
        return i7 == 2 || (i7 == 1 && this.d2);
    }

    public final void q() {
        Activity activity = this.b;
        if (this.C0 != null || activity == null) {
            return;
        }
        this.C0 = new qa(this, activity, mp.g1().getBoolean("stories_camera", false));
        n6 n6Var = this.P0;
        if (n6Var != null) {
            n6Var.h0 = 0.0f;
            n6Var.i0.e(true, 0.0f);
        }
        this.C0.recordHevc = !this.B0.j();
        this.C0.setThumbDrawable(z());
        this.C0.initTexture();
        this.C0.setDelegate(new v9(this, 0));
        b0(this.G0, this.C0.a && this.g0 == 0, true);
        this.H0.setTranslationX(this.C0.a ? 0.0f : org.telegram.messenger.g0.L(46.0f));
        this.B0.setCameraView(this.C0);
        if (mp.g1().getInt("storyhint2", 0) < 1) {
            this.X0.x();
            mp.g1().edit().putInt("storyhint2", mp.g1().getInt("storyhint2", 0) + 1).apply();
        } else if ((!l1.q(this.C0.getContext()) || !mp.g1().getBoolean("dualcam", l1.p(org.telegram.messenger.t0.b, false))) && this.C0.a && mp.g1().getInt("storydualhint", 0) < 2) {
            this.m1.x();
        }
        if (this.D0 == null) {
            this.D0 = new j6(activity, new n9(this, 3));
        }
        this.D0.a(this.C0);
        x6 x6Var = this.E0;
        if (x6Var != null) {
            ab abVar = this.B0;
            Object blurRenderNode = abVar.getBlurRenderNode();
            x6Var.G = abVar;
            x6Var.H = blurRenderNode;
            x6Var.invalidate();
        }
    }

    public final void r() {
        x7 x7Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.C1 != null || (x7Var = this.L1) == null) {
            return;
        }
        if (x7Var.K) {
            bitmap = null;
        } else {
            if (x7Var.Z0 == null) {
                q10 = this.Y0.getPhotoBitmap();
            } else {
                v9 v9Var = new v9(this, 10);
                Point point = org.telegram.messenger.g0.q;
                q10 = x7.q(v9Var, point.x, point.y, 0, true);
            }
            bitmap = q10;
        }
        if (bitmap != null || this.L1.K) {
            x51 textureView = this.Y0.getTextureView();
            int orientation = this.Y0.getOrientation();
            x7 x7Var2 = this.L1;
            de0 de0Var = new de0(this.b, textureView, bitmap, null, orientation, x7Var2 != null ? x7Var2.a1 : null, null, 0, false, false, this.s0, this.a);
            this.C1 = de0Var;
            this.r.addView(de0Var);
            ce0 ce0Var = this.D1;
            if (ce0Var != null) {
                ce0Var.setFilterView(this.C1);
            }
            TextureView myTextureView = this.C1.getMyTextureView();
            this.E1 = myTextureView;
            if (myTextureView != null) {
                myTextureView.setOpaque(false);
            }
            this.Y0.o(this.E1, this.C1);
            TextureView textureView2 = this.E1;
            if (textureView2 != null) {
                textureView2.setAlpha(0.0f);
                this.E1.animate().alpha(1.0f).setDuration(220L).start();
            }
            i();
            ud0 blurControl = this.C1.getBlurControl();
            this.F1 = blurControl;
            if (blurControl != null) {
                this.i0.addView(blurControl);
            }
            wd0 curveControl = this.C1.getCurveControl();
            this.G1 = curveControl;
            if (curveControl != null) {
                this.i0.addView(curveControl);
            }
            U();
            this.C1.getDoneTextView().setOnClickListener(new o9(this, 13));
            this.C1.getCancelTextView().setOnClickListener(new o9(this, 14));
            this.C1.getToolsView().setVisibility(8);
            this.C1.getToolsView().setAlpha(0.0f);
            this.C1.getToolsView().setTranslationY(org.telegram.messenger.g0.L(186.0f));
            this.C1.j0.setVisibility(0);
        }
    }

    public final void s(boolean z10) {
        if (this.N0 != null) {
            ab abVar = this.B0;
            if ((abVar != null && abVar.j()) == this.N0.Q) {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (this.N0 != null) {
            v();
        }
        ue ueVar = this.n2;
        boolean z11 = !z10;
        ab abVar2 = this.B0;
        p3 p3Var = new p3(this, this.c, this.b, this.a, ueVar, z10, z11, abVar2 != null && abVar2.j());
        this.N0 = p3Var;
        p3Var.H.setVisibility(8);
        this.N0.setMultipleOnClick(this.B0.j());
        this.N0.setMaxCount(Math.min(10, c0.b() - this.B0.getFilledCount()));
        this.N0.setOnBackClickListener(new fa(this, 1));
        this.N0.setOnSelectListener(new ea(this, z10, 0));
        this.N0.setOnSelectMultipleListener(new di.q1(this, 2));
        v4.b0 b0Var = this.m2;
        if (b0Var != null) {
            gi.g gVar = this.N0.e;
            gVar.B = b0Var;
            gVar.l0();
        }
        this.n.addView(this.N0, c8.na.e(-1, -1, ks.E1));
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
        boolean z10;
        x7 x7Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        x7 x7Var2;
        sg.t0 renderView;
        View renderInputView;
        View textDimView;
        View entitiesView;
        View selectionEntitiesView;
        File file2;
        File file3;
        if (this.w1 != null) {
            return;
        }
        Pair<Integer, Integer> paintSize = this.Y0.getPaintSize();
        x7 x7Var3 = this.L1;
        Bitmap decodeFile = (x7Var3 == null || !(x7Var3.c || x7Var3.g || this.I1 != null) || (file3 = x7Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        x7 x7Var4 = this.L1;
        if (x7Var4 == null || (!(x7Var4.c || x7Var4.g || this.I1 != null) || (file2 = x7Var4.Q0) == null)) {
            bitmap = null;
        } else {
            bitmap = BitmapFactory.decodeFile(file2.getPath());
            if (bitmap != null) {
                z10 = true;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap3 = bitmap;
                int measuredWidth = this.i0.getMeasuredWidth();
                int measuredHeight = this.i0.getMeasuredHeight();
                x7Var = this.L1;
                if (x7Var != null || x7Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = x7Var != null ? file : x7Var.L;
                if (x7Var == null && x7Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (x7Var != null || x7Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.Y0.getOrientation();
                x7Var2 = this.L1;
                Object obj2 = obj;
                if (x7Var2 != null) {
                    obj2 = x7Var2.T0;
                }
                ?? r13 = obj2;
                we weVar = new we();
                e6 e6Var = this.t0;
                bb bbVar = this.Y0;
                Activity activity = this.b;
                boolean z15 = z12;
                pa paVar = new pa(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, x7Var2, measuredWidth, measuredHeight, weVar, this.s0, this.a, e6Var, bbVar);
                this.w1 = paVar;
                x7 x7Var5 = this.L1;
                paVar.setHasAudio(x7Var5 == null && x7Var5.y != null);
                this.w1.setBlurManager(this.s0);
                this.r.addView(this.w1);
                renderView = this.w1.getRenderView();
                this.x1 = renderView;
                if (renderView != null) {
                    renderView.getPainting().E = z15;
                    this.i0.addView(this.x1);
                }
                renderInputView = this.w1.getRenderInputView();
                this.y1 = renderInputView;
                if (renderInputView != null) {
                    this.i0.addView(renderInputView);
                }
                textDimView = this.w1.getTextDimView();
                this.z1 = textDimView;
                if (textDimView != null) {
                    this.i0.addView(textDimView);
                }
                entitiesView = this.w1.getEntitiesView();
                this.A1 = entitiesView;
                if (entitiesView != null) {
                    this.i0.addView(entitiesView);
                }
                selectionEntitiesView = this.w1.getSelectionEntitiesView();
                this.B1 = selectionEntitiesView;
                if (selectionEntitiesView != null) {
                    this.i0.addView(selectionEntitiesView);
                }
                U();
                this.w1.setOnDoneButtonClickedListener(new m9(this, 21));
                this.w1.setOnCancelButtonClickedListener(new m9(this, 22));
                pa paVar2 = this.w1;
                paVar2.B0.setVisibility(0);
                paVar2.y0.setVisibility(0);
                paVar2.z0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.i0.getMeasuredWidth();
        int measuredHeight2 = this.i0.getMeasuredHeight();
        x7Var = this.L1;
        if (x7Var != null) {
        }
        file = null;
        z11 = false;
        if (x7Var != null) {
        }
        if (x7Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (x7Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.Y0.getOrientation();
        x7Var2 = this.L1;
        Object obj22 = obj;
        if (x7Var2 != null) {
        }
        ?? r132 = obj22;
        we weVar2 = new we();
        e6 e6Var2 = this.t0;
        bb bbVar2 = this.Y0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        pa paVar3 = new pa(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, x7Var2, measuredWidth2, measuredHeight2, weVar2, this.s0, this.a, e6Var2, bbVar2);
        this.w1 = paVar3;
        x7 x7Var52 = this.L1;
        paVar3.setHasAudio(x7Var52 == null && x7Var52.y != null);
        this.w1.setBlurManager(this.s0);
        this.r.addView(this.w1);
        renderView = this.w1.getRenderView();
        this.x1 = renderView;
        if (renderView != null) {
        }
        renderInputView = this.w1.getRenderInputView();
        this.y1 = renderInputView;
        if (renderInputView != null) {
        }
        textDimView = this.w1.getTextDimView();
        this.z1 = textDimView;
        if (textDimView != null) {
        }
        entitiesView = this.w1.getEntitiesView();
        this.A1 = entitiesView;
        if (entitiesView != null) {
        }
        selectionEntitiesView = this.w1.getSelectionEntitiesView();
        this.B1 = selectionEntitiesView;
        if (selectionEntitiesView != null) {
        }
        U();
        this.w1.setOnDoneButtonClickedListener(new m9(this, 21));
        this.w1.setOnCancelButtonClickedListener(new m9(this, 22));
        pa paVar22 = this.w1;
        paVar22.B0.setVisibility(0);
        paVar22.y0.setVisibility(0);
        paVar22.z0.setVisibility(0);
    }

    public final void u(boolean z10) {
        j6 j6Var = this.D0;
        if (j6Var != null) {
            j6Var.f = null;
            Utilities.e.a(j6Var.h);
            this.D0 = null;
            ab abVar = this.B0;
            if (abVar != null) {
                abVar.c.a(null);
            }
        }
        x6 x6Var = this.E0;
        if (x6Var != null) {
            x6Var.G = null;
            x6Var.H = null;
            x6Var.invalidate();
        }
        if (this.C0 != null) {
            if (z10) {
                a0(new m9(this, 8));
                return;
            }
            a0(new m9(this, 9));
            this.C0.destroy(true, null);
            org.telegram.messenger.g0.E2(this.C0);
            ab abVar2 = this.B0;
            if (abVar2 != null) {
                abVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void v() {
        p3 p3Var = this.N0;
        if (p3Var == null) {
            return;
        }
        this.n.removeView(p3Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o2 = null;
        }
        r1.g gVar = this.p2;
        if (gVar != null) {
            gVar.d();
            this.p2 = null;
        }
        this.q2 = null;
    }

    public final void x() {
        de0 de0Var = this.C1;
        if (de0Var == null) {
            return;
        }
        de0Var.b();
        this.D1.setFilterView(null);
        this.r.removeView(this.C1);
        TextureView textureView = this.E1;
        if (textureView != null) {
            this.i0.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        ud0 ud0Var = this.F1;
        if (ud0Var != null) {
            this.i0.removeView(ud0Var);
            this.F1 = null;
        }
        wd0 wd0Var = this.G1;
        if (wd0Var != null) {
            this.i0.removeView(wd0Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void y() {
        pa paVar = this.w1;
        if (paVar == null) {
            return;
        }
        paVar.B0.removeAllViews();
        pa paVar2 = this.w1;
        a0 a0Var = paVar2.U1;
        if (a0Var != null) {
            a0Var.b.c();
            m.o3 o3Var = a0Var.c;
            if (o3Var != null) {
                o3Var.f = null;
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) o3Var.h;
                if (fcVar != null) {
                    fcVar.b();
                    o3Var.h = null;
                }
                a0Var.c = null;
            }
        }
        paVar2.y0.h();
        paVar2.B0.setVisibility(8);
        paVar2.A0.setVisibility(8);
        paVar2.o0.postRunnable(new ai.k(17));
        j5 j5Var = paVar2.Y1;
        if (j5Var != null) {
            j5Var.dismiss();
        }
        sg.q qVar = paVar2.D1;
        if (qVar != null) {
            qVar.dismiss();
        }
        this.r.removeView(this.w1);
        this.w1 = null;
        sg.t0 t0Var = this.x1;
        if (t0Var != null) {
            this.i0.removeView(t0Var);
            this.x1 = null;
        }
        View view = this.z1;
        if (view != null) {
            this.i0.removeView(view);
            this.z1 = null;
        }
        View view2 = this.y1;
        if (view2 != null) {
            this.i0.removeView(view2);
            this.y1 = null;
        }
        View view3 = this.A1;
        if (view3 != null) {
            this.i0.removeView(view3);
            this.A1 = null;
        }
        View view4 = this.B1;
        if (view4 != null) {
            this.i0.removeView(view4);
            this.B1 = null;
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
