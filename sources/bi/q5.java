package bi;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.le;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.es;
import org.telegram.ui.fo;
import org.telegram.ui.kc1;
import org.telegram.ui.kz;
import org.telegram.ui.vv0;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public abstract class q5 extends ow0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.c6 B0;
    public long B1;
    public a0 B2;
    public boolean B3;
    public final xa C0;
    public boolean C1;
    public int C2;
    public es C3;
    public final c4 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.e1 D3;
    public c9 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.e1 E3;
    public di.d4 F0;
    public boolean F1;
    public d4 F2;
    public final bh.b F3;
    public di.d4 G0;
    public boolean G1;
    public boolean G2;
    public final gh.a G3;
    public di.d4 H0;
    public long H1;
    public float H2;
    public final gh.d H3;
    public int I0;
    public final float I1;
    public w3 I2;
    public final eh.b I3;
    public final sb J0;
    public int J1;
    public p60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final u4 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final h3 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final p5 M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final o5 O1;
    public final org.telegram.ui.Components.g6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final c4 P0;
    public final com.google.firebase.messaging.m P1;
    public final org.telegram.ui.Components.g6 P2;
    public final r2 P3;
    public org.telegram.ui.Components.r6 Q0;
    public j5 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.r6 R0;
    public boolean R1;
    public long R2;
    public final r2 R3;
    public org.telegram.ui.Components.g6 S0;
    public x8 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.g6 T0;
    public boolean T1;
    public boolean T2;
    public final ArrayList T3;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public boolean U3;
    public boolean V0;
    public boolean V1;
    public boolean V2;
    public final androidx.activity.i V3;
    public long W0;
    public c4 W1;
    public v40 W2;
    public final org.telegram.ui.Components.g6 W3;
    public long X0;
    public a X1;
    public final vv0 X2;
    public final org.telegram.ui.Components.g6 X3;
    public boolean Y0;
    public l2 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.g6 Y3;
    public boolean Z0;
    public m2 Z1;
    public z3 Z2;
    public float Z3;
    public boolean a1;
    public g2 a2;
    public FrameLayout a3;
    public final Path a4;
    public boolean b1;
    public q3 b2;
    public f4 b3;
    public boolean b4;
    public final o4 c1;
    public kh.h c2;
    public boolean c3;
    public ValueAnimator c4;
    public final FrameLayout d1;
    public di.d4 d2;
    public s3 d3;
    public float d4;
    public final b4 e1;
    public ValueAnimator e2;
    public float e3;
    public final ImageReceiver f1;
    public gl0 f2;
    public boolean f3;
    public final ImageReceiver g1;
    public LinearLayout g2;
    public boolean g3;
    public final ArrayList h1;
    public TextView h2;
    public boolean h3;
    public Runnable i1;
    public TextView i2;
    public boolean i3;
    public final k4 j1;
    public qa j2;
    public boolean j3;
    public final kz k1;
    public ViewPropertyAnimator k2;
    public boolean k3;
    public x5 l1;
    public final dh.d l2;
    public final ImageReceiver l3;
    public float m1;
    public final dh.d m2;
    public ah.e m3;
    public final org.telegram.ui.Components.k9 n1;
    public final Paint n2;
    public final ImageReceiver n3;
    public final m5 o1;
    public int o2;
    public org.telegram.ui.Components.s5 o3;
    public final ra p1;
    public ValueAnimator p2;
    public boolean p3;
    public j6.l q1;
    public float q2;
    public boolean q3;
    public int r1;
    public float r2;
    public gl0 r3;
    public org.telegram.ui.ActionBar.e1 s1;
    public float s2;
    public boolean s3;
    public h5 t1;
    public int t2;
    public float t3;
    public TL_stories.PeerStories u1;
    public boolean u2;
    public boolean u3;
    public final ArrayList v1;
    public boolean v2;
    public float v3;
    public final ImageView w0;
    public final ArrayList w1;
    public boolean w2;
    public int w3;
    public final ImageView x0;
    public final n5 x1;
    public boolean x2;
    public int x3;
    public final i5 y0;
    public final u5 y1;
    public int y2;
    public int y3;
    public final bk0 z0;
    public ArrayList z1;
    public final int z2;
    public r2 z3;

    public q5(Context context, final sb sbVar, n5 n5Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.b1 = true;
        this.h1 = new ArrayList();
        this.r1 = -5;
        this.I1 = 1.0f;
        o5 o5Var = new o5(this);
        this.O1 = o5Var;
        this.q2 = -1.0f;
        this.r2 = -1.0f;
        this.s2 = -1.0f;
        this.z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.g6(this);
        this.P2 = new org.telegram.ui.Components.g6(this);
        vv0 vv0Var = new vv0();
        this.X2 = vv0Var;
        this.e3 = 1.0f;
        this.P3 = new r2(this, 4);
        this.R3 = new r2(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        int i10 = 8;
        this.V3 = new androidx.activity.i(this, i10);
        this.W3 = new org.telegram.ui.Components.g6(this);
        this.X3 = new org.telegram.ui.Components.g6(this);
        this.Y3 = new org.telegram.ui.Components.g6(this);
        this.a4 = new Path();
        vv0Var.E = new a4.l(this, i10);
        p5 p5Var = new p5();
        p5Var.g = new ArrayList();
        this.M2 = p5Var;
        this.N2 = new AnimationNotificationsLocker();
        this.v1 = new ArrayList();
        this.w1 = new ArrayList();
        final int i11 = 0;
        b4 b4Var = new b4(this, i11);
        this.e1 = b4Var;
        b4Var.setCrossfadeWithOldImage(false);
        b4Var.setAllowLoadingOnAttachedOnly(true);
        b4Var.ignoreNotifications = true;
        b4Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.l3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.n3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.g1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        b4Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.n1 = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.J0 = sbVar;
        this.x1 = n5Var;
        this.P1 = n5Var.g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        n5Var.l.setColor(-16777216);
        this.n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = c6Var;
        setClipChildren(false);
        k4 k4Var = new k4(this, context, this.c1, c6Var, sbVar);
        this.j1 = k4Var;
        eh.b bVar = new eh.b(c6Var, org.telegram.ui.ActionBar.g6.Sd, 0.8f);
        this.I3 = bVar;
        gh.c cVar = new gh.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.H3 = null;
            this.G3 = cVar;
        } else {
            gh.d dVar = new gh.d(cVar);
            this.H3 = dVar;
            dVar.h(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        }
        ih.j jVar = new ih.j(this);
        bh.b bVar2 = new bh.b(this.G3);
        bVar2.f = jVar;
        bVar2.g = this;
        this.F3 = bVar2;
        this.l2 = bVar2.c(this, bVar, false);
        dh.d c10 = bVar2.c(this, bVar, false);
        this.m2 = c10;
        c10.u(AndroidUtilities.dp(32.0f));
        o4 o4Var = new o4(this, context, n5Var, sbVar);
        this.c1 = o4Var;
        o4Var.setClipChildren(false);
        this.k1 = new kz(this.C2, o4Var);
        o4Var.addView(k4Var, w7.z5.d(-1.0f, -1));
        u4 u4Var = new u4(this, getContext(), sbVar.y, sbVar, c6Var);
        this.K0 = u4Var;
        u4Var.b0.setOnClickListener(new t2(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(n5Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new t2(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.b6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(n5Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        c4 c4Var = new c4(this, getContext(), 1);
        this.P0 = c4Var;
        org.telegram.ui.Components.r6 r6Var = this.R0;
        if (r6Var != null) {
            r6Var.setCallback(c4Var);
        }
        c4Var.setWillNotDraw(false);
        c4Var.setOnClickListener(new t2(this, 12));
        c4 c4Var2 = new c4(this, getContext(), 2);
        this.D0 = c4Var2;
        org.telegram.ui.Components.r6 r6Var2 = this.Q0;
        if (r6Var2 != null) {
            r6Var2.setCallback(c4Var2);
        }
        c4Var2.setWillNotDraw(false);
        c4Var2.setOnClickListener(new t2(this, 13));
        c4Var2.setOnLongClickListener(new g3(i11, this, sbVar));
        c9 c9Var = new c9(context, n5Var);
        this.E0 = c9Var;
        c9Var.setPadding(dp, dp, dp, dp);
        c4Var2.addView(this.E0, w7.z5.e(40, 40, 3));
        c4Var.addView(imageView2, w7.z5.e(40, 40, 3));
        w7.b6.b(c4Var2, 0.3f, 5.0f);
        w7.b6.b(c4Var, 0.3f, 5.0f);
        b4Var.setAllowLoadingOnAttachedOnly(true);
        b4Var.setParentView(o4Var);
        u5 u5Var = new u5(10);
        this.y1 = u5Var;
        o4Var.setOutlineProvider(u5Var);
        o4Var.setClipToOutline(true);
        addView(o4Var);
        m5 m5Var = new m5(context, o5Var);
        this.o1 = m5Var;
        m5Var.setOnClickListener(new View.OnClickListener(this) { // from class: bi.o2
            public final /* synthetic */ q5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        q5 q5Var = this.b;
                        long j10 = UserConfig.getInstance(q5Var.C2).clientUserId;
                        long j11 = q5Var.B1;
                        sb sbVar2 = sbVar;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                sbVar2.H(fo.W9(j11));
                                break;
                            } else {
                                sbVar2.H(ProfileActivity.m4(j11));
                                break;
                            }
                        } else {
                            Bundle f7 = org.telegram.ui.Cells.c1.f(1, TeXSymbolParser.TYPE_ATTR);
                            f7.putLong("dialog_id", q5Var.B1);
                            sbVar2.H(new cb0(f7, null));
                            break;
                        }
                    default:
                        q5 q5Var2 = this.b;
                        if (!q5Var2.O1.j()) {
                            q5Var2.c1(true);
                            break;
                        } else {
                            sbVar.O();
                            if (!sb.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            q5Var2.y0.setContentDescription(LocaleController.getString(!sb.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        o4Var.addView(m5Var, w7.z5.a(-2.0f, 0.0f, 17.0f, 0.0f, 0.0f, -1, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.z5.q(40, 40, 5));
        linearLayout.addView(c4Var, w7.z5.q(40, 40, 5));
        linearLayout.addView(c4Var2, w7.z5.q(40, 40, 5));
        addView(linearLayout, w7.z5.a(-2.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5));
        ImageView imageView3 = new ImageView(context);
        this.w0 = imageView3;
        imageView3.setImageDrawable(n5Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.g0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        o4Var.addView(imageView3, w7.z5.a(40.0f, 2.0f, 15.0f, 2.0f, 0.0f, 40, 53));
        ImageView imageView4 = new ImageView(context);
        this.x0 = imageView4;
        imageView4.setImageDrawable(n5Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.g0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        o4Var.addView(imageView4, w7.z5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 40, 53));
        imageView4.setOnClickListener(new ah.g0(sbVar, 3));
        imageView3.setOnClickListener(new l0(this, c6Var, sbVar, context, n5Var, 1));
        i5 i5Var = new i5(context, 0);
        this.y0 = i5Var;
        o4Var.addView(i5Var, w7.z5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 40, 53));
        bk0 bk0Var = new bk0(context);
        this.z0 = bk0Var;
        bk0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        i5Var.addView(bk0Var);
        ImageView imageView5 = new ImageView(context);
        this.A0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(n5Var.t);
        i5Var.addView(imageView5);
        imageView5.setVisibility(8);
        xa xaVar = new xa(context);
        this.C0 = xaVar;
        xaVar.setOnClickListener(new t2(this, 2));
        o4Var.addView(xaVar, w7.z5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 60, 53));
        final int i12 = 1;
        i5Var.setOnClickListener(new View.OnClickListener(this) { // from class: bi.o2
            public final /* synthetic */ q5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        q5 q5Var = this.b;
                        long j10 = UserConfig.getInstance(q5Var.C2).clientUserId;
                        long j11 = q5Var.B1;
                        sb sbVar2 = sbVar;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                sbVar2.H(fo.W9(j11));
                                break;
                            } else {
                                sbVar2.H(ProfileActivity.m4(j11));
                                break;
                            }
                        } else {
                            Bundle f7 = org.telegram.ui.Cells.c1.f(1, TeXSymbolParser.TYPE_ATTR);
                            f7.putLong("dialog_id", q5Var.B1);
                            sbVar2.H(new cb0(f7, null));
                            break;
                        }
                    default:
                        q5 q5Var2 = this.b;
                        if (!q5Var2.O1.j()) {
                            q5Var2.c1(true);
                            break;
                        } else {
                            sbVar.O();
                            if (!sb.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            q5Var2.y0.setContentDescription(LocaleController.getString(!sb.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.p1 = new ra(this, n5Var);
        o4Var.addView(u4Var, w7.z5.a(-1.0f, 0.0f, 64.0f, 0.0f, 0.0f, -1, 0));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        h3 h3Var = new h3(this, context, sbVar, sbVar.v, view, frameLayout, sbVar);
        this.L0 = h3Var;
        o4Var.addView(view, w7.z5.e(-1, 200, 87));
        o4Var.addView(h3Var, w7.z5.a(-1.0f, 0.0f, 64.0f, 0.0f, 0.0f, -1, 0));
        o4Var.addView(frameLayout, w7.z5.a(100.0f, 0.0f, 55.0f, 0.0f, 0.0f, -1, 0));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        i5Var.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.j0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.j0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        c4Var2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        c4Var.setBackground(org.telegram.ui.ActionBar.g6.j0(dp7, dp7, dp7, dp7, 0, k15, k15));
        org.telegram.ui.Cells.y9 y9Var = u4Var.W;
        View n10 = y9Var.n(context);
        if (n10 != null) {
            AndroidUtilities.removeFromParent(n10);
            addView(n10);
        }
        y9Var.D = new i3(this, 0);
        y9Var.S(this);
    }

    public static void V0(w8 w8Var, ImageReceiver imageReceiver, String str) {
        if (w8Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(w8Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(w8Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(q5 q5Var, ValueAnimator valueAnimator) {
        xa xaVar = q5Var.C0;
        q5Var.d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m5 m5Var = q5Var.o1;
        m5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var.d4);
        m5Var.setAlpha(1.0f - q5Var.d4);
        ImageView imageView = q5Var.w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var.d4);
        imageView.setAlpha(1.0f - q5Var.d4);
        ImageView imageView2 = q5Var.x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var.d4);
        imageView2.setAlpha(1.0f - q5Var.d4);
        i5 i5Var = q5Var.y0;
        i5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var.d4);
        i5Var.setAlpha((1.0f - q5Var.d4) * q5Var.e3);
        c4 c4Var = q5Var.W1;
        if (c4Var != null) {
            c4Var.setTranslationY(AndroidUtilities.dp(8.0f) * q5Var.d4);
            q5Var.W1.setAlpha(1.0f - q5Var.d4);
        }
        if (xaVar != null) {
            xaVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var.d4);
            xaVar.setAlpha(1.0f - q5Var.d4);
        }
        q5Var.K0.setAlpha(1.0f - q5Var.d4);
        j5 j5Var = q5Var.Q1;
        float f7 = j5Var == null ? 0.0f : ((jb) j5Var).d.V;
        float hideInterfaceAlpha = q5Var.getHideInterfaceAlpha();
        c4 c4Var2 = q5Var.D0;
        if (c4Var2 != null) {
            c4Var2.setAlpha((1.0f - q5Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = q5Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - q5Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        c4 c4Var3 = q5Var.P0;
        if (c4Var3 != null) {
            c4Var3.setAlpha((1.0f - q5Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        q3 q3Var = q5Var.b2;
        if (q3Var != null) {
            q3Var.setAlpha(1.0f - q5Var.d4);
            q5Var.invalidate();
        }
        q5Var.c1.invalidate();
    }

    public static void a0(q5 q5Var, boolean z10) {
        org.telegram.ui.ActionBar.e1 e1Var = q5Var.D3;
        if (e1Var == null || q5Var.C3 == null || e1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(sb.B1 - 0.2f) < 0.05f) {
                q5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(sb.B1 - 0.5f) < 0.05f) {
                q5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(sb.B1 - 1.0f) < 0.05f) {
                q5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(sb.B1 - 1.5f) < 0.05f) {
                q5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(sb.B1 - 2.0f) < 0.05f) {
                q5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                q5Var.D3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, gd.a(sb.B1) + "x"));
            }
        }
        q5Var.C3.a(sb.B1, z10);
    }

    public static void b0(q5 q5Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (q5Var.I0() || q5Var.O1.f) {
            return;
        }
        if (UserConfig.getInstance(q5Var.C2).isPremium()) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, q5Var.B0).setOnClickListener(new t2(q5Var, 8));
            return;
        }
        Drawable drawable = q5Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        j3 j3Var = new j3(q5Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, q5Var.B0);
        c10.setOnClickListener(new t2(q5Var, 9));
        c10.setIcon(j3Var);
    }

    public static void d0(q5 q5Var) {
        o5 o5Var = q5Var.O1;
        TL_stories.StoryItem storyItem = o5Var.a;
        if ((storyItem == null && o5Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = o5Var.h();
        boolean z10 = o5Var.e;
        if (h == null || !h.exists()) {
            q5Var.a1();
            return;
        }
        MediaController.saveFile(h.toString(), q5Var.getContext(), z10 ? 1 : 0, null, null, new y2(0, q5Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(q5 q5Var, long j10) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(j10));
            str = user.first_name;
            z10 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-j10));
            str = chat2.title;
            z10 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new x2(q5Var, MessagesController.getInstance(q5Var.C2), j10, !z10, str, chat), 200L);
    }

    public static void f0(q5 q5Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q5Var.getContext(), 0, q5Var.B0);
        alertDialog$Builder.a.R = LocaleController.getString(q5Var.I0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.T = LocaleController.getString(q5Var.I0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new n2(q5Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new w2(0));
        jb jbVar = (jb) q5Var.Q1;
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        jbVar.h(a2Var);
        a2Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f7 = 1.0f - this.O2.c;
        e7 e7Var = this.J0.w;
        return (1.0f - (e7Var == null ? 0.0f : e7Var.f)) * f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        sb sbVar;
        if (!this.O1.f || (sbVar = this.J0) == null || sbVar.A0 == null || D0(true)) {
            return 0L;
        }
        return sbVar.A0.j();
    }

    public static void h0(q5 q5Var) {
        org.telegram.ui.ActionBar.c6 c6Var = q5Var.B0;
        o4 o4Var = q5Var.c1;
        if (q5Var.G1) {
            return;
        }
        int i10 = 0;
        if (!q5Var.E1) {
            q3 q3Var = q5Var.b2;
            int i11 = -q5Var.r1;
            q5Var.r1 = i11;
            AndroidUtilities.shakeViewSpring(q3Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = q5Var.B1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1))) : "";
            (MessagesController.getInstance(q5Var.C2).premiumFeaturesBlocked() ? new zc(o4Var, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new zc(o4Var, c6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new r2(q5Var, 5))).j();
            return;
        }
        if (q5Var.J3 != null && q5Var.K3 != null) {
            sg.j0.D1(new o3(q5Var, i10), q5Var.J3, q5Var.K3, q5Var.B1, true);
            return;
        }
        sb sbVar = q5Var.J0;
        if (sbVar != null) {
            sbVar.k1 = true;
            sbVar.P();
        }
        MessagesController.getInstance(q5Var.C2).getBoostsController().getBoostsStats(q5Var.B1, new u2(q5Var, i10));
    }

    public static void j0(q5 q5Var) {
        o5 o5Var = q5Var.O1;
        if (o5Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = o5Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(q5Var.C2).getInputPeer(q5Var.B1);
        ConnectionsManager.getInstance(q5Var.C2).sendRequest(tL_stories_exportStoryLink, new a4());
    }

    public final void A0() {
        if (this.b3 != null) {
            return;
        }
        f4 f4Var = new f4(getContext(), 0);
        this.b3 = f4Var;
        f4Var.setTextSize(1, 14.0f);
        this.b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.b3.setGravity(19);
        this.b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.b3, w7.z5.a(40.0f, 16.0f, 0.0f, 16.0f, 0.0f, -2, 3));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        c4 c4Var = new c4(this, getContext(), 0);
        this.W1 = c4Var;
        c4Var.setClickable(true);
        addView(this.W1, w7.z5.a(48.0f, 0.0f, 0.0f, 136.0f, 0.0f, -1, 48));
        d4 d4Var = new d4(this, getContext());
        this.F2 = d4Var;
        d4Var.setOnClickListener(new t2(this, 0));
        this.W1.addView(this.F2, w7.z5.a(32.0f, 9.0f, 11.0f, 0.0f, 0.0f, -1, 0));
        a0 a0Var = new a0(0, getContext(), false);
        this.B2 = a0Var;
        a0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.z5.a(28.0f, 13.0f, 13.0f, 0.0f, 0.0f, -1, 0));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.z5.a(-2.0f, 0.0f, 16.0f, 0.0f, 9.0f, -2, 0));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.x1.s);
        d4 d4Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        d4Var2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.N(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.a3 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.StoryUnsupported));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        TextView textView2 = new TextView(getContext());
        w7.b6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.g6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, k10, k10));
        textView2.setOnClickListener(new t2(this, 3));
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        linearLayout.addView(textView2, w7.z5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.z5.a(-2.0f, 72.0f, 0.0f, 72.0f, 0.0f, -1, 17));
        this.c1.addView(frameLayout);
        this.a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        t1 t1Var;
        TLRPC.Peer i10;
        t1 t1Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        long j10 = this.B1;
        sb sbVar = this.J0;
        if (j10 >= 0 || (t1Var2 = sbVar.A0) == null) {
            if (j10 < 0 || sbVar == null || (t1Var = sbVar.A0) == null || !t1Var.l()) {
                return false;
            }
            return !z10 || (i10 = sbVar.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i11 = t1Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
        if (sbVar.A0.l() || ChatObject.canManageCalls(chat)) {
            return i11 == null || this.B1 == DialogObject.getPeerDialogId(i11) || DialogObject.getPeerDialogId(i11) == UserConfig.getInstance(this.C2).getClientUserId();
        }
        return false;
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        p5 p5Var = this.M2;
        org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) p5Var.e;
        if (n4Var != null && ((SurfaceView) p5Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) p5Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (n4Var != null && (textureView = (TextureView) p5Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        o4 o4Var = this.c1;
        canvas.scale(i10 / o4Var.getMeasuredWidth(), i11 / o4Var.getMeasuredHeight());
        this.e1.draw(canvas);
        canvas.restore();
    }

    public final void F0(di.ca caVar, TL_stories.StoryItem storyItem) {
        j5 j5Var = this.Q1;
        di.ea eaVar = new di.ea(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.B0);
        eaVar.r1(caVar);
        di.h1 h1Var = eaVar.b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof di.x9) {
                    ((di.x9) view).e(false);
                }
            }
        }
        eaVar.l1(true);
        eaVar.T = new ah.h0(2, this, storyItem);
        ((jb) j5Var).h(eaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r3 == r10.f2) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G0(ViewGroup viewGroup, float f7, float f10, boolean z10) {
        di.d4 d4Var;
        p5 p5Var;
        org.telegram.ui.n4 n4Var;
        if (viewGroup != null) {
            di.d4 d4Var2 = this.F0;
            if ((d4Var2 == null || !d4Var2.V) && ((d4Var = this.G0) == null || !d4Var.V)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        u4 u4Var = this.K0;
                        if (childAt == u4Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f7, (int) f10)) {
                                float top = f10 - childAt.getTop();
                                ga gaVar = u4Var.b0;
                                if (gaVar.w == 1.0f && !u4Var.s0) {
                                    if (top > gaVar.getTranslationY() + (u4Var.r0.getTop() - u4Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.c1 || (p5Var = this.M2) == null || (n4Var = (org.telegram.ui.n4) p5Var.e) == null || !G0(n4Var, f7 - childAt.getX(), f10 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f7, (int) f10))) {
                            k4 k4Var = this.j1;
                            if (childAt == k4Var && k4Var.b == null && (f7 < AndroidUtilities.dp(60.0f) || f7 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = k4Var.e;
                                float[] fArr = k4Var.f;
                                for (int i11 = 0; i11 < k4Var.getChildCount(); i11++) {
                                    View childAt2 = k4Var.getChildAt(i11);
                                    if (childAt2 != k4Var.d && (childAt2 instanceof za)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f7;
                                        fArr[1] = f10;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                h3 h3Var = this.L0;
                                if (childAt == h3Var) {
                                    kc1 kc1Var = h3Var.f;
                                    o0 o0Var = h3Var.c;
                                    kc1 kc1Var2 = h3Var.f;
                                    kc1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f7 - h3Var.getX()) - kc1Var2.getX()), (int) ((f10 - h3Var.getY()) - kc1Var2.getY()))) {
                                        if (h3Var.f0) {
                                            continue;
                                        } else if (!this.v2) {
                                            if (f10 <= h3Var.s() + h3Var.getY() && o0Var.E(f7, (f10 - h3Var.getY()) - o0Var.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.v2) {
                                        if (childAt == this.b2 && f10 > rect2.top) {
                                        }
                                    }
                                    if (!z10) {
                                        if (rect2.contains((int) f7, (int) f10)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            q3 q3Var = this.b2;
                                            if (q3Var != null && childAt == q3Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && G0((ViewGroup) childAt, f7 - childAt.getX(), f10 - childAt.getY(), z10)) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        o4 o4Var = this.c1;
        float x11 = view.getX() + o4Var.getX() + x10;
        float y3 = view.getY() + o4Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ((float) view.getHeight());
    }

    public final boolean I0() {
        o8 o8Var;
        sb sbVar = this.J0;
        return (sbVar == null || (o8Var = sbVar.O0) == null || o8Var.e != 4) ? false : true;
    }

    public final boolean J0() {
        TLRPC.User user;
        return I0() && (user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.J0.O0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean K0();

    public final void L0(ah.i1 i1Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        o5 o5Var = this.O1;
        TL_stories.StoryItem storyItem = o5Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && i1Var == null) {
            l0();
            this.S1.g0(this.B1, o5Var.a, null);
        } else if (i1Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = ah.d1.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.q3 = true;
                this.S1.g0(this.B1, o5Var.a, ah.i1.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, o5Var.a, i1Var);
        }
        TL_stories.StoryItem storyItem2 = o5Var.a;
        c4 c4Var = this.D0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.E0.setReaction(null);
            c4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.E0.setReaction(ah.i1.d(reaction));
            c4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.D1 && z11) {
            TL_stories.StoryItem storyItem3 = o5Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = o5Var.a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = o5Var.a;
        ah.l1.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        t1 t1Var;
        if (this.O3 != null) {
            return;
        }
        sb sbVar = this.J0;
        if (sbVar != null && (t1Var = sbVar.A0) != null) {
            if (t1Var.v == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.C2).getSendAsPeers(this.B1, true);
        this.O3 = sendAsPeers;
        q3 q3Var = this.b2;
        if (q3Var == null || sendAsPeers == null) {
            return;
        }
        q3Var.M1(true);
    }

    public final boolean N0() {
        q3 q3Var = this.b2;
        if (q3Var == null) {
            return false;
        }
        boolean z10 = q3Var.z2;
        if (z10) {
            q3Var.p1();
        }
        AndroidUtilities.runOnUIThread(new r2(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j10;
        u2 u2Var;
        int i10;
        long j11;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.b2.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        TLRPC.Peer i11 = this.J0.A0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.C2;
        String shortName = DialogObject.getShortName(i12, this.B1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.L3;
        u2 u2Var2 = new u2(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, (org.telegram.ui.ActionBar.c6) bVar, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        e3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j10 = j12;
            u2Var = u2Var2;
            i10 = ((org.telegram.ui.Components.b6[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.b6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j12;
            u2Var = u2Var2;
            i10 = 0;
        }
        int max = (int) Math.max(messageMinPrice, j10 <= 0 ? 100L : j10);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                j11 = messageMinPrice;
                break;
            }
            int i13 = length * 7;
            int i14 = iArr[i13];
            j11 = messageMinPrice;
            int i15 = iArr[i13 + 2];
            if (i10 <= iArr[i13 + 3] && charSequence.length() <= i15) {
                max = Math.max(max, i14);
                break;
            } else {
                length--;
                messageMinPrice = j11;
            }
        }
        final long[] jArr = {max};
        final br[] brVarArr = new br[1];
        final di.d dVar = new di.d(context, null, true);
        final e1 e1Var = new e1();
        e1Var.c = clientUserId;
        e1Var.f = textWithEntities;
        e1Var.g = jArr[0];
        final z0 z0Var = new z0(i12, context, true);
        LinearLayout e = sk.e(context, 0);
        final ah.x xVar = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        e.addView(xVar, w7.z5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final ah.x xVar2 = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        e.addView(xVar2, w7.z5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final ah.x xVar3 = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        e.addView(xVar3, w7.z5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final y yVar = new y(context, bVar, r6);
        final boolean[] zArr = {true};
        u2 u2Var3 = u2Var;
        long j13 = j11;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() { // from class: bi.w
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(zh.p7.W0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), brVarArr), true, true);
                long j14 = jArr2[0];
                e1 e1Var2 = e1Var;
                e1Var2.g = j14;
                z0Var.set(e1Var2);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = z.b(i16, intValue2, 0);
                int b11 = z.b(i16, num.intValue(), 1);
                int b12 = z.b(i16, num.intValue(), 2);
                ((org.telegram.ui.Components.s6) xVar.b).c(b10 >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.s6) xVar2.b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.s6) xVar3.b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = z.b(i16, num.intValue(), 3);
                int b14 = z.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                yVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        z0Var.set(e1Var);
        int i16 = 9;
        int[] iArr2 = {1, 50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000};
        int i17 = MessagesController.getInstance(i12).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i18 = 0;
        while (true) {
            if (i18 >= i16) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i18] >= j13) {
                if (i18 > 0 && arrayList.isEmpty() && iArr3[i18] > j13) {
                    arrayList.add(Integer.valueOf((int) j13));
                }
                int i19 = iArr3[i18];
                if (i19 <= i17) {
                    arrayList.add(Integer.valueOf(i19));
                    if (iArr3[i18] == i17) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i17));
                    break;
                }
            }
            i18++;
            iArr2 = iArr3;
            i16 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) i2.d.h(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        yVar.e0 = iArr4;
        yVar.setValue((int) jArr[0]);
        linearLayout.addView(yVar, w7.z5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(e, w7.z5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.g6.j5;
        TextView b10 = w7.d6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.z5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        sk.r(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.z5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(z0Var, w7.z5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, w7.z5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        e3Var.show();
        dVar.setOnClickListener(new x(u2Var3, jArr, e3Var, 0));
    }

    public final void P0() {
        if (this.b2 == null) {
            return;
        }
        t0();
        this.I2.j0.f0();
        this.I2.N1(-1, true);
        w3 w3Var = this.I2;
        w3Var.Z = this.B1;
        w3Var.t1();
        this.I2.o1().setText(this.b2.getFieldText());
        ((jb) this.Q1).h(this.I2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j10 = this.B1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.C2).getDialog(this.B1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.J0.H(new fo(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(long j10) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        long j11;
        di.j4 j4Var;
        t1 t1Var;
        boolean z10 = this.K1;
        p5 p5Var = this.M2;
        if (!z10) {
            p5Var.e = null;
            return;
        }
        o5 o5Var = this.O1;
        boolean z11 = o5Var.f;
        o4 o4Var = this.c1;
        if (!z11) {
            if (!o5Var.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): null, not a video");
                ((jb) this.Q1).c(null, null, 0L, this.M2);
                p5Var.e = null;
                p5Var.a = false;
                return;
            }
            if (o5Var.f() == null || !new File(o5Var.f()).exists()) {
                TL_stories.StoryItem storyItem = o5Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.B1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = o5Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.C2).getFileReference(o5Var.a);
                            }
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(this.C2);
                            sb2.append("&id=");
                            sb2.append(document2.id);
                            sb2.append("&hash=");
                            sb2.append(document2.access_hash);
                            sb2.append("&dc=");
                            sb2.append(document2.dc_id);
                            sb2.append("&size=");
                            sb2.append(document2.size);
                            sb2.append("&mime=");
                            sb2.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                            sb2.append("&rid=");
                            sb2.append(o5Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(o5Var.a.id);
                            sb2.append("&did=");
                            sb2.append(o5Var.a.dialogId);
                            Uri parse = Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb2.toString());
                            FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from " + parse);
                            this.R2 = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((jb) this.Q1).c(document, uri, j10, this.M2);
                            o4Var.invalidate();
                            return;
                        }
                    } catch (Exception unused2) {
                        document2 = null;
                    }
                } else {
                    document = null;
                    uri = null;
                }
            } else {
                Uri fromFile = Uri.fromFile(new File(o5Var.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from attachPath " + fromFile);
                this.R2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): playing from null?");
            }
            ((jb) this.Q1).c(document, uri, j10, this.M2);
            o4Var.invalidate();
            return;
        }
        j5 j5Var = this.Q1;
        TL_stories.StoryItem storyItem3 = o5Var.a;
        long j12 = this.B1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        jb jbVar = (jb) j5Var;
        jbVar.i(true, true);
        sb sbVar = jbVar.d;
        t1 t1Var2 = sbVar.A0;
        if (t1Var2 == null || t1Var2.b != j12 || !t1Var2.f(inputGroupCall)) {
            di.j4 j4Var2 = sbVar.D0;
            if (j4Var2 != null) {
                j4Var2.d(j12, null);
                di.j4 j4Var3 = sbVar.D0;
                SurfaceViewRenderer surfaceViewRenderer = j4Var3.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = j4Var3.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                j4Var3.r = false;
                j4Var3.e(false, false);
            }
            b2 b2Var = b2.Z;
            if (b2Var.S && (t1Var = b2Var.v) != null && t1Var.f(inputGroupCall)) {
                t1 t1Var3 = b2Var.v;
                b2Var.v = null;
                sbVar.A0 = t1Var3;
                b2Var.k(false);
            } else {
                t1 t1Var4 = sbVar.A0;
                if (t1Var4 != null) {
                    if (!t1Var4.n && (!b2Var.S || b2Var.v != t1Var4)) {
                        t1Var4.e();
                    } else if (t1Var4.O != sbVar.D0.getSink()) {
                        sbVar.A0.s(null);
                    }
                    sbVar.A0 = null;
                }
            }
            if (b2Var.S) {
                b2.j();
            }
            rb rbVar = sbVar.z0;
            if (rbVar != null) {
                rbVar.release(null);
                sbVar.z0 = null;
            }
            p5 p5Var2 = sbVar.G0;
            if (p5Var2 != null) {
                p5Var2.c = null;
                p5Var2.b = null;
                p5Var2.a = false;
                p5Var2.e = null;
                p5Var2.f = null;
                p5Var2.d = null;
                p5Var2.b();
                sbVar.G0 = null;
            }
            if (sbVar.A0 == null) {
                t1 t1Var5 = t1.W;
                if (t1Var5 == null || !t1Var5.f(inputGroupCall)) {
                    t1 t1Var6 = new t1(jbVar.c, sbVar.h, storyItem3, j12, i10, z12, inputGroupCall, false, false);
                    j11 = j12;
                    sbVar.A0 = t1Var6;
                    j4Var = sbVar.E0;
                    if (j4Var == null) {
                        sbVar.A0.s(j4Var.getSink());
                    } else {
                        sbVar.A0.s(sbVar.D0.getSink());
                    }
                    sbVar.G0 = p5Var;
                    p5Var.a = false;
                    p5Var.e = sbVar.y0;
                    di.j4 j4Var4 = sbVar.D0;
                    p5Var.f = j4Var4.d;
                    p5Var.d = j4Var4.c;
                    p5Var.b = sbVar.A0;
                    j4Var4.d(j11, p5Var);
                    sbVar.G0.b();
                } else {
                    sbVar.A0 = t1.W;
                }
            }
            j11 = j12;
            j4Var = sbVar.E0;
            if (j4Var == null) {
            }
            sbVar.G0 = p5Var;
            p5Var.a = false;
            p5Var.e = sbVar.y0;
            di.j4 j4Var42 = sbVar.D0;
            p5Var.f = j4Var42.d;
            p5Var.d = j4Var42.c;
            p5Var.b = sbVar.A0;
            j4Var42.d(j11, p5Var);
            sbVar.G0.b();
        }
        o4Var.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(Uri uri) {
        TL_stories.StoryItem storyItem;
        Uri parse;
        String str;
        boolean z10;
        String str2;
        if (uri == null || (storyItem = this.O1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String uri2 = uri.toString();
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                String str3 = uri2.split("/1/")[1];
                int indexOf = str3.indexOf("/ACTUAL");
                parse = indexOf != -1 ? Uri.parse(URLDecoder.decode(str3.substring(0, indexOf), "UTF-8")) : uri;
            } catch (Exception e) {
                FileLog.e(e);
            }
            String path = AndroidUtilities.getPath(parse);
            if (BuildVars.NO_SCOPED_STORAGE) {
                str2 = path;
                z10 = true;
                str = str2;
            } else if (path == null) {
                String uri3 = parse.toString();
                String copyFileToCache = MediaController.copyFileToCache(parse, "file");
                if (copyFileToCache == null) {
                    Z0();
                    return;
                } else {
                    str = uri3;
                    z10 = false;
                    str2 = copyFileToCache;
                }
            } else {
                str = path;
                z10 = false;
                str2 = str;
            }
            if (z10) {
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), str2, str, null, null, null, this.B1, null, null, storyItem, null, null, true, 0, null, null, false);
                return;
            } else {
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), null, null, parse, null, null, this.B1, null, null, storyItem, null, null, true, 0, null, null, false);
                return;
            }
        }
        parse = uri;
        String path2 = AndroidUtilities.getPath(parse);
        if (BuildVars.NO_SCOPED_STORAGE) {
        }
        if (z10) {
        }
    }

    public final void T0(long j10, boolean z10) {
        if (this.K1 != z10) {
            this.K1 = z10;
            bk0 bk0Var = this.z0;
            if (z10) {
                if (this.J0.a && Build.VERSION.SDK_INT < 33) {
                    sb sbVar = ((jb) this.Q1).d;
                    sbVar.l1 = true;
                    sbVar.P();
                    androidx.activity.i iVar = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 100L);
                }
                R0(j10);
                g1();
                bk0Var.setAnimation(this.x1.u);
                this.K1 = true;
                this.o1.a.getImageReceiver().setVisible(true, true);
                o5 o5Var = this.O1;
                if (o5Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + o5Var.a.id + " " + o5.c(o5Var));
                }
            } else {
                p0();
                bk0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.c1.invalidate();
                invalidate();
                q0();
                sb sbVar2 = ((jb) this.Q1).d;
                sbVar2.I0 = false;
                sbVar2.P();
            }
            this.e1.setFileLoadingPriority(this.K1 ? 3 : 2);
            this.f1.setFileLoadingPriority(this.K1 ? 2 : 0);
            this.g1.setFileLoadingPriority(this.K1 ? 2 : 0);
            if (this.C1 || this.D1) {
                x8 x8Var = this.S1;
                long j11 = this.B1;
                boolean z11 = this.K1;
                a0.h hVar = x8Var.m;
                bc bcVar = (bc) hVar.f(j11);
                if (bcVar == null) {
                    bcVar = new bc(x8Var.a, j11, x8Var);
                    hVar.k(bcVar, j11);
                }
                bcVar.b(z11);
            }
        }
    }

    public final void U0(int i10, long j10) {
        if (this.B1 != j10) {
            o5 o5Var = this.O1;
            o5Var.b = null;
            o5Var.a = null;
        }
        this.B1 = j10;
        this.z1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        x8 x8Var = this.S1;
        TL_stories.PeerStories y3 = x8Var.y(j10);
        if (y3 == null) {
            y3 = x8Var.z(j10);
        } else {
            z10 = false;
        }
        x8Var.S(y3, z10);
    }

    public final void W0(long j10, boolean z10, boolean z11) {
        if (!z10 && j10 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j10;
        this.N3 = z11;
        m5 m5Var = this.o1;
        if (j10 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j10));
            l5 l5Var = m5Var.b;
            l5 l5Var2 = m5Var.b;
            l5Var.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                l5Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            cr crVar = new cr(mutate, null);
            crVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            crVar.h = dp;
            crVar.n = dp2;
            l5Var2.i(crVar);
            return;
        }
        if (this.C1 && !z11) {
            m5Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            m5Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j10));
        if (user == null || !user.verified) {
            m5Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            cr crVar2 = new cr(mutate2, null);
            crVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            crVar2.h = dp3;
            crVar2.n = dp4;
            m5Var.b.i(crVar2);
        }
        if (user != null) {
            m5Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), m5Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            m5Var.b.l(null, false);
        }
    }

    public final void X0(float f7, float f10, x5 x5Var) {
        this.m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 == x5Var) {
            return;
        }
        this.l1 = x5Var;
        if (x5Var != null) {
            ImageReceiver imageReceiver = x5Var.a;
            if (imageReceiver.getBitmap() != null) {
                this.e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void Y0(boolean z10) {
        o5 o5Var = this.O1;
        if (o5Var.a != null) {
            sb sbVar = this.J0;
            if (sbVar.f != null) {
                String e = o5Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e);
                    LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                z3 z3Var = new z3(this, sbVar.f.getContext(), e, e, MessagesController.getInstance(this.C2).storiesEnabled() && (!(this.D1 || UserObject.isService(this.B1)) || ChatObject.isPublic(this.D1 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null)), new n3(2, this.B0));
                this.Z2 = z3Var;
                z3Var.i0 = true;
                TL_stories.StoryItem storyItem = o5Var.a;
                storyItem.dialogId = this.B1;
                z3Var.F0 = storyItem;
                z3Var.s0 = new a6.m(this, 7);
                ((jb) this.Q1).h(z3Var);
            }
        }
    }

    public final void Z0() {
        o4 o4Var = this.c1;
        org.telegram.ui.ActionBar.c6 c6Var = this.B0;
        sk.q(R.string.UnsupportedAttachment, new zc(o4Var, c6Var), c6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.T = string;
        ((jb) this.Q1).h(a2Var);
    }

    public final void b1(boolean z10) {
        if (this.s3 != z10) {
            o5 o5Var = this.O1;
            if (o5Var.a == null) {
                return;
            }
            this.s3 = z10;
            int i10 = 0;
            if (z10) {
                this.r3.setVisibility(0);
            }
            this.r3.setStoryItem(o5Var.a);
            sb sbVar = ((jb) this.Q1).d;
            sbVar.p1 = z10;
            sbVar.P();
            if (!z10) {
                if (this.r3.getReactionsWindow() != null) {
                    this.r3.getReactionsWindow().e();
                }
                this.r3.animate().alpha(0.0f).setDuration(150L).setListener(new l3(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t3, z10 ? 1.0f : 0.0f);
            this.r3.setTransitionProgress(this.t3);
            ofFloat.addUpdateListener(new s2(this, 1));
            ofFloat.addListener(new k3(this, z10, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(org.telegram.ui.Components.es.g);
            ofFloat.start();
        }
    }

    public final void c1(boolean z10) {
        if (this.G0 == null) {
            di.d4 d4Var = new di.d4(getContext(), 1);
            d4Var.l(1.0f, -56.0f);
            this.G0 = d4Var;
            d4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.c1.addView(this.G0, w7.z5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 55));
        }
        this.G0.s(LocaleController.getString(z10 ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.G0.u();
    }

    public final boolean d1(boolean z10) {
        if (this.J0.R0) {
            z10 = !z10;
        }
        if (!z10) {
            int i10 = this.J1;
            if (i10 > 0) {
                this.J1 = i10 - 1;
                f1(false);
                return true;
            }
        } else if (this.J1 < getStoriesCount() - 1) {
            this.J1++;
            f1(false);
            return true;
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t1 t1Var;
        int i12 = NotificationCenter.storiesUpdated;
        sb sbVar = this.J0;
        boolean z10 = false;
        if (i10 == i12 || (i10 == NotificationCenter.storiesListUpdated && sbVar.O0 == objArr[0])) {
            j5 j5Var = this.Q1;
            if (j5Var == null || !((jb) j5Var).d.H0) {
                if (this.K1) {
                    j1();
                    if (this.A1 == 0) {
                        if (this.E2) {
                            return;
                        }
                        this.E2 = true;
                        ((jb) this.Q1).j();
                        return;
                    }
                    int i13 = this.J1;
                    ArrayList arrayList = this.v1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.w1;
                    if (i13 >= arrayList2.size() + size) {
                        this.J1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    f1(false);
                    if (this.C1 || this.D1) {
                        k1(true);
                    }
                }
                TL_stories.PeerStories peerStories = sbVar.Q0;
                if (peerStories != null) {
                    this.S1.S(peerStories, true);
                } else {
                    long j10 = this.B1;
                    if (j10 != 0) {
                        x8 x8Var = this.S1;
                        TL_stories.PeerStories y3 = x8Var.y(j10);
                        if (y3 == null) {
                            y3 = x8Var.z(j10);
                            z10 = true;
                        }
                        x8Var.S(y3, z10);
                    }
                }
                org.telegram.ui.ActionBar.e1 e1Var = this.s1;
                if (e1Var != null) {
                    e1Var.animate().alpha((this.S1.K(this.B1) && this.O1.e && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storyQualityUpdate) {
            f1(false);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            this.K0.b0.invalidate();
            return;
        }
        if (i10 == NotificationCenter.stealthModeChanged) {
            r0(true);
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            q8 o10 = MessagesController.getInstance(this.C2).getStoriesController().o();
            if (o10 == null || !o10.a(this.C2, 1) || this.Q1 == null) {
                return;
            }
            o3 o3Var = new o3(this, 0);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            ((jb) this.Q1).h(new sg.j0(o10.b(), this.C2, findActivity, o3Var, null));
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            boolean z11 = this.B1 >= 0 && !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            if (this.F1 == z11 && this.H1 == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                return;
            }
            this.F1 = z11;
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            f1(false);
            r0(true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.B1 == (-((TLRPC.ChatFull) obj).id)) {
                f1(false);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.liveStoryUpdated) {
            if (i10 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                M0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (sbVar == null || (t1Var = sbVar.A0) == null || t1Var.g() != longValue) {
            return;
        }
        f1(false);
        q3 q3Var = this.b2;
        if (q3Var != null) {
            q3Var.I(true);
            this.b2.M1(true);
            r0(true);
        }
        h3 h3Var = this.L0;
        if (h3Var != null) {
            t1 t1Var2 = h3Var.P;
            if (h3Var.H != (t1Var2 != null ? t1Var2.j() : 0L)) {
                h3Var.e.N(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        le leVar;
        Canvas canvas2;
        org.telegram.ui.Components.r6 r6Var;
        org.telegram.ui.Components.r6 r6Var2;
        l1();
        if (this.D1 && (r6Var2 = this.Q0) != null) {
            r6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (r6Var = this.R0) != null) {
            r6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.u3;
        LinearLayout linearLayout = this.O0;
        c4 c4Var = this.D0;
        if (z10) {
            float measuredWidth = (c4Var.getMeasuredWidth() / 2.0f) + c4Var.getX() + linearLayout.getX();
            float measuredHeight = (c4Var.getMeasuredHeight() / 2.0f) + c4Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.w3, measuredWidth - f7, org.telegram.ui.Components.es.g.getInterpolation(this.v3));
            float lerp2 = AndroidUtilities.lerp(this.x3, measuredHeight - f7, this.v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.v3);
            if (this.p3) {
                org.telegram.ui.Components.s5 s5Var = this.o3;
                if (s5Var != null) {
                    float f10 = lerp3;
                    s5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.o3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.n3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.q3) {
            float measuredWidth2 = (c4Var.getMeasuredWidth() / 2.0f) + c4Var.getX() + linearLayout.getX();
            float measuredHeight2 = (c4Var.getMeasuredHeight() / 2.0f) + c4Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (this.p3) {
                ah.e eVar = this.m3;
                if (eVar != null) {
                    float f12 = dp2 / 2.0f;
                    eVar.e((int) (measuredWidth2 - f12), (int) (measuredHeight2 - f12), (int) (measuredWidth2 + f12), (int) (measuredHeight2 + f12));
                    this.m3.b(canvas);
                    if (this.m3.c()) {
                        this.m3.d(this);
                        this.m3 = null;
                        this.q3 = false;
                    }
                } else {
                    this.q3 = false;
                }
            } else {
                float f13 = dp2;
                float f14 = f13 / 2.0f;
                float f15 = measuredWidth2 - f14;
                float f16 = measuredHeight2 - f14;
                ImageReceiver imageReceiver2 = this.l3;
                imageReceiver2.setImageCoords(f15, f16, f13, f13);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().A()) {
                    this.q3 = false;
                }
            }
        }
        q3 q3Var = this.b2;
        if (q3Var != null) {
            ne neVar = q3Var.y1;
            le leVar2 = q3Var.z1;
            if (q3Var.getAlpha() == 0.0f || (leVar = q3Var.e1) == null || leVar.getParent() == null || q3Var.e1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(q3Var.e1.getX() + neVar.getX() + leVar2.getX() + q3Var.getX(), q3Var.e1.getY() + neVar.getY() + leVar2.getY() + q3Var.getY());
            if (q3Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, q3Var.getMeasuredWidth(), q3Var.getMeasuredHeight(), (int) (q3Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            q3Var.e1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gh.d dVar;
        float dp;
        if (view == this.d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.d3.getY(), getMeasuredWidth(), this.d3.getY() + this.d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        q3 q3Var = this.b2;
        Paint paint = this.n2;
        c4 c4Var = this.D0;
        n5 n5Var = this.x1;
        if (view == q3Var) {
            float f7 = this.q2;
            o5 o5Var = this.O1;
            if (f7 > 0.0f && !o5Var.f) {
                n5Var.l.setAlpha((int) (f7 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), n5Var.l);
            }
            RectF rectF = n5Var.h;
            RectF rectF2 = n5Var.i;
            RectF rectF3 = n5Var.j;
            rectF.set(this.b2.getX(), this.b2.getY() + this.b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.b2.getX() + this.b2.getMeasuredWidth(), this.b2.getY() + this.b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (o5Var.f) {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                g2 g2Var = this.a2;
                if (g2Var != null && g2Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (c4Var != null && c4Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + c4Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.b2.setTranslationX((1.0f - this.q2) * dp);
            this.b2.getEditField().setTranslationY(com.google.android.gms.internal.play_billing.k3.y(1.0f, this.q2, -AndroidUtilities.dp(2.0f), this.b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.q2) * (this.b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, n5Var.h, this.q2, rectF3);
            dh.d dVar2 = this.l2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.q(dp3);
                dVar2.setAlpha((int) ((1.0f - this.d4) * (1.0f - this.r2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.q2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (q3Var != null && q3Var.s0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = n5Var.k;
                RectF rectF5 = n5Var.k;
                rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.a4;
                path.rewind();
                path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                dh.d dVar3 = this.m2;
                if (dVar3 != null) {
                    dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    dVar3.r(dp4, dp4, dp4, dp4);
                    dVar3.setAlpha(255);
                    dVar3.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, dp4, dp4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.f2 || this.b2 == null) {
                if (view == this.r3) {
                    view.setTranslationY((this.O0.getY() + (c4Var.getY() + (-(r2.getMeasuredHeight() - this.r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    o4 o4Var = this.c1;
                    if (view == o4Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(o4Var.getX(), o4Var.getY());
                        view.draw(a2);
                        dVar.c();
                    }
                }
            } else {
                view.setTranslationY(((this.b2.getY() + this.b2.getAnimatedTop()) + (-r2.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        if (MessagesController.getInstance(this.C2).storiesEnabled()) {
            File h = this.O1.h();
            if (h == null || !h.exists()) {
                a1();
                return;
            }
            z3 z3Var = this.Z2;
            if (z3Var != null) {
                z3Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new r2(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0946, code lost:
    
        if (r4.g == (r1 == null && r1.translated && r1.translatedText != null && android.text.TextUtils.equals(r1.translatedLng, org.telegram.ui.Components.x41.D()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x09a6, code lost:
    
        if (r2 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x09cb, code lost:
    
        if (r3 != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0ade, code lost:
    
        if (r6 != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0af6, code lost:
    
        if (r6 != false) goto L557;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b64  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0bd4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0c96  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0cd4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0d02  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d7c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d8d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0da5 A[EDGE_INSN: B:312:0x0da5->B:313:0x0da5 BREAK  A[LOOP:0: B:301:0x0d83->B:310:0x0da2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0db3  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0dc2  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0e57  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0e86  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0f20  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0f51  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0f60  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0f86  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0fa7  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0fd7  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0ff3  */
    /* JADX WARN: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0fc7  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0ed0  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e60  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0e28  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0e0e  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0d36  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0927  */
    /* JADX WARN: Type inference failed for: r6v190 */
    /* JADX WARN: Type inference failed for: r6v191, types: [bi.ca, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v192 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z10) {
        w8 w8Var;
        TL_stories.StoryItem storyItem;
        w8 w8Var2;
        kz kzVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        b4 b4Var;
        TL_stories.StoryItem storyItem2;
        sb sbVar;
        pb pbVar;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        boolean z14;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z15;
        TL_stories.StoryItem storyItem4;
        w8 w8Var3;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem5;
        di.k8 k8Var;
        TL_stories.StoryItem storyItem6;
        w8 w8Var4;
        int i12;
        di.k8 k8Var2;
        t1 t1Var;
        boolean z16;
        o4 o4Var;
        u4 u4Var;
        m5 m5Var;
        q3 q3Var;
        boolean z17;
        boolean z18;
        w8 w8Var5;
        sc scVar;
        boolean z19;
        TL_stories.StoryItem storyItem7;
        boolean z20;
        int i13;
        boolean z21;
        w8 w8Var6;
        boolean z22;
        b4 b4Var2;
        o4 o4Var2;
        u4 u4Var2;
        m5 m5Var2;
        boolean z23;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        int i14;
        TLRPC.MessageMedia messageMedia2;
        boolean z24;
        di.d4 d4Var;
        di.d4 d4Var2;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem10;
        j5 j5Var;
        boolean z25;
        boolean z26;
        LinearLayout linearLayout;
        boolean z27;
        boolean z28;
        q3 q3Var2;
        q3 q3Var3;
        int i15;
        boolean z29;
        boolean z30;
        boolean z31;
        int i16;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        kh.h hVar;
        a aVar;
        g2 g2Var;
        boolean z36;
        TL_stories.StoryItem storyItem11;
        boolean z37;
        int i17;
        int i18;
        boolean z38;
        boolean z39;
        boolean l4;
        w8 w8Var7;
        w8 w8Var8;
        di.d4 d4Var3;
        int i19;
        ImageView imageView;
        ImageView imageView2;
        boolean z40;
        int i20;
        boolean z41;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i21;
        int i22;
        int i23;
        boolean z42;
        int i24;
        boolean z43;
        boolean z44;
        TL_stories.StoryItem storyItem13;
        int i25;
        int i26;
        FrameLayout.LayoutParams layoutParams;
        int dp;
        boolean z45;
        boolean z46;
        int i27;
        boolean z47;
        t1 t1Var2;
        int i28;
        boolean z48;
        int i29;
        boolean z49;
        int i30;
        boolean z50;
        boolean z51;
        boolean z52;
        boolean z53;
        t1 t1Var3;
        String str;
        BitmapDrawable bitmapDrawable;
        kz kzVar2;
        sb sbVar2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        o8 o8Var;
        ArrayList arrayList2 = this.v1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.w1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.V2 = true;
        o5 o5Var = this.O1;
        TL_stories.StoryItem storyItem14 = o5Var.a;
        w8 w8Var9 = o5Var.b;
        String s10 = s9.s();
        this.Z0 = false;
        this.c3 = false;
        int i31 = this.J1;
        boolean z54 = this.T1;
        boolean z55 = this.U1;
        boolean z56 = this.V1;
        sb sbVar3 = this.J0;
        if (sbVar3 == null || (o8Var = sbVar3.O0) == null || o8Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i31 < 0 || i31 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i31);
            int size = i31 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            w8Var = (size < 0 || size >= arrayList3.size()) ? null : (w8) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            w8Var = (i31 < 0 || i31 >= arrayList3.size()) ? null : (w8) arrayList3.get(i31);
            int size2 = i31 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        o5Var.c = null;
        k4 k4Var = this.j1;
        kz kzVar3 = this.k1;
        b4 b4Var3 = this.e1;
        if (w8Var != null) {
            di.k8 k8Var3 = w8Var.c;
            this.U1 = false;
            boolean z57 = w8Var.I;
            this.V1 = z57;
            this.T1 = !z57;
            b4Var3.setCrossfadeWithOldImage(false);
            b4Var3.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = k8Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (w8Var.s || w8Var.H) {
                BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                b4Var = b4Var3;
                w8Var2 = w8Var9;
                kzVar2 = kzVar3;
                z11 = z54;
                z12 = z55;
                z13 = z56;
                sbVar2 = sbVar3;
                i10 = i31;
                r62 = 0;
                i11 = 4;
                b4Var.setImage(null, null, ImageLocation.getForPath(w8Var.f), s10, null, null, bitmapDrawable2, 0L, null, null, 0);
            } else {
                BitmapDrawable bitmapDrawable3 = bitmapDrawable;
                b4Var = b4Var3;
                w8Var2 = w8Var9;
                r62 = 0;
                kzVar2 = kzVar3;
                z11 = z54;
                z13 = z56;
                z12 = z55;
                i11 = 4;
                sbVar2 = sbVar3;
                i10 = i31;
                b4Var.setImage(null, null, ImageLocation.getForPath(w8Var.e), s10, null, null, bitmapDrawable3, 0L, null, null, 0);
            }
            o5Var.b = w8Var;
            o5Var.j = r62;
            o5Var.i = r62;
            o5Var.a = r62;
            o5Var.d = false;
            o5Var.e = o5Var.m();
            TL_stories.StoryItem storyItem17 = o5Var.a;
            o5Var.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            kzVar = kzVar2;
            k4Var.c(r62, wa.a(k8Var3), kzVar);
            this.U2 = false;
            this.T2 = false;
            this.S2 = false;
            sb sbVar4 = sbVar2;
            storyItem2 = storyItem14;
            sbVar = sbVar4;
        } else {
            w8Var2 = w8Var9;
            kzVar = kzVar3;
            z11 = z54;
            z12 = z55;
            z13 = z56;
            i10 = i31;
            i11 = 4;
            b4Var = b4Var3;
            this.T1 = false;
            this.U1 = false;
            this.V1 = false;
            if (storyItem == null) {
                if (sbVar3 != null) {
                    sbVar3.q(true);
                    return;
                }
                return;
            }
            w8 t10 = this.S1.t(this.B1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.U1 = true;
                b4Var.setCrossfadeWithOldImage(false);
                b4Var.setCrossfadeDuration(this.i1 == null ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : 0);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    sbVar = sbVar3;
                    w8Var3 = t10;
                    b4Var.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    sbVar = sbVar3;
                    w8Var3 = t10;
                    b4Var.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                }
                o5Var.b = w8Var3;
                o5Var.j = null;
                o5Var.i = null;
                o5Var.a = null;
                o5Var.d = false;
                o5Var.e = o5Var.m();
                TL_stories.StoryItem storyItem18 = o5Var.a;
                o5Var.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                k4Var.c(null, wa.a(w8Var3.c), kzVar);
                o5Var.c = storyItem;
                this.U2 = false;
                this.T2 = false;
                this.S2 = false;
            } else {
                storyItem2 = storyItem14;
                sbVar = sbVar3;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.B1;
                b4Var.setCrossfadeWithOldImage(z12);
                b4Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.c3 = true;
                    MessagesController.getInstance(this.C2).getStoriesController().p(storyItem.id, this.B1);
                    storyItem3 = storyItem;
                    z14 = z12;
                } else {
                    String str3 = storyItem.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            z58 = str3.toLowerCase().endsWith(".mp4");
                        }
                        if (z58) {
                            TLRPC.MessageMedia messageMedia6 = storyItem.media;
                            Drawable createStripedBitmap = messageMedia6 != null ? ImageLoader.createStripedBitmap(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                if (ImageLoader.getInstance().isInMemCache(ImageLocation.getForPath(storyItem.firstFramePath).getKey(null, null, false) + "@" + s10, false)) {
                                    z15 = z12;
                                    b4Var.setImage(null, null, ImageLocation.getForPath(storyItem.firstFramePath), s10, null, null, createStripedBitmap, 0L, null, null, 0);
                                }
                            }
                            z15 = z12;
                            b4Var.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), t8.b.u(s10, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
                        } else {
                            z15 = z12;
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            Drawable createStripedBitmap2 = photo != null ? ImageLoader.createStripedBitmap(photo.sizes) : null;
                            if (z15) {
                                b4Var.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, ImageLocation.getForPath(storyItem.firstFramePath), s10, createStripedBitmap2, 0L, null, null, 0);
                            } else {
                                b4Var.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, null, null, createStripedBitmap2, 0L, null, null, 0);
                            }
                        }
                        storyItem3 = storyItem;
                        z14 = z15;
                    } else {
                        Drawable drawable = ((sbVar.O0 != null || sbVar.N0) && (pbVar = sbVar.s0) != null && (imageReceiver = pbVar.c) != null && pbVar.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.B1;
                        if (z58) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String u10 = t8.b.u(s10, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            TL_stories.StoryItem storyItem19 = storyItem;
                            z14 = z12;
                            b4Var.setImage(null, null, forDocument, u10, forDocument2, s10, drawable, 0L, null, storyItem19, 0);
                            storyItem3 = storyItem19;
                        } else {
                            storyItem3 = storyItem;
                            z14 = z12;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                b4Var.clearImage();
                            } else {
                                if (drawable == null) {
                                    drawable = ImageLoader.createStripedBitmap(arrayList);
                                }
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 800);
                                b4Var.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2), s10, null, null, drawable, 0L, null, storyItem3, 0);
                            }
                        }
                    }
                }
                storyItem3.dialogId = this.B1;
                k4Var.d(z10 ? null : storyItem3, kzVar);
                o5Var.n(storyItem3);
                boolean z59 = (this.c3 || (storyItem4 = o5Var.a) == null || (storyItem4 instanceof TL_stories.TL_storyItemDeleted) || (storyItem4 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.U2 = z59;
                this.S2 = z59;
                if (z59) {
                    this.S2 = o5Var.d() && o5Var.a.isPublic;
                }
                if (this.S2) {
                    TL_stories.StoryItem storyItem20 = o5Var.a;
                    this.S2 = storyItem20.pinned || !s9.w(this.C2, storyItem20);
                }
                boolean z60 = this.S2;
                this.T2 = z60;
                if (z60 && this.D1) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    this.T2 = chat != null && ChatObject.isPublic(chat);
                }
                if (this.U2) {
                    if (this.D1) {
                        TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                        this.U2 = (chat2 == null || ChatObject.getPublicUsername(chat2) == null) ? false : true;
                    } else {
                        TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
                        this.U2 = (user == null || UserObject.getPublicUsername(user) == null || !o5Var.a.isPublic) ? false : true;
                    }
                }
                NotificationsController.getInstance(this.C2).processReadStories(this.B1, storyItem3.id);
                storyItem5 = o5Var.a;
                if (storyItem5 != null && !z10) {
                    sbVar.P0 = storyItem5.id;
                }
                sbVar.n0.A();
                this.Y2 = true;
                if (!this.C1 || this.D1) {
                    k1(false);
                }
                TL_stories.StoryItem storyItem21 = o5Var.a;
                w8 w8Var10 = o5Var.b;
                int i32 = storyItem21 == null ? storyItem21.id : (w8Var10 == null || (k8Var = w8Var10.c) == null) ? 0 : k8Var.f;
                if (storyItem2 == null) {
                    storyItem6 = storyItem2;
                    i12 = storyItem6.id;
                    w8Var4 = w8Var2;
                } else {
                    storyItem6 = storyItem2;
                    w8Var4 = w8Var2;
                    i12 = (w8Var2 == null || (k8Var2 = w8Var4.c) == null) ? 0 : k8Var2.f;
                }
                boolean z61 = (i32 == i12 && (w8Var4 == null || storyItem21 == null || !TextUtils.equals(w8Var4.e, storyItem21.attachPath))) ? false : true;
                boolean z62 = (z61 || (this.U1 == z14 && this.T1 == z11 && this.V1 == z13)) ? false : true;
                t1Var = sbVar.A0;
                if (t1Var != null) {
                    int i33 = this.Q3;
                    TLRPC.GroupCall groupCall = t1Var.v;
                    if (i33 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                        z16 = true;
                        o4Var = this.c1;
                        u4Var = this.K0;
                        m5Var = this.o1;
                        if ((w8Var4 != null || (str = w8Var4.e) == null || !str.equals(o5Var.f())) && (storyItem6 == null || (storyItem7 = o5Var.a) == null || storyItem6.id != storyItem7.id)) {
                            q3Var = this.b2;
                            if (q3Var != null) {
                                if (storyItem6 != null && !TextUtils.isEmpty(q3Var.getEditField().getText())) {
                                    sb.J(storyItem6.dialogId, storyItem6, this.b2.getEditField().getText());
                                }
                                this.b2.getEditField().setText(sb.u(this.B1, o5Var.a));
                                z19 = o5Var.f;
                                if (z19) {
                                    z17 = false;
                                    this.b2.S0(false, false, false);
                                } else {
                                    z17 = false;
                                    this.b2.S0(true, true, false);
                                }
                            } else {
                                z17 = false;
                            }
                            z18 = o5Var.f;
                            if (z18) {
                                M0();
                            }
                            kzVar.c();
                            this.W0 = 0L;
                            this.Y0 = z17;
                            w8Var5 = o5Var.b;
                            if (w8Var5 != null) {
                                ck0 ck0Var = m5Var.d;
                                if (ck0Var != null) {
                                    ck0Var.e(w8Var5.h, z17);
                                }
                                m5Var.a.invalidate();
                            } else if (!z62) {
                                m5Var.h = 0.0f;
                            }
                            scVar = sc.w;
                            if (scVar != null && scVar.h == o4Var) {
                                scVar.b();
                            }
                            u4Var.J();
                            q0();
                            z16 = true;
                        }
                        if (!z16 || (w8Var4 != null && o5Var.b == null)) {
                            m5Var.setOnSubtitleClick(null);
                            TextView[] textViewArr = m5Var.c;
                            this.Q3 = 0;
                            z20 = z61;
                            i13 = 2;
                            long j10 = this.B1;
                            boolean z63 = z62;
                            z21 = o5Var.f;
                            W0(j10, false, z21);
                            w8Var6 = o5Var.b;
                            if (w8Var6 != null) {
                                charSequence3 = w8Var6.I ? LocaleController.getString(R.string.FailedToUploadStory) : s9.u(textViewArr[0], this.U1);
                            } else {
                                if (I0()) {
                                    TL_stories.StoryItem storyItem22 = o5Var.a;
                                    if (storyItem22 != null && (messageMedia2 = storyItem22.media) != null) {
                                        if (messageMedia2.document != null) {
                                            charSequence3 = LocaleController.formatStoryDate(r13.date);
                                        } else {
                                            if (messageMedia2.photo != null) {
                                                charSequence3 = LocaleController.formatStoryDate(r1.date);
                                            }
                                        }
                                    }
                                    z22 = z16;
                                    b4Var2 = b4Var;
                                    o4Var2 = o4Var;
                                    u4Var2 = u4Var;
                                    m5Var2 = m5Var;
                                    z23 = z63;
                                    charSequence = "";
                                } else {
                                    TL_stories.StoryItem storyItem23 = o5Var.a;
                                    if (storyItem23 == null) {
                                        z22 = z16;
                                        b4Var2 = b4Var;
                                        o4Var2 = o4Var;
                                        u4Var2 = u4Var;
                                        m5Var2 = m5Var;
                                        z23 = z63;
                                        charSequence = null;
                                    } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                                        spannableStringBuilder.setSpan(new e4(), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        t1 t1Var4 = sbVar.A0;
                                        if (t1Var4 != null) {
                                            TLRPC.GroupCall groupCall2 = t1Var4.v;
                                            i14 = 1;
                                            this.Q3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                                        } else {
                                            i14 = 1;
                                        }
                                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i14, this.Q3)));
                                        charSequence3 = spannableStringBuilder;
                                    } else if (storyItem23.date == -1) {
                                        charSequence3 = LocaleController.getString(R.string.CachedStory);
                                    } else {
                                        if (o5Var.i() != null) {
                                            ca i34 = o5Var.i();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            z22 = z16;
                                            b4Var2 = b4Var;
                                            SpannableString spannableString = new SpannableString("r");
                                            o4Var2 = o4Var;
                                            u4Var2 = u4Var;
                                            spannableString.setSpan(new br(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) spannableString).append((CharSequence) " ");
                                            if (i34.b != null) {
                                                org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(textViewArr[0], 15.0f, this.C2);
                                                SpannableString spannableString2 = new SpannableString("a");
                                                spannableString2.setSpan(k5Var, 0, 1, 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                                if (i34.b.longValue() > 0) {
                                                    TLRPC.User user2 = MessagesController.getInstance(this.C2).getUser(i34.b);
                                                    k5Var.e(user2);
                                                    spannableStringBuilder2.append((CharSequence) UserObject.getUserName(user2));
                                                } else {
                                                    TLRPC.Chat chat3 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-i34.b.longValue()));
                                                    k5Var.b(chat3);
                                                    if (chat3 != null) {
                                                        spannableStringBuilder2.append((CharSequence) chat3.title);
                                                    }
                                                }
                                            } else {
                                                String str4 = o5Var.a.fwd_from.from_name;
                                                if (str4 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str4);
                                                }
                                            }
                                            m5Var.setOnSubtitleClick(new u1(1, this, i34));
                                            SpannableString spannableString3 = new SpannableString(".");
                                            pt ptVar = new pt();
                                            ptVar.b = AndroidUtilities.dp(1.5f);
                                            ptVar.c = 5.0f;
                                            spannableString3.setSpan(ptVar, 0, spannableString3.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(o5Var.a.date));
                                            m5Var2 = m5Var;
                                            charSequence = spannableStringBuilder2;
                                        } else {
                                            z22 = z16;
                                            b4Var2 = b4Var;
                                            o4Var2 = o4Var;
                                            u4Var2 = u4Var;
                                            if (!this.E1 || (storyItem8 = o5Var.a) == null || storyItem8.from_id == null) {
                                                m5Var2 = m5Var;
                                                String formatStoryDate = LocaleController.formatStoryDate(o5Var.a.date);
                                                charSequence2 = formatStoryDate;
                                                if (o5Var.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                                    pt ptVar2 = new pt();
                                                    ptVar2.b = AndroidUtilities.dp(1.5f);
                                                    ptVar2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(ptVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                                    valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                                    charSequence2 = valueOf;
                                                }
                                                charSequence = charSequence2;
                                                z23 = z63;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(textViewArr[0], 15.0f, this.C2);
                                                SpannableString spannableString4 = new SpannableString("a");
                                                spannableString4.setSpan(k5Var2, 0, 1, 33);
                                                spannableStringBuilder3.append((CharSequence) spannableString4).append((CharSequence) " ");
                                                long peerDialogId = DialogObject.getPeerDialogId(o5Var.a.from_id);
                                                if (peerDialogId > 0) {
                                                    TLRPC.User user3 = MessagesController.getInstance(this.C2).getUser(Long.valueOf(peerDialogId));
                                                    k5Var2.e(user3);
                                                    spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user3));
                                                    m5Var2 = m5Var;
                                                } else {
                                                    m5Var2 = m5Var;
                                                    TLRPC.Chat chat4 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-peerDialogId));
                                                    k5Var2.b(chat4);
                                                    if (chat4 != null) {
                                                        spannableStringBuilder3.append((CharSequence) chat4.title);
                                                    }
                                                }
                                                m5Var2.setOnSubtitleClick(new p2(this, peerDialogId, 0));
                                                SpannableString spannableString5 = new SpannableString(".");
                                                pt ptVar3 = new pt();
                                                ptVar3.b = AndroidUtilities.dp(1.5f);
                                                ptVar3.c = 5.0f;
                                                spannableString5.setSpan(ptVar3, 0, spannableString5.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(o5Var.a.date));
                                                charSequence = spannableStringBuilder3;
                                            }
                                        }
                                        z23 = false;
                                    }
                                }
                                if (charSequence == null) {
                                    o8 o8Var2 = sbVar.O0;
                                    if (o8Var2 == null || (storyItem9 = o5Var.a) == null || !o8Var2.m(storyItem9.id)) {
                                        z24 = false;
                                    } else {
                                        if (!(charSequence instanceof SpannableStringBuilder)) {
                                            charSequence = new SpannableStringBuilder(charSequence);
                                        }
                                        SpannableString spannableString6 = new SpannableString("p ");
                                        z24 = false;
                                        spannableString6.setSpan(new br(R.drawable.msg_pin_mini), 0, 1, 33);
                                        ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString6);
                                    }
                                    m5Var2.c(charSequence, z23);
                                } else {
                                    z24 = false;
                                }
                                d4Var = this.F0;
                                if (d4Var != null) {
                                    d4Var.e(z24);
                                }
                                d4Var2 = this.G0;
                                if (d4Var2 != null) {
                                    d4Var2.e(z24);
                                }
                            }
                            z22 = z16;
                            b4Var2 = b4Var;
                            o4Var2 = o4Var;
                            u4Var2 = u4Var;
                            m5Var2 = m5Var;
                            charSequence2 = charSequence3;
                            charSequence = charSequence2;
                            z23 = z63;
                            if (charSequence == null) {
                            }
                            d4Var = this.F0;
                            if (d4Var != null) {
                            }
                            d4Var2 = this.G0;
                            if (d4Var2 != null) {
                            }
                        } else {
                            z20 = z61;
                            z22 = z16;
                            b4Var2 = b4Var;
                            o4Var2 = o4Var;
                            u4Var2 = u4Var;
                            m5Var2 = m5Var;
                            i13 = 2;
                        }
                        storyItem10 = o5Var.a;
                        if (storyItem6 == storyItem10 && w8Var4 == o5Var.b) {
                        }
                        o5Var.o();
                        if ((!o5Var.g || storyItem6 != o5Var.a) && (j5Var = this.Q1) != null) {
                            sb sbVar5 = ((jb) j5Var).d;
                            sbVar5.Z0 = false;
                            sbVar5.P();
                        }
                        z25 = o5Var.f;
                        z26 = !z25 && (t1Var3 = sbVar.A0) != null && o5Var.k(t1Var3.g()) && sbVar.A0.b();
                        if (z26 != this.G1) {
                            this.G1 = z26;
                            if (z26) {
                                z0();
                            }
                            if (this.g2 != null && (this.F1 || this.G1)) {
                                h1();
                            }
                            q3 q3Var4 = this.b2;
                            if (q3Var4 != null) {
                                if (this.F1) {
                                    z53 = o5Var.f;
                                }
                                if (!this.G1) {
                                    z52 = true;
                                    q3Var4.setEnabled(z52);
                                    z51 = true;
                                    this.b2.M1(true);
                                }
                                z52 = false;
                                q3Var4.setEnabled(z52);
                                z51 = true;
                                this.b2.M1(true);
                            } else {
                                z51 = true;
                            }
                            r0(z51);
                        }
                        linearLayout = this.g2;
                        if (linearLayout != null) {
                            if (this.F1) {
                                z50 = o5Var.f;
                            }
                            if (!this.G1) {
                                i30 = 8;
                                linearLayout.setVisibility(i30);
                            }
                            i30 = 0;
                            linearLayout.setVisibility(i30);
                        }
                        z27 = this.c3;
                        LinearLayout linearLayout2 = this.O0;
                        if (z27) {
                            C0();
                            A0();
                            this.a3.setVisibility(0);
                            this.b3.setVisibility(0);
                            this.U2 = false;
                            this.T2 = false;
                            this.S2 = false;
                            q3 q3Var5 = this.b2;
                            if (q3Var5 != null) {
                                q3Var5.setVisibility(8);
                            }
                            c4 c4Var = this.W1;
                            if (c4Var != null) {
                                c4Var.setVisibility(8);
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat chat5 = this.B1 < 0 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null;
                            z28 = o5Var.f;
                            if (z28) {
                                if (this.b2 == null) {
                                    v0();
                                }
                                u0();
                                y0();
                                x0();
                                this.b2.setVisibility(0);
                            } else if ((UserObject.isService(this.B1) || I0()) && (q3Var2 = this.b2) != null) {
                                q3Var2.setVisibility(8);
                            } else if (!this.C1 && ((!this.D1 || (this.E1 && (ChatObject.canSendPlain(chat5) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat5)))) && (q3Var3 = this.b2) != null)) {
                                q3Var3.setVisibility(0);
                            }
                            q3 q3Var6 = this.b2;
                            if (q3Var6 != null) {
                                z33 = o5Var.f;
                                q3Var6.setOnSendButtonLongClick(z33 ? new q2(this, 0) : null);
                                q3 q3Var7 = this.b2;
                                z34 = o5Var.f;
                                D0(true);
                                q3Var7.f1(z34);
                                q3 q3Var8 = this.b2;
                                z35 = o5Var.f;
                                q3Var8.l1(z35 && !D0(true) && (this.v2 || this.b2.W0), true);
                            }
                            if (this.F1 && this.g2 == null) {
                                z0();
                            }
                            if (this.g2 != null) {
                                if (this.F1 || this.G1) {
                                    h1();
                                }
                                LinearLayout linearLayout3 = this.g2;
                                if (this.F1) {
                                    z32 = o5Var.f;
                                }
                                if (!this.G1) {
                                    i16 = 8;
                                    linearLayout3.setVisibility(i16);
                                }
                                i16 = 0;
                                linearLayout3.setVisibility(i16);
                            }
                            q3 q3Var9 = this.b2;
                            if (q3Var9 != null) {
                                if (this.F1) {
                                    z31 = o5Var.f;
                                }
                                if (!this.G1) {
                                    z30 = true;
                                    q3Var9.setEnabled(z30);
                                }
                                z30 = false;
                                q3Var9.setEnabled(z30);
                            }
                            c4 c4Var2 = this.W1;
                            if (c4Var2 != null) {
                                if (this.C1) {
                                    z29 = o5Var.f;
                                    if (!z29) {
                                        i15 = 0;
                                        c4Var2.setVisibility(i15);
                                    }
                                }
                                i15 = 8;
                                c4Var2.setVisibility(i15);
                            }
                            FrameLayout frameLayout = this.a3;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (UserObject.isService(this.B1)) {
                                A0();
                                this.b3.setVisibility(0);
                            } else {
                                f4 f4Var = this.b3;
                                if (f4Var != null) {
                                    f4Var.setVisibility(8);
                                }
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(I0() ? 8 : 0);
                            }
                        }
                        hVar = this.c2;
                        if (hVar != null) {
                            q3 q3Var10 = this.b2;
                            if (q3Var10 != null && q3Var10.getVisibility() == 0) {
                                z49 = o5Var.f;
                                if (!z49) {
                                    i29 = 0;
                                    hVar.setVisibility(i29);
                                }
                            }
                            i29 = 8;
                            hVar.setVisibility(i29);
                        }
                        aVar = this.X1;
                        h3 h3Var = this.L0;
                        if (aVar != null) {
                            if (!this.c3) {
                                z48 = o5Var.f;
                                if (z48) {
                                    i28 = 0;
                                    aVar.setVisibility(i28);
                                    this.X1.a(h3Var.g(), false);
                                    this.X1.setCount(h3Var.getUnreadMessagesCount());
                                }
                            }
                            i28 = 8;
                            aVar.setVisibility(i28);
                            this.X1.a(h3Var.g(), false);
                            this.X1.setCount(h3Var.getUnreadMessagesCount());
                        }
                        g2Var = this.a2;
                        if (g2Var != null) {
                            if (!this.c3) {
                                z47 = o5Var.f;
                                if (z47 && (t1Var2 = t1.W) != null && o5Var.k(t1Var2.g())) {
                                    i27 = 0;
                                    g2Var.setVisibility(i27);
                                    g2 g2Var2 = this.a2;
                                    t1 t1Var5 = t1.W;
                                    g2Var2.b(t1Var5 == null && t1Var5.o(), true);
                                    g2 g2Var3 = this.a2;
                                    t1 t1Var6 = t1.W;
                                    g2Var3.a(t1Var6 != null || t1Var6.m(), true);
                                }
                            }
                            i27 = 8;
                            g2Var.setVisibility(i27);
                            g2 g2Var22 = this.a2;
                            t1 t1Var52 = t1.W;
                            g2Var22.b(t1Var52 == null && t1Var52.o(), true);
                            g2 g2Var32 = this.a2;
                            t1 t1Var62 = t1.W;
                            g2Var32.a(t1Var62 != null || t1Var62.m(), true);
                        }
                        if (this.Z1 != null) {
                            l2 l2Var = this.Y1;
                            if (!this.c3) {
                                z46 = o5Var.f;
                                if (z46) {
                                    i25 = 0;
                                    l2Var.setVisibility(i25);
                                    m2 m2Var = this.Z1;
                                    if (!this.c3) {
                                        z45 = o5Var.f;
                                        if (z45) {
                                            i26 = 0;
                                            m2Var.setVisibility(i26);
                                            layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                                            g2 g2Var4 = this.a2;
                                            dp = AndroidUtilities.dp((g2Var4 == null && g2Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                            if (layoutParams.rightMargin != dp) {
                                                layoutParams.rightMargin = dp;
                                                this.Z1.setLayoutParams(layoutParams);
                                            }
                                        }
                                    }
                                    i26 = 8;
                                    m2Var.setVisibility(i26);
                                    layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                                    g2 g2Var42 = this.a2;
                                    dp = AndroidUtilities.dp((g2Var42 == null && g2Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != dp) {
                                    }
                                }
                            }
                            i25 = 8;
                            l2Var.setVisibility(i25);
                            m2 m2Var2 = this.Z1;
                            if (!this.c3) {
                            }
                            i26 = 8;
                            m2Var2.setVisibility(i26);
                            layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                            g2 g2Var422 = this.a2;
                            dp = AndroidUtilities.dp((g2Var422 == null && g2Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != dp) {
                            }
                        }
                        z36 = o5Var.f;
                        if (!z36 || ((o5Var.h == null && o5Var.i() == null && o5Var.g() == null) || this.c3)) {
                            u4 u4Var3 = u4Var2;
                            if (this.K1) {
                                sb sbVar6 = ((jb) this.Q1).d;
                                sbVar6.L0 = false;
                                sbVar6.P();
                                j5 j5Var2 = this.Q1;
                                this.j3 = false;
                                ((jb) j5Var2).e();
                            }
                            u4Var3.setVisibility(8);
                        } else {
                            u4 u4Var4 = u4Var2;
                            u4Var4.b0.b(o5Var.h, o5Var.i(), o5Var.g(), sbVar.Z0 && !o5Var.g && (storyItem13 = o5Var.a) != null && storyItem13.translated, storyItem6 == o5Var.a);
                            u4Var4.setVisibility(0);
                        }
                        storyItem11 = o5Var.a;
                        if (storyItem11 != null) {
                            TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                            if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (h3Var.r(this.B1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                                    h3Var.q(false, false);
                                    this.L3 = 0L;
                                    q3 q3Var11 = this.b2;
                                    if (q3Var11 != null) {
                                        q3Var11.I(true);
                                        this.b2.O1();
                                        r0(true);
                                    }
                                }
                                h3Var.setVisibility(0);
                                o4Var2.invalidate();
                                if (this.Q1 != null && K0()) {
                                    ((jb) this.Q1).a(this.J1, this.B1);
                                }
                                z37 = this.D1;
                                c4 c4Var3 = this.P0;
                                ImageView imageView3 = this.N0;
                                c4 c4Var4 = this.D0;
                                if (z37) {
                                    if (this.S2) {
                                        z39 = o5Var.f;
                                        if (!z39) {
                                            i17 = 0;
                                            imageView3.setVisibility(i17);
                                            if (c4Var3 != null) {
                                                c4Var3.setVisibility(8);
                                            }
                                            if (!this.C1) {
                                                z38 = o5Var.f;
                                                if (!z38) {
                                                    i18 = 0;
                                                    c4Var4.setVisibility(i18);
                                                    c4Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                                }
                                            }
                                            i18 = 8;
                                            c4Var4.setVisibility(i18);
                                            c4Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                        }
                                    }
                                    i17 = i11;
                                    imageView3.setVisibility(i17);
                                    if (c4Var3 != null) {
                                    }
                                    if (!this.C1) {
                                    }
                                    i18 = 8;
                                    c4Var4.setVisibility(i18);
                                    c4Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                } else {
                                    if (this.S2) {
                                        z44 = o5Var.f;
                                        if (!z44) {
                                            i22 = 0;
                                            imageView3.setVisibility(i22);
                                            if (c4Var3 != null) {
                                                if (this.T2) {
                                                    z43 = o5Var.f;
                                                    if (!z43) {
                                                        i24 = 0;
                                                        c4Var3.setVisibility(i24);
                                                    }
                                                }
                                                i24 = 8;
                                                c4Var3.setVisibility(i24);
                                            }
                                            if (!this.V1) {
                                                z42 = o5Var.f;
                                                if (!z42) {
                                                    i23 = 0;
                                                    c4Var4.setVisibility(i23);
                                                }
                                            }
                                            i23 = 8;
                                            c4Var4.setVisibility(i23);
                                        }
                                    }
                                    i22 = i11;
                                    imageView3.setVisibility(i22);
                                    if (c4Var3 != null) {
                                    }
                                    if (!this.V1) {
                                    }
                                    i23 = 8;
                                    c4Var4.setVisibility(i23);
                                }
                                c4Var4.requestLayout();
                                sbVar.e1.append(this.B1, i10);
                                if (this.K1) {
                                    R0(0L);
                                    g1();
                                    b4Var2.bumpPriority();
                                }
                                h3Var.setLivePlayer(sbVar.A0);
                                this.L1 = 0;
                                if (sbVar.O0 != null && (storyItem12 = o5Var.a) != null) {
                                    int i35 = storyItem12.id;
                                    i21 = 0;
                                    while (true) {
                                        if (i21 < sbVar.O0.i.size()) {
                                            MessageObject messageObject = (MessageObject) sbVar.O0.i.get(i21);
                                            if (messageObject != null && messageObject.getId() == i35) {
                                                this.L1 = i21;
                                                break;
                                            }
                                            i21++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                int i36 = this.J1;
                                this.M1 = i36;
                                int i37 = this.A1;
                                this.N1 = i37;
                                if (sbVar.R0) {
                                    this.M1 = (i37 - 1) - i36;
                                }
                                l4 = o5Var.l();
                                i5 i5Var = this.y0;
                                if (l4) {
                                    i5Var.setVisibility(8);
                                } else {
                                    i5Var.setVisibility(0);
                                    this.e3 = o5Var.j() ? 1.0f : 0.5f;
                                    boolean j11 = o5Var.j();
                                    ImageView imageView4 = this.A0;
                                    bk0 bk0Var = this.z0;
                                    if (j11) {
                                        bk0Var.setVisibility(0);
                                        imageView4.setVisibility(8);
                                        i5Var.setContentDescription(LocaleController.getString(!sb.D1 ? R.string.Mute : R.string.Unmute));
                                    } else {
                                        bk0Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        i5Var.setContentDescription(LocaleController.getString(R.string.NoSound));
                                    }
                                    i5Var.setAlpha((1.0f - this.d4) * this.e3);
                                }
                                w8Var7 = o5Var.b;
                                xa xaVar = this.C0;
                                if (w8Var7 == null) {
                                    xaVar.a(this.C1, w8Var7, z20 && this.b4);
                                } else {
                                    TL_stories.StoryItem storyItem24 = o5Var.a;
                                    if (storyItem24 != null) {
                                        xaVar.b(this.C1, storyItem24, z20 && this.b4);
                                    } else {
                                        xaVar.b(this.C1, null, z20 && this.b4);
                                    }
                                }
                                this.b4 = false;
                                xaVar.setTranslationX(i5Var.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                                if (z22) {
                                    this.q3 = false;
                                    TL_stories.StoryItem storyItem25 = o5Var.a;
                                    if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                        this.E0.setReaction(null);
                                    } else {
                                        this.E0.setReaction(ah.i1.d(reaction));
                                    }
                                }
                                w8Var8 = o5Var.b;
                                if (w8Var8 == null && w8Var8.I) {
                                    w0();
                                    this.j2.set(o5Var.b.c.x);
                                    this.j2.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.k2;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.k2 = null;
                                    }
                                    if (z20) {
                                        ViewPropertyAnimator interpolator = this.j2.animate().alpha(1.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.es.h);
                                        this.k2 = interpolator;
                                        interpolator.start();
                                    } else {
                                        this.j2.setAlpha(1.0f);
                                    }
                                } else if (this.j2 != null) {
                                    ViewPropertyAnimator viewPropertyAnimator2 = this.k2;
                                    if (viewPropertyAnimator2 != null) {
                                        viewPropertyAnimator2.cancel();
                                        this.k2 = null;
                                    }
                                    if (z20 && this.j2.getVisibility() == 0) {
                                        ViewPropertyAnimator withEndAction = this.j2.animate().alpha(0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.es.h).withEndAction(new r2(this, 0));
                                        this.k2 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.j2.setAlpha(0.0f);
                                        this.j2.setVisibility(8);
                                    }
                                }
                                this.x1.a(sb.D1, false);
                                if (this.K1 && o5Var.a != null) {
                                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + o5Var.a.id + " " + o5.c(o5Var));
                                }
                                if (this.C1) {
                                    w6.f(this.C2, this.B1, o5Var.a);
                                }
                                l5 l5Var = m5Var2.b;
                                o8 o8Var3 = sbVar.O0;
                                l5Var.setPadding(0, 0, (o8Var3 != null || o8Var3.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                                MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(o5Var.a);
                                if (!z10 && !this.C1 && this.z3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                                    r2 r2Var = new r2(this, 1);
                                    this.z3 = r2Var;
                                    AndroidUtilities.runOnUIThread(r2Var, 500L);
                                }
                                d4Var3 = this.G0;
                                if (!(d4Var3 == null && d4Var3.V) && o5Var.j() && sb.D1) {
                                    i19 = 0;
                                    if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < i13) {
                                        AndroidUtilities.cancelRunOnUIThread(this.R3);
                                        AndroidUtilities.runOnUIThread(this.R3, 250L);
                                    }
                                } else {
                                    i19 = 0;
                                }
                                imageView = this.w0;
                                if (imageView != null) {
                                    if (I0() && !J0()) {
                                        z41 = o5Var.e;
                                        if (!z41) {
                                            i20 = 8;
                                            imageView.setVisibility(i20);
                                        }
                                    }
                                    i20 = i19;
                                    imageView.setVisibility(i20);
                                }
                                imageView2 = this.x0;
                                if (imageView2 == null) {
                                    z40 = o5Var.f;
                                    imageView2.setVisibility((!z40 || xaVar.f) ? 8 : i19);
                                    return;
                                }
                                return;
                            }
                        }
                        h3Var.r(this.B1, null);
                        h3Var.setVisibility(8);
                        o4Var2.invalidate();
                        if (this.Q1 != null) {
                            ((jb) this.Q1).a(this.J1, this.B1);
                        }
                        z37 = this.D1;
                        c4 c4Var32 = this.P0;
                        ImageView imageView32 = this.N0;
                        c4 c4Var42 = this.D0;
                        if (z37) {
                        }
                        c4Var42.requestLayout();
                        sbVar.e1.append(this.B1, i10);
                        if (this.K1) {
                        }
                        h3Var.setLivePlayer(sbVar.A0);
                        this.L1 = 0;
                        if (sbVar.O0 != null) {
                            int i352 = storyItem12.id;
                            i21 = 0;
                            while (true) {
                                if (i21 < sbVar.O0.i.size()) {
                                }
                                i21++;
                            }
                        }
                        int i362 = this.J1;
                        this.M1 = i362;
                        int i372 = this.A1;
                        this.N1 = i372;
                        if (sbVar.R0) {
                        }
                        l4 = o5Var.l();
                        i5 i5Var2 = this.y0;
                        if (l4) {
                        }
                        w8Var7 = o5Var.b;
                        xa xaVar2 = this.C0;
                        if (w8Var7 == null) {
                        }
                        this.b4 = false;
                        xaVar2.setTranslationX(i5Var2.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z22) {
                        }
                        w8Var8 = o5Var.b;
                        if (w8Var8 == null) {
                        }
                        if (this.j2 != null) {
                        }
                        this.x1.a(sb.D1, false);
                        if (this.K1) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + o5Var.a.id + " " + o5.c(o5Var));
                        }
                        if (this.C1) {
                        }
                        l5 l5Var2 = m5Var2.b;
                        o8 o8Var32 = sbVar.O0;
                        l5Var2.setPadding(0, 0, (o8Var32 != null || o8Var32.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(o5Var.a);
                        if (!z10) {
                            r2 r2Var2 = new r2(this, 1);
                            this.z3 = r2Var2;
                            AndroidUtilities.runOnUIThread(r2Var2, 500L);
                        }
                        d4Var3 = this.G0;
                        if (d4Var3 == null) {
                        }
                        i19 = 0;
                        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < i13) {
                        }
                        imageView = this.w0;
                        if (imageView != null) {
                        }
                        imageView2 = this.x0;
                        if (imageView2 == null) {
                        }
                    }
                }
                z16 = false;
                o4Var = this.c1;
                u4Var = this.K0;
                m5Var = this.o1;
                if (w8Var4 != null) {
                }
                q3Var = this.b2;
                if (q3Var != null) {
                }
                z18 = o5Var.f;
                if (z18) {
                }
                kzVar.c();
                this.W0 = 0L;
                this.Y0 = z17;
                w8Var5 = o5Var.b;
                if (w8Var5 != null) {
                }
                scVar = sc.w;
                if (scVar != null) {
                    scVar.b();
                }
                u4Var.J();
                q0();
                z16 = true;
                if (z16) {
                }
                m5Var.setOnSubtitleClick(null);
                TextView[] textViewArr2 = m5Var.c;
                this.Q3 = 0;
                z20 = z61;
                i13 = 2;
                long j102 = this.B1;
                boolean z632 = z62;
                z21 = o5Var.f;
                W0(j102, false, z21);
                w8Var6 = o5Var.b;
                if (w8Var6 != null) {
                }
                z22 = z16;
                b4Var2 = b4Var;
                o4Var2 = o4Var;
                u4Var2 = u4Var;
                m5Var2 = m5Var;
                charSequence2 = charSequence3;
                charSequence = charSequence2;
                z23 = z632;
                if (charSequence == null) {
                }
                d4Var = this.F0;
                if (d4Var != null) {
                }
                d4Var2 = this.G0;
                if (d4Var2 != null) {
                }
                storyItem10 = o5Var.a;
                if (storyItem6 == storyItem10) {
                }
                o5Var.o();
                if (!o5Var.g) {
                }
                sb sbVar52 = ((jb) j5Var).d;
                sbVar52.Z0 = false;
                sbVar52.P();
                z25 = o5Var.f;
                if (z25) {
                }
                if (z26 != this.G1) {
                }
                linearLayout = this.g2;
                if (linearLayout != null) {
                }
                z27 = this.c3;
                LinearLayout linearLayout22 = this.O0;
                if (z27) {
                }
                hVar = this.c2;
                if (hVar != null) {
                }
                aVar = this.X1;
                h3 h3Var2 = this.L0;
                if (aVar != null) {
                }
                g2Var = this.a2;
                if (g2Var != null) {
                }
                if (this.Z1 != null) {
                }
                z36 = o5Var.f;
                if (z36) {
                }
                u4 u4Var32 = u4Var2;
                if (this.K1) {
                }
                u4Var32.setVisibility(8);
                storyItem11 = o5Var.a;
                if (storyItem11 != null) {
                }
                h3Var2.r(this.B1, null);
                h3Var2.setVisibility(8);
                o4Var2.invalidate();
                if (this.Q1 != null) {
                }
                z37 = this.D1;
                c4 c4Var322 = this.P0;
                ImageView imageView322 = this.N0;
                c4 c4Var422 = this.D0;
                if (z37) {
                }
                c4Var422.requestLayout();
                sbVar.e1.append(this.B1, i10);
                if (this.K1) {
                }
                h3Var2.setLivePlayer(sbVar.A0);
                this.L1 = 0;
                if (sbVar.O0 != null) {
                }
                int i3622 = this.J1;
                this.M1 = i3622;
                int i3722 = this.A1;
                this.N1 = i3722;
                if (sbVar.R0) {
                }
                l4 = o5Var.l();
                i5 i5Var22 = this.y0;
                if (l4) {
                }
                w8Var7 = o5Var.b;
                xa xaVar22 = this.C0;
                if (w8Var7 == null) {
                }
                this.b4 = false;
                xaVar22.setTranslationX(i5Var22.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z22) {
                }
                w8Var8 = o5Var.b;
                if (w8Var8 == null) {
                }
                if (this.j2 != null) {
                }
                this.x1.a(sb.D1, false);
                if (this.K1) {
                }
                if (this.C1) {
                }
                l5 l5Var22 = m5Var2.b;
                o8 o8Var322 = sbVar.O0;
                l5Var22.setPadding(0, 0, (o8Var322 != null || o8Var322.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(o5Var.a);
                if (!z10) {
                }
                d4Var3 = this.G0;
                if (d4Var3 == null) {
                }
                i19 = 0;
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < i13) {
                }
                imageView = this.w0;
                if (imageView != null) {
                }
                imageView2 = this.x0;
                if (imageView2 == null) {
                }
            }
        }
        z14 = z12;
        storyItem5 = o5Var.a;
        if (storyItem5 != null) {
            sbVar.P0 = storyItem5.id;
        }
        sbVar.n0.A();
        this.Y2 = true;
        if (!this.C1) {
        }
        k1(false);
        TL_stories.StoryItem storyItem212 = o5Var.a;
        w8 w8Var102 = o5Var.b;
        if (storyItem212 == null) {
        }
        if (storyItem2 == null) {
        }
        if (i32 == i12) {
        }
        if (z61) {
        }
        t1Var = sbVar.A0;
        if (t1Var != null) {
        }
        z16 = false;
        o4Var = this.c1;
        u4Var = this.K0;
        m5Var = this.o1;
        if (w8Var4 != null) {
        }
        q3Var = this.b2;
        if (q3Var != null) {
        }
        z18 = o5Var.f;
        if (z18) {
        }
        kzVar.c();
        this.W0 = 0L;
        this.Y0 = z17;
        w8Var5 = o5Var.b;
        if (w8Var5 != null) {
        }
        scVar = sc.w;
        if (scVar != null) {
        }
        u4Var.J();
        q0();
        z16 = true;
        if (z16) {
        }
        m5Var.setOnSubtitleClick(null);
        TextView[] textViewArr22 = m5Var.c;
        this.Q3 = 0;
        z20 = z61;
        i13 = 2;
        long j1022 = this.B1;
        boolean z6322 = z62;
        z21 = o5Var.f;
        W0(j1022, false, z21);
        w8Var6 = o5Var.b;
        if (w8Var6 != null) {
        }
        z22 = z16;
        b4Var2 = b4Var;
        o4Var2 = o4Var;
        u4Var2 = u4Var;
        m5Var2 = m5Var;
        charSequence2 = charSequence3;
        charSequence = charSequence2;
        z23 = z6322;
        if (charSequence == null) {
        }
        d4Var = this.F0;
        if (d4Var != null) {
        }
        d4Var2 = this.G0;
        if (d4Var2 != null) {
        }
        storyItem10 = o5Var.a;
        if (storyItem6 == storyItem10) {
        }
        o5Var.o();
        if (!o5Var.g) {
        }
        sb sbVar522 = ((jb) j5Var).d;
        sbVar522.Z0 = false;
        sbVar522.P();
        z25 = o5Var.f;
        if (z25) {
        }
        if (z26 != this.G1) {
        }
        linearLayout = this.g2;
        if (linearLayout != null) {
        }
        z27 = this.c3;
        LinearLayout linearLayout222 = this.O0;
        if (z27) {
        }
        hVar = this.c2;
        if (hVar != null) {
        }
        aVar = this.X1;
        h3 h3Var22 = this.L0;
        if (aVar != null) {
        }
        g2Var = this.a2;
        if (g2Var != null) {
        }
        if (this.Z1 != null) {
        }
        z36 = o5Var.f;
        if (z36) {
        }
        u4 u4Var322 = u4Var2;
        if (this.K1) {
        }
        u4Var322.setVisibility(8);
        storyItem11 = o5Var.a;
        if (storyItem11 != null) {
        }
        h3Var22.r(this.B1, null);
        h3Var22.setVisibility(8);
        o4Var2.invalidate();
        if (this.Q1 != null) {
        }
        z37 = this.D1;
        c4 c4Var3222 = this.P0;
        ImageView imageView3222 = this.N0;
        c4 c4Var4222 = this.D0;
        if (z37) {
        }
        c4Var4222.requestLayout();
        sbVar.e1.append(this.B1, i10);
        if (this.K1) {
        }
        h3Var22.setLivePlayer(sbVar.A0);
        this.L1 = 0;
        if (sbVar.O0 != null) {
        }
        int i36222 = this.J1;
        this.M1 = i36222;
        int i37222 = this.A1;
        this.N1 = i37222;
        if (sbVar.R0) {
        }
        l4 = o5Var.l();
        i5 i5Var222 = this.y0;
        if (l4) {
        }
        w8Var7 = o5Var.b;
        xa xaVar222 = this.C0;
        if (w8Var7 == null) {
        }
        this.b4 = false;
        xaVar222.setTranslationX(i5Var222.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z22) {
        }
        w8Var8 = o5Var.b;
        if (w8Var8 == null) {
        }
        if (this.j2 != null) {
        }
        this.x1.a(sb.D1, false);
        if (this.K1) {
        }
        if (this.C1) {
        }
        l5 l5Var222 = m5Var2.b;
        o8 o8Var3222 = sbVar.O0;
        l5Var222.setPadding(0, 0, (o8Var3222 != null || o8Var3222.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(o5Var.a);
        if (!z10) {
        }
        d4Var3 = this.G0;
        if (d4Var3 == null) {
        }
        i19 = 0;
        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < i13) {
        }
        imageView = this.w0;
        if (imageView != null) {
        }
        imageView2 = this.x0;
        if (imageView2 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g1() {
        ArrayList arrayList;
        int i10;
        ImageReceiver imageReceiver;
        boolean isEmpty;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i11;
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        String k10 = a1.g.k(max, max, "_");
        ArrayList arrayList11 = this.S3;
        arrayList11.clear();
        ArrayList arrayList12 = this.T3;
        arrayList12.clear();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            arrayList = this.h1;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((ah.y0) arrayList.get(i13)).b(false);
            i13++;
        }
        arrayList.clear();
        int i14 = 0;
        while (true) {
            if (i14 >= 2) {
                break;
            }
            int i15 = this.J1;
            if (i14 == 0) {
                i10 = i15 - 1;
                imageReceiver = this.f1;
                if (i10 < 0) {
                    imageReceiver.clearImage();
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList;
                    i11 = i14;
                    arrayList7 = arrayList11;
                    i14 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                    i12 = 0;
                }
                ArrayList arrayList13 = this.w1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.v1;
                if (isEmpty && i10 >= arrayList2.size()) {
                    V0((w8) arrayList13.get(i10 - arrayList2.size()), imageReceiver, k10);
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < 0) {
                        i10 = i12;
                    }
                    if (i10 >= arrayList2.size()) {
                        i10 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i10);
                    long j10 = this.B1;
                    storyItem2.dialogId = j10;
                    w8 t10 = this.S1.t(j10, storyItem2);
                    if (t10 != null) {
                        V0(t10, imageReceiver, k10);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList;
                        i11 = i14;
                        storyItem = storyItem2;
                    } else {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        int i16 = (messageMedia == null || !MessageObject.isVideoDocument(messageMedia.getDocument())) ? i12 : 1;
                        String str = storyItem2.attachPath;
                        if (str != null) {
                            int i17 = i16;
                            if (storyItem2.media == null) {
                                i17 = str.toLowerCase().endsWith(".mp4");
                            }
                            if (i17 != 0) {
                                i11 = i14;
                                arrayList3 = arrayList11;
                                arrayList5 = arrayList;
                                arrayList4 = arrayList12;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), t8.b.u(k10, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), k10, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i14;
                                String str2 = k10;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                k10 = str2;
                            }
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i11 = i14;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (i16 != 0) {
                                storyItem = storyItem2;
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), t8.b.u(k10, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), k10, null, null, null, 0L, null, storyItem, 0);
                            } else {
                                storyItem = storyItem2;
                                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.clearImage();
                                } else {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                                    imageReceiver2.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), k10, null, null, null, 0L, null, storyItem, 0);
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (messageMedia3 != null && MessageObject.isVideoDocument(messageMedia3.getDocument())) {
                        TLRPC.Document document = storyItem.media.getDocument();
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = FileLoader.getInstance(this.C2).getFileReference(storyItem);
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("?account=");
                            sb2.append(this.C2);
                            sb2.append("&id=");
                            sb2.append(document.id);
                            sb2.append("&hash=");
                            sb2.append(document.access_hash);
                            sb2.append("&dc=");
                            sb2.append(document.dc_id);
                            sb2.append("&size=");
                            sb2.append(document.size);
                            sb2.append("&mime=");
                            sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                            sb2.append("&rid=");
                            sb2.append(storyItem.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(storyItem.id);
                            sb2.append("&did=");
                            sb2.append(storyItem.dialogId);
                            arrayList7 = arrayList3;
                            try {
                                arrayList7.add(Uri.parse("tg://" + FileLoader.getAttachFileName(document) + sb2.toString()));
                                arrayList8 = arrayList4;
                            } catch (UnsupportedEncodingException e) {
                                e = e;
                                arrayList8 = arrayList4;
                                e.printStackTrace();
                                if (storyItem.media_areas != null) {
                                }
                                arrayList9 = arrayList5;
                                i14 = i11 + 1;
                                arrayList11 = arrayList7;
                                arrayList = arrayList9;
                                arrayList12 = arrayList8;
                                i12 = 0;
                            }
                            try {
                                arrayList8.add(document);
                            } catch (UnsupportedEncodingException e7) {
                                e = e7;
                                e.printStackTrace();
                                if (storyItem.media_areas != null) {
                                }
                                arrayList9 = arrayList5;
                                i14 = i11 + 1;
                                arrayList11 = arrayList7;
                                arrayList = arrayList9;
                                arrayList12 = arrayList8;
                                i12 = 0;
                            }
                        } catch (UnsupportedEncodingException e10) {
                            e = e10;
                            arrayList7 = arrayList3;
                        }
                    } else {
                        arrayList7 = arrayList3;
                        arrayList8 = arrayList4;
                    }
                    if (storyItem.media_areas != null) {
                        int i18 = 0;
                        while (i18 < storyItem.media_areas.size()) {
                            if (storyItem.media_areas.get(i18) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i18);
                                ah.y0 y0Var = new ah.y0(this);
                                y0Var.e(ah.i1.d(tL_mediaAreaSuggestedReaction.reaction));
                                y0Var.b(this.a1);
                                arrayList10 = arrayList5;
                                arrayList10.add(y0Var);
                            } else {
                                arrayList10 = arrayList5;
                            }
                            i18++;
                            arrayList5 = arrayList10;
                        }
                    }
                    arrayList9 = arrayList5;
                    i14 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                    i12 = 0;
                }
                arrayList8 = arrayList12;
                arrayList9 = arrayList;
                i11 = i14;
                arrayList7 = arrayList11;
                i14 = i11 + 1;
                arrayList11 = arrayList7;
                arrayList = arrayList9;
                arrayList12 = arrayList8;
                i12 = 0;
            } else {
                i10 = i15 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.g1;
                if (i10 >= storiesCount) {
                    imageReceiver3.clearImage();
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList;
                    i11 = i14;
                    arrayList7 = arrayList11;
                    i14 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                    i12 = 0;
                } else {
                    imageReceiver = imageReceiver3;
                    ArrayList arrayList132 = this.w1;
                    isEmpty = arrayList132.isEmpty();
                    arrayList2 = this.v1;
                    if (isEmpty) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList;
                    i11 = i14;
                    arrayList7 = arrayList11;
                    i14 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                    i12 = 0;
                }
            }
        }
        ArrayList arrayList14 = arrayList12;
        ArrayList arrayList15 = arrayList11;
        jb jbVar = (jb) this.Q1;
        sb sbVar = jbVar.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z10 = sbVar.H0;
            ArrayList arrayList16 = sbVar.M0;
            if (z10) {
                return;
            }
            for (int i19 = 0; i19 < arrayList16.size(); i19++) {
                for (int i20 = 0; i20 < arrayList15.size(); i20++) {
                    if (((Uri) arrayList15.get(i20)).equals(((rb) arrayList16.get(i19)).uri)) {
                        arrayList15.remove(i20);
                    }
                }
            }
            for (int i21 = 0; i21 < arrayList15.size(); i21++) {
                Uri uri = (Uri) arrayList15.get(i21);
                rb rbVar = new rb(sbVar, sbVar.C0, sbVar.B0);
                rbVar.setOnSeekUpdate(new u8(14, jbVar, rbVar));
                rbVar.uri = uri;
                TLRPC.Document document2 = (TLRPC.Document) arrayList14.get(i21);
                rbVar.document = document2;
                FileStreamLoadOperation.setPriorityForDocument(document2, 0);
                rbVar.preparePlayer(uri, sb.D1, sb.B1);
                arrayList16.add(rbVar);
                if (arrayList16.size() > 2) {
                    ((rb) arrayList16.remove(0)).release(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.z1;
    }

    public long getCurrentPeer() {
        return this.B1;
    }

    public int getListPosition() {
        return this.L1;
    }

    public Bitmap getPlayingBitmap() {
        o4 o4Var = this.c1;
        Bitmap createBitmap = Bitmap.createBitmap(o4Var.getWidth(), o4Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public x8 getStoriesController() {
        return MessagesController.getInstance(this.C2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.D2, this.v1.size()) + this.w1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.v1;
    }

    public final void h1() {
        if (this.G1) {
            TextView textView = this.h2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.i2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.h2;
        if (textView3 != null) {
            textView3.setText(LocaleController.getString(this.E1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        }
        TextView textView4 = this.i2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.z1;
        sb sbVar = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.w1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((w8) arrayList2.get(i11)).a;
                    if (((int) (j10 ^ (j10 >>> 32))) == sbVar.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            }
            int indexOf = this.z1.indexOf(Integer.valueOf(sbVar.P0));
            if (indexOf < 0 && !this.z1.isEmpty()) {
                if (sbVar.P0 > ((Integer) this.z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (sbVar.P0 < ((Integer) i2.d.h(1, this.z1)).intValue()) {
                    indexOf = this.z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = sbVar.e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !sbVar.N0 && (peerStories = this.u1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.v1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i13)).id > this.u1.max_read_id) {
                        this.J1 = i13;
                        break;
                    }
                    i13++;
                }
            }
        }
        if (this.J1 == -1) {
            this.J1 = 0;
        }
    }

    public final void j1() {
        o8 o8Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.v1;
        arrayList.clear();
        sb sbVar = this.J0;
        if (!sbVar.N0) {
            ArrayList arrayList2 = this.z1;
            int i10 = 0;
            ArrayList arrayList3 = this.w1;
            if (arrayList2 != null && (o8Var = sbVar.O0) != null) {
                if (o8Var instanceof f8) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((f8) sbVar.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            w8 w8Var = (w8) E.get(i11);
                            di.k8 k8Var = w8Var.c;
                            if (k8Var != null && !k8Var.g && TextUtils.equals(k8Var.K0, str)) {
                                arrayList3.add(w8Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = sbVar.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (sbVar.O0 != null) {
                while (i10 < sbVar.O0.i.size()) {
                    arrayList.add(((MessageObject) sbVar.O0.i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = sbVar.Q0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.B1) {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.u1 = y3;
                    if (y3 == null) {
                        this.u1 = this.S1.z(this.B1);
                    }
                } else {
                    this.u1 = sbVar.Q0;
                }
                this.D2 = 0;
                TL_stories.PeerStories peerStories2 = this.u1;
                if (peerStories2 != null) {
                    this.D2 = peerStories2.stories.size();
                    arrayList.addAll(this.u1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.S1.E(this.B1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        } else if (!sbVar.S0) {
            arrayList.add(sbVar.T0);
        }
        this.A1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        q5 currentPeerView;
        p60 p60Var = this.J2;
        if (p60Var != null) {
            p60Var.f0 = null;
            p60Var.a(false);
        }
        long j10 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.a;
        sb sbVar = this.J0;
        sbVar.getClass();
        if (j10 != 0 && storyItem != null) {
            sb.E1.remove(j10 + (j10 >> 16) + (storyItem.id << 16));
        }
        this.i3 = true;
        ib ibVar = sbVar.n0;
        if (ibVar != null && (currentPeerView = ibVar.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            sc I = new zc(this.c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new r2(this, 2));
            I.r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.C2).ensureMessagesLoaded(this.B1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        o5 o5Var = this.O1;
        TL_stories.StoryItem storyItem = o5Var.a;
        if (storyItem == null) {
            storyItem = o5Var.c;
        }
        boolean z11 = this.D1;
        if (z11 || this.C1) {
            if (storyItem == null) {
                this.A2.setText("");
                this.F2.setVisibility(8);
                this.B2.setVisibility(8);
                return;
            }
            sb sbVar = this.J0;
            c4 c4Var = this.D0;
            if (!z11) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.A2.setText(LocaleController.getString(sbVar.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                    this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                } else {
                    int i11 = 0;
                    for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                        TLObject userOrChat = MessagesController.getInstance(this.C2).getUserOrChat(storyItem.views.recent_viewers.get(i12).longValue());
                        if (userOrChat != null) {
                            this.B2.b(i11, userOrChat, this.C2);
                            i11++;
                        }
                        if (i11 >= 3) {
                            break;
                        }
                    }
                    for (int i13 = i11; i13 < 3; i13++) {
                        this.B2.b(i13, null, this.C2);
                    }
                    this.B2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        br brVar = new br(R.drawable.mini_views_likes, 0);
                        brVar.setOverrideColor(-53704);
                        brVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(brVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        br brVar2 = new br(R.drawable.mini_repost_story, 0);
                        brVar2.setOverrideColor(-14161823);
                        brVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(brVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder);
                    if (i11 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + com.google.android.gms.internal.play_billing.k3.v(i11, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                }
                c4Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.O0.requestLayout();
                return;
            }
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2.views_count <= 0) {
                storyViews2.views_count = 1;
            }
            org.telegram.ui.Components.r6 r6Var = this.R0;
            if (r6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.V0 = false;
            } else {
                r6Var.t(Integer.toString(i10), z10 && this.V0, true);
                this.V0 = true;
            }
            int i14 = storyItem.views.reactions_count;
            if (i14 > 0) {
                this.Q0.t(Integer.toString(i14), z10 && this.U0, true);
                this.U0 = true;
            } else {
                this.U0 = false;
            }
            if (!z10) {
                this.S0.d(this.U0 ? 1.0f : 0.0f, true);
                org.telegram.ui.Components.g6 g6Var = this.T0;
                if (g6Var != null) {
                    g6Var.d(this.V0 ? 1.0f : 0.0f, true);
                }
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
            if (!(this.E1 && (ChatObject.canSendPlain(chat) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                this.A2.setText(LocaleController.getString(sbVar.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new br(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.A2.setText(spannableStringBuilder2);
            } else {
                this.A2.setText("");
            }
            c4Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.U0 ? this.Q0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + c4Var.getLayoutParams().width;
            c4 c4Var2 = this.P0;
            if (c4Var2 != null) {
                c4Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.V0 ? this.R0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += c4Var2.getLayoutParams().width;
                c4Var2.requestLayout();
            }
            this.W1.requestLayout();
            c4Var.requestLayout();
            this.B2.setVisibility(8);
            this.F2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = o5Var.a;
            k4 k4Var = this.j1;
            if (storyItem2 == null) {
                k4Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < k4Var.getChildCount(); i15++) {
                if (k4Var.getChildAt(i15) instanceof za) {
                    ((za) k4Var.getChildAt(i15)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void l0() {
        c9 c9Var = this.E0;
        c9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new m3(0, c9Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        c9 c9Var2 = new c9(getContext(), this.x1);
        this.E0 = c9Var2;
        c9Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.z5.e(40, 40, 3));
        this.q3 = false;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void l1() {
        /*
            Method dump skipped, instructions count: 1613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.q5.l1():void");
    }

    public final void m0(boolean z10) {
        ValueAnimator valueAnimator = this.c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d4, z10 ? 1.0f : 0.0f);
        this.c4 = ofFloat;
        ofFloat.addUpdateListener(new s2(this, 2));
        this.c4.addListener(new k3(this, z10, 1));
        this.c4.setDuration(420L);
        this.c4.setInterpolator(org.telegram.ui.Components.es.h);
        this.c4.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.C2).isFrozen()) {
            org.telegram.ui.b.b(this.C2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 <= 0 || !this.k3) {
            runnable.run();
            return;
        }
        int i11 = i10 - 1;
        SharedConfig.stealthModeSendMessageConfirm = i11;
        SharedConfig.updateStealthModeSendMessageConfirm(i11);
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 0, this.B0);
        a2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        a2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        a1.c cVar = new a1.c(runnable, 6);
        a2Var.l0 = string;
        a2Var.m0 = cVar;
        String string2 = LocaleController.getString(R.string.Cancel);
        aa.a aVar = new aa.a(29);
        a2Var.n0 = string2;
        a2Var.o0 = aVar;
        a2Var.show();
    }

    public final void o0(int i10) {
        this.E2 = false;
        this.V2 = true;
        this.B3 = false;
        this.D1 = false;
        this.E1 = false;
        long j10 = this.B1;
        m5 m5Var = this.o1;
        org.telegram.ui.Components.k9 k9Var = this.n1;
        if (j10 >= 0) {
            this.C1 = j10 == UserConfig.getInstance(this.C2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            this.F1 = !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            k9Var.m(this.C2, user);
            m5Var.a.getImageReceiver().setForUserOrChat(user, k9Var);
            W0(this.B1, true, false);
        } else {
            this.C1 = false;
            this.D1 = true;
            if (this.S1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.B3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.E1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.C2).getChatFull(-this.B1) == null) {
                MessagesStorage.getInstance(this.C2).loadChatInfo(-this.B1, true, new CountDownLatch(1), false, false);
            }
            this.F1 = this.E1 && !ChatObject.canSendPlain(chat);
            this.H1 = MessagesController.getInstance(this.C2).getSendPaidMessagesStars(this.B1);
            k9Var.k(this.C2, chat);
            m5Var.a.getImageReceiver().setForUserOrChat(chat, k9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            x8 x8Var = this.S1;
            long j11 = this.B1;
            a0.h hVar = x8Var.m;
            bc bcVar = (bc) hVar.f(j11);
            if (bcVar == null) {
                bcVar = new bc(x8Var.a, j11, x8Var);
                hVar.k(bcVar, j11);
            }
            bcVar.b(true);
        }
        j1();
        this.J1 = i10;
        if (i10 < 0) {
            this.J1 = 0;
        }
        this.W0 = 0L;
        this.Y0 = false;
        this.J3 = null;
        this.K3 = null;
        boolean z10 = this.D1;
        o4 o4Var = this.c1;
        sb sbVar = this.J0;
        int i11 = 8;
        o5 o5Var = this.O1;
        if (z10) {
            B0();
            if (this.b2 == null && (this.E1 || o5Var.f)) {
                v0();
            }
            if (this.b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                q3 q3Var = this.b2;
                if (o5Var.f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                q3Var.setVisibility(i11);
                q3 q3Var2 = this.b2;
                boolean z11 = o5Var.f;
                D0(true);
                q3Var2.f1(z11);
                this.b2.l1(o5Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
                nu editField = this.b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem = o5Var.a;
                sbVar.getClass();
                editField.setText(sb.u(j12, storyItem));
                this.b2.Y0(this.C2, this.B1);
                this.b2.H1(chat2, null);
            }
            org.telegram.ui.Components.r6 r6Var = this.Q0;
            org.telegram.ui.ActionBar.c6 c6Var = this.B0;
            if (r6Var == null) {
                org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(false, false, false);
                this.Q0 = r6Var2;
                c4 c4Var = this.D0;
                r6Var2.setCallback(c4Var);
                this.Q0.u(c6Var.E0(org.telegram.ui.ActionBar.g6.G6));
                this.Q0.w(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.g6(c4Var);
            }
            c4 c4Var2 = this.P0;
            if (c4Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(false, false, false);
                this.R0 = r6Var3;
                r6Var3.setCallback(c4Var2);
                this.R0.u(c6Var.E0(org.telegram.ui.ActionBar.g6.G6));
                this.R0.w(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.g6(c4Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            o4Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (o5Var.f) {
                this.W1.setVisibility(8);
                if (this.b2 == null) {
                    v0();
                }
                this.b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                q3 q3Var3 = this.b2;
                if (q3Var3 != null) {
                    q3Var3.setVisibility(8);
                }
            }
            q3 q3Var4 = this.b2;
            if (q3Var4 != null) {
                boolean z12 = o5Var.f;
                D0(true);
                q3Var4.f1(z12);
                this.b2.l1(o5Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(sbVar.P0));
                    if (indexOf < 0 && !this.z1.isEmpty()) {
                        if (sbVar.P0 > ((Integer) this.z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (sbVar.P0 < ((Integer) i2.d.h(1, this.z1)).intValue()) {
                            indexOf = this.z1.size() - 1;
                        }
                    }
                    this.J1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.w1.isEmpty();
                    ArrayList arrayList2 = this.v1;
                    if (isEmpty) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i12)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i12)).id > this.S1.f.get(this.B1)) {
                                this.J1 = i12;
                                break;
                            }
                        }
                    } else {
                        this.J1 = arrayList2.size();
                    }
                }
            }
            f1(false);
            o4Var.invalidate();
            invalidate();
        } else {
            if (this.b2 == null) {
                v0();
            }
            if (this.F1 && this.g2 == null) {
                z0();
            }
            if (this.g2 != null) {
                if (this.F1 || this.G1) {
                    h1();
                }
                this.g2.setVisibility(((!this.F1 || o5Var.f) && !this.G1) ? 8 : 0);
            }
            qa qaVar = this.j2;
            if (qaVar != null) {
                qaVar.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            q3 q3Var5 = this.b2;
            if (q3Var5 != null) {
                q3Var5.setVisibility((I0() || UserObject.isService(this.B1)) ? 8 : 0);
                q3 q3Var6 = this.b2;
                boolean z13 = o5Var.f;
                D0(true);
                q3Var6.f1(z13);
                this.b2.l1(o5Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
                nu editField2 = this.b2.getEditField();
                long j13 = this.B1;
                TL_stories.StoryItem storyItem2 = o5Var.a;
                sbVar.getClass();
                editField2.setText(sb.u(j13, storyItem2));
                this.b2.Y0(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.b2.H1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.z2, false);
                }
            }
            this.A1 = getStoriesCount();
            c4 c4Var3 = this.W1;
            if (c4Var3 != null) {
                c4Var3.setVisibility(8);
            }
            o4Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a1 = true;
        this.e1.onAttachedToWindow();
        this.g1.onAttachedToWindow();
        this.f1.onAttachedToWindow();
        this.l3.onAttachedToWindow();
        this.n3.onAttachedToWindow();
        q3 q3Var = this.b2;
        if (q3Var != null) {
            q3Var.C0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h1;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((ah.y0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a1 = false;
        this.e1.onDetachedFromWindow();
        this.g1.onDetachedFromWindow();
        this.f1.onDetachedFromWindow();
        this.l3.onDetachedFromWindow();
        this.n3.onDetachedFromWindow();
        q3 q3Var = this.b2;
        if (q3Var != null) {
            q3Var.B0();
        }
        org.telegram.ui.Components.s5 s5Var = this.o3;
        if (s5Var != null) {
            s5Var.o(this);
            this.o3 = null;
        }
        ah.e eVar = this.m3;
        if (eVar != null) {
            eVar.d(this);
            this.m3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h1;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((ah.y0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.x1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0428  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        float f7;
        char c10;
        p60 p60Var;
        boolean z10;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        gl0 gl0Var;
        s3 s3Var;
        sb sbVar = this.J0;
        if (sbVar.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i12 = 0;
        if (this.K1 && this.Z2 == null) {
            this.y2 = ((jb) this.Q1).d.p0;
        } else {
            this.y2 = 0;
        }
        int size = sbVar.b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.y2;
        int size2 = (int) ((View.MeasureSpec.getSize(i10) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.y2 < AndroidUtilities.dp(20.0f)) {
            this.y2 = 0;
        }
        int i13 = this.y2;
        gl0 gl0Var2 = this.r3;
        if (gl0Var2 == null || gl0Var2.getReactionsWindow() == null || this.r3.getReactionsWindow().q) {
            q3 q3Var = this.b2;
            if (q3Var != null && (q3Var.r0() || this.b2.k3)) {
                if (this.b2.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.b2.getEmojiPadding();
                } else {
                    q3 q3Var2 = this.b2;
                    if (q3Var2.z3) {
                        q3Var2.J();
                        i13 = this.b2.getStickersExpandedHeight();
                    } else {
                        i13 = q3Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.r3.getReactionsWindow().c.animate().translationY(-this.y2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
            i13 = 0;
        }
        boolean z11 = this.v2;
        int i14 = this.o2;
        m5 m5Var = this.o1;
        int i15 = 1;
        if (i14 != i13) {
            this.v2 = false;
            int i16 = 3;
            o5 o5Var = this.O1;
            f7 = 8.0f;
            if (i13 <= 0 || !this.K1) {
                q3 q3Var3 = this.b2;
                if (q3Var3 != null) {
                    sb.J(this.B1, o5Var.a, q3Var3.getEditText());
                }
            } else {
                this.v2 = true;
                this.i3 = false;
                this.t2 = i13;
                if (this.f2 == null) {
                    gl0 gl0Var3 = new gl0(1, this.C2, getContext(), LaunchActivity.R(), new n3(i16, this.B0));
                    this.f2 = gl0Var3;
                    gl0Var3.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    gl0 gl0Var4 = this.f2;
                    gl0Var4.N0 = true;
                    addView(gl0Var4, this.I0, w7.z5.a(72.0f, 0.0f, 0.0f, 0.0f, 64.0f, -2, 49));
                    this.f2.setDelegate(new j4(this));
                    this.f2.p(null, null, true);
                }
                this.f2.setFragment(LaunchActivity.R());
                this.f2.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                ah.d1 d1Var = ah.d1.B;
                if (d1Var != null) {
                    d1Var.l = true;
                }
                ah.d1 d1Var2 = ah.d1.C;
                if (d1Var2 != null) {
                    d1Var2.l = true;
                }
            }
            q3 q3Var4 = this.b2;
            if (q3Var4 != null) {
                q3Var4.l1(o5Var.f && !D0(true) && this.v2, true);
            }
            if (this.v2 && (s3Var = this.d3) != null) {
                s3Var.setVisibility(0);
            }
            if (!this.v2 && (gl0Var = this.f2) != null) {
                gl0Var.n();
            }
            m5Var.setEnabled(!this.v2);
            if (this.b2 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.v2, 0.1f, true);
            }
            if (this.K1 && this.v2) {
                sb sbVar2 = ((jb) this.Q1).d;
                if (!sbVar2.x) {
                    sbVar2.x = true;
                    sbVar2.P();
                }
            }
            this.o2 = i13;
            ValueAnimator valueAnimator = this.p2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.N2.lock();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H2, i13);
            this.p2 = ofFloat;
            ofFloat.addUpdateListener(new s2(this, i12));
            this.p2.addListener(new l3(this, i15));
            if (this.v2) {
                this.p2.setDuration(250L);
                this.p2.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                sbVar.m();
            } else {
                this.p2.setDuration(500L);
                this.p2.setInterpolator(org.telegram.ui.Components.es.h);
            }
            this.p2.start();
            boolean z12 = this.v2;
            if (z12 != z11) {
                if (z12) {
                    com.google.firebase.messaging.m mVar = this.P1;
                    Canvas canvas = (Canvas) mVar.b;
                    Bitmap bitmap = (Bitmap) mVar.c;
                    E0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.a.k(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (o5Var.f) {
                        di.d4 d4Var = this.d2;
                        if (d4Var != null) {
                            if (!d4Var.V) {
                                removeView(d4Var);
                            }
                        }
                        if (!D0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            di.d4 d4Var2 = new di.d4(getContext(), 3);
                            this.d2 = d4Var2;
                            d4Var2.s(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.d2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            di.d4 d4Var3 = this.d2;
                            d4Var3.K = Layout.Alignment.ALIGN_OPPOSITE;
                            d4Var3.l0 = new a1.f(21, this, d4Var2);
                            addView(d4Var3, w7.z5.e(-1, 100, 87));
                            this.d2.u();
                            l1();
                        }
                    }
                } else {
                    q3 q3Var5 = this.b2;
                    if (q3Var5 != null) {
                        q3Var5.getEditField().clearFocus();
                    }
                    di.d4 d4Var4 = this.d2;
                    if (d4Var4 != null) {
                        d4Var4.e(true);
                    }
                }
                this.u2 = true;
            } else {
                this.u2 = false;
            }
        } else {
            f7 = 8.0f;
        }
        q3 q3Var6 = this.b2;
        if (q3Var6 != null && q3Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.b2.getEmojiView().getLayoutParams()).gravity = 80;
        }
        o4 o4Var = this.c1;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o4Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z13 = size - size2 > AndroidUtilities.dp(64.0f);
        this.x2 = z13;
        int dp2 = (size - ((z13 ? AndroidUtilities.dp(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = dp2;
        if (this.x2) {
            this.K2 = (((-dp2) + size) - size2) - AndroidUtilities.dp(64.0f);
        } else {
            this.K2 = ((-dp2) + size) - size2;
        }
        if (this.x2 != this.w2) {
            o4Var.setLayoutParams(layoutParams2);
        }
        c4 c4Var = this.W1;
        if (c4Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) c4Var.getLayoutParams();
            if (this.x2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f7) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        f4 f4Var = this.b3;
        if (f4Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) f4Var.getLayoutParams();
            if (this.x2) {
                c10 = 0;
                this.b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                p60Var = this.J2;
                if (p60Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) p60Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.g0.A(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i13;
                    }
                }
                z10 = this.x2;
                LinearLayout linearLayout = this.O0;
                u4 u4Var = this.K0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.C1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) u4Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.w2 != this.x2) {
                        u4Var.setLayoutParams((FrameLayout.LayoutParams) u4Var.getLayoutParams());
                    }
                    u4Var.u0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) u4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f7);
                    if (this.w2 != this.x2) {
                        u4Var.setLayoutParams((FrameLayout.LayoutParams) u4Var.getLayoutParams());
                    }
                    u4Var.u0 = AndroidUtilities.dp(f7);
                }
                this.V2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.C0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.y0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                l5 l5Var = m5Var.b;
                TextView[] textViewArr = m5Var.c;
                layoutParams = (FrameLayout.LayoutParams) l5Var.getLayoutParams();
                if (layoutParams.rightMargin != dp) {
                    int i17 = (int) dp;
                    layoutParams.rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i17;
                    m5Var.forceLayout();
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.w2 = this.x2;
            }
            this.b3.setTextColor(i0.a.k(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c10 = 0;
        p60Var = this.J2;
        if (p60Var != null) {
        }
        z10 = this.x2;
        LinearLayout linearLayout2 = this.O0;
        u4 u4Var2 = this.K0;
        if (z10) {
        }
        this.V2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.C0.getVisibility() == 0) {
        }
        if (this.y0.getVisibility() == 0) {
        }
        l5 l5Var2 = m5Var.b;
        TextView[] textViewArr2 = m5Var.c;
        layoutParams = (FrameLayout.LayoutParams) l5Var2.getLayoutParams();
        if (layoutParams.rightMargin != dp) {
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.w2 = this.x2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.q2 = -1.0f;
        this.V2 = true;
        invalidate();
    }

    public final void p0() {
        u4 u4Var = this.K0;
        if (u4Var.W.x()) {
            u4Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((jb) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        if (this.b2 != null && this.f3 && this.a1) {
            r2 r2Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(r2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.b2.I(true);
            boolean z11 = this.F1;
            o5 o5Var = this.O1;
            if ((z11 && !o5Var.f) || this.G1) {
                this.k3 = false;
                this.b2.setEnabled(false);
                this.b2.g1(" ", z10);
                return;
            }
            if (this.H1 > 0) {
                this.k3 = false;
                this.b2.setEnabled(true);
                this.b2.g1(zh.p7.R0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
                return;
            }
            if (!o5Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.C2).getCurrentTime();
                int i10 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i10) {
                    this.k3 = true;
                    int currentTime2 = i10 - ConnectionsManager.getInstance(this.C2).getCurrentTime();
                    int i11 = currentTime2 / 60;
                    int i12 = currentTime2 % 60;
                    int i13 = R.string.StealthModeActiveHintShort;
                    Locale locale = Locale.US;
                    int measureText = (int) this.b2.getEditField().getPaint().measureText(LocaleController.formatString(i13, String.format(locale, "%02d:%02d", 99, 99)));
                    this.b2.setEnabled(true);
                    if (measureText * 1.2f >= this.b2.getEditField().getMeasuredWidth()) {
                        q3 q3Var = this.b2;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        q3Var.e = formatString;
                        q3Var.f = format;
                        q3Var.D1(z10);
                    } else {
                        this.b2.g1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    AndroidUtilities.runOnUIThread(r2Var, 1000L);
                    return;
                }
            }
            this.k3 = false;
            this.b2.setEnabled(true);
            if (!o5Var.f) {
                this.b2.g1(LocaleController.getString(this.E1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            if (this.b2.getStarsPrice() <= 0) {
                this.b2.g1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.b2.g1(zh.p7.W0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.b2.O4), z10);
            br brVar = this.b2.O4[0];
            if (brVar != null) {
                brVar.spaceScaleX = 0.9f;
            }
        }
    }

    public final boolean s0() {
        if (this.s3) {
            if (this.r3.getReactionsWindow() == null) {
                b1(false);
                return true;
            }
            if (this.y2 > 0) {
                AndroidUtilities.hideKeyboard(this.r3.getReactionsWindow().c);
                return true;
            }
            this.r3.getReactionsWindow().d();
            return true;
        }
        k4 k4Var = this.j1;
        if (k4Var != null) {
            di.d4 d4Var = k4Var.c;
            if (d4Var != null) {
                d4Var.e(true);
                k4Var.c = null;
            }
            k4Var.b = null;
            k4Var.invalidate();
            k4Var.b(false);
        }
        u4 u4Var = this.K0;
        if (u4Var.W.x()) {
            u4Var.W.f(false);
            return true;
        }
        di.d4 d4Var2 = this.F0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        di.d4 d4Var3 = this.G0;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        v40 v40Var = this.W2;
        if (v40Var != null) {
            v40Var.b(true);
        }
        h5 h5Var = this.t1;
        if (h5Var != null && h5Var.b) {
            h5Var.a();
            return true;
        }
        q3 q3Var = this.b2;
        if (q3Var != null && q3Var.t0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.b2.c1) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new n2(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((jb) this.Q1).h(alertDialog$Builder.a);
            return true;
        }
        gl0 gl0Var = this.f2;
        if (gl0Var != null && gl0Var.getReactionsWindow() != null && !this.f2.getReactionsWindow().q) {
            this.f2.getReactionsWindow().d();
            return true;
        }
        q3 q3Var2 = this.b2;
        if (q3Var2 != null && q3Var2.r0()) {
            if (this.y2 > 0) {
                AndroidUtilities.hideKeyboard(this.b2.getEmojiView());
                return true;
            }
            this.b2.l0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (u4Var.getVisibility() != 0 || u4Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            u4Var.C();
            this.g3 = false;
            this.c1.invalidate();
            return true;
        }
        q3 q3Var3 = this.b2;
        if (q3Var3 != null) {
            long j10 = this.B1;
            TL_stories.StoryItem storyItem = this.O1.a;
            Editable editText = q3Var3.getEditText();
            this.J0.getClass();
            sb.J(j10, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.b2);
        return true;
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.k1.b = i10;
        gl0 gl0Var = this.f2;
        if (gl0Var != null) {
            gl0Var.setCurrentAccount(i10);
            this.f2.p(null, null, true);
        }
        gl0 gl0Var2 = this.r3;
        if (gl0Var2 != null) {
            gl0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(j5 j5Var) {
        this.Q1 = j5Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f3 == z10) {
            return;
        }
        this.f3 = z10;
        if (z10) {
            this.e1.setCurrentAlpha(1.0f);
            r0(false);
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.K1) {
            this.L2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f7) {
        boolean z10 = f7 == 0.0f;
        if (this.b1 != z10) {
            this.b1 = z10;
            this.c1.invalidate();
            if (this.K1 && this.J0.a && Build.VERSION.SDK_INT < 33) {
                androidx.activity.i iVar = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    sb sbVar = ((jb) this.Q1).d;
                    sbVar.l1 = true;
                    sbVar.P();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            b4 b4Var = this.e1;
            if (z10) {
                b4Var.stopAnimation();
                b4Var.setAllowStartAnimation(false);
            } else {
                b4Var.startAnimation();
                b4Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            w3 w3Var = new w3(this, getContext(), this.B0);
            this.I2 = w3Var;
            w3Var.c2 = new x3(this);
            w3Var.j0.f0();
            w3 w3Var2 = this.I2;
            w3Var2.W = true;
            w3Var2.t1();
            w3 w3Var3 = this.I2;
            w3Var3.X = new y3(this);
            w3Var3.o1().setText(this.b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.I3);
        this.X1 = aVar;
        aVar.setOnClickListener(new t2(this, 1));
        addView(this.X1, w7.z5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 83));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.B0;
        q3 q3Var = new q3(this, AndroidUtilities.findActivity(getContext()), this, new n3(1, c6Var));
        this.b2 = q3Var;
        q3Var.getEditField().useAnimatedTextDrawable();
        this.b2.getEditField().setScaleX(0.0f);
        this.b2.setOverrideKeyboardAnimation(true);
        this.b2.setClipChildren(false);
        this.b2.setDelegate(new r3(this));
        setDelegate(this.b2);
        q3 q3Var2 = this.b2;
        q3Var2.y4 = false;
        q3Var2.z4 = true;
        if (this.O1.f) {
            q3Var2.S0(false, false, false);
        } else {
            q3Var2.S0(true, true, false);
        }
        this.b2.d();
        q3 q3Var3 = this.b2;
        q3Var3.A4 = true;
        addView(q3Var3, w7.z5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        if (this.O3 != null) {
            this.b2.M1(false);
        }
        this.b2.G2 = this.z2;
        p5 p5Var = this.M2;
        ((ArrayList) p5Var.g).add(this.c1);
        ((ArrayList) p5Var.g).add(this);
        if (this.a1) {
            this.b2.C0();
        }
        r0(false);
        if (I0()) {
            this.b2.setVisibility(8);
        }
        kh.h hVar = new kh.h(getContext(), c6Var, this.I3, this.F3);
        this.c2 = hVar;
        hVar.setOnClickListener(new n2(this, 1));
        addView(this.c2, w7.z5.e(57, 300, 85));
        this.c2.setVisibility(8);
        this.b2.setSideButtonsForAttach(this.c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.j2 != null) {
            return;
        }
        qa qaVar = new qa(getContext(), this.B0);
        this.j2 = qaVar;
        qaVar.setOnClickListener(new t2(this, 4));
        this.j2.setAlpha(0.0f);
        this.j2.setVisibility(8);
        addView(this.j2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
    }

    public final void x0() {
        if (this.a2 != null || getContext() == null) {
            return;
        }
        g2 g2Var = new g2(getContext(), this.I3);
        this.a2 = g2Var;
        g2Var.setOnClickListener(new t2(this, 5));
        g2 g2Var2 = this.a2;
        t1 t1Var = t1.W;
        boolean z10 = true;
        g2Var2.b(t1Var != null && t1Var.o(), false);
        g2 g2Var3 = this.a2;
        t1 t1Var2 = t1.W;
        if (t1Var2 != null && !t1Var2.m()) {
            z10 = false;
        }
        g2Var3.a(z10, false);
        addView(this.a2, w7.z5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 85));
    }

    public final void y0() {
        if (this.Z1 != null || getContext() == null) {
            return;
        }
        this.Y1 = new l2(getContext(), this.C2);
        m2 m2Var = new m2(getContext(), this.Y1, this.I3);
        this.Z1 = m2Var;
        m2Var.setOnClickListener(new t2(this, 6));
        this.Z1.setOnLongClickListener(new q2(this, 1));
        addView(this.Z1, w7.z5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 85));
        addView(this.Y1, w7.z5.a(200.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 85));
    }

    public final void z0() {
        if (this.g2 != null) {
            return;
        }
        if (this.b2 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.g2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.h2 = textView;
        textView.setTextColor(-8026747);
        this.h2.setTextSize(1, 16.0f);
        this.h2.setText(LocaleController.getString(this.E1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        TextView textView2 = new TextView(getContext());
        this.i2 = textView2;
        textView2.setTextColor(-1);
        this.i2.setTextSize(1, 12.0f);
        TextView textView3 = this.i2;
        int dp = AndroidUtilities.dp(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.i2.setGravity(17);
        w7.b6.a(this.i2);
        this.i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.g2.addView(imageView, w7.z5.t(22, 22, 16, 12, 1, 4, 0));
        this.g2.addView(this.h2, w7.z5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.g2.addView(this.i2, w7.z5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.b2.addView(this.g2, w7.z5.a(-1.0f, 14.0f, 0.0f, 8.0f, 0.0f, -1, 119));
    }
}
