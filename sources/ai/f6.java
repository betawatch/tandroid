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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.z40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fc1;
import org.telegram.ui.fz;
import org.telegram.ui.qv0;
import org.telegram.ui.zn;
import org.telegram.ui.zr;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class f6 extends sw0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.e6 B0;
    public long B1;
    public h0 B2;
    public boolean B3;
    public final ob C0;
    public boolean C1;
    public int C2;
    public zr C3;
    public final n4 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.f1 D3;
    public r9 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.f1 E3;
    public ci.d4 F0;
    public boolean F1;
    public o4 F2;
    public final ah.c F3;
    public ci.d4 G0;
    public boolean G1;
    public boolean G2;
    public final fh.a G3;
    public ci.d4 H0;
    public long H1;
    public float H2;
    public final fh.d H3;
    public int I0;
    public final float I1;
    public h4 I2;
    public final dh.b I3;
    public final kc J0;
    public int J1;
    public t60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final h5 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final s3 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final e6 M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final d6 O1;
    public final org.telegram.ui.Components.g6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final n4 P0;
    public final com.google.firebase.messaging.n P1;
    public final org.telegram.ui.Components.g6 P2;
    public final d3 P3;
    public org.telegram.ui.Components.q6 Q0;
    public y5 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.q6 R0;
    public boolean R1;
    public long R2;
    public final d3 R3;
    public org.telegram.ui.Components.g6 S0;
    public m9 S1;
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
    public final r4 V3;
    public long W0;
    public n4 W1;
    public z40 W2;
    public final org.telegram.ui.Components.g6 W3;
    public long X0;
    public c X1;
    public final qv0 X2;
    public final org.telegram.ui.Components.g6 X3;
    public boolean Y0;
    public x2 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.g6 Y3;
    public boolean Z0;
    public y2 Z1;
    public k4 Z2;
    public float Z3;
    public boolean a1;
    public s2 a2;
    public FrameLayout a3;
    public final Path a4;
    public boolean b1;
    public b4 b2;
    public q4 b3;
    public boolean b4;
    public final b5 c1;
    public jh.h c2;
    public boolean c3;
    public ValueAnimator c4;
    public final FrameLayout d1;
    public ci.d4 d2;
    public d4 d3;
    public float d4;
    public final m4 e1;
    public ValueAnimator e2;
    public float e3;
    public final ImageReceiver f1;
    public kl0 f2;
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
    public final w4 j1;
    public hb j2;
    public boolean j3;
    public final fz k1;
    public ViewPropertyAnimator k2;
    public boolean k3;
    public m6 l1;
    public final ch.d l2;
    public final ImageReceiver l3;
    public float m1;
    public final ch.d m2;
    public zg.d m3;
    public final org.telegram.ui.Components.j9 n1;
    public final Paint n2;
    public final ImageReceiver n3;
    public final b6 o1;
    public int o2;
    public org.telegram.ui.Components.s5 o3;
    public final ib p1;
    public ValueAnimator p2;
    public boolean p3;
    public j6.l q1;
    public float q2;
    public boolean q3;
    public int r1;
    public float r2;
    public kl0 r3;
    public org.telegram.ui.ActionBar.f1 s1;
    public float s2;
    public boolean s3;
    public w5 t1;
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
    public final c6 x1;
    public boolean x2;
    public int x3;
    public final x5 y0;
    public final j6 y1;
    public int y2;
    public int y3;
    public final fk0 z0;
    public ArrayList z1;
    public final int z2;
    public d3 z3;

    public f6(Context context, final kc kcVar, c6 c6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.b1 = true;
        this.h1 = new ArrayList();
        this.r1 = -5;
        this.I1 = 1.0f;
        d6 d6Var = new d6(this);
        this.O1 = d6Var;
        this.q2 = -1.0f;
        this.r2 = -1.0f;
        this.s2 = -1.0f;
        this.z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.g6(this);
        this.P2 = new org.telegram.ui.Components.g6(this);
        qv0 qv0Var = new qv0();
        this.X2 = qv0Var;
        this.e3 = 1.0f;
        this.P3 = new d3(this, 4);
        this.R3 = new d3(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        final int i10 = 0;
        this.V3 = new r4(this, i10);
        this.W3 = new org.telegram.ui.Components.g6(this);
        this.X3 = new org.telegram.ui.Components.g6(this);
        this.Y3 = new org.telegram.ui.Components.g6(this);
        this.a4 = new Path();
        qv0Var.E = new pb.c(this, 2);
        e6 e6Var2 = new e6();
        e6Var2.g = new ArrayList();
        this.M2 = e6Var2;
        this.N2 = new AnimationNotificationsLocker();
        this.v1 = new ArrayList();
        this.w1 = new ArrayList();
        m4 m4Var = new m4(this, i10);
        this.e1 = m4Var;
        m4Var.setCrossfadeWithOldImage(false);
        m4Var.setAllowLoadingOnAttachedOnly(true);
        m4Var.ignoreNotifications = true;
        m4Var.setFileLoadingPriority(0);
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
        m4Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.n1 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        this.J0 = kcVar;
        this.x1 = c6Var;
        this.P1 = c6Var.g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        c6Var.l.setColor(-16777216);
        this.n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = e6Var;
        setClipChildren(false);
        w4 w4Var = new w4(this, context, this.c1, e6Var, kcVar);
        this.j1 = w4Var;
        dh.b bVar = new dh.b(e6Var, org.telegram.ui.ActionBar.i6.Sd, 0.8f);
        this.I3 = bVar;
        fh.c cVar = new fh.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.H3 = null;
            this.G3 = cVar;
        } else {
            fh.d dVar = new fh.d(cVar);
            this.H3 = dVar;
            dVar.g(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        }
        hh.j jVar = new hh.j(this);
        ah.c cVar2 = new ah.c(this.G3);
        cVar2.f = jVar;
        cVar2.g = this;
        this.F3 = cVar2;
        this.l2 = cVar2.c(this, bVar, false);
        ch.d c10 = cVar2.c(this, bVar, false);
        this.m2 = c10;
        c10.u(AndroidUtilities.dp(32.0f));
        b5 b5Var = new b5(this, context, c6Var, kcVar);
        this.c1 = b5Var;
        b5Var.setClipChildren(false);
        this.k1 = new fz(this.C2, b5Var);
        b5Var.addView(w4Var, w7.x5.d(-1.0f, -1));
        h5 h5Var = new h5(this, getContext(), kcVar.y, kcVar, e6Var);
        this.K0 = h5Var;
        h5Var.b0.setOnClickListener(new f3(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(c6Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new f3(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.z5.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(c6Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        n4 n4Var = new n4(this, getContext(), 1);
        this.P0 = n4Var;
        org.telegram.ui.Components.q6 q6Var = this.R0;
        if (q6Var != null) {
            q6Var.setCallback(n4Var);
        }
        n4Var.setWillNotDraw(false);
        n4Var.setOnClickListener(new f3(this, 12));
        n4 n4Var2 = new n4(this, getContext(), 2);
        this.D0 = n4Var2;
        org.telegram.ui.Components.q6 q6Var2 = this.Q0;
        if (q6Var2 != null) {
            q6Var2.setCallback(n4Var2);
        }
        n4Var2.setWillNotDraw(false);
        n4Var2.setOnClickListener(new f3(this, 13));
        n4Var2.setOnLongClickListener(new r3(i10, this, kcVar));
        r9 r9Var = new r9(context, c6Var);
        this.E0 = r9Var;
        r9Var.setPadding(dp, dp, dp, dp);
        n4Var2.addView(this.E0, w7.x5.e(40, 40, 3));
        n4Var.addView(imageView2, w7.x5.e(40, 40, 3));
        w7.z5.b(n4Var2, 0.3f, 5.0f);
        w7.z5.b(n4Var, 0.3f, 5.0f);
        m4Var.setAllowLoadingOnAttachedOnly(true);
        m4Var.setParentView(b5Var);
        j6 j6Var = new j6(10);
        this.y1 = j6Var;
        b5Var.setOutlineProvider(j6Var);
        b5Var.setClipToOutline(true);
        addView(b5Var);
        b6 b6Var = new b6(context, d6Var);
        this.o1 = b6Var;
        b6Var.setOnClickListener(new View.OnClickListener(this) { // from class: ai.a3
            public final /* synthetic */ f6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        f6 f6Var = this.b;
                        long j3 = UserConfig.getInstance(f6Var.C2).clientUserId;
                        long j10 = f6Var.B1;
                        kc kcVar2 = kcVar;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                kcVar2.H(zn.W9(j10));
                                break;
                            } else {
                                kcVar2.H(ProfileActivity.m4(j10));
                                break;
                            }
                        } else {
                            Bundle f7 = org.telegram.ui.Cells.c1.f(1, TeXSymbolParser.TYPE_ATTR);
                            f7.putLong("dialog_id", f6Var.B1);
                            kcVar2.H(new db0(f7, null));
                            break;
                        }
                    default:
                        f6 f6Var2 = this.b;
                        if (!f6Var2.O1.j()) {
                            f6Var2.c1(true);
                            break;
                        } else {
                            kcVar.O();
                            if (!kc.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            f6Var2.y0.setContentDescription(LocaleController.getString(!kc.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        b5Var.addView(b6Var, w7.x5.a(-2.0f, 0.0f, 17.0f, 0.0f, 0.0f, -1, 0));
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
        linearLayout.addView(n4Var, w7.x5.q(40, 40, 5));
        linearLayout.addView(n4Var2, w7.x5.q(40, 40, 5));
        addView(linearLayout, w7.x5.a(-2.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5));
        ImageView imageView3 = new ImageView(context);
        this.w0 = imageView3;
        imageView3.setImageDrawable(c6Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.i6.g0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        b5Var.addView(imageView3, w7.x5.a(40.0f, 2.0f, 15.0f, 2.0f, 0.0f, 40, 53));
        ImageView imageView4 = new ImageView(context);
        this.x0 = imageView4;
        imageView4.setImageDrawable(c6Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.g0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        b5Var.addView(imageView4, w7.x5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 40, 53));
        imageView4.setOnClickListener(new v0(kcVar, 1));
        imageView3.setOnClickListener(new s0(this, e6Var, kcVar, context, c6Var, 1));
        x5 x5Var = new x5(context, 0);
        this.y0 = x5Var;
        b5Var.addView(x5Var, w7.x5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 40, 53));
        fk0 fk0Var = new fk0(context);
        this.z0 = fk0Var;
        fk0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        x5Var.addView(fk0Var);
        ImageView imageView5 = new ImageView(context);
        this.A0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(c6Var.t);
        x5Var.addView(imageView5);
        imageView5.setVisibility(8);
        ob obVar = new ob(context);
        this.C0 = obVar;
        obVar.setOnClickListener(new f3(this, 2));
        b5Var.addView(obVar, w7.x5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 60, 53));
        final int i11 = 1;
        x5Var.setOnClickListener(new View.OnClickListener(this) { // from class: ai.a3
            public final /* synthetic */ f6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        f6 f6Var = this.b;
                        long j3 = UserConfig.getInstance(f6Var.C2).clientUserId;
                        long j10 = f6Var.B1;
                        kc kcVar2 = kcVar;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                kcVar2.H(zn.W9(j10));
                                break;
                            } else {
                                kcVar2.H(ProfileActivity.m4(j10));
                                break;
                            }
                        } else {
                            Bundle f7 = org.telegram.ui.Cells.c1.f(1, TeXSymbolParser.TYPE_ATTR);
                            f7.putLong("dialog_id", f6Var.B1);
                            kcVar2.H(new db0(f7, null));
                            break;
                        }
                    default:
                        f6 f6Var2 = this.b;
                        if (!f6Var2.O1.j()) {
                            f6Var2.c1(true);
                            break;
                        } else {
                            kcVar.O();
                            if (!kc.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            f6Var2.y0.setContentDescription(LocaleController.getString(!kc.D1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.p1 = new ib(this, c6Var);
        b5Var.addView(h5Var, w7.x5.a(-1.0f, 0.0f, 64.0f, 0.0f, 0.0f, -1, 0));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        s3 s3Var = new s3(this, context, kcVar, kcVar.v, view, frameLayout, kcVar);
        this.L0 = s3Var;
        b5Var.addView(view, w7.x5.e(-1, 200, 87));
        b5Var.addView(s3Var, w7.x5.a(-1.0f, 0.0f, 64.0f, 0.0f, 0.0f, -1, 0));
        b5Var.addView(frameLayout, w7.x5.a(100.0f, 0.0f, 55.0f, 0.0f, 0.0f, -1, 0));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        x5Var.setBackground(org.telegram.ui.ActionBar.i6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.i6.j0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.j0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.j0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        n4Var2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        n4Var.setBackground(org.telegram.ui.ActionBar.i6.j0(dp7, dp7, dp7, dp7, 0, k15, k15));
        org.telegram.ui.Cells.y9 y9Var = h5Var.W;
        View n10 = y9Var.n(context);
        if (n10 != null) {
            AndroidUtilities.removeFromParent(n10);
            addView(n10);
        }
        y9Var.D = new t3(this, 0);
        y9Var.S(this);
    }

    public static void V0(l9 l9Var, ImageReceiver imageReceiver, String str) {
        if (l9Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(l9Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(l9Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(f6 f6Var, ValueAnimator valueAnimator) {
        ob obVar = f6Var.C0;
        f6Var.d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b6 b6Var = f6Var.o1;
        b6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.d4);
        b6Var.setAlpha(1.0f - f6Var.d4);
        ImageView imageView = f6Var.w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.d4);
        imageView.setAlpha(1.0f - f6Var.d4);
        ImageView imageView2 = f6Var.x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.d4);
        imageView2.setAlpha(1.0f - f6Var.d4);
        x5 x5Var = f6Var.y0;
        x5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.d4);
        x5Var.setAlpha((1.0f - f6Var.d4) * f6Var.e3);
        n4 n4Var = f6Var.W1;
        if (n4Var != null) {
            n4Var.setTranslationY(AndroidUtilities.dp(8.0f) * f6Var.d4);
            f6Var.W1.setAlpha(1.0f - f6Var.d4);
        }
        if (obVar != null) {
            obVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.d4);
            obVar.setAlpha(1.0f - f6Var.d4);
        }
        f6Var.K0.setAlpha(1.0f - f6Var.d4);
        y5 y5Var = f6Var.Q1;
        float f7 = y5Var == null ? 0.0f : ((bc) y5Var).d.V;
        float hideInterfaceAlpha = f6Var.getHideInterfaceAlpha();
        n4 n4Var2 = f6Var.D0;
        if (n4Var2 != null) {
            n4Var2.setAlpha((1.0f - f6Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = f6Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - f6Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        n4 n4Var3 = f6Var.P0;
        if (n4Var3 != null) {
            n4Var3.setAlpha((1.0f - f6Var.d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        b4 b4Var = f6Var.b2;
        if (b4Var != null) {
            b4Var.setAlpha(1.0f - f6Var.d4);
            f6Var.invalidate();
        }
        f6Var.c1.invalidate();
    }

    public static void a0(f6 f6Var, boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = f6Var.D3;
        if (f1Var == null || f6Var.C3 == null || f1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(kc.B1 - 0.2f) < 0.05f) {
                f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(kc.B1 - 0.5f) < 0.05f) {
                f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(kc.B1 - 1.0f) < 0.05f) {
                f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(kc.B1 - 1.5f) < 0.05f) {
                f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(kc.B1 - 2.0f) < 0.05f) {
                f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                f6Var.D3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, hd.a(kc.B1) + "x"));
            }
        }
        f6Var.C3.a(kc.B1, z10);
    }

    public static void b0(f6 f6Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (f6Var.I0() || f6Var.O1.f) {
            return;
        }
        if (UserConfig.getInstance(f6Var.C2).isPremium()) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, f6Var.B0).setOnClickListener(new f3(f6Var, 8));
            return;
        }
        Drawable drawable = f6Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        u3 u3Var = new u3(f6Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, f6Var.B0);
        c10.setOnClickListener(new f3(f6Var, 9));
        c10.setIcon(u3Var);
    }

    public static void d0(f6 f6Var) {
        d6 d6Var = f6Var.O1;
        TL_stories.StoryItem storyItem = d6Var.a;
        if ((storyItem == null && d6Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = d6Var.h();
        boolean z10 = d6Var.e;
        if (h == null || !h.exists()) {
            f6Var.a1();
            return;
        }
        MediaController.saveFile(h.toString(), f6Var.getContext(), z10 ? 1 : 0, null, null, new j3(0, f6Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(f6 f6Var, long j3) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(j3));
            str = user.first_name;
            z10 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(f6Var.C2).getChat(Long.valueOf(-j3));
            str = chat2.title;
            z10 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new i3(f6Var, MessagesController.getInstance(f6Var.C2), j3, !z10, str, chat), 200L);
    }

    public static void f0(f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f6Var.getContext(), 0, f6Var.B0);
        alertDialog$Builder.a.R = LocaleController.getString(f6Var.I0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.T = LocaleController.getString(f6Var.I0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new z2(f6Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new w1(6));
        bc bcVar = (bc) f6Var.Q1;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        bcVar.h(b2Var);
        b2Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f7 = 1.0f - this.O2.c;
        t7 t7Var = this.J0.w;
        return (1.0f - (t7Var == null ? 0.0f : t7Var.f)) * f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        kc kcVar;
        if (!this.O1.f || (kcVar = this.J0) == null || kcVar.A0 == null || D0(true)) {
            return 0L;
        }
        return kcVar.A0.j();
    }

    public static void h0(f6 f6Var) {
        org.telegram.ui.ActionBar.e6 e6Var = f6Var.B0;
        b5 b5Var = f6Var.c1;
        if (f6Var.G1) {
            return;
        }
        int i10 = 0;
        if (!f6Var.E1) {
            b4 b4Var = f6Var.b2;
            int i11 = -f6Var.r1;
            f6Var.r1 = i11;
            AndroidUtilities.shakeViewSpring(b4Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = f6Var.B1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1))) : "";
            (MessagesController.getInstance(f6Var.C2).premiumFeaturesBlocked() ? new ad(b5Var, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new ad(b5Var, e6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new d3(f6Var, 5))).j();
            return;
        }
        if (f6Var.J3 != null && f6Var.K3 != null) {
            rg.j0.D1(new z3(f6Var, i10), f6Var.J3, f6Var.K3, f6Var.B1, true);
            return;
        }
        kc kcVar = f6Var.J0;
        if (kcVar != null) {
            kcVar.k1 = true;
            kcVar.P();
        }
        MessagesController.getInstance(f6Var.C2).getBoostsController().getBoostsStats(f6Var.B1, new g3(f6Var, i10));
    }

    public static void j0(f6 f6Var) {
        d6 d6Var = f6Var.O1;
        if (d6Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = d6Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(f6Var.B1);
        ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_exportStoryLink, new l4());
    }

    public final void A0() {
        if (this.b3 != null) {
            return;
        }
        q4 q4Var = new q4(getContext(), 0);
        this.b3 = q4Var;
        q4Var.setTextSize(1, 14.0f);
        this.b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.b3.setGravity(19);
        this.b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.b3, w7.x5.a(40.0f, 16.0f, 0.0f, 16.0f, 0.0f, -2, 3));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        n4 n4Var = new n4(this, getContext(), 0);
        this.W1 = n4Var;
        n4Var.setClickable(true);
        addView(this.W1, w7.x5.a(48.0f, 0.0f, 0.0f, 136.0f, 0.0f, -1, 48));
        o4 o4Var = new o4(this, getContext());
        this.F2 = o4Var;
        o4Var.setOnClickListener(new f3(this, 0));
        this.W1.addView(this.F2, w7.x5.a(32.0f, 9.0f, 11.0f, 0.0f, 0.0f, -1, 0));
        h0 h0Var = new h0(0, getContext(), false);
        this.B2 = h0Var;
        h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.x5.a(28.0f, 13.0f, 13.0f, 0.0f, 0.0f, -1, 0));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.x5.a(-2.0f, 0.0f, 16.0f, 0.0f, 9.0f, -2, 0));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.x1.s);
        o4 o4Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        o4Var2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.N(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
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
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        TextView textView2 = new TextView(getContext());
        w7.z5.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.i6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w02, k10, k10));
        textView2.setOnClickListener(new f3(this, 3));
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        linearLayout.addView(textView2, w7.x5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.x5.a(-2.0f, 72.0f, 0.0f, 72.0f, 0.0f, -1, 17));
        this.c1.addView(frameLayout);
        this.a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        d2 d2Var;
        TLRPC.Peer i10;
        d2 d2Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        long j3 = this.B1;
        kc kcVar = this.J0;
        if (j3 >= 0 || (d2Var2 = kcVar.A0) == null) {
            if (j3 < 0 || kcVar == null || (d2Var = kcVar.A0) == null || !d2Var.l()) {
                return false;
            }
            return !z10 || (i10 = kcVar.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i11 = d2Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
        if (kcVar.A0.l() || ChatObject.canManageCalls(chat)) {
            return i11 == null || this.B1 == DialogObject.getPeerDialogId(i11) || DialogObject.getPeerDialogId(i11) == UserConfig.getInstance(this.C2).getClientUserId();
        }
        return false;
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        e6 e6Var = this.M2;
        org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) e6Var.e;
        if (l4Var != null && ((SurfaceView) e6Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) e6Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (l4Var != null && (textureView = (TextureView) e6Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        b5 b5Var = this.c1;
        canvas.scale(i10 / b5Var.getMeasuredWidth(), i11 / b5Var.getMeasuredHeight());
        this.e1.draw(canvas);
        canvas.restore();
    }

    public final void F0(ci.da daVar, TL_stories.StoryItem storyItem) {
        y5 y5Var = this.Q1;
        ci.fa faVar = new ci.fa(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.B0);
        faVar.r1(daVar);
        ci.h1 h1Var = faVar.b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof ci.y9) {
                    ((ci.y9) view).e(false);
                }
            }
        }
        faVar.l1(true);
        faVar.T = new ah.b(1, this, storyItem);
        ((bc) y5Var).h(faVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r3 == r10.f2) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G0(ViewGroup viewGroup, float f7, float f10, boolean z10) {
        ci.d4 d4Var;
        e6 e6Var;
        org.telegram.ui.l4 l4Var;
        if (viewGroup != null) {
            ci.d4 d4Var2 = this.F0;
            if ((d4Var2 == null || !d4Var2.V) && ((d4Var = this.G0) == null || !d4Var.V)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        h5 h5Var = this.K0;
                        if (childAt == h5Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f7, (int) f10)) {
                                float top = f10 - childAt.getTop();
                                xa xaVar = h5Var.b0;
                                if (xaVar.w == 1.0f && !h5Var.s0) {
                                    if (top > xaVar.getTranslationY() + (h5Var.r0.getTop() - h5Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.c1 || (e6Var = this.M2) == null || (l4Var = (org.telegram.ui.l4) e6Var.e) == null || !G0(l4Var, f7 - childAt.getX(), f10 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f7, (int) f10))) {
                            w4 w4Var = this.j1;
                            if (childAt == w4Var && w4Var.b == null && (f7 < AndroidUtilities.dp(60.0f) || f7 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = w4Var.e;
                                float[] fArr = w4Var.f;
                                for (int i11 = 0; i11 < w4Var.getChildCount(); i11++) {
                                    View childAt2 = w4Var.getChildAt(i11);
                                    if (childAt2 != w4Var.d && (childAt2 instanceof qb)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f7;
                                        fArr[1] = f10;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                s3 s3Var = this.L0;
                                if (childAt == s3Var) {
                                    fc1 fc1Var = s3Var.f;
                                    w0 w0Var = s3Var.c;
                                    fc1 fc1Var2 = s3Var.f;
                                    fc1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f7 - s3Var.getX()) - fc1Var2.getX()), (int) ((f10 - s3Var.getY()) - fc1Var2.getY()))) {
                                        if (s3Var.f0) {
                                            continue;
                                        } else if (!this.v2) {
                                            if (f10 <= s3Var.s() + s3Var.getY() && w0Var.E(f7, (f10 - s3Var.getY()) - w0Var.getY()) == null) {
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
                                            b4 b4Var = this.b2;
                                            if (b4Var != null && childAt == b4Var.getRecordCircle()) {
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
        b5 b5Var = this.c1;
        float x11 = view.getX() + b5Var.getX() + x10;
        float y3 = view.getY() + b5Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ((float) view.getHeight());
    }

    public final boolean I0() {
        e9 e9Var;
        kc kcVar = this.J0;
        return (kcVar == null || (e9Var = kcVar.O0) == null || e9Var.e != 4) ? false : true;
    }

    public final boolean J0() {
        TLRPC.User user;
        return I0() && (user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.J0.O0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean K0();

    public final void L0(zg.n0 n0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        d6 d6Var = this.O1;
        TL_stories.StoryItem storyItem = d6Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && n0Var == null) {
            l0();
            this.S1.g0(this.B1, d6Var.a, null);
        } else if (n0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = zg.j0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.q3 = true;
                this.S1.g0(this.B1, d6Var.a, zg.n0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, d6Var.a, n0Var);
        }
        TL_stories.StoryItem storyItem2 = d6Var.a;
        n4 n4Var = this.D0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.E0.setReaction(null);
            n4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.E0.setReaction(zg.n0.d(reaction));
            n4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.D1 && z11) {
            TL_stories.StoryItem storyItem3 = d6Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = d6Var.a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = d6Var.a;
        zg.p0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        d2 d2Var;
        if (this.O3 != null) {
            return;
        }
        kc kcVar = this.J0;
        if (kcVar != null && (d2Var = kcVar.A0) != null) {
            if (d2Var.v == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.C2).getSendAsPeers(this.B1, true);
        this.O3 = sendAsPeers;
        b4 b4Var = this.b2;
        if (b4Var == null || sendAsPeers == null) {
            return;
        }
        b4Var.O1(true);
    }

    public final boolean N0() {
        b4 b4Var = this.b2;
        if (b4Var == null) {
            return false;
        }
        boolean z10 = b4Var.z2;
        if (z10) {
            b4Var.q1();
        }
        AndroidUtilities.runOnUIThread(new d3(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j3;
        g3 g3Var;
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
        g3 g3Var2 = new g3(this, 1);
        d dVar = new d();
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, (org.telegram.ui.ActionBar.e6) dVar, false);
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
            g3Var = g3Var2;
            i10 = ((org.telegram.ui.Components.b6[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.b6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j3 = j11;
            g3Var = g3Var2;
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
        final er[] erVarArr = new er[1];
        final ci.d dVar2 = new ci.d(context, null, true);
        final m1 m1Var = new m1();
        m1Var.c = clientUserId;
        m1Var.f = textWithEntities;
        m1Var.g = jArr[0];
        final h1 h1Var = new h1(i12, context, true);
        LinearLayout e7 = bi.e(context, 0);
        final f0 f0Var = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), dVar);
        e7.addView(f0Var, w7.x5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final f0 f0Var2 = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), dVar);
        e7.addView(f0Var2, w7.x5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final f0 f0Var3 = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), dVar);
        e7.addView(f0Var3, w7.x5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final e0 e0Var = new e0(context, dVar, r6);
        final boolean[] zArr = {true};
        g3 g3Var3 = g3Var;
        long j12 = j10;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() { // from class: ai.c0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar2.g(yh.p7.W0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), erVarArr), true, true);
                long j13 = jArr2[0];
                m1 m1Var2 = m1Var;
                m1Var2.g = j13;
                h1Var.set(m1Var2);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = g0.b(i16, intValue2, 0);
                int b11 = g0.b(i16, num.intValue(), 1);
                int b12 = g0.b(i16, num.intValue(), 2);
                ((org.telegram.ui.Components.r6) f0Var.b).c(b10 >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.r6) f0Var2.b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.r6) f0Var3.b).c(LocaleController.formatNumber(b12, ','), true, true);
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
        linearLayout.addView(e0Var, w7.x5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(e7, w7.x5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.i6.j5;
        TextView b10 = w7.b6.b(context, 20.0f, i21, true, dVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.x5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.b6.b(context, 14.0f, i21, false, dVar);
        b11.setGravity(17);
        bi.r(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.x5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(h1Var, w7.x5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar2, w7.x5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        f3Var.show();
        dVar2.setOnClickListener(new d0(g3Var3, jArr, f3Var, 0));
    }

    public final void P0() {
        if (this.b2 == null) {
            return;
        }
        t0();
        this.I2.j0.f0();
        this.I2.N1(-1, true);
        h4 h4Var = this.I2;
        h4Var.Z = this.B1;
        h4Var.t1();
        this.I2.o1().setText(this.b2.getFieldText());
        ((bc) this.Q1).h(this.I2);
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
        this.J0.H(new zn(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(long j3) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        long j10;
        ci.j4 j4Var;
        d2 d2Var;
        boolean z10 = this.K1;
        e6 e6Var = this.M2;
        if (!z10) {
            e6Var.e = null;
            return;
        }
        d6 d6Var = this.O1;
        boolean z11 = d6Var.f;
        b5 b5Var = this.c1;
        if (!z11) {
            if (!d6Var.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j3 + "): null, not a video");
                ((bc) this.Q1).c(null, null, 0L, this.M2);
                e6Var.e = null;
                e6Var.a = false;
                return;
            }
            if (d6Var.f() == null || !new File(d6Var.f()).exists()) {
                TL_stories.StoryItem storyItem = d6Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.B1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = d6Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.C2).getFileReference(d6Var.a);
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
                            sb2.append(d6Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(d6Var.a.id);
                            sb2.append("&did=");
                            sb2.append(d6Var.a.dialogId);
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
                            ((bc) this.Q1).c(document, uri, j3, this.M2);
                            b5Var.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(d6Var.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j3 + "): playing from attachPath " + fromFile);
                this.R2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j3 + "): playing from null?");
            }
            ((bc) this.Q1).c(document, uri, j3, this.M2);
            b5Var.invalidate();
            return;
        }
        y5 y5Var = this.Q1;
        TL_stories.StoryItem storyItem3 = d6Var.a;
        long j11 = this.B1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        bc bcVar = (bc) y5Var;
        bcVar.i(true, true);
        kc kcVar = bcVar.d;
        d2 d2Var2 = kcVar.A0;
        if (d2Var2 == null || d2Var2.b != j11 || !d2Var2.f(inputGroupCall)) {
            ci.j4 j4Var2 = kcVar.D0;
            if (j4Var2 != null) {
                j4Var2.d(j11, null);
                ci.j4 j4Var3 = kcVar.D0;
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
            n2 n2Var = n2.Z;
            if (n2Var.S && (d2Var = n2Var.v) != null && d2Var.f(inputGroupCall)) {
                d2 d2Var3 = n2Var.v;
                n2Var.v = null;
                kcVar.A0 = d2Var3;
                n2Var.k(false);
            } else {
                d2 d2Var4 = kcVar.A0;
                if (d2Var4 != null) {
                    if (!d2Var4.n && (!n2Var.S || n2Var.v != d2Var4)) {
                        d2Var4.e();
                    } else if (d2Var4.O != kcVar.D0.getSink()) {
                        kcVar.A0.s(null);
                    }
                    kcVar.A0 = null;
                }
            }
            if (n2Var.S) {
                n2.j();
            }
            jc jcVar = kcVar.z0;
            if (jcVar != null) {
                jcVar.release(null);
                kcVar.z0 = null;
            }
            e6 e6Var2 = kcVar.G0;
            if (e6Var2 != null) {
                e6Var2.c = null;
                e6Var2.b = null;
                e6Var2.a = false;
                e6Var2.e = null;
                e6Var2.f = null;
                e6Var2.d = null;
                e6Var2.b();
                kcVar.G0 = null;
            }
            if (kcVar.A0 == null) {
                d2 d2Var5 = d2.W;
                if (d2Var5 == null || !d2Var5.f(inputGroupCall)) {
                    d2 d2Var6 = new d2(bcVar.c, kcVar.h, storyItem3, j11, i10, z12, inputGroupCall, false, false);
                    j10 = j11;
                    kcVar.A0 = d2Var6;
                    j4Var = kcVar.E0;
                    if (j4Var == null) {
                        kcVar.A0.s(j4Var.getSink());
                    } else {
                        kcVar.A0.s(kcVar.D0.getSink());
                    }
                    kcVar.G0 = e6Var;
                    e6Var.a = false;
                    e6Var.e = kcVar.y0;
                    ci.j4 j4Var4 = kcVar.D0;
                    e6Var.f = j4Var4.d;
                    e6Var.d = j4Var4.c;
                    e6Var.b = kcVar.A0;
                    j4Var4.d(j10, e6Var);
                    kcVar.G0.b();
                } else {
                    kcVar.A0 = d2.W;
                }
            }
            j10 = j11;
            j4Var = kcVar.E0;
            if (j4Var == null) {
            }
            kcVar.G0 = e6Var;
            e6Var.a = false;
            e6Var.e = kcVar.y0;
            ci.j4 j4Var42 = kcVar.D0;
            e6Var.f = j4Var42.d;
            e6Var.d = j4Var42.c;
            e6Var.b = kcVar.A0;
            j4Var42.d(j10, e6Var);
            kcVar.G0.b();
        }
        b5Var.invalidate();
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
            } catch (Exception e7) {
                FileLog.e(e7);
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

    public final void T0(long j3, boolean z10) {
        if (this.K1 != z10) {
            this.K1 = z10;
            fk0 fk0Var = this.z0;
            if (z10) {
                if (this.J0.a && Build.VERSION.SDK_INT < 33) {
                    kc kcVar = ((bc) this.Q1).d;
                    kcVar.l1 = true;
                    kcVar.P();
                    r4 r4Var = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(r4Var);
                    AndroidUtilities.runOnUIThread(r4Var, 100L);
                }
                R0(j3);
                g1();
                fk0Var.setAnimation(this.x1.u);
                this.K1 = true;
                this.o1.a.getImageReceiver().setVisible(true, true);
                d6 d6Var = this.O1;
                if (d6Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + d6Var.a.id + " " + d6.c(d6Var));
                }
            } else {
                p0();
                fk0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.c1.invalidate();
                invalidate();
                q0();
                kc kcVar2 = ((bc) this.Q1).d;
                kcVar2.I0 = false;
                kcVar2.P();
            }
            this.e1.setFileLoadingPriority(this.K1 ? 3 : 2);
            this.f1.setFileLoadingPriority(this.K1 ? 2 : 0);
            this.g1.setFileLoadingPriority(this.K1 ? 2 : 0);
            if (this.C1 || this.D1) {
                m9 m9Var = this.S1;
                long j10 = this.B1;
                boolean z11 = this.K1;
                a0.i iVar = m9Var.m;
                tc tcVar = (tc) iVar.f(j10);
                if (tcVar == null) {
                    tcVar = new tc(m9Var.a, j10, m9Var);
                    iVar.k(tcVar, j10);
                }
                tcVar.b(z11);
            }
        }
    }

    public final void U0(int i10, long j3) {
        if (this.B1 != j3) {
            d6 d6Var = this.O1;
            d6Var.b = null;
            d6Var.a = null;
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
        m9 m9Var = this.S1;
        TL_stories.PeerStories y3 = m9Var.y(j3);
        if (y3 == null) {
            y3 = m9Var.z(j3);
        } else {
            z10 = false;
        }
        m9Var.S(y3, z10);
    }

    public final void W0(long j3, boolean z10, boolean z11) {
        if (!z10 && j3 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j3;
        this.N3 = z11;
        b6 b6Var = this.o1;
        if (j3 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j3));
            a6 a6Var = b6Var.b;
            a6 a6Var2 = b6Var.b;
            a6Var.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                a6Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            fr frVar = new fr(mutate, null);
            frVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            frVar.h = dp;
            frVar.n = dp2;
            a6Var2.i(frVar);
            return;
        }
        if (this.C1 && !z11) {
            b6Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            b6Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j3));
        if (user == null || !user.verified) {
            b6Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            fr frVar2 = new fr(mutate2, null);
            frVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            frVar2.h = dp3;
            frVar2.n = dp4;
            b6Var.b.i(frVar2);
        }
        if (user != null) {
            b6Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), b6Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            b6Var.b.l(null, false);
        }
    }

    public final void X0(float f7, float f10, m6 m6Var) {
        this.m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 == m6Var) {
            return;
        }
        this.l1 = m6Var;
        if (m6Var != null) {
            ImageReceiver imageReceiver = m6Var.a;
            if (imageReceiver.getBitmap() != null) {
                this.e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void Y0(boolean z10) {
        d6 d6Var = this.O1;
        if (d6Var.a != null) {
            kc kcVar = this.J0;
            if (kcVar.f != null) {
                String e7 = d6Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e7);
                    LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                k4 k4Var = new k4(this, kcVar.f.getContext(), e7, e7, MessagesController.getInstance(this.C2).storiesEnabled() && (!(this.D1 || UserObject.isService(this.B1)) || ChatObject.isPublic(this.D1 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null)), new y3(2, this.B0));
                this.Z2 = k4Var;
                k4Var.i0 = true;
                TL_stories.StoryItem storyItem = d6Var.a;
                storyItem.dialogId = this.B1;
                k4Var.F0 = storyItem;
                k4Var.s0 = new xa.d(this, 2);
                ((bc) this.Q1).h(k4Var);
            }
        }
    }

    public final void Z0() {
        b5 b5Var = this.c1;
        org.telegram.ui.ActionBar.e6 e6Var = this.B0;
        bi.q(R.string.UnsupportedAttachment, new ad(b5Var, e6Var), e6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.T = string;
        ((bc) this.Q1).h(b2Var);
    }

    public final void b1(boolean z10) {
        if (this.s3 != z10) {
            d6 d6Var = this.O1;
            if (d6Var.a == null) {
                return;
            }
            this.s3 = z10;
            int i10 = 0;
            if (z10) {
                this.r3.setVisibility(0);
            }
            this.r3.setStoryItem(d6Var.a);
            kc kcVar = ((bc) this.Q1).d;
            kcVar.p1 = z10;
            kcVar.P();
            if (!z10) {
                if (this.r3.getReactionsWindow() != null) {
                    this.r3.getReactionsWindow().e();
                }
                this.r3.animate().alpha(0.0f).setDuration(150L).setListener(new w3(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t3, z10 ? 1.0f : 0.0f);
            this.r3.setTransitionProgress(this.t3);
            ofFloat.addUpdateListener(new e3(this, 1));
            ofFloat.addListener(new v3(this, z10, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(hs.g);
            ofFloat.start();
        }
    }

    public final void c1(boolean z10) {
        if (this.G0 == null) {
            ci.d4 d4Var = new ci.d4(getContext(), 1);
            d4Var.l(1.0f, -56.0f);
            this.G0 = d4Var;
            d4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.c1.addView(this.G0, w7.x5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 55));
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
        kc kcVar = this.J0;
        boolean z10 = false;
        if (i10 == i12 || (i10 == NotificationCenter.storiesListUpdated && kcVar.O0 == objArr[0])) {
            y5 y5Var = this.Q1;
            if (y5Var == null || !((bc) y5Var).d.H0) {
                if (this.K1) {
                    j1();
                    if (this.A1 == 0) {
                        if (this.E2) {
                            return;
                        }
                        this.E2 = true;
                        ((bc) this.Q1).j();
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
                TL_stories.PeerStories peerStories = kcVar.Q0;
                if (peerStories != null) {
                    this.S1.S(peerStories, true);
                } else {
                    long j3 = this.B1;
                    if (j3 != 0) {
                        m9 m9Var = this.S1;
                        TL_stories.PeerStories y3 = m9Var.y(j3);
                        if (y3 == null) {
                            y3 = m9Var.z(j3);
                            z10 = true;
                        }
                        m9Var.S(y3, z10);
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
            g9 o9 = MessagesController.getInstance(this.C2).getStoriesController().o();
            if (o9 == null || !o9.a(this.C2, 1) || this.Q1 == null) {
                return;
            }
            z3 z3Var = new z3(this, 0);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            ((bc) this.Q1).h(new rg.j0(o9.b(), this.C2, findActivity, z3Var, null));
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
        if (kcVar == null || (d2Var = kcVar.A0) == null || d2Var.g() != longValue) {
            return;
        }
        f1(false);
        b4 b4Var = this.b2;
        if (b4Var != null) {
            b4Var.I(true);
            this.b2.O1(true);
            r0(true);
        }
        s3 s3Var = this.L0;
        if (s3Var != null) {
            d2 d2Var2 = s3Var.P;
            if (s3Var.H != (d2Var2 != null ? d2Var2.j() : 0L)) {
                s3Var.e.N(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ne neVar;
        Canvas canvas2;
        org.telegram.ui.Components.q6 q6Var;
        org.telegram.ui.Components.q6 q6Var2;
        l1();
        if (this.D1 && (q6Var2 = this.Q0) != null) {
            q6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (q6Var = this.R0) != null) {
            q6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.u3;
        LinearLayout linearLayout = this.O0;
        n4 n4Var = this.D0;
        if (z10) {
            float measuredWidth = (n4Var.getMeasuredWidth() / 2.0f) + n4Var.getX() + linearLayout.getX();
            float measuredHeight = (n4Var.getMeasuredHeight() / 2.0f) + n4Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.w3, measuredWidth - f7, hs.g.getInterpolation(this.v3));
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
            float measuredWidth2 = (n4Var.getMeasuredWidth() / 2.0f) + n4Var.getX() + linearLayout.getX();
            float measuredHeight2 = (n4Var.getMeasuredHeight() / 2.0f) + n4Var.getY() + linearLayout.getY();
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
        b4 b4Var = this.b2;
        if (b4Var != null) {
            pe peVar = b4Var.y1;
            ne neVar2 = b4Var.z1;
            if (b4Var.getAlpha() == 0.0f || (neVar = b4Var.e1) == null || neVar.getParent() == null || b4Var.e1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(b4Var.e1.getX() + peVar.getX() + neVar2.getX() + b4Var.getX(), b4Var.e1.getY() + peVar.getY() + neVar2.getY() + b4Var.getY());
            if (b4Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, b4Var.getMeasuredWidth(), b4Var.getMeasuredHeight(), (int) (b4Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            b4Var.e1.draw(canvas2);
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
        b4 b4Var = this.b2;
        Paint paint = this.n2;
        n4 n4Var = this.D0;
        c6 c6Var = this.x1;
        if (view == b4Var) {
            float f7 = this.q2;
            d6 d6Var = this.O1;
            if (f7 > 0.0f && !d6Var.f) {
                c6Var.l.setAlpha((int) (f7 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), c6Var.l);
            }
            RectF rectF = c6Var.h;
            RectF rectF2 = c6Var.i;
            RectF rectF3 = c6Var.j;
            rectF.set(this.b2.getX(), this.b2.getY() + this.b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.b2.getX() + this.b2.getMeasuredWidth(), this.b2.getY() + this.b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (d6Var.f) {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                s2 s2Var = this.a2;
                if (s2Var != null && s2Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (n4Var != null && n4Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + n4Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.b2.getY() + this.b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.b2.setTranslationX((1.0f - this.q2) * dp);
            this.b2.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.y(1.0f, this.q2, -AndroidUtilities.dp(2.0f), this.b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.q2) * (this.b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, c6Var.h, this.q2, rectF3);
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
            if (b4Var != null && b4Var.s0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = c6Var.k;
                RectF rectF5 = c6Var.k;
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
                    view.setTranslationY((this.O0.getY() + (n4Var.getY() + (-(r2.getMeasuredHeight() - this.r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    b5 b5Var = this.c1;
                    if (view == b5Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(b5Var.getX(), b5Var.getY());
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
            k4 k4Var = this.Z2;
            if (k4Var != null) {
                k4Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new d3(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x094b, code lost:
    
        if (r15.g == (r2 == null && r2.translated && r2.translatedText != null && android.text.TextUtils.equals(r2.translatedLng, org.telegram.ui.Components.b51.D()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x09ab, code lost:
    
        if (r3 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x09ce, code lost:
    
        if (r3 != false) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0ae1, code lost:
    
        if (r4 != false) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0af9, code lost:
    
        if (r4 != false) goto L556;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0c99  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0d19  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0d68  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0d7f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0da8 A[EDGE_INSN: B:310:0x0da8->B:311:0x0da8 BREAK  A[LOOP:0: B:299:0x0d86->B:308:0x0da5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0db6  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0dc5  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0e1a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0e5a  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0e69  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0f23  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0f54  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0f63  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0f89  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0faa  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0fda  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0ff6  */
    /* JADX WARN: Removed duplicated region for block: B:405:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0fca  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0ed3  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0e63  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0e2b  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0e11  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0408  */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73, types: [ai.ta, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z10) {
        l9 l9Var;
        TL_stories.StoryItem storyItem;
        l9 l9Var2;
        boolean z11;
        boolean z12;
        int i10;
        fz fzVar;
        int i11;
        TL_stories.StoryItem storyItem2;
        m4 m4Var;
        boolean z13;
        hc hcVar;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        kc kcVar;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem4;
        boolean z14;
        boolean z15;
        TL_stories.StoryItem storyItem5;
        kc kcVar2;
        l9 l9Var3;
        TLRPC.MessageMedia messageMedia;
        ci.l8 l8Var;
        TL_stories.StoryItem storyItem6;
        l9 l9Var4;
        int i12;
        ci.l8 l8Var2;
        boolean z16;
        b5 b5Var;
        h5 h5Var;
        b6 b6Var;
        b4 b4Var;
        boolean z17;
        l9 l9Var5;
        org.telegram.ui.Components.tc tcVar;
        boolean z18;
        TL_stories.StoryItem storyItem7;
        int i13;
        m4 m4Var2;
        boolean z19;
        l9 l9Var6;
        d6 d6Var;
        boolean z20;
        boolean z21;
        b5 b5Var2;
        h5 h5Var2;
        boolean z22;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        SpannableStringBuilder spannableStringBuilder;
        int i14;
        CharSequence charSequence2;
        TLRPC.MessageMedia messageMedia2;
        boolean z23;
        ci.d4 d4Var;
        ci.d4 d4Var2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence4;
        TL_stories.StoryItem storyItem10;
        y5 y5Var;
        boolean z24;
        boolean z25;
        LinearLayout linearLayout;
        boolean z26;
        boolean z27;
        b4 b4Var2;
        b4 b4Var3;
        int i15;
        boolean z28;
        boolean z29;
        boolean z30;
        int i16;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        jh.h hVar;
        c cVar;
        s2 s2Var;
        boolean z35;
        TL_stories.StoryItem storyItem11;
        boolean z36;
        int i17;
        int i18;
        boolean z37;
        boolean z38;
        boolean l4;
        l9 l9Var7;
        l9 l9Var8;
        ci.d4 d4Var3;
        int i19;
        ImageView imageView;
        ImageView imageView2;
        boolean z39;
        int i20;
        boolean z40;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i21;
        int i22;
        int i23;
        boolean z41;
        int i24;
        boolean z42;
        boolean z43;
        TL_stories.StoryItem storyItem13;
        int i25;
        int i26;
        FrameLayout.LayoutParams layoutParams;
        int dp;
        boolean z44;
        boolean z45;
        int i27;
        boolean z46;
        d2 d2Var;
        int i28;
        boolean z47;
        int i29;
        boolean z48;
        int i30;
        boolean z49;
        boolean z50;
        boolean z51;
        d2 d2Var2;
        String str;
        BitmapDrawable bitmapDrawable;
        m4 m4Var3;
        boolean z52;
        kc kcVar3;
        fz fzVar2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        e9 e9Var;
        ArrayList arrayList2 = this.v1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.w1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.V2 = true;
        d6 d6Var2 = this.O1;
        TL_stories.StoryItem storyItem14 = d6Var2.a;
        l9 l9Var9 = d6Var2.b;
        String s10 = ja.s();
        this.Z0 = false;
        this.c3 = false;
        int i31 = this.J1;
        boolean z53 = this.T1;
        boolean z54 = this.U1;
        boolean z55 = this.V1;
        kc kcVar4 = this.J0;
        if (kcVar4 == null || (e9Var = kcVar4.O0) == null || e9Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i31 < 0 || i31 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i31);
            int size = i31 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            l9Var = (size < 0 || size >= arrayList3.size()) ? null : (l9) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            l9Var = (i31 < 0 || i31 >= arrayList3.size()) ? null : (l9) arrayList3.get(i31);
            int size2 = i31 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        d6Var2.c = null;
        w4 w4Var = this.j1;
        int i32 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        fz fzVar3 = this.k1;
        m4 m4Var4 = this.e1;
        if (l9Var != null) {
            ci.l8 l8Var3 = l9Var.c;
            this.U1 = false;
            boolean z56 = l9Var.I;
            this.V1 = z56;
            this.T1 = !z56;
            m4Var4.setCrossfadeWithOldImage(false);
            m4Var4.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = l8Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (l9Var.s || l9Var.H) {
                l9Var2 = l9Var9;
                m4Var3 = m4Var4;
                z11 = z53;
                z52 = z54;
                z12 = z55;
                kcVar3 = kcVar4;
                i10 = i31;
                fzVar2 = fzVar3;
                r62 = 0;
                i11 = 4;
                this.e1.setImage(null, null, ImageLocation.getForPath(l9Var.f), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                i11 = 4;
                l9Var2 = l9Var9;
                fzVar2 = fzVar3;
                r62 = 0;
                m4Var3 = m4Var4;
                z11 = z53;
                z12 = z55;
                z52 = z54;
                kcVar3 = kcVar4;
                i10 = i31;
                this.e1.setImage(null, null, ImageLocation.getForPath(l9Var.e), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            d6Var2.b = l9Var;
            d6Var2.j = r62;
            d6Var2.i = r62;
            d6Var2.a = r62;
            d6Var2.d = false;
            d6Var2.e = d6Var2.m();
            TL_stories.StoryItem storyItem17 = d6Var2.a;
            d6Var2.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            fzVar = fzVar2;
            w4Var.c(r62, nb.a(l8Var3), fzVar);
            this.U2 = false;
            this.T2 = false;
            this.S2 = false;
            storyItem2 = storyItem14;
            z13 = z52;
            m4Var = m4Var3;
            kcVar = kcVar3;
        } else {
            l9Var2 = l9Var9;
            z11 = z53;
            z12 = z55;
            i10 = i31;
            fzVar = fzVar3;
            i11 = 4;
            this.T1 = false;
            this.U1 = false;
            this.V1 = false;
            if (storyItem == null) {
                if (kcVar4 != null) {
                    kcVar4.q(true);
                    return;
                }
                return;
            }
            l9 t10 = this.S1.t(this.B1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.U1 = true;
                m4Var4.setCrossfadeWithOldImage(false);
                if (this.i1 != null) {
                    i32 = 0;
                }
                m4Var4.setCrossfadeDuration(i32);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    l9Var3 = t10;
                    m4Var = m4Var4;
                    kcVar2 = kcVar4;
                    this.e1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    kcVar2 = kcVar4;
                    m4Var = m4Var4;
                    l9Var3 = t10;
                    this.e1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                }
                d6Var2.b = l9Var3;
                d6Var2.j = null;
                d6Var2.i = null;
                d6Var2.a = null;
                d6Var2.d = false;
                d6Var2.e = d6Var2.m();
                TL_stories.StoryItem storyItem18 = d6Var2.a;
                d6Var2.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                w4Var.c(null, nb.a(l9Var3.c), fzVar);
                d6Var2.c = storyItem;
                this.U2 = false;
                this.T2 = false;
                this.S2 = false;
                z13 = z54;
                kcVar = kcVar2;
            } else {
                storyItem2 = storyItem14;
                m4Var = m4Var4;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z57 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.B1;
                z13 = z54;
                m4Var.setCrossfadeWithOldImage(z13);
                m4Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.c3 = true;
                    MessagesController.getInstance(this.C2).getStoriesController().p(storyItem.id, this.B1);
                } else {
                    String str3 = storyItem.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            z57 = str3.toLowerCase().endsWith(".mp4");
                        }
                        if (z57) {
                            TLRPC.MessageMedia messageMedia6 = storyItem.media;
                            Drawable createStripedBitmap = messageMedia6 != null ? ImageLoader.createStripedBitmap(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                if (ImageLoader.getInstance().isInMemCache(ImageLocation.getForPath(storyItem.firstFramePath).getKey(null, null, false) + "@" + s10, false)) {
                                    this.e1.setImage(null, null, ImageLocation.getForPath(storyItem.firstFramePath), s10, null, null, createStripedBitmap, 0L, null, null, 0);
                                }
                            }
                            this.e1.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), sc.v.v(s10, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
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
                        Drawable drawable = ((kcVar4.O0 != null || kcVar4.N0) && (hcVar = kcVar4.s0) != null && (imageReceiver = hcVar.c) != null && hcVar.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.B1;
                        if (z57) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String v = sc.v.v(s10, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            storyItem4 = storyItem;
                            kcVar = kcVar4;
                            this.e1.setImage(null, null, forDocument, v, forDocument2, s10, drawable, 0L, null, storyItem4, 0);
                        } else {
                            storyItem3 = storyItem;
                            kcVar = kcVar4;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                m4Var.clearImage();
                                storyItem3.dialogId = this.B1;
                                w4Var.d(z10 ? null : storyItem3, fzVar);
                                d6Var2.n(storyItem3);
                                z14 = (!this.c3 || (storyItem5 = d6Var2.a) == null || (storyItem5 instanceof TL_stories.TL_storyItemDeleted) || (storyItem5 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                                this.U2 = z14;
                                this.S2 = z14;
                                if (z14) {
                                    this.S2 = d6Var2.d() && d6Var2.a.isPublic;
                                }
                                if (this.S2) {
                                    TL_stories.StoryItem storyItem19 = d6Var2.a;
                                    this.S2 = storyItem19.pinned || !ja.w(this.C2, storyItem19);
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
                                        this.U2 = (user == null || UserObject.getPublicUsername(user) == null || !d6Var2.a.isPublic) ? false : true;
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
                        w4Var.d(z10 ? null : storyItem3, fzVar);
                        d6Var2.n(storyItem3);
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
                kcVar = kcVar4;
                storyItem3.dialogId = this.B1;
                w4Var.d(z10 ? null : storyItem3, fzVar);
                d6Var2.n(storyItem3);
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
        TL_stories.StoryItem storyItem20 = d6Var2.a;
        if (storyItem20 != null && !z10) {
            kcVar.P0 = storyItem20.id;
        }
        kcVar.n0.A();
        this.Y2 = true;
        if (this.C1 || this.D1) {
            k1(false);
        }
        TL_stories.StoryItem storyItem21 = d6Var2.a;
        l9 l9Var10 = d6Var2.b;
        int i33 = storyItem21 != null ? storyItem21.id : (l9Var10 == null || (l8Var = l9Var10.c) == null) ? 0 : l8Var.f;
        if (storyItem2 != null) {
            storyItem6 = storyItem2;
            i12 = storyItem6.id;
            l9Var4 = l9Var2;
        } else {
            storyItem6 = storyItem2;
            l9Var4 = l9Var2;
            i12 = (l9Var2 == null || (l8Var2 = l9Var4.c) == null) ? 0 : l8Var2.f;
        }
        boolean z58 = i33 == i12 || !(l9Var4 == null || storyItem21 == null || !TextUtils.equals(l9Var4.e, storyItem21.attachPath));
        boolean z59 = z58 && !(this.U1 == z13 && this.T1 == z11 && this.V1 == z12);
        d2 d2Var3 = kcVar.A0;
        if (d2Var3 != null) {
            int i34 = this.Q3;
            TLRPC.GroupCall groupCall = d2Var3.v;
            if (i34 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                z16 = true;
                b5Var = this.c1;
                h5Var = this.K0;
                b6Var = this.o1;
                if ((l9Var4 != null || (str = l9Var4.e) == null || !str.equals(d6Var2.f())) && (storyItem6 == null || (storyItem7 = d6Var2.a) == null || storyItem6.id != storyItem7.id)) {
                    b4Var = this.b2;
                    if (b4Var != null) {
                        if (storyItem6 != null && !TextUtils.isEmpty(b4Var.getEditField().getText())) {
                            kc.J(storyItem6.dialogId, storyItem6, this.b2.getEditField().getText());
                        }
                        this.b2.getEditField().setText(kc.u(this.B1, d6Var2.a));
                        z18 = d6Var2.f;
                        if (z18) {
                            this.b2.S0(false, false);
                        } else {
                            this.b2.S0(true, true);
                        }
                    }
                    z17 = d6Var2.f;
                    if (z17) {
                        M0();
                    }
                    fzVar.c();
                    this.W0 = 0L;
                    this.Y0 = false;
                    l9Var5 = d6Var2.b;
                    if (l9Var5 == null) {
                        gk0 gk0Var = b6Var.d;
                        if (gk0Var != null) {
                            gk0Var.e(l9Var5.h, false);
                        }
                        b6Var.a.invalidate();
                    } else if (!z59) {
                        b6Var.h = 0.0f;
                    }
                    tcVar = org.telegram.ui.Components.tc.w;
                    if (tcVar != null && tcVar.h == b5Var) {
                        tcVar.b();
                    }
                    h5Var.J();
                    q0();
                    z16 = true;
                }
                if (!z16 || (l9Var4 != null && d6Var2.b == null)) {
                    b6Var.setOnSubtitleClick(null);
                    TextView[] textViewArr = b6Var.c;
                    this.Q3 = 0;
                    boolean z60 = z59;
                    i13 = 2;
                    long j3 = this.B1;
                    m4Var2 = m4Var;
                    z19 = d6Var2.f;
                    W0(j3, false, z19);
                    l9Var6 = d6Var2.b;
                    if (l9Var6 == null) {
                        d6Var = d6Var2;
                        charSequence2 = l9Var6.I ? LocaleController.getString(R.string.FailedToUploadStory) : ja.u(textViewArr[0], this.U1);
                    } else if (I0()) {
                        TL_stories.StoryItem storyItem22 = d6Var2.a;
                        if (storyItem22 == null || (messageMedia2 = storyItem22.media) == null) {
                            d6Var = d6Var2;
                        } else {
                            if (messageMedia2.document != null) {
                                d6Var = d6Var2;
                                charSequence2 = LocaleController.formatStoryDate(r13.date);
                            } else {
                                d6Var = d6Var2;
                                if (messageMedia2.photo != null) {
                                    charSequence2 = LocaleController.formatStoryDate(r2.date);
                                }
                            }
                        }
                        charSequence2 = "";
                    } else {
                        d6Var = d6Var2;
                        TL_stories.StoryItem storyItem23 = d6Var.a;
                        if (storyItem23 == null) {
                            z20 = z16;
                            z21 = z58;
                            b5Var2 = b5Var;
                            h5Var2 = h5Var;
                            z22 = z60;
                            charSequence = null;
                        } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                            spannableStringBuilder2.setSpan(new p4(), 0, spannableStringBuilder2.length(), 33);
                            spannableStringBuilder2.append((CharSequence) "  ");
                            d2 d2Var4 = kcVar.A0;
                            if (d2Var4 != null) {
                                TLRPC.GroupCall groupCall2 = d2Var4.v;
                                i14 = 1;
                                this.Q3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                            } else {
                                i14 = 1;
                            }
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i14, this.Q3)));
                            charSequence2 = spannableStringBuilder2;
                        } else if (storyItem23.date == -1) {
                            charSequence2 = LocaleController.getString(R.string.CachedStory);
                        } else {
                            if (d6Var.i() != null) {
                                ta i35 = d6Var.i();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                z20 = z16;
                                z21 = z58;
                                SpannableString spannableString = new SpannableString("r");
                                b5Var2 = b5Var;
                                h5Var2 = h5Var;
                                spannableString.setSpan(new er(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                spannableStringBuilder3.append((CharSequence) spannableString).append((CharSequence) " ");
                                if (i35.b != null) {
                                    org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.C2);
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(g5Var, 0, 1, 33);
                                    spannableStringBuilder3.append((CharSequence) spannableString2).append((CharSequence) " ");
                                    if (i35.b.longValue() > 0) {
                                        TLRPC.User user2 = MessagesController.getInstance(this.C2).getUser(i35.b);
                                        g5Var.e(user2);
                                        spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user2));
                                    } else {
                                        TLRPC.Chat chat4 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-i35.b.longValue()));
                                        g5Var.b(chat4);
                                        if (chat4 != null) {
                                            spannableStringBuilder3.append((CharSequence) chat4.title);
                                        }
                                    }
                                } else {
                                    String str4 = d6Var.a.fwd_from.from_name;
                                    if (str4 != null) {
                                        spannableStringBuilder3.append((CharSequence) str4);
                                    }
                                }
                                b6Var.setOnSubtitleClick(new f2(1, this, i35));
                                SpannableString spannableString3 = new SpannableString(".");
                                st stVar = new st();
                                stVar.b = AndroidUtilities.dp(1.5f);
                                stVar.c = 5.0f;
                                spannableString3.setSpan(stVar, 0, spannableString3.length(), 33);
                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(d6Var.a.date));
                                spannableStringBuilder = spannableStringBuilder3;
                            } else {
                                z20 = z16;
                                z21 = z58;
                                b5Var2 = b5Var;
                                h5Var2 = h5Var;
                                if (!this.E1 || (storyItem8 = d6Var.a) == null || storyItem8.from_id == null) {
                                    String formatStoryDate = LocaleController.formatStoryDate(d6Var.a.date);
                                    charSequence4 = formatStoryDate;
                                    if (d6Var.a.edited) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                        st stVar2 = new st();
                                        stVar2.b = AndroidUtilities.dp(1.5f);
                                        stVar2.c = 5.0f;
                                        valueOf.append((CharSequence) " . ").setSpan(stVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                        valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                        charSequence4 = valueOf;
                                    }
                                    z22 = z60;
                                    charSequence = charSequence4;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                    org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.C2);
                                    SpannableString spannableString4 = new SpannableString("a");
                                    spannableString4.setSpan(g5Var2, 0, 1, 33);
                                    spannableStringBuilder4.append((CharSequence) spannableString4).append((CharSequence) " ");
                                    long peerDialogId = DialogObject.getPeerDialogId(d6Var.a.from_id);
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
                                    b6Var.setOnSubtitleClick(new b3(this, peerDialogId, 0));
                                    SpannableString spannableString5 = new SpannableString(".");
                                    st stVar3 = new st();
                                    stVar3.b = AndroidUtilities.dp(1.5f);
                                    stVar3.c = 5.0f;
                                    spannableString5.setSpan(stVar3, 0, spannableString5.length(), 33);
                                    spannableStringBuilder4.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(d6Var.a.date));
                                    spannableStringBuilder = spannableStringBuilder4;
                                }
                            }
                            z22 = false;
                            charSequence = spannableStringBuilder;
                        }
                        if (charSequence != null) {
                            e9 e9Var2 = kcVar.O0;
                            if (e9Var2 == null || (storyItem9 = d6Var.a) == null || !e9Var2.m(storyItem9.id)) {
                                z23 = false;
                                charSequence3 = charSequence;
                            } else {
                                boolean z61 = charSequence instanceof SpannableStringBuilder;
                                CharSequence charSequence5 = charSequence;
                                if (!z61) {
                                    charSequence5 = new SpannableStringBuilder(charSequence);
                                }
                                SpannableString spannableString6 = new SpannableString("p ");
                                z23 = false;
                                spannableString6.setSpan(new er(R.drawable.msg_pin_mini), 0, 1, 33);
                                ((SpannableStringBuilder) charSequence5).insert(0, (CharSequence) spannableString6);
                                charSequence3 = charSequence5;
                            }
                            b6Var.c(charSequence3, z22);
                        } else {
                            z23 = false;
                        }
                        d4Var = this.F0;
                        if (d4Var != null) {
                            d4Var.e(z23);
                        }
                        d4Var2 = this.G0;
                        if (d4Var2 != null) {
                            d4Var2.e(z23);
                        }
                    }
                    z20 = z16;
                    z21 = z58;
                    b5Var2 = b5Var;
                    h5Var2 = h5Var;
                    charSequence4 = charSequence2;
                    z22 = z60;
                    charSequence = charSequence4;
                    if (charSequence != null) {
                    }
                    d4Var = this.F0;
                    if (d4Var != null) {
                    }
                    d4Var2 = this.G0;
                    if (d4Var2 != null) {
                    }
                } else {
                    d6Var = d6Var2;
                    m4Var2 = m4Var;
                    z20 = z16;
                    z21 = z58;
                    b5Var2 = b5Var;
                    h5Var2 = h5Var;
                    i13 = 2;
                }
                storyItem10 = d6Var.a;
                if (storyItem6 == storyItem10 && l9Var4 == d6Var.b) {
                }
                d6Var.o();
                if ((!d6Var.g || storyItem6 != d6Var.a) && (y5Var = this.Q1) != null) {
                    kc kcVar5 = ((bc) y5Var).d;
                    kcVar5.Z0 = false;
                    kcVar5.P();
                }
                z24 = d6Var.f;
                z25 = !z24 && (d2Var2 = kcVar.A0) != null && d6Var.k(d2Var2.g()) && kcVar.A0.b();
                if (z25 != this.G1) {
                    this.G1 = z25;
                    if (z25) {
                        z0();
                    }
                    if (this.g2 != null && (this.F1 || this.G1)) {
                        h1();
                    }
                    b4 b4Var4 = this.b2;
                    if (b4Var4 != null) {
                        if (this.F1) {
                            z51 = d6Var.f;
                        }
                        if (!this.G1) {
                            z50 = true;
                            b4Var4.setEnabled(z50);
                            this.b2.N1();
                        }
                        z50 = false;
                        b4Var4.setEnabled(z50);
                        this.b2.N1();
                    }
                    r0(true);
                }
                linearLayout = this.g2;
                int i36 = 8;
                if (linearLayout != null) {
                    if (this.F1) {
                        z49 = d6Var.f;
                    }
                    if (!this.G1) {
                        i30 = 8;
                        linearLayout.setVisibility(i30);
                    }
                    i30 = 0;
                    linearLayout.setVisibility(i30);
                }
                z26 = this.c3;
                LinearLayout linearLayout2 = this.O0;
                if (z26) {
                    TLRPC.Chat chat6 = this.B1 < 0 ? MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1)) : null;
                    z27 = d6Var.f;
                    if (z27) {
                        if (this.b2 == null) {
                            v0();
                        }
                        u0();
                        y0();
                        x0();
                        this.b2.setVisibility(0);
                    } else if ((UserObject.isService(this.B1) || I0()) && (b4Var2 = this.b2) != null) {
                        b4Var2.setVisibility(8);
                    } else if (!this.C1 && ((!this.D1 || (this.E1 && (ChatObject.canSendPlain(chat6) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat6)))) && (b4Var3 = this.b2) != null)) {
                        b4Var3.setVisibility(0);
                    }
                    b4 b4Var5 = this.b2;
                    if (b4Var5 != null) {
                        z32 = d6Var.f;
                        b4Var5.setOnSendButtonLongClick(z32 ? new c3(this, 0) : null);
                        b4 b4Var6 = this.b2;
                        z33 = d6Var.f;
                        D0(true);
                        b4Var6.g1(z33);
                        b4 b4Var7 = this.b2;
                        z34 = d6Var.f;
                        b4Var7.m1(z34 && !D0(true) && (this.v2 || this.b2.W0), true);
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
                            z31 = d6Var.f;
                        }
                        if (!this.G1) {
                            i16 = 8;
                            linearLayout3.setVisibility(i16);
                        }
                        i16 = 0;
                        linearLayout3.setVisibility(i16);
                    }
                    b4 b4Var8 = this.b2;
                    if (b4Var8 != null) {
                        if (this.F1) {
                            z30 = d6Var.f;
                        }
                        if (!this.G1) {
                            z29 = true;
                            b4Var8.setEnabled(z29);
                        }
                        z29 = false;
                        b4Var8.setEnabled(z29);
                    }
                    n4 n4Var = this.W1;
                    if (n4Var != null) {
                        if (this.C1) {
                            z28 = d6Var.f;
                            if (!z28) {
                                i15 = 0;
                                n4Var.setVisibility(i15);
                            }
                        }
                        i15 = 8;
                        n4Var.setVisibility(i15);
                    }
                    FrameLayout frameLayout = this.a3;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (UserObject.isService(this.B1)) {
                        A0();
                        this.b3.setVisibility(0);
                    } else {
                        q4 q4Var = this.b3;
                        if (q4Var != null) {
                            q4Var.setVisibility(8);
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
                    b4 b4Var9 = this.b2;
                    if (b4Var9 != null) {
                        b4Var9.setVisibility(8);
                    }
                    n4 n4Var2 = this.W1;
                    if (n4Var2 != null) {
                        n4Var2.setVisibility(8);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                }
                hVar = this.c2;
                if (hVar != null) {
                    b4 b4Var10 = this.b2;
                    if (b4Var10 != null && b4Var10.getVisibility() == 0) {
                        z48 = d6Var.f;
                        if (!z48) {
                            i29 = 0;
                            hVar.setVisibility(i29);
                        }
                    }
                    i29 = 8;
                    hVar.setVisibility(i29);
                }
                cVar = this.X1;
                s3 s3Var = this.L0;
                if (cVar != null) {
                    if (!this.c3) {
                        z47 = d6Var.f;
                        if (z47) {
                            i28 = 0;
                            cVar.setVisibility(i28);
                            this.X1.a(s3Var.g(), false);
                            this.X1.setCount(s3Var.getUnreadMessagesCount());
                        }
                    }
                    i28 = 8;
                    cVar.setVisibility(i28);
                    this.X1.a(s3Var.g(), false);
                    this.X1.setCount(s3Var.getUnreadMessagesCount());
                }
                s2Var = this.a2;
                if (s2Var != null) {
                    if (!this.c3) {
                        z46 = d6Var.f;
                        if (z46 && (d2Var = d2.W) != null && d6Var.k(d2Var.g())) {
                            i27 = 0;
                            s2Var.setVisibility(i27);
                            s2 s2Var2 = this.a2;
                            d2 d2Var5 = d2.W;
                            s2Var2.b(d2Var5 == null && d2Var5.o(), true);
                            s2 s2Var3 = this.a2;
                            d2 d2Var6 = d2.W;
                            s2Var3.a(d2Var6 != null || d2Var6.m(), true);
                        }
                    }
                    i27 = 8;
                    s2Var.setVisibility(i27);
                    s2 s2Var22 = this.a2;
                    d2 d2Var52 = d2.W;
                    s2Var22.b(d2Var52 == null && d2Var52.o(), true);
                    s2 s2Var32 = this.a2;
                    d2 d2Var62 = d2.W;
                    s2Var32.a(d2Var62 != null || d2Var62.m(), true);
                }
                if (this.Z1 != null) {
                    x2 x2Var = this.Y1;
                    if (!this.c3) {
                        z45 = d6Var.f;
                        if (z45) {
                            i25 = 0;
                            x2Var.setVisibility(i25);
                            y2 y2Var = this.Z1;
                            if (!this.c3) {
                                z44 = d6Var.f;
                                if (z44) {
                                    i26 = 0;
                                    y2Var.setVisibility(i26);
                                    layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                                    s2 s2Var4 = this.a2;
                                    dp = AndroidUtilities.dp((s2Var4 == null && s2Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != dp) {
                                        layoutParams.rightMargin = dp;
                                        this.Z1.setLayoutParams(layoutParams);
                                    }
                                }
                            }
                            i26 = 8;
                            y2Var.setVisibility(i26);
                            layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                            s2 s2Var42 = this.a2;
                            dp = AndroidUtilities.dp((s2Var42 == null && s2Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != dp) {
                            }
                        }
                    }
                    i25 = 8;
                    x2Var.setVisibility(i25);
                    y2 y2Var2 = this.Z1;
                    if (!this.c3) {
                    }
                    i26 = 8;
                    y2Var2.setVisibility(i26);
                    layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
                    s2 s2Var422 = this.a2;
                    dp = AndroidUtilities.dp((s2Var422 == null && s2Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                    if (layoutParams.rightMargin != dp) {
                    }
                }
                z35 = d6Var.f;
                if (!z35 || ((d6Var.h == null && d6Var.i() == null && d6Var.g() == null) || this.c3)) {
                    h5 h5Var3 = h5Var2;
                    if (this.K1) {
                        kc kcVar6 = ((bc) this.Q1).d;
                        kcVar6.L0 = false;
                        kcVar6.P();
                        y5 y5Var2 = this.Q1;
                        this.j3 = false;
                        ((bc) y5Var2).e();
                    }
                    h5Var3.setVisibility(8);
                } else {
                    h5 h5Var4 = h5Var2;
                    h5Var4.b0.b(d6Var.h, d6Var.i(), d6Var.g(), kcVar.Z0 && !d6Var.g && (storyItem13 = d6Var.a) != null && storyItem13.translated, storyItem6 == d6Var.a);
                    h5Var4.setVisibility(0);
                }
                storyItem11 = d6Var.a;
                if (storyItem11 != null) {
                    TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                    if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                        if (s3Var.r(this.B1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                            s3Var.q(false, false);
                            this.L3 = 0L;
                            b4 b4Var11 = this.b2;
                            if (b4Var11 != null) {
                                b4Var11.I(true);
                                this.b2.Q1();
                                r0(true);
                            }
                        }
                        s3Var.setVisibility(0);
                        b5Var2.invalidate();
                        if (this.Q1 != null && K0()) {
                            ((bc) this.Q1).a(this.J1, this.B1);
                        }
                        z36 = this.D1;
                        n4 n4Var3 = this.P0;
                        ImageView imageView3 = this.N0;
                        n4 n4Var4 = this.D0;
                        if (z36) {
                            if (this.S2) {
                                z43 = d6Var.f;
                                if (!z43) {
                                    i22 = 0;
                                    imageView3.setVisibility(i22);
                                    if (n4Var3 != null) {
                                        if (this.T2) {
                                            z42 = d6Var.f;
                                            if (!z42) {
                                                i24 = 0;
                                                n4Var3.setVisibility(i24);
                                            }
                                        }
                                        i24 = 8;
                                        n4Var3.setVisibility(i24);
                                    }
                                    if (!this.V1) {
                                        z41 = d6Var.f;
                                        if (!z41) {
                                            i23 = 0;
                                            n4Var4.setVisibility(i23);
                                        }
                                    }
                                    i23 = 8;
                                    n4Var4.setVisibility(i23);
                                }
                            }
                            i22 = i11;
                            imageView3.setVisibility(i22);
                            if (n4Var3 != null) {
                            }
                            if (!this.V1) {
                            }
                            i23 = 8;
                            n4Var4.setVisibility(i23);
                        } else {
                            if (this.S2) {
                                z38 = d6Var.f;
                                if (!z38) {
                                    i17 = 0;
                                    imageView3.setVisibility(i17);
                                    if (n4Var3 != null) {
                                        n4Var3.setVisibility(8);
                                    }
                                    if (!this.C1) {
                                        z37 = d6Var.f;
                                        if (!z37) {
                                            i18 = 0;
                                            n4Var4.setVisibility(i18);
                                            n4Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                        }
                                    }
                                    i18 = 8;
                                    n4Var4.setVisibility(i18);
                                    n4Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                }
                            }
                            i17 = i11;
                            imageView3.setVisibility(i17);
                            if (n4Var3 != null) {
                            }
                            if (!this.C1) {
                            }
                            i18 = 8;
                            n4Var4.setVisibility(i18);
                            n4Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                        }
                        n4Var4.requestLayout();
                        kcVar.e1.append(this.B1, i10);
                        if (this.K1) {
                            R0(0L);
                            g1();
                            m4Var2.bumpPriority();
                        }
                        s3Var.setLivePlayer(kcVar.A0);
                        this.L1 = 0;
                        if (kcVar.O0 != null && (storyItem12 = d6Var.a) != null) {
                            int i37 = storyItem12.id;
                            i21 = 0;
                            while (true) {
                                if (i21 < kcVar.O0.i.size()) {
                                    MessageObject messageObject = (MessageObject) kcVar.O0.i.get(i21);
                                    if (messageObject != null && messageObject.getId() == i37) {
                                        this.L1 = i21;
                                        break;
                                    }
                                    i21++;
                                } else {
                                    break;
                                }
                            }
                        }
                        int i38 = this.J1;
                        this.M1 = i38;
                        int i39 = this.A1;
                        this.N1 = i39;
                        if (kcVar.R0) {
                            this.M1 = (i39 - 1) - i38;
                        }
                        l4 = d6Var.l();
                        x5 x5Var = this.y0;
                        if (l4) {
                            x5Var.setVisibility(0);
                            this.e3 = d6Var.j() ? 1.0f : 0.5f;
                            boolean j10 = d6Var.j();
                            ImageView imageView4 = this.A0;
                            fk0 fk0Var = this.z0;
                            if (j10) {
                                fk0Var.setVisibility(0);
                                imageView4.setVisibility(8);
                                x5Var.setContentDescription(LocaleController.getString(!kc.D1 ? R.string.Mute : R.string.Unmute));
                            } else {
                                fk0Var.setVisibility(8);
                                imageView4.setVisibility(0);
                                x5Var.setContentDescription(LocaleController.getString(R.string.NoSound));
                            }
                            x5Var.setAlpha((1.0f - this.d4) * this.e3);
                        } else {
                            x5Var.setVisibility(8);
                        }
                        l9Var7 = d6Var.b;
                        ob obVar = this.C0;
                        if (l9Var7 != null) {
                            obVar.a(this.C1, l9Var7, z21 && this.b4);
                        } else {
                            TL_stories.StoryItem storyItem24 = d6Var.a;
                            if (storyItem24 != null) {
                                obVar.b(this.C1, storyItem24, z21 && this.b4);
                            } else {
                                obVar.b(this.C1, null, z21 && this.b4);
                            }
                        }
                        this.b4 = false;
                        obVar.setTranslationX(x5Var.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z20) {
                            this.q3 = false;
                            TL_stories.StoryItem storyItem25 = d6Var.a;
                            if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                this.E0.setReaction(null);
                            } else {
                                this.E0.setReaction(zg.n0.d(reaction));
                            }
                        }
                        l9Var8 = d6Var.b;
                        if (l9Var8 == null && l9Var8.I) {
                            w0();
                            this.j2.set(d6Var.b.c.x);
                            this.j2.setVisibility(0);
                            ViewPropertyAnimator viewPropertyAnimator = this.k2;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.k2 = null;
                            }
                            if (z21) {
                                ViewPropertyAnimator interpolator = this.j2.animate().alpha(1.0f).setDuration(180L).setInterpolator(hs.h);
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
                                ViewPropertyAnimator withEndAction = this.j2.animate().alpha(0.0f).setDuration(180L).setInterpolator(hs.h).withEndAction(new d3(this, 0));
                                this.k2 = withEndAction;
                                withEndAction.start();
                            } else {
                                this.j2.setAlpha(0.0f);
                                this.j2.setVisibility(8);
                            }
                        }
                        this.x1.a(kc.D1, false);
                        if (this.K1 && d6Var.a != null) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + d6Var.a.id + " " + d6.c(d6Var));
                        }
                        if (this.C1) {
                            l7.f(this.C2, this.B1, d6Var.a);
                        }
                        a6 a6Var = b6Var.b;
                        e9 e9Var3 = kcVar.O0;
                        a6Var.setPadding(0, 0, (e9Var3 != null || e9Var3.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(d6Var.a);
                        if (!z10 && !this.C1 && this.z3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                            d3 d3Var = new d3(this, 1);
                            this.z3 = d3Var;
                            AndroidUtilities.runOnUIThread(d3Var, 500L);
                        }
                        d4Var3 = this.G0;
                        if (!(d4Var3 == null && d4Var3.V) && d6Var.j() && kc.D1) {
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
                                z40 = d6Var.e;
                                if (!z40) {
                                    i20 = 8;
                                    imageView.setVisibility(i20);
                                }
                            }
                            i20 = i19;
                            imageView.setVisibility(i20);
                        }
                        imageView2 = this.x0;
                        if (imageView2 != null) {
                            z39 = d6Var.f;
                            if (z39 && !obVar.f) {
                                i36 = i19;
                            }
                            imageView2.setVisibility(i36);
                            return;
                        }
                        return;
                    }
                }
                s3Var.r(this.B1, null);
                s3Var.setVisibility(8);
                b5Var2.invalidate();
                if (this.Q1 != null) {
                    ((bc) this.Q1).a(this.J1, this.B1);
                }
                z36 = this.D1;
                n4 n4Var32 = this.P0;
                ImageView imageView32 = this.N0;
                n4 n4Var42 = this.D0;
                if (z36) {
                }
                n4Var42.requestLayout();
                kcVar.e1.append(this.B1, i10);
                if (this.K1) {
                }
                s3Var.setLivePlayer(kcVar.A0);
                this.L1 = 0;
                if (kcVar.O0 != null) {
                    int i372 = storyItem12.id;
                    i21 = 0;
                    while (true) {
                        if (i21 < kcVar.O0.i.size()) {
                        }
                        i21++;
                    }
                }
                int i382 = this.J1;
                this.M1 = i382;
                int i392 = this.A1;
                this.N1 = i392;
                if (kcVar.R0) {
                }
                l4 = d6Var.l();
                x5 x5Var2 = this.y0;
                if (l4) {
                }
                l9Var7 = d6Var.b;
                ob obVar2 = this.C0;
                if (l9Var7 != null) {
                }
                this.b4 = false;
                obVar2.setTranslationX(x5Var2.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z20) {
                }
                l9Var8 = d6Var.b;
                if (l9Var8 == null) {
                }
                if (this.j2 != null) {
                }
                this.x1.a(kc.D1, false);
                if (this.K1) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + d6Var.a.id + " " + d6.c(d6Var));
                }
                if (this.C1) {
                }
                a6 a6Var2 = b6Var.b;
                e9 e9Var32 = kcVar.O0;
                a6Var2.setPadding(0, 0, (e9Var32 != null || e9Var32.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(d6Var.a);
                if (!z10) {
                    d3 d3Var2 = new d3(this, 1);
                    this.z3 = d3Var2;
                    AndroidUtilities.runOnUIThread(d3Var2, 500L);
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
                if (imageView2 != null) {
                }
            }
        }
        z16 = false;
        b5Var = this.c1;
        h5Var = this.K0;
        b6Var = this.o1;
        if (l9Var4 != null) {
        }
        b4Var = this.b2;
        if (b4Var != null) {
        }
        z17 = d6Var2.f;
        if (z17) {
        }
        fzVar.c();
        this.W0 = 0L;
        this.Y0 = false;
        l9Var5 = d6Var2.b;
        if (l9Var5 == null) {
        }
        tcVar = org.telegram.ui.Components.tc.w;
        if (tcVar != null) {
            tcVar.b();
        }
        h5Var.J();
        q0();
        z16 = true;
        if (z16) {
        }
        b6Var.setOnSubtitleClick(null);
        TextView[] textViewArr2 = b6Var.c;
        this.Q3 = 0;
        boolean z602 = z59;
        i13 = 2;
        long j32 = this.B1;
        m4Var2 = m4Var;
        z19 = d6Var2.f;
        W0(j32, false, z19);
        l9Var6 = d6Var2.b;
        if (l9Var6 == null) {
        }
        z20 = z16;
        z21 = z58;
        b5Var2 = b5Var;
        h5Var2 = h5Var;
        charSequence4 = charSequence2;
        z22 = z602;
        charSequence = charSequence4;
        if (charSequence != null) {
        }
        d4Var = this.F0;
        if (d4Var != null) {
        }
        d4Var2 = this.G0;
        if (d4Var2 != null) {
        }
        storyItem10 = d6Var.a;
        if (storyItem6 == storyItem10) {
        }
        d6Var.o();
        if (!d6Var.g) {
        }
        kc kcVar52 = ((bc) y5Var).d;
        kcVar52.Z0 = false;
        kcVar52.P();
        z24 = d6Var.f;
        if (z24) {
        }
        if (z25 != this.G1) {
        }
        linearLayout = this.g2;
        int i362 = 8;
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
        s3 s3Var2 = this.L0;
        if (cVar != null) {
        }
        s2Var = this.a2;
        if (s2Var != null) {
        }
        if (this.Z1 != null) {
        }
        z35 = d6Var.f;
        if (z35) {
        }
        h5 h5Var32 = h5Var2;
        if (this.K1) {
        }
        h5Var32.setVisibility(8);
        storyItem11 = d6Var.a;
        if (storyItem11 != null) {
        }
        s3Var2.r(this.B1, null);
        s3Var2.setVisibility(8);
        b5Var2.invalidate();
        if (this.Q1 != null) {
        }
        z36 = this.D1;
        n4 n4Var322 = this.P0;
        ImageView imageView322 = this.N0;
        n4 n4Var422 = this.D0;
        if (z36) {
        }
        n4Var422.requestLayout();
        kcVar.e1.append(this.B1, i10);
        if (this.K1) {
        }
        s3Var2.setLivePlayer(kcVar.A0);
        this.L1 = 0;
        if (kcVar.O0 != null) {
        }
        int i3822 = this.J1;
        this.M1 = i3822;
        int i3922 = this.A1;
        this.N1 = i3922;
        if (kcVar.R0) {
        }
        l4 = d6Var.l();
        x5 x5Var22 = this.y0;
        if (l4) {
        }
        l9Var7 = d6Var.b;
        ob obVar22 = this.C0;
        if (l9Var7 != null) {
        }
        this.b4 = false;
        obVar22.setTranslationX(x5Var22.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z20) {
        }
        l9Var8 = d6Var.b;
        if (l9Var8 == null) {
        }
        if (this.j2 != null) {
        }
        this.x1.a(kc.D1, false);
        if (this.K1) {
        }
        if (this.C1) {
        }
        a6 a6Var22 = b6Var.b;
        e9 e9Var322 = kcVar.O0;
        a6Var22.setPadding(0, 0, (e9Var322 != null || e9Var322.g() == this.N1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.C2).getTranslateController().detectStoryLanguage(d6Var.a);
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
        if (imageView2 != null) {
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
        String l4 = a1.g.l(max, max, "_");
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
            ((zg.e0) arrayList.get(i13)).b(false);
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
                    V0((l9) arrayList13.get(i10 - arrayList2.size()), imageReceiver, l4);
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < 0) {
                        i10 = i12;
                    }
                    if (i10 >= arrayList2.size()) {
                        i10 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i10);
                    long j3 = this.B1;
                    storyItem2.dialogId = j3;
                    l9 t10 = this.S1.t(j3, storyItem2);
                    if (t10 != null) {
                        V0(t10, imageReceiver, l4);
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
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), sc.v.v(l4, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), l4, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i14;
                                String str2 = l4;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                l4 = str2;
                            }
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i11 = i14;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (i16 != 0) {
                                storyItem = storyItem2;
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), sc.v.v(l4, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), l4, null, null, null, 0L, null, storyItem, 0);
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
                            } catch (UnsupportedEncodingException e7) {
                                e = e7;
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
                                zg.e0 e0Var = new zg.e0(this);
                                e0Var.e(zg.n0.d(tL_mediaAreaSuggestedReaction.reaction));
                                e0Var.b(this.a1);
                                arrayList10 = arrayList5;
                                arrayList10.add(e0Var);
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
        bc bcVar = (bc) this.Q1;
        kc kcVar = bcVar.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z10 = kcVar.H0;
            ArrayList arrayList16 = kcVar.M0;
            if (z10) {
                return;
            }
            for (int i19 = 0; i19 < arrayList16.size(); i19++) {
                for (int i20 = 0; i20 < arrayList15.size(); i20++) {
                    if (((Uri) arrayList15.get(i20)).equals(((jc) arrayList16.get(i19)).uri)) {
                        arrayList15.remove(i20);
                    }
                }
            }
            for (int i21 = 0; i21 < arrayList15.size(); i21++) {
                Uri uri = (Uri) arrayList15.get(i21);
                jc jcVar = new jc(kcVar, kcVar.C0, kcVar.B0);
                jcVar.setOnSeekUpdate(new ca(3, bcVar, jcVar));
                jcVar.uri = uri;
                TLRPC.Document document2 = (TLRPC.Document) arrayList14.get(i21);
                jcVar.document = document2;
                FileStreamLoadOperation.setPriorityForDocument(document2, 0);
                jcVar.preparePlayer(uri, kc.D1, kc.B1);
                arrayList16.add(jcVar);
                if (arrayList16.size() > 2) {
                    ((jc) arrayList16.remove(0)).release(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.sw0
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
        b5 b5Var = this.c1;
        Bitmap createBitmap = Bitmap.createBitmap(b5Var.getWidth(), b5Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public m9 getStoriesController() {
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
        kc kcVar = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.w1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j3 = ((l9) arrayList2.get(i11)).a;
                    if (((int) (j3 ^ (j3 >>> 32))) == kcVar.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            }
            int indexOf = this.z1.indexOf(Integer.valueOf(kcVar.P0));
            if (indexOf < 0 && !this.z1.isEmpty()) {
                if (kcVar.P0 > ((Integer) this.z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (kcVar.P0 < ((Integer) hg.c.g(1, this.z1)).intValue()) {
                    indexOf = this.z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = kcVar.e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !kcVar.N0 && (peerStories = this.u1) != null && peerStories.max_read_id > 0) {
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
        e9 e9Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.v1;
        arrayList.clear();
        kc kcVar = this.J0;
        if (!kcVar.N0) {
            ArrayList arrayList2 = this.z1;
            int i10 = 0;
            ArrayList arrayList3 = this.w1;
            if (arrayList2 != null && (e9Var = kcVar.O0) != null) {
                if (e9Var instanceof v8) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((v8) kcVar.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            l9 l9Var = (l9) E.get(i11);
                            ci.l8 l8Var = l9Var.c;
                            if (l8Var != null && !l8Var.g && TextUtils.equals(l8Var.K0, str)) {
                                arrayList3.add(l9Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = kcVar.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (kcVar.O0 != null) {
                while (i10 < kcVar.O0.i.size()) {
                    arrayList.add(((MessageObject) kcVar.O0.i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = kcVar.Q0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.B1) {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.u1 = y3;
                    if (y3 == null) {
                        this.u1 = this.S1.z(this.B1);
                    }
                } else {
                    this.u1 = kcVar.Q0;
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
        } else if (!kcVar.S0) {
            arrayList.add(kcVar.T0);
        }
        this.A1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        f6 currentPeerView;
        t60 t60Var = this.J2;
        if (t60Var != null) {
            t60Var.f0 = null;
            t60Var.a(false);
        }
        long j3 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.a;
        kc kcVar = this.J0;
        kcVar.getClass();
        if (j3 != 0 && storyItem != null) {
            kc.E1.remove(j3 + (j3 >> 16) + (storyItem.id << 16));
        }
        this.i3 = true;
        ac acVar = kcVar.n0;
        if (acVar != null && (currentPeerView = acVar.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            org.telegram.ui.Components.tc I = new ad(this.c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new d3(this, 2));
            I.r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.C2).ensureMessagesLoaded(this.B1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        d6 d6Var = this.O1;
        TL_stories.StoryItem storyItem = d6Var.a;
        if (storyItem == null) {
            storyItem = d6Var.c;
        }
        boolean z11 = this.D1;
        if (z11 || this.C1) {
            if (storyItem == null) {
                this.A2.setText("");
                this.F2.setVisibility(8);
                this.B2.setVisibility(8);
                return;
            }
            kc kcVar = this.J0;
            n4 n4Var = this.D0;
            if (!z11) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.A2.setText(LocaleController.getString(kcVar.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
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
                        er erVar = new er(R.drawable.mini_views_likes, 0);
                        erVar.setOverrideColor(-53704);
                        erVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(erVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        er erVar2 = new er(R.drawable.mini_repost_story, 0);
                        erVar2.setOverrideColor(-14161823);
                        erVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(erVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
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
                n4Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
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
            org.telegram.ui.Components.q6 q6Var = this.R0;
            if (q6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.V0 = false;
            } else {
                q6Var.t(Integer.toString(i10), z10 && this.V0, true);
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
                this.A2.setText(LocaleController.getString(kcVar.O0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new er(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.A2.setText(spannableStringBuilder2);
            } else {
                this.A2.setText("");
            }
            n4Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.U0 ? this.Q0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + n4Var.getLayoutParams().width;
            n4 n4Var2 = this.P0;
            if (n4Var2 != null) {
                n4Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.V0 ? this.R0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += n4Var2.getLayoutParams().width;
                n4Var2.requestLayout();
            }
            this.W1.requestLayout();
            n4Var.requestLayout();
            this.B2.setVisibility(8);
            this.F2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = d6Var.a;
            w4 w4Var = this.j1;
            if (storyItem2 == null) {
                w4Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < w4Var.getChildCount(); i15++) {
                if (w4Var.getChildAt(i15) instanceof qb) {
                    ((qb) w4Var.getChildAt(i15)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void l0() {
        r9 r9Var = this.E0;
        r9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new x3(0, r9Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        r9 r9Var2 = new r9(getContext(), this.x1);
        this.E0 = r9Var2;
        r9Var2.setPadding(dp, dp, dp, dp);
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
            Method dump skipped, instructions count: 1613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.f6.l1():void");
    }

    public final void m0(boolean z10) {
        ValueAnimator valueAnimator = this.c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d4, z10 ? 1.0f : 0.0f);
        this.c4 = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 2));
        this.c4.addListener(new v3(this, z10, 1));
        this.c4.setDuration(420L);
        this.c4.setInterpolator(hs.h);
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
        w1 w1Var = new w1(5);
        b2Var.n0 = string2;
        b2Var.o0 = w1Var;
        b2Var.show();
    }

    public final void o0(int i10) {
        this.E2 = false;
        this.V2 = true;
        this.B3 = false;
        this.D1 = false;
        this.E1 = false;
        long j3 = this.B1;
        b6 b6Var = this.o1;
        org.telegram.ui.Components.j9 j9Var = this.n1;
        if (j3 >= 0) {
            this.C1 = j3 == UserConfig.getInstance(this.C2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            this.F1 = !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            j9Var.m(this.C2, user);
            b6Var.a.getImageReceiver().setForUserOrChat(user, j9Var);
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
            j9Var.k(this.C2, chat);
            b6Var.a.getImageReceiver().setForUserOrChat(chat, j9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            m9 m9Var = this.S1;
            long j10 = this.B1;
            a0.i iVar = m9Var.m;
            tc tcVar = (tc) iVar.f(j10);
            if (tcVar == null) {
                tcVar = new tc(m9Var.a, j10, m9Var);
                iVar.k(tcVar, j10);
            }
            tcVar.b(true);
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
        b5 b5Var = this.c1;
        kc kcVar = this.J0;
        int i11 = 8;
        d6 d6Var = this.O1;
        if (z10) {
            B0();
            if (this.b2 == null && (this.E1 || d6Var.f)) {
                v0();
            }
            if (this.b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                b4 b4Var = this.b2;
                if (d6Var.f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                b4Var.setVisibility(i11);
                b4 b4Var2 = this.b2;
                boolean z11 = d6Var.f;
                D0(true);
                b4Var2.g1(z11);
                this.b2.m1(d6Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
                ru editField = this.b2.getEditField();
                long j11 = this.B1;
                TL_stories.StoryItem storyItem = d6Var.a;
                kcVar.getClass();
                editField.setText(kc.u(j11, storyItem));
                this.b2.Z0(this.C2, this.B1);
                this.b2.I1(chat2, null);
            }
            org.telegram.ui.Components.q6 q6Var = this.Q0;
            org.telegram.ui.ActionBar.e6 e6Var = this.B0;
            if (q6Var == null) {
                org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(false, false, false);
                this.Q0 = q6Var2;
                n4 n4Var = this.D0;
                q6Var2.setCallback(n4Var);
                this.Q0.u(e6Var.x0(org.telegram.ui.ActionBar.i6.G6));
                this.Q0.w(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.g6(n4Var);
            }
            n4 n4Var2 = this.P0;
            if (n4Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.q6 q6Var3 = new org.telegram.ui.Components.q6(false, false, false);
                this.R0 = q6Var3;
                q6Var3.setCallback(n4Var2);
                this.R0.u(e6Var.x0(org.telegram.ui.ActionBar.i6.G6));
                this.R0.w(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.g6(n4Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            b5Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (d6Var.f) {
                this.W1.setVisibility(8);
                if (this.b2 == null) {
                    v0();
                }
                this.b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                b4 b4Var3 = this.b2;
                if (b4Var3 != null) {
                    b4Var3.setVisibility(8);
                }
            }
            b4 b4Var4 = this.b2;
            if (b4Var4 != null) {
                boolean z12 = d6Var.f;
                D0(true);
                b4Var4.g1(z12);
                this.b2.m1(d6Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(kcVar.P0));
                    if (indexOf < 0 && !this.z1.isEmpty()) {
                        if (kcVar.P0 > ((Integer) this.z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (kcVar.P0 < ((Integer) hg.c.g(1, this.z1)).intValue()) {
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
            b5Var.invalidate();
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
                this.g2.setVisibility(((!this.F1 || d6Var.f) && !this.G1) ? 8 : 0);
            }
            hb hbVar = this.j2;
            if (hbVar != null) {
                hbVar.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            b4 b4Var5 = this.b2;
            if (b4Var5 != null) {
                b4Var5.setVisibility((I0() || UserObject.isService(this.B1)) ? 8 : 0);
                b4 b4Var6 = this.b2;
                boolean z13 = d6Var.f;
                D0(true);
                b4Var6.g1(z13);
                this.b2.m1(d6Var.f && !D0(true) && (this.v2 || this.b2.W0), true);
                ru editField2 = this.b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem2 = d6Var.a;
                kcVar.getClass();
                editField2.setText(kc.u(j12, storyItem2));
                this.b2.Z0(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.b2.I1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.z2, false);
                }
            }
            this.A1 = getStoriesCount();
            n4 n4Var3 = this.W1;
            if (n4Var3 != null) {
                n4Var3.setVisibility(8);
            }
            b5Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a1 = true;
        this.e1.onAttachedToWindow();
        this.g1.onAttachedToWindow();
        this.f1.onAttachedToWindow();
        this.l3.onAttachedToWindow();
        this.n3.onAttachedToWindow();
        b4 b4Var = this.b2;
        if (b4Var != null) {
            b4Var.C0();
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
            ((zg.e0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a1 = false;
        this.e1.onDetachedFromWindow();
        this.g1.onDetachedFromWindow();
        this.f1.onDetachedFromWindow();
        this.l3.onDetachedFromWindow();
        this.n3.onDetachedFromWindow();
        b4 b4Var = this.b2;
        if (b4Var != null) {
            b4Var.B0();
        }
        org.telegram.ui.Components.s5 s5Var = this.o3;
        if (s5Var != null) {
            s5Var.o(this);
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
            ((zg.e0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.sw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        t60 t60Var;
        boolean z10;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        kl0 kl0Var;
        d4 d4Var;
        kc kcVar = this.J0;
        if (kcVar.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i12 = 0;
        if (this.K1 && this.Z2 == null) {
            this.y2 = ((bc) this.Q1).d.p0;
        } else {
            this.y2 = 0;
        }
        int size = kcVar.b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.y2;
        int size2 = (int) ((View.MeasureSpec.getSize(i10) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.y2 < AndroidUtilities.dp(20.0f)) {
            this.y2 = 0;
        }
        int i13 = this.y2;
        kl0 kl0Var2 = this.r3;
        if (kl0Var2 == null || kl0Var2.getReactionsWindow() == null || this.r3.getReactionsWindow().q) {
            b4 b4Var = this.b2;
            if (b4Var != null && (b4Var.r0() || this.b2.k3)) {
                if (this.b2.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.b2.getEmojiPadding();
                } else {
                    b4 b4Var2 = this.b2;
                    if (b4Var2.z3) {
                        b4Var2.J();
                        i13 = this.b2.getStickersExpandedHeight();
                    } else {
                        i13 = b4Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.r3.getReactionsWindow().c.animate().translationY(-this.y2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
            i13 = 0;
        }
        boolean z11 = this.v2;
        int i14 = this.o2;
        b6 b6Var = this.o1;
        int i15 = 1;
        if (i14 != i13) {
            this.v2 = false;
            int i16 = 3;
            d6 d6Var = this.O1;
            f7 = 8.0f;
            if (i13 <= 0 || !this.K1) {
                b4 b4Var3 = this.b2;
                if (b4Var3 != null) {
                    kc.J(this.B1, d6Var.a, b4Var3.getEditText());
                }
            } else {
                this.v2 = true;
                this.i3 = false;
                this.t2 = i13;
                if (this.f2 == null) {
                    kl0 kl0Var3 = new kl0(1, this.C2, getContext(), LaunchActivity.R(), new y3(i16, this.B0));
                    this.f2 = kl0Var3;
                    kl0Var3.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    kl0 kl0Var4 = this.f2;
                    kl0Var4.N0 = true;
                    addView(kl0Var4, this.I0, w7.x5.a(72.0f, 0.0f, 0.0f, 0.0f, 64.0f, -2, 49));
                    this.f2.setDelegate(new v4(this));
                    this.f2.p(null, null, true);
                }
                this.f2.setFragment(LaunchActivity.R());
                this.f2.setHint(LocaleController.getString(this.E1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                zg.j0 j0Var = zg.j0.B;
                if (j0Var != null) {
                    j0Var.l = true;
                }
                zg.j0 j0Var2 = zg.j0.C;
                if (j0Var2 != null) {
                    j0Var2.l = true;
                }
            }
            b4 b4Var4 = this.b2;
            if (b4Var4 != null) {
                b4Var4.m1(d6Var.f && !D0(true) && this.v2, true);
            }
            if (this.v2 && (d4Var = this.d3) != null) {
                d4Var.setVisibility(0);
            }
            if (!this.v2 && (kl0Var = this.f2) != null) {
                kl0Var.n();
            }
            b6Var.setEnabled(!this.v2);
            if (this.b2 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.v2, 0.1f, true);
            }
            if (this.K1 && this.v2) {
                kc kcVar2 = ((bc) this.Q1).d;
                if (!kcVar2.x) {
                    kcVar2.x = true;
                    kcVar2.P();
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
            ofFloat.addUpdateListener(new e3(this, i12));
            this.p2.addListener(new w3(this, i15));
            if (this.v2) {
                this.p2.setDuration(250L);
                this.p2.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                kcVar.m();
            } else {
                this.p2.setDuration(500L);
                this.p2.setInterpolator(hs.h);
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
                    if (d6Var.f) {
                        ci.d4 d4Var2 = this.d2;
                        if (d4Var2 != null) {
                            if (!d4Var2.V) {
                                removeView(d4Var2);
                            }
                        }
                        if (!D0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            ci.d4 d4Var3 = new ci.d4(getContext(), 3);
                            this.d2 = d4Var3;
                            d4Var3.s(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.d2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            ci.d4 d4Var4 = this.d2;
                            d4Var4.K = Layout.Alignment.ALIGN_OPPOSITE;
                            d4Var4.l0 = new a1.f(10, this, d4Var3);
                            addView(d4Var4, w7.x5.e(-1, 100, 87));
                            this.d2.u();
                            l1();
                        }
                    }
                } else {
                    b4 b4Var5 = this.b2;
                    if (b4Var5 != null) {
                        b4Var5.getEditField().clearFocus();
                    }
                    ci.d4 d4Var5 = this.d2;
                    if (d4Var5 != null) {
                        d4Var5.e(true);
                    }
                }
                this.u2 = true;
            } else {
                this.u2 = false;
            }
        } else {
            f7 = 8.0f;
        }
        b4 b4Var6 = this.b2;
        if (b4Var6 != null && b4Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.b2.getEmojiView().getLayoutParams()).gravity = 80;
        }
        b5 b5Var = this.c1;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b5Var.getLayoutParams();
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
            b5Var.setLayoutParams(layoutParams2);
        }
        n4 n4Var = this.W1;
        if (n4Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) n4Var.getLayoutParams();
            if (this.x2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f7) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        q4 q4Var = this.b3;
        if (q4Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) q4Var.getLayoutParams();
            if (this.x2) {
                c10 = 0;
                this.b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                t60Var = this.J2;
                if (t60Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) t60Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.q.A(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i13;
                    }
                }
                z10 = this.x2;
                LinearLayout linearLayout = this.O0;
                h5 h5Var = this.K0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.C1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.w2 != this.x2) {
                        h5Var.setLayoutParams((FrameLayout.LayoutParams) h5Var.getLayoutParams());
                    }
                    h5Var.u0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f7);
                    if (this.w2 != this.x2) {
                        h5Var.setLayoutParams((FrameLayout.LayoutParams) h5Var.getLayoutParams());
                    }
                    h5Var.u0 = AndroidUtilities.dp(f7);
                }
                this.V2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.C0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.y0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                a6 a6Var = b6Var.b;
                TextView[] textViewArr = b6Var.c;
                layoutParams = (FrameLayout.LayoutParams) a6Var.getLayoutParams();
                if (layoutParams.rightMargin != dp) {
                    int i17 = (int) dp;
                    layoutParams.rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i17;
                    b6Var.forceLayout();
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.w2 = this.x2;
            }
            this.b3.setTextColor(i0.a.k(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c10 = 0;
        t60Var = this.J2;
        if (t60Var != null) {
        }
        z10 = this.x2;
        LinearLayout linearLayout2 = this.O0;
        h5 h5Var2 = this.K0;
        if (z10) {
        }
        this.V2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.C0.getVisibility() == 0) {
        }
        if (this.y0.getVisibility() == 0) {
        }
        a6 a6Var2 = b6Var.b;
        TextView[] textViewArr2 = b6Var.c;
        layoutParams = (FrameLayout.LayoutParams) a6Var2.getLayoutParams();
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
        h5 h5Var = this.K0;
        if (h5Var.W.x()) {
            h5Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((bc) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        if (this.b2 != null && this.f3 && this.a1) {
            d3 d3Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(d3Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.b2.I(true);
            boolean z11 = this.F1;
            d6 d6Var = this.O1;
            if ((z11 && !d6Var.f) || this.G1) {
                this.k3 = false;
                this.b2.setEnabled(false);
                this.b2.h1(" ", z10);
                return;
            }
            if (this.H1 > 0) {
                this.k3 = false;
                this.b2.setEnabled(true);
                this.b2.h1(yh.p7.R0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
                return;
            }
            if (!d6Var.f && tL_storiesStealthMode != null) {
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
                        b4 b4Var = this.b2;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        b4Var.e = formatString;
                        b4Var.f = format;
                        b4Var.E1(z10);
                    } else {
                        this.b2.h1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    AndroidUtilities.runOnUIThread(d3Var, 1000L);
                    return;
                }
            }
            this.k3 = false;
            this.b2.setEnabled(true);
            if (!d6Var.f) {
                this.b2.h1(LocaleController.getString(this.E1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            if (this.b2.getStarsPrice() <= 0) {
                this.b2.h1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.b2.h1(yh.p7.W0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.b2.O4), z10);
            er erVar = this.b2.O4[0];
            if (erVar != null) {
                erVar.spaceScaleX = 0.9f;
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
        w4 w4Var = this.j1;
        if (w4Var != null) {
            ci.d4 d4Var = w4Var.c;
            if (d4Var != null) {
                d4Var.e(true);
                w4Var.c = null;
            }
            w4Var.b = null;
            w4Var.invalidate();
            w4Var.b(false);
        }
        h5 h5Var = this.K0;
        if (h5Var.W.x()) {
            h5Var.W.f(false);
            return true;
        }
        ci.d4 d4Var2 = this.F0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        ci.d4 d4Var3 = this.G0;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        z40 z40Var = this.W2;
        if (z40Var != null) {
            z40Var.b(true);
        }
        w5 w5Var = this.t1;
        if (w5Var != null && w5Var.b) {
            w5Var.a();
            return true;
        }
        b4 b4Var = this.b2;
        if (b4Var != null && b4Var.t0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.b2.c1) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new z2(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((bc) this.Q1).h(alertDialog$Builder.a);
            return true;
        }
        kl0 kl0Var = this.f2;
        if (kl0Var != null && kl0Var.getReactionsWindow() != null && !this.f2.getReactionsWindow().q) {
            this.f2.getReactionsWindow().d();
            return true;
        }
        b4 b4Var2 = this.b2;
        if (b4Var2 != null && b4Var2.r0()) {
            if (this.y2 > 0) {
                AndroidUtilities.hideKeyboard(this.b2.getEmojiView());
                return true;
            }
            this.b2.l0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (h5Var.getVisibility() != 0 || h5Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            h5Var.C();
            this.g3 = false;
            this.c1.invalidate();
            return true;
        }
        b4 b4Var3 = this.b2;
        if (b4Var3 != null) {
            long j3 = this.B1;
            TL_stories.StoryItem storyItem = this.O1.a;
            Editable editText = b4Var3.getEditText();
            this.J0.getClass();
            kc.J(j3, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.b2);
        return true;
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.k1.b = i10;
        kl0 kl0Var = this.f2;
        if (kl0Var != null) {
            kl0Var.setCurrentAccount(i10);
            this.f2.p(null, null, true);
        }
        kl0 kl0Var2 = this.r3;
        if (kl0Var2 != null) {
            kl0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(y5 y5Var) {
        this.Q1 = y5Var;
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
                r4 r4Var = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(r4Var);
                    AndroidUtilities.runOnUIThread(r4Var, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(r4Var);
                    kc kcVar = ((bc) this.Q1).d;
                    kcVar.l1 = true;
                    kcVar.P();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            m4 m4Var = this.e1;
            if (z10) {
                m4Var.stopAnimation();
                m4Var.setAllowStartAnimation(false);
            } else {
                m4Var.startAnimation();
                m4Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            h4 h4Var = new h4(this, getContext(), this.B0);
            this.I2 = h4Var;
            h4Var.c2 = new i4(this);
            h4Var.j0.f0();
            h4 h4Var2 = this.I2;
            h4Var2.W = true;
            h4Var2.t1();
            h4 h4Var3 = this.I2;
            h4Var3.X = new j4(this);
            h4Var3.o1().setText(this.b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 != null || getContext() == null) {
            return;
        }
        c cVar = new c(getContext(), this.I3);
        this.X1 = cVar;
        cVar.setOnClickListener(new f3(this, 1));
        addView(this.X1, w7.x5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 83));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.B0;
        b4 b4Var = new b4(this, AndroidUtilities.findActivity(getContext()), this, new y3(1, e6Var));
        this.b2 = b4Var;
        b4Var.getEditField().useAnimatedTextDrawable();
        this.b2.getEditField().setScaleX(0.0f);
        this.b2.setOverrideKeyboardAnimation(true);
        this.b2.setClipChildren(false);
        this.b2.setDelegate(new c4(this));
        setDelegate(this.b2);
        b4 b4Var2 = this.b2;
        b4Var2.y4 = false;
        b4Var2.z4 = true;
        if (this.O1.f) {
            b4Var2.T0(false, false, false);
        } else {
            b4Var2.T0(true, true, false);
        }
        this.b2.e();
        b4 b4Var3 = this.b2;
        b4Var3.A4 = true;
        addView(b4Var3, w7.x5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        if (this.O3 != null) {
            this.b2.O1(false);
        }
        this.b2.G2 = this.z2;
        e6 e6Var2 = this.M2;
        ((ArrayList) e6Var2.g).add(this.c1);
        ((ArrayList) e6Var2.g).add(this);
        if (this.a1) {
            this.b2.C0();
        }
        r0(false);
        if (I0()) {
            this.b2.setVisibility(8);
        }
        jh.h hVar = new jh.h(getContext(), e6Var, this.I3, this.F3);
        this.c2 = hVar;
        hVar.setOnClickListener(new z2(this, 1));
        addView(this.c2, w7.x5.e(57, 300, 85));
        this.c2.setVisibility(8);
        this.b2.setSideButtonsForAttach(this.c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.j2 != null) {
            return;
        }
        hb hbVar = new hb(getContext(), this.B0);
        this.j2 = hbVar;
        hbVar.setOnClickListener(new f3(this, 4));
        this.j2.setAlpha(0.0f);
        this.j2.setVisibility(8);
        addView(this.j2, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
    }

    public final void x0() {
        if (this.a2 != null || getContext() == null) {
            return;
        }
        s2 s2Var = new s2(getContext(), this.I3);
        this.a2 = s2Var;
        s2Var.setOnClickListener(new f3(this, 5));
        s2 s2Var2 = this.a2;
        d2 d2Var = d2.W;
        boolean z10 = true;
        s2Var2.b(d2Var != null && d2Var.o(), false);
        s2 s2Var3 = this.a2;
        d2 d2Var2 = d2.W;
        if (d2Var2 != null && !d2Var2.m()) {
            z10 = false;
        }
        s2Var3.a(z10, false);
        addView(this.a2, w7.x5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 85));
    }

    public final void y0() {
        if (this.Z1 != null || getContext() == null) {
            return;
        }
        this.Y1 = new x2(getContext(), this.C2);
        y2 y2Var = new y2(getContext(), this.Y1, this.I3);
        this.Z1 = y2Var;
        y2Var.setOnClickListener(new f3(this, 6));
        this.Z1.setOnLongClickListener(new c3(this, 1));
        addView(this.Z1, w7.x5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 85));
        addView(this.Y1, w7.x5.a(200.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 85));
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
        textView3.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.i2.setGravity(17);
        w7.z5.a(this.i2);
        this.i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.g2.addView(imageView, w7.x5.t(22, 22, 16, 12, 1, 4, 0));
        this.g2.addView(this.h2, w7.x5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.g2.addView(this.i2, w7.x5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.b2.addView(this.g2, w7.x5.a(-1.0f, 14.0f, 0.0f, 8.0f, 0.0f, -1, 119));
    }
}
