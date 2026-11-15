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
import org.telegram.messenger.fc;
import org.telegram.messenger.gf;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.ve;
import org.telegram.messenger.vr;
import org.telegram.messenger.w10;
import org.telegram.messenger.xe;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sa implements is {
    public static sa G2;
    public t A0;
    public View A1;
    public boolean A2;
    public final fa B0;
    public View B1;
    public boolean B2;
    public v9 C0;
    public td0 C1;
    public boolean C2;
    public b6 D0;
    public final sd0 D1;
    public aa D2;
    public final bg.u0 E;
    public final p6 E0;
    public TextureView E1;
    public float E2;
    public ValueAnimator F;
    public final db F0;
    public kd0 F1;
    public ValueAnimator F2;
    public na G;
    public final eb G0;
    public md0 G1;
    public float H;
    public final z H0;
    public File H1;
    public final RectF I;
    public final db I0;
    public ArrayList I1;
    public float J;
    public final y J0;
    public ArrayList J1;
    public int K;
    public final hb K0;
    public ArrayList K1;
    public float L;
    public boolean L0;
    public d7 L1;
    public Float M;
    public boolean M0;
    public boolean M1;
    public boolean N;
    public g3 N0;
    public long N1;
    public long O;
    public v0 O0;
    public boolean O1;
    public boolean P;
    public final f6 P0;
    public int P1;
    public final h2.f Q;
    public final d Q0;
    public boolean Q1;
    public Runnable R;
    public final m9 R0;
    public boolean R1;
    public w10 S;
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
    public final s71 W0;
    public boolean W1;
    public boolean X;
    public final l3 X0;
    public boolean X1;
    public boolean Y;
    public final ga Y0;
    public boolean Y1;
    public int Z;
    public final FrameLayout Z0;
    public String Z1;
    public final fi.b a;
    public int a0;
    public final cb a1;
    public AnimatorSet a2;
    public final Activity b;
    public int b0;
    public final gb b1;
    public boolean b2;
    public final int c;
    public int c0;
    public final r5 c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final ia d1;
    public boolean d2;
    public boolean e;
    public final RectF e0;
    public final l9 e1;
    public boolean e2;
    public final WindowManager f;
    public final Path f0;
    public final u0 f1;
    public Runnable f2;
    public int g0;
    public ch0 g1;
    public AnimatorSet g2;
    public final WindowManager.LayoutParams h;
    public int h0;
    public final fh0 h1;
    public y8 h2;
    public final ea i0;
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
    public final bi.g2 m0;
    public final l3 m1;
    public v4.a0 m2;
    public final ra n;
    public final FrameLayout n0;
    public final l3 n1;
    public ve n2;
    public final l2 o0;
    public final l3 o1;
    public ValueAnimator o2;
    public final w6 p0;
    public final s5 p1;
    public r1.g p2;
    public final org.telegram.ui.ActionBar.j5 q0;
    public final fb q1;
    public Boolean q2;
    public final ka r;
    public q8 r0;
    public p r1;
    public c9 r2;
    public final n2 s;
    public final org.telegram.ui.Components.u9 s0;
    public ca s1;
    public AnimatorSet s2;
    public final w5 t0;
    public da t1;
    public boolean t2;
    public final bi.o2 u0;
    public final cb u1;
    public int u2;
    public boolean v0;
    public final d v1;
    public ArrayList v2;
    public boolean w;
    public long w0;
    public u9 w1;
    public FrameLayout w2;
    public long x;
    public String x0;
    public sg.u0 x1;
    public boolean x2;
    public ja y;
    public TLRPC.InputPeer y0;
    public View y1;
    public s8 y2;
    public o8 z0;
    public View z1;
    public ai.v0 z2;

    public sa(Activity activity, int i7) {
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
        this.g0 = 0;
        this.h0 = -1;
        this.z0 = new o8();
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
        p9 p9Var = new p9(this);
        this.e2 = true;
        this.l2 = true;
        this.u2 = -1;
        this.b = activity;
        this.c = i7;
        LaunchActivity launchActivity = LaunchActivity.H1;
        this.E = launchActivity != null ? new bg.u0(launchActivity, true) : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        org.telegram.messenger.g0.m(layoutParams);
        layoutParams.flags = -2013200128;
        int i12 = 16;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        ra raVar = new ra(this, activity);
        this.n = raVar;
        b9 b9Var = new b9(this, i11);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(raVar, b9Var);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        n2 n2Var = new n2(activity, windowManager, this.n, layoutParams);
        this.s = n2Var;
        n2Var.a(new y9(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        ra raVar2 = this.n;
        ka kaVar = new ka(this, activity);
        this.r = kaVar;
        raVar2.addView(kaVar);
        ka kaVar2 = this.r;
        ea eaVar = new ea(this, activity);
        this.i0 = eaVar;
        kaVar2.addView(eaVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.s0 = new org.telegram.ui.Components.u9(this.i0);
        this.t0 = new w5();
        ka kaVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.j0 = frameLayout;
        kaVar3.addView(frameLayout);
        ka kaVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.l0 = frameLayout2;
        kaVar4.addView(frameLayout2);
        ka kaVar5 = this.r;
        bi.g2 g2Var = new bi.g2(5, activity, this);
        this.m0 = g2Var;
        kaVar5.addView(g2Var);
        this.m0.setVisibility(8);
        this.m0.setAlpha(0.0f);
        ka kaVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        kaVar6.addView(frameLayout3);
        int i13 = 3;
        xb.a(this.n, new bi.t(i13));
        int i14 = 8;
        fa faVar = new fa(this, activity, this.s0, this.r, bVar);
        this.B0 = faVar;
        ra raVar3 = this.n;
        Objects.requireNonNull(raVar3);
        int i15 = 13;
        faVar.setCancelGestures(new e1(raVar3, i15));
        this.B0.setResetState(new s8(this, i15));
        this.i0.addView(this.B0, c8.ja.e(-1, -1, ns.E1));
        this.B0.setOnClickListener(new u8(this, 12));
        ea eaVar2 = this.i0;
        int i16 = this.K;
        eaVar2.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
        ea eaVar3 = this.i0;
        float L = org.telegram.messenger.g0.L(12.0f);
        bg.p0 p0Var = bg.t0.a;
        eaVar3.setOutlineProvider(new bg.r0(0, L));
        this.i0.setClipToOutline(true);
        s8 s8Var = new s8(this, 14);
        sd0 sd0Var = new sd0(activity);
        sd0Var.a = new TextPaint(1);
        sd0Var.b = new TextPaint(1);
        er erVar = er.h;
        sd0Var.s = new org.telegram.ui.Components.u5(sd0Var, 0L, 350L, erVar);
        int i17 = 6;
        sd0Var.J = new wa0(sd0Var, i17);
        sd0Var.y = s8Var;
        this.D1 = sd0Var;
        ga gaVar = new ga(this, activity, this.s0, this.t0);
        this.Y0 = gaVar;
        gaVar.setCollageView(this.B0);
        ga gaVar2 = this.Y0;
        gaVar2.w = new s8(this, 15);
        gaVar2.setOnTapListener(new s8(this, i12));
        this.Y0.setVisibility(8);
        ga gaVar3 = this.Y0;
        gaVar3.O = new s8(this, 17);
        this.i0.addView(gaVar3, c8.ja.e(-1, -1, ns.E1));
        this.i0.addView(this.D1, c8.ja.e(-1, -1, ns.E1));
        ra raVar4 = this.n;
        int i18 = 5;
        ia iaVar = new ia(this, activity, raVar4, raVar4, this.r, bVar, this.s0);
        this.d1 = iaVar;
        iaVar.setAccount(i7);
        this.d1.setUiBlurBitmap(new g0.e(29));
        xb.a(this.m0, new bi.e1(this, i18));
        this.d1.setOnHeightUpdate(new t8(this, i15));
        this.d1.setOnPeriodUpdate(new t8(this, 4));
        long j3 = this.O;
        if (j3 != 0) {
            this.d1.setDialogId(j3);
        }
        this.d1.setOnPremiumHint(new t8(this, i18));
        this.d1.setOnKeyboardOpen(new t8(this, i17));
        bi.o2 o2Var = new bi.o2(i13, activity, this);
        this.u0 = o2Var;
        this.r.addView(o2Var);
        cb cbVar = new cb(activity, this.r, this.i0, bVar, this.s0);
        this.a1 = cbVar;
        cbVar.setOnTimelineClick(new s8(this, 10));
        this.a1.setOnHeightChange(new s8(this, 11));
        this.Y0.setVideoTimelineView(this.a1);
        this.a1.setVisibility(8);
        this.a1.setAlpha(0.0f);
        this.a1.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Z0 = frameLayout4;
        float f10 = 388;
        frameLayout4.addView(this.a1, c8.ja.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        gb gbVar = new gb(activity);
        this.b1 = gbVar;
        gbVar.setVisibility(8);
        this.b1.a(false);
        this.Z0.addView(this.b1, c8.ja.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.m0.addView(this.Z0, c8.ja.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.m0.addView(this.d1, c8.ja.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.B0.setTimelineView(this.a1);
        this.B0.setPreviewView(this.Y0);
        cb cbVar2 = new cb(activity, this.r, this.i0, bVar, this.s0);
        this.u1 = cbVar2;
        cbVar2.Y0 = true;
        cbVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.m0.addView(this.u1, c8.ja.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        l9 l9Var = new l9(this, activity, bVar, this.s0);
        this.e1 = l9Var;
        l9Var.setVisibility(8);
        this.m0.addView(this.e1, c8.ja.e(-1, -2, 85));
        l2 l2Var = new l2(activity);
        this.o0 = l2Var;
        l2Var.setContentDescription(hd.M0(2131754878, null));
        l2 l2Var2 = this.o0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        l2Var2.setScaleType(scaleType);
        this.o0.setImageResource(R.drawable.msg_photo_back);
        l2 l2Var3 = this.o0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        l2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.o0.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.o0.setOnClickListener(new u8(this, i11));
        this.j0.addView(this.o0, c8.ja.e(56, 56, 51));
        this.s.a(this.o0);
        w6 w6Var = new w6(activity, i7);
        this.p0 = w6Var;
        w6Var.a(false, false);
        this.p0.setOnClickListener(new ai.t2(22, this, activity));
        this.j0.addView(this.p0, c8.ja.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.q0 = j5Var;
        j5Var.setTextSize(20);
        this.q0.setGravity(19);
        this.q0.setTextColor(-1);
        this.q0.setTypeface(org.telegram.messenger.g0.o());
        this.q0.l(hd.M0(2131746353, null), false);
        this.q0.getPaint().setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.q0.setAlpha(0.0f);
        this.q0.setVisibility(8);
        this.q0.setEllipsizeByGradient(true);
        this.q0.setRightPadding(org.telegram.messenger.g0.L(144.0f));
        this.j0.addView(this.q0, c8.ja.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.k0 = linearLayout;
        linearLayout.setOrientation(0);
        this.k0.setGravity(5);
        this.j0.addView(this.k0, c8.ja.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        t8 t8Var = new t8(this, 7);
        ra raVar5 = this.n;
        u0 u0Var = new u0(activity);
        u0Var.x = true;
        u0Var.y = true;
        u0Var.h = t8Var;
        u0Var.a = i7;
        u0Var.b = raVar5;
        u0Var.setScaleType(scaleType);
        u0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        u0Var.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        u0Var.setVisibility(8);
        u0Var.setAlpha(0.0f);
        u0Var.setOnClickListener(new ah.d(u0Var, 28));
        u0Var.f = new lp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        u0Var.d();
        this.f1 = u0Var;
        l3 l3Var = new l3(activity, 1);
        l3Var.o(1.0f, -71.0f);
        l3Var.d = 2000L;
        l3Var.V = false;
        l3Var.I.r(true, false);
        this.l1 = l3Var;
        l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.j0.addView(this.l1, c8.ja.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        fh0 fh0Var = new fh0(activity);
        this.h1 = fh0Var;
        fh0Var.setScaleType(scaleType);
        fh0 fh0Var2 = this.h1;
        d7 d7Var = this.L1;
        fh0Var2.setImageResource((d7Var == null || !d7Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.h1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.h1.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.h1.setOnClickListener(new u8(this, 2));
        this.h1.setVisibility(8);
        this.h1.setAlpha(0.0f);
        n5 n5Var = new n5(activity);
        this.k1 = n5Var;
        n5Var.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.k1.setVisibility(8);
        this.k1.setAlpha(0.0f);
        this.k1.setOnClickListener(new u8(this, 3));
        this.k0.addView(this.k1, c8.ja.r(46, 56, 53));
        this.k0.addView(this.h1, c8.ja.r(46, 56, 53));
        this.k0.addView(this.f1, c8.ja.e(46, 56, 53));
        db dbVar = new db(activity);
        this.F0 = dbVar;
        dbVar.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.F0.setOnClickListener(new u8(this, 4));
        this.F0.setOnLongClickListener(new p4(this, i11));
        this.F0.setVisibility(8);
        this.F0.setAlpha(0.0f);
        this.s.a(this.F0);
        this.j0.addView(this.F0, c8.ja.e(56, 56, 53));
        eb ebVar = new eb(activity);
        this.G0 = ebVar;
        ebVar.setContentDescription(hd.M0(2131754886, null));
        this.G0.setOnClickListener(new u8(this, 5));
        boolean q10 = c1.q(activity);
        this.G0.setVisibility(q10 ? 0 : 8);
        this.G0.setAlpha(q10 ? 1.0f : 0.0f);
        this.s.a(this.G0);
        this.j0.addView(this.G0, c8.ja.e(56, 56, 53));
        z zVar = new z(activity);
        this.H0 = zVar;
        zVar.setContentDescription(hd.M0(2131754895, null));
        this.H0.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        if (this.A0 == null) {
            i10 = 6;
            this.A0 = (t) t.a().get(6);
        } else {
            i10 = 6;
        }
        this.H0.setOnClickListener(new u8(this, i10));
        this.H0.a(new u(this.A0, false), false);
        this.H0.setSelected(false);
        this.H0.setVisibility(0);
        this.H0.setAlpha(1.0f);
        this.s.a(this.H0);
        this.j0.addView(this.H0, c8.ja.e(56, 56, 53));
        db dbVar2 = new db(activity);
        this.I0 = dbVar2;
        dbVar2.setContentDescription(hd.M0(2131754894, null));
        this.I0.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.I0.a(new u(new t("../../.."), true), false);
        this.I0.setVisibility(8);
        this.I0.setAlpha(0.0f);
        this.I0.setOnClickListener(new u8(this, 7));
        this.s.a(this.I0);
        this.j0.addView(this.I0, c8.ja.e(56, 56, 53));
        y yVar = new y(activity, this.s);
        this.J0 = yVar;
        yVar.a.v0(6);
        this.J0.setSelected((t) null);
        this.J0.setOnLayoutClick(new t8(this, i14));
        this.j0.addView(this.J0, c8.ja.e(-1, 56, 53));
        l3 l3Var2 = new l3(activity, 1);
        l3Var2.o(1.0f, -20.0f);
        l3Var2.d = 5000L;
        l3Var2.k(true);
        l3Var2.u(hd.M0(2131744713, null));
        l3Var2.r0 = new ai.o(17);
        this.m1 = l3Var2;
        l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.j0.addView(this.m1, c8.ja.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        l3 l3Var3 = new l3(activity, 2);
        l3Var3.o(0.0f, 28.0f);
        l3Var3.d = 5000L;
        l3Var3.r(true);
        this.n1 = l3Var3;
        this.j0.addView(l3Var3, c8.ja.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        l3 l3Var4 = new l3(activity, 1);
        l3Var4.o(1.0f, -20.0f);
        l3Var4.d = 5000L;
        l3Var4.u(hd.M0(2131744704, null));
        this.o1 = l3Var4;
        l3Var4.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        this.j0.addView(this.o1, c8.ja.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        hb hbVar = new hb(activity);
        Paint paint = new Paint(1);
        hbVar.a = paint;
        Paint paint2 = new Paint(1);
        hbVar.b = paint2;
        hbVar.e = new org.telegram.ui.Components.u5(hbVar, 0L, 250L, erVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        hbVar.c = g6Var;
        g6Var.n(0.3f, 250L, erVar);
        g6Var.w(org.telegram.messenger.g0.L(13.0f));
        g6Var.u(-1);
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.setCallback(hbVar);
        g6Var.b = 1;
        hbVar.a(0L, false);
        this.K0 = hbVar;
        h0(false, false);
        this.j0.addView(this.K0, c8.ja.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.K0);
        MediaController.O(0);
        f6 f6Var = new f6(activity);
        this.P0 = f6Var;
        f6Var.setDelegate(p9Var);
        f6 f6Var2 = this.P0;
        boolean z10 = this.P1 == 1;
        f6Var2.o0 = -1.0f;
        f6Var2.p0 = z10;
        f6Var2.invalidate();
        this.l0.addView(this.P0, c8.ja.e(-1, 100, 87));
        this.s.a(this.P0);
        this.P0.e(true, this.B0.j() ? this.B0.getFilledProgress() : 0.0f);
        d dVar = new d(activity, bVar, true);
        this.Q0 = dVar;
        dVar.setRoundRadius(24);
        this.Q0.setColor(-2473124);
        this.Q0.i(hd.M0(2131748788, null), false, true);
        this.Q0.setAlpha(0.0f);
        this.Q0.setScaleX(0.8f);
        this.Q0.setScaleY(0.8f);
        this.Q0.setVisibility(8);
        this.l0.addView(this.Q0, c8.ja.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.Q0.setOnClickListener(new u8(this, i14));
        l3 l3Var5 = new l3(activity, 3);
        l3Var5.r(true);
        l3Var5.u(hd.M0(2131744711, null));
        l3Var5.h = org.telegram.messenger.g0.L(320.0f);
        l3Var5.d = 5000L;
        l3Var5.L = Layout.Alignment.ALIGN_CENTER;
        this.X0 = l3Var5;
        this.l0.addView(l3Var5, c8.ja.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        s71 s71Var = new s71(activity);
        this.W0 = s71Var;
        s71Var.N = false;
        s71Var.setAlpha(0.0f);
        this.l0.addView(this.W0, c8.ja.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.W0.setDelegate(new b9(this, 4));
        s71 s71Var2 = this.W0;
        this.U1 = 0.0f;
        s71Var2.b(false, 0.0f);
        int i19 = 12;
        p6 p6Var = new p6(activity, i7, new s8(this, i19));
        this.E0 = p6Var;
        p6Var.c = new t8(this, 9);
        this.l0.addView(p6Var, c8.ja.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        m9 m9Var = new m9(this, activity);
        this.R0 = m9Var;
        m9Var.setOnSwitchModeListener(new t8(this, 10));
        int i20 = 11;
        this.R0.setOnSwitchingModeListener(new t8(this, i20));
        this.n0.addView(this.R0, c8.ja.e(-1, 48, 55));
        this.s.a(this.R0);
        l2 l2Var4 = new l2(activity);
        this.S0 = l2Var4;
        l2Var4.setContentDescription(hd.M0(2131754752, null));
        this.S0.setImageResource(R.drawable.stream_flip);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.n0.addView(this.S0, c8.ja.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new u8(this, 9));
        l2 l2Var5 = new l2(activity);
        this.T0 = l2Var5;
        l2Var5.setContentDescription(hd.M0(2131748790, null));
        this.T0.setImageResource(R.drawable.stream_settings);
        this.T0.setScaleType(scaleType);
        this.T0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.T0.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        this.n0.addView(this.T0, c8.ja.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.T0);
        this.T0.setOnClickListener(new u8(this, 10));
        i3 i3Var = new i3(activity);
        this.U0 = i3Var;
        this.n0.addView(i3Var, c8.ja.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        i3 i3Var2 = new i3(activity);
        this.V0 = i3Var2;
        i3Var2.a.t(hd.M0(2131744703, null), false, true);
        i3Var2.invalidate();
        this.V0.setAlpha(0.0f);
        this.n0.addView(this.V0, c8.ja.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.V0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.v1 = dVar2;
        dVar2.setVisibility(8);
        this.v1.setAlpha(0.0f);
        this.v1.i(hd.M0(2131744689, null), false, true);
        this.v1.setOnClickListener(new u8(this, i20));
        this.n0.addView(this.v1, c8.ja.d(-1, 48.0f, ns.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        r5 r5Var = new r5(activity);
        r5Var.b = new ArrayList();
        r5Var.e = true;
        r5Var.h = true;
        View view = new View(activity);
        r5Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        r5Var.addView(view, c8.ja.e(-1, -1, ns.E1));
        r5Var.a(0, R.drawable.media_draw, hd.M0(2131754814, null));
        r5Var.a(2, R.drawable.msg_photo_sticker, hd.M0(2131754756, null));
        r5Var.a(1, R.drawable.msg_photo_text2, hd.M0(2131754807, null));
        r5Var.a(3, R.drawable.media_crop, hd.M0(2131751699, null));
        r5Var.a(4, R.drawable.msg_photo_settings, hd.M0(2131754811, null));
        String M0 = hd.M0(2131745640, null);
        r5Var.d = M0;
        r5Var.e = true;
        q5 q5Var = new q5(r5Var, activity, M0, true);
        r5Var.c = q5Var;
        q5Var.setContentDescription(hd.M0(2131745640, null));
        r5Var.addView(r5Var.c, c8.ja.c(-2.0f, -2));
        r5Var.e();
        this.c1 = r5Var;
        r5Var.setVisibility(8);
        this.c1.setOnClickListener(new t8(this, i19));
        this.n0.addView(this.c1, c8.ja.e(-1, 52, 23));
        fb fbVar = new fb(activity);
        this.q1 = fbVar;
        fbVar.setAlpha(0.0f);
        this.q1.setVisibility(8);
        this.i0.addView(this.q1, c8.ja.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        s5 s5Var = new s5(activity, i7, bVar);
        this.p1 = s5Var;
        this.i0.addView(s5Var, c8.ja.e(-1, -1, ns.E1));
        l0(false);
    }

    public static sa D(Activity activity, int i7) {
        sa saVar = G2;
        if (saVar != null && (saVar.b != activity || saVar.c != i7)) {
            saVar.p(false);
            G2 = null;
        }
        if (G2 == null) {
            G2 = new sa(activity, i7);
        }
        return G2;
    }

    public static void Z(boolean z10) {
        np.e1().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(sa saVar) {
        v9 v9Var = saVar.C0;
        if (v9Var == null || v9Var.getTextureView() == null) {
            saVar.d2 = false;
            return;
        }
        Bitmap bitmap = saVar.C0.getTextureView().getBitmap();
        if (bitmap == null) {
            saVar.d2 = false;
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
        saVar.d2 = f11 < 0.22f;
    }

    public static void b(sa saVar) {
        ValueAnimator valueAnimator = saVar.k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            saVar.k2 = null;
        }
        int i7 = 0;
        saVar.l2 = false;
        ka kaVar = saVar.r;
        float f10 = kaVar.a;
        float f11 = kaVar.b;
        kaVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        saVar.k2 = ofFloat;
        ofFloat.addUpdateListener(new i9(saVar, f10, f11, i7));
        saVar.k2.setDuration(340L);
        saVar.k2.setInterpolator(er.h);
        saVar.k2.addListener(new s9(saVar, i7));
        saVar.k2.start();
    }

    public static boolean c(sa saVar) {
        Activity activity = saVar.b;
        if (activity == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, ns.x1);
        return false;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable g10 = i5.c.g(context, R.drawable.story_camera);
        int L = org.telegram.messenger.g0.L(35.0f);
        int i7 = -L;
        g10.setBounds(i7 / 4, i7, (L / 4) * 3, 0);
        spannableString.setSpan(new z9(g10, g10), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        sa saVar = G2;
        if (saVar != null) {
            saVar.p(false);
        }
        G2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            return arrayList.size();
        }
        d7 d7Var = this.L1;
        if (d7Var != null) {
            return d7Var.r();
        }
        return 1;
    }

    public final String B() {
        v9 v9Var = this.C0;
        if (v9Var == null || v9Var.getCameraSession() == null) {
            return null;
        }
        if (!this.C0.isFrontface() || this.C0.getCameraSession().hasFlashModes()) {
            return this.C0.getCameraSession().getCurrentFlashMode();
        }
        o();
        return (String) this.v2.get(this.u2);
    }

    public final v0 C() {
        if (this.O0 == null) {
            v0 v0Var = new v0(this.b);
            this.O0 = v0Var;
            this.l0.addView(v0Var, c8.ja.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.O0;
    }

    public final String E() {
        v9 v9Var = this.C0;
        if (v9Var == null || v9Var.getCameraSession() == null) {
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
            d7 d7Var = this.L1;
            int i7 = 0;
            if (d7Var == null || !d7Var.y0) {
                ch0Var.P(0);
                this.i1.M(0);
            } else {
                ch0Var.M(35);
                this.i1.P(36);
            }
            this.i1.a0 = true;
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.J9, this.a);
            this.i1.Q(w02, "Sunny");
            this.i1.Q(w02, "Path 6");
            this.i1.Q(w02, "Path");
            this.i1.Q(w02, "Path 5");
            this.i1.o();
            ImageView imageView = new ImageView(this.b);
            this.j1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.j1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.j1.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
            this.j1.setOnClickListener(new u8(this, i7));
            this.j1.setVisibility(8);
            this.j1.setImageDrawable(this.i1);
            this.j1.setAlpha(0.0f);
            this.k0.addView(this.j1, 0, c8.ja.r(46, 56, 53));
        }
        return this.j1;
    }

    public final void G() {
        u9 u9Var = this.w1;
        if (u9Var == null) {
            return;
        }
        this.w2 = null;
        u9Var.getTopLayout().setAlpha(0.0f);
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
    public final void J(int i7, boolean z10) {
        d7 d7Var;
        d7 d7Var2;
        d dVar;
        org.telegram.ui.ActionBar.j5 j5Var;
        int i10;
        int i11;
        float L;
        ImageView imageView;
        d7 d7Var3;
        d7 d7Var4;
        d7 d7Var5;
        d7 d7Var6;
        v9 v9Var;
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
        r5 r5Var = this.c1;
        if (r5Var != null) {
            r5Var.b(i7 == 1, z10);
        }
        y yVar = this.J0;
        h0(i7 == 0 && this.P1 == 1 && !yVar.e && !H(), z10);
        if (i7 != 1) {
            this.b1.a(z10);
        }
        b0(this.o0, !yVar.e, z10);
        b0(this.F0, (this.b2 || i7 != 0 || yVar.e || this.Z1 == null || H()) ? false : true, z10);
        boolean z11 = this.b2;
        fa faVar = this.B0;
        b0(this.G0, (z11 || i7 != 0 || (v9Var = this.C0) == null || !v9Var.a || yVar.e || faVar.j()) ? false : true, true);
        b0(this.H0, (this.b2 || i7 != 0 || yVar.e) ? false : true, z10);
        l0(z10);
        u0 u0Var = this.f1;
        n5 n5Var = this.k1;
        fh0 fh0Var = this.h1;
        cb cbVar = this.u1;
        cb cbVar2 = this.a1;
        d dVar2 = this.v1;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.q0;
        ia iaVar = this.d1;
        i3 i3Var = this.V0;
        i3 i3Var2 = this.U0;
        p6 p6Var = this.E0;
        ga gaVar = this.Y0;
        bi.g2 g2Var = this.m0;
        m9 m9Var = this.R0;
        f6 f6Var = this.P0;
        if (!z10) {
            v9 v9Var2 = this.C0;
            if (v9Var2 != null) {
                v9Var2.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            }
            gaVar.setAlpha(((i7 != 1 || faVar.j()) && i7 != 2) ? 0.0f : 1.0f);
            faVar.setAlpha((i7 == 0 || (i7 == 1 && faVar.j())) ? 1.0f : 0.0f);
            f6Var.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            f6Var.setTranslationY(i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            p6Var.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            m9Var.setAlpha((i7 != 0 || H()) ? 0.0f : 1.0f);
            m9Var.setTranslationY((i7 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            i3Var2.setAlpha((i7 == 0 && this.b2 && !H()) ? 1.0f : 0.0f);
            i3Var.setAlpha((i7 == 0 && !this.b2 && H()) ? 0.6f : 0.0f);
            g2Var.setAlpha((i7 == 1 || i7 == 2) ? 1.0f : 0.0f);
            g2Var.setTranslationY((i7 == 1 || i7 == 2) ? 0.0f : org.telegram.messenger.g0.L(12.0f));
            iaVar.setAlpha(i7 == 2 ? 0.0f : 1.0f);
            fh0Var.setAlpha((i7 == 1 && this.P1 == 1) ? 1.0f : 0.0f);
            n5Var.setAlpha((i7 != 1 || (this.P1 != 1 && ((d7Var2 = this.L1) == null || TextUtils.isEmpty(d7Var2.y)))) ? 0.0f : 1.0f);
            int i13 = 1;
            u0Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.j1;
            if (imageView2 != null) {
                imageView2.setAlpha((i7 == 1 && (d7Var = this.L1) != null && d7Var.u) ? 1.0f : 0.0f);
                i13 = 1;
            }
            cbVar2.setAlpha(i7 == i13 ? 1.0f : 0.0f);
            cbVar.setAlpha(i7 == 2 ? 1.0f : 0.0f);
            j5Var2.setAlpha((i7 == i13 || i7 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i7 == 2 ? 1.0f : 0.0f);
            M(i12, i7);
            return;
        }
        this.j2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        v9 v9Var3 = this.C0;
        if (v9Var3 != null) {
            dVar = dVar2;
            j5Var = j5Var2;
            i10 = 1;
            arrayList.add(ObjectAnimator.ofFloat(v9Var3, (Property<v9, Float>) View.ALPHA, i7 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            j5Var = j5Var2;
            i10 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i10];
        fArr[0] = ((i7 != i10 || faVar.j()) && i7 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(gaVar, (Property<ga, Float>) property, fArr));
        float[] fArr2 = new float[i10];
        fArr2[0] = (i7 == 0 || (i7 == i10 && faVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(faVar, (Property<fa, Float>) property, fArr2));
        float[] fArr3 = new float[i10];
        fArr3[0] = i7 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<f6, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i10];
        fArr4[0] = i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<f6, Float>) property2, fArr4));
        float[] fArr5 = new float[i10];
        fArr5[0] = i7 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(p6Var, (Property<p6, Float>) property, fArr5));
        float[] fArr6 = new float[i10];
        fArr6[0] = (i7 != 0 || H()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(m9Var, (Property<m9, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(m9Var, (Property<m9, Float>) property2, (i7 != 0 || H()) ? org.telegram.messenger.g0.L(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(i3Var2, (Property<i3, Float>) property, (i7 == 0 && this.b2 && !H()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(i3Var, (Property<i3, Float>) property, (i7 == 0 && !this.b2 && H()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) property, ((i7 == 1 && ((d7Var6 = this.L1) == null || d7Var6.J0 == 0)) || i7 == 2) ? 1.0f : 0.0f));
        if (i7 == 1 && ((d7Var5 = this.L1) == null || d7Var5.J0 == 0)) {
            i11 = 2;
        } else {
            i11 = 2;
            if (i7 != 2) {
                L = org.telegram.messenger.g0.L(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) property2, L));
                arrayList.add(ObjectAnimator.ofFloat(iaVar, (Property<ia, Float>) property, i7 != i11 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property, (i7 != 1 || i7 == i11) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i7 != i11 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(cbVar2, (Property<cb, Float>) property, i7 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(cbVar, (Property<cb, Float>) property, i7 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property, (i7 == 1 || this.P1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property, (i7 == 1 || (this.P1 != 1 && ((d7Var4 = this.L1) == null || TextUtils.isEmpty(d7Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i7 != 1 ? 1.0f : 0.0f));
                imageView = this.j1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i7 == 1 && (d7Var3 = this.L1) != null && d7Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<s71, Float>) property, 0.0f));
                this.j2.playTogether(arrayList);
                this.j2.addListener(new r9(this, i12, i7, 0));
                this.j2.setDuration(460L);
                this.j2.setInterpolator(er.h);
                this.j2.start();
            }
        }
        L = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) property2, L));
        arrayList.add(ObjectAnimator.ofFloat(iaVar, (Property<ia, Float>) property, i7 != i11 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property, (i7 != 1 || i7 == i11) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i7 != i11 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(cbVar2, (Property<cb, Float>) property, i7 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(cbVar, (Property<cb, Float>) property, i7 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property, (i7 == 1 || this.P1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property, (i7 == 1 || (this.P1 != 1 && ((d7Var4 = this.L1) == null || TextUtils.isEmpty(d7Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i7 != 1 ? 1.0f : 0.0f));
        imageView = this.j1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.W0, (Property<s71, Float>) property, 0.0f));
        this.j2.playTogether(arrayList);
        this.j2.addListener(new r9(this, i12, i7, 0));
        this.j2.setDuration(460L);
        this.j2.setInterpolator(er.h);
        this.j2.start();
    }

    public final void K(Runnable runnable, long j3) {
        if (this.T1 || this.L1 == null) {
            return;
        }
        y8 y8Var = this.h2;
        if (y8Var != null) {
            org.telegram.messenger.g0.r(y8Var);
        }
        this.i2 = true;
        this.T1 = true;
        this.h2 = new y8(this, runnable, 1);
        this.Y0.setAlpha(0.0f);
        this.Y0.setVisibility(0);
        this.Y0.n(this.L1, this.h2, j3);
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
        d7 d7Var;
        d7 d7Var2;
        d7 d7Var3;
        u9 u9Var;
        d7 d7Var4;
        u9 u9Var2;
        u9 u9Var3;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ia iaVar = this.d1;
            if (iaVar != null && iaVar.O1) {
                iaVar.N1 = false;
                iaVar.z(false, false);
                return false;
            }
            if (this.R1) {
                f6 f6Var = this.P0;
                if (f6Var.s0) {
                    f6Var.s0 = false;
                    f6Var.w0 = SystemClock.elapsedRealtime();
                    f6Var.v0 = true;
                    ((p9) f6Var.a).e(false);
                    f6Var.K.c(false);
                    f6Var.L.c(false);
                    f6Var.M.c(false);
                    f6Var.invalidate();
                    return false;
                }
            } else if (!this.Q1 && !iaVar.p()) {
                l9 l9Var = this.e1;
                if (l9Var.N) {
                    l9Var.c(false, true);
                    return false;
                }
                g3 g3Var = this.N0;
                if (g3Var != null) {
                    org.telegram.ui.ActionBar.q0 q0Var = g3Var.H;
                    if (q0Var == null || !q0Var.w()) {
                        e(false);
                        this.n2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = q0Var.getSearchField();
                    if (g3Var.w.c()) {
                        org.telegram.messenger.g0.v1(searchField);
                        return false;
                    }
                    g3Var.y.A(q0Var.U(true));
                    return false;
                }
                if (this.h0 != 0 || (u9Var3 = this.w1) == null || !u9Var3.v0()) {
                    if (this.h0 > -1) {
                        k0(-1, false, true);
                        return false;
                    }
                    int i7 = this.g0;
                    fa faVar = this.B0;
                    if (i7 == 0) {
                        ArrayList arrayList = faVar.h;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            if (((d0) obj).n != null) {
                                faVar.c();
                                l0(true);
                                return false;
                            }
                        }
                    }
                    if (this.g0 == 1 && (((d7Var2 = this.L1) == null || (!d7Var2.n && !d7Var2.u)) && !this.v0)) {
                        if (d7Var2 != null && d7Var2.g && ((u9Var2 = this.w1) == null || !u9Var2.r0())) {
                            d7 d7Var5 = this.L1;
                            if (!d7Var5.j) {
                            }
                        }
                        u9 u9Var4 = this.w1;
                        if (u9Var4 == null || !u9Var4.v0()) {
                            if (this.w0 == 0 && (((this.M1 && !faVar.j() && (((u9Var = this.w1) == null || !u9Var.r0()) && ((d7Var4 = this.L1) == null || d7Var4.Z0 == null))) || !this.c1.h) && (((d7Var3 = this.L1) == null || !d7Var3.g || (!d7Var3.n && !d7Var3.u)) && !this.v0 && (d7Var3 == null || !d7Var3.o)))) {
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
                            String M0 = hd.M0(2131751405, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = M0;
                            t1Var.U = hd.M0(2131747278, null);
                            d7 d7Var6 = this.L1;
                            if (d7Var6 != null && !d7Var6.g && !d7Var6.o) {
                                alertDialog$Builder.i(hd.M0(d7Var6.c ? 2131744653 : 2131744485, null), new b9(this, 7));
                            }
                            d7 d7Var7 = this.L1;
                            alertDialog$Builder.k(hd.M0((d7Var7 == null || !d7Var7.c || d7Var7.g) ? 2131751406 : 2131744686, null), new b9(this, 8));
                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                            t1Var.show();
                            View d = t1Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.j6.q7;
                                org.telegram.ui.ActionBar.q6.U((TextView) d, i11, bVar);
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(i0.a.o(org.telegram.ui.ActionBar.j6.w0(i11, bVar), 51), 6, 6);
                                org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i11, 51);
                                d.setBackground(a02);
                                org.telegram.ui.ActionBar.q6.j(d, a02, null, g10, bVar);
                            }
                        }
                    }
                    if (this.g0 != 2 || (d7Var = this.L1) == null || d7Var.b0) {
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
            d7 d7Var = this.L1;
            if (d7Var == null || !d7Var.n) {
                t();
                G();
            }
            sd0 sd0Var = this.D1;
            if (sd0Var != null) {
                sd0Var.setAllowTouch(false);
            }
            this.Y0.x(2, false);
            this.Y0.x(3, false);
            this.Y0.x(4, false);
            this.Y0.x(5, false);
            this.Y0.x(7, false);
            d7 d7Var2 = this.L1;
            this.b1.setVisibility((d7Var2 == null || d7Var2.h0 < 30000) ? 8 : 0);
            this.m0.setAlpha(1.0f);
            this.m0.setTranslationY(0.0f);
            d7 d7Var3 = this.L1;
            this.d1.setVisibility((d7Var3 == null || d7Var3.J0 == 0) ? 0 : 8);
        }
        if (i10 == 0 && this.W1) {
            C().setVisibility(0);
            v0 C = C();
            C.r.e(true, 0.0f);
            C.a(true);
            fi.c1 c1Var = C.h;
            if (c1Var != null) {
                org.telegram.messenger.g0.r(c1Var);
            }
            fi.c1 c1Var2 = new fi.c1(C, 29);
            C.h = c1Var2;
            org.telegram.messenger.g0.i3(c1Var2, 3500L);
            this.P0.h();
        }
        this.W1 = false;
        sd0 sd0Var2 = this.D1;
        if (sd0Var2 != null) {
            sd0Var2.setAllowTouch(i10 == 1 && ((i11 = this.h0) == -1 || i11 == 1));
        }
        ia iaVar = this.d1;
        if (iaVar != null) {
            iaVar.e0 = i10 != 1;
        }
        if (i10 == 1) {
            int i12 = this.c;
            si.b0(i12).B(0);
            si.b0(i12).V0(0, false, true, false);
            si.b0(i12).V0(2, false, true, false);
            fi.s6 P1 = np.s1(i12).P1();
            if (P1.Q == 0) {
                P1.S();
            }
            np.s1(i12).P1().U();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0468, code lost:
    
        if (r3.J0 != 0) goto L245;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04d0  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(int i7, int i10) {
        fa faVar;
        ?? r82;
        CharSequence charSequence;
        int i11;
        int i12;
        SpannableStringBuilder append;
        String str;
        d7 d7Var;
        boolean z10;
        String str2;
        l9 l9Var;
        x5 x5Var;
        m60 m60Var;
        sd0 sd0Var;
        l3 l3Var;
        u9 u9Var;
        l3 l3Var2;
        d7 d7Var2;
        d7 d7Var3;
        File file;
        xa xaVar;
        boolean z11;
        CharSequence charSequence2;
        cb cbVar;
        boolean z12;
        d7 d7Var4;
        fi.m6 o4;
        d7 d7Var5;
        k51 textureView;
        d7 d7Var6;
        fa faVar2 = this.B0;
        if (i10 == 0) {
            Y(false);
            f6 f6Var = this.P0;
            f6Var.setVisibility(0);
            if (f6Var != null) {
                f6Var.g(false);
            }
            this.R0.setVisibility(0);
            s71 s71Var = this.W0;
            s71Var.setVisibility(0);
            s71Var.setAlpha(0.0f);
            this.K0.a(0L, true);
            d7 d7Var7 = this.L1;
            if (d7Var7 != null) {
                d7Var7.i(false);
                this.L1 = null;
            }
            if (faVar2 != null) {
                faVar2.c();
                f6Var.e(false, 0.0f);
            }
        }
        if (i7 == 0) {
            d0(null);
            a0(new s8(this, 18));
            v0 v0Var = this.O0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.X0.f(true);
            l3 l3Var3 = this.m1;
            if (l3Var3 != null) {
                l3Var3.f(true);
            }
        }
        cb cbVar2 = this.a1;
        bi.g2 g2Var = this.m0;
        fh0 fh0Var = this.h1;
        r5 r5Var = this.c1;
        ga gaVar = this.Y0;
        ia iaVar = this.d1;
        org.telegram.ui.ActionBar.j5 j5Var = this.q0;
        int i13 = this.c;
        if (i10 == 1 || i7 == 1) {
            d7 d7Var8 = i10 == 1 ? this.L1 : null;
            u0 u0Var = this.f1;
            u0Var.setEntry(d7Var8);
            int i14 = this.P1;
            faVar = faVar2;
            n5 n5Var = this.k1;
            if (i14 == 1) {
                fh0Var.setVisibility(0);
                d7 d7Var9 = this.L1;
                e0(d7Var9 != null && d7Var9.Y, false);
                n5Var.setVisibility(0);
                gaVar.x(-9982, false);
                ((ke0) n5Var.c).a(gaVar.k(), false);
                j5Var.setRightPadding(org.telegram.messenger.g0.L(144.0f));
                r82 = 0;
            } else {
                d7 d7Var10 = this.L1;
                if (d7Var10 == null || TextUtils.isEmpty(d7Var10.y)) {
                    r82 = 0;
                    j5Var.setRightPadding(org.telegram.messenger.g0.L(48.0f));
                } else {
                    fh0Var.setVisibility(8);
                    r82 = 0;
                    n5Var.setVisibility(0);
                    ((ke0) n5Var.c).a(true, false);
                    j5Var.setRightPadding(org.telegram.messenger.g0.L(48.0f));
                }
            }
            u0Var.setVisibility(r82);
            d7 d7Var11 = this.L1;
            if (d7Var11 == null || !d7Var11.u) {
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                F().setVisibility(r82);
                n0(r82);
            }
            r5Var.setVisibility(r82);
            gaVar.setVisibility(r82);
            d7 d7Var12 = this.L1;
            iaVar.setVisibility(((d7Var12 == null || d7Var12.J0 == 0) && this.w0 == 0) ? 0 : 8);
            FrameLayout frameLayout = this.Z0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            d7 d7Var13 = this.L1;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(((d7Var13 == null || d7Var13.J0 == 0) && this.w0 == 0) ? 68.0f : 12.0f);
            frameLayout.setLayoutParams(layoutParams);
            g2Var.setVisibility(0);
            g2Var.clearFocus();
            d7 d7Var14 = this.L1;
            iaVar.A(d7Var14 == null ? 86400 : d7Var14.I0, false);
            iaVar.setPeriodVisible(!np.s1(i13).D3() && ((d7Var = this.L1) == null || !d7Var.g));
            d7 d7Var15 = this.L1;
            iaVar.setHasRoundVideo((d7Var15 == null || d7Var15.o0 == null) ? false : true);
            if (iaVar == null) {
                charSequence = "";
                i11 = i13;
            } else {
                d7 d7Var16 = this.L1;
                if (d7Var16 == null || !d7Var16.n) {
                    charSequence = "";
                    i11 = i13;
                    iaVar.v(null, null);
                } else {
                    TLRPC.Peer peer = d7Var16.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        String p10 = q10.p(np.s1(i13).a2(Long.valueOf(peer.user_id)));
                        d7 d7Var17 = this.L1;
                        charSequence = "";
                        append = new SpannableStringBuilder(gj.h6()).append((CharSequence) " ").append((CharSequence) p10);
                        d7Var17.p = append;
                        i12 = i13;
                    } else {
                        charSequence = "";
                        i12 = i13;
                        TLRPC.Chat M0 = np.s1(i13).M0(Long.valueOf(-org.telegram.messenger.m5.o(peer)));
                        CharSequence charSequence3 = M0 == null ? charSequence : M0.title;
                        d7 d7Var18 = this.L1;
                        append = new SpannableStringBuilder(gj.h6()).append((CharSequence) " ").append(charSequence3);
                        d7Var18.p = append;
                    }
                    String str3 = this.L1.s;
                    if (TextUtils.isEmpty(str3)) {
                        SpannableString spannableString = new SpannableString(hd.M0(2131744735, null));
                        i11 = i12;
                        spannableString.setSpan(new q9(0), 0, spannableString.length(), 33);
                        str = spannableString;
                    } else {
                        i11 = i12;
                        str = str3;
                    }
                    iaVar.v(append, str);
                }
            }
            d7 d7Var19 = this.L1;
            boolean z13 = (d7Var19 != null && d7Var19.v() && this.L1.t()) ? false : true;
            boolean z14 = cbVar2.k0;
            cbVar2.k0 = z13;
            cbVar2.j0.f(z13, true);
            cbVar2.invalidate();
        } else {
            faVar = faVar2;
            charSequence = "";
            i11 = i13;
        }
        d dVar = this.v1;
        cb cbVar3 = this.u1;
        int i15 = 2;
        if (i10 == 2 || i7 == 2) {
            z10 = false;
            j5Var.setVisibility(0);
            cbVar3.setVisibility(0);
            d7 d7Var20 = this.L1;
            if (d7Var20 == null || !d7Var20.b0) {
                str2 = null;
            } else {
                str2 = null;
                j5Var.l(hd.M0(2131746355, null), false);
            }
            g2Var.setVisibility(0);
            dVar.setVisibility(0);
            i15 = 2;
        } else {
            z10 = false;
            str2 = null;
        }
        if (i10 == i15) {
            j5Var.l(hd.M0(2131746355, str2), z10);
        }
        l9 l9Var2 = this.e1;
        if (i10 == 1) {
            this.O1 = z10;
            d7 d7Var21 = this.L1;
            l9Var = l9Var2;
            boolean z15 = (d7Var21 == null || d7Var21.J0 == 0) ? false : true;
            boolean z16 = d7Var21 != null && d7Var21.g;
            String M02 = hd.M0(z16 ? 2131751354 : z15 ? 2131743804 : 2131748250, null);
            boolean z17 = !z15;
            boolean z18 = z15;
            if (TextUtils.equals(M02, r5Var.d) && z17 == r5Var.e) {
                z11 = z16;
            } else {
                r5Var.removeView(r5Var.c);
                z11 = z16;
                Context context = r5Var.getContext();
                r5Var.d = M02;
                r5Var.e = z17;
                q5 q5Var = new q5(r5Var, context, M02, z17);
                r5Var.c = q5Var;
                q5Var.setContentDescription(M02);
                r5Var.addView(r5Var.c, c8.ja.c(-2.0f, -2));
                r5Var.e();
            }
            cbVar3.setVisibility(8);
            dVar.setVisibility(8);
            if (!this.i2) {
                d7 d7Var22 = this.L1;
                if (d7Var22 == null || !d7Var22.u) {
                    gaVar.set(d7Var22);
                } else {
                    gaVar.l(d7Var22);
                }
            }
            this.i2 = false;
            iaVar.f.getEditText().setOnPremiumMenuLockClickListener(np.s1(i11).Y4() ? null : new s8(this, 19));
            l9Var.setVisibility(this.I1 == null ? 8 : 0);
            ArrayList arrayList = this.I1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.K1;
                ArrayList arrayList3 = this.J1;
                l9Var.c(false, false);
                l9Var.c = arrayList;
                l9Var.d = arrayList2;
                l9Var.e = arrayList3;
                l9Var.x = new oy0(Integer.toString(arrayList.size()), 20.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                l9Var.L = new oy0(hd.H(',', "HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                l9Var.b.g3.O(false);
                l9Var.setSelected(this.I1.indexOf(this.L1));
            }
            cbVar2.setMaxCount((z18 || z11 || this.I1 != null || ((d7Var6 = this.L1) != null && (d7Var6.v() || !this.L1.K))) ? 1 : 3);
            if (i7 != 2) {
                d7 d7Var23 = this.L1;
                if (d7Var23 != null && (d7Var23.c || d7Var23.g || this.v0)) {
                    if (d7Var23.P0 != null) {
                        y();
                        t();
                        G();
                    }
                    d7 d7Var24 = this.L1;
                    if (d7Var24.K && d7Var24.a1 != null && (textureView = gaVar.getTextureView()) != null) {
                        textureView.setDelegate(new b9(this, 6));
                    }
                    iaVar.setText(this.L1.C0);
                } else if (i7 != 2) {
                    iaVar.W = true;
                    charSequence2 = charSequence;
                    iaVar.f.setText(charSequence2);
                    d7 d7Var25 = this.L1;
                    r5Var.d(4, d7Var25 != null || ((!d7Var25.u || d7Var25.K) && !d7Var25.v()));
                    boolean z19 = org.telegram.messenger.r2.a;
                    r5Var.d(3, false);
                    if (!this.O1 && !iaVar.o()) {
                        fi.s6 P1 = np.s1(i11).P1();
                        int A = A();
                        o4 = P1.o();
                        if (o4 != null && o4.a(P1.a, A)) {
                            d7Var5 = this.L1;
                            if (d7Var5 != null) {
                                if (!d7Var5.g) {
                                    cbVar = cbVar2;
                                }
                            }
                        }
                        cbVar = cbVar2;
                        z12 = true;
                        r5Var.setShareEnabled(z12);
                        d7 d7Var26 = this.L1;
                        fh0Var.setImageResource((d7Var26 == null && d7Var26.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                        gaVar.setVisibility(0);
                        cbVar.setVisibility(0);
                        j5Var.setVisibility(0);
                        j5Var.setTranslationX(0.0f);
                        d7Var4 = this.L1;
                        if (d7Var4 != null || d7Var4.J0 == 0) {
                            if (d7Var4 == null && d7Var4.g) {
                                m60Var = null;
                                j5Var.l(hd.M0(2131746354, null), false);
                                x5Var = gaVar;
                            } else if (d7Var4 == null && d7Var4.u) {
                                j5Var.l(hd.M0(2131746352, null), false);
                            } else if (d7Var4 == null && d7Var4.n) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                int i16 = i11;
                                org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(32.0f, i16, j5Var);
                                j5Var.setTranslationX(-org.telegram.messenger.g0.L(6.0f));
                                SpannableString spannableString2 = new SpannableString("a");
                                spannableString2.setSpan(f5Var, 0, 1, 33);
                                if (this.L1.q instanceof TLRPC.TL_peerUser) {
                                    TLRPC.User a22 = np.s1(i16).a2(Long.valueOf(this.L1.q.user_id));
                                    f5Var.e(a22);
                                    spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) q10.p(a22));
                                    x5Var = gaVar;
                                } else {
                                    x5Var = gaVar;
                                    TLRPC.Chat M03 = np.s1(i16).M0(Long.valueOf(-org.telegram.messenger.m5.o(this.L1.q)));
                                    f5Var.b(M03);
                                    spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                                    spannableStringBuilder.append(M03 != null ? M03.title : charSequence2);
                                }
                                j5Var.l(spannableStringBuilder, false);
                                m60Var = null;
                            } else {
                                x5Var = gaVar;
                                m60Var = null;
                                j5Var.l(hd.M0(2131746353, null), false);
                            }
                            if (i7 == 1) {
                                m60 m60Var2 = iaVar.V0;
                                if (m60Var2 != null) {
                                    m60Var2.u();
                                    iaVar.V0 = m60Var;
                                }
                                this.l1.f(true);
                                if (l9Var.N) {
                                    l9Var.c(false, true);
                                }
                            }
                            if (i10 == 2 && (d7Var2 = this.L1) != null) {
                                if (d7Var2.e0 < 0) {
                                    d7Var2.e0 = 0L;
                                }
                                this.N1 = d7Var2.e0;
                                long duration = x5Var.getDuration() >= 100 ? this.L1.h0 : x5Var.getDuration();
                                d7Var3 = this.L1;
                                if (d7Var3.h0 <= 0) {
                                    d7Var3.h0 = duration;
                                }
                                file = d7Var3.Z0;
                                if (file == null) {
                                    file = d7Var3.L;
                                }
                                String absolutePath = file.getAbsolutePath();
                                d7 d7Var27 = this.L1;
                                this.u1.o(false, absolutePath, d7Var27.h0, d7Var27.P);
                                d7 d7Var28 = this.L1;
                                float f10 = duration;
                                long j3 = (long) (d7Var28.Z * f10);
                                long j10 = (long) (d7Var28.a0 * f10);
                                cbVar3.a1 = j3;
                                cbVar3.b1 = j10;
                                xaVar = cbVar3.h;
                                if (xaVar != null) {
                                    xa.a(xaVar, true);
                                }
                                q4 q4Var = new q4(this, 2);
                                cbVar3.setDelegate(new gc.b(q4Var, 6));
                                float max = (this.N1 / Math.max(1L, duration)) * 0.96f;
                                cbVar3.setVideoLeft(max);
                                cbVar3.setVideoRight(0.04f + max);
                                q4Var.a(Boolean.TRUE, Float.valueOf(max));
                            }
                            sd0Var = this.D1;
                            if (sd0Var != null) {
                                sd0Var.setAllowTouch(false);
                            }
                            l3Var = this.n1;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            xb.e();
                            if (iaVar != null) {
                                g gVar = iaVar.f;
                                gVar.d();
                                gVar.k(true);
                                iaVar.e0 = true;
                            }
                            if (x5Var != null) {
                                x5Var.x(8, i10 != 1);
                            }
                            u9Var = this.w1;
                            if (u9Var != null) {
                                u9Var.setCoverPreview(i10 != 1);
                            }
                            l3Var2 = this.o1;
                            if (l3Var2 != null) {
                                l3Var2.f(true);
                            }
                            faVar.setPreview(i10 != 1 && faVar.j());
                        }
                        j5Var.l(charSequence2, false);
                    }
                    cbVar = cbVar2;
                    z12 = false;
                    r5Var.setShareEnabled(z12);
                    d7 d7Var262 = this.L1;
                    fh0Var.setImageResource((d7Var262 == null && d7Var262.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    gaVar.setVisibility(0);
                    cbVar.setVisibility(0);
                    j5Var.setVisibility(0);
                    j5Var.setTranslationX(0.0f);
                    d7Var4 = this.L1;
                    if (d7Var4 != null) {
                    }
                    if (d7Var4 == null) {
                    }
                    if (d7Var4 == null) {
                    }
                    if (d7Var4 == null) {
                    }
                    x5Var = gaVar;
                    m60Var = null;
                    j5Var.l(hd.M0(2131746353, null), false);
                    if (i7 == 1) {
                    }
                    if (i10 == 2) {
                        if (d7Var2.e0 < 0) {
                        }
                        this.N1 = d7Var2.e0;
                        if (x5Var.getDuration() >= 100) {
                        }
                        d7Var3 = this.L1;
                        if (d7Var3.h0 <= 0) {
                        }
                        file = d7Var3.Z0;
                        if (file == null) {
                        }
                        String absolutePath2 = file.getAbsolutePath();
                        d7 d7Var272 = this.L1;
                        this.u1.o(false, absolutePath2, d7Var272.h0, d7Var272.P);
                        d7 d7Var282 = this.L1;
                        float f102 = duration;
                        long j32 = (long) (d7Var282.Z * f102);
                        long j102 = (long) (d7Var282.a0 * f102);
                        cbVar3.a1 = j32;
                        cbVar3.b1 = j102;
                        xaVar = cbVar3.h;
                        if (xaVar != null) {
                        }
                        q4 q4Var2 = new q4(this, 2);
                        cbVar3.setDelegate(new gc.b(q4Var2, 6));
                        float max2 = (this.N1 / Math.max(1L, duration)) * 0.96f;
                        cbVar3.setVideoLeft(max2);
                        cbVar3.setVideoRight(0.04f + max2);
                        q4Var2.a(Boolean.TRUE, Float.valueOf(max2));
                    }
                    sd0Var = this.D1;
                    if (sd0Var != null) {
                    }
                    l3Var = this.n1;
                    if (l3Var != null) {
                    }
                    xb.e();
                    if (iaVar != null) {
                    }
                    if (x5Var != null) {
                    }
                    u9Var = this.w1;
                    if (u9Var != null) {
                    }
                    l3Var2 = this.o1;
                    if (l3Var2 != null) {
                    }
                    faVar.setPreview(i10 != 1 && faVar.j());
                }
            }
            charSequence2 = charSequence;
            d7 d7Var252 = this.L1;
            r5Var.d(4, d7Var252 != null || ((!d7Var252.u || d7Var252.K) && !d7Var252.v()));
            boolean z192 = org.telegram.messenger.r2.a;
            r5Var.d(3, false);
            if (!this.O1) {
                fi.s6 P12 = np.s1(i11).P1();
                int A2 = A();
                o4 = P12.o();
                if (o4 != null) {
                    d7Var5 = this.L1;
                    if (d7Var5 != null) {
                    }
                }
                cbVar = cbVar2;
                z12 = true;
                r5Var.setShareEnabled(z12);
                d7 d7Var2622 = this.L1;
                fh0Var.setImageResource((d7Var2622 == null && d7Var2622.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                gaVar.setVisibility(0);
                cbVar.setVisibility(0);
                j5Var.setVisibility(0);
                j5Var.setTranslationX(0.0f);
                d7Var4 = this.L1;
                if (d7Var4 != null) {
                }
                if (d7Var4 == null) {
                }
                if (d7Var4 == null) {
                }
                if (d7Var4 == null) {
                }
                x5Var = gaVar;
                m60Var = null;
                j5Var.l(hd.M0(2131746353, null), false);
                if (i7 == 1) {
                }
                if (i10 == 2) {
                }
                sd0Var = this.D1;
                if (sd0Var != null) {
                }
                l3Var = this.n1;
                if (l3Var != null) {
                }
                xb.e();
                if (iaVar != null) {
                }
                if (x5Var != null) {
                }
                u9Var = this.w1;
                if (u9Var != null) {
                }
                l3Var2 = this.o1;
                if (l3Var2 != null) {
                }
                faVar.setPreview(i10 != 1 && faVar.j());
            }
            cbVar = cbVar2;
            z12 = false;
            r5Var.setShareEnabled(z12);
            d7 d7Var26222 = this.L1;
            fh0Var.setImageResource((d7Var26222 == null && d7Var26222.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            gaVar.setVisibility(0);
            cbVar.setVisibility(0);
            j5Var.setVisibility(0);
            j5Var.setTranslationX(0.0f);
            d7Var4 = this.L1;
            if (d7Var4 != null) {
            }
            if (d7Var4 == null) {
            }
            if (d7Var4 == null) {
            }
            if (d7Var4 == null) {
            }
            x5Var = gaVar;
            m60Var = null;
            j5Var.l(hd.M0(2131746353, null), false);
            if (i7 == 1) {
            }
            if (i10 == 2) {
            }
            sd0Var = this.D1;
            if (sd0Var != null) {
            }
            l3Var = this.n1;
            if (l3Var != null) {
            }
            xb.e();
            if (iaVar != null) {
            }
            if (x5Var != null) {
            }
            u9Var = this.w1;
            if (u9Var != null) {
            }
            l3Var2 = this.o1;
            if (l3Var2 != null) {
            }
            faVar.setPreview(i10 != 1 && faVar.j());
        }
        l9Var = l9Var2;
        x5Var = gaVar;
        m60Var = null;
        if (i7 == 1) {
        }
        if (i10 == 2) {
        }
        sd0Var = this.D1;
        if (sd0Var != null) {
        }
        l3Var = this.n1;
        if (l3Var != null) {
        }
        xb.e();
        if (iaVar != null) {
        }
        if (x5Var != null) {
        }
        u9Var = this.w1;
        if (u9Var != null) {
        }
        l3Var2 = this.o1;
        if (l3Var2 != null) {
        }
        faVar.setPreview(i10 != 1 && faVar.j());
    }

    public final void O() {
        sg.s0 s0Var;
        boolean z10 = false;
        if (this.g0 == 0) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Y(false);
            } else {
                this.y2 = new s8(this, 3);
            }
        }
        ia iaVar = this.d1;
        if (iaVar != null) {
            iaVar.f.s();
        }
        f6 f6Var = this.P0;
        if (f6Var != null) {
            f6Var.h();
        }
        s5 s5Var = this.p1;
        if (s5Var != null) {
            fi.s6 P1 = np.s1(s5Var.a).P1();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) P1.i.f(m10.i(P1.a).n);
            s5Var.b = P1.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            s5Var.c.invalidate();
        }
        u9 u9Var = this.w1;
        if (u9Var != null && (s0Var = u9Var.y0.d) != null) {
            s0Var.postRunnable(s0Var.x);
        }
        ga gaVar = this.Y0;
        if (gaVar != null) {
            gaVar.x(0, false);
        }
        a1 a1Var = np.s1(this.c).P1().w;
        if (a1Var.c || a1Var.d) {
            return;
        }
        a1Var.d = true;
        w0 w0Var = new w0(a1Var, 1);
        vr a02 = vr.a0(a1Var.a);
        a02.a.c(new di.m6(a02, z10, w0Var, 3));
    }

    public final void P(int i7, int i10) {
        u9 u9Var;
        ca caVar;
        da daVar;
        u9 u9Var2;
        if (i10 == 0) {
            this.o0.setVisibility(8);
        }
        if (i7 == 0 && (u9Var2 = this.w1) != null) {
            u9Var2.setVisibility(8);
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
        if ((i10 == 0 || i7 == 0) && (u9Var = this.w1) != null) {
            u9Var.N0.setLayerType(0, null);
        }
        sd0 sd0Var = this.D1;
        if (sd0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z10 = false;
            }
            sd0Var.setAllowTouch(z10);
        }
        if (i10 == 3) {
            ca caVar2 = this.s1;
            if (caVar2 != null) {
                caVar2.setAppearProgress(1.0f);
            }
        } else if (i7 == 3 && (caVar = this.s1) != null) {
            caVar.setVisibility(8);
            this.s1.setAppearProgress(0.0f);
            ca caVar3 = this.s1;
            caVar3.y = null;
            g0 g0Var = caVar3.f;
            g0Var.M = null;
            g0Var.d = null;
            g0Var.K = false;
            caVar3.d.setVisibility(8);
            caVar3.a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            da daVar2 = this.t1;
            if (daVar2 != null) {
                daVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i7 != 4 || (daVar = this.t1) == null) {
            return;
        }
        daVar.setVisibility(8);
        this.t1.setAppearProgress(0.0f);
        da daVar3 = this.t1;
        daVar3.b = null;
        g0 g0Var2 = daVar3.h;
        g0Var2.M = null;
        g0Var2.d = null;
        g0Var2.K = false;
        daVar3.e.setVisibility(8);
        daVar3.setVisibility(8);
    }

    public final void Q(ma maVar) {
        fi.m6 o4;
        ra raVar;
        if (this.d) {
            return;
        }
        int i7 = this.c;
        if (np.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        int i10 = 0;
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        this.t0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (raVar = this.n) != null && raVar.getParent() == null) {
            ra raVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.x3(windowManager, raVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.B0.setCameraThumb(z());
        if (this.w0 == 0 && (o4 = np.s1(i7).P1().o()) != null && o4.a(i7, 1)) {
            g0(o4, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.I;
        if (maVar != null) {
            this.G = maVar;
            this.K = maVar.a;
            rectF.set(maVar.c);
            this.H = maVar.b;
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
        f(1.0f, true, new s8(this, 6));
        d();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void R(la laVar, d7 d7Var, long j3) {
        ra raVar;
        if (this.d) {
            return;
        }
        int i7 = this.c;
        if (np.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        this.v0 = false;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (raVar = this.n) != null && raVar.getParent() == null) {
            ra raVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.x3(windowManager, raVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.L1 = d7Var;
        this.P1 = d7Var.K ? 1 : 0;
        this.t0.g = false;
        RectF rectF = this.I;
        if (laVar != null) {
            this.G = laVar;
            this.K = laVar.a;
            rectF.set(laVar.c);
            this.H = laVar.b;
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
        d7 d7Var2 = this.L1;
        if (d7Var2 != null) {
            this.d1.setText(d7Var2.C0);
        }
        K(new k9(this, 0), j3);
        J(this.L1.b0 ? 2 : 1, false);
        k0(-1, false, false);
        this.c1.b(false, false);
        d();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void S() {
        m60 m60Var;
        ga gaVar = this.Y0;
        if (gaVar != null) {
            gaVar.x(4, true);
        }
        ia iaVar = this.d1;
        if (iaVar != null && (m60Var = iaVar.V0) != null) {
            m60Var.u();
            iaVar.V0 = null;
        }
        ug.x0 x0Var = new ug.x0((org.telegram.ui.ActionBar.e2) new w9(this, 1), 14, false);
        x0Var.setOnDismissListener(new g9(this, 1));
        x0Var.show();
    }

    public final void T(la laVar, d7 d7Var) {
        fi.m6 o4;
        ra raVar;
        if (this.d) {
            return;
        }
        int i7 = this.c;
        if (np.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        this.v0 = true;
        this.e = false;
        this.C2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (raVar = this.n) != null && raVar.getParent() == null) {
            ra raVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            org.telegram.messenger.g0.x3(windowManager, raVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.L1 = d7Var;
        r8.a(i7, d7Var);
        d7 d7Var2 = this.L1;
        int i10 = (d7Var2 == null || !d7Var2.K) ? 0 : 1;
        this.P1 = i10;
        this.t0.g = d7Var2 != null && d7Var2.u && i10 == 1;
        if (this.w0 == 0 && (o4 = np.s1(i7).P1().o()) != null && o4.a(i7, 1)) {
            g0(o4, true);
        }
        RectF rectF = this.I;
        if (laVar != null) {
            this.G = laVar;
            this.K = laVar.a;
            rectF.set(laVar.c);
            this.H = laVar.b;
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
        d7 d7Var3 = this.L1;
        if (d7Var3 != null) {
            this.d1.setText(d7Var3.C0);
        }
        this.c1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new s8(this, 6));
        d();
        this.w0 = 0L;
        this.x0 = "";
    }

    public final void U() {
        sg.u0 u0Var = this.x1;
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
        fb fbVar = this.q1;
        if (fbVar != null) {
            fbVar.bringToFront();
        }
        sd0 sd0Var = this.D1;
        if (sd0Var != null) {
            sd0Var.bringToFront();
        }
        kd0 kd0Var = this.F1;
        if (kd0Var != null) {
            kd0Var.bringToFront();
        }
        md0 md0Var = this.G1;
        if (md0Var != null) {
            md0Var.bringToFront();
        }
        s5 s5Var = this.p1;
        if (s5Var != null) {
            s5Var.bringToFront();
        }
        p pVar = this.r1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void V(d7 d7Var, boolean z10) {
        d7 d7Var2;
        boolean z11;
        if (d7Var == null || this.Y0.getWidth() <= 0 || this.Y0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? d7Var.O0 : d7Var.N0;
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
        k51 textureView = this.Y0.getTextureView();
        if (d7Var.K && !d7Var.u && textureView != null) {
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
        File file2 = d7Var.Q0;
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
        File file3 = d7Var.P0;
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
        u9 u9Var = this.w1;
        if (u9Var != null && u9Var.B0 != null) {
            canvas.save();
            canvas.scale(f10, f10);
            u9 u9Var2 = this.w1;
            u9Var2.s0 = true;
            h5 h5Var = u9Var2.B0;
            h5Var.a = true;
            h5Var.draw(canvas);
            u9 u9Var3 = this.w1;
            u9Var3.B0.a = false;
            u9Var3.s0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = d7.w(this.c, "jpg");
        if (z10) {
            d7Var2 = d7Var;
            z11 = z10;
            Utilities.g.c(new ai.j(this, createBitmap, z11, w10, d7Var2, 3));
        } else {
            d7Var2 = d7Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        if (!z11) {
            d7Var2.N0 = w10;
        }
        d7Var2.b1 = createScaledBitmap;
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
        fi.m6 o4;
        ?? r16;
        q8 q8Var = this.r0;
        BitmapDrawable bitmapDrawable = null;
        if (q8Var != null) {
            q8Var.dismiss();
            this.r0 = null;
        }
        boolean z10 = this.O1;
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
        if (z10) {
            u0 u0Var = this.f1;
            u0Var.getClass();
            u0Var.c(hd.N0("VideoConvertFail"));
            p2Var.a();
            q5 q5Var = this.c1.c;
            int i7 = -this.V1;
            this.V1 = i7;
            org.telegram.messenger.g0.F3(i7, q5Var, null);
            return;
        }
        ia iaVar = this.d1;
        if (iaVar != null && iaVar.o()) {
            p2Var.a();
            org.telegram.ui.Components.h6 h6Var = iaVar.w;
            int i10 = -this.V1;
            this.V1 = i10;
            org.telegram.messenger.g0.F3(i10, h6Var, null);
            iaVar.e();
            return;
        }
        d7 d7Var = this.L1;
        int i11 = this.c;
        int i12 = 0;
        if ((d7Var == null || (!d7Var.g && d7Var.J0 == 0)) && (o4 = np.s1(i11).i0.o()) != null && o4.a(i11, A())) {
            g0(o4, false);
            return;
        }
        this.L1.D0 = np.s1(i11).Y4();
        fi.b bVar = this.a;
        boolean z11 = true;
        if (iaVar != null && !this.L1.D0) {
            CharSequence text = iaVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((xy0[]) spannable.getSpans(0, text.length(), xy0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new cc(this.n, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.g0.S2(hd.M0(2131744581, null), org.telegram.ui.ActionBar.j6.Xc, 0, new s8(this, 27), bVar)).k(true);
                    int i13 = -this.V1;
                    this.V1 = i13;
                    org.telegram.messenger.g0.F3(i13, iaVar, null);
                    return;
                }
            }
        }
        d7 d7Var2 = this.L1;
        if (d7Var2.g || d7Var2.J0 != 0) {
            d7Var2.l = false;
            h(null);
            o0();
            return;
        }
        if (this.O != 0) {
            d7Var2.v0 = np.s1(i11).j1(this.O);
        }
        ga gaVar = this.Y0;
        gaVar.x(3, true);
        q8 q8Var2 = new q8(this.L1.I0, this.b, bVar);
        q8Var2.W0(this.L1.E0);
        q8Var2.V0(this.L1.v0);
        q8Var2.A1 = this.N;
        q8Var2.P1 = new t8(this, 14);
        q8Var2.L0(!this.B0.j());
        ArrayList arrayList = this.J1;
        q8Var2.S0(arrayList == null ? this.L1.r() : arrayList.size());
        q8Var2.Q0(false);
        CharSequence text2 = iaVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (i41 i41Var : (i41[]) ((Spanned) text2).getSpans(0, text2.length(), i41.class)) {
                if (i41Var != null) {
                    try {
                        TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(Long.parseLong(i41Var.getURL())));
                        if (a22 != null && !q10.B(a22) && q10.n(a22) != null && !arrayList2.contains(a22)) {
                            arrayList2.add(q10.n(a22));
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
                        TLObject f22 = np.s1(i11).f2(charSequence);
                        if (f22 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) f22;
                            if (!user.bot && !q10.B(user) && user.id != 777000 && !q10.z(user) && !arrayList2.contains(charSequence)) {
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
                TLObject f23 = np.s1(i11).f2(charSequence2);
                r16 = z13;
                if (f23 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) f23;
                    r16 = z13;
                    if (!user2.bot) {
                        r16 = z13;
                        if (!q10.B(user2)) {
                            r16 = z13;
                            if (user2.id != 777000) {
                                r16 = z13;
                                if (!q10.z(user2)) {
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
        q8Var2.N1 = arrayList2;
        q8Var2.R1 = new t8(this, 15);
        q8Var2.S1 = new t8(this, 16);
        q8Var2.O1 = new b9(this, 9);
        this.r0 = q8Var2;
        d7 d7Var3 = this.L1;
        if (d7Var3.K) {
            if (gaVar != null && !d7Var3.f0 && this.g0 != 2) {
                d7Var3.e0 = gaVar.getCurrentPosition();
                t8 t8Var = new t8(this, 17);
                sg.u0 u0Var2 = this.x1;
                View view = this.A1;
                View[] viewArr = new View[3];
                viewArr[0] = gaVar;
                viewArr[r16] = u0Var2;
                viewArr[2] = view;
                gaVar.h(t8Var, viewArr);
            }
            q8 q8Var3 = this.r0;
            Bitmap bitmap = this.L1.g0;
            s8 s8Var = new s8(this, 20);
            if (bitmap != null) {
                q8Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            q8Var3.W1 = bitmapDrawable;
            q8Var3.X1 = s8Var;
            i1 i1Var = q8Var3.m1;
            if (i1Var != null) {
                for (View view2 : i1Var.getViewPages()) {
                    if (view2 instanceof l8) {
                        l8 l8Var = (l8) view2;
                        l8Var.h(false);
                        l8Var.f(false);
                    }
                }
            }
        }
        this.r0.setOnDismissListener(new g9(this, i12));
        this.r0.show();
    }

    public final void X(na naVar) {
        int i7 = 0;
        RectF rectF = this.I;
        if (naVar != null) {
            this.G = naVar;
            this.K = naVar.a;
            rectF.set(naVar.c);
            this.H = naVar.b;
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
                    fq fqVar = new fq(new ColorDrawable(-14540254), mutate);
                    int L = org.telegram.messenger.g0.L(64.0f);
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    fqVar.e = L;
                    fqVar.f = L2;
                    this.B0.setCameraThumb(fqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, this.a);
                        int i10 = org.telegram.ui.ActionBar.j6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.x0(null, i10, false), null);
                        alertDialog$Builder.n(i10, null);
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.M0(2131747308, null));
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.U = X2;
                        alertDialog$Builder.k(hd.M0(2131747300, null), new b9(this, 12));
                        alertDialog$Builder.h(hd.M0(2131751772, null), null);
                        t1Var.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, ns.w1);
                    this.x2 = true;
                }
            }
            if (this.t2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                q();
            } else {
                CameraController.getInstance().initCamera(new s8(this, i7));
            }
        }
    }

    public final void a0(Runnable runnable) {
        v9 v9Var = this.C0;
        if (v9Var == null || v9Var.getTextureView() == null) {
            return;
        }
        try {
            Utilities.i.c(new fi.s5(this, this.C0.getTextureView().getBitmap(), runnable, 15));
        } catch (Throwable unused) {
        }
    }

    public final void b0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new t9(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 4)).setDuration(320L).setInterpolator(er.h).start();
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
        ns.e().b(this, ns.r2);
        int i7 = this.c;
        ns.f(i7).b(this, ns.y5);
        ns.f(i7).b(this, ns.b3);
    }

    public final void d0(String str) {
        int i7;
        db dbVar = this.F0;
        dbVar.clearAnimation();
        v9 v9Var = this.C0;
        if ((v9Var != null && v9Var.isDual()) || this.b2) {
            str = null;
        }
        this.Z1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(dbVar, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals("auto")) {
                dbVar.setContentDescription(hd.M0(2131754915, null));
                i7 = R.drawable.media_photo_flash_auto2;
            }
            dbVar.setContentDescription(hd.M0(2131754914, null));
            i7 = R.drawable.media_photo_flash_off2;
        } else {
            if (str.equals("on")) {
                dbVar.setContentDescription(hd.M0(2131754913, null));
                i7 = R.drawable.media_photo_flash_on2;
            }
            dbVar.setContentDescription(hd.M0(2131754914, null));
            i7 = R.drawable.media_photo_flash_off2;
        }
        if (dbVar.n != i7) {
            dbVar.n = i7;
            ValueAnimator valueAnimator = dbVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                dbVar.r = null;
            }
            dbVar.setDrawable(i7);
        }
        if (this.g0 == 0 && !this.J0.e && this.Z1 != null && !H()) {
            z10 = true;
        }
        b0(dbVar, z10, true);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.m6 o4;
        d7 d7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i7 == ns.r2) {
            f6 f6Var = this.P0;
            if (f6Var != null) {
                f6Var.h();
            }
            if (this.n2 == null || MediaController.c2 == null) {
                return;
            }
            for (int i11 = 0; i11 < MediaController.c2.size(); i11++) {
                ve veVar = (ve) MediaController.c2.get(i11);
                int i12 = veVar.a;
                ve veVar2 = this.n2;
                if (i12 == veVar2.a && veVar.b == veVar2.b) {
                    this.n2 = veVar;
                    return;
                }
            }
            return;
        }
        if (i7 == ns.y5) {
            f6 f6Var2 = this.P0;
            if (f6Var2 == null || this.W1) {
                return;
            }
            f6Var2.h();
            return;
        }
        if (i7 == ns.b3) {
            int i13 = this.g0;
            int i14 = this.c;
            if (i13 != 1) {
                if (i13 == 0 && (o4 = np.s1(i14).P1().o()) != null && o4.a(i14, 1)) {
                    d7 d7Var2 = this.L1;
                    if (d7Var2 == null || d7Var2.J0 == 0) {
                        g0(o4, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.O1 && !this.d1.o()) {
                fi.s6 P1 = np.s1(i14).P1();
                int A = A();
                fi.m6 o10 = P1.o();
                if (o10 == null || !o10.a(P1.a, A) || ((d7Var = this.L1) != null && (d7Var.g || d7Var.J0 != 0))) {
                    z10 = true;
                }
            }
            this.c1.setShareEnabled(z10);
        }
    }

    public final void e(boolean z10) {
        v0 v0Var;
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
                this.r2 = new c9(this, z10, i7);
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
            g3 g3Var = this.N0;
            if (g3Var != null) {
                g3Var.L = false;
            }
            if (z10 && (v0Var = this.O0) != null) {
                v0Var.a(false);
            }
            ka kaVar = this.r;
            if (kaVar != null) {
                kaVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.N0.setImportantForAccessibility(z10 ? 0 : 4);
            this.q2 = Boolean.valueOf(z10);
            float translationY = this.N0.getTranslationY();
            ra raVar = this.n;
            float height = z10 ? 0.0f : (raVar.getHeight() - this.N0.g()) + (org.telegram.messenger.g0.n * 2.5f);
            int i10 = 1;
            Math.max(1, raVar.getHeight());
            g3 g3Var2 = this.N0;
            g3Var2.L = !z10;
            this.l2 = this.k2 == null;
            if (z10) {
                r1.g gVar2 = new r1.g(g3Var2, r1.g.p, height);
                this.p2 = gVar2;
                gVar2.m.a(0.75f);
                this.p2.m.b(350.0f);
                this.p2.a(new d9(this, height, i7));
                this.p2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.o2 = ofFloat;
                ofFloat.addUpdateListener(new e9(this, i7));
                this.o2.addListener(new s9(this, i10));
                this.o2.setDuration(450L);
                this.o2.setInterpolator(er.h);
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
        int i7 = ch0Var3.b0;
        if (i7 == 0 || i7 >= 43) {
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
        ka kaVar = this.r;
        if (!z10) {
            this.M = null;
            this.J = f10;
            j();
            kaVar.invalidate();
            this.n.invalidate();
            runnable.run();
            n();
            return;
        }
        this.Q.d();
        ns.e().k(ns.j1, 512);
        this.M = Float.valueOf(this.L);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new e9(this, 5));
        this.F.addListener(new di.g6(this, f10, runnable, 3));
        if (f10 < 1.0f && this.w) {
            this.F.setDuration(250L);
            this.F.setInterpolator(er.h);
        } else if (f10 > 0.0f || kaVar.a < org.telegram.messenger.g0.L(20.0f)) {
            this.F.setDuration(300L);
            this.F.setInterpolator(new x1.a());
        } else if (f10 >= 0.0f || !this.P) {
            this.F.setDuration(400L);
            this.F.setInterpolator(er.h);
        } else {
            this.F.setDuration(200L);
            this.F.setInterpolator(er.h);
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
        m9 m9Var = this.R0;
        i3 i3Var = this.V0;
        i3 i3Var2 = this.U0;
        if (!z11) {
            i3Var2.setAlpha((z10 && this.g0 == 0 && !H()) ? 1.0f : 0.0f);
            i3Var2.setTranslationY((z10 && this.g0 == 0 && !H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            i3Var.setAlpha((!z10 && this.g0 == 0 && H()) ? 0.6f : 0.0f);
            i3Var.setTranslationY((!z10 && this.g0 == 0 && H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f));
            m9Var.setAlpha((z10 || this.g0 != 0 || H()) ? 0.0f : 1.0f);
            m9Var.setTranslationY((z10 || this.g0 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a2 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i3Var2, (Property<i3, Float>) property, (z10 && this.g0 == 0 && !H()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(i3Var2, (Property<i3, Float>) property2, (z10 && this.g0 == 0 && !H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(i3Var, (Property<i3, Float>) property, (!z10 && this.g0 == 0 && H()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(i3Var, (Property<i3, Float>) property2, (!z10 && this.g0 == 0 && H()) ? 0.0f : org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(m9Var, (Property<m9, Float>) property, (z10 || this.g0 != 0 || H()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(m9Var, (Property<m9, Float>) property2, (z10 || this.g0 != 0 || H()) ? org.telegram.messenger.g0.L(16.0f) : 0.0f));
        this.a2.setDuration(260L);
        this.a2.setInterpolator(er.h);
        this.a2.start();
    }

    public final void g0(fi.m6 m6Var, boolean z10) {
        if (this.A2) {
            return;
        }
        x9 x9Var = new x9(m6Var.b(), this.c, this.b, new w9(this, 0), null);
        x9Var.T1 = A();
        x9Var.setOnDismissListener(new a70(2, this, z10));
        this.Y0.x(7, true);
        this.A2 = true;
        x9Var.show();
    }

    public final void h(Runnable runnable) {
        d7 d7Var;
        Runnable runnable2;
        ga gaVar;
        td0 td0Var = this.C1;
        if (td0Var == null || (d7Var = this.L1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        d7Var.j = td0Var.a() | d7Var.j;
        d7 d7Var2 = this.L1;
        td0 td0Var2 = this.C1;
        File file = d7Var2.Z0;
        if (file != null) {
            file.delete();
            d7Var2.Z0 = null;
        }
        gf savedFilterState = td0Var2.getSavedFilterState();
        d7Var2.a1 = savedFilterState;
        if (d7Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.a()) {
                Bitmap bitmap = td0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i7 = d7Var2.R;
                    matrix.postScale(i7 == 1 ? -1.0f : 1.0f, i7 == 2 ? -1.0f : 1.0f, d7Var2.k0 / 2.0f, d7Var2.l0 / 2.0f);
                    matrix.postRotate(-d7Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    d7Var2.n0.preScale(d7Var2.k0 / createBitmap.getWidth(), d7Var2.l0 / createBitmap.getHeight());
                    d7Var2.k0 = createBitmap.getWidth();
                    d7Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = d7Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        d7Var2.Z0.delete();
                    }
                    String k10 = d7.k(d7Var2.L);
                    boolean z10 = "png".equals(k10) || "webp".equals(k10);
                    d7Var2.Z0 = d7.w(d7Var2.a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(d7Var2.Z0));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.i.c(new aa.c0(d7Var2, createBitmap, z10, runnable2, 4));
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
            d7 d7Var3 = this.L1;
            if (d7Var3.K || (gaVar = this.Y0) == null) {
                return;
            }
            gaVar.set(d7Var3);
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.e2 == z10) {
            return;
        }
        this.e2 = z10;
        if (z11) {
            this.K0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(er.h).withEndAction(new c9(this, z10, 1)).start();
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
        s71 s71Var = this.W0;
        if ((s71Var.getTag() != null && z10) || (s71Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f2;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                s8 s8Var = new s8(this, 25);
                this.f2 = s8Var;
                org.telegram.messenger.g0.i3(s8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.g2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        s71Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.g2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            s71Var.setVisibility(0);
        }
        this.g2.playTogether(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.g2.addListener(new bi.v4(14, this, z10));
        this.g2.start();
        if (z10) {
            s8 s8Var2 = new s8(this, 26);
            this.f2 = s8Var2;
            org.telegram.messenger.g0.i3(s8Var2, 2000L);
        }
    }

    public final void j() {
        fi.e3 e3Var;
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
        na naVar = this.G;
        if (naVar != null && (e3Var = naVar.f) != null) {
            e3Var.setTranslationX((rectF.left - rectF2.left) * this.J);
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
        q8 q8Var = this.r0;
        if (q8Var != null) {
            q8Var.dismiss();
            this.r0 = null;
        }
        q8 q8Var2 = new q8(86400, this.b, this.a);
        q8Var2.U0();
        q8Var2.W0(this.z0);
        TLRPC.InputPeer inputPeer = this.y0;
        if (inputPeer == null) {
            inputPeer = this.O != 0 ? np.s1(this.c).j1(this.O) : new TLRPC.TL_inputPeerSelf();
        }
        q8Var2.V0(inputPeer);
        q8Var2.A1 = this.N;
        q8Var2.P1 = new t8(this, 18);
        q8Var2.L0(false);
        q8Var2.S0(1);
        q8Var2.Q0(false);
        q8Var2.R1 = new t8(this, 19);
        q8Var2.O1 = new b9(this, 11);
        this.r0 = q8Var2;
        q8Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        if (r2.isRecycled() != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        d7 d7Var;
        ImageReceiver photoImage;
        float f10;
        if (this.w1 == null || (d7Var = this.L1) == null) {
            return;
        }
        d7Var.f();
        this.L1.j |= this.w1.r0();
        d7 d7Var2 = this.L1;
        ArrayList arrayList = d7Var2.T0;
        if (arrayList == null) {
            d7Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        u9 u9Var = this.w1;
        d7 d7Var3 = this.L1;
        u9Var.q0(d7Var3.T0, false, false, false, false, d7Var3);
        d7 d7Var4 = this.L1;
        if (!d7Var4.K) {
            d7Var4.S0 = Utilities.k(this.w1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.w1.getMasks();
        this.L1.U0 = masks != null ? new ArrayList(masks) : null;
        d7 d7Var5 = this.L1;
        boolean z10 = d7Var5.K;
        boolean E = d7Var5.E();
        this.L1.T0 = new ArrayList();
        u9 u9Var2 = this.w1;
        d7 d7Var6 = this.L1;
        Bitmap q02 = u9Var2.q0(d7Var6.T0, true, false, false, !z10, d7Var6);
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
        d7 d7Var7 = this.L1;
        d7Var7.P0 = null;
        d7Var7.R0 = null;
        d7Var7.Q0 = null;
        int i7 = this.c;
        org.telegram.messenger.w7.G(i7);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        d7 d7Var8 = this.L1;
        d7Var7.P0 = org.telegram.messenger.w7.J(fc.a0(q02, compressFormat, d7Var8.i0, d7Var8.j0, 87), null, true, true);
        if (q02 != null && !q02.isRecycled()) {
            q02.recycle();
        }
        d7 d7Var9 = this.L1;
        if (d7Var9.u) {
            File file4 = d7Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.L1.Y0 = null;
            }
            d7 d7Var10 = this.L1;
            long j3 = d7Var10.z0;
            if (j3 != Long.MIN_VALUE) {
                Drawable drawable = d7Var10.x0;
                if (drawable == null) {
                    drawable = x5.e(null, i7, j3, this.d2);
                }
                if (drawable != null) {
                    this.L1.Y0 = d7.w(i7, "webp");
                    d7 d7Var11 = this.L1;
                    Bitmap createBitmap = Bitmap.createBitmap(d7Var11.i0, d7Var11.j0, Bitmap.Config.ARGB_8888);
                    d7.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
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
        d7 d7Var12 = this.L1;
        if (d7Var12.u) {
            File file5 = d7Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                this.L1.X0 = null;
            }
            d7 d7Var13 = this.L1;
            if (d7Var13.u && d7Var13.K) {
                int i10 = d7Var13.k0;
                int i11 = d7Var13.l0;
                tg.u0 p02 = this.w1.p0();
                if (p02 != null) {
                    tg.p0 p0Var = p02.s0;
                    if (p0Var.getChildCount() == 1 && i10 > 0 && i11 > 0) {
                        int i12 = 0;
                        if ((p0Var.getChildAt(0) instanceof org.telegram.ui.Cells.q1) && (photoImage = ((org.telegram.ui.Cells.q1) p0Var.getChildAt(0)).getPhotoImage()) != null) {
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
                                        this.L1.X0 = d7.w(i7, "webp");
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
            u9 u9Var3 = this.w1;
            ArrayList arrayList2 = new ArrayList();
            d7 d7Var14 = this.L1;
            int i16 = d7Var14.i0;
            Bitmap q03 = u9Var3.q0(arrayList2, false, true, false, false, d7Var14);
            d7 d7Var15 = this.L1;
            org.telegram.messenger.w7.G(i7);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            d7 d7Var16 = this.L1;
            d7Var15.R0 = org.telegram.messenger.w7.J(fc.a0(q03, compressFormat2, d7Var16.i0, d7Var16.j0, 87), null, true, true);
            if (q03 != null && !q03.isRecycled()) {
                q03.recycle();
            }
        }
        if (this.w1.y0.getPainting().E) {
            Bitmap blurBitmap = this.w1.getBlurBitmap();
            d7 d7Var17 = this.L1;
            org.telegram.messenger.w7.G(i7);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            d7 d7Var18 = this.L1;
            d7Var17.Q0 = org.telegram.messenger.w7.J(fc.a0(blurBitmap, compressFormat3, d7Var18.i0, d7Var18.j0, 87), null, true, true);
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
        ca caVar;
        float f11;
        int i10;
        da daVar;
        int i11;
        float f12;
        d7 d7Var;
        ImageView imageView;
        int i12;
        int i13;
        float f13;
        float f14;
        md0 md0Var;
        kd0 kd0Var;
        ImageView imageView2;
        int i14;
        d7 d7Var2;
        u9 u9Var;
        u9 u9Var2;
        int i15 = this.h0;
        if (i15 == i7 && !z10) {
            return;
        }
        ia iaVar = this.d1;
        if (i7 != -1 && iaVar != null && iaVar.O1) {
            return;
        }
        this.h0 = i7;
        AnimatorSet animatorSet = this.s2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s2 = null;
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.q0;
        cb cbVar = this.a1;
        u0 u0Var = this.f1;
        l2 l2Var = this.o0;
        n5 n5Var = this.k1;
        fh0 fh0Var = this.h1;
        if (i15 != i7) {
            if (i7 == -1) {
                l2Var.setVisibility(0);
                iaVar.setVisibility(0);
                u9 u9Var3 = this.w1;
                if (u9Var3 != null) {
                    u9Var3.A0(null, true);
                }
                u0Var.setVisibility(0);
                d7 d7Var3 = this.L1;
                if (d7Var3 == null || !d7Var3.u) {
                    ImageView imageView3 = this.j1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    F().setVisibility(0);
                    n0(false);
                }
                j5Var.setVisibility(0);
                if (this.P1 == 1) {
                    fh0Var.setVisibility(0);
                    n5Var.setVisibility(0);
                } else {
                    d7 d7Var4 = this.L1;
                    if (d7Var4 != null && !TextUtils.isEmpty(d7Var4.y)) {
                        fh0Var.setVisibility(8);
                        n5Var.setVisibility(0);
                    }
                }
                cbVar.setVisibility(0);
            }
            if (i7 == 0 && (u9Var2 = this.w1) != null) {
                u9Var2.setVisibility(0);
            }
            if ((i7 == 0 || i15 == 0) && (u9Var = this.w1) != null) {
                u9Var.N0.setLayerType(2, null);
            }
            u9 u9Var4 = this.w1;
            if (u9Var4 != null) {
                u9Var4.y1.b(i7 != 0);
            }
            iaVar.M.b(i7 != -1);
            xb.e();
            if (this.C1 != null && i15 == 1) {
                h(null);
            }
            sd0 sd0Var = this.D1;
            if (sd0Var != null) {
                sd0Var.setAllowTouch(false);
            }
            this.l1.f(true);
            ra raVar = this.n;
            ga gaVar = this.Y0;
            Activity activity = this.b;
            if (i7 == 3) {
                if (this.s1 == null) {
                    ca caVar2 = new ca(this, activity, gaVar);
                    this.s1 = caVar2;
                    raVar.addView(caVar2.d);
                    raVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
                d7 d7Var5 = this.L1;
                if (d7Var5 != null) {
                    this.s1.setEntry(d7Var5);
                }
            } else if (i15 == 3) {
                gaVar.b();
                ca caVar3 = this.s1;
                if (caVar3 != null) {
                    caVar3.a.setCropEditorDrawing(caVar3);
                    caVar3.E = true;
                }
            }
            if (i7 == 4) {
                if (this.t1 == null) {
                    da daVar2 = new da(this, activity, gaVar);
                    this.t1 = daVar2;
                    raVar.addView(daVar2.e);
                    raVar.addView(this.t1);
                }
                this.t1.setVisibility(0);
            } else if (i15 == 4) {
                gaVar.b();
                da daVar3 = this.t1;
                if (daVar3 != null) {
                    daVar3.F = true;
                }
            }
        }
        this.c1.b((i7 == -1 || i7 == 2) && this.J > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        td0 td0Var = this.C1;
        boolean z13 = td0Var == null && i7 == 1;
        float f15 = 1.0f;
        if (i7 == 1) {
            r();
            td0 td0Var2 = this.C1;
            this.w2 = td0Var2;
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
                this.w2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(td0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.C1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i7 != 0) {
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
                caVar = this.s1;
                if (caVar == null) {
                    og.f fVar = caVar.h;
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
                        ofFloat.addUpdateListener(new e9(this, 1));
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
                            ofFloat2.addUpdateListener(new e9(this, i10));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    f11 = 52.0f;
                    i10 = 2;
                }
                daVar = this.t1;
                if (daVar != null) {
                    og.f fVar4 = daVar.n;
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
                        ofFloat3.addUpdateListener(new e9(this, 3));
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
                        ofFloat4.addUpdateListener(new e9(this, 4));
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
                        arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property13, ((i7 != -1 || i7 == 2) && (this.P1 == i11 || !((d7Var = this.L1) == null || TextUtils.isEmpty(d7Var.y)))) ? 1.0f : f10));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i7 != -1 || i7 == 2) ? 1.0f : f10));
                        imageView = this.j1;
                        if (imageView != null) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i7 == -1 || i7 == 2) && (d7Var2 = this.L1) != null && d7Var2.u) ? 1.0f : f10));
                        } else {
                            i12 = 1;
                        }
                        int i16 = this.g0;
                        float[] fArr12 = new float[i12];
                        fArr12[0] = ((i16 != i12 || i16 == 2) && i7 == -1) ? 1.0f : f10;
                        arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property13, fArr12));
                        ea eaVar = this.i0;
                        if (i7 == i12) {
                            eaVar.setPivotY(eaVar.getMeasuredHeight() * 0.2f);
                            i13 = org.telegram.messenger.g0.L(164.0f);
                        } else if (i7 == 0) {
                            eaVar.setPivotY(eaVar.getMeasuredHeight() * 0.6f);
                            i13 = org.telegram.messenger.g0.L(40.0f);
                        } else if (i7 == 2) {
                            eaVar.setPivotY(f10);
                            i13 = cbVar.getContentHeight() + org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i13 = 0;
                        }
                        if (i13 > 0) {
                            f13 = (r10 - i13) / (eaVar.getHeight() - ((int) eaVar.getPivotY()));
                        } else {
                            f13 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(eaVar, (Property<ea, Float>) View.SCALE_X, f13));
                        arrayList.add(ObjectAnimator.ofFloat(eaVar, (Property<ea, Float>) View.SCALE_Y, f13));
                        if (i7 == -1) {
                            f14 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(eaVar, (Property<ea, Float>) View.TRANSLATION_Y, 0.0f));
                        } else {
                            f14 = 0.0f;
                        }
                        md0Var = this.G1;
                        if (md0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(md0Var, (Property<md0, Float>) property13, i7 == 1 ? 1.0f : f14));
                        }
                        kd0Var = this.F1;
                        if (kd0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(kd0Var, (Property<kd0, Float>) property13, i7 == 1 ? 1.0f : f14));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(iaVar, (Property<ia, Float>) property13, i7 == -1 ? 1.0f : f14));
                        float[] fArr13 = {(i7 != -1 || i7 == 2) ? 1.0f : f14};
                        bi.g2 g2Var = this.m0;
                        arrayList.add(ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) property14, (i7 != -1 || i7 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
                        if (i7 != -1 && i7 != 2) {
                            f15 = f14;
                        }
                        FrameLayout frameLayout3 = this.Z0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f15));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i7 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + iaVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.k0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i7 == 2 ? -90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property15, i7 == 2 ? 90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property15, i7 == 2 ? 90.0f : f14));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property15, i7 == 2 ? 90.0f : f14));
                        imageView2 = this.j1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i7 == 2 ? 90.0f : f14));
                        }
                        if (this.s0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i14 = 0;
                            ofFloat5.addUpdateListener(new t9(this, i14));
                            arrayList.add(ofFloat5);
                        } else {
                            i14 = 0;
                        }
                        if (cbVar != null) {
                            d7 d7Var6 = this.L1;
                            boolean z14 = (d7Var6 == null || !d7Var6.v() || !this.L1.t() || i7 == 2) ? 1 : i14;
                            if (cbVar.k0 != z14 || !z11) {
                                cbVar.k0 = z14;
                                if (!z11) {
                                    cbVar.j0.f(z14, true);
                                }
                                cbVar.invalidate();
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
                        this.s2.setInterpolator(er.h);
                        this.s2.addListener(new r9(this, i15, i7, 1));
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
                arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property13, ((i7 != -1 || i7 == 2) && (this.P1 == i11 || !((d7Var = this.L1) == null || TextUtils.isEmpty(d7Var.y)))) ? 1.0f : f10));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i7 != -1 || i7 == 2) ? 1.0f : f10));
                imageView = this.j1;
                if (imageView != null) {
                }
                int i162 = this.g0;
                float[] fArr122 = new float[i12];
                fArr122[0] = ((i162 != i12 || i162 == 2) && i7 == -1) ? 1.0f : f10;
                arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property13, fArr122));
                ea eaVar2 = this.i0;
                if (i7 == i12) {
                }
                if (i13 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(eaVar2, (Property<ea, Float>) View.SCALE_X, f13));
                arrayList.add(ObjectAnimator.ofFloat(eaVar2, (Property<ea, Float>) View.SCALE_Y, f13));
                if (i7 == -1) {
                }
                md0Var = this.G1;
                if (md0Var != null) {
                }
                kd0Var = this.F1;
                if (kd0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(iaVar, (Property<ia, Float>) property13, i7 == -1 ? 1.0f : f14));
                float[] fArr132 = {(i7 != -1 || i7 == 2) ? 1.0f : f14};
                bi.g2 g2Var2 = this.m0;
                arrayList.add(ObjectAnimator.ofFloat(g2Var2, (Property<bi.g2, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(g2Var2, (Property<bi.g2, Float>) property142, (i7 != -1 || i7 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
                if (i7 != -1) {
                    f15 = f14;
                }
                FrameLayout frameLayout32 = this.Z0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f15));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i7 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + iaVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.k0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i7 == 2 ? -90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property152, i7 == 2 ? 90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property152, i7 == 2 ? 90.0f : f14));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property152, i7 == 2 ? 90.0f : f14));
                imageView2 = this.j1;
                if (imageView2 != null) {
                }
                if (this.s0.c()) {
                }
                if (cbVar != null) {
                }
                if (!z11) {
                }
            }
        }
        z12 = z13;
        if (i7 != 0) {
        }
        caVar = this.s1;
        if (caVar == null) {
        }
        daVar = this.t1;
        if (daVar != null) {
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
        arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property132, ((i7 != -1 || i7 == 2) && (this.P1 == i11 || !((d7Var = this.L1) == null || TextUtils.isEmpty(d7Var.y)))) ? 1.0f : f10));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property132, (i7 != -1 || i7 == 2) ? 1.0f : f10));
        imageView = this.j1;
        if (imageView != null) {
        }
        int i1622 = this.g0;
        float[] fArr1222 = new float[i12];
        fArr1222[0] = ((i1622 != i12 || i1622 == 2) && i7 == -1) ? 1.0f : f10;
        arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property132, fArr1222));
        ea eaVar22 = this.i0;
        if (i7 == i12) {
        }
        if (i13 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(eaVar22, (Property<ea, Float>) View.SCALE_X, f13));
        arrayList.add(ObjectAnimator.ofFloat(eaVar22, (Property<ea, Float>) View.SCALE_Y, f13));
        if (i7 == -1) {
        }
        md0Var = this.G1;
        if (md0Var != null) {
        }
        kd0Var = this.F1;
        if (kd0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(iaVar, (Property<ia, Float>) property132, i7 == -1 ? 1.0f : f14));
        float[] fArr1322 = {(i7 != -1 || i7 == 2) ? 1.0f : f14};
        bi.g2 g2Var22 = this.m0;
        arrayList.add(ObjectAnimator.ofFloat(g2Var22, (Property<bi.g2, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(g2Var22, (Property<bi.g2, Float>) property1422, (i7 != -1 || i7 == 2) ? f14 : org.telegram.messenger.g0.L(120.0f)));
        if (i7 != -1) {
        }
        FrameLayout frameLayout322 = this.Z0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f15));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i7 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + iaVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.k0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - org.telegram.messenger.g0.L(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i7 == 2 ? -90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property1522, i7 == 2 ? 90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property1522, i7 == 2 ? 90.0f : f14));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property1522, i7 == 2 ? 90.0f : f14));
        imageView2 = this.j1;
        if (imageView2 != null) {
        }
        if (this.s0.c()) {
        }
        if (cbVar != null) {
        }
        if (!z11) {
        }
    }

    public final void l() {
        d7 d7Var;
        if (this.w1 == null || (d7Var = this.L1) == null || !d7Var.u) {
            return;
        }
        File file = d7Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.L1.W0 = null;
        }
        this.L1.W0 = d7.w(this.c, "webp");
        u9 u9Var = this.w1;
        d7 d7Var2 = this.L1;
        Bitmap q02 = u9Var.q0(d7Var2.T0, false, false, true, this.P1 != 1, d7Var2);
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
        v9 v9Var;
        boolean z11 = false;
        h0(this.g0 == 0 && this.P1 == 1 && !this.J0.e && !H(), z10);
        this.H0.setSelected(this.B0.j());
        y yVar = this.J0;
        b0(this.o0, yVar == null || !yVar.e, z10);
        b0(this.F0, (this.b2 || this.P1 == -1 || this.g0 != 0 || this.Z1 == null || this.J0.e || H()) ? false : true, z10);
        b0(this.G0, (this.b2 || this.P1 == -1 || this.g0 != 0 || (v9Var = this.C0) == null || !v9Var.a || this.J0.e || this.B0.j()) ? false : true, z10);
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
        org.telegram.messenger.g0.U3(this.T0, this.P1 == -1 && this.g0 == 0, true);
        if (this.P1 == -1 && this.g0 == 0) {
            z11 = true;
        }
        org.telegram.messenger.g0.U3(this.S0, z11, true);
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
        bg.u0 u0Var = this.E;
        if (u0Var != null) {
            u0Var.c(!z10);
        }
        this.B2 = z10;
    }

    public final void n0(boolean z10) {
        ch0 ch0Var = this.i1;
        if (ch0Var != null) {
            int[] iArr = ch0Var.e;
            int i7 = 0;
            if (!z10) {
                d7 d7Var = this.L1;
                int i10 = (d7Var == null || !d7Var.y0) ? 0 : iArr[0] - 1;
                ch0Var.N(i10, false, true);
                this.i1.P(i10);
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            d7 d7Var2 = this.L1;
            if (d7Var2 != null && d7Var2.y0) {
                i7 = iArr[0];
            }
            ch0Var.P(i7);
            ch0 ch0Var2 = this.i1;
            if (ch0Var2 != null) {
                ch0Var2.start();
            }
        }
    }

    public final void o() {
        if (this.u2 < 0) {
            this.u2 = np.e1().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.v2 = arrayList;
            arrayList.add("off");
            this.v2.add("auto");
            this.v2.add("on");
            float f10 = np.e1().getFloat("frontflash_warmth", 0.9f);
            n2 n2Var = this.s;
            n2Var.o = f10;
            n2Var.n = n2.f(f10);
            n2Var.g();
            float f11 = np.e1().getFloat("frontflash_intensity", 1.0f);
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
        s8 s8Var = new s8(this, 2);
        u9 u9Var = this.w1;
        d7 d7Var = this.L1;
        if (u9Var == null || d7Var == null) {
            s8Var.run();
            return;
        }
        d7Var.f();
        boolean r02 = u9Var.r0();
        boolean z10 = u9Var.y0.getPainting().E;
        Utilities.g.c(new v8(this, u9Var, d7Var.i0, d7Var.j0, d7Var, z10, r02, s8Var, 1));
    }

    public final void p(boolean z10) {
        ga gaVar;
        if (this.d) {
            q8 q8Var = this.r0;
            if (q8Var != null) {
                q8Var.dismiss();
                this.r0 = null;
            }
            d7 d7Var = this.L1;
            long j3 = 0;
            if (d7Var != null && !d7Var.h) {
                if ((this.w && d7Var.g) || d7Var.b != 0) {
                    d7Var.j = false;
                }
                d7Var.i(false);
            }
            this.L1 = null;
            w10 w10Var = this.S;
            if (w10Var == null || (gaVar = this.Y0) == null) {
                ga gaVar2 = this.Y0;
                if (gaVar2 != null && !z10) {
                    gaVar2.set(null);
                }
                f(0.0f, z10, new s8(this, 23));
                int i7 = this.K;
                if (i7 == 1 || i7 == 0) {
                    this.n.setBackgroundColor(0);
                    this.c1.b(false, true);
                }
                ns.e().n(this, ns.r2);
                int i10 = this.c;
                ns.f(i10).n(this, ns.y5);
                ns.f(i10).n(this, ns.b3);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            u51 u51Var = gaVar.E;
            if (u51Var != null) {
                u51Var.g0();
                gaVar.E.m0();
                gaVar.E = null;
            }
            u51 u51Var2 = gaVar.y;
            if (u51Var2 != null) {
                j3 = u51Var2.S();
                gaVar.y.g0();
                gaVar.y.m0();
                gaVar.y = null;
            }
            u51 u51Var3 = gaVar.e;
            if (u51Var3 != null) {
                j3 = u51Var3.S();
                gaVar.e.g0();
                gaVar.e.m0();
                gaVar.e = null;
            }
            w10Var.a(Long.valueOf(j3), new c9(this, z10, 2), Boolean.valueOf(this.w), Long.valueOf(this.x));
        }
    }

    public final boolean p0() {
        v9 v9Var;
        if ((!this.Q1 && !this.R1) || (v9Var = this.C0) == null || !v9Var.isFrontface()) {
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
        this.C0 = new v9(this, activity, np.e1().getBoolean("stories_camera", false));
        f6 f6Var = this.P0;
        if (f6Var != null) {
            f6Var.h0 = 0.0f;
            f6Var.i0.e(true, 0.0f);
        }
        this.C0.recordHevc = !this.B0.j();
        this.C0.setThumbDrawable(z());
        this.C0.initTexture();
        this.C0.setDelegate(new b9(this, 0));
        b0(this.G0, this.C0.a && this.g0 == 0, true);
        this.H0.setTranslationX(this.C0.a ? 0.0f : org.telegram.messenger.g0.L(46.0f));
        this.B0.setCameraView(this.C0);
        if (np.e1().getInt("storyhint2", 0) < 1) {
            this.X0.w();
            np.e1().edit().putInt("storyhint2", np.e1().getInt("storyhint2", 0) + 1).apply();
        } else if ((!c1.q(this.C0.getContext()) || !np.e1().getBoolean("dualcam", c1.p(org.telegram.messenger.t0.b, false))) && this.C0.a && np.e1().getInt("storydualhint", 0) < 2) {
            this.m1.w();
        }
        if (this.D0 == null) {
            this.D0 = new b6(activity, new t8(this, 3));
        }
        this.D0.a(this.C0);
        p6 p6Var = this.E0;
        if (p6Var != null) {
            fa faVar = this.B0;
            Object blurRenderNode = faVar.getBlurRenderNode();
            p6Var.G = faVar;
            p6Var.H = blurRenderNode;
            p6Var.invalidate();
        }
    }

    public final void r() {
        d7 d7Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.C1 != null || (d7Var = this.L1) == null) {
            return;
        }
        if (d7Var.K) {
            bitmap = null;
        } else {
            if (d7Var.Z0 == null) {
                q10 = this.Y0.getPhotoBitmap();
            } else {
                b9 b9Var = new b9(this, 10);
                Point point = org.telegram.messenger.g0.q;
                q10 = d7.q(b9Var, point.x, point.y, 0, true);
            }
            bitmap = q10;
        }
        if (bitmap != null || this.L1.K) {
            k51 textureView = this.Y0.getTextureView();
            int orientation = this.Y0.getOrientation();
            d7 d7Var2 = this.L1;
            td0 td0Var = new td0(this.b, textureView, bitmap, null, orientation, d7Var2 != null ? d7Var2.a1 : null, null, 0, false, false, this.s0, this.a);
            this.C1 = td0Var;
            this.r.addView(td0Var);
            sd0 sd0Var = this.D1;
            if (sd0Var != null) {
                sd0Var.setFilterView(this.C1);
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
            kd0 blurControl = this.C1.getBlurControl();
            this.F1 = blurControl;
            if (blurControl != null) {
                this.i0.addView(blurControl);
            }
            md0 curveControl = this.C1.getCurveControl();
            this.G1 = curveControl;
            if (curveControl != null) {
                this.i0.addView(curveControl);
            }
            U();
            this.C1.getDoneTextView().setOnClickListener(new u8(this, 13));
            this.C1.getCancelTextView().setOnClickListener(new u8(this, 14));
            this.C1.getToolsView().setVisibility(8);
            this.C1.getToolsView().setAlpha(0.0f);
            this.C1.getToolsView().setTranslationY(org.telegram.messenger.g0.L(186.0f));
            this.C1.j0.setVisibility(0);
        }
    }

    public final void s(boolean z10) {
        if (this.N0 != null) {
            fa faVar = this.B0;
            if ((faVar != null && faVar.j()) == this.N0.Q) {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (this.N0 != null) {
            v();
        }
        ve veVar = this.n2;
        boolean z11 = !z10;
        fa faVar2 = this.B0;
        g3 g3Var = new g3(this, this.c, this.b, this.a, veVar, z10, z11, faVar2 != null && faVar2.j());
        this.N0 = g3Var;
        g3Var.H.setVisibility(8);
        this.N0.setMultipleOnClick(this.B0.j());
        this.N0.setMaxCount(Math.min(10, t.b() - this.B0.getFilledCount()));
        this.N0.setOnBackClickListener(new k9(this, 1));
        this.N0.setOnSelectListener(new j9(0, this, z10));
        this.N0.setOnSelectMultipleListener(new di.s1(this, 2));
        v4.a0 a0Var = this.m2;
        if (a0Var != null) {
            gi.g gVar = this.N0.e;
            gVar.B = a0Var;
            gVar.l0();
        }
        this.n.addView(this.N0, c8.ja.e(-1, -1, ns.E1));
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
        d7 d7Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        d7 d7Var2;
        sg.u0 renderView;
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
        d7 d7Var3 = this.L1;
        Bitmap decodeFile = (d7Var3 == null || !(d7Var3.c || d7Var3.g || this.I1 != null) || (file3 = d7Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        d7 d7Var4 = this.L1;
        if (d7Var4 == null || (!(d7Var4.c || d7Var4.g || this.I1 != null) || (file2 = d7Var4.Q0) == null)) {
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
                d7Var = this.L1;
                if (d7Var != null || d7Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = d7Var != null ? file : d7Var.L;
                if (d7Var == null && d7Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (d7Var != null || d7Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.Y0.getOrientation();
                d7Var2 = this.L1;
                Object obj2 = obj;
                if (d7Var2 != null) {
                    obj2 = d7Var2.T0;
                }
                ?? r13 = obj2;
                xe xeVar = new xe();
                w5 w5Var = this.t0;
                ga gaVar = this.Y0;
                Activity activity = this.b;
                boolean z15 = z12;
                u9 u9Var = new u9(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, d7Var2, measuredWidth, measuredHeight, xeVar, this.s0, this.a, w5Var, gaVar);
                this.w1 = u9Var;
                d7 d7Var5 = this.L1;
                u9Var.setHasAudio(d7Var5 == null && d7Var5.y != null);
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
                this.w1.setOnDoneButtonClickedListener(new s8(this, 21));
                this.w1.setOnCancelButtonClickedListener(new s8(this, 22));
                u9 u9Var2 = this.w1;
                u9Var2.B0.setVisibility(0);
                u9Var2.y0.setVisibility(0);
                u9Var2.z0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.i0.getMeasuredWidth();
        int measuredHeight2 = this.i0.getMeasuredHeight();
        d7Var = this.L1;
        if (d7Var != null) {
        }
        file = null;
        z11 = false;
        if (d7Var != null) {
        }
        if (d7Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (d7Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.Y0.getOrientation();
        d7Var2 = this.L1;
        Object obj22 = obj;
        if (d7Var2 != null) {
        }
        ?? r132 = obj22;
        xe xeVar2 = new xe();
        w5 w5Var2 = this.t0;
        ga gaVar2 = this.Y0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        u9 u9Var3 = new u9(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, d7Var2, measuredWidth2, measuredHeight2, xeVar2, this.s0, this.a, w5Var2, gaVar2);
        this.w1 = u9Var3;
        d7 d7Var52 = this.L1;
        u9Var3.setHasAudio(d7Var52 == null && d7Var52.y != null);
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
        this.w1.setOnDoneButtonClickedListener(new s8(this, 21));
        this.w1.setOnCancelButtonClickedListener(new s8(this, 22));
        u9 u9Var22 = this.w1;
        u9Var22.B0.setVisibility(0);
        u9Var22.y0.setVisibility(0);
        u9Var22.z0.setVisibility(0);
    }

    public final void u(boolean z10) {
        b6 b6Var = this.D0;
        if (b6Var != null) {
            b6Var.f = null;
            Utilities.e.a(b6Var.h);
            this.D0 = null;
            fa faVar = this.B0;
            if (faVar != null) {
                faVar.c.a(null);
            }
        }
        p6 p6Var = this.E0;
        if (p6Var != null) {
            p6Var.G = null;
            p6Var.H = null;
            p6Var.invalidate();
        }
        if (this.C0 != null) {
            if (z10) {
                a0(new s8(this, 8));
                return;
            }
            a0(new s8(this, 9));
            this.C0.destroy(true, null);
            org.telegram.messenger.g0.E2(this.C0);
            fa faVar2 = this.B0;
            if (faVar2 != null) {
                faVar2.setCameraView(null);
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
        r1.g gVar = this.p2;
        if (gVar != null) {
            gVar.d();
            this.p2 = null;
        }
        this.q2 = null;
    }

    public final void x() {
        td0 td0Var = this.C1;
        if (td0Var == null) {
            return;
        }
        td0Var.b();
        this.D1.setFilterView(null);
        this.r.removeView(this.C1);
        TextureView textureView = this.E1;
        if (textureView != null) {
            this.i0.removeView(textureView);
            this.E1 = null;
        }
        this.Y0.o(null, null);
        kd0 kd0Var = this.F1;
        if (kd0Var != null) {
            this.i0.removeView(kd0Var);
            this.F1 = null;
        }
        md0 md0Var = this.G1;
        if (md0Var != null) {
            this.i0.removeView(md0Var);
            this.G1 = null;
        }
        this.C1 = null;
    }

    public final void y() {
        u9 u9Var = this.w1;
        if (u9Var == null) {
            return;
        }
        u9Var.B0.removeAllViews();
        u9 u9Var2 = this.w1;
        u9Var2.y0.h();
        u9Var2.B0.setVisibility(8);
        u9Var2.A0.setVisibility(8);
        u9Var2.o0.postRunnable(new ai.o(15));
        a5 a5Var = u9Var2.U1;
        if (a5Var != null) {
            a5Var.dismiss();
        }
        sg.q qVar = u9Var2.D1;
        if (qVar != null) {
            qVar.dismiss();
        }
        this.r.removeView(this.w1);
        this.w1 = null;
        sg.u0 u0Var = this.x1;
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
