package nh;

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
import lh.ja;
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
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.ce;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cv0;
import org.telegram.ui.dz;
import org.telegram.ui.gk;
import org.telegram.ui.rb1;
import org.telegram.ui.xr;
import org.telegram.ui.zn;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class d4 extends qv0 implements NotificationCenter.NotificationCenterDelegate {
    public final z2 A0;
    public boolean A1;
    public int A2;
    public org.telegram.ui.ActionBar.g1 A3;
    public y6 B0;
    public boolean B1;
    public boolean B2;
    public org.telegram.ui.ActionBar.g1 B3;
    public ph.f3 C0;
    public boolean C1;
    public a3 C2;
    public final ng.a C3;
    public ph.f3 D0;
    public boolean D1;
    public boolean D2;
    public final sg.a D3;
    public ph.f3 E0;
    public long E1;
    public float E2;
    public final sg.d E3;
    public int F0;
    public final float F1;
    public t2 F2;
    public final qg.b F3;
    public final i9 G0;
    public int G1;
    public y50 G2;
    public TL_stories.TL_premium_boostsStatus G3;
    public final m3 H0;
    public boolean H1;
    public int H2;
    public ChannelBoostsController.CanApplyBoost H3;
    public final g2 I0;
    public int I1;
    public boolean I2;
    public long I3;
    public final View J0;
    public int J1;
    public final c4 J2;
    public long J3;
    public final ImageView K0;
    public int K1;
    public final AnimationNotificationsLocker K2;
    public boolean K3;
    public final LinearLayout L0;
    public final b4 L1;
    public final org.telegram.ui.Components.z5 L2;
    public TLRPC.TL_channels_sendAsPeers L3;
    public final z2 M0;
    public final a9.a M1;
    public final org.telegram.ui.Components.z5 M2;
    public final w1 M3;
    public org.telegram.ui.Components.j6 N0;
    public x3 N1;
    public float N2;
    public int N3;
    public org.telegram.ui.Components.j6 O0;
    public boolean O1;
    public long O2;
    public final w1 O3;
    public org.telegram.ui.Components.z5 P0;
    public t6 P1;
    public boolean P2;
    public final ArrayList P3;
    public org.telegram.ui.Components.z5 Q0;
    public boolean Q1;
    public boolean Q2;
    public final ArrayList Q3;
    public boolean R0;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public boolean S0;
    public boolean S1;
    public boolean S2;
    public final m2.b S3;
    public long T0;
    public z2 T1;
    public l40 T2;
    public final org.telegram.ui.Components.z5 T3;
    public long U0;
    public a U1;
    public final cv0 U2;
    public final org.telegram.ui.Components.z5 U3;
    public boolean V0;
    public r1 V1;
    public boolean V2;
    public final org.telegram.ui.Components.z5 V3;
    public boolean W0;
    public s1 W1;
    public w2 W2;
    public float W3;
    public boolean X0;
    public o1 X1;
    public FrameLayout X2;
    public final Path X3;
    public boolean Y0;
    public o2 Y1;
    public gg.q Y2;
    public boolean Y3;
    public final i3 Z0;
    public wg.g Z1;
    public boolean Z2;
    public ValueAnimator Z3;
    public final FrameLayout a1;
    public ph.f3 a2;
    public q2 a3;
    public float a4;
    public final y2 b1;
    public ValueAnimator b2;
    public float b3;
    public final ImageReceiver c1;
    public pk0 c2;
    public boolean c3;
    public final ImageReceiver d1;
    public LinearLayout d2;
    public boolean d3;
    public final ArrayList e1;
    public TextView e2;
    public boolean e3;
    public Runnable f1;
    public TextView f2;
    public boolean f3;
    public final f3 g1;
    public g8 g2;
    public boolean g3;
    public final dz h1;
    public ViewPropertyAnimator h2;
    public boolean h3;
    public h4 i1;
    public final pg.b i2;
    public final ImageReceiver i3;
    public float j1;
    public final pg.b j2;
    public mg.d j3;
    public final org.telegram.ui.Components.z8 k1;
    public final Paint k2;
    public final ImageReceiver k3;
    public final z3 l1;
    public int l2;
    public org.telegram.ui.Components.l5 l3;
    public final h8 m1;
    public ValueAnimator m2;
    public boolean m3;
    public h5.u n1;
    public float n2;
    public boolean n3;
    public int o1;
    public float o2;
    public pk0 o3;
    public org.telegram.ui.ActionBar.g1 p1;
    public float p2;
    public boolean p3;
    public w3 q1;
    public int q2;
    public float q3;
    public TL_stories.PeerStories r1;
    public boolean r2;
    public boolean r3;
    public final ArrayList s1;
    public boolean s2;
    public float s3;
    public final ImageView t0;
    public final ArrayList t1;
    public boolean t2;
    public int t3;
    public final ImageView u0;
    public final a4 u1;
    public boolean u2;
    public int u3;
    public final dh.d v0;
    public final kf.p0 v1;
    public int v2;
    public int v3;
    public final jj0 w0;
    public ArrayList w1;
    public final int w2;
    public w1 w3;
    public final ImageView x0;
    public int x1;
    public TextView x2;
    public float x3;
    public final org.telegram.ui.ActionBar.f6 y0;
    public long y1;
    public jh.b y2;
    public boolean y3;
    public final n8 z0;
    public boolean z1;
    public int z2;
    public xr z3;

    public d4(Context context, final i9 i9Var, a4 a4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.Y0 = true;
        this.e1 = new ArrayList();
        this.o1 = -5;
        this.F1 = 1.0f;
        b4 b4Var = new b4(this);
        this.L1 = b4Var;
        this.n2 = -1.0f;
        this.o2 = -1.0f;
        this.p2 = -1.0f;
        this.w2 = ConnectionsManager.generateClassGuid();
        this.L2 = new org.telegram.ui.Components.z5(this);
        this.M2 = new org.telegram.ui.Components.z5(this);
        cv0 cv0Var = new cv0();
        this.U2 = cv0Var;
        this.b3 = 1.0f;
        this.M3 = new w1(this, 4);
        this.O3 = new w1(this, 11);
        this.P3 = new ArrayList();
        this.Q3 = new ArrayList();
        this.S3 = new m2.b(this, 2);
        this.T3 = new org.telegram.ui.Components.z5(this);
        this.U3 = new org.telegram.ui.Components.z5(this);
        this.V3 = new org.telegram.ui.Components.z5(this);
        this.X3 = new Path();
        cv0Var.E = new o5.i(this, 28);
        c4 c4Var = new c4();
        c4Var.g = new ArrayList();
        this.J2 = c4Var;
        this.K2 = new AnimationNotificationsLocker();
        this.s1 = new ArrayList();
        this.t1 = new ArrayList();
        final int i10 = 0;
        y2 y2Var = new y2(this, i10);
        this.b1 = y2Var;
        y2Var.setCrossfadeWithOldImage(false);
        y2Var.setAllowLoadingOnAttachedOnly(true);
        y2Var.ignoreNotifications = true;
        y2Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.i3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.k3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.c1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.d1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        y2Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.k1 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.G0 = i9Var;
        this.u1 = a4Var;
        this.M1 = a4Var.g;
        this.P1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        a4Var.l.setColor(-16777216);
        this.k2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.y0 = f6Var;
        setClipChildren(false);
        f3 f3Var = new f3(this, context, this.Z0, f6Var, i9Var);
        this.g1 = f3Var;
        qg.b bVar = new qg.b(f6Var, org.telegram.ui.ActionBar.j6.Sd, 0.8f);
        this.F3 = bVar;
        sg.c cVar = new sg.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.E3 = null;
            this.D3 = cVar;
        } else {
            sg.d dVar = new sg.d(cVar);
            this.E3 = dVar;
            dVar.g(AndroidUtilities.dp(8.0f));
            this.D3 = dVar;
        }
        ug.i iVar = new ug.i(this);
        ng.a aVar = new ng.a(this.D3);
        aVar.d = iVar;
        aVar.e = this;
        this.C3 = aVar;
        this.i2 = aVar.c(this, bVar, false);
        pg.b c3 = aVar.c(this, bVar, false);
        this.j2 = c3;
        c3.t(AndroidUtilities.dp(32.0f));
        i3 i3Var = new i3(this, context, a4Var, i9Var);
        this.Z0 = i3Var;
        i3Var.setClipChildren(false);
        this.h1 = new dz(this.z2, i3Var);
        i3Var.addView(f3Var, k7.b6.c(-1.0f, -1));
        m3 m3Var = new m3(this, getContext(), i9Var.y, i9Var, f6Var);
        this.H0 = m3Var;
        m3Var.V.setOnClickListener(new y1(this, 10));
        ImageView imageView = new ImageView(context);
        this.K0 = imageView;
        imageView.setImageDrawable(a4Var.m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new y1(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        k7.d6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(a4Var.n);
        imageView2.setPadding(dp, dp, dp, dp);
        z2 z2Var = new z2(this, getContext(), 1);
        this.M0 = z2Var;
        org.telegram.ui.Components.j6 j6Var = this.O0;
        if (j6Var != null) {
            j6Var.setCallback(z2Var);
        }
        z2Var.setWillNotDraw(false);
        z2Var.setOnClickListener(new y1(this, 12));
        z2 z2Var2 = new z2(this, getContext(), 2);
        this.A0 = z2Var2;
        org.telegram.ui.Components.j6 j6Var2 = this.N0;
        if (j6Var2 != null) {
            j6Var2.setCallback(z2Var2);
        }
        z2Var2.setWillNotDraw(false);
        z2Var2.setOnClickListener(new y1(this, 13));
        z2Var2.setOnLongClickListener(new f2(i10, this, i9Var));
        y6 y6Var = new y6(context, a4Var);
        this.B0 = y6Var;
        y6Var.setPadding(dp, dp, dp, dp);
        z2Var2.addView(this.B0, k7.b6.e(40, 40, 3));
        z2Var.addView(imageView2, k7.b6.e(40, 40, 3));
        k7.d6.b(z2Var2, 0.3f, 5.0f);
        k7.d6.b(z2Var, 0.3f, 5.0f);
        y2Var.setAllowLoadingOnAttachedOnly(true);
        y2Var.setParentView(i3Var);
        kf.p0 p0Var = new kf.p0(10);
        this.v1 = p0Var;
        i3Var.setOutlineProvider(p0Var);
        i3Var.setClipToOutline(true);
        addView(i3Var);
        z3 z3Var = new z3(context, b4Var);
        this.l1 = z3Var;
        z3Var.setOnClickListener(new View.OnClickListener(this) { // from class: nh.u1
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        d4 d4Var = this.b;
                        long j10 = UserConfig.getInstance(d4Var.z2).clientUserId;
                        long j11 = d4Var.y1;
                        i9 i9Var2 = i9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                i9Var2.H(zn.R9(j11));
                                break;
                            } else {
                                i9Var2.H(ProfileActivity.m4(j11));
                                break;
                            }
                        } else {
                            Bundle h = android.support.v4.media.a.h(1, TeXSymbolParser.TYPE_ATTR);
                            h.putLong("dialog_id", d4Var.y1);
                            i9Var2.H(new ea0(h, null));
                            break;
                        }
                    default:
                        d4 d4Var2 = this.b;
                        if (!d4Var2.L1.j()) {
                            d4Var2.c1(true);
                            break;
                        } else {
                            i9Var.O();
                            if (!i9.A1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            d4Var2.v0.setContentDescription(LocaleController.getString(!i9.A1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        i3Var.addView(z3Var, k7.b6.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.L0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, k7.b6.q(40, 40, 5));
        linearLayout.addView(z2Var, k7.b6.q(40, 40, 5));
        linearLayout.addView(z2Var2, k7.b6.q(40, 40, 5));
        addView(linearLayout, k7.b6.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.t0 = imageView3;
        imageView3.setImageDrawable(a4Var.q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        i3Var.addView(imageView3, k7.b6.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.u0 = imageView4;
        imageView4.setImageDrawable(a4Var.r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        i3Var.addView(imageView4, k7.b6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new androidx.mediarouter.app.c(i9Var, 26));
        imageView3.setOnClickListener(new c0(this, f6Var, i9Var, context, a4Var, 1));
        dh.d dVar2 = new dh.d(context, 4);
        this.v0 = dVar2;
        i3Var.addView(dVar2, k7.b6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        jj0 jj0Var = new jj0(context);
        this.w0 = jj0Var;
        jj0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        dVar2.addView(jj0Var);
        ImageView imageView5 = new ImageView(context);
        this.x0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(a4Var.t);
        dVar2.addView(imageView5);
        imageView5.setVisibility(8);
        n8 n8Var = new n8(context);
        this.z0 = n8Var;
        n8Var.setOnClickListener(new y1(this, 2));
        i3Var.addView(n8Var, k7.b6.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i11 = 1;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: nh.u1
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        d4 d4Var = this.b;
                        long j10 = UserConfig.getInstance(d4Var.z2).clientUserId;
                        long j11 = d4Var.y1;
                        i9 i9Var2 = i9Var;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                i9Var2.H(zn.R9(j11));
                                break;
                            } else {
                                i9Var2.H(ProfileActivity.m4(j11));
                                break;
                            }
                        } else {
                            Bundle h = android.support.v4.media.a.h(1, TeXSymbolParser.TYPE_ATTR);
                            h.putLong("dialog_id", d4Var.y1);
                            i9Var2.H(new ea0(h, null));
                            break;
                        }
                    default:
                        d4 d4Var2 = this.b;
                        if (!d4Var2.L1.j()) {
                            d4Var2.c1(true);
                            break;
                        } else {
                            i9Var.O();
                            if (!i9.A1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            d4Var2.v0.setContentDescription(LocaleController.getString(!i9.A1 ? R.string.Mute : R.string.Unmute));
                            break;
                        }
                }
            }
        });
        this.m1 = new h8(this, a4Var);
        i3Var.addView(m3Var, k7.b6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.J0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        g2 g2Var = new g2(this, context, i9Var, i9Var.v, view, frameLayout, i9Var);
        this.I0 = g2Var;
        i3Var.addView(view, k7.b6.e(-1, 200, 87));
        i3Var.addView(g2Var, k7.b6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        i3Var.addView(frameLayout, k7.b6.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        dVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
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
        z2Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        z2Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        v9 v9Var = m3Var.T;
        View o10 = v9Var.o(context);
        if (o10 != null) {
            AndroidUtilities.removeFromParent(o10);
            addView(o10);
        }
        v9Var.D = new h2(this, 0);
        v9Var.T(this);
    }

    public static void V0(s6 s6Var, ImageReceiver imageReceiver, String str) {
        if (s6Var.s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(s6Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(s6Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(d4 d4Var, ValueAnimator valueAnimator) {
        n8 n8Var = d4Var.z0;
        d4Var.a4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z3 z3Var = d4Var.l1;
        z3Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.a4);
        z3Var.setAlpha(1.0f - d4Var.a4);
        ImageView imageView = d4Var.t0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.a4);
        imageView.setAlpha(1.0f - d4Var.a4);
        ImageView imageView2 = d4Var.u0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.a4);
        imageView2.setAlpha(1.0f - d4Var.a4);
        dh.d dVar = d4Var.v0;
        dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.a4);
        dVar.setAlpha((1.0f - d4Var.a4) * d4Var.b3);
        z2 z2Var = d4Var.T1;
        if (z2Var != null) {
            z2Var.setTranslationY(AndroidUtilities.dp(8.0f) * d4Var.a4);
            d4Var.T1.setAlpha(1.0f - d4Var.a4);
        }
        if (n8Var != null) {
            n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.a4);
            n8Var.setAlpha(1.0f - d4Var.a4);
        }
        d4Var.H0.setAlpha(1.0f - d4Var.a4);
        x3 x3Var = d4Var.N1;
        float f10 = x3Var == null ? 0.0f : ((z8) x3Var).d.S;
        float hideInterfaceAlpha = d4Var.getHideInterfaceAlpha();
        z2 z2Var2 = d4Var.A0;
        if (z2Var2 != null) {
            z2Var2.setAlpha((1.0f - d4Var.a4) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = d4Var.K0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - d4Var.a4) * (1.0f - f10) * hideInterfaceAlpha);
        }
        z2 z2Var3 = d4Var.M0;
        if (z2Var3 != null) {
            z2Var3.setAlpha((1.0f - d4Var.a4) * (1.0f - f10) * hideInterfaceAlpha);
        }
        o2 o2Var = d4Var.Y1;
        if (o2Var != null) {
            o2Var.setAlpha(1.0f - d4Var.a4);
            d4Var.invalidate();
        }
        d4Var.Z0.invalidate();
    }

    public static void a0(d4 d4Var, boolean z4) {
        org.telegram.ui.ActionBar.g1 g1Var = d4Var.A3;
        if (g1Var == null || d4Var.z3 == null || g1Var.getVisibility() != 0) {
            return;
        }
        if (z4) {
            if (Math.abs(i9.y1 - 0.2f) < 0.05f) {
                d4Var.A3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(i9.y1 - 0.5f) < 0.05f) {
                d4Var.A3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(i9.y1 - 1.0f) < 0.05f) {
                d4Var.A3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(i9.y1 - 1.5f) < 0.05f) {
                d4Var.A3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(i9.y1 - 2.0f) < 0.05f) {
                d4Var.A3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                d4Var.A3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, df.f.a(i9.y1) + "x"));
            }
        }
        d4Var.z3.a(i9.y1, z4);
    }

    public static void b0(d4 d4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (d4Var.I0() || d4Var.L1.f) {
            return;
        }
        if (UserConfig.getInstance(d4Var.z2).isPremium()) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, d4Var.y0).setOnClickListener(new y1(d4Var, 8));
            return;
        }
        Drawable drawable = d4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        i2 i2Var = new i2(d4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, d4Var.y0);
        c3.setOnClickListener(new y1(d4Var, 9));
        c3.setIcon(i2Var);
    }

    public static void d0(d4 d4Var) {
        b4 b4Var = d4Var.L1;
        TL_stories.StoryItem storyItem = b4Var.a;
        if ((storyItem == null && b4Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = b4Var.h();
        boolean z4 = b4Var.e;
        if (h == null || !h.exists()) {
            d4Var.a1();
            return;
        }
        MediaController.saveFile(h.toString(), d4Var.getContext(), z4 ? 1 : 0, null, null, new lh.m6(1, d4Var, z4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(d4 d4Var, long j10) {
        String str;
        boolean z4;
        TLRPC.Chat chat;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(d4Var.z2).getUser(Long.valueOf(j10));
            str = user.first_name;
            z4 = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(d4Var.z2).getChat(Long.valueOf(-j10));
            str = chat2.title;
            z4 = chat2.stories_hidden;
            chat = chat2;
        }
        AndroidUtilities.runOnUIThread(new lh.j(d4Var, MessagesController.getInstance(d4Var.z2), j10, !z4, str, chat), 200L);
    }

    public static void f0(d4 d4Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d4Var.getContext(), 0, d4Var.y0);
        alertDialog$Builder.a.O = LocaleController.getString(d4Var.I0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(d4Var.I0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new t1(d4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(8));
        z8 z8Var = (z8) d4Var.N1;
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        z8Var.h(d2Var);
        d2Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f10 = 1.0f - this.L2.c;
        m5 m5Var = this.G0.w;
        return (1.0f - (m5Var == null ? 0.0f : m5Var.f)) * f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        i9 i9Var;
        if (!this.L1.f || (i9Var = this.G0) == null || i9Var.x0 == null || D0(true)) {
            return 0L;
        }
        return i9Var.x0.j();
    }

    public static void h0(d4 d4Var) {
        org.telegram.ui.ActionBar.f6 f6Var = d4Var.y0;
        i3 i3Var = d4Var.Z0;
        if (d4Var.D1) {
            return;
        }
        int i10 = 1;
        if (!d4Var.B1) {
            o2 o2Var = d4Var.Y1;
            int i11 = -d4Var.o1;
            d4Var.o1 = i11;
            AndroidUtilities.shakeViewSpring(o2Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = d4Var.y1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(d4Var.z2).getUser(Long.valueOf(d4Var.y1))) : "";
            (MessagesController.getInstance(d4Var.z2).premiumFeaturesBlocked() ? new qc(i3Var, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new qc(i3Var, f6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w1(d4Var, 5))).j();
            return;
        }
        if (d4Var.G3 != null && d4Var.H3 != null) {
            eg.v0.C1(new eg.y1(d4Var, 4), d4Var.G3, d4Var.H3, d4Var.y1, true);
            return;
        }
        i9 i9Var = d4Var.G0;
        if (i9Var != null) {
            i9Var.h1 = true;
            i9Var.P();
        }
        MessagesController.getInstance(d4Var.z2).getBoostsController().getBoostsStats(d4Var.y1, new mg.i(d4Var, i10));
    }

    public static void j0(d4 d4Var) {
        b4 b4Var = d4Var.L1;
        if (b4Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = b4Var.a.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(d4Var.z2).getInputPeer(d4Var.y1);
        ConnectionsManager.getInstance(d4Var.z2).sendRequest(tL_stories_exportStoryLink, new x2());
    }

    public final void A0() {
        if (this.Y2 != null) {
            return;
        }
        gg.q qVar = new gg.q(getContext(), 2);
        this.Y2 = qVar;
        qVar.setTextSize(1, 14.0f);
        this.Y2.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.Y2.setGravity(19);
        this.Y2.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.Y2, k7.b6.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.T1 != null) {
            return;
        }
        z2 z2Var = new z2(this, getContext(), 0);
        this.T1 = z2Var;
        z2Var.setClickable(true);
        addView(this.T1, k7.b6.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        a3 a3Var = new a3(this, getContext());
        this.C2 = a3Var;
        a3Var.setOnClickListener(new y1(this, 0));
        this.T1.addView(this.C2, k7.b6.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        jh.b bVar = new jh.b(1, getContext(), false);
        this.y2 = bVar;
        bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.T1.addView(this.y2, k7.b6.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.x2 = textView;
        textView.setTextSize(1, 14.0f);
        this.x2.setTextColor(-1);
        this.T1.addView(this.x2, k7.b6.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.u1.s);
        a3 a3Var2 = this.C2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        a3Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.X2 != null) {
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
        org.telegram.ui.ActionBar.f6 f6Var = this.y0;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        TextView textView2 = new TextView(getContext());
        k7.d6.a(textView2);
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
        textView2.setOnClickListener(new y1(this, 3));
        linearLayout.addView(textView, k7.b6.n(-1, -2));
        linearLayout.addView(textView2, k7.b6.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, k7.b6.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.Z0.addView(frameLayout);
        this.X2 = frameLayout;
    }

    public final boolean D0(boolean z4) {
        e1 e1Var;
        TLRPC.Peer i10;
        e1 e1Var2;
        long clientUserId = UserConfig.getInstance(this.z2).getClientUserId();
        long j10 = this.y1;
        i9 i9Var = this.G0;
        if (j10 >= 0 || (e1Var2 = i9Var.x0) == null) {
            if (j10 < 0 || i9Var == null || (e1Var = i9Var.x0) == null || !e1Var.l()) {
                return false;
            }
            return !z4 || (i10 = i9Var.x0.i()) == null || this.y1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.y1 == clientUserId;
        }
        if (!z4) {
            return false;
        }
        TLRPC.Peer i11 = e1Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.z2).getChat(Long.valueOf(-this.y1));
        if (i9Var.x0.l() || ChatObject.canManageCalls(chat)) {
            return i11 == null || this.y1 == DialogObject.getPeerDialogId(i11) || DialogObject.getPeerDialogId(i11) == UserConfig.getInstance(this.z2).getClientUserId();
        }
        return false;
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        c4 c4Var = this.J2;
        org.telegram.ui.q4 q4Var = c4Var.d;
        if (q4Var != null && c4Var.c != null) {
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
        if (q4Var != null && (textureView = c4Var.e) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        i3 i3Var = this.Z0;
        canvas.scale(i10 / i3Var.getMeasuredWidth(), i11 / i3Var.getMeasuredHeight());
        this.b1.draw(canvas);
        canvas.restore();
    }

    public final void F0(ph.c8 c8Var, TL_stories.StoryItem storyItem) {
        x3 x3Var = this.N1;
        ph.e8 e8Var = new ph.e8(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.y0);
        e8Var.q1(c8Var);
        gk gkVar = e8Var.b;
        if (gkVar != null) {
            for (View view : gkVar.getViewPages()) {
                if (view instanceof ph.y7) {
                    ((ph.y7) view).e(false);
                }
            }
        }
        e8Var.k1(true);
        e8Var.Q = new mg.w(2, this, storyItem);
        ((z8) x3Var).h(e8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0190, code lost:
    
        if (r3 == r10.c2) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G0(ViewGroup viewGroup, float f10, float f11, boolean z4) {
        ph.f3 f3Var;
        c4 c4Var;
        org.telegram.ui.q4 q4Var;
        if (viewGroup != null) {
            ph.f3 f3Var2 = this.C0;
            if ((f3Var2 == null || !f3Var2.S) && ((f3Var = this.D0) == null || !f3Var.S)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        m3 m3Var = this.H0;
                        if (childAt == m3Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f10, (int) f11)) {
                                float top = f11 - childAt.getTop();
                                z7 z7Var = m3Var.V;
                                if (z7Var.w == 1.0f && !m3Var.p0) {
                                    if (top > z7Var.getTranslationY() + (m3Var.o0.getTop() - m3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.Z0 || (c4Var = this.J2) == null || (q4Var = c4Var.d) == null || !G0(q4Var, f10 - childAt.getX(), f11 - childAt.getY(), z4)) && (!childAt.isClickable() || !rect2.contains((int) f10, (int) f11))) {
                            f3 f3Var3 = this.g1;
                            if (childAt == f3Var3 && f3Var3.b == null && (f10 < AndroidUtilities.dp(60.0f) || f10 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = f3Var3.e;
                                float[] fArr = f3Var3.f;
                                for (int i11 = 0; i11 < f3Var3.getChildCount(); i11++) {
                                    View childAt2 = f3Var3.getChildAt(i11);
                                    if (childAt2 != f3Var3.d && (childAt2 instanceof p8)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f10;
                                        fArr[1] = f11;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                g2 g2Var = this.I0;
                                if (childAt == g2Var) {
                                    rb1 rb1Var = g2Var.f;
                                    lh.e1 e1Var = g2Var.c;
                                    rb1 rb1Var2 = g2Var.f;
                                    rb1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f10 - g2Var.getX()) - rb1Var2.getX()), (int) ((f11 - g2Var.getY()) - rb1Var2.getY()))) {
                                        if (g2Var.c0) {
                                            continue;
                                        } else if (!this.s2) {
                                            if (f11 <= g2Var.s() + g2Var.getY() && e1Var.E(f10, (f11 - g2Var.getY()) - e1Var.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.s2) {
                                        if (childAt == this.Y1 && f11 > rect2.top) {
                                        }
                                    }
                                    if (!z4) {
                                        if (rect2.contains((int) f10, (int) f11)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            o2 o2Var = this.Y1;
                                            if (o2Var != null && childAt == o2Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && G0((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), z4)) {
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
        i3 i3Var = this.Z0;
        float x11 = view.getX() + i3Var.getX() + x10;
        float y10 = view.getY() + i3Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + ((float) view.getHeight());
    }

    public final boolean I0() {
        l6 l6Var;
        i9 i9Var = this.G0;
        return (i9Var == null || (l6Var = i9Var.L0) == null || l6Var.e != 4) ? false : true;
    }

    public final boolean J0() {
        TLRPC.User user;
        return I0() && (user = MessagesController.getInstance(this.z2).getUser(Long.valueOf(this.G0.L0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean K0();

    public final void L0(mg.q0 q0Var) {
        boolean z4;
        TLRPC.Reaction reaction;
        b4 b4Var = this.L1;
        TL_stories.StoryItem storyItem = b4Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z10 = reaction2 != null;
        if (reaction2 != null && q0Var == null) {
            l0();
            this.P1.g0(this.y1, b4Var.a, null);
        } else if (q0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.z2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.m3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = mg.m0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.i3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                this.n3 = true;
                this.P1.g0(this.y1, b4Var.a, mg.q0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.P1.g0(this.y1, b4Var.a, q0Var);
        }
        TL_stories.StoryItem storyItem2 = b4Var.a;
        z2 z2Var = this.A0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.B0.setReaction(null);
            z2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z4 = false;
        } else {
            z10 = !z10;
            this.B0.setReaction(mg.q0.d(reaction));
            z2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z4 = true;
        }
        if (this.A1 && z10) {
            TL_stories.StoryItem storyItem3 = b4Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = b4Var.a.views;
            int i10 = storyViews.reactions_count + (z4 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = b4Var.a;
        mg.s0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        e1 e1Var;
        if (this.L3 != null) {
            return;
        }
        i9 i9Var = this.G0;
        if (i9Var != null && (e1Var = i9Var.x0) != null) {
            if (e1Var.v == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.z2).getSendAsPeers(this.y1, true);
        this.L3 = sendAsPeers;
        o2 o2Var = this.Y1;
        if (o2Var == null || sendAsPeers == null) {
            return;
        }
        o2Var.P1(true);
    }

    public final boolean N0() {
        o2 o2Var = this.Y1;
        if (o2Var == null) {
            return false;
        }
        boolean z4 = o2Var.v2;
        if (z4) {
            o2Var.s1();
        }
        AndroidUtilities.runOnUIThread(new w1(this, 3), 300L);
        return z4;
    }

    public final void O0() {
        CharSequence charSequence;
        long j10;
        cg.h0 h0Var;
        int i10;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.Y1.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.z2).getClientUserId();
        TLRPC.Peer i11 = this.G0.x0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.z2;
        String shortName = DialogObject.getShortName(i12, this.y1);
        long messageMinPrice = getMessageMinPrice();
        long j11 = this.I3;
        cg.h0 h0Var2 = new cg.h0(this, 25);
        b bVar = new b();
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, bVar, false, false);
        g3Var.fixNavigationBar();
        g3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        g3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j10 = j11;
            h0Var = h0Var2;
            i10 = ((org.telegram.ui.Components.u5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.u5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j11;
            h0Var = h0Var2;
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
        final lq[] lqVarArr = new lq[1];
        final ph.d dVar = new ph.d(context, null, true);
        final t0 t0Var = new t0();
        t0Var.c = clientUserId;
        t0Var.f = textWithEntities;
        t0Var.g = jArr[0];
        final o0 o0Var = new o0(i12, context, true);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        final dg.u2 u2Var = new dg.u2(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        f10.addView(u2Var, k7.b6.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final dg.u2 u2Var2 = new dg.u2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        f10.addView(u2Var2, k7.b6.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final dg.u2 u2Var3 = new dg.u2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        f10.addView(u2Var3, k7.b6.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final s sVar = new s(context, bVar, r6);
        final boolean[] zArr = {true};
        Utilities.Callback[] callbackArr = {new Utilities.Callback() { // from class: nh.r
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(ja.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), lqVarArr), true, true);
                long j12 = jArr2[0];
                t0 t0Var2 = t0Var;
                t0Var2.g = j12;
                o0Var.set(t0Var2);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = t.b(i16, intValue2, 0);
                int b11 = t.b(i16, num.intValue(), 1);
                int b12 = t.b(i16, num.intValue(), 2);
                ((org.telegram.ui.Components.k6) u2Var.b).c(b10 >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.k6) u2Var2.b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.k6) u2Var3.b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = t.b(i16, num.intValue(), 3);
                int b14 = t.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                sVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        o0Var.set(t0Var);
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
        if (arrayList.isEmpty() || ((Integer) kf.k0.i(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr5[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        sVar.b0 = iArr5;
        sVar.setValue((int) jArr[0]);
        linearLayout.addView(sVar, k7.b6.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(f10, k7.b6.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = k7.f6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, k7.b6.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = k7.f6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        org.telegram.ui.b.o(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, k7.b6.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(o0Var, k7.b6.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, k7.b6.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        g3Var.show();
        dVar.setOnClickListener(new dg.p(h0Var, jArr, g3Var, 10));
    }

    public final void P0() {
        if (this.Y1 == null) {
            return;
        }
        t0();
        this.F2.g0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.Y1.P();
        }
        this.F2.J1(-1, true);
        t2 t2Var = this.F2;
        t2Var.W = this.y1;
        t2Var.r1();
        this.F2.m1().setText(this.Y1.getFieldText());
        ((z8) this.N1).h(this.F2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j10 = this.y1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.z2).getDialog(this.y1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.G0.H(new zn(bundle));
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
        ph.k3 k3Var;
        e1 e1Var;
        boolean z4 = this.H1;
        c4 c4Var = this.J2;
        if (!z4) {
            c4Var.d = null;
            return;
        }
        b4 b4Var = this.L1;
        boolean z10 = b4Var.f;
        i3 i3Var = this.Z0;
        if (!z10) {
            if (!b4Var.e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): null, not a video");
                ((z8) this.N1).c(null, null, 0L, this.J2);
                c4Var.d = null;
                c4Var.f = false;
                return;
            }
            if (b4Var.f() == null || !new File(b4Var.f()).exists()) {
                TL_stories.StoryItem storyItem = b4Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.y1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = b4Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.z2).getFileReference(b4Var.a);
                            }
                            StringBuilder sb = new StringBuilder("?account=");
                            sb.append(this.z2);
                            sb.append("&id=");
                            sb.append(document2.id);
                            sb.append("&hash=");
                            sb.append(document2.access_hash);
                            sb.append("&dc=");
                            sb.append(document2.dc_id);
                            sb.append("&size=");
                            sb.append(document2.size);
                            sb.append("&mime=");
                            sb.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                            sb.append("&rid=");
                            sb.append(b4Var.a.fileReference);
                            sb.append("&name=");
                            sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb.append(Utilities.bytesToHex(bArr));
                            sb.append("&sid=");
                            sb.append(b4Var.a.id);
                            sb.append("&did=");
                            sb.append(b4Var.a.dialogId);
                            Uri parse = Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb.toString());
                            FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from " + parse);
                            this.O2 = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((z8) this.N1).c(document, uri, j10, this.J2);
                            i3Var.invalidate();
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
                this.O2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): playing from null?");
            }
            ((z8) this.N1).c(document, uri, j10, this.J2);
            i3Var.invalidate();
            return;
        }
        x3 x3Var = this.N1;
        TL_stories.StoryItem storyItem3 = b4Var.a;
        long j12 = this.y1;
        int i10 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z11 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        z8 z8Var = (z8) x3Var;
        z8Var.i(true, true);
        i9 i9Var = z8Var.d;
        e1 e1Var2 = i9Var.x0;
        if (e1Var2 == null || e1Var2.b != j12 || !e1Var2.f(inputGroupCall)) {
            ph.k3 k3Var2 = i9Var.A0;
            if (k3Var2 != null) {
                k3Var2.d(j12, null);
                ph.k3 k3Var3 = i9Var.A0;
                SurfaceViewRenderer surfaceViewRenderer = k3Var3.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = k3Var3.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                k3Var3.r = false;
                k3Var3.e(false, false);
            }
            j1 j1Var = j1.W;
            if (j1Var.P && (e1Var = j1Var.v) != null && e1Var.f(inputGroupCall)) {
                e1 e1Var3 = j1Var.v;
                j1Var.v = null;
                i9Var.x0 = e1Var3;
                j1Var.k(false);
            } else {
                e1 e1Var4 = i9Var.x0;
                if (e1Var4 != null) {
                    if (!e1Var4.n && (!j1Var.P || j1Var.v != e1Var4)) {
                        e1Var4.e();
                    } else if (e1Var4.L != i9Var.A0.getSink()) {
                        i9Var.x0.s(null);
                    }
                    i9Var.x0 = null;
                }
            }
            if (j1Var.P) {
                j1.j();
            }
            h9 h9Var = i9Var.w0;
            if (h9Var != null) {
                h9Var.release(null);
                i9Var.w0 = null;
            }
            c4 c4Var2 = i9Var.D0;
            if (c4Var2 != null) {
                c4Var2.b = null;
                c4Var2.a = null;
                c4Var2.f = false;
                c4Var2.d = null;
                c4Var2.e = null;
                c4Var2.c = null;
                c4Var2.a();
                i9Var.D0 = null;
            }
            if (i9Var.x0 == null) {
                e1 e1Var5 = e1.T;
                if (e1Var5 == null || !e1Var5.f(inputGroupCall)) {
                    e1 e1Var6 = new e1(z8Var.c, i9Var.h, storyItem3, j12, i10, z11, inputGroupCall, false, false);
                    j11 = j12;
                    i9Var.x0 = e1Var6;
                    k3Var = i9Var.B0;
                    if (k3Var == null) {
                        i9Var.x0.s(k3Var.getSink());
                    } else {
                        i9Var.x0.s(i9Var.A0.getSink());
                    }
                    i9Var.D0 = c4Var;
                    c4Var.f = false;
                    c4Var.d = i9Var.v0;
                    ph.k3 k3Var4 = i9Var.A0;
                    c4Var.e = k3Var4.d;
                    c4Var.c = k3Var4.c;
                    c4Var.a = i9Var.x0;
                    k3Var4.d(j11, c4Var);
                    i9Var.D0.a();
                } else {
                    i9Var.x0 = e1.T;
                }
            }
            j11 = j12;
            k3Var = i9Var.B0;
            if (k3Var == null) {
            }
            i9Var.D0 = c4Var;
            c4Var.f = false;
            c4Var.d = i9Var.v0;
            ph.k3 k3Var42 = i9Var.A0;
            c4Var.e = k3Var42.d;
            c4Var.c = k3Var42.c;
            c4Var.a = i9Var.x0;
            k3Var42.d(j11, c4Var);
            i9Var.D0.a();
        }
        i3Var.invalidate();
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
        boolean z4;
        if (uri == null || (storyItem = this.L1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
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
                z4 = true;
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
                z4 = false;
            }
            if (z4) {
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), str, str2, null, null, null, this.y1, null, null, storyItem, null, null, true, 0, null, null, false);
                return;
            } else {
                SendMessagesHelper.prepareSendingDocument(getAccountInstance(), null, null, parse, null, null, this.y1, null, null, storyItem, null, null, true, 0, null, null, false);
                return;
            }
        }
        parse = uri;
        String path2 = AndroidUtilities.getPath(parse);
        if (BuildVars.NO_SCOPED_STORAGE) {
        }
        if (z4) {
        }
    }

    public final void T0(long j10, boolean z4) {
        if (this.H1 != z4) {
            this.H1 = z4;
            jj0 jj0Var = this.w0;
            if (z4) {
                if (this.G0.a && Build.VERSION.SDK_INT < 33) {
                    i9 i9Var = ((z8) this.N1).d;
                    i9Var.i1 = true;
                    i9Var.P();
                    m2.b bVar = this.S3;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 100L);
                }
                R0(j10);
                g1();
                jj0Var.setAnimation(this.u1.u);
                this.H1 = true;
                this.l1.a.getImageReceiver().setVisible(true, true);
                b4 b4Var = this.L1;
                if (b4Var.a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.y1 + " storyId=" + b4Var.a.id + " " + b4.c(b4Var));
                }
            } else {
                p0();
                jj0Var.a();
                this.i1 = null;
                this.I2 = false;
                this.L2.d(0.0f, true);
                this.Z0.invalidate();
                invalidate();
                q0();
                i9 i9Var2 = ((z8) this.N1).d;
                i9Var2.F0 = false;
                i9Var2.P();
            }
            this.b1.setFileLoadingPriority(this.H1 ? 3 : 2);
            this.c1.setFileLoadingPriority(this.H1 ? 2 : 0);
            this.d1.setFileLoadingPriority(this.H1 ? 2 : 0);
            if (this.z1 || this.A1) {
                t6 t6Var = this.P1;
                long j11 = this.y1;
                boolean z10 = this.H1;
                a0.h hVar = t6Var.m;
                r9 r9Var = (r9) hVar.f(j11);
                if (r9Var == null) {
                    r9Var = new r9(t6Var.a, j11, t6Var);
                    hVar.k(r9Var, j11);
                }
                r9Var.b(z10);
            }
        }
    }

    public final void U0(int i10, long j10) {
        if (this.y1 != j10) {
            b4 b4Var = this.L1;
            b4Var.b = null;
            b4Var.a = null;
        }
        this.y1 = j10;
        this.w1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.G0.N0;
        boolean z4 = true;
        if (peerStories != null) {
            this.P1.S(peerStories, true);
            return;
        }
        t6 t6Var = this.P1;
        TL_stories.PeerStories y10 = t6Var.y(j10);
        if (y10 == null) {
            y10 = t6Var.z(j10);
        } else {
            z4 = false;
        }
        t6Var.S(y10, z4);
    }

    public final void W0(long j10, boolean z4, boolean z10) {
        if (!z4 && j10 == this.J3 && this.K3 == z10) {
            return;
        }
        this.J3 = j10;
        this.K3 = z10;
        z3 z3Var = this.l1;
        if (j10 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.z2).getChat(Long.valueOf(-j10));
            ig.c cVar = z3Var.b;
            ig.c cVar2 = z3Var.b;
            cVar.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                cVar2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(255);
            mq mqVar = new mq(mutate, null);
            mqVar.w = true;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            mqVar.h = dp;
            mqVar.n = dp2;
            cVar2.i(mqVar);
            return;
        }
        if (this.z1 && !z10) {
            z3Var.b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            z3Var.b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.z2).getUser(Long.valueOf(j10));
        if (user == null || !user.verified) {
            z3Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            mq mqVar2 = new mq(mutate2, null);
            mqVar2.w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            mqVar2.h = dp3;
            mqVar2.n = dp4;
            z3Var.b.i(mqVar2);
        }
        if (user != null) {
            z3Var.b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), z3Var.b.getPaint().getFontMetricsInt(), false), false);
        } else {
            z3Var.b.l(null, false);
        }
    }

    public final void X0(float f10, float f11, h4 h4Var) {
        this.j1 = f10;
        this.x3 = 1.0f / f11;
        if (this.i1 == h4Var) {
            return;
        }
        this.i1 = h4Var;
        if (h4Var != null) {
            ImageReceiver imageReceiver = h4Var.a;
            if (imageReceiver.getBitmap() != null) {
                this.b1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void Y0(boolean z4) {
        b4 b4Var = this.L1;
        if (b4Var.a != null) {
            i9 i9Var = this.G0;
            if (i9Var.f != null) {
                String e = b4Var.e();
                if (!z4) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e);
                    LaunchActivity.D1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                w2 w2Var = new w2(this, i9Var.f.getContext(), e, e, MessagesController.getInstance(this.z2).storiesEnabled() && (!(this.A1 || UserObject.isService(this.y1)) || ChatObject.isPublic(this.A1 ? MessagesController.getInstance(this.z2).getChat(Long.valueOf(-this.y1)) : null)), new m2(2, this.y0));
                this.W2 = w2Var;
                w2Var.f0 = true;
                TL_stories.StoryItem storyItem = b4Var.a;
                storyItem.dialogId = this.y1;
                w2Var.C0 = storyItem;
                w2Var.p0 = new androidx.biometric.e0(this, 21);
                ((z8) this.N1).h(w2Var);
            }
        }
    }

    public final void Z0() {
        i3 i3Var = this.Z0;
        org.telegram.ui.ActionBar.f6 f6Var = this.y0;
        org.telegram.messenger.y3.s(R.string.UnsupportedAttachment, new qc(i3Var, f6Var), f6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.y0);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.Q = string;
        ((z8) this.N1).h(d2Var);
    }

    public final void b1(boolean z4) {
        if (this.p3 != z4) {
            b4 b4Var = this.L1;
            if (b4Var.a == null) {
                return;
            }
            this.p3 = z4;
            int i10 = 0;
            if (z4) {
                this.o3.setVisibility(0);
            }
            this.o3.setStoryItem(b4Var.a);
            i9 i9Var = ((z8) this.N1).d;
            i9Var.m1 = z4;
            i9Var.P();
            if (!z4) {
                if (this.o3.getReactionsWindow() != null) {
                    this.o3.getReactionsWindow().e();
                }
                this.o3.animate().alpha(0.0f).setDuration(150L).setListener(new k2(this, i10)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.q3, z4 ? 1.0f : 0.0f);
            this.o3.setTransitionProgress(this.q3);
            ofFloat.addUpdateListener(new x1(this, 1));
            ofFloat.addListener(new j2(this, z4, i10));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(mr.g);
            ofFloat.start();
        }
    }

    public final void c1(boolean z4) {
        if (this.D0 == null) {
            ph.f3 f3Var = new ph.f3(getContext(), 1);
            f3Var.l(1.0f, -56.0f);
            this.D0 = f3Var;
            f3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.Z0.addView(this.D0, k7.b6.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.D0.s(LocaleController.getString(z4 ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.D0.u();
    }

    public final boolean d1(boolean z4) {
        if (this.G0.O0) {
            z4 = !z4;
        }
        if (!z4) {
            int i10 = this.G1;
            if (i10 > 0) {
                this.G1 = i10 - 1;
                f1(false);
                return true;
            }
        } else if (this.G1 < getStoriesCount() - 1) {
            this.G1++;
            f1(false);
            return true;
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e1 e1Var;
        int i12 = NotificationCenter.storiesUpdated;
        i9 i9Var = this.G0;
        boolean z4 = false;
        if (i10 == i12 || (i10 == NotificationCenter.storiesListUpdated && i9Var.L0 == objArr[0])) {
            x3 x3Var = this.N1;
            if (x3Var == null || !((z8) x3Var).d.E0) {
                if (this.H1) {
                    j1();
                    if (this.x1 == 0) {
                        if (this.B2) {
                            return;
                        }
                        this.B2 = true;
                        ((z8) this.N1).j();
                        return;
                    }
                    int i13 = this.G1;
                    ArrayList arrayList = this.s1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.t1;
                    if (i13 >= arrayList2.size() + size) {
                        this.G1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    f1(false);
                    if (this.z1 || this.A1) {
                        k1(true);
                    }
                }
                TL_stories.PeerStories peerStories = i9Var.N0;
                if (peerStories != null) {
                    this.P1.S(peerStories, true);
                } else {
                    long j10 = this.y1;
                    if (j10 != 0) {
                        t6 t6Var = this.P1;
                        TL_stories.PeerStories y10 = t6Var.y(j10);
                        if (y10 == null) {
                            y10 = t6Var.z(j10);
                            z4 = true;
                        }
                        t6Var.S(y10, z4);
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.p1;
                if (g1Var != null) {
                    g1Var.animate().alpha((this.P1.K(this.y1) && this.L1.e && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
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
            this.H0.V.invalidate();
            return;
        }
        if (i10 == NotificationCenter.stealthModeChanged) {
            r0(true);
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            n6 o10 = MessagesController.getInstance(this.z2).getStoriesController().o();
            if (o10 == null || !o10.a(this.z2, 1) || this.N1 == null) {
                return;
            }
            eg.y1 y1Var = new eg.y1(this, 4);
            Context findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.D1;
            }
            ((z8) this.N1).h(new eg.v0(o10.b(), this.z2, findActivity, y1Var, null));
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.z2).isUserContactBlocked(this.y1);
            boolean z10 = this.y1 >= 0 && !UserConfig.getInstance(this.z2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            if (this.C1 == z10 && this.E1 == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                return;
            }
            this.C1 = z10;
            this.E1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            f1(false);
            r0(true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.y1 == (-((TLRPC.ChatFull) obj).id)) {
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
        if (i9Var == null || (e1Var = i9Var.x0) == null || e1Var.g() != longValue) {
            return;
        }
        f1(false);
        o2 o2Var = this.Y1;
        if (o2Var != null) {
            o2Var.J(true);
            this.Y1.P1(true);
            r0(true);
        }
        g2 g2Var = this.I0;
        if (g2Var != null) {
            e1 e1Var2 = g2Var.M;
            if (g2Var.E != (e1Var2 != null ? e1Var2.j() : 0L)) {
                g2Var.e.N(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ae aeVar;
        Canvas canvas2;
        org.telegram.ui.Components.j6 j6Var;
        org.telegram.ui.Components.j6 j6Var2;
        l1();
        if (this.A1 && (j6Var2 = this.N0) != null) {
            j6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.A1 && (j6Var = this.O0) != null) {
            j6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z4 = this.r3;
        LinearLayout linearLayout = this.L0;
        z2 z2Var = this.A0;
        if (z4) {
            float measuredWidth = (z2Var.getMeasuredWidth() / 2.0f) + z2Var.getX() + linearLayout.getX();
            float measuredHeight = (z2Var.getMeasuredHeight() / 2.0f) + z2Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f10 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.t3, measuredWidth - f10, mr.g.getInterpolation(this.s3));
            float lerp2 = AndroidUtilities.lerp(this.u3, measuredHeight - f10, this.s3);
            int lerp3 = AndroidUtilities.lerp(this.v3, dp, this.s3);
            if (this.m3) {
                org.telegram.ui.Components.l5 l5Var = this.l3;
                if (l5Var != null) {
                    float f11 = lerp3;
                    l5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f11), (int) (lerp2 + f11));
                    this.l3.draw(canvas);
                }
            } else {
                float f12 = lerp3;
                ImageReceiver imageReceiver = this.k3;
                imageReceiver.setImageCoords(lerp, lerp2, f12, f12);
                imageReceiver.draw(canvas);
            }
        }
        if (this.n3) {
            float measuredWidth2 = (z2Var.getMeasuredWidth() / 2.0f) + z2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (z2Var.getMeasuredHeight() / 2.0f) + z2Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (this.m3) {
                mg.d dVar = this.j3;
                if (dVar != null) {
                    float f13 = dp2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f13), (int) (measuredHeight2 - f13), (int) (measuredWidth2 + f13), (int) (measuredHeight2 + f13));
                    this.j3.b(canvas);
                    if (this.j3.c()) {
                        this.j3.d(this);
                        this.j3 = null;
                        this.n3 = false;
                    }
                } else {
                    this.n3 = false;
                }
            } else {
                float f14 = dp2;
                float f15 = f14 / 2.0f;
                float f16 = measuredWidth2 - f15;
                float f17 = measuredHeight2 - f15;
                ImageReceiver imageReceiver2 = this.i3;
                imageReceiver2.setImageCoords(f16, f17, f14, f14);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().y()) {
                    this.n3 = false;
                }
            }
        }
        o2 o2Var = this.Y1;
        if (o2Var != null) {
            ce ceVar = o2Var.u1;
            ae aeVar2 = o2Var.v1;
            if (o2Var.getAlpha() == 0.0f || (aeVar = o2Var.b1) == null || aeVar.getParent() == null || o2Var.b1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(o2Var.b1.getX() + ceVar.getX() + aeVar2.getX() + o2Var.getX(), o2Var.b1.getY() + ceVar.getY() + aeVar2.getY() + o2Var.getY());
            if (o2Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight(), (int) (o2Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            o2Var.b1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        sg.d dVar;
        float dp;
        if (view == this.a3) {
            canvas.save();
            canvas.clipRect(0.0f, this.a3.getY(), getMeasuredWidth(), this.a3.getY() + this.a3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        o2 o2Var = this.Y1;
        Paint paint = this.k2;
        z2 z2Var = this.A0;
        a4 a4Var = this.u1;
        if (view == o2Var) {
            float f10 = this.n2;
            b4 b4Var = this.L1;
            if (f10 > 0.0f && !b4Var.f) {
                a4Var.l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), a4Var.l);
            }
            RectF rectF = a4Var.h;
            RectF rectF2 = a4Var.i;
            RectF rectF3 = a4Var.j;
            rectF.set(this.Y1.getX(), this.Y1.getY() + this.Y1.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.Y1.getX() + this.Y1.getMeasuredWidth(), this.Y1.getY() + this.Y1.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (b4Var.f) {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                o1 o1Var = this.X1;
                if (o1Var != null && o1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.P2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.Q2 && this.A1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (z2Var != null && z2Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + z2Var.getLayoutParams().width;
                }
                dp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.Y1.getY() + this.Y1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.Y1.getY() + this.Y1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.Y1.setTranslationX((1.0f - this.n2) * dp);
            this.Y1.getEditField().setTranslationY(e2.c.w(1.0f, this.n2, -AndroidUtilities.dp(2.0f), this.Y1.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.n2) * (this.Y1.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, a4Var.h, this.n2, rectF3);
            pg.b bVar = this.i2;
            if (bVar != null) {
                bVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                bVar.p(dp3);
                bVar.setAlpha((int) ((1.0f - this.a4) * (1.0f - this.o2) * 255.0f * getHideInterfaceAlpha()));
                bVar.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.n2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (o2Var != null && o2Var.u0(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = a4Var.k;
                RectF rectF5 = a4Var.k;
                rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.X3;
                path.rewind();
                path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                pg.b bVar2 = this.j2;
                if (bVar2 != null) {
                    bVar2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    bVar2.q(dp4, dp4, dp4, dp4);
                    bVar2.setAlpha(255);
                    bVar2.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, dp4, dp4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.c2 || this.Y1 == null) {
                if (view == this.o3) {
                    view.setTranslationY((this.L0.getY() + (z2Var.getY() + (-(r2.getMeasuredHeight() - this.o3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    i3 i3Var = this.Z0;
                    if (view == i3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.E3) != null && !dVar.n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(i3Var.getX(), i3Var.getY());
                        view.draw(a2);
                        dVar.c();
                    }
                }
            } else {
                view.setTranslationY(((this.Y1.getY() + this.Y1.getAnimatedTop()) + (-r2.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        if (MessagesController.getInstance(this.z2).storiesEnabled()) {
            File h = this.L1.h();
            if (h == null || !h.exists()) {
                a1();
                return;
            }
            w2 w2Var = this.W2;
            if (w2Var != null) {
                w2Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new w1(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0942, code lost:
    
        if (r4.g == (r1 == null && r1.translated && r1.translatedText != null && android.text.TextUtils.equals(r1.translatedLng, org.telegram.ui.Components.v31.B()))) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x09a2, code lost:
    
        if (r2 != false) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x09c7, code lost:
    
        if (r3 != false) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0adb, code lost:
    
        if (r6 != false) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0af4, code lost:
    
        if (r6 != false) goto L556;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0c2a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0c9b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0cd9  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0cf4  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0d06  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d6b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d93  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0dab A[EDGE_INSN: B:312:0x0dab->B:313:0x0dab BREAK  A[LOOP:0: B:301:0x0d89->B:310:0x0da8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0e1f  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0e5c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0f25  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0f56  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0f65  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0f8b  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0fac  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0fdb  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0ff8  */
    /* JADX WARN: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0fcb  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0ed5  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e65  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0e2f  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0923  */
    /* JADX WARN: Type inference failed for: r6v190 */
    /* JADX WARN: Type inference failed for: r6v191, types: [nh.v7, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v192 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z4) {
        s6 s6Var;
        TL_stories.StoryItem storyItem;
        s6 s6Var2;
        dz dzVar;
        boolean z10;
        boolean z11;
        boolean z12;
        y2 y2Var;
        int i10;
        TL_stories.StoryItem storyItem2;
        i9 i9Var;
        f9 f9Var;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        boolean z13;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z14;
        TL_stories.StoryItem storyItem4;
        s6 s6Var3;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem5;
        ph.t6 t6Var;
        TL_stories.StoryItem storyItem6;
        s6 s6Var4;
        int i11;
        ph.t6 t6Var2;
        e1 e1Var;
        boolean z15;
        i3 i3Var;
        m3 m3Var;
        z3 z3Var;
        o2 o2Var;
        boolean z16;
        s6 s6Var5;
        ic icVar;
        boolean z17;
        TL_stories.StoryItem storyItem7;
        boolean z18;
        boolean z19;
        s6 s6Var6;
        boolean z20;
        y2 y2Var2;
        i3 i3Var2;
        m3 m3Var2;
        z3 z3Var2;
        boolean z21;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        int i12;
        TLRPC.MessageMedia messageMedia2;
        boolean z22;
        ph.f3 f3Var;
        ph.f3 f3Var2;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem10;
        x3 x3Var;
        boolean z23;
        boolean z24;
        LinearLayout linearLayout;
        boolean z25;
        boolean z26;
        o2 o2Var2;
        o2 o2Var3;
        int i13;
        boolean z27;
        boolean z28;
        boolean z29;
        int i14;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        wg.g gVar;
        a aVar;
        o1 o1Var;
        boolean z34;
        TL_stories.StoryItem storyItem11;
        boolean z35;
        int i15;
        int i16;
        boolean z36;
        boolean z37;
        boolean l10;
        s6 s6Var7;
        s6 s6Var8;
        ph.f3 f3Var3;
        ImageView imageView;
        ImageView imageView2;
        boolean z38;
        int i17;
        boolean z39;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i18;
        int i19;
        int i20;
        boolean z40;
        int i21;
        boolean z41;
        boolean z42;
        TL_stories.StoryItem storyItem13;
        int i22;
        int i23;
        FrameLayout.LayoutParams layoutParams;
        int dp;
        boolean z43;
        boolean z44;
        int i24;
        boolean z45;
        e1 e1Var2;
        int i25;
        boolean z46;
        int i26;
        boolean z47;
        int i27;
        boolean z48;
        boolean z49;
        boolean z50;
        boolean z51;
        e1 e1Var3;
        String str;
        BitmapDrawable bitmapDrawable;
        dz dzVar2;
        i9 i9Var2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        l6 l6Var;
        ArrayList arrayList2 = this.s1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.t1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.S2 = true;
        b4 b4Var = this.L1;
        TL_stories.StoryItem storyItem14 = b4Var.a;
        s6 s6Var9 = b4Var.b;
        String s6 = m7.s();
        this.W0 = false;
        this.Z2 = false;
        int i28 = this.G1;
        boolean z52 = this.Q1;
        boolean z53 = this.R1;
        boolean z54 = this.S1;
        i9 i9Var3 = this.G0;
        if (i9Var3 == null || (l6Var = i9Var3.L0) == null || l6Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i28 < 0 || i28 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i28);
            int size = i28 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            s6Var = (size < 0 || size >= arrayList3.size()) ? null : (s6) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            s6Var = (i28 < 0 || i28 >= arrayList3.size()) ? null : (s6) arrayList3.get(i28);
            int size2 = i28 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        b4Var.c = null;
        f3 f3Var4 = this.g1;
        dz dzVar3 = this.h1;
        y2 y2Var3 = this.b1;
        if (s6Var != null) {
            ph.t6 t6Var3 = s6Var.c;
            this.R1 = false;
            boolean z55 = s6Var.F;
            this.S1 = z55;
            this.Q1 = !z55;
            y2Var3.setCrossfadeWithOldImage(false);
            y2Var3.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            Bitmap bitmap = t6Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (s6Var.s || s6Var.E) {
                BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                y2Var = y2Var3;
                s6Var2 = s6Var9;
                dzVar2 = dzVar3;
                z10 = z52;
                z11 = z53;
                z12 = z54;
                i9Var2 = i9Var3;
                i10 = i28;
                r62 = 0;
                y2Var.setImage(null, null, ImageLocation.getForPath(s6Var.f), s6, null, null, bitmapDrawable2, 0L, null, null, 0);
            } else {
                BitmapDrawable bitmapDrawable3 = bitmapDrawable;
                y2Var = y2Var3;
                s6Var2 = s6Var9;
                r62 = 0;
                dzVar2 = dzVar3;
                z10 = z52;
                z12 = z54;
                z11 = z53;
                i9Var2 = i9Var3;
                i10 = i28;
                y2Var.setImage(null, null, ImageLocation.getForPath(s6Var.e), s6, null, null, bitmapDrawable3, 0L, null, null, 0);
            }
            b4Var.b = s6Var;
            b4Var.j = r62;
            b4Var.i = r62;
            b4Var.a = r62;
            b4Var.d = false;
            b4Var.e = b4Var.m();
            TL_stories.StoryItem storyItem17 = b4Var.a;
            b4Var.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            dzVar = dzVar2;
            f3Var4.c(r62, m8.a(t6Var3), dzVar);
            this.R2 = false;
            this.Q2 = false;
            this.P2 = false;
            i9 i9Var4 = i9Var2;
            storyItem2 = storyItem14;
            i9Var = i9Var4;
        } else {
            s6Var2 = s6Var9;
            dzVar = dzVar3;
            z10 = z52;
            z11 = z53;
            z12 = z54;
            y2Var = y2Var3;
            i10 = i28;
            this.Q1 = false;
            this.R1 = false;
            this.S1 = false;
            if (storyItem == null) {
                if (i9Var3 != null) {
                    i9Var3.q(true);
                    return;
                }
                return;
            }
            s6 t6 = this.P1.t(this.y1, storyItem);
            if (t6 != null) {
                String str2 = t6.f;
                this.R1 = true;
                y2Var.setCrossfadeWithOldImage(false);
                y2Var.setCrossfadeDuration(this.f1 == null ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : 0);
                if (t6.s) {
                    storyItem2 = storyItem14;
                    i9Var = i9Var3;
                    s6Var3 = t6;
                    y2Var.setImage(null, null, ImageLocation.getForPath(str2), s6, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    i9Var = i9Var3;
                    s6Var3 = t6;
                    y2Var.setImage(null, null, ImageLocation.getForPath(str2), s6, null, 0L, null, null, 0);
                }
                b4Var.b = s6Var3;
                b4Var.j = null;
                b4Var.i = null;
                b4Var.a = null;
                b4Var.d = false;
                b4Var.e = b4Var.m();
                TL_stories.StoryItem storyItem18 = b4Var.a;
                b4Var.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                f3Var4.c(null, m8.a(s6Var3.c), dzVar);
                b4Var.c = storyItem;
                this.R2 = false;
                this.Q2 = false;
                this.P2 = false;
            } else {
                storyItem2 = storyItem14;
                i9Var = i9Var3;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z56 = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.y1;
                y2Var.setCrossfadeWithOldImage(z11);
                y2Var.setCrossfadeDuration(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.Z2 = true;
                    MessagesController.getInstance(this.z2).getStoriesController().p(storyItem.id, this.y1);
                    storyItem3 = storyItem;
                    z13 = z11;
                } else {
                    String str3 = storyItem.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            z56 = str3.toLowerCase().endsWith(".mp4");
                        }
                        if (z56) {
                            TLRPC.MessageMedia messageMedia6 = storyItem.media;
                            Drawable createStripedBitmap = messageMedia6 != null ? ImageLoader.createStripedBitmap(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                if (ImageLoader.getInstance().isInMemCache(ImageLocation.getForPath(storyItem.firstFramePath).getKey(null, null, false) + "@" + s6, false)) {
                                    z14 = z11;
                                    y2Var.setImage(null, null, ImageLocation.getForPath(storyItem.firstFramePath), s6, null, null, createStripedBitmap, 0L, null, null, 0);
                                }
                            }
                            z14 = z11;
                            y2Var.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), vh.w2.k(s6, "_pframe"), null, null, createStripedBitmap, 0L, null, null, 0);
                        } else {
                            z14 = z11;
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            Drawable createStripedBitmap2 = photo != null ? ImageLoader.createStripedBitmap(photo.sizes) : null;
                            if (z14) {
                                y2Var.setImage(ImageLocation.getForPath(storyItem.attachPath), s6, ImageLocation.getForPath(storyItem.firstFramePath), s6, createStripedBitmap2, 0L, null, null, 0);
                            } else {
                                y2Var.setImage(ImageLocation.getForPath(storyItem.attachPath), s6, null, null, createStripedBitmap2, 0L, null, null, 0);
                            }
                        }
                        storyItem3 = storyItem;
                        z13 = z14;
                    } else {
                        Drawable drawable = ((i9Var.L0 != null || i9Var.K0) && (f9Var = i9Var.p0) != null && (imageReceiver = f9Var.c) != null && f9Var.o == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.y1;
                        if (z56) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String k10 = vh.w2.k(s6, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            TL_stories.StoryItem storyItem19 = storyItem;
                            z13 = z11;
                            y2Var.setImage(null, null, forDocument, k10, forDocument2, s6, drawable, 0L, null, storyItem19, 0);
                            storyItem3 = storyItem19;
                        } else {
                            storyItem3 = storyItem;
                            z13 = z11;
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
                                y2Var.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2), s6, null, null, drawable, 0L, null, storyItem3, 0);
                            }
                        }
                    }
                }
                storyItem3.dialogId = this.y1;
                f3Var4.d(z4 ? null : storyItem3, dzVar);
                b4Var.n(storyItem3);
                boolean z57 = (this.Z2 || (storyItem4 = b4Var.a) == null || (storyItem4 instanceof TL_stories.TL_storyItemDeleted) || (storyItem4 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.R2 = z57;
                this.P2 = z57;
                if (z57) {
                    this.P2 = b4Var.d() && b4Var.a.isPublic;
                }
                if (this.P2) {
                    TL_stories.StoryItem storyItem20 = b4Var.a;
                    this.P2 = storyItem20.pinned || !m7.w(this.z2, storyItem20);
                }
                boolean z58 = this.P2;
                this.Q2 = z58;
                if (z58 && this.A1) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.z2).getChat(Long.valueOf(-this.y1));
                    this.Q2 = chat != null && ChatObject.isPublic(chat);
                }
                if (this.R2) {
                    if (this.A1) {
                        TLRPC.Chat chat2 = MessagesController.getInstance(this.z2).getChat(Long.valueOf(-this.y1));
                        this.R2 = (chat2 == null || ChatObject.getPublicUsername(chat2) == null) ? false : true;
                    } else {
                        TLRPC.User user = MessagesController.getInstance(this.z2).getUser(Long.valueOf(this.y1));
                        this.R2 = (user == null || UserObject.getPublicUsername(user) == null || !b4Var.a.isPublic) ? false : true;
                    }
                }
                NotificationsController.getInstance(this.z2).processReadStories(this.y1, storyItem3.id);
                storyItem5 = b4Var.a;
                if (storyItem5 != null && !z4) {
                    i9Var.M0 = storyItem5.id;
                }
                i9Var.k0.A();
                this.V2 = true;
                if (!this.z1 || this.A1) {
                    k1(false);
                }
                TL_stories.StoryItem storyItem21 = b4Var.a;
                s6 s6Var10 = b4Var.b;
                int i29 = storyItem21 == null ? storyItem21.id : (s6Var10 == null || (t6Var = s6Var10.c) == null) ? 0 : t6Var.f;
                if (storyItem2 == null) {
                    storyItem6 = storyItem2;
                    i11 = storyItem6.id;
                    s6Var4 = s6Var2;
                } else {
                    storyItem6 = storyItem2;
                    s6Var4 = s6Var2;
                    i11 = (s6Var2 == null || (t6Var2 = s6Var4.c) == null) ? 0 : t6Var2.f;
                }
                boolean z59 = (i29 == i11 && (s6Var4 == null || storyItem21 == null || !TextUtils.equals(s6Var4.e, storyItem21.attachPath))) ? false : true;
                boolean z60 = (z59 || (this.R1 == z13 && this.Q1 == z10 && this.S1 == z12)) ? false : true;
                e1Var = i9Var.x0;
                if (e1Var != null) {
                    int i30 = this.N3;
                    TLRPC.GroupCall groupCall = e1Var.v;
                    if (i30 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                        z15 = true;
                        i3Var = this.Z0;
                        m3Var = this.H0;
                        z3Var = this.l1;
                        if ((s6Var4 != null || (str = s6Var4.e) == null || !str.equals(b4Var.f())) && (storyItem6 == null || (storyItem7 = b4Var.a) == null || storyItem6.id != storyItem7.id)) {
                            o2Var = this.Y1;
                            if (o2Var != null) {
                                if (storyItem6 != null && !TextUtils.isEmpty(o2Var.getEditField().getText())) {
                                    i9.J(storyItem6.dialogId, storyItem6, this.Y1.getEditField().getText());
                                }
                                this.Y1.getEditField().setText(i9.u(this.y1, b4Var.a));
                                z17 = b4Var.f;
                                if (z17) {
                                    this.Y1.U0(false, false);
                                } else {
                                    this.Y1.U0(true, true);
                                }
                            }
                            z16 = b4Var.f;
                            if (z16) {
                                M0();
                            }
                            dzVar.c();
                            this.T0 = 0L;
                            this.V0 = false;
                            s6Var5 = b4Var.b;
                            if (s6Var5 != null) {
                                kj0 kj0Var = z3Var.d;
                                if (kj0Var != null) {
                                    kj0Var.e(s6Var5.h, false);
                                }
                                z3Var.a.invalidate();
                            } else if (!z60) {
                                z3Var.h = 0.0f;
                            }
                            icVar = ic.w;
                            if (icVar != null && icVar.h == i3Var) {
                                icVar.b();
                            }
                            m3Var.J();
                            q0();
                            z15 = true;
                        }
                        if (!z15 || (s6Var4 != null && b4Var.b == null)) {
                            z3Var.setOnSubtitleClick(null);
                            TextView[] textViewArr = z3Var.c;
                            this.N3 = 0;
                            z18 = z59;
                            long j10 = this.y1;
                            boolean z61 = z60;
                            z19 = b4Var.f;
                            W0(j10, false, z19);
                            s6Var6 = b4Var.b;
                            if (s6Var6 != null) {
                                charSequence3 = s6Var6.F ? LocaleController.getString(R.string.FailedToUploadStory) : m7.u(textViewArr[0], this.R1);
                            } else {
                                if (I0()) {
                                    TL_stories.StoryItem storyItem22 = b4Var.a;
                                    if (storyItem22 != null && (messageMedia2 = storyItem22.media) != null) {
                                        if (messageMedia2.document != null) {
                                            charSequence3 = LocaleController.formatStoryDate(r13.date);
                                        } else {
                                            if (messageMedia2.photo != null) {
                                                charSequence3 = LocaleController.formatStoryDate(r1.date);
                                            }
                                        }
                                    }
                                    z20 = z15;
                                    y2Var2 = y2Var;
                                    i3Var2 = i3Var;
                                    m3Var2 = m3Var;
                                    z3Var2 = z3Var;
                                    z21 = z61;
                                    charSequence = "";
                                } else {
                                    TL_stories.StoryItem storyItem23 = b4Var.a;
                                    if (storyItem23 == null) {
                                        z20 = z15;
                                        y2Var2 = y2Var;
                                        i3Var2 = i3Var;
                                        m3Var2 = m3Var;
                                        z3Var2 = z3Var;
                                        z21 = z61;
                                        charSequence = null;
                                    } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                                        spannableStringBuilder.setSpan(new b3(), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        e1 e1Var4 = i9Var.x0;
                                        if (e1Var4 != null) {
                                            TLRPC.GroupCall groupCall2 = e1Var4.v;
                                            i12 = 1;
                                            this.N3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                                        } else {
                                            i12 = 1;
                                        }
                                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i12, this.N3)));
                                        charSequence3 = spannableStringBuilder;
                                    } else if (storyItem23.date == -1) {
                                        charSequence3 = LocaleController.getString(R.string.CachedStory);
                                    } else {
                                        if (b4Var.i() != null) {
                                            v7 i31 = b4Var.i();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            z20 = z15;
                                            y2Var2 = y2Var;
                                            SpannableString spannableString = new SpannableString("r");
                                            i3Var2 = i3Var;
                                            m3Var2 = m3Var;
                                            spannableString.setSpan(new lq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) spannableString).append((CharSequence) " ");
                                            if (i31.b != null) {
                                                org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(textViewArr[0], 15.0f, this.z2);
                                                SpannableString spannableString2 = new SpannableString("a");
                                                spannableString2.setSpan(k5Var, 0, 1, 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                                if (i31.b.longValue() > 0) {
                                                    TLRPC.User user2 = MessagesController.getInstance(this.z2).getUser(i31.b);
                                                    k5Var.e(user2);
                                                    spannableStringBuilder2.append((CharSequence) UserObject.getUserName(user2));
                                                } else {
                                                    TLRPC.Chat chat3 = MessagesController.getInstance(this.z2).getChat(Long.valueOf(-i31.b.longValue()));
                                                    k5Var.b(chat3);
                                                    if (chat3 != null) {
                                                        spannableStringBuilder2.append((CharSequence) chat3.title);
                                                    }
                                                }
                                            } else {
                                                String str4 = b4Var.a.fwd_from.from_name;
                                                if (str4 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str4);
                                                }
                                            }
                                            z3Var.setOnSubtitleClick(new cg.n(26, this, i31));
                                            SpannableString spannableString3 = new SpannableString(".");
                                            ys ysVar = new ys();
                                            ysVar.b = AndroidUtilities.dp(1.5f);
                                            ysVar.c = 5.0f;
                                            spannableString3.setSpan(ysVar, 0, spannableString3.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(b4Var.a.date));
                                            z3Var2 = z3Var;
                                            charSequence = spannableStringBuilder2;
                                        } else {
                                            z20 = z15;
                                            y2Var2 = y2Var;
                                            i3Var2 = i3Var;
                                            m3Var2 = m3Var;
                                            if (!this.B1 || (storyItem8 = b4Var.a) == null || storyItem8.from_id == null) {
                                                z3Var2 = z3Var;
                                                String formatStoryDate = LocaleController.formatStoryDate(b4Var.a.date);
                                                charSequence2 = formatStoryDate;
                                                if (b4Var.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                                    ys ysVar2 = new ys();
                                                    ysVar2.b = AndroidUtilities.dp(1.5f);
                                                    ysVar2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(ysVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                                    valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                                    charSequence2 = valueOf;
                                                }
                                                charSequence = charSequence2;
                                                z21 = z61;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(textViewArr[0], 15.0f, this.z2);
                                                SpannableString spannableString4 = new SpannableString("a");
                                                spannableString4.setSpan(k5Var2, 0, 1, 33);
                                                spannableStringBuilder3.append((CharSequence) spannableString4).append((CharSequence) " ");
                                                long peerDialogId = DialogObject.getPeerDialogId(b4Var.a.from_id);
                                                if (peerDialogId > 0) {
                                                    TLRPC.User user3 = MessagesController.getInstance(this.z2).getUser(Long.valueOf(peerDialogId));
                                                    k5Var2.e(user3);
                                                    spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user3));
                                                    z3Var2 = z3Var;
                                                } else {
                                                    z3Var2 = z3Var;
                                                    TLRPC.Chat chat4 = MessagesController.getInstance(this.z2).getChat(Long.valueOf(-peerDialogId));
                                                    k5Var2.b(chat4);
                                                    if (chat4 != null) {
                                                        spannableStringBuilder3.append((CharSequence) chat4.title);
                                                    }
                                                }
                                                z3Var2.setOnSubtitleClick(new dh.s(this, peerDialogId, 3));
                                                SpannableString spannableString5 = new SpannableString(".");
                                                ys ysVar3 = new ys();
                                                ysVar3.b = AndroidUtilities.dp(1.5f);
                                                ysVar3.c = 5.0f;
                                                spannableString5.setSpan(ysVar3, 0, spannableString5.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(b4Var.a.date));
                                                charSequence = spannableStringBuilder3;
                                            }
                                        }
                                        z21 = false;
                                    }
                                }
                                if (charSequence == null) {
                                    l6 l6Var2 = i9Var.L0;
                                    if (l6Var2 == null || (storyItem9 = b4Var.a) == null || !l6Var2.m(storyItem9.id)) {
                                        z22 = false;
                                    } else {
                                        if (!(charSequence instanceof SpannableStringBuilder)) {
                                            charSequence = new SpannableStringBuilder(charSequence);
                                        }
                                        SpannableString spannableString6 = new SpannableString("p ");
                                        z22 = false;
                                        spannableString6.setSpan(new lq(R.drawable.msg_pin_mini), 0, 1, 33);
                                        ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString6);
                                    }
                                    z3Var2.c(charSequence, z21);
                                } else {
                                    z22 = false;
                                }
                                f3Var = this.C0;
                                if (f3Var != null) {
                                    f3Var.e(z22);
                                }
                                f3Var2 = this.D0;
                                if (f3Var2 != null) {
                                    f3Var2.e(z22);
                                }
                            }
                            z20 = z15;
                            y2Var2 = y2Var;
                            i3Var2 = i3Var;
                            m3Var2 = m3Var;
                            z3Var2 = z3Var;
                            charSequence2 = charSequence3;
                            charSequence = charSequence2;
                            z21 = z61;
                            if (charSequence == null) {
                            }
                            f3Var = this.C0;
                            if (f3Var != null) {
                            }
                            f3Var2 = this.D0;
                            if (f3Var2 != null) {
                            }
                        } else {
                            z18 = z59;
                            z20 = z15;
                            y2Var2 = y2Var;
                            i3Var2 = i3Var;
                            m3Var2 = m3Var;
                            z3Var2 = z3Var;
                        }
                        storyItem10 = b4Var.a;
                        if (storyItem6 == storyItem10 && s6Var4 == b4Var.b) {
                        }
                        b4Var.o();
                        if ((!b4Var.g || storyItem6 != b4Var.a) && (x3Var = this.N1) != null) {
                            i9 i9Var5 = ((z8) x3Var).d;
                            i9Var5.W0 = false;
                            i9Var5.P();
                        }
                        z23 = b4Var.f;
                        z24 = !z23 && (e1Var3 = i9Var.x0) != null && b4Var.k(e1Var3.g()) && i9Var.x0.b();
                        if (z24 != this.D1) {
                            this.D1 = z24;
                            if (z24) {
                                z0();
                            }
                            if (this.d2 != null && (this.C1 || this.D1)) {
                                h1();
                            }
                            o2 o2Var4 = this.Y1;
                            if (o2Var4 != null) {
                                if (this.C1) {
                                    z51 = b4Var.f;
                                }
                                if (!this.D1) {
                                    z50 = true;
                                    o2Var4.setEnabled(z50);
                                    z49 = true;
                                    this.Y1.P1(true);
                                }
                                z50 = false;
                                o2Var4.setEnabled(z50);
                                z49 = true;
                                this.Y1.P1(true);
                            } else {
                                z49 = true;
                            }
                            r0(z49);
                        }
                        linearLayout = this.d2;
                        if (linearLayout != null) {
                            if (this.C1) {
                                z48 = b4Var.f;
                            }
                            if (!this.D1) {
                                i27 = 8;
                                linearLayout.setVisibility(i27);
                            }
                            i27 = 0;
                            linearLayout.setVisibility(i27);
                        }
                        z25 = this.Z2;
                        LinearLayout linearLayout2 = this.L0;
                        if (z25) {
                            C0();
                            A0();
                            this.X2.setVisibility(0);
                            this.Y2.setVisibility(0);
                            this.R2 = false;
                            this.Q2 = false;
                            this.P2 = false;
                            o2 o2Var5 = this.Y1;
                            if (o2Var5 != null) {
                                o2Var5.setVisibility(8);
                            }
                            z2 z2Var = this.T1;
                            if (z2Var != null) {
                                z2Var.setVisibility(8);
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat chat5 = this.y1 < 0 ? MessagesController.getInstance(this.z2).getChat(Long.valueOf(-this.y1)) : null;
                            z26 = b4Var.f;
                            if (z26) {
                                if (this.Y1 == null) {
                                    v0();
                                }
                                u0();
                                y0();
                                x0();
                                this.Y1.setVisibility(0);
                            } else if ((UserObject.isService(this.y1) || I0()) && (o2Var2 = this.Y1) != null) {
                                o2Var2.setVisibility(8);
                            } else if (!this.z1 && ((!this.A1 || (this.B1 && (ChatObject.canSendPlain(chat5) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat5)))) && (o2Var3 = this.Y1) != null)) {
                                o2Var3.setVisibility(0);
                            }
                            o2 o2Var6 = this.Y1;
                            if (o2Var6 != null) {
                                z31 = b4Var.f;
                                o2Var6.setOnSendButtonLongClick(z31 ? new v1(this, 0) : null);
                                o2 o2Var7 = this.Y1;
                                z32 = b4Var.f;
                                D0(true);
                                o2Var7.i1(z32);
                                o2 o2Var8 = this.Y1;
                                z33 = b4Var.f;
                                o2Var8.o1(z33 && !D0(true) && (this.s2 || this.Y1.T0), true);
                            }
                            if (this.C1 && this.d2 == null) {
                                z0();
                            }
                            if (this.d2 != null) {
                                if (this.C1 || this.D1) {
                                    h1();
                                }
                                LinearLayout linearLayout3 = this.d2;
                                if (this.C1) {
                                    z30 = b4Var.f;
                                }
                                if (!this.D1) {
                                    i14 = 8;
                                    linearLayout3.setVisibility(i14);
                                }
                                i14 = 0;
                                linearLayout3.setVisibility(i14);
                            }
                            o2 o2Var9 = this.Y1;
                            if (o2Var9 != null) {
                                if (this.C1) {
                                    z29 = b4Var.f;
                                }
                                if (!this.D1) {
                                    z28 = true;
                                    o2Var9.setEnabled(z28);
                                }
                                z28 = false;
                                o2Var9.setEnabled(z28);
                            }
                            z2 z2Var2 = this.T1;
                            if (z2Var2 != null) {
                                if (this.z1) {
                                    z27 = b4Var.f;
                                    if (!z27) {
                                        i13 = 0;
                                        z2Var2.setVisibility(i13);
                                    }
                                }
                                i13 = 8;
                                z2Var2.setVisibility(i13);
                            }
                            FrameLayout frameLayout = this.X2;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (UserObject.isService(this.y1)) {
                                A0();
                                this.Y2.setVisibility(0);
                            } else {
                                gg.q qVar = this.Y2;
                                if (qVar != null) {
                                    qVar.setVisibility(8);
                                }
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(I0() ? 8 : 0);
                            }
                        }
                        gVar = this.Z1;
                        if (gVar != null) {
                            o2 o2Var10 = this.Y1;
                            if (o2Var10 != null && o2Var10.getVisibility() == 0) {
                                z47 = b4Var.f;
                                if (!z47) {
                                    i26 = 0;
                                    gVar.setVisibility(i26);
                                }
                            }
                            i26 = 8;
                            gVar.setVisibility(i26);
                        }
                        aVar = this.U1;
                        g2 g2Var = this.I0;
                        if (aVar != null) {
                            if (!this.Z2) {
                                z46 = b4Var.f;
                                if (z46) {
                                    i25 = 0;
                                    aVar.setVisibility(i25);
                                    this.U1.a(g2Var.g(), false);
                                    this.U1.setCount(g2Var.getUnreadMessagesCount());
                                }
                            }
                            i25 = 8;
                            aVar.setVisibility(i25);
                            this.U1.a(g2Var.g(), false);
                            this.U1.setCount(g2Var.getUnreadMessagesCount());
                        }
                        o1Var = this.X1;
                        if (o1Var != null) {
                            if (!this.Z2) {
                                z45 = b4Var.f;
                                if (z45 && (e1Var2 = e1.T) != null && b4Var.k(e1Var2.g())) {
                                    i24 = 0;
                                    o1Var.setVisibility(i24);
                                    o1 o1Var2 = this.X1;
                                    e1 e1Var5 = e1.T;
                                    o1Var2.b(e1Var5 == null && e1Var5.o(), true);
                                    o1 o1Var3 = this.X1;
                                    e1 e1Var6 = e1.T;
                                    o1Var3.a(e1Var6 != null || e1Var6.m(), true);
                                }
                            }
                            i24 = 8;
                            o1Var.setVisibility(i24);
                            o1 o1Var22 = this.X1;
                            e1 e1Var52 = e1.T;
                            o1Var22.b(e1Var52 == null && e1Var52.o(), true);
                            o1 o1Var32 = this.X1;
                            e1 e1Var62 = e1.T;
                            o1Var32.a(e1Var62 != null || e1Var62.m(), true);
                        }
                        if (this.W1 != null) {
                            r1 r1Var = this.V1;
                            if (!this.Z2) {
                                z44 = b4Var.f;
                                if (z44) {
                                    i22 = 0;
                                    r1Var.setVisibility(i22);
                                    s1 s1Var = this.W1;
                                    if (!this.Z2) {
                                        z43 = b4Var.f;
                                        if (z43) {
                                            i23 = 0;
                                            s1Var.setVisibility(i23);
                                            layoutParams = (FrameLayout.LayoutParams) this.W1.getLayoutParams();
                                            o1 o1Var4 = this.X1;
                                            dp = AndroidUtilities.dp((o1Var4 == null && o1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                            if (layoutParams.rightMargin != dp) {
                                                layoutParams.rightMargin = dp;
                                                this.W1.setLayoutParams(layoutParams);
                                            }
                                        }
                                    }
                                    i23 = 8;
                                    s1Var.setVisibility(i23);
                                    layoutParams = (FrameLayout.LayoutParams) this.W1.getLayoutParams();
                                    o1 o1Var42 = this.X1;
                                    dp = AndroidUtilities.dp((o1Var42 == null && o1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != dp) {
                                    }
                                }
                            }
                            i22 = 8;
                            r1Var.setVisibility(i22);
                            s1 s1Var2 = this.W1;
                            if (!this.Z2) {
                            }
                            i23 = 8;
                            s1Var2.setVisibility(i23);
                            layoutParams = (FrameLayout.LayoutParams) this.W1.getLayoutParams();
                            o1 o1Var422 = this.X1;
                            dp = AndroidUtilities.dp((o1Var422 == null && o1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != dp) {
                            }
                        }
                        z34 = b4Var.f;
                        if (!z34 || ((b4Var.h == null && b4Var.i() == null && b4Var.g() == null) || this.Z2)) {
                            m3 m3Var3 = m3Var2;
                            if (this.H1) {
                                i9 i9Var6 = ((z8) this.N1).d;
                                i9Var6.I0 = false;
                                i9Var6.P();
                                x3 x3Var2 = this.N1;
                                this.g3 = false;
                                ((z8) x3Var2).e();
                            }
                            m3Var3.setVisibility(8);
                        } else {
                            m3 m3Var4 = m3Var2;
                            m3Var4.V.b(b4Var.h, b4Var.i(), b4Var.g(), i9Var.W0 && !b4Var.g && (storyItem13 = b4Var.a) != null && storyItem13.translated, storyItem6 == b4Var.a);
                            m3Var4.setVisibility(0);
                        }
                        storyItem11 = b4Var.a;
                        if (storyItem11 != null) {
                            TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                            if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (g2Var.r(this.y1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                                    g2Var.q(false, false);
                                    this.I3 = 0L;
                                    o2 o2Var11 = this.Y1;
                                    if (o2Var11 != null) {
                                        o2Var11.J(true);
                                        this.Y1.R1();
                                        r0(true);
                                    }
                                }
                                g2Var.setVisibility(0);
                                i3Var2.invalidate();
                                if (this.N1 != null && K0()) {
                                    ((z8) this.N1).a(this.G1, this.y1);
                                }
                                z35 = this.A1;
                                z2 z2Var3 = this.M0;
                                ImageView imageView3 = this.K0;
                                z2 z2Var4 = this.A0;
                                if (z35) {
                                    if (this.P2) {
                                        z37 = b4Var.f;
                                        if (!z37) {
                                            i15 = 0;
                                            imageView3.setVisibility(i15);
                                            if (z2Var3 != null) {
                                                z2Var3.setVisibility(8);
                                            }
                                            if (!this.z1) {
                                                z36 = b4Var.f;
                                                if (!z36) {
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
                                    if (!this.z1) {
                                    }
                                    i16 = 8;
                                    z2Var4.setVisibility(i16);
                                    z2Var4.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                } else {
                                    if (this.P2) {
                                        z42 = b4Var.f;
                                        if (!z42) {
                                            i19 = 0;
                                            imageView3.setVisibility(i19);
                                            if (z2Var3 != null) {
                                                if (this.Q2) {
                                                    z41 = b4Var.f;
                                                    if (!z41) {
                                                        i21 = 0;
                                                        z2Var3.setVisibility(i21);
                                                    }
                                                }
                                                i21 = 8;
                                                z2Var3.setVisibility(i21);
                                            }
                                            if (!this.S1) {
                                                z40 = b4Var.f;
                                                if (!z40) {
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
                                    if (!this.S1) {
                                    }
                                    i20 = 8;
                                    z2Var4.setVisibility(i20);
                                }
                                z2Var4.requestLayout();
                                i9Var.b1.append(this.y1, i10);
                                if (this.H1) {
                                    R0(0L);
                                    g1();
                                    y2Var2.bumpPriority();
                                }
                                g2Var.setLivePlayer(i9Var.x0);
                                this.I1 = 0;
                                if (i9Var.L0 != null && (storyItem12 = b4Var.a) != null) {
                                    int i32 = storyItem12.id;
                                    i18 = 0;
                                    while (true) {
                                        if (i18 < i9Var.L0.i.size()) {
                                            MessageObject messageObject = (MessageObject) i9Var.L0.i.get(i18);
                                            if (messageObject != null && messageObject.getId() == i32) {
                                                this.I1 = i18;
                                                break;
                                            }
                                            i18++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                int i33 = this.G1;
                                this.J1 = i33;
                                int i34 = this.x1;
                                this.K1 = i34;
                                if (i9Var.O0) {
                                    this.J1 = (i34 - 1) - i33;
                                }
                                l10 = b4Var.l();
                                dh.d dVar = this.v0;
                                if (l10) {
                                    dVar.setVisibility(8);
                                } else {
                                    dVar.setVisibility(0);
                                    this.b3 = b4Var.j() ? 1.0f : 0.5f;
                                    boolean j11 = b4Var.j();
                                    ImageView imageView4 = this.x0;
                                    jj0 jj0Var = this.w0;
                                    if (j11) {
                                        jj0Var.setVisibility(0);
                                        imageView4.setVisibility(8);
                                        dVar.setContentDescription(LocaleController.getString(!i9.A1 ? R.string.Mute : R.string.Unmute));
                                    } else {
                                        jj0Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        dVar.setContentDescription(LocaleController.getString(R.string.NoSound));
                                    }
                                    dVar.setAlpha((1.0f - this.a4) * this.b3);
                                }
                                s6Var7 = b4Var.b;
                                n8 n8Var = this.z0;
                                if (s6Var7 == null) {
                                    n8Var.a(this.z1, s6Var7, z18 && this.Y3);
                                } else {
                                    TL_stories.StoryItem storyItem24 = b4Var.a;
                                    if (storyItem24 != null) {
                                        n8Var.b(this.z1, storyItem24, z18 && this.Y3);
                                    } else {
                                        n8Var.b(this.z1, null, z18 && this.Y3);
                                    }
                                }
                                this.Y3 = false;
                                n8Var.setTranslationX(dVar.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                                if (z20) {
                                    this.n3 = false;
                                    TL_stories.StoryItem storyItem25 = b4Var.a;
                                    if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                        this.B0.setReaction(null);
                                    } else {
                                        this.B0.setReaction(mg.q0.d(reaction));
                                    }
                                }
                                s6Var8 = b4Var.b;
                                if (s6Var8 == null && s6Var8.F) {
                                    w0();
                                    this.g2.set(b4Var.b.c.x);
                                    this.g2.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.h2;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.h2 = null;
                                    }
                                    if (z18) {
                                        ViewPropertyAnimator interpolator = this.g2.animate().alpha(1.0f).setDuration(180L).setInterpolator(mr.h);
                                        this.h2 = interpolator;
                                        interpolator.start();
                                    } else {
                                        this.g2.setAlpha(1.0f);
                                    }
                                } else if (this.g2 != null) {
                                    ViewPropertyAnimator viewPropertyAnimator2 = this.h2;
                                    if (viewPropertyAnimator2 != null) {
                                        viewPropertyAnimator2.cancel();
                                        this.h2 = null;
                                    }
                                    if (z18 && this.g2.getVisibility() == 0) {
                                        ViewPropertyAnimator withEndAction = this.g2.animate().alpha(0.0f).setDuration(180L).setInterpolator(mr.h).withEndAction(new w1(this, 0));
                                        this.h2 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.g2.setAlpha(0.0f);
                                        this.g2.setVisibility(8);
                                    }
                                }
                                this.u1.a(i9.A1, false);
                                if (this.H1 && b4Var.a != null) {
                                    FileLog.d("StoryViewer displayed story dialogId=" + this.y1 + " storyId=" + b4Var.a.id + " " + b4.c(b4Var));
                                }
                                if (this.z1) {
                                    d5.f(this.z2, this.y1, b4Var.a);
                                }
                                ig.c cVar = z3Var2.b;
                                l6 l6Var3 = i9Var.L0;
                                cVar.setPadding(0, 0, (l6Var3 != null || l6Var3.g() == this.K1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                                MessagesController.getInstance(this.z2).getTranslateController().detectStoryLanguage(b4Var.a);
                                if (!z4 && !this.z1 && this.w3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                                    w1 w1Var = new w1(this, 1);
                                    this.w3 = w1Var;
                                    AndroidUtilities.runOnUIThread(w1Var, 500L);
                                }
                                f3Var3 = this.D0;
                                if ((f3Var3 != null || !f3Var3.S) && b4Var.j() && i9.A1) {
                                    if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                                        AndroidUtilities.cancelRunOnUIThread(this.O3);
                                        AndroidUtilities.runOnUIThread(this.O3, 250L);
                                    }
                                }
                                imageView = this.t0;
                                if (imageView != null) {
                                    if (I0() && !J0()) {
                                        z39 = b4Var.e;
                                        if (!z39) {
                                            i17 = 8;
                                            imageView.setVisibility(i17);
                                        }
                                    }
                                    i17 = 0;
                                    imageView.setVisibility(i17);
                                }
                                imageView2 = this.u0;
                                if (imageView2 == null) {
                                    z38 = b4Var.f;
                                    imageView2.setVisibility((!z38 || n8Var.f) ? 8 : 0);
                                    return;
                                }
                                return;
                            }
                        }
                        g2Var.r(this.y1, null);
                        g2Var.setVisibility(8);
                        i3Var2.invalidate();
                        if (this.N1 != null) {
                            ((z8) this.N1).a(this.G1, this.y1);
                        }
                        z35 = this.A1;
                        z2 z2Var32 = this.M0;
                        ImageView imageView32 = this.K0;
                        z2 z2Var42 = this.A0;
                        if (z35) {
                        }
                        z2Var42.requestLayout();
                        i9Var.b1.append(this.y1, i10);
                        if (this.H1) {
                        }
                        g2Var.setLivePlayer(i9Var.x0);
                        this.I1 = 0;
                        if (i9Var.L0 != null) {
                            int i322 = storyItem12.id;
                            i18 = 0;
                            while (true) {
                                if (i18 < i9Var.L0.i.size()) {
                                }
                                i18++;
                            }
                        }
                        int i332 = this.G1;
                        this.J1 = i332;
                        int i342 = this.x1;
                        this.K1 = i342;
                        if (i9Var.O0) {
                        }
                        l10 = b4Var.l();
                        dh.d dVar2 = this.v0;
                        if (l10) {
                        }
                        s6Var7 = b4Var.b;
                        n8 n8Var2 = this.z0;
                        if (s6Var7 == null) {
                        }
                        this.Y3 = false;
                        n8Var2.setTranslationX(dVar2.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z20) {
                        }
                        s6Var8 = b4Var.b;
                        if (s6Var8 == null) {
                        }
                        if (this.g2 != null) {
                        }
                        this.u1.a(i9.A1, false);
                        if (this.H1) {
                            FileLog.d("StoryViewer displayed story dialogId=" + this.y1 + " storyId=" + b4Var.a.id + " " + b4.c(b4Var));
                        }
                        if (this.z1) {
                        }
                        ig.c cVar2 = z3Var2.b;
                        l6 l6Var32 = i9Var.L0;
                        cVar2.setPadding(0, 0, (l6Var32 != null || l6Var32.g() == this.K1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                        MessagesController.getInstance(this.z2).getTranslateController().detectStoryLanguage(b4Var.a);
                        if (!z4) {
                            w1 w1Var2 = new w1(this, 1);
                            this.w3 = w1Var2;
                            AndroidUtilities.runOnUIThread(w1Var2, 500L);
                        }
                        f3Var3 = this.D0;
                        if (f3Var3 != null) {
                        }
                        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                        }
                        imageView = this.t0;
                        if (imageView != null) {
                        }
                        imageView2 = this.u0;
                        if (imageView2 == null) {
                        }
                    }
                }
                z15 = false;
                i3Var = this.Z0;
                m3Var = this.H0;
                z3Var = this.l1;
                if (s6Var4 != null) {
                }
                o2Var = this.Y1;
                if (o2Var != null) {
                }
                z16 = b4Var.f;
                if (z16) {
                }
                dzVar.c();
                this.T0 = 0L;
                this.V0 = false;
                s6Var5 = b4Var.b;
                if (s6Var5 != null) {
                }
                icVar = ic.w;
                if (icVar != null) {
                    icVar.b();
                }
                m3Var.J();
                q0();
                z15 = true;
                if (z15) {
                }
                z3Var.setOnSubtitleClick(null);
                TextView[] textViewArr2 = z3Var.c;
                this.N3 = 0;
                z18 = z59;
                long j102 = this.y1;
                boolean z612 = z60;
                z19 = b4Var.f;
                W0(j102, false, z19);
                s6Var6 = b4Var.b;
                if (s6Var6 != null) {
                }
                z20 = z15;
                y2Var2 = y2Var;
                i3Var2 = i3Var;
                m3Var2 = m3Var;
                z3Var2 = z3Var;
                charSequence2 = charSequence3;
                charSequence = charSequence2;
                z21 = z612;
                if (charSequence == null) {
                }
                f3Var = this.C0;
                if (f3Var != null) {
                }
                f3Var2 = this.D0;
                if (f3Var2 != null) {
                }
                storyItem10 = b4Var.a;
                if (storyItem6 == storyItem10) {
                }
                b4Var.o();
                if (!b4Var.g) {
                }
                i9 i9Var52 = ((z8) x3Var).d;
                i9Var52.W0 = false;
                i9Var52.P();
                z23 = b4Var.f;
                if (z23) {
                }
                if (z24 != this.D1) {
                }
                linearLayout = this.d2;
                if (linearLayout != null) {
                }
                z25 = this.Z2;
                LinearLayout linearLayout22 = this.L0;
                if (z25) {
                }
                gVar = this.Z1;
                if (gVar != null) {
                }
                aVar = this.U1;
                g2 g2Var2 = this.I0;
                if (aVar != null) {
                }
                o1Var = this.X1;
                if (o1Var != null) {
                }
                if (this.W1 != null) {
                }
                z34 = b4Var.f;
                if (z34) {
                }
                m3 m3Var32 = m3Var2;
                if (this.H1) {
                }
                m3Var32.setVisibility(8);
                storyItem11 = b4Var.a;
                if (storyItem11 != null) {
                }
                g2Var2.r(this.y1, null);
                g2Var2.setVisibility(8);
                i3Var2.invalidate();
                if (this.N1 != null) {
                }
                z35 = this.A1;
                z2 z2Var322 = this.M0;
                ImageView imageView322 = this.K0;
                z2 z2Var422 = this.A0;
                if (z35) {
                }
                z2Var422.requestLayout();
                i9Var.b1.append(this.y1, i10);
                if (this.H1) {
                }
                g2Var2.setLivePlayer(i9Var.x0);
                this.I1 = 0;
                if (i9Var.L0 != null) {
                }
                int i3322 = this.G1;
                this.J1 = i3322;
                int i3422 = this.x1;
                this.K1 = i3422;
                if (i9Var.O0) {
                }
                l10 = b4Var.l();
                dh.d dVar22 = this.v0;
                if (l10) {
                }
                s6Var7 = b4Var.b;
                n8 n8Var22 = this.z0;
                if (s6Var7 == null) {
                }
                this.Y3 = false;
                n8Var22.setTranslationX(dVar22.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z20) {
                }
                s6Var8 = b4Var.b;
                if (s6Var8 == null) {
                }
                if (this.g2 != null) {
                }
                this.u1.a(i9.A1, false);
                if (this.H1) {
                }
                if (this.z1) {
                }
                ig.c cVar22 = z3Var2.b;
                l6 l6Var322 = i9Var.L0;
                cVar22.setPadding(0, 0, (l6Var322 != null || l6Var322.g() == this.K1) ? 0 : AndroidUtilities.dp(56.0f), 0);
                MessagesController.getInstance(this.z2).getTranslateController().detectStoryLanguage(b4Var.a);
                if (!z4) {
                }
                f3Var3 = this.D0;
                if (f3Var3 != null) {
                }
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.t0;
                if (imageView != null) {
                }
                imageView2 = this.u0;
                if (imageView2 == null) {
                }
            }
        }
        z13 = z11;
        storyItem5 = b4Var.a;
        if (storyItem5 != null) {
            i9Var.M0 = storyItem5.id;
        }
        i9Var.k0.A();
        this.V2 = true;
        if (!this.z1) {
        }
        k1(false);
        TL_stories.StoryItem storyItem212 = b4Var.a;
        s6 s6Var102 = b4Var.b;
        if (storyItem212 == null) {
        }
        if (storyItem2 == null) {
        }
        if (i29 == i11) {
        }
        if (z59) {
        }
        e1Var = i9Var.x0;
        if (e1Var != null) {
        }
        z15 = false;
        i3Var = this.Z0;
        m3Var = this.H0;
        z3Var = this.l1;
        if (s6Var4 != null) {
        }
        o2Var = this.Y1;
        if (o2Var != null) {
        }
        z16 = b4Var.f;
        if (z16) {
        }
        dzVar.c();
        this.T0 = 0L;
        this.V0 = false;
        s6Var5 = b4Var.b;
        if (s6Var5 != null) {
        }
        icVar = ic.w;
        if (icVar != null) {
        }
        m3Var.J();
        q0();
        z15 = true;
        if (z15) {
        }
        z3Var.setOnSubtitleClick(null);
        TextView[] textViewArr22 = z3Var.c;
        this.N3 = 0;
        z18 = z59;
        long j1022 = this.y1;
        boolean z6122 = z60;
        z19 = b4Var.f;
        W0(j1022, false, z19);
        s6Var6 = b4Var.b;
        if (s6Var6 != null) {
        }
        z20 = z15;
        y2Var2 = y2Var;
        i3Var2 = i3Var;
        m3Var2 = m3Var;
        z3Var2 = z3Var;
        charSequence2 = charSequence3;
        charSequence = charSequence2;
        z21 = z6122;
        if (charSequence == null) {
        }
        f3Var = this.C0;
        if (f3Var != null) {
        }
        f3Var2 = this.D0;
        if (f3Var2 != null) {
        }
        storyItem10 = b4Var.a;
        if (storyItem6 == storyItem10) {
        }
        b4Var.o();
        if (!b4Var.g) {
        }
        i9 i9Var522 = ((z8) x3Var).d;
        i9Var522.W0 = false;
        i9Var522.P();
        z23 = b4Var.f;
        if (z23) {
        }
        if (z24 != this.D1) {
        }
        linearLayout = this.d2;
        if (linearLayout != null) {
        }
        z25 = this.Z2;
        LinearLayout linearLayout222 = this.L0;
        if (z25) {
        }
        gVar = this.Z1;
        if (gVar != null) {
        }
        aVar = this.U1;
        g2 g2Var22 = this.I0;
        if (aVar != null) {
        }
        o1Var = this.X1;
        if (o1Var != null) {
        }
        if (this.W1 != null) {
        }
        z34 = b4Var.f;
        if (z34) {
        }
        m3 m3Var322 = m3Var2;
        if (this.H1) {
        }
        m3Var322.setVisibility(8);
        storyItem11 = b4Var.a;
        if (storyItem11 != null) {
        }
        g2Var22.r(this.y1, null);
        g2Var22.setVisibility(8);
        i3Var2.invalidate();
        if (this.N1 != null) {
        }
        z35 = this.A1;
        z2 z2Var3222 = this.M0;
        ImageView imageView3222 = this.K0;
        z2 z2Var4222 = this.A0;
        if (z35) {
        }
        z2Var4222.requestLayout();
        i9Var.b1.append(this.y1, i10);
        if (this.H1) {
        }
        g2Var22.setLivePlayer(i9Var.x0);
        this.I1 = 0;
        if (i9Var.L0 != null) {
        }
        int i33222 = this.G1;
        this.J1 = i33222;
        int i34222 = this.x1;
        this.K1 = i34222;
        if (i9Var.O0) {
        }
        l10 = b4Var.l();
        dh.d dVar222 = this.v0;
        if (l10) {
        }
        s6Var7 = b4Var.b;
        n8 n8Var222 = this.z0;
        if (s6Var7 == null) {
        }
        this.Y3 = false;
        n8Var222.setTranslationX(dVar222.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z20) {
        }
        s6Var8 = b4Var.b;
        if (s6Var8 == null) {
        }
        if (this.g2 != null) {
        }
        this.u1.a(i9.A1, false);
        if (this.H1) {
        }
        if (this.z1) {
        }
        ig.c cVar222 = z3Var2.b;
        l6 l6Var3222 = i9Var.L0;
        cVar222.setPadding(0, 0, (l6Var3222 != null || l6Var3222.g() == this.K1) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.z2).getTranslateController().detectStoryLanguage(b4Var.a);
        if (!z4) {
        }
        f3Var3 = this.D0;
        if (f3Var3 != null) {
        }
        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
        }
        imageView = this.t0;
        if (imageView != null) {
        }
        imageView2 = this.u0;
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
        String h = e2.c.h(max, "_", max);
        ArrayList arrayList11 = this.P3;
        arrayList11.clear();
        ArrayList arrayList12 = this.Q3;
        arrayList12.clear();
        int i12 = 0;
        while (true) {
            arrayList = this.e1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((mg.h0) arrayList.get(i12)).b(false);
            i12++;
        }
        arrayList.clear();
        int i13 = 0;
        while (true) {
            if (i13 >= 2) {
                break;
            }
            int i14 = this.G1;
            if (i13 == 0) {
                i10 = i14 - 1;
                imageReceiver = this.c1;
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
                ArrayList arrayList13 = this.t1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.s1;
                if (isEmpty && i10 >= arrayList2.size()) {
                    V0((s6) arrayList13.get(i10 - arrayList2.size()), imageReceiver, h);
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    if (i10 >= arrayList2.size()) {
                        i10 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i10);
                    long j10 = this.y1;
                    storyItem2.dialogId = j10;
                    s6 t6 = this.P1.t(j10, storyItem2);
                    if (t6 != null) {
                        V0(t6, imageReceiver, h);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList;
                        i11 = i13;
                        storyItem = storyItem2;
                    } else {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        boolean z4 = messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument());
                        String str = storyItem2.attachPath;
                        if (str != null) {
                            if (storyItem2.media == null) {
                                z4 = str.toLowerCase().endsWith(".mp4");
                            }
                            if (z4) {
                                i11 = i13;
                                arrayList3 = arrayList11;
                                arrayList5 = arrayList;
                                arrayList4 = arrayList12;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), vh.w2.k(h, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), h, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i13;
                                String str2 = h;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                h = str2;
                            }
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i11 = i13;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (z4) {
                                storyItem = storyItem2;
                                imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), vh.w2.k(h, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem2.media.getDocument()), h, null, null, null, 0L, null, storyItem, 0);
                            } else {
                                storyItem = storyItem2;
                                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.clearImage();
                                } else {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                                    imageReceiver2.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), h, null, null, null, 0L, null, storyItem, 0);
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (messageMedia3 != null && MessageObject.isVideoDocument(messageMedia3.getDocument())) {
                        TLRPC.Document document = storyItem.media.getDocument();
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = FileLoader.getInstance(this.z2).getFileReference(storyItem);
                        }
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append("?account=");
                            sb.append(this.z2);
                            sb.append("&id=");
                            sb.append(document.id);
                            sb.append("&hash=");
                            sb.append(document.access_hash);
                            sb.append("&dc=");
                            sb.append(document.dc_id);
                            sb.append("&size=");
                            sb.append(document.size);
                            sb.append("&mime=");
                            sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                            sb.append("&rid=");
                            sb.append(storyItem.fileReference);
                            sb.append("&name=");
                            sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
                            sb.append("&reference=");
                            byte[] bArr = document.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb.append(Utilities.bytesToHex(bArr));
                            sb.append("&sid=");
                            sb.append(storyItem.id);
                            sb.append("&did=");
                            sb.append(storyItem.dialogId);
                            arrayList7 = arrayList3;
                            try {
                                arrayList7.add(Uri.parse("tg://" + FileLoader.getAttachFileName(document) + sb.toString()));
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
                            } catch (UnsupportedEncodingException e6) {
                                e = e6;
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
                                mg.h0 h0Var = new mg.h0(this);
                                h0Var.e(mg.q0.d(tL_mediaAreaSuggestedReaction.reaction));
                                h0Var.b(this.X0);
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
                ImageReceiver imageReceiver3 = this.d1;
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
                    ArrayList arrayList132 = this.t1;
                    isEmpty = arrayList132.isEmpty();
                    arrayList2 = this.s1;
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
        z8 z8Var = (z8) this.N1;
        i9 i9Var = z8Var.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z10 = i9Var.E0;
            ArrayList arrayList16 = i9Var.J0;
            if (z10) {
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
                h9 h9Var = new h9(i9Var, i9Var.z0, i9Var.y0);
                h9Var.setOnSeekUpdate(new n4(20, z8Var, h9Var));
                h9Var.uri = uri;
                TLRPC.Document document2 = (TLRPC.Document) arrayList14.get(i18);
                h9Var.document = document2;
                FileStreamLoadOperation.setPriorityForDocument(document2, 0);
                h9Var.preparePlayer(uri, i9.A1, i9.y1);
                arrayList16.add(h9Var);
                if (arrayList16.size() > 2) {
                    ((h9) arrayList16.remove(0)).release(null);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.w1;
    }

    public long getCurrentPeer() {
        return this.y1;
    }

    public int getListPosition() {
        return this.I1;
    }

    public Bitmap getPlayingBitmap() {
        i3 i3Var = this.Z0;
        Bitmap createBitmap = Bitmap.createBitmap(i3Var.getWidth(), i3Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.G1;
    }

    public t6 getStoriesController() {
        return MessagesController.getInstance(this.z2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.A2, this.s1.size()) + this.t1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.s1;
    }

    public final void h1() {
        if (this.D1) {
            TextView textView = this.e2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.e2;
        if (textView3 != null) {
            textView3.setText(LocaleController.getString(this.B1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        }
        TextView textView4 = this.f2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.w1;
        i9 i9Var = this.G0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.t1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((s6) arrayList2.get(i11)).a;
                    if (((int) (j10 ^ (j10 >>> 32))) == i9Var.M0) {
                        this.G1 = i11;
                        return;
                    }
                }
            }
            int indexOf = this.w1.indexOf(Integer.valueOf(i9Var.M0));
            if (indexOf < 0 && !this.w1.isEmpty()) {
                if (i9Var.M0 > ((Integer) this.w1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (i9Var.M0 < ((Integer) kf.k0.i(1, this.w1)).intValue()) {
                    indexOf = this.w1.size() - 1;
                }
            }
            this.G1 = i10 + indexOf;
        } else {
            int i12 = i9Var.b1.get(this.y1, -1);
            this.G1 = i12;
            if (i12 == -1 && !i9Var.K0 && (peerStories = this.r1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.s1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i13)).id > this.r1.max_read_id) {
                        this.G1 = i13;
                        break;
                    }
                    i13++;
                }
            }
        }
        if (this.G1 == -1) {
            this.G1 = 0;
        }
    }

    public final void j1() {
        l6 l6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.s1;
        arrayList.clear();
        i9 i9Var = this.G0;
        if (!i9Var.K0) {
            ArrayList arrayList2 = this.w1;
            int i10 = 0;
            ArrayList arrayList3 = this.t1;
            if (arrayList2 != null && (l6Var = i9Var.L0) != null) {
                if (l6Var instanceof d6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.z2).getStoriesController().E(this.y1);
                    String str = ((d6) i9Var.L0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            s6 s6Var = (s6) E.get(i11);
                            ph.t6 t6Var = s6Var.c;
                            if (t6Var != null && !t6Var.g && TextUtils.equals(t6Var.K0, str)) {
                                arrayList3.add(s6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.w1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f10 = i9Var.L0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (i9Var.L0 != null) {
                while (i10 < i9Var.L0.i.size()) {
                    arrayList.add(((MessageObject) i9Var.L0.i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = i9Var.N0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.y1) {
                    TL_stories.PeerStories y10 = this.P1.y(this.y1);
                    this.r1 = y10;
                    if (y10 == null) {
                        this.r1 = this.P1.z(this.y1);
                    }
                } else {
                    this.r1 = i9Var.N0;
                }
                this.A2 = 0;
                TL_stories.PeerStories peerStories2 = this.r1;
                if (peerStories2 != null) {
                    this.A2 = peerStories2.stories.size();
                    arrayList.addAll(this.r1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.P1.E(this.y1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        } else if (!i9Var.P0) {
            arrayList.add(i9Var.Q0);
        }
        this.x1 = getStoriesCount();
    }

    public final void k0(boolean z4) {
        d4 currentPeerView;
        y50 y50Var = this.G2;
        if (y50Var != null) {
            y50Var.U = null;
            y50Var.d(false);
        }
        long j10 = this.y1;
        TL_stories.StoryItem storyItem = this.L1.a;
        i9 i9Var = this.G0;
        i9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            i9.B1.remove(j10 + (j10 >> 16) + (storyItem.id << 16));
        }
        this.f3 = true;
        y8 y8Var = i9Var.k0;
        if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z4) {
            ic I = new qc(this.Z0, this.y0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new w1(this, 2));
            I.r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.z2).ensureMessagesLoaded(this.y1, 0, null);
    }

    public final void k1(boolean z4) {
        int i10;
        b4 b4Var = this.L1;
        TL_stories.StoryItem storyItem = b4Var.a;
        if (storyItem == null) {
            storyItem = b4Var.c;
        }
        boolean z10 = this.A1;
        if (z10 || this.z1) {
            if (storyItem == null) {
                this.x2.setText("");
                this.C2.setVisibility(8);
                this.y2.setVisibility(8);
                return;
            }
            i9 i9Var = this.G0;
            z2 z2Var = this.A0;
            if (!z10) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.x2.setText(LocaleController.getString(i9Var.L0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                    this.x2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.y2.setVisibility(8);
                    this.C2.setVisibility(8);
                } else {
                    int i11 = 0;
                    for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                        TLObject userOrChat = MessagesController.getInstance(this.z2).getUserOrChat(storyItem.views.recent_viewers.get(i12).longValue());
                        if (userOrChat != null) {
                            this.y2.b(i11, userOrChat, this.z2);
                            i11++;
                        }
                        if (i11 >= 3) {
                            break;
                        }
                    }
                    for (int i13 = i11; i13 < 3; i13++) {
                        this.y2.b(i13, null, this.z2);
                    }
                    this.y2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        lq lqVar = new lq(R.drawable.mini_views_likes, 0);
                        lqVar.setOverrideColor(-53704);
                        lqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        lq lqVar2 = new lq(R.drawable.mini_repost_story, 0);
                        lqVar2.setOverrideColor(-14161823);
                        lqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(lqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.x2.setText(spannableStringBuilder);
                    if (i11 == 0) {
                        this.y2.setVisibility(8);
                        this.x2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.y2.setVisibility(0);
                        this.x2.setTranslationX(AndroidUtilities.dp(10.0f) + e2.c.e(i11, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.C2.setVisibility(0);
                }
                z2Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.L0.requestLayout();
                return;
            }
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2.views_count <= 0) {
                storyViews2.views_count = 1;
            }
            org.telegram.ui.Components.j6 j6Var = this.O0;
            if (j6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.S0 = false;
            } else {
                j6Var.q(Integer.toString(i10), z4 && this.S0, true);
                this.S0 = true;
            }
            int i14 = storyItem.views.reactions_count;
            if (i14 > 0) {
                this.N0.q(Integer.toString(i14), z4 && this.R0, true);
                this.R0 = true;
            } else {
                this.R0 = false;
            }
            if (!z4) {
                this.P0.d(this.R0 ? 1.0f : 0.0f, true);
                org.telegram.ui.Components.z5 z5Var = this.Q0;
                if (z5Var != null) {
                    z5Var.d(this.S0 ? 1.0f : 0.0f, true);
                }
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.z2).getChat(Long.valueOf(-this.y1));
            if (!(this.B1 && (ChatObject.canSendPlain(chat) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                this.x2.setText(LocaleController.getString(i9Var.L0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.x2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new lq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.x2.setText(spannableStringBuilder2);
            } else {
                this.x2.setText("");
            }
            z2Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.R0 ? this.N0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.T1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + z2Var.getLayoutParams().width;
            z2 z2Var2 = this.M0;
            if (z2Var2 != null) {
                z2Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.S0 ? this.O0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.T1.getLayoutParams()).rightMargin += z2Var2.getLayoutParams().width;
                z2Var2.requestLayout();
            }
            this.T1.requestLayout();
            z2Var.requestLayout();
            this.y2.setVisibility(8);
            this.C2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = b4Var.a;
            f3 f3Var = this.g1;
            if (storyItem2 == null) {
                f3Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < f3Var.getChildCount(); i15++) {
                if (f3Var.getChildAt(i15) instanceof p8) {
                    ((p8) f3Var.getChildAt(i15)).c(storyItem2.views, z4);
                }
            }
        }
    }

    public final void l0() {
        y6 y6Var = this.B0;
        y6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new l2(0, y6Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        y6 y6Var2 = new y6(getContext(), this.u1);
        this.B0 = y6Var2;
        y6Var2.setPadding(dp, dp, dp, dp);
        this.B0.setAlpha(0.0f);
        this.B0.setScaleX(0.8f);
        this.B0.setScaleY(0.8f);
        this.B0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.A0.addView(this.B0, k7.b6.e(40, 40, 3));
        this.n3 = false;
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
        throw new UnsupportedOperationException("Method not decompiled: nh.d4.l1():void");
    }

    public final void m0(boolean z4) {
        ValueAnimator valueAnimator = this.Z3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a4, z4 ? 1.0f : 0.0f);
        this.Z3 = ofFloat;
        ofFloat.addUpdateListener(new x1(this, 2));
        this.Z3.addListener(new j2(this, z4, 1));
        this.Z3.setDuration(420L);
        this.Z3.setInterpolator(mr.h);
        this.Z3.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.z2).isFrozen()) {
            org.telegram.ui.c.b(this.z2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 <= 0 || !this.h3) {
            runnable.run();
            return;
        }
        int i11 = i10 - 1;
        SharedConfig.stealthModeSendMessageConfirm = i11;
        SharedConfig.updateStealthModeSendMessageConfirm(i11);
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 0, this.y0);
        d2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        d2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        lh.m5 m5Var = new lh.m5(runnable, 8);
        d2Var.i0 = string;
        d2Var.j0 = m5Var;
        String string2 = LocaleController.getString(R.string.Cancel);
        m.j0 j0Var = new m.j0(7);
        d2Var.k0 = string2;
        d2Var.l0 = j0Var;
        d2Var.show();
    }

    public final void o0(int i10) {
        this.B2 = false;
        this.S2 = true;
        this.y3 = false;
        this.A1 = false;
        this.B1 = false;
        long j10 = this.y1;
        z3 z3Var = this.l1;
        org.telegram.ui.Components.z8 z8Var = this.k1;
        if (j10 >= 0) {
            this.z1 = j10 == UserConfig.getInstance(this.z2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.z2).getUser(Long.valueOf(this.y1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.z2).isUserContactBlocked(this.y1);
            this.C1 = !UserConfig.getInstance(this.z2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.E1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            z8Var.m(this.z2, user);
            z3Var.a.getImageReceiver().setForUserOrChat(user, z8Var);
            W0(this.y1, true, false);
        } else {
            this.z1 = false;
            this.A1 = true;
            if (this.P1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.y3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.z2).getChat(Long.valueOf(-this.y1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.B1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.z2).getChatFull(-this.y1) == null) {
                MessagesStorage.getInstance(this.z2).loadChatInfo(-this.y1, true, new CountDownLatch(1), false, false);
            }
            this.C1 = this.B1 && !ChatObject.canSendPlain(chat);
            this.E1 = MessagesController.getInstance(this.z2).getSendPaidMessagesStars(this.y1);
            z8Var.k(this.z2, chat);
            z3Var.a.getImageReceiver().setForUserOrChat(chat, z8Var);
            W0(this.y1, true, false);
        }
        if (this.H1 && (this.z1 || this.A1)) {
            t6 t6Var = this.P1;
            long j11 = this.y1;
            a0.h hVar = t6Var.m;
            r9 r9Var = (r9) hVar.f(j11);
            if (r9Var == null) {
                r9Var = new r9(t6Var.a, j11, t6Var);
                hVar.k(r9Var, j11);
            }
            r9Var.b(true);
        }
        j1();
        this.G1 = i10;
        if (i10 < 0) {
            this.G1 = 0;
        }
        this.T0 = 0L;
        this.V0 = false;
        this.G3 = null;
        this.H3 = null;
        boolean z4 = this.A1;
        i3 i3Var = this.Z0;
        i9 i9Var = this.G0;
        int i11 = 8;
        b4 b4Var = this.L1;
        if (z4) {
            B0();
            if (this.Y1 == null && (this.B1 || b4Var.f)) {
                v0();
            }
            if (this.Y1 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.z2).getChat(Long.valueOf(-this.y1));
                o2 o2Var = this.Y1;
                if (b4Var.f || (!I0() && this.B1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                o2Var.setVisibility(i11);
                o2 o2Var2 = this.Y1;
                boolean z10 = b4Var.f;
                D0(true);
                o2Var2.i1(z10);
                this.Y1.o1(b4Var.f && !D0(true) && (this.s2 || this.Y1.T0), true);
                ut editField = this.Y1.getEditField();
                long j12 = this.y1;
                TL_stories.StoryItem storyItem = b4Var.a;
                i9Var.getClass();
                editField.setText(i9.u(j12, storyItem));
                this.Y1.b1(this.z2, this.y1);
                this.Y1.K1(chat2, null);
            }
            org.telegram.ui.Components.j6 j6Var = this.N0;
            org.telegram.ui.ActionBar.f6 f6Var = this.y0;
            if (j6Var == null) {
                org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, false, false, false);
                this.N0 = j6Var2;
                z2 z2Var = this.A0;
                j6Var2.setCallback(z2Var);
                this.N0.r(f6Var.x0(org.telegram.ui.ActionBar.j6.G6));
                this.N0.t(AndroidUtilities.dp(14.0f));
                this.P0 = new org.telegram.ui.Components.z5(z2Var);
            }
            z2 z2Var2 = this.M0;
            if (z2Var2 != null && this.O0 == null) {
                org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(false, false, false, false);
                this.O0 = j6Var3;
                j6Var3.setCallback(z2Var2);
                this.O0.r(f6Var.x0(org.telegram.ui.ActionBar.j6.G6));
                this.O0.t(AndroidUtilities.dp(14.0f));
                this.Q0 = new org.telegram.ui.Components.z5(z2Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.x1 = getStoriesCount();
            i3Var.invalidate();
            invalidate();
        } else if (this.z1) {
            B0();
            if (b4Var.f) {
                this.T1.setVisibility(8);
                if (this.Y1 == null) {
                    v0();
                }
                this.Y1.setVisibility(0);
            } else {
                this.T1.setVisibility(0);
                o2 o2Var3 = this.Y1;
                if (o2Var3 != null) {
                    o2Var3.setVisibility(8);
                }
            }
            o2 o2Var4 = this.Y1;
            if (o2Var4 != null) {
                boolean z11 = b4Var.f;
                D0(true);
                o2Var4.i1(z11);
                this.Y1.o1(b4Var.f && !D0(true) && (this.s2 || this.Y1.T0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.w1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(i9Var.M0));
                    if (indexOf < 0 && !this.w1.isEmpty()) {
                        if (i9Var.M0 > ((Integer) this.w1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (i9Var.M0 < ((Integer) kf.k0.i(1, this.w1)).intValue()) {
                            indexOf = this.w1.size() - 1;
                        }
                    }
                    this.G1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.t1.isEmpty();
                    ArrayList arrayList2 = this.s1;
                    if (isEmpty) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i12)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i12)).id > this.P1.f.get(this.y1)) {
                                this.G1 = i12;
                                break;
                            }
                        }
                    } else {
                        this.G1 = arrayList2.size();
                    }
                }
            }
            f1(false);
            i3Var.invalidate();
            invalidate();
        } else {
            if (this.Y1 == null) {
                v0();
            }
            if (this.C1 && this.d2 == null) {
                z0();
            }
            if (this.d2 != null) {
                if (this.C1 || this.D1) {
                    h1();
                }
                this.d2.setVisibility(((!this.C1 || b4Var.f) && !this.D1) ? 8 : 0);
            }
            g8 g8Var = this.g2;
            if (g8Var != null) {
                g8Var.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            o2 o2Var5 = this.Y1;
            if (o2Var5 != null) {
                o2Var5.setVisibility((I0() || UserObject.isService(this.y1)) ? 8 : 0);
                o2 o2Var6 = this.Y1;
                boolean z12 = b4Var.f;
                D0(true);
                o2Var6.i1(z12);
                this.Y1.o1(b4Var.f && !D0(true) && (this.s2 || this.Y1.T0), true);
                ut editField2 = this.Y1.getEditField();
                long j13 = this.y1;
                TL_stories.StoryItem storyItem2 = b4Var.a;
                i9Var.getClass();
                editField2.setText(i9.u(j13, storyItem2));
                this.Y1.b1(this.z2, this.y1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.z2).getUserFull(this.y1);
                if (userFull != null) {
                    this.Y1.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.z2).loadFullUser(MessagesController.getInstance(this.z2).getUser(Long.valueOf(this.y1)), this.w2, false);
                }
            }
            this.x1 = getStoriesCount();
            z2 z2Var3 = this.T1;
            if (z2Var3 != null) {
                z2Var3.setVisibility(8);
            }
            i3Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X0 = true;
        this.b1.onAttachedToWindow();
        this.d1.onAttachedToWindow();
        this.c1.onAttachedToWindow();
        this.i3.onAttachedToWindow();
        this.k3.onAttachedToWindow();
        o2 o2Var = this.Y1;
        if (o2Var != null) {
            o2Var.E0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e1;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.z2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.z2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.z2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.z2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.z2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.z2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.z2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.z2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.z2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((mg.h0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X0 = false;
        this.b1.onDetachedFromWindow();
        this.d1.onDetachedFromWindow();
        this.c1.onDetachedFromWindow();
        this.i3.onDetachedFromWindow();
        this.k3.onDetachedFromWindow();
        o2 o2Var = this.Y1;
        if (o2Var != null) {
            o2Var.D0();
        }
        org.telegram.ui.Components.l5 l5Var = this.l3;
        if (l5Var != null) {
            l5Var.o(this);
            this.l3 = null;
        }
        mg.d dVar = this.j3;
        if (dVar != null) {
            dVar.d(this);
            this.j3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e1;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.z2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.z2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.z2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.z2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.z2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.z2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.z2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.z2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.z2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((mg.h0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.u1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
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
        char c3;
        y50 y50Var;
        boolean z4;
        float dp;
        FrameLayout.LayoutParams layoutParams;
        pk0 pk0Var;
        q2 q2Var;
        i9 i9Var = this.G0;
        if (i9Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i12 = 0;
        if (this.H1 && this.W2 == null) {
            this.v2 = ((z8) this.N1).d.m0;
        } else {
            this.v2 = 0;
        }
        int size = i9Var.b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.v2;
        int size2 = (int) ((View.MeasureSpec.getSize(i10) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.v2 < AndroidUtilities.dp(20.0f)) {
            this.v2 = 0;
        }
        int i13 = this.v2;
        pk0 pk0Var2 = this.o3;
        if (pk0Var2 == null || pk0Var2.getReactionsWindow() == null || this.o3.getReactionsWindow().q) {
            o2 o2Var = this.Y1;
            if (o2Var != null && (o2Var.t0() || this.Y1.g3)) {
                if (this.Y1.getEmojiView().getMeasuredHeight() == 0) {
                    i13 = this.Y1.getEmojiPadding();
                } else {
                    o2 o2Var2 = this.Y1;
                    if (o2Var2.v3) {
                        o2Var2.K();
                        i13 = this.Y1.getStickersExpandedHeight();
                    } else {
                        i13 = o2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.o3.getReactionsWindow().c.animate().translationY(-this.v2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
            i13 = 0;
        }
        boolean z10 = this.s2;
        int i14 = this.l2;
        z3 z3Var = this.l1;
        int i15 = 1;
        if (i14 != i13) {
            this.s2 = false;
            int i16 = 3;
            b4 b4Var = this.L1;
            f10 = 8.0f;
            if (i13 <= 0 || !this.H1) {
                o2 o2Var3 = this.Y1;
                if (o2Var3 != null) {
                    i9.J(this.y1, b4Var.a, o2Var3.getEditText());
                }
            } else {
                this.s2 = true;
                this.f3 = false;
                this.q2 = i13;
                if (this.c2 == null) {
                    pk0 pk0Var3 = new pk0(1, this.z2, getContext(), LaunchActivity.R(), new m2(i16, this.y0));
                    this.c2 = pk0Var3;
                    pk0Var3.setHint(LocaleController.getString(this.B1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    pk0 pk0Var4 = this.c2;
                    pk0Var4.K0 = true;
                    addView(pk0Var4, this.F0, k7.b6.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.c2.setDelegate(new e3(this));
                    this.c2.p(null, null, true);
                }
                this.c2.setFragment(LaunchActivity.R());
                this.c2.setHint(LocaleController.getString(this.B1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                mg.m0 m0Var = mg.m0.B;
                if (m0Var != null) {
                    m0Var.l = true;
                }
                mg.m0 m0Var2 = mg.m0.C;
                if (m0Var2 != null) {
                    m0Var2.l = true;
                }
            }
            o2 o2Var4 = this.Y1;
            if (o2Var4 != null) {
                o2Var4.o1(b4Var.f && !D0(true) && this.s2, true);
            }
            if (this.s2 && (q2Var = this.a3) != null) {
                q2Var.setVisibility(0);
            }
            if (!this.s2 && (pk0Var = this.c2) != null) {
                pk0Var.n();
            }
            z3Var.setEnabled(!this.s2);
            if (this.Y1 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.s2, 0.1f, true);
            }
            if (this.H1 && this.s2) {
                i9 i9Var2 = ((z8) this.N1).d;
                if (!i9Var2.x) {
                    i9Var2.x = true;
                    i9Var2.P();
                }
            }
            this.l2 = i13;
            ValueAnimator valueAnimator = this.m2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.K2.lock();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E2, i13);
            this.m2 = ofFloat;
            ofFloat.addUpdateListener(new x1(this, i12));
            this.m2.addListener(new k2(this, i15));
            if (this.s2) {
                this.m2.setDuration(250L);
                this.m2.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                i9Var.m();
            } else {
                this.m2.setDuration(500L);
                this.m2.setInterpolator(mr.h);
            }
            this.m2.start();
            boolean z11 = this.s2;
            if (z11 != z10) {
                if (z11) {
                    a9.a aVar = this.M1;
                    Canvas canvas = (Canvas) aVar.b;
                    Bitmap bitmap = (Bitmap) aVar.c;
                    E0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.a.k(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (b4Var.f) {
                        ph.f3 f3Var = this.a2;
                        if (f3Var != null) {
                            if (!f3Var.S) {
                                removeView(f3Var);
                            }
                        }
                        if (!D0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            ph.f3 f3Var2 = new ph.f3(getContext(), 3);
                            this.a2 = f3Var2;
                            f3Var2.s(LocaleController.getString(R.string.LiveStoryHighlightHint));
                            this.a2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            ph.f3 f3Var3 = this.a2;
                            f3Var3.H = Layout.Alignment.ALIGN_OPPOSITE;
                            f3Var3.i0 = new lh.n2(27, this, f3Var2);
                            addView(f3Var3, k7.b6.e(-1, 100, 87));
                            this.a2.u();
                            l1();
                        }
                    }
                } else {
                    o2 o2Var5 = this.Y1;
                    if (o2Var5 != null) {
                        o2Var5.getEditField().clearFocus();
                    }
                    ph.f3 f3Var4 = this.a2;
                    if (f3Var4 != null) {
                        f3Var4.e(true);
                    }
                }
                this.r2 = true;
            } else {
                this.r2 = false;
            }
        } else {
            f10 = 8.0f;
        }
        o2 o2Var6 = this.Y1;
        if (o2Var6 != null && o2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.Y1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        i3 i3Var = this.Z0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) i3Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z12 = size - size2 > AndroidUtilities.dp(64.0f);
        this.u2 = z12;
        int dp2 = (size - ((z12 ? AndroidUtilities.dp(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = dp2;
        if (this.u2) {
            this.H2 = (((-dp2) + size) - size2) - AndroidUtilities.dp(64.0f);
        } else {
            this.H2 = ((-dp2) + size) - size2;
        }
        if (this.u2 != this.t2) {
            i3Var.setLayoutParams(layoutParams2);
        }
        z2 z2Var = this.T1;
        if (z2Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) z2Var.getLayoutParams();
            if (this.u2) {
                layoutParams3.topMargin = AndroidUtilities.dp(f10) + dp2 + size2;
            } else {
                layoutParams3.topMargin = (dp2 + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        gg.q qVar = this.Y2;
        if (qVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) qVar.getLayoutParams();
            if (this.u2) {
                c3 = 0;
                this.Y2.setTextColor(i0.a.d(0.5f, -16777216, -1));
                layoutParams4.topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                y50Var = this.G2;
                if (y50Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) y50Var.getLayoutParams();
                    if (i13 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.y3.z(64.0f, dp2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = AndroidUtilities.dp(64.0f) + i13;
                    }
                }
                z4 = this.u2;
                LinearLayout linearLayout = this.L0;
                m3 m3Var = this.H0;
                if (z4) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                    int dp3 = this.z1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
                    ((FrameLayout.LayoutParams) m3Var.getLayoutParams()).bottomMargin = dp3;
                    if (this.t2 != this.u2) {
                        m3Var.setLayoutParams((FrameLayout.LayoutParams) m3Var.getLayoutParams());
                    }
                    m3Var.r0 = dp3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + dp2 + size2;
                    ((FrameLayout.LayoutParams) m3Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
                    if (this.t2 != this.u2) {
                        m3Var.setLayoutParams((FrameLayout.LayoutParams) m3Var.getLayoutParams());
                    }
                    m3Var.r0 = AndroidUtilities.dp(f10);
                }
                this.S2 = true;
                dp = AndroidUtilities.dp(48.0f);
                if (this.z0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(60.0f);
                }
                if (this.v0.getVisibility() == 0) {
                    dp += AndroidUtilities.dp(40.0f);
                }
                ig.c cVar = z3Var.b;
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
                this.t2 = this.u2;
            }
            this.Y2.setTextColor(i0.a.k(-1, 191));
            layoutParams4.topMargin = ((dp2 + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
        }
        c3 = 0;
        y50Var = this.G2;
        if (y50Var != null) {
        }
        z4 = this.u2;
        LinearLayout linearLayout2 = this.L0;
        m3 m3Var2 = this.H0;
        if (z4) {
        }
        this.S2 = true;
        dp = AndroidUtilities.dp(48.0f);
        if (this.z0.getVisibility() == 0) {
        }
        if (this.v0.getVisibility() == 0) {
        }
        ig.c cVar2 = z3Var.b;
        TextView[] textViewArr2 = z3Var.c;
        layoutParams = (FrameLayout.LayoutParams) cVar2.getLayoutParams();
        if (layoutParams.rightMargin != dp) {
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.t2 = this.u2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.n2 = -1.0f;
        this.S2 = true;
        invalidate();
    }

    public final void p0() {
        m3 m3Var = this.H0;
        if (m3Var.T.y()) {
            m3Var.T.f(false);
        }
    }

    public final void q0() {
        if (this.H1) {
            ((z8) this.N1).d.P();
        }
    }

    public final void r0(boolean z4) {
        if (this.Y1 != null && this.c3 && this.X0) {
            w1 w1Var = this.M3;
            AndroidUtilities.cancelRunOnUIThread(w1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.P1.B;
            this.Y1.J(true);
            boolean z10 = this.C1;
            b4 b4Var = this.L1;
            if ((z10 && !b4Var.f) || this.D1) {
                this.h3 = false;
                this.Y1.setEnabled(false);
                this.Y1.j1(" ", z4);
                return;
            }
            if (this.E1 > 0) {
                this.h3 = false;
                this.Y1.setEnabled(true);
                this.Y1.j1(ja.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.E1, ','))), z4);
                return;
            }
            if (!b4Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.z2).getCurrentTime();
                int i10 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i10) {
                    this.h3 = true;
                    int currentTime2 = i10 - ConnectionsManager.getInstance(this.z2).getCurrentTime();
                    int i11 = currentTime2 / 60;
                    int i12 = currentTime2 % 60;
                    int i13 = R.string.StealthModeActiveHintShort;
                    Locale locale = Locale.US;
                    int measureText = (int) this.Y1.getEditField().getPaint().measureText(LocaleController.formatString(i13, String.format(locale, "%02d:%02d", 99, 99)));
                    this.Y1.setEnabled(true);
                    if (measureText * 1.2f >= this.Y1.getEditField().getMeasuredWidth()) {
                        o2 o2Var = this.Y1;
                        String formatString = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        o2Var.e = formatString;
                        o2Var.f = format;
                        o2Var.G1(z4);
                    } else {
                        this.Y1.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z4);
                    }
                    AndroidUtilities.runOnUIThread(w1Var, 1000L);
                    return;
                }
            }
            this.h3 = false;
            this.Y1.setEnabled(true);
            if (!b4Var.f) {
                this.Y1.j1(LocaleController.getString(this.B1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z4);
                return;
            }
            if (this.Y1.getStarsPrice() <= 0) {
                this.Y1.j1(LocaleController.getString(R.string.Comment), z4);
                return;
            }
            this.Y1.j1(ja.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r0, ',')), this.Y1.K4), z4);
            lq lqVar = this.Y1.K4[0];
            if (lqVar != null) {
                lqVar.spaceScaleX = 0.9f;
            }
        }
    }

    public final boolean s0() {
        if (this.p3) {
            if (this.o3.getReactionsWindow() == null) {
                b1(false);
                return true;
            }
            if (this.v2 > 0) {
                AndroidUtilities.hideKeyboard(this.o3.getReactionsWindow().c);
                return true;
            }
            this.o3.getReactionsWindow().d();
            return true;
        }
        f3 f3Var = this.g1;
        if (f3Var != null) {
            ph.f3 f3Var2 = f3Var.c;
            if (f3Var2 != null) {
                f3Var2.e(true);
                f3Var.c = null;
            }
            f3Var.b = null;
            f3Var.invalidate();
            f3Var.b(false);
        }
        m3 m3Var = this.H0;
        if (m3Var.T.y()) {
            m3Var.T.f(false);
            return true;
        }
        ph.f3 f3Var3 = this.C0;
        if (f3Var3 != null) {
            f3Var3.e(true);
        }
        ph.f3 f3Var4 = this.D0;
        if (f3Var4 != null) {
            f3Var4.e(true);
        }
        l40 l40Var = this.T2;
        if (l40Var != null) {
            l40Var.b(true);
        }
        w3 w3Var = this.q1;
        if (w3Var != null && w3Var.b) {
            w3Var.a();
            return true;
        }
        o2 o2Var = this.Y1;
        if (o2Var != null && o2Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.y0);
            if (this.Y1.Z0) {
                alertDialog$Builder.a.O = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.a.O = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new t1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((z8) this.N1).h(alertDialog$Builder.a);
            return true;
        }
        pk0 pk0Var = this.c2;
        if (pk0Var != null && pk0Var.getReactionsWindow() != null && !this.c2.getReactionsWindow().q) {
            this.c2.getReactionsWindow().d();
            return true;
        }
        o2 o2Var2 = this.Y1;
        if (o2Var2 != null && o2Var2.t0()) {
            if (this.v2 > 0) {
                AndroidUtilities.hideKeyboard(this.Y1.getEmojiView());
                return true;
            }
            this.Y1.n0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (m3Var.getVisibility() != 0 || m3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            m3Var.C();
            this.d3 = false;
            this.Z0.invalidate();
            return true;
        }
        o2 o2Var3 = this.Y1;
        if (o2Var3 != null) {
            long j10 = this.y1;
            TL_stories.StoryItem storyItem = this.L1.a;
            Editable editText = o2Var3.getEditText();
            this.G0.getClass();
            i9.J(j10, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.Y1);
        return true;
    }

    public void setAccount(int i10) {
        this.z2 = i10;
        this.P1 = MessagesController.getInstance(i10).storiesController;
        this.h1.b = i10;
        pk0 pk0Var = this.c2;
        if (pk0Var != null) {
            pk0Var.setCurrentAccount(i10);
            this.c2.p(null, null, true);
        }
        pk0 pk0Var2 = this.o3;
        if (pk0Var2 != null) {
            pk0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z4) {
        T0(0L, z4);
    }

    public void setDelegate(x3 x3Var) {
        this.N1 = x3Var;
    }

    public void setIsVisible(boolean z4) {
        if (this.c3 == z4) {
            return;
        }
        this.c3 = z4;
        if (z4) {
            this.b1.setCurrentAlpha(1.0f);
            r0(false);
        }
    }

    public void setLongpressed(boolean z4) {
        if (this.H1) {
            this.I2 = z4;
            invalidate();
        }
    }

    public void setOffset(float f10) {
        boolean z4 = f10 == 0.0f;
        if (this.Y0 != z4) {
            this.Y0 = z4;
            this.Z0.invalidate();
            if (this.H1 && this.G0.a && Build.VERSION.SDK_INT < 33) {
                m2.b bVar = this.S3;
                if (z4) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    i9 i9Var = ((z8) this.N1).d;
                    i9Var.i1 = true;
                    i9Var.P();
                }
            }
        }
    }

    public void setPaused(boolean z4) {
        if (this.O1 != z4) {
            this.O1 = z4;
            y2 y2Var = this.b1;
            if (z4) {
                y2Var.stopAnimation();
                y2Var.setAllowStartAnimation(false);
            } else {
                y2Var.startAnimation();
                y2Var.setAllowStartAnimation(true);
            }
            this.U0 = 0L;
            this.Z0.invalidate();
        }
    }

    public final void t0() {
        if (this.F2 == null) {
            t2 t2Var = new t2(this, getContext(), this.y0);
            this.F2 = t2Var;
            t2Var.W1 = new u2(this);
            t2Var.g0.f0();
            t2 t2Var2 = this.F2;
            t2Var2.T = true;
            t2Var2.r1();
            t2 t2Var3 = this.F2;
            t2Var3.U = new v2(this);
            t2Var3.m1().setText(this.Y1.getFieldText());
        }
    }

    public final void u0() {
        if (this.U1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.F3);
        this.U1 = aVar;
        aVar.setOnClickListener(new y1(this, 1));
        addView(this.U1, k7.b6.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.f6 f6Var = this.y0;
        o2 o2Var = new o2(this, AndroidUtilities.findActivity(getContext()), this, new m2(1, f6Var));
        this.Y1 = o2Var;
        o2Var.getEditField().useAnimatedTextDrawable();
        this.Y1.getEditField().setScaleX(0.0f);
        this.Y1.setOverrideKeyboardAnimation(true);
        this.Y1.setClipChildren(false);
        this.Y1.setDelegate(new p2(this));
        setDelegate(this.Y1);
        o2 o2Var2 = this.Y1;
        o2Var2.u4 = false;
        o2Var2.v4 = true;
        if (this.L1.f) {
            o2Var2.V0(false, false, false);
        } else {
            o2Var2.V0(true, true, false);
        }
        this.Y1.e();
        o2 o2Var3 = this.Y1;
        o2Var3.w4 = true;
        addView(o2Var3, k7.b6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.L3 != null) {
            this.Y1.P1(false);
        }
        this.Y1.C2 = this.w2;
        c4 c4Var = this.J2;
        c4Var.g.add(this.Z0);
        c4Var.g.add(this);
        if (this.X0) {
            this.Y1.E0();
        }
        r0(false);
        if (I0()) {
            this.Y1.setVisibility(8);
        }
        wg.g gVar = new wg.g(getContext(), f6Var, this.F3, this.C3);
        this.Z1 = gVar;
        gVar.setOnClickListener(new t1(this, 1));
        addView(this.Z1, k7.b6.e(57, 300, 85));
        this.Z1.setVisibility(8);
        this.Y1.setSideButtonsForAttach(this.Z1);
        this.F0 = getChildCount();
    }

    public final void w0() {
        if (this.g2 != null) {
            return;
        }
        g8 g8Var = new g8(getContext(), this.y0);
        this.g2 = g8Var;
        g8Var.setOnClickListener(new y1(this, 4));
        this.g2.setAlpha(0.0f);
        this.g2.setVisibility(8);
        addView(this.g2, k7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.X1 != null || getContext() == null) {
            return;
        }
        o1 o1Var = new o1(getContext(), this.F3);
        this.X1 = o1Var;
        o1Var.setOnClickListener(new y1(this, 5));
        o1 o1Var2 = this.X1;
        e1 e1Var = e1.T;
        boolean z4 = true;
        o1Var2.b(e1Var != null && e1Var.o(), false);
        o1 o1Var3 = this.X1;
        e1 e1Var2 = e1.T;
        if (e1Var2 != null && !e1Var2.m()) {
            z4 = false;
        }
        o1Var3.a(z4, false);
        addView(this.X1, k7.b6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void y0() {
        if (this.W1 != null || getContext() == null) {
            return;
        }
        this.V1 = new r1(getContext(), this.z2);
        s1 s1Var = new s1(getContext(), this.V1, this.F3);
        this.W1 = s1Var;
        s1Var.setOnClickListener(new y1(this, 6));
        this.W1.setOnLongClickListener(new v1(this, 1));
        addView(this.W1, k7.b6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.V1, k7.b6.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void z0() {
        if (this.d2 != null) {
            return;
        }
        if (this.Y1 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.e2 = textView;
        textView.setTextColor(-8026747);
        this.e2.setTextSize(1, 16.0f);
        this.e2.setText(LocaleController.getString(this.B1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        TextView textView2 = new TextView(getContext());
        this.f2 = textView2;
        textView2.setTextColor(-1);
        this.f2.setTextSize(1, 12.0f);
        TextView textView3 = this.f2;
        int dp = AndroidUtilities.dp(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f2.setGravity(17);
        k7.d6.a(this.f2);
        this.f2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.d2.addView(imageView, k7.b6.t(22, 22, 16, 12, 1, 4, 0));
        this.d2.addView(this.e2, k7.b6.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.d2.addView(this.f2, k7.b6.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.Y1.addView(this.d2, k7.b6.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
