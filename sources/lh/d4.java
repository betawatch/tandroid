package lh;

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
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import jh.ia;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.de;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.y90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lu0;
import org.telegram.ui.pr;
import org.telegram.ui.ry;
import org.telegram.ui.tn;
import org.telegram.ui.wa1;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class d4 extends hv0 implements NotificationCenter.NotificationCenterDelegate {
    public x6 A0;
    public boolean A1;
    public boolean A2;
    public org.telegram.ui.ActionBar.g1 A3;
    public nh.t3 B0;
    public boolean B1;
    public z2 B2;
    public final lg.a B3;
    public nh.t3 C0;
    public boolean C1;
    public boolean C2;
    public final qg.a C3;
    public nh.t3 D0;
    public long D1;
    public float D2;
    public final qg.d D3;
    public int E0;
    public final float E1;
    public s2 E2;
    public final og.b E3;
    public final i9 F0;
    public int F1;
    public s50 F2;
    public TL_stories.TL_premium_boostsStatus F3;
    public final l3 G0;
    public boolean G1;
    public int G2;
    public ChannelBoostsController.CanApplyBoost G3;
    public final f2 H0;
    public int H1;
    public boolean H2;
    public long H3;
    public final View I0;
    public int I1;
    public final c4 I2;
    public long I3;
    public final ImageView J0;
    public int J1;
    public final AnimationNotificationsLocker J2;
    public boolean J3;
    public final LinearLayout K0;
    public final b4 K1;
    public final org.telegram.ui.Components.d6 K2;
    public TLRPC.TL_channels_sendAsPeers K3;
    public final y2 L0;
    public final bg.c2 L1;
    public final org.telegram.ui.Components.d6 L2;
    public final v1 L3;
    public org.telegram.ui.Components.n6 M0;
    public x3 M1;
    public float M2;
    public int M3;
    public org.telegram.ui.Components.n6 N0;
    public boolean N1;
    public long N2;
    public final v1 N3;
    public org.telegram.ui.Components.d6 O0;
    public s6 O1;
    public boolean O2;
    public final ArrayList O3;
    public org.telegram.ui.Components.d6 P0;
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
    public final ag.q1 R3;
    public long S0;
    public y2 S1;
    public g40 S2;
    public final org.telegram.ui.Components.d6 S3;
    public long T0;
    public a T1;
    public final lu0 T2;
    public final org.telegram.ui.Components.d6 T3;
    public boolean U0;
    public q1 U1;
    public boolean U2;
    public final org.telegram.ui.Components.d6 U3;
    public boolean V0;
    public r1 V1;
    public v2 V2;
    public float V3;
    public boolean W0;
    public n1 W1;
    public FrameLayout W2;
    public final Path W3;
    public boolean X0;
    public n2 X1;
    public eg.r X2;
    public boolean X3;
    public final h3 Y0;
    public ug.g Y1;
    public boolean Y2;
    public ValueAnimator Y3;
    public final FrameLayout Z0;
    public nh.t3 Z1;
    public p2 Z2;
    public float Z3;
    public final x2 a1;
    public ValueAnimator a2;
    public float a3;
    public final ImageReceiver b1;
    public fk0 b2;
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
    public final e3 f1;
    public g8 f2;
    public boolean f3;
    public final ry g1;
    public ViewPropertyAnimator g2;
    public boolean g3;
    public h4 h1;
    public final ng.d h2;
    public final ImageReceiver h3;
    public float i1;
    public final ng.d i2;
    public kg.d i3;
    public final org.telegram.ui.Components.e9 j1;
    public final Paint j2;
    public final ImageReceiver j3;
    public final z3 k1;
    public int k2;
    public org.telegram.ui.Components.p5 k3;
    public final h8 l1;
    public ValueAnimator l2;
    public boolean l3;
    public v5.l m1;
    public float m2;
    public boolean m3;
    public int n1;
    public float n2;
    public fk0 n3;
    public org.telegram.ui.ActionBar.g1 o1;
    public float o2;
    public boolean o3;
    public w3 p1;
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
    public final a4 t1;
    public boolean t2;
    public int t3;
    public final bh.d u0;
    public final jf.o0 u1;
    public int u2;
    public int u3;
    public final aj0 v0;
    public ArrayList v1;
    public final int v2;
    public v1 v3;
    public final ImageView w0;
    public int w1;
    public TextView w2;
    public float w3;
    public final org.telegram.ui.ActionBar.c6 x0;
    public long x1;
    public hh.b x2;
    public boolean x3;
    public final n8 y0;
    public boolean y1;
    public int y2;
    public pr y3;
    public final y2 z0;
    public boolean z1;
    public int z2;
    public org.telegram.ui.ActionBar.g1 z3;

    public d4(Context context, final i9 i9Var, a4 a4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.X0 = true;
        this.d1 = new ArrayList();
        this.n1 = -5;
        this.E1 = 1.0f;
        b4 b4Var = new b4(this);
        this.K1 = b4Var;
        this.m2 = -1.0f;
        this.n2 = -1.0f;
        this.o2 = -1.0f;
        this.v2 = ConnectionsManager.generateClassGuid();
        this.K2 = new org.telegram.ui.Components.d6(this);
        this.L2 = new org.telegram.ui.Components.d6(this);
        lu0 lu0Var = new lu0();
        this.T2 = lu0Var;
        this.a3 = 1.0f;
        this.L3 = new v1(this, 4);
        this.N3 = new v1(this, 11);
        this.O3 = new ArrayList();
        this.P3 = new ArrayList();
        this.R3 = new ag.q1(this, 29);
        this.S3 = new org.telegram.ui.Components.d6(this);
        this.T3 = new org.telegram.ui.Components.d6(this);
        this.U3 = new org.telegram.ui.Components.d6(this);
        this.W3 = new Path();
        lu0Var.E = new ag.o1(this, 21);
        c4 c4Var = new c4();
        c4Var.g = new ArrayList();
        this.I2 = c4Var;
        this.J2 = new AnimationNotificationsLocker();
        this.r1 = new ArrayList();
        this.s1 = new ArrayList();
        final int i10 = 0;
        x2 x2Var = new x2(this, i10);
        this.a1 = x2Var;
        x2Var.setCrossfadeWithOldImage(false);
        x2Var.setAllowLoadingOnAttachedOnly(true);
        x2Var.ignoreNotifications = true;
        x2Var.setFileLoadingPriority(0);
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
        x2Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.j1 = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.F0 = i9Var;
        this.t1 = a4Var;
        this.L1 = a4Var.g;
        this.O1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        a4Var.l.setColor(-16777216);
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
        e3 e3Var = new e3(this, context, this.Y0, c6Var, i9Var);
        this.f1 = e3Var;
        og.b bVar = new og.b(c6Var, org.telegram.ui.ActionBar.g6.Sd, 0.8f);
        this.E3 = bVar;
        qg.c cVar = new qg.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.D3 = null;
            this.C3 = cVar;
        } else {
            qg.d dVar = new qg.d(cVar);
            this.D3 = dVar;
            dVar.f(AndroidUtilities.dp(8.0f));
            this.C3 = dVar;
        }
        sg.i iVar = new sg.i(this);
        lg.a aVar = new lg.a(this.C3);
        aVar.d = iVar;
        aVar.e = this;
        this.B3 = aVar;
        this.h2 = aVar.c(this, bVar, false);
        ng.d c3 = aVar.c(this, bVar, false);
        this.i2 = c3;
        c3.t(AndroidUtilities.dp(32.0f));
        h3 h3Var = new h3(this, context, a4Var, i9Var);
        this.Y0 = h3Var;
        h3Var.setClipChildren(false);
        this.g1 = new ry(this.y2, h3Var);
        h3Var.addView(e3Var, i7.f6.c(-1.0f, -1));
        l3 l3Var = new l3(this, getContext(), i9Var.y, i9Var, c6Var);
        this.G0 = l3Var;
        l3Var.U.setOnClickListener(new x1(this, 10));
        ImageView imageView = new ImageView(context);
        this.J0 = imageView;
        imageView.setImageDrawable(a4Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new x1(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        i7.h6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(a4Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        y2 y2Var = new y2(this, getContext(), 1);
        this.L0 = y2Var;
        org.telegram.ui.Components.n6 n6Var = this.N0;
        if (n6Var != null) {
            n6Var.setCallback(y2Var);
        }
        y2Var.setWillNotDraw(false);
        y2Var.setOnClickListener(new x1(this, 12));
        y2 y2Var2 = new y2(this, getContext(), 2);
        this.z0 = y2Var2;
        org.telegram.ui.Components.n6 n6Var2 = this.M0;
        if (n6Var2 != null) {
            n6Var2.setCallback(y2Var2);
        }
        y2Var2.setWillNotDraw(false);
        y2Var2.setOnClickListener(new x1(this, 13));
        y2Var2.setOnLongClickListener(new e2(i10, this, i9Var));
        x6 x6Var = new x6(context, a4Var);
        this.A0 = x6Var;
        x6Var.setPadding(dp, dp, dp, dp);
        y2Var2.addView(this.A0, i7.f6.e(40, 40, 3));
        y2Var.addView(imageView2, i7.f6.e(40, 40, 3));
        i7.h6.b(y2Var2, 0.3f, 5.0f);
        i7.h6.b(y2Var, 0.3f, 5.0f);
        x2Var.setAllowLoadingOnAttachedOnly(true);
        x2Var.setParentView(h3Var);
        jf.o0 o0Var = new jf.o0(10);
        this.u1 = o0Var;
        h3Var.setOutlineProvider(o0Var);
        h3Var.setClipToOutline(true);
        addView(h3Var);
        z3 z3Var = new z3(context, b4Var);
        this.k1 = z3Var;
        z3Var.setOnClickListener(new View.OnClickListener(this) { // from class: lh.t1
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        d4 d4Var = this.b;
                        long j10 = UserConfig.getInstance(d4Var.y2).clientUserId;
                        long j11 = d4Var.x1;
                        i9 i9Var2 = i9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                i9Var2.H(tn.R9(j11));
                                break;
                            } else {
                                i9Var2.H(ProfileActivity.m4(j11));
                                break;
                            }
                        } else {
                            Bundle h = a4.w.h(1, TeXSymbolParser.TYPE_ATTR);
                            h.putLong("dialog_id", d4Var.x1);
                            i9Var2.H(new y90(h, null));
                            break;
                        }
                    default:
                        d4 d4Var2 = this.b;
                        if (!d4Var2.K1.j()) {
                            d4Var2.c1(true);
                            break;
                        } else {
                            i9Var.O();
                            if (!i9.z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            d4Var2.u0.setContentDescription(LocaleController.getString(!i9.z1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        h3Var.addView(z3Var, i7.f6.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(imageView, i7.f6.q(40, 40, 5));
        linearLayout.addView(y2Var, i7.f6.q(40, 40, 5));
        linearLayout.addView(y2Var2, i7.f6.q(40, 40, 5));
        addView(linearLayout, i7.f6.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.s0 = imageView3;
        imageView3.setImageDrawable(a4Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        h3Var.addView(imageView3, i7.f6.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.t0 = imageView4;
        imageView4.setImageDrawable(a4Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        h3Var.addView(imageView4, i7.f6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ag.o(i9Var, 26));
        imageView3.setOnClickListener(new b0(this, c6Var, i9Var, context, a4Var, 1));
        bh.d dVar2 = new bh.d(context, 4);
        this.u0 = dVar2;
        h3Var.addView(dVar2, i7.f6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        aj0 aj0Var = new aj0(context);
        this.v0 = aj0Var;
        aj0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        dVar2.addView(aj0Var);
        ImageView imageView5 = new ImageView(context);
        this.w0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(a4Var.t);
        dVar2.addView(imageView5);
        imageView5.setVisibility(8);
        n8 n8Var = new n8(context);
        this.y0 = n8Var;
        n8Var.setOnClickListener(new x1(this, 2));
        h3Var.addView(n8Var, i7.f6.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i11 = 1;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: lh.t1
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        d4 d4Var = this.b;
                        long j10 = UserConfig.getInstance(d4Var.y2).clientUserId;
                        long j11 = d4Var.x1;
                        i9 i9Var2 = i9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                i9Var2.H(tn.R9(j11));
                                break;
                            } else {
                                i9Var2.H(ProfileActivity.m4(j11));
                                break;
                            }
                        } else {
                            Bundle h = a4.w.h(1, TeXSymbolParser.TYPE_ATTR);
                            h.putLong("dialog_id", d4Var.x1);
                            i9Var2.H(new y90(h, null));
                            break;
                        }
                    default:
                        d4 d4Var2 = this.b;
                        if (!d4Var2.K1.j()) {
                            d4Var2.c1(true);
                            break;
                        } else {
                            i9Var.O();
                            if (!i9.z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            d4Var2.u0.setContentDescription(LocaleController.getString(!i9.z1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.l1 = new h8(this, a4Var);
        h3Var.addView(l3Var, i7.f6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.I0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        f2 f2Var = new f2(this, context, i9Var, i9Var.v, view, frameLayout, i9Var);
        this.H0 = f2Var;
        h3Var.addView(view, i7.f6.e(-1, 200, 87));
        h3Var.addView(f2Var, i7.f6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        h3Var.addView(frameLayout, i7.f6.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k9 = i0.a.k(-1, 100);
        dVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, 0, k9, k9));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, 0, k10, k10));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.i0(dp4, dp4, dp4, dp4, 0, k11, k11));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp5, dp5, dp5, dp5, 0, k12, k12));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        y2Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp6, dp6, dp6, dp6, 0, k13, k13));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        y2Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp7, dp7, dp7, dp7, 0, k14, k14));
        u9 u9Var = l3Var.S;
        View o10 = u9Var.o(context);
        if (o10 != null) {
            AndroidUtilities.removeFromParent(o10);
            addView(o10);
        }
        u9Var.D = new g2(this, 0);
        u9Var.T(this);
    }

    public static void V0(r6 r6Var, ImageReceiver imageReceiver, String str) {
        if (r6Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(r6Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(r6Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(d4 d4Var, ValueAnimator valueAnimator) {
        n8 n8Var = d4Var.y0;
        d4Var.Z3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z3 z3Var = d4Var.k1;
        z3Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.Z3);
        z3Var.setAlpha(1.0f - d4Var.Z3);
        ImageView imageView = d4Var.s0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.Z3);
        imageView.setAlpha(1.0f - d4Var.Z3);
        ImageView imageView2 = d4Var.t0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.Z3);
        imageView2.setAlpha(1.0f - d4Var.Z3);
        bh.d dVar = d4Var.u0;
        dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.Z3);
        dVar.setAlpha((1.0f - d4Var.Z3) * d4Var.a3);
        y2 y2Var = d4Var.S1;
        if (y2Var != null) {
            y2Var.setTranslationY(AndroidUtilities.dp(8.0f) * d4Var.Z3);
            d4Var.S1.setAlpha(1.0f - d4Var.Z3);
        }
        if (n8Var != null) {
            n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.Z3);
            n8Var.setAlpha(1.0f - d4Var.Z3);
        }
        d4Var.G0.setAlpha(1.0f - d4Var.Z3);
        x3 x3Var = d4Var.M1;
        float f9 = x3Var == null ? 0.0f : ((z8) x3Var).d.R;
        float hideInterfaceAlpha = d4Var.getHideInterfaceAlpha();
        y2 y2Var2 = d4Var.z0;
        if (y2Var2 != null) {
            y2Var2.setAlpha((1.0f - d4Var.Z3) * (1.0f - f9) * hideInterfaceAlpha);
        }
        ImageView imageView3 = d4Var.J0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - d4Var.Z3) * (1.0f - f9) * hideInterfaceAlpha);
        }
        y2 y2Var3 = d4Var.L0;
        if (y2Var3 != null) {
            y2Var3.setAlpha((1.0f - d4Var.Z3) * (1.0f - f9) * hideInterfaceAlpha);
        }
        n2 n2Var = d4Var.X1;
        if (n2Var != null) {
            n2Var.setAlpha(1.0f - d4Var.Z3);
            d4Var.invalidate();
        }
        d4Var.Y0.invalidate();
    }

    public static void a0(d4 d4Var, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = d4Var.z3;
        if (g1Var == null || d4Var.y3 == null || g1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(i9.x1 - 0.2f) < 0.05f) {
                d4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(i9.x1 - 0.5f) < 0.05f) {
                d4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(i9.x1 - 1.0f) < 0.05f) {
                d4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(i9.x1 - 1.5f) < 0.05f) {
                d4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(i9.x1 - 2.0f) < 0.05f) {
                d4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                d4Var.z3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, cf.f.a(i9.x1) + "x"));
            }
        }
        d4Var.y3.a(i9.x1, z10);
    }

    public static void b0(d4 d4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (d4Var.I0() || d4Var.K1.f) {
            return;
        }
        if (UserConfig.getInstance(d4Var.y2).isPremium()) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, d4Var.x0).setOnClickListener(new x1(d4Var, 8));
            return;
        }
        Drawable drawable = d4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        h2 h2Var = new h2(d4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, d4Var.x0);
        c3.setOnClickListener(new x1(d4Var, 9));
        c3.setIcon(h2Var);
    }

    public static void d0(d4 d4Var) {
        b4 b4Var = d4Var.K1;
        TL_stories.StoryItem storyItem = b4Var.a;
        if ((storyItem == null && b4Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = b4Var.h();
        boolean z10 = b4Var.e;
        if (h == null || !h.exists()) {
            d4Var.a1();
            return;
        }
        MediaController.saveFile(h.toString(), d4Var.getContext(), z10 ? 1 : 0, null, null, new jh.m6(1, d4Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(d4 d4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(d4Var.y2).getUser(Long.valueOf(j10));
            str = user.first_name;
            z10 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(d4Var.y2).getChat(Long.valueOf(-j10));
            str = chat2.title;
            z10 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new jh.i(d4Var, MessagesController.getInstance(d4Var.y2), j10, !z10, str, chat), 200L);
    }

    public static void f0(d4 d4Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d4Var.getContext(), 0, d4Var.x0);
        alertDialog$Builder.a.N = LocaleController.getString(d4Var.I0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.P = LocaleController.getString(d4Var.I0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new s1(d4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k3.d(26));
        z8 z8Var = (z8) d4Var.M1;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        z8Var.h(c2Var);
        c2Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f9 = 1.0f - this.K2.c;
        l5 l5Var = this.F0.w;
        return (1.0f - (l5Var == null ? 0.0f : l5Var.f)) * f9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        i9 i9Var;
        if (!this.K1.f || (i9Var = this.F0) == null || i9Var.w0 == null || D0(true)) {
            return 0L;
        }
        return i9Var.w0.j();
    }

    public static void h0(d4 d4Var) {
        org.telegram.ui.ActionBar.c6 c6Var = d4Var.x0;
        h3 h3Var = d4Var.Y0;
        if (d4Var.C1) {
            return;
        }
        int i10 = 1;
        if (!d4Var.A1) {
            n2 n2Var = d4Var.X1;
            int i11 = -d4Var.n1;
            d4Var.n1 = i11;
            AndroidUtilities.shakeViewSpring(n2Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = d4Var.x1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(d4Var.y2).getUser(Long.valueOf(d4Var.x1))) : "";
            (MessagesController.getInstance(d4Var.y2).premiumFeaturesBlocked() ? new tc(h3Var, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new tc(h3Var, c6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new v1(d4Var, 5))).j();
            return;
        }
        if (d4Var.F3 != null && d4Var.G3 != null) {
            cg.v0.C1(new cg.z1(d4Var, 4), d4Var.F3, d4Var.G3, d4Var.x1, true);
            return;
        }
        i9 i9Var = d4Var.F0;
        if (i9Var != null) {
            i9Var.g1 = true;
            i9Var.P();
        }
        MessagesController.getInstance(d4Var.y2).getBoostsController().getBoostsStats(d4Var.x1, new kg.i(d4Var, i10));
    }

    public static void j0(d4 d4Var) {
        b4 b4Var = d4Var.K1;
        if (b4Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = b4Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(d4Var.y2).getInputPeer(d4Var.x1);
        ConnectionsManager.getInstance(d4Var.y2).sendRequest(tL_stories_exportStoryLink, new w2());
    }

    public final void A0() {
        if (this.X2 != null) {
            return;
        }
        eg.r rVar = new eg.r(getContext(), 2);
        this.X2 = rVar;
        rVar.setTextSize(1, 14.0f);
        this.X2.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.X2.setGravity(19);
        this.X2.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.X2, i7.f6.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.S1 != null) {
            return;
        }
        y2 y2Var = new y2(this, getContext(), 0);
        this.S1 = y2Var;
        y2Var.setClickable(true);
        addView(this.S1, i7.f6.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        z2 z2Var = new z2(this, getContext());
        this.B2 = z2Var;
        z2Var.setOnClickListener(new x1(this, 0));
        this.S1.addView(this.B2, i7.f6.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        hh.b bVar = new hh.b(1, getContext(), false);
        this.x2 = bVar;
        bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.S1.addView(this.x2, i7.f6.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.w2 = textView;
        textView.setTextSize(1, 14.0f);
        this.w2.setTextColor(-1);
        this.S1.addView(this.w2, i7.f6.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.t1.s);
        z2 z2Var2 = this.B2;
        int dp = AndroidUtilities.dp(15.0f);
        int k9 = i0.a.k(-1, 120);
        z2Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, k9, k9));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
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
        i7.h6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.g6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, k9, k9));
        textView2.setOnClickListener(new x1(this, 3));
        linearLayout.addView(textView, i7.f6.n(-1, -2));
        linearLayout.addView(textView2, i7.f6.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, i7.f6.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
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
        c4 c4Var = this.I2;
        e5.c cVar = c4Var.d;
        if (cVar != null && c4Var.c != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(c4Var.c, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (cVar != null && (textureView = c4Var.e) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        h3 h3Var = this.Y0;
        canvas.scale(i10 / h3Var.getMeasuredWidth(), i11 / h3Var.getMeasuredHeight());
        this.a1.draw(canvas);
        canvas.restore();
    }

    public final void F0(nh.c9 c9Var, TL_stories.StoryItem storyItem) {
        x3 x3Var = this.M1;
        nh.e9 e9Var = new nh.e9(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.x0);
        e9Var.q1(c9Var);
        nh.g1 g1Var = e9Var.b;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof nh.y8) {
                    ((nh.y8) view).e(false);
                }
            }
        }
        e9Var.k1(true);
        e9Var.P = new kg.w(2, this, storyItem);
        ((z8) x3Var).h(e9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0190, code lost:
    
        if (r3 == r10.b2) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G0(ViewGroup viewGroup, float f9, float f10, boolean z10) {
        nh.t3 t3Var;
        c4 c4Var;
        e5.c cVar;
        if (viewGroup != null) {
            nh.t3 t3Var2 = this.B0;
            if ((t3Var2 == null || !t3Var2.R) && ((t3Var = this.C0) == null || !t3Var.R)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        l3 l3Var = this.G0;
                        if (childAt == l3Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f9, (int) f10)) {
                                float top = f10 - childAt.getTop();
                                z7 z7Var = l3Var.U;
                                if (z7Var.w == 1.0f && !l3Var.o0) {
                                    if (top > z7Var.getTranslationY() + (l3Var.n0.getTop() - l3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.Y0 || (c4Var = this.I2) == null || (cVar = c4Var.d) == null || !G0(cVar, f9 - childAt.getX(), f10 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f9, (int) f10))) {
                            e3 e3Var = this.f1;
                            if (childAt == e3Var && e3Var.b == null && (f9 < AndroidUtilities.dp(60.0f) || f9 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = e3Var.e;
                                float[] fArr = e3Var.f;
                                for (int i11 = 0; i11 < e3Var.getChildCount(); i11++) {
                                    View childAt2 = e3Var.getChildAt(i11);
                                    if (childAt2 != e3Var.d && (childAt2 instanceof p8)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f9;
                                        fArr[1] = f10;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                f2 f2Var = this.H0;
                                if (childAt == f2Var) {
                                    wa1 wa1Var = f2Var.f;
                                    jh.e1 e1Var = f2Var.c;
                                    wa1 wa1Var2 = f2Var.f;
                                    wa1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f9 - f2Var.getX()) - wa1Var2.getX()), (int) ((f10 - f2Var.getY()) - wa1Var2.getY()))) {
                                        if (f2Var.b0) {
                                            continue;
                                        } else if (!this.r2) {
                                            if (f10 <= f2Var.s() + f2Var.getY() && e1Var.E(f9, (f10 - f2Var.getY()) - e1Var.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.r2) {
                                        if (childAt == this.X1 && f10 > rect2.top) {
                                        }
                                    }
                                    if (!z10) {
                                        if (rect2.contains((int) f9, (int) f10)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            n2 n2Var = this.X1;
                                            if (n2Var != null && childAt == n2Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && G0((ViewGroup) childAt, f9 - childAt.getX(), f10 - childAt.getY(), z10)) {
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
        float x4 = getX();
        h3 h3Var = this.Y0;
        float x10 = view.getX() + h3Var.getX() + x4;
        float y8 = view.getY() + h3Var.getY() + getY();
        return motionEvent.getX() >= x10 && motionEvent.getX() <= x10 + ((float) view.getWidth()) && motionEvent.getY() >= y8 && motionEvent.getY() <= y8 + ((float) view.getHeight());
    }

    public final boolean I0() {
        k6 k6Var;
        i9 i9Var = this.F0;
        return (i9Var == null || (k6Var = i9Var.K0) == null || k6Var.e != 4) ? false : true;
    }

    public final boolean J0() {
        TLRPC.User user;
        return I0() && (user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.F0.K0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean K0();

    public final void L0(kg.q0 q0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        b4 b4Var = this.K1;
        TL_stories.StoryItem storyItem = b4Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && q0Var == null) {
            l0();
            this.O1.g0(this.x1, b4Var.a, null);
        } else if (q0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.y2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.l3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = kg.m0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.h3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                this.m3 = true;
                this.O1.g0(this.x1, b4Var.a, kg.q0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.O1.g0(this.x1, b4Var.a, q0Var);
        }
        TL_stories.StoryItem storyItem2 = b4Var.a;
        y2 y2Var = this.z0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.A0.setReaction(null);
            y2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.A0.setReaction(kg.q0.d(reaction));
            y2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.z1 && z11) {
            TL_stories.StoryItem storyItem3 = b4Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = b4Var.a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = b4Var.a;
        kg.s0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
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
        n2 n2Var = this.X1;
        if (n2Var == null || sendAsPeers == null) {
            return;
        }
        n2Var.P1(true);
    }

    public final boolean N0() {
        n2 n2Var = this.X1;
        if (n2Var == null) {
            return false;
        }
        boolean z10 = n2Var.u2;
        if (z10) {
            n2Var.s1();
        }
        AndroidUtilities.runOnUIThread(new v1(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j10;
        ag.i0 i0Var;
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
        ag.i0 i0Var2 = new ag.i0(this, 25);
        b bVar = new b();
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, bVar, false, false);
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
            j10 = j11;
            i0Var = i0Var2;
            i10 = ((org.telegram.ui.Components.y5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.y5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j11;
            i0Var = i0Var2;
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
        final iq[] iqVarArr = new iq[1];
        final nh.d dVar = new nh.d(context, null, true);
        final s0 s0Var = new s0();
        s0Var.c = clientUserId;
        s0Var.f = textWithEntities;
        s0Var.g = jArr[0];
        final n0 n0Var = new n0(i12, context, true);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        final bg.x2 x2Var = new bg.x2(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        g10.addView(x2Var, i7.f6.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final bg.x2 x2Var2 = new bg.x2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        g10.addView(x2Var2, i7.f6.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final bg.x2 x2Var3 = new bg.x2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        g10.addView(x2Var3, i7.f6.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final r rVar = new r(context, bVar, r6);
        final boolean[] zArr = {true};
        Utilities.Callback[] callbackArr = {new Utilities.Callback() { // from class: lh.q
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(ia.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), iqVarArr), true, true);
                long j12 = jArr2[0];
                s0 s0Var2 = s0Var;
                s0Var2.g = j12;
                n0Var.set(s0Var2);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = s.b(i16, intValue2, 0);
                int b11 = s.b(i16, num.intValue(), 1);
                int b12 = s.b(i16, num.intValue(), 2);
                ((org.telegram.ui.Components.o6) x2Var.b).c(b10 >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.o6) x2Var2.b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.o6) x2Var3.b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = s.b(i16, num.intValue(), 3);
                int b14 = s.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                rVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        n0Var.set(s0Var);
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
        if (arrayList.isEmpty() || ((Integer) j7.l1.i(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr5[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        rVar.a0 = iArr5;
        rVar.setValue((int) jArr[0]);
        linearLayout.addView(rVar, i7.f6.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(g10, i7.f6.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.g6.j5;
        TextView b10 = i7.j6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, i7.f6.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = i7.j6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        org.telegram.ui.b.p(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, i7.f6.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(n0Var, i7.f6.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, i7.f6.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        f3Var.show();
        dVar.setOnClickListener(new bg.q(i0Var, jArr, f3Var, 10));
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
        s2 s2Var = this.E2;
        s2Var.V = this.x1;
        s2Var.r1();
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
        this.F0.H(new tn(bundle));
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
        nh.y3 y3Var;
        d1 d1Var;
        boolean z10 = this.G1;
        c4 c4Var = this.I2;
        if (!z10) {
            c4Var.d = null;
            return;
        }
        b4 b4Var = this.K1;
        boolean z11 = b4Var.f;
        h3 h3Var = this.Y0;
        if (!z11) {
            if (!b4Var.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): null, not a video");
                ((z8) this.M1).c(null, null, 0L, this.I2);
                c4Var.d = null;
                c4Var.f = false;
                return;
            }
            if (b4Var.f() == null || !new File(b4Var.f()).exists()) {
                TL_stories.StoryItem storyItem = b4Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.x1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = b4Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.y2).getFileReference(b4Var.a);
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
                            sb2.append(b4Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(b4Var.a.id);
                            sb2.append("&did=");
                            sb2.append(b4Var.a.dialogId);
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
                            h3Var.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(b4Var.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from attachPath " + fromFile);
                this.N2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): playing from null?");
            }
            ((z8) this.M1).c(document, uri, j10, this.I2);
            h3Var.invalidate();
            return;
        }
        x3 x3Var = this.M1;
        TL_stories.StoryItem storyItem3 = b4Var.a;
        long j12 = this.x1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        z8 z8Var = (z8) x3Var;
        z8Var.i(true, true);
        i9 i9Var = z8Var.d;
        d1 d1Var2 = i9Var.w0;
        if (d1Var2 == null || d1Var2.b != j12 || !d1Var2.f(inputGroupCall)) {
            nh.y3 y3Var2 = i9Var.z0;
            if (y3Var2 != null) {
                y3Var2.d(j12, null);
                nh.y3 y3Var3 = i9Var.z0;
                SurfaceViewRenderer surfaceViewRenderer = y3Var3.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = y3Var3.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                y3Var3.r = false;
                y3Var3.e(false, false);
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
            c4 c4Var2 = i9Var.C0;
            if (c4Var2 != null) {
                c4Var2.b = null;
                c4Var2.a = null;
                c4Var2.f = false;
                c4Var2.d = null;
                c4Var2.e = null;
                c4Var2.c = null;
                c4Var2.a();
                i9Var.C0 = null;
            }
            if (i9Var.w0 == null) {
                d1 d1Var5 = d1.S;
                if (d1Var5 == null || !d1Var5.f(inputGroupCall)) {
                    d1 d1Var6 = new d1(z8Var.c, i9Var.h, storyItem3, j12, i10, z12, inputGroupCall, false, false);
                    j11 = j12;
                    i9Var.w0 = d1Var6;
                    y3Var = i9Var.A0;
                    if (y3Var == null) {
                        i9Var.w0.s(y3Var.getSink());
                    } else {
                        i9Var.w0.s(i9Var.z0.getSink());
                    }
                    i9Var.C0 = c4Var;
                    c4Var.f = false;
                    c4Var.d = i9Var.u0;
                    nh.y3 y3Var4 = i9Var.z0;
                    c4Var.e = y3Var4.d;
                    c4Var.c = y3Var4.c;
                    c4Var.a = i9Var.w0;
                    y3Var4.d(j11, c4Var);
                    i9Var.C0.a();
                } else {
                    i9Var.w0 = d1.S;
                }
            }
            j11 = j12;
            y3Var = i9Var.A0;
            if (y3Var == null) {
            }
            i9Var.C0 = c4Var;
            c4Var.f = false;
            c4Var.d = i9Var.u0;
            nh.y3 y3Var42 = i9Var.z0;
            c4Var.e = y3Var42.d;
            c4Var.c = y3Var42.c;
            c4Var.a = i9Var.w0;
            y3Var42.d(j11, c4Var);
            i9Var.C0.a();
        }
        h3Var.invalidate();
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
            } catch (Exception e10) {
                FileLog.e(e10);
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
            aj0 aj0Var = this.v0;
            if (z10) {
                if (this.F0.a && Build.VERSION.SDK_INT < 33) {
                    i9 i9Var = ((z8) this.M1).d;
                    i9Var.h1 = true;
                    i9Var.P();
                    ag.q1 q1Var = this.R3;
                    AndroidUtilities.cancelRunOnUIThread(q1Var);
                    AndroidUtilities.runOnUIThread(q1Var, 100L);
                }
                R0(j10);
                g1();
                aj0Var.setAnimation(this.t1.u);
                this.G1 = true;
                this.k1.a.getImageReceiver().setVisible(true, true);
                b4 b4Var = this.K1;
                if (b4Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.x1 + " storyId=" + b4Var.a.id + " " + b4.c(b4Var));
                }
            } else {
                p0();
                aj0Var.a();
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
            b4 b4Var = this.K1;
            b4Var.b = null;
            b4Var.a = null;
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
        TL_stories.PeerStories y8 = s6Var.y(j10);
        if (y8 == null) {
            y8 = s6Var.z(j10);
        } else {
            z10 = false;
        }
        s6Var.S(y8, z10);
    }

    public final void W0(long j10, boolean z10, boolean z11) {
        if (!z10 && j10 == this.I3 && this.J3 == z11) {
            return;
        }
        this.I3 = j10;
        this.J3 = z11;
        z3 z3Var = this.k1;
        if (j10 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-j10));
            gg.c cVar = z3Var.b;
            gg.c cVar2 = z3Var.b;
            cVar.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                cVar2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            jq jqVar = new jq(mutate, null);
            jqVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            jqVar.h = dp;
            jqVar.n = dp2;
            cVar2.i(jqVar);
            return;
        }
        if (this.y1 && !z11) {
            z3Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            z3Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(j10));
        if (user == null || !user.verified) {
            z3Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            jq jqVar2 = new jq(mutate2, null);
            jqVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            jqVar2.h = dp3;
            jqVar2.n = dp4;
            z3Var.b.i(jqVar2);
        }
        if (user != null) {
            z3Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), z3Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            z3Var.b.l(null, false);
        }
    }

    public final void X0(float f9, float f10, h4 h4Var) {
        this.i1 = f9;
        this.w3 = 1.0f / f10;
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
        b4 b4Var = this.K1;
        if (b4Var.a != null) {
            i9 i9Var = this.F0;
            if (i9Var.f != null) {
                String e10 = b4Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e10);
                    LaunchActivity.C1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                v2 v2Var = new v2(this, i9Var.f.getContext(), e10, e10, MessagesController.getInstance(this.y2).storiesEnabled() && (!(this.z1 || UserObject.isService(this.x1)) || ChatObject.isPublic(this.z1 ? MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1)) : null)), new l2(2, this.x0));
                this.V2 = v2Var;
                v2Var.e0 = true;
                TL_stories.StoryItem storyItem = b4Var.a;
                storyItem.dialogId = this.x1;
                v2Var.B0 = storyItem;
                v2Var.o0 = new za.c(this, 24);
                ((z8) this.M1).h(v2Var);
            }
        }
    }

    public final void Z0() {
        h3 h3Var = this.Y0;
        org.telegram.ui.ActionBar.c6 c6Var = this.x0;
        org.telegram.messenger.x3.s(R.string.UnsupportedAttachment, new tc(h3Var, c6Var), c6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.x0);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.P = string;
        ((z8) this.M1).h(c2Var);
    }

    public final void b1(boolean z10) {
        if (this.o3 != z10) {
            b4 b4Var = this.K1;
            if (b4Var.a == null) {
                return;
            }
            this.o3 = z10;
            int i10 = 0;
            if (z10) {
                this.n3.setVisibility(0);
            }
            this.n3.setStoryItem(b4Var.a);
            i9 i9Var = ((z8) this.M1).d;
            i9Var.l1 = z10;
            i9Var.P();
            if (!z10) {
                if (this.n3.getReactionsWindow() != null) {
                    this.n3.getReactionsWindow().e();
                }
                this.n3.animate().alpha(0.0f).setDuration(150L).setListener(new j2(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p3, z10 ? 1.0f : 0.0f);
            this.n3.setTransitionProgress(this.p3);
            ofFloat.addUpdateListener(new w1(this, 1));
            ofFloat.addListener(new i2(this, z10, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(jr.g);
            ofFloat.start();
        }
    }

    public final void c1(boolean z10) {
        if (this.C0 == null) {
            nh.t3 t3Var = new nh.t3(getContext(), 1);
            t3Var.m(1.0f, -56.0f);
            this.C0 = t3Var;
            t3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.Y0.addView(this.C0, i7.f6.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
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
            x3 x3Var = this.M1;
            if (x3Var == null || !((z8) x3Var).d.D0) {
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
                        TL_stories.PeerStories y8 = s6Var.y(j10);
                        if (y8 == null) {
                            y8 = s6Var.z(j10);
                            z10 = true;
                        }
                        s6Var.S(y8, z10);
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.o1;
                if (g1Var != null) {
                    g1Var.animate().alpha((this.O1.K(this.x1) && this.K1.e && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
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
            m6 o10 = MessagesController.getInstance(this.y2).getStoriesController().o();
            if (o10 == null || !o10.a(this.y2, 1) || this.M1 == null) {
                return;
            }
            cg.z1 z1Var = new cg.z1(this, 4);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            ((z8) this.M1).h(new cg.v0(o10.b(), this.y2, findActivity, z1Var, null));
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
        n2 n2Var = this.X1;
        if (n2Var != null) {
            n2Var.J(true);
            this.X1.P1(true);
            r0(true);
        }
        f2 f2Var = this.H0;
        if (f2Var != null) {
            d1 d1Var2 = f2Var.L;
            if (f2Var.D != (d1Var2 != null ? d1Var2.j() : 0L)) {
                f2Var.e.N(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        de deVar;
        Canvas canvas2;
        org.telegram.ui.Components.n6 n6Var;
        org.telegram.ui.Components.n6 n6Var2;
        l1();
        if (this.z1 && (n6Var2 = this.M0) != null) {
            n6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.z1 && (n6Var = this.N0) != null) {
            n6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.q3;
        LinearLayout linearLayout = this.K0;
        y2 y2Var = this.z0;
        if (z10) {
            float measuredWidth = (y2Var.getMeasuredWidth() / 2.0f) + y2Var.getX() + linearLayout.getX();
            float measuredHeight = (y2Var.getMeasuredHeight() / 2.0f) + y2Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f9 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.s3, measuredWidth - f9, jr.g.getInterpolation(this.r3));
            float lerp2 = AndroidUtilities.lerp(this.t3, measuredHeight - f9, this.r3);
            int lerp3 = AndroidUtilities.lerp(this.u3, dp, this.r3);
            if (this.l3) {
                org.telegram.ui.Components.p5 p5Var = this.k3;
                if (p5Var != null) {
                    float f10 = lerp3;
                    p5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.k3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.j3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.m3) {
            float measuredWidth2 = (y2Var.getMeasuredWidth() / 2.0f) + y2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (y2Var.getMeasuredHeight() / 2.0f) + y2Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (this.l3) {
                kg.d dVar = this.i3;
                if (dVar != null) {
                    float f12 = dp2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f12), (int) (measuredHeight2 - f12), (int) (measuredWidth2 + f12), (int) (measuredHeight2 + f12));
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
                float f13 = dp2;
                float f14 = f13 / 2.0f;
                float f15 = measuredWidth2 - f14;
                float f16 = measuredHeight2 - f14;
                ImageReceiver imageReceiver2 = this.h3;
                imageReceiver2.setImageCoords(f15, f16, f13, f13);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().y()) {
                    this.m3 = false;
                }
            }
        }
        n2 n2Var = this.X1;
        if (n2Var != null) {
            fe feVar = n2Var.t1;
            de deVar2 = n2Var.u1;
            if (n2Var.getAlpha() == 0.0f || (deVar = n2Var.a1) == null || deVar.getParent() == null || n2Var.a1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(n2Var.a1.getX() + feVar.getX() + deVar2.getX() + n2Var.getX(), n2Var.a1.getY() + feVar.getY() + deVar2.getY() + n2Var.getY());
            if (n2Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight(), (int) (n2Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            n2Var.a1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        qg.d dVar;
        float dp;
        if (view == this.Z2) {
            canvas.save();
            canvas.clipRect(0.0f, this.Z2.getY(), getMeasuredWidth(), this.Z2.getY() + this.Z2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        n2 n2Var = this.X1;
        Paint paint = this.j2;
        y2 y2Var = this.z0;
        a4 a4Var = this.t1;
        if (view == n2Var) {
            float f9 = this.m2;
            b4 b4Var = this.K1;
            if (f9 > 0.0f && !b4Var.f) {
                a4Var.l.setAlpha((int) (f9 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), a4Var.l);
            }
            RectF rectF = a4Var.h;
            RectF rectF2 = a4Var.i;
            RectF rectF3 = a4Var.j;
            rectF.set(this.X1.getX(), this.X1.getY() + this.X1.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.X1.getX() + this.X1.getMeasuredWidth(), this.X1.getY() + this.X1.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (b4Var.f) {
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
                if (y2Var != null && y2Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + y2Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.X1.setTranslationX((1.0f - this.m2) * dp);
            this.X1.getEditField().setTranslationY(com.google.android.recaptcha.internal.a.z(1.0f, this.m2, -AndroidUtilities.dp(2.0f), this.X1.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.m2) * (this.X1.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, a4Var.h, this.m2, rectF3);
            ng.d dVar2 = this.h2;
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
            if (n2Var != null && n2Var.u0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = a4Var.k;
                RectF rectF5 = a4Var.k;
                rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.W3;
                path.rewind();
                path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                ng.d dVar3 = this.i2;
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
                    view.setTranslationY((this.K0.getY() + (y2Var.getY() + (-(r2.getMeasuredHeight() - this.n3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    h3 h3Var = this.Y0;
                    if (view == h3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.D3) != null && !dVar.n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(h3Var.getX(), h3Var.getY());
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
            v2 v2Var = this.V2;
            if (v2Var != null) {
                v2Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new v1(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0949, code lost:
    
        if (r15.g == (r2 == null && r2.translated && r2.translatedText != null && android.text.TextUtils.equals(r2.translatedLng, org.telegram.ui.Components.k31.B()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x09a9, code lost:
    
        if (r3 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x09ce, code lost:
    
        if (r3 != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0ae2, code lost:
    
        if (r4 != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0afb, code lost:
    
        if (r4 != false) goto L557;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0c24  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0ce0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0cfb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0d22  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d72  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0d89  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0db2 A[EDGE_INSN: B:311:0x0db2->B:312:0x0db2 BREAK  A[LOOP:0: B:300:0x0d90->B:309:0x0daf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0e26  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0e63  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0e72  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0e92  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0f2c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0f5d  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0f6c  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0f92  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0fb3  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0fff  */
    /* JADX WARN: Removed duplicated region for block: B:406:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0fd2  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0edc  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0e6c  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e36  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0e1d  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0d30  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0d49  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0917  */
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
    /* JADX WARN: Type inference failed for: r6v73, types: [lh.v7, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z10) {
        r6 r6Var;
        TL_stories.StoryItem storyItem;
        r6 r6Var2;
        boolean z11;
        boolean z12;
        int i10;
        ry ryVar;
        TL_stories.StoryItem storyItem2;
        x2 x2Var;
        boolean z13;
        f9 f9Var;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        i9 i9Var;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem4;
        boolean z14;
        boolean z15;
        TL_stories.StoryItem storyItem5;
        i9 i9Var2;
        r6 r6Var3;
        TLRPC.MessageMedia messageMedia;
        nh.o7 o7Var;
        TL_stories.StoryItem storyItem6;
        r6 r6Var4;
        int i11;
        nh.o7 o7Var2;
        boolean z16;
        h3 h3Var;
        l3 l3Var;
        z3 z3Var;
        n2 n2Var;
        boolean z17;
        r6 r6Var5;
        mc mcVar;
        boolean z18;
        TL_stories.StoryItem storyItem7;
        x2 x2Var2;
        boolean z19;
        r6 r6Var6;
        b4 b4Var;
        boolean z20;
        boolean z21;
        h3 h3Var2;
        l3 l3Var2;
        boolean z22;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        CharSequence charSequence2;
        TLRPC.MessageMedia messageMedia2;
        boolean z23;
        nh.t3 t3Var;
        nh.t3 t3Var2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence4;
        TL_stories.StoryItem storyItem10;
        x3 x3Var;
        boolean z24;
        boolean z25;
        LinearLayout linearLayout;
        boolean z26;
        boolean z27;
        n2 n2Var2;
        n2 n2Var3;
        int i13;
        boolean z28;
        boolean z29;
        boolean z30;
        int i14;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        ug.g gVar;
        a aVar;
        n1 n1Var;
        boolean z35;
        TL_stories.StoryItem storyItem11;
        boolean z36;
        int i15;
        int i16;
        boolean z37;
        boolean z38;
        boolean l10;
        r6 r6Var7;
        r6 r6Var8;
        nh.t3 t3Var3;
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
        d1 d1Var;
        int i25;
        boolean z47;
        int i26;
        boolean z48;
        int i27;
        boolean z49;
        boolean z50;
        boolean z51;
        boolean z52;
        d1 d1Var2;
        String str;
        BitmapDrawable bitmapDrawable;
        x2 x2Var3;
        boolean z53;
        i9 i9Var3;
        ry ryVar2;
        ?? r6;
        TLRPC.MessageMedia messageMedia3;
        k6 k6Var;
        ArrayList arrayList2 = this.r1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.s1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.R2 = true;
        b4 b4Var2 = this.K1;
        TL_stories.StoryItem storyItem14 = b4Var2.a;
        r6 r6Var9 = b4Var2.b;
        String s10 = l7.s();
        this.V0 = false;
        this.Y2 = false;
        int i28 = this.F1;
        boolean z54 = this.P1;
        boolean z55 = this.Q1;
        boolean z56 = this.R1;
        i9 i9Var4 = this.F0;
        if (i9Var4 == null || (k6Var = i9Var4.K0) == null || k6Var.e != 4) {
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
        b4Var2.c = null;
        e3 e3Var = this.f1;
        int i29 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        ry ryVar3 = this.g1;
        x2 x2Var4 = this.a1;
        if (r6Var != null) {
            nh.o7 o7Var3 = r6Var.c;
            this.Q1 = false;
            boolean z57 = r6Var.E;
            this.R1 = z57;
            this.P1 = !z57;
            x2Var4.setCrossfadeWithOldImage(false);
            x2Var4.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = o7Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (r6Var.s || r6Var.D) {
                r6Var2 = r6Var9;
                x2Var3 = x2Var4;
                z11 = z54;
                z53 = z55;
                z12 = z56;
                i9Var3 = i9Var4;
                i10 = i28;
                ryVar2 = ryVar3;
                r6 = 0;
                this.a1.setImage(null, null, ImageLocation.getForPath(r6Var.f), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                r6Var2 = r6Var9;
                ryVar2 = ryVar3;
                r6 = 0;
                x2Var3 = x2Var4;
                z11 = z54;
                z12 = z56;
                z53 = z55;
                i9Var3 = i9Var4;
                i10 = i28;
                this.a1.setImage(null, null, ImageLocation.getForPath(r6Var.e), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            b4Var2.b = r6Var;
            b4Var2.j = r6;
            b4Var2.i = r6;
            b4Var2.a = r6;
            b4Var2.d = false;
            b4Var2.e = b4Var2.m();
            TL_stories.StoryItem storyItem17 = b4Var2.a;
            b4Var2.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            ryVar = ryVar2;
            e3Var.c(r6, m8.a(o7Var3), ryVar);
            this.Q2 = false;
            this.P2 = false;
            this.O2 = false;
            storyItem2 = storyItem14;
            z13 = z53;
            x2Var = x2Var3;
            i9Var = i9Var3;
        } else {
            r6Var2 = r6Var9;
            z11 = z54;
            z12 = z56;
            i10 = i28;
            ryVar = ryVar3;
            this.P1 = false;
            this.Q1 = false;
            this.R1 = false;
            if (storyItem == null) {
                if (i9Var4 != null) {
                    i9Var4.q(true);
                    return;
                }
                return;
            }
            r6 t10 = this.O1.t(this.x1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.Q1 = true;
                x2Var4.setCrossfadeWithOldImage(false);
                if (this.e1 != null) {
                    i29 = 0;
                }
                x2Var4.setCrossfadeDuration(i29);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    r6Var3 = t10;
                    x2Var = x2Var4;
                    i9Var2 = i9Var4;
                    this.a1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    i9Var2 = i9Var4;
                    x2Var = x2Var4;
                    r6Var3 = t10;
                    this.a1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                }
                b4Var2.b = r6Var3;
                b4Var2.j = null;
                b4Var2.i = null;
                b4Var2.a = null;
                b4Var2.d = false;
                b4Var2.e = b4Var2.m();
                TL_stories.StoryItem storyItem18 = b4Var2.a;
                b4Var2.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                e3Var.c(null, m8.a(r6Var3.c), ryVar);
                b4Var2.c = storyItem;
                this.Q2 = false;
                this.P2 = false;
                this.O2 = false;
                z13 = z55;
                i9Var = i9Var2;
            } else {
                storyItem2 = storyItem14;
                x2Var = x2Var4;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.x1;
                z13 = z55;
                x2Var.setCrossfadeWithOldImage(z13);
                x2Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.Y2 = true;
                    MessagesController.getInstance(this.y2).getStoriesController().p(storyItem.id, this.x1);
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
                                    this.a1.setImage(null, null, ImageLocation.getForPath(storyItem.firstFramePath), s10, null, null, createStripedBitmap, 0L, null, null, 0);
                                }
                            }
                            this.a1.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), u3.c.k(s10, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
                        } else {
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            Drawable createStripedBitmap2 = photo != null ? ImageLoader.createStripedBitmap(photo.sizes) : null;
                            if (z13) {
                                this.a1.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, ImageLocation.getForPath(storyItem.firstFramePath), s10, createStripedBitmap2, 0L, null, null, 0);
                            } else {
                                this.a1.setImage(ImageLocation.getForPath(storyItem.attachPath), s10, null, null, createStripedBitmap2, 0L, null, null, 0);
                            }
                        }
                    } else {
                        Drawable drawable = ((i9Var4.K0 != null || i9Var4.J0) && (f9Var = i9Var4.o0) != null && (imageReceiver = f9Var.c) != null && f9Var.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.x1;
                        if (z58) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String k9 = u3.c.k(s10, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            storyItem4 = storyItem;
                            i9Var = i9Var4;
                            this.a1.setImage(null, null, forDocument, k9, forDocument2, s10, drawable, 0L, null, storyItem4, 0);
                        } else {
                            storyItem3 = storyItem;
                            i9Var = i9Var4;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                x2Var.clearImage();
                                storyItem3.dialogId = this.x1;
                                e3Var.d(z10 ? null : storyItem3, ryVar);
                                b4Var2.n(storyItem3);
                                z14 = (!this.Y2 || (storyItem5 = b4Var2.a) == null || (storyItem5 instanceof TL_stories.TL_storyItemDeleted) || (storyItem5 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                                this.Q2 = z14;
                                this.O2 = z14;
                                if (z14) {
                                    this.O2 = b4Var2.d() && b4Var2.a.isPublic;
                                }
                                if (this.O2) {
                                    TL_stories.StoryItem storyItem19 = b4Var2.a;
                                    this.O2 = storyItem19.pinned || !l7.w(this.y2, storyItem19);
                                }
                                z15 = this.O2;
                                this.P2 = z15;
                                if (z15 && this.z1) {
                                    TLRPC.Chat chat = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
                                    this.P2 = chat == null && ChatObject.isPublic(chat);
                                }
                                if (this.Q2) {
                                    if (this.z1) {
                                        TLRPC.Chat chat2 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
                                        this.Q2 = (chat2 == null || ChatObject.getPublicUsername(chat2) == null) ? false : true;
                                    } else {
                                        TLRPC.User user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.x1));
                                        this.Q2 = (user == null || UserObject.getPublicUsername(user) == null || !b4Var2.a.isPublic) ? false : true;
                                    }
                                }
                                NotificationsController.getInstance(this.y2).processReadStories(this.x1, storyItem3.id);
                            } else {
                                if (drawable == null) {
                                    drawable = ImageLoader.createStripedBitmap(arrayList);
                                }
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 800);
                                storyItem4 = storyItem3;
                                this.a1.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2), s10, null, null, drawable, 0L, null, storyItem4, 0);
                            }
                        }
                        storyItem3 = storyItem4;
                        storyItem3.dialogId = this.x1;
                        e3Var.d(z10 ? null : storyItem3, ryVar);
                        b4Var2.n(storyItem3);
                        if (!this.Y2) {
                        }
                        this.Q2 = z14;
                        this.O2 = z14;
                        if (z14) {
                        }
                        if (this.O2) {
                        }
                        z15 = this.O2;
                        this.P2 = z15;
                        if (z15) {
                            TLRPC.Chat chat3 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
                            this.P2 = chat3 == null && ChatObject.isPublic(chat3);
                        }
                        if (this.Q2) {
                        }
                        NotificationsController.getInstance(this.y2).processReadStories(this.x1, storyItem3.id);
                    }
                }
                storyItem3 = storyItem;
                i9Var = i9Var4;
                storyItem3.dialogId = this.x1;
                e3Var.d(z10 ? null : storyItem3, ryVar);
                b4Var2.n(storyItem3);
                if (!this.Y2) {
                }
                this.Q2 = z14;
                this.O2 = z14;
                if (z14) {
                }
                if (this.O2) {
                }
                z15 = this.O2;
                this.P2 = z15;
                if (z15) {
                }
                if (this.Q2) {
                }
                NotificationsController.getInstance(this.y2).processReadStories(this.x1, storyItem3.id);
            }
        }
        TL_stories.StoryItem storyItem20 = b4Var2.a;
        if (storyItem20 != null && !z10) {
            i9Var.L0 = storyItem20.id;
        }
        i9Var.j0.A();
        this.U2 = true;
        if (this.y1 || this.z1) {
            k1(false);
        }
        TL_stories.StoryItem storyItem21 = b4Var2.a;
        r6 r6Var10 = b4Var2.b;
        int i30 = storyItem21 != null ? storyItem21.id : (r6Var10 == null || (o7Var = r6Var10.c) == null) ? 0 : o7Var.f;
        if (storyItem2 != null) {
            storyItem6 = storyItem2;
            i11 = storyItem6.id;
            r6Var4 = r6Var2;
        } else {
            storyItem6 = storyItem2;
            r6Var4 = r6Var2;
            i11 = (r6Var2 == null || (o7Var2 = r6Var4.c) == null) ? 0 : o7Var2.f;
        }
        boolean z59 = i30 == i11 || !(r6Var4 == null || storyItem21 == null || !TextUtils.equals(r6Var4.e, storyItem21.attachPath));
        boolean z60 = z59 && !(this.Q1 == z13 && this.P1 == z11 && this.R1 == z12);
        d1 d1Var3 = i9Var.w0;
        if (d1Var3 != null) {
            int i31 = this.M3;
            TLRPC.GroupCall groupCall = d1Var3.v;
            if (i31 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                z16 = true;
                h3Var = this.Y0;
                l3Var = this.G0;
                z3Var = this.k1;
                if ((r6Var4 != null || (str = r6Var4.e) == null || !str.equals(b4Var2.f())) && (storyItem6 == null || (storyItem7 = b4Var2.a) == null || storyItem6.id != storyItem7.id)) {
                    n2Var = this.X1;
                    if (n2Var != null) {
                        if (storyItem6 != null && !TextUtils.isEmpty(n2Var.getEditField().getText())) {
                            i9.J(storyItem6.dialogId, storyItem6, this.X1.getEditField().getText());
                        }
                        this.X1.getEditField().setText(i9.u(this.x1, b4Var2.a));
                        z18 = b4Var2.f;
                        if (z18) {
                            this.X1.U0(false, false);
                        } else {
                            this.X1.U0(true, true);
                        }
                    }
                    z17 = b4Var2.f;
                    if (z17) {
                        M0();
                    }
                    ryVar.c();
                    this.S0 = 0L;
                    this.U0 = false;
                    r6Var5 = b4Var2.b;
                    if (r6Var5 == null) {
                        bj0 bj0Var = z3Var.d;
                        if (bj0Var != null) {
                            bj0Var.e(r6Var5.h, false);
                        }
                        z3Var.a.invalidate();
                    } else if (!z60) {
                        z3Var.h = 0.0f;
                    }
                    mcVar = mc.w;
                    if (mcVar != null && mcVar.h == h3Var) {
                        mcVar.b();
                    }
                    l3Var.J();
                    q0();
                    z16 = true;
                }
                if (!z16 || (r6Var4 != null && b4Var2.b == null)) {
                    z3Var.setOnSubtitleClick(null);
                    TextView[] textViewArr = z3Var.c;
                    this.M3 = 0;
                    boolean z61 = z60;
                    long j10 = this.x1;
                    x2Var2 = x2Var;
                    z19 = b4Var2.f;
                    W0(j10, false, z19);
                    r6Var6 = b4Var2.b;
                    if (r6Var6 == null) {
                        b4Var = b4Var2;
                        charSequence2 = r6Var6.E ? LocaleController.getString(R.string.FailedToUploadStory) : l7.u(textViewArr[0], this.Q1);
                    } else if (I0()) {
                        TL_stories.StoryItem storyItem22 = b4Var2.a;
                        if (storyItem22 == null || (messageMedia2 = storyItem22.media) == null) {
                            b4Var = b4Var2;
                        } else {
                            if (messageMedia2.document != null) {
                                b4Var = b4Var2;
                                charSequence2 = LocaleController.formatStoryDate(r13.date);
                            } else {
                                b4Var = b4Var2;
                                if (messageMedia2.photo != null) {
                                    charSequence2 = LocaleController.formatStoryDate(r2.date);
                                }
                            }
                        }
                        charSequence2 = "";
                    } else {
                        b4Var = b4Var2;
                        TL_stories.StoryItem storyItem23 = b4Var.a;
                        if (storyItem23 == null) {
                            z20 = z16;
                            z21 = z59;
                            h3Var2 = h3Var;
                            l3Var2 = l3Var;
                            z22 = z61;
                            charSequence = null;
                        } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                            spannableStringBuilder2.setSpan(new a3(), 0, spannableStringBuilder2.length(), 33);
                            spannableStringBuilder2.append((CharSequence) "  ");
                            d1 d1Var4 = i9Var.w0;
                            if (d1Var4 != null) {
                                TLRPC.GroupCall groupCall2 = d1Var4.v;
                                i12 = 1;
                                this.M3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                            } else {
                                i12 = 1;
                            }
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i12, this.M3)));
                            charSequence2 = spannableStringBuilder2;
                        } else if (storyItem23.date == -1) {
                            charSequence2 = LocaleController.getString(R.string.CachedStory);
                        } else {
                            if (b4Var.i() != null) {
                                v7 i32 = b4Var.i();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                z20 = z16;
                                z21 = z59;
                                SpannableString spannableString = new SpannableString("r");
                                h3Var2 = h3Var;
                                l3Var2 = l3Var;
                                spannableString.setSpan(new iq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                spannableStringBuilder3.append((CharSequence) spannableString).append((CharSequence) " ");
                                if (i32.b != null) {
                                    org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.y2);
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(g5Var, 0, 1, 33);
                                    spannableStringBuilder3.append((CharSequence) spannableString2).append((CharSequence) " ");
                                    if (i32.b.longValue() > 0) {
                                        TLRPC.User user2 = MessagesController.getInstance(this.y2).getUser(i32.b);
                                        g5Var.e(user2);
                                        spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user2));
                                    } else {
                                        TLRPC.Chat chat4 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-i32.b.longValue()));
                                        g5Var.b(chat4);
                                        if (chat4 != null) {
                                            spannableStringBuilder3.append((CharSequence) chat4.title);
                                        }
                                    }
                                } else {
                                    String str4 = b4Var.a.fwd_from.from_name;
                                    if (str4 != null) {
                                        spannableStringBuilder3.append((CharSequence) str4);
                                    }
                                }
                                z3Var.setOnSubtitleClick(new ag.n(26, this, i32));
                                SpannableString spannableString3 = new SpannableString(".");
                                vs vsVar = new vs();
                                vsVar.b = AndroidUtilities.dp(1.5f);
                                vsVar.c = 5.0f;
                                spannableString3.setSpan(vsVar, 0, spannableString3.length(), 33);
                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(b4Var.a.date));
                                spannableStringBuilder = spannableStringBuilder3;
                            } else {
                                z20 = z16;
                                z21 = z59;
                                h3Var2 = h3Var;
                                l3Var2 = l3Var;
                                if (!this.A1 || (storyItem8 = b4Var.a) == null || storyItem8.from_id == null) {
                                    String formatStoryDate = LocaleController.formatStoryDate(b4Var.a.date);
                                    charSequence4 = formatStoryDate;
                                    if (b4Var.a.edited) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                        vs vsVar2 = new vs();
                                        vsVar2.b = AndroidUtilities.dp(1.5f);
                                        vsVar2.c = 5.0f;
                                        valueOf.append((CharSequence) " . ").setSpan(vsVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                        valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                        charSequence4 = valueOf;
                                    }
                                    z22 = z61;
                                    charSequence = charSequence4;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                    org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.y2);
                                    SpannableString spannableString4 = new SpannableString("a");
                                    spannableString4.setSpan(g5Var2, 0, 1, 33);
                                    spannableStringBuilder4.append((CharSequence) spannableString4).append((CharSequence) " ");
                                    long peerDialogId = DialogObject.getPeerDialogId(b4Var.a.from_id);
                                    if (peerDialogId > 0) {
                                        TLRPC.User user3 = MessagesController.getInstance(this.y2).getUser(Long.valueOf(peerDialogId));
                                        g5Var2.e(user3);
                                        spannableStringBuilder4.append((CharSequence) UserObject.getUserName(user3));
                                    } else {
                                        TLRPC.Chat chat5 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-peerDialogId));
                                        g5Var2.b(chat5);
                                        if (chat5 != null) {
                                            spannableStringBuilder4.append((CharSequence) chat5.title);
                                        }
                                    }
                                    z3Var.setOnSubtitleClick(new bh.s(this, peerDialogId, 3));
                                    SpannableString spannableString5 = new SpannableString(".");
                                    vs vsVar3 = new vs();
                                    vsVar3.b = AndroidUtilities.dp(1.5f);
                                    vsVar3.c = 5.0f;
                                    spannableString5.setSpan(vsVar3, 0, spannableString5.length(), 33);
                                    spannableStringBuilder4.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(b4Var.a.date));
                                    spannableStringBuilder = spannableStringBuilder4;
                                }
                            }
                            z22 = false;
                            charSequence = spannableStringBuilder;
                        }
                        if (charSequence != null) {
                            k6 k6Var2 = i9Var.K0;
                            if (k6Var2 == null || (storyItem9 = b4Var.a) == null || !k6Var2.m(storyItem9.id)) {
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
                                spannableString6.setSpan(new iq(R.drawable.msg_pin_mini), 0, 1, 33);
                                ((SpannableStringBuilder) charSequence5).insert(0, (CharSequence) spannableString6);
                                charSequence3 = charSequence5;
                            }
                            z3Var.c(charSequence3, z22);
                        } else {
                            z23 = false;
                        }
                        t3Var = this.B0;
                        if (t3Var != null) {
                            t3Var.e(z23);
                        }
                        t3Var2 = this.C0;
                        if (t3Var2 != null) {
                            t3Var2.e(z23);
                        }
                    }
                    z20 = z16;
                    z21 = z59;
                    h3Var2 = h3Var;
                    l3Var2 = l3Var;
                    charSequence4 = charSequence2;
                    z22 = z61;
                    charSequence = charSequence4;
                    if (charSequence != null) {
                    }
                    t3Var = this.B0;
                    if (t3Var != null) {
                    }
                    t3Var2 = this.C0;
                    if (t3Var2 != null) {
                    }
                } else {
                    b4Var = b4Var2;
                    x2Var2 = x2Var;
                    z20 = z16;
                    z21 = z59;
                    h3Var2 = h3Var;
                    l3Var2 = l3Var;
                }
                storyItem10 = b4Var.a;
                if (storyItem6 == storyItem10 && r6Var4 == b4Var.b) {
                }
                b4Var.o();
                if ((!b4Var.g || storyItem6 != b4Var.a) && (x3Var = this.M1) != null) {
                    i9 i9Var5 = ((z8) x3Var).d;
                    i9Var5.V0 = false;
                    i9Var5.P();
                }
                z24 = b4Var.f;
                z25 = !z24 && (d1Var2 = i9Var.w0) != null && b4Var.k(d1Var2.g()) && i9Var.w0.b();
                if (z25 != this.C1) {
                    this.C1 = z25;
                    if (z25) {
                        z0();
                    }
                    if (this.c2 != null && (this.B1 || this.C1)) {
                        h1();
                    }
                    n2 n2Var4 = this.X1;
                    if (n2Var4 != null) {
                        if (this.B1) {
                            z52 = b4Var.f;
                        }
                        if (!this.C1) {
                            z51 = true;
                            n2Var4.setEnabled(z51);
                            z50 = true;
                            this.X1.P1(true);
                        }
                        z51 = false;
                        n2Var4.setEnabled(z51);
                        z50 = true;
                        this.X1.P1(true);
                    } else {
                        z50 = true;
                    }
                    r0(z50);
                }
                linearLayout = this.c2;
                int i33 = 8;
                if (linearLayout != null) {
                    if (this.B1) {
                        z49 = b4Var.f;
                    }
                    if (!this.C1) {
                        i27 = 8;
                        linearLayout.setVisibility(i27);
                    }
                    i27 = 0;
                    linearLayout.setVisibility(i27);
                }
                z26 = this.Y2;
                LinearLayout linearLayout2 = this.K0;
                if (z26) {
                    TLRPC.Chat chat6 = this.x1 < 0 ? MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1)) : null;
                    z27 = b4Var.f;
                    if (z27) {
                        if (this.X1 == null) {
                            v0();
                        }
                        u0();
                        y0();
                        x0();
                        this.X1.setVisibility(0);
                    } else if ((UserObject.isService(this.x1) || I0()) && (n2Var2 = this.X1) != null) {
                        n2Var2.setVisibility(8);
                    } else if (!this.y1 && ((!this.z1 || (this.A1 && (ChatObject.canSendPlain(chat6) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat6)))) && (n2Var3 = this.X1) != null)) {
                        n2Var3.setVisibility(0);
                    }
                    n2 n2Var5 = this.X1;
                    if (n2Var5 != null) {
                        z32 = b4Var.f;
                        n2Var5.setOnSendButtonLongClick(z32 ? new u1(this, 0) : null);
                        n2 n2Var6 = this.X1;
                        z33 = b4Var.f;
                        D0(true);
                        n2Var6.i1(z33);
                        n2 n2Var7 = this.X1;
                        z34 = b4Var.f;
                        n2Var7.o1(z34 && !D0(true) && (this.r2 || this.X1.S0), true);
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
                            z31 = b4Var.f;
                        }
                        if (!this.C1) {
                            i14 = 8;
                            linearLayout3.setVisibility(i14);
                        }
                        i14 = 0;
                        linearLayout3.setVisibility(i14);
                    }
                    n2 n2Var8 = this.X1;
                    if (n2Var8 != null) {
                        if (this.B1) {
                            z30 = b4Var.f;
                        }
                        if (!this.C1) {
                            z29 = true;
                            n2Var8.setEnabled(z29);
                        }
                        z29 = false;
                        n2Var8.setEnabled(z29);
                    }
                    y2 y2Var = this.S1;
                    if (y2Var != null) {
                        if (this.y1) {
                            z28 = b4Var.f;
                            if (!z28) {
                                i13 = 0;
                                y2Var.setVisibility(i13);
                            }
                        }
                        i13 = 8;
                        y2Var.setVisibility(i13);
                    }
                    FrameLayout frameLayout = this.W2;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (UserObject.isService(this.x1)) {
                        A0();
                        this.X2.setVisibility(0);
                    } else {
                        eg.r rVar = this.X2;
                        if (rVar != null) {
                            rVar.setVisibility(8);
                        }
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(I0() ? 8 : 0);
                    }
                } else {
                    C0();
                    A0();
                    this.W2.setVisibility(0);
                    this.X2.setVisibility(0);
                    this.Q2 = false;
                    this.P2 = false;
                    this.O2 = false;
                    n2 n2Var9 = this.X1;
                    if (n2Var9 != null) {
                        n2Var9.setVisibility(8);
                    }
                    y2 y2Var2 = this.S1;
                    if (y2Var2 != null) {
                        y2Var2.setVisibility(8);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                }
                gVar = this.Y1;
                if (gVar != null) {
                    n2 n2Var10 = this.X1;
                    if (n2Var10 != null && n2Var10.getVisibility() == 0) {
                        z48 = b4Var.f;
                        if (!z48) {
                            i26 = 0;
                            gVar.setVisibility(i26);
                        }
                    }
                    i26 = 8;
                    gVar.setVisibility(i26);
                }
                aVar = this.T1;
                f2 f2Var = this.H0;
                if (aVar != null) {
                    if (!this.Y2) {
                        z47 = b4Var.f;
                        if (z47) {
                            i25 = 0;
                            aVar.setVisibility(i25);
                            this.T1.a(f2Var.g(), false);
                            this.T1.setCount(f2Var.getUnreadMessagesCount());
                        }
                    }
                    i25 = 8;
                    aVar.setVisibility(i25);
                    this.T1.a(f2Var.g(), false);
                    this.T1.setCount(f2Var.getUnreadMessagesCount());
                }
                n1Var = this.W1;
                if (n1Var != null) {
                    if (!this.Y2) {
                        z46 = b4Var.f;
                        if (z46 && (d1Var = d1.S) != null && b4Var.k(d1Var.g())) {
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
                        z45 = b4Var.f;
                        if (z45) {
                            i22 = 0;
                            q1Var.setVisibility(i22);
                            r1 r1Var = this.V1;
                            if (!this.Y2) {
                                z44 = b4Var.f;
                                if (z44) {
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
                z35 = b4Var.f;
                if (!z35 || ((b4Var.h == null && b4Var.i() == null && b4Var.g() == null) || this.Y2)) {
                    l3 l3Var3 = l3Var2;
                    if (this.G1) {
                        i9 i9Var6 = ((z8) this.M1).d;
                        i9Var6.H0 = false;
                        i9Var6.P();
                        x3 x3Var2 = this.M1;
                        this.f3 = false;
                        ((z8) x3Var2).e();
                    }
                    l3Var3.setVisibility(8);
                } else {
                    l3 l3Var4 = l3Var2;
                    l3Var4.U.b(b4Var.h, b4Var.i(), b4Var.g(), i9Var.V0 && !b4Var.g && (storyItem13 = b4Var.a) != null && storyItem13.translated, storyItem6 == b4Var.a);
                    l3Var4.setVisibility(0);
                }
                storyItem11 = b4Var.a;
                if (storyItem11 != null) {
                    TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                    if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                        if (f2Var.r(this.x1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                            f2Var.q(false, false);
                            this.H3 = 0L;
                            n2 n2Var11 = this.X1;
                            if (n2Var11 != null) {
                                n2Var11.J(true);
                                this.X1.R1();
                                r0(true);
                            }
                        }
                        f2Var.setVisibility(0);
                        h3Var2.invalidate();
                        if (this.M1 != null && K0()) {
                            ((z8) this.M1).a(this.F1, this.x1);
                        }
                        z36 = this.z1;
                        y2 y2Var3 = this.L0;
                        ImageView imageView3 = this.J0;
                        y2 y2Var4 = this.z0;
                        if (z36) {
                            if (this.O2) {
                                z43 = b4Var.f;
                                if (!z43) {
                                    i19 = 0;
                                    imageView3.setVisibility(i19);
                                    if (y2Var3 != null) {
                                        if (this.P2) {
                                            z42 = b4Var.f;
                                            if (!z42) {
                                                i21 = 0;
                                                y2Var3.setVisibility(i21);
                                            }
                                        }
                                        i21 = 8;
                                        y2Var3.setVisibility(i21);
                                    }
                                    if (!this.R1) {
                                        z41 = b4Var.f;
                                        if (!z41) {
                                            i20 = 0;
                                            y2Var4.setVisibility(i20);
                                        }
                                    }
                                    i20 = 8;
                                    y2Var4.setVisibility(i20);
                                }
                            }
                            i19 = 4;
                            imageView3.setVisibility(i19);
                            if (y2Var3 != null) {
                            }
                            if (!this.R1) {
                            }
                            i20 = 8;
                            y2Var4.setVisibility(i20);
                        } else {
                            if (this.O2) {
                                z38 = b4Var.f;
                                if (!z38) {
                                    i15 = 0;
                                    imageView3.setVisibility(i15);
                                    if (y2Var3 != null) {
                                        y2Var3.setVisibility(8);
                                    }
                                    if (!this.y1) {
                                        z37 = b4Var.f;
                                        if (!z37) {
                                            i16 = 0;
                                            y2Var4.setVisibility(i16);
                                            y2Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                        }
                                    }
                                    i16 = 8;
                                    y2Var4.setVisibility(i16);
                                    y2Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                }
                            }
                            i15 = 4;
                            imageView3.setVisibility(i15);
                            if (y2Var3 != null) {
                            }
                            if (!this.y1) {
                            }
                            i16 = 8;
                            y2Var4.setVisibility(i16);
                            y2Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                        }
                        y2Var4.requestLayout();
                        i9Var.a1.append(this.x1, i10);
                        if (this.G1) {
                            R0(0L);
                            g1();
                            x2Var2.bumpPriority();
                        }
                        f2Var.setLivePlayer(i9Var.w0);
                        this.H1 = 0;
                        if (i9Var.K0 != null && (storyItem12 = b4Var.a) != null) {
                            int i34 = storyItem12.id;
                            i18 = 0;
                            while (true) {
                                if (i18 < i9Var.K0.i.size()) {
                                    MessageObject messageObject = (MessageObject) i9Var.K0.i.get(i18);
                                    if (messageObject != null && messageObject.getId() == i34) {
                                        this.H1 = i18;
                                        break;
                                    }
                                    i18++;
                                } else {
                                    break;
                                }
                            }
                        }
                        int i35 = this.F1;
                        this.I1 = i35;
                        int i36 = this.w1;
                        this.J1 = i36;
                        if (i9Var.N0) {
                            this.I1 = (i36 - 1) - i35;
                        }
                        l10 = b4Var.l();
                        bh.d dVar = this.u0;
                        if (l10) {
                            dVar.setVisibility(0);
                            this.a3 = b4Var.j() ? 1.0f : 0.5f;
                            boolean j11 = b4Var.j();
                            ImageView imageView4 = this.w0;
                            aj0 aj0Var = this.v0;
                            if (j11) {
                                aj0Var.setVisibility(0);
                                imageView4.setVisibility(8);
                                dVar.setContentDescription(LocaleController.getString(!i9.z1 ? R.string.Mute : R.string.Unmute));
                            } else {
                                aj0Var.setVisibility(8);
                                imageView4.setVisibility(0);
                                dVar.setContentDescription(LocaleController.getString(R.string.NoSound));
                            }
                            dVar.setAlpha((1.0f - this.Z3) * this.a3);
                        } else {
                            dVar.setVisibility(8);
                        }
                        r6Var7 = b4Var.b;
                        n8 n8Var = this.y0;
                        if (r6Var7 != null) {
                            n8Var.a(this.y1, r6Var7, z21 && this.X3);
                        } else {
                            TL_stories.StoryItem storyItem24 = b4Var.a;
                            if (storyItem24 != null) {
                                n8Var.b(this.y1, storyItem24, z21 && this.X3);
                            } else {
                                n8Var.b(this.y1, null, z21 && this.X3);
                            }
                        }
                        this.X3 = false;
                        n8Var.setTranslationX(dVar.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z20) {
                            this.m3 = false;
                            TL_stories.StoryItem storyItem25 = b4Var.a;
                            if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                this.A0.setReaction(null);
                            } else {
                                this.A0.setReaction(kg.q0.d(reaction));
                            }
                        }
                        r6Var8 = b4Var.b;
                        if (r6Var8 == null && r6Var8.E) {
                            w0();
                            this.f2.set(b4Var.b.c.x);
                            this.f2.setVisibility(0);
                            ViewPropertyAnimator viewPropertyAnimator = this.g2;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.g2 = null;
                            }
                            if (z21) {
                                ViewPropertyAnimator interpolator = this.f2.animate().alpha(1.0f).setDuration(180L).setInterpolator(jr.h);
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
                            if (z21 && this.f2.getVisibility() == 0) {
                                ViewPropertyAnimator withEndAction = this.f2.animate().alpha(0.0f).setDuration(180L).setInterpolator(jr.h).withEndAction(new v1(this, 0));
                                this.g2 = withEndAction;
                                withEndAction.start();
                            } else {
                                this.f2.setAlpha(0.0f);
                                this.f2.setVisibility(8);
                            }
                        }
                        this.t1.a(i9.z1, false);
                        if (this.G1 && b4Var.a != null) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.x1 + " storyId=" + b4Var.a.id + " " + b4.c(b4Var));
                        }
                        if (this.y1) {
                            c5.f(this.y2, this.x1, b4Var.a);
                        }
                        gg.c cVar = z3Var.b;
                        k6 k6Var3 = i9Var.K0;
                        cVar.setPadding(0, 0, (k6Var3 != null || k6Var3.g() == this.J1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.y2).getTranslateController().detectStoryLanguage(b4Var.a);
                        if (!z10 && !this.y1 && this.v3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                            v1 v1Var = new v1(this, 1);
                            this.v3 = v1Var;
                            AndroidUtilities.runOnUIThread(v1Var, 500L);
                        }
                        t3Var3 = this.C0;
                        if ((t3Var3 != null || !t3Var3.R) && b4Var.j() && i9.z1) {
                            if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                                AndroidUtilities.cancelRunOnUIThread(this.N3);
                                AndroidUtilities.runOnUIThread(this.N3, 250L);
                            }
                        }
                        imageView = this.s0;
                        if (imageView != null) {
                            if (I0() && !J0()) {
                                z40 = b4Var.e;
                                if (!z40) {
                                    i17 = 8;
                                    imageView.setVisibility(i17);
                                }
                            }
                            i17 = 0;
                            imageView.setVisibility(i17);
                        }
                        imageView2 = this.t0;
                        if (imageView2 != null) {
                            z39 = b4Var.f;
                            if (z39 && !n8Var.f) {
                                i33 = 0;
                            }
                            imageView2.setVisibility(i33);
                            return;
                        }
                        return;
                    }
                }
                f2Var.r(this.x1, null);
                f2Var.setVisibility(8);
                h3Var2.invalidate();
                if (this.M1 != null) {
                    ((z8) this.M1).a(this.F1, this.x1);
                }
                z36 = this.z1;
                y2 y2Var32 = this.L0;
                ImageView imageView32 = this.J0;
                y2 y2Var42 = this.z0;
                if (z36) {
                }
                y2Var42.requestLayout();
                i9Var.a1.append(this.x1, i10);
                if (this.G1) {
                }
                f2Var.setLivePlayer(i9Var.w0);
                this.H1 = 0;
                if (i9Var.K0 != null) {
                    int i342 = storyItem12.id;
                    i18 = 0;
                    while (true) {
                        if (i18 < i9Var.K0.i.size()) {
                        }
                        i18++;
                    }
                }
                int i352 = this.F1;
                this.I1 = i352;
                int i362 = this.w1;
                this.J1 = i362;
                if (i9Var.N0) {
                }
                l10 = b4Var.l();
                bh.d dVar2 = this.u0;
                if (l10) {
                }
                r6Var7 = b4Var.b;
                n8 n8Var2 = this.y0;
                if (r6Var7 != null) {
                }
                this.X3 = false;
                n8Var2.setTranslationX(dVar2.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z20) {
                }
                r6Var8 = b4Var.b;
                if (r6Var8 == null) {
                }
                if (this.f2 != null) {
                }
                this.t1.a(i9.z1, false);
                if (this.G1) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.x1 + " storyId=" + b4Var.a.id + " " + b4.c(b4Var));
                }
                if (this.y1) {
                }
                gg.c cVar2 = z3Var.b;
                k6 k6Var32 = i9Var.K0;
                cVar2.setPadding(0, 0, (k6Var32 != null || k6Var32.g() == this.J1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.y2).getTranslateController().detectStoryLanguage(b4Var.a);
                if (!z10) {
                    v1 v1Var2 = new v1(this, 1);
                    this.v3 = v1Var2;
                    AndroidUtilities.runOnUIThread(v1Var2, 500L);
                }
                t3Var3 = this.C0;
                if (t3Var3 != null) {
                }
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.s0;
                if (imageView != null) {
                }
                imageView2 = this.t0;
                if (imageView2 != null) {
                }
            }
        }
        z16 = false;
        h3Var = this.Y0;
        l3Var = this.G0;
        z3Var = this.k1;
        if (r6Var4 != null) {
        }
        n2Var = this.X1;
        if (n2Var != null) {
        }
        z17 = b4Var2.f;
        if (z17) {
        }
        ryVar.c();
        this.S0 = 0L;
        this.U0 = false;
        r6Var5 = b4Var2.b;
        if (r6Var5 == null) {
        }
        mcVar = mc.w;
        if (mcVar != null) {
            mcVar.b();
        }
        l3Var.J();
        q0();
        z16 = true;
        if (z16) {
        }
        z3Var.setOnSubtitleClick(null);
        TextView[] textViewArr2 = z3Var.c;
        this.M3 = 0;
        boolean z612 = z60;
        long j102 = this.x1;
        x2Var2 = x2Var;
        z19 = b4Var2.f;
        W0(j102, false, z19);
        r6Var6 = b4Var2.b;
        if (r6Var6 == null) {
        }
        z20 = z16;
        z21 = z59;
        h3Var2 = h3Var;
        l3Var2 = l3Var;
        charSequence4 = charSequence2;
        z22 = z612;
        charSequence = charSequence4;
        if (charSequence != null) {
        }
        t3Var = this.B0;
        if (t3Var != null) {
        }
        t3Var2 = this.C0;
        if (t3Var2 != null) {
        }
        storyItem10 = b4Var.a;
        if (storyItem6 == storyItem10) {
        }
        b4Var.o();
        if (!b4Var.g) {
        }
        i9 i9Var52 = ((z8) x3Var).d;
        i9Var52.V0 = false;
        i9Var52.P();
        z24 = b4Var.f;
        if (z24) {
        }
        if (z25 != this.C1) {
        }
        linearLayout = this.c2;
        int i332 = 8;
        if (linearLayout != null) {
        }
        z26 = this.Y2;
        LinearLayout linearLayout22 = this.K0;
        if (z26) {
        }
        gVar = this.Y1;
        if (gVar != null) {
        }
        aVar = this.T1;
        f2 f2Var2 = this.H0;
        if (aVar != null) {
        }
        n1Var = this.W1;
        if (n1Var != null) {
        }
        if (this.V1 != null) {
        }
        z35 = b4Var.f;
        if (z35) {
        }
        l3 l3Var32 = l3Var2;
        if (this.G1) {
        }
        l3Var32.setVisibility(8);
        storyItem11 = b4Var.a;
        if (storyItem11 != null) {
        }
        f2Var2.r(this.x1, null);
        f2Var2.setVisibility(8);
        h3Var2.invalidate();
        if (this.M1 != null) {
        }
        z36 = this.z1;
        y2 y2Var322 = this.L0;
        ImageView imageView322 = this.J0;
        y2 y2Var422 = this.z0;
        if (z36) {
        }
        y2Var422.requestLayout();
        i9Var.a1.append(this.x1, i10);
        if (this.G1) {
        }
        f2Var2.setLivePlayer(i9Var.w0);
        this.H1 = 0;
        if (i9Var.K0 != null) {
        }
        int i3522 = this.F1;
        this.I1 = i3522;
        int i3622 = this.w1;
        this.J1 = i3622;
        if (i9Var.N0) {
        }
        l10 = b4Var.l();
        bh.d dVar22 = this.u0;
        if (l10) {
        }
        r6Var7 = b4Var.b;
        n8 n8Var22 = this.y0;
        if (r6Var7 != null) {
        }
        this.X3 = false;
        n8Var22.setTranslationX(dVar22.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z20) {
        }
        r6Var8 = b4Var.b;
        if (r6Var8 == null) {
        }
        if (this.f2 != null) {
        }
        this.t1.a(i9.z1, false);
        if (this.G1) {
        }
        if (this.y1) {
        }
        gg.c cVar22 = z3Var.b;
        k6 k6Var322 = i9Var.K0;
        cVar22.setPadding(0, 0, (k6Var322 != null || k6Var322.g() == this.J1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.y2).getTranslateController().detectStoryLanguage(b4Var.a);
        if (!z10) {
        }
        t3Var3 = this.C0;
        if (t3Var3 != null) {
        }
        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
        }
        imageView = this.s0;
        if (imageView != null) {
        }
        imageView2 = this.t0;
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
        String k9 = com.google.android.recaptcha.internal.a.k(max, "_", max);
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
            ((kg.h0) arrayList.get(i12)).b(false);
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
                    V0((r6) arrayList13.get(i10 - arrayList2.size()), imageReceiver, k9);
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
                        V0(t10, imageReceiver, k9);
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
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), u3.c.k(k9, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), k9, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i13;
                                String str2 = k9;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                k9 = str2;
                            }
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i11 = i13;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (z10) {
                                storyItem = storyItem2;
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), u3.c.k(k9, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), k9, null, null, null, 0L, null, storyItem, 0);
                            } else {
                                storyItem = storyItem2;
                                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.clearImage();
                                } else {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                                    imageReceiver2.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), k9, null, null, null, 0L, null, storyItem, 0);
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
                                } catch (UnsupportedEncodingException e10) {
                                    e = e10;
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
                        } catch (UnsupportedEncodingException e12) {
                            e = e12;
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
                                kg.h0 h0Var = new kg.h0(this);
                                h0Var.e(kg.q0.d(tL_mediaAreaSuggestedReaction.reaction));
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
                h9Var.setOnSeekUpdate(new r3(21, z8Var, h9Var));
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

    @Override // org.telegram.ui.Components.hv0
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
        h3 h3Var = this.Y0;
        Bitmap createBitmap = Bitmap.createBitmap(h3Var.getWidth(), h3Var.getHeight(), Bitmap.Config.ARGB_8888);
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
                } else if (i9Var.L0 < ((Integer) j7.l1.i(1, this.v1)).intValue()) {
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
        k6 k6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.r1;
        arrayList.clear();
        i9 i9Var = this.F0;
        if (!i9Var.J0) {
            ArrayList arrayList2 = this.v1;
            int i10 = 0;
            ArrayList arrayList3 = this.s1;
            if (arrayList2 != null && (k6Var = i9Var.K0) != null) {
                if (k6Var instanceof c6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.y2).getStoriesController().E(this.x1);
                    String str = ((c6) i9Var.K0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            r6 r6Var = (r6) E.get(i11);
                            nh.o7 o7Var = r6Var.c;
                            if (o7Var != null && !o7Var.g && TextUtils.equals(o7Var.K0, str)) {
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
                    MessageObject f9 = i9Var.K0.f(((Integer) obj).intValue());
                    if (f9 != null && (storyItem = f9.storyItem) != null) {
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
                    TL_stories.PeerStories y8 = this.O1.y(this.x1);
                    this.q1 = y8;
                    if (y8 == null) {
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
        d4 currentPeerView;
        s50 s50Var = this.F2;
        if (s50Var != null) {
            s50Var.T = null;
            s50Var.d(false);
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
            mc I = new tc(this.Y0, this.x0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new v1(this, 2));
            I.r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.y2).ensureMessagesLoaded(this.x1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        b4 b4Var = this.K1;
        TL_stories.StoryItem storyItem = b4Var.a;
        if (storyItem == null) {
            storyItem = b4Var.c;
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
            y2 y2Var = this.z0;
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
                        iq iqVar = new iq(R.drawable.mini_views_likes, 0);
                        iqVar.setOverrideColor(-53704);
                        iqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(iqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        iq iqVar2 = new iq(R.drawable.mini_repost_story, 0);
                        iqVar2.setOverrideColor(-14161823);
                        iqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(iqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.w2.setText(spannableStringBuilder);
                    if (i11 == 0) {
                        this.x2.setVisibility(8);
                        this.w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.x2.setVisibility(0);
                        this.w2.setTranslationX(AndroidUtilities.dp(10.0f) + com.google.android.recaptcha.internal.a.f(i11, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.B2.setVisibility(0);
                }
                y2Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
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
            org.telegram.ui.Components.n6 n6Var = this.N0;
            if (n6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.R0 = false;
            } else {
                n6Var.q(Integer.toString(i10), z10 && this.R0, true);
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
                org.telegram.ui.Components.d6 d6Var = this.P0;
                if (d6Var != null) {
                    d6Var.d(this.R0 ? 1.0f : 0.0f, true);
                }
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
            if (!(this.A1 && (ChatObject.canSendPlain(chat) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                this.w2.setText(LocaleController.getString(i9Var.K0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.w2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new iq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.w2.setText(spannableStringBuilder2);
            } else {
                this.w2.setText("");
            }
            y2Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.Q0 ? this.M0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + y2Var.getLayoutParams().width;
            y2 y2Var2 = this.L0;
            if (y2Var2 != null) {
                y2Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.R0 ? this.N0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin += y2Var2.getLayoutParams().width;
                y2Var2.requestLayout();
            }
            this.S1.requestLayout();
            y2Var.requestLayout();
            this.x2.setVisibility(8);
            this.B2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = b4Var.a;
            e3 e3Var = this.f1;
            if (storyItem2 == null) {
                e3Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < e3Var.getChildCount(); i15++) {
                if (e3Var.getChildAt(i15) instanceof p8) {
                    ((p8) e3Var.getChildAt(i15)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void l0() {
        x6 x6Var = this.A0;
        x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new k2(0, x6Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        x6 x6Var2 = new x6(getContext(), this.t1);
        this.A0 = x6Var2;
        x6Var2.setPadding(dp, dp, dp, dp);
        this.A0.setAlpha(0.0f);
        this.A0.setScaleX(0.8f);
        this.A0.setScaleY(0.8f);
        this.A0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.z0.addView(this.A0, i7.f6.e(40, 40, 3));
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
        throw new UnsupportedOperationException("Method not decompiled: lh.d4.l1():void");
    }

    public final void m0(boolean z10) {
        ValueAnimator valueAnimator = this.Y3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z3, z10 ? 1.0f : 0.0f);
        this.Y3 = ofFloat;
        ofFloat.addUpdateListener(new w1(this, 2));
        this.Y3.addListener(new i2(this, z10, 1));
        this.Y3.setDuration(420L);
        this.Y3.setInterpolator(jr.h);
        this.Y3.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.y2).isFrozen()) {
            org.telegram.ui.c.b(this.y2);
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
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 0, this.x0);
        c2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        c2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        l4.s0 s0Var = new l4.s0(runnable, 4);
        c2Var.h0 = string;
        c2Var.i0 = s0Var;
        String string2 = LocaleController.getString(R.string.Cancel);
        k3.d dVar = new k3.d(25);
        c2Var.j0 = string2;
        c2Var.k0 = dVar;
        c2Var.show();
    }

    public final void o0(int i10) {
        this.A2 = false;
        this.R2 = true;
        this.x3 = false;
        this.z1 = false;
        this.A1 = false;
        long j10 = this.x1;
        z3 z3Var = this.k1;
        org.telegram.ui.Components.e9 e9Var = this.j1;
        if (j10 >= 0) {
            this.y1 = j10 == UserConfig.getInstance(this.y2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.x1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.y2).isUserContactBlocked(this.x1);
            this.B1 = !UserConfig.getInstance(this.y2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.D1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            e9Var.m(this.y2, user);
            z3Var.a.getImageReceiver().setForUserOrChat(user, e9Var);
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
            e9Var.k(this.y2, chat);
            z3Var.a.getImageReceiver().setForUserOrChat(chat, e9Var);
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
        h3 h3Var = this.Y0;
        i9 i9Var = this.F0;
        int i11 = 8;
        b4 b4Var = this.K1;
        if (z10) {
            B0();
            if (this.X1 == null && (this.A1 || b4Var.f)) {
                v0();
            }
            if (this.X1 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
                n2 n2Var = this.X1;
                if (b4Var.f || (!I0() && this.A1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                n2Var.setVisibility(i11);
                n2 n2Var2 = this.X1;
                boolean z11 = b4Var.f;
                D0(true);
                n2Var2.i1(z11);
                this.X1.o1(b4Var.f && !D0(true) && (this.r2 || this.X1.S0), true);
                st editField = this.X1.getEditField();
                long j12 = this.x1;
                TL_stories.StoryItem storyItem = b4Var.a;
                i9Var.getClass();
                editField.setText(i9.u(j12, storyItem));
                this.X1.b1(this.y2, this.x1);
                this.X1.K1(chat2, null);
            }
            org.telegram.ui.Components.n6 n6Var = this.M0;
            org.telegram.ui.ActionBar.c6 c6Var = this.x0;
            if (n6Var == null) {
                org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, false, false, false);
                this.M0 = n6Var2;
                y2 y2Var = this.z0;
                n6Var2.setCallback(y2Var);
                this.M0.r(c6Var.C0(org.telegram.ui.ActionBar.g6.G6));
                this.M0.t(AndroidUtilities.dp(14.0f));
                this.O0 = new org.telegram.ui.Components.d6(y2Var);
            }
            y2 y2Var2 = this.L0;
            if (y2Var2 != null && this.N0 == null) {
                org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(false, false, false, false);
                this.N0 = n6Var3;
                n6Var3.setCallback(y2Var2);
                this.N0.r(c6Var.C0(org.telegram.ui.ActionBar.g6.G6));
                this.N0.t(AndroidUtilities.dp(14.0f));
                this.P0 = new org.telegram.ui.Components.d6(y2Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.w1 = getStoriesCount();
            h3Var.invalidate();
            invalidate();
        } else if (this.y1) {
            B0();
            if (b4Var.f) {
                this.S1.setVisibility(8);
                if (this.X1 == null) {
                    v0();
                }
                this.X1.setVisibility(0);
            } else {
                this.S1.setVisibility(0);
                n2 n2Var3 = this.X1;
                if (n2Var3 != null) {
                    n2Var3.setVisibility(8);
                }
            }
            n2 n2Var4 = this.X1;
            if (n2Var4 != null) {
                boolean z12 = b4Var.f;
                D0(true);
                n2Var4.i1(z12);
                this.X1.o1(b4Var.f && !D0(true) && (this.r2 || this.X1.S0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.v1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(i9Var.L0));
                    if (indexOf < 0 && !this.v1.isEmpty()) {
                        if (i9Var.L0 > ((Integer) this.v1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (i9Var.L0 < ((Integer) j7.l1.i(1, this.v1)).intValue()) {
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
            h3Var.invalidate();
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
                this.c2.setVisibility(((!this.B1 || b4Var.f) && !this.C1) ? 8 : 0);
            }
            g8 g8Var = this.f2;
            if (g8Var != null) {
                g8Var.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            n2 n2Var5 = this.X1;
            if (n2Var5 != null) {
                n2Var5.setVisibility((I0() || UserObject.isService(this.x1)) ? 8 : 0);
                n2 n2Var6 = this.X1;
                boolean z13 = b4Var.f;
                D0(true);
                n2Var6.i1(z13);
                this.X1.o1(b4Var.f && !D0(true) && (this.r2 || this.X1.S0), true);
                st editField2 = this.X1.getEditField();
                long j13 = this.x1;
                TL_stories.StoryItem storyItem2 = b4Var.a;
                i9Var.getClass();
                editField2.setText(i9.u(j13, storyItem2));
                this.X1.b1(this.y2, this.x1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.y2).getUserFull(this.x1);
                if (userFull != null) {
                    this.X1.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.y2).loadFullUser(MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.x1)), this.v2, false);
                }
            }
            this.w1 = getStoriesCount();
            y2 y2Var3 = this.S1;
            if (y2Var3 != null) {
                y2Var3.setVisibility(8);
            }
            h3Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W0 = true;
        this.a1.onAttachedToWindow();
        this.c1.onAttachedToWindow();
        this.b1.onAttachedToWindow();
        this.h3.onAttachedToWindow();
        this.j3.onAttachedToWindow();
        n2 n2Var = this.X1;
        if (n2Var != null) {
            n2Var.E0();
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
            ((kg.h0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.W0 = false;
        this.a1.onDetachedFromWindow();
        this.c1.onDetachedFromWindow();
        this.b1.onDetachedFromWindow();
        this.h3.onDetachedFromWindow();
        this.j3.onDetachedFromWindow();
        n2 n2Var = this.X1;
        if (n2Var != null) {
            n2Var.D0();
        }
        org.telegram.ui.Components.p5 p5Var = this.k3;
        if (p5Var != null) {
            p5Var.o(this);
            this.k3 = null;
        }
        kg.d dVar = this.i3;
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
            ((kg.h0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        float f9;
        char c3;
        s50 s50Var;
        boolean z10;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        fk0 fk0Var;
        p2 p2Var;
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
        fk0 fk0Var2 = this.n3;
        if (fk0Var2 == null || fk0Var2.getReactionsWindow() == null || this.n3.getReactionsWindow().q) {
            n2 n2Var = this.X1;
            if (n2Var != null && (n2Var.t0() || this.X1.f3)) {
                if (this.X1.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.X1.getEmojiPadding();
                } else {
                    n2 n2Var2 = this.X1;
                    if (n2Var2.u3) {
                        n2Var2.K();
                        i13 = this.X1.getStickersExpandedHeight();
                    } else {
                        i13 = n2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.n3.getReactionsWindow().c.animate().translationY(-this.u2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
            i13 = 0;
        }
        boolean z11 = this.r2;
        int i14 = this.k2;
        z3 z3Var = this.k1;
        int i15 = 1;
        if (i14 != i13) {
            this.r2 = false;
            int i16 = 3;
            b4 b4Var = this.K1;
            f9 = 8.0f;
            if (i13 <= 0 || !this.G1) {
                n2 n2Var3 = this.X1;
                if (n2Var3 != null) {
                    i9.J(this.x1, b4Var.a, n2Var3.getEditText());
                }
            } else {
                this.r2 = true;
                this.e3 = false;
                this.p2 = i13;
                if (this.b2 == null) {
                    fk0 fk0Var3 = new fk0(1, this.y2, getContext(), LaunchActivity.R(), new l2(i16, this.x0));
                    this.b2 = fk0Var3;
                    fk0Var3.setHint(LocaleController.getString(this.A1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    fk0 fk0Var4 = this.b2;
                    fk0Var4.J0 = true;
                    addView(fk0Var4, this.E0, i7.f6.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.b2.setDelegate(new d3(this));
                    this.b2.p(null, null, true);
                }
                this.b2.setFragment(LaunchActivity.R());
                this.b2.setHint(LocaleController.getString(this.A1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                kg.m0 m0Var = kg.m0.B;
                if (m0Var != null) {
                    m0Var.l = true;
                }
                kg.m0 m0Var2 = kg.m0.C;
                if (m0Var2 != null) {
                    m0Var2.l = true;
                }
            }
            n2 n2Var4 = this.X1;
            if (n2Var4 != null) {
                n2Var4.o1(b4Var.f && !D0(true) && this.r2, true);
            }
            if (this.r2 && (p2Var = this.Z2) != null) {
                p2Var.setVisibility(0);
            }
            if (!this.r2 && (fk0Var = this.b2) != null) {
                fk0Var.n();
            }
            z3Var.setEnabled(!this.r2);
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
            this.l2.addListener(new j2(this, i15));
            if (this.r2) {
                this.l2.setDuration(250L);
                this.l2.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                i9Var.m();
            } else {
                this.l2.setDuration(500L);
                this.l2.setInterpolator(jr.h);
            }
            this.l2.start();
            boolean z12 = this.r2;
            if (z12 != z11) {
                if (z12) {
                    bg.c2 c2Var = this.L1;
                    Canvas canvas = (Canvas) c2Var.a;
                    Bitmap bitmap = (Bitmap) c2Var.b;
                    E0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.a.k(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (b4Var.f) {
                        nh.t3 t3Var = this.Z1;
                        if (t3Var != null) {
                            if (!t3Var.R) {
                                removeView(t3Var);
                            }
                        }
                        if (!D0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            nh.t3 t3Var2 = new nh.t3(getContext(), 3);
                            this.Z1 = t3Var2;
                            t3Var2.t(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.Z1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            nh.t3 t3Var3 = this.Z1;
                            t3Var3.G = Layout.Alignment.ALIGN_OPPOSITE;
                            t3Var3.h0 = new jh.w2(28, this, t3Var2);
                            addView(t3Var3, i7.f6.e(-1, 100, 87));
                            this.Z1.v();
                            l1();
                        }
                    }
                } else {
                    n2 n2Var5 = this.X1;
                    if (n2Var5 != null) {
                        n2Var5.getEditField().clearFocus();
                    }
                    nh.t3 t3Var4 = this.Z1;
                    if (t3Var4 != null) {
                        t3Var4.e(true);
                    }
                }
                this.q2 = true;
            } else {
                this.q2 = false;
            }
        } else {
            f9 = 8.0f;
        }
        n2 n2Var6 = this.X1;
        if (n2Var6 != null && n2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.X1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        h3 h3Var = this.Y0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h3Var.getLayoutParams();
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
            h3Var.setLayoutParams(layoutParams2);
        }
        y2 y2Var = this.S1;
        if (y2Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) y2Var.getLayoutParams();
            if (this.t2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f9) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        eg.r rVar = this.X2;
        if (rVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) rVar.getLayoutParams();
            if (this.t2) {
                c3 = 0;
                this.X2.setTextColor(i0.a.d(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                s50Var = this.F2;
                if (s50Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) s50Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.x3.z(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i13;
                    }
                }
                z10 = this.t2;
                LinearLayout linearLayout = this.K0;
                l3 l3Var = this.G0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.y1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) l3Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.s2 != this.t2) {
                        l3Var.setLayoutParams((FrameLayout.LayoutParams) l3Var.getLayoutParams());
                    }
                    l3Var.q0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) l3Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f9);
                    if (this.s2 != this.t2) {
                        l3Var.setLayoutParams((FrameLayout.LayoutParams) l3Var.getLayoutParams());
                    }
                    l3Var.q0 = AndroidUtilities.dp(f9);
                }
                this.R2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.y0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.u0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                gg.c cVar = z3Var.b;
                TextView[] textViewArr = z3Var.c;
                layoutParams = (FrameLayout.LayoutParams) cVar.getLayoutParams();
                if (layoutParams.rightMargin != dp) {
                    int i17 = (int) dp;
                    layoutParams.rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[c3].getLayoutParams()).rightMargin = i17;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i17;
                    z3Var.forceLayout();
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.s2 = this.t2;
            }
            this.X2.setTextColor(i0.a.k(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c3 = 0;
        s50Var = this.F2;
        if (s50Var != null) {
        }
        z10 = this.t2;
        LinearLayout linearLayout2 = this.K0;
        l3 l3Var2 = this.G0;
        if (z10) {
        }
        this.R2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.y0.getVisibility() == 0) {
        }
        if (this.u0.getVisibility() == 0) {
        }
        gg.c cVar2 = z3Var.b;
        TextView[] textViewArr2 = z3Var.c;
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
        l3 l3Var = this.G0;
        if (l3Var.S.y()) {
            l3Var.S.f(false);
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
            this.X1.J(true);
            boolean z11 = this.B1;
            b4 b4Var = this.K1;
            if ((z11 && !b4Var.f) || this.C1) {
                this.g3 = false;
                this.X1.setEnabled(false);
                this.X1.j1(" ", z10);
                return;
            }
            if (this.D1 > 0) {
                this.g3 = false;
                this.X1.setEnabled(true);
                this.X1.j1(ia.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.D1, ','))), z10);
                return;
            }
            if (!b4Var.f && tL_storiesStealthMode != null) {
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
                        n2 n2Var = this.X1;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        n2Var.e = formatString;
                        n2Var.f = format;
                        n2Var.G1(z10);
                    } else {
                        this.X1.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    AndroidUtilities.runOnUIThread(v1Var, 1000L);
                    return;
                }
            }
            this.g3 = false;
            this.X1.setEnabled(true);
            if (!b4Var.f) {
                this.X1.j1(LocaleController.getString(this.A1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            if (this.X1.getStarsPrice() <= 0) {
                this.X1.j1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.X1.j1(ia.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.X1.J4), z10);
            iq iqVar = this.X1.J4[0];
            if (iqVar != null) {
                iqVar.spaceScaleX = 0.9f;
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
        e3 e3Var = this.f1;
        if (e3Var != null) {
            nh.t3 t3Var = e3Var.c;
            if (t3Var != null) {
                t3Var.e(true);
                e3Var.c = null;
            }
            e3Var.b = null;
            e3Var.invalidate();
            e3Var.b(false);
        }
        l3 l3Var = this.G0;
        if (l3Var.S.y()) {
            l3Var.S.f(false);
            return true;
        }
        nh.t3 t3Var2 = this.B0;
        if (t3Var2 != null) {
            t3Var2.e(true);
        }
        nh.t3 t3Var3 = this.C0;
        if (t3Var3 != null) {
            t3Var3.e(true);
        }
        g40 g40Var = this.S2;
        if (g40Var != null) {
            g40Var.b(true);
        }
        w3 w3Var = this.p1;
        if (w3Var != null && w3Var.b) {
            w3Var.a();
            return true;
        }
        n2 n2Var = this.X1;
        if (n2Var != null && n2Var.v0()) {
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
        fk0 fk0Var = this.b2;
        if (fk0Var != null && fk0Var.getReactionsWindow() != null && !this.b2.getReactionsWindow().q) {
            this.b2.getReactionsWindow().d();
            return true;
        }
        n2 n2Var2 = this.X1;
        if (n2Var2 != null && n2Var2.t0()) {
            if (this.u2 > 0) {
                AndroidUtilities.hideKeyboard(this.X1.getEmojiView());
                return true;
            }
            this.X1.n0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (l3Var.getVisibility() != 0 || l3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            l3Var.C();
            this.c3 = false;
            this.Y0.invalidate();
            return true;
        }
        n2 n2Var3 = this.X1;
        if (n2Var3 != null) {
            long j10 = this.x1;
            TL_stories.StoryItem storyItem = this.K1.a;
            Editable editText = n2Var3.getEditText();
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
        fk0 fk0Var = this.b2;
        if (fk0Var != null) {
            fk0Var.setCurrentAccount(i10);
            this.b2.p(null, null, true);
        }
        fk0 fk0Var2 = this.n3;
        if (fk0Var2 != null) {
            fk0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(x3 x3Var) {
        this.M1 = x3Var;
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

    public void setOffset(float f9) {
        boolean z10 = f9 == 0.0f;
        if (this.X0 != z10) {
            this.X0 = z10;
            this.Y0.invalidate();
            if (this.G1 && this.F0.a && Build.VERSION.SDK_INT < 33) {
                ag.q1 q1Var = this.R3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(q1Var);
                    AndroidUtilities.runOnUIThread(q1Var, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(q1Var);
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
            x2 x2Var = this.a1;
            if (z10) {
                x2Var.stopAnimation();
                x2Var.setAllowStartAnimation(false);
            } else {
                x2Var.startAnimation();
                x2Var.setAllowStartAnimation(true);
            }
            this.T0 = 0L;
            this.Y0.invalidate();
        }
    }

    public final void t0() {
        if (this.E2 == null) {
            s2 s2Var = new s2(this, getContext(), this.x0);
            this.E2 = s2Var;
            s2Var.V1 = new t2(this);
            s2Var.f0.f0();
            s2 s2Var2 = this.E2;
            s2Var2.S = true;
            s2Var2.r1();
            s2 s2Var3 = this.E2;
            s2Var3.T = new u2(this);
            s2Var3.m1().setText(this.X1.getFieldText());
        }
    }

    public final void u0() {
        if (this.T1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.E3);
        this.T1 = aVar;
        aVar.setOnClickListener(new x1(this, 1));
        addView(this.T1, i7.f6.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.x0;
        n2 n2Var = new n2(this, AndroidUtilities.findActivity(getContext()), this, new l2(1, c6Var));
        this.X1 = n2Var;
        n2Var.getEditField().useAnimatedTextDrawable();
        this.X1.getEditField().setScaleX(0.0f);
        this.X1.setOverrideKeyboardAnimation(true);
        this.X1.setClipChildren(false);
        this.X1.setDelegate(new o2(this));
        setDelegate(this.X1);
        n2 n2Var2 = this.X1;
        n2Var2.t4 = false;
        n2Var2.u4 = true;
        if (this.K1.f) {
            n2Var2.V0(false, false, false);
        } else {
            n2Var2.V0(true, true, false);
        }
        this.X1.e();
        n2 n2Var3 = this.X1;
        n2Var3.v4 = true;
        addView(n2Var3, i7.f6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.K3 != null) {
            this.X1.P1(false);
        }
        this.X1.B2 = this.v2;
        c4 c4Var = this.I2;
        c4Var.g.add(this.Y0);
        c4Var.g.add(this);
        if (this.W0) {
            this.X1.E0();
        }
        r0(false);
        if (I0()) {
            this.X1.setVisibility(8);
        }
        ug.g gVar = new ug.g(getContext(), c6Var, this.E3, this.B3);
        this.Y1 = gVar;
        gVar.setOnClickListener(new s1(this, 1));
        addView(this.Y1, i7.f6.e(57, 300, 85));
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
        addView(this.f2, i7.f6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
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
        addView(this.W1, i7.f6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
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
        addView(this.V1, i7.f6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.U1, i7.f6.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
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
        i7.h6.a(this.e2);
        this.e2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.e2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.c2.addView(imageView, i7.f6.t(22, 22, 16, 12, 1, 4, 0));
        this.c2.addView(this.d2, i7.f6.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.c2.addView(this.e2, i7.f6.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.X1.addView(this.c2, i7.f6.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
