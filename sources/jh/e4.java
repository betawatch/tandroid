package jh;

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
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.oa;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.wd;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.yd;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ou0;
import org.telegram.ui.rn;
import org.telegram.ui.rr;
import org.telegram.ui.sy;
import org.telegram.ui.ta1;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class e4 extends zu0 implements NotificationCenter.NotificationCenterDelegate {
    public x6 A0;
    public boolean A1;
    public boolean A2;
    public org.telegram.ui.ActionBar.f1 A3;
    public lh.w3 B0;
    public boolean B1;
    public a3 B2;
    public final jg.a B3;
    public lh.w3 C0;
    public boolean C1;
    public boolean C2;
    public final og.a C3;
    public lh.w3 D0;
    public long D1;
    public float D2;
    public final og.d D3;
    public int E0;
    public final float E1;
    public t2 E2;
    public final mg.b E3;
    public final i9 F0;
    public int F1;
    public k50 F2;
    public TL_stories.TL_premium_boostsStatus F3;
    public final n3 G0;
    public boolean G1;
    public int G2;
    public ChannelBoostsController.CanApplyBoost G3;
    public final g2 H0;
    public int H1;
    public boolean H2;
    public long H3;
    public final View I0;
    public int I1;
    public final d4 I2;
    public long I3;
    public final ImageView J0;
    public int J1;
    public final AnimationNotificationsLocker J2;
    public boolean J3;
    public final LinearLayout K0;
    public final c4 K1;
    public final org.telegram.ui.Components.y5 K2;
    public TLRPC.TL_channels_sendAsPeers K3;
    public final z2 L0;
    public final com.google.firebase.messaging.m L1;
    public final org.telegram.ui.Components.y5 L2;
    public final v1 L3;
    public org.telegram.ui.Components.i6 M0;
    public y3 M1;
    public float M2;
    public int M3;
    public org.telegram.ui.Components.i6 N0;
    public boolean N1;
    public long N2;
    public final v1 N3;
    public org.telegram.ui.Components.y5 O0;
    public s6 O1;
    public boolean O2;
    public final ArrayList O3;
    public org.telegram.ui.Components.y5 P0;
    public boolean P1;
    public boolean P2;
    public final ArrayList P3;
    public boolean Q0;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public boolean R0;
    public boolean R1;
    public boolean R2;
    public final a8.b R3;
    public long S0;
    public z2 S1;
    public x30 S2;
    public final org.telegram.ui.Components.y5 S3;
    public long T0;
    public a T1;
    public final ou0 T2;
    public final org.telegram.ui.Components.y5 T3;
    public boolean U0;
    public q1 U1;
    public boolean U2;
    public final org.telegram.ui.Components.y5 U3;
    public boolean V0;
    public r1 V1;
    public w2 V2;
    public float V3;
    public boolean W0;
    public n1 W1;
    public FrameLayout W2;
    public final Path W3;
    public boolean X0;
    public o2 X1;
    public cg.q X2;
    public boolean X3;
    public final j3 Y0;
    public sg.g Y1;
    public boolean Y2;
    public ValueAnimator Y3;
    public final FrameLayout Z0;
    public lh.w3 Z1;
    public q2 Z2;
    public float Z3;
    public final y2 a1;
    public ValueAnimator a2;
    public float a3;
    public final ImageReceiver b1;
    public wj0 b2;
    public boolean b3;
    public final ImageReceiver c1;
    public LinearLayout c2;
    public boolean c3;
    public final ArrayList d1;
    public TextView d2;
    public boolean d3;
    public Runnable e1;
    public TextView e2;
    public boolean e3;
    public final f3 f1;
    public g8 f2;
    public boolean f3;
    public final sy g1;
    public ViewPropertyAnimator g2;
    public boolean g3;
    public h4 h1;
    public final lg.d h2;
    public final ImageReceiver h3;
    public float i1;
    public final lg.d i2;
    public ig.d i3;
    public final org.telegram.ui.Components.y8 j1;
    public final Paint j2;
    public final ImageReceiver j3;
    public final a4 k1;
    public int k2;
    public org.telegram.ui.Components.k5 k3;
    public final h8 l1;
    public ValueAnimator l2;
    public boolean l3;
    public u5.k m1;
    public float m2;
    public boolean m3;
    public int n1;
    public float n2;
    public wj0 n3;
    public org.telegram.ui.ActionBar.f1 o1;
    public float o2;
    public boolean o3;
    public x3 p1;
    public int p2;
    public float p3;
    public TL_stories.PeerStories q1;
    public boolean q2;
    public boolean q3;
    public final ArrayList r1;
    public boolean r2;
    public float r3;
    public final ImageView s0;
    public final ArrayList s1;
    public boolean s2;
    public int s3;
    public final ImageView t0;
    public final b4 t1;
    public boolean t2;
    public int t3;
    public final ag.d u0;
    public final gf.p0 u1;
    public int u2;
    public int u3;
    public final ri0 v0;
    public ArrayList v1;
    public final int v2;
    public v1 v3;
    public final ImageView w0;
    public int w1;
    public TextView w2;
    public float w3;
    public final org.telegram.ui.ActionBar.c6 x0;
    public long x1;
    public fh.b x2;
    public boolean x3;
    public final n8 y0;
    public boolean y1;
    public int y2;
    public rr y3;
    public final z2 z0;
    public boolean z1;
    public int z2;
    public org.telegram.ui.ActionBar.f1 z3;

    public e4(Context context, final i9 i9Var, b4 b4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.X0 = true;
        this.d1 = new ArrayList();
        this.n1 = -5;
        this.E1 = 1.0f;
        c4 c4Var = new c4(this);
        this.K1 = c4Var;
        this.m2 = -1.0f;
        this.n2 = -1.0f;
        this.o2 = -1.0f;
        this.v2 = ConnectionsManager.generateClassGuid();
        this.K2 = new org.telegram.ui.Components.y5(this);
        this.L2 = new org.telegram.ui.Components.y5(this);
        ou0 ou0Var = new ou0();
        this.T2 = ou0Var;
        this.a3 = 1.0f;
        this.L3 = new v1(this, 4);
        this.N3 = new v1(this, 11);
        this.O3 = new ArrayList();
        this.P3 = new ArrayList();
        this.R3 = new a8.b(this, 24);
        this.S3 = new org.telegram.ui.Components.y5(this);
        this.T3 = new org.telegram.ui.Components.y5(this);
        this.U3 = new org.telegram.ui.Components.y5(this);
        this.W3 = new Path();
        ou0Var.E = new ga.c(this, 20);
        d4 d4Var = new d4();
        d4Var.g = new ArrayList();
        this.I2 = d4Var;
        this.J2 = new AnimationNotificationsLocker();
        this.r1 = new ArrayList();
        this.s1 = new ArrayList();
        final int i10 = 0;
        y2 y2Var = new y2(this, i10);
        this.a1 = y2Var;
        y2Var.setCrossfadeWithOldImage(false);
        y2Var.setAllowLoadingOnAttachedOnly(true);
        y2Var.ignoreNotifications = true;
        y2Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.j3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.b1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.c1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        y2Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.j1 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.F0 = i9Var;
        this.t1 = b4Var;
        this.L1 = b4Var.g;
        this.O1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        b4Var.l.setColor(-16777216);
        this.j2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.x0 = c6Var;
        setClipChildren(false);
        f3 f3Var = new f3(this, context, this.Y0, c6Var, i9Var);
        this.f1 = f3Var;
        mg.b bVar = new mg.b(c6Var, org.telegram.ui.ActionBar.g6.Sd, 0.8f);
        this.E3 = bVar;
        og.c cVar = new og.c();
        cVar.a(i0.b.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.D3 = null;
            this.C3 = cVar;
        } else {
            og.d dVar = new og.d(cVar);
            this.D3 = dVar;
            dVar.f(AndroidUtilities.dp(8.0f));
            this.C3 = dVar;
        }
        qg.j jVar = new qg.j(this);
        jg.a aVar = new jg.a(this.C3);
        aVar.d = jVar;
        aVar.e = this;
        this.B3 = aVar;
        this.h2 = aVar.c(this, bVar, false);
        lg.d c10 = aVar.c(this, bVar, false);
        this.i2 = c10;
        c10.t(AndroidUtilities.dp(32.0f));
        j3 j3Var = new j3(this, context, b4Var, i9Var);
        this.Y0 = j3Var;
        j3Var.setClipChildren(false);
        this.g1 = new sy(this.y2, j3Var);
        j3Var.addView(f3Var, h7.z5.c(-1.0f, -1));
        n3 n3Var = new n3(this, getContext(), i9Var.y, i9Var, c6Var);
        this.G0 = n3Var;
        n3Var.U.setOnClickListener(new x1(this, 10));
        ImageView imageView = new ImageView(context);
        this.J0 = imageView;
        imageView.setImageDrawable(b4Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new x1(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        h7.b6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(b4Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        z2 z2Var = new z2(this, getContext(), 1);
        this.L0 = z2Var;
        org.telegram.ui.Components.i6 i6Var = this.N0;
        if (i6Var != null) {
            i6Var.setCallback(z2Var);
        }
        z2Var.setWillNotDraw(false);
        z2Var.setOnClickListener(new x1(this, 12));
        z2 z2Var2 = new z2(this, getContext(), 2);
        this.z0 = z2Var2;
        org.telegram.ui.Components.i6 i6Var2 = this.M0;
        if (i6Var2 != null) {
            i6Var2.setCallback(z2Var2);
        }
        z2Var2.setWillNotDraw(false);
        z2Var2.setOnClickListener(new x1(this, 13));
        z2Var2.setOnLongClickListener(new f2(i10, this, i9Var));
        x6 x6Var = new x6(context, b4Var);
        this.A0 = x6Var;
        x6Var.setPadding(dp, dp, dp, dp);
        z2Var2.addView(this.A0, h7.z5.e(40, 40, 3));
        z2Var.addView(imageView2, h7.z5.e(40, 40, 3));
        h7.b6.b(z2Var2, 0.3f, 5.0f);
        h7.b6.b(z2Var, 0.3f, 5.0f);
        y2Var.setAllowLoadingOnAttachedOnly(true);
        y2Var.setParentView(j3Var);
        gf.p0 p0Var = new gf.p0(10);
        this.u1 = p0Var;
        j3Var.setOutlineProvider(p0Var);
        j3Var.setClipToOutline(true);
        addView(j3Var);
        a4 a4Var = new a4(context, c4Var);
        this.k1 = a4Var;
        a4Var.setOnClickListener(new View.OnClickListener(this) { // from class: jh.t1
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e4 e4Var = this.b;
                        long j10 = UserConfig.getInstance(e4Var.y2).clientUserId;
                        long j11 = e4Var.x1;
                        i9 i9Var2 = i9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                i9Var2.H(rn.R9(j11));
                                break;
                            } else {
                                i9Var2.H(ProfileActivity.m4(j11));
                                break;
                            }
                        } else {
                            Bundle g10 = a9.p.g(1, TeXSymbolParser.TYPE_ATTR);
                            g10.putLong("dialog_id", e4Var.x1);
                            i9Var2.H(new o90(g10, null));
                            break;
                        }
                    default:
                        e4 e4Var2 = this.b;
                        if (!e4Var2.K1.j()) {
                            e4Var2.c1(true);
                            break;
                        } else {
                            i9Var.O();
                            if (!i9.z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            e4Var2.u0.setContentDescription(LocaleController.getString(!i9.z1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        j3Var.addView(a4Var, h7.z5.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.K0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, h7.z5.q(40, 40, 5));
        linearLayout.addView(z2Var, h7.z5.q(40, 40, 5));
        linearLayout.addView(z2Var2, h7.z5.q(40, 40, 5));
        addView(linearLayout, h7.z5.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.s0 = imageView3;
        imageView3.setImageDrawable(b4Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        j3Var.addView(imageView3, h7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.t0 = imageView4;
        imageView4.setImageDrawable(b4Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        j3Var.addView(imageView4, h7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ag.w0(i9Var, 22));
        imageView3.setOnClickListener(new b0(this, c6Var, i9Var, context, b4Var, 1));
        ag.d dVar2 = new ag.d(context, 2);
        this.u0 = dVar2;
        j3Var.addView(dVar2, h7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ri0 ri0Var = new ri0(context);
        this.v0 = ri0Var;
        ri0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        dVar2.addView(ri0Var);
        ImageView imageView5 = new ImageView(context);
        this.w0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(b4Var.t);
        dVar2.addView(imageView5);
        imageView5.setVisibility(8);
        n8 n8Var = new n8(context);
        this.y0 = n8Var;
        n8Var.setOnClickListener(new x1(this, 2));
        j3Var.addView(n8Var, h7.z5.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i11 = 1;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: jh.t1
            public final /* synthetic */ e4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e4 e4Var = this.b;
                        long j10 = UserConfig.getInstance(e4Var.y2).clientUserId;
                        long j11 = e4Var.x1;
                        i9 i9Var2 = i9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                i9Var2.H(rn.R9(j11));
                                break;
                            } else {
                                i9Var2.H(ProfileActivity.m4(j11));
                                break;
                            }
                        } else {
                            Bundle g10 = a9.p.g(1, TeXSymbolParser.TYPE_ATTR);
                            g10.putLong("dialog_id", e4Var.x1);
                            i9Var2.H(new o90(g10, null));
                            break;
                        }
                    default:
                        e4 e4Var2 = this.b;
                        if (!e4Var2.K1.j()) {
                            e4Var2.c1(true);
                            break;
                        } else {
                            i9Var.O();
                            if (!i9.z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            e4Var2.u0.setContentDescription(LocaleController.getString(!i9.z1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.l1 = new h8(this, b4Var);
        j3Var.addView(n3Var, h7.z5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.I0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        g2 g2Var = new g2(this, context, i9Var, i9Var.v, view, frameLayout, i9Var);
        this.H0 = g2Var;
        j3Var.addView(view, h7.z5.e(-1, 200, 87));
        j3Var.addView(g2Var, h7.z5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        j3Var.addView(frameLayout, h7.z5.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.b.k(-1, 100);
        dVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.b.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.b.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.i0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.b.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.b.k(-1, 100);
        z2Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.b.k(-1, 100);
        z2Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        t9 t9Var = n3Var.S;
        View o10 = t9Var.o(context);
        if (o10 != null) {
            AndroidUtilities.removeFromParent(o10);
            addView(o10);
        }
        t9Var.D = new h2(this, 0);
        t9Var.T(this);
    }

    public static void V0(r6 r6Var, ImageReceiver imageReceiver, String str) {
        if (r6Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(r6Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(r6Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(e4 e4Var, ValueAnimator valueAnimator) {
        n8 n8Var = e4Var.y0;
        e4Var.Z3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a4 a4Var = e4Var.k1;
        a4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var.Z3);
        a4Var.setAlpha(1.0f - e4Var.Z3);
        ImageView imageView = e4Var.s0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var.Z3);
        imageView.setAlpha(1.0f - e4Var.Z3);
        ImageView imageView2 = e4Var.t0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var.Z3);
        imageView2.setAlpha(1.0f - e4Var.Z3);
        ag.d dVar = e4Var.u0;
        dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var.Z3);
        dVar.setAlpha((1.0f - e4Var.Z3) * e4Var.a3);
        z2 z2Var = e4Var.S1;
        if (z2Var != null) {
            z2Var.setTranslationY(AndroidUtilities.dp(8.0f) * e4Var.Z3);
            e4Var.S1.setAlpha(1.0f - e4Var.Z3);
        }
        if (n8Var != null) {
            n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var.Z3);
            n8Var.setAlpha(1.0f - e4Var.Z3);
        }
        e4Var.G0.setAlpha(1.0f - e4Var.Z3);
        y3 y3Var = e4Var.M1;
        float f10 = y3Var == null ? 0.0f : ((z8) y3Var).d.R;
        float hideInterfaceAlpha = e4Var.getHideInterfaceAlpha();
        z2 z2Var2 = e4Var.z0;
        if (z2Var2 != null) {
            z2Var2.setAlpha((1.0f - e4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = e4Var.J0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - e4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        z2 z2Var3 = e4Var.L0;
        if (z2Var3 != null) {
            z2Var3.setAlpha((1.0f - e4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        o2 o2Var = e4Var.X1;
        if (o2Var != null) {
            o2Var.setAlpha(1.0f - e4Var.Z3);
            e4Var.invalidate();
        }
        e4Var.Y0.invalidate();
    }

    public static void a0(e4 e4Var, boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = e4Var.z3;
        if (f1Var == null || e4Var.y3 == null || f1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(i9.x1 - 0.2f) < 0.05f) {
                e4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(i9.x1 - 0.5f) < 0.05f) {
                e4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(i9.x1 - 1.0f) < 0.05f) {
                e4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(i9.x1 - 1.5f) < 0.05f) {
                e4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(i9.x1 - 2.0f) < 0.05f) {
                e4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                e4Var.z3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, af.g.a(i9.x1) + "x"));
            }
        }
        e4Var.y3.a(i9.x1, z10);
    }

    public static void b0(e4 e4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (e4Var.I0() || e4Var.K1.f) {
            return;
        }
        if (UserConfig.getInstance(e4Var.y2).isPremium()) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, e4Var.x0).setOnClickListener(new x1(e4Var, 8));
            return;
        }
        Drawable drawable = e4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.b.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        i2 i2Var = new i2(e4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, e4Var.x0);
        c10.setOnClickListener(new x1(e4Var, 9));
        c10.setIcon(i2Var);
    }

    public static void d0(e4 e4Var) {
        c4 c4Var = e4Var.K1;
        TL_stories.StoryItem storyItem = c4Var.a;
        if ((storyItem == null && c4Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = c4Var.h();
        boolean z10 = c4Var.e;
        if (h == null || !h.exists()) {
            e4Var.a1();
            return;
        }
        MediaController.saveFile(h.toString(), e4Var.getContext(), z10 ? 1 : 0, null, null, new hh.o6(1, e4Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(e4 e4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(e4Var.y2).getUser(Long.valueOf(j10));
            str = user.first_name;
            z10 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(e4Var.y2).getChat(Long.valueOf(-j10));
            str = chat2.title;
            z10 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new hh.i(e4Var, MessagesController.getInstance(e4Var.y2), j10, !z10, str, chat), 200L);
    }

    public static void f0(e4 e4Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e4Var.getContext(), 0, e4Var.x0);
        alertDialog$Builder.a.N = LocaleController.getString(e4Var.I0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.P = LocaleController.getString(e4Var.I0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new s1(e4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ia.l(16));
        z8 z8Var = (z8) e4Var.M1;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        z8Var.h(b2Var);
        b2Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f10 = 1.0f - this.K2.c;
        k5 k5Var = this.F0.w;
        return (1.0f - (k5Var == null ? 0.0f : k5Var.f)) * f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        i9 i9Var;
        if (!this.K1.f || (i9Var = this.F0) == null || i9Var.w0 == null || D0(true)) {
            return 0L;
        }
        return i9Var.w0.j();
    }

    public static void h0(e4 e4Var) {
        org.telegram.ui.ActionBar.c6 c6Var = e4Var.x0;
        j3 j3Var = e4Var.Y0;
        if (e4Var.C1) {
            return;
        }
        int i10 = 1;
        if (!e4Var.A1) {
            o2 o2Var = e4Var.X1;
            int i11 = -e4Var.n1;
            e4Var.n1 = i11;
            AndroidUtilities.shakeViewSpring(o2Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = e4Var.x1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(e4Var.y2).getUser(Long.valueOf(e4Var.x1))) : "";
            (MessagesController.getInstance(e4Var.y2).premiumFeaturesBlocked() ? new mc(j3Var, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new mc(j3Var, c6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new v1(e4Var, 5))).j();
            return;
        }
        if (e4Var.F3 != null && e4Var.G3 != null) {
            ag.i1.C1(new ag.r2(e4Var, 4), e4Var.F3, e4Var.G3, e4Var.x1, true);
            return;
        }
        i9 i9Var = e4Var.F0;
        if (i9Var != null) {
            i9Var.g1 = true;
            i9Var.P();
        }
        MessagesController.getInstance(e4Var.y2).getBoostsController().getBoostsStats(e4Var.x1, new ig.i(e4Var, i10));
    }

    public static void j0(e4 e4Var) {
        c4 c4Var = e4Var.K1;
        if (c4Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = c4Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(e4Var.y2).getInputPeer(e4Var.x1);
        ConnectionsManager.getInstance(e4Var.y2).sendRequest(tL_stories_exportStoryLink, new x2());
    }

    public final void A0() {
        if (this.X2 != null) {
            return;
        }
        cg.q qVar = new cg.q(getContext(), 2);
        this.X2 = qVar;
        qVar.setTextSize(1, 14.0f);
        this.X2.setTextColor(i0.b.d(0.5f, -16777216, -1));
        this.X2.setGravity(19);
        this.X2.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.X2, h7.z5.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.S1 != null) {
            return;
        }
        z2 z2Var = new z2(this, getContext(), 0);
        this.S1 = z2Var;
        z2Var.setClickable(true);
        addView(this.S1, h7.z5.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        a3 a3Var = new a3(this, getContext());
        this.B2 = a3Var;
        a3Var.setOnClickListener(new x1(this, 0));
        this.S1.addView(this.B2, h7.z5.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        fh.b bVar = new fh.b(1, getContext(), false);
        this.x2 = bVar;
        bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.S1.addView(this.x2, h7.z5.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.w2 = textView;
        textView.setTextSize(1, 14.0f);
        this.w2.setTextColor(-1);
        this.S1.addView(this.w2, h7.z5.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.t1.s);
        a3 a3Var2 = this.B2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.b.k(-1, 120);
        a3Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.M(i0.b.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.W2 != null) {
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
        org.telegram.ui.ActionBar.c6 c6Var = this.x0;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        TextView textView2 = new TextView(getContext());
        h7.b6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.g6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int k10 = i0.b.k(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, k10, k10));
        textView2.setOnClickListener(new x1(this, 3));
        linearLayout.addView(textView, h7.z5.n(-1, -2));
        linearLayout.addView(textView2, h7.z5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, h7.z5.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.Y0.addView(frameLayout);
        this.W2 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        d1 d1Var;
        TLRPC.Peer i10;
        d1 d1Var2;
        long clientUserId = UserConfig.getInstance(this.y2).getClientUserId();
        long j10 = this.x1;
        i9 i9Var = this.F0;
        if (j10 >= 0 || (d1Var2 = i9Var.w0) == null) {
            if (j10 < 0 || i9Var == null || (d1Var = i9Var.w0) == null || !d1Var.l()) {
                return false;
            }
            return !z10 || (i10 = i9Var.w0.i()) == null || this.x1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.x1 == clientUserId;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i11 = d1Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
        if (i9Var.w0.l() || ChatObject.canManageCalls(chat)) {
            return i11 == null || this.x1 == DialogObject.getPeerDialogId(i11) || DialogObject.getPeerDialogId(i11) == UserConfig.getInstance(this.y2).getClientUserId();
        }
        return false;
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        d4 d4Var = this.I2;
        c5.c cVar = d4Var.d;
        if (cVar != null && d4Var.c != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(d4Var.c, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (cVar != null && (textureView = d4Var.e) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        j3 j3Var = this.Y0;
        canvas.scale(i10 / j3Var.getMeasuredWidth(), i11 / j3Var.getMeasuredHeight());
        this.a1.draw(canvas);
        canvas.restore();
    }

    public final void F0(lh.o9 o9Var, TL_stories.StoryItem storyItem) {
        y3 y3Var = this.M1;
        lh.q9 q9Var = new lh.q9(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.x0);
        q9Var.q1(o9Var);
        lh.h1 h1Var = q9Var.b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof lh.k9) {
                    ((lh.k9) view).e(false);
                }
            }
        }
        q9Var.k1(true);
        q9Var.P = new z1(0, this, storyItem);
        ((z8) y3Var).h(q9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0190, code lost:
    
        if (r3 == r10.b2) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G0(ViewGroup viewGroup, float f10, float f11, boolean z10) {
        lh.w3 w3Var;
        d4 d4Var;
        c5.c cVar;
        if (viewGroup != null) {
            lh.w3 w3Var2 = this.B0;
            if ((w3Var2 == null || !w3Var2.R) && ((w3Var = this.C0) == null || !w3Var.R)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        n3 n3Var = this.G0;
                        if (childAt == n3Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f10, (int) f11)) {
                                float top = f11 - childAt.getTop();
                                z7 z7Var = n3Var.U;
                                if (z7Var.w == 1.0f && !n3Var.o0) {
                                    if (top > z7Var.getTranslationY() + (n3Var.n0.getTop() - n3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.Y0 || (d4Var = this.I2) == null || (cVar = d4Var.d) == null || !G0(cVar, f10 - childAt.getX(), f11 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f10, (int) f11))) {
                            f3 f3Var = this.f1;
                            if (childAt == f3Var && f3Var.b == null && (f10 < AndroidUtilities.dp(60.0f) || f10 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = f3Var.e;
                                float[] fArr = f3Var.f;
                                for (int i11 = 0; i11 < f3Var.getChildCount(); i11++) {
                                    View childAt2 = f3Var.getChildAt(i11);
                                    if (childAt2 != f3Var.d && (childAt2 instanceof p8)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f10;
                                        fArr[1] = f11;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                g2 g2Var = this.H0;
                                if (childAt == g2Var) {
                                    ta1 ta1Var = g2Var.f;
                                    hh.f1 f1Var = g2Var.c;
                                    ta1 ta1Var2 = g2Var.f;
                                    ta1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f10 - g2Var.getX()) - ta1Var2.getX()), (int) ((f11 - g2Var.getY()) - ta1Var2.getY()))) {
                                        if (g2Var.b0) {
                                            continue;
                                        } else if (!this.r2) {
                                            if (f11 <= g2Var.s() + g2Var.getY() && f1Var.E(f10, (f11 - g2Var.getY()) - f1Var.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.r2) {
                                        if (childAt == this.X1 && f11 > rect2.top) {
                                        }
                                    }
                                    if (!z10) {
                                        if (rect2.contains((int) f10, (int) f11)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            o2 o2Var = this.X1;
                                            if (o2Var != null && childAt == o2Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && G0((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), z10)) {
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
        float x8 = getX();
        j3 j3Var = this.Y0;
        float x10 = view.getX() + j3Var.getX() + x8;
        float y10 = view.getY() + j3Var.getY() + getY();
        return motionEvent.getX() >= x10 && motionEvent.getX() <= x10 + ((float) view.getWidth()) && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + ((float) view.getHeight());
    }

    public final boolean I0() {
        j6 j6Var;
        i9 i9Var = this.F0;
        return (i9Var == null || (j6Var = i9Var.K0) == null || j6Var.e != 4) ? false : true;
    }

    public final boolean J0() {
        TLRPC.User user;
        return I0() && (user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.F0.K0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean K0();

    public final void L0(ig.q0 q0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        c4 c4Var = this.K1;
        TL_stories.StoryItem storyItem = c4Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && q0Var == null) {
            l0();
            this.O1.g0(this.x1, c4Var.a, null);
        } else if (q0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.y2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.l3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = ig.m0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.h3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                this.m3 = true;
                this.O1.g0(this.x1, c4Var.a, ig.q0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.O1.g0(this.x1, c4Var.a, q0Var);
        }
        TL_stories.StoryItem storyItem2 = c4Var.a;
        z2 z2Var = this.z0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.A0.setReaction(null);
            z2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.A0.setReaction(ig.q0.d(reaction));
            z2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.z1 && z11) {
            TL_stories.StoryItem storyItem3 = c4Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = c4Var.a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = c4Var.a;
        ig.s0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        d1 d1Var;
        if (this.K3 != null) {
            return;
        }
        i9 i9Var = this.F0;
        if (i9Var != null && (d1Var = i9Var.w0) != null) {
            if (d1Var.v == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.y2).getSendAsPeers(this.x1, true);
        this.K3 = sendAsPeers;
        o2 o2Var = this.X1;
        if (o2Var == null || sendAsPeers == null) {
            return;
        }
        o2Var.O1(true);
    }

    public final boolean N0() {
        o2 o2Var = this.X1;
        if (o2Var == null) {
            return false;
        }
        boolean z10 = o2Var.u2;
        if (z10) {
            o2Var.r1();
        }
        AndroidUtilities.runOnUIThread(new v1(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j10;
        ag.n0 n0Var;
        int i10;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.X1.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.y2).getClientUserId();
        TLRPC.Peer i11 = this.F0.w0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.y2;
        String shortName = DialogObject.getShortName(i12, this.x1);
        long messageMinPrice = getMessageMinPrice();
        long j11 = this.H3;
        ag.n0 n0Var2 = new ag.n0(this, 20);
        b bVar = new b();
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, bVar, false, false);
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
            j10 = j11;
            n0Var = n0Var2;
            i10 = ((org.telegram.ui.Components.t5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.t5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j11;
            n0Var = n0Var2;
            i10 = 0;
        }
        int max = (int) Math.max(messageMinPrice, j10 <= 0 ? 100L : j10);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            int i13 = length * 7;
            int i14 = iArr[i13];
            int[] iArr2 = iArr;
            int i15 = iArr2[i13 + 2];
            if (i10 <= iArr2[i13 + 3] && charSequence.length() <= i15) {
                max = Math.max(max, i14);
                break;
            } else {
                length--;
                iArr = iArr2;
            }
        }
        final long[] jArr = {max};
        final cq[] cqVarArr = new cq[1];
        final lh.d dVar = new lh.d(context, null, true);
        final s0 s0Var = new s0();
        s0Var.c = clientUserId;
        s0Var.f = textWithEntities;
        s0Var.g = jArr[0];
        final n0 n0Var3 = new n0(i12, context, true);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 0);
        final ag.p1 p1Var = new ag.p1(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        g10.addView(p1Var, h7.z5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final ag.p1 p1Var2 = new ag.p1(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        g10.addView(p1Var2, h7.z5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final ag.p1 p1Var3 = new ag.p1(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        g10.addView(p1Var3, h7.z5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final r rVar = new r(context, bVar, r6);
        final boolean[] zArr = {true};
        Utilities.Callback[] callbackArr = {new Utilities.Callback() { // from class: jh.q
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), cqVarArr), true, true);
                long j12 = jArr2[0];
                s0 s0Var2 = s0Var;
                s0Var2.g = j12;
                n0Var3.set(s0Var2);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = s.b(i16, intValue2, 0);
                int b11 = s.b(i16, num.intValue(), 1);
                int b12 = s.b(i16, num.intValue(), 2);
                ((org.telegram.ui.Components.j6) p1Var.b).c(b10 >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.j6) p1Var2.b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.j6) p1Var3.b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = s.b(i16, num.intValue(), 3);
                int b14 = s.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                rVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        n0Var3.set(s0Var);
        int i16 = 9;
        int[] iArr3 = {1, 50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000};
        int i17 = MessagesController.getInstance(i12).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i18 = 0;
        while (true) {
            if (i18 >= i16) {
                break;
            }
            int[] iArr4 = iArr3;
            if (iArr3[i18] >= messageMinPrice) {
                if (i18 > 0 && arrayList.isEmpty() && iArr4[i18] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i19 = iArr4[i18];
                if (i19 <= i17) {
                    arrayList.add(Integer.valueOf(i19));
                    if (iArr4[i18] == i17) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i17));
                    break;
                }
            }
            i18++;
            iArr3 = iArr4;
            i16 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) i0.a.i(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr5[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        rVar.a0 = iArr5;
        rVar.setValue((int) jArr[0]);
        linearLayout.addView(rVar, h7.z5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(g10, h7.z5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.g6.j5;
        TextView b10 = h7.d6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, h7.z5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = h7.d6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        rl.n(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, h7.z5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(n0Var3, h7.z5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, h7.z5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        e3Var.show();
        dVar.setOnClickListener(new gg.f(n0Var, jArr, e3Var, 9));
    }

    public final void P0() {
        if (this.X1 == null) {
            return;
        }
        t0();
        this.E2.f0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.X1.P();
        }
        this.E2.J1(-1, true);
        t2 t2Var = this.E2;
        t2Var.V = this.x1;
        t2Var.r1();
        this.E2.m1().setText(this.X1.getFieldText());
        ((z8) this.M1).h(this.E2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j10 = this.x1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.y2).getDialog(this.x1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.F0.H(new rn(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(long j10) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        long j11;
        lh.c4 c4Var;
        d1 d1Var;
        boolean z10 = this.G1;
        d4 d4Var = this.I2;
        if (!z10) {
            d4Var.d = null;
            return;
        }
        c4 c4Var2 = this.K1;
        boolean z11 = c4Var2.f;
        j3 j3Var = this.Y0;
        if (!z11) {
            if (!c4Var2.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): null, not a video");
                ((z8) this.M1).c(null, null, 0L, this.I2);
                d4Var.d = null;
                d4Var.f = false;
                return;
            }
            if (c4Var2.f() == null || !new File(c4Var2.f()).exists()) {
                TL_stories.StoryItem storyItem = c4Var2.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.x1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = c4Var2.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.y2).getFileReference(c4Var2.a);
                            }
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(this.y2);
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
                            sb2.append(c4Var2.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(c4Var2.a.id);
                            sb2.append("&did=");
                            sb2.append(c4Var2.a.dialogId);
                            Uri parse = Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb2.toString());
                            FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from " + parse);
                            this.N2 = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((z8) this.M1).c(document, uri, j10, this.I2);
                            j3Var.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(c4Var2.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from attachPath " + fromFile);
                this.N2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): playing from null?");
            }
            ((z8) this.M1).c(document, uri, j10, this.I2);
            j3Var.invalidate();
            return;
        }
        y3 y3Var = this.M1;
        TL_stories.StoryItem storyItem3 = c4Var2.a;
        long j12 = this.x1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        z8 z8Var = (z8) y3Var;
        z8Var.i(true, true);
        i9 i9Var = z8Var.d;
        d1 d1Var2 = i9Var.w0;
        if (d1Var2 == null || d1Var2.b != j12 || !d1Var2.f(inputGroupCall)) {
            lh.c4 c4Var3 = i9Var.z0;
            if (c4Var3 != null) {
                c4Var3.d(j12, null);
                lh.c4 c4Var4 = i9Var.z0;
                SurfaceViewRenderer surfaceViewRenderer = c4Var4.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = c4Var4.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                c4Var4.r = false;
                c4Var4.e(false, false);
            }
            i1 i1Var = i1.V;
            if (i1Var.O && (d1Var = i1Var.v) != null && d1Var.f(inputGroupCall)) {
                d1 d1Var3 = i1Var.v;
                i1Var.v = null;
                i9Var.w0 = d1Var3;
                i1Var.k(false);
            } else {
                d1 d1Var4 = i9Var.w0;
                if (d1Var4 != null) {
                    if (!d1Var4.n && (!i1Var.O || i1Var.v != d1Var4)) {
                        d1Var4.e();
                    } else if (d1Var4.K != i9Var.z0.getSink()) {
                        i9Var.w0.s(null);
                    }
                    i9Var.w0 = null;
                }
            }
            if (i1Var.O) {
                i1.j();
            }
            h9 h9Var = i9Var.v0;
            if (h9Var != null) {
                h9Var.release(null);
                i9Var.v0 = null;
            }
            d4 d4Var2 = i9Var.C0;
            if (d4Var2 != null) {
                d4Var2.b = null;
                d4Var2.a = null;
                d4Var2.f = false;
                d4Var2.d = null;
                d4Var2.e = null;
                d4Var2.c = null;
                d4Var2.a();
                i9Var.C0 = null;
            }
            if (i9Var.w0 == null) {
                d1 d1Var5 = d1.S;
                if (d1Var5 == null || !d1Var5.f(inputGroupCall)) {
                    d1 d1Var6 = new d1(z8Var.c, i9Var.h, storyItem3, j12, i10, z12, inputGroupCall, false, false);
                    j11 = j12;
                    i9Var.w0 = d1Var6;
                    c4Var = i9Var.A0;
                    if (c4Var == null) {
                        i9Var.w0.s(c4Var.getSink());
                    } else {
                        i9Var.w0.s(i9Var.z0.getSink());
                    }
                    i9Var.C0 = d4Var;
                    d4Var.f = false;
                    d4Var.d = i9Var.u0;
                    lh.c4 c4Var5 = i9Var.z0;
                    d4Var.e = c4Var5.d;
                    d4Var.c = c4Var5.c;
                    d4Var.a = i9Var.w0;
                    c4Var5.d(j11, d4Var);
                    i9Var.C0.a();
                } else {
                    i9Var.w0 = d1.S;
                }
            }
            j11 = j12;
            c4Var = i9Var.A0;
            if (c4Var == null) {
            }
            i9Var.C0 = d4Var;
            d4Var.f = false;
            d4Var.d = i9Var.u0;
            lh.c4 c4Var52 = i9Var.z0;
            d4Var.e = c4Var52.d;
            d4Var.c = c4Var52.c;
            d4Var.a = i9Var.w0;
            c4Var52.d(j11, d4Var);
            i9Var.C0.a();
        }
        j3Var.invalidate();
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
        if (uri == null || (storyItem = this.K1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String uri2 = uri.toString();
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                String str3 = uri2.split("/1/")[1];
                int indexOf = str3.indexOf("/ACTUAL");
                parse = indexOf != -1 ? Uri.parse(URLDecoder.decode(str3.substring(0, indexOf), "UTF-8")) : uri;
            } catch (Exception e9) {
                FileLog.e(e9);
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
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), str, str2, null, null, null, this.x1, null, null, storyItem, null, null, true, 0, null, null, false);
                return;
            } else {
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), null, null, parse, null, null, this.x1, null, null, storyItem, null, null, true, 0, null, null, false);
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
        if (this.G1 != z10) {
            this.G1 = z10;
            ri0 ri0Var = this.v0;
            if (z10) {
                if (this.F0.a && Build.VERSION.SDK_INT < 33) {
                    i9 i9Var = ((z8) this.M1).d;
                    i9Var.h1 = true;
                    i9Var.P();
                    a8.b bVar = this.R3;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 100L);
                }
                R0(j10);
                g1();
                ri0Var.setAnimation(this.t1.u);
                this.G1 = true;
                this.k1.a.getImageReceiver().setVisible(true, true);
                c4 c4Var = this.K1;
                if (c4Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.x1 + " storyId=" + c4Var.a.id + " " + c4.c(c4Var));
                }
            } else {
                p0();
                ri0Var.a();
                this.h1 = null;
                this.H2 = false;
                this.K2.d(0.0f, true);
                this.Y0.invalidate();
                invalidate();
                q0();
                i9 i9Var2 = ((z8) this.M1).d;
                i9Var2.E0 = false;
                i9Var2.P();
            }
            this.a1.setFileLoadingPriority(this.G1 ? 3 : 2);
            this.b1.setFileLoadingPriority(this.G1 ? 2 : 0);
            this.c1.setFileLoadingPriority(this.G1 ? 2 : 0);
            if (this.y1 || this.z1) {
                s6 s6Var = this.O1;
                long j11 = this.x1;
                boolean z11 = this.G1;
                a0.h hVar = s6Var.m;
                r9 r9Var = (r9) hVar.f(j11);
                if (r9Var == null) {
                    r9Var = new r9(s6Var.a, j11, s6Var);
                    hVar.k(r9Var, j11);
                }
                r9Var.b(z11);
            }
        }
    }

    public final void U0(int i10, long j10) {
        if (this.x1 != j10) {
            c4 c4Var = this.K1;
            c4Var.b = null;
            c4Var.a = null;
        }
        this.x1 = j10;
        this.v1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.F0.M0;
        boolean z10 = true;
        if (peerStories != null) {
            this.O1.S(peerStories, true);
            return;
        }
        s6 s6Var = this.O1;
        TL_stories.PeerStories y10 = s6Var.y(j10);
        if (y10 == null) {
            y10 = s6Var.z(j10);
        } else {
            z10 = false;
        }
        s6Var.S(y10, z10);
    }

    public final void W0(long j10, boolean z10, boolean z11) {
        if (!z10 && j10 == this.I3 && this.J3 == z11) {
            return;
        }
        this.I3 = j10;
        this.J3 = z11;
        a4 a4Var = this.k1;
        if (j10 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-j10));
            eg.c cVar = a4Var.b;
            eg.c cVar2 = a4Var.b;
            cVar.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                cVar2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            dq dqVar = new dq(mutate, null);
            dqVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            dqVar.h = dp;
            dqVar.n = dp2;
            cVar2.i(dqVar);
            return;
        }
        if (this.y1 && !z11) {
            a4Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            a4Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(j10));
        if (user == null || !user.verified) {
            a4Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            dq dqVar2 = new dq(mutate2, null);
            dqVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            dqVar2.h = dp3;
            dqVar2.n = dp4;
            a4Var.b.i(dqVar2);
        }
        if (user != null) {
            a4Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), a4Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            a4Var.b.l(null, false);
        }
    }

    public final void X0(float f10, float f11, h4 h4Var) {
        this.i1 = f10;
        this.w3 = 1.0f / f11;
        if (this.h1 == h4Var) {
            return;
        }
        this.h1 = h4Var;
        if (h4Var != null) {
            ImageReceiver imageReceiver = h4Var.a;
            if (imageReceiver.getBitmap() != null) {
                this.a1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void Y0(boolean z10) {
        c4 c4Var = this.K1;
        if (c4Var.a != null) {
            i9 i9Var = this.F0;
            if (i9Var.f != null) {
                String e9 = c4Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e9);
                    LaunchActivity.C1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                w2 w2Var = new w2(this, i9Var.f.getContext(), e9, e9, MessagesController.getInstance(this.y2).storiesEnabled() && (!(this.z1 || UserObject.isService(this.x1)) || ChatObject.isPublic(this.z1 ? MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1)) : null)), new m2(2, this.x0));
                this.V2 = w2Var;
                w2Var.e0 = true;
                TL_stories.StoryItem storyItem = c4Var.a;
                storyItem.dialogId = this.x1;
                w2Var.B0 = storyItem;
                w2Var.o0 = new k5.i(this, 21);
                ((z8) this.M1).h(w2Var);
            }
        }
    }

    public final void Z0() {
        j3 j3Var = this.Y0;
        org.telegram.ui.ActionBar.c6 c6Var = this.x0;
        org.telegram.messenger.y1.r(R.string.UnsupportedAttachment, new mc(j3Var, c6Var), c6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.x0);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.P = string;
        ((z8) this.M1).h(b2Var);
    }

    public final void b1(boolean z10) {
        if (this.o3 != z10) {
            c4 c4Var = this.K1;
            if (c4Var.a == null) {
                return;
            }
            this.o3 = z10;
            int i10 = 0;
            if (z10) {
                this.n3.setVisibility(0);
            }
            this.n3.setStoryItem(c4Var.a);
            i9 i9Var = ((z8) this.M1).d;
            i9Var.l1 = z10;
            i9Var.P();
            if (!z10) {
                if (this.n3.getReactionsWindow() != null) {
                    this.n3.getReactionsWindow().e();
                }
                this.n3.animate().alpha(0.0f).setDuration(150L).setListener(new k2(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p3, z10 ? 1.0f : 0.0f);
            this.n3.setTransitionProgress(this.p3);
            ofFloat.addUpdateListener(new w1(this, 1));
            ofFloat.addListener(new j2(this, z10, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(er.g);
            ofFloat.start();
        }
    }

    public final void c1(boolean z10) {
        if (this.C0 == null) {
            lh.w3 w3Var = new lh.w3(getContext(), 1);
            w3Var.m(1.0f, -56.0f);
            this.C0 = w3Var;
            w3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.Y0.addView(this.C0, h7.z5.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.C0.t(LocaleController.getString(z10 ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.C0.v();
    }

    public final boolean d1(boolean z10) {
        if (this.F0.N0) {
            z10 = !z10;
        }
        if (!z10) {
            int i10 = this.F1;
            if (i10 > 0) {
                this.F1 = i10 - 1;
                f1(false);
                return true;
            }
        } else if (this.F1 < getStoriesCount() - 1) {
            this.F1++;
            f1(false);
            return true;
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d1 d1Var;
        int i12 = NotificationCenter.storiesUpdated;
        i9 i9Var = this.F0;
        boolean z10 = false;
        if (i10 == i12 || (i10 == NotificationCenter.storiesListUpdated && i9Var.K0 == objArr[0])) {
            y3 y3Var = this.M1;
            if (y3Var == null || !((z8) y3Var).d.D0) {
                if (this.G1) {
                    j1();
                    if (this.w1 == 0) {
                        if (this.A2) {
                            return;
                        }
                        this.A2 = true;
                        ((z8) this.M1).j();
                        return;
                    }
                    int i13 = this.F1;
                    ArrayList arrayList = this.r1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.s1;
                    if (i13 >= arrayList2.size() + size) {
                        this.F1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    f1(false);
                    if (this.y1 || this.z1) {
                        k1(true);
                    }
                }
                TL_stories.PeerStories peerStories = i9Var.M0;
                if (peerStories != null) {
                    this.O1.S(peerStories, true);
                } else {
                    long j10 = this.x1;
                    if (j10 != 0) {
                        s6 s6Var = this.O1;
                        TL_stories.PeerStories y10 = s6Var.y(j10);
                        if (y10 == null) {
                            y10 = s6Var.z(j10);
                            z10 = true;
                        }
                        s6Var.S(y10, z10);
                    }
                }
                org.telegram.ui.ActionBar.f1 f1Var = this.o1;
                if (f1Var != null) {
                    f1Var.animate().alpha((this.O1.K(this.x1) && this.K1.e && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
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
            this.G0.U.invalidate();
            return;
        }
        if (i10 == NotificationCenter.stealthModeChanged) {
            r0(true);
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            l6 o10 = MessagesController.getInstance(this.y2).getStoriesController().o();
            if (o10 == null || !o10.a(this.y2, 1) || this.M1 == null) {
                return;
            }
            ag.r2 r2Var = new ag.r2(this, 4);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            ((z8) this.M1).h(new ag.i1(o10.b(), this.y2, findActivity, r2Var, null));
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.y2).isUserContactBlocked(this.x1);
            boolean z11 = this.x1 >= 0 && !UserConfig.getInstance(this.y2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            if (this.B1 == z11 && this.D1 == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                return;
            }
            this.B1 = z11;
            this.D1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            f1(false);
            r0(true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.x1 == (-((TLRPC.ChatFull) obj).id)) {
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
        if (i9Var == null || (d1Var = i9Var.w0) == null || d1Var.g() != longValue) {
            return;
        }
        f1(false);
        o2 o2Var = this.X1;
        if (o2Var != null) {
            o2Var.K(true);
            this.X1.O1(true);
            r0(true);
        }
        g2 g2Var = this.H0;
        if (g2Var != null) {
            d1 d1Var2 = g2Var.L;
            if (g2Var.D != (d1Var2 != null ? d1Var2.j() : 0L)) {
                g2Var.e.N(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wd wdVar;
        Canvas canvas2;
        org.telegram.ui.Components.i6 i6Var;
        org.telegram.ui.Components.i6 i6Var2;
        l1();
        if (this.z1 && (i6Var2 = this.M0) != null) {
            i6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.z1 && (i6Var = this.N0) != null) {
            i6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.q3;
        LinearLayout linearLayout = this.K0;
        z2 z2Var = this.z0;
        if (z10) {
            float measuredWidth = (z2Var.getMeasuredWidth() / 2.0f) + z2Var.getX() + linearLayout.getX();
            float measuredHeight = (z2Var.getMeasuredHeight() / 2.0f) + z2Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f10 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.s3, measuredWidth - f10, er.g.getInterpolation(this.r3));
            float lerp2 = AndroidUtilities.lerp(this.t3, measuredHeight - f10, this.r3);
            int lerp3 = AndroidUtilities.lerp(this.u3, dp, this.r3);
            if (this.l3) {
                org.telegram.ui.Components.k5 k5Var = this.k3;
                if (k5Var != null) {
                    float f11 = lerp3;
                    k5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f11), (int) (lerp2 + f11));
                    this.k3.draw(canvas);
                }
            } else {
                float f12 = lerp3;
                ImageReceiver imageReceiver = this.j3;
                imageReceiver.setImageCoords(lerp, lerp2, f12, f12);
                imageReceiver.draw(canvas);
            }
        }
        if (this.m3) {
            float measuredWidth2 = (z2Var.getMeasuredWidth() / 2.0f) + z2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (z2Var.getMeasuredHeight() / 2.0f) + z2Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (this.l3) {
                ig.d dVar = this.i3;
                if (dVar != null) {
                    float f13 = dp2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f13), (int) (measuredHeight2 - f13), (int) (measuredWidth2 + f13), (int) (measuredHeight2 + f13));
                    this.i3.b(canvas);
                    if (this.i3.c()) {
                        this.i3.d(this);
                        this.i3 = null;
                        this.m3 = false;
                    }
                } else {
                    this.m3 = false;
                }
            } else {
                float f14 = dp2;
                float f15 = f14 / 2.0f;
                float f16 = measuredWidth2 - f15;
                float f17 = measuredHeight2 - f15;
                ImageReceiver imageReceiver2 = this.h3;
                imageReceiver2.setImageCoords(f16, f17, f14, f14);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().y()) {
                    this.m3 = false;
                }
            }
        }
        o2 o2Var = this.X1;
        if (o2Var != null) {
            yd ydVar = o2Var.t1;
            wd wdVar2 = o2Var.u1;
            if (o2Var.getAlpha() == 0.0f || (wdVar = o2Var.a1) == null || wdVar.getParent() == null || o2Var.a1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(o2Var.a1.getX() + ydVar.getX() + wdVar2.getX() + o2Var.getX(), o2Var.a1.getY() + ydVar.getY() + wdVar2.getY() + o2Var.getY());
            if (o2Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight(), (int) (o2Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            o2Var.a1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        og.d dVar;
        float dp;
        if (view == this.Z2) {
            canvas.save();
            canvas.clipRect(0.0f, this.Z2.getY(), getMeasuredWidth(), this.Z2.getY() + this.Z2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        o2 o2Var = this.X1;
        Paint paint = this.j2;
        z2 z2Var = this.z0;
        b4 b4Var = this.t1;
        if (view == o2Var) {
            float f10 = this.m2;
            c4 c4Var = this.K1;
            if (f10 > 0.0f && !c4Var.f) {
                b4Var.l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), b4Var.l);
            }
            RectF rectF = b4Var.h;
            RectF rectF2 = b4Var.i;
            RectF rectF3 = b4Var.j;
            rectF.set(this.X1.getX(), this.X1.getY() + this.X1.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.X1.getX() + this.X1.getMeasuredWidth(), this.X1.getY() + this.X1.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (c4Var.f) {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                n1 n1Var = this.W1;
                if (n1Var != null && n1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.O2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.P2 && this.z1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (z2Var != null && z2Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + z2Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.X1.setTranslationX((1.0f - this.m2) * dp);
            this.X1.getEditField().setTranslationY(com.google.android.recaptcha.internal.a.z(1.0f, this.m2, -AndroidUtilities.dp(2.0f), this.X1.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.m2) * (this.X1.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, b4Var.h, this.m2, rectF3);
            lg.d dVar2 = this.h2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.p(dp3);
                dVar2.setAlpha((int) ((1.0f - this.Z3) * (1.0f - this.n2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.m2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (o2Var != null && o2Var.u0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = b4Var.k;
                RectF rectF5 = b4Var.k;
                rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.W3;
                path.rewind();
                path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                lg.d dVar3 = this.i2;
                if (dVar3 != null) {
                    dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    dVar3.q(dp4, dp4, dp4, dp4);
                    dVar3.setAlpha(255);
                    dVar3.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, dp4, dp4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.b2 || this.X1 == null) {
                if (view == this.n3) {
                    view.setTranslationY((this.K0.getY() + (z2Var.getY() + (-(r2.getMeasuredHeight() - this.n3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    j3 j3Var = this.Y0;
                    if (view == j3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.D3) != null && !dVar.n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.b.d(0.2f, -16777216, -1));
                        a2.translate(j3Var.getX(), j3Var.getY());
                        view.draw(a2);
                        dVar.b();
                    }
                }
            } else {
                view.setTranslationY(((this.X1.getY() + this.X1.getAnimatedTop()) + (-r2.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        if (MessagesController.getInstance(this.y2).storiesEnabled()) {
            File h = this.K1.h();
            if (h == null || !h.exists()) {
                a1();
                return;
            }
            w2 w2Var = this.V2;
            if (w2Var != null) {
                w2Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new v1(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0944, code lost:
    
        if (r4.g == (r1 == null && r1.translated && r1.translatedText != null && android.text.TextUtils.equals(r1.translatedLng, org.telegram.ui.Components.b31.C()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x09a4, code lost:
    
        if (r2 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x09c9, code lost:
    
        if (r3 != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0add, code lost:
    
        if (r6 != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0af6, code lost:
    
        if (r6 != false) goto L557;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0bf2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0c1f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0c2c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0d08  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d95  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0dad A[EDGE_INSN: B:312:0x0dad->B:313:0x0dad BREAK  A[LOOP:0: B:301:0x0d8b->B:310:0x0daa], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0dbb  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0e21  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0e5e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0e6d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0e8d  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0f27  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0f58  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0f67  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0f8d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0fae  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0fdd  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0ffa  */
    /* JADX WARN: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0fcd  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0ed7  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e67  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0e31  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0e18  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0925  */
    /* JADX WARN: Type inference failed for: r6v190 */
    /* JADX WARN: Type inference failed for: r6v191, types: [jh.v7, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v192 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z10) {
        r6 r6Var;
        TL_stories.StoryItem storyItem;
        r6 r6Var2;
        sy syVar;
        boolean z11;
        boolean z12;
        boolean z13;
        y2 y2Var;
        int i10;
        TL_stories.StoryItem storyItem2;
        i9 i9Var;
        f9 f9Var;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        boolean z14;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z15;
        TL_stories.StoryItem storyItem4;
        r6 r6Var3;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem5;
        lh.z7 z7Var;
        TL_stories.StoryItem storyItem6;
        r6 r6Var4;
        int i11;
        lh.z7 z7Var2;
        d1 d1Var;
        boolean z16;
        j3 j3Var;
        n3 n3Var;
        a4 a4Var;
        o2 o2Var;
        boolean z17;
        boolean z18;
        r6 r6Var5;
        ec ecVar;
        boolean z19;
        TL_stories.StoryItem storyItem7;
        boolean z20;
        boolean z21;
        r6 r6Var6;
        boolean z22;
        y2 y2Var2;
        j3 j3Var2;
        n3 n3Var2;
        a4 a4Var2;
        boolean z23;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        int i12;
        TLRPC.MessageMedia messageMedia2;
        boolean z24;
        lh.w3 w3Var;
        lh.w3 w3Var2;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem10;
        y3 y3Var;
        boolean z25;
        boolean z26;
        LinearLayout linearLayout;
        boolean z27;
        boolean z28;
        o2 o2Var2;
        o2 o2Var3;
        int i13;
        boolean z29;
        boolean z30;
        boolean z31;
        int i14;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        sg.g gVar;
        a aVar;
        n1 n1Var;
        boolean z36;
        TL_stories.StoryItem storyItem11;
        boolean z37;
        int i15;
        int i16;
        boolean z38;
        boolean z39;
        boolean l10;
        r6 r6Var7;
        r6 r6Var8;
        lh.w3 w3Var3;
        ImageView imageView;
        ImageView imageView2;
        boolean z40;
        int i17;
        boolean z41;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i18;
        int i19;
        int i20;
        boolean z42;
        int i21;
        boolean z43;
        boolean z44;
        TL_stories.StoryItem storyItem13;
        int i22;
        int i23;
        FrameLayout.LayoutParams layoutParams;
        int dp;
        boolean z45;
        boolean z46;
        int i24;
        boolean z47;
        d1 d1Var2;
        int i25;
        boolean z48;
        int i26;
        boolean z49;
        int i27;
        boolean z50;
        boolean z51;
        boolean z52;
        boolean z53;
        d1 d1Var3;
        String str;
        BitmapDrawable bitmapDrawable;
        sy syVar2;
        i9 i9Var2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        j6 j6Var;
        ArrayList arrayList2 = this.r1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.s1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.R2 = true;
        c4 c4Var = this.K1;
        TL_stories.StoryItem storyItem14 = c4Var.a;
        r6 r6Var9 = c4Var.b;
        String s10 = l7.s();
        this.V0 = false;
        this.Y2 = false;
        int i28 = this.F1;
        boolean z54 = this.P1;
        boolean z55 = this.Q1;
        boolean z56 = this.R1;
        i9 i9Var3 = this.F0;
        if (i9Var3 == null || (j6Var = i9Var3.K0) == null || j6Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i28 < 0 || i28 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i28);
            int size = i28 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            r6Var = (size < 0 || size >= arrayList3.size()) ? null : (r6) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            r6Var = (i28 < 0 || i28 >= arrayList3.size()) ? null : (r6) arrayList3.get(i28);
            int size2 = i28 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        c4Var.c = null;
        f3 f3Var = this.f1;
        sy syVar3 = this.g1;
        y2 y2Var3 = this.a1;
        if (r6Var != null) {
            lh.z7 z7Var3 = r6Var.c;
            this.Q1 = false;
            boolean z57 = r6Var.E;
            this.R1 = z57;
            this.P1 = !z57;
            y2Var3.setCrossfadeWithOldImage(false);
            y2Var3.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = z7Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (r6Var.s || r6Var.D) {
                BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                y2Var = y2Var3;
                r6Var2 = r6Var9;
                syVar2 = syVar3;
                z11 = z54;
                z12 = z55;
                z13 = z56;
                i9Var2 = i9Var3;
                i10 = i28;
                r62 = 0;
                y2Var.setImage(null, null, ImageLocation.getForPath(r6Var.f), s10, null, null, bitmapDrawable2, 0L, null, null, 0);
            } else {
                BitmapDrawable bitmapDrawable3 = bitmapDrawable;
                y2Var = y2Var3;
                r6Var2 = r6Var9;
                r62 = 0;
                syVar2 = syVar3;
                z11 = z54;
                z13 = z56;
                z12 = z55;
                i9Var2 = i9Var3;
                i10 = i28;
                y2Var.setImage(null, null, ImageLocation.getForPath(r6Var.e), s10, null, null, bitmapDrawable3, 0L, null, null, 0);
            }
            c4Var.b = r6Var;
            c4Var.j = r62;
            c4Var.i = r62;
            c4Var.a = r62;
            c4Var.d = false;
            c4Var.e = c4Var.m();
            TL_stories.StoryItem storyItem17 = c4Var.a;
            c4Var.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            syVar = syVar2;
            f3Var.c(r62, m8.a(z7Var3), syVar);
            this.Q2 = false;
            this.P2 = false;
            this.O2 = false;
            i9 i9Var4 = i9Var2;
            storyItem2 = storyItem14;
            i9Var = i9Var4;
        } else {
            r6Var2 = r6Var9;
            syVar = syVar3;
            z11 = z54;
            z12 = z55;
            z13 = z56;
            y2Var = y2Var3;
            i10 = i28;
            this.P1 = false;
            this.Q1 = false;
            this.R1 = false;
            if (storyItem == null) {
                if (i9Var3 != null) {
                    i9Var3.q(true);
                    return;
                }
                return;
            }
            r6 t10 = this.O1.t(this.x1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.Q1 = true;
                y2Var.setCrossfadeWithOldImage(false);
                y2Var.setCrossfadeDuration(this.e1 == null ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : 0);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    i9Var = i9Var3;
                    r6Var3 = t10;
                    y2Var.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    i9Var = i9Var3;
                    r6Var3 = t10;
                    y2Var.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                }
                c4Var.b = r6Var3;
                c4Var.j = null;
                c4Var.i = null;
                c4Var.a = null;
                c4Var.d = false;
                c4Var.e = c4Var.m();
                TL_stories.StoryItem storyItem18 = c4Var.a;
                c4Var.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                f3Var.c(null, m8.a(r6Var3.c), syVar);
                c4Var.c = storyItem;
                this.Q2 = false;
                this.P2 = false;
                this.O2 = false;
            } else {
                storyItem2 = storyItem14;
                i9Var = i9Var3;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.x1;
                y2Var.setCrossfadeWithOldImage(z12);
                y2Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.Y2 = true;
                    MessagesController.getInstance(this.y2).getStoriesController().p(storyItem.id, this.x1);
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
                                    y2Var.setImage(null, null, ImageLocation.getForPath(storyItem.firstFramePath), s10, null, null, createStripedBitmap, 0L, null, null, 0);
                                }
                            }
                            z15 = z12;
                            y2Var.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), s3.c.l(s10, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
                        } else {
                            z15 = z12;
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            Drawable createStripedBitmap2 = photo != null ? ImageLoader.createStripedBitmap(photo.sizes) : null;
                            if (z15) {
                                y2Var.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, ImageLocation.getForPath(storyItem.firstFramePath), s10, createStripedBitmap2, 0L, null, null, 0);
                            } else {
                                y2Var.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, null, null, createStripedBitmap2, 0L, null, null, 0);
                            }
                        }
                        storyItem3 = storyItem;
                        z14 = z15;
                    } else {
                        Drawable drawable = ((i9Var.K0 != null || i9Var.J0) && (f9Var = i9Var.o0) != null && (imageReceiver = f9Var.c) != null && f9Var.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.x1;
                        if (z58) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String l11 = s3.c.l(s10, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            TL_stories.StoryItem storyItem19 = storyItem;
                            z14 = z12;
                            y2Var.setImage(null, null, forDocument, l11, forDocument2, s10, drawable, 0L, null, storyItem19, 0);
                            storyItem3 = storyItem19;
                        } else {
                            storyItem3 = storyItem;
                            z14 = z12;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                y2Var.clearImage();
                            } else {
                                if (drawable == null) {
                                    drawable = ImageLoader.createStripedBitmap(arrayList);
                                }
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 800);
                                y2Var.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2), s10, null, null, drawable, 0L, null, storyItem3, 0);
                            }
                        }
                    }
                }
                storyItem3.dialogId = this.x1;
                f3Var.d(z10 ? null : storyItem3, syVar);
                c4Var.n(storyItem3);
                boolean z59 = (this.Y2 || (storyItem4 = c4Var.a) == null || (storyItem4 instanceof TL_stories.TL_storyItemDeleted) || (storyItem4 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.Q2 = z59;
                this.O2 = z59;
                if (z59) {
                    this.O2 = c4Var.d() && c4Var.a.isPublic;
                }
                if (this.O2) {
                    TL_stories.StoryItem storyItem20 = c4Var.a;
                    this.O2 = storyItem20.pinned || !l7.w(this.y2, storyItem20);
                }
                boolean z60 = this.O2;
                this.P2 = z60;
                if (z60 && this.z1) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
                    this.P2 = chat != null && ChatObject.isPublic(chat);
                }
                if (this.Q2) {
                    if (this.z1) {
                        TLRPC.Chat chat2 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
                        this.Q2 = (chat2 == null || ChatObject.getPublicUsername(chat2) == null) ? false : true;
                    } else {
                        TLRPC.User user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.x1));
                        this.Q2 = (user == null || UserObject.getPublicUsername(user) == null || !c4Var.a.isPublic) ? false : true;
                    }
                }
                NotificationsController.getInstance(this.y2).processReadStories(this.x1, storyItem3.id);
                storyItem5 = c4Var.a;
                if (storyItem5 != null && !z10) {
                    i9Var.L0 = storyItem5.id;
                }
                i9Var.j0.A();
                this.U2 = true;
                if (!this.y1 || this.z1) {
                    k1(false);
                }
                TL_stories.StoryItem storyItem21 = c4Var.a;
                r6 r6Var10 = c4Var.b;
                int i29 = storyItem21 == null ? storyItem21.id : (r6Var10 == null || (z7Var = r6Var10.c) == null) ? 0 : z7Var.f;
                if (storyItem2 == null) {
                    storyItem6 = storyItem2;
                    i11 = storyItem6.id;
                    r6Var4 = r6Var2;
                } else {
                    storyItem6 = storyItem2;
                    r6Var4 = r6Var2;
                    i11 = (r6Var2 == null || (z7Var2 = r6Var4.c) == null) ? 0 : z7Var2.f;
                }
                boolean z61 = (i29 == i11 && (r6Var4 == null || storyItem21 == null || !TextUtils.equals(r6Var4.e, storyItem21.attachPath))) ? false : true;
                boolean z62 = (z61 || (this.Q1 == z14 && this.P1 == z11 && this.R1 == z13)) ? false : true;
                d1Var = i9Var.w0;
                if (d1Var != null) {
                    int i30 = this.M3;
                    TLRPC.GroupCall groupCall = d1Var.v;
                    if (i30 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                        z16 = true;
                        j3Var = this.Y0;
                        n3Var = this.G0;
                        a4Var = this.k1;
                        if ((r6Var4 != null || (str = r6Var4.e) == null || !str.equals(c4Var.f())) && (storyItem6 == null || (storyItem7 = c4Var.a) == null || storyItem6.id != storyItem7.id)) {
                            o2Var = this.X1;
                            if (o2Var != null) {
                                if (storyItem6 != null && !TextUtils.isEmpty(o2Var.getEditField().getText())) {
                                    i9.J(storyItem6.dialogId, storyItem6, this.X1.getEditField().getText());
                                }
                                this.X1.getEditField().setText(i9.u(this.x1, c4Var.a));
                                z19 = c4Var.f;
                                if (z19) {
                                    z17 = false;
                                    this.X1.U0(false, false, false);
                                } else {
                                    z17 = false;
                                    this.X1.U0(true, true, false);
                                }
                            } else {
                                z17 = false;
                            }
                            z18 = c4Var.f;
                            if (z18) {
                                M0();
                            }
                            syVar.c();
                            this.S0 = 0L;
                            this.U0 = z17;
                            r6Var5 = c4Var.b;
                            if (r6Var5 != null) {
                                si0 si0Var = a4Var.d;
                                if (si0Var != null) {
                                    si0Var.e(r6Var5.h, z17);
                                }
                                a4Var.a.invalidate();
                            } else if (!z62) {
                                a4Var.h = 0.0f;
                            }
                            ecVar = ec.w;
                            if (ecVar != null && ecVar.h == j3Var) {
                                ecVar.b();
                            }
                            n3Var.J();
                            q0();
                            z16 = true;
                        }
                        if (!z16 || (r6Var4 != null && c4Var.b == null)) {
                            a4Var.setOnSubtitleClick(null);
                            TextView[] textViewArr = a4Var.c;
                            this.M3 = 0;
                            z20 = z61;
                            long j10 = this.x1;
                            boolean z63 = z62;
                            z21 = c4Var.f;
                            W0(j10, false, z21);
                            r6Var6 = c4Var.b;
                            if (r6Var6 != null) {
                                charSequence3 = r6Var6.E ? LocaleController.getString(R.string.FailedToUploadStory) : l7.u(textViewArr[0], this.Q1);
                            } else {
                                if (I0()) {
                                    TL_stories.StoryItem storyItem22 = c4Var.a;
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
                                    y2Var2 = y2Var;
                                    j3Var2 = j3Var;
                                    n3Var2 = n3Var;
                                    a4Var2 = a4Var;
                                    z23 = z63;
                                    charSequence = "";
                                } else {
                                    TL_stories.StoryItem storyItem23 = c4Var.a;
                                    if (storyItem23 == null) {
                                        z22 = z16;
                                        y2Var2 = y2Var;
                                        j3Var2 = j3Var;
                                        n3Var2 = n3Var;
                                        a4Var2 = a4Var;
                                        z23 = z63;
                                        charSequence = null;
                                    } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                                        spannableStringBuilder.setSpan(new b3(), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        d1 d1Var4 = i9Var.w0;
                                        if (d1Var4 != null) {
                                            TLRPC.GroupCall groupCall2 = d1Var4.v;
                                            i12 = 1;
                                            this.M3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                                        } else {
                                            i12 = 1;
                                        }
                                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i12, this.M3)));
                                        charSequence3 = spannableStringBuilder;
                                    } else if (storyItem23.date == -1) {
                                        charSequence3 = LocaleController.getString(R.string.CachedStory);
                                    } else {
                                        if (c4Var.i() != null) {
                                            v7 i31 = c4Var.i();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            z22 = z16;
                                            y2Var2 = y2Var;
                                            SpannableString spannableString = new SpannableString("r");
                                            j3Var2 = j3Var;
                                            n3Var2 = n3Var;
                                            spannableString.setSpan(new cq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) spannableString).append((CharSequence) " ");
                                            if (i31.b != null) {
                                                org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.y2);
                                                SpannableString spannableString2 = new SpannableString("a");
                                                spannableString2.setSpan(g5Var, 0, 1, 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                                if (i31.b.longValue() > 0) {
                                                    TLRPC.User user2 = MessagesController.getInstance(this.y2).getUser(i31.b);
                                                    g5Var.e(user2);
                                                    spannableStringBuilder2.append((CharSequence) UserObject.getUserName(user2));
                                                } else {
                                                    TLRPC.Chat chat3 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-i31.b.longValue()));
                                                    g5Var.b(chat3);
                                                    if (chat3 != null) {
                                                        spannableStringBuilder2.append((CharSequence) chat3.title);
                                                    }
                                                }
                                            } else {
                                                String str4 = c4Var.a.fwd_from.from_name;
                                                if (str4 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str4);
                                                }
                                            }
                                            a4Var.setOnSubtitleClick(new ag.q0(23, this, i31));
                                            SpannableString spannableString3 = new SpannableString(".");
                                            ps psVar = new ps();
                                            psVar.b = AndroidUtilities.dp(1.5f);
                                            psVar.c = 5.0f;
                                            spannableString3.setSpan(psVar, 0, spannableString3.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(c4Var.a.date));
                                            a4Var2 = a4Var;
                                            charSequence = spannableStringBuilder2;
                                        } else {
                                            z22 = z16;
                                            y2Var2 = y2Var;
                                            j3Var2 = j3Var;
                                            n3Var2 = n3Var;
                                            if (!this.A1 || (storyItem8 = c4Var.a) == null || storyItem8.from_id == null) {
                                                a4Var2 = a4Var;
                                                String formatStoryDate = LocaleController.formatStoryDate(c4Var.a.date);
                                                charSequence2 = formatStoryDate;
                                                if (c4Var.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                                    ps psVar2 = new ps();
                                                    psVar2.b = AndroidUtilities.dp(1.5f);
                                                    psVar2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(psVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                                    valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                                    charSequence2 = valueOf;
                                                }
                                                charSequence = charSequence2;
                                                z23 = z63;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.y2);
                                                SpannableString spannableString4 = new SpannableString("a");
                                                spannableString4.setSpan(g5Var2, 0, 1, 33);
                                                spannableStringBuilder3.append((CharSequence) spannableString4).append((CharSequence) " ");
                                                long peerDialogId = DialogObject.getPeerDialogId(c4Var.a.from_id);
                                                if (peerDialogId > 0) {
                                                    TLRPC.User user3 = MessagesController.getInstance(this.y2).getUser(Long.valueOf(peerDialogId));
                                                    g5Var2.e(user3);
                                                    spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user3));
                                                    a4Var2 = a4Var;
                                                } else {
                                                    a4Var2 = a4Var;
                                                    TLRPC.Chat chat4 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-peerDialogId));
                                                    g5Var2.b(chat4);
                                                    if (chat4 != null) {
                                                        spannableStringBuilder3.append((CharSequence) chat4.title);
                                                    }
                                                }
                                                a4Var2.setOnSubtitleClick(new gh.o(this, peerDialogId, 2));
                                                SpannableString spannableString5 = new SpannableString(".");
                                                ps psVar3 = new ps();
                                                psVar3.b = AndroidUtilities.dp(1.5f);
                                                psVar3.c = 5.0f;
                                                spannableString5.setSpan(psVar3, 0, spannableString5.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(c4Var.a.date));
                                                charSequence = spannableStringBuilder3;
                                            }
                                        }
                                        z23 = false;
                                    }
                                }
                                if (charSequence == null) {
                                    j6 j6Var2 = i9Var.K0;
                                    if (j6Var2 == null || (storyItem9 = c4Var.a) == null || !j6Var2.m(storyItem9.id)) {
                                        z24 = false;
                                    } else {
                                        if (!(charSequence instanceof SpannableStringBuilder)) {
                                            charSequence = new SpannableStringBuilder(charSequence);
                                        }
                                        SpannableString spannableString6 = new SpannableString("p ");
                                        z24 = false;
                                        spannableString6.setSpan(new cq(R.drawable.msg_pin_mini), 0, 1, 33);
                                        ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString6);
                                    }
                                    a4Var2.c(charSequence, z23);
                                } else {
                                    z24 = false;
                                }
                                w3Var = this.B0;
                                if (w3Var != null) {
                                    w3Var.e(z24);
                                }
                                w3Var2 = this.C0;
                                if (w3Var2 != null) {
                                    w3Var2.e(z24);
                                }
                            }
                            z22 = z16;
                            y2Var2 = y2Var;
                            j3Var2 = j3Var;
                            n3Var2 = n3Var;
                            a4Var2 = a4Var;
                            charSequence2 = charSequence3;
                            charSequence = charSequence2;
                            z23 = z63;
                            if (charSequence == null) {
                            }
                            w3Var = this.B0;
                            if (w3Var != null) {
                            }
                            w3Var2 = this.C0;
                            if (w3Var2 != null) {
                            }
                        } else {
                            z20 = z61;
                            z22 = z16;
                            y2Var2 = y2Var;
                            j3Var2 = j3Var;
                            n3Var2 = n3Var;
                            a4Var2 = a4Var;
                        }
                        storyItem10 = c4Var.a;
                        if (storyItem6 == storyItem10 && r6Var4 == c4Var.b) {
                        }
                        c4Var.o();
                        if ((!c4Var.g || storyItem6 != c4Var.a) && (y3Var = this.M1) != null) {
                            i9 i9Var5 = ((z8) y3Var).d;
                            i9Var5.V0 = false;
                            i9Var5.P();
                        }
                        z25 = c4Var.f;
                        z26 = !z25 && (d1Var3 = i9Var.w0) != null && c4Var.k(d1Var3.g()) && i9Var.w0.b();
                        if (z26 != this.C1) {
                            this.C1 = z26;
                            if (z26) {
                                z0();
                            }
                            if (this.c2 != null && (this.B1 || this.C1)) {
                                h1();
                            }
                            o2 o2Var4 = this.X1;
                            if (o2Var4 != null) {
                                if (this.B1) {
                                    z53 = c4Var.f;
                                }
                                if (!this.C1) {
                                    z52 = true;
                                    o2Var4.setEnabled(z52);
                                    z51 = true;
                                    this.X1.O1(true);
                                }
                                z52 = false;
                                o2Var4.setEnabled(z52);
                                z51 = true;
                                this.X1.O1(true);
                            } else {
                                z51 = true;
                            }
                            r0(z51);
                        }
                        linearLayout = this.c2;
                        if (linearLayout != null) {
                            if (this.B1) {
                                z50 = c4Var.f;
                            }
                            if (!this.C1) {
                                i27 = 8;
                                linearLayout.setVisibility(i27);
                            }
                            i27 = 0;
                            linearLayout.setVisibility(i27);
                        }
                        z27 = this.Y2;
                        LinearLayout linearLayout2 = this.K0;
                        if (z27) {
                            C0();
                            A0();
                            this.W2.setVisibility(0);
                            this.X2.setVisibility(0);
                            this.Q2 = false;
                            this.P2 = false;
                            this.O2 = false;
                            o2 o2Var5 = this.X1;
                            if (o2Var5 != null) {
                                o2Var5.setVisibility(8);
                            }
                            z2 z2Var = this.S1;
                            if (z2Var != null) {
                                z2Var.setVisibility(8);
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat chat5 = this.x1 < 0 ? MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1)) : null;
                            z28 = c4Var.f;
                            if (z28) {
                                if (this.X1 == null) {
                                    v0();
                                }
                                u0();
                                y0();
                                x0();
                                this.X1.setVisibility(0);
                            } else if ((UserObject.isService(this.x1) || I0()) && (o2Var2 = this.X1) != null) {
                                o2Var2.setVisibility(8);
                            } else if (!this.y1 && ((!this.z1 || (this.A1 && (ChatObject.canSendPlain(chat5) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat5)))) && (o2Var3 = this.X1) != null)) {
                                o2Var3.setVisibility(0);
                            }
                            o2 o2Var6 = this.X1;
                            if (o2Var6 != null) {
                                z33 = c4Var.f;
                                o2Var6.setOnSendButtonLongClick(z33 ? new u1(this, 0) : null);
                                o2 o2Var7 = this.X1;
                                z34 = c4Var.f;
                                D0(true);
                                o2Var7.h1(z34);
                                o2 o2Var8 = this.X1;
                                z35 = c4Var.f;
                                o2Var8.n1(z35 && !D0(true) && (this.r2 || this.X1.S0), true);
                            }
                            if (this.B1 && this.c2 == null) {
                                z0();
                            }
                            if (this.c2 != null) {
                                if (this.B1 || this.C1) {
                                    h1();
                                }
                                LinearLayout linearLayout3 = this.c2;
                                if (this.B1) {
                                    z32 = c4Var.f;
                                }
                                if (!this.C1) {
                                    i14 = 8;
                                    linearLayout3.setVisibility(i14);
                                }
                                i14 = 0;
                                linearLayout3.setVisibility(i14);
                            }
                            o2 o2Var9 = this.X1;
                            if (o2Var9 != null) {
                                if (this.B1) {
                                    z31 = c4Var.f;
                                }
                                if (!this.C1) {
                                    z30 = true;
                                    o2Var9.setEnabled(z30);
                                }
                                z30 = false;
                                o2Var9.setEnabled(z30);
                            }
                            z2 z2Var2 = this.S1;
                            if (z2Var2 != null) {
                                if (this.y1) {
                                    z29 = c4Var.f;
                                    if (!z29) {
                                        i13 = 0;
                                        z2Var2.setVisibility(i13);
                                    }
                                }
                                i13 = 8;
                                z2Var2.setVisibility(i13);
                            }
                            FrameLayout frameLayout = this.W2;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (UserObject.isService(this.x1)) {
                                A0();
                                this.X2.setVisibility(0);
                            } else {
                                cg.q qVar = this.X2;
                                if (qVar != null) {
                                    qVar.setVisibility(8);
                                }
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(I0() ? 8 : 0);
                            }
                        }
                        gVar = this.Y1;
                        if (gVar != null) {
                            o2 o2Var10 = this.X1;
                            if (o2Var10 != null && o2Var10.getVisibility() == 0) {
                                z49 = c4Var.f;
                                if (!z49) {
                                    i26 = 0;
                                    gVar.setVisibility(i26);
                                }
                            }
                            i26 = 8;
                            gVar.setVisibility(i26);
                        }
                        aVar = this.T1;
                        g2 g2Var = this.H0;
                        if (aVar != null) {
                            if (!this.Y2) {
                                z48 = c4Var.f;
                                if (z48) {
                                    i25 = 0;
                                    aVar.setVisibility(i25);
                                    this.T1.a(g2Var.g(), false);
                                    this.T1.setCount(g2Var.getUnreadMessagesCount());
                                }
                            }
                            i25 = 8;
                            aVar.setVisibility(i25);
                            this.T1.a(g2Var.g(), false);
                            this.T1.setCount(g2Var.getUnreadMessagesCount());
                        }
                        n1Var = this.W1;
                        if (n1Var != null) {
                            if (!this.Y2) {
                                z47 = c4Var.f;
                                if (z47 && (d1Var2 = d1.S) != null && c4Var.k(d1Var2.g())) {
                                    i24 = 0;
                                    n1Var.setVisibility(i24);
                                    n1 n1Var2 = this.W1;
                                    d1 d1Var5 = d1.S;
                                    n1Var2.b(d1Var5 == null && d1Var5.o(), true);
                                    n1 n1Var3 = this.W1;
                                    d1 d1Var6 = d1.S;
                                    n1Var3.a(d1Var6 != null || d1Var6.m(), true);
                                }
                            }
                            i24 = 8;
                            n1Var.setVisibility(i24);
                            n1 n1Var22 = this.W1;
                            d1 d1Var52 = d1.S;
                            n1Var22.b(d1Var52 == null && d1Var52.o(), true);
                            n1 n1Var32 = this.W1;
                            d1 d1Var62 = d1.S;
                            n1Var32.a(d1Var62 != null || d1Var62.m(), true);
                        }
                        if (this.V1 != null) {
                            q1 q1Var = this.U1;
                            if (!this.Y2) {
                                z46 = c4Var.f;
                                if (z46) {
                                    i22 = 0;
                                    q1Var.setVisibility(i22);
                                    r1 r1Var = this.V1;
                                    if (!this.Y2) {
                                        z45 = c4Var.f;
                                        if (z45) {
                                            i23 = 0;
                                            r1Var.setVisibility(i23);
                                            layoutParams = (FrameLayout.LayoutParams) this.V1.getLayoutParams();
                                            n1 n1Var4 = this.W1;
                                            dp = AndroidUtilities.dp((n1Var4 == null && n1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                            if (layoutParams.rightMargin != dp) {
                                                layoutParams.rightMargin = dp;
                                                this.V1.setLayoutParams(layoutParams);
                                            }
                                        }
                                    }
                                    i23 = 8;
                                    r1Var.setVisibility(i23);
                                    layoutParams = (FrameLayout.LayoutParams) this.V1.getLayoutParams();
                                    n1 n1Var42 = this.W1;
                                    dp = AndroidUtilities.dp((n1Var42 == null && n1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != dp) {
                                    }
                                }
                            }
                            i22 = 8;
                            q1Var.setVisibility(i22);
                            r1 r1Var2 = this.V1;
                            if (!this.Y2) {
                            }
                            i23 = 8;
                            r1Var2.setVisibility(i23);
                            layoutParams = (FrameLayout.LayoutParams) this.V1.getLayoutParams();
                            n1 n1Var422 = this.W1;
                            dp = AndroidUtilities.dp((n1Var422 == null && n1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != dp) {
                            }
                        }
                        z36 = c4Var.f;
                        if (!z36 || ((c4Var.h == null && c4Var.i() == null && c4Var.g() == null) || this.Y2)) {
                            n3 n3Var3 = n3Var2;
                            if (this.G1) {
                                i9 i9Var6 = ((z8) this.M1).d;
                                i9Var6.H0 = false;
                                i9Var6.P();
                                y3 y3Var2 = this.M1;
                                this.f3 = false;
                                ((z8) y3Var2).e();
                            }
                            n3Var3.setVisibility(8);
                        } else {
                            n3 n3Var4 = n3Var2;
                            n3Var4.U.b(c4Var.h, c4Var.i(), c4Var.g(), i9Var.V0 && !c4Var.g && (storyItem13 = c4Var.a) != null && storyItem13.translated, storyItem6 == c4Var.a);
                            n3Var4.setVisibility(0);
                        }
                        storyItem11 = c4Var.a;
                        if (storyItem11 != null) {
                            TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                            if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (g2Var.r(this.x1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                                    g2Var.q(false, false);
                                    this.H3 = 0L;
                                    o2 o2Var11 = this.X1;
                                    if (o2Var11 != null) {
                                        o2Var11.K(true);
                                        this.X1.Q1();
                                        r0(true);
                                    }
                                }
                                g2Var.setVisibility(0);
                                j3Var2.invalidate();
                                if (this.M1 != null && K0()) {
                                    ((z8) this.M1).a(this.F1, this.x1);
                                }
                                z37 = this.z1;
                                z2 z2Var3 = this.L0;
                                ImageView imageView3 = this.J0;
                                z2 z2Var4 = this.z0;
                                if (z37) {
                                    if (this.O2) {
                                        z39 = c4Var.f;
                                        if (!z39) {
                                            i15 = 0;
                                            imageView3.setVisibility(i15);
                                            if (z2Var3 != null) {
                                                z2Var3.setVisibility(8);
                                            }
                                            if (!this.y1) {
                                                z38 = c4Var.f;
                                                if (!z38) {
                                                    i16 = 0;
                                                    z2Var4.setVisibility(i16);
                                                    z2Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                                }
                                            }
                                            i16 = 8;
                                            z2Var4.setVisibility(i16);
                                            z2Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                        }
                                    }
                                    i15 = 4;
                                    imageView3.setVisibility(i15);
                                    if (z2Var3 != null) {
                                    }
                                    if (!this.y1) {
                                    }
                                    i16 = 8;
                                    z2Var4.setVisibility(i16);
                                    z2Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                } else {
                                    if (this.O2) {
                                        z44 = c4Var.f;
                                        if (!z44) {
                                            i19 = 0;
                                            imageView3.setVisibility(i19);
                                            if (z2Var3 != null) {
                                                if (this.P2) {
                                                    z43 = c4Var.f;
                                                    if (!z43) {
                                                        i21 = 0;
                                                        z2Var3.setVisibility(i21);
                                                    }
                                                }
                                                i21 = 8;
                                                z2Var3.setVisibility(i21);
                                            }
                                            if (!this.R1) {
                                                z42 = c4Var.f;
                                                if (!z42) {
                                                    i20 = 0;
                                                    z2Var4.setVisibility(i20);
                                                }
                                            }
                                            i20 = 8;
                                            z2Var4.setVisibility(i20);
                                        }
                                    }
                                    i19 = 4;
                                    imageView3.setVisibility(i19);
                                    if (z2Var3 != null) {
                                    }
                                    if (!this.R1) {
                                    }
                                    i20 = 8;
                                    z2Var4.setVisibility(i20);
                                }
                                z2Var4.requestLayout();
                                i9Var.a1.append(this.x1, i10);
                                if (this.G1) {
                                    R0(0L);
                                    g1();
                                    y2Var2.bumpPriority();
                                }
                                g2Var.setLivePlayer(i9Var.w0);
                                this.H1 = 0;
                                if (i9Var.K0 != null && (storyItem12 = c4Var.a) != null) {
                                    int i32 = storyItem12.id;
                                    i18 = 0;
                                    while (true) {
                                        if (i18 < i9Var.K0.i.size()) {
                                            MessageObject messageObject = (MessageObject) i9Var.K0.i.get(i18);
                                            if (messageObject != null && messageObject.getId() == i32) {
                                                this.H1 = i18;
                                                break;
                                            }
                                            i18++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                int i33 = this.F1;
                                this.I1 = i33;
                                int i34 = this.w1;
                                this.J1 = i34;
                                if (i9Var.N0) {
                                    this.I1 = (i34 - 1) - i33;
                                }
                                l10 = c4Var.l();
                                ag.d dVar = this.u0;
                                if (l10) {
                                    dVar.setVisibility(8);
                                } else {
                                    dVar.setVisibility(0);
                                    this.a3 = c4Var.j() ? 1.0f : 0.5f;
                                    boolean j11 = c4Var.j();
                                    ImageView imageView4 = this.w0;
                                    ri0 ri0Var = this.v0;
                                    if (j11) {
                                        ri0Var.setVisibility(0);
                                        imageView4.setVisibility(8);
                                        dVar.setContentDescription(LocaleController.getString(!i9.z1 ? R.string.Mute : R.string.Unmute));
                                    } else {
                                        ri0Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        dVar.setContentDescription(LocaleController.getString(R.string.NoSound));
                                    }
                                    dVar.setAlpha((1.0f - this.Z3) * this.a3);
                                }
                                r6Var7 = c4Var.b;
                                n8 n8Var = this.y0;
                                if (r6Var7 == null) {
                                    n8Var.a(this.y1, r6Var7, z20 && this.X3);
                                } else {
                                    TL_stories.StoryItem storyItem24 = c4Var.a;
                                    if (storyItem24 != null) {
                                        n8Var.b(this.y1, storyItem24, z20 && this.X3);
                                    } else {
                                        n8Var.b(this.y1, null, z20 && this.X3);
                                    }
                                }
                                this.X3 = false;
                                n8Var.setTranslationX(dVar.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                                if (z22) {
                                    this.m3 = false;
                                    TL_stories.StoryItem storyItem25 = c4Var.a;
                                    if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                        this.A0.setReaction(null);
                                    } else {
                                        this.A0.setReaction(ig.q0.d(reaction));
                                    }
                                }
                                r6Var8 = c4Var.b;
                                if (r6Var8 == null && r6Var8.E) {
                                    w0();
                                    this.f2.set(c4Var.b.c.x);
                                    this.f2.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.g2;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.g2 = null;
                                    }
                                    if (z20) {
                                        ViewPropertyAnimator interpolator = this.f2.animate().alpha(1.0f).setDuration(180L).setInterpolator(er.h);
                                        this.g2 = interpolator;
                                        interpolator.start();
                                    } else {
                                        this.f2.setAlpha(1.0f);
                                    }
                                } else if (this.f2 != null) {
                                    ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                                    if (viewPropertyAnimator2 != null) {
                                        viewPropertyAnimator2.cancel();
                                        this.g2 = null;
                                    }
                                    if (z20 && this.f2.getVisibility() == 0) {
                                        ViewPropertyAnimator withEndAction = this.f2.animate().alpha(0.0f).setDuration(180L).setInterpolator(er.h).withEndAction(new v1(this, 0));
                                        this.g2 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.f2.setAlpha(0.0f);
                                        this.f2.setVisibility(8);
                                    }
                                }
                                this.t1.a(i9.z1, false);
                                if (this.G1 && c4Var.a != null) {
                                    FileLog.d("StoryViewer displayed story dialogId=" + this.x1 + " storyId=" + c4Var.a.id + " " + c4.c(c4Var));
                                }
                                if (this.y1) {
                                    c5.f(this.y2, this.x1, c4Var.a);
                                }
                                eg.c cVar = a4Var2.b;
                                j6 j6Var3 = i9Var.K0;
                                cVar.setPadding(0, 0, (j6Var3 != null || j6Var3.g() == this.J1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                                MessagesController.getInstance(this.y2).getTranslateController().detectStoryLanguage(c4Var.a);
                                if (!z10 && !this.y1 && this.v3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                                    v1 v1Var = new v1(this, 1);
                                    this.v3 = v1Var;
                                    AndroidUtilities.runOnUIThread(v1Var, 500L);
                                }
                                w3Var3 = this.C0;
                                if ((w3Var3 != null || !w3Var3.R) && c4Var.j() && i9.z1) {
                                    if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                                        AndroidUtilities.cancelRunOnUIThread(this.N3);
                                        AndroidUtilities.runOnUIThread(this.N3, 250L);
                                    }
                                }
                                imageView = this.s0;
                                if (imageView != null) {
                                    if (I0() && !J0()) {
                                        z41 = c4Var.e;
                                        if (!z41) {
                                            i17 = 8;
                                            imageView.setVisibility(i17);
                                        }
                                    }
                                    i17 = 0;
                                    imageView.setVisibility(i17);
                                }
                                imageView2 = this.t0;
                                if (imageView2 == null) {
                                    z40 = c4Var.f;
                                    imageView2.setVisibility((!z40 || n8Var.f) ? 8 : 0);
                                    return;
                                }
                                return;
                            }
                        }
                        g2Var.r(this.x1, null);
                        g2Var.setVisibility(8);
                        j3Var2.invalidate();
                        if (this.M1 != null) {
                            ((z8) this.M1).a(this.F1, this.x1);
                        }
                        z37 = this.z1;
                        z2 z2Var32 = this.L0;
                        ImageView imageView32 = this.J0;
                        z2 z2Var42 = this.z0;
                        if (z37) {
                        }
                        z2Var42.requestLayout();
                        i9Var.a1.append(this.x1, i10);
                        if (this.G1) {
                        }
                        g2Var.setLivePlayer(i9Var.w0);
                        this.H1 = 0;
                        if (i9Var.K0 != null) {
                            int i322 = storyItem12.id;
                            i18 = 0;
                            while (true) {
                                if (i18 < i9Var.K0.i.size()) {
                                }
                                i18++;
                            }
                        }
                        int i332 = this.F1;
                        this.I1 = i332;
                        int i342 = this.w1;
                        this.J1 = i342;
                        if (i9Var.N0) {
                        }
                        l10 = c4Var.l();
                        ag.d dVar2 = this.u0;
                        if (l10) {
                        }
                        r6Var7 = c4Var.b;
                        n8 n8Var2 = this.y0;
                        if (r6Var7 == null) {
                        }
                        this.X3 = false;
                        n8Var2.setTranslationX(dVar2.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z22) {
                        }
                        r6Var8 = c4Var.b;
                        if (r6Var8 == null) {
                        }
                        if (this.f2 != null) {
                        }
                        this.t1.a(i9.z1, false);
                        if (this.G1) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.x1 + " storyId=" + c4Var.a.id + " " + c4.c(c4Var));
                        }
                        if (this.y1) {
                        }
                        eg.c cVar2 = a4Var2.b;
                        j6 j6Var32 = i9Var.K0;
                        cVar2.setPadding(0, 0, (j6Var32 != null || j6Var32.g() == this.J1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.y2).getTranslateController().detectStoryLanguage(c4Var.a);
                        if (!z10) {
                            v1 v1Var2 = new v1(this, 1);
                            this.v3 = v1Var2;
                            AndroidUtilities.runOnUIThread(v1Var2, 500L);
                        }
                        w3Var3 = this.C0;
                        if (w3Var3 != null) {
                        }
                        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                        }
                        imageView = this.s0;
                        if (imageView != null) {
                        }
                        imageView2 = this.t0;
                        if (imageView2 == null) {
                        }
                    }
                }
                z16 = false;
                j3Var = this.Y0;
                n3Var = this.G0;
                a4Var = this.k1;
                if (r6Var4 != null) {
                }
                o2Var = this.X1;
                if (o2Var != null) {
                }
                z18 = c4Var.f;
                if (z18) {
                }
                syVar.c();
                this.S0 = 0L;
                this.U0 = z17;
                r6Var5 = c4Var.b;
                if (r6Var5 != null) {
                }
                ecVar = ec.w;
                if (ecVar != null) {
                    ecVar.b();
                }
                n3Var.J();
                q0();
                z16 = true;
                if (z16) {
                }
                a4Var.setOnSubtitleClick(null);
                TextView[] textViewArr2 = a4Var.c;
                this.M3 = 0;
                z20 = z61;
                long j102 = this.x1;
                boolean z632 = z62;
                z21 = c4Var.f;
                W0(j102, false, z21);
                r6Var6 = c4Var.b;
                if (r6Var6 != null) {
                }
                z22 = z16;
                y2Var2 = y2Var;
                j3Var2 = j3Var;
                n3Var2 = n3Var;
                a4Var2 = a4Var;
                charSequence2 = charSequence3;
                charSequence = charSequence2;
                z23 = z632;
                if (charSequence == null) {
                }
                w3Var = this.B0;
                if (w3Var != null) {
                }
                w3Var2 = this.C0;
                if (w3Var2 != null) {
                }
                storyItem10 = c4Var.a;
                if (storyItem6 == storyItem10) {
                }
                c4Var.o();
                if (!c4Var.g) {
                }
                i9 i9Var52 = ((z8) y3Var).d;
                i9Var52.V0 = false;
                i9Var52.P();
                z25 = c4Var.f;
                if (z25) {
                }
                if (z26 != this.C1) {
                }
                linearLayout = this.c2;
                if (linearLayout != null) {
                }
                z27 = this.Y2;
                LinearLayout linearLayout22 = this.K0;
                if (z27) {
                }
                gVar = this.Y1;
                if (gVar != null) {
                }
                aVar = this.T1;
                g2 g2Var2 = this.H0;
                if (aVar != null) {
                }
                n1Var = this.W1;
                if (n1Var != null) {
                }
                if (this.V1 != null) {
                }
                z36 = c4Var.f;
                if (z36) {
                }
                n3 n3Var32 = n3Var2;
                if (this.G1) {
                }
                n3Var32.setVisibility(8);
                storyItem11 = c4Var.a;
                if (storyItem11 != null) {
                }
                g2Var2.r(this.x1, null);
                g2Var2.setVisibility(8);
                j3Var2.invalidate();
                if (this.M1 != null) {
                }
                z37 = this.z1;
                z2 z2Var322 = this.L0;
                ImageView imageView322 = this.J0;
                z2 z2Var422 = this.z0;
                if (z37) {
                }
                z2Var422.requestLayout();
                i9Var.a1.append(this.x1, i10);
                if (this.G1) {
                }
                g2Var2.setLivePlayer(i9Var.w0);
                this.H1 = 0;
                if (i9Var.K0 != null) {
                }
                int i3322 = this.F1;
                this.I1 = i3322;
                int i3422 = this.w1;
                this.J1 = i3422;
                if (i9Var.N0) {
                }
                l10 = c4Var.l();
                ag.d dVar22 = this.u0;
                if (l10) {
                }
                r6Var7 = c4Var.b;
                n8 n8Var22 = this.y0;
                if (r6Var7 == null) {
                }
                this.X3 = false;
                n8Var22.setTranslationX(dVar22.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z22) {
                }
                r6Var8 = c4Var.b;
                if (r6Var8 == null) {
                }
                if (this.f2 != null) {
                }
                this.t1.a(i9.z1, false);
                if (this.G1) {
                }
                if (this.y1) {
                }
                eg.c cVar22 = a4Var2.b;
                j6 j6Var322 = i9Var.K0;
                cVar22.setPadding(0, 0, (j6Var322 != null || j6Var322.g() == this.J1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.y2).getTranslateController().detectStoryLanguage(c4Var.a);
                if (!z10) {
                }
                w3Var3 = this.C0;
                if (w3Var3 != null) {
                }
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.s0;
                if (imageView != null) {
                }
                imageView2 = this.t0;
                if (imageView2 == null) {
                }
            }
        }
        z14 = z12;
        storyItem5 = c4Var.a;
        if (storyItem5 != null) {
            i9Var.L0 = storyItem5.id;
        }
        i9Var.j0.A();
        this.U2 = true;
        if (!this.y1) {
        }
        k1(false);
        TL_stories.StoryItem storyItem212 = c4Var.a;
        r6 r6Var102 = c4Var.b;
        if (storyItem212 == null) {
        }
        if (storyItem2 == null) {
        }
        if (i29 == i11) {
        }
        if (z61) {
        }
        d1Var = i9Var.w0;
        if (d1Var != null) {
        }
        z16 = false;
        j3Var = this.Y0;
        n3Var = this.G0;
        a4Var = this.k1;
        if (r6Var4 != null) {
        }
        o2Var = this.X1;
        if (o2Var != null) {
        }
        z18 = c4Var.f;
        if (z18) {
        }
        syVar.c();
        this.S0 = 0L;
        this.U0 = z17;
        r6Var5 = c4Var.b;
        if (r6Var5 != null) {
        }
        ecVar = ec.w;
        if (ecVar != null) {
        }
        n3Var.J();
        q0();
        z16 = true;
        if (z16) {
        }
        a4Var.setOnSubtitleClick(null);
        TextView[] textViewArr22 = a4Var.c;
        this.M3 = 0;
        z20 = z61;
        long j1022 = this.x1;
        boolean z6322 = z62;
        z21 = c4Var.f;
        W0(j1022, false, z21);
        r6Var6 = c4Var.b;
        if (r6Var6 != null) {
        }
        z22 = z16;
        y2Var2 = y2Var;
        j3Var2 = j3Var;
        n3Var2 = n3Var;
        a4Var2 = a4Var;
        charSequence2 = charSequence3;
        charSequence = charSequence2;
        z23 = z6322;
        if (charSequence == null) {
        }
        w3Var = this.B0;
        if (w3Var != null) {
        }
        w3Var2 = this.C0;
        if (w3Var2 != null) {
        }
        storyItem10 = c4Var.a;
        if (storyItem6 == storyItem10) {
        }
        c4Var.o();
        if (!c4Var.g) {
        }
        i9 i9Var522 = ((z8) y3Var).d;
        i9Var522.V0 = false;
        i9Var522.P();
        z25 = c4Var.f;
        if (z25) {
        }
        if (z26 != this.C1) {
        }
        linearLayout = this.c2;
        if (linearLayout != null) {
        }
        z27 = this.Y2;
        LinearLayout linearLayout222 = this.K0;
        if (z27) {
        }
        gVar = this.Y1;
        if (gVar != null) {
        }
        aVar = this.T1;
        g2 g2Var22 = this.H0;
        if (aVar != null) {
        }
        n1Var = this.W1;
        if (n1Var != null) {
        }
        if (this.V1 != null) {
        }
        z36 = c4Var.f;
        if (z36) {
        }
        n3 n3Var322 = n3Var2;
        if (this.G1) {
        }
        n3Var322.setVisibility(8);
        storyItem11 = c4Var.a;
        if (storyItem11 != null) {
        }
        g2Var22.r(this.x1, null);
        g2Var22.setVisibility(8);
        j3Var2.invalidate();
        if (this.M1 != null) {
        }
        z37 = this.z1;
        z2 z2Var3222 = this.L0;
        ImageView imageView3222 = this.J0;
        z2 z2Var4222 = this.z0;
        if (z37) {
        }
        z2Var4222.requestLayout();
        i9Var.a1.append(this.x1, i10);
        if (this.G1) {
        }
        g2Var22.setLivePlayer(i9Var.w0);
        this.H1 = 0;
        if (i9Var.K0 != null) {
        }
        int i33222 = this.F1;
        this.I1 = i33222;
        int i34222 = this.w1;
        this.J1 = i34222;
        if (i9Var.N0) {
        }
        l10 = c4Var.l();
        ag.d dVar222 = this.u0;
        if (l10) {
        }
        r6Var7 = c4Var.b;
        n8 n8Var222 = this.y0;
        if (r6Var7 == null) {
        }
        this.X3 = false;
        n8Var222.setTranslationX(dVar222.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z22) {
        }
        r6Var8 = c4Var.b;
        if (r6Var8 == null) {
        }
        if (this.f2 != null) {
        }
        this.t1.a(i9.z1, false);
        if (this.G1) {
        }
        if (this.y1) {
        }
        eg.c cVar222 = a4Var2.b;
        j6 j6Var3222 = i9Var.K0;
        cVar222.setPadding(0, 0, (j6Var3222 != null || j6Var3222.g() == this.J1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.y2).getTranslateController().detectStoryLanguage(c4Var.a);
        if (!z10) {
        }
        w3Var3 = this.C0;
        if (w3Var3 != null) {
        }
        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
        }
        imageView = this.s0;
        if (imageView != null) {
        }
        imageView2 = this.t0;
        if (imageView2 == null) {
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
        String l10 = com.google.android.recaptcha.internal.a.l(max, "_", max);
        ArrayList arrayList11 = this.O3;
        arrayList11.clear();
        ArrayList arrayList12 = this.P3;
        arrayList12.clear();
        int i12 = 0;
        while (true) {
            arrayList = this.d1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((ig.h0) arrayList.get(i12)).b(false);
            i12++;
        }
        arrayList.clear();
        int i13 = 0;
        while (true) {
            if (i13 >= 2) {
                break;
            }
            int i14 = this.F1;
            if (i13 == 0) {
                i10 = i14 - 1;
                imageReceiver = this.b1;
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
                ArrayList arrayList13 = this.s1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.r1;
                if (isEmpty && i10 >= arrayList2.size()) {
                    V0((r6) arrayList13.get(i10 - arrayList2.size()), imageReceiver, l10);
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    if (i10 >= arrayList2.size()) {
                        i10 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i10);
                    long j10 = this.x1;
                    storyItem2.dialogId = j10;
                    r6 t10 = this.O1.t(j10, storyItem2);
                    if (t10 != null) {
                        V0(t10, imageReceiver, l10);
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
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), s3.c.l(l10, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), l10, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i13;
                                String str2 = l10;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                l10 = str2;
                            }
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i11 = i13;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (z10) {
                                storyItem = storyItem2;
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), s3.c.l(l10, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), l10, null, null, null, 0L, null, storyItem, 0);
                            } else {
                                storyItem = storyItem2;
                                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.clearImage();
                                } else {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                                    imageReceiver2.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), l10, null, null, null, 0L, null, storyItem, 0);
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (messageMedia3 != null && MessageObject.isVideoDocument(messageMedia3.getDocument())) {
                        TLRPC.Document document = storyItem.media.getDocument();
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = FileLoader.getInstance(this.y2).getFileReference(storyItem);
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("?account=");
                            sb2.append(this.y2);
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
                                } catch (UnsupportedEncodingException e9) {
                                    e = e9;
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
                                ig.h0 h0Var = new ig.h0(this);
                                h0Var.e(ig.q0.d(tL_mediaAreaSuggestedReaction.reaction));
                                h0Var.b(this.W0);
                                arrayList10 = arrayList5;
                                arrayList10.add(h0Var);
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
                ImageReceiver imageReceiver3 = this.c1;
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
                    ArrayList arrayList132 = this.s1;
                    isEmpty = arrayList132.isEmpty();
                    arrayList2 = this.r1;
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
        z8 z8Var = (z8) this.M1;
        i9 i9Var = z8Var.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z11 = i9Var.D0;
            ArrayList arrayList16 = i9Var.I0;
            if (z11) {
                return;
            }
            for (int i16 = 0; i16 < arrayList16.size(); i16++) {
                for (int i17 = 0; i17 < arrayList15.size(); i17++) {
                    if (((Uri) arrayList15.get(i17)).equals(((h9) arrayList16.get(i16)).uri)) {
                        arrayList15.remove(i17);
                    }
                }
            }
            for (int i18 = 0; i18 < arrayList15.size(); i18++) {
                Uri uri = (Uri) arrayList15.get(i18);
                h9 h9Var = new h9(i9Var, i9Var.y0, i9Var.x0);
                h9Var.setOnSeekUpdate(new p6(14, z8Var, h9Var));
                h9Var.uri = uri;
                TLRPC.Document document2 = (TLRPC.Document) arrayList14.get(i18);
                h9Var.document = document2;
                FileStreamLoadOperation.setPriorityForDocument(document2, 0);
                h9Var.preparePlayer(uri, i9.z1, i9.x1);
                arrayList16.add(h9Var);
                if (arrayList16.size() > 2) {
                    ((h9) arrayList16.remove(0)).release(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.v1;
    }

    public long getCurrentPeer() {
        return this.x1;
    }

    public int getListPosition() {
        return this.H1;
    }

    public Bitmap getPlayingBitmap() {
        j3 j3Var = this.Y0;
        Bitmap createBitmap = Bitmap.createBitmap(j3Var.getWidth(), j3Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.F1;
    }

    public s6 getStoriesController() {
        return MessagesController.getInstance(this.y2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.z2, this.r1.size()) + this.s1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.r1;
    }

    public final void h1() {
        if (this.C1) {
            TextView textView = this.d2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.e2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.d2;
        if (textView3 != null) {
            textView3.setText(LocaleController.getString(this.A1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        }
        TextView textView4 = this.e2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.e2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.v1;
        i9 i9Var = this.F0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.s1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((r6) arrayList2.get(i11)).a;
                    if (((int) (j10 ^ (j10 >>> 32))) == i9Var.L0) {
                        this.F1 = i11;
                        return;
                    }
                }
            }
            int indexOf = this.v1.indexOf(Integer.valueOf(i9Var.L0));
            if (indexOf < 0 && !this.v1.isEmpty()) {
                if (i9Var.L0 > ((Integer) this.v1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (i9Var.L0 < ((Integer) i0.a.i(1, this.v1)).intValue()) {
                    indexOf = this.v1.size() - 1;
                }
            }
            this.F1 = i10 + indexOf;
        } else {
            int i12 = i9Var.a1.get(this.x1, -1);
            this.F1 = i12;
            if (i12 == -1 && !i9Var.J0 && (peerStories = this.q1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.r1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i13)).id > this.q1.max_read_id) {
                        this.F1 = i13;
                        break;
                    }
                    i13++;
                }
            }
        }
        if (this.F1 == -1) {
            this.F1 = 0;
        }
    }

    public final void j1() {
        j6 j6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.r1;
        arrayList.clear();
        i9 i9Var = this.F0;
        if (!i9Var.J0) {
            ArrayList arrayList2 = this.v1;
            int i10 = 0;
            ArrayList arrayList3 = this.s1;
            if (arrayList2 != null && (j6Var = i9Var.K0) != null) {
                if (j6Var instanceof b6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.y2).getStoriesController().E(this.x1);
                    String str = ((b6) i9Var.K0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            r6 r6Var = (r6) E.get(i11);
                            lh.z7 z7Var = r6Var.c;
                            if (z7Var != null && !z7Var.g && TextUtils.equals(z7Var.K0, str)) {
                                arrayList3.add(r6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.v1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f10 = i9Var.K0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (i9Var.K0 != null) {
                while (i10 < i9Var.K0.i.size()) {
                    arrayList.add(((MessageObject) i9Var.K0.i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = i9Var.M0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.x1) {
                    TL_stories.PeerStories y10 = this.O1.y(this.x1);
                    this.q1 = y10;
                    if (y10 == null) {
                        this.q1 = this.O1.z(this.x1);
                    }
                } else {
                    this.q1 = i9Var.M0;
                }
                this.z2 = 0;
                TL_stories.PeerStories peerStories2 = this.q1;
                if (peerStories2 != null) {
                    this.z2 = peerStories2.stories.size();
                    arrayList.addAll(this.q1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.O1.E(this.x1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        } else if (!i9Var.O0) {
            arrayList.add(i9Var.P0);
        }
        this.w1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        e4 currentPeerView;
        k50 k50Var = this.F2;
        if (k50Var != null) {
            k50Var.T = null;
            k50Var.d(false);
        }
        long j10 = this.x1;
        TL_stories.StoryItem storyItem = this.K1.a;
        i9 i9Var = this.F0;
        i9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            i9.A1.remove(j10 + (j10 >> 16) + (storyItem.id << 16));
        }
        this.e3 = true;
        y8 y8Var = i9Var.j0;
        if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            ec I = new mc(this.Y0, this.x0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new v1(this, 2));
            I.r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.y2).ensureMessagesLoaded(this.x1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        c4 c4Var = this.K1;
        TL_stories.StoryItem storyItem = c4Var.a;
        if (storyItem == null) {
            storyItem = c4Var.c;
        }
        boolean z11 = this.z1;
        if (z11 || this.y1) {
            if (storyItem == null) {
                this.w2.setText("");
                this.B2.setVisibility(8);
                this.x2.setVisibility(8);
                return;
            }
            i9 i9Var = this.F0;
            z2 z2Var = this.z0;
            if (!z11) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.w2.setText(LocaleController.getString(i9Var.K0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                    this.w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.x2.setVisibility(8);
                    this.B2.setVisibility(8);
                } else {
                    int i11 = 0;
                    for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                        TLObject userOrChat = MessagesController.getInstance(this.y2).getUserOrChat(storyItem.views.recent_viewers.get(i12).longValue());
                        if (userOrChat != null) {
                            this.x2.b(i11, userOrChat, this.y2);
                            i11++;
                        }
                        if (i11 >= 3) {
                            break;
                        }
                    }
                    for (int i13 = i11; i13 < 3; i13++) {
                        this.x2.b(i13, null, this.y2);
                    }
                    this.x2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        cq cqVar = new cq(R.drawable.mini_views_likes, 0);
                        cqVar.setOverrideColor(-53704);
                        cqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        cq cqVar2 = new cq(R.drawable.mini_repost_story, 0);
                        cqVar2.setOverrideColor(-14161823);
                        cqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(cqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.w2.setText(spannableStringBuilder);
                    if (i11 == 0) {
                        this.x2.setVisibility(8);
                        this.w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.x2.setVisibility(0);
                        this.w2.setTranslationX(AndroidUtilities.dp(10.0f) + i0.a.e(i11, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.B2.setVisibility(0);
                }
                z2Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.K0.requestLayout();
                return;
            }
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2.views_count <= 0) {
                storyViews2.views_count = 1;
            }
            org.telegram.ui.Components.i6 i6Var = this.N0;
            if (i6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.R0 = false;
            } else {
                i6Var.q(Integer.toString(i10), z10 && this.R0, true);
                this.R0 = true;
            }
            int i14 = storyItem.views.reactions_count;
            if (i14 > 0) {
                this.M0.q(Integer.toString(i14), z10 && this.Q0, true);
                this.Q0 = true;
            } else {
                this.Q0 = false;
            }
            if (!z10) {
                this.O0.d(this.Q0 ? 1.0f : 0.0f, true);
                org.telegram.ui.Components.y5 y5Var = this.P0;
                if (y5Var != null) {
                    y5Var.d(this.R0 ? 1.0f : 0.0f, true);
                }
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
            if (!(this.A1 && (ChatObject.canSendPlain(chat) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                this.w2.setText(LocaleController.getString(i9Var.K0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.w2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new cq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.w2.setText(spannableStringBuilder2);
            } else {
                this.w2.setText("");
            }
            z2Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.Q0 ? this.M0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + z2Var.getLayoutParams().width;
            z2 z2Var2 = this.L0;
            if (z2Var2 != null) {
                z2Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.R0 ? this.N0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin += z2Var2.getLayoutParams().width;
                z2Var2.requestLayout();
            }
            this.S1.requestLayout();
            z2Var.requestLayout();
            this.x2.setVisibility(8);
            this.B2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = c4Var.a;
            f3 f3Var = this.f1;
            if (storyItem2 == null) {
                f3Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < f3Var.getChildCount(); i15++) {
                if (f3Var.getChildAt(i15) instanceof p8) {
                    ((p8) f3Var.getChildAt(i15)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void l0() {
        x6 x6Var = this.A0;
        x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new l2(0, x6Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        x6 x6Var2 = new x6(getContext(), this.t1);
        this.A0 = x6Var2;
        x6Var2.setPadding(dp, dp, dp, dp);
        this.A0.setAlpha(0.0f);
        this.A0.setScaleX(0.8f);
        this.A0.setScaleY(0.8f);
        this.A0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.z0.addView(this.A0, h7.z5.e(40, 40, 3));
        this.m3 = false;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void l1() {
        /*
            Method dump skipped, instructions count: 1653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.e4.l1():void");
    }

    public final void m0(boolean z10) {
        ValueAnimator valueAnimator = this.Y3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z3, z10 ? 1.0f : 0.0f);
        this.Y3 = ofFloat;
        ofFloat.addUpdateListener(new w1(this, 2));
        this.Y3.addListener(new j2(this, z10, 1));
        this.Y3.setDuration(420L);
        this.Y3.setInterpolator(er.h);
        this.Y3.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.y2).isFrozen()) {
            org.telegram.ui.b.b(this.y2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 <= 0 || !this.g3) {
            runnable.run();
            return;
        }
        int i11 = i10 - 1;
        SharedConfig.stealthModeSendMessageConfirm = i11;
        SharedConfig.updateStealthModeSendMessageConfirm(i11);
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 0, this.x0);
        b2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        b2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        h3.x xVar = new h3.x(runnable, 22);
        b2Var.h0 = string;
        b2Var.i0 = xVar;
        String string2 = LocaleController.getString(R.string.Cancel);
        ia.l lVar = new ia.l(15);
        b2Var.j0 = string2;
        b2Var.k0 = lVar;
        b2Var.show();
    }

    public final void o0(int i10) {
        this.A2 = false;
        this.R2 = true;
        this.x3 = false;
        this.z1 = false;
        this.A1 = false;
        long j10 = this.x1;
        a4 a4Var = this.k1;
        org.telegram.ui.Components.y8 y8Var = this.j1;
        if (j10 >= 0) {
            this.y1 = j10 == UserConfig.getInstance(this.y2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.x1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.y2).isUserContactBlocked(this.x1);
            this.B1 = !UserConfig.getInstance(this.y2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.D1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            y8Var.m(this.y2, user);
            a4Var.a.getImageReceiver().setForUserOrChat(user, y8Var);
            W0(this.x1, true, false);
        } else {
            this.y1 = false;
            this.z1 = true;
            if (this.O1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.x3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.A1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.y2).getChatFull(-this.x1) == null) {
                MessagesStorage.getInstance(this.y2).loadChatInfo(-this.x1, true, new CountDownLatch(1), false, false);
            }
            this.B1 = this.A1 && !ChatObject.canSendPlain(chat);
            this.D1 = MessagesController.getInstance(this.y2).getSendPaidMessagesStars(this.x1);
            y8Var.k(this.y2, chat);
            a4Var.a.getImageReceiver().setForUserOrChat(chat, y8Var);
            W0(this.x1, true, false);
        }
        if (this.G1 && (this.y1 || this.z1)) {
            s6 s6Var = this.O1;
            long j11 = this.x1;
            a0.h hVar = s6Var.m;
            r9 r9Var = (r9) hVar.f(j11);
            if (r9Var == null) {
                r9Var = new r9(s6Var.a, j11, s6Var);
                hVar.k(r9Var, j11);
            }
            r9Var.b(true);
        }
        j1();
        this.F1 = i10;
        if (i10 < 0) {
            this.F1 = 0;
        }
        this.S0 = 0L;
        this.U0 = false;
        this.F3 = null;
        this.G3 = null;
        boolean z10 = this.z1;
        j3 j3Var = this.Y0;
        i9 i9Var = this.F0;
        int i11 = 8;
        c4 c4Var = this.K1;
        if (z10) {
            B0();
            if (this.X1 == null && (this.A1 || c4Var.f)) {
                v0();
            }
            if (this.X1 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
                o2 o2Var = this.X1;
                if (c4Var.f || (!I0() && this.A1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                o2Var.setVisibility(i11);
                o2 o2Var2 = this.X1;
                boolean z11 = c4Var.f;
                D0(true);
                o2Var2.h1(z11);
                this.X1.n1(c4Var.f && !D0(true) && (this.r2 || this.X1.S0), true);
                lt editField = this.X1.getEditField();
                long j12 = this.x1;
                TL_stories.StoryItem storyItem = c4Var.a;
                i9Var.getClass();
                editField.setText(i9.u(j12, storyItem));
                this.X1.a1(this.y2, this.x1);
                this.X1.J1(chat2, null);
            }
            org.telegram.ui.Components.i6 i6Var = this.M0;
            org.telegram.ui.ActionBar.c6 c6Var = this.x0;
            if (i6Var == null) {
                org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, false, false, false);
                this.M0 = i6Var2;
                z2 z2Var = this.z0;
                i6Var2.setCallback(z2Var);
                this.M0.r(c6Var.N0(org.telegram.ui.ActionBar.g6.G6));
                this.M0.t(AndroidUtilities.dp(14.0f));
                this.O0 = new org.telegram.ui.Components.y5(z2Var);
            }
            z2 z2Var2 = this.L0;
            if (z2Var2 != null && this.N0 == null) {
                org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, false, false, false);
                this.N0 = i6Var3;
                i6Var3.setCallback(z2Var2);
                this.N0.r(c6Var.N0(org.telegram.ui.ActionBar.g6.G6));
                this.N0.t(AndroidUtilities.dp(14.0f));
                this.P0 = new org.telegram.ui.Components.y5(z2Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.w1 = getStoriesCount();
            j3Var.invalidate();
            invalidate();
        } else if (this.y1) {
            B0();
            if (c4Var.f) {
                this.S1.setVisibility(8);
                if (this.X1 == null) {
                    v0();
                }
                this.X1.setVisibility(0);
            } else {
                this.S1.setVisibility(0);
                o2 o2Var3 = this.X1;
                if (o2Var3 != null) {
                    o2Var3.setVisibility(8);
                }
            }
            o2 o2Var4 = this.X1;
            if (o2Var4 != null) {
                boolean z12 = c4Var.f;
                D0(true);
                o2Var4.h1(z12);
                this.X1.n1(c4Var.f && !D0(true) && (this.r2 || this.X1.S0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.v1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(i9Var.L0));
                    if (indexOf < 0 && !this.v1.isEmpty()) {
                        if (i9Var.L0 > ((Integer) this.v1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (i9Var.L0 < ((Integer) i0.a.i(1, this.v1)).intValue()) {
                            indexOf = this.v1.size() - 1;
                        }
                    }
                    this.F1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.s1.isEmpty();
                    ArrayList arrayList2 = this.r1;
                    if (isEmpty) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i12)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i12)).id > this.O1.f.get(this.x1)) {
                                this.F1 = i12;
                                break;
                            }
                        }
                    } else {
                        this.F1 = arrayList2.size();
                    }
                }
            }
            f1(false);
            j3Var.invalidate();
            invalidate();
        } else {
            if (this.X1 == null) {
                v0();
            }
            if (this.B1 && this.c2 == null) {
                z0();
            }
            if (this.c2 != null) {
                if (this.B1 || this.C1) {
                    h1();
                }
                this.c2.setVisibility(((!this.B1 || c4Var.f) && !this.C1) ? 8 : 0);
            }
            g8 g8Var = this.f2;
            if (g8Var != null) {
                g8Var.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            o2 o2Var5 = this.X1;
            if (o2Var5 != null) {
                o2Var5.setVisibility((I0() || UserObject.isService(this.x1)) ? 8 : 0);
                o2 o2Var6 = this.X1;
                boolean z13 = c4Var.f;
                D0(true);
                o2Var6.h1(z13);
                this.X1.n1(c4Var.f && !D0(true) && (this.r2 || this.X1.S0), true);
                lt editField2 = this.X1.getEditField();
                long j13 = this.x1;
                TL_stories.StoryItem storyItem2 = c4Var.a;
                i9Var.getClass();
                editField2.setText(i9.u(j13, storyItem2));
                this.X1.a1(this.y2, this.x1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.y2).getUserFull(this.x1);
                if (userFull != null) {
                    this.X1.J1(null, userFull);
                } else {
                    MessagesController.getInstance(this.y2).loadFullUser(MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.x1)), this.v2, false);
                }
            }
            this.w1 = getStoriesCount();
            z2 z2Var3 = this.S1;
            if (z2Var3 != null) {
                z2Var3.setVisibility(8);
            }
            j3Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W0 = true;
        this.a1.onAttachedToWindow();
        this.c1.onAttachedToWindow();
        this.b1.onAttachedToWindow();
        this.h3.onAttachedToWindow();
        this.j3.onAttachedToWindow();
        o2 o2Var = this.X1;
        if (o2Var != null) {
            o2Var.E0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d1;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.y2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.y2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.y2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.y2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.y2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.y2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.y2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.y2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.y2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((ig.h0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.W0 = false;
        this.a1.onDetachedFromWindow();
        this.c1.onDetachedFromWindow();
        this.b1.onDetachedFromWindow();
        this.h3.onDetachedFromWindow();
        this.j3.onDetachedFromWindow();
        o2 o2Var = this.X1;
        if (o2Var != null) {
            o2Var.D0();
        }
        org.telegram.ui.Components.k5 k5Var = this.k3;
        if (k5Var != null) {
            k5Var.o(this);
            this.k3 = null;
        }
        ig.d dVar = this.i3;
        if (dVar != null) {
            dVar.d(this);
            this.i3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d1;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.y2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.y2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.y2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.y2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.y2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.y2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.y2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.y2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.y2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((ig.h0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.t1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
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
        float f10;
        char c10;
        k50 k50Var;
        boolean z10;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        wj0 wj0Var;
        q2 q2Var;
        i9 i9Var = this.F0;
        if (i9Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i12 = 0;
        if (this.G1 && this.V2 == null) {
            this.u2 = ((z8) this.M1).d.l0;
        } else {
            this.u2 = 0;
        }
        int size = i9Var.b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.u2;
        int size2 = (int) ((View.MeasureSpec.getSize(i10) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.u2 < AndroidUtilities.dp(20.0f)) {
            this.u2 = 0;
        }
        int i13 = this.u2;
        wj0 wj0Var2 = this.n3;
        if (wj0Var2 == null || wj0Var2.getReactionsWindow() == null || this.n3.getReactionsWindow().q) {
            o2 o2Var = this.X1;
            if (o2Var != null && (o2Var.t0() || this.X1.f3)) {
                if (this.X1.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.X1.getEmojiPadding();
                } else {
                    o2 o2Var2 = this.X1;
                    if (o2Var2.u3) {
                        o2Var2.L();
                        i13 = this.X1.getStickersExpandedHeight();
                    } else {
                        i13 = o2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.n3.getReactionsWindow().c.animate().translationY(-this.u2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
            i13 = 0;
        }
        boolean z11 = this.r2;
        int i14 = this.k2;
        a4 a4Var = this.k1;
        int i15 = 1;
        if (i14 != i13) {
            this.r2 = false;
            int i16 = 3;
            c4 c4Var = this.K1;
            f10 = 8.0f;
            if (i13 <= 0 || !this.G1) {
                o2 o2Var3 = this.X1;
                if (o2Var3 != null) {
                    i9.J(this.x1, c4Var.a, o2Var3.getEditText());
                }
            } else {
                this.r2 = true;
                this.e3 = false;
                this.p2 = i13;
                if (this.b2 == null) {
                    wj0 wj0Var3 = new wj0(1, this.y2, getContext(), LaunchActivity.R(), new m2(i16, this.x0));
                    this.b2 = wj0Var3;
                    wj0Var3.setHint(LocaleController.getString(this.A1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    wj0 wj0Var4 = this.b2;
                    wj0Var4.J0 = true;
                    addView(wj0Var4, this.E0, h7.z5.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.b2.setDelegate(new e3(this));
                    this.b2.p(null, null, true);
                }
                this.b2.setFragment(LaunchActivity.R());
                this.b2.setHint(LocaleController.getString(this.A1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                ig.m0 m0Var = ig.m0.B;
                if (m0Var != null) {
                    m0Var.l = true;
                }
                ig.m0 m0Var2 = ig.m0.C;
                if (m0Var2 != null) {
                    m0Var2.l = true;
                }
            }
            o2 o2Var4 = this.X1;
            if (o2Var4 != null) {
                o2Var4.n1(c4Var.f && !D0(true) && this.r2, true);
            }
            if (this.r2 && (q2Var = this.Z2) != null) {
                q2Var.setVisibility(0);
            }
            if (!this.r2 && (wj0Var = this.b2) != null) {
                wj0Var.n();
            }
            a4Var.setEnabled(!this.r2);
            if (this.X1 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.r2, 0.1f, true);
            }
            if (this.G1 && this.r2) {
                i9 i9Var2 = ((z8) this.M1).d;
                if (!i9Var2.x) {
                    i9Var2.x = true;
                    i9Var2.P();
                }
            }
            this.k2 = i13;
            ValueAnimator valueAnimator = this.l2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.J2.lock();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D2, i13);
            this.l2 = ofFloat;
            ofFloat.addUpdateListener(new w1(this, i12));
            this.l2.addListener(new k2(this, i15));
            if (this.r2) {
                this.l2.setDuration(250L);
                this.l2.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                i9Var.m();
            } else {
                this.l2.setDuration(500L);
                this.l2.setInterpolator(er.h);
            }
            this.l2.start();
            boolean z12 = this.r2;
            if (z12 != z11) {
                if (z12) {
                    com.google.firebase.messaging.m mVar = this.L1;
                    Canvas canvas = (Canvas) mVar.b;
                    Bitmap bitmap = (Bitmap) mVar.c;
                    E0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.b.k(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (c4Var.f) {
                        lh.w3 w3Var = this.Z1;
                        if (w3Var != null) {
                            if (!w3Var.R) {
                                removeView(w3Var);
                            }
                        }
                        if (!D0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            lh.w3 w3Var2 = new lh.w3(getContext(), 3);
                            this.Z1 = w3Var2;
                            w3Var2.t(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.Z1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            lh.w3 w3Var3 = this.Z1;
                            w3Var3.G = Layout.Alignment.ALIGN_OPPOSITE;
                            w3Var3.h0 = new hh.m5(21, this, w3Var2);
                            addView(w3Var3, h7.z5.e(-1, 100, 87));
                            this.Z1.v();
                            l1();
                        }
                    }
                } else {
                    o2 o2Var5 = this.X1;
                    if (o2Var5 != null) {
                        o2Var5.getEditField().clearFocus();
                    }
                    lh.w3 w3Var4 = this.Z1;
                    if (w3Var4 != null) {
                        w3Var4.e(true);
                    }
                }
                this.q2 = true;
            } else {
                this.q2 = false;
            }
        } else {
            f10 = 8.0f;
        }
        o2 o2Var6 = this.X1;
        if (o2Var6 != null && o2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.X1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        j3 j3Var = this.Y0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j3Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z13 = size - size2 > AndroidUtilities.dp(64.0f);
        this.t2 = z13;
        int dp2 = (size - ((z13 ? AndroidUtilities.dp(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = dp2;
        if (this.t2) {
            this.G2 = (((-dp2) + size) - size2) - AndroidUtilities.dp(64.0f);
        } else {
            this.G2 = ((-dp2) + size) - size2;
        }
        if (this.t2 != this.s2) {
            j3Var.setLayoutParams(layoutParams2);
        }
        z2 z2Var = this.S1;
        if (z2Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) z2Var.getLayoutParams();
            if (this.t2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f10) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        cg.q qVar = this.X2;
        if (qVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) qVar.getLayoutParams();
            if (this.t2) {
                c10 = 0;
                this.X2.setTextColor(i0.b.d(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                k50Var = this.F2;
                if (k50Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) k50Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.y1.A(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i13;
                    }
                }
                z10 = this.t2;
                LinearLayout linearLayout = this.K0;
                n3 n3Var = this.G0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.y1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) n3Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.s2 != this.t2) {
                        n3Var.setLayoutParams((FrameLayout.LayoutParams) n3Var.getLayoutParams());
                    }
                    n3Var.q0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) n3Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
                    if (this.s2 != this.t2) {
                        n3Var.setLayoutParams((FrameLayout.LayoutParams) n3Var.getLayoutParams());
                    }
                    n3Var.q0 = AndroidUtilities.dp(f10);
                }
                this.R2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.y0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.u0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                eg.c cVar = a4Var.b;
                TextView[] textViewArr = a4Var.c;
                layoutParams = (FrameLayout.LayoutParams) cVar.getLayoutParams();
                if (layoutParams.rightMargin != dp) {
                    int i17 = (int) dp;
                    layoutParams.rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i17;
                    a4Var.forceLayout();
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.s2 = this.t2;
            }
            this.X2.setTextColor(i0.b.k(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c10 = 0;
        k50Var = this.F2;
        if (k50Var != null) {
        }
        z10 = this.t2;
        LinearLayout linearLayout2 = this.K0;
        n3 n3Var2 = this.G0;
        if (z10) {
        }
        this.R2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.y0.getVisibility() == 0) {
        }
        if (this.u0.getVisibility() == 0) {
        }
        eg.c cVar2 = a4Var.b;
        TextView[] textViewArr2 = a4Var.c;
        layoutParams = (FrameLayout.LayoutParams) cVar2.getLayoutParams();
        if (layoutParams.rightMargin != dp) {
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.s2 = this.t2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.m2 = -1.0f;
        this.R2 = true;
        invalidate();
    }

    public final void p0() {
        n3 n3Var = this.G0;
        if (n3Var.S.y()) {
            n3Var.S.f(false);
        }
    }

    public final void q0() {
        if (this.G1) {
            ((z8) this.M1).d.P();
        }
    }

    public final void r0(boolean z10) {
        if (this.X1 != null && this.b3 && this.W0) {
            v1 v1Var = this.L3;
            AndroidUtilities.cancelRunOnUIThread(v1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.O1.B;
            this.X1.K(true);
            boolean z11 = this.B1;
            c4 c4Var = this.K1;
            if ((z11 && !c4Var.f) || this.C1) {
                this.g3 = false;
                this.X1.setEnabled(false);
                this.X1.i1(" ", z10);
                return;
            }
            if (this.D1 > 0) {
                this.g3 = false;
                this.X1.setEnabled(true);
                this.X1.i1(oa.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.D1, ','))), z10);
                return;
            }
            if (!c4Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.y2).getCurrentTime();
                int i10 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i10) {
                    this.g3 = true;
                    int currentTime2 = i10 - ConnectionsManager.getInstance(this.y2).getCurrentTime();
                    int i11 = currentTime2 / 60;
                    int i12 = currentTime2 % 60;
                    int i13 = R.string.StealthModeActiveHintShort;
                    Locale locale = Locale.US;
                    int measureText = (int) this.X1.getEditField().getPaint().measureText(LocaleController.formatString(i13, String.format(locale, "%02d:%02d", 99, 99)));
                    this.X1.setEnabled(true);
                    if (measureText * 1.2f >= this.X1.getEditField().getMeasuredWidth()) {
                        o2 o2Var = this.X1;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        o2Var.e = formatString;
                        o2Var.f = format;
                        o2Var.F1(z10);
                    } else {
                        this.X1.i1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    AndroidUtilities.runOnUIThread(v1Var, 1000L);
                    return;
                }
            }
            this.g3 = false;
            this.X1.setEnabled(true);
            if (!c4Var.f) {
                this.X1.i1(LocaleController.getString(this.A1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            if (this.X1.getStarsPrice() <= 0) {
                this.X1.i1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.X1.i1(oa.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.X1.J4), z10);
            cq cqVar = this.X1.J4[0];
            if (cqVar != null) {
                cqVar.spaceScaleX = 0.9f;
            }
        }
    }

    public final boolean s0() {
        if (this.o3) {
            if (this.n3.getReactionsWindow() == null) {
                b1(false);
                return true;
            }
            if (this.u2 > 0) {
                AndroidUtilities.hideKeyboard(this.n3.getReactionsWindow().c);
                return true;
            }
            this.n3.getReactionsWindow().d();
            return true;
        }
        f3 f3Var = this.f1;
        if (f3Var != null) {
            lh.w3 w3Var = f3Var.c;
            if (w3Var != null) {
                w3Var.e(true);
                f3Var.c = null;
            }
            f3Var.b = null;
            f3Var.invalidate();
            f3Var.b(false);
        }
        n3 n3Var = this.G0;
        if (n3Var.S.y()) {
            n3Var.S.f(false);
            return true;
        }
        lh.w3 w3Var2 = this.B0;
        if (w3Var2 != null) {
            w3Var2.e(true);
        }
        lh.w3 w3Var3 = this.C0;
        if (w3Var3 != null) {
            w3Var3.e(true);
        }
        x30 x30Var = this.S2;
        if (x30Var != null) {
            x30Var.b(true);
        }
        x3 x3Var = this.p1;
        if (x3Var != null && x3Var.b) {
            x3Var.a();
            return true;
        }
        o2 o2Var = this.X1;
        if (o2Var != null && o2Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.x0);
            if (this.X1.Y0) {
                alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new s1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((z8) this.M1).h(alertDialog$Builder.a);
            return true;
        }
        wj0 wj0Var = this.b2;
        if (wj0Var != null && wj0Var.getReactionsWindow() != null && !this.b2.getReactionsWindow().q) {
            this.b2.getReactionsWindow().d();
            return true;
        }
        o2 o2Var2 = this.X1;
        if (o2Var2 != null && o2Var2.t0()) {
            if (this.u2 > 0) {
                AndroidUtilities.hideKeyboard(this.X1.getEmojiView());
                return true;
            }
            this.X1.n0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (n3Var.getVisibility() != 0 || n3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            n3Var.C();
            this.c3 = false;
            this.Y0.invalidate();
            return true;
        }
        o2 o2Var3 = this.X1;
        if (o2Var3 != null) {
            long j10 = this.x1;
            TL_stories.StoryItem storyItem = this.K1.a;
            Editable editText = o2Var3.getEditText();
            this.F0.getClass();
            i9.J(j10, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.X1);
        return true;
    }

    public void setAccount(int i10) {
        this.y2 = i10;
        this.O1 = MessagesController.getInstance(i10).storiesController;
        this.g1.b = i10;
        wj0 wj0Var = this.b2;
        if (wj0Var != null) {
            wj0Var.setCurrentAccount(i10);
            this.b2.p(null, null, true);
        }
        wj0 wj0Var2 = this.n3;
        if (wj0Var2 != null) {
            wj0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(y3 y3Var) {
        this.M1 = y3Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.b3 == z10) {
            return;
        }
        this.b3 = z10;
        if (z10) {
            this.a1.setCurrentAlpha(1.0f);
            r0(false);
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.G1) {
            this.H2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f10) {
        boolean z10 = f10 == 0.0f;
        if (this.X0 != z10) {
            this.X0 = z10;
            this.Y0.invalidate();
            if (this.G1 && this.F0.a && Build.VERSION.SDK_INT < 33) {
                a8.b bVar = this.R3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    i9 i9Var = ((z8) this.M1).d;
                    i9Var.h1 = true;
                    i9Var.P();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.N1 != z10) {
            this.N1 = z10;
            y2 y2Var = this.a1;
            if (z10) {
                y2Var.stopAnimation();
                y2Var.setAllowStartAnimation(false);
            } else {
                y2Var.startAnimation();
                y2Var.setAllowStartAnimation(true);
            }
            this.T0 = 0L;
            this.Y0.invalidate();
        }
    }

    public final void t0() {
        if (this.E2 == null) {
            t2 t2Var = new t2(this, getContext(), this.x0);
            this.E2 = t2Var;
            t2Var.V1 = new u2(this);
            t2Var.f0.f0();
            t2 t2Var2 = this.E2;
            t2Var2.S = true;
            t2Var2.r1();
            t2 t2Var3 = this.E2;
            t2Var3.T = new v2(this);
            t2Var3.m1().setText(this.X1.getFieldText());
        }
    }

    public final void u0() {
        if (this.T1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.E3);
        this.T1 = aVar;
        aVar.setOnClickListener(new x1(this, 1));
        addView(this.T1, h7.z5.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.x0;
        o2 o2Var = new o2(this, AndroidUtilities.findActivity(getContext()), this, new m2(1, c6Var));
        this.X1 = o2Var;
        o2Var.getEditField().useAnimatedTextDrawable();
        this.X1.getEditField().setScaleX(0.0f);
        this.X1.setOverrideKeyboardAnimation(true);
        this.X1.setClipChildren(false);
        this.X1.setDelegate(new p2(this));
        setDelegate(this.X1);
        o2 o2Var2 = this.X1;
        o2Var2.t4 = false;
        o2Var2.u4 = true;
        if (this.K1.f) {
            o2Var2.U0(false, false, false);
        } else {
            o2Var2.U0(true, true, false);
        }
        this.X1.d();
        o2 o2Var3 = this.X1;
        o2Var3.v4 = true;
        addView(o2Var3, h7.z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.K3 != null) {
            this.X1.O1(false);
        }
        this.X1.B2 = this.v2;
        d4 d4Var = this.I2;
        d4Var.g.add(this.Y0);
        d4Var.g.add(this);
        if (this.W0) {
            this.X1.E0();
        }
        r0(false);
        if (I0()) {
            this.X1.setVisibility(8);
        }
        sg.g gVar = new sg.g(getContext(), c6Var, this.E3, this.B3);
        this.Y1 = gVar;
        gVar.setOnClickListener(new s1(this, 1));
        addView(this.Y1, h7.z5.e(57, 300, 85));
        this.Y1.setVisibility(8);
        this.X1.setSideButtonsForAttach(this.Y1);
        this.E0 = getChildCount();
    }

    public final void w0() {
        if (this.f2 != null) {
            return;
        }
        g8 g8Var = new g8(getContext(), this.x0);
        this.f2 = g8Var;
        g8Var.setOnClickListener(new x1(this, 4));
        this.f2.setAlpha(0.0f);
        this.f2.setVisibility(8);
        addView(this.f2, h7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.W1 != null || getContext() == null) {
            return;
        }
        n1 n1Var = new n1(getContext(), this.E3);
        this.W1 = n1Var;
        n1Var.setOnClickListener(new x1(this, 5));
        n1 n1Var2 = this.W1;
        d1 d1Var = d1.S;
        boolean z10 = true;
        n1Var2.b(d1Var != null && d1Var.o(), false);
        n1 n1Var3 = this.W1;
        d1 d1Var2 = d1.S;
        if (d1Var2 != null && !d1Var2.m()) {
            z10 = false;
        }
        n1Var3.a(z10, false);
        addView(this.W1, h7.z5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void y0() {
        if (this.V1 != null || getContext() == null) {
            return;
        }
        this.U1 = new q1(getContext(), this.y2);
        r1 r1Var = new r1(getContext(), this.U1, this.E3);
        this.V1 = r1Var;
        r1Var.setOnClickListener(new x1(this, 6));
        this.V1.setOnLongClickListener(new u1(this, 1));
        addView(this.V1, h7.z5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.U1, h7.z5.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void z0() {
        if (this.c2 != null) {
            return;
        }
        if (this.X1 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.c2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.d2 = textView;
        textView.setTextColor(-8026747);
        this.d2.setTextSize(1, 16.0f);
        this.d2.setText(LocaleController.getString(this.A1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        TextView textView2 = new TextView(getContext());
        this.e2 = textView2;
        textView2.setTextColor(-1);
        this.e2.setTextSize(1, 12.0f);
        TextView textView3 = this.e2;
        int dp = AndroidUtilities.dp(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.e2.setGravity(17);
        h7.b6.a(this.e2);
        this.e2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.e2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.c2.addView(imageView, h7.z5.t(22, 22, 16, 12, 1, 4, 0));
        this.c2.addView(this.d2, h7.z5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.c2.addView(this.e2, h7.z5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.X1.addView(this.c2, h7.z5.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
