package bi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kb0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class ce implements NotificationCenter.NotificationCenterDelegate {
    public static ce F2;
    public final md A0;
    public View A1;
    public boolean A2;
    public bd B0;
    public sf0 B1;
    public boolean B2;
    public i8 C0;
    public final qf0 C1;
    public gd C2;
    public final x8 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final ne E0;
    public hf0 E1;
    public ValueAnimator E2;
    public xd F;
    public final oe F0;
    public jf0 F1;
    public float G;
    public final d0 G0;
    public File G1;
    public final RectF H;
    public final ne H0;
    public ArrayList H1;
    public float I;
    public final c0 I0;
    public ArrayList I1;
    public int J;
    public final re J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public r9 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public xc M0;
    public long M1;
    public long N;
    public z0 N0;
    public boolean N1;
    public boolean O;
    public final m8 O0;
    public int O1;
    public final AnimationNotificationsLocker P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final pc Q0;
    public boolean Q1;
    public Utilities.Callback4 R;
    public final k3 R0;
    public boolean R1;
    public int S;
    public final k3 S0;
    public boolean S1;
    public int T;
    public final u4 T0;
    public float T1;
    public int U;
    public final u4 U0;
    public int U1;
    public boolean V;
    public final q91 V0;
    public boolean V1;
    public boolean W;
    public final x4 W0;
    public boolean W1;
    public boolean X;
    public final nd X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final me Z0;
    public AnimatorSet Z1;
    public final zh.b a;
    public int a0;
    public final qe a1;
    public boolean a2;
    public final Activity b;
    public int b0;
    public final v7 b1;
    public boolean b2;
    public final int c;
    public final RectF c0;
    public final qd c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final oc d1;
    public boolean d2;
    public boolean e;
    public final Path e0;
    public final y0 e1;
    public Runnable e2;
    public final WindowManager f;
    public int f0;
    public hj0 f1;
    public AnimatorSet f2;
    public int g0;
    public final kj0 g1;
    public zb g2;
    public final WindowManager.LayoutParams h;
    public final kd h0;
    public hj0 h1;
    public boolean h2;
    public final FrameLayout i0;
    public ImageView i1;
    public AnimatorSet i2;
    public final LinearLayout j0;
    public final s7 j1;
    public ValueAnimator j2;
    public final FrameLayout k0;
    public final x4 k1;
    public boolean k2;
    public final ld l0;
    public final x4 l1;
    public s4.b0 l2;
    public final FrameLayout m0;
    public final x4 m1;
    public MediaController.AlbumEntry m2;
    public final be n;
    public final k3 n0;
    public final x4 n1;
    public ValueAnimator n2;
    public final j9 o0;
    public final x7 o1;
    public o1.k o2;
    public final org.telegram.ui.ActionBar.l5 p0;
    public final pe p1;
    public Boolean p2;
    public rb q0;
    public t q1;
    public dc q2;
    public final td r;
    public final org.telegram.ui.Components.ia r0;
    public id r1;
    public AnimatorSet r2;
    public final m3 s;
    public final d8 s0;
    public jd s1;
    public boolean s2;
    public final nc t0;
    public final me t1;
    public int t2;
    public boolean u0;
    public final d u1;
    public ArrayList u2;
    public boolean v;
    public long v0;
    public ad v1;
    public FrameLayout v2;
    public long w;
    public String w0;
    public og.h1 w1;
    public boolean w2;
    public sd x;
    public TLRPC.InputPeer x0;
    public View x1;
    public tb x2;
    public final kb0 y;
    public pb y0;
    public View y1;
    public s y2;
    public x z0;
    public View z1;
    public boolean z2;

    public ce(Activity activity, int i10) {
        int i11;
        zh.b bVar = new zh.b();
        this.a = bVar;
        this.w = 0L;
        this.H = new RectF();
        int i12 = 1;
        this.M = true;
        this.P = new AnimationNotificationsLocker();
        this.c0 = new RectF();
        this.d0 = new RectF();
        this.e0 = new Path();
        new Rect();
        int i13 = 0;
        this.f0 = 0;
        this.g0 = -1;
        this.y0 = new pb();
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
        sc scVar = new sc(this);
        this.d2 = true;
        this.k2 = true;
        this.t2 = -1;
        this.b = activity;
        this.c = i10;
        LaunchActivity launchActivity = LaunchActivity.G1;
        this.y = launchActivity != null ? new kb0(launchActivity, true) : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        layoutParams.flags = -2013200128;
        int i14 = 16;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        be beVar = new be(this, activity);
        this.n = beVar;
        cc ccVar = new cc(this, i12);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(beVar, ccVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        m3 m3Var = new m3(activity, windowManager, this.n, layoutParams);
        this.s = m3Var;
        m3Var.a(new ed(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        be beVar2 = this.n;
        td tdVar = new td(this, activity);
        this.r = tdVar;
        beVar2.addView(tdVar);
        td tdVar2 = this.r;
        kd kdVar = new kd(this, activity);
        this.h0 = kdVar;
        tdVar2.addView(kdVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.r0 = new org.telegram.ui.Components.ia(this.h0);
        this.s0 = new d8();
        td tdVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.i0 = frameLayout;
        tdVar3.addView(frameLayout);
        td tdVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.k0 = frameLayout2;
        tdVar4.addView(frameLayout2);
        td tdVar5 = this.r;
        ld ldVar = new ld(this, activity, 0);
        this.l0 = ldVar;
        tdVar5.addView(ldVar);
        int i15 = 8;
        this.l0.setVisibility(8);
        this.l0.setAlpha(0.0f);
        td tdVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        tdVar6.addView(frameLayout3);
        org.telegram.ui.Components.pc.a(this.n, new fa(2));
        md mdVar = new md(this, activity, this.r0, this.r, bVar);
        this.A0 = mdVar;
        be beVar3 = this.n;
        Objects.requireNonNull(beVar3);
        mdVar.setCancelGestures(new a3.d(beVar3, 29));
        this.A0.setResetState(new tb(this, 13));
        this.h0.addView(this.A0, w7.a6.e(-1, -1, 119));
        this.A0.setOnClickListener(new vb(this, 12));
        kd kdVar2 = this.h0;
        int i16 = this.J;
        kdVar2.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
        kd kdVar3 = this.h0;
        float dp = AndroidUtilities.dp(12.0f);
        g gVar = xf.k0.a;
        kdVar3.setOutlineProvider(new xf.j0(0, dp));
        this.h0.setClipToOutline(true);
        tb tbVar = new tb(this, 14);
        qf0 qf0Var = new qf0(activity);
        qf0Var.a = new TextPaint(1);
        qf0Var.b = new TextPaint(1);
        wr wrVar = wr.h;
        qf0Var.s = new org.telegram.ui.Components.d6(qf0Var, 0L, 350L, wrVar);
        qf0Var.I = new kc0(qf0Var, 7);
        qf0Var.x = tbVar;
        this.C1 = qf0Var;
        nd ndVar = new nd(this, activity, this.r0, this.s0);
        this.X0 = ndVar;
        ndVar.setCollageView(this.A0);
        nd ndVar2 = this.X0;
        ndVar2.v = new tb(this, 15);
        ndVar2.setOnTapListener(new tb(this, i14));
        this.X0.setVisibility(8);
        nd ndVar3 = this.X0;
        ndVar3.N = new tb(this, 17);
        this.h0.addView(ndVar3, w7.a6.e(-1, -1, 119));
        this.h0.addView(this.C1, w7.a6.e(-1, -1, 119));
        be beVar4 = this.n;
        qd qdVar = new qd(this, activity, beVar4, beVar4, this.r, bVar, this.r0);
        this.c1 = qdVar;
        qdVar.setAccount(i10);
        int i17 = 6;
        this.c1.setUiBlurBitmap(new cc(this, i17));
        org.telegram.ui.Components.pc.a(this.l0, new rd(this, i13));
        this.c1.setOnHeightUpdate(new ub(this, 13));
        this.c1.setOnPeriodUpdate(new ub(this, 4));
        long j3 = this.N;
        if (j3 != 0) {
            this.c1.setDialogId(j3);
        }
        this.c1.setOnPremiumHint(new ub(this, 5));
        this.c1.setOnKeyboardOpen(new ub(this, i17));
        nc ncVar = new nc(this, activity, i13);
        this.t0 = ncVar;
        this.r.addView(ncVar);
        me meVar = new me(activity, this.r, this.h0, bVar, this.r0);
        this.Z0 = meVar;
        meVar.setOnTimelineClick(new tb(this, 10));
        this.Z0.setOnHeightChange(new tb(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f7 = 388;
        frameLayout4.addView(this.Z0, w7.a6.d(-1, f7, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        qe qeVar = new qe(activity);
        this.a1 = qeVar;
        qeVar.setVisibility(8);
        this.a1.a(false);
        this.Y0.addView(this.a1, w7.a6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.l0.addView(this.Y0, w7.a6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.l0.addView(this.c1, w7.a6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        me meVar2 = new me(activity, this.r, this.h0, bVar, this.r0);
        this.t1 = meVar2;
        meVar2.X0 = true;
        meVar2.setVisibility(8);
        this.t1.setAlpha(0.0f);
        this.l0.addView(this.t1, w7.a6.d(-1, f7, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        oc ocVar = new oc(this, activity, bVar, this.r0);
        this.d1 = ocVar;
        ocVar.setVisibility(8);
        this.l0.addView(this.d1, w7.a6.e(-1, -2, 85));
        k3 k3Var = new k3(activity);
        this.n0 = k3Var;
        k3Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        k3 k3Var2 = this.n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        k3Var2.setScaleType(scaleType);
        this.n0.setImageResource(R.drawable.msg_photo_back);
        k3 k3Var3 = this.n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        k3Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.n0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.n0.setOnClickListener(new vb(this, i12));
        this.i0.addView(this.n0, w7.a6.e(56, 56, 51));
        this.s.a(this.n0);
        j9 j9Var = new j9(activity, i10);
        this.o0 = j9Var;
        j9Var.a(false, false);
        this.o0.setOnClickListener(new n3(2, this, activity));
        this.i0.addView(this.o0, w7.a6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.p0 = l5Var;
        l5Var.setTextSize(20);
        this.p0.setGravity(19);
        this.p0.setTextColor(-1);
        this.p0.setTypeface(AndroidUtilities.bold());
        this.p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.p0.setAlpha(0.0f);
        this.p0.setVisibility(8);
        this.p0.setEllipsizeByGradient(true);
        this.p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.i0.addView(this.p0, w7.a6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.j0.setGravity(5);
        this.i0.addView(this.j0, w7.a6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        ub ubVar = new ub(this, 7);
        be beVar5 = this.n;
        y0 y0Var = new y0(activity);
        y0Var.w = true;
        y0Var.x = true;
        y0Var.h = ubVar;
        y0Var.a = i10;
        y0Var.b = beVar5;
        y0Var.setScaleType(scaleType);
        y0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        y0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        y0Var.setVisibility(8);
        y0Var.setAlpha(0.0f);
        y0Var.setOnClickListener(new ai.u(y0Var, 4));
        y0Var.f = new zp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        y0Var.d();
        this.e1 = y0Var;
        x4 x4Var = new x4(activity, 1);
        x4Var.l(1.0f, -71.0f);
        x4Var.d = 2000L;
        x4Var.U = false;
        x4Var.H.o(true, false, false);
        this.k1 = x4Var;
        x4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.k1, w7.a6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        kj0 kj0Var = new kj0(activity);
        this.g1 = kj0Var;
        kj0Var.setScaleType(scaleType);
        kj0 kj0Var2 = this.g1;
        r9 r9Var = this.K1;
        kj0Var2.setImageResource((r9Var == null || !r9Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.g1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.g1.setOnClickListener(new vb(this, 2));
        this.g1.setVisibility(8);
        this.g1.setAlpha(0.0f);
        s7 s7Var = new s7(activity);
        this.j1 = s7Var;
        s7Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.j1.setVisibility(8);
        this.j1.setAlpha(0.0f);
        this.j1.setOnClickListener(new vb(this, 3));
        this.j0.addView(this.j1, w7.a6.q(46, 56, 53));
        this.j0.addView(this.g1, w7.a6.q(46, 56, 53));
        this.j0.addView(this.e1, w7.a6.e(46, 56, 53));
        ne neVar = new ne(activity);
        this.E0 = neVar;
        neVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.E0.setOnClickListener(new vb(this, 4));
        this.E0.setOnLongClickListener(new l6(this, i12));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.s.a(this.E0);
        this.i0.addView(this.E0, w7.a6.e(56, 56, 53));
        oe oeVar = new oe(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = oeVar;
        oeVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new vb(this, 5));
        boolean q6 = i1.q(activity);
        this.F0.setVisibility(q6 ? 0 : 8);
        this.F0.setAlpha(q6 ? 1.0f : 0.0f);
        this.s.a(this.F0);
        this.i0.addView(this.F0, w7.a6.e(56, 56, 53));
        d0 d0Var = new d0(activity);
        this.G0 = d0Var;
        d0Var.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        if (this.z0 == null) {
            i11 = 6;
            this.z0 = (x) x.a().get(6);
        } else {
            i11 = 6;
        }
        this.G0.setOnClickListener(new vb(this, i11));
        this.G0.a(new y(this.z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.s.a(this.G0);
        this.i0.addView(this.G0, w7.a6.e(56, 56, 53));
        ne neVar2 = new ne(activity);
        this.H0 = neVar2;
        neVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.H0.a(new y(new x("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new vb(this, 7));
        this.s.a(this.H0);
        this.i0.addView(this.H0, w7.a6.e(56, 56, 53));
        c0 c0Var = new c0(activity, this.s);
        this.I0 = c0Var;
        c0Var.a.u0(6);
        this.I0.setSelected((x) null);
        this.I0.setOnLayoutClick(new ub(this, i15));
        this.i0.addView(this.I0, w7.a6.e(-1, 56, 53));
        x4 x4Var2 = new x4(activity, 1);
        x4Var2.l(1.0f, -20.0f);
        x4Var2.d = 5000L;
        x4Var2.i();
        x4Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        x4Var2.l0 = new f0(3);
        this.l1 = x4Var2;
        x4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.l1, w7.a6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        x4 x4Var3 = new x4(activity, 2);
        x4Var3.l(0.0f, 28.0f);
        x4Var3.d = 5000L;
        x4Var3.p(true);
        this.m1 = x4Var3;
        this.i0.addView(x4Var3, w7.a6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        x4 x4Var4 = new x4(activity, 1);
        x4Var4.l(1.0f, -20.0f);
        x4Var4.d = 5000L;
        x4Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.n1 = x4Var4;
        x4Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.n1, w7.a6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        re reVar = new re(activity);
        Paint paint = new Paint(1);
        reVar.a = paint;
        Paint paint2 = new Paint(1);
        reVar.b = paint2;
        reVar.e = new org.telegram.ui.Components.d6(reVar, 0L, 250L, wrVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        reVar.c = n6Var;
        n6Var.k(0.3f, 250L, wrVar);
        n6Var.t(AndroidUtilities.dp(13.0f));
        n6Var.r(-1);
        n6Var.u(AndroidUtilities.bold());
        n6Var.setCallback(reVar);
        n6Var.b = 1;
        reVar.a(0L, false);
        this.J0 = reVar;
        i0(false, false);
        this.i0.addView(this.J0, w7.a6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        m8 m8Var = new m8(activity);
        this.O0 = m8Var;
        m8Var.setDelegate(scVar);
        m8 m8Var2 = this.O0;
        boolean z10 = this.O1 == 1;
        m8Var2.n0 = -1.0f;
        m8Var2.o0 = z10;
        m8Var2.invalidate();
        this.k0.addView(this.O0, w7.a6.e(-1, 100, 87));
        this.s.a(this.O0);
        this.O0.e(this.A0.j() ? this.A0.getFilledProgress() : 0.0f, true);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.k0.addView(this.P0, w7.a6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new vb(this, 8));
        x4 x4Var5 = new x4(activity, 3);
        x4Var5.p(true);
        x4Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        x4Var5.h = AndroidUtilities.dp(320.0f);
        x4Var5.d = 5000L;
        x4Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = x4Var5;
        this.k0.addView(x4Var5, w7.a6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        q91 q91Var = new q91(activity);
        this.V0 = q91Var;
        q91Var.M = false;
        q91Var.setAlpha(0.0f);
        this.k0.addView(this.V0, w7.a6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new cc(this, 4));
        q91 q91Var2 = this.V0;
        this.T1 = 0.0f;
        q91Var2.b(0.0f, false);
        int i18 = 12;
        x8 x8Var = new x8(activity, i10, new tb(this, i18));
        this.D0 = x8Var;
        x8Var.c = new ub(this, 9);
        this.k0.addView(x8Var, w7.a6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        pc pcVar = new pc(this, activity);
        this.Q0 = pcVar;
        int i19 = 10;
        pcVar.setOnSwitchModeListener(new ub(this, i19));
        int i20 = 11;
        this.Q0.setOnSwitchingModeListener(new ub(this, i20));
        this.m0.addView(this.Q0, w7.a6.e(-1, 48, 55));
        this.s.a(this.Q0);
        k3 k3Var4 = new k3(activity);
        this.R0 = k3Var4;
        k3Var4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.a6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.R0);
        this.R0.setOnClickListener(new vb(this, 9));
        k3 k3Var5 = new k3(activity);
        this.S0 = k3Var5;
        k3Var5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.a6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new vb(this, i19));
        u4 u4Var = new u4(activity);
        this.T0 = u4Var;
        this.m0.addView(u4Var, w7.a6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.T0);
        u4 u4Var2 = new u4(activity);
        this.U0 = u4Var2;
        u4Var2.a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        u4Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.a6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.u1 = dVar2;
        dVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.u1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.u1.setOnClickListener(new vb(this, i20));
        this.m0.addView(this.u1, w7.a6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        v7 v7Var = new v7(activity);
        v7Var.b = new ArrayList();
        v7Var.e = true;
        v7Var.h = true;
        View view = new View(activity);
        v7Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        v7Var.addView(view, w7.a6.e(-1, -1, 119));
        v7Var.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        v7Var.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        v7Var.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        v7Var.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        v7Var.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        v7Var.d = string;
        v7Var.e = true;
        u7 u7Var = new u7(v7Var, activity, string, true);
        v7Var.c = u7Var;
        u7Var.setContentDescription(LocaleController.getString(R.string.Send));
        v7Var.addView(v7Var.c, w7.a6.c(-2.0f, -2));
        v7Var.e();
        this.b1 = v7Var;
        v7Var.setVisibility(8);
        this.b1.setOnClickListener(new ub(this, i18));
        this.m0.addView(this.b1, w7.a6.e(-1, 52, 23));
        pe peVar = new pe(activity);
        this.p1 = peVar;
        peVar.setAlpha(0.0f);
        this.p1.setVisibility(8);
        this.h0.addView(this.p1, w7.a6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        x7 x7Var = new x7(activity, i10, bVar);
        this.o1 = x7Var;
        this.h0.addView(x7Var, w7.a6.e(-1, -1, 119));
        m0(false);
    }

    public static ce E(Activity activity, int i10) {
        ce ceVar = F2;
        if (ceVar != null && (ceVar.b != activity || ceVar.c != i10)) {
            ceVar.q(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new ce(activity, i10);
        }
        return F2;
    }

    public static void a(ce ceVar) {
        bd bdVar = ceVar.B0;
        if (bdVar == null || bdVar.getTextureView() == null) {
            ceVar.c2 = false;
            return;
        }
        Bitmap bitmap = ceVar.B0.getTextureView().getBitmap();
        if (bitmap == null) {
            ceVar.c2 = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = 0;
            while (i11 < 10) {
                i11++;
                f7 += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i10 + 1) * width, i11 * height));
            }
        }
        float f10 = f7 / 100.0f;
        bitmap.recycle();
        ceVar.c2 = f10 < 0.22f;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(ce ceVar) {
        Activity activity = ceVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            r4 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
            if (r4) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
            }
        } else if (i10 >= 23) {
            r4 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
            if (r4) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
            }
        }
        return !r4;
    }

    public static void c(ce ceVar) {
        ValueAnimator valueAnimator = ceVar.j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            ceVar.j2 = null;
        }
        int i10 = 0;
        ceVar.k2 = false;
        td tdVar = ceVar.r;
        float f7 = tdVar.a;
        float f10 = tdVar.b;
        tdVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ceVar.j2 = ofFloat;
        ofFloat.addUpdateListener(new kc(ceVar, f7, f10, i10));
        ceVar.j2.setDuration(340L);
        ceVar.j2.setInterpolator(wr.h);
        ceVar.j2.addListener(new vc(ceVar, i10));
        ceVar.j2.start();
    }

    public static boolean d(ce ceVar) {
        Activity activity = ceVar.b;
        if (Build.VERSION.SDK_INT < 23 || activity == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
        return false;
    }

    public static SpannableString n(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable mutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int dp = AndroidUtilities.dp(35.0f);
        int i10 = -dp;
        mutate.setBounds(i10 / 4, i10, (dp / 4) * 3, 0);
        spannableString.setSpan(new fd(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        ce ceVar = F2;
        if (ceVar != null) {
            ceVar.q(false);
        }
        F2 = null;
    }

    public final Drawable A() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        return bitmap != null ? new BitmapDrawable(bitmap) : this.b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        r9 r9Var = this.K1;
        if (r9Var != null) {
            return r9Var.r();
        }
        return 1;
    }

    public final String C() {
        bd bdVar = this.B0;
        if (bdVar == null || bdVar.getCameraSession() == null) {
            return null;
        }
        if (!this.B0.isFrontface() || this.B0.getCameraSession().hasFlashModes()) {
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        p();
        return (String) this.u2.get(this.t2);
    }

    public final z0 D() {
        if (this.N0 == null) {
            z0 z0Var = new z0(this.b);
            this.N0 = z0Var;
            this.k0.addView(z0Var, w7.a6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String F() {
        bd bdVar = this.B0;
        if (bdVar == null || bdVar.getCameraSession() == null) {
            return null;
        }
        if (!this.B0.isFrontface() || this.B0.getCameraSession().hasFlashModes()) {
            return this.B0.getCameraSession().getNextFlashMode();
        }
        p();
        ArrayList arrayList = this.u2;
        return (String) arrayList.get(this.t2 + 1 >= arrayList.size() ? 0 : this.t2 + 1);
    }

    public final ImageView G() {
        if (this.i1 == null) {
            hj0 hj0Var = new hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.h1 = hj0Var;
            hj0Var.h = true;
            r9 r9Var = this.K1;
            if (r9Var == null || !r9Var.y0) {
                hj0Var.P(0);
                this.h1.M(0);
            } else {
                hj0Var.M(35);
                this.h1.P(36);
            }
            this.h1.a0 = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J9, this.a);
            this.h1.Q(v02, "Sunny");
            this.h1.Q(v02, "Path 6");
            this.h1.Q(v02, "Path");
            this.h1.Q(v02, "Path 5");
            this.h1.o();
            ImageView imageView = new ImageView(this.b);
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.i1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
            this.i1.setOnClickListener(new vb(this, 0));
            this.i1.setVisibility(8);
            this.i1.setImageDrawable(this.h1);
            this.i1.setAlpha(0.0f);
            this.j0.addView(this.i1, 0, w7.a6.q(46, 56, 53));
        }
        return this.i1;
    }

    public final void H() {
        ad adVar = this.v1;
        if (adVar == null) {
            return;
        }
        this.v2 = null;
        adVar.getTopLayout().setAlpha(0.0f);
        this.v1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.v1.getBottomLayout().setAlpha(0.0f);
        this.v1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.v1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.v1.setVisibility(8);
    }

    public final boolean I() {
        return !this.a2 && (this.A0.j() ? this.A0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean J() {
        xc xcVar;
        if (this.W || (xcVar = this.M0) == null) {
            return false;
        }
        return xcVar.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(int i10, boolean z10) {
        r9 r9Var;
        r9 r9Var2;
        d dVar;
        org.telegram.ui.ActionBar.l5 l5Var;
        int i11;
        int i12;
        float dp;
        ImageView imageView;
        r9 r9Var3;
        r9 r9Var4;
        r9 r9Var5;
        r9 r9Var6;
        bd bdVar;
        int i13 = this.f0;
        if (i10 == i13) {
            return;
        }
        this.f0 = i10;
        AnimatorSet animatorSet = this.i2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        O(i13, i10);
        v7 v7Var = this.b1;
        if (v7Var != null) {
            v7Var.b(i10 == 1, z10);
        }
        c0 c0Var = this.I0;
        i0(i10 == 0 && this.O1 == 1 && !c0Var.e && !I(), z10);
        if (i10 != 1) {
            this.a1.a(z10);
        }
        c0(this.n0, !c0Var.e, z10);
        c0(this.E0, (this.a2 || i10 != 0 || c0Var.e || this.Y1 == null || I()) ? false : true, z10);
        boolean z11 = this.a2;
        md mdVar = this.A0;
        c0(this.F0, (z11 || i10 != 0 || (bdVar = this.B0) == null || !bdVar.a || c0Var.e || mdVar.j()) ? false : true, true);
        c0(this.G0, (this.a2 || i10 != 0 || c0Var.e) ? false : true, z10);
        m0(z10);
        y0 y0Var = this.e1;
        s7 s7Var = this.j1;
        kj0 kj0Var = this.g1;
        me meVar = this.t1;
        me meVar2 = this.Z0;
        d dVar2 = this.u1;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.p0;
        qd qdVar = this.c1;
        u4 u4Var = this.U0;
        u4 u4Var2 = this.T0;
        x8 x8Var = this.D0;
        nd ndVar = this.X0;
        ld ldVar = this.l0;
        pc pcVar = this.Q0;
        m8 m8Var = this.O0;
        if (!z10) {
            bd bdVar2 = this.B0;
            if (bdVar2 != null) {
                bdVar2.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            }
            ndVar.setAlpha(((i10 != 1 || mdVar.j()) && i10 != 2) ? 0.0f : 1.0f);
            mdVar.setAlpha((i10 == 0 || (i10 == 1 && mdVar.j())) ? 1.0f : 0.0f);
            m8Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            m8Var.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            x8Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            pcVar.setAlpha((i10 != 0 || I()) ? 0.0f : 1.0f);
            pcVar.setTranslationY((i10 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            u4Var2.setAlpha((i10 == 0 && this.a2 && !I()) ? 1.0f : 0.0f);
            u4Var.setAlpha((i10 == 0 && !this.a2 && I()) ? 0.6f : 0.0f);
            ldVar.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
            ldVar.setTranslationY((i10 == 1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            qdVar.setAlpha(i10 == 2 ? 0.0f : 1.0f);
            kj0Var.setAlpha((i10 == 1 && this.O1 == 1) ? 1.0f : 0.0f);
            s7Var.setAlpha((i10 != 1 || (this.O1 != 1 && ((r9Var2 = this.K1) == null || TextUtils.isEmpty(r9Var2.y)))) ? 0.0f : 1.0f);
            int i14 = 1;
            y0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.i1;
            if (imageView2 != null) {
                imageView2.setAlpha((i10 == 1 && (r9Var = this.K1) != null && r9Var.u) ? 1.0f : 0.0f);
                i14 = 1;
            }
            meVar2.setAlpha(i10 == i14 ? 1.0f : 0.0f);
            meVar.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            l5Var2.setAlpha((i10 == i14 || i10 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            N(i13, i10);
            return;
        }
        this.i2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        bd bdVar3 = this.B0;
        if (bdVar3 != null) {
            dVar = dVar2;
            l5Var = l5Var2;
            i11 = 1;
            arrayList.add(ObjectAnimator.ofFloat(bdVar3, (Property<bd, Float>) View.ALPHA, i10 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            l5Var = l5Var2;
            i11 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i11];
        fArr[0] = ((i10 != i11 || mdVar.j()) && i10 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(ndVar, (Property<nd, Float>) property, fArr));
        float[] fArr2 = new float[i11];
        fArr2[0] = (i10 == 0 || (i10 == i11 && mdVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(mdVar, (Property<md, Float>) property, fArr2));
        float[] fArr3 = new float[i11];
        fArr3[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(m8Var, (Property<m8, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i11];
        fArr4[0] = i10 == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(m8Var, (Property<m8, Float>) property2, fArr4));
        float[] fArr5 = new float[i11];
        fArr5[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(x8Var, (Property<x8, Float>) property, fArr5));
        float[] fArr6 = new float[i11];
        fArr6[0] = (i10 != 0 || I()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(pcVar, (Property<pc, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(pcVar, (Property<pc, Float>) property2, (i10 != 0 || I()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u4Var2, (Property<u4, Float>) property, (i10 == 0 && this.a2 && !I()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u4Var, (Property<u4, Float>) property, (i10 == 0 && !this.a2 && I()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ldVar, (Property<ld, Float>) property, ((i10 == 1 && ((r9Var6 = this.K1) == null || r9Var6.J0 == 0)) || i10 == 2) ? 1.0f : 0.0f));
        if (i10 == 1 && ((r9Var5 = this.K1) == null || r9Var5.J0 == 0)) {
            i12 = 2;
        } else {
            i12 = 2;
            if (i10 != 2) {
                dp = AndroidUtilities.dp(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(ldVar, (Property<ld, Float>) property2, dp));
                arrayList.add(ObjectAnimator.ofFloat(qdVar, (Property<qd, Float>) property, i10 != i12 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(meVar2, (Property<me, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, i10 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property, (i10 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property, (i10 == 1 || (this.O1 != 1 && ((r9Var4 = this.K1) == null || TextUtils.isEmpty(r9Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(y0Var, (Property<y0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                imageView = this.i1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 && (r9Var3 = this.K1) != null && r9Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<q91, Float>) property, 0.0f));
                this.i2.playTogether(arrayList);
                this.i2.addListener(new uc(this, i13, i10, 0));
                this.i2.setDuration(460L);
                this.i2.setInterpolator(wr.h);
                this.i2.start();
            }
        }
        dp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(ldVar, (Property<ld, Float>) property2, dp));
        arrayList.add(ObjectAnimator.ofFloat(qdVar, (Property<qd, Float>) property, i10 != i12 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(meVar2, (Property<me, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property, i10 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property, (i10 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property, (i10 == 1 || (this.O1 != 1 && ((r9Var4 = this.K1) == null || TextUtils.isEmpty(r9Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(y0Var, (Property<y0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        imageView = this.i1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<q91, Float>) property, 0.0f));
        this.i2.playTogether(arrayList);
        this.i2.addListener(new uc(this, i13, i10, 0));
        this.i2.setDuration(460L);
        this.i2.setInterpolator(wr.h);
        this.i2.start();
    }

    public final void L(Runnable runnable, long j3) {
        if (this.S1 || this.K1 == null) {
            return;
        }
        zb zbVar = this.g2;
        if (zbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(zbVar);
        }
        this.h2 = true;
        this.S1 = true;
        this.g2 = new zb(this, runnable, 1);
        this.X0.setAlpha(0.0f);
        this.X0.setVisibility(0);
        this.X0.n(this.K1, this.g2, j3);
        this.X0.p(this.K1, false);
        AndroidUtilities.runOnUIThread(this.g2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fc, code lost:
    
        if (r0.k == false) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M() {
        r9 r9Var;
        r9 r9Var2;
        r9 r9Var3;
        ad adVar;
        r9 r9Var4;
        ad adVar2;
        ad adVar3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            qd qdVar = this.c1;
            if (qdVar != null && qdVar.O1) {
                qdVar.N1 = false;
                qdVar.z(false, false);
                return false;
            }
            if (this.Q1) {
                m8 m8Var = this.O0;
                if (m8Var.r0) {
                    m8Var.r0 = false;
                    m8Var.v0 = SystemClock.elapsedRealtime();
                    m8Var.u0 = true;
                    ((sc) m8Var.a).d(false);
                    m8Var.J.c(false);
                    m8Var.K.c(false);
                    m8Var.L.c(false);
                    m8Var.invalidate();
                    return false;
                }
            } else if (!this.P1 && !qdVar.p()) {
                oc ocVar = this.d1;
                if (ocVar.M) {
                    ocVar.c(false, true);
                    return false;
                }
                xc xcVar = this.M0;
                if (xcVar != null) {
                    org.telegram.ui.ActionBar.w0 w0Var = xcVar.G;
                    if (w0Var == null || !w0Var.s()) {
                        f(false);
                        this.m2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    if (xcVar.v.c()) {
                        AndroidUtilities.hideKeyboard(searchField);
                        return false;
                    }
                    xcVar.x.v(w0Var.L(true));
                    return false;
                }
                if (this.g0 != 0 || (adVar3 = this.v1) == null || !adVar3.y0()) {
                    if (this.g0 > -1) {
                        l0(-1, false, true);
                        return false;
                    }
                    if (this.f0 == 0) {
                        ArrayList arrayList = this.A0.h;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            if (((i0) obj).n != null) {
                                this.A0.e();
                                m0(true);
                                return false;
                            }
                        }
                    }
                    if (this.f0 == 1 && (((r9Var2 = this.K1) == null || (!r9Var2.n && !r9Var2.u)) && !this.u0)) {
                        if (r9Var2 != null && r9Var2.g && ((adVar2 = this.v1) == null || !adVar2.u0())) {
                            r9 r9Var5 = this.K1;
                            if (!r9Var5.j) {
                            }
                        }
                        ad adVar4 = this.v1;
                        if (adVar4 == null || !adVar4.y0()) {
                            if (this.v0 == 0 && (((this.L1 && !this.A0.j() && (((adVar = this.v1) == null || !adVar.u0()) && ((r9Var4 = this.K1) == null || r9Var4.Z0 == null))) || !this.b1.h) && (((r9Var3 = this.K1) == null || !r9Var3.g || (!r9Var3.n && !r9Var3.u)) && !this.u0 && (r9Var3 == null || !r9Var3.o)))) {
                                K(0, true);
                                return false;
                            }
                            if (this.v0 != 0) {
                                q(true);
                                return false;
                            }
                            Activity activity = this.b;
                            zh.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardChanges);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                            r9 r9Var6 = this.K1;
                            if (r9Var6 != null && !r9Var6.g && !r9Var6.o) {
                                alertDialog$Builder.i(LocaleController.getString(r9Var6.c ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new cc(this, 8));
                            }
                            r9 r9Var7 = this.K1;
                            alertDialog$Builder.k(LocaleController.getString((r9Var7 == null || !r9Var7.c || r9Var7.g) ? R.string.Discard : R.string.StoryDeleteDraft), new cc(this, 9));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.show();
                            View d = d2Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.j6.q7;
                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, bVar));
                                d.setBackground(org.telegram.ui.ActionBar.j6.Y(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i11, bVar), 51), 6, 6));
                            }
                        }
                    }
                    if (this.f0 != 2 || (r9Var = this.K1) == null || r9Var.b0) {
                        q(true);
                        return true;
                    }
                    X();
                    K(1, true);
                    return false;
                }
            }
        }
        return false;
    }

    public final void N(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            v(false);
            this.O0.setVisibility(8);
            this.V0.setVisibility(8);
            this.Q0.setVisibility(8);
            h(false, false);
            d0(false);
        }
        if (i10 == 2) {
            this.t1.setVisibility(8);
            this.l0.setVisibility(i11 == 1 ? 0 : 8);
            this.c1.setVisibility(8);
            this.u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.b1.setVisibility(8);
            this.l0.setVisibility(i11 == 2 ? 0 : 8);
            this.g1.setVisibility(8);
            this.j1.setVisibility(8);
            this.e1.setVisibility(8);
            ImageView imageView = this.i1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.X0.setVisibility(i11 == 2 ? 0 : 8);
            this.Z0.setVisibility(8);
            if (i11 != 2) {
                z();
                y();
            }
            this.p0.setVisibility(i11 == 2 ? 0 : 8);
            w();
            this.p1.setAlpha(0.0f);
            this.p1.setVisibility(8);
            this.a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            r9 r9Var = this.K1;
            if (r9Var == null || !r9Var.n) {
                u();
                H();
            }
            qf0 qf0Var = this.C1;
            if (qf0Var != null) {
                qf0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            r9 r9Var2 = this.K1;
            this.a1.setVisibility((r9Var2 == null || r9Var2.h0 < 30000) ? 8 : 0);
            this.l0.setAlpha(1.0f);
            this.l0.setTranslationY(0.0f);
            r9 r9Var3 = this.K1;
            this.c1.setVisibility((r9Var3 == null || r9Var3.J0 == 0) ? 0 : 8);
        }
        if (i11 == 0 && this.V1) {
            D().setVisibility(0);
            z0 D = D();
            D.r.d(0.0f, true);
            D.a(true);
            a3.d dVar = D.h;
            if (dVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
            }
            a3.d dVar2 = new a3.d(D, 15);
            D.h = dVar2;
            AndroidUtilities.runOnUIThread(dVar2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        qf0 qf0Var2 = this.C1;
        if (qf0Var2 != null) {
            qf0Var2.setAllowTouch(i11 == 1 && ((i12 = this.g0) == -1 || i12 == 1));
        }
        qd qdVar = this.c1;
        if (qdVar != null) {
            qdVar.e0 = i11 != 1;
        }
        if (i11 == 1) {
            int i13 = this.c;
            MediaDataController.getInstance(i13).checkStickers(0);
            MediaDataController.getInstance(i13).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i13).loadRecents(2, false, true, false);
            zh.i5 storiesController = MessagesController.getInstance(i13).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i13).getStoriesController().R();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i10, int i11) {
        long j3;
        SpannableStringBuilder append;
        r9 r9Var;
        r9 r9Var2;
        boolean z10;
        r9 r9Var3;
        r9 r9Var4;
        r9 r9Var5;
        h71 textureView;
        r9 r9Var6;
        boolean z11 = true;
        if (i11 == 0) {
            Z(false);
            this.O0.setVisibility(0);
            m8 m8Var = this.O0;
            if (m8Var != null) {
                m8Var.g(false);
            }
            this.Q0.setVisibility(0);
            this.V0.setVisibility(0);
            this.V0.setAlpha(0.0f);
            this.J0.a(0L, true);
            r9 r9Var7 = this.K1;
            if (r9Var7 != null) {
                r9Var7.i(false);
                this.K1 = null;
            }
            md mdVar = this.A0;
            if (mdVar != null) {
                mdVar.e();
                this.O0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new tb(this, 18));
            z0 z0Var = this.N0;
            if (z0Var != null) {
                z0Var.setVisibility(8);
            }
            this.W0.e(true);
            x4 x4Var = this.l1;
            if (x4Var != null) {
                x4Var.e(true);
            }
        }
        int i12 = this.c;
        if (i11 == 1 || i10 == 1) {
            this.e1.setEntry(i11 == 1 ? this.K1 : null);
            if (this.O1 == 1) {
                this.g1.setVisibility(0);
                r9 r9Var8 = this.K1;
                f0(r9Var8 != null && r9Var8.Y, false);
                this.j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((pg0) this.j1.c).a(this.X0.k(), false);
                this.p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                r9 r9Var9 = this.K1;
                if (r9Var9 == null || TextUtils.isEmpty(r9Var9.y)) {
                    this.p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.g1.setVisibility(8);
                    this.j1.setVisibility(0);
                    ((pg0) this.j1.c).a(true, false);
                    this.p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.e1.setVisibility(0);
            r9 r9Var10 = this.K1;
            if (r9Var10 == null || !r9Var10.u) {
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                G().setVisibility(0);
                o0(false);
            }
            this.b1.setVisibility(0);
            this.X0.setVisibility(0);
            r9 r9Var11 = this.K1;
            this.c1.setVisibility(((r9Var11 == null || r9Var11.J0 == 0) && this.v0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            r9 r9Var12 = this.K1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((r9Var12 == null || r9Var12.J0 == 0) && this.v0 == 0) ? 68.0f : 12.0f);
            this.Y0.setLayoutParams(layoutParams);
            this.l0.setVisibility(0);
            this.l0.clearFocus();
            r9 r9Var13 = this.K1;
            this.c1.A(r9Var13 == null ? 86400 : r9Var13.I0, false);
            this.c1.setPeriodVisible(!MessagesController.getInstance(i12).premiumFeaturesBlocked() && ((r9Var = this.K1) == null || !r9Var.g));
            r9 r9Var14 = this.K1;
            this.c1.setHasRoundVideo((r9Var14 == null || r9Var14.o0 == null) ? false : true);
            qd qdVar = this.c1;
            if (qdVar == null) {
                j3 = 0;
            } else {
                r9 r9Var15 = this.K1;
                if (r9Var15 == null || !r9Var15.n) {
                    j3 = 0;
                    qdVar.v(null, null);
                } else {
                    TLRPC.Peer peer = r9Var15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i12).getUser(Long.valueOf(peer.user_id)));
                        r9 r9Var16 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        r9Var16.p = append;
                    } else {
                        j3 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        r9 r9Var17 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        r9Var17.p = append;
                    }
                    String str2 = this.K1.s;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    String str3 = str2;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new tc(), 0, spannableString.length(), 33);
                        str3 = spannableString;
                    }
                    this.c1.v(str3, append);
                }
            }
            r9 r9Var18 = this.K1;
            boolean z12 = (r9Var18 != null && r9Var18.v() && this.K1.t()) ? false : true;
            me meVar = this.Z0;
            boolean z13 = meVar.j0;
            meVar.j0 = z12;
            meVar.i0.f(z12, true);
            meVar.invalidate();
        } else {
            j3 = 0;
        }
        if (i11 == 2 || i10 == 2) {
            this.p0.setVisibility(0);
            this.t1.setVisibility(0);
            r9 r9Var19 = this.K1;
            if (r9Var19 != null && r9Var19.b0) {
                this.p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.l0.setVisibility(0);
            this.u1.setVisibility(0);
        }
        if (i11 == 2) {
            this.p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.N1 = false;
            r9 r9Var20 = this.K1;
            boolean z14 = (r9Var20 == null || r9Var20.J0 == j3) ? false : true;
            boolean z15 = r9Var20 != null && r9Var20.g;
            String string = LocaleController.getString(z15 ? R.string.Done : z14 ? R.string.UploadBotPreview : R.string.Next);
            boolean z16 = !z14;
            v7 v7Var = this.b1;
            if (!TextUtils.equals(string, v7Var.d) || z16 != v7Var.e) {
                v7Var.removeView(v7Var.c);
                Context context = v7Var.getContext();
                v7Var.d = string;
                v7Var.e = z16;
                u7 u7Var = new u7(v7Var, context, string, z16);
                v7Var.c = u7Var;
                u7Var.setContentDescription(string);
                v7Var.addView(v7Var.c, w7.a6.c(-2.0f, -2));
                v7Var.e();
            }
            this.t1.setVisibility(8);
            this.u1.setVisibility(8);
            if (!this.h2) {
                r9 r9Var21 = this.K1;
                if (r9Var21 == null || !r9Var21.u) {
                    this.X0.set(r9Var21);
                } else {
                    this.X0.l(r9Var21);
                }
            }
            this.h2 = false;
            this.c1.f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i12).storyEntitiesAllowed() ? null : new tb(this, 19));
            this.d1.setVisibility(this.H1 == null ? 8 : 0);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                oc ocVar = this.d1;
                ocVar.c(false, false);
                ocVar.c = arrayList;
                ocVar.d = arrayList2;
                ocVar.e = arrayList3;
                ocVar.w = new t01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                ocVar.K = new t01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                ocVar.b.Y2.N(false);
                this.d1.setSelected(this.H1.indexOf(this.K1));
            }
            this.Z0.setMaxCount((z14 || z15 || this.H1 != null || ((r9Var6 = this.K1) != null && (r9Var6.v() || !this.K1.K))) ? 1 : 3);
            if (i10 != 2) {
                r9 r9Var22 = this.K1;
                if (r9Var22 != null && (r9Var22.c || r9Var22.g || this.u0)) {
                    if (r9Var22.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    r9 r9Var23 = this.K1;
                    if (r9Var23.K && r9Var23.a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new cc(this, 7));
                    }
                    this.c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    qd qdVar2 = this.c1;
                    qdVar2.V = true;
                    qdVar2.f.setText("");
                }
            }
            r9 r9Var24 = this.K1;
            this.b1.d(4, r9Var24 == null || ((!r9Var24.u || r9Var24.K) && !r9Var24.v()));
            this.b1.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (r9Var5 = this.K1) == null || r9Var5.u || r9Var5.v()) ? false : true);
            if (!this.N1 && !this.c1.o()) {
                zh.i5 storiesController = MessagesController.getInstance(i12).getStoriesController();
                int B = B();
                j4.w o9 = storiesController.o();
                if (o9 == null || !o9.a(storiesController.a, B) || ((r9Var4 = this.K1) != null && (r9Var4.g || r9Var4.J0 != j3))) {
                    z10 = true;
                    this.b1.setShareEnabled(z10);
                    r9 r9Var25 = this.K1;
                    this.g1.setImageResource((r9Var25 == null && r9Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.p0.setVisibility(0);
                    this.p0.setTranslationX(0.0f);
                    r9Var3 = this.K1;
                    if (r9Var3 == null && r9Var3.J0 != j3) {
                        this.p0.l("", false);
                    } else if (r9Var3 == null && r9Var3.g) {
                        this.p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (r9Var3 == null && r9Var3.u) {
                        this.p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (r9Var3 == null && r9Var3.n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this.p0, 32.0f, i12);
                        this.p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(g5Var, 0, 1, 33);
                        if (this.K1.q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(this.K1.q.user_id));
                            g5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.q)));
                            g5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) (chat2 != null ? chat2.title : ""));
                        }
                        this.p0.l(spannableStringBuilder, false);
                    } else {
                        this.p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z11 = true;
                }
            }
            z10 = false;
            this.b1.setShareEnabled(z10);
            r9 r9Var252 = this.K1;
            this.g1.setImageResource((r9Var252 == null && r9Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.p0.setVisibility(0);
            this.p0.setTranslationX(0.0f);
            r9Var3 = this.K1;
            if (r9Var3 == null) {
            }
            if (r9Var3 == null) {
            }
            if (r9Var3 == null) {
            }
            if (r9Var3 == null) {
            }
            this.p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z11 = true;
        }
        if (i10 == z11) {
            qd qdVar3 = this.c1;
            w70 w70Var = qdVar3.V0;
            if (w70Var != null) {
                w70Var.u();
                qdVar3.V0 = null;
            }
            this.k1.e(z11);
            oc ocVar2 = this.d1;
            if (ocVar2.M) {
                ocVar2.c(false, z11);
            }
        }
        if (i11 == 2 && (r9Var2 = this.K1) != null) {
            if (r9Var2.e0 < j3) {
                r9Var2.e0 = j3;
            }
            this.M1 = r9Var2.e0;
            long duration = this.X0.getDuration() < 100 ? this.K1.h0 : this.X0.getDuration();
            r9 r9Var26 = this.K1;
            if (r9Var26.h0 <= 0) {
                r9Var26.h0 = duration;
            }
            File file = r9Var26.Z0;
            if (file == null) {
                file = r9Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            r9 r9Var27 = this.K1;
            this.t1.o(false, absolutePath, r9Var27.h0, r9Var27.P);
            r9 r9Var28 = this.K1;
            float f7 = duration;
            long j10 = (long) (r9Var28.Z * f7);
            long j11 = (long) (r9Var28.a0 * f7);
            me meVar2 = this.t1;
            meVar2.Z0 = j10;
            meVar2.a1 = j11;
            he heVar = meVar2.h;
            if (heVar != null) {
                he.a(heVar, true);
            }
            ai.c0 c0Var = new ai.c0(this, 8);
            this.t1.setDelegate(new yc(c0Var));
            float max = (this.M1 / Math.max(1L, duration)) * 0.96f;
            this.t1.setVideoLeft(max);
            this.t1.setVideoRight(0.04f + max);
            c0Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        qf0 qf0Var = this.C1;
        if (qf0Var != null) {
            qf0Var.setAllowTouch(false);
        }
        x4 x4Var2 = this.m1;
        if (x4Var2 != null) {
            x4Var2.e(true);
        }
        org.telegram.ui.Components.pc.e();
        qd qdVar4 = this.c1;
        if (qdVar4 != null) {
            i iVar = qdVar4.f;
            iVar.d();
            iVar.k(true);
            this.c1.e0 = true;
        }
        nd ndVar = this.X0;
        if (ndVar != null) {
            ndVar.x(8, i11 != 1);
        }
        ad adVar = this.v1;
        if (adVar != null) {
            adVar.setCoverPreview(i11 != 1);
        }
        x4 x4Var3 = this.n1;
        if (x4Var3 != null) {
            x4Var3.e(true);
        }
        md mdVar2 = this.A0;
        mdVar2.setPreview(i11 == 1 && mdVar2.j());
    }

    public final void P() {
        og.f1 f1Var;
        boolean z10 = false;
        if (this.f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.x2 = new tb(this, 3);
            }
        }
        qd qdVar = this.c1;
        if (qdVar != null) {
            qdVar.f.s();
        }
        m8 m8Var = this.O0;
        if (m8Var != null) {
            m8Var.h();
        }
        x7 x7Var = this.o1;
        if (x7Var != null) {
            zh.i5 storiesController = MessagesController.getInstance(x7Var.a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.i.f(UserConfig.getInstance(storiesController.a).clientUserId);
            x7Var.b = storiesController.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            x7Var.c.invalidate();
        }
        ad adVar = this.v1;
        if (adVar != null && (f1Var = adVar.O0.d) != null) {
            f1Var.postRunnable(f1Var.w);
        }
        nd ndVar = this.X0;
        if (ndVar != null) {
            ndVar.x(0, false);
        }
        f1 f1Var2 = MessagesController.getInstance(this.c).getStoriesController().w;
        if (f1Var2.c || f1Var2.d) {
            return;
        }
        f1Var2.d = true;
        b1 b1Var = new b1(f1Var2, 1);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(f1Var2.a);
        messagesStorage.getStorageQueue().postRunnable(new c1(messagesStorage, z10, b1Var, 0));
    }

    public final void Q(int i10, int i11) {
        ad adVar;
        id idVar;
        jd jdVar;
        ad adVar2;
        if (i11 == 0) {
            this.n0.setVisibility(8);
        }
        if (i10 == 0 && (adVar2 = this.v1) != null) {
            adVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.c1.setVisibility(8);
            this.g1.setVisibility(i11 == 2 ? 0 : 8);
            this.j1.setVisibility(i11 == 2 ? 0 : 8);
            this.e1.setVisibility(i11 == 2 ? 0 : 8);
            ImageView imageView = this.i1;
            if (imageView != null) {
                imageView.setVisibility(i11 == 2 ? 0 : 8);
            }
            this.Z0.setVisibility(i11 == 2 ? 0 : 8);
            this.p0.setVisibility(8);
        }
        boolean z10 = true;
        this.X0.setAllowCropping(i11 == -1);
        if ((i11 == 0 || i10 == 0) && (adVar = this.v1) != null) {
            adVar.d1.setLayerType(0, null);
        }
        qf0 qf0Var = this.C1;
        if (qf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            qf0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            id idVar2 = this.r1;
            if (idVar2 != null) {
                idVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (idVar = this.r1) != null) {
            idVar.setVisibility(8);
            this.r1.setAppearProgress(0.0f);
            id idVar3 = this.r1;
            idVar3.x = null;
            l0 l0Var = idVar3.f;
            l0Var.L = null;
            l0Var.d = null;
            l0Var.J = false;
            idVar3.d.setVisibility(8);
            idVar3.a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            jd jdVar2 = this.s1;
            if (jdVar2 != null) {
                jdVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i10 != 4 || (jdVar = this.s1) == null) {
            return;
        }
        jdVar.setVisibility(8);
        this.s1.setAppearProgress(0.0f);
        jd jdVar3 = this.s1;
        jdVar3.b = null;
        l0 l0Var2 = jdVar3.h;
        l0Var2.L = null;
        l0Var2.d = null;
        l0Var2.J = false;
        jdVar3.e.setVisibility(8);
        jdVar3.setVisibility(8);
    }

    public final void R(wd wdVar) {
        j4.w o9;
        be beVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.u0 = false;
        this.e = false;
        this.B2 = false;
        this.s0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (beVar = this.n) != null && beVar.getParent() == null) {
            be beVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, beVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.A0.setCameraThumb(A());
        if (this.v0 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            h0(o9, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.H;
        if (wdVar != null) {
            this.F = wdVar;
            this.J = wdVar.a;
            rectF.set(wdVar.c);
            this.G = wdVar.b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.h0.setBackgroundColor(i11);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.b, 1);
        g(1.0f, true, new tb(this, 6));
        e();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void S(ud udVar, r9 r9Var, long j3) {
        be beVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.u0 = false;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (beVar = this.n) != null && beVar.getParent() == null) {
            be beVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, beVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.K1 = r9Var;
        this.O1 = r9Var.K ? 1 : 0;
        this.s0.g = false;
        RectF rectF = this.H;
        if (udVar != null) {
            this.F = udVar;
            this.J = udVar.a;
            rectF.set(udVar.c);
            this.G = udVar.b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
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
        AndroidUtilities.lockOrientation(this.b, 1);
        r9 r9Var2 = this.K1;
        if (r9Var2 != null) {
            this.c1.setText(r9Var2.C0);
        }
        L(new mc(this, 0), j3);
        K(this.K1.b0 ? 2 : 1, false);
        l0(-1, false, false);
        this.b1.b(false, false);
        e();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void T() {
        w70 w70Var;
        nd ndVar = this.X0;
        if (ndVar != null) {
            ndVar.x(4, true);
        }
        qd qdVar = this.c1;
        if (qdVar != null && (w70Var = qdVar.V0) != null) {
            w70Var.u();
            qdVar.V0 = null;
        }
        qg.a1 a1Var = new qg.a1((org.telegram.ui.ActionBar.p2) new cd(this, 1), 14, false);
        a1Var.setOnDismissListener(new ic(this, 1));
        a1Var.show();
    }

    public final void U(ud udVar, r9 r9Var) {
        j4.w o9;
        be beVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.u0 = true;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (beVar = this.n) != null && beVar.getParent() == null) {
            be beVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, beVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.K1 = r9Var;
        sb.a(i10, r9Var);
        r9 r9Var2 = this.K1;
        int i11 = (r9Var2 == null || !r9Var2.K) ? 0 : 1;
        this.O1 = i11;
        this.s0.g = r9Var2 != null && r9Var2.u && i11 == 1;
        if (this.v0 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            h0(o9, true);
        }
        RectF rectF = this.H;
        if (udVar != null) {
            this.F = udVar;
            this.J = udVar.a;
            rectF.set(udVar.c);
            this.G = udVar.b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.r.c();
        int i12 = this.J;
        this.h0.setBackgroundColor((i12 == 1 || i12 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.b, 1);
        r9 r9Var3 = this.K1;
        if (r9Var3 != null) {
            this.c1.setText(r9Var3.C0);
        }
        this.b1.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new tb(this, 6));
        e();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void V() {
        og.h1 h1Var = this.w1;
        if (h1Var != null) {
            h1Var.bringToFront();
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
        pe peVar = this.p1;
        if (peVar != null) {
            peVar.bringToFront();
        }
        qf0 qf0Var = this.C1;
        if (qf0Var != null) {
            qf0Var.bringToFront();
        }
        hf0 hf0Var = this.E1;
        if (hf0Var != null) {
            hf0Var.bringToFront();
        }
        jf0 jf0Var = this.F1;
        if (jf0Var != null) {
            jf0Var.bringToFront();
        }
        x7 x7Var = this.o1;
        if (x7Var != null) {
            x7Var.bringToFront();
        }
        t tVar = this.q1;
        if (tVar != null) {
            tVar.bringToFront();
        }
    }

    public final void W(r9 r9Var, boolean z10) {
        r9 r9Var2;
        boolean z11;
        if (r9Var == null || this.X0.getWidth() <= 0 || this.X0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? r9Var.O0 : r9Var.N0;
        if (file != null) {
            file.delete();
        }
        View view = this.A0.j() ? this.A0 : this.X0;
        float f7 = z10 ? 0.33333334f : 1.0f;
        int width = (int) (view.getWidth() * f7);
        Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f7), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(f7, f7);
        AndroidUtilities.makingGlobalBlurBitmap = true;
        view.draw(canvas);
        AndroidUtilities.makingGlobalBlurBitmap = false;
        canvas.restore();
        Paint paint = new Paint(2);
        h71 textureView = this.X0.getTextureView();
        if (r9Var.K && !r9Var.u && textureView != null) {
            Bitmap bitmap = textureView.getBitmap();
            Matrix transform = textureView.getTransform(null);
            if (transform != null) {
                Matrix matrix = new Matrix(transform);
                matrix.postScale(f7, f7);
                transform = matrix;
            }
            canvas.drawBitmap(bitmap, transform, paint);
            bitmap.recycle();
        }
        File file2 = r9Var.Q0;
        if (file2 != null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                canvas.save();
                float width2 = width / decodeFile.getWidth();
                canvas.scale(width2, width2);
                canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile.recycle();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        File file3 = r9Var.P0;
        if (file3 != null) {
            try {
                Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                canvas.save();
                float width3 = width / decodeFile2.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile2.recycle();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        ad adVar = this.v1;
        if (adVar != null && adVar.R0 != null) {
            canvas.save();
            canvas.scale(f7, f7);
            ad adVar2 = this.v1;
            adVar2.I0 = true;
            j7 j7Var = adVar2.R0;
            j7Var.a = true;
            j7Var.draw(canvas);
            ad adVar3 = this.v1;
            adVar3.R0.a = false;
            adVar3.I0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = r9.w(this.c, "jpg");
        if (z10) {
            r9Var2 = r9Var;
            z11 = z10;
            Utilities.searchQueue.postRunnable(new e2(this, createBitmap, z11, w10, r9Var2, 1));
        } else {
            r9Var2 = r9Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (!z11) {
            r9Var2.N0 = w10;
        }
        r9Var2.b1 = createScaledBitmap;
    }

    public final void X() {
        j4.w o9;
        char c10;
        rb rbVar = this.q0;
        BitmapDrawable bitmapDrawable = null;
        if (rbVar != null) {
            rbVar.dismiss();
            this.q0 = null;
        }
        if (this.N1) {
            y0 y0Var = this.e1;
            y0Var.getClass();
            y0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            u7 u7Var = this.b1.c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(u7Var, i10);
            return;
        }
        qd qdVar = this.c1;
        if (qdVar != null && qdVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.o6 o6Var = qdVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(o6Var, i11);
            qdVar.e();
            return;
        }
        r9 r9Var = this.K1;
        int i12 = this.c;
        int i13 = 0;
        if ((r9Var == null || (!r9Var.g && r9Var.J0 == 0)) && (o9 = MessagesController.getInstance(i12).storiesController.o()) != null && o9.a(i12, B())) {
            h0(o9, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        zh.b bVar = this.a;
        if (qdVar != null && !this.K1.D0) {
            CharSequence text = qdVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((c11[]) spannable.getSpans(0, text.length(), c11.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.wc(this.n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.gc, 0, new tb(this, 27), bVar)).k(true);
                    int i14 = -this.U1;
                    this.U1 = i14;
                    AndroidUtilities.shakeViewSpring(qdVar, i14);
                    return;
                }
            }
        }
        r9 r9Var2 = this.K1;
        if (r9Var2.g || r9Var2.J0 != 0) {
            r9Var2.l = false;
            i(null);
            p0();
            return;
        }
        if (this.N != 0) {
            r9Var2.v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
        }
        nd ndVar = this.X0;
        ndVar.x(3, true);
        rb rbVar2 = new rb(this.b, this.K1.I0, bVar);
        rbVar2.q1(this.K1.E0);
        rbVar2.p1(this.K1.v0);
        rbVar2.F = this.M;
        rbVar2.U = new ub(this, 14);
        rbVar2.e1(!this.A0.j());
        ArrayList arrayList = this.I1;
        rbVar2.m1(arrayList == null ? this.K1.r() : arrayList.size());
        rbVar2.k1(false);
        CharSequence text2 = qdVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (c61 c61Var : (c61[]) ((Spanned) text2).getSpans(0, text2.length(), c61.class)) {
                if (c61Var != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(c61Var.getURL())));
                        if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                            arrayList2.add(UserObject.getPublicUsername(user));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (text2 != null) {
            int i15 = -1;
            for (int i16 = 0; i16 < text2.length(); i16++) {
                char charAt = text2.charAt(i16);
                if (charAt == '@') {
                    i15 = i16 + 1;
                } else if (charAt == ' ') {
                    if (i15 != -1) {
                        String charSequence = text2.subSequence(i15, i16).toString();
                        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(charSequence);
                        if (userOrChat instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) userOrChat;
                            if (!user2.bot && !UserObject.isUserSelf(user2) && user2.id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
                                arrayList2.add(charSequence);
                            }
                        }
                    }
                    i15 = -1;
                }
            }
            c10 = 1;
            if (i15 != -1) {
                String charSequence2 = text2.subSequence(i15, text2.length()).toString();
                TLObject userOrChat2 = MessagesController.getInstance(i12).getUserOrChat(charSequence2);
                if (userOrChat2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) userOrChat2;
                    if (!user3.bot && !UserObject.isUserSelf(user3) && user3.id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                        arrayList2.add(charSequence2);
                    }
                }
            }
        } else {
            c10 = 1;
        }
        rbVar2.S = arrayList2;
        rbVar2.W = new ub(this, 15);
        rbVar2.X = new ub(this, 16);
        rbVar2.T = new cc(this, 10);
        this.q0 = rbVar2;
        r9 r9Var3 = this.K1;
        if (r9Var3.K) {
            if (ndVar != null && !r9Var3.f0 && this.f0 != 2) {
                r9Var3.e0 = ndVar.getCurrentPosition();
                ub ubVar = new ub(this, 17);
                og.h1 h1Var = this.w1;
                View view = this.z1;
                View[] viewArr = new View[3];
                viewArr[0] = ndVar;
                viewArr[c10] = h1Var;
                viewArr[2] = view;
                ndVar.h(ubVar, viewArr);
            }
            rb rbVar3 = this.q0;
            Bitmap bitmap = this.K1.g0;
            tb tbVar = new tb(this, 20);
            if (bitmap != null) {
                rbVar3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            rbVar3.b0 = bitmapDrawable;
            rbVar3.c0 = tbVar;
            p1 p1Var = rbVar3.b;
            if (p1Var != null) {
                for (View view2 : p1Var.getViewPages()) {
                    if (view2 instanceof kb) {
                        kb kbVar = (kb) view2;
                        kbVar.g(false);
                        kbVar.e(false);
                    }
                }
            }
        }
        this.q0.setOnDismissListener(new ic(this, i13));
        this.q0.show();
    }

    public final void Y(xd xdVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (xdVar != null) {
            this.F = xdVar;
            this.J = xdVar.a;
            rectF.set(xdVar.c);
            this.G = xdVar.b;
        } else {
            this.F = null;
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        int i11 = this.J;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.h0.setBackgroundColor(i10);
    }

    public final void Z(boolean z10) {
        Activity activity;
        if (!this.w2 || z10) {
            this.s2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.b) != null) {
                boolean z11 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    vq vqVar = new vq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    vqVar.e = dp;
                    vqVar.f = dp2;
                    this.A0.setCameraThumb(vqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new cc(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.w2 = true;
                }
            }
            if (this.s2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                r();
            } else {
                CameraController.getInstance().initCamera(new tb(this, 0));
            }
        }
    }

    public final void b0(Runnable runnable) {
        bd bdVar = this.B0;
        if (bdVar == null || bdVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new a3.k0(this, this.B0.getTextureView().getBitmap(), runnable, 12));
        } catch (Throwable unused) {
        }
    }

    public final void c0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            int i10 = 1;
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new zc(this, i10)).setListener(new androidx.fragment.app.g(this, z10, view, i10)).setDuration(320L).setInterpolator(wr.h).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z10 ? 0 : 8);
            view.setAlpha(z10 ? 1.0f : 0.0f);
            n0();
        }
    }

    public final void d0(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z10) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f.updateViewLayout(this.n, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j4.w o9;
        r9 r9Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            m8 m8Var = this.O0;
            if (m8Var != null) {
                m8Var.h();
            }
            if (this.m2 == null || MediaController.allMediaAlbums == null) {
                return;
            }
            for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                int i13 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.m2;
                if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.m2 = albumEntry;
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesDraftsUpdated) {
            m8 m8Var2 = this.O0;
            if (m8Var2 == null || this.V1) {
                return;
            }
            m8Var2.h();
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f0;
            int i15 = this.c;
            if (i14 != 1) {
                if (i14 == 0 && (o9 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o9.a(i15, 1)) {
                    r9 r9Var2 = this.K1;
                    if (r9Var2 == null || r9Var2.J0 == 0) {
                        h0(o9, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.N1 && !this.c1.o()) {
                zh.i5 storiesController = MessagesController.getInstance(i15).getStoriesController();
                int B = B();
                j4.w o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.a, B) || ((r9Var = this.K1) != null && (r9Var.g || r9Var.J0 != 0))) {
                    z10 = true;
                }
            }
            this.b1.setShareEnabled(z10);
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.E0.clearAnimation();
        bd bdVar = this.B0;
        if ((bdVar != null && bdVar.isDual()) || this.a2) {
            str = null;
        }
        this.Y1 = str;
        boolean z10 = false;
        if (str == null) {
            c0(this.E0, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals("auto")) {
                i10 = R.drawable.media_photo_flash_auto2;
                this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else {
            if (str.equals("on")) {
                i10 = R.drawable.media_photo_flash_on2;
                this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        ne neVar = this.E0;
        if (neVar.n != i10) {
            neVar.n = i10;
            ValueAnimator valueAnimator = neVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                neVar.r = null;
            }
            neVar.setDrawable(i10);
        }
        if (this.f0 == 0 && !this.I0.e && this.Y1 != null && !I()) {
            z10 = true;
        }
        c0(this.E0, z10, true);
    }

    public final void f(boolean z10) {
        z0 z0Var;
        this.K0 = z10;
        Boolean bool = this.p2;
        if (bool == null || bool.booleanValue() != z10) {
            int i10 = 0;
            if (this.M0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            if (this.M0.U) {
                this.q2 = new dc(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.n2 = null;
            }
            o1.k kVar = this.o2;
            if (kVar != null) {
                kVar.c();
                this.o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            xc xcVar = this.M0;
            if (xcVar != null) {
                xcVar.K = false;
            }
            if (z10 && (z0Var = this.N0) != null) {
                z0Var.a(false);
            }
            td tdVar = this.r;
            if (tdVar != null) {
                tdVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.M0.setImportantForAccessibility(z10 ? 0 : 4);
            this.p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            be beVar = this.n;
            float height = z10 ? 0.0f : (beVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            int i11 = 1;
            Math.max(1, beVar.getHeight());
            xc xcVar2 = this.M0;
            xcVar2.K = !z10;
            this.k2 = this.j2 == null;
            if (z10) {
                o1.k kVar2 = new o1.k(xcVar2, o1.h.n, height);
                this.o2 = kVar2;
                kVar2.u.a(0.75f);
                this.o2.u.b(350.0f);
                this.o2.a(new ec(this, height, i10));
                this.o2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.n2 = ofFloat;
                ofFloat.addUpdateListener(new fc(this, i10));
                this.n2.addListener(new vc(this, i11));
                this.n2.setDuration(450L);
                this.n2.setInterpolator(wr.h);
                this.n2.start();
            }
            if (!z10 && !this.S1) {
                this.l2 = null;
            }
            if (z10 || this.f0 != 0 || this.s2) {
                return;
            }
            r();
        }
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.f1 == null) {
            hj0 hj0Var = new hj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f1 = hj0Var;
            hj0Var.F *= 1.5f;
        }
        this.g1.setAnimation(this.f1);
        if (!z11) {
            this.f1.N(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            hj0 hj0Var2 = this.f1;
            if (hj0Var2.b0 > 20) {
                hj0Var2.N(0, false, false);
            }
            this.f1.P(20);
            this.f1.start();
            return;
        }
        hj0 hj0Var3 = this.f1;
        int i10 = hj0Var3.b0;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        hj0Var3.P(43);
        this.f1.start();
    }

    public final void g(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        td tdVar = this.r;
        if (!z10) {
            this.L = null;
            this.I = f7;
            k();
            tdVar.invalidate();
            this.n.invalidate();
            runnable.run();
            o();
            return;
        }
        this.P.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.L = Float.valueOf(this.K);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new fc(this, 5));
        this.E.addListener(new j3(this, f7, runnable, 1));
        if (f7 < 1.0f && this.v) {
            this.E.setDuration(250L);
            this.E.setInterpolator(wr.h);
        } else if (f7 > 0.0f || tdVar.a < AndroidUtilities.dp(20.0f)) {
            this.E.setDuration(300L);
            this.E.setInterpolator(new u1.a());
        } else if (f7 >= 0.0f || !this.O) {
            this.E.setDuration(400L);
            this.E.setInterpolator(wr.h);
        } else {
            this.E.setDuration(200L);
            this.E.setInterpolator(wr.h);
            this.O = false;
        }
        this.E.start();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 1));
        }
    }

    public final void h(boolean z10, boolean z11) {
        c0 c0Var;
        if (z10) {
            x4 x4Var = this.l1;
            if (x4Var != null) {
                x4Var.e(true);
            }
            x4 x4Var2 = this.m1;
            if (x4Var2 != null) {
                x4Var2.e(true);
            }
            x4 x4Var3 = this.k1;
            if (x4Var3 != null) {
                x4Var3.e(true);
            }
            x4 x4Var4 = this.W0;
            if (x4Var4 != null) {
                x4Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.b2 == I()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.b2 = I();
        if (z10 && (c0Var = this.I0) != null && c0Var.e) {
            c0Var.a(false, z11);
        }
        m0(z11);
        pc pcVar = this.Q0;
        u4 u4Var = this.U0;
        u4 u4Var2 = this.T0;
        if (!z11) {
            u4Var2.setAlpha((z10 && this.f0 == 0 && !I()) ? 1.0f : 0.0f);
            u4Var2.setTranslationY((z10 && this.f0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            u4Var.setAlpha((!z10 && this.f0 == 0 && I()) ? 0.6f : 0.0f);
            u4Var.setTranslationY((!z10 && this.f0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            pcVar.setAlpha((z10 || this.f0 != 0 || I()) ? 0.0f : 1.0f);
            pcVar.setTranslationY((z10 || this.f0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Z1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u4Var2, (Property<u4, Float>) property, (z10 && this.f0 == 0 && !I()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(u4Var2, (Property<u4, Float>) property2, (z10 && this.f0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(u4Var, (Property<u4, Float>) property, (!z10 && this.f0 == 0 && I()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(u4Var, (Property<u4, Float>) property2, (!z10 && this.f0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(pcVar, (Property<pc, Float>) property, (z10 || this.f0 != 0 || I()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(pcVar, (Property<pc, Float>) property2, (z10 || this.f0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.Z1.setDuration(260L);
        this.Z1.setInterpolator(wr.h);
        this.Z1.start();
    }

    public final void h0(j4.w wVar, boolean z10) {
        if (this.z2) {
            return;
        }
        dd ddVar = new dd(wVar.b(), this.c, this.b, new cd(this, 0), null);
        ddVar.X = B();
        ddVar.setOnDismissListener(new k80(2, this, z10));
        this.X0.x(7, true);
        this.z2 = true;
        ddVar.show();
    }

    public final void i(Runnable runnable) {
        r9 r9Var;
        Runnable runnable2;
        nd ndVar;
        sf0 sf0Var = this.B1;
        if (sf0Var == null || (r9Var = this.K1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        r9Var.j = sf0Var.d() | r9Var.j;
        r9 r9Var2 = this.K1;
        sf0 sf0Var2 = this.B1;
        File file = r9Var2.Z0;
        if (file != null) {
            file.delete();
            r9Var2.Z0 = null;
        }
        MediaController.SavedFilterState savedFilterState = sf0Var2.getSavedFilterState();
        r9Var2.a1 = savedFilterState;
        if (r9Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = sf0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i10 = r9Var2.R;
                    matrix.postScale(i10 == 1 ? -1.0f : 1.0f, i10 == 2 ? -1.0f : 1.0f, r9Var2.k0 / 2.0f, r9Var2.l0 / 2.0f);
                    matrix.postRotate(-r9Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    r9Var2.n0.preScale(r9Var2.k0 / createBitmap.getWidth(), r9Var2.l0 / createBitmap.getHeight());
                    r9Var2.k0 = createBitmap.getWidth();
                    r9Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = r9Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        r9Var2.Z0.delete();
                    }
                    String k10 = r9.k(r9Var2.L);
                    boolean z10 = "png".equals(k10) || "webp".equals(k10);
                    r9Var2.Z0 = r9.w(r9Var2.a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(r9Var2.Z0));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new g2(r9Var2, createBitmap, z10, runnable2, 1));
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
            r9 r9Var3 = this.K1;
            if (r9Var3.K || (ndVar = this.X0) == null) {
                return;
            }
            ndVar.set(r9Var3);
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.d2 == z10) {
            return;
        }
        this.d2 = z10;
        if (z11) {
            this.J0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(wr.h).withEndAction(new dc(this, z10, 1)).start();
            return;
        }
        this.J0.clearAnimation();
        this.J0.setAlpha(z10 ? 1.0f : 0.0f);
        if (z10) {
            return;
        }
        this.J0.b(false, false);
    }

    public final void j() {
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

    public final void j0(boolean z10) {
        q91 q91Var = this.V0;
        if ((q91Var.getTag() != null && z10) || (q91Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                tb tbVar = new tb(this, 25);
                this.e2 = tbVar;
                AndroidUtilities.runOnUIThread(tbVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        q91Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            q91Var.setVisibility(0);
        }
        this.f2.playTogether(ObjectAnimator.ofFloat(q91Var, (Property<q91, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.f2.addListener(new ai.e(9, this, z10));
        this.f2.start();
        if (z10) {
            tb tbVar2 = new tb(this, 26);
            this.e2 = tbVar2;
            AndroidUtilities.runOnUIThread(tbVar2, 2000L);
        }
    }

    public final void k() {
        zh.h2 h2Var;
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
        float f7 = this.I;
        RectF rectF2 = this.H;
        RectF rectF3 = this.c0;
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
        this.h0.setAlpha(this.I);
        float f10 = rectF3.left;
        this.h0.setTranslationX((f10 - r3.getLeft()) - this.r.getX());
        float f11 = rectF3.top;
        this.h0.setTranslationY((f11 - r3.getTop()) - this.r.getY());
        xd xdVar = this.F;
        if (xdVar != null && (h2Var = xdVar.f) != null) {
            h2Var.setTranslationX((rectF.left - rectF2.left) * this.I);
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

    public final void k0() {
        rb rbVar = this.q0;
        if (rbVar != null) {
            rbVar.dismiss();
            this.q0 = null;
        }
        rb rbVar2 = new rb(this.b, 86400, this.a);
        rbVar2.o1();
        rbVar2.q1(this.y0);
        TLRPC.InputPeer inputPeer = this.x0;
        if (inputPeer == null) {
            inputPeer = this.N != 0 ? MessagesController.getInstance(this.c).getInputPeer(this.N) : new TLRPC.TL_inputPeerSelf();
        }
        rbVar2.p1(inputPeer);
        rbVar2.F = this.M;
        rbVar2.U = new ub(this, 18);
        rbVar2.e1(false);
        rbVar2.m1(1);
        rbVar2.k1(false);
        rbVar2.W = new ub(this, 19);
        rbVar2.T = new cc(this, 12);
        this.q0 = rbVar2;
        rbVar2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        if (r6.isRecycled() != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        r9 r9Var;
        ImageReceiver photoImage;
        if (this.v1 == null || (r9Var = this.K1) == null) {
            return;
        }
        r9Var.f();
        this.K1.j |= this.v1.u0();
        r9 r9Var2 = this.K1;
        ArrayList arrayList = r9Var2.T0;
        if (arrayList == null) {
            r9Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ad adVar = this.v1;
        r9 r9Var3 = this.K1;
        adVar.t0(r9Var3.T0, false, false, false, false, r9Var3);
        r9 r9Var4 = this.K1;
        if (!r9Var4.K) {
            r9Var4.S0 = Utilities.clamp(this.v1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.v1.getMasks();
        this.K1.U0 = masks != null ? new ArrayList(masks) : null;
        r9 r9Var5 = this.K1;
        boolean z10 = r9Var5.K;
        boolean E = r9Var5.E();
        this.K1.T0 = new ArrayList();
        ad adVar2 = this.v1;
        r9 r9Var6 = this.K1;
        Bitmap t02 = adVar2.t0(r9Var6.T0, true, false, false, !z10, r9Var6);
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
        r9 r9Var7 = this.K1;
        r9Var7.P0 = null;
        r9Var7.R0 = null;
        r9Var7.Q0 = null;
        int i10 = this.c;
        FileLoader fileLoader = FileLoader.getInstance(i10);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        r9 r9Var8 = this.K1;
        r9Var7.P0 = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(t02, compressFormat, r9Var8.i0, r9Var8.j0, 87, false, 101, 101), true);
        if (t02 != null && !t02.isRecycled()) {
            t02.recycle();
        }
        r9 r9Var9 = this.K1;
        if (r9Var9.u) {
            File file4 = r9Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1.Y0 = null;
            }
            r9 r9Var10 = this.K1;
            long j3 = r9Var10.z0;
            if (j3 != Long.MIN_VALUE) {
                Drawable drawable = r9Var10.x0;
                if (drawable == null) {
                    drawable = e8.e(null, i10, j3, this.c2);
                }
                if (drawable != null) {
                    this.K1.Y0 = r9.w(i10, "webp");
                    r9 r9Var11 = this.K1;
                    Bitmap createBitmap = Bitmap.createBitmap(r9Var11.i0, r9Var11.j0, Bitmap.Config.ARGB_8888);
                    r9.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.Y0));
                        } finally {
                            if (!createBitmap.isRecycled()) {
                                createBitmap.recycle();
                            }
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
            }
        }
        r9 r9Var12 = this.K1;
        if (r9Var12.u) {
            File file5 = r9Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.K1.X0 = null;
            }
            r9 r9Var13 = this.K1;
            if (r9Var13.u && r9Var13.K) {
                int i11 = r9Var13.k0;
                int i12 = r9Var13.l0;
                pg.e1 s02 = this.v1.s0();
                if (s02 != null) {
                    pg.x0 x0Var = s02.r0;
                    if (x0Var.getChildCount() == 1 && i11 > 0 && i12 > 0) {
                        if ((x0Var.getChildAt(0) instanceof org.telegram.ui.Cells.t1) && (photoImage = ((org.telegram.ui.Cells.t1) x0Var.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
                            float f7 = i11;
                            float f10 = i12;
                            float max = Math.max(photoImage.getImageWidth() / f7, photoImage.getImageHeight() / f10);
                            int i13 = (int) ((f7 * max) / 2.0f);
                            int i14 = (int) ((f10 * max) / 2.0f);
                            Bitmap createBitmap2 = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
                            float[] fArr = new float[8];
                            for (int i15 = 0; i15 < photoImage.getRoundRadius().length; i15++) {
                                int i16 = i15 * 2;
                                fArr[i16] = photoImage.getRoundRadius()[i15];
                                fArr[i16 + 1] = photoImage.getRoundRadius()[i15];
                            }
                            Canvas canvas = new Canvas(createBitmap2);
                            Path path = new Path();
                            canvas.scale(0.5f, 0.5f);
                            RectF rectF = AndroidUtilities.rectTmp;
                            float f11 = (i13 * 2.0f) / 2.0f;
                            float f12 = (i14 * 2.0f) / 2.0f;
                            rectF.set(f11 - (photoImage.getImageWidth() / 2.0f), f12 - (photoImage.getImageHeight() / 2.0f), (photoImage.getImageWidth() / 2.0f) + f11, (photoImage.getImageHeight() / 2.0f) + f12);
                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                            Paint paint = new Paint(1);
                            paint.setColor(-1);
                            canvas.drawPath(path, paint);
                            try {
                                this.K1.X0 = r9.w(i10, "webp");
                                createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.X0));
                            } catch (Exception e11) {
                                FileLog.e(e11);
                                this.K1.X0 = null;
                            }
                            createBitmap2.recycle();
                        }
                    }
                }
            }
        }
        if (!E) {
            ad adVar3 = this.v1;
            ArrayList arrayList2 = new ArrayList();
            r9 r9Var14 = this.K1;
            int i17 = r9Var14.i0;
            Bitmap t03 = adVar3.t0(arrayList2, false, true, false, false, r9Var14);
            r9 r9Var15 = this.K1;
            FileLoader fileLoader2 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            r9 r9Var16 = this.K1;
            r9Var15.R0 = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(t03, compressFormat2, r9Var16.i0, r9Var16.j0, 87, false, 101, 101), true);
            if (t03 != null && !t03.isRecycled()) {
                t03.recycle();
            }
        }
        if (this.v1.O0.getPainting().E) {
            Bitmap blurBitmap = this.v1.getBlurBitmap();
            r9 r9Var17 = this.K1;
            FileLoader fileLoader3 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            r9 r9Var18 = this.K1;
            r9Var17.Q0 = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, r9Var18.i0, r9Var18.j0, 87, false, 101, 101), true);
            if (blurBitmap == null || blurBitmap.isRecycled()) {
                return;
            }
            blurBitmap.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0683 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07b8 A[LOOP:0: B:238:0x07b8->B:240:0x07be, LOOP_START, PHI: r15
      0x07b8: PHI (r15v17 int) = (r15v16 int), (r15v18 int) binds: [B:232:0x0784, B:240:0x07be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(int i10, boolean z10, boolean z11) {
        float f7;
        boolean z12;
        id idVar;
        int i11;
        float f10;
        jd jdVar;
        int i12;
        float f11;
        r9 r9Var;
        ImageView imageView;
        int i13;
        int i14;
        float f12;
        jf0 jf0Var;
        hf0 hf0Var;
        ImageView imageView2;
        int i15;
        r9 r9Var2;
        ad adVar;
        ad adVar2;
        int i16 = this.g0;
        if (i16 == i10 && !z10) {
            return;
        }
        qd qdVar = this.c1;
        if (i10 != -1 && qdVar != null && qdVar.O1) {
            return;
        }
        this.g0 = i10;
        AnimatorSet animatorSet = this.r2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r2 = null;
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.p0;
        me meVar = this.Z0;
        y0 y0Var = this.e1;
        k3 k3Var = this.n0;
        s7 s7Var = this.j1;
        kj0 kj0Var = this.g1;
        if (i16 != i10) {
            if (i10 == -1) {
                k3Var.setVisibility(0);
                qdVar.setVisibility(0);
                ad adVar3 = this.v1;
                if (adVar3 != null) {
                    adVar3.D0(null, true);
                }
                y0Var.setVisibility(0);
                r9 r9Var3 = this.K1;
                if (r9Var3 == null || !r9Var3.u) {
                    ImageView imageView3 = this.i1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    G().setVisibility(0);
                    o0(false);
                }
                l5Var.setVisibility(0);
                if (this.O1 == 1) {
                    kj0Var.setVisibility(0);
                    s7Var.setVisibility(0);
                } else {
                    r9 r9Var4 = this.K1;
                    if (r9Var4 != null && !TextUtils.isEmpty(r9Var4.y)) {
                        kj0Var.setVisibility(8);
                        s7Var.setVisibility(0);
                    }
                }
                meVar.setVisibility(0);
            }
            if (i10 == 0 && (adVar2 = this.v1) != null) {
                adVar2.setVisibility(0);
            }
            if ((i10 == 0 || i16 == 0) && (adVar = this.v1) != null) {
                adVar.d1.setLayerType(2, null);
            }
            ad adVar4 = this.v1;
            if (adVar4 != null) {
                adVar4.O1.b(i10 != 0);
            }
            qdVar.L.b(i10 != -1);
            org.telegram.ui.Components.pc.e();
            if (this.B1 != null && i16 == 1) {
                i(null);
            }
            qf0 qf0Var = this.C1;
            if (qf0Var != null) {
                qf0Var.setAllowTouch(false);
            }
            this.k1.e(true);
            be beVar = this.n;
            nd ndVar = this.X0;
            Activity activity = this.b;
            if (i10 == 3) {
                if (this.r1 == null) {
                    id idVar2 = new id(this, activity, ndVar);
                    this.r1 = idVar2;
                    beVar.addView(idVar2.d);
                    beVar.addView(this.r1);
                }
                this.r1.setVisibility(0);
                r9 r9Var5 = this.K1;
                if (r9Var5 != null) {
                    this.r1.setEntry(r9Var5);
                }
            } else if (i16 == 3) {
                ndVar.b();
                id idVar3 = this.r1;
                if (idVar3 != null) {
                    idVar3.a.setCropEditorDrawing(idVar3);
                    idVar3.y = true;
                }
            }
            if (i10 == 4) {
                if (this.s1 == null) {
                    jd jdVar2 = new jd(this, activity, ndVar);
                    this.s1 = jdVar2;
                    beVar.addView(jdVar2.e);
                    beVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
            } else if (i16 == 4) {
                ndVar.b();
                jd jdVar3 = this.s1;
                if (jdVar3 != null) {
                    jdVar3.E = true;
                }
            }
        }
        this.b1.b((i10 == -1 || i10 == 2) && this.I > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        sf0 sf0Var = this.B1;
        boolean z13 = sf0Var == null && i10 == 1;
        float f13 = 1.0f;
        if (i10 == 1) {
            s();
            sf0 sf0Var2 = this.B1;
            this.v2 = sf0Var2;
            FrameLayout toolsView = sf0Var2 != null ? sf0Var2.getToolsView() : null;
            if (toolsView != null) {
                toolsView.setAlpha(0.0f);
                toolsView.setVisibility(0);
                f7 = 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
            } else {
                f7 = 0.0f;
            }
        } else {
            f7 = 0.0f;
            if (i16 == 1 && sf0Var != null) {
                this.v2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(sf0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.B1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i10 != 0) {
                    u();
                    this.v2 = this.v1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property, f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.v1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -AndroidUtilities.dp(16.0f), f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property2, AndroidUtilities.dp(48.0f), f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f), f7));
                } else if (i16 == 0 && this.v1 != null) {
                    this.v2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getTopLayout(), (Property<View, Float>) property3, f7));
                    View topLayout2 = this.v1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property3, f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property4, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                idVar = this.r1;
                if (idVar == null) {
                    kg.f fVar = idVar.h;
                    if (i10 == 3) {
                        Property property5 = View.ALPHA;
                        i11 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<kg.f, Float>) property5, 0.0f, 1.0f));
                        kg.f fVar2 = this.r1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f10 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar2, (Property<kg.f, Float>) property6, AndroidUtilities.dp(52.0f), f7));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property6, AndroidUtilities.dp(52.0f), f7));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new fc(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        i11 = 2;
                        f10 = 52.0f;
                        if (i16 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<kg.f, Float>) property7, 1.0f, 0.0f));
                            kg.f fVar3 = this.r1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(fVar3, (Property<kg.f, Float>) property8, f7, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property8, f7, AndroidUtilities.dp(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.r1.getAppearProgress(), f7);
                            ofFloat2.addUpdateListener(new fc(this, i11));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    i11 = 2;
                    f10 = 52.0f;
                }
                jdVar = this.s1;
                if (jdVar != null) {
                    kg.f fVar4 = jdVar.n;
                    if (i10 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i11];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<kg.f, Float>) property9, fArr));
                        kg.f fVar5 = this.s1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i11];
                        fArr2[0] = AndroidUtilities.dp(f10);
                        fArr2[1] = f7;
                        arrayList.add(ObjectAnimator.ofFloat(fVar5, (Property<kg.f, Float>) property10, fArr2));
                        float[] fArr3 = new float[i11];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.s1.r;
                        float[] fArr4 = new float[i11];
                        fArr4[0] = AndroidUtilities.dp(f10);
                        fArr4[1] = f7;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i11];
                        fArr5[0] = this.s1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new fc(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i16 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i11];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<kg.f, Float>) property11, fArr6));
                        kg.f fVar6 = this.s1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float dp = AndroidUtilities.dp(f10);
                        float[] fArr7 = new float[i11];
                        fArr7[0] = f7;
                        fArr7[1] = dp;
                        arrayList.add(ObjectAnimator.ofFloat(fVar6, (Property<kg.f, Float>) property12, fArr7));
                        float[] fArr8 = new float[i11];
                        // fill-array-data instruction
                        fArr8[0] = 1.0f;
                        fArr8[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.s1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.s1.r;
                        float dp2 = AndroidUtilities.dp(f10);
                        float[] fArr9 = new float[i11];
                        fArr9[0] = f7;
                        fArr9[1] = dp2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i11];
                        fArr10[0] = this.s1.getAppearProgress();
                        fArr10[1] = f7;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new fc(this, 4));
                        arrayList.add(ofFloat4);
                    }
                }
                Property property13 = View.ALPHA;
                if (i10 != -1 || i10 == 2) {
                    i12 = 1;
                    if (this.O1 == 1) {
                        f11 = 1.0f;
                        float[] fArr11 = new float[i12];
                        fArr11[0] = f11;
                        arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property13, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((r9Var = this.K1) == null || TextUtils.isEmpty(r9Var.y)))) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(y0Var, (Property<y0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                        imageView = this.i1;
                        if (imageView != null) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i10 == -1 || i10 == 2) && (r9Var2 = this.K1) != null && r9Var2.u) ? 1.0f : 0.0f));
                        } else {
                            i13 = 1;
                        }
                        int i17 = this.f0;
                        float[] fArr12 = new float[i13];
                        fArr12[0] = ((i17 != i13 || i17 == 2) && i10 == -1) ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property13, fArr12));
                        kd kdVar = this.h0;
                        if (i10 == i13) {
                            kdVar.setPivotY(kdVar.getMeasuredHeight() * 0.2f);
                            i14 = AndroidUtilities.dp(164.0f);
                        } else if (i10 == 0) {
                            kdVar.setPivotY(kdVar.getMeasuredHeight() * 0.6f);
                            i14 = AndroidUtilities.dp(40.0f);
                        } else if (i10 == 2) {
                            kdVar.setPivotY(0.0f);
                            i14 = meVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            f12 = (r10 - i14) / (kdVar.getHeight() - ((int) kdVar.getPivotY()));
                        } else {
                            f12 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(kdVar, (Property<kd, Float>) View.SCALE_X, f12));
                        arrayList.add(ObjectAnimator.ofFloat(kdVar, (Property<kd, Float>) View.SCALE_Y, f12));
                        if (i10 == -1) {
                            arrayList.add(ObjectAnimator.ofFloat(kdVar, (Property<kd, Float>) View.TRANSLATION_Y, 0.0f));
                        }
                        jf0Var = this.F1;
                        if (jf0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(jf0Var, (Property<jf0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        hf0Var = this.E1;
                        if (hf0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(hf0Var, (Property<hf0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(qdVar, (Property<qd, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                        float[] fArr13 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                        ld ldVar = this.l0;
                        arrayList.add(ObjectAnimator.ofFloat(ldVar, (Property<ld, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(ldVar, (Property<ld, Float>) property14, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                        if (i10 != -1 && i10 != 2) {
                            f13 = 0.0f;
                        }
                        FrameLayout frameLayout3 = this.Y0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f13));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + qdVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.j0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i10 == 2 ? -90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(y0Var, (Property<y0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        imageView2 = this.i1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        }
                        if (this.r0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i15 = 0;
                            ofFloat5.addUpdateListener(new zc(this, i15));
                            arrayList.add(ofFloat5);
                        } else {
                            i15 = 0;
                        }
                        if (meVar != null) {
                            r9 r9Var6 = this.K1;
                            boolean z14 = r9Var6 == null || !r9Var6.v() || !this.K1.t() || i10 == 2;
                            if (meVar.j0 != z14 || !z11) {
                                meVar.j0 = z14;
                                if (!z11) {
                                    meVar.i0.f(z14, true);
                                }
                                meVar.invalidate();
                            }
                        }
                        if (!z11) {
                            while (i15 < arrayList.size()) {
                                Animator animator = (Animator) arrayList.get(i15);
                                animator.setDuration(1L);
                                animator.start();
                                i15++;
                            }
                            if (i16 != i10) {
                                Q(i16, i10);
                                return;
                            }
                            return;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.r2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.r2.setDuration(320L);
                        this.r2.setInterpolator(wr.h);
                        this.r2.addListener(new uc(this, i16, i10, 1));
                        if (z12) {
                            this.r2.setStartDelay(120L);
                        }
                        this.r2.start();
                        return;
                    }
                } else {
                    i12 = 1;
                }
                f11 = 0.0f;
                float[] fArr112 = new float[i12];
                fArr112[0] = f11;
                arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property13, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((r9Var = this.K1) == null || TextUtils.isEmpty(r9Var.y)))) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(y0Var, (Property<y0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                imageView = this.i1;
                if (imageView != null) {
                }
                int i172 = this.f0;
                float[] fArr122 = new float[i13];
                fArr122[0] = ((i172 != i13 || i172 == 2) && i10 == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property13, fArr122));
                kd kdVar2 = this.h0;
                if (i10 == i13) {
                }
                if (i14 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(kdVar2, (Property<kd, Float>) View.SCALE_X, f12));
                arrayList.add(ObjectAnimator.ofFloat(kdVar2, (Property<kd, Float>) View.SCALE_Y, f12));
                if (i10 == -1) {
                }
                jf0Var = this.F1;
                if (jf0Var != null) {
                }
                hf0Var = this.E1;
                if (hf0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(qdVar, (Property<qd, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                float[] fArr132 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                ld ldVar2 = this.l0;
                arrayList.add(ObjectAnimator.ofFloat(ldVar2, (Property<ld, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(ldVar2, (Property<ld, Float>) property142, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                if (i10 != -1) {
                    f13 = 0.0f;
                }
                FrameLayout frameLayout32 = this.Y0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f13));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + qdVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.j0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i10 == 2 ? -90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(y0Var, (Property<y0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                imageView2 = this.i1;
                if (imageView2 != null) {
                }
                if (this.r0.c()) {
                }
                if (meVar != null) {
                }
                if (!z11) {
                }
            }
        }
        z12 = z13;
        if (i10 != 0) {
        }
        idVar = this.r1;
        if (idVar == null) {
        }
        jdVar = this.s1;
        if (jdVar != null) {
        }
        Property property132 = View.ALPHA;
        if (i10 != -1) {
        }
        i12 = 1;
        if (this.O1 == 1) {
        }
        f11 = 0.0f;
        float[] fArr1122 = new float[i12];
        fArr1122[0] = f11;
        arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property132, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((r9Var = this.K1) == null || TextUtils.isEmpty(r9Var.y)))) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(y0Var, (Property<y0, Float>) property132, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
        imageView = this.i1;
        if (imageView != null) {
        }
        int i1722 = this.f0;
        float[] fArr1222 = new float[i13];
        fArr1222[0] = ((i1722 != i13 || i1722 == 2) && i10 == -1) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property132, fArr1222));
        kd kdVar22 = this.h0;
        if (i10 == i13) {
        }
        if (i14 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(kdVar22, (Property<kd, Float>) View.SCALE_X, f12));
        arrayList.add(ObjectAnimator.ofFloat(kdVar22, (Property<kd, Float>) View.SCALE_Y, f12));
        if (i10 == -1) {
        }
        jf0Var = this.F1;
        if (jf0Var != null) {
        }
        hf0Var = this.E1;
        if (hf0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(qdVar, (Property<qd, Float>) property132, i10 == -1 ? 1.0f : 0.0f));
        float[] fArr1322 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
        ld ldVar22 = this.l0;
        arrayList.add(ObjectAnimator.ofFloat(ldVar22, (Property<ld, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(ldVar22, (Property<ld, Float>) property1422, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
        if (i10 != -1) {
        }
        FrameLayout frameLayout322 = this.Y0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f13));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + qdVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.j0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i10 == 2 ? -90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(y0Var, (Property<y0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        imageView2 = this.i1;
        if (imageView2 != null) {
        }
        if (this.r0.c()) {
        }
        if (meVar != null) {
        }
        if (!z11) {
        }
    }

    public final void m() {
        r9 r9Var;
        if (this.v1 == null || (r9Var = this.K1) == null || !r9Var.u) {
            return;
        }
        File file = r9Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.K1.W0 = null;
        }
        this.K1.W0 = r9.w(this.c, "webp");
        ad adVar = this.v1;
        r9 r9Var2 = this.K1;
        Bitmap t02 = adVar.t0(r9Var2.T0, false, false, true, this.O1 != 1, r9Var2);
        try {
            try {
                t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                if (t02.isRecycled()) {
                    return;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                try {
                    this.K1.W0.delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.K1.W0 = null;
                if (t02 == null || t02.isRecycled()) {
                    return;
                }
            }
            t02.recycle();
        } catch (Throwable th2) {
            if (t02 != null && !t02.isRecycled()) {
                t02.recycle();
            }
            throw th2;
        }
    }

    public final void m0(boolean z10) {
        bd bdVar;
        boolean z11 = false;
        i0(this.f0 == 0 && this.O1 == 1 && !this.I0.e && !I(), z10);
        this.G0.setSelected(this.A0.j());
        c0 c0Var = this.I0;
        c0(this.n0, c0Var == null || !c0Var.e, z10);
        c0(this.E0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.Y1 == null || this.I0.e || I()) ? false : true, z10);
        c0(this.F0, (this.a2 || this.O1 == -1 || this.f0 != 0 || (bdVar = this.B0) == null || !bdVar.a || this.I0.e || this.A0.j()) ? false : true, z10);
        c0(this.G0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.I0.e) ? false : true, z10);
        c0(this.H0, this.I0.e, z10);
        this.O0.e(this.A0.j() ? this.A0.getFilledProgress() : 0.0f, z10);
        boolean z12 = this.I0.e;
        x4 x4Var = this.n1;
        if (z12) {
            x4Var.u();
        } else {
            x4Var.e(true);
        }
        h(this.a2, z10);
        AndroidUtilities.updateViewShow(this.S0, this.O1 == -1 && this.f0 == 0);
        if (this.O1 == -1 && this.f0 == 0) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.R0, z11);
    }

    public final void n0() {
        this.H0.setTranslationX(-0.0f);
        float alpha = (this.H0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        this.F0.setTranslationX(-alpha);
        float alpha2 = (this.F0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha;
        this.G0.setTranslationX(-alpha2);
        float alpha3 = (this.G0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha2;
        this.E0.setTranslationX(-alpha3);
        float alpha4 = (this.E0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha3;
        this.n0.setTranslationX(0.0f);
        z zVar = this.I0.a;
        zVar.setPadding((int) ((this.n0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) (alpha4 + AndroidUtilities.dp(8.0f)), 0);
        zVar.invalidate();
    }

    public final void o() {
        boolean z10 = this.K != 0.0f || this.I < 1.0f || this.B2;
        if (z10 == this.A2) {
            return;
        }
        kb0 kb0Var = this.y;
        if (kb0Var != null) {
            kb0Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void o0(boolean z10) {
        hj0 hj0Var = this.h1;
        if (hj0Var != null) {
            int[] iArr = hj0Var.e;
            int i10 = 0;
            if (!z10) {
                r9 r9Var = this.K1;
                int i11 = (r9Var == null || !r9Var.y0) ? 0 : iArr[0] - 1;
                hj0Var.N(i11, false, true);
                this.h1.P(i11);
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            r9 r9Var2 = this.K1;
            if (r9Var2 != null && r9Var2.y0) {
                i10 = iArr[0];
            }
            hj0Var.P(i10);
            hj0 hj0Var2 = this.h1;
            if (hj0Var2 != null) {
                hj0Var2.start();
            }
        }
    }

    public final void p() {
        if (this.t2 < 0) {
            this.t2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.u2 = arrayList;
            arrayList.add("off");
            this.u2.add("auto");
            this.u2.add("on");
            float f7 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            m3 m3Var = this.s;
            m3Var.o = f7;
            m3Var.n = m3.f(f7);
            m3Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            m3 m3Var2 = this.s;
            m3Var2.p = f10;
            m3Var2.i();
        }
    }

    public final void p0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        tb tbVar = new tb(this, 2);
        ad adVar = this.v1;
        r9 r9Var = this.K1;
        if (adVar == null || r9Var == null) {
            tbVar.run();
            return;
        }
        r9Var.f();
        boolean u02 = adVar.u0();
        boolean z10 = adVar.O0.getPainting().E;
        Utilities.searchQueue.postRunnable(new wb(this, adVar, r9Var.i0, r9Var.j0, r9Var, z10, u02, tbVar, 1));
    }

    public final void q(boolean z10) {
        nd ndVar;
        if (this.d) {
            rb rbVar = this.q0;
            if (rbVar != null) {
                rbVar.dismiss();
                this.q0 = null;
            }
            r9 r9Var = this.K1;
            long j3 = 0;
            if (r9Var != null && !r9Var.h) {
                if ((this.v && r9Var.g) || r9Var.b != 0) {
                    r9Var.j = false;
                }
                r9Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 == null || (ndVar = this.X0) == null) {
                nd ndVar2 = this.X0;
                if (ndVar2 != null && !z10) {
                    ndVar2.set(null);
                }
                g(0.0f, z10, new tb(this, 23));
                int i10 = this.J;
                if (i10 == 1 || i10 == 0) {
                    this.n.setBackgroundColor(0);
                    this.b1.b(false, true);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
                int i11 = this.c;
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            t71 t71Var = ndVar.y;
            if (t71Var != null) {
                t71Var.B();
                ndVar.y.H();
                ndVar.y = null;
            }
            t71 t71Var2 = ndVar.x;
            if (t71Var2 != null) {
                j3 = t71Var2.n();
                ndVar.x.B();
                ndVar.x.H();
                ndVar.x = null;
            }
            t71 t71Var3 = ndVar.e;
            if (t71Var3 != null) {
                j3 = t71Var3.n();
                ndVar.e.B();
                ndVar.e.H();
                ndVar.e = null;
            }
            callback4.run(Long.valueOf(j3), new dc(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.w));
        }
    }

    public final boolean q0() {
        bd bdVar;
        if ((!this.P1 && !this.Q1) || (bdVar = this.B0) == null || !bdVar.isFrontface()) {
            return false;
        }
        int i10 = this.t2;
        return i10 == 2 || (i10 == 1 && this.c2);
    }

    public final void r() {
        Activity activity = this.b;
        if (this.B0 != null || activity == null) {
            return;
        }
        this.B0 = new bd(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        m8 m8Var = this.O0;
        if (m8Var != null) {
            m8Var.g0 = 0.0f;
            m8Var.h0.d(0.0f, true);
        }
        this.B0.recordHevc = !this.A0.j();
        this.B0.setThumbDrawable(A());
        this.B0.initTexture();
        this.B0.setDelegate(new cc(this, 0));
        c0(this.F0, this.B0.a && this.f0 == 0, true);
        this.G0.setTranslationX(this.B0.a ? 0.0f : AndroidUtilities.dp(46.0f));
        this.A0.setCameraView(this.B0);
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.W0.u();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else if ((!i1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", i1.p(ApplicationLoader.applicationContext, false))) && this.B0.a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
            this.l1.u();
        }
        if (this.C0 == null) {
            this.C0 = new i8(activity, new ub(this, 3));
        }
        this.C0.a(this.B0);
        x8 x8Var = this.D0;
        if (x8Var != null) {
            md mdVar = this.A0;
            Object blurRenderNode = mdVar.getBlurRenderNode();
            x8Var.F = mdVar;
            x8Var.G = blurRenderNode;
            x8Var.invalidate();
        }
    }

    public final void s() {
        r9 r9Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.B1 != null || (r9Var = this.K1) == null) {
            return;
        }
        if (r9Var.K) {
            bitmap = null;
        } else {
            if (r9Var.Z0 == null) {
                q6 = this.X0.getPhotoBitmap();
            } else {
                cc ccVar = new cc(this, 11);
                Point point = AndroidUtilities.displaySize;
                q6 = r9.q(ccVar, point.x, point.y, 0, true);
            }
            bitmap = q6;
        }
        if (bitmap != null || this.K1.K) {
            h71 textureView = this.X0.getTextureView();
            int orientation = this.X0.getOrientation();
            r9 r9Var2 = this.K1;
            sf0 sf0Var = new sf0(this.b, textureView, bitmap, null, orientation, r9Var2 != null ? r9Var2.a1 : null, null, 0, false, false, this.r0, this.a);
            this.B1 = sf0Var;
            this.r.addView(sf0Var);
            qf0 qf0Var = this.C1;
            if (qf0Var != null) {
                qf0Var.setFilterView(this.B1);
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
            j();
            hf0 blurControl = this.B1.getBlurControl();
            this.E1 = blurControl;
            if (blurControl != null) {
                this.h0.addView(blurControl);
            }
            jf0 curveControl = this.B1.getCurveControl();
            this.F1 = curveControl;
            if (curveControl != null) {
                this.h0.addView(curveControl);
            }
            V();
            this.B1.getDoneTextView().setOnClickListener(new vb(this, 13));
            this.B1.getCancelTextView().setOnClickListener(new vb(this, 14));
            this.B1.getToolsView().setVisibility(8);
            this.B1.getToolsView().setAlpha(0.0f);
            this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.B1.i0.setVisibility(0);
        }
    }

    public final void t(boolean z10) {
        if (this.M0 != null) {
            md mdVar = this.A0;
            if ((mdVar != null && mdVar.j()) == this.M0.P) {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (this.M0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.m2;
        boolean z11 = !z10;
        md mdVar2 = this.A0;
        xc xcVar = new xc(this, this.c, this.b, this.a, albumEntry, z10, z11, mdVar2 != null && mdVar2.j());
        this.M0 = xcVar;
        xcVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, x.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new mc(this, 1));
        this.M0.setOnSelectListener(new lc(z10, this, 0));
        this.M0.setOnSelectMultipleListener(new xh.x0(this, 2));
        s4.b0 b0Var = this.l2;
        if (b0Var != null) {
            x3 x3Var = this.M0.e;
            x3Var.B = b0Var;
            x3Var.l0();
        }
        this.n.addView(this.M0, w7.a6.e(-1, -1, 119));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a4  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        Bitmap bitmap;
        boolean z10;
        r9 r9Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        r9 r9Var2;
        og.h1 renderView;
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
        r9 r9Var3 = this.K1;
        Bitmap decodeFile = (r9Var3 == null || !(r9Var3.c || r9Var3.g || this.H1 != null) || (file3 = r9Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        r9 r9Var4 = this.K1;
        if (r9Var4 == null || (!(r9Var4.c || r9Var4.g || this.H1 != null) || (file2 = r9Var4.Q0) == null)) {
            bitmap = null;
        } else {
            bitmap = BitmapFactory.decodeFile(file2.getPath());
            if (bitmap != null) {
                z10 = true;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap3 = bitmap;
                int measuredWidth = this.h0.getMeasuredWidth();
                int measuredHeight = this.h0.getMeasuredHeight();
                r9Var = this.K1;
                if (r9Var != null || r9Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = r9Var != null ? file : r9Var.L;
                if (r9Var == null && r9Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (r9Var != null || r9Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.X0.getOrientation();
                r9Var2 = this.K1;
                Object obj2 = obj;
                if (r9Var2 != null) {
                    obj2 = r9Var2.T0;
                }
                ?? r13 = obj2;
                MediaController.CropState cropState = new MediaController.CropState();
                d8 d8Var = this.s0;
                nd ndVar = this.X0;
                Activity activity = this.b;
                boolean z15 = z12;
                ad adVar = new ad(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, r9Var2, measuredWidth, measuredHeight, cropState, this.r0, this.a, d8Var, ndVar);
                this.v1 = adVar;
                r9 r9Var5 = this.K1;
                adVar.setHasAudio(r9Var5 == null && r9Var5.y != null);
                this.v1.setBlurManager(this.r0);
                this.r.addView(this.v1);
                renderView = this.v1.getRenderView();
                this.w1 = renderView;
                if (renderView != null) {
                    renderView.getPainting().E = z15;
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
                V();
                this.v1.setOnDoneButtonClickedListener(new tb(this, 21));
                this.v1.setOnCancelButtonClickedListener(new tb(this, 22));
                ad adVar2 = this.v1;
                adVar2.R0.setVisibility(0);
                adVar2.O0.setVisibility(0);
                adVar2.P0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.h0.getMeasuredWidth();
        int measuredHeight2 = this.h0.getMeasuredHeight();
        r9Var = this.K1;
        if (r9Var != null) {
        }
        file = null;
        z11 = false;
        if (r9Var != null) {
        }
        if (r9Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (r9Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.X0.getOrientation();
        r9Var2 = this.K1;
        Object obj22 = obj;
        if (r9Var2 != null) {
        }
        ?? r132 = obj22;
        MediaController.CropState cropState2 = new MediaController.CropState();
        d8 d8Var2 = this.s0;
        nd ndVar2 = this.X0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        ad adVar3 = new ad(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, r9Var2, measuredWidth2, measuredHeight2, cropState2, this.r0, this.a, d8Var2, ndVar2);
        this.v1 = adVar3;
        r9 r9Var52 = this.K1;
        adVar3.setHasAudio(r9Var52 == null && r9Var52.y != null);
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
        V();
        this.v1.setOnDoneButtonClickedListener(new tb(this, 21));
        this.v1.setOnCancelButtonClickedListener(new tb(this, 22));
        ad adVar22 = this.v1;
        adVar22.R0.setVisibility(0);
        adVar22.O0.setVisibility(0);
        adVar22.P0.setVisibility(0);
    }

    public final void v(boolean z10) {
        i8 i8Var = this.C0;
        if (i8Var != null) {
            i8Var.f = null;
            Utilities.globalQueue.cancelRunnable(i8Var.h);
            this.C0 = null;
            md mdVar = this.A0;
            if (mdVar != null) {
                mdVar.c.b(null);
            }
        }
        x8 x8Var = this.D0;
        if (x8Var != null) {
            x8Var.F = null;
            x8Var.G = null;
            x8Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                b0(new tb(this, 8));
                return;
            }
            b0(new tb(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            md mdVar2 = this.A0;
            if (mdVar2 != null) {
                mdVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void w() {
        xc xcVar = this.M0;
        if (xcVar == null) {
            return;
        }
        this.n.removeView(xcVar);
        this.M0 = null;
        ValueAnimator valueAnimator = this.n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n2 = null;
        }
        o1.k kVar = this.o2;
        if (kVar != null) {
            kVar.c();
            this.o2 = null;
        }
        this.p2 = null;
    }

    public final void y() {
        sf0 sf0Var = this.B1;
        if (sf0Var == null) {
            return;
        }
        sf0Var.e();
        this.C1.setFilterView(null);
        this.r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        hf0 hf0Var = this.E1;
        if (hf0Var != null) {
            this.h0.removeView(hf0Var);
            this.E1 = null;
        }
        jf0 jf0Var = this.F1;
        if (jf0Var != null) {
            this.h0.removeView(jf0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void z() {
        ad adVar = this.v1;
        if (adVar == null) {
            return;
        }
        adVar.R0.removeAllViews();
        ad adVar2 = this.v1;
        adVar2.O0.h();
        adVar2.R0.setVisibility(8);
        adVar2.Q0.setVisibility(8);
        adVar2.E0.postRunnable(new f0(1));
        y6 y6Var = adVar2.k2;
        if (y6Var != null) {
            y6Var.dismiss();
        }
        og.a0 a0Var = adVar2.T1;
        if (a0Var != null) {
            a0Var.dismiss();
        }
        this.r.removeView(this.v1);
        this.v1 = null;
        og.h1 h1Var = this.w1;
        if (h1Var != null) {
            this.h0.removeView(h1Var);
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
}
