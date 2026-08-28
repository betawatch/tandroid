package kh;

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
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class wb implements NotificationCenter.NotificationCenterDelegate {
    public static wb B2;
    public ValueAnimator A;
    public final hc A0;
    public fe0 A1;
    public ValueAnimator A2;
    public rb B;
    public final ic B0;
    public he0 B1;
    public float C;
    public final a0 C0;
    public File C1;
    public final RectF D;
    public final hc D0;
    public ArrayList D1;
    public float E;
    public final z E0;
    public ArrayList E1;
    public int F;
    public final lc F0;
    public ArrayList F1;
    public float G;
    public boolean G0;
    public a8 G1;
    public Float H;
    public boolean H0;
    public boolean H1;
    public boolean I;
    public va I0;
    public long I1;
    public long J;
    public w0 J0;
    public boolean J1;
    public boolean K;
    public final z6 K0;
    public int K1;
    public final AnimationNotificationsLocker L;
    public final d L0;
    public boolean L1;
    public Runnable M;
    public final oa M0;
    public boolean M1;
    public Utilities.Callback4 N;
    public final q2 N0;
    public boolean N1;
    public int O;
    public final q2 O0;
    public boolean O1;
    public int P;
    public final v3 P0;
    public float P1;
    public int Q;
    public final v3 Q0;
    public int Q1;
    public boolean R;
    public final i81 R0;
    public boolean R1;
    public boolean S;
    public final x3 S0;
    public boolean S1;
    public boolean T;
    public final kb T0;
    public boolean T1;
    public int U;
    public final FrameLayout U0;
    public String U1;
    public int V;
    public final gc V0;
    public AnimatorSet V1;
    public int W;
    public final kc W0;
    public boolean W1;
    public int X;
    public final k6 X0;
    public boolean X1;
    public final RectF Y;
    public final mb Y0;
    public boolean Y1;
    public final RectF Z;
    public final na Z0;
    public boolean Z1;
    public final ih.b a;
    public final Path a0;
    public final v0 a1;
    public Runnable a2;
    public final Activity b;
    public int b0;
    public mi0 b1;
    public AnimatorSet b2;
    public final int c;
    public int c0;
    public final pi0 c1;
    public ba c2;
    public boolean d;
    public final ib d0;
    public mi0 d1;
    public boolean d2;
    public boolean e;
    public final FrameLayout e0;
    public ImageView e1;
    public AnimatorSet e2;
    public final WindowManager f;
    public final LinearLayout f0;
    public final h6 f1;
    public ValueAnimator f2;
    public final FrameLayout g0;
    public final x3 g1;
    public boolean g2;
    public final WindowManager.LayoutParams h;
    public final fh.d2 h0;
    public final x3 h1;
    public f2.l0 h2;
    public final FrameLayout i0;
    public final x3 i1;
    public MediaController.AlbumEntry i2;
    public final q2 j0;
    public final x3 j1;
    public ValueAnimator j2;
    public final t7 k0;
    public final l6 k1;
    public o1.j k2;
    public final org.telegram.ui.ActionBar.h5 l0;
    public final jc l1;
    public Boolean l2;
    public t9 m0;
    public q m1;
    public fa m2;
    public final vb n;
    public final org.telegram.ui.Components.ba n0;
    public gb n1;
    public AnimatorSet n2;
    public final q6 o0;
    public hb o1;
    public boolean o2;
    public final fh.l2 p0;
    public final gc p1;
    public int p2;
    public boolean q0;
    public final d q1;
    public ArrayList q2;
    public final ob r;
    public long r0;
    public ya r1;
    public FrameLayout r2;
    public final s2 s;
    public String s0;
    public xf.c1 s1;
    public boolean s2;
    public TLRPC.InputPeer t0;
    public View t1;
    public v9 t2;
    public r9 u0;
    public View u1;
    public bg.c2 u2;
    public boolean v;
    public u v0;
    public View v1;
    public boolean v2;
    public long w;
    public final jb w0;
    public View w1;
    public boolean w2;
    public nb x;
    public za x0;
    public qe0 x1;
    public boolean x2;
    public final ff.t0 y;
    public v6 y0;
    public final oe0 y1;
    public eb y2;
    public final k7 z0;
    public TextureView z1;
    public float z2;

    public wb(Activity activity, int i9) {
        int i10;
        ih.b bVar = new ih.b();
        this.a = bVar;
        this.w = 0L;
        this.D = new RectF();
        int i11 = 1;
        this.I = true;
        this.L = new AnimationNotificationsLocker();
        this.Y = new RectF();
        this.Z = new RectF();
        this.a0 = new Path();
        new Rect();
        this.b0 = 0;
        this.c0 = -1;
        this.u0 = new r9();
        this.D1 = null;
        this.E1 = null;
        this.F1 = null;
        this.K1 = 0;
        this.L1 = false;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.Q1 = -3;
        this.S1 = false;
        ra raVar = new ra(this);
        this.Z1 = true;
        this.g2 = true;
        this.p2 = -1;
        this.b = activity;
        this.c = i9;
        LaunchActivity launchActivity = LaunchActivity.C1;
        this.y = launchActivity != null ? new ff.t0(launchActivity, true) : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        layoutParams.flags = -2013200128;
        int i12 = 16;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        vb vbVar = new vb(this, activity);
        this.n = vbVar;
        ea eaVar = new ea(this, i11);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(vbVar, eaVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        s2 s2Var = new s2(activity, windowManager, this.n, layoutParams);
        this.s = s2Var;
        s2Var.a(new cb(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        vb vbVar2 = this.n;
        ob obVar = new ob(this, activity);
        this.r = obVar;
        vbVar2.addView(obVar);
        ob obVar2 = this.r;
        ib ibVar = new ib(this, activity);
        this.d0 = ibVar;
        obVar2.addView(ibVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.n0 = new org.telegram.ui.Components.ba(this.d0);
        this.o0 = new q6();
        ob obVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.e0 = frameLayout;
        obVar3.addView(frameLayout);
        ob obVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.g0 = frameLayout2;
        obVar4.addView(frameLayout2);
        ob obVar5 = this.r;
        fh.d2 d2Var = new fh.d2(this, activity, 6);
        this.h0 = d2Var;
        obVar5.addView(d2Var);
        this.h0.setVisibility(8);
        this.h0.setAlpha(0.0f);
        ob obVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.i0 = frameLayout3;
        obVar6.addView(frameLayout3);
        org.telegram.ui.Components.gc.a(this.n, new bg.z(6));
        int i13 = 8;
        jb jbVar = new jb(this, activity, this.n0, this.r, bVar);
        this.w0 = jbVar;
        vb vbVar3 = this.n;
        Objects.requireNonNull(vbVar3);
        int i14 = 13;
        jbVar.setCancelGestures(new f1(vbVar3, i14));
        this.w0.setResetState(new v9(this, i14));
        this.d0.addView(this.w0, g7.e6.e(-1, -1, 119));
        this.w0.setOnClickListener(new x9(this, 12));
        ib ibVar2 = this.d0;
        int i15 = this.F;
        ibVar2.setBackgroundColor((i15 == 1 || i15 == 0) ? 0 : -14737633);
        ib ibVar3 = this.d0;
        float dp = AndroidUtilities.dp(12.0f);
        bg.q1 q1Var = ff.r0.a;
        ibVar3.setOutlineProvider(new ff.q0(0, dp));
        this.d0.setClipToOutline(true);
        v9 v9Var = new v9(this, 14);
        oe0 oe0Var = new oe0(activity);
        oe0Var.a = new TextPaint(1);
        oe0Var.b = new TextPaint(1);
        gr grVar = gr.h;
        oe0Var.s = new org.telegram.ui.Components.y5(oe0Var, 0L, 350L, grVar);
        oe0Var.E = new ib0(oe0Var, 7);
        oe0Var.x = v9Var;
        this.y1 = oe0Var;
        kb kbVar = new kb(this, activity, this.n0, this.o0);
        this.T0 = kbVar;
        kbVar.setCollageView(this.w0);
        kb kbVar2 = this.T0;
        kbVar2.v = new v9(this, 15);
        kbVar2.setOnTapListener(new v9(this, i12));
        this.T0.setVisibility(8);
        kb kbVar3 = this.T0;
        kbVar3.J = new v9(this, 17);
        this.d0.addView(kbVar3, g7.e6.e(-1, -1, 119));
        this.d0.addView(this.y1, g7.e6.e(-1, -1, 119));
        vb vbVar4 = this.n;
        int i16 = 6;
        int i17 = 2;
        mb mbVar = new mb(this, activity, vbVar4, vbVar4, this.r, bVar, this.n0);
        this.Y0 = mbVar;
        mbVar.setAccount(i9);
        this.Y0.setUiBlurBitmap(new ea(this, i16));
        int i18 = 5;
        org.telegram.ui.Components.gc.a(this.h0, new fh.y0(this, i18));
        this.Y0.setOnHeightUpdate(new w9(this, i14));
        this.Y0.setOnPeriodUpdate(new w9(this, 4));
        long j10 = this.J;
        if (j10 != 0) {
            this.Y0.setDialogId(j10);
        }
        this.Y0.setOnPremiumHint(new w9(this, i18));
        this.Y0.setOnKeyboardOpen(new w9(this, i16));
        fh.l2 l2Var = new fh.l2(this, activity, i17);
        this.p0 = l2Var;
        this.r.addView(l2Var);
        gc gcVar = new gc(activity, this.r, this.d0, bVar, this.n0);
        this.V0 = gcVar;
        gcVar.setOnTimelineClick(new v9(this, 10));
        this.V0.setOnHeightChange(new v9(this, 11));
        this.T0.setVideoTimelineView(this.V0);
        this.V0.setVisibility(8);
        this.V0.setAlpha(0.0f);
        this.V0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.U0 = frameLayout4;
        float f10 = 388;
        frameLayout4.addView(this.V0, g7.e6.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        kc kcVar = new kc(activity);
        this.W0 = kcVar;
        kcVar.setVisibility(8);
        this.W0.a(false);
        this.U0.addView(this.W0, g7.e6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.h0.addView(this.U0, g7.e6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.h0.addView(this.Y0, g7.e6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.w0.setTimelineView(this.V0);
        this.w0.setPreviewView(this.T0);
        gc gcVar2 = new gc(activity, this.r, this.d0, bVar, this.n0);
        this.p1 = gcVar2;
        gcVar2.T0 = true;
        gcVar2.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.h0.addView(this.p1, g7.e6.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        na naVar = new na(this, activity, bVar, this.n0);
        this.Z0 = naVar;
        naVar.setVisibility(8);
        this.h0.addView(this.Z0, g7.e6.e(-1, -2, 85));
        q2 q2Var = new q2(activity);
        this.j0 = q2Var;
        q2Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        q2 q2Var2 = this.j0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        q2Var2.setScaleType(scaleType);
        this.j0.setImageResource(R.drawable.msg_photo_back);
        q2 q2Var3 = this.j0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        q2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.j0.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.j0.setOnClickListener(new x9(this, i11));
        this.e0.addView(this.j0, g7.e6.e(56, 56, 51));
        this.s.a(this.j0);
        t7 t7Var = new t7(activity, i9);
        this.k0 = t7Var;
        t7Var.a(false, false);
        this.k0.setOnClickListener(new bg.u1(27, this, activity));
        this.e0.addView(this.k0, g7.e6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.l0 = h5Var;
        h5Var.setTextSize(20);
        this.l0.setGravity(19);
        this.l0.setTextColor(-1);
        this.l0.setTypeface(AndroidUtilities.bold());
        this.l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.l0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.l0.setAlpha(0.0f);
        this.l0.setVisibility(8);
        this.l0.setEllipsizeByGradient(true);
        this.l0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.e0.addView(this.l0, g7.e6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f0.setGravity(5);
        this.e0.addView(this.f0, g7.e6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        w9 w9Var = new w9(this, 7);
        vb vbVar5 = this.n;
        v0 v0Var = new v0(activity);
        v0Var.w = true;
        v0Var.x = true;
        v0Var.h = w9Var;
        v0Var.a = i9;
        v0Var.b = vbVar5;
        v0Var.setScaleType(scaleType);
        v0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        v0Var.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        v0Var.setVisibility(8);
        v0Var.setAlpha(0.0f);
        v0Var.setOnClickListener(new androidx.mediarouter.app.c(v0Var, 27));
        v0Var.f = new jp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        v0Var.d();
        this.a1 = v0Var;
        x3 x3Var = new x3(activity, 1);
        x3Var.m(1.0f, -71.0f);
        x3Var.d = 2000L;
        x3Var.Q = false;
        x3Var.D.o(true, false, false);
        this.g1 = x3Var;
        x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.e0.addView(this.g1, g7.e6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        pi0 pi0Var = new pi0(activity);
        this.c1 = pi0Var;
        pi0Var.setScaleType(scaleType);
        pi0 pi0Var2 = this.c1;
        a8 a8Var = this.G1;
        pi0Var2.setImageResource((a8Var == null || !a8Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.c1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.c1.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.c1.setOnClickListener(new x9(this, 2));
        this.c1.setVisibility(8);
        this.c1.setAlpha(0.0f);
        h6 h6Var = new h6(activity);
        this.f1 = h6Var;
        h6Var.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.f1.setVisibility(8);
        this.f1.setAlpha(0.0f);
        this.f1.setOnClickListener(new x9(this, 3));
        this.f0.addView(this.f1, g7.e6.q(46, 56, 53));
        this.f0.addView(this.c1, g7.e6.q(46, 56, 53));
        this.f0.addView(this.a1, g7.e6.e(46, 56, 53));
        hc hcVar = new hc(activity);
        this.A0 = hcVar;
        hcVar.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.A0.setOnClickListener(new x9(this, 4));
        this.A0.setOnLongClickListener(new d5(this, i11));
        this.A0.setVisibility(8);
        this.A0.setAlpha(0.0f);
        this.s.a(this.A0);
        this.e0.addView(this.A0, g7.e6.e(56, 56, 53));
        ic icVar = new ic(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.B0 = icVar;
        icVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.B0.setOnClickListener(new x9(this, 5));
        boolean q10 = d1.q(activity);
        this.B0.setVisibility(q10 ? 0 : 8);
        this.B0.setAlpha(q10 ? 1.0f : 0.0f);
        this.s.a(this.B0);
        this.e0.addView(this.B0, g7.e6.e(56, 56, 53));
        a0 a0Var = new a0(activity);
        this.C0 = a0Var;
        a0Var.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.C0.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        if (this.v0 == null) {
            i10 = 6;
            this.v0 = (u) u.a().get(6);
        } else {
            i10 = 6;
        }
        this.C0.setOnClickListener(new x9(this, i10));
        this.C0.a(new v(this.v0, false), false);
        this.C0.setSelected(false);
        this.C0.setVisibility(0);
        this.C0.setAlpha(1.0f);
        this.s.a(this.C0);
        this.e0.addView(this.C0, g7.e6.e(56, 56, 53));
        hc hcVar2 = new hc(activity);
        this.D0 = hcVar2;
        hcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.D0.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.D0.a(new v(new u("../../.."), true), false);
        this.D0.setVisibility(8);
        this.D0.setAlpha(0.0f);
        this.D0.setOnClickListener(new x9(this, 7));
        this.s.a(this.D0);
        this.e0.addView(this.D0, g7.e6.e(56, 56, 53));
        z zVar = new z(activity, this.s);
        this.E0 = zVar;
        zVar.a.u0(6);
        this.E0.setSelected((u) null);
        this.E0.setOnLayoutClick(new w9(this, i13));
        this.e0.addView(this.E0, g7.e6.e(-1, 56, 53));
        x3 x3Var2 = new x3(activity, 1);
        x3Var2.m(1.0f, -20.0f);
        x3Var2.d = 5000L;
        x3Var2.i();
        x3Var2.t(LocaleController.getString(R.string.StoryCameraDualHint));
        x3Var2.h0 = new bg.d2(17);
        this.h1 = x3Var2;
        x3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.e0.addView(this.h1, g7.e6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        x3 x3Var3 = new x3(activity, 2);
        x3Var3.m(0.0f, 28.0f);
        x3Var3.d = 5000L;
        x3Var3.q(true);
        this.i1 = x3Var3;
        this.e0.addView(x3Var3, g7.e6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        x3 x3Var4 = new x3(activity, 1);
        x3Var4.m(1.0f, -20.0f);
        x3Var4.d = 5000L;
        x3Var4.t(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.j1 = x3Var4;
        x3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.e0.addView(this.j1, g7.e6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        lc lcVar = new lc(activity);
        Paint paint = new Paint(1);
        lcVar.a = paint;
        Paint paint2 = new Paint(1);
        lcVar.b = paint2;
        lcVar.e = new org.telegram.ui.Components.y5(lcVar, 0L, 250L, grVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        lcVar.c = i6Var;
        i6Var.k(0.3f, 250L, grVar);
        i6Var.t(AndroidUtilities.dp(13.0f));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.bold());
        i6Var.setCallback(lcVar);
        i6Var.b = 1;
        lcVar.a(0L, false);
        this.F0 = lcVar;
        i0(false, false);
        this.e0.addView(this.F0, g7.e6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.F0);
        MediaController.loadGalleryPhotosAlbums(0);
        z6 z6Var = new z6(activity);
        this.K0 = z6Var;
        z6Var.setDelegate(raVar);
        z6 z6Var2 = this.K0;
        boolean z10 = this.K1 == 1;
        z6Var2.j0 = -1.0f;
        z6Var2.k0 = z10;
        z6Var2.invalidate();
        this.g0.addView(this.K0, g7.e6.e(-1, 100, 87));
        this.s.a(this.K0);
        this.K0.e(this.w0.j() ? this.w0.getFilledProgress() : 0.0f, true);
        d dVar = new d(activity, bVar, true);
        this.L0 = dVar;
        dVar.setRoundRadius(24);
        this.L0.setColor(-2473124);
        this.L0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.L0.setAlpha(0.0f);
        this.L0.setScaleX(0.8f);
        this.L0.setScaleY(0.8f);
        this.L0.setVisibility(8);
        this.g0.addView(this.L0, g7.e6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.L0.setOnClickListener(new x9(this, i13));
        x3 x3Var5 = new x3(activity, 3);
        x3Var5.q(true);
        x3Var5.t(LocaleController.getString(R.string.StoryCameraHint2));
        x3Var5.h = AndroidUtilities.dp(320.0f);
        x3Var5.d = 5000L;
        x3Var5.G = Layout.Alignment.ALIGN_CENTER;
        this.S0 = x3Var5;
        this.g0.addView(x3Var5, g7.e6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        i81 i81Var = new i81(activity);
        this.R0 = i81Var;
        i81Var.I = false;
        i81Var.setAlpha(0.0f);
        this.g0.addView(this.R0, g7.e6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.R0.setDelegate(new ea(this, 4));
        i81 i81Var2 = this.R0;
        this.P1 = 0.0f;
        i81Var2.b(0.0f, false);
        int i19 = 12;
        k7 k7Var = new k7(activity, i9, new v9(this, i19));
        this.z0 = k7Var;
        k7Var.c = new w9(this, 9);
        this.g0.addView(k7Var, g7.e6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        oa oaVar = new oa(this, activity);
        this.M0 = oaVar;
        int i20 = 10;
        oaVar.setOnSwitchModeListener(new w9(this, i20));
        int i21 = 11;
        this.M0.setOnSwitchingModeListener(new w9(this, i21));
        this.i0.addView(this.M0, g7.e6.e(-1, 48, 55));
        this.s.a(this.M0);
        q2 q2Var4 = new q2(activity);
        this.N0 = q2Var4;
        q2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.N0.setImageResource(R.drawable.stream_flip);
        this.N0.setScaleType(scaleType);
        this.N0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N0.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.i0.addView(this.N0, g7.e6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.N0);
        this.N0.setOnClickListener(new x9(this, 9));
        q2 q2Var5 = new q2(activity);
        this.O0 = q2Var5;
        q2Var5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.O0.setImageResource(R.drawable.stream_settings);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.i0.addView(this.O0, g7.e6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.O0);
        this.O0.setOnClickListener(new x9(this, i20));
        v3 v3Var = new v3(activity);
        this.P0 = v3Var;
        this.i0.addView(v3Var, g7.e6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.P0);
        v3 v3Var2 = new v3(activity);
        this.Q0 = v3Var2;
        v3Var2.a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        v3Var2.invalidate();
        this.Q0.setAlpha(0.0f);
        this.i0.addView(this.Q0, g7.e6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.Q0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.q1 = dVar2;
        dVar2.setVisibility(8);
        this.q1.setAlpha(0.0f);
        this.q1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.q1.setOnClickListener(new x9(this, i21));
        this.i0.addView(this.q1, g7.e6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        k6 k6Var = new k6(activity);
        k6Var.b = new ArrayList();
        k6Var.e = true;
        k6Var.h = true;
        View view = new View(activity);
        k6Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        k6Var.addView(view, g7.e6.e(-1, -1, 119));
        k6Var.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        k6Var.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        k6Var.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        k6Var.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        k6Var.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        k6Var.d = string;
        k6Var.e = true;
        j6 j6Var = new j6(k6Var, activity, string, true);
        k6Var.c = j6Var;
        j6Var.setContentDescription(LocaleController.getString(R.string.Send));
        k6Var.addView(k6Var.c, g7.e6.c(-2.0f, -2));
        k6Var.e();
        this.X0 = k6Var;
        k6Var.setVisibility(8);
        this.X0.setOnClickListener(new w9(this, i19));
        this.i0.addView(this.X0, g7.e6.e(-1, 52, 23));
        jc jcVar = new jc(activity);
        this.l1 = jcVar;
        jcVar.setAlpha(0.0f);
        this.l1.setVisibility(8);
        this.d0.addView(this.l1, g7.e6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        l6 l6Var = new l6(activity, i9, bVar);
        this.k1 = l6Var;
        this.d0.addView(l6Var, g7.e6.e(-1, -1, 119));
        m0(false);
    }

    public static wb E(Activity activity, int i9) {
        wb wbVar = B2;
        if (wbVar != null && (wbVar.b != activity || wbVar.c != i9)) {
            wbVar.q(false);
            B2 = null;
        }
        if (B2 == null) {
            B2 = new wb(activity, i9);
        }
        return B2;
    }

    public static void a(wb wbVar) {
        za zaVar = wbVar.x0;
        if (zaVar == null || zaVar.getTextureView() == null) {
            wbVar.Y1 = false;
            return;
        }
        Bitmap bitmap = wbVar.x0.getTextureView().getBitmap();
        if (bitmap == null) {
            wbVar.Y1 = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float f10 = 0.0f;
        for (int i9 = 0; i9 < 10; i9++) {
            int i10 = 0;
            while (i10 < 10) {
                i10++;
                f10 += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i9 + 1) * width, i10 * height));
            }
        }
        float f11 = f10 / 100.0f;
        bitmap.recycle();
        wbVar.Y1 = f11 < 0.22f;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(wb wbVar) {
        Activity activity = wbVar.b;
        if (activity == null) {
            return true;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            r4 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
            if (r4) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
            }
        } else if (i9 >= 23) {
            r4 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
            if (r4) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
            }
        }
        return !r4;
    }

    public static void c(wb wbVar) {
        ValueAnimator valueAnimator = wbVar.f2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            wbVar.f2 = null;
        }
        int i9 = 0;
        wbVar.g2 = false;
        ob obVar = wbVar.r;
        float f10 = obVar.a;
        float f11 = obVar.b;
        obVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        wbVar.f2 = ofFloat;
        ofFloat.addUpdateListener(new ka(wbVar, f10, f11, i9));
        wbVar.f2.setDuration(340L);
        wbVar.f2.setInterpolator(gr.h);
        wbVar.f2.addListener(new ua(wbVar, i9));
        wbVar.f2.start();
    }

    public static boolean d(wb wbVar) {
        Activity activity = wbVar.b;
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
        int i9 = -dp;
        mutate.setBounds(i9 / 4, i9, (dp / 4) * 3, 0);
        spannableString.setSpan(new db(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        wb wbVar = B2;
        if (wbVar != null) {
            wbVar.q(false);
        }
        B2 = null;
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
        ArrayList arrayList = this.E1;
        if (arrayList != null) {
            return arrayList.size();
        }
        a8 a8Var = this.G1;
        if (a8Var != null) {
            return a8Var.r();
        }
        return 1;
    }

    public final String C() {
        za zaVar = this.x0;
        if (zaVar == null || zaVar.getCameraSession() == null) {
            return null;
        }
        if (!this.x0.isFrontface() || this.x0.getCameraSession().hasFlashModes()) {
            return this.x0.getCameraSession().getCurrentFlashMode();
        }
        p();
        return (String) this.q2.get(this.p2);
    }

    public final w0 D() {
        if (this.J0 == null) {
            w0 w0Var = new w0(this.b);
            this.J0 = w0Var;
            this.g0.addView(w0Var, g7.e6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.J0;
    }

    public final String F() {
        za zaVar = this.x0;
        if (zaVar == null || zaVar.getCameraSession() == null) {
            return null;
        }
        if (!this.x0.isFrontface() || this.x0.getCameraSession().hasFlashModes()) {
            return this.x0.getCameraSession().getNextFlashMode();
        }
        p();
        ArrayList arrayList = this.q2;
        return (String) arrayList.get(this.p2 + 1 >= arrayList.size() ? 0 : this.p2 + 1);
    }

    public final ImageView G() {
        if (this.e1 == null) {
            mi0 mi0Var = new mi0(R.raw.sun_outline, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d1 = mi0Var;
            mi0Var.h = true;
            a8 a8Var = this.G1;
            if (a8Var == null || !a8Var.y0) {
                mi0Var.N(0);
                this.d1.K(0);
            } else {
                mi0Var.K(35);
                this.d1.N(36);
            }
            this.d1.W = true;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J9, this.a);
            this.d1.O(v02, "Sunny");
            this.d1.O(v02, "Path 6");
            this.d1.O(v02, "Path");
            this.d1.O(v02, "Path 5");
            this.d1.m();
            ImageView imageView = new ImageView(this.b);
            this.e1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.e1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.e1.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
            this.e1.setOnClickListener(new x9(this, 0));
            this.e1.setVisibility(8);
            this.e1.setImageDrawable(this.d1);
            this.e1.setAlpha(0.0f);
            this.f0.addView(this.e1, 0, g7.e6.q(46, 56, 53));
        }
        return this.e1;
    }

    public final void H() {
        ya yaVar = this.r1;
        if (yaVar == null) {
            return;
        }
        this.r2 = null;
        yaVar.getTopLayout().setAlpha(0.0f);
        this.r1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.r1.getBottomLayout().setAlpha(0.0f);
        this.r1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.r1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.r1.setVisibility(8);
    }

    public final boolean I() {
        return !this.W1 && (this.w0.j() ? this.w0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean J() {
        va vaVar;
        if (this.S || (vaVar = this.I0) == null) {
            return false;
        }
        return vaVar.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
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
    public final void K(int i9, boolean z10) {
        a8 a8Var;
        a8 a8Var2;
        d dVar;
        org.telegram.ui.ActionBar.h5 h5Var;
        int i10;
        int i11;
        float dp;
        ImageView imageView;
        a8 a8Var3;
        a8 a8Var4;
        a8 a8Var5;
        a8 a8Var6;
        za zaVar;
        int i12 = this.b0;
        if (i9 == i12) {
            return;
        }
        this.b0 = i9;
        AnimatorSet animatorSet = this.e2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        O(i12, i9);
        k6 k6Var = this.X0;
        if (k6Var != null) {
            k6Var.b(i9 == 1, z10);
        }
        z zVar = this.E0;
        i0(i9 == 0 && this.K1 == 1 && !zVar.e && !I(), z10);
        if (i9 != 1) {
            this.W0.a(z10);
        }
        c0(this.j0, !zVar.e, z10);
        c0(this.A0, (this.W1 || i9 != 0 || zVar.e || this.U1 == null || I()) ? false : true, z10);
        boolean z11 = this.W1;
        jb jbVar = this.w0;
        c0(this.B0, (z11 || i9 != 0 || (zaVar = this.x0) == null || !zaVar.a || zVar.e || jbVar.j()) ? false : true, true);
        c0(this.C0, (this.W1 || i9 != 0 || zVar.e) ? false : true, z10);
        m0(z10);
        v0 v0Var = this.a1;
        h6 h6Var = this.f1;
        pi0 pi0Var = this.c1;
        gc gcVar = this.p1;
        gc gcVar2 = this.V0;
        d dVar2 = this.q1;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.l0;
        mb mbVar = this.Y0;
        v3 v3Var = this.Q0;
        v3 v3Var2 = this.P0;
        k7 k7Var = this.z0;
        kb kbVar = this.T0;
        fh.d2 d2Var = this.h0;
        oa oaVar = this.M0;
        z6 z6Var = this.K0;
        if (!z10) {
            za zaVar2 = this.x0;
            if (zaVar2 != null) {
                zaVar2.setAlpha(i9 == 0 ? 1.0f : 0.0f);
            }
            kbVar.setAlpha(((i9 != 1 || jbVar.j()) && i9 != 2) ? 0.0f : 1.0f);
            jbVar.setAlpha((i9 == 0 || (i9 == 1 && jbVar.j())) ? 1.0f : 0.0f);
            z6Var.setAlpha(i9 == 0 ? 1.0f : 0.0f);
            z6Var.setTranslationY(i9 == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            k7Var.setAlpha(i9 == 0 ? 1.0f : 0.0f);
            oaVar.setAlpha((i9 != 0 || I()) ? 0.0f : 1.0f);
            oaVar.setTranslationY((i9 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            v3Var2.setAlpha((i9 == 0 && this.W1 && !I()) ? 1.0f : 0.0f);
            v3Var.setAlpha((i9 == 0 && !this.W1 && I()) ? 0.6f : 0.0f);
            d2Var.setAlpha((i9 == 1 || i9 == 2) ? 1.0f : 0.0f);
            d2Var.setTranslationY((i9 == 1 || i9 == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            mbVar.setAlpha(i9 == 2 ? 0.0f : 1.0f);
            pi0Var.setAlpha((i9 == 1 && this.K1 == 1) ? 1.0f : 0.0f);
            h6Var.setAlpha((i9 != 1 || (this.K1 != 1 && ((a8Var2 = this.G1) == null || TextUtils.isEmpty(a8Var2.y)))) ? 0.0f : 1.0f);
            int i13 = 1;
            v0Var.setAlpha(i9 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.e1;
            if (imageView2 != null) {
                imageView2.setAlpha((i9 == 1 && (a8Var = this.G1) != null && a8Var.u) ? 1.0f : 0.0f);
                i13 = 1;
            }
            gcVar2.setAlpha(i9 == i13 ? 1.0f : 0.0f);
            gcVar.setAlpha(i9 == 2 ? 1.0f : 0.0f);
            h5Var2.setAlpha((i9 == i13 || i9 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i9 == 2 ? 1.0f : 0.0f);
            N(i12, i9);
            return;
        }
        this.e2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        za zaVar3 = this.x0;
        if (zaVar3 != null) {
            dVar = dVar2;
            h5Var = h5Var2;
            i10 = 1;
            arrayList.add(ObjectAnimator.ofFloat(zaVar3, (Property<za, Float>) View.ALPHA, i9 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            h5Var = h5Var2;
            i10 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i10];
        fArr[0] = ((i9 != i10 || jbVar.j()) && i9 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(kbVar, (Property<kb, Float>) property, fArr));
        float[] fArr2 = new float[i10];
        fArr2[0] = (i9 == 0 || (i9 == i10 && jbVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(jbVar, (Property<jb, Float>) property, fArr2));
        float[] fArr3 = new float[i10];
        fArr3[0] = i9 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(z6Var, (Property<z6, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i10];
        fArr4[0] = i9 == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(z6Var, (Property<z6, Float>) property2, fArr4));
        float[] fArr5 = new float[i10];
        fArr5[0] = i9 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(k7Var, (Property<k7, Float>) property, fArr5));
        float[] fArr6 = new float[i10];
        fArr6[0] = (i9 != 0 || I()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(oaVar, (Property<oa, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(oaVar, (Property<oa, Float>) property2, (i9 != 0 || I()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(v3Var2, (Property<v3, Float>) property, (i9 == 0 && this.W1 && !I()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(v3Var, (Property<v3, Float>) property, (i9 == 0 && !this.W1 && I()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<fh.d2, Float>) property, ((i9 == 1 && ((a8Var6 = this.G1) == null || a8Var6.J0 == 0)) || i9 == 2) ? 1.0f : 0.0f));
        if (i9 == 1 && ((a8Var5 = this.G1) == null || a8Var5.J0 == 0)) {
            i11 = 2;
        } else {
            i11 = 2;
            if (i9 != 2) {
                dp = AndroidUtilities.dp(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<fh.d2, Float>) property2, dp));
                arrayList.add(ObjectAnimator.ofFloat(mbVar, (Property<mb, Float>) property, i9 != i11 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, (i9 != 1 || i9 == i11) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i9 != i11 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(gcVar2, (Property<gc, Float>) property, i9 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(gcVar, (Property<gc, Float>) property, i9 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) property, (i9 == 1 || this.K1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(h6Var, (Property<h6, Float>) property, (i9 == 1 || (this.K1 != 1 && ((a8Var4 = this.G1) == null || TextUtils.isEmpty(a8Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<v0, Float>) property, i9 != 1 ? 1.0f : 0.0f));
                imageView = this.e1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i9 == 1 && (a8Var3 = this.G1) != null && a8Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<i81, Float>) property, 0.0f));
                this.e2.playTogether(arrayList);
                this.e2.addListener(new ta(this, i12, i9, 0));
                this.e2.setDuration(460L);
                this.e2.setInterpolator(gr.h);
                this.e2.start();
            }
        }
        dp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<fh.d2, Float>) property2, dp));
        arrayList.add(ObjectAnimator.ofFloat(mbVar, (Property<mb, Float>) property, i9 != i11 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, (i9 != 1 || i9 == i11) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i9 != i11 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(gcVar2, (Property<gc, Float>) property, i9 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(gcVar, (Property<gc, Float>) property, i9 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) property, (i9 == 1 || this.K1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(h6Var, (Property<h6, Float>) property, (i9 == 1 || (this.K1 != 1 && ((a8Var4 = this.G1) == null || TextUtils.isEmpty(a8Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<v0, Float>) property, i9 != 1 ? 1.0f : 0.0f));
        imageView = this.e1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<i81, Float>) property, 0.0f));
        this.e2.playTogether(arrayList);
        this.e2.addListener(new ta(this, i12, i9, 0));
        this.e2.setDuration(460L);
        this.e2.setInterpolator(gr.h);
        this.e2.start();
    }

    public final void L(Runnable runnable, long j10) {
        if (this.O1 || this.G1 == null) {
            return;
        }
        ba baVar = this.c2;
        if (baVar != null) {
            AndroidUtilities.cancelRunOnUIThread(baVar);
        }
        this.d2 = true;
        this.O1 = true;
        this.c2 = new ba(this, runnable, 1);
        this.T0.setAlpha(0.0f);
        this.T0.setVisibility(0);
        this.T0.n(this.G1, this.c2, j10);
        this.T0.p(this.G1, false);
        AndroidUtilities.runOnUIThread(this.c2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fc, code lost:
    
        if (r0.k == false) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M() {
        a8 a8Var;
        a8 a8Var2;
        a8 a8Var3;
        ya yaVar;
        a8 a8Var4;
        ya yaVar2;
        ya yaVar3;
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            mb mbVar = this.Y0;
            if (mbVar != null && mbVar.K1) {
                mbVar.J1 = false;
                mbVar.z(false, false);
                return false;
            }
            if (this.M1) {
                z6 z6Var = this.K0;
                if (z6Var.n0) {
                    z6Var.n0 = false;
                    z6Var.r0 = SystemClock.elapsedRealtime();
                    z6Var.q0 = true;
                    ((ra) z6Var.a).d(false);
                    z6Var.F.c(false);
                    z6Var.G.c(false);
                    z6Var.H.c(false);
                    z6Var.invalidate();
                    return false;
                }
            } else if (!this.L1 && !mbVar.p()) {
                na naVar = this.Z0;
                if (naVar.I) {
                    naVar.c(false, true);
                    return false;
                }
                va vaVar = this.I0;
                if (vaVar != null) {
                    org.telegram.ui.ActionBar.w0 w0Var = vaVar.C;
                    if (w0Var == null || !w0Var.s()) {
                        f(false);
                        this.i2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    if (vaVar.v.c()) {
                        AndroidUtilities.hideKeyboard(searchField);
                        return false;
                    }
                    vaVar.x.v(w0Var.L(true));
                    return false;
                }
                if (this.c0 != 0 || (yaVar3 = this.r1) == null || !yaVar3.y0()) {
                    if (this.c0 > -1) {
                        l0(-1, false, true);
                        return false;
                    }
                    if (this.b0 == 0) {
                        ArrayList arrayList = this.w0.h;
                        int size = arrayList.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj = arrayList.get(i9);
                            i9++;
                            if (((e0) obj).n != null) {
                                this.w0.e();
                                m0(true);
                                return false;
                            }
                        }
                    }
                    if (this.b0 == 1 && (((a8Var2 = this.G1) == null || (!a8Var2.n && !a8Var2.u)) && !this.q0)) {
                        if (a8Var2 != null && a8Var2.g && ((yaVar2 = this.r1) == null || !yaVar2.u0())) {
                            a8 a8Var5 = this.G1;
                            if (!a8Var5.j) {
                            }
                        }
                        ya yaVar4 = this.r1;
                        if (yaVar4 == null || !yaVar4.y0()) {
                            if (this.r0 == 0 && (((this.H1 && !this.w0.j() && (((yaVar = this.r1) == null || !yaVar.u0()) && ((a8Var4 = this.G1) == null || a8Var4.Z0 == null))) || !this.X0.h) && (((a8Var3 = this.G1) == null || !a8Var3.g || (!a8Var3.n && !a8Var3.u)) && !this.q0 && (a8Var3 == null || !a8Var3.o)))) {
                                K(0, true);
                                return false;
                            }
                            if (this.r0 != 0) {
                                q(true);
                                return false;
                            }
                            Activity activity = this.b;
                            ih.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardChanges);
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                            a8 a8Var6 = this.G1;
                            if (a8Var6 != null && !a8Var6.g && !a8Var6.o) {
                                alertDialog$Builder.i(LocaleController.getString(a8Var6.c ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new ea(this, 8));
                            }
                            a8 a8Var7 = this.G1;
                            alertDialog$Builder.k(LocaleController.getString((a8Var7 == null || !a8Var7.c || a8Var7.g) ? R.string.Discard : R.string.StoryDeleteDraft), new ea(this, 9));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.show();
                            View d = c2Var.d(-1);
                            if (d instanceof TextView) {
                                int i10 = org.telegram.ui.ActionBar.f6.q7;
                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, bVar));
                                d.setBackground(org.telegram.ui.ActionBar.f6.Y(i0.a.k(org.telegram.ui.ActionBar.f6.v0(i10, bVar), 51), 6, 6));
                            }
                        }
                    }
                    if (this.b0 != 2 || (a8Var = this.G1) == null || a8Var.b0) {
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

    public final void N(int i9, int i10) {
        int i11;
        if (i9 == 0) {
            v(false);
            this.K0.setVisibility(8);
            this.R0.setVisibility(8);
            this.M0.setVisibility(8);
            h(false, false);
            d0(false);
        }
        if (i9 == 2) {
            this.p1.setVisibility(8);
            this.h0.setVisibility(i10 == 1 ? 0 : 8);
            this.Y0.setVisibility(8);
            this.q1.setVisibility(8);
        }
        if (i9 == 1) {
            this.X0.setVisibility(8);
            this.h0.setVisibility(i10 == 2 ? 0 : 8);
            this.c1.setVisibility(8);
            this.f1.setVisibility(8);
            this.a1.setVisibility(8);
            ImageView imageView = this.e1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.T0.setVisibility(i10 == 2 ? 0 : 8);
            this.V0.setVisibility(8);
            if (i10 != 2) {
                z();
                y();
            }
            this.l0.setVisibility(i10 == 2 ? 0 : 8);
            w();
            this.l1.setAlpha(0.0f);
            this.l1.setVisibility(8);
            this.W0.setVisibility(8);
            this.D1 = null;
            this.E1 = null;
            this.F1 = null;
        }
        if (i10 == 1) {
            a8 a8Var = this.G1;
            if (a8Var == null || !a8Var.n) {
                u();
                H();
            }
            oe0 oe0Var = this.y1;
            if (oe0Var != null) {
                oe0Var.setAllowTouch(false);
            }
            this.T0.x(2, false);
            this.T0.x(3, false);
            this.T0.x(4, false);
            this.T0.x(5, false);
            this.T0.x(7, false);
            a8 a8Var2 = this.G1;
            this.W0.setVisibility((a8Var2 == null || a8Var2.h0 < 30000) ? 8 : 0);
            this.h0.setAlpha(1.0f);
            this.h0.setTranslationY(0.0f);
            a8 a8Var3 = this.G1;
            this.Y0.setVisibility((a8Var3 == null || a8Var3.J0 == 0) ? 0 : 8);
        }
        if (i10 == 0 && this.R1) {
            D().setVisibility(0);
            w0 D = D();
            D.r.d(0.0f, true);
            D.a(true);
            ih.g gVar = D.h;
            if (gVar != null) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
            }
            ih.g gVar2 = new ih.g(D, 29);
            D.h = gVar2;
            AndroidUtilities.runOnUIThread(gVar2, 3500L);
            this.K0.h();
        }
        this.R1 = false;
        oe0 oe0Var2 = this.y1;
        if (oe0Var2 != null) {
            oe0Var2.setAllowTouch(i10 == 1 && ((i11 = this.c0) == -1 || i11 == 1));
        }
        mb mbVar = this.Y0;
        if (mbVar != null) {
            mbVar.a0 = i10 != 1;
        }
        if (i10 == 1) {
            int i12 = this.c;
            MediaDataController.getInstance(i12).checkStickers(0);
            MediaDataController.getInstance(i12).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i12).loadRecents(2, false, true, false);
            ih.v6 storiesController = MessagesController.getInstance(i12).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i12).getStoriesController().R();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i9, int i10) {
        long j10;
        SpannableStringBuilder append;
        a8 a8Var;
        a8 a8Var2;
        boolean z10;
        a8 a8Var3;
        a8 a8Var4;
        a8 a8Var5;
        y51 textureView;
        a8 a8Var6;
        boolean z11 = true;
        if (i10 == 0) {
            Z(false);
            this.K0.setVisibility(0);
            z6 z6Var = this.K0;
            if (z6Var != null) {
                z6Var.g(false);
            }
            this.M0.setVisibility(0);
            this.R0.setVisibility(0);
            this.R0.setAlpha(0.0f);
            this.F0.a(0L, true);
            a8 a8Var7 = this.G1;
            if (a8Var7 != null) {
                a8Var7.i(false);
                this.G1 = null;
            }
            jb jbVar = this.w0;
            if (jbVar != null) {
                jbVar.e();
                this.K0.e(0.0f, false);
            }
        }
        if (i9 == 0) {
            e0(null);
            b0(new v9(this, 18));
            w0 w0Var = this.J0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            this.S0.e(true);
            x3 x3Var = this.h1;
            if (x3Var != null) {
                x3Var.e(true);
            }
        }
        int i11 = this.c;
        if (i10 == 1 || i9 == 1) {
            this.a1.setEntry(i10 == 1 ? this.G1 : null);
            if (this.K1 == 1) {
                this.c1.setVisibility(0);
                a8 a8Var8 = this.G1;
                f0(a8Var8 != null && a8Var8.Y, false);
                this.f1.setVisibility(0);
                this.T0.x(-9982, false);
                ((qf0) this.f1.c).a(this.T0.k(), false);
                this.l0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                a8 a8Var9 = this.G1;
                if (a8Var9 == null || TextUtils.isEmpty(a8Var9.y)) {
                    this.l0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.c1.setVisibility(8);
                    this.f1.setVisibility(0);
                    ((qf0) this.f1.c).a(true, false);
                    this.l0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.a1.setVisibility(0);
            a8 a8Var10 = this.G1;
            if (a8Var10 == null || !a8Var10.u) {
                ImageView imageView = this.e1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                G().setVisibility(0);
                o0(false);
            }
            this.X0.setVisibility(0);
            this.T0.setVisibility(0);
            a8 a8Var11 = this.G1;
            this.Y0.setVisibility(((a8Var11 == null || a8Var11.J0 == 0) && this.r0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U0.getLayoutParams();
            a8 a8Var12 = this.G1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((a8Var12 == null || a8Var12.J0 == 0) && this.r0 == 0) ? 68.0f : 12.0f);
            this.U0.setLayoutParams(layoutParams);
            this.h0.setVisibility(0);
            this.h0.clearFocus();
            a8 a8Var13 = this.G1;
            this.Y0.A(a8Var13 == null ? 86400 : a8Var13.I0, false);
            this.Y0.setPeriodVisible(!MessagesController.getInstance(i11).premiumFeaturesBlocked() && ((a8Var = this.G1) == null || !a8Var.g));
            a8 a8Var14 = this.G1;
            this.Y0.setHasRoundVideo((a8Var14 == null || a8Var14.o0 == null) ? false : true);
            mb mbVar = this.Y0;
            if (mbVar == null) {
                j10 = 0;
            } else {
                a8 a8Var15 = this.G1;
                if (a8Var15 == null || !a8Var15.n) {
                    j10 = 0;
                    mbVar.v(null, null);
                } else {
                    TLRPC.Peer peer = a8Var15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peer.user_id)));
                        a8 a8Var16 = this.G1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        a8Var16.p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        a8 a8Var17 = this.G1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        a8Var17.p = append;
                    }
                    String str2 = this.G1.s;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    String str3 = str2;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new sa(), 0, spannableString.length(), 33);
                        str3 = spannableString;
                    }
                    this.Y0.v(str3, append);
                }
            }
            a8 a8Var18 = this.G1;
            boolean z12 = (a8Var18 != null && a8Var18.v() && this.G1.t()) ? false : true;
            gc gcVar = this.V0;
            boolean z13 = gcVar.f0;
            gcVar.f0 = z12;
            gcVar.e0.f(z12, true);
            gcVar.invalidate();
        } else {
            j10 = 0;
        }
        if (i10 == 2 || i9 == 2) {
            this.l0.setVisibility(0);
            this.p1.setVisibility(0);
            a8 a8Var19 = this.G1;
            if (a8Var19 != null && a8Var19.b0) {
                this.l0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.h0.setVisibility(0);
            this.q1.setVisibility(0);
        }
        if (i10 == 2) {
            this.l0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i10 == 1) {
            this.J1 = false;
            a8 a8Var20 = this.G1;
            boolean z14 = (a8Var20 == null || a8Var20.J0 == j10) ? false : true;
            boolean z15 = a8Var20 != null && a8Var20.g;
            String string = LocaleController.getString(z15 ? R.string.Done : z14 ? R.string.UploadBotPreview : R.string.Next);
            boolean z16 = !z14;
            k6 k6Var = this.X0;
            if (!TextUtils.equals(string, k6Var.d) || z16 != k6Var.e) {
                k6Var.removeView(k6Var.c);
                Context context = k6Var.getContext();
                k6Var.d = string;
                k6Var.e = z16;
                j6 j6Var = new j6(k6Var, context, string, z16);
                k6Var.c = j6Var;
                j6Var.setContentDescription(string);
                k6Var.addView(k6Var.c, g7.e6.c(-2.0f, -2));
                k6Var.e();
            }
            this.p1.setVisibility(8);
            this.q1.setVisibility(8);
            if (!this.d2) {
                a8 a8Var21 = this.G1;
                if (a8Var21 == null || !a8Var21.u) {
                    this.T0.set(a8Var21);
                } else {
                    this.T0.l(a8Var21);
                }
            }
            this.d2 = false;
            this.Y0.f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i11).storyEntitiesAllowed() ? null : new v9(this, 19));
            this.Z0.setVisibility(this.D1 == null ? 8 : 0);
            ArrayList arrayList = this.D1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.F1;
                ArrayList arrayList3 = this.E1;
                na naVar = this.Z0;
                naVar.c(false, false);
                naVar.c = arrayList;
                naVar.d = arrayList2;
                naVar.e = arrayList3;
                naVar.w = new nz0(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                naVar.G = new nz0(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                naVar.b.U2.N(false);
                this.Z0.setSelected(this.D1.indexOf(this.G1));
            }
            this.V0.setMaxCount((z14 || z15 || this.D1 != null || ((a8Var6 = this.G1) != null && (a8Var6.v() || !this.G1.K))) ? 1 : 3);
            if (i9 != 2) {
                a8 a8Var22 = this.G1;
                if (a8Var22 != null && (a8Var22.c || a8Var22.g || this.q0)) {
                    if (a8Var22.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    a8 a8Var23 = this.G1;
                    if (a8Var23.K && a8Var23.a1 != null && (textureView = this.T0.getTextureView()) != null) {
                        textureView.setDelegate(new ea(this, 7));
                    }
                    this.Y0.setText(this.G1.C0);
                } else if (i9 != 2) {
                    mb mbVar2 = this.Y0;
                    mbVar2.R = true;
                    mbVar2.f.setText("");
                }
            }
            a8 a8Var24 = this.G1;
            this.X0.d(4, a8Var24 == null || ((!a8Var24.u || a8Var24.K) && !a8Var24.v()));
            this.X0.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (a8Var5 = this.G1) == null || a8Var5.u || a8Var5.v()) ? false : true);
            if (!this.J1 && !this.Y0.o()) {
                ih.v6 storiesController = MessagesController.getInstance(i11).getStoriesController();
                int B = B();
                ih.p6 o6 = storiesController.o();
                if (o6 == null || !o6.a(storiesController.a, B) || ((a8Var4 = this.G1) != null && (a8Var4.g || a8Var4.J0 != j10))) {
                    z10 = true;
                    this.X0.setShareEnabled(z10);
                    a8 a8Var25 = this.G1;
                    this.c1.setImageResource((a8Var25 == null && a8Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    this.T0.setVisibility(0);
                    this.V0.setVisibility(0);
                    this.l0.setVisibility(0);
                    this.l0.setTranslationX(0.0f);
                    a8Var3 = this.G1;
                    if (a8Var3 == null && a8Var3.J0 != j10) {
                        this.l0.l("", false);
                    } else if (a8Var3 == null && a8Var3.g) {
                        this.l0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (a8Var3 == null && a8Var3.u) {
                        this.l0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (a8Var3 == null && a8Var3.n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(this.l0, 32.0f, i11);
                        this.l0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(f5Var, 0, 1, 33);
                        if (this.G1.q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.G1.q.user_id));
                            f5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.G1.q)));
                            f5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) (chat2 != null ? chat2.title : ""));
                        }
                        this.l0.l(spannableStringBuilder, false);
                    } else {
                        this.l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z11 = true;
                }
            }
            z10 = false;
            this.X0.setShareEnabled(z10);
            a8 a8Var252 = this.G1;
            this.c1.setImageResource((a8Var252 == null && a8Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            this.T0.setVisibility(0);
            this.V0.setVisibility(0);
            this.l0.setVisibility(0);
            this.l0.setTranslationX(0.0f);
            a8Var3 = this.G1;
            if (a8Var3 == null) {
            }
            if (a8Var3 == null) {
            }
            if (a8Var3 == null) {
            }
            if (a8Var3 == null) {
            }
            this.l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z11 = true;
        }
        if (i9 == z11) {
            mb mbVar3 = this.Y0;
            x60 x60Var = mbVar3.R0;
            if (x60Var != null) {
                x60Var.u();
                mbVar3.R0 = null;
            }
            this.g1.e(z11);
            na naVar2 = this.Z0;
            if (naVar2.I) {
                naVar2.c(false, z11);
            }
        }
        if (i10 == 2 && (a8Var2 = this.G1) != null) {
            if (a8Var2.e0 < j10) {
                a8Var2.e0 = j10;
            }
            this.I1 = a8Var2.e0;
            long duration = this.T0.getDuration() < 100 ? this.G1.h0 : this.T0.getDuration();
            a8 a8Var26 = this.G1;
            if (a8Var26.h0 <= 0) {
                a8Var26.h0 = duration;
            }
            File file = a8Var26.Z0;
            if (file == null) {
                file = a8Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            a8 a8Var27 = this.G1;
            this.p1.o(false, absolutePath, a8Var27.h0, a8Var27.P);
            a8 a8Var28 = this.G1;
            float f10 = duration;
            long j11 = (long) (a8Var28.Z * f10);
            long j12 = (long) (a8Var28.a0 * f10);
            gc gcVar2 = this.p1;
            gcVar2.V0 = j11;
            gcVar2.W0 = j12;
            bc bcVar = gcVar2.h;
            if (bcVar != null) {
                bc.a(bcVar, true);
            }
            b8 b8Var = new b8(this, 1);
            this.p1.setDelegate(new wa(b8Var));
            float max = (this.I1 / Math.max(1L, duration)) * 0.96f;
            this.p1.setVideoLeft(max);
            this.p1.setVideoRight(0.04f + max);
            b8Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        oe0 oe0Var = this.y1;
        if (oe0Var != null) {
            oe0Var.setAllowTouch(false);
        }
        x3 x3Var2 = this.i1;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        org.telegram.ui.Components.gc.e();
        mb mbVar4 = this.Y0;
        if (mbVar4 != null) {
            g gVar = mbVar4.f;
            gVar.d();
            gVar.k(true);
            this.Y0.a0 = true;
        }
        kb kbVar = this.T0;
        if (kbVar != null) {
            kbVar.x(8, i10 != 1);
        }
        ya yaVar = this.r1;
        if (yaVar != null) {
            yaVar.setCoverPreview(i10 != 1);
        }
        x3 x3Var3 = this.j1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        jb jbVar2 = this.w0;
        jbVar2.setPreview(i10 == 1 && jbVar2.j());
    }

    public final void P() {
        xf.a1 a1Var;
        boolean z10 = false;
        if (this.b0 == 0) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.t2 = new v9(this, 3);
            }
        }
        mb mbVar = this.Y0;
        if (mbVar != null) {
            mbVar.f.s();
        }
        z6 z6Var = this.K0;
        if (z6Var != null) {
            z6Var.h();
        }
        l6 l6Var = this.k1;
        if (l6Var != null) {
            ih.v6 storiesController = MessagesController.getInstance(l6Var.a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.i.f(UserConfig.getInstance(storiesController.a).clientUserId);
            l6Var.b = storiesController.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            l6Var.c.invalidate();
        }
        ya yaVar = this.r1;
        if (yaVar != null && (a1Var = yaVar.K0.d) != null) {
            a1Var.postRunnable(a1Var.w);
        }
        kb kbVar = this.T0;
        if (kbVar != null) {
            kbVar.x(0, false);
        }
        b1 b1Var = MessagesController.getInstance(this.c).getStoriesController().w;
        if (b1Var.c || b1Var.d) {
            return;
        }
        b1Var.d = true;
        y0 y0Var = new y0(b1Var, 1);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.a);
        messagesStorage.getStorageQueue().postRunnable(new gh.u5(messagesStorage, z10, y0Var, 3));
    }

    public final void Q(int i9, int i10) {
        ya yaVar;
        gb gbVar;
        hb hbVar;
        ya yaVar2;
        if (i10 == 0) {
            this.j0.setVisibility(8);
        }
        if (i9 == 0 && (yaVar2 = this.r1) != null) {
            yaVar2.setVisibility(8);
        }
        if (i9 == -1) {
            this.Y0.setVisibility(8);
            this.c1.setVisibility(i10 == 2 ? 0 : 8);
            this.f1.setVisibility(i10 == 2 ? 0 : 8);
            this.a1.setVisibility(i10 == 2 ? 0 : 8);
            ImageView imageView = this.e1;
            if (imageView != null) {
                imageView.setVisibility(i10 == 2 ? 0 : 8);
            }
            this.V0.setVisibility(i10 == 2 ? 0 : 8);
            this.l0.setVisibility(8);
        }
        boolean z10 = true;
        this.T0.setAllowCropping(i10 == -1);
        if ((i10 == 0 || i9 == 0) && (yaVar = this.r1) != null) {
            yaVar.Z0.setLayerType(0, null);
        }
        oe0 oe0Var = this.y1;
        if (oe0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z10 = false;
            }
            oe0Var.setAllowTouch(z10);
        }
        if (i10 == 3) {
            gb gbVar2 = this.n1;
            if (gbVar2 != null) {
                gbVar2.setAppearProgress(1.0f);
            }
        } else if (i9 == 3 && (gbVar = this.n1) != null) {
            gbVar.setVisibility(8);
            this.n1.setAppearProgress(0.0f);
            gb gbVar3 = this.n1;
            gbVar3.x = null;
            h0 h0Var = gbVar3.f;
            h0Var.H = null;
            h0Var.d = null;
            h0Var.F = false;
            gbVar3.d.setVisibility(8);
            gbVar3.a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            hb hbVar2 = this.o1;
            if (hbVar2 != null) {
                hbVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i9 != 4 || (hbVar = this.o1) == null) {
            return;
        }
        hbVar.setVisibility(8);
        this.o1.setAppearProgress(0.0f);
        hb hbVar3 = this.o1;
        hbVar3.b = null;
        h0 h0Var2 = hbVar3.h;
        h0Var2.H = null;
        h0Var2.d = null;
        h0Var2.F = false;
        hbVar3.e.setVisibility(8);
        hbVar3.setVisibility(8);
    }

    public final void R(qb qbVar) {
        ih.p6 o6;
        vb vbVar;
        if (this.d) {
            return;
        }
        int i9 = this.c;
        if (MessagesController.getInstance(i9).isFrozen()) {
            org.telegram.ui.b.b(i9);
            return;
        }
        int i10 = 0;
        this.q0 = false;
        this.e = false;
        this.x2 = false;
        this.o0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (vbVar = this.n) != null && vbVar.getParent() == null) {
            vb vbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.w0.setCameraThumb(A());
        if (this.r0 == 0 && (o6 = MessagesController.getInstance(i9).getStoriesController().o()) != null && o6.a(i9, 1)) {
            h0(o6, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.D;
        if (qbVar != null) {
            this.B = qbVar;
            this.F = qbVar.a;
            rectF.set(qbVar.c);
            this.C = qbVar.b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.r.c();
        int i11 = this.F;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.d0.setBackgroundColor(i10);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.b, 1);
        g(1.0f, true, new v9(this, 6));
        e();
        this.r0 = 0L;
        this.s0 = "";
    }

    public final void S(pb pbVar, a8 a8Var, long j10) {
        vb vbVar;
        if (this.d) {
            return;
        }
        int i9 = this.c;
        if (MessagesController.getInstance(i9).isFrozen()) {
            org.telegram.ui.b.b(i9);
            return;
        }
        this.q0 = false;
        this.e = false;
        this.x2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (vbVar = this.n) != null && vbVar.getParent() == null) {
            vb vbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.G1 = a8Var;
        this.K1 = a8Var.K ? 1 : 0;
        this.o0.g = false;
        RectF rectF = this.D;
        if (pbVar != null) {
            this.B = pbVar;
            this.F = pbVar.a;
            rectF.set(pbVar.c);
            this.C = pbVar.b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.r.c();
        int i10 = this.F;
        this.d0.setBackgroundColor((i10 == 1 || i10 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.b, 1);
        a8 a8Var2 = this.G1;
        if (a8Var2 != null) {
            this.Y0.setText(a8Var2.C0);
        }
        L(new ma(this, 0), j10);
        K(this.G1.b0 ? 2 : 1, false);
        l0(-1, false, false);
        this.X0.b(false, false);
        e();
        this.r0 = 0L;
        this.s0 = "";
    }

    public final void T() {
        x60 x60Var;
        kb kbVar = this.T0;
        if (kbVar != null) {
            kbVar.x(4, true);
        }
        mb mbVar = this.Y0;
        if (mbVar != null && (x60Var = mbVar.R0) != null) {
            x60Var.u();
            mbVar.R0 = null;
        }
        zf.x0 x0Var = new zf.x0((org.telegram.ui.ActionBar.o2) new ab(this, 1), 14, false);
        x0Var.setOnDismissListener(new ja(this, 1));
        x0Var.show();
    }

    public final void U(pb pbVar, a8 a8Var) {
        ih.p6 o6;
        vb vbVar;
        if (this.d) {
            return;
        }
        int i9 = this.c;
        if (MessagesController.getInstance(i9).isFrozen()) {
            org.telegram.ui.b.b(i9);
            return;
        }
        this.q0 = true;
        this.e = false;
        this.x2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (vbVar = this.n) != null && vbVar.getParent() == null) {
            vb vbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.G1 = a8Var;
        u9.a(i9, a8Var);
        a8 a8Var2 = this.G1;
        int i10 = (a8Var2 == null || !a8Var2.K) ? 0 : 1;
        this.K1 = i10;
        this.o0.g = a8Var2 != null && a8Var2.u && i10 == 1;
        if (this.r0 == 0 && (o6 = MessagesController.getInstance(i9).getStoriesController().o()) != null && o6.a(i9, 1)) {
            h0(o6, true);
        }
        RectF rectF = this.D;
        if (pbVar != null) {
            this.B = pbVar;
            this.F = pbVar.a;
            rectF.set(pbVar.c);
            this.C = pbVar.b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.r.c();
        int i11 = this.F;
        this.d0.setBackgroundColor((i11 == 1 || i11 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.b, 1);
        a8 a8Var3 = this.G1;
        if (a8Var3 != null) {
            this.Y0.setText(a8Var3.C0);
        }
        this.X0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new v9(this, 6));
        e();
        this.r0 = 0L;
        this.s0 = "";
    }

    public final void V() {
        xf.c1 c1Var = this.s1;
        if (c1Var != null) {
            c1Var.bringToFront();
        }
        View view = this.t1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.u1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.v1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.w1;
        if (view4 != null) {
            view4.bringToFront();
        }
        jc jcVar = this.l1;
        if (jcVar != null) {
            jcVar.bringToFront();
        }
        oe0 oe0Var = this.y1;
        if (oe0Var != null) {
            oe0Var.bringToFront();
        }
        fe0 fe0Var = this.A1;
        if (fe0Var != null) {
            fe0Var.bringToFront();
        }
        he0 he0Var = this.B1;
        if (he0Var != null) {
            he0Var.bringToFront();
        }
        l6 l6Var = this.k1;
        if (l6Var != null) {
            l6Var.bringToFront();
        }
        q qVar = this.m1;
        if (qVar != null) {
            qVar.bringToFront();
        }
    }

    public final void W(a8 a8Var, boolean z10) {
        a8 a8Var2;
        boolean z11;
        if (a8Var == null || this.T0.getWidth() <= 0 || this.T0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? a8Var.O0 : a8Var.N0;
        if (file != null) {
            file.delete();
        }
        View view = this.w0.j() ? this.w0 : this.T0;
        float f10 = z10 ? 0.33333334f : 1.0f;
        int width = (int) (view.getWidth() * f10);
        Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f10), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(f10, f10);
        AndroidUtilities.makingGlobalBlurBitmap = true;
        view.draw(canvas);
        AndroidUtilities.makingGlobalBlurBitmap = false;
        canvas.restore();
        Paint paint = new Paint(2);
        y51 textureView = this.T0.getTextureView();
        if (a8Var.K && !a8Var.u && textureView != null) {
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
        File file2 = a8Var.Q0;
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
                FileLog.e(e10);
            }
        }
        File file3 = a8Var.P0;
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
                FileLog.e(e11);
            }
        }
        ya yaVar = this.r1;
        if (yaVar != null && yaVar.N0 != null) {
            canvas.save();
            canvas.scale(f10, f10);
            ya yaVar2 = this.r1;
            yaVar2.E0 = true;
            a6 a6Var = yaVar2.N0;
            a6Var.a = true;
            a6Var.draw(canvas);
            ya yaVar3 = this.r1;
            yaVar3.N0.a = false;
            yaVar3.E0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w8 = a8.w(this.c, "jpg");
        if (z10) {
            a8Var2 = a8Var;
            z11 = z10;
            Utilities.searchQueue.postRunnable(new bg.m(this, createBitmap, z11, w8, a8Var2, 2));
        } else {
            a8Var2 = a8Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w8));
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        if (!z11) {
            a8Var2.N0 = w8;
        }
        a8Var2.b1 = createScaledBitmap;
    }

    public final void X() {
        ih.p6 o6;
        char c10;
        t9 t9Var = this.m0;
        BitmapDrawable bitmapDrawable = null;
        if (t9Var != null) {
            t9Var.dismiss();
            this.m0 = null;
        }
        if (this.J1) {
            v0 v0Var = this.a1;
            v0Var.getClass();
            v0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            j6 j6Var = this.X0.c;
            int i9 = -this.Q1;
            this.Q1 = i9;
            AndroidUtilities.shakeViewSpring(j6Var, i9);
            return;
        }
        mb mbVar = this.Y0;
        if (mbVar != null && mbVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.j6 j6Var2 = mbVar.v;
            int i10 = -this.Q1;
            this.Q1 = i10;
            AndroidUtilities.shakeViewSpring(j6Var2, i10);
            mbVar.e();
            return;
        }
        a8 a8Var = this.G1;
        int i11 = this.c;
        int i12 = 0;
        if ((a8Var == null || (!a8Var.g && a8Var.J0 == 0)) && (o6 = MessagesController.getInstance(i11).storiesController.o()) != null && o6.a(i11, B())) {
            h0(o6, false);
            return;
        }
        this.G1.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
        ih.b bVar = this.a;
        if (mbVar != null && !this.G1.D0) {
            CharSequence text = mbVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((wz0[]) spannable.getSpans(0, text.length(), wz0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.oc(this.n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.f6.gc, 0, new v9(this, 27), bVar)).k(true);
                    int i13 = -this.Q1;
                    this.Q1 = i13;
                    AndroidUtilities.shakeViewSpring(mbVar, i13);
                    return;
                }
            }
        }
        a8 a8Var2 = this.G1;
        if (a8Var2.g || a8Var2.J0 != 0) {
            a8Var2.l = false;
            i(null);
            p0();
            return;
        }
        if (this.J != 0) {
            a8Var2.v0 = MessagesController.getInstance(i11).getInputPeer(this.J);
        }
        kb kbVar = this.T0;
        kbVar.x(3, true);
        t9 t9Var2 = new t9(this.b, this.G1.I0, bVar);
        t9Var2.q1(this.G1.E0);
        t9Var2.p1(this.G1.v0);
        t9Var2.B = this.I;
        t9Var2.Q = new w9(this, 14);
        t9Var2.e1(!this.w0.j());
        ArrayList arrayList = this.E1;
        t9Var2.m1(arrayList == null ? this.G1.r() : arrayList.size());
        t9Var2.k1(false);
        CharSequence text2 = mbVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (s41 s41Var : (s41[]) ((Spanned) text2).getSpans(0, text2.length(), s41.class)) {
                if (s41Var != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(Long.parseLong(s41Var.getURL())));
                        if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                            arrayList2.add(UserObject.getPublicUsername(user));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (text2 != null) {
            int i14 = -1;
            for (int i15 = 0; i15 < text2.length(); i15++) {
                char charAt = text2.charAt(i15);
                if (charAt == '@') {
                    i14 = i15 + 1;
                } else if (charAt == ' ') {
                    if (i14 != -1) {
                        String charSequence = text2.subSequence(i14, i15).toString();
                        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(charSequence);
                        if (userOrChat instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) userOrChat;
                            if (!user2.bot && !UserObject.isUserSelf(user2) && user2.id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
                                arrayList2.add(charSequence);
                            }
                        }
                    }
                    i14 = -1;
                }
            }
            c10 = 1;
            if (i14 != -1) {
                String charSequence2 = text2.subSequence(i14, text2.length()).toString();
                TLObject userOrChat2 = MessagesController.getInstance(i11).getUserOrChat(charSequence2);
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
        t9Var2.O = arrayList2;
        t9Var2.S = new w9(this, 15);
        t9Var2.T = new w9(this, 16);
        t9Var2.P = new ea(this, 10);
        this.m0 = t9Var2;
        a8 a8Var3 = this.G1;
        if (a8Var3.K) {
            if (kbVar != null && !a8Var3.f0 && this.b0 != 2) {
                a8Var3.e0 = kbVar.getCurrentPosition();
                w9 w9Var = new w9(this, 17);
                xf.c1 c1Var = this.s1;
                View view = this.v1;
                View[] viewArr = new View[3];
                viewArr[0] = kbVar;
                viewArr[c10] = c1Var;
                viewArr[2] = view;
                kbVar.h(w9Var, viewArr);
            }
            t9 t9Var3 = this.m0;
            Bitmap bitmap = this.G1.g0;
            v9 v9Var = new v9(this, 20);
            if (bitmap != null) {
                t9Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            t9Var3.X = bitmapDrawable;
            t9Var3.Y = v9Var;
            j1 j1Var = t9Var3.b;
            if (j1Var != null) {
                for (View view2 : j1Var.getViewPages()) {
                    if (view2 instanceof n9) {
                        n9 n9Var = (n9) view2;
                        n9Var.g(false);
                        n9Var.e(false);
                    }
                }
            }
        }
        this.m0.setOnDismissListener(new ja(this, i12));
        this.m0.show();
    }

    public final void Y(rb rbVar) {
        int i9 = 0;
        RectF rectF = this.D;
        if (rbVar != null) {
            this.B = rbVar;
            this.F = rbVar.a;
            rectF.set(rbVar.c);
            this.C = rbVar.b;
        } else {
            this.B = null;
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        int i10 = this.F;
        if (i10 != 1 && i10 != 0) {
            i9 = -14737633;
        }
        this.d0.setBackgroundColor(i9);
    }

    public final void Z(boolean z10) {
        Activity activity;
        if (!this.s2 || z10) {
            this.o2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.b) != null) {
                boolean z11 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.o2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    fq fqVar = new fq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    fqVar.e = dp;
                    fqVar.f = dp2;
                    this.w0.setCameraThumb(fqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ea(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.s2 = true;
                }
            }
            if (this.o2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                r();
            } else {
                CameraController.getInstance().initCamera(new v9(this, 0));
            }
        }
    }

    public final void b0(Runnable runnable) {
        za zaVar = this.x0;
        if (zaVar == null || zaVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new ih.h3(this, this.x0.getTextureView().getBitmap(), runnable, 18));
        } catch (Throwable unused) {
        }
    }

    public final void c0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new xa(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 2)).setDuration(320L).setInterpolator(gr.h).start();
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ih.p6 o6;
        a8 a8Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i9 == NotificationCenter.albumsDidLoad) {
            z6 z6Var = this.K0;
            if (z6Var != null) {
                z6Var.h();
            }
            if (this.i2 == null || MediaController.allMediaAlbums == null) {
                return;
            }
            for (int i11 = 0; i11 < MediaController.allMediaAlbums.size(); i11++) {
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i11);
                int i12 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.i2;
                if (i12 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.i2 = albumEntry;
                    return;
                }
            }
            return;
        }
        if (i9 == NotificationCenter.storiesDraftsUpdated) {
            z6 z6Var2 = this.K0;
            if (z6Var2 == null || this.R1) {
                return;
            }
            z6Var2.h();
            return;
        }
        if (i9 == NotificationCenter.storiesLimitUpdate) {
            int i13 = this.b0;
            int i14 = this.c;
            if (i13 != 1) {
                if (i13 == 0 && (o6 = MessagesController.getInstance(i14).getStoriesController().o()) != null && o6.a(i14, 1)) {
                    a8 a8Var2 = this.G1;
                    if (a8Var2 == null || a8Var2.J0 == 0) {
                        h0(o6, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.J1 && !this.Y0.o()) {
                ih.v6 storiesController = MessagesController.getInstance(i14).getStoriesController();
                int B = B();
                ih.p6 o9 = storiesController.o();
                if (o9 == null || !o9.a(storiesController.a, B) || ((a8Var = this.G1) != null && (a8Var.g || a8Var.J0 != 0))) {
                    z10 = true;
                }
            }
            this.X0.setShareEnabled(z10);
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i9 = this.c;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i9;
        this.A0.clearAnimation();
        za zaVar = this.x0;
        if ((zaVar != null && zaVar.isDual()) || this.W1) {
            str = null;
        }
        this.U1 = str;
        boolean z10 = false;
        if (str == null) {
            c0(this.A0, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935) {
                str.equals("off");
            } else if (hashCode == 3005871 && str.equals("auto")) {
                i9 = R.drawable.media_photo_flash_auto2;
                this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
            }
            i9 = R.drawable.media_photo_flash_off2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else {
            if (str.equals("on")) {
                i9 = R.drawable.media_photo_flash_on2;
                this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
            }
            i9 = R.drawable.media_photo_flash_off2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        hc hcVar = this.A0;
        if (hcVar.n != i9) {
            hcVar.n = i9;
            ValueAnimator valueAnimator = hcVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                hcVar.r = null;
            }
            hcVar.setDrawable(i9);
        }
        if (this.b0 == 0 && !this.E0.e && this.U1 != null && !I()) {
            z10 = true;
        }
        c0(this.A0, z10, true);
    }

    public final void f(boolean z10) {
        w0 w0Var;
        this.G0 = z10;
        Boolean bool = this.l2;
        if (bool == null || bool.booleanValue() != z10) {
            int i9 = 0;
            if (this.I0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.I0 == null) {
                    return;
                }
            }
            if (this.I0.Q) {
                this.m2 = new fa(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.j2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.j2 = null;
            }
            o1.j jVar = this.k2;
            if (jVar != null) {
                jVar.c();
                this.k2 = null;
            }
            if (this.I0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.I0 == null) {
                    return;
                }
            }
            va vaVar = this.I0;
            if (vaVar != null) {
                vaVar.G = false;
            }
            if (z10 && (w0Var = this.J0) != null) {
                w0Var.a(false);
            }
            ob obVar = this.r;
            if (obVar != null) {
                obVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.I0.setImportantForAccessibility(z10 ? 0 : 4);
            this.l2 = Boolean.valueOf(z10);
            float translationY = this.I0.getTranslationY();
            vb vbVar = this.n;
            float height = z10 ? 0.0f : (vbVar.getHeight() - this.I0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            int i10 = 1;
            Math.max(1, vbVar.getHeight());
            va vaVar2 = this.I0;
            vaVar2.G = !z10;
            this.g2 = this.f2 == null;
            if (z10) {
                o1.j jVar2 = new o1.j(vaVar2, o1.h.n, height);
                this.k2 = jVar2;
                jVar2.u.a(0.75f);
                this.k2.u.b(350.0f);
                this.k2.a(new ga(this, height, i9));
                this.k2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.j2 = ofFloat;
                ofFloat.addUpdateListener(new ha(this, i9));
                this.j2.addListener(new ua(this, i10));
                this.j2.setDuration(450L);
                this.j2.setInterpolator(gr.h);
                this.j2.start();
            }
            if (!z10 && !this.O1) {
                this.h2 = null;
            }
            if (z10 || this.b0 != 0 || this.o2) {
                return;
            }
            r();
        }
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.b1 == null) {
            mi0 mi0Var = new mi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.b1 = mi0Var;
            mi0Var.B *= 1.5f;
        }
        this.c1.setAnimation(this.b1);
        if (!z11) {
            this.b1.L(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            mi0 mi0Var2 = this.b1;
            if (mi0Var2.X > 20) {
                mi0Var2.L(0, false, false);
            }
            this.b1.N(20);
            this.b1.start();
            return;
        }
        mi0 mi0Var3 = this.b1;
        int i9 = mi0Var3.X;
        if (i9 == 0 || i9 >= 43) {
            return;
        }
        mi0Var3.N(43);
        this.b1.start();
    }

    public final void g(float f10, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A = null;
        }
        ob obVar = this.r;
        if (!z10) {
            this.H = null;
            this.E = f10;
            k();
            obVar.invalidate();
            this.n.invalidate();
            runnable.run();
            o();
            return;
        }
        this.L.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.H = Float.valueOf(this.G);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f10);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new ha(this, 5));
        this.A.addListener(new gh.o5(this, f10, runnable, 3));
        if (f10 < 1.0f && this.v) {
            this.A.setDuration(250L);
            this.A.setInterpolator(gr.h);
        } else if (f10 > 0.0f || obVar.a < AndroidUtilities.dp(20.0f)) {
            this.A.setDuration(300L);
            this.A.setInterpolator(new u1.a());
        } else if (f10 >= 0.0f || !this.K) {
            this.A.setDuration(400L);
            this.A.setInterpolator(gr.h);
        } else {
            this.A.setDuration(200L);
            this.A.setInterpolator(gr.h);
            this.K = false;
        }
        this.A.start();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 3));
        }
    }

    public final void h(boolean z10, boolean z11) {
        z zVar;
        if (z10) {
            x3 x3Var = this.h1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            x3 x3Var2 = this.i1;
            if (x3Var2 != null) {
                x3Var2.e(true);
            }
            x3 x3Var3 = this.g1;
            if (x3Var3 != null) {
                x3Var3.e(true);
            }
            x3 x3Var4 = this.S0;
            if (x3Var4 != null) {
                x3Var4.e(true);
            }
        }
        if (this.W1 == z10 && this.X1 == I()) {
            return;
        }
        AnimatorSet animatorSet = this.V1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V1 = null;
        }
        this.W1 = z10;
        this.X1 = I();
        if (z10 && (zVar = this.E0) != null && zVar.e) {
            zVar.a(false, z11);
        }
        m0(z11);
        oa oaVar = this.M0;
        v3 v3Var = this.Q0;
        v3 v3Var2 = this.P0;
        if (!z11) {
            v3Var2.setAlpha((z10 && this.b0 == 0 && !I()) ? 1.0f : 0.0f);
            v3Var2.setTranslationY((z10 && this.b0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            v3Var.setAlpha((!z10 && this.b0 == 0 && I()) ? 0.6f : 0.0f);
            v3Var.setTranslationY((!z10 && this.b0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            oaVar.setAlpha((z10 || this.b0 != 0 || I()) ? 0.0f : 1.0f);
            oaVar.setTranslationY((z10 || this.b0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.V1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v3Var2, (Property<v3, Float>) property, (z10 && this.b0 == 0 && !I()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(v3Var2, (Property<v3, Float>) property2, (z10 && this.b0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(v3Var, (Property<v3, Float>) property, (!z10 && this.b0 == 0 && I()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(v3Var, (Property<v3, Float>) property2, (!z10 && this.b0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(oaVar, (Property<oa, Float>) property, (z10 || this.b0 != 0 || I()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(oaVar, (Property<oa, Float>) property2, (z10 || this.b0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.V1.setDuration(260L);
        this.V1.setInterpolator(gr.h);
        this.V1.start();
    }

    public final void h0(ih.p6 p6Var, boolean z10) {
        if (this.v2) {
            return;
        }
        bb bbVar = new bb(p6Var.b(), this.c, this.b, new ab(this, 0), null);
        bbVar.T = B();
        bbVar.setOnDismissListener(new l70(2, this, z10));
        this.T0.x(7, true);
        this.v2 = true;
        bbVar.show();
    }

    public final void i(Runnable runnable) {
        a8 a8Var;
        Runnable runnable2;
        kb kbVar;
        qe0 qe0Var = this.x1;
        if (qe0Var == null || (a8Var = this.G1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        a8Var.j = qe0Var.d() | a8Var.j;
        a8 a8Var2 = this.G1;
        qe0 qe0Var2 = this.x1;
        File file = a8Var2.Z0;
        if (file != null) {
            file.delete();
            a8Var2.Z0 = null;
        }
        MediaController.SavedFilterState savedFilterState = qe0Var2.getSavedFilterState();
        a8Var2.a1 = savedFilterState;
        if (a8Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = qe0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i9 = a8Var2.R;
                    matrix.postScale(i9 == 1 ? -1.0f : 1.0f, i9 == 2 ? -1.0f : 1.0f, a8Var2.k0 / 2.0f, a8Var2.l0 / 2.0f);
                    matrix.postRotate(-a8Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    a8Var2.n0.preScale(a8Var2.k0 / createBitmap.getWidth(), a8Var2.l0 / createBitmap.getHeight());
                    a8Var2.k0 = createBitmap.getWidth();
                    a8Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = a8Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        a8Var2.Z0.delete();
                    }
                    String k10 = a8.k(a8Var2.L);
                    boolean z10 = "png".equals(k10) || "webp".equals(k10);
                    a8Var2.Z0 = a8.w(a8Var2.a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(a8Var2.Z0));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new bg.d(a8Var2, createBitmap, z10, runnable2, 4));
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
            a8 a8Var3 = this.G1;
            if (a8Var3.K || (kbVar = this.T0) == null) {
                return;
            }
            kbVar.set(a8Var3);
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        if (z11) {
            this.F0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(gr.h).withEndAction(new fa(this, z10, 1)).start();
            return;
        }
        this.F0.clearAnimation();
        this.F0.setAlpha(z10 ? 1.0f : 0.0f);
        if (z10) {
            return;
        }
        this.F0.b(false, false);
    }

    public final void j() {
        if (this.G1 == null || this.z1 == null || this.d0.getMeasuredWidth() <= 0 || this.d0.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        if (this.G1.Q != 0) {
            matrix.postRotate(-r1, this.d0.getMeasuredWidth() / 2.0f, this.d0.getMeasuredHeight() / 2.0f);
            if ((this.G1.Q / 90) % 2 == 1) {
                matrix.postScale(this.d0.getMeasuredWidth() / this.d0.getMeasuredHeight(), this.d0.getMeasuredHeight() / this.d0.getMeasuredWidth(), this.d0.getMeasuredWidth() / 2.0f, this.d0.getMeasuredHeight() / 2.0f);
            }
        }
        matrix.postScale((1.0f / this.d0.getMeasuredWidth()) * this.G1.k0, (1.0f / this.d0.getMeasuredHeight()) * this.G1.l0);
        matrix.postConcat(this.G1.n0);
        matrix.postScale(this.d0.getMeasuredWidth() / this.G1.i0, this.d0.getMeasuredHeight() / this.G1.j0);
        this.z1.setTransform(matrix);
        this.z1.invalidate();
    }

    public final void j0(boolean z10) {
        i81 i81Var = this.R0;
        if ((i81Var.getTag() != null && z10) || (i81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.a2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                v9 v9Var = new v9(this, 25);
                this.a2 = v9Var;
                AndroidUtilities.runOnUIThread(v9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.b2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        i81Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            i81Var.setVisibility(0);
        }
        this.b2.playTogether(ObjectAnimator.ofFloat(i81Var, (Property<i81, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.b2.addListener(new hg.b0(14, this, z10));
        this.b2.start();
        if (z10) {
            v9 v9Var2 = new v9(this, 26);
            this.a2 = v9Var2;
            AndroidUtilities.runOnUIThread(v9Var2, 2000L);
        }
    }

    public final void k() {
        ih.l3 l3Var;
        if (this.F != 1) {
            return;
        }
        float left = this.d0.getLeft();
        float top = this.d0.getTop();
        float measuredWidth = this.d0.getMeasuredWidth();
        float measuredHeight = this.d0.getMeasuredHeight();
        RectF rectF = this.Z;
        rectF.set(left, top, measuredWidth, measuredHeight);
        rectF.offset(this.r.getX(), this.r.getY());
        float f10 = this.E;
        RectF rectF2 = this.D;
        RectF rectF3 = this.Y;
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
        this.d0.setAlpha(this.E);
        float f11 = rectF3.left;
        this.d0.setTranslationX((f11 - r3.getLeft()) - this.r.getX());
        float f12 = rectF3.top;
        this.d0.setTranslationY((f12 - r3.getTop()) - this.r.getY());
        rb rbVar = this.B;
        if (rbVar != null && (l3Var = rbVar.f) != null) {
            l3Var.setTranslationX((rectF.left - rectF2.left) * this.E);
            this.B.f.setTranslationY((rectF.top - rectF2.top) * this.E);
        }
        this.d0.setScaleX(rectF3.width() / this.d0.getMeasuredWidth());
        this.d0.setScaleY(rectF3.height() / this.d0.getMeasuredHeight());
        this.e0.setAlpha(this.E);
        this.g0.setAlpha(this.E);
        this.h0.setAlpha(this.E);
        if (this.b0 == 2) {
            this.q1.setAlpha(this.E);
        }
    }

    public final void k0() {
        t9 t9Var = this.m0;
        if (t9Var != null) {
            t9Var.dismiss();
            this.m0 = null;
        }
        t9 t9Var2 = new t9(this.b, 86400, this.a);
        t9Var2.o1();
        t9Var2.q1(this.u0);
        TLRPC.InputPeer inputPeer = this.t0;
        if (inputPeer == null) {
            inputPeer = this.J != 0 ? MessagesController.getInstance(this.c).getInputPeer(this.J) : new TLRPC.TL_inputPeerSelf();
        }
        t9Var2.p1(inputPeer);
        t9Var2.B = this.I;
        t9Var2.Q = new w9(this, 18);
        t9Var2.e1(false);
        t9Var2.m1(1);
        t9Var2.k1(false);
        t9Var2.S = new w9(this, 19);
        t9Var2.P = new ea(this, 12);
        this.m0 = t9Var2;
        t9Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        if (r6.isRecycled() != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        a8 a8Var;
        ImageReceiver photoImage;
        if (this.r1 == null || (a8Var = this.G1) == null) {
            return;
        }
        a8Var.f();
        this.G1.j |= this.r1.u0();
        a8 a8Var2 = this.G1;
        ArrayList arrayList = a8Var2.T0;
        if (arrayList == null) {
            a8Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ya yaVar = this.r1;
        a8 a8Var3 = this.G1;
        yaVar.t0(a8Var3.T0, false, false, false, false, a8Var3);
        a8 a8Var4 = this.G1;
        if (!a8Var4.K) {
            a8Var4.S0 = Utilities.clamp(this.r1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.r1.getMasks();
        this.G1.U0 = masks != null ? new ArrayList(masks) : null;
        a8 a8Var5 = this.G1;
        boolean z10 = a8Var5.K;
        boolean E = a8Var5.E();
        this.G1.T0 = new ArrayList();
        ya yaVar2 = this.r1;
        a8 a8Var6 = this.G1;
        Bitmap t02 = yaVar2.t0(a8Var6.T0, true, false, false, !z10, a8Var6);
        if (this.G1.T0.isEmpty()) {
            this.G1.T0 = null;
        }
        try {
            File file = this.G1.P0;
            if (file != null) {
                file.delete();
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = this.G1.R0;
            if (file2 != null) {
                file2.delete();
            }
        } catch (Exception unused2) {
        }
        try {
            File file3 = this.G1.Q0;
            if (file3 != null) {
                file3.delete();
            }
        } catch (Exception unused3) {
        }
        a8 a8Var7 = this.G1;
        a8Var7.P0 = null;
        a8Var7.R0 = null;
        a8Var7.Q0 = null;
        int i9 = this.c;
        FileLoader fileLoader = FileLoader.getInstance(i9);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        a8 a8Var8 = this.G1;
        a8Var7.P0 = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(t02, compressFormat, a8Var8.i0, a8Var8.j0, 87, false, 101, 101), true);
        if (t02 != null && !t02.isRecycled()) {
            t02.recycle();
        }
        a8 a8Var9 = this.G1;
        if (a8Var9.u) {
            File file4 = a8Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.G1.Y0 = null;
            }
            a8 a8Var10 = this.G1;
            long j10 = a8Var10.z0;
            if (j10 != Long.MIN_VALUE) {
                Drawable drawable = a8Var10.x0;
                if (drawable == null) {
                    drawable = r6.e(null, i9, j10, this.Y1);
                }
                if (drawable != null) {
                    this.G1.Y0 = a8.w(i9, "webp");
                    a8 a8Var11 = this.G1;
                    Bitmap createBitmap = Bitmap.createBitmap(a8Var11.i0, a8Var11.j0, Bitmap.Config.ARGB_8888);
                    a8.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.G1.Y0));
                        } finally {
                            if (!createBitmap.isRecycled()) {
                                createBitmap.recycle();
                            }
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
            }
        }
        a8 a8Var12 = this.G1;
        if (a8Var12.u) {
            File file5 = a8Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                this.G1.X0 = null;
            }
            a8 a8Var13 = this.G1;
            if (a8Var13.u && a8Var13.K) {
                int i10 = a8Var13.k0;
                int i11 = a8Var13.l0;
                yf.e1 s02 = this.r1.s0();
                if (s02 != null) {
                    yf.x0 x0Var = s02.n0;
                    if (x0Var.getChildCount() == 1 && i10 > 0 && i11 > 0) {
                        if ((x0Var.getChildAt(0) instanceof org.telegram.ui.Cells.t1) && (photoImage = ((org.telegram.ui.Cells.t1) x0Var.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
                            float f10 = i10;
                            float f11 = i11;
                            float max = Math.max(photoImage.getImageWidth() / f10, photoImage.getImageHeight() / f11);
                            int i12 = (int) ((f10 * max) / 2.0f);
                            int i13 = (int) ((f11 * max) / 2.0f);
                            Bitmap createBitmap2 = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
                            float[] fArr = new float[8];
                            for (int i14 = 0; i14 < photoImage.getRoundRadius().length; i14++) {
                                int i15 = i14 * 2;
                                fArr[i15] = photoImage.getRoundRadius()[i14];
                                fArr[i15 + 1] = photoImage.getRoundRadius()[i14];
                            }
                            Canvas canvas = new Canvas(createBitmap2);
                            Path path = new Path();
                            canvas.scale(0.5f, 0.5f);
                            RectF rectF = AndroidUtilities.rectTmp;
                            float f12 = (i12 * 2.0f) / 2.0f;
                            float f13 = (i13 * 2.0f) / 2.0f;
                            rectF.set(f12 - (photoImage.getImageWidth() / 2.0f), f13 - (photoImage.getImageHeight() / 2.0f), (photoImage.getImageWidth() / 2.0f) + f12, (photoImage.getImageHeight() / 2.0f) + f13);
                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                            Paint paint = new Paint(1);
                            paint.setColor(-1);
                            canvas.drawPath(path, paint);
                            try {
                                this.G1.X0 = a8.w(i9, "webp");
                                createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.G1.X0));
                            } catch (Exception e13) {
                                FileLog.e(e13);
                                this.G1.X0 = null;
                            }
                            createBitmap2.recycle();
                        }
                    }
                }
            }
        }
        if (!E) {
            ya yaVar3 = this.r1;
            ArrayList arrayList2 = new ArrayList();
            a8 a8Var14 = this.G1;
            int i16 = a8Var14.i0;
            Bitmap t03 = yaVar3.t0(arrayList2, false, true, false, false, a8Var14);
            a8 a8Var15 = this.G1;
            FileLoader fileLoader2 = FileLoader.getInstance(i9);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            a8 a8Var16 = this.G1;
            a8Var15.R0 = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(t03, compressFormat2, a8Var16.i0, a8Var16.j0, 87, false, 101, 101), true);
            if (t03 != null && !t03.isRecycled()) {
                t03.recycle();
            }
        }
        if (this.r1.K0.getPainting().E) {
            Bitmap blurBitmap = this.r1.getBlurBitmap();
            a8 a8Var17 = this.G1;
            FileLoader fileLoader3 = FileLoader.getInstance(i9);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            a8 a8Var18 = this.G1;
            a8Var17.Q0 = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, a8Var18.i0, a8Var18.j0, 87, false, 101, 101), true);
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
    public final void l0(int i9, boolean z10, boolean z11) {
        float f10;
        boolean z12;
        gb gbVar;
        int i10;
        float f11;
        hb hbVar;
        int i11;
        float f12;
        a8 a8Var;
        ImageView imageView;
        int i12;
        int i13;
        float f13;
        he0 he0Var;
        fe0 fe0Var;
        ImageView imageView2;
        int i14;
        a8 a8Var2;
        ya yaVar;
        ya yaVar2;
        int i15 = this.c0;
        if (i15 == i9 && !z10) {
            return;
        }
        mb mbVar = this.Y0;
        if (i9 != -1 && mbVar != null && mbVar.K1) {
            return;
        }
        this.c0 = i9;
        AnimatorSet animatorSet = this.n2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n2 = null;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.l0;
        gc gcVar = this.V0;
        v0 v0Var = this.a1;
        q2 q2Var = this.j0;
        h6 h6Var = this.f1;
        pi0 pi0Var = this.c1;
        if (i15 != i9) {
            if (i9 == -1) {
                q2Var.setVisibility(0);
                mbVar.setVisibility(0);
                ya yaVar3 = this.r1;
                if (yaVar3 != null) {
                    yaVar3.D0(null, true);
                }
                v0Var.setVisibility(0);
                a8 a8Var3 = this.G1;
                if (a8Var3 == null || !a8Var3.u) {
                    ImageView imageView3 = this.e1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    G().setVisibility(0);
                    o0(false);
                }
                h5Var.setVisibility(0);
                if (this.K1 == 1) {
                    pi0Var.setVisibility(0);
                    h6Var.setVisibility(0);
                } else {
                    a8 a8Var4 = this.G1;
                    if (a8Var4 != null && !TextUtils.isEmpty(a8Var4.y)) {
                        pi0Var.setVisibility(8);
                        h6Var.setVisibility(0);
                    }
                }
                gcVar.setVisibility(0);
            }
            if (i9 == 0 && (yaVar2 = this.r1) != null) {
                yaVar2.setVisibility(0);
            }
            if ((i9 == 0 || i15 == 0) && (yaVar = this.r1) != null) {
                yaVar.Z0.setLayerType(2, null);
            }
            ya yaVar4 = this.r1;
            if (yaVar4 != null) {
                yaVar4.K1.b(i9 != 0);
            }
            mbVar.H.b(i9 != -1);
            org.telegram.ui.Components.gc.e();
            if (this.x1 != null && i15 == 1) {
                i(null);
            }
            oe0 oe0Var = this.y1;
            if (oe0Var != null) {
                oe0Var.setAllowTouch(false);
            }
            this.g1.e(true);
            vb vbVar = this.n;
            kb kbVar = this.T0;
            Activity activity = this.b;
            if (i9 == 3) {
                if (this.n1 == null) {
                    gb gbVar2 = new gb(this, activity, kbVar);
                    this.n1 = gbVar2;
                    vbVar.addView(gbVar2.d);
                    vbVar.addView(this.n1);
                }
                this.n1.setVisibility(0);
                a8 a8Var5 = this.G1;
                if (a8Var5 != null) {
                    this.n1.setEntry(a8Var5);
                }
            } else if (i15 == 3) {
                kbVar.b();
                gb gbVar3 = this.n1;
                if (gbVar3 != null) {
                    gbVar3.a.setCropEditorDrawing(gbVar3);
                    gbVar3.y = true;
                }
            }
            if (i9 == 4) {
                if (this.o1 == null) {
                    hb hbVar2 = new hb(this, activity, kbVar);
                    this.o1 = hbVar2;
                    vbVar.addView(hbVar2.e);
                    vbVar.addView(this.o1);
                }
                this.o1.setVisibility(0);
            } else if (i15 == 4) {
                kbVar.b();
                hb hbVar3 = this.o1;
                if (hbVar3 != null) {
                    hbVar3.A = true;
                }
            }
        }
        this.X0.b((i9 == -1 || i9 == 2) && this.E > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        qe0 qe0Var = this.x1;
        boolean z13 = qe0Var == null && i9 == 1;
        float f14 = 1.0f;
        if (i9 == 1) {
            s();
            qe0 qe0Var2 = this.x1;
            this.r2 = qe0Var2;
            FrameLayout toolsView = qe0Var2 != null ? qe0Var2.getToolsView() : null;
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
            if (i15 == 1 && qe0Var != null) {
                this.r2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(qe0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.x1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i9 != 0) {
                    u();
                    this.r2 = this.r1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(q2Var, (Property<q2, Float>) property, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.r1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -AndroidUtilities.dp(16.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property2, AndroidUtilities.dp(48.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f), f10));
                } else if (i15 == 0 && this.r1 != null) {
                    this.r2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(q2Var, (Property<q2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getTopLayout(), (Property<View, Float>) property3, f10));
                    View topLayout2 = this.r1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property3, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property4, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                gbVar = this.n1;
                if (gbVar == null) {
                    tf.e eVar = gbVar.h;
                    if (i9 == 3) {
                        Property property5 = View.ALPHA;
                        i10 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<tf.e, Float>) property5, 0.0f, 1.0f));
                        tf.e eVar2 = this.n1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f11 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar2, (Property<tf.e, Float>) property6, AndroidUtilities.dp(52.0f), f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property6, AndroidUtilities.dp(52.0f), f10));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new ha(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        i10 = 2;
                        f11 = 52.0f;
                        if (i15 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<tf.e, Float>) property7, 1.0f, 0.0f));
                            tf.e eVar3 = this.n1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(eVar3, (Property<tf.e, Float>) property8, f10, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property8, f10, AndroidUtilities.dp(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.n1.getAppearProgress(), f10);
                            ofFloat2.addUpdateListener(new ha(this, i10));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    i10 = 2;
                    f11 = 52.0f;
                }
                hbVar = this.o1;
                if (hbVar != null) {
                    tf.e eVar4 = hbVar.n;
                    if (i9 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i10];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<tf.e, Float>) property9, fArr));
                        tf.e eVar5 = this.o1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i10];
                        fArr2[0] = AndroidUtilities.dp(f11);
                        fArr2[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(eVar5, (Property<tf.e, Float>) property10, fArr2));
                        float[] fArr3 = new float[i10];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.o1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.o1.r;
                        float[] fArr4 = new float[i10];
                        fArr4[0] = AndroidUtilities.dp(f11);
                        fArr4[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i10];
                        fArr5[0] = this.o1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new ha(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i15 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i10];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<tf.e, Float>) property11, fArr6));
                        tf.e eVar6 = this.o1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float dp = AndroidUtilities.dp(f11);
                        float[] fArr7 = new float[i10];
                        fArr7[0] = f10;
                        fArr7[1] = dp;
                        arrayList.add(ObjectAnimator.ofFloat(eVar6, (Property<tf.e, Float>) property12, fArr7));
                        float[] fArr8 = new float[i10];
                        // fill-array-data instruction
                        fArr8[0] = 1.0f;
                        fArr8[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.o1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.o1.r;
                        float dp2 = AndroidUtilities.dp(f11);
                        float[] fArr9 = new float[i10];
                        fArr9[0] = f10;
                        fArr9[1] = dp2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i10];
                        fArr10[0] = this.o1.getAppearProgress();
                        fArr10[1] = f10;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new ha(this, 4));
                        arrayList.add(ofFloat4);
                    }
                }
                Property property13 = View.ALPHA;
                if (i9 != -1 || i9 == 2) {
                    i11 = 1;
                    if (this.K1 == 1) {
                        f12 = 1.0f;
                        float[] fArr11 = new float[i11];
                        fArr11[0] = f12;
                        arrayList.add(ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(h6Var, (Property<h6, Float>) property13, ((i9 != -1 || i9 == 2) && (this.K1 == i11 || !((a8Var = this.G1) == null || TextUtils.isEmpty(a8Var.y)))) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<v0, Float>) property13, (i9 != -1 || i9 == 2) ? 1.0f : 0.0f));
                        imageView = this.e1;
                        if (imageView != null) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i9 == -1 || i9 == 2) && (a8Var2 = this.G1) != null && a8Var2.u) ? 1.0f : 0.0f));
                        } else {
                            i12 = 1;
                        }
                        int i16 = this.b0;
                        float[] fArr12 = new float[i12];
                        fArr12[0] = ((i16 != i12 || i16 == 2) && i9 == -1) ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property13, fArr12));
                        ib ibVar = this.d0;
                        if (i9 == i12) {
                            ibVar.setPivotY(ibVar.getMeasuredHeight() * 0.2f);
                            i13 = AndroidUtilities.dp(164.0f);
                        } else if (i9 == 0) {
                            ibVar.setPivotY(ibVar.getMeasuredHeight() * 0.6f);
                            i13 = AndroidUtilities.dp(40.0f);
                        } else if (i9 == 2) {
                            ibVar.setPivotY(0.0f);
                            i13 = gcVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            i13 = 0;
                        }
                        if (i13 > 0) {
                            f13 = (r10 - i13) / (ibVar.getHeight() - ((int) ibVar.getPivotY()));
                        } else {
                            f13 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) View.SCALE_X, f13));
                        arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) View.SCALE_Y, f13));
                        if (i9 == -1) {
                            arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) View.TRANSLATION_Y, 0.0f));
                        }
                        he0Var = this.B1;
                        if (he0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(he0Var, (Property<he0, Float>) property13, i9 == 1 ? 1.0f : 0.0f));
                        }
                        fe0Var = this.A1;
                        if (fe0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(fe0Var, (Property<fe0, Float>) property13, i9 == 1 ? 1.0f : 0.0f));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(mbVar, (Property<mb, Float>) property13, i9 == -1 ? 1.0f : 0.0f));
                        float[] fArr13 = {(i9 != -1 || i9 == 2) ? 1.0f : 0.0f};
                        fh.d2 d2Var = this.h0;
                        arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<fh.d2, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<fh.d2, Float>) property14, (i9 != -1 || i9 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                        if (i9 != -1 && i9 != 2) {
                            f14 = 0.0f;
                        }
                        FrameLayout frameLayout3 = this.U0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f14));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i9 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + mbVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.f0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i9 == 2 ? -90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(h6Var, (Property<h6, Float>) property15, i9 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) property15, i9 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<v0, Float>) property15, i9 == 2 ? 90.0f : 0.0f));
                        imageView2 = this.e1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i9 == 2 ? 90.0f : 0.0f));
                        }
                        if (this.n0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i14 = 0;
                            ofFloat5.addUpdateListener(new xa(this, i14));
                            arrayList.add(ofFloat5);
                        } else {
                            i14 = 0;
                        }
                        if (gcVar != null) {
                            a8 a8Var6 = this.G1;
                            boolean z14 = a8Var6 == null || !a8Var6.v() || !this.G1.t() || i9 == 2;
                            if (gcVar.f0 != z14 || !z11) {
                                gcVar.f0 = z14;
                                if (!z11) {
                                    gcVar.e0.f(z14, true);
                                }
                                gcVar.invalidate();
                            }
                        }
                        if (!z11) {
                            while (i14 < arrayList.size()) {
                                Animator animator = (Animator) arrayList.get(i14);
                                animator.setDuration(1L);
                                animator.start();
                                i14++;
                            }
                            if (i15 != i9) {
                                Q(i15, i9);
                                return;
                            }
                            return;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.n2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.n2.setDuration(320L);
                        this.n2.setInterpolator(gr.h);
                        this.n2.addListener(new ta(this, i15, i9, 1));
                        if (z12) {
                            this.n2.setStartDelay(120L);
                        }
                        this.n2.start();
                        return;
                    }
                } else {
                    i11 = 1;
                }
                f12 = 0.0f;
                float[] fArr112 = new float[i11];
                fArr112[0] = f12;
                arrayList.add(ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(h6Var, (Property<h6, Float>) property13, ((i9 != -1 || i9 == 2) && (this.K1 == i11 || !((a8Var = this.G1) == null || TextUtils.isEmpty(a8Var.y)))) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<v0, Float>) property13, (i9 != -1 || i9 == 2) ? 1.0f : 0.0f));
                imageView = this.e1;
                if (imageView != null) {
                }
                int i162 = this.b0;
                float[] fArr122 = new float[i12];
                fArr122[0] = ((i162 != i12 || i162 == 2) && i9 == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property13, fArr122));
                ib ibVar2 = this.d0;
                if (i9 == i12) {
                }
                if (i13 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(ibVar2, (Property<ib, Float>) View.SCALE_X, f13));
                arrayList.add(ObjectAnimator.ofFloat(ibVar2, (Property<ib, Float>) View.SCALE_Y, f13));
                if (i9 == -1) {
                }
                he0Var = this.B1;
                if (he0Var != null) {
                }
                fe0Var = this.A1;
                if (fe0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(mbVar, (Property<mb, Float>) property13, i9 == -1 ? 1.0f : 0.0f));
                float[] fArr132 = {(i9 != -1 || i9 == 2) ? 1.0f : 0.0f};
                fh.d2 d2Var2 = this.h0;
                arrayList.add(ObjectAnimator.ofFloat(d2Var2, (Property<fh.d2, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(d2Var2, (Property<fh.d2, Float>) property142, (i9 != -1 || i9 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                if (i9 != -1) {
                    f14 = 0.0f;
                }
                FrameLayout frameLayout32 = this.U0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f14));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i9 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + mbVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.f0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i9 == 2 ? -90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(h6Var, (Property<h6, Float>) property152, i9 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) property152, i9 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<v0, Float>) property152, i9 == 2 ? 90.0f : 0.0f));
                imageView2 = this.e1;
                if (imageView2 != null) {
                }
                if (this.n0.c()) {
                }
                if (gcVar != null) {
                }
                if (!z11) {
                }
            }
        }
        z12 = z13;
        if (i9 != 0) {
        }
        gbVar = this.n1;
        if (gbVar == null) {
        }
        hbVar = this.o1;
        if (hbVar != null) {
        }
        Property property132 = View.ALPHA;
        if (i9 != -1) {
        }
        i11 = 1;
        if (this.K1 == 1) {
        }
        f12 = 0.0f;
        float[] fArr1122 = new float[i11];
        fArr1122[0] = f12;
        arrayList.add(ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(h6Var, (Property<h6, Float>) property132, ((i9 != -1 || i9 == 2) && (this.K1 == i11 || !((a8Var = this.G1) == null || TextUtils.isEmpty(a8Var.y)))) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<v0, Float>) property132, (i9 != -1 || i9 == 2) ? 1.0f : 0.0f));
        imageView = this.e1;
        if (imageView != null) {
        }
        int i1622 = this.b0;
        float[] fArr1222 = new float[i12];
        fArr1222[0] = ((i1622 != i12 || i1622 == 2) && i9 == -1) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property132, fArr1222));
        ib ibVar22 = this.d0;
        if (i9 == i12) {
        }
        if (i13 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(ibVar22, (Property<ib, Float>) View.SCALE_X, f13));
        arrayList.add(ObjectAnimator.ofFloat(ibVar22, (Property<ib, Float>) View.SCALE_Y, f13));
        if (i9 == -1) {
        }
        he0Var = this.B1;
        if (he0Var != null) {
        }
        fe0Var = this.A1;
        if (fe0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(mbVar, (Property<mb, Float>) property132, i9 == -1 ? 1.0f : 0.0f));
        float[] fArr1322 = {(i9 != -1 || i9 == 2) ? 1.0f : 0.0f};
        fh.d2 d2Var22 = this.h0;
        arrayList.add(ObjectAnimator.ofFloat(d2Var22, (Property<fh.d2, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(d2Var22, (Property<fh.d2, Float>) property1422, (i9 != -1 || i9 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
        if (i9 != -1) {
        }
        FrameLayout frameLayout322 = this.U0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f14));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i9 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + mbVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.f0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i9 == 2 ? -90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(h6Var, (Property<h6, Float>) property1522, i9 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) property1522, i9 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<v0, Float>) property1522, i9 == 2 ? 90.0f : 0.0f));
        imageView2 = this.e1;
        if (imageView2 != null) {
        }
        if (this.n0.c()) {
        }
        if (gcVar != null) {
        }
        if (!z11) {
        }
    }

    public final void m() {
        a8 a8Var;
        if (this.r1 == null || (a8Var = this.G1) == null || !a8Var.u) {
            return;
        }
        File file = a8Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.G1.W0 = null;
        }
        this.G1.W0 = a8.w(this.c, "webp");
        ya yaVar = this.r1;
        a8 a8Var2 = this.G1;
        Bitmap t02 = yaVar.t0(a8Var2.T0, false, false, true, this.K1 != 1, a8Var2);
        try {
            try {
                t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.G1.W0));
                if (t02.isRecycled()) {
                    return;
                }
            } catch (Exception e11) {
                FileLog.e(e11);
                try {
                    this.G1.W0.delete();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                this.G1.W0 = null;
                if (t02 == null || t02.isRecycled()) {
                    return;
                }
            }
            t02.recycle();
        } catch (Throwable th) {
            if (t02 != null && !t02.isRecycled()) {
                t02.recycle();
            }
            throw th;
        }
    }

    public final void m0(boolean z10) {
        za zaVar;
        boolean z11 = false;
        i0(this.b0 == 0 && this.K1 == 1 && !this.E0.e && !I(), z10);
        this.C0.setSelected(this.w0.j());
        z zVar = this.E0;
        c0(this.j0, zVar == null || !zVar.e, z10);
        c0(this.A0, (this.W1 || this.K1 == -1 || this.b0 != 0 || this.U1 == null || this.E0.e || I()) ? false : true, z10);
        c0(this.B0, (this.W1 || this.K1 == -1 || this.b0 != 0 || (zaVar = this.x0) == null || !zaVar.a || this.E0.e || this.w0.j()) ? false : true, z10);
        c0(this.C0, (this.W1 || this.K1 == -1 || this.b0 != 0 || this.E0.e) ? false : true, z10);
        c0(this.D0, this.E0.e, z10);
        this.K0.e(this.w0.j() ? this.w0.getFilledProgress() : 0.0f, z10);
        boolean z12 = this.E0.e;
        x3 x3Var = this.j1;
        if (z12) {
            x3Var.v();
        } else {
            x3Var.e(true);
        }
        h(this.W1, z10);
        AndroidUtilities.updateViewShow(this.O0, this.K1 == -1 && this.b0 == 0);
        if (this.K1 == -1 && this.b0 == 0) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.N0, z11);
    }

    public final void n0() {
        this.D0.setTranslationX(-0.0f);
        float alpha = (this.D0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        this.B0.setTranslationX(-alpha);
        float alpha2 = (this.B0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha;
        this.C0.setTranslationX(-alpha2);
        float alpha3 = (this.C0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha2;
        this.A0.setTranslationX(-alpha3);
        float alpha4 = (this.A0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha3;
        this.j0.setTranslationX(0.0f);
        w wVar = this.E0.a;
        wVar.setPadding((int) ((this.j0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) (alpha4 + AndroidUtilities.dp(8.0f)), 0);
        wVar.invalidate();
    }

    public final void o() {
        boolean z10 = this.G != 0.0f || this.E < 1.0f || this.x2;
        if (z10 == this.w2) {
            return;
        }
        ff.t0 t0Var = this.y;
        if (t0Var != null) {
            t0Var.a(!z10);
        }
        this.w2 = z10;
    }

    public final void o0(boolean z10) {
        mi0 mi0Var = this.d1;
        if (mi0Var != null) {
            int[] iArr = mi0Var.e;
            int i9 = 0;
            if (!z10) {
                a8 a8Var = this.G1;
                int i10 = (a8Var == null || !a8Var.y0) ? 0 : iArr[0] - 1;
                mi0Var.L(i10, false, true);
                this.d1.N(i10);
                ImageView imageView = this.e1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            a8 a8Var2 = this.G1;
            if (a8Var2 != null && a8Var2.y0) {
                i9 = iArr[0];
            }
            mi0Var.N(i9);
            mi0 mi0Var2 = this.d1;
            if (mi0Var2 != null) {
                mi0Var2.start();
            }
        }
    }

    public final void p() {
        if (this.p2 < 0) {
            this.p2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.q2 = arrayList;
            arrayList.add("off");
            this.q2.add("auto");
            this.q2.add("on");
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            s2 s2Var = this.s;
            s2Var.o = f10;
            s2Var.n = s2.f(f10);
            s2Var.g();
            float f11 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            s2 s2Var2 = this.s;
            s2Var2.p = f11;
            s2Var2.i();
        }
    }

    public final void p0() {
        if (this.S1) {
            return;
        }
        this.S1 = true;
        v9 v9Var = new v9(this, 2);
        ya yaVar = this.r1;
        a8 a8Var = this.G1;
        if (yaVar == null || a8Var == null) {
            v9Var.run();
            return;
        }
        a8Var.f();
        boolean u02 = yaVar.u0();
        boolean z10 = yaVar.K0.getPainting().E;
        Utilities.searchQueue.postRunnable(new y9(this, yaVar, a8Var.i0, a8Var.j0, a8Var, z10, u02, v9Var, 1));
    }

    public final void q(boolean z10) {
        kb kbVar;
        if (this.d) {
            t9 t9Var = this.m0;
            if (t9Var != null) {
                t9Var.dismiss();
                this.m0 = null;
            }
            a8 a8Var = this.G1;
            long j10 = 0;
            if (a8Var != null && !a8Var.h) {
                if ((this.v && a8Var.g) || a8Var.b != 0) {
                    a8Var.j = false;
                }
                a8Var.i(false);
            }
            this.G1 = null;
            Utilities.Callback4 callback4 = this.N;
            if (callback4 == null || (kbVar = this.T0) == null) {
                kb kbVar2 = this.T0;
                if (kbVar2 != null && !z10) {
                    kbVar2.set(null);
                }
                g(0.0f, z10, new v9(this, 23));
                int i9 = this.F;
                if (i9 == 1 || i9 == 0) {
                    this.n.setBackgroundColor(0);
                    this.X0.b(false, true);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
                int i10 = this.c;
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                return;
            }
            if (this.e) {
                return;
            }
            this.e = true;
            k61 k61Var = kbVar.y;
            if (k61Var != null) {
                k61Var.C();
                kbVar.y.I();
                kbVar.y = null;
            }
            k61 k61Var2 = kbVar.x;
            if (k61Var2 != null) {
                j10 = k61Var2.o();
                kbVar.x.C();
                kbVar.x.I();
                kbVar.x = null;
            }
            k61 k61Var3 = kbVar.e;
            if (k61Var3 != null) {
                j10 = k61Var3.o();
                kbVar.e.C();
                kbVar.e.I();
                kbVar.e = null;
            }
            callback4.run(Long.valueOf(j10), new fa(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.w));
        }
    }

    public final boolean q0() {
        za zaVar;
        if ((!this.L1 && !this.M1) || (zaVar = this.x0) == null || !zaVar.isFrontface()) {
            return false;
        }
        int i9 = this.p2;
        return i9 == 2 || (i9 == 1 && this.Y1);
    }

    public final void r() {
        Activity activity = this.b;
        if (this.x0 != null || activity == null) {
            return;
        }
        this.x0 = new za(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        z6 z6Var = this.K0;
        if (z6Var != null) {
            z6Var.c0 = 0.0f;
            z6Var.d0.d(0.0f, true);
        }
        this.x0.recordHevc = !this.w0.j();
        this.x0.setThumbDrawable(A());
        this.x0.initTexture();
        this.x0.setDelegate(new ea(this, 0));
        c0(this.B0, this.x0.a && this.b0 == 0, true);
        this.C0.setTranslationX(this.x0.a ? 0.0f : AndroidUtilities.dp(46.0f));
        this.w0.setCameraView(this.x0);
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.S0.v();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else if ((!d1.q(this.x0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", d1.p(ApplicationLoader.applicationContext, false))) && this.x0.a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
            this.h1.v();
        }
        if (this.y0 == null) {
            this.y0 = new v6(activity, new w9(this, 3));
        }
        this.y0.a(this.x0);
        k7 k7Var = this.z0;
        if (k7Var != null) {
            jb jbVar = this.w0;
            Object blurRenderNode = jbVar.getBlurRenderNode();
            k7Var.B = jbVar;
            k7Var.C = blurRenderNode;
            k7Var.invalidate();
        }
    }

    public final void s() {
        a8 a8Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.x1 != null || (a8Var = this.G1) == null) {
            return;
        }
        if (a8Var.K) {
            bitmap = null;
        } else {
            if (a8Var.Z0 == null) {
                q10 = this.T0.getPhotoBitmap();
            } else {
                ea eaVar = new ea(this, 11);
                Point point = AndroidUtilities.displaySize;
                q10 = a8.q(eaVar, point.x, point.y, 0, true);
            }
            bitmap = q10;
        }
        if (bitmap != null || this.G1.K) {
            y51 textureView = this.T0.getTextureView();
            int orientation = this.T0.getOrientation();
            a8 a8Var2 = this.G1;
            qe0 qe0Var = new qe0(this.b, textureView, bitmap, null, orientation, a8Var2 != null ? a8Var2.a1 : null, null, 0, false, false, this.n0, this.a);
            this.x1 = qe0Var;
            this.r.addView(qe0Var);
            oe0 oe0Var = this.y1;
            if (oe0Var != null) {
                oe0Var.setFilterView(this.x1);
            }
            TextureView myTextureView = this.x1.getMyTextureView();
            this.z1 = myTextureView;
            if (myTextureView != null) {
                myTextureView.setOpaque(false);
            }
            this.T0.o(this.z1, this.x1);
            TextureView textureView2 = this.z1;
            if (textureView2 != null) {
                textureView2.setAlpha(0.0f);
                this.z1.animate().alpha(1.0f).setDuration(220L).start();
            }
            j();
            fe0 blurControl = this.x1.getBlurControl();
            this.A1 = blurControl;
            if (blurControl != null) {
                this.d0.addView(blurControl);
            }
            he0 curveControl = this.x1.getCurveControl();
            this.B1 = curveControl;
            if (curveControl != null) {
                this.d0.addView(curveControl);
            }
            V();
            this.x1.getDoneTextView().setOnClickListener(new x9(this, 13));
            this.x1.getCancelTextView().setOnClickListener(new x9(this, 14));
            this.x1.getToolsView().setVisibility(8);
            this.x1.getToolsView().setAlpha(0.0f);
            this.x1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.x1.e0.setVisibility(0);
        }
    }

    public final void t(boolean z10) {
        if (this.I0 != null) {
            jb jbVar = this.w0;
            if ((jbVar != null && jbVar.j()) == this.I0.L) {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (this.I0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.i2;
        boolean z11 = !z10;
        jb jbVar2 = this.w0;
        va vaVar = new va(this, this.c, this.b, this.a, albumEntry, z10, z11, jbVar2 != null && jbVar2.j());
        this.I0 = vaVar;
        vaVar.C.setVisibility(8);
        this.I0.setMultipleOnClick(this.w0.j());
        this.I0.setMaxCount(Math.min(10, u.b() - this.w0.getFilledCount()));
        this.I0.setOnBackClickListener(new ma(this, 1));
        this.I0.setOnSelectListener(new la(z10, this, 0));
        this.I0.setOnSelectMultipleListener(new gh.q1(this, 2));
        f2.l0 l0Var = this.h2;
        if (l0Var != null) {
            a3 a3Var = this.I0.e;
            a3Var.B = l0Var;
            a3Var.l0();
        }
        this.n.addView(this.I0, g7.e6.e(-1, -1, 119));
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
        a8 a8Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        a8 a8Var2;
        xf.c1 renderView;
        View renderInputView;
        View textDimView;
        View entitiesView;
        View selectionEntitiesView;
        File file2;
        File file3;
        if (this.r1 != null) {
            return;
        }
        Pair<Integer, Integer> paintSize = this.T0.getPaintSize();
        a8 a8Var3 = this.G1;
        Bitmap decodeFile = (a8Var3 == null || !(a8Var3.c || a8Var3.g || this.D1 != null) || (file3 = a8Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        a8 a8Var4 = this.G1;
        if (a8Var4 == null || (!(a8Var4.c || a8Var4.g || this.D1 != null) || (file2 = a8Var4.Q0) == null)) {
            bitmap = null;
        } else {
            bitmap = BitmapFactory.decodeFile(file2.getPath());
            if (bitmap != null) {
                z10 = true;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap3 = bitmap;
                int measuredWidth = this.d0.getMeasuredWidth();
                int measuredHeight = this.d0.getMeasuredHeight();
                a8Var = this.G1;
                if (a8Var != null || a8Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = a8Var != null ? file : a8Var.L;
                if (a8Var == null && a8Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (a8Var != null || a8Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.T0.getOrientation();
                a8Var2 = this.G1;
                Object obj2 = obj;
                if (a8Var2 != null) {
                    obj2 = a8Var2.T0;
                }
                ?? r13 = obj2;
                MediaController.CropState cropState = new MediaController.CropState();
                q6 q6Var = this.o0;
                kb kbVar = this.T0;
                Activity activity = this.b;
                boolean z15 = z12;
                ya yaVar = new ya(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, a8Var2, measuredWidth, measuredHeight, cropState, this.n0, this.a, q6Var, kbVar);
                this.r1 = yaVar;
                a8 a8Var5 = this.G1;
                yaVar.setHasAudio(a8Var5 == null && a8Var5.y != null);
                this.r1.setBlurManager(this.n0);
                this.r.addView(this.r1);
                renderView = this.r1.getRenderView();
                this.s1 = renderView;
                if (renderView != null) {
                    renderView.getPainting().E = z15;
                    this.d0.addView(this.s1);
                }
                renderInputView = this.r1.getRenderInputView();
                this.t1 = renderInputView;
                if (renderInputView != null) {
                    this.d0.addView(renderInputView);
                }
                textDimView = this.r1.getTextDimView();
                this.u1 = textDimView;
                if (textDimView != null) {
                    this.d0.addView(textDimView);
                }
                entitiesView = this.r1.getEntitiesView();
                this.v1 = entitiesView;
                if (entitiesView != null) {
                    this.d0.addView(entitiesView);
                }
                selectionEntitiesView = this.r1.getSelectionEntitiesView();
                this.w1 = selectionEntitiesView;
                if (selectionEntitiesView != null) {
                    this.d0.addView(selectionEntitiesView);
                }
                V();
                this.r1.setOnDoneButtonClickedListener(new v9(this, 21));
                this.r1.setOnCancelButtonClickedListener(new v9(this, 22));
                ya yaVar2 = this.r1;
                yaVar2.N0.setVisibility(0);
                yaVar2.K0.setVisibility(0);
                yaVar2.L0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.d0.getMeasuredWidth();
        int measuredHeight2 = this.d0.getMeasuredHeight();
        a8Var = this.G1;
        if (a8Var != null) {
        }
        file = null;
        z11 = false;
        if (a8Var != null) {
        }
        if (a8Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (a8Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.T0.getOrientation();
        a8Var2 = this.G1;
        Object obj22 = obj;
        if (a8Var2 != null) {
        }
        ?? r132 = obj22;
        MediaController.CropState cropState2 = new MediaController.CropState();
        q6 q6Var2 = this.o0;
        kb kbVar2 = this.T0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        ya yaVar3 = new ya(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, a8Var2, measuredWidth2, measuredHeight2, cropState2, this.n0, this.a, q6Var2, kbVar2);
        this.r1 = yaVar3;
        a8 a8Var52 = this.G1;
        yaVar3.setHasAudio(a8Var52 == null && a8Var52.y != null);
        this.r1.setBlurManager(this.n0);
        this.r.addView(this.r1);
        renderView = this.r1.getRenderView();
        this.s1 = renderView;
        if (renderView != null) {
        }
        renderInputView = this.r1.getRenderInputView();
        this.t1 = renderInputView;
        if (renderInputView != null) {
        }
        textDimView = this.r1.getTextDimView();
        this.u1 = textDimView;
        if (textDimView != null) {
        }
        entitiesView = this.r1.getEntitiesView();
        this.v1 = entitiesView;
        if (entitiesView != null) {
        }
        selectionEntitiesView = this.r1.getSelectionEntitiesView();
        this.w1 = selectionEntitiesView;
        if (selectionEntitiesView != null) {
        }
        V();
        this.r1.setOnDoneButtonClickedListener(new v9(this, 21));
        this.r1.setOnCancelButtonClickedListener(new v9(this, 22));
        ya yaVar22 = this.r1;
        yaVar22.N0.setVisibility(0);
        yaVar22.K0.setVisibility(0);
        yaVar22.L0.setVisibility(0);
    }

    public final void v(boolean z10) {
        v6 v6Var = this.y0;
        if (v6Var != null) {
            v6Var.f = null;
            Utilities.globalQueue.cancelRunnable(v6Var.h);
            this.y0 = null;
            jb jbVar = this.w0;
            if (jbVar != null) {
                jbVar.c.a(null);
            }
        }
        k7 k7Var = this.z0;
        if (k7Var != null) {
            k7Var.B = null;
            k7Var.C = null;
            k7Var.invalidate();
        }
        if (this.x0 != null) {
            if (z10) {
                b0(new v9(this, 8));
                return;
            }
            b0(new v9(this, 9));
            this.x0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.x0);
            jb jbVar2 = this.w0;
            if (jbVar2 != null) {
                jbVar2.setCameraView(null);
            }
            this.x0 = null;
        }
    }

    public final void w() {
        va vaVar = this.I0;
        if (vaVar == null) {
            return;
        }
        this.n.removeView(vaVar);
        this.I0 = null;
        ValueAnimator valueAnimator = this.j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j2 = null;
        }
        o1.j jVar = this.k2;
        if (jVar != null) {
            jVar.c();
            this.k2 = null;
        }
        this.l2 = null;
    }

    public final void y() {
        qe0 qe0Var = this.x1;
        if (qe0Var == null) {
            return;
        }
        qe0Var.e();
        this.y1.setFilterView(null);
        this.r.removeView(this.x1);
        TextureView textureView = this.z1;
        if (textureView != null) {
            this.d0.removeView(textureView);
            this.z1 = null;
        }
        this.T0.o(null, null);
        fe0 fe0Var = this.A1;
        if (fe0Var != null) {
            this.d0.removeView(fe0Var);
            this.A1 = null;
        }
        he0 he0Var = this.B1;
        if (he0Var != null) {
            this.d0.removeView(he0Var);
            this.B1 = null;
        }
        this.x1 = null;
    }

    public final void z() {
        ya yaVar = this.r1;
        if (yaVar == null) {
            return;
        }
        yaVar.N0.removeAllViews();
        ya yaVar2 = this.r1;
        yaVar2.K0.h();
        yaVar2.N0.setVisibility(8);
        yaVar2.M0.setVisibility(8);
        yaVar2.A0.postRunnable(new bg.d2(15));
        p5 p5Var = yaVar2.g2;
        if (p5Var != null) {
            p5Var.dismiss();
        }
        xf.x xVar = yaVar2.P1;
        if (xVar != null) {
            xVar.dismiss();
        }
        this.r.removeView(this.r1);
        this.r1 = null;
        xf.c1 c1Var = this.s1;
        if (c1Var != null) {
            this.d0.removeView(c1Var);
            this.s1 = null;
        }
        View view = this.u1;
        if (view != null) {
            this.d0.removeView(view);
            this.u1 = null;
        }
        View view2 = this.t1;
        if (view2 != null) {
            this.d0.removeView(view2);
            this.t1 = null;
        }
        View view3 = this.v1;
        if (view3 != null) {
            this.d0.removeView(view3);
            this.v1 = null;
        }
        View view4 = this.w1;
        if (view4 != null) {
            this.d0.removeView(view4);
            this.w1 = null;
        }
    }
}
