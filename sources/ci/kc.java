package ci;

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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ca1;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.o11;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class kc implements NotificationCenter.NotificationCenterDelegate {
    public static kc F2;
    public final xb A0;
    public View A1;
    public boolean A2;
    public nb B0;
    public vf0 B1;
    public boolean B2;
    public f7 C0;
    public final tf0 C1;
    public sb C2;
    public final t7 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final wc E0;
    public kf0 E1;
    public ValueAnimator E2;
    public fc F;
    public final xc F0;
    public mf0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final wc H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final ad J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public k8 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public jb M0;
    public long M1;
    public long N;
    public v0 N0;
    public boolean N1;
    public boolean O;
    public final j7 O0;
    public int O1;
    public final AnimationNotificationsLocker P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final cb Q0;
    public boolean Q1;
    public Utilities.Callback4 R;
    public final v2 R0;
    public boolean R1;
    public int S;
    public final v2 S0;
    public boolean S1;
    public int T;
    public final b4 T0;
    public float T1;
    public int U;
    public final b4 U0;
    public int U1;
    public boolean V;
    public final ca1 V0;
    public boolean V1;
    public boolean W;
    public final e4 W0;
    public boolean W1;
    public boolean X;
    public final yb X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final vc Z0;
    public AnimatorSet Z1;
    public final ai.d a;
    public int a0;
    public final zc a1;
    public boolean a2;
    public final Activity b;
    public int b0;
    public final u6 b1;
    public boolean b2;
    public final int c;
    public final RectF c0;
    public final ac c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final bb d1;
    public boolean d2;
    public boolean e;
    public final Path e0;
    public final u0 e1;
    public Runnable e2;
    public final WindowManager f;
    public int f0;
    public kj0 f1;
    public AnimatorSet f2;
    public int g0;
    public final nj0 g1;
    public ma g2;
    public final WindowManager.LayoutParams h;
    public final wb h0;
    public kj0 h1;
    public boolean h2;
    public final FrameLayout i0;
    public ImageView i1;
    public AnimatorSet i2;
    public final LinearLayout j0;
    public final r6 j1;
    public ValueAnimator j2;
    public final FrameLayout k0;
    public final e4 k1;
    public boolean k2;
    public final ai.f0 l0;
    public final e4 l1;
    public s4.b0 l2;
    public final FrameLayout m0;
    public final e4 m1;
    public MediaController.AlbumEntry m2;
    public final jc n;
    public final v2 n0;
    public final e4 n1;
    public ValueAnimator n2;
    public final d8 o0;
    public final v6 o1;
    public o1.k o2;
    public final org.telegram.ui.ActionBar.i5 p0;
    public final yc p1;
    public Boolean p2;
    public ea q0;
    public p q1;
    public qa q2;
    public final cc r;
    public final org.telegram.ui.Components.ka r0;
    public ub r1;
    public AnimatorSet r2;
    public final x2 s;
    public final a7 s0;
    public vb s1;
    public boolean s2;
    public final ab t0;
    public final vc t1;
    public int t2;
    public boolean u0;
    public final d u1;
    public ArrayList u2;
    public boolean v;
    public long v0;
    public mb v1;
    public FrameLayout v2;
    public long w;
    public String w0;
    public pg.f1 w1;
    public boolean w2;
    public bc x;
    public TLRPC.InputPeer x0;
    public View x1;
    public ga x2;
    public final ib0 y;
    public ca y0;
    public View y1;
    public ai.o8 y2;
    public t z0;
    public View z1;
    public boolean z2;

    public kc(Activity activity, int i10) {
        int i11;
        ai.d dVar = new ai.d();
        this.a = dVar;
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
        this.y0 = new ca();
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
        fb fbVar = new fb(this);
        this.d2 = true;
        this.k2 = true;
        this.t2 = -1;
        this.b = activity;
        this.c = i10;
        LaunchActivity launchActivity = LaunchActivity.G1;
        this.y = launchActivity != null ? new ib0(launchActivity, true) : null;
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
        jc jcVar = new jc(this, activity);
        this.n = jcVar;
        pa paVar = new pa(this, i12);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(jcVar, paVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        x2 x2Var = new x2(activity, windowManager, this.n, layoutParams);
        this.s = x2Var;
        x2Var.a(new qb(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        jc jcVar2 = this.n;
        cc ccVar = new cc(this, activity);
        this.r = ccVar;
        jcVar2.addView(ccVar);
        cc ccVar2 = this.r;
        wb wbVar = new wb(this, activity);
        this.h0 = wbVar;
        ccVar2.addView(wbVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.r0 = new org.telegram.ui.Components.ka(this.h0);
        this.s0 = new a7();
        cc ccVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.i0 = frameLayout;
        ccVar3.addView(frameLayout);
        cc ccVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.k0 = frameLayout2;
        ccVar4.addView(frameLayout2);
        cc ccVar5 = this.r;
        ai.f0 f0Var = new ai.f0(this, activity, 2);
        this.l0 = f0Var;
        ccVar5.addView(f0Var);
        int i15 = 8;
        this.l0.setVisibility(8);
        this.l0.setAlpha(0.0f);
        cc ccVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        ccVar6.addView(frameLayout3);
        org.telegram.ui.Components.rc.a(this.n, new z8(2));
        xb xbVar = new xb(this, activity, this.r0, this.r, dVar);
        this.A0 = xbVar;
        jc jcVar3 = this.n;
        Objects.requireNonNull(jcVar3);
        xbVar.setCancelGestures(new androidx.fragment.app.a0(jcVar3, 23));
        this.A0.setResetState(new ga(this, 13));
        this.h0.addView(this.A0, w7.z5.e(-1, -1, 119));
        this.A0.setOnClickListener(new ia(this, 12));
        wb wbVar2 = this.h0;
        int i16 = this.J;
        wbVar2.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
        wb wbVar3 = this.h0;
        float dp = AndroidUtilities.dp(12.0f);
        ai.k2 k2Var = yf.f0.a;
        wbVar3.setOutlineProvider(new yf.d0(0, dp));
        this.h0.setClipToOutline(true);
        ga gaVar = new ga(this, 14);
        tf0 tf0Var = new tf0(activity);
        tf0Var.a = new TextPaint(1);
        tf0Var.b = new TextPaint(1);
        tr trVar = tr.h;
        tf0Var.s = new org.telegram.ui.Components.e6(tf0Var, 0L, 350L, trVar);
        tf0Var.I = new lc0(tf0Var, i15);
        tf0Var.x = gaVar;
        this.C1 = tf0Var;
        yb ybVar = new yb(this, activity, this.r0, this.s0);
        this.X0 = ybVar;
        ybVar.setCollageView(this.A0);
        yb ybVar2 = this.X0;
        ybVar2.v = new ga(this, 15);
        ybVar2.setOnTapListener(new ga(this, i14));
        this.X0.setVisibility(8);
        yb ybVar3 = this.X0;
        ybVar3.N = new ga(this, 17);
        this.h0.addView(ybVar3, w7.z5.e(-1, -1, 119));
        this.h0.addView(this.C1, w7.z5.e(-1, -1, 119));
        jc jcVar4 = this.n;
        ac acVar = new ac(this, activity, jcVar4, jcVar4, this.r, dVar, this.r0);
        this.c1 = acVar;
        acVar.setAccount(i10);
        int i17 = 6;
        this.c1.setUiBlurBitmap(new pa(this, i17));
        org.telegram.ui.Components.rc.a(this.l0, new ai.w4(this, 3));
        this.c1.setOnHeightUpdate(new ha(this, 13));
        this.c1.setOnPeriodUpdate(new ha(this, 4));
        long j3 = this.N;
        if (j3 != 0) {
            this.c1.setDialogId(j3);
        }
        this.c1.setOnPremiumHint(new ha(this, 5));
        this.c1.setOnKeyboardOpen(new ha(this, i17));
        ab abVar = new ab(this, activity, i13);
        this.t0 = abVar;
        this.r.addView(abVar);
        vc vcVar = new vc(activity, this.r, this.h0, dVar, this.r0);
        this.Z0 = vcVar;
        vcVar.setOnTimelineClick(new ga(this, 10));
        this.Z0.setOnHeightChange(new ga(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f7 = 388;
        frameLayout4.addView(this.Z0, w7.z5.d(-1, f7, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        zc zcVar = new zc(activity);
        this.a1 = zcVar;
        zcVar.setVisibility(8);
        this.a1.a(false);
        this.Y0.addView(this.a1, w7.z5.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.l0.addView(this.Y0, w7.z5.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.l0.addView(this.c1, w7.z5.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        vc vcVar2 = new vc(activity, this.r, this.h0, dVar, this.r0);
        this.t1 = vcVar2;
        vcVar2.X0 = true;
        vcVar2.setVisibility(8);
        this.t1.setAlpha(0.0f);
        this.l0.addView(this.t1, w7.z5.d(-1, f7, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        bb bbVar = new bb(this, activity, dVar, this.r0);
        this.d1 = bbVar;
        bbVar.setVisibility(8);
        this.l0.addView(this.d1, w7.z5.e(-1, -2, 85));
        v2 v2Var = new v2(activity);
        this.n0 = v2Var;
        v2Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        v2 v2Var2 = this.n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        v2Var2.setScaleType(scaleType);
        this.n0.setImageResource(R.drawable.msg_photo_back);
        v2 v2Var3 = this.n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        v2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.n0.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.n0.setOnClickListener(new ia(this, i12));
        this.i0.addView(this.n0, w7.z5.e(56, 56, 51));
        this.s.a(this.n0);
        d8 d8Var = new d8(activity, i10);
        this.o0 = d8Var;
        d8Var.a(false, false);
        this.o0.setOnClickListener(new ai.f2(i17, this, activity));
        this.i0.addView(this.o0, w7.z5.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(activity);
        this.p0 = i5Var;
        i5Var.setTextSize(20);
        this.p0.setGravity(19);
        this.p0.setTextColor(-1);
        this.p0.setTypeface(AndroidUtilities.bold());
        this.p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.p0.setAlpha(0.0f);
        this.p0.setVisibility(8);
        this.p0.setEllipsizeByGradient(true);
        this.p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.i0.addView(this.p0, w7.z5.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.j0.setGravity(5);
        this.i0.addView(this.j0, w7.z5.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        ha haVar = new ha(this, 7);
        jc jcVar5 = this.n;
        u0 u0Var = new u0(activity);
        u0Var.w = true;
        u0Var.x = true;
        u0Var.h = haVar;
        u0Var.a = i10;
        u0Var.b = jcVar5;
        u0Var.setScaleType(scaleType);
        u0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        u0Var.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        u0Var.setVisibility(8);
        u0Var.setAlpha(0.0f);
        u0Var.setOnClickListener(new ai.v0(u0Var, 9));
        u0Var.f = new wp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        u0Var.d();
        this.e1 = u0Var;
        e4 e4Var = new e4(activity, 1);
        e4Var.l(1.0f, -71.0f);
        e4Var.d = 2000L;
        e4Var.U = false;
        e4Var.H.o(true, false, false);
        this.k1 = e4Var;
        e4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.k1, w7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        nj0 nj0Var = new nj0(activity);
        this.g1 = nj0Var;
        nj0Var.setScaleType(scaleType);
        nj0 nj0Var2 = this.g1;
        k8 k8Var = this.K1;
        nj0Var2.setImageResource((k8Var == null || !k8Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.g1.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.g1.setOnClickListener(new ia(this, 2));
        this.g1.setVisibility(8);
        this.g1.setAlpha(0.0f);
        r6 r6Var = new r6(activity);
        this.j1 = r6Var;
        r6Var.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.j1.setVisibility(8);
        this.j1.setAlpha(0.0f);
        this.j1.setOnClickListener(new ia(this, 3));
        this.j0.addView(this.j1, w7.z5.q(46, 56, 53));
        this.j0.addView(this.g1, w7.z5.q(46, 56, 53));
        this.j0.addView(this.e1, w7.z5.e(46, 56, 53));
        wc wcVar = new wc(activity);
        this.E0 = wcVar;
        wcVar.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.E0.setOnClickListener(new ia(this, 4));
        this.E0.setOnLongClickListener(new m5(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.s.a(this.E0);
        this.i0.addView(this.E0, w7.z5.e(56, 56, 53));
        xc xcVar = new xc(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = xcVar;
        xcVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new ia(this, 5));
        boolean q6 = d1.q(activity);
        this.F0.setVisibility(q6 ? 0 : 8);
        this.F0.setAlpha(q6 ? 1.0f : 0.0f);
        this.s.a(this.F0);
        this.i0.addView(this.F0, w7.z5.e(56, 56, 53));
        z zVar = new z(activity);
        this.G0 = zVar;
        zVar.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        if (this.z0 == null) {
            i11 = 6;
            this.z0 = (t) t.a().get(6);
        } else {
            i11 = 6;
        }
        this.G0.setOnClickListener(new ia(this, i11));
        this.G0.a(new u(this.z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.s.a(this.G0);
        this.i0.addView(this.G0, w7.z5.e(56, 56, 53));
        wc wcVar2 = new wc(activity);
        this.H0 = wcVar2;
        wcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new ia(this, 7));
        this.s.a(this.H0);
        this.i0.addView(this.H0, w7.z5.e(56, 56, 53));
        y yVar = new y(activity, this.s);
        this.I0 = yVar;
        yVar.a.v0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new ha(this, i15));
        this.i0.addView(this.I0, w7.z5.e(-1, 56, 53));
        e4 e4Var2 = new e4(activity, 1);
        e4Var2.l(1.0f, -20.0f);
        e4Var2.d = 5000L;
        e4Var2.i();
        e4Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        e4Var2.l0 = new ai.f(9);
        this.l1 = e4Var2;
        e4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.l1, w7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        e4 e4Var3 = new e4(activity, 2);
        e4Var3.l(0.0f, 28.0f);
        e4Var3.d = 5000L;
        e4Var3.p(true);
        this.m1 = e4Var3;
        this.i0.addView(e4Var3, w7.z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        e4 e4Var4 = new e4(activity, 1);
        e4Var4.l(1.0f, -20.0f);
        e4Var4.d = 5000L;
        e4Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.n1 = e4Var4;
        e4Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.n1, w7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ad adVar = new ad(activity);
        Paint paint = new Paint(1);
        adVar.a = paint;
        Paint paint2 = new Paint(1);
        adVar.b = paint2;
        adVar.e = new org.telegram.ui.Components.e6(adVar, 0L, 250L, trVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        adVar.c = o6Var;
        o6Var.k(0.3f, 250L, trVar);
        o6Var.t(AndroidUtilities.dp(13.0f));
        o6Var.r(-1);
        o6Var.u(AndroidUtilities.bold());
        o6Var.setCallback(adVar);
        o6Var.b = 1;
        adVar.a(0L, false);
        this.J0 = adVar;
        i0(false, false);
        this.i0.addView(this.J0, w7.z5.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        j7 j7Var = new j7(activity);
        this.O0 = j7Var;
        j7Var.setDelegate(fbVar);
        j7 j7Var2 = this.O0;
        boolean z10 = this.O1 == 1;
        j7Var2.n0 = -1.0f;
        j7Var2.o0 = z10;
        j7Var2.invalidate();
        this.k0.addView(this.O0, w7.z5.e(-1, 100, 87));
        this.s.a(this.O0);
        this.O0.e(this.A0.j() ? this.A0.getFilledProgress() : 0.0f, true);
        d dVar2 = new d(activity, dVar, true);
        this.P0 = dVar2;
        dVar2.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.k0.addView(this.P0, w7.z5.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new ia(this, i15));
        e4 e4Var5 = new e4(activity, 3);
        e4Var5.p(true);
        e4Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        e4Var5.h = AndroidUtilities.dp(320.0f);
        e4Var5.d = 5000L;
        e4Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = e4Var5;
        this.k0.addView(e4Var5, w7.z5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        ca1 ca1Var = new ca1(activity);
        this.V0 = ca1Var;
        ca1Var.M = false;
        ca1Var.setAlpha(0.0f);
        this.k0.addView(this.V0, w7.z5.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new pa(this, 4));
        ca1 ca1Var2 = this.V0;
        this.T1 = 0.0f;
        ca1Var2.b(0.0f, false);
        int i18 = 12;
        t7 t7Var = new t7(activity, i10, new ga(this, i18));
        this.D0 = t7Var;
        t7Var.c = new ha(this, 9);
        this.k0.addView(t7Var, w7.z5.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        cb cbVar = new cb(this, activity);
        this.Q0 = cbVar;
        cbVar.setOnSwitchModeListener(new ha(this, 10));
        this.Q0.setOnSwitchingModeListener(new ha(this, 11));
        this.m0.addView(this.Q0, w7.z5.e(-1, 48, 55));
        this.s.a(this.Q0);
        v2 v2Var4 = new v2(activity);
        this.R0 = v2Var4;
        v2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.z5.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.R0);
        this.R0.setOnClickListener(new ia(this, 9));
        v2 v2Var5 = new v2(activity);
        this.S0 = v2Var5;
        v2Var5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.z5.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new ia(this, 10));
        b4 b4Var = new b4(activity);
        this.T0 = b4Var;
        this.m0.addView(b4Var, w7.z5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.T0);
        b4 b4Var2 = new b4(activity);
        this.U0 = b4Var2;
        b4Var2.a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        b4Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.z5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        d dVar3 = new d(activity, dVar, true);
        dVar3.setRoundRadius(24);
        this.u1 = dVar3;
        dVar3.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.u1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.u1.setOnClickListener(new ia(this, 11));
        this.m0.addView(this.u1, w7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        u6 u6Var = new u6(activity);
        u6Var.b = new ArrayList();
        u6Var.e = true;
        u6Var.h = true;
        View view = new View(activity);
        u6Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        u6Var.addView(view, w7.z5.e(-1, -1, 119));
        u6Var.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        u6Var.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        u6Var.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        u6Var.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        u6Var.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        u6Var.d = string;
        u6Var.e = true;
        t6 t6Var = new t6(u6Var, activity, string, true);
        u6Var.c = t6Var;
        t6Var.setContentDescription(LocaleController.getString(R.string.Send));
        u6Var.addView(u6Var.c, w7.z5.c(-2.0f, -2));
        u6Var.e();
        this.b1 = u6Var;
        u6Var.setVisibility(8);
        this.b1.setOnClickListener(new ha(this, i18));
        this.m0.addView(this.b1, w7.z5.e(-1, 52, 23));
        yc ycVar = new yc(activity);
        this.p1 = ycVar;
        ycVar.setAlpha(0.0f);
        this.p1.setVisibility(8);
        this.h0.addView(this.p1, w7.z5.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        v6 v6Var = new v6(activity, i10, dVar);
        this.o1 = v6Var;
        this.h0.addView(v6Var, w7.z5.e(-1, -1, 119));
        m0(false);
    }

    public static kc E(Activity activity, int i10) {
        kc kcVar = F2;
        if (kcVar != null && (kcVar.b != activity || kcVar.c != i10)) {
            kcVar.q(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new kc(activity, i10);
        }
        return F2;
    }

    public static void a(kc kcVar) {
        nb nbVar = kcVar.B0;
        if (nbVar == null || nbVar.getTextureView() == null) {
            kcVar.c2 = false;
            return;
        }
        Bitmap bitmap = kcVar.B0.getTextureView().getBitmap();
        if (bitmap == null) {
            kcVar.c2 = false;
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
        kcVar.c2 = f10 < 0.22f;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(kc kcVar) {
        Activity activity = kcVar.b;
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

    public static void c(kc kcVar) {
        ValueAnimator valueAnimator = kcVar.j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            kcVar.j2 = null;
        }
        int i10 = 0;
        kcVar.k2 = false;
        cc ccVar = kcVar.r;
        float f7 = ccVar.a;
        float f10 = ccVar.b;
        ccVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        kcVar.j2 = ofFloat;
        ofFloat.addUpdateListener(new xa(kcVar, f7, f10, i10));
        kcVar.j2.setDuration(340L);
        kcVar.j2.setInterpolator(tr.h);
        kcVar.j2.addListener(new ib(kcVar, i10));
        kcVar.j2.start();
    }

    public static boolean d(kc kcVar) {
        Activity activity = kcVar.b;
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
        spannableString.setSpan(new rb(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        kc kcVar = F2;
        if (kcVar != null) {
            kcVar.q(false);
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
        k8 k8Var = this.K1;
        if (k8Var != null) {
            return k8Var.r();
        }
        return 1;
    }

    public final String C() {
        nb nbVar = this.B0;
        if (nbVar == null || nbVar.getCameraSession() == null) {
            return null;
        }
        if (!this.B0.isFrontface() || this.B0.getCameraSession().hasFlashModes()) {
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        p();
        return (String) this.u2.get(this.t2);
    }

    public final v0 D() {
        if (this.N0 == null) {
            v0 v0Var = new v0(this.b);
            this.N0 = v0Var;
            this.k0.addView(v0Var, w7.z5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String F() {
        nb nbVar = this.B0;
        if (nbVar == null || nbVar.getCameraSession() == null) {
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
            kj0 kj0Var = new kj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.h1 = kj0Var;
            kj0Var.h = true;
            k8 k8Var = this.K1;
            if (k8Var == null || !k8Var.y0) {
                kj0Var.P(0);
                this.h1.M(0);
            } else {
                kj0Var.M(35);
                this.h1.P(36);
            }
            this.h1.Z = true;
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.J9, this.a);
            this.h1.Q(v02, "Sunny");
            this.h1.Q(v02, "Path 6");
            this.h1.Q(v02, "Path");
            this.h1.Q(v02, "Path 5");
            this.h1.o();
            ImageView imageView = new ImageView(this.b);
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.i1.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
            this.i1.setOnClickListener(new ia(this, 0));
            this.i1.setVisibility(8);
            this.i1.setImageDrawable(this.h1);
            this.i1.setAlpha(0.0f);
            this.j0.addView(this.i1, 0, w7.z5.q(46, 56, 53));
        }
        return this.i1;
    }

    public final void H() {
        mb mbVar = this.v1;
        if (mbVar == null) {
            return;
        }
        this.v2 = null;
        mbVar.getTopLayout().setAlpha(0.0f);
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
        jb jbVar;
        if (this.W || (jbVar = this.M0) == null) {
            return false;
        }
        return jbVar.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
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
        k8 k8Var;
        k8 k8Var2;
        d dVar;
        org.telegram.ui.ActionBar.i5 i5Var;
        int i11;
        int i12;
        float dp;
        ImageView imageView;
        k8 k8Var3;
        k8 k8Var4;
        k8 k8Var5;
        k8 k8Var6;
        nb nbVar;
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
        u6 u6Var = this.b1;
        if (u6Var != null) {
            u6Var.b(i10 == 1, z10);
        }
        y yVar = this.I0;
        i0(i10 == 0 && this.O1 == 1 && !yVar.e && !I(), z10);
        if (i10 != 1) {
            this.a1.a(z10);
        }
        c0(this.n0, !yVar.e, z10);
        c0(this.E0, (this.a2 || i10 != 0 || yVar.e || this.Y1 == null || I()) ? false : true, z10);
        boolean z11 = this.a2;
        xb xbVar = this.A0;
        c0(this.F0, (z11 || i10 != 0 || (nbVar = this.B0) == null || !nbVar.a || yVar.e || xbVar.j()) ? false : true, true);
        c0(this.G0, (this.a2 || i10 != 0 || yVar.e) ? false : true, z10);
        m0(z10);
        u0 u0Var = this.e1;
        r6 r6Var = this.j1;
        nj0 nj0Var = this.g1;
        vc vcVar = this.t1;
        vc vcVar2 = this.Z0;
        d dVar2 = this.u1;
        org.telegram.ui.ActionBar.i5 i5Var2 = this.p0;
        ac acVar = this.c1;
        b4 b4Var = this.U0;
        b4 b4Var2 = this.T0;
        t7 t7Var = this.D0;
        yb ybVar = this.X0;
        ai.f0 f0Var = this.l0;
        cb cbVar = this.Q0;
        j7 j7Var = this.O0;
        if (!z10) {
            nb nbVar2 = this.B0;
            if (nbVar2 != null) {
                nbVar2.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            }
            ybVar.setAlpha(((i10 != 1 || xbVar.j()) && i10 != 2) ? 0.0f : 1.0f);
            xbVar.setAlpha((i10 == 0 || (i10 == 1 && xbVar.j())) ? 1.0f : 0.0f);
            j7Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            j7Var.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            t7Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            cbVar.setAlpha((i10 != 0 || I()) ? 0.0f : 1.0f);
            cbVar.setTranslationY((i10 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            b4Var2.setAlpha((i10 == 0 && this.a2 && !I()) ? 1.0f : 0.0f);
            b4Var.setAlpha((i10 == 0 && !this.a2 && I()) ? 0.6f : 0.0f);
            f0Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
            f0Var.setTranslationY((i10 == 1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            acVar.setAlpha(i10 == 2 ? 0.0f : 1.0f);
            nj0Var.setAlpha((i10 == 1 && this.O1 == 1) ? 1.0f : 0.0f);
            r6Var.setAlpha((i10 != 1 || (this.O1 != 1 && ((k8Var2 = this.K1) == null || TextUtils.isEmpty(k8Var2.y)))) ? 0.0f : 1.0f);
            int i14 = 1;
            u0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.i1;
            if (imageView2 != null) {
                imageView2.setAlpha((i10 == 1 && (k8Var = this.K1) != null && k8Var.u) ? 1.0f : 0.0f);
                i14 = 1;
            }
            vcVar2.setAlpha(i10 == i14 ? 1.0f : 0.0f);
            vcVar.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            i5Var2.setAlpha((i10 == i14 || i10 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            N(i13, i10);
            return;
        }
        this.i2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        nb nbVar3 = this.B0;
        if (nbVar3 != null) {
            dVar = dVar2;
            i5Var = i5Var2;
            i11 = 1;
            arrayList.add(ObjectAnimator.ofFloat(nbVar3, (Property<nb, Float>) View.ALPHA, i10 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            i5Var = i5Var2;
            i11 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i11];
        fArr[0] = ((i10 != i11 || xbVar.j()) && i10 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(ybVar, (Property<yb, Float>) property, fArr));
        float[] fArr2 = new float[i11];
        fArr2[0] = (i10 == 0 || (i10 == i11 && xbVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(xbVar, (Property<xb, Float>) property, fArr2));
        float[] fArr3 = new float[i11];
        fArr3[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(j7Var, (Property<j7, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i11];
        fArr4[0] = i10 == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(j7Var, (Property<j7, Float>) property2, fArr4));
        float[] fArr5 = new float[i11];
        fArr5[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(t7Var, (Property<t7, Float>) property, fArr5));
        float[] fArr6 = new float[i11];
        fArr6[0] = (i10 != 0 || I()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(cbVar, (Property<cb, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(cbVar, (Property<cb, Float>) property2, (i10 != 0 || I()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(b4Var2, (Property<b4, Float>) property, (i10 == 0 && this.a2 && !I()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(b4Var, (Property<b4, Float>) property, (i10 == 0 && !this.a2 && I()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<ai.f0, Float>) property, ((i10 == 1 && ((k8Var6 = this.K1) == null || k8Var6.J0 == 0)) || i10 == 2) ? 1.0f : 0.0f));
        if (i10 == 1 && ((k8Var5 = this.K1) == null || k8Var5.J0 == 0)) {
            i12 = 2;
        } else {
            i12 = 2;
            if (i10 != 2) {
                dp = AndroidUtilities.dp(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<ai.f0, Float>) property2, dp));
                arrayList.add(ObjectAnimator.ofFloat(acVar, (Property<ac, Float>) property, i10 != i12 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(i5Var, (Property<org.telegram.ui.ActionBar.i5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(vcVar2, (Property<vc, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(vcVar, (Property<vc, Float>) property, i10 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) property, (i10 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property, (i10 == 1 || (this.O1 != 1 && ((k8Var4 = this.K1) == null || TextUtils.isEmpty(k8Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                imageView = this.i1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 && (k8Var3 = this.K1) != null && k8Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<ca1, Float>) property, 0.0f));
                this.i2.playTogether(arrayList);
                this.i2.addListener(new hb(this, i13, i10, 0));
                this.i2.setDuration(460L);
                this.i2.setInterpolator(tr.h);
                this.i2.start();
            }
        }
        dp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<ai.f0, Float>) property2, dp));
        arrayList.add(ObjectAnimator.ofFloat(acVar, (Property<ac, Float>) property, i10 != i12 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i5Var, (Property<org.telegram.ui.ActionBar.i5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(vcVar2, (Property<vc, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(vcVar, (Property<vc, Float>) property, i10 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) property, (i10 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property, (i10 == 1 || (this.O1 != 1 && ((k8Var4 = this.K1) == null || TextUtils.isEmpty(k8Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        imageView = this.i1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<ca1, Float>) property, 0.0f));
        this.i2.playTogether(arrayList);
        this.i2.addListener(new hb(this, i13, i10, 0));
        this.i2.setDuration(460L);
        this.i2.setInterpolator(tr.h);
        this.i2.start();
    }

    public final void L(Runnable runnable, long j3) {
        if (this.S1 || this.K1 == null) {
            return;
        }
        ma maVar = this.g2;
        if (maVar != null) {
            AndroidUtilities.cancelRunOnUIThread(maVar);
        }
        this.h2 = true;
        this.S1 = true;
        this.g2 = new ma(this, runnable, 1);
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
        k8 k8Var;
        k8 k8Var2;
        k8 k8Var3;
        mb mbVar;
        k8 k8Var4;
        mb mbVar2;
        mb mbVar3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ac acVar = this.c1;
            if (acVar != null && acVar.O1) {
                acVar.N1 = false;
                acVar.z(false, false);
                return false;
            }
            if (this.Q1) {
                j7 j7Var = this.O0;
                if (j7Var.r0) {
                    j7Var.r0 = false;
                    j7Var.v0 = SystemClock.elapsedRealtime();
                    j7Var.u0 = true;
                    ((fb) j7Var.a).d(false);
                    j7Var.J.c(false);
                    j7Var.K.c(false);
                    j7Var.L.c(false);
                    j7Var.invalidate();
                    return false;
                }
            } else if (!this.P1 && !acVar.p()) {
                bb bbVar = this.d1;
                if (bbVar.M) {
                    bbVar.c(false, true);
                    return false;
                }
                jb jbVar = this.M0;
                if (jbVar != null) {
                    org.telegram.ui.ActionBar.v0 v0Var = jbVar.G;
                    if (v0Var == null || !v0Var.s()) {
                        f(false);
                        this.m2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = v0Var.getSearchField();
                    if (jbVar.v.c()) {
                        AndroidUtilities.hideKeyboard(searchField);
                        return false;
                    }
                    jbVar.x.v(v0Var.L(true));
                    return false;
                }
                if (this.g0 != 0 || (mbVar3 = this.v1) == null || !mbVar3.y0()) {
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
                            if (((d0) obj).n != null) {
                                this.A0.e();
                                m0(true);
                                return false;
                            }
                        }
                    }
                    if (this.f0 == 1 && (((k8Var2 = this.K1) == null || (!k8Var2.n && !k8Var2.u)) && !this.u0)) {
                        if (k8Var2 != null && k8Var2.g && ((mbVar2 = this.v1) == null || !mbVar2.u0())) {
                            k8 k8Var5 = this.K1;
                            if (!k8Var5.j) {
                            }
                        }
                        mb mbVar4 = this.v1;
                        if (mbVar4 == null || !mbVar4.y0()) {
                            if (this.v0 == 0 && (((this.L1 && !this.A0.j() && (((mbVar = this.v1) == null || !mbVar.u0()) && ((k8Var4 = this.K1) == null || k8Var4.Z0 == null))) || !this.b1.h) && (((k8Var3 = this.K1) == null || !k8Var3.g || (!k8Var3.n && !k8Var3.u)) && !this.u0 && (k8Var3 == null || !k8Var3.o)))) {
                                K(0, true);
                                return false;
                            }
                            if (this.v0 != 0) {
                                q(true);
                                return false;
                            }
                            Activity activity = this.b;
                            ai.d dVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, dVar);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardChanges);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                            k8 k8Var6 = this.K1;
                            if (k8Var6 != null && !k8Var6.g && !k8Var6.o) {
                                alertDialog$Builder.i(LocaleController.getString(k8Var6.c ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new pa(this, 8));
                            }
                            k8 k8Var7 = this.K1;
                            alertDialog$Builder.k(LocaleController.getString((k8Var7 == null || !k8Var7.c || k8Var7.g) ? R.string.Discard : R.string.StoryDeleteDraft), new pa(this, 9));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.show();
                            View d = b2Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.i6.q7;
                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, dVar));
                                d.setBackground(org.telegram.ui.ActionBar.i6.Y(i0.a.k(org.telegram.ui.ActionBar.i6.v0(i11, dVar), 51), 6, 6));
                            }
                        }
                    }
                    if (this.f0 != 2 || (k8Var = this.K1) == null || k8Var.b0) {
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
            k8 k8Var = this.K1;
            if (k8Var == null || !k8Var.n) {
                u();
                H();
            }
            tf0 tf0Var = this.C1;
            if (tf0Var != null) {
                tf0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            k8 k8Var2 = this.K1;
            this.a1.setVisibility((k8Var2 == null || k8Var2.h0 < 30000) ? 8 : 0);
            this.l0.setAlpha(1.0f);
            this.l0.setTranslationY(0.0f);
            k8 k8Var3 = this.K1;
            this.c1.setVisibility((k8Var3 == null || k8Var3.J0 == 0) ? 0 : 8);
        }
        if (i11 == 0 && this.V1) {
            D().setVisibility(0);
            v0 D = D();
            D.r.d(0.0f, true);
            D.a(true);
            androidx.fragment.app.a0 a0Var = D.h;
            if (a0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(a0Var);
            }
            androidx.fragment.app.a0 a0Var2 = new androidx.fragment.app.a0(D, 9);
            D.h = a0Var2;
            AndroidUtilities.runOnUIThread(a0Var2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        tf0 tf0Var2 = this.C1;
        if (tf0Var2 != null) {
            tf0Var2.setAllowTouch(i11 == 1 && ((i12 = this.g0) == -1 || i12 == 1));
        }
        ac acVar = this.c1;
        if (acVar != null) {
            acVar.e0 = i11 != 1;
        }
        if (i11 == 1) {
            int i13 = this.c;
            MediaDataController.getInstance(i13).checkStickers(0);
            MediaDataController.getInstance(i13).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i13).loadRecents(2, false, true, false);
            ai.l9 storiesController = MessagesController.getInstance(i13).getStoriesController();
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
        k8 k8Var;
        k8 k8Var2;
        boolean z10;
        k8 k8Var3;
        k8 k8Var4;
        k8 k8Var5;
        u71 textureView;
        k8 k8Var6;
        boolean z11 = true;
        if (i11 == 0) {
            Z(false);
            this.O0.setVisibility(0);
            j7 j7Var = this.O0;
            if (j7Var != null) {
                j7Var.g(false);
            }
            this.Q0.setVisibility(0);
            this.V0.setVisibility(0);
            this.V0.setAlpha(0.0f);
            this.J0.a(0L, true);
            k8 k8Var7 = this.K1;
            if (k8Var7 != null) {
                k8Var7.i(false);
                this.K1 = null;
            }
            xb xbVar = this.A0;
            if (xbVar != null) {
                xbVar.e();
                this.O0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new ga(this, 18));
            v0 v0Var = this.N0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.W0.e(true);
            e4 e4Var = this.l1;
            if (e4Var != null) {
                e4Var.e(true);
            }
        }
        int i12 = this.c;
        if (i11 == 1 || i10 == 1) {
            this.e1.setEntry(i11 == 1 ? this.K1 : null);
            if (this.O1 == 1) {
                this.g1.setVisibility(0);
                k8 k8Var8 = this.K1;
                f0(k8Var8 != null && k8Var8.Y, false);
                this.j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((sg0) this.j1.c).a(this.X0.k(), false);
                this.p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                k8 k8Var9 = this.K1;
                if (k8Var9 == null || TextUtils.isEmpty(k8Var9.y)) {
                    this.p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.g1.setVisibility(8);
                    this.j1.setVisibility(0);
                    ((sg0) this.j1.c).a(true, false);
                    this.p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.e1.setVisibility(0);
            k8 k8Var10 = this.K1;
            if (k8Var10 == null || !k8Var10.u) {
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
            k8 k8Var11 = this.K1;
            this.c1.setVisibility(((k8Var11 == null || k8Var11.J0 == 0) && this.v0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            k8 k8Var12 = this.K1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((k8Var12 == null || k8Var12.J0 == 0) && this.v0 == 0) ? 68.0f : 12.0f);
            this.Y0.setLayoutParams(layoutParams);
            this.l0.setVisibility(0);
            this.l0.clearFocus();
            k8 k8Var13 = this.K1;
            this.c1.A(k8Var13 == null ? 86400 : k8Var13.I0, false);
            this.c1.setPeriodVisible(!MessagesController.getInstance(i12).premiumFeaturesBlocked() && ((k8Var = this.K1) == null || !k8Var.g));
            k8 k8Var14 = this.K1;
            this.c1.setHasRoundVideo((k8Var14 == null || k8Var14.o0 == null) ? false : true);
            ac acVar = this.c1;
            if (acVar == null) {
                j3 = 0;
            } else {
                k8 k8Var15 = this.K1;
                if (k8Var15 == null || !k8Var15.n) {
                    j3 = 0;
                    acVar.v(null, null);
                } else {
                    TLRPC.Peer peer = k8Var15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i12).getUser(Long.valueOf(peer.user_id)));
                        k8 k8Var16 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        k8Var16.p = append;
                    } else {
                        j3 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        k8 k8Var17 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        k8Var17.p = append;
                    }
                    String str2 = this.K1.s;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    String str3 = str2;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new gb(), 0, spannableString.length(), 33);
                        str3 = spannableString;
                    }
                    this.c1.v(str3, append);
                }
            }
            k8 k8Var18 = this.K1;
            boolean z12 = (k8Var18 != null && k8Var18.v() && this.K1.t()) ? false : true;
            vc vcVar = this.Z0;
            boolean z13 = vcVar.j0;
            vcVar.j0 = z12;
            vcVar.i0.f(z12, true);
            vcVar.invalidate();
        } else {
            j3 = 0;
        }
        if (i11 == 2 || i10 == 2) {
            this.p0.setVisibility(0);
            this.t1.setVisibility(0);
            k8 k8Var19 = this.K1;
            if (k8Var19 != null && k8Var19.b0) {
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
            k8 k8Var20 = this.K1;
            boolean z14 = (k8Var20 == null || k8Var20.J0 == j3) ? false : true;
            boolean z15 = k8Var20 != null && k8Var20.g;
            String string = LocaleController.getString(z15 ? R.string.Done : z14 ? R.string.UploadBotPreview : R.string.Next);
            boolean z16 = !z14;
            u6 u6Var = this.b1;
            if (!TextUtils.equals(string, u6Var.d) || z16 != u6Var.e) {
                u6Var.removeView(u6Var.c);
                Context context = u6Var.getContext();
                u6Var.d = string;
                u6Var.e = z16;
                t6 t6Var = new t6(u6Var, context, string, z16);
                u6Var.c = t6Var;
                t6Var.setContentDescription(string);
                u6Var.addView(u6Var.c, w7.z5.c(-2.0f, -2));
                u6Var.e();
            }
            this.t1.setVisibility(8);
            this.u1.setVisibility(8);
            if (!this.h2) {
                k8 k8Var21 = this.K1;
                if (k8Var21 == null || !k8Var21.u) {
                    this.X0.set(k8Var21);
                } else {
                    this.X0.l(k8Var21);
                }
            }
            this.h2 = false;
            this.c1.f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i12).storyEntitiesAllowed() ? null : new ga(this, 19));
            this.d1.setVisibility(this.H1 == null ? 8 : 0);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                bb bbVar = this.d1;
                bbVar.c(false, false);
                bbVar.c = arrayList;
                bbVar.d = arrayList2;
                bbVar.e = arrayList3;
                bbVar.w = new f11(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                bbVar.K = new f11(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                bbVar.b.f3.N(false);
                this.d1.setSelected(this.H1.indexOf(this.K1));
            }
            this.Z0.setMaxCount((z14 || z15 || this.H1 != null || ((k8Var6 = this.K1) != null && (k8Var6.v() || !this.K1.K))) ? 1 : 3);
            if (i10 != 2) {
                k8 k8Var22 = this.K1;
                if (k8Var22 != null && (k8Var22.c || k8Var22.g || this.u0)) {
                    if (k8Var22.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    k8 k8Var23 = this.K1;
                    if (k8Var23.K && k8Var23.a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new pa(this, 7));
                    }
                    this.c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    ac acVar2 = this.c1;
                    acVar2.V = true;
                    acVar2.f.setText("");
                }
            }
            k8 k8Var24 = this.K1;
            this.b1.d(4, k8Var24 == null || ((!k8Var24.u || k8Var24.K) && !k8Var24.v()));
            this.b1.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (k8Var5 = this.K1) == null || k8Var5.u || k8Var5.v()) ? false : true);
            if (!this.N1 && !this.c1.o()) {
                ai.l9 storiesController = MessagesController.getInstance(i12).getStoriesController();
                int B = B();
                ai.f9 o9 = storiesController.o();
                if (o9 == null || !o9.a(storiesController.a, B) || ((k8Var4 = this.K1) != null && (k8Var4.g || k8Var4.J0 != j3))) {
                    z10 = true;
                    this.b1.setShareEnabled(z10);
                    k8 k8Var25 = this.K1;
                    this.g1.setImageResource((k8Var25 == null && k8Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.p0.setVisibility(0);
                    this.p0.setTranslationX(0.0f);
                    k8Var3 = this.K1;
                    if (k8Var3 == null && k8Var3.J0 != j3) {
                        this.p0.l("", false);
                    } else if (k8Var3 == null && k8Var3.g) {
                        this.p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (k8Var3 == null && k8Var3.u) {
                        this.p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (k8Var3 == null && k8Var3.n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(this.p0, 32.0f, i12);
                        this.p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(h5Var, 0, 1, 33);
                        if (this.K1.q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(this.K1.q.user_id));
                            h5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.q)));
                            h5Var.b(chat2);
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
            k8 k8Var252 = this.K1;
            this.g1.setImageResource((k8Var252 == null && k8Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.p0.setVisibility(0);
            this.p0.setTranslationX(0.0f);
            k8Var3 = this.K1;
            if (k8Var3 == null) {
            }
            if (k8Var3 == null) {
            }
            if (k8Var3 == null) {
            }
            if (k8Var3 == null) {
            }
            this.p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z11 = true;
        }
        if (i10 == z11) {
            ac acVar3 = this.c1;
            b80 b80Var = acVar3.V0;
            if (b80Var != null) {
                b80Var.u();
                acVar3.V0 = null;
            }
            this.k1.e(z11);
            bb bbVar2 = this.d1;
            if (bbVar2.M) {
                bbVar2.c(false, z11);
            }
        }
        if (i11 == 2 && (k8Var2 = this.K1) != null) {
            if (k8Var2.e0 < j3) {
                k8Var2.e0 = j3;
            }
            this.M1 = k8Var2.e0;
            long duration = this.X0.getDuration() < 100 ? this.K1.h0 : this.X0.getDuration();
            k8 k8Var26 = this.K1;
            if (k8Var26.h0 <= 0) {
                k8Var26.h0 = duration;
            }
            File file = k8Var26.Z0;
            if (file == null) {
                file = k8Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            k8 k8Var27 = this.K1;
            this.t1.o(false, absolutePath, k8Var27.h0, k8Var27.P);
            k8 k8Var28 = this.K1;
            float f7 = duration;
            long j10 = (long) (k8Var28.Z * f7);
            long j11 = (long) (k8Var28.a0 * f7);
            vc vcVar2 = this.t1;
            vcVar2.Z0 = j10;
            vcVar2.a1 = j11;
            pc pcVar = vcVar2.h;
            if (pcVar != null) {
                pc.a(pcVar, true);
            }
            bi.v vVar = new bi.v(this, 8);
            this.t1.setDelegate(new kb(vVar));
            float max = (this.M1 / Math.max(1L, duration)) * 0.96f;
            this.t1.setVideoLeft(max);
            this.t1.setVideoRight(0.04f + max);
            vVar.run(Boolean.TRUE, Float.valueOf(max));
        }
        tf0 tf0Var = this.C1;
        if (tf0Var != null) {
            tf0Var.setAllowTouch(false);
        }
        e4 e4Var2 = this.m1;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
        org.telegram.ui.Components.rc.e();
        ac acVar4 = this.c1;
        if (acVar4 != null) {
            g gVar = acVar4.f;
            gVar.d();
            gVar.k(true);
            this.c1.e0 = true;
        }
        yb ybVar = this.X0;
        if (ybVar != null) {
            ybVar.x(8, i11 != 1);
        }
        mb mbVar = this.v1;
        if (mbVar != null) {
            mbVar.setCoverPreview(i11 != 1);
        }
        e4 e4Var3 = this.n1;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        xb xbVar2 = this.A0;
        xbVar2.setPreview(i11 == 1 && xbVar2.j());
    }

    public final void P() {
        pg.d1 d1Var;
        boolean z10 = false;
        if (this.f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.x2 = new ga(this, 3);
            }
        }
        ac acVar = this.c1;
        if (acVar != null) {
            acVar.f.s();
        }
        j7 j7Var = this.O0;
        if (j7Var != null) {
            j7Var.h();
        }
        v6 v6Var = this.o1;
        if (v6Var != null) {
            ai.l9 storiesController = MessagesController.getInstance(v6Var.a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.i.f(UserConfig.getInstance(storiesController.a).clientUserId);
            v6Var.b = storiesController.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            v6Var.c.invalidate();
        }
        mb mbVar = this.v1;
        if (mbVar != null && (d1Var = mbVar.O0.d) != null) {
            d1Var.postRunnable(d1Var.w);
        }
        yb ybVar = this.X0;
        if (ybVar != null) {
            ybVar.x(0, false);
        }
        b1 b1Var = MessagesController.getInstance(this.c).getStoriesController().w;
        if (b1Var.c || b1Var.d) {
            return;
        }
        b1Var.d = true;
        x0 x0Var = new x0(b1Var, 1);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.a);
        messagesStorage.getStorageQueue().postRunnable(new y0(messagesStorage, z10, x0Var, 0));
    }

    public final void Q(int i10, int i11) {
        mb mbVar;
        ub ubVar;
        vb vbVar;
        mb mbVar2;
        if (i11 == 0) {
            this.n0.setVisibility(8);
        }
        if (i10 == 0 && (mbVar2 = this.v1) != null) {
            mbVar2.setVisibility(8);
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
        if ((i11 == 0 || i10 == 0) && (mbVar = this.v1) != null) {
            mbVar.d1.setLayerType(0, null);
        }
        tf0 tf0Var = this.C1;
        if (tf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            tf0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            ub ubVar2 = this.r1;
            if (ubVar2 != null) {
                ubVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (ubVar = this.r1) != null) {
            ubVar.setVisibility(8);
            this.r1.setAppearProgress(0.0f);
            ub ubVar3 = this.r1;
            ubVar3.x = null;
            g0 g0Var = ubVar3.f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            ubVar3.d.setVisibility(8);
            ubVar3.a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            vb vbVar2 = this.s1;
            if (vbVar2 != null) {
                vbVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i10 != 4 || (vbVar = this.s1) == null) {
            return;
        }
        vbVar.setVisibility(8);
        this.s1.setAppearProgress(0.0f);
        vb vbVar3 = this.s1;
        vbVar3.b = null;
        g0 g0Var2 = vbVar3.h;
        g0Var2.L = null;
        g0Var2.d = null;
        g0Var2.J = false;
        vbVar3.e.setVisibility(8);
        vbVar3.setVisibility(8);
    }

    public final void R(ec ecVar) {
        ai.f9 o9;
        jc jcVar;
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
        if (windowManager != null && (jcVar = this.n) != null && jcVar.getParent() == null) {
            jc jcVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, jcVar2, layoutParams);
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
        if (ecVar != null) {
            this.F = ecVar;
            this.J = ecVar.a;
            rectF.set(ecVar.c);
            this.G = ecVar.b;
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
        g(1.0f, true, new ga(this, 6));
        e();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void S(dc dcVar, k8 k8Var, long j3) {
        jc jcVar;
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
        if (windowManager != null && (jcVar = this.n) != null && jcVar.getParent() == null) {
            jc jcVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, jcVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.K1 = k8Var;
        this.O1 = k8Var.K ? 1 : 0;
        this.s0.g = false;
        RectF rectF = this.H;
        if (dcVar != null) {
            this.F = dcVar;
            this.J = dcVar.a;
            rectF.set(dcVar.c);
            this.G = dcVar.b;
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
        k8 k8Var2 = this.K1;
        if (k8Var2 != null) {
            this.c1.setText(k8Var2.C0);
        }
        L(new za(this, 0), j3);
        K(this.K1.b0 ? 2 : 1, false);
        l0(-1, false, false);
        this.b1.b(false, false);
        e();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void T() {
        b80 b80Var;
        yb ybVar = this.X0;
        if (ybVar != null) {
            ybVar.x(4, true);
        }
        ac acVar = this.c1;
        if (acVar != null && (b80Var = acVar.V0) != null) {
            b80Var.u();
            acVar.V0 = null;
        }
        rg.y0 y0Var = new rg.y0((org.telegram.ui.ActionBar.n2) new ob(this, 1), 14, false);
        y0Var.setOnDismissListener(new va(this, 1));
        y0Var.show();
    }

    public final void U(dc dcVar, k8 k8Var) {
        ai.f9 o9;
        jc jcVar;
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
        if (windowManager != null && (jcVar = this.n) != null && jcVar.getParent() == null) {
            jc jcVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, jcVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.K1 = k8Var;
        fa.a(i10, k8Var);
        k8 k8Var2 = this.K1;
        int i11 = (k8Var2 == null || !k8Var2.K) ? 0 : 1;
        this.O1 = i11;
        this.s0.g = k8Var2 != null && k8Var2.u && i11 == 1;
        if (this.v0 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            h0(o9, true);
        }
        RectF rectF = this.H;
        if (dcVar != null) {
            this.F = dcVar;
            this.J = dcVar.a;
            rectF.set(dcVar.c);
            this.G = dcVar.b;
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
        k8 k8Var3 = this.K1;
        if (k8Var3 != null) {
            this.c1.setText(k8Var3.C0);
        }
        this.b1.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new ga(this, 6));
        e();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void V() {
        pg.f1 f1Var = this.w1;
        if (f1Var != null) {
            f1Var.bringToFront();
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
        yc ycVar = this.p1;
        if (ycVar != null) {
            ycVar.bringToFront();
        }
        tf0 tf0Var = this.C1;
        if (tf0Var != null) {
            tf0Var.bringToFront();
        }
        kf0 kf0Var = this.E1;
        if (kf0Var != null) {
            kf0Var.bringToFront();
        }
        mf0 mf0Var = this.F1;
        if (mf0Var != null) {
            mf0Var.bringToFront();
        }
        v6 v6Var = this.o1;
        if (v6Var != null) {
            v6Var.bringToFront();
        }
        p pVar = this.q1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void W(k8 k8Var, boolean z10) {
        k8 k8Var2;
        boolean z11;
        if (k8Var == null || this.X0.getWidth() <= 0 || this.X0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? k8Var.O0 : k8Var.N0;
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
        u71 textureView = this.X0.getTextureView();
        if (k8Var.K && !k8Var.u && textureView != null) {
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
        File file2 = k8Var.Q0;
        if (file2 != null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                canvas.save();
                float width2 = width / decodeFile.getWidth();
                canvas.scale(width2, width2);
                canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile.recycle();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        File file3 = k8Var.P0;
        if (file3 != null) {
            try {
                Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                canvas.save();
                float width3 = width / decodeFile2.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile2.recycle();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        mb mbVar = this.v1;
        if (mbVar != null && mbVar.R0 != null) {
            canvas.save();
            canvas.scale(f7, f7);
            mb mbVar2 = this.v1;
            mbVar2.I0 = true;
            j6 j6Var = mbVar2.R0;
            j6Var.a = true;
            j6Var.draw(canvas);
            mb mbVar3 = this.v1;
            mbVar3.R0.a = false;
            mbVar3.I0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = k8.w(this.c, "jpg");
        if (z10) {
            k8Var2 = k8Var;
            z11 = z10;
            Utilities.searchQueue.postRunnable(new u1(this, createBitmap, z11, w10, k8Var2, 1));
        } else {
            k8Var2 = k8Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        if (!z11) {
            k8Var2.N0 = w10;
        }
        k8Var2.b1 = createScaledBitmap;
    }

    public final void X() {
        ai.f9 o9;
        char c10;
        ea eaVar = this.q0;
        BitmapDrawable bitmapDrawable = null;
        if (eaVar != null) {
            eaVar.dismiss();
            this.q0 = null;
        }
        if (this.N1) {
            u0 u0Var = this.e1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            t6 t6Var = this.b1.c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(t6Var, i10);
            return;
        }
        ac acVar = this.c1;
        if (acVar != null && acVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.p6 p6Var = acVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(p6Var, i11);
            acVar.e();
            return;
        }
        k8 k8Var = this.K1;
        int i12 = this.c;
        int i13 = 0;
        if ((k8Var == null || (!k8Var.g && k8Var.J0 == 0)) && (o9 = MessagesController.getInstance(i12).storiesController.o()) != null && o9.a(i12, B())) {
            h0(o9, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        ai.d dVar = this.a;
        if (acVar != null && !this.K1.D0) {
            CharSequence text = acVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((o11[]) spannable.getSpans(0, text.length(), o11.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.yc(this.n, dVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.i6.gc, 0, new ga(this, 27), dVar)).k(true);
                    int i14 = -this.U1;
                    this.U1 = i14;
                    AndroidUtilities.shakeViewSpring(acVar, i14);
                    return;
                }
            }
        }
        k8 k8Var2 = this.K1;
        if (k8Var2.g || k8Var2.J0 != 0) {
            k8Var2.l = false;
            i(null);
            p0();
            return;
        }
        if (this.N != 0) {
            k8Var2.v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
        }
        yb ybVar = this.X0;
        ybVar.x(3, true);
        ea eaVar2 = new ea(this.b, this.K1.I0, dVar);
        eaVar2.q1(this.K1.E0);
        eaVar2.p1(this.K1.v0);
        eaVar2.F = this.M;
        eaVar2.U = new ha(this, 14);
        eaVar2.e1(!this.A0.j());
        ArrayList arrayList = this.I1;
        eaVar2.m1(arrayList == null ? this.K1.r() : arrayList.size());
        eaVar2.k1(false);
        CharSequence text2 = acVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (o61 o61Var : (o61[]) ((Spanned) text2).getSpans(0, text2.length(), o61.class)) {
                if (o61Var != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(o61Var.getURL())));
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
        eaVar2.S = arrayList2;
        eaVar2.W = new ha(this, 15);
        eaVar2.X = new ha(this, 16);
        eaVar2.T = new pa(this, 10);
        this.q0 = eaVar2;
        k8 k8Var3 = this.K1;
        if (k8Var3.K) {
            if (ybVar != null && !k8Var3.f0 && this.f0 != 2) {
                k8Var3.e0 = ybVar.getCurrentPosition();
                ha haVar = new ha(this, 17);
                pg.f1 f1Var = this.w1;
                View view = this.z1;
                View[] viewArr = new View[3];
                viewArr[0] = ybVar;
                viewArr[c10] = f1Var;
                viewArr[2] = view;
                ybVar.h(haVar, viewArr);
            }
            ea eaVar3 = this.q0;
            Bitmap bitmap = this.K1.g0;
            ga gaVar = new ga(this, 20);
            if (bitmap != null) {
                eaVar3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            eaVar3.b0 = bitmapDrawable;
            eaVar3.c0 = gaVar;
            i1 i1Var = eaVar3.b;
            if (i1Var != null) {
                for (View view2 : i1Var.getViewPages()) {
                    if (view2 instanceof x9) {
                        x9 x9Var = (x9) view2;
                        x9Var.g(false);
                        x9Var.e(false);
                    }
                }
            }
        }
        this.q0.setOnDismissListener(new va(this, i13));
        this.q0.show();
    }

    public final void Y(fc fcVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (fcVar != null) {
            this.F = fcVar;
            this.J = fcVar.a;
            rectF.set(fcVar.c);
            this.G = fcVar.b;
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
                    sq sqVar = new sq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    sqVar.e = dp;
                    sqVar.f = dp2;
                    this.A0.setCameraThumb(sqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
                        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new pa(this, 13));
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
                CameraController.getInstance().initCamera(new ga(this, 0));
            }
        }
    }

    public final void b0(Runnable runnable) {
        nb nbVar = this.B0;
        if (nbVar == null || nbVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new a3.k0(this, this.B0.getTextureView().getBitmap(), runnable, 20));
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
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new lb(this, i10)).setListener(new androidx.fragment.app.g(this, z10, view, i10)).setDuration(320L).setInterpolator(tr.h).start();
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ai.f9 o9;
        k8 k8Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            j7 j7Var = this.O0;
            if (j7Var != null) {
                j7Var.h();
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
            j7 j7Var2 = this.O0;
            if (j7Var2 == null || this.V1) {
                return;
            }
            j7Var2.h();
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f0;
            int i15 = this.c;
            if (i14 != 1) {
                if (i14 == 0 && (o9 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o9.a(i15, 1)) {
                    k8 k8Var2 = this.K1;
                    if (k8Var2 == null || k8Var2.J0 == 0) {
                        h0(o9, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.N1 && !this.c1.o()) {
                ai.l9 storiesController = MessagesController.getInstance(i15).getStoriesController();
                int B = B();
                ai.f9 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.a, B) || ((k8Var = this.K1) != null && (k8Var.g || k8Var.J0 != 0))) {
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
        nb nbVar = this.B0;
        if ((nbVar != null && nbVar.isDual()) || this.a2) {
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
        wc wcVar = this.E0;
        if (wcVar.n != i10) {
            wcVar.n = i10;
            ValueAnimator valueAnimator = wcVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                wcVar.r = null;
            }
            wcVar.setDrawable(i10);
        }
        if (this.f0 == 0 && !this.I0.e && this.Y1 != null && !I()) {
            z10 = true;
        }
        c0(this.E0, z10, true);
    }

    public final void f(boolean z10) {
        v0 v0Var;
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
                this.q2 = new qa(this, z10, 0);
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
            jb jbVar = this.M0;
            if (jbVar != null) {
                jbVar.K = false;
            }
            if (z10 && (v0Var = this.N0) != null) {
                v0Var.a(false);
            }
            cc ccVar = this.r;
            if (ccVar != null) {
                ccVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.M0.setImportantForAccessibility(z10 ? 0 : 4);
            this.p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            jc jcVar = this.n;
            float height = z10 ? 0.0f : (jcVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            int i11 = 1;
            Math.max(1, jcVar.getHeight());
            jb jbVar2 = this.M0;
            jbVar2.K = !z10;
            this.k2 = this.j2 == null;
            if (z10) {
                o1.k kVar2 = new o1.k(jbVar2, o1.h.n, height);
                this.o2 = kVar2;
                kVar2.u.a(0.75f);
                this.o2.u.b(350.0f);
                this.o2.a(new ra(this, height, i10));
                this.o2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.n2 = ofFloat;
                ofFloat.addUpdateListener(new sa(this, i10));
                this.n2.addListener(new ib(this, i11));
                this.n2.setDuration(450L);
                this.n2.setInterpolator(tr.h);
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
            kj0 kj0Var = new kj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f1 = kj0Var;
            kj0Var.F *= 1.5f;
        }
        this.g1.setAnimation(this.f1);
        if (!z11) {
            this.f1.N(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            kj0 kj0Var2 = this.f1;
            if (kj0Var2.a0 > 20) {
                kj0Var2.N(0, false, false);
            }
            this.f1.P(20);
            this.f1.start();
            return;
        }
        kj0 kj0Var3 = this.f1;
        int i10 = kj0Var3.a0;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        kj0Var3.P(43);
        this.f1.start();
    }

    public final void g(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        cc ccVar = this.r;
        if (!z10) {
            this.L = null;
            this.I = f7;
            k();
            ccVar.invalidate();
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
        ofFloat.addUpdateListener(new sa(this, 5));
        this.E.addListener(new ai.t2(this, f7, runnable, 2));
        if (f7 < 1.0f && this.v) {
            this.E.setDuration(250L);
            this.E.setInterpolator(tr.h);
        } else if (f7 > 0.0f || ccVar.a < AndroidUtilities.dp(20.0f)) {
            this.E.setDuration(300L);
            this.E.setInterpolator(new u1.a());
        } else if (f7 >= 0.0f || !this.O) {
            this.E.setDuration(400L);
            this.E.setInterpolator(tr.h);
        } else {
            this.E.setDuration(200L);
            this.E.setInterpolator(tr.h);
            this.O = false;
        }
        this.E.start();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new ai.rb(this, 2));
        }
    }

    public final void h(boolean z10, boolean z11) {
        y yVar;
        if (z10) {
            e4 e4Var = this.l1;
            if (e4Var != null) {
                e4Var.e(true);
            }
            e4 e4Var2 = this.m1;
            if (e4Var2 != null) {
                e4Var2.e(true);
            }
            e4 e4Var3 = this.k1;
            if (e4Var3 != null) {
                e4Var3.e(true);
            }
            e4 e4Var4 = this.W0;
            if (e4Var4 != null) {
                e4Var4.e(true);
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
        if (z10 && (yVar = this.I0) != null && yVar.e) {
            yVar.a(false, z11);
        }
        m0(z11);
        cb cbVar = this.Q0;
        b4 b4Var = this.U0;
        b4 b4Var2 = this.T0;
        if (!z11) {
            b4Var2.setAlpha((z10 && this.f0 == 0 && !I()) ? 1.0f : 0.0f);
            b4Var2.setTranslationY((z10 && this.f0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            b4Var.setAlpha((!z10 && this.f0 == 0 && I()) ? 0.6f : 0.0f);
            b4Var.setTranslationY((!z10 && this.f0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            cbVar.setAlpha((z10 || this.f0 != 0 || I()) ? 0.0f : 1.0f);
            cbVar.setTranslationY((z10 || this.f0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Z1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b4Var2, (Property<b4, Float>) property, (z10 && this.f0 == 0 && !I()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(b4Var2, (Property<b4, Float>) property2, (z10 && this.f0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(b4Var, (Property<b4, Float>) property, (!z10 && this.f0 == 0 && I()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(b4Var, (Property<b4, Float>) property2, (!z10 && this.f0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(cbVar, (Property<cb, Float>) property, (z10 || this.f0 != 0 || I()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(cbVar, (Property<cb, Float>) property2, (z10 || this.f0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.Z1.setDuration(260L);
        this.Z1.setInterpolator(tr.h);
        this.Z1.start();
    }

    public final void h0(ai.f9 f9Var, boolean z10) {
        if (this.z2) {
            return;
        }
        pb pbVar = new pb(f9Var.b(), this.c, this.b, new ob(this, 0), null);
        pbVar.X = B();
        pbVar.setOnDismissListener(new p80(2, this, z10));
        this.X0.x(7, true);
        this.z2 = true;
        pbVar.show();
    }

    public final void i(Runnable runnable) {
        k8 k8Var;
        Runnable runnable2;
        yb ybVar;
        vf0 vf0Var = this.B1;
        if (vf0Var == null || (k8Var = this.K1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        k8Var.j = vf0Var.d() | k8Var.j;
        k8 k8Var2 = this.K1;
        vf0 vf0Var2 = this.B1;
        File file = k8Var2.Z0;
        if (file != null) {
            file.delete();
            k8Var2.Z0 = null;
        }
        MediaController.SavedFilterState savedFilterState = vf0Var2.getSavedFilterState();
        k8Var2.a1 = savedFilterState;
        if (k8Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = vf0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i10 = k8Var2.R;
                    matrix.postScale(i10 == 1 ? -1.0f : 1.0f, i10 == 2 ? -1.0f : 1.0f, k8Var2.k0 / 2.0f, k8Var2.l0 / 2.0f);
                    matrix.postRotate(-k8Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    k8Var2.n0.preScale(k8Var2.k0 / createBitmap.getWidth(), k8Var2.l0 / createBitmap.getHeight());
                    k8Var2.k0 = createBitmap.getWidth();
                    k8Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = k8Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        k8Var2.Z0.delete();
                    }
                    String k10 = k8.k(k8Var2.L);
                    boolean z10 = "png".equals(k10) || "webp".equals(k10);
                    k8Var2.Z0 = k8.w(k8Var2.a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(k8Var2.Z0));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new ai.s4(k8Var2, createBitmap, z10, runnable2, 2));
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
            k8 k8Var3 = this.K1;
            if (k8Var3.K || (ybVar = this.X0) == null) {
                return;
            }
            ybVar.set(k8Var3);
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.d2 == z10) {
            return;
        }
        this.d2 = z10;
        if (z11) {
            this.J0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(tr.h).withEndAction(new qa(this, z10, 1)).start();
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
        ca1 ca1Var = this.V0;
        if ((ca1Var.getTag() != null && z10) || (ca1Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ga gaVar = new ga(this, 25);
                this.e2 = gaVar;
                AndroidUtilities.runOnUIThread(gaVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ca1Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            ca1Var.setVisibility(0);
        }
        this.f2.playTogether(ObjectAnimator.ofFloat(ca1Var, (Property<ca1, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.f2.addListener(new ai.n(13, this, z10));
        this.f2.start();
        if (z10) {
            ga gaVar2 = new ga(this, 26);
            this.e2 = gaVar2;
            AndroidUtilities.runOnUIThread(gaVar2, 2000L);
        }
    }

    public final void k() {
        ai.a5 a5Var;
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
        fc fcVar = this.F;
        if (fcVar != null && (a5Var = fcVar.f) != null) {
            a5Var.setTranslationX((rectF.left - rectF2.left) * this.I);
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
        ea eaVar = this.q0;
        if (eaVar != null) {
            eaVar.dismiss();
            this.q0 = null;
        }
        ea eaVar2 = new ea(this.b, 86400, this.a);
        eaVar2.o1();
        eaVar2.q1(this.y0);
        TLRPC.InputPeer inputPeer = this.x0;
        if (inputPeer == null) {
            inputPeer = this.N != 0 ? MessagesController.getInstance(this.c).getInputPeer(this.N) : new TLRPC.TL_inputPeerSelf();
        }
        eaVar2.p1(inputPeer);
        eaVar2.F = this.M;
        eaVar2.U = new ha(this, 18);
        eaVar2.e1(false);
        eaVar2.m1(1);
        eaVar2.k1(false);
        eaVar2.W = new ha(this, 19);
        eaVar2.T = new pa(this, 12);
        this.q0 = eaVar2;
        eaVar2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        if (r6.isRecycled() != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        k8 k8Var;
        ImageReceiver photoImage;
        if (this.v1 == null || (k8Var = this.K1) == null) {
            return;
        }
        k8Var.f();
        this.K1.j |= this.v1.u0();
        k8 k8Var2 = this.K1;
        ArrayList arrayList = k8Var2.T0;
        if (arrayList == null) {
            k8Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        mb mbVar = this.v1;
        k8 k8Var3 = this.K1;
        mbVar.t0(k8Var3.T0, false, false, false, false, k8Var3);
        k8 k8Var4 = this.K1;
        if (!k8Var4.K) {
            k8Var4.S0 = Utilities.clamp(this.v1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.v1.getMasks();
        this.K1.U0 = masks != null ? new ArrayList(masks) : null;
        k8 k8Var5 = this.K1;
        boolean z10 = k8Var5.K;
        boolean E = k8Var5.E();
        this.K1.T0 = new ArrayList();
        mb mbVar2 = this.v1;
        k8 k8Var6 = this.K1;
        Bitmap t02 = mbVar2.t0(k8Var6.T0, true, false, false, !z10, k8Var6);
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
        k8 k8Var7 = this.K1;
        k8Var7.P0 = null;
        k8Var7.R0 = null;
        k8Var7.Q0 = null;
        int i10 = this.c;
        FileLoader fileLoader = FileLoader.getInstance(i10);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        k8 k8Var8 = this.K1;
        k8Var7.P0 = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(t02, compressFormat, k8Var8.i0, k8Var8.j0, 87, false, 101, 101), true);
        if (t02 != null && !t02.isRecycled()) {
            t02.recycle();
        }
        k8 k8Var9 = this.K1;
        if (k8Var9.u) {
            File file4 = k8Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                this.K1.Y0 = null;
            }
            k8 k8Var10 = this.K1;
            long j3 = k8Var10.z0;
            if (j3 != Long.MIN_VALUE) {
                Drawable drawable = k8Var10.x0;
                if (drawable == null) {
                    drawable = b7.e(null, i10, j3, this.c2);
                }
                if (drawable != null) {
                    this.K1.Y0 = k8.w(i10, "webp");
                    k8 k8Var11 = this.K1;
                    Bitmap createBitmap = Bitmap.createBitmap(k8Var11.i0, k8Var11.j0, Bitmap.Config.ARGB_8888);
                    k8.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.Y0));
                        } finally {
                            if (!createBitmap.isRecycled()) {
                                createBitmap.recycle();
                            }
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            }
        }
        k8 k8Var12 = this.K1;
        if (k8Var12.u) {
            File file5 = k8Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                this.K1.X0 = null;
            }
            k8 k8Var13 = this.K1;
            if (k8Var13.u && k8Var13.K) {
                int i11 = k8Var13.k0;
                int i12 = k8Var13.l0;
                qg.e1 s02 = this.v1.s0();
                if (s02 != null) {
                    qg.x0 x0Var = s02.r0;
                    if (x0Var.getChildCount() == 1 && i11 > 0 && i12 > 0) {
                        if ((x0Var.getChildAt(0) instanceof org.telegram.ui.Cells.u1) && (photoImage = ((org.telegram.ui.Cells.u1) x0Var.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
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
                                this.K1.X0 = k8.w(i10, "webp");
                                createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.X0));
                            } catch (Exception e12) {
                                FileLog.e(e12);
                                this.K1.X0 = null;
                            }
                            createBitmap2.recycle();
                        }
                    }
                }
            }
        }
        if (!E) {
            mb mbVar3 = this.v1;
            ArrayList arrayList2 = new ArrayList();
            k8 k8Var14 = this.K1;
            int i17 = k8Var14.i0;
            Bitmap t03 = mbVar3.t0(arrayList2, false, true, false, false, k8Var14);
            k8 k8Var15 = this.K1;
            FileLoader fileLoader2 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            k8 k8Var16 = this.K1;
            k8Var15.R0 = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(t03, compressFormat2, k8Var16.i0, k8Var16.j0, 87, false, 101, 101), true);
            if (t03 != null && !t03.isRecycled()) {
                t03.recycle();
            }
        }
        if (this.v1.O0.getPainting().E) {
            Bitmap blurBitmap = this.v1.getBlurBitmap();
            k8 k8Var17 = this.K1;
            FileLoader fileLoader3 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            k8 k8Var18 = this.K1;
            k8Var17.Q0 = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, k8Var18.i0, k8Var18.j0, 87, false, 101, 101), true);
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
        ub ubVar;
        int i11;
        float f10;
        vb vbVar;
        int i12;
        float f11;
        k8 k8Var;
        ImageView imageView;
        int i13;
        int i14;
        float f12;
        mf0 mf0Var;
        kf0 kf0Var;
        ImageView imageView2;
        int i15;
        k8 k8Var2;
        mb mbVar;
        mb mbVar2;
        int i16 = this.g0;
        if (i16 == i10 && !z10) {
            return;
        }
        ac acVar = this.c1;
        if (i10 != -1 && acVar != null && acVar.O1) {
            return;
        }
        this.g0 = i10;
        AnimatorSet animatorSet = this.r2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r2 = null;
        }
        org.telegram.ui.ActionBar.i5 i5Var = this.p0;
        vc vcVar = this.Z0;
        u0 u0Var = this.e1;
        v2 v2Var = this.n0;
        r6 r6Var = this.j1;
        nj0 nj0Var = this.g1;
        if (i16 != i10) {
            if (i10 == -1) {
                v2Var.setVisibility(0);
                acVar.setVisibility(0);
                mb mbVar3 = this.v1;
                if (mbVar3 != null) {
                    mbVar3.D0(null, true);
                }
                u0Var.setVisibility(0);
                k8 k8Var3 = this.K1;
                if (k8Var3 == null || !k8Var3.u) {
                    ImageView imageView3 = this.i1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    G().setVisibility(0);
                    o0(false);
                }
                i5Var.setVisibility(0);
                if (this.O1 == 1) {
                    nj0Var.setVisibility(0);
                    r6Var.setVisibility(0);
                } else {
                    k8 k8Var4 = this.K1;
                    if (k8Var4 != null && !TextUtils.isEmpty(k8Var4.y)) {
                        nj0Var.setVisibility(8);
                        r6Var.setVisibility(0);
                    }
                }
                vcVar.setVisibility(0);
            }
            if (i10 == 0 && (mbVar2 = this.v1) != null) {
                mbVar2.setVisibility(0);
            }
            if ((i10 == 0 || i16 == 0) && (mbVar = this.v1) != null) {
                mbVar.d1.setLayerType(2, null);
            }
            mb mbVar4 = this.v1;
            if (mbVar4 != null) {
                mbVar4.O1.b(i10 != 0);
            }
            acVar.L.b(i10 != -1);
            org.telegram.ui.Components.rc.e();
            if (this.B1 != null && i16 == 1) {
                i(null);
            }
            tf0 tf0Var = this.C1;
            if (tf0Var != null) {
                tf0Var.setAllowTouch(false);
            }
            this.k1.e(true);
            jc jcVar = this.n;
            yb ybVar = this.X0;
            Activity activity = this.b;
            if (i10 == 3) {
                if (this.r1 == null) {
                    ub ubVar2 = new ub(this, activity, ybVar);
                    this.r1 = ubVar2;
                    jcVar.addView(ubVar2.d);
                    jcVar.addView(this.r1);
                }
                this.r1.setVisibility(0);
                k8 k8Var5 = this.K1;
                if (k8Var5 != null) {
                    this.r1.setEntry(k8Var5);
                }
            } else if (i16 == 3) {
                ybVar.b();
                ub ubVar3 = this.r1;
                if (ubVar3 != null) {
                    ubVar3.a.setCropEditorDrawing(ubVar3);
                    ubVar3.y = true;
                }
            }
            if (i10 == 4) {
                if (this.s1 == null) {
                    vb vbVar2 = new vb(this, activity, ybVar);
                    this.s1 = vbVar2;
                    jcVar.addView(vbVar2.e);
                    jcVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
            } else if (i16 == 4) {
                ybVar.b();
                vb vbVar3 = this.s1;
                if (vbVar3 != null) {
                    vbVar3.E = true;
                }
            }
        }
        this.b1.b((i10 == -1 || i10 == 2) && this.I > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        vf0 vf0Var = this.B1;
        boolean z13 = vf0Var == null && i10 == 1;
        float f13 = 1.0f;
        if (i10 == 1) {
            s();
            vf0 vf0Var2 = this.B1;
            this.v2 = vf0Var2;
            FrameLayout toolsView = vf0Var2 != null ? vf0Var2.getToolsView() : null;
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
            if (i16 == 1 && vf0Var != null) {
                this.v2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(vf0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.B1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i10 != 0) {
                    u();
                    this.v2 = this.v1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(v2Var, (Property<v2, Float>) property, f7));
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
                    arrayList.add(ObjectAnimator.ofFloat(v2Var, (Property<v2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getTopLayout(), (Property<View, Float>) property3, f7));
                    View topLayout2 = this.v1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property3, f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property4, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                ubVar = this.r1;
                if (ubVar == null) {
                    lg.f fVar = ubVar.h;
                    if (i10 == 3) {
                        Property property5 = View.ALPHA;
                        i11 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<lg.f, Float>) property5, 0.0f, 1.0f));
                        lg.f fVar2 = this.r1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f10 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar2, (Property<lg.f, Float>) property6, AndroidUtilities.dp(52.0f), f7));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property6, AndroidUtilities.dp(52.0f), f7));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new sa(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        i11 = 2;
                        f10 = 52.0f;
                        if (i16 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<lg.f, Float>) property7, 1.0f, 0.0f));
                            lg.f fVar3 = this.r1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(fVar3, (Property<lg.f, Float>) property8, f7, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property8, f7, AndroidUtilities.dp(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.r1.getAppearProgress(), f7);
                            ofFloat2.addUpdateListener(new sa(this, i11));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    i11 = 2;
                    f10 = 52.0f;
                }
                vbVar = this.s1;
                if (vbVar != null) {
                    lg.f fVar4 = vbVar.n;
                    if (i10 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i11];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<lg.f, Float>) property9, fArr));
                        lg.f fVar5 = this.s1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i11];
                        fArr2[0] = AndroidUtilities.dp(f10);
                        fArr2[1] = f7;
                        arrayList.add(ObjectAnimator.ofFloat(fVar5, (Property<lg.f, Float>) property10, fArr2));
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
                        ofFloat3.addUpdateListener(new sa(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i16 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i11];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<lg.f, Float>) property11, fArr6));
                        lg.f fVar6 = this.s1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float dp = AndroidUtilities.dp(f10);
                        float[] fArr7 = new float[i11];
                        fArr7[0] = f7;
                        fArr7[1] = dp;
                        arrayList.add(ObjectAnimator.ofFloat(fVar6, (Property<lg.f, Float>) property12, fArr7));
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
                        ofFloat4.addUpdateListener(new sa(this, 4));
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
                        arrayList.add(ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property13, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((k8Var = this.K1) == null || TextUtils.isEmpty(k8Var.y)))) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                        imageView = this.i1;
                        if (imageView != null) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i10 == -1 || i10 == 2) && (k8Var2 = this.K1) != null && k8Var2.u) ? 1.0f : 0.0f));
                        } else {
                            i13 = 1;
                        }
                        int i17 = this.f0;
                        float[] fArr12 = new float[i13];
                        fArr12[0] = ((i17 != i13 || i17 == 2) && i10 == -1) ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(i5Var, (Property<org.telegram.ui.ActionBar.i5, Float>) property13, fArr12));
                        wb wbVar = this.h0;
                        if (i10 == i13) {
                            wbVar.setPivotY(wbVar.getMeasuredHeight() * 0.2f);
                            i14 = AndroidUtilities.dp(164.0f);
                        } else if (i10 == 0) {
                            wbVar.setPivotY(wbVar.getMeasuredHeight() * 0.6f);
                            i14 = AndroidUtilities.dp(40.0f);
                        } else if (i10 == 2) {
                            wbVar.setPivotY(0.0f);
                            i14 = vcVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            f12 = (r10 - i14) / (wbVar.getHeight() - ((int) wbVar.getPivotY()));
                        } else {
                            f12 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(wbVar, (Property<wb, Float>) View.SCALE_X, f12));
                        arrayList.add(ObjectAnimator.ofFloat(wbVar, (Property<wb, Float>) View.SCALE_Y, f12));
                        if (i10 == -1) {
                            arrayList.add(ObjectAnimator.ofFloat(wbVar, (Property<wb, Float>) View.TRANSLATION_Y, 0.0f));
                        }
                        mf0Var = this.F1;
                        if (mf0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(mf0Var, (Property<mf0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        kf0Var = this.E1;
                        if (kf0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(kf0Var, (Property<kf0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(acVar, (Property<ac, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                        float[] fArr13 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                        ai.f0 f0Var = this.l0;
                        arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<ai.f0, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<ai.f0, Float>) property14, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                        if (i10 != -1 && i10 != 2) {
                            f13 = 0.0f;
                        }
                        FrameLayout frameLayout3 = this.Y0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f13));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + acVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.j0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i10 == 2 ? -90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        imageView2 = this.i1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        }
                        if (this.r0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i15 = 0;
                            ofFloat5.addUpdateListener(new lb(this, i15));
                            arrayList.add(ofFloat5);
                        } else {
                            i15 = 0;
                        }
                        if (vcVar != null) {
                            k8 k8Var6 = this.K1;
                            boolean z14 = k8Var6 == null || !k8Var6.v() || !this.K1.t() || i10 == 2;
                            if (vcVar.j0 != z14 || !z11) {
                                vcVar.j0 = z14;
                                if (!z11) {
                                    vcVar.i0.f(z14, true);
                                }
                                vcVar.invalidate();
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
                        this.r2.setInterpolator(tr.h);
                        this.r2.addListener(new hb(this, i16, i10, 1));
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
                arrayList.add(ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property13, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((k8Var = this.K1) == null || TextUtils.isEmpty(k8Var.y)))) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                imageView = this.i1;
                if (imageView != null) {
                }
                int i172 = this.f0;
                float[] fArr122 = new float[i13];
                fArr122[0] = ((i172 != i13 || i172 == 2) && i10 == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(i5Var, (Property<org.telegram.ui.ActionBar.i5, Float>) property13, fArr122));
                wb wbVar2 = this.h0;
                if (i10 == i13) {
                }
                if (i14 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(wbVar2, (Property<wb, Float>) View.SCALE_X, f12));
                arrayList.add(ObjectAnimator.ofFloat(wbVar2, (Property<wb, Float>) View.SCALE_Y, f12));
                if (i10 == -1) {
                }
                mf0Var = this.F1;
                if (mf0Var != null) {
                }
                kf0Var = this.E1;
                if (kf0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(acVar, (Property<ac, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                float[] fArr132 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                ai.f0 f0Var2 = this.l0;
                arrayList.add(ObjectAnimator.ofFloat(f0Var2, (Property<ai.f0, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(f0Var2, (Property<ai.f0, Float>) property142, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                if (i10 != -1) {
                    f13 = 0.0f;
                }
                FrameLayout frameLayout32 = this.Y0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f13));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + acVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.j0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i10 == 2 ? -90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                imageView2 = this.i1;
                if (imageView2 != null) {
                }
                if (this.r0.c()) {
                }
                if (vcVar != null) {
                }
                if (!z11) {
                }
            }
        }
        z12 = z13;
        if (i10 != 0) {
        }
        ubVar = this.r1;
        if (ubVar == null) {
        }
        vbVar = this.s1;
        if (vbVar != null) {
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
        arrayList.add(ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property132, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((k8Var = this.K1) == null || TextUtils.isEmpty(k8Var.y)))) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property132, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
        imageView = this.i1;
        if (imageView != null) {
        }
        int i1722 = this.f0;
        float[] fArr1222 = new float[i13];
        fArr1222[0] = ((i1722 != i13 || i1722 == 2) && i10 == -1) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(i5Var, (Property<org.telegram.ui.ActionBar.i5, Float>) property132, fArr1222));
        wb wbVar22 = this.h0;
        if (i10 == i13) {
        }
        if (i14 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(wbVar22, (Property<wb, Float>) View.SCALE_X, f12));
        arrayList.add(ObjectAnimator.ofFloat(wbVar22, (Property<wb, Float>) View.SCALE_Y, f12));
        if (i10 == -1) {
        }
        mf0Var = this.F1;
        if (mf0Var != null) {
        }
        kf0Var = this.E1;
        if (kf0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(acVar, (Property<ac, Float>) property132, i10 == -1 ? 1.0f : 0.0f));
        float[] fArr1322 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
        ai.f0 f0Var22 = this.l0;
        arrayList.add(ObjectAnimator.ofFloat(f0Var22, (Property<ai.f0, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(f0Var22, (Property<ai.f0, Float>) property1422, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
        if (i10 != -1) {
        }
        FrameLayout frameLayout322 = this.Y0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f13));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + acVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.j0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i10 == 2 ? -90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        imageView2 = this.i1;
        if (imageView2 != null) {
        }
        if (this.r0.c()) {
        }
        if (vcVar != null) {
        }
        if (!z11) {
        }
    }

    public final void m() {
        k8 k8Var;
        if (this.v1 == null || (k8Var = this.K1) == null || !k8Var.u) {
            return;
        }
        File file = k8Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.K1.W0 = null;
        }
        this.K1.W0 = k8.w(this.c, "webp");
        mb mbVar = this.v1;
        k8 k8Var2 = this.K1;
        Bitmap t02 = mbVar.t0(k8Var2.T0, false, false, true, this.O1 != 1, k8Var2);
        try {
            try {
                t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                if (t02.isRecycled()) {
                    return;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                try {
                    this.K1.W0.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
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
        nb nbVar;
        boolean z11 = false;
        i0(this.f0 == 0 && this.O1 == 1 && !this.I0.e && !I(), z10);
        this.G0.setSelected(this.A0.j());
        y yVar = this.I0;
        c0(this.n0, yVar == null || !yVar.e, z10);
        c0(this.E0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.Y1 == null || this.I0.e || I()) ? false : true, z10);
        c0(this.F0, (this.a2 || this.O1 == -1 || this.f0 != 0 || (nbVar = this.B0) == null || !nbVar.a || this.I0.e || this.A0.j()) ? false : true, z10);
        c0(this.G0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.I0.e) ? false : true, z10);
        c0(this.H0, this.I0.e, z10);
        this.O0.e(this.A0.j() ? this.A0.getFilledProgress() : 0.0f, z10);
        boolean z12 = this.I0.e;
        e4 e4Var = this.n1;
        if (z12) {
            e4Var.u();
        } else {
            e4Var.e(true);
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
        v vVar = this.I0.a;
        vVar.setPadding((int) ((this.n0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) (alpha4 + AndroidUtilities.dp(8.0f)), 0);
        vVar.invalidate();
    }

    public final void o() {
        boolean z10 = this.K != 0.0f || this.I < 1.0f || this.B2;
        if (z10 == this.A2) {
            return;
        }
        ib0 ib0Var = this.y;
        if (ib0Var != null) {
            ib0Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void o0(boolean z10) {
        kj0 kj0Var = this.h1;
        if (kj0Var != null) {
            int[] iArr = kj0Var.e;
            int i10 = 0;
            if (!z10) {
                k8 k8Var = this.K1;
                int i11 = (k8Var == null || !k8Var.y0) ? 0 : iArr[0] - 1;
                kj0Var.N(i11, false, true);
                this.h1.P(i11);
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            k8 k8Var2 = this.K1;
            if (k8Var2 != null && k8Var2.y0) {
                i10 = iArr[0];
            }
            kj0Var.P(i10);
            kj0 kj0Var2 = this.h1;
            if (kj0Var2 != null) {
                kj0Var2.start();
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
            x2 x2Var = this.s;
            x2Var.o = f7;
            x2Var.n = x2.f(f7);
            x2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            x2 x2Var2 = this.s;
            x2Var2.p = f10;
            x2Var2.i();
        }
    }

    public final void p0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        ga gaVar = new ga(this, 2);
        mb mbVar = this.v1;
        k8 k8Var = this.K1;
        if (mbVar == null || k8Var == null) {
            gaVar.run();
            return;
        }
        k8Var.f();
        boolean u02 = mbVar.u0();
        boolean z10 = mbVar.O0.getPainting().E;
        Utilities.searchQueue.postRunnable(new ja(this, mbVar, k8Var.i0, k8Var.j0, k8Var, z10, u02, gaVar, 1));
    }

    public final void q(boolean z10) {
        yb ybVar;
        if (this.d) {
            ea eaVar = this.q0;
            if (eaVar != null) {
                eaVar.dismiss();
                this.q0 = null;
            }
            k8 k8Var = this.K1;
            long j3 = 0;
            if (k8Var != null && !k8Var.h) {
                if ((this.v && k8Var.g) || k8Var.b != 0) {
                    k8Var.j = false;
                }
                k8Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 == null || (ybVar = this.X0) == null) {
                yb ybVar2 = this.X0;
                if (ybVar2 != null && !z10) {
                    ybVar2.set(null);
                }
                g(0.0f, z10, new ga(this, 23));
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
            e81 e81Var = ybVar.y;
            if (e81Var != null) {
                e81Var.B();
                ybVar.y.H();
                ybVar.y = null;
            }
            e81 e81Var2 = ybVar.x;
            if (e81Var2 != null) {
                j3 = e81Var2.n();
                ybVar.x.B();
                ybVar.x.H();
                ybVar.x = null;
            }
            e81 e81Var3 = ybVar.e;
            if (e81Var3 != null) {
                j3 = e81Var3.n();
                ybVar.e.B();
                ybVar.e.H();
                ybVar.e = null;
            }
            callback4.run(Long.valueOf(j3), new qa(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.w));
        }
    }

    public final boolean q0() {
        nb nbVar;
        if ((!this.P1 && !this.Q1) || (nbVar = this.B0) == null || !nbVar.isFrontface()) {
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
        this.B0 = new nb(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        j7 j7Var = this.O0;
        if (j7Var != null) {
            j7Var.g0 = 0.0f;
            j7Var.h0.d(0.0f, true);
        }
        this.B0.recordHevc = !this.A0.j();
        this.B0.setThumbDrawable(A());
        this.B0.initTexture();
        this.B0.setDelegate(new pa(this, 0));
        c0(this.F0, this.B0.a && this.f0 == 0, true);
        this.G0.setTranslationX(this.B0.a ? 0.0f : AndroidUtilities.dp(46.0f));
        this.A0.setCameraView(this.B0);
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.W0.u();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else if ((!d1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", d1.p(ApplicationLoader.applicationContext, false))) && this.B0.a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
            this.l1.u();
        }
        if (this.C0 == null) {
            this.C0 = new f7(activity, new ha(this, 3));
        }
        this.C0.a(this.B0);
        t7 t7Var = this.D0;
        if (t7Var != null) {
            xb xbVar = this.A0;
            Object blurRenderNode = xbVar.getBlurRenderNode();
            t7Var.F = xbVar;
            t7Var.G = blurRenderNode;
            t7Var.invalidate();
        }
    }

    public final void s() {
        k8 k8Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.B1 != null || (k8Var = this.K1) == null) {
            return;
        }
        if (k8Var.K) {
            bitmap = null;
        } else {
            if (k8Var.Z0 == null) {
                q6 = this.X0.getPhotoBitmap();
            } else {
                pa paVar = new pa(this, 11);
                Point point = AndroidUtilities.displaySize;
                q6 = k8.q(paVar, point.x, point.y, 0, true);
            }
            bitmap = q6;
        }
        if (bitmap != null || this.K1.K) {
            u71 textureView = this.X0.getTextureView();
            int orientation = this.X0.getOrientation();
            k8 k8Var2 = this.K1;
            vf0 vf0Var = new vf0(this.b, textureView, bitmap, null, orientation, k8Var2 != null ? k8Var2.a1 : null, null, 0, false, false, this.r0, this.a);
            this.B1 = vf0Var;
            this.r.addView(vf0Var);
            tf0 tf0Var = this.C1;
            if (tf0Var != null) {
                tf0Var.setFilterView(this.B1);
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
            kf0 blurControl = this.B1.getBlurControl();
            this.E1 = blurControl;
            if (blurControl != null) {
                this.h0.addView(blurControl);
            }
            mf0 curveControl = this.B1.getCurveControl();
            this.F1 = curveControl;
            if (curveControl != null) {
                this.h0.addView(curveControl);
            }
            V();
            this.B1.getDoneTextView().setOnClickListener(new ia(this, 13));
            this.B1.getCancelTextView().setOnClickListener(new ia(this, 14));
            this.B1.getToolsView().setVisibility(8);
            this.B1.getToolsView().setAlpha(0.0f);
            this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.B1.i0.setVisibility(0);
        }
    }

    public final void t(boolean z10) {
        if (this.M0 != null) {
            xb xbVar = this.A0;
            if ((xbVar != null && xbVar.j()) == this.M0.P) {
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
        xb xbVar2 = this.A0;
        jb jbVar = new jb(this, this.c, this.b, this.a, albumEntry, z10, z11, xbVar2 != null && xbVar2.j());
        this.M0 = jbVar;
        jbVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new za(this, 1));
        this.M0.setOnSelectListener(new ya(z10, this, 0));
        this.M0.setOnSelectMultipleListener(new yh.y0(this, 2));
        s4.b0 b0Var = this.l2;
        if (b0Var != null) {
            f3 f3Var = this.M0.e;
            f3Var.B = b0Var;
            f3Var.l0();
        }
        this.n.addView(this.M0, w7.z5.e(-1, -1, 119));
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
        k8 k8Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        k8 k8Var2;
        pg.f1 renderView;
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
        k8 k8Var3 = this.K1;
        Bitmap decodeFile = (k8Var3 == null || !(k8Var3.c || k8Var3.g || this.H1 != null) || (file3 = k8Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        k8 k8Var4 = this.K1;
        if (k8Var4 == null || (!(k8Var4.c || k8Var4.g || this.H1 != null) || (file2 = k8Var4.Q0) == null)) {
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
                k8Var = this.K1;
                if (k8Var != null || k8Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = k8Var != null ? file : k8Var.L;
                if (k8Var == null && k8Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (k8Var != null || k8Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.X0.getOrientation();
                k8Var2 = this.K1;
                Object obj2 = obj;
                if (k8Var2 != null) {
                    obj2 = k8Var2.T0;
                }
                ?? r13 = obj2;
                MediaController.CropState cropState = new MediaController.CropState();
                a7 a7Var = this.s0;
                yb ybVar = this.X0;
                Activity activity = this.b;
                boolean z15 = z12;
                mb mbVar = new mb(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, k8Var2, measuredWidth, measuredHeight, cropState, this.r0, this.a, a7Var, ybVar);
                this.v1 = mbVar;
                k8 k8Var5 = this.K1;
                mbVar.setHasAudio(k8Var5 == null && k8Var5.y != null);
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
                this.v1.setOnDoneButtonClickedListener(new ga(this, 21));
                this.v1.setOnCancelButtonClickedListener(new ga(this, 22));
                mb mbVar2 = this.v1;
                mbVar2.R0.setVisibility(0);
                mbVar2.O0.setVisibility(0);
                mbVar2.P0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.h0.getMeasuredWidth();
        int measuredHeight2 = this.h0.getMeasuredHeight();
        k8Var = this.K1;
        if (k8Var != null) {
        }
        file = null;
        z11 = false;
        if (k8Var != null) {
        }
        if (k8Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (k8Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.X0.getOrientation();
        k8Var2 = this.K1;
        Object obj22 = obj;
        if (k8Var2 != null) {
        }
        ?? r132 = obj22;
        MediaController.CropState cropState2 = new MediaController.CropState();
        a7 a7Var2 = this.s0;
        yb ybVar2 = this.X0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        mb mbVar3 = new mb(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, k8Var2, measuredWidth2, measuredHeight2, cropState2, this.r0, this.a, a7Var2, ybVar2);
        this.v1 = mbVar3;
        k8 k8Var52 = this.K1;
        mbVar3.setHasAudio(k8Var52 == null && k8Var52.y != null);
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
        this.v1.setOnDoneButtonClickedListener(new ga(this, 21));
        this.v1.setOnCancelButtonClickedListener(new ga(this, 22));
        mb mbVar22 = this.v1;
        mbVar22.R0.setVisibility(0);
        mbVar22.O0.setVisibility(0);
        mbVar22.P0.setVisibility(0);
    }

    public final void v(boolean z10) {
        f7 f7Var = this.C0;
        if (f7Var != null) {
            f7Var.f = null;
            Utilities.globalQueue.cancelRunnable(f7Var.h);
            this.C0 = null;
            xb xbVar = this.A0;
            if (xbVar != null) {
                xbVar.c.b(null);
            }
        }
        t7 t7Var = this.D0;
        if (t7Var != null) {
            t7Var.F = null;
            t7Var.G = null;
            t7Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                b0(new ga(this, 8));
                return;
            }
            b0(new ga(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            xb xbVar2 = this.A0;
            if (xbVar2 != null) {
                xbVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void w() {
        jb jbVar = this.M0;
        if (jbVar == null) {
            return;
        }
        this.n.removeView(jbVar);
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
        vf0 vf0Var = this.B1;
        if (vf0Var == null) {
            return;
        }
        vf0Var.e();
        this.C1.setFilterView(null);
        this.r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        kf0 kf0Var = this.E1;
        if (kf0Var != null) {
            this.h0.removeView(kf0Var);
            this.E1 = null;
        }
        mf0 mf0Var = this.F1;
        if (mf0Var != null) {
            this.h0.removeView(mf0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void z() {
        mb mbVar = this.v1;
        if (mbVar == null) {
            return;
        }
        mbVar.R0.removeAllViews();
        mb mbVar2 = this.v1;
        mbVar2.O0.h();
        mbVar2.R0.setVisibility(8);
        mbVar2.Q0.setVisibility(8);
        mbVar2.E0.postRunnable(new ai.f(7));
        y5 y5Var = mbVar2.k2;
        if (y5Var != null) {
            y5Var.dismiss();
        }
        pg.x xVar = mbVar2.T1;
        if (xVar != null) {
            xVar.dismiss();
        }
        this.r.removeView(this.v1);
        this.v1 = null;
        pg.f1 f1Var = this.w1;
        if (f1Var != null) {
            this.h0.removeView(f1Var);
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
