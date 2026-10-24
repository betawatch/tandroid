package ci;

import ai.nd;
import ai.qa;
import ai.wd;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pr;
import org.telegram.ui.qy;
import org.telegram.ui.sn;
import org.telegram.ui.xa1;
import org.telegram.ui.yu0;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public abstract class p4 extends ow0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.g6 B0;
    public long B1;
    public v B2;
    public boolean B3;
    public final e9 C0;
    public boolean C1;
    public int C2;
    public pr C3;
    public final g3 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.e1 D3;
    public m7 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.e1 E3;
    public ei.x3 F0;
    public boolean F1;
    public h3 F2;
    public final bh.b F3;
    public ei.x3 G0;
    public boolean G1;
    public boolean G2;
    public final gh.a G3;
    public ei.x3 H0;
    public long H1;
    public float H2;
    public final gh.d H3;
    public int I0;
    public final float I1;
    public a3 I2;
    public final eh.b I3;
    public final z9 J0;
    public int J1;
    public n60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final u3 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final m2 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final o4 M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final n4 O1;
    public final org.telegram.ui.Components.f6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final g3 P0;
    public final com.google.firebase.messaging.l P1;
    public final org.telegram.ui.Components.f6 P2;
    public final c2 P3;
    public org.telegram.ui.Components.p6 Q0;
    public i4 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.p6 R0;
    public boolean R1;
    public long R2;
    public final c2 R3;
    public org.telegram.ui.Components.f6 S0;
    public h7 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.f6 T0;
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
    public g3 W1;
    public r40 W2;
    public final org.telegram.ui.Components.f6 W3;
    public long X0;
    public a X1;
    public final yu0 X2;
    public final org.telegram.ui.Components.f6 X3;
    public boolean Y0;
    public w1 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.f6 Y3;
    public boolean Z0;
    public x1 Z1;
    public d3 Z2;
    public float Z3;
    public boolean a1;
    public t1 a2;
    public FrameLayout a3;
    public final Path a4;
    public boolean b1;
    public u2 b2;
    public wd b3;
    public boolean b4;
    public final q3 c1;
    public kh.h c2;
    public boolean c3;
    public ValueAnimator c4;
    public final FrameLayout d1;
    public ei.x3 d2;
    public w2 d3;
    public float d4;
    public final f3 e1;
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
    public final m3 j1;
    public x8 j2;
    public boolean j3;
    public final qy k1;
    public ViewPropertyAnimator k2;
    public boolean k3;
    public v4 l1;
    public final dh.d l2;
    public final ImageReceiver l3;
    public float m1;
    public final dh.d m2;
    public ah.e m3;
    public final org.telegram.ui.Components.h9 n1;
    public final Paint n2;
    public final ImageReceiver n3;
    public final l4 o1;
    public int o2;
    public org.telegram.ui.Components.r5 o3;
    public final y8 p1;
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
    public g4 t1;
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
    public final m4 x1;
    public boolean x2;
    public int x3;
    public final h4 y0;
    public final s4 y1;
    public int y2;
    public int y3;
    public final bk0 z0;
    public ArrayList z1;
    public final int z2;
    public c2 z3;

    public p4(Context context, final z9 z9Var, m4 m4Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null);
        this.b1 = true;
        this.h1 = new ArrayList();
        this.r1 = -5;
        this.I1 = 1.0f;
        n4 n4Var = new n4(this);
        this.O1 = n4Var;
        this.q2 = -1.0f;
        this.r2 = -1.0f;
        this.s2 = -1.0f;
        this.z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.f6(this);
        this.P2 = new org.telegram.ui.Components.f6(this);
        yu0 yu0Var = new yu0();
        this.X2 = yu0Var;
        this.e3 = 1.0f;
        this.P3 = new c2(this, 4);
        this.R3 = new c2(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        int i10 = 9;
        this.V3 = new androidx.activity.i(this, i10);
        this.W3 = new org.telegram.ui.Components.f6(this);
        this.X3 = new org.telegram.ui.Components.f6(this);
        this.Y3 = new org.telegram.ui.Components.f6(this);
        this.a4 = new Path();
        yu0Var.E = new ya.c(this, i10);
        o4 o4Var = new o4();
        o4Var.g = new ArrayList();
        this.M2 = o4Var;
        this.N2 = new AnimationNotificationsLocker();
        this.v1 = new ArrayList();
        this.w1 = new ArrayList();
        final int i11 = 0;
        f3 f3Var = new f3(this, i11);
        this.e1 = f3Var;
        f3Var.setCrossfadeWithOldImage(false);
        f3Var.setAllowLoadingOnAttachedOnly(true);
        f3Var.ignoreNotifications = true;
        f3Var.setFileLoadingPriority(0);
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
        f3Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.n1 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        this.J0 = z9Var;
        this.x1 = m4Var;
        this.P1 = m4Var.g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        m4Var.l.setColor(-16777216);
        this.n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = g6Var;
        setClipChildren(false);
        m3 m3Var = new m3(this, context, this.c1, g6Var, z9Var);
        this.j1 = m3Var;
        eh.b bVar = new eh.b(g6Var, org.telegram.ui.ActionBar.k6.Sd, 0.8f);
        this.I3 = bVar;
        gh.c cVar = new gh.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.H3 = null;
            this.G3 = cVar;
        } else {
            gh.d dVar = new gh.d(cVar);
            this.H3 = dVar;
            dVar.h(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        }
        ih.k kVar = new ih.k(this);
        bh.b bVar2 = new bh.b(this.G3);
        bVar2.f = kVar;
        bVar2.g = this;
        this.F3 = bVar2;
        this.l2 = bVar2.c(this, bVar, false);
        dh.d c10 = bVar2.c(this, bVar, false);
        this.m2 = c10;
        c10.u(AndroidUtilities.dp(32.0f));
        q3 q3Var = new q3(this, context, m4Var, z9Var);
        this.c1 = q3Var;
        q3Var.setClipChildren(false);
        this.k1 = new qy(this.C2, q3Var);
        q3Var.addView(m3Var, w7.z5.c(-1.0f, -1));
        u3 u3Var = new u3(this, getContext(), z9Var.y, z9Var, g6Var);
        this.K0 = u3Var;
        u3Var.b0.setOnClickListener(new e2(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(m4Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new e2(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.b6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(m4Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        g3 g3Var = new g3(this, getContext(), 1);
        this.P0 = g3Var;
        org.telegram.ui.Components.p6 p6Var = this.R0;
        if (p6Var != null) {
            p6Var.setCallback(g3Var);
        }
        g3Var.setWillNotDraw(false);
        g3Var.setOnClickListener(new e2(this, 12));
        g3 g3Var2 = new g3(this, getContext(), 2);
        this.D0 = g3Var2;
        org.telegram.ui.Components.p6 p6Var2 = this.Q0;
        if (p6Var2 != null) {
            p6Var2.setCallback(g3Var2);
        }
        g3Var2.setWillNotDraw(false);
        g3Var2.setOnClickListener(new e2(this, 13));
        g3Var2.setOnLongClickListener(new l2(i11, this, z9Var));
        m7 m7Var = new m7(context, m4Var);
        this.E0 = m7Var;
        m7Var.setPadding(dp, dp, dp, dp);
        g3Var2.addView(this.E0, w7.z5.e(40, 40, 3));
        g3Var.addView(imageView2, w7.z5.e(40, 40, 3));
        w7.b6.b(g3Var2, 0.3f, 5.0f);
        w7.b6.b(g3Var, 0.3f, 5.0f);
        f3Var.setAllowLoadingOnAttachedOnly(true);
        f3Var.setParentView(q3Var);
        s4 s4Var = new s4(10);
        this.y1 = s4Var;
        q3Var.setOutlineProvider(s4Var);
        q3Var.setClipToOutline(true);
        addView(q3Var);
        l4 l4Var = new l4(context, n4Var);
        this.o1 = l4Var;
        l4Var.setOnClickListener(new View.OnClickListener(this) { // from class: ci.z1
            public final /* synthetic */ p4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        p4 p4Var = this.b;
                        long j10 = UserConfig.getInstance(p4Var.C2).clientUserId;
                        long j11 = p4Var.B1;
                        z9 z9Var2 = z9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                z9Var2.H(sn.W9(j11));
                                break;
                            } else {
                                z9Var2.H(ProfileActivity.o4(j11));
                                break;
                            }
                        } else {
                            Bundle i12 = org.telegram.ui.Cells.b1.i(1, TeXSymbolParser.TYPE_ATTR);
                            i12.putLong("dialog_id", p4Var.B1);
                            z9Var2.H(new xa0(i12, null));
                            break;
                        }
                    default:
                        p4 p4Var2 = this.b;
                        if (!p4Var2.O1.j()) {
                            p4Var2.b1(true);
                            break;
                        } else {
                            z9Var.O();
                            if (!z9.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            p4Var2.y0.setContentDescription(LocaleController.getString(!z9.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        q3Var.addView(l4Var, w7.z5.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(g3Var, w7.z5.q(40, 40, 5));
        linearLayout.addView(g3Var2, w7.z5.q(40, 40, 5));
        addView(linearLayout, w7.z5.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.w0 = imageView3;
        imageView3.setImageDrawable(m4Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.g0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        q3Var.addView(imageView3, w7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.x0 = imageView4;
        imageView4.setImageDrawable(m4Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.g0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        q3Var.addView(imageView4, w7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.g0(z9Var, 13));
        imageView3.setOnClickListener(new e0(this, g6Var, z9Var, context, m4Var, 1));
        h4 h4Var = new h4(context, 0);
        this.y0 = h4Var;
        q3Var.addView(h4Var, w7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        bk0 bk0Var = new bk0(context);
        this.z0 = bk0Var;
        bk0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        h4Var.addView(bk0Var);
        ImageView imageView5 = new ImageView(context);
        this.A0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(m4Var.t);
        h4Var.addView(imageView5);
        imageView5.setVisibility(8);
        e9 e9Var = new e9(context);
        this.C0 = e9Var;
        e9Var.setOnClickListener(new e2(this, 2));
        q3Var.addView(e9Var, w7.z5.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i12 = 1;
        h4Var.setOnClickListener(new View.OnClickListener(this) { // from class: ci.z1
            public final /* synthetic */ p4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        p4 p4Var = this.b;
                        long j10 = UserConfig.getInstance(p4Var.C2).clientUserId;
                        long j11 = p4Var.B1;
                        z9 z9Var2 = z9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                z9Var2.H(sn.W9(j11));
                                break;
                            } else {
                                z9Var2.H(ProfileActivity.o4(j11));
                                break;
                            }
                        } else {
                            Bundle i122 = org.telegram.ui.Cells.b1.i(1, TeXSymbolParser.TYPE_ATTR);
                            i122.putLong("dialog_id", p4Var.B1);
                            z9Var2.H(new xa0(i122, null));
                            break;
                        }
                    default:
                        p4 p4Var2 = this.b;
                        if (!p4Var2.O1.j()) {
                            p4Var2.b1(true);
                            break;
                        } else {
                            z9Var.O();
                            if (!z9.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            p4Var2.y0.setContentDescription(LocaleController.getString(!z9.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.p1 = new y8(this, m4Var);
        q3Var.addView(u3Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        m2 m2Var = new m2(this, context, z9Var, z9Var.v, view, frameLayout, z9Var);
        this.L0 = m2Var;
        q3Var.addView(view, w7.z5.e(-1, 200, 87));
        q3Var.addView(m2Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        q3Var.addView(frameLayout, w7.z5.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int o10 = i0.a.o(-1, 100);
        h4Var.setBackground(org.telegram.ui.ActionBar.k6.j0(dp2, dp2, dp2, dp2, 0, o10, o10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, 0, o11, o11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.j0(dp4, dp4, dp4, dp4, 0, o12, o12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int o13 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.j0(dp5, dp5, dp5, dp5, 0, o13, o13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int o14 = i0.a.o(-1, 100);
        g3Var2.setBackground(org.telegram.ui.ActionBar.k6.j0(dp6, dp6, dp6, dp6, 0, o14, o14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int o15 = i0.a.o(-1, 100);
        g3Var.setBackground(org.telegram.ui.ActionBar.k6.j0(dp7, dp7, dp7, dp7, 0, o15, o15));
        org.telegram.ui.Cells.y9 y9Var = u3Var.W;
        View n10 = y9Var.n(context);
        if (n10 != null) {
            AndroidUtilities.removeFromParent(n10);
            addView(n10);
        }
        y9Var.D = new n2(this, 0);
        y9Var.S(this);
    }

    public static void U0(g7 g7Var, ImageReceiver imageReceiver, String str) {
        if (g7Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(g7Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(g7Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Y(p4 p4Var, ValueAnimator valueAnimator) {
        e9 e9Var = p4Var.C0;
        p4Var.d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        l4 l4Var = p4Var.o1;
        l4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var.d4);
        l4Var.setAlpha(1.0f - p4Var.d4);
        ImageView imageView = p4Var.w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var.d4);
        imageView.setAlpha(1.0f - p4Var.d4);
        ImageView imageView2 = p4Var.x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var.d4);
        imageView2.setAlpha(1.0f - p4Var.d4);
        h4 h4Var = p4Var.y0;
        h4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var.d4);
        h4Var.setAlpha((1.0f - p4Var.d4) * p4Var.e3);
        g3 g3Var = p4Var.W1;
        if (g3Var != null) {
            g3Var.setTranslationY(AndroidUtilities.dp(8.0f) * p4Var.d4);
            p4Var.W1.setAlpha(1.0f - p4Var.d4);
        }
        if (e9Var != null) {
            e9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var.d4);
            e9Var.setAlpha(1.0f - p4Var.d4);
        }
        p4Var.K0.setAlpha(1.0f - p4Var.d4);
        i4 i4Var = p4Var.Q1;
        float f7 = i4Var == null ? 0.0f : ((q9) i4Var).d.V;
        float hideInterfaceAlpha = p4Var.getHideInterfaceAlpha();
        g3 g3Var2 = p4Var.D0;
        if (g3Var2 != null) {
            g3Var2.setAlpha((1.0f - p4Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = p4Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - p4Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        g3 g3Var3 = p4Var.P0;
        if (g3Var3 != null) {
            g3Var3.setAlpha((1.0f - p4Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        u2 u2Var = p4Var.b2;
        if (u2Var != null) {
            u2Var.setAlpha(1.0f - p4Var.d4);
            p4Var.invalidate();
        }
        p4Var.c1.invalidate();
    }

    public static void Z(p4 p4Var, boolean z10) {
        org.telegram.ui.ActionBar.e1 e1Var = p4Var.D3;
        if (e1Var == null || p4Var.C3 == null || e1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(z9.B1 - 0.2f) < 0.05f) {
                p4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(z9.B1 - 0.5f) < 0.05f) {
                p4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(z9.B1 - 1.0f) < 0.05f) {
                p4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(z9.B1 - 1.5f) < 0.05f) {
                p4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(z9.B1 - 2.0f) < 0.05f) {
                p4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                p4Var.D3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, ed.a(z9.B1) + "x"));
            }
        }
        p4Var.C3.a(z9.B1, z10);
    }

    public static void a0(p4 p4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (p4Var.H0() || p4Var.O1.f) {
            return;
        }
        if (UserConfig.getInstance(p4Var.C2).isPremium()) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, p4Var.B0).setOnClickListener(new e2(p4Var, 8));
            return;
        }
        Drawable drawable = p4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        o2 o2Var = new o2(p4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, p4Var.B0);
        c10.setOnClickListener(new e2(p4Var, 9));
        c10.setIcon(o2Var);
    }

    public static void c0(p4 p4Var) {
        n4 n4Var = p4Var.O1;
        TL_stories.StoryItem storyItem = n4Var.a;
        if ((storyItem == null && n4Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = n4Var.h();
        boolean z10 = n4Var.e;
        if (h == null || !h.exists()) {
            p4Var.Z0();
            return;
        }
        MediaController.saveFile(h.toString(), p4Var.getContext(), z10 ? 1 : 0, null, null, new ai.y8(1, p4Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d0(p4 p4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(j10));
            str = user.first_name;
            z10 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(p4Var.C2).getChat(Long.valueOf(-j10));
            str = chat2.title;
            z10 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new ai.m(p4Var, MessagesController.getInstance(p4Var.C2), j10, !z10, str, chat), 200L);
    }

    public static void e0(p4 p4Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getContext(), 0, p4Var.B0);
        alertDialog$Builder.a.R = LocaleController.getString(p4Var.H0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.T = LocaleController.getString(p4Var.H0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y1(p4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new c3.m(7));
        q9 q9Var = (q9) p4Var.Q1;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        q9Var.h(c2Var);
        c2Var.i();
    }

    public static void g0(p4 p4Var) {
        org.telegram.ui.ActionBar.g6 g6Var = p4Var.B0;
        q3 q3Var = p4Var.c1;
        if (p4Var.G1) {
            return;
        }
        int i10 = 0;
        int i11 = 1;
        if (!p4Var.E1) {
            u2 u2Var = p4Var.b2;
            int i12 = -p4Var.r1;
            p4Var.r1 = i12;
            AndroidUtilities.shakeViewSpring(u2Var, i12);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = p4Var.B1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1))) : "";
            (MessagesController.getInstance(p4Var.C2).premiumFeaturesBlocked() ? new xc(q3Var, g6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new xc(q3Var, g6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new c2(p4Var, 5))).j();
            return;
        }
        if (p4Var.J3 != null && p4Var.K3 != null) {
            sg.j0.G1(new ai.a5(p4Var, i11), p4Var.J3, p4Var.K3, p4Var.B1, true);
            return;
        }
        z9 z9Var = p4Var.J0;
        if (z9Var != null) {
            z9Var.k1 = true;
            z9Var.P();
        }
        MessagesController.getInstance(p4Var.C2).getBoostsController().getBoostsStats(p4Var.B1, new f2(p4Var, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f7 = 1.0f - this.O2.c;
        b6 b6Var = this.J0.w;
        return (1.0f - (b6Var == null ? 0.0f : b6Var.f)) * f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        z9 z9Var;
        if (!this.O1.f || (z9Var = this.J0) == null || z9Var.A0 == null || C0(true)) {
            return 0L;
        }
        return z9Var.A0.j();
    }

    public static void i0(p4 p4Var) {
        n4 n4Var = p4Var.O1;
        if (n4Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = n4Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(p4Var.C2).getInputPeer(p4Var.B1);
        ConnectionsManager.getInstance(p4Var.C2).sendRequest(tL_stories_exportStoryLink, new e3());
    }

    public final void A0() {
        if (this.W1 != null) {
            return;
        }
        g3 g3Var = new g3(this, getContext(), 0);
        this.W1 = g3Var;
        g3Var.setClickable(true);
        addView(this.W1, w7.z5.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        h3 h3Var = new h3(this, getContext());
        this.F2 = h3Var;
        h3Var.setOnClickListener(new e2(this, 0));
        this.W1.addView(this.F2, w7.z5.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        v vVar = new v(0, getContext(), false);
        this.B2 = vVar;
        vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.z5.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.z5.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.x1.s);
        h3 h3Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int o10 = i0.a.o(-1, 120);
        h3Var2.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, o10, o10));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.N(i0.a.o(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void B0() {
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
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.B0;
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        TextView textView2 = new TextView(getContext());
        w7.b6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.k6.Sh;
        org.telegram.ui.ActionBar.r6.W(textView2, i11, g6Var);
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), 30);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, o10, o10);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 30);
        textView2.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(textView2, j02, O, h, g6Var);
        textView2.setOnClickListener(new e2(this, 3));
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        linearLayout.addView(textView2, w7.z5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.z5.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.c1.addView(frameLayout);
        this.a3 = frameLayout;
    }

    public final boolean C0(boolean z10) {
        h1 h1Var;
        TLRPC.Peer i10;
        h1 h1Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        long j10 = this.B1;
        z9 z9Var = this.J0;
        if (j10 >= 0 || (h1Var2 = z9Var.A0) == null) {
            if (j10 < 0 || z9Var == null || (h1Var = z9Var.A0) == null || !h1Var.l()) {
                return false;
            }
            return !z10 || (i10 = z9Var.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i11 = h1Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
        if (z9Var.A0.l() || ChatObject.canManageCalls(chat)) {
            return i11 == null || this.B1 == DialogObject.getPeerDialogId(i11) || DialogObject.getPeerDialogId(i11) == UserConfig.getInstance(this.C2).getClientUserId();
        }
        return false;
    }

    public final void D0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        o4 o4Var = this.M2;
        org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) o4Var.e;
        if (n4Var != null && ((SurfaceView) o4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) o4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (n4Var != null && (textureView = (TextureView) o4Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        q3 q3Var = this.c1;
        canvas.scale(i10 / q3Var.getMeasuredWidth(), i11 / q3Var.getMeasuredHeight());
        this.e1.draw(canvas);
        canvas.restore();
    }

    public final void E0(ei.p9 p9Var, TL_stories.StoryItem storyItem) {
        i4 i4Var = this.Q1;
        ei.r9 r9Var = new ei.r9(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.B0);
        r9Var.r1(p9Var);
        ei.h1 h1Var = r9Var.b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof ei.k9) {
                    ((ei.k9) view).e(false);
                }
            }
        }
        r9Var.l1(true);
        r9Var.T = new ah.h0(5, this, storyItem);
        ((q9) i4Var).h(r9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0196, code lost:
    
        if (r3 == r10.f2) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F0(ViewGroup viewGroup, float f7, float f10, boolean z10) {
        ei.x3 x3Var;
        o4 o4Var;
        if (viewGroup != null) {
            ei.x3 x3Var2 = this.F0;
            if ((x3Var2 == null || !x3Var2.V) && ((x3Var = this.G0) == null || !x3Var.V)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        u3 u3Var = this.K0;
                        if (childAt == u3Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f7, (int) f10)) {
                                float top = f10 - childAt.getTop();
                                q8 q8Var = u3Var.b0;
                                if (q8Var.w == 1.0f && !u3Var.s0) {
                                    if (top > q8Var.getTranslationY() + (u3Var.r0.getTop() - u3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if (childAt == this.c1 && (o4Var = this.M2) != null) {
                            org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) o4Var.e;
                            if (com.google.android.gms.internal.play_billing.k3.s(n4Var) && F0(n4Var, f7 - childAt.getX(), f10 - childAt.getY(), z10)) {
                            }
                        }
                        if (!childAt.isClickable() || !rect2.contains((int) f7, (int) f10)) {
                            m3 m3Var = this.j1;
                            if (childAt == m3Var && m3Var.b == null && (f7 < AndroidUtilities.dp(60.0f) || f7 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = m3Var.e;
                                float[] fArr = m3Var.f;
                                for (int i11 = 0; i11 < m3Var.getChildCount(); i11++) {
                                    View childAt2 = m3Var.getChildAt(i11);
                                    if (childAt2 != m3Var.d && (childAt2 instanceof g9)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f7;
                                        fArr[1] = f10;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                m2 m2Var = this.L0;
                                if (childAt == m2Var) {
                                    xa1 xa1Var = m2Var.f;
                                    ai.u1 u1Var = m2Var.c;
                                    xa1 xa1Var2 = m2Var.f;
                                    xa1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f7 - m2Var.getX()) - xa1Var2.getX()), (int) ((f10 - m2Var.getY()) - xa1Var2.getY()))) {
                                        if (m2Var.f0) {
                                            continue;
                                        } else if (!this.v2) {
                                            if (f10 <= m2Var.s() + m2Var.getY() && u1Var.E(f7, (f10 - m2Var.getY()) - u1Var.getY()) == null) {
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
                                            u2 u2Var = this.b2;
                                            if (u2Var != null && childAt == u2Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && F0((ViewGroup) childAt, f7 - childAt.getX(), f10 - childAt.getY(), z10)) {
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

    public final boolean G0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        q3 q3Var = this.c1;
        float x11 = view.getX() + q3Var.getX() + x10;
        float y3 = view.getY() + q3Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ((float) view.getHeight());
    }

    public final boolean H0() {
        z6 z6Var;
        z9 z9Var = this.J0;
        return (z9Var == null || (z6Var = z9Var.O0) == null || z6Var.e != 4) ? false : true;
    }

    public final boolean I0() {
        TLRPC.User user;
        return H0() && (user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.J0.O0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean J0();

    public final void K0(ah.i1 i1Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        n4 n4Var = this.O1;
        TL_stories.StoryItem storyItem = n4Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && i1Var == null) {
            k0();
            this.S1.g0(this.B1, n4Var.a, null);
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
                this.S1.g0(this.B1, n4Var.a, ah.i1.c(tL_availableReaction));
            }
        } else {
            k0();
            this.S1.g0(this.B1, n4Var.a, i1Var);
        }
        TL_stories.StoryItem storyItem2 = n4Var.a;
        g3 g3Var = this.D0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.E0.setReaction(null);
            g3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.E0.setReaction(ah.i1.d(reaction));
            g3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.D1 && z11) {
            TL_stories.StoryItem storyItem3 = n4Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = n4Var.a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = n4Var.a;
        ah.l1.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        j1(true);
    }

    public final void L0() {
        h1 h1Var;
        if (this.O3 != null) {
            return;
        }
        z9 z9Var = this.J0;
        if (z9Var != null && (h1Var = z9Var.A0) != null) {
            if (h1Var.v == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.C2).getSendAsPeers(this.B1, true);
        this.O3 = sendAsPeers;
        u2 u2Var = this.b2;
        if (u2Var == null || sendAsPeers == null) {
            return;
        }
        u2Var.M1(true);
    }

    public final boolean M0() {
        u2 u2Var = this.b2;
        if (u2Var == null) {
            return false;
        }
        boolean z10 = u2Var.z2;
        if (z10) {
            u2Var.p1();
        }
        AndroidUtilities.runOnUIThread(new c2(this, 3), 300L);
        return z10;
    }

    public final void N0() {
        CharSequence charSequence;
        long j10;
        f2 f2Var;
        int i10;
        long j11;
        int i11 = 3;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.b2.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        TLRPC.Peer i12 = this.J0.A0.i();
        if (i12 != null) {
            clientUserId = DialogObject.getPeerDialogId(i12);
        }
        Context context = getContext();
        int i13 = this.C2;
        String shortName = DialogObject.getShortName(i13, this.B1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.L3;
        f2 f2Var2 = new f2(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, (org.telegram.ui.ActionBar.g6) bVar, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        h3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i13).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j10 = j12;
            f2Var = f2Var2;
            i10 = ((org.telegram.ui.Components.a6[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.a6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j12;
            f2Var = f2Var2;
            i10 = 0;
        }
        int max = (int) Math.max(messageMinPrice, j10 <= 0 ? 100L : j10);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                j11 = messageMinPrice;
                break;
            }
            int i14 = length * 7;
            int i15 = iArr[i14];
            j11 = messageMinPrice;
            int i16 = iArr[i14 + 2];
            if (i10 <= iArr[i14 + 3] && charSequence.length() <= i16) {
                max = Math.max(max, i15);
                break;
            } else {
                length--;
                messageMinPrice = j11;
            }
        }
        long[] jArr = {max};
        ei.d dVar = new ei.d(context, null, true);
        v0 v0Var = new v0();
        v0Var.c = clientUserId;
        v0Var.f = textWithEntities;
        v0Var.g = jArr[0];
        q0 q0Var = new q0(i13, context, true);
        LinearLayout e = sl.e(context, 0);
        ah.x xVar = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        e.addView(xVar, w7.z5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        ah.x xVar2 = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        e.addView(xVar2, w7.z5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        ah.x xVar3 = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        e.addView(xVar3, w7.z5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        t tVar = new t(context, bVar, r6);
        f2 f2Var3 = f2Var;
        long j13 = j11;
        Utilities.Callback[] callbackArr = {new s(jArr, dVar, new xq[1], v0Var, q0Var, i13, xVar, xVar2, xVar3, tVar, new boolean[]{true})};
        q0Var.set(v0Var);
        int i17 = 9;
        int[] iArr2 = {1, 50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000};
        int i18 = MessagesController.getInstance(i13).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i19 = 0;
        while (true) {
            if (i19 >= i17) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i19] >= j13) {
                if (i19 > 0 && arrayList.isEmpty() && iArr3[i19] > j13) {
                    arrayList.add(Integer.valueOf((int) j13));
                }
                int i20 = iArr3[i19];
                if (i20 <= i18) {
                    arrayList.add(Integer.valueOf(i20));
                    if (iArr3[i19] == i18) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i18));
                    break;
                }
            }
            i19++;
            iArr2 = iArr3;
            i17 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) i2.o1.i(1, arrayList)).intValue() < i18) {
            arrayList.add(Integer.valueOf(i18));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            iArr4[i21] = ((Integer) arrayList.get(i21)).intValue();
        }
        tVar.e0 = iArr4;
        tVar.setValue((int) jArr[0]);
        linearLayout.addView(tVar, w7.z5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(e, w7.z5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i22 = org.telegram.ui.ActionBar.k6.j5;
        TextView b10 = w7.d6.b(context, 20.0f, i22, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.z5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, i22, false, bVar);
        b11.setGravity(17);
        sl.r(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.z5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(q0Var, w7.z5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, w7.z5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        h3Var.show();
        dVar.setOnClickListener(new ai.v0(f2Var3, jArr, h3Var, i11));
    }

    public final void O0() {
        if (this.b2 == null) {
            return;
        }
        s0();
        this.I2.j0.f0();
        this.I2.R1(-1, true);
        a3 a3Var = this.I2;
        a3Var.Z = this.B1;
        a3Var.w1();
        this.I2.r1().setText(this.b2.getFieldText());
        ((q9) this.Q1).h(this.I2);
    }

    public final void P0() {
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
        this.J0.H(new sn(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(long j10) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        long j11;
        ei.d4 d4Var;
        h1 h1Var;
        boolean z10 = this.K1;
        o4 o4Var = this.M2;
        if (!z10) {
            o4Var.e = null;
            return;
        }
        n4 n4Var = this.O1;
        boolean z11 = n4Var.f;
        q3 q3Var = this.c1;
        if (!z11) {
            if (!n4Var.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): null, not a video");
                ((q9) this.Q1).c(null, null, 0L, this.M2);
                o4Var.e = null;
                o4Var.a = false;
                return;
            }
            if (n4Var.f() == null || !new File(n4Var.f()).exists()) {
                TL_stories.StoryItem storyItem = n4Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.B1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = n4Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.C2).getFileReference(n4Var.a);
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
                            sb2.append(n4Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(n4Var.a.id);
                            sb2.append("&did=");
                            sb2.append(n4Var.a.dialogId);
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
                            ((q9) this.Q1).c(document, uri, j10, this.M2);
                            q3Var.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(n4Var.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from attachPath " + fromFile);
                this.R2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): playing from null?");
            }
            ((q9) this.Q1).c(document, uri, j10, this.M2);
            q3Var.invalidate();
            return;
        }
        i4 i4Var = this.Q1;
        TL_stories.StoryItem storyItem3 = n4Var.a;
        long j12 = this.B1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        q9 q9Var = (q9) i4Var;
        q9Var.i(true, true);
        z9 z9Var = q9Var.d;
        h1 h1Var2 = z9Var.A0;
        if (h1Var2 == null || h1Var2.b != j12 || !h1Var2.f(inputGroupCall)) {
            ei.d4 d4Var2 = z9Var.D0;
            if (d4Var2 != null) {
                d4Var2.d(j12, null);
                ei.d4 d4Var3 = z9Var.D0;
                SurfaceViewRenderer surfaceViewRenderer = d4Var3.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = d4Var3.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                d4Var3.r = false;
                d4Var3.e(false, false);
            }
            o1 o1Var = o1.Z;
            if (o1Var.S && (h1Var = o1Var.v) != null && h1Var.f(inputGroupCall)) {
                h1 h1Var3 = o1Var.v;
                o1Var.v = null;
                z9Var.A0 = h1Var3;
                o1Var.k(false);
            } else {
                h1 h1Var4 = z9Var.A0;
                if (h1Var4 != null) {
                    if (!h1Var4.n && (!o1Var.S || o1Var.v != h1Var4)) {
                        h1Var4.e();
                    } else if (h1Var4.O != z9Var.D0.getSink()) {
                        z9Var.A0.s(null);
                    }
                    z9Var.A0 = null;
                }
            }
            if (o1Var.S) {
                o1.j();
            }
            y9 y9Var = z9Var.z0;
            if (y9Var != null) {
                y9Var.release(null);
                z9Var.z0 = null;
            }
            o4 o4Var2 = z9Var.G0;
            if (o4Var2 != null) {
                o4Var2.c = null;
                o4Var2.b = null;
                o4Var2.a = false;
                o4Var2.e = null;
                o4Var2.f = null;
                o4Var2.d = null;
                o4Var2.b();
                z9Var.G0 = null;
            }
            if (z9Var.A0 == null) {
                h1 h1Var5 = h1.W;
                if (h1Var5 == null || !h1Var5.f(inputGroupCall)) {
                    h1 h1Var6 = new h1(q9Var.c, z9Var.h, storyItem3, j12, i10, z12, inputGroupCall, false, false);
                    j11 = j12;
                    z9Var.A0 = h1Var6;
                    d4Var = z9Var.E0;
                    if (d4Var == null) {
                        z9Var.A0.s(d4Var.getSink());
                    } else {
                        z9Var.A0.s(z9Var.D0.getSink());
                    }
                    z9Var.G0 = o4Var;
                    o4Var.a = false;
                    o4Var.e = z9Var.y0;
                    ei.d4 d4Var4 = z9Var.D0;
                    o4Var.f = d4Var4.d;
                    o4Var.d = d4Var4.c;
                    o4Var.b = z9Var.A0;
                    d4Var4.d(j11, o4Var);
                    z9Var.G0.b();
                } else {
                    z9Var.A0 = h1.W;
                }
            }
            j11 = j12;
            d4Var = z9Var.E0;
            if (d4Var == null) {
            }
            z9Var.G0 = o4Var;
            o4Var.a = false;
            o4Var.e = z9Var.y0;
            ei.d4 d4Var42 = z9Var.D0;
            o4Var.f = d4Var42.d;
            o4Var.d = d4Var42.c;
            o4Var.b = z9Var.A0;
            d4Var42.d(j11, o4Var);
            z9Var.G0.b();
        }
        q3Var.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(Uri uri) {
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
                    Y0();
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

    public final void S0(long j10, boolean z10) {
        if (this.K1 != z10) {
            this.K1 = z10;
            bk0 bk0Var = this.z0;
            if (z10) {
                if (this.J0.a && Build.VERSION.SDK_INT < 33) {
                    z9 z9Var = ((q9) this.Q1).d;
                    z9Var.l1 = true;
                    z9Var.P();
                    androidx.activity.i iVar = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 100L);
                }
                Q0(j10);
                f1();
                bk0Var.setAnimation(this.x1.u);
                this.K1 = true;
                this.o1.a.getImageReceiver().setVisible(true, true);
                n4 n4Var = this.O1;
                if (n4Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + n4Var.a.id + " " + n4.c(n4Var));
                }
            } else {
                o0();
                bk0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.c1.invalidate();
                invalidate();
                p0();
                z9 z9Var2 = ((q9) this.Q1).d;
                z9Var2.I0 = false;
                z9Var2.P();
            }
            this.e1.setFileLoadingPriority(this.K1 ? 3 : 2);
            this.f1.setFileLoadingPriority(this.K1 ? 2 : 0);
            this.g1.setFileLoadingPriority(this.K1 ? 2 : 0);
            if (this.C1 || this.D1) {
                h7 h7Var = this.S1;
                long j11 = this.B1;
                boolean z11 = this.K1;
                a0.h hVar = h7Var.m;
                ia iaVar = (ia) hVar.f(j11);
                if (iaVar == null) {
                    iaVar = new ia(h7Var.a, j11, h7Var);
                    hVar.k(iaVar, j11);
                }
                iaVar.b(z11);
            }
        }
    }

    public final void T0(int i10, long j10) {
        if (this.B1 != j10) {
            n4 n4Var = this.O1;
            n4Var.b = null;
            n4Var.a = null;
        }
        this.B1 = j10;
        this.z1 = null;
        n0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        h7 h7Var = this.S1;
        TL_stories.PeerStories y3 = h7Var.y(j10);
        if (y3 == null) {
            y3 = h7Var.z(j10);
        } else {
            z10 = false;
        }
        h7Var.S(y3, z10);
    }

    public final void V0(long j10, boolean z10, boolean z11) {
        if (!z10 && j10 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j10;
        this.N3 = z11;
        l4 l4Var = this.o1;
        if (j10 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j10));
            k4 k4Var = l4Var.b;
            k4 k4Var2 = l4Var.b;
            k4Var.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                k4Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            yq yqVar = new yq(mutate, null);
            yqVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            yqVar.h = dp;
            yqVar.n = dp2;
            k4Var2.i(yqVar);
            return;
        }
        if (this.C1 && !z11) {
            l4Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            l4Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j10));
        if (user == null || !user.verified) {
            l4Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            yq yqVar2 = new yq(mutate2, null);
            yqVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            yqVar2.h = dp3;
            yqVar2.n = dp4;
            l4Var.b.i(yqVar2);
        }
        if (user != null) {
            l4Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), l4Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            l4Var.b.l(null, false);
        }
    }

    public final void W0(float f7, float f10, v4 v4Var) {
        this.m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 == v4Var) {
            return;
        }
        this.l1 = v4Var;
        if (v4Var != null) {
            ImageReceiver imageReceiver = v4Var.a;
            if (imageReceiver.getBitmap() != null) {
                this.e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void X0(boolean z10) {
        n4 n4Var = this.O1;
        if (n4Var.a != null) {
            z9 z9Var = this.J0;
            if (z9Var.f != null) {
                String e = n4Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e);
                    LaunchActivity.J1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                d3 d3Var = new d3(this, z9Var.f.getContext(), e, e, MessagesController.getInstance(this.C2).storiesEnabled() && (!(this.D1 || UserObject.isService(this.B1)) || ChatObject.isPublic(this.D1 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null)), new s2(2, this.B0));
                this.Z2 = d3Var;
                d3Var.j0 = true;
                TL_stories.StoryItem storyItem = n4Var.a;
                storyItem.dialogId = this.B1;
                d3Var.G0 = storyItem;
                d3Var.t0 = new a6.i(this, 11);
                ((q9) this.Q1).h(d3Var);
            }
        }
    }

    public final void Y0() {
        q3 q3Var = this.c1;
        org.telegram.ui.ActionBar.g6 g6Var = this.B0;
        sl.q(R.string.UnsupportedAttachment, new xc(q3Var, g6Var), g6Var);
    }

    public final void Z0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.T = string;
        ((q9) this.Q1).h(c2Var);
    }

    public final void a1(boolean z10) {
        if (this.s3 != z10) {
            n4 n4Var = this.O1;
            if (n4Var.a == null) {
                return;
            }
            this.s3 = z10;
            int i10 = 0;
            if (z10) {
                this.r3.setVisibility(0);
            }
            this.r3.setStoryItem(n4Var.a);
            z9 z9Var = ((q9) this.Q1).d;
            z9Var.p1 = z10;
            z9Var.P();
            if (!z10) {
                if (this.r3.getReactionsWindow() != null) {
                    this.r3.getReactionsWindow().e();
                }
                this.r3.animate().alpha(0.0f).setDuration(150L).setListener(new q2(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t3, z10 ? 1.0f : 0.0f);
            this.r3.setTransitionProgress(this.t3);
            ofFloat.addUpdateListener(new d2(this, 1));
            ofFloat.addListener(new p2(this, z10, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(bs.g);
            ofFloat.start();
        }
    }

    public final void b1(boolean z10) {
        if (this.G0 == null) {
            ei.x3 x3Var = new ei.x3(getContext(), 1);
            x3Var.l(1.0f, -56.0f);
            this.G0 = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.c1.addView(this.G0, w7.z5.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.G0.s(LocaleController.getString(z10 ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.G0.u();
    }

    public final boolean c1(boolean z10) {
        if (this.J0.R0) {
            z10 = !z10;
        }
        if (!z10) {
            int i10 = this.J1;
            if (i10 > 0) {
                this.J1 = i10 - 1;
                e1(false);
                return true;
            }
        } else if (this.J1 < getStoriesCount() - 1) {
            this.J1++;
            e1(false);
            return true;
        }
        return false;
    }

    public final void d1() {
        if (MessagesController.getInstance(this.C2).storiesEnabled()) {
            File h = this.O1.h();
            if (h == null || !h.exists()) {
                Z0();
                return;
            }
            d3 d3Var = this.Z2;
            if (d3Var != null) {
                d3Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new c2(this, 8), 120L);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h1 h1Var;
        int i12 = NotificationCenter.storiesUpdated;
        z9 z9Var = this.J0;
        boolean z10 = false;
        if (i10 == i12 || (i10 == NotificationCenter.storiesListUpdated && z9Var.O0 == objArr[0])) {
            i4 i4Var = this.Q1;
            if (i4Var == null || !((q9) i4Var).d.H0) {
                if (this.K1) {
                    i1();
                    if (this.A1 == 0) {
                        if (this.E2) {
                            return;
                        }
                        this.E2 = true;
                        ((q9) this.Q1).j();
                        return;
                    }
                    int i13 = this.J1;
                    ArrayList arrayList = this.v1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.w1;
                    if (i13 >= arrayList2.size() + size) {
                        this.J1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    e1(false);
                    if (this.C1 || this.D1) {
                        j1(true);
                    }
                }
                TL_stories.PeerStories peerStories = z9Var.Q0;
                if (peerStories != null) {
                    this.S1.S(peerStories, true);
                } else {
                    long j10 = this.B1;
                    if (j10 != 0) {
                        h7 h7Var = this.S1;
                        TL_stories.PeerStories y3 = h7Var.y(j10);
                        if (y3 == null) {
                            y3 = h7Var.z(j10);
                            z10 = true;
                        }
                        h7Var.S(y3, z10);
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
            e1(false);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            this.K0.b0.invalidate();
            return;
        }
        if (i10 == NotificationCenter.stealthModeChanged) {
            q0(true);
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            b7 o10 = MessagesController.getInstance(this.C2).getStoriesController().o();
            if (o10 == null || !o10.a(this.C2, 1) || this.Q1 == null) {
                return;
            }
            ai.a5 a5Var = new ai.a5(this, 1);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.J1;
            }
            ((q9) this.Q1).h(new sg.j0(o10.b(), this.C2, findActivity, a5Var, null));
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
            e1(false);
            q0(true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.B1 == (-((TLRPC.ChatFull) obj).id)) {
                e1(false);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.liveStoryUpdated) {
            if (i10 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                L0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (z9Var == null || (h1Var = z9Var.A0) == null || h1Var.g() != longValue) {
            return;
        }
        e1(false);
        u2 u2Var = this.b2;
        if (u2Var != null) {
            u2Var.F(true);
            this.b2.M1(true);
            q0(true);
        }
        m2 m2Var = this.L0;
        if (m2Var != null) {
            h1 h1Var2 = m2Var.P;
            if (m2Var.H != (h1Var2 != null ? h1Var2.j() : 0L)) {
                m2Var.e.N(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ke keVar;
        Canvas canvas2;
        org.telegram.ui.Components.p6 p6Var;
        org.telegram.ui.Components.p6 p6Var2;
        k1();
        if (this.D1 && (p6Var2 = this.Q0) != null) {
            p6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (p6Var = this.R0) != null) {
            p6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.u3;
        LinearLayout linearLayout = this.O0;
        g3 g3Var = this.D0;
        if (z10) {
            float measuredWidth = (g3Var.getMeasuredWidth() / 2.0f) + g3Var.getX() + linearLayout.getX();
            float measuredHeight = (g3Var.getMeasuredHeight() / 2.0f) + g3Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.w3, measuredWidth - f7, bs.g.getInterpolation(this.v3));
            float lerp2 = AndroidUtilities.lerp(this.x3, measuredHeight - f7, this.v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.v3);
            if (this.p3) {
                org.telegram.ui.Components.r5 r5Var = this.o3;
                if (r5Var != null) {
                    float f10 = lerp3;
                    r5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
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
            float measuredWidth2 = (g3Var.getMeasuredWidth() / 2.0f) + g3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (g3Var.getMeasuredHeight() / 2.0f) + g3Var.getY() + linearLayout.getY();
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
        u2 u2Var = this.b2;
        if (u2Var != null) {
            me meVar = u2Var.y1;
            ke keVar2 = u2Var.z1;
            if (u2Var.getAlpha() == 0.0f || (keVar = u2Var.e1) == null || keVar.getParent() == null || u2Var.e1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(u2Var.e1.getX() + meVar.getX() + keVar2.getX() + u2Var.getX(), u2Var.e1.getY() + meVar.getY() + keVar2.getY() + u2Var.getY());
            if (u2Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, u2Var.getMeasuredWidth(), u2Var.getMeasuredHeight(), (int) (u2Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            u2Var.e1.draw(canvas2);
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
        u2 u2Var = this.b2;
        Paint paint = this.n2;
        g3 g3Var = this.D0;
        m4 m4Var = this.x1;
        if (view == u2Var) {
            float f7 = this.q2;
            n4 n4Var = this.O1;
            if (f7 > 0.0f && !n4Var.f) {
                m4Var.l.setAlpha((int) (f7 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), m4Var.l);
            }
            RectF rectF = m4Var.h;
            RectF rectF2 = m4Var.i;
            RectF rectF3 = m4Var.j;
            rectF.set(this.b2.getX(), this.b2.getY() + this.b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.b2.getX() + this.b2.getMeasuredWidth(), this.b2.getY() + this.b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (n4Var.f) {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                t1 t1Var = this.a2;
                if (t1Var != null && t1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (g3Var != null && g3Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + g3Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.b2.setTranslationX((1.0f - this.q2) * dp);
            this.b2.getEditField().setTranslationY(com.google.android.gms.internal.play_billing.k3.y(1.0f, this.q2, -AndroidUtilities.dp(2.0f), this.b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.q2) * (this.b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, m4Var.h, this.q2, rectF3);
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
            if (u2Var != null && u2Var.r0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = m4Var.k;
                RectF rectF5 = m4Var.k;
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
                    view.setTranslationY((this.O0.getY() + (g3Var.getY() + (-(r2.getMeasuredHeight() - this.r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    q3 q3Var = this.c1;
                    if (view == q3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.f(0.2f, -16777216, -1));
                        a2.translate(q3Var.getX(), q3Var.getY());
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

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0947, code lost:
    
        if (r4.g == (r1 == null && r1.translated && r1.translatedText != null && android.text.TextUtils.equals(r1.translatedLng, org.telegram.ui.Components.y41.L()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x09a7, code lost:
    
        if (r2 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x09cc, code lost:
    
        if (r3 != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0adf, code lost:
    
        if (r6 != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0af7, code lost:
    
        if (r6 != false) goto L557;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0bed  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0c26  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d66  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d7d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d8e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0da6 A[EDGE_INSN: B:312:0x0da6->B:313:0x0da6 BREAK  A[LOOP:0: B:301:0x0d84->B:310:0x0da3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0e18  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0e58  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0e67  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0e87  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0f21  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0f52  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0f61  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0f87  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0fa8  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0fd8  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0ff4  */
    /* JADX WARN: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0fc8  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0ed1  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e61  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0e29  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0d3e  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0915  */
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
    /* JADX WARN: Removed duplicated region for block: B:91:0x0928  */
    /* JADX WARN: Type inference failed for: r6v190 */
    /* JADX WARN: Type inference failed for: r6v191, types: [ci.m8, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v192 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(boolean z10) {
        g7 g7Var;
        TL_stories.StoryItem storyItem;
        g7 g7Var2;
        qy qyVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        f3 f3Var;
        TL_stories.StoryItem storyItem2;
        z9 z9Var;
        w9 w9Var;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        boolean z14;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z15;
        TL_stories.StoryItem storyItem4;
        g7 g7Var3;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem5;
        ei.a8 a8Var;
        TL_stories.StoryItem storyItem6;
        g7 g7Var4;
        int i12;
        ei.a8 a8Var2;
        h1 h1Var;
        boolean z16;
        q3 q3Var;
        u3 u3Var;
        l4 l4Var;
        u2 u2Var;
        boolean z17;
        boolean z18;
        g7 g7Var5;
        qc qcVar;
        boolean z19;
        TL_stories.StoryItem storyItem7;
        boolean z20;
        int i13;
        boolean z21;
        g7 g7Var6;
        boolean z22;
        f3 f3Var2;
        q3 q3Var2;
        u3 u3Var2;
        l4 l4Var2;
        boolean z23;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        int i14;
        TLRPC.MessageMedia messageMedia2;
        boolean z24;
        ei.x3 x3Var;
        ei.x3 x3Var2;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem10;
        i4 i4Var;
        boolean z25;
        boolean z26;
        LinearLayout linearLayout;
        boolean z27;
        boolean z28;
        u2 u2Var2;
        u2 u2Var3;
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
        t1 t1Var;
        boolean z36;
        TL_stories.StoryItem storyItem11;
        boolean z37;
        int i17;
        int i18;
        boolean z38;
        boolean z39;
        boolean l4;
        g7 g7Var7;
        g7 g7Var8;
        ei.x3 x3Var3;
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
        h1 h1Var2;
        int i28;
        boolean z48;
        int i29;
        boolean z49;
        int i30;
        boolean z50;
        boolean z51;
        boolean z52;
        boolean z53;
        h1 h1Var3;
        String str;
        BitmapDrawable bitmapDrawable;
        qy qyVar2;
        z9 z9Var2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        z6 z6Var;
        ArrayList arrayList2 = this.v1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.w1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.V2 = true;
        n4 n4Var = this.O1;
        TL_stories.StoryItem storyItem14 = n4Var.a;
        g7 g7Var9 = n4Var.b;
        String s10 = c8.s();
        this.Z0 = false;
        this.c3 = false;
        int i31 = this.J1;
        boolean z54 = this.T1;
        boolean z55 = this.U1;
        boolean z56 = this.V1;
        z9 z9Var3 = this.J0;
        if (z9Var3 == null || (z6Var = z9Var3.O0) == null || z6Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i31 < 0 || i31 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i31);
            int size = i31 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            g7Var = (size < 0 || size >= arrayList3.size()) ? null : (g7) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            g7Var = (i31 < 0 || i31 >= arrayList3.size()) ? null : (g7) arrayList3.get(i31);
            int size2 = i31 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        n4Var.c = null;
        m3 m3Var = this.j1;
        qy qyVar3 = this.k1;
        f3 f3Var3 = this.e1;
        if (g7Var != null) {
            ei.a8 a8Var3 = g7Var.c;
            this.U1 = false;
            boolean z57 = g7Var.I;
            this.V1 = z57;
            this.T1 = !z57;
            f3Var3.setCrossfadeWithOldImage(false);
            f3Var3.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = a8Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (g7Var.s || g7Var.H) {
                BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                f3Var = f3Var3;
                g7Var2 = g7Var9;
                qyVar2 = qyVar3;
                z11 = z54;
                z12 = z55;
                z13 = z56;
                z9Var2 = z9Var3;
                i10 = i31;
                r62 = 0;
                i11 = 4;
                f3Var.setImage(null, null, ImageLocation.getForPath(g7Var.f), s10, null, null, bitmapDrawable2, 0L, null, null, 0);
            } else {
                BitmapDrawable bitmapDrawable3 = bitmapDrawable;
                f3Var = f3Var3;
                g7Var2 = g7Var9;
                r62 = 0;
                qyVar2 = qyVar3;
                z11 = z54;
                z13 = z56;
                z12 = z55;
                i11 = 4;
                z9Var2 = z9Var3;
                i10 = i31;
                f3Var.setImage(null, null, ImageLocation.getForPath(g7Var.e), s10, null, null, bitmapDrawable3, 0L, null, null, 0);
            }
            n4Var.b = g7Var;
            n4Var.j = r62;
            n4Var.i = r62;
            n4Var.a = r62;
            n4Var.d = false;
            n4Var.e = n4Var.m();
            TL_stories.StoryItem storyItem17 = n4Var.a;
            n4Var.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            qyVar = qyVar2;
            m3Var.c(r62, d9.a(a8Var3), qyVar);
            this.U2 = false;
            this.T2 = false;
            this.S2 = false;
            z9 z9Var4 = z9Var2;
            storyItem2 = storyItem14;
            z9Var = z9Var4;
        } else {
            g7Var2 = g7Var9;
            qyVar = qyVar3;
            z11 = z54;
            z12 = z55;
            z13 = z56;
            i10 = i31;
            i11 = 4;
            f3Var = f3Var3;
            this.T1 = false;
            this.U1 = false;
            this.V1 = false;
            if (storyItem == null) {
                if (z9Var3 != null) {
                    z9Var3.q(true);
                    return;
                }
                return;
            }
            g7 t10 = this.S1.t(this.B1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.U1 = true;
                f3Var.setCrossfadeWithOldImage(false);
                f3Var.setCrossfadeDuration(this.i1 == null ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : 0);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    z9Var = z9Var3;
                    g7Var3 = t10;
                    f3Var.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    z9Var = z9Var3;
                    g7Var3 = t10;
                    f3Var.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                }
                n4Var.b = g7Var3;
                n4Var.j = null;
                n4Var.i = null;
                n4Var.a = null;
                n4Var.d = false;
                n4Var.e = n4Var.m();
                TL_stories.StoryItem storyItem18 = n4Var.a;
                n4Var.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                m3Var.c(null, d9.a(g7Var3.c), qyVar);
                n4Var.c = storyItem;
                this.U2 = false;
                this.T2 = false;
                this.S2 = false;
            } else {
                storyItem2 = storyItem14;
                z9Var = z9Var3;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.B1;
                f3Var.setCrossfadeWithOldImage(z12);
                f3Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
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
                                    f3Var.setImage(null, null, ImageLocation.getForPath(storyItem.firstFramePath), s10, null, null, createStripedBitmap, 0L, null, null, 0);
                                }
                            }
                            z15 = z12;
                            f3Var.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), si.o0.u(s10, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
                        } else {
                            z15 = z12;
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            Drawable createStripedBitmap2 = photo != null ? ImageLoader.createStripedBitmap(photo.sizes) : null;
                            if (z15) {
                                f3Var.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, ImageLocation.getForPath(storyItem.firstFramePath), s10, createStripedBitmap2, 0L, null, null, 0);
                            } else {
                                f3Var.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, null, null, createStripedBitmap2, 0L, null, null, 0);
                            }
                        }
                        storyItem3 = storyItem;
                        z14 = z15;
                    } else {
                        Drawable drawable = ((z9Var.O0 != null || z9Var.N0) && (w9Var = z9Var.s0) != null && (imageReceiver = w9Var.c) != null && w9Var.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.B1;
                        if (z58) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String u10 = si.o0.u(s10, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            TL_stories.StoryItem storyItem19 = storyItem;
                            z14 = z12;
                            f3Var.setImage(null, null, forDocument, u10, forDocument2, s10, drawable, 0L, null, storyItem19, 0);
                            storyItem3 = storyItem19;
                        } else {
                            storyItem3 = storyItem;
                            z14 = z12;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                f3Var.clearImage();
                            } else {
                                if (drawable == null) {
                                    drawable = ImageLoader.createStripedBitmap(arrayList);
                                }
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 800);
                                f3Var.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2), s10, null, null, drawable, 0L, null, storyItem3, 0);
                            }
                        }
                    }
                }
                storyItem3.dialogId = this.B1;
                m3Var.d(z10 ? null : storyItem3, qyVar);
                n4Var.n(storyItem3);
                boolean z59 = (this.c3 || (storyItem4 = n4Var.a) == null || (storyItem4 instanceof TL_stories.TL_storyItemDeleted) || (storyItem4 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.U2 = z59;
                this.S2 = z59;
                if (z59) {
                    this.S2 = n4Var.d() && n4Var.a.isPublic;
                }
                if (this.S2) {
                    TL_stories.StoryItem storyItem20 = n4Var.a;
                    this.S2 = storyItem20.pinned || !c8.w(this.C2, storyItem20);
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
                        this.U2 = (user == null || UserObject.getPublicUsername(user) == null || !n4Var.a.isPublic) ? false : true;
                    }
                }
                NotificationsController.getInstance(this.C2).processReadStories(this.B1, storyItem3.id);
                storyItem5 = n4Var.a;
                if (storyItem5 != null && !z10) {
                    z9Var.P0 = storyItem5.id;
                }
                z9Var.n0.A();
                this.Y2 = true;
                if (!this.C1 || this.D1) {
                    j1(false);
                }
                TL_stories.StoryItem storyItem21 = n4Var.a;
                g7 g7Var10 = n4Var.b;
                int i32 = storyItem21 == null ? storyItem21.id : (g7Var10 == null || (a8Var = g7Var10.c) == null) ? 0 : a8Var.f;
                if (storyItem2 == null) {
                    storyItem6 = storyItem2;
                    i12 = storyItem6.id;
                    g7Var4 = g7Var2;
                } else {
                    storyItem6 = storyItem2;
                    g7Var4 = g7Var2;
                    i12 = (g7Var2 == null || (a8Var2 = g7Var4.c) == null) ? 0 : a8Var2.f;
                }
                boolean z61 = (i32 == i12 && (g7Var4 == null || storyItem21 == null || !TextUtils.equals(g7Var4.e, storyItem21.attachPath))) ? false : true;
                boolean z62 = (z61 || (this.U1 == z14 && this.T1 == z11 && this.V1 == z13)) ? false : true;
                h1Var = z9Var.A0;
                if (h1Var != null) {
                    int i33 = this.Q3;
                    TLRPC.GroupCall groupCall = h1Var.v;
                    if (i33 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                        z16 = true;
                        q3Var = this.c1;
                        u3Var = this.K0;
                        l4Var = this.o1;
                        if ((g7Var4 != null || (str = g7Var4.e) == null || !str.equals(n4Var.f())) && (storyItem6 == null || (storyItem7 = n4Var.a) == null || storyItem6.id != storyItem7.id)) {
                            u2Var = this.b2;
                            if (u2Var != null) {
                                if (storyItem6 != null && !TextUtils.isEmpty(u2Var.getEditField().getText())) {
                                    z9.J(storyItem6.dialogId, storyItem6, this.b2.getEditField().getText());
                                }
                                this.b2.getEditField().setText(z9.u(this.B1, n4Var.a));
                                z19 = n4Var.f;
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
                            z18 = n4Var.f;
                            if (z18) {
                                L0();
                            }
                            qyVar.c();
                            this.W0 = 0L;
                            this.Y0 = z17;
                            g7Var5 = n4Var.b;
                            if (g7Var5 != null) {
                                ck0 ck0Var = l4Var.d;
                                if (ck0Var != null) {
                                    ck0Var.e(g7Var5.h, z17);
                                }
                                l4Var.a.invalidate();
                            } else if (!z62) {
                                l4Var.h = 0.0f;
                            }
                            qcVar = qc.w;
                            if (qcVar != null && qcVar.h == q3Var) {
                                qcVar.b();
                            }
                            u3Var.J();
                            p0();
                            z16 = true;
                        }
                        if (!z16 || (g7Var4 != null && n4Var.b == null)) {
                            l4Var.setOnSubtitleClick(null);
                            TextView[] textViewArr = l4Var.c;
                            this.Q3 = 0;
                            z20 = z61;
                            i13 = 2;
                            long j10 = this.B1;
                            boolean z63 = z62;
                            z21 = n4Var.f;
                            V0(j10, false, z21);
                            g7Var6 = n4Var.b;
                            if (g7Var6 != null) {
                                charSequence3 = g7Var6.I ? LocaleController.getString(R.string.FailedToUploadStory) : c8.u(textViewArr[0], this.U1);
                            } else {
                                if (H0()) {
                                    TL_stories.StoryItem storyItem22 = n4Var.a;
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
                                    f3Var2 = f3Var;
                                    q3Var2 = q3Var;
                                    u3Var2 = u3Var;
                                    l4Var2 = l4Var;
                                    z23 = z63;
                                    charSequence = "";
                                } else {
                                    TL_stories.StoryItem storyItem23 = n4Var.a;
                                    if (storyItem23 == null) {
                                        z22 = z16;
                                        f3Var2 = f3Var;
                                        q3Var2 = q3Var;
                                        u3Var2 = u3Var;
                                        l4Var2 = l4Var;
                                        z23 = z63;
                                        charSequence = null;
                                    } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                                        spannableStringBuilder.setSpan(new i3(), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        h1 h1Var4 = z9Var.A0;
                                        if (h1Var4 != null) {
                                            TLRPC.GroupCall groupCall2 = h1Var4.v;
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
                                        if (n4Var.i() != null) {
                                            m8 i34 = n4Var.i();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            z22 = z16;
                                            f3Var2 = f3Var;
                                            SpannableString spannableString = new SpannableString("r");
                                            q3Var2 = q3Var;
                                            u3Var2 = u3Var;
                                            spannableString.setSpan(new xq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
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
                                                String str4 = n4Var.a.fwd_from.from_name;
                                                if (str4 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str4);
                                                }
                                            }
                                            l4Var.setOnSubtitleClick(new ai.p(11, this, i34));
                                            SpannableString spannableString3 = new SpannableString(".");
                                            lt ltVar = new lt();
                                            ltVar.b = AndroidUtilities.dp(1.5f);
                                            ltVar.c = 5.0f;
                                            spannableString3.setSpan(ltVar, 0, spannableString3.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(n4Var.a.date));
                                            l4Var2 = l4Var;
                                            charSequence = spannableStringBuilder2;
                                        } else {
                                            z22 = z16;
                                            f3Var2 = f3Var;
                                            q3Var2 = q3Var;
                                            u3Var2 = u3Var;
                                            if (!this.E1 || (storyItem8 = n4Var.a) == null || storyItem8.from_id == null) {
                                                l4Var2 = l4Var;
                                                String formatStoryDate = LocaleController.formatStoryDate(n4Var.a.date);
                                                charSequence2 = formatStoryDate;
                                                if (n4Var.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                                    lt ltVar2 = new lt();
                                                    ltVar2.b = AndroidUtilities.dp(1.5f);
                                                    ltVar2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(ltVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
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
                                                long peerDialogId = DialogObject.getPeerDialogId(n4Var.a.from_id);
                                                if (peerDialogId > 0) {
                                                    TLRPC.User user3 = MessagesController.getInstance(this.C2).getUser(Long.valueOf(peerDialogId));
                                                    k5Var2.e(user3);
                                                    spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user3));
                                                    l4Var2 = l4Var;
                                                } else {
                                                    l4Var2 = l4Var;
                                                    TLRPC.Chat chat4 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-peerDialogId));
                                                    k5Var2.b(chat4);
                                                    if (chat4 != null) {
                                                        spannableStringBuilder3.append((CharSequence) chat4.title);
                                                    }
                                                }
                                                l4Var2.setOnSubtitleClick(new a2(this, peerDialogId, 0));
                                                SpannableString spannableString5 = new SpannableString(".");
                                                lt ltVar3 = new lt();
                                                ltVar3.b = AndroidUtilities.dp(1.5f);
                                                ltVar3.c = 5.0f;
                                                spannableString5.setSpan(ltVar3, 0, spannableString5.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(n4Var.a.date));
                                                charSequence = spannableStringBuilder3;
                                            }
                                        }
                                        z23 = false;
                                    }
                                }
                                if (charSequence == null) {
                                    z6 z6Var2 = z9Var.O0;
                                    if (z6Var2 == null || (storyItem9 = n4Var.a) == null || !z6Var2.m(storyItem9.id)) {
                                        z24 = false;
                                    } else {
                                        if (!(charSequence instanceof SpannableStringBuilder)) {
                                            charSequence = new SpannableStringBuilder(charSequence);
                                        }
                                        SpannableString spannableString6 = new SpannableString("p ");
                                        z24 = false;
                                        spannableString6.setSpan(new xq(R.drawable.msg_pin_mini), 0, 1, 33);
                                        ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString6);
                                    }
                                    l4Var2.c(charSequence, z23);
                                } else {
                                    z24 = false;
                                }
                                x3Var = this.F0;
                                if (x3Var != null) {
                                    x3Var.e(z24);
                                }
                                x3Var2 = this.G0;
                                if (x3Var2 != null) {
                                    x3Var2.e(z24);
                                }
                            }
                            z22 = z16;
                            f3Var2 = f3Var;
                            q3Var2 = q3Var;
                            u3Var2 = u3Var;
                            l4Var2 = l4Var;
                            charSequence2 = charSequence3;
                            charSequence = charSequence2;
                            z23 = z63;
                            if (charSequence == null) {
                            }
                            x3Var = this.F0;
                            if (x3Var != null) {
                            }
                            x3Var2 = this.G0;
                            if (x3Var2 != null) {
                            }
                        } else {
                            z20 = z61;
                            z22 = z16;
                            f3Var2 = f3Var;
                            q3Var2 = q3Var;
                            u3Var2 = u3Var;
                            l4Var2 = l4Var;
                            i13 = 2;
                        }
                        storyItem10 = n4Var.a;
                        if (storyItem6 == storyItem10 && g7Var4 == n4Var.b) {
                        }
                        n4Var.o();
                        if ((!n4Var.g || storyItem6 != n4Var.a) && (i4Var = this.Q1) != null) {
                            z9 z9Var5 = ((q9) i4Var).d;
                            z9Var5.Z0 = false;
                            z9Var5.P();
                        }
                        z25 = n4Var.f;
                        z26 = !z25 && (h1Var3 = z9Var.A0) != null && n4Var.k(h1Var3.g()) && z9Var.A0.b();
                        if (z26 != this.G1) {
                            this.G1 = z26;
                            if (z26) {
                                y0();
                            }
                            if (this.g2 != null && (this.F1 || this.G1)) {
                                g1();
                            }
                            u2 u2Var4 = this.b2;
                            if (u2Var4 != null) {
                                if (this.F1) {
                                    z53 = n4Var.f;
                                }
                                if (!this.G1) {
                                    z52 = true;
                                    u2Var4.setEnabled(z52);
                                    z51 = true;
                                    this.b2.M1(true);
                                }
                                z52 = false;
                                u2Var4.setEnabled(z52);
                                z51 = true;
                                this.b2.M1(true);
                            } else {
                                z51 = true;
                            }
                            q0(z51);
                        }
                        linearLayout = this.g2;
                        if (linearLayout != null) {
                            if (this.F1) {
                                z50 = n4Var.f;
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
                            B0();
                            z0();
                            this.a3.setVisibility(0);
                            this.b3.setVisibility(0);
                            this.U2 = false;
                            this.T2 = false;
                            this.S2 = false;
                            u2 u2Var5 = this.b2;
                            if (u2Var5 != null) {
                                u2Var5.setVisibility(8);
                            }
                            g3 g3Var = this.W1;
                            if (g3Var != null) {
                                g3Var.setVisibility(8);
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat chat5 = this.B1 < 0 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null;
                            z28 = n4Var.f;
                            if (z28) {
                                if (this.b2 == null) {
                                    u0();
                                }
                                t0();
                                x0();
                                w0();
                                this.b2.setVisibility(0);
                            } else if ((UserObject.isService(this.B1) || H0()) && (u2Var2 = this.b2) != null) {
                                u2Var2.setVisibility(8);
                            } else if (!this.C1 && ((!this.D1 || (this.E1 && (ChatObject.canSendPlain(chat5) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat5)))) && (u2Var3 = this.b2) != null)) {
                                u2Var3.setVisibility(0);
                            }
                            u2 u2Var6 = this.b2;
                            if (u2Var6 != null) {
                                z33 = n4Var.f;
                                u2Var6.setOnSendButtonLongClick(z33 ? new b2(this, 0) : null);
                                u2 u2Var7 = this.b2;
                                z34 = n4Var.f;
                                C0(true);
                                u2Var7.f1(z34);
                                u2 u2Var8 = this.b2;
                                z35 = n4Var.f;
                                u2Var8.l1(z35 && !C0(true) && (this.v2 || this.b2.W0), true);
                            }
                            if (this.F1 && this.g2 == null) {
                                y0();
                            }
                            if (this.g2 != null) {
                                if (this.F1 || this.G1) {
                                    g1();
                                }
                                LinearLayout linearLayout3 = this.g2;
                                if (this.F1) {
                                    z32 = n4Var.f;
                                }
                                if (!this.G1) {
                                    i16 = 8;
                                    linearLayout3.setVisibility(i16);
                                }
                                i16 = 0;
                                linearLayout3.setVisibility(i16);
                            }
                            u2 u2Var9 = this.b2;
                            if (u2Var9 != null) {
                                if (this.F1) {
                                    z31 = n4Var.f;
                                }
                                if (!this.G1) {
                                    z30 = true;
                                    u2Var9.setEnabled(z30);
                                }
                                z30 = false;
                                u2Var9.setEnabled(z30);
                            }
                            g3 g3Var2 = this.W1;
                            if (g3Var2 != null) {
                                if (this.C1) {
                                    z29 = n4Var.f;
                                    if (!z29) {
                                        i15 = 0;
                                        g3Var2.setVisibility(i15);
                                    }
                                }
                                i15 = 8;
                                g3Var2.setVisibility(i15);
                            }
                            FrameLayout frameLayout = this.a3;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (UserObject.isService(this.B1)) {
                                z0();
                                this.b3.setVisibility(0);
                            } else {
                                wd wdVar = this.b3;
                                if (wdVar != null) {
                                    wdVar.setVisibility(8);
                                }
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(H0() ? 8 : 0);
                            }
                        }
                        hVar = this.c2;
                        if (hVar != null) {
                            u2 u2Var10 = this.b2;
                            if (u2Var10 != null && u2Var10.getVisibility() == 0) {
                                z49 = n4Var.f;
                                if (!z49) {
                                    i29 = 0;
                                    hVar.setVisibility(i29);
                                }
                            }
                            i29 = 8;
                            hVar.setVisibility(i29);
                        }
                        aVar = this.X1;
                        m2 m2Var = this.L0;
                        if (aVar != null) {
                            if (!this.c3) {
                                z48 = n4Var.f;
                                if (z48) {
                                    i28 = 0;
                                    aVar.setVisibility(i28);
                                    this.X1.a(m2Var.g(), false);
                                    this.X1.setCount(m2Var.getUnreadMessagesCount());
                                }
                            }
                            i28 = 8;
                            aVar.setVisibility(i28);
                            this.X1.a(m2Var.g(), false);
                            this.X1.setCount(m2Var.getUnreadMessagesCount());
                        }
                        t1Var = this.a2;
                        if (t1Var != null) {
                            if (!this.c3) {
                                z47 = n4Var.f;
                                if (z47 && (h1Var2 = h1.W) != null && n4Var.k(h1Var2.g())) {
                                    i27 = 0;
                                    t1Var.setVisibility(i27);
                                    t1 t1Var2 = this.a2;
                                    h1 h1Var5 = h1.W;
                                    t1Var2.b(h1Var5 == null && h1Var5.o(), true);
                                    t1 t1Var3 = this.a2;
                                    h1 h1Var6 = h1.W;
                                    t1Var3.a(h1Var6 != null || h1Var6.m(), true);
                                }
                            }
                            i27 = 8;
                            t1Var.setVisibility(i27);
                            t1 t1Var22 = this.a2;
                            h1 h1Var52 = h1.W;
                            t1Var22.b(h1Var52 == null && h1Var52.o(), true);
                            t1 t1Var32 = this.a2;
                            h1 h1Var62 = h1.W;
                            t1Var32.a(h1Var62 != null || h1Var62.m(), true);
                        }
                        if (this.Z1 != null) {
                            w1 w1Var = this.Y1;
                            if (!this.c3) {
                                z46 = n4Var.f;
                                if (z46) {
                                    i25 = 0;
                                    w1Var.setVisibility(i25);
                                    x1 x1Var = this.Z1;
                                    if (!this.c3) {
                                        z45 = n4Var.f;
                                        if (z45) {
                                            i26 = 0;
                                            x1Var.setVisibility(i26);
                                            layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                                            t1 t1Var4 = this.a2;
                                            dp = AndroidUtilities.dp((t1Var4 == null && t1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                            if (layoutParams.rightMargin != dp) {
                                                layoutParams.rightMargin = dp;
                                                this.Z1.setLayoutParams(layoutParams);
                                            }
                                        }
                                    }
                                    i26 = 8;
                                    x1Var.setVisibility(i26);
                                    layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                                    t1 t1Var42 = this.a2;
                                    dp = AndroidUtilities.dp((t1Var42 == null && t1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != dp) {
                                    }
                                }
                            }
                            i25 = 8;
                            w1Var.setVisibility(i25);
                            x1 x1Var2 = this.Z1;
                            if (!this.c3) {
                            }
                            i26 = 8;
                            x1Var2.setVisibility(i26);
                            layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                            t1 t1Var422 = this.a2;
                            dp = AndroidUtilities.dp((t1Var422 == null && t1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != dp) {
                            }
                        }
                        z36 = n4Var.f;
                        if (!z36 || ((n4Var.h == null && n4Var.i() == null && n4Var.g() == null) || this.c3)) {
                            u3 u3Var3 = u3Var2;
                            if (this.K1) {
                                z9 z9Var6 = ((q9) this.Q1).d;
                                z9Var6.L0 = false;
                                z9Var6.P();
                                i4 i4Var2 = this.Q1;
                                this.j3 = false;
                                ((q9) i4Var2).e();
                            }
                            u3Var3.setVisibility(8);
                        } else {
                            u3 u3Var4 = u3Var2;
                            u3Var4.b0.b(n4Var.h, n4Var.i(), n4Var.g(), z9Var.Z0 && !n4Var.g && (storyItem13 = n4Var.a) != null && storyItem13.translated, storyItem6 == n4Var.a);
                            u3Var4.setVisibility(0);
                        }
                        storyItem11 = n4Var.a;
                        if (storyItem11 != null) {
                            TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                            if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (m2Var.r(this.B1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                                    m2Var.q(false, false);
                                    this.L3 = 0L;
                                    u2 u2Var11 = this.b2;
                                    if (u2Var11 != null) {
                                        u2Var11.F(true);
                                        this.b2.O1();
                                        q0(true);
                                    }
                                }
                                m2Var.setVisibility(0);
                                q3Var2.invalidate();
                                if (this.Q1 != null && J0()) {
                                    ((q9) this.Q1).a(this.J1, this.B1);
                                }
                                z37 = this.D1;
                                g3 g3Var3 = this.P0;
                                ImageView imageView3 = this.N0;
                                g3 g3Var4 = this.D0;
                                if (z37) {
                                    if (this.S2) {
                                        z39 = n4Var.f;
                                        if (!z39) {
                                            i17 = 0;
                                            imageView3.setVisibility(i17);
                                            if (g3Var3 != null) {
                                                g3Var3.setVisibility(8);
                                            }
                                            if (!this.C1) {
                                                z38 = n4Var.f;
                                                if (!z38) {
                                                    i18 = 0;
                                                    g3Var4.setVisibility(i18);
                                                    g3Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                                }
                                            }
                                            i18 = 8;
                                            g3Var4.setVisibility(i18);
                                            g3Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                        }
                                    }
                                    i17 = i11;
                                    imageView3.setVisibility(i17);
                                    if (g3Var3 != null) {
                                    }
                                    if (!this.C1) {
                                    }
                                    i18 = 8;
                                    g3Var4.setVisibility(i18);
                                    g3Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                } else {
                                    if (this.S2) {
                                        z44 = n4Var.f;
                                        if (!z44) {
                                            i22 = 0;
                                            imageView3.setVisibility(i22);
                                            if (g3Var3 != null) {
                                                if (this.T2) {
                                                    z43 = n4Var.f;
                                                    if (!z43) {
                                                        i24 = 0;
                                                        g3Var3.setVisibility(i24);
                                                    }
                                                }
                                                i24 = 8;
                                                g3Var3.setVisibility(i24);
                                            }
                                            if (!this.V1) {
                                                z42 = n4Var.f;
                                                if (!z42) {
                                                    i23 = 0;
                                                    g3Var4.setVisibility(i23);
                                                }
                                            }
                                            i23 = 8;
                                            g3Var4.setVisibility(i23);
                                        }
                                    }
                                    i22 = i11;
                                    imageView3.setVisibility(i22);
                                    if (g3Var3 != null) {
                                    }
                                    if (!this.V1) {
                                    }
                                    i23 = 8;
                                    g3Var4.setVisibility(i23);
                                }
                                g3Var4.requestLayout();
                                z9Var.e1.append(this.B1, i10);
                                if (this.K1) {
                                    Q0(0L);
                                    f1();
                                    f3Var2.bumpPriority();
                                }
                                m2Var.setLivePlayer(z9Var.A0);
                                this.L1 = 0;
                                if (z9Var.O0 != null && (storyItem12 = n4Var.a) != null) {
                                    int i35 = storyItem12.id;
                                    i21 = 0;
                                    while (true) {
                                        if (i21 < z9Var.O0.i.size()) {
                                            MessageObject messageObject = (MessageObject) z9Var.O0.i.get(i21);
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
                                if (z9Var.R0) {
                                    this.M1 = (i37 - 1) - i36;
                                }
                                l4 = n4Var.l();
                                h4 h4Var = this.y0;
                                if (l4) {
                                    h4Var.setVisibility(8);
                                } else {
                                    h4Var.setVisibility(0);
                                    this.e3 = n4Var.j() ? 1.0f : 0.5f;
                                    boolean j11 = n4Var.j();
                                    ImageView imageView4 = this.A0;
                                    bk0 bk0Var = this.z0;
                                    if (j11) {
                                        bk0Var.setVisibility(0);
                                        imageView4.setVisibility(8);
                                        h4Var.setContentDescription(LocaleController.getString(!z9.D1 ? R.string.Mute : R.string.Unmute));
                                    } else {
                                        bk0Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        h4Var.setContentDescription(LocaleController.getString(R.string.NoSound));
                                    }
                                    h4Var.setAlpha((1.0f - this.d4) * this.e3);
                                }
                                g7Var7 = n4Var.b;
                                e9 e9Var = this.C0;
                                if (g7Var7 == null) {
                                    e9Var.a(this.C1, g7Var7, z20 && this.b4);
                                } else {
                                    TL_stories.StoryItem storyItem24 = n4Var.a;
                                    if (storyItem24 != null) {
                                        e9Var.b(this.C1, storyItem24, z20 && this.b4);
                                    } else {
                                        e9Var.b(this.C1, null, z20 && this.b4);
                                    }
                                }
                                this.b4 = false;
                                e9Var.setTranslationX(h4Var.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                                if (z22) {
                                    this.q3 = false;
                                    TL_stories.StoryItem storyItem25 = n4Var.a;
                                    if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                        this.E0.setReaction(null);
                                    } else {
                                        this.E0.setReaction(ah.i1.d(reaction));
                                    }
                                }
                                g7Var8 = n4Var.b;
                                if (g7Var8 == null && g7Var8.I) {
                                    v0();
                                    this.j2.set(n4Var.b.c.x);
                                    this.j2.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.k2;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.k2 = null;
                                    }
                                    if (z20) {
                                        ViewPropertyAnimator interpolator = this.j2.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.h);
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
                                        ViewPropertyAnimator withEndAction = this.j2.animate().alpha(0.0f).setDuration(180L).setInterpolator(bs.h).withEndAction(new c2(this, 0));
                                        this.k2 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.j2.setAlpha(0.0f);
                                        this.j2.setVisibility(8);
                                    }
                                }
                                this.x1.a(z9.D1, false);
                                if (this.K1 && n4Var.a != null) {
                                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + n4Var.a.id + " " + n4.c(n4Var));
                                }
                                if (this.C1) {
                                    t5.f(this.C2, this.B1, n4Var.a);
                                }
                                k4 k4Var = l4Var2.b;
                                z6 z6Var3 = z9Var.O0;
                                k4Var.setPadding(0, 0, (z6Var3 != null || z6Var3.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                                MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(n4Var.a);
                                if (!z10 && !this.C1 && this.z3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                                    c2 c2Var = new c2(this, 1);
                                    this.z3 = c2Var;
                                    AndroidUtilities.runOnUIThread(c2Var, 500L);
                                }
                                x3Var3 = this.G0;
                                if (!(x3Var3 == null && x3Var3.V) && n4Var.j() && z9.D1) {
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
                                    if (H0() && !I0()) {
                                        z41 = n4Var.e;
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
                                    z40 = n4Var.f;
                                    imageView2.setVisibility((!z40 || e9Var.f) ? 8 : i19);
                                    return;
                                }
                                return;
                            }
                        }
                        m2Var.r(this.B1, null);
                        m2Var.setVisibility(8);
                        q3Var2.invalidate();
                        if (this.Q1 != null) {
                            ((q9) this.Q1).a(this.J1, this.B1);
                        }
                        z37 = this.D1;
                        g3 g3Var32 = this.P0;
                        ImageView imageView32 = this.N0;
                        g3 g3Var42 = this.D0;
                        if (z37) {
                        }
                        g3Var42.requestLayout();
                        z9Var.e1.append(this.B1, i10);
                        if (this.K1) {
                        }
                        m2Var.setLivePlayer(z9Var.A0);
                        this.L1 = 0;
                        if (z9Var.O0 != null) {
                            int i352 = storyItem12.id;
                            i21 = 0;
                            while (true) {
                                if (i21 < z9Var.O0.i.size()) {
                                }
                                i21++;
                            }
                        }
                        int i362 = this.J1;
                        this.M1 = i362;
                        int i372 = this.A1;
                        this.N1 = i372;
                        if (z9Var.R0) {
                        }
                        l4 = n4Var.l();
                        h4 h4Var2 = this.y0;
                        if (l4) {
                        }
                        g7Var7 = n4Var.b;
                        e9 e9Var2 = this.C0;
                        if (g7Var7 == null) {
                        }
                        this.b4 = false;
                        e9Var2.setTranslationX(h4Var2.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z22) {
                        }
                        g7Var8 = n4Var.b;
                        if (g7Var8 == null) {
                        }
                        if (this.j2 != null) {
                        }
                        this.x1.a(z9.D1, false);
                        if (this.K1) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + n4Var.a.id + " " + n4.c(n4Var));
                        }
                        if (this.C1) {
                        }
                        k4 k4Var2 = l4Var2.b;
                        z6 z6Var32 = z9Var.O0;
                        k4Var2.setPadding(0, 0, (z6Var32 != null || z6Var32.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(n4Var.a);
                        if (!z10) {
                            c2 c2Var2 = new c2(this, 1);
                            this.z3 = c2Var2;
                            AndroidUtilities.runOnUIThread(c2Var2, 500L);
                        }
                        x3Var3 = this.G0;
                        if (x3Var3 == null) {
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
                q3Var = this.c1;
                u3Var = this.K0;
                l4Var = this.o1;
                if (g7Var4 != null) {
                }
                u2Var = this.b2;
                if (u2Var != null) {
                }
                z18 = n4Var.f;
                if (z18) {
                }
                qyVar.c();
                this.W0 = 0L;
                this.Y0 = z17;
                g7Var5 = n4Var.b;
                if (g7Var5 != null) {
                }
                qcVar = qc.w;
                if (qcVar != null) {
                    qcVar.b();
                }
                u3Var.J();
                p0();
                z16 = true;
                if (z16) {
                }
                l4Var.setOnSubtitleClick(null);
                TextView[] textViewArr2 = l4Var.c;
                this.Q3 = 0;
                z20 = z61;
                i13 = 2;
                long j102 = this.B1;
                boolean z632 = z62;
                z21 = n4Var.f;
                V0(j102, false, z21);
                g7Var6 = n4Var.b;
                if (g7Var6 != null) {
                }
                z22 = z16;
                f3Var2 = f3Var;
                q3Var2 = q3Var;
                u3Var2 = u3Var;
                l4Var2 = l4Var;
                charSequence2 = charSequence3;
                charSequence = charSequence2;
                z23 = z632;
                if (charSequence == null) {
                }
                x3Var = this.F0;
                if (x3Var != null) {
                }
                x3Var2 = this.G0;
                if (x3Var2 != null) {
                }
                storyItem10 = n4Var.a;
                if (storyItem6 == storyItem10) {
                }
                n4Var.o();
                if (!n4Var.g) {
                }
                z9 z9Var52 = ((q9) i4Var).d;
                z9Var52.Z0 = false;
                z9Var52.P();
                z25 = n4Var.f;
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
                m2 m2Var2 = this.L0;
                if (aVar != null) {
                }
                t1Var = this.a2;
                if (t1Var != null) {
                }
                if (this.Z1 != null) {
                }
                z36 = n4Var.f;
                if (z36) {
                }
                u3 u3Var32 = u3Var2;
                if (this.K1) {
                }
                u3Var32.setVisibility(8);
                storyItem11 = n4Var.a;
                if (storyItem11 != null) {
                }
                m2Var2.r(this.B1, null);
                m2Var2.setVisibility(8);
                q3Var2.invalidate();
                if (this.Q1 != null) {
                }
                z37 = this.D1;
                g3 g3Var322 = this.P0;
                ImageView imageView322 = this.N0;
                g3 g3Var422 = this.D0;
                if (z37) {
                }
                g3Var422.requestLayout();
                z9Var.e1.append(this.B1, i10);
                if (this.K1) {
                }
                m2Var2.setLivePlayer(z9Var.A0);
                this.L1 = 0;
                if (z9Var.O0 != null) {
                }
                int i3622 = this.J1;
                this.M1 = i3622;
                int i3722 = this.A1;
                this.N1 = i3722;
                if (z9Var.R0) {
                }
                l4 = n4Var.l();
                h4 h4Var22 = this.y0;
                if (l4) {
                }
                g7Var7 = n4Var.b;
                e9 e9Var22 = this.C0;
                if (g7Var7 == null) {
                }
                this.b4 = false;
                e9Var22.setTranslationX(h4Var22.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z22) {
                }
                g7Var8 = n4Var.b;
                if (g7Var8 == null) {
                }
                if (this.j2 != null) {
                }
                this.x1.a(z9.D1, false);
                if (this.K1) {
                }
                if (this.C1) {
                }
                k4 k4Var22 = l4Var2.b;
                z6 z6Var322 = z9Var.O0;
                k4Var22.setPadding(0, 0, (z6Var322 != null || z6Var322.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(n4Var.a);
                if (!z10) {
                }
                x3Var3 = this.G0;
                if (x3Var3 == null) {
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
        storyItem5 = n4Var.a;
        if (storyItem5 != null) {
            z9Var.P0 = storyItem5.id;
        }
        z9Var.n0.A();
        this.Y2 = true;
        if (!this.C1) {
        }
        j1(false);
        TL_stories.StoryItem storyItem212 = n4Var.a;
        g7 g7Var102 = n4Var.b;
        if (storyItem212 == null) {
        }
        if (storyItem2 == null) {
        }
        if (i32 == i12) {
        }
        if (z61) {
        }
        h1Var = z9Var.A0;
        if (h1Var != null) {
        }
        z16 = false;
        q3Var = this.c1;
        u3Var = this.K0;
        l4Var = this.o1;
        if (g7Var4 != null) {
        }
        u2Var = this.b2;
        if (u2Var != null) {
        }
        z18 = n4Var.f;
        if (z18) {
        }
        qyVar.c();
        this.W0 = 0L;
        this.Y0 = z17;
        g7Var5 = n4Var.b;
        if (g7Var5 != null) {
        }
        qcVar = qc.w;
        if (qcVar != null) {
        }
        u3Var.J();
        p0();
        z16 = true;
        if (z16) {
        }
        l4Var.setOnSubtitleClick(null);
        TextView[] textViewArr22 = l4Var.c;
        this.Q3 = 0;
        z20 = z61;
        i13 = 2;
        long j1022 = this.B1;
        boolean z6322 = z62;
        z21 = n4Var.f;
        V0(j1022, false, z21);
        g7Var6 = n4Var.b;
        if (g7Var6 != null) {
        }
        z22 = z16;
        f3Var2 = f3Var;
        q3Var2 = q3Var;
        u3Var2 = u3Var;
        l4Var2 = l4Var;
        charSequence2 = charSequence3;
        charSequence = charSequence2;
        z23 = z6322;
        if (charSequence == null) {
        }
        x3Var = this.F0;
        if (x3Var != null) {
        }
        x3Var2 = this.G0;
        if (x3Var2 != null) {
        }
        storyItem10 = n4Var.a;
        if (storyItem6 == storyItem10) {
        }
        n4Var.o();
        if (!n4Var.g) {
        }
        z9 z9Var522 = ((q9) i4Var).d;
        z9Var522.Z0 = false;
        z9Var522.P();
        z25 = n4Var.f;
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
        m2 m2Var22 = this.L0;
        if (aVar != null) {
        }
        t1Var = this.a2;
        if (t1Var != null) {
        }
        if (this.Z1 != null) {
        }
        z36 = n4Var.f;
        if (z36) {
        }
        u3 u3Var322 = u3Var2;
        if (this.K1) {
        }
        u3Var322.setVisibility(8);
        storyItem11 = n4Var.a;
        if (storyItem11 != null) {
        }
        m2Var22.r(this.B1, null);
        m2Var22.setVisibility(8);
        q3Var2.invalidate();
        if (this.Q1 != null) {
        }
        z37 = this.D1;
        g3 g3Var3222 = this.P0;
        ImageView imageView3222 = this.N0;
        g3 g3Var4222 = this.D0;
        if (z37) {
        }
        g3Var4222.requestLayout();
        z9Var.e1.append(this.B1, i10);
        if (this.K1) {
        }
        m2Var22.setLivePlayer(z9Var.A0);
        this.L1 = 0;
        if (z9Var.O0 != null) {
        }
        int i36222 = this.J1;
        this.M1 = i36222;
        int i37222 = this.A1;
        this.N1 = i37222;
        if (z9Var.R0) {
        }
        l4 = n4Var.l();
        h4 h4Var222 = this.y0;
        if (l4) {
        }
        g7Var7 = n4Var.b;
        e9 e9Var222 = this.C0;
        if (g7Var7 == null) {
        }
        this.b4 = false;
        e9Var222.setTranslationX(h4Var222.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z22) {
        }
        g7Var8 = n4Var.b;
        if (g7Var8 == null) {
        }
        if (this.j2 != null) {
        }
        this.x1.a(z9.D1, false);
        if (this.K1) {
        }
        if (this.C1) {
        }
        k4 k4Var222 = l4Var2.b;
        z6 z6Var3222 = z9Var.O0;
        k4Var222.setPadding(0, 0, (z6Var3222 != null || z6Var3222.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(n4Var.a);
        if (!z10) {
        }
        x3Var3 = this.G0;
        if (x3Var3 == null) {
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
    public final void f1() {
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
                    U0((g7) arrayList13.get(i10 - arrayList2.size()), imageReceiver, k10);
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
                    g7 t10 = this.S1.t(j10, storyItem2);
                    if (t10 != null) {
                        U0(t10, imageReceiver, k10);
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
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), si.o0.u(k10, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), k10, null, null, null, 0L, null, null, 0);
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
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), si.o0.u(k10, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), k10, null, null, null, 0L, null, storyItem, 0);
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
        q9 q9Var = (q9) this.Q1;
        z9 z9Var = q9Var.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z10 = z9Var.H0;
            ArrayList arrayList16 = z9Var.M0;
            if (z10) {
                return;
            }
            for (int i19 = 0; i19 < arrayList16.size(); i19++) {
                for (int i20 = 0; i20 < arrayList15.size(); i20++) {
                    if (((Uri) arrayList15.get(i20)).equals(((y9) arrayList16.get(i19)).uri)) {
                        arrayList15.remove(i20);
                    }
                }
            }
            for (int i21 = 0; i21 < arrayList15.size(); i21++) {
                Uri uri = (Uri) arrayList15.get(i21);
                y9 y9Var = new y9(z9Var, z9Var.C0, z9Var.B0);
                y9Var.setOnSeekUpdate(new u7(7, q9Var, y9Var));
                y9Var.uri = uri;
                TLRPC.Document document2 = (TLRPC.Document) arrayList14.get(i21);
                y9Var.document = document2;
                FileStreamLoadOperation.setPriorityForDocument(document2, 0);
                y9Var.preparePlayer(uri, z9.D1, z9.B1);
                arrayList16.add(y9Var);
                if (arrayList16.size() > 2) {
                    ((y9) arrayList16.remove(0)).release(null);
                }
            }
        }
    }

    public final void g1() {
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
        q3 q3Var = this.c1;
        Bitmap createBitmap = Bitmap.createBitmap(q3Var.getWidth(), q3Var.getHeight(), Bitmap.Config.ARGB_8888);
        D0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public h7 getStoriesController() {
        return MessagesController.getInstance(this.C2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.D2, this.v1.size()) + this.w1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.v1;
    }

    public final void h1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.z1;
        z9 z9Var = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.w1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((g7) arrayList2.get(i11)).a;
                    if (((int) (j10 ^ (j10 >>> 32))) == z9Var.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            }
            int indexOf = this.z1.indexOf(Integer.valueOf(z9Var.P0));
            if (indexOf < 0 && !this.z1.isEmpty()) {
                if (z9Var.P0 > ((Integer) this.z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (z9Var.P0 < ((Integer) i2.o1.i(1, this.z1)).intValue()) {
                    indexOf = this.z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = z9Var.e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !z9Var.N0 && (peerStories = this.u1) != null && peerStories.max_read_id > 0) {
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

    public final void i1() {
        z6 z6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.v1;
        arrayList.clear();
        z9 z9Var = this.J0;
        if (!z9Var.N0) {
            ArrayList arrayList2 = this.z1;
            int i10 = 0;
            ArrayList arrayList3 = this.w1;
            if (arrayList2 != null && (z6Var = z9Var.O0) != null) {
                if (z6Var instanceof s6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((s6) z9Var.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            g7 g7Var = (g7) E.get(i11);
                            ei.a8 a8Var = g7Var.c;
                            if (a8Var != null && !a8Var.g && TextUtils.equals(a8Var.K0, str)) {
                                arrayList3.add(g7Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = z9Var.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (z9Var.O0 != null) {
                while (i10 < z9Var.O0.i.size()) {
                    arrayList.add(((MessageObject) z9Var.O0.i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = z9Var.Q0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.B1) {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.u1 = y3;
                    if (y3 == null) {
                        this.u1 = this.S1.z(this.B1);
                    }
                } else {
                    this.u1 = z9Var.Q0;
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
        } else if (!z9Var.S0) {
            arrayList.add(z9Var.T0);
        }
        this.A1 = getStoriesCount();
    }

    public final void j0(boolean z10) {
        p4 currentPeerView;
        n60 n60Var = this.J2;
        if (n60Var != null) {
            n60Var.f0 = null;
            n60Var.a(false);
        }
        long j10 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.a;
        z9 z9Var = this.J0;
        z9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            z9.E1.remove(j10 + (j10 >> 16) + (storyItem.id << 16));
        }
        this.i3 = true;
        p9 p9Var = z9Var.n0;
        if (p9Var != null && (currentPeerView = p9Var.getCurrentPeerView()) != null) {
            currentPeerView.r0();
        }
        if (z10) {
            qc I = new xc(this.c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new c2(this, 2));
            I.r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.C2).ensureMessagesLoaded(this.B1, 0, null);
    }

    public final void j1(boolean z10) {
        int i10;
        n4 n4Var = this.O1;
        TL_stories.StoryItem storyItem = n4Var.a;
        if (storyItem == null) {
            storyItem = n4Var.c;
        }
        boolean z11 = this.D1;
        if (z11 || this.C1) {
            if (storyItem == null) {
                this.A2.setText("");
                this.F2.setVisibility(8);
                this.B2.setVisibility(8);
                return;
            }
            z9 z9Var = this.J0;
            g3 g3Var = this.D0;
            if (!z11) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.A2.setText(LocaleController.getString(z9Var.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
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
                        xq xqVar = new xq(R.drawable.mini_views_likes, 0);
                        xqVar.setOverrideColor(-53704);
                        xqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(xqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        xq xqVar2 = new xq(R.drawable.mini_repost_story, 0);
                        xqVar2.setOverrideColor(-14161823);
                        xqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(xqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
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
                g3Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
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
                p6Var.t(Integer.toString(i10), z10 && this.V0, true);
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
                org.telegram.ui.Components.f6 f6Var = this.T0;
                if (f6Var != null) {
                    f6Var.d(this.V0 ? 1.0f : 0.0f, true);
                }
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
            if (!(this.E1 && (ChatObject.canSendPlain(chat) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                this.A2.setText(LocaleController.getString(z9Var.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new xq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.A2.setText(spannableStringBuilder2);
            } else {
                this.A2.setText("");
            }
            g3Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.U0 ? this.Q0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + g3Var.getLayoutParams().width;
            g3 g3Var2 = this.P0;
            if (g3Var2 != null) {
                g3Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.V0 ? this.R0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += g3Var2.getLayoutParams().width;
                g3Var2.requestLayout();
            }
            this.W1.requestLayout();
            g3Var.requestLayout();
            this.B2.setVisibility(8);
            this.F2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = n4Var.a;
            m3 m3Var = this.j1;
            if (storyItem2 == null) {
                m3Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < m3Var.getChildCount(); i15++) {
                if (m3Var.getChildAt(i15) instanceof g9) {
                    ((g9) m3Var.getChildAt(i15)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void k0() {
        m7 m7Var = this.E0;
        m7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new r2(0, m7Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        m7 m7Var2 = new m7(getContext(), this.x1);
        this.E0 = m7Var2;
        m7Var2.setPadding(dp, dp, dp, dp);
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
    public final void k1() {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.p4.k1():void");
    }

    public final void l0(boolean z10) {
        ValueAnimator valueAnimator = this.c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d4, z10 ? 1.0f : 0.0f);
        this.c4 = ofFloat;
        ofFloat.addUpdateListener(new d2(this, 2));
        this.c4.addListener(new p2(this, z10, 1));
        this.c4.setDuration(420L);
        this.c4.setInterpolator(bs.h);
        this.c4.start();
    }

    public final void m0(Runnable runnable) {
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
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 0, this.B0);
        c2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        c2Var.n(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        a1.c cVar = new a1.c(runnable, 16);
        c2Var.n0 = string;
        c2Var.o0 = cVar;
        String string2 = LocaleController.getString(R.string.Cancel);
        c3.m mVar = new c3.m(6);
        c2Var.p0 = string2;
        c2Var.q0 = mVar;
        c2Var.show();
    }

    public final void n0(int i10) {
        this.E2 = false;
        this.V2 = true;
        this.B3 = false;
        this.D1 = false;
        this.E1 = false;
        long j10 = this.B1;
        l4 l4Var = this.o1;
        org.telegram.ui.Components.h9 h9Var = this.n1;
        if (j10 >= 0) {
            this.C1 = j10 == UserConfig.getInstance(this.C2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            this.F1 = !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            h9Var.m(this.C2, user);
            l4Var.a.getImageReceiver().setForUserOrChat(user, h9Var);
            V0(this.B1, true, false);
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
            h9Var.k(this.C2, chat);
            l4Var.a.getImageReceiver().setForUserOrChat(chat, h9Var);
            V0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            h7 h7Var = this.S1;
            long j11 = this.B1;
            a0.h hVar = h7Var.m;
            ia iaVar = (ia) hVar.f(j11);
            if (iaVar == null) {
                iaVar = new ia(h7Var.a, j11, h7Var);
                hVar.k(iaVar, j11);
            }
            iaVar.b(true);
        }
        i1();
        this.J1 = i10;
        if (i10 < 0) {
            this.J1 = 0;
        }
        this.W0 = 0L;
        this.Y0 = false;
        this.J3 = null;
        this.K3 = null;
        boolean z10 = this.D1;
        q3 q3Var = this.c1;
        z9 z9Var = this.J0;
        int i11 = 8;
        n4 n4Var = this.O1;
        if (z10) {
            A0();
            if (this.b2 == null && (this.E1 || n4Var.f)) {
                u0();
            }
            if (this.b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                u2 u2Var = this.b2;
                if (n4Var.f || (!H0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                u2Var.setVisibility(i11);
                u2 u2Var2 = this.b2;
                boolean z11 = n4Var.f;
                C0(true);
                u2Var2.f1(z11);
                this.b2.l1(n4Var.f && !C0(true) && (this.v2 || this.b2.W0), true);
                iu editField = this.b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem = n4Var.a;
                z9Var.getClass();
                editField.setText(z9.u(j12, storyItem));
                this.b2.Y0(this.C2, this.B1);
                this.b2.H1(chat2, null);
            }
            org.telegram.ui.Components.p6 p6Var = this.Q0;
            org.telegram.ui.ActionBar.g6 g6Var = this.B0;
            if (p6Var == null) {
                org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, false, false);
                this.Q0 = p6Var2;
                g3 g3Var = this.D0;
                p6Var2.setCallback(g3Var);
                this.Q0.u(g6Var.g(org.telegram.ui.ActionBar.k6.G6));
                this.Q0.w(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.f6(g3Var);
            }
            g3 g3Var2 = this.P0;
            if (g3Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(false, false, false);
                this.R0 = p6Var3;
                p6Var3.setCallback(g3Var2);
                this.R0.u(g6Var.g(org.telegram.ui.ActionBar.k6.G6));
                this.R0.w(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.f6(g3Var2);
            }
            if (i10 == -1) {
                h1();
            }
            e1(false);
            this.A1 = getStoriesCount();
            q3Var.invalidate();
            invalidate();
        } else if (this.C1) {
            A0();
            if (n4Var.f) {
                this.W1.setVisibility(8);
                if (this.b2 == null) {
                    u0();
                }
                this.b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                u2 u2Var3 = this.b2;
                if (u2Var3 != null) {
                    u2Var3.setVisibility(8);
                }
            }
            u2 u2Var4 = this.b2;
            if (u2Var4 != null) {
                boolean z12 = n4Var.f;
                C0(true);
                u2Var4.f1(z12);
                this.b2.l1(n4Var.f && !C0(true) && (this.v2 || this.b2.W0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(z9Var.P0));
                    if (indexOf < 0 && !this.z1.isEmpty()) {
                        if (z9Var.P0 > ((Integer) this.z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (z9Var.P0 < ((Integer) i2.o1.i(1, this.z1)).intValue()) {
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
            e1(false);
            q3Var.invalidate();
            invalidate();
        } else {
            if (this.b2 == null) {
                u0();
            }
            if (this.F1 && this.g2 == null) {
                y0();
            }
            if (this.g2 != null) {
                if (this.F1 || this.G1) {
                    g1();
                }
                this.g2.setVisibility(((!this.F1 || n4Var.f) && !this.G1) ? 8 : 0);
            }
            x8 x8Var = this.j2;
            if (x8Var != null) {
                x8Var.setVisibility(8);
            }
            if (i10 == -1) {
                h1();
            }
            e1(false);
            u2 u2Var5 = this.b2;
            if (u2Var5 != null) {
                u2Var5.setVisibility((H0() || UserObject.isService(this.B1)) ? 8 : 0);
                u2 u2Var6 = this.b2;
                boolean z13 = n4Var.f;
                C0(true);
                u2Var6.f1(z13);
                this.b2.l1(n4Var.f && !C0(true) && (this.v2 || this.b2.W0), true);
                iu editField2 = this.b2.getEditField();
                long j13 = this.B1;
                TL_stories.StoryItem storyItem2 = n4Var.a;
                z9Var.getClass();
                editField2.setText(z9.u(j13, storyItem2));
                this.b2.Y0(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.b2.H1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.z2, false);
                }
            }
            this.A1 = getStoriesCount();
            g3 g3Var3 = this.W1;
            if (g3Var3 != null) {
                g3Var3.setVisibility(8);
            }
            q3Var.invalidate();
            invalidate();
        }
        q0(false);
    }

    public final void o0() {
        u3 u3Var = this.K0;
        if (u3Var.W.x()) {
            u3Var.W.f(false);
        }
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
        u2 u2Var = this.b2;
        if (u2Var != null) {
            u2Var.C0();
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
        u2 u2Var = this.b2;
        if (u2Var != null) {
            u2Var.B0();
        }
        org.telegram.ui.Components.r5 r5Var = this.o3;
        if (r5Var != null) {
            r5Var.o(this);
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
        n60 n60Var;
        boolean z10;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        gl0 gl0Var;
        w2 w2Var;
        z9 z9Var = this.J0;
        if (z9Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i12 = 0;
        if (this.K1 && this.Z2 == null) {
            this.y2 = ((q9) this.Q1).d.p0;
        } else {
            this.y2 = 0;
        }
        int size = z9Var.b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.y2;
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
            u2 u2Var = this.b2;
            if (u2Var != null && (u2Var.q0() || this.b2.k3)) {
                if (this.b2.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.b2.getEmojiPadding();
                } else {
                    u2 u2Var2 = this.b2;
                    if (u2Var2.z3) {
                        u2Var2.I();
                        i13 = this.b2.getStickersExpandedHeight();
                    } else {
                        i13 = u2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.r3.getReactionsWindow().c.animate().translationY(-this.y2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
            i13 = 0;
        }
        boolean z11 = this.v2;
        int i14 = this.o2;
        l4 l4Var = this.o1;
        int i15 = 1;
        if (i14 != i13) {
            this.v2 = false;
            int i16 = 3;
            n4 n4Var = this.O1;
            f7 = 8.0f;
            if (i13 <= 0 || !this.K1) {
                u2 u2Var3 = this.b2;
                if (u2Var3 != null) {
                    z9.J(this.B1, n4Var.a, u2Var3.getEditText());
                }
            } else {
                this.v2 = true;
                this.i3 = false;
                this.t2 = i13;
                if (this.f2 == null) {
                    gl0 gl0Var3 = new gl0(1, this.C2, getContext(), LaunchActivity.R(), new s2(i16, this.B0));
                    this.f2 = gl0Var3;
                    gl0Var3.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    gl0 gl0Var4 = this.f2;
                    gl0Var4.N0 = true;
                    addView(gl0Var4, this.I0, w7.z5.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.f2.setDelegate(new l3(this));
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
            u2 u2Var4 = this.b2;
            if (u2Var4 != null) {
                u2Var4.l1(n4Var.f && !C0(true) && this.v2, true);
            }
            if (this.v2 && (w2Var = this.d3) != null) {
                w2Var.setVisibility(0);
            }
            if (!this.v2 && (gl0Var = this.f2) != null) {
                gl0Var.n();
            }
            l4Var.setEnabled(!this.v2);
            if (this.b2 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.v2, 0.1f, true);
            }
            if (this.K1 && this.v2) {
                z9 z9Var2 = ((q9) this.Q1).d;
                if (!z9Var2.x) {
                    z9Var2.x = true;
                    z9Var2.P();
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
            ofFloat.addUpdateListener(new d2(this, i12));
            this.p2.addListener(new q2(this, i15));
            if (this.v2) {
                this.p2.setDuration(250L);
                this.p2.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                z9Var.m();
            } else {
                this.p2.setDuration(500L);
                this.p2.setInterpolator(bs.h);
            }
            this.p2.start();
            boolean z12 = this.v2;
            if (z12 != z11) {
                if (z12) {
                    com.google.firebase.messaging.l lVar = this.P1;
                    Canvas canvas = (Canvas) lVar.b;
                    Bitmap bitmap = (Bitmap) lVar.c;
                    D0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.a.o(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (n4Var.f) {
                        ei.x3 x3Var = this.d2;
                        if (x3Var != null) {
                            if (!x3Var.V) {
                                removeView(x3Var);
                            }
                        }
                        if (!C0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            ei.x3 x3Var2 = new ei.x3(getContext(), 3);
                            this.d2 = x3Var2;
                            x3Var2.s(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.d2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            ei.x3 x3Var3 = this.d2;
                            x3Var3.K = Layout.Alignment.ALIGN_OPPOSITE;
                            x3Var3.l0 = new qa(14, this, x3Var2);
                            addView(x3Var3, w7.z5.e(-1, 100, 87));
                            this.d2.u();
                            k1();
                        }
                    }
                } else {
                    u2 u2Var5 = this.b2;
                    if (u2Var5 != null) {
                        u2Var5.getEditField().clearFocus();
                    }
                    ei.x3 x3Var4 = this.d2;
                    if (x3Var4 != null) {
                        x3Var4.e(true);
                    }
                }
                this.u2 = true;
            } else {
                this.u2 = false;
            }
        } else {
            f7 = 8.0f;
        }
        u2 u2Var6 = this.b2;
        if (u2Var6 != null && u2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.b2.getEmojiView().getLayoutParams()).gravity = 80;
        }
        q3 q3Var = this.c1;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) q3Var.getLayoutParams();
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
            q3Var.setLayoutParams(layoutParams2);
        }
        g3 g3Var = this.W1;
        if (g3Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) g3Var.getLayoutParams();
            if (this.x2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f7) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        wd wdVar = this.b3;
        if (wdVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) wdVar.getLayoutParams();
            if (this.x2) {
                c10 = 0;
                this.b3.setTextColor(i0.a.f(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                n60Var = this.J2;
                if (n60Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) n60Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.v0.z(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i13;
                    }
                }
                z10 = this.x2;
                LinearLayout linearLayout = this.O0;
                u3 u3Var = this.K0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.C1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) u3Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.w2 != this.x2) {
                        u3Var.setLayoutParams((FrameLayout.LayoutParams) u3Var.getLayoutParams());
                    }
                    u3Var.u0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) u3Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f7);
                    if (this.w2 != this.x2) {
                        u3Var.setLayoutParams((FrameLayout.LayoutParams) u3Var.getLayoutParams());
                    }
                    u3Var.u0 = AndroidUtilities.dp(f7);
                }
                this.V2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.C0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.y0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                k4 k4Var = l4Var.b;
                TextView[] textViewArr = l4Var.c;
                layoutParams = (FrameLayout.LayoutParams) k4Var.getLayoutParams();
                if (layoutParams.rightMargin != dp) {
                    int i17 = (int) dp;
                    layoutParams.rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i17;
                    l4Var.forceLayout();
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.w2 = this.x2;
            }
            this.b3.setTextColor(i0.a.o(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c10 = 0;
        n60Var = this.J2;
        if (n60Var != null) {
        }
        z10 = this.x2;
        LinearLayout linearLayout2 = this.O0;
        u3 u3Var2 = this.K0;
        if (z10) {
        }
        this.V2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.C0.getVisibility() == 0) {
        }
        if (this.y0.getVisibility() == 0) {
        }
        k4 k4Var2 = l4Var.b;
        TextView[] textViewArr2 = l4Var.c;
        layoutParams = (FrameLayout.LayoutParams) k4Var2.getLayoutParams();
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
        if (this.K1) {
            ((q9) this.Q1).d.P();
        }
    }

    public final void q0(boolean z10) {
        if (this.b2 != null && this.f3 && this.a1) {
            c2 c2Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(c2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.b2.F(true);
            boolean z11 = this.F1;
            n4 n4Var = this.O1;
            if ((z11 && !n4Var.f) || this.G1) {
                this.k3 = false;
                this.b2.setEnabled(false);
                this.b2.g1(" ", z10);
                return;
            }
            if (this.H1 > 0) {
                this.k3 = false;
                this.b2.setEnabled(true);
                this.b2.g1(nd.R0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
                return;
            }
            if (!n4Var.f && tL_storiesStealthMode != null) {
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
                        u2 u2Var = this.b2;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        u2Var.e = formatString;
                        u2Var.f = format;
                        u2Var.D1(z10);
                    } else {
                        this.b2.g1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    AndroidUtilities.runOnUIThread(c2Var, 1000L);
                    return;
                }
            }
            this.k3 = false;
            this.b2.setEnabled(true);
            if (!n4Var.f) {
                this.b2.g1(LocaleController.getString(this.E1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            if (this.b2.getStarsPrice() <= 0) {
                this.b2.g1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.b2.g1(nd.W0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.b2.O4), z10);
            xq xqVar = this.b2.O4[0];
            if (xqVar != null) {
                xqVar.spaceScaleX = 0.9f;
            }
        }
    }

    public final boolean r0() {
        if (this.s3) {
            if (this.r3.getReactionsWindow() == null) {
                a1(false);
                return true;
            }
            if (this.y2 > 0) {
                AndroidUtilities.hideKeyboard(this.r3.getReactionsWindow().c);
                return true;
            }
            this.r3.getReactionsWindow().d();
            return true;
        }
        m3 m3Var = this.j1;
        if (m3Var != null) {
            ei.x3 x3Var = m3Var.c;
            if (x3Var != null) {
                x3Var.e(true);
                m3Var.c = null;
            }
            m3Var.b = null;
            m3Var.invalidate();
            m3Var.b(false);
        }
        u3 u3Var = this.K0;
        if (u3Var.W.x()) {
            u3Var.W.f(false);
            return true;
        }
        ei.x3 x3Var2 = this.F0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        ei.x3 x3Var3 = this.G0;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        r40 r40Var = this.W2;
        if (r40Var != null) {
            r40Var.b(true);
        }
        g4 g4Var = this.t1;
        if (g4Var != null && g4Var.b) {
            g4Var.a();
            return true;
        }
        u2 u2Var = this.b2;
        if (u2Var != null && u2Var.s0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.b2.c1) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new y1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((q9) this.Q1).h(alertDialog$Builder.a);
            return true;
        }
        gl0 gl0Var = this.f2;
        if (gl0Var != null && gl0Var.getReactionsWindow() != null && !this.f2.getReactionsWindow().q) {
            this.f2.getReactionsWindow().d();
            return true;
        }
        u2 u2Var2 = this.b2;
        if (u2Var2 != null && u2Var2.q0()) {
            if (this.y2 > 0) {
                AndroidUtilities.hideKeyboard(this.b2.getEmojiView());
                return true;
            }
            this.b2.k0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (u3Var.getVisibility() != 0 || u3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            u3Var.C();
            this.g3 = false;
            this.c1.invalidate();
            return true;
        }
        u2 u2Var3 = this.b2;
        if (u2Var3 != null) {
            long j10 = this.B1;
            TL_stories.StoryItem storyItem = this.O1.a;
            Editable editText = u2Var3.getEditText();
            this.J0.getClass();
            z9.J(j10, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.b2);
        return true;
    }

    public final void s0() {
        if (this.I2 == null) {
            a3 a3Var = new a3(this, getContext(), this.B0);
            this.I2 = a3Var;
            a3Var.c2 = new b3(this);
            a3Var.j0.f0();
            a3 a3Var2 = this.I2;
            a3Var2.W = true;
            a3Var2.w1();
            a3 a3Var3 = this.I2;
            a3Var3.X = new c3(this);
            a3Var3.r1().setText(this.b2.getFieldText());
        }
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
        S0(0L, z10);
    }

    public void setDelegate(i4 i4Var) {
        this.Q1 = i4Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f3 == z10) {
            return;
        }
        this.f3 = z10;
        if (z10) {
            this.e1.setCurrentAlpha(1.0f);
            q0(false);
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
                    z9 z9Var = ((q9) this.Q1).d;
                    z9Var.l1 = true;
                    z9Var.P();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            f3 f3Var = this.e1;
            if (z10) {
                f3Var.stopAnimation();
                f3Var.setAllowStartAnimation(false);
            } else {
                f3Var.startAnimation();
                f3Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.c1.invalidate();
        }
    }

    public final void t0() {
        if (this.X1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.I3);
        this.X1 = aVar;
        aVar.setOnClickListener(new e2(this, 1));
        addView(this.X1, w7.z5.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void u0() {
        org.telegram.ui.ActionBar.g6 g6Var = this.B0;
        u2 u2Var = new u2(this, AndroidUtilities.findActivity(getContext()), this, new s2(1, g6Var));
        this.b2 = u2Var;
        u2Var.getEditField().useAnimatedTextDrawable();
        this.b2.getEditField().setScaleX(0.0f);
        this.b2.setOverrideKeyboardAnimation(true);
        this.b2.setClipChildren(false);
        this.b2.setDelegate(new v2(this));
        setDelegate(this.b2);
        u2 u2Var2 = this.b2;
        u2Var2.y4 = false;
        u2Var2.z4 = true;
        if (this.O1.f) {
            u2Var2.S0(false, false, false);
        } else {
            u2Var2.S0(true, true, false);
        }
        this.b2.updateColors();
        u2 u2Var3 = this.b2;
        u2Var3.A4 = true;
        addView(u2Var3, w7.z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.O3 != null) {
            this.b2.M1(false);
        }
        this.b2.G2 = this.z2;
        o4 o4Var = this.M2;
        ((ArrayList) o4Var.g).add(this.c1);
        ((ArrayList) o4Var.g).add(this);
        if (this.a1) {
            this.b2.C0();
        }
        q0(false);
        if (H0()) {
            this.b2.setVisibility(8);
        }
        kh.h hVar = new kh.h(getContext(), g6Var, this.I3, this.F3);
        this.c2 = hVar;
        hVar.setOnClickListener(new y1(this, 1));
        addView(this.c2, w7.z5.e(57, 300, 85));
        this.c2.setVisibility(8);
        this.b2.setSideButtonsForAttach(this.c2);
        this.I0 = getChildCount();
    }

    public final void v0() {
        if (this.j2 != null) {
            return;
        }
        x8 x8Var = new x8(getContext(), this.B0);
        this.j2 = x8Var;
        x8Var.setOnClickListener(new e2(this, 4));
        this.j2.setAlpha(0.0f);
        this.j2.setVisibility(8);
        addView(this.j2, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void w0() {
        if (this.a2 != null || getContext() == null) {
            return;
        }
        t1 t1Var = new t1(getContext(), this.I3);
        this.a2 = t1Var;
        t1Var.setOnClickListener(new e2(this, 5));
        t1 t1Var2 = this.a2;
        h1 h1Var = h1.W;
        boolean z10 = true;
        t1Var2.b(h1Var != null && h1Var.o(), false);
        t1 t1Var3 = this.a2;
        h1 h1Var2 = h1.W;
        if (h1Var2 != null && !h1Var2.m()) {
            z10 = false;
        }
        t1Var3.a(z10, false);
        addView(this.a2, w7.z5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void x0() {
        if (this.Z1 != null || getContext() == null) {
            return;
        }
        this.Y1 = new w1(getContext(), this.C2);
        x1 x1Var = new x1(getContext(), this.Y1, this.I3);
        this.Z1 = x1Var;
        x1Var.setOnClickListener(new e2(this, 6));
        this.Z1.setOnLongClickListener(new b2(this, 1));
        addView(this.Z1, w7.z5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.Y1, w7.z5.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void y0() {
        if (this.g2 != null) {
            return;
        }
        if (this.b2 == null) {
            u0();
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
        textView3.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.i2.setGravity(17);
        w7.b6.a(this.i2);
        this.i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.g2.addView(imageView, w7.z5.t(22, 22, 16, 12, 1, 4, 0));
        this.g2.addView(this.h2, w7.z5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.g2.addView(this.i2, w7.z5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.b2.addView(this.g2, w7.z5.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void z0() {
        if (this.b3 != null) {
            return;
        }
        wd wdVar = new wd(getContext(), 1);
        this.b3 = wdVar;
        wdVar.setTextSize(1, 14.0f);
        this.b3.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.b3.setGravity(19);
        this.b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.b3, w7.z5.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }
}
