package gi;

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
import b8.mf;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.pe;
import org.telegram.messenger.qr;
import org.telegram.messenger.r10;
import org.telegram.messenger.re;
import org.telegram.messenger.zb;
import org.telegram.messenger.ze;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class va implements cs {
    public static va G2;
    public t A0;
    public View A1;
    public boolean A2;
    public final ia B0;
    public View B1;
    public boolean B2;
    public y9 C0;
    public nd0 C1;
    public boolean C2;
    public c6 D0;
    public final md0 D1;
    public da D2;
    public final cg.u0 E;
    public final r6 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final gb F0;
    public ed0 F1;
    public ValueAnimator F2;
    public qa G;
    public final hb G0;
    public gd0 G1;
    public float H;
    public final z H0;
    public File H1;
    public final RectF I;
    public final gb I0;
    public ArrayList I1;
    public float J;
    public final y J0;
    public ArrayList J1;
    public int K;
    public final kb K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public f7 L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public g3 N0;
    public long N1;
    public long O;
    public u0 O0;
    public boolean O1;
    public boolean P;
    public final h6 P0;
    public int P1;
    public final g2.g Q;
    public final d Q0;
    public boolean Q1;
    public Runnable R;
    public final p9 R0;
    public boolean R1;
    public r10 S;
    public final l2 S0;
    public boolean S1;
    public int T;
    public final l2 T0;
    public boolean T1;
    public int U;
    public final i3 U0;
    public float U1;
    public int V;
    public final i3 V0;
    public int V1;
    public boolean W;
    public final j71 W0;
    public boolean W1;
    public boolean X;
    public final l3 X0;
    public boolean X1;
    public boolean Y;
    public final ja Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final ei.b a;
    public int a0;
    public final fb a1;
    public AnimatorSet a2;
    public final Activity b;
    public int b0;
    public final jb b1;
    public boolean b2;
    public final int c;
    public int c0;
    public final q5 c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final la d1;
    public boolean d2;
    public boolean e;
    public final RectF e0;
    public final o9 e1;
    public boolean e2;
    public final WindowManager f;
    public final Path f0;
    public final t0 f1;
    public Runnable f2;
    public int g0;
    public ch0 g1;
    public AnimatorSet g2;
    public final WindowManager.LayoutParams h;
    public int h0;
    public final fh0 h1;
    public b9 h2;
    public final ha i0;
    public ch0 i1;
    public boolean i2;
    public final FrameLayout j0;
    public ImageView j1;
    public AnimatorSet j2;
    public final LinearLayout k0;
    public final n5 k1;
    public ValueAnimator k2;
    public final FrameLayout l0;
    public final l3 l1;
    public boolean l2;
    public final ai.o2 m0;
    public final l3 m1;
    public u4.a0 m2;
    public final ua n;
    public final FrameLayout n0;
    public final l3 n1;
    public pe n2;
    public final l2 o0;
    public final l3 o1;
    public ValueAnimator o2;
    public final y6 p0;
    public final r5 p1;
    public q1.g p2;
    public final org.telegram.ui.ActionBar.k5 q0;
    public final ib q1;
    public Boolean q2;
    public final na r;
    public t8 r0;
    public p r1;
    public f9 r2;
    public final n2 s;
    public final org.telegram.ui.Components.x9 s0;
    public fa s1;
    public AnimatorSet s2;
    public final x5 t0;
    public ga t1;
    public boolean t2;
    public final ai.x2 u0;
    public final fb u1;
    public int u2;
    public boolean v0;
    public final d v1;
    public ArrayList v2;
    public boolean w;
    public long w0;
    public x9 w1;
    public FrameLayout w2;
    public long x;
    public String x0;
    public tg.u0 x1;
    public boolean x2;
    public ma y;
    public TLRPC.InputPeer y0;
    public View y1;
    public v8 y2;
    public r8 z0;
    public View z1;
    public cg.l0 z2;

    public va(Activity activity, int i3) {
        ei.b bVar = new ei.b();
        this.a = bVar;
        this.x = 0L;
        this.I = new RectF();
        int i10 = 1;
        this.N = true;
        this.Q = new g2.g((int[]) null);
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new Path();
        new Rect();
        this.g0 = 0;
        this.h0 = -1;
        this.z0 = new r8();
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
        s9 s9Var = new s9(this);
        this.e2 = true;
        this.l2 = true;
        this.u2 = -1;
        this.b = activity;
        this.c = i3;
        LaunchActivity launchActivity = LaunchActivity.K1;
        this.E = launchActivity != null ? new cg.u0(launchActivity, true) : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        org.telegram.messenger.g0.m(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        ua uaVar = new ua(this, activity);
        this.n = uaVar;
        e9 e9Var = new e9(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(uaVar, e9Var);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        n2 n2Var = new n2(activity, windowManager, this.n, layoutParams);
        this.s = n2Var;
        n2Var.a(new ba(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        ua uaVar2 = this.n;
        na naVar = new na(this, activity);
        this.r = naVar;
        uaVar2.addView(naVar);
        na naVar2 = this.r;
        ha haVar = new ha(this, activity);
        this.i0 = haVar;
        naVar2.addView(haVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.s0 = new org.telegram.ui.Components.x9(this.i0);
        this.t0 = new x5();
        na naVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.j0 = frameLayout;
        naVar3.addView(frameLayout);
        na naVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.l0 = frameLayout2;
        naVar4.addView(frameLayout2);
        na naVar5 = this.r;
        int i11 = 5;
        ai.o2 o2Var = new ai.o2(5, activity, this);
        this.m0 = o2Var;
        naVar5.addView(o2Var);
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        na naVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        naVar6.addView(frameLayout3);
        ac.a(this.n, new ai.y(3));
        int i12 = 8;
        ia iaVar = new ia(this, activity, this.s0, this.r, bVar);
        this.B0 = iaVar;
        ua uaVar3 = this.n;
        Objects.requireNonNull(uaVar3);
        int i13 = 4;
        iaVar.setCancelGestures(new f6(uaVar3, i13));
        this.B0.setResetState(new v8(this, 13));
        this.i0.addView(this.B0, mf.e(-1, -1, hs.E1));
        this.B0.setOnClickListener(new x8(this, 12));
        ha haVar2 = this.i0;
        int i14 = this.K;
        haVar2.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
        ha haVar3 = this.i0;
        float L = org.telegram.messenger.g0.L(12.0f);
        cg.p0 p0Var = cg.t0.a;
        haVar3.setOutlineProvider(new cg.r0(0, L));
        this.i0.setClipToOutline(true);
        v8 v8Var = new v8(this, 14);
        md0 md0Var = new md0(activity);
        md0Var.a = new TextPaint(1);
        md0Var.b = new TextPaint(1);
        xq xqVar = xq.h;
        md0Var.s = new org.telegram.ui.Components.u5(md0Var, 0L, 350L, xqVar);
        md0Var.J = new jb0(md0Var, i13);
        md0Var.y = v8Var;
        this.D1 = md0Var;
        ja jaVar = new ja(this, activity, this.s0, this.t0);
        this.Y0 = jaVar;
        jaVar.setCollageView(this.B0);
        ja jaVar2 = this.Y0;
        jaVar2.w = new v8(this, 15);
        jaVar2.setOnTapListener(new v8(this, 16));
        this.Y0.setVisibility(8);
        ja jaVar3 = this.Y0;
        jaVar3.O = new v8(this, 17);
        this.i0.addView(jaVar3, mf.e(-1, -1, hs.E1));
        this.i0.addView(this.D1, mf.e(-1, -1, hs.E1));
        ua uaVar4 = this.n;
        la laVar = new la(this, activity, uaVar4, uaVar4, this.r, bVar, this.s0);
        this.d1 = laVar;
        laVar.setAccount(i3);
        this.d1.setUiBlurBitmap(new i8(i10));
        ac.a(this.m0, new ai.h1(this, i11));
        this.d1.setOnHeightUpdate(new w8(this, 13));
        this.d1.setOnPeriodUpdate(new w8(this, i13));
        long j10 = this.O;
        if (j10 != 0) {
            this.d1.setDialogId(j10);
        }
        this.d1.setOnPremiumHint(new w8(this, i11));
        this.d1.setOnKeyboardOpen(new w8(this, 6));
        ai.x2 x2Var = new ai.x2(3, activity, this);
        this.u0 = x2Var;
        this.r.addView(x2Var);
        fb fbVar = new fb(activity, this.r, this.i0, bVar, this.s0);
        this.a1 = fbVar;
        fbVar.setOnTimelineClick(new v8(this, 10));
        this.a1.setOnHeightChange(new v8(this, 11));
        this.Y0.setVideoTimelineView(this.a1);
        this.a1.setVisibility(8);
        this.a1.setAlpha(0.0f);
        this.a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        float f10 = 388;
        frameLayout4.addView(this.a1, mf.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        jb jbVar = new jb(activity);
        this.b1 = jbVar;
        jbVar.setVisibility(8);
        this.b1.a(false);
        this.Z0.addView(this.b1, mf.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, mf.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.d1, mf.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.a1);
        this.B0.setPreviewView(this.Y0);
        fb fbVar2 = new fb(activity, this.r, this.i0, bVar, this.s0);
        this.u1 = fbVar2;
        fbVar2.Y0 = true;
        fbVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.m0.addView(this.u1, mf.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        o9 o9Var = new o9(this, activity, bVar, this.s0);
        this.e1 = o9Var;
        o9Var.setVisibility(8);
        this.m0.addView(this.e1, mf.e(-1, -2, 85));
        l2 l2Var = new l2(activity);
        this.o0 = l2Var;
        l2Var.setContentDescription(bd.M0(2131754878, null));
        l2 l2Var2 = this.o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        l2Var2.setScaleType(scaleType);
        this.o0.setImageResource(R.drawable.msg_photo_back);
        l2 l2Var3 = this.o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        l2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.o0.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.o0.setOnClickListener(new x8(this, i10));
        this.j0.addView(this.o0, mf.e(56, 56, 51));
        this.s.a(this.o0);
        y6 y6Var = new y6(activity, i3);
        this.p0 = y6Var;
        y6Var.a(false, false);
        this.p0.setOnClickListener(new ai.d(21, this, activity));
        this.j0.addView(this.p0, mf.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.q0 = k5Var;
        k5Var.setTextSize(20);
        this.q0.setGravity(19);
        this.q0.setTextColor(-1);
        this.q0.setTypeface(org.telegram.messenger.g0.o());
        this.q0.l(bd.M0(2131746361, null), false);
        this.q0.getPaint().setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.q0.setAlpha(0.0f);
        this.q0.setVisibility(8);
        this.q0.setEllipsizeByGradient(true);
        this.q0.setRightPadding(org.telegram.messenger.g0.L(144.0f));
        this.j0.addView(this.q0, mf.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.k0.setGravity(5);
        this.j0.addView(this.k0, mf.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        w8 w8Var = new w8(this, 7);
        ua uaVar5 = this.n;
        t0 t0Var = new t0(activity);
        t0Var.x = true;
        t0Var.y = true;
        t0Var.h = w8Var;
        t0Var.a = i3;
        t0Var.b = uaVar5;
        t0Var.setScaleType(scaleType);
        t0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        t0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        t0Var.setVisibility(8);
        t0Var.setAlpha(0.0f);
        t0Var.setOnClickListener(new ai.b(t0Var, 25));
        t0Var.f = new cp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        t0Var.d();
        this.f1 = t0Var;
        l3 l3Var = new l3(activity, 1);
        l3Var.o(1.0f, -71.0f);
        l3Var.d = 2000L;
        l3Var.V = false;
        l3Var.I.r(true, false);
        this.l1 = l3Var;
        l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.j0.addView(this.l1, mf.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        fh0 fh0Var = new fh0(activity);
        this.h1 = fh0Var;
        fh0Var.setScaleType(scaleType);
        fh0 fh0Var2 = this.h1;
        f7 f7Var = this.L1;
        fh0Var2.setImageResource((f7Var == null || !f7Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.h1.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.h1.setOnClickListener(new x8(this, 2));
        this.h1.setVisibility(8);
        this.h1.setAlpha(0.0f);
        n5 n5Var = new n5(activity);
        this.k1 = n5Var;
        n5Var.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.k1.setVisibility(8);
        this.k1.setAlpha(0.0f);
        this.k1.setOnClickListener(new x8(this, 3));
        this.k0.addView(this.k1, mf.r(46, 56, 53));
        this.k0.addView(this.h1, mf.r(46, 56, 53));
        this.k0.addView(this.f1, mf.e(46, 56, 53));
        gb gbVar = new gb(activity);
        this.F0 = gbVar;
        gbVar.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.F0.setOnClickListener(new x8(this, 4));
        this.F0.setOnLongClickListener(new p4(this, i10));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.s.a(this.F0);
        this.j0.addView(this.F0, mf.e(56, 56, 53));
        hb hbVar = new hb(activity);
        this.G0 = hbVar;
        hbVar.setContentDescription(bd.M0(2131754886, null));
        this.G0.setOnClickListener(new x8(this, 5));
        boolean q10 = b1.q(activity);
        this.G0.setVisibility(q10 ? 0 : 8);
        this.G0.setAlpha(q10 ? 1.0f : 0.0f);
        this.s.a(this.G0);
        this.j0.addView(this.G0, mf.e(56, 56, 53));
        z zVar = new z(activity);
        this.H0 = zVar;
        zVar.setContentDescription(bd.M0(2131754895, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        if (this.A0 == null) {
            this.A0 = (t) t.a().get(6);
        }
        this.H0.setOnClickListener(new x8(this, 6));
        this.H0.a(new u(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.s.a(this.H0);
        this.j0.addView(this.H0, mf.e(56, 56, 53));
        gb gbVar2 = new gb(activity);
        this.I0 = gbVar2;
        gbVar2.setContentDescription(bd.M0(2131754894, null));
        this.I0.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.I0.a(new u(new t("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new x8(this, 7));
        this.s.a(this.I0);
        this.j0.addView(this.I0, mf.e(56, 56, 53));
        y yVar = new y(activity, this.s);
        this.J0 = yVar;
        yVar.a.v0(6);
        this.J0.setSelected((t) null);
        this.J0.setOnLayoutClick(new w8(this, i12));
        this.j0.addView(this.J0, mf.e(-1, 56, 53));
        l3 l3Var2 = new l3(activity, 1);
        l3Var2.o(1.0f, -20.0f);
        l3Var2.d = 5000L;
        l3Var2.k(true);
        l3Var2.u(bd.M0(2131744723, null));
        l3Var2.r0 = new ai.y1(17);
        this.m1 = l3Var2;
        l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.j0.addView(this.m1, mf.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        l3 l3Var3 = new l3(activity, 2);
        l3Var3.o(0.0f, 28.0f);
        l3Var3.d = 5000L;
        l3Var3.r(true);
        this.n1 = l3Var3;
        this.j0.addView(l3Var3, mf.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        l3 l3Var4 = new l3(activity, 1);
        l3Var4.o(1.0f, -20.0f);
        l3Var4.d = 5000L;
        l3Var4.u(bd.M0(2131744714, null));
        this.o1 = l3Var4;
        l3Var4.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.j0.addView(this.o1, mf.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        kb kbVar = new kb(activity);
        Paint paint = new Paint(1);
        kbVar.a = paint;
        Paint paint2 = new Paint(1);
        kbVar.b = paint2;
        kbVar.e = new org.telegram.ui.Components.u5(kbVar, 0L, 250L, xqVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        kbVar.c = g6Var;
        g6Var.n(0.3f, 250L, xqVar);
        g6Var.w(org.telegram.messenger.g0.L(13.0f));
        g6Var.u(-1);
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.setCallback(kbVar);
        g6Var.b = 1;
        kbVar.a(0L, false);
        this.K0 = kbVar;
        h0(false, false);
        this.j0.addView(this.K0, mf.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.K0);
        MediaController.O(0);
        h6 h6Var = new h6(activity);
        this.P0 = h6Var;
        h6Var.setDelegate(s9Var);
        h6 h6Var2 = this.P0;
        boolean z10 = this.P1 == 1;
        h6Var2.o0 = -1.0f;
        h6Var2.p0 = z10;
        h6Var2.invalidate();
        this.l0.addView(this.P0, mf.e(-1, 100, 87));
        this.s.a(this.P0);
        this.P0.e(true, this.B0.j() ? this.B0.getFilledProgress() : 0.0f);
        d dVar = new d(activity, bVar, true);
        this.Q0 = dVar;
        dVar.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(bd.M0(2131748796, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.l0.addView(this.Q0, mf.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new x8(this, 8));
        l3 l3Var5 = new l3(activity, 3);
        l3Var5.r(true);
        l3Var5.u(bd.M0(2131744721, null));
        l3Var5.h = org.telegram.messenger.g0.L(320.0f);
        l3Var5.d = 5000L;
        l3Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = l3Var5;
        this.l0.addView(l3Var5, mf.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        j71 j71Var = new j71(activity);
        this.W0 = j71Var;
        j71Var.N = false;
        j71Var.setAlpha(0.0f);
        this.l0.addView(this.W0, mf.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new e9(this, 4));
        j71 j71Var2 = this.W0;
        this.U1 = 0.0f;
        j71Var2.b(false, 0.0f);
        r6 r6Var = new r6(activity, i3, new v8(this, 12));
        this.E0 = r6Var;
        r6Var.c = new w8(this, 9);
        this.l0.addView(r6Var, mf.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        p9 p9Var = new p9(this, activity);
        this.R0 = p9Var;
        p9Var.setOnSwitchModeListener(new w8(this, 10));
        this.R0.setOnSwitchingModeListener(new w8(this, 11));
        this.n0.addView(this.R0, mf.e(-1, 48, 55));
        this.s.a(this.R0);
        l2 l2Var4 = new l2(activity);
        this.S0 = l2Var4;
        l2Var4.setContentDescription(bd.M0(2131754752, null));
        this.S0.setImageResource(R.drawable.stream_flip);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.n0.addView(this.S0, mf.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new x8(this, 9));
        l2 l2Var5 = new l2(activity);
        this.T0 = l2Var5;
        l2Var5.setContentDescription(bd.M0(2131748798, null));
        this.T0.setImageResource(R.drawable.stream_settings);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        this.n0.addView(this.T0, mf.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.T0);
        this.T0.setOnClickListener(new x8(this, 10));
        i3 i3Var = new i3(activity);
        this.U0 = i3Var;
        this.n0.addView(i3Var, mf.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        i3 i3Var2 = new i3(activity);
        this.V0 = i3Var2;
        i3Var2.a.t(bd.M0(2131744713, null), false, true);
        i3Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.n0.addView(this.V0, mf.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.V0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.v1 = dVar2;
        dVar2.setVisibility(8);
        this.v1.setAlpha(0.0f);
        this.v1.i(bd.M0(2131744699, null), false, true);
        this.v1.setOnClickListener(new x8(this, 11));
        this.n0.addView(this.v1, mf.d(-1, 48.0f, hs.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        q5 q5Var = new q5(activity);
        q5Var.b = new ArrayList();
        q5Var.e = true;
        q5Var.h = true;
        View view = new View(activity);
        q5Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        q5Var.addView(view, mf.e(-1, -1, hs.E1));
        q5Var.a(0, R.drawable.media_draw, bd.M0(2131754814, null));
        q5Var.a(2, R.drawable.msg_photo_sticker, bd.M0(2131754756, null));
        q5Var.a(1, R.drawable.msg_photo_text2, bd.M0(2131754807, null));
        q5Var.a(3, R.drawable.media_crop, bd.M0(2131751700, null));
        q5Var.a(4, R.drawable.msg_photo_settings, bd.M0(2131754811, null));
        String M0 = bd.M0(2131745650, null);
        q5Var.d = M0;
        q5Var.e = true;
        p5 p5Var = new p5(q5Var, activity, M0, true);
        q5Var.c = p5Var;
        p5Var.setContentDescription(bd.M0(2131745650, null));
        q5Var.addView(q5Var.c, mf.c(-2.0f, -2));
        q5Var.e();
        this.c1 = q5Var;
        q5Var.setVisibility(8);
        this.c1.setOnClickListener(new w8(this, 12));
        this.n0.addView(this.c1, mf.e(-1, 52, 23));
        ib ibVar = new ib(activity);
        this.q1 = ibVar;
        ibVar.setAlpha(0.0f);
        this.q1.setVisibility(8);
        this.i0.addView(this.q1, mf.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        r5 r5Var = new r5(activity, i3, bVar);
        this.p1 = r5Var;
        this.i0.addView(r5Var, mf.e(-1, -1, hs.E1));
        l0(false);
    }

    public static va D(Activity activity, int i3) {
        va vaVar = G2;
        if (vaVar != null && (vaVar.b != activity || vaVar.c != i3)) {
            vaVar.p(false);
            G2 = null;
        }
        if (G2 == null) {
            G2 = new va(activity, i3);
        }
        return G2;
    }

    public static void Z(boolean z10) {
        hp.e1().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(va vaVar) {
        y9 y9Var = vaVar.C0;
        if (y9Var == null || y9Var.getTextureView() == null) {
            vaVar.d2 = false;
            return;
        }
        Bitmap bitmap = vaVar.C0.getTextureView().getBitmap();
        if (bitmap == null) {
            vaVar.d2 = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float f10 = 0.0f;
        for (int i3 = 0; i3 < 10; i3++) {
            int i10 = 0;
            while (i10 < 10) {
                i10++;
                f10 += org.telegram.messenger.g0.B(bitmap.getPixel((i3 + 1) * width, i10 * height));
            }
        }
        float f11 = f10 / 100.0f;
        bitmap.recycle();
        vaVar.d2 = f11 < 0.22f;
    }

    public static void b(va vaVar) {
        ValueAnimator valueAnimator = vaVar.k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            vaVar.k2 = null;
        }
        int i3 = 0;
        vaVar.l2 = false;
        na naVar = vaVar.r;
        float f10 = naVar.a;
        float f11 = naVar.b;
        naVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        vaVar.k2 = ofFloat;
        ofFloat.addUpdateListener(new l9(vaVar, f10, f11, i3));
        vaVar.k2.setDuration(340L);
        vaVar.k2.setInterpolator(xq.h);
        vaVar.k2.addListener(new v9(vaVar, i3));
        vaVar.k2.start();
    }

    public static boolean c(va vaVar) {
        Activity activity = vaVar.b;
        if (activity == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, hs.x1);
        return false;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable g7 = k2.p1.g(context, R.drawable.story_camera);
        int L = org.telegram.messenger.g0.L(35.0f);
        int i3 = -L;
        g7.setBounds(i3 / 4, i3, (L / 4) * 3, 0);
        spannableString.setSpan(new ca(g7, g7), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        va vaVar = G2;
        if (vaVar != null) {
            vaVar.p(false);
        }
        G2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            return arrayList.size();
        }
        f7 f7Var = this.L1;
        if (f7Var != null) {
            return f7Var.r();
        }
        return 1;
    }

    public final String B() {
        y9 y9Var = this.C0;
        if (y9Var == null || y9Var.getCameraSession() == null) {
            return null;
        }
        if (!this.C0.isFrontface() || this.C0.getCameraSession().hasFlashModes()) {
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        o();
        return (String) this.v2.get(this.u2);
    }

    public final u0 C() {
        if (this.O0 == null) {
            u0 u0Var = new u0(this.b);
            this.O0 = u0Var;
            this.l0.addView(u0Var, mf.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String E() {
        y9 y9Var = this.C0;
        if (y9Var == null || y9Var.getCameraSession() == null) {
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
            ch0 ch0Var = new ch0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.i1 = ch0Var;
            ch0Var.h = true;
            f7 f7Var = this.L1;
            int i3 = 0;
            if (f7Var == null || !f7Var.y0) {
                ch0Var.P(0);
                this.i1.M(0);
            } else {
                ch0Var.M(35);
                this.i1.P(36);
            }
            this.i1.a0 = true;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J9, this.a);
            this.i1.Q(w02, "Sunny");
            this.i1.Q(w02, "Path 6");
            this.i1.Q(w02, "Path");
            this.i1.Q(w02, "Path 5");
            this.i1.o();
            ImageView imageView = new ImageView(this.b);
            this.j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.j1.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
            this.j1.setOnClickListener(new x8(this, i3));
            this.j1.setVisibility(8);
            this.j1.setImageDrawable(this.i1);
            this.j1.setAlpha(0.0f);
            this.k0.addView(this.j1, 0, mf.r(46, 56, 53));
        }
        return this.j1;
    }

    public final void G() {
        x9 x9Var = this.w1;
        if (x9Var == null) {
            return;
        }
        this.w2 = null;
        x9Var.getTopLayout().setAlpha(0.0f);
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
        g3 g3Var;
        if (this.X || (g3Var = this.N0) == null) {
            return false;
        }
        return g3Var.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) org.telegram.messenger.g0.q.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)));
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
    public final void J(int i3, boolean z10) {
        f7 f7Var;
        f7 f7Var2;
        d dVar;
        org.telegram.ui.ActionBar.k5 k5Var;
        int i10;
        int i11;
        float L;
        ImageView imageView;
        f7 f7Var3;
        f7 f7Var4;
        f7 f7Var5;
        f7 f7Var6;
        y9 y9Var;
        int i12 = this.g0;
        if (i3 == i12) {
            return;
        }
        this.g0 = i3;
        AnimatorSet animatorSet = this.j2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        N(i12, i3);
        q5 q5Var = this.c1;
        if (q5Var != null) {
            q5Var.b(i3 == 1, z10);
        }
        y yVar = this.J0;
        h0(i3 == 0 && this.P1 == 1 && !yVar.e && !H(), z10);
        if (i3 != 1) {
            this.b1.a(z10);
        }
        b0(this.o0, !yVar.e, z10);
        b0(this.F0, (this.b2 || i3 != 0 || yVar.e || this.Z1 == null || H()) ? false : true, z10);
        boolean z11 = this.b2;
        ia iaVar = this.B0;
        b0(this.G0, (z11 || i3 != 0 || (y9Var = this.C0) == null || !y9Var.a || yVar.e || iaVar.j()) ? false : true, true);
        b0(this.H0, (this.b2 || i3 != 0 || yVar.e) ? false : true, z10);
        l0(z10);
        t0 t0Var = this.f1;
        n5 n5Var = this.k1;
        fh0 fh0Var = this.h1;
        fb fbVar = this.u1;
        fb fbVar2 = this.a1;
        d dVar2 = this.v1;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.q0;
        la laVar = this.d1;
        i3 i3Var = this.V0;
        i3 i3Var2 = this.U0;
        r6 r6Var = this.E0;
        ja jaVar = this.Y0;
        ai.o2 o2Var = this.m0;
        p9 p9Var = this.R0;
        h6 h6Var = this.P0;
        if (!z10) {
            y9 y9Var2 = this.C0;
            if (y9Var2 != null) {
                y9Var2.setAlpha(i3 == 0 ? 1.0f : 0.0f);
            }
            jaVar.setAlpha(((i3 != 1 || iaVar.j()) && i3 != 2) ? 0.0f : 1.0f);
            iaVar.setAlpha((i3 == 0 || (i3 == 1 && iaVar.j())) ? 1.0f : 0.0f);
            h6Var.setAlpha(i3 == 0 ? 1.0f : 0.0f);
            h6Var.setTranslationY(i3 == 0 ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            r6Var.setAlpha(i3 == 0 ? 1.0f : 0.0f);
            p9Var.setAlpha((i3 != 0 || H()) ? 0.0f : 1.0f);
            p9Var.setTranslationY((i3 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            i3Var2.setAlpha((i3 == 0 && this.b2 && !H()) ? 1.0f : 0.0f);
            i3Var.setAlpha((i3 == 0 && !this.b2 && H()) ? 0.6f : 0.0f);
            o2Var.setAlpha((i3 == 1 || i3 == 2) ? 1.0f : 0.0f);
            o2Var.setTranslationY((i3 == 1 || i3 == 2) ? 0.0f : org.telegram.messenger.g0.L(12.0f));
            laVar.setAlpha(i3 == 2 ? 0.0f : 1.0f);
            fh0Var.setAlpha((i3 == 1 && this.P1 == 1) ? 1.0f : 0.0f);
            n5Var.setAlpha((i3 != 1 || (this.P1 != 1 && ((f7Var2 = this.L1) == null || TextUtils.isEmpty(f7Var2.y)))) ? 0.0f : 1.0f);
            int i13 = 1;
            t0Var.setAlpha(i3 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.j1;
            if (imageView2 != null) {
                imageView2.setAlpha((i3 == 1 && (f7Var = this.L1) != null && f7Var.u) ? 1.0f : 0.0f);
                i13 = 1;
            }
            fbVar2.setAlpha(i3 == i13 ? 1.0f : 0.0f);
            fbVar.setAlpha(i3 == 2 ? 1.0f : 0.0f);
            k5Var2.setAlpha((i3 == i13 || i3 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i3 == 2 ? 1.0f : 0.0f);
            M(i12, i3);
            return;
        }
        this.j2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        y9 y9Var3 = this.C0;
        if (y9Var3 != null) {
            dVar = dVar2;
            k5Var = k5Var2;
            i10 = 1;
            arrayList.add(ObjectAnimator.ofFloat(y9Var3, (Property<y9, Float>) View.ALPHA, i3 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            k5Var = k5Var2;
            i10 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i10];
        fArr[0] = ((i3 != i10 || iaVar.j()) && i3 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(jaVar, (Property<ja, Float>) property, fArr));
        float[] fArr2 = new float[i10];
        fArr2[0] = (i3 == 0 || (i3 == i10 && iaVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(iaVar, (Property<ia, Float>) property, fArr2));
        float[] fArr3 = new float[i10];
        fArr3[0] = i3 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(h6Var, (Property<h6, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i10];
        fArr4[0] = i3 == 0 ? 0.0f : org.telegram.messenger.g0.L(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(h6Var, (Property<h6, Float>) property2, fArr4));
        float[] fArr5 = new float[i10];
        fArr5[0] = i3 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property, fArr5));
        float[] fArr6 = new float[i10];
        fArr6[0] = (i3 != 0 || H()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(p9Var, (Property<p9, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(p9Var, (Property<p9, Float>) property2, (i3 != 0 || H()) ? org.telegram.messenger.g0.L(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(i3Var2, (Property<i3, Float>) property, (i3 == 0 && this.b2 && !H()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(i3Var, (Property<i3, Float>) property, (i3 == 0 && !this.b2 && H()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(o2Var, (Property<ai.o2, Float>) property, ((i3 == 1 && ((f7Var6 = this.L1) == null || f7Var6.J0 == 0)) || i3 == 2) ? 1.0f : 0.0f));
        if (i3 == 1 && ((f7Var5 = this.L1) == null || f7Var5.J0 == 0)) {
            i11 = 2;
        } else {
            i11 = 2;
            if (i3 != 2) {
                L = org.telegram.messenger.g0.L(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(o2Var, (Property<ai.o2, Float>) property2, L));
                arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property, i3 != i11 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, (i3 != 1 || i3 == i11) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i3 != i11 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(fbVar2, (Property<fb, Float>) property, i3 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) property, i3 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property, (i3 == 1 || this.P1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property, (i3 == 1 || (this.P1 != 1 && ((f7Var4 = this.L1) == null || TextUtils.isEmpty(f7Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property, i3 != 1 ? 1.0f : 0.0f));
                imageView = this.j1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i3 == 1 && (f7Var3 = this.L1) != null && f7Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<j71, Float>) property, 0.0f));
                this.j2.playTogether(arrayList);
                this.j2.addListener(new u9(this, i12, i3, 0));
                this.j2.setDuration(460L);
                this.j2.setInterpolator(xq.h);
                this.j2.start();
            }
        }
        L = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(o2Var, (Property<ai.o2, Float>) property2, L));
        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property, i3 != i11 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, (i3 != 1 || i3 == i11) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i3 != i11 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(fbVar2, (Property<fb, Float>) property, i3 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) property, i3 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property, (i3 == 1 || this.P1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property, (i3 == 1 || (this.P1 != 1 && ((f7Var4 = this.L1) == null || TextUtils.isEmpty(f7Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property, i3 != 1 ? 1.0f : 0.0f));
        imageView = this.j1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<j71, Float>) property, 0.0f));
        this.j2.playTogether(arrayList);
        this.j2.addListener(new u9(this, i12, i3, 0));
        this.j2.setDuration(460L);
        this.j2.setInterpolator(xq.h);
        this.j2.start();
    }

    public final void K(Runnable runnable, long j10) {
        if (this.T1 || this.L1 == null) {
            return;
        }
        b9 b9Var = this.h2;
        if (b9Var != null) {
            org.telegram.messenger.g0.r(b9Var);
        }
        this.i2 = true;
        this.T1 = true;
        this.h2 = new b9(this, runnable, 1);
        this.Y0.setAlpha(0.0f);
        this.Y0.setVisibility(0);
        this.Y0.n(this.L1, this.h2, j10);
        this.Y0.p(this.L1, false);
        org.telegram.messenger.g0.i3(this.h2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fa, code lost:
    
        if (r0.k == false) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L() {
        f7 f7Var;
        f7 f7Var2;
        f7 f7Var3;
        x9 x9Var;
        f7 f7Var4;
        x9 x9Var2;
        x9 x9Var3;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            la laVar = this.d1;
            if (laVar != null && laVar.O1) {
                laVar.N1 = false;
                laVar.z(false, false);
                return false;
            }
            if (this.R1) {
                h6 h6Var = this.P0;
                if (h6Var.s0) {
                    h6Var.s0 = false;
                    h6Var.w0 = SystemClock.elapsedRealtime();
                    h6Var.v0 = true;
                    ((s9) h6Var.a).e(false);
                    h6Var.K.c(false);
                    h6Var.L.c(false);
                    h6Var.M.c(false);
                    h6Var.invalidate();
                    return false;
                }
            } else if (!this.Q1 && !laVar.p()) {
                o9 o9Var = this.e1;
                if (o9Var.N) {
                    o9Var.c(false, true);
                    return false;
                }
                g3 g3Var = this.N0;
                if (g3Var != null) {
                    org.telegram.ui.ActionBar.q0 q0Var = g3Var.H;
                    if (q0Var == null || !q0Var.v()) {
                        e(false);
                        this.n2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = q0Var.getSearchField();
                    if (g3Var.w.c()) {
                        org.telegram.messenger.g0.v1(searchField);
                        return false;
                    }
                    g3Var.y.y(q0Var.T(true));
                    return false;
                }
                if (this.h0 != 0 || (x9Var3 = this.w1) == null || !x9Var3.v0()) {
                    if (this.h0 > -1) {
                        k0(-1, false, true);
                        return false;
                    }
                    int i3 = this.g0;
                    ia iaVar = this.B0;
                    if (i3 == 0) {
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
                    if (this.g0 == 1 && (((f7Var2 = this.L1) == null || (!f7Var2.n && !f7Var2.u)) && !this.v0)) {
                        if (f7Var2 != null && f7Var2.g && ((x9Var2 = this.w1) == null || !x9Var2.r0())) {
                            f7 f7Var5 = this.L1;
                            if (!f7Var5.j) {
                            }
                        }
                        x9 x9Var4 = this.w1;
                        if (x9Var4 == null || !x9Var4.v0()) {
                            if (this.w0 == 0 && (((this.M1 && !iaVar.j() && (((x9Var = this.w1) == null || !x9Var.r0()) && ((f7Var4 = this.L1) == null || f7Var4.Z0 == null))) || !this.c1.h) && (((f7Var3 = this.L1) == null || !f7Var3.g || (!f7Var3.n && !f7Var3.u)) && !this.v0 && (f7Var3 == null || !f7Var3.o)))) {
                                J(0, true);
                                return false;
                            }
                            if (this.w0 != 0) {
                                p(true);
                                return false;
                            }
                            Activity activity = this.b;
                            ei.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                            String M0 = bd.M0(2131751406, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            s1Var.U = bd.M0(2131747286, null);
                            f7 f7Var6 = this.L1;
                            if (f7Var6 != null && !f7Var6.g && !f7Var6.o) {
                                alertDialog$Builder.i(bd.M0(f7Var6.c ? 2131744663 : 2131744495, null), new e9(this, 7));
                            }
                            f7 f7Var7 = this.L1;
                            alertDialog$Builder.k(bd.M0((f7Var7 == null || !f7Var7.c || f7Var7.g) ? 2131751407 : 2131744696, null), new e9(this, 8));
                            alertDialog$Builder.h(bd.M0(2131752589, null), null);
                            s1Var.show();
                            View d = s1Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.k6.q7;
                                org.telegram.ui.ActionBar.r6.V((TextView) d, i11, bVar);
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, bVar), 51), 6, 6);
                                org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 51);
                                d.setBackground(a02);
                                org.telegram.ui.ActionBar.r6.k(d, a02, null, h, bVar);
                            }
                        }
                    }
                    if (this.g0 != 2 || (f7Var = this.L1) == null || f7Var.b0) {
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

    public final void M(int i3, int i10) {
        int i11;
        if (i3 == 0) {
            u(false);
            this.P0.setVisibility(8);
            this.W0.setVisibility(8);
            this.R0.setVisibility(8);
            g(false, false);
            c0(false);
        }
        if (i3 == 2) {
            this.u1.setVisibility(8);
            this.m0.setVisibility(i10 == 1 ? 0 : 8);
            this.d1.setVisibility(8);
            this.v1.setVisibility(8);
        }
        if (i3 == 1) {
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
            f7 f7Var = this.L1;
            if (f7Var == null || !f7Var.n) {
                t();
                G();
            }
            md0 md0Var = this.D1;
            if (md0Var != null) {
                md0Var.setAllowTouch(false);
            }
            this.Y0.x(2, false);
            this.Y0.x(3, false);
            this.Y0.x(4, false);
            this.Y0.x(5, false);
            this.Y0.x(7, false);
            f7 f7Var2 = this.L1;
            this.b1.setVisibility((f7Var2 == null || f7Var2.h0 < 30000) ? 8 : 0);
            this.m0.setAlpha(1.0f);
            this.m0.setTranslationY(0.0f);
            f7 f7Var3 = this.L1;
            this.d1.setVisibility((f7Var3 == null || f7Var3.J0 == 0) ? 0 : 8);
        }
        if (i10 == 0 && this.W1) {
            C().setVisibility(0);
            u0 C = C();
            C.r.e(true, 0.0f);
            C.a(true);
            ei.z5 z5Var = C.h;
            if (z5Var != null) {
                org.telegram.messenger.g0.r(z5Var);
            }
            ei.z5 z5Var2 = new ei.z5(C, 20);
            C.h = z5Var2;
            org.telegram.messenger.g0.i3(z5Var2, 3500L);
            this.P0.h();
        }
        this.W1 = false;
        md0 md0Var2 = this.D1;
        if (md0Var2 != null) {
            md0Var2.setAllowTouch(i10 == 1 && ((i11 = this.h0) == -1 || i11 == 1));
        }
        la laVar = this.d1;
        if (laVar != null) {
            laVar.e0 = i10 != 1;
        }
        if (i10 == 1) {
            int i12 = this.c;
            li.b0(i12).B(0);
            li.b0(i12).V0(0, false, true, false);
            li.b0(i12).V0(2, false, true, false);
            ei.z6 P1 = hp.s1(i12).P1();
            if (P1.Q == 0) {
                P1.S();
            }
            hp.s1(i12).P1().U();
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
    public final void N(int i3, int i10) {
        ia iaVar;
        ?? r82;
        CharSequence charSequence;
        int i11;
        int i12;
        SpannableStringBuilder append;
        String str;
        f7 f7Var;
        boolean z10;
        String str2;
        y5 y5Var;
        f60 f60Var;
        md0 md0Var;
        boolean z11;
        l3 l3Var;
        x9 x9Var;
        l3 l3Var2;
        f7 f7Var2;
        f7 f7Var3;
        File file;
        ab abVar;
        int i13;
        boolean z12;
        CharSequence charSequence2;
        boolean z13;
        f7 f7Var4;
        ei.t6 o10;
        f7 f7Var5;
        b51 textureView;
        f7 f7Var6;
        ia iaVar2 = this.B0;
        if (i10 == 0) {
            Y(false);
            h6 h6Var = this.P0;
            h6Var.setVisibility(0);
            if (h6Var != null) {
                h6Var.g(false);
            }
            this.R0.setVisibility(0);
            j71 j71Var = this.W0;
            j71Var.setVisibility(0);
            j71Var.setAlpha(0.0f);
            this.K0.a(0L, true);
            f7 f7Var7 = this.L1;
            if (f7Var7 != null) {
                f7Var7.i(false);
                this.L1 = null;
            }
            if (iaVar2 != null) {
                iaVar2.c();
                h6Var.e(false, 0.0f);
            }
        }
        if (i3 == 0) {
            d0(null);
            a0(new v8(this, 18));
            u0 u0Var = this.O0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            this.X0.f(true);
            l3 l3Var3 = this.m1;
            if (l3Var3 != null) {
                l3Var3.f(true);
            }
        }
        fb fbVar = this.a1;
        ai.o2 o2Var = this.m0;
        fh0 fh0Var = this.h1;
        q5 q5Var = this.c1;
        ja jaVar = this.Y0;
        la laVar = this.d1;
        org.telegram.ui.ActionBar.k5 k5Var = this.q0;
        int i14 = this.c;
        if (i10 == 1 || i3 == 1) {
            f7 f7Var8 = i10 == 1 ? this.L1 : null;
            t0 t0Var = this.f1;
            t0Var.setEntry(f7Var8);
            int i15 = this.P1;
            iaVar = iaVar2;
            n5 n5Var = this.k1;
            if (i15 == 1) {
                fh0Var.setVisibility(0);
                f7 f7Var9 = this.L1;
                e0(f7Var9 != null && f7Var9.Y, false);
                n5Var.setVisibility(0);
                jaVar.x(-9982, false);
                ((je0) n5Var.c).a(jaVar.k(), false);
                k5Var.setRightPadding(org.telegram.messenger.g0.L(144.0f));
                r82 = 0;
            } else {
                f7 f7Var10 = this.L1;
                if (f7Var10 == null || TextUtils.isEmpty(f7Var10.y)) {
                    r82 = 0;
                    k5Var.setRightPadding(org.telegram.messenger.g0.L(48.0f));
                } else {
                    fh0Var.setVisibility(8);
                    r82 = 0;
                    n5Var.setVisibility(0);
                    ((je0) n5Var.c).a(true, false);
                    k5Var.setRightPadding(org.telegram.messenger.g0.L(48.0f));
                }
            }
            t0Var.setVisibility(r82);
            f7 f7Var11 = this.L1;
            if (f7Var11 == null || !f7Var11.u) {
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                F().setVisibility(r82);
                n0(r82);
            }
            q5Var.setVisibility(r82);
            jaVar.setVisibility(r82);
            f7 f7Var12 = this.L1;
            laVar.setVisibility(((f7Var12 == null || f7Var12.J0 == 0) && this.w0 == 0) ? 0 : 8);
            FrameLayout frameLayout = this.Z0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            f7 f7Var13 = this.L1;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(((f7Var13 == null || f7Var13.J0 == 0) && this.w0 == 0) ? 68.0f : 12.0f);
            frameLayout.setLayoutParams(layoutParams);
            o2Var.setVisibility(0);
            o2Var.clearFocus();
            f7 f7Var14 = this.L1;
            laVar.A(f7Var14 == null ? 86400 : f7Var14.I0, false);
            laVar.setPeriodVisible(!hp.s1(i14).D3() && ((f7Var = this.L1) == null || !f7Var.g));
            f7 f7Var15 = this.L1;
            laVar.setHasRoundVideo((f7Var15 == null || f7Var15.o0 == null) ? false : true);
            if (laVar == null) {
                charSequence = "";
                i11 = i14;
            } else {
                f7 f7Var16 = this.L1;
                if (f7Var16 == null || !f7Var16.n) {
                    charSequence = "";
                    i11 = i14;
                    laVar.v(null, null);
                } else {
                    TLRPC.Peer peer = f7Var16.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        String p10 = l10.p(hp.s1(i14).a2(Long.valueOf(peer.user_id)));
                        f7 f7Var17 = this.L1;
                        charSequence = "";
                        append = new SpannableStringBuilder(zi.i6()).append((CharSequence) " ").append((CharSequence) p10);
                        f7Var17.p = append;
                        i12 = i14;
                    } else {
                        charSequence = "";
                        i12 = i14;
                        TLRPC.Chat M0 = hp.s1(i14).M0(Long.valueOf(-org.telegram.messenger.m5.o(peer)));
                        CharSequence charSequence3 = M0 == null ? charSequence : M0.title;
                        f7 f7Var18 = this.L1;
                        append = new SpannableStringBuilder(zi.i6()).append((CharSequence) " ").append(charSequence3);
                        f7Var18.p = append;
                    }
                    String str3 = this.L1.s;
                    if (TextUtils.isEmpty(str3)) {
                        SpannableString spannableString = new SpannableString(bd.M0(2131744745, null));
                        i11 = i12;
                        spannableString.setSpan(new t9(0), 0, spannableString.length(), 33);
                        str = spannableString;
                    } else {
                        i11 = i12;
                        str = str3;
                    }
                    laVar.v(append, str);
                }
            }
            f7 f7Var19 = this.L1;
            boolean z14 = (f7Var19 != null && f7Var19.v() && this.L1.t()) ? false : true;
            boolean z15 = fbVar.k0;
            fbVar.k0 = z14;
            fbVar.j0.f(z14, true);
            fbVar.invalidate();
        } else {
            iaVar = iaVar2;
            charSequence = "";
            i11 = i14;
        }
        d dVar = this.v1;
        fb fbVar2 = this.u1;
        int i16 = 2;
        if (i10 == 2 || i3 == 2) {
            z10 = false;
            k5Var.setVisibility(0);
            fbVar2.setVisibility(0);
            f7 f7Var20 = this.L1;
            if (f7Var20 == null || !f7Var20.b0) {
                str2 = null;
            } else {
                str2 = null;
                k5Var.l(bd.M0(2131746363, null), false);
            }
            o2Var.setVisibility(0);
            dVar.setVisibility(0);
            i16 = 2;
        } else {
            z10 = false;
            str2 = null;
        }
        if (i10 == i16) {
            k5Var.l(bd.M0(2131746363, str2), z10);
        }
        o9 o9Var = this.e1;
        if (i10 == 1) {
            this.O1 = z10;
            f7 f7Var21 = this.L1;
            boolean z16 = (f7Var21 == null || f7Var21.J0 == 0) ? false : true;
            boolean z17 = f7Var21 != null && f7Var21.g;
            String M02 = bd.M0(z17 ? 2131751355 : z16 ? 2131743814 : 2131748258, null);
            boolean z18 = !z16;
            boolean z19 = z17;
            if (TextUtils.equals(M02, q5Var.d) && z18 == q5Var.e) {
                z12 = z16;
            } else {
                q5Var.removeView(q5Var.c);
                z12 = z16;
                Context context = q5Var.getContext();
                q5Var.d = M02;
                q5Var.e = z18;
                p5 p5Var = new p5(q5Var, context, M02, z18);
                q5Var.c = p5Var;
                p5Var.setContentDescription(M02);
                q5Var.addView(q5Var.c, mf.c(-2.0f, -2));
                q5Var.e();
            }
            fbVar2.setVisibility(8);
            dVar.setVisibility(8);
            if (!this.i2) {
                f7 f7Var22 = this.L1;
                if (f7Var22 == null || !f7Var22.u) {
                    jaVar.set(f7Var22);
                } else {
                    jaVar.l(f7Var22);
                }
            }
            this.i2 = false;
            laVar.f.getEditText().setOnPremiumMenuLockClickListener(hp.s1(i11).X4() ? null : new v8(this, 19));
            o9Var.setVisibility(this.I1 == null ? 8 : 0);
            ArrayList arrayList = this.I1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.K1;
                ArrayList arrayList3 = this.J1;
                o9Var.c(false, false);
                o9Var.c = arrayList;
                o9Var.d = arrayList2;
                o9Var.e = arrayList3;
                o9Var.x = new ly0(Integer.toString(arrayList.size()), 20.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                o9Var.L = new ly0(bd.H(',', "HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                o9Var.b.g3.O(false);
                o9Var.setSelected(this.I1.indexOf(this.L1));
            }
            fbVar.setMaxCount((z12 || z19 || this.I1 != null || ((f7Var6 = this.L1) != null && (f7Var6.v() || !this.L1.K))) ? 1 : 3);
            if (i3 != 2) {
                f7 f7Var23 = this.L1;
                if (f7Var23 != null && (f7Var23.c || f7Var23.g || this.v0)) {
                    if (f7Var23.P0 != null) {
                        y();
                        t();
                        G();
                    }
                    f7 f7Var24 = this.L1;
                    if (f7Var24.K && f7Var24.a1 != null && (textureView = jaVar.getTextureView()) != null) {
                        textureView.setDelegate(new e9(this, 6));
                    }
                    laVar.setText(this.L1.C0);
                } else if (i3 != 2) {
                    laVar.W = true;
                    charSequence2 = charSequence;
                    laVar.f.setText(charSequence2);
                    f7 f7Var25 = this.L1;
                    q5Var.d(4, f7Var25 != null || ((!f7Var25.u || f7Var25.K) && !f7Var25.v()));
                    boolean z20 = org.telegram.messenger.r2.a;
                    q5Var.d(3, false);
                    if (!this.O1 && !laVar.o()) {
                        ei.z6 P1 = hp.s1(i11).P1();
                        int A = A();
                        o10 = P1.o();
                        if (o10 != null || !o10.a(P1.a, A) || ((f7Var5 = this.L1) != null && (f7Var5.g || f7Var5.J0 != 0))) {
                            z13 = true;
                            q5Var.setShareEnabled(z13);
                            f7 f7Var26 = this.L1;
                            fh0Var.setImageResource((f7Var26 == null && f7Var26.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                            jaVar.setVisibility(0);
                            fbVar.setVisibility(0);
                            k5Var.setVisibility(0);
                            k5Var.setTranslationX(0.0f);
                            f7Var4 = this.L1;
                            if (f7Var4 != null || f7Var4.J0 == 0) {
                                if (f7Var4 == null && f7Var4.g) {
                                    k5Var.l(bd.M0(2131746362, null), false);
                                    f60Var = null;
                                    y5Var = jaVar;
                                } else if (f7Var4 == null && f7Var4.u) {
                                    k5Var.l(bd.M0(2131746360, null), false);
                                } else if (f7Var4 == null && f7Var4.n) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    int i17 = i11;
                                    org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(32.0f, i17, k5Var);
                                    k5Var.setTranslationX(-org.telegram.messenger.g0.L(6.0f));
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(h5Var, 0, 1, 33);
                                    if (this.L1.q instanceof TLRPC.TL_peerUser) {
                                        TLRPC.User a22 = hp.s1(i17).a2(Long.valueOf(this.L1.q.user_id));
                                        h5Var.e(a22);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append((CharSequence) l10.p(a22));
                                        y5Var = jaVar;
                                    } else {
                                        y5Var = jaVar;
                                        TLRPC.Chat M03 = hp.s1(i17).M0(Long.valueOf(-org.telegram.messenger.m5.o(this.L1.q)));
                                        h5Var.b(M03);
                                        spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                        spannableStringBuilder.append(M03 != null ? M03.title : charSequence2);
                                    }
                                    k5Var.l(spannableStringBuilder, false);
                                    f60Var = null;
                                } else {
                                    y5Var = jaVar;
                                    f60Var = null;
                                    k5Var.l(bd.M0(2131746361, null), false);
                                }
                                if (i3 == 1) {
                                    f60 f60Var2 = laVar.V0;
                                    if (f60Var2 != null) {
                                        f60Var2.u();
                                        laVar.V0 = f60Var;
                                    }
                                    this.l1.f(true);
                                    if (o9Var.N) {
                                        o9Var.c(false, true);
                                    }
                                }
                                if (i10 == 2 && (f7Var2 = this.L1) != null) {
                                    if (f7Var2.e0 < 0) {
                                        f7Var2.e0 = 0L;
                                    }
                                    this.N1 = f7Var2.e0;
                                    long duration = y5Var.getDuration() >= 100 ? this.L1.h0 : y5Var.getDuration();
                                    f7Var3 = this.L1;
                                    if (f7Var3.h0 <= 0) {
                                        f7Var3.h0 = duration;
                                    }
                                    file = f7Var3.Z0;
                                    if (file == null) {
                                        file = f7Var3.L;
                                    }
                                    String absolutePath = file.getAbsolutePath();
                                    f7 f7Var27 = this.L1;
                                    this.u1.o(false, absolutePath, f7Var27.h0, f7Var27.P);
                                    f7 f7Var28 = this.L1;
                                    float f10 = duration;
                                    long j10 = (long) (f7Var28.Z * f10);
                                    long j11 = (long) (f7Var28.a0 * f10);
                                    fbVar2.a1 = j10;
                                    fbVar2.b1 = j11;
                                    abVar = fbVar2.h;
                                    if (abVar == null) {
                                        i13 = 1;
                                        ab.a(abVar, true);
                                    } else {
                                        i13 = 1;
                                    }
                                    q4 q4Var = new q4(this, 2);
                                    fbVar2.setDelegate(new v5(q4Var, i13));
                                    float max = (this.N1 / Math.max(1L, duration)) * 0.96f;
                                    fbVar2.setVideoLeft(max);
                                    fbVar2.setVideoRight(0.04f + max);
                                    q4Var.a(Boolean.TRUE, Float.valueOf(max));
                                }
                                md0Var = this.D1;
                                z11 = false;
                                if (md0Var != null) {
                                    md0Var.setAllowTouch(false);
                                }
                                l3Var = this.n1;
                                if (l3Var != null) {
                                    l3Var.f(true);
                                }
                                ac.e();
                                if (laVar != null) {
                                    g gVar = laVar.f;
                                    gVar.d();
                                    gVar.k(true);
                                    laVar.e0 = true;
                                }
                                if (y5Var != null) {
                                    y5Var.x(8, i10 != 1);
                                }
                                x9Var = this.w1;
                                if (x9Var != null) {
                                    x9Var.setCoverPreview(i10 != 1);
                                }
                                l3Var2 = this.o1;
                                if (l3Var2 != null) {
                                    l3Var2.f(true);
                                }
                                if (i10 == 1 && iaVar.j()) {
                                    z11 = true;
                                }
                                iaVar.setPreview(z11);
                            }
                            k5Var.l(charSequence2, false);
                        }
                    }
                    z13 = false;
                    q5Var.setShareEnabled(z13);
                    f7 f7Var262 = this.L1;
                    fh0Var.setImageResource((f7Var262 == null && f7Var262.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    jaVar.setVisibility(0);
                    fbVar.setVisibility(0);
                    k5Var.setVisibility(0);
                    k5Var.setTranslationX(0.0f);
                    f7Var4 = this.L1;
                    if (f7Var4 != null) {
                    }
                    if (f7Var4 == null) {
                    }
                    if (f7Var4 == null) {
                    }
                    if (f7Var4 == null) {
                    }
                    y5Var = jaVar;
                    f60Var = null;
                    k5Var.l(bd.M0(2131746361, null), false);
                    if (i3 == 1) {
                    }
                    if (i10 == 2) {
                        if (f7Var2.e0 < 0) {
                        }
                        this.N1 = f7Var2.e0;
                        if (y5Var.getDuration() >= 100) {
                        }
                        f7Var3 = this.L1;
                        if (f7Var3.h0 <= 0) {
                        }
                        file = f7Var3.Z0;
                        if (file == null) {
                        }
                        String absolutePath2 = file.getAbsolutePath();
                        f7 f7Var272 = this.L1;
                        this.u1.o(false, absolutePath2, f7Var272.h0, f7Var272.P);
                        f7 f7Var282 = this.L1;
                        float f102 = duration;
                        long j102 = (long) (f7Var282.Z * f102);
                        long j112 = (long) (f7Var282.a0 * f102);
                        fbVar2.a1 = j102;
                        fbVar2.b1 = j112;
                        abVar = fbVar2.h;
                        if (abVar == null) {
                        }
                        q4 q4Var2 = new q4(this, 2);
                        fbVar2.setDelegate(new v5(q4Var2, i13));
                        float max2 = (this.N1 / Math.max(1L, duration)) * 0.96f;
                        fbVar2.setVideoLeft(max2);
                        fbVar2.setVideoRight(0.04f + max2);
                        q4Var2.a(Boolean.TRUE, Float.valueOf(max2));
                    }
                    md0Var = this.D1;
                    z11 = false;
                    if (md0Var != null) {
                    }
                    l3Var = this.n1;
                    if (l3Var != null) {
                    }
                    ac.e();
                    if (laVar != null) {
                    }
                    if (y5Var != null) {
                    }
                    x9Var = this.w1;
                    if (x9Var != null) {
                    }
                    l3Var2 = this.o1;
                    if (l3Var2 != null) {
                    }
                    if (i10 == 1) {
                        z11 = true;
                    }
                    iaVar.setPreview(z11);
                }
            }
            charSequence2 = charSequence;
            f7 f7Var252 = this.L1;
            q5Var.d(4, f7Var252 != null || ((!f7Var252.u || f7Var252.K) && !f7Var252.v()));
            boolean z202 = org.telegram.messenger.r2.a;
            q5Var.d(3, false);
            if (!this.O1) {
                ei.z6 P12 = hp.s1(i11).P1();
                int A2 = A();
                o10 = P12.o();
                if (o10 != null) {
                }
                z13 = true;
                q5Var.setShareEnabled(z13);
                f7 f7Var2622 = this.L1;
                fh0Var.setImageResource((f7Var2622 == null && f7Var2622.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                jaVar.setVisibility(0);
                fbVar.setVisibility(0);
                k5Var.setVisibility(0);
                k5Var.setTranslationX(0.0f);
                f7Var4 = this.L1;
                if (f7Var4 != null) {
                }
                if (f7Var4 == null) {
                }
                if (f7Var4 == null) {
                }
                if (f7Var4 == null) {
                }
                y5Var = jaVar;
                f60Var = null;
                k5Var.l(bd.M0(2131746361, null), false);
                if (i3 == 1) {
                }
                if (i10 == 2) {
                }
                md0Var = this.D1;
                z11 = false;
                if (md0Var != null) {
                }
                l3Var = this.n1;
                if (l3Var != null) {
                }
                ac.e();
                if (laVar != null) {
                }
                if (y5Var != null) {
                }
                x9Var = this.w1;
                if (x9Var != null) {
                }
                l3Var2 = this.o1;
                if (l3Var2 != null) {
                }
                if (i10 == 1) {
                }
                iaVar.setPreview(z11);
            }
            z13 = false;
            q5Var.setShareEnabled(z13);
            f7 f7Var26222 = this.L1;
            fh0Var.setImageResource((f7Var26222 == null && f7Var26222.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            jaVar.setVisibility(0);
            fbVar.setVisibility(0);
            k5Var.setVisibility(0);
            k5Var.setTranslationX(0.0f);
            f7Var4 = this.L1;
            if (f7Var4 != null) {
            }
            if (f7Var4 == null) {
            }
            if (f7Var4 == null) {
            }
            if (f7Var4 == null) {
            }
            y5Var = jaVar;
            f60Var = null;
            k5Var.l(bd.M0(2131746361, null), false);
            if (i3 == 1) {
            }
            if (i10 == 2) {
            }
            md0Var = this.D1;
            z11 = false;
            if (md0Var != null) {
            }
            l3Var = this.n1;
            if (l3Var != null) {
            }
            ac.e();
            if (laVar != null) {
            }
            if (y5Var != null) {
            }
            x9Var = this.w1;
            if (x9Var != null) {
            }
            l3Var2 = this.o1;
            if (l3Var2 != null) {
            }
            if (i10 == 1) {
            }
            iaVar.setPreview(z11);
        }
        y5Var = jaVar;
        f60Var = null;
        if (i3 == 1) {
        }
        if (i10 == 2) {
        }
        md0Var = this.D1;
        z11 = false;
        if (md0Var != null) {
        }
        l3Var = this.n1;
        if (l3Var != null) {
        }
        ac.e();
        if (laVar != null) {
        }
        if (y5Var != null) {
        }
        x9Var = this.w1;
        if (x9Var != null) {
        }
        l3Var2 = this.o1;
        if (l3Var2 != null) {
        }
        if (i10 == 1) {
        }
        iaVar.setPreview(z11);
    }

    public final void O() {
        tg.s0 s0Var;
        boolean z10 = false;
        if (this.g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Y(false);
            } else {
                this.y2 = new v8(this, 3);
            }
        }
        la laVar = this.d1;
        if (laVar != null) {
            laVar.f.s();
        }
        h6 h6Var = this.P0;
        if (h6Var != null) {
            h6Var.h();
        }
        r5 r5Var = this.p1;
        if (r5Var != null) {
            ei.z6 P1 = hp.s1(r5Var.a).P1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) P1.i.f(h10.i(P1.a).n);
            r5Var.b = P1.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            r5Var.c.invalidate();
        }
        x9 x9Var = this.w1;
        if (x9Var != null && (s0Var = x9Var.y0.d) != null) {
            s0Var.postRunnable(s0Var.x);
        }
        ja jaVar = this.Y0;
        if (jaVar != null) {
            jaVar.x(0, false);
        }
        z0 z0Var = hp.s1(this.c).P1().w;
        if (z0Var.c || z0Var.d) {
            return;
        }
        z0Var.d = true;
        v0 v0Var = new v0(z0Var, 1);
        qr a02 = qr.a0(z0Var.a);
        a02.a.c(new ci.v6(a02, z10, v0Var, 3));
    }

    public final void P(int i3, int i10) {
        x9 x9Var;
        fa faVar;
        ga gaVar;
        x9 x9Var2;
        if (i10 == 0) {
            this.o0.setVisibility(8);
        }
        if (i3 == 0 && (x9Var2 = this.w1) != null) {
            x9Var2.setVisibility(8);
        }
        if (i3 == -1) {
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
        if ((i10 == 0 || i3 == 0) && (x9Var = this.w1) != null) {
            x9Var.N0.setLayerType(0, null);
        }
        md0 md0Var = this.D1;
        if (md0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z10 = false;
            }
            md0Var.setAllowTouch(z10);
        }
        if (i10 == 3) {
            fa faVar2 = this.s1;
            if (faVar2 != null) {
                faVar2.setAppearProgress(1.0f);
            }
        } else if (i3 == 3 && (faVar = this.s1) != null) {
            faVar.setVisibility(8);
            this.s1.setAppearProgress(0.0f);
            fa faVar3 = this.s1;
            faVar3.y = null;
            g0 g0Var = faVar3.f;
            g0Var.M = null;
            g0Var.d = null;
            g0Var.K = false;
            faVar3.d.setVisibility(8);
            faVar3.a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            ga gaVar2 = this.t1;
            if (gaVar2 != null) {
                gaVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i3 != 4 || (gaVar = this.t1) == null) {
            return;
        }
        gaVar.setVisibility(8);
        this.t1.setAppearProgress(0.0f);
        ga gaVar3 = this.t1;
        gaVar3.b = null;
        g0 g0Var2 = gaVar3.h;
        g0Var2.M = null;
        g0Var2.d = null;
        g0Var2.K = false;
        gaVar3.e.setVisibility(8);
        gaVar3.setVisibility(8);
    }

    public final void Q(pa paVar) {
        ei.t6 o10;
        ua uaVar;
        if (this.d) {
            return;
        }
        int i3 = this.c;
        if (hp.s1(i3).v2()) {
            org.telegram.ui.b.b(i3);
            return;
        }
        int i10 = 0;
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        this.t0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (uaVar = this.n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(z());
        if (this.w0 == 0 && (o10 = hp.s1(i3).P1().o()) != null && o10.a(i3, 1)) {
            g0(o10, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (paVar != null) {
            this.G = paVar;
            this.K = paVar.a;
            rectF.set(paVar.c);
            this.H = paVar.b;
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
        f(1.0f, true, new v8(this, 6));
        d();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void R(oa oaVar, f7 f7Var, long j10) {
        ua uaVar;
        if (this.d) {
            return;
        }
        int i3 = this.c;
        if (hp.s1(i3).v2()) {
            org.telegram.ui.b.b(i3);
            return;
        }
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (uaVar = this.n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.L1 = f7Var;
        this.P1 = f7Var.K ? 1 : 0;
        this.t0.g = false;
        RectF rectF = this.I;
        if (oaVar != null) {
            this.G = oaVar;
            this.K = oaVar.a;
            rectF.set(oaVar.c);
            this.H = oaVar.b;
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
        f7 f7Var2 = this.L1;
        if (f7Var2 != null) {
            this.d1.setText(f7Var2.C0);
        }
        K(new n9(this, 0), j10);
        J(this.L1.b0 ? 2 : 1, false);
        k0(-1, false, false);
        this.c1.b(false, false);
        d();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void S() {
        f60 f60Var;
        ja jaVar = this.Y0;
        if (jaVar != null) {
            jaVar.x(4, true);
        }
        la laVar = this.d1;
        if (laVar != null && (f60Var = laVar.V0) != null) {
            f60Var.u();
            laVar.V0 = null;
        }
        vg.v0 v0Var = new vg.v0((org.telegram.ui.ActionBar.d2) new z9(this, 1), 14, false);
        v0Var.setOnDismissListener(new j9(this, 1));
        v0Var.show();
    }

    public final void T(oa oaVar, f7 f7Var) {
        ei.t6 o10;
        ua uaVar;
        if (this.d) {
            return;
        }
        int i3 = this.c;
        if (hp.s1(i3).v2()) {
            org.telegram.ui.b.b(i3);
            return;
        }
        this.v0 = true;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (uaVar = this.n) != null && uaVar.getParent() == null) {
            ua uaVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.y3(windowManager, uaVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.L1 = f7Var;
        u8.a(i3, f7Var);
        f7 f7Var2 = this.L1;
        int i10 = (f7Var2 == null || !f7Var2.K) ? 0 : 1;
        this.P1 = i10;
        this.t0.g = f7Var2 != null && f7Var2.u && i10 == 1;
        if (this.w0 == 0 && (o10 = hp.s1(i3).P1().o()) != null && o10.a(i3, 1)) {
            g0(o10, true);
        }
        RectF rectF = this.I;
        if (oaVar != null) {
            this.G = oaVar;
            this.K = oaVar.a;
            rectF.set(oaVar.c);
            this.H = oaVar.b;
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
        f7 f7Var3 = this.L1;
        if (f7Var3 != null) {
            this.d1.setText(f7Var3.C0);
        }
        this.c1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new v8(this, 6));
        d();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void U() {
        tg.u0 u0Var = this.x1;
        if (u0Var != null) {
            u0Var.bringToFront();
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
        ib ibVar = this.q1;
        if (ibVar != null) {
            ibVar.bringToFront();
        }
        md0 md0Var = this.D1;
        if (md0Var != null) {
            md0Var.bringToFront();
        }
        ed0 ed0Var = this.F1;
        if (ed0Var != null) {
            ed0Var.bringToFront();
        }
        gd0 gd0Var = this.G1;
        if (gd0Var != null) {
            gd0Var.bringToFront();
        }
        r5 r5Var = this.p1;
        if (r5Var != null) {
            r5Var.bringToFront();
        }
        p pVar = this.r1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void V(f7 f7Var, boolean z10) {
        f7 f7Var2;
        boolean z11;
        if (f7Var == null || this.Y0.getWidth() <= 0 || this.Y0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? f7Var.O0 : f7Var.N0;
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
        b51 textureView = this.Y0.getTextureView();
        if (f7Var.K && !f7Var.u && textureView != null) {
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
        File file2 = f7Var.Q0;
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
        File file3 = f7Var.P0;
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
        x9 x9Var = this.w1;
        if (x9Var != null && x9Var.B0 != null) {
            canvas.save();
            canvas.scale(f10, f10);
            x9 x9Var2 = this.w1;
            x9Var2.s0 = true;
            h5 h5Var = x9Var2.B0;
            h5Var.a = true;
            h5Var.draw(canvas);
            x9 x9Var3 = this.w1;
            x9Var3.B0.a = false;
            x9Var3.s0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = f7.w(this.c, "jpg");
        if (z10) {
            f7Var2 = f7Var;
            z11 = z10;
            Utilities.g.c(new q1(this, createBitmap, z11, w10, f7Var2, 1));
        } else {
            f7Var2 = f7Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        if (!z11) {
            f7Var2.N0 = w10;
        }
        f7Var2.b1 = createScaledBitmap;
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
        ei.t6 o10;
        ?? r16;
        t8 t8Var = this.r0;
        BitmapDrawable bitmapDrawable = null;
        if (t8Var != null) {
            t8Var.dismiss();
            this.r0 = null;
        }
        boolean z10 = this.O1;
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
        if (z10) {
            t0 t0Var = this.f1;
            t0Var.getClass();
            t0Var.c(bd.N0("VideoConvertFail"));
            p2Var.a();
            p5 p5Var = this.c1.c;
            int i3 = -this.V1;
            this.V1 = i3;
            org.telegram.messenger.g0.G3(i3, p5Var, null);
            return;
        }
        la laVar = this.d1;
        if (laVar != null && laVar.o()) {
            p2Var.a();
            org.telegram.ui.Components.h6 h6Var = laVar.w;
            int i10 = -this.V1;
            this.V1 = i10;
            org.telegram.messenger.g0.G3(i10, h6Var, null);
            laVar.e();
            return;
        }
        f7 f7Var = this.L1;
        int i11 = this.c;
        int i12 = 0;
        if ((f7Var == null || (!f7Var.g && f7Var.J0 == 0)) && (o10 = hp.s1(i11).i0.o()) != null && o10.a(i11, A())) {
            g0(o10, false);
            return;
        }
        this.L1.D0 = hp.s1(i11).X4();
        ei.b bVar = this.a;
        boolean z11 = true;
        if (laVar != null && !this.L1.D0) {
            CharSequence text = laVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((uy0[]) spannable.getSpans(0, text.length(), uy0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new fc(this.n, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.g0.S2(bd.M0(2131744591, null), org.telegram.ui.ActionBar.k6.Uc, 0, new v8(this, 27), bVar)).k(true);
                    int i13 = -this.V1;
                    this.V1 = i13;
                    org.telegram.messenger.g0.G3(i13, laVar, null);
                    return;
                }
            }
        }
        f7 f7Var2 = this.L1;
        if (f7Var2.g || f7Var2.J0 != 0) {
            f7Var2.l = false;
            h(null);
            o0();
            return;
        }
        if (this.O != 0) {
            f7Var2.v0 = hp.s1(i11).j1(this.O);
        }
        ja jaVar = this.Y0;
        jaVar.x(3, true);
        t8 t8Var2 = new t8(this.L1.I0, this.b, bVar);
        t8Var2.W0(this.L1.E0);
        t8Var2.V0(this.L1.v0);
        t8Var2.x1 = this.N;
        t8Var2.M1 = new w8(this, 14);
        t8Var2.L0(!this.B0.j());
        ArrayList arrayList = this.J1;
        t8Var2.S0(arrayList == null ? this.L1.r() : arrayList.size());
        t8Var2.Q0(false);
        CharSequence text2 = laVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (y31 y31Var : (y31[]) ((Spanned) text2).getSpans(0, text2.length(), y31.class)) {
                if (y31Var != null) {
                    try {
                        TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(Long.parseLong(y31Var.getURL())));
                        if (a22 != null && !l10.B(a22) && l10.n(a22) != null && !arrayList2.contains(a22)) {
                            arrayList2.add(l10.n(a22));
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
                        TLObject f22 = hp.s1(i11).f2(charSequence);
                        if (f22 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) f22;
                            if (!user.bot && !l10.B(user) && user.id != 777000 && !l10.z(user) && !arrayList2.contains(charSequence)) {
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
                TLObject f23 = hp.s1(i11).f2(charSequence2);
                r16 = z13;
                if (f23 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) f23;
                    r16 = z13;
                    if (!user2.bot) {
                        r16 = z13;
                        if (!l10.B(user2)) {
                            r16 = z13;
                            if (user2.id != 777000) {
                                r16 = z13;
                                if (!l10.z(user2)) {
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
        t8Var2.K1 = arrayList2;
        t8Var2.O1 = new w8(this, 15);
        t8Var2.P1 = new w8(this, 16);
        t8Var2.L1 = new e9(this, 9);
        this.r0 = t8Var2;
        f7 f7Var3 = this.L1;
        if (f7Var3.K) {
            if (jaVar != null && !f7Var3.f0 && this.g0 != 2) {
                f7Var3.e0 = jaVar.getCurrentPosition();
                w8 w8Var = new w8(this, 17);
                tg.u0 u0Var = this.x1;
                View view = this.A1;
                View[] viewArr = new View[3];
                viewArr[0] = jaVar;
                viewArr[r16] = u0Var;
                viewArr[2] = view;
                jaVar.h(w8Var, viewArr);
            }
            t8 t8Var3 = this.r0;
            Bitmap bitmap = this.L1.g0;
            v8 v8Var = new v8(this, 20);
            if (bitmap != null) {
                t8Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            t8Var3.T1 = bitmapDrawable;
            t8Var3.U1 = v8Var;
            g1 g1Var = t8Var3.j1;
            if (g1Var != null) {
                for (View view2 : g1Var.getViewPages()) {
                    if (view2 instanceof o8) {
                        o8 o8Var = (o8) view2;
                        o8Var.h(false);
                        o8Var.f(false);
                    }
                }
            }
        }
        this.r0.setOnDismissListener(new j9(this, i12));
        this.r0.show();
    }

    public final void X(qa qaVar) {
        int i3 = 0;
        RectF rectF = this.I;
        if (qaVar != null) {
            this.G = qaVar;
            this.K = qaVar.a;
            rectF.set(qaVar.c);
            this.H = qaVar.b;
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
            i3 = -14737633;
        }
        this.i0.setBackgroundColor(i3);
    }

    public final void Y(boolean z10) {
        if (!this.x2 || z10) {
            this.t2 = false;
            Activity activity = this.b;
            if (activity != null) {
                boolean z11 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.t2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    xp xpVar = new xp(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.g0.L(64.0f);
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    xpVar.e = L;
                    xpVar.f = L2;
                    this.B0.setCameraThumb(xpVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.a);
                        int i3 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.x0(null, i3, false), null);
                        alertDialog$Builder.n(i3, null);
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.M0(2131747316, null));
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.U = X2;
                        alertDialog$Builder.k(bd.M0(2131747308, null), new e9(this, 12));
                        alertDialog$Builder.h(bd.M0(2131751772, null), null);
                        s1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, hs.w1);
                    this.x2 = true;
                }
            }
            if (this.t2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                q();
            } else {
                CameraController.getInstance().initCamera(new v8(this, 0));
            }
        }
    }

    public final void a0(Runnable runnable) {
        y9 y9Var = this.C0;
        if (y9Var == null || y9Var.getTextureView() == null) {
            return;
        }
        try {
            Utilities.i.c(new ei.h9(this, this.C0.getTextureView().getBitmap(), runnable, 12));
        } catch (Throwable unused) {
        }
    }

    public final void b0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new w9(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 4)).setDuration(320L).setInterpolator(xq.h).start();
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
        hs.e().b(this, hs.r2);
        int i3 = this.c;
        hs.f(i3).b(this, hs.y5);
        hs.f(i3).b(this, hs.b3);
    }

    public final void d0(String str) {
        int i3;
        gb gbVar = this.F0;
        gbVar.clearAnimation();
        y9 y9Var = this.C0;
        if ((y9Var != null && y9Var.isDual()) || this.b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(gbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals("auto")) {
                gbVar.setContentDescription(bd.M0(2131754915, null));
                i3 = R.drawable.media_photo_flash_auto2;
            }
            gbVar.setContentDescription(bd.M0(2131754914, null));
            i3 = R.drawable.media_photo_flash_off2;
        } else {
            if (str.equals("on")) {
                gbVar.setContentDescription(bd.M0(2131754913, null));
                i3 = R.drawable.media_photo_flash_on2;
            }
            gbVar.setContentDescription(bd.M0(2131754914, null));
            i3 = R.drawable.media_photo_flash_off2;
        }
        if (gbVar.n != i3) {
            gbVar.n = i3;
            ValueAnimator valueAnimator = gbVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                gbVar.r = null;
            }
            gbVar.setDrawable(i3);
        }
        if (this.g0 == 0 && !this.J0.e && this.Z1 != null && !H()) {
            z10 = true;
        }
        b0(gbVar, z10, true);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ei.t6 o10;
        f7 f7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i3 == hs.r2) {
            h6 h6Var = this.P0;
            if (h6Var != null) {
                h6Var.h();
            }
            if (this.n2 == null || MediaController.c2 == null) {
                return;
            }
            for (int i11 = 0; i11 < MediaController.c2.size(); i11++) {
                pe peVar = (pe) MediaController.c2.get(i11);
                int i12 = peVar.a;
                pe peVar2 = this.n2;
                if (i12 == peVar2.a && peVar.b == peVar2.b) {
                    this.n2 = peVar;
                    return;
                }
            }
            return;
        }
        if (i3 == hs.y5) {
            h6 h6Var2 = this.P0;
            if (h6Var2 == null || this.W1) {
                return;
            }
            h6Var2.h();
            return;
        }
        if (i3 == hs.b3) {
            int i13 = this.g0;
            int i14 = this.c;
            if (i13 != 1) {
                if (i13 == 0 && (o10 = hp.s1(i14).P1().o()) != null && o10.a(i14, 1)) {
                    f7 f7Var2 = this.L1;
                    if (f7Var2 == null || f7Var2.J0 == 0) {
                        g0(o10, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.O1 && !this.d1.o()) {
                ei.z6 P1 = hp.s1(i14).P1();
                int A = A();
                ei.t6 o11 = P1.o();
                if (o11 == null || !o11.a(P1.a, A) || ((f7Var = this.L1) != null && (f7Var.g || f7Var.J0 != 0))) {
                    z10 = true;
                }
            }
            this.c1.setShareEnabled(z10);
        }
    }

    public final void e(boolean z10) {
        u0 u0Var;
        this.L0 = z10;
        Boolean bool = this.q2;
        if (bool == null || bool.booleanValue() != z10) {
            int i3 = 0;
            if (this.N0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.N0 == null) {
                    return;
                }
            }
            if (this.N0.V) {
                this.r2 = new f9(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.o2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o2 = null;
            }
            q1.g gVar = this.p2;
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
            g3 g3Var = this.N0;
            if (g3Var != null) {
                g3Var.L = false;
            }
            if (z10 && (u0Var = this.O0) != null) {
                u0Var.a(false);
            }
            na naVar = this.r;
            if (naVar != null) {
                naVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.N0.setImportantForAccessibility(z10 ? 0 : 4);
            this.q2 = Boolean.valueOf(z10);
            float translationY = this.N0.getTranslationY();
            ua uaVar = this.n;
            float height = z10 ? 0.0f : (uaVar.getHeight() - this.N0.g()) + (org.telegram.messenger.g0.n * 2.5f);
            int i10 = 1;
            Math.max(1, uaVar.getHeight());
            g3 g3Var2 = this.N0;
            g3Var2.L = !z10;
            this.l2 = this.k2 == null;
            if (z10) {
                q1.g gVar2 = new q1.g(g3Var2, q1.g.p, height);
                this.p2 = gVar2;
                gVar2.m.a(0.75f);
                this.p2.m.b(350.0f);
                this.p2.a(new g9(this, height, i3));
                this.p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.o2 = ofFloat;
                ofFloat.addUpdateListener(new h9(this, i3));
                this.o2.addListener(new v9(this, i10));
                this.o2.setDuration(450L);
                this.o2.setInterpolator(xq.h);
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
            ch0 ch0Var = new ch0(R.raw.media_mute_unmute, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.g1 = ch0Var;
            ch0Var.G *= 1.5f;
        }
        this.h1.setAnimation(this.g1);
        if (!z11) {
            this.g1.N(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            ch0 ch0Var2 = this.g1;
            if (ch0Var2.b0 > 20) {
                ch0Var2.N(0, false, false);
            }
            this.g1.P(20);
            this.g1.start();
            return;
        }
        ch0 ch0Var3 = this.g1;
        int i3 = ch0Var3.b0;
        if (i3 == 0 || i3 >= 43) {
            return;
        }
        ch0Var3.P(43);
        this.g1.start();
    }

    public final void f(float f10, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        na naVar = this.r;
        if (!z10) {
            this.M = null;
            this.J = f10;
            j();
            naVar.invalidate();
            this.n.invalidate();
            runnable.run();
            n();
            return;
        }
        this.Q.d();
        hs.e().k(hs.j1, 512);
        this.M = Float.valueOf(this.L);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new h9(this, 5));
        this.F.addListener(new ci.p6(this, f10, runnable, 3));
        if (f10 < 1.0f && this.w) {
            this.F.setDuration(250L);
            this.F.setInterpolator(xq.h);
        } else if (f10 > 0.0f || naVar.a < org.telegram.messenger.g0.L(20.0f)) {
            this.F.setDuration(300L);
            this.F.setInterpolator(new w1.a());
        } else if (f10 >= 0.0f || !this.P) {
            this.F.setDuration(400L);
            this.F.setInterpolator(xq.h);
        } else {
            this.F.setDuration(200L);
            this.F.setInterpolator(xq.h);
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
        y yVar;
        if (z10) {
            l3 l3Var = this.m1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            l3 l3Var2 = this.n1;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
            l3 l3Var3 = this.l1;
            if (l3Var3 != null) {
                l3Var3.f(true);
            }
            l3 l3Var4 = this.X0;
            if (l3Var4 != null) {
                l3Var4.f(true);
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
        if (z10 && (yVar = this.J0) != null && yVar.e) {
            yVar.a(false, z11);
        }
        l0(z11);
        p9 p9Var = this.R0;
        i3 i3Var = this.V0;
        i3 i3Var2 = this.U0;
        if (!z11) {
            i3Var2.setAlpha((z10 && this.g0 == 0 && !H()) ? 1.0f : 0.0f);
            i3Var2.setTranslationY((z10 && this.g0 == 0 && !H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            i3Var.setAlpha((!z10 && this.g0 == 0 && H()) ? 0.6f : 0.0f);
            i3Var.setTranslationY((!z10 && this.g0 == 0 && H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            p9Var.setAlpha((z10 || this.g0 != 0 || H()) ? 0.0f : 1.0f);
            p9Var.setTranslationY((z10 || this.g0 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a2 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i3Var2, (Property<i3, Float>) property, (z10 && this.g0 == 0 && !H()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(i3Var2, (Property<i3, Float>) property2, (z10 && this.g0 == 0 && !H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(i3Var, (Property<i3, Float>) property, (!z10 && this.g0 == 0 && H()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(i3Var, (Property<i3, Float>) property2, (!z10 && this.g0 == 0 && H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(p9Var, (Property<p9, Float>) property, (z10 || this.g0 != 0 || H()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(p9Var, (Property<p9, Float>) property2, (z10 || this.g0 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f));
        this.a2.setDuration(260L);
        this.a2.setInterpolator(xq.h);
        this.a2.start();
    }

    public final void g0(ei.t6 t6Var, boolean z10) {
        if (this.A2) {
            return;
        }
        aa aaVar = new aa(t6Var.b(), this.c, this.b, new z9(this, 0), null);
        aaVar.Q1 = A();
        aaVar.setOnDismissListener(new s60(2, this, z10));
        this.Y0.x(7, true);
        this.A2 = true;
        aaVar.show();
    }

    public final void h(Runnable runnable) {
        f7 f7Var;
        Runnable runnable2;
        ja jaVar;
        nd0 nd0Var = this.C1;
        if (nd0Var == null || (f7Var = this.L1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        f7Var.j = nd0Var.a() | f7Var.j;
        f7 f7Var2 = this.L1;
        nd0 nd0Var2 = this.C1;
        File file = f7Var2.Z0;
        if (file != null) {
            file.delete();
            f7Var2.Z0 = null;
        }
        ze savedFilterState = nd0Var2.getSavedFilterState();
        f7Var2.a1 = savedFilterState;
        if (f7Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.a()) {
                Bitmap bitmap = nd0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i3 = f7Var2.R;
                    matrix.postScale(i3 == 1 ? -1.0f : 1.0f, i3 == 2 ? -1.0f : 1.0f, f7Var2.k0 / 2.0f, f7Var2.l0 / 2.0f);
                    matrix.postRotate(-f7Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    f7Var2.n0.preScale(f7Var2.k0 / createBitmap.getWidth(), f7Var2.l0 / createBitmap.getHeight());
                    f7Var2.k0 = createBitmap.getWidth();
                    f7Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = f7Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        f7Var2.Z0.delete();
                    }
                    String k10 = f7.k(f7Var2.L);
                    boolean z10 = "png".equals(k10) || "webp".equals(k10);
                    f7Var2.Z0 = f7.w(f7Var2.a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(f7Var2.Z0));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.i.c(new ci.u8(f7Var2, createBitmap, z10, runnable2, 3));
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
            f7 f7Var3 = this.L1;
            if (f7Var3.K || (jaVar = this.Y0) == null) {
                return;
            }
            jaVar.set(f7Var3);
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.e2 == z10) {
            return;
        }
        this.e2 = z10;
        if (z11) {
            this.K0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(xq.h).withEndAction(new f9(this, z10, 1)).start();
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
        j71 j71Var = this.W0;
        if ((j71Var.getTag() != null && z10) || (j71Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f2;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                v8 v8Var = new v8(this, 25);
                this.f2 = v8Var;
                org.telegram.messenger.g0.i3(v8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.g2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        j71Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.g2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            j71Var.setVisibility(0);
        }
        this.g2.playTogether(ObjectAnimator.ofFloat(j71Var, (Property<j71, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.g2.addListener(new dh.x(14, this, z10));
        this.g2.start();
        if (z10) {
            v8 v8Var2 = new v8(this, 26);
            this.f2 = v8Var2;
            org.telegram.messenger.g0.i3(v8Var2, 2000L);
        }
    }

    public final void j() {
        ei.m3 m3Var;
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
        qa qaVar = this.G;
        if (qaVar != null && (m3Var = qaVar.f) != null) {
            m3Var.setTranslationX((rectF.left - rectF2.left) * this.J);
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
        t8 t8Var = this.r0;
        if (t8Var != null) {
            t8Var.dismiss();
            this.r0 = null;
        }
        t8 t8Var2 = new t8(86400, this.b, this.a);
        t8Var2.U0();
        t8Var2.W0(this.z0);
        TLRPC.InputPeer inputPeer = this.y0;
        if (inputPeer == null) {
            inputPeer = this.O != 0 ? hp.s1(this.c).j1(this.O) : new TLRPC.TL_inputPeerSelf();
        }
        t8Var2.V0(inputPeer);
        t8Var2.x1 = this.N;
        t8Var2.M1 = new w8(this, 18);
        t8Var2.L0(false);
        t8Var2.S0(1);
        t8Var2.Q0(false);
        t8Var2.O1 = new w8(this, 19);
        t8Var2.L1 = new e9(this, 11);
        this.r0 = t8Var2;
        t8Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        if (r2.isRecycled() != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        f7 f7Var;
        ImageReceiver photoImage;
        float f10;
        if (this.w1 == null || (f7Var = this.L1) == null) {
            return;
        }
        f7Var.f();
        this.L1.j |= this.w1.r0();
        f7 f7Var2 = this.L1;
        ArrayList arrayList = f7Var2.T0;
        if (arrayList == null) {
            f7Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        x9 x9Var = this.w1;
        f7 f7Var3 = this.L1;
        x9Var.q0(f7Var3.T0, false, false, false, false, f7Var3);
        f7 f7Var4 = this.L1;
        if (!f7Var4.K) {
            f7Var4.S0 = Utilities.k(this.w1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.w1.getMasks();
        this.L1.U0 = masks != null ? new ArrayList(masks) : null;
        f7 f7Var5 = this.L1;
        boolean z10 = f7Var5.K;
        boolean E = f7Var5.E();
        this.L1.T0 = new ArrayList();
        x9 x9Var2 = this.w1;
        f7 f7Var6 = this.L1;
        Bitmap q02 = x9Var2.q0(f7Var6.T0, true, false, false, !z10, f7Var6);
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
        f7 f7Var7 = this.L1;
        f7Var7.P0 = null;
        f7Var7.R0 = null;
        f7Var7.Q0 = null;
        int i3 = this.c;
        org.telegram.messenger.w7.G(i3);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        f7 f7Var8 = this.L1;
        f7Var7.P0 = org.telegram.messenger.w7.K(zb.a0(q02, compressFormat, f7Var8.i0, f7Var8.j0, 87), null, true, true);
        if (q02 != null && !q02.isRecycled()) {
            q02.recycle();
        }
        f7 f7Var9 = this.L1;
        if (f7Var9.u) {
            File file4 = f7Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.L1.Y0 = null;
            }
            f7 f7Var10 = this.L1;
            long j10 = f7Var10.z0;
            if (j10 != Long.MIN_VALUE) {
                Drawable drawable = f7Var10.x0;
                if (drawable == null) {
                    drawable = y5.e(null, i3, j10, this.d2);
                }
                if (drawable != null) {
                    this.L1.Y0 = f7.w(i3, "webp");
                    f7 f7Var11 = this.L1;
                    Bitmap createBitmap = Bitmap.createBitmap(f7Var11.i0, f7Var11.j0, Bitmap.Config.ARGB_8888);
                    f7.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
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
        f7 f7Var12 = this.L1;
        if (f7Var12.u) {
            File file5 = f7Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                this.L1.X0 = null;
            }
            f7 f7Var13 = this.L1;
            if (f7Var13.u && f7Var13.K) {
                int i10 = f7Var13.k0;
                int i11 = f7Var13.l0;
                ug.t0 p02 = this.w1.p0();
                if (p02 != null) {
                    ug.o0 o0Var = p02.s0;
                    if (o0Var.getChildCount() == 1 && i10 > 0 && i11 > 0) {
                        int i12 = 0;
                        if ((o0Var.getChildAt(0) instanceof org.telegram.ui.Cells.q1) && (photoImage = ((org.telegram.ui.Cells.q1) o0Var.getChildAt(0)).getPhotoImage()) != null) {
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
                                        this.L1.X0 = f7.w(i3, "webp");
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
            x9 x9Var3 = this.w1;
            ArrayList arrayList2 = new ArrayList();
            f7 f7Var14 = this.L1;
            int i16 = f7Var14.i0;
            Bitmap q03 = x9Var3.q0(arrayList2, false, true, false, false, f7Var14);
            f7 f7Var15 = this.L1;
            org.telegram.messenger.w7.G(i3);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            f7 f7Var16 = this.L1;
            f7Var15.R0 = org.telegram.messenger.w7.K(zb.a0(q03, compressFormat2, f7Var16.i0, f7Var16.j0, 87), null, true, true);
            if (q03 != null && !q03.isRecycled()) {
                q03.recycle();
            }
        }
        if (this.w1.y0.getPainting().E) {
            Bitmap blurBitmap = this.w1.getBlurBitmap();
            f7 f7Var17 = this.L1;
            org.telegram.messenger.w7.G(i3);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            f7 f7Var18 = this.L1;
            f7Var17.Q0 = org.telegram.messenger.w7.K(zb.a0(blurBitmap, compressFormat3, f7Var18.i0, f7Var18.j0, 87), null, true, true);
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
    public final void k0(int i3, boolean z10, boolean z11) {
        float f10;
        boolean z12;
        fa faVar;
        float f11;
        int i10;
        ga gaVar;
        int i11;
        float f12;
        f7 f7Var;
        ImageView imageView;
        int i12;
        int i13;
        float f13;
        float f14;
        gd0 gd0Var;
        ed0 ed0Var;
        ImageView imageView2;
        int i14;
        f7 f7Var2;
        x9 x9Var;
        x9 x9Var2;
        int i15 = this.h0;
        if (i15 == i3 && !z10) {
            return;
        }
        la laVar = this.d1;
        if (i3 != -1 && laVar != null && laVar.O1) {
            return;
        }
        this.h0 = i3;
        AnimatorSet animatorSet = this.s2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s2 = null;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.q0;
        fb fbVar = this.a1;
        t0 t0Var = this.f1;
        l2 l2Var = this.o0;
        n5 n5Var = this.k1;
        fh0 fh0Var = this.h1;
        if (i15 != i3) {
            if (i3 == -1) {
                l2Var.setVisibility(0);
                laVar.setVisibility(0);
                x9 x9Var3 = this.w1;
                if (x9Var3 != null) {
                    x9Var3.A0(null, true);
                }
                t0Var.setVisibility(0);
                f7 f7Var3 = this.L1;
                if (f7Var3 == null || !f7Var3.u) {
                    ImageView imageView3 = this.j1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    F().setVisibility(0);
                    n0(false);
                }
                k5Var.setVisibility(0);
                if (this.P1 == 1) {
                    fh0Var.setVisibility(0);
                    n5Var.setVisibility(0);
                } else {
                    f7 f7Var4 = this.L1;
                    if (f7Var4 != null && !TextUtils.isEmpty(f7Var4.y)) {
                        fh0Var.setVisibility(8);
                        n5Var.setVisibility(0);
                    }
                }
                fbVar.setVisibility(0);
            }
            if (i3 == 0 && (x9Var2 = this.w1) != null) {
                x9Var2.setVisibility(0);
            }
            if ((i3 == 0 || i15 == 0) && (x9Var = this.w1) != null) {
                x9Var.N0.setLayerType(2, null);
            }
            x9 x9Var4 = this.w1;
            if (x9Var4 != null) {
                x9Var4.y1.b(i3 != 0);
            }
            laVar.M.b(i3 != -1);
            ac.e();
            if (this.C1 != null && i15 == 1) {
                h(null);
            }
            md0 md0Var = this.D1;
            if (md0Var != null) {
                md0Var.setAllowTouch(false);
            }
            this.l1.f(true);
            ua uaVar = this.n;
            ja jaVar = this.Y0;
            Activity activity = this.b;
            if (i3 == 3) {
                if (this.s1 == null) {
                    fa faVar2 = new fa(this, activity, jaVar);
                    this.s1 = faVar2;
                    uaVar.addView(faVar2.d);
                    uaVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
                f7 f7Var5 = this.L1;
                if (f7Var5 != null) {
                    this.s1.setEntry(f7Var5);
                }
            } else if (i15 == 3) {
                jaVar.b();
                fa faVar3 = this.s1;
                if (faVar3 != null) {
                    faVar3.a.setCropEditorDrawing(faVar3);
                    faVar3.E = true;
                }
            }
            if (i3 == 4) {
                if (this.t1 == null) {
                    ga gaVar2 = new ga(this, activity, jaVar);
                    this.t1 = gaVar2;
                    uaVar.addView(gaVar2.e);
                    uaVar.addView(this.t1);
                }
                this.t1.setVisibility(0);
            } else if (i15 == 4) {
                jaVar.b();
                ga gaVar3 = this.t1;
                if (gaVar3 != null) {
                    gaVar3.F = true;
                }
            }
        }
        this.c1.b((i3 == -1 || i3 == 2) && this.J > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        nd0 nd0Var = this.C1;
        boolean z13 = nd0Var == null && i3 == 1;
        float f15 = 1.0f;
        if (i3 == 1) {
            r();
            nd0 nd0Var2 = this.C1;
            this.w2 = nd0Var2;
            FrameLayout toolsView = nd0Var2 != null ? nd0Var2.getToolsView() : null;
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
            if (i15 == 1 && nd0Var != null) {
                this.w2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(nd0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.C1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i3 != 0) {
                    t();
                    this.w2 = this.w1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(l2Var, (Property<l2, Float>) property, f10));
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
                    arrayList.add(ObjectAnimator.ofFloat(l2Var, (Property<l2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getTopLayout(), (Property<View, Float>) property3, f10));
                    View topLayout2 = this.w1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -org.telegram.messenger.g0.L(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property3, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getBottomLayout(), (Property<View, Float>) property4, org.telegram.messenger.g0.L(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.w1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -org.telegram.messenger.g0.L(32.0f)));
                }
                faVar = this.s1;
                if (faVar == null) {
                    pg.e eVar = faVar.h;
                    if (i3 == 3) {
                        Property property5 = View.ALPHA;
                        i10 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<pg.e, Float>) property5, 0.0f, 1.0f));
                        pg.e eVar2 = this.s1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f11 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar2, (Property<pg.e, Float>) property6, org.telegram.messenger.g0.L(52.0f), f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property6, org.telegram.messenger.g0.L(52.0f), f10));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new h9(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        f11 = 52.0f;
                        i10 = 2;
                        if (i15 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<pg.e, Float>) property7, 1.0f, 0.0f));
                            pg.e eVar3 = this.s1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(eVar3, (Property<pg.e, Float>) property8, f10, org.telegram.messenger.g0.L(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.s1.n, (Property<FrameLayout, Float>) property8, f10, org.telegram.messenger.g0.L(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.s1.getAppearProgress(), f10);
                            ofFloat2.addUpdateListener(new h9(this, i10));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    f11 = 52.0f;
                    i10 = 2;
                }
                gaVar = this.t1;
                if (gaVar != null) {
                    pg.e eVar4 = gaVar.n;
                    if (i3 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i10];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<pg.e, Float>) property9, fArr));
                        pg.e eVar5 = this.t1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i10];
                        fArr2[0] = org.telegram.messenger.g0.L(f11);
                        fArr2[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(eVar5, (Property<pg.e, Float>) property10, fArr2));
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
                        ofFloat3.addUpdateListener(new h9(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i15 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i10];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<pg.e, Float>) property11, fArr6));
                        pg.e eVar6 = this.t1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float L = org.telegram.messenger.g0.L(f11);
                        float[] fArr7 = new float[i10];
                        fArr7[0] = f10;
                        fArr7[1] = L;
                        arrayList.add(ObjectAnimator.ofFloat(eVar6, (Property<pg.e, Float>) property12, fArr7));
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
                        ofFloat4.addUpdateListener(new h9(this, 4));
                        arrayList.add(ofFloat4);
                    }
                }
                Property property13 = View.ALPHA;
                if (i3 != -1 || i3 == 2) {
                    i11 = 1;
                    if (this.P1 == 1) {
                        f12 = 1.0f;
                        float[] fArr11 = new float[i11];
                        fArr11[0] = f12;
                        arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property13, ((i3 != -1 || i3 == 2) && (this.P1 == i11 || !((f7Var = this.L1) == null || TextUtils.isEmpty(f7Var.y)))) ? 1.0f : f10));
                        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property13, (i3 != -1 || i3 == 2) ? 1.0f : f10));
                        imageView = this.j1;
                        if (imageView != null) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i3 == -1 || i3 == 2) && (f7Var2 = this.L1) != null && f7Var2.u) ? 1.0f : f10));
                        } else {
                            i12 = 1;
                        }
                        int i16 = this.g0;
                        float[] fArr12 = new float[i12];
                        fArr12[0] = ((i16 != i12 || i16 == 2) && i3 == -1) ? 1.0f : f10;
                        arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property13, fArr12));
                        ha haVar = this.i0;
                        if (i3 == i12) {
                            haVar.setPivotY(haVar.getMeasuredHeight() * 0.2f);
                            i13 = org.telegram.messenger.g0.L(164.0f);
                        } else if (i3 == 0) {
                            haVar.setPivotY(haVar.getMeasuredHeight() * 0.6f);
                            i13 = org.telegram.messenger.g0.L(40.0f);
                        } else if (i3 == 2) {
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
                        if (i3 == -1) {
                            f14 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) View.TRANSLATION_Y, 0.0f));
                        } else {
                            f14 = 0.0f;
                        }
                        gd0Var = this.G1;
                        if (gd0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(gd0Var, (Property<gd0, Float>) property13, i3 == 1 ? 1.0f : f14));
                        }
                        ed0Var = this.F1;
                        if (ed0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(ed0Var, (Property<ed0, Float>) property13, i3 == 1 ? 1.0f : f14));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property13, i3 == -1 ? 1.0f : f14));
                        float[] fArr13 = {(i3 != -1 || i3 == 2) ? 1.0f : f14};
                        ai.o2 o2Var = this.m0;
                        arrayList.add(ObjectAnimator.ofFloat(o2Var, (Property<ai.o2, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(o2Var, (Property<ai.o2, Float>) property14, (i3 != -1 || i3 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
                        if (i3 != -1 && i3 != 2) {
                            f15 = f14;
                        }
                        FrameLayout frameLayout3 = this.Z0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f15));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i3 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + laVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.k0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i3 == 2 ? -90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property15, i3 == 2 ? 90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property15, i3 == 2 ? 90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property15, i3 == 2 ? 90.0f : f14));
                        imageView2 = this.j1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i3 == 2 ? 90.0f : f14));
                        }
                        if (this.s0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i14 = 0;
                            ofFloat5.addUpdateListener(new w9(this, i14));
                            arrayList.add(ofFloat5);
                        } else {
                            i14 = 0;
                        }
                        if (fbVar != null) {
                            f7 f7Var6 = this.L1;
                            boolean z14 = (f7Var6 == null || !f7Var6.v() || !this.L1.t() || i3 == 2) ? 1 : i14;
                            if (fbVar.k0 != z14 || !z11) {
                                fbVar.k0 = z14;
                                if (!z11) {
                                    fbVar.j0.f(z14, true);
                                }
                                fbVar.invalidate();
                            }
                        }
                        if (!z11) {
                            while (i14 < arrayList.size()) {
                                Animator animator = (Animator) arrayList.get(i14);
                                animator.setDuration(1L);
                                animator.start();
                                i14++;
                            }
                            if (i15 != i3) {
                                P(i15, i3);
                                return;
                            }
                            return;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.s2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.s2.setDuration(320L);
                        this.s2.setInterpolator(xq.h);
                        this.s2.addListener(new u9(this, i15, i3, 1));
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
                arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property13, ((i3 != -1 || i3 == 2) && (this.P1 == i11 || !((f7Var = this.L1) == null || TextUtils.isEmpty(f7Var.y)))) ? 1.0f : f10));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property13, (i3 != -1 || i3 == 2) ? 1.0f : f10));
                imageView = this.j1;
                if (imageView != null) {
                }
                int i162 = this.g0;
                float[] fArr122 = new float[i12];
                fArr122[0] = ((i162 != i12 || i162 == 2) && i3 == -1) ? 1.0f : f10;
                arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property13, fArr122));
                ha haVar2 = this.i0;
                if (i3 == i12) {
                }
                if (i13 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(haVar2, (Property<ha, Float>) View.SCALE_X, f13));
                arrayList.add(ObjectAnimator.ofFloat(haVar2, (Property<ha, Float>) View.SCALE_Y, f13));
                if (i3 == -1) {
                }
                gd0Var = this.G1;
                if (gd0Var != null) {
                }
                ed0Var = this.F1;
                if (ed0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property13, i3 == -1 ? 1.0f : f14));
                float[] fArr132 = {(i3 != -1 || i3 == 2) ? 1.0f : f14};
                ai.o2 o2Var2 = this.m0;
                arrayList.add(ObjectAnimator.ofFloat(o2Var2, (Property<ai.o2, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(o2Var2, (Property<ai.o2, Float>) property142, (i3 != -1 || i3 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
                if (i3 != -1) {
                    f15 = f14;
                }
                FrameLayout frameLayout32 = this.Z0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f15));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i3 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + laVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.k0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i3 == 2 ? -90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property152, i3 == 2 ? 90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property152, i3 == 2 ? 90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property152, i3 == 2 ? 90.0f : f14));
                imageView2 = this.j1;
                if (imageView2 != null) {
                }
                if (this.s0.c()) {
                }
                if (fbVar != null) {
                }
                if (!z11) {
                }
            }
        }
        z12 = z13;
        if (i3 != 0) {
        }
        faVar = this.s1;
        if (faVar == null) {
        }
        gaVar = this.t1;
        if (gaVar != null) {
        }
        Property property132 = View.ALPHA;
        if (i3 != -1) {
        }
        i11 = 1;
        if (this.P1 == 1) {
        }
        f12 = f10;
        float[] fArr1122 = new float[i11];
        fArr1122[0] = f12;
        arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property132, ((i3 != -1 || i3 == 2) && (this.P1 == i11 || !((f7Var = this.L1) == null || TextUtils.isEmpty(f7Var.y)))) ? 1.0f : f10));
        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property132, (i3 != -1 || i3 == 2) ? 1.0f : f10));
        imageView = this.j1;
        if (imageView != null) {
        }
        int i1622 = this.g0;
        float[] fArr1222 = new float[i12];
        fArr1222[0] = ((i1622 != i12 || i1622 == 2) && i3 == -1) ? 1.0f : f10;
        arrayList.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property132, fArr1222));
        ha haVar22 = this.i0;
        if (i3 == i12) {
        }
        if (i13 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(haVar22, (Property<ha, Float>) View.SCALE_X, f13));
        arrayList.add(ObjectAnimator.ofFloat(haVar22, (Property<ha, Float>) View.SCALE_Y, f13));
        if (i3 == -1) {
        }
        gd0Var = this.G1;
        if (gd0Var != null) {
        }
        ed0Var = this.F1;
        if (ed0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property132, i3 == -1 ? 1.0f : f14));
        float[] fArr1322 = {(i3 != -1 || i3 == 2) ? 1.0f : f14};
        ai.o2 o2Var22 = this.m0;
        arrayList.add(ObjectAnimator.ofFloat(o2Var22, (Property<ai.o2, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(o2Var22, (Property<ai.o2, Float>) property1422, (i3 != -1 || i3 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
        if (i3 != -1) {
        }
        FrameLayout frameLayout322 = this.Z0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f15));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i3 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + laVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.k0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i3 == 2 ? -90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property1522, i3 == 2 ? 90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property1522, i3 == 2 ? 90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<t0, Float>) property1522, i3 == 2 ? 90.0f : f14));
        imageView2 = this.j1;
        if (imageView2 != null) {
        }
        if (this.s0.c()) {
        }
        if (fbVar != null) {
        }
        if (!z11) {
        }
    }

    public final void l() {
        f7 f7Var;
        if (this.w1 == null || (f7Var = this.L1) == null || !f7Var.u) {
            return;
        }
        File file = f7Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.L1.W0 = null;
        }
        this.L1.W0 = f7.w(this.c, "webp");
        x9 x9Var = this.w1;
        f7 f7Var2 = this.L1;
        Bitmap q02 = x9Var.q0(f7Var2.T0, false, false, true, this.P1 != 1, f7Var2);
        try {
            try {
                q02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.L1.W0));
                if (q02.isRecycled()) {
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

    public final void l0(boolean z10) {
        y9 y9Var;
        boolean z11 = false;
        h0(this.g0 == 0 && this.P1 == 1 && !this.J0.e && !H(), z10);
        this.H0.setSelected(this.B0.j());
        y yVar = this.J0;
        b0(this.o0, yVar == null || !yVar.e, z10);
        b0(this.F0, (this.b2 || this.P1 == -1 || this.g0 != 0 || this.Z1 == null || this.J0.e || H()) ? false : true, z10);
        b0(this.G0, (this.b2 || this.P1 == -1 || this.g0 != 0 || (y9Var = this.C0) == null || !y9Var.a || this.J0.e || this.B0.j()) ? false : true, z10);
        b0(this.H0, (this.b2 || this.P1 == -1 || this.g0 != 0 || this.J0.e) ? false : true, z10);
        b0(this.I0, this.J0.e, z10);
        this.P0.e(z10, this.B0.j() ? this.B0.getFilledProgress() : 0.0f);
        boolean z12 = this.J0.e;
        l3 l3Var = this.o1;
        if (z12) {
            l3Var.w();
        } else {
            l3Var.f(true);
        }
        g(this.b2, z10);
        org.telegram.messenger.g0.V3(this.T0, this.P1 == -1 && this.g0 == 0, true);
        if (this.P1 == -1 && this.g0 == 0) {
            z11 = true;
        }
        org.telegram.messenger.g0.V3(this.S0, z11, true);
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
        v vVar = this.J0.a;
        vVar.setPadding((int) ((this.o0.getAlpha() * org.telegram.messenger.g0.L(46.0f)) + 0.0f + org.telegram.messenger.g0.L(8.0f)), 0, (int) (alpha4 + org.telegram.messenger.g0.L(8.0f)), 0);
        vVar.invalidate();
    }

    public final void n() {
        boolean z10 = this.L != 0.0f || this.J < 1.0f || this.C2;
        if (z10 == this.B2) {
            return;
        }
        cg.u0 u0Var = this.E;
        if (u0Var != null) {
            u0Var.c(!z10);
        }
        this.B2 = z10;
    }

    public final void n0(boolean z10) {
        ch0 ch0Var = this.i1;
        if (ch0Var != null) {
            int[] iArr = ch0Var.e;
            int i3 = 0;
            if (!z10) {
                f7 f7Var = this.L1;
                int i10 = (f7Var == null || !f7Var.y0) ? 0 : iArr[0] - 1;
                ch0Var.N(i10, false, true);
                this.i1.P(i10);
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            f7 f7Var2 = this.L1;
            if (f7Var2 != null && f7Var2.y0) {
                i3 = iArr[0];
            }
            ch0Var.P(i3);
            ch0 ch0Var2 = this.i1;
            if (ch0Var2 != null) {
                ch0Var2.start();
            }
        }
    }

    public final void o() {
        if (this.u2 < 0) {
            this.u2 = hp.e1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.v2 = arrayList;
            arrayList.add("off");
            this.v2.add("auto");
            this.v2.add("on");
            float f10 = hp.e1().getFloat("frontflash_warmth", 0.9f);
            n2 n2Var = this.s;
            n2Var.o = f10;
            n2Var.n = n2.f(f10);
            n2Var.g();
            float f11 = hp.e1().getFloat("frontflash_intensity", 1.0f);
            n2 n2Var2 = this.s;
            n2Var2.p = f11;
            n2Var2.i();
        }
    }

    public final void o0() {
        if (this.X1) {
            return;
        }
        this.X1 = true;
        v8 v8Var = new v8(this, 2);
        x9 x9Var = this.w1;
        f7 f7Var = this.L1;
        if (x9Var == null || f7Var == null) {
            v8Var.run();
            return;
        }
        f7Var.f();
        boolean r02 = x9Var.r0();
        boolean z10 = x9Var.y0.getPainting().E;
        Utilities.g.c(new y8(this, x9Var, f7Var.i0, f7Var.j0, f7Var, z10, r02, v8Var, 1));
    }

    public final void p(boolean z10) {
        ja jaVar;
        if (this.d) {
            t8 t8Var = this.r0;
            if (t8Var != null) {
                t8Var.dismiss();
                this.r0 = null;
            }
            f7 f7Var = this.L1;
            long j10 = 0;
            if (f7Var != null && !f7Var.h) {
                if ((this.w && f7Var.g) || f7Var.b != 0) {
                    f7Var.j = false;
                }
                f7Var.i(false);
            }
            this.L1 = null;
            r10 r10Var = this.S;
            if (r10Var == null || (jaVar = this.Y0) == null) {
                ja jaVar2 = this.Y0;
                if (jaVar2 != null && !z10) {
                    jaVar2.set(null);
                }
                f(0.0f, z10, new v8(this, 23));
                int i3 = this.K;
                if (i3 == 1 || i3 == 0) {
                    this.n.setBackgroundColor(0);
                    this.c1.b(false, true);
                }
                hs.e().n(this, hs.r2);
                int i10 = this.c;
                hs.f(i10).n(this, hs.y5);
                hs.f(i10).n(this, hs.b3);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            m51 m51Var = jaVar.E;
            if (m51Var != null) {
                m51Var.g0();
                jaVar.E.m0();
                jaVar.E = null;
            }
            m51 m51Var2 = jaVar.y;
            if (m51Var2 != null) {
                j10 = m51Var2.S();
                jaVar.y.g0();
                jaVar.y.m0();
                jaVar.y = null;
            }
            m51 m51Var3 = jaVar.e;
            if (m51Var3 != null) {
                j10 = m51Var3.S();
                jaVar.e.g0();
                jaVar.e.m0();
                jaVar.e = null;
            }
            r10Var.a(Long.valueOf(j10), new f9(this, z10, 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
        }
    }

    public final boolean p0() {
        y9 y9Var;
        if ((!this.Q1 && !this.R1) || (y9Var = this.C0) == null || !y9Var.isFrontface()) {
            return false;
        }
        int i3 = this.u2;
        return i3 == 2 || (i3 == 1 && this.d2);
    }

    public final void q() {
        Activity activity = this.b;
        if (this.C0 != null || activity == null) {
            return;
        }
        this.C0 = new y9(this, activity, hp.e1().getBoolean("stories_camera", false));
        h6 h6Var = this.P0;
        if (h6Var != null) {
            h6Var.h0 = 0.0f;
            h6Var.i0.e(true, 0.0f);
        }
        this.C0.recordHevc = !this.B0.j();
        this.C0.setThumbDrawable(z());
        this.C0.initTexture();
        this.C0.setDelegate(new e9(this, 0));
        b0(this.G0, this.C0.a && this.g0 == 0, true);
        this.H0.setTranslationX(this.C0.a ? 0.0f : org.telegram.messenger.g0.L(46.0f));
        this.B0.setCameraView(this.C0);
        if (hp.e1().getInt("storyhint2", 0) < 1) {
            this.X0.w();
            hp.e1().edit().putInt("storyhint2", hp.e1().getInt("storyhint2", 0) + 1).apply();
        } else if ((!b1.q(this.C0.getContext()) || !hp.e1().getBoolean("dualcam", b1.p(org.telegram.messenger.t0.b, false))) && this.C0.a && hp.e1().getInt("storydualhint", 0) < 2) {
            this.m1.w();
        }
        if (this.D0 == null) {
            this.D0 = new c6(activity, new w8(this, 3));
        }
        this.D0.a(this.C0);
        r6 r6Var = this.E0;
        if (r6Var != null) {
            ia iaVar = this.B0;
            Object blurRenderNode = iaVar.getBlurRenderNode();
            r6Var.G = iaVar;
            r6Var.H = blurRenderNode;
            r6Var.invalidate();
        }
    }

    public final void r() {
        f7 f7Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.C1 != null || (f7Var = this.L1) == null) {
            return;
        }
        if (f7Var.K) {
            bitmap = null;
        } else {
            if (f7Var.Z0 == null) {
                q10 = this.Y0.getPhotoBitmap();
            } else {
                e9 e9Var = new e9(this, 10);
                Point point = org.telegram.messenger.g0.q;
                q10 = f7.q(e9Var, point.x, point.y, 0, true);
            }
            bitmap = q10;
        }
        if (bitmap != null || this.L1.K) {
            b51 textureView = this.Y0.getTextureView();
            int orientation = this.Y0.getOrientation();
            f7 f7Var2 = this.L1;
            nd0 nd0Var = new nd0(this.b, textureView, bitmap, null, orientation, f7Var2 != null ? f7Var2.a1 : null, null, 0, false, false, this.s0, this.a);
            this.C1 = nd0Var;
            this.r.addView(nd0Var);
            md0 md0Var = this.D1;
            if (md0Var != null) {
                md0Var.setFilterView(this.C1);
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
            ed0 blurControl = this.C1.getBlurControl();
            this.F1 = blurControl;
            if (blurControl != null) {
                this.i0.addView(blurControl);
            }
            gd0 curveControl = this.C1.getCurveControl();
            this.G1 = curveControl;
            if (curveControl != null) {
                this.i0.addView(curveControl);
            }
            U();
            this.C1.getDoneTextView().setOnClickListener(new x8(this, 13));
            this.C1.getCancelTextView().setOnClickListener(new x8(this, 14));
            this.C1.getToolsView().setVisibility(8);
            this.C1.getToolsView().setAlpha(0.0f);
            this.C1.getToolsView().setTranslationY(org.telegram.messenger.g0.L(186.0f));
            this.C1.j0.setVisibility(0);
        }
    }

    public final void s(boolean z10) {
        if (this.N0 != null) {
            ia iaVar = this.B0;
            if ((iaVar != null && iaVar.j()) == this.N0.Q) {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (this.N0 != null) {
            v();
        }
        pe peVar = this.n2;
        boolean z11 = !z10;
        ia iaVar2 = this.B0;
        g3 g3Var = new g3(this, this.c, this.b, this.a, peVar, z10, z11, iaVar2 != null && iaVar2.j());
        this.N0 = g3Var;
        g3Var.H.setVisibility(8);
        this.N0.setMultipleOnClick(this.B0.j());
        this.N0.setMaxCount(Math.min(10, t.b() - this.B0.getFilledCount()));
        this.N0.setOnBackClickListener(new n9(this, 1));
        this.N0.setOnSelectListener(new m9(0, this, z10));
        this.N0.setOnSelectMultipleListener(new ci.y1(this, 2));
        u4.a0 a0Var = this.m2;
        if (a0Var != null) {
            fi.g gVar = this.N0.e;
            gVar.B = a0Var;
            gVar.l0();
        }
        this.n.addView(this.N0, mf.e(-1, -1, hs.E1));
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
        f7 f7Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        f7 f7Var2;
        tg.u0 renderView;
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
        f7 f7Var3 = this.L1;
        Bitmap decodeFile = (f7Var3 == null || !(f7Var3.c || f7Var3.g || this.I1 != null) || (file3 = f7Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        f7 f7Var4 = this.L1;
        if (f7Var4 == null || (!(f7Var4.c || f7Var4.g || this.I1 != null) || (file2 = f7Var4.Q0) == null)) {
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
                f7Var = this.L1;
                if (f7Var != null || f7Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = f7Var != null ? file : f7Var.L;
                if (f7Var == null && f7Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (f7Var != null || f7Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.Y0.getOrientation();
                f7Var2 = this.L1;
                Object obj2 = obj;
                if (f7Var2 != null) {
                    obj2 = f7Var2.T0;
                }
                ?? r13 = obj2;
                re reVar = new re();
                x5 x5Var = this.t0;
                ja jaVar = this.Y0;
                Activity activity = this.b;
                boolean z15 = z12;
                x9 x9Var = new x9(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, f7Var2, measuredWidth, measuredHeight, reVar, this.s0, this.a, x5Var, jaVar);
                this.w1 = x9Var;
                f7 f7Var5 = this.L1;
                x9Var.setHasAudio(f7Var5 == null && f7Var5.y != null);
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
                this.w1.setOnDoneButtonClickedListener(new v8(this, 21));
                this.w1.setOnCancelButtonClickedListener(new v8(this, 22));
                x9 x9Var2 = this.w1;
                x9Var2.B0.setVisibility(0);
                x9Var2.y0.setVisibility(0);
                x9Var2.z0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.i0.getMeasuredWidth();
        int measuredHeight2 = this.i0.getMeasuredHeight();
        f7Var = this.L1;
        if (f7Var != null) {
        }
        file = null;
        z11 = false;
        if (f7Var != null) {
        }
        if (f7Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (f7Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.Y0.getOrientation();
        f7Var2 = this.L1;
        Object obj22 = obj;
        if (f7Var2 != null) {
        }
        ?? r132 = obj22;
        re reVar2 = new re();
        x5 x5Var2 = this.t0;
        ja jaVar2 = this.Y0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        x9 x9Var3 = new x9(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, f7Var2, measuredWidth2, measuredHeight2, reVar2, this.s0, this.a, x5Var2, jaVar2);
        this.w1 = x9Var3;
        f7 f7Var52 = this.L1;
        x9Var3.setHasAudio(f7Var52 == null && f7Var52.y != null);
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
        this.w1.setOnDoneButtonClickedListener(new v8(this, 21));
        this.w1.setOnCancelButtonClickedListener(new v8(this, 22));
        x9 x9Var22 = this.w1;
        x9Var22.B0.setVisibility(0);
        x9Var22.y0.setVisibility(0);
        x9Var22.z0.setVisibility(0);
    }

    public final void u(boolean z10) {
        c6 c6Var = this.D0;
        if (c6Var != null) {
            c6Var.f = null;
            Utilities.e.a(c6Var.h);
            this.D0 = null;
            ia iaVar = this.B0;
            if (iaVar != null) {
                iaVar.c.a(null);
            }
        }
        r6 r6Var = this.E0;
        if (r6Var != null) {
            r6Var.G = null;
            r6Var.H = null;
            r6Var.invalidate();
        }
        if (this.C0 != null) {
            if (z10) {
                a0(new v8(this, 8));
                return;
            }
            a0(new v8(this, 9));
            this.C0.destroy(true, null);
            org.telegram.messenger.g0.E2(this.C0);
            ia iaVar2 = this.B0;
            if (iaVar2 != null) {
                iaVar2.setCameraView(null);
            }
            this.C0 = null;
        }
    }

    public final void v() {
        g3 g3Var = this.N0;
        if (g3Var == null) {
            return;
        }
        this.n.removeView(g3Var);
        this.N0 = null;
        ValueAnimator valueAnimator = this.o2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o2 = null;
        }
        q1.g gVar = this.p2;
        if (gVar != null) {
            gVar.d();
            this.p2 = null;
        }
        this.q2 = null;
    }

    public final void x() {
        nd0 nd0Var = this.C1;
        if (nd0Var == null) {
            return;
        }
        nd0Var.b();
        this.D1.setFilterView(null);
        this.r.removeView(this.C1);
        TextureView textureView = this.E1;
        if (textureView != null) {
            this.i0.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        ed0 ed0Var = this.F1;
        if (ed0Var != null) {
            this.i0.removeView(ed0Var);
            this.F1 = null;
        }
        gd0 gd0Var = this.G1;
        if (gd0Var != null) {
            this.i0.removeView(gd0Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void y() {
        x9 x9Var = this.w1;
        if (x9Var == null) {
            return;
        }
        x9Var.B0.removeAllViews();
        x9 x9Var2 = this.w1;
        x9Var2.y0.h();
        x9Var2.B0.setVisibility(8);
        x9Var2.A0.setVisibility(8);
        x9Var2.o0.postRunnable(new ai.y1(15));
        a5 a5Var = x9Var2.U1;
        if (a5Var != null) {
            a5Var.dismiss();
        }
        tg.q qVar = x9Var2.D1;
        if (qVar != null) {
            qVar.dismiss();
        }
        this.r.removeView(this.w1);
        this.w1 = null;
        tg.u0 u0Var = this.x1;
        if (u0Var != null) {
            this.i0.removeView(u0Var);
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
