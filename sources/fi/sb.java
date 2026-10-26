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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.fc1;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.z11;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class sb implements NotificationCenter.NotificationCenterDelegate {
    public static sb F2;
    public final fb A0;
    public View A1;
    public boolean A2;
    public va B0;
    public eg0 B1;
    public boolean B2;
    public s6 C0;
    public final cg0 C1;
    public ab C2;
    public final g7 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final dc E0;
    public sf0 E1;
    public ValueAnimator E2;
    public nb F;
    public final ec F0;
    public uf0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final dc H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final hc J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public w7 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public qa M0;
    public long M1;
    public long N;
    public v0 N0;
    public boolean N1;
    public boolean O;
    public final w6 O0;
    public int O1;
    public final AnimationNotificationsLocker P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final ja Q0;
    public boolean Q1;
    public Utilities.Callback4 R;
    public final o2 R0;
    public boolean R1;
    public int S;
    public final o2 S0;
    public boolean S1;
    public int T;
    public final t3 T0;
    public float T1;
    public int U;
    public final t3 U0;
    public int U1;
    public boolean V;
    public final fc1 V0;
    public boolean V1;
    public boolean W;
    public final v3 W0;
    public boolean W1;
    public boolean X;
    public final gb X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final cc Z0;
    public AnimatorSet Z1;
    public final di.b a;
    public int a0;
    public final gc a1;
    public boolean a2;
    public final Activity b;
    public int b0;
    public final i6 b1;
    public boolean b2;
    public final int c;
    public final RectF c0;
    public final ib c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final ia d1;
    public boolean d2;
    public boolean e;
    public final Path e0;
    public final u0 e1;
    public Runnable e2;
    public final WindowManager f;
    public int f0;
    public xj0 f1;
    public AnimatorSet f2;
    public int g0;
    public final ak0 g1;
    public v9 g2;
    public final WindowManager.LayoutParams h;
    public final eb h0;
    public xj0 h1;
    public boolean h2;
    public final FrameLayout i0;
    public ImageView i1;
    public AnimatorSet i2;
    public final LinearLayout j0;
    public final f6 j1;
    public ValueAnimator j2;
    public final FrameLayout k0;
    public final v3 k1;
    public boolean k2;
    public final bh.r l0;
    public final v3 l1;
    public s4.b0 l2;
    public final FrameLayout m0;
    public final v3 m1;
    public MediaController.AlbumEntry m2;
    public final rb n;
    public final o2 n0;
    public final v3 n1;
    public ValueAnimator n2;
    public final p7 o0;
    public final j6 o1;
    public o1.j o2;
    public final org.telegram.ui.ActionBar.b6 p0;
    public final fc p1;
    public Boolean p2;
    public n9 q0;
    public p q1;
    public z9 q2;
    public final kb r;
    public final org.telegram.ui.Components.la r0;
    public cb r1;
    public AnimatorSet r2;
    public final q2 s;
    public final n6 s0;
    public db s1;
    public boolean s2;
    public final bi.cc t0;
    public final cc t1;
    public int t2;
    public boolean u0;
    public final d u1;
    public ArrayList u2;
    public boolean v;
    public long v0;
    public ta v1;
    public FrameLayout v2;
    public long w;
    public String w0;
    public rg.c1 w1;
    public boolean w2;
    public jb x;
    public TLRPC.InputPeer x0;
    public View x1;
    public p9 x2;
    public final ag.b1 y;
    public l9 y0;
    public View y1;
    public ag.r0 y2;
    public t z0;
    public View z1;
    public boolean z2;

    public sb(Activity activity, int i10) {
        int i11;
        di.b bVar = new di.b();
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
        this.f0 = 0;
        this.g0 = -1;
        this.y0 = new l9();
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
        ma maVar = new ma(this);
        this.d2 = true;
        this.k2 = true;
        this.t2 = -1;
        this.b = activity;
        this.c = i10;
        LaunchActivity launchActivity = LaunchActivity.I1;
        this.y = launchActivity != null ? new ag.b1(launchActivity, true) : null;
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
        y9 y9Var = new y9(this, i12);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(rbVar, y9Var);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        q2 q2Var = new q2(activity, windowManager, this.n, layoutParams);
        this.s = q2Var;
        q2Var.a(new ya(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        rb rbVar2 = this.n;
        kb kbVar = new kb(this, activity);
        this.r = kbVar;
        rbVar2.addView(kbVar);
        kb kbVar2 = this.r;
        eb ebVar = new eb(this, activity);
        this.h0 = ebVar;
        kbVar2.addView(ebVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.r0 = new org.telegram.ui.Components.la(this.h0);
        this.s0 = new n6();
        kb kbVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.i0 = frameLayout;
        kbVar3.addView(frameLayout);
        kb kbVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.k0 = frameLayout2;
        kbVar4.addView(frameLayout2);
        kb kbVar5 = this.r;
        int i14 = 4;
        bh.r rVar = new bh.r(this, activity, 4);
        this.l0 = rVar;
        kbVar5.addView(rVar);
        int i15 = 8;
        this.l0.setVisibility(8);
        this.l0.setAlpha(0.0f);
        kb kbVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        kbVar6.addView(frameLayout3);
        org.telegram.ui.Components.qc.a(this.n, new k8(2));
        fb fbVar = new fb(this, activity, this.r0, this.r, bVar);
        this.A0 = fbVar;
        rb rbVar3 = this.n;
        Objects.requireNonNull(rbVar3);
        fbVar.setCancelGestures(new di.s8(rbVar3, 27));
        this.A0.setResetState(new p9(this, 13));
        this.h0.addView(this.A0, gb1.i(-1, -1, 119));
        this.A0.setOnClickListener(new r9(this, 12));
        eb ebVar2 = this.h0;
        int i16 = this.J;
        ebVar2.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
        eb ebVar3 = this.h0;
        float dp = AndroidUtilities.dp(12.0f);
        ag.v0 v0Var = ag.z0.a;
        ebVar3.setOutlineProvider(new ag.x0(0, dp));
        this.h0.setClipToOutline(true);
        p9 p9Var = new p9(this, 14);
        cg0 cg0Var = new cg0(activity);
        cg0Var.a = new TextPaint(1);
        cg0Var.b = new TextPaint(1);
        ds dsVar = ds.h;
        cg0Var.s = new org.telegram.ui.Components.h6(cg0Var, 0L, 350L, dsVar);
        cg0Var.I = new wa0(cg0Var, 9);
        cg0Var.x = p9Var;
        this.C1 = cg0Var;
        gb gbVar = new gb(this, activity, this.r0, this.s0);
        this.X0 = gbVar;
        gbVar.setCollageView(this.A0);
        gb gbVar2 = this.X0;
        gbVar2.v = new p9(this, 15);
        gbVar2.setOnTapListener(new p9(this, i13));
        this.X0.setVisibility(8);
        gb gbVar3 = this.X0;
        gbVar3.N = new p9(this, 17);
        this.h0.addView(gbVar3, gb1.i(-1, -1, 119));
        this.h0.addView(this.C1, gb1.i(-1, -1, 119));
        rb rbVar4 = this.n;
        ib ibVar = new ib(this, activity, rbVar4, rbVar4, this.r, bVar, this.r0);
        this.c1 = ibVar;
        ibVar.setAccount(i10);
        int i17 = 6;
        this.c1.setUiBlurBitmap(new y9(this, i17));
        org.telegram.ui.Components.qc.a(this.l0, new bh.c0(this, i14));
        this.c1.setOnHeightUpdate(new q9(this, 13));
        this.c1.setOnPeriodUpdate(new q9(this, i14));
        long j10 = this.N;
        if (j10 != 0) {
            this.c1.setDialogId(j10);
        }
        this.c1.setOnPremiumHint(new q9(this, 5));
        this.c1.setOnKeyboardOpen(new q9(this, i17));
        bi.cc ccVar = new bi.cc(this, activity, i12);
        this.t0 = ccVar;
        this.r.addView(ccVar);
        cc ccVar2 = new cc(activity, this.r, this.h0, bVar, this.r0);
        this.Z0 = ccVar2;
        ccVar2.setOnTimelineClick(new p9(this, 10));
        this.Z0.setOnHeightChange(new p9(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f7 = 388;
        frameLayout4.addView(this.Z0, gb1.h(-1, f7, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        gc gcVar = new gc(activity);
        this.a1 = gcVar;
        gcVar.setVisibility(8);
        this.a1.a(false);
        this.Y0.addView(this.a1, gb1.h(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.l0.addView(this.Y0, gb1.h(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.l0.addView(this.c1, gb1.h(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        cc ccVar3 = new cc(activity, this.r, this.h0, bVar, this.r0);
        this.t1 = ccVar3;
        ccVar3.X0 = true;
        ccVar3.setVisibility(8);
        this.t1.setAlpha(0.0f);
        this.l0.addView(this.t1, gb1.h(-1, f7, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        ia iaVar = new ia(this, activity, bVar, this.r0);
        this.d1 = iaVar;
        iaVar.setVisibility(8);
        this.l0.addView(this.d1, gb1.i(-1, -2, 85));
        o2 o2Var = new o2(activity);
        this.n0 = o2Var;
        o2Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        o2 o2Var2 = this.n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        o2Var2.setScaleType(scaleType);
        this.n0.setImageResource(R.drawable.msg_photo_back);
        o2 o2Var3 = this.n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        o2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.n0.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.n0.setOnClickListener(new r9(this, i12));
        this.i0.addView(this.n0, gb1.i(56, 56, 51));
        this.s.a(this.n0);
        p7 p7Var = new p7(activity, i10);
        this.o0 = p7Var;
        p7Var.a(false, false);
        this.o0.setOnClickListener(new bi.q(16, this, activity));
        this.i0.addView(this.o0, gb1.h(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(activity);
        this.p0 = b6Var;
        b6Var.setTextSize(20);
        this.p0.setGravity(19);
        this.p0.setTextColor(-1);
        this.p0.setTypeface(AndroidUtilities.bold());
        this.p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.p0.setAlpha(0.0f);
        this.p0.setVisibility(8);
        this.p0.setEllipsizeByGradient(true);
        this.p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.i0.addView(this.p0, gb1.h(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.j0.setGravity(5);
        this.i0.addView(this.j0, gb1.h(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        q9 q9Var = new q9(this, 7);
        rb rbVar5 = this.n;
        u0 u0Var = new u0(activity);
        u0Var.w = true;
        u0Var.x = true;
        u0Var.h = q9Var;
        u0Var.a = i10;
        u0Var.b = rbVar5;
        u0Var.setScaleType(scaleType);
        u0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        u0Var.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        u0Var.setVisibility(8);
        u0Var.setAlpha(0.0f);
        u0Var.setOnClickListener(new ai.s(u0Var, 21));
        u0Var.f = new gq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        u0Var.d();
        this.e1 = u0Var;
        v3 v3Var = new v3(activity, 1);
        v3Var.l(1.0f, -71.0f);
        v3Var.d = 2000L;
        v3Var.U = false;
        v3Var.H.r(true, false);
        this.k1 = v3Var;
        v3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.k1, gb1.h(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ak0 ak0Var = new ak0(activity);
        this.g1 = ak0Var;
        ak0Var.setScaleType(scaleType);
        ak0 ak0Var2 = this.g1;
        w7 w7Var = this.K1;
        ak0Var2.setImageResource((w7Var == null || !w7Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.g1.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.g1.setOnClickListener(new r9(this, 2));
        this.g1.setVisibility(8);
        this.g1.setAlpha(0.0f);
        f6 f6Var = new f6(activity);
        this.j1 = f6Var;
        f6Var.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.j1.setVisibility(8);
        this.j1.setAlpha(0.0f);
        this.j1.setOnClickListener(new r9(this, 3));
        this.j0.addView(this.j1, gb1.u(46, 56, 53));
        this.j0.addView(this.g1, gb1.u(46, 56, 53));
        this.j0.addView(this.e1, gb1.i(46, 56, 53));
        dc dcVar = new dc(activity);
        this.E0 = dcVar;
        dcVar.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.E0.setOnClickListener(new r9(this, 4));
        this.E0.setOnLongClickListener(new b5(this, i12));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.s.a(this.E0);
        this.i0.addView(this.E0, gb1.i(56, 56, 53));
        ec ecVar = new ec(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = ecVar;
        ecVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new r9(this, 5));
        boolean q5 = c1.q(activity);
        this.F0.setVisibility(q5 ? 0 : 8);
        this.F0.setAlpha(q5 ? 1.0f : 0.0f);
        this.s.a(this.F0);
        this.i0.addView(this.F0, gb1.i(56, 56, 53));
        z zVar = new z(activity);
        this.G0 = zVar;
        zVar.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        if (this.z0 == null) {
            i11 = 6;
            this.z0 = (t) t.a().get(6);
        } else {
            i11 = 6;
        }
        this.G0.setOnClickListener(new r9(this, i11));
        this.G0.a(new u(this.z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.s.a(this.G0);
        this.i0.addView(this.G0, gb1.i(56, 56, 53));
        dc dcVar2 = new dc(activity);
        this.H0 = dcVar2;
        dcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new r9(this, 7));
        this.s.a(this.H0);
        this.i0.addView(this.H0, gb1.i(56, 56, 53));
        y yVar = new y(activity, this.s);
        this.I0 = yVar;
        yVar.a.v0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new q9(this, i15));
        this.i0.addView(this.I0, gb1.i(-1, 56, 53));
        v3 v3Var2 = new v3(activity, 1);
        v3Var2.l(1.0f, -20.0f);
        v3Var2.d = 5000L;
        v3Var2.i(true);
        v3Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        v3Var2.l0 = new ag.c(16);
        this.l1 = v3Var2;
        v3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.l1, gb1.h(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        v3 v3Var3 = new v3(activity, 2);
        v3Var3.l(0.0f, 28.0f);
        v3Var3.d = 5000L;
        v3Var3.p(true);
        this.m1 = v3Var3;
        this.i0.addView(v3Var3, gb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        v3 v3Var4 = new v3(activity, 1);
        v3Var4.l(1.0f, -20.0f);
        v3Var4.d = 5000L;
        v3Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.n1 = v3Var4;
        v3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.n1, gb1.h(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        hc hcVar = new hc(activity);
        Paint paint = new Paint(1);
        hcVar.a = paint;
        Paint paint2 = new Paint(1);
        hcVar.b = paint2;
        hcVar.e = new org.telegram.ui.Components.h6(hcVar, 0L, 250L, dsVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        hcVar.c = r6Var;
        r6Var.n(0.3f, 250L, dsVar);
        r6Var.w(AndroidUtilities.dp(13.0f));
        r6Var.u(-1);
        r6Var.x(AndroidUtilities.bold());
        r6Var.setCallback(hcVar);
        r6Var.b = 1;
        hcVar.a(0L, false);
        this.J0 = hcVar;
        h0(false, false);
        this.i0.addView(this.J0, gb1.h(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        w6 w6Var = new w6(activity);
        this.O0 = w6Var;
        w6Var.setDelegate(maVar);
        w6 w6Var2 = this.O0;
        boolean z10 = this.O1 == 1;
        w6Var2.n0 = -1.0f;
        w6Var2.o0 = z10;
        w6Var2.invalidate();
        this.k0.addView(this.O0, gb1.i(-1, 100, 87));
        this.s.a(this.O0);
        this.O0.e(this.A0.j() ? this.A0.getFilledProgress() : 0.0f, true);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.i(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.k0.addView(this.P0, gb1.h(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new r9(this, 8));
        v3 v3Var5 = new v3(activity, 3);
        v3Var5.p(true);
        v3Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        v3Var5.h = AndroidUtilities.dp(320.0f);
        v3Var5.d = 5000L;
        v3Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = v3Var5;
        this.k0.addView(v3Var5, gb1.h(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        fc1 fc1Var = new fc1(activity);
        this.V0 = fc1Var;
        fc1Var.M = false;
        fc1Var.setAlpha(0.0f);
        this.k0.addView(this.V0, gb1.h(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new y9(this, 4));
        fc1 fc1Var2 = this.V0;
        this.T1 = 0.0f;
        fc1Var2.b(0.0f, false);
        int i18 = 12;
        g7 g7Var = new g7(activity, i10, new p9(this, i18));
        this.D0 = g7Var;
        g7Var.c = new q9(this, 9);
        this.k0.addView(g7Var, gb1.h(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        ja jaVar = new ja(this, activity);
        this.Q0 = jaVar;
        jaVar.setOnSwitchModeListener(new q9(this, 10));
        this.Q0.setOnSwitchingModeListener(new q9(this, 11));
        this.m0.addView(this.Q0, gb1.i(-1, 48, 55));
        this.s.a(this.Q0);
        o2 o2Var4 = new o2(activity);
        this.R0 = o2Var4;
        o2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.m0.addView(this.R0, gb1.h(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.R0);
        this.R0.setOnClickListener(new r9(this, 9));
        o2 o2Var5 = new o2(activity);
        this.S0 = o2Var5;
        o2Var5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.m0.addView(this.S0, gb1.h(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new r9(this, 10));
        t3 t3Var = new t3(activity);
        this.T0 = t3Var;
        this.m0.addView(t3Var, gb1.h(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.T0);
        t3 t3Var2 = new t3(activity);
        this.U0 = t3Var2;
        t3Var2.a.t(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        t3Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, gb1.h(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.u1 = dVar2;
        dVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.u1.i(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.u1.setOnClickListener(new r9(this, 11));
        this.m0.addView(this.u1, gb1.h(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        i6 i6Var = new i6(activity);
        i6Var.b = new ArrayList();
        i6Var.e = true;
        i6Var.h = true;
        View view = new View(activity);
        i6Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        i6Var.addView(view, gb1.i(-1, -1, 119));
        i6Var.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        i6Var.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        i6Var.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        i6Var.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        i6Var.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        i6Var.d = string;
        i6Var.e = true;
        h6 h6Var = new h6(i6Var, activity, string, true);
        i6Var.c = h6Var;
        h6Var.setContentDescription(LocaleController.getString(R.string.Send));
        i6Var.addView(i6Var.c, gb1.g(-2.0f, -2));
        i6Var.e();
        this.b1 = i6Var;
        i6Var.setVisibility(8);
        this.b1.setOnClickListener(new q9(this, i18));
        this.m0.addView(this.b1, gb1.i(-1, 52, 23));
        fc fcVar = new fc(activity);
        this.p1 = fcVar;
        fcVar.setAlpha(0.0f);
        this.p1.setVisibility(8);
        this.h0.addView(this.p1, gb1.h(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        j6 j6Var = new j6(activity, i10, bVar);
        this.o1 = j6Var;
        this.h0.addView(j6Var, gb1.i(-1, -1, 119));
        l0(false);
    }

    public static sb D(Activity activity, int i10) {
        sb sbVar = F2;
        if (sbVar != null && (sbVar.b != activity || sbVar.c != i10)) {
            sbVar.p(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new sb(activity, i10);
        }
        return F2;
    }

    public static void Z(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(sb sbVar) {
        va vaVar = sbVar.B0;
        if (vaVar == null || vaVar.getTextureView() == null) {
            sbVar.c2 = false;
            return;
        }
        Bitmap bitmap = sbVar.B0.getTextureView().getBitmap();
        if (bitmap == null) {
            sbVar.c2 = false;
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
        sbVar.c2 = f10 < 0.22f;
    }

    public static void b(sb sbVar) {
        ValueAnimator valueAnimator = sbVar.j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            sbVar.j2 = null;
        }
        int i10 = 0;
        sbVar.k2 = false;
        kb kbVar = sbVar.r;
        float f7 = kbVar.a;
        float f10 = kbVar.b;
        kbVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        sbVar.j2 = ofFloat;
        ofFloat.addUpdateListener(new fa(sbVar, f7, f10, i10));
        sbVar.j2.setDuration(340L);
        sbVar.j2.setInterpolator(ds.h);
        sbVar.j2.addListener(new pa(sbVar, i10));
        sbVar.j2.start();
    }

    public static boolean c(sb sbVar) {
        Activity activity = sbVar.b;
        if (activity == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
        return false;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable mutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int dp = AndroidUtilities.dp(35.0f);
        int i10 = -dp;
        mutate.setBounds(i10 / 4, i10, (dp / 4) * 3, 0);
        spannableString.setSpan(new za(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        sb sbVar = F2;
        if (sbVar != null) {
            sbVar.p(false);
        }
        F2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        w7 w7Var = this.K1;
        if (w7Var != null) {
            return w7Var.r();
        }
        return 1;
    }

    public final String B() {
        va vaVar = this.B0;
        if (vaVar == null || vaVar.getCameraSession() == null) {
            return null;
        }
        if (!this.B0.isFrontface() || this.B0.getCameraSession().hasFlashModes()) {
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        o();
        return (String) this.u2.get(this.t2);
    }

    public final v0 C() {
        if (this.N0 == null) {
            v0 v0Var = new v0(this.b);
            this.N0 = v0Var;
            this.k0.addView(v0Var, gb1.h(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String E() {
        va vaVar = this.B0;
        if (vaVar == null || vaVar.getCameraSession() == null) {
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
            xj0 xj0Var = new xj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.h1 = xj0Var;
            xj0Var.h = true;
            w7 w7Var = this.K1;
            if (w7Var == null || !w7Var.y0) {
                xj0Var.P(0);
                this.h1.M(0);
            } else {
                xj0Var.M(35);
                this.h1.P(36);
            }
            this.h1.Z = true;
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.J9, this.a);
            this.h1.Q(w02, "Sunny");
            this.h1.Q(w02, "Path 6");
            this.h1.Q(w02, "Path");
            this.h1.Q(w02, "Path 5");
            this.h1.o();
            ImageView imageView = new ImageView(this.b);
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.i1.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
            this.i1.setOnClickListener(new r9(this, 0));
            this.i1.setVisibility(8);
            this.i1.setImageDrawable(this.h1);
            this.i1.setAlpha(0.0f);
            this.j0.addView(this.i1, 0, gb1.u(46, 56, 53));
        }
        return this.i1;
    }

    public final void G() {
        ta taVar = this.v1;
        if (taVar == null) {
            return;
        }
        this.v2 = null;
        taVar.getTopLayout().setAlpha(0.0f);
        this.v1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.v1.getBottomLayout().setAlpha(0.0f);
        this.v1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.v1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.v1.setVisibility(8);
    }

    public final boolean H() {
        return !this.a2 && (this.A0.j() ? this.A0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean I() {
        qa qaVar;
        if (this.W || (qaVar = this.M0) == null) {
            return false;
        }
        return qaVar.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
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
    public final void J(int i10, boolean z10) {
        w7 w7Var;
        w7 w7Var2;
        d dVar;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i11;
        int i12;
        float dp;
        ImageView imageView;
        w7 w7Var3;
        w7 w7Var4;
        w7 w7Var5;
        w7 w7Var6;
        va vaVar;
        int i13 = this.f0;
        if (i10 == i13) {
            return;
        }
        this.f0 = i10;
        AnimatorSet animatorSet = this.i2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        N(i13, i10);
        i6 i6Var = this.b1;
        if (i6Var != null) {
            i6Var.b(i10 == 1, z10);
        }
        y yVar = this.I0;
        h0(i10 == 0 && this.O1 == 1 && !yVar.e && !H(), z10);
        if (i10 != 1) {
            this.a1.a(z10);
        }
        b0(this.n0, !yVar.e, z10);
        b0(this.E0, (this.a2 || i10 != 0 || yVar.e || this.Y1 == null || H()) ? false : true, z10);
        boolean z11 = this.a2;
        fb fbVar = this.A0;
        b0(this.F0, (z11 || i10 != 0 || (vaVar = this.B0) == null || !vaVar.a || yVar.e || fbVar.j()) ? false : true, true);
        b0(this.G0, (this.a2 || i10 != 0 || yVar.e) ? false : true, z10);
        l0(z10);
        u0 u0Var = this.e1;
        f6 f6Var = this.j1;
        ak0 ak0Var = this.g1;
        cc ccVar = this.t1;
        cc ccVar2 = this.Z0;
        d dVar2 = this.u1;
        org.telegram.ui.ActionBar.b6 b6Var2 = this.p0;
        ib ibVar = this.c1;
        t3 t3Var = this.U0;
        t3 t3Var2 = this.T0;
        g7 g7Var = this.D0;
        gb gbVar = this.X0;
        bh.r rVar = this.l0;
        ja jaVar = this.Q0;
        w6 w6Var = this.O0;
        if (!z10) {
            va vaVar2 = this.B0;
            if (vaVar2 != null) {
                vaVar2.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            }
            gbVar.setAlpha(((i10 != 1 || fbVar.j()) && i10 != 2) ? 0.0f : 1.0f);
            fbVar.setAlpha((i10 == 0 || (i10 == 1 && fbVar.j())) ? 1.0f : 0.0f);
            w6Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            w6Var.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            g7Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            jaVar.setAlpha((i10 != 0 || H()) ? 0.0f : 1.0f);
            jaVar.setTranslationY((i10 != 0 || H()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            t3Var2.setAlpha((i10 == 0 && this.a2 && !H()) ? 1.0f : 0.0f);
            t3Var.setAlpha((i10 == 0 && !this.a2 && H()) ? 0.6f : 0.0f);
            rVar.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
            rVar.setTranslationY((i10 == 1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            ibVar.setAlpha(i10 == 2 ? 0.0f : 1.0f);
            ak0Var.setAlpha((i10 == 1 && this.O1 == 1) ? 1.0f : 0.0f);
            f6Var.setAlpha((i10 != 1 || (this.O1 != 1 && ((w7Var2 = this.K1) == null || TextUtils.isEmpty(w7Var2.y)))) ? 0.0f : 1.0f);
            int i14 = 1;
            u0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.i1;
            if (imageView2 != null) {
                imageView2.setAlpha((i10 == 1 && (w7Var = this.K1) != null && w7Var.u) ? 1.0f : 0.0f);
                i14 = 1;
            }
            ccVar2.setAlpha(i10 == i14 ? 1.0f : 0.0f);
            ccVar.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            b6Var2.setAlpha((i10 == i14 || i10 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            M(i13, i10);
            return;
        }
        this.i2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        va vaVar3 = this.B0;
        if (vaVar3 != null) {
            dVar = dVar2;
            b6Var = b6Var2;
            i11 = 1;
            arrayList.add(ObjectAnimator.ofFloat(vaVar3, (Property<va, Float>) View.ALPHA, i10 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            b6Var = b6Var2;
            i11 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i11];
        fArr[0] = ((i10 != i11 || fbVar.j()) && i10 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(gbVar, (Property<gb, Float>) property, fArr));
        float[] fArr2 = new float[i11];
        fArr2[0] = (i10 == 0 || (i10 == i11 && fbVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) property, fArr2));
        float[] fArr3 = new float[i11];
        fArr3[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(w6Var, (Property<w6, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i11];
        fArr4[0] = i10 == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(w6Var, (Property<w6, Float>) property2, fArr4));
        float[] fArr5 = new float[i11];
        fArr5[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(g7Var, (Property<g7, Float>) property, fArr5));
        float[] fArr6 = new float[i11];
        fArr6[0] = (i10 != 0 || H()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(jaVar, (Property<ja, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(jaVar, (Property<ja, Float>) property2, (i10 != 0 || H()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(t3Var2, (Property<t3, Float>) property, (i10 == 0 && this.a2 && !H()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(t3Var, (Property<t3, Float>) property, (i10 == 0 && !this.a2 && H()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<bh.r, Float>) property, ((i10 == 1 && ((w7Var6 = this.K1) == null || w7Var6.J0 == 0)) || i10 == 2) ? 1.0f : 0.0f));
        if (i10 == 1 && ((w7Var5 = this.K1) == null || w7Var5.J0 == 0)) {
            i12 = 2;
        } else {
            i12 = 2;
            if (i10 != 2) {
                dp = AndroidUtilities.dp(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<bh.r, Float>) property2, dp));
                arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property, i10 != i12 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<org.telegram.ui.ActionBar.b6, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ccVar2, (Property<cc, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ccVar, (Property<cc, Float>) property, i10 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) property, (i10 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<f6, Float>) property, (i10 == 1 || (this.O1 != 1 && ((w7Var4 = this.K1) == null || TextUtils.isEmpty(w7Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                imageView = this.i1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 && (w7Var3 = this.K1) != null && w7Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<fc1, Float>) property, 0.0f));
                this.i2.playTogether(arrayList);
                this.i2.addListener(new oa(this, i13, i10, 0));
                this.i2.setDuration(460L);
                this.i2.setInterpolator(ds.h);
                this.i2.start();
            }
        }
        dp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<bh.r, Float>) property2, dp));
        arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property, i10 != i12 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<org.telegram.ui.ActionBar.b6, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ccVar2, (Property<cc, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ccVar, (Property<cc, Float>) property, i10 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) property, (i10 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<f6, Float>) property, (i10 == 1 || (this.O1 != 1 && ((w7Var4 = this.K1) == null || TextUtils.isEmpty(w7Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        imageView = this.i1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<fc1, Float>) property, 0.0f));
        this.i2.playTogether(arrayList);
        this.i2.addListener(new oa(this, i13, i10, 0));
        this.i2.setDuration(460L);
        this.i2.setInterpolator(ds.h);
        this.i2.start();
    }

    public final void K(Runnable runnable, long j10) {
        if (this.S1 || this.K1 == null) {
            return;
        }
        v9 v9Var = this.g2;
        if (v9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v9Var);
        }
        this.h2 = true;
        this.S1 = true;
        this.g2 = new v9(this, runnable, 1);
        this.X0.setAlpha(0.0f);
        this.X0.setVisibility(0);
        this.X0.n(this.K1, this.g2, j10);
        this.X0.p(this.K1, false);
        AndroidUtilities.runOnUIThread(this.g2, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fc, code lost:
    
        if (r0.k == false) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L() {
        w7 w7Var;
        w7 w7Var2;
        w7 w7Var3;
        ta taVar;
        w7 w7Var4;
        ta taVar2;
        ta taVar3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ib ibVar = this.c1;
            if (ibVar != null && ibVar.O1) {
                ibVar.N1 = false;
                ibVar.z(false, false);
                return false;
            }
            if (this.Q1) {
                w6 w6Var = this.O0;
                if (w6Var.r0) {
                    w6Var.r0 = false;
                    w6Var.v0 = SystemClock.elapsedRealtime();
                    w6Var.u0 = true;
                    ((ma) w6Var.a).e(false);
                    w6Var.J.c(false);
                    w6Var.K.c(false);
                    w6Var.L.c(false);
                    w6Var.invalidate();
                    return false;
                }
            } else if (!this.P1 && !ibVar.p()) {
                ia iaVar = this.d1;
                if (iaVar.M) {
                    iaVar.c(false, true);
                    return false;
                }
                qa qaVar = this.M0;
                if (qaVar != null) {
                    org.telegram.ui.ActionBar.w0 w0Var = qaVar.G;
                    if (w0Var == null || !w0Var.v()) {
                        e(false);
                        this.m2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    if (qaVar.v.c()) {
                        AndroidUtilities.hideKeyboard(searchField);
                        return false;
                    }
                    qaVar.x.t(w0Var.T(true));
                    return false;
                }
                if (this.g0 != 0 || (taVar3 = this.v1) == null || !taVar3.v0()) {
                    if (this.g0 > -1) {
                        k0(-1, false, true);
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
                                l0(true);
                                return false;
                            }
                        }
                    }
                    if (this.f0 == 1 && (((w7Var2 = this.K1) == null || (!w7Var2.n && !w7Var2.u)) && !this.u0)) {
                        if (w7Var2 != null && w7Var2.g && ((taVar2 = this.v1) == null || !taVar2.r0())) {
                            w7 w7Var5 = this.K1;
                            if (!w7Var5.j) {
                            }
                        }
                        ta taVar4 = this.v1;
                        if (taVar4 == null || !taVar4.v0()) {
                            if (this.v0 == 0 && (((this.L1 && !this.A0.j() && (((taVar = this.v1) == null || !taVar.r0()) && ((w7Var4 = this.K1) == null || w7Var4.Z0 == null))) || !this.b1.h) && (((w7Var3 = this.K1) == null || !w7Var3.g || (!w7Var3.n && !w7Var3.u)) && !this.u0 && (w7Var3 == null || !w7Var3.o)))) {
                                J(0, true);
                                return false;
                            }
                            if (this.v0 != 0) {
                                p(true);
                                return false;
                            }
                            Activity activity = this.b;
                            di.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardChanges);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                            w7 w7Var6 = this.K1;
                            if (w7Var6 != null && !w7Var6.g && !w7Var6.o) {
                                alertDialog$Builder.i(LocaleController.getString(w7Var6.c ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new y9(this, 8));
                            }
                            w7 w7Var7 = this.K1;
                            alertDialog$Builder.k(LocaleController.getString((w7Var7 == null || !w7Var7.c || w7Var7.g) ? R.string.Discard : R.string.StoryDeleteDraft), new y9(this, 9));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            e2Var.show();
                            View d = e2Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.y6.q7;
                                org.telegram.ui.ActionBar.f7.V((TextView) d, i11, bVar);
                                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(i0.a.o(org.telegram.ui.ActionBar.y6.w0(i11, bVar), 51), 6, 6);
                                org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i11, 51);
                                d.setBackground(Z);
                                org.telegram.ui.ActionBar.f7.k(d, Z, null, h, bVar);
                            }
                        }
                    }
                    if (this.f0 != 2 || (w7Var = this.K1) == null || w7Var.b0) {
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

    public final void M(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            u(false);
            this.O0.setVisibility(8);
            this.V0.setVisibility(8);
            this.Q0.setVisibility(8);
            g(false, false);
            c0(false);
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
                y();
                x();
            }
            this.p0.setVisibility(i11 == 2 ? 0 : 8);
            v();
            this.p1.setAlpha(0.0f);
            this.p1.setVisibility(8);
            this.a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            w7 w7Var = this.K1;
            if (w7Var == null || !w7Var.n) {
                t();
                G();
            }
            cg0 cg0Var = this.C1;
            if (cg0Var != null) {
                cg0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            w7 w7Var2 = this.K1;
            this.a1.setVisibility((w7Var2 == null || w7Var2.h0 < 30000) ? 8 : 0);
            this.l0.setAlpha(1.0f);
            this.l0.setTranslationY(0.0f);
            w7 w7Var3 = this.K1;
            this.c1.setVisibility((w7Var3 == null || w7Var3.J0 == 0) ? 0 : 8);
        }
        if (i11 == 0 && this.V1) {
            C().setVisibility(0);
            v0 C = C();
            C.r.d(0.0f, true);
            C.a(true);
            di.s8 s8Var = C.h;
            if (s8Var != null) {
                AndroidUtilities.cancelRunOnUIThread(s8Var);
            }
            di.s8 s8Var2 = new di.s8(C, 13);
            C.h = s8Var2;
            AndroidUtilities.runOnUIThread(s8Var2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        cg0 cg0Var2 = this.C1;
        if (cg0Var2 != null) {
            cg0Var2.setAllowTouch(i11 == 1 && ((i12 = this.g0) == -1 || i12 == 1));
        }
        ib ibVar = this.c1;
        if (ibVar != null) {
            ibVar.e0 = i11 != 1;
        }
        if (i11 == 1) {
            int i13 = this.c;
            MediaDataController.getInstance(i13).checkStickers(0);
            MediaDataController.getInstance(i13).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i13).loadRecents(2, false, true, false);
            di.h7 storiesController = MessagesController.getInstance(i13).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i13).getStoriesController().R();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(int i10, int i11) {
        long j10;
        SpannableStringBuilder append;
        w7 w7Var;
        w7 w7Var2;
        boolean z10;
        w7 w7Var3;
        w7 w7Var4;
        w7 w7Var5;
        h81 textureView;
        w7 w7Var6;
        boolean z11 = true;
        if (i11 == 0) {
            Y(false);
            this.O0.setVisibility(0);
            w6 w6Var = this.O0;
            if (w6Var != null) {
                w6Var.g(false);
            }
            this.Q0.setVisibility(0);
            this.V0.setVisibility(0);
            this.V0.setAlpha(0.0f);
            this.J0.a(0L, true);
            w7 w7Var7 = this.K1;
            if (w7Var7 != null) {
                w7Var7.i(false);
                this.K1 = null;
            }
            fb fbVar = this.A0;
            if (fbVar != null) {
                fbVar.e();
                this.O0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            d0(null);
            a0(new p9(this, 18));
            v0 v0Var = this.N0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.W0.e(true);
            v3 v3Var = this.l1;
            if (v3Var != null) {
                v3Var.e(true);
            }
        }
        int i12 = this.c;
        if (i11 == 1 || i10 == 1) {
            this.e1.setEntry(i11 == 1 ? this.K1 : null);
            if (this.O1 == 1) {
                this.g1.setVisibility(0);
                w7 w7Var8 = this.K1;
                e0(w7Var8 != null && w7Var8.Y, false);
                this.j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((dh0) this.j1.c).a(this.X0.k(), false);
                this.p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                w7 w7Var9 = this.K1;
                if (w7Var9 == null || TextUtils.isEmpty(w7Var9.y)) {
                    this.p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.g1.setVisibility(8);
                    this.j1.setVisibility(0);
                    ((dh0) this.j1.c).a(true, false);
                    this.p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.e1.setVisibility(0);
            w7 w7Var10 = this.K1;
            if (w7Var10 == null || !w7Var10.u) {
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                F().setVisibility(0);
                n0(false);
            }
            this.b1.setVisibility(0);
            this.X0.setVisibility(0);
            w7 w7Var11 = this.K1;
            this.c1.setVisibility(((w7Var11 == null || w7Var11.J0 == 0) && this.v0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            w7 w7Var12 = this.K1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((w7Var12 == null || w7Var12.J0 == 0) && this.v0 == 0) ? 68.0f : 12.0f);
            this.Y0.setLayoutParams(layoutParams);
            this.l0.setVisibility(0);
            this.l0.clearFocus();
            w7 w7Var13 = this.K1;
            this.c1.A(w7Var13 == null ? 86400 : w7Var13.I0, false);
            this.c1.setPeriodVisible(!MessagesController.getInstance(i12).premiumFeaturesBlocked() && ((w7Var = this.K1) == null || !w7Var.g));
            w7 w7Var14 = this.K1;
            this.c1.setHasRoundVideo((w7Var14 == null || w7Var14.o0 == null) ? false : true);
            ib ibVar = this.c1;
            if (ibVar == null) {
                j10 = 0;
            } else {
                w7 w7Var15 = this.K1;
                if (w7Var15 == null || !w7Var15.n) {
                    j10 = 0;
                    ibVar.v(null, null);
                } else {
                    TLRPC.Peer peer = w7Var15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i12).getUser(Long.valueOf(peer.user_id)));
                        w7 w7Var16 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        w7Var16.p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        w7 w7Var17 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        w7Var17.p = append;
                    }
                    String str2 = this.K1.s;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    String str3 = str2;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new na(), 0, spannableString.length(), 33);
                        str3 = spannableString;
                    }
                    this.c1.v(append, str3);
                }
            }
            w7 w7Var18 = this.K1;
            boolean z12 = (w7Var18 != null && w7Var18.v() && this.K1.t()) ? false : true;
            cc ccVar = this.Z0;
            boolean z13 = ccVar.j0;
            ccVar.j0 = z12;
            ccVar.i0.f(z12, true);
            ccVar.invalidate();
        } else {
            j10 = 0;
        }
        if (i11 == 2 || i10 == 2) {
            this.p0.setVisibility(0);
            this.t1.setVisibility(0);
            w7 w7Var19 = this.K1;
            if (w7Var19 != null && w7Var19.b0) {
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
            w7 w7Var20 = this.K1;
            boolean z14 = (w7Var20 == null || w7Var20.J0 == j10) ? false : true;
            boolean z15 = w7Var20 != null && w7Var20.g;
            String string = LocaleController.getString(z15 ? R.string.Done : z14 ? R.string.UploadBotPreview : R.string.Next);
            boolean z16 = !z14;
            i6 i6Var = this.b1;
            if (!TextUtils.equals(string, i6Var.d) || z16 != i6Var.e) {
                i6Var.removeView(i6Var.c);
                Context context = i6Var.getContext();
                i6Var.d = string;
                i6Var.e = z16;
                h6 h6Var = new h6(i6Var, context, string, z16);
                i6Var.c = h6Var;
                h6Var.setContentDescription(string);
                i6Var.addView(i6Var.c, gb1.g(-2.0f, -2));
                i6Var.e();
            }
            this.t1.setVisibility(8);
            this.u1.setVisibility(8);
            if (!this.h2) {
                w7 w7Var21 = this.K1;
                if (w7Var21 == null || !w7Var21.u) {
                    this.X0.set(w7Var21);
                } else {
                    this.X0.l(w7Var21);
                }
            }
            this.h2 = false;
            this.c1.f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i12).storyEntitiesAllowed() ? null : new p9(this, 19));
            this.d1.setVisibility(this.H1 == null ? 8 : 0);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                ia iaVar = this.d1;
                iaVar.c(false, false);
                iaVar.c = arrayList;
                iaVar.d = arrayList2;
                iaVar.e = arrayList3;
                iaVar.w = new q11(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                iaVar.K = new q11(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                iaVar.b.g3.O(false);
                this.d1.setSelected(this.H1.indexOf(this.K1));
            }
            this.Z0.setMaxCount((z14 || z15 || this.H1 != null || ((w7Var6 = this.K1) != null && (w7Var6.v() || !this.K1.K))) ? 1 : 3);
            if (i10 != 2) {
                w7 w7Var22 = this.K1;
                if (w7Var22 != null && (w7Var22.c || w7Var22.g || this.u0)) {
                    if (w7Var22.P0 != null) {
                        y();
                        t();
                        G();
                    }
                    w7 w7Var23 = this.K1;
                    if (w7Var23.K && w7Var23.a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new y9(this, 7));
                    }
                    this.c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    ib ibVar2 = this.c1;
                    ibVar2.V = true;
                    ibVar2.f.setText("");
                }
            }
            w7 w7Var24 = this.K1;
            this.b1.d(4, w7Var24 == null || ((!w7Var24.u || w7Var24.K) && !w7Var24.v()));
            this.b1.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (w7Var5 = this.K1) == null || w7Var5.u || w7Var5.v()) ? false : true);
            if (!this.N1 && !this.c1.o()) {
                di.h7 storiesController = MessagesController.getInstance(i12).getStoriesController();
                int A = A();
                di.b7 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.a, A) || ((w7Var4 = this.K1) != null && (w7Var4.g || w7Var4.J0 != j10))) {
                    z10 = true;
                    this.b1.setShareEnabled(z10);
                    w7 w7Var25 = this.K1;
                    this.g1.setImageResource((w7Var25 == null && w7Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.p0.setVisibility(0);
                    this.p0.setTranslationX(0.0f);
                    w7Var3 = this.K1;
                    if (w7Var3 == null && w7Var3.J0 != j10) {
                        this.p0.l("", false);
                    } else if (w7Var3 == null && w7Var3.g) {
                        this.p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (w7Var3 == null && w7Var3.u) {
                        this.p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (w7Var3 == null && w7Var3.n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(this.p0, 32.0f, i12);
                        this.p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(j5Var, 0, 1, 33);
                        if (this.K1.q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(this.K1.q.user_id));
                            j5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.q)));
                            j5Var.b(chat2);
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
            w7 w7Var252 = this.K1;
            this.g1.setImageResource((w7Var252 == null && w7Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.p0.setVisibility(0);
            this.p0.setTranslationX(0.0f);
            w7Var3 = this.K1;
            if (w7Var3 == null) {
            }
            if (w7Var3 == null) {
            }
            if (w7Var3 == null) {
            }
            if (w7Var3 == null) {
            }
            this.p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z11 = true;
        }
        if (i10 == z11) {
            ib ibVar3 = this.c1;
            k80 k80Var = ibVar3.V0;
            if (k80Var != null) {
                k80Var.u();
                ibVar3.V0 = null;
            }
            this.k1.e(z11);
            ia iaVar2 = this.d1;
            if (iaVar2.M) {
                iaVar2.c(false, z11);
            }
        }
        if (i11 == 2 && (w7Var2 = this.K1) != null) {
            if (w7Var2.e0 < j10) {
                w7Var2.e0 = j10;
            }
            this.M1 = w7Var2.e0;
            long duration = this.X0.getDuration() < 100 ? this.K1.h0 : this.X0.getDuration();
            w7 w7Var26 = this.K1;
            if (w7Var26.h0 <= 0) {
                w7Var26.h0 = duration;
            }
            File file = w7Var26.Z0;
            if (file == null) {
                file = w7Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            w7 w7Var27 = this.K1;
            this.t1.o(false, absolutePath, w7Var27.h0, w7Var27.P);
            w7 w7Var28 = this.K1;
            float f7 = duration;
            long j11 = (long) (w7Var28.Z * f7);
            long j12 = (long) (w7Var28.a0 * f7);
            cc ccVar2 = this.t1;
            ccVar2.Z0 = j11;
            ccVar2.a1 = j12;
            xb xbVar = ccVar2.h;
            if (xbVar != null) {
                xb.a(xbVar, true);
            }
            ai.e eVar = new ai.e(this, 22);
            this.t1.setDelegate(new ra(eVar));
            float max = (this.M1 / Math.max(1L, duration)) * 0.96f;
            this.t1.setVideoLeft(max);
            this.t1.setVideoRight(0.04f + max);
            eVar.run(Boolean.TRUE, Float.valueOf(max));
        }
        cg0 cg0Var = this.C1;
        if (cg0Var != null) {
            cg0Var.setAllowTouch(false);
        }
        v3 v3Var2 = this.m1;
        if (v3Var2 != null) {
            v3Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        ib ibVar4 = this.c1;
        if (ibVar4 != null) {
            g gVar = ibVar4.f;
            gVar.d();
            gVar.k(true);
            this.c1.e0 = true;
        }
        gb gbVar = this.X0;
        if (gbVar != null) {
            gbVar.x(8, i11 != 1);
        }
        ta taVar = this.v1;
        if (taVar != null) {
            taVar.setCoverPreview(i11 != 1);
        }
        v3 v3Var3 = this.n1;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
        fb fbVar2 = this.A0;
        fbVar2.setPreview(i11 == 1 && fbVar2.j());
    }

    public final void O() {
        rg.a1 a1Var;
        boolean z10 = false;
        if (this.f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Y(false);
            } else {
                this.x2 = new p9(this, 3);
            }
        }
        ib ibVar = this.c1;
        if (ibVar != null) {
            ibVar.f.s();
        }
        w6 w6Var = this.O0;
        if (w6Var != null) {
            w6Var.h();
        }
        j6 j6Var = this.o1;
        if (j6Var != null) {
            di.h7 storiesController = MessagesController.getInstance(j6Var.a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.i.f(UserConfig.getInstance(storiesController.a).clientUserId);
            j6Var.b = storiesController.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            j6Var.c.invalidate();
        }
        ta taVar = this.v1;
        if (taVar != null && (a1Var = taVar.D0.d) != null) {
            a1Var.postRunnable(a1Var.w);
        }
        gb gbVar = this.X0;
        if (gbVar != null) {
            gbVar.x(0, false);
        }
        a1 a1Var2 = MessagesController.getInstance(this.c).getStoriesController().w;
        if (a1Var2.c || a1Var2.d) {
            return;
        }
        a1Var2.d = true;
        x0 x0Var = new x0(a1Var2, 1);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var2.a);
        messagesStorage.getStorageQueue().postRunnable(new bi.u7(messagesStorage, z10, x0Var, 3));
    }

    public final void P(int i10, int i11) {
        ta taVar;
        cb cbVar;
        db dbVar;
        ta taVar2;
        if (i11 == 0) {
            this.n0.setVisibility(8);
        }
        if (i10 == 0 && (taVar2 = this.v1) != null) {
            taVar2.setVisibility(8);
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
        if ((i11 == 0 || i10 == 0) && (taVar = this.v1) != null) {
            taVar.S0.setLayerType(0, null);
        }
        cg0 cg0Var = this.C1;
        if (cg0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            cg0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            cb cbVar2 = this.r1;
            if (cbVar2 != null) {
                cbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (cbVar = this.r1) != null) {
            cbVar.setVisibility(8);
            this.r1.setAppearProgress(0.0f);
            cb cbVar3 = this.r1;
            cbVar3.x = null;
            g0 g0Var = cbVar3.f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            cbVar3.d.setVisibility(8);
            cbVar3.a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            db dbVar2 = this.s1;
            if (dbVar2 != null) {
                dbVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i10 != 4 || (dbVar = this.s1) == null) {
            return;
        }
        dbVar.setVisibility(8);
        this.s1.setAppearProgress(0.0f);
        db dbVar3 = this.s1;
        dbVar3.b = null;
        g0 g0Var2 = dbVar3.h;
        g0Var2.L = null;
        g0Var2.d = null;
        g0Var2.J = false;
        dbVar3.e.setVisibility(8);
        dbVar3.setVisibility(8);
    }

    public final void Q(mb mbVar) {
        di.b7 o10;
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
        this.u0 = false;
        this.e = false;
        this.B2 = false;
        this.s0.g = false;
        WindowManager windowManager = this.f;
        if (windowManager != null && (rbVar = this.n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.A0.setCameraThumb(z());
        if (this.v0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            g0(o10, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.H;
        if (mbVar != null) {
            this.F = mbVar;
            this.J = mbVar.a;
            rectF.set(mbVar.c);
            this.G = mbVar.b;
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
        f(1.0f, true, new p9(this, 6));
        d();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void R(lb lbVar, w7 w7Var, long j10) {
        rb rbVar;
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
        if (windowManager != null && (rbVar = this.n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.K1 = w7Var;
        this.O1 = w7Var.K ? 1 : 0;
        this.s0.g = false;
        RectF rectF = this.H;
        if (lbVar != null) {
            this.F = lbVar;
            this.J = lbVar.a;
            rectF.set(lbVar.c);
            this.G = lbVar.b;
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
        w7 w7Var2 = this.K1;
        if (w7Var2 != null) {
            this.c1.setText(w7Var2.C0);
        }
        K(new ha(this, 0), j10);
        J(this.K1.b0 ? 2 : 1, false);
        k0(-1, false, false);
        this.b1.b(false, false);
        d();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void S() {
        k80 k80Var;
        gb gbVar = this.X0;
        if (gbVar != null) {
            gbVar.x(4, true);
        }
        ib ibVar = this.c1;
        if (ibVar != null && (k80Var = ibVar.V0) != null) {
            k80Var.u();
            ibVar.V0 = null;
        }
        tg.y0 y0Var = new tg.y0((org.telegram.ui.ActionBar.r2) new wa(this, 1), 14, false);
        y0Var.setOnDismissListener(new da(this, 1));
        y0Var.show();
    }

    public final void T(lb lbVar, w7 w7Var) {
        di.b7 o10;
        rb rbVar;
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
        if (windowManager != null && (rbVar = this.n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            f0();
        }
        this.K1 = w7Var;
        o9.a(i10, w7Var);
        w7 w7Var2 = this.K1;
        int i11 = (w7Var2 == null || !w7Var2.K) ? 0 : 1;
        this.O1 = i11;
        this.s0.g = w7Var2 != null && w7Var2.u && i11 == 1;
        if (this.v0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            g0(o10, true);
        }
        RectF rectF = this.H;
        if (lbVar != null) {
            this.F = lbVar;
            this.J = lbVar.a;
            rectF.set(lbVar.c);
            this.G = lbVar.b;
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
        w7 w7Var3 = this.K1;
        if (w7Var3 != null) {
            this.c1.setText(w7Var3.C0);
        }
        this.b1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new p9(this, 6));
        d();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void U() {
        rg.c1 c1Var = this.w1;
        if (c1Var != null) {
            c1Var.bringToFront();
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
        fc fcVar = this.p1;
        if (fcVar != null) {
            fcVar.bringToFront();
        }
        cg0 cg0Var = this.C1;
        if (cg0Var != null) {
            cg0Var.bringToFront();
        }
        sf0 sf0Var = this.E1;
        if (sf0Var != null) {
            sf0Var.bringToFront();
        }
        uf0 uf0Var = this.F1;
        if (uf0Var != null) {
            uf0Var.bringToFront();
        }
        j6 j6Var = this.o1;
        if (j6Var != null) {
            j6Var.bringToFront();
        }
        p pVar = this.q1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void V(w7 w7Var, boolean z10) {
        w7 w7Var2;
        boolean z11;
        if (w7Var == null || this.X0.getWidth() <= 0 || this.X0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? w7Var.O0 : w7Var.N0;
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
        h81 textureView = this.X0.getTextureView();
        if (w7Var.K && !w7Var.u && textureView != null) {
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
        File file2 = w7Var.Q0;
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
        File file3 = w7Var.P0;
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
        ta taVar = this.v1;
        if (taVar != null && taVar.G0 != null) {
            canvas.save();
            canvas.scale(f7, f7);
            ta taVar2 = this.v1;
            taVar2.x0 = true;
            y5 y5Var = taVar2.G0;
            y5Var.a = true;
            y5Var.draw(canvas);
            ta taVar3 = this.v1;
            taVar3.G0.a = false;
            taVar3.x0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = w7.w(this.c, "jpg");
        if (z10) {
            w7Var2 = w7Var;
            z11 = z10;
            Utilities.searchQueue.postRunnable(new r1(this, createBitmap, z11, w10, w7Var2, 1));
        } else {
            w7Var2 = w7Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        if (!z11) {
            w7Var2.N0 = w10;
        }
        w7Var2.b1 = createScaledBitmap;
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
        di.b7 o10;
        ?? r16;
        n9 n9Var = this.q0;
        BitmapDrawable bitmapDrawable = null;
        if (n9Var != null) {
            n9Var.dismiss();
            this.q0 = null;
        }
        if (this.N1) {
            u0 u0Var = this.e1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            h6 h6Var = this.b1.c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(h6Var, i10);
            return;
        }
        ib ibVar = this.c1;
        if (ibVar != null && ibVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.s6 s6Var = ibVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(s6Var, i11);
            ibVar.e();
            return;
        }
        w7 w7Var = this.K1;
        int i12 = this.c;
        int i13 = 0;
        if ((w7Var == null || (!w7Var.g && w7Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, A())) {
            g0(o10, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        di.b bVar = this.a;
        boolean z10 = true;
        if (ibVar != null && !this.K1.D0) {
            CharSequence text = ibVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((z11[]) spannable.getSpans(0, text.length(), z11.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new wc(this.n, bVar).R(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.y6.gc, 0, new p9(this, 27), bVar)).k(true);
                    int i14 = -this.U1;
                    this.U1 = i14;
                    AndroidUtilities.shakeViewSpring(ibVar, i14);
                    return;
                }
            }
        }
        w7 w7Var2 = this.K1;
        if (w7Var2.g || w7Var2.J0 != 0) {
            w7Var2.l = false;
            h(null);
            o0();
            return;
        }
        if (this.N != 0) {
            w7Var2.v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
        }
        gb gbVar = this.X0;
        gbVar.x(3, true);
        n9 n9Var2 = new n9(this.b, this.K1.I0, bVar);
        n9Var2.r1(this.K1.E0);
        n9Var2.q1(this.K1.v0);
        n9Var2.F = this.M;
        n9Var2.U = new q9(this, 14);
        n9Var2.f1(!this.A0.j());
        ArrayList arrayList = this.I1;
        n9Var2.n1(arrayList == null ? this.K1.r() : arrayList.size());
        n9Var2.l1(false);
        CharSequence text2 = ibVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (a71 a71Var : (a71[]) ((Spanned) text2).getSpans(0, text2.length(), a71.class)) {
                if (a71Var != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(a71Var.getURL())));
                        if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                            arrayList2.add(UserObject.getPublicUsername(user));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (text2 != null) {
            int i15 = 0;
            int i16 = -1;
            while (i15 < text2.length()) {
                char charAt = text2.charAt(i15);
                boolean z11 = z10;
                if (charAt == '@') {
                    i16 = i15 + 1;
                } else if (charAt == ' ') {
                    if (i16 != -1) {
                        String charSequence = text2.subSequence(i16, i15).toString();
                        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(charSequence);
                        if (userOrChat instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) userOrChat;
                            if (!user2.bot && !UserObject.isUserSelf(user2) && user2.id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
                                arrayList2.add(charSequence);
                            }
                        }
                    }
                    i16 = -1;
                }
                i15++;
                z10 = z11;
            }
            boolean z12 = z10;
            r16 = z12;
            if (i16 != -1) {
                String charSequence2 = text2.subSequence(i16, text2.length()).toString();
                TLObject userOrChat2 = MessagesController.getInstance(i12).getUserOrChat(charSequence2);
                r16 = z12;
                if (userOrChat2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) userOrChat2;
                    r16 = z12;
                    if (!user3.bot) {
                        r16 = z12;
                        if (!UserObject.isUserSelf(user3)) {
                            r16 = z12;
                            if (user3.id != 777000) {
                                r16 = z12;
                                if (!UserObject.isReplyUser(user3)) {
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
        n9Var2.S = arrayList2;
        n9Var2.W = new q9(this, 15);
        n9Var2.X = new q9(this, 16);
        n9Var2.T = new y9(this, 10);
        this.q0 = n9Var2;
        w7 w7Var3 = this.K1;
        if (w7Var3.K) {
            if (gbVar != null && !w7Var3.f0 && this.f0 != 2) {
                w7Var3.e0 = gbVar.getCurrentPosition();
                q9 q9Var = new q9(this, 17);
                rg.c1 c1Var = this.w1;
                View view = this.z1;
                View[] viewArr = new View[3];
                viewArr[0] = gbVar;
                viewArr[r16] = c1Var;
                viewArr[2] = view;
                gbVar.h(q9Var, viewArr);
            }
            n9 n9Var3 = this.q0;
            Bitmap bitmap = this.K1.g0;
            p9 p9Var = new p9(this, 20);
            if (bitmap != null) {
                n9Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            n9Var3.b0 = bitmapDrawable;
            n9Var3.c0 = p9Var;
            h1 h1Var = n9Var3.b;
            if (h1Var != null) {
                for (View view2 : h1Var.getViewPages()) {
                    if (view2 instanceof g9) {
                        g9 g9Var = (g9) view2;
                        g9Var.g(false);
                        g9Var.e(false);
                    }
                }
            }
        }
        this.q0.setOnDismissListener(new da(this, i13));
        this.q0.show();
    }

    public final void X(nb nbVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (nbVar != null) {
            this.F = nbVar;
            this.J = nbVar.a;
            rectF.set(nbVar.c);
            this.G = nbVar.b;
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

    public final void Y(boolean z10) {
        if (!this.w2 || z10) {
            this.s2 = false;
            Activity activity = this.b;
            if (activity != null) {
                boolean z11 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    ar arVar = new ar(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    arVar.e = dp;
                    arVar.f = dp2;
                    this.A0.setCameraThumb(arVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.a);
                        int i10 = R.raw.permission_request_camera;
                        int i11 = org.telegram.ui.ActionBar.y6.L5;
                        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.y6.x0(null, i11, false), null);
                        alertDialog$Builder.n(i11, null);
                        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new y9(this, 13));
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
                q();
            } else {
                CameraController.getInstance().initCamera(new p9(this, 0));
            }
        }
    }

    public final void a0(Runnable runnable) {
        va vaVar = this.B0;
        if (vaVar == null || vaVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new e2.m0(this, this.B0.getTextureView().getBitmap(), runnable, 9));
        } catch (Throwable unused) {
        }
    }

    public final void b0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new sa(this, 1)).setListener(new ai.l0(this, z10, view, 4)).setDuration(320L).setInterpolator(ds.h).start();
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void d() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void d0(String str) {
        int i10;
        this.E0.clearAnimation();
        va vaVar = this.B0;
        if ((vaVar != null && vaVar.isDual()) || this.a2) {
            str = null;
        }
        this.Y1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(this.E0, false, true);
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
        dc dcVar = this.E0;
        if (dcVar.n != i10) {
            dcVar.n = i10;
            ValueAnimator valueAnimator = dcVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                dcVar.r = null;
            }
            dcVar.setDrawable(i10);
        }
        if (this.f0 == 0 && !this.I0.e && this.Y1 != null && !H()) {
            z10 = true;
        }
        b0(this.E0, z10, true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        di.b7 o10;
        w7 w7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            w6 w6Var = this.O0;
            if (w6Var != null) {
                w6Var.h();
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
            w6 w6Var2 = this.O0;
            if (w6Var2 == null || this.V1) {
                return;
            }
            w6Var2.h();
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f0;
            int i15 = this.c;
            if (i14 != 1) {
                if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                    w7 w7Var2 = this.K1;
                    if (w7Var2 == null || w7Var2.J0 == 0) {
                        g0(o10, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.N1 && !this.c1.o()) {
                di.h7 storiesController = MessagesController.getInstance(i15).getStoriesController();
                int A = A();
                di.b7 o11 = storiesController.o();
                if (o11 == null || !o11.a(storiesController.a, A) || ((w7Var = this.K1) != null && (w7Var.g || w7Var.J0 != 0))) {
                    z10 = true;
                }
            }
            this.b1.setShareEnabled(z10);
        }
    }

    public final void e(boolean z10) {
        v0 v0Var;
        this.K0 = z10;
        Boolean bool = this.p2;
        if (bool == null || bool.booleanValue() != z10) {
            int i10 = 0;
            if (this.M0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            if (this.M0.U) {
                this.q2 = new z9(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.n2 = null;
            }
            o1.j jVar = this.o2;
            if (jVar != null) {
                jVar.c();
                this.o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            qa qaVar = this.M0;
            if (qaVar != null) {
                qaVar.K = false;
            }
            if (z10 && (v0Var = this.N0) != null) {
                v0Var.a(false);
            }
            kb kbVar = this.r;
            if (kbVar != null) {
                kbVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.M0.setImportantForAccessibility(z10 ? 0 : 4);
            this.p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            rb rbVar = this.n;
            float height = z10 ? 0.0f : (rbVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            int i11 = 1;
            Math.max(1, rbVar.getHeight());
            qa qaVar2 = this.M0;
            qaVar2.K = !z10;
            this.k2 = this.j2 == null;
            if (z10) {
                o1.j jVar2 = new o1.j(qaVar2, o1.h.n, height);
                this.o2 = jVar2;
                jVar2.u.a(0.75f);
                this.o2.u.b(350.0f);
                this.o2.a(new aa(this, height, i10));
                this.o2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.n2 = ofFloat;
                ofFloat.addUpdateListener(new ba(this, i10));
                this.n2.addListener(new pa(this, i11));
                this.n2.setDuration(450L);
                this.n2.setInterpolator(ds.h);
                this.n2.start();
            }
            if (!z10 && !this.S1) {
                this.l2 = null;
            }
            if (z10 || this.f0 != 0 || this.s2) {
                return;
            }
            q();
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f1 == null) {
            xj0 xj0Var = new xj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f1 = xj0Var;
            xj0Var.F *= 1.5f;
        }
        this.g1.setAnimation(this.f1);
        if (!z11) {
            this.f1.N(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            xj0 xj0Var2 = this.f1;
            if (xj0Var2.a0 > 20) {
                xj0Var2.N(0, false, false);
            }
            this.f1.P(20);
            this.f1.start();
            return;
        }
        xj0 xj0Var3 = this.f1;
        int i10 = xj0Var3.a0;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        xj0Var3.P(43);
        this.f1.start();
    }

    public final void f(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        kb kbVar = this.r;
        if (!z10) {
            this.L = null;
            this.I = f7;
            j();
            kbVar.invalidate();
            this.n.invalidate();
            runnable.run();
            n();
            return;
        }
        this.P.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.L = Float.valueOf(this.K);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ba(this, 5));
        this.E.addListener(new bi.l7(this, f7, runnable, 3));
        if (f7 < 1.0f && this.v) {
            this.E.setDuration(250L);
            this.E.setInterpolator(ds.h);
        } else if (f7 > 0.0f || kbVar.a < AndroidUtilities.dp(20.0f)) {
            this.E.setDuration(300L);
            this.E.setInterpolator(new u1.a());
        } else if (f7 >= 0.0f || !this.O) {
            this.E.setDuration(400L);
            this.E.setInterpolator(ds.h);
        } else {
            this.E.setDuration(200L);
            this.E.setInterpolator(ds.h);
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

    public final void g(boolean z10, boolean z11) {
        y yVar;
        if (z10) {
            v3 v3Var = this.l1;
            if (v3Var != null) {
                v3Var.e(true);
            }
            v3 v3Var2 = this.m1;
            if (v3Var2 != null) {
                v3Var2.e(true);
            }
            v3 v3Var3 = this.k1;
            if (v3Var3 != null) {
                v3Var3.e(true);
            }
            v3 v3Var4 = this.W0;
            if (v3Var4 != null) {
                v3Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.b2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.b2 = H();
        if (z10 && (yVar = this.I0) != null && yVar.e) {
            yVar.a(false, z11);
        }
        l0(z11);
        ja jaVar = this.Q0;
        t3 t3Var = this.U0;
        t3 t3Var2 = this.T0;
        if (!z11) {
            t3Var2.setAlpha((z10 && this.f0 == 0 && !H()) ? 1.0f : 0.0f);
            t3Var2.setTranslationY((z10 && this.f0 == 0 && !H()) ? 0.0f : AndroidUtilities.dp(16.0f));
            t3Var.setAlpha((!z10 && this.f0 == 0 && H()) ? 0.6f : 0.0f);
            t3Var.setTranslationY((!z10 && this.f0 == 0 && H()) ? 0.0f : AndroidUtilities.dp(16.0f));
            jaVar.setAlpha((z10 || this.f0 != 0 || H()) ? 0.0f : 1.0f);
            jaVar.setTranslationY((z10 || this.f0 != 0 || H()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Z1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t3Var2, (Property<t3, Float>) property, (z10 && this.f0 == 0 && !H()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(t3Var2, (Property<t3, Float>) property2, (z10 && this.f0 == 0 && !H()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(t3Var, (Property<t3, Float>) property, (!z10 && this.f0 == 0 && H()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(t3Var, (Property<t3, Float>) property2, (!z10 && this.f0 == 0 && H()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(jaVar, (Property<ja, Float>) property, (z10 || this.f0 != 0 || H()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(jaVar, (Property<ja, Float>) property2, (z10 || this.f0 != 0 || H()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.Z1.setDuration(260L);
        this.Z1.setInterpolator(ds.h);
        this.Z1.start();
    }

    public final void g0(di.b7 b7Var, boolean z10) {
        if (this.z2) {
            return;
        }
        xa xaVar = new xa(b7Var.b(), this.c, this.b, new wa(this, 0), null);
        xaVar.X = A();
        xaVar.setOnDismissListener(new y80(2, this, z10));
        this.X0.x(7, true);
        this.z2 = true;
        xaVar.show();
    }

    public final void h(Runnable runnable) {
        w7 w7Var;
        Runnable runnable2;
        gb gbVar;
        eg0 eg0Var = this.B1;
        if (eg0Var == null || (w7Var = this.K1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        w7Var.j = eg0Var.d() | w7Var.j;
        w7 w7Var2 = this.K1;
        eg0 eg0Var2 = this.B1;
        File file = w7Var2.Z0;
        if (file != null) {
            file.delete();
            w7Var2.Z0 = null;
        }
        MediaController.SavedFilterState savedFilterState = eg0Var2.getSavedFilterState();
        w7Var2.a1 = savedFilterState;
        if (w7Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = eg0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i10 = w7Var2.R;
                    boolean z10 = true;
                    matrix.postScale(i10 == 1 ? -1.0f : 1.0f, i10 == 2 ? -1.0f : 1.0f, w7Var2.k0 / 2.0f, w7Var2.l0 / 2.0f);
                    matrix.postRotate(-w7Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    w7Var2.n0.preScale(w7Var2.k0 / createBitmap.getWidth(), w7Var2.l0 / createBitmap.getHeight());
                    w7Var2.k0 = createBitmap.getWidth();
                    w7Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = w7Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        w7Var2.Z0.delete();
                    }
                    String k10 = w7.k(w7Var2.L);
                    if (!"png".equals(k10) && !"webp".equals(k10)) {
                        z10 = false;
                    }
                    boolean z11 = z10;
                    w7Var2.Z0 = w7.w(w7Var2.a, z11 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z11 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(w7Var2.Z0));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new bi.s9(w7Var2, createBitmap, z11, runnable2, 3));
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
            w7 w7Var3 = this.K1;
            if (w7Var3.K || (gbVar = this.X0) == null) {
                return;
            }
            gbVar.set(w7Var3);
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.d2 == z10) {
            return;
        }
        this.d2 = z10;
        if (z11) {
            this.J0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(ds.h).withEndAction(new z9(this, z10, 1)).start();
            return;
        }
        this.J0.clearAnimation();
        this.J0.setAlpha(z10 ? 1.0f : 0.0f);
        if (z10) {
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

    public final void i0(boolean z10) {
        fc1 fc1Var = this.V0;
        if ((fc1Var.getTag() != null && z10) || (fc1Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                p9 p9Var = new p9(this, 25);
                this.e2 = p9Var;
                AndroidUtilities.runOnUIThread(p9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        fc1Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            fc1Var.setVisibility(0);
        }
        this.f2.playTogether(ObjectAnimator.ofFloat(fc1Var, (Property<fc1, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.f2.addListener(new bh.f0(14, this, z10));
        this.f2.start();
        if (z10) {
            p9 p9Var2 = new p9(this, 26);
            this.e2 = p9Var2;
            AndroidUtilities.runOnUIThread(p9Var2, 2000L);
        }
    }

    public final void j() {
        di.q3 q3Var;
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
        nb nbVar = this.F;
        if (nbVar != null && (q3Var = nbVar.f) != null) {
            q3Var.setTranslationX((rectF.left - rectF2.left) * this.I);
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
        n9 n9Var = this.q0;
        if (n9Var != null) {
            n9Var.dismiss();
            this.q0 = null;
        }
        n9 n9Var2 = new n9(this.b, 86400, this.a);
        n9Var2.p1();
        n9Var2.r1(this.y0);
        TLRPC.InputPeer inputPeer = this.x0;
        if (inputPeer == null) {
            inputPeer = this.N != 0 ? MessagesController.getInstance(this.c).getInputPeer(this.N) : new TLRPC.TL_inputPeerSelf();
        }
        n9Var2.q1(inputPeer);
        n9Var2.F = this.M;
        n9Var2.U = new q9(this, 18);
        n9Var2.f1(false);
        n9Var2.n1(1);
        n9Var2.l1(false);
        n9Var2.W = new q9(this, 19);
        n9Var2.T = new y9(this, 12);
        this.q0 = n9Var2;
        n9Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        if (r6.isRecycled() != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        w7 w7Var;
        ImageReceiver photoImage;
        if (this.v1 == null || (w7Var = this.K1) == null) {
            return;
        }
        w7Var.f();
        this.K1.j |= this.v1.r0();
        w7 w7Var2 = this.K1;
        ArrayList arrayList = w7Var2.T0;
        if (arrayList == null) {
            w7Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ta taVar = this.v1;
        w7 w7Var3 = this.K1;
        taVar.q0(w7Var3.T0, false, false, false, false, w7Var3);
        w7 w7Var4 = this.K1;
        if (!w7Var4.K) {
            w7Var4.S0 = Utilities.clamp(this.v1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.v1.getMasks();
        this.K1.U0 = masks != null ? new ArrayList(masks) : null;
        w7 w7Var5 = this.K1;
        boolean z10 = w7Var5.K;
        boolean E = w7Var5.E();
        this.K1.T0 = new ArrayList();
        ta taVar2 = this.v1;
        w7 w7Var6 = this.K1;
        Bitmap q02 = taVar2.q0(w7Var6.T0, true, false, false, !z10, w7Var6);
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
        w7 w7Var7 = this.K1;
        w7Var7.P0 = null;
        w7Var7.R0 = null;
        w7Var7.Q0 = null;
        int i10 = this.c;
        FileLoader fileLoader = FileLoader.getInstance(i10);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        w7 w7Var8 = this.K1;
        w7Var7.P0 = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(q02, compressFormat, w7Var8.i0, w7Var8.j0, 87, false, 101, 101), true);
        if (q02 != null && !q02.isRecycled()) {
            q02.recycle();
        }
        w7 w7Var9 = this.K1;
        if (w7Var9.u) {
            File file4 = w7Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1.Y0 = null;
            }
            w7 w7Var10 = this.K1;
            long j10 = w7Var10.z0;
            if (j10 != Long.MIN_VALUE) {
                Drawable drawable = w7Var10.x0;
                if (drawable == null) {
                    drawable = o6.e(null, i10, j10, this.c2);
                }
                if (drawable != null) {
                    this.K1.Y0 = w7.w(i10, "webp");
                    w7 w7Var11 = this.K1;
                    Bitmap createBitmap = Bitmap.createBitmap(w7Var11.i0, w7Var11.j0, Bitmap.Config.ARGB_8888);
                    w7.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
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
        w7 w7Var12 = this.K1;
        if (w7Var12.u) {
            File file5 = w7Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                this.K1.X0 = null;
            }
            w7 w7Var13 = this.K1;
            if (w7Var13.u && w7Var13.K) {
                int i11 = w7Var13.k0;
                int i12 = w7Var13.l0;
                sg.g1 p02 = this.v1.p0();
                if (p02 != null) {
                    sg.y0 y0Var = p02.r0;
                    if (y0Var.getChildCount() == 1 && i11 > 0 && i12 > 0) {
                        if ((y0Var.getChildAt(0) instanceof org.telegram.ui.Cells.s1) && (photoImage = ((org.telegram.ui.Cells.s1) y0Var.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
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
                                this.K1.X0 = w7.w(i10, "webp");
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
            ta taVar3 = this.v1;
            ArrayList arrayList2 = new ArrayList();
            w7 w7Var14 = this.K1;
            int i17 = w7Var14.i0;
            Bitmap q03 = taVar3.q0(arrayList2, false, true, false, false, w7Var14);
            w7 w7Var15 = this.K1;
            FileLoader fileLoader2 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            w7 w7Var16 = this.K1;
            w7Var15.R0 = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(q03, compressFormat2, w7Var16.i0, w7Var16.j0, 87, false, 101, 101), true);
            if (q03 != null && !q03.isRecycled()) {
                q03.recycle();
            }
        }
        if (this.v1.D0.getPainting().E) {
            Bitmap blurBitmap = this.v1.getBlurBitmap();
            w7 w7Var17 = this.K1;
            FileLoader fileLoader3 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            w7 w7Var18 = this.K1;
            w7Var17.Q0 = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, w7Var18.i0, w7Var18.j0, 87, false, 101, 101), true);
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
    public final void k0(int i10, boolean z10, boolean z11) {
        float f7;
        boolean z12;
        cb cbVar;
        float f10;
        int i11;
        db dbVar;
        int i12;
        float f11;
        w7 w7Var;
        ImageView imageView;
        int i13;
        int i14;
        float f12;
        float f13;
        uf0 uf0Var;
        sf0 sf0Var;
        ImageView imageView2;
        int i15;
        w7 w7Var2;
        ta taVar;
        ta taVar2;
        int i16 = this.g0;
        if (i16 == i10 && !z10) {
            return;
        }
        ib ibVar = this.c1;
        if (i10 != -1 && ibVar != null && ibVar.O1) {
            return;
        }
        this.g0 = i10;
        AnimatorSet animatorSet = this.r2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r2 = null;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.p0;
        cc ccVar = this.Z0;
        u0 u0Var = this.e1;
        o2 o2Var = this.n0;
        f6 f6Var = this.j1;
        ak0 ak0Var = this.g1;
        if (i16 != i10) {
            if (i10 == -1) {
                o2Var.setVisibility(0);
                ibVar.setVisibility(0);
                ta taVar3 = this.v1;
                if (taVar3 != null) {
                    taVar3.A0(null, true);
                }
                u0Var.setVisibility(0);
                w7 w7Var3 = this.K1;
                if (w7Var3 == null || !w7Var3.u) {
                    ImageView imageView3 = this.i1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    F().setVisibility(0);
                    n0(false);
                }
                b6Var.setVisibility(0);
                if (this.O1 == 1) {
                    ak0Var.setVisibility(0);
                    f6Var.setVisibility(0);
                } else {
                    w7 w7Var4 = this.K1;
                    if (w7Var4 != null && !TextUtils.isEmpty(w7Var4.y)) {
                        ak0Var.setVisibility(8);
                        f6Var.setVisibility(0);
                    }
                }
                ccVar.setVisibility(0);
            }
            if (i10 == 0 && (taVar2 = this.v1) != null) {
                taVar2.setVisibility(0);
            }
            if ((i10 == 0 || i16 == 0) && (taVar = this.v1) != null) {
                taVar.S0.setLayerType(2, null);
            }
            ta taVar4 = this.v1;
            if (taVar4 != null) {
                taVar4.D1.b(i10 != 0);
            }
            ibVar.L.b(i10 != -1);
            org.telegram.ui.Components.qc.e();
            if (this.B1 != null && i16 == 1) {
                h(null);
            }
            cg0 cg0Var = this.C1;
            if (cg0Var != null) {
                cg0Var.setAllowTouch(false);
            }
            this.k1.e(true);
            rb rbVar = this.n;
            gb gbVar = this.X0;
            Activity activity = this.b;
            if (i10 == 3) {
                if (this.r1 == null) {
                    cb cbVar2 = new cb(this, activity, gbVar);
                    this.r1 = cbVar2;
                    rbVar.addView(cbVar2.d);
                    rbVar.addView(this.r1);
                }
                this.r1.setVisibility(0);
                w7 w7Var5 = this.K1;
                if (w7Var5 != null) {
                    this.r1.setEntry(w7Var5);
                }
            } else if (i16 == 3) {
                gbVar.b();
                cb cbVar3 = this.r1;
                if (cbVar3 != null) {
                    cbVar3.a.setCropEditorDrawing(cbVar3);
                    cbVar3.y = true;
                }
            }
            if (i10 == 4) {
                if (this.s1 == null) {
                    db dbVar2 = new db(this, activity, gbVar);
                    this.s1 = dbVar2;
                    rbVar.addView(dbVar2.e);
                    rbVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
            } else if (i16 == 4) {
                gbVar.b();
                db dbVar3 = this.s1;
                if (dbVar3 != null) {
                    dbVar3.E = true;
                }
            }
        }
        this.b1.b((i10 == -1 || i10 == 2) && this.I > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        eg0 eg0Var = this.B1;
        boolean z13 = eg0Var == null && i10 == 1;
        float f14 = 1.0f;
        if (i10 == 1) {
            r();
            eg0 eg0Var2 = this.B1;
            this.v2 = eg0Var2;
            FrameLayout toolsView = eg0Var2 != null ? eg0Var2.getToolsView() : null;
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
            if (i16 == 1 && eg0Var != null) {
                this.v2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(eg0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.B1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i10 != 0) {
                    t();
                    this.v2 = this.v1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(o2Var, (Property<o2, Float>) property, f7));
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
                    arrayList.add(ObjectAnimator.ofFloat(o2Var, (Property<o2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getTopLayout(), (Property<View, Float>) property3, f7));
                    View topLayout2 = this.v1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property3, f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property4, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                cbVar = this.r1;
                if (cbVar == null) {
                    ng.f fVar = cbVar.h;
                    if (i10 == 3) {
                        Property property5 = View.ALPHA;
                        i11 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<ng.f, Float>) property5, 0.0f, 1.0f));
                        ng.f fVar2 = this.r1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f10 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar2, (Property<ng.f, Float>) property6, AndroidUtilities.dp(52.0f), f7));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property6, AndroidUtilities.dp(52.0f), f7));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new ba(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        f10 = 52.0f;
                        i11 = 2;
                        if (i16 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<ng.f, Float>) property7, 1.0f, 0.0f));
                            ng.f fVar3 = this.r1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(fVar3, (Property<ng.f, Float>) property8, f7, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property8, f7, AndroidUtilities.dp(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.r1.getAppearProgress(), f7);
                            ofFloat2.addUpdateListener(new ba(this, i11));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    f10 = 52.0f;
                    i11 = 2;
                }
                dbVar = this.s1;
                if (dbVar != null) {
                    ng.f fVar4 = dbVar.n;
                    if (i10 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i11];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<ng.f, Float>) property9, fArr));
                        ng.f fVar5 = this.s1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i11];
                        fArr2[0] = AndroidUtilities.dp(f10);
                        fArr2[1] = f7;
                        arrayList.add(ObjectAnimator.ofFloat(fVar5, (Property<ng.f, Float>) property10, fArr2));
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
                        ofFloat3.addUpdateListener(new ba(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i16 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i11];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<ng.f, Float>) property11, fArr6));
                        ng.f fVar6 = this.s1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float dp = AndroidUtilities.dp(f10);
                        float[] fArr7 = new float[i11];
                        fArr7[0] = f7;
                        fArr7[1] = dp;
                        arrayList.add(ObjectAnimator.ofFloat(fVar6, (Property<ng.f, Float>) property12, fArr7));
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
                        ofFloat4.addUpdateListener(new ba(this, 4));
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
                        arrayList.add(ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<f6, Float>) property13, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((w7Var = this.K1) == null || TextUtils.isEmpty(w7Var.y)))) ? 1.0f : f7));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : f7));
                        imageView = this.i1;
                        if (imageView != null) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i10 == -1 || i10 == 2) && (w7Var2 = this.K1) != null && w7Var2.u) ? 1.0f : f7));
                        } else {
                            i13 = 1;
                        }
                        int i17 = this.f0;
                        float[] fArr12 = new float[i13];
                        fArr12[0] = ((i17 != i13 || i17 == 2) && i10 == -1) ? 1.0f : f7;
                        arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<org.telegram.ui.ActionBar.b6, Float>) property13, fArr12));
                        eb ebVar = this.h0;
                        if (i10 == i13) {
                            ebVar.setPivotY(ebVar.getMeasuredHeight() * 0.2f);
                            i14 = AndroidUtilities.dp(164.0f);
                        } else if (i10 == 0) {
                            ebVar.setPivotY(ebVar.getMeasuredHeight() * 0.6f);
                            i14 = AndroidUtilities.dp(40.0f);
                        } else if (i10 == 2) {
                            ebVar.setPivotY(f7);
                            i14 = ccVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            f12 = (r10 - i14) / (ebVar.getHeight() - ((int) ebVar.getPivotY()));
                        } else {
                            f12 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(ebVar, (Property<eb, Float>) View.SCALE_X, f12));
                        arrayList.add(ObjectAnimator.ofFloat(ebVar, (Property<eb, Float>) View.SCALE_Y, f12));
                        if (i10 == -1) {
                            f13 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(ebVar, (Property<eb, Float>) View.TRANSLATION_Y, 0.0f));
                        } else {
                            f13 = 0.0f;
                        }
                        uf0Var = this.F1;
                        if (uf0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(uf0Var, (Property<uf0, Float>) property13, i10 == 1 ? 1.0f : f13));
                        }
                        sf0Var = this.E1;
                        if (sf0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(sf0Var, (Property<sf0, Float>) property13, i10 == 1 ? 1.0f : f13));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property13, i10 == -1 ? 1.0f : f13));
                        float[] fArr13 = {(i10 != -1 || i10 == 2) ? 1.0f : f13};
                        bh.r rVar = this.l0;
                        arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<bh.r, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<bh.r, Float>) property14, (i10 != -1 || i10 == 2) ? f13 : AndroidUtilities.dp(120.0f)));
                        if (i10 != -1 && i10 != 2) {
                            f14 = f13;
                        }
                        FrameLayout frameLayout3 = this.Y0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f14));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ibVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.j0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i10 == 2 ? -90.0f : f13));
                        arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<f6, Float>) property15, i10 == 2 ? 90.0f : f13));
                        arrayList.add(ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) property15, i10 == 2 ? 90.0f : f13));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property15, i10 == 2 ? 90.0f : f13));
                        imageView2 = this.i1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i10 == 2 ? 90.0f : f13));
                        }
                        if (this.r0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i15 = 0;
                            ofFloat5.addUpdateListener(new sa(this, i15));
                            arrayList.add(ofFloat5);
                        } else {
                            i15 = 0;
                        }
                        if (ccVar != null) {
                            w7 w7Var6 = this.K1;
                            boolean z14 = (w7Var6 == null || !w7Var6.v() || !this.K1.t() || i10 == 2) ? 1 : i15;
                            if (ccVar.j0 != z14 || !z11) {
                                ccVar.j0 = z14;
                                if (!z11) {
                                    ccVar.i0.f(z14, true);
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
                                P(i16, i10);
                                return;
                            }
                            return;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.r2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.r2.setDuration(320L);
                        this.r2.setInterpolator(ds.h);
                        this.r2.addListener(new oa(this, i16, i10, 1));
                        if (z12) {
                            this.r2.setStartDelay(120L);
                        }
                        this.r2.start();
                        return;
                    }
                } else {
                    i12 = 1;
                }
                f11 = f7;
                float[] fArr112 = new float[i12];
                fArr112[0] = f11;
                arrayList.add(ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<f6, Float>) property13, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((w7Var = this.K1) == null || TextUtils.isEmpty(w7Var.y)))) ? 1.0f : f7));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : f7));
                imageView = this.i1;
                if (imageView != null) {
                }
                int i172 = this.f0;
                float[] fArr122 = new float[i13];
                fArr122[0] = ((i172 != i13 || i172 == 2) && i10 == -1) ? 1.0f : f7;
                arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<org.telegram.ui.ActionBar.b6, Float>) property13, fArr122));
                eb ebVar2 = this.h0;
                if (i10 == i13) {
                }
                if (i14 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(ebVar2, (Property<eb, Float>) View.SCALE_X, f12));
                arrayList.add(ObjectAnimator.ofFloat(ebVar2, (Property<eb, Float>) View.SCALE_Y, f12));
                if (i10 == -1) {
                }
                uf0Var = this.F1;
                if (uf0Var != null) {
                }
                sf0Var = this.E1;
                if (sf0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property13, i10 == -1 ? 1.0f : f13));
                float[] fArr132 = {(i10 != -1 || i10 == 2) ? 1.0f : f13};
                bh.r rVar2 = this.l0;
                arrayList.add(ObjectAnimator.ofFloat(rVar2, (Property<bh.r, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(rVar2, (Property<bh.r, Float>) property142, (i10 != -1 || i10 == 2) ? f13 : AndroidUtilities.dp(120.0f)));
                if (i10 != -1) {
                    f14 = f13;
                }
                FrameLayout frameLayout32 = this.Y0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f14));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ibVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.j0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i10 == 2 ? -90.0f : f13));
                arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<f6, Float>) property152, i10 == 2 ? 90.0f : f13));
                arrayList.add(ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) property152, i10 == 2 ? 90.0f : f13));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property152, i10 == 2 ? 90.0f : f13));
                imageView2 = this.i1;
                if (imageView2 != null) {
                }
                if (this.r0.c()) {
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
        cbVar = this.r1;
        if (cbVar == null) {
        }
        dbVar = this.s1;
        if (dbVar != null) {
        }
        Property property132 = View.ALPHA;
        if (i10 != -1) {
        }
        i12 = 1;
        if (this.O1 == 1) {
        }
        f11 = f7;
        float[] fArr1122 = new float[i12];
        fArr1122[0] = f11;
        arrayList.add(ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<f6, Float>) property132, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((w7Var = this.K1) == null || TextUtils.isEmpty(w7Var.y)))) ? 1.0f : f7));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property132, (i10 != -1 || i10 == 2) ? 1.0f : f7));
        imageView = this.i1;
        if (imageView != null) {
        }
        int i1722 = this.f0;
        float[] fArr1222 = new float[i13];
        fArr1222[0] = ((i1722 != i13 || i1722 == 2) && i10 == -1) ? 1.0f : f7;
        arrayList.add(ObjectAnimator.ofFloat(b6Var, (Property<org.telegram.ui.ActionBar.b6, Float>) property132, fArr1222));
        eb ebVar22 = this.h0;
        if (i10 == i13) {
        }
        if (i14 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(ebVar22, (Property<eb, Float>) View.SCALE_X, f12));
        arrayList.add(ObjectAnimator.ofFloat(ebVar22, (Property<eb, Float>) View.SCALE_Y, f12));
        if (i10 == -1) {
        }
        uf0Var = this.F1;
        if (uf0Var != null) {
        }
        sf0Var = this.E1;
        if (sf0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property132, i10 == -1 ? 1.0f : f13));
        float[] fArr1322 = {(i10 != -1 || i10 == 2) ? 1.0f : f13};
        bh.r rVar22 = this.l0;
        arrayList.add(ObjectAnimator.ofFloat(rVar22, (Property<bh.r, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(rVar22, (Property<bh.r, Float>) property1422, (i10 != -1 || i10 == 2) ? f13 : AndroidUtilities.dp(120.0f)));
        if (i10 != -1) {
        }
        FrameLayout frameLayout322 = this.Y0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f14));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ibVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.j0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i10 == 2 ? -90.0f : f13));
        arrayList.add(ObjectAnimator.ofFloat(f6Var, (Property<f6, Float>) property1522, i10 == 2 ? 90.0f : f13));
        arrayList.add(ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) property1522, i10 == 2 ? 90.0f : f13));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property1522, i10 == 2 ? 90.0f : f13));
        imageView2 = this.i1;
        if (imageView2 != null) {
        }
        if (this.r0.c()) {
        }
        if (ccVar != null) {
        }
        if (!z11) {
        }
    }

    public final void l() {
        w7 w7Var;
        if (this.v1 == null || (w7Var = this.K1) == null || !w7Var.u) {
            return;
        }
        File file = w7Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.K1.W0 = null;
        }
        this.K1.W0 = w7.w(this.c, "webp");
        ta taVar = this.v1;
        w7 w7Var2 = this.K1;
        Bitmap q02 = taVar.q0(w7Var2.T0, false, false, true, this.O1 != 1, w7Var2);
        try {
            try {
                q02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                if (q02.isRecycled()) {
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
        va vaVar;
        boolean z11 = false;
        h0(this.f0 == 0 && this.O1 == 1 && !this.I0.e && !H(), z10);
        this.G0.setSelected(this.A0.j());
        y yVar = this.I0;
        b0(this.n0, yVar == null || !yVar.e, z10);
        b0(this.E0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.Y1 == null || this.I0.e || H()) ? false : true, z10);
        b0(this.F0, (this.a2 || this.O1 == -1 || this.f0 != 0 || (vaVar = this.B0) == null || !vaVar.a || this.I0.e || this.A0.j()) ? false : true, z10);
        b0(this.G0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.I0.e) ? false : true, z10);
        b0(this.H0, this.I0.e, z10);
        this.O0.e(this.A0.j() ? this.A0.getFilledProgress() : 0.0f, z10);
        boolean z12 = this.I0.e;
        v3 v3Var = this.n1;
        if (z12) {
            v3Var.u();
        } else {
            v3Var.e(true);
        }
        g(this.a2, z10);
        AndroidUtilities.updateViewShow(this.S0, this.O1 == -1 && this.f0 == 0);
        if (this.O1 == -1 && this.f0 == 0) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.R0, z11);
    }

    public final void m0() {
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

    public final void n() {
        boolean z10 = this.K != 0.0f || this.I < 1.0f || this.B2;
        if (z10 == this.A2) {
            return;
        }
        ag.b1 b1Var = this.y;
        if (b1Var != null) {
            b1Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void n0(boolean z10) {
        xj0 xj0Var = this.h1;
        if (xj0Var != null) {
            int[] iArr = xj0Var.e;
            int i10 = 0;
            if (!z10) {
                w7 w7Var = this.K1;
                int i11 = (w7Var == null || !w7Var.y0) ? 0 : iArr[0] - 1;
                xj0Var.N(i11, false, true);
                this.h1.P(i11);
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            w7 w7Var2 = this.K1;
            if (w7Var2 != null && w7Var2.y0) {
                i10 = iArr[0];
            }
            xj0Var.P(i10);
            xj0 xj0Var2 = this.h1;
            if (xj0Var2 != null) {
                xj0Var2.start();
            }
        }
    }

    public final void o() {
        if (this.t2 < 0) {
            this.t2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.u2 = arrayList;
            arrayList.add("off");
            this.u2.add("auto");
            this.u2.add("on");
            float f7 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            q2 q2Var = this.s;
            q2Var.o = f7;
            q2Var.n = q2.f(f7);
            q2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            q2 q2Var2 = this.s;
            q2Var2.p = f10;
            q2Var2.i();
        }
    }

    public final void o0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        p9 p9Var = new p9(this, 2);
        ta taVar = this.v1;
        w7 w7Var = this.K1;
        if (taVar == null || w7Var == null) {
            p9Var.run();
            return;
        }
        w7Var.f();
        boolean r02 = taVar.r0();
        boolean z10 = taVar.D0.getPainting().E;
        Utilities.searchQueue.postRunnable(new s9(this, taVar, w7Var.i0, w7Var.j0, w7Var, z10, r02, p9Var, 1));
    }

    public final void p(boolean z10) {
        gb gbVar;
        if (this.d) {
            n9 n9Var = this.q0;
            if (n9Var != null) {
                n9Var.dismiss();
                this.q0 = null;
            }
            w7 w7Var = this.K1;
            long j10 = 0;
            if (w7Var != null && !w7Var.h) {
                if ((this.v && w7Var.g) || w7Var.b != 0) {
                    w7Var.j = false;
                }
                w7Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 == null || (gbVar = this.X0) == null) {
                gb gbVar2 = this.X0;
                if (gbVar2 != null && !z10) {
                    gbVar2.set(null);
                }
                f(0.0f, z10, new p9(this, 23));
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
            s81 s81Var = gbVar.y;
            if (s81Var != null) {
                s81Var.B();
                gbVar.y.H();
                gbVar.y = null;
            }
            s81 s81Var2 = gbVar.x;
            if (s81Var2 != null) {
                j10 = s81Var2.n();
                gbVar.x.B();
                gbVar.x.H();
                gbVar.x = null;
            }
            s81 s81Var3 = gbVar.e;
            if (s81Var3 != null) {
                j10 = s81Var3.n();
                gbVar.e.B();
                gbVar.e.H();
                gbVar.e = null;
            }
            callback4.run(Long.valueOf(j10), new z9(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.w));
        }
    }

    public final boolean p0() {
        va vaVar;
        if ((!this.P1 && !this.Q1) || (vaVar = this.B0) == null || !vaVar.isFrontface()) {
            return false;
        }
        int i10 = this.t2;
        return i10 == 2 || (i10 == 1 && this.c2);
    }

    public final void q() {
        Activity activity = this.b;
        if (this.B0 != null || activity == null) {
            return;
        }
        this.B0 = new va(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        w6 w6Var = this.O0;
        if (w6Var != null) {
            w6Var.g0 = 0.0f;
            w6Var.h0.d(0.0f, true);
        }
        this.B0.recordHevc = !this.A0.j();
        this.B0.setThumbDrawable(z());
        this.B0.initTexture();
        this.B0.setDelegate(new y9(this, 0));
        b0(this.F0, this.B0.a && this.f0 == 0, true);
        this.G0.setTranslationX(this.B0.a ? 0.0f : AndroidUtilities.dp(46.0f));
        this.A0.setCameraView(this.B0);
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.W0.u();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else if ((!c1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", c1.p(ApplicationLoader.applicationContext, false))) && this.B0.a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
            this.l1.u();
        }
        if (this.C0 == null) {
            this.C0 = new s6(activity, new q9(this, 3));
        }
        this.C0.a(this.B0);
        g7 g7Var = this.D0;
        if (g7Var != null) {
            fb fbVar = this.A0;
            Object blurRenderNode = fbVar.getBlurRenderNode();
            g7Var.F = fbVar;
            g7Var.G = blurRenderNode;
            g7Var.invalidate();
        }
    }

    public final void r() {
        w7 w7Var;
        Bitmap bitmap;
        Bitmap q5;
        if (this.B1 != null || (w7Var = this.K1) == null) {
            return;
        }
        if (w7Var.K) {
            bitmap = null;
        } else {
            if (w7Var.Z0 == null) {
                q5 = this.X0.getPhotoBitmap();
            } else {
                y9 y9Var = new y9(this, 11);
                Point point = AndroidUtilities.displaySize;
                q5 = w7.q(y9Var, point.x, point.y, 0, true);
            }
            bitmap = q5;
        }
        if (bitmap != null || this.K1.K) {
            h81 textureView = this.X0.getTextureView();
            int orientation = this.X0.getOrientation();
            w7 w7Var2 = this.K1;
            eg0 eg0Var = new eg0(this.b, textureView, bitmap, null, orientation, w7Var2 != null ? w7Var2.a1 : null, null, 0, false, false, this.r0, this.a);
            this.B1 = eg0Var;
            this.r.addView(eg0Var);
            cg0 cg0Var = this.C1;
            if (cg0Var != null) {
                cg0Var.setFilterView(this.B1);
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
            sf0 blurControl = this.B1.getBlurControl();
            this.E1 = blurControl;
            if (blurControl != null) {
                this.h0.addView(blurControl);
            }
            uf0 curveControl = this.B1.getCurveControl();
            this.F1 = curveControl;
            if (curveControl != null) {
                this.h0.addView(curveControl);
            }
            U();
            this.B1.getDoneTextView().setOnClickListener(new r9(this, 13));
            this.B1.getCancelTextView().setOnClickListener(new r9(this, 14));
            this.B1.getToolsView().setVisibility(8);
            this.B1.getToolsView().setAlpha(0.0f);
            this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.B1.i0.setVisibility(0);
        }
    }

    public final void s(boolean z10) {
        if (this.M0 != null) {
            fb fbVar = this.A0;
            if ((fbVar != null && fbVar.j()) == this.M0.P) {
                return;
            }
        }
        if (this.b == null) {
            return;
        }
        if (this.M0 != null) {
            v();
        }
        MediaController.AlbumEntry albumEntry = this.m2;
        boolean z11 = !z10;
        fb fbVar2 = this.A0;
        qa qaVar = new qa(this, this.c, this.b, this.a, albumEntry, z10, z11, fbVar2 != null && fbVar2.j());
        this.M0 = qaVar;
        qaVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new ha(this, 1));
        this.M0.setOnSelectListener(new ga(0, this, z10));
        this.M0.setOnSelectMultipleListener(new bi.j2(this, 2));
        s4.b0 b0Var = this.l2;
        if (b0Var != null) {
            y2 y2Var = this.M0.e;
            y2Var.B = b0Var;
            y2Var.l0();
        }
        this.n.addView(this.M0, gb1.i(-1, -1, 119));
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
        w7 w7Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        w7 w7Var2;
        rg.c1 renderView;
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
        w7 w7Var3 = this.K1;
        Bitmap decodeFile = (w7Var3 == null || !(w7Var3.c || w7Var3.g || this.H1 != null) || (file3 = w7Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        w7 w7Var4 = this.K1;
        if (w7Var4 == null || (!(w7Var4.c || w7Var4.g || this.H1 != null) || (file2 = w7Var4.Q0) == null)) {
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
                w7Var = this.K1;
                if (w7Var != null || w7Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = w7Var != null ? file : w7Var.L;
                if (w7Var == null && w7Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (w7Var != null || w7Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.X0.getOrientation();
                w7Var2 = this.K1;
                Object obj2 = obj;
                if (w7Var2 != null) {
                    obj2 = w7Var2.T0;
                }
                ?? r13 = obj2;
                MediaController.CropState cropState = new MediaController.CropState();
                n6 n6Var = this.s0;
                gb gbVar = this.X0;
                Activity activity = this.b;
                boolean z15 = z12;
                ta taVar = new ta(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, w7Var2, measuredWidth, measuredHeight, cropState, this.r0, this.a, n6Var, gbVar);
                this.v1 = taVar;
                w7 w7Var5 = this.K1;
                taVar.setHasAudio(w7Var5 == null && w7Var5.y != null);
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
                U();
                this.v1.setOnDoneButtonClickedListener(new p9(this, 21));
                this.v1.setOnCancelButtonClickedListener(new p9(this, 22));
                ta taVar2 = this.v1;
                taVar2.G0.setVisibility(0);
                taVar2.D0.setVisibility(0);
                taVar2.E0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.h0.getMeasuredWidth();
        int measuredHeight2 = this.h0.getMeasuredHeight();
        w7Var = this.K1;
        if (w7Var != null) {
        }
        file = null;
        z11 = false;
        if (w7Var != null) {
        }
        if (w7Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (w7Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.X0.getOrientation();
        w7Var2 = this.K1;
        Object obj22 = obj;
        if (w7Var2 != null) {
        }
        ?? r132 = obj22;
        MediaController.CropState cropState2 = new MediaController.CropState();
        n6 n6Var2 = this.s0;
        gb gbVar2 = this.X0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        ta taVar3 = new ta(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, w7Var2, measuredWidth2, measuredHeight2, cropState2, this.r0, this.a, n6Var2, gbVar2);
        this.v1 = taVar3;
        w7 w7Var52 = this.K1;
        taVar3.setHasAudio(w7Var52 == null && w7Var52.y != null);
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
        this.v1.setOnDoneButtonClickedListener(new p9(this, 21));
        this.v1.setOnCancelButtonClickedListener(new p9(this, 22));
        ta taVar22 = this.v1;
        taVar22.G0.setVisibility(0);
        taVar22.D0.setVisibility(0);
        taVar22.E0.setVisibility(0);
    }

    public final void u(boolean z10) {
        s6 s6Var = this.C0;
        if (s6Var != null) {
            s6Var.f = null;
            Utilities.globalQueue.cancelRunnable(s6Var.h);
            this.C0 = null;
            fb fbVar = this.A0;
            if (fbVar != null) {
                fbVar.c.a(null);
            }
        }
        g7 g7Var = this.D0;
        if (g7Var != null) {
            g7Var.F = null;
            g7Var.G = null;
            g7Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                a0(new p9(this, 8));
                return;
            }
            a0(new p9(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            fb fbVar2 = this.A0;
            if (fbVar2 != null) {
                fbVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void v() {
        qa qaVar = this.M0;
        if (qaVar == null) {
            return;
        }
        this.n.removeView(qaVar);
        this.M0 = null;
        ValueAnimator valueAnimator = this.n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n2 = null;
        }
        o1.j jVar = this.o2;
        if (jVar != null) {
            jVar.c();
            this.o2 = null;
        }
        this.p2 = null;
    }

    public final void x() {
        eg0 eg0Var = this.B1;
        if (eg0Var == null) {
            return;
        }
        eg0Var.e();
        this.C1.setFilterView(null);
        this.r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        sf0 sf0Var = this.E1;
        if (sf0Var != null) {
            this.h0.removeView(sf0Var);
            this.E1 = null;
        }
        uf0 uf0Var = this.F1;
        if (uf0Var != null) {
            this.h0.removeView(uf0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void y() {
        ta taVar = this.v1;
        if (taVar == null) {
            return;
        }
        taVar.G0.removeAllViews();
        ta taVar2 = this.v1;
        taVar2.D0.h();
        taVar2.G0.setVisibility(8);
        taVar2.F0.setVisibility(8);
        taVar2.t0.postRunnable(new ag.c(14));
        n5 n5Var = taVar2.Z1;
        if (n5Var != null) {
            n5Var.dismiss();
        }
        rg.y yVar = taVar2.I1;
        if (yVar != null) {
            yVar.dismiss();
        }
        this.r.removeView(this.v1);
        this.v1 = null;
        rg.c1 c1Var = this.w1;
        if (c1Var != null) {
            this.h0.removeView(c1Var);
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
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        return bitmap != null ? new BitmapDrawable(bitmap) : this.b.getResources().getDrawable(R.drawable.icplaceholder);
    }
}
