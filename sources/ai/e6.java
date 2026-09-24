package ai;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.le;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cz;
import org.telegram.ui.hv0;
import org.telegram.ui.vr;
import org.telegram.ui.wb1;
import org.telegram.ui.wn;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public abstract class e6 extends aw0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.d6 B0;
    public long B1;
    public h0 B2;
    public boolean B3;
    public final nb C0;
    public boolean C1;
    public int C2;
    public vr C3;
    public final m4 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.e1 D3;
    public q9 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.e1 E3;
    public ci.e4 F0;
    public boolean F1;
    public n4 F2;
    public final ah.c F3;
    public ci.e4 G0;
    public boolean G1;
    public boolean G2;
    public final fh.a G3;
    public ci.e4 H0;
    public long H1;
    public float H2;
    public final fh.d H3;
    public int I0;
    public final float I1;
    public g4 I2;
    public final dh.b I3;
    public final jc J0;
    public int J1;
    public c60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final g5 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final r3 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final d6 M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final c6 O1;
    public final org.telegram.ui.Components.e6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final m4 P0;
    public final com.google.firebase.messaging.n P1;
    public final org.telegram.ui.Components.e6 P2;
    public final c3 P3;
    public org.telegram.ui.Components.o6 Q0;
    public x5 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.o6 R0;
    public boolean R1;
    public long R2;
    public final c3 R3;
    public org.telegram.ui.Components.e6 S0;
    public l9 S1;
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
    public final q4 V3;
    public long W0;
    public m4 W1;
    public j40 W2;
    public final org.telegram.ui.Components.e6 W3;
    public long X0;
    public c X1;
    public final hv0 X2;
    public final org.telegram.ui.Components.e6 X3;
    public boolean Y0;
    public w2 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.e6 Y3;
    public boolean Z0;
    public x2 Z1;
    public j4 Z2;
    public float Z3;
    public boolean a1;
    public r2 a2;
    public FrameLayout a3;
    public final Path a4;
    public boolean b1;
    public a4 b2;
    public p4 b3;
    public boolean b4;
    public final a5 c1;
    public jh.h c2;
    public boolean c3;
    public ValueAnimator c4;
    public final FrameLayout d1;
    public ci.e4 d2;
    public c4 d3;
    public float d4;
    public final l4 e1;
    public ValueAnimator e2;
    public float e3;
    public final ImageReceiver f1;
    public qk0 f2;
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
    public final v4 j1;
    public gb j2;
    public boolean j3;
    public final cz k1;
    public ViewPropertyAnimator k2;
    public boolean k3;
    public l6 l1;
    public final ch.d l2;
    public final ImageReceiver l3;
    public float m1;
    public final ch.d m2;
    public zg.d m3;
    public final org.telegram.ui.Components.h9 n1;
    public final Paint n2;
    public final ImageReceiver n3;
    public final a6 o1;
    public int o2;
    public org.telegram.ui.Components.q5 o3;
    public final hb p1;
    public ValueAnimator p2;
    public boolean p3;
    public j6.l q1;
    public float q2;
    public boolean q3;
    public int r1;
    public float r2;
    public qk0 r3;
    public org.telegram.ui.ActionBar.e1 s1;
    public float s2;
    public boolean s3;
    public v5 t1;
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
    public final b6 x1;
    public boolean x2;
    public int x3;
    public final w5 y0;
    public final i6 y1;
    public int y2;
    public int y3;
    public final lj0 z0;
    public ArrayList z1;
    public final int z2;
    public c3 z3;

    public e6(Context context, final jc jcVar, b6 b6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.b1 = true;
        this.h1 = new ArrayList();
        this.r1 = -5;
        this.I1 = 1.0f;
        c6 c6Var = new c6(this);
        this.O1 = c6Var;
        this.q2 = -1.0f;
        this.r2 = -1.0f;
        this.s2 = -1.0f;
        this.z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.e6(this);
        this.P2 = new org.telegram.ui.Components.e6(this);
        hv0 hv0Var = new hv0();
        this.X2 = hv0Var;
        this.e3 = 1.0f;
        this.P3 = new c3(this, 4);
        this.R3 = new c3(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        final int i10 = 0;
        this.V3 = new q4(this, i10);
        this.W3 = new org.telegram.ui.Components.e6(this);
        this.X3 = new org.telegram.ui.Components.e6(this);
        this.Y3 = new org.telegram.ui.Components.e6(this);
        this.a4 = new Path();
        hv0Var.E = new a6.m(this, 1);
        d6 d6Var2 = new d6();
        d6Var2.g = new ArrayList();
        this.M2 = d6Var2;
        this.N2 = new AnimationNotificationsLocker();
        this.v1 = new ArrayList();
        this.w1 = new ArrayList();
        l4 l4Var = new l4(this, i10);
        this.e1 = l4Var;
        l4Var.setCrossfadeWithOldImage(false);
        l4Var.setAllowLoadingOnAttachedOnly(true);
        l4Var.ignoreNotifications = true;
        l4Var.setFileLoadingPriority(0);
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
        l4Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.n1 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.J0 = jcVar;
        this.x1 = b6Var;
        this.P1 = b6Var.g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        b6Var.l.setColor(-16777216);
        this.n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = d6Var;
        setClipChildren(false);
        v4 v4Var = new v4(this, context, this.c1, d6Var, jcVar);
        this.j1 = v4Var;
        dh.b bVar = new dh.b(d6Var, org.telegram.ui.ActionBar.h6.Sd, 0.8f);
        this.I3 = bVar;
        fh.c cVar = new fh.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.H3 = null;
            this.G3 = cVar;
        } else {
            fh.d dVar = new fh.d(cVar);
            this.H3 = dVar;
            dVar.h(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        }
        hh.k kVar = new hh.k(this);
        ah.c cVar2 = new ah.c(this.G3);
        cVar2.f = kVar;
        cVar2.g = this;
        this.F3 = cVar2;
        this.l2 = cVar2.c(this, bVar, false);
        ch.d c10 = cVar2.c(this, bVar, false);
        this.m2 = c10;
        c10.u(AndroidUtilities.dp(32.0f));
        a5 a5Var = new a5(this, context, b6Var, jcVar);
        this.c1 = a5Var;
        a5Var.setClipChildren(false);
        this.k1 = new cz(this.C2, a5Var);
        a5Var.addView(v4Var, w7.y5.c(-1.0f, -1));
        g5 g5Var = new g5(this, getContext(), jcVar.y, jcVar, d6Var);
        this.K0 = g5Var;
        g5Var.b0.setOnClickListener(new e3(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(b6Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new e3(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.a6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(b6Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        m4 m4Var = new m4(this, getContext(), 1);
        this.P0 = m4Var;
        org.telegram.ui.Components.o6 o6Var = this.R0;
        if (o6Var != null) {
            o6Var.setCallback(m4Var);
        }
        m4Var.setWillNotDraw(false);
        m4Var.setOnClickListener(new e3(this, 12));
        m4 m4Var2 = new m4(this, getContext(), 2);
        this.D0 = m4Var2;
        org.telegram.ui.Components.o6 o6Var2 = this.Q0;
        if (o6Var2 != null) {
            o6Var2.setCallback(m4Var2);
        }
        m4Var2.setWillNotDraw(false);
        m4Var2.setOnClickListener(new e3(this, 13));
        m4Var2.setOnLongClickListener(new q3(i10, this, jcVar));
        q9 q9Var = new q9(context, b6Var);
        this.E0 = q9Var;
        q9Var.setPadding(dp, dp, dp, dp);
        m4Var2.addView(this.E0, w7.y5.e(40, 40, 3));
        m4Var.addView(imageView2, w7.y5.e(40, 40, 3));
        w7.a6.b(m4Var2, 0.3f, 5.0f);
        w7.a6.b(m4Var, 0.3f, 5.0f);
        l4Var.setAllowLoadingOnAttachedOnly(true);
        l4Var.setParentView(a5Var);
        i6 i6Var = new i6(10);
        this.y1 = i6Var;
        a5Var.setOutlineProvider(i6Var);
        a5Var.setClipToOutline(true);
        addView(a5Var);
        a6 a6Var = new a6(context, c6Var);
        this.o1 = a6Var;
        a6Var.setOnClickListener(new View.OnClickListener(this) { // from class: ai.z2
            public final /* synthetic */ e6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e6 e6Var = this.b;
                        long j3 = UserConfig.getInstance(e6Var.C2).clientUserId;
                        long j10 = e6Var.B1;
                        jc jcVar2 = jcVar;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                jcVar2.H(wn.R9(j10));
                                break;
                            } else {
                                jcVar2.H(ProfileActivity.m4(j10));
                                break;
                            }
                        } else {
                            Bundle g10 = org.telegram.ui.Cells.c1.g(1, TeXSymbolParser.TYPE_ATTR);
                            g10.putLong("dialog_id", e6Var.B1);
                            jcVar2.H(new na0(g10, null));
                            break;
                        }
                    default:
                        e6 e6Var2 = this.b;
                        if (!e6Var2.O1.j()) {
                            e6Var2.c1(true);
                            break;
                        } else {
                            jcVar.O();
                            if (!jc.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            e6Var2.y0.setContentDescription(LocaleController.getString(!jc.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        a5Var.addView(a6Var, w7.y5.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(imageView, w7.y5.q(40, 40, 5));
        linearLayout.addView(m4Var, w7.y5.q(40, 40, 5));
        linearLayout.addView(m4Var2, w7.y5.q(40, 40, 5));
        addView(linearLayout, w7.y5.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.w0 = imageView3;
        imageView3.setImageDrawable(b6Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a5Var.addView(imageView3, w7.y5.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.x0 = imageView4;
        imageView4.setImageDrawable(b6Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        a5Var.addView(imageView4, w7.y5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new v0(jcVar, 1));
        imageView3.setOnClickListener(new s0(this, d6Var, jcVar, context, b6Var, 1));
        w5 w5Var = new w5(context, 0);
        this.y0 = w5Var;
        a5Var.addView(w5Var, w7.y5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        lj0 lj0Var = new lj0(context);
        this.z0 = lj0Var;
        lj0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        w5Var.addView(lj0Var);
        ImageView imageView5 = new ImageView(context);
        this.A0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(b6Var.t);
        w5Var.addView(imageView5);
        imageView5.setVisibility(8);
        nb nbVar = new nb(context);
        this.C0 = nbVar;
        nbVar.setOnClickListener(new e3(this, 2));
        a5Var.addView(nbVar, w7.y5.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i11 = 1;
        w5Var.setOnClickListener(new View.OnClickListener(this) { // from class: ai.z2
            public final /* synthetic */ e6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e6 e6Var = this.b;
                        long j3 = UserConfig.getInstance(e6Var.C2).clientUserId;
                        long j10 = e6Var.B1;
                        jc jcVar2 = jcVar;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                jcVar2.H(wn.R9(j10));
                                break;
                            } else {
                                jcVar2.H(ProfileActivity.m4(j10));
                                break;
                            }
                        } else {
                            Bundle g10 = org.telegram.ui.Cells.c1.g(1, TeXSymbolParser.TYPE_ATTR);
                            g10.putLong("dialog_id", e6Var.B1);
                            jcVar2.H(new na0(g10, null));
                            break;
                        }
                    default:
                        e6 e6Var2 = this.b;
                        if (!e6Var2.O1.j()) {
                            e6Var2.c1(true);
                            break;
                        } else {
                            jcVar.O();
                            if (!jc.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            e6Var2.y0.setContentDescription(LocaleController.getString(!jc.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.p1 = new hb(this, b6Var);
        a5Var.addView(g5Var, w7.y5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        r3 r3Var = new r3(this, context, jcVar, jcVar.v, view, frameLayout, jcVar);
        this.L0 = r3Var;
        a5Var.addView(view, w7.y5.e(-1, 200, 87));
        a5Var.addView(r3Var, w7.y5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        a5Var.addView(frameLayout, w7.y5.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        w5Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.i0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.i0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        m4Var2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        m4Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        org.telegram.ui.Cells.aa aaVar = g5Var.W;
        View o9 = aaVar.o(context);
        if (o9 != null) {
            AndroidUtilities.removeFromParent(o9);
            addView(o9);
        }
        aaVar.D = new s3(this, 0);
        aaVar.T(this);
    }

    public static void V0(k9 k9Var, ImageReceiver imageReceiver, String str) {
        if (k9Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(k9Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(k9Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(e6 e6Var, ValueAnimator valueAnimator) {
        nb nbVar = e6Var.C0;
        e6Var.d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a6 a6Var = e6Var.o1;
        a6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var.d4);
        a6Var.setAlpha(1.0f - e6Var.d4);
        ImageView imageView = e6Var.w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var.d4);
        imageView.setAlpha(1.0f - e6Var.d4);
        ImageView imageView2 = e6Var.x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var.d4);
        imageView2.setAlpha(1.0f - e6Var.d4);
        w5 w5Var = e6Var.y0;
        w5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var.d4);
        w5Var.setAlpha((1.0f - e6Var.d4) * e6Var.e3);
        m4 m4Var = e6Var.W1;
        if (m4Var != null) {
            m4Var.setTranslationY(AndroidUtilities.dp(8.0f) * e6Var.d4);
            e6Var.W1.setAlpha(1.0f - e6Var.d4);
        }
        if (nbVar != null) {
            nbVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var.d4);
            nbVar.setAlpha(1.0f - e6Var.d4);
        }
        e6Var.K0.setAlpha(1.0f - e6Var.d4);
        x5 x5Var = e6Var.Q1;
        float f7 = x5Var == null ? 0.0f : ((ac) x5Var).d.V;
        float hideInterfaceAlpha = e6Var.getHideInterfaceAlpha();
        m4 m4Var2 = e6Var.D0;
        if (m4Var2 != null) {
            m4Var2.setAlpha((1.0f - e6Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = e6Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - e6Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        m4 m4Var3 = e6Var.P0;
        if (m4Var3 != null) {
            m4Var3.setAlpha((1.0f - e6Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        a4 a4Var = e6Var.b2;
        if (a4Var != null) {
            a4Var.setAlpha(1.0f - e6Var.d4);
            e6Var.invalidate();
        }
        e6Var.c1.invalidate();
    }

    public static void a0(e6 e6Var, boolean z10) {
        org.telegram.ui.ActionBar.e1 e1Var = e6Var.D3;
        if (e1Var == null || e6Var.C3 == null || e1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(jc.B1 - 0.2f) < 0.05f) {
                e6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(jc.B1 - 0.5f) < 0.05f) {
                e6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(jc.B1 - 1.0f) < 0.05f) {
                e6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(jc.B1 - 1.5f) < 0.05f) {
                e6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(jc.B1 - 2.0f) < 0.05f) {
                e6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                e6Var.D3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, fd.a(jc.B1) + "x"));
            }
        }
        e6Var.C3.a(jc.B1, z10);
    }

    public static void b0(e6 e6Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (e6Var.I0() || e6Var.O1.f) {
            return;
        }
        if (UserConfig.getInstance(e6Var.C2).isPremium()) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, e6Var.B0).setOnClickListener(new e3(e6Var, 8));
            return;
        }
        Drawable drawable = e6Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        t3 t3Var = new t3(e6Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, e6Var.B0);
        c10.setOnClickListener(new e3(e6Var, 9));
        c10.setIcon(t3Var);
    }

    public static void d0(e6 e6Var) {
        c6 c6Var = e6Var.O1;
        TL_stories.StoryItem storyItem = c6Var.a;
        if ((storyItem == null && c6Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = c6Var.h();
        boolean z10 = c6Var.e;
        if (h == null || !h.exists()) {
            e6Var.a1();
            return;
        }
        MediaController.saveFile(h.toString(), e6Var.getContext(), z10 ? 1 : 0, null, null, new i3(0, e6Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(e6 e6Var, long j3) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(j3));
            str = user.first_name;
            z10 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(e6Var.C2).getChat(Long.valueOf(-j3));
            str = chat2.title;
            z10 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new h3(e6Var, MessagesController.getInstance(e6Var.C2), j3, !z10, str, chat), 200L);
    }

    public static void f0(e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e6Var.getContext(), 0, e6Var.B0);
        alertDialog$Builder.a.R = LocaleController.getString(e6Var.I0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.T = LocaleController.getString(e6Var.I0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y2(e6Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new w1(6));
        ac acVar = (ac) e6Var.Q1;
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        acVar.h(a2Var);
        a2Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f7 = 1.0f - this.O2.c;
        s7 s7Var = this.J0.w;
        return (1.0f - (s7Var == null ? 0.0f : s7Var.f)) * f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        jc jcVar;
        if (!this.O1.f || (jcVar = this.J0) == null || jcVar.A0 == null || D0(true)) {
            return 0L;
        }
        return jcVar.A0.j();
    }

    public static void h0(e6 e6Var) {
        org.telegram.ui.ActionBar.d6 d6Var = e6Var.B0;
        a5 a5Var = e6Var.c1;
        if (e6Var.G1) {
            return;
        }
        int i10 = 0;
        if (!e6Var.E1) {
            a4 a4Var = e6Var.b2;
            int i11 = -e6Var.r1;
            e6Var.r1 = i11;
            AndroidUtilities.shakeViewSpring(a4Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = e6Var.B1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(e6Var.B1))) : "";
            (MessagesController.getInstance(e6Var.C2).premiumFeaturesBlocked() ? new yc(a5Var, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new yc(a5Var, d6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new c3(e6Var, 5))).j();
            return;
        }
        if (e6Var.J3 != null && e6Var.K3 != null) {
            rg.j0.C1(new y3(e6Var, i10), e6Var.J3, e6Var.K3, e6Var.B1, true);
            return;
        }
        jc jcVar = e6Var.J0;
        if (jcVar != null) {
            jcVar.k1 = true;
            jcVar.P();
        }
        MessagesController.getInstance(e6Var.C2).getBoostsController().getBoostsStats(e6Var.B1, new f3(e6Var, i10));
    }

    public static void j0(e6 e6Var) {
        c6 c6Var = e6Var.O1;
        if (c6Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = c6Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(e6Var.C2).getInputPeer(e6Var.B1);
        ConnectionsManager.getInstance(e6Var.C2).sendRequest(tL_stories_exportStoryLink, new k4());
    }

    public final void A0() {
        if (this.b3 != null) {
            return;
        }
        p4 p4Var = new p4(getContext(), 0);
        this.b3 = p4Var;
        p4Var.setTextSize(1, 14.0f);
        this.b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.b3.setGravity(19);
        this.b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.b3, w7.y5.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        m4 m4Var = new m4(this, getContext(), 0);
        this.W1 = m4Var;
        m4Var.setClickable(true);
        addView(this.W1, w7.y5.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        n4 n4Var = new n4(this, getContext());
        this.F2 = n4Var;
        n4Var.setOnClickListener(new e3(this, 0));
        this.W1.addView(this.F2, w7.y5.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        h0 h0Var = new h0(0, getContext(), false);
        this.B2 = h0Var;
        h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.y5.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.y5.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.x1.s);
        n4 n4Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        n4Var2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
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
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        TextView textView2 = new TextView(getContext());
        w7.a6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.h6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, v02, k10, k10));
        textView2.setOnClickListener(new e3(this, 3));
        linearLayout.addView(textView, w7.y5.n(-1, -2));
        linearLayout.addView(textView2, w7.y5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.y5.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.c1.addView(frameLayout);
        this.a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        d2 d2Var;
        TLRPC.Peer i10;
        d2 d2Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        long j3 = this.B1;
        jc jcVar = this.J0;
        if (j3 >= 0 || (d2Var2 = jcVar.A0) == null) {
            if (j3 < 0 || jcVar == null || (d2Var = jcVar.A0) == null || !d2Var.l()) {
                return false;
            }
            return !z10 || (i10 = jcVar.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i11 = d2Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
        if (jcVar.A0.l() || ChatObject.canManageCalls(chat)) {
            return i11 == null || this.B1 == DialogObject.getPeerDialogId(i11) || DialogObject.getPeerDialogId(i11) == UserConfig.getInstance(this.C2).getClientUserId();
        }
        return false;
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        d6 d6Var = this.M2;
        org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) d6Var.e;
        if (l4Var != null && ((SurfaceView) d6Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) d6Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (l4Var != null && (textureView = (TextureView) d6Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        a5 a5Var = this.c1;
        canvas.scale(i10 / a5Var.getMeasuredWidth(), i11 / a5Var.getMeasuredHeight());
        this.e1.draw(canvas);
        canvas.restore();
    }

    public final void F0(ci.da daVar, TL_stories.StoryItem storyItem) {
        x5 x5Var = this.Q1;
        ci.fa faVar = new ci.fa(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.B0);
        faVar.q1(daVar);
        ci.i1 i1Var = faVar.b;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof ci.y9) {
                    ((ci.y9) view).e(false);
                }
            }
        }
        faVar.k1(true);
        faVar.T = new ah.b(1, this, storyItem);
        ((ac) x5Var).h(faVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r3 == r10.f2) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G0(ViewGroup viewGroup, float f7, float f10, boolean z10) {
        ci.e4 e4Var;
        d6 d6Var;
        org.telegram.ui.l4 l4Var;
        if (viewGroup != null) {
            ci.e4 e4Var2 = this.F0;
            if ((e4Var2 == null || !e4Var2.V) && ((e4Var = this.G0) == null || !e4Var.V)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        g5 g5Var = this.K0;
                        if (childAt == g5Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f7, (int) f10)) {
                                float top = f10 - childAt.getTop();
                                wa waVar = g5Var.b0;
                                if (waVar.w == 1.0f && !g5Var.s0) {
                                    if (top > waVar.getTranslationY() + (g5Var.r0.getTop() - g5Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.c1 || (d6Var = this.M2) == null || (l4Var = (org.telegram.ui.l4) d6Var.e) == null || !G0(l4Var, f7 - childAt.getX(), f10 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f7, (int) f10))) {
                            v4 v4Var = this.j1;
                            if (childAt == v4Var && v4Var.b == null && (f7 < AndroidUtilities.dp(60.0f) || f7 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = v4Var.e;
                                float[] fArr = v4Var.f;
                                for (int i11 = 0; i11 < v4Var.getChildCount(); i11++) {
                                    View childAt2 = v4Var.getChildAt(i11);
                                    if (childAt2 != v4Var.d && (childAt2 instanceof pb)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f7;
                                        fArr[1] = f10;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                r3 r3Var = this.L0;
                                if (childAt == r3Var) {
                                    wb1 wb1Var = r3Var.f;
                                    w0 w0Var = r3Var.c;
                                    wb1 wb1Var2 = r3Var.f;
                                    wb1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f7 - r3Var.getX()) - wb1Var2.getX()), (int) ((f10 - r3Var.getY()) - wb1Var2.getY()))) {
                                        if (r3Var.f0) {
                                            continue;
                                        } else if (!this.v2) {
                                            if (f10 <= r3Var.s() + r3Var.getY() && w0Var.E(f7, (f10 - r3Var.getY()) - w0Var.getY()) == null) {
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
                                            a4 a4Var = this.b2;
                                            if (a4Var != null && childAt == a4Var.getRecordCircle()) {
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
        a5 a5Var = this.c1;
        float x11 = view.getX() + a5Var.getX() + x10;
        float y3 = view.getY() + a5Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ((float) view.getHeight());
    }

    public final boolean I0() {
        d9 d9Var;
        jc jcVar = this.J0;
        return (jcVar == null || (d9Var = jcVar.O0) == null || d9Var.e != 4) ? false : true;
    }

    public final boolean J0() {
        TLRPC.User user;
        return I0() && (user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.J0.O0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean K0();

    public final void L0(zg.o0 o0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        c6 c6Var = this.O1;
        TL_stories.StoryItem storyItem = c6Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && o0Var == null) {
            l0();
            this.S1.g0(this.B1, c6Var.a, null);
        } else if (o0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = zg.k0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.q3 = true;
                this.S1.g0(this.B1, c6Var.a, zg.o0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, c6Var.a, o0Var);
        }
        TL_stories.StoryItem storyItem2 = c6Var.a;
        m4 m4Var = this.D0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.E0.setReaction(null);
            m4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.E0.setReaction(zg.o0.d(reaction));
            m4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.D1 && z11) {
            TL_stories.StoryItem storyItem3 = c6Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = c6Var.a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = c6Var.a;
        zg.q0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        d2 d2Var;
        if (this.O3 != null) {
            return;
        }
        jc jcVar = this.J0;
        if (jcVar != null && (d2Var = jcVar.A0) != null) {
            if (d2Var.v == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.C2).getSendAsPeers(this.B1, true);
        this.O3 = sendAsPeers;
        a4 a4Var = this.b2;
        if (a4Var == null || sendAsPeers == null) {
            return;
        }
        a4Var.P1(true);
    }

    public final boolean N0() {
        a4 a4Var = this.b2;
        if (a4Var == null) {
            return false;
        }
        boolean z10 = a4Var.z2;
        if (z10) {
            a4Var.s1();
        }
        AndroidUtilities.runOnUIThread(new c3(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j3;
        f3 f3Var;
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
        f3 f3Var2 = new f3(this, 1);
        d dVar = new d();
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, (org.telegram.ui.ActionBar.d6) dVar, false);
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
            j3 = j11;
            f3Var = f3Var2;
            i10 = ((org.telegram.ui.Components.z5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.z5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j3 = j11;
            f3Var = f3Var2;
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
        final pq[] pqVarArr = new pq[1];
        final ci.d dVar2 = new ci.d(context, null, true);
        final m1 m1Var = new m1();
        m1Var.c = clientUserId;
        m1Var.f = textWithEntities;
        m1Var.g = jArr[0];
        final h1 h1Var = new h1(i12, context, true);
        LinearLayout f7 = ok.f(context, 0);
        final f0 f0Var = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), dVar);
        f7.addView(f0Var, w7.y5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final f0 f0Var2 = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), dVar);
        f7.addView(f0Var2, w7.y5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final f0 f0Var3 = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), dVar);
        f7.addView(f0Var3, w7.y5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final e0 e0Var = new e0(context, dVar, r6);
        final boolean[] zArr = {true};
        f3 f3Var3 = f3Var;
        long j12 = j10;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() { // from class: ai.c0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar2.g(yh.w7.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), pqVarArr), true, true);
                long j13 = jArr2[0];
                m1 m1Var2 = m1Var;
                m1Var2.g = j13;
                h1Var.set(m1Var2);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = g0.b(i16, intValue2, 0);
                int b11 = g0.b(i16, num.intValue(), 1);
                int b12 = g0.b(i16, num.intValue(), 2);
                ((org.telegram.ui.Components.p6) f0Var.b).c(b10 >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.p6) f0Var2.b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.p6) f0Var3.b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = g0.b(i16, num.intValue(), 3);
                int b14 = g0.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                e0Var.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        h1Var.set(m1Var);
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
        if (arrayList.isEmpty() || ((Integer) hg.c.g(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        e0Var.e0 = iArr4;
        e0Var.setValue((int) jArr[0]);
        linearLayout.addView(e0Var, w7.y5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(f7, w7.y5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.h6.j5;
        TextView b10 = w7.c6.b(context, 20.0f, i21, true, dVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.y5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.c6.b(context, 14.0f, i21, false, dVar);
        b11.setGravity(17);
        ok.q(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.y5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(h1Var, w7.y5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar2, w7.y5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        e3Var.show();
        dVar2.setOnClickListener(new d0(f3Var3, jArr, e3Var, 0));
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
        g4 g4Var = this.I2;
        g4Var.Z = this.B1;
        g4Var.r1();
        this.I2.m1().setText(this.b2.getFieldText());
        ((ac) this.Q1).h(this.I2);
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
        this.J0.H(new wn(bundle));
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
        ci.k4 k4Var;
        d2 d2Var;
        boolean z10 = this.K1;
        d6 d6Var = this.M2;
        if (!z10) {
            d6Var.e = null;
            return;
        }
        c6 c6Var = this.O1;
        boolean z11 = c6Var.f;
        a5 a5Var = this.c1;
        if (!z11) {
            if (!c6Var.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j3 + "): null, not a video");
                ((ac) this.Q1).c(null, null, 0L, this.M2);
                d6Var.e = null;
                d6Var.a = false;
                return;
            }
            if (c6Var.f() == null || !new File(c6Var.f()).exists()) {
                TL_stories.StoryItem storyItem = c6Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.B1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = c6Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.C2).getFileReference(c6Var.a);
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
                            sb2.append(c6Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(c6Var.a.id);
                            sb2.append("&did=");
                            sb2.append(c6Var.a.dialogId);
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
                            ((ac) this.Q1).c(document, uri, j3, this.M2);
                            a5Var.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(c6Var.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j3 + "): playing from attachPath " + fromFile);
                this.R2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j3 + "): playing from null?");
            }
            ((ac) this.Q1).c(document, uri, j3, this.M2);
            a5Var.invalidate();
            return;
        }
        x5 x5Var = this.Q1;
        TL_stories.StoryItem storyItem3 = c6Var.a;
        long j11 = this.B1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        ac acVar = (ac) x5Var;
        acVar.i(true, true);
        jc jcVar = acVar.d;
        d2 d2Var2 = jcVar.A0;
        if (d2Var2 == null || d2Var2.b != j11 || !d2Var2.f(inputGroupCall)) {
            ci.k4 k4Var2 = jcVar.D0;
            if (k4Var2 != null) {
                k4Var2.d(j11, null);
                ci.k4 k4Var3 = jcVar.D0;
                SurfaceViewRenderer surfaceViewRenderer = k4Var3.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = k4Var3.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                k4Var3.r = false;
                k4Var3.e(false, false);
            }
            m2 m2Var = m2.Z;
            if (m2Var.S && (d2Var = m2Var.v) != null && d2Var.f(inputGroupCall)) {
                d2 d2Var3 = m2Var.v;
                m2Var.v = null;
                jcVar.A0 = d2Var3;
                m2Var.k(false);
            } else {
                d2 d2Var4 = jcVar.A0;
                if (d2Var4 != null) {
                    if (!d2Var4.n && (!m2Var.S || m2Var.v != d2Var4)) {
                        d2Var4.e();
                    } else if (d2Var4.O != jcVar.D0.getSink()) {
                        jcVar.A0.s(null);
                    }
                    jcVar.A0 = null;
                }
            }
            if (m2Var.S) {
                m2.j();
            }
            ic icVar = jcVar.z0;
            if (icVar != null) {
                icVar.release(null);
                jcVar.z0 = null;
            }
            d6 d6Var2 = jcVar.G0;
            if (d6Var2 != null) {
                d6Var2.c = null;
                d6Var2.b = null;
                d6Var2.a = false;
                d6Var2.e = null;
                d6Var2.f = null;
                d6Var2.d = null;
                d6Var2.b();
                jcVar.G0 = null;
            }
            if (jcVar.A0 == null) {
                d2 d2Var5 = d2.W;
                if (d2Var5 == null || !d2Var5.f(inputGroupCall)) {
                    d2 d2Var6 = new d2(acVar.c, jcVar.h, storyItem3, j11, i10, z12, inputGroupCall, false, false);
                    j10 = j11;
                    jcVar.A0 = d2Var6;
                    k4Var = jcVar.E0;
                    if (k4Var == null) {
                        jcVar.A0.s(k4Var.getSink());
                    } else {
                        jcVar.A0.s(jcVar.D0.getSink());
                    }
                    jcVar.G0 = d6Var;
                    d6Var.a = false;
                    d6Var.e = jcVar.y0;
                    ci.k4 k4Var4 = jcVar.D0;
                    d6Var.f = k4Var4.d;
                    d6Var.d = k4Var4.c;
                    d6Var.b = jcVar.A0;
                    k4Var4.d(j10, d6Var);
                    jcVar.G0.b();
                } else {
                    jcVar.A0 = d2.W;
                }
            }
            j10 = j11;
            k4Var = jcVar.E0;
            if (k4Var == null) {
            }
            jcVar.G0 = d6Var;
            d6Var.a = false;
            d6Var.e = jcVar.y0;
            ci.k4 k4Var42 = jcVar.D0;
            d6Var.f = k4Var42.d;
            d6Var.d = k4Var42.c;
            d6Var.b = jcVar.A0;
            k4Var42.d(j10, d6Var);
            jcVar.G0.b();
        }
        a5Var.invalidate();
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
            } catch (Exception e) {
                FileLog.e(e);
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
            lj0 lj0Var = this.z0;
            if (z10) {
                if (this.J0.a && Build.VERSION.SDK_INT < 33) {
                    jc jcVar = ((ac) this.Q1).d;
                    jcVar.l1 = true;
                    jcVar.P();
                    q4 q4Var = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(q4Var);
                    AndroidUtilities.runOnUIThread(q4Var, 100L);
                }
                R0(j3);
                g1();
                lj0Var.setAnimation(this.x1.u);
                this.K1 = true;
                this.o1.a.getImageReceiver().setVisible(true, true);
                c6 c6Var = this.O1;
                if (c6Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + c6Var.a.id + " " + c6.c(c6Var));
                }
            } else {
                p0();
                lj0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.c1.invalidate();
                invalidate();
                q0();
                jc jcVar2 = ((ac) this.Q1).d;
                jcVar2.I0 = false;
                jcVar2.P();
            }
            this.e1.setFileLoadingPriority(this.K1 ? 3 : 2);
            this.f1.setFileLoadingPriority(this.K1 ? 2 : 0);
            this.g1.setFileLoadingPriority(this.K1 ? 2 : 0);
            if (this.C1 || this.D1) {
                l9 l9Var = this.S1;
                long j10 = this.B1;
                boolean z11 = this.K1;
                a0.i iVar = l9Var.m;
                sc scVar = (sc) iVar.f(j10);
                if (scVar == null) {
                    scVar = new sc(l9Var.a, j10, l9Var);
                    iVar.k(scVar, j10);
                }
                scVar.b(z11);
            }
        }
    }

    public final void U0(int i10, long j3) {
        if (this.B1 != j3) {
            c6 c6Var = this.O1;
            c6Var.b = null;
            c6Var.a = null;
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
        l9 l9Var = this.S1;
        TL_stories.PeerStories y3 = l9Var.y(j3);
        if (y3 == null) {
            y3 = l9Var.z(j3);
        } else {
            z10 = false;
        }
        l9Var.S(y3, z10);
    }

    public final void W0(long j3, boolean z10, boolean z11) {
        if (!z10 && j3 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j3;
        this.N3 = z11;
        a6 a6Var = this.o1;
        if (j3 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j3));
            z5 z5Var = a6Var.b;
            z5 z5Var2 = a6Var.b;
            z5Var.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                z5Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            qq qqVar = new qq(mutate, null);
            qqVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            qqVar.h = dp;
            qqVar.n = dp2;
            z5Var2.i(qqVar);
            return;
        }
        if (this.C1 && !z11) {
            a6Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            a6Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j3));
        if (user == null || !user.verified) {
            a6Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            qq qqVar2 = new qq(mutate2, null);
            qqVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            qqVar2.h = dp3;
            qqVar2.n = dp4;
            a6Var.b.i(qqVar2);
        }
        if (user != null) {
            a6Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), a6Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            a6Var.b.l(null, false);
        }
    }

    public final void X0(float f7, float f10, l6 l6Var) {
        this.m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 == l6Var) {
            return;
        }
        this.l1 = l6Var;
        if (l6Var != null) {
            ImageReceiver imageReceiver = l6Var.a;
            if (imageReceiver.getBitmap() != null) {
                this.e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void Y0(boolean z10) {
        c6 c6Var = this.O1;
        if (c6Var.a != null) {
            jc jcVar = this.J0;
            if (jcVar.f != null) {
                String e = c6Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e);
                    LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                j4 j4Var = new j4(this, jcVar.f.getContext(), e, e, MessagesController.getInstance(this.C2).storiesEnabled() && (!(this.D1 || UserObject.isService(this.B1)) || ChatObject.isPublic(this.D1 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null)), new x3(2, this.B0));
                this.Z2 = j4Var;
                j4Var.i0 = true;
                TL_stories.StoryItem storyItem = c6Var.a;
                storyItem.dialogId = this.B1;
                j4Var.F0 = storyItem;
                j4Var.s0 = new xa.c(this, 2);
                ((ac) this.Q1).h(j4Var);
            }
        }
    }

    public final void Z0() {
        a5 a5Var = this.c1;
        org.telegram.ui.ActionBar.d6 d6Var = this.B0;
        ok.p(R.string.UnsupportedAttachment, new yc(a5Var, d6Var), d6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.T = string;
        ((ac) this.Q1).h(a2Var);
    }

    public final void b1(boolean z10) {
        if (this.s3 != z10) {
            c6 c6Var = this.O1;
            if (c6Var.a == null) {
                return;
            }
            this.s3 = z10;
            int i10 = 0;
            if (z10) {
                this.r3.setVisibility(0);
            }
            this.r3.setStoryItem(c6Var.a);
            jc jcVar = ((ac) this.Q1).d;
            jcVar.p1 = z10;
            jcVar.P();
            if (!z10) {
                if (this.r3.getReactionsWindow() != null) {
                    this.r3.getReactionsWindow().e();
                }
                this.r3.animate().alpha(0.0f).setDuration(150L).setListener(new v3(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t3, z10 ? 1.0f : 0.0f);
            this.r3.setTransitionProgress(this.t3);
            ofFloat.addUpdateListener(new d3(this, 1));
            ofFloat.addListener(new u3(this, z10, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(rr.g);
            ofFloat.start();
        }
    }

    public final void c1(boolean z10) {
        if (this.G0 == null) {
            ci.e4 e4Var = new ci.e4(getContext(), 1);
            e4Var.l(1.0f, -56.0f);
            this.G0 = e4Var;
            e4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.c1.addView(this.G0, w7.y5.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
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
        d2 d2Var;
        int i12 = NotificationCenter.storiesUpdated;
        jc jcVar = this.J0;
        boolean z10 = false;
        if (i10 == i12 || (i10 == NotificationCenter.storiesListUpdated && jcVar.O0 == objArr[0])) {
            x5 x5Var = this.Q1;
            if (x5Var == null || !((ac) x5Var).d.H0) {
                if (this.K1) {
                    j1();
                    if (this.A1 == 0) {
                        if (this.E2) {
                            return;
                        }
                        this.E2 = true;
                        ((ac) this.Q1).j();
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
                TL_stories.PeerStories peerStories = jcVar.Q0;
                if (peerStories != null) {
                    this.S1.S(peerStories, true);
                } else {
                    long j3 = this.B1;
                    if (j3 != 0) {
                        l9 l9Var = this.S1;
                        TL_stories.PeerStories y3 = l9Var.y(j3);
                        if (y3 == null) {
                            y3 = l9Var.z(j3);
                            z10 = true;
                        }
                        l9Var.S(y3, z10);
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
            f9 o9 = MessagesController.getInstance(this.C2).getStoriesController().o();
            if (o9 == null || !o9.a(this.C2, 1) || this.Q1 == null) {
                return;
            }
            y3 y3Var = new y3(this, 0);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            ((ac) this.Q1).h(new rg.j0(o9.b(), this.C2, findActivity, y3Var, null));
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
        if (jcVar == null || (d2Var = jcVar.A0) == null || d2Var.g() != longValue) {
            return;
        }
        f1(false);
        a4 a4Var = this.b2;
        if (a4Var != null) {
            a4Var.K(true);
            this.b2.P1(true);
            r0(true);
        }
        r3 r3Var = this.L0;
        if (r3Var != null) {
            d2 d2Var2 = r3Var.P;
            if (r3Var.H != (d2Var2 != null ? d2Var2.j() : 0L)) {
                r3Var.e.N(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        le leVar;
        Canvas canvas2;
        org.telegram.ui.Components.o6 o6Var;
        org.telegram.ui.Components.o6 o6Var2;
        l1();
        if (this.D1 && (o6Var2 = this.Q0) != null) {
            o6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (o6Var = this.R0) != null) {
            o6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.u3;
        LinearLayout linearLayout = this.O0;
        m4 m4Var = this.D0;
        if (z10) {
            float measuredWidth = (m4Var.getMeasuredWidth() / 2.0f) + m4Var.getX() + linearLayout.getX();
            float measuredHeight = (m4Var.getMeasuredHeight() / 2.0f) + m4Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.w3, measuredWidth - f7, rr.g.getInterpolation(this.v3));
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
            float measuredWidth2 = (m4Var.getMeasuredWidth() / 2.0f) + m4Var.getX() + linearLayout.getX();
            float measuredHeight2 = (m4Var.getMeasuredHeight() / 2.0f) + m4Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (this.p3) {
                zg.d dVar = this.m3;
                if (dVar != null) {
                    float f12 = dp2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f12), (int) (measuredHeight2 - f12), (int) (measuredWidth2 + f12), (int) (measuredHeight2 + f12));
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
        a4 a4Var = this.b2;
        if (a4Var != null) {
            ne neVar = a4Var.y1;
            le leVar2 = a4Var.z1;
            if (a4Var.getAlpha() == 0.0f || (leVar = a4Var.e1) == null || leVar.getParent() == null || a4Var.e1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(a4Var.e1.getX() + neVar.getX() + leVar2.getX() + a4Var.getX(), a4Var.e1.getY() + neVar.getY() + leVar2.getY() + a4Var.getY());
            if (a4Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, a4Var.getMeasuredWidth(), a4Var.getMeasuredHeight(), (int) (a4Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            a4Var.e1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        fh.d dVar;
        float dp;
        if (view == this.d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.d3.getY(), getMeasuredWidth(), this.d3.getY() + this.d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        a4 a4Var = this.b2;
        Paint paint = this.n2;
        m4 m4Var = this.D0;
        b6 b6Var = this.x1;
        if (view == a4Var) {
            float f7 = this.q2;
            c6 c6Var = this.O1;
            if (f7 > 0.0f && !c6Var.f) {
                b6Var.l.setAlpha((int) (f7 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), b6Var.l);
            }
            RectF rectF = b6Var.h;
            RectF rectF2 = b6Var.i;
            RectF rectF3 = b6Var.j;
            rectF.set(this.b2.getX(), this.b2.getY() + this.b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.b2.getX() + this.b2.getMeasuredWidth(), this.b2.getY() + this.b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (c6Var.f) {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                r2 r2Var = this.a2;
                if (r2Var != null && r2Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (m4Var != null && m4Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + m4Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.b2.setTranslationX((1.0f - this.q2) * dp);
            this.b2.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.z(1.0f, this.q2, -AndroidUtilities.dp(2.0f), this.b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.q2) * (this.b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, b6Var.h, this.q2, rectF3);
            ch.d dVar2 = this.l2;
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
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (a4Var != null && a4Var.u0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = b6Var.k;
                RectF rectF5 = b6Var.k;
                rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.a4;
                path.rewind();
                path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                ch.d dVar3 = this.m2;
                if (dVar3 != null) {
                    dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    dVar3.r(dp4, dp4, dp4, dp4);
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
                    view.setTranslationY((this.O0.getY() + (m4Var.getY() + (-(r2.getMeasuredHeight() - this.r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    a5 a5Var = this.c1;
                    if (view == a5Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(a5Var.getX(), a5Var.getY());
                        view.draw(a2);
                        dVar.c();
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
            j4 j4Var = this.Z2;
            if (j4Var != null) {
                j4Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new c3(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0948, code lost:
    
        if (r15.g == (r2 == null && r2.translated && r2.translatedText != null && android.text.TextUtils.equals(r2.translatedLng, org.telegram.ui.Components.i41.A()))) goto L419;
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
    /* JADX WARN: Type inference failed for: r6v73, types: [ai.sa, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z10) {
        k9 k9Var;
        TL_stories.StoryItem storyItem;
        k9 k9Var2;
        boolean z11;
        boolean z12;
        int i10;
        cz czVar;
        TL_stories.StoryItem storyItem2;
        l4 l4Var;
        boolean z13;
        gc gcVar;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        jc jcVar;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem4;
        boolean z14;
        boolean z15;
        TL_stories.StoryItem storyItem5;
        jc jcVar2;
        k9 k9Var3;
        TLRPC.MessageMedia messageMedia;
        ci.l8 l8Var;
        TL_stories.StoryItem storyItem6;
        k9 k9Var4;
        int i11;
        ci.l8 l8Var2;
        boolean z16;
        a5 a5Var;
        g5 g5Var;
        a6 a6Var;
        a4 a4Var;
        boolean z17;
        k9 k9Var5;
        org.telegram.ui.Components.qc qcVar;
        boolean z18;
        TL_stories.StoryItem storyItem7;
        l4 l4Var2;
        boolean z19;
        k9 k9Var6;
        c6 c6Var;
        boolean z20;
        boolean z21;
        a5 a5Var2;
        g5 g5Var2;
        boolean z22;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        CharSequence charSequence2;
        TLRPC.MessageMedia messageMedia2;
        boolean z23;
        ci.e4 e4Var;
        ci.e4 e4Var2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence4;
        TL_stories.StoryItem storyItem10;
        x5 x5Var;
        boolean z24;
        boolean z25;
        LinearLayout linearLayout;
        boolean z26;
        boolean z27;
        a4 a4Var2;
        a4 a4Var3;
        int i13;
        boolean z28;
        boolean z29;
        boolean z30;
        int i14;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        jh.h hVar;
        c cVar;
        r2 r2Var;
        boolean z35;
        TL_stories.StoryItem storyItem11;
        boolean z36;
        int i15;
        int i16;
        boolean z37;
        boolean z38;
        boolean l4;
        k9 k9Var7;
        k9 k9Var8;
        ci.e4 e4Var3;
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
        d2 d2Var;
        int i25;
        boolean z47;
        int i26;
        boolean z48;
        int i27;
        boolean z49;
        boolean z50;
        boolean z51;
        boolean z52;
        d2 d2Var2;
        String str;
        BitmapDrawable bitmapDrawable;
        l4 l4Var3;
        boolean z53;
        jc jcVar3;
        cz czVar2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        d9 d9Var;
        ArrayList arrayList2 = this.v1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.w1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.V2 = true;
        c6 c6Var2 = this.O1;
        TL_stories.StoryItem storyItem14 = c6Var2.a;
        k9 k9Var9 = c6Var2.b;
        String s10 = ia.s();
        this.Z0 = false;
        this.c3 = false;
        int i28 = this.J1;
        boolean z54 = this.T1;
        boolean z55 = this.U1;
        boolean z56 = this.V1;
        jc jcVar4 = this.J0;
        if (jcVar4 == null || (d9Var = jcVar4.O0) == null || d9Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i28 < 0 || i28 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i28);
            int size = i28 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            k9Var = (size < 0 || size >= arrayList3.size()) ? null : (k9) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            k9Var = (i28 < 0 || i28 >= arrayList3.size()) ? null : (k9) arrayList3.get(i28);
            int size2 = i28 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        c6Var2.c = null;
        v4 v4Var = this.j1;
        int i29 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        cz czVar3 = this.k1;
        l4 l4Var4 = this.e1;
        if (k9Var != null) {
            ci.l8 l8Var3 = k9Var.c;
            this.U1 = false;
            boolean z57 = k9Var.I;
            this.V1 = z57;
            this.T1 = !z57;
            l4Var4.setCrossfadeWithOldImage(false);
            l4Var4.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = l8Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (k9Var.s || k9Var.H) {
                k9Var2 = k9Var9;
                l4Var3 = l4Var4;
                z11 = z54;
                z53 = z55;
                z12 = z56;
                jcVar3 = jcVar4;
                i10 = i28;
                czVar2 = czVar3;
                r62 = 0;
                this.e1.setImage(null, null, ImageLocation.getForPath(k9Var.f), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                k9Var2 = k9Var9;
                czVar2 = czVar3;
                r62 = 0;
                l4Var3 = l4Var4;
                z11 = z54;
                z12 = z56;
                z53 = z55;
                jcVar3 = jcVar4;
                i10 = i28;
                this.e1.setImage(null, null, ImageLocation.getForPath(k9Var.e), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            c6Var2.b = k9Var;
            c6Var2.j = r62;
            c6Var2.i = r62;
            c6Var2.a = r62;
            c6Var2.d = false;
            c6Var2.e = c6Var2.m();
            TL_stories.StoryItem storyItem17 = c6Var2.a;
            c6Var2.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            czVar = czVar2;
            v4Var.c(r62, mb.a(l8Var3), czVar);
            this.U2 = false;
            this.T2 = false;
            this.S2 = false;
            storyItem2 = storyItem14;
            z13 = z53;
            l4Var = l4Var3;
            jcVar = jcVar3;
        } else {
            k9Var2 = k9Var9;
            z11 = z54;
            z12 = z56;
            i10 = i28;
            czVar = czVar3;
            this.T1 = false;
            this.U1 = false;
            this.V1 = false;
            if (storyItem == null) {
                if (jcVar4 != null) {
                    jcVar4.q(true);
                    return;
                }
                return;
            }
            k9 t10 = this.S1.t(this.B1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.U1 = true;
                l4Var4.setCrossfadeWithOldImage(false);
                if (this.i1 != null) {
                    i29 = 0;
                }
                l4Var4.setCrossfadeDuration(i29);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    k9Var3 = t10;
                    l4Var = l4Var4;
                    jcVar2 = jcVar4;
                    this.e1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    jcVar2 = jcVar4;
                    l4Var = l4Var4;
                    k9Var3 = t10;
                    this.e1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                }
                c6Var2.b = k9Var3;
                c6Var2.j = null;
                c6Var2.i = null;
                c6Var2.a = null;
                c6Var2.d = false;
                c6Var2.e = c6Var2.m();
                TL_stories.StoryItem storyItem18 = c6Var2.a;
                c6Var2.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                v4Var.c(null, mb.a(k9Var3.c), czVar);
                c6Var2.c = storyItem;
                this.U2 = false;
                this.T2 = false;
                this.S2 = false;
                z13 = z55;
                jcVar = jcVar2;
            } else {
                storyItem2 = storyItem14;
                l4Var = l4Var4;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.B1;
                z13 = z55;
                l4Var.setCrossfadeWithOldImage(z13);
                l4Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
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
                            this.e1.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), v7.j.t(s10, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
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
                        Drawable drawable = ((jcVar4.O0 != null || jcVar4.N0) && (gcVar = jcVar4.s0) != null && (imageReceiver = gcVar.c) != null && gcVar.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.B1;
                        if (z58) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String t11 = v7.j.t(s10, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            storyItem4 = storyItem;
                            jcVar = jcVar4;
                            this.e1.setImage(null, null, forDocument, t11, forDocument2, s10, drawable, 0L, null, storyItem4, 0);
                        } else {
                            storyItem3 = storyItem;
                            jcVar = jcVar4;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                l4Var.clearImage();
                                storyItem3.dialogId = this.B1;
                                v4Var.d(z10 ? null : storyItem3, czVar);
                                c6Var2.n(storyItem3);
                                z14 = (!this.c3 || (storyItem5 = c6Var2.a) == null || (storyItem5 instanceof TL_stories.TL_storyItemDeleted) || (storyItem5 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                                this.U2 = z14;
                                this.S2 = z14;
                                if (z14) {
                                    this.S2 = c6Var2.d() && c6Var2.a.isPublic;
                                }
                                if (this.S2) {
                                    TL_stories.StoryItem storyItem19 = c6Var2.a;
                                    this.S2 = storyItem19.pinned || !ia.w(this.C2, storyItem19);
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
                                        this.U2 = (user == null || UserObject.getPublicUsername(user) == null || !c6Var2.a.isPublic) ? false : true;
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
                        v4Var.d(z10 ? null : storyItem3, czVar);
                        c6Var2.n(storyItem3);
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
                jcVar = jcVar4;
                storyItem3.dialogId = this.B1;
                v4Var.d(z10 ? null : storyItem3, czVar);
                c6Var2.n(storyItem3);
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
        TL_stories.StoryItem storyItem20 = c6Var2.a;
        if (storyItem20 != null && !z10) {
            jcVar.P0 = storyItem20.id;
        }
        jcVar.n0.A();
        this.Y2 = true;
        if (this.C1 || this.D1) {
            k1(false);
        }
        TL_stories.StoryItem storyItem21 = c6Var2.a;
        k9 k9Var10 = c6Var2.b;
        int i30 = storyItem21 != null ? storyItem21.id : (k9Var10 == null || (l8Var = k9Var10.c) == null) ? 0 : l8Var.f;
        if (storyItem2 != null) {
            storyItem6 = storyItem2;
            i11 = storyItem6.id;
            k9Var4 = k9Var2;
        } else {
            storyItem6 = storyItem2;
            k9Var4 = k9Var2;
            i11 = (k9Var2 == null || (l8Var2 = k9Var4.c) == null) ? 0 : l8Var2.f;
        }
        boolean z59 = i30 == i11 || !(k9Var4 == null || storyItem21 == null || !TextUtils.equals(k9Var4.e, storyItem21.attachPath));
        boolean z60 = z59 && !(this.U1 == z13 && this.T1 == z11 && this.V1 == z12);
        d2 d2Var3 = jcVar.A0;
        if (d2Var3 != null) {
            int i31 = this.Q3;
            TLRPC.GroupCall groupCall = d2Var3.v;
            if (i31 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                z16 = true;
                a5Var = this.c1;
                g5Var = this.K0;
                a6Var = this.o1;
                if ((k9Var4 != null || (str = k9Var4.e) == null || !str.equals(c6Var2.f())) && (storyItem6 == null || (storyItem7 = c6Var2.a) == null || storyItem6.id != storyItem7.id)) {
                    a4Var = this.b2;
                    if (a4Var != null) {
                        if (storyItem6 != null && !TextUtils.isEmpty(a4Var.getEditField().getText())) {
                            jc.J(storyItem6.dialogId, storyItem6, this.b2.getEditField().getText());
                        }
                        this.b2.getEditField().setText(jc.u(this.B1, c6Var2.a));
                        z18 = c6Var2.f;
                        if (z18) {
                            this.b2.U0(false, false);
                        } else {
                            this.b2.U0(true, true);
                        }
                    }
                    z17 = c6Var2.f;
                    if (z17) {
                        M0();
                    }
                    czVar.c();
                    this.W0 = 0L;
                    this.Y0 = false;
                    k9Var5 = c6Var2.b;
                    if (k9Var5 == null) {
                        mj0 mj0Var = a6Var.d;
                        if (mj0Var != null) {
                            mj0Var.e(k9Var5.h, false);
                        }
                        a6Var.a.invalidate();
                    } else if (!z60) {
                        a6Var.h = 0.0f;
                    }
                    qcVar = org.telegram.ui.Components.qc.w;
                    if (qcVar != null && qcVar.h == a5Var) {
                        qcVar.b();
                    }
                    g5Var.J();
                    q0();
                    z16 = true;
                }
                if (!z16 || (k9Var4 != null && c6Var2.b == null)) {
                    a6Var.setOnSubtitleClick(null);
                    TextView[] textViewArr = a6Var.c;
                    this.Q3 = 0;
                    boolean z61 = z60;
                    long j3 = this.B1;
                    l4Var2 = l4Var;
                    z19 = c6Var2.f;
                    W0(j3, false, z19);
                    k9Var6 = c6Var2.b;
                    if (k9Var6 == null) {
                        c6Var = c6Var2;
                        charSequence2 = k9Var6.I ? LocaleController.getString(R.string.FailedToUploadStory) : ia.u(textViewArr[0], this.U1);
                    } else if (I0()) {
                        TL_stories.StoryItem storyItem22 = c6Var2.a;
                        if (storyItem22 == null || (messageMedia2 = storyItem22.media) == null) {
                            c6Var = c6Var2;
                        } else {
                            if (messageMedia2.document != null) {
                                c6Var = c6Var2;
                                charSequence2 = LocaleController.formatStoryDate(r13.date);
                            } else {
                                c6Var = c6Var2;
                                if (messageMedia2.photo != null) {
                                    charSequence2 = LocaleController.formatStoryDate(r2.date);
                                }
                            }
                        }
                        charSequence2 = "";
                    } else {
                        c6Var = c6Var2;
                        TL_stories.StoryItem storyItem23 = c6Var.a;
                        if (storyItem23 == null) {
                            z20 = z16;
                            z21 = z59;
                            a5Var2 = a5Var;
                            g5Var2 = g5Var;
                            z22 = z61;
                            charSequence = null;
                        } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                            spannableStringBuilder2.setSpan(new o4(), 0, spannableStringBuilder2.length(), 33);
                            spannableStringBuilder2.append((CharSequence) "  ");
                            d2 d2Var4 = jcVar.A0;
                            if (d2Var4 != null) {
                                TLRPC.GroupCall groupCall2 = d2Var4.v;
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
                            if (c6Var.i() != null) {
                                sa i32 = c6Var.i();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                z20 = z16;
                                z21 = z59;
                                SpannableString spannableString = new SpannableString("r");
                                a5Var2 = a5Var;
                                g5Var2 = g5Var;
                                spannableString.setSpan(new pq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                spannableStringBuilder3.append((CharSequence) spannableString).append((CharSequence) " ");
                                if (i32.b != null) {
                                    org.telegram.ui.g5 g5Var3 = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.C2);
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(g5Var3, 0, 1, 33);
                                    spannableStringBuilder3.append((CharSequence) spannableString2).append((CharSequence) " ");
                                    if (i32.b.longValue() > 0) {
                                        TLRPC.User user2 = MessagesController.getInstance(this.C2).getUser(i32.b);
                                        g5Var3.e(user2);
                                        spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user2));
                                    } else {
                                        TLRPC.Chat chat4 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-i32.b.longValue()));
                                        g5Var3.b(chat4);
                                        if (chat4 != null) {
                                            spannableStringBuilder3.append((CharSequence) chat4.title);
                                        }
                                    }
                                } else {
                                    String str4 = c6Var.a.fwd_from.from_name;
                                    if (str4 != null) {
                                        spannableStringBuilder3.append((CharSequence) str4);
                                    }
                                }
                                a6Var.setOnSubtitleClick(new f2(1, this, i32));
                                SpannableString spannableString3 = new SpannableString(".");
                                ct ctVar = new ct();
                                ctVar.b = AndroidUtilities.dp(1.5f);
                                ctVar.c = 5.0f;
                                spannableString3.setSpan(ctVar, 0, spannableString3.length(), 33);
                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(c6Var.a.date));
                                spannableStringBuilder = spannableStringBuilder3;
                            } else {
                                z20 = z16;
                                z21 = z59;
                                a5Var2 = a5Var;
                                g5Var2 = g5Var;
                                if (!this.E1 || (storyItem8 = c6Var.a) == null || storyItem8.from_id == null) {
                                    String formatStoryDate = LocaleController.formatStoryDate(c6Var.a.date);
                                    charSequence4 = formatStoryDate;
                                    if (c6Var.a.edited) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                        ct ctVar2 = new ct();
                                        ctVar2.b = AndroidUtilities.dp(1.5f);
                                        ctVar2.c = 5.0f;
                                        valueOf.append((CharSequence) " . ").setSpan(ctVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                        valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                        charSequence4 = valueOf;
                                    }
                                    z22 = z61;
                                    charSequence = charSequence4;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                    org.telegram.ui.g5 g5Var4 = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.C2);
                                    SpannableString spannableString4 = new SpannableString("a");
                                    spannableString4.setSpan(g5Var4, 0, 1, 33);
                                    spannableStringBuilder4.append((CharSequence) spannableString4).append((CharSequence) " ");
                                    long peerDialogId = DialogObject.getPeerDialogId(c6Var.a.from_id);
                                    if (peerDialogId > 0) {
                                        TLRPC.User user3 = MessagesController.getInstance(this.C2).getUser(Long.valueOf(peerDialogId));
                                        g5Var4.e(user3);
                                        spannableStringBuilder4.append((CharSequence) UserObject.getUserName(user3));
                                    } else {
                                        TLRPC.Chat chat5 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-peerDialogId));
                                        g5Var4.b(chat5);
                                        if (chat5 != null) {
                                            spannableStringBuilder4.append((CharSequence) chat5.title);
                                        }
                                    }
                                    a6Var.setOnSubtitleClick(new a3(this, peerDialogId, 0));
                                    SpannableString spannableString5 = new SpannableString(".");
                                    ct ctVar3 = new ct();
                                    ctVar3.b = AndroidUtilities.dp(1.5f);
                                    ctVar3.c = 5.0f;
                                    spannableString5.setSpan(ctVar3, 0, spannableString5.length(), 33);
                                    spannableStringBuilder4.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(c6Var.a.date));
                                    spannableStringBuilder = spannableStringBuilder4;
                                }
                            }
                            z22 = false;
                            charSequence = spannableStringBuilder;
                        }
                        if (charSequence != null) {
                            d9 d9Var2 = jcVar.O0;
                            if (d9Var2 == null || (storyItem9 = c6Var.a) == null || !d9Var2.m(storyItem9.id)) {
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
                                spannableString6.setSpan(new pq(R.drawable.msg_pin_mini), 0, 1, 33);
                                ((SpannableStringBuilder) charSequence5).insert(0, (CharSequence) spannableString6);
                                charSequence3 = charSequence5;
                            }
                            a6Var.c(charSequence3, z22);
                        } else {
                            z23 = false;
                        }
                        e4Var = this.F0;
                        if (e4Var != null) {
                            e4Var.e(z23);
                        }
                        e4Var2 = this.G0;
                        if (e4Var2 != null) {
                            e4Var2.e(z23);
                        }
                    }
                    z20 = z16;
                    z21 = z59;
                    a5Var2 = a5Var;
                    g5Var2 = g5Var;
                    charSequence4 = charSequence2;
                    z22 = z61;
                    charSequence = charSequence4;
                    if (charSequence != null) {
                    }
                    e4Var = this.F0;
                    if (e4Var != null) {
                    }
                    e4Var2 = this.G0;
                    if (e4Var2 != null) {
                    }
                } else {
                    c6Var = c6Var2;
                    l4Var2 = l4Var;
                    z20 = z16;
                    z21 = z59;
                    a5Var2 = a5Var;
                    g5Var2 = g5Var;
                }
                storyItem10 = c6Var.a;
                if (storyItem6 == storyItem10 && k9Var4 == c6Var.b) {
                }
                c6Var.o();
                if ((!c6Var.g || storyItem6 != c6Var.a) && (x5Var = this.Q1) != null) {
                    jc jcVar5 = ((ac) x5Var).d;
                    jcVar5.Z0 = false;
                    jcVar5.P();
                }
                z24 = c6Var.f;
                z25 = !z24 && (d2Var2 = jcVar.A0) != null && c6Var.k(d2Var2.g()) && jcVar.A0.b();
                if (z25 != this.G1) {
                    this.G1 = z25;
                    if (z25) {
                        z0();
                    }
                    if (this.g2 != null && (this.F1 || this.G1)) {
                        h1();
                    }
                    a4 a4Var4 = this.b2;
                    if (a4Var4 != null) {
                        if (this.F1) {
                            z52 = c6Var.f;
                        }
                        if (!this.G1) {
                            z51 = true;
                            a4Var4.setEnabled(z51);
                            z50 = true;
                            this.b2.P1(true);
                        }
                        z51 = false;
                        a4Var4.setEnabled(z51);
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
                        z49 = c6Var.f;
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
                    z27 = c6Var.f;
                    if (z27) {
                        if (this.b2 == null) {
                            v0();
                        }
                        u0();
                        y0();
                        x0();
                        this.b2.setVisibility(0);
                    } else if ((UserObject.isService(this.B1) || I0()) && (a4Var2 = this.b2) != null) {
                        a4Var2.setVisibility(8);
                    } else if (!this.C1 && ((!this.D1 || (this.E1 && (ChatObject.canSendPlain(chat6) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat6)))) && (a4Var3 = this.b2) != null)) {
                        a4Var3.setVisibility(0);
                    }
                    a4 a4Var5 = this.b2;
                    if (a4Var5 != null) {
                        z32 = c6Var.f;
                        a4Var5.setOnSendButtonLongClick(z32 ? new b3(this, 0) : null);
                        a4 a4Var6 = this.b2;
                        z33 = c6Var.f;
                        D0(true);
                        a4Var6.i1(z33);
                        a4 a4Var7 = this.b2;
                        z34 = c6Var.f;
                        a4Var7.o1(z34 && !D0(true) && (this.v2 || this.b2.W0), true);
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
                            z31 = c6Var.f;
                        }
                        if (!this.G1) {
                            i14 = 8;
                            linearLayout3.setVisibility(i14);
                        }
                        i14 = 0;
                        linearLayout3.setVisibility(i14);
                    }
                    a4 a4Var8 = this.b2;
                    if (a4Var8 != null) {
                        if (this.F1) {
                            z30 = c6Var.f;
                        }
                        if (!this.G1) {
                            z29 = true;
                            a4Var8.setEnabled(z29);
                        }
                        z29 = false;
                        a4Var8.setEnabled(z29);
                    }
                    m4 m4Var = this.W1;
                    if (m4Var != null) {
                        if (this.C1) {
                            z28 = c6Var.f;
                            if (!z28) {
                                i13 = 0;
                                m4Var.setVisibility(i13);
                            }
                        }
                        i13 = 8;
                        m4Var.setVisibility(i13);
                    }
                    FrameLayout frameLayout = this.a3;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (UserObject.isService(this.B1)) {
                        A0();
                        this.b3.setVisibility(0);
                    } else {
                        p4 p4Var = this.b3;
                        if (p4Var != null) {
                            p4Var.setVisibility(8);
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
                    a4 a4Var9 = this.b2;
                    if (a4Var9 != null) {
                        a4Var9.setVisibility(8);
                    }
                    m4 m4Var2 = this.W1;
                    if (m4Var2 != null) {
                        m4Var2.setVisibility(8);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                }
                hVar = this.c2;
                if (hVar != null) {
                    a4 a4Var10 = this.b2;
                    if (a4Var10 != null && a4Var10.getVisibility() == 0) {
                        z48 = c6Var.f;
                        if (!z48) {
                            i26 = 0;
                            hVar.setVisibility(i26);
                        }
                    }
                    i26 = 8;
                    hVar.setVisibility(i26);
                }
                cVar = this.X1;
                r3 r3Var = this.L0;
                if (cVar != null) {
                    if (!this.c3) {
                        z47 = c6Var.f;
                        if (z47) {
                            i25 = 0;
                            cVar.setVisibility(i25);
                            this.X1.a(r3Var.g(), false);
                            this.X1.setCount(r3Var.getUnreadMessagesCount());
                        }
                    }
                    i25 = 8;
                    cVar.setVisibility(i25);
                    this.X1.a(r3Var.g(), false);
                    this.X1.setCount(r3Var.getUnreadMessagesCount());
                }
                r2Var = this.a2;
                if (r2Var != null) {
                    if (!this.c3) {
                        z46 = c6Var.f;
                        if (z46 && (d2Var = d2.W) != null && c6Var.k(d2Var.g())) {
                            i24 = 0;
                            r2Var.setVisibility(i24);
                            r2 r2Var2 = this.a2;
                            d2 d2Var5 = d2.W;
                            r2Var2.b(d2Var5 == null && d2Var5.o(), true);
                            r2 r2Var3 = this.a2;
                            d2 d2Var6 = d2.W;
                            r2Var3.a(d2Var6 != null || d2Var6.m(), true);
                        }
                    }
                    i24 = 8;
                    r2Var.setVisibility(i24);
                    r2 r2Var22 = this.a2;
                    d2 d2Var52 = d2.W;
                    r2Var22.b(d2Var52 == null && d2Var52.o(), true);
                    r2 r2Var32 = this.a2;
                    d2 d2Var62 = d2.W;
                    r2Var32.a(d2Var62 != null || d2Var62.m(), true);
                }
                if (this.Z1 != null) {
                    w2 w2Var = this.Y1;
                    if (!this.c3) {
                        z45 = c6Var.f;
                        if (z45) {
                            i22 = 0;
                            w2Var.setVisibility(i22);
                            x2 x2Var = this.Z1;
                            if (!this.c3) {
                                z44 = c6Var.f;
                                if (z44) {
                                    i23 = 0;
                                    x2Var.setVisibility(i23);
                                    layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                                    r2 r2Var4 = this.a2;
                                    dp = AndroidUtilities.dp((r2Var4 == null && r2Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != dp) {
                                        layoutParams.rightMargin = dp;
                                        this.Z1.setLayoutParams(layoutParams);
                                    }
                                }
                            }
                            i23 = 8;
                            x2Var.setVisibility(i23);
                            layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                            r2 r2Var42 = this.a2;
                            dp = AndroidUtilities.dp((r2Var42 == null && r2Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != dp) {
                            }
                        }
                    }
                    i22 = 8;
                    w2Var.setVisibility(i22);
                    x2 x2Var2 = this.Z1;
                    if (!this.c3) {
                    }
                    i23 = 8;
                    x2Var2.setVisibility(i23);
                    layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                    r2 r2Var422 = this.a2;
                    dp = AndroidUtilities.dp((r2Var422 == null && r2Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                    if (layoutParams.rightMargin != dp) {
                    }
                }
                z35 = c6Var.f;
                if (!z35 || ((c6Var.h == null && c6Var.i() == null && c6Var.g() == null) || this.c3)) {
                    g5 g5Var5 = g5Var2;
                    if (this.K1) {
                        jc jcVar6 = ((ac) this.Q1).d;
                        jcVar6.L0 = false;
                        jcVar6.P();
                        x5 x5Var2 = this.Q1;
                        this.j3 = false;
                        ((ac) x5Var2).e();
                    }
                    g5Var5.setVisibility(8);
                } else {
                    g5 g5Var6 = g5Var2;
                    g5Var6.b0.b(c6Var.h, c6Var.i(), c6Var.g(), jcVar.Z0 && !c6Var.g && (storyItem13 = c6Var.a) != null && storyItem13.translated, storyItem6 == c6Var.a);
                    g5Var6.setVisibility(0);
                }
                storyItem11 = c6Var.a;
                if (storyItem11 != null) {
                    TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                    if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                        if (r3Var.r(this.B1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                            r3Var.q(false, false);
                            this.L3 = 0L;
                            a4 a4Var11 = this.b2;
                            if (a4Var11 != null) {
                                a4Var11.K(true);
                                this.b2.R1();
                                r0(true);
                            }
                        }
                        r3Var.setVisibility(0);
                        a5Var2.invalidate();
                        if (this.Q1 != null && K0()) {
                            ((ac) this.Q1).a(this.J1, this.B1);
                        }
                        z36 = this.D1;
                        m4 m4Var3 = this.P0;
                        ImageView imageView3 = this.N0;
                        m4 m4Var4 = this.D0;
                        if (z36) {
                            if (this.S2) {
                                z43 = c6Var.f;
                                if (!z43) {
                                    i19 = 0;
                                    imageView3.setVisibility(i19);
                                    if (m4Var3 != null) {
                                        if (this.T2) {
                                            z42 = c6Var.f;
                                            if (!z42) {
                                                i21 = 0;
                                                m4Var3.setVisibility(i21);
                                            }
                                        }
                                        i21 = 8;
                                        m4Var3.setVisibility(i21);
                                    }
                                    if (!this.V1) {
                                        z41 = c6Var.f;
                                        if (!z41) {
                                            i20 = 0;
                                            m4Var4.setVisibility(i20);
                                        }
                                    }
                                    i20 = 8;
                                    m4Var4.setVisibility(i20);
                                }
                            }
                            i19 = 4;
                            imageView3.setVisibility(i19);
                            if (m4Var3 != null) {
                            }
                            if (!this.V1) {
                            }
                            i20 = 8;
                            m4Var4.setVisibility(i20);
                        } else {
                            if (this.S2) {
                                z38 = c6Var.f;
                                if (!z38) {
                                    i15 = 0;
                                    imageView3.setVisibility(i15);
                                    if (m4Var3 != null) {
                                        m4Var3.setVisibility(8);
                                    }
                                    if (!this.C1) {
                                        z37 = c6Var.f;
                                        if (!z37) {
                                            i16 = 0;
                                            m4Var4.setVisibility(i16);
                                            m4Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                        }
                                    }
                                    i16 = 8;
                                    m4Var4.setVisibility(i16);
                                    m4Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                }
                            }
                            i15 = 4;
                            imageView3.setVisibility(i15);
                            if (m4Var3 != null) {
                            }
                            if (!this.C1) {
                            }
                            i16 = 8;
                            m4Var4.setVisibility(i16);
                            m4Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                        }
                        m4Var4.requestLayout();
                        jcVar.e1.append(this.B1, i10);
                        if (this.K1) {
                            R0(0L);
                            g1();
                            l4Var2.bumpPriority();
                        }
                        r3Var.setLivePlayer(jcVar.A0);
                        this.L1 = 0;
                        if (jcVar.O0 != null && (storyItem12 = c6Var.a) != null) {
                            int i34 = storyItem12.id;
                            i18 = 0;
                            while (true) {
                                if (i18 < jcVar.O0.i.size()) {
                                    MessageObject messageObject = (MessageObject) jcVar.O0.i.get(i18);
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
                        if (jcVar.R0) {
                            this.M1 = (i36 - 1) - i35;
                        }
                        l4 = c6Var.l();
                        w5 w5Var = this.y0;
                        if (l4) {
                            w5Var.setVisibility(0);
                            this.e3 = c6Var.j() ? 1.0f : 0.5f;
                            boolean j10 = c6Var.j();
                            ImageView imageView4 = this.A0;
                            lj0 lj0Var = this.z0;
                            if (j10) {
                                lj0Var.setVisibility(0);
                                imageView4.setVisibility(8);
                                w5Var.setContentDescription(LocaleController.getString(!jc.D1 ? R.string.Mute : R.string.Unmute));
                            } else {
                                lj0Var.setVisibility(8);
                                imageView4.setVisibility(0);
                                w5Var.setContentDescription(LocaleController.getString(R.string.NoSound));
                            }
                            w5Var.setAlpha((1.0f - this.d4) * this.e3);
                        } else {
                            w5Var.setVisibility(8);
                        }
                        k9Var7 = c6Var.b;
                        nb nbVar = this.C0;
                        if (k9Var7 != null) {
                            nbVar.a(this.C1, k9Var7, z21 && this.b4);
                        } else {
                            TL_stories.StoryItem storyItem24 = c6Var.a;
                            if (storyItem24 != null) {
                                nbVar.b(this.C1, storyItem24, z21 && this.b4);
                            } else {
                                nbVar.b(this.C1, null, z21 && this.b4);
                            }
                        }
                        this.b4 = false;
                        nbVar.setTranslationX(w5Var.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z20) {
                            this.q3 = false;
                            TL_stories.StoryItem storyItem25 = c6Var.a;
                            if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                this.E0.setReaction(null);
                            } else {
                                this.E0.setReaction(zg.o0.d(reaction));
                            }
                        }
                        k9Var8 = c6Var.b;
                        if (k9Var8 == null && k9Var8.I) {
                            w0();
                            this.j2.set(c6Var.b.c.x);
                            this.j2.setVisibility(0);
                            ViewPropertyAnimator viewPropertyAnimator = this.k2;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.k2 = null;
                            }
                            if (z21) {
                                ViewPropertyAnimator interpolator = this.j2.animate().alpha(1.0f).setDuration(180L).setInterpolator(rr.h);
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
                                ViewPropertyAnimator withEndAction = this.j2.animate().alpha(0.0f).setDuration(180L).setInterpolator(rr.h).withEndAction(new c3(this, 0));
                                this.k2 = withEndAction;
                                withEndAction.start();
                            } else {
                                this.j2.setAlpha(0.0f);
                                this.j2.setVisibility(8);
                            }
                        }
                        this.x1.a(jc.D1, false);
                        if (this.K1 && c6Var.a != null) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + c6Var.a.id + " " + c6.c(c6Var));
                        }
                        if (this.C1) {
                            k7.f(this.C2, this.B1, c6Var.a);
                        }
                        z5 z5Var = a6Var.b;
                        d9 d9Var3 = jcVar.O0;
                        z5Var.setPadding(0, 0, (d9Var3 != null || d9Var3.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(c6Var.a);
                        if (!z10 && !this.C1 && this.z3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                            c3 c3Var = new c3(this, 1);
                            this.z3 = c3Var;
                            AndroidUtilities.runOnUIThread(c3Var, 500L);
                        }
                        e4Var3 = this.G0;
                        if ((e4Var3 != null || !e4Var3.V) && c6Var.j() && jc.D1) {
                            if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                                AndroidUtilities.cancelRunOnUIThread(this.R3);
                                AndroidUtilities.runOnUIThread(this.R3, 250L);
                            }
                        }
                        imageView = this.w0;
                        if (imageView != null) {
                            if (I0() && !J0()) {
                                z40 = c6Var.e;
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
                            z39 = c6Var.f;
                            if (z39 && !nbVar.f) {
                                i33 = 0;
                            }
                            imageView2.setVisibility(i33);
                            return;
                        }
                        return;
                    }
                }
                r3Var.r(this.B1, null);
                r3Var.setVisibility(8);
                a5Var2.invalidate();
                if (this.Q1 != null) {
                    ((ac) this.Q1).a(this.J1, this.B1);
                }
                z36 = this.D1;
                m4 m4Var32 = this.P0;
                ImageView imageView32 = this.N0;
                m4 m4Var42 = this.D0;
                if (z36) {
                }
                m4Var42.requestLayout();
                jcVar.e1.append(this.B1, i10);
                if (this.K1) {
                }
                r3Var.setLivePlayer(jcVar.A0);
                this.L1 = 0;
                if (jcVar.O0 != null) {
                    int i342 = storyItem12.id;
                    i18 = 0;
                    while (true) {
                        if (i18 < jcVar.O0.i.size()) {
                        }
                        i18++;
                    }
                }
                int i352 = this.J1;
                this.M1 = i352;
                int i362 = this.A1;
                this.N1 = i362;
                if (jcVar.R0) {
                }
                l4 = c6Var.l();
                w5 w5Var2 = this.y0;
                if (l4) {
                }
                k9Var7 = c6Var.b;
                nb nbVar2 = this.C0;
                if (k9Var7 != null) {
                }
                this.b4 = false;
                nbVar2.setTranslationX(w5Var2.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z20) {
                }
                k9Var8 = c6Var.b;
                if (k9Var8 == null) {
                }
                if (this.j2 != null) {
                }
                this.x1.a(jc.D1, false);
                if (this.K1) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + c6Var.a.id + " " + c6.c(c6Var));
                }
                if (this.C1) {
                }
                z5 z5Var2 = a6Var.b;
                d9 d9Var32 = jcVar.O0;
                z5Var2.setPadding(0, 0, (d9Var32 != null || d9Var32.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(c6Var.a);
                if (!z10) {
                    c3 c3Var2 = new c3(this, 1);
                    this.z3 = c3Var2;
                    AndroidUtilities.runOnUIThread(c3Var2, 500L);
                }
                e4Var3 = this.G0;
                if (e4Var3 != null) {
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
        a5Var = this.c1;
        g5Var = this.K0;
        a6Var = this.o1;
        if (k9Var4 != null) {
        }
        a4Var = this.b2;
        if (a4Var != null) {
        }
        z17 = c6Var2.f;
        if (z17) {
        }
        czVar.c();
        this.W0 = 0L;
        this.Y0 = false;
        k9Var5 = c6Var2.b;
        if (k9Var5 == null) {
        }
        qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar != null) {
            qcVar.b();
        }
        g5Var.J();
        q0();
        z16 = true;
        if (z16) {
        }
        a6Var.setOnSubtitleClick(null);
        TextView[] textViewArr2 = a6Var.c;
        this.Q3 = 0;
        boolean z612 = z60;
        long j32 = this.B1;
        l4Var2 = l4Var;
        z19 = c6Var2.f;
        W0(j32, false, z19);
        k9Var6 = c6Var2.b;
        if (k9Var6 == null) {
        }
        z20 = z16;
        z21 = z59;
        a5Var2 = a5Var;
        g5Var2 = g5Var;
        charSequence4 = charSequence2;
        z22 = z612;
        charSequence = charSequence4;
        if (charSequence != null) {
        }
        e4Var = this.F0;
        if (e4Var != null) {
        }
        e4Var2 = this.G0;
        if (e4Var2 != null) {
        }
        storyItem10 = c6Var.a;
        if (storyItem6 == storyItem10) {
        }
        c6Var.o();
        if (!c6Var.g) {
        }
        jc jcVar52 = ((ac) x5Var).d;
        jcVar52.Z0 = false;
        jcVar52.P();
        z24 = c6Var.f;
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
        cVar = this.X1;
        r3 r3Var2 = this.L0;
        if (cVar != null) {
        }
        r2Var = this.a2;
        if (r2Var != null) {
        }
        if (this.Z1 != null) {
        }
        z35 = c6Var.f;
        if (z35) {
        }
        g5 g5Var52 = g5Var2;
        if (this.K1) {
        }
        g5Var52.setVisibility(8);
        storyItem11 = c6Var.a;
        if (storyItem11 != null) {
        }
        r3Var2.r(this.B1, null);
        r3Var2.setVisibility(8);
        a5Var2.invalidate();
        if (this.Q1 != null) {
        }
        z36 = this.D1;
        m4 m4Var322 = this.P0;
        ImageView imageView322 = this.N0;
        m4 m4Var422 = this.D0;
        if (z36) {
        }
        m4Var422.requestLayout();
        jcVar.e1.append(this.B1, i10);
        if (this.K1) {
        }
        r3Var2.setLivePlayer(jcVar.A0);
        this.L1 = 0;
        if (jcVar.O0 != null) {
        }
        int i3522 = this.J1;
        this.M1 = i3522;
        int i3622 = this.A1;
        this.N1 = i3622;
        if (jcVar.R0) {
        }
        l4 = c6Var.l();
        w5 w5Var22 = this.y0;
        if (l4) {
        }
        k9Var7 = c6Var.b;
        nb nbVar22 = this.C0;
        if (k9Var7 != null) {
        }
        this.b4 = false;
        nbVar22.setTranslationX(w5Var22.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z20) {
        }
        k9Var8 = c6Var.b;
        if (k9Var8 == null) {
        }
        if (this.j2 != null) {
        }
        this.x1.a(jc.D1, false);
        if (this.K1) {
        }
        if (this.C1) {
        }
        z5 z5Var22 = a6Var.b;
        d9 d9Var322 = jcVar.O0;
        z5Var22.setPadding(0, 0, (d9Var322 != null || d9Var322.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(c6Var.a);
        if (!z10) {
        }
        e4Var3 = this.G0;
        if (e4Var3 != null) {
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
        String l4 = a4.a.l(max, max, "_");
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
            ((zg.f0) arrayList.get(i12)).b(false);
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
                    V0((k9) arrayList13.get(i10 - arrayList2.size()), imageReceiver, l4);
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
                    k9 t10 = this.S1.t(j3, storyItem2);
                    if (t10 != null) {
                        V0(t10, imageReceiver, l4);
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
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), v7.j.t(l4, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), l4, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i13;
                                String str2 = l4;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                l4 = str2;
                            }
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i11 = i13;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (z10) {
                                storyItem = storyItem2;
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), v7.j.t(l4, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), l4, null, null, null, 0L, null, storyItem, 0);
                            } else {
                                storyItem = storyItem2;
                                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.clearImage();
                                } else {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                                    imageReceiver2.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), l4, null, null, null, 0L, null, storyItem, 0);
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
                                } catch (UnsupportedEncodingException e) {
                                    e = e;
                                    e.printStackTrace();
                                    if (storyItem.media_areas != null) {
                                    }
                                    arrayList9 = arrayList5;
                                    i13 = i11 + 1;
                                    arrayList11 = arrayList7;
                                    arrayList = arrayList9;
                                    arrayList12 = arrayList8;
                                }
                            } catch (UnsupportedEncodingException e7) {
                                e = e7;
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
                        } catch (UnsupportedEncodingException e10) {
                            e = e10;
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
                                zg.f0 f0Var = new zg.f0(this);
                                f0Var.e(zg.o0.d(tL_mediaAreaSuggestedReaction.reaction));
                                f0Var.b(this.a1);
                                arrayList10 = arrayList5;
                                arrayList10.add(f0Var);
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
        ac acVar = (ac) this.Q1;
        jc jcVar = acVar.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z11 = jcVar.H0;
            ArrayList arrayList16 = jcVar.M0;
            if (z11) {
                return;
            }
            for (int i16 = 0; i16 < arrayList16.size(); i16++) {
                for (int i17 = 0; i17 < arrayList15.size(); i17++) {
                    if (((Uri) arrayList15.get(i17)).equals(((ic) arrayList16.get(i16)).uri)) {
                        arrayList15.remove(i17);
                    }
                }
            }
            for (int i18 = 0; i18 < arrayList15.size(); i18++) {
                Uri uri = (Uri) arrayList15.get(i18);
                ic icVar = new ic(jcVar, jcVar.C0, jcVar.B0);
                icVar.setOnSeekUpdate(new ba(3, acVar, icVar));
                icVar.uri = uri;
                TLRPC.Document document2 = (TLRPC.Document) arrayList14.get(i18);
                icVar.document = document2;
                FileStreamLoadOperation.setPriorityForDocument(document2, 0);
                icVar.preparePlayer(uri, jc.D1, jc.B1);
                arrayList16.add(icVar);
                if (arrayList16.size() > 2) {
                    ((ic) arrayList16.remove(0)).release(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.aw0
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
        a5 a5Var = this.c1;
        Bitmap createBitmap = Bitmap.createBitmap(a5Var.getWidth(), a5Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public l9 getStoriesController() {
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
        jc jcVar = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.w1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j3 = ((k9) arrayList2.get(i11)).a;
                    if (((int) (j3 ^ (j3 >>> 32))) == jcVar.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            }
            int indexOf = this.z1.indexOf(Integer.valueOf(jcVar.P0));
            if (indexOf < 0 && !this.z1.isEmpty()) {
                if (jcVar.P0 > ((Integer) this.z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (jcVar.P0 < ((Integer) hg.c.g(1, this.z1)).intValue()) {
                    indexOf = this.z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = jcVar.e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !jcVar.N0 && (peerStories = this.u1) != null && peerStories.max_read_id > 0) {
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
        d9 d9Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.v1;
        arrayList.clear();
        jc jcVar = this.J0;
        if (!jcVar.N0) {
            ArrayList arrayList2 = this.z1;
            int i10 = 0;
            ArrayList arrayList3 = this.w1;
            if (arrayList2 != null && (d9Var = jcVar.O0) != null) {
                if (d9Var instanceof u8) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((u8) jcVar.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            k9 k9Var = (k9) E.get(i11);
                            ci.l8 l8Var = k9Var.c;
                            if (l8Var != null && !l8Var.g && TextUtils.equals(l8Var.K0, str)) {
                                arrayList3.add(k9Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = jcVar.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (jcVar.O0 != null) {
                while (i10 < jcVar.O0.i.size()) {
                    arrayList.add(((MessageObject) jcVar.O0.i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = jcVar.Q0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.B1) {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.u1 = y3;
                    if (y3 == null) {
                        this.u1 = this.S1.z(this.B1);
                    }
                } else {
                    this.u1 = jcVar.Q0;
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
        } else if (!jcVar.S0) {
            arrayList.add(jcVar.T0);
        }
        this.A1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        e6 currentPeerView;
        c60 c60Var = this.J2;
        if (c60Var != null) {
            c60Var.f0 = null;
            c60Var.a(false);
        }
        long j3 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.a;
        jc jcVar = this.J0;
        jcVar.getClass();
        if (j3 != 0 && storyItem != null) {
            jc.E1.remove(j3 + (j3 >> 16) + (storyItem.id << 16));
        }
        this.i3 = true;
        zb zbVar = jcVar.n0;
        if (zbVar != null && (currentPeerView = zbVar.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            org.telegram.ui.Components.qc I = new yc(this.c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new c3(this, 2));
            I.r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.C2).ensureMessagesLoaded(this.B1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        c6 c6Var = this.O1;
        TL_stories.StoryItem storyItem = c6Var.a;
        if (storyItem == null) {
            storyItem = c6Var.c;
        }
        boolean z11 = this.D1;
        if (z11 || this.C1) {
            if (storyItem == null) {
                this.A2.setText("");
                this.F2.setVisibility(8);
                this.B2.setVisibility(8);
                return;
            }
            jc jcVar = this.J0;
            m4 m4Var = this.D0;
            if (!z11) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.A2.setText(LocaleController.getString(jcVar.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
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
                        pq pqVar = new pq(R.drawable.mini_views_likes, 0);
                        pqVar.setOverrideColor(-53704);
                        pqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(pqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        pq pqVar2 = new pq(R.drawable.mini_repost_story, 0);
                        pqVar2.setOverrideColor(-14161823);
                        pqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(pqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder);
                    if (i11 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + hg.c.f(i11, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                }
                m4Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
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
            org.telegram.ui.Components.o6 o6Var = this.R0;
            if (o6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.V0 = false;
            } else {
                o6Var.q(Integer.toString(i10), z10 && this.V0, true);
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
                this.A2.setText(LocaleController.getString(jcVar.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new pq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.A2.setText(spannableStringBuilder2);
            } else {
                this.A2.setText("");
            }
            m4Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.U0 ? this.Q0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + m4Var.getLayoutParams().width;
            m4 m4Var2 = this.P0;
            if (m4Var2 != null) {
                m4Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.V0 ? this.R0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += m4Var2.getLayoutParams().width;
                m4Var2.requestLayout();
            }
            this.W1.requestLayout();
            m4Var.requestLayout();
            this.B2.setVisibility(8);
            this.F2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = c6Var.a;
            v4 v4Var = this.j1;
            if (storyItem2 == null) {
                v4Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < v4Var.getChildCount(); i15++) {
                if (v4Var.getChildAt(i15) instanceof pb) {
                    ((pb) v4Var.getChildAt(i15)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void l0() {
        q9 q9Var = this.E0;
        q9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new w3(0, q9Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        q9 q9Var2 = new q9(getContext(), this.x1);
        this.E0 = q9Var2;
        q9Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.y5.e(40, 40, 3));
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
        throw new UnsupportedOperationException("Method not decompiled: ai.e6.l1():void");
    }

    public final void m0(boolean z10) {
        ValueAnimator valueAnimator = this.c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d4, z10 ? 1.0f : 0.0f);
        this.c4 = ofFloat;
        ofFloat.addUpdateListener(new d3(this, 2));
        this.c4.addListener(new u3(this, z10, 1));
        this.c4.setDuration(420L);
        this.c4.setInterpolator(rr.h);
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
        a1.c cVar = new a1.c(runnable, 5);
        a2Var.l0 = string;
        a2Var.m0 = cVar;
        String string2 = LocaleController.getString(R.string.Cancel);
        w1 w1Var = new w1(5);
        a2Var.n0 = string2;
        a2Var.o0 = w1Var;
        a2Var.show();
    }

    public final void o0(int i10) {
        this.E2 = false;
        this.V2 = true;
        this.B3 = false;
        this.D1 = false;
        this.E1 = false;
        long j3 = this.B1;
        a6 a6Var = this.o1;
        org.telegram.ui.Components.h9 h9Var = this.n1;
        if (j3 >= 0) {
            this.C1 = j3 == UserConfig.getInstance(this.C2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            this.F1 = !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            h9Var.m(this.C2, user);
            a6Var.a.getImageReceiver().setForUserOrChat(user, h9Var);
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
            h9Var.k(this.C2, chat);
            a6Var.a.getImageReceiver().setForUserOrChat(chat, h9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            l9 l9Var = this.S1;
            long j10 = this.B1;
            a0.i iVar = l9Var.m;
            sc scVar = (sc) iVar.f(j10);
            if (scVar == null) {
                scVar = new sc(l9Var.a, j10, l9Var);
                iVar.k(scVar, j10);
            }
            scVar.b(true);
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
        a5 a5Var = this.c1;
        jc jcVar = this.J0;
        int i11 = 8;
        c6 c6Var = this.O1;
        if (z10) {
            B0();
            if (this.b2 == null && (this.E1 || c6Var.f)) {
                v0();
            }
            if (this.b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                a4 a4Var = this.b2;
                if (c6Var.f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                a4Var.setVisibility(i11);
                a4 a4Var2 = this.b2;
                boolean z11 = c6Var.f;
                D0(true);
                a4Var2.i1(z11);
                this.b2.o1(c6Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
                cu editField = this.b2.getEditField();
                long j11 = this.B1;
                TL_stories.StoryItem storyItem = c6Var.a;
                jcVar.getClass();
                editField.setText(jc.u(j11, storyItem));
                this.b2.b1(this.C2, this.B1);
                this.b2.K1(chat2, null);
            }
            org.telegram.ui.Components.o6 o6Var = this.Q0;
            org.telegram.ui.ActionBar.d6 d6Var = this.B0;
            if (o6Var == null) {
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(false, false, false, false);
                this.Q0 = o6Var2;
                m4 m4Var = this.D0;
                o6Var2.setCallback(m4Var);
                this.Q0.r(d6Var.G0(org.telegram.ui.ActionBar.h6.G6));
                this.Q0.t(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.e6(m4Var);
            }
            m4 m4Var2 = this.P0;
            if (m4Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(false, false, false, false);
                this.R0 = o6Var3;
                o6Var3.setCallback(m4Var2);
                this.R0.r(d6Var.G0(org.telegram.ui.ActionBar.h6.G6));
                this.R0.t(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.e6(m4Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            a5Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (c6Var.f) {
                this.W1.setVisibility(8);
                if (this.b2 == null) {
                    v0();
                }
                this.b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                a4 a4Var3 = this.b2;
                if (a4Var3 != null) {
                    a4Var3.setVisibility(8);
                }
            }
            a4 a4Var4 = this.b2;
            if (a4Var4 != null) {
                boolean z12 = c6Var.f;
                D0(true);
                a4Var4.i1(z12);
                this.b2.o1(c6Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(jcVar.P0));
                    if (indexOf < 0 && !this.z1.isEmpty()) {
                        if (jcVar.P0 > ((Integer) this.z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (jcVar.P0 < ((Integer) hg.c.g(1, this.z1)).intValue()) {
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
            a5Var.invalidate();
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
                this.g2.setVisibility(((!this.F1 || c6Var.f) && !this.G1) ? 8 : 0);
            }
            gb gbVar = this.j2;
            if (gbVar != null) {
                gbVar.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            a4 a4Var5 = this.b2;
            if (a4Var5 != null) {
                a4Var5.setVisibility((I0() || UserObject.isService(this.B1)) ? 8 : 0);
                a4 a4Var6 = this.b2;
                boolean z13 = c6Var.f;
                D0(true);
                a4Var6.i1(z13);
                this.b2.o1(c6Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
                cu editField2 = this.b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem2 = c6Var.a;
                jcVar.getClass();
                editField2.setText(jc.u(j12, storyItem2));
                this.b2.b1(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.b2.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.z2, false);
                }
            }
            this.A1 = getStoriesCount();
            m4 m4Var3 = this.W1;
            if (m4Var3 != null) {
                m4Var3.setVisibility(8);
            }
            a5Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a1 = true;
        this.e1.onAttachedToWindow();
        this.g1.onAttachedToWindow();
        this.f1.onAttachedToWindow();
        this.l3.onAttachedToWindow();
        this.n3.onAttachedToWindow();
        a4 a4Var = this.b2;
        if (a4Var != null) {
            a4Var.E0();
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
            ((zg.f0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a1 = false;
        this.e1.onDetachedFromWindow();
        this.g1.onDetachedFromWindow();
        this.f1.onDetachedFromWindow();
        this.l3.onDetachedFromWindow();
        this.n3.onDetachedFromWindow();
        a4 a4Var = this.b2;
        if (a4Var != null) {
            a4Var.D0();
        }
        org.telegram.ui.Components.q5 q5Var = this.o3;
        if (q5Var != null) {
            q5Var.o(this);
            this.o3 = null;
        }
        zg.d dVar = this.m3;
        if (dVar != null) {
            dVar.d(this);
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
            ((zg.f0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        c60 c60Var;
        boolean z10;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        qk0 qk0Var;
        c4 c4Var;
        jc jcVar = this.J0;
        if (jcVar.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i12 = 0;
        if (this.K1 && this.Z2 == null) {
            this.y2 = ((ac) this.Q1).d.p0;
        } else {
            this.y2 = 0;
        }
        int size = jcVar.b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.y2;
        int size2 = (int) ((View.MeasureSpec.getSize(i10) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.y2 < AndroidUtilities.dp(20.0f)) {
            this.y2 = 0;
        }
        int i13 = this.y2;
        qk0 qk0Var2 = this.r3;
        if (qk0Var2 == null || qk0Var2.getReactionsWindow() == null || this.r3.getReactionsWindow().q) {
            a4 a4Var = this.b2;
            if (a4Var != null && (a4Var.t0() || this.b2.k3)) {
                if (this.b2.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.b2.getEmojiPadding();
                } else {
                    a4 a4Var2 = this.b2;
                    if (a4Var2.z3) {
                        a4Var2.L();
                        i13 = this.b2.getStickersExpandedHeight();
                    } else {
                        i13 = a4Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.r3.getReactionsWindow().c.animate().translationY(-this.y2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
            i13 = 0;
        }
        boolean z11 = this.v2;
        int i14 = this.o2;
        a6 a6Var = this.o1;
        int i15 = 1;
        if (i14 != i13) {
            this.v2 = false;
            int i16 = 3;
            c6 c6Var = this.O1;
            f7 = 8.0f;
            if (i13 <= 0 || !this.K1) {
                a4 a4Var3 = this.b2;
                if (a4Var3 != null) {
                    jc.J(this.B1, c6Var.a, a4Var3.getEditText());
                }
            } else {
                this.v2 = true;
                this.i3 = false;
                this.t2 = i13;
                if (this.f2 == null) {
                    qk0 qk0Var3 = new qk0(1, this.C2, getContext(), LaunchActivity.R(), new x3(i16, this.B0));
                    this.f2 = qk0Var3;
                    qk0Var3.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    qk0 qk0Var4 = this.f2;
                    qk0Var4.N0 = true;
                    addView(qk0Var4, this.I0, w7.y5.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.f2.setDelegate(new u4(this));
                    this.f2.p(null, null, true);
                }
                this.f2.setFragment(LaunchActivity.R());
                this.f2.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                zg.k0 k0Var = zg.k0.B;
                if (k0Var != null) {
                    k0Var.l = true;
                }
                zg.k0 k0Var2 = zg.k0.C;
                if (k0Var2 != null) {
                    k0Var2.l = true;
                }
            }
            a4 a4Var4 = this.b2;
            if (a4Var4 != null) {
                a4Var4.o1(c6Var.f && !D0(true) && this.v2, true);
            }
            if (this.v2 && (c4Var = this.d3) != null) {
                c4Var.setVisibility(0);
            }
            if (!this.v2 && (qk0Var = this.f2) != null) {
                qk0Var.n();
            }
            a6Var.setEnabled(!this.v2);
            if (this.b2 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.v2, 0.1f, true);
            }
            if (this.K1 && this.v2) {
                jc jcVar2 = ((ac) this.Q1).d;
                if (!jcVar2.x) {
                    jcVar2.x = true;
                    jcVar2.P();
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
            ofFloat.addUpdateListener(new d3(this, i12));
            this.p2.addListener(new v3(this, i15));
            if (this.v2) {
                this.p2.setDuration(250L);
                this.p2.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                jcVar.m();
            } else {
                this.p2.setDuration(500L);
                this.p2.setInterpolator(rr.h);
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
                    if (c6Var.f) {
                        ci.e4 e4Var = this.d2;
                        if (e4Var != null) {
                            if (!e4Var.V) {
                                removeView(e4Var);
                            }
                        }
                        if (!D0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            ci.e4 e4Var2 = new ci.e4(getContext(), 3);
                            this.d2 = e4Var2;
                            e4Var2.s(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.d2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            ci.e4 e4Var3 = this.d2;
                            e4Var3.K = Layout.Alignment.ALIGN_OPPOSITE;
                            e4Var3.l0 = new a1.e(10, this, e4Var2);
                            addView(e4Var3, w7.y5.e(-1, 100, 87));
                            this.d2.u();
                            l1();
                        }
                    }
                } else {
                    a4 a4Var5 = this.b2;
                    if (a4Var5 != null) {
                        a4Var5.getEditField().clearFocus();
                    }
                    ci.e4 e4Var4 = this.d2;
                    if (e4Var4 != null) {
                        e4Var4.e(true);
                    }
                }
                this.u2 = true;
            } else {
                this.u2 = false;
            }
        } else {
            f7 = 8.0f;
        }
        a4 a4Var6 = this.b2;
        if (a4Var6 != null && a4Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.b2.getEmojiView().getLayoutParams()).gravity = 80;
        }
        a5 a5Var = this.c1;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) a5Var.getLayoutParams();
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
            a5Var.setLayoutParams(layoutParams2);
        }
        m4 m4Var = this.W1;
        if (m4Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) m4Var.getLayoutParams();
            if (this.x2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f7) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        p4 p4Var = this.b3;
        if (p4Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) p4Var.getLayoutParams();
            if (this.x2) {
                c10 = 0;
                this.b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                c60Var = this.J2;
                if (c60Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) c60Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.f0.A(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i13;
                    }
                }
                z10 = this.x2;
                LinearLayout linearLayout = this.O0;
                g5 g5Var = this.K0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.C1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) g5Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.w2 != this.x2) {
                        g5Var.setLayoutParams((FrameLayout.LayoutParams) g5Var.getLayoutParams());
                    }
                    g5Var.u0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) g5Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f7);
                    if (this.w2 != this.x2) {
                        g5Var.setLayoutParams((FrameLayout.LayoutParams) g5Var.getLayoutParams());
                    }
                    g5Var.u0 = AndroidUtilities.dp(f7);
                }
                this.V2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.C0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.y0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                z5 z5Var = a6Var.b;
                TextView[] textViewArr = a6Var.c;
                layoutParams = (FrameLayout.LayoutParams) z5Var.getLayoutParams();
                if (layoutParams.rightMargin != dp) {
                    int i17 = (int) dp;
                    layoutParams.rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i17;
                    a6Var.forceLayout();
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.w2 = this.x2;
            }
            this.b3.setTextColor(i0.a.k(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c10 = 0;
        c60Var = this.J2;
        if (c60Var != null) {
        }
        z10 = this.x2;
        LinearLayout linearLayout2 = this.O0;
        g5 g5Var2 = this.K0;
        if (z10) {
        }
        this.V2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.C0.getVisibility() == 0) {
        }
        if (this.y0.getVisibility() == 0) {
        }
        z5 z5Var2 = a6Var.b;
        TextView[] textViewArr2 = a6Var.c;
        layoutParams = (FrameLayout.LayoutParams) z5Var2.getLayoutParams();
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
        g5 g5Var = this.K0;
        if (g5Var.W.y()) {
            g5Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((ac) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        if (this.b2 != null && this.f3 && this.a1) {
            c3 c3Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(c3Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.b2.K(true);
            boolean z11 = this.F1;
            c6 c6Var = this.O1;
            if ((z11 && !c6Var.f) || this.G1) {
                this.k3 = false;
                this.b2.setEnabled(false);
                this.b2.j1(" ", z10);
                return;
            }
            if (this.H1 > 0) {
                this.k3 = false;
                this.b2.setEnabled(true);
                this.b2.j1(yh.w7.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
                return;
            }
            if (!c6Var.f && tL_storiesStealthMode != null) {
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
                        a4 a4Var = this.b2;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        a4Var.e = formatString;
                        a4Var.f = format;
                        a4Var.G1(z10);
                    } else {
                        this.b2.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    AndroidUtilities.runOnUIThread(c3Var, 1000L);
                    return;
                }
            }
            this.k3 = false;
            this.b2.setEnabled(true);
            if (!c6Var.f) {
                this.b2.j1(LocaleController.getString(this.E1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            if (this.b2.getStarsPrice() <= 0) {
                this.b2.j1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.b2.j1(yh.w7.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.b2.O4), z10);
            pq pqVar = this.b2.O4[0];
            if (pqVar != null) {
                pqVar.spaceScaleX = 0.9f;
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
        v4 v4Var = this.j1;
        if (v4Var != null) {
            ci.e4 e4Var = v4Var.c;
            if (e4Var != null) {
                e4Var.e(true);
                v4Var.c = null;
            }
            v4Var.b = null;
            v4Var.invalidate();
            v4Var.b(false);
        }
        g5 g5Var = this.K0;
        if (g5Var.W.y()) {
            g5Var.W.f(false);
            return true;
        }
        ci.e4 e4Var2 = this.F0;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
        ci.e4 e4Var3 = this.G0;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        j40 j40Var = this.W2;
        if (j40Var != null) {
            j40Var.b(true);
        }
        v5 v5Var = this.t1;
        if (v5Var != null && v5Var.b) {
            v5Var.a();
            return true;
        }
        a4 a4Var = this.b2;
        if (a4Var != null && a4Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.b2.c1) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new y2(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((ac) this.Q1).h(alertDialog$Builder.a);
            return true;
        }
        qk0 qk0Var = this.f2;
        if (qk0Var != null && qk0Var.getReactionsWindow() != null && !this.f2.getReactionsWindow().q) {
            this.f2.getReactionsWindow().d();
            return true;
        }
        a4 a4Var2 = this.b2;
        if (a4Var2 != null && a4Var2.t0()) {
            if (this.y2 > 0) {
                AndroidUtilities.hideKeyboard(this.b2.getEmojiView());
                return true;
            }
            this.b2.n0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (g5Var.getVisibility() != 0 || g5Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            g5Var.C();
            this.g3 = false;
            this.c1.invalidate();
            return true;
        }
        a4 a4Var3 = this.b2;
        if (a4Var3 != null) {
            long j3 = this.B1;
            TL_stories.StoryItem storyItem = this.O1.a;
            Editable editText = a4Var3.getEditText();
            this.J0.getClass();
            jc.J(j3, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.b2);
        return true;
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.k1.b = i10;
        qk0 qk0Var = this.f2;
        if (qk0Var != null) {
            qk0Var.setCurrentAccount(i10);
            this.f2.p(null, null, true);
        }
        qk0 qk0Var2 = this.r3;
        if (qk0Var2 != null) {
            qk0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(x5 x5Var) {
        this.Q1 = x5Var;
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
                q4 q4Var = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(q4Var);
                    AndroidUtilities.runOnUIThread(q4Var, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(q4Var);
                    jc jcVar = ((ac) this.Q1).d;
                    jcVar.l1 = true;
                    jcVar.P();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            l4 l4Var = this.e1;
            if (z10) {
                l4Var.stopAnimation();
                l4Var.setAllowStartAnimation(false);
            } else {
                l4Var.startAnimation();
                l4Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            g4 g4Var = new g4(this, getContext(), this.B0);
            this.I2 = g4Var;
            g4Var.Z1 = new h4(this);
            g4Var.j0.f0();
            g4 g4Var2 = this.I2;
            g4Var2.W = true;
            g4Var2.r1();
            g4 g4Var3 = this.I2;
            g4Var3.X = new i4(this);
            g4Var3.m1().setText(this.b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 != null || getContext() == null) {
            return;
        }
        c cVar = new c(getContext(), this.I3);
        this.X1 = cVar;
        cVar.setOnClickListener(new e3(this, 1));
        addView(this.X1, w7.y5.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.d6 d6Var = this.B0;
        a4 a4Var = new a4(this, AndroidUtilities.findActivity(getContext()), this, new x3(1, d6Var));
        this.b2 = a4Var;
        a4Var.getEditField().useAnimatedTextDrawable();
        this.b2.getEditField().setScaleX(0.0f);
        this.b2.setOverrideKeyboardAnimation(true);
        this.b2.setClipChildren(false);
        this.b2.setDelegate(new b4(this));
        setDelegate(this.b2);
        a4 a4Var2 = this.b2;
        a4Var2.y4 = false;
        a4Var2.z4 = true;
        if (this.O1.f) {
            a4Var2.V0(false, false, false);
        } else {
            a4Var2.V0(true, true, false);
        }
        this.b2.e();
        a4 a4Var3 = this.b2;
        a4Var3.A4 = true;
        addView(a4Var3, w7.y5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.O3 != null) {
            this.b2.P1(false);
        }
        this.b2.G2 = this.z2;
        d6 d6Var2 = this.M2;
        ((ArrayList) d6Var2.g).add(this.c1);
        ((ArrayList) d6Var2.g).add(this);
        if (this.a1) {
            this.b2.E0();
        }
        r0(false);
        if (I0()) {
            this.b2.setVisibility(8);
        }
        jh.h hVar = new jh.h(getContext(), d6Var, this.I3, this.F3);
        this.c2 = hVar;
        hVar.setOnClickListener(new y2(this, 1));
        addView(this.c2, w7.y5.e(57, 300, 85));
        this.c2.setVisibility(8);
        this.b2.setSideButtonsForAttach(this.c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.j2 != null) {
            return;
        }
        gb gbVar = new gb(getContext(), this.B0);
        this.j2 = gbVar;
        gbVar.setOnClickListener(new e3(this, 4));
        this.j2.setAlpha(0.0f);
        this.j2.setVisibility(8);
        addView(this.j2, w7.y5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.a2 != null || getContext() == null) {
            return;
        }
        r2 r2Var = new r2(getContext(), this.I3);
        this.a2 = r2Var;
        r2Var.setOnClickListener(new e3(this, 5));
        r2 r2Var2 = this.a2;
        d2 d2Var = d2.W;
        boolean z10 = true;
        r2Var2.b(d2Var != null && d2Var.o(), false);
        r2 r2Var3 = this.a2;
        d2 d2Var2 = d2.W;
        if (d2Var2 != null && !d2Var2.m()) {
            z10 = false;
        }
        r2Var3.a(z10, false);
        addView(this.a2, w7.y5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void y0() {
        if (this.Z1 != null || getContext() == null) {
            return;
        }
        this.Y1 = new w2(getContext(), this.C2);
        x2 x2Var = new x2(getContext(), this.Y1, this.I3);
        this.Z1 = x2Var;
        x2Var.setOnClickListener(new e3(this, 6));
        this.Z1.setOnLongClickListener(new b3(this, 1));
        addView(this.Z1, w7.y5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.Y1, w7.y5.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
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
        textView3.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.i2.setGravity(17);
        w7.a6.a(this.i2);
        this.i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.g2.addView(imageView, w7.y5.t(22, 22, 16, 12, 1, 4, 0));
        this.g2.addView(this.h2, w7.y5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.g2.addView(this.i2, w7.y5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.b2.addView(this.g2, w7.y5.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
