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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bs;
import org.telegram.ui.co;
import org.telegram.ui.ec1;
import org.telegram.ui.gz;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public abstract class o5 extends ov0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.f6 B0;
    public long B1;
    public a0 B2;
    public boolean B3;
    public final ua C0;
    public boolean C1;
    public int C2;
    public bs C3;
    public final z3 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.f1 D3;
    public z8 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.f1 E3;
    public di.f4 F0;
    public boolean F1;
    public a4 F2;
    public final bh.b F3;
    public di.f4 G0;
    public boolean G1;
    public boolean G2;
    public final gh.a G3;
    public di.f4 H0;
    public long H1;
    public float H2;
    public final gh.d H3;
    public int I0;
    public final float I1;
    public t3 I2;
    public final eh.b I3;
    public final pb J0;
    public int J1;
    public w50 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final s4 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final e3 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final n5 M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final m5 O1;
    public final org.telegram.ui.Components.e6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final z3 P0;
    public final com.google.firebase.messaging.n P1;
    public final org.telegram.ui.Components.e6 P2;
    public final q2 P3;
    public org.telegram.ui.Components.p6 Q0;
    public h5 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.p6 R0;
    public boolean R1;
    public long R2;
    public final q2 R3;
    public org.telegram.ui.Components.e6 S0;
    public u8 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.e6 T0;
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
    public z3 W1;
    public i40 W2;
    public final org.telegram.ui.Components.e6 W3;
    public long X0;
    public a X1;
    public final org.telegram.ui.ov0 X2;
    public final org.telegram.ui.Components.e6 X3;
    public boolean Y0;
    public k2 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.e6 Y3;
    public boolean Z0;
    public l2 Z1;
    public w3 Z2;
    public float Z3;
    public boolean a1;
    public f2 a2;
    public FrameLayout a3;
    public final Path a4;
    public boolean b1;
    public n3 b2;
    public c4 b3;
    public boolean b4;
    public final l4 c1;
    public kh.h c2;
    public boolean c3;
    public ValueAnimator c4;
    public final FrameLayout d1;
    public di.f4 d2;
    public p3 d3;
    public float d4;
    public final y3 e1;
    public ValueAnimator e2;
    public float e3;
    public final ImageReceiver f1;
    public fk0 f2;
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
    public final h4 j1;
    public ma j2;
    public boolean j3;
    public final gz k1;
    public ViewPropertyAnimator k2;
    public boolean k3;
    public v5 l1;
    public final dh.d l2;
    public final ImageReceiver l3;
    public float m1;
    public final dh.d m2;
    public ah.e m3;
    public final org.telegram.ui.Components.i9 n1;
    public final Paint n2;
    public final ImageReceiver n3;
    public final k5 o1;
    public int o2;
    public org.telegram.ui.Components.q5 o3;
    public final na p1;
    public ValueAnimator p2;
    public boolean p3;
    public j6.l q1;
    public float q2;
    public boolean q3;
    public int r1;
    public float r2;
    public fk0 r3;
    public org.telegram.ui.ActionBar.f1 s1;
    public float s2;
    public boolean s3;
    public f5 t1;
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
    public final l5 x1;
    public boolean x2;
    public int x3;
    public final g5 y0;
    public final s5 y1;
    public int y2;
    public int y3;
    public final aj0 z0;
    public ArrayList z1;
    public final int z2;
    public q2 z3;

    public o5(Context context, final pb pbVar, l5 l5Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.b1 = true;
        this.h1 = new ArrayList();
        this.r1 = -5;
        this.I1 = 1.0f;
        m5 m5Var = new m5(this);
        this.O1 = m5Var;
        this.q2 = -1.0f;
        this.r2 = -1.0f;
        this.s2 = -1.0f;
        this.z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.e6(this);
        this.P2 = new org.telegram.ui.Components.e6(this);
        org.telegram.ui.ov0 ov0Var = new org.telegram.ui.ov0();
        this.X2 = ov0Var;
        this.e3 = 1.0f;
        this.P3 = new q2(this, 4);
        this.R3 = new q2(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.V3 = new androidx.activity.i(this, 8);
        this.W3 = new org.telegram.ui.Components.e6(this);
        this.X3 = new org.telegram.ui.Components.e6(this);
        this.Y3 = new org.telegram.ui.Components.e6(this);
        this.a4 = new Path();
        ov0Var.E = new a6.m(this, 6);
        n5 n5Var = new n5();
        n5Var.g = new ArrayList();
        this.M2 = n5Var;
        this.N2 = new AnimationNotificationsLocker();
        this.v1 = new ArrayList();
        this.w1 = new ArrayList();
        final int i10 = 0;
        y3 y3Var = new y3(this, i10);
        this.e1 = y3Var;
        y3Var.setCrossfadeWithOldImage(false);
        y3Var.setAllowLoadingOnAttachedOnly(true);
        y3Var.ignoreNotifications = true;
        y3Var.setFileLoadingPriority(0);
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
        y3Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.n1 = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.J0 = pbVar;
        this.x1 = l5Var;
        this.P1 = l5Var.g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        l5Var.l.setColor(-16777216);
        this.n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = f6Var;
        setClipChildren(false);
        h4 h4Var = new h4(this, context, this.c1, f6Var, pbVar);
        this.j1 = h4Var;
        eh.b bVar = new eh.b(f6Var, org.telegram.ui.ActionBar.j6.Sd, 0.8f);
        this.I3 = bVar;
        gh.c cVar = new gh.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.H3 = null;
            this.G3 = cVar;
        } else {
            gh.d dVar = new gh.d(cVar);
            this.H3 = dVar;
            dVar.g(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        }
        ih.k kVar = new ih.k(this);
        bh.b bVar2 = new bh.b(this.G3);
        bVar2.d = kVar;
        bVar2.e = this;
        this.F3 = bVar2;
        this.l2 = bVar2.c(this, bVar, false);
        dh.d c10 = bVar2.c(this, bVar, false);
        this.m2 = c10;
        c10.t(AndroidUtilities.dp(32.0f));
        l4 l4Var = new l4(this, context, l5Var, pbVar);
        this.c1 = l4Var;
        l4Var.setClipChildren(false);
        this.k1 = new gz(this.C2, l4Var);
        l4Var.addView(h4Var, w7.x5.c(-1.0f, -1));
        s4 s4Var = new s4(this, getContext(), pbVar.y, pbVar, f6Var);
        this.K0 = s4Var;
        s4Var.b0.setOnClickListener(new s2(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(l5Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new s2(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.z5.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(l5Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        z3 z3Var = new z3(this, getContext(), 1);
        this.P0 = z3Var;
        org.telegram.ui.Components.p6 p6Var = this.R0;
        if (p6Var != null) {
            p6Var.setCallback(z3Var);
        }
        z3Var.setWillNotDraw(false);
        z3Var.setOnClickListener(new s2(this, 12));
        z3 z3Var2 = new z3(this, getContext(), 2);
        this.D0 = z3Var2;
        org.telegram.ui.Components.p6 p6Var2 = this.Q0;
        if (p6Var2 != null) {
            p6Var2.setCallback(z3Var2);
        }
        z3Var2.setWillNotDraw(false);
        z3Var2.setOnClickListener(new s2(this, 13));
        z3Var2.setOnLongClickListener(new d3(i10, this, pbVar));
        z8 z8Var = new z8(context, l5Var);
        this.E0 = z8Var;
        z8Var.setPadding(dp, dp, dp, dp);
        z3Var2.addView(this.E0, w7.x5.e(40, 40, 3));
        z3Var.addView(imageView2, w7.x5.e(40, 40, 3));
        w7.z5.b(z3Var2, 0.3f, 5.0f);
        w7.z5.b(z3Var, 0.3f, 5.0f);
        y3Var.setAllowLoadingOnAttachedOnly(true);
        y3Var.setParentView(l4Var);
        s5 s5Var = new s5(10);
        this.y1 = s5Var;
        l4Var.setOutlineProvider(s5Var);
        l4Var.setClipToOutline(true);
        addView(l4Var);
        k5 k5Var = new k5(context, m5Var);
        this.o1 = k5Var;
        k5Var.setOnClickListener(new View.OnClickListener(this) { // from class: bi.n2
            public final /* synthetic */ o5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        o5 o5Var = this.b;
                        long j3 = UserConfig.getInstance(o5Var.C2).clientUserId;
                        long j10 = o5Var.B1;
                        pb pbVar2 = pbVar;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                pbVar2.H(co.R9(j10));
                                break;
                            } else {
                                pbVar2.H(ProfileActivity.m4(j10));
                                break;
                            }
                        } else {
                            Bundle e7 = org.telegram.ui.Cells.p6.e(1, TeXSymbolParser.TYPE_ATTR);
                            e7.putLong("dialog_id", o5Var.B1);
                            pbVar2.H(new ca0(e7, null));
                            break;
                        }
                    default:
                        o5 o5Var2 = this.b;
                        if (!o5Var2.O1.j()) {
                            o5Var2.c1(true);
                            break;
                        } else {
                            pbVar.O();
                            if (!pb.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            o5Var2.y0.setContentDescription(LocaleController.getString(!pb.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        l4Var.addView(k5Var, w7.x5.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(imageView, w7.x5.q(40, 40, 5));
        linearLayout.addView(z3Var, w7.x5.q(40, 40, 5));
        linearLayout.addView(z3Var2, w7.x5.q(40, 40, 5));
        addView(linearLayout, w7.x5.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.w0 = imageView3;
        imageView3.setImageDrawable(l5Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        l4Var.addView(imageView3, w7.x5.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.x0 = imageView4;
        imageView4.setImageDrawable(l5Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        l4Var.addView(imageView4, w7.x5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.h0(pbVar, 3));
        imageView3.setOnClickListener(new l0(this, f6Var, pbVar, context, l5Var, 1));
        g5 g5Var = new g5(context, 0);
        this.y0 = g5Var;
        l4Var.addView(g5Var, w7.x5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        aj0 aj0Var = new aj0(context);
        this.z0 = aj0Var;
        aj0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        g5Var.addView(aj0Var);
        ImageView imageView5 = new ImageView(context);
        this.A0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(l5Var.t);
        g5Var.addView(imageView5);
        imageView5.setVisibility(8);
        ua uaVar = new ua(context);
        this.C0 = uaVar;
        uaVar.setOnClickListener(new s2(this, 2));
        l4Var.addView(uaVar, w7.x5.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i11 = 1;
        g5Var.setOnClickListener(new View.OnClickListener(this) { // from class: bi.n2
            public final /* synthetic */ o5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        o5 o5Var = this.b;
                        long j3 = UserConfig.getInstance(o5Var.C2).clientUserId;
                        long j10 = o5Var.B1;
                        pb pbVar2 = pbVar;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                pbVar2.H(co.R9(j10));
                                break;
                            } else {
                                pbVar2.H(ProfileActivity.m4(j10));
                                break;
                            }
                        } else {
                            Bundle e7 = org.telegram.ui.Cells.p6.e(1, TeXSymbolParser.TYPE_ATTR);
                            e7.putLong("dialog_id", o5Var.B1);
                            pbVar2.H(new ca0(e7, null));
                            break;
                        }
                    default:
                        o5 o5Var2 = this.b;
                        if (!o5Var2.O1.j()) {
                            o5Var2.c1(true);
                            break;
                        } else {
                            pbVar.O();
                            if (!pb.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            o5Var2.y0.setContentDescription(LocaleController.getString(!pb.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.p1 = new na(this, l5Var);
        l4Var.addView(s4Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        e3 e3Var = new e3(this, context, pbVar, pbVar.v, view, frameLayout, pbVar);
        this.L0 = e3Var;
        l4Var.addView(view, w7.x5.e(-1, 200, 87));
        l4Var.addView(e3Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        l4Var.addView(frameLayout, w7.x5.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        g5Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        z3Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        z3Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        org.telegram.ui.Cells.aa aaVar = s4Var.W;
        View o9 = aaVar.o(context);
        if (o9 != null) {
            AndroidUtilities.removeFromParent(o9);
            addView(o9);
        }
        aaVar.D = new f3(this, 0);
        aaVar.T(this);
    }

    public static void V0(t8 t8Var, ImageReceiver imageReceiver, String str) {
        if (t8Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(t8Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(t8Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(o5 o5Var, ValueAnimator valueAnimator) {
        ua uaVar = o5Var.C0;
        o5Var.d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k5 k5Var = o5Var.o1;
        k5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var.d4);
        k5Var.setAlpha(1.0f - o5Var.d4);
        ImageView imageView = o5Var.w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var.d4);
        imageView.setAlpha(1.0f - o5Var.d4);
        ImageView imageView2 = o5Var.x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var.d4);
        imageView2.setAlpha(1.0f - o5Var.d4);
        g5 g5Var = o5Var.y0;
        g5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var.d4);
        g5Var.setAlpha((1.0f - o5Var.d4) * o5Var.e3);
        z3 z3Var = o5Var.W1;
        if (z3Var != null) {
            z3Var.setTranslationY(AndroidUtilities.dp(8.0f) * o5Var.d4);
            o5Var.W1.setAlpha(1.0f - o5Var.d4);
        }
        if (uaVar != null) {
            uaVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var.d4);
            uaVar.setAlpha(1.0f - o5Var.d4);
        }
        o5Var.K0.setAlpha(1.0f - o5Var.d4);
        h5 h5Var = o5Var.Q1;
        float f7 = h5Var == null ? 0.0f : ((gb) h5Var).d.V;
        float hideInterfaceAlpha = o5Var.getHideInterfaceAlpha();
        z3 z3Var2 = o5Var.D0;
        if (z3Var2 != null) {
            z3Var2.setAlpha((1.0f - o5Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = o5Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - o5Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        z3 z3Var3 = o5Var.P0;
        if (z3Var3 != null) {
            z3Var3.setAlpha((1.0f - o5Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        n3 n3Var = o5Var.b2;
        if (n3Var != null) {
            n3Var.setAlpha(1.0f - o5Var.d4);
            o5Var.invalidate();
        }
        o5Var.c1.invalidate();
    }

    public static void a0(o5 o5Var, boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = o5Var.D3;
        if (f1Var == null || o5Var.C3 == null || f1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(pb.B1 - 0.2f) < 0.05f) {
                o5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(pb.B1 - 0.5f) < 0.05f) {
                o5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(pb.B1 - 1.0f) < 0.05f) {
                o5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(pb.B1 - 1.5f) < 0.05f) {
                o5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(pb.B1 - 2.0f) < 0.05f) {
                o5Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                o5Var.D3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, fd.a(pb.B1) + "x"));
            }
        }
        o5Var.C3.a(pb.B1, z10);
    }

    public static void b0(o5 o5Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (o5Var.I0() || o5Var.O1.f) {
            return;
        }
        if (UserConfig.getInstance(o5Var.C2).isPremium()) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, o5Var.B0).setOnClickListener(new s2(o5Var, 8));
            return;
        }
        Drawable drawable = o5Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        g3 g3Var = new g3(o5Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, o5Var.B0);
        c10.setOnClickListener(new s2(o5Var, 9));
        c10.setIcon(g3Var);
    }

    public static void d0(o5 o5Var) {
        m5 m5Var = o5Var.O1;
        TL_stories.StoryItem storyItem = m5Var.a;
        if ((storyItem == null && m5Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = m5Var.h();
        boolean z10 = m5Var.e;
        if (h == null || !h.exists()) {
            o5Var.a1();
            return;
        }
        MediaController.saveFile(h.toString(), o5Var.getContext(), z10 ? 1 : 0, null, null, new v2(0, o5Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(o5 o5Var, long j3) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(j3));
            str = user.first_name;
            z10 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-j3));
            str = chat2.title;
            z10 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new u2(o5Var, MessagesController.getInstance(o5Var.C2), j3, !z10, str, chat), 200L);
    }

    public static void f0(o5 o5Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o5Var.getContext(), 0, o5Var.B0);
        alertDialog$Builder.a.R = LocaleController.getString(o5Var.I0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.T = LocaleController.getString(o5Var.I0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m2(o5Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.emoji2.text.w(16));
        gb gbVar = (gb) o5Var.Q1;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        gbVar.h(b2Var);
        b2Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f7 = 1.0f - this.O2.c;
        a7 a7Var = this.J0.w;
        return (1.0f - (a7Var == null ? 0.0f : a7Var.f)) * f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        pb pbVar;
        if (!this.O1.f || (pbVar = this.J0) == null || pbVar.A0 == null || D0(true)) {
            return 0L;
        }
        return pbVar.A0.j();
    }

    public static void h0(o5 o5Var) {
        org.telegram.ui.ActionBar.f6 f6Var = o5Var.B0;
        l4 l4Var = o5Var.c1;
        if (o5Var.G1) {
            return;
        }
        int i10 = 0;
        int i11 = 1;
        if (!o5Var.E1) {
            n3 n3Var = o5Var.b2;
            int i12 = -o5Var.r1;
            o5Var.r1 = i12;
            AndroidUtilities.shakeViewSpring(n3Var, i12);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = o5Var.B1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1))) : "";
            (MessagesController.getInstance(o5Var.C2).premiumFeaturesBlocked() ? new yc(l4Var, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new yc(l4Var, f6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new q2(o5Var, 5))).j();
            return;
        }
        if (o5Var.J3 != null && o5Var.K3 != null) {
            sg.k0.C1(new l3(o5Var, i10), o5Var.J3, o5Var.K3, o5Var.B1, true);
            return;
        }
        pb pbVar = o5Var.J0;
        if (pbVar != null) {
            pbVar.k1 = true;
            pbVar.P();
        }
        MessagesController.getInstance(o5Var.C2).getBoostsController().getBoostsStats(o5Var.B1, new ah.m(o5Var, i11));
    }

    public static void j0(o5 o5Var) {
        m5 m5Var = o5Var.O1;
        if (m5Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = m5Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(o5Var.C2).getInputPeer(o5Var.B1);
        ConnectionsManager.getInstance(o5Var.C2).sendRequest(tL_stories_exportStoryLink, new x3());
    }

    public final void A0() {
        if (this.b3 != null) {
            return;
        }
        c4 c4Var = new c4(getContext(), 0);
        this.b3 = c4Var;
        c4Var.setTextSize(1, 14.0f);
        this.b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.b3.setGravity(19);
        this.b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.b3, w7.x5.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        z3 z3Var = new z3(this, getContext(), 0);
        this.W1 = z3Var;
        z3Var.setClickable(true);
        addView(this.W1, w7.x5.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        a4 a4Var = new a4(this, getContext());
        this.F2 = a4Var;
        a4Var.setOnClickListener(new s2(this, 0));
        this.W1.addView(this.F2, w7.x5.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        a0 a0Var = new a0(0, getContext(), false);
        this.B2 = a0Var;
        a0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.x5.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.x5.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.x1.s);
        a4 a4Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        a4Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
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
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        TextView textView2 = new TextView(getContext());
        w7.z5.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.j6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
        textView2.setOnClickListener(new s2(this, 3));
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        linearLayout.addView(textView2, w7.x5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.x5.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.c1.addView(frameLayout);
        this.a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        t1 t1Var;
        TLRPC.Peer i10;
        t1 t1Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        long j3 = this.B1;
        pb pbVar = this.J0;
        if (j3 >= 0 || (t1Var2 = pbVar.A0) == null) {
            if (j3 < 0 || pbVar == null || (t1Var = pbVar.A0) == null || !t1Var.l()) {
                return false;
            }
            return !z10 || (i10 = pbVar.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i11 = t1Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
        if (pbVar.A0.l() || ChatObject.canManageCalls(chat)) {
            return i11 == null || this.B1 == DialogObject.getPeerDialogId(i11) || DialogObject.getPeerDialogId(i11) == UserConfig.getInstance(this.C2).getClientUserId();
        }
        return false;
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        n5 n5Var = this.M2;
        org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) n5Var.e;
        if (l4Var != null && ((SurfaceView) n5Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) n5Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (l4Var != null && (textureView = (TextureView) n5Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        l4 l4Var2 = this.c1;
        canvas.scale(i10 / l4Var2.getMeasuredWidth(), i11 / l4Var2.getMeasuredHeight());
        this.e1.draw(canvas);
        canvas.restore();
    }

    public final void F0(di.ga gaVar, TL_stories.StoryItem storyItem) {
        h5 h5Var = this.Q1;
        di.ia iaVar = new di.ia(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.B0);
        iaVar.q1(gaVar);
        di.i1 i1Var = iaVar.b;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof di.ba) {
                    ((di.ba) view).e(false);
                }
            }
        }
        iaVar.k1(true);
        iaVar.T = new ah.i0(2, this, storyItem);
        ((gb) h5Var).h(iaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r3 == r10.f2) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G0(ViewGroup viewGroup, float f7, float f10, boolean z10) {
        di.f4 f4Var;
        n5 n5Var;
        org.telegram.ui.l4 l4Var;
        if (viewGroup != null) {
            di.f4 f4Var2 = this.F0;
            if ((f4Var2 == null || !f4Var2.V) && ((f4Var = this.G0) == null || !f4Var.V)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        s4 s4Var = this.K0;
                        if (childAt == s4Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f7, (int) f10)) {
                                float top = f10 - childAt.getTop();
                                da daVar = s4Var.b0;
                                if (daVar.w == 1.0f && !s4Var.s0) {
                                    if (top > daVar.getTranslationY() + (s4Var.r0.getTop() - s4Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.c1 || (n5Var = this.M2) == null || (l4Var = (org.telegram.ui.l4) n5Var.e) == null || !G0(l4Var, f7 - childAt.getX(), f10 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f7, (int) f10))) {
                            h4 h4Var = this.j1;
                            if (childAt == h4Var && h4Var.b == null && (f7 < AndroidUtilities.dp(60.0f) || f7 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = h4Var.e;
                                float[] fArr = h4Var.f;
                                for (int i11 = 0; i11 < h4Var.getChildCount(); i11++) {
                                    View childAt2 = h4Var.getChildAt(i11);
                                    if (childAt2 != h4Var.d && (childAt2 instanceof wa)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f7;
                                        fArr[1] = f10;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                e3 e3Var = this.L0;
                                if (childAt == e3Var) {
                                    ec1 ec1Var = e3Var.f;
                                    o0 o0Var = e3Var.c;
                                    ec1 ec1Var2 = e3Var.f;
                                    ec1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f7 - e3Var.getX()) - ec1Var2.getX()), (int) ((f10 - e3Var.getY()) - ec1Var2.getY()))) {
                                        if (e3Var.f0) {
                                            continue;
                                        } else if (!this.v2) {
                                            if (f10 <= e3Var.s() + e3Var.getY() && o0Var.E(f7, (f10 - e3Var.getY()) - o0Var.getY()) == null) {
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
                                            n3 n3Var = this.b2;
                                            if (n3Var != null && childAt == n3Var.getRecordCircle()) {
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
        l4 l4Var = this.c1;
        float x11 = view.getX() + l4Var.getX() + x10;
        float y3 = view.getY() + l4Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ((float) view.getHeight());
    }

    public final boolean I0() {
        l8 l8Var;
        pb pbVar = this.J0;
        return (pbVar == null || (l8Var = pbVar.O0) == null || l8Var.e != 4) ? false : true;
    }

    public final boolean J0() {
        TLRPC.User user;
        return I0() && (user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.J0.O0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean K0();

    public final void L0(ah.j1 j1Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        m5 m5Var = this.O1;
        TL_stories.StoryItem storyItem = m5Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && j1Var == null) {
            l0();
            this.S1.g0(this.B1, m5Var.a, null);
        } else if (j1Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = ah.e1.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                this.q3 = true;
                this.S1.g0(this.B1, m5Var.a, ah.j1.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, m5Var.a, j1Var);
        }
        TL_stories.StoryItem storyItem2 = m5Var.a;
        z3 z3Var = this.D0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.E0.setReaction(null);
            z3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.E0.setReaction(ah.j1.d(reaction));
            z3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.D1 && z11) {
            TL_stories.StoryItem storyItem3 = m5Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = m5Var.a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = m5Var.a;
        ah.m1.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        t1 t1Var;
        if (this.O3 != null) {
            return;
        }
        pb pbVar = this.J0;
        if (pbVar != null && (t1Var = pbVar.A0) != null) {
            if (t1Var.v == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.C2).getSendAsPeers(this.B1, true);
        this.O3 = sendAsPeers;
        n3 n3Var = this.b2;
        if (n3Var == null || sendAsPeers == null) {
            return;
        }
        n3Var.P1(true);
    }

    public final boolean N0() {
        n3 n3Var = this.b2;
        if (n3Var == null) {
            return false;
        }
        boolean z10 = n3Var.y2;
        if (z10) {
            n3Var.s1();
        }
        AndroidUtilities.runOnUIThread(new q2(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j3;
        o1 o1Var;
        int i10;
        long j10;
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
        long j11 = this.L3;
        o1 o1Var2 = new o1(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, (org.telegram.ui.ActionBar.f6) bVar, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j3 = j11;
            o1Var = o1Var2;
            i10 = ((org.telegram.ui.Components.z5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.z5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j3 = j11;
            o1Var = o1Var2;
            i10 = 0;
        }
        int max = (int) Math.max(messageMinPrice, j3 <= 0 ? 100L : j3);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                j10 = messageMinPrice;
                break;
            }
            int i13 = length * 7;
            int i14 = iArr[i13];
            j10 = messageMinPrice;
            int i15 = iArr[i13 + 2];
            if (i10 <= iArr[i13 + 3] && charSequence.length() <= i15) {
                max = Math.max(max, i14);
                break;
            } else {
                length--;
                messageMinPrice = j10;
            }
        }
        final long[] jArr = {max};
        final nq[] nqVarArr = new nq[1];
        final di.d dVar = new di.d(context, null, true);
        final e1 e1Var = new e1();
        e1Var.c = clientUserId;
        e1Var.f = textWithEntities;
        e1Var.g = jArr[0];
        final z0 z0Var = new z0(i12, context, true);
        LinearLayout f7 = wl.f(context, 0);
        final ah.y yVar = new ah.y(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        f7.addView(yVar, w7.x5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final ah.y yVar2 = new ah.y(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        f7.addView(yVar2, w7.x5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final ah.y yVar3 = new ah.y(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        f7.addView(yVar3, w7.x5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final y yVar4 = new y(context, bVar, r6);
        final boolean[] zArr = {true};
        o1 o1Var3 = o1Var;
        long j12 = j10;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() { // from class: bi.w
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(zh.v7.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), nqVarArr), true, true);
                long j13 = jArr2[0];
                e1 e1Var2 = e1Var;
                e1Var2.g = j13;
                z0Var.set(e1Var2);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = z.b(i16, intValue2, 0);
                int b11 = z.b(i16, num.intValue(), 1);
                int b12 = z.b(i16, num.intValue(), 2);
                ((org.telegram.ui.Components.q6) yVar.b).c(b10 >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.q6) yVar2.b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.q6) yVar3.b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = z.b(i16, num.intValue(), 3);
                int b14 = z.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                yVar4.f(b13, b14, true ^ zArr2[0]);
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
            if (iArr2[i18] >= j12) {
                if (i18 > 0 && arrayList.isEmpty() && iArr3[i18] > j12) {
                    arrayList.add(Integer.valueOf((int) j12));
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
        if (arrayList.isEmpty() || ((Integer) i2.g.h(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        yVar4.e0 = iArr4;
        yVar4.setValue((int) jArr[0]);
        linearLayout.addView(yVar4, w7.x5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(f7, w7.x5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = w7.b6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.x5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.b6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        wl.p(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.x5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(z0Var, w7.x5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, w7.x5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        f3Var.show();
        dVar.setOnClickListener(new x(o1Var3, jArr, f3Var, 0));
    }

    public final void P0() {
        if (this.b2 == null) {
            return;
        }
        t0();
        this.I2.j0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.b2.P();
        }
        this.I2.J1(-1, true);
        t3 t3Var = this.I2;
        t3Var.Z = this.B1;
        t3Var.r1();
        this.I2.m1().setText(this.b2.getFieldText());
        ((gb) this.Q1).h(this.I2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j3 = this.B1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.C2).getDialog(this.B1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.J0.H(new co(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(long j3) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        long j10;
        di.l4 l4Var;
        t1 t1Var;
        boolean z10 = this.K1;
        n5 n5Var = this.M2;
        if (!z10) {
            n5Var.e = null;
            return;
        }
        m5 m5Var = this.O1;
        boolean z11 = m5Var.f;
        l4 l4Var2 = this.c1;
        if (!z11) {
            if (!m5Var.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j3 + "): null, not a video");
                ((gb) this.Q1).c(null, null, 0L, this.M2);
                n5Var.e = null;
                n5Var.a = false;
                return;
            }
            if (m5Var.f() == null || !new File(m5Var.f()).exists()) {
                TL_stories.StoryItem storyItem = m5Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.B1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = m5Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.C2).getFileReference(m5Var.a);
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
                            sb2.append(m5Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(m5Var.a.id);
                            sb2.append("&did=");
                            sb2.append(m5Var.a.dialogId);
                            Uri parse = Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb2.toString());
                            FileLog.d("StoryViewer requestVideoPlayer(" + j3 + "): playing from " + parse);
                            this.R2 = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((gb) this.Q1).c(document, uri, j3, this.M2);
                            l4Var2.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(m5Var.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j3 + "): playing from attachPath " + fromFile);
                this.R2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j3 + "): playing from null?");
            }
            ((gb) this.Q1).c(document, uri, j3, this.M2);
            l4Var2.invalidate();
            return;
        }
        h5 h5Var = this.Q1;
        TL_stories.StoryItem storyItem3 = m5Var.a;
        long j11 = this.B1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        gb gbVar = (gb) h5Var;
        gbVar.i(true, true);
        pb pbVar = gbVar.d;
        t1 t1Var2 = pbVar.A0;
        if (t1Var2 == null || t1Var2.b != j11 || !t1Var2.f(inputGroupCall)) {
            di.l4 l4Var3 = pbVar.D0;
            if (l4Var3 != null) {
                l4Var3.d(j11, null);
                di.l4 l4Var4 = pbVar.D0;
                SurfaceViewRenderer surfaceViewRenderer = l4Var4.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = l4Var4.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                l4Var4.r = false;
                l4Var4.e(false, false);
            }
            a2 a2Var = a2.Z;
            if (a2Var.S && (t1Var = a2Var.v) != null && t1Var.f(inputGroupCall)) {
                t1 t1Var3 = a2Var.v;
                a2Var.v = null;
                pbVar.A0 = t1Var3;
                a2Var.k(false);
            } else {
                t1 t1Var4 = pbVar.A0;
                if (t1Var4 != null) {
                    if (!t1Var4.n && (!a2Var.S || a2Var.v != t1Var4)) {
                        t1Var4.e();
                    } else if (t1Var4.O != pbVar.D0.getSink()) {
                        pbVar.A0.s(null);
                    }
                    pbVar.A0 = null;
                }
            }
            if (a2Var.S) {
                a2.j();
            }
            ob obVar = pbVar.z0;
            if (obVar != null) {
                obVar.release(null);
                pbVar.z0 = null;
            }
            n5 n5Var2 = pbVar.G0;
            if (n5Var2 != null) {
                n5Var2.c = null;
                n5Var2.b = null;
                n5Var2.a = false;
                n5Var2.e = null;
                n5Var2.f = null;
                n5Var2.d = null;
                n5Var2.b();
                pbVar.G0 = null;
            }
            if (pbVar.A0 == null) {
                t1 t1Var5 = t1.W;
                if (t1Var5 == null || !t1Var5.f(inputGroupCall)) {
                    t1 t1Var6 = new t1(gbVar.c, pbVar.h, storyItem3, j11, i10, z12, inputGroupCall, false, false);
                    j10 = j11;
                    pbVar.A0 = t1Var6;
                    l4Var = pbVar.E0;
                    if (l4Var == null) {
                        pbVar.A0.s(l4Var.getSink());
                    } else {
                        pbVar.A0.s(pbVar.D0.getSink());
                    }
                    pbVar.G0 = n5Var;
                    n5Var.a = false;
                    n5Var.e = pbVar.y0;
                    di.l4 l4Var5 = pbVar.D0;
                    n5Var.f = l4Var5.d;
                    n5Var.d = l4Var5.c;
                    n5Var.b = pbVar.A0;
                    l4Var5.d(j10, n5Var);
                    pbVar.G0.b();
                } else {
                    pbVar.A0 = t1.W;
                }
            }
            j10 = j11;
            l4Var = pbVar.E0;
            if (l4Var == null) {
            }
            pbVar.G0 = n5Var;
            n5Var.a = false;
            n5Var.e = pbVar.y0;
            di.l4 l4Var52 = pbVar.D0;
            n5Var.f = l4Var52.d;
            n5Var.d = l4Var52.c;
            n5Var.b = pbVar.A0;
            l4Var52.d(j10, n5Var);
            pbVar.G0.b();
        }
        l4Var2.invalidate();
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
        String str2;
        boolean z10;
        if (uri == null || (storyItem = this.O1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String uri2 = uri.toString();
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                String str3 = uri2.split("/1/")[1];
                int indexOf = str3.indexOf("/ACTUAL");
                parse = indexOf != -1 ? Uri.parse(URLDecoder.decode(str3.substring(0, indexOf), "UTF-8")) : uri;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            String path = AndroidUtilities.getPath(parse);
            if (BuildVars.NO_SCOPED_STORAGE) {
                str = path;
                str2 = str;
                z10 = true;
            } else {
                if (path == null) {
                    String uri3 = parse.toString();
                    String copyFileToCache = MediaController.copyFileToCache(parse, "file");
                    if (copyFileToCache == null) {
                        Z0();
                        return;
                    } else {
                        str2 = uri3;
                        str = copyFileToCache;
                    }
                } else {
                    str = path;
                    str2 = str;
                }
                z10 = false;
            }
            if (z10) {
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), str, str2, null, null, null, this.B1, null, null, storyItem, null, null, true, 0, null, null, false);
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

    public final void T0(long j3, boolean z10) {
        if (this.K1 != z10) {
            this.K1 = z10;
            aj0 aj0Var = this.z0;
            if (z10) {
                if (this.J0.a && Build.VERSION.SDK_INT < 33) {
                    pb pbVar = ((gb) this.Q1).d;
                    pbVar.l1 = true;
                    pbVar.P();
                    androidx.activity.i iVar = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 100L);
                }
                R0(j3);
                g1();
                aj0Var.setAnimation(this.x1.u);
                this.K1 = true;
                this.o1.a.getImageReceiver().setVisible(true, true);
                m5 m5Var = this.O1;
                if (m5Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + m5Var.a.id + " " + m5.c(m5Var));
                }
            } else {
                p0();
                aj0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.c1.invalidate();
                invalidate();
                q0();
                pb pbVar2 = ((gb) this.Q1).d;
                pbVar2.I0 = false;
                pbVar2.P();
            }
            this.e1.setFileLoadingPriority(this.K1 ? 3 : 2);
            this.f1.setFileLoadingPriority(this.K1 ? 2 : 0);
            this.g1.setFileLoadingPriority(this.K1 ? 2 : 0);
            if (this.C1 || this.D1) {
                u8 u8Var = this.S1;
                long j10 = this.B1;
                boolean z11 = this.K1;
                a0.i iVar2 = u8Var.m;
                yb ybVar = (yb) iVar2.f(j10);
                if (ybVar == null) {
                    ybVar = new yb(u8Var.a, j10, u8Var);
                    iVar2.k(ybVar, j10);
                }
                ybVar.b(z11);
            }
        }
    }

    public final void U0(int i10, long j3) {
        if (this.B1 != j3) {
            m5 m5Var = this.O1;
            m5Var.b = null;
            m5Var.a = null;
        }
        this.B1 = j3;
        this.z1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        u8 u8Var = this.S1;
        TL_stories.PeerStories y3 = u8Var.y(j3);
        if (y3 == null) {
            y3 = u8Var.z(j3);
        } else {
            z10 = false;
        }
        u8Var.S(y3, z10);
    }

    public final void W0(long j3, boolean z10, boolean z11) {
        if (!z10 && j3 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j3;
        this.N3 = z11;
        k5 k5Var = this.o1;
        if (j3 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j3));
            j5 j5Var = k5Var.b;
            j5 j5Var2 = k5Var.b;
            j5Var.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                j5Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            oq oqVar = new oq(mutate, null);
            oqVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            oqVar.h = dp;
            oqVar.n = dp2;
            j5Var2.i(oqVar);
            return;
        }
        if (this.C1 && !z11) {
            k5Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            k5Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j3));
        if (user == null || !user.verified) {
            k5Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            oq oqVar2 = new oq(mutate2, null);
            oqVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            oqVar2.h = dp3;
            oqVar2.n = dp4;
            k5Var.b.i(oqVar2);
        }
        if (user != null) {
            k5Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), k5Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            k5Var.b.l(null, false);
        }
    }

    public final void X0(float f7, float f10, v5 v5Var) {
        this.m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 == v5Var) {
            return;
        }
        this.l1 = v5Var;
        if (v5Var != null) {
            ImageReceiver imageReceiver = v5Var.a;
            if (imageReceiver.getBitmap() != null) {
                this.e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void Y0(boolean z10) {
        m5 m5Var = this.O1;
        if (m5Var.a != null) {
            pb pbVar = this.J0;
            if (pbVar.f != null) {
                String e7 = m5Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e7);
                    LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                w3 w3Var = new w3(this, pbVar.f.getContext(), e7, e7, MessagesController.getInstance(this.C2).storiesEnabled() && (!(this.D1 || UserObject.isService(this.B1)) || ChatObject.isPublic(this.D1 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null)), new k3(2, this.B0));
                this.Z2 = w3Var;
                w3Var.i0 = true;
                TL_stories.StoryItem storyItem = m5Var.a;
                storyItem.dialogId = this.B1;
                w3Var.F0 = storyItem;
                w3Var.s0 = new xa.c(this, 7);
                ((gb) this.Q1).h(w3Var);
            }
        }
    }

    public final void Z0() {
        l4 l4Var = this.c1;
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        org.telegram.messenger.w1.p(R.string.UnsupportedAttachment, new yc(l4Var, f6Var), f6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.T = string;
        ((gb) this.Q1).h(b2Var);
    }

    public final void b1(boolean z10) {
        if (this.s3 != z10) {
            m5 m5Var = this.O1;
            if (m5Var.a == null) {
                return;
            }
            this.s3 = z10;
            int i10 = 0;
            if (z10) {
                this.r3.setVisibility(0);
            }
            this.r3.setStoryItem(m5Var.a);
            pb pbVar = ((gb) this.Q1).d;
            pbVar.p1 = z10;
            pbVar.P();
            if (!z10) {
                if (this.r3.getReactionsWindow() != null) {
                    this.r3.getReactionsWindow().e();
                }
                this.r3.animate().alpha(0.0f).setDuration(150L).setListener(new i3(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t3, z10 ? 1.0f : 0.0f);
            this.r3.setTransitionProgress(this.t3);
            ofFloat.addUpdateListener(new r2(this, 1));
            ofFloat.addListener(new h3(this, z10, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(pr.g);
            ofFloat.start();
        }
    }

    public final void c1(boolean z10) {
        if (this.G0 == null) {
            di.f4 f4Var = new di.f4(getContext(), 1);
            f4Var.l(1.0f, -56.0f);
            this.G0 = f4Var;
            f4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.c1.addView(this.G0, w7.x5.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
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
        pb pbVar = this.J0;
        boolean z10 = false;
        if (i10 == i12 || (i10 == NotificationCenter.storiesListUpdated && pbVar.O0 == objArr[0])) {
            h5 h5Var = this.Q1;
            if (h5Var == null || !((gb) h5Var).d.H0) {
                if (this.K1) {
                    j1();
                    if (this.A1 == 0) {
                        if (this.E2) {
                            return;
                        }
                        this.E2 = true;
                        ((gb) this.Q1).j();
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
                TL_stories.PeerStories peerStories = pbVar.Q0;
                if (peerStories != null) {
                    this.S1.S(peerStories, true);
                } else {
                    long j3 = this.B1;
                    if (j3 != 0) {
                        u8 u8Var = this.S1;
                        TL_stories.PeerStories y3 = u8Var.y(j3);
                        if (y3 == null) {
                            y3 = u8Var.z(j3);
                            z10 = true;
                        }
                        u8Var.S(y3, z10);
                    }
                }
                org.telegram.ui.ActionBar.f1 f1Var = this.s1;
                if (f1Var != null) {
                    f1Var.animate().alpha((this.S1.K(this.B1) && this.O1.e && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
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
            n8 o9 = MessagesController.getInstance(this.C2).getStoriesController().o();
            if (o9 == null || !o9.a(this.C2, 1) || this.Q1 == null) {
                return;
            }
            l3 l3Var = new l3(this, 0);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            ((gb) this.Q1).h(new sg.k0(o9.b(), this.C2, findActivity, l3Var, null));
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
        if (pbVar == null || (t1Var = pbVar.A0) == null || t1Var.g() != longValue) {
            return;
        }
        f1(false);
        n3 n3Var = this.b2;
        if (n3Var != null) {
            n3Var.K(true);
            this.b2.P1(true);
            r0(true);
        }
        e3 e3Var = this.L0;
        if (e3Var != null) {
            t1 t1Var2 = e3Var.P;
            if (e3Var.H != (t1Var2 != null ? t1Var2.j() : 0L)) {
                e3Var.e.N(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ke keVar;
        Canvas canvas2;
        org.telegram.ui.Components.p6 p6Var;
        org.telegram.ui.Components.p6 p6Var2;
        l1();
        if (this.D1 && (p6Var2 = this.Q0) != null) {
            p6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (p6Var = this.R0) != null) {
            p6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.u3;
        LinearLayout linearLayout = this.O0;
        z3 z3Var = this.D0;
        if (z10) {
            float measuredWidth = (z3Var.getMeasuredWidth() / 2.0f) + z3Var.getX() + linearLayout.getX();
            float measuredHeight = (z3Var.getMeasuredHeight() / 2.0f) + z3Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.w3, measuredWidth - f7, pr.g.getInterpolation(this.v3));
            float lerp2 = AndroidUtilities.lerp(this.x3, measuredHeight - f7, this.v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.v3);
            if (this.p3) {
                org.telegram.ui.Components.q5 q5Var = this.o3;
                if (q5Var != null) {
                    float f10 = lerp3;
                    q5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
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
            float measuredWidth2 = (z3Var.getMeasuredWidth() / 2.0f) + z3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (z3Var.getMeasuredHeight() / 2.0f) + z3Var.getY() + linearLayout.getY();
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
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().y()) {
                    this.q3 = false;
                }
            }
        }
        n3 n3Var = this.b2;
        if (n3Var != null) {
            me meVar = n3Var.x1;
            ke keVar2 = n3Var.y1;
            if (n3Var.getAlpha() == 0.0f || (keVar = n3Var.e1) == null || keVar.getParent() == null || n3Var.e1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(n3Var.e1.getX() + meVar.getX() + keVar2.getX() + n3Var.getX(), n3Var.e1.getY() + meVar.getY() + keVar2.getY() + n3Var.getY());
            if (n3Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, n3Var.getMeasuredWidth(), n3Var.getMeasuredHeight(), (int) (n3Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            n3Var.e1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        gh.d dVar;
        float dp;
        if (view == this.d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.d3.getY(), getMeasuredWidth(), this.d3.getY() + this.d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        n3 n3Var = this.b2;
        Paint paint = this.n2;
        z3 z3Var = this.D0;
        l5 l5Var = this.x1;
        if (view == n3Var) {
            float f7 = this.q2;
            m5 m5Var = this.O1;
            if (f7 > 0.0f && !m5Var.f) {
                l5Var.l.setAlpha((int) (f7 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), l5Var.l);
            }
            RectF rectF = l5Var.h;
            RectF rectF2 = l5Var.i;
            RectF rectF3 = l5Var.j;
            rectF.set(this.b2.getX(), this.b2.getY() + this.b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.b2.getX() + this.b2.getMeasuredWidth(), this.b2.getY() + this.b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (m5Var.f) {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                f2 f2Var = this.a2;
                if (f2Var != null && f2Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (z3Var != null && z3Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + z3Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.b2.setTranslationX((1.0f - this.q2) * dp);
            this.b2.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.z(1.0f, this.q2, -AndroidUtilities.dp(2.0f), this.b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.q2) * (this.b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, l5Var.h, this.q2, rectF3);
            dh.d dVar2 = this.l2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.p(dp3);
                dVar2.setAlpha((int) ((1.0f - this.d4) * (1.0f - this.r2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.q2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (n3Var != null && n3Var.u0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = l5Var.k;
                RectF rectF5 = l5Var.k;
                rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.a4;
                path.rewind();
                path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                dh.d dVar3 = this.m2;
                if (dVar3 != null) {
                    dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    dVar3.q(dp4, dp4, dp4, dp4);
                    dVar3.setAlpha(255);
                    dVar3.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, dp4, dp4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.f2 || this.b2 == null) {
                if (view == this.r3) {
                    view.setTranslationY((this.O0.getY() + (z3Var.getY() + (-(r2.getMeasuredHeight() - this.r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    l4 l4Var = this.c1;
                    if (view == l4Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(l4Var.getX(), l4Var.getY());
                        view.draw(a2);
                        dVar.b();
                    }
                }
            } else {
                view.setTranslationY(((this.b2.getY() + this.b2.getAnimatedTop()) + (-r2.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e1() {
        if (MessagesController.getInstance(this.C2).storiesEnabled()) {
            File h = this.O1.h();
            if (h == null || !h.exists()) {
                a1();
                return;
            }
            w3 w3Var = this.Z2;
            if (w3Var != null) {
                w3Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new q2(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0948, code lost:
    
        if (r15.g == (r2 == null && r2.translated && r2.translatedText != null && android.text.TextUtils.equals(r2.translatedLng, org.telegram.ui.Components.u31.B()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x09a8, code lost:
    
        if (r3 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x09cd, code lost:
    
        if (r3 != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0ae1, code lost:
    
        if (r4 != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0afa, code lost:
    
        if (r4 != false) goto L557;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0bf6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0c0f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0ca1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0d21  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0d88  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0d99  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0db1 A[EDGE_INSN: B:311:0x0db1->B:312:0x0db1 BREAK  A[LOOP:0: B:300:0x0d8f->B:309:0x0dae], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0dbf  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0e25  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0e62  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0e71  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0e91  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0f2b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0f5c  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0f6b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0fb2  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0fe1  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0ffe  */
    /* JADX WARN: Removed duplicated region for block: B:406:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0fd1  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0edb  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e35  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0e1c  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0d41  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x0405  */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73, types: [bi.z9, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z10) {
        t8 t8Var;
        TL_stories.StoryItem storyItem;
        t8 t8Var2;
        boolean z11;
        boolean z12;
        int i10;
        gz gzVar;
        TL_stories.StoryItem storyItem2;
        y3 y3Var;
        boolean z13;
        mb mbVar;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        pb pbVar;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem4;
        boolean z14;
        boolean z15;
        TL_stories.StoryItem storyItem5;
        pb pbVar2;
        t8 t8Var3;
        TLRPC.MessageMedia messageMedia;
        di.o8 o8Var;
        TL_stories.StoryItem storyItem6;
        t8 t8Var4;
        int i11;
        di.o8 o8Var2;
        boolean z16;
        l4 l4Var;
        s4 s4Var;
        k5 k5Var;
        n3 n3Var;
        boolean z17;
        t8 t8Var5;
        qc qcVar;
        boolean z18;
        TL_stories.StoryItem storyItem7;
        y3 y3Var2;
        boolean z19;
        t8 t8Var6;
        m5 m5Var;
        boolean z20;
        boolean z21;
        l4 l4Var2;
        s4 s4Var2;
        boolean z22;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        CharSequence charSequence2;
        TLRPC.MessageMedia messageMedia2;
        boolean z23;
        di.f4 f4Var;
        di.f4 f4Var2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence4;
        TL_stories.StoryItem storyItem10;
        h5 h5Var;
        boolean z24;
        boolean z25;
        LinearLayout linearLayout;
        boolean z26;
        boolean z27;
        n3 n3Var2;
        n3 n3Var3;
        int i13;
        boolean z28;
        boolean z29;
        boolean z30;
        int i14;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        kh.h hVar;
        a aVar;
        f2 f2Var;
        boolean z35;
        TL_stories.StoryItem storyItem11;
        boolean z36;
        int i15;
        int i16;
        boolean z37;
        boolean z38;
        boolean l4;
        t8 t8Var7;
        t8 t8Var8;
        di.f4 f4Var3;
        ImageView imageView;
        ImageView imageView2;
        boolean z39;
        int i17;
        boolean z40;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i18;
        int i19;
        int i20;
        boolean z41;
        int i21;
        boolean z42;
        boolean z43;
        TL_stories.StoryItem storyItem13;
        int i22;
        int i23;
        FrameLayout.LayoutParams layoutParams;
        int dp;
        boolean z44;
        boolean z45;
        int i24;
        boolean z46;
        t1 t1Var;
        int i25;
        boolean z47;
        int i26;
        boolean z48;
        int i27;
        boolean z49;
        boolean z50;
        boolean z51;
        boolean z52;
        t1 t1Var2;
        String str;
        BitmapDrawable bitmapDrawable;
        y3 y3Var3;
        boolean z53;
        pb pbVar3;
        gz gzVar2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        l8 l8Var;
        ArrayList arrayList2 = this.v1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.w1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.V2 = true;
        m5 m5Var2 = this.O1;
        TL_stories.StoryItem storyItem14 = m5Var2.a;
        t8 t8Var9 = m5Var2.b;
        String s10 = p9.s();
        this.Z0 = false;
        this.c3 = false;
        int i28 = this.J1;
        boolean z54 = this.T1;
        boolean z55 = this.U1;
        boolean z56 = this.V1;
        pb pbVar4 = this.J0;
        if (pbVar4 == null || (l8Var = pbVar4.O0) == null || l8Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i28 < 0 || i28 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i28);
            int size = i28 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            t8Var = (size < 0 || size >= arrayList3.size()) ? null : (t8) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            t8Var = (i28 < 0 || i28 >= arrayList3.size()) ? null : (t8) arrayList3.get(i28);
            int size2 = i28 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        m5Var2.c = null;
        h4 h4Var = this.j1;
        int i29 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        gz gzVar3 = this.k1;
        y3 y3Var4 = this.e1;
        if (t8Var != null) {
            di.o8 o8Var3 = t8Var.c;
            this.U1 = false;
            boolean z57 = t8Var.I;
            this.V1 = z57;
            this.T1 = !z57;
            y3Var4.setCrossfadeWithOldImage(false);
            y3Var4.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = o8Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (t8Var.s || t8Var.H) {
                t8Var2 = t8Var9;
                y3Var3 = y3Var4;
                z11 = z54;
                z53 = z55;
                z12 = z56;
                pbVar3 = pbVar4;
                i10 = i28;
                gzVar2 = gzVar3;
                r62 = 0;
                this.e1.setImage(null, null, ImageLocation.getForPath(t8Var.f), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                t8Var2 = t8Var9;
                gzVar2 = gzVar3;
                r62 = 0;
                y3Var3 = y3Var4;
                z11 = z54;
                z12 = z56;
                z53 = z55;
                pbVar3 = pbVar4;
                i10 = i28;
                this.e1.setImage(null, null, ImageLocation.getForPath(t8Var.e), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            m5Var2.b = t8Var;
            m5Var2.j = r62;
            m5Var2.i = r62;
            m5Var2.a = r62;
            m5Var2.d = false;
            m5Var2.e = m5Var2.m();
            TL_stories.StoryItem storyItem17 = m5Var2.a;
            m5Var2.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            gzVar = gzVar2;
            h4Var.c(r62, ta.a(o8Var3), gzVar);
            this.U2 = false;
            this.T2 = false;
            this.S2 = false;
            storyItem2 = storyItem14;
            z13 = z53;
            y3Var = y3Var3;
            pbVar = pbVar3;
        } else {
            t8Var2 = t8Var9;
            z11 = z54;
            z12 = z56;
            i10 = i28;
            gzVar = gzVar3;
            this.T1 = false;
            this.U1 = false;
            this.V1 = false;
            if (storyItem == null) {
                if (pbVar4 != null) {
                    pbVar4.q(true);
                    return;
                }
                return;
            }
            t8 t10 = this.S1.t(this.B1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.U1 = true;
                y3Var4.setCrossfadeWithOldImage(false);
                if (this.i1 != null) {
                    i29 = 0;
                }
                y3Var4.setCrossfadeDuration(i29);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    t8Var3 = t10;
                    y3Var = y3Var4;
                    pbVar2 = pbVar4;
                    this.e1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    pbVar2 = pbVar4;
                    y3Var = y3Var4;
                    t8Var3 = t10;
                    this.e1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                }
                m5Var2.b = t8Var3;
                m5Var2.j = null;
                m5Var2.i = null;
                m5Var2.a = null;
                m5Var2.d = false;
                m5Var2.e = m5Var2.m();
                TL_stories.StoryItem storyItem18 = m5Var2.a;
                m5Var2.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                h4Var.c(null, ta.a(t8Var3.c), gzVar);
                m5Var2.c = storyItem;
                this.U2 = false;
                this.T2 = false;
                this.S2 = false;
                z13 = z55;
                pbVar = pbVar2;
            } else {
                storyItem2 = storyItem14;
                y3Var = y3Var4;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.B1;
                z13 = z55;
                y3Var.setCrossfadeWithOldImage(z13);
                y3Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.c3 = true;
                    MessagesController.getInstance(this.C2).getStoriesController().p(storyItem.id, this.B1);
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
                                    this.e1.setImage(null, null, ImageLocation.getForPath(storyItem.firstFramePath), s10, null, null, createStripedBitmap, 0L, null, null, 0);
                                }
                            }
                            this.e1.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), org.telegram.ui.Cells.p6.t(s10, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
                        } else {
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            Drawable createStripedBitmap2 = photo != null ? ImageLoader.createStripedBitmap(photo.sizes) : null;
                            if (z13) {
                                this.e1.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, ImageLocation.getForPath(storyItem.firstFramePath), s10, createStripedBitmap2, 0L, null, null, 0);
                            } else {
                                this.e1.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, null, null, createStripedBitmap2, 0L, null, null, 0);
                            }
                        }
                    } else {
                        Drawable drawable = ((pbVar4.O0 != null || pbVar4.N0) && (mbVar = pbVar4.s0) != null && (imageReceiver = mbVar.c) != null && mbVar.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.B1;
                        if (z58) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String t11 = org.telegram.ui.Cells.p6.t(s10, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            storyItem4 = storyItem;
                            pbVar = pbVar4;
                            this.e1.setImage(null, null, forDocument, t11, forDocument2, s10, drawable, 0L, null, storyItem4, 0);
                        } else {
                            storyItem3 = storyItem;
                            pbVar = pbVar4;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                y3Var.clearImage();
                                storyItem3.dialogId = this.B1;
                                h4Var.d(z10 ? null : storyItem3, gzVar);
                                m5Var2.n(storyItem3);
                                z14 = (!this.c3 || (storyItem5 = m5Var2.a) == null || (storyItem5 instanceof TL_stories.TL_storyItemDeleted) || (storyItem5 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                                this.U2 = z14;
                                this.S2 = z14;
                                if (z14) {
                                    this.S2 = m5Var2.d() && m5Var2.a.isPublic;
                                }
                                if (this.S2) {
                                    TL_stories.StoryItem storyItem19 = m5Var2.a;
                                    this.S2 = storyItem19.pinned || !p9.w(this.C2, storyItem19);
                                }
                                z15 = this.S2;
                                this.T2 = z15;
                                if (z15 && this.D1) {
                                    TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                                    this.T2 = chat == null && ChatObject.isPublic(chat);
                                }
                                if (this.U2) {
                                    if (this.D1) {
                                        TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                                        this.U2 = (chat2 == null || ChatObject.getPublicUsername(chat2) == null) ? false : true;
                                    } else {
                                        TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
                                        this.U2 = (user == null || UserObject.getPublicUsername(user) == null || !m5Var2.a.isPublic) ? false : true;
                                    }
                                }
                                NotificationsController.getInstance(this.C2).processReadStories(this.B1, storyItem3.id);
                            } else {
                                if (drawable == null) {
                                    drawable = ImageLoader.createStripedBitmap(arrayList);
                                }
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 800);
                                storyItem4 = storyItem3;
                                this.e1.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2), s10, null, null, drawable, 0L, null, storyItem4, 0);
                            }
                        }
                        storyItem3 = storyItem4;
                        storyItem3.dialogId = this.B1;
                        h4Var.d(z10 ? null : storyItem3, gzVar);
                        m5Var2.n(storyItem3);
                        if (!this.c3) {
                        }
                        this.U2 = z14;
                        this.S2 = z14;
                        if (z14) {
                        }
                        if (this.S2) {
                        }
                        z15 = this.S2;
                        this.T2 = z15;
                        if (z15) {
                            TLRPC.Chat chat3 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                            this.T2 = chat3 == null && ChatObject.isPublic(chat3);
                        }
                        if (this.U2) {
                        }
                        NotificationsController.getInstance(this.C2).processReadStories(this.B1, storyItem3.id);
                    }
                }
                storyItem3 = storyItem;
                pbVar = pbVar4;
                storyItem3.dialogId = this.B1;
                h4Var.d(z10 ? null : storyItem3, gzVar);
                m5Var2.n(storyItem3);
                if (!this.c3) {
                }
                this.U2 = z14;
                this.S2 = z14;
                if (z14) {
                }
                if (this.S2) {
                }
                z15 = this.S2;
                this.T2 = z15;
                if (z15) {
                }
                if (this.U2) {
                }
                NotificationsController.getInstance(this.C2).processReadStories(this.B1, storyItem3.id);
            }
        }
        TL_stories.StoryItem storyItem20 = m5Var2.a;
        if (storyItem20 != null && !z10) {
            pbVar.P0 = storyItem20.id;
        }
        pbVar.n0.A();
        this.Y2 = true;
        if (this.C1 || this.D1) {
            k1(false);
        }
        TL_stories.StoryItem storyItem21 = m5Var2.a;
        t8 t8Var10 = m5Var2.b;
        int i30 = storyItem21 != null ? storyItem21.id : (t8Var10 == null || (o8Var = t8Var10.c) == null) ? 0 : o8Var.f;
        if (storyItem2 != null) {
            storyItem6 = storyItem2;
            i11 = storyItem6.id;
            t8Var4 = t8Var2;
        } else {
            storyItem6 = storyItem2;
            t8Var4 = t8Var2;
            i11 = (t8Var2 == null || (o8Var2 = t8Var4.c) == null) ? 0 : o8Var2.f;
        }
        boolean z59 = i30 == i11 || !(t8Var4 == null || storyItem21 == null || !TextUtils.equals(t8Var4.e, storyItem21.attachPath));
        boolean z60 = z59 && !(this.U1 == z13 && this.T1 == z11 && this.V1 == z12);
        t1 t1Var3 = pbVar.A0;
        if (t1Var3 != null) {
            int i31 = this.Q3;
            TLRPC.GroupCall groupCall = t1Var3.v;
            if (i31 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                z16 = true;
                l4Var = this.c1;
                s4Var = this.K0;
                k5Var = this.o1;
                if ((t8Var4 != null || (str = t8Var4.e) == null || !str.equals(m5Var2.f())) && (storyItem6 == null || (storyItem7 = m5Var2.a) == null || storyItem6.id != storyItem7.id)) {
                    n3Var = this.b2;
                    if (n3Var != null) {
                        if (storyItem6 != null && !TextUtils.isEmpty(n3Var.getEditField().getText())) {
                            pb.J(storyItem6.dialogId, storyItem6, this.b2.getEditField().getText());
                        }
                        this.b2.getEditField().setText(pb.u(this.B1, m5Var2.a));
                        z18 = m5Var2.f;
                        if (z18) {
                            this.b2.U0(false, false);
                        } else {
                            this.b2.U0(true, true);
                        }
                    }
                    z17 = m5Var2.f;
                    if (z17) {
                        M0();
                    }
                    gzVar.c();
                    this.W0 = 0L;
                    this.Y0 = false;
                    t8Var5 = m5Var2.b;
                    if (t8Var5 == null) {
                        bj0 bj0Var = k5Var.d;
                        if (bj0Var != null) {
                            bj0Var.e(t8Var5.h, false);
                        }
                        k5Var.a.invalidate();
                    } else if (!z60) {
                        k5Var.h = 0.0f;
                    }
                    qcVar = qc.w;
                    if (qcVar != null && qcVar.h == l4Var) {
                        qcVar.b();
                    }
                    s4Var.J();
                    q0();
                    z16 = true;
                }
                if (!z16 || (t8Var4 != null && m5Var2.b == null)) {
                    k5Var.setOnSubtitleClick(null);
                    TextView[] textViewArr = k5Var.c;
                    this.Q3 = 0;
                    boolean z61 = z60;
                    long j3 = this.B1;
                    y3Var2 = y3Var;
                    z19 = m5Var2.f;
                    W0(j3, false, z19);
                    t8Var6 = m5Var2.b;
                    if (t8Var6 == null) {
                        m5Var = m5Var2;
                        charSequence2 = t8Var6.I ? LocaleController.getString(R.string.FailedToUploadStory) : p9.u(textViewArr[0], this.U1);
                    } else if (I0()) {
                        TL_stories.StoryItem storyItem22 = m5Var2.a;
                        if (storyItem22 == null || (messageMedia2 = storyItem22.media) == null) {
                            m5Var = m5Var2;
                        } else {
                            if (messageMedia2.document != null) {
                                m5Var = m5Var2;
                                charSequence2 = LocaleController.formatStoryDate(r13.date);
                            } else {
                                m5Var = m5Var2;
                                if (messageMedia2.photo != null) {
                                    charSequence2 = LocaleController.formatStoryDate(r2.date);
                                }
                            }
                        }
                        charSequence2 = "";
                    } else {
                        m5Var = m5Var2;
                        TL_stories.StoryItem storyItem23 = m5Var.a;
                        if (storyItem23 == null) {
                            z20 = z16;
                            z21 = z59;
                            l4Var2 = l4Var;
                            s4Var2 = s4Var;
                            z22 = z61;
                            charSequence = null;
                        } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                            spannableStringBuilder2.setSpan(new b4(), 0, spannableStringBuilder2.length(), 33);
                            spannableStringBuilder2.append((CharSequence) "  ");
                            t1 t1Var4 = pbVar.A0;
                            if (t1Var4 != null) {
                                TLRPC.GroupCall groupCall2 = t1Var4.v;
                                i12 = 1;
                                this.Q3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                            } else {
                                i12 = 1;
                            }
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i12, this.Q3)));
                            charSequence2 = spannableStringBuilder2;
                        } else if (storyItem23.date == -1) {
                            charSequence2 = LocaleController.getString(R.string.CachedStory);
                        } else {
                            if (m5Var.i() != null) {
                                z9 i32 = m5Var.i();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                z20 = z16;
                                z21 = z59;
                                SpannableString spannableString = new SpannableString("r");
                                l4Var2 = l4Var;
                                s4Var2 = s4Var;
                                spannableString.setSpan(new nq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                spannableStringBuilder3.append((CharSequence) spannableString).append((CharSequence) " ");
                                if (i32.b != null) {
                                    org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.C2);
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(g5Var, 0, 1, 33);
                                    spannableStringBuilder3.append((CharSequence) spannableString2).append((CharSequence) " ");
                                    if (i32.b.longValue() > 0) {
                                        TLRPC.User user2 = MessagesController.getInstance(this.C2).getUser(i32.b);
                                        g5Var.e(user2);
                                        spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user2));
                                    } else {
                                        TLRPC.Chat chat4 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-i32.b.longValue()));
                                        g5Var.b(chat4);
                                        if (chat4 != null) {
                                            spannableStringBuilder3.append((CharSequence) chat4.title);
                                        }
                                    }
                                } else {
                                    String str4 = m5Var.a.fwd_from.from_name;
                                    if (str4 != null) {
                                        spannableStringBuilder3.append((CharSequence) str4);
                                    }
                                }
                                k5Var.setOnSubtitleClick(new u1(1, this, i32));
                                SpannableString spannableString3 = new SpannableString(".");
                                at atVar = new at();
                                atVar.b = AndroidUtilities.dp(1.5f);
                                atVar.c = 5.0f;
                                spannableString3.setSpan(atVar, 0, spannableString3.length(), 33);
                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(m5Var.a.date));
                                spannableStringBuilder = spannableStringBuilder3;
                            } else {
                                z20 = z16;
                                z21 = z59;
                                l4Var2 = l4Var;
                                s4Var2 = s4Var;
                                if (!this.E1 || (storyItem8 = m5Var.a) == null || storyItem8.from_id == null) {
                                    String formatStoryDate = LocaleController.formatStoryDate(m5Var.a.date);
                                    charSequence4 = formatStoryDate;
                                    if (m5Var.a.edited) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                        at atVar2 = new at();
                                        atVar2.b = AndroidUtilities.dp(1.5f);
                                        atVar2.c = 5.0f;
                                        valueOf.append((CharSequence) " . ").setSpan(atVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                        valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                        charSequence4 = valueOf;
                                    }
                                    z22 = z61;
                                    charSequence = charSequence4;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                    org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.C2);
                                    SpannableString spannableString4 = new SpannableString("a");
                                    spannableString4.setSpan(g5Var2, 0, 1, 33);
                                    spannableStringBuilder4.append((CharSequence) spannableString4).append((CharSequence) " ");
                                    long peerDialogId = DialogObject.getPeerDialogId(m5Var.a.from_id);
                                    if (peerDialogId > 0) {
                                        TLRPC.User user3 = MessagesController.getInstance(this.C2).getUser(Long.valueOf(peerDialogId));
                                        g5Var2.e(user3);
                                        spannableStringBuilder4.append((CharSequence) UserObject.getUserName(user3));
                                    } else {
                                        TLRPC.Chat chat5 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-peerDialogId));
                                        g5Var2.b(chat5);
                                        if (chat5 != null) {
                                            spannableStringBuilder4.append((CharSequence) chat5.title);
                                        }
                                    }
                                    k5Var.setOnSubtitleClick(new o2(this, peerDialogId, 0));
                                    SpannableString spannableString5 = new SpannableString(".");
                                    at atVar3 = new at();
                                    atVar3.b = AndroidUtilities.dp(1.5f);
                                    atVar3.c = 5.0f;
                                    spannableString5.setSpan(atVar3, 0, spannableString5.length(), 33);
                                    spannableStringBuilder4.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(m5Var.a.date));
                                    spannableStringBuilder = spannableStringBuilder4;
                                }
                            }
                            z22 = false;
                            charSequence = spannableStringBuilder;
                        }
                        if (charSequence != null) {
                            l8 l8Var2 = pbVar.O0;
                            if (l8Var2 == null || (storyItem9 = m5Var.a) == null || !l8Var2.m(storyItem9.id)) {
                                z23 = false;
                                charSequence3 = charSequence;
                            } else {
                                boolean z62 = charSequence instanceof SpannableStringBuilder;
                                CharSequence charSequence5 = charSequence;
                                if (!z62) {
                                    charSequence5 = new SpannableStringBuilder(charSequence);
                                }
                                SpannableString spannableString6 = new SpannableString("p ");
                                z23 = false;
                                spannableString6.setSpan(new nq(R.drawable.msg_pin_mini), 0, 1, 33);
                                ((SpannableStringBuilder) charSequence5).insert(0, (CharSequence) spannableString6);
                                charSequence3 = charSequence5;
                            }
                            k5Var.c(charSequence3, z22);
                        } else {
                            z23 = false;
                        }
                        f4Var = this.F0;
                        if (f4Var != null) {
                            f4Var.e(z23);
                        }
                        f4Var2 = this.G0;
                        if (f4Var2 != null) {
                            f4Var2.e(z23);
                        }
                    }
                    z20 = z16;
                    z21 = z59;
                    l4Var2 = l4Var;
                    s4Var2 = s4Var;
                    charSequence4 = charSequence2;
                    z22 = z61;
                    charSequence = charSequence4;
                    if (charSequence != null) {
                    }
                    f4Var = this.F0;
                    if (f4Var != null) {
                    }
                    f4Var2 = this.G0;
                    if (f4Var2 != null) {
                    }
                } else {
                    m5Var = m5Var2;
                    y3Var2 = y3Var;
                    z20 = z16;
                    z21 = z59;
                    l4Var2 = l4Var;
                    s4Var2 = s4Var;
                }
                storyItem10 = m5Var.a;
                if (storyItem6 == storyItem10 && t8Var4 == m5Var.b) {
                }
                m5Var.o();
                if ((!m5Var.g || storyItem6 != m5Var.a) && (h5Var = this.Q1) != null) {
                    pb pbVar5 = ((gb) h5Var).d;
                    pbVar5.Z0 = false;
                    pbVar5.P();
                }
                z24 = m5Var.f;
                z25 = !z24 && (t1Var2 = pbVar.A0) != null && m5Var.k(t1Var2.g()) && pbVar.A0.b();
                if (z25 != this.G1) {
                    this.G1 = z25;
                    if (z25) {
                        z0();
                    }
                    if (this.g2 != null && (this.F1 || this.G1)) {
                        h1();
                    }
                    n3 n3Var4 = this.b2;
                    if (n3Var4 != null) {
                        if (this.F1) {
                            z52 = m5Var.f;
                        }
                        if (!this.G1) {
                            z51 = true;
                            n3Var4.setEnabled(z51);
                            z50 = true;
                            this.b2.P1(true);
                        }
                        z51 = false;
                        n3Var4.setEnabled(z51);
                        z50 = true;
                        this.b2.P1(true);
                    } else {
                        z50 = true;
                    }
                    r0(z50);
                }
                linearLayout = this.g2;
                int i33 = 8;
                if (linearLayout != null) {
                    if (this.F1) {
                        z49 = m5Var.f;
                    }
                    if (!this.G1) {
                        i27 = 8;
                        linearLayout.setVisibility(i27);
                    }
                    i27 = 0;
                    linearLayout.setVisibility(i27);
                }
                z26 = this.c3;
                LinearLayout linearLayout2 = this.O0;
                if (z26) {
                    TLRPC.Chat chat6 = this.B1 < 0 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null;
                    z27 = m5Var.f;
                    if (z27) {
                        if (this.b2 == null) {
                            v0();
                        }
                        u0();
                        y0();
                        x0();
                        this.b2.setVisibility(0);
                    } else if ((UserObject.isService(this.B1) || I0()) && (n3Var2 = this.b2) != null) {
                        n3Var2.setVisibility(8);
                    } else if (!this.C1 && ((!this.D1 || (this.E1 && (ChatObject.canSendPlain(chat6) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat6)))) && (n3Var3 = this.b2) != null)) {
                        n3Var3.setVisibility(0);
                    }
                    n3 n3Var5 = this.b2;
                    if (n3Var5 != null) {
                        z32 = m5Var.f;
                        n3Var5.setOnSendButtonLongClick(z32 ? new p2(this, 0) : null);
                        n3 n3Var6 = this.b2;
                        z33 = m5Var.f;
                        D0(true);
                        n3Var6.i1(z33);
                        n3 n3Var7 = this.b2;
                        z34 = m5Var.f;
                        n3Var7.o1(z34 && !D0(true) && (this.v2 || this.b2.W0), true);
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
                            z31 = m5Var.f;
                        }
                        if (!this.G1) {
                            i14 = 8;
                            linearLayout3.setVisibility(i14);
                        }
                        i14 = 0;
                        linearLayout3.setVisibility(i14);
                    }
                    n3 n3Var8 = this.b2;
                    if (n3Var8 != null) {
                        if (this.F1) {
                            z30 = m5Var.f;
                        }
                        if (!this.G1) {
                            z29 = true;
                            n3Var8.setEnabled(z29);
                        }
                        z29 = false;
                        n3Var8.setEnabled(z29);
                    }
                    z3 z3Var = this.W1;
                    if (z3Var != null) {
                        if (this.C1) {
                            z28 = m5Var.f;
                            if (!z28) {
                                i13 = 0;
                                z3Var.setVisibility(i13);
                            }
                        }
                        i13 = 8;
                        z3Var.setVisibility(i13);
                    }
                    FrameLayout frameLayout = this.a3;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (UserObject.isService(this.B1)) {
                        A0();
                        this.b3.setVisibility(0);
                    } else {
                        c4 c4Var = this.b3;
                        if (c4Var != null) {
                            c4Var.setVisibility(8);
                        }
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(I0() ? 8 : 0);
                    }
                } else {
                    C0();
                    A0();
                    this.a3.setVisibility(0);
                    this.b3.setVisibility(0);
                    this.U2 = false;
                    this.T2 = false;
                    this.S2 = false;
                    n3 n3Var9 = this.b2;
                    if (n3Var9 != null) {
                        n3Var9.setVisibility(8);
                    }
                    z3 z3Var2 = this.W1;
                    if (z3Var2 != null) {
                        z3Var2.setVisibility(8);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                }
                hVar = this.c2;
                if (hVar != null) {
                    n3 n3Var10 = this.b2;
                    if (n3Var10 != null && n3Var10.getVisibility() == 0) {
                        z48 = m5Var.f;
                        if (!z48) {
                            i26 = 0;
                            hVar.setVisibility(i26);
                        }
                    }
                    i26 = 8;
                    hVar.setVisibility(i26);
                }
                aVar = this.X1;
                e3 e3Var = this.L0;
                if (aVar != null) {
                    if (!this.c3) {
                        z47 = m5Var.f;
                        if (z47) {
                            i25 = 0;
                            aVar.setVisibility(i25);
                            this.X1.a(e3Var.g(), false);
                            this.X1.setCount(e3Var.getUnreadMessagesCount());
                        }
                    }
                    i25 = 8;
                    aVar.setVisibility(i25);
                    this.X1.a(e3Var.g(), false);
                    this.X1.setCount(e3Var.getUnreadMessagesCount());
                }
                f2Var = this.a2;
                if (f2Var != null) {
                    if (!this.c3) {
                        z46 = m5Var.f;
                        if (z46 && (t1Var = t1.W) != null && m5Var.k(t1Var.g())) {
                            i24 = 0;
                            f2Var.setVisibility(i24);
                            f2 f2Var2 = this.a2;
                            t1 t1Var5 = t1.W;
                            f2Var2.b(t1Var5 == null && t1Var5.o(), true);
                            f2 f2Var3 = this.a2;
                            t1 t1Var6 = t1.W;
                            f2Var3.a(t1Var6 != null || t1Var6.m(), true);
                        }
                    }
                    i24 = 8;
                    f2Var.setVisibility(i24);
                    f2 f2Var22 = this.a2;
                    t1 t1Var52 = t1.W;
                    f2Var22.b(t1Var52 == null && t1Var52.o(), true);
                    f2 f2Var32 = this.a2;
                    t1 t1Var62 = t1.W;
                    f2Var32.a(t1Var62 != null || t1Var62.m(), true);
                }
                if (this.Z1 != null) {
                    k2 k2Var = this.Y1;
                    if (!this.c3) {
                        z45 = m5Var.f;
                        if (z45) {
                            i22 = 0;
                            k2Var.setVisibility(i22);
                            l2 l2Var = this.Z1;
                            if (!this.c3) {
                                z44 = m5Var.f;
                                if (z44) {
                                    i23 = 0;
                                    l2Var.setVisibility(i23);
                                    layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                                    f2 f2Var4 = this.a2;
                                    dp = AndroidUtilities.dp((f2Var4 == null && f2Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != dp) {
                                        layoutParams.rightMargin = dp;
                                        this.Z1.setLayoutParams(layoutParams);
                                    }
                                }
                            }
                            i23 = 8;
                            l2Var.setVisibility(i23);
                            layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                            f2 f2Var42 = this.a2;
                            dp = AndroidUtilities.dp((f2Var42 == null && f2Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != dp) {
                            }
                        }
                    }
                    i22 = 8;
                    k2Var.setVisibility(i22);
                    l2 l2Var2 = this.Z1;
                    if (!this.c3) {
                    }
                    i23 = 8;
                    l2Var2.setVisibility(i23);
                    layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                    f2 f2Var422 = this.a2;
                    dp = AndroidUtilities.dp((f2Var422 == null && f2Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                    if (layoutParams.rightMargin != dp) {
                    }
                }
                z35 = m5Var.f;
                if (!z35 || ((m5Var.h == null && m5Var.i() == null && m5Var.g() == null) || this.c3)) {
                    s4 s4Var3 = s4Var2;
                    if (this.K1) {
                        pb pbVar6 = ((gb) this.Q1).d;
                        pbVar6.L0 = false;
                        pbVar6.P();
                        h5 h5Var2 = this.Q1;
                        this.j3 = false;
                        ((gb) h5Var2).e();
                    }
                    s4Var3.setVisibility(8);
                } else {
                    s4 s4Var4 = s4Var2;
                    s4Var4.b0.b(m5Var.h, m5Var.i(), m5Var.g(), pbVar.Z0 && !m5Var.g && (storyItem13 = m5Var.a) != null && storyItem13.translated, storyItem6 == m5Var.a);
                    s4Var4.setVisibility(0);
                }
                storyItem11 = m5Var.a;
                if (storyItem11 != null) {
                    TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                    if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                        if (e3Var.r(this.B1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                            e3Var.q(false, false);
                            this.L3 = 0L;
                            n3 n3Var11 = this.b2;
                            if (n3Var11 != null) {
                                n3Var11.K(true);
                                this.b2.R1();
                                r0(true);
                            }
                        }
                        e3Var.setVisibility(0);
                        l4Var2.invalidate();
                        if (this.Q1 != null && K0()) {
                            ((gb) this.Q1).a(this.J1, this.B1);
                        }
                        z36 = this.D1;
                        z3 z3Var3 = this.P0;
                        ImageView imageView3 = this.N0;
                        z3 z3Var4 = this.D0;
                        if (z36) {
                            if (this.S2) {
                                z43 = m5Var.f;
                                if (!z43) {
                                    i19 = 0;
                                    imageView3.setVisibility(i19);
                                    if (z3Var3 != null) {
                                        if (this.T2) {
                                            z42 = m5Var.f;
                                            if (!z42) {
                                                i21 = 0;
                                                z3Var3.setVisibility(i21);
                                            }
                                        }
                                        i21 = 8;
                                        z3Var3.setVisibility(i21);
                                    }
                                    if (!this.V1) {
                                        z41 = m5Var.f;
                                        if (!z41) {
                                            i20 = 0;
                                            z3Var4.setVisibility(i20);
                                        }
                                    }
                                    i20 = 8;
                                    z3Var4.setVisibility(i20);
                                }
                            }
                            i19 = 4;
                            imageView3.setVisibility(i19);
                            if (z3Var3 != null) {
                            }
                            if (!this.V1) {
                            }
                            i20 = 8;
                            z3Var4.setVisibility(i20);
                        } else {
                            if (this.S2) {
                                z38 = m5Var.f;
                                if (!z38) {
                                    i15 = 0;
                                    imageView3.setVisibility(i15);
                                    if (z3Var3 != null) {
                                        z3Var3.setVisibility(8);
                                    }
                                    if (!this.C1) {
                                        z37 = m5Var.f;
                                        if (!z37) {
                                            i16 = 0;
                                            z3Var4.setVisibility(i16);
                                            z3Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                        }
                                    }
                                    i16 = 8;
                                    z3Var4.setVisibility(i16);
                                    z3Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                }
                            }
                            i15 = 4;
                            imageView3.setVisibility(i15);
                            if (z3Var3 != null) {
                            }
                            if (!this.C1) {
                            }
                            i16 = 8;
                            z3Var4.setVisibility(i16);
                            z3Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                        }
                        z3Var4.requestLayout();
                        pbVar.e1.append(this.B1, i10);
                        if (this.K1) {
                            R0(0L);
                            g1();
                            y3Var2.bumpPriority();
                        }
                        e3Var.setLivePlayer(pbVar.A0);
                        this.L1 = 0;
                        if (pbVar.O0 != null && (storyItem12 = m5Var.a) != null) {
                            int i34 = storyItem12.id;
                            i18 = 0;
                            while (true) {
                                if (i18 < pbVar.O0.i.size()) {
                                    MessageObject messageObject = (MessageObject) pbVar.O0.i.get(i18);
                                    if (messageObject != null && messageObject.getId() == i34) {
                                        this.L1 = i18;
                                        break;
                                    }
                                    i18++;
                                } else {
                                    break;
                                }
                            }
                        }
                        int i35 = this.J1;
                        this.M1 = i35;
                        int i36 = this.A1;
                        this.N1 = i36;
                        if (pbVar.R0) {
                            this.M1 = (i36 - 1) - i35;
                        }
                        l4 = m5Var.l();
                        g5 g5Var3 = this.y0;
                        if (l4) {
                            g5Var3.setVisibility(0);
                            this.e3 = m5Var.j() ? 1.0f : 0.5f;
                            boolean j10 = m5Var.j();
                            ImageView imageView4 = this.A0;
                            aj0 aj0Var = this.z0;
                            if (j10) {
                                aj0Var.setVisibility(0);
                                imageView4.setVisibility(8);
                                g5Var3.setContentDescription(LocaleController.getString(!pb.D1 ? R.string.Mute : R.string.Unmute));
                            } else {
                                aj0Var.setVisibility(8);
                                imageView4.setVisibility(0);
                                g5Var3.setContentDescription(LocaleController.getString(R.string.NoSound));
                            }
                            g5Var3.setAlpha((1.0f - this.d4) * this.e3);
                        } else {
                            g5Var3.setVisibility(8);
                        }
                        t8Var7 = m5Var.b;
                        ua uaVar = this.C0;
                        if (t8Var7 != null) {
                            uaVar.a(this.C1, t8Var7, z21 && this.b4);
                        } else {
                            TL_stories.StoryItem storyItem24 = m5Var.a;
                            if (storyItem24 != null) {
                                uaVar.b(this.C1, storyItem24, z21 && this.b4);
                            } else {
                                uaVar.b(this.C1, null, z21 && this.b4);
                            }
                        }
                        this.b4 = false;
                        uaVar.setTranslationX(g5Var3.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z20) {
                            this.q3 = false;
                            TL_stories.StoryItem storyItem25 = m5Var.a;
                            if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                this.E0.setReaction(null);
                            } else {
                                this.E0.setReaction(ah.j1.d(reaction));
                            }
                        }
                        t8Var8 = m5Var.b;
                        if (t8Var8 == null && t8Var8.I) {
                            w0();
                            this.j2.set(m5Var.b.c.x);
                            this.j2.setVisibility(0);
                            ViewPropertyAnimator viewPropertyAnimator = this.k2;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.k2 = null;
                            }
                            if (z21) {
                                ViewPropertyAnimator interpolator = this.j2.animate().alpha(1.0f).setDuration(180L).setInterpolator(pr.h);
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
                            if (z21 && this.j2.getVisibility() == 0) {
                                ViewPropertyAnimator withEndAction = this.j2.animate().alpha(0.0f).setDuration(180L).setInterpolator(pr.h).withEndAction(new q2(this, 0));
                                this.k2 = withEndAction;
                                withEndAction.start();
                            } else {
                                this.j2.setAlpha(0.0f);
                                this.j2.setVisibility(8);
                            }
                        }
                        this.x1.a(pb.D1, false);
                        if (this.K1 && m5Var.a != null) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + m5Var.a.id + " " + m5.c(m5Var));
                        }
                        if (this.C1) {
                            s6.f(this.C2, this.B1, m5Var.a);
                        }
                        j5 j5Var = k5Var.b;
                        l8 l8Var3 = pbVar.O0;
                        j5Var.setPadding(0, 0, (l8Var3 != null || l8Var3.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(m5Var.a);
                        if (!z10 && !this.C1 && this.z3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                            q2 q2Var = new q2(this, 1);
                            this.z3 = q2Var;
                            AndroidUtilities.runOnUIThread(q2Var, 500L);
                        }
                        f4Var3 = this.G0;
                        if ((f4Var3 != null || !f4Var3.V) && m5Var.j() && pb.D1) {
                            if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                                AndroidUtilities.cancelRunOnUIThread(this.R3);
                                AndroidUtilities.runOnUIThread(this.R3, 250L);
                            }
                        }
                        imageView = this.w0;
                        if (imageView != null) {
                            if (I0() && !J0()) {
                                z40 = m5Var.e;
                                if (!z40) {
                                    i17 = 8;
                                    imageView.setVisibility(i17);
                                }
                            }
                            i17 = 0;
                            imageView.setVisibility(i17);
                        }
                        imageView2 = this.x0;
                        if (imageView2 != null) {
                            z39 = m5Var.f;
                            if (z39 && !uaVar.f) {
                                i33 = 0;
                            }
                            imageView2.setVisibility(i33);
                            return;
                        }
                        return;
                    }
                }
                e3Var.r(this.B1, null);
                e3Var.setVisibility(8);
                l4Var2.invalidate();
                if (this.Q1 != null) {
                    ((gb) this.Q1).a(this.J1, this.B1);
                }
                z36 = this.D1;
                z3 z3Var32 = this.P0;
                ImageView imageView32 = this.N0;
                z3 z3Var42 = this.D0;
                if (z36) {
                }
                z3Var42.requestLayout();
                pbVar.e1.append(this.B1, i10);
                if (this.K1) {
                }
                e3Var.setLivePlayer(pbVar.A0);
                this.L1 = 0;
                if (pbVar.O0 != null) {
                    int i342 = storyItem12.id;
                    i18 = 0;
                    while (true) {
                        if (i18 < pbVar.O0.i.size()) {
                        }
                        i18++;
                    }
                }
                int i352 = this.J1;
                this.M1 = i352;
                int i362 = this.A1;
                this.N1 = i362;
                if (pbVar.R0) {
                }
                l4 = m5Var.l();
                g5 g5Var32 = this.y0;
                if (l4) {
                }
                t8Var7 = m5Var.b;
                ua uaVar2 = this.C0;
                if (t8Var7 != null) {
                }
                this.b4 = false;
                uaVar2.setTranslationX(g5Var32.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z20) {
                }
                t8Var8 = m5Var.b;
                if (t8Var8 == null) {
                }
                if (this.j2 != null) {
                }
                this.x1.a(pb.D1, false);
                if (this.K1) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + m5Var.a.id + " " + m5.c(m5Var));
                }
                if (this.C1) {
                }
                j5 j5Var2 = k5Var.b;
                l8 l8Var32 = pbVar.O0;
                j5Var2.setPadding(0, 0, (l8Var32 != null || l8Var32.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(m5Var.a);
                if (!z10) {
                    q2 q2Var2 = new q2(this, 1);
                    this.z3 = q2Var2;
                    AndroidUtilities.runOnUIThread(q2Var2, 500L);
                }
                f4Var3 = this.G0;
                if (f4Var3 != null) {
                }
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.w0;
                if (imageView != null) {
                }
                imageView2 = this.x0;
                if (imageView2 != null) {
                }
            }
        }
        z16 = false;
        l4Var = this.c1;
        s4Var = this.K0;
        k5Var = this.o1;
        if (t8Var4 != null) {
        }
        n3Var = this.b2;
        if (n3Var != null) {
        }
        z17 = m5Var2.f;
        if (z17) {
        }
        gzVar.c();
        this.W0 = 0L;
        this.Y0 = false;
        t8Var5 = m5Var2.b;
        if (t8Var5 == null) {
        }
        qcVar = qc.w;
        if (qcVar != null) {
            qcVar.b();
        }
        s4Var.J();
        q0();
        z16 = true;
        if (z16) {
        }
        k5Var.setOnSubtitleClick(null);
        TextView[] textViewArr2 = k5Var.c;
        this.Q3 = 0;
        boolean z612 = z60;
        long j32 = this.B1;
        y3Var2 = y3Var;
        z19 = m5Var2.f;
        W0(j32, false, z19);
        t8Var6 = m5Var2.b;
        if (t8Var6 == null) {
        }
        z20 = z16;
        z21 = z59;
        l4Var2 = l4Var;
        s4Var2 = s4Var;
        charSequence4 = charSequence2;
        z22 = z612;
        charSequence = charSequence4;
        if (charSequence != null) {
        }
        f4Var = this.F0;
        if (f4Var != null) {
        }
        f4Var2 = this.G0;
        if (f4Var2 != null) {
        }
        storyItem10 = m5Var.a;
        if (storyItem6 == storyItem10) {
        }
        m5Var.o();
        if (!m5Var.g) {
        }
        pb pbVar52 = ((gb) h5Var).d;
        pbVar52.Z0 = false;
        pbVar52.P();
        z24 = m5Var.f;
        if (z24) {
        }
        if (z25 != this.G1) {
        }
        linearLayout = this.g2;
        int i332 = 8;
        if (linearLayout != null) {
        }
        z26 = this.c3;
        LinearLayout linearLayout22 = this.O0;
        if (z26) {
        }
        hVar = this.c2;
        if (hVar != null) {
        }
        aVar = this.X1;
        e3 e3Var2 = this.L0;
        if (aVar != null) {
        }
        f2Var = this.a2;
        if (f2Var != null) {
        }
        if (this.Z1 != null) {
        }
        z35 = m5Var.f;
        if (z35) {
        }
        s4 s4Var32 = s4Var2;
        if (this.K1) {
        }
        s4Var32.setVisibility(8);
        storyItem11 = m5Var.a;
        if (storyItem11 != null) {
        }
        e3Var2.r(this.B1, null);
        e3Var2.setVisibility(8);
        l4Var2.invalidate();
        if (this.Q1 != null) {
        }
        z36 = this.D1;
        z3 z3Var322 = this.P0;
        ImageView imageView322 = this.N0;
        z3 z3Var422 = this.D0;
        if (z36) {
        }
        z3Var422.requestLayout();
        pbVar.e1.append(this.B1, i10);
        if (this.K1) {
        }
        e3Var2.setLivePlayer(pbVar.A0);
        this.L1 = 0;
        if (pbVar.O0 != null) {
        }
        int i3522 = this.J1;
        this.M1 = i3522;
        int i3622 = this.A1;
        this.N1 = i3622;
        if (pbVar.R0) {
        }
        l4 = m5Var.l();
        g5 g5Var322 = this.y0;
        if (l4) {
        }
        t8Var7 = m5Var.b;
        ua uaVar22 = this.C0;
        if (t8Var7 != null) {
        }
        this.b4 = false;
        uaVar22.setTranslationX(g5Var322.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z20) {
        }
        t8Var8 = m5Var.b;
        if (t8Var8 == null) {
        }
        if (this.j2 != null) {
        }
        this.x1.a(pb.D1, false);
        if (this.K1) {
        }
        if (this.C1) {
        }
        j5 j5Var22 = k5Var.b;
        l8 l8Var322 = pbVar.O0;
        j5Var22.setPadding(0, 0, (l8Var322 != null || l8Var322.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(m5Var.a);
        if (!z10) {
        }
        f4Var3 = this.G0;
        if (f4Var3 != null) {
        }
        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
        }
        imageView = this.w0;
        if (imageView != null) {
        }
        imageView2 = this.x0;
        if (imageView2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x029e  */
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
        String k10 = a4.a.k(max, max, "_");
        ArrayList arrayList11 = this.S3;
        arrayList11.clear();
        ArrayList arrayList12 = this.T3;
        arrayList12.clear();
        int i12 = 0;
        while (true) {
            arrayList = this.h1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((ah.z0) arrayList.get(i12)).b(false);
            i12++;
        }
        arrayList.clear();
        int i13 = 0;
        while (true) {
            if (i13 >= 2) {
                break;
            }
            int i14 = this.J1;
            if (i13 == 0) {
                i10 = i14 - 1;
                imageReceiver = this.f1;
                if (i10 < 0) {
                    imageReceiver.clearImage();
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList;
                    i11 = i13;
                    arrayList7 = arrayList11;
                    i13 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                }
                ArrayList arrayList13 = this.w1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.v1;
                if (isEmpty && i10 >= arrayList2.size()) {
                    V0((t8) arrayList13.get(i10 - arrayList2.size()), imageReceiver, k10);
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    if (i10 >= arrayList2.size()) {
                        i10 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i10);
                    long j3 = this.B1;
                    storyItem2.dialogId = j3;
                    t8 t10 = this.S1.t(j3, storyItem2);
                    if (t10 != null) {
                        V0(t10, imageReceiver, k10);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList;
                        i11 = i13;
                        storyItem = storyItem2;
                    } else {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        boolean z10 = messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument());
                        String str = storyItem2.attachPath;
                        if (str != null) {
                            if (storyItem2.media == null) {
                                z10 = str.toLowerCase().endsWith(".mp4");
                            }
                            if (z10) {
                                i11 = i13;
                                arrayList3 = arrayList11;
                                arrayList5 = arrayList;
                                arrayList4 = arrayList12;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), org.telegram.ui.Cells.p6.t(k10, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), k10, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i13;
                                String str2 = k10;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                k10 = str2;
                            }
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i11 = i13;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (z10) {
                                storyItem = storyItem2;
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), org.telegram.ui.Cells.p6.t(k10, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), k10, null, null, null, 0L, null, storyItem, 0);
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
                                try {
                                    arrayList8.add(document);
                                } catch (UnsupportedEncodingException e7) {
                                    e = e7;
                                    e.printStackTrace();
                                    if (storyItem.media_areas != null) {
                                    }
                                    arrayList9 = arrayList5;
                                    i13 = i11 + 1;
                                    arrayList11 = arrayList7;
                                    arrayList = arrayList9;
                                    arrayList12 = arrayList8;
                                }
                            } catch (UnsupportedEncodingException e10) {
                                e = e10;
                                arrayList8 = arrayList4;
                                e.printStackTrace();
                                if (storyItem.media_areas != null) {
                                }
                                arrayList9 = arrayList5;
                                i13 = i11 + 1;
                                arrayList11 = arrayList7;
                                arrayList = arrayList9;
                                arrayList12 = arrayList8;
                            }
                        } catch (UnsupportedEncodingException e11) {
                            e = e11;
                            arrayList7 = arrayList3;
                        }
                    } else {
                        arrayList7 = arrayList3;
                        arrayList8 = arrayList4;
                    }
                    if (storyItem.media_areas != null) {
                        int i15 = 0;
                        while (i15 < storyItem.media_areas.size()) {
                            if (storyItem.media_areas.get(i15) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i15);
                                ah.z0 z0Var = new ah.z0(this);
                                z0Var.e(ah.j1.d(tL_mediaAreaSuggestedReaction.reaction));
                                z0Var.b(this.a1);
                                arrayList10 = arrayList5;
                                arrayList10.add(z0Var);
                            } else {
                                arrayList10 = arrayList5;
                            }
                            i15++;
                            arrayList5 = arrayList10;
                        }
                    }
                    arrayList9 = arrayList5;
                    i13 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                }
                arrayList8 = arrayList12;
                arrayList9 = arrayList;
                i11 = i13;
                arrayList7 = arrayList11;
                i13 = i11 + 1;
                arrayList11 = arrayList7;
                arrayList = arrayList9;
                arrayList12 = arrayList8;
            } else {
                i10 = i14 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.g1;
                if (i10 >= storiesCount) {
                    imageReceiver3.clearImage();
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList;
                    i11 = i13;
                    arrayList7 = arrayList11;
                    i13 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
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
                    i11 = i13;
                    arrayList7 = arrayList11;
                    i13 = i11 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                }
            }
        }
        ArrayList arrayList14 = arrayList12;
        ArrayList arrayList15 = arrayList11;
        gb gbVar = (gb) this.Q1;
        pb pbVar = gbVar.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z11 = pbVar.H0;
            ArrayList arrayList16 = pbVar.M0;
            if (z11) {
                return;
            }
            for (int i16 = 0; i16 < arrayList16.size(); i16++) {
                for (int i17 = 0; i17 < arrayList15.size(); i17++) {
                    if (((Uri) arrayList15.get(i17)).equals(((ob) arrayList16.get(i16)).uri)) {
                        arrayList15.remove(i17);
                    }
                }
            }
            for (int i18 = 0; i18 < arrayList15.size(); i18++) {
                Uri uri = (Uri) arrayList15.get(i18);
                ob obVar = new ob(pbVar, pbVar.C0, pbVar.B0);
                obVar.setOnSeekUpdate(new s8(12, gbVar, obVar));
                obVar.uri = uri;
                TLRPC.Document document2 = (TLRPC.Document) arrayList14.get(i18);
                obVar.document = document2;
                FileStreamLoadOperation.setPriorityForDocument(document2, 0);
                obVar.preparePlayer(uri, pb.D1, pb.B1);
                arrayList16.add(obVar);
                if (arrayList16.size() > 2) {
                    ((ob) arrayList16.remove(0)).release(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ov0
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
        l4 l4Var = this.c1;
        Bitmap createBitmap = Bitmap.createBitmap(l4Var.getWidth(), l4Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public u8 getStoriesController() {
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
        pb pbVar = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.w1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j3 = ((t8) arrayList2.get(i11)).a;
                    if (((int) (j3 ^ (j3 >>> 32))) == pbVar.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            }
            int indexOf = this.z1.indexOf(Integer.valueOf(pbVar.P0));
            if (indexOf < 0 && !this.z1.isEmpty()) {
                if (pbVar.P0 > ((Integer) this.z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (pbVar.P0 < ((Integer) i2.g.h(1, this.z1)).intValue()) {
                    indexOf = this.z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = pbVar.e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !pbVar.N0 && (peerStories = this.u1) != null && peerStories.max_read_id > 0) {
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
        l8 l8Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.v1;
        arrayList.clear();
        pb pbVar = this.J0;
        if (!pbVar.N0) {
            ArrayList arrayList2 = this.z1;
            int i10 = 0;
            ArrayList arrayList3 = this.w1;
            if (arrayList2 != null && (l8Var = pbVar.O0) != null) {
                if (l8Var instanceof b8) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((b8) pbVar.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            t8 t8Var = (t8) E.get(i11);
                            di.o8 o8Var = t8Var.c;
                            if (o8Var != null && !o8Var.g && TextUtils.equals(o8Var.K0, str)) {
                                arrayList3.add(t8Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = pbVar.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (pbVar.O0 != null) {
                while (i10 < pbVar.O0.i.size()) {
                    arrayList.add(((MessageObject) pbVar.O0.i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = pbVar.Q0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.B1) {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.u1 = y3;
                    if (y3 == null) {
                        this.u1 = this.S1.z(this.B1);
                    }
                } else {
                    this.u1 = pbVar.Q0;
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
        } else if (!pbVar.S0) {
            arrayList.add(pbVar.T0);
        }
        this.A1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        o5 currentPeerView;
        w50 w50Var = this.J2;
        if (w50Var != null) {
            w50Var.a0 = null;
            w50Var.d(false);
        }
        long j3 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.a;
        pb pbVar = this.J0;
        pbVar.getClass();
        if (j3 != 0 && storyItem != null) {
            pb.E1.remove(j3 + (j3 >> 16) + (storyItem.id << 16));
        }
        this.i3 = true;
        fb fbVar = pbVar.n0;
        if (fbVar != null && (currentPeerView = fbVar.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            qc I = new yc(this.c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new q2(this, 2));
            I.r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.C2).ensureMessagesLoaded(this.B1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        m5 m5Var = this.O1;
        TL_stories.StoryItem storyItem = m5Var.a;
        if (storyItem == null) {
            storyItem = m5Var.c;
        }
        boolean z11 = this.D1;
        if (z11 || this.C1) {
            if (storyItem == null) {
                this.A2.setText("");
                this.F2.setVisibility(8);
                this.B2.setVisibility(8);
                return;
            }
            pb pbVar = this.J0;
            z3 z3Var = this.D0;
            if (!z11) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.A2.setText(LocaleController.getString(pbVar.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
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
                        nq nqVar = new nq(R.drawable.mini_views_likes, 0);
                        nqVar.setOverrideColor(-53704);
                        nqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        nq nqVar2 = new nq(R.drawable.mini_repost_story, 0);
                        nqVar2.setOverrideColor(-14161823);
                        nqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(nqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder);
                    if (i11 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + com.google.android.gms.internal.vision.e2.w(i11, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                }
                z3Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
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
            org.telegram.ui.Components.p6 p6Var = this.R0;
            if (p6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.V0 = false;
            } else {
                p6Var.q(Integer.toString(i10), z10 && this.V0, true);
                this.V0 = true;
            }
            int i14 = storyItem.views.reactions_count;
            if (i14 > 0) {
                this.Q0.q(Integer.toString(i14), z10 && this.U0, true);
                this.U0 = true;
            } else {
                this.U0 = false;
            }
            if (!z10) {
                this.S0.d(this.U0 ? 1.0f : 0.0f, true);
                org.telegram.ui.Components.e6 e6Var = this.T0;
                if (e6Var != null) {
                    e6Var.d(this.V0 ? 1.0f : 0.0f, true);
                }
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
            if (!(this.E1 && (ChatObject.canSendPlain(chat) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                this.A2.setText(LocaleController.getString(pbVar.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new nq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.A2.setText(spannableStringBuilder2);
            } else {
                this.A2.setText("");
            }
            z3Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.U0 ? this.Q0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + z3Var.getLayoutParams().width;
            z3 z3Var2 = this.P0;
            if (z3Var2 != null) {
                z3Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.V0 ? this.R0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += z3Var2.getLayoutParams().width;
                z3Var2.requestLayout();
            }
            this.W1.requestLayout();
            z3Var.requestLayout();
            this.B2.setVisibility(8);
            this.F2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = m5Var.a;
            h4 h4Var = this.j1;
            if (storyItem2 == null) {
                h4Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < h4Var.getChildCount(); i15++) {
                if (h4Var.getChildAt(i15) instanceof wa) {
                    ((wa) h4Var.getChildAt(i15)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void l0() {
        z8 z8Var = this.E0;
        z8Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new j3(0, z8Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        z8 z8Var2 = new z8(getContext(), this.x1);
        this.E0 = z8Var2;
        z8Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.x5.e(40, 40, 3));
        this.q3 = false;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void l1() {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.o5.l1():void");
    }

    public final void m0(boolean z10) {
        ValueAnimator valueAnimator = this.c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d4, z10 ? 1.0f : 0.0f);
        this.c4 = ofFloat;
        ofFloat.addUpdateListener(new r2(this, 2));
        this.c4.addListener(new h3(this, z10, 1));
        this.c4.setDuration(420L);
        this.c4.setInterpolator(pr.h);
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
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 0, this.B0);
        b2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        b2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        a1.c cVar = new a1.c(runnable, 5);
        b2Var.l0 = string;
        b2Var.m0 = cVar;
        String string2 = LocaleController.getString(R.string.Cancel);
        androidx.emoji2.text.w wVar = new androidx.emoji2.text.w(15);
        b2Var.n0 = string2;
        b2Var.o0 = wVar;
        b2Var.show();
    }

    public final void o0(int i10) {
        this.E2 = false;
        this.V2 = true;
        this.B3 = false;
        this.D1 = false;
        this.E1 = false;
        long j3 = this.B1;
        k5 k5Var = this.o1;
        org.telegram.ui.Components.i9 i9Var = this.n1;
        if (j3 >= 0) {
            this.C1 = j3 == UserConfig.getInstance(this.C2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            this.F1 = !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            i9Var.m(this.C2, user);
            k5Var.a.getImageReceiver().setForUserOrChat(user, i9Var);
            W0(this.B1, true, false);
        } else {
            this.C1 = false;
            this.D1 = true;
            if (this.S1.h(j3) || BuildVars.DEBUG_PRIVATE_VERSION) {
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
            i9Var.k(this.C2, chat);
            k5Var.a.getImageReceiver().setForUserOrChat(chat, i9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            u8 u8Var = this.S1;
            long j10 = this.B1;
            a0.i iVar = u8Var.m;
            yb ybVar = (yb) iVar.f(j10);
            if (ybVar == null) {
                ybVar = new yb(u8Var.a, j10, u8Var);
                iVar.k(ybVar, j10);
            }
            ybVar.b(true);
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
        l4 l4Var = this.c1;
        pb pbVar = this.J0;
        int i11 = 8;
        m5 m5Var = this.O1;
        if (z10) {
            B0();
            if (this.b2 == null && (this.E1 || m5Var.f)) {
                v0();
            }
            if (this.b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                n3 n3Var = this.b2;
                if (m5Var.f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                n3Var.setVisibility(i11);
                n3 n3Var2 = this.b2;
                boolean z11 = m5Var.f;
                D0(true);
                n3Var2.i1(z11);
                this.b2.o1(m5Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
                zt editField = this.b2.getEditField();
                long j11 = this.B1;
                TL_stories.StoryItem storyItem = m5Var.a;
                pbVar.getClass();
                editField.setText(pb.u(j11, storyItem));
                this.b2.b1(this.C2, this.B1);
                this.b2.K1(chat2, null);
            }
            org.telegram.ui.Components.p6 p6Var = this.Q0;
            org.telegram.ui.ActionBar.f6 f6Var = this.B0;
            if (p6Var == null) {
                org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, false, false, false);
                this.Q0 = p6Var2;
                z3 z3Var = this.D0;
                p6Var2.setCallback(z3Var);
                this.Q0.r(f6Var.G0(org.telegram.ui.ActionBar.j6.G6));
                this.Q0.t(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.e6(z3Var);
            }
            z3 z3Var2 = this.P0;
            if (z3Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(false, false, false, false);
                this.R0 = p6Var3;
                p6Var3.setCallback(z3Var2);
                this.R0.r(f6Var.G0(org.telegram.ui.ActionBar.j6.G6));
                this.R0.t(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.e6(z3Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            l4Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (m5Var.f) {
                this.W1.setVisibility(8);
                if (this.b2 == null) {
                    v0();
                }
                this.b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                n3 n3Var3 = this.b2;
                if (n3Var3 != null) {
                    n3Var3.setVisibility(8);
                }
            }
            n3 n3Var4 = this.b2;
            if (n3Var4 != null) {
                boolean z12 = m5Var.f;
                D0(true);
                n3Var4.i1(z12);
                this.b2.o1(m5Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(pbVar.P0));
                    if (indexOf < 0 && !this.z1.isEmpty()) {
                        if (pbVar.P0 > ((Integer) this.z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (pbVar.P0 < ((Integer) i2.g.h(1, this.z1)).intValue()) {
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
            l4Var.invalidate();
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
                this.g2.setVisibility(((!this.F1 || m5Var.f) && !this.G1) ? 8 : 0);
            }
            ma maVar = this.j2;
            if (maVar != null) {
                maVar.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            n3 n3Var5 = this.b2;
            if (n3Var5 != null) {
                n3Var5.setVisibility((I0() || UserObject.isService(this.B1)) ? 8 : 0);
                n3 n3Var6 = this.b2;
                boolean z13 = m5Var.f;
                D0(true);
                n3Var6.i1(z13);
                this.b2.o1(m5Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
                zt editField2 = this.b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem2 = m5Var.a;
                pbVar.getClass();
                editField2.setText(pb.u(j12, storyItem2));
                this.b2.b1(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.b2.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.z2, false);
                }
            }
            this.A1 = getStoriesCount();
            z3 z3Var3 = this.W1;
            if (z3Var3 != null) {
                z3Var3.setVisibility(8);
            }
            l4Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a1 = true;
        this.e1.onAttachedToWindow();
        this.g1.onAttachedToWindow();
        this.f1.onAttachedToWindow();
        this.l3.onAttachedToWindow();
        this.n3.onAttachedToWindow();
        n3 n3Var = this.b2;
        if (n3Var != null) {
            n3Var.E0();
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
            ((ah.z0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a1 = false;
        this.e1.onDetachedFromWindow();
        this.g1.onDetachedFromWindow();
        this.f1.onDetachedFromWindow();
        this.l3.onDetachedFromWindow();
        this.n3.onDetachedFromWindow();
        n3 n3Var = this.b2;
        if (n3Var != null) {
            n3Var.D0();
        }
        org.telegram.ui.Components.q5 q5Var = this.o3;
        if (q5Var != null) {
            q5Var.o(this);
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
            ((ah.z0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.x1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0429  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        float f7;
        char c10;
        w50 w50Var;
        boolean z10;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        fk0 fk0Var;
        p3 p3Var;
        pb pbVar = this.J0;
        if (pbVar.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i12 = 0;
        if (this.K1 && this.Z2 == null) {
            this.y2 = ((gb) this.Q1).d.p0;
        } else {
            this.y2 = 0;
        }
        int size = pbVar.b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.y2;
        int size2 = (int) ((View.MeasureSpec.getSize(i10) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.y2 < AndroidUtilities.dp(20.0f)) {
            this.y2 = 0;
        }
        int i13 = this.y2;
        fk0 fk0Var2 = this.r3;
        if (fk0Var2 == null || fk0Var2.getReactionsWindow() == null || this.r3.getReactionsWindow().q) {
            n3 n3Var = this.b2;
            if (n3Var != null && (n3Var.t0() || this.b2.j3)) {
                if (this.b2.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.b2.getEmojiPadding();
                } else {
                    n3 n3Var2 = this.b2;
                    if (n3Var2.y3) {
                        n3Var2.L();
                        i13 = this.b2.getStickersExpandedHeight();
                    } else {
                        i13 = n3Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.r3.getReactionsWindow().c.animate().translationY(-this.y2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
            i13 = 0;
        }
        boolean z11 = this.v2;
        int i14 = this.o2;
        k5 k5Var = this.o1;
        int i15 = 1;
        if (i14 != i13) {
            this.v2 = false;
            int i16 = 3;
            m5 m5Var = this.O1;
            f7 = 8.0f;
            if (i13 <= 0 || !this.K1) {
                n3 n3Var3 = this.b2;
                if (n3Var3 != null) {
                    pb.J(this.B1, m5Var.a, n3Var3.getEditText());
                }
            } else {
                this.v2 = true;
                this.i3 = false;
                this.t2 = i13;
                if (this.f2 == null) {
                    fk0 fk0Var3 = new fk0(1, this.C2, getContext(), LaunchActivity.R(), new k3(i16, this.B0));
                    this.f2 = fk0Var3;
                    fk0Var3.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    fk0 fk0Var4 = this.f2;
                    fk0Var4.N0 = true;
                    addView(fk0Var4, this.I0, w7.x5.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.f2.setDelegate(new g4(this));
                    this.f2.p(null, null, true);
                }
                this.f2.setFragment(LaunchActivity.R());
                this.f2.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                ah.e1 e1Var = ah.e1.B;
                if (e1Var != null) {
                    e1Var.l = true;
                }
                ah.e1 e1Var2 = ah.e1.C;
                if (e1Var2 != null) {
                    e1Var2.l = true;
                }
            }
            n3 n3Var4 = this.b2;
            if (n3Var4 != null) {
                n3Var4.o1(m5Var.f && !D0(true) && this.v2, true);
            }
            if (this.v2 && (p3Var = this.d3) != null) {
                p3Var.setVisibility(0);
            }
            if (!this.v2 && (fk0Var = this.f2) != null) {
                fk0Var.n();
            }
            k5Var.setEnabled(!this.v2);
            if (this.b2 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.v2, 0.1f, true);
            }
            if (this.K1 && this.v2) {
                pb pbVar2 = ((gb) this.Q1).d;
                if (!pbVar2.x) {
                    pbVar2.x = true;
                    pbVar2.P();
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
            ofFloat.addUpdateListener(new r2(this, i12));
            this.p2.addListener(new i3(this, i15));
            if (this.v2) {
                this.p2.setDuration(250L);
                this.p2.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                pbVar.m();
            } else {
                this.p2.setDuration(500L);
                this.p2.setInterpolator(pr.h);
            }
            this.p2.start();
            boolean z12 = this.v2;
            if (z12 != z11) {
                if (z12) {
                    com.google.firebase.messaging.n nVar = this.P1;
                    Canvas canvas = (Canvas) nVar.b;
                    Bitmap bitmap = (Bitmap) nVar.c;
                    E0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.a.k(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (m5Var.f) {
                        di.f4 f4Var = this.d2;
                        if (f4Var != null) {
                            if (!f4Var.V) {
                                removeView(f4Var);
                            }
                        }
                        if (!D0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            di.f4 f4Var2 = new di.f4(getContext(), 3);
                            this.d2 = f4Var2;
                            f4Var2.s(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.d2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            di.f4 f4Var3 = this.d2;
                            f4Var3.K = Layout.Alignment.ALIGN_OPPOSITE;
                            f4Var3.l0 = new a1.e(19, this, f4Var2);
                            addView(f4Var3, w7.x5.e(-1, 100, 87));
                            this.d2.u();
                            l1();
                        }
                    }
                } else {
                    n3 n3Var5 = this.b2;
                    if (n3Var5 != null) {
                        n3Var5.getEditField().clearFocus();
                    }
                    di.f4 f4Var4 = this.d2;
                    if (f4Var4 != null) {
                        f4Var4.e(true);
                    }
                }
                this.u2 = true;
            } else {
                this.u2 = false;
            }
        } else {
            f7 = 8.0f;
        }
        n3 n3Var6 = this.b2;
        if (n3Var6 != null && n3Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.b2.getEmojiView().getLayoutParams()).gravity = 80;
        }
        l4 l4Var = this.c1;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) l4Var.getLayoutParams();
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
            l4Var.setLayoutParams(layoutParams2);
        }
        z3 z3Var = this.W1;
        if (z3Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) z3Var.getLayoutParams();
            if (this.x2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f7) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        c4 c4Var = this.b3;
        if (c4Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) c4Var.getLayoutParams();
            if (this.x2) {
                c10 = 0;
                this.b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                w50Var = this.J2;
                if (w50Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) w50Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.w1.z(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i13;
                    }
                }
                z10 = this.x2;
                LinearLayout linearLayout = this.O0;
                s4 s4Var = this.K0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.C1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) s4Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.w2 != this.x2) {
                        s4Var.setLayoutParams((FrameLayout.LayoutParams) s4Var.getLayoutParams());
                    }
                    s4Var.u0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) s4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f7);
                    if (this.w2 != this.x2) {
                        s4Var.setLayoutParams((FrameLayout.LayoutParams) s4Var.getLayoutParams());
                    }
                    s4Var.u0 = AndroidUtilities.dp(f7);
                }
                this.V2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.C0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.y0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                j5 j5Var = k5Var.b;
                TextView[] textViewArr = k5Var.c;
                layoutParams = (FrameLayout.LayoutParams) j5Var.getLayoutParams();
                if (layoutParams.rightMargin != dp) {
                    int i17 = (int) dp;
                    layoutParams.rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i17;
                    k5Var.forceLayout();
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.w2 = this.x2;
            }
            this.b3.setTextColor(i0.a.k(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c10 = 0;
        w50Var = this.J2;
        if (w50Var != null) {
        }
        z10 = this.x2;
        LinearLayout linearLayout2 = this.O0;
        s4 s4Var2 = this.K0;
        if (z10) {
        }
        this.V2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.C0.getVisibility() == 0) {
        }
        if (this.y0.getVisibility() == 0) {
        }
        j5 j5Var2 = k5Var.b;
        TextView[] textViewArr2 = k5Var.c;
        layoutParams = (FrameLayout.LayoutParams) j5Var2.getLayoutParams();
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
        s4 s4Var = this.K0;
        if (s4Var.W.y()) {
            s4Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((gb) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        if (this.b2 != null && this.f3 && this.a1) {
            q2 q2Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(q2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.b2.K(true);
            boolean z11 = this.F1;
            m5 m5Var = this.O1;
            if ((z11 && !m5Var.f) || this.G1) {
                this.k3 = false;
                this.b2.setEnabled(false);
                this.b2.j1(" ", z10);
                return;
            }
            if (this.H1 > 0) {
                this.k3 = false;
                this.b2.setEnabled(true);
                this.b2.j1(zh.v7.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
                return;
            }
            if (!m5Var.f && tL_storiesStealthMode != null) {
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
                        n3 n3Var = this.b2;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        n3Var.e = formatString;
                        n3Var.f = format;
                        n3Var.G1(z10);
                    } else {
                        this.b2.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    AndroidUtilities.runOnUIThread(q2Var, 1000L);
                    return;
                }
            }
            this.k3 = false;
            this.b2.setEnabled(true);
            if (!m5Var.f) {
                this.b2.j1(LocaleController.getString(this.E1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            if (this.b2.getStarsPrice() <= 0) {
                this.b2.j1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.b2.j1(zh.v7.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.b2.N4), z10);
            nq nqVar = this.b2.N4[0];
            if (nqVar != null) {
                nqVar.spaceScaleX = 0.9f;
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
        h4 h4Var = this.j1;
        if (h4Var != null) {
            di.f4 f4Var = h4Var.c;
            if (f4Var != null) {
                f4Var.e(true);
                h4Var.c = null;
            }
            h4Var.b = null;
            h4Var.invalidate();
            h4Var.b(false);
        }
        s4 s4Var = this.K0;
        if (s4Var.W.y()) {
            s4Var.W.f(false);
            return true;
        }
        di.f4 f4Var2 = this.F0;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        di.f4 f4Var3 = this.G0;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        i40 i40Var = this.W2;
        if (i40Var != null) {
            i40Var.b(true);
        }
        f5 f5Var = this.t1;
        if (f5Var != null && f5Var.b) {
            f5Var.a();
            return true;
        }
        n3 n3Var = this.b2;
        if (n3Var != null && n3Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.b2.c1) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new m2(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((gb) this.Q1).h(alertDialog$Builder.a);
            return true;
        }
        fk0 fk0Var = this.f2;
        if (fk0Var != null && fk0Var.getReactionsWindow() != null && !this.f2.getReactionsWindow().q) {
            this.f2.getReactionsWindow().d();
            return true;
        }
        n3 n3Var2 = this.b2;
        if (n3Var2 != null && n3Var2.t0()) {
            if (this.y2 > 0) {
                AndroidUtilities.hideKeyboard(this.b2.getEmojiView());
                return true;
            }
            this.b2.n0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (s4Var.getVisibility() != 0 || s4Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            s4Var.C();
            this.g3 = false;
            this.c1.invalidate();
            return true;
        }
        n3 n3Var3 = this.b2;
        if (n3Var3 != null) {
            long j3 = this.B1;
            TL_stories.StoryItem storyItem = this.O1.a;
            Editable editText = n3Var3.getEditText();
            this.J0.getClass();
            pb.J(j3, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.b2);
        return true;
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.k1.b = i10;
        fk0 fk0Var = this.f2;
        if (fk0Var != null) {
            fk0Var.setCurrentAccount(i10);
            this.f2.p(null, null, true);
        }
        fk0 fk0Var2 = this.r3;
        if (fk0Var2 != null) {
            fk0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(h5 h5Var) {
        this.Q1 = h5Var;
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
                    pb pbVar = ((gb) this.Q1).d;
                    pbVar.l1 = true;
                    pbVar.P();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            y3 y3Var = this.e1;
            if (z10) {
                y3Var.stopAnimation();
                y3Var.setAllowStartAnimation(false);
            } else {
                y3Var.startAnimation();
                y3Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            t3 t3Var = new t3(this, getContext(), this.B0);
            this.I2 = t3Var;
            t3Var.Z1 = new u3(this);
            t3Var.j0.f0();
            t3 t3Var2 = this.I2;
            t3Var2.W = true;
            t3Var2.r1();
            t3 t3Var3 = this.I2;
            t3Var3.X = new v3(this);
            t3Var3.m1().setText(this.b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.I3);
        this.X1 = aVar;
        aVar.setOnClickListener(new s2(this, 1));
        addView(this.X1, w7.x5.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        n3 n3Var = new n3(this, AndroidUtilities.findActivity(getContext()), this, new k3(1, f6Var));
        this.b2 = n3Var;
        n3Var.getEditField().useAnimatedTextDrawable();
        this.b2.getEditField().setScaleX(0.0f);
        this.b2.setOverrideKeyboardAnimation(true);
        this.b2.setClipChildren(false);
        this.b2.setDelegate(new o3(this));
        setDelegate(this.b2);
        n3 n3Var2 = this.b2;
        n3Var2.x4 = false;
        n3Var2.y4 = true;
        if (this.O1.f) {
            n3Var2.V0(false, false, false);
        } else {
            n3Var2.V0(true, true, false);
        }
        this.b2.d();
        n3 n3Var3 = this.b2;
        n3Var3.z4 = true;
        addView(n3Var3, w7.x5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.O3 != null) {
            this.b2.P1(false);
        }
        this.b2.F2 = this.z2;
        n5 n5Var = this.M2;
        ((ArrayList) n5Var.g).add(this.c1);
        ((ArrayList) n5Var.g).add(this);
        if (this.a1) {
            this.b2.E0();
        }
        r0(false);
        if (I0()) {
            this.b2.setVisibility(8);
        }
        kh.h hVar = new kh.h(getContext(), f6Var, this.I3, this.F3);
        this.c2 = hVar;
        hVar.setOnClickListener(new m2(this, 1));
        addView(this.c2, w7.x5.e(57, 300, 85));
        this.c2.setVisibility(8);
        this.b2.setSideButtonsForAttach(this.c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.j2 != null) {
            return;
        }
        ma maVar = new ma(getContext(), this.B0);
        this.j2 = maVar;
        maVar.setOnClickListener(new s2(this, 4));
        this.j2.setAlpha(0.0f);
        this.j2.setVisibility(8);
        addView(this.j2, w7.x5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.a2 != null || getContext() == null) {
            return;
        }
        f2 f2Var = new f2(getContext(), this.I3);
        this.a2 = f2Var;
        f2Var.setOnClickListener(new s2(this, 5));
        f2 f2Var2 = this.a2;
        t1 t1Var = t1.W;
        boolean z10 = true;
        f2Var2.b(t1Var != null && t1Var.o(), false);
        f2 f2Var3 = this.a2;
        t1 t1Var2 = t1.W;
        if (t1Var2 != null && !t1Var2.m()) {
            z10 = false;
        }
        f2Var3.a(z10, false);
        addView(this.a2, w7.x5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void y0() {
        if (this.Z1 != null || getContext() == null) {
            return;
        }
        this.Y1 = new k2(getContext(), this.C2);
        l2 l2Var = new l2(getContext(), this.Y1, this.I3);
        this.Z1 = l2Var;
        l2Var.setOnClickListener(new s2(this, 6));
        this.Z1.setOnLongClickListener(new p2(this, 1));
        addView(this.Z1, w7.x5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.Y1, w7.x5.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
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
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.i2.setGravity(17);
        w7.z5.a(this.i2);
        this.i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.g2.addView(imageView, w7.x5.t(22, 22, 16, 12, 1, 4, 0));
        this.g2.addView(this.h2, w7.x5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.g2.addView(this.i2, w7.x5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.b2.addView(this.g2, w7.x5.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
