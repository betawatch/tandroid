package di;

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
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kb0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class pc implements NotificationCenter.NotificationCenterDelegate {
    public static pc F2;
    public final cc A0;
    public View A1;
    public boolean A2;
    public sb B0;
    public jf0 B1;
    public boolean B2;
    public h7 C0;
    public final hf0 C1;
    public xb C2;
    public final w7 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final ad E0;
    public ye0 E1;
    public ValueAnimator E2;
    public kc F;
    public final bd F0;
    public af0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final ad H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final ed J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public o8 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public ob M0;
    public long M1;
    public long N;
    public v0 N0;
    public boolean N1;
    public boolean O;
    public final l7 O0;
    public int O1;
    public final AnimationNotificationsLocker P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final gb Q0;
    public boolean Q1;
    public Utilities.Callback4 R;
    public final w2 R0;
    public boolean R1;
    public int S;
    public final w2 S0;
    public boolean S1;
    public int T;
    public final c4 T0;
    public float T1;
    public int U;
    public final c4 U0;
    public int U1;
    public boolean V;
    public final d91 V0;
    public boolean V1;
    public boolean W;
    public final f4 W0;
    public boolean W1;
    public boolean X;
    public final dc X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final zc Z0;
    public AnimatorSet Z1;
    public final bi.b a;
    public int a0;
    public final dd a1;
    public boolean a2;
    public final Activity b;
    public int b0;
    public final u6 b1;
    public boolean b2;
    public final int c;
    public final RectF c0;
    public final fc c1;
    public boolean c2;
    public boolean d;
    public final RectF d0;
    public final fb d1;
    public boolean d2;
    public boolean e;
    public final Path e0;
    public final u0 e1;
    public Runnable e2;
    public final WindowManager f;
    public int f0;
    public xi0 f1;
    public AnimatorSet f2;
    public int g0;
    public final aj0 g1;
    public qa g2;
    public final WindowManager.LayoutParams h;
    public final bc h0;
    public xi0 h1;
    public boolean h2;
    public final FrameLayout i0;
    public ImageView i1;
    public AnimatorSet i2;
    public final LinearLayout j0;
    public final r6 j1;
    public ValueAnimator j2;
    public final FrameLayout k0;
    public final f4 k1;
    public boolean k2;
    public final ah.y l0;
    public final f4 l1;
    public s4.b0 l2;
    public final FrameLayout m0;
    public final f4 m1;
    public MediaController.AlbumEntry m2;
    public final oc n;
    public final w2 n0;
    public final f4 n1;
    public ValueAnimator n2;
    public final h8 o0;
    public final v6 o1;
    public o1.k o2;
    public final org.telegram.ui.ActionBar.j5 p0;
    public final cd p1;
    public Boolean p2;
    public ia q0;
    public p q1;
    public ua q2;
    public final hc r;
    public final org.telegram.ui.Components.ja r0;
    public zb r1;
    public AnimatorSet r2;
    public final y2 s;
    public final c7 s0;
    public ac s1;
    public boolean s2;
    public final eb t0;
    public final zc t1;
    public int t2;
    public boolean u0;
    public final d u1;
    public ArrayList u2;
    public boolean v;
    public long v0;
    public rb v1;
    public FrameLayout v2;
    public long w;
    public String w0;
    public qg.c1 w1;
    public boolean w2;
    public gc x;
    public TLRPC.InputPeer x0;
    public View x1;
    public ka x2;
    public final kb0 y;
    public ga y0;
    public View y1;
    public ah.g y2;
    public t z0;
    public View z1;
    public boolean z2;

    public pc(Activity activity, int i10) {
        int i11;
        bi.b bVar = new bi.b();
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
        this.y0 = new ga();
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
        jb jbVar = new jb(this);
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
        oc ocVar = new oc(this, activity);
        this.n = ocVar;
        ta taVar = new ta(this, i12);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(ocVar, taVar);
        this.n.setFocusable(true);
        this.n.setImportantForAccessibility(2);
        y2 y2Var = new y2(activity, windowManager, this.n, layoutParams);
        this.s = y2Var;
        y2Var.a(new vb(this));
        this.n.addView(this.s.b, new ViewGroup.LayoutParams(-1, -1));
        oc ocVar2 = this.n;
        hc hcVar = new hc(this, activity);
        this.r = hcVar;
        ocVar2.addView(hcVar);
        hc hcVar2 = this.r;
        bc bcVar = new bc(this, activity);
        this.h0 = bcVar;
        hcVar2.addView(bcVar);
        this.r.addView(this.s.c, new ViewGroup.LayoutParams(-1, -1));
        this.r0 = new org.telegram.ui.Components.ja(this.h0);
        this.s0 = new c7();
        hc hcVar3 = this.r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.i0 = frameLayout;
        hcVar3.addView(frameLayout);
        hc hcVar4 = this.r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.k0 = frameLayout2;
        hcVar4.addView(frameLayout2);
        hc hcVar5 = this.r;
        ah.y yVar = new ah.y(this, activity, 3);
        this.l0 = yVar;
        hcVar5.addView(yVar);
        int i15 = 8;
        this.l0.setVisibility(8);
        this.l0.setAlpha(0.0f);
        hc hcVar6 = this.r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        hcVar6.addView(frameLayout3);
        org.telegram.ui.Components.qc.a(this.n, new c9(2));
        cc ccVar = new cc(this, activity, this.r0, this.r, bVar);
        this.A0 = ccVar;
        oc ocVar3 = this.n;
        Objects.requireNonNull(ocVar3);
        ccVar.setCancelGestures(new bi.oa(ocVar3, 29));
        this.A0.setResetState(new ka(this, 13));
        this.h0.addView(this.A0, w7.x5.e(-1, -1, 119));
        this.A0.setOnClickListener(new ma(this, 12));
        bc bcVar2 = this.h0;
        int i16 = this.J;
        bcVar2.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
        bc bcVar3 = this.h0;
        float dp = AndroidUtilities.dp(12.0f);
        bi.z1 z1Var = yf.j0.a;
        bcVar3.setOutlineProvider(new yf.i0(0, dp));
        this.h0.setClipToOutline(true);
        ka kaVar = new ka(this, 14);
        hf0 hf0Var = new hf0(activity);
        hf0Var.a = new TextPaint(1);
        hf0Var.b = new TextPaint(1);
        pr prVar = pr.h;
        hf0Var.s = new org.telegram.ui.Components.e6(hf0Var, 0L, 350L, prVar);
        hf0Var.I = new cc0(hf0Var, 7);
        hf0Var.x = kaVar;
        this.C1 = hf0Var;
        dc dcVar = new dc(this, activity, this.r0, this.s0);
        this.X0 = dcVar;
        dcVar.setCollageView(this.A0);
        dc dcVar2 = this.X0;
        dcVar2.v = new ka(this, 15);
        dcVar2.setOnTapListener(new ka(this, i14));
        this.X0.setVisibility(8);
        dc dcVar3 = this.X0;
        dcVar3.N = new ka(this, 17);
        this.h0.addView(dcVar3, w7.x5.e(-1, -1, 119));
        this.h0.addView(this.C1, w7.x5.e(-1, -1, 119));
        oc ocVar4 = this.n;
        fc fcVar = new fc(this, activity, ocVar4, ocVar4, this.r, bVar, this.r0);
        this.c1 = fcVar;
        fcVar.setAccount(i10);
        int i17 = 6;
        this.c1.setUiBlurBitmap(new ta(this, i17));
        int i18 = 4;
        org.telegram.ui.Components.qc.a(this.l0, new ah.n0(this, i18));
        this.c1.setOnHeightUpdate(new la(this, 13));
        this.c1.setOnPeriodUpdate(new la(this, i18));
        long j3 = this.N;
        if (j3 != 0) {
            this.c1.setDialogId(j3);
        }
        this.c1.setOnPremiumHint(new la(this, 5));
        this.c1.setOnKeyboardOpen(new la(this, i17));
        eb ebVar = new eb(this, activity, i13);
        this.t0 = ebVar;
        this.r.addView(ebVar);
        zc zcVar = new zc(activity, this.r, this.h0, bVar, this.r0);
        this.Z0 = zcVar;
        zcVar.setOnTimelineClick(new ka(this, 10));
        this.Z0.setOnHeightChange(new ka(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f7 = 388;
        frameLayout4.addView(this.Z0, w7.x5.d(-1, f7, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        dd ddVar = new dd(activity);
        this.a1 = ddVar;
        ddVar.setVisibility(8);
        this.a1.a(false);
        this.Y0.addView(this.a1, w7.x5.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.l0.addView(this.Y0, w7.x5.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.l0.addView(this.c1, w7.x5.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        zc zcVar2 = new zc(activity, this.r, this.h0, bVar, this.r0);
        this.t1 = zcVar2;
        zcVar2.X0 = true;
        zcVar2.setVisibility(8);
        this.t1.setAlpha(0.0f);
        this.l0.addView(this.t1, w7.x5.d(-1, f7, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        fb fbVar = new fb(this, activity, bVar, this.r0);
        this.d1 = fbVar;
        fbVar.setVisibility(8);
        this.l0.addView(this.d1, w7.x5.e(-1, -2, 85));
        w2 w2Var = new w2(activity);
        this.n0 = w2Var;
        w2Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        w2 w2Var2 = this.n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        w2Var2.setScaleType(scaleType);
        this.n0.setImageResource(R.drawable.msg_photo_back);
        w2 w2Var3 = this.n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        w2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.n0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.n0.setOnClickListener(new ma(this, i12));
        this.i0.addView(this.n0, w7.x5.e(56, 56, 51));
        this.s.a(this.n0);
        h8 h8Var = new h8(activity, i10);
        this.o0 = h8Var;
        h8Var.a(false, false);
        this.o0.setOnClickListener(new bi.u1(i17, this, activity));
        this.i0.addView(this.o0, w7.x5.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.p0 = j5Var;
        j5Var.setTextSize(20);
        this.p0.setGravity(19);
        this.p0.setTextColor(-1);
        this.p0.setTypeface(AndroidUtilities.bold());
        this.p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, TLObject.FLAG_30);
        this.p0.setAlpha(0.0f);
        this.p0.setVisibility(8);
        this.p0.setEllipsizeByGradient(true);
        this.p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.i0.addView(this.p0, w7.x5.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.j0.setGravity(5);
        this.i0.addView(this.j0, w7.x5.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        la laVar = new la(this, 7);
        oc ocVar5 = this.n;
        u0 u0Var = new u0(activity);
        u0Var.w = true;
        u0Var.x = true;
        u0Var.h = laVar;
        u0Var.a = i10;
        u0Var.b = ocVar5;
        u0Var.setScaleType(scaleType);
        u0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        u0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        u0Var.setVisibility(8);
        u0Var.setAlpha(0.0f);
        u0Var.setOnClickListener(new ah.h0(u0Var, 10));
        u0Var.f = new sp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        u0Var.d();
        this.e1 = u0Var;
        f4 f4Var = new f4(activity, 1);
        f4Var.l(1.0f, -71.0f);
        f4Var.d = 2000L;
        f4Var.U = false;
        f4Var.H.o(true, false, false);
        this.k1 = f4Var;
        f4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.k1, w7.x5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        aj0 aj0Var = new aj0(activity);
        this.g1 = aj0Var;
        aj0Var.setScaleType(scaleType);
        aj0 aj0Var2 = this.g1;
        o8 o8Var = this.K1;
        aj0Var2.setImageResource((o8Var == null || !o8Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.g1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.g1.setOnClickListener(new ma(this, 2));
        this.g1.setVisibility(8);
        this.g1.setAlpha(0.0f);
        r6 r6Var = new r6(activity);
        this.j1 = r6Var;
        r6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.j1.setVisibility(8);
        this.j1.setAlpha(0.0f);
        this.j1.setOnClickListener(new ma(this, 3));
        this.j0.addView(this.j1, w7.x5.q(46, 56, 53));
        this.j0.addView(this.g1, w7.x5.q(46, 56, 53));
        this.j0.addView(this.e1, w7.x5.e(46, 56, 53));
        ad adVar = new ad(activity);
        this.E0 = adVar;
        adVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.E0.setOnClickListener(new ma(this, 4));
        this.E0.setOnLongClickListener(new n5(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.s.a(this.E0);
        this.i0.addView(this.E0, w7.x5.e(56, 56, 53));
        bd bdVar = new bd(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = bdVar;
        bdVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new ma(this, 5));
        boolean q6 = d1.q(activity);
        this.F0.setVisibility(q6 ? 0 : 8);
        this.F0.setAlpha(q6 ? 1.0f : 0.0f);
        this.s.a(this.F0);
        this.i0.addView(this.F0, w7.x5.e(56, 56, 53));
        z zVar = new z(activity);
        this.G0 = zVar;
        zVar.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        if (this.z0 == null) {
            i11 = 6;
            this.z0 = (t) t.a().get(6);
        } else {
            i11 = 6;
        }
        this.G0.setOnClickListener(new ma(this, i11));
        this.G0.a(new u(this.z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.s.a(this.G0);
        this.i0.addView(this.G0, w7.x5.e(56, 56, 53));
        ad adVar2 = new ad(activity);
        this.H0 = adVar2;
        adVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new ma(this, 7));
        this.s.a(this.H0);
        this.i0.addView(this.H0, w7.x5.e(56, 56, 53));
        y yVar2 = new y(activity, this.s);
        this.I0 = yVar2;
        yVar2.a.u0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new la(this, i15));
        this.i0.addView(this.I0, w7.x5.e(-1, 56, 53));
        f4 f4Var2 = new f4(activity, 1);
        f4Var2.l(1.0f, -20.0f);
        f4Var2.d = 5000L;
        f4Var2.i();
        f4Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        f4Var2.l0 = new ah.j(10);
        this.l1 = f4Var2;
        f4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.l1, w7.x5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        f4 f4Var3 = new f4(activity, 2);
        f4Var3.l(0.0f, 28.0f);
        f4Var3.d = 5000L;
        f4Var3.p(true);
        this.m1 = f4Var3;
        this.i0.addView(f4Var3, w7.x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        f4 f4Var4 = new f4(activity, 1);
        f4Var4.l(1.0f, -20.0f);
        f4Var4.d = 5000L;
        f4Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.n1 = f4Var4;
        f4Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.i0.addView(this.n1, w7.x5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ed edVar = new ed(activity);
        Paint paint = new Paint(1);
        edVar.a = paint;
        Paint paint2 = new Paint(1);
        edVar.b = paint2;
        edVar.e = new org.telegram.ui.Components.e6(edVar, 0L, 250L, prVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        edVar.c = p6Var;
        p6Var.k(0.3f, 250L, prVar);
        p6Var.t(AndroidUtilities.dp(13.0f));
        p6Var.r(-1);
        p6Var.u(AndroidUtilities.bold());
        p6Var.setCallback(edVar);
        p6Var.b = 1;
        edVar.a(0L, false);
        this.J0 = edVar;
        i0(false, false);
        this.i0.addView(this.J0, w7.x5.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        l7 l7Var = new l7(activity);
        this.O0 = l7Var;
        l7Var.setDelegate(jbVar);
        l7 l7Var2 = this.O0;
        boolean z10 = this.O1 == 1;
        l7Var2.n0 = -1.0f;
        l7Var2.o0 = z10;
        l7Var2.invalidate();
        this.k0.addView(this.O0, w7.x5.e(-1, 100, 87));
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
        this.k0.addView(this.P0, w7.x5.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new ma(this, i15));
        f4 f4Var5 = new f4(activity, 3);
        f4Var5.p(true);
        f4Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        f4Var5.h = AndroidUtilities.dp(320.0f);
        f4Var5.d = 5000L;
        f4Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = f4Var5;
        this.k0.addView(f4Var5, w7.x5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        d91 d91Var = new d91(activity);
        this.V0 = d91Var;
        d91Var.M = false;
        d91Var.setAlpha(0.0f);
        this.k0.addView(this.V0, w7.x5.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new ta(this, 4));
        d91 d91Var2 = this.V0;
        this.T1 = 0.0f;
        d91Var2.b(0.0f, false);
        int i19 = 12;
        w7 w7Var = new w7(activity, i10, new ka(this, i19));
        this.D0 = w7Var;
        w7Var.c = new la(this, 9);
        this.k0.addView(w7Var, w7.x5.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        gb gbVar = new gb(this, activity);
        this.Q0 = gbVar;
        gbVar.setOnSwitchModeListener(new la(this, 10));
        int i20 = 11;
        this.Q0.setOnSwitchingModeListener(new la(this, i20));
        this.m0.addView(this.Q0, w7.x5.e(-1, 48, 55));
        this.s.a(this.Q0);
        w2 w2Var4 = new w2(activity);
        this.R0 = w2Var4;
        w2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.x5.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.R0);
        this.R0.setOnClickListener(new ma(this, 9));
        w2 w2Var5 = new w2(activity);
        this.S0 = w2Var5;
        w2Var5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.x5.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.s.a(this.S0);
        this.S0.setOnClickListener(new ma(this, 10));
        c4 c4Var = new c4(activity);
        this.T0 = c4Var;
        this.m0.addView(c4Var, w7.x5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.T0);
        c4 c4Var2 = new c4(activity);
        this.U0 = c4Var2;
        c4Var2.a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        c4Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.x5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.u1 = dVar2;
        dVar2.setVisibility(8);
        this.u1.setAlpha(0.0f);
        this.u1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.u1.setOnClickListener(new ma(this, i20));
        this.m0.addView(this.u1, w7.x5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        u6 u6Var = new u6(activity);
        u6Var.b = new ArrayList();
        u6Var.e = true;
        u6Var.h = true;
        View view = new View(activity);
        u6Var.a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        u6Var.addView(view, w7.x5.e(-1, -1, 119));
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
        u6Var.addView(u6Var.c, w7.x5.c(-2.0f, -2));
        u6Var.e();
        this.b1 = u6Var;
        u6Var.setVisibility(8);
        this.b1.setOnClickListener(new la(this, i19));
        this.m0.addView(this.b1, w7.x5.e(-1, 52, 23));
        cd cdVar = new cd(activity);
        this.p1 = cdVar;
        cdVar.setAlpha(0.0f);
        this.p1.setVisibility(8);
        this.h0.addView(this.p1, w7.x5.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        v6 v6Var = new v6(activity, i10, bVar);
        this.o1 = v6Var;
        this.h0.addView(v6Var, w7.x5.e(-1, -1, 119));
        m0(false);
    }

    public static pc E(Activity activity, int i10) {
        pc pcVar = F2;
        if (pcVar != null && (pcVar.b != activity || pcVar.c != i10)) {
            pcVar.q(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new pc(activity, i10);
        }
        return F2;
    }

    public static void a(pc pcVar) {
        sb sbVar = pcVar.B0;
        if (sbVar == null || sbVar.getTextureView() == null) {
            pcVar.c2 = false;
            return;
        }
        Bitmap bitmap = pcVar.B0.getTextureView().getBitmap();
        if (bitmap == null) {
            pcVar.c2 = false;
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
        pcVar.c2 = f10 < 0.22f;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(pc pcVar) {
        Activity activity = pcVar.b;
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

    public static void c(pc pcVar) {
        ValueAnimator valueAnimator = pcVar.j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            pcVar.j2 = null;
        }
        int i10 = 0;
        pcVar.k2 = false;
        hc hcVar = pcVar.r;
        float f7 = hcVar.a;
        float f10 = hcVar.b;
        hcVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        pcVar.j2 = ofFloat;
        ofFloat.addUpdateListener(new bb(pcVar, f7, f10, i10));
        pcVar.j2.setDuration(340L);
        pcVar.j2.setInterpolator(pr.h);
        pcVar.j2.addListener(new mb(pcVar, i10));
        pcVar.j2.start();
    }

    public static boolean d(pc pcVar) {
        Activity activity = pcVar.b;
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
        spannableString.setSpan(new wb(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        pc pcVar = F2;
        if (pcVar != null) {
            pcVar.q(false);
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
        o8 o8Var = this.K1;
        if (o8Var != null) {
            return o8Var.r();
        }
        return 1;
    }

    public final String C() {
        sb sbVar = this.B0;
        if (sbVar == null || sbVar.getCameraSession() == null) {
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
            this.k0.addView(v0Var, w7.x5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String F() {
        sb sbVar = this.B0;
        if (sbVar == null || sbVar.getCameraSession() == null) {
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
            xi0 xi0Var = new xi0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.h1 = xi0Var;
            xi0Var.h = true;
            o8 o8Var = this.K1;
            if (o8Var == null || !o8Var.y0) {
                xi0Var.N(0);
                this.h1.K(0);
            } else {
                xi0Var.K(35);
                this.h1.N(36);
            }
            this.h1.a0 = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J9, this.a);
            this.h1.O(v02, "Sunny");
            this.h1.O(v02, "Path 6");
            this.h1.O(v02, "Path");
            this.h1.O(v02, "Path 5");
            this.h1.m();
            ImageView imageView = new ImageView(this.b);
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.i1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
            this.i1.setOnClickListener(new ma(this, 0));
            this.i1.setVisibility(8);
            this.i1.setImageDrawable(this.h1);
            this.i1.setAlpha(0.0f);
            this.j0.addView(this.i1, 0, w7.x5.q(46, 56, 53));
        }
        return this.i1;
    }

    public final void H() {
        rb rbVar = this.v1;
        if (rbVar == null) {
            return;
        }
        this.v2 = null;
        rbVar.getTopLayout().setAlpha(0.0f);
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
        ob obVar;
        if (this.W || (obVar = this.M0) == null) {
            return false;
        }
        return obVar.getTranslationY() < ((float) ((this.n.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
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
        o8 o8Var;
        o8 o8Var2;
        d dVar;
        org.telegram.ui.ActionBar.j5 j5Var;
        int i11;
        int i12;
        float dp;
        ImageView imageView;
        o8 o8Var3;
        o8 o8Var4;
        o8 o8Var5;
        o8 o8Var6;
        sb sbVar;
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
        cc ccVar = this.A0;
        c0(this.F0, (z11 || i10 != 0 || (sbVar = this.B0) == null || !sbVar.a || yVar.e || ccVar.j()) ? false : true, true);
        c0(this.G0, (this.a2 || i10 != 0 || yVar.e) ? false : true, z10);
        m0(z10);
        u0 u0Var = this.e1;
        r6 r6Var = this.j1;
        aj0 aj0Var = this.g1;
        zc zcVar = this.t1;
        zc zcVar2 = this.Z0;
        d dVar2 = this.u1;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.p0;
        fc fcVar = this.c1;
        c4 c4Var = this.U0;
        c4 c4Var2 = this.T0;
        w7 w7Var = this.D0;
        dc dcVar = this.X0;
        ah.y yVar2 = this.l0;
        gb gbVar = this.Q0;
        l7 l7Var = this.O0;
        if (!z10) {
            sb sbVar2 = this.B0;
            if (sbVar2 != null) {
                sbVar2.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            }
            dcVar.setAlpha(((i10 != 1 || ccVar.j()) && i10 != 2) ? 0.0f : 1.0f);
            ccVar.setAlpha((i10 == 0 || (i10 == 1 && ccVar.j())) ? 1.0f : 0.0f);
            l7Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            l7Var.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            w7Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            gbVar.setAlpha((i10 != 0 || I()) ? 0.0f : 1.0f);
            gbVar.setTranslationY((i10 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            c4Var2.setAlpha((i10 == 0 && this.a2 && !I()) ? 1.0f : 0.0f);
            c4Var.setAlpha((i10 == 0 && !this.a2 && I()) ? 0.6f : 0.0f);
            yVar2.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
            yVar2.setTranslationY((i10 == 1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            fcVar.setAlpha(i10 == 2 ? 0.0f : 1.0f);
            aj0Var.setAlpha((i10 == 1 && this.O1 == 1) ? 1.0f : 0.0f);
            r6Var.setAlpha((i10 != 1 || (this.O1 != 1 && ((o8Var2 = this.K1) == null || TextUtils.isEmpty(o8Var2.y)))) ? 0.0f : 1.0f);
            int i14 = 1;
            u0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.i1;
            if (imageView2 != null) {
                imageView2.setAlpha((i10 == 1 && (o8Var = this.K1) != null && o8Var.u) ? 1.0f : 0.0f);
                i14 = 1;
            }
            zcVar2.setAlpha(i10 == i14 ? 1.0f : 0.0f);
            zcVar.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            j5Var2.setAlpha((i10 == i14 || i10 == 2) ? 1.0f : 0.0f);
            dVar2.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            N(i13, i10);
            return;
        }
        this.i2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        sb sbVar3 = this.B0;
        if (sbVar3 != null) {
            dVar = dVar2;
            j5Var = j5Var2;
            i11 = 1;
            arrayList.add(ObjectAnimator.ofFloat(sbVar3, (Property<sb, Float>) View.ALPHA, i10 == 0 ? 1.0f : 0.0f));
        } else {
            dVar = dVar2;
            j5Var = j5Var2;
            i11 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i11];
        fArr[0] = ((i10 != i11 || ccVar.j()) && i10 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(dcVar, (Property<dc, Float>) property, fArr));
        float[] fArr2 = new float[i11];
        fArr2[0] = (i10 == 0 || (i10 == i11 && ccVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(ccVar, (Property<cc, Float>) property, fArr2));
        float[] fArr3 = new float[i11];
        fArr3[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(l7Var, (Property<l7, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i11];
        fArr4[0] = i10 == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(l7Var, (Property<l7, Float>) property2, fArr4));
        float[] fArr5 = new float[i11];
        fArr5[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(w7Var, (Property<w7, Float>) property, fArr5));
        float[] fArr6 = new float[i11];
        fArr6[0] = (i10 != 0 || I()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(gbVar, (Property<gb, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(gbVar, (Property<gb, Float>) property2, (i10 != 0 || I()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(c4Var2, (Property<c4, Float>) property, (i10 == 0 && this.a2 && !I()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(c4Var, (Property<c4, Float>) property, (i10 == 0 && !this.a2 && I()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(yVar2, (Property<ah.y, Float>) property, ((i10 == 1 && ((o8Var6 = this.K1) == null || o8Var6.J0 == 0)) || i10 == 2) ? 1.0f : 0.0f));
        if (i10 == 1 && ((o8Var5 = this.K1) == null || o8Var5.J0 == 0)) {
            i12 = 2;
        } else {
            i12 = 2;
            if (i10 != 2) {
                dp = AndroidUtilities.dp(12.0f);
                arrayList.add(ObjectAnimator.ofFloat(yVar2, (Property<ah.y, Float>) property2, dp));
                arrayList.add(ObjectAnimator.ofFloat(fcVar, (Property<fc, Float>) property, i10 != i12 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(zcVar2, (Property<zc, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(zcVar, (Property<zc, Float>) property, i10 != 2 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property, (i10 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property, (i10 == 1 || (this.O1 != 1 && ((o8Var4 = this.K1) == null || TextUtils.isEmpty(o8Var4.y)))) ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
                imageView = this.i1;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 && (o8Var3 = this.K1) != null && o8Var3.u) ? 1.0f : 0.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<d91, Float>) property, 0.0f));
                this.i2.playTogether(arrayList);
                this.i2.addListener(new lb(this, i13, i10, 0));
                this.i2.setDuration(460L);
                this.i2.setInterpolator(pr.h);
                this.i2.start();
            }
        }
        dp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(yVar2, (Property<ah.y, Float>) property2, dp));
        arrayList.add(ObjectAnimator.ofFloat(fcVar, (Property<fc, Float>) property, i10 != i12 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property, (i10 != 1 || i10 == i12) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, i10 != i12 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(zcVar2, (Property<zc, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(zcVar, (Property<zc, Float>) property, i10 != 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property, (i10 == 1 || this.O1 != 1) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property, (i10 == 1 || (this.O1 != 1 && ((o8Var4 = this.K1) == null || TextUtils.isEmpty(o8Var4.y)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, i10 != 1 ? 1.0f : 0.0f));
        imageView = this.i1;
        if (imageView != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<d91, Float>) property, 0.0f));
        this.i2.playTogether(arrayList);
        this.i2.addListener(new lb(this, i13, i10, 0));
        this.i2.setDuration(460L);
        this.i2.setInterpolator(pr.h);
        this.i2.start();
    }

    public final void L(Runnable runnable, long j3) {
        if (this.S1 || this.K1 == null) {
            return;
        }
        qa qaVar = this.g2;
        if (qaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qaVar);
        }
        this.h2 = true;
        this.S1 = true;
        this.g2 = new qa(this, runnable, 1);
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
        o8 o8Var;
        o8 o8Var2;
        o8 o8Var3;
        rb rbVar;
        o8 o8Var4;
        rb rbVar2;
        rb rbVar3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            fc fcVar = this.c1;
            if (fcVar != null && fcVar.O1) {
                fcVar.N1 = false;
                fcVar.z(false, false);
                return false;
            }
            if (this.Q1) {
                l7 l7Var = this.O0;
                if (l7Var.r0) {
                    l7Var.r0 = false;
                    l7Var.v0 = SystemClock.elapsedRealtime();
                    l7Var.u0 = true;
                    ((jb) l7Var.a).d(false);
                    l7Var.J.c(false);
                    l7Var.K.c(false);
                    l7Var.L.c(false);
                    l7Var.invalidate();
                    return false;
                }
            } else if (!this.P1 && !fcVar.p()) {
                fb fbVar = this.d1;
                if (fbVar.M) {
                    fbVar.c(false, true);
                    return false;
                }
                ob obVar = this.M0;
                if (obVar != null) {
                    org.telegram.ui.ActionBar.v0 v0Var = obVar.G;
                    if (v0Var == null || !v0Var.s()) {
                        f(false);
                        this.m2 = null;
                        return false;
                    }
                    EditTextBoldCursor searchField = v0Var.getSearchField();
                    if (obVar.v.c()) {
                        AndroidUtilities.hideKeyboard(searchField);
                        return false;
                    }
                    obVar.x.v(v0Var.L(true));
                    return false;
                }
                if (this.g0 != 0 || (rbVar3 = this.v1) == null || !rbVar3.y0()) {
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
                    if (this.f0 == 1 && (((o8Var2 = this.K1) == null || (!o8Var2.n && !o8Var2.u)) && !this.u0)) {
                        if (o8Var2 != null && o8Var2.g && ((rbVar2 = this.v1) == null || !rbVar2.u0())) {
                            o8 o8Var5 = this.K1;
                            if (!o8Var5.j) {
                            }
                        }
                        rb rbVar4 = this.v1;
                        if (rbVar4 == null || !rbVar4.y0()) {
                            if (this.v0 == 0 && (((this.L1 && !this.A0.j() && (((rbVar = this.v1) == null || !rbVar.u0()) && ((o8Var4 = this.K1) == null || o8Var4.Z0 == null))) || !this.b1.h) && (((o8Var3 = this.K1) == null || !o8Var3.g || (!o8Var3.n && !o8Var3.u)) && !this.u0 && (o8Var3 == null || !o8Var3.o)))) {
                                K(0, true);
                                return false;
                            }
                            if (this.v0 != 0) {
                                q(true);
                                return false;
                            }
                            Activity activity = this.b;
                            bi.b bVar = this.a;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardChanges);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                            o8 o8Var6 = this.K1;
                            if (o8Var6 != null && !o8Var6.g && !o8Var6.o) {
                                alertDialog$Builder.i(LocaleController.getString(o8Var6.c ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new ta(this, 8));
                            }
                            o8 o8Var7 = this.K1;
                            alertDialog$Builder.k(LocaleController.getString((o8Var7 == null || !o8Var7.c || o8Var7.g) ? R.string.Discard : R.string.StoryDeleteDraft), new ta(this, 9));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.show();
                            View d = b2Var.d(-1);
                            if (d instanceof TextView) {
                                int i11 = org.telegram.ui.ActionBar.j6.q7;
                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, bVar));
                                d.setBackground(org.telegram.ui.ActionBar.j6.Y(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i11, bVar), 51), 6, 6));
                            }
                        }
                    }
                    if (this.f0 != 2 || (o8Var = this.K1) == null || o8Var.b0) {
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
            o8 o8Var = this.K1;
            if (o8Var == null || !o8Var.n) {
                u();
                H();
            }
            hf0 hf0Var = this.C1;
            if (hf0Var != null) {
                hf0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            o8 o8Var2 = this.K1;
            this.a1.setVisibility((o8Var2 == null || o8Var2.h0 < 30000) ? 8 : 0);
            this.l0.setAlpha(1.0f);
            this.l0.setTranslationY(0.0f);
            o8 o8Var3 = this.K1;
            this.c1.setVisibility((o8Var3 == null || o8Var3.J0 == 0) ? 0 : 8);
        }
        if (i11 == 0 && this.V1) {
            D().setVisibility(0);
            v0 D = D();
            D.r.d(0.0f, true);
            D.a(true);
            bi.oa oaVar = D.h;
            if (oaVar != null) {
                AndroidUtilities.cancelRunOnUIThread(oaVar);
            }
            bi.oa oaVar2 = new bi.oa(D, 15);
            D.h = oaVar2;
            AndroidUtilities.runOnUIThread(oaVar2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        hf0 hf0Var2 = this.C1;
        if (hf0Var2 != null) {
            hf0Var2.setAllowTouch(i11 == 1 && ((i12 = this.g0) == -1 || i12 == 1));
        }
        fc fcVar = this.c1;
        if (fcVar != null) {
            fcVar.e0 = i11 != 1;
        }
        if (i11 == 1) {
            int i13 = this.c;
            MediaDataController.getInstance(i13).checkStickers(0);
            MediaDataController.getInstance(i13).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i13).loadRecents(2, false, true, false);
            bi.u8 storiesController = MessagesController.getInstance(i13).getStoriesController();
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
        o8 o8Var;
        o8 o8Var2;
        boolean z10;
        o8 o8Var3;
        o8 o8Var4;
        o8 o8Var5;
        u61 textureView;
        o8 o8Var6;
        boolean z11 = true;
        if (i11 == 0) {
            Z(false);
            this.O0.setVisibility(0);
            l7 l7Var = this.O0;
            if (l7Var != null) {
                l7Var.g(false);
            }
            this.Q0.setVisibility(0);
            this.V0.setVisibility(0);
            this.V0.setAlpha(0.0f);
            this.J0.a(0L, true);
            o8 o8Var7 = this.K1;
            if (o8Var7 != null) {
                o8Var7.i(false);
                this.K1 = null;
            }
            cc ccVar = this.A0;
            if (ccVar != null) {
                ccVar.e();
                this.O0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new ka(this, 18));
            v0 v0Var = this.N0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.W0.e(true);
            f4 f4Var = this.l1;
            if (f4Var != null) {
                f4Var.e(true);
            }
        }
        int i12 = this.c;
        if (i11 == 1 || i10 == 1) {
            this.e1.setEntry(i11 == 1 ? this.K1 : null);
            if (this.O1 == 1) {
                this.g1.setVisibility(0);
                o8 o8Var8 = this.K1;
                f0(o8Var8 != null && o8Var8.Y, false);
                this.j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((fg0) this.j1.c).a(this.X0.k(), false);
                this.p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                o8 o8Var9 = this.K1;
                if (o8Var9 == null || TextUtils.isEmpty(o8Var9.y)) {
                    this.p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.g1.setVisibility(8);
                    this.j1.setVisibility(0);
                    ((fg0) this.j1.c).a(true, false);
                    this.p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.e1.setVisibility(0);
            o8 o8Var10 = this.K1;
            if (o8Var10 == null || !o8Var10.u) {
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
            o8 o8Var11 = this.K1;
            this.c1.setVisibility(((o8Var11 == null || o8Var11.J0 == 0) && this.v0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            o8 o8Var12 = this.K1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((o8Var12 == null || o8Var12.J0 == 0) && this.v0 == 0) ? 68.0f : 12.0f);
            this.Y0.setLayoutParams(layoutParams);
            this.l0.setVisibility(0);
            this.l0.clearFocus();
            o8 o8Var13 = this.K1;
            this.c1.A(o8Var13 == null ? 86400 : o8Var13.I0, false);
            this.c1.setPeriodVisible(!MessagesController.getInstance(i12).premiumFeaturesBlocked() && ((o8Var = this.K1) == null || !o8Var.g));
            o8 o8Var14 = this.K1;
            this.c1.setHasRoundVideo((o8Var14 == null || o8Var14.o0 == null) ? false : true);
            fc fcVar = this.c1;
            if (fcVar == null) {
                j3 = 0;
            } else {
                o8 o8Var15 = this.K1;
                if (o8Var15 == null || !o8Var15.n) {
                    j3 = 0;
                    fcVar.v(null, null);
                } else {
                    TLRPC.Peer peer = o8Var15.q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i12).getUser(Long.valueOf(peer.user_id)));
                        o8 o8Var16 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        o8Var16.p = append;
                    } else {
                        j3 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        o8 o8Var17 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        o8Var17.p = append;
                    }
                    String str2 = this.K1.s;
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    String str3 = str2;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new kb(), 0, spannableString.length(), 33);
                        str3 = spannableString;
                    }
                    this.c1.v(str3, append);
                }
            }
            o8 o8Var18 = this.K1;
            boolean z12 = (o8Var18 != null && o8Var18.v() && this.K1.t()) ? false : true;
            zc zcVar = this.Z0;
            boolean z13 = zcVar.j0;
            zcVar.j0 = z12;
            zcVar.i0.f(z12, true);
            zcVar.invalidate();
        } else {
            j3 = 0;
        }
        if (i11 == 2 || i10 == 2) {
            this.p0.setVisibility(0);
            this.t1.setVisibility(0);
            o8 o8Var19 = this.K1;
            if (o8Var19 != null && o8Var19.b0) {
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
            o8 o8Var20 = this.K1;
            boolean z14 = (o8Var20 == null || o8Var20.J0 == j3) ? false : true;
            boolean z15 = o8Var20 != null && o8Var20.g;
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
                u6Var.addView(u6Var.c, w7.x5.c(-2.0f, -2));
                u6Var.e();
            }
            this.t1.setVisibility(8);
            this.u1.setVisibility(8);
            if (!this.h2) {
                o8 o8Var21 = this.K1;
                if (o8Var21 == null || !o8Var21.u) {
                    this.X0.set(o8Var21);
                } else {
                    this.X0.l(o8Var21);
                }
            }
            this.h2 = false;
            this.c1.f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i12).storyEntitiesAllowed() ? null : new ka(this, 19));
            this.d1.setVisibility(this.H1 == null ? 8 : 0);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                fb fbVar = this.d1;
                fbVar.c(false, false);
                fbVar.c = arrayList;
                fbVar.d = arrayList2;
                fbVar.e = arrayList3;
                fbVar.w = new f01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                fbVar.K = new f01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                fbVar.b.Y2.N(false);
                this.d1.setSelected(this.H1.indexOf(this.K1));
            }
            this.Z0.setMaxCount((z14 || z15 || this.H1 != null || ((o8Var6 = this.K1) != null && (o8Var6.v() || !this.K1.K))) ? 1 : 3);
            if (i10 != 2) {
                o8 o8Var22 = this.K1;
                if (o8Var22 != null && (o8Var22.c || o8Var22.g || this.u0)) {
                    if (o8Var22.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    o8 o8Var23 = this.K1;
                    if (o8Var23.K && o8Var23.a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new ta(this, 7));
                    }
                    this.c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    fc fcVar2 = this.c1;
                    fcVar2.V = true;
                    fcVar2.f.setText("");
                }
            }
            o8 o8Var24 = this.K1;
            this.b1.d(4, o8Var24 == null || ((!o8Var24.u || o8Var24.K) && !o8Var24.v()));
            this.b1.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (o8Var5 = this.K1) == null || o8Var5.u || o8Var5.v()) ? false : true);
            if (!this.N1 && !this.c1.o()) {
                bi.u8 storiesController = MessagesController.getInstance(i12).getStoriesController();
                int B = B();
                bi.n8 o9 = storiesController.o();
                if (o9 == null || !o9.a(storiesController.a, B) || ((o8Var4 = this.K1) != null && (o8Var4.g || o8Var4.J0 != j3))) {
                    z10 = true;
                    this.b1.setShareEnabled(z10);
                    o8 o8Var25 = this.K1;
                    this.g1.setImageResource((o8Var25 == null && o8Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.p0.setVisibility(0);
                    this.p0.setTranslationX(0.0f);
                    o8Var3 = this.K1;
                    if (o8Var3 == null && o8Var3.J0 != j3) {
                        this.p0.l("", false);
                    } else if (o8Var3 == null && o8Var3.g) {
                        this.p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (o8Var3 == null && o8Var3.u) {
                        this.p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (o8Var3 == null && o8Var3.n) {
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
            o8 o8Var252 = this.K1;
            this.g1.setImageResource((o8Var252 == null && o8Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.p0.setVisibility(0);
            this.p0.setTranslationX(0.0f);
            o8Var3 = this.K1;
            if (o8Var3 == null) {
            }
            if (o8Var3 == null) {
            }
            if (o8Var3 == null) {
            }
            if (o8Var3 == null) {
            }
            this.p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z11 = true;
        }
        if (i10 == z11) {
            fc fcVar3 = this.c1;
            n70 n70Var = fcVar3.V0;
            if (n70Var != null) {
                n70Var.u();
                fcVar3.V0 = null;
            }
            this.k1.e(z11);
            fb fbVar2 = this.d1;
            if (fbVar2.M) {
                fbVar2.c(false, z11);
            }
        }
        if (i11 == 2 && (o8Var2 = this.K1) != null) {
            if (o8Var2.e0 < j3) {
                o8Var2.e0 = j3;
            }
            this.M1 = o8Var2.e0;
            long duration = this.X0.getDuration() < 100 ? this.K1.h0 : this.X0.getDuration();
            o8 o8Var26 = this.K1;
            if (o8Var26.h0 <= 0) {
                o8Var26.h0 = duration;
            }
            File file = o8Var26.Z0;
            if (file == null) {
                file = o8Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            o8 o8Var27 = this.K1;
            this.t1.o(false, absolutePath, o8Var27.h0, o8Var27.P);
            o8 o8Var28 = this.K1;
            float f7 = duration;
            long j10 = (long) (o8Var28.Z * f7);
            long j11 = (long) (o8Var28.a0 * f7);
            zc zcVar2 = this.t1;
            zcVar2.Z0 = j10;
            zcVar2.a1 = j11;
            uc ucVar = zcVar2.h;
            if (ucVar != null) {
                uc.a(ucVar, true);
            }
            ci.u uVar = new ci.u(this, 8);
            this.t1.setDelegate(new pb(uVar));
            float max = (this.M1 / Math.max(1L, duration)) * 0.96f;
            this.t1.setVideoLeft(max);
            this.t1.setVideoRight(0.04f + max);
            uVar.run(Boolean.TRUE, Float.valueOf(max));
        }
        hf0 hf0Var = this.C1;
        if (hf0Var != null) {
            hf0Var.setAllowTouch(false);
        }
        f4 f4Var2 = this.m1;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        fc fcVar4 = this.c1;
        if (fcVar4 != null) {
            g gVar = fcVar4.f;
            gVar.d();
            gVar.k(true);
            this.c1.e0 = true;
        }
        dc dcVar = this.X0;
        if (dcVar != null) {
            dcVar.x(8, i11 != 1);
        }
        rb rbVar = this.v1;
        if (rbVar != null) {
            rbVar.setCoverPreview(i11 != 1);
        }
        f4 f4Var3 = this.n1;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        cc ccVar2 = this.A0;
        ccVar2.setPreview(i11 == 1 && ccVar2.j());
    }

    public final void P() {
        qg.a1 a1Var;
        boolean z10 = false;
        if (this.f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.x2 = new ka(this, 3);
            }
        }
        fc fcVar = this.c1;
        if (fcVar != null) {
            fcVar.f.s();
        }
        l7 l7Var = this.O0;
        if (l7Var != null) {
            l7Var.h();
        }
        v6 v6Var = this.o1;
        if (v6Var != null) {
            bi.u8 storiesController = MessagesController.getInstance(v6Var.a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.i.f(UserConfig.getInstance(storiesController.a).clientUserId);
            v6Var.b = storiesController.b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            v6Var.c.invalidate();
        }
        rb rbVar = this.v1;
        if (rbVar != null && (a1Var = rbVar.O0.d) != null) {
            a1Var.postRunnable(a1Var.w);
        }
        dc dcVar = this.X0;
        if (dcVar != null) {
            dcVar.x(0, false);
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
        rb rbVar;
        zb zbVar;
        ac acVar;
        rb rbVar2;
        if (i11 == 0) {
            this.n0.setVisibility(8);
        }
        if (i10 == 0 && (rbVar2 = this.v1) != null) {
            rbVar2.setVisibility(8);
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
        if ((i11 == 0 || i10 == 0) && (rbVar = this.v1) != null) {
            rbVar.d1.setLayerType(0, null);
        }
        hf0 hf0Var = this.C1;
        if (hf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            hf0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            zb zbVar2 = this.r1;
            if (zbVar2 != null) {
                zbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (zbVar = this.r1) != null) {
            zbVar.setVisibility(8);
            this.r1.setAppearProgress(0.0f);
            zb zbVar3 = this.r1;
            zbVar3.x = null;
            g0 g0Var = zbVar3.f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            zbVar3.d.setVisibility(8);
            zbVar3.a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            ac acVar2 = this.s1;
            if (acVar2 != null) {
                acVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i10 != 4 || (acVar = this.s1) == null) {
            return;
        }
        acVar.setVisibility(8);
        this.s1.setAppearProgress(0.0f);
        ac acVar3 = this.s1;
        acVar3.b = null;
        g0 g0Var2 = acVar3.h;
        g0Var2.L = null;
        g0Var2.d = null;
        g0Var2.J = false;
        acVar3.e.setVisibility(8);
        acVar3.setVisibility(8);
    }

    public final void R(jc jcVar) {
        bi.n8 o9;
        oc ocVar;
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
        if (windowManager != null && (ocVar = this.n) != null && ocVar.getParent() == null) {
            oc ocVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ocVar2, layoutParams);
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
        if (jcVar != null) {
            this.F = jcVar;
            this.J = jcVar.a;
            rectF.set(jcVar.c);
            this.G = jcVar.b;
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
        g(1.0f, true, new ka(this, 6));
        e();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void S(ic icVar, o8 o8Var, long j3) {
        oc ocVar;
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
        if (windowManager != null && (ocVar = this.n) != null && ocVar.getParent() == null) {
            oc ocVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ocVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.K1 = o8Var;
        this.O1 = o8Var.K ? 1 : 0;
        this.s0.g = false;
        RectF rectF = this.H;
        if (icVar != null) {
            this.F = icVar;
            this.J = icVar.a;
            rectF.set(icVar.c);
            this.G = icVar.b;
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
        o8 o8Var2 = this.K1;
        if (o8Var2 != null) {
            this.c1.setText(o8Var2.C0);
        }
        L(new db(this, 0), j3);
        K(this.K1.b0 ? 2 : 1, false);
        l0(-1, false, false);
        this.b1.b(false, false);
        e();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void T() {
        n70 n70Var;
        dc dcVar = this.X0;
        if (dcVar != null) {
            dcVar.x(4, true);
        }
        fc fcVar = this.c1;
        if (fcVar != null && (n70Var = fcVar.V0) != null) {
            n70Var.u();
            fcVar.V0 = null;
        }
        sg.a1 a1Var = new sg.a1((org.telegram.ui.ActionBar.n2) new tb(this, 1), 14, false);
        a1Var.setOnDismissListener(new za(this, 1));
        a1Var.show();
    }

    public final void U(ic icVar, o8 o8Var) {
        bi.n8 o9;
        oc ocVar;
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
        if (windowManager != null && (ocVar = this.n) != null && ocVar.getParent() == null) {
            oc ocVar2 = this.n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ocVar2, layoutParams);
            windowManager.addView(this.n, layoutParams);
            g0();
        }
        this.K1 = o8Var;
        ja.a(i10, o8Var);
        o8 o8Var2 = this.K1;
        int i11 = (o8Var2 == null || !o8Var2.K) ? 0 : 1;
        this.O1 = i11;
        this.s0.g = o8Var2 != null && o8Var2.u && i11 == 1;
        if (this.v0 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            h0(o9, true);
        }
        RectF rectF = this.H;
        if (icVar != null) {
            this.F = icVar;
            this.J = icVar.a;
            rectF.set(icVar.c);
            this.G = icVar.b;
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
        o8 o8Var3 = this.K1;
        if (o8Var3 != null) {
            this.c1.setText(o8Var3.C0);
        }
        this.b1.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new ka(this, 6));
        e();
        this.v0 = 0L;
        this.w0 = "";
    }

    public final void V() {
        qg.c1 c1Var = this.w1;
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
        cd cdVar = this.p1;
        if (cdVar != null) {
            cdVar.bringToFront();
        }
        hf0 hf0Var = this.C1;
        if (hf0Var != null) {
            hf0Var.bringToFront();
        }
        ye0 ye0Var = this.E1;
        if (ye0Var != null) {
            ye0Var.bringToFront();
        }
        af0 af0Var = this.F1;
        if (af0Var != null) {
            af0Var.bringToFront();
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

    public final void W(o8 o8Var, boolean z10) {
        o8 o8Var2;
        boolean z11;
        if (o8Var == null || this.X0.getWidth() <= 0 || this.X0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? o8Var.O0 : o8Var.N0;
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
        u61 textureView = this.X0.getTextureView();
        if (o8Var.K && !o8Var.u && textureView != null) {
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
        File file2 = o8Var.Q0;
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
        File file3 = o8Var.P0;
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
        rb rbVar = this.v1;
        if (rbVar != null && rbVar.R0 != null) {
            canvas.save();
            canvas.scale(f7, f7);
            rb rbVar2 = this.v1;
            rbVar2.I0 = true;
            k6 k6Var = rbVar2.R0;
            k6Var.a = true;
            k6Var.draw(canvas);
            rb rbVar3 = this.v1;
            rbVar3.R0.a = false;
            rbVar3.I0 = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File w10 = o8.w(this.c, "jpg");
        if (z10) {
            o8Var2 = o8Var;
            z11 = z10;
            Utilities.searchQueue.postRunnable(new u1(this, createBitmap, z11, w10, o8Var2, 1));
        } else {
            o8Var2 = o8Var;
            z11 = z10;
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(w10));
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        if (!z11) {
            o8Var2.N0 = w10;
        }
        o8Var2.b1 = createScaledBitmap;
    }

    public final void X() {
        bi.n8 o9;
        char c10;
        ia iaVar = this.q0;
        BitmapDrawable bitmapDrawable = null;
        if (iaVar != null) {
            iaVar.dismiss();
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
        fc fcVar = this.c1;
        if (fcVar != null && fcVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.q6 q6Var = fcVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(q6Var, i11);
            fcVar.e();
            return;
        }
        o8 o8Var = this.K1;
        int i12 = this.c;
        int i13 = 0;
        if ((o8Var == null || (!o8Var.g && o8Var.J0 == 0)) && (o9 = MessagesController.getInstance(i12).storiesController.o()) != null && o9.a(i12, B())) {
            h0(o9, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        bi.b bVar = this.a;
        if (fcVar != null && !this.K1.D0) {
            CharSequence text = fcVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((o01[]) spannable.getSpans(0, text.length(), o01.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.yc(this.n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.gc, 0, new ka(this, 27), bVar)).k(true);
                    int i14 = -this.U1;
                    this.U1 = i14;
                    AndroidUtilities.shakeViewSpring(fcVar, i14);
                    return;
                }
            }
        }
        o8 o8Var2 = this.K1;
        if (o8Var2.g || o8Var2.J0 != 0) {
            o8Var2.l = false;
            i(null);
            p0();
            return;
        }
        if (this.N != 0) {
            o8Var2.v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
        }
        dc dcVar = this.X0;
        dcVar.x(3, true);
        ia iaVar2 = new ia(this.b, this.K1.I0, bVar);
        iaVar2.q1(this.K1.E0);
        iaVar2.p1(this.K1.v0);
        iaVar2.F = this.M;
        iaVar2.U = new la(this, 14);
        iaVar2.e1(!this.A0.j());
        ArrayList arrayList = this.I1;
        iaVar2.m1(arrayList == null ? this.K1.r() : arrayList.size());
        iaVar2.k1(false);
        CharSequence text2 = fcVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (o51 o51Var : (o51[]) ((Spanned) text2).getSpans(0, text2.length(), o51.class)) {
                if (o51Var != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(o51Var.getURL())));
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
        iaVar2.S = arrayList2;
        iaVar2.W = new la(this, 15);
        iaVar2.X = new la(this, 16);
        iaVar2.T = new ta(this, 10);
        this.q0 = iaVar2;
        o8 o8Var3 = this.K1;
        if (o8Var3.K) {
            if (dcVar != null && !o8Var3.f0 && this.f0 != 2) {
                o8Var3.e0 = dcVar.getCurrentPosition();
                la laVar = new la(this, 17);
                qg.c1 c1Var = this.w1;
                View view = this.z1;
                View[] viewArr = new View[3];
                viewArr[0] = dcVar;
                viewArr[c10] = c1Var;
                viewArr[2] = view;
                dcVar.h(laVar, viewArr);
            }
            ia iaVar3 = this.q0;
            Bitmap bitmap = this.K1.g0;
            ka kaVar = new ka(this, 20);
            if (bitmap != null) {
                iaVar3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            iaVar3.b0 = bitmapDrawable;
            iaVar3.c0 = kaVar;
            i1 i1Var = iaVar3.b;
            if (i1Var != null) {
                for (View view2 : i1Var.getViewPages()) {
                    if (view2 instanceof ba) {
                        ba baVar = (ba) view2;
                        baVar.g(false);
                        baVar.e(false);
                    }
                }
            }
        }
        this.q0.setOnDismissListener(new za(this, i13));
        this.q0.show();
    }

    public final void Y(kc kcVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (kcVar != null) {
            this.F = kcVar;
            this.J = kcVar.a;
            rectF.set(kcVar.c);
            this.G = kcVar.b;
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
                    oq oqVar = new oq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    oqVar.e = dp;
                    oqVar.f = dp2;
                    this.A0.setCameraThumb(oqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ta(this, 13));
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
                CameraController.getInstance().initCamera(new ka(this, 0));
            }
        }
    }

    public final void b0(Runnable runnable) {
        sb sbVar = this.B0;
        if (sbVar == null || sbVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new a3.j0(this, this.B0.getTextureView().getBitmap(), runnable, 21));
        } catch (Throwable unused) {
        }
    }

    public final void c0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new qb(this, 1)).setListener(new ah.r0(this, z10, view, 2)).setDuration(320L).setInterpolator(pr.h).start();
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
        bi.n8 o9;
        o8 o8Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            l7 l7Var = this.O0;
            if (l7Var != null) {
                l7Var.h();
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
            l7 l7Var2 = this.O0;
            if (l7Var2 == null || this.V1) {
                return;
            }
            l7Var2.h();
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f0;
            int i15 = this.c;
            if (i14 != 1) {
                if (i14 == 0 && (o9 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o9.a(i15, 1)) {
                    o8 o8Var2 = this.K1;
                    if (o8Var2 == null || o8Var2.J0 == 0) {
                        h0(o9, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.N1 && !this.c1.o()) {
                bi.u8 storiesController = MessagesController.getInstance(i15).getStoriesController();
                int B = B();
                bi.n8 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.a, B) || ((o8Var = this.K1) != null && (o8Var.g || o8Var.J0 != 0))) {
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
        sb sbVar = this.B0;
        if ((sbVar != null && sbVar.isDual()) || this.a2) {
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
        ad adVar = this.E0;
        if (adVar.n != i10) {
            adVar.n = i10;
            ValueAnimator valueAnimator = adVar.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                adVar.r = null;
            }
            adVar.setDrawable(i10);
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
                this.q2 = new ua(this, z10, 0);
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
            ob obVar = this.M0;
            if (obVar != null) {
                obVar.K = false;
            }
            if (z10 && (v0Var = this.N0) != null) {
                v0Var.a(false);
            }
            hc hcVar = this.r;
            if (hcVar != null) {
                hcVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.M0.setImportantForAccessibility(z10 ? 0 : 4);
            this.p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            oc ocVar = this.n;
            float height = z10 ? 0.0f : (ocVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            int i11 = 1;
            Math.max(1, ocVar.getHeight());
            ob obVar2 = this.M0;
            obVar2.K = !z10;
            this.k2 = this.j2 == null;
            if (z10) {
                o1.k kVar2 = new o1.k(obVar2, o1.h.n, height);
                this.o2 = kVar2;
                kVar2.u.a(0.75f);
                this.o2.u.b(350.0f);
                this.o2.a(new va(this, height, i10));
                this.o2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.n2 = ofFloat;
                ofFloat.addUpdateListener(new wa(this, i10));
                this.n2.addListener(new mb(this, i11));
                this.n2.setDuration(450L);
                this.n2.setInterpolator(pr.h);
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
            xi0 xi0Var = new xi0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f1 = xi0Var;
            xi0Var.F *= 1.5f;
        }
        this.g1.setAnimation(this.f1);
        if (!z11) {
            this.f1.L(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            xi0 xi0Var2 = this.f1;
            if (xi0Var2.b0 > 20) {
                xi0Var2.L(0, false, false);
            }
            this.f1.N(20);
            this.f1.start();
            return;
        }
        xi0 xi0Var3 = this.f1;
        int i10 = xi0Var3.b0;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        xi0Var3.N(43);
        this.f1.start();
    }

    public final void g(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        hc hcVar = this.r;
        if (!z10) {
            this.L = null;
            this.I = f7;
            k();
            hcVar.invalidate();
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
        ofFloat.addUpdateListener(new wa(this, 5));
        this.E.addListener(new bi.h2(this, f7, runnable, 2));
        if (f7 < 1.0f && this.v) {
            this.E.setDuration(250L);
            this.E.setInterpolator(pr.h);
        } else if (f7 > 0.0f || hcVar.a < AndroidUtilities.dp(20.0f)) {
            this.E.setDuration(300L);
            this.E.setInterpolator(new u1.a());
        } else if (f7 >= 0.0f || !this.O) {
            this.E.setDuration(400L);
            this.E.setInterpolator(pr.h);
        } else {
            this.E.setDuration(200L);
            this.E.setInterpolator(pr.h);
            this.O = false;
        }
        this.E.start();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = this.n.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 2));
        }
    }

    public final void h(boolean z10, boolean z11) {
        y yVar;
        if (z10) {
            f4 f4Var = this.l1;
            if (f4Var != null) {
                f4Var.e(true);
            }
            f4 f4Var2 = this.m1;
            if (f4Var2 != null) {
                f4Var2.e(true);
            }
            f4 f4Var3 = this.k1;
            if (f4Var3 != null) {
                f4Var3.e(true);
            }
            f4 f4Var4 = this.W0;
            if (f4Var4 != null) {
                f4Var4.e(true);
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
        gb gbVar = this.Q0;
        c4 c4Var = this.U0;
        c4 c4Var2 = this.T0;
        if (!z11) {
            c4Var2.setAlpha((z10 && this.f0 == 0 && !I()) ? 1.0f : 0.0f);
            c4Var2.setTranslationY((z10 && this.f0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            c4Var.setAlpha((!z10 && this.f0 == 0 && I()) ? 0.6f : 0.0f);
            c4Var.setTranslationY((!z10 && this.f0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            gbVar.setAlpha((z10 || this.f0 != 0 || I()) ? 0.0f : 1.0f);
            gbVar.setTranslationY((z10 || this.f0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Z1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c4Var2, (Property<c4, Float>) property, (z10 && this.f0 == 0 && !I()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(c4Var2, (Property<c4, Float>) property2, (z10 && this.f0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(c4Var, (Property<c4, Float>) property, (!z10 && this.f0 == 0 && I()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(c4Var, (Property<c4, Float>) property2, (!z10 && this.f0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(gbVar, (Property<gb, Float>) property, (z10 || this.f0 != 0 || I()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(gbVar, (Property<gb, Float>) property2, (z10 || this.f0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.Z1.setDuration(260L);
        this.Z1.setInterpolator(pr.h);
        this.Z1.start();
    }

    public final void h0(bi.n8 n8Var, boolean z10) {
        if (this.z2) {
            return;
        }
        ub ubVar = new ub(n8Var.b(), this.c, this.b, new tb(this, 0), null);
        ubVar.X = B();
        ubVar.setOnDismissListener(new b80(2, this, z10));
        this.X0.x(7, true);
        this.z2 = true;
        ubVar.show();
    }

    public final void i(Runnable runnable) {
        o8 o8Var;
        Runnable runnable2;
        dc dcVar;
        jf0 jf0Var = this.B1;
        if (jf0Var == null || (o8Var = this.K1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        o8Var.j = jf0Var.d() | o8Var.j;
        o8 o8Var2 = this.K1;
        jf0 jf0Var2 = this.B1;
        File file = o8Var2.Z0;
        if (file != null) {
            file.delete();
            o8Var2.Z0 = null;
        }
        MediaController.SavedFilterState savedFilterState = jf0Var2.getSavedFilterState();
        o8Var2.a1 = savedFilterState;
        if (o8Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = jf0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i10 = o8Var2.R;
                    matrix.postScale(i10 == 1 ? -1.0f : 1.0f, i10 == 2 ? -1.0f : 1.0f, o8Var2.k0 / 2.0f, o8Var2.l0 / 2.0f);
                    matrix.postRotate(-o8Var2.Q);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    o8Var2.n0.preScale(o8Var2.k0 / createBitmap.getWidth(), o8Var2.l0 / createBitmap.getHeight());
                    o8Var2.k0 = createBitmap.getWidth();
                    o8Var2.l0 = createBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = o8Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        o8Var2.Z0.delete();
                    }
                    String k10 = o8.k(o8Var2.L);
                    boolean z10 = "png".equals(k10) || "webp".equals(k10);
                    o8Var2.Z0 = o8.w(o8Var2.a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            createBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(o8Var2.Z0));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        createBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new bi.e4(o8Var2, createBitmap, z10, runnable2, 2));
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
            o8 o8Var3 = this.K1;
            if (o8Var3.K || (dcVar = this.X0) == null) {
                return;
            }
            dcVar.set(o8Var3);
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.d2 == z10) {
            return;
        }
        this.d2 = z10;
        if (z11) {
            this.J0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(pr.h).withEndAction(new ua(this, z10, 1)).start();
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
        d91 d91Var = this.V0;
        if ((d91Var.getTag() != null && z10) || (d91Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ka kaVar = new ka(this, 25);
                this.e2 = kaVar;
                AndroidUtilities.runOnUIThread(kaVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        d91Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            d91Var.setVisibility(0);
        }
        this.f2.playTogether(ObjectAnimator.ofFloat(d91Var, (Property<d91, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.f2.addListener(new ah.q0(14, this, z10));
        this.f2.start();
        if (z10) {
            ka kaVar2 = new ka(this, 26);
            this.e2 = kaVar2;
            AndroidUtilities.runOnUIThread(kaVar2, 2000L);
        }
    }

    public final void k() {
        bi.l4 l4Var;
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
        kc kcVar = this.F;
        if (kcVar != null && (l4Var = kcVar.f) != null) {
            l4Var.setTranslationX((rectF.left - rectF2.left) * this.I);
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
        ia iaVar = this.q0;
        if (iaVar != null) {
            iaVar.dismiss();
            this.q0 = null;
        }
        ia iaVar2 = new ia(this.b, 86400, this.a);
        iaVar2.o1();
        iaVar2.q1(this.y0);
        TLRPC.InputPeer inputPeer = this.x0;
        if (inputPeer == null) {
            inputPeer = this.N != 0 ? MessagesController.getInstance(this.c).getInputPeer(this.N) : new TLRPC.TL_inputPeerSelf();
        }
        iaVar2.p1(inputPeer);
        iaVar2.F = this.M;
        iaVar2.U = new la(this, 18);
        iaVar2.e1(false);
        iaVar2.m1(1);
        iaVar2.k1(false);
        iaVar2.W = new la(this, 19);
        iaVar2.T = new ta(this, 12);
        this.q0 = iaVar2;
        iaVar2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        if (r6.isRecycled() != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        o8 o8Var;
        ImageReceiver photoImage;
        if (this.v1 == null || (o8Var = this.K1) == null) {
            return;
        }
        o8Var.f();
        this.K1.j |= this.v1.u0();
        o8 o8Var2 = this.K1;
        ArrayList arrayList = o8Var2.T0;
        if (arrayList == null) {
            o8Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        rb rbVar = this.v1;
        o8 o8Var3 = this.K1;
        rbVar.t0(o8Var3.T0, false, false, false, false, o8Var3);
        o8 o8Var4 = this.K1;
        if (!o8Var4.K) {
            o8Var4.S0 = Utilities.clamp(this.v1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.v1.getMasks();
        this.K1.U0 = masks != null ? new ArrayList(masks) : null;
        o8 o8Var5 = this.K1;
        boolean z10 = o8Var5.K;
        boolean E = o8Var5.E();
        this.K1.T0 = new ArrayList();
        rb rbVar2 = this.v1;
        o8 o8Var6 = this.K1;
        Bitmap t02 = rbVar2.t0(o8Var6.T0, true, false, false, !z10, o8Var6);
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
        o8 o8Var7 = this.K1;
        o8Var7.P0 = null;
        o8Var7.R0 = null;
        o8Var7.Q0 = null;
        int i10 = this.c;
        FileLoader fileLoader = FileLoader.getInstance(i10);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        o8 o8Var8 = this.K1;
        o8Var7.P0 = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(t02, compressFormat, o8Var8.i0, o8Var8.j0, 87, false, 101, 101), true);
        if (t02 != null && !t02.isRecycled()) {
            t02.recycle();
        }
        o8 o8Var9 = this.K1;
        if (o8Var9.u) {
            File file4 = o8Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                this.K1.Y0 = null;
            }
            o8 o8Var10 = this.K1;
            long j3 = o8Var10.z0;
            if (j3 != Long.MIN_VALUE) {
                Drawable drawable = o8Var10.x0;
                if (drawable == null) {
                    drawable = d7.e(null, i10, j3, this.c2);
                }
                if (drawable != null) {
                    this.K1.Y0 = o8.w(i10, "webp");
                    o8 o8Var11 = this.K1;
                    Bitmap createBitmap = Bitmap.createBitmap(o8Var11.i0, o8Var11.j0, Bitmap.Config.ARGB_8888);
                    o8.j(new Canvas(createBitmap), drawable, createBitmap.getWidth(), createBitmap.getHeight());
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
        o8 o8Var12 = this.K1;
        if (o8Var12.u) {
            File file5 = o8Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                this.K1.X0 = null;
            }
            o8 o8Var13 = this.K1;
            if (o8Var13.u && o8Var13.K) {
                int i11 = o8Var13.k0;
                int i12 = o8Var13.l0;
                rg.g1 s02 = this.v1.s0();
                if (s02 != null) {
                    rg.z0 z0Var = s02.r0;
                    if (z0Var.getChildCount() == 1 && i11 > 0 && i12 > 0) {
                        if ((z0Var.getChildAt(0) instanceof org.telegram.ui.Cells.t1) && (photoImage = ((org.telegram.ui.Cells.t1) z0Var.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
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
                                this.K1.X0 = o8.w(i10, "webp");
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
            rb rbVar3 = this.v1;
            ArrayList arrayList2 = new ArrayList();
            o8 o8Var14 = this.K1;
            int i17 = o8Var14.i0;
            Bitmap t03 = rbVar3.t0(arrayList2, false, true, false, false, o8Var14);
            o8 o8Var15 = this.K1;
            FileLoader fileLoader2 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            o8 o8Var16 = this.K1;
            o8Var15.R0 = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(t03, compressFormat2, o8Var16.i0, o8Var16.j0, 87, false, 101, 101), true);
            if (t03 != null && !t03.isRecycled()) {
                t03.recycle();
            }
        }
        if (this.v1.O0.getPainting().E) {
            Bitmap blurBitmap = this.v1.getBlurBitmap();
            o8 o8Var17 = this.K1;
            FileLoader fileLoader3 = FileLoader.getInstance(i10);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            o8 o8Var18 = this.K1;
            o8Var17.Q0 = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, o8Var18.i0, o8Var18.j0, 87, false, 101, 101), true);
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
        zb zbVar;
        int i11;
        float f10;
        ac acVar;
        int i12;
        float f11;
        o8 o8Var;
        ImageView imageView;
        int i13;
        int i14;
        float f12;
        af0 af0Var;
        ye0 ye0Var;
        ImageView imageView2;
        int i15;
        o8 o8Var2;
        rb rbVar;
        rb rbVar2;
        int i16 = this.g0;
        if (i16 == i10 && !z10) {
            return;
        }
        fc fcVar = this.c1;
        if (i10 != -1 && fcVar != null && fcVar.O1) {
            return;
        }
        this.g0 = i10;
        AnimatorSet animatorSet = this.r2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r2 = null;
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.p0;
        zc zcVar = this.Z0;
        u0 u0Var = this.e1;
        w2 w2Var = this.n0;
        r6 r6Var = this.j1;
        aj0 aj0Var = this.g1;
        if (i16 != i10) {
            if (i10 == -1) {
                w2Var.setVisibility(0);
                fcVar.setVisibility(0);
                rb rbVar3 = this.v1;
                if (rbVar3 != null) {
                    rbVar3.D0(null, true);
                }
                u0Var.setVisibility(0);
                o8 o8Var3 = this.K1;
                if (o8Var3 == null || !o8Var3.u) {
                    ImageView imageView3 = this.i1;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    G().setVisibility(0);
                    o0(false);
                }
                j5Var.setVisibility(0);
                if (this.O1 == 1) {
                    aj0Var.setVisibility(0);
                    r6Var.setVisibility(0);
                } else {
                    o8 o8Var4 = this.K1;
                    if (o8Var4 != null && !TextUtils.isEmpty(o8Var4.y)) {
                        aj0Var.setVisibility(8);
                        r6Var.setVisibility(0);
                    }
                }
                zcVar.setVisibility(0);
            }
            if (i10 == 0 && (rbVar2 = this.v1) != null) {
                rbVar2.setVisibility(0);
            }
            if ((i10 == 0 || i16 == 0) && (rbVar = this.v1) != null) {
                rbVar.d1.setLayerType(2, null);
            }
            rb rbVar4 = this.v1;
            if (rbVar4 != null) {
                rbVar4.O1.b(i10 != 0);
            }
            fcVar.L.b(i10 != -1);
            org.telegram.ui.Components.qc.e();
            if (this.B1 != null && i16 == 1) {
                i(null);
            }
            hf0 hf0Var = this.C1;
            if (hf0Var != null) {
                hf0Var.setAllowTouch(false);
            }
            this.k1.e(true);
            oc ocVar = this.n;
            dc dcVar = this.X0;
            Activity activity = this.b;
            if (i10 == 3) {
                if (this.r1 == null) {
                    zb zbVar2 = new zb(this, activity, dcVar);
                    this.r1 = zbVar2;
                    ocVar.addView(zbVar2.d);
                    ocVar.addView(this.r1);
                }
                this.r1.setVisibility(0);
                o8 o8Var5 = this.K1;
                if (o8Var5 != null) {
                    this.r1.setEntry(o8Var5);
                }
            } else if (i16 == 3) {
                dcVar.b();
                zb zbVar3 = this.r1;
                if (zbVar3 != null) {
                    zbVar3.a.setCropEditorDrawing(zbVar3);
                    zbVar3.y = true;
                }
            }
            if (i10 == 4) {
                if (this.s1 == null) {
                    ac acVar2 = new ac(this, activity, dcVar);
                    this.s1 = acVar2;
                    ocVar.addView(acVar2.e);
                    ocVar.addView(this.s1);
                }
                this.s1.setVisibility(0);
            } else if (i16 == 4) {
                dcVar.b();
                ac acVar3 = this.s1;
                if (acVar3 != null) {
                    acVar3.E = true;
                }
            }
        }
        this.b1.b((i10 == -1 || i10 == 2) && this.I > 0.0f, z11);
        ArrayList arrayList = new ArrayList();
        jf0 jf0Var = this.B1;
        boolean z13 = jf0Var == null && i10 == 1;
        float f13 = 1.0f;
        if (i10 == 1) {
            s();
            jf0 jf0Var2 = this.B1;
            this.v2 = jf0Var2;
            FrameLayout toolsView = jf0Var2 != null ? jf0Var2.getToolsView() : null;
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
            if (i16 == 1 && jf0Var != null) {
                this.v2 = null;
                z12 = z13;
                arrayList.add(ObjectAnimator.ofFloat(jf0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.B1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                if (i10 != 0) {
                    u();
                    this.v2 = this.v1;
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(w2Var, (Property<w2, Float>) property, f7));
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
                    arrayList.add(ObjectAnimator.ofFloat(w2Var, (Property<w2, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getTopLayout(), (Property<View, Float>) property3, f7));
                    View topLayout2 = this.v1.getTopLayout();
                    Property property4 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property4, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property3, f7));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getBottomLayout(), (Property<View, Float>) property4, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.v1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                zbVar = this.r1;
                if (zbVar == null) {
                    mg.f fVar = zbVar.h;
                    if (i10 == 3) {
                        Property property5 = View.ALPHA;
                        i11 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<mg.f, Float>) property5, 0.0f, 1.0f));
                        mg.f fVar2 = this.r1.h;
                        Property property6 = View.TRANSLATION_Y;
                        f10 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar2, (Property<mg.f, Float>) property6, AndroidUtilities.dp(52.0f), f7));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property5, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property6, AndroidUtilities.dp(52.0f), f7));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r1.getAppearProgress(), 1.0f);
                        ofFloat.addUpdateListener(new wa(this, 1));
                        arrayList.add(ofFloat);
                    } else {
                        i11 = 2;
                        f10 = 52.0f;
                        if (i16 == 3) {
                            Property property7 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(fVar, (Property<mg.f, Float>) property7, 1.0f, 0.0f));
                            mg.f fVar3 = this.r1.h;
                            Property property8 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(fVar3, (Property<mg.f, Float>) property8, f7, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property7, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.r1.n, (Property<FrameLayout, Float>) property8, f7, AndroidUtilities.dp(52.0f)));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.r1.getAppearProgress(), f7);
                            ofFloat2.addUpdateListener(new wa(this, i11));
                            arrayList.add(ofFloat2);
                        }
                    }
                } else {
                    i11 = 2;
                    f10 = 52.0f;
                }
                acVar = this.s1;
                if (acVar != null) {
                    mg.f fVar4 = acVar.n;
                    if (i10 == 4) {
                        Property property9 = View.ALPHA;
                        float[] fArr = new float[i11];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<mg.f, Float>) property9, fArr));
                        mg.f fVar5 = this.s1.n;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[i11];
                        fArr2[0] = AndroidUtilities.dp(f10);
                        fArr2[1] = f7;
                        arrayList.add(ObjectAnimator.ofFloat(fVar5, (Property<mg.f, Float>) property10, fArr2));
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
                        ofFloat3.addUpdateListener(new wa(this, 3));
                        arrayList.add(ofFloat3);
                    } else if (i16 == 4) {
                        Property property11 = View.ALPHA;
                        float[] fArr6 = new float[i11];
                        // fill-array-data instruction
                        fArr6[0] = 1.0f;
                        fArr6[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(fVar4, (Property<mg.f, Float>) property11, fArr6));
                        mg.f fVar6 = this.s1.n;
                        Property property12 = View.TRANSLATION_Y;
                        float dp = AndroidUtilities.dp(f10);
                        float[] fArr7 = new float[i11];
                        fArr7[0] = f7;
                        fArr7[1] = dp;
                        arrayList.add(ObjectAnimator.ofFloat(fVar6, (Property<mg.f, Float>) property12, fArr7));
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
                        ofFloat4.addUpdateListener(new wa(this, 4));
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
                        arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property13, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property13, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((o8Var = this.K1) == null || TextUtils.isEmpty(o8Var.y)))) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                        imageView = this.i1;
                        if (imageView != null) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property13, ((i10 == -1 || i10 == 2) && (o8Var2 = this.K1) != null && o8Var2.u) ? 1.0f : 0.0f));
                        } else {
                            i13 = 1;
                        }
                        int i17 = this.f0;
                        float[] fArr12 = new float[i13];
                        fArr12[0] = ((i17 != i13 || i17 == 2) && i10 == -1) ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property13, fArr12));
                        bc bcVar = this.h0;
                        if (i10 == i13) {
                            bcVar.setPivotY(bcVar.getMeasuredHeight() * 0.2f);
                            i14 = AndroidUtilities.dp(164.0f);
                        } else if (i10 == 0) {
                            bcVar.setPivotY(bcVar.getMeasuredHeight() * 0.6f);
                            i14 = AndroidUtilities.dp(40.0f);
                        } else if (i10 == 2) {
                            bcVar.setPivotY(0.0f);
                            i14 = zcVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            f12 = (r10 - i14) / (bcVar.getHeight() - ((int) bcVar.getPivotY()));
                        } else {
                            f12 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(bcVar, (Property<bc, Float>) View.SCALE_X, f12));
                        arrayList.add(ObjectAnimator.ofFloat(bcVar, (Property<bc, Float>) View.SCALE_Y, f12));
                        if (i10 == -1) {
                            arrayList.add(ObjectAnimator.ofFloat(bcVar, (Property<bc, Float>) View.TRANSLATION_Y, 0.0f));
                        }
                        af0Var = this.F1;
                        if (af0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(af0Var, (Property<af0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        ye0Var = this.E1;
                        if (ye0Var != null) {
                            arrayList.add(ObjectAnimator.ofFloat(ye0Var, (Property<ye0, Float>) property13, i10 == 1 ? 1.0f : 0.0f));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(fcVar, (Property<fc, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                        float[] fArr13 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                        ah.y yVar = this.l0;
                        arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<ah.y, Float>) property13, fArr13));
                        Property property14 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(yVar, (Property<ah.y, Float>) property14, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                        if (i10 != -1 && i10 != 2) {
                            f13 = 0.0f;
                        }
                        FrameLayout frameLayout3 = this.Y0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property13, f13));
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + fcVar.getEditTextHeight()))));
                        LinearLayout linearLayout = this.j0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                        Property property15 = View.ROTATION;
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property15, i10 == 2 ? -90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        imageView2 = this.i1;
                        if (imageView2 != null) {
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property15, i10 == 2 ? 90.0f : 0.0f));
                        }
                        if (this.r0.c()) {
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i15 = 0;
                            ofFloat5.addUpdateListener(new qb(this, i15));
                            arrayList.add(ofFloat5);
                        } else {
                            i15 = 0;
                        }
                        if (zcVar != null) {
                            o8 o8Var6 = this.K1;
                            boolean z14 = o8Var6 == null || !o8Var6.v() || !this.K1.t() || i10 == 2;
                            if (zcVar.j0 != z14 || !z11) {
                                zcVar.j0 = z14;
                                if (!z11) {
                                    zcVar.i0.f(z14, true);
                                }
                                zcVar.invalidate();
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
                        this.r2.setInterpolator(pr.h);
                        this.r2.addListener(new lb(this, i16, i10, 1));
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
                arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property13, fArr112));
                arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property13, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((o8Var = this.K1) == null || TextUtils.isEmpty(o8Var.y)))) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property13, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
                imageView = this.i1;
                if (imageView != null) {
                }
                int i172 = this.f0;
                float[] fArr122 = new float[i13];
                fArr122[0] = ((i172 != i13 || i172 == 2) && i10 == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property13, fArr122));
                bc bcVar2 = this.h0;
                if (i10 == i13) {
                }
                if (i14 > 0) {
                }
                arrayList.add(ObjectAnimator.ofFloat(bcVar2, (Property<bc, Float>) View.SCALE_X, f12));
                arrayList.add(ObjectAnimator.ofFloat(bcVar2, (Property<bc, Float>) View.SCALE_Y, f12));
                if (i10 == -1) {
                }
                af0Var = this.F1;
                if (af0Var != null) {
                }
                ye0Var = this.E1;
                if (ye0Var != null) {
                }
                arrayList.add(ObjectAnimator.ofFloat(fcVar, (Property<fc, Float>) property13, i10 == -1 ? 1.0f : 0.0f));
                float[] fArr132 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
                ah.y yVar2 = this.l0;
                arrayList.add(ObjectAnimator.ofFloat(yVar2, (Property<ah.y, Float>) property13, fArr132));
                Property property142 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(yVar2, (Property<ah.y, Float>) property142, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
                if (i10 != -1) {
                    f13 = 0.0f;
                }
                FrameLayout frameLayout32 = this.Y0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property13, f13));
                arrayList.add(ObjectAnimator.ofFloat(frameLayout32, (Property<FrameLayout, Float>) property142, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + fcVar.getEditTextHeight()))));
                LinearLayout linearLayout2 = this.j0;
                linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                Property property152 = View.ROTATION;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property152, i10 == 2 ? -90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property152, i10 == 2 ? 90.0f : 0.0f));
                imageView2 = this.i1;
                if (imageView2 != null) {
                }
                if (this.r0.c()) {
                }
                if (zcVar != null) {
                }
                if (!z11) {
                }
            }
        }
        z12 = z13;
        if (i10 != 0) {
        }
        zbVar = this.r1;
        if (zbVar == null) {
        }
        acVar = this.s1;
        if (acVar != null) {
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
        arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property132, fArr1122));
        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property132, ((i10 != -1 || i10 == 2) && (this.O1 == i12 || !((o8Var = this.K1) == null || TextUtils.isEmpty(o8Var.y)))) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property132, (i10 != -1 || i10 == 2) ? 1.0f : 0.0f));
        imageView = this.i1;
        if (imageView != null) {
        }
        int i1722 = this.f0;
        float[] fArr1222 = new float[i13];
        fArr1222[0] = ((i1722 != i13 || i1722 == 2) && i10 == -1) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property132, fArr1222));
        bc bcVar22 = this.h0;
        if (i10 == i13) {
        }
        if (i14 > 0) {
        }
        arrayList.add(ObjectAnimator.ofFloat(bcVar22, (Property<bc, Float>) View.SCALE_X, f12));
        arrayList.add(ObjectAnimator.ofFloat(bcVar22, (Property<bc, Float>) View.SCALE_Y, f12));
        if (i10 == -1) {
        }
        af0Var = this.F1;
        if (af0Var != null) {
        }
        ye0Var = this.E1;
        if (ye0Var != null) {
        }
        arrayList.add(ObjectAnimator.ofFloat(fcVar, (Property<fc, Float>) property132, i10 == -1 ? 1.0f : 0.0f));
        float[] fArr1322 = {(i10 != -1 || i10 == 2) ? 1.0f : 0.0f};
        ah.y yVar22 = this.l0;
        arrayList.add(ObjectAnimator.ofFloat(yVar22, (Property<ah.y, Float>) property132, fArr1322));
        Property property1422 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(yVar22, (Property<ah.y, Float>) property1422, (i10 != -1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(120.0f)));
        if (i10 != -1) {
        }
        FrameLayout frameLayout322 = this.Y0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property132, f13));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout322, (Property<FrameLayout, Float>) property1422, i10 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + fcVar.getEditTextHeight()))));
        LinearLayout linearLayout22 = this.j0;
        linearLayout22.setPivotX(linearLayout22.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
        Property property1522 = View.ROTATION;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout22, (Property<LinearLayout, Float>) property1522, i10 == 2 ? -90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(r6Var, (Property<r6, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property1522, i10 == 2 ? 90.0f : 0.0f));
        imageView2 = this.i1;
        if (imageView2 != null) {
        }
        if (this.r0.c()) {
        }
        if (zcVar != null) {
        }
        if (!z11) {
        }
    }

    public final void m() {
        o8 o8Var;
        if (this.v1 == null || (o8Var = this.K1) == null || !o8Var.u) {
            return;
        }
        File file = o8Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.K1.W0 = null;
        }
        this.K1.W0 = o8.w(this.c, "webp");
        rb rbVar = this.v1;
        o8 o8Var2 = this.K1;
        Bitmap t02 = rbVar.t0(o8Var2.T0, false, false, true, this.O1 != 1, o8Var2);
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
        sb sbVar;
        boolean z11 = false;
        i0(this.f0 == 0 && this.O1 == 1 && !this.I0.e && !I(), z10);
        this.G0.setSelected(this.A0.j());
        y yVar = this.I0;
        c0(this.n0, yVar == null || !yVar.e, z10);
        c0(this.E0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.Y1 == null || this.I0.e || I()) ? false : true, z10);
        c0(this.F0, (this.a2 || this.O1 == -1 || this.f0 != 0 || (sbVar = this.B0) == null || !sbVar.a || this.I0.e || this.A0.j()) ? false : true, z10);
        c0(this.G0, (this.a2 || this.O1 == -1 || this.f0 != 0 || this.I0.e) ? false : true, z10);
        c0(this.H0, this.I0.e, z10);
        this.O0.e(this.A0.j() ? this.A0.getFilledProgress() : 0.0f, z10);
        boolean z12 = this.I0.e;
        f4 f4Var = this.n1;
        if (z12) {
            f4Var.u();
        } else {
            f4Var.e(true);
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
        kb0 kb0Var = this.y;
        if (kb0Var != null) {
            kb0Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void o0(boolean z10) {
        xi0 xi0Var = this.h1;
        if (xi0Var != null) {
            int[] iArr = xi0Var.e;
            int i10 = 0;
            if (!z10) {
                o8 o8Var = this.K1;
                int i11 = (o8Var == null || !o8Var.y0) ? 0 : iArr[0] - 1;
                xi0Var.L(i11, false, true);
                this.h1.N(i11);
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            o8 o8Var2 = this.K1;
            if (o8Var2 != null && o8Var2.y0) {
                i10 = iArr[0];
            }
            xi0Var.N(i10);
            xi0 xi0Var2 = this.h1;
            if (xi0Var2 != null) {
                xi0Var2.start();
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
            y2 y2Var = this.s;
            y2Var.o = f7;
            y2Var.n = y2.f(f7);
            y2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            y2 y2Var2 = this.s;
            y2Var2.p = f10;
            y2Var2.i();
        }
    }

    public final void p0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        ka kaVar = new ka(this, 2);
        rb rbVar = this.v1;
        o8 o8Var = this.K1;
        if (rbVar == null || o8Var == null) {
            kaVar.run();
            return;
        }
        o8Var.f();
        boolean u02 = rbVar.u0();
        boolean z10 = rbVar.O0.getPainting().E;
        Utilities.searchQueue.postRunnable(new na(this, rbVar, o8Var.i0, o8Var.j0, o8Var, z10, u02, kaVar, 1));
    }

    public final void q(boolean z10) {
        dc dcVar;
        if (this.d) {
            ia iaVar = this.q0;
            if (iaVar != null) {
                iaVar.dismiss();
                this.q0 = null;
            }
            o8 o8Var = this.K1;
            long j3 = 0;
            if (o8Var != null && !o8Var.h) {
                if ((this.v && o8Var.g) || o8Var.b != 0) {
                    o8Var.j = false;
                }
                o8Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 == null || (dcVar = this.X0) == null) {
                dc dcVar2 = this.X0;
                if (dcVar2 != null && !z10) {
                    dcVar2.set(null);
                }
                g(0.0f, z10, new ka(this, 23));
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
            g71 g71Var = dcVar.y;
            if (g71Var != null) {
                g71Var.B();
                dcVar.y.H();
                dcVar.y = null;
            }
            g71 g71Var2 = dcVar.x;
            if (g71Var2 != null) {
                j3 = g71Var2.n();
                dcVar.x.B();
                dcVar.x.H();
                dcVar.x = null;
            }
            g71 g71Var3 = dcVar.e;
            if (g71Var3 != null) {
                j3 = g71Var3.n();
                dcVar.e.B();
                dcVar.e.H();
                dcVar.e = null;
            }
            callback4.run(Long.valueOf(j3), new ua(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.w));
        }
    }

    public final boolean q0() {
        sb sbVar;
        if ((!this.P1 && !this.Q1) || (sbVar = this.B0) == null || !sbVar.isFrontface()) {
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
        this.B0 = new sb(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        l7 l7Var = this.O0;
        if (l7Var != null) {
            l7Var.g0 = 0.0f;
            l7Var.h0.d(0.0f, true);
        }
        this.B0.recordHevc = !this.A0.j();
        this.B0.setThumbDrawable(A());
        this.B0.initTexture();
        this.B0.setDelegate(new ta(this, 0));
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
            this.C0 = new h7(activity, new la(this, 3));
        }
        this.C0.a(this.B0);
        w7 w7Var = this.D0;
        if (w7Var != null) {
            cc ccVar = this.A0;
            Object blurRenderNode = ccVar.getBlurRenderNode();
            w7Var.F = ccVar;
            w7Var.G = blurRenderNode;
            w7Var.invalidate();
        }
    }

    public final void s() {
        o8 o8Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.B1 != null || (o8Var = this.K1) == null) {
            return;
        }
        if (o8Var.K) {
            bitmap = null;
        } else {
            if (o8Var.Z0 == null) {
                q6 = this.X0.getPhotoBitmap();
            } else {
                ta taVar = new ta(this, 11);
                Point point = AndroidUtilities.displaySize;
                q6 = o8.q(taVar, point.x, point.y, 0, true);
            }
            bitmap = q6;
        }
        if (bitmap != null || this.K1.K) {
            u61 textureView = this.X0.getTextureView();
            int orientation = this.X0.getOrientation();
            o8 o8Var2 = this.K1;
            jf0 jf0Var = new jf0(this.b, textureView, bitmap, null, orientation, o8Var2 != null ? o8Var2.a1 : null, null, 0, false, false, this.r0, this.a);
            this.B1 = jf0Var;
            this.r.addView(jf0Var);
            hf0 hf0Var = this.C1;
            if (hf0Var != null) {
                hf0Var.setFilterView(this.B1);
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
            ye0 blurControl = this.B1.getBlurControl();
            this.E1 = blurControl;
            if (blurControl != null) {
                this.h0.addView(blurControl);
            }
            af0 curveControl = this.B1.getCurveControl();
            this.F1 = curveControl;
            if (curveControl != null) {
                this.h0.addView(curveControl);
            }
            V();
            this.B1.getDoneTextView().setOnClickListener(new ma(this, 13));
            this.B1.getCancelTextView().setOnClickListener(new ma(this, 14));
            this.B1.getToolsView().setVisibility(8);
            this.B1.getToolsView().setAlpha(0.0f);
            this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.B1.i0.setVisibility(0);
        }
    }

    public final void t(boolean z10) {
        if (this.M0 != null) {
            cc ccVar = this.A0;
            if ((ccVar != null && ccVar.j()) == this.M0.P) {
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
        cc ccVar2 = this.A0;
        ob obVar = new ob(this, this.c, this.b, this.a, albumEntry, z10, z11, ccVar2 != null && ccVar2.j());
        this.M0 = obVar;
        obVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new db(this, 1));
        this.M0.setOnSelectListener(new cb(z10, this, 0));
        this.M0.setOnSelectMultipleListener(new zh.x0(this, 2));
        s4.b0 b0Var = this.l2;
        if (b0Var != null) {
            g3 g3Var = this.M0.e;
            g3Var.B = b0Var;
            g3Var.l0();
        }
        this.n.addView(this.M0, w7.x5.e(-1, -1, 119));
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
        o8 o8Var;
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14;
        o8 o8Var2;
        qg.c1 renderView;
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
        o8 o8Var3 = this.K1;
        Bitmap decodeFile = (o8Var3 == null || !(o8Var3.c || o8Var3.g || this.H1 != null) || (file3 = o8Var3.P0) == null) ? null : BitmapFactory.decodeFile(file3.getPath());
        if (decodeFile == null) {
            decodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = decodeFile;
        o8 o8Var4 = this.K1;
        if (o8Var4 == null || (!(o8Var4.c || o8Var4.g || this.H1 != null) || (file2 = o8Var4.Q0) == null)) {
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
                o8Var = this.K1;
                if (o8Var != null || o8Var.M) {
                    file = null;
                    z11 = false;
                } else {
                    file = null;
                    z11 = true;
                }
                File file4 = o8Var != null ? file : o8Var.L;
                if (o8Var == null && o8Var.K) {
                    z12 = z10;
                    z13 = true;
                } else {
                    z12 = z10;
                    z13 = false;
                }
                if (o8Var != null || o8Var.J0 == 0) {
                    obj = file;
                    z14 = false;
                } else {
                    obj = file;
                    z14 = true;
                }
                int orientation = this.X0.getOrientation();
                o8Var2 = this.K1;
                Object obj2 = obj;
                if (o8Var2 != null) {
                    obj2 = o8Var2.T0;
                }
                ?? r13 = obj2;
                MediaController.CropState cropState = new MediaController.CropState();
                c7 c7Var = this.s0;
                dc dcVar = this.X0;
                Activity activity = this.b;
                boolean z15 = z12;
                rb rbVar = new rb(this, activity, z11, file4, z13, z14, this.n, activity, this.c, bitmap2, bitmap3, orientation, r13, o8Var2, measuredWidth, measuredHeight, cropState, this.r0, this.a, c7Var, dcVar);
                this.v1 = rbVar;
                o8 o8Var5 = this.K1;
                rbVar.setHasAudio(o8Var5 == null && o8Var5.y != null);
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
                this.v1.setOnDoneButtonClickedListener(new ka(this, 21));
                this.v1.setOnCancelButtonClickedListener(new ka(this, 22));
                rb rbVar2 = this.v1;
                rbVar2.R0.setVisibility(0);
                rbVar2.O0.setVisibility(0);
                rbVar2.P0.setVisibility(0);
            }
        }
        z10 = false;
        if (bitmap == null) {
        }
        Bitmap bitmap32 = bitmap;
        int measuredWidth2 = this.h0.getMeasuredWidth();
        int measuredHeight2 = this.h0.getMeasuredHeight();
        o8Var = this.K1;
        if (o8Var != null) {
        }
        file = null;
        z11 = false;
        if (o8Var != null) {
        }
        if (o8Var == null) {
        }
        z12 = z10;
        z13 = false;
        if (o8Var != null) {
        }
        obj = file;
        z14 = false;
        int orientation2 = this.X0.getOrientation();
        o8Var2 = this.K1;
        Object obj22 = obj;
        if (o8Var2 != null) {
        }
        ?? r132 = obj22;
        MediaController.CropState cropState2 = new MediaController.CropState();
        c7 c7Var2 = this.s0;
        dc dcVar2 = this.X0;
        Activity activity2 = this.b;
        boolean z152 = z12;
        rb rbVar3 = new rb(this, activity2, z11, file4, z13, z14, this.n, activity2, this.c, bitmap2, bitmap32, orientation2, r132, o8Var2, measuredWidth2, measuredHeight2, cropState2, this.r0, this.a, c7Var2, dcVar2);
        this.v1 = rbVar3;
        o8 o8Var52 = this.K1;
        rbVar3.setHasAudio(o8Var52 == null && o8Var52.y != null);
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
        this.v1.setOnDoneButtonClickedListener(new ka(this, 21));
        this.v1.setOnCancelButtonClickedListener(new ka(this, 22));
        rb rbVar22 = this.v1;
        rbVar22.R0.setVisibility(0);
        rbVar22.O0.setVisibility(0);
        rbVar22.P0.setVisibility(0);
    }

    public final void v(boolean z10) {
        h7 h7Var = this.C0;
        if (h7Var != null) {
            h7Var.f = null;
            Utilities.globalQueue.cancelRunnable(h7Var.h);
            this.C0 = null;
            cc ccVar = this.A0;
            if (ccVar != null) {
                ccVar.c.b(null);
            }
        }
        w7 w7Var = this.D0;
        if (w7Var != null) {
            w7Var.F = null;
            w7Var.G = null;
            w7Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                b0(new ka(this, 8));
                return;
            }
            b0(new ka(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            cc ccVar2 = this.A0;
            if (ccVar2 != null) {
                ccVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void w() {
        ob obVar = this.M0;
        if (obVar == null) {
            return;
        }
        this.n.removeView(obVar);
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
        jf0 jf0Var = this.B1;
        if (jf0Var == null) {
            return;
        }
        jf0Var.e();
        this.C1.setFilterView(null);
        this.r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        ye0 ye0Var = this.E1;
        if (ye0Var != null) {
            this.h0.removeView(ye0Var);
            this.E1 = null;
        }
        af0 af0Var = this.F1;
        if (af0Var != null) {
            this.h0.removeView(af0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void z() {
        rb rbVar = this.v1;
        if (rbVar == null) {
            return;
        }
        rbVar.R0.removeAllViews();
        rb rbVar2 = this.v1;
        rbVar2.O0.h();
        rbVar2.R0.setVisibility(8);
        rbVar2.Q0.setVisibility(8);
        rbVar2.E0.postRunnable(new ah.j(8));
        z5 z5Var = rbVar2.k2;
        if (z5Var != null) {
            z5Var.dismiss();
        }
        qg.x xVar = rbVar2.T1;
        if (xVar != null) {
            xVar.dismiss();
        }
        this.r.removeView(this.v1);
        this.v1 = null;
        qg.c1 c1Var = this.w1;
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
}
