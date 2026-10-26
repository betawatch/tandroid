package di;

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
import bi.md;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cv0;
import org.telegram.ui.oy;
import org.telegram.ui.sr;
import org.telegram.ui.un;
import org.telegram.ui.za1;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class q4 extends vw0 implements NotificationCenter.NotificationCenterDelegate {
    public final m2 A0;
    public int A1;
    public boolean A2;
    public long A3;
    public final View B0;
    public int B1;
    public final p4 B2;
    public long B3;
    public final ImageView C0;
    public int C1;
    public final AnimationNotificationsLocker C2;
    public boolean C3;
    public final LinearLayout D0;
    public final o4 D1;
    public final org.telegram.ui.Components.h6 D2;
    public TLRPC.TL_channels_sendAsPeers D3;
    public final g3 E0;
    public final aa.m0 E1;
    public final org.telegram.ui.Components.h6 E2;
    public final c2 E3;
    public org.telegram.ui.Components.r6 F0;
    public j4 F1;
    public float F2;
    public int F3;
    public org.telegram.ui.Components.r6 G0;
    public boolean G1;
    public long G2;
    public final c2 G3;
    public org.telegram.ui.Components.h6 H0;
    public h7 H1;
    public boolean H2;
    public final ArrayList H3;
    public org.telegram.ui.Components.h6 I0;
    public boolean I1;
    public boolean I2;
    public final ArrayList I3;
    public boolean J0;
    public boolean J1;
    public boolean J2;
    public boolean J3;
    public boolean K0;
    public boolean K1;
    public boolean K2;
    public final a5.d K3;
    public long L0;
    public g3 L1;
    public t40 L2;
    public final org.telegram.ui.Components.h6 L3;
    public long M0;
    public a M1;
    public final cv0 M2;
    public final org.telegram.ui.Components.h6 M3;
    public boolean N0;
    public w1 N1;
    public boolean N2;
    public final org.telegram.ui.Components.h6 N3;
    public boolean O0;
    public x1 O1;
    public d3 O2;
    public float O3;
    public boolean P0;
    public t1 P1;
    public FrameLayout P2;
    public final Path P3;
    public boolean Q0;
    public u2 Q1;
    public md Q2;
    public boolean Q3;
    public final q3 R0;
    public lh.h R1;
    public boolean R2;
    public ValueAnimator R3;
    public final FrameLayout S0;
    public fi.v3 S1;
    public w2 S2;
    public float S3;
    public final f3 T0;
    public ValueAnimator T1;
    public float T2;
    public final ImageReceiver U0;
    public fl0 U1;
    public boolean U2;
    public final ImageReceiver V0;
    public LinearLayout V1;
    public boolean V2;
    public final ArrayList W0;
    public TextView W1;
    public boolean W2;
    public Runnable X0;
    public TextView X1;
    public boolean X2;
    public final m3 Y0;
    public w8 Y1;
    public boolean Y2;
    public final oy Z0;
    public ViewPropertyAnimator Z1;
    public boolean Z2;
    public v4 a1;
    public final eh.d a2;
    public final ImageReceiver a3;
    public float b1;
    public final eh.d b2;
    public bh.e b3;
    public final org.telegram.ui.Components.j9 c1;
    public final Paint c2;
    public final ImageReceiver c3;
    public final m4 d1;
    public int d2;
    public org.telegram.ui.Components.t5 d3;
    public final x8 e1;
    public ValueAnimator e2;
    public boolean e3;
    public k6.m f1;
    public float f2;
    public boolean f3;
    public int g1;
    public float g2;
    public fl0 g3;
    public org.telegram.ui.ActionBar.g1 h1;
    public float h2;
    public boolean h3;
    public h4 i1;
    public int i2;
    public float i3;
    public TL_stories.PeerStories j1;
    public boolean j2;
    public boolean j3;
    public final ArrayList k1;
    public boolean k2;
    public float k3;
    public final ImageView l0;
    public final ArrayList l1;
    public boolean l2;
    public int l3;
    public final ImageView m0;
    public final n4 m1;
    public boolean m2;
    public int m3;
    public final i4 n0;
    public final ag.w0 n1;
    public int n2;
    public int n3;
    public final ak0 o0;
    public ArrayList o1;
    public final int o2;
    public c2 o3;
    public final ImageView p0;
    public int p1;
    public TextView p2;
    public float p3;
    public final org.telegram.ui.ActionBar.u6 q0;
    public long q1;
    public v q2;
    public boolean q3;
    public final d9 r0;
    public boolean r1;
    public int r2;
    public sr r3;
    public final g3 s0;
    public boolean s1;
    public int s2;
    public org.telegram.ui.ActionBar.g1 s3;
    public m7 t0;
    public boolean t1;
    public boolean t2;
    public org.telegram.ui.ActionBar.g1 t3;
    public fi.v3 u0;
    public boolean u1;
    public h3 u2;
    public final ch.b u3;
    public fi.v3 v0;
    public boolean v1;
    public boolean v2;
    public final hh.a v3;
    public fi.v3 w0;
    public long w1;
    public float w2;
    public final hh.d w3;
    public int x0;
    public final float x1;
    public a3 x2;
    public final fh.b x3;
    public final y9 y0;
    public int y1;
    public o60 y2;
    public TL_stories.TL_premium_boostsStatus y3;
    public final u3 z0;
    public boolean z1;
    public int z2;
    public ChannelBoostsController.CanApplyBoost z3;

    public q4(Context context, final y9 y9Var, n4 n4Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null);
        this.Q0 = true;
        this.W0 = new ArrayList();
        this.g1 = -5;
        this.x1 = 1.0f;
        o4 o4Var = new o4(this);
        this.D1 = o4Var;
        this.f2 = -1.0f;
        this.g2 = -1.0f;
        this.h2 = -1.0f;
        this.o2 = ConnectionsManager.generateClassGuid();
        this.D2 = new org.telegram.ui.Components.h6(this);
        this.E2 = new org.telegram.ui.Components.h6(this);
        cv0 cv0Var = new cv0();
        this.M2 = cv0Var;
        this.T2 = 1.0f;
        this.E3 = new c2(this, 4);
        this.G3 = new c2(this, 11);
        this.H3 = new ArrayList();
        this.I3 = new ArrayList();
        this.K3 = new a5.d(this, 19);
        this.L3 = new org.telegram.ui.Components.h6(this);
        this.M3 = new org.telegram.ui.Components.h6(this);
        this.N3 = new org.telegram.ui.Components.h6(this);
        this.P3 = new Path();
        cv0Var.E = new b6.i(this, 15);
        p4 p4Var = new p4();
        p4Var.g = new ArrayList();
        this.B2 = p4Var;
        this.C2 = new AnimationNotificationsLocker();
        this.k1 = new ArrayList();
        this.l1 = new ArrayList();
        final int i10 = 0;
        f3 f3Var = new f3(this, i10);
        this.T0 = f3Var;
        f3Var.setCrossfadeWithOldImage(false);
        f3Var.setAllowLoadingOnAttachedOnly(true);
        f3Var.ignoreNotifications = true;
        f3Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.c3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.U0 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.V0 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        f3Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.c1 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.y0 = y9Var;
        this.m1 = n4Var;
        this.E1 = n4Var.g;
        this.H1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        n4Var.l.setColor(-16777216);
        this.c2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.q0 = u6Var;
        setClipChildren(false);
        m3 m3Var = new m3(this, context, this.R0, u6Var, y9Var);
        this.Y0 = m3Var;
        fh.b bVar = new fh.b(u6Var, org.telegram.ui.ActionBar.y6.Sd, 0.8f);
        this.x3 = bVar;
        hh.c cVar = new hh.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.w3 = null;
            this.v3 = cVar;
        } else {
            hh.d dVar = new hh.d(cVar);
            this.w3 = dVar;
            dVar.d(AndroidUtilities.dp(8.0f));
            this.v3 = dVar;
        }
        jh.k kVar = new jh.k(this);
        ch.b bVar2 = new ch.b(this.v3);
        bVar2.f = kVar;
        bVar2.g = this;
        this.u3 = bVar2;
        this.a2 = bVar2.c(this, bVar, false);
        eh.d c10 = bVar2.c(this, bVar, false);
        this.b2 = c10;
        c10.A(AndroidUtilities.dp(32.0f));
        q3 q3Var = new q3(this, context, n4Var, y9Var);
        this.R0 = q3Var;
        q3Var.setClipChildren(false);
        this.Z0 = new oy(this.r2, q3Var);
        q3Var.addView(m3Var, gb1.g(-1.0f, -1));
        u3 u3Var = new u3(this, getContext(), y9Var.y, y9Var, u6Var);
        this.z0 = u3Var;
        u3Var.b0.setOnClickListener(new e2(this, 10));
        ImageView imageView = new ImageView(context);
        this.C0 = imageView;
        imageView.setImageDrawable(n4Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new e2(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        gb1.b(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(n4Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        g3 g3Var = new g3(this, getContext(), 1);
        this.E0 = g3Var;
        org.telegram.ui.Components.r6 r6Var = this.G0;
        if (r6Var != null) {
            r6Var.setCallback(g3Var);
        }
        g3Var.setWillNotDraw(false);
        g3Var.setOnClickListener(new e2(this, 12));
        g3 g3Var2 = new g3(this, getContext(), 2);
        this.s0 = g3Var2;
        org.telegram.ui.Components.r6 r6Var2 = this.F0;
        if (r6Var2 != null) {
            r6Var2.setCallback(g3Var2);
        }
        g3Var2.setWillNotDraw(false);
        g3Var2.setOnClickListener(new e2(this, 13));
        g3Var2.setOnLongClickListener(new l2(i10, this, y9Var));
        m7 m7Var = new m7(context, n4Var);
        this.t0 = m7Var;
        m7Var.setPadding(dp, dp, dp, dp);
        g3Var2.addView(this.t0, gb1.i(40, 40, 3));
        g3Var.addView(imageView2, gb1.i(40, 40, 3));
        gb1.c(g3Var2, 0.3f, 5.0f);
        gb1.c(g3Var, 0.3f, 5.0f);
        f3Var.setAllowLoadingOnAttachedOnly(true);
        f3Var.setParentView(q3Var);
        ag.w0 w0Var = new ag.w0(10);
        this.n1 = w0Var;
        q3Var.setOutlineProvider(w0Var);
        q3Var.setClipToOutline(true);
        addView(q3Var);
        m4 m4Var = new m4(context, o4Var);
        this.d1 = m4Var;
        m4Var.setOnClickListener(new View.OnClickListener(this) { // from class: di.z1
            public final /* synthetic */ q4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        q4 q4Var = this.b;
                        long j10 = UserConfig.getInstance(q4Var.r2).clientUserId;
                        long j11 = q4Var.q1;
                        y9 y9Var2 = y9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                y9Var2.H(un.ba(j11));
                                break;
                            } else {
                                y9Var2.H(ProfileActivity.t4(j11));
                                break;
                            }
                        } else {
                            Bundle g7 = b10.g(1, TeXSymbolParser.TYPE_ATTR);
                            g7.putLong("dialog_id", q4Var.q1);
                            y9Var2.H(new ta0(g7, null));
                            break;
                        }
                    default:
                        q4 q4Var2 = this.b;
                        if (!q4Var2.D1.j()) {
                            q4Var2.a1(true);
                            break;
                        } else {
                            y9Var.O();
                            if (!y9.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            q4Var2.n0.setContentDescription(LocaleController.getString(!y9.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        q3Var.addView(m4Var, gb1.h(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.D0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, gb1.u(40, 40, 5));
        linearLayout.addView(g3Var, gb1.u(40, 40, 5));
        linearLayout.addView(g3Var2, gb1.u(40, 40, 5));
        addView(linearLayout, gb1.h(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.l0 = imageView3;
        imageView3.setImageDrawable(n4Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.y6.g0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        q3Var.addView(imageView3, gb1.h(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.m0 = imageView4;
        imageView4.setImageDrawable(n4Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.y6.g0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        q3Var.addView(imageView4, gb1.h(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ai.s(y9Var, 14));
        imageView3.setOnClickListener(new e0(this, u6Var, y9Var, context, n4Var, 1));
        i4 i4Var = new i4(context, 0);
        this.n0 = i4Var;
        q3Var.addView(i4Var, gb1.h(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ak0 ak0Var = new ak0(context);
        this.o0 = ak0Var;
        ak0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        i4Var.addView(ak0Var);
        ImageView imageView5 = new ImageView(context);
        this.p0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(n4Var.t);
        i4Var.addView(imageView5);
        imageView5.setVisibility(8);
        d9 d9Var = new d9(context);
        this.r0 = d9Var;
        d9Var.setOnClickListener(new e2(this, 2));
        q3Var.addView(d9Var, gb1.h(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i11 = 1;
        i4Var.setOnClickListener(new View.OnClickListener(this) { // from class: di.z1
            public final /* synthetic */ q4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        q4 q4Var = this.b;
                        long j10 = UserConfig.getInstance(q4Var.r2).clientUserId;
                        long j11 = q4Var.q1;
                        y9 y9Var2 = y9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                y9Var2.H(un.ba(j11));
                                break;
                            } else {
                                y9Var2.H(ProfileActivity.t4(j11));
                                break;
                            }
                        } else {
                            Bundle g7 = b10.g(1, TeXSymbolParser.TYPE_ATTR);
                            g7.putLong("dialog_id", q4Var.q1);
                            y9Var2.H(new ta0(g7, null));
                            break;
                        }
                    default:
                        q4 q4Var2 = this.b;
                        if (!q4Var2.D1.j()) {
                            q4Var2.a1(true);
                            break;
                        } else {
                            y9Var.O();
                            if (!y9.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            q4Var2.n0.setContentDescription(LocaleController.getString(!y9.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.e1 = new x8(this, n4Var);
        q3Var.addView(u3Var, gb1.h(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.B0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        m2 m2Var = new m2(this, context, y9Var, y9Var.v, view, frameLayout, y9Var);
        this.A0 = m2Var;
        q3Var.addView(view, gb1.i(-1, 200, 87));
        q3Var.addView(m2Var, gb1.h(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        q3Var.addView(frameLayout, gb1.h(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int o10 = i0.a.o(-1, 100);
        i4Var.setBackground(org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, 0, o10, o10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, 0, o11, o11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.y6.j0(dp4, dp4, dp4, dp4, 0, o12, o12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int o13 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.y6.j0(dp5, dp5, dp5, dp5, 0, o13, o13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int o14 = i0.a.o(-1, 100);
        g3Var2.setBackground(org.telegram.ui.ActionBar.y6.j0(dp6, dp6, dp6, dp6, 0, o14, o14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int o15 = i0.a.o(-1, 100);
        g3Var.setBackground(org.telegram.ui.ActionBar.y6.j0(dp7, dp7, dp7, dp7, 0, o15, o15));
        org.telegram.ui.Cells.ca caVar = u3Var.W;
        View n10 = caVar.n(context);
        if (n10 != null) {
            AndroidUtilities.removeFromParent(n10);
            addView(n10);
        }
        caVar.D = new n2(this, 0);
        caVar.S(this);
    }

    public static void T0(g7 g7Var, ImageReceiver imageReceiver, String str) {
        if (g7Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(g7Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(g7Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(q4 q4Var, ValueAnimator valueAnimator) {
        d9 d9Var = q4Var.r0;
        q4Var.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m4 m4Var = q4Var.d1;
        m4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.S3);
        m4Var.setAlpha(1.0f - q4Var.S3);
        ImageView imageView = q4Var.l0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.S3);
        imageView.setAlpha(1.0f - q4Var.S3);
        ImageView imageView2 = q4Var.m0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.S3);
        imageView2.setAlpha(1.0f - q4Var.S3);
        i4 i4Var = q4Var.n0;
        i4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.S3);
        i4Var.setAlpha((1.0f - q4Var.S3) * q4Var.T2);
        g3 g3Var = q4Var.L1;
        if (g3Var != null) {
            g3Var.setTranslationY(AndroidUtilities.dp(8.0f) * q4Var.S3);
            q4Var.L1.setAlpha(1.0f - q4Var.S3);
        }
        if (d9Var != null) {
            d9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.S3);
            d9Var.setAlpha(1.0f - q4Var.S3);
        }
        q4Var.z0.setAlpha(1.0f - q4Var.S3);
        j4 j4Var = q4Var.F1;
        float f7 = j4Var == null ? 0.0f : ((p9) j4Var).d.V;
        float hideInterfaceAlpha = q4Var.getHideInterfaceAlpha();
        g3 g3Var2 = q4Var.s0;
        if (g3Var2 != null) {
            g3Var2.setAlpha((1.0f - q4Var.S3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = q4Var.C0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - q4Var.S3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        g3 g3Var3 = q4Var.E0;
        if (g3Var3 != null) {
            g3Var3.setAlpha((1.0f - q4Var.S3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        u2 u2Var = q4Var.Q1;
        if (u2Var != null) {
            u2Var.setAlpha(1.0f - q4Var.S3);
            q4Var.invalidate();
        }
        q4Var.R0.invalidate();
    }

    public static void Y(q4 q4Var, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = q4Var.s3;
        if (g1Var == null || q4Var.r3 == null || g1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(y9.B1 - 0.2f) < 0.05f) {
                q4Var.s3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(y9.B1 - 0.5f) < 0.05f) {
                q4Var.s3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(y9.B1 - 1.0f) < 0.05f) {
                q4Var.s3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(y9.B1 - 1.5f) < 0.05f) {
                q4Var.s3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(y9.B1 - 2.0f) < 0.05f) {
                q4Var.s3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                q4Var.s3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, dd.a(y9.B1) + "x"));
            }
        }
        q4Var.r3.a(y9.B1, z10);
    }

    public static void Z(q4 q4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (q4Var.G0() || q4Var.D1.f) {
            return;
        }
        if (UserConfig.getInstance(q4Var.r2).isPremium()) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, q4Var.q0).setOnClickListener(new e2(q4Var, 8));
            return;
        }
        Drawable drawable = q4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        o2 o2Var = new o2(q4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, q4Var.q0);
        c10.setOnClickListener(new e2(q4Var, 9));
        c10.setIcon(o2Var);
    }

    public static void b0(q4 q4Var) {
        o4 o4Var = q4Var.D1;
        TL_stories.StoryItem storyItem = o4Var.a;
        if ((storyItem == null && o4Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = o4Var.h();
        boolean z10 = o4Var.e;
        if (h == null || !h.exists()) {
            q4Var.Y0();
            return;
        }
        MediaController.saveFile(h.toString(), q4Var.getContext(), z10 ? 1 : 0, null, null, new bi.t8(1, q4Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c0(q4 q4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(q4Var.r2).getUser(Long.valueOf(j10));
            str = user.first_name;
            z10 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(q4Var.r2).getChat(Long.valueOf(-j10));
            str = chat2.title;
            z10 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new bi.n(q4Var, MessagesController.getInstance(q4Var.r2), j10, !z10, str, chat), 200L);
    }

    public static void d0(q4 q4Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getContext(), 0, q4Var.q0);
        alertDialog$Builder.a.R = LocaleController.getString(q4Var.G0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.T = LocaleController.getString(q4Var.G0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y1(q4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new c2.i(16));
        p9 p9Var = (p9) q4Var.F1;
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        p9Var.h(e2Var);
        e2Var.i();
    }

    public static void f0(q4 q4Var) {
        org.telegram.ui.ActionBar.u6 u6Var = q4Var.q0;
        q3 q3Var = q4Var.R0;
        if (q4Var.v1) {
            return;
        }
        int i10 = 0;
        int i11 = 1;
        if (!q4Var.t1) {
            u2 u2Var = q4Var.Q1;
            int i12 = -q4Var.g1;
            q4Var.g1 = i12;
            AndroidUtilities.shakeViewSpring(u2Var, i12);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = q4Var.q1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(q4Var.r2).getUser(Long.valueOf(q4Var.q1))) : "";
            (MessagesController.getInstance(q4Var.r2).premiumFeaturesBlocked() ? new wc(q3Var, u6Var).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new wc(q3Var, u6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new c2(q4Var, 5))).j();
            return;
        }
        if (q4Var.y3 != null && q4Var.z3 != null) {
            tg.j0.G1(new bi.v4(q4Var, i11), q4Var.y3, q4Var.z3, q4Var.q1, true);
            return;
        }
        y9 y9Var = q4Var.y0;
        if (y9Var != null) {
            y9Var.k1 = true;
            y9Var.P();
        }
        MessagesController.getInstance(q4Var.r2).getBoostsController().getBoostsStats(q4Var.q1, new f2(q4Var, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f7 = 1.0f - this.D2.c;
        b6 b6Var = this.y0.w;
        return (1.0f - (b6Var == null ? 0.0f : b6Var.f)) * f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        y9 y9Var;
        if (!this.D1.f || (y9Var = this.y0) == null || y9Var.A0 == null || B0(true)) {
            return 0L;
        }
        return y9Var.A0.j();
    }

    public static void h0(q4 q4Var) {
        o4 o4Var = q4Var.D1;
        if (o4Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = o4Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(q4Var.r2).getInputPeer(q4Var.q1);
        ConnectionsManager.getInstance(q4Var.r2).sendRequest(tL_stories_exportStoryLink, new e3());
    }

    public final void A0() {
        if (this.P2 != null) {
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
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.q0;
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        TextView textView2 = new TextView(getContext());
        gb1.b(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.y6.Sh;
        org.telegram.ui.ActionBar.f7.V(textView2, i11, u6Var);
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 30);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, o10, o10);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i11, 30);
        textView2.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView2, j02, N, h, u6Var);
        textView2.setOnClickListener(new e2(this, 3));
        linearLayout.addView(textView, gb1.r(-1, -2));
        linearLayout.addView(textView2, gb1.o(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, gb1.h(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.R0.addView(frameLayout);
        this.P2 = frameLayout;
    }

    public final boolean B0(boolean z10) {
        h1 h1Var;
        TLRPC.Peer i10;
        h1 h1Var2;
        long clientUserId = UserConfig.getInstance(this.r2).getClientUserId();
        long j10 = this.q1;
        y9 y9Var = this.y0;
        if (j10 >= 0 || (h1Var2 = y9Var.A0) == null) {
            if (j10 < 0 || y9Var == null || (h1Var = y9Var.A0) == null || !h1Var.l()) {
                return false;
            }
            return !z10 || (i10 = y9Var.A0.i()) == null || this.q1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.q1 == clientUserId;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i11 = h1Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.r2).getChat(Long.valueOf(-this.q1));
        if (y9Var.A0.l() || ChatObject.canManageCalls(chat)) {
            return i11 == null || this.q1 == DialogObject.getPeerDialogId(i11) || DialogObject.getPeerDialogId(i11) == UserConfig.getInstance(this.r2).getClientUserId();
        }
        return false;
    }

    public final void C0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        p4 p4Var = this.B2;
        org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) p4Var.e;
        if (m4Var != null && ((SurfaceView) p4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) p4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (m4Var != null && (textureView = (TextureView) p4Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        q3 q3Var = this.R0;
        canvas.scale(i10 / q3Var.getMeasuredWidth(), i11 / q3Var.getMeasuredHeight());
        this.T0.draw(canvas);
        canvas.restore();
    }

    public final void D0(fi.l9 l9Var, TL_stories.StoryItem storyItem) {
        j4 j4Var = this.F1;
        fi.n9 n9Var = new fi.n9(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.q0);
        n9Var.r1(l9Var);
        fi.h1 h1Var = n9Var.b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof fi.g9) {
                    ((fi.g9) view).e(false);
                }
            }
        }
        n9Var.l1(true);
        n9Var.T = new ai.f0(10, this, storyItem);
        ((p9) j4Var).h(n9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r3 == r10.U1) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(ViewGroup viewGroup, float f7, float f10, boolean z10) {
        fi.v3 v3Var;
        p4 p4Var;
        org.telegram.ui.m4 m4Var;
        if (viewGroup != null) {
            fi.v3 v3Var2 = this.u0;
            if ((v3Var2 == null || !v3Var2.V) && ((v3Var = this.v0) == null || !v3Var.V)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        u3 u3Var = this.z0;
                        if (childAt == u3Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f7, (int) f10)) {
                                float top = f10 - childAt.getTop();
                                o8 o8Var = u3Var.b0;
                                if (o8Var.w == 1.0f && !u3Var.s0) {
                                    if (top > o8Var.getTranslationY() + (u3Var.r0.getTop() - u3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.R0 || (p4Var = this.B2) == null || (m4Var = (org.telegram.ui.m4) p4Var.e) == null || !E0(m4Var, f7 - childAt.getX(), f10 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f7, (int) f10))) {
                            m3 m3Var = this.Y0;
                            if (childAt == m3Var && m3Var.b == null && (f7 < AndroidUtilities.dp(60.0f) || f7 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = m3Var.e;
                                float[] fArr = m3Var.f;
                                for (int i11 = 0; i11 < m3Var.getChildCount(); i11++) {
                                    View childAt2 = m3Var.getChildAt(i11);
                                    if (childAt2 != m3Var.d && (childAt2 instanceof f9)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f7;
                                        fArr[1] = f10;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                m2 m2Var = this.A0;
                                if (childAt == m2Var) {
                                    za1 za1Var = m2Var.f;
                                    bi.r1 r1Var = m2Var.c;
                                    za1 za1Var2 = m2Var.f;
                                    za1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f7 - m2Var.getX()) - za1Var2.getX()), (int) ((f10 - m2Var.getY()) - za1Var2.getY()))) {
                                        if (m2Var.f0) {
                                            continue;
                                        } else if (!this.k2) {
                                            if (f10 <= m2Var.s() + m2Var.getY() && r1Var.E(f7, (f10 - m2Var.getY()) - r1Var.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.k2) {
                                        if (childAt == this.Q1 && f10 > rect2.top) {
                                        }
                                    }
                                    if (!z10) {
                                        if (rect2.contains((int) f7, (int) f10)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            u2 u2Var = this.Q1;
                                            if (u2Var != null && childAt == u2Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && E0((ViewGroup) childAt, f7 - childAt.getX(), f10 - childAt.getY(), z10)) {
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

    public final boolean F0(MotionEvent motionEvent, View view) {
        float x9 = getX();
        q3 q3Var = this.R0;
        float x10 = view.getX() + q3Var.getX() + x9;
        float y3 = view.getY() + q3Var.getY() + getY();
        return motionEvent.getX() >= x10 && motionEvent.getX() <= x10 + ((float) view.getWidth()) && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ((float) view.getHeight());
    }

    public final boolean G0() {
        z6 z6Var;
        y9 y9Var = this.y0;
        return (y9Var == null || (z6Var = y9Var.O0) == null || z6Var.e != 4) ? false : true;
    }

    public final boolean H0() {
        TLRPC.User user;
        return G0() && (user = MessagesController.getInstance(this.r2).getUser(Long.valueOf(this.y0.O0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean I0();

    public final void J0(bh.x0 x0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        o4 o4Var = this.D1;
        TL_stories.StoryItem storyItem = o4Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && x0Var == null) {
            j0();
            this.H1.g0(this.q1, o4Var.a, null);
        } else if (x0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.r2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.e3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = bh.s0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.a3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.f3 = true;
                this.H1.g0(this.q1, o4Var.a, bh.x0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.H1.g0(this.q1, o4Var.a, x0Var);
        }
        TL_stories.StoryItem storyItem2 = o4Var.a;
        g3 g3Var = this.s0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.t0.setReaction(null);
            g3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.t0.setReaction(bh.x0.d(reaction));
            g3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.s1 && z11) {
            TL_stories.StoryItem storyItem3 = o4Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = o4Var.a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = o4Var.a;
        bh.a1.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        h1 h1Var;
        if (this.D3 != null) {
            return;
        }
        y9 y9Var = this.y0;
        if (y9Var != null && (h1Var = y9Var.A0) != null) {
            if (h1Var.v == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.r2).getSendAsPeers(this.q1, true);
        this.D3 = sendAsPeers;
        u2 u2Var = this.Q1;
        if (u2Var == null || sendAsPeers == null) {
            return;
        }
        u2Var.M1(true);
    }

    public final boolean L0() {
        u2 u2Var = this.Q1;
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

    public final void M0() {
        CharSequence charSequence;
        long j10;
        f2 f2Var;
        int i10;
        long j11;
        int i11 = 3;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.Q1.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.r2).getClientUserId();
        TLRPC.Peer i12 = this.y0.A0.i();
        if (i12 != null) {
            clientUserId = DialogObject.getPeerDialogId(i12);
        }
        Context context = getContext();
        int i13 = this.r2;
        String shortName = DialogObject.getShortName(i13, this.q1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.A3;
        f2 f2Var2 = new f2(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, (org.telegram.ui.ActionBar.u6) bVar, false);
        k3Var.fixNavigationBar();
        k3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        k3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i13).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j10 = j12;
            f2Var = f2Var2;
            i10 = ((org.telegram.ui.Components.c6[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.c6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
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
        fi.d dVar = new fi.d(context, null, true);
        v0 v0Var = new v0();
        v0Var.c = clientUserId;
        v0Var.f = textWithEntities;
        v0Var.g = jArr[0];
        q0 q0Var = new q0(i13, context, true);
        LinearLayout d = vh.d(context, 0);
        bh.r rVar = new bh.r(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        d.addView(rVar, gb1.t(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        bh.r rVar2 = new bh.r(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        d.addView(rVar2, gb1.t(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        bh.r rVar3 = new bh.r(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        d.addView(rVar3, gb1.t(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        t tVar = new t(context, bVar, r6);
        f2 f2Var3 = f2Var;
        long j13 = j11;
        Utilities.Callback[] callbackArr = {new s(jArr, dVar, new zq[1], v0Var, q0Var, i13, rVar, rVar2, rVar3, tVar, new boolean[]{true})};
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
        if (arrayList.isEmpty() || ((Integer) ic.a.g(1, arrayList)).intValue() < i18) {
            arrayList.add(Integer.valueOf(i18));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            iArr4[i21] = ((Integer) arrayList.get(i21)).intValue();
        }
        tVar.e0 = iArr4;
        tVar.setValue((int) jArr[0]);
        linearLayout.addView(tVar, gb1.o(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(d, gb1.o(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i22 = org.telegram.ui.ActionBar.y6.j5;
        TextView L = gb1.L(context, 20.0f, i22, true, bVar);
        L.setGravity(17);
        L.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(L, gb1.o(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView L2 = gb1.L(context, 14.0f, i22, false, bVar);
        L2.setGravity(17);
        vh.o(R.string.LiveStoryHighlightText, new Object[]{shortName}, L2);
        linearLayout.addView(L2, gb1.o(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(q0Var, gb1.x(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, gb1.o(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        k3Var.show();
        dVar.setOnClickListener(new bi.w0(f2Var3, jArr, k3Var, i11));
    }

    public final void N0() {
        if (this.Q1 == null) {
            return;
        }
        r0();
        this.x2.j0.f0();
        this.x2.Q1(-1, true);
        a3 a3Var = this.x2;
        a3Var.Z = this.q1;
        a3Var.v1();
        this.x2.r1().setText(this.Q1.getFieldText());
        ((p9) this.F1).h(this.x2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j10 = this.q1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.r2).getDialog(this.q1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.y0.H(new un(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(long j10) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        long j11;
        fi.b4 b4Var;
        h1 h1Var;
        boolean z10 = this.z1;
        p4 p4Var = this.B2;
        if (!z10) {
            p4Var.e = null;
            return;
        }
        o4 o4Var = this.D1;
        boolean z11 = o4Var.f;
        q3 q3Var = this.R0;
        if (!z11) {
            if (!o4Var.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): null, not a video");
                ((p9) this.F1).c(null, null, 0L, this.B2);
                p4Var.e = null;
                p4Var.a = false;
                return;
            }
            if (o4Var.f() == null || !new File(o4Var.f()).exists()) {
                TL_stories.StoryItem storyItem = o4Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.q1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = o4Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.r2).getFileReference(o4Var.a);
                            }
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(this.r2);
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
                            sb2.append(o4Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(o4Var.a.id);
                            sb2.append("&did=");
                            sb2.append(o4Var.a.dialogId);
                            Uri parse = Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb2.toString());
                            FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from " + parse);
                            this.G2 = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((p9) this.F1).c(document, uri, j10, this.B2);
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
                Uri fromFile = Uri.fromFile(new File(o4Var.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from attachPath " + fromFile);
                this.G2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): playing from null?");
            }
            ((p9) this.F1).c(document, uri, j10, this.B2);
            q3Var.invalidate();
            return;
        }
        j4 j4Var = this.F1;
        TL_stories.StoryItem storyItem3 = o4Var.a;
        long j12 = this.q1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        p9 p9Var = (p9) j4Var;
        p9Var.i(true, true);
        y9 y9Var = p9Var.d;
        h1 h1Var2 = y9Var.A0;
        if (h1Var2 == null || h1Var2.b != j12 || !h1Var2.f(inputGroupCall)) {
            fi.b4 b4Var2 = y9Var.D0;
            if (b4Var2 != null) {
                b4Var2.d(j12, null);
                fi.b4 b4Var3 = y9Var.D0;
                SurfaceViewRenderer surfaceViewRenderer = b4Var3.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = b4Var3.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                b4Var3.r = false;
                b4Var3.e(false, false);
            }
            o1 o1Var = o1.Z;
            if (o1Var.S && (h1Var = o1Var.v) != null && h1Var.f(inputGroupCall)) {
                h1 h1Var3 = o1Var.v;
                o1Var.v = null;
                y9Var.A0 = h1Var3;
                o1Var.k(false);
            } else {
                h1 h1Var4 = y9Var.A0;
                if (h1Var4 != null) {
                    if (!h1Var4.n && (!o1Var.S || o1Var.v != h1Var4)) {
                        h1Var4.e();
                    } else if (h1Var4.O != y9Var.D0.getSink()) {
                        y9Var.A0.s(null);
                    }
                    y9Var.A0 = null;
                }
            }
            if (o1Var.S) {
                o1.j();
            }
            x9 x9Var = y9Var.z0;
            if (x9Var != null) {
                x9Var.release(null);
                y9Var.z0 = null;
            }
            p4 p4Var2 = y9Var.G0;
            if (p4Var2 != null) {
                p4Var2.c = null;
                p4Var2.b = null;
                p4Var2.a = false;
                p4Var2.e = null;
                p4Var2.f = null;
                p4Var2.d = null;
                p4Var2.b();
                y9Var.G0 = null;
            }
            if (y9Var.A0 == null) {
                h1 h1Var5 = h1.W;
                if (h1Var5 == null || !h1Var5.f(inputGroupCall)) {
                    h1 h1Var6 = new h1(p9Var.c, y9Var.h, storyItem3, j12, i10, z12, inputGroupCall, false, false);
                    j11 = j12;
                    y9Var.A0 = h1Var6;
                    b4Var = y9Var.E0;
                    if (b4Var == null) {
                        y9Var.A0.s(b4Var.getSink());
                    } else {
                        y9Var.A0.s(y9Var.D0.getSink());
                    }
                    y9Var.G0 = p4Var;
                    p4Var.a = false;
                    p4Var.e = y9Var.y0;
                    fi.b4 b4Var4 = y9Var.D0;
                    p4Var.f = b4Var4.d;
                    p4Var.d = b4Var4.c;
                    p4Var.b = y9Var.A0;
                    b4Var4.d(j11, p4Var);
                    y9Var.G0.b();
                } else {
                    y9Var.A0 = h1.W;
                }
            }
            j11 = j12;
            b4Var = y9Var.E0;
            if (b4Var == null) {
            }
            y9Var.G0 = p4Var;
            p4Var.a = false;
            p4Var.e = y9Var.y0;
            fi.b4 b4Var42 = y9Var.D0;
            p4Var.f = b4Var42.d;
            p4Var.d = b4Var42.c;
            p4Var.b = y9Var.A0;
            b4Var42.d(j11, p4Var);
            y9Var.G0.b();
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
    public final void Q0(Uri uri) {
        TL_stories.StoryItem storyItem;
        Uri parse;
        String str;
        boolean z10;
        String str2;
        if (uri == null || (storyItem = this.D1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
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
                    X0();
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
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), str2, str, null, null, null, this.q1, null, null, storyItem, null, null, true, 0, null, null, false);
                return;
            } else {
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), null, null, parse, null, null, this.q1, null, null, storyItem, null, null, true, 0, null, null, false);
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

    public final void R0(long j10, boolean z10) {
        if (this.z1 != z10) {
            this.z1 = z10;
            ak0 ak0Var = this.o0;
            if (z10) {
                if (this.y0.a && Build.VERSION.SDK_INT < 33) {
                    y9 y9Var = ((p9) this.F1).d;
                    y9Var.l1 = true;
                    y9Var.P();
                    a5.d dVar = this.K3;
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 100L);
                }
                P0(j10);
                e1();
                ak0Var.setAnimation(this.m1.u);
                this.z1 = true;
                this.d1.a.getImageReceiver().setVisible(true, true);
                o4 o4Var = this.D1;
                if (o4Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.q1 + " storyId=" + o4Var.a.id + " " + o4.c(o4Var));
                }
            } else {
                n0();
                ak0Var.a();
                this.a1 = null;
                this.A2 = false;
                this.D2.d(0.0f, true);
                this.R0.invalidate();
                invalidate();
                o0();
                y9 y9Var2 = ((p9) this.F1).d;
                y9Var2.I0 = false;
                y9Var2.P();
            }
            this.T0.setFileLoadingPriority(this.z1 ? 3 : 2);
            this.U0.setFileLoadingPriority(this.z1 ? 2 : 0);
            this.V0.setFileLoadingPriority(this.z1 ? 2 : 0);
            if (this.r1 || this.s1) {
                h7 h7Var = this.H1;
                long j11 = this.q1;
                boolean z11 = this.z1;
                a0.h hVar = h7Var.m;
                ha haVar = (ha) hVar.f(j11);
                if (haVar == null) {
                    haVar = new ha(h7Var.a, j11, h7Var);
                    hVar.k(haVar, j11);
                }
                haVar.b(z11);
            }
        }
    }

    public final void S0(int i10, long j10) {
        if (this.q1 != j10) {
            o4 o4Var = this.D1;
            o4Var.b = null;
            o4Var.a = null;
        }
        this.q1 = j10;
        this.o1 = null;
        m0(i10);
        TL_stories.PeerStories peerStories = this.y0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.H1.S(peerStories, true);
            return;
        }
        h7 h7Var = this.H1;
        TL_stories.PeerStories y3 = h7Var.y(j10);
        if (y3 == null) {
            y3 = h7Var.z(j10);
        } else {
            z10 = false;
        }
        h7Var.S(y3, z10);
    }

    public final void U0(long j10, boolean z10, boolean z11) {
        if (!z10 && j10 == this.B3 && this.C3 == z11) {
            return;
        }
        this.B3 = j10;
        this.C3 = z11;
        m4 m4Var = this.d1;
        if (j10 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.r2).getChat(Long.valueOf(-j10));
            l4 l4Var = m4Var.b;
            l4 l4Var2 = m4Var.b;
            l4Var.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                l4Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            ar arVar = new ar(mutate, null);
            arVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            arVar.h = dp;
            arVar.n = dp2;
            l4Var2.i(arVar);
            return;
        }
        if (this.r1 && !z11) {
            m4Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            m4Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.r2).getUser(Long.valueOf(j10));
        if (user == null || !user.verified) {
            m4Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            ar arVar2 = new ar(mutate2, null);
            arVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            arVar2.h = dp3;
            arVar2.n = dp4;
            m4Var.b.i(arVar2);
        }
        if (user != null) {
            m4Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), m4Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            m4Var.b.l(null, false);
        }
    }

    public final void V0(float f7, float f10, v4 v4Var) {
        this.b1 = f7;
        this.p3 = 1.0f / f10;
        if (this.a1 == v4Var) {
            return;
        }
        this.a1 = v4Var;
        if (v4Var != null) {
            ImageReceiver imageReceiver = v4Var.a;
            if (imageReceiver.getBitmap() != null) {
                this.T0.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void W0(boolean z10) {
        o4 o4Var = this.D1;
        if (o4Var.a != null) {
            y9 y9Var = this.y0;
            if (y9Var.f != null) {
                String e = o4Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e);
                    LaunchActivity.I1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                d3 d3Var = new d3(this, y9Var.f.getContext(), e, e, MessagesController.getInstance(this.r2).storiesEnabled() && (!(this.s1 || UserObject.isService(this.q1)) || ChatObject.isPublic(this.s1 ? MessagesController.getInstance(this.r2).getChat(Long.valueOf(-this.q1)) : null)), new s2(2, this.q0));
                this.O2 = d3Var;
                d3Var.j0 = true;
                TL_stories.StoryItem storyItem = o4Var.a;
                storyItem.dialogId = this.q1;
                d3Var.G0 = storyItem;
                d3Var.t0 = new a4.l(this, 13);
                ((p9) this.F1).h(d3Var);
            }
        }
    }

    public final void X0() {
        q3 q3Var = this.R0;
        org.telegram.ui.ActionBar.u6 u6Var = this.q0;
        vh.n(R.string.UnsupportedAttachment, new wc(q3Var, u6Var), u6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.q0);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.T = string;
        ((p9) this.F1).h(e2Var);
    }

    public final void Z0(boolean z10) {
        if (this.h3 != z10) {
            o4 o4Var = this.D1;
            if (o4Var.a == null) {
                return;
            }
            this.h3 = z10;
            int i10 = 0;
            if (z10) {
                this.g3.setVisibility(0);
            }
            this.g3.setStoryItem(o4Var.a);
            y9 y9Var = ((p9) this.F1).d;
            y9Var.p1 = z10;
            y9Var.P();
            if (!z10) {
                if (this.g3.getReactionsWindow() != null) {
                    this.g3.getReactionsWindow().e();
                }
                this.g3.animate().alpha(0.0f).setDuration(150L).setListener(new q2(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i3, z10 ? 1.0f : 0.0f);
            this.g3.setTransitionProgress(this.i3);
            ofFloat.addUpdateListener(new d2(this, 1));
            ofFloat.addListener(new p2(this, z10, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(ds.g);
            ofFloat.start();
        }
    }

    public final void a1(boolean z10) {
        if (this.v0 == null) {
            fi.v3 v3Var = new fi.v3(getContext(), 1);
            v3Var.l(1.0f, -56.0f);
            this.v0 = v3Var;
            v3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.R0.addView(this.v0, gb1.h(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.v0.s(LocaleController.getString(z10 ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.v0.u();
    }

    public final boolean b1(boolean z10) {
        if (this.y0.R0) {
            z10 = !z10;
        }
        if (!z10) {
            int i10 = this.y1;
            if (i10 > 0) {
                this.y1 = i10 - 1;
                d1(false);
                return true;
            }
        } else if (this.y1 < getStoriesCount() - 1) {
            this.y1++;
            d1(false);
            return true;
        }
        return false;
    }

    public final void c1() {
        if (MessagesController.getInstance(this.r2).storiesEnabled()) {
            File h = this.D1.h();
            if (h == null || !h.exists()) {
                Y0();
                return;
            }
            d3 d3Var = this.O2;
            if (d3Var != null) {
                d3Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new c2(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0947, code lost:
    
        if (r4.g == (r1 == null && r1.translated && r1.translatedText != null && android.text.TextUtils.equals(r1.translatedLng, org.telegram.ui.Components.f51.L()))) goto L419;
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
    /* JADX WARN: Type inference failed for: r6v191, types: [di.k8, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v192 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(boolean z10) {
        g7 g7Var;
        TL_stories.StoryItem storyItem;
        g7 g7Var2;
        oy oyVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        f3 f3Var;
        TL_stories.StoryItem storyItem2;
        y9 y9Var;
        v9 v9Var;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        boolean z14;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z15;
        TL_stories.StoryItem storyItem4;
        g7 g7Var3;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem5;
        fi.w7 w7Var;
        TL_stories.StoryItem storyItem6;
        g7 g7Var4;
        int i12;
        fi.w7 w7Var2;
        h1 h1Var;
        boolean z16;
        q3 q3Var;
        u3 u3Var;
        m4 m4Var;
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
        m4 m4Var2;
        boolean z23;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        int i14;
        TLRPC.MessageMedia messageMedia2;
        boolean z24;
        fi.v3 v3Var;
        fi.v3 v3Var2;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem10;
        j4 j4Var;
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
        lh.h hVar;
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
        fi.v3 v3Var3;
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
        oy oyVar2;
        y9 y9Var2;
        ?? r6;
        TLRPC.MessageMedia messageMedia3;
        z6 z6Var;
        ArrayList arrayList2 = this.k1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.l1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.K2 = true;
        o4 o4Var = this.D1;
        TL_stories.StoryItem storyItem14 = o4Var.a;
        g7 g7Var9 = o4Var.b;
        String s10 = a8.s();
        this.O0 = false;
        this.R2 = false;
        int i31 = this.y1;
        boolean z54 = this.I1;
        boolean z55 = this.J1;
        boolean z56 = this.K1;
        y9 y9Var3 = this.y0;
        if (y9Var3 == null || (z6Var = y9Var3.O0) == null || z6Var.e != 4) {
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
        o4Var.c = null;
        m3 m3Var = this.Y0;
        oy oyVar3 = this.Z0;
        f3 f3Var3 = this.T0;
        if (g7Var != null) {
            fi.w7 w7Var3 = g7Var.c;
            this.J1 = false;
            boolean z57 = g7Var.I;
            this.K1 = z57;
            this.I1 = !z57;
            f3Var3.setCrossfadeWithOldImage(false);
            f3Var3.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = w7Var3.b1;
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
                oyVar2 = oyVar3;
                z11 = z54;
                z12 = z55;
                z13 = z56;
                y9Var2 = y9Var3;
                i10 = i31;
                r6 = 0;
                i11 = 4;
                f3Var.setImage(null, null, ImageLocation.getForPath(g7Var.f), s10, null, null, bitmapDrawable2, 0L, null, null, 0);
            } else {
                BitmapDrawable bitmapDrawable3 = bitmapDrawable;
                f3Var = f3Var3;
                g7Var2 = g7Var9;
                r6 = 0;
                oyVar2 = oyVar3;
                z11 = z54;
                z13 = z56;
                z12 = z55;
                i11 = 4;
                y9Var2 = y9Var3;
                i10 = i31;
                f3Var.setImage(null, null, ImageLocation.getForPath(g7Var.e), s10, null, null, bitmapDrawable3, 0L, null, null, 0);
            }
            o4Var.b = g7Var;
            o4Var.j = r6;
            o4Var.i = r6;
            o4Var.a = r6;
            o4Var.d = false;
            o4Var.e = o4Var.m();
            TL_stories.StoryItem storyItem17 = o4Var.a;
            o4Var.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            oyVar = oyVar2;
            m3Var.c(r6, c9.a(w7Var3), oyVar);
            this.J2 = false;
            this.I2 = false;
            this.H2 = false;
            y9 y9Var4 = y9Var2;
            storyItem2 = storyItem14;
            y9Var = y9Var4;
        } else {
            g7Var2 = g7Var9;
            oyVar = oyVar3;
            z11 = z54;
            z12 = z55;
            z13 = z56;
            i10 = i31;
            i11 = 4;
            f3Var = f3Var3;
            this.I1 = false;
            this.J1 = false;
            this.K1 = false;
            if (storyItem == null) {
                if (y9Var3 != null) {
                    y9Var3.q(true);
                    return;
                }
                return;
            }
            g7 t10 = this.H1.t(this.q1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.J1 = true;
                f3Var.setCrossfadeWithOldImage(false);
                f3Var.setCrossfadeDuration(this.X0 == null ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : 0);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    y9Var = y9Var3;
                    g7Var3 = t10;
                    f3Var.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    y9Var = y9Var3;
                    g7Var3 = t10;
                    f3Var.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                }
                o4Var.b = g7Var3;
                o4Var.j = null;
                o4Var.i = null;
                o4Var.a = null;
                o4Var.d = false;
                o4Var.e = o4Var.m();
                TL_stories.StoryItem storyItem18 = o4Var.a;
                o4Var.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                m3Var.c(null, c9.a(g7Var3.c), oyVar);
                o4Var.c = storyItem;
                this.J2 = false;
                this.I2 = false;
                this.H2 = false;
            } else {
                storyItem2 = storyItem14;
                y9Var = y9Var3;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.q1;
                f3Var.setCrossfadeWithOldImage(z12);
                f3Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.R2 = true;
                    MessagesController.getInstance(this.r2).getStoriesController().p(storyItem.id, this.q1);
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
                            f3Var.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), b10.u(s10, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
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
                        Drawable drawable = ((y9Var.O0 != null || y9Var.N0) && (v9Var = y9Var.s0) != null && (imageReceiver = v9Var.c) != null && v9Var.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.q1;
                        if (z58) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String u10 = b10.u(s10, "_pframe");
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
                storyItem3.dialogId = this.q1;
                m3Var.d(z10 ? null : storyItem3, oyVar);
                o4Var.n(storyItem3);
                boolean z59 = (this.R2 || (storyItem4 = o4Var.a) == null || (storyItem4 instanceof TL_stories.TL_storyItemDeleted) || (storyItem4 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.J2 = z59;
                this.H2 = z59;
                if (z59) {
                    this.H2 = o4Var.d() && o4Var.a.isPublic;
                }
                if (this.H2) {
                    TL_stories.StoryItem storyItem20 = o4Var.a;
                    this.H2 = storyItem20.pinned || !a8.w(this.r2, storyItem20);
                }
                boolean z60 = this.H2;
                this.I2 = z60;
                if (z60 && this.s1) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.r2).getChat(Long.valueOf(-this.q1));
                    this.I2 = chat != null && ChatObject.isPublic(chat);
                }
                if (this.J2) {
                    if (this.s1) {
                        TLRPC.Chat chat2 = MessagesController.getInstance(this.r2).getChat(Long.valueOf(-this.q1));
                        this.J2 = (chat2 == null || ChatObject.getPublicUsername(chat2) == null) ? false : true;
                    } else {
                        TLRPC.User user = MessagesController.getInstance(this.r2).getUser(Long.valueOf(this.q1));
                        this.J2 = (user == null || UserObject.getPublicUsername(user) == null || !o4Var.a.isPublic) ? false : true;
                    }
                }
                NotificationsController.getInstance(this.r2).processReadStories(this.q1, storyItem3.id);
                storyItem5 = o4Var.a;
                if (storyItem5 != null && !z10) {
                    y9Var.P0 = storyItem5.id;
                }
                y9Var.n0.A();
                this.N2 = true;
                if (!this.r1 || this.s1) {
                    i1(false);
                }
                TL_stories.StoryItem storyItem21 = o4Var.a;
                g7 g7Var10 = o4Var.b;
                int i32 = storyItem21 == null ? storyItem21.id : (g7Var10 == null || (w7Var = g7Var10.c) == null) ? 0 : w7Var.f;
                if (storyItem2 == null) {
                    storyItem6 = storyItem2;
                    i12 = storyItem6.id;
                    g7Var4 = g7Var2;
                } else {
                    storyItem6 = storyItem2;
                    g7Var4 = g7Var2;
                    i12 = (g7Var2 == null || (w7Var2 = g7Var4.c) == null) ? 0 : w7Var2.f;
                }
                boolean z61 = (i32 == i12 && (g7Var4 == null || storyItem21 == null || !TextUtils.equals(g7Var4.e, storyItem21.attachPath))) ? false : true;
                boolean z62 = (z61 || (this.J1 == z14 && this.I1 == z11 && this.K1 == z13)) ? false : true;
                h1Var = y9Var.A0;
                if (h1Var != null) {
                    int i33 = this.F3;
                    TLRPC.GroupCall groupCall = h1Var.v;
                    if (i33 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                        z16 = true;
                        q3Var = this.R0;
                        u3Var = this.z0;
                        m4Var = this.d1;
                        if ((g7Var4 != null || (str = g7Var4.e) == null || !str.equals(o4Var.f())) && (storyItem6 == null || (storyItem7 = o4Var.a) == null || storyItem6.id != storyItem7.id)) {
                            u2Var = this.Q1;
                            if (u2Var != null) {
                                if (storyItem6 != null && !TextUtils.isEmpty(u2Var.getEditField().getText())) {
                                    y9.J(storyItem6.dialogId, storyItem6, this.Q1.getEditField().getText());
                                }
                                this.Q1.getEditField().setText(y9.u(this.q1, o4Var.a));
                                z19 = o4Var.f;
                                if (z19) {
                                    z17 = false;
                                    this.Q1.S0(false, false, false);
                                } else {
                                    z17 = false;
                                    this.Q1.S0(true, true, false);
                                }
                            } else {
                                z17 = false;
                            }
                            z18 = o4Var.f;
                            if (z18) {
                                K0();
                            }
                            oyVar.c();
                            this.L0 = 0L;
                            this.N0 = z17;
                            g7Var5 = o4Var.b;
                            if (g7Var5 != null) {
                                bk0 bk0Var = m4Var.d;
                                if (bk0Var != null) {
                                    bk0Var.e(g7Var5.h, z17);
                                }
                                m4Var.a.invalidate();
                            } else if (!z62) {
                                m4Var.h = 0.0f;
                            }
                            qcVar = qc.x;
                            if (qcVar != null && qcVar.h == q3Var) {
                                qcVar.b();
                            }
                            u3Var.J();
                            o0();
                            z16 = true;
                        }
                        if (!z16 || (g7Var4 != null && o4Var.b == null)) {
                            m4Var.setOnSubtitleClick(null);
                            TextView[] textViewArr = m4Var.c;
                            this.F3 = 0;
                            z20 = z61;
                            i13 = 2;
                            long j10 = this.q1;
                            boolean z63 = z62;
                            z21 = o4Var.f;
                            U0(j10, false, z21);
                            g7Var6 = o4Var.b;
                            if (g7Var6 != null) {
                                charSequence3 = g7Var6.I ? LocaleController.getString(R.string.FailedToUploadStory) : a8.u(textViewArr[0], this.J1);
                            } else {
                                if (G0()) {
                                    TL_stories.StoryItem storyItem22 = o4Var.a;
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
                                    m4Var2 = m4Var;
                                    z23 = z63;
                                    charSequence = "";
                                } else {
                                    TL_stories.StoryItem storyItem23 = o4Var.a;
                                    if (storyItem23 == null) {
                                        z22 = z16;
                                        f3Var2 = f3Var;
                                        q3Var2 = q3Var;
                                        u3Var2 = u3Var;
                                        m4Var2 = m4Var;
                                        z23 = z63;
                                        charSequence = null;
                                    } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                                        spannableStringBuilder.setSpan(new i3(), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        h1 h1Var4 = y9Var.A0;
                                        if (h1Var4 != null) {
                                            TLRPC.GroupCall groupCall2 = h1Var4.v;
                                            i14 = 1;
                                            this.F3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                                        } else {
                                            i14 = 1;
                                        }
                                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i14, this.F3)));
                                        charSequence3 = spannableStringBuilder;
                                    } else if (storyItem23.date == -1) {
                                        charSequence3 = LocaleController.getString(R.string.CachedStory);
                                    } else {
                                        if (o4Var.i() != null) {
                                            k8 i34 = o4Var.i();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            z22 = z16;
                                            f3Var2 = f3Var;
                                            SpannableString spannableString = new SpannableString("r");
                                            q3Var2 = q3Var;
                                            u3Var2 = u3Var;
                                            spannableString.setSpan(new zq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) spannableString).append((CharSequence) " ");
                                            if (i34.b != null) {
                                                org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(textViewArr[0], 15.0f, this.r2);
                                                SpannableString spannableString2 = new SpannableString("a");
                                                spannableString2.setSpan(j5Var, 0, 1, 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                                if (i34.b.longValue() > 0) {
                                                    TLRPC.User user2 = MessagesController.getInstance(this.r2).getUser(i34.b);
                                                    j5Var.e(user2);
                                                    spannableStringBuilder2.append((CharSequence) UserObject.getUserName(user2));
                                                } else {
                                                    TLRPC.Chat chat3 = MessagesController.getInstance(this.r2).getChat(Long.valueOf(-i34.b.longValue()));
                                                    j5Var.b(chat3);
                                                    if (chat3 != null) {
                                                        spannableStringBuilder2.append((CharSequence) chat3.title);
                                                    }
                                                }
                                            } else {
                                                String str4 = o4Var.a.fwd_from.from_name;
                                                if (str4 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str4);
                                                }
                                            }
                                            m4Var.setOnSubtitleClick(new bi.q(11, this, i34));
                                            SpannableString spannableString3 = new SpannableString(".");
                                            nt ntVar = new nt();
                                            ntVar.b = AndroidUtilities.dp(1.5f);
                                            ntVar.c = 5.0f;
                                            spannableString3.setSpan(ntVar, 0, spannableString3.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(o4Var.a.date));
                                            m4Var2 = m4Var;
                                            charSequence = spannableStringBuilder2;
                                        } else {
                                            z22 = z16;
                                            f3Var2 = f3Var;
                                            q3Var2 = q3Var;
                                            u3Var2 = u3Var;
                                            if (!this.t1 || (storyItem8 = o4Var.a) == null || storyItem8.from_id == null) {
                                                m4Var2 = m4Var;
                                                String formatStoryDate = LocaleController.formatStoryDate(o4Var.a.date);
                                                charSequence2 = formatStoryDate;
                                                if (o4Var.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                                    nt ntVar2 = new nt();
                                                    ntVar2.b = AndroidUtilities.dp(1.5f);
                                                    ntVar2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(ntVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                                    valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                                    charSequence2 = valueOf;
                                                }
                                                charSequence = charSequence2;
                                                z23 = z63;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                org.telegram.ui.j5 j5Var2 = new org.telegram.ui.j5(textViewArr[0], 15.0f, this.r2);
                                                SpannableString spannableString4 = new SpannableString("a");
                                                spannableString4.setSpan(j5Var2, 0, 1, 33);
                                                spannableStringBuilder3.append((CharSequence) spannableString4).append((CharSequence) " ");
                                                long peerDialogId = DialogObject.getPeerDialogId(o4Var.a.from_id);
                                                if (peerDialogId > 0) {
                                                    TLRPC.User user3 = MessagesController.getInstance(this.r2).getUser(Long.valueOf(peerDialogId));
                                                    j5Var2.e(user3);
                                                    spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user3));
                                                    m4Var2 = m4Var;
                                                } else {
                                                    m4Var2 = m4Var;
                                                    TLRPC.Chat chat4 = MessagesController.getInstance(this.r2).getChat(Long.valueOf(-peerDialogId));
                                                    j5Var2.b(chat4);
                                                    if (chat4 != null) {
                                                        spannableStringBuilder3.append((CharSequence) chat4.title);
                                                    }
                                                }
                                                m4Var2.setOnSubtitleClick(new a2(this, peerDialogId, 0));
                                                SpannableString spannableString5 = new SpannableString(".");
                                                nt ntVar3 = new nt();
                                                ntVar3.b = AndroidUtilities.dp(1.5f);
                                                ntVar3.c = 5.0f;
                                                spannableString5.setSpan(ntVar3, 0, spannableString5.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(o4Var.a.date));
                                                charSequence = spannableStringBuilder3;
                                            }
                                        }
                                        z23 = false;
                                    }
                                }
                                if (charSequence == null) {
                                    z6 z6Var2 = y9Var.O0;
                                    if (z6Var2 == null || (storyItem9 = o4Var.a) == null || !z6Var2.m(storyItem9.id)) {
                                        z24 = false;
                                    } else {
                                        if (!(charSequence instanceof SpannableStringBuilder)) {
                                            charSequence = new SpannableStringBuilder(charSequence);
                                        }
                                        SpannableString spannableString6 = new SpannableString("p ");
                                        z24 = false;
                                        spannableString6.setSpan(new zq(R.drawable.msg_pin_mini), 0, 1, 33);
                                        ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString6);
                                    }
                                    m4Var2.c(charSequence, z23);
                                } else {
                                    z24 = false;
                                }
                                v3Var = this.u0;
                                if (v3Var != null) {
                                    v3Var.e(z24);
                                }
                                v3Var2 = this.v0;
                                if (v3Var2 != null) {
                                    v3Var2.e(z24);
                                }
                            }
                            z22 = z16;
                            f3Var2 = f3Var;
                            q3Var2 = q3Var;
                            u3Var2 = u3Var;
                            m4Var2 = m4Var;
                            charSequence2 = charSequence3;
                            charSequence = charSequence2;
                            z23 = z63;
                            if (charSequence == null) {
                            }
                            v3Var = this.u0;
                            if (v3Var != null) {
                            }
                            v3Var2 = this.v0;
                            if (v3Var2 != null) {
                            }
                        } else {
                            z20 = z61;
                            z22 = z16;
                            f3Var2 = f3Var;
                            q3Var2 = q3Var;
                            u3Var2 = u3Var;
                            m4Var2 = m4Var;
                            i13 = 2;
                        }
                        storyItem10 = o4Var.a;
                        if (storyItem6 == storyItem10 && g7Var4 == o4Var.b) {
                        }
                        o4Var.o();
                        if ((!o4Var.g || storyItem6 != o4Var.a) && (j4Var = this.F1) != null) {
                            y9 y9Var5 = ((p9) j4Var).d;
                            y9Var5.Z0 = false;
                            y9Var5.P();
                        }
                        z25 = o4Var.f;
                        z26 = !z25 && (h1Var3 = y9Var.A0) != null && o4Var.k(h1Var3.g()) && y9Var.A0.b();
                        if (z26 != this.v1) {
                            this.v1 = z26;
                            if (z26) {
                                x0();
                            }
                            if (this.V1 != null && (this.u1 || this.v1)) {
                                f1();
                            }
                            u2 u2Var4 = this.Q1;
                            if (u2Var4 != null) {
                                if (this.u1) {
                                    z53 = o4Var.f;
                                }
                                if (!this.v1) {
                                    z52 = true;
                                    u2Var4.setEnabled(z52);
                                    z51 = true;
                                    this.Q1.M1(true);
                                }
                                z52 = false;
                                u2Var4.setEnabled(z52);
                                z51 = true;
                                this.Q1.M1(true);
                            } else {
                                z51 = true;
                            }
                            p0(z51);
                        }
                        linearLayout = this.V1;
                        if (linearLayout != null) {
                            if (this.u1) {
                                z50 = o4Var.f;
                            }
                            if (!this.v1) {
                                i30 = 8;
                                linearLayout.setVisibility(i30);
                            }
                            i30 = 0;
                            linearLayout.setVisibility(i30);
                        }
                        z27 = this.R2;
                        LinearLayout linearLayout2 = this.D0;
                        if (z27) {
                            A0();
                            y0();
                            this.P2.setVisibility(0);
                            this.Q2.setVisibility(0);
                            this.J2 = false;
                            this.I2 = false;
                            this.H2 = false;
                            u2 u2Var5 = this.Q1;
                            if (u2Var5 != null) {
                                u2Var5.setVisibility(8);
                            }
                            g3 g3Var = this.L1;
                            if (g3Var != null) {
                                g3Var.setVisibility(8);
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat chat5 = this.q1 < 0 ? MessagesController.getInstance(this.r2).getChat(Long.valueOf(-this.q1)) : null;
                            z28 = o4Var.f;
                            if (z28) {
                                if (this.Q1 == null) {
                                    t0();
                                }
                                s0();
                                w0();
                                v0();
                                this.Q1.setVisibility(0);
                            } else if ((UserObject.isService(this.q1) || G0()) && (u2Var2 = this.Q1) != null) {
                                u2Var2.setVisibility(8);
                            } else if (!this.r1 && ((!this.s1 || (this.t1 && (ChatObject.canSendPlain(chat5) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat5)))) && (u2Var3 = this.Q1) != null)) {
                                u2Var3.setVisibility(0);
                            }
                            u2 u2Var6 = this.Q1;
                            if (u2Var6 != null) {
                                z33 = o4Var.f;
                                u2Var6.setOnSendButtonLongClick(z33 ? new b2(this, 0) : null);
                                u2 u2Var7 = this.Q1;
                                z34 = o4Var.f;
                                B0(true);
                                u2Var7.f1(z34);
                                u2 u2Var8 = this.Q1;
                                z35 = o4Var.f;
                                u2Var8.l1(z35 && !B0(true) && (this.k2 || this.Q1.W0), true);
                            }
                            if (this.u1 && this.V1 == null) {
                                x0();
                            }
                            if (this.V1 != null) {
                                if (this.u1 || this.v1) {
                                    f1();
                                }
                                LinearLayout linearLayout3 = this.V1;
                                if (this.u1) {
                                    z32 = o4Var.f;
                                }
                                if (!this.v1) {
                                    i16 = 8;
                                    linearLayout3.setVisibility(i16);
                                }
                                i16 = 0;
                                linearLayout3.setVisibility(i16);
                            }
                            u2 u2Var9 = this.Q1;
                            if (u2Var9 != null) {
                                if (this.u1) {
                                    z31 = o4Var.f;
                                }
                                if (!this.v1) {
                                    z30 = true;
                                    u2Var9.setEnabled(z30);
                                }
                                z30 = false;
                                u2Var9.setEnabled(z30);
                            }
                            g3 g3Var2 = this.L1;
                            if (g3Var2 != null) {
                                if (this.r1) {
                                    z29 = o4Var.f;
                                    if (!z29) {
                                        i15 = 0;
                                        g3Var2.setVisibility(i15);
                                    }
                                }
                                i15 = 8;
                                g3Var2.setVisibility(i15);
                            }
                            FrameLayout frameLayout = this.P2;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (UserObject.isService(this.q1)) {
                                y0();
                                this.Q2.setVisibility(0);
                            } else {
                                md mdVar = this.Q2;
                                if (mdVar != null) {
                                    mdVar.setVisibility(8);
                                }
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(G0() ? 8 : 0);
                            }
                        }
                        hVar = this.R1;
                        if (hVar != null) {
                            u2 u2Var10 = this.Q1;
                            if (u2Var10 != null && u2Var10.getVisibility() == 0) {
                                z49 = o4Var.f;
                                if (!z49) {
                                    i29 = 0;
                                    hVar.setVisibility(i29);
                                }
                            }
                            i29 = 8;
                            hVar.setVisibility(i29);
                        }
                        aVar = this.M1;
                        m2 m2Var = this.A0;
                        if (aVar != null) {
                            if (!this.R2) {
                                z48 = o4Var.f;
                                if (z48) {
                                    i28 = 0;
                                    aVar.setVisibility(i28);
                                    this.M1.a(m2Var.g(), false);
                                    this.M1.setCount(m2Var.getUnreadMessagesCount());
                                }
                            }
                            i28 = 8;
                            aVar.setVisibility(i28);
                            this.M1.a(m2Var.g(), false);
                            this.M1.setCount(m2Var.getUnreadMessagesCount());
                        }
                        t1Var = this.P1;
                        if (t1Var != null) {
                            if (!this.R2) {
                                z47 = o4Var.f;
                                if (z47 && (h1Var2 = h1.W) != null && o4Var.k(h1Var2.g())) {
                                    i27 = 0;
                                    t1Var.setVisibility(i27);
                                    t1 t1Var2 = this.P1;
                                    h1 h1Var5 = h1.W;
                                    t1Var2.b(h1Var5 == null && h1Var5.o(), true);
                                    t1 t1Var3 = this.P1;
                                    h1 h1Var6 = h1.W;
                                    t1Var3.a(h1Var6 != null || h1Var6.m(), true);
                                }
                            }
                            i27 = 8;
                            t1Var.setVisibility(i27);
                            t1 t1Var22 = this.P1;
                            h1 h1Var52 = h1.W;
                            t1Var22.b(h1Var52 == null && h1Var52.o(), true);
                            t1 t1Var32 = this.P1;
                            h1 h1Var62 = h1.W;
                            t1Var32.a(h1Var62 != null || h1Var62.m(), true);
                        }
                        if (this.O1 != null) {
                            w1 w1Var = this.N1;
                            if (!this.R2) {
                                z46 = o4Var.f;
                                if (z46) {
                                    i25 = 0;
                                    w1Var.setVisibility(i25);
                                    x1 x1Var = this.O1;
                                    if (!this.R2) {
                                        z45 = o4Var.f;
                                        if (z45) {
                                            i26 = 0;
                                            x1Var.setVisibility(i26);
                                            layoutParams = (FrameLayout.LayoutParams) this.O1.getLayoutParams();
                                            t1 t1Var4 = this.P1;
                                            dp = AndroidUtilities.dp((t1Var4 == null && t1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                            if (layoutParams.rightMargin != dp) {
                                                layoutParams.rightMargin = dp;
                                                this.O1.setLayoutParams(layoutParams);
                                            }
                                        }
                                    }
                                    i26 = 8;
                                    x1Var.setVisibility(i26);
                                    layoutParams = (FrameLayout.LayoutParams) this.O1.getLayoutParams();
                                    t1 t1Var42 = this.P1;
                                    dp = AndroidUtilities.dp((t1Var42 == null && t1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != dp) {
                                    }
                                }
                            }
                            i25 = 8;
                            w1Var.setVisibility(i25);
                            x1 x1Var2 = this.O1;
                            if (!this.R2) {
                            }
                            i26 = 8;
                            x1Var2.setVisibility(i26);
                            layoutParams = (FrameLayout.LayoutParams) this.O1.getLayoutParams();
                            t1 t1Var422 = this.P1;
                            dp = AndroidUtilities.dp((t1Var422 == null && t1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != dp) {
                            }
                        }
                        z36 = o4Var.f;
                        if (!z36 || ((o4Var.h == null && o4Var.i() == null && o4Var.g() == null) || this.R2)) {
                            u3 u3Var3 = u3Var2;
                            if (this.z1) {
                                y9 y9Var6 = ((p9) this.F1).d;
                                y9Var6.L0 = false;
                                y9Var6.P();
                                j4 j4Var2 = this.F1;
                                this.Y2 = false;
                                ((p9) j4Var2).e();
                            }
                            u3Var3.setVisibility(8);
                        } else {
                            u3 u3Var4 = u3Var2;
                            u3Var4.b0.b(o4Var.h, o4Var.i(), o4Var.g(), y9Var.Z0 && !o4Var.g && (storyItem13 = o4Var.a) != null && storyItem13.translated, storyItem6 == o4Var.a);
                            u3Var4.setVisibility(0);
                        }
                        storyItem11 = o4Var.a;
                        if (storyItem11 != null) {
                            TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                            if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (m2Var.r(this.q1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                                    m2Var.q(false, false);
                                    this.A3 = 0L;
                                    u2 u2Var11 = this.Q1;
                                    if (u2Var11 != null) {
                                        u2Var11.G(true);
                                        this.Q1.O1();
                                        p0(true);
                                    }
                                }
                                m2Var.setVisibility(0);
                                q3Var2.invalidate();
                                if (this.F1 != null && I0()) {
                                    ((p9) this.F1).a(this.y1, this.q1);
                                }
                                z37 = this.s1;
                                g3 g3Var3 = this.E0;
                                ImageView imageView3 = this.C0;
                                g3 g3Var4 = this.s0;
                                if (z37) {
                                    if (this.H2) {
                                        z39 = o4Var.f;
                                        if (!z39) {
                                            i17 = 0;
                                            imageView3.setVisibility(i17);
                                            if (g3Var3 != null) {
                                                g3Var3.setVisibility(8);
                                            }
                                            if (!this.r1) {
                                                z38 = o4Var.f;
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
                                    if (!this.r1) {
                                    }
                                    i18 = 8;
                                    g3Var4.setVisibility(i18);
                                    g3Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                } else {
                                    if (this.H2) {
                                        z44 = o4Var.f;
                                        if (!z44) {
                                            i22 = 0;
                                            imageView3.setVisibility(i22);
                                            if (g3Var3 != null) {
                                                if (this.I2) {
                                                    z43 = o4Var.f;
                                                    if (!z43) {
                                                        i24 = 0;
                                                        g3Var3.setVisibility(i24);
                                                    }
                                                }
                                                i24 = 8;
                                                g3Var3.setVisibility(i24);
                                            }
                                            if (!this.K1) {
                                                z42 = o4Var.f;
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
                                    if (!this.K1) {
                                    }
                                    i23 = 8;
                                    g3Var4.setVisibility(i23);
                                }
                                g3Var4.requestLayout();
                                y9Var.e1.append(this.q1, i10);
                                if (this.z1) {
                                    P0(0L);
                                    e1();
                                    f3Var2.bumpPriority();
                                }
                                m2Var.setLivePlayer(y9Var.A0);
                                this.A1 = 0;
                                if (y9Var.O0 != null && (storyItem12 = o4Var.a) != null) {
                                    int i35 = storyItem12.id;
                                    i21 = 0;
                                    while (true) {
                                        if (i21 < y9Var.O0.i.size()) {
                                            MessageObject messageObject = (MessageObject) y9Var.O0.i.get(i21);
                                            if (messageObject != null && messageObject.getId() == i35) {
                                                this.A1 = i21;
                                                break;
                                            }
                                            i21++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                int i36 = this.y1;
                                this.B1 = i36;
                                int i37 = this.p1;
                                this.C1 = i37;
                                if (y9Var.R0) {
                                    this.B1 = (i37 - 1) - i36;
                                }
                                l4 = o4Var.l();
                                i4 i4Var = this.n0;
                                if (l4) {
                                    i4Var.setVisibility(8);
                                } else {
                                    i4Var.setVisibility(0);
                                    this.T2 = o4Var.j() ? 1.0f : 0.5f;
                                    boolean j11 = o4Var.j();
                                    ImageView imageView4 = this.p0;
                                    ak0 ak0Var = this.o0;
                                    if (j11) {
                                        ak0Var.setVisibility(0);
                                        imageView4.setVisibility(8);
                                        i4Var.setContentDescription(LocaleController.getString(!y9.D1 ? R.string.Mute : R.string.Unmute));
                                    } else {
                                        ak0Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        i4Var.setContentDescription(LocaleController.getString(R.string.NoSound));
                                    }
                                    i4Var.setAlpha((1.0f - this.S3) * this.T2);
                                }
                                g7Var7 = o4Var.b;
                                d9 d9Var = this.r0;
                                if (g7Var7 == null) {
                                    d9Var.a(this.r1, g7Var7, z20 && this.Q3);
                                } else {
                                    TL_stories.StoryItem storyItem24 = o4Var.a;
                                    if (storyItem24 != null) {
                                        d9Var.b(this.r1, storyItem24, z20 && this.Q3);
                                    } else {
                                        d9Var.b(this.r1, null, z20 && this.Q3);
                                    }
                                }
                                this.Q3 = false;
                                d9Var.setTranslationX(i4Var.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                                if (z22) {
                                    this.f3 = false;
                                    TL_stories.StoryItem storyItem25 = o4Var.a;
                                    if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                        this.t0.setReaction(null);
                                    } else {
                                        this.t0.setReaction(bh.x0.d(reaction));
                                    }
                                }
                                g7Var8 = o4Var.b;
                                if (g7Var8 == null && g7Var8.I) {
                                    u0();
                                    this.Y1.set(o4Var.b.c.x);
                                    this.Y1.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.Z1;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.Z1 = null;
                                    }
                                    if (z20) {
                                        ViewPropertyAnimator interpolator = this.Y1.animate().alpha(1.0f).setDuration(180L).setInterpolator(ds.h);
                                        this.Z1 = interpolator;
                                        interpolator.start();
                                    } else {
                                        this.Y1.setAlpha(1.0f);
                                    }
                                } else if (this.Y1 != null) {
                                    ViewPropertyAnimator viewPropertyAnimator2 = this.Z1;
                                    if (viewPropertyAnimator2 != null) {
                                        viewPropertyAnimator2.cancel();
                                        this.Z1 = null;
                                    }
                                    if (z20 && this.Y1.getVisibility() == 0) {
                                        ViewPropertyAnimator withEndAction = this.Y1.animate().alpha(0.0f).setDuration(180L).setInterpolator(ds.h).withEndAction(new c2(this, 0));
                                        this.Z1 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.Y1.setAlpha(0.0f);
                                        this.Y1.setVisibility(8);
                                    }
                                }
                                this.m1.a(y9.D1, false);
                                if (this.z1 && o4Var.a != null) {
                                    FileLog.d("StoryViewer displayed story dialogId=" + this.q1 + " storyId=" + o4Var.a.id + " " + o4.c(o4Var));
                                }
                                if (this.r1) {
                                    t5.f(this.r2, this.q1, o4Var.a);
                                }
                                l4 l4Var = m4Var2.b;
                                z6 z6Var3 = y9Var.O0;
                                l4Var.setPadding(0, 0, (z6Var3 != null || z6Var3.g() == this.C1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                                MessagesController.getInstance(this.r2).getTranslateController().detectStoryLanguage(o4Var.a);
                                if (!z10 && !this.r1 && this.o3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                                    c2 c2Var = new c2(this, 1);
                                    this.o3 = c2Var;
                                    AndroidUtilities.runOnUIThread(c2Var, 500L);
                                }
                                v3Var3 = this.v0;
                                if (!(v3Var3 == null && v3Var3.V) && o4Var.j() && y9.D1) {
                                    i19 = 0;
                                    if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < i13) {
                                        AndroidUtilities.cancelRunOnUIThread(this.G3);
                                        AndroidUtilities.runOnUIThread(this.G3, 250L);
                                    }
                                } else {
                                    i19 = 0;
                                }
                                imageView = this.l0;
                                if (imageView != null) {
                                    if (G0() && !H0()) {
                                        z41 = o4Var.e;
                                        if (!z41) {
                                            i20 = 8;
                                            imageView.setVisibility(i20);
                                        }
                                    }
                                    i20 = i19;
                                    imageView.setVisibility(i20);
                                }
                                imageView2 = this.m0;
                                if (imageView2 == null) {
                                    z40 = o4Var.f;
                                    imageView2.setVisibility((!z40 || d9Var.f) ? 8 : i19);
                                    return;
                                }
                                return;
                            }
                        }
                        m2Var.r(this.q1, null);
                        m2Var.setVisibility(8);
                        q3Var2.invalidate();
                        if (this.F1 != null) {
                            ((p9) this.F1).a(this.y1, this.q1);
                        }
                        z37 = this.s1;
                        g3 g3Var32 = this.E0;
                        ImageView imageView32 = this.C0;
                        g3 g3Var42 = this.s0;
                        if (z37) {
                        }
                        g3Var42.requestLayout();
                        y9Var.e1.append(this.q1, i10);
                        if (this.z1) {
                        }
                        m2Var.setLivePlayer(y9Var.A0);
                        this.A1 = 0;
                        if (y9Var.O0 != null) {
                            int i352 = storyItem12.id;
                            i21 = 0;
                            while (true) {
                                if (i21 < y9Var.O0.i.size()) {
                                }
                                i21++;
                            }
                        }
                        int i362 = this.y1;
                        this.B1 = i362;
                        int i372 = this.p1;
                        this.C1 = i372;
                        if (y9Var.R0) {
                        }
                        l4 = o4Var.l();
                        i4 i4Var2 = this.n0;
                        if (l4) {
                        }
                        g7Var7 = o4Var.b;
                        d9 d9Var2 = this.r0;
                        if (g7Var7 == null) {
                        }
                        this.Q3 = false;
                        d9Var2.setTranslationX(i4Var2.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z22) {
                        }
                        g7Var8 = o4Var.b;
                        if (g7Var8 == null) {
                        }
                        if (this.Y1 != null) {
                        }
                        this.m1.a(y9.D1, false);
                        if (this.z1) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.q1 + " storyId=" + o4Var.a.id + " " + o4.c(o4Var));
                        }
                        if (this.r1) {
                        }
                        l4 l4Var2 = m4Var2.b;
                        z6 z6Var32 = y9Var.O0;
                        l4Var2.setPadding(0, 0, (z6Var32 != null || z6Var32.g() == this.C1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.r2).getTranslateController().detectStoryLanguage(o4Var.a);
                        if (!z10) {
                            c2 c2Var2 = new c2(this, 1);
                            this.o3 = c2Var2;
                            AndroidUtilities.runOnUIThread(c2Var2, 500L);
                        }
                        v3Var3 = this.v0;
                        if (v3Var3 == null) {
                        }
                        i19 = 0;
                        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < i13) {
                        }
                        imageView = this.l0;
                        if (imageView != null) {
                        }
                        imageView2 = this.m0;
                        if (imageView2 == null) {
                        }
                    }
                }
                z16 = false;
                q3Var = this.R0;
                u3Var = this.z0;
                m4Var = this.d1;
                if (g7Var4 != null) {
                }
                u2Var = this.Q1;
                if (u2Var != null) {
                }
                z18 = o4Var.f;
                if (z18) {
                }
                oyVar.c();
                this.L0 = 0L;
                this.N0 = z17;
                g7Var5 = o4Var.b;
                if (g7Var5 != null) {
                }
                qcVar = qc.x;
                if (qcVar != null) {
                    qcVar.b();
                }
                u3Var.J();
                o0();
                z16 = true;
                if (z16) {
                }
                m4Var.setOnSubtitleClick(null);
                TextView[] textViewArr2 = m4Var.c;
                this.F3 = 0;
                z20 = z61;
                i13 = 2;
                long j102 = this.q1;
                boolean z632 = z62;
                z21 = o4Var.f;
                U0(j102, false, z21);
                g7Var6 = o4Var.b;
                if (g7Var6 != null) {
                }
                z22 = z16;
                f3Var2 = f3Var;
                q3Var2 = q3Var;
                u3Var2 = u3Var;
                m4Var2 = m4Var;
                charSequence2 = charSequence3;
                charSequence = charSequence2;
                z23 = z632;
                if (charSequence == null) {
                }
                v3Var = this.u0;
                if (v3Var != null) {
                }
                v3Var2 = this.v0;
                if (v3Var2 != null) {
                }
                storyItem10 = o4Var.a;
                if (storyItem6 == storyItem10) {
                }
                o4Var.o();
                if (!o4Var.g) {
                }
                y9 y9Var52 = ((p9) j4Var).d;
                y9Var52.Z0 = false;
                y9Var52.P();
                z25 = o4Var.f;
                if (z25) {
                }
                if (z26 != this.v1) {
                }
                linearLayout = this.V1;
                if (linearLayout != null) {
                }
                z27 = this.R2;
                LinearLayout linearLayout22 = this.D0;
                if (z27) {
                }
                hVar = this.R1;
                if (hVar != null) {
                }
                aVar = this.M1;
                m2 m2Var2 = this.A0;
                if (aVar != null) {
                }
                t1Var = this.P1;
                if (t1Var != null) {
                }
                if (this.O1 != null) {
                }
                z36 = o4Var.f;
                if (z36) {
                }
                u3 u3Var32 = u3Var2;
                if (this.z1) {
                }
                u3Var32.setVisibility(8);
                storyItem11 = o4Var.a;
                if (storyItem11 != null) {
                }
                m2Var2.r(this.q1, null);
                m2Var2.setVisibility(8);
                q3Var2.invalidate();
                if (this.F1 != null) {
                }
                z37 = this.s1;
                g3 g3Var322 = this.E0;
                ImageView imageView322 = this.C0;
                g3 g3Var422 = this.s0;
                if (z37) {
                }
                g3Var422.requestLayout();
                y9Var.e1.append(this.q1, i10);
                if (this.z1) {
                }
                m2Var2.setLivePlayer(y9Var.A0);
                this.A1 = 0;
                if (y9Var.O0 != null) {
                }
                int i3622 = this.y1;
                this.B1 = i3622;
                int i3722 = this.p1;
                this.C1 = i3722;
                if (y9Var.R0) {
                }
                l4 = o4Var.l();
                i4 i4Var22 = this.n0;
                if (l4) {
                }
                g7Var7 = o4Var.b;
                d9 d9Var22 = this.r0;
                if (g7Var7 == null) {
                }
                this.Q3 = false;
                d9Var22.setTranslationX(i4Var22.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z22) {
                }
                g7Var8 = o4Var.b;
                if (g7Var8 == null) {
                }
                if (this.Y1 != null) {
                }
                this.m1.a(y9.D1, false);
                if (this.z1) {
                }
                if (this.r1) {
                }
                l4 l4Var22 = m4Var2.b;
                z6 z6Var322 = y9Var.O0;
                l4Var22.setPadding(0, 0, (z6Var322 != null || z6Var322.g() == this.C1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.r2).getTranslateController().detectStoryLanguage(o4Var.a);
                if (!z10) {
                }
                v3Var3 = this.v0;
                if (v3Var3 == null) {
                }
                i19 = 0;
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < i13) {
                }
                imageView = this.l0;
                if (imageView != null) {
                }
                imageView2 = this.m0;
                if (imageView2 == null) {
                }
            }
        }
        z14 = z12;
        storyItem5 = o4Var.a;
        if (storyItem5 != null) {
            y9Var.P0 = storyItem5.id;
        }
        y9Var.n0.A();
        this.N2 = true;
        if (!this.r1) {
        }
        i1(false);
        TL_stories.StoryItem storyItem212 = o4Var.a;
        g7 g7Var102 = o4Var.b;
        if (storyItem212 == null) {
        }
        if (storyItem2 == null) {
        }
        if (i32 == i12) {
        }
        if (z61) {
        }
        h1Var = y9Var.A0;
        if (h1Var != null) {
        }
        z16 = false;
        q3Var = this.R0;
        u3Var = this.z0;
        m4Var = this.d1;
        if (g7Var4 != null) {
        }
        u2Var = this.Q1;
        if (u2Var != null) {
        }
        z18 = o4Var.f;
        if (z18) {
        }
        oyVar.c();
        this.L0 = 0L;
        this.N0 = z17;
        g7Var5 = o4Var.b;
        if (g7Var5 != null) {
        }
        qcVar = qc.x;
        if (qcVar != null) {
        }
        u3Var.J();
        o0();
        z16 = true;
        if (z16) {
        }
        m4Var.setOnSubtitleClick(null);
        TextView[] textViewArr22 = m4Var.c;
        this.F3 = 0;
        z20 = z61;
        i13 = 2;
        long j1022 = this.q1;
        boolean z6322 = z62;
        z21 = o4Var.f;
        U0(j1022, false, z21);
        g7Var6 = o4Var.b;
        if (g7Var6 != null) {
        }
        z22 = z16;
        f3Var2 = f3Var;
        q3Var2 = q3Var;
        u3Var2 = u3Var;
        m4Var2 = m4Var;
        charSequence2 = charSequence3;
        charSequence = charSequence2;
        z23 = z6322;
        if (charSequence == null) {
        }
        v3Var = this.u0;
        if (v3Var != null) {
        }
        v3Var2 = this.v0;
        if (v3Var2 != null) {
        }
        storyItem10 = o4Var.a;
        if (storyItem6 == storyItem10) {
        }
        o4Var.o();
        if (!o4Var.g) {
        }
        y9 y9Var522 = ((p9) j4Var).d;
        y9Var522.Z0 = false;
        y9Var522.P();
        z25 = o4Var.f;
        if (z25) {
        }
        if (z26 != this.v1) {
        }
        linearLayout = this.V1;
        if (linearLayout != null) {
        }
        z27 = this.R2;
        LinearLayout linearLayout222 = this.D0;
        if (z27) {
        }
        hVar = this.R1;
        if (hVar != null) {
        }
        aVar = this.M1;
        m2 m2Var22 = this.A0;
        if (aVar != null) {
        }
        t1Var = this.P1;
        if (t1Var != null) {
        }
        if (this.O1 != null) {
        }
        z36 = o4Var.f;
        if (z36) {
        }
        u3 u3Var322 = u3Var2;
        if (this.z1) {
        }
        u3Var322.setVisibility(8);
        storyItem11 = o4Var.a;
        if (storyItem11 != null) {
        }
        m2Var22.r(this.q1, null);
        m2Var22.setVisibility(8);
        q3Var2.invalidate();
        if (this.F1 != null) {
        }
        z37 = this.s1;
        g3 g3Var3222 = this.E0;
        ImageView imageView3222 = this.C0;
        g3 g3Var4222 = this.s0;
        if (z37) {
        }
        g3Var4222.requestLayout();
        y9Var.e1.append(this.q1, i10);
        if (this.z1) {
        }
        m2Var22.setLivePlayer(y9Var.A0);
        this.A1 = 0;
        if (y9Var.O0 != null) {
        }
        int i36222 = this.y1;
        this.B1 = i36222;
        int i37222 = this.p1;
        this.C1 = i37222;
        if (y9Var.R0) {
        }
        l4 = o4Var.l();
        i4 i4Var222 = this.n0;
        if (l4) {
        }
        g7Var7 = o4Var.b;
        d9 d9Var222 = this.r0;
        if (g7Var7 == null) {
        }
        this.Q3 = false;
        d9Var222.setTranslationX(i4Var222.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z22) {
        }
        g7Var8 = o4Var.b;
        if (g7Var8 == null) {
        }
        if (this.Y1 != null) {
        }
        this.m1.a(y9.D1, false);
        if (this.z1) {
        }
        if (this.r1) {
        }
        l4 l4Var222 = m4Var2.b;
        z6 z6Var3222 = y9Var.O0;
        l4Var222.setPadding(0, 0, (z6Var3222 != null || z6Var3222.g() == this.C1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.r2).getTranslateController().detectStoryLanguage(o4Var.a);
        if (!z10) {
        }
        v3Var3 = this.v0;
        if (v3Var3 == null) {
        }
        i19 = 0;
        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < i13) {
        }
        imageView = this.l0;
        if (imageView != null) {
        }
        imageView2 = this.m0;
        if (imageView2 == null) {
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h1 h1Var;
        int i12 = NotificationCenter.storiesUpdated;
        y9 y9Var = this.y0;
        boolean z10 = false;
        if (i10 == i12 || (i10 == NotificationCenter.storiesListUpdated && y9Var.O0 == objArr[0])) {
            j4 j4Var = this.F1;
            if (j4Var == null || !((p9) j4Var).d.H0) {
                if (this.z1) {
                    h1();
                    if (this.p1 == 0) {
                        if (this.t2) {
                            return;
                        }
                        this.t2 = true;
                        ((p9) this.F1).j();
                        return;
                    }
                    int i13 = this.y1;
                    ArrayList arrayList = this.k1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.l1;
                    if (i13 >= arrayList2.size() + size) {
                        this.y1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    d1(false);
                    if (this.r1 || this.s1) {
                        i1(true);
                    }
                }
                TL_stories.PeerStories peerStories = y9Var.Q0;
                if (peerStories != null) {
                    this.H1.S(peerStories, true);
                } else {
                    long j10 = this.q1;
                    if (j10 != 0) {
                        h7 h7Var = this.H1;
                        TL_stories.PeerStories y3 = h7Var.y(j10);
                        if (y3 == null) {
                            y3 = h7Var.z(j10);
                            z10 = true;
                        }
                        h7Var.S(y3, z10);
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.h1;
                if (g1Var != null) {
                    g1Var.animate().alpha((this.H1.K(this.q1) && this.D1.e && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storyQualityUpdate) {
            d1(false);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            this.z0.b0.invalidate();
            return;
        }
        if (i10 == NotificationCenter.stealthModeChanged) {
            p0(true);
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            b7 o10 = MessagesController.getInstance(this.r2).getStoriesController().o();
            if (o10 == null || !o10.a(this.r2, 1) || this.F1 == null) {
                return;
            }
            bi.v4 v4Var = new bi.v4(this, 1);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.I1;
            }
            ((p9) this.F1).h(new tg.j0(o10.b(), this.r2, findActivity, v4Var, null));
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.r2).isUserContactBlocked(this.q1);
            boolean z11 = this.q1 >= 0 && !UserConfig.getInstance(this.r2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            if (this.u1 == z11 && this.w1 == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                return;
            }
            this.u1 = z11;
            this.w1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            d1(false);
            p0(true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.q1 == (-((TLRPC.ChatFull) obj).id)) {
                d1(false);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.liveStoryUpdated) {
            if (i10 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (y9Var == null || (h1Var = y9Var.A0) == null || h1Var.g() != longValue) {
            return;
        }
        d1(false);
        u2 u2Var = this.Q1;
        if (u2Var != null) {
            u2Var.G(true);
            this.Q1.M1(true);
            p0(true);
        }
        m2 m2Var = this.A0;
        if (m2Var != null) {
            h1 h1Var2 = m2Var.P;
            if (m2Var.H != (h1Var2 != null ? h1Var2.j() : 0L)) {
                m2Var.e.O(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ke keVar;
        Canvas canvas2;
        org.telegram.ui.Components.r6 r6Var;
        org.telegram.ui.Components.r6 r6Var2;
        j1();
        if (this.s1 && (r6Var2 = this.F0) != null) {
            r6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.s1 && (r6Var = this.G0) != null) {
            r6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.j3;
        LinearLayout linearLayout = this.D0;
        g3 g3Var = this.s0;
        if (z10) {
            float measuredWidth = (g3Var.getMeasuredWidth() / 2.0f) + g3Var.getX() + linearLayout.getX();
            float measuredHeight = (g3Var.getMeasuredHeight() / 2.0f) + g3Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.l3, measuredWidth - f7, ds.g.getInterpolation(this.k3));
            float lerp2 = AndroidUtilities.lerp(this.m3, measuredHeight - f7, this.k3);
            int lerp3 = AndroidUtilities.lerp(this.n3, dp, this.k3);
            if (this.e3) {
                org.telegram.ui.Components.t5 t5Var = this.d3;
                if (t5Var != null) {
                    float f10 = lerp3;
                    t5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.d3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.c3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f3) {
            float measuredWidth2 = (g3Var.getMeasuredWidth() / 2.0f) + g3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (g3Var.getMeasuredHeight() / 2.0f) + g3Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (this.e3) {
                bh.e eVar = this.b3;
                if (eVar != null) {
                    float f12 = dp2 / 2.0f;
                    eVar.e((int) (measuredWidth2 - f12), (int) (measuredHeight2 - f12), (int) (measuredWidth2 + f12), (int) (measuredHeight2 + f12));
                    this.b3.b(canvas);
                    if (this.b3.c()) {
                        this.b3.d(this);
                        this.b3 = null;
                        this.f3 = false;
                    }
                } else {
                    this.f3 = false;
                }
            } else {
                float f13 = dp2;
                float f14 = f13 / 2.0f;
                float f15 = measuredWidth2 - f14;
                float f16 = measuredHeight2 - f14;
                ImageReceiver imageReceiver2 = this.a3;
                imageReceiver2.setImageCoords(f15, f16, f13, f13);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().A()) {
                    this.f3 = false;
                }
            }
        }
        u2 u2Var = this.Q1;
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
        hh.d dVar;
        float dp;
        if (view == this.S2) {
            canvas.save();
            canvas.clipRect(0.0f, this.S2.getY(), getMeasuredWidth(), this.S2.getY() + this.S2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        u2 u2Var = this.Q1;
        Paint paint = this.c2;
        g3 g3Var = this.s0;
        n4 n4Var = this.m1;
        if (view == u2Var) {
            float f7 = this.f2;
            o4 o4Var = this.D1;
            if (f7 > 0.0f && !o4Var.f) {
                n4Var.l.setAlpha((int) (f7 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), n4Var.l);
            }
            RectF rectF = n4Var.h;
            RectF rectF2 = n4Var.i;
            RectF rectF3 = n4Var.j;
            rectF.set(this.Q1.getX(), this.Q1.getY() + this.Q1.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.Q1.getX() + this.Q1.getMeasuredWidth(), this.Q1.getY() + this.Q1.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (o4Var.f) {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                t1 t1Var = this.P1;
                if (t1Var != null && t1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.H2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.I2 && this.s1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (g3Var != null && g3Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + g3Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.Q1.getY() + this.Q1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.Q1.getY() + this.Q1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.Q1.setTranslationX((1.0f - this.f2) * dp);
            this.Q1.getEditField().setTranslationY(c3.h0.z(1.0f, this.f2, -AndroidUtilities.dp(2.0f), this.Q1.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.f2) * (this.Q1.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, n4Var.h, this.f2, rectF3);
            eh.d dVar2 = this.a2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.x(dp3);
                dVar2.setAlpha((int) ((1.0f - this.S3) * (1.0f - this.g2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (u2Var != null && u2Var.r0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = n4Var.k;
                RectF rectF5 = n4Var.k;
                rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.P3;
                path.rewind();
                path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                eh.d dVar3 = this.b2;
                if (dVar3 != null) {
                    dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    dVar3.y(dp4, dp4, dp4, dp4);
                    dVar3.setAlpha(255);
                    dVar3.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, dp4, dp4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.U1 || this.Q1 == null) {
                if (view == this.g3) {
                    view.setTranslationY((this.D0.getY() + (g3Var.getY() + (-(r2.getMeasuredHeight() - this.g3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    q3 q3Var = this.R0;
                    if (view == q3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.w3) != null && !dVar.r) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.f(0.2f, -16777216, -1));
                        a2.translate(q3Var.getX(), q3Var.getY());
                        view.draw(a2);
                        dVar.b();
                    }
                }
            } else {
                view.setTranslationY(((this.Q1.getY() + this.Q1.getAnimatedTop()) + (-r2.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1() {
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
        ArrayList arrayList11 = this.H3;
        arrayList11.clear();
        ArrayList arrayList12 = this.I3;
        arrayList12.clear();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            arrayList = this.W0;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((bh.n0) arrayList.get(i13)).b(false);
            i13++;
        }
        arrayList.clear();
        int i14 = 0;
        while (true) {
            if (i14 >= 2) {
                break;
            }
            int i15 = this.y1;
            if (i14 == 0) {
                i10 = i15 - 1;
                imageReceiver = this.U0;
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
                ArrayList arrayList13 = this.l1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.k1;
                if (isEmpty && i10 >= arrayList2.size()) {
                    T0((g7) arrayList13.get(i10 - arrayList2.size()), imageReceiver, k10);
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < 0) {
                        i10 = i12;
                    }
                    if (i10 >= arrayList2.size()) {
                        i10 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i10);
                    long j10 = this.q1;
                    storyItem2.dialogId = j10;
                    g7 t10 = this.H1.t(j10, storyItem2);
                    if (t10 != null) {
                        T0(t10, imageReceiver, k10);
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
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), b10.u(k10, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), k10, null, null, null, 0L, null, null, 0);
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
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), b10.u(k10, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), k10, null, null, null, 0L, null, storyItem, 0);
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
                            storyItem.fileReference = FileLoader.getInstance(this.r2).getFileReference(storyItem);
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("?account=");
                            sb2.append(this.r2);
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
                            } catch (UnsupportedEncodingException e10) {
                                e = e10;
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
                        } catch (UnsupportedEncodingException e11) {
                            e = e11;
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
                                bh.n0 n0Var = new bh.n0(this);
                                n0Var.e(bh.x0.d(tL_mediaAreaSuggestedReaction.reaction));
                                n0Var.b(this.P0);
                                arrayList10 = arrayList5;
                                arrayList10.add(n0Var);
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
                ImageReceiver imageReceiver3 = this.V0;
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
                    ArrayList arrayList132 = this.l1;
                    isEmpty = arrayList132.isEmpty();
                    arrayList2 = this.k1;
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
        p9 p9Var = (p9) this.F1;
        y9 y9Var = p9Var.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z10 = y9Var.H0;
            ArrayList arrayList16 = y9Var.M0;
            if (z10) {
                return;
            }
            for (int i19 = 0; i19 < arrayList16.size(); i19++) {
                for (int i20 = 0; i20 < arrayList15.size(); i20++) {
                    if (((Uri) arrayList15.get(i20)).equals(((x9) arrayList16.get(i19)).uri)) {
                        arrayList15.remove(i20);
                    }
                }
            }
            for (int i21 = 0; i21 < arrayList15.size(); i21++) {
                Uri uri = (Uri) arrayList15.get(i21);
                x9 x9Var = new x9(y9Var, y9Var.C0, y9Var.B0);
                x9Var.setOnSeekUpdate(new b4(21, p9Var, x9Var));
                x9Var.uri = uri;
                TLRPC.Document document2 = (TLRPC.Document) arrayList14.get(i21);
                x9Var.document = document2;
                FileStreamLoadOperation.setPriorityForDocument(document2, 0);
                x9Var.preparePlayer(uri, y9.D1, y9.B1);
                arrayList16.add(x9Var);
                if (arrayList16.size() > 2) {
                    ((x9) arrayList16.remove(0)).release(null);
                }
            }
        }
    }

    public final void f1() {
        if (this.v1) {
            TextView textView = this.W1;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.X1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.W1;
        if (textView3 != null) {
            textView3.setText(LocaleController.getString(this.t1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        }
        TextView textView4 = this.X1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.X1.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.o1;
        y9 y9Var = this.y0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.l1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((g7) arrayList2.get(i11)).a;
                    if (((int) (j10 ^ (j10 >>> 32))) == y9Var.P0) {
                        this.y1 = i11;
                        return;
                    }
                }
            }
            int indexOf = this.o1.indexOf(Integer.valueOf(y9Var.P0));
            if (indexOf < 0 && !this.o1.isEmpty()) {
                if (y9Var.P0 > ((Integer) this.o1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (y9Var.P0 < ((Integer) ic.a.g(1, this.o1)).intValue()) {
                    indexOf = this.o1.size() - 1;
                }
            }
            this.y1 = i10 + indexOf;
        } else {
            int i12 = y9Var.e1.get(this.q1, -1);
            this.y1 = i12;
            if (i12 == -1 && !y9Var.N0 && (peerStories = this.j1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.k1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i13)).id > this.j1.max_read_id) {
                        this.y1 = i13;
                        break;
                    }
                    i13++;
                }
            }
        }
        if (this.y1 == -1) {
            this.y1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.o1;
    }

    public long getCurrentPeer() {
        return this.q1;
    }

    public int getListPosition() {
        return this.A1;
    }

    public Bitmap getPlayingBitmap() {
        q3 q3Var = this.R0;
        Bitmap createBitmap = Bitmap.createBitmap(q3Var.getWidth(), q3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.y1;
    }

    public h7 getStoriesController() {
        return MessagesController.getInstance(this.r2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.s2, this.k1.size()) + this.l1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.k1;
    }

    public final void h1() {
        z6 z6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.k1;
        arrayList.clear();
        y9 y9Var = this.y0;
        if (!y9Var.N0) {
            ArrayList arrayList2 = this.o1;
            int i10 = 0;
            ArrayList arrayList3 = this.l1;
            if (arrayList2 != null && (z6Var = y9Var.O0) != null) {
                if (z6Var instanceof s6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.r2).getStoriesController().E(this.q1);
                    String str = ((s6) y9Var.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            g7 g7Var = (g7) E.get(i11);
                            fi.w7 w7Var = g7Var.c;
                            if (w7Var != null && !w7Var.g && TextUtils.equals(w7Var.K0, str)) {
                                arrayList3.add(g7Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.o1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = y9Var.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (y9Var.O0 != null) {
                while (i10 < y9Var.O0.i.size()) {
                    arrayList.add(((MessageObject) y9Var.O0.i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = y9Var.Q0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.q1) {
                    TL_stories.PeerStories y3 = this.H1.y(this.q1);
                    this.j1 = y3;
                    if (y3 == null) {
                        this.j1 = this.H1.z(this.q1);
                    }
                } else {
                    this.j1 = y9Var.Q0;
                }
                this.s2 = 0;
                TL_stories.PeerStories peerStories2 = this.j1;
                if (peerStories2 != null) {
                    this.s2 = peerStories2.stories.size();
                    arrayList.addAll(this.j1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.H1.E(this.q1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        } else if (!y9Var.S0) {
            arrayList.add(y9Var.T0);
        }
        this.p1 = getStoriesCount();
    }

    public final void i0(boolean z10) {
        q4 currentPeerView;
        o60 o60Var = this.y2;
        if (o60Var != null) {
            o60Var.f0 = null;
            o60Var.a(false);
        }
        long j10 = this.q1;
        TL_stories.StoryItem storyItem = this.D1.a;
        y9 y9Var = this.y0;
        y9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            y9.E1.remove(j10 + (j10 >> 16) + (storyItem.id << 16));
        }
        this.X2 = true;
        o9 o9Var = y9Var.n0;
        if (o9Var != null && (currentPeerView = o9Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z10) {
            qc I = new wc(this.R0, this.q0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new c2(this, 2));
            I.s = false;
            I.k(false);
        }
        MessagesController.getInstance(this.r2).ensureMessagesLoaded(this.q1, 0, null);
    }

    public final void i1(boolean z10) {
        int i10;
        o4 o4Var = this.D1;
        TL_stories.StoryItem storyItem = o4Var.a;
        if (storyItem == null) {
            storyItem = o4Var.c;
        }
        boolean z11 = this.s1;
        if (z11 || this.r1) {
            if (storyItem == null) {
                this.p2.setText("");
                this.u2.setVisibility(8);
                this.q2.setVisibility(8);
                return;
            }
            y9 y9Var = this.y0;
            g3 g3Var = this.s0;
            if (!z11) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.p2.setText(LocaleController.getString(y9Var.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                    this.p2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.q2.setVisibility(8);
                    this.u2.setVisibility(8);
                } else {
                    int i11 = 0;
                    for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                        TLObject userOrChat = MessagesController.getInstance(this.r2).getUserOrChat(storyItem.views.recent_viewers.get(i12).longValue());
                        if (userOrChat != null) {
                            this.q2.b(i11, userOrChat, this.r2);
                            i11++;
                        }
                        if (i11 >= 3) {
                            break;
                        }
                    }
                    for (int i13 = i11; i13 < 3; i13++) {
                        this.q2.b(i13, null, this.r2);
                    }
                    this.q2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        zq zqVar = new zq(R.drawable.mini_views_likes, 0);
                        zqVar.setOverrideColor(-53704);
                        zqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(zqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        zq zqVar2 = new zq(R.drawable.mini_repost_story, 0);
                        zqVar2.setOverrideColor(-14161823);
                        zqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(zqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.p2.setText(spannableStringBuilder);
                    if (i11 == 0) {
                        this.q2.setVisibility(8);
                        this.p2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.q2.setVisibility(0);
                        this.p2.setTranslationX(AndroidUtilities.dp(10.0f) + c3.h0.w(i11, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.u2.setVisibility(0);
                }
                g3Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.D0.requestLayout();
                return;
            }
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2.views_count <= 0) {
                storyViews2.views_count = 1;
            }
            org.telegram.ui.Components.r6 r6Var = this.G0;
            if (r6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.K0 = false;
            } else {
                r6Var.t(Integer.toString(i10), z10 && this.K0, true);
                this.K0 = true;
            }
            int i14 = storyItem.views.reactions_count;
            if (i14 > 0) {
                this.F0.t(Integer.toString(i14), z10 && this.J0, true);
                this.J0 = true;
            } else {
                this.J0 = false;
            }
            if (!z10) {
                this.H0.d(this.J0 ? 1.0f : 0.0f, true);
                org.telegram.ui.Components.h6 h6Var = this.I0;
                if (h6Var != null) {
                    h6Var.d(this.K0 ? 1.0f : 0.0f, true);
                }
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.r2).getChat(Long.valueOf(-this.q1));
            if (!(this.t1 && (ChatObject.canSendPlain(chat) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                this.p2.setText(LocaleController.getString(y9Var.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.p2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new zq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.p2.setText(spannableStringBuilder2);
            } else {
                this.p2.setText("");
            }
            g3Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.J0 ? this.F0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.L1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + g3Var.getLayoutParams().width;
            g3 g3Var2 = this.E0;
            if (g3Var2 != null) {
                g3Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.K0 ? this.G0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.L1.getLayoutParams()).rightMargin += g3Var2.getLayoutParams().width;
                g3Var2.requestLayout();
            }
            this.L1.requestLayout();
            g3Var.requestLayout();
            this.q2.setVisibility(8);
            this.u2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = o4Var.a;
            m3 m3Var = this.Y0;
            if (storyItem2 == null) {
                m3Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < m3Var.getChildCount(); i15++) {
                if (m3Var.getChildAt(i15) instanceof f9) {
                    ((f9) m3Var.getChildAt(i15)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void j0() {
        m7 m7Var = this.t0;
        m7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new r2(0, m7Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        m7 m7Var2 = new m7(getContext(), this.m1);
        this.t0 = m7Var2;
        m7Var2.setPadding(dp, dp, dp, dp);
        this.t0.setAlpha(0.0f);
        this.t0.setScaleX(0.8f);
        this.t0.setScaleY(0.8f);
        this.t0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.s0.addView(this.t0, gb1.i(40, 40, 3));
        this.f3 = false;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void j1() {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di.q4.j1():void");
    }

    public final void k0(boolean z10) {
        ValueAnimator valueAnimator = this.R3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S3, z10 ? 1.0f : 0.0f);
        this.R3 = ofFloat;
        ofFloat.addUpdateListener(new d2(this, 2));
        this.R3.addListener(new p2(this, z10, 1));
        this.R3.setDuration(420L);
        this.R3.setInterpolator(ds.h);
        this.R3.start();
    }

    public final void l0(Runnable runnable) {
        if (MessagesController.getInstance(this.r2).isFrozen()) {
            org.telegram.ui.b.b(this.r2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 <= 0 || !this.Z2) {
            runnable.run();
            return;
        }
        int i11 = i10 - 1;
        SharedConfig.stealthModeSendMessageConfirm = i11;
        SharedConfig.updateStealthModeSendMessageConfirm(i11);
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getContext(), 0, this.q0);
        e2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        e2Var.n(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        a1.c cVar = new a1.c(runnable, 24);
        e2Var.n0 = string;
        e2Var.o0 = cVar;
        String string2 = LocaleController.getString(R.string.Cancel);
        c2.i iVar = new c2.i(15);
        e2Var.p0 = string2;
        e2Var.q0 = iVar;
        e2Var.show();
    }

    public final void m0(int i10) {
        this.t2 = false;
        this.K2 = true;
        this.q3 = false;
        this.s1 = false;
        this.t1 = false;
        long j10 = this.q1;
        m4 m4Var = this.d1;
        org.telegram.ui.Components.j9 j9Var = this.c1;
        if (j10 >= 0) {
            this.r1 = j10 == UserConfig.getInstance(this.r2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.r2).getUser(Long.valueOf(this.q1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.r2).isUserContactBlocked(this.q1);
            this.u1 = !UserConfig.getInstance(this.r2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.w1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            j9Var.m(this.r2, user);
            m4Var.a.getImageReceiver().setForUserOrChat(user, j9Var);
            U0(this.q1, true, false);
        } else {
            this.r1 = false;
            this.s1 = true;
            if (this.H1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.q3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.r2).getChat(Long.valueOf(-this.q1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.t1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.r2).getChatFull(-this.q1) == null) {
                MessagesStorage.getInstance(this.r2).loadChatInfo(-this.q1, true, new CountDownLatch(1), false, false);
            }
            this.u1 = this.t1 && !ChatObject.canSendPlain(chat);
            this.w1 = MessagesController.getInstance(this.r2).getSendPaidMessagesStars(this.q1);
            j9Var.k(this.r2, chat);
            m4Var.a.getImageReceiver().setForUserOrChat(chat, j9Var);
            U0(this.q1, true, false);
        }
        if (this.z1 && (this.r1 || this.s1)) {
            h7 h7Var = this.H1;
            long j11 = this.q1;
            a0.h hVar = h7Var.m;
            ha haVar = (ha) hVar.f(j11);
            if (haVar == null) {
                haVar = new ha(h7Var.a, j11, h7Var);
                hVar.k(haVar, j11);
            }
            haVar.b(true);
        }
        h1();
        this.y1 = i10;
        if (i10 < 0) {
            this.y1 = 0;
        }
        this.L0 = 0L;
        this.N0 = false;
        this.y3 = null;
        this.z3 = null;
        boolean z10 = this.s1;
        q3 q3Var = this.R0;
        y9 y9Var = this.y0;
        int i11 = 8;
        o4 o4Var = this.D1;
        if (z10) {
            z0();
            if (this.Q1 == null && (this.t1 || o4Var.f)) {
                t0();
            }
            if (this.Q1 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.r2).getChat(Long.valueOf(-this.q1));
                u2 u2Var = this.Q1;
                if (o4Var.f || (!G0() && this.t1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                u2Var.setVisibility(i11);
                u2 u2Var2 = this.Q1;
                boolean z11 = o4Var.f;
                B0(true);
                u2Var2.f1(z11);
                this.Q1.l1(o4Var.f && !B0(true) && (this.k2 || this.Q1.W0), true);
                ju editField = this.Q1.getEditField();
                long j12 = this.q1;
                TL_stories.StoryItem storyItem = o4Var.a;
                y9Var.getClass();
                editField.setText(y9.u(j12, storyItem));
                this.Q1.Y0(this.r2, this.q1);
                this.Q1.H1(chat2, null);
            }
            org.telegram.ui.Components.r6 r6Var = this.F0;
            org.telegram.ui.ActionBar.u6 u6Var = this.q0;
            if (r6Var == null) {
                org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(false, false, false);
                this.F0 = r6Var2;
                g3 g3Var = this.s0;
                r6Var2.setCallback(g3Var);
                this.F0.u(u6Var.g(org.telegram.ui.ActionBar.y6.G6));
                this.F0.w(AndroidUtilities.dp(14.0f));
                this.H0 = new org.telegram.ui.Components.h6(g3Var);
            }
            g3 g3Var2 = this.E0;
            if (g3Var2 != null && this.G0 == null) {
                org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(false, false, false);
                this.G0 = r6Var3;
                r6Var3.setCallback(g3Var2);
                this.G0.u(u6Var.g(org.telegram.ui.ActionBar.y6.G6));
                this.G0.w(AndroidUtilities.dp(14.0f));
                this.I0 = new org.telegram.ui.Components.h6(g3Var2);
            }
            if (i10 == -1) {
                g1();
            }
            d1(false);
            this.p1 = getStoriesCount();
            q3Var.invalidate();
            invalidate();
        } else if (this.r1) {
            z0();
            if (o4Var.f) {
                this.L1.setVisibility(8);
                if (this.Q1 == null) {
                    t0();
                }
                this.Q1.setVisibility(0);
            } else {
                this.L1.setVisibility(0);
                u2 u2Var3 = this.Q1;
                if (u2Var3 != null) {
                    u2Var3.setVisibility(8);
                }
            }
            u2 u2Var4 = this.Q1;
            if (u2Var4 != null) {
                boolean z12 = o4Var.f;
                B0(true);
                u2Var4.f1(z12);
                this.Q1.l1(o4Var.f && !B0(true) && (this.k2 || this.Q1.W0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.o1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(y9Var.P0));
                    if (indexOf < 0 && !this.o1.isEmpty()) {
                        if (y9Var.P0 > ((Integer) this.o1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (y9Var.P0 < ((Integer) ic.a.g(1, this.o1)).intValue()) {
                            indexOf = this.o1.size() - 1;
                        }
                    }
                    this.y1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.l1.isEmpty();
                    ArrayList arrayList2 = this.k1;
                    if (isEmpty) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i12)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i12)).id > this.H1.f.get(this.q1)) {
                                this.y1 = i12;
                                break;
                            }
                        }
                    } else {
                        this.y1 = arrayList2.size();
                    }
                }
            }
            d1(false);
            q3Var.invalidate();
            invalidate();
        } else {
            if (this.Q1 == null) {
                t0();
            }
            if (this.u1 && this.V1 == null) {
                x0();
            }
            if (this.V1 != null) {
                if (this.u1 || this.v1) {
                    f1();
                }
                this.V1.setVisibility(((!this.u1 || o4Var.f) && !this.v1) ? 8 : 0);
            }
            w8 w8Var = this.Y1;
            if (w8Var != null) {
                w8Var.setVisibility(8);
            }
            if (i10 == -1) {
                g1();
            }
            d1(false);
            u2 u2Var5 = this.Q1;
            if (u2Var5 != null) {
                u2Var5.setVisibility((G0() || UserObject.isService(this.q1)) ? 8 : 0);
                u2 u2Var6 = this.Q1;
                boolean z13 = o4Var.f;
                B0(true);
                u2Var6.f1(z13);
                this.Q1.l1(o4Var.f && !B0(true) && (this.k2 || this.Q1.W0), true);
                ju editField2 = this.Q1.getEditField();
                long j13 = this.q1;
                TL_stories.StoryItem storyItem2 = o4Var.a;
                y9Var.getClass();
                editField2.setText(y9.u(j13, storyItem2));
                this.Q1.Y0(this.r2, this.q1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.r2).getUserFull(this.q1);
                if (userFull != null) {
                    this.Q1.H1(null, userFull);
                } else {
                    MessagesController.getInstance(this.r2).loadFullUser(MessagesController.getInstance(this.r2).getUser(Long.valueOf(this.q1)), this.o2, false);
                }
            }
            this.p1 = getStoriesCount();
            g3 g3Var3 = this.L1;
            if (g3Var3 != null) {
                g3Var3.setVisibility(8);
            }
            q3Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        u3 u3Var = this.z0;
        if (u3Var.W.x()) {
            u3Var.W.f(false);
        }
    }

    public final void o0() {
        if (this.z1) {
            ((p9) this.F1).d.P();
        }
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P0 = true;
        this.T0.onAttachedToWindow();
        this.V0.onAttachedToWindow();
        this.U0.onAttachedToWindow();
        this.a3.onAttachedToWindow();
        this.c3.onAttachedToWindow();
        u2 u2Var = this.Q1;
        if (u2Var != null) {
            u2Var.C0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.W0;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.r2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.r2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.r2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.r2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.r2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.r2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.r2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.r2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.r2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((bh.n0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P0 = false;
        this.T0.onDetachedFromWindow();
        this.V0.onDetachedFromWindow();
        this.U0.onDetachedFromWindow();
        this.a3.onDetachedFromWindow();
        this.c3.onDetachedFromWindow();
        u2 u2Var = this.Q1;
        if (u2Var != null) {
            u2Var.B0();
        }
        org.telegram.ui.Components.t5 t5Var = this.d3;
        if (t5Var != null) {
            t5Var.o(this);
            this.d3 = null;
        }
        bh.e eVar = this.b3;
        if (eVar != null) {
            eVar.d(this);
            this.b3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.W0;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.r2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.r2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.r2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.r2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.r2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.r2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.r2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.r2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.r2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((bh.n0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.vw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.m1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
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
        o60 o60Var;
        boolean z10;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        fl0 fl0Var;
        w2 w2Var;
        y9 y9Var = this.y0;
        if (y9Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i12 = 0;
        if (this.z1 && this.O2 == null) {
            this.n2 = ((p9) this.F1).d.p0;
        } else {
            this.n2 = 0;
        }
        int size = y9Var.b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.n2;
        int size2 = (int) ((View.MeasureSpec.getSize(i10) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.n2 < AndroidUtilities.dp(20.0f)) {
            this.n2 = 0;
        }
        int i13 = this.n2;
        fl0 fl0Var2 = this.g3;
        if (fl0Var2 == null || fl0Var2.getReactionsWindow() == null || this.g3.getReactionsWindow().q) {
            u2 u2Var = this.Q1;
            if (u2Var != null && (u2Var.q0() || this.Q1.k3)) {
                if (this.Q1.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.Q1.getEmojiPadding();
                } else {
                    u2 u2Var2 = this.Q1;
                    if (u2Var2.z3) {
                        u2Var2.H();
                        i13 = this.Q1.getStickersExpandedHeight();
                    } else {
                        i13 = u2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.g3.getReactionsWindow().c.animate().translationY(-this.n2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
            i13 = 0;
        }
        boolean z11 = this.k2;
        int i14 = this.d2;
        m4 m4Var = this.d1;
        int i15 = 1;
        if (i14 != i13) {
            this.k2 = false;
            int i16 = 3;
            o4 o4Var = this.D1;
            f7 = 8.0f;
            if (i13 <= 0 || !this.z1) {
                u2 u2Var3 = this.Q1;
                if (u2Var3 != null) {
                    y9.J(this.q1, o4Var.a, u2Var3.getEditText());
                }
            } else {
                this.k2 = true;
                this.X2 = false;
                this.i2 = i13;
                if (this.U1 == null) {
                    fl0 fl0Var3 = new fl0(1, this.r2, getContext(), LaunchActivity.R(), new s2(i16, this.q0));
                    this.U1 = fl0Var3;
                    fl0Var3.setHint(LocaleController.getString(this.t1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    fl0 fl0Var4 = this.U1;
                    fl0Var4.N0 = true;
                    addView(fl0Var4, this.x0, gb1.h(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.U1.setDelegate(new l3(this));
                    this.U1.p(null, null, true);
                }
                this.U1.setFragment(LaunchActivity.R());
                this.U1.setHint(LocaleController.getString(this.t1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                bh.s0 s0Var = bh.s0.B;
                if (s0Var != null) {
                    s0Var.l = true;
                }
                bh.s0 s0Var2 = bh.s0.C;
                if (s0Var2 != null) {
                    s0Var2.l = true;
                }
            }
            u2 u2Var4 = this.Q1;
            if (u2Var4 != null) {
                u2Var4.l1(o4Var.f && !B0(true) && this.k2, true);
            }
            if (this.k2 && (w2Var = this.S2) != null) {
                w2Var.setVisibility(0);
            }
            if (!this.k2 && (fl0Var = this.U1) != null) {
                fl0Var.n();
            }
            m4Var.setEnabled(!this.k2);
            if (this.Q1 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.k2, 0.1f, true);
            }
            if (this.z1 && this.k2) {
                y9 y9Var2 = ((p9) this.F1).d;
                if (!y9Var2.x) {
                    y9Var2.x = true;
                    y9Var2.P();
                }
            }
            this.d2 = i13;
            ValueAnimator valueAnimator = this.e2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.C2.lock();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w2, i13);
            this.e2 = ofFloat;
            ofFloat.addUpdateListener(new d2(this, i12));
            this.e2.addListener(new q2(this, i15));
            if (this.k2) {
                this.e2.setDuration(250L);
                this.e2.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                y9Var.m();
            } else {
                this.e2.setDuration(500L);
                this.e2.setInterpolator(ds.h);
            }
            this.e2.start();
            boolean z12 = this.k2;
            if (z12 != z11) {
                if (z12) {
                    aa.m0 m0Var = this.E1;
                    Canvas canvas = (Canvas) m0Var.b;
                    Bitmap bitmap = (Bitmap) m0Var.c;
                    C0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.a.o(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (o4Var.f) {
                        fi.v3 v3Var = this.S1;
                        if (v3Var != null) {
                            if (!v3Var.V) {
                                removeView(v3Var);
                            }
                        }
                        if (!B0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            fi.v3 v3Var2 = new fi.v3(getContext(), 3);
                            this.S1 = v3Var2;
                            v3Var2.s(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.S1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            fi.v3 v3Var3 = this.S1;
                            v3Var3.K = Layout.Alignment.ALIGN_OPPOSITE;
                            v3Var3.l0 = new bi.f2(28, this, v3Var2);
                            addView(v3Var3, gb1.i(-1, 100, 87));
                            this.S1.u();
                            j1();
                        }
                    }
                } else {
                    u2 u2Var5 = this.Q1;
                    if (u2Var5 != null) {
                        u2Var5.getEditField().clearFocus();
                    }
                    fi.v3 v3Var4 = this.S1;
                    if (v3Var4 != null) {
                        v3Var4.e(true);
                    }
                }
                this.j2 = true;
            } else {
                this.j2 = false;
            }
        } else {
            f7 = 8.0f;
        }
        u2 u2Var6 = this.Q1;
        if (u2Var6 != null && u2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.Q1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        q3 q3Var = this.R0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) q3Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z13 = size - size2 > AndroidUtilities.dp(64.0f);
        this.m2 = z13;
        int dp2 = (size - ((z13 ? AndroidUtilities.dp(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = dp2;
        if (this.m2) {
            this.z2 = (((-dp2) + size) - size2) - AndroidUtilities.dp(64.0f);
        } else {
            this.z2 = ((-dp2) + size) - size2;
        }
        if (this.m2 != this.l2) {
            q3Var.setLayoutParams(layoutParams2);
        }
        g3 g3Var = this.L1;
        if (g3Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) g3Var.getLayoutParams();
            if (this.m2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f7) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        md mdVar = this.Q2;
        if (mdVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) mdVar.getLayoutParams();
            if (this.m2) {
                c10 = 0;
                this.Q2.setTextColor(i0.a.f(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                o60Var = this.y2;
                if (o60Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) o60Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.t.B(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i13;
                    }
                }
                z10 = this.m2;
                LinearLayout linearLayout = this.D0;
                u3 u3Var = this.z0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.r1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) u3Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.l2 != this.m2) {
                        u3Var.setLayoutParams((FrameLayout.LayoutParams) u3Var.getLayoutParams());
                    }
                    u3Var.u0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) u3Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f7);
                    if (this.l2 != this.m2) {
                        u3Var.setLayoutParams((FrameLayout.LayoutParams) u3Var.getLayoutParams());
                    }
                    u3Var.u0 = AndroidUtilities.dp(f7);
                }
                this.K2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.r0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.n0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                l4 l4Var = m4Var.b;
                TextView[] textViewArr = m4Var.c;
                layoutParams = (FrameLayout.LayoutParams) l4Var.getLayoutParams();
                if (layoutParams.rightMargin != dp) {
                    int i17 = (int) dp;
                    layoutParams.rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i17;
                    m4Var.forceLayout();
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.l2 = this.m2;
            }
            this.Q2.setTextColor(i0.a.o(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c10 = 0;
        o60Var = this.y2;
        if (o60Var != null) {
        }
        z10 = this.m2;
        LinearLayout linearLayout2 = this.D0;
        u3 u3Var2 = this.z0;
        if (z10) {
        }
        this.K2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.r0.getVisibility() == 0) {
        }
        if (this.n0.getVisibility() == 0) {
        }
        l4 l4Var2 = m4Var.b;
        TextView[] textViewArr2 = m4Var.c;
        layoutParams = (FrameLayout.LayoutParams) l4Var2.getLayoutParams();
        if (layoutParams.rightMargin != dp) {
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.l2 = this.m2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f2 = -1.0f;
        this.K2 = true;
        invalidate();
    }

    public final void p0(boolean z10) {
        if (this.Q1 != null && this.U2 && this.P0) {
            c2 c2Var = this.E3;
            AndroidUtilities.cancelRunOnUIThread(c2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.H1.B;
            this.Q1.G(true);
            boolean z11 = this.u1;
            o4 o4Var = this.D1;
            if ((z11 && !o4Var.f) || this.v1) {
                this.Z2 = false;
                this.Q1.setEnabled(false);
                this.Q1.g1(" ", z10);
                return;
            }
            if (this.w1 > 0) {
                this.Z2 = false;
                this.Q1.setEnabled(true);
                this.Q1.g1(bi.dd.P0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.w1, ','))), z10);
                return;
            }
            if (!o4Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.r2).getCurrentTime();
                int i10 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i10) {
                    this.Z2 = true;
                    int currentTime2 = i10 - ConnectionsManager.getInstance(this.r2).getCurrentTime();
                    int i11 = currentTime2 / 60;
                    int i12 = currentTime2 % 60;
                    int i13 = R.string.StealthModeActiveHintShort;
                    Locale locale = Locale.US;
                    int measureText = (int) this.Q1.getEditField().getPaint().measureText(LocaleController.formatString(i13, String.format(locale, "%02d:%02d", 99, 99)));
                    this.Q1.setEnabled(true);
                    if (measureText * 1.2f >= this.Q1.getEditField().getMeasuredWidth()) {
                        u2 u2Var = this.Q1;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        u2Var.e = formatString;
                        u2Var.f = format;
                        u2Var.D1(z10);
                    } else {
                        this.Q1.g1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    AndroidUtilities.runOnUIThread(c2Var, 1000L);
                    return;
                }
            }
            this.Z2 = false;
            this.Q1.setEnabled(true);
            if (!o4Var.f) {
                this.Q1.g1(LocaleController.getString(this.t1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            if (this.Q1.getStarsPrice() <= 0) {
                this.Q1.g1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.Q1.g1(bi.dd.U0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.Q1.O4), z10);
            zq zqVar = this.Q1.O4[0];
            if (zqVar != null) {
                zqVar.spaceScaleX = 0.9f;
            }
        }
    }

    public final boolean q0() {
        if (this.h3) {
            if (this.g3.getReactionsWindow() == null) {
                Z0(false);
                return true;
            }
            if (this.n2 > 0) {
                AndroidUtilities.hideKeyboard(this.g3.getReactionsWindow().c);
                return true;
            }
            this.g3.getReactionsWindow().d();
            return true;
        }
        m3 m3Var = this.Y0;
        if (m3Var != null) {
            fi.v3 v3Var = m3Var.c;
            if (v3Var != null) {
                v3Var.e(true);
                m3Var.c = null;
            }
            m3Var.b = null;
            m3Var.invalidate();
            m3Var.b(false);
        }
        u3 u3Var = this.z0;
        if (u3Var.W.x()) {
            u3Var.W.f(false);
            return true;
        }
        fi.v3 v3Var2 = this.u0;
        if (v3Var2 != null) {
            v3Var2.e(true);
        }
        fi.v3 v3Var3 = this.v0;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
        t40 t40Var = this.L2;
        if (t40Var != null) {
            t40Var.b(true);
        }
        h4 h4Var = this.i1;
        if (h4Var != null && h4Var.b) {
            h4Var.a();
            return true;
        }
        u2 u2Var = this.Q1;
        if (u2Var != null && u2Var.s0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.q0);
            if (this.Q1.c1) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new y1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((p9) this.F1).h(alertDialog$Builder.a);
            return true;
        }
        fl0 fl0Var = this.U1;
        if (fl0Var != null && fl0Var.getReactionsWindow() != null && !this.U1.getReactionsWindow().q) {
            this.U1.getReactionsWindow().d();
            return true;
        }
        u2 u2Var2 = this.Q1;
        if (u2Var2 != null && u2Var2.q0()) {
            if (this.n2 > 0) {
                AndroidUtilities.hideKeyboard(this.Q1.getEmojiView());
                return true;
            }
            this.Q1.k0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (u3Var.getVisibility() != 0 || u3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            u3Var.D();
            this.V2 = false;
            this.R0.invalidate();
            return true;
        }
        u2 u2Var3 = this.Q1;
        if (u2Var3 != null) {
            long j10 = this.q1;
            TL_stories.StoryItem storyItem = this.D1.a;
            Editable editText = u2Var3.getEditText();
            this.y0.getClass();
            y9.J(j10, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.Q1);
        return true;
    }

    public final void r0() {
        if (this.x2 == null) {
            a3 a3Var = new a3(this, getContext(), this.q0);
            this.x2 = a3Var;
            a3Var.c2 = new b3(this);
            a3Var.j0.f0();
            a3 a3Var2 = this.x2;
            a3Var2.W = true;
            a3Var2.v1();
            a3 a3Var3 = this.x2;
            a3Var3.X = new c3(this);
            a3Var3.r1().setText(this.Q1.getFieldText());
        }
    }

    public final void s0() {
        if (this.M1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.x3);
        this.M1 = aVar;
        aVar.setOnClickListener(new e2(this, 1));
        addView(this.M1, gb1.h(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public void setAccount(int i10) {
        this.r2 = i10;
        this.H1 = MessagesController.getInstance(i10).storiesController;
        this.Z0.b = i10;
        fl0 fl0Var = this.U1;
        if (fl0Var != null) {
            fl0Var.setCurrentAccount(i10);
            this.U1.p(null, null, true);
        }
        fl0 fl0Var2 = this.g3;
        if (fl0Var2 != null) {
            fl0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        R0(0L, z10);
    }

    public void setDelegate(j4 j4Var) {
        this.F1 = j4Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.U2 == z10) {
            return;
        }
        this.U2 = z10;
        if (z10) {
            this.T0.setCurrentAlpha(1.0f);
            p0(false);
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.z1) {
            this.A2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f7) {
        boolean z10 = f7 == 0.0f;
        if (this.Q0 != z10) {
            this.Q0 = z10;
            this.R0.invalidate();
            if (this.z1 && this.y0.a && Build.VERSION.SDK_INT < 33) {
                a5.d dVar = this.K3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    y9 y9Var = ((p9) this.F1).d;
                    y9Var.l1 = true;
                    y9Var.P();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.G1 != z10) {
            this.G1 = z10;
            f3 f3Var = this.T0;
            if (z10) {
                f3Var.stopAnimation();
                f3Var.setAllowStartAnimation(false);
            } else {
                f3Var.startAnimation();
                f3Var.setAllowStartAnimation(true);
            }
            this.M0 = 0L;
            this.R0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.u6 u6Var = this.q0;
        u2 u2Var = new u2(this, AndroidUtilities.findActivity(getContext()), this, new s2(1, u6Var));
        this.Q1 = u2Var;
        u2Var.getEditField().useAnimatedTextDrawable();
        this.Q1.getEditField().setScaleX(0.0f);
        this.Q1.setOverrideKeyboardAnimation(true);
        this.Q1.setClipChildren(false);
        this.Q1.setDelegate(new v2(this));
        setDelegate(this.Q1);
        u2 u2Var2 = this.Q1;
        u2Var2.y4 = false;
        u2Var2.z4 = true;
        if (this.D1.f) {
            u2Var2.S0(false, false, false);
        } else {
            u2Var2.S0(true, true, false);
        }
        this.Q1.updateColors();
        u2 u2Var3 = this.Q1;
        u2Var3.A4 = true;
        addView(u2Var3, gb1.h(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.D3 != null) {
            this.Q1.M1(false);
        }
        this.Q1.G2 = this.o2;
        p4 p4Var = this.B2;
        ((ArrayList) p4Var.g).add(this.R0);
        ((ArrayList) p4Var.g).add(this);
        if (this.P0) {
            this.Q1.C0();
        }
        p0(false);
        if (G0()) {
            this.Q1.setVisibility(8);
        }
        lh.h hVar = new lh.h(getContext(), u6Var, this.x3, this.u3);
        this.R1 = hVar;
        hVar.setOnClickListener(new y1(this, 1));
        addView(this.R1, gb1.i(57, 300, 85));
        this.R1.setVisibility(8);
        this.Q1.setSideButtonsForAttach(this.R1);
        this.x0 = getChildCount();
    }

    public final void u0() {
        if (this.Y1 != null) {
            return;
        }
        w8 w8Var = new w8(getContext(), this.q0);
        this.Y1 = w8Var;
        w8Var.setOnClickListener(new e2(this, 4));
        this.Y1.setAlpha(0.0f);
        this.Y1.setVisibility(8);
        addView(this.Y1, gb1.h(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        if (this.P1 != null || getContext() == null) {
            return;
        }
        t1 t1Var = new t1(getContext(), this.x3);
        this.P1 = t1Var;
        t1Var.setOnClickListener(new e2(this, 5));
        t1 t1Var2 = this.P1;
        h1 h1Var = h1.W;
        boolean z10 = true;
        t1Var2.b(h1Var != null && h1Var.o(), false);
        t1 t1Var3 = this.P1;
        h1 h1Var2 = h1.W;
        if (h1Var2 != null && !h1Var2.m()) {
            z10 = false;
        }
        t1Var3.a(z10, false);
        addView(this.P1, gb1.h(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void w0() {
        if (this.O1 != null || getContext() == null) {
            return;
        }
        this.N1 = new w1(getContext(), this.r2);
        x1 x1Var = new x1(getContext(), this.N1, this.x3);
        this.O1 = x1Var;
        x1Var.setOnClickListener(new e2(this, 6));
        this.O1.setOnLongClickListener(new b2(this, 1));
        addView(this.O1, gb1.h(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.N1, gb1.h(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.V1 != null) {
            return;
        }
        if (this.Q1 == null) {
            t0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.V1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.W1 = textView;
        textView.setTextColor(-8026747);
        this.W1.setTextSize(1, 16.0f);
        this.W1.setText(LocaleController.getString(this.t1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        TextView textView2 = new TextView(getContext());
        this.X1 = textView2;
        textView2.setTextColor(-1);
        this.X1.setTextSize(1, 12.0f);
        TextView textView3 = this.X1;
        int dp = AndroidUtilities.dp(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.X1.setGravity(17);
        gb1.b(this.X1);
        this.X1.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.X1.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.V1.addView(imageView, gb1.x(22, 22, 16, 12, 1, 4, 0));
        this.V1.addView(this.W1, gb1.v(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.V1.addView(this.X1, gb1.v(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.Q1.addView(this.V1, gb1.h(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.Q2 != null) {
            return;
        }
        md mdVar = new md(getContext(), 1);
        this.Q2 = mdVar;
        mdVar.setTextSize(1, 14.0f);
        this.Q2.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.Q2.setGravity(19);
        this.Q2.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.Q2, gb1.h(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.L1 != null) {
            return;
        }
        g3 g3Var = new g3(this, getContext(), 0);
        this.L1 = g3Var;
        g3Var.setClickable(true);
        addView(this.L1, gb1.h(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        h3 h3Var = new h3(this, getContext());
        this.u2 = h3Var;
        h3Var.setOnClickListener(new e2(this, 0));
        this.L1.addView(this.u2, gb1.h(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        v vVar = new v(0, getContext(), false);
        this.q2 = vVar;
        vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.L1.addView(this.q2, gb1.h(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.p2 = textView;
        textView.setTextSize(1, 14.0f);
        this.p2.setTextColor(-1);
        this.L1.addView(this.p2, gb1.h(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.m1.s);
        h3 h3Var2 = this.u2;
        int dp = AndroidUtilities.dp(15.0f);
        int o10 = i0.a.o(-1, 120);
        h3Var2.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o10, o10));
        imageView.setBackground(org.telegram.ui.ActionBar.y6.N(i0.a.o(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }
}
