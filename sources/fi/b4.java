package fi;

import a8.sa;
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
import c8.ja;
import c8.na;
import di.mb;
import di.ub;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.rs;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.ud;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.b61;
import org.telegram.ui.dr0;
import org.telegram.ui.jx;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class b4 extends st0 implements is {
    public org.telegram.ui.Components.g6 A0;
    public u3 A1;
    public float A2;
    public int A3;
    public org.telegram.ui.Components.g6 B0;
    public boolean B1;
    public long B2;
    public final t1 B3;
    public org.telegram.ui.Components.u5 C0;
    public s6 C1;
    public boolean C2;
    public final ArrayList C3;
    public org.telegram.ui.Components.u5 D0;
    public boolean D1;
    public boolean D2;
    public final ArrayList D3;
    public boolean E0;
    public boolean E1;
    public boolean E2;
    public boolean E3;
    public boolean F0;
    public boolean F1;
    public boolean F2;
    public boolean F3;
    public long G0;
    public v2 G1;
    public b30 G2;
    public final sa G3;
    public long H0;
    public a H1;
    public final dr0 H2;
    public final org.telegram.ui.Components.u5 H3;
    public boolean I0;
    public o1 I1;
    public boolean I2;
    public final org.telegram.ui.Components.u5 I3;
    public boolean J0;
    public p1 J1;
    public s2 J2;
    public final org.telegram.ui.Components.u5 J3;
    public boolean K0;
    public l1 K1;
    public FrameLayout K2;
    public float K3;
    public boolean L0;
    public k2 L1;
    public ub L2;
    public final Path L3;
    public final e3 M0;
    public lh.h M1;
    public boolean M2;
    public boolean M3;
    public final FrameLayout N0;
    public hi.l3 N1;
    public m2 N2;
    public ValueAnimator N3;
    public final u2 O0;
    public ValueAnimator O1;
    public float O2;
    public float O3;
    public final ImageReceiver P0;
    public mi0 P1;
    public boolean P2;
    public final ImageReceiver Q0;
    public LinearLayout Q1;
    public boolean Q2;
    public final ArrayList R0;
    public TextView R1;
    public boolean R2;
    public Runnable S0;
    public TextView S1;
    public boolean S2;
    public final a3 T0;
    public g8 T1;
    public boolean T2;
    public final jx U0;
    public ViewPropertyAnimator U1;
    public boolean U2;
    public g4 V0;
    public final fh.g V1;
    public final ImageReceiver V2;
    public float W0;
    public final fh.g W1;
    public ch.d W2;
    public final org.telegram.ui.Components.t8 X0;
    public final Paint X1;
    public final ImageReceiver X2;
    public final x3 Y0;
    public int Y1;
    public org.telegram.ui.Components.g5 Y2;
    public final h8 Z0;
    public ValueAnimator Z1;
    public boolean Z2;
    public m6.n a1;
    public float a2;
    public boolean a3;
    public int b1;
    public float b2;
    public mi0 b3;
    public org.telegram.ui.ActionBar.z0 c1;
    public float c2;
    public boolean c3;
    public t3 d1;
    public int d2;
    public float d3;
    public TL_stories.PeerStories e1;
    public boolean e2;
    public boolean e3;
    public final ArrayList f1;
    public boolean f2;
    public float f3;
    public final ImageView g0;
    public final ArrayList g1;
    public boolean g2;
    public int g3;
    public final ImageView h0;
    public final y3 h1;
    public boolean h2;
    public int h3;
    public final bi.v1 i0;
    public final bg.q0 i1;
    public int i2;
    public int i3;
    public final fh0 j0;
    public ArrayList j1;
    public final int j2;
    public t1 j3;
    public final ImageView k0;
    public int k1;
    public TextView k2;
    public float k3;
    public final org.telegram.ui.ActionBar.e6 l0;
    public long l1;
    public u l2;
    public boolean l3;
    public final n8 m0;
    public boolean m1;
    public int m2;
    public h6.m m3;
    public final v2 n0;
    public boolean n1;
    public int n2;
    public org.telegram.ui.ActionBar.z0 n3;
    public x6 o0;
    public boolean o1;
    public boolean o2;
    public org.telegram.ui.ActionBar.z0 o3;
    public hi.l3 p0;
    public boolean p1;
    public w2 p2;
    public final dh.c p3;
    public hi.l3 q0;
    public boolean q1;
    public boolean q2;
    public final ui.a q3;
    public hi.l3 r0;
    public long r1;
    public float r2;
    public final ui.f r3;
    public int s0;
    public final float s1;
    public p2 s2;
    public final gh.b s3;
    public final i9 t0;
    public int t1;
    public r40 t2;
    public TL_stories.TL_premium_boostsStatus t3;
    public final i3 u0;
    public boolean u1;
    public int u2;
    public org.telegram.messenger.e3 u3;
    public final c2 v0;
    public int v1;
    public boolean v2;
    public long v3;
    public final View w0;
    public int w1;
    public final a4 w2;
    public long w3;
    public final ImageView x0;
    public int x1;
    public final h2.f x2;
    public boolean x3;
    public final LinearLayout y0;
    public final z3 y1;
    public final org.telegram.ui.Components.u5 y2;
    public TLRPC.TL_channels_sendAsPeers y3;
    public final v2 z0;
    public final a8.b8 z1;
    public final org.telegram.ui.Components.u5 z2;
    public final t1 z3;

    public b4(Context context, final i9 i9Var, y3 y3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.L0 = true;
        this.R0 = new ArrayList();
        this.b1 = -5;
        this.s1 = 1.0f;
        z3 z3Var = new z3(this);
        this.y1 = z3Var;
        this.a2 = -1.0f;
        this.b2 = -1.0f;
        this.c2 = -1.0f;
        this.j2 = ConnectionsManager.generateClassGuid();
        this.y2 = new org.telegram.ui.Components.u5(this);
        this.z2 = new org.telegram.ui.Components.u5(this);
        dr0 dr0Var = new dr0();
        this.H2 = dr0Var;
        this.O2 = 1.0f;
        this.z3 = new t1(this, 4);
        this.B3 = new t1(this, 11);
        this.C3 = new ArrayList();
        this.D3 = new ArrayList();
        this.G3 = new sa(this, 24);
        this.H3 = new org.telegram.ui.Components.u5(this);
        this.I3 = new org.telegram.ui.Components.u5(this);
        this.J3 = new org.telegram.ui.Components.u5(this);
        this.L3 = new Path();
        dr0Var.E = new d6.i(this, 19);
        a4 a4Var = new a4();
        a4Var.g = new ArrayList();
        this.w2 = a4Var;
        this.x2 = new h2.f((int[]) null);
        this.f1 = new ArrayList();
        this.g1 = new ArrayList();
        final int i7 = 0;
        u2 u2Var = new u2(this, i7);
        this.O0 = u2Var;
        u2Var.B0 = false;
        u2Var.A1 = true;
        u2Var.y = true;
        u2Var.h0(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.V2 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
        imageReceiver.h0(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.X2 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.y = true;
        imageReceiver2.h0(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.P0 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.y = true;
        imageReceiver3.h0(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.Q0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.y = true;
        imageReceiver4.h0(0);
        u2Var.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.X0 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.t0 = i9Var;
        this.h1 = y3Var;
        this.z1 = y3Var.g;
        this.C1 = np.s1(m10.t0).P1();
        y3Var.l.setColor(-16777216);
        this.X1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.l0 = e6Var;
        setClipChildren(false);
        a3 a3Var = new a3(this, context, this.M0, e6Var, i9Var);
        this.T0 = a3Var;
        gh.b bVar = new gh.b(e6Var, org.telegram.ui.ActionBar.j6.Je, 0.8f);
        this.s3 = bVar;
        ui.c cVar = new ui.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !gz.e()) {
            this.r3 = null;
            this.q3 = cVar;
        } else {
            ui.f fVar = new ui.f(cVar);
            this.r3 = fVar;
            fVar.k(org.telegram.messenger.g0.L(8.0f));
            this.q3 = fVar;
        }
        jh.k kVar = new jh.k(this);
        ui.a aVar = this.q3;
        dh.c cVar2 = new dh.c(aVar, aVar, aVar);
        cVar2.h = kVar;
        cVar2.i = this;
        this.p3 = cVar2;
        this.V1 = cVar2.c(this, bVar, false);
        fh.g c10 = cVar2.c(this, bVar, false);
        this.W1 = c10;
        c10.u(org.telegram.messenger.g0.L(32.0f));
        e3 e3Var = new e3(this, context, y3Var, i9Var);
        this.M0 = e3Var;
        e3Var.setClipChildren(false);
        this.U0 = new jx(this.m2, e3Var);
        e3Var.addView(a3Var, ja.c(-1.0f, -1));
        i3 i3Var = new i3(this, getContext(), i9Var.E, i9Var, e6Var);
        this.u0 = i3Var;
        i3Var.c0.setOnClickListener(new v1(this, 10));
        ImageView imageView = new ImageView(context);
        this.x0 = imageView;
        imageView.setImageDrawable(y3Var.m);
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new v1(this, 11));
        imageView.setContentDescription(hd.M0(2131745459, null));
        na.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(y3Var.n);
        imageView2.setPadding(L, L, L, L);
        v2 v2Var = new v2(this, getContext(), 1);
        this.z0 = v2Var;
        org.telegram.ui.Components.g6 g6Var = this.B0;
        if (g6Var != null) {
            g6Var.setCallback(v2Var);
        }
        v2Var.setWillNotDraw(false);
        v2Var.setOnClickListener(new v1(this, 12));
        v2 v2Var2 = new v2(this, getContext(), 2);
        this.n0 = v2Var2;
        org.telegram.ui.Components.g6 g6Var2 = this.A0;
        if (g6Var2 != null) {
            g6Var2.setCallback(v2Var2);
        }
        v2Var2.setWillNotDraw(false);
        v2Var2.setOnClickListener(new v1(this, 13));
        v2Var2.setOnLongClickListener(new b2(i7, this, i9Var));
        x6 x6Var = new x6(context, y3Var);
        this.o0 = x6Var;
        x6Var.setPadding(L, L, L, L);
        v2Var2.addView(this.o0, ja.e(40, 40, 3));
        v2Var.addView(imageView2, ja.e(40, 40, 3));
        na.b(v2Var2, 0.3f, 5.0f);
        na.b(v2Var, 0.3f, 5.0f);
        u2Var.A1 = true;
        u2Var.H0(e3Var);
        bg.q0 q0Var = new bg.q0(10);
        this.i1 = q0Var;
        e3Var.setOutlineProvider(q0Var);
        e3Var.setClipToOutline(true);
        addView(e3Var);
        x3 x3Var = new x3(context, z3Var);
        this.Y0 = x3Var;
        x3Var.setOnClickListener(new View.OnClickListener(this) { // from class: fi.r1
            public final /* synthetic */ b4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i7;
                i9 i9Var2 = i9Var;
                b4 b4Var = this.b;
                switch (i10) {
                    case 0:
                        long j3 = m10.i(b4Var.m2).n;
                        long j10 = b4Var.l1;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                i9Var2.N(an.ua(j10));
                                break;
                            } else {
                                i9Var2.N(ProfileActivity.C4(j10));
                                break;
                            }
                        } else {
                            Bundle f10 = r.b.f(1, TeXSymbolParser.TYPE_ATTR);
                            f10.putLong("dialog_id", b4Var.l1);
                            i9Var2.N(new x80(f10, null));
                            break;
                        }
                    default:
                        if (!b4Var.y1.j()) {
                            b4Var.a1(true);
                            break;
                        } else {
                            i9Var2.U();
                            if (!i9.D1) {
                                np.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            b4Var.i0.setContentDescription(hd.M0(!i9.D1 ? 2131748314 : 2131743849, null));
                            break;
                        }
                }
            }
        });
        e3Var.addView(x3Var, ja.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.N0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.y0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, ja.r(40, 40, 5));
        linearLayout.addView(v2Var, ja.r(40, 40, 5));
        linearLayout.addView(v2Var2, ja.r(40, 40, 5));
        addView(linearLayout, ja.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.g0 = imageView3;
        imageView3.setImageDrawable(y3Var.q);
        imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.h0(-1, 1, -1));
        imageView3.setContentDescription(hd.M0(2131754839, null));
        e3Var.addView(imageView3, ja.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.h0 = imageView4;
        imageView4.setImageDrawable(y3Var.r);
        imageView4.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.h0(-1, 1, -1));
        imageView4.setContentDescription(hd.M0(2131754808, null));
        e3Var.addView(imageView4, ja.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.d(i9Var, 21));
        imageView3.setOnClickListener(new d0(this, e6Var, i9Var, context, y3Var, 1));
        bi.v1 v1Var = new bi.v1(context, 2);
        this.i0 = v1Var;
        e3Var.addView(v1Var, ja.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        fh0 fh0Var = new fh0(context);
        this.j0 = fh0Var;
        fh0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        v1Var.addView(fh0Var);
        ImageView imageView5 = new ImageView(context);
        this.k0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        imageView5.setImageDrawable(y3Var.t);
        v1Var.addView(imageView5);
        imageView5.setVisibility(8);
        n8 n8Var = new n8(context);
        this.m0 = n8Var;
        n8Var.setOnClickListener(new v1(this, 2));
        e3Var.addView(n8Var, ja.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i10 = 1;
        v1Var.setOnClickListener(new View.OnClickListener(this) { // from class: fi.r1
            public final /* synthetic */ b4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i10;
                i9 i9Var2 = i9Var;
                b4 b4Var = this.b;
                switch (i102) {
                    case 0:
                        long j3 = m10.i(b4Var.m2).n;
                        long j10 = b4Var.l1;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                i9Var2.N(an.ua(j10));
                                break;
                            } else {
                                i9Var2.N(ProfileActivity.C4(j10));
                                break;
                            }
                        } else {
                            Bundle f10 = r.b.f(1, TeXSymbolParser.TYPE_ATTR);
                            f10.putLong("dialog_id", b4Var.l1);
                            i9Var2.N(new x80(f10, null));
                            break;
                        }
                    default:
                        if (!b4Var.y1.j()) {
                            b4Var.a1(true);
                            break;
                        } else {
                            i9Var2.U();
                            if (!i9.D1) {
                                np.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            b4Var.i0.setContentDescription(hd.M0(!i9.D1 ? 2131748314 : 2131743849, null));
                            break;
                        }
                }
            }
        });
        this.Z0 = new h8(this, y3Var);
        e3Var.addView(i3Var, ja.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        c2 c2Var = new c2(this, context, i9Var, i9Var.w, view, frameLayout, i9Var);
        this.v0 = c2Var;
        e3Var.addView(view, ja.e(-1, ns.e3, 87));
        e3Var.addView(c2Var, ja.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        e3Var.addView(frameLayout, ja.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        v1Var.setBackground(org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, 0, o4, o4));
        int L3 = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, 0, o10, o10));
        int L4 = org.telegram.messenger.g0.L(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.k0(L4, L4, L4, L4, 0, o11, o11));
        int L5 = org.telegram.messenger.g0.L(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.k0(L5, L5, L5, L5, 0, o12, o12));
        int L6 = org.telegram.messenger.g0.L(20.0f);
        int o13 = i0.a.o(-1, 100);
        v2Var2.setBackground(org.telegram.ui.ActionBar.j6.k0(L6, L6, L6, L6, 0, o13, o13));
        int L7 = org.telegram.messenger.g0.L(20.0f);
        int o14 = i0.a.o(-1, 100);
        v2Var.setBackground(org.telegram.ui.ActionBar.j6.k0(L7, L7, L7, L7, 0, o14, o14));
        org.telegram.ui.Cells.r9 r9Var = i3Var.a0;
        View n10 = r9Var.n(context);
        if (n10 != null) {
            org.telegram.messenger.g0.E2(n10);
            addView(n10);
        }
        r9Var.D = new d2(this, 0);
        r9Var.S(this);
    }

    public static void T0(r6 r6Var, ImageReceiver imageReceiver, String str) {
        if (r6Var.s) {
            imageReceiver.u0(null, null, gc.g(r6Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.r0(gc.g(r6Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(b4 b4Var, ValueAnimator valueAnimator) {
        n8 n8Var = b4Var.m0;
        b4Var.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x3 x3Var = b4Var.Y0;
        x3Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var.O3);
        x3Var.setAlpha(1.0f - b4Var.O3);
        ImageView imageView = b4Var.g0;
        imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var.O3);
        imageView.setAlpha(1.0f - b4Var.O3);
        ImageView imageView2 = b4Var.h0;
        imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var.O3);
        imageView2.setAlpha(1.0f - b4Var.O3);
        bi.v1 v1Var = b4Var.i0;
        v1Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var.O3);
        v1Var.setAlpha((1.0f - b4Var.O3) * b4Var.O2);
        v2 v2Var = b4Var.G1;
        if (v2Var != null) {
            v2Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * b4Var.O3);
            b4Var.G1.setAlpha(1.0f - b4Var.O3);
        }
        if (n8Var != null) {
            n8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var.O3);
            n8Var.setAlpha(1.0f - b4Var.O3);
        }
        b4Var.u0.setAlpha(1.0f - b4Var.O3);
        u3 u3Var = b4Var.A1;
        float f10 = u3Var == null ? 0.0f : ((z8) u3Var).d.W;
        float hideInterfaceAlpha = b4Var.getHideInterfaceAlpha();
        v2 v2Var2 = b4Var.n0;
        if (v2Var2 != null) {
            v2Var2.setAlpha((1.0f - b4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = b4Var.x0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - b4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        v2 v2Var3 = b4Var.z0;
        if (v2Var3 != null) {
            v2Var3.setAlpha((1.0f - b4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        k2 k2Var = b4Var.L1;
        if (k2Var != null) {
            k2Var.setAlpha(1.0f - b4Var.O3);
            b4Var.invalidate();
        }
        b4Var.M0.invalidate();
    }

    public static void Y(b4 b4Var, boolean z10) {
        org.telegram.ui.ActionBar.z0 z0Var = b4Var.n3;
        if (z0Var == null || b4Var.m3 == null || z0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(i9.B1 - 0.2f) < 0.05f) {
                b4Var.n3.setSubtext(hd.M0(2131743574, null));
            } else if (Math.abs(i9.B1 - 0.5f) < 0.05f) {
                b4Var.n3.setSubtext(hd.M0(2131743576, null));
            } else if (Math.abs(i9.B1 - 1.0f) < 0.05f) {
                b4Var.n3.setSubtext(hd.M0(2131743577, null));
            } else if (Math.abs(i9.B1 - 1.5f) < 0.05f) {
                b4Var.n3.setSubtext(hd.M0(2131743578, null));
            } else if (Math.abs(i9.B1 - 2.0f) < 0.05f) {
                b4Var.n3.setSubtext(hd.M0(2131743575, null));
            } else {
                b4Var.n3.setSubtext(hd.a0(null, null, 2131743579, eu0.a(i9.B1) + "x"));
            }
        }
        b4Var.m3.H(z10, i9.B1);
    }

    public static void Z(b4 b4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (b4Var.G0() || b4Var.y1.f) {
            return;
        }
        if (m10.i(b4Var.m2).q()) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, hd.M0(2131744887, null), false, b4Var.l0).setOnClickListener(new v1(b4Var, 8));
            return;
        }
        Drawable drawable = b4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        e2 e2Var = new e2(b4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, hd.M0(2131744887, null), false, b4Var.l0);
        c10.setOnClickListener(new v1(b4Var, 9));
        c10.setIcon(e2Var);
    }

    public static void b0(b4 b4Var) {
        z3 z3Var = b4Var.y1;
        TL_stories.StoryItem storyItem = z3Var.a;
        if ((storyItem == null && z3Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = z3Var.h();
        boolean z10 = z3Var.e;
        if (h == null || !h.exists()) {
            b4Var.Y0();
            return;
        }
        MediaController.d0(h.toString(), b4Var.getContext(), z10 ? 1 : 0, null, null, new di.t7(1, b4Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c0(b4 b4Var, long j3) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j3 > 0) {
            TLRPC.User a22 = np.s1(b4Var.m2).a2(Long.valueOf(j3));
            str = a22.first_name;
            z10 = a22.stories_hidden;
            chat = a22;
        } else {
            TLRPC.Chat M0 = np.s1(b4Var.m2).M0(Long.valueOf(-j3));
            str = M0.title;
            z10 = M0.stories_hidden;
            chat = M0;
        }
        org.telegram.messenger.g0.i3(new di.l(b4Var, np.s1(b4Var.m2), j3, !z10, str, chat), 200L);
    }

    public static void d0(b4 b4Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, b4Var.getContext(), b4Var.l0);
        String M0 = hd.M0(b4Var.G0() ? 2131751564 : 2131751487, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = hd.M0(b4Var.G0() ? 2131751565 : 2131751488, null);
        alertDialog$Builder.k(hd.M0(2131751598, null), new q1(b4Var, 2));
        alertDialog$Builder.h(hd.M0(2131752589, null), new di.o(26));
        ((z8) b4Var.A1).h(t1Var);
        t1Var.i();
    }

    public static void f0(b4 b4Var) {
        org.telegram.ui.ActionBar.e6 e6Var = b4Var.l0;
        e3 e3Var = b4Var.M0;
        if (b4Var.q1) {
            return;
        }
        int i7 = 0;
        if (!b4Var.o1) {
            k2 k2Var = b4Var.L1;
            int i10 = -b4Var.b1;
            b4Var.b1 = i10;
            org.telegram.messenger.g0.F3(i10, k2Var, null);
            org.telegram.messenger.p2.E.a();
            String p10 = b4Var.l1 >= 0 ? q10.p(np.s1(b4Var.m2).a2(Long.valueOf(b4Var.l1))) : "";
            (np.s1(b4Var.m2).D3() ? new cc(e3Var, e6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743758, p10))) : new cc(e3Var, e6Var).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743758, p10)), hd.M0(2131743759, null), new t1(b4Var, 5))).j();
            return;
        }
        if (b4Var.t3 != null && b4Var.u3 != null) {
            ug.j0.w1(new bi.t6(b4Var, 2), b4Var.t3, b4Var.u3, b4Var.l1, true);
            return;
        }
        i9 i9Var = b4Var.t0;
        if (i9Var != null) {
            i9Var.k1 = true;
            i9Var.V();
        }
        np.s1(b4Var.m2).G0().a(b4Var.l1, new w1(b4Var, i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.m2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f10 = 1.0f - this.y2.c;
        k5 k5Var = this.t0.x;
        return (1.0f - (k5Var == null ? 0.0f : k5Var.f)) * f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        i9 i9Var;
        if (!this.y1.f || (i9Var = this.t0) == null || i9Var.B0 == null || B0(true)) {
            return 0L;
        }
        return i9Var.B0.j();
    }

    public static void h0(b4 b4Var) {
        z3 z3Var = b4Var.y1;
        if (z3Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = z3Var.a.id;
        tL_stories_exportStoryLink.peer = np.s1(b4Var.m2).j1(b4Var.l1);
        ConnectionsManager.getInstance(b4Var.m2).sendRequest(tL_stories_exportStoryLink, new t2());
    }

    public final void A0() {
        if (this.K2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.M0(2131744453, null));
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.l0;
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        TextView textView2 = new TextView(getContext());
        na.a(textView2);
        textView2.setText(hd.M0(2131754230, null));
        int i10 = org.telegram.ui.ActionBar.j6.Ji;
        org.telegram.ui.ActionBar.q6.U(textView2, i10, e6Var);
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i10, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(textView2, k02, M, g10, e6Var);
        textView2.setOnClickListener(new v1(this, 3));
        linearLayout.addView(textView, ja.o(-1, -2));
        linearLayout.addView(textView2, ja.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, ja.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.M0.addView(frameLayout);
        this.K2 = frameLayout;
    }

    public final boolean B0(boolean z10) {
        e1 e1Var;
        TLRPC.Peer i7;
        e1 e1Var2;
        long e10 = m10.i(this.m2).e();
        long j3 = this.l1;
        i9 i9Var = this.t0;
        if (j3 >= 0 || (e1Var2 = i9Var.B0) == null) {
            if (j3 < 0 || i9Var == null || (e1Var = i9Var.B0) == null || !e1Var.l()) {
                return false;
            }
            return !z10 || (i7 = i9Var.B0.i()) == null || this.l1 == org.telegram.messenger.m5.o(i7) || org.telegram.messenger.m5.o(i7) == e10 || this.l1 == e10;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i10 = e1Var2.i();
        TLRPC.Chat M0 = np.s1(this.m2).M0(Long.valueOf(-this.l1));
        if (i9Var.B0.l() || org.telegram.messenger.t3.w(14, M0)) {
            return i10 == null || this.l1 == org.telegram.messenger.m5.o(i10) || org.telegram.messenger.m5.o(i10) == m10.i(this.m2).e();
        }
        return false;
    }

    public final void C0(Canvas canvas, int i7, int i10) {
        TextureView textureView;
        a4 a4Var = this.w2;
        org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) a4Var.e;
        if (j4Var != null && ((SurfaceView) a4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.g0.z0((SurfaceView) a4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (j4Var != null && (textureView = (TextureView) a4Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i7, i10);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        e3 e3Var = this.M0;
        canvas.scale(i7 / e3Var.getMeasuredWidth(), i10 / e3Var.getMeasuredHeight());
        this.O0.h(canvas, null);
        canvas.restore();
    }

    public final void D0(hi.o8 o8Var, TL_stories.StoryItem storyItem) {
        u3 u3Var = this.A1;
        hi.q8 q8Var = new hi.q8(storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, getContext(), this.l0);
        q8Var.W0(o8Var);
        hi.i1 i1Var = q8Var.m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof hi.l8) {
                    ((hi.l8) view).f(false);
                }
            }
        }
        q8Var.Q0(true);
        q8Var.O1 = new ab.g(17, this, storyItem);
        ((z8) u3Var).h(q8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r3 == r10.P1) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(ViewGroup viewGroup, float f10, float f11, boolean z10) {
        hi.l3 l3Var;
        a4 a4Var;
        org.telegram.ui.j4 j4Var;
        if (viewGroup != null) {
            hi.l3 l3Var2 = this.p0;
            if ((l3Var2 == null || !l3Var2.W) && ((l3Var = this.q0) == null || !l3Var.W)) {
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        i3 i3Var = this.u0;
                        if (childAt == i3Var) {
                            Rect rect = org.telegram.messenger.g0.Q;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f10, (int) f11)) {
                                float top = f11 - childAt.getTop();
                                z7 z7Var = i3Var.c0;
                                if (z7Var.x == 1.0f && !i3Var.t0) {
                                    if (top > z7Var.getTranslationY() + (i3Var.s0.getTop() - i3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.M0 || (a4Var = this.w2) == null || (j4Var = (org.telegram.ui.j4) a4Var.e) == null || !E0(j4Var, f10 - childAt.getX(), f11 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f10, (int) f11))) {
                            a3 a3Var = this.T0;
                            if (childAt == a3Var && a3Var.b == null && (f10 < org.telegram.messenger.g0.L(60.0f) || f10 > viewGroup.getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f))) {
                                Matrix matrix = a3Var.e;
                                float[] fArr = a3Var.f;
                                for (int i10 = 0; i10 < a3Var.getChildCount(); i10++) {
                                    View childAt2 = a3Var.getChildAt(i10);
                                    if (childAt2 != a3Var.d && (childAt2 instanceof p8)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f10;
                                        fArr[1] = f11;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                c2 c2Var = this.v0;
                                if (childAt == c2Var) {
                                    b61 b61Var = c2Var.f;
                                    di.c1 c1Var = c2Var.c;
                                    b61 b61Var2 = c2Var.f;
                                    b61Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f10 - c2Var.getX()) - b61Var2.getX()), (int) ((f11 - c2Var.getY()) - b61Var2.getY()))) {
                                        if (c2Var.g0) {
                                            continue;
                                        } else if (!this.f2) {
                                            if (f11 <= c2Var.s() + c2Var.getY() && c1Var.E(f10, (f11 - c2Var.getY()) - c1Var.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.f2) {
                                        if (childAt == this.L1 && f11 > rect2.top) {
                                        }
                                    }
                                    if (!z10) {
                                        if (rect2.contains((int) f10, (int) f11)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            k2 k2Var = this.L1;
                                            if (k2Var != null && childAt == k2Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && E0((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), z10)) {
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

    public final boolean F0(View view, MotionEvent motionEvent) {
        float x10 = getX();
        e3 e3Var = this.M0;
        float x11 = view.getX() + e3Var.getX() + x10;
        float y10 = view.getY() + e3Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + ((float) view.getHeight());
    }

    public final boolean G0() {
        k6 k6Var;
        i9 i9Var = this.t0;
        return (i9Var == null || (k6Var = i9Var.O0) == null || k6Var.e != 4) ? false : true;
    }

    public final boolean H0() {
        TLRPC.User a22;
        return G0() && (a22 = np.s1(this.m2).a2(Long.valueOf(this.t0.O0.d))) != null && a22.bot && a22.bot_can_edit;
    }

    public abstract boolean I0();

    public final void J0(ch.p0 p0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        z3 z3Var = this.y1;
        TL_stories.StoryItem storyItem = z3Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && p0Var == null) {
            j0();
            this.C1.j0(this.l1, z3Var.a, null);
        } else if (p0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(this.m2).r.get("❤");
            if (tL_availableReaction != null) {
                this.Z2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a10 = ch.l0.a();
                gc b10 = gc.b(document);
                ImageReceiver imageReceiver = this.V2;
                imageReceiver.q0(b10, a10, null, null, null, 0);
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                this.a3 = true;
                this.C1.j0(this.l1, z3Var.a, ch.p0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.C1.j0(this.l1, z3Var.a, p0Var);
        }
        TL_stories.StoryItem storyItem2 = z3Var.a;
        v2 v2Var = this.n0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.o0.setReaction(null);
            v2Var.setContentDescription(hd.M0(2131754851, null));
            z10 = false;
        } else {
            z11 = !z11;
            this.o0.setReaction(ch.p0.d(reaction));
            v2Var.setContentDescription(hd.M0(2131754850, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.n1 && z11) {
            TL_stories.StoryItem storyItem3 = z3Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = z3Var.a.views;
            int i7 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i7;
            if (i7 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = z3Var.a;
        ch.s0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        e1 e1Var;
        if (this.y3 != null) {
            return;
        }
        i9 i9Var = this.t0;
        if (i9Var != null && (e1Var = i9Var.B0) != null) {
            if (e1Var.w == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers M1 = np.s1(this.m2).M1(this.l1, true);
        this.y3 = M1;
        k2 k2Var = this.L1;
        if (k2Var == null || M1 == null) {
            return;
        }
        k2Var.j2(true);
    }

    public final boolean L0() {
        k2 k2Var = this.L1;
        if (k2Var == null) {
            return false;
        }
        boolean z10 = k2Var.h3;
        if (z10) {
            k2Var.K1();
        }
        org.telegram.messenger.g0.i3(new t1(this, 3), 300L);
        return z10;
    }

    public final void M0() {
        CharSequence charSequence;
        long j3;
        w1 w1Var;
        int i7;
        long j10;
        np.e1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.L1.getTextWithEntities();
        long e10 = m10.i(this.m2).e();
        TLRPC.Peer i10 = this.t0.B0.i();
        if (i10 != null) {
            e10 = org.telegram.messenger.m5.o(i10);
        }
        Context context = getContext();
        int i11 = this.m2;
        String s5 = org.telegram.messenger.m5.s(i11, this.l1);
        long messageMinPrice = getMessageMinPrice();
        long j11 = this.v3;
        w1 w1Var2 = new w1(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context, (org.telegram.ui.ActionBar.e6) bVar, false);
        u2Var.O();
        u2Var.w0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        u2Var.O = f10;
        int[] iArr = np.s1(i11).Y6;
        CharSequence j02 = gj.j0(textWithEntities, false, false, new TextPaint());
        if (j02 instanceof Spannable) {
            Spannable spannable = (Spannable) j02;
            charSequence = j02;
            j3 = j11;
            w1Var = w1Var2;
            i7 = ((org.telegram.ui.Components.p5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.p5.class)).length + ((org.telegram.messenger.g6[]) spannable.getSpans(0, charSequence.length(), org.telegram.messenger.g6.class)).length;
        } else {
            charSequence = j02;
            j3 = j11;
            w1Var = w1Var2;
            i7 = 0;
        }
        int max = (int) Math.max(messageMinPrice, j3 <= 0 ? 100L : j3);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                j10 = messageMinPrice;
                break;
            }
            int i12 = length * 7;
            int i13 = iArr[i12];
            j10 = messageMinPrice;
            int i14 = iArr[i12 + 2];
            if (i7 <= iArr[i12 + 3] && charSequence.length() <= i14) {
                max = Math.max(max, i13);
                break;
            } else {
                length--;
                messageMinPrice = j10;
            }
        }
        long[] jArr = {max};
        hi.d dVar = new hi.d(context, null, true);
        s0 s0Var = new s0();
        s0Var.c = e10;
        s0Var.f = textWithEntities;
        s0Var.g = jArr[0];
        n0 n0Var = new n0(i11, context, true);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        bi.g2 g2Var = new bi.g2(context, hd.M0(2131748814, null), bVar);
        f11.addView(g2Var, ja.q(-1, -1, 1.0f, ns.x1, 0, 0, 5, 0));
        bi.g2 g2Var2 = new bi.g2(context, hd.M0(2131748815, null), bVar);
        f11.addView(g2Var2, ja.q(-1, -1, 1.0f, ns.x1, 5, 0, 5, 0));
        bi.g2 g2Var3 = new bi.g2(context, hd.M0(2131748816, null), bVar);
        f11.addView(g2Var3, ja.q(-1, -1, 1.0f, ns.x1, 5, 0, 0, 0));
        s sVar = new s(context, bVar, r1);
        w1 w1Var3 = w1Var;
        long j12 = j10;
        z10[] z10VarArr = {new r(jArr, dVar, new eq[1], s0Var, n0Var, i11, g2Var, g2Var2, g2Var3, sVar, new boolean[]{true})};
        n0Var.set(s0Var);
        int i15 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i16 = np.s1(i11).Z6;
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        while (true) {
            if (i17 >= i15) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i17] >= j12) {
                if (i17 > 0 && arrayList.isEmpty() && iArr3[i17] > j12) {
                    arrayList.add(Integer.valueOf((int) j12));
                }
                int i18 = iArr3[i17];
                if (i18 <= i16) {
                    arrayList.add(Integer.valueOf(i18));
                    if (iArr3[i17] == i16) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i16));
                    break;
                }
            }
            i17++;
            iArr2 = iArr3;
            i15 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) i5.c.h(1, arrayList)).intValue() < i16) {
            arrayList.add(Integer.valueOf(i16));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            iArr4[i19] = ((Integer) arrayList.get(i19)).intValue();
        }
        sVar.f0 = iArr4;
        sVar.setValue((int) jArr[0]);
        f10.addView(sVar, ja.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        z10VarArr[0].a(Integer.valueOf((int) jArr[0]));
        f10.addView(f11, ja.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = c8.sa.b(context, 20.0f, i20, true, bVar);
        org.telegram.messenger.k5.l(b10, 17, null, 2131748811);
        f10.addView(b10, ja.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = c8.sa.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.k5.q(null, null, 2131748812, new Object[]{s5}, b11);
        f10.addView(b11, ja.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        f10.addView(n0Var, ja.t(-2, -2, 17, 42, 22, 42, 20));
        f10.addView(dVar, ja.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        u2Var.show();
        dVar.setOnClickListener(new ah.g(w1Var3, jArr, u2Var, 9));
    }

    public final void N0() {
        if (this.L1 == null) {
            return;
        }
        r0();
        this.s2.e2.i0();
        this.s2.y1(-1, true);
        p2 p2Var = this.s2;
        p2Var.U1 = this.l1;
        p2Var.e1();
        this.s2.a1().setText(this.L1.getFieldText());
        ((z8) this.A1).h(this.s2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j3 = this.l1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog S0 = np.s1(this.m2).S0(this.l1);
        if (S0 != null) {
            bundle.putInt("message_id", S0.top_message);
        }
        this.t0.N(new an(bundle));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r6.B0.P == r6.E0.getSink()) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(long j3) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        e1 e1Var;
        wi.n nVar;
        wi.n nVar2;
        if (!this.u1) {
            this.w2.e = null;
            return;
        }
        z3 z3Var = this.y1;
        if (!z3Var.f) {
            if (!z3Var.e) {
                org.telegram.messenger.a8.b("PeerStoriesView.requestVideoPlayer(" + j3 + "): null, not a video");
                ((z8) this.A1).c(null, null, 0L, this.w2);
                a4 a4Var = this.w2;
                a4Var.e = null;
                a4Var.a = false;
                return;
            }
            if (z3Var.f() == null || !new File(this.y1.f()).exists()) {
                TL_stories.StoryItem storyItem = this.y1.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.l1;
                    try {
                        document2 = s6.C(this.m2, storyItem);
                        try {
                            TL_stories.StoryItem storyItem2 = this.y1.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = org.telegram.messenger.w7.G(this.m2).F(this.y1.a);
                            }
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(this.m2);
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
                            sb2.append(this.y1.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(org.telegram.messenger.w7.B(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.f(bArr));
                            sb2.append("&sid=");
                            sb2.append(this.y1.a.id);
                            sb2.append("&did=");
                            sb2.append(this.y1.a.dialogId);
                            Uri parse = Uri.parse("tg://" + org.telegram.messenger.w7.r(null, document2) + sb2.toString());
                            org.telegram.messenger.a8.b("StoryViewer requestVideoPlayer(" + j3 + "): playing from " + parse);
                            this.B2 = (long) (gj.H0(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((z8) this.A1).c(document, uri, j3, this.w2);
                            this.M0.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(this.y1.f()));
                org.telegram.messenger.a8.b("StoryViewer requestVideoPlayer(" + j3 + "): playing from attachPath " + fromFile);
                this.B2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                org.telegram.messenger.a8.b("PeerStoriesView.requestVideoPlayer(" + j3 + "): playing from null?");
            }
            ((z8) this.A1).c(document, uri, j3, this.w2);
            this.M0.invalidate();
            return;
        }
        u3 u3Var = this.A1;
        TL_stories.StoryItem storyItem3 = z3Var.a;
        long j10 = this.l1;
        int i7 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z10 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        a4 a4Var2 = this.w2;
        z8 z8Var = (z8) u3Var;
        z8Var.i(true, true);
        e1 e1Var2 = z8Var.d.B0;
        if (e1Var2 == null || e1Var2.b != j10 || !e1Var2.f(inputGroupCall)) {
            hi.r3 r3Var = z8Var.d.E0;
            if (r3Var != null) {
                r3Var.b(j10, null);
                hi.r3 r3Var2 = z8Var.d.E0;
                SurfaceViewRenderer surfaceViewRenderer = r3Var2.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = r3Var2.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                r3Var2.r = false;
                r3Var2.c(false, false);
            }
            g1 g1Var = g1.w;
            if (g1Var == null || g1Var.b == null || (nVar2 = g1Var.a) == null || !nVar2.e() || !g1Var.b.f(inputGroupCall)) {
                e1Var = null;
            } else {
                e1Var = g1Var.b;
                if (g1Var.a != null) {
                    org.telegram.ui.Components.voip.u0 u0Var = g1Var.e;
                    g1Var.e = null;
                    g1Var.d.a = null;
                    g1Var.a.a(new ai.f0(u0Var, 15));
                }
            }
            e1 e1Var3 = z8Var.d.B0;
            if (e1Var3 != null && e1Var3 != e1Var) {
                if (e1Var3.n || g1.e(e1Var3)) {
                    if (e1Var == null) {
                        i9 i9Var = z8Var.d;
                    }
                    z8Var.d.B0.s(null);
                } else {
                    z8Var.d.B0.e();
                }
                z8Var.d.B0 = null;
            }
            if (e1Var != null) {
                z8Var.d.B0 = e1Var;
            }
            g1 g1Var2 = g1.w;
            if (g1Var2 != null && (nVar = g1Var2.a) != null && nVar.e()) {
                g1Var2.a.b();
            }
            h9 h9Var = z8Var.d.A0;
            if (h9Var != null) {
                h9Var.release(null);
                z8Var.d.A0 = null;
            }
            a4 a4Var3 = z8Var.d.G0;
            if (a4Var3 != null) {
                a4Var3.c = null;
                a4Var3.b = null;
                a4Var3.a = false;
                a4Var3.e = null;
                a4Var3.f = null;
                a4Var3.d = null;
                a4Var3.b();
                z8Var.d.G0 = null;
            }
            if (z8Var.d.B0 == null) {
                e1 e1Var4 = e1.X;
                if (e1Var4 == null || !e1Var4.f(inputGroupCall)) {
                    i9 i9Var2 = z8Var.d;
                    i9Var2.B0 = new e1(z8Var.c, i9Var2.h, storyItem3, j10, i7, z10, inputGroupCall, false, false);
                } else {
                    z8Var.d.B0 = e1.X;
                }
            }
            i9 i9Var3 = z8Var.d;
            i9Var3.B0.s(i9Var3.E0.getSink());
            i9 i9Var4 = z8Var.d;
            e1 e1Var5 = i9Var4.B0;
            if (g1.w == null) {
                g1.w = new g1();
            }
            g1 g1Var3 = g1.w;
            wi.n nVar3 = g1Var3.a;
            if (nVar3 != null && nVar3.d()) {
                wi.n nVar4 = g1Var3.a;
                if (nVar4.c != 0) {
                    if (g1Var3.b != e1Var5) {
                        nVar4.b();
                    }
                    i9 i9Var5 = z8Var.d;
                    i9Var5.G0 = a4Var2;
                    a4Var2.a = false;
                    a4Var2.e = i9Var5.z0;
                    hi.r3 r3Var3 = i9Var5.E0;
                    a4Var2.f = r3Var3.d;
                    a4Var2.d = r3Var3.c;
                    a4Var2.b = i9Var5.B0;
                    r3Var3.b(j10, a4Var2);
                    z8Var.d.G0.b();
                }
            }
            g1Var3.c = i9Var4;
            g1Var3.b = e1Var5;
            wi.n nVar5 = g1Var3.a;
            if (nVar5 == null || !nVar5.d()) {
                g1Var3.a = l2.i.d().k(g1Var3);
            }
            c1 c1Var = g1Var3.n;
            LaunchActivity launchActivity = LaunchActivity.H1;
            LaunchActivity launchActivity2 = g1Var3.r;
            if (launchActivity2 != launchActivity) {
                if (launchActivity2 != null) {
                    launchActivity2.a1.remove(c1Var);
                }
                g1Var3.r = launchActivity;
                if (launchActivity != null) {
                    launchActivity.a1.add(c1Var);
                }
            }
            g1Var3.a.c();
            i9 i9Var52 = z8Var.d;
            i9Var52.G0 = a4Var2;
            a4Var2.a = false;
            a4Var2.e = i9Var52.z0;
            hi.r3 r3Var32 = i9Var52.E0;
            a4Var2.f = r3Var32.d;
            a4Var2.d = r3Var32.c;
            a4Var2.b = i9Var52.B0;
            r3Var32.b(j10, a4Var2);
            z8Var.d.G0.b();
        }
        this.M0.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
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
        if (uri == null || (storyItem = this.y1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String uri2 = uri.toString();
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                String str3 = uri2.split("/1/")[1];
                int indexOf = str3.indexOf("/ACTUAL");
                parse = indexOf != -1 ? Uri.parse(URLDecoder.decode(str3.substring(0, indexOf), "UTF-8")) : uri;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            String T0 = org.telegram.messenger.g0.T0(parse);
            if (org.telegram.messenger.r2.b) {
                str2 = T0;
                z10 = true;
                str = str2;
            } else if (T0 == null) {
                String uri3 = parse.toString();
                String t6 = MediaController.t(-1L, parse, "file");
                if (t6 == null) {
                    X0();
                    return;
                } else {
                    str = uri3;
                    z10 = false;
                    str2 = t6;
                }
            } else {
                str = T0;
                z10 = false;
                str2 = str;
            }
            if (z10) {
                ez.T(getAccountInstance(), str2, str, null, null, null, this.l1, null, null, storyItem, null, true, null, null);
                return;
            } else {
                ez.T(getAccountInstance(), null, null, parse, null, null, this.l1, null, null, storyItem, null, true, null, null);
                return;
            }
        }
        parse = uri;
        String T02 = org.telegram.messenger.g0.T0(parse);
        if (org.telegram.messenger.r2.b) {
        }
        if (z10) {
        }
    }

    public final void R0(long j3, boolean z10) {
        if (this.u1 != z10) {
            this.u1 = z10;
            fh0 fh0Var = this.j0;
            if (z10) {
                if (this.t0.a && Build.VERSION.SDK_INT < 33) {
                    i9 i9Var = ((z8) this.A1).d;
                    i9Var.l1 = true;
                    i9Var.V();
                    sa saVar = this.G3;
                    org.telegram.messenger.g0.r(saVar);
                    org.telegram.messenger.g0.i3(saVar, 100L);
                }
                P0(j3);
                e1();
                fh0Var.setAnimation(this.h1.u);
                this.u1 = true;
                this.Y0.a.getImageReceiver().O0(true, true);
                z3 z3Var = this.y1;
                if (z3Var.a != null) {
                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + z3Var.a.id + " " + z3.c(z3Var));
                }
            } else {
                n0();
                fh0Var.a();
                this.V0 = null;
                this.v2 = false;
                this.y2.e(true, 0.0f);
                this.M0.invalidate();
                invalidate();
                o0();
                i9 i9Var2 = ((z8) this.A1).d;
                i9Var2.I0 = false;
                i9Var2.V();
            }
            this.O0.h0(this.u1 ? 3 : 2);
            this.P0.h0(this.u1 ? 2 : 0);
            this.Q0.h0(this.u1 ? 2 : 0);
            if (this.m1 || this.n1) {
                s6 s6Var = this.C1;
                long j10 = this.l1;
                boolean z11 = this.u1;
                a0.h hVar = s6Var.m;
                r9 r9Var = (r9) hVar.f(j10);
                if (r9Var == null) {
                    r9Var = new r9(s6Var.a, j10, s6Var);
                    hVar.k(r9Var, j10);
                }
                r9Var.b(z11);
            }
        }
    }

    public final void S0(int i7, long j3) {
        if (this.l1 != j3) {
            z3 z3Var = this.y1;
            z3Var.b = null;
            z3Var.a = null;
        }
        this.l1 = j3;
        this.j1 = null;
        m0(i7);
        TL_stories.PeerStories peerStories = this.t0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.C1.V(peerStories, true);
            return;
        }
        s6 s6Var = this.C1;
        TL_stories.PeerStories y10 = s6Var.y(j3);
        if (y10 == null) {
            y10 = s6Var.z(j3);
        } else {
            z10 = false;
        }
        s6Var.V(y10, z10);
    }

    public final void U0(long j3, boolean z10, boolean z11) {
        if (!z10 && j3 == this.w3 && this.x3 == z11) {
            return;
        }
        this.w3 = j3;
        this.x3 = z11;
        x3 x3Var = this.Y0;
        if (j3 < 0) {
            TLRPC.Chat M0 = np.s1(this.m2).M0(Long.valueOf(-j3));
            w3 w3Var = x3Var.b;
            w3 w3Var2 = x3Var.b;
            w3Var.l(org.telegram.messenger.g0.D2(M0 == null ? "" : M0.title), false);
            if (M0 == null || !M0.verified) {
                w3Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(ns.e4);
            fq fqVar = new fq(mutate, null);
            fqVar.x = true;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            fqVar.h = L;
            fqVar.n = L2;
            w3Var2.i(fqVar);
            return;
        }
        if (this.m1 && !z11) {
            x3Var.b.l(hd.M0(2131745641, null), false);
            x3Var.b.i(null);
            return;
        }
        TLRPC.User a22 = np.s1(this.m2).a2(Long.valueOf(j3));
        if (a22 == null || !a22.verified) {
            x3Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(ns.e4);
            fq fqVar2 = new fq(mutate2, null);
            fqVar2.x = true;
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            fqVar2.h = L3;
            fqVar2.n = L4;
            x3Var.b.i(fqVar2);
        }
        if (a22 != null) {
            x3Var.b.l(org.telegram.messenger.j6.m(org.telegram.messenger.g0.D2(org.telegram.messenger.g5.p(a22)), x3Var.b.getPaint().getFontMetricsInt(), false, null, 0), false);
        } else {
            x3Var.b.l(null, false);
        }
    }

    public final void V0(float f10, float f11, g4 g4Var) {
        this.W0 = f10;
        this.k3 = 1.0f / f11;
        if (this.V0 == g4Var) {
            return;
        }
        this.V0 = g4Var;
        if (g4Var != null) {
            ImageReceiver imageReceiver = g4Var.a;
            if (imageReceiver.n() != null) {
                Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                u2 u2Var = this.O0;
                u2Var.d0 = null;
                u2Var.a1.setShader(null);
                u2Var.N0(new BitmapDrawable(copy));
            }
        }
    }

    public final void W0(boolean z10) {
        z3 z3Var = this.y1;
        if (z3Var.a != null) {
            i9 i9Var = this.t0;
            if (i9Var.f != null) {
                String e10 = z3Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e10);
                    LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, hd.M0(2131744846, null)), 500);
                    return;
                }
                s2 s2Var = new s2(this, i9Var.f.getContext(), e10, e10, np.s1(this.m2).X4() && (!(this.n1 || q10.A(this.l1)) || org.telegram.messenger.t3.t0(this.n1 ? np.s1(this.m2).M0(Long.valueOf(-this.l1)) : null)), new i2(2, this.l0));
                this.J2 = s2Var;
                s2Var.e2 = true;
                TL_stories.StoryItem storyItem = z3Var.a;
                storyItem.dialogId = this.l1;
                s2Var.B2 = storyItem;
                s2Var.o2 = new ob.c(this, 21);
                ((z8) this.A1).h(s2Var);
            }
        }
    }

    public final void X0() {
        e3 e3Var = this.M0;
        org.telegram.ui.ActionBar.e6 e6Var = this.l0;
        org.telegram.messenger.k5.o(null, 2131743833, new cc(e3Var, e6Var), e6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.l0);
        String M0 = hd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        alertDialog$Builder.k(hd.M0(2131747831, null), null);
        t1Var.U = hd.M0(2131747218, null);
        ((z8) this.A1).h(t1Var);
    }

    public final void Z0(boolean z10) {
        if (this.c3 != z10) {
            z3 z3Var = this.y1;
            if (z3Var.a == null) {
                return;
            }
            this.c3 = z10;
            int i7 = 0;
            if (z10) {
                this.b3.setVisibility(0);
            }
            this.b3.setStoryItem(z3Var.a);
            i9 i9Var = ((z8) this.A1).d;
            i9Var.p1 = z10;
            i9Var.V();
            if (!z10) {
                if (this.b3.getReactionsWindow() != null) {
                    this.b3.getReactionsWindow().e();
                }
                this.b3.animate().alpha(0.0f).setDuration(150L).setListener(new g2(this, i7)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d3, z10 ? 1.0f : 0.0f);
            this.b3.setTransitionProgress(this.d3);
            ofFloat.addUpdateListener(new u1(this, 1));
            ofFloat.addListener(new f2(this, z10, i7));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(er.g);
            ofFloat.start();
        }
    }

    public final void a1(boolean z10) {
        if (this.q0 == null) {
            hi.l3 l3Var = new hi.l3(getContext(), 1);
            l3Var.o(1.0f, -56.0f);
            this.q0 = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.M0.addView(this.q0, ja.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.q0.u(hd.M0(z10 ? 2131744607 : 2131744457, null));
        this.q0.w();
    }

    public final boolean b1(boolean z10) {
        if (this.t0.R0) {
            z10 = !z10;
        }
        if (!z10) {
            int i7 = this.t1;
            if (i7 > 0) {
                this.t1 = i7 - 1;
                d1(false);
                return true;
            }
        } else if (this.t1 < getStoriesCount() - 1) {
            this.t1++;
            d1(false);
            return true;
        }
        return false;
    }

    public final void c1() {
        if (np.s1(this.m2).X4()) {
            File h = this.y1.h();
            if (h == null || !h.exists()) {
                Y0();
                return;
            }
            s2 s2Var = this.J2;
            if (s2Var != null) {
                s2Var.dismiss();
            }
            org.telegram.messenger.g0.i3(new t1(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0955, code lost:
    
        if (r4.g == (r1 == null && r1.translated && r1.translatedText != null && android.text.TextUtils.equals(r1.translatedLng, org.telegram.ui.Components.p21.M0()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x09b5, code lost:
    
        if (r2 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x09da, code lost:
    
        if (r3 != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0aed, code lost:
    
        if (r6 != false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0b05, code lost:
    
        if (r6 != false) goto L558;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b57  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b9a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ca5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0d11  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d74  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d8b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d9c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0db4 A[EDGE_INSN: B:312:0x0db4->B:313:0x0db4 BREAK  A[LOOP:0: B:301:0x0d92->B:310:0x0db1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0dd1  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0e29  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0e75  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0f2d  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0f5e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0f6d  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0f93  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0fb4  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0fe1  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0ffd  */
    /* JADX WARN: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0fd3  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0edf  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e6f  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0e39  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0e20  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0c8a  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0936  */
    /* JADX WARN: Type inference failed for: r6v188 */
    /* JADX WARN: Type inference failed for: r6v189, types: [fi.v7, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v190 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(boolean z10) {
        r6 r6Var;
        TL_stories.StoryItem storyItem;
        r6 r6Var2;
        jx jxVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        int i10;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem2;
        i9 i9Var;
        f9 f9Var;
        ImageReceiver imageReceiver2;
        TL_stories.StoryItem storyItem3;
        boolean z14;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z15;
        TL_stories.StoryItem storyItem4;
        r6 r6Var3;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem5;
        hi.d7 d7Var;
        TL_stories.StoryItem storyItem6;
        r6 r6Var4;
        int i11;
        hi.d7 d7Var2;
        e1 e1Var;
        boolean z16;
        e3 e3Var;
        i3 i3Var;
        x3 x3Var;
        k2 k2Var;
        boolean z17;
        boolean z18;
        r6 r6Var5;
        xb xbVar;
        boolean z19;
        TL_stories.StoryItem storyItem7;
        boolean z20;
        boolean z21;
        r6 r6Var6;
        boolean z22;
        ImageReceiver imageReceiver3;
        e3 e3Var2;
        i3 i3Var2;
        x3 x3Var2;
        boolean z23;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        int i12;
        TLRPC.MessageMedia messageMedia2;
        boolean z24;
        hi.l3 l3Var;
        hi.l3 l3Var2;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem10;
        u3 u3Var;
        boolean z25;
        boolean z26;
        LinearLayout linearLayout;
        boolean z27;
        boolean z28;
        k2 k2Var2;
        int i13;
        k2 k2Var3;
        int i14;
        boolean z29;
        boolean z30;
        boolean z31;
        int i15;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        lh.h hVar;
        a aVar;
        l1 l1Var;
        boolean z36;
        TL_stories.StoryItem storyItem11;
        boolean z37;
        int i16;
        int i17;
        boolean z38;
        boolean z39;
        boolean l10;
        r6 r6Var7;
        r6 r6Var8;
        hi.l3 l3Var3;
        int i18;
        ImageView imageView;
        ImageView imageView2;
        boolean z40;
        int i19;
        boolean z41;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i20;
        int i21;
        int i22;
        boolean z42;
        int i23;
        boolean z43;
        boolean z44;
        TL_stories.StoryItem storyItem13;
        int i24;
        int i25;
        FrameLayout.LayoutParams layoutParams;
        int L;
        boolean z45;
        boolean z46;
        int i26;
        boolean z47;
        e1 e1Var2;
        int i27;
        boolean z48;
        int i28;
        boolean z49;
        int i29;
        boolean z50;
        boolean z51;
        boolean z52;
        boolean z53;
        e1 e1Var3;
        String str;
        BitmapDrawable bitmapDrawable;
        jx jxVar2;
        i9 i9Var2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        k6 k6Var;
        ArrayList arrayList2 = this.f1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.g1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.F2 = true;
        z3 z3Var = this.y1;
        TL_stories.StoryItem storyItem14 = z3Var.a;
        r6 r6Var9 = z3Var.b;
        String s5 = l7.s();
        this.J0 = false;
        this.M2 = false;
        int i30 = this.t1;
        boolean z54 = this.D1;
        boolean z55 = this.E1;
        boolean z56 = this.F1;
        i9 i9Var3 = this.t0;
        if (i9Var3 == null || (k6Var = i9Var3.O0) == null || k6Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i30 < 0 || i30 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i30);
            int size = i30 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            r6Var = (size < 0 || size >= arrayList3.size()) ? null : (r6) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            r6Var = (i30 < 0 || i30 >= arrayList3.size()) ? null : (r6) arrayList3.get(i30);
            int size2 = i30 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        z3Var.c = null;
        a3 a3Var = this.T0;
        jx jxVar3 = this.U0;
        u2 u2Var = this.O0;
        if (r6Var != null) {
            hi.d7 d7Var3 = r6Var.c;
            this.E1 = false;
            boolean z57 = r6Var.J;
            this.F1 = z57;
            this.D1 = !z57;
            u2Var.c0(false);
            u2Var.b0(ns.g2);
            Bitmap bitmap = d7Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (r6Var.s || r6Var.I) {
                BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                imageReceiver = u2Var;
                r6Var2 = r6Var9;
                jxVar2 = jxVar3;
                z11 = z54;
                z12 = z55;
                z13 = z56;
                i9Var2 = i9Var3;
                i7 = i30;
                r62 = 0;
                i10 = 4;
                imageReceiver.u0(null, null, gc.g(r6Var.f), s5, null, null, bitmapDrawable2, 0L, null, null, 0);
            } else {
                BitmapDrawable bitmapDrawable3 = bitmapDrawable;
                imageReceiver = u2Var;
                r6Var2 = r6Var9;
                r62 = 0;
                jxVar2 = jxVar3;
                z11 = z54;
                z13 = z56;
                z12 = z55;
                i10 = 4;
                i9Var2 = i9Var3;
                i7 = i30;
                imageReceiver.u0(null, null, gc.g(r6Var.e), s5, null, null, bitmapDrawable3, 0L, null, null, 0);
            }
            z3Var.b = r6Var;
            z3Var.j = r62;
            z3Var.i = r62;
            z3Var.a = r62;
            z3Var.d = false;
            z3Var.e = z3Var.m();
            TL_stories.StoryItem storyItem17 = z3Var.a;
            z3Var.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            jxVar = jxVar2;
            a3Var.c(r62, m8.a(d7Var3), jxVar);
            this.E2 = false;
            this.D2 = false;
            this.C2 = false;
            i9 i9Var4 = i9Var2;
            storyItem2 = storyItem14;
            i9Var = i9Var4;
        } else {
            r6Var2 = r6Var9;
            jxVar = jxVar3;
            z11 = z54;
            z12 = z55;
            z13 = z56;
            i7 = i30;
            i10 = 4;
            imageReceiver = u2Var;
            this.D1 = false;
            this.E1 = false;
            this.F1 = false;
            if (storyItem == null) {
                if (i9Var3 != null) {
                    i9Var3.u(true);
                    return;
                }
                return;
            }
            r6 t6 = this.C1.t(this.l1, storyItem);
            if (t6 != null) {
                String str2 = t6.f;
                this.E1 = true;
                imageReceiver.c0(false);
                imageReceiver.b0(this.S0 == null ? ns.g2 : 0);
                if (t6.s) {
                    storyItem2 = storyItem14;
                    i9Var = i9Var3;
                    r6Var3 = t6;
                    imageReceiver.r0(null, null, gc.g(str2), s5, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    i9Var = i9Var3;
                    r6Var3 = t6;
                    imageReceiver.r0(null, null, gc.g(str2), s5, null, 0L, null, null, 0);
                }
                z3Var.b = r6Var3;
                z3Var.j = null;
                z3Var.i = null;
                z3Var.a = null;
                z3Var.d = false;
                z3Var.e = z3Var.m();
                TL_stories.StoryItem storyItem18 = z3Var.a;
                z3Var.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                a3Var.c(null, m8.a(r6Var3.c), jxVar);
                z3Var.c = storyItem;
                this.E2 = false;
                this.D2 = false;
                this.C2 = false;
            } else {
                storyItem2 = storyItem14;
                i9Var = i9Var3;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && gj.K4(messageMedia4.getDocument());
                storyItem.dialogId = this.l1;
                imageReceiver.c0(z12);
                imageReceiver.b0(ns.g2);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.M2 = true;
                    np.s1(this.m2).P1().p(storyItem.id, this.l1);
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
                            BitmapDrawable m10 = messageMedia6 != null ? fc.m(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                if (fc.D().J(gc.g(storyItem.firstFramePath).q(null, null, false) + "@" + s5, false)) {
                                    z15 = z12;
                                    imageReceiver.u0(null, null, gc.g(storyItem.firstFramePath), s5, null, null, m10, 0L, null, null, 0);
                                }
                            }
                            z15 = z12;
                            imageReceiver.u0(null, null, gc.g(storyItem.attachPath), r.b.v(s5, "_pframe"), null, null, m10, 0L, null, null, 0);
                        } else {
                            z15 = z12;
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            BitmapDrawable m11 = photo != null ? fc.m(photo.sizes) : null;
                            if (z15) {
                                imageReceiver.r0(gc.g(storyItem.attachPath), s5, gc.g(storyItem.firstFramePath), s5, m11, 0L, null, null, 0);
                            } else {
                                imageReceiver.r0(gc.g(storyItem.attachPath), s5, null, null, m11, 0L, null, null, 0);
                            }
                        }
                        storyItem3 = storyItem;
                        z14 = z15;
                    } else {
                        Drawable t10 = ((i9Var.O0 != null || i9Var.N0) && (f9Var = i9Var.t0) != null && (imageReceiver2 = f9Var.c) != null && f9Var.o == storyItem.id) ? imageReceiver2.t() : null;
                        storyItem.dialogId = this.l1;
                        if (z58) {
                            TLRPC.PhotoSize u10 = org.telegram.messenger.w7.u(1000, storyItem.media.getDocument().thumbs);
                            if (t10 == null) {
                                t10 = fc.m(storyItem.media.getDocument().thumbs);
                            }
                            gc b10 = gc.b(s6.C(this.m2, storyItem));
                            String v = r.b.v(s5, "_pframe");
                            gc c10 = gc.c(u10, storyItem.media.getDocument());
                            TL_stories.StoryItem storyItem19 = storyItem;
                            z14 = z12;
                            imageReceiver.u0(null, null, b10, v, c10, s5, t10, 0L, null, storyItem19, 0);
                            storyItem3 = storyItem19;
                        } else {
                            storyItem3 = storyItem;
                            z14 = z12;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                imageReceiver.f();
                            } else {
                                if (t10 == null) {
                                    t10 = fc.m(arrayList);
                                }
                                TLRPC.PhotoSize u11 = org.telegram.messenger.w7.u(ConnectionsManager.DEFAULT_DATACENTER_ID, photo2.sizes);
                                org.telegram.messenger.w7.u(800, photo2.sizes);
                                imageReceiver.u0(null, null, gc.i(u11, photo2), s5, null, null, t10, 0L, null, storyItem3, 0);
                            }
                        }
                    }
                }
                storyItem3.dialogId = this.l1;
                a3Var.d(z10 ? null : storyItem3, jxVar);
                z3Var.n(storyItem3);
                boolean z59 = (this.M2 || (storyItem4 = z3Var.a) == null || (storyItem4 instanceof TL_stories.TL_storyItemDeleted) || (storyItem4 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.E2 = z59;
                this.C2 = z59;
                if (z59) {
                    this.C2 = z3Var.d() && z3Var.a.isPublic;
                }
                if (this.C2) {
                    TL_stories.StoryItem storyItem20 = z3Var.a;
                    this.C2 = storyItem20.pinned || !l7.w(this.m2, storyItem20);
                }
                boolean z60 = this.C2;
                this.D2 = z60;
                if (z60 && this.n1) {
                    TLRPC.Chat M0 = np.s1(this.m2).M0(Long.valueOf(-this.l1));
                    this.D2 = M0 != null && org.telegram.messenger.t3.t0(M0);
                }
                if (this.E2) {
                    if (this.n1) {
                        TLRPC.Chat M02 = np.s1(this.m2).M0(Long.valueOf(-this.l1));
                        this.E2 = (M02 == null || org.telegram.messenger.t3.K(M02, false) == null) ? false : true;
                    } else {
                        TLRPC.User a22 = np.s1(this.m2).a2(Long.valueOf(this.l1));
                        this.E2 = (a22 == null || q10.n(a22) == null || !z3Var.a.isPublic) ? false : true;
                    }
                }
                at.l0.c(new rs(at.t(this.m2), this.l1, storyItem3.id, 1));
                storyItem5 = z3Var.a;
                if (storyItem5 != null && !z10) {
                    i9Var.P0 = storyItem5.id;
                }
                i9Var.o0.A();
                this.I2 = true;
                if (!this.m1 || this.n1) {
                    i1(false);
                }
                TL_stories.StoryItem storyItem21 = z3Var.a;
                r6 r6Var10 = z3Var.b;
                int i31 = storyItem21 == null ? storyItem21.id : (r6Var10 == null || (d7Var = r6Var10.c) == null) ? 0 : d7Var.f;
                if (storyItem2 == null) {
                    storyItem6 = storyItem2;
                    i11 = storyItem6.id;
                    r6Var4 = r6Var2;
                } else {
                    storyItem6 = storyItem2;
                    r6Var4 = r6Var2;
                    i11 = (r6Var2 == null || (d7Var2 = r6Var4.c) == null) ? 0 : d7Var2.f;
                }
                boolean z61 = (i31 == i11 && (r6Var4 == null || storyItem21 == null || !TextUtils.equals(r6Var4.e, storyItem21.attachPath))) ? false : true;
                boolean z62 = (z61 || (this.E1 == z14 && this.D1 == z11 && this.F1 == z13)) ? false : true;
                e1Var = i9Var.B0;
                if (e1Var != null) {
                    int i32 = this.A3;
                    TLRPC.GroupCall groupCall = e1Var.w;
                    if (i32 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                        z16 = true;
                        e3Var = this.M0;
                        i3Var = this.u0;
                        x3Var = this.Y0;
                        if ((r6Var4 != null || (str = r6Var4.e) == null || !str.equals(z3Var.f())) && (storyItem6 == null || (storyItem7 = z3Var.a) == null || storyItem6.id != storyItem7.id)) {
                            k2Var = this.L1;
                            if (k2Var != null) {
                                if (storyItem6 != null && !TextUtils.isEmpty(k2Var.getEditField().getText())) {
                                    i9.P(storyItem6.dialogId, storyItem6, this.L1.getEditField().getText());
                                }
                                this.L1.getEditField().setText(i9.A(this.l1, z3Var.a));
                                z19 = z3Var.f;
                                if (z19) {
                                    z17 = false;
                                    this.L1.l1(false, false, false);
                                } else {
                                    z17 = false;
                                    this.L1.l1(true, true, false);
                                }
                            } else {
                                z17 = false;
                            }
                            z18 = z3Var.f;
                            if (z18) {
                                K0();
                            }
                            jxVar.c();
                            this.G0 = 0L;
                            this.I0 = z17;
                            r6Var5 = z3Var.b;
                            if (r6Var5 != null) {
                                gh0 gh0Var = x3Var.d;
                                if (gh0Var != null) {
                                    gh0Var.e(z17, r6Var5.h);
                                }
                                x3Var.a.invalidate();
                            } else if (!z62) {
                                x3Var.h = 0.0f;
                            }
                            xbVar = xb.w;
                            if (xbVar != null && xbVar.h == e3Var) {
                                xbVar.b();
                            }
                            i3Var.J();
                            o0();
                            z16 = true;
                        }
                        if (!z16 || (r6Var4 != null && z3Var.b == null)) {
                            x3Var.setOnSubtitleClick(null);
                            TextView[] textViewArr = x3Var.c;
                            this.A3 = 0;
                            z20 = z61;
                            long j3 = this.l1;
                            boolean z63 = z62;
                            z21 = z3Var.f;
                            U0(j3, false, z21);
                            r6Var6 = z3Var.b;
                            if (r6Var6 != null) {
                                charSequence3 = r6Var6.J ? hd.L0(2131750844) : l7.u(textViewArr[0], this.E1);
                            } else {
                                if (G0()) {
                                    TL_stories.StoryItem storyItem22 = z3Var.a;
                                    if (storyItem22 != null && (messageMedia2 = storyItem22.media) != null) {
                                        if (messageMedia2.document != null) {
                                            charSequence3 = hd.X(r13.date);
                                        } else {
                                            if (messageMedia2.photo != null) {
                                                charSequence3 = hd.X(r1.date);
                                            }
                                        }
                                    }
                                    z22 = z16;
                                    imageReceiver3 = imageReceiver;
                                    e3Var2 = e3Var;
                                    i3Var2 = i3Var;
                                    x3Var2 = x3Var;
                                    z23 = z63;
                                    charSequence = "";
                                } else {
                                    TL_stories.StoryItem storyItem23 = z3Var.a;
                                    if (storyItem23 == null) {
                                        z22 = z16;
                                        imageReceiver3 = imageReceiver;
                                        e3Var2 = e3Var;
                                        i3Var2 = i3Var;
                                        x3Var2 = x3Var;
                                        z23 = z63;
                                        charSequence = null;
                                    } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.L0(2131748825));
                                        spannableStringBuilder.setSpan(new k0(1), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        e1 e1Var4 = i9Var.B0;
                                        if (e1Var4 != null) {
                                            TLRPC.GroupCall groupCall2 = e1Var4.w;
                                            i12 = 1;
                                            this.A3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                                        } else {
                                            i12 = 1;
                                        }
                                        spannableStringBuilder.append((CharSequence) hd.I(Math.max(i12, this.A3), "LiveStoryWatching"));
                                        charSequence3 = spannableStringBuilder;
                                    } else if (storyItem23.date == -1) {
                                        charSequence3 = hd.L0(2131752644);
                                    } else {
                                        if (z3Var.i() != null) {
                                            v7 i33 = z3Var.i();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            z22 = z16;
                                            imageReceiver3 = imageReceiver;
                                            SpannableString spannableString = new SpannableString("r");
                                            e3Var2 = e3Var;
                                            i3Var2 = i3Var;
                                            spannableString.setSpan(new eq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) spannableString).append((CharSequence) " ");
                                            if (i33.b != null) {
                                                org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(15.0f, this.m2, textViewArr[0]);
                                                SpannableString spannableString2 = new SpannableString("a");
                                                spannableString2.setSpan(f5Var, 0, 1, 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                                if (i33.b.longValue() > 0) {
                                                    TLRPC.User a23 = np.s1(this.m2).a2(i33.b);
                                                    f5Var.e(a23);
                                                    spannableStringBuilder2.append((CharSequence) q10.p(a23));
                                                } else {
                                                    TLRPC.Chat M03 = np.s1(this.m2).M0(Long.valueOf(-i33.b.longValue()));
                                                    f5Var.b(M03);
                                                    if (M03 != null) {
                                                        spannableStringBuilder2.append((CharSequence) M03.title);
                                                    }
                                                }
                                            } else {
                                                String str4 = z3Var.a.fwd_from.from_name;
                                                if (str4 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str4);
                                                }
                                            }
                                            x3Var.setOnSubtitleClick(new ai.t2(17, this, i33));
                                            SpannableString spannableString3 = new SpannableString(".");
                                            ls lsVar = new ls();
                                            lsVar.b = org.telegram.messenger.g0.L(1.5f);
                                            lsVar.c = 5.0f;
                                            spannableString3.setSpan(lsVar, 0, spannableString3.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) hd.P(z3Var.a.date));
                                            x3Var2 = x3Var;
                                            charSequence = spannableStringBuilder2;
                                        } else {
                                            z22 = z16;
                                            imageReceiver3 = imageReceiver;
                                            e3Var2 = e3Var;
                                            i3Var2 = i3Var;
                                            if (!this.o1 || (storyItem8 = z3Var.a) == null || storyItem8.from_id == null) {
                                                x3Var2 = x3Var;
                                                String X = hd.X(z3Var.a.date);
                                                charSequence2 = X;
                                                if (z3Var.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X);
                                                    ls lsVar2 = new ls();
                                                    lsVar2.b = org.telegram.messenger.g0.L(1.5f);
                                                    lsVar2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(lsVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                                    valueOf.append((CharSequence) hd.L0(2131751210));
                                                    charSequence2 = valueOf;
                                                }
                                                charSequence = charSequence2;
                                                z23 = z63;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(15.0f, this.m2, textViewArr[0]);
                                                SpannableString spannableString4 = new SpannableString("a");
                                                spannableString4.setSpan(f5Var2, 0, 1, 33);
                                                spannableStringBuilder3.append((CharSequence) spannableString4).append((CharSequence) " ");
                                                long o4 = org.telegram.messenger.m5.o(z3Var.a.from_id);
                                                if (o4 > 0) {
                                                    TLRPC.User a24 = np.s1(this.m2).a2(Long.valueOf(o4));
                                                    f5Var2.e(a24);
                                                    spannableStringBuilder3.append((CharSequence) q10.p(a24));
                                                    x3Var2 = x3Var;
                                                } else {
                                                    x3Var2 = x3Var;
                                                    TLRPC.Chat M04 = np.s1(this.m2).M0(Long.valueOf(-o4));
                                                    f5Var2.b(M04);
                                                    if (M04 != null) {
                                                        spannableStringBuilder3.append((CharSequence) M04.title);
                                                    }
                                                }
                                                x3Var2.setOnSubtitleClick(new bi.q(this, o4, 2));
                                                SpannableString spannableString5 = new SpannableString(".");
                                                ls lsVar3 = new ls();
                                                lsVar3.b = org.telegram.messenger.g0.L(1.5f);
                                                lsVar3.c = 5.0f;
                                                spannableString5.setSpan(lsVar3, 0, spannableString5.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) hd.P(z3Var.a.date));
                                                charSequence = spannableStringBuilder3;
                                            }
                                        }
                                        z23 = false;
                                    }
                                }
                                if (charSequence == null) {
                                    k6 k6Var2 = i9Var.O0;
                                    if (k6Var2 == null || (storyItem9 = z3Var.a) == null || !k6Var2.m(storyItem9.id)) {
                                        z24 = false;
                                    } else {
                                        if (!(charSequence instanceof SpannableStringBuilder)) {
                                            charSequence = new SpannableStringBuilder(charSequence);
                                        }
                                        SpannableString spannableString6 = new SpannableString("p ");
                                        z24 = false;
                                        spannableString6.setSpan(new eq(R.drawable.msg_pin_mini), 0, 1, 33);
                                        ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString6);
                                    }
                                    x3Var2.c(charSequence, z23);
                                } else {
                                    z24 = false;
                                }
                                l3Var = this.p0;
                                if (l3Var != null) {
                                    l3Var.f(z24);
                                }
                                l3Var2 = this.q0;
                                if (l3Var2 != null) {
                                    l3Var2.f(z24);
                                }
                            }
                            z22 = z16;
                            imageReceiver3 = imageReceiver;
                            e3Var2 = e3Var;
                            i3Var2 = i3Var;
                            x3Var2 = x3Var;
                            charSequence2 = charSequence3;
                            charSequence = charSequence2;
                            z23 = z63;
                            if (charSequence == null) {
                            }
                            l3Var = this.p0;
                            if (l3Var != null) {
                            }
                            l3Var2 = this.q0;
                            if (l3Var2 != null) {
                            }
                        } else {
                            z20 = z61;
                            z22 = z16;
                            imageReceiver3 = imageReceiver;
                            e3Var2 = e3Var;
                            i3Var2 = i3Var;
                            x3Var2 = x3Var;
                        }
                        storyItem10 = z3Var.a;
                        if (storyItem6 == storyItem10 && r6Var4 == z3Var.b) {
                        }
                        z3Var.o();
                        if ((!z3Var.g || storyItem6 != z3Var.a) && (u3Var = this.A1) != null) {
                            i9 i9Var5 = ((z8) u3Var).d;
                            i9Var5.Z0 = false;
                            i9Var5.V();
                        }
                        z25 = z3Var.f;
                        z26 = !z25 && (e1Var3 = i9Var.B0) != null && z3Var.k(e1Var3.g()) && i9Var.B0.b();
                        if (z26 != this.q1) {
                            this.q1 = z26;
                            if (z26) {
                                x0();
                            }
                            if (this.Q1 != null && (this.p1 || this.q1)) {
                                f1();
                            }
                            k2 k2Var4 = this.L1;
                            if (k2Var4 != null) {
                                if (this.p1) {
                                    z53 = z3Var.f;
                                }
                                if (!this.q1) {
                                    z52 = true;
                                    k2Var4.setEnabled(z52);
                                    z51 = true;
                                    this.L1.j2(true);
                                }
                                z52 = false;
                                k2Var4.setEnabled(z52);
                                z51 = true;
                                this.L1.j2(true);
                            } else {
                                z51 = true;
                            }
                            p0(z51);
                        }
                        linearLayout = this.Q1;
                        if (linearLayout != null) {
                            if (this.p1) {
                                z50 = z3Var.f;
                            }
                            if (!this.q1) {
                                i29 = 8;
                                linearLayout.setVisibility(i29);
                            }
                            i29 = 0;
                            linearLayout.setVisibility(i29);
                        }
                        z27 = this.M2;
                        LinearLayout linearLayout2 = this.y0;
                        if (z27) {
                            A0();
                            y0();
                            this.K2.setVisibility(0);
                            this.L2.setVisibility(0);
                            this.E2 = false;
                            this.D2 = false;
                            this.C2 = false;
                            k2 k2Var5 = this.L1;
                            if (k2Var5 != null) {
                                k2Var5.setVisibility(8);
                            }
                            v2 v2Var = this.G1;
                            if (v2Var != null) {
                                v2Var.setVisibility(8);
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat M05 = this.l1 < 0 ? np.s1(this.m2).M0(Long.valueOf(-this.l1)) : null;
                            z28 = z3Var.f;
                            if (z28) {
                                if (this.L1 == null) {
                                    t0();
                                }
                                s0();
                                w0();
                                v0();
                                i13 = 0;
                                this.L1.setVisibility(0);
                            } else {
                                if ((q10.A(this.l1) || G0()) && (k2Var2 = this.L1) != null) {
                                    k2Var2.setVisibility(8);
                                } else if (!this.m1 && ((!this.n1 || (this.o1 && (org.telegram.messenger.t3.q(M05) || org.telegram.messenger.t3.s0(M05)))) && (k2Var3 = this.L1) != null)) {
                                    i13 = 0;
                                    k2Var3.setVisibility(0);
                                }
                                i13 = 0;
                            }
                            k2 k2Var6 = this.L1;
                            if (k2Var6 != null) {
                                z33 = z3Var.f;
                                k2Var6.setOnSendButtonLongClick(z33 ? new s1(this, i13) : null);
                                k2 k2Var7 = this.L1;
                                z34 = z3Var.f;
                                B0(true);
                                k2Var7.y1(z34);
                                k2 k2Var8 = this.L1;
                                z35 = z3Var.f;
                                k2Var8.F1(z35 && !B0(true) && (this.f2 || this.L1.X0), true);
                            }
                            if (this.p1 && this.Q1 == null) {
                                x0();
                            }
                            if (this.Q1 != null) {
                                if (this.p1 || this.q1) {
                                    f1();
                                }
                                LinearLayout linearLayout3 = this.Q1;
                                if (this.p1) {
                                    z32 = z3Var.f;
                                }
                                if (!this.q1) {
                                    i15 = 8;
                                    linearLayout3.setVisibility(i15);
                                }
                                i15 = 0;
                                linearLayout3.setVisibility(i15);
                            }
                            k2 k2Var9 = this.L1;
                            if (k2Var9 != null) {
                                if (this.p1) {
                                    z31 = z3Var.f;
                                }
                                if (!this.q1) {
                                    z30 = true;
                                    k2Var9.setEnabled(z30);
                                }
                                z30 = false;
                                k2Var9.setEnabled(z30);
                            }
                            v2 v2Var2 = this.G1;
                            if (v2Var2 != null) {
                                if (this.m1) {
                                    z29 = z3Var.f;
                                    if (!z29) {
                                        i14 = 0;
                                        v2Var2.setVisibility(i14);
                                    }
                                }
                                i14 = 8;
                                v2Var2.setVisibility(i14);
                            }
                            FrameLayout frameLayout = this.K2;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (q10.A(this.l1)) {
                                y0();
                                this.L2.setVisibility(0);
                            } else {
                                ub ubVar = this.L2;
                                if (ubVar != null) {
                                    ubVar.setVisibility(8);
                                }
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(G0() ? 8 : 0);
                            }
                        }
                        hVar = this.M1;
                        if (hVar != null) {
                            k2 k2Var10 = this.L1;
                            if (k2Var10 != null && k2Var10.getVisibility() == 0) {
                                z49 = z3Var.f;
                                if (!z49) {
                                    i28 = 0;
                                    hVar.setVisibility(i28);
                                }
                            }
                            i28 = 8;
                            hVar.setVisibility(i28);
                        }
                        aVar = this.H1;
                        c2 c2Var = this.v0;
                        if (aVar != null) {
                            if (!this.M2) {
                                z48 = z3Var.f;
                                if (z48) {
                                    i27 = 0;
                                    aVar.setVisibility(i27);
                                    this.H1.a(c2Var.g(), false);
                                    this.H1.setCount(c2Var.getUnreadMessagesCount());
                                }
                            }
                            i27 = 8;
                            aVar.setVisibility(i27);
                            this.H1.a(c2Var.g(), false);
                            this.H1.setCount(c2Var.getUnreadMessagesCount());
                        }
                        l1Var = this.K1;
                        if (l1Var != null) {
                            if (!this.M2) {
                                z47 = z3Var.f;
                                if (z47 && (e1Var2 = e1.X) != null && z3Var.k(e1Var2.g())) {
                                    i26 = 0;
                                    l1Var.setVisibility(i26);
                                    l1 l1Var2 = this.K1;
                                    e1 e1Var5 = e1.X;
                                    l1Var2.b(e1Var5 == null && e1Var5.o(), true);
                                    l1 l1Var3 = this.K1;
                                    e1 e1Var6 = e1.X;
                                    l1Var3.a(e1Var6 != null || e1Var6.m(), true);
                                }
                            }
                            i26 = 8;
                            l1Var.setVisibility(i26);
                            l1 l1Var22 = this.K1;
                            e1 e1Var52 = e1.X;
                            l1Var22.b(e1Var52 == null && e1Var52.o(), true);
                            l1 l1Var32 = this.K1;
                            e1 e1Var62 = e1.X;
                            l1Var32.a(e1Var62 != null || e1Var62.m(), true);
                        }
                        if (this.J1 != null) {
                            o1 o1Var = this.I1;
                            if (!this.M2) {
                                z46 = z3Var.f;
                                if (z46) {
                                    i24 = 0;
                                    o1Var.setVisibility(i24);
                                    p1 p1Var = this.J1;
                                    if (!this.M2) {
                                        z45 = z3Var.f;
                                        if (z45) {
                                            i25 = 0;
                                            p1Var.setVisibility(i25);
                                            layoutParams = (FrameLayout.LayoutParams) this.J1.getLayoutParams();
                                            l1 l1Var4 = this.K1;
                                            L = org.telegram.messenger.g0.L((l1Var4 == null && l1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                            if (layoutParams.rightMargin != L) {
                                                layoutParams.rightMargin = L;
                                                this.J1.setLayoutParams(layoutParams);
                                            }
                                        }
                                    }
                                    i25 = 8;
                                    p1Var.setVisibility(i25);
                                    layoutParams = (FrameLayout.LayoutParams) this.J1.getLayoutParams();
                                    l1 l1Var42 = this.K1;
                                    L = org.telegram.messenger.g0.L((l1Var42 == null && l1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != L) {
                                    }
                                }
                            }
                            i24 = 8;
                            o1Var.setVisibility(i24);
                            p1 p1Var2 = this.J1;
                            if (!this.M2) {
                            }
                            i25 = 8;
                            p1Var2.setVisibility(i25);
                            layoutParams = (FrameLayout.LayoutParams) this.J1.getLayoutParams();
                            l1 l1Var422 = this.K1;
                            L = org.telegram.messenger.g0.L((l1Var422 == null && l1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != L) {
                            }
                        }
                        z36 = z3Var.f;
                        if (!z36 || ((z3Var.h == null && z3Var.i() == null && z3Var.g() == null) || this.M2)) {
                            i3 i3Var3 = i3Var2;
                            if (this.u1) {
                                i9 i9Var6 = ((z8) this.A1).d;
                                i9Var6.L0 = false;
                                i9Var6.V();
                                u3 u3Var2 = this.A1;
                                this.T2 = false;
                                ((z8) u3Var2).e();
                            }
                            i3Var3.setVisibility(8);
                        } else {
                            i3 i3Var4 = i3Var2;
                            i3Var4.c0.b(z3Var.h, z3Var.i(), z3Var.g(), i9Var.Z0 && !z3Var.g && (storyItem13 = z3Var.a) != null && storyItem13.translated, storyItem6 == z3Var.a);
                            i3Var4.setVisibility(0);
                        }
                        storyItem11 = z3Var.a;
                        if (storyItem11 != null) {
                            TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                            if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (c2Var.r(this.l1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                                    c2Var.q(false, false);
                                    this.v3 = 0L;
                                    k2 k2Var11 = this.L1;
                                    if (k2Var11 != null) {
                                        k2Var11.N(true);
                                        this.L1.l2();
                                        p0(true);
                                    }
                                }
                                c2Var.setVisibility(0);
                                e3Var2.invalidate();
                                if (this.A1 != null && I0()) {
                                    ((z8) this.A1).a(this.t1, this.l1);
                                }
                                z37 = this.n1;
                                v2 v2Var3 = this.z0;
                                ImageView imageView3 = this.x0;
                                v2 v2Var4 = this.n0;
                                if (z37) {
                                    if (this.C2) {
                                        z39 = z3Var.f;
                                        if (!z39) {
                                            i16 = 0;
                                            imageView3.setVisibility(i16);
                                            if (v2Var3 != null) {
                                                v2Var3.setVisibility(8);
                                            }
                                            if (!this.m1) {
                                                z38 = z3Var.f;
                                                if (!z38) {
                                                    i17 = 0;
                                                    v2Var4.setVisibility(i17);
                                                    v2Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                                }
                                            }
                                            i17 = 8;
                                            v2Var4.setVisibility(i17);
                                            v2Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                        }
                                    }
                                    i16 = i10;
                                    imageView3.setVisibility(i16);
                                    if (v2Var3 != null) {
                                    }
                                    if (!this.m1) {
                                    }
                                    i17 = 8;
                                    v2Var4.setVisibility(i17);
                                    v2Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                } else {
                                    if (this.C2) {
                                        z44 = z3Var.f;
                                        if (!z44) {
                                            i21 = 0;
                                            imageView3.setVisibility(i21);
                                            if (v2Var3 != null) {
                                                if (this.D2) {
                                                    z43 = z3Var.f;
                                                    if (!z43) {
                                                        i23 = 0;
                                                        v2Var3.setVisibility(i23);
                                                    }
                                                }
                                                i23 = 8;
                                                v2Var3.setVisibility(i23);
                                            }
                                            if (!this.F1) {
                                                z42 = z3Var.f;
                                                if (!z42) {
                                                    i22 = 0;
                                                    v2Var4.setVisibility(i22);
                                                }
                                            }
                                            i22 = 8;
                                            v2Var4.setVisibility(i22);
                                        }
                                    }
                                    i21 = i10;
                                    imageView3.setVisibility(i21);
                                    if (v2Var3 != null) {
                                    }
                                    if (!this.F1) {
                                    }
                                    i22 = 8;
                                    v2Var4.setVisibility(i22);
                                }
                                v2Var4.requestLayout();
                                i9Var.e1.append(this.l1, i7);
                                if (this.u1) {
                                    P0(0L);
                                    e1();
                                    imageReceiver3.b();
                                }
                                c2Var.setLivePlayer(i9Var.B0);
                                this.v1 = 0;
                                if (i9Var.O0 != null && (storyItem12 = z3Var.a) != null) {
                                    int i34 = storyItem12.id;
                                    i20 = 0;
                                    while (true) {
                                        if (i20 < i9Var.O0.i.size()) {
                                            gj gjVar = (gj) i9Var.O0.i.get(i20);
                                            if (gjVar != null && gjVar.e1() == i34) {
                                                this.v1 = i20;
                                                break;
                                            }
                                            i20++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                int i35 = this.t1;
                                this.w1 = i35;
                                int i36 = this.k1;
                                this.x1 = i36;
                                if (i9Var.R0) {
                                    this.w1 = (i36 - 1) - i35;
                                }
                                l10 = z3Var.l();
                                bi.v1 v1Var = this.i0;
                                if (l10) {
                                    v1Var.setVisibility(8);
                                } else {
                                    v1Var.setVisibility(0);
                                    this.O2 = z3Var.j() ? 1.0f : 0.5f;
                                    boolean j10 = z3Var.j();
                                    ImageView imageView4 = this.k0;
                                    fh0 fh0Var = this.j0;
                                    if (j10) {
                                        fh0Var.setVisibility(0);
                                        imageView4.setVisibility(8);
                                        v1Var.setContentDescription(hd.L0(!i9.D1 ? 2131748314 : 2131743849));
                                    } else {
                                        fh0Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        v1Var.setContentDescription(hd.L0(2131748151));
                                    }
                                    v1Var.setAlpha((1.0f - this.O3) * this.O2);
                                }
                                r6Var7 = z3Var.b;
                                n8 n8Var = this.m0;
                                if (r6Var7 == null) {
                                    n8Var.a(this.m1, r6Var7, z20 && this.M3);
                                } else {
                                    TL_stories.StoryItem storyItem24 = z3Var.a;
                                    if (storyItem24 != null) {
                                        n8Var.b(this.m1, storyItem24, z20 && this.M3);
                                    } else {
                                        n8Var.b(this.m1, null, z20 && this.M3);
                                    }
                                }
                                this.M3 = false;
                                n8Var.setTranslationX(v1Var.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                                if (z22) {
                                    this.a3 = false;
                                    TL_stories.StoryItem storyItem25 = z3Var.a;
                                    if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                        this.o0.setReaction(null);
                                    } else {
                                        this.o0.setReaction(ch.p0.d(reaction));
                                    }
                                }
                                r6Var8 = z3Var.b;
                                if (r6Var8 == null && r6Var8.J) {
                                    u0();
                                    this.T1.set(z3Var.b.c.x);
                                    this.T1.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.U1;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.U1 = null;
                                    }
                                    if (z20) {
                                        ViewPropertyAnimator interpolator = this.T1.animate().alpha(1.0f).setDuration(180L).setInterpolator(er.h);
                                        this.U1 = interpolator;
                                        interpolator.start();
                                    } else {
                                        this.T1.setAlpha(1.0f);
                                    }
                                } else if (this.T1 != null) {
                                    ViewPropertyAnimator viewPropertyAnimator2 = this.U1;
                                    if (viewPropertyAnimator2 != null) {
                                        viewPropertyAnimator2.cancel();
                                        this.U1 = null;
                                    }
                                    if (z20 && this.T1.getVisibility() == 0) {
                                        ViewPropertyAnimator withEndAction = this.T1.animate().alpha(0.0f).setDuration(180L).setInterpolator(er.h).withEndAction(new t1(this, 0));
                                        this.U1 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.T1.setAlpha(0.0f);
                                        this.T1.setVisibility(8);
                                    }
                                }
                                this.h1.a(i9.D1, false);
                                if (this.u1 && z3Var.a != null) {
                                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + z3Var.a.id + " " + z3.c(z3Var));
                                }
                                if (this.m1) {
                                    c5.f(this.m2, this.l1, z3Var.a);
                                }
                                w3 w3Var = x3Var2.b;
                                k6 k6Var3 = i9Var.O0;
                                w3Var.setPadding(0, 0, (k6Var3 != null || k6Var3.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                                np.s1(this.m2).T1().l(z3Var.a);
                                if (!z10 && !this.m1 && this.j3 == null && !gz.T && gz.U) {
                                    t1 t1Var = new t1(this, 1);
                                    this.j3 = t1Var;
                                    org.telegram.messenger.g0.i3(t1Var, 500L);
                                }
                                l3Var3 = this.q0;
                                if (!(l3Var3 == null && l3Var3.W) && z3Var.j() && i9.D1) {
                                    i18 = 0;
                                    if (np.e1().getInt("taptostorysoundhint", 0) < 2) {
                                        t1 t1Var2 = this.B3;
                                        org.telegram.messenger.g0.r(t1Var2);
                                        org.telegram.messenger.g0.i3(t1Var2, 250L);
                                    }
                                } else {
                                    i18 = 0;
                                }
                                imageView = this.g0;
                                if (imageView != null) {
                                    if (G0() && !H0()) {
                                        z41 = z3Var.e;
                                        if (!z41) {
                                            i19 = 8;
                                            imageView.setVisibility(i19);
                                        }
                                    }
                                    i19 = i18;
                                    imageView.setVisibility(i19);
                                }
                                imageView2 = this.h0;
                                if (imageView2 == null) {
                                    z40 = z3Var.f;
                                    imageView2.setVisibility((!z40 || n8Var.f) ? 8 : i18);
                                    return;
                                }
                                return;
                            }
                        }
                        c2Var.r(this.l1, null);
                        c2Var.setVisibility(8);
                        e3Var2.invalidate();
                        if (this.A1 != null) {
                            ((z8) this.A1).a(this.t1, this.l1);
                        }
                        z37 = this.n1;
                        v2 v2Var32 = this.z0;
                        ImageView imageView32 = this.x0;
                        v2 v2Var42 = this.n0;
                        if (z37) {
                        }
                        v2Var42.requestLayout();
                        i9Var.e1.append(this.l1, i7);
                        if (this.u1) {
                        }
                        c2Var.setLivePlayer(i9Var.B0);
                        this.v1 = 0;
                        if (i9Var.O0 != null) {
                            int i342 = storyItem12.id;
                            i20 = 0;
                            while (true) {
                                if (i20 < i9Var.O0.i.size()) {
                                }
                                i20++;
                            }
                        }
                        int i352 = this.t1;
                        this.w1 = i352;
                        int i362 = this.k1;
                        this.x1 = i362;
                        if (i9Var.R0) {
                        }
                        l10 = z3Var.l();
                        bi.v1 v1Var2 = this.i0;
                        if (l10) {
                        }
                        r6Var7 = z3Var.b;
                        n8 n8Var2 = this.m0;
                        if (r6Var7 == null) {
                        }
                        this.M3 = false;
                        n8Var2.setTranslationX(v1Var2.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                        if (z22) {
                        }
                        r6Var8 = z3Var.b;
                        if (r6Var8 == null) {
                        }
                        if (this.T1 != null) {
                        }
                        this.h1.a(i9.D1, false);
                        if (this.u1) {
                            org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + z3Var.a.id + " " + z3.c(z3Var));
                        }
                        if (this.m1) {
                        }
                        w3 w3Var2 = x3Var2.b;
                        k6 k6Var32 = i9Var.O0;
                        w3Var2.setPadding(0, 0, (k6Var32 != null || k6Var32.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                        np.s1(this.m2).T1().l(z3Var.a);
                        if (!z10) {
                            t1 t1Var3 = new t1(this, 1);
                            this.j3 = t1Var3;
                            org.telegram.messenger.g0.i3(t1Var3, 500L);
                        }
                        l3Var3 = this.q0;
                        if (l3Var3 == null) {
                        }
                        i18 = 0;
                        if (np.e1().getInt("taptostorysoundhint", 0) < 2) {
                        }
                        imageView = this.g0;
                        if (imageView != null) {
                        }
                        imageView2 = this.h0;
                        if (imageView2 == null) {
                        }
                    }
                }
                z16 = false;
                e3Var = this.M0;
                i3Var = this.u0;
                x3Var = this.Y0;
                if (r6Var4 != null) {
                }
                k2Var = this.L1;
                if (k2Var != null) {
                }
                z18 = z3Var.f;
                if (z18) {
                }
                jxVar.c();
                this.G0 = 0L;
                this.I0 = z17;
                r6Var5 = z3Var.b;
                if (r6Var5 != null) {
                }
                xbVar = xb.w;
                if (xbVar != null) {
                    xbVar.b();
                }
                i3Var.J();
                o0();
                z16 = true;
                if (z16) {
                }
                x3Var.setOnSubtitleClick(null);
                TextView[] textViewArr2 = x3Var.c;
                this.A3 = 0;
                z20 = z61;
                long j32 = this.l1;
                boolean z632 = z62;
                z21 = z3Var.f;
                U0(j32, false, z21);
                r6Var6 = z3Var.b;
                if (r6Var6 != null) {
                }
                z22 = z16;
                imageReceiver3 = imageReceiver;
                e3Var2 = e3Var;
                i3Var2 = i3Var;
                x3Var2 = x3Var;
                charSequence2 = charSequence3;
                charSequence = charSequence2;
                z23 = z632;
                if (charSequence == null) {
                }
                l3Var = this.p0;
                if (l3Var != null) {
                }
                l3Var2 = this.q0;
                if (l3Var2 != null) {
                }
                storyItem10 = z3Var.a;
                if (storyItem6 == storyItem10) {
                }
                z3Var.o();
                if (!z3Var.g) {
                }
                i9 i9Var52 = ((z8) u3Var).d;
                i9Var52.Z0 = false;
                i9Var52.V();
                z25 = z3Var.f;
                if (z25) {
                }
                if (z26 != this.q1) {
                }
                linearLayout = this.Q1;
                if (linearLayout != null) {
                }
                z27 = this.M2;
                LinearLayout linearLayout22 = this.y0;
                if (z27) {
                }
                hVar = this.M1;
                if (hVar != null) {
                }
                aVar = this.H1;
                c2 c2Var2 = this.v0;
                if (aVar != null) {
                }
                l1Var = this.K1;
                if (l1Var != null) {
                }
                if (this.J1 != null) {
                }
                z36 = z3Var.f;
                if (z36) {
                }
                i3 i3Var32 = i3Var2;
                if (this.u1) {
                }
                i3Var32.setVisibility(8);
                storyItem11 = z3Var.a;
                if (storyItem11 != null) {
                }
                c2Var2.r(this.l1, null);
                c2Var2.setVisibility(8);
                e3Var2.invalidate();
                if (this.A1 != null) {
                }
                z37 = this.n1;
                v2 v2Var322 = this.z0;
                ImageView imageView322 = this.x0;
                v2 v2Var422 = this.n0;
                if (z37) {
                }
                v2Var422.requestLayout();
                i9Var.e1.append(this.l1, i7);
                if (this.u1) {
                }
                c2Var2.setLivePlayer(i9Var.B0);
                this.v1 = 0;
                if (i9Var.O0 != null) {
                }
                int i3522 = this.t1;
                this.w1 = i3522;
                int i3622 = this.k1;
                this.x1 = i3622;
                if (i9Var.R0) {
                }
                l10 = z3Var.l();
                bi.v1 v1Var22 = this.i0;
                if (l10) {
                }
                r6Var7 = z3Var.b;
                n8 n8Var22 = this.m0;
                if (r6Var7 == null) {
                }
                this.M3 = false;
                n8Var22.setTranslationX(v1Var22.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                if (z22) {
                }
                r6Var8 = z3Var.b;
                if (r6Var8 == null) {
                }
                if (this.T1 != null) {
                }
                this.h1.a(i9.D1, false);
                if (this.u1) {
                }
                if (this.m1) {
                }
                w3 w3Var22 = x3Var2.b;
                k6 k6Var322 = i9Var.O0;
                w3Var22.setPadding(0, 0, (k6Var322 != null || k6Var322.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                np.s1(this.m2).T1().l(z3Var.a);
                if (!z10) {
                }
                l3Var3 = this.q0;
                if (l3Var3 == null) {
                }
                i18 = 0;
                if (np.e1().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.g0;
                if (imageView != null) {
                }
                imageView2 = this.h0;
                if (imageView2 == null) {
                }
            }
        }
        z14 = z12;
        storyItem5 = z3Var.a;
        if (storyItem5 != null) {
            i9Var.P0 = storyItem5.id;
        }
        i9Var.o0.A();
        this.I2 = true;
        if (!this.m1) {
        }
        i1(false);
        TL_stories.StoryItem storyItem212 = z3Var.a;
        r6 r6Var102 = z3Var.b;
        if (storyItem212 == null) {
        }
        if (storyItem2 == null) {
        }
        if (i31 == i11) {
        }
        if (z61) {
        }
        e1Var = i9Var.B0;
        if (e1Var != null) {
        }
        z16 = false;
        e3Var = this.M0;
        i3Var = this.u0;
        x3Var = this.Y0;
        if (r6Var4 != null) {
        }
        k2Var = this.L1;
        if (k2Var != null) {
        }
        z18 = z3Var.f;
        if (z18) {
        }
        jxVar.c();
        this.G0 = 0L;
        this.I0 = z17;
        r6Var5 = z3Var.b;
        if (r6Var5 != null) {
        }
        xbVar = xb.w;
        if (xbVar != null) {
        }
        i3Var.J();
        o0();
        z16 = true;
        if (z16) {
        }
        x3Var.setOnSubtitleClick(null);
        TextView[] textViewArr22 = x3Var.c;
        this.A3 = 0;
        z20 = z61;
        long j322 = this.l1;
        boolean z6322 = z62;
        z21 = z3Var.f;
        U0(j322, false, z21);
        r6Var6 = z3Var.b;
        if (r6Var6 != null) {
        }
        z22 = z16;
        imageReceiver3 = imageReceiver;
        e3Var2 = e3Var;
        i3Var2 = i3Var;
        x3Var2 = x3Var;
        charSequence2 = charSequence3;
        charSequence = charSequence2;
        z23 = z6322;
        if (charSequence == null) {
        }
        l3Var = this.p0;
        if (l3Var != null) {
        }
        l3Var2 = this.q0;
        if (l3Var2 != null) {
        }
        storyItem10 = z3Var.a;
        if (storyItem6 == storyItem10) {
        }
        z3Var.o();
        if (!z3Var.g) {
        }
        i9 i9Var522 = ((z8) u3Var).d;
        i9Var522.Z0 = false;
        i9Var522.V();
        z25 = z3Var.f;
        if (z25) {
        }
        if (z26 != this.q1) {
        }
        linearLayout = this.Q1;
        if (linearLayout != null) {
        }
        z27 = this.M2;
        LinearLayout linearLayout222 = this.y0;
        if (z27) {
        }
        hVar = this.M1;
        if (hVar != null) {
        }
        aVar = this.H1;
        c2 c2Var22 = this.v0;
        if (aVar != null) {
        }
        l1Var = this.K1;
        if (l1Var != null) {
        }
        if (this.J1 != null) {
        }
        z36 = z3Var.f;
        if (z36) {
        }
        i3 i3Var322 = i3Var2;
        if (this.u1) {
        }
        i3Var322.setVisibility(8);
        storyItem11 = z3Var.a;
        if (storyItem11 != null) {
        }
        c2Var22.r(this.l1, null);
        c2Var22.setVisibility(8);
        e3Var2.invalidate();
        if (this.A1 != null) {
        }
        z37 = this.n1;
        v2 v2Var3222 = this.z0;
        ImageView imageView3222 = this.x0;
        v2 v2Var4222 = this.n0;
        if (z37) {
        }
        v2Var4222.requestLayout();
        i9Var.e1.append(this.l1, i7);
        if (this.u1) {
        }
        c2Var22.setLivePlayer(i9Var.B0);
        this.v1 = 0;
        if (i9Var.O0 != null) {
        }
        int i35222 = this.t1;
        this.w1 = i35222;
        int i36222 = this.k1;
        this.x1 = i36222;
        if (i9Var.R0) {
        }
        l10 = z3Var.l();
        bi.v1 v1Var222 = this.i0;
        if (l10) {
        }
        r6Var7 = z3Var.b;
        n8 n8Var222 = this.m0;
        if (r6Var7 == null) {
        }
        this.M3 = false;
        n8Var222.setTranslationX(v1Var222.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
        if (z22) {
        }
        r6Var8 = z3Var.b;
        if (r6Var8 == null) {
        }
        if (this.T1 != null) {
        }
        this.h1.a(i9.D1, false);
        if (this.u1) {
        }
        if (this.m1) {
        }
        w3 w3Var222 = x3Var2.b;
        k6 k6Var3222 = i9Var.O0;
        w3Var222.setPadding(0, 0, (k6Var3222 != null || k6Var3222.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
        np.s1(this.m2).T1().l(z3Var.a);
        if (!z10) {
        }
        l3Var3 = this.q0;
        if (l3Var3 == null) {
        }
        i18 = 0;
        if (np.e1().getInt("taptostorysoundhint", 0) < 2) {
        }
        imageView = this.g0;
        if (imageView != null) {
        }
        imageView2 = this.h0;
        if (imageView2 == null) {
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        e1 e1Var;
        int i11 = ns.v5;
        i9 i9Var = this.t0;
        boolean z10 = false;
        if (i7 == i11 || (i7 == ns.x5 && i9Var.O0 == objArr[0])) {
            u3 u3Var = this.A1;
            if (u3Var == null || !((z8) u3Var).d.H0) {
                if (this.u1) {
                    h1();
                    if (this.k1 == 0) {
                        if (this.o2) {
                            return;
                        }
                        this.o2 = true;
                        ((z8) this.A1).j();
                        return;
                    }
                    int i12 = this.t1;
                    ArrayList arrayList = this.f1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.g1;
                    if (i12 >= arrayList2.size() + size) {
                        this.t1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    d1(false);
                    if (this.m1 || this.n1) {
                        i1(true);
                    }
                }
                TL_stories.PeerStories peerStories = i9Var.Q0;
                if (peerStories != null) {
                    this.C1.V(peerStories, true);
                } else {
                    long j3 = this.l1;
                    if (j3 != 0) {
                        s6 s6Var = this.C1;
                        TL_stories.PeerStories y10 = s6Var.y(j3);
                        if (y10 == null) {
                            y10 = s6Var.z(j3);
                            z10 = true;
                        }
                        s6Var.V(y10, z10);
                    }
                }
                org.telegram.ui.ActionBar.z0 z0Var = this.c1;
                if (z0Var != null) {
                    z0Var.animate().alpha((this.C1.M(this.l1) && this.y1.e && !gz.b()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == ns.m3) {
            d1(false);
            return;
        }
        if (i7 == ns.i4) {
            this.u0.c0.invalidate();
            return;
        }
        if (i7 == ns.D5) {
            p0(true);
            return;
        }
        if (i7 == ns.b3) {
            m6 o4 = np.s1(this.m2).P1().o();
            if (o4 == null || !o4.a(this.m2, 1) || this.A1 == null) {
                return;
            }
            bi.t6 t6Var = new bi.t6(this, 2);
            Context W = org.telegram.messenger.g0.W(getContext());
            if (W == null) {
                W = LaunchActivity.H1;
            }
            ((z8) this.A1).h(new ug.j0(o4.b(), this.m2, W, t6Var, null));
            return;
        }
        if (i7 == ns.i3) {
            TL_account.RequirementToContact J2 = np.s1(this.m2).J2(this.l1);
            boolean z11 = this.l1 >= 0 && !m10.i(this.m2).q() && (J2 instanceof TL_account.requirementToContactPremium);
            if (this.p1 == z11 && this.r1 == org.telegram.messenger.m5.k(J2)) {
                return;
            }
            this.p1 = z11;
            this.r1 = org.telegram.messenger.m5.k(J2);
            d1(false);
            p0(true);
            return;
        }
        if (i7 == ns.T) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.l1 == (-((TLRPC.ChatFull) obj).id)) {
                d1(false);
                return;
            }
            return;
        }
        if (i7 != ns.G2) {
            if (i7 == ns.F && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (i9Var == null || (e1Var = i9Var.B0) == null || e1Var.g() != longValue) {
            return;
        }
        d1(false);
        k2 k2Var = this.L1;
        if (k2Var != null) {
            k2Var.N(true);
            this.L1.j2(true);
            p0(true);
        }
        c2 c2Var = this.v0;
        if (c2Var != null) {
            e1 e1Var2 = c2Var.Q;
            if (c2Var.I != (e1Var2 != null ? e1Var2.j() : 0L)) {
                c2Var.e.O(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ud udVar;
        Canvas canvas2;
        org.telegram.ui.Components.g6 g6Var;
        org.telegram.ui.Components.g6 g6Var2;
        j1();
        if (this.n1 && (g6Var2 = this.A0) != null) {
            g6Var2.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        if (this.n1 && (g6Var = this.B0) != null) {
            g6Var.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.e3;
        LinearLayout linearLayout = this.y0;
        v2 v2Var = this.n0;
        if (z10) {
            float measuredWidth = (v2Var.getMeasuredWidth() / 2.0f) + v2Var.getX() + linearLayout.getX();
            float measuredHeight = (v2Var.getMeasuredHeight() / 2.0f) + v2Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.g0.L(24.0f);
            float f10 = L / 2.0f;
            float T1 = org.telegram.messenger.g0.T1(this.g3, measuredWidth - f10, er.g.getInterpolation(this.f3));
            float T12 = org.telegram.messenger.g0.T1(this.h3, measuredHeight - f10, this.f3);
            int W1 = org.telegram.messenger.g0.W1(this.f3, this.i3, L);
            if (this.Z2) {
                org.telegram.ui.Components.g5 g5Var = this.Y2;
                if (g5Var != null) {
                    float f11 = W1;
                    g5Var.setBounds((int) T1, (int) T12, (int) (T1 + f11), (int) (T12 + f11));
                    this.Y2.draw(canvas);
                }
            } else {
                float f12 = W1;
                ImageReceiver imageReceiver = this.X2;
                imageReceiver.y0(T1, T12, f12, f12);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.a3) {
            float measuredWidth2 = (v2Var.getMeasuredWidth() / 2.0f) + v2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (v2Var.getMeasuredHeight() / 2.0f) + v2Var.getY() + linearLayout.getY();
            int L2 = org.telegram.messenger.g0.L(120.0f);
            if (this.Z2) {
                ch.d dVar = this.W2;
                if (dVar != null) {
                    float f13 = L2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f13), (int) (measuredHeight2 - f13), (int) (measuredWidth2 + f13), (int) (measuredHeight2 + f13));
                    this.W2.b(canvas);
                    if (this.W2.c()) {
                        this.W2.d(this);
                        this.W2 = null;
                        this.a3 = false;
                    }
                } else {
                    this.a3 = false;
                }
            } else {
                float f14 = L2;
                float f15 = f14 / 2.0f;
                float f16 = measuredWidth2 - f15;
                float f17 = measuredHeight2 - f15;
                ImageReceiver imageReceiver2 = this.V2;
                imageReceiver2.y0(f16, f17, f14, f14);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.B() != null && imageReceiver2.B().A()) {
                    this.a3 = false;
                }
            }
        }
        k2 k2Var = this.L1;
        if (k2Var != null) {
            ud udVar2 = k2Var.g2;
            ud udVar3 = k2Var.h2;
            if (k2Var.getAlpha() == 0.0f || (udVar = k2Var.f1) == null || udVar.getParent() == null || k2Var.f1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(k2Var.f1.getX() + udVar2.getX() + udVar3.getX() + k2Var.getX(), k2Var.f1.getY() + udVar2.getY() + udVar3.getY() + k2Var.getY());
            if (k2Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight(), (int) (k2Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            k2Var.f1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ui.f fVar;
        float L;
        if (view == this.N2) {
            canvas.save();
            canvas.clipRect(0.0f, this.N2.getY(), getMeasuredWidth(), this.N2.getY() + this.N2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        k2 k2Var = this.L1;
        Paint paint = this.X1;
        v2 v2Var = this.n0;
        y3 y3Var = this.h1;
        if (view == k2Var) {
            float f10 = this.a2;
            z3 z3Var = this.y1;
            if (f10 > 0.0f && !z3Var.f) {
                y3Var.l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y3Var.l);
            }
            RectF rectF = y3Var.h;
            RectF rectF2 = y3Var.i;
            RectF rectF3 = y3Var.j;
            rectF.set(this.L1.getX(), this.L1.getY() + this.L1.getAnimatedTop() + org.telegram.messenger.g0.L(1.33f), this.L1.getX() + this.L1.getMeasuredWidth(), this.L1.getY() + this.L1.getMeasuredHeight());
            float L2 = org.telegram.messenger.g0.L(40.0f);
            if (z3Var.f) {
                L = org.telegram.messenger.g0.L(46.0f);
                L2 = org.telegram.messenger.g0.L(46.0f);
                l1 l1Var = this.K1;
                if (l1Var != null && l1Var.getVisibility() == 0) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
            } else {
                if (this.C2) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (this.D2 && this.n1) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (v2Var != null && v2Var.getVisibility() == 0) {
                    L2 = (L2 - org.telegram.messenger.g0.L(40.0f)) + v2Var.getLayoutParams().width;
                }
                L = 0.0f;
            }
            rectF2.set(org.telegram.messenger.g0.L(10.0f) + L, ((this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(38.0f), (getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - L2, (this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f));
            this.L1.setTranslationX((1.0f - this.a2) * L);
            this.L1.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.z(1.0f, this.a2, -org.telegram.messenger.g0.L(2.0f), this.L1.getMeasuredHeight() > org.telegram.messenger.g0.L(50.0f) ? ((1.0f - this.a2) * (this.L1.getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f))) + 0.0f : 0.0f));
            float L3 = org.telegram.messenger.g0.L(50.0f) / 2.0f;
            org.telegram.messenger.g0.Z1(rectF2, y3Var.h, this.a2, rectF3);
            fh.g gVar = this.V1;
            if (gVar != null) {
                gVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                gVar.r(L3);
                gVar.setAlpha((int) ((1.0f - this.O3) * (1.0f - this.b2) * 255.0f * getHideInterfaceAlpha()));
                gVar.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.a2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (k2Var != null && k2Var.H0(view)) {
                float L4 = org.telegram.messenger.g0.L(30.0f);
                RectF rectF4 = y3Var.k;
                RectF rectF5 = y3Var.k;
                rectF4.set(0.0f, view.getY() + org.telegram.messenger.g0.L(1.0f), getWidth(), org.telegram.messenger.g0.L(20.0f) + getHeight());
                Path path = this.L3;
                path.rewind();
                path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                fh.g gVar2 = this.W1;
                if (gVar2 != null) {
                    gVar2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    gVar2.s(L4, L4, L4, L4);
                    gVar2.setAlpha(ns.e4);
                    gVar2.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, L4, L4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.P1 || this.L1 == null) {
                if (view == this.b3) {
                    view.setTranslationY((this.y0.getY() + (v2Var.getY() + (-(r2.getMeasuredHeight() - this.b3.getPaddingBottom())))) - org.telegram.messenger.g0.L(18.0f));
                } else {
                    e3 e3Var = this.M0;
                    if (view == e3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.r3) != null && !fVar.r) {
                        RecordingCanvas h = fVar.h(getMeasuredWidth(), getMeasuredHeight());
                        h.drawColor(i0.a.f(0.2f, -16777216, -1));
                        h.translate(e3Var.getX(), e3Var.getY());
                        view.draw(h);
                        fVar.i();
                    }
                }
            } else {
                view.setTranslationY(((this.L1.getY() + this.L1.getAnimatedTop()) + (-r2.getMeasuredHeight())) - org.telegram.messenger.g0.L(18.0f));
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1() {
        ArrayList arrayList;
        int i7;
        int i10;
        ImageReceiver imageReceiver;
        boolean isEmpty;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i11;
        TL_stories.StoryItem storyItem;
        String str;
        int i12;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        String str2;
        int i13;
        ArrayList arrayList7;
        int i14;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String sb2;
        int max = (int) (Math.max(org.telegram.messenger.g0.c1().x, org.telegram.messenger.g0.c1().y) / org.telegram.messenger.g0.p);
        String j3 = com.google.android.gms.internal.vision.e2.j(max, "_", max);
        ArrayList arrayList11 = this.C3;
        arrayList11.clear();
        ArrayList arrayList12 = this.D3;
        arrayList12.clear();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.R0;
            if (i16 >= arrayList.size()) {
                break;
            }
            ((ch.g0) arrayList.get(i16)).b(false);
            i16++;
        }
        arrayList.clear();
        int i17 = 0;
        while (i17 < 2) {
            int i18 = this.t1;
            if (i17 == 0) {
                i10 = i18 - 1;
                imageReceiver = this.P0;
                if (i10 < 0) {
                    imageReceiver.f();
                    arrayList7 = arrayList11;
                    arrayList9 = arrayList;
                    i14 = i17;
                    arrayList8 = arrayList12;
                    i17 = i14 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i15 = 0;
                }
                ArrayList arrayList13 = this.g1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.f1;
                if (isEmpty && i10 >= arrayList2.size()) {
                    T0((r6) arrayList13.get(i10 - arrayList2.size()), imageReceiver, j3);
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < 0) {
                        i10 = i15;
                    }
                    if (i10 >= arrayList2.size()) {
                        i10 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i10);
                    long j10 = this.l1;
                    storyItem2.dialogId = j10;
                    r6 t6 = this.C1.t(j10, storyItem2);
                    if (t6 != null) {
                        T0(t6, imageReceiver, j3);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList;
                        i11 = i17;
                        str = null;
                        storyItem = storyItem2;
                        i12 = 1;
                    } else {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        int i19 = (messageMedia == null || !gj.K4(messageMedia.getDocument())) ? i15 : 1;
                        String str3 = storyItem2.attachPath;
                        if (str3 != null) {
                            int i20 = i19;
                            if (storyItem2.media == null) {
                                i20 = str3.toLowerCase().endsWith(".mp4");
                            }
                            if (i20 != 0) {
                                str2 = null;
                                i13 = 1;
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i17;
                                imageReceiver.u0(gc.g(storyItem2.attachPath), r.b.v(j3, "_pframe"), gc.g(storyItem2.firstFramePath), j3, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i17;
                                str2 = null;
                                i13 = 1;
                                String str4 = j3;
                                imageReceiver.r0(gc.g(storyItem2.attachPath), str4, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                j3 = str4;
                            }
                            str = str2;
                            i12 = i13;
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i11 = i17;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (i19 != 0) {
                                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(storyItem2.media.getDocument().thumbs, 1000, false, null, false);
                                gc b10 = gc.b(s6.C(this.m2, storyItem2));
                                String v = r.b.v(j3, "_pframe");
                                gc c10 = gc.c(w10, storyItem2.media.getDocument());
                                storyItem = storyItem2;
                                str = null;
                                i12 = 1;
                                imageReceiver2.u0(b10, v, c10, j3, null, null, null, 0L, null, storyItem, 0);
                            } else {
                                storyItem = storyItem2;
                                str = null;
                                i12 = 1;
                                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.f();
                                } else {
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false);
                                    org.telegram.messenger.w7.u(800, photo.sizes);
                                    imageReceiver2.u0(null, null, gc.i(w11, photo), j3, null, null, null, 0L, null, storyItem, 0);
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (((messageMedia3 == null || !gj.K4(messageMedia3.getDocument())) ? 0 : i12) != 0) {
                        TLRPC.Document C = s6.C(this.m2, storyItem);
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = org.telegram.messenger.w7.G(this.m2).F(storyItem);
                        }
                        try {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("?account=");
                            sb3.append(this.m2);
                            sb3.append("&id=");
                            sb3.append(C.id);
                            sb3.append("&hash=");
                            sb3.append(C.access_hash);
                            sb3.append("&dc=");
                            sb3.append(C.dc_id);
                            sb3.append("&size=");
                            sb3.append(C.size);
                            sb3.append("&mime=");
                            sb3.append(URLEncoder.encode(C.mime_type, "UTF-8"));
                            sb3.append("&rid=");
                            sb3.append(storyItem.fileReference);
                            sb3.append("&name=");
                            sb3.append(URLEncoder.encode(org.telegram.messenger.w7.B(C), "UTF-8"));
                            sb3.append("&reference=");
                            byte[] bArr = C.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb3.append(Utilities.f(bArr));
                            sb3.append("&sid=");
                            sb3.append(storyItem.id);
                            sb3.append("&did=");
                            sb3.append(storyItem.dialogId);
                            sb2 = sb3.toString();
                            arrayList7 = arrayList3;
                        } catch (UnsupportedEncodingException e10) {
                            e = e10;
                            arrayList7 = arrayList3;
                        }
                        try {
                            arrayList7.add(Uri.parse("tg://" + org.telegram.messenger.w7.r(str, C) + sb2));
                            arrayList8 = arrayList4;
                            try {
                                arrayList8.add(C);
                                i14 = i11;
                                if (i14 == i12) {
                                    try {
                                        if (org.telegram.messenger.b6.h()) {
                                            org.telegram.messenger.w7.G(this.m2).W(C, storyItem, i12, i12);
                                        }
                                    } catch (UnsupportedEncodingException e11) {
                                        e = e11;
                                        e.printStackTrace();
                                        if (storyItem.media_areas != null) {
                                        }
                                        arrayList9 = arrayList5;
                                        i17 = i14 + 1;
                                        arrayList11 = arrayList7;
                                        arrayList12 = arrayList8;
                                        arrayList = arrayList9;
                                        i15 = 0;
                                    }
                                }
                            } catch (UnsupportedEncodingException e12) {
                                e = e12;
                                i14 = i11;
                            }
                        } catch (UnsupportedEncodingException e13) {
                            e = e13;
                            i14 = i11;
                            arrayList8 = arrayList4;
                            e.printStackTrace();
                            if (storyItem.media_areas != null) {
                            }
                            arrayList9 = arrayList5;
                            i17 = i14 + 1;
                            arrayList11 = arrayList7;
                            arrayList12 = arrayList8;
                            arrayList = arrayList9;
                            i15 = 0;
                        }
                    } else {
                        arrayList7 = arrayList3;
                        i14 = i11;
                        arrayList8 = arrayList4;
                    }
                    if (storyItem.media_areas != null) {
                        int i21 = 0;
                        while (i21 < storyItem.media_areas.size()) {
                            if (storyItem.media_areas.get(i21) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i21);
                                ch.g0 g0Var = new ch.g0(this);
                                g0Var.e(ch.p0.d(tL_mediaAreaSuggestedReaction.reaction));
                                g0Var.b(this.K0);
                                arrayList10 = arrayList5;
                                arrayList10.add(g0Var);
                            } else {
                                arrayList10 = arrayList5;
                            }
                            i21++;
                            arrayList5 = arrayList10;
                        }
                    }
                    arrayList9 = arrayList5;
                    i17 = i14 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i15 = 0;
                }
                arrayList7 = arrayList11;
                arrayList9 = arrayList;
                i14 = i17;
                arrayList8 = arrayList12;
                i17 = i14 + 1;
                arrayList11 = arrayList7;
                arrayList12 = arrayList8;
                arrayList = arrayList9;
                i15 = 0;
            } else {
                i10 = i18 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.Q0;
                if (i10 >= storiesCount) {
                    imageReceiver3.f();
                    arrayList7 = arrayList11;
                    arrayList9 = arrayList;
                    i14 = i17;
                    arrayList8 = arrayList12;
                    i17 = i14 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i15 = 0;
                } else {
                    imageReceiver = imageReceiver3;
                    ArrayList arrayList132 = this.g1;
                    isEmpty = arrayList132.isEmpty();
                    arrayList2 = this.f1;
                    if (isEmpty) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    arrayList7 = arrayList11;
                    arrayList9 = arrayList;
                    i14 = i17;
                    arrayList8 = arrayList12;
                    i17 = i14 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i15 = 0;
                }
            }
        }
        ArrayList arrayList14 = arrayList11;
        ArrayList arrayList15 = arrayList12;
        z8 z8Var = (z8) this.A1;
        i9 i9Var = z8Var.d;
        if (gz.j() && gz.b()) {
            boolean z10 = i9Var.H0;
            ArrayList arrayList16 = i9Var.M0;
            if (z10) {
                return;
            }
            for (int i22 = 0; i22 < arrayList16.size(); i22++) {
                for (int i23 = 0; i23 < arrayList14.size(); i23++) {
                    if (((Uri) arrayList14.get(i23)).equals(((h9) arrayList16.get(i22)).uri)) {
                        arrayList14.remove(i23);
                    }
                }
            }
            for (int i24 = 0; i24 < arrayList14.size(); i24++) {
                Uri uri = (Uri) arrayList14.get(i24);
                h9 h9Var = new h9(i9Var, i9Var.D0, i9Var.C0);
                h9Var.setOnSeekUpdate(new f6(16, z8Var, h9Var));
                h9Var.uri = uri;
                TLRPC.Document document = (TLRPC.Document) arrayList15.get(i24);
                h9Var.document = document;
                if (document != null) {
                    i7 = 0;
                    org.telegram.messenger.s8.J.put(Long.valueOf(document.id), 0);
                } else {
                    i7 = 0;
                    ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.I;
                }
                h9Var.preparePlayer(uri, i9.D1, i9.B1);
                arrayList16.add(h9Var);
                if (arrayList16.size() > 2) {
                    ((h9) arrayList16.remove(i7)).release(null);
                }
            }
        }
    }

    public final void f1() {
        if (this.q1) {
            TextView textView = this.R1;
            if (textView != null) {
                textView.setText(hd.M0(2131748823, null));
            }
            TextView textView2 = this.S1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.R1;
        if (textView3 != null) {
            textView3.setText(hd.M0(this.o1 ? 2131744665 : 2131744493, null));
        }
        TextView textView4 = this.S1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.S1.setText(hd.M0(2131744492, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i7;
        ArrayList arrayList = this.j1;
        i9 i9Var = this.t0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.g1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i7 = 0;
            } else {
                i7 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j3 = ((r6) arrayList2.get(i10)).a;
                    if (((int) (j3 ^ (j3 >>> 32))) == i9Var.P0) {
                        this.t1 = i10;
                        return;
                    }
                }
            }
            int indexOf = this.j1.indexOf(Integer.valueOf(i9Var.P0));
            if (indexOf < 0 && !this.j1.isEmpty()) {
                if (i9Var.P0 > ((Integer) this.j1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (i9Var.P0 < ((Integer) i5.c.h(1, this.j1)).intValue()) {
                    indexOf = this.j1.size() - 1;
                }
            }
            this.t1 = i7 + indexOf;
        } else {
            int i11 = i9Var.e1.get(this.l1, -1);
            this.t1 = i11;
            if (i11 == -1 && !i9Var.N0 && (peerStories = this.e1) != null && peerStories.max_read_id > 0) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f1;
                    if (i12 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i12)).id > this.e1.max_read_id) {
                        this.t1 = i12;
                        break;
                    }
                    i12++;
                }
            }
        }
        if (this.t1 == -1) {
            this.t1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.j1;
    }

    public long getCurrentPeer() {
        return this.l1;
    }

    public int getListPosition() {
        return this.v1;
    }

    public Bitmap getPlayingBitmap() {
        e3 e3Var = this.M0;
        Bitmap createBitmap = Bitmap.createBitmap(e3Var.getWidth(), e3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.t1;
    }

    public s6 getStoriesController() {
        return np.s1(this.m2).P1();
    }

    public int getStoriesCount() {
        return Math.max(this.n2, this.f1.size()) + this.g1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f1;
    }

    public final void h1() {
        k6 k6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f1;
        arrayList.clear();
        i9 i9Var = this.t0;
        if (!i9Var.N0) {
            ArrayList arrayList2 = this.j1;
            int i7 = 0;
            ArrayList arrayList3 = this.g1;
            if (arrayList2 != null && (k6Var = i9Var.O0) != null) {
                if (k6Var instanceof c6) {
                    arrayList3.clear();
                    ArrayList F = np.s1(this.m2).P1().F(this.l1);
                    String str = ((c6) i9Var.O0).E;
                    if (F != null) {
                        for (int i10 = 0; i10 < F.size(); i10++) {
                            r6 r6Var = (r6) F.get(i10);
                            hi.d7 d7Var = r6Var.c;
                            if (d7Var != null && !d7Var.g && TextUtils.equals(d7Var.K0, str)) {
                                arrayList3.add(r6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.j1;
                int size = arrayList4.size();
                while (i7 < size) {
                    Object obj = arrayList4.get(i7);
                    i7++;
                    gj f10 = i9Var.O0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (i9Var.O0 != null) {
                while (i7 < i9Var.O0.i.size()) {
                    arrayList.add(((gj) i9Var.O0.i.get(i7)).l);
                    i7++;
                }
            } else {
                TL_stories.PeerStories peerStories = i9Var.Q0;
                if (peerStories == null || org.telegram.messenger.m5.o(peerStories.peer) != this.l1) {
                    TL_stories.PeerStories y10 = this.C1.y(this.l1);
                    this.e1 = y10;
                    if (y10 == null) {
                        this.e1 = this.C1.z(this.l1);
                    }
                } else {
                    this.e1 = i9Var.Q0;
                }
                this.n2 = 0;
                TL_stories.PeerStories peerStories2 = this.e1;
                if (peerStories2 != null) {
                    this.n2 = peerStories2.stories.size();
                    arrayList.addAll(this.e1.stories);
                }
                arrayList3.clear();
                ArrayList F2 = this.C1.F(this.l1);
                if (F2 != null) {
                    arrayList3.addAll(F2);
                }
            }
        } else if (!i9Var.S0) {
            arrayList.add(i9Var.T0);
        }
        this.k1 = getStoriesCount();
    }

    public final void i0(boolean z10) {
        b4 currentPeerView;
        r40 r40Var = this.t2;
        if (r40Var != null) {
            r40Var.f0 = null;
            r40Var.a(false);
        }
        long j3 = this.l1;
        TL_stories.StoryItem storyItem = this.y1.a;
        i9 i9Var = this.t0;
        i9Var.getClass();
        if (j3 != 0 && storyItem != null) {
            i9.E1.remove(j3 + (j3 >> 16) + (storyItem.id << 16));
        }
        this.S2 = true;
        y8 y8Var = i9Var.o0;
        if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z10) {
            xb J = new cc(this.M0, this.l0).J(R.raw.forward, hd.M0(2131748483, null), hd.M0(2131743552, null), 5000, false, new t1(this, 2));
            J.r = false;
            J.k(false);
        }
        np.s1(this.m2).s0(this.l1, 0, null);
    }

    public final void i1(boolean z10) {
        int i7;
        int i10;
        z3 z3Var = this.y1;
        TL_stories.StoryItem storyItem = z3Var.a;
        if (storyItem == null) {
            storyItem = z3Var.c;
        }
        boolean z11 = this.n1;
        if (z11 || this.m1) {
            if (storyItem == null) {
                this.k2.setText("");
                this.p2.setVisibility(8);
                this.l2.setVisibility(8);
                return;
            }
            i9 i9Var = this.t0;
            v2 v2Var = this.n0;
            if (!z11) {
                int i11 = 3;
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.k2.setText(i9Var.O0 == null ? hd.M0(2131748123, null) : hd.M0(2131748122, null));
                    this.k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    this.l2.setVisibility(8);
                    this.p2.setVisibility(8);
                } else {
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i12 >= storyItem.views.recent_viewers.size()) {
                            i7 = i11;
                            break;
                        }
                        TLObject e22 = np.s1(this.m2).e2(storyItem.views.recent_viewers.get(i12).longValue());
                        if (e22 != null) {
                            this.l2.b(i13, this.m2, e22);
                            i13++;
                        }
                        i7 = i11;
                        if (i13 >= i7) {
                            break;
                        }
                        i12++;
                        i11 = i7;
                    }
                    for (int i14 = i13; i14 < i7; i14++) {
                        this.l2.b(i14, this.m2, null);
                    }
                    this.l2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        eq eqVar = new eq(R.drawable.mini_views_likes, 0);
                        eqVar.y = -53704;
                        eqVar.n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        eq eqVar2 = new eq(R.drawable.mini_repost_story, 0);
                        eqVar2.y = -14161823;
                        eqVar2.n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder.setSpan(eqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.k2.setText(spannableStringBuilder);
                    if (i13 == 0) {
                        this.l2.setVisibility(8);
                        this.k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    } else {
                        this.l2.setVisibility(0);
                        this.k2.setTranslationX(org.telegram.messenger.g0.L(10.0f) + com.google.android.gms.internal.vision.e2.v(i13, 1, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(13.0f)));
                    }
                    this.p2.setVisibility(0);
                }
                v2Var.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                this.y0.requestLayout();
                return;
            }
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2.views_count <= 0) {
                storyViews2.views_count = 1;
            }
            org.telegram.ui.Components.g6 g6Var = this.B0;
            if (g6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.F0 = false;
            } else {
                g6Var.t(Integer.toString(i10), z10 && this.F0, true);
                this.F0 = true;
            }
            int i15 = storyItem.views.reactions_count;
            if (i15 > 0) {
                this.A0.t(Integer.toString(i15), z10 && this.E0, true);
                this.E0 = true;
            } else {
                this.E0 = false;
            }
            if (!z10) {
                this.C0.e(true, this.E0 ? 1.0f : 0.0f);
                org.telegram.ui.Components.u5 u5Var = this.D0;
                if (u5Var != null) {
                    u5Var.e(true, this.F0 ? 1.0f : 0.0f);
                }
            }
            TLRPC.Chat M0 = np.s1(this.m2).M0(Long.valueOf(-this.l1));
            if (!(this.o1 && (org.telegram.messenger.t3.q(M0) || org.telegram.messenger.t3.s0(M0))) && storyItem.views.views_count > 0) {
                this.k2.setText(i9Var.O0 == null ? hd.M0(2131748123, null) : hd.M0(2131748122, null));
                this.k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new eq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.o0(storyItem.views.views_count, 0));
                this.k2.setText(spannableStringBuilder2);
            } else {
                this.k2.setText("");
            }
            v2Var.getLayoutParams().width = (int) (org.telegram.messenger.g0.L(40.0f) + (this.E0 ? this.A0.d + org.telegram.messenger.g0.L(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + v2Var.getLayoutParams().width;
            v2 v2Var2 = this.z0;
            if (v2Var2 != null) {
                v2Var2.getLayoutParams().width = (int) (org.telegram.messenger.g0.L(40.0f) + (this.F0 ? org.telegram.messenger.g0.L(4.0f) + this.B0.d : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin += v2Var2.getLayoutParams().width;
                v2Var2.requestLayout();
            }
            this.G1.requestLayout();
            v2Var.requestLayout();
            this.l2.setVisibility(8);
            this.p2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = z3Var.a;
            a3 a3Var = this.T0;
            if (storyItem2 == null) {
                a3Var.getClass();
                return;
            }
            for (int i16 = 0; i16 < a3Var.getChildCount(); i16++) {
                if (a3Var.getChildAt(i16) instanceof p8) {
                    ((p8) a3Var.getChildAt(i16)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void j0() {
        x6 x6Var = this.o0;
        x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new h2(0, x6Var)).setDuration(150L).start();
        int L = org.telegram.messenger.g0.L(8.0f);
        x6 x6Var2 = new x6(getContext(), this.h1);
        this.o0 = x6Var2;
        x6Var2.setPadding(L, L, L, L);
        this.o0.setAlpha(0.0f);
        this.o0.setScaleX(0.8f);
        this.o0.setScaleY(0.8f);
        this.o0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.n0.addView(this.o0, ja.e(40, 40, 3));
        this.a3 = false;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void j1() {
        /*
            Method dump skipped, instructions count: 1615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.b4.j1():void");
    }

    public final void k0(boolean z10) {
        ValueAnimator valueAnimator = this.N3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O3, z10 ? 1.0f : 0.0f);
        this.N3 = ofFloat;
        ofFloat.addUpdateListener(new u1(this, 2));
        this.N3.addListener(new f2(this, z10, 1));
        this.N3.setDuration(420L);
        this.N3.setInterpolator(er.h);
        this.N3.start();
    }

    public final void l0(Runnable runnable) {
        if (np.s1(this.m2).v2()) {
            org.telegram.ui.b.b(this.m2);
            return;
        }
        int i7 = gz.e0;
        if (i7 <= 0 || !this.U2) {
            runnable.run();
            return;
        }
        int i10 = i7 - 1;
        gz.e0 = i10;
        gz.T(i10);
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(0, getContext(), this.l0);
        t1Var.setTitle(hd.M0(2131744885, null));
        t1Var.n(hd.M0(2131744886, null));
        String M0 = hd.M0(2131746743, null);
        ba.b bVar = new ba.b(runnable);
        t1Var.m0 = M0;
        t1Var.n0 = bVar;
        String M02 = hd.M0(2131752589, null);
        di.o oVar = new di.o(25);
        t1Var.o0 = M02;
        t1Var.p0 = oVar;
        t1Var.show();
    }

    public final void m0(int i7) {
        this.o2 = false;
        this.F2 = true;
        this.l3 = false;
        this.n1 = false;
        this.o1 = false;
        long j3 = this.l1;
        x3 x3Var = this.Y0;
        org.telegram.ui.Components.t8 t8Var = this.X0;
        if (j3 >= 0) {
            this.m1 = j3 == m10.i(this.m2).e();
            TLRPC.User a22 = np.s1(this.m2).a2(Long.valueOf(this.l1));
            TL_account.RequirementToContact J2 = np.s1(this.m2).J2(this.l1);
            this.p1 = !m10.i(this.m2).q() && (J2 instanceof TL_account.requirementToContactPremium);
            this.r1 = org.telegram.messenger.m5.k(J2);
            t8Var.r(a22);
            x3Var.a.getImageReceiver().i0(a22, t8Var, null);
            U0(this.l1, true, false);
        } else {
            this.m1 = false;
            this.n1 = true;
            if (this.C1.h(j3)) {
                this.l3 = true;
            } else {
                boolean z10 = org.telegram.messenger.r2.a;
            }
            TLRPC.Chat M0 = np.s1(this.m2).M0(Long.valueOf(-this.l1));
            boolean V = org.telegram.messenger.t3.V(M0);
            this.o1 = !V;
            if (!V && np.s1(this.m2).N0(-this.l1) == null) {
                vr.a0(this.m2).F0(-this.l1, true, new CountDownLatch(1), false, false, 0);
            }
            this.p1 = this.o1 && !org.telegram.messenger.t3.q(M0);
            this.r1 = np.s1(this.m2).N1(this.l1);
            t8Var.q(M0);
            x3Var.a.getImageReceiver().i0(M0, t8Var, null);
            U0(this.l1, true, false);
        }
        if (this.u1 && (this.m1 || this.n1)) {
            s6 s6Var = this.C1;
            long j10 = this.l1;
            a0.h hVar = s6Var.m;
            r9 r9Var = (r9) hVar.f(j10);
            if (r9Var == null) {
                r9Var = new r9(s6Var.a, j10, s6Var);
                hVar.k(r9Var, j10);
            }
            r9Var.b(true);
        }
        h1();
        this.t1 = i7;
        if (i7 < 0) {
            this.t1 = 0;
        }
        this.G0 = 0L;
        this.I0 = false;
        this.t3 = null;
        this.u3 = null;
        boolean z11 = this.n1;
        e3 e3Var = this.M0;
        i9 i9Var = this.t0;
        int i10 = 8;
        z3 z3Var = this.y1;
        if (z11) {
            z0();
            if (this.L1 == null && (this.o1 || z3Var.f)) {
                t0();
            }
            if (this.L1 != null) {
                TLRPC.Chat M02 = np.s1(this.m2).M0(Long.valueOf(-this.l1));
                k2 k2Var = this.L1;
                if (z3Var.f || (!G0() && this.o1 && (org.telegram.messenger.t3.q(M02) || org.telegram.messenger.t3.s0(M02)))) {
                    i10 = 0;
                }
                k2Var.setVisibility(i10);
                k2 k2Var2 = this.L1;
                boolean z12 = z3Var.f;
                B0(true);
                k2Var2.y1(z12);
                this.L1.F1(z3Var.f && !B0(true) && (this.f2 || this.L1.X0), true);
                ft editField = this.L1.getEditField();
                long j11 = this.l1;
                TL_stories.StoryItem storyItem = z3Var.a;
                i9Var.getClass();
                editField.setText(i9.A(j11, storyItem));
                this.L1.r1(this.m2, this.l1);
                this.L1.e2(M02, null);
            }
            org.telegram.ui.Components.g6 g6Var = this.A0;
            org.telegram.ui.ActionBar.e6 e6Var = this.l0;
            if (g6Var == null) {
                org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, false, false);
                this.A0 = g6Var2;
                v2 v2Var = this.n0;
                g6Var2.setCallback(v2Var);
                this.A0.u(e6Var.h(org.telegram.ui.ActionBar.j6.G6));
                this.A0.w(org.telegram.messenger.g0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.u5(v2Var);
            }
            v2 v2Var2 = this.z0;
            if (v2Var2 != null && this.B0 == null) {
                org.telegram.ui.Components.g6 g6Var3 = new org.telegram.ui.Components.g6(false, false, false);
                this.B0 = g6Var3;
                g6Var3.setCallback(v2Var2);
                this.B0.u(e6Var.h(org.telegram.ui.ActionBar.j6.G6));
                this.B0.w(org.telegram.messenger.g0.L(14.0f));
                this.D0 = new org.telegram.ui.Components.u5(v2Var2);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            this.k1 = getStoriesCount();
            e3Var.invalidate();
            invalidate();
        } else if (this.m1) {
            z0();
            if (z3Var.f) {
                this.G1.setVisibility(8);
                if (this.L1 == null) {
                    t0();
                }
                this.L1.setVisibility(0);
            } else {
                this.G1.setVisibility(0);
                k2 k2Var3 = this.L1;
                if (k2Var3 != null) {
                    k2Var3.setVisibility(8);
                }
            }
            k2 k2Var4 = this.L1;
            if (k2Var4 != null) {
                boolean z13 = z3Var.f;
                B0(true);
                k2Var4.y1(z13);
                this.L1.F1(z3Var.f && !B0(true) && (this.f2 || this.L1.X0), true);
            }
            if (i7 == -1) {
                ArrayList arrayList = this.j1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(i9Var.P0));
                    if (indexOf < 0 && !this.j1.isEmpty()) {
                        if (i9Var.P0 > ((Integer) this.j1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (i9Var.P0 < ((Integer) i5.c.h(1, this.j1)).intValue()) {
                            indexOf = this.j1.size() - 1;
                        }
                    }
                    this.t1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.g1.isEmpty();
                    ArrayList arrayList2 = this.f1;
                    if (isEmpty) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i11)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i11)).id > this.C1.f.get(this.l1)) {
                                this.t1 = i11;
                                break;
                            }
                        }
                    } else {
                        this.t1 = arrayList2.size();
                    }
                }
            }
            d1(false);
            e3Var.invalidate();
            invalidate();
        } else {
            if (this.L1 == null) {
                t0();
            }
            if (this.p1 && this.Q1 == null) {
                x0();
            }
            if (this.Q1 != null) {
                if (this.p1 || this.q1) {
                    f1();
                }
                this.Q1.setVisibility(((!this.p1 || z3Var.f) && !this.q1) ? 8 : 0);
            }
            g8 g8Var = this.T1;
            if (g8Var != null) {
                g8Var.setVisibility(8);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            k2 k2Var5 = this.L1;
            if (k2Var5 != null) {
                k2Var5.setVisibility((G0() || q10.A(this.l1)) ? 8 : 0);
                k2 k2Var6 = this.L1;
                boolean z14 = z3Var.f;
                B0(true);
                k2Var6.y1(z14);
                this.L1.F1(z3Var.f && !B0(true) && (this.f2 || this.L1.X0), true);
                ft editField2 = this.L1.getEditField();
                long j12 = this.l1;
                TL_stories.StoryItem storyItem2 = z3Var.a;
                i9Var.getClass();
                editField2.setText(i9.A(j12, storyItem2));
                this.L1.r1(this.m2, this.l1);
                TLRPC.UserFull b22 = np.s1(this.m2).b2(this.l1);
                if (b22 != null) {
                    this.L1.e2(null, b22);
                } else {
                    np.s1(this.m2).W2(np.s1(this.m2).a2(Long.valueOf(this.l1)), this.j2, false, null);
                }
            }
            this.k1 = getStoriesCount();
            v2 v2Var3 = this.G1;
            if (v2Var3 != null) {
                v2Var3.setVisibility(8);
            }
            e3Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        i3 i3Var = this.u0;
        if (i3Var.a0.x()) {
            i3Var.a0.f(false);
        }
    }

    public final void o0() {
        if (this.u1) {
            ((z8) this.A1).d.V();
        }
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.O0.P();
        this.Q0.P();
        this.P0.P();
        this.V2.P();
        this.X2.P();
        k2 k2Var = this.L1;
        if (k2Var != null) {
            k2Var.T0();
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i7 >= arrayList.size()) {
                ns.f(this.m2).c(this, ns.T);
                ns.f(this.m2).c(this, ns.G2);
                ns.f(this.m2).c(this, ns.v5);
                ns.f(this.m2).c(this, ns.m3);
                ns.f(this.m2).c(this, ns.x5);
                ns.f(this.m2).c(this, ns.D5);
                ns.f(this.m2).c(this, ns.b3);
                ns.f(this.m2).c(this, ns.i3);
                ns.f(this.m2).c(this, ns.F);
                ns.e().c(this, ns.i4);
                return;
            }
            ((ch.g0) arrayList.get(i7)).b(true);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        this.O0.R();
        this.Q0.R();
        this.P0.R();
        this.V2.R();
        this.X2.R();
        k2 k2Var = this.L1;
        if (k2Var != null) {
            k2Var.S0();
        }
        org.telegram.ui.Components.g5 g5Var = this.Y2;
        if (g5Var != null) {
            g5Var.n(this);
            this.Y2 = null;
        }
        ch.d dVar = this.W2;
        if (dVar != null) {
            dVar.d(this);
            this.W2 = null;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i7 >= arrayList.size()) {
                ns.f(this.m2).n(this, ns.T);
                ns.f(this.m2).n(this, ns.G2);
                ns.f(this.m2).n(this, ns.v5);
                ns.f(this.m2).n(this, ns.m3);
                ns.f(this.m2).n(this, ns.x5);
                ns.f(this.m2).n(this, ns.D5);
                ns.f(this.m2).n(this, ns.b3);
                ns.f(this.m2).n(this, ns.i3);
                ns.f(this.m2).n(this, ns.F);
                ns.e().n(this, ns.i4);
                return;
            }
            ((ch.g0) arrayList.get(i7)).b(false);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.h1.d.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(72.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042f  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        float f10;
        char c10;
        r40 r40Var;
        boolean z10;
        float L;
        FrameLayout.LayoutParams layoutParams;
        mi0 mi0Var;
        m2 m2Var;
        i9 i9Var = this.t0;
        if (i9Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        }
        int i11 = 0;
        if (this.u1 && this.J2 == null) {
            this.i2 = ((z8) this.A1).d.q0;
        } else {
            this.i2 = 0;
        }
        int size = i9Var.b ? View.MeasureSpec.getSize(i10) : View.MeasureSpec.getSize(i10) + this.i2;
        int size2 = (int) ((View.MeasureSpec.getSize(i7) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.i2 < org.telegram.messenger.g0.L(20.0f)) {
            this.i2 = 0;
        }
        int i12 = this.i2;
        mi0 mi0Var2 = this.b3;
        if (mi0Var2 == null || mi0Var2.getReactionsWindow() == null || this.b3.getReactionsWindow().q) {
            k2 k2Var = this.L1;
            if (k2Var != null && (k2Var.G0() || this.L1.S3)) {
                if (this.L1.getEmojiView().getMeasuredHeight() == 0) {
                    i12 = this.L1.getEmojiPadding();
                } else {
                    k2 k2Var2 = this.L1;
                    if (k2Var2.h4) {
                        k2Var2.O();
                        i12 = this.L1.getStickersExpandedHeight();
                    } else {
                        i12 = k2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.b3.getReactionsWindow().c.animate().translationY(-this.i2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
            i12 = 0;
        }
        boolean z11 = this.f2;
        int i13 = this.Y1;
        x3 x3Var = this.Y0;
        int i14 = 1;
        if (i13 != i12) {
            this.f2 = false;
            int i15 = 3;
            z3 z3Var = this.y1;
            f10 = 8.0f;
            if (i12 <= 0 || !this.u1) {
                k2 k2Var3 = this.L1;
                if (k2Var3 != null) {
                    i9.P(this.l1, z3Var.a, k2Var3.getEditText());
                }
            } else {
                this.f2 = true;
                this.S2 = false;
                this.d2 = i12;
                if (this.P1 == null) {
                    mi0 mi0Var3 = new mi0(1, this.m2, getContext(), LaunchActivity.Q(), new i2(i15, this.l0));
                    this.P1 = mi0Var3;
                    mi0Var3.setHint(hd.M0(this.o1 ? 2131744666 : 2131744503, null));
                    mi0 mi0Var4 = this.P1;
                    mi0Var4.O0 = true;
                    addView(mi0Var4, this.s0, ja.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.P1.setDelegate(new z2(this));
                    this.P1.p(null, null, true);
                }
                this.P1.setFragment(LaunchActivity.Q());
                this.P1.setHint(hd.M0(this.o1 ? 2131744666 : 2131744503, null));
                ch.l0 l0Var = ch.l0.B;
                if (l0Var != null) {
                    l0Var.l = true;
                }
                ch.l0 l0Var2 = ch.l0.C;
                if (l0Var2 != null) {
                    l0Var2.l = true;
                }
            }
            k2 k2Var4 = this.L1;
            if (k2Var4 != null) {
                k2Var4.F1(z3Var.f && !B0(true) && this.f2, true);
            }
            if (this.f2 && (m2Var = this.N2) != null) {
                m2Var.setVisibility(0);
            }
            if (!this.f2 && (mi0Var = this.P1) != null) {
                mi0Var.n();
            }
            x3Var.setEnabled(!this.f2);
            if (this.L1 != null) {
                org.telegram.messenger.g0.Y3(null, !this.f2, 0.1f, true, true);
            }
            if (this.u1 && this.f2) {
                i9 i9Var2 = ((z8) this.A1).d;
                if (!i9Var2.y) {
                    i9Var2.y = true;
                    i9Var2.V();
                }
            }
            this.Y1 = i12;
            ValueAnimator valueAnimator = this.Z1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.x2.d();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r2, i12);
            this.Z1 = ofFloat;
            ofFloat.addUpdateListener(new u1(this, i11));
            this.Z1.addListener(new g2(this, i14));
            if (this.f2) {
                this.Z1.setDuration(250L);
                this.Z1.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                i9Var.m();
            } else {
                this.Z1.setDuration(500L);
                this.Z1.setInterpolator(er.h);
            }
            this.Z1.start();
            boolean z12 = this.f2;
            if (z12 != z11) {
                if (z12) {
                    a8.b8 b8Var = this.z1;
                    Canvas canvas = (Canvas) b8Var.b;
                    Bitmap bitmap = (Bitmap) b8Var.c;
                    C0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (org.telegram.messenger.g0.B(org.telegram.messenger.g0.J0(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.a.o(-1, ns.n1));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (z3Var.f) {
                        hi.l3 l3Var = this.N1;
                        if (l3Var != null) {
                            if (!l3Var.W) {
                                removeView(l3Var);
                            }
                        }
                        if (!B0(true) && np.e1().getInt("taptostoryhighlighthint", 0) < 3) {
                            np.e1().edit().putInt("taptostoryhighlighthint", np.e1().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            hi.l3 l3Var2 = new hi.l3(getContext(), 3);
                            this.N1 = l3Var2;
                            l3Var2.u(hd.M0(2131748813, null));
                            this.N1.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            hi.l3 l3Var3 = this.N1;
                            l3Var3.L = Layout.Alignment.ALIGN_OPPOSITE;
                            l3Var3.r0 = new di.s2(23, this, l3Var2);
                            addView(l3Var3, ja.e(-1, 100, 87));
                            this.N1.w();
                            j1();
                        }
                    }
                } else {
                    k2 k2Var5 = this.L1;
                    if (k2Var5 != null) {
                        k2Var5.getEditField().clearFocus();
                    }
                    hi.l3 l3Var4 = this.N1;
                    if (l3Var4 != null) {
                        l3Var4.f(true);
                    }
                }
                this.e2 = true;
            } else {
                this.e2 = false;
            }
        } else {
            f10 = 8.0f;
        }
        k2 k2Var6 = this.L1;
        if (k2Var6 != null && k2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.L1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        e3 e3Var = this.M0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e3Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z13 = size - size2 > org.telegram.messenger.g0.L(64.0f);
        this.h2 = z13;
        int L2 = (size - ((z13 ? org.telegram.messenger.g0.L(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = L2;
        if (this.h2) {
            this.u2 = (((-L2) + size) - size2) - org.telegram.messenger.g0.L(64.0f);
        } else {
            this.u2 = ((-L2) + size) - size2;
        }
        if (this.h2 != this.g2) {
            e3Var.setLayoutParams(layoutParams2);
        }
        v2 v2Var = this.G1;
        if (v2Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) v2Var.getLayoutParams();
            if (this.h2) {
                layoutParams3.topMargin = org.telegram.messenger.g0.L(f10) + L2 + size2;
            } else {
                layoutParams3.topMargin = (L2 + size2) - org.telegram.messenger.g0.L(48.0f);
            }
        }
        ub ubVar = this.L2;
        if (ubVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ubVar.getLayoutParams();
            if (this.h2) {
                c10 = 0;
                this.L2.setTextColor(i0.a.f(0.5f, -16777216, -1));
                layoutParams4.topMargin = org.telegram.messenger.g0.L(12.0f) + L2 + size2;
                r40Var = this.t2;
                if (r40Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) r40Var.getLayoutParams();
                    if (i12 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.k5.B(64.0f, L2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = org.telegram.messenger.g0.L(64.0f) + i12;
                    }
                }
                z10 = this.h2;
                LinearLayout linearLayout = this.y0;
                i3 i3Var = this.u0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((L2 + size2) - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(40.0f);
                    int L3 = this.m1 ? org.telegram.messenger.g0.L(40.0f) : org.telegram.messenger.g0.L(56.0f);
                    ((FrameLayout.LayoutParams) i3Var.getLayoutParams()).bottomMargin = L3;
                    if (this.g2 != this.h2) {
                        i3Var.setLayoutParams((FrameLayout.LayoutParams) i3Var.getLayoutParams());
                    }
                    i3Var.v0 = L3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f) + L2 + size2;
                    ((FrameLayout.LayoutParams) i3Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(f10);
                    if (this.g2 != this.h2) {
                        i3Var.setLayoutParams((FrameLayout.LayoutParams) i3Var.getLayoutParams());
                    }
                    i3Var.v0 = org.telegram.messenger.g0.L(f10);
                }
                this.F2 = true;
                L = org.telegram.messenger.g0.L(48.0f);
                if (this.m0.getVisibility() == 0) {
                    L += org.telegram.messenger.g0.L(60.0f);
                }
                if (this.i0.getVisibility() == 0) {
                    L += org.telegram.messenger.g0.L(40.0f);
                }
                w3 w3Var = x3Var.b;
                TextView[] textViewArr = x3Var.c;
                layoutParams = (FrameLayout.LayoutParams) w3Var.getLayoutParams();
                if (layoutParams.rightMargin != L) {
                    int i16 = (int) L;
                    layoutParams.rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i16;
                    x3Var.forceLayout();
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.g2 = this.h2;
            }
            this.L2.setTextColor(i0.a.o(-1, ns.V2));
            layoutParams4.topMargin = ((L2 + size2) - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(40.0f);
        }
        c10 = 0;
        r40Var = this.t2;
        if (r40Var != null) {
        }
        z10 = this.h2;
        LinearLayout linearLayout2 = this.y0;
        i3 i3Var2 = this.u0;
        if (z10) {
        }
        this.F2 = true;
        L = org.telegram.messenger.g0.L(48.0f);
        if (this.m0.getVisibility() == 0) {
        }
        if (this.i0.getVisibility() == 0) {
        }
        w3 w3Var2 = x3Var.b;
        TextView[] textViewArr2 = x3Var.c;
        layoutParams = (FrameLayout.LayoutParams) w3Var2.getLayoutParams();
        if (layoutParams.rightMargin != L) {
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.g2 = this.h2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.a2 = -1.0f;
        this.F2 = true;
        invalidate();
    }

    public final void p0(boolean z10) {
        if (this.L1 != null && this.P2 && this.K0) {
            t1 t1Var = this.z3;
            org.telegram.messenger.g0.r(t1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.C1.B;
            this.L1.N(true);
            boolean z11 = this.p1;
            z3 z3Var = this.y1;
            if ((z11 && !z3Var.f) || this.q1) {
                this.U2 = false;
                this.L1.setEnabled(false);
                this.L1.A1(" ", z10);
                return;
            }
            if (this.r1 > 0) {
                this.U2 = false;
                this.L1.setEnabled(true);
                this.L1.A1(mb.T0(hd.a0(null, null, 2131743926, hd.E(this.r1, ','))), z10);
                return;
            }
            if (!z3Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.m2).getCurrentTime();
                int i7 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i7) {
                    this.U2 = true;
                    int currentTime2 = i7 - ConnectionsManager.getInstance(this.m2).getCurrentTime();
                    int i10 = currentTime2 / 60;
                    int i11 = currentTime2 % 60;
                    Locale locale = Locale.US;
                    int measureText = (int) this.L1.getEditField().getPaint().measureText(hd.a0(null, null, 2131744888, String.format(locale, "%02d:%02d", 99, 99)));
                    this.L1.setEnabled(true);
                    if (measureText * 1.2f >= this.L1.getEditField().getMeasuredWidth()) {
                        k2 k2Var = this.L1;
                        String a02 = hd.a0(null, null, 2131744888, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11));
                        k2Var.e = a02;
                        k2Var.f = format;
                        k2Var.a2(z10);
                    } else {
                        this.L1.A1(hd.a0(null, null, 2131744889, String.format(locale, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11))), z10);
                    }
                    org.telegram.messenger.g0.i3(t1Var, 1000L);
                    return;
                }
            }
            this.U2 = false;
            this.L1.setEnabled(true);
            if (!z3Var.f) {
                this.L1.A1(hd.M0(this.o1 ? 2131746250 : 2131746255, null), z10);
                return;
            }
            if (this.L1.getStarsPrice() <= 0) {
                this.L1.A1(hd.M0(2131752005, null), z10);
                return;
            }
            this.L1.A1(mb.Y0(false, hd.a0(null, null, 2131752004, hd.E((int) r0, ',')), this.L1.j6), z10);
            eq eqVar = this.L1.j6[0];
            if (eqVar != null) {
                eqVar.H = 0.9f;
            }
        }
    }

    public final boolean q0() {
        int i7 = 0;
        if (this.c3) {
            if (this.b3.getReactionsWindow() == null) {
                Z0(false);
                return true;
            }
            if (this.i2 > 0) {
                org.telegram.messenger.g0.v1(this.b3.getReactionsWindow().c);
                return true;
            }
            this.b3.getReactionsWindow().d();
            return true;
        }
        a3 a3Var = this.T0;
        if (a3Var != null) {
            hi.l3 l3Var = a3Var.c;
            if (l3Var != null) {
                l3Var.f(true);
                a3Var.c = null;
            }
            a3Var.b = null;
            a3Var.invalidate();
            a3Var.b(false);
        }
        i3 i3Var = this.u0;
        if (i3Var.a0.x()) {
            i3Var.a0.f(false);
            return true;
        }
        hi.l3 l3Var2 = this.p0;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
        hi.l3 l3Var3 = this.q0;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        b30 b30Var = this.G2;
        if (b30Var != null) {
            b30Var.a();
        }
        t3 t3Var = this.d1;
        if (t3Var != null && t3Var.a) {
            t3Var.a();
            return true;
        }
        k2 k2Var = this.L1;
        if (k2Var != null && k2Var.I0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.l0);
            boolean z10 = this.L1.d1;
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            if (z10) {
                t1Var.S = hd.M0(2131751395, null);
                t1Var.U = hd.M0(2131751396, null);
            } else {
                t1Var.S = hd.M0(2131751392, null);
                t1Var.U = hd.M0(2131751393, null);
            }
            alertDialog$Builder.k(hd.M0(2131751394, null), new q1(this, i7));
            alertDialog$Builder.h(hd.M0(2131751771, null), null);
            ((z8) this.A1).h(t1Var);
            return true;
        }
        mi0 mi0Var = this.P1;
        if (mi0Var != null && mi0Var.getReactionsWindow() != null && !this.P1.getReactionsWindow().q) {
            this.P1.getReactionsWindow().d();
            return true;
        }
        k2 k2Var2 = this.L1;
        if (k2Var2 != null && k2Var2.G0()) {
            if (this.i2 > 0) {
                org.telegram.messenger.g0.v1(this.L1.getEmojiView());
                return true;
            }
            this.L1.z0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            if (i3Var.getVisibility() != 0 || i3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            i3Var.D();
            this.Q2 = false;
            this.M0.invalidate();
            return true;
        }
        k2 k2Var3 = this.L1;
        if (k2Var3 != null) {
            long j3 = this.l1;
            TL_stories.StoryItem storyItem = this.y1.a;
            Editable editText = k2Var3.getEditText();
            this.t0.getClass();
            i9.P(j3, storyItem, editText);
        }
        org.telegram.messenger.g0.v1(this.L1);
        return true;
    }

    public final void r0() {
        if (this.s2 == null) {
            p2 p2Var = new p2(this, getContext(), this.l0);
            this.s2 = p2Var;
            p2Var.X3 = new q2(this);
            p2Var.e2.i0();
            p2 p2Var2 = this.s2;
            p2Var2.R1 = true;
            p2Var2.e1();
            p2 p2Var3 = this.s2;
            p2Var3.S1 = new r2(this);
            p2Var3.a1().setText(this.L1.getFieldText());
        }
    }

    public final void s0() {
        if (this.H1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.s3);
        this.H1 = aVar;
        aVar.setOnClickListener(new v1(this, 1));
        addView(this.H1, ja.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public void setAccount(int i7) {
        this.m2 = i7;
        this.C1 = np.s1(i7).i0;
        this.U0.b = i7;
        mi0 mi0Var = this.P1;
        if (mi0Var != null) {
            mi0Var.setCurrentAccount(i7);
            this.P1.p(null, null, true);
        }
        mi0 mi0Var2 = this.b3;
        if (mi0Var2 != null) {
            mi0Var2.setCurrentAccount(i7);
        }
    }

    public void setActive(boolean z10) {
        R0(0L, z10);
    }

    public void setDelegate(u3 u3Var) {
        this.A1 = u3Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.P2 == z10) {
            return;
        }
        this.P2 = z10;
        if (z10) {
            this.O0.i1 = 1.0f;
            p0(false);
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.u1) {
            this.v2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f10) {
        boolean z10 = f10 == 0.0f;
        if (this.L0 != z10) {
            this.L0 = z10;
            this.M0.invalidate();
            if (this.u1 && this.t0.a && Build.VERSION.SDK_INT < 33) {
                sa saVar = this.G3;
                if (z10) {
                    org.telegram.messenger.g0.r(saVar);
                    org.telegram.messenger.g0.i3(saVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(saVar);
                    i9 i9Var = ((z8) this.A1).d;
                    i9Var.l1 = true;
                    i9Var.V();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.B1 != z10) {
            this.B1 = z10;
            u2 u2Var = this.O0;
            if (z10) {
                u2Var.Q0();
                u2Var.u0 = false;
            } else {
                u2Var.P0(false);
                u2Var.u0 = true;
            }
            this.H0 = 0L;
            this.M0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.l0;
        k2 k2Var = new k2(this, org.telegram.messenger.g0.W(getContext()), this, new i2(1, e6Var));
        this.L1 = k2Var;
        ft editField = k2Var.getEditField();
        editField.getClass();
        ys ysVar = new ys(editField, 0);
        editField.u0 = ysVar;
        ysVar.q(true);
        editField.u0.u(editField.y0);
        editField.u0.w(editField.getPaint().getTextSize());
        ys ysVar2 = new ys(editField, 1);
        editField.v0 = ysVar2;
        ysVar2.b = 5;
        ysVar2.u(editField.y0);
        editField.v0.w(editField.getPaint().getTextSize());
        this.L1.getEditField().setScaleX(0.0f);
        this.L1.setOverrideKeyboardAnimation(true);
        this.L1.setClipChildren(false);
        this.L1.setDelegate(new l2(this));
        setDelegate(this.L1);
        k2 k2Var2 = this.L1;
        k2Var2.Q5 = false;
        k2Var2.R5 = true;
        if (this.y1.f) {
            k2Var2.l1(false, false, false);
        } else {
            k2Var2.l1(true, true, false);
        }
        this.L1.updateColors();
        k2 k2Var3 = this.L1;
        k2Var3.S5 = true;
        addView(k2Var3, ja.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.y3 != null) {
            this.L1.j2(false);
        }
        this.L1.o3 = this.j2;
        a4 a4Var = this.w2;
        ((ArrayList) a4Var.g).add(this.M0);
        ((ArrayList) a4Var.g).add(this);
        if (this.K0) {
            this.L1.T0();
        }
        p0(false);
        if (G0()) {
            this.L1.setVisibility(8);
        }
        lh.h hVar = new lh.h(getContext(), e6Var, this.s3, this.p3);
        this.M1 = hVar;
        hVar.setOnClickListener(new q1(this, 1));
        addView(this.M1, ja.e(57, ns.X4, 85));
        this.M1.setVisibility(8);
        this.L1.setSideButtonsForAttach(this.M1);
        this.s0 = getChildCount();
    }

    public final void u0() {
        if (this.T1 != null) {
            return;
        }
        g8 g8Var = new g8(getContext(), this.l0);
        this.T1 = g8Var;
        g8Var.setOnClickListener(new v1(this, 4));
        this.T1.setAlpha(0.0f);
        this.T1.setVisibility(8);
        addView(this.T1, ja.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        if (this.K1 != null || getContext() == null) {
            return;
        }
        l1 l1Var = new l1(getContext(), this.s3);
        this.K1 = l1Var;
        l1Var.setOnClickListener(new v1(this, 5));
        l1 l1Var2 = this.K1;
        e1 e1Var = e1.X;
        boolean z10 = true;
        l1Var2.b(e1Var != null && e1Var.o(), false);
        l1 l1Var3 = this.K1;
        e1 e1Var2 = e1.X;
        if (e1Var2 != null && !e1Var2.m()) {
            z10 = false;
        }
        l1Var3.a(z10, false);
        addView(this.K1, ja.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void w0() {
        if (this.J1 != null || getContext() == null) {
            return;
        }
        this.I1 = new o1(getContext(), this.m2);
        p1 p1Var = new p1(getContext(), this.I1, this.s3);
        this.J1 = p1Var;
        p1Var.setOnClickListener(new v1(this, 6));
        this.J1.setOnLongClickListener(new s1(this, 1));
        addView(this.J1, ja.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.I1, ja.d(ns.e3, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.Q1 != null) {
            return;
        }
        if (this.L1 == null) {
            t0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.Q1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.R1 = textView;
        textView.setTextColor(-8026747);
        this.R1.setTextSize(1, 16.0f);
        this.R1.setText(hd.M0(this.o1 ? 2131744665 : 2131744493, null));
        TextView textView2 = new TextView(getContext());
        this.S1 = textView2;
        textView2.setTextColor(-1);
        this.S1.setTextSize(1, 12.0f);
        TextView textView3 = this.S1;
        int L = org.telegram.messenger.g0.L(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.S1.setGravity(17);
        na.a(this.S1);
        this.S1.setText(hd.M0(2131744492, null));
        this.S1.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        this.Q1.addView(imageView, ja.t(22, 22, 16, 12, 1, 4, 0));
        this.Q1.addView(this.R1, ja.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.Q1.addView(this.S1, ja.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.L1.addView(this.Q1, ja.d(-1, -1.0f, ns.E1, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.L2 != null) {
            return;
        }
        ub ubVar = new ub(getContext(), 1);
        this.L2 = ubVar;
        ubVar.setTextSize(1, 14.0f);
        this.L2.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.L2.setGravity(19);
        this.L2.setText(hd.M0(2131744491, null));
        addView(this.L2, ja.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.G1 != null) {
            return;
        }
        v2 v2Var = new v2(this, getContext(), 0);
        this.G1 = v2Var;
        v2Var.setClickable(true);
        addView(this.G1, ja.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        w2 w2Var = new w2(this, getContext());
        this.p2 = w2Var;
        w2Var.setOnClickListener(new v1(this, 0));
        this.G1.addView(this.p2, ja.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        u uVar = new u(0, getContext(), false);
        this.l2 = uVar;
        uVar.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        this.G1.addView(this.l2, ja.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.k2 = textView;
        textView.setTextSize(1, 14.0f);
        this.k2.setTextColor(-1);
        this.G1.addView(this.k2, ja.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.h1.s);
        w2 w2Var2 = this.p2;
        int L = org.telegram.messenger.g0.L(15.0f);
        int o4 = i0.a.o(-1, 120);
        w2Var2.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, o4, o4));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.O(i0.a.o(-1, 120), -org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f)));
    }
}
