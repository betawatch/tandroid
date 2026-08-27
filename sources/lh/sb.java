package lh;

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
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class sb implements NotificationCenter.NotificationCenterDelegate {
    public static sb B2;
    public ValueAnimator A;
    public final dc A0;
    public ke0 A1;
    public ValueAnimator A2;
    public nb B;
    public final ec B0;
    public me0 B1;
    public float C;
    public final a0 C0;
    public File C1;
    public final RectF D;
    public final dc D0;
    public ArrayList D1;
    public float E;
    public final z E0;
    public ArrayList E1;
    public int F;
    public final hc F0;
    public ArrayList F1;
    public float G;
    public boolean G0;
    public z7 G1;
    public Float H;
    public boolean H0;
    public boolean H1;
    public boolean I;
    public sa I0;
    public long I1;
    public long J;
    public v0 J0;
    public boolean J1;
    public boolean K;
    public final y6 K0;
    public int K1;
    public final AnimationNotificationsLocker L;
    public final d L0;
    public boolean L1;
    public Runnable M;
    public final la M0;
    public boolean M1;
    public Utilities.Callback4 N;
    public final p2 N0;
    public boolean N1;
    public int O;
    public final p2 O0;
    public boolean O1;
    public int P;
    public final u3 P0;
    public float P1;
    public int Q;
    public final u3 Q0;
    public int Q1;
    public boolean R;
    public final k81 R0;
    public boolean R1;
    public boolean S;
    public final w3 S0;
    public boolean S1;
    public boolean T;
    public final hb T0;
    public boolean T1;
    public int U;
    public final FrameLayout U0;
    public String U1;
    public int V;
    public final cc V0;
    public AnimatorSet V1;
    public int W;
    public final gc W0;
    public boolean W1;
    public int X;
    public final i6 X0;
    public boolean X1;
    public final RectF Y;
    public final ib Y0;
    public boolean Y1;
    public final RectF Z;
    public final ka Z0;
    public boolean Z1;
    public final jh.b a;
    public final Path a0;
    public final u0 a1;
    public Runnable a2;
    public final Activity b;
    public int b0;
    public oi0 b1;
    public AnimatorSet b2;
    public final int c;
    public int c0;
    public final ri0 c1;
    public y9 c2;
    public boolean d;
    public final fb d0;
    public oi0 d1;
    public boolean d2;
    public boolean e;
    public final FrameLayout e0;
    public ImageView e1;
    public AnimatorSet e2;
    public final WindowManager f;
    public final LinearLayout f0;
    public final ag.t0 f1;
    public ValueAnimator f2;
    public final FrameLayout g0;
    public final w3 g1;
    public boolean g2;
    public final WindowManager.LayoutParams h;
    public final ag.p1 h0;
    public final w3 h1;
    public f2.j0 h2;
    public final FrameLayout i0;
    public final w3 i1;
    public MediaController.AlbumEntry i2;
    public final p2 j0;
    public final w3 j1;
    public ValueAnimator j2;
    public final s7 k0;
    public final j6 k1;
    public o1.j k2;
    public final org.telegram.ui.ActionBar.h5 l0;
    public final fc l1;
    public Boolean l2;
    public q9 m0;
    public q m1;
    public ca m2;
    public final rb n;
    public final org.telegram.ui.Components.z9 n0;
    public db n1;
    public AnimatorSet n2;
    public final p6 o0;
    public eb o1;
    public boolean o2;
    public final ag.s0 p0;
    public final cc p1;
    public int p2;
    public boolean q0;
    public final d q1;
    public ArrayList q2;
    public final kb r;
    public long r0;
    public va r1;
    public FrameLayout r2;
    public final r2 s;
    public String s0;
    public yf.b1 s1;
    public boolean s2;
    public TLRPC.InputPeer t0;
    public View t1;
    public s9 t2;
    public o9 u0;
    public View u1;
    public cg.w1 u2;
    public boolean v;
    public u v0;
    public View v1;
    public boolean v2;
    public long w;
    public final gb w0;
    public View w1;
    public boolean w2;
    public jb x;
    public wa x0;
    public ve0 x1;
    public boolean x2;
    public final gf.t0 y;
    public u6 y0;
    public final te0 y1;
    public bb y2;
    public final i7 z0;
    public TextureView z1;
    public float z2;

    public sb(Activity activity, int i10) {
        int i11;
        jh.b bVar = new jh.b();
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
        this.u0 = new o9();
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
        oa oaVar = new oa(this);
        this.Z1 = true;
        this.g2 = true;
        this.p2 = -1;
        this.b = activity;
        this.c = i10;
        LaunchActivity launchActivity = LaunchActivity.C1;
        this.y = launchActivity != null ? new gf.t0(launchActivity, true) : null;
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
        rb rbVar = new rb(this, activity);
        this.n = rbVar;
        ba baVar = new ba(this, i12);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(rbVar, baVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        r2 r2Var = new r2(activity, windowManager, this.n, layoutParams);
        this.s = r2Var;
        r2Var.a(new za(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        rb rbVar2 = this.n;
        kb kbVar = new kb(this, activity);
        this.r = kbVar;
        rbVar2.addView(kbVar);
        kb kbVar2 = this.r;
        fb fbVar = new fb(this, activity);
        this.d0 = fbVar;
        kbVar2.addView(fbVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.n0 = new org.telegram.ui.Components.z9(this.d0);
        this.o0 = new p6();
        kb kbVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.e0 = frameLayout;
        kbVar3.addView(frameLayout);
        kb kbVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.g0 = frameLayout2;
        kbVar4.addView(frameLayout2);
        kb kbVar5 = this.r;
        ag.p1 p1Var = new ag.p1(this, activity, 9);
        this.h0 = p1Var;
        kbVar5.addView(p1Var);
        this.h0.setVisibility(8);
        this.h0.setAlpha(0.0f);
        kb kbVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.i0 = frameLayout3;
        kbVar6.addView(frameLayout3);
        int i14 = 6;
        org.telegram.ui.Components.ec.a(this.n, new cg.w(i14));
        int i15 = 8;
        gb gbVar = new gb(this, activity, this.n0, this.r, bVar);
        this.w0 = gbVar;
        rb rbVar3 = this.n;
        Objects.requireNonNull(rbVar3);
        gbVar.setCancelGestures(new kh.c(rbVar3, 20));
        this.w0.setResetState(new s9(this, 13));
        this.d0.addView(this.w0, h7.z5.e(-1, -1, 119));
        this.w0.setOnClickListener(new u9(this, 12));
        fb fbVar2 = this.d0;
        int i16 = this.F;
        fbVar2.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
        fb fbVar3 = this.d0;
        float dp = AndroidUtilities.dp(12.0f);
        cg.l1 l1Var = gf.r0.a;
        fbVar3.setOutlineProvider(new gf.q0(0, dp));
        this.d0.setClipToOutline(true);
        s9 s9Var = new s9(this, 14);
        te0 te0Var = new te0(activity);
        te0Var.a = new TextPaint(1);
        te0Var.b = new TextPaint(1);
        er erVar = er.h;
        te0Var.s = new org.telegram.ui.Components.y5(te0Var, 0L, 350L, erVar);
        te0Var.E = new mb0(te0Var, 7);
        te0Var.x = s9Var;
        this.y1 = te0Var;
        hb hbVar = new hb(this, activity, this.n0, this.o0);
        this.T0 = hbVar;
        hbVar.setCollageView(this.w0);
        hb hbVar2 = this.T0;
        hbVar2.v = new s9(this, 15);
        hbVar2.setOnTapListener(new s9(this, i13));
        this.T0.setVisibility(8);
        hb hbVar3 = this.T0;
        hbVar3.J = new s9(this, 17);
        this.d0.addView(hbVar3, h7.z5.e(-1, -1, 119));
        this.d0.addView(this.y1, h7.z5.e(-1, -1, 119));
        rb rbVar4 = this.n;
        ib ibVar = new ib(this, activity, rbVar4, rbVar4, this.r, bVar, this.n0);
        this.Y0 = ibVar;
        ibVar.setAccount(i10);
        this.Y0.setUiBlurBitmap(new ba(this, i14));
        int i17 = 5;
        org.telegram.ui.Components.ec.a(this.h0, new gh.w0(this, i17));
        this.Y0.setOnHeightUpdate(new t9(this, 13));
        this.Y0.setOnPeriodUpdate(new t9(this, 4));
        long j10 = this.J;
        if (j10 != 0) {
            this.Y0.setDialogId(j10);
        }
        this.Y0.setOnPremiumHint(new t9(this, i17));
        this.Y0.setOnKeyboardOpen(new t9(this, i14));
        ag.s0 s0Var = new ag.s0(this, activity, 3);
        this.p0 = s0Var;
        this.r.addView(s0Var);
        cc ccVar = new cc(activity, this.r, this.d0, bVar, this.n0);
        this.V0 = ccVar;
        ccVar.setOnTimelineClick(new s9(this, 10));
        this.V0.setOnHeightChange(new s9(this, 11));
        this.T0.setVideoTimelineView(this.V0);
        this.V0.setVisibility(8);
        this.V0.setAlpha(0.0f);
        this.V0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.U0 = frameLayout4;
        float f10 = 388;
        frameLayout4.addView(this.V0, h7.z5.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        gc gcVar = new gc(activity);
        this.W0 = gcVar;
        gcVar.setVisibility(8);
        this.W0.a(false);
        this.U0.addView(this.W0, h7.z5.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.h0.addView(this.U0, h7.z5.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.h0.addView(this.Y0, h7.z5.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.w0.setTimelineView(this.V0);
        this.w0.setPreviewView(this.T0);
        cc ccVar2 = new cc(activity, this.r, this.d0, bVar, this.n0);
        this.p1 = ccVar2;
        ccVar2.T0 = true;
        ccVar2.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.h0.addView(this.p1, h7.z5.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        ka kaVar = new ka(this, activity, bVar, this.n0);
        this.Z0 = kaVar;
        kaVar.setVisibility(8);
        this.h0.addView(this.Z0, h7.z5.e(-1, -2, 85));
        p2 p2Var = new p2(activity);
        this.j0 = p2Var;
        p2Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        p2 p2Var2 = this.j0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        p2Var2.setScaleType(scaleType);
        this.j0.setImageResource(R.drawable.msg_photo_back);
        p2 p2Var3 = this.j0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        p2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.j0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.j0.setOnClickListener(new u9(this, i12));
        this.e0.addView(this.j0, h7.z5.e(56, 56, 51));
        this.s.a(this.j0);
        s7 s7Var = new s7(activity, i10);
        this.k0 = s7Var;
        s7Var.a(false, false);
        this.k0.setOnClickListener(new ag.q0(28, this, activity));
        this.e0.addView(this.k0, h7.z5.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
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
        this.e0.addView(this.l0, h7.z5.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f0.setGravity(5);
        this.e0.addView(this.f0, h7.z5.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        t9 t9Var = new t9(this, 7);
        rb rbVar5 = this.n;
        u0 u0Var = new u0(activity);
        u0Var.w = true;
        u0Var.x = true;
        u0Var.h = t9Var;
        u0Var.a = i10;
        u0Var.b = rbVar5;
        u0Var.setScaleType(scaleType);
        u0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        u0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        u0Var.setVisibility(8);
        u0Var.setAlpha(0.0f);
        u0Var.setOnClickListener(new ag.w0(u0Var, 29));
        u0Var.f = new hp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        u0Var.d();
        this.a1 = u0Var;
        w3 w3Var = new w3(activity, 1);
        w3Var.m(1.0f, -71.0f);
        w3Var.d = 2000L;
        w3Var.Q = false;
        w3Var.D.o(true, false, false);
        this.g1 = w3Var;
        w3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.e0.addView(this.g1, h7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ri0 ri0Var = new ri0(activity);
        this.c1 = ri0Var;
        ri0Var.setScaleType(scaleType);
        ri0 ri0Var2 = this.c1;
        z7 z7Var = this.G1;
        ri0Var2.setImageResource((z7Var == null || !z7Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.c1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.c1.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.c1.setOnClickListener(new u9(this, 2));
        this.c1.setVisibility(8);
        this.c1.setAlpha(0.0f);
        ag.t0 t0Var = new ag.t0(activity);
        this.f1 = t0Var;
        t0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f1.setVisibility(8);
        this.f1.setAlpha(0.0f);
        this.f1.setOnClickListener(new u9(this, 3));
        this.f0.addView(this.f1, h7.z5.q(46, 56, 53));
        this.f0.addView(this.c1, h7.z5.q(46, 56, 53));
        this.f0.addView(this.a1, h7.z5.e(46, 56, 53));
        dc dcVar = new dc(activity);
        this.A0 = dcVar;
        dcVar.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.A0.setOnClickListener(new u9(this, 4));
        this.A0.setOnLongClickListener(new b5(this, i12));
        this.A0.setVisibility(8);
        this.A0.setAlpha(0.0f);
        this.s.a(this.A0);
        this.e0.addView(this.A0, h7.z5.e(56, 56, 53));
        ec ecVar = new ec(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.B0 = ecVar;
        ecVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.B0.setOnClickListener(new u9(this, 5));
        boolean q6 = c1.q(activity);
        this.B0.setVisibility(q6 ? 0 : 8);
        this.B0.setAlpha(q6 ? 1.0f : 0.0f);
        this.s.a(this.B0);
        this.e0.addView(this.B0, h7.z5.e(56, 56, 53));
        a0 a0Var = new a0(activity);
        this.C0 = a0Var;
        a0Var.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.C0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        if (this.v0 == null) {
            i11 = 6;
            this.v0 = (u) u.a().get(6);
        } else {
            i11 = 6;
        }
        this.C0.setOnClickListener(new u9(this, i11));
        this.C0.a(new v(this.v0, false), false);
        this.C0.setSelected(false);
        this.C0.setVisibility(0);
        this.C0.setAlpha(1.0f);
        this.s.a(this.C0);
        this.e0.addView(this.C0, h7.z5.e(56, 56, 53));
        dc dcVar2 = new dc(activity);
        this.D0 = dcVar2;
        dcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.D0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.D0.a(new v(new u("../../.."), true), false);
        this.D0.setVisibility(8);
        this.D0.setAlpha(0.0f);
        this.D0.setOnClickListener(new u9(this, 7));
        this.s.a(this.D0);
        this.e0.addView(this.D0, h7.z5.e(56, 56, 53));
        z zVar = new z(activity, this.s);
        this.E0 = zVar;
        zVar.a.u0(6);
        this.E0.setSelected((u) null);
        this.E0.setOnLayoutClick(new t9(this, i15));
        this.e0.addView(this.E0, h7.z5.e(-1, 56, 53));
        w3 w3Var2 = new w3(activity, 1);
        w3Var2.m(1.0f, -20.0f);
        w3Var2.d = 5000L;
        w3Var2.i();
        w3Var2.t(LocaleController.getString(R.string.StoryCameraDualHint));
        w3Var2.h0 = new ag.l3(18);
        this.h1 = w3Var2;
        w3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.e0.addView(this.h1, h7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        w3 w3Var3 = new w3(activity, 2);
        w3Var3.m(0.0f, 28.0f);
        w3Var3.d = 5000L;
        w3Var3.q(true);
        this.i1 = w3Var3;
        this.e0.addView(w3Var3, h7.z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        w3 w3Var4 = new w3(activity, 1);
        w3Var4.m(1.0f, -20.0f);
        w3Var4.d = 5000L;
        w3Var4.t(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.j1 = w3Var4;
        w3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.e0.addView(this.j1, h7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        hc hcVar = new hc(activity);
        Paint paint = new Paint(1);
        hcVar.a = paint;
        Paint paint2 = new Paint(1);
        hcVar.b = paint2;
        hcVar.e = new org.telegram.ui.Components.y5(hcVar, 0L, 250L, erVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        hcVar.c = i6Var;
        i6Var.k(0.3f, 250L, erVar);
        i6Var.t(AndroidUtilities.dp(13.0f));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.bold());
        i6Var.setCallback(hcVar);
        i6Var.b = 1;
        hcVar.a(0L, false);
        this.F0 = hcVar;
        i0(false, false);
        this.e0.addView(this.F0, h7.z5.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.F0);
        MediaController.loadGalleryPhotosAlbums(0);
        y6 y6Var = new y6(activity);
        this.K0 = y6Var;
        y6Var.setDelegate(oaVar);
        y6 y6Var2 = this.K0;
        boolean z10 = this.K1 == 1;
        y6Var2.j0 = -1.0f;
        y6Var2.k0 = z10;
        y6Var2.invalidate();
        this.g0.addView(this.K0, h7.z5.e(-1, 100, 87));
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
        this.g0.addView(this.L0, h7.z5.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.L0.setOnClickListener(new u9(this, 8));
        w3 w3Var5 = new w3(activity, 3);
        w3Var5.q(true);
        w3Var5.t(LocaleController.getString(R.string.StoryCameraHint2));
        w3Var5.h = AndroidUtilities.dp(320.0f);
        w3Var5.d = 5000L;
        w3Var5.G = Layout.Alignment.ALIGN_CENTER;
        this.S0 = w3Var5;
        this.g0.addView(w3Var5, h7.z5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        k81 k81Var = new k81(activity);
        this.R0 = k81Var;
        k81Var.I = false;
        k81Var.setAlpha(0.0f);
        this.g0.addView(this.R0, h7.z5.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.R0.setDelegate(new ba(this, 4));
        k81 k81Var2 = this.R0;
        this.P1 = 0.0f;
        k81Var2.b(0.0f, false);
        int i18 = 12;
        i7 i7Var = new i7(activity, i10, new s9(this, i18));
        this.z0 = i7Var;
        int i19 = 9;
        i7Var.c = new t9(this, i19);
        this.g0.addView(i7Var, h7.z5.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        la laVar = new la(this, activity);
        this.M0 = laVar;
        int i20 = 10;
        laVar.setOnSwitchModeListener(new t9(this, i20));
        int i21 = 11;
        this.M0.setOnSwitchingModeListener(new t9(this, i21));
        this.i0.addView(this.M0, h7.z5.e(-1, 48, 55));
        this.s.a(this.M0);
        p2 p2Var4 = new p2(activity);
        this.N0 = p2Var4;
        p2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.N0.setImageResource(R.drawable.stream_flip);
        this.N0.setScaleType(scaleType);
        this.N0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.i0.addView(this.N0, h7.z5.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.N0);
        this.N0.setOnClickListener(new u9(this, i19));
        p2 p2Var5 = new p2(activity);
        this.O0 = p2Var5;
        p2Var5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.O0.setImageResource(R.drawable.stream_settings);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.i0.addView(this.O0, h7.z5.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.O0);
        this.O0.setOnClickListener(new u9(this, i20));
        u3 u3Var = new u3(activity);
        this.P0 = u3Var;
        this.i0.addView(u3Var, h7.z5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.P0);
        u3 u3Var2 = new u3(activity);
        this.Q0 = u3Var2;
        u3Var2.a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        u3Var2.invalidate();
        this.Q0.setAlpha(0.0f);
        this.i0.addView(this.Q0, h7.z5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.Q0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.q1 = dVar2;
        dVar2.setVisibility(8);
        this.q1.setAlpha(0.0f);
        this.q1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.q1.setOnClickListener(new u9(this, i21));
        this.i0.addView(this.q1, h7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        i6 i6Var2 = new i6(activity);
        i6Var2.b = new ArrayList();
        i6Var2.e = true;
        i6Var2.h = true;
        View view = new View(activity);
        i6Var2.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        i6Var2.addView(view, h7.z5.e(-1, -1, 119));
        i6Var2.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        i6Var2.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        i6Var2.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        i6Var2.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        i6Var2.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        i6Var2.d = string;
        i6Var2.e = true;
        h6 h6Var = new h6(i6Var2, activity, string, true);
        i6Var2.c = h6Var;
        h6Var.setContentDescription(LocaleController.getString(R.string.Send));
        i6Var2.addView(i6Var2.c, h7.z5.c(-2.0f, -2));
        i6Var2.e();
        this.X0 = i6Var2;
        i6Var2.setVisibility(8);
        this.X0.setOnClickListener(new t9(this, i18));
        this.i0.addView(this.X0, h7.z5.e(-1, 52, 23));
        fc fcVar = new fc(activity);
        this.l1 = fcVar;
        fcVar.setAlpha(0.0f);
        this.l1.setVisibility(8);
        this.d0.addView(this.l1, h7.z5.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        j6 j6Var = new j6(activity, i10, bVar);
        this.k1 = j6Var;
        this.d0.addView(j6Var, h7.z5.e(-1, -1, 119));
        m0(false);
    }

    public static sb E(Activity activity, int i10) {
        sb sbVar = B2;
        if (sbVar != null && (sbVar.b != activity || sbVar.c != i10)) {
            sbVar.q(false);
            B2 = null;
        }
        if (B2 == null) {
            B2 = new sb(activity, i10);
        }
        return B2;
    }

    public static void a(sb sbVar) {
        wa waVar = sbVar.x0;
        if (waVar == null || waVar.getTextureView() == null) {
            sbVar.Y1 = false;
            return;
        }
        Bitmap bitmap = sbVar.x0.getTextureView().getBitmap();
        if (bitmap == null) {
            sbVar.Y1 = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = 0;
            while (i11 < 10) {
                i11++;
                f10 += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i10 + 1) * width, i11 * height));
            }
        }
        float f11 = f10 / 100.0f;
        bitmap.recycle();
        sbVar.Y1 = f11 < 0.22f;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(sb sbVar) {
        Activity activity = sbVar.b;
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

    public static void c(sb sbVar) {
        ValueAnimator valueAnimator = sbVar.f2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            sbVar.f2 = null;
        }
        int i10 = 0;
        sbVar.g2 = false;
        kb kbVar = sbVar.r;
        float f10 = kbVar.a;
        float f11 = kbVar.b;
        kbVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        sbVar.f2 = ofFloat;
        ofFloat.addUpdateListener(new ha(sbVar, f10, f11, i10));
        sbVar.f2.setDuration(340L);
        sbVar.f2.setInterpolator(er.h);
        sbVar.f2.addListener(new ra(sbVar, i10));
        sbVar.f2.start();
    }

    public static boolean d(sb sbVar) {
        Activity activity = sbVar.b;
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
        spannableString.setSpan(new ab(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        sb sbVar = B2;
        if (sbVar != null) {
            sbVar.q(false);
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
        z7 z7Var = this.G1;
        if (z7Var != null) {
            return z7Var.r();
        }
        return 1;
    }

    public final String C() {
        wa waVar = this.x0;
        if (waVar == null || waVar.getCameraSession() == null) {
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
            this.g0.addView(v0Var, h7.z5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.J0;
    }

    public final String F() {
        wa waVar = this.x0;
        if (waVar == null || waVar.getCameraSession() == null) {
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
            oi0 oi0Var = new oi0(R.raw.sun_outline, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d1 = oi0Var;
            oi0Var.h = true;
            z7 z7Var = this.G1;
            if (z7Var == null || !z7Var.y0) {
                oi0Var.N(0);
                this.d1.K(0);
            } else {
                oi0Var.K(35);
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
            this.e1.setOnClickListener(new u9(this, 0));
            this.e1.setVisibility(8);
            this.e1.setImageDrawable(this.d1);
            this.e1.setAlpha(0.0f);
            this.f0.addView(this.e1, 0, h7.z5.q(46, 56, 53));
        }
        return this.e1;
    }

    public final void H() {
        va vaVar = this.r1;
        if (vaVar == null) {
            return;
        }
        this.r2 = null;
        vaVar.getTopLayout().setAlpha(0.0f);
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
        sa saVar;
        if (this.S || (saVar = this.I0) == null) {
            return false;
        }
        return saVar.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
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
        z7 z7Var;
        z7 z7Var2;
        d dVar;
        org.telegram.ui.ActionBar.h5 h5Var;
        int i11;
        int i12;
        float dp;
        ImageView imageView;
        z7 z7Var3;
        z7 z7Var4;
        z7 z7Var5;
        z7 z7Var6;
        wa waVar;
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
        i6 i6Var = this.X0;
        if (i6Var != null) {
            i6Var.b(i10 == 1, z10);
        }
        z zVar = this.E0;
        i0(i10 == 0 && this.K1 == 1 && !zVar.e && !I(), z10);
        if (i10 != 1) {
            this.W0.a(z10);
        }
        c0(this.j0, !zVar.e, z10);
        c0(this.A0, (this.W1 || i10 != 0 || zVar.e || this.U1 == null || I()) ? false : true, z10);
        boolean z11 = this.W1;
        gb gbVar = this.w0;
        c0(this.B0, (z11 || i10 != 0 || (waVar = this.x0) == null || !waVar.a || zVar.e || gbVar.j()) ? false : true, true);
        c0(this.C0, (this.W1 || i10 != 0 || zVar.e) ? false : true, z10);
        m0(z10);
        u0 u0Var = this.a1;
        ag.t0 t0Var = this.f1;
        ri0 ri0Var = this.c1;
        cc ccVar = this.p1;
        cc ccVar2 = this.V0;
        d dVar2 = this.q1;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.l0;
        ib ibVar = this.Y0;
        u3 u3Var = this.Q0;
        u3 u3Var2 = this.P0;
        i7 i7Var = this.z0;
        hb hbVar = this.T0;
        ag.p1 p1Var = this.h0;
        la laVar = this.M0;
        y6 y6Var = this.K0;
        if (!z10) {
            wa waVar2 = this.x0;
            if (waVar2 != null) {
                waVar2.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            }
            hbVar.setAlpha(((i10 != 1 || gbVar.j()) && i10 != 2) ? 0.0f : 1.0f);
            gbVar.setAlpha((i10 == 0 || (i10 == 1 && gbVar.j())) ? 1.0f : 0.0f);
            y6Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            y6Var.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            i7Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            laVar.setAlpha((i10 != 0 || I()) ? 0.0f : 1.0f);
            laVar.setTranslationY((i10 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            u3Var2.setAlpha((i10 == 0 && this.W1 && !I()) ? 1.0f : 0.0f);
            u3Var.setAlpha((i10 == 0 && !this.W1 && I()) ? 0.6f : 0.0f);
            p1Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
            p1Var.setTranslationY((i10 == 1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            ibVar.setAlpha(i10 == 2 ? 0.0f : 1.0f);
            ri0Var.setAlpha((i10 == 1 && this.K1 == 1) ? 1.0f : 0.0f);
            t0Var.setAlpha((i10 != 1 || (this.K1 != 1 && ((z7Var2 = this.G1) == null || TextUtils.isEmpty(z7Var2.y)))) ? 0.0f : 1.0f);
            int i14 = 1;
            u0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.e1;
            if (imageView2 != null) {
                imageView2.setAlpha((i10 == 1 && (z7Var = this.G1) != null && z7Var.u) ? 1.0f : 0.0f);
                i14 = 1;
            }
            ccVar2.setAlpha(i10 == i14 ? 1.0f : 0.0f);
            ccVar.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            h5Var2.setAlpha((i10 == i14 || i10 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            N(i13, i10);
            return;
        }
        this.e2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        wa waVar3 = this.x0;
        if (waVar3 != null) {
            dVar = dVar2;
            h5Var = h5Var2;
            i11 = 1;
            arrayList.add(ObjectAnimator.ofFloat(waVar3, (Property<wa, Float>) View.ALPHA, i10 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            h5Var = h5Var2;
            i11 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i11];
        fArr[0] = ((i10 != i11 || gbVar.j()) && i10 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(hbVar, (Property<hb, Float>) property, fArr));
        float[] fArr2 = new float[i11];
        fArr2[0] = (i10 == 0 || (i10 == i11 && gbVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(gbVar, (Property<gb, Float>) property, fArr2));
        float[] fArr3 = new float[i11];
        fArr3[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(y6Var, (Property<y6, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i11];
        fArr4[0] = i10 == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(y6Var, (Property<y6, Float>) property2, fArr4));
        float[] fArr5 = new float[i11];
        fArr5[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(i7Var, (Property<i7, Float>) property, fArr5));
        float[] fArr6 = new float[i11];
        fArr6[0] = (i10 != 0 || I()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property2, (i10 != 0 || I()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u3Var2, (Property<u3, Float>) property, (i10 == 0 && this.W1 && !I()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u3Var, (Property<u3, Float>) property, (i10 == 0 && !this.W1 && I()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property, ((i10 == 1 && ((z7Var6 = this.G1) == null || z7Var6.J0 == 0)) || i10 == 2) ? 1.0f : 0.0f));
        if (i10 == 1 && ((z7Var5 = this.G1) == null || z7Var5.J0 == 0)) {
            i12 = 2;
        } else {
            i12 = 2;
            if (i10 != 2) {
                dp = AndroidUtilities.dp(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property2, dp));
                arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property, i10 != i12 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ccVar2, (Property<cc, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ccVar, (Property<cc, Float>) property, i10 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property, (i10 == 1 || this.K1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, (i10 == 1 || (this.K1 != 1 && ((z7Var4 = this.G1) == null || TextUtils.isEmpty(z7Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                imageView = this.e1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 && (z7Var3 = this.G1) != null && z7Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<k81, Float>) property, 0.0f));
                this.e2.playTogether(arrayList);
                this.e2.addListener(new qa(this, i13, i10, 0));
                this.e2.setDuration(460L);
                this.e2.setInterpolator(er.h);
                this.e2.start();
            }
        }
        dp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property2, dp));
        arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property, i10 != i12 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ccVar2, (Property<cc, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ccVar, (Property<cc, Float>) property, i10 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property, (i10 == 1 || this.K1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, (i10 == 1 || (this.K1 != 1 && ((z7Var4 = this.G1) == null || TextUtils.isEmpty(z7Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        imageView = this.e1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<k81, Float>) property, 0.0f));
        this.e2.playTogether(arrayList);
        this.e2.addListener(new qa(this, i13, i10, 0));
        this.e2.setDuration(460L);
        this.e2.setInterpolator(er.h);
        this.e2.start();
    }

    public final void L(Runnable runnable, long j10) {
        if (this.O1 || this.G1 == null) {
            return;
        }
        y9 y9Var = this.c2;
        if (y9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y9Var);
        }
        this.d2 = true;
        this.O1 = true;
        this.c2 = new y9(this, runnable, 1);
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
        z7 z7Var;
        z7 z7Var2;
        z7 z7Var3;
        va vaVar;
        z7 z7Var4;
        va vaVar2;
        va vaVar3;
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ib ibVar = this.Y0;
            if (ibVar != null && ibVar.K1) {
                ibVar.J1 = false;
                ibVar.z(false, false);
                return false;
            }
            if (this.M1) {
                y6 y6Var = this.K0;
                if (y6Var.n0) {
                    y6Var.n0 = false;
                    y6Var.r0 = SystemClock.elapsedRealtime();
                    y6Var.q0 = true;
                    ((oa) y6Var.a).d(false);
                    y6Var.F.c(false);
                    y6Var.G.c(false);
                    y6Var.H.c(false);
                    y6Var.invalidate();
                    return false;
                }
            } else if (!this.L1 && !ibVar.p()) {
                ka kaVar = this.Z0;
                if (kaVar.I) {
                    kaVar.c(false, true);
                    return false;
                }
                sa saVar = this.I0;
                if (saVar != null) {
                    org.telegram.ui.ActionBar.v0 v0Var = saVar.C;
                    if (v0Var == null || !v0Var.s()) {
                        f(false);
                        this.i2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = v0Var.getSearchField();
                    if (saVar.v.c()) {
                        AndroidUtilities.hideKeyboard(searchField);
                        return false;
                    }
                    saVar.x.w(v0Var.L(true));
                    return false;
                }
                if (this.c0 != 0 || (vaVar3 = this.r1) == null || !vaVar3.y0()) {
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
                    if (this.b0 == 1 && (((z7Var2 = this.G1) == null || (!z7Var2.n && !z7Var2.u)) && !this.q0)) {
                        if (z7Var2 != null && z7Var2.g && ((vaVar2 = this.r1) == null || !vaVar2.u0())) {
                            z7 z7Var5 = this.G1;
                            if (!z7Var5.j) {
                            }
                        }
                        va vaVar4 = this.r1;
                        if (vaVar4 == null || !vaVar4.y0()) {
                            if (this.r0 == 0 && (((this.H1 && !this.w0.j() && (((vaVar = this.r1) == null || !vaVar.u0()) && ((z7Var4 = this.G1) == null || z7Var4.Z0 == null))) || !this.X0.h) && (((z7Var3 = this.G1) == null || !z7Var3.g || (!z7Var3.n && !z7Var3.u)) && !this.q0 && (z7Var3 == null || !z7Var3.o)))) {
                                K(0, true);
                                return false;
                            }
                            if (this.r0 != 0) {
                                q(true);
                                return false;
                            }
                            Activity activity = this.b;
                            jh.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardChanges);
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                            z7 z7Var6 = this.G1;
                            if (z7Var6 != null && !z7Var6.g && !z7Var6.o) {
                                alertDialog$Builder.i(LocaleController.getString(z7Var6.c ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new ba(this, 8));
                            }
                            z7 z7Var7 = this.G1;
                            alertDialog$Builder.k(LocaleController.getString((z7Var7 == null || !z7Var7.c || z7Var7.g) ? R.string.Discard : R.string.StoryDeleteDraft), new ba(this, 9));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.show();
                            View d = b2Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.g6.q7;
                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, bVar));
                                d.setBackground(org.telegram.ui.ActionBar.g6.Y(i0.b.k(org.telegram.ui.ActionBar.g6.v0(i11, bVar), 51), 6, 6));
                            }
                        }
                    }
                    if (this.b0 != 2 || (z7Var = this.G1) == null || z7Var.b0) {
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
            z7 z7Var = this.G1;
            if (z7Var == null || !z7Var.n) {
                u();
                H();
            }
            te0 te0Var = this.y1;
            if (te0Var != null) {
                te0Var.setAllowTouch(false);
            }
            this.T0.x(2, false);
            this.T0.x(3, false);
            this.T0.x(4, false);
            this.T0.x(5, false);
            this.T0.x(7, false);
            z7 z7Var2 = this.G1;
            this.W0.setVisibility((z7Var2 == null || z7Var2.h0 < 30000) ? 8 : 0);
            this.h0.setAlpha(1.0f);
            this.h0.setTranslationY(0.0f);
            z7 z7Var3 = this.G1;
            this.Y0.setVisibility((z7Var3 == null || z7Var3.J0 == 0) ? 0 : 8);
        }
        if (i11 == 0 && this.R1) {
            D().setVisibility(0);
            v0 D = D();
            D.r.d(0.0f, true);
            D.a(true);
            kh.c cVar = D.h;
            if (cVar != null) {
                AndroidUtilities.cancelRunOnUIThread(cVar);
            }
            kh.c cVar2 = new kh.c(D, 6);
            D.h = cVar2;
            AndroidUtilities.runOnUIThread(cVar2, 3500L);
            this.K0.h();
        }
        this.R1 = false;
        te0 te0Var2 = this.y1;
        if (te0Var2 != null) {
            te0Var2.setAllowTouch(i11 == 1 && ((i12 = this.c0) == -1 || i12 == 1));
        }
        ib ibVar = this.Y0;
        if (ibVar != null) {
            ibVar.a0 = i11 != 1;
        }
        if (i11 == 1) {
            int i13 = this.c;
            MediaDataController.getInstance(i13).checkStickers(0);
            MediaDataController.getInstance(i13).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i13).loadRecents(2, false, true, false);
            jh.s6 storiesController = MessagesController.getInstance(i13).getStoriesController();
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
        z7 z7Var;
        z7 z7Var2;
        boolean z10;
        z7 z7Var3;
        z7 z7Var4;
        z7 z7Var5;
        a61 textureView;
        z7 z7Var6;
        boolean z11 = true;
        if (i11 == 0) {
            Z(false);
            this.K0.setVisibility(0);
            y6 y6Var = this.K0;
            if (y6Var != null) {
                y6Var.g(false);
            }
            this.M0.setVisibility(0);
            this.R0.setVisibility(0);
            this.R0.setAlpha(0.0f);
            this.F0.a(0L, true);
            z7 z7Var7 = this.G1;
            if (z7Var7 != null) {
                z7Var7.i(false);
                this.G1 = null;
            }
            gb gbVar = this.w0;
            if (gbVar != null) {
                gbVar.e();
                this.K0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new s9(this, 18));
            v0 v0Var = this.J0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.S0.e(true);
            w3 w3Var = this.h1;
            if (w3Var != null) {
                w3Var.e(true);
            }
        }
        int i12 = this.c;
        if (i11 == 1 || i10 == 1) {
            this.a1.setEntry(i11 == 1 ? this.G1 : null);
            if (this.K1 == 1) {
                this.c1.setVisibility(0);
                z7 z7Var8 = this.G1;
                f0(z7Var8 != null && z7Var8.Y, false);
                this.f1.setVisibility(0);
                this.T0.x(-9982, false);
                ((tf0) this.f1.c).a(this.T0.k(), false);
                this.l0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                z7 z7Var9 = this.G1;
                if (z7Var9 == null || TextUtils.isEmpty(z7Var9.y)) {
                    this.l0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.c1.setVisibility(8);
                    this.f1.setVisibility(0);
                    ((tf0) this.f1.c).a(true, false);
                    this.l0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.a1.setVisibility(0);
            z7 z7Var10 = this.G1;
            if (z7Var10 == null || !z7Var10.u) {
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
            z7 z7Var11 = this.G1;
            this.Y0.setVisibility(((z7Var11 == null || z7Var11.J0 == 0) && this.r0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U0.getLayoutParams();
            z7 z7Var12 = this.G1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((z7Var12 == null || z7Var12.J0 == 0) && this.r0 == 0) ? 68.0f : 12.0f);
            this.U0.setLayoutParams(layoutParams);
            this.h0.setVisibility(0);
            this.h0.clearFocus();
            z7 z7Var13 = this.G1;
            this.Y0.A(z7Var13 == null ? 86400 : z7Var13.I0, false);
            this.Y0.setPeriodVisible(!MessagesController.getInstance(i12).premiumFeaturesBlocked() && ((z7Var = this.G1) == null || !z7Var.g));
            z7 z7Var14 = this.G1;
            this.Y0.setHasRoundVideo((z7Var14 == null || z7Var14.o0 == null) ? false : true);
            ib ibVar = this.Y0;
            if (ibVar == null) {
                j10 = 0;
            } else {
                z7 z7Var15 = this.G1;
                if (z7Var15 == null || !z7Var15.n) {
                    j10 = 0;
                    ibVar.v(null, null);
                } else {
                    TLRPC.Peer peer = z7Var15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i12).getUser(Long.valueOf(peer.user_id)));
                        z7 z7Var16 = this.G1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        z7Var16.p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        z7 z7Var17 = this.G1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        z7Var17.p = append;
                    }
                    String str2 = this.G1.s;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    String str3 = str2;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new pa(), 0, spannableString.length(), 33);
                        str3 = spannableString;
                    }
                    this.Y0.v(str3, append);
                }
            }
            z7 z7Var18 = this.G1;
            boolean z12 = (z7Var18 != null && z7Var18.v() && this.G1.t()) ? false : true;
            cc ccVar = this.V0;
            boolean z13 = ccVar.f0;
            ccVar.f0 = z12;
            ccVar.e0.f(z12, true);
            ccVar.invalidate();
        } else {
            j10 = 0;
        }
        if (i11 == 2 || i10 == 2) {
            this.l0.setVisibility(0);
            this.p1.setVisibility(0);
            z7 z7Var19 = this.G1;
            if (z7Var19 != null && z7Var19.b0) {
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
            z7 z7Var20 = this.G1;
            boolean z14 = (z7Var20 == null || z7Var20.J0 == j10) ? false : true;
            boolean z15 = z7Var20 != null && z7Var20.g;
            String string = LocaleController.getString(z15 ? R.string.Done : z14 ? R.string.UploadBotPreview : R.string.Next);
            boolean z16 = !z14;
            i6 i6Var = this.X0;
            if (!TextUtils.equals(string, i6Var.d) || z16 != i6Var.e) {
                i6Var.removeView(i6Var.c);
                Context context = i6Var.getContext();
                i6Var.d = string;
                i6Var.e = z16;
                h6 h6Var = new h6(i6Var, context, string, z16);
                i6Var.c = h6Var;
                h6Var.setContentDescription(string);
                i6Var.addView(i6Var.c, h7.z5.c(-2.0f, -2));
                i6Var.e();
            }
            this.p1.setVisibility(8);
            this.q1.setVisibility(8);
            if (!this.d2) {
                z7 z7Var21 = this.G1;
                if (z7Var21 == null || !z7Var21.u) {
                    this.T0.set(z7Var21);
                } else {
                    this.T0.l(z7Var21);
                }
            }
            this.d2 = false;
            this.Y0.f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i12).storyEntitiesAllowed() ? null : new s9(this, 19));
            this.Z0.setVisibility(this.D1 == null ? 8 : 0);
            ArrayList arrayList = this.D1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.F1;
                ArrayList arrayList3 = this.E1;
                ka kaVar = this.Z0;
                kaVar.c(false, false);
                kaVar.c = arrayList;
                kaVar.d = arrayList2;
                kaVar.e = arrayList3;
                kaVar.w = new pz0(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                kaVar.G = new pz0(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                kaVar.b.U2.N(false);
                this.Z0.setSelected(this.D1.indexOf(this.G1));
            }
            this.V0.setMaxCount((z14 || z15 || this.D1 != null || ((z7Var6 = this.G1) != null && (z7Var6.v() || !this.G1.K))) ? 1 : 3);
            if (i10 != 2) {
                z7 z7Var22 = this.G1;
                if (z7Var22 != null && (z7Var22.c || z7Var22.g || this.q0)) {
                    if (z7Var22.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    z7 z7Var23 = this.G1;
                    if (z7Var23.K && z7Var23.a1 != null && (textureView = this.T0.getTextureView()) != null) {
                        textureView.setDelegate(new ba(this, 7));
                    }
                    this.Y0.setText(this.G1.C0);
                } else if (i10 != 2) {
                    ib ibVar2 = this.Y0;
                    ibVar2.R = true;
                    ibVar2.f.setText("");
                }
            }
            z7 z7Var24 = this.G1;
            this.X0.d(4, z7Var24 == null || ((!z7Var24.u || z7Var24.K) && !z7Var24.v()));
            this.X0.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (z7Var5 = this.G1) == null || z7Var5.u || z7Var5.v()) ? false : true);
            if (!this.J1 && !this.Y0.o()) {
                jh.s6 storiesController = MessagesController.getInstance(i12).getStoriesController();
                int B = B();
                jh.l6 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.a, B) || ((z7Var4 = this.G1) != null && (z7Var4.g || z7Var4.J0 != j10))) {
                    z10 = true;
                    this.X0.setShareEnabled(z10);
                    z7 z7Var25 = this.G1;
                    this.c1.setImageResource((z7Var25 == null && z7Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    this.T0.setVisibility(0);
                    this.V0.setVisibility(0);
                    this.l0.setVisibility(0);
                    this.l0.setTranslationX(0.0f);
                    z7Var3 = this.G1;
                    if (z7Var3 == null && z7Var3.J0 != j10) {
                        this.l0.l("", false);
                    } else if (z7Var3 == null && z7Var3.g) {
                        this.l0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (z7Var3 == null && z7Var3.u) {
                        this.l0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (z7Var3 == null && z7Var3.n) {
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
            z7 z7Var252 = this.G1;
            this.c1.setImageResource((z7Var252 == null && z7Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            this.T0.setVisibility(0);
            this.V0.setVisibility(0);
            this.l0.setVisibility(0);
            this.l0.setTranslationX(0.0f);
            z7Var3 = this.G1;
            if (z7Var3 == null) {
            }
            if (z7Var3 == null) {
            }
            if (z7Var3 == null) {
            }
            if (z7Var3 == null) {
            }
            this.l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z11 = true;
        }
        if (i10 == z11) {
            ib ibVar3 = this.Y0;
            b70 b70Var = ibVar3.R0;
            if (b70Var != null) {
                b70Var.u();
                ibVar3.R0 = null;
            }
            this.g1.e(z11);
            ka kaVar2 = this.Z0;
            if (kaVar2.I) {
                kaVar2.c(false, z11);
            }
        }
        if (i11 == 2 && (z7Var2 = this.G1) != null) {
            if (z7Var2.e0 < j10) {
                z7Var2.e0 = j10;
            }
            this.I1 = z7Var2.e0;
            long duration = this.T0.getDuration() < 100 ? this.G1.h0 : this.T0.getDuration();
            z7 z7Var26 = this.G1;
            if (z7Var26.h0 <= 0) {
                z7Var26.h0 = duration;
            }
            File file = z7Var26.Z0;
            if (file == null) {
                file = z7Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            z7 z7Var27 = this.G1;
            this.p1.o(false, absolutePath, z7Var27.h0, z7Var27.P);
            z7 z7Var28 = this.G1;
            float f10 = duration;
            long j11 = (long) (z7Var28.Z * f10);
            long j12 = (long) (z7Var28.a0 * f10);
            cc ccVar2 = this.p1;
            ccVar2.V0 = j11;
            ccVar2.W0 = j12;
            xb xbVar = ccVar2.h;
            if (xbVar != null) {
                xb.a(xbVar, true);
            }
            a8 a8Var = new a8(this, 1);
            this.p1.setDelegate(new ta(a8Var));
            float max = (this.I1 / Math.max(1L, duration)) * 0.96f;
            this.p1.setVideoLeft(max);
            this.p1.setVideoRight(0.04f + max);
            a8Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        te0 te0Var = this.y1;
        if (te0Var != null) {
            te0Var.setAllowTouch(false);
        }
        w3 w3Var2 = this.i1;
        if (w3Var2 != null) {
            w3Var2.e(true);
        }
        org.telegram.ui.Components.ec.e();
        ib ibVar4 = this.Y0;
        if (ibVar4 != null) {
            g gVar = ibVar4.f;
            gVar.d();
            gVar.k(true);
            this.Y0.a0 = true;
        }
        hb hbVar = this.T0;
        if (hbVar != null) {
            hbVar.x(8, i11 != 1);
        }
        va vaVar = this.r1;
        if (vaVar != null) {
            vaVar.setCoverPreview(i11 != 1);
        }
        w3 w3Var3 = this.j1;
        if (w3Var3 != null) {
            w3Var3.e(true);
        }
        gb gbVar2 = this.w0;
        gbVar2.setPreview(i11 == 1 && gbVar2.j());
    }

    public final void P() {
        yf.z0 z0Var;
        boolean z10 = false;
        if (this.b0 == 0) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.t2 = new s9(this, 3);
            }
        }
        ib ibVar = this.Y0;
        if (ibVar != null) {
            ibVar.f.s();
        }
        y6 y6Var = this.K0;
        if (y6Var != null) {
            y6Var.h();
        }
        j6 j6Var = this.k1;
        if (j6Var != null) {
            jh.s6 storiesController = MessagesController.getInstance(j6Var.a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.i.f(UserConfig.getInstance(storiesController.a).clientUserId);
            j6Var.b = storiesController.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            j6Var.c.invalidate();
        }
        va vaVar = this.r1;
        if (vaVar != null && (z0Var = vaVar.K0.d) != null) {
            z0Var.postRunnable(z0Var.w);
        }
        hb hbVar = this.T0;
        if (hbVar != null) {
            hbVar.x(0, false);
        }
        a1 a1Var = MessagesController.getInstance(this.c).getStoriesController().w;
        if (a1Var.c || a1Var.d) {
            return;
        }
        a1Var.d = true;
        x0 x0Var = new x0(a1Var, 1);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.a);
        messagesStorage.getStorageQueue().postRunnable(new hh.t5(messagesStorage, z10, x0Var, 3));
    }

    public final void Q(int i10, int i11) {
        va vaVar;
        db dbVar;
        eb ebVar;
        va vaVar2;
        if (i11 == 0) {
            this.j0.setVisibility(8);
        }
        if (i10 == 0 && (vaVar2 = this.r1) != null) {
            vaVar2.setVisibility(8);
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
        if ((i11 == 0 || i10 == 0) && (vaVar = this.r1) != null) {
            vaVar.Z0.setLayerType(0, null);
        }
        te0 te0Var = this.y1;
        if (te0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            te0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            db dbVar2 = this.n1;
            if (dbVar2 != null) {
                dbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (dbVar = this.n1) != null) {
            dbVar.setVisibility(8);
            this.n1.setAppearProgress(0.0f);
            db dbVar3 = this.n1;
            dbVar3.x = null;
            g0 g0Var = dbVar3.f;
            g0Var.H = null;
            g0Var.d = null;
            g0Var.F = false;
            dbVar3.d.setVisibility(8);
            dbVar3.a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            eb ebVar2 = this.o1;
            if (ebVar2 != null) {
                ebVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i10 != 4 || (ebVar = this.o1) == null) {
            return;
        }
        ebVar.setVisibility(8);
        this.o1.setAppearProgress(0.0f);
        eb ebVar3 = this.o1;
        ebVar3.b = null;
        g0 g0Var2 = ebVar3.h;
        g0Var2.H = null;
        g0Var2.d = null;
        g0Var2.F = false;
        ebVar3.e.setVisibility(8);
        ebVar3.setVisibility(8);
    }

    public final void R(mb mbVar) {
        jh.l6 o10;
        rb rbVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.q0 = false;
        this.e = false;
        this.x2 = false;
        this.o0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (rbVar = this.n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
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
        if (mbVar != null) {
            this.B = mbVar;
            this.F = mbVar.a;
            rectF.set(mbVar.c);
            this.C = mbVar.b;
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
        g(1.0f, true, new s9(this, 6));
        e();
        this.r0 = 0L;
        this.s0 = "";
    }

    public final void S(lb lbVar, z7 z7Var, long j10) {
        rb rbVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.q0 = false;
        this.e = false;
        this.x2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (rbVar = this.n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.G1 = z7Var;
        this.K1 = z7Var.K ? 1 : 0;
        this.o0.g = false;
        RectF rectF = this.D;
        if (lbVar != null) {
            this.B = lbVar;
            this.F = lbVar.a;
            rectF.set(lbVar.c);
            this.C = lbVar.b;
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
        z7 z7Var2 = this.G1;
        if (z7Var2 != null) {
            this.Y0.setText(z7Var2.C0);
        }
        L(new ja(this, 0), j10);
        K(this.G1.b0 ? 2 : 1, false);
        l0(-1, false, false);
        this.X0.b(false, false);
        e();
        this.r0 = 0L;
        this.s0 = "";
    }

    public final void T() {
        b70 b70Var;
        hb hbVar = this.T0;
        if (hbVar != null) {
            hbVar.x(4, true);
        }
        ib ibVar = this.Y0;
        if (ibVar != null && (b70Var = ibVar.R0) != null) {
            b70Var.u();
            ibVar.R0 = null;
        }
        ag.g2 g2Var = new ag.g2((org.telegram.ui.ActionBar.n2) new xa(this, 1), 14, false);
        g2Var.setOnDismissListener(new ga(this, 1));
        g2Var.show();
    }

    public final void U(lb lbVar, z7 z7Var) {
        jh.l6 o10;
        rb rbVar;
        if (this.d) {
            return;
        }
        int i10 = this.c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.q0 = true;
        this.e = false;
        this.x2 = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (rbVar = this.n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.G1 = z7Var;
        r9.a(i10, z7Var);
        z7 z7Var2 = this.G1;
        int i11 = (z7Var2 == null || !z7Var2.K) ? 0 : 1;
        this.K1 = i11;
        this.o0.g = z7Var2 != null && z7Var2.u && i11 == 1;
        if (this.r0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            h0(o10, true);
        }
        RectF rectF = this.D;
        if (lbVar != null) {
            this.B = lbVar;
            this.F = lbVar.a;
            rectF.set(lbVar.c);
            this.C = lbVar.b;
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
        z7 z7Var3 = this.G1;
        if (z7Var3 != null) {
            this.Y0.setText(z7Var3.C0);
        }
        this.X0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new s9(this, 6));
        e();
        this.r0 = 0L;
        this.s0 = "";
    }

    public final void V() {
        yf.b1 b1Var = this.s1;
        if (b1Var != null) {
            b1Var.bringToFront();
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
        fc fcVar = this.l1;
        if (fcVar != null) {
            fcVar.bringToFront();
        }
        te0 te0Var = this.y1;
        if (te0Var != null) {
            te0Var.bringToFront();
        }
        ke0 ke0Var = this.A1;
        if (ke0Var != null) {
            ke0Var.bringToFront();
        }
        me0 me0Var = this.B1;
        if (me0Var != null) {
            me0Var.bringToFront();
        }
        j6 j6Var = this.k1;
        if (j6Var != null) {
            j6Var.bringToFront();
        }
        q qVar = this.m1;
        if (qVar != null) {
            qVar.bringToFront();
        }
    }

    public final void W(z7 z7Var, boolean z10) {
        z7 z7Var2;
        boolean z11;
        if (z7Var == null || this.T0.getWidth() <= 0 || this.T0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? z7Var.O0 : z7Var.N0;
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
        a61 textureView = this.T0.getTextureView();
        if (z7Var.K && !z7Var.u && textureView != null) {
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
        File file2 = z7Var.Q0;
        if (file2 != null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                canvas.save();
                float width2 = width / decodeFile.getWidth();
                canvas.scale(width2, width2);
                canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile.recycle();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        File file3 = z7Var.P0;
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
        va vaVar = this.r1;
        if (vaVar != null && vaVar.N0 != null) {
            canvas.save();
            canvas.scale(f10, f10);
            va vaVar2 = this.r1;
            vaVar2.E0 = true;
            z5 z5Var = vaVar2.N0;
            z5Var.a = true;
            z5Var.draw(canvas);
            va vaVar3 = this.r1;
            vaVar3.N0.a = false;
            vaVar3.E0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = z7.w(this.c, "jpg");
        if (z10) {
            z7Var2 = z7Var;
            z11 = z10;
            Utilities.searchQueue.postRunnable(new cg.j(this, createBitmap, z11, w10, z7Var2, 2));
        } else {
            z7Var2 = z7Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        if (!z11) {
            z7Var2.N0 = w10;
        }
        z7Var2.b1 = createScaledBitmap;
    }

    public final void X() {
        jh.l6 o10;
        char c10;
        q9 q9Var = this.m0;
        BitmapDrawable bitmapDrawable = null;
        if (q9Var != null) {
            q9Var.dismiss();
            this.m0 = null;
        }
        if (this.J1) {
            u0 u0Var = this.a1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            h6 h6Var = this.X0.c;
            int i10 = -this.Q1;
            this.Q1 = i10;
            AndroidUtilities.shakeViewSpring(h6Var, i10);
            return;
        }
        ib ibVar = this.Y0;
        if (ibVar != null && ibVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.j6 j6Var = ibVar.v;
            int i11 = -this.Q1;
            this.Q1 = i11;
            AndroidUtilities.shakeViewSpring(j6Var, i11);
            ibVar.e();
            return;
        }
        z7 z7Var = this.G1;
        int i12 = this.c;
        int i13 = 0;
        if ((z7Var == null || (!z7Var.g && z7Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, B())) {
            h0(o10, false);
            return;
        }
        this.G1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        jh.b bVar = this.a;
        if (ibVar != null && !this.G1.D0) {
            CharSequence text = ibVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((yz0[]) spannable.getSpans(0, text.length(), yz0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.mc(this.n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.g6.gc, 0, new s9(this, 27), bVar)).k(true);
                    int i14 = -this.Q1;
                    this.Q1 = i14;
                    AndroidUtilities.shakeViewSpring(ibVar, i14);
                    return;
                }
            }
        }
        z7 z7Var2 = this.G1;
        if (z7Var2.g || z7Var2.J0 != 0) {
            z7Var2.l = false;
            i(null);
            p0();
            return;
        }
        if (this.J != 0) {
            z7Var2.v0 = MessagesController.getInstance(i12).getInputPeer(this.J);
        }
        hb hbVar = this.T0;
        hbVar.x(3, true);
        q9 q9Var2 = new q9(this.b, this.G1.I0, bVar);
        q9Var2.q1(this.G1.E0);
        q9Var2.p1(this.G1.v0);
        q9Var2.B = this.I;
        q9Var2.Q = new t9(this, 14);
        q9Var2.e1(!this.w0.j());
        ArrayList arrayList = this.E1;
        q9Var2.m1(arrayList == null ? this.G1.r() : arrayList.size());
        q9Var2.k1(false);
        CharSequence text2 = ibVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (u41 u41Var : (u41[]) ((Spanned) text2).getSpans(0, text2.length(), u41.class)) {
                if (u41Var != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(u41Var.getURL())));
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
        q9Var2.O = arrayList2;
        q9Var2.S = new t9(this, 15);
        q9Var2.T = new t9(this, 16);
        q9Var2.P = new ba(this, 10);
        this.m0 = q9Var2;
        z7 z7Var3 = this.G1;
        if (z7Var3.K) {
            if (hbVar != null && !z7Var3.f0 && this.b0 != 2) {
                z7Var3.e0 = hbVar.getCurrentPosition();
                t9 t9Var = new t9(this, 17);
                yf.b1 b1Var = this.s1;
                View view = this.v1;
                View[] viewArr = new View[3];
                viewArr[0] = hbVar;
                viewArr[c10] = b1Var;
                viewArr[2] = view;
                hbVar.h(t9Var, viewArr);
            }
            q9 q9Var3 = this.m0;
            Bitmap bitmap = this.G1.g0;
            s9 s9Var = new s9(this, 20);
            if (bitmap != null) {
                q9Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            q9Var3.X = bitmapDrawable;
            q9Var3.Y = s9Var;
            h1 h1Var = q9Var3.b;
            if (h1Var != null) {
                for (View view2 : h1Var.getViewPages()) {
                    if (view2 instanceof k9) {
                        k9 k9Var = (k9) view2;
                        k9Var.g(false);
                        k9Var.e(false);
                    }
                }
            }
        }
        this.m0.setOnDismissListener(new ga(this, i13));
        this.m0.show();
    }

    public final void Y(nb nbVar) {
        int i10 = 0;
        RectF rectF = this.D;
        if (nbVar != null) {
            this.B = nbVar;
            this.F = nbVar.a;
            rectF.set(nbVar.c);
            this.C = nbVar.b;
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
                    dq dqVar = new dq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    dqVar.e = dp;
                    dqVar.f = dp2;
                    this.w0.setCameraThumb(dqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ba(this, 13));
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
                CameraController.getInstance().initCamera(new s9(this, 0));
            }
        }
    }

    public final void b0(Runnable runnable) {
        wa waVar = this.x0;
        if (waVar == null || waVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new j3.m(this, this.x0.getTextureView().getBitmap(), runnable, 18));
        } catch (Throwable unused) {
        }
    }

    public final void c0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new ua(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 2)).setDuration(320L).setInterpolator(er.h).start();
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jh.l6 o10;
        z7 z7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            y6 y6Var = this.K0;
            if (y6Var != null) {
                y6Var.h();
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
            y6 y6Var2 = this.K0;
            if (y6Var2 == null || this.R1) {
                return;
            }
            y6Var2.h();
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.b0;
            int i15 = this.c;
            if (i14 != 1) {
                if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                    z7 z7Var2 = this.G1;
                    if (z7Var2 == null || z7Var2.J0 == 0) {
                        h0(o10, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.J1 && !this.Y0.o()) {
                jh.s6 storiesController = MessagesController.getInstance(i15).getStoriesController();
                int B = B();
                jh.l6 o11 = storiesController.o();
                if (o11 == null || !o11.a(storiesController.a, B) || ((z7Var = this.G1) != null && (z7Var.g || z7Var.J0 != 0))) {
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
        wa waVar = this.x0;
        if ((waVar != null && waVar.isDual()) || this.W1) {
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
        dc dcVar = this.A0;
        if (dcVar.n != i10) {
            dcVar.n = i10;
            ValueAnimator valueAnimator = dcVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                dcVar.r = null;
            }
            dcVar.setDrawable(i10);
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
                this.m2 = new ca(this, z10, 0);
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
            sa saVar = this.I0;
            if (saVar != null) {
                saVar.G = false;
            }
            if (z10 && (v0Var = this.J0) != null) {
                v0Var.a(false);
            }
            kb kbVar = this.r;
            if (kbVar != null) {
                kbVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.I0.setImportantForAccessibility(z10 ? 0 : 4);
            this.l2 = Boolean.valueOf(z10);
            float translationY = this.I0.getTranslationY();
            rb rbVar = this.n;
            float height = z10 ? 0.0f : (rbVar.getHeight() - this.I0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            int i11 = 1;
            Math.max(1, rbVar.getHeight());
            sa saVar2 = this.I0;
            saVar2.G = !z10;
            this.g2 = this.f2 == null;
            if (z10) {
                o1.j jVar2 = new o1.j(saVar2, o1.h.n, height);
                this.k2 = jVar2;
                jVar2.u.a(0.75f);
                this.k2.u.b(350.0f);
                this.k2.a(new da(this, height, i10));
                this.k2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.j2 = ofFloat;
                ofFloat.addUpdateListener(new ea(this, i10));
                this.j2.addListener(new ra(this, i11));
                this.j2.setDuration(450L);
                this.j2.setInterpolator(er.h);
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
            oi0 oi0Var = new oi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.b1 = oi0Var;
            oi0Var.B *= 1.5f;
        }
        this.c1.setAnimation(this.b1);
        if (!z11) {
            this.b1.L(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            oi0 oi0Var2 = this.b1;
            if (oi0Var2.X > 20) {
                oi0Var2.L(0, false, false);
            }
            this.b1.N(20);
            this.b1.start();
            return;
        }
        oi0 oi0Var3 = this.b1;
        int i10 = oi0Var3.X;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        oi0Var3.N(43);
        this.b1.start();
    }

    public final void g(float f10, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A = null;
        }
        kb kbVar = this.r;
        if (!z10) {
            this.H = null;
            this.E = f10;
            k();
            kbVar.invalidate();
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
        ofFloat.addUpdateListener(new ea(this, 5));
        this.A.addListener(new hh.n5(this, f10, runnable, 3));
        if (f10 < 1.0f && this.v) {
            this.A.setDuration(250L);
            this.A.setInterpolator(er.h);
        } else if (f10 > 0.0f || kbVar.a < AndroidUtilities.dp(20.0f)) {
            this.A.setDuration(300L);
            this.A.setInterpolator(new u1.a());
        } else if (f10 >= 0.0f || !this.K) {
            this.A.setDuration(400L);
            this.A.setInterpolator(er.h);
        } else {
            this.A.setDuration(200L);
            this.A.setInterpolator(er.h);
            this.K = false;
        }
        this.A.start();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 3));
        }
    }

    public final void h(boolean z10, boolean z11) {
        z zVar;
        if (z10) {
            w3 w3Var = this.h1;
            if (w3Var != null) {
                w3Var.e(true);
            }
            w3 w3Var2 = this.i1;
            if (w3Var2 != null) {
                w3Var2.e(true);
            }
            w3 w3Var3 = this.g1;
            if (w3Var3 != null) {
                w3Var3.e(true);
            }
            w3 w3Var4 = this.S0;
            if (w3Var4 != null) {
                w3Var4.e(true);
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
        la laVar = this.M0;
        u3 u3Var = this.Q0;
        u3 u3Var2 = this.P0;
        if (!z11) {
            u3Var2.setAlpha((z10 && this.b0 == 0 && !I()) ? 1.0f : 0.0f);
            u3Var2.setTranslationY((z10 && this.b0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            u3Var.setAlpha((!z10 && this.b0 == 0 && I()) ? 0.6f : 0.0f);
            u3Var.setTranslationY((!z10 && this.b0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            laVar.setAlpha((z10 || this.b0 != 0 || I()) ? 0.0f : 1.0f);
            laVar.setTranslationY((z10 || this.b0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.V1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u3Var2, (Property<u3, Float>) property, (z10 && this.b0 == 0 && !I()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(u3Var2, (Property<u3, Float>) property2, (z10 && this.b0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(u3Var, (Property<u3, Float>) property, (!z10 && this.b0 == 0 && I()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(u3Var, (Property<u3, Float>) property2, (!z10 && this.b0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property, (z10 || this.b0 != 0 || I()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property2, (z10 || this.b0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.V1.setDuration(260L);
        this.V1.setInterpolator(er.h);
        this.V1.start();
    }

    public final void h0(jh.l6 l6Var, boolean z10) {
        if (this.v2) {
            return;
        }
        ya yaVar = new ya(l6Var.b(), this.c, this.b, new xa(this, 0), null);
        yaVar.T = B();
        yaVar.setOnDismissListener(new p70(2, this, z10));
        this.T0.x(7, true);
        this.v2 = true;
        yaVar.show();
    }

    public final void i(Runnable runnable) {
        z7 z7Var;
        Runnable runnable2;
        hb hbVar;
        ve0 ve0Var = this.x1;
        if (ve0Var == null || (z7Var = this.G1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        z7Var.j = ve0Var.d() | z7Var.j;
        z7 z7Var2 = this.G1;
        ve0 ve0Var2 = this.x1;
        File file = z7Var2.Z0;
        if (file != null) {
            file.delete();
            z7Var2.Z0 = null;
        }
        MediaController.SavedFilterState savedFilterState = ve0Var2.getSavedFilterState();
        z7Var2.a1 = savedFilterState;
        if (z7Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = ve0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i10 = z7Var2.R;
                    matrix.postScale(i10 == 1 ? -1.0f : 1.0f, i10 == 2 ? -1.0f : 1.0f, z7Var2.k0 / 2.0f, z7Var2.l0 / 2.0f);
                    matrix.postRotate(-z7Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    z7Var2.n0.preScale(z7Var2.k0 / createBitmap.getWidth(), z7Var2.l0 / createBitmap.getHeight());
                    z7Var2.k0 = createBitmap.getWidth();
                    z7Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = z7Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        z7Var2.Z0.delete();
                    }
                    String k10 = z7.k(z7Var2.L);
                    boolean z10 = "png".equals(k10) || "webp".equals(k10);
                    z7Var2.Z0 = z7.w(z7Var2.a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(z7Var2.Z0));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new cg.c(z7Var2, createBitmap, z10, runnable2, 4));
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
            z7 z7Var3 = this.G1;
            if (z7Var3.K || (hbVar = this.T0) == null) {
                return;
            }
            hbVar.set(z7Var3);
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        if (z11) {
            this.F0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(er.h).withEndAction(new ca(this, z10, 1)).start();
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
        k81 k81Var = this.R0;
        if ((k81Var.getTag() != null && z10) || (k81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.a2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                s9 s9Var = new s9(this, 25);
                this.a2 = s9Var;
                AndroidUtilities.runOnUIThread(s9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.b2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        k81Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            k81Var.setVisibility(0);
        }
        this.b2.playTogether(ObjectAnimator.ofFloat(k81Var, (Property<k81, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.b2.addListener(new ag.x(16, this, z10));
        this.b2.start();
        if (z10) {
            s9 s9Var2 = new s9(this, 26);
            this.a2 = s9Var2;
            AndroidUtilities.runOnUIThread(s9Var2, 2000L);
        }
    }

    public final void k() {
        jh.j3 j3Var;
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
        nb nbVar = this.B;
        if (nbVar != null && (j3Var = nbVar.f) != null) {
            j3Var.setTranslationX((rectF.left - rectF2.left) * this.E);
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
        q9 q9Var = this.m0;
        if (q9Var != null) {
            q9Var.dismiss();
            this.m0 = null;
        }
        q9 q9Var2 = new q9(this.b, 86400, this.a);
        q9Var2.o1();
        q9Var2.q1(this.u0);
        TLRPC.InputPeer inputPeer = this.t0;
        if (inputPeer == null) {
            inputPeer = this.J != 0 ? MessagesController.getInstance(this.c).getInputPeer(this.J) : new TLRPC.TL_inputPeerSelf();
        }
        q9Var2.p1(inputPeer);
        q9Var2.B = this.I;
        q9Var2.Q = new t9(this, 18);
        q9Var2.e1(false);
        q9Var2.m1(1);
        q9Var2.k1(false);
        q9Var2.S = new t9(this, 19);
        q9Var2.P = new ba(this, 12);
        this.m0 = q9Var2;
        q9Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        if (r6.isRecycled() != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        z7 z7Var;
        ImageReceiver photoImage;
        if (this.r1 == null || (z7Var = this.G1) == null) {
            return;
        }
        z7Var.f();
        this.G1.j |= this.r1.u0();
        z7 z7Var2 = this.G1;
        ArrayList arrayList = z7Var2.T0;
        if (arrayList == null) {
            z7Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        va vaVar = this.r1;
        z7 z7Var3 = this.G1;
        vaVar.t0(z7Var3.T0, false, false, false, false, z7Var3);
        z7 z7Var4 = this.G1;
        if (!z7Var4.K) {
            z7Var4.S0 = Utilities.clamp(this.r1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.r1.getMasks();
        this.G1.U0 = masks != null ? new ArrayList(masks) : null;
        z7 z7Var5 = this.G1;
        boolean z10 = z7Var5.K;
        boolean E = z7Var5.E();
        this.G1.T0 = new ArrayList();
        va vaVar2 = this.r1;
        z7 z7Var6 = this.G1;
        Bitmap t02 = vaVar2.t0(z7Var6.T0, true, false, false, !z10, z7Var6);
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
        z7 z7Var7 = this.G1;
        z7Var7.P0 = null;
        z7Var7.R0 = null;
        z7Var7.Q0 = null;
        int i10 = this.c;
        FileLoader fileLoader = FileLoader.getInstance(i10);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        z7 z7Var8 = this.G1;
        z7Var7.P0 = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(t02, compressFormat, z7Var8.i0, z7Var8.j0, 87, false, 101, 101), true);
        if (t02 != null && !t02.isRecycled()) {
            t02.recycle();
        }
        z7 z7Var9 = this.G1;
        if (z7Var9.u) {
            File file4 = z7Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                this.G1.Y0 = null;
            }
            z7 z7Var10 = this.G1;
            long j10 = z7Var10.z0;
            if (j10 != Long.MIN_VALUE) {
                Drawable drawable = z7Var10.x0;
                if (drawable == null) {
                    drawable = q6.e(null, i10, j10, this.Y1);
                }
                if (drawable != null) {
                    this.G1.Y0 = z7.w(i10, "webp");
                    z7 z7Var11 = this.G1;
                    Bitmap createBitmap = Bitmap.createBitmap(z7Var11.i0, z7Var11.j0, Bitmap.Config.ARGB_8888);
                    z7.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
                    try {
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.G1.Y0));
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
        z7 z7Var12 = this.G1;
        if (z7Var12.u) {
            File file5 = z7Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                this.G1.X0 = null;
            }
            z7 z7Var13 = this.G1;
            if (z7Var13.u && z7Var13.K) {
                int i11 = z7Var13.k0;
                int i12 = z7Var13.l0;
                zf.e1 s02 = this.r1.s0();
                if (s02 != null) {
                    zf.x0 x0Var = s02.n0;
                    if (x0Var.getChildCount() == 1 && i11 > 0 && i12 > 0) {
                        if ((x0Var.getChildAt(0) instanceof org.telegram.ui.Cells.s1) && (photoImage = ((org.telegram.ui.Cells.s1) x0Var.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
                            float f10 = i11;
                            float f11 = i12;
                            float max = Math.max(photoImage.getImageWidth() / f10, photoImage.getImageHeight() / f11);
                            int i13 = (int) ((f10 * max) / 2.0f);
                            int i14 = (int) ((f11 * max) / 2.0f);
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
                            float f12 = (i13 * 2.0f) / 2.0f;
                            float f13 = (i14 * 2.0f) / 2.0f;
                            rectF.set(f12 - (photoImage.getImageWidth() / 2.0f), f13 - (photoImage.getImageHeight() / 2.0f), (photoImage.getImageWidth() / 2.0f) + f12, (photoImage.getImageHeight() / 2.0f) + f13);
                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                            Paint paint = new Paint(1);
                            paint.setColor(-1);
                            canvas.drawPath(path, paint);
                            try {
                                this.G1.X0 = z7.w(i10, "webp");
                                createBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.G1.X0));
                            } catch (Exception e12) {
                                FileLog.e(e12);
                                this.G1.X0 = null;
                            }
                            createBitmap2.recycle();
                        }
                    }
                }
            }
        }
        if (!E) {
            va vaVar3 = this.r1;
            ArrayList arrayList2 = new ArrayList();
            z7 z7Var14 = this.G1;
            int i17 = z7Var14.i0;
            Bitmap t03 = vaVar3.t0(arrayList2, false, true, false, false, z7Var14);
            z7 z7Var15 = this.G1;
            FileLoader fileLoader2 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            z7 z7Var16 = this.G1;
            z7Var15.R0 = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(t03, compressFormat2, z7Var16.i0, z7Var16.j0, 87, false, 101, 101), true);
            if (t03 != null && !t03.isRecycled()) {
                t03.recycle();
            }
        }
        if (this.r1.K0.getPainting().E) {
            Bitmap blurBitmap = this.r1.getBlurBitmap();
            z7 z7Var17 = this.G1;
            FileLoader fileLoader3 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            z7 z7Var18 = this.G1;
            z7Var17.Q0 = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, z7Var18.i0, z7Var18.j0, 87, false, 101, 101), true);
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
        float f10;
        boolean z12;
        db dbVar;
        int i11;
        float f11;
        eb ebVar;
        int i12;
        float f12;
        z7 z7Var;
        ImageView imageView;
        int i13;
        int i14;
        float f13;
        me0 me0Var;
        ke0 ke0Var;
        ImageView imageView2;
        int i15;
        z7 z7Var2;
        va vaVar;
        va vaVar2;
        int i16 = this.c0;
        if (i16 == i10 && !z10) {
            return;
        }
        ib ibVar = this.Y0;
        if (i10 != -1 && ibVar != null && ibVar.K1) {
            return;
        }
        this.c0 = i10;
        AnimatorSet animatorSet = this.n2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n2 = null;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.l0;
        cc ccVar = this.V0;
        u0 u0Var = this.a1;
        p2 p2Var = this.j0;
        ag.t0 t0Var = this.f1;
        ri0 ri0Var = this.c1;
        if (i16 != i10) {
            if (i10 == -1) {
                p2Var.setVisibility(0);
                ibVar.setVisibility(0);
                va vaVar3 = this.r1;
                if (vaVar3 != null) {
                    vaVar3.D0(null, true);
                }
                u0Var.setVisibility(0);
                z7 z7Var3 = this.G1;
                if (z7Var3 == null || !z7Var3.u) {
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
                    ri0Var.setVisibility(0);
                    t0Var.setVisibility(0);
                } else {
                    z7 z7Var4 = this.G1;
                    if (z7Var4 != null && !TextUtils.isEmpty(z7Var4.y)) {
                        ri0Var.setVisibility(8);
                        t0Var.setVisibility(0);
                    }
                }
                ccVar.setVisibility(0);
            }
            if (i10 == 0 && (vaVar2 = this.r1) != null) {
                vaVar2.setVisibility(0);
            }
            if ((i10 == 0 || i16 == 0) && (vaVar = this.r1) != null) {
                vaVar.Z0.setLayerType(2, null);
            }
            va vaVar4 = this.r1;
            if (vaVar4 != null) {
                vaVar4.K1.b(i10 != 0);
            }
            ibVar.H.b(i10 != -1);
            org.telegram.ui.Components.ec.e();
            if (this.x1 != null && i16 == 1) {
                i(null);
            }
            te0 te0Var = this.y1;
            if (te0Var != null) {
                te0Var.setAllowTouch(false);
            }
            this.g1.e(true);
            rb rbVar = this.n;
            hb hbVar = this.T0;
            Activity activity = this.b;
            if (i10 == 3) {
                if (this.n1 == null) {
                    db dbVar2 = new db(this, activity, hbVar);
                    this.n1 = dbVar2;
                    rbVar.addView(dbVar2.d);
                    rbVar.addView(this.n1);
                }
                this.n1.setVisibility(0);
                z7 z7Var5 = this.G1;
                if (z7Var5 != null) {
                    this.n1.setEntry(z7Var5);
                }
            } else if (i16 == 3) {
                hbVar.b();
                db dbVar3 = this.n1;
                if (dbVar3 != null) {
                    dbVar3.a.setCropEditorDrawing(dbVar3);
                    dbVar3.y = true;
                }
            }
            if (i10 == 4) {
                if (this.o1 == null) {
                    eb ebVar2 = new eb(this, activity, hbVar);
                    this.o1 = ebVar2;
                    rbVar.addView(ebVar2.e);
                    rbVar.addView(this.o1);
                }
                this.o1.setVisibility(0);
            } else if (i16 == 4) {
                hbVar.b();
                eb ebVar3 = this.o1;
                if (ebVar3 != null) {
                    ebVar3.A = true;
                }
            }
        }
        this.X0.b((i10 == -1 || i10 == 2) && this.E > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        ve0 ve0Var = this.x1;
        boolean z13 = ve0Var == null && i10 == 1;
        float f14 = 1.0f;
        if (i10 == 1) {
            s();
            ve0 ve0Var2 = this.x1;
            this.r2 = ve0Var2;
            FrameLayout toolsView = ve0Var2 != null ? ve0Var2.getToolsView() : null;
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
            if (i16 == 1 && ve0Var != null) {
                this.r2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(ve0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.x1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i10 != 0) {
                    u();
                    this.r2 = this.r1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(p2Var, (Property<p2, Float>) property, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getTopLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    View topLayout = this.r1.getTopLayout();
                    Property property2 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property2, -AndroidUtilities.dp(16.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property2, AndroidUtilities.dp(48.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f), f10));
                } else if (i16 == 0 && this.r1 != null) {
                    this.r2 = null;
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(p2Var, (Property<p2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getTopLayout(), (Property<View, Float>) property3, f10));
                    View topLayout2 = this.r1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property3, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getBottomLayout(), (Property<View, Float>) property4, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.r1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                dbVar = this.n1;
                if (dbVar == null) {
                    uf.e eVar = dbVar.h;
                    if (i10 == 3) {
                        Property property5 = View.ALPHA;
                        i11 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<uf.e, Float>) property5, 0.0f, 1.0f));
                        uf.e eVar2 = this.n1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f11 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar2, (Property<uf.e, Float>) property6, AndroidUtilities.dp(52.0f), f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property6, AndroidUtilities.dp(52.0f), f10));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new ea(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        i11 = 2;
                        f11 = 52.0f;
                        if (i16 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<uf.e, Float>) property7, 1.0f, 0.0f));
                            uf.e eVar3 = this.n1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(eVar3, (Property<uf.e, Float>) property8, f10, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.n1.n, (Property<FrameLayout, Float>) property8, f10, AndroidUtilities.dp(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.n1.getAppearProgress(), f10);
                            ofFloat2.addUpdateListener(new ea(this, i11));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    i11 = 2;
                    f11 = 52.0f;
                }
                ebVar = this.o1;
                if (ebVar != null) {
                    uf.e eVar4 = ebVar.n;
                    if (i10 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i11];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<uf.e, Float>) property9, fArr));
                        uf.e eVar5 = this.o1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i11];
                        fArr2[0] = AndroidUtilities.dp(f11);
                        fArr2[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(eVar5, (Property<uf.e, Float>) property10, fArr2));
                        float[] fArr3 = new float[i11];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.o1.r, (Property<FrameLayout, Float>) property9, fArr3));
                        FrameLayout frameLayout = this.o1.r;
                        float[] fArr4 = new float[i11];
                        fArr4[0] = AndroidUtilities.dp(f11);
                        fArr4[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr4));
                        float[] fArr5 = new float[i11];
                        fArr5[0] = this.o1.getAppearProgress();
                        fArr5[1] = 1.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr5);
                        ofFloat3.addUpdateListener(new ea(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i16 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i11];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<uf.e, Float>) property11, fArr6));
                        uf.e eVar6 = this.o1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float dp = AndroidUtilities.dp(f11);
                        float[] fArr7 = new float[i11];
                        fArr7[0] = f10;
                        fArr7[1] = dp;
                        arrayList.add(ObjectAnimator.ofFloat(eVar6, (Property<uf.e, Float>) property12, fArr7));
                        float[] fArr8 = new float[i11];
                        // fill-array-data instruction
                        fArr8[0] = 1.0f;
                        fArr8[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.o1.r, (Property<FrameLayout, Float>) property11, fArr8));
                        FrameLayout frameLayout2 = this.o1.r;
                        float dp2 = AndroidUtilities.dp(f11);
                        float[] fArr9 = new float[i11];
                        fArr9[0] = f10;
                        fArr9[1] = dp2;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr9));
                        float[] fArr10 = new float[i11];
                        fArr10[0] = this.o1.getAppearProgress();
                        fArr10[1] = f10;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr10);
                        ofFloat4.addUpdateListener(new ea(this, 4));
                        arrayList.add(ofFloat4);
                    }
                }
                Property property13 = View.ALPHA;
                if (i10 != -1 || i10 == 2) {
                    i12 = 1;
                    if (this.K1 == 1) {
                        f12 = 1.0f;
                        float[] fArr11 = new float[i12];
                        fArr11[0] = f12;
                        arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property13, ((i10 != -1 || i10 == 2) && (this.K1 == i12 || !((z7Var = this.G1) == null || TextUtils.isEmpty(z7Var.y)))) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                        imageView = this.e1;
                        if (imageView != null) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i10 == -1 || i10 == 2) && (z7Var2 = this.G1) != null && z7Var2.u) ? 1.0f : 0.0f));
                        } else {
                            i13 = 1;
                        }
                        int i17 = this.b0;
                        float[] fArr12 = new float[i13];
                        fArr12[0] = ((i17 != i13 || i17 == 2) && i10 == -1) ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property13, fArr12));
                        fb fbVar = this.d0;
                        if (i10 == i13) {
                            fbVar.setPivotY(fbVar.getMeasuredHeight() * 0.2f);
                            i14 = AndroidUtilities.dp(164.0f);
                        } else if (i10 == 0) {
                            fbVar.setPivotY(fbVar.getMeasuredHeight() * 0.6f);
                            i14 = AndroidUtilities.dp(40.0f);
                        } else if (i10 == 2) {
                            fbVar.setPivotY(0.0f);
                            i14 = ccVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            f13 = (r10 - i14) / (fbVar.getHeight() - ((int) fbVar.getPivotY()));
                        } else {
                            f13 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.SCALE_X, f13));
                        arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.SCALE_Y, f13));
                        if (i10 == -1) {
                            arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.TRANSLATION_Y, 0.0f));
                        }
                        me0Var = this.B1;
                        if (me0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(me0Var, (Property<me0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        ke0Var = this.A1;
                        if (ke0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(ke0Var, (Property<ke0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                        float[] fArr13 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                        ag.p1 p1Var = this.h0;
                        arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property14, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                        if (i10 != -1 && i10 != 2) {
                            f14 = 0.0f;
                        }
                        FrameLayout frameLayout3 = this.U0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f14));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ibVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.f0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i10 == 2 ? -90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        imageView2 = this.e1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        }
                        if (this.n0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i15 = 0;
                            ofFloat5.addUpdateListener(new ua(this, i15));
                            arrayList.add(ofFloat5);
                        } else {
                            i15 = 0;
                        }
                        if (ccVar != null) {
                            z7 z7Var6 = this.G1;
                            boolean z14 = z7Var6 == null || !z7Var6.v() || !this.G1.t() || i10 == 2;
                            if (ccVar.f0 != z14 || !z11) {
                                ccVar.f0 = z14;
                                if (!z11) {
                                    ccVar.e0.f(z14, true);
                                }
                                ccVar.invalidate();
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
                        this.n2.setInterpolator(er.h);
                        this.n2.addListener(new qa(this, i16, i10, 1));
                        if (z12) {
                            this.n2.setStartDelay(120L);
                        }
                        this.n2.start();
                        return;
                    }
                } else {
                    i12 = 1;
                }
                f12 = 0.0f;
                float[] fArr112 = new float[i12];
                fArr112[0] = f12;
                arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property13, ((i10 != -1 || i10 == 2) && (this.K1 == i12 || !((z7Var = this.G1) == null || TextUtils.isEmpty(z7Var.y)))) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                imageView = this.e1;
                if (imageView != null) {
                }
                int i172 = this.b0;
                float[] fArr122 = new float[i13];
                fArr122[0] = ((i172 != i13 || i172 == 2) && i10 == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property13, fArr122));
                fb fbVar2 = this.d0;
                if (i10 == i13) {
                }
                if (i14 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(fbVar2, (Property<fb, Float>) View.SCALE_X, f13));
                arrayList.add(ObjectAnimator.ofFloat(fbVar2, (Property<fb, Float>) View.SCALE_Y, f13));
                if (i10 == -1) {
                }
                me0Var = this.B1;
                if (me0Var != null) {
                }
                ke0Var = this.A1;
                if (ke0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                float[] fArr132 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                ag.p1 p1Var2 = this.h0;
                arrayList.add(ObjectAnimator.ofFloat(p1Var2, (Property<ag.p1, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(p1Var2, (Property<ag.p1, Float>) property142, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                if (i10 != -1) {
                    f14 = 0.0f;
                }
                FrameLayout frameLayout32 = this.U0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f14));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ibVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.f0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i10 == 2 ? -90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                imageView2 = this.e1;
                if (imageView2 != null) {
                }
                if (this.n0.c()) {
                }
                if (ccVar != null) {
                }
                if (!z11) {
                }
            }
        }
        z12 = z13;
        if (i10 != 0) {
        }
        dbVar = this.n1;
        if (dbVar == null) {
        }
        ebVar = this.o1;
        if (ebVar != null) {
        }
        Property property132 = View.ALPHA;
        if (i10 != -1) {
        }
        i12 = 1;
        if (this.K1 == 1) {
        }
        f12 = 0.0f;
        float[] fArr1122 = new float[i12];
        fArr1122[0] = f12;
        arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property132, ((i10 != -1 || i10 == 2) && (this.K1 == i12 || !((z7Var = this.G1) == null || TextUtils.isEmpty(z7Var.y)))) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property132, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
        imageView = this.e1;
        if (imageView != null) {
        }
        int i1722 = this.b0;
        float[] fArr1222 = new float[i13];
        fArr1222[0] = ((i1722 != i13 || i1722 == 2) && i10 == -1) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property132, fArr1222));
        fb fbVar22 = this.d0;
        if (i10 == i13) {
        }
        if (i14 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(fbVar22, (Property<fb, Float>) View.SCALE_X, f13));
        arrayList.add(ObjectAnimator.ofFloat(fbVar22, (Property<fb, Float>) View.SCALE_Y, f13));
        if (i10 == -1) {
        }
        me0Var = this.B1;
        if (me0Var != null) {
        }
        ke0Var = this.A1;
        if (ke0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property132, i10 == -1 ? 1.0f : 0.0f));
        float[] fArr1322 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
        ag.p1 p1Var22 = this.h0;
        arrayList.add(ObjectAnimator.ofFloat(p1Var22, (Property<ag.p1, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(p1Var22, (Property<ag.p1, Float>) property1422, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
        if (i10 != -1) {
        }
        FrameLayout frameLayout322 = this.U0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f14));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ibVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.f0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i10 == 2 ? -90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        imageView2 = this.e1;
        if (imageView2 != null) {
        }
        if (this.n0.c()) {
        }
        if (ccVar != null) {
        }
        if (!z11) {
        }
    }

    public final void m() {
        z7 z7Var;
        if (this.r1 == null || (z7Var = this.G1) == null || !z7Var.u) {
            return;
        }
        File file = z7Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            this.G1.W0 = null;
        }
        this.G1.W0 = z7.w(this.c, "webp");
        va vaVar = this.r1;
        z7 z7Var2 = this.G1;
        Bitmap t02 = vaVar.t0(z7Var2.T0, false, false, true, this.K1 != 1, z7Var2);
        try {
            try {
                t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.G1.W0));
                if (t02.isRecycled()) {
                    return;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                try {
                    this.G1.W0.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
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
        wa waVar;
        boolean z11 = false;
        i0(this.b0 == 0 && this.K1 == 1 && !this.E0.e && !I(), z10);
        this.C0.setSelected(this.w0.j());
        z zVar = this.E0;
        c0(this.j0, zVar == null || !zVar.e, z10);
        c0(this.A0, (this.W1 || this.K1 == -1 || this.b0 != 0 || this.U1 == null || this.E0.e || I()) ? false : true, z10);
        c0(this.B0, (this.W1 || this.K1 == -1 || this.b0 != 0 || (waVar = this.x0) == null || !waVar.a || this.E0.e || this.w0.j()) ? false : true, z10);
        c0(this.C0, (this.W1 || this.K1 == -1 || this.b0 != 0 || this.E0.e) ? false : true, z10);
        c0(this.D0, this.E0.e, z10);
        this.K0.e(this.w0.j() ? this.w0.getFilledProgress() : 0.0f, z10);
        boolean z12 = this.E0.e;
        w3 w3Var = this.j1;
        if (z12) {
            w3Var.v();
        } else {
            w3Var.e(true);
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
        gf.t0 t0Var = this.y;
        if (t0Var != null) {
            t0Var.a(!z10);
        }
        this.w2 = z10;
    }

    public final void o0(boolean z10) {
        oi0 oi0Var = this.d1;
        if (oi0Var != null) {
            int[] iArr = oi0Var.e;
            int i10 = 0;
            if (!z10) {
                z7 z7Var = this.G1;
                int i11 = (z7Var == null || !z7Var.y0) ? 0 : iArr[0] - 1;
                oi0Var.L(i11, false, true);
                this.d1.N(i11);
                ImageView imageView = this.e1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            z7 z7Var2 = this.G1;
            if (z7Var2 != null && z7Var2.y0) {
                i10 = iArr[0];
            }
            oi0Var.N(i10);
            oi0 oi0Var2 = this.d1;
            if (oi0Var2 != null) {
                oi0Var2.start();
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
            r2 r2Var = this.s;
            r2Var.o = f10;
            r2Var.n = r2.f(f10);
            r2Var.g();
            float f11 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            r2 r2Var2 = this.s;
            r2Var2.p = f11;
            r2Var2.i();
        }
    }

    public final void p0() {
        if (this.S1) {
            return;
        }
        this.S1 = true;
        s9 s9Var = new s9(this, 2);
        va vaVar = this.r1;
        z7 z7Var = this.G1;
        if (vaVar == null || z7Var == null) {
            s9Var.run();
            return;
        }
        z7Var.f();
        boolean u02 = vaVar.u0();
        boolean z10 = vaVar.K0.getPainting().E;
        Utilities.searchQueue.postRunnable(new v9(this, vaVar, z7Var.i0, z7Var.j0, z7Var, z10, u02, s9Var, 1));
    }

    public final void q(boolean z10) {
        hb hbVar;
        if (this.d) {
            q9 q9Var = this.m0;
            if (q9Var != null) {
                q9Var.dismiss();
                this.m0 = null;
            }
            z7 z7Var = this.G1;
            long j10 = 0;
            if (z7Var != null && !z7Var.h) {
                if ((this.v && z7Var.g) || z7Var.b != 0) {
                    z7Var.j = false;
                }
                z7Var.i(false);
            }
            this.G1 = null;
            Utilities.Callback4 callback4 = this.N;
            if (callback4 == null || (hbVar = this.T0) == null) {
                hb hbVar2 = this.T0;
                if (hbVar2 != null && !z10) {
                    hbVar2.set(null);
                }
                g(0.0f, z10, new s9(this, 23));
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
            m61 m61Var = hbVar.y;
            if (m61Var != null) {
                m61Var.C();
                hbVar.y.I();
                hbVar.y = null;
            }
            m61 m61Var2 = hbVar.x;
            if (m61Var2 != null) {
                j10 = m61Var2.o();
                hbVar.x.C();
                hbVar.x.I();
                hbVar.x = null;
            }
            m61 m61Var3 = hbVar.e;
            if (m61Var3 != null) {
                j10 = m61Var3.o();
                hbVar.e.C();
                hbVar.e.I();
                hbVar.e = null;
            }
            callback4.run(Long.valueOf(j10), new ca(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.w));
        }
    }

    public final boolean q0() {
        wa waVar;
        if ((!this.L1 && !this.M1) || (waVar = this.x0) == null || !waVar.isFrontface()) {
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
        this.x0 = new wa(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        y6 y6Var = this.K0;
        if (y6Var != null) {
            y6Var.c0 = 0.0f;
            y6Var.d0.d(0.0f, true);
        }
        this.x0.recordHevc = !this.w0.j();
        this.x0.setThumbDrawable(A());
        this.x0.initTexture();
        this.x0.setDelegate(new ba(this, 0));
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
            this.y0 = new u6(activity, new t9(this, 3));
        }
        this.y0.a(this.x0);
        i7 i7Var = this.z0;
        if (i7Var != null) {
            gb gbVar = this.w0;
            Object blurRenderNode = gbVar.getBlurRenderNode();
            i7Var.B = gbVar;
            i7Var.C = blurRenderNode;
            i7Var.invalidate();
        }
    }

    public final void s() {
        z7 z7Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.x1 != null || (z7Var = this.G1) == null) {
            return;
        }
        if (z7Var.K) {
            bitmap = null;
        } else {
            if (z7Var.Z0 == null) {
                q6 = this.T0.getPhotoBitmap();
            } else {
                ba baVar = new ba(this, 11);
                Point point = AndroidUtilities.displaySize;
                q6 = z7.q(baVar, point.x, point.y, 0, true);
            }
            bitmap = q6;
        }
        if (bitmap != null || this.G1.K) {
            a61 textureView = this.T0.getTextureView();
            int orientation = this.T0.getOrientation();
            z7 z7Var2 = this.G1;
            ve0 ve0Var = new ve0(this.b, textureView, bitmap, null, orientation, z7Var2 != null ? z7Var2.a1 : null, null, 0, false, false, this.n0, this.a);
            this.x1 = ve0Var;
            this.r.addView(ve0Var);
            te0 te0Var = this.y1;
            if (te0Var != null) {
                te0Var.setFilterView(this.x1);
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
            ke0 blurControl = this.x1.getBlurControl();
            this.A1 = blurControl;
            if (blurControl != null) {
                this.d0.addView(blurControl);
            }
            me0 curveControl = this.x1.getCurveControl();
            this.B1 = curveControl;
            if (curveControl != null) {
                this.d0.addView(curveControl);
            }
            V();
            this.x1.getDoneTextView().setOnClickListener(new u9(this, 13));
            this.x1.getCancelTextView().setOnClickListener(new u9(this, 14));
            this.x1.getToolsView().setVisibility(8);
            this.x1.getToolsView().setAlpha(0.0f);
            this.x1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.x1.e0.setVisibility(0);
        }
    }

    public final void t(boolean z10) {
        if (this.I0 != null) {
            gb gbVar = this.w0;
            if ((gbVar != null && gbVar.j()) == this.I0.L) {
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
        gb gbVar2 = this.w0;
        sa saVar = new sa(this, this.c, this.b, this.a, albumEntry, z10, z11, gbVar2 != null && gbVar2.j());
        this.I0 = saVar;
        saVar.C.setVisibility(8);
        this.I0.setMultipleOnClick(this.w0.j());
        this.I0.setMaxCount(Math.min(10, u.b() - this.w0.getFilledCount()));
        this.I0.setOnBackClickListener(new ja(this, 1));
        this.I0.setOnSelectListener(new ia(z10, this, 0));
        this.I0.setOnSelectMultipleListener(new hh.q1(this, 2));
        f2.j0 j0Var = this.h2;
        if (j0Var != null) {
            z2 z2Var = this.I0.e;
            z2Var.B = j0Var;
            z2Var.l0();
        }
        this.n.addView(this.I0, h7.z5.e(-1, -1, 119));
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
        z7 z7Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        z7 z7Var2;
        yf.b1 renderView;
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
        z7 z7Var3 = this.G1;
        Bitmap decodeFile = (z7Var3 == null || !(z7Var3.c || z7Var3.g || this.D1 != null) || (file3 = z7Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        z7 z7Var4 = this.G1;
        if (z7Var4 == null || (!(z7Var4.c || z7Var4.g || this.D1 != null) || (file2 = z7Var4.Q0) == null)) {
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
                z7Var = this.G1;
                if (z7Var != null || z7Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = z7Var != null ? file : z7Var.L;
                if (z7Var == null && z7Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (z7Var != null || z7Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.T0.getOrientation();
                z7Var2 = this.G1;
                Object obj2 = obj;
                if (z7Var2 != null) {
                    obj2 = z7Var2.T0;
                }
                ?? r13 = obj2;
                MediaController.CropState cropState = new MediaController.CropState();
                p6 p6Var = this.o0;
                hb hbVar = this.T0;
                Activity activity = this.b;
                boolean z15 = z12;
                va vaVar = new va(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, z7Var2, measuredWidth, measuredHeight, cropState, this.n0, this.a, p6Var, hbVar);
                this.r1 = vaVar;
                z7 z7Var5 = this.G1;
                vaVar.setHasAudio(z7Var5 == null && z7Var5.y != null);
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
                this.r1.setOnDoneButtonClickedListener(new s9(this, 21));
                this.r1.setOnCancelButtonClickedListener(new s9(this, 22));
                va vaVar2 = this.r1;
                vaVar2.N0.setVisibility(0);
                vaVar2.K0.setVisibility(0);
                vaVar2.L0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.d0.getMeasuredWidth();
        int measuredHeight2 = this.d0.getMeasuredHeight();
        z7Var = this.G1;
        if (z7Var != null) {
        }
        file = null;
        z11 = false;
        if (z7Var != null) {
        }
        if (z7Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (z7Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.T0.getOrientation();
        z7Var2 = this.G1;
        Object obj22 = obj;
        if (z7Var2 != null) {
        }
        ?? r132 = obj22;
        MediaController.CropState cropState2 = new MediaController.CropState();
        p6 p6Var2 = this.o0;
        hb hbVar2 = this.T0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        va vaVar3 = new va(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, z7Var2, measuredWidth2, measuredHeight2, cropState2, this.n0, this.a, p6Var2, hbVar2);
        this.r1 = vaVar3;
        z7 z7Var52 = this.G1;
        vaVar3.setHasAudio(z7Var52 == null && z7Var52.y != null);
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
        this.r1.setOnDoneButtonClickedListener(new s9(this, 21));
        this.r1.setOnCancelButtonClickedListener(new s9(this, 22));
        va vaVar22 = this.r1;
        vaVar22.N0.setVisibility(0);
        vaVar22.K0.setVisibility(0);
        vaVar22.L0.setVisibility(0);
    }

    public final void v(boolean z10) {
        u6 u6Var = this.y0;
        if (u6Var != null) {
            u6Var.f = null;
            Utilities.globalQueue.cancelRunnable(u6Var.h);
            this.y0 = null;
            gb gbVar = this.w0;
            if (gbVar != null) {
                gbVar.c.a(null);
            }
        }
        i7 i7Var = this.z0;
        if (i7Var != null) {
            i7Var.B = null;
            i7Var.C = null;
            i7Var.invalidate();
        }
        if (this.x0 != null) {
            if (z10) {
                b0(new s9(this, 8));
                return;
            }
            b0(new s9(this, 9));
            this.x0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.x0);
            gb gbVar2 = this.w0;
            if (gbVar2 != null) {
                gbVar2.setCameraView(null);
            }
            this.x0 = null;
        }
    }

    public final void w() {
        sa saVar = this.I0;
        if (saVar == null) {
            return;
        }
        this.n.removeView(saVar);
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
        ve0 ve0Var = this.x1;
        if (ve0Var == null) {
            return;
        }
        ve0Var.e();
        this.y1.setFilterView(null);
        this.r.removeView(this.x1);
        TextureView textureView = this.z1;
        if (textureView != null) {
            this.d0.removeView(textureView);
            this.z1 = null;
        }
        this.T0.o(null, null);
        ke0 ke0Var = this.A1;
        if (ke0Var != null) {
            this.d0.removeView(ke0Var);
            this.A1 = null;
        }
        me0 me0Var = this.B1;
        if (me0Var != null) {
            this.d0.removeView(me0Var);
            this.B1 = null;
        }
        this.x1 = null;
    }

    public final void z() {
        va vaVar = this.r1;
        if (vaVar == null) {
            return;
        }
        vaVar.N0.removeAllViews();
        va vaVar2 = this.r1;
        vaVar2.K0.h();
        vaVar2.N0.setVisibility(8);
        vaVar2.M0.setVisibility(8);
        vaVar2.A0.postRunnable(new ag.l3(16));
        o5 o5Var = vaVar2.g2;
        if (o5Var != null) {
            o5Var.dismiss();
        }
        yf.x xVar = vaVar2.P1;
        if (xVar != null) {
            xVar.dismiss();
        }
        this.r.removeView(this.r1);
        this.r1 = null;
        yf.b1 b1Var = this.s1;
        if (b1Var != null) {
            this.d0.removeView(b1Var);
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
