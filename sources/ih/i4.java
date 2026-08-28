package ih;

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
import gh.oa;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.ce;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nu0;
import org.telegram.ui.pr;
import org.telegram.ui.py;
import org.telegram.ui.qn;
import org.telegram.ui.va1;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class i4 extends xu0 implements NotificationCenter.NotificationCenterDelegate {
    public a7 A0;
    public boolean A1;
    public boolean A2;
    public org.telegram.ui.ActionBar.g1 A3;
    public kh.x3 B0;
    public boolean B1;
    public b3 B2;
    public final ig.a B3;
    public kh.x3 C0;
    public boolean C1;
    public boolean C2;
    public final ng.a C3;
    public kh.x3 D0;
    public long D1;
    public float D2;
    public final ng.d D3;
    public int E0;
    public final float E1;
    public u2 E2;
    public final lg.b E3;
    public final m9 F0;
    public int F1;
    public f50 F2;
    public TL_stories.TL_premium_boostsStatus F3;
    public final p3 G0;
    public boolean G1;
    public int G2;
    public ChannelBoostsController.CanApplyBoost G3;
    public final h2 H0;
    public int H1;
    public boolean H2;
    public long H3;
    public final View I0;
    public int I1;
    public final h4 I2;
    public long I3;
    public final ImageView J0;
    public int J1;
    public final AnimationNotificationsLocker J2;
    public boolean J3;
    public final LinearLayout K0;
    public final g4 K1;
    public final org.telegram.ui.Components.y5 K2;
    public TLRPC.TL_channels_sendAsPeers K3;
    public final a3 L0;
    public final com.google.firebase.messaging.m L1;
    public final org.telegram.ui.Components.y5 L2;
    public final x1 L3;
    public org.telegram.ui.Components.i6 M0;
    public c4 M1;
    public float M2;
    public int M3;
    public org.telegram.ui.Components.i6 N0;
    public boolean N1;
    public long N2;
    public final x1 N3;
    public org.telegram.ui.Components.y5 O0;
    public v6 O1;
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
    public final androidx.activity.i R3;
    public long S0;
    public a3 S1;
    public s30 S2;
    public final org.telegram.ui.Components.y5 S3;
    public long T0;
    public a T1;
    public final nu0 T2;
    public final org.telegram.ui.Components.y5 T3;
    public boolean U0;
    public s1 U1;
    public boolean U2;
    public final org.telegram.ui.Components.y5 U3;
    public boolean V0;
    public t1 V1;
    public x2 V2;
    public float V3;
    public boolean W0;
    public p1 W1;
    public FrameLayout W2;
    public final Path W3;
    public boolean X0;
    public p2 X1;
    public bg.t X2;
    public boolean X3;
    public final l3 Y0;
    public rg.g Y1;
    public boolean Y2;
    public ValueAnimator Y3;
    public final FrameLayout Z0;
    public kh.x3 Z1;
    public r2 Z2;
    public float Z3;
    public final z2 a1;
    public ValueAnimator a2;
    public float a3;
    public final ImageReceiver b1;
    public uj0 b2;
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
    public final g3 f1;
    public k8 f2;
    public boolean f3;
    public final py g1;
    public ViewPropertyAnimator g2;
    public boolean g3;
    public l4 h1;
    public final kg.d h2;
    public final ImageReceiver h3;
    public float i1;
    public final kg.d i2;
    public hg.d i3;
    public final org.telegram.ui.Components.z8 j1;
    public final Paint j2;
    public final ImageReceiver j3;
    public final e4 k1;
    public int k2;
    public org.telegram.ui.Components.k5 k3;
    public final l8 l1;
    public ValueAnimator l2;
    public boolean l3;
    public t5.l m1;
    public float m2;
    public boolean m3;
    public int n1;
    public float n2;
    public uj0 n3;
    public org.telegram.ui.ActionBar.g1 o1;
    public float o2;
    public boolean o3;
    public b4 p1;
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
    public final f4 t1;
    public boolean t2;
    public int t3;
    public final dh.g u0;
    public final ff.p0 u1;
    public int u2;
    public int u3;
    public final pi0 v0;
    public ArrayList v1;
    public final int v2;
    public x1 v3;
    public final ImageView w0;
    public int w1;
    public TextView w2;
    public float w3;
    public final org.telegram.ui.ActionBar.b6 x0;
    public long x1;
    public eh.b x2;
    public boolean x3;
    public final r8 y0;
    public boolean y1;
    public int y2;
    public pr y3;
    public final a3 z0;
    public boolean z1;
    public int z2;
    public org.telegram.ui.ActionBar.g1 z3;

    public i4(Context context, final m9 m9Var, f4 f4Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null);
        this.X0 = true;
        this.d1 = new ArrayList();
        this.n1 = -5;
        this.E1 = 1.0f;
        g4 g4Var = new g4(this);
        this.K1 = g4Var;
        this.m2 = -1.0f;
        this.n2 = -1.0f;
        this.o2 = -1.0f;
        this.v2 = ConnectionsManager.generateClassGuid();
        this.K2 = new org.telegram.ui.Components.y5(this);
        this.L2 = new org.telegram.ui.Components.y5(this);
        nu0 nu0Var = new nu0();
        this.T2 = nu0Var;
        this.a3 = 1.0f;
        this.L3 = new x1(this, 4);
        this.N3 = new x1(this, 11);
        this.O3 = new ArrayList();
        this.P3 = new ArrayList();
        this.R3 = new androidx.activity.i(this, 24);
        this.S3 = new org.telegram.ui.Components.y5(this);
        this.T3 = new org.telegram.ui.Components.y5(this);
        this.U3 = new org.telegram.ui.Components.y5(this);
        this.W3 = new Path();
        nu0Var.E = new xa.c(this, 19);
        h4 h4Var = new h4();
        h4Var.g = new ArrayList();
        this.I2 = h4Var;
        this.J2 = new AnimationNotificationsLocker();
        this.r1 = new ArrayList();
        this.s1 = new ArrayList();
        final int i9 = 0;
        z2 z2Var = new z2(this, i9);
        this.a1 = z2Var;
        z2Var.setCrossfadeWithOldImage(false);
        z2Var.setAllowLoadingOnAttachedOnly(true);
        z2Var.ignoreNotifications = true;
        z2Var.setFileLoadingPriority(0);
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
        z2Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.j1 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.F0 = m9Var;
        this.t1 = f4Var;
        this.L1 = f4Var.g;
        this.O1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        f4Var.l.setColor(-16777216);
        this.j2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.x0 = b6Var;
        setClipChildren(false);
        g3 g3Var = new g3(this, context, this.Y0, b6Var, m9Var);
        this.f1 = g3Var;
        lg.b bVar = new lg.b(b6Var, org.telegram.ui.ActionBar.f6.Sd, 0.8f);
        this.E3 = bVar;
        ng.c cVar = new ng.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.D3 = null;
            this.C3 = cVar;
        } else {
            ng.d dVar = new ng.d(cVar);
            this.D3 = dVar;
            dVar.f(AndroidUtilities.dp(8.0f));
            this.C3 = dVar;
        }
        pg.i iVar = new pg.i(this);
        ig.a aVar = new ig.a(this.C3);
        aVar.d = iVar;
        aVar.e = this;
        this.B3 = aVar;
        this.h2 = aVar.c(this, bVar, false);
        kg.d c10 = aVar.c(this, bVar, false);
        this.i2 = c10;
        c10.t(AndroidUtilities.dp(32.0f));
        l3 l3Var = new l3(this, context, f4Var, m9Var);
        this.Y0 = l3Var;
        l3Var.setClipChildren(false);
        this.g1 = new py(this.y2, l3Var);
        l3Var.addView(g3Var, g7.e6.c(-1.0f, -1));
        p3 p3Var = new p3(this, getContext(), m9Var.y, m9Var, b6Var);
        this.G0 = p3Var;
        p3Var.U.setOnClickListener(new z1(this, 10));
        ImageView imageView = new ImageView(context);
        this.J0 = imageView;
        imageView.setImageDrawable(f4Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new z1(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        g7.g6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(f4Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        a3 a3Var = new a3(this, getContext(), 1);
        this.L0 = a3Var;
        org.telegram.ui.Components.i6 i6Var = this.N0;
        if (i6Var != null) {
            i6Var.setCallback(a3Var);
        }
        a3Var.setWillNotDraw(false);
        a3Var.setOnClickListener(new z1(this, 12));
        a3 a3Var2 = new a3(this, getContext(), 2);
        this.z0 = a3Var2;
        org.telegram.ui.Components.i6 i6Var2 = this.M0;
        if (i6Var2 != null) {
            i6Var2.setCallback(a3Var2);
        }
        a3Var2.setWillNotDraw(false);
        a3Var2.setOnClickListener(new z1(this, 13));
        a3Var2.setOnLongClickListener(new g2(i9, this, m9Var));
        a7 a7Var = new a7(context, f4Var);
        this.A0 = a7Var;
        a7Var.setPadding(dp, dp, dp, dp);
        a3Var2.addView(this.A0, g7.e6.e(40, 40, 3));
        a3Var.addView(imageView2, g7.e6.e(40, 40, 3));
        g7.g6.b(a3Var2, 0.3f, 5.0f);
        g7.g6.b(a3Var, 0.3f, 5.0f);
        z2Var.setAllowLoadingOnAttachedOnly(true);
        z2Var.setParentView(l3Var);
        ff.p0 p0Var = new ff.p0(10);
        this.u1 = p0Var;
        l3Var.setOutlineProvider(p0Var);
        l3Var.setClipToOutline(true);
        addView(l3Var);
        e4 e4Var = new e4(context, g4Var);
        this.k1 = e4Var;
        e4Var.setOnClickListener(new View.OnClickListener(this) { // from class: ih.v1
            public final /* synthetic */ i4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        i4 i4Var = this.b;
                        long j10 = UserConfig.getInstance(i4Var.y2).clientUserId;
                        long j11 = i4Var.x1;
                        m9 m9Var2 = m9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                m9Var2.H(qn.R9(j11));
                                break;
                            } else {
                                m9Var2.H(ProfileActivity.m4(j11));
                                break;
                            }
                        } else {
                            Bundle h = aa.d.h(1, TeXSymbolParser.TYPE_ATTR);
                            h.putLong("dialog_id", i4Var.x1);
                            m9Var2.H(new k90(h, null));
                            break;
                        }
                    default:
                        i4 i4Var2 = this.b;
                        if (!i4Var2.K1.j()) {
                            i4Var2.c1(true);
                            break;
                        } else {
                            m9Var.O();
                            if (!m9.z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            i4Var2.u0.setContentDescription(LocaleController.getString(!m9.z1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        l3Var.addView(e4Var, g7.e6.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(imageView, g7.e6.q(40, 40, 5));
        linearLayout.addView(a3Var, g7.e6.q(40, 40, 5));
        linearLayout.addView(a3Var2, g7.e6.q(40, 40, 5));
        addView(linearLayout, g7.e6.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.s0 = imageView3;
        imageView3.setImageDrawable(f4Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        l3Var.addView(imageView3, g7.e6.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.t0 = imageView4;
        imageView4.setImageDrawable(f4Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.f6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        l3Var.addView(imageView4, g7.e6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new androidx.mediarouter.app.c(m9Var, 20));
        imageView3.setOnClickListener(new d0(this, b6Var, m9Var, context, f4Var, 1));
        dh.g gVar = new dh.g(context, 1);
        this.u0 = gVar;
        l3Var.addView(gVar, g7.e6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        pi0 pi0Var = new pi0(context);
        this.v0 = pi0Var;
        pi0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        gVar.addView(pi0Var);
        ImageView imageView5 = new ImageView(context);
        this.w0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(f4Var.t);
        gVar.addView(imageView5);
        imageView5.setVisibility(8);
        r8 r8Var = new r8(context);
        this.y0 = r8Var;
        r8Var.setOnClickListener(new z1(this, 2));
        l3Var.addView(r8Var, g7.e6.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i10 = 1;
        gVar.setOnClickListener(new View.OnClickListener(this) { // from class: ih.v1
            public final /* synthetic */ i4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i4 i4Var = this.b;
                        long j10 = UserConfig.getInstance(i4Var.y2).clientUserId;
                        long j11 = i4Var.x1;
                        m9 m9Var2 = m9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                m9Var2.H(qn.R9(j11));
                                break;
                            } else {
                                m9Var2.H(ProfileActivity.m4(j11));
                                break;
                            }
                        } else {
                            Bundle h = aa.d.h(1, TeXSymbolParser.TYPE_ATTR);
                            h.putLong("dialog_id", i4Var.x1);
                            m9Var2.H(new k90(h, null));
                            break;
                        }
                    default:
                        i4 i4Var2 = this.b;
                        if (!i4Var2.K1.j()) {
                            i4Var2.c1(true);
                            break;
                        } else {
                            m9Var.O();
                            if (!m9.z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            i4Var2.u0.setContentDescription(LocaleController.getString(!m9.z1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.l1 = new l8(this, f4Var);
        l3Var.addView(p3Var, g7.e6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.I0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        h2 h2Var = new h2(this, context, m9Var, m9Var.v, view, frameLayout, m9Var);
        this.H0 = h2Var;
        l3Var.addView(view, g7.e6.e(-1, 200, 87));
        l3Var.addView(h2Var, g7.e6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        l3Var.addView(frameLayout, g7.e6.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        gVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.f6.i0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        a3Var2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        a3Var.setBackground(org.telegram.ui.ActionBar.f6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        x9 x9Var = p3Var.S;
        View o6 = x9Var.o(context);
        if (o6 != null) {
            AndroidUtilities.removeFromParent(o6);
            addView(o6);
        }
        x9Var.D = new i2(this, 0);
        x9Var.T(this);
    }

    public static void V0(u6 u6Var, ImageReceiver imageReceiver, String str) {
        if (u6Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(u6Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(u6Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(i4 i4Var, ValueAnimator valueAnimator) {
        r8 r8Var = i4Var.y0;
        i4Var.Z3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e4 e4Var = i4Var.k1;
        e4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var.Z3);
        e4Var.setAlpha(1.0f - i4Var.Z3);
        ImageView imageView = i4Var.s0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var.Z3);
        imageView.setAlpha(1.0f - i4Var.Z3);
        ImageView imageView2 = i4Var.t0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var.Z3);
        imageView2.setAlpha(1.0f - i4Var.Z3);
        dh.g gVar = i4Var.u0;
        gVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var.Z3);
        gVar.setAlpha((1.0f - i4Var.Z3) * i4Var.a3);
        a3 a3Var = i4Var.S1;
        if (a3Var != null) {
            a3Var.setTranslationY(AndroidUtilities.dp(8.0f) * i4Var.Z3);
            i4Var.S1.setAlpha(1.0f - i4Var.Z3);
        }
        if (r8Var != null) {
            r8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var.Z3);
            r8Var.setAlpha(1.0f - i4Var.Z3);
        }
        i4Var.G0.setAlpha(1.0f - i4Var.Z3);
        c4 c4Var = i4Var.M1;
        float f10 = c4Var == null ? 0.0f : ((d9) c4Var).d.R;
        float hideInterfaceAlpha = i4Var.getHideInterfaceAlpha();
        a3 a3Var2 = i4Var.z0;
        if (a3Var2 != null) {
            a3Var2.setAlpha((1.0f - i4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = i4Var.J0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - i4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        a3 a3Var3 = i4Var.L0;
        if (a3Var3 != null) {
            a3Var3.setAlpha((1.0f - i4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        p2 p2Var = i4Var.X1;
        if (p2Var != null) {
            p2Var.setAlpha(1.0f - i4Var.Z3);
            i4Var.invalidate();
        }
        i4Var.Y0.invalidate();
    }

    public static void a0(i4 i4Var, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = i4Var.z3;
        if (g1Var == null || i4Var.y3 == null || g1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(m9.x1 - 0.2f) < 0.05f) {
                i4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(m9.x1 - 0.5f) < 0.05f) {
                i4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(m9.x1 - 1.0f) < 0.05f) {
                i4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(m9.x1 - 1.5f) < 0.05f) {
                i4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(m9.x1 - 2.0f) < 0.05f) {
                i4Var.z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                i4Var.z3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, vc.a(m9.x1) + "x"));
            }
        }
        i4Var.y3.a(m9.x1, z10);
    }

    public static void b0(i4 i4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (i4Var.I0() || i4Var.K1.f) {
            return;
        }
        if (UserConfig.getInstance(i4Var.y2).isPremium()) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, i4Var.x0).setOnClickListener(new z1(i4Var, 8));
            return;
        }
        Drawable drawable = i4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        j2 j2Var = new j2(i4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, i4Var.x0);
        c10.setOnClickListener(new z1(i4Var, 9));
        c10.setIcon(j2Var);
    }

    public static void d0(i4 i4Var) {
        g4 g4Var = i4Var.K1;
        TL_stories.StoryItem storyItem = g4Var.a;
        if ((storyItem == null && g4Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = g4Var.h();
        boolean z10 = g4Var.e;
        if (h == null || !h.exists()) {
            i4Var.a1();
            return;
        }
        MediaController.saveFile(h.toString(), i4Var.getContext(), z10 ? 1 : 0, null, null, new gh.p6(1, i4Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(i4 i4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(j10));
            str = user.first_name;
            z10 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i4Var.y2).getChat(Long.valueOf(-j10));
            str = chat2.title;
            z10 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new gh.i(i4Var, MessagesController.getInstance(i4Var.y2), j10, !z10, str, chat), 200L);
    }

    public static void f0(i4 i4Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i4Var.getContext(), 0, i4Var.x0);
        alertDialog$Builder.a.N = LocaleController.getString(i4Var.I0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.P = LocaleController.getString(i4Var.I0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new u1(i4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new i3.i(7));
        d9 d9Var = (d9) i4Var.M1;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        d9Var.h(c2Var);
        c2Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f10 = 1.0f - this.K2.c;
        o5 o5Var = this.F0.w;
        return (1.0f - (o5Var == null ? 0.0f : o5Var.f)) * f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        m9 m9Var;
        if (!this.K1.f || (m9Var = this.F0) == null || m9Var.w0 == null || D0(true)) {
            return 0L;
        }
        return m9Var.w0.j();
    }

    public static void h0(i4 i4Var) {
        org.telegram.ui.ActionBar.b6 b6Var = i4Var.x0;
        l3 l3Var = i4Var.Y0;
        if (i4Var.C1) {
            return;
        }
        int i9 = 1;
        if (!i4Var.A1) {
            p2 p2Var = i4Var.X1;
            int i10 = -i4Var.n1;
            i4Var.n1 = i10;
            AndroidUtilities.shakeViewSpring(p2Var, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = i4Var.x1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(i4Var.x1))) : "";
            (MessagesController.getInstance(i4Var.y2).premiumFeaturesBlocked() ? new oc(l3Var, b6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new oc(l3Var, b6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new x1(i4Var, 5))).j();
            return;
        }
        if (i4Var.F3 != null && i4Var.G3 != null) {
            zf.j0.C1(new bg.i1(i4Var, 3), i4Var.F3, i4Var.G3, i4Var.x1, true);
            return;
        }
        m9 m9Var = i4Var.F0;
        if (m9Var != null) {
            m9Var.g1 = true;
            m9Var.P();
        }
        MessagesController.getInstance(i4Var.y2).getBoostsController().getBoostsStats(i4Var.x1, new hg.i(i4Var, i9));
    }

    public static void j0(i4 i4Var) {
        g4 g4Var = i4Var.K1;
        if (g4Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = g4Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(i4Var.y2).getInputPeer(i4Var.x1);
        ConnectionsManager.getInstance(i4Var.y2).sendRequest(tL_stories_exportStoryLink, new y2());
    }

    public final void A0() {
        if (this.X2 != null) {
            return;
        }
        bg.t tVar = new bg.t(getContext(), 2);
        this.X2 = tVar;
        tVar.setTextSize(1, 14.0f);
        this.X2.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.X2.setGravity(19);
        this.X2.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.X2, g7.e6.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.S1 != null) {
            return;
        }
        a3 a3Var = new a3(this, getContext(), 0);
        this.S1 = a3Var;
        a3Var.setClickable(true);
        addView(this.S1, g7.e6.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        b3 b3Var = new b3(this, getContext());
        this.B2 = b3Var;
        b3Var.setOnClickListener(new z1(this, 0));
        this.S1.addView(this.B2, g7.e6.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        eh.b bVar = new eh.b(1, getContext(), false);
        this.x2 = bVar;
        bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.S1.addView(this.x2, g7.e6.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.w2 = textView;
        textView.setTextSize(1, 14.0f);
        this.w2.setTextColor(-1);
        this.S1.addView(this.w2, g7.e6.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.t1.s);
        b3 b3Var2 = this.B2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        b3Var2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
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
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.x0;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        TextView textView2 = new TextView(getContext());
        g7.g6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i10 = org.telegram.ui.ActionBar.f6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, k10, k10));
        textView2.setOnClickListener(new z1(this, 3));
        linearLayout.addView(textView, g7.e6.n(-1, -2));
        linearLayout.addView(textView2, g7.e6.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, g7.e6.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.Y0.addView(frameLayout);
        this.W2 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        f1 f1Var;
        TLRPC.Peer i9;
        f1 f1Var2;
        long clientUserId = UserConfig.getInstance(this.y2).getClientUserId();
        long j10 = this.x1;
        m9 m9Var = this.F0;
        if (j10 >= 0 || (f1Var2 = m9Var.w0) == null) {
            if (j10 < 0 || m9Var == null || (f1Var = m9Var.w0) == null || !f1Var.l()) {
                return false;
            }
            return !z10 || (i9 = m9Var.w0.i()) == null || this.x1 == DialogObject.getPeerDialogId(i9) || DialogObject.getPeerDialogId(i9) == clientUserId || this.x1 == clientUserId;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i10 = f1Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
        if (m9Var.w0.l() || ChatObject.canManageCalls(chat)) {
            return i10 == null || this.x1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == UserConfig.getInstance(this.y2).getClientUserId();
        }
        return false;
    }

    public final void E0(Canvas canvas, int i9, int i10) {
        TextureView textureView;
        h4 h4Var = this.I2;
        c5.c cVar = h4Var.d;
        if (cVar != null && h4Var.c != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(h4Var.c, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (cVar != null && (textureView = h4Var.e) != null) {
            Bitmap bitmap = textureView.getBitmap(i9, i10);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        l3 l3Var = this.Y0;
        canvas.scale(i9 / l3Var.getMeasuredWidth(), i10 / l3Var.getMeasuredHeight());
        this.a1.draw(canvas);
        canvas.restore();
    }

    public final void F0(kh.r9 r9Var, TL_stories.StoryItem storyItem) {
        c4 c4Var = this.M1;
        kh.t9 t9Var = new kh.t9(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.x0);
        t9Var.q1(r9Var);
        kh.j1 j1Var = t9Var.b;
        if (j1Var != null) {
            for (View view : j1Var.getViewPages()) {
                if (view instanceof kh.n9) {
                    ((kh.n9) view).e(false);
                }
            }
        }
        t9Var.k1(true);
        t9Var.P = new b5.d(29, this, storyItem);
        ((d9) c4Var).h(t9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0190, code lost:
    
        if (r3 == r10.b2) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G0(ViewGroup viewGroup, float f10, float f11, boolean z10) {
        kh.x3 x3Var;
        h4 h4Var;
        c5.c cVar;
        if (viewGroup != null) {
            kh.x3 x3Var2 = this.B0;
            if ((x3Var2 == null || !x3Var2.R) && ((x3Var = this.C0) == null || !x3Var.R)) {
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    if (childAt.getVisibility() == 0) {
                        p3 p3Var = this.G0;
                        if (childAt == p3Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f10, (int) f11)) {
                                float top = f11 - childAt.getTop();
                                d8 d8Var = p3Var.U;
                                if (d8Var.w == 1.0f && !p3Var.o0) {
                                    if (top > d8Var.getTranslationY() + (p3Var.n0.getTop() - p3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.Y0 || (h4Var = this.I2) == null || (cVar = h4Var.d) == null || !G0(cVar, f10 - childAt.getX(), f11 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f10, (int) f11))) {
                            g3 g3Var = this.f1;
                            if (childAt == g3Var && g3Var.b == null && (f10 < AndroidUtilities.dp(60.0f) || f10 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = g3Var.e;
                                float[] fArr = g3Var.f;
                                for (int i10 = 0; i10 < g3Var.getChildCount(); i10++) {
                                    View childAt2 = g3Var.getChildAt(i10);
                                    if (childAt2 != g3Var.d && (childAt2 instanceof t8)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f10;
                                        fArr[1] = f11;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                h2 h2Var = this.H0;
                                if (childAt == h2Var) {
                                    va1 va1Var = h2Var.f;
                                    gh.f1 f1Var = h2Var.c;
                                    va1 va1Var2 = h2Var.f;
                                    va1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f10 - h2Var.getX()) - va1Var2.getX()), (int) ((f11 - h2Var.getY()) - va1Var2.getY()))) {
                                        if (h2Var.b0) {
                                            continue;
                                        } else if (!this.r2) {
                                            if (f11 <= h2Var.s() + h2Var.getY() && f1Var.E(f10, (f11 - h2Var.getY()) - f1Var.getY()) == null) {
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
                                            p2 p2Var = this.X1;
                                            if (p2Var != null && childAt == p2Var.getRecordCircle()) {
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
        float x10 = getX();
        l3 l3Var = this.Y0;
        float x11 = view.getX() + l3Var.getX() + x10;
        float y10 = view.getY() + l3Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + ((float) view.getHeight());
    }

    public final boolean I0() {
        n6 n6Var;
        m9 m9Var = this.F0;
        return (m9Var == null || (n6Var = m9Var.K0) == null || n6Var.e != 4) ? false : true;
    }

    public final boolean J0() {
        TLRPC.User user;
        return I0() && (user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.F0.K0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean K0();

    public final void L0(hg.r0 r0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        g4 g4Var = this.K1;
        TL_stories.StoryItem storyItem = g4Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && r0Var == null) {
            l0();
            this.O1.g0(this.x1, g4Var.a, null);
        } else if (r0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.y2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.l3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = hg.n0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.h3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                this.m3 = true;
                this.O1.g0(this.x1, g4Var.a, hg.r0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.O1.g0(this.x1, g4Var.a, r0Var);
        }
        TL_stories.StoryItem storyItem2 = g4Var.a;
        a3 a3Var = this.z0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.A0.setReaction(null);
            a3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.A0.setReaction(hg.r0.d(reaction));
            a3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.z1 && z11) {
            TL_stories.StoryItem storyItem3 = g4Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = g4Var.a.views;
            int i9 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i9;
            if (i9 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = g4Var.a;
        hg.t0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        f1 f1Var;
        if (this.K3 != null) {
            return;
        }
        m9 m9Var = this.F0;
        if (m9Var != null && (f1Var = m9Var.w0) != null) {
            if (f1Var.v == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.y2).getSendAsPeers(this.x1, true);
        this.K3 = sendAsPeers;
        p2 p2Var = this.X1;
        if (p2Var == null || sendAsPeers == null) {
            return;
        }
        p2Var.P1(true);
    }

    public final boolean N0() {
        p2 p2Var = this.X1;
        if (p2Var == null) {
            return false;
        }
        boolean z10 = p2Var.u2;
        if (z10) {
            p2Var.s1();
        }
        AndroidUtilities.runOnUIThread(new x1(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j10;
        bg.i iVar;
        int i9;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.X1.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.y2).getClientUserId();
        TLRPC.Peer i10 = this.F0.w0.i();
        if (i10 != null) {
            clientUserId = DialogObject.getPeerDialogId(i10);
        }
        Context context = getContext();
        final int i11 = this.y2;
        String shortName = DialogObject.getShortName(i11, this.x1);
        long messageMinPrice = getMessageMinPrice();
        long j11 = this.H3;
        bg.i iVar2 = new bg.i(this, 18);
        b bVar = new b();
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, bVar, false, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i11).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j10 = j11;
            iVar = iVar2;
            i9 = ((org.telegram.ui.Components.t5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.t5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j11;
            iVar = iVar2;
            i9 = 0;
        }
        int max = (int) Math.max(messageMinPrice, j10 <= 0 ? 100L : j10);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            int i12 = length * 7;
            int i13 = iArr[i12];
            int[] iArr2 = iArr;
            int i14 = iArr2[i12 + 2];
            if (i9 <= iArr2[i12 + 3] && charSequence.length() <= i14) {
                max = Math.max(max, i13);
                break;
            } else {
                length--;
                iArr = iArr2;
            }
        }
        final long[] jArr = {max};
        final eq[] eqVarArr = new eq[1];
        final kh.d dVar = new kh.d(context, null, true);
        final u0 u0Var = new u0();
        u0Var.c = clientUserId;
        u0Var.f = textWithEntities;
        u0Var.g = jArr[0];
        final p0 p0Var = new p0(i11, context, true);
        LinearLayout f10 = ll.f(context, 0);
        final fh.d2 d2Var = new fh.d2(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        f10.addView(d2Var, g7.e6.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final fh.d2 d2Var2 = new fh.d2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        f10.addView(d2Var2, g7.e6.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final fh.d2 d2Var3 = new fh.d2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        f10.addView(d2Var3, g7.e6.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final t tVar = new t(context, bVar, r6);
        final boolean[] zArr = {true};
        Utilities.Callback[] callbackArr = {new Utilities.Callback() { // from class: ih.s
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), eqVarArr), true, true);
                long j12 = jArr2[0];
                u0 u0Var2 = u0Var;
                u0Var2.g = j12;
                p0Var.set(u0Var2);
                int intValue2 = num.intValue();
                int i15 = i11;
                int b10 = u.b(i15, intValue2, 0);
                int b11 = u.b(i15, num.intValue(), 1);
                int b12 = u.b(i15, num.intValue(), 2);
                ((org.telegram.ui.Components.j6) d2Var.b).c(b10 >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.j6) d2Var2.b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.j6) d2Var3.b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = u.b(i15, num.intValue(), 3);
                int b14 = u.b(i15, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                tVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        p0Var.set(u0Var);
        int i15 = 9;
        int[] iArr3 = {1, 50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000};
        int i16 = MessagesController.getInstance(i11).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        while (true) {
            if (i17 >= i15) {
                break;
            }
            int[] iArr4 = iArr3;
            if (iArr3[i17] >= messageMinPrice) {
                if (i17 > 0 && arrayList.isEmpty() && iArr4[i17] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i18 = iArr4[i17];
                if (i18 <= i16) {
                    arrayList.add(Integer.valueOf(i18));
                    if (iArr4[i17] == i16) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i16));
                    break;
                }
            }
            i17++;
            iArr3 = iArr4;
            i15 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) j3.r0.j(1, arrayList)).intValue() < i16) {
            arrayList.add(Integer.valueOf(i16));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            iArr5[i19] = ((Integer) arrayList.get(i19)).intValue();
        }
        tVar.a0 = iArr5;
        tVar.setValue((int) jArr[0]);
        linearLayout.addView(tVar, g7.e6.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(f10, g7.e6.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.f6.j5;
        TextView b10 = g7.i6.b(context, 20.0f, i20, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, g7.e6.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = g7.i6.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        ll.q(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, g7.e6.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(p0Var, g7.e6.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, g7.e6.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        f3Var.show();
        dVar.setOnClickListener(new fg.f(iVar, jArr, f3Var, 9));
    }

    public final void P0() {
        if (this.X1 == null) {
            return;
        }
        t0();
        this.E2.f0.e0();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 == 21 || i9 == 22) {
            this.X1.O();
        }
        this.E2.J1(-1, true);
        u2 u2Var = this.E2;
        u2Var.V = this.x1;
        u2Var.r1();
        this.E2.m1().setText(this.X1.getFieldText());
        ((d9) this.M1).h(this.E2);
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
        this.F0.H(new qn(bundle));
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
        kh.d4 d4Var;
        f1 f1Var;
        boolean z10 = this.G1;
        h4 h4Var = this.I2;
        if (!z10) {
            h4Var.d = null;
            return;
        }
        g4 g4Var = this.K1;
        boolean z11 = g4Var.f;
        l3 l3Var = this.Y0;
        if (!z11) {
            if (!g4Var.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): null, not a video");
                ((d9) this.M1).c(null, null, 0L, this.I2);
                h4Var.d = null;
                h4Var.f = false;
                return;
            }
            if (g4Var.f() == null || !new File(g4Var.f()).exists()) {
                TL_stories.StoryItem storyItem = g4Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.x1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = g4Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.y2).getFileReference(g4Var.a);
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
                            sb2.append(g4Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(g4Var.a.id);
                            sb2.append("&did=");
                            sb2.append(g4Var.a.dialogId);
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
                            ((d9) this.M1).c(document, uri, j10, this.I2);
                            l3Var.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(g4Var.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from attachPath " + fromFile);
                this.N2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): playing from null?");
            }
            ((d9) this.M1).c(document, uri, j10, this.I2);
            l3Var.invalidate();
            return;
        }
        c4 c4Var = this.M1;
        TL_stories.StoryItem storyItem3 = g4Var.a;
        long j12 = this.x1;
        int i9 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        d9 d9Var = (d9) c4Var;
        d9Var.i(true, true);
        m9 m9Var = d9Var.d;
        f1 f1Var2 = m9Var.w0;
        if (f1Var2 == null || f1Var2.b != j12 || !f1Var2.f(inputGroupCall)) {
            kh.d4 d4Var2 = m9Var.z0;
            if (d4Var2 != null) {
                d4Var2.d(j12, null);
                kh.d4 d4Var3 = m9Var.z0;
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
            k1 k1Var = k1.V;
            if (k1Var.O && (f1Var = k1Var.v) != null && f1Var.f(inputGroupCall)) {
                f1 f1Var3 = k1Var.v;
                k1Var.v = null;
                m9Var.w0 = f1Var3;
                k1Var.k(false);
            } else {
                f1 f1Var4 = m9Var.w0;
                if (f1Var4 != null) {
                    if (!f1Var4.n && (!k1Var.O || k1Var.v != f1Var4)) {
                        f1Var4.e();
                    } else if (f1Var4.K != m9Var.z0.getSink()) {
                        m9Var.w0.s(null);
                    }
                    m9Var.w0 = null;
                }
            }
            if (k1Var.O) {
                k1.j();
            }
            l9 l9Var = m9Var.v0;
            if (l9Var != null) {
                l9Var.release(null);
                m9Var.v0 = null;
            }
            h4 h4Var2 = m9Var.C0;
            if (h4Var2 != null) {
                h4Var2.b = null;
                h4Var2.a = null;
                h4Var2.f = false;
                h4Var2.d = null;
                h4Var2.e = null;
                h4Var2.c = null;
                h4Var2.a();
                m9Var.C0 = null;
            }
            if (m9Var.w0 == null) {
                f1 f1Var5 = f1.S;
                if (f1Var5 == null || !f1Var5.f(inputGroupCall)) {
                    f1 f1Var6 = new f1(d9Var.c, m9Var.h, storyItem3, j12, i9, z12, inputGroupCall, false, false);
                    j11 = j12;
                    m9Var.w0 = f1Var6;
                    d4Var = m9Var.A0;
                    if (d4Var == null) {
                        m9Var.w0.s(d4Var.getSink());
                    } else {
                        m9Var.w0.s(m9Var.z0.getSink());
                    }
                    m9Var.C0 = h4Var;
                    h4Var.f = false;
                    h4Var.d = m9Var.u0;
                    kh.d4 d4Var4 = m9Var.z0;
                    h4Var.e = d4Var4.d;
                    h4Var.c = d4Var4.c;
                    h4Var.a = m9Var.w0;
                    d4Var4.d(j11, h4Var);
                    m9Var.C0.a();
                } else {
                    m9Var.w0 = f1.S;
                }
            }
            j11 = j12;
            d4Var = m9Var.A0;
            if (d4Var == null) {
            }
            m9Var.C0 = h4Var;
            h4Var.f = false;
            h4Var.d = m9Var.u0;
            kh.d4 d4Var42 = m9Var.z0;
            h4Var.e = d4Var42.d;
            h4Var.c = d4Var42.c;
            h4Var.a = m9Var.w0;
            d4Var42.d(j11, h4Var);
            m9Var.C0.a();
        }
        l3Var.invalidate();
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
            pi0 pi0Var = this.v0;
            if (z10) {
                if (this.F0.a && Build.VERSION.SDK_INT < 33) {
                    m9 m9Var = ((d9) this.M1).d;
                    m9Var.h1 = true;
                    m9Var.P();
                    androidx.activity.i iVar = this.R3;
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 100L);
                }
                R0(j10);
                g1();
                pi0Var.setAnimation(this.t1.u);
                this.G1 = true;
                this.k1.a.getImageReceiver().setVisible(true, true);
                g4 g4Var = this.K1;
                if (g4Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.x1 + " storyId=" + g4Var.a.id + " " + g4.c(g4Var));
                }
            } else {
                p0();
                pi0Var.a();
                this.h1 = null;
                this.H2 = false;
                this.K2.d(0.0f, true);
                this.Y0.invalidate();
                invalidate();
                q0();
                m9 m9Var2 = ((d9) this.M1).d;
                m9Var2.E0 = false;
                m9Var2.P();
            }
            this.a1.setFileLoadingPriority(this.G1 ? 3 : 2);
            this.b1.setFileLoadingPriority(this.G1 ? 2 : 0);
            this.c1.setFileLoadingPriority(this.G1 ? 2 : 0);
            if (this.y1 || this.z1) {
                v6 v6Var = this.O1;
                long j11 = this.x1;
                boolean z11 = this.G1;
                a0.h hVar = v6Var.m;
                v9 v9Var = (v9) hVar.f(j11);
                if (v9Var == null) {
                    v9Var = new v9(v6Var.a, j11, v6Var);
                    hVar.k(v9Var, j11);
                }
                v9Var.b(z11);
            }
        }
    }

    public final void U0(int i9, long j10) {
        if (this.x1 != j10) {
            g4 g4Var = this.K1;
            g4Var.b = null;
            g4Var.a = null;
        }
        this.x1 = j10;
        this.v1 = null;
        o0(i9);
        TL_stories.PeerStories peerStories = this.F0.M0;
        boolean z10 = true;
        if (peerStories != null) {
            this.O1.S(peerStories, true);
            return;
        }
        v6 v6Var = this.O1;
        TL_stories.PeerStories y10 = v6Var.y(j10);
        if (y10 == null) {
            y10 = v6Var.z(j10);
        } else {
            z10 = false;
        }
        v6Var.S(y10, z10);
    }

    public final void W0(long j10, boolean z10, boolean z11) {
        if (!z10 && j10 == this.I3 && this.J3 == z11) {
            return;
        }
        this.I3 = j10;
        this.J3 = z11;
        e4 e4Var = this.k1;
        if (j10 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-j10));
            dg.c cVar = e4Var.b;
            dg.c cVar2 = e4Var.b;
            cVar.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                cVar2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            fq fqVar = new fq(mutate, null);
            fqVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            fqVar.h = dp;
            fqVar.n = dp2;
            cVar2.i(fqVar);
            return;
        }
        if (this.y1 && !z11) {
            e4Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            e4Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(j10));
        if (user == null || !user.verified) {
            e4Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            fq fqVar2 = new fq(mutate2, null);
            fqVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            fqVar2.h = dp3;
            fqVar2.n = dp4;
            e4Var.b.i(fqVar2);
        }
        if (user != null) {
            e4Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), e4Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            e4Var.b.l(null, false);
        }
    }

    public final void X0(float f10, float f11, l4 l4Var) {
        this.i1 = f10;
        this.w3 = 1.0f / f11;
        if (this.h1 == l4Var) {
            return;
        }
        this.h1 = l4Var;
        if (l4Var != null) {
            ImageReceiver imageReceiver = l4Var.a;
            if (imageReceiver.getBitmap() != null) {
                this.a1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void Y0(boolean z10) {
        g4 g4Var = this.K1;
        if (g4Var.a != null) {
            m9 m9Var = this.F0;
            if (m9Var.f != null) {
                String e10 = g4Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e10);
                    LaunchActivity.C1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                x2 x2Var = new x2(this, m9Var.f.getContext(), e10, e10, MessagesController.getInstance(this.y2).storiesEnabled() && (!(this.z1 || UserObject.isService(this.x1)) || ChatObject.isPublic(this.z1 ? MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1)) : null)), new n2(2, this.x0));
                this.V2 = x2Var;
                x2Var.e0 = true;
                TL_stories.StoryItem storyItem = g4Var.a;
                storyItem.dialogId = this.x1;
                x2Var.B0 = storyItem;
                x2Var.o0 = new fa.c(this, 22);
                ((d9) this.M1).h(x2Var);
            }
        }
    }

    public final void Z0() {
        l3 l3Var = this.Y0;
        org.telegram.ui.ActionBar.b6 b6Var = this.x0;
        ll.p(R.string.UnsupportedAttachment, new oc(l3Var, b6Var), b6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.x0);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.P = string;
        ((d9) this.M1).h(c2Var);
    }

    public final void b1(boolean z10) {
        if (this.o3 != z10) {
            g4 g4Var = this.K1;
            if (g4Var.a == null) {
                return;
            }
            this.o3 = z10;
            int i9 = 0;
            if (z10) {
                this.n3.setVisibility(0);
            }
            this.n3.setStoryItem(g4Var.a);
            m9 m9Var = ((d9) this.M1).d;
            m9Var.l1 = z10;
            m9Var.P();
            if (!z10) {
                if (this.n3.getReactionsWindow() != null) {
                    this.n3.getReactionsWindow().e();
                }
                this.n3.animate().alpha(0.0f).setDuration(150L).setListener(new l2(this, i9)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p3, z10 ? 1.0f : 0.0f);
            this.n3.setTransitionProgress(this.p3);
            ofFloat.addUpdateListener(new y1(this, 1));
            ofFloat.addListener(new k2(this, z10, i9));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(gr.g);
            ofFloat.start();
        }
    }

    public final void c1(boolean z10) {
        if (this.C0 == null) {
            kh.x3 x3Var = new kh.x3(getContext(), 1);
            x3Var.m(1.0f, -56.0f);
            this.C0 = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.Y0.addView(this.C0, g7.e6.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.C0.t(LocaleController.getString(z10 ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.C0.v();
    }

    public final boolean d1(boolean z10) {
        if (this.F0.N0) {
            z10 = !z10;
        }
        if (!z10) {
            int i9 = this.F1;
            if (i9 > 0) {
                this.F1 = i9 - 1;
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        f1 f1Var;
        int i11 = NotificationCenter.storiesUpdated;
        m9 m9Var = this.F0;
        boolean z10 = false;
        if (i9 == i11 || (i9 == NotificationCenter.storiesListUpdated && m9Var.K0 == objArr[0])) {
            c4 c4Var = this.M1;
            if (c4Var == null || !((d9) c4Var).d.D0) {
                if (this.G1) {
                    j1();
                    if (this.w1 == 0) {
                        if (this.A2) {
                            return;
                        }
                        this.A2 = true;
                        ((d9) this.M1).j();
                        return;
                    }
                    int i12 = this.F1;
                    ArrayList arrayList = this.r1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.s1;
                    if (i12 >= arrayList2.size() + size) {
                        this.F1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    f1(false);
                    if (this.y1 || this.z1) {
                        k1(true);
                    }
                }
                TL_stories.PeerStories peerStories = m9Var.M0;
                if (peerStories != null) {
                    this.O1.S(peerStories, true);
                } else {
                    long j10 = this.x1;
                    if (j10 != 0) {
                        v6 v6Var = this.O1;
                        TL_stories.PeerStories y10 = v6Var.y(j10);
                        if (y10 == null) {
                            y10 = v6Var.z(j10);
                            z10 = true;
                        }
                        v6Var.S(y10, z10);
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
        if (i9 == NotificationCenter.storyQualityUpdate) {
            f1(false);
            return;
        }
        if (i9 == NotificationCenter.emojiLoaded) {
            this.G0.U.invalidate();
            return;
        }
        if (i9 == NotificationCenter.stealthModeChanged) {
            r0(true);
            return;
        }
        if (i9 == NotificationCenter.storiesLimitUpdate) {
            p6 o6 = MessagesController.getInstance(this.y2).getStoriesController().o();
            if (o6 == null || !o6.a(this.y2, 1) || this.M1 == null) {
                return;
            }
            bg.i1 i1Var = new bg.i1(this, 3);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.C1;
            }
            ((d9) this.M1).h(new zf.j0(o6.b(), this.y2, findActivity, i1Var, null));
            return;
        }
        if (i9 == NotificationCenter.userIsPremiumBlockedUpadted) {
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
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.x1 == (-((TLRPC.ChatFull) obj).id)) {
                f1(false);
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.liveStoryUpdated) {
            if (i9 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                M0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (m9Var == null || (f1Var = m9Var.w0) == null || f1Var.g() != longValue) {
            return;
        }
        f1(false);
        p2 p2Var = this.X1;
        if (p2Var != null) {
            p2Var.J(true);
            this.X1.P1(true);
            r0(true);
        }
        h2 h2Var = this.H0;
        if (h2Var != null) {
            f1 f1Var2 = h2Var.L;
            if (h2Var.D != (f1Var2 != null ? f1Var2.j() : 0L)) {
                h2Var.e.N(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ae aeVar;
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
        a3 a3Var = this.z0;
        if (z10) {
            float measuredWidth = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f10 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.s3, measuredWidth - f10, gr.g.getInterpolation(this.r3));
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
            float measuredWidth2 = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (this.l3) {
                hg.d dVar = this.i3;
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
        p2 p2Var = this.X1;
        if (p2Var != null) {
            ce ceVar = p2Var.t1;
            ae aeVar2 = p2Var.u1;
            if (p2Var.getAlpha() == 0.0f || (aeVar = p2Var.a1) == null || aeVar.getParent() == null || p2Var.a1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(p2Var.a1.getX() + ceVar.getX() + aeVar2.getX() + p2Var.getX(), p2Var.a1.getY() + ceVar.getY() + aeVar2.getY() + p2Var.getY());
            if (p2Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight(), (int) (p2Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            p2Var.a1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ng.d dVar;
        float dp;
        if (view == this.Z2) {
            canvas.save();
            canvas.clipRect(0.0f, this.Z2.getY(), getMeasuredWidth(), this.Z2.getY() + this.Z2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        p2 p2Var = this.X1;
        Paint paint = this.j2;
        a3 a3Var = this.z0;
        f4 f4Var = this.t1;
        if (view == p2Var) {
            float f10 = this.m2;
            g4 g4Var = this.K1;
            if (f10 > 0.0f && !g4Var.f) {
                f4Var.l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), f4Var.l);
            }
            RectF rectF = f4Var.h;
            RectF rectF2 = f4Var.i;
            RectF rectF3 = f4Var.j;
            rectF.set(this.X1.getX(), this.X1.getY() + this.X1.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.X1.getX() + this.X1.getMeasuredWidth(), this.X1.getY() + this.X1.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (g4Var.f) {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                p1 p1Var = this.W1;
                if (p1Var != null && p1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.O2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.P2 && this.z1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (a3Var != null && a3Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + a3Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.X1.setTranslationX((1.0f - this.m2) * dp);
            this.X1.getEditField().setTranslationY(e2.c.z(1.0f, this.m2, -AndroidUtilities.dp(2.0f), this.X1.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.m2) * (this.X1.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, f4Var.h, this.m2, rectF3);
            kg.d dVar2 = this.h2;
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
            if (p2Var != null && p2Var.t0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = f4Var.k;
                RectF rectF5 = f4Var.k;
                rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.W3;
                path.rewind();
                path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                kg.d dVar3 = this.i2;
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
                    view.setTranslationY((this.K0.getY() + (a3Var.getY() + (-(r2.getMeasuredHeight() - this.n3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    l3 l3Var = this.Y0;
                    if (view == l3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.D3) != null && !dVar.n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(l3Var.getX(), l3Var.getY());
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
            x2 x2Var = this.V2;
            if (x2Var != null) {
                x2Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new x1(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0949, code lost:
    
        if (r15.g == (r2 == null && r2.translated && r2.translatedText != null && android.text.TextUtils.equals(r2.translatedLng, org.telegram.ui.Components.z21.A()))) goto L419;
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
    /* JADX WARN: Type inference failed for: r6v73, types: [ih.z7, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z10) {
        u6 u6Var;
        TL_stories.StoryItem storyItem;
        u6 u6Var2;
        boolean z11;
        boolean z12;
        int i9;
        py pyVar;
        TL_stories.StoryItem storyItem2;
        z2 z2Var;
        boolean z13;
        j9 j9Var;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        m9 m9Var;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem4;
        boolean z14;
        boolean z15;
        TL_stories.StoryItem storyItem5;
        m9 m9Var2;
        u6 u6Var3;
        TLRPC.MessageMedia messageMedia;
        kh.a8 a8Var;
        TL_stories.StoryItem storyItem6;
        u6 u6Var4;
        int i10;
        kh.a8 a8Var2;
        boolean z16;
        l3 l3Var;
        p3 p3Var;
        e4 e4Var;
        p2 p2Var;
        boolean z17;
        u6 u6Var5;
        gc gcVar;
        boolean z18;
        TL_stories.StoryItem storyItem7;
        z2 z2Var2;
        boolean z19;
        u6 u6Var6;
        g4 g4Var;
        boolean z20;
        boolean z21;
        l3 l3Var2;
        p3 p3Var2;
        boolean z22;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        SpannableStringBuilder spannableStringBuilder;
        int i11;
        CharSequence charSequence2;
        TLRPC.MessageMedia messageMedia2;
        boolean z23;
        kh.x3 x3Var;
        kh.x3 x3Var2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence4;
        TL_stories.StoryItem storyItem10;
        c4 c4Var;
        boolean z24;
        boolean z25;
        LinearLayout linearLayout;
        boolean z26;
        boolean z27;
        p2 p2Var2;
        p2 p2Var3;
        int i12;
        boolean z28;
        boolean z29;
        boolean z30;
        int i13;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        rg.g gVar;
        a aVar;
        p1 p1Var;
        boolean z35;
        TL_stories.StoryItem storyItem11;
        boolean z36;
        int i14;
        int i15;
        boolean z37;
        boolean z38;
        boolean l10;
        u6 u6Var7;
        u6 u6Var8;
        kh.x3 x3Var3;
        ImageView imageView;
        ImageView imageView2;
        boolean z39;
        int i16;
        boolean z40;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i17;
        int i18;
        int i19;
        boolean z41;
        int i20;
        boolean z42;
        boolean z43;
        TL_stories.StoryItem storyItem13;
        int i21;
        int i22;
        FrameLayout.LayoutParams layoutParams;
        int dp;
        boolean z44;
        boolean z45;
        int i23;
        boolean z46;
        f1 f1Var;
        int i24;
        boolean z47;
        int i25;
        boolean z48;
        int i26;
        boolean z49;
        boolean z50;
        boolean z51;
        boolean z52;
        f1 f1Var2;
        String str;
        BitmapDrawable bitmapDrawable;
        z2 z2Var3;
        boolean z53;
        m9 m9Var3;
        py pyVar2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        n6 n6Var;
        ArrayList arrayList2 = this.r1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.s1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.R2 = true;
        g4 g4Var2 = this.K1;
        TL_stories.StoryItem storyItem14 = g4Var2.a;
        u6 u6Var9 = g4Var2.b;
        String s10 = p7.s();
        this.V0 = false;
        this.Y2 = false;
        int i27 = this.F1;
        boolean z54 = this.P1;
        boolean z55 = this.Q1;
        boolean z56 = this.R1;
        m9 m9Var4 = this.F0;
        if (m9Var4 == null || (n6Var = m9Var4.K0) == null || n6Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i27 < 0 || i27 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i27);
            int size = i27 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            u6Var = (size < 0 || size >= arrayList3.size()) ? null : (u6) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            u6Var = (i27 < 0 || i27 >= arrayList3.size()) ? null : (u6) arrayList3.get(i27);
            int size2 = i27 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        g4Var2.c = null;
        g3 g3Var = this.f1;
        int i28 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        py pyVar3 = this.g1;
        z2 z2Var4 = this.a1;
        if (u6Var != null) {
            kh.a8 a8Var3 = u6Var.c;
            this.Q1 = false;
            boolean z57 = u6Var.E;
            this.R1 = z57;
            this.P1 = !z57;
            z2Var4.setCrossfadeWithOldImage(false);
            z2Var4.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = a8Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (u6Var.s || u6Var.D) {
                u6Var2 = u6Var9;
                z2Var3 = z2Var4;
                z11 = z54;
                z53 = z55;
                z12 = z56;
                m9Var3 = m9Var4;
                i9 = i27;
                pyVar2 = pyVar3;
                r62 = 0;
                this.a1.setImage(null, null, ImageLocation.getForPath(u6Var.f), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                u6Var2 = u6Var9;
                pyVar2 = pyVar3;
                r62 = 0;
                z2Var3 = z2Var4;
                z11 = z54;
                z12 = z56;
                z53 = z55;
                m9Var3 = m9Var4;
                i9 = i27;
                this.a1.setImage(null, null, ImageLocation.getForPath(u6Var.e), s10, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            g4Var2.b = u6Var;
            g4Var2.j = r62;
            g4Var2.i = r62;
            g4Var2.a = r62;
            g4Var2.d = false;
            g4Var2.e = g4Var2.m();
            TL_stories.StoryItem storyItem17 = g4Var2.a;
            g4Var2.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            pyVar = pyVar2;
            g3Var.c(r62, q8.a(a8Var3), pyVar);
            this.Q2 = false;
            this.P2 = false;
            this.O2 = false;
            storyItem2 = storyItem14;
            z13 = z53;
            z2Var = z2Var3;
            m9Var = m9Var3;
        } else {
            u6Var2 = u6Var9;
            z11 = z54;
            z12 = z56;
            i9 = i27;
            pyVar = pyVar3;
            this.P1 = false;
            this.Q1 = false;
            this.R1 = false;
            if (storyItem == null) {
                if (m9Var4 != null) {
                    m9Var4.q(true);
                    return;
                }
                return;
            }
            u6 t10 = this.O1.t(this.x1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.Q1 = true;
                z2Var4.setCrossfadeWithOldImage(false);
                if (this.e1 != null) {
                    i28 = 0;
                }
                z2Var4.setCrossfadeDuration(i28);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    u6Var3 = t10;
                    z2Var = z2Var4;
                    m9Var2 = m9Var4;
                    this.a1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    m9Var2 = m9Var4;
                    z2Var = z2Var4;
                    u6Var3 = t10;
                    this.a1.setImage(null, null, ImageLocation.getForPath(str2), s10, null, 0L, null, null, 0);
                }
                g4Var2.b = u6Var3;
                g4Var2.j = null;
                g4Var2.i = null;
                g4Var2.a = null;
                g4Var2.d = false;
                g4Var2.e = g4Var2.m();
                TL_stories.StoryItem storyItem18 = g4Var2.a;
                g4Var2.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                g3Var.c(null, q8.a(u6Var3.c), pyVar);
                g4Var2.c = storyItem;
                this.Q2 = false;
                this.P2 = false;
                this.O2 = false;
                z13 = z55;
                m9Var = m9Var2;
            } else {
                storyItem2 = storyItem14;
                z2Var = z2Var4;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.x1;
                z13 = z55;
                z2Var.setCrossfadeWithOldImage(z13);
                z2Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
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
                            this.a1.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), ta.b.j(s10, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
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
                        Drawable drawable = ((m9Var4.K0 != null || m9Var4.J0) && (j9Var = m9Var4.o0) != null && (imageReceiver = j9Var.c) != null && j9Var.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.x1;
                        if (z58) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String j10 = ta.b.j(s10, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            storyItem4 = storyItem;
                            m9Var = m9Var4;
                            this.a1.setImage(null, null, forDocument, j10, forDocument2, s10, drawable, 0L, null, storyItem4, 0);
                        } else {
                            storyItem3 = storyItem;
                            m9Var = m9Var4;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                z2Var.clearImage();
                                storyItem3.dialogId = this.x1;
                                g3Var.d(z10 ? null : storyItem3, pyVar);
                                g4Var2.n(storyItem3);
                                z14 = (!this.Y2 || (storyItem5 = g4Var2.a) == null || (storyItem5 instanceof TL_stories.TL_storyItemDeleted) || (storyItem5 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                                this.Q2 = z14;
                                this.O2 = z14;
                                if (z14) {
                                    this.O2 = g4Var2.d() && g4Var2.a.isPublic;
                                }
                                if (this.O2) {
                                    TL_stories.StoryItem storyItem19 = g4Var2.a;
                                    this.O2 = storyItem19.pinned || !p7.w(this.y2, storyItem19);
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
                                        this.Q2 = (user == null || UserObject.getPublicUsername(user) == null || !g4Var2.a.isPublic) ? false : true;
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
                        g3Var.d(z10 ? null : storyItem3, pyVar);
                        g4Var2.n(storyItem3);
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
                m9Var = m9Var4;
                storyItem3.dialogId = this.x1;
                g3Var.d(z10 ? null : storyItem3, pyVar);
                g4Var2.n(storyItem3);
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
        TL_stories.StoryItem storyItem20 = g4Var2.a;
        if (storyItem20 != null && !z10) {
            m9Var.L0 = storyItem20.id;
        }
        m9Var.j0.A();
        this.U2 = true;
        if (this.y1 || this.z1) {
            k1(false);
        }
        TL_stories.StoryItem storyItem21 = g4Var2.a;
        u6 u6Var10 = g4Var2.b;
        int i29 = storyItem21 != null ? storyItem21.id : (u6Var10 == null || (a8Var = u6Var10.c) == null) ? 0 : a8Var.f;
        if (storyItem2 != null) {
            storyItem6 = storyItem2;
            i10 = storyItem6.id;
            u6Var4 = u6Var2;
        } else {
            storyItem6 = storyItem2;
            u6Var4 = u6Var2;
            i10 = (u6Var2 == null || (a8Var2 = u6Var4.c) == null) ? 0 : a8Var2.f;
        }
        boolean z59 = i29 == i10 || !(u6Var4 == null || storyItem21 == null || !TextUtils.equals(u6Var4.e, storyItem21.attachPath));
        boolean z60 = z59 && !(this.Q1 == z13 && this.P1 == z11 && this.R1 == z12);
        f1 f1Var3 = m9Var.w0;
        if (f1Var3 != null) {
            int i30 = this.M3;
            TLRPC.GroupCall groupCall = f1Var3.v;
            if (i30 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                z16 = true;
                l3Var = this.Y0;
                p3Var = this.G0;
                e4Var = this.k1;
                if ((u6Var4 != null || (str = u6Var4.e) == null || !str.equals(g4Var2.f())) && (storyItem6 == null || (storyItem7 = g4Var2.a) == null || storyItem6.id != storyItem7.id)) {
                    p2Var = this.X1;
                    if (p2Var != null) {
                        if (storyItem6 != null && !TextUtils.isEmpty(p2Var.getEditField().getText())) {
                            m9.J(storyItem6.dialogId, storyItem6, this.X1.getEditField().getText());
                        }
                        this.X1.getEditField().setText(m9.u(this.x1, g4Var2.a));
                        z18 = g4Var2.f;
                        if (z18) {
                            this.X1.U0(false, false);
                        } else {
                            this.X1.U0(true, true);
                        }
                    }
                    z17 = g4Var2.f;
                    if (z17) {
                        M0();
                    }
                    pyVar.c();
                    this.S0 = 0L;
                    this.U0 = false;
                    u6Var5 = g4Var2.b;
                    if (u6Var5 == null) {
                        qi0 qi0Var = e4Var.d;
                        if (qi0Var != null) {
                            qi0Var.e(u6Var5.h, false);
                        }
                        e4Var.a.invalidate();
                    } else if (!z60) {
                        e4Var.h = 0.0f;
                    }
                    gcVar = gc.w;
                    if (gcVar != null && gcVar.h == l3Var) {
                        gcVar.b();
                    }
                    p3Var.J();
                    q0();
                    z16 = true;
                }
                if (!z16 || (u6Var4 != null && g4Var2.b == null)) {
                    e4Var.setOnSubtitleClick(null);
                    TextView[] textViewArr = e4Var.c;
                    this.M3 = 0;
                    boolean z61 = z60;
                    long j11 = this.x1;
                    z2Var2 = z2Var;
                    z19 = g4Var2.f;
                    W0(j11, false, z19);
                    u6Var6 = g4Var2.b;
                    if (u6Var6 == null) {
                        g4Var = g4Var2;
                        charSequence2 = u6Var6.E ? LocaleController.getString(R.string.FailedToUploadStory) : p7.u(textViewArr[0], this.Q1);
                    } else if (I0()) {
                        TL_stories.StoryItem storyItem22 = g4Var2.a;
                        if (storyItem22 == null || (messageMedia2 = storyItem22.media) == null) {
                            g4Var = g4Var2;
                        } else {
                            if (messageMedia2.document != null) {
                                g4Var = g4Var2;
                                charSequence2 = LocaleController.formatStoryDate(r13.date);
                            } else {
                                g4Var = g4Var2;
                                if (messageMedia2.photo != null) {
                                    charSequence2 = LocaleController.formatStoryDate(r2.date);
                                }
                            }
                        }
                        charSequence2 = "";
                    } else {
                        g4Var = g4Var2;
                        TL_stories.StoryItem storyItem23 = g4Var.a;
                        if (storyItem23 == null) {
                            z20 = z16;
                            z21 = z59;
                            l3Var2 = l3Var;
                            p3Var2 = p3Var;
                            z22 = z61;
                            charSequence = null;
                        } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                            spannableStringBuilder2.setSpan(new c3(), 0, spannableStringBuilder2.length(), 33);
                            spannableStringBuilder2.append((CharSequence) "  ");
                            f1 f1Var4 = m9Var.w0;
                            if (f1Var4 != null) {
                                TLRPC.GroupCall groupCall2 = f1Var4.v;
                                i11 = 1;
                                this.M3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                            } else {
                                i11 = 1;
                            }
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i11, this.M3)));
                            charSequence2 = spannableStringBuilder2;
                        } else if (storyItem23.date == -1) {
                            charSequence2 = LocaleController.getString(R.string.CachedStory);
                        } else {
                            if (g4Var.i() != null) {
                                z7 i31 = g4Var.i();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                z20 = z16;
                                z21 = z59;
                                SpannableString spannableString = new SpannableString("r");
                                l3Var2 = l3Var;
                                p3Var2 = p3Var;
                                spannableString.setSpan(new eq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                spannableStringBuilder3.append((CharSequence) spannableString).append((CharSequence) " ");
                                if (i31.b != null) {
                                    org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(textViewArr[0], 15.0f, this.y2);
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(f5Var, 0, 1, 33);
                                    spannableStringBuilder3.append((CharSequence) spannableString2).append((CharSequence) " ");
                                    if (i31.b.longValue() > 0) {
                                        TLRPC.User user2 = MessagesController.getInstance(this.y2).getUser(i31.b);
                                        f5Var.e(user2);
                                        spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user2));
                                    } else {
                                        TLRPC.Chat chat4 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-i31.b.longValue()));
                                        f5Var.b(chat4);
                                        if (chat4 != null) {
                                            spannableStringBuilder3.append((CharSequence) chat4.title);
                                        }
                                    }
                                } else {
                                    String str4 = g4Var.a.fwd_from.from_name;
                                    if (str4 != null) {
                                        spannableStringBuilder3.append((CharSequence) str4);
                                    }
                                }
                                e4Var.setOnSubtitleClick(new bg.u1(22, this, i31));
                                SpannableString spannableString3 = new SpannableString(".");
                                qs qsVar = new qs();
                                qsVar.b = AndroidUtilities.dp(1.5f);
                                qsVar.c = 5.0f;
                                spannableString3.setSpan(qsVar, 0, spannableString3.length(), 33);
                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(g4Var.a.date));
                                spannableStringBuilder = spannableStringBuilder3;
                            } else {
                                z20 = z16;
                                z21 = z59;
                                l3Var2 = l3Var;
                                p3Var2 = p3Var;
                                if (!this.A1 || (storyItem8 = g4Var.a) == null || storyItem8.from_id == null) {
                                    String formatStoryDate = LocaleController.formatStoryDate(g4Var.a.date);
                                    charSequence4 = formatStoryDate;
                                    if (g4Var.a.edited) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                        qs qsVar2 = new qs();
                                        qsVar2.b = AndroidUtilities.dp(1.5f);
                                        qsVar2.c = 5.0f;
                                        valueOf.append((CharSequence) " . ").setSpan(qsVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                        valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                        charSequence4 = valueOf;
                                    }
                                    z22 = z61;
                                    charSequence = charSequence4;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                    org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(textViewArr[0], 15.0f, this.y2);
                                    SpannableString spannableString4 = new SpannableString("a");
                                    spannableString4.setSpan(f5Var2, 0, 1, 33);
                                    spannableStringBuilder4.append((CharSequence) spannableString4).append((CharSequence) " ");
                                    long peerDialogId = DialogObject.getPeerDialogId(g4Var.a.from_id);
                                    if (peerDialogId > 0) {
                                        TLRPC.User user3 = MessagesController.getInstance(this.y2).getUser(Long.valueOf(peerDialogId));
                                        f5Var2.e(user3);
                                        spannableStringBuilder4.append((CharSequence) UserObject.getUserName(user3));
                                    } else {
                                        TLRPC.Chat chat5 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-peerDialogId));
                                        f5Var2.b(chat5);
                                        if (chat5 != null) {
                                            spannableStringBuilder4.append((CharSequence) chat5.title);
                                        }
                                    }
                                    e4Var.setOnSubtitleClick(new fh.p(this, peerDialogId, 2));
                                    SpannableString spannableString5 = new SpannableString(".");
                                    qs qsVar3 = new qs();
                                    qsVar3.b = AndroidUtilities.dp(1.5f);
                                    qsVar3.c = 5.0f;
                                    spannableString5.setSpan(qsVar3, 0, spannableString5.length(), 33);
                                    spannableStringBuilder4.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(g4Var.a.date));
                                    spannableStringBuilder = spannableStringBuilder4;
                                }
                            }
                            z22 = false;
                            charSequence = spannableStringBuilder;
                        }
                        if (charSequence != null) {
                            n6 n6Var2 = m9Var.K0;
                            if (n6Var2 == null || (storyItem9 = g4Var.a) == null || !n6Var2.m(storyItem9.id)) {
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
                                spannableString6.setSpan(new eq(R.drawable.msg_pin_mini), 0, 1, 33);
                                ((SpannableStringBuilder) charSequence5).insert(0, (CharSequence) spannableString6);
                                charSequence3 = charSequence5;
                            }
                            e4Var.c(charSequence3, z22);
                        } else {
                            z23 = false;
                        }
                        x3Var = this.B0;
                        if (x3Var != null) {
                            x3Var.e(z23);
                        }
                        x3Var2 = this.C0;
                        if (x3Var2 != null) {
                            x3Var2.e(z23);
                        }
                    }
                    z20 = z16;
                    z21 = z59;
                    l3Var2 = l3Var;
                    p3Var2 = p3Var;
                    charSequence4 = charSequence2;
                    z22 = z61;
                    charSequence = charSequence4;
                    if (charSequence != null) {
                    }
                    x3Var = this.B0;
                    if (x3Var != null) {
                    }
                    x3Var2 = this.C0;
                    if (x3Var2 != null) {
                    }
                } else {
                    g4Var = g4Var2;
                    z2Var2 = z2Var;
                    z20 = z16;
                    z21 = z59;
                    l3Var2 = l3Var;
                    p3Var2 = p3Var;
                }
                storyItem10 = g4Var.a;
                if (storyItem6 == storyItem10 && u6Var4 == g4Var.b) {
                }
                g4Var.o();
                if ((!g4Var.g || storyItem6 != g4Var.a) && (c4Var = this.M1) != null) {
                    m9 m9Var5 = ((d9) c4Var).d;
                    m9Var5.V0 = false;
                    m9Var5.P();
                }
                z24 = g4Var.f;
                z25 = !z24 && (f1Var2 = m9Var.w0) != null && g4Var.k(f1Var2.g()) && m9Var.w0.b();
                if (z25 != this.C1) {
                    this.C1 = z25;
                    if (z25) {
                        z0();
                    }
                    if (this.c2 != null && (this.B1 || this.C1)) {
                        h1();
                    }
                    p2 p2Var4 = this.X1;
                    if (p2Var4 != null) {
                        if (this.B1) {
                            z52 = g4Var.f;
                        }
                        if (!this.C1) {
                            z51 = true;
                            p2Var4.setEnabled(z51);
                            z50 = true;
                            this.X1.P1(true);
                        }
                        z51 = false;
                        p2Var4.setEnabled(z51);
                        z50 = true;
                        this.X1.P1(true);
                    } else {
                        z50 = true;
                    }
                    r0(z50);
                }
                linearLayout = this.c2;
                int i32 = 8;
                if (linearLayout != null) {
                    if (this.B1) {
                        z49 = g4Var.f;
                    }
                    if (!this.C1) {
                        i26 = 8;
                        linearLayout.setVisibility(i26);
                    }
                    i26 = 0;
                    linearLayout.setVisibility(i26);
                }
                z26 = this.Y2;
                LinearLayout linearLayout2 = this.K0;
                if (z26) {
                    TLRPC.Chat chat6 = this.x1 < 0 ? MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1)) : null;
                    z27 = g4Var.f;
                    if (z27) {
                        if (this.X1 == null) {
                            v0();
                        }
                        u0();
                        y0();
                        x0();
                        this.X1.setVisibility(0);
                    } else if ((UserObject.isService(this.x1) || I0()) && (p2Var2 = this.X1) != null) {
                        p2Var2.setVisibility(8);
                    } else if (!this.y1 && ((!this.z1 || (this.A1 && (ChatObject.canSendPlain(chat6) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat6)))) && (p2Var3 = this.X1) != null)) {
                        p2Var3.setVisibility(0);
                    }
                    p2 p2Var5 = this.X1;
                    if (p2Var5 != null) {
                        z32 = g4Var.f;
                        p2Var5.setOnSendButtonLongClick(z32 ? new w1(this, 0) : null);
                        p2 p2Var6 = this.X1;
                        z33 = g4Var.f;
                        D0(true);
                        p2Var6.i1(z33);
                        p2 p2Var7 = this.X1;
                        z34 = g4Var.f;
                        p2Var7.o1(z34 && !D0(true) && (this.r2 || this.X1.S0), true);
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
                            z31 = g4Var.f;
                        }
                        if (!this.C1) {
                            i13 = 8;
                            linearLayout3.setVisibility(i13);
                        }
                        i13 = 0;
                        linearLayout3.setVisibility(i13);
                    }
                    p2 p2Var8 = this.X1;
                    if (p2Var8 != null) {
                        if (this.B1) {
                            z30 = g4Var.f;
                        }
                        if (!this.C1) {
                            z29 = true;
                            p2Var8.setEnabled(z29);
                        }
                        z29 = false;
                        p2Var8.setEnabled(z29);
                    }
                    a3 a3Var = this.S1;
                    if (a3Var != null) {
                        if (this.y1) {
                            z28 = g4Var.f;
                            if (!z28) {
                                i12 = 0;
                                a3Var.setVisibility(i12);
                            }
                        }
                        i12 = 8;
                        a3Var.setVisibility(i12);
                    }
                    FrameLayout frameLayout = this.W2;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (UserObject.isService(this.x1)) {
                        A0();
                        this.X2.setVisibility(0);
                    } else {
                        bg.t tVar = this.X2;
                        if (tVar != null) {
                            tVar.setVisibility(8);
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
                    p2 p2Var9 = this.X1;
                    if (p2Var9 != null) {
                        p2Var9.setVisibility(8);
                    }
                    a3 a3Var2 = this.S1;
                    if (a3Var2 != null) {
                        a3Var2.setVisibility(8);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                }
                gVar = this.Y1;
                if (gVar != null) {
                    p2 p2Var10 = this.X1;
                    if (p2Var10 != null && p2Var10.getVisibility() == 0) {
                        z48 = g4Var.f;
                        if (!z48) {
                            i25 = 0;
                            gVar.setVisibility(i25);
                        }
                    }
                    i25 = 8;
                    gVar.setVisibility(i25);
                }
                aVar = this.T1;
                h2 h2Var = this.H0;
                if (aVar != null) {
                    if (!this.Y2) {
                        z47 = g4Var.f;
                        if (z47) {
                            i24 = 0;
                            aVar.setVisibility(i24);
                            this.T1.a(h2Var.g(), false);
                            this.T1.setCount(h2Var.getUnreadMessagesCount());
                        }
                    }
                    i24 = 8;
                    aVar.setVisibility(i24);
                    this.T1.a(h2Var.g(), false);
                    this.T1.setCount(h2Var.getUnreadMessagesCount());
                }
                p1Var = this.W1;
                if (p1Var != null) {
                    if (!this.Y2) {
                        z46 = g4Var.f;
                        if (z46 && (f1Var = f1.S) != null && g4Var.k(f1Var.g())) {
                            i23 = 0;
                            p1Var.setVisibility(i23);
                            p1 p1Var2 = this.W1;
                            f1 f1Var5 = f1.S;
                            p1Var2.b(f1Var5 == null && f1Var5.o(), true);
                            p1 p1Var3 = this.W1;
                            f1 f1Var6 = f1.S;
                            p1Var3.a(f1Var6 != null || f1Var6.m(), true);
                        }
                    }
                    i23 = 8;
                    p1Var.setVisibility(i23);
                    p1 p1Var22 = this.W1;
                    f1 f1Var52 = f1.S;
                    p1Var22.b(f1Var52 == null && f1Var52.o(), true);
                    p1 p1Var32 = this.W1;
                    f1 f1Var62 = f1.S;
                    p1Var32.a(f1Var62 != null || f1Var62.m(), true);
                }
                if (this.V1 != null) {
                    s1 s1Var = this.U1;
                    if (!this.Y2) {
                        z45 = g4Var.f;
                        if (z45) {
                            i21 = 0;
                            s1Var.setVisibility(i21);
                            t1 t1Var = this.V1;
                            if (!this.Y2) {
                                z44 = g4Var.f;
                                if (z44) {
                                    i22 = 0;
                                    t1Var.setVisibility(i22);
                                    layoutParams = (FrameLayout.LayoutParams) this.V1.getLayoutParams();
                                    p1 p1Var4 = this.W1;
                                    dp = AndroidUtilities.dp((p1Var4 == null && p1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != dp) {
                                        layoutParams.rightMargin = dp;
                                        this.V1.setLayoutParams(layoutParams);
                                    }
                                }
                            }
                            i22 = 8;
                            t1Var.setVisibility(i22);
                            layoutParams = (FrameLayout.LayoutParams) this.V1.getLayoutParams();
                            p1 p1Var42 = this.W1;
                            dp = AndroidUtilities.dp((p1Var42 == null && p1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != dp) {
                            }
                        }
                    }
                    i21 = 8;
                    s1Var.setVisibility(i21);
                    t1 t1Var2 = this.V1;
                    if (!this.Y2) {
                    }
                    i22 = 8;
                    t1Var2.setVisibility(i22);
                    layoutParams = (FrameLayout.LayoutParams) this.V1.getLayoutParams();
                    p1 p1Var422 = this.W1;
                    dp = AndroidUtilities.dp((p1Var422 == null && p1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                    if (layoutParams.rightMargin != dp) {
                    }
                }
                z35 = g4Var.f;
                if (!z35 || ((g4Var.h == null && g4Var.i() == null && g4Var.g() == null) || this.Y2)) {
                    p3 p3Var3 = p3Var2;
                    if (this.G1) {
                        m9 m9Var6 = ((d9) this.M1).d;
                        m9Var6.H0 = false;
                        m9Var6.P();
                        c4 c4Var2 = this.M1;
                        this.f3 = false;
                        ((d9) c4Var2).e();
                    }
                    p3Var3.setVisibility(8);
                } else {
                    p3 p3Var4 = p3Var2;
                    p3Var4.U.b(g4Var.h, g4Var.i(), g4Var.g(), m9Var.V0 && !g4Var.g && (storyItem13 = g4Var.a) != null && storyItem13.translated, storyItem6 == g4Var.a);
                    p3Var4.setVisibility(0);
                }
                storyItem11 = g4Var.a;
                if (storyItem11 != null) {
                    TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                    if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                        if (h2Var.r(this.x1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                            h2Var.q(false, false);
                            this.H3 = 0L;
                            p2 p2Var11 = this.X1;
                            if (p2Var11 != null) {
                                p2Var11.J(true);
                                this.X1.R1();
                                r0(true);
                            }
                        }
                        h2Var.setVisibility(0);
                        l3Var2.invalidate();
                        if (this.M1 != null && K0()) {
                            ((d9) this.M1).a(this.F1, this.x1);
                        }
                        z36 = this.z1;
                        a3 a3Var3 = this.L0;
                        ImageView imageView3 = this.J0;
                        a3 a3Var4 = this.z0;
                        if (z36) {
                            if (this.O2) {
                                z43 = g4Var.f;
                                if (!z43) {
                                    i18 = 0;
                                    imageView3.setVisibility(i18);
                                    if (a3Var3 != null) {
                                        if (this.P2) {
                                            z42 = g4Var.f;
                                            if (!z42) {
                                                i20 = 0;
                                                a3Var3.setVisibility(i20);
                                            }
                                        }
                                        i20 = 8;
                                        a3Var3.setVisibility(i20);
                                    }
                                    if (!this.R1) {
                                        z41 = g4Var.f;
                                        if (!z41) {
                                            i19 = 0;
                                            a3Var4.setVisibility(i19);
                                        }
                                    }
                                    i19 = 8;
                                    a3Var4.setVisibility(i19);
                                }
                            }
                            i18 = 4;
                            imageView3.setVisibility(i18);
                            if (a3Var3 != null) {
                            }
                            if (!this.R1) {
                            }
                            i19 = 8;
                            a3Var4.setVisibility(i19);
                        } else {
                            if (this.O2) {
                                z38 = g4Var.f;
                                if (!z38) {
                                    i14 = 0;
                                    imageView3.setVisibility(i14);
                                    if (a3Var3 != null) {
                                        a3Var3.setVisibility(8);
                                    }
                                    if (!this.y1) {
                                        z37 = g4Var.f;
                                        if (!z37) {
                                            i15 = 0;
                                            a3Var4.setVisibility(i15);
                                            a3Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                        }
                                    }
                                    i15 = 8;
                                    a3Var4.setVisibility(i15);
                                    a3Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                }
                            }
                            i14 = 4;
                            imageView3.setVisibility(i14);
                            if (a3Var3 != null) {
                            }
                            if (!this.y1) {
                            }
                            i15 = 8;
                            a3Var4.setVisibility(i15);
                            a3Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                        }
                        a3Var4.requestLayout();
                        m9Var.a1.append(this.x1, i9);
                        if (this.G1) {
                            R0(0L);
                            g1();
                            z2Var2.bumpPriority();
                        }
                        h2Var.setLivePlayer(m9Var.w0);
                        this.H1 = 0;
                        if (m9Var.K0 != null && (storyItem12 = g4Var.a) != null) {
                            int i33 = storyItem12.id;
                            i17 = 0;
                            while (true) {
                                if (i17 < m9Var.K0.i.size()) {
                                    MessageObject messageObject = (MessageObject) m9Var.K0.i.get(i17);
                                    if (messageObject != null && messageObject.getId() == i33) {
                                        this.H1 = i17;
                                        break;
                                    }
                                    i17++;
                                } else {
                                    break;
                                }
                            }
                        }
                        int i34 = this.F1;
                        this.I1 = i34;
                        int i35 = this.w1;
                        this.J1 = i35;
                        if (m9Var.N0) {
                            this.I1 = (i35 - 1) - i34;
                        }
                        l10 = g4Var.l();
                        dh.g gVar2 = this.u0;
                        if (l10) {
                            gVar2.setVisibility(0);
                            this.a3 = g4Var.j() ? 1.0f : 0.5f;
                            boolean j12 = g4Var.j();
                            ImageView imageView4 = this.w0;
                            pi0 pi0Var = this.v0;
                            if (j12) {
                                pi0Var.setVisibility(0);
                                imageView4.setVisibility(8);
                                gVar2.setContentDescription(LocaleController.getString(!m9.z1 ? R.string.Mute : R.string.Unmute));
                            } else {
                                pi0Var.setVisibility(8);
                                imageView4.setVisibility(0);
                                gVar2.setContentDescription(LocaleController.getString(R.string.NoSound));
                            }
                            gVar2.setAlpha((1.0f - this.Z3) * this.a3);
                        } else {
                            gVar2.setVisibility(8);
                        }
                        u6Var7 = g4Var.b;
                        r8 r8Var = this.y0;
                        if (u6Var7 != null) {
                            r8Var.a(this.y1, u6Var7, z21 && this.X3);
                        } else {
                            TL_stories.StoryItem storyItem24 = g4Var.a;
                            if (storyItem24 != null) {
                                r8Var.b(this.y1, storyItem24, z21 && this.X3);
                            } else {
                                r8Var.b(this.y1, null, z21 && this.X3);
                            }
                        }
                        this.X3 = false;
                        r8Var.setTranslationX(gVar2.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z20) {
                            this.m3 = false;
                            TL_stories.StoryItem storyItem25 = g4Var.a;
                            if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                this.A0.setReaction(null);
                            } else {
                                this.A0.setReaction(hg.r0.d(reaction));
                            }
                        }
                        u6Var8 = g4Var.b;
                        if (u6Var8 == null && u6Var8.E) {
                            w0();
                            this.f2.set(g4Var.b.c.x);
                            this.f2.setVisibility(0);
                            ViewPropertyAnimator viewPropertyAnimator = this.g2;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.g2 = null;
                            }
                            if (z21) {
                                ViewPropertyAnimator interpolator = this.f2.animate().alpha(1.0f).setDuration(180L).setInterpolator(gr.h);
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
                                ViewPropertyAnimator withEndAction = this.f2.animate().alpha(0.0f).setDuration(180L).setInterpolator(gr.h).withEndAction(new x1(this, 0));
                                this.g2 = withEndAction;
                                withEndAction.start();
                            } else {
                                this.f2.setAlpha(0.0f);
                                this.f2.setVisibility(8);
                            }
                        }
                        this.t1.a(m9.z1, false);
                        if (this.G1 && g4Var.a != null) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.x1 + " storyId=" + g4Var.a.id + " " + g4.c(g4Var));
                        }
                        if (this.y1) {
                            g5.f(this.y2, this.x1, g4Var.a);
                        }
                        dg.c cVar = e4Var.b;
                        n6 n6Var3 = m9Var.K0;
                        cVar.setPadding(0, 0, (n6Var3 != null || n6Var3.g() == this.J1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.y2).getTranslateController().detectStoryLanguage(g4Var.a);
                        if (!z10 && !this.y1 && this.v3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                            x1 x1Var = new x1(this, 1);
                            this.v3 = x1Var;
                            AndroidUtilities.runOnUIThread(x1Var, 500L);
                        }
                        x3Var3 = this.C0;
                        if ((x3Var3 != null || !x3Var3.R) && g4Var.j() && m9.z1) {
                            if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                                AndroidUtilities.cancelRunOnUIThread(this.N3);
                                AndroidUtilities.runOnUIThread(this.N3, 250L);
                            }
                        }
                        imageView = this.s0;
                        if (imageView != null) {
                            if (I0() && !J0()) {
                                z40 = g4Var.e;
                                if (!z40) {
                                    i16 = 8;
                                    imageView.setVisibility(i16);
                                }
                            }
                            i16 = 0;
                            imageView.setVisibility(i16);
                        }
                        imageView2 = this.t0;
                        if (imageView2 != null) {
                            z39 = g4Var.f;
                            if (z39 && !r8Var.f) {
                                i32 = 0;
                            }
                            imageView2.setVisibility(i32);
                            return;
                        }
                        return;
                    }
                }
                h2Var.r(this.x1, null);
                h2Var.setVisibility(8);
                l3Var2.invalidate();
                if (this.M1 != null) {
                    ((d9) this.M1).a(this.F1, this.x1);
                }
                z36 = this.z1;
                a3 a3Var32 = this.L0;
                ImageView imageView32 = this.J0;
                a3 a3Var42 = this.z0;
                if (z36) {
                }
                a3Var42.requestLayout();
                m9Var.a1.append(this.x1, i9);
                if (this.G1) {
                }
                h2Var.setLivePlayer(m9Var.w0);
                this.H1 = 0;
                if (m9Var.K0 != null) {
                    int i332 = storyItem12.id;
                    i17 = 0;
                    while (true) {
                        if (i17 < m9Var.K0.i.size()) {
                        }
                        i17++;
                    }
                }
                int i342 = this.F1;
                this.I1 = i342;
                int i352 = this.w1;
                this.J1 = i352;
                if (m9Var.N0) {
                }
                l10 = g4Var.l();
                dh.g gVar22 = this.u0;
                if (l10) {
                }
                u6Var7 = g4Var.b;
                r8 r8Var2 = this.y0;
                if (u6Var7 != null) {
                }
                this.X3 = false;
                r8Var2.setTranslationX(gVar22.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z20) {
                }
                u6Var8 = g4Var.b;
                if (u6Var8 == null) {
                }
                if (this.f2 != null) {
                }
                this.t1.a(m9.z1, false);
                if (this.G1) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.x1 + " storyId=" + g4Var.a.id + " " + g4.c(g4Var));
                }
                if (this.y1) {
                }
                dg.c cVar2 = e4Var.b;
                n6 n6Var32 = m9Var.K0;
                cVar2.setPadding(0, 0, (n6Var32 != null || n6Var32.g() == this.J1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.y2).getTranslateController().detectStoryLanguage(g4Var.a);
                if (!z10) {
                    x1 x1Var2 = new x1(this, 1);
                    this.v3 = x1Var2;
                    AndroidUtilities.runOnUIThread(x1Var2, 500L);
                }
                x3Var3 = this.C0;
                if (x3Var3 != null) {
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
        l3Var = this.Y0;
        p3Var = this.G0;
        e4Var = this.k1;
        if (u6Var4 != null) {
        }
        p2Var = this.X1;
        if (p2Var != null) {
        }
        z17 = g4Var2.f;
        if (z17) {
        }
        pyVar.c();
        this.S0 = 0L;
        this.U0 = false;
        u6Var5 = g4Var2.b;
        if (u6Var5 == null) {
        }
        gcVar = gc.w;
        if (gcVar != null) {
            gcVar.b();
        }
        p3Var.J();
        q0();
        z16 = true;
        if (z16) {
        }
        e4Var.setOnSubtitleClick(null);
        TextView[] textViewArr2 = e4Var.c;
        this.M3 = 0;
        boolean z612 = z60;
        long j112 = this.x1;
        z2Var2 = z2Var;
        z19 = g4Var2.f;
        W0(j112, false, z19);
        u6Var6 = g4Var2.b;
        if (u6Var6 == null) {
        }
        z20 = z16;
        z21 = z59;
        l3Var2 = l3Var;
        p3Var2 = p3Var;
        charSequence4 = charSequence2;
        z22 = z612;
        charSequence = charSequence4;
        if (charSequence != null) {
        }
        x3Var = this.B0;
        if (x3Var != null) {
        }
        x3Var2 = this.C0;
        if (x3Var2 != null) {
        }
        storyItem10 = g4Var.a;
        if (storyItem6 == storyItem10) {
        }
        g4Var.o();
        if (!g4Var.g) {
        }
        m9 m9Var52 = ((d9) c4Var).d;
        m9Var52.V0 = false;
        m9Var52.P();
        z24 = g4Var.f;
        if (z24) {
        }
        if (z25 != this.C1) {
        }
        linearLayout = this.c2;
        int i322 = 8;
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
        h2 h2Var2 = this.H0;
        if (aVar != null) {
        }
        p1Var = this.W1;
        if (p1Var != null) {
        }
        if (this.V1 != null) {
        }
        z35 = g4Var.f;
        if (z35) {
        }
        p3 p3Var32 = p3Var2;
        if (this.G1) {
        }
        p3Var32.setVisibility(8);
        storyItem11 = g4Var.a;
        if (storyItem11 != null) {
        }
        h2Var2.r(this.x1, null);
        h2Var2.setVisibility(8);
        l3Var2.invalidate();
        if (this.M1 != null) {
        }
        z36 = this.z1;
        a3 a3Var322 = this.L0;
        ImageView imageView322 = this.J0;
        a3 a3Var422 = this.z0;
        if (z36) {
        }
        a3Var422.requestLayout();
        m9Var.a1.append(this.x1, i9);
        if (this.G1) {
        }
        h2Var2.setLivePlayer(m9Var.w0);
        this.H1 = 0;
        if (m9Var.K0 != null) {
        }
        int i3422 = this.F1;
        this.I1 = i3422;
        int i3522 = this.w1;
        this.J1 = i3522;
        if (m9Var.N0) {
        }
        l10 = g4Var.l();
        dh.g gVar222 = this.u0;
        if (l10) {
        }
        u6Var7 = g4Var.b;
        r8 r8Var22 = this.y0;
        if (u6Var7 != null) {
        }
        this.X3 = false;
        r8Var22.setTranslationX(gVar222.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z20) {
        }
        u6Var8 = g4Var.b;
        if (u6Var8 == null) {
        }
        if (this.f2 != null) {
        }
        this.t1.a(m9.z1, false);
        if (this.G1) {
        }
        if (this.y1) {
        }
        dg.c cVar22 = e4Var.b;
        n6 n6Var322 = m9Var.K0;
        cVar22.setPadding(0, 0, (n6Var322 != null || n6Var322.g() == this.J1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.y2).getTranslateController().detectStoryLanguage(g4Var.a);
        if (!z10) {
        }
        x3Var3 = this.C0;
        if (x3Var3 != null) {
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
        int i9;
        ImageReceiver imageReceiver;
        boolean isEmpty;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i10;
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        String l10 = e2.c.l(max, "_", max);
        ArrayList arrayList11 = this.O3;
        arrayList11.clear();
        ArrayList arrayList12 = this.P3;
        arrayList12.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.d1;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((hg.i0) arrayList.get(i11)).b(false);
            i11++;
        }
        arrayList.clear();
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                break;
            }
            int i13 = this.F1;
            if (i12 == 0) {
                i9 = i13 - 1;
                imageReceiver = this.b1;
                if (i9 < 0) {
                    imageReceiver.clearImage();
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList;
                    i10 = i12;
                    arrayList7 = arrayList11;
                    i12 = i10 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                }
                ArrayList arrayList13 = this.s1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.r1;
                if (isEmpty && i9 >= arrayList2.size()) {
                    V0((u6) arrayList13.get(i9 - arrayList2.size()), imageReceiver, l10);
                } else if (!arrayList2.isEmpty()) {
                    if (i9 < 0) {
                        i9 = 0;
                    }
                    if (i9 >= arrayList2.size()) {
                        i9 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i9);
                    long j10 = this.x1;
                    storyItem2.dialogId = j10;
                    u6 t10 = this.O1.t(j10, storyItem2);
                    if (t10 != null) {
                        V0(t10, imageReceiver, l10);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList;
                        i10 = i12;
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
                                i10 = i12;
                                arrayList3 = arrayList11;
                                arrayList5 = arrayList;
                                arrayList4 = arrayList12;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), ta.b.j(l10, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), l10, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i10 = i12;
                                String str2 = l10;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                l10 = str2;
                            }
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i10 = i12;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (z10) {
                                storyItem = storyItem2;
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), ta.b.j(l10, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), l10, null, null, null, 0L, null, storyItem, 0);
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
                                } catch (UnsupportedEncodingException e10) {
                                    e = e10;
                                    e.printStackTrace();
                                    if (storyItem.media_areas != null) {
                                    }
                                    arrayList9 = arrayList5;
                                    i12 = i10 + 1;
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
                                i12 = i10 + 1;
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
                        int i14 = 0;
                        while (i14 < storyItem.media_areas.size()) {
                            if (storyItem.media_areas.get(i14) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i14);
                                hg.i0 i0Var = new hg.i0(this);
                                i0Var.e(hg.r0.d(tL_mediaAreaSuggestedReaction.reaction));
                                i0Var.b(this.W0);
                                arrayList10 = arrayList5;
                                arrayList10.add(i0Var);
                            } else {
                                arrayList10 = arrayList5;
                            }
                            i14++;
                            arrayList5 = arrayList10;
                        }
                    }
                    arrayList9 = arrayList5;
                    i12 = i10 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                }
                arrayList8 = arrayList12;
                arrayList9 = arrayList;
                i10 = i12;
                arrayList7 = arrayList11;
                i12 = i10 + 1;
                arrayList11 = arrayList7;
                arrayList = arrayList9;
                arrayList12 = arrayList8;
            } else {
                i9 = i13 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.c1;
                if (i9 >= storiesCount) {
                    imageReceiver3.clearImage();
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList;
                    i10 = i12;
                    arrayList7 = arrayList11;
                    i12 = i10 + 1;
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
                    i10 = i12;
                    arrayList7 = arrayList11;
                    i12 = i10 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                }
            }
        }
        ArrayList arrayList14 = arrayList12;
        ArrayList arrayList15 = arrayList11;
        d9 d9Var = (d9) this.M1;
        m9 m9Var = d9Var.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z11 = m9Var.D0;
            ArrayList arrayList16 = m9Var.I0;
            if (z11) {
                return;
            }
            for (int i15 = 0; i15 < arrayList16.size(); i15++) {
                for (int i16 = 0; i16 < arrayList15.size(); i16++) {
                    if (((Uri) arrayList15.get(i16)).equals(((l9) arrayList16.get(i15)).uri)) {
                        arrayList15.remove(i16);
                    }
                }
            }
            for (int i17 = 0; i17 < arrayList15.size(); i17++) {
                Uri uri = (Uri) arrayList15.get(i17);
                l9 l9Var = new l9(m9Var, m9Var.y0, m9Var.x0);
                l9Var.setOnSeekUpdate(new j7(5, d9Var, l9Var));
                l9Var.uri = uri;
                TLRPC.Document document2 = (TLRPC.Document) arrayList14.get(i17);
                l9Var.document = document2;
                FileStreamLoadOperation.setPriorityForDocument(document2, 0);
                l9Var.preparePlayer(uri, m9.z1, m9.x1);
                arrayList16.add(l9Var);
                if (arrayList16.size() > 2) {
                    ((l9) arrayList16.remove(0)).release(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.xu0
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
        l3 l3Var = this.Y0;
        Bitmap createBitmap = Bitmap.createBitmap(l3Var.getWidth(), l3Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.F1;
    }

    public v6 getStoriesController() {
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
        int i9;
        ArrayList arrayList = this.v1;
        m9 m9Var = this.F0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.s1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i9 = 0;
            } else {
                i9 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j10 = ((u6) arrayList2.get(i10)).a;
                    if (((int) (j10 ^ (j10 >>> 32))) == m9Var.L0) {
                        this.F1 = i10;
                        return;
                    }
                }
            }
            int indexOf = this.v1.indexOf(Integer.valueOf(m9Var.L0));
            if (indexOf < 0 && !this.v1.isEmpty()) {
                if (m9Var.L0 > ((Integer) this.v1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (m9Var.L0 < ((Integer) j3.r0.j(1, this.v1)).intValue()) {
                    indexOf = this.v1.size() - 1;
                }
            }
            this.F1 = i9 + indexOf;
        } else {
            int i11 = m9Var.a1.get(this.x1, -1);
            this.F1 = i11;
            if (i11 == -1 && !m9Var.J0 && (peerStories = this.q1) != null && peerStories.max_read_id > 0) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.r1;
                    if (i12 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i12)).id > this.q1.max_read_id) {
                        this.F1 = i12;
                        break;
                    }
                    i12++;
                }
            }
        }
        if (this.F1 == -1) {
            this.F1 = 0;
        }
    }

    public final void j1() {
        n6 n6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.r1;
        arrayList.clear();
        m9 m9Var = this.F0;
        if (!m9Var.J0) {
            ArrayList arrayList2 = this.v1;
            int i9 = 0;
            ArrayList arrayList3 = this.s1;
            if (arrayList2 != null && (n6Var = m9Var.K0) != null) {
                if (n6Var instanceof f6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.y2).getStoriesController().E(this.x1);
                    String str = ((f6) m9Var.K0).E;
                    if (E != null) {
                        for (int i10 = 0; i10 < E.size(); i10++) {
                            u6 u6Var = (u6) E.get(i10);
                            kh.a8 a8Var = u6Var.c;
                            if (a8Var != null && !a8Var.g && TextUtils.equals(a8Var.K0, str)) {
                                arrayList3.add(u6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.v1;
                int size = arrayList4.size();
                while (i9 < size) {
                    Object obj = arrayList4.get(i9);
                    i9++;
                    MessageObject f10 = m9Var.K0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (m9Var.K0 != null) {
                while (i9 < m9Var.K0.i.size()) {
                    arrayList.add(((MessageObject) m9Var.K0.i.get(i9)).storyItem);
                    i9++;
                }
            } else {
                TL_stories.PeerStories peerStories = m9Var.M0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.x1) {
                    TL_stories.PeerStories y10 = this.O1.y(this.x1);
                    this.q1 = y10;
                    if (y10 == null) {
                        this.q1 = this.O1.z(this.x1);
                    }
                } else {
                    this.q1 = m9Var.M0;
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
        } else if (!m9Var.O0) {
            arrayList.add(m9Var.P0);
        }
        this.w1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        i4 currentPeerView;
        f50 f50Var = this.F2;
        if (f50Var != null) {
            f50Var.T = null;
            f50Var.d(false);
        }
        long j10 = this.x1;
        TL_stories.StoryItem storyItem = this.K1.a;
        m9 m9Var = this.F0;
        m9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            m9.A1.remove(j10 + (j10 >> 16) + (storyItem.id << 16));
        }
        this.e3 = true;
        c9 c9Var = m9Var.j0;
        if (c9Var != null && (currentPeerView = c9Var.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            gc I = new oc(this.Y0, this.x0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new x1(this, 2));
            I.r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.y2).ensureMessagesLoaded(this.x1, 0, null);
    }

    public final void k1(boolean z10) {
        int i9;
        g4 g4Var = this.K1;
        TL_stories.StoryItem storyItem = g4Var.a;
        if (storyItem == null) {
            storyItem = g4Var.c;
        }
        boolean z11 = this.z1;
        if (z11 || this.y1) {
            if (storyItem == null) {
                this.w2.setText("");
                this.B2.setVisibility(8);
                this.x2.setVisibility(8);
                return;
            }
            m9 m9Var = this.F0;
            a3 a3Var = this.z0;
            if (!z11) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.w2.setText(LocaleController.getString(m9Var.K0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                    this.w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.x2.setVisibility(8);
                    this.B2.setVisibility(8);
                } else {
                    int i10 = 0;
                    for (int i11 = 0; i11 < storyItem.views.recent_viewers.size(); i11++) {
                        TLObject userOrChat = MessagesController.getInstance(this.y2).getUserOrChat(storyItem.views.recent_viewers.get(i11).longValue());
                        if (userOrChat != null) {
                            this.x2.b(i10, userOrChat, this.y2);
                            i10++;
                        }
                        if (i10 >= 3) {
                            break;
                        }
                    }
                    for (int i12 = i10; i12 < 3; i12++) {
                        this.x2.b(i12, null, this.y2);
                    }
                    this.x2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        eq eqVar = new eq(R.drawable.mini_views_likes, 0);
                        eqVar.setOverrideColor(-53704);
                        eqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        eq eqVar2 = new eq(R.drawable.mini_repost_story, 0);
                        eqVar2.setOverrideColor(-14161823);
                        eqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(eqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.w2.setText(spannableStringBuilder);
                    if (i10 == 0) {
                        this.x2.setVisibility(8);
                        this.w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.x2.setVisibility(0);
                        this.w2.setTranslationX(AndroidUtilities.dp(10.0f) + e2.c.e(i10, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.B2.setVisibility(0);
                }
                a3Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
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
            if (i6Var == null || (i9 = storyViews2.forwards_count) <= 0) {
                this.R0 = false;
            } else {
                i6Var.q(Integer.toString(i9), z10 && this.R0, true);
                this.R0 = true;
            }
            int i13 = storyItem.views.reactions_count;
            if (i13 > 0) {
                this.M0.q(Integer.toString(i13), z10 && this.Q0, true);
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
                this.w2.setText(LocaleController.getString(m9Var.K0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.w2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new eq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.w2.setText(spannableStringBuilder2);
            } else {
                this.w2.setText("");
            }
            a3Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.Q0 ? this.M0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + a3Var.getLayoutParams().width;
            a3 a3Var2 = this.L0;
            if (a3Var2 != null) {
                a3Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.R0 ? this.N0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin += a3Var2.getLayoutParams().width;
                a3Var2.requestLayout();
            }
            this.S1.requestLayout();
            a3Var.requestLayout();
            this.x2.setVisibility(8);
            this.B2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = g4Var.a;
            g3 g3Var = this.f1;
            if (storyItem2 == null) {
                g3Var.getClass();
                return;
            }
            for (int i14 = 0; i14 < g3Var.getChildCount(); i14++) {
                if (g3Var.getChildAt(i14) instanceof t8) {
                    ((t8) g3Var.getChildAt(i14)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void l0() {
        a7 a7Var = this.A0;
        a7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new m2(0, a7Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        a7 a7Var2 = new a7(getContext(), this.t1);
        this.A0 = a7Var2;
        a7Var2.setPadding(dp, dp, dp, dp);
        this.A0.setAlpha(0.0f);
        this.A0.setScaleX(0.8f);
        this.A0.setScaleY(0.8f);
        this.A0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.z0.addView(this.A0, g7.e6.e(40, 40, 3));
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
        throw new UnsupportedOperationException("Method not decompiled: ih.i4.l1():void");
    }

    public final void m0(boolean z10) {
        ValueAnimator valueAnimator = this.Y3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z3, z10 ? 1.0f : 0.0f);
        this.Y3 = ofFloat;
        ofFloat.addUpdateListener(new y1(this, 2));
        this.Y3.addListener(new k2(this, z10, 1));
        this.Y3.setDuration(420L);
        this.Y3.setInterpolator(gr.h);
        this.Y3.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.y2).isFrozen()) {
            org.telegram.ui.b.b(this.y2);
            return;
        }
        int i9 = SharedConfig.stealthModeSendMessageConfirm;
        if (i9 <= 0 || !this.g3) {
            runnable.run();
            return;
        }
        int i10 = i9 - 1;
        SharedConfig.stealthModeSendMessageConfirm = i10;
        SharedConfig.updateStealthModeSendMessageConfirm(i10);
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 0, this.x0);
        c2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        c2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        gh.i3 i3Var = new gh.i3(runnable, 21);
        c2Var.h0 = string;
        c2Var.i0 = i3Var;
        String string2 = LocaleController.getString(R.string.Cancel);
        i3.i iVar = new i3.i(6);
        c2Var.j0 = string2;
        c2Var.k0 = iVar;
        c2Var.show();
    }

    public final void o0(int i9) {
        this.A2 = false;
        this.R2 = true;
        this.x3 = false;
        this.z1 = false;
        this.A1 = false;
        long j10 = this.x1;
        e4 e4Var = this.k1;
        org.telegram.ui.Components.z8 z8Var = this.j1;
        if (j10 >= 0) {
            this.y1 = j10 == UserConfig.getInstance(this.y2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.x1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.y2).isUserContactBlocked(this.x1);
            this.B1 = !UserConfig.getInstance(this.y2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.D1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            z8Var.m(this.y2, user);
            e4Var.a.getImageReceiver().setForUserOrChat(user, z8Var);
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
            z8Var.k(this.y2, chat);
            e4Var.a.getImageReceiver().setForUserOrChat(chat, z8Var);
            W0(this.x1, true, false);
        }
        if (this.G1 && (this.y1 || this.z1)) {
            v6 v6Var = this.O1;
            long j11 = this.x1;
            a0.h hVar = v6Var.m;
            v9 v9Var = (v9) hVar.f(j11);
            if (v9Var == null) {
                v9Var = new v9(v6Var.a, j11, v6Var);
                hVar.k(v9Var, j11);
            }
            v9Var.b(true);
        }
        j1();
        this.F1 = i9;
        if (i9 < 0) {
            this.F1 = 0;
        }
        this.S0 = 0L;
        this.U0 = false;
        this.F3 = null;
        this.G3 = null;
        boolean z10 = this.z1;
        l3 l3Var = this.Y0;
        m9 m9Var = this.F0;
        int i10 = 8;
        g4 g4Var = this.K1;
        if (z10) {
            B0();
            if (this.X1 == null && (this.A1 || g4Var.f)) {
                v0();
            }
            if (this.X1 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.y2).getChat(Long.valueOf(-this.x1));
                p2 p2Var = this.X1;
                if (g4Var.f || (!I0() && this.A1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i10 = 0;
                }
                p2Var.setVisibility(i10);
                p2 p2Var2 = this.X1;
                boolean z11 = g4Var.f;
                D0(true);
                p2Var2.i1(z11);
                this.X1.o1(g4Var.f && !D0(true) && (this.r2 || this.X1.S0), true);
                mt editField = this.X1.getEditField();
                long j12 = this.x1;
                TL_stories.StoryItem storyItem = g4Var.a;
                m9Var.getClass();
                editField.setText(m9.u(j12, storyItem));
                this.X1.b1(this.y2, this.x1);
                this.X1.K1(chat2, null);
            }
            org.telegram.ui.Components.i6 i6Var = this.M0;
            org.telegram.ui.ActionBar.b6 b6Var = this.x0;
            if (i6Var == null) {
                org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, false, false, false);
                this.M0 = i6Var2;
                a3 a3Var = this.z0;
                i6Var2.setCallback(a3Var);
                this.M0.r(b6Var.N0(org.telegram.ui.ActionBar.f6.G6));
                this.M0.t(AndroidUtilities.dp(14.0f));
                this.O0 = new org.telegram.ui.Components.y5(a3Var);
            }
            a3 a3Var2 = this.L0;
            if (a3Var2 != null && this.N0 == null) {
                org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, false, false, false);
                this.N0 = i6Var3;
                i6Var3.setCallback(a3Var2);
                this.N0.r(b6Var.N0(org.telegram.ui.ActionBar.f6.G6));
                this.N0.t(AndroidUtilities.dp(14.0f));
                this.P0 = new org.telegram.ui.Components.y5(a3Var2);
            }
            if (i9 == -1) {
                i1();
            }
            f1(false);
            this.w1 = getStoriesCount();
            l3Var.invalidate();
            invalidate();
        } else if (this.y1) {
            B0();
            if (g4Var.f) {
                this.S1.setVisibility(8);
                if (this.X1 == null) {
                    v0();
                }
                this.X1.setVisibility(0);
            } else {
                this.S1.setVisibility(0);
                p2 p2Var3 = this.X1;
                if (p2Var3 != null) {
                    p2Var3.setVisibility(8);
                }
            }
            p2 p2Var4 = this.X1;
            if (p2Var4 != null) {
                boolean z12 = g4Var.f;
                D0(true);
                p2Var4.i1(z12);
                this.X1.o1(g4Var.f && !D0(true) && (this.r2 || this.X1.S0), true);
            }
            if (i9 == -1) {
                ArrayList arrayList = this.v1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(m9Var.L0));
                    if (indexOf < 0 && !this.v1.isEmpty()) {
                        if (m9Var.L0 > ((Integer) this.v1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (m9Var.L0 < ((Integer) j3.r0.j(1, this.v1)).intValue()) {
                            indexOf = this.v1.size() - 1;
                        }
                    }
                    this.F1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.s1.isEmpty();
                    ArrayList arrayList2 = this.r1;
                    if (isEmpty) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i11)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i11)).id > this.O1.f.get(this.x1)) {
                                this.F1 = i11;
                                break;
                            }
                        }
                    } else {
                        this.F1 = arrayList2.size();
                    }
                }
            }
            f1(false);
            l3Var.invalidate();
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
                this.c2.setVisibility(((!this.B1 || g4Var.f) && !this.C1) ? 8 : 0);
            }
            k8 k8Var = this.f2;
            if (k8Var != null) {
                k8Var.setVisibility(8);
            }
            if (i9 == -1) {
                i1();
            }
            f1(false);
            p2 p2Var5 = this.X1;
            if (p2Var5 != null) {
                p2Var5.setVisibility((I0() || UserObject.isService(this.x1)) ? 8 : 0);
                p2 p2Var6 = this.X1;
                boolean z13 = g4Var.f;
                D0(true);
                p2Var6.i1(z13);
                this.X1.o1(g4Var.f && !D0(true) && (this.r2 || this.X1.S0), true);
                mt editField2 = this.X1.getEditField();
                long j13 = this.x1;
                TL_stories.StoryItem storyItem2 = g4Var.a;
                m9Var.getClass();
                editField2.setText(m9.u(j13, storyItem2));
                this.X1.b1(this.y2, this.x1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.y2).getUserFull(this.x1);
                if (userFull != null) {
                    this.X1.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.y2).loadFullUser(MessagesController.getInstance(this.y2).getUser(Long.valueOf(this.x1)), this.v2, false);
                }
            }
            this.w1 = getStoriesCount();
            a3 a3Var3 = this.S1;
            if (a3Var3 != null) {
                a3Var3.setVisibility(8);
            }
            l3Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W0 = true;
        this.a1.onAttachedToWindow();
        this.c1.onAttachedToWindow();
        this.b1.onAttachedToWindow();
        this.h3.onAttachedToWindow();
        this.j3.onAttachedToWindow();
        p2 p2Var = this.X1;
        if (p2Var != null) {
            p2Var.D0();
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d1;
            if (i9 >= arrayList.size()) {
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
            ((hg.i0) arrayList.get(i9)).b(true);
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.W0 = false;
        this.a1.onDetachedFromWindow();
        this.c1.onDetachedFromWindow();
        this.b1.onDetachedFromWindow();
        this.h3.onDetachedFromWindow();
        this.j3.onDetachedFromWindow();
        p2 p2Var = this.X1;
        if (p2Var != null) {
            p2Var.C0();
        }
        org.telegram.ui.Components.k5 k5Var = this.k3;
        if (k5Var != null) {
            k5Var.o(this);
            this.k3 = null;
        }
        hg.d dVar = this.i3;
        if (dVar != null) {
            dVar.d(this);
            this.i3 = null;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d1;
            if (i9 >= arrayList.size()) {
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
            ((hg.i0) arrayList.get(i9)).b(false);
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
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
    public final void onMeasure(int i9, int i10) {
        float f10;
        char c10;
        f50 f50Var;
        boolean z10;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        uj0 uj0Var;
        r2 r2Var;
        m9 m9Var = this.F0;
        if (m9Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i11 = 0;
        if (this.G1 && this.V2 == null) {
            this.u2 = ((d9) this.M1).d.l0;
        } else {
            this.u2 = 0;
        }
        int size = m9Var.b ? View.MeasureSpec.getSize(i10) : View.MeasureSpec.getSize(i10) + this.u2;
        int size2 = (int) ((View.MeasureSpec.getSize(i9) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.u2 < AndroidUtilities.dp(20.0f)) {
            this.u2 = 0;
        }
        int i12 = this.u2;
        uj0 uj0Var2 = this.n3;
        if (uj0Var2 == null || uj0Var2.getReactionsWindow() == null || this.n3.getReactionsWindow().q) {
            p2 p2Var = this.X1;
            if (p2Var != null && (p2Var.s0() || this.X1.f3)) {
                if (this.X1.getEmojiView().getMeasuredHeight() == 0) {
                    i12 = this.X1.getEmojiPadding();
                } else {
                    p2 p2Var2 = this.X1;
                    if (p2Var2.u3) {
                        p2Var2.K();
                        i12 = this.X1.getStickersExpandedHeight();
                    } else {
                        i12 = p2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.n3.getReactionsWindow().c.animate().translationY(-this.u2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
            i12 = 0;
        }
        boolean z11 = this.r2;
        int i13 = this.k2;
        e4 e4Var = this.k1;
        int i14 = 1;
        if (i13 != i12) {
            this.r2 = false;
            int i15 = 3;
            g4 g4Var = this.K1;
            f10 = 8.0f;
            if (i12 <= 0 || !this.G1) {
                p2 p2Var3 = this.X1;
                if (p2Var3 != null) {
                    m9.J(this.x1, g4Var.a, p2Var3.getEditText());
                }
            } else {
                this.r2 = true;
                this.e3 = false;
                this.p2 = i12;
                if (this.b2 == null) {
                    uj0 uj0Var3 = new uj0(1, this.y2, getContext(), LaunchActivity.R(), new n2(i15, this.x0));
                    this.b2 = uj0Var3;
                    uj0Var3.setHint(LocaleController.getString(this.A1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    uj0 uj0Var4 = this.b2;
                    uj0Var4.J0 = true;
                    addView(uj0Var4, this.E0, g7.e6.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.b2.setDelegate(new f3(this));
                    this.b2.p(null, null, true);
                }
                this.b2.setFragment(LaunchActivity.R());
                this.b2.setHint(LocaleController.getString(this.A1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                hg.n0 n0Var = hg.n0.B;
                if (n0Var != null) {
                    n0Var.l = true;
                }
                hg.n0 n0Var2 = hg.n0.C;
                if (n0Var2 != null) {
                    n0Var2.l = true;
                }
            }
            p2 p2Var4 = this.X1;
            if (p2Var4 != null) {
                p2Var4.o1(g4Var.f && !D0(true) && this.r2, true);
            }
            if (this.r2 && (r2Var = this.Z2) != null) {
                r2Var.setVisibility(0);
            }
            if (!this.r2 && (uj0Var = this.b2) != null) {
                uj0Var.n();
            }
            e4Var.setEnabled(!this.r2);
            if (this.X1 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.r2, 0.1f, true);
            }
            if (this.G1 && this.r2) {
                m9 m9Var2 = ((d9) this.M1).d;
                if (!m9Var2.x) {
                    m9Var2.x = true;
                    m9Var2.P();
                }
            }
            this.k2 = i12;
            ValueAnimator valueAnimator = this.l2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.J2.lock();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D2, i12);
            this.l2 = ofFloat;
            ofFloat.addUpdateListener(new y1(this, i11));
            this.l2.addListener(new l2(this, i14));
            if (this.r2) {
                this.l2.setDuration(250L);
                this.l2.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                m9Var.m();
            } else {
                this.l2.setDuration(500L);
                this.l2.setInterpolator(gr.h);
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
                        canvas.drawColor(i0.a.k(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (g4Var.f) {
                        kh.x3 x3Var = this.Z1;
                        if (x3Var != null) {
                            if (!x3Var.R) {
                                removeView(x3Var);
                            }
                        }
                        if (!D0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            kh.x3 x3Var2 = new kh.x3(getContext(), 3);
                            this.Z1 = x3Var2;
                            x3Var2.t(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.Z1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            kh.x3 x3Var3 = this.Z1;
                            x3Var3.G = Layout.Alignment.ALIGN_OPPOSITE;
                            x3Var3.h0 = new h3.g0(12, this, x3Var2);
                            addView(x3Var3, g7.e6.e(-1, 100, 87));
                            this.Z1.v();
                            l1();
                        }
                    }
                } else {
                    p2 p2Var5 = this.X1;
                    if (p2Var5 != null) {
                        p2Var5.getEditField().clearFocus();
                    }
                    kh.x3 x3Var4 = this.Z1;
                    if (x3Var4 != null) {
                        x3Var4.e(true);
                    }
                }
                this.q2 = true;
            } else {
                this.q2 = false;
            }
        } else {
            f10 = 8.0f;
        }
        p2 p2Var6 = this.X1;
        if (p2Var6 != null && p2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.X1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        l3 l3Var = this.Y0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) l3Var.getLayoutParams();
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
            l3Var.setLayoutParams(layoutParams2);
        }
        a3 a3Var = this.S1;
        if (a3Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) a3Var.getLayoutParams();
            if (this.t2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f10) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        bg.t tVar = this.X2;
        if (tVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) tVar.getLayoutParams();
            if (this.t2) {
                c10 = 0;
                this.X2.setTextColor(i0.a.d(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                f50Var = this.F2;
                if (f50Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) f50Var.getLayoutParams();
                    if (i12 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.l0.A(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i12;
                    }
                }
                z10 = this.t2;
                LinearLayout linearLayout = this.K0;
                p3 p3Var = this.G0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.y1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) p3Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.s2 != this.t2) {
                        p3Var.setLayoutParams((FrameLayout.LayoutParams) p3Var.getLayoutParams());
                    }
                    p3Var.q0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) p3Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
                    if (this.s2 != this.t2) {
                        p3Var.setLayoutParams((FrameLayout.LayoutParams) p3Var.getLayoutParams());
                    }
                    p3Var.q0 = AndroidUtilities.dp(f10);
                }
                this.R2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.y0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.u0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                dg.c cVar = e4Var.b;
                TextView[] textViewArr = e4Var.c;
                layoutParams = (FrameLayout.LayoutParams) cVar.getLayoutParams();
                if (layoutParams.rightMargin != dp) {
                    int i16 = (int) dp;
                    layoutParams.rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i16;
                    e4Var.forceLayout();
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.s2 = this.t2;
            }
            this.X2.setTextColor(i0.a.k(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c10 = 0;
        f50Var = this.F2;
        if (f50Var != null) {
        }
        z10 = this.t2;
        LinearLayout linearLayout2 = this.K0;
        p3 p3Var2 = this.G0;
        if (z10) {
        }
        this.R2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.y0.getVisibility() == 0) {
        }
        if (this.u0.getVisibility() == 0) {
        }
        dg.c cVar2 = e4Var.b;
        TextView[] textViewArr2 = e4Var.c;
        layoutParams = (FrameLayout.LayoutParams) cVar2.getLayoutParams();
        if (layoutParams.rightMargin != dp) {
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.s2 = this.t2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.m2 = -1.0f;
        this.R2 = true;
        invalidate();
    }

    public final void p0() {
        p3 p3Var = this.G0;
        if (p3Var.S.y()) {
            p3Var.S.f(false);
        }
    }

    public final void q0() {
        if (this.G1) {
            ((d9) this.M1).d.P();
        }
    }

    public final void r0(boolean z10) {
        if (this.X1 != null && this.b3 && this.W0) {
            x1 x1Var = this.L3;
            AndroidUtilities.cancelRunOnUIThread(x1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.O1.B;
            this.X1.J(true);
            boolean z11 = this.B1;
            g4 g4Var = this.K1;
            if ((z11 && !g4Var.f) || this.C1) {
                this.g3 = false;
                this.X1.setEnabled(false);
                this.X1.j1(" ", z10);
                return;
            }
            if (this.D1 > 0) {
                this.g3 = false;
                this.X1.setEnabled(true);
                this.X1.j1(oa.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.D1, ','))), z10);
                return;
            }
            if (!g4Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.y2).getCurrentTime();
                int i9 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i9) {
                    this.g3 = true;
                    int currentTime2 = i9 - ConnectionsManager.getInstance(this.y2).getCurrentTime();
                    int i10 = currentTime2 / 60;
                    int i11 = currentTime2 % 60;
                    int i12 = R.string.StealthModeActiveHintShort;
                    Locale locale = Locale.US;
                    int measureText = (int) this.X1.getEditField().getPaint().measureText(LocaleController.formatString(i12, String.format(locale, "%02d:%02d", 99, 99)));
                    this.X1.setEnabled(true);
                    if (measureText * 1.2f >= this.X1.getEditField().getMeasuredWidth()) {
                        p2 p2Var = this.X1;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11));
                        p2Var.e = formatString;
                        p2Var.f = format;
                        p2Var.G1(z10);
                    } else {
                        this.X1.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11))), z10);
                    }
                    AndroidUtilities.runOnUIThread(x1Var, 1000L);
                    return;
                }
            }
            this.g3 = false;
            this.X1.setEnabled(true);
            if (!g4Var.f) {
                this.X1.j1(LocaleController.getString(this.A1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            if (this.X1.getStarsPrice() <= 0) {
                this.X1.j1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.X1.j1(oa.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.X1.J4), z10);
            eq eqVar = this.X1.J4[0];
            if (eqVar != null) {
                eqVar.spaceScaleX = 0.9f;
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
        g3 g3Var = this.f1;
        if (g3Var != null) {
            kh.x3 x3Var = g3Var.c;
            if (x3Var != null) {
                x3Var.e(true);
                g3Var.c = null;
            }
            g3Var.b = null;
            g3Var.invalidate();
            g3Var.b(false);
        }
        p3 p3Var = this.G0;
        if (p3Var.S.y()) {
            p3Var.S.f(false);
            return true;
        }
        kh.x3 x3Var2 = this.B0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        kh.x3 x3Var3 = this.C0;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        s30 s30Var = this.S2;
        if (s30Var != null) {
            s30Var.b(true);
        }
        b4 b4Var = this.p1;
        if (b4Var != null && b4Var.b) {
            b4Var.a();
            return true;
        }
        p2 p2Var = this.X1;
        if (p2Var != null && p2Var.u0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.x0);
            if (this.X1.Y0) {
                alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new u1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((d9) this.M1).h(alertDialog$Builder.a);
            return true;
        }
        uj0 uj0Var = this.b2;
        if (uj0Var != null && uj0Var.getReactionsWindow() != null && !this.b2.getReactionsWindow().q) {
            this.b2.getReactionsWindow().d();
            return true;
        }
        p2 p2Var2 = this.X1;
        if (p2Var2 != null && p2Var2.s0()) {
            if (this.u2 > 0) {
                AndroidUtilities.hideKeyboard(this.X1.getEmojiView());
                return true;
            }
            this.X1.m0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (p3Var.getVisibility() != 0 || p3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            p3Var.C();
            this.c3 = false;
            this.Y0.invalidate();
            return true;
        }
        p2 p2Var3 = this.X1;
        if (p2Var3 != null) {
            long j10 = this.x1;
            TL_stories.StoryItem storyItem = this.K1.a;
            Editable editText = p2Var3.getEditText();
            this.F0.getClass();
            m9.J(j10, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.X1);
        return true;
    }

    public void setAccount(int i9) {
        this.y2 = i9;
        this.O1 = MessagesController.getInstance(i9).storiesController;
        this.g1.b = i9;
        uj0 uj0Var = this.b2;
        if (uj0Var != null) {
            uj0Var.setCurrentAccount(i9);
            this.b2.p(null, null, true);
        }
        uj0 uj0Var2 = this.n3;
        if (uj0Var2 != null) {
            uj0Var2.setCurrentAccount(i9);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(c4 c4Var) {
        this.M1 = c4Var;
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
                androidx.activity.i iVar = this.R3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    m9 m9Var = ((d9) this.M1).d;
                    m9Var.h1 = true;
                    m9Var.P();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.N1 != z10) {
            this.N1 = z10;
            z2 z2Var = this.a1;
            if (z10) {
                z2Var.stopAnimation();
                z2Var.setAllowStartAnimation(false);
            } else {
                z2Var.startAnimation();
                z2Var.setAllowStartAnimation(true);
            }
            this.T0 = 0L;
            this.Y0.invalidate();
        }
    }

    public final void t0() {
        if (this.E2 == null) {
            u2 u2Var = new u2(this, getContext(), this.x0);
            this.E2 = u2Var;
            u2Var.V1 = new v2(this);
            u2Var.f0.e0();
            u2 u2Var2 = this.E2;
            u2Var2.S = true;
            u2Var2.r1();
            u2 u2Var3 = this.E2;
            u2Var3.T = new w2(this);
            u2Var3.m1().setText(this.X1.getFieldText());
        }
    }

    public final void u0() {
        if (this.T1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.E3);
        this.T1 = aVar;
        aVar.setOnClickListener(new z1(this, 1));
        addView(this.T1, g7.e6.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.b6 b6Var = this.x0;
        p2 p2Var = new p2(this, AndroidUtilities.findActivity(getContext()), this, new n2(1, b6Var));
        this.X1 = p2Var;
        p2Var.getEditField().useAnimatedTextDrawable();
        this.X1.getEditField().setScaleX(0.0f);
        this.X1.setOverrideKeyboardAnimation(true);
        this.X1.setClipChildren(false);
        this.X1.setDelegate(new q2(this));
        setDelegate(this.X1);
        p2 p2Var2 = this.X1;
        p2Var2.t4 = false;
        p2Var2.u4 = true;
        if (this.K1.f) {
            p2Var2.V0(false, false, false);
        } else {
            p2Var2.V0(true, true, false);
        }
        this.X1.d();
        p2 p2Var3 = this.X1;
        p2Var3.v4 = true;
        addView(p2Var3, g7.e6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.K3 != null) {
            this.X1.P1(false);
        }
        this.X1.B2 = this.v2;
        h4 h4Var = this.I2;
        h4Var.g.add(this.Y0);
        h4Var.g.add(this);
        if (this.W0) {
            this.X1.D0();
        }
        r0(false);
        if (I0()) {
            this.X1.setVisibility(8);
        }
        rg.g gVar = new rg.g(getContext(), b6Var, this.E3, this.B3);
        this.Y1 = gVar;
        gVar.setOnClickListener(new u1(this, 1));
        addView(this.Y1, g7.e6.e(57, 300, 85));
        this.Y1.setVisibility(8);
        this.X1.setSideButtonsForAttach(this.Y1);
        this.E0 = getChildCount();
    }

    public final void w0() {
        if (this.f2 != null) {
            return;
        }
        k8 k8Var = new k8(getContext(), this.x0);
        this.f2 = k8Var;
        k8Var.setOnClickListener(new z1(this, 4));
        this.f2.setAlpha(0.0f);
        this.f2.setVisibility(8);
        addView(this.f2, g7.e6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.W1 != null || getContext() == null) {
            return;
        }
        p1 p1Var = new p1(getContext(), this.E3);
        this.W1 = p1Var;
        p1Var.setOnClickListener(new z1(this, 5));
        p1 p1Var2 = this.W1;
        f1 f1Var = f1.S;
        boolean z10 = true;
        p1Var2.b(f1Var != null && f1Var.o(), false);
        p1 p1Var3 = this.W1;
        f1 f1Var2 = f1.S;
        if (f1Var2 != null && !f1Var2.m()) {
            z10 = false;
        }
        p1Var3.a(z10, false);
        addView(this.W1, g7.e6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void y0() {
        if (this.V1 != null || getContext() == null) {
            return;
        }
        this.U1 = new s1(getContext(), this.y2);
        t1 t1Var = new t1(getContext(), this.U1, this.E3);
        this.V1 = t1Var;
        t1Var.setOnClickListener(new z1(this, 6));
        this.V1.setOnLongClickListener(new w1(this, 1));
        addView(this.V1, g7.e6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.U1, g7.e6.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
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
        textView3.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.e2.setGravity(17);
        g7.g6.a(this.e2);
        this.e2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.e2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.c2.addView(imageView, g7.e6.t(22, 22, 16, 12, 1, 4, 0));
        this.c2.addView(this.d2, g7.e6.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.c2.addView(this.e2, g7.e6.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.X1.addView(this.c2, g7.e6.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
