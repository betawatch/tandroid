package nh;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class gb implements NotificationCenter.NotificationCenterDelegate {
    public static gb B2;
    public ValueAnimator A;
    public final rb A0;
    public te0 A1;
    public ValueAnimator A2;
    public bb B;
    public final sb B0;
    public ve0 B1;
    public float C;
    public final z C0;
    public File C1;
    public final RectF D;
    public final rb D0;
    public ArrayList D1;
    public float E;
    public final y E0;
    public ArrayList E1;
    public int F;
    public final vb F0;
    public ArrayList F1;
    public float G;
    public boolean G0;
    public o7 G1;
    public Float H;
    public boolean H0;
    public boolean H1;
    public boolean I;
    public ga I0;
    public long I1;
    public long J;
    public v0 J0;
    public boolean J1;
    public boolean K;
    public final o6 K0;
    public int K1;
    public final AnimationNotificationsLocker L;
    public final d L0;
    public boolean L1;
    public Runnable M;
    public final z9 M0;
    public boolean M1;
    public Utilities.Callback4 N;
    public final n2 N0;
    public boolean N1;
    public int O;
    public final n2 O0;
    public boolean O1;
    public int P;
    public final s3 P0;
    public float P1;
    public int Q;
    public final s3 Q0;
    public int Q1;
    public boolean R;
    public final u81 R0;
    public boolean R1;
    public boolean S;
    public final t3 S0;
    public boolean S1;
    public boolean T;
    public final va T0;
    public boolean T1;
    public int U;
    public final FrameLayout U0;
    public String U1;
    public int V;
    public final qb V0;
    public AnimatorSet V1;
    public int W;
    public final ub W0;
    public boolean W1;
    public int X;
    public final w5 X0;
    public boolean X1;
    public final RectF Y;
    public final wa Y0;
    public boolean Y1;
    public final RectF Z;
    public final y9 Z0;
    public boolean Z1;
    public final lh.b a;
    public final Path a0;
    public final u0 a1;
    public Runnable a2;
    public final Activity b;
    public int b0;
    public xi0 b1;
    public AnimatorSet b2;
    public final int c;
    public int c0;
    public final aj0 c1;
    public m9 c2;
    public boolean d;
    public final ta d0;
    public xi0 d1;
    public boolean d2;
    public boolean e;
    public final FrameLayout e0;
    public ImageView e1;
    public AnimatorSet e2;
    public final WindowManager f;
    public final LinearLayout f0;
    public final cg.i0 f1;
    public ValueAnimator f2;
    public final FrameLayout g0;
    public final t3 g1;
    public boolean g2;
    public final WindowManager.LayoutParams h;
    public final bg.x2 h0;
    public final t3 h1;
    public f2.i0 h2;
    public final FrameLayout i0;
    public final t3 i1;
    public MediaController.AlbumEntry i2;
    public final n2 j0;
    public final t3 j1;
    public ValueAnimator j2;
    public final h7 k0;
    public final x5 k1;
    public o1.k k2;
    public final org.telegram.ui.ActionBar.h5 l0;
    public final tb l1;
    public Boolean l2;
    public e9 m0;
    public p m1;
    public q9 m2;
    public final fb n;
    public final org.telegram.ui.Components.ga n0;
    public ra n1;
    public AnimatorSet n2;
    public final e6 o0;
    public sa o1;
    public boolean o2;
    public final cg.h0 p0;
    public final qb p1;
    public int p2;
    public boolean q0;
    public final d q1;
    public ArrayList q2;
    public final ya r;
    public long r0;
    public ja r1;
    public FrameLayout r2;
    public final p2 s;
    public String s0;
    public ag.t1 s1;
    public boolean s2;
    public TLRPC.InputPeer t0;
    public View t1;
    public g9 t2;
    public c9 u0;
    public View u1;
    public bg.f u2;
    public boolean v;
    public t v0;
    public View v1;
    public boolean v2;
    public long w;
    public final ua w0;
    public View w1;
    public boolean w2;
    public xa x;
    public ka x0;
    public ef0 x1;
    public boolean x2;
    public final jf.s0 y;
    public j6 y0;
    public final cf0 y1;
    public pa y2;
    public final y6 z0;
    public TextureView z1;
    public float z2;

    public gb(Activity activity, int i10) {
        int i11;
        lh.b bVar = new lh.b();
        this.a = bVar;
        this.w = 0L;
        this.D = new RectF();
        int i12 = 1;
        this.I = true;
        this.L = new AnimationNotificationsLocker();
        this.Y = new RectF();
        this.Z = new RectF();
        this.a0 = new Path();
        new Rect();
        this.b0 = 0;
        this.c0 = -1;
        this.u0 = new c9();
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
        ca caVar = new ca(this);
        this.Z1 = true;
        this.g2 = true;
        this.p2 = -1;
        this.b = activity;
        this.c = i10;
        LaunchActivity launchActivity = LaunchActivity.C1;
        this.y = launchActivity != null ? new jf.s0(launchActivity, true) : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        layoutParams.flags = -2013200128;
        int i13 = 16;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f = windowManager;
        fb fbVar = new fb(this, activity);
        this.n = fbVar;
        p9 p9Var = new p9(this, i12);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(fbVar, p9Var);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        p2 p2Var = new p2(activity, windowManager, this.n, layoutParams);
        this.s = p2Var;
        p2Var.a(new na(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        fb fbVar2 = this.n;
        ya yaVar = new ya(this, activity);
        this.r = yaVar;
        fbVar2.addView(yaVar);
        ya yaVar2 = this.r;
        ta taVar = new ta(this, activity);
        this.d0 = taVar;
        yaVar2.addView(taVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.n0 = new org.telegram.ui.Components.ga(this.d0);
        this.o0 = new e6();
        ya yaVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.e0 = frameLayout;
        yaVar3.addView(frameLayout);
        ya yaVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.g0 = frameLayout2;
        yaVar4.addView(frameLayout2);
        ya yaVar5 = this.r;
        bg.x2 x2Var = new bg.x2(this, activity, 12);
        this.h0 = x2Var;
        yaVar5.addView(x2Var);
        this.h0.setVisibility(8);
        this.h0.setAlpha(0.0f);
        ya yaVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.i0 = frameLayout3;
        yaVar6.addView(frameLayout3);
        int i14 = 6;
        mc.a(this.n, new eg.x(i14));
        int i15 = 8;
        ua uaVar = new ua(this, activity, this.n0, this.r, bVar);
        this.w0 = uaVar;
        fb fbVar3 = this.n;
        Objects.requireNonNull(fbVar3);
        uaVar.setCancelGestures(new m6(fbVar3, 4));
        this.w0.setResetState(new g9(this, 13));
        this.d0.addView(this.w0, i7.f6.e(-1, -1, 119));
        this.w0.setOnClickListener(new i9(this, 12));
        ta taVar2 = this.d0;
        int i16 = this.F;
        taVar2.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
        ta taVar3 = this.d0;
        float dp = AndroidUtilities.dp(12.0f);
        eg.k1 k1Var = jf.q0.a;
        taVar3.setOutlineProvider(new jf.p0(0, dp));
        this.d0.setClipToOutline(true);
        g9 g9Var = new g9(this, 14);
        cf0 cf0Var = new cf0(activity);
        cf0Var.a = new TextPaint(1);
        cf0Var.b = new TextPaint(1);
        jr jrVar = jr.h;
        cf0Var.s = new org.telegram.ui.Components.d6(cf0Var, 0L, 350L, jrVar);
        cf0Var.E = new xb0(cf0Var, 7);
        cf0Var.x = g9Var;
        this.y1 = cf0Var;
        va vaVar = new va(this, activity, this.n0, this.o0);
        this.T0 = vaVar;
        vaVar.setCollageView(this.w0);
        va vaVar2 = this.T0;
        vaVar2.v = new g9(this, 15);
        vaVar2.setOnTapListener(new g9(this, i13));
        this.T0.setVisibility(8);
        va vaVar3 = this.T0;
        vaVar3.J = new g9(this, 17);
        this.d0.addView(vaVar3, i7.f6.e(-1, -1, 119));
        this.d0.addView(this.y1, i7.f6.e(-1, -1, 119));
        fb fbVar4 = this.n;
        wa waVar = new wa(this, activity, fbVar4, fbVar4, this.r, bVar, this.n0);
        this.Y0 = waVar;
        waVar.setAccount(i10);
        this.Y0.setUiBlurBitmap(new p9(this, i14));
        int i17 = 5;
        mc.a(this.h0, new ih.u0(this, i17));
        this.Y0.setOnHeightUpdate(new h9(this, 13));
        this.Y0.setOnPeriodUpdate(new h9(this, 4));
        long j10 = this.J;
        if (j10 != 0) {
            this.Y0.setDialogId(j10);
        }
        this.Y0.setOnPremiumHint(new h9(this, i17));
        this.Y0.setOnKeyboardOpen(new h9(this, i14));
        cg.h0 h0Var = new cg.h0(this, activity, 3);
        this.p0 = h0Var;
        this.r.addView(h0Var);
        qb qbVar = new qb(activity, this.r, this.d0, bVar, this.n0);
        this.V0 = qbVar;
        qbVar.setOnTimelineClick(new g9(this, 10));
        this.V0.setOnHeightChange(new g9(this, 11));
        this.T0.setVideoTimelineView(this.V0);
        this.V0.setVisibility(8);
        this.V0.setAlpha(0.0f);
        this.V0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.U0 = frameLayout4;
        float f9 = 388;
        frameLayout4.addView(this.V0, i7.f6.d(-1, f9, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ub ubVar = new ub(activity);
        this.W0 = ubVar;
        ubVar.setVisibility(8);
        this.W0.a(false);
        this.U0.addView(this.W0, i7.f6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.h0.addView(this.U0, i7.f6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.h0.addView(this.Y0, i7.f6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.w0.setTimelineView(this.V0);
        this.w0.setPreviewView(this.T0);
        qb qbVar2 = new qb(activity, this.r, this.d0, bVar, this.n0);
        this.p1 = qbVar2;
        qbVar2.T0 = true;
        qbVar2.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.h0.addView(this.p1, i7.f6.d(-1, f9, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        y9 y9Var = new y9(this, activity, bVar, this.n0);
        this.Z0 = y9Var;
        y9Var.setVisibility(8);
        this.h0.addView(this.Z0, i7.f6.e(-1, -2, 85));
        n2 n2Var = new n2(activity);
        this.j0 = n2Var;
        n2Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        n2 n2Var2 = this.j0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        n2Var2.setScaleType(scaleType);
        this.j0.setImageResource(R.drawable.msg_photo_back);
        n2 n2Var3 = this.j0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        n2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.j0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.j0.setOnClickListener(new i9(this, i12));
        this.e0.addView(this.j0, i7.f6.e(56, 56, 51));
        this.s.a(this.j0);
        h7 h7Var = new h7(activity, i10);
        this.k0 = h7Var;
        h7Var.a(false, false);
        this.k0.setOnClickListener(new r7(i12, this, activity));
        this.e0.addView(this.k0, i7.f6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
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
        this.e0.addView(this.l0, i7.f6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f0.setGravity(5);
        this.e0.addView(this.f0, i7.f6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        h9 h9Var = new h9(this, 7);
        fb fbVar5 = this.n;
        u0 u0Var = new u0(activity);
        u0Var.w = true;
        u0Var.x = true;
        u0Var.h = h9Var;
        u0Var.a = i10;
        u0Var.b = fbVar5;
        u0Var.setScaleType(scaleType);
        u0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        u0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        u0Var.setVisibility(8);
        u0Var.setAlpha(0.0f);
        u0Var.setOnClickListener(new mh.n(u0Var, 3));
        u0Var.f = new np(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        u0Var.d();
        this.a1 = u0Var;
        t3 t3Var = new t3(activity, 1);
        t3Var.m(1.0f, -71.0f);
        t3Var.d = 2000L;
        t3Var.Q = false;
        t3Var.D.o(true, false, false);
        this.g1 = t3Var;
        t3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.e0.addView(this.g1, i7.f6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        aj0 aj0Var = new aj0(activity);
        this.c1 = aj0Var;
        aj0Var.setScaleType(scaleType);
        aj0 aj0Var2 = this.c1;
        o7 o7Var = this.G1;
        aj0Var2.setImageResource((o7Var == null || !o7Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.c1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.c1.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        int i18 = 2;
        this.c1.setOnClickListener(new i9(this, i18));
        this.c1.setVisibility(8);
        this.c1.setAlpha(0.0f);
        cg.i0 i0Var = new cg.i0(activity);
        this.f1 = i0Var;
        i0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f1.setVisibility(8);
        this.f1.setAlpha(0.0f);
        this.f1.setOnClickListener(new i9(this, 3));
        this.f0.addView(this.f1, i7.f6.q(46, 56, 53));
        this.f0.addView(this.c1, i7.f6.q(46, 56, 53));
        this.f0.addView(this.a1, i7.f6.e(46, 56, 53));
        rb rbVar = new rb(activity);
        this.A0 = rbVar;
        rbVar.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.A0.setOnClickListener(new i9(this, 4));
        this.A0.setOnLongClickListener(new bg.g0(this, i18));
        this.A0.setVisibility(8);
        this.A0.setAlpha(0.0f);
        this.s.a(this.A0);
        this.e0.addView(this.A0, i7.f6.e(56, 56, 53));
        sb sbVar = new sb(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.B0 = sbVar;
        sbVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.B0.setOnClickListener(new i9(this, 5));
        boolean q6 = c1.q(activity);
        this.B0.setVisibility(q6 ? 0 : 8);
        this.B0.setAlpha(q6 ? 1.0f : 0.0f);
        this.s.a(this.B0);
        this.e0.addView(this.B0, i7.f6.e(56, 56, 53));
        z zVar = new z(activity);
        this.C0 = zVar;
        zVar.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.C0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        if (this.v0 == null) {
            i11 = 6;
            this.v0 = (t) t.a().get(6);
        } else {
            i11 = 6;
        }
        this.C0.setOnClickListener(new i9(this, i11));
        this.C0.a(new u(this.v0, false), false);
        this.C0.setSelected(false);
        this.C0.setVisibility(0);
        this.C0.setAlpha(1.0f);
        this.s.a(this.C0);
        this.e0.addView(this.C0, i7.f6.e(56, 56, 53));
        rb rbVar2 = new rb(activity);
        this.D0 = rbVar2;
        rbVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.D0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.D0.a(new u(new t("../../.."), true), false);
        this.D0.setVisibility(8);
        this.D0.setAlpha(0.0f);
        this.D0.setOnClickListener(new i9(this, 7));
        this.s.a(this.D0);
        this.e0.addView(this.D0, i7.f6.e(56, 56, 53));
        y yVar = new y(activity, this.s);
        this.E0 = yVar;
        yVar.a.u0(6);
        this.E0.setSelected((t) null);
        this.E0.setOnLayoutClick(new h9(this, i15));
        this.e0.addView(this.E0, i7.f6.e(-1, 56, 53));
        t3 t3Var2 = new t3(activity, 1);
        t3Var2.m(1.0f, -20.0f);
        t3Var2.d = 5000L;
        t3Var2.i();
        t3Var2.t(LocaleController.getString(R.string.StoryCameraDualHint));
        t3Var2.h0 = new ag.o0(22);
        this.h1 = t3Var2;
        t3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.e0.addView(this.h1, i7.f6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        t3 t3Var3 = new t3(activity, 2);
        t3Var3.m(0.0f, 28.0f);
        t3Var3.d = 5000L;
        t3Var3.q(true);
        this.i1 = t3Var3;
        this.e0.addView(t3Var3, i7.f6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        t3 t3Var4 = new t3(activity, 1);
        t3Var4.m(1.0f, -20.0f);
        t3Var4.d = 5000L;
        t3Var4.t(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.j1 = t3Var4;
        t3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.e0.addView(this.j1, i7.f6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        vb vbVar = new vb(activity);
        Paint paint = new Paint(1);
        vbVar.a = paint;
        Paint paint2 = new Paint(1);
        vbVar.b = paint2;
        vbVar.e = new org.telegram.ui.Components.d6(vbVar, 0L, 250L, jrVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        vbVar.c = n6Var;
        n6Var.k(0.3f, 250L, jrVar);
        n6Var.t(AndroidUtilities.dp(13.0f));
        n6Var.r(-1);
        n6Var.u(AndroidUtilities.bold());
        n6Var.setCallback(vbVar);
        n6Var.b = 1;
        vbVar.a(0L, false);
        this.F0 = vbVar;
        i0(false, false);
        this.e0.addView(this.F0, i7.f6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.F0);
        MediaController.loadGalleryPhotosAlbums(0);
        o6 o6Var = new o6(activity);
        this.K0 = o6Var;
        o6Var.setDelegate(caVar);
        o6 o6Var2 = this.K0;
        boolean z10 = this.K1 == 1;
        o6Var2.j0 = -1.0f;
        o6Var2.k0 = z10;
        o6Var2.invalidate();
        this.g0.addView(this.K0, i7.f6.e(-1, 100, 87));
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
        this.g0.addView(this.L0, i7.f6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.L0.setOnClickListener(new i9(this, 8));
        t3 t3Var5 = new t3(activity, 3);
        t3Var5.q(true);
        t3Var5.t(LocaleController.getString(R.string.StoryCameraHint2));
        t3Var5.h = AndroidUtilities.dp(320.0f);
        t3Var5.d = 5000L;
        t3Var5.G = Layout.Alignment.ALIGN_CENTER;
        this.S0 = t3Var5;
        this.g0.addView(t3Var5, i7.f6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        u81 u81Var = new u81(activity);
        this.R0 = u81Var;
        u81Var.I = false;
        u81Var.setAlpha(0.0f);
        this.g0.addView(this.R0, i7.f6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.R0.setDelegate(new p9(this, 4));
        u81 u81Var2 = this.R0;
        this.P1 = 0.0f;
        u81Var2.b(0.0f, false);
        int i19 = 12;
        y6 y6Var = new y6(activity, i10, new g9(this, i19));
        this.z0 = y6Var;
        y6Var.c = new h9(this, 9);
        this.g0.addView(y6Var, i7.f6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        z9 z9Var = new z9(this, activity);
        this.M0 = z9Var;
        int i20 = 10;
        z9Var.setOnSwitchModeListener(new h9(this, i20));
        int i21 = 11;
        this.M0.setOnSwitchingModeListener(new h9(this, i21));
        this.i0.addView(this.M0, i7.f6.e(-1, 48, 55));
        this.s.a(this.M0);
        n2 n2Var4 = new n2(activity);
        this.N0 = n2Var4;
        n2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.N0.setImageResource(R.drawable.stream_flip);
        this.N0.setScaleType(scaleType);
        this.N0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.i0.addView(this.N0, i7.f6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.N0);
        this.N0.setOnClickListener(new i9(this, 9));
        n2 n2Var5 = new n2(activity);
        this.O0 = n2Var5;
        n2Var5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.O0.setImageResource(R.drawable.stream_settings);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.i0.addView(this.O0, i7.f6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.O0);
        this.O0.setOnClickListener(new i9(this, i20));
        s3 s3Var = new s3(activity);
        this.P0 = s3Var;
        this.i0.addView(s3Var, i7.f6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.P0);
        s3 s3Var2 = new s3(activity);
        this.Q0 = s3Var2;
        s3Var2.a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        s3Var2.invalidate();
        this.Q0.setAlpha(0.0f);
        this.i0.addView(this.Q0, i7.f6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.Q0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.q1 = dVar2;
        dVar2.setVisibility(8);
        this.q1.setAlpha(0.0f);
        this.q1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.q1.setOnClickListener(new i9(this, i21));
        this.i0.addView(this.q1, i7.f6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        w5 w5Var = new w5(activity);
        w5Var.b = new ArrayList();
        w5Var.e = true;
        w5Var.h = true;
        View view = new View(activity);
        w5Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        w5Var.addView(view, i7.f6.e(-1, -1, 119));
        w5Var.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        w5Var.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        w5Var.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        w5Var.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        w5Var.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        w5Var.d = string;
        w5Var.e = true;
        v5 v5Var = new v5(w5Var, activity, string, true);
        w5Var.c = v5Var;
        v5Var.setContentDescription(LocaleController.getString(R.string.Send));
        w5Var.addView(w5Var.c, i7.f6.c(-2.0f, -2));
        w5Var.e();
        this.X0 = w5Var;
        w5Var.setVisibility(8);
        this.X0.setOnClickListener(new h9(this, i19));
        this.i0.addView(this.X0, i7.f6.e(-1, 52, 23));
        tb tbVar = new tb(activity);
        this.l1 = tbVar;
        tbVar.setAlpha(0.0f);
        this.l1.setVisibility(8);
        this.d0.addView(this.l1, i7.f6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        x5 x5Var = new x5(activity, i10, bVar);
        this.k1 = x5Var;
        this.d0.addView(x5Var, i7.f6.e(-1, -1, 119));
        m0(false);
    }

    public static gb E(Activity activity, int i10) {
        gb gbVar = B2;
        if (gbVar != null && (gbVar.b != activity || gbVar.c != i10)) {
            gbVar.q(false);
            B2 = null;
        }
        if (B2 == null) {
            B2 = new gb(activity, i10);
        }
        return B2;
    }

    public static void a(gb gbVar) {
        ka kaVar = gbVar.x0;
        if (kaVar == null || kaVar.getTextureView() == null) {
            gbVar.Y1 = false;
            return;
        }
        Bitmap bitmap = gbVar.x0.getTextureView().getBitmap();
        if (bitmap == null) {
            gbVar.Y1 = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float f9 = 0.0f;
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = 0;
            while (i11 < 10) {
                i11++;
                f9 += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i10 + 1) * width, i11 * height));
            }
        }
        float f10 = f9 / 100.0f;
        bitmap.recycle();
        gbVar.Y1 = f10 < 0.22f;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(gb gbVar) {
        Activity activity = gbVar.b;
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

    public static void c(gb gbVar) {
        ValueAnimator valueAnimator = gbVar.f2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            gbVar.f2 = null;
        }
        int i10 = 0;
        gbVar.g2 = false;
        ya yaVar = gbVar.r;
        float f9 = yaVar.a;
        float f10 = yaVar.b;
        yaVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        gbVar.f2 = ofFloat;
        ofFloat.addUpdateListener(new v9(gbVar, f9, f10, i10));
        gbVar.f2.setDuration(340L);
        gbVar.f2.setInterpolator(jr.h);
        gbVar.f2.addListener(new fa(gbVar, i10));
        gbVar.f2.start();
    }

    public static boolean d(gb gbVar) {
        Activity activity = gbVar.b;
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
        spannableString.setSpan(new oa(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        gb gbVar = B2;
        if (gbVar != null) {
            gbVar.q(false);
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
        o7 o7Var = this.G1;
        if (o7Var != null) {
            return o7Var.r();
        }
        return 1;
    }

    public final String C() {
        ka kaVar = this.x0;
        if (kaVar == null || kaVar.getCameraSession() == null) {
            return null;
        }
        if (!this.x0.isFrontface() || this.x0.getCameraSession().hasFlashModes()) {
            return this.x0.getCameraSession().getCurrentFlashMode();
        }
        p();
        return (String) this.q2.get(this.p2);
    }

    public final v0 D() {
        if (this.J0 == null) {
            v0 v0Var = new v0(this.b);
            this.J0 = v0Var;
            this.g0.addView(v0Var, i7.f6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.J0;
    }

    public final String F() {
        ka kaVar = this.x0;
        if (kaVar == null || kaVar.getCameraSession() == null) {
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
            xi0 xi0Var = new xi0(R.raw.sun_outline, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d1 = xi0Var;
            xi0Var.h = true;
            o7 o7Var = this.G1;
            if (o7Var == null || !o7Var.y0) {
                xi0Var.N(0);
                this.d1.K(0);
            } else {
                xi0Var.K(35);
                this.d1.N(36);
            }
            this.d1.W = true;
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J9, this.a);
            this.d1.O(v02, "Sunny");
            this.d1.O(v02, "Path 6");
            this.d1.O(v02, "Path");
            this.d1.O(v02, "Path 5");
            this.d1.m();
            ImageView imageView = new ImageView(this.b);
            this.e1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.e1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.e1.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
            this.e1.setOnClickListener(new i9(this, 0));
            this.e1.setVisibility(8);
            this.e1.setImageDrawable(this.d1);
            this.e1.setAlpha(0.0f);
            this.f0.addView(this.e1, 0, i7.f6.q(46, 56, 53));
        }
        return this.e1;
    }

    public final void H() {
        ja jaVar = this.r1;
        if (jaVar == null) {
            return;
        }
        this.r2 = null;
        jaVar.getTopLayout().setAlpha(0.0f);
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
        ga gaVar;
        if (this.S || (gaVar = this.I0) == null) {
            return false;
        }
        return gaVar.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
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
        o7 o7Var;
        o7 o7Var2;
        d dVar;
        org.telegram.ui.ActionBar.h5 h5Var;
        int i11;
        int i12;
        float dp;
        ImageView imageView;
        o7 o7Var3;
        o7 o7Var4;
        o7 o7Var5;
        o7 o7Var6;
        ka kaVar;
        int i13 = this.b0;
        if (i10 == i13) {
            return;
        }
        this.b0 = i10;
        AnimatorSet animatorSet = this.e2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        O(i13, i10);
        w5 w5Var = this.X0;
        if (w5Var != null) {
            w5Var.b(i10 == 1, z10);
        }
        y yVar = this.E0;
        i0(i10 == 0 && this.K1 == 1 && !yVar.e && !I(), z10);
        if (i10 != 1) {
            this.W0.a(z10);
        }
        c0(this.j0, !yVar.e, z10);
        c0(this.A0, (this.W1 || i10 != 0 || yVar.e || this.U1 == null || I()) ? false : true, z10);
        boolean z11 = this.W1;
        ua uaVar = this.w0;
        c0(this.B0, (z11 || i10 != 0 || (kaVar = this.x0) == null || !kaVar.a || yVar.e || uaVar.j()) ? false : true, true);
        c0(this.C0, (this.W1 || i10 != 0 || yVar.e) ? false : true, z10);
        m0(z10);
        u0 u0Var = this.a1;
        cg.i0 i0Var = this.f1;
        aj0 aj0Var = this.c1;
        qb qbVar = this.p1;
        qb qbVar2 = this.V0;
        d dVar2 = this.q1;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.l0;
        wa waVar = this.Y0;
        s3 s3Var = this.Q0;
        s3 s3Var2 = this.P0;
        y6 y6Var = this.z0;
        va vaVar = this.T0;
        bg.x2 x2Var = this.h0;
        z9 z9Var = this.M0;
        o6 o6Var = this.K0;
        if (!z10) {
            ka kaVar2 = this.x0;
            if (kaVar2 != null) {
                kaVar2.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            }
            vaVar.setAlpha(((i10 != 1 || uaVar.j()) && i10 != 2) ? 0.0f : 1.0f);
            uaVar.setAlpha((i10 == 0 || (i10 == 1 && uaVar.j())) ? 1.0f : 0.0f);
            o6Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            o6Var.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            y6Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            z9Var.setAlpha((i10 != 0 || I()) ? 0.0f : 1.0f);
            z9Var.setTranslationY((i10 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            s3Var2.setAlpha((i10 == 0 && this.W1 && !I()) ? 1.0f : 0.0f);
            s3Var.setAlpha((i10 == 0 && !this.W1 && I()) ? 0.6f : 0.0f);
            x2Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
            x2Var.setTranslationY((i10 == 1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            waVar.setAlpha(i10 == 2 ? 0.0f : 1.0f);
            aj0Var.setAlpha((i10 == 1 && this.K1 == 1) ? 1.0f : 0.0f);
            i0Var.setAlpha((i10 != 1 || (this.K1 != 1 && ((o7Var2 = this.G1) == null || TextUtils.isEmpty(o7Var2.y)))) ? 0.0f : 1.0f);
            int i14 = 1;
            u0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.e1;
            if (imageView2 != null) {
                imageView2.setAlpha((i10 == 1 && (o7Var = this.G1) != null && o7Var.u) ? 1.0f : 0.0f);
                i14 = 1;
            }
            qbVar2.setAlpha(i10 == i14 ? 1.0f : 0.0f);
            qbVar.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            h5Var2.setAlpha((i10 == i14 || i10 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            N(i13, i10);
            return;
        }
        this.e2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ka kaVar3 = this.x0;
        if (kaVar3 != null) {
            dVar = dVar2;
            h5Var = h5Var2;
            i11 = 1;
            arrayList.add(ObjectAnimator.ofFloat(kaVar3, (Property<ka, Float>) View.ALPHA, i10 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            h5Var = h5Var2;
            i11 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i11];
        fArr[0] = ((i10 != i11 || uaVar.j()) && i10 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(vaVar, (Property<va, Float>) property, fArr));
        float[] fArr2 = new float[i11];
        fArr2[0] = (i10 == 0 || (i10 == i11 && uaVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(uaVar, (Property<ua, Float>) property, fArr2));
        float[] fArr3 = new float[i11];
        fArr3[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(o6Var, (Property<o6, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i11];
        fArr4[0] = i10 == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(o6Var, (Property<o6, Float>) property2, fArr4));
        float[] fArr5 = new float[i11];
        fArr5[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(y6Var, (Property<y6, Float>) property, fArr5));
        float[] fArr6 = new float[i11];
        fArr6[0] = (i10 != 0 || I()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(z9Var, (Property<z9, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(z9Var, (Property<z9, Float>) property2, (i10 != 0 || I()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(s3Var2, (Property<s3, Float>) property, (i10 == 0 && this.W1 && !I()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(s3Var, (Property<s3, Float>) property, (i10 == 0 && !this.W1 && I()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(x2Var, (Property<bg.x2, Float>) property, ((i10 == 1 && ((o7Var6 = this.G1) == null || o7Var6.J0 == 0)) || i10 == 2) ? 1.0f : 0.0f));
        if (i10 == 1 && ((o7Var5 = this.G1) == null || o7Var5.J0 == 0)) {
            i12 = 2;
        } else {
            i12 = 2;
            if (i10 != 2) {
                dp = AndroidUtilities.dp(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(x2Var, (Property<bg.x2, Float>) property2, dp));
                arrayList.add(ObjectAnimator.ofFloat(waVar, (Property<wa, Float>) property, i10 != i12 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(qbVar2, (Property<qb, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(qbVar, (Property<qb, Float>) property, i10 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property, (i10 == 1 || this.K1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property, (i10 == 1 || (this.K1 != 1 && ((o7Var4 = this.G1) == null || TextUtils.isEmpty(o7Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                imageView = this.e1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 && (o7Var3 = this.G1) != null && o7Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<u81, Float>) property, 0.0f));
                this.e2.playTogether(arrayList);
                this.e2.addListener(new ea(this, i13, i10, 0));
                this.e2.setDuration(460L);
                this.e2.setInterpolator(jr.h);
                this.e2.start();
            }
        }
        dp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(x2Var, (Property<bg.x2, Float>) property2, dp));
        arrayList.add(ObjectAnimator.ofFloat(waVar, (Property<wa, Float>) property, i10 != i12 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(qbVar2, (Property<qb, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(qbVar, (Property<qb, Float>) property, i10 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property, (i10 == 1 || this.K1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property, (i10 == 1 || (this.K1 != 1 && ((o7Var4 = this.G1) == null || TextUtils.isEmpty(o7Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        imageView = this.e1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<u81, Float>) property, 0.0f));
        this.e2.playTogether(arrayList);
        this.e2.addListener(new ea(this, i13, i10, 0));
        this.e2.setDuration(460L);
        this.e2.setInterpolator(jr.h);
        this.e2.start();
    }

    public final void L(Runnable runnable, long j10) {
        if (this.O1 || this.G1 == null) {
            return;
        }
        m9 m9Var = this.c2;
        if (m9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m9Var);
        }
        this.d2 = true;
        this.O1 = true;
        this.c2 = new m9(this, runnable, 1);
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
        o7 o7Var;
        o7 o7Var2;
        o7 o7Var3;
        ja jaVar;
        o7 o7Var4;
        ja jaVar2;
        ja jaVar3;
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            wa waVar = this.Y0;
            if (waVar != null && waVar.K1) {
                waVar.J1 = false;
                waVar.z(false, false);
                return false;
            }
            if (this.M1) {
                o6 o6Var = this.K0;
                if (o6Var.n0) {
                    o6Var.n0 = false;
                    o6Var.r0 = SystemClock.elapsedRealtime();
                    o6Var.q0 = true;
                    ((ca) o6Var.a).d(false);
                    o6Var.F.c(false);
                    o6Var.G.c(false);
                    o6Var.H.c(false);
                    o6Var.invalidate();
                    return false;
                }
            } else if (!this.L1 && !waVar.p()) {
                y9 y9Var = this.Z0;
                if (y9Var.I) {
                    y9Var.c(false, true);
                    return false;
                }
                ga gaVar = this.I0;
                if (gaVar != null) {
                    org.telegram.ui.ActionBar.w0 w0Var = gaVar.C;
                    if (w0Var == null || !w0Var.s()) {
                        f(false);
                        this.i2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    if (gaVar.v.c()) {
                        AndroidUtilities.hideKeyboard(searchField);
                        return false;
                    }
                    gaVar.x.v(w0Var.L(true));
                    return false;
                }
                if (this.c0 != 0 || (jaVar3 = this.r1) == null || !jaVar3.y0()) {
                    if (this.c0 > -1) {
                        l0(-1, false, true);
                        return false;
                    }
                    if (this.b0 == 0) {
                        ArrayList arrayList = this.w0.h;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            if (((d0) obj).n != null) {
                                this.w0.e();
                                m0(true);
                                return false;
                            }
                        }
                    }
                    if (this.b0 == 1 && (((o7Var2 = this.G1) == null || (!o7Var2.n && !o7Var2.u)) && !this.q0)) {
                        if (o7Var2 != null && o7Var2.g && ((jaVar2 = this.r1) == null || !jaVar2.u0())) {
                            o7 o7Var5 = this.G1;
                            if (!o7Var5.j) {
                            }
                        }
                        ja jaVar4 = this.r1;
                        if (jaVar4 == null || !jaVar4.y0()) {
                            if (this.r0 == 0 && (((this.H1 && !this.w0.j() && (((jaVar = this.r1) == null || !jaVar.u0()) && ((o7Var4 = this.G1) == null || o7Var4.Z0 == null))) || !this.X0.h) && (((o7Var3 = this.G1) == null || !o7Var3.g || (!o7Var3.n && !o7Var3.u)) && !this.q0 && (o7Var3 == null || !o7Var3.o)))) {
                                K(0, true);
                                return false;
                            }
                            if (this.r0 != 0) {
                                q(true);
                                return false;
                            }
                            Activity activity = this.b;
                            lh.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardChanges);
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                            o7 o7Var6 = this.G1;
                            if (o7Var6 != null && !o7Var6.g && !o7Var6.o) {
                                alertDialog$Builder.i(LocaleController.getString(o7Var6.c ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new p9(this, 8));
                            }
                            o7 o7Var7 = this.G1;
                            alertDialog$Builder.k(LocaleController.getString((o7Var7 == null || !o7Var7.c || o7Var7.g) ? R.string.Discard : R.string.StoryDeleteDraft), new p9(this, 9));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.show();
                            View d = c2Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.g6.q7;
                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, bVar));
                                d.setBackground(org.telegram.ui.ActionBar.g6.Y(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i11, bVar), 51), 6, 6));
                            }
                        }
                    }
                    if (this.b0 != 2 || (o7Var = this.G1) == null || o7Var.b0) {
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
            this.K0.setVisibility(8);
            this.R0.setVisibility(8);
            this.M0.setVisibility(8);
            h(false, false);
            d0(false);
        }
        if (i10 == 2) {
            this.p1.setVisibility(8);
            this.h0.setVisibility(i11 == 1 ? 0 : 8);
            this.Y0.setVisibility(8);
            this.q1.setVisibility(8);
        }
        if (i10 == 1) {
            this.X0.setVisibility(8);
            this.h0.setVisibility(i11 == 2 ? 0 : 8);
            this.c1.setVisibility(8);
            this.f1.setVisibility(8);
            this.a1.setVisibility(8);
            ImageView imageView = this.e1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.T0.setVisibility(i11 == 2 ? 0 : 8);
            this.V0.setVisibility(8);
            if (i11 != 2) {
                z();
                y();
            }
            this.l0.setVisibility(i11 == 2 ? 0 : 8);
            w();
            this.l1.setAlpha(0.0f);
            this.l1.setVisibility(8);
            this.W0.setVisibility(8);
            this.D1 = null;
            this.E1 = null;
            this.F1 = null;
        }
        if (i11 == 1) {
            o7 o7Var = this.G1;
            if (o7Var == null || !o7Var.n) {
                u();
                H();
            }
            cf0 cf0Var = this.y1;
            if (cf0Var != null) {
                cf0Var.setAllowTouch(false);
            }
            this.T0.x(2, false);
            this.T0.x(3, false);
            this.T0.x(4, false);
            this.T0.x(5, false);
            this.T0.x(7, false);
            o7 o7Var2 = this.G1;
            this.W0.setVisibility((o7Var2 == null || o7Var2.h0 < 30000) ? 8 : 0);
            this.h0.setAlpha(1.0f);
            this.h0.setTranslationY(0.0f);
            o7 o7Var3 = this.G1;
            this.Y0.setVisibility((o7Var3 == null || o7Var3.J0 == 0) ? 0 : 8);
        }
        if (i11 == 0 && this.R1) {
            D().setVisibility(0);
            v0 D = D();
            D.r.d(0.0f, true);
            D.a(true);
            lh.m5 m5Var = D.h;
            if (m5Var != null) {
                AndroidUtilities.cancelRunOnUIThread(m5Var);
            }
            lh.m5 m5Var2 = new lh.m5(D, 20);
            D.h = m5Var2;
            AndroidUtilities.runOnUIThread(m5Var2, 3500L);
            this.K0.h();
        }
        this.R1 = false;
        cf0 cf0Var2 = this.y1;
        if (cf0Var2 != null) {
            cf0Var2.setAllowTouch(i11 == 1 && ((i12 = this.c0) == -1 || i12 == 1));
        }
        wa waVar = this.Y0;
        if (waVar != null) {
            waVar.a0 = i11 != 1;
        }
        if (i11 == 1) {
            int i13 = this.c;
            MediaDataController.getInstance(i13).checkStickers(0);
            MediaDataController.getInstance(i13).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i13).loadRecents(2, false, true, false);
            lh.s6 storiesController = MessagesController.getInstance(i13).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i13).getStoriesController().R();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i10, int i11) {
        long j10;
        SpannableStringBuilder append;
        o7 o7Var;
        o7 o7Var2;
        boolean z10;
        o7 o7Var3;
        o7 o7Var4;
        o7 o7Var5;
        l61 textureView;
        o7 o7Var6;
        boolean z11 = true;
        if (i11 == 0) {
            Z(false);
            this.K0.setVisibility(0);
            o6 o6Var = this.K0;
            if (o6Var != null) {
                o6Var.g(false);
            }
            this.M0.setVisibility(0);
            this.R0.setVisibility(0);
            this.R0.setAlpha(0.0f);
            this.F0.a(0L, true);
            o7 o7Var7 = this.G1;
            if (o7Var7 != null) {
                o7Var7.i(false);
                this.G1 = null;
            }
            ua uaVar = this.w0;
            if (uaVar != null) {
                uaVar.e();
                this.K0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new g9(this, 18));
            v0 v0Var = this.J0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.S0.e(true);
            t3 t3Var = this.h1;
            if (t3Var != null) {
                t3Var.e(true);
            }
        }
        int i12 = this.c;
        if (i11 == 1 || i10 == 1) {
            this.a1.setEntry(i11 == 1 ? this.G1 : null);
            if (this.K1 == 1) {
                this.c1.setVisibility(0);
                o7 o7Var8 = this.G1;
                f0(o7Var8 != null && o7Var8.Y, false);
                this.f1.setVisibility(0);
                this.T0.x(-9982, false);
                ((cg0) this.f1.c).a(this.T0.k(), false);
                this.l0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                o7 o7Var9 = this.G1;
                if (o7Var9 == null || TextUtils.isEmpty(o7Var9.y)) {
                    this.l0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.c1.setVisibility(8);
                    this.f1.setVisibility(0);
                    ((cg0) this.f1.c).a(true, false);
                    this.l0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.a1.setVisibility(0);
            o7 o7Var10 = this.G1;
            if (o7Var10 == null || !o7Var10.u) {
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
            o7 o7Var11 = this.G1;
            this.Y0.setVisibility(((o7Var11 == null || o7Var11.J0 == 0) && this.r0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U0.getLayoutParams();
            o7 o7Var12 = this.G1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((o7Var12 == null || o7Var12.J0 == 0) && this.r0 == 0) ? 68.0f : 12.0f);
            this.U0.setLayoutParams(layoutParams);
            this.h0.setVisibility(0);
            this.h0.clearFocus();
            o7 o7Var13 = this.G1;
            this.Y0.A(o7Var13 == null ? 86400 : o7Var13.I0, false);
            this.Y0.setPeriodVisible(!MessagesController.getInstance(i12).premiumFeaturesBlocked() && ((o7Var = this.G1) == null || !o7Var.g));
            o7 o7Var14 = this.G1;
            this.Y0.setHasRoundVideo((o7Var14 == null || o7Var14.o0 == null) ? false : true);
            wa waVar = this.Y0;
            if (waVar == null) {
                j10 = 0;
            } else {
                o7 o7Var15 = this.G1;
                if (o7Var15 == null || !o7Var15.n) {
                    j10 = 0;
                    waVar.v(null, null);
                } else {
                    TLRPC.Peer peer = o7Var15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i12).getUser(Long.valueOf(peer.user_id)));
                        o7 o7Var16 = this.G1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        o7Var16.p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        o7 o7Var17 = this.G1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        o7Var17.p = append;
                    }
                    String str2 = this.G1.s;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    String str3 = str2;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new da(), 0, spannableString.length(), 33);
                        str3 = spannableString;
                    }
                    this.Y0.v(str3, append);
                }
            }
            o7 o7Var18 = this.G1;
            boolean z12 = (o7Var18 != null && o7Var18.v() && this.G1.t()) ? false : true;
            qb qbVar = this.V0;
            boolean z13 = qbVar.f0;
            qbVar.f0 = z12;
            qbVar.e0.f(z12, true);
            qbVar.invalidate();
        } else {
            j10 = 0;
        }
        if (i11 == 2 || i10 == 2) {
            this.l0.setVisibility(0);
            this.p1.setVisibility(0);
            o7 o7Var19 = this.G1;
            if (o7Var19 != null && o7Var19.b0) {
                this.l0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.h0.setVisibility(0);
            this.q1.setVisibility(0);
        }
        if (i11 == 2) {
            this.l0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.J1 = false;
            o7 o7Var20 = this.G1;
            boolean z14 = (o7Var20 == null || o7Var20.J0 == j10) ? false : true;
            boolean z15 = o7Var20 != null && o7Var20.g;
            String string = LocaleController.getString(z15 ? R.string.Done : z14 ? R.string.UploadBotPreview : R.string.Next);
            boolean z16 = !z14;
            w5 w5Var = this.X0;
            if (!TextUtils.equals(string, w5Var.d) || z16 != w5Var.e) {
                w5Var.removeView(w5Var.c);
                Context context = w5Var.getContext();
                w5Var.d = string;
                w5Var.e = z16;
                v5 v5Var = new v5(w5Var, context, string, z16);
                w5Var.c = v5Var;
                v5Var.setContentDescription(string);
                w5Var.addView(w5Var.c, i7.f6.c(-2.0f, -2));
                w5Var.e();
            }
            this.p1.setVisibility(8);
            this.q1.setVisibility(8);
            if (!this.d2) {
                o7 o7Var21 = this.G1;
                if (o7Var21 == null || !o7Var21.u) {
                    this.T0.set(o7Var21);
                } else {
                    this.T0.l(o7Var21);
                }
            }
            this.d2 = false;
            this.Y0.f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i12).storyEntitiesAllowed() ? null : new g9(this, 19));
            this.Z0.setVisibility(this.D1 == null ? 8 : 0);
            ArrayList arrayList = this.D1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.F1;
                ArrayList arrayList3 = this.E1;
                y9 y9Var = this.Z0;
                y9Var.c(false, false);
                y9Var.c = arrayList;
                y9Var.d = arrayList2;
                y9Var.e = arrayList3;
                y9Var.w = new zz0(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                y9Var.G = new zz0(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                y9Var.b.U2.N(false);
                this.Z0.setSelected(this.D1.indexOf(this.G1));
            }
            this.V0.setMaxCount((z14 || z15 || this.D1 != null || ((o7Var6 = this.G1) != null && (o7Var6.v() || !this.G1.K))) ? 1 : 3);
            if (i10 != 2) {
                o7 o7Var22 = this.G1;
                if (o7Var22 != null && (o7Var22.c || o7Var22.g || this.q0)) {
                    if (o7Var22.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    o7 o7Var23 = this.G1;
                    if (o7Var23.K && o7Var23.a1 != null && (textureView = this.T0.getTextureView()) != null) {
                        textureView.setDelegate(new p9(this, 7));
                    }
                    this.Y0.setText(this.G1.C0);
                } else if (i10 != 2) {
                    wa waVar2 = this.Y0;
                    waVar2.R = true;
                    waVar2.f.setText("");
                }
            }
            o7 o7Var24 = this.G1;
            this.X0.d(4, o7Var24 == null || ((!o7Var24.u || o7Var24.K) && !o7Var24.v()));
            this.X0.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (o7Var5 = this.G1) == null || o7Var5.u || o7Var5.v()) ? false : true);
            if (!this.J1 && !this.Y0.o()) {
                lh.s6 storiesController = MessagesController.getInstance(i12).getStoriesController();
                int B = B();
                lh.m6 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.a, B) || ((o7Var4 = this.G1) != null && (o7Var4.g || o7Var4.J0 != j10))) {
                    z10 = true;
                    this.X0.setShareEnabled(z10);
                    o7 o7Var25 = this.G1;
                    this.c1.setImageResource((o7Var25 == null && o7Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    this.T0.setVisibility(0);
                    this.V0.setVisibility(0);
                    this.l0.setVisibility(0);
                    this.l0.setTranslationX(0.0f);
                    o7Var3 = this.G1;
                    if (o7Var3 == null && o7Var3.J0 != j10) {
                        this.l0.l("", false);
                    } else if (o7Var3 == null && o7Var3.g) {
                        this.l0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (o7Var3 == null && o7Var3.u) {
                        this.l0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (o7Var3 == null && o7Var3.n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this.l0, 32.0f, i12);
                        this.l0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(g5Var, 0, 1, 33);
                        if (this.G1.q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(this.G1.q.user_id));
                            g5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.G1.q)));
                            g5Var.b(chat2);
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
            o7 o7Var252 = this.G1;
            this.c1.setImageResource((o7Var252 == null && o7Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            this.T0.setVisibility(0);
            this.V0.setVisibility(0);
            this.l0.setVisibility(0);
            this.l0.setTranslationX(0.0f);
            o7Var3 = this.G1;
            if (o7Var3 == null) {
            }
            if (o7Var3 == null) {
            }
            if (o7Var3 == null) {
            }
            if (o7Var3 == null) {
            }
            this.l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z11 = true;
        }
        if (i10 == z11) {
            wa waVar3 = this.Y0;
            j70 j70Var = waVar3.R0;
            if (j70Var != null) {
                j70Var.u();
                waVar3.R0 = null;
            }
            this.g1.e(z11);
            y9 y9Var2 = this.Z0;
            if (y9Var2.I) {
                y9Var2.c(false, z11);
            }
        }
        if (i11 == 2 && (o7Var2 = this.G1) != null) {
            if (o7Var2.e0 < j10) {
                o7Var2.e0 = j10;
            }
            this.I1 = o7Var2.e0;
            long duration = this.T0.getDuration() < 100 ? this.G1.h0 : this.T0.getDuration();
            o7 o7Var26 = this.G1;
            if (o7Var26.h0 <= 0) {
                o7Var26.h0 = duration;
            }
            File file = o7Var26.Z0;
            if (file == null) {
                file = o7Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            o7 o7Var27 = this.G1;
            this.p1.o(false, absolutePath, o7Var27.h0, o7Var27.P);
            o7 o7Var28 = this.G1;
            float f9 = duration;
            long j11 = (long) (o7Var28.Z * f9);
            long j12 = (long) (o7Var28.a0 * f9);
            qb qbVar2 = this.p1;
            qbVar2.V0 = j11;
            qbVar2.W0 = j12;
            lb lbVar = qbVar2.h;
            if (lbVar != null) {
                lb.a(lbVar, true);
            }
            t4 t4Var = new t4(this, 2);
            this.p1.setDelegate(new ha(t4Var));
            float max = (this.I1 / Math.max(1L, duration)) * 0.96f;
            this.p1.setVideoLeft(max);
            this.p1.setVideoRight(0.04f + max);
            t4Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        cf0 cf0Var = this.y1;
        if (cf0Var != null) {
            cf0Var.setAllowTouch(false);
        }
        t3 t3Var2 = this.i1;
        if (t3Var2 != null) {
            t3Var2.e(true);
        }
        mc.e();
        wa waVar4 = this.Y0;
        if (waVar4 != null) {
            g gVar = waVar4.f;
            gVar.d();
            gVar.k(true);
            this.Y0.a0 = true;
        }
        va vaVar = this.T0;
        if (vaVar != null) {
            vaVar.x(8, i11 != 1);
        }
        ja jaVar = this.r1;
        if (jaVar != null) {
            jaVar.setCoverPreview(i11 != 1);
        }
        t3 t3Var3 = this.j1;
        if (t3Var3 != null) {
            t3Var3.e(true);
        }
        ua uaVar2 = this.w0;
        uaVar2.setPreview(i11 == 1 && uaVar2.j());
    }

    public final void P() {
        ag.r1 r1Var;
        boolean z10 = false;
        if (this.b0 == 0) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.t2 = new g9(this, 3);
            }
        }
        wa waVar = this.Y0;
        if (waVar != null) {
            waVar.f.s();
        }
        o6 o6Var = this.K0;
        if (o6Var != null) {
            o6Var.h();
        }
        x5 x5Var = this.k1;
        if (x5Var != null) {
            lh.s6 storiesController = MessagesController.getInstance(x5Var.a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.i.f(UserConfig.getInstance(storiesController.a).clientUserId);
            x5Var.b = storiesController.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            x5Var.c.invalidate();
        }
        ja jaVar = this.r1;
        if (jaVar != null && (r1Var = jaVar.K0.d) != null) {
            r1Var.postRunnable(r1Var.w);
        }
        va vaVar = this.T0;
        if (vaVar != null) {
            vaVar.x(0, false);
        }
        a1 a1Var = MessagesController.getInstance(this.c).getStoriesController().w;
        if (a1Var.c || a1Var.d) {
            return;
        }
        a1Var.d = true;
        x0 x0Var = new x0(a1Var, 1);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.a);
        messagesStorage.getStorageQueue().postRunnable(new jh.r5(messagesStorage, z10, x0Var, 3));
    }

    public final void Q(int i10, int i11) {
        ja jaVar;
        ra raVar;
        sa saVar;
        ja jaVar2;
        if (i11 == 0) {
            this.j0.setVisibility(8);
        }
        if (i10 == 0 && (jaVar2 = this.r1) != null) {
            jaVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.Y0.setVisibility(8);
            this.c1.setVisibility(i11 == 2 ? 0 : 8);
            this.f1.setVisibility(i11 == 2 ? 0 : 8);
            this.a1.setVisibility(i11 == 2 ? 0 : 8);
            ImageView imageView = this.e1;
            if (imageView != null) {
                imageView.setVisibility(i11 == 2 ? 0 : 8);
            }
            this.V0.setVisibility(i11 == 2 ? 0 : 8);
            this.l0.setVisibility(8);
        }
        boolean z10 = true;
        this.T0.setAllowCropping(i11 == -1);
        if ((i11 == 0 || i10 == 0) && (jaVar = this.r1) != null) {
            jaVar.Z0.setLayerType(0, null);
        }
        cf0 cf0Var = this.y1;
        if (cf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            cf0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            ra raVar2 = this.n1;
            if (raVar2 != null) {
                raVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (raVar = this.n1) != null) {
            raVar.setVisibility(8);
            this.n1.setAppearProgress(0.0f);
            ra raVar3 = this.n1;
            raVar3.x = null;
            g0 g0Var = raVar3.f;
            g0Var.H = null;
            g0Var.d = null;
            g0Var.F = false;
            raVar3.d.setVisibility(8);
            raVar3.a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            sa saVar2 = this.o1;
            if (saVar2 != null) {
                saVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i10 != 4 || (saVar = this.o1) == null) {
            return;
        }
        saVar.setVisibility(8);
        this.o1.setAppearProgress(0.0f);
        sa saVar3 = this.o1;
        saVar3.b = null;
        g0 g0Var2 = saVar3.h;
        g0Var2.H = null;
        g0Var2.d = null;
        g0Var2.F = false;
        saVar3.e.setVisibility(8);
        saVar3.setVisibility(8);
    }

    public final void R(ab abVar) {
        lh.m6 o10;
        fb fbVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        int i11 = 0;
        this.q0 = false;
        this.e = false;
        this.x2 = false;
        this.o0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (fbVar = this.n) != null && fbVar.getParent() == null) {
            fb fbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, fbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.w0.setCameraThumb(A());
        if (this.r0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            h0(o10, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.D;
        if (abVar != null) {
            this.B = abVar;
            this.F = abVar.a;
            rectF.set(abVar.c);
            this.C = abVar.b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.r.c();
        int i12 = this.F;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.d0.setBackgroundColor(i11);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.b, 1);
        g(1.0f, true, new g9(this, 6));
        e();
        this.r0 = 0L;
        this.s0 = "";
    }

    public final void S(za zaVar, o7 o7Var, long j10) {
        fb fbVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        this.q0 = false;
        this.e = false;
        this.x2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (fbVar = this.n) != null && fbVar.getParent() == null) {
            fb fbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, fbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.G1 = o7Var;
        this.K1 = o7Var.K ? 1 : 0;
        this.o0.g = false;
        RectF rectF = this.D;
        if (zaVar != null) {
            this.B = zaVar;
            this.F = zaVar.a;
            rectF.set(zaVar.c);
            this.C = zaVar.b;
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
        o7 o7Var2 = this.G1;
        if (o7Var2 != null) {
            this.Y0.setText(o7Var2.C0);
        }
        L(new x9(this, 0), j10);
        K(this.G1.b0 ? 2 : 1, false);
        l0(-1, false, false);
        this.X0.b(false, false);
        e();
        this.r0 = 0L;
        this.s0 = "";
    }

    public final void T() {
        j70 j70Var;
        va vaVar = this.T0;
        if (vaVar != null) {
            vaVar.x(4, true);
        }
        wa waVar = this.Y0;
        if (waVar != null && (j70Var = waVar.R0) != null) {
            j70Var.u();
            waVar.R0 = null;
        }
        cg.p1 p1Var = new cg.p1((org.telegram.ui.ActionBar.o2) new la(this, 1), 14, false);
        p1Var.setOnDismissListener(new u9(this, 1));
        p1Var.show();
    }

    public final void U(za zaVar, o7 o7Var) {
        lh.m6 o10;
        fb fbVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        this.q0 = true;
        this.e = false;
        this.x2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (fbVar = this.n) != null && fbVar.getParent() == null) {
            fb fbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, fbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.G1 = o7Var;
        f9.a(i10, o7Var);
        o7 o7Var2 = this.G1;
        int i11 = (o7Var2 == null || !o7Var2.K) ? 0 : 1;
        this.K1 = i11;
        this.o0.g = o7Var2 != null && o7Var2.u && i11 == 1;
        if (this.r0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            h0(o10, true);
        }
        RectF rectF = this.D;
        if (zaVar != null) {
            this.B = zaVar;
            this.F = zaVar.a;
            rectF.set(zaVar.c);
            this.C = zaVar.b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.r.c();
        int i12 = this.F;
        this.d0.setBackgroundColor((i12 == 1 || i12 == 0) ? 0 : -14737633);
        this.r.setTranslationX(0.0f);
        this.r.setTranslationY(0.0f);
        this.r.b(0.0f);
        this.r.setScaleX(1.0f);
        this.r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.b, 1);
        o7 o7Var3 = this.G1;
        if (o7Var3 != null) {
            this.Y0.setText(o7Var3.C0);
        }
        this.X0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new g9(this, 6));
        e();
        this.r0 = 0L;
        this.s0 = "";
    }

    public final void V() {
        ag.t1 t1Var = this.s1;
        if (t1Var != null) {
            t1Var.bringToFront();
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
        tb tbVar = this.l1;
        if (tbVar != null) {
            tbVar.bringToFront();
        }
        cf0 cf0Var = this.y1;
        if (cf0Var != null) {
            cf0Var.bringToFront();
        }
        te0 te0Var = this.A1;
        if (te0Var != null) {
            te0Var.bringToFront();
        }
        ve0 ve0Var = this.B1;
        if (ve0Var != null) {
            ve0Var.bringToFront();
        }
        x5 x5Var = this.k1;
        if (x5Var != null) {
            x5Var.bringToFront();
        }
        p pVar = this.m1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void W(o7 o7Var, boolean z10) {
        o7 o7Var2;
        boolean z11;
        if (o7Var == null || this.T0.getWidth() <= 0 || this.T0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? o7Var.O0 : o7Var.N0;
        if (file != null) {
            file.delete();
        }
        View view = this.w0.j() ? this.w0 : this.T0;
        float f9 = z10 ? 0.33333334f : 1.0f;
        int width = (int) (view.getWidth() * f9);
        Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f9), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(f9, f9);
        AndroidUtilities.makingGlobalBlurBitmap = true;
        view.draw(canvas);
        AndroidUtilities.makingGlobalBlurBitmap = false;
        canvas.restore();
        Paint paint = new Paint(2);
        l61 textureView = this.T0.getTextureView();
        if (o7Var.K && !o7Var.u && textureView != null) {
            Bitmap bitmap = textureView.getBitmap();
            Matrix transform = textureView.getTransform(null);
            if (transform != null) {
                Matrix matrix = new Matrix(transform);
                matrix.postScale(f9, f9);
                transform = matrix;
            }
            canvas.drawBitmap(bitmap, transform, paint);
            bitmap.recycle();
        }
        File file2 = o7Var.Q0;
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
        File file3 = o7Var.P0;
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
        ja jaVar = this.r1;
        if (jaVar != null && jaVar.N0 != null) {
            canvas.save();
            canvas.scale(f9, f9);
            ja jaVar2 = this.r1;
            jaVar2.E0 = true;
            n5 n5Var = jaVar2.N0;
            n5Var.a = true;
            n5Var.draw(canvas);
            ja jaVar3 = this.r1;
            jaVar3.N0.a = false;
            jaVar3.E0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = o7.w(this.c, "jpg");
        if (z10) {
            o7Var2 = o7Var;
            z11 = z10;
            Utilities.searchQueue.postRunnable(new eg.j(this, createBitmap, z11, w10, o7Var2, 2));
        } else {
            o7Var2 = o7Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        if (!z11) {
            o7Var2.N0 = w10;
        }
        o7Var2.b1 = createScaledBitmap;
    }

    public final void X() {
        lh.m6 o10;
        char c3;
        e9 e9Var = this.m0;
        BitmapDrawable bitmapDrawable = null;
        if (e9Var != null) {
            e9Var.dismiss();
            this.m0 = null;
        }
        if (this.J1) {
            u0 u0Var = this.a1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            v5 v5Var = this.X0.c;
            int i10 = -this.Q1;
            this.Q1 = i10;
            AndroidUtilities.shakeViewSpring(v5Var, i10);
            return;
        }
        wa waVar = this.Y0;
        if (waVar != null && waVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.o6 o6Var = waVar.v;
            int i11 = -this.Q1;
            this.Q1 = i11;
            AndroidUtilities.shakeViewSpring(o6Var, i11);
            waVar.e();
            return;
        }
        o7 o7Var = this.G1;
        int i12 = this.c;
        int i13 = 0;
        if ((o7Var == null || (!o7Var.g && o7Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, B())) {
            h0(o10, false);
            return;
        }
        this.G1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        lh.b bVar = this.a;
        if (waVar != null && !this.G1.D0) {
            CharSequence text = waVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((i01[]) spannable.getSpans(0, text.length(), i01.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new tc(this.n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.g6.gc, 0, new g9(this, 27), bVar)).k(true);
                    int i14 = -this.Q1;
                    this.Q1 = i14;
                    AndroidUtilities.shakeViewSpring(waVar, i14);
                    return;
                }
            }
        }
        o7 o7Var2 = this.G1;
        if (o7Var2.g || o7Var2.J0 != 0) {
            o7Var2.l = false;
            i(null);
            p0();
            return;
        }
        if (this.J != 0) {
            o7Var2.v0 = MessagesController.getInstance(i12).getInputPeer(this.J);
        }
        va vaVar = this.T0;
        vaVar.x(3, true);
        e9 e9Var2 = new e9(this.b, this.G1.I0, bVar);
        e9Var2.q1(this.G1.E0);
        e9Var2.p1(this.G1.v0);
        e9Var2.B = this.I;
        e9Var2.Q = new h9(this, 14);
        e9Var2.e1(!this.w0.j());
        ArrayList arrayList = this.E1;
        e9Var2.m1(arrayList == null ? this.G1.r() : arrayList.size());
        e9Var2.k1(false);
        CharSequence text2 = waVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (d51 d51Var : (d51[]) ((Spanned) text2).getSpans(0, text2.length(), d51.class)) {
                if (d51Var != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(d51Var.getURL())));
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
            c3 = 1;
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
            c3 = 1;
        }
        e9Var2.O = arrayList2;
        e9Var2.S = new h9(this, 15);
        e9Var2.T = new h9(this, 16);
        e9Var2.P = new p9(this, 10);
        this.m0 = e9Var2;
        o7 o7Var3 = this.G1;
        if (o7Var3.K) {
            if (vaVar != null && !o7Var3.f0 && this.b0 != 2) {
                o7Var3.e0 = vaVar.getCurrentPosition();
                h9 h9Var = new h9(this, 17);
                ag.t1 t1Var = this.s1;
                View view = this.v1;
                View[] viewArr = new View[3];
                viewArr[0] = vaVar;
                viewArr[c3] = t1Var;
                viewArr[2] = view;
                vaVar.h(h9Var, viewArr);
            }
            e9 e9Var3 = this.m0;
            Bitmap bitmap = this.G1.g0;
            g9 g9Var = new g9(this, 20);
            if (bitmap != null) {
                e9Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            e9Var3.X = bitmapDrawable;
            e9Var3.Y = g9Var;
            g1 g1Var = e9Var3.b;
            if (g1Var != null) {
                for (View view2 : g1Var.getViewPages()) {
                    if (view2 instanceof y8) {
                        y8 y8Var = (y8) view2;
                        y8Var.g(false);
                        y8Var.e(false);
                    }
                }
            }
        }
        this.m0.setOnDismissListener(new u9(this, i13));
        this.m0.show();
    }

    public final void Y(bb bbVar) {
        int i10 = 0;
        RectF rectF = this.D;
        if (bbVar != null) {
            this.B = bbVar;
            this.F = bbVar.a;
            rectF.set(bbVar.c);
            this.C = bbVar.b;
        } else {
            this.B = null;
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        int i11 = this.F;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.d0.setBackgroundColor(i10);
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
                    jq jqVar = new jq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    jqVar.e = dp;
                    jqVar.f = dp2;
                    this.w0.setCameraThumb(jqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new p9(this, 13));
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
                CameraController.getInstance().initCamera(new g9(this, 0));
            }
        }
    }

    public final void b0(Runnable runnable) {
        ka kaVar = this.x0;
        if (kaVar == null || kaVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new l3.m(this, this.x0.getTextureView().getBitmap(), runnable, 18));
        } catch (Throwable unused) {
        }
    }

    public final void c0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new ia(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 3)).setDuration(320L).setInterpolator(jr.h).start();
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        lh.m6 o10;
        o7 o7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            o6 o6Var = this.K0;
            if (o6Var != null) {
                o6Var.h();
            }
            if (this.i2 == null || MediaController.allMediaAlbums == null) {
                return;
            }
            for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                int i13 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.i2;
                if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.i2 = albumEntry;
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesDraftsUpdated) {
            o6 o6Var2 = this.K0;
            if (o6Var2 == null || this.R1) {
                return;
            }
            o6Var2.h();
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.b0;
            int i15 = this.c;
            if (i14 != 1) {
                if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                    o7 o7Var2 = this.G1;
                    if (o7Var2 == null || o7Var2.J0 == 0) {
                        h0(o10, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.J1 && !this.Y0.o()) {
                lh.s6 storiesController = MessagesController.getInstance(i15).getStoriesController();
                int B = B();
                lh.m6 o11 = storiesController.o();
                if (o11 == null || !o11.a(storiesController.a, B) || ((o7Var = this.G1) != null && (o7Var.g || o7Var.J0 != 0))) {
                    z10 = true;
                }
            }
            this.X0.setShareEnabled(z10);
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
        this.A0.clearAnimation();
        ka kaVar = this.x0;
        if ((kaVar != null && kaVar.isDual()) || this.W1) {
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
                i10 = R.drawable.media_photo_flash_auto2;
                this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else {
            if (str.equals("on")) {
                i10 = R.drawable.media_photo_flash_on2;
                this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        rb rbVar = this.A0;
        if (rbVar.n != i10) {
            rbVar.n = i10;
            ValueAnimator valueAnimator = rbVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                rbVar.r = null;
            }
            rbVar.setDrawable(i10);
        }
        if (this.b0 == 0 && !this.E0.e && this.U1 != null && !I()) {
            z10 = true;
        }
        c0(this.A0, z10, true);
    }

    public final void f(boolean z10) {
        v0 v0Var;
        this.G0 = z10;
        Boolean bool = this.l2;
        if (bool == null || bool.booleanValue() != z10) {
            int i10 = 0;
            if (this.I0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.I0 == null) {
                    return;
                }
            }
            if (this.I0.Q) {
                this.m2 = new q9(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.j2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.j2 = null;
            }
            o1.k kVar = this.k2;
            if (kVar != null) {
                kVar.c();
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
            ga gaVar = this.I0;
            if (gaVar != null) {
                gaVar.G = false;
            }
            if (z10 && (v0Var = this.J0) != null) {
                v0Var.a(false);
            }
            ya yaVar = this.r;
            if (yaVar != null) {
                yaVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.I0.setImportantForAccessibility(z10 ? 0 : 4);
            this.l2 = Boolean.valueOf(z10);
            float translationY = this.I0.getTranslationY();
            fb fbVar = this.n;
            float height = z10 ? 0.0f : (fbVar.getHeight() - this.I0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            int i11 = 1;
            Math.max(1, fbVar.getHeight());
            ga gaVar2 = this.I0;
            gaVar2.G = !z10;
            this.g2 = this.f2 == null;
            if (z10) {
                o1.k kVar2 = new o1.k(gaVar2, o1.i.n, height);
                this.k2 = kVar2;
                kVar2.u.a(0.75f);
                this.k2.u.b(350.0f);
                this.k2.a(new r9(this, height, i10));
                this.k2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.j2 = ofFloat;
                ofFloat.addUpdateListener(new s9(this, i10));
                this.j2.addListener(new fa(this, i11));
                this.j2.setDuration(450L);
                this.j2.setInterpolator(jr.h);
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
            xi0 xi0Var = new xi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.b1 = xi0Var;
            xi0Var.B *= 1.5f;
        }
        this.c1.setAnimation(this.b1);
        if (!z11) {
            this.b1.L(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            xi0 xi0Var2 = this.b1;
            if (xi0Var2.X > 20) {
                xi0Var2.L(0, false, false);
            }
            this.b1.N(20);
            this.b1.start();
            return;
        }
        xi0 xi0Var3 = this.b1;
        int i10 = xi0Var3.X;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        xi0Var3.N(43);
        this.b1.start();
    }

    public final void g(float f9, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A = null;
        }
        ya yaVar = this.r;
        if (!z10) {
            this.H = null;
            this.E = f9;
            k();
            yaVar.invalidate();
            this.n.invalidate();
            runnable.run();
            o();
            return;
        }
        this.L.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.H = Float.valueOf(this.G);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f9);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new s9(this, 5));
        this.A.addListener(new jh.l5(this, f9, runnable, 3));
        if (f9 < 1.0f && this.v) {
            this.A.setDuration(250L);
            this.A.setInterpolator(jr.h);
        } else if (f9 > 0.0f || yaVar.a < AndroidUtilities.dp(20.0f)) {
            this.A.setDuration(300L);
            this.A.setInterpolator(new u1.a());
        } else if (f9 >= 0.0f || !this.K) {
            this.A.setDuration(400L);
            this.A.setInterpolator(jr.h);
        } else {
            this.A.setDuration(200L);
            this.A.setInterpolator(jr.h);
            this.K = false;
        }
        this.A.start();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 4));
        }
    }

    public final void h(boolean z10, boolean z11) {
        y yVar;
        if (z10) {
            t3 t3Var = this.h1;
            if (t3Var != null) {
                t3Var.e(true);
            }
            t3 t3Var2 = this.i1;
            if (t3Var2 != null) {
                t3Var2.e(true);
            }
            t3 t3Var3 = this.g1;
            if (t3Var3 != null) {
                t3Var3.e(true);
            }
            t3 t3Var4 = this.S0;
            if (t3Var4 != null) {
                t3Var4.e(true);
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
        if (z10 && (yVar = this.E0) != null && yVar.e) {
            yVar.a(false, z11);
        }
        m0(z11);
        z9 z9Var = this.M0;
        s3 s3Var = this.Q0;
        s3 s3Var2 = this.P0;
        if (!z11) {
            s3Var2.setAlpha((z10 && this.b0 == 0 && !I()) ? 1.0f : 0.0f);
            s3Var2.setTranslationY((z10 && this.b0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            s3Var.setAlpha((!z10 && this.b0 == 0 && I()) ? 0.6f : 0.0f);
            s3Var.setTranslationY((!z10 && this.b0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            z9Var.setAlpha((z10 || this.b0 != 0 || I()) ? 0.0f : 1.0f);
            z9Var.setTranslationY((z10 || this.b0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.V1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s3Var2, (Property<s3, Float>) property, (z10 && this.b0 == 0 && !I()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(s3Var2, (Property<s3, Float>) property2, (z10 && this.b0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(s3Var, (Property<s3, Float>) property, (!z10 && this.b0 == 0 && I()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(s3Var, (Property<s3, Float>) property2, (!z10 && this.b0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(z9Var, (Property<z9, Float>) property, (z10 || this.b0 != 0 || I()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(z9Var, (Property<z9, Float>) property2, (z10 || this.b0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.V1.setDuration(260L);
        this.V1.setInterpolator(jr.h);
        this.V1.start();
    }

    public final void h0(lh.m6 m6Var, boolean z10) {
        if (this.v2) {
            return;
        }
        ma maVar = new ma(m6Var.b(), this.c, this.b, new la(this, 0), null);
        maVar.T = B();
        maVar.setOnDismissListener(new y70(2, this, z10));
        this.T0.x(7, true);
        this.v2 = true;
        maVar.show();
    }

    public final void i(Runnable runnable) {
        o7 o7Var;
        Runnable runnable2;
        va vaVar;
        ef0 ef0Var = this.x1;
        if (ef0Var == null || (o7Var = this.G1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        o7Var.j = ef0Var.d() | o7Var.j;
        o7 o7Var2 = this.G1;
        ef0 ef0Var2 = this.x1;
        File file = o7Var2.Z0;
        if (file != null) {
            file.delete();
            o7Var2.Z0 = null;
        }
        MediaController.SavedFilterState savedFilterState = ef0Var2.getSavedFilterState();
        o7Var2.a1 = savedFilterState;
        if (o7Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = ef0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i10 = o7Var2.R;
                    matrix.postScale(i10 == 1 ? -1.0f : 1.0f, i10 == 2 ? -1.0f : 1.0f, o7Var2.k0 / 2.0f, o7Var2.l0 / 2.0f);
                    matrix.postRotate(-o7Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    o7Var2.n0.preScale(o7Var2.k0 / createBitmap.getWidth(), o7Var2.l0 / createBitmap.getHeight());
                    o7Var2.k0 = createBitmap.getWidth();
                    o7Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = o7Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        o7Var2.Z0.delete();
                    }
                    String k9 = o7.k(o7Var2.L);
                    boolean z10 = "png".equals(k9) || "webp".equals(k9);
                    o7Var2.Z0 = o7.w(o7Var2.a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(o7Var2.Z0));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new ag.w0(o7Var2, createBitmap, z10, runnable2, 5));
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
            o7 o7Var3 = this.G1;
            if (o7Var3.K || (vaVar = this.T0) == null) {
                return;
            }
            vaVar.set(o7Var3);
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        if (z11) {
            this.F0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(jr.h).withEndAction(new q9(this, z10, 1)).start();
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
        u81 u81Var = this.R0;
        if ((u81Var.getTag() != null && z10) || (u81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.a2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                g9 g9Var = new g9(this, 25);
                this.a2 = g9Var;
                AndroidUtilities.runOnUIThread(g9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.b2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        u81Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            u81Var.setVisibility(0);
        }
        this.b2.playTogether(ObjectAnimator.ofFloat(u81Var, (Property<u81, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.b2.addListener(new bg.z2(17, this, z10));
        this.b2.start();
        if (z10) {
            g9 g9Var2 = new g9(this, 26);
            this.a2 = g9Var2;
            AndroidUtilities.runOnUIThread(g9Var2, 2000L);
        }
    }

    public final void k() {
        lh.h3 h3Var;
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
        float f9 = this.E;
        RectF rectF2 = this.D;
        RectF rectF3 = this.Y;
        AndroidUtilities.lerp(rectF2, rectF, f9, rectF3);
        this.d0.setAlpha(this.E);
        float f10 = rectF3.left;
        this.d0.setTranslationX((f10 - r3.getLeft()) - this.r.getX());
        float f11 = rectF3.top;
        this.d0.setTranslationY((f11 - r3.getTop()) - this.r.getY());
        bb bbVar = this.B;
        if (bbVar != null && (h3Var = bbVar.f) != null) {
            h3Var.setTranslationX((rectF.left - rectF2.left) * this.E);
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
        e9 e9Var = this.m0;
        if (e9Var != null) {
            e9Var.dismiss();
            this.m0 = null;
        }
        e9 e9Var2 = new e9(this.b, 86400, this.a);
        e9Var2.o1();
        e9Var2.q1(this.u0);
        TLRPC.InputPeer inputPeer = this.t0;
        if (inputPeer == null) {
            inputPeer = this.J != 0 ? MessagesController.getInstance(this.c).getInputPeer(this.J) : new TLRPC.TL_inputPeerSelf();
        }
        e9Var2.p1(inputPeer);
        e9Var2.B = this.I;
        e9Var2.Q = new h9(this, 18);
        e9Var2.e1(false);
        e9Var2.m1(1);
        e9Var2.k1(false);
        e9Var2.S = new h9(this, 19);
        e9Var2.P = new p9(this, 12);
        this.m0 = e9Var2;
        e9Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        if (r6.isRecycled() != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        o7 o7Var;
        ImageReceiver photoImage;
        if (this.r1 == null || (o7Var = this.G1) == null) {
            return;
        }
        o7Var.f();
        this.G1.j |= this.r1.u0();
        o7 o7Var2 = this.G1;
        ArrayList arrayList = o7Var2.T0;
        if (arrayList == null) {
            o7Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ja jaVar = this.r1;
        o7 o7Var3 = this.G1;
        jaVar.t0(o7Var3.T0, false, false, false, false, o7Var3);
        o7 o7Var4 = this.G1;
        if (!o7Var4.K) {
            o7Var4.S0 = Utilities.clamp(this.r1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.r1.getMasks();
        this.G1.U0 = masks != null ? new ArrayList(masks) : null;
        o7 o7Var5 = this.G1;
        boolean z10 = o7Var5.K;
        boolean E = o7Var5.E();
        this.G1.T0 = new ArrayList();
        ja jaVar2 = this.r1;
        o7 o7Var6 = this.G1;
        Bitmap t02 = jaVar2.t0(o7Var6.T0, true, false, false, !z10, o7Var6);
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
        o7 o7Var7 = this.G1;
        o7Var7.P0 = null;
        o7Var7.R0 = null;
        o7Var7.Q0 = null;
        int i10 = this.c;
        FileLoader fileLoader = FileLoader.getInstance(i10);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        o7 o7Var8 = this.G1;
        o7Var7.P0 = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(t02, compressFormat, o7Var8.i0, o7Var8.j0, 87, false, 101, 101), true);
        if (t02 != null && !t02.isRecycled()) {
            t02.recycle();
        }
        o7 o7Var9 = this.G1;
        if (o7Var9.u) {
            File file4 = o7Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.G1.Y0 = null;
            }
            o7 o7Var10 = this.G1;
            long j10 = o7Var10.z0;
            if (j10 != Long.MIN_VALUE) {
                Drawable drawable = o7Var10.x0;
                if (drawable == null) {
                    drawable = f6.e(null, i10, j10, this.Y1);
                }
                if (drawable != null) {
                    this.G1.Y0 = o7.w(i10, "webp");
                    o7 o7Var11 = this.G1;
                    Bitmap createBitmap = Bitmap.createBitmap(o7Var11.i0, o7Var11.j0, Bitmap.Config.ARGB_8888);
                    o7.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
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
        o7 o7Var12 = this.G1;
        if (o7Var12.u) {
            File file5 = o7Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                this.G1.X0 = null;
            }
            o7 o7Var13 = this.G1;
            if (o7Var13.u && o7Var13.K) {
                int i11 = o7Var13.k0;
                int i12 = o7Var13.l0;
                bg.d2 s02 = this.r1.s0();
                if (s02 != null) {
                    bg.v1 v1Var = s02.n0;
                    if (v1Var.getChildCount() == 1 && i11 > 0 && i12 > 0) {
                        if ((v1Var.getChildAt(0) instanceof org.telegram.ui.Cells.s1) && (photoImage = ((org.telegram.ui.Cells.s1) v1Var.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
                            float f9 = i11;
                            float f10 = i12;
                            float max = Math.max(photoImage.getImageWidth() / f9, photoImage.getImageHeight() / f10);
                            int i13 = (int) ((f9 * max) / 2.0f);
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
                                this.G1.X0 = o7.w(i10, "webp");
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
            ja jaVar3 = this.r1;
            ArrayList arrayList2 = new ArrayList();
            o7 o7Var14 = this.G1;
            int i17 = o7Var14.i0;
            Bitmap t03 = jaVar3.t0(arrayList2, false, true, false, false, o7Var14);
            o7 o7Var15 = this.G1;
            FileLoader fileLoader2 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            o7 o7Var16 = this.G1;
            o7Var15.R0 = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(t03, compressFormat2, o7Var16.i0, o7Var16.j0, 87, false, 101, 101), true);
            if (t03 != null && !t03.isRecycled()) {
                t03.recycle();
            }
        }
        if (this.r1.K0.getPainting().E) {
            Bitmap blurBitmap = this.r1.getBlurBitmap();
            o7 o7Var17 = this.G1;
            FileLoader fileLoader3 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            o7 o7Var18 = this.G1;
            o7Var17.Q0 = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, o7Var18.i0, o7Var18.j0, 87, false, 101, 101), true);
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
        float f9;
        boolean z12;
        ra raVar;
        int i11;
        float f10;
        sa saVar;
        int i12;
        float f11;
        o7 o7Var;
        ImageView imageView;
        int i13;
        int i14;
        float f12;
        ve0 ve0Var;
        te0 te0Var;
        ImageView imageView2;
        int i15;
        o7 o7Var2;
        ja jaVar;
        ja jaVar2;
        int i16 = this.c0;
        if (i16 == i10 && !z10) {
            return;
        }
        wa waVar = this.Y0;
        if (i10 != -1 && waVar != null && waVar.K1) {
            return;
        }
        this.c0 = i10;
        AnimatorSet animatorSet = this.n2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n2 = null;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.l0;
        qb qbVar = this.V0;
        u0 u0Var = this.a1;
        n2 n2Var = this.j0;
        cg.i0 i0Var = this.f1;
        aj0 aj0Var = this.c1;
        if (i16 != i10) {
            if (i10 == -1) {
                n2Var.setVisibility(0);
                waVar.setVisibility(0);
                ja jaVar3 = this.r1;
                if (jaVar3 != null) {
                    jaVar3.D0(null, true);
                }
                u0Var.setVisibility(0);
                o7 o7Var3 = this.G1;
                if (o7Var3 == null || !o7Var3.u) {
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
                    aj0Var.setVisibility(0);
                    i0Var.setVisibility(0);
                } else {
                    o7 o7Var4 = this.G1;
                    if (o7Var4 != null && !TextUtils.isEmpty(o7Var4.y)) {
                        aj0Var.setVisibility(8);
                        i0Var.setVisibility(0);
                    }
                }
                qbVar.setVisibility(0);
            }
            if (i10 == 0 && (jaVar2 = this.r1) != null) {
                jaVar2.setVisibility(0);
            }
            if ((i10 == 0 || i16 == 0) && (jaVar = this.r1) != null) {
                jaVar.Z0.setLayerType(2, null);
            }
            ja jaVar4 = this.r1;
            if (jaVar4 != null) {
                jaVar4.K1.b(i10 != 0);
            }
            waVar.H.b(i10 != -1);
            mc.e();
            if (this.x1 != null && i16 == 1) {
                i(null);
            }
            cf0 cf0Var = this.y1;
            if (cf0Var != null) {
                cf0Var.setAllowTouch(false);
            }
            this.g1.e(true);
            fb fbVar = this.n;
            va vaVar = this.T0;
            Activity activity = this.b;
            if (i10 == 3) {
                if (this.n1 == null) {
                    ra raVar2 = new ra(this, activity, vaVar);
                    this.n1 = raVar2;
                    fbVar.addView(raVar2.d);
                    fbVar.addView(this.n1);
                }
                this.n1.setVisibility(0);
                o7 o7Var5 = this.G1;
                if (o7Var5 != null) {
                    this.n1.setEntry(o7Var5);
                }
            } else if (i16 == 3) {
                vaVar.b();
                ra raVar3 = this.n1;
                if (raVar3 != null) {
                    raVar3.a.setCropEditorDrawing(raVar3);
                    raVar3.y = true;
                }
            }
            if (i10 == 4) {
                if (this.o1 == null) {
                    sa saVar2 = new sa(this, activity, vaVar);
                    this.o1 = saVar2;
                    fbVar.addView(saVar2.e);
                    fbVar.addView(this.o1);
                }
                this.o1.setVisibility(0);
            } else if (i16 == 4) {
                vaVar.b();
                sa saVar3 = this.o1;
                if (saVar3 != null) {
                    saVar3.A = true;
                }
            }
        }
        this.X0.b((i10 == -1 || i10 == 2) && this.E > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        ef0 ef0Var = this.x1;
        boolean z13 = ef0Var == null && i10 == 1;
        float f13 = 1.0f;
        if (i10 == 1) {
            s();
            ef0 ef0Var2 = this.x1;
            this.r2 = ef0Var2;
            FrameLayout toolsView = ef0Var2 != null ? ef0Var2.getToolsView() : null;
            if (toolsView != null) {
                toolsView.setAlpha(0.0f);
                toolsView.setVisibility(0);
                f9 = 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
            } else {
                f9 = 0.0f;
            }
        } else {
            f9 = 0.0f;
            if (i16 == 1 && ef0Var != null) {
                this.r2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(ef0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.x1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i10 != 0) {
                    u();
                    this.r2 = this.r1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(n2Var, (Property<n2, Float>) property, f9));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.r1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -AndroidUtilities.dp(16.0f), f9));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property2, AndroidUtilities.dp(48.0f), f9));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f), f9));
                } else if (i16 == 0 && this.r1 != null) {
                    this.r2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(n2Var, (Property<n2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getTopLayout(), (Property<View, Float>) property3, f9));
                    View topLayout2 = this.r1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property3, f9));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property4, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                raVar = this.n1;
                if (raVar == null) {
                    wf.e eVar = raVar.h;
                    if (i10 == 3) {
                        Property property5 = View.ALPHA;
                        i11 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<wf.e, Float>) property5, 0.0f, 1.0f));
                        wf.e eVar2 = this.n1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f10 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar2, (Property<wf.e, Float>) property6, AndroidUtilities.dp(52.0f), f9));
                        arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property6, AndroidUtilities.dp(52.0f), f9));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new s9(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        i11 = 2;
                        f10 = 52.0f;
                        if (i16 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<wf.e, Float>) property7, 1.0f, 0.0f));
                            wf.e eVar3 = this.n1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(eVar3, (Property<wf.e, Float>) property8, f9, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property8, f9, AndroidUtilities.dp(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.n1.getAppearProgress(), f9);
                            ofFloat2.addUpdateListener(new s9(this, i11));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    i11 = 2;
                    f10 = 52.0f;
                }
                saVar = this.o1;
                if (saVar != null) {
                    wf.e eVar4 = saVar.n;
                    if (i10 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i11];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<wf.e, Float>) property9, fArr));
                        wf.e eVar5 = this.o1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i11];
                        fArr2[0] = AndroidUtilities.dp(f10);
                        fArr2[1] = f9;
                        arrayList.add(ObjectAnimator.ofFloat(eVar5, (Property<wf.e, Float>) property10, fArr2));
                        float[] fArr3 = new float[i11];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.o1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.o1.r;
                        float[] fArr4 = new float[i11];
                        fArr4[0] = AndroidUtilities.dp(f10);
                        fArr4[1] = f9;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i11];
                        fArr5[0] = this.o1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new s9(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i16 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i11];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<wf.e, Float>) property11, fArr6));
                        wf.e eVar6 = this.o1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float dp = AndroidUtilities.dp(f10);
                        float[] fArr7 = new float[i11];
                        fArr7[0] = f9;
                        fArr7[1] = dp;
                        arrayList.add(ObjectAnimator.ofFloat(eVar6, (Property<wf.e, Float>) property12, fArr7));
                        float[] fArr8 = new float[i11];
                        // fill-array-data instruction
                        fArr8[0] = 1.0f;
                        fArr8[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.o1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.o1.r;
                        float dp2 = AndroidUtilities.dp(f10);
                        float[] fArr9 = new float[i11];
                        fArr9[0] = f9;
                        fArr9[1] = dp2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i11];
                        fArr10[0] = this.o1.getAppearProgress();
                        fArr10[1] = f9;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new s9(this, 4));
                        arrayList.add(ofFloat4);
                    }
                }
                Property property13 = View.ALPHA;
                if (i10 != -1 || i10 == 2) {
                    i12 = 1;
                    if (this.K1 == 1) {
                        f11 = 1.0f;
                        float[] fArr11 = new float[i12];
                        fArr11[0] = f11;
                        arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property13, ((i10 != -1 || i10 == 2) && (this.K1 == i12 || !((o7Var = this.G1) == null || TextUtils.isEmpty(o7Var.y)))) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                        imageView = this.e1;
                        if (imageView != null) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i10 == -1 || i10 == 2) && (o7Var2 = this.G1) != null && o7Var2.u) ? 1.0f : 0.0f));
                        } else {
                            i13 = 1;
                        }
                        int i17 = this.b0;
                        float[] fArr12 = new float[i13];
                        fArr12[0] = ((i17 != i13 || i17 == 2) && i10 == -1) ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property13, fArr12));
                        ta taVar = this.d0;
                        if (i10 == i13) {
                            taVar.setPivotY(taVar.getMeasuredHeight() * 0.2f);
                            i14 = AndroidUtilities.dp(164.0f);
                        } else if (i10 == 0) {
                            taVar.setPivotY(taVar.getMeasuredHeight() * 0.6f);
                            i14 = AndroidUtilities.dp(40.0f);
                        } else if (i10 == 2) {
                            taVar.setPivotY(0.0f);
                            i14 = qbVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            f12 = (r10 - i14) / (taVar.getHeight() - ((int) taVar.getPivotY()));
                        } else {
                            f12 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(taVar, (Property<ta, Float>) View.SCALE_X, f12));
                        arrayList.add(ObjectAnimator.ofFloat(taVar, (Property<ta, Float>) View.SCALE_Y, f12));
                        if (i10 == -1) {
                            arrayList.add(ObjectAnimator.ofFloat(taVar, (Property<ta, Float>) View.TRANSLATION_Y, 0.0f));
                        }
                        ve0Var = this.B1;
                        if (ve0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(ve0Var, (Property<ve0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        te0Var = this.A1;
                        if (te0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(te0Var, (Property<te0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(waVar, (Property<wa, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                        float[] fArr13 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                        bg.x2 x2Var = this.h0;
                        arrayList.add(ObjectAnimator.ofFloat(x2Var, (Property<bg.x2, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(x2Var, (Property<bg.x2, Float>) property14, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                        if (i10 != -1 && i10 != 2) {
                            f13 = 0.0f;
                        }
                        FrameLayout frameLayout3 = this.U0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f13));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + waVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.f0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i10 == 2 ? -90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        imageView2 = this.e1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        }
                        if (this.n0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i15 = 0;
                            ofFloat5.addUpdateListener(new ia(this, i15));
                            arrayList.add(ofFloat5);
                        } else {
                            i15 = 0;
                        }
                        if (qbVar != null) {
                            o7 o7Var6 = this.G1;
                            boolean z14 = o7Var6 == null || !o7Var6.v() || !this.G1.t() || i10 == 2;
                            if (qbVar.f0 != z14 || !z11) {
                                qbVar.f0 = z14;
                                if (!z11) {
                                    qbVar.e0.f(z14, true);
                                }
                                qbVar.invalidate();
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
                        this.n2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.n2.setDuration(320L);
                        this.n2.setInterpolator(jr.h);
                        this.n2.addListener(new ea(this, i16, i10, 1));
                        if (z12) {
                            this.n2.setStartDelay(120L);
                        }
                        this.n2.start();
                        return;
                    }
                } else {
                    i12 = 1;
                }
                f11 = 0.0f;
                float[] fArr112 = new float[i12];
                fArr112[0] = f11;
                arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property13, ((i10 != -1 || i10 == 2) && (this.K1 == i12 || !((o7Var = this.G1) == null || TextUtils.isEmpty(o7Var.y)))) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                imageView = this.e1;
                if (imageView != null) {
                }
                int i172 = this.b0;
                float[] fArr122 = new float[i13];
                fArr122[0] = ((i172 != i13 || i172 == 2) && i10 == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property13, fArr122));
                ta taVar2 = this.d0;
                if (i10 == i13) {
                }
                if (i14 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(taVar2, (Property<ta, Float>) View.SCALE_X, f12));
                arrayList.add(ObjectAnimator.ofFloat(taVar2, (Property<ta, Float>) View.SCALE_Y, f12));
                if (i10 == -1) {
                }
                ve0Var = this.B1;
                if (ve0Var != null) {
                }
                te0Var = this.A1;
                if (te0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(waVar, (Property<wa, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                float[] fArr132 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                bg.x2 x2Var2 = this.h0;
                arrayList.add(ObjectAnimator.ofFloat(x2Var2, (Property<bg.x2, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(x2Var2, (Property<bg.x2, Float>) property142, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                if (i10 != -1) {
                    f13 = 0.0f;
                }
                FrameLayout frameLayout32 = this.U0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f13));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + waVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.f0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i10 == 2 ? -90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                imageView2 = this.e1;
                if (imageView2 != null) {
                }
                if (this.n0.c()) {
                }
                if (qbVar != null) {
                }
                if (!z11) {
                }
            }
        }
        z12 = z13;
        if (i10 != 0) {
        }
        raVar = this.n1;
        if (raVar == null) {
        }
        saVar = this.o1;
        if (saVar != null) {
        }
        Property property132 = View.ALPHA;
        if (i10 != -1) {
        }
        i12 = 1;
        if (this.K1 == 1) {
        }
        f11 = 0.0f;
        float[] fArr1122 = new float[i12];
        fArr1122[0] = f11;
        arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property132, ((i10 != -1 || i10 == 2) && (this.K1 == i12 || !((o7Var = this.G1) == null || TextUtils.isEmpty(o7Var.y)))) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property132, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
        imageView = this.e1;
        if (imageView != null) {
        }
        int i1722 = this.b0;
        float[] fArr1222 = new float[i13];
        fArr1222[0] = ((i1722 != i13 || i1722 == 2) && i10 == -1) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property132, fArr1222));
        ta taVar22 = this.d0;
        if (i10 == i13) {
        }
        if (i14 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(taVar22, (Property<ta, Float>) View.SCALE_X, f12));
        arrayList.add(ObjectAnimator.ofFloat(taVar22, (Property<ta, Float>) View.SCALE_Y, f12));
        if (i10 == -1) {
        }
        ve0Var = this.B1;
        if (ve0Var != null) {
        }
        te0Var = this.A1;
        if (te0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(waVar, (Property<wa, Float>) property132, i10 == -1 ? 1.0f : 0.0f));
        float[] fArr1322 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
        bg.x2 x2Var22 = this.h0;
        arrayList.add(ObjectAnimator.ofFloat(x2Var22, (Property<bg.x2, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(x2Var22, (Property<bg.x2, Float>) property1422, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
        if (i10 != -1) {
        }
        FrameLayout frameLayout322 = this.U0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f13));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + waVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.f0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i10 == 2 ? -90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        imageView2 = this.e1;
        if (imageView2 != null) {
        }
        if (this.n0.c()) {
        }
        if (qbVar != null) {
        }
        if (!z11) {
        }
    }

    public final void m() {
        o7 o7Var;
        if (this.r1 == null || (o7Var = this.G1) == null || !o7Var.u) {
            return;
        }
        File file = o7Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.G1.W0 = null;
        }
        this.G1.W0 = o7.w(this.c, "webp");
        ja jaVar = this.r1;
        o7 o7Var2 = this.G1;
        Bitmap t02 = jaVar.t0(o7Var2.T0, false, false, true, this.K1 != 1, o7Var2);
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
        } catch (Throwable th2) {
            if (t02 != null && !t02.isRecycled()) {
                t02.recycle();
            }
            throw th2;
        }
    }

    public final void m0(boolean z10) {
        ka kaVar;
        boolean z11 = false;
        i0(this.b0 == 0 && this.K1 == 1 && !this.E0.e && !I(), z10);
        this.C0.setSelected(this.w0.j());
        y yVar = this.E0;
        c0(this.j0, yVar == null || !yVar.e, z10);
        c0(this.A0, (this.W1 || this.K1 == -1 || this.b0 != 0 || this.U1 == null || this.E0.e || I()) ? false : true, z10);
        c0(this.B0, (this.W1 || this.K1 == -1 || this.b0 != 0 || (kaVar = this.x0) == null || !kaVar.a || this.E0.e || this.w0.j()) ? false : true, z10);
        c0(this.C0, (this.W1 || this.K1 == -1 || this.b0 != 0 || this.E0.e) ? false : true, z10);
        c0(this.D0, this.E0.e, z10);
        this.K0.e(this.w0.j() ? this.w0.getFilledProgress() : 0.0f, z10);
        boolean z12 = this.E0.e;
        t3 t3Var = this.j1;
        if (z12) {
            t3Var.v();
        } else {
            t3Var.e(true);
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
        v vVar = this.E0.a;
        vVar.setPadding((int) ((this.j0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) (alpha4 + AndroidUtilities.dp(8.0f)), 0);
        vVar.invalidate();
    }

    public final void o() {
        boolean z10 = this.G != 0.0f || this.E < 1.0f || this.x2;
        if (z10 == this.w2) {
            return;
        }
        jf.s0 s0Var = this.y;
        if (s0Var != null) {
            s0Var.a(!z10);
        }
        this.w2 = z10;
    }

    public final void o0(boolean z10) {
        xi0 xi0Var = this.d1;
        if (xi0Var != null) {
            int[] iArr = xi0Var.e;
            int i10 = 0;
            if (!z10) {
                o7 o7Var = this.G1;
                int i11 = (o7Var == null || !o7Var.y0) ? 0 : iArr[0] - 1;
                xi0Var.L(i11, false, true);
                this.d1.N(i11);
                ImageView imageView = this.e1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            o7 o7Var2 = this.G1;
            if (o7Var2 != null && o7Var2.y0) {
                i10 = iArr[0];
            }
            xi0Var.N(i10);
            xi0 xi0Var2 = this.d1;
            if (xi0Var2 != null) {
                xi0Var2.start();
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
            float f9 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            p2 p2Var = this.s;
            p2Var.o = f9;
            p2Var.n = p2.f(f9);
            p2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            p2 p2Var2 = this.s;
            p2Var2.p = f10;
            p2Var2.i();
        }
    }

    public final void p0() {
        if (this.S1) {
            return;
        }
        this.S1 = true;
        g9 g9Var = new g9(this, 2);
        ja jaVar = this.r1;
        o7 o7Var = this.G1;
        if (jaVar == null || o7Var == null) {
            g9Var.run();
            return;
        }
        o7Var.f();
        boolean u02 = jaVar.u0();
        boolean z10 = jaVar.K0.getPainting().E;
        Utilities.searchQueue.postRunnable(new j9(this, jaVar, o7Var.i0, o7Var.j0, o7Var, z10, u02, g9Var, 1));
    }

    public final void q(boolean z10) {
        va vaVar;
        if (this.d) {
            e9 e9Var = this.m0;
            if (e9Var != null) {
                e9Var.dismiss();
                this.m0 = null;
            }
            o7 o7Var = this.G1;
            long j10 = 0;
            if (o7Var != null && !o7Var.h) {
                if ((this.v && o7Var.g) || o7Var.b != 0) {
                    o7Var.j = false;
                }
                o7Var.i(false);
            }
            this.G1 = null;
            Utilities.Callback4 callback4 = this.N;
            if (callback4 == null || (vaVar = this.T0) == null) {
                va vaVar2 = this.T0;
                if (vaVar2 != null && !z10) {
                    vaVar2.set(null);
                }
                g(0.0f, z10, new g9(this, 23));
                int i10 = this.F;
                if (i10 == 1 || i10 == 0) {
                    this.n.setBackgroundColor(0);
                    this.X0.b(false, true);
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
            x61 x61Var = vaVar.y;
            if (x61Var != null) {
                x61Var.C();
                vaVar.y.I();
                vaVar.y = null;
            }
            x61 x61Var2 = vaVar.x;
            if (x61Var2 != null) {
                j10 = x61Var2.o();
                vaVar.x.C();
                vaVar.x.I();
                vaVar.x = null;
            }
            x61 x61Var3 = vaVar.e;
            if (x61Var3 != null) {
                j10 = x61Var3.o();
                vaVar.e.C();
                vaVar.e.I();
                vaVar.e = null;
            }
            callback4.run(Long.valueOf(j10), new q9(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.w));
        }
    }

    public final boolean q0() {
        ka kaVar;
        if ((!this.L1 && !this.M1) || (kaVar = this.x0) == null || !kaVar.isFrontface()) {
            return false;
        }
        int i10 = this.p2;
        return i10 == 2 || (i10 == 1 && this.Y1);
    }

    public final void r() {
        Activity activity = this.b;
        if (this.x0 != null || activity == null) {
            return;
        }
        this.x0 = new ka(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        o6 o6Var = this.K0;
        if (o6Var != null) {
            o6Var.c0 = 0.0f;
            o6Var.d0.d(0.0f, true);
        }
        this.x0.recordHevc = !this.w0.j();
        this.x0.setThumbDrawable(A());
        this.x0.initTexture();
        this.x0.setDelegate(new p9(this, 0));
        c0(this.B0, this.x0.a && this.b0 == 0, true);
        this.C0.setTranslationX(this.x0.a ? 0.0f : AndroidUtilities.dp(46.0f));
        this.w0.setCameraView(this.x0);
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.S0.v();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else if ((!c1.q(this.x0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", c1.p(ApplicationLoader.applicationContext, false))) && this.x0.a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
            this.h1.v();
        }
        if (this.y0 == null) {
            this.y0 = new j6(activity, new h9(this, 3));
        }
        this.y0.a(this.x0);
        y6 y6Var = this.z0;
        if (y6Var != null) {
            ua uaVar = this.w0;
            Object blurRenderNode = uaVar.getBlurRenderNode();
            y6Var.B = uaVar;
            y6Var.C = blurRenderNode;
            y6Var.invalidate();
        }
    }

    public final void s() {
        o7 o7Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.x1 != null || (o7Var = this.G1) == null) {
            return;
        }
        if (o7Var.K) {
            bitmap = null;
        } else {
            if (o7Var.Z0 == null) {
                q6 = this.T0.getPhotoBitmap();
            } else {
                p9 p9Var = new p9(this, 11);
                Point point = AndroidUtilities.displaySize;
                q6 = o7.q(p9Var, point.x, point.y, 0, true);
            }
            bitmap = q6;
        }
        if (bitmap != null || this.G1.K) {
            l61 textureView = this.T0.getTextureView();
            int orientation = this.T0.getOrientation();
            o7 o7Var2 = this.G1;
            ef0 ef0Var = new ef0(this.b, textureView, bitmap, null, orientation, o7Var2 != null ? o7Var2.a1 : null, null, 0, false, false, this.n0, this.a);
            this.x1 = ef0Var;
            this.r.addView(ef0Var);
            cf0 cf0Var = this.y1;
            if (cf0Var != null) {
                cf0Var.setFilterView(this.x1);
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
            te0 blurControl = this.x1.getBlurControl();
            this.A1 = blurControl;
            if (blurControl != null) {
                this.d0.addView(blurControl);
            }
            ve0 curveControl = this.x1.getCurveControl();
            this.B1 = curveControl;
            if (curveControl != null) {
                this.d0.addView(curveControl);
            }
            V();
            this.x1.getDoneTextView().setOnClickListener(new i9(this, 13));
            this.x1.getCancelTextView().setOnClickListener(new i9(this, 14));
            this.x1.getToolsView().setVisibility(8);
            this.x1.getToolsView().setAlpha(0.0f);
            this.x1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.x1.e0.setVisibility(0);
        }
    }

    public final void t(boolean z10) {
        if (this.I0 != null) {
            ua uaVar = this.w0;
            if ((uaVar != null && uaVar.j()) == this.I0.L) {
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
        ua uaVar2 = this.w0;
        ga gaVar = new ga(this, this.c, this.b, this.a, albumEntry, z10, z11, uaVar2 != null && uaVar2.j());
        this.I0 = gaVar;
        gaVar.C.setVisibility(8);
        this.I0.setMultipleOnClick(this.w0.j());
        this.I0.setMaxCount(Math.min(10, t.b() - this.w0.getFilledCount()));
        this.I0.setOnBackClickListener(new x9(this, 1));
        this.I0.setOnSelectListener(new w9(z10, this, 0));
        this.I0.setOnSelectMultipleListener(new jh.o1(this, 2));
        f2.i0 i0Var = this.h2;
        if (i0Var != null) {
            x2 x2Var = this.I0.e;
            x2Var.B = i0Var;
            x2Var.l0();
        }
        this.n.addView(this.I0, i7.f6.e(-1, -1, 119));
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
        o7 o7Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        o7 o7Var2;
        ag.t1 renderView;
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
        o7 o7Var3 = this.G1;
        Bitmap decodeFile = (o7Var3 == null || !(o7Var3.c || o7Var3.g || this.D1 != null) || (file3 = o7Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        o7 o7Var4 = this.G1;
        if (o7Var4 == null || (!(o7Var4.c || o7Var4.g || this.D1 != null) || (file2 = o7Var4.Q0) == null)) {
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
                o7Var = this.G1;
                if (o7Var != null || o7Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = o7Var != null ? file : o7Var.L;
                if (o7Var == null && o7Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (o7Var != null || o7Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.T0.getOrientation();
                o7Var2 = this.G1;
                Object obj2 = obj;
                if (o7Var2 != null) {
                    obj2 = o7Var2.T0;
                }
                ?? r13 = obj2;
                MediaController.CropState cropState = new MediaController.CropState();
                e6 e6Var = this.o0;
                va vaVar = this.T0;
                Activity activity = this.b;
                boolean z15 = z12;
                ja jaVar = new ja(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, o7Var2, measuredWidth, measuredHeight, cropState, this.n0, this.a, e6Var, vaVar);
                this.r1 = jaVar;
                o7 o7Var5 = this.G1;
                jaVar.setHasAudio(o7Var5 == null && o7Var5.y != null);
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
                this.r1.setOnDoneButtonClickedListener(new g9(this, 21));
                this.r1.setOnCancelButtonClickedListener(new g9(this, 22));
                ja jaVar2 = this.r1;
                jaVar2.N0.setVisibility(0);
                jaVar2.K0.setVisibility(0);
                jaVar2.L0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.d0.getMeasuredWidth();
        int measuredHeight2 = this.d0.getMeasuredHeight();
        o7Var = this.G1;
        if (o7Var != null) {
        }
        file = null;
        z11 = false;
        if (o7Var != null) {
        }
        if (o7Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (o7Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.T0.getOrientation();
        o7Var2 = this.G1;
        Object obj22 = obj;
        if (o7Var2 != null) {
        }
        ?? r132 = obj22;
        MediaController.CropState cropState2 = new MediaController.CropState();
        e6 e6Var2 = this.o0;
        va vaVar2 = this.T0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        ja jaVar3 = new ja(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, o7Var2, measuredWidth2, measuredHeight2, cropState2, this.n0, this.a, e6Var2, vaVar2);
        this.r1 = jaVar3;
        o7 o7Var52 = this.G1;
        jaVar3.setHasAudio(o7Var52 == null && o7Var52.y != null);
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
        this.r1.setOnDoneButtonClickedListener(new g9(this, 21));
        this.r1.setOnCancelButtonClickedListener(new g9(this, 22));
        ja jaVar22 = this.r1;
        jaVar22.N0.setVisibility(0);
        jaVar22.K0.setVisibility(0);
        jaVar22.L0.setVisibility(0);
    }

    public final void v(boolean z10) {
        j6 j6Var = this.y0;
        if (j6Var != null) {
            j6Var.f = null;
            Utilities.globalQueue.cancelRunnable(j6Var.h);
            this.y0 = null;
            ua uaVar = this.w0;
            if (uaVar != null) {
                uaVar.c.a(null);
            }
        }
        y6 y6Var = this.z0;
        if (y6Var != null) {
            y6Var.B = null;
            y6Var.C = null;
            y6Var.invalidate();
        }
        if (this.x0 != null) {
            if (z10) {
                b0(new g9(this, 8));
                return;
            }
            b0(new g9(this, 9));
            this.x0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.x0);
            ua uaVar2 = this.w0;
            if (uaVar2 != null) {
                uaVar2.setCameraView(null);
            }
            this.x0 = null;
        }
    }

    public final void w() {
        ga gaVar = this.I0;
        if (gaVar == null) {
            return;
        }
        this.n.removeView(gaVar);
        this.I0 = null;
        ValueAnimator valueAnimator = this.j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j2 = null;
        }
        o1.k kVar = this.k2;
        if (kVar != null) {
            kVar.c();
            this.k2 = null;
        }
        this.l2 = null;
    }

    public final void y() {
        ef0 ef0Var = this.x1;
        if (ef0Var == null) {
            return;
        }
        ef0Var.e();
        this.y1.setFilterView(null);
        this.r.removeView(this.x1);
        TextureView textureView = this.z1;
        if (textureView != null) {
            this.d0.removeView(textureView);
            this.z1 = null;
        }
        this.T0.o(null, null);
        te0 te0Var = this.A1;
        if (te0Var != null) {
            this.d0.removeView(te0Var);
            this.A1 = null;
        }
        ve0 ve0Var = this.B1;
        if (ve0Var != null) {
            this.d0.removeView(ve0Var);
            this.B1 = null;
        }
        this.x1 = null;
    }

    public final void z() {
        ja jaVar = this.r1;
        if (jaVar == null) {
            return;
        }
        jaVar.N0.removeAllViews();
        ja jaVar2 = this.r1;
        jaVar2.K0.h();
        jaVar2.N0.setVisibility(8);
        jaVar2.M0.setVisibility(8);
        jaVar2.A0.postRunnable(new ag.o0(20));
        c5 c5Var = jaVar2.g2;
        if (c5Var != null) {
            c5Var.dismiss();
        }
        ag.f0 f0Var = jaVar2.P1;
        if (f0Var != null) {
            f0Var.dismiss();
        }
        this.r.removeView(this.r1);
        this.r1 = null;
        ag.t1 t1Var = this.s1;
        if (t1Var != null) {
            this.d0.removeView(t1Var);
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
