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
import c8.na;
import c8.wa;
import di.pb;
import di.xb;
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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.os;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.messenger.xs;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.ee;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.z40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.d61;
import org.telegram.ui.fr0;
import org.telegram.ui.mx;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class z3 extends cu0 implements fs {
    public org.telegram.ui.Components.m6 A0;
    public s3 A1;
    public float A2;
    public int A3;
    public org.telegram.ui.Components.m6 B0;
    public boolean B1;
    public long B2;
    public final r1 B3;
    public org.telegram.ui.Components.c6 C0;
    public p6 C1;
    public boolean C2;
    public final ArrayList C3;
    public org.telegram.ui.Components.c6 D0;
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
    public t2 G1;
    public j30 G2;
    public final sa G3;
    public long H0;
    public a H1;
    public final fr0 H2;
    public final org.telegram.ui.Components.c6 H3;
    public boolean I0;
    public m1 I1;
    public boolean I2;
    public final org.telegram.ui.Components.c6 I3;
    public boolean J0;
    public n1 J1;
    public q2 J2;
    public final org.telegram.ui.Components.c6 J3;
    public boolean K0;
    public j1 K1;
    public FrameLayout K2;
    public float K3;
    public boolean L0;
    public i2 L1;
    public xb L2;
    public final Path L3;
    public final c3 M0;
    public lh.h M1;
    public boolean M2;
    public boolean M3;
    public final FrameLayout N0;
    public hi.u3 N1;
    public k2 N2;
    public ValueAnimator N3;
    public final s2 O0;
    public ValueAnimator O1;
    public float O2;
    public float O3;
    public final ImageReceiver P0;
    public xi0 P1;
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
    public final y2 T0;
    public d8 T1;
    public boolean T2;
    public final mx U0;
    public ViewPropertyAnimator U1;
    public boolean U2;
    public e4 V0;
    public final fh.g V1;
    public final ImageReceiver V2;
    public float W0;
    public final fh.g W1;
    public ch.d W2;
    public final org.telegram.ui.Components.a9 X0;
    public final Paint X1;
    public final ImageReceiver X2;
    public final v3 Y0;
    public int Y1;
    public org.telegram.ui.Components.o5 Y2;
    public final e8 Z0;
    public ValueAnimator Z1;
    public boolean Z2;
    public m6.n a1;
    public float a2;
    public boolean a3;
    public int b1;
    public float b2;
    public xi0 b3;
    public org.telegram.ui.ActionBar.y0 c1;
    public float c2;
    public boolean c3;
    public r3 d1;
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
    public final w3 h1;
    public boolean h2;
    public int h3;
    public final bi.v2 i0;
    public final bg.r0 i1;
    public int i2;
    public int i3;
    public final qh0 j0;
    public ArrayList j1;
    public final int j2;
    public r1 j3;
    public final ImageView k0;
    public int k1;
    public TextView k2;
    public float k3;
    public final org.telegram.ui.ActionBar.i6 l0;
    public long l1;
    public u l2;
    public boolean l3;
    public final k8 m0;
    public boolean m1;
    public int m2;
    public h6.m m3;
    public final t2 n0;
    public boolean n1;
    public int n2;
    public org.telegram.ui.ActionBar.y0 n3;
    public u6 o0;
    public boolean o1;
    public boolean o2;
    public org.telegram.ui.ActionBar.y0 o3;
    public hi.u3 p0;
    public boolean p1;
    public u2 p2;
    public final dh.c p3;
    public hi.u3 q0;
    public boolean q1;
    public boolean q2;
    public final ui.a q3;
    public hi.u3 r0;
    public long r1;
    public float r2;
    public final ui.f r3;
    public int s0;
    public final float s1;
    public n2 s2;
    public final gh.b s3;
    public final f9 t0;
    public int t1;
    public z40 t2;
    public TL_stories.TL_premium_boostsStatus t3;
    public final g3 u0;
    public boolean u1;
    public int u2;
    public org.telegram.messenger.g3 u3;
    public final a2 v0;
    public int v1;
    public boolean v2;
    public long v3;
    public final View w0;
    public int w1;
    public final y3 w2;
    public long w3;
    public final ImageView x0;
    public int x1;
    public final h2.f x2;
    public boolean x3;
    public final LinearLayout y0;
    public final x3 y1;
    public final org.telegram.ui.Components.c6 y2;
    public TLRPC.TL_channels_sendAsPeers y3;
    public final t2 z0;
    public final a8.b8 z1;
    public final org.telegram.ui.Components.c6 z2;
    public final r1 z3;

    public z3(Context context, final f9 f9Var, w3 w3Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null);
        this.L0 = true;
        this.R0 = new ArrayList();
        this.b1 = -5;
        this.s1 = 1.0f;
        x3 x3Var = new x3(this);
        this.y1 = x3Var;
        this.a2 = -1.0f;
        this.b2 = -1.0f;
        this.c2 = -1.0f;
        this.j2 = ConnectionsManager.generateClassGuid();
        this.y2 = new org.telegram.ui.Components.c6(this);
        this.z2 = new org.telegram.ui.Components.c6(this);
        fr0 fr0Var = new fr0();
        this.H2 = fr0Var;
        this.O2 = 1.0f;
        this.z3 = new r1(this, 4);
        this.B3 = new r1(this, 11);
        this.C3 = new ArrayList();
        this.D3 = new ArrayList();
        this.G3 = new sa(this, 24);
        this.H3 = new org.telegram.ui.Components.c6(this);
        this.I3 = new org.telegram.ui.Components.c6(this);
        this.J3 = new org.telegram.ui.Components.c6(this);
        this.L3 = new Path();
        fr0Var.E = new ob.c(this, 21);
        y3 y3Var = new y3();
        y3Var.g = new ArrayList();
        this.w2 = y3Var;
        this.x2 = new h2.f((int[]) null);
        this.f1 = new ArrayList();
        this.g1 = new ArrayList();
        final int i7 = 0;
        s2 s2Var = new s2(this, i7);
        this.O0 = s2Var;
        s2Var.B0 = false;
        s2Var.A1 = true;
        s2Var.y = true;
        s2Var.i0(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.V2 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
        imageReceiver.i0(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.X2 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.y = true;
        imageReceiver2.i0(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.P0 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.y = true;
        imageReceiver3.i0(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.Q0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.y = true;
        imageReceiver4.i0(0);
        s2Var.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.X0 = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.t0 = f9Var;
        this.h1 = w3Var;
        this.z1 = w3Var.g;
        this.C1 = mp.u1(i10.t0).R1();
        w3Var.l.setColor(-16777216);
        this.X1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.l0 = i6Var;
        setClipChildren(false);
        y2 y2Var = new y2(this, context, this.M0, i6Var, f9Var);
        this.T0 = y2Var;
        gh.b bVar = new gh.b(i6Var, org.telegram.ui.ActionBar.n6.Je, 0.8f);
        this.s3 = bVar;
        ui.c cVar = new ui.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !bz.e()) {
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
        c3 c3Var = new c3(this, context, w3Var, f9Var);
        this.M0 = c3Var;
        c3Var.setClipChildren(false);
        this.U0 = new mx(this.m2, c3Var);
        c3Var.addView(y2Var, na.c(-1.0f, -1));
        g3 g3Var = new g3(this, getContext(), f9Var.E, f9Var, i6Var);
        this.u0 = g3Var;
        g3Var.c0.setOnClickListener(new t1(this, 10));
        ImageView imageView = new ImageView(context);
        this.x0 = imageView;
        imageView.setImageDrawable(w3Var.m);
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new t1(this, 11));
        imageView.setContentDescription(gd.N0(2131745263, null));
        c8.sa.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(w3Var.n);
        imageView2.setPadding(L, L, L, L);
        t2 t2Var = new t2(this, getContext(), 1);
        this.z0 = t2Var;
        org.telegram.ui.Components.m6 m6Var = this.B0;
        if (m6Var != null) {
            m6Var.setCallback(t2Var);
        }
        t2Var.setWillNotDraw(false);
        t2Var.setOnClickListener(new t1(this, 12));
        t2 t2Var2 = new t2(this, getContext(), 2);
        this.n0 = t2Var2;
        org.telegram.ui.Components.m6 m6Var2 = this.A0;
        if (m6Var2 != null) {
            m6Var2.setCallback(t2Var2);
        }
        t2Var2.setWillNotDraw(false);
        t2Var2.setOnClickListener(new t1(this, 13));
        t2Var2.setOnLongClickListener(new z1(i7, this, f9Var));
        u6 u6Var = new u6(context, w3Var);
        this.o0 = u6Var;
        u6Var.setPadding(L, L, L, L);
        t2Var2.addView(this.o0, na.e(40, 40, 3));
        t2Var.addView(imageView2, na.e(40, 40, 3));
        c8.sa.b(t2Var2, 0.3f, 5.0f);
        c8.sa.b(t2Var, 0.3f, 5.0f);
        s2Var.A1 = true;
        s2Var.I0(c3Var);
        bg.r0 r0Var = new bg.r0(10);
        this.i1 = r0Var;
        c3Var.setOutlineProvider(r0Var);
        c3Var.setClipToOutline(true);
        addView(c3Var);
        v3 v3Var = new v3(context, x3Var);
        this.Y0 = v3Var;
        v3Var.setOnClickListener(new View.OnClickListener(this) { // from class: fi.p1
            public final /* synthetic */ z3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i7;
                f9 f9Var2 = f9Var;
                z3 z3Var = this.b;
                switch (i10) {
                    case 0:
                        long j3 = i10.i(z3Var.m2).n;
                        long j10 = z3Var.l1;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                f9Var2.N(bn.ua(j10));
                                break;
                            } else {
                                f9Var2.N(ProfileActivity.D4(j10));
                                break;
                            }
                        } else {
                            Bundle f10 = p5.c.f(1, TeXSymbolParser.TYPE_ATTR);
                            f10.putLong("dialog_id", z3Var.l1);
                            f9Var2.N(new h90(f10, null));
                            break;
                        }
                    default:
                        if (!z3Var.y1.j()) {
                            z3Var.a1(true);
                            break;
                        } else {
                            f9Var2.U();
                            if (!f9.D1) {
                                mp.g1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            z3Var.i0.setContentDescription(gd.N0(!f9.D1 ? 2131748121 : 2131743602, null));
                            break;
                        }
                }
            }
        });
        c3Var.addView(v3Var, na.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(imageView, na.r(40, 40, 5));
        linearLayout.addView(t2Var, na.r(40, 40, 5));
        linearLayout.addView(t2Var2, na.r(40, 40, 5));
        addView(linearLayout, na.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.g0 = imageView3;
        imageView3.setImageDrawable(w3Var.q);
        imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.n6.h0(-1, 1, -1));
        imageView3.setContentDescription(gd.N0(2131754838, null));
        c3Var.addView(imageView3, na.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.h0 = imageView4;
        imageView4.setImageDrawable(w3Var.r);
        imageView4.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.n6.h0(-1, 1, -1));
        imageView4.setContentDescription(gd.N0(2131754807, null));
        c3Var.addView(imageView4, na.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.d(f9Var, 22));
        imageView3.setOnClickListener(new d0(this, i6Var, f9Var, context, w3Var, 1));
        bi.v2 v2Var = new bi.v2(context, 2);
        this.i0 = v2Var;
        c3Var.addView(v2Var, na.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        qh0 qh0Var = new qh0(context);
        this.j0 = qh0Var;
        qh0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        v2Var.addView(qh0Var);
        ImageView imageView5 = new ImageView(context);
        this.k0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        imageView5.setImageDrawable(w3Var.t);
        v2Var.addView(imageView5);
        imageView5.setVisibility(8);
        k8 k8Var = new k8(context);
        this.m0 = k8Var;
        k8Var.setOnClickListener(new t1(this, 2));
        c3Var.addView(k8Var, na.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i10 = 1;
        v2Var.setOnClickListener(new View.OnClickListener(this) { // from class: fi.p1
            public final /* synthetic */ z3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i10;
                f9 f9Var2 = f9Var;
                z3 z3Var = this.b;
                switch (i102) {
                    case 0:
                        long j3 = i10.i(z3Var.m2).n;
                        long j10 = z3Var.l1;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                f9Var2.N(bn.ua(j10));
                                break;
                            } else {
                                f9Var2.N(ProfileActivity.D4(j10));
                                break;
                            }
                        } else {
                            Bundle f10 = p5.c.f(1, TeXSymbolParser.TYPE_ATTR);
                            f10.putLong("dialog_id", z3Var.l1);
                            f9Var2.N(new h90(f10, null));
                            break;
                        }
                    default:
                        if (!z3Var.y1.j()) {
                            z3Var.a1(true);
                            break;
                        } else {
                            f9Var2.U();
                            if (!f9.D1) {
                                mp.g1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            z3Var.i0.setContentDescription(gd.N0(!f9.D1 ? 2131748121 : 2131743602, null));
                            break;
                        }
                }
            }
        });
        this.Z0 = new e8(this, w3Var);
        c3Var.addView(g3Var, na.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        a2 a2Var = new a2(this, context, f9Var, f9Var.w, view, frameLayout, f9Var);
        this.v0 = a2Var;
        c3Var.addView(view, na.e(-1, ks.e3, 87));
        c3Var.addView(a2Var, na.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        c3Var.addView(frameLayout, na.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        v2Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, o4, o4));
        int L3 = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, o10, o10));
        int L4 = org.telegram.messenger.g0.L(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.n6.k0(L4, L4, L4, L4, 0, o11, o11));
        int L5 = org.telegram.messenger.g0.L(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.k0(L5, L5, L5, L5, 0, o12, o12));
        int L6 = org.telegram.messenger.g0.L(20.0f);
        int o13 = i0.a.o(-1, 100);
        t2Var2.setBackground(org.telegram.ui.ActionBar.n6.k0(L6, L6, L6, L6, 0, o13, o13));
        int L7 = org.telegram.messenger.g0.L(20.0f);
        int o14 = i0.a.o(-1, 100);
        t2Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L7, L7, L7, L7, 0, o14, o14));
        s9 s9Var = g3Var.a0;
        View n10 = s9Var.n(context);
        if (n10 != null) {
            org.telegram.messenger.g0.E2(n10);
            addView(n10);
        }
        s9Var.D = new b2(this, 0);
        s9Var.S(this);
    }

    public static void T0(o6 o6Var, ImageReceiver imageReceiver, String str) {
        if (o6Var.s) {
            imageReceiver.v0(null, null, fc.g(o6Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.s0(fc.g(o6Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(z3 z3Var, ValueAnimator valueAnimator) {
        k8 k8Var = z3Var.m0;
        z3Var.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v3 v3Var = z3Var.Y0;
        v3Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var.O3);
        v3Var.setAlpha(1.0f - z3Var.O3);
        ImageView imageView = z3Var.g0;
        imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var.O3);
        imageView.setAlpha(1.0f - z3Var.O3);
        ImageView imageView2 = z3Var.h0;
        imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var.O3);
        imageView2.setAlpha(1.0f - z3Var.O3);
        bi.v2 v2Var = z3Var.i0;
        v2Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var.O3);
        v2Var.setAlpha((1.0f - z3Var.O3) * z3Var.O2);
        t2 t2Var = z3Var.G1;
        if (t2Var != null) {
            t2Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * z3Var.O3);
            z3Var.G1.setAlpha(1.0f - z3Var.O3);
        }
        if (k8Var != null) {
            k8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var.O3);
            k8Var.setAlpha(1.0f - z3Var.O3);
        }
        z3Var.u0.setAlpha(1.0f - z3Var.O3);
        s3 s3Var = z3Var.A1;
        float f10 = s3Var == null ? 0.0f : ((w8) s3Var).d.W;
        float hideInterfaceAlpha = z3Var.getHideInterfaceAlpha();
        t2 t2Var2 = z3Var.n0;
        if (t2Var2 != null) {
            t2Var2.setAlpha((1.0f - z3Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = z3Var.x0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - z3Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        t2 t2Var3 = z3Var.z0;
        if (t2Var3 != null) {
            t2Var3.setAlpha((1.0f - z3Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        i2 i2Var = z3Var.L1;
        if (i2Var != null) {
            i2Var.setAlpha(1.0f - z3Var.O3);
            z3Var.invalidate();
        }
        z3Var.M0.invalidate();
    }

    public static void Y(z3 z3Var, boolean z10) {
        org.telegram.ui.ActionBar.y0 y0Var = z3Var.n3;
        if (y0Var == null || z3Var.m3 == null || y0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(f9.B1 - 0.2f) < 0.05f) {
                z3Var.n3.setSubtext(gd.N0(2131743324, null));
            } else if (Math.abs(f9.B1 - 0.5f) < 0.05f) {
                z3Var.n3.setSubtext(gd.N0(2131743326, null));
            } else if (Math.abs(f9.B1 - 1.0f) < 0.05f) {
                z3Var.n3.setSubtext(gd.N0(2131743327, null));
            } else if (Math.abs(f9.B1 - 1.5f) < 0.05f) {
                z3Var.n3.setSubtext(gd.N0(2131743328, null));
            } else if (Math.abs(f9.B1 - 2.0f) < 0.05f) {
                z3Var.n3.setSubtext(gd.N0(2131743325, null));
            } else {
                z3Var.n3.setSubtext(gd.a0(null, null, 2131743329, ou0.a(f9.B1) + "x"));
            }
        }
        z3Var.m3.K(z10, f9.B1);
    }

    public static void Z(z3 z3Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (z3Var.G0() || z3Var.y1.f) {
            return;
        }
        if (i10.i(z3Var.m2).q()) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, gd.N0(2131744646, null), false, z3Var.l0).setOnClickListener(new t1(z3Var, 8));
            return;
        }
        Drawable drawable = z3Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        c2 c2Var = new c2(z3Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, gd.N0(2131744646, null), false, z3Var.l0);
        c10.setOnClickListener(new t1(z3Var, 9));
        c10.setIcon(c2Var);
    }

    public static void b0(z3 z3Var) {
        x3 x3Var = z3Var.y1;
        TL_stories.StoryItem storyItem = x3Var.a;
        if ((storyItem == null && x3Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = x3Var.h();
        boolean z10 = x3Var.e;
        if (h == null || !h.exists()) {
            z3Var.Y0();
            return;
        }
        MediaController.d0(h.toString(), z3Var.getContext(), z10 ? 1 : 0, null, null, new ai.o2(2, z3Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c0(z3 z3Var, long j3) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j3 > 0) {
            TLRPC.User c22 = mp.u1(z3Var.m2).c2(Long.valueOf(j3));
            str = c22.first_name;
            z10 = c22.stories_hidden;
            chat = c22;
        } else {
            TLRPC.Chat O0 = mp.u1(z3Var.m2).O0(Long.valueOf(-j3));
            str = O0.title;
            z10 = O0.stories_hidden;
            chat = O0;
        }
        org.telegram.messenger.g0.h3(new di.m(z3Var, mp.u1(z3Var.m2), j3, !z10, str, chat), 200L);
    }

    public static void d0(z3 z3Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, z3Var.getContext(), z3Var.l0);
        String N0 = gd.N0(z3Var.G0() ? 2131751552 : 2131751475, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = gd.N0(z3Var.G0() ? 2131751553 : 2131751476, null);
        alertDialog$Builder.k(gd.N0(2131751586, null), new o1(z3Var, 2));
        alertDialog$Builder.h(gd.N0(2131752577, null), new ci.v(27));
        ((w8) z3Var.A1).h(t1Var);
        t1Var.i();
    }

    public static void f0(z3 z3Var) {
        org.telegram.ui.ActionBar.i6 i6Var = z3Var.l0;
        c3 c3Var = z3Var.M0;
        if (z3Var.q1) {
            return;
        }
        int i7 = 0;
        if (!z3Var.o1) {
            i2 i2Var = z3Var.L1;
            int i10 = -z3Var.b1;
            z3Var.b1 = i10;
            org.telegram.messenger.g0.E3(i10, i2Var, null);
            org.telegram.messenger.q2.E.a();
            String q10 = z3Var.l1 >= 0 ? n10.q(mp.u1(z3Var.m2).c2(Long.valueOf(z3Var.l1))) : "";
            (mp.u1(z3Var.m2).K3() ? new kc(c3Var, i6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743511, q10))) : new kc(c3Var, i6Var).K(R.raw.star_premium_2, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743511, q10)), gd.N0(2131743512, null), new r1(z3Var, 5))).j();
            return;
        }
        if (z3Var.t3 != null && z3Var.u3 != null) {
            ug.k0.x1(new bi.e9(z3Var, 2), z3Var.t3, z3Var.u3, z3Var.l1, true);
            return;
        }
        f9 f9Var = z3Var.t0;
        if (f9Var != null) {
            f9Var.k1 = true;
            f9Var.V();
        }
        mp.u1(z3Var.m2).I0().a(z3Var.l1, new u1(z3Var, i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.m2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f10 = 1.0f - this.y2.c;
        j5 j5Var = this.t0.x;
        return (1.0f - (j5Var == null ? 0.0f : j5Var.f)) * f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        f9 f9Var;
        if (!this.y1.f || (f9Var = this.t0) == null || f9Var.B0 == null || B0(true)) {
            return 0L;
        }
        return f9Var.B0.j();
    }

    public static void h0(z3 z3Var) {
        x3 x3Var = z3Var.y1;
        if (x3Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = x3Var.a.id;
        tL_stories_exportStoryLink.peer = mp.u1(z3Var.m2).l1(z3Var.l1);
        ConnectionsManager.getInstance(z3Var.m2).sendRequest(tL_stories_exportStoryLink, new r2());
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
        textView.setText(gd.N0(2131744209, null));
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.l0;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        TextView textView2 = new TextView(getContext());
        c8.sa.a(textView2);
        textView2.setText(gd.N0(2131754227, null));
        int i10 = org.telegram.ui.ActionBar.n6.Ji;
        org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView2, k02, M, g10, i6Var);
        textView2.setOnClickListener(new t1(this, 3));
        linearLayout.addView(textView, na.o(-1, -2));
        linearLayout.addView(textView2, na.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, na.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.M0.addView(frameLayout);
        this.K2 = frameLayout;
    }

    public final boolean B0(boolean z10) {
        c1 c1Var;
        TLRPC.Peer i7;
        c1 c1Var2;
        long e10 = i10.i(this.m2).e();
        long j3 = this.l1;
        f9 f9Var = this.t0;
        if (j3 >= 0 || (c1Var2 = f9Var.B0) == null) {
            if (j3 < 0 || f9Var == null || (c1Var = f9Var.B0) == null || !c1Var.l()) {
                return false;
            }
            return !z10 || (i7 = f9Var.B0.i()) == null || this.l1 == org.telegram.messenger.n5.o(i7) || org.telegram.messenger.n5.o(i7) == e10 || this.l1 == e10;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i10 = c1Var2.i();
        TLRPC.Chat O0 = mp.u1(this.m2).O0(Long.valueOf(-this.l1));
        if (f9Var.B0.l() || org.telegram.messenger.v3.w(14, O0)) {
            return i10 == null || this.l1 == org.telegram.messenger.n5.o(i10) || org.telegram.messenger.n5.o(i10) == i10.i(this.m2).e();
        }
        return false;
    }

    public final void C0(Canvas canvas, int i7, int i10) {
        TextureView textureView;
        y3 y3Var = this.w2;
        org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) y3Var.e;
        if (j4Var != null && ((SurfaceView) y3Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.g0.z0((SurfaceView) y3Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (j4Var != null && (textureView = (TextureView) y3Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i7, i10);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        c3 c3Var = this.M0;
        canvas.scale(i7 / c3Var.getMeasuredWidth(), i10 / c3Var.getMeasuredHeight());
        this.O0.h(canvas, null);
        canvas.restore();
    }

    public final void D0(hi.i9 i9Var, TL_stories.StoryItem storyItem) {
        s3 s3Var = this.A1;
        hi.k9 k9Var = new hi.k9(storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, getContext(), this.l0);
        k9Var.X0(i9Var);
        hi.q1 q1Var = k9Var.m1;
        if (q1Var != null) {
            for (View view : q1Var.getViewPages()) {
                if (view instanceof hi.f9) {
                    ((hi.f9) view).f(false);
                }
            }
        }
        k9Var.R0(true);
        k9Var.O1 = new ab.g(15, this, storyItem);
        ((w8) s3Var).h(k9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0196, code lost:
    
        if (r3 == r10.P1) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(ViewGroup viewGroup, float f10, float f11, boolean z10) {
        hi.u3 u3Var;
        y3 y3Var;
        if (viewGroup != null) {
            hi.u3 u3Var2 = this.p0;
            if ((u3Var2 == null || !u3Var2.W) && ((u3Var = this.q0) == null || !u3Var.W)) {
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        g3 g3Var = this.u0;
                        if (childAt == g3Var) {
                            Rect rect = org.telegram.messenger.g0.Q;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f10, (int) f11)) {
                                float top = f11 - childAt.getTop();
                                w7 w7Var = g3Var.c0;
                                if (w7Var.x == 1.0f && !g3Var.t0) {
                                    if (top > w7Var.getTranslationY() + (g3Var.s0.getTop() - g3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        childAt.getHitRect(rect2);
                        if (childAt == this.M0 && (y3Var = this.w2) != null) {
                            org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) y3Var.e;
                            if (com.google.android.gms.internal.vision.e2.s(j4Var) && E0(j4Var, f10 - childAt.getX(), f11 - childAt.getY(), z10)) {
                            }
                        }
                        if (!childAt.isClickable() || !rect2.contains((int) f10, (int) f11)) {
                            y2 y2Var = this.T0;
                            if (childAt == y2Var && y2Var.b == null && (f10 < org.telegram.messenger.g0.L(60.0f) || f10 > viewGroup.getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f))) {
                                Matrix matrix = y2Var.e;
                                float[] fArr = y2Var.f;
                                for (int i10 = 0; i10 < y2Var.getChildCount(); i10++) {
                                    View childAt2 = y2Var.getChildAt(i10);
                                    if (childAt2 != y2Var.d && (childAt2 instanceof m8)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f10;
                                        fArr[1] = f11;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                a2 a2Var = this.v0;
                                if (childAt == a2Var) {
                                    d61 d61Var = a2Var.f;
                                    di.b1 b1Var = a2Var.c;
                                    d61 d61Var2 = a2Var.f;
                                    d61Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f10 - a2Var.getX()) - d61Var2.getX()), (int) ((f11 - a2Var.getY()) - d61Var2.getY()))) {
                                        if (a2Var.g0) {
                                            continue;
                                        } else if (!this.f2) {
                                            if (f11 <= a2Var.s() + a2Var.getY() && b1Var.E(f10, (f11 - a2Var.getY()) - b1Var.getY()) == null) {
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
                                            i2 i2Var = this.L1;
                                            if (i2Var != null && childAt == i2Var.getRecordCircle()) {
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
        c3 c3Var = this.M0;
        float x11 = view.getX() + c3Var.getX() + x10;
        float y10 = view.getY() + c3Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + ((float) view.getHeight());
    }

    public final boolean G0() {
        h6 h6Var;
        f9 f9Var = this.t0;
        return (f9Var == null || (h6Var = f9Var.O0) == null || h6Var.e != 4) ? false : true;
    }

    public final boolean H0() {
        TLRPC.User c22;
        return G0() && (c22 = mp.u1(this.m2).c2(Long.valueOf(this.t0.O0.d))) != null && c22.bot && c22.bot_can_edit;
    }

    public abstract boolean I0();

    public final void J0(ch.p0 p0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        x3 x3Var = this.y1;
        TL_stories.StoryItem storyItem = x3Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && p0Var == null) {
            j0();
            this.C1.j0(this.l1, x3Var.a, null);
        } else if (p0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(this.m2).r.get("❤");
            if (tL_availableReaction != null) {
                this.Z2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a10 = ch.l0.a();
                fc b10 = fc.b(document);
                ImageReceiver imageReceiver = this.V2;
                imageReceiver.r0(b10, a10, null, null, null, 0);
                if (imageReceiver.C() != null) {
                    imageReceiver.C().N(0, false, true);
                }
                this.a3 = true;
                this.C1.j0(this.l1, x3Var.a, ch.p0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.C1.j0(this.l1, x3Var.a, p0Var);
        }
        TL_stories.StoryItem storyItem2 = x3Var.a;
        t2 t2Var = this.n0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.o0.setReaction(null);
            t2Var.setContentDescription(gd.N0(2131754850, null));
            z10 = false;
        } else {
            z11 = !z11;
            this.o0.setReaction(ch.p0.d(reaction));
            t2Var.setContentDescription(gd.N0(2131754849, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.n1 && z11) {
            TL_stories.StoryItem storyItem3 = x3Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = x3Var.a.views;
            int i7 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i7;
            if (i7 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = x3Var.a;
        ch.s0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        c1 c1Var;
        if (this.y3 != null) {
            return;
        }
        f9 f9Var = this.t0;
        if (f9Var != null && (c1Var = f9Var.B0) != null) {
            if (c1Var.w == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers O1 = mp.u1(this.m2).O1(this.l1, true);
        this.y3 = O1;
        i2 i2Var = this.L1;
        if (i2Var == null || O1 == null) {
            return;
        }
        i2Var.z2(true);
    }

    public final boolean L0() {
        i2 i2Var = this.L1;
        if (i2Var == null) {
            return false;
        }
        boolean z10 = i2Var.p3;
        if (z10) {
            i2Var.Y1();
        }
        org.telegram.messenger.g0.h3(new r1(this, 3), 300L);
        return z10;
    }

    public final void M0() {
        CharSequence charSequence;
        long j3;
        u1 u1Var;
        int i7;
        long j10;
        mp.g1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.L1.getTextWithEntities();
        long e10 = i10.i(this.m2).e();
        TLRPC.Peer i10 = this.t0.B0.i();
        if (i10 != null) {
            e10 = org.telegram.messenger.n5.o(i10);
        }
        Context context = getContext();
        int i11 = this.m2;
        String s5 = org.telegram.messenger.n5.s(i11, this.l1);
        long messageMinPrice = getMessageMinPrice();
        long j11 = this.v3;
        u1 u1Var2 = new u1(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, (org.telegram.ui.ActionBar.i6) bVar, false);
        w2Var.O();
        w2Var.w0 = false;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        w2Var.O = g10;
        int[] iArr = mp.u1(i11).a7;
        CharSequence j02 = fj.j0(textWithEntities, false, false, new TextPaint());
        if (j02 instanceof Spannable) {
            Spannable spannable = (Spannable) j02;
            charSequence = j02;
            j3 = j11;
            u1Var = u1Var2;
            i7 = ((org.telegram.ui.Components.x5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.x5.class)).length + ((org.telegram.messenger.g6[]) spannable.getSpans(0, charSequence.length(), org.telegram.messenger.g6.class)).length;
        } else {
            charSequence = j02;
            j3 = j11;
            u1Var = u1Var2;
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
        hi.e eVar = new hi.e(context, null, true);
        r0 r0Var = new r0();
        r0Var.c = e10;
        r0Var.f = textWithEntities;
        r0Var.g = jArr[0];
        m0 m0Var = new m0(i11, context, true);
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
        bi.g3 g3Var = new bi.g3(context, gd.N0(2131748621, null), bVar);
        g11.addView(g3Var, na.q(-1, -1, 1.0f, ks.x1, 0, 0, 5, 0));
        bi.g3 g3Var2 = new bi.g3(context, gd.N0(2131748622, null), bVar);
        g11.addView(g3Var2, na.q(-1, -1, 1.0f, ks.x1, 5, 0, 5, 0));
        bi.g3 g3Var3 = new bi.g3(context, gd.N0(2131748623, null), bVar);
        g11.addView(g3Var3, na.q(-1, -1, 1.0f, ks.x1, 5, 0, 0, 0));
        s sVar = new s(context, bVar, r1);
        u1 u1Var3 = u1Var;
        long j12 = j10;
        w10[] w10VarArr = {new r(jArr, eVar, new kq[1], r0Var, m0Var, i11, g3Var, g3Var2, g3Var3, sVar, new boolean[]{true})};
        m0Var.set(r0Var);
        int i15 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i16 = mp.u1(i11).b7;
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
        g10.addView(sVar, na.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        w10VarArr[0].a(Integer.valueOf((int) jArr[0]));
        g10.addView(g11, na.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.n6.j5;
        TextView b10 = wa.b(context, 20.0f, i20, true, bVar);
        org.telegram.messenger.f3.k(b10, 17, null, 2131748618);
        g10.addView(b10, na.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = wa.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.f3.q(null, null, 2131748619, new Object[]{s5}, b11);
        g10.addView(b11, na.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        g10.addView(m0Var, na.t(-2, -2, 17, 42, 22, 42, 20));
        g10.addView(eVar, na.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        w2Var.show();
        eVar.setOnClickListener(new ah.h(u1Var3, jArr, w2Var, 9));
    }

    public final void N0() {
        if (this.L1 == null) {
            return;
        }
        r0();
        this.s2.e2.i0();
        this.s2.z1(-1, true);
        n2 n2Var = this.s2;
        n2Var.U1 = this.l1;
        n2Var.f1();
        this.s2.b1().setText(this.L1.getFieldText());
        ((w8) this.A1).h(this.s2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j3 = this.l1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog U0 = mp.u1(this.m2).U0(this.l1);
        if (U0 != null) {
            bundle.putInt("message_id", U0.top_message);
        }
        this.t0.N(new bn(bundle));
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
        c1 c1Var;
        wi.n nVar;
        wi.n nVar2;
        if (!this.u1) {
            this.w2.e = null;
            return;
        }
        x3 x3Var = this.y1;
        if (!x3Var.f) {
            if (!x3Var.e) {
                org.telegram.messenger.a8.b("PeerStoriesView.requestVideoPlayer(" + j3 + "): null, not a video");
                ((w8) this.A1).c(null, null, 0L, this.w2);
                y3 y3Var = this.w2;
                y3Var.e = null;
                y3Var.a = false;
                return;
            }
            if (x3Var.f() == null || !new File(this.y1.f()).exists()) {
                TL_stories.StoryItem storyItem = this.y1.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.l1;
                    try {
                        document2 = p6.C(this.m2, storyItem);
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
                            this.B2 = (long) (fj.H0(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((w8) this.A1).c(document, uri, j3, this.w2);
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
            ((w8) this.A1).c(document, uri, j3, this.w2);
            this.M0.invalidate();
            return;
        }
        s3 s3Var = this.A1;
        TL_stories.StoryItem storyItem3 = x3Var.a;
        long j10 = this.l1;
        int i7 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z10 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        y3 y3Var2 = this.w2;
        w8 w8Var = (w8) s3Var;
        w8Var.i(true, true);
        c1 c1Var2 = w8Var.d.B0;
        if (c1Var2 == null || c1Var2.b != j10 || !c1Var2.f(inputGroupCall)) {
            hi.z3 z3Var = w8Var.d.E0;
            if (z3Var != null) {
                z3Var.b(j10, null);
                hi.z3 z3Var2 = w8Var.d.E0;
                SurfaceViewRenderer surfaceViewRenderer = z3Var2.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = z3Var2.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                z3Var2.r = false;
                z3Var2.c(false, false);
            }
            e1 e1Var = e1.w;
            if (e1Var == null || e1Var.b == null || (nVar2 = e1Var.a) == null || !nVar2.e() || !e1Var.b.f(inputGroupCall)) {
                c1Var = null;
            } else {
                c1Var = e1Var.b;
                if (e1Var.a != null) {
                    org.telegram.ui.Components.voip.u0 u0Var = e1Var.e;
                    e1Var.e = null;
                    e1Var.d.a = null;
                    e1Var.a.a(new ai.d0(u0Var, 16));
                }
            }
            c1 c1Var3 = w8Var.d.B0;
            if (c1Var3 != null && c1Var3 != c1Var) {
                if (c1Var3.n || e1.a(c1Var3)) {
                    if (c1Var == null) {
                        f9 f9Var = w8Var.d;
                    }
                    w8Var.d.B0.s(null);
                } else {
                    w8Var.d.B0.e();
                }
                w8Var.d.B0 = null;
            }
            if (c1Var != null) {
                w8Var.d.B0 = c1Var;
            }
            e1 e1Var2 = e1.w;
            if (e1Var2 != null && (nVar = e1Var2.a) != null && nVar.e()) {
                e1Var2.a.b();
            }
            e9 e9Var = w8Var.d.A0;
            if (e9Var != null) {
                e9Var.release(null);
                w8Var.d.A0 = null;
            }
            y3 y3Var3 = w8Var.d.G0;
            if (y3Var3 != null) {
                y3Var3.c = null;
                y3Var3.b = null;
                y3Var3.a = false;
                y3Var3.e = null;
                y3Var3.f = null;
                y3Var3.d = null;
                y3Var3.b();
                w8Var.d.G0 = null;
            }
            if (w8Var.d.B0 == null) {
                c1 c1Var4 = c1.X;
                if (c1Var4 == null || !c1Var4.f(inputGroupCall)) {
                    f9 f9Var2 = w8Var.d;
                    f9Var2.B0 = new c1(w8Var.c, f9Var2.h, storyItem3, j10, i7, z10, inputGroupCall, false, false);
                } else {
                    w8Var.d.B0 = c1.X;
                }
            }
            f9 f9Var3 = w8Var.d;
            f9Var3.B0.s(f9Var3.E0.getSink());
            f9 f9Var4 = w8Var.d;
            c1 c1Var5 = f9Var4.B0;
            if (e1.w == null) {
                e1.w = new e1();
            }
            e1 e1Var3 = e1.w;
            wi.n nVar3 = e1Var3.a;
            if (nVar3 != null && nVar3.d()) {
                wi.n nVar4 = e1Var3.a;
                if (nVar4.c != 0) {
                    if (e1Var3.b != c1Var5) {
                        nVar4.b();
                    }
                    f9 f9Var5 = w8Var.d;
                    f9Var5.G0 = y3Var2;
                    y3Var2.a = false;
                    y3Var2.e = f9Var5.z0;
                    hi.z3 z3Var3 = f9Var5.E0;
                    y3Var2.f = z3Var3.d;
                    y3Var2.d = z3Var3.c;
                    y3Var2.b = f9Var5.B0;
                    z3Var3.b(j10, y3Var2);
                    w8Var.d.G0.b();
                }
            }
            e1Var3.c = f9Var4;
            e1Var3.b = c1Var5;
            wi.n nVar5 = e1Var3.a;
            if (nVar5 == null || !nVar5.d()) {
                e1Var3.a = l2.j.d().j(e1Var3);
            }
            f2.a aVar = e1Var3.n;
            LaunchActivity launchActivity = LaunchActivity.H1;
            LaunchActivity launchActivity2 = e1Var3.r;
            if (launchActivity2 != launchActivity) {
                if (launchActivity2 != null) {
                    launchActivity2.a1.remove(aVar);
                }
                e1Var3.r = launchActivity;
                if (launchActivity != null) {
                    launchActivity.a1.add(aVar);
                }
            }
            e1Var3.a.c();
            f9 f9Var52 = w8Var.d;
            f9Var52.G0 = y3Var2;
            y3Var2.a = false;
            y3Var2.e = f9Var52.z0;
            hi.z3 z3Var32 = f9Var52.E0;
            y3Var2.f = z3Var32.d;
            y3Var2.d = z3Var32.c;
            y3Var2.b = f9Var52.B0;
            z3Var32.b(j10, y3Var2);
            w8Var.d.G0.b();
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
            if (org.telegram.messenger.s2.b) {
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
                zy.T(getAccountInstance(), str2, str, null, null, null, this.l1, null, null, storyItem, null, true, null, null);
                return;
            } else {
                zy.T(getAccountInstance(), null, null, parse, null, null, this.l1, null, null, storyItem, null, true, null, null);
                return;
            }
        }
        parse = uri;
        String T02 = org.telegram.messenger.g0.T0(parse);
        if (org.telegram.messenger.s2.b) {
        }
        if (z10) {
        }
    }

    public final void R0(long j3, boolean z10) {
        if (this.u1 != z10) {
            this.u1 = z10;
            qh0 qh0Var = this.j0;
            if (z10) {
                if (this.t0.a && Build.VERSION.SDK_INT < 33) {
                    f9 f9Var = ((w8) this.A1).d;
                    f9Var.l1 = true;
                    f9Var.V();
                    sa saVar = this.G3;
                    org.telegram.messenger.g0.r(saVar);
                    org.telegram.messenger.g0.h3(saVar, 100L);
                }
                P0(j3);
                e1();
                qh0Var.setAnimation(this.h1.u);
                this.u1 = true;
                this.Y0.a.getImageReceiver().P0(true, true);
                x3 x3Var = this.y1;
                if (x3Var.a != null) {
                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + x3Var.a.id + " " + x3.c(x3Var));
                }
            } else {
                n0();
                qh0Var.a();
                this.V0 = null;
                this.v2 = false;
                this.y2.e(true, 0.0f);
                this.M0.invalidate();
                invalidate();
                o0();
                f9 f9Var2 = ((w8) this.A1).d;
                f9Var2.I0 = false;
                f9Var2.V();
            }
            this.O0.i0(this.u1 ? 3 : 2);
            this.P0.i0(this.u1 ? 2 : 0);
            this.Q0.i0(this.u1 ? 2 : 0);
            if (this.m1 || this.n1) {
                p6 p6Var = this.C1;
                long j10 = this.l1;
                boolean z11 = this.u1;
                a0.h hVar = p6Var.m;
                o9 o9Var = (o9) hVar.f(j10);
                if (o9Var == null) {
                    o9Var = new o9(p6Var.a, j10, p6Var);
                    hVar.k(o9Var, j10);
                }
                o9Var.b(z11);
            }
        }
    }

    public final void S0(int i7, long j3) {
        if (this.l1 != j3) {
            x3 x3Var = this.y1;
            x3Var.b = null;
            x3Var.a = null;
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
        p6 p6Var = this.C1;
        TL_stories.PeerStories y10 = p6Var.y(j3);
        if (y10 == null) {
            y10 = p6Var.z(j3);
        } else {
            z10 = false;
        }
        p6Var.V(y10, z10);
    }

    public final void U0(long j3, boolean z10, boolean z11) {
        if (!z10 && j3 == this.w3 && this.x3 == z11) {
            return;
        }
        this.w3 = j3;
        this.x3 = z11;
        v3 v3Var = this.Y0;
        if (j3 < 0) {
            TLRPC.Chat O0 = mp.u1(this.m2).O0(Long.valueOf(-j3));
            u3 u3Var = v3Var.b;
            u3 u3Var2 = v3Var.b;
            u3Var.l(org.telegram.messenger.g0.D2(O0 == null ? "" : O0.title), false);
            if (O0 == null || !O0.verified) {
                u3Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(ks.e4);
            lq lqVar = new lq(mutate, null);
            lqVar.x = true;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            lqVar.h = L;
            lqVar.n = L2;
            u3Var2.i(lqVar);
            return;
        }
        if (this.m1 && !z11) {
            v3Var.b.l(gd.N0(2131745445, null), false);
            v3Var.b.i(null);
            return;
        }
        TLRPC.User c22 = mp.u1(this.m2).c2(Long.valueOf(j3));
        if (c22 == null || !c22.verified) {
            v3Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(ks.e4);
            lq lqVar2 = new lq(mutate2, null);
            lqVar2.x = true;
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            lqVar2.h = L3;
            lqVar2.n = L4;
            v3Var.b.i(lqVar2);
        }
        if (c22 != null) {
            v3Var.b.l(org.telegram.messenger.j6.m(org.telegram.messenger.g0.D2(org.telegram.messenger.i5.p(c22)), v3Var.b.getPaint().getFontMetricsInt(), false, null, 0), false);
        } else {
            v3Var.b.l(null, false);
        }
    }

    public final void V0(float f10, float f11, e4 e4Var) {
        this.W0 = f10;
        this.k3 = 1.0f / f11;
        if (this.V0 == e4Var) {
            return;
        }
        this.V0 = e4Var;
        if (e4Var != null) {
            ImageReceiver imageReceiver = e4Var.a;
            if (imageReceiver.n() != null) {
                Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                s2 s2Var = this.O0;
                s2Var.d0 = null;
                s2Var.a1.setShader(null);
                s2Var.O0(new BitmapDrawable(copy));
            }
        }
    }

    public final void W0(boolean z10) {
        x3 x3Var = this.y1;
        if (x3Var.a != null) {
            f9 f9Var = this.t0;
            if (f9Var.f != null) {
                String e10 = x3Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e10);
                    LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, gd.N0(2131744605, null)), 500);
                    return;
                }
                q2 q2Var = new q2(this, f9Var.f.getContext(), e10, e10, mp.u1(this.m2).i5() && (!(this.n1 || n10.B(this.l1)) || org.telegram.messenger.v3.t0(this.n1 ? mp.u1(this.m2).O0(Long.valueOf(-this.l1)) : null)), new g2(2, this.l0));
                this.J2 = q2Var;
                q2Var.e2 = true;
                TL_stories.StoryItem storyItem = x3Var.a;
                storyItem.dialogId = this.l1;
                q2Var.B2 = storyItem;
                q2Var.o2 = new cb.c(this, 23);
                ((w8) this.A1).h(q2Var);
            }
        }
    }

    public final void X0() {
        c3 c3Var = this.M0;
        org.telegram.ui.ActionBar.i6 i6Var = this.l0;
        org.telegram.messenger.f3.o(null, 2131743586, new kc(c3Var, i6Var), i6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.l0);
        String N0 = gd.N0(R.string.AppName, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        alertDialog$Builder.k(gd.N0(2131747637, null), null);
        t1Var.U = gd.N0(2131747024, null);
        ((w8) this.A1).h(t1Var);
    }

    public final void Z0(boolean z10) {
        if (this.c3 != z10) {
            x3 x3Var = this.y1;
            if (x3Var.a == null) {
                return;
            }
            this.c3 = z10;
            int i7 = 0;
            if (z10) {
                this.b3.setVisibility(0);
            }
            this.b3.setStoryItem(x3Var.a);
            f9 f9Var = ((w8) this.A1).d;
            f9Var.p1 = z10;
            f9Var.V();
            if (!z10) {
                if (this.b3.getReactionsWindow() != null) {
                    this.b3.getReactionsWindow().e();
                }
                this.b3.animate().alpha(0.0f).setDuration(150L).setListener(new e2(this, i7)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d3, z10 ? 1.0f : 0.0f);
            this.b3.setTransitionProgress(this.d3);
            ofFloat.addUpdateListener(new s1(this, 1));
            ofFloat.addListener(new d2(this, z10, i7));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(kr.g);
            ofFloat.start();
        }
    }

    public final void a1(boolean z10) {
        if (this.q0 == null) {
            hi.u3 u3Var = new hi.u3(getContext(), 1);
            u3Var.o(1.0f, -56.0f);
            this.q0 = u3Var;
            u3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.M0.addView(this.q0, na.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.q0.v(gd.N0(z10 ? 2131744363 : 2131744213, null));
        this.q0.x();
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
        if (mp.u1(this.m2).i5()) {
            File h = this.y1.h();
            if (h == null || !h.exists()) {
                Y0();
                return;
            }
            q2 q2Var = this.J2;
            if (q2Var != null) {
                q2Var.dismiss();
            }
            org.telegram.messenger.g0.h3(new r1(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0955, code lost:
    
        if (r4.g == (r1 == null && r1.translated && r1.translatedText != null && android.text.TextUtils.equals(r1.translatedLng, org.telegram.ui.Components.a31.N0()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x09b5, code lost:
    
        if (r2 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x09d8, code lost:
    
        if (r3 != false) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0aeb, code lost:
    
        if (r6 != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0b03, code lost:
    
        if (r6 != false) goto L557;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b55  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0cfc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0d0f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d72  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0d89  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0db2 A[EDGE_INSN: B:311:0x0db2->B:312:0x0db2 BREAK  A[LOOP:0: B:300:0x0d90->B:309:0x0daf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0dbe  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0e27  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0e64  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0e73  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0e95  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0f2b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0f5c  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0f6b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0fb2  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0fdf  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0ffb  */
    /* JADX WARN: Removed duplicated region for block: B:407:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0fd1  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0edd  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0e6d  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0e37  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0e1e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0d30  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0d4a  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0c88  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0936  */
    /* JADX WARN: Type inference failed for: r6v188 */
    /* JADX WARN: Type inference failed for: r6v189, types: [fi.s7, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v190 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(boolean z10) {
        o6 o6Var;
        TL_stories.StoryItem storyItem;
        o6 o6Var2;
        mx mxVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        int i10;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem2;
        f9 f9Var;
        c9 c9Var;
        ImageReceiver imageReceiver2;
        TL_stories.StoryItem storyItem3;
        boolean z14;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z15;
        TL_stories.StoryItem storyItem4;
        o6 o6Var3;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem5;
        hi.x7 x7Var;
        TL_stories.StoryItem storyItem6;
        o6 o6Var4;
        int i11;
        hi.x7 x7Var2;
        c1 c1Var;
        boolean z16;
        c3 c3Var;
        g3 g3Var;
        v3 v3Var;
        i2 i2Var;
        boolean z17;
        boolean z18;
        o6 o6Var5;
        org.telegram.ui.Components.fc fcVar;
        boolean z19;
        TL_stories.StoryItem storyItem7;
        boolean z20;
        boolean z21;
        o6 o6Var6;
        boolean z22;
        ImageReceiver imageReceiver3;
        c3 c3Var2;
        g3 g3Var2;
        v3 v3Var2;
        boolean z23;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        int i12;
        TLRPC.MessageMedia messageMedia2;
        boolean z24;
        hi.u3 u3Var;
        hi.u3 u3Var2;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem10;
        s3 s3Var;
        boolean z25;
        boolean z26;
        LinearLayout linearLayout;
        boolean z27;
        boolean z28;
        i2 i2Var2;
        int i13;
        i2 i2Var3;
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
        j1 j1Var;
        boolean z36;
        TL_stories.StoryItem storyItem11;
        boolean z37;
        int i16;
        int i17;
        boolean z38;
        boolean z39;
        boolean l10;
        o6 o6Var7;
        o6 o6Var8;
        hi.u3 u3Var3;
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
        c1 c1Var2;
        int i27;
        boolean z48;
        int i28;
        boolean z49;
        int i29;
        boolean z50;
        boolean z51;
        boolean z52;
        c1 c1Var3;
        String str;
        BitmapDrawable bitmapDrawable;
        mx mxVar2;
        f9 f9Var2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        h6 h6Var;
        ArrayList arrayList2 = this.f1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.g1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.F2 = true;
        x3 x3Var = this.y1;
        TL_stories.StoryItem storyItem14 = x3Var.a;
        o6 o6Var9 = x3Var.b;
        String s5 = i7.s();
        this.J0 = false;
        this.M2 = false;
        int i30 = this.t1;
        boolean z53 = this.D1;
        boolean z54 = this.E1;
        boolean z55 = this.F1;
        f9 f9Var3 = this.t0;
        if (f9Var3 == null || (h6Var = f9Var3.O0) == null || h6Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i30 < 0 || i30 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i30);
            int size = i30 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            o6Var = (size < 0 || size >= arrayList3.size()) ? null : (o6) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            o6Var = (i30 < 0 || i30 >= arrayList3.size()) ? null : (o6) arrayList3.get(i30);
            int size2 = i30 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        x3Var.c = null;
        y2 y2Var = this.T0;
        mx mxVar3 = this.U0;
        s2 s2Var = this.O0;
        if (o6Var != null) {
            hi.x7 x7Var3 = o6Var.c;
            this.E1 = false;
            boolean z56 = o6Var.J;
            this.F1 = z56;
            this.D1 = !z56;
            s2Var.d0(false);
            s2Var.c0(ks.g2);
            Bitmap bitmap = x7Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (o6Var.s || o6Var.I) {
                BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                imageReceiver = s2Var;
                o6Var2 = o6Var9;
                mxVar2 = mxVar3;
                z11 = z53;
                z12 = z54;
                z13 = z55;
                f9Var2 = f9Var3;
                i7 = i30;
                r62 = 0;
                i10 = 4;
                imageReceiver.v0(null, null, fc.g(o6Var.f), s5, null, null, bitmapDrawable2, 0L, null, null, 0);
            } else {
                BitmapDrawable bitmapDrawable3 = bitmapDrawable;
                imageReceiver = s2Var;
                o6Var2 = o6Var9;
                r62 = 0;
                mxVar2 = mxVar3;
                z11 = z53;
                z13 = z55;
                z12 = z54;
                i10 = 4;
                f9Var2 = f9Var3;
                i7 = i30;
                imageReceiver.v0(null, null, fc.g(o6Var.e), s5, null, null, bitmapDrawable3, 0L, null, null, 0);
            }
            x3Var.b = o6Var;
            x3Var.j = r62;
            x3Var.i = r62;
            x3Var.a = r62;
            x3Var.d = false;
            x3Var.e = x3Var.m();
            TL_stories.StoryItem storyItem17 = x3Var.a;
            x3Var.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            mxVar = mxVar2;
            y2Var.c(r62, j8.a(x7Var3), mxVar);
            this.E2 = false;
            this.D2 = false;
            this.C2 = false;
            f9 f9Var4 = f9Var2;
            storyItem2 = storyItem14;
            f9Var = f9Var4;
        } else {
            o6Var2 = o6Var9;
            mxVar = mxVar3;
            z11 = z53;
            z12 = z54;
            z13 = z55;
            i7 = i30;
            i10 = 4;
            imageReceiver = s2Var;
            this.D1 = false;
            this.E1 = false;
            this.F1 = false;
            if (storyItem == null) {
                if (f9Var3 != null) {
                    f9Var3.u(true);
                    return;
                }
                return;
            }
            o6 t6 = this.C1.t(this.l1, storyItem);
            if (t6 != null) {
                String str2 = t6.f;
                this.E1 = true;
                imageReceiver.d0(false);
                imageReceiver.c0(this.S0 == null ? ks.g2 : 0);
                if (t6.s) {
                    storyItem2 = storyItem14;
                    f9Var = f9Var3;
                    o6Var3 = t6;
                    imageReceiver.s0(null, null, fc.g(str2), s5, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    f9Var = f9Var3;
                    o6Var3 = t6;
                    imageReceiver.s0(null, null, fc.g(str2), s5, null, 0L, null, null, 0);
                }
                x3Var.b = o6Var3;
                x3Var.j = null;
                x3Var.i = null;
                x3Var.a = null;
                x3Var.d = false;
                x3Var.e = x3Var.m();
                TL_stories.StoryItem storyItem18 = x3Var.a;
                x3Var.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                y2Var.c(null, j8.a(o6Var3.c), mxVar);
                x3Var.c = storyItem;
                this.E2 = false;
                this.D2 = false;
                this.C2 = false;
            } else {
                storyItem2 = storyItem14;
                f9Var = f9Var3;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z57 = messageMedia4 != null && fj.K4(messageMedia4.getDocument());
                storyItem.dialogId = this.l1;
                imageReceiver.d0(z12);
                imageReceiver.c0(ks.g2);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.M2 = true;
                    mp.u1(this.m2).R1().p(storyItem.id, this.l1);
                    storyItem3 = storyItem;
                    z14 = z12;
                } else {
                    String str3 = storyItem.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            z57 = str3.toLowerCase().endsWith(".mp4");
                        }
                        if (z57) {
                            TLRPC.MessageMedia messageMedia6 = storyItem.media;
                            BitmapDrawable m10 = messageMedia6 != null ? ec.m(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                if (ec.D().J(fc.g(storyItem.firstFramePath).q(null, null, false) + "@" + s5, false)) {
                                    z15 = z12;
                                    imageReceiver.v0(null, null, fc.g(storyItem.firstFramePath), s5, null, null, m10, 0L, null, null, 0);
                                }
                            }
                            z15 = z12;
                            imageReceiver.v0(null, null, fc.g(storyItem.attachPath), p5.c.v(s5, "_pframe"), null, null, m10, 0L, null, null, 0);
                        } else {
                            z15 = z12;
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            BitmapDrawable m11 = photo != null ? ec.m(photo.sizes) : null;
                            if (z15) {
                                imageReceiver.s0(fc.g(storyItem.attachPath), s5, fc.g(storyItem.firstFramePath), s5, m11, 0L, null, null, 0);
                            } else {
                                imageReceiver.s0(fc.g(storyItem.attachPath), s5, null, null, m11, 0L, null, null, 0);
                            }
                        }
                        storyItem3 = storyItem;
                        z14 = z15;
                    } else {
                        Drawable t10 = ((f9Var.O0 != null || f9Var.N0) && (c9Var = f9Var.t0) != null && (imageReceiver2 = c9Var.c) != null && c9Var.o == storyItem.id) ? imageReceiver2.t() : null;
                        storyItem.dialogId = this.l1;
                        if (z57) {
                            TLRPC.PhotoSize u10 = org.telegram.messenger.w7.u(1000, storyItem.media.getDocument().thumbs);
                            if (t10 == null) {
                                t10 = ec.m(storyItem.media.getDocument().thumbs);
                            }
                            fc b10 = fc.b(p6.C(this.m2, storyItem));
                            String v = p5.c.v(s5, "_pframe");
                            fc c10 = fc.c(u10, storyItem.media.getDocument());
                            TL_stories.StoryItem storyItem19 = storyItem;
                            z14 = z12;
                            imageReceiver.v0(null, null, b10, v, c10, s5, t10, 0L, null, storyItem19, 0);
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
                                    t10 = ec.m(arrayList);
                                }
                                TLRPC.PhotoSize u11 = org.telegram.messenger.w7.u(ConnectionsManager.DEFAULT_DATACENTER_ID, photo2.sizes);
                                org.telegram.messenger.w7.u(800, photo2.sizes);
                                imageReceiver.v0(null, null, fc.i(u11, photo2), s5, null, null, t10, 0L, null, storyItem3, 0);
                            }
                        }
                    }
                }
                storyItem3.dialogId = this.l1;
                y2Var.d(z10 ? null : storyItem3, mxVar);
                x3Var.n(storyItem3);
                boolean z58 = (this.M2 || (storyItem4 = x3Var.a) == null || (storyItem4 instanceof TL_stories.TL_storyItemDeleted) || (storyItem4 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.E2 = z58;
                this.C2 = z58;
                if (z58) {
                    this.C2 = x3Var.d() && x3Var.a.isPublic;
                }
                if (this.C2) {
                    TL_stories.StoryItem storyItem20 = x3Var.a;
                    this.C2 = storyItem20.pinned || !i7.w(this.m2, storyItem20);
                }
                boolean z59 = this.C2;
                this.D2 = z59;
                if (z59 && this.n1) {
                    TLRPC.Chat O0 = mp.u1(this.m2).O0(Long.valueOf(-this.l1));
                    this.D2 = O0 != null && org.telegram.messenger.v3.t0(O0);
                }
                if (this.E2) {
                    if (this.n1) {
                        TLRPC.Chat O02 = mp.u1(this.m2).O0(Long.valueOf(-this.l1));
                        this.E2 = (O02 == null || org.telegram.messenger.v3.K(O02, false) == null) ? false : true;
                    } else {
                        TLRPC.User c22 = mp.u1(this.m2).c2(Long.valueOf(this.l1));
                        this.E2 = (c22 == null || n10.o(c22) == null || !x3Var.a.isPublic) ? false : true;
                    }
                }
                xs.l0.c(new os(xs.t(this.m2), this.l1, storyItem3.id, 1));
                storyItem5 = x3Var.a;
                if (storyItem5 != null && !z10) {
                    f9Var.P0 = storyItem5.id;
                }
                f9Var.o0.A();
                this.I2 = true;
                if (!this.m1 || this.n1) {
                    i1(false);
                }
                TL_stories.StoryItem storyItem21 = x3Var.a;
                o6 o6Var10 = x3Var.b;
                int i31 = storyItem21 == null ? storyItem21.id : (o6Var10 == null || (x7Var = o6Var10.c) == null) ? 0 : x7Var.f;
                if (storyItem2 == null) {
                    storyItem6 = storyItem2;
                    i11 = storyItem6.id;
                    o6Var4 = o6Var2;
                } else {
                    storyItem6 = storyItem2;
                    o6Var4 = o6Var2;
                    i11 = (o6Var2 == null || (x7Var2 = o6Var4.c) == null) ? 0 : x7Var2.f;
                }
                boolean z60 = (i31 == i11 && (o6Var4 == null || storyItem21 == null || !TextUtils.equals(o6Var4.e, storyItem21.attachPath))) ? false : true;
                boolean z61 = (z60 || (this.E1 == z14 && this.D1 == z11 && this.F1 == z13)) ? false : true;
                c1Var = f9Var.B0;
                if (c1Var != null) {
                    int i32 = this.A3;
                    TLRPC.GroupCall groupCall = c1Var.w;
                    if (i32 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                        z16 = true;
                        c3Var = this.M0;
                        g3Var = this.u0;
                        v3Var = this.Y0;
                        if ((o6Var4 != null || (str = o6Var4.e) == null || !str.equals(x3Var.f())) && (storyItem6 == null || (storyItem7 = x3Var.a) == null || storyItem6.id != storyItem7.id)) {
                            i2Var = this.L1;
                            if (i2Var != null) {
                                if (storyItem6 != null && !TextUtils.isEmpty(i2Var.getEditField().getText())) {
                                    f9.P(storyItem6.dialogId, storyItem6, this.L1.getEditField().getText());
                                }
                                this.L1.getEditField().setText(f9.A(this.l1, x3Var.a));
                                z19 = x3Var.f;
                                if (z19) {
                                    z17 = false;
                                    this.L1.y1(false, false, false);
                                } else {
                                    z17 = false;
                                    this.L1.y1(true, true, false);
                                }
                            } else {
                                z17 = false;
                            }
                            z18 = x3Var.f;
                            if (z18) {
                                K0();
                            }
                            mxVar.c();
                            this.G0 = 0L;
                            this.I0 = z17;
                            o6Var5 = x3Var.b;
                            if (o6Var5 != null) {
                                rh0 rh0Var = v3Var.d;
                                if (rh0Var != null) {
                                    rh0Var.e(z17, o6Var5.h);
                                }
                                v3Var.a.invalidate();
                            } else if (!z61) {
                                v3Var.h = 0.0f;
                            }
                            fcVar = org.telegram.ui.Components.fc.w;
                            if (fcVar != null && fcVar.h == c3Var) {
                                fcVar.b();
                            }
                            g3Var.J();
                            o0();
                            z16 = true;
                        }
                        if (!z16 || (o6Var4 != null && x3Var.b == null)) {
                            v3Var.setOnSubtitleClick(null);
                            TextView[] textViewArr = v3Var.c;
                            this.A3 = 0;
                            z20 = z60;
                            long j3 = this.l1;
                            boolean z62 = z61;
                            z21 = x3Var.f;
                            U0(j3, false, z21);
                            o6Var6 = x3Var.b;
                            if (o6Var6 != null) {
                                charSequence3 = o6Var6.J ? gd.M0(2131750832) : i7.u(textViewArr[0], this.E1);
                            } else {
                                if (G0()) {
                                    TL_stories.StoryItem storyItem22 = x3Var.a;
                                    if (storyItem22 != null && (messageMedia2 = storyItem22.media) != null) {
                                        if (messageMedia2.document != null) {
                                            charSequence3 = gd.X(r13.date);
                                        } else {
                                            if (messageMedia2.photo != null) {
                                                charSequence3 = gd.X(r1.date);
                                            }
                                        }
                                    }
                                    z22 = z16;
                                    imageReceiver3 = imageReceiver;
                                    c3Var2 = c3Var;
                                    g3Var2 = g3Var;
                                    v3Var2 = v3Var;
                                    z23 = z62;
                                    charSequence = "";
                                } else {
                                    TL_stories.StoryItem storyItem23 = x3Var.a;
                                    if (storyItem23 == null) {
                                        z22 = z16;
                                        imageReceiver3 = imageReceiver;
                                        c3Var2 = c3Var;
                                        g3Var2 = g3Var;
                                        v3Var2 = v3Var;
                                        z23 = z62;
                                        charSequence = null;
                                    } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131748632));
                                        spannableStringBuilder.setSpan(new j0(1), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        c1 c1Var4 = f9Var.B0;
                                        if (c1Var4 != null) {
                                            TLRPC.GroupCall groupCall2 = c1Var4.w;
                                            i12 = 1;
                                            this.A3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                                        } else {
                                            i12 = 1;
                                        }
                                        spannableStringBuilder.append((CharSequence) gd.I(Math.max(i12, this.A3), "LiveStoryWatching"));
                                        charSequence3 = spannableStringBuilder;
                                    } else if (storyItem23.date == -1) {
                                        charSequence3 = gd.M0(2131752632);
                                    } else {
                                        if (x3Var.i() != null) {
                                            s7 i33 = x3Var.i();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            z22 = z16;
                                            imageReceiver3 = imageReceiver;
                                            SpannableString spannableString = new SpannableString("r");
                                            c3Var2 = c3Var;
                                            g3Var2 = g3Var;
                                            spannableString.setSpan(new kq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) spannableString).append((CharSequence) " ");
                                            if (i33.b != null) {
                                                org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(15.0f, this.m2, textViewArr[0]);
                                                SpannableString spannableString2 = new SpannableString("a");
                                                spannableString2.setSpan(f5Var, 0, 1, 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                                if (i33.b.longValue() > 0) {
                                                    TLRPC.User c23 = mp.u1(this.m2).c2(i33.b);
                                                    f5Var.e(c23);
                                                    spannableStringBuilder2.append((CharSequence) n10.q(c23));
                                                } else {
                                                    TLRPC.Chat O03 = mp.u1(this.m2).O0(Long.valueOf(-i33.b.longValue()));
                                                    f5Var.b(O03);
                                                    if (O03 != null) {
                                                        spannableStringBuilder2.append((CharSequence) O03.title);
                                                    }
                                                }
                                            } else {
                                                String str4 = x3Var.a.fwd_from.from_name;
                                                if (str4 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str4);
                                                }
                                            }
                                            v3Var.setOnSubtitleClick(new ai.p2(18, this, i33));
                                            SpannableString spannableString3 = new SpannableString(".");
                                            rs rsVar = new rs();
                                            rsVar.b = org.telegram.messenger.g0.L(1.5f);
                                            rsVar.c = 5.0f;
                                            spannableString3.setSpan(rsVar, 0, spannableString3.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) gd.P(x3Var.a.date));
                                            v3Var2 = v3Var;
                                            charSequence = spannableStringBuilder2;
                                        } else {
                                            z22 = z16;
                                            imageReceiver3 = imageReceiver;
                                            c3Var2 = c3Var;
                                            g3Var2 = g3Var;
                                            if (!this.o1 || (storyItem8 = x3Var.a) == null || storyItem8.from_id == null) {
                                                v3Var2 = v3Var;
                                                String X = gd.X(x3Var.a.date);
                                                charSequence2 = X;
                                                if (x3Var.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X);
                                                    rs rsVar2 = new rs();
                                                    rsVar2.b = org.telegram.messenger.g0.L(1.5f);
                                                    rsVar2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(rsVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                                    valueOf.append((CharSequence) gd.M0(2131751198));
                                                    charSequence2 = valueOf;
                                                }
                                                charSequence = charSequence2;
                                                z23 = z62;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(15.0f, this.m2, textViewArr[0]);
                                                SpannableString spannableString4 = new SpannableString("a");
                                                spannableString4.setSpan(f5Var2, 0, 1, 33);
                                                spannableStringBuilder3.append((CharSequence) spannableString4).append((CharSequence) " ");
                                                long o4 = org.telegram.messenger.n5.o(x3Var.a.from_id);
                                                if (o4 > 0) {
                                                    TLRPC.User c24 = mp.u1(this.m2).c2(Long.valueOf(o4));
                                                    f5Var2.e(c24);
                                                    spannableStringBuilder3.append((CharSequence) n10.q(c24));
                                                    v3Var2 = v3Var;
                                                } else {
                                                    v3Var2 = v3Var;
                                                    TLRPC.Chat O04 = mp.u1(this.m2).O0(Long.valueOf(-o4));
                                                    f5Var2.b(O04);
                                                    if (O04 != null) {
                                                        spannableStringBuilder3.append((CharSequence) O04.title);
                                                    }
                                                }
                                                v3Var2.setOnSubtitleClick(new bi.q(this, o4, 2));
                                                SpannableString spannableString5 = new SpannableString(".");
                                                rs rsVar3 = new rs();
                                                rsVar3.b = org.telegram.messenger.g0.L(1.5f);
                                                rsVar3.c = 5.0f;
                                                spannableString5.setSpan(rsVar3, 0, spannableString5.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) gd.P(x3Var.a.date));
                                                charSequence = spannableStringBuilder3;
                                            }
                                        }
                                        z23 = false;
                                    }
                                }
                                if (charSequence == null) {
                                    h6 h6Var2 = f9Var.O0;
                                    if (h6Var2 == null || (storyItem9 = x3Var.a) == null || !h6Var2.m(storyItem9.id)) {
                                        z24 = false;
                                    } else {
                                        if (!(charSequence instanceof SpannableStringBuilder)) {
                                            charSequence = new SpannableStringBuilder(charSequence);
                                        }
                                        SpannableString spannableString6 = new SpannableString("p ");
                                        z24 = false;
                                        spannableString6.setSpan(new kq(R.drawable.msg_pin_mini), 0, 1, 33);
                                        ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString6);
                                    }
                                    v3Var2.c(charSequence, z23);
                                } else {
                                    z24 = false;
                                }
                                u3Var = this.p0;
                                if (u3Var != null) {
                                    u3Var.f(z24);
                                }
                                u3Var2 = this.q0;
                                if (u3Var2 != null) {
                                    u3Var2.f(z24);
                                }
                            }
                            z22 = z16;
                            imageReceiver3 = imageReceiver;
                            c3Var2 = c3Var;
                            g3Var2 = g3Var;
                            v3Var2 = v3Var;
                            charSequence2 = charSequence3;
                            charSequence = charSequence2;
                            z23 = z62;
                            if (charSequence == null) {
                            }
                            u3Var = this.p0;
                            if (u3Var != null) {
                            }
                            u3Var2 = this.q0;
                            if (u3Var2 != null) {
                            }
                        } else {
                            z20 = z60;
                            z22 = z16;
                            imageReceiver3 = imageReceiver;
                            c3Var2 = c3Var;
                            g3Var2 = g3Var;
                            v3Var2 = v3Var;
                        }
                        storyItem10 = x3Var.a;
                        if (storyItem6 == storyItem10 && o6Var4 == x3Var.b) {
                        }
                        x3Var.o();
                        if ((!x3Var.g || storyItem6 != x3Var.a) && (s3Var = this.A1) != null) {
                            f9 f9Var5 = ((w8) s3Var).d;
                            f9Var5.Z0 = false;
                            f9Var5.V();
                        }
                        z25 = x3Var.f;
                        z26 = !z25 && (c1Var3 = f9Var.B0) != null && x3Var.k(c1Var3.g()) && f9Var.B0.b();
                        if (z26 != this.q1) {
                            this.q1 = z26;
                            if (z26) {
                                x0();
                            }
                            if (this.Q1 != null && (this.p1 || this.q1)) {
                                f1();
                            }
                            i2 i2Var4 = this.L1;
                            if (i2Var4 != null) {
                                if (this.p1) {
                                    z52 = x3Var.f;
                                }
                                if (!this.q1) {
                                    z51 = true;
                                    i2Var4.setEnabled(z51);
                                    this.L1.y2();
                                }
                                z51 = false;
                                i2Var4.setEnabled(z51);
                                this.L1.y2();
                            }
                            p0(true);
                        }
                        linearLayout = this.Q1;
                        if (linearLayout != null) {
                            if (this.p1) {
                                z50 = x3Var.f;
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
                            i2 i2Var5 = this.L1;
                            if (i2Var5 != null) {
                                i2Var5.setVisibility(8);
                            }
                            t2 t2Var = this.G1;
                            if (t2Var != null) {
                                t2Var.setVisibility(8);
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat O05 = this.l1 < 0 ? mp.u1(this.m2).O0(Long.valueOf(-this.l1)) : null;
                            z28 = x3Var.f;
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
                                if ((n10.B(this.l1) || G0()) && (i2Var2 = this.L1) != null) {
                                    i2Var2.setVisibility(8);
                                } else if (!this.m1 && ((!this.n1 || (this.o1 && (org.telegram.messenger.v3.q(O05) || org.telegram.messenger.v3.s0(O05)))) && (i2Var3 = this.L1) != null)) {
                                    i13 = 0;
                                    i2Var3.setVisibility(0);
                                }
                                i13 = 0;
                            }
                            i2 i2Var6 = this.L1;
                            if (i2Var6 != null) {
                                z33 = x3Var.f;
                                i2Var6.setOnSendButtonLongClick(z33 ? new q1(this, i13) : null);
                                i2 i2Var7 = this.L1;
                                z34 = x3Var.f;
                                B0(true);
                                i2Var7.L1(z34);
                                i2 i2Var8 = this.L1;
                                z35 = x3Var.f;
                                i2Var8.T1(z35 && !B0(true) && (this.f2 || this.L1.X0), true);
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
                                    z32 = x3Var.f;
                                }
                                if (!this.q1) {
                                    i15 = 8;
                                    linearLayout3.setVisibility(i15);
                                }
                                i15 = 0;
                                linearLayout3.setVisibility(i15);
                            }
                            i2 i2Var9 = this.L1;
                            if (i2Var9 != null) {
                                if (this.p1) {
                                    z31 = x3Var.f;
                                }
                                if (!this.q1) {
                                    z30 = true;
                                    i2Var9.setEnabled(z30);
                                }
                                z30 = false;
                                i2Var9.setEnabled(z30);
                            }
                            t2 t2Var2 = this.G1;
                            if (t2Var2 != null) {
                                if (this.m1) {
                                    z29 = x3Var.f;
                                    if (!z29) {
                                        i14 = 0;
                                        t2Var2.setVisibility(i14);
                                    }
                                }
                                i14 = 8;
                                t2Var2.setVisibility(i14);
                            }
                            FrameLayout frameLayout = this.K2;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (n10.B(this.l1)) {
                                y0();
                                this.L2.setVisibility(0);
                            } else {
                                xb xbVar = this.L2;
                                if (xbVar != null) {
                                    xbVar.setVisibility(8);
                                }
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(G0() ? 8 : 0);
                            }
                        }
                        hVar = this.M1;
                        if (hVar != null) {
                            i2 i2Var10 = this.L1;
                            if (i2Var10 != null && i2Var10.getVisibility() == 0) {
                                z49 = x3Var.f;
                                if (!z49) {
                                    i28 = 0;
                                    hVar.setVisibility(i28);
                                }
                            }
                            i28 = 8;
                            hVar.setVisibility(i28);
                        }
                        aVar = this.H1;
                        a2 a2Var = this.v0;
                        if (aVar != null) {
                            if (!this.M2) {
                                z48 = x3Var.f;
                                if (z48) {
                                    i27 = 0;
                                    aVar.setVisibility(i27);
                                    this.H1.a(a2Var.g(), false);
                                    this.H1.setCount(a2Var.getUnreadMessagesCount());
                                }
                            }
                            i27 = 8;
                            aVar.setVisibility(i27);
                            this.H1.a(a2Var.g(), false);
                            this.H1.setCount(a2Var.getUnreadMessagesCount());
                        }
                        j1Var = this.K1;
                        if (j1Var != null) {
                            if (!this.M2) {
                                z47 = x3Var.f;
                                if (z47 && (c1Var2 = c1.X) != null && x3Var.k(c1Var2.g())) {
                                    i26 = 0;
                                    j1Var.setVisibility(i26);
                                    j1 j1Var2 = this.K1;
                                    c1 c1Var5 = c1.X;
                                    j1Var2.b(c1Var5 == null && c1Var5.o(), true);
                                    j1 j1Var3 = this.K1;
                                    c1 c1Var6 = c1.X;
                                    j1Var3.a(c1Var6 != null || c1Var6.m(), true);
                                }
                            }
                            i26 = 8;
                            j1Var.setVisibility(i26);
                            j1 j1Var22 = this.K1;
                            c1 c1Var52 = c1.X;
                            j1Var22.b(c1Var52 == null && c1Var52.o(), true);
                            j1 j1Var32 = this.K1;
                            c1 c1Var62 = c1.X;
                            j1Var32.a(c1Var62 != null || c1Var62.m(), true);
                        }
                        if (this.J1 != null) {
                            m1 m1Var = this.I1;
                            if (!this.M2) {
                                z46 = x3Var.f;
                                if (z46) {
                                    i24 = 0;
                                    m1Var.setVisibility(i24);
                                    n1 n1Var = this.J1;
                                    if (!this.M2) {
                                        z45 = x3Var.f;
                                        if (z45) {
                                            i25 = 0;
                                            n1Var.setVisibility(i25);
                                            layoutParams = (FrameLayout.LayoutParams) this.J1.getLayoutParams();
                                            j1 j1Var4 = this.K1;
                                            L = org.telegram.messenger.g0.L((j1Var4 == null && j1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                            if (layoutParams.rightMargin != L) {
                                                layoutParams.rightMargin = L;
                                                this.J1.setLayoutParams(layoutParams);
                                            }
                                        }
                                    }
                                    i25 = 8;
                                    n1Var.setVisibility(i25);
                                    layoutParams = (FrameLayout.LayoutParams) this.J1.getLayoutParams();
                                    j1 j1Var42 = this.K1;
                                    L = org.telegram.messenger.g0.L((j1Var42 == null && j1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != L) {
                                    }
                                }
                            }
                            i24 = 8;
                            m1Var.setVisibility(i24);
                            n1 n1Var2 = this.J1;
                            if (!this.M2) {
                            }
                            i25 = 8;
                            n1Var2.setVisibility(i25);
                            layoutParams = (FrameLayout.LayoutParams) this.J1.getLayoutParams();
                            j1 j1Var422 = this.K1;
                            L = org.telegram.messenger.g0.L((j1Var422 == null && j1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != L) {
                            }
                        }
                        z36 = x3Var.f;
                        if (!z36 || ((x3Var.h == null && x3Var.i() == null && x3Var.g() == null) || this.M2)) {
                            g3 g3Var3 = g3Var2;
                            if (this.u1) {
                                f9 f9Var6 = ((w8) this.A1).d;
                                f9Var6.L0 = false;
                                f9Var6.V();
                                s3 s3Var2 = this.A1;
                                this.T2 = false;
                                ((w8) s3Var2).e();
                            }
                            g3Var3.setVisibility(8);
                        } else {
                            g3 g3Var4 = g3Var2;
                            g3Var4.c0.b(x3Var.h, x3Var.i(), x3Var.g(), f9Var.Z0 && !x3Var.g && (storyItem13 = x3Var.a) != null && storyItem13.translated, storyItem6 == x3Var.a);
                            g3Var4.setVisibility(0);
                        }
                        storyItem11 = x3Var.a;
                        if (storyItem11 != null) {
                            TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                            if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (a2Var.r(this.l1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                                    a2Var.q(false, false);
                                    this.v3 = 0L;
                                    i2 i2Var11 = this.L1;
                                    if (i2Var11 != null) {
                                        i2Var11.P(true);
                                        this.L1.B2();
                                        p0(true);
                                    }
                                }
                                a2Var.setVisibility(0);
                                c3Var2.invalidate();
                                if (this.A1 != null && I0()) {
                                    ((w8) this.A1).a(this.t1, this.l1);
                                }
                                z37 = this.n1;
                                t2 t2Var3 = this.z0;
                                ImageView imageView3 = this.x0;
                                t2 t2Var4 = this.n0;
                                if (z37) {
                                    if (this.C2) {
                                        z39 = x3Var.f;
                                        if (!z39) {
                                            i16 = 0;
                                            imageView3.setVisibility(i16);
                                            if (t2Var3 != null) {
                                                t2Var3.setVisibility(8);
                                            }
                                            if (!this.m1) {
                                                z38 = x3Var.f;
                                                if (!z38) {
                                                    i17 = 0;
                                                    t2Var4.setVisibility(i17);
                                                    t2Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                                }
                                            }
                                            i17 = 8;
                                            t2Var4.setVisibility(i17);
                                            t2Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                        }
                                    }
                                    i16 = i10;
                                    imageView3.setVisibility(i16);
                                    if (t2Var3 != null) {
                                    }
                                    if (!this.m1) {
                                    }
                                    i17 = 8;
                                    t2Var4.setVisibility(i17);
                                    t2Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                } else {
                                    if (this.C2) {
                                        z44 = x3Var.f;
                                        if (!z44) {
                                            i21 = 0;
                                            imageView3.setVisibility(i21);
                                            if (t2Var3 != null) {
                                                if (this.D2) {
                                                    z43 = x3Var.f;
                                                    if (!z43) {
                                                        i23 = 0;
                                                        t2Var3.setVisibility(i23);
                                                    }
                                                }
                                                i23 = 8;
                                                t2Var3.setVisibility(i23);
                                            }
                                            if (!this.F1) {
                                                z42 = x3Var.f;
                                                if (!z42) {
                                                    i22 = 0;
                                                    t2Var4.setVisibility(i22);
                                                }
                                            }
                                            i22 = 8;
                                            t2Var4.setVisibility(i22);
                                        }
                                    }
                                    i21 = i10;
                                    imageView3.setVisibility(i21);
                                    if (t2Var3 != null) {
                                    }
                                    if (!this.F1) {
                                    }
                                    i22 = 8;
                                    t2Var4.setVisibility(i22);
                                }
                                t2Var4.requestLayout();
                                f9Var.e1.append(this.l1, i7);
                                if (this.u1) {
                                    P0(0L);
                                    e1();
                                    imageReceiver3.b();
                                }
                                a2Var.setLivePlayer(f9Var.B0);
                                this.v1 = 0;
                                if (f9Var.O0 != null && (storyItem12 = x3Var.a) != null) {
                                    int i34 = storyItem12.id;
                                    i20 = 0;
                                    while (true) {
                                        if (i20 < f9Var.O0.i.size()) {
                                            fj fjVar = (fj) f9Var.O0.i.get(i20);
                                            if (fjVar != null && fjVar.e1() == i34) {
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
                                if (f9Var.R0) {
                                    this.w1 = (i36 - 1) - i35;
                                }
                                l10 = x3Var.l();
                                bi.v2 v2Var = this.i0;
                                if (l10) {
                                    v2Var.setVisibility(8);
                                } else {
                                    v2Var.setVisibility(0);
                                    this.O2 = x3Var.j() ? 1.0f : 0.5f;
                                    boolean j10 = x3Var.j();
                                    ImageView imageView4 = this.k0;
                                    qh0 qh0Var = this.j0;
                                    if (j10) {
                                        qh0Var.setVisibility(0);
                                        imageView4.setVisibility(8);
                                        v2Var.setContentDescription(gd.M0(!f9.D1 ? 2131748121 : 2131743602));
                                    } else {
                                        qh0Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        v2Var.setContentDescription(gd.M0(2131747958));
                                    }
                                    v2Var.setAlpha((1.0f - this.O3) * this.O2);
                                }
                                o6Var7 = x3Var.b;
                                k8 k8Var = this.m0;
                                if (o6Var7 == null) {
                                    k8Var.a(this.m1, o6Var7, z20 && this.M3);
                                } else {
                                    TL_stories.StoryItem storyItem24 = x3Var.a;
                                    if (storyItem24 != null) {
                                        k8Var.b(this.m1, storyItem24, z20 && this.M3);
                                    } else {
                                        k8Var.b(this.m1, null, z20 && this.M3);
                                    }
                                }
                                this.M3 = false;
                                k8Var.setTranslationX(v2Var.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                                if (z22) {
                                    this.a3 = false;
                                    TL_stories.StoryItem storyItem25 = x3Var.a;
                                    if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                        this.o0.setReaction(null);
                                    } else {
                                        this.o0.setReaction(ch.p0.d(reaction));
                                    }
                                }
                                o6Var8 = x3Var.b;
                                if (o6Var8 == null && o6Var8.J) {
                                    u0();
                                    this.T1.set(x3Var.b.c.x);
                                    this.T1.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.U1;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.U1 = null;
                                    }
                                    if (z20) {
                                        ViewPropertyAnimator interpolator = this.T1.animate().alpha(1.0f).setDuration(180L).setInterpolator(kr.h);
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
                                        ViewPropertyAnimator withEndAction = this.T1.animate().alpha(0.0f).setDuration(180L).setInterpolator(kr.h).withEndAction(new r1(this, 0));
                                        this.U1 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.T1.setAlpha(0.0f);
                                        this.T1.setVisibility(8);
                                    }
                                }
                                this.h1.a(f9.D1, false);
                                if (this.u1 && x3Var.a != null) {
                                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + x3Var.a.id + " " + x3.c(x3Var));
                                }
                                if (this.m1) {
                                    b5.f(this.m2, this.l1, x3Var.a);
                                }
                                u3 u3Var4 = v3Var2.b;
                                h6 h6Var3 = f9Var.O0;
                                u3Var4.setPadding(0, 0, (h6Var3 != null || h6Var3.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                                mp.u1(this.m2).V1().l(x3Var.a);
                                if (!z10 && !this.m1 && this.j3 == null && !bz.T && bz.U) {
                                    r1 r1Var = new r1(this, 1);
                                    this.j3 = r1Var;
                                    org.telegram.messenger.g0.h3(r1Var, 500L);
                                }
                                u3Var3 = this.q0;
                                if (!(u3Var3 == null && u3Var3.W) && x3Var.j() && f9.D1) {
                                    i18 = 0;
                                    if (mp.g1().getInt("taptostorysoundhint", 0) < 2) {
                                        r1 r1Var2 = this.B3;
                                        org.telegram.messenger.g0.r(r1Var2);
                                        org.telegram.messenger.g0.h3(r1Var2, 250L);
                                    }
                                } else {
                                    i18 = 0;
                                }
                                imageView = this.g0;
                                if (imageView != null) {
                                    if (G0() && !H0()) {
                                        z41 = x3Var.e;
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
                                    z40 = x3Var.f;
                                    imageView2.setVisibility((!z40 || k8Var.f) ? 8 : i18);
                                    return;
                                }
                                return;
                            }
                        }
                        a2Var.r(this.l1, null);
                        a2Var.setVisibility(8);
                        c3Var2.invalidate();
                        if (this.A1 != null) {
                            ((w8) this.A1).a(this.t1, this.l1);
                        }
                        z37 = this.n1;
                        t2 t2Var32 = this.z0;
                        ImageView imageView32 = this.x0;
                        t2 t2Var42 = this.n0;
                        if (z37) {
                        }
                        t2Var42.requestLayout();
                        f9Var.e1.append(this.l1, i7);
                        if (this.u1) {
                        }
                        a2Var.setLivePlayer(f9Var.B0);
                        this.v1 = 0;
                        if (f9Var.O0 != null) {
                            int i342 = storyItem12.id;
                            i20 = 0;
                            while (true) {
                                if (i20 < f9Var.O0.i.size()) {
                                }
                                i20++;
                            }
                        }
                        int i352 = this.t1;
                        this.w1 = i352;
                        int i362 = this.k1;
                        this.x1 = i362;
                        if (f9Var.R0) {
                        }
                        l10 = x3Var.l();
                        bi.v2 v2Var2 = this.i0;
                        if (l10) {
                        }
                        o6Var7 = x3Var.b;
                        k8 k8Var2 = this.m0;
                        if (o6Var7 == null) {
                        }
                        this.M3 = false;
                        k8Var2.setTranslationX(v2Var2.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                        if (z22) {
                        }
                        o6Var8 = x3Var.b;
                        if (o6Var8 == null) {
                        }
                        if (this.T1 != null) {
                        }
                        this.h1.a(f9.D1, false);
                        if (this.u1) {
                            org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + x3Var.a.id + " " + x3.c(x3Var));
                        }
                        if (this.m1) {
                        }
                        u3 u3Var42 = v3Var2.b;
                        h6 h6Var32 = f9Var.O0;
                        u3Var42.setPadding(0, 0, (h6Var32 != null || h6Var32.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                        mp.u1(this.m2).V1().l(x3Var.a);
                        if (!z10) {
                            r1 r1Var3 = new r1(this, 1);
                            this.j3 = r1Var3;
                            org.telegram.messenger.g0.h3(r1Var3, 500L);
                        }
                        u3Var3 = this.q0;
                        if (u3Var3 == null) {
                        }
                        i18 = 0;
                        if (mp.g1().getInt("taptostorysoundhint", 0) < 2) {
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
                c3Var = this.M0;
                g3Var = this.u0;
                v3Var = this.Y0;
                if (o6Var4 != null) {
                }
                i2Var = this.L1;
                if (i2Var != null) {
                }
                z18 = x3Var.f;
                if (z18) {
                }
                mxVar.c();
                this.G0 = 0L;
                this.I0 = z17;
                o6Var5 = x3Var.b;
                if (o6Var5 != null) {
                }
                fcVar = org.telegram.ui.Components.fc.w;
                if (fcVar != null) {
                    fcVar.b();
                }
                g3Var.J();
                o0();
                z16 = true;
                if (z16) {
                }
                v3Var.setOnSubtitleClick(null);
                TextView[] textViewArr2 = v3Var.c;
                this.A3 = 0;
                z20 = z60;
                long j32 = this.l1;
                boolean z622 = z61;
                z21 = x3Var.f;
                U0(j32, false, z21);
                o6Var6 = x3Var.b;
                if (o6Var6 != null) {
                }
                z22 = z16;
                imageReceiver3 = imageReceiver;
                c3Var2 = c3Var;
                g3Var2 = g3Var;
                v3Var2 = v3Var;
                charSequence2 = charSequence3;
                charSequence = charSequence2;
                z23 = z622;
                if (charSequence == null) {
                }
                u3Var = this.p0;
                if (u3Var != null) {
                }
                u3Var2 = this.q0;
                if (u3Var2 != null) {
                }
                storyItem10 = x3Var.a;
                if (storyItem6 == storyItem10) {
                }
                x3Var.o();
                if (!x3Var.g) {
                }
                f9 f9Var52 = ((w8) s3Var).d;
                f9Var52.Z0 = false;
                f9Var52.V();
                z25 = x3Var.f;
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
                a2 a2Var2 = this.v0;
                if (aVar != null) {
                }
                j1Var = this.K1;
                if (j1Var != null) {
                }
                if (this.J1 != null) {
                }
                z36 = x3Var.f;
                if (z36) {
                }
                g3 g3Var32 = g3Var2;
                if (this.u1) {
                }
                g3Var32.setVisibility(8);
                storyItem11 = x3Var.a;
                if (storyItem11 != null) {
                }
                a2Var2.r(this.l1, null);
                a2Var2.setVisibility(8);
                c3Var2.invalidate();
                if (this.A1 != null) {
                }
                z37 = this.n1;
                t2 t2Var322 = this.z0;
                ImageView imageView322 = this.x0;
                t2 t2Var422 = this.n0;
                if (z37) {
                }
                t2Var422.requestLayout();
                f9Var.e1.append(this.l1, i7);
                if (this.u1) {
                }
                a2Var2.setLivePlayer(f9Var.B0);
                this.v1 = 0;
                if (f9Var.O0 != null) {
                }
                int i3522 = this.t1;
                this.w1 = i3522;
                int i3622 = this.k1;
                this.x1 = i3622;
                if (f9Var.R0) {
                }
                l10 = x3Var.l();
                bi.v2 v2Var22 = this.i0;
                if (l10) {
                }
                o6Var7 = x3Var.b;
                k8 k8Var22 = this.m0;
                if (o6Var7 == null) {
                }
                this.M3 = false;
                k8Var22.setTranslationX(v2Var22.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                if (z22) {
                }
                o6Var8 = x3Var.b;
                if (o6Var8 == null) {
                }
                if (this.T1 != null) {
                }
                this.h1.a(f9.D1, false);
                if (this.u1) {
                }
                if (this.m1) {
                }
                u3 u3Var422 = v3Var2.b;
                h6 h6Var322 = f9Var.O0;
                u3Var422.setPadding(0, 0, (h6Var322 != null || h6Var322.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                mp.u1(this.m2).V1().l(x3Var.a);
                if (!z10) {
                }
                u3Var3 = this.q0;
                if (u3Var3 == null) {
                }
                i18 = 0;
                if (mp.g1().getInt("taptostorysoundhint", 0) < 2) {
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
        storyItem5 = x3Var.a;
        if (storyItem5 != null) {
            f9Var.P0 = storyItem5.id;
        }
        f9Var.o0.A();
        this.I2 = true;
        if (!this.m1) {
        }
        i1(false);
        TL_stories.StoryItem storyItem212 = x3Var.a;
        o6 o6Var102 = x3Var.b;
        if (storyItem212 == null) {
        }
        if (storyItem2 == null) {
        }
        if (i31 == i11) {
        }
        if (z60) {
        }
        c1Var = f9Var.B0;
        if (c1Var != null) {
        }
        z16 = false;
        c3Var = this.M0;
        g3Var = this.u0;
        v3Var = this.Y0;
        if (o6Var4 != null) {
        }
        i2Var = this.L1;
        if (i2Var != null) {
        }
        z18 = x3Var.f;
        if (z18) {
        }
        mxVar.c();
        this.G0 = 0L;
        this.I0 = z17;
        o6Var5 = x3Var.b;
        if (o6Var5 != null) {
        }
        fcVar = org.telegram.ui.Components.fc.w;
        if (fcVar != null) {
        }
        g3Var.J();
        o0();
        z16 = true;
        if (z16) {
        }
        v3Var.setOnSubtitleClick(null);
        TextView[] textViewArr22 = v3Var.c;
        this.A3 = 0;
        z20 = z60;
        long j322 = this.l1;
        boolean z6222 = z61;
        z21 = x3Var.f;
        U0(j322, false, z21);
        o6Var6 = x3Var.b;
        if (o6Var6 != null) {
        }
        z22 = z16;
        imageReceiver3 = imageReceiver;
        c3Var2 = c3Var;
        g3Var2 = g3Var;
        v3Var2 = v3Var;
        charSequence2 = charSequence3;
        charSequence = charSequence2;
        z23 = z6222;
        if (charSequence == null) {
        }
        u3Var = this.p0;
        if (u3Var != null) {
        }
        u3Var2 = this.q0;
        if (u3Var2 != null) {
        }
        storyItem10 = x3Var.a;
        if (storyItem6 == storyItem10) {
        }
        x3Var.o();
        if (!x3Var.g) {
        }
        f9 f9Var522 = ((w8) s3Var).d;
        f9Var522.Z0 = false;
        f9Var522.V();
        z25 = x3Var.f;
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
        a2 a2Var22 = this.v0;
        if (aVar != null) {
        }
        j1Var = this.K1;
        if (j1Var != null) {
        }
        if (this.J1 != null) {
        }
        z36 = x3Var.f;
        if (z36) {
        }
        g3 g3Var322 = g3Var2;
        if (this.u1) {
        }
        g3Var322.setVisibility(8);
        storyItem11 = x3Var.a;
        if (storyItem11 != null) {
        }
        a2Var22.r(this.l1, null);
        a2Var22.setVisibility(8);
        c3Var2.invalidate();
        if (this.A1 != null) {
        }
        z37 = this.n1;
        t2 t2Var3222 = this.z0;
        ImageView imageView3222 = this.x0;
        t2 t2Var4222 = this.n0;
        if (z37) {
        }
        t2Var4222.requestLayout();
        f9Var.e1.append(this.l1, i7);
        if (this.u1) {
        }
        a2Var22.setLivePlayer(f9Var.B0);
        this.v1 = 0;
        if (f9Var.O0 != null) {
        }
        int i35222 = this.t1;
        this.w1 = i35222;
        int i36222 = this.k1;
        this.x1 = i36222;
        if (f9Var.R0) {
        }
        l10 = x3Var.l();
        bi.v2 v2Var222 = this.i0;
        if (l10) {
        }
        o6Var7 = x3Var.b;
        k8 k8Var222 = this.m0;
        if (o6Var7 == null) {
        }
        this.M3 = false;
        k8Var222.setTranslationX(v2Var222.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
        if (z22) {
        }
        o6Var8 = x3Var.b;
        if (o6Var8 == null) {
        }
        if (this.T1 != null) {
        }
        this.h1.a(f9.D1, false);
        if (this.u1) {
        }
        if (this.m1) {
        }
        u3 u3Var4222 = v3Var2.b;
        h6 h6Var3222 = f9Var.O0;
        u3Var4222.setPadding(0, 0, (h6Var3222 != null || h6Var3222.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
        mp.u1(this.m2).V1().l(x3Var.a);
        if (!z10) {
        }
        u3Var3 = this.q0;
        if (u3Var3 == null) {
        }
        i18 = 0;
        if (mp.g1().getInt("taptostorysoundhint", 0) < 2) {
        }
        imageView = this.g0;
        if (imageView != null) {
        }
        imageView2 = this.h0;
        if (imageView2 == null) {
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c1 c1Var;
        int i11 = ks.y5;
        f9 f9Var = this.t0;
        boolean z10 = false;
        if (i7 == i11 || (i7 == ks.A5 && f9Var.O0 == objArr[0])) {
            s3 s3Var = this.A1;
            if (s3Var == null || !((w8) s3Var).d.H0) {
                if (this.u1) {
                    h1();
                    if (this.k1 == 0) {
                        if (this.o2) {
                            return;
                        }
                        this.o2 = true;
                        ((w8) this.A1).j();
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
                TL_stories.PeerStories peerStories = f9Var.Q0;
                if (peerStories != null) {
                    this.C1.V(peerStories, true);
                } else {
                    long j3 = this.l1;
                    if (j3 != 0) {
                        p6 p6Var = this.C1;
                        TL_stories.PeerStories y10 = p6Var.y(j3);
                        if (y10 == null) {
                            y10 = p6Var.z(j3);
                            z10 = true;
                        }
                        p6Var.V(y10, z10);
                    }
                }
                org.telegram.ui.ActionBar.y0 y0Var = this.c1;
                if (y0Var != null) {
                    y0Var.animate().alpha((this.C1.M(this.l1) && this.y1.e && !bz.b()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == ks.o3) {
            d1(false);
            return;
        }
        if (i7 == ks.l4) {
            this.u0.c0.invalidate();
            return;
        }
        if (i7 == ks.G5) {
            p0(true);
            return;
        }
        if (i7 == ks.d3) {
            j6 o4 = mp.u1(this.m2).R1().o();
            if (o4 == null || !o4.a(this.m2, 1) || this.A1 == null) {
                return;
            }
            bi.e9 e9Var = new bi.e9(this, 2);
            Context W = org.telegram.messenger.g0.W(getContext());
            if (W == null) {
                W = LaunchActivity.H1;
            }
            ((w8) this.A1).h(new ug.k0(o4.b(), this.m2, W, e9Var, null));
            return;
        }
        if (i7 == ks.k3) {
            TL_account.RequirementToContact P2 = mp.u1(this.m2).P2(this.l1);
            boolean z11 = this.l1 >= 0 && !i10.i(this.m2).q() && (P2 instanceof TL_account.requirementToContactPremium);
            if (this.p1 == z11 && this.r1 == org.telegram.messenger.n5.k(P2)) {
                return;
            }
            this.p1 = z11;
            this.r1 = org.telegram.messenger.n5.k(P2);
            d1(false);
            p0(true);
            return;
        }
        if (i7 == ks.T) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.l1 == (-((TLRPC.ChatFull) obj).id)) {
                d1(false);
                return;
            }
            return;
        }
        if (i7 != ks.G2) {
            if (i7 == ks.F && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (f9Var == null || (c1Var = f9Var.B0) == null || c1Var.g() != longValue) {
            return;
        }
        d1(false);
        i2 i2Var = this.L1;
        if (i2Var != null) {
            i2Var.P(true);
            this.L1.z2(true);
            p0(true);
        }
        a2 a2Var = this.v0;
        if (a2Var != null) {
            c1 c1Var2 = a2Var.Q;
            if (a2Var.I != (c1Var2 != null ? c1Var2.j() : 0L)) {
                a2Var.e.O(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ee eeVar;
        Canvas canvas2;
        org.telegram.ui.Components.m6 m6Var;
        org.telegram.ui.Components.m6 m6Var2;
        j1();
        if (this.n1 && (m6Var2 = this.A0) != null) {
            m6Var2.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        if (this.n1 && (m6Var = this.B0) != null) {
            m6Var.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.e3;
        LinearLayout linearLayout = this.y0;
        t2 t2Var = this.n0;
        if (z10) {
            float measuredWidth = (t2Var.getMeasuredWidth() / 2.0f) + t2Var.getX() + linearLayout.getX();
            float measuredHeight = (t2Var.getMeasuredHeight() / 2.0f) + t2Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.g0.L(24.0f);
            float f10 = L / 2.0f;
            float T1 = org.telegram.messenger.g0.T1(this.g3, measuredWidth - f10, kr.g.getInterpolation(this.f3));
            float T12 = org.telegram.messenger.g0.T1(this.h3, measuredHeight - f10, this.f3);
            int W1 = org.telegram.messenger.g0.W1(this.f3, this.i3, L);
            if (this.Z2) {
                org.telegram.ui.Components.o5 o5Var = this.Y2;
                if (o5Var != null) {
                    float f11 = W1;
                    o5Var.setBounds((int) T1, (int) T12, (int) (T1 + f11), (int) (T12 + f11));
                    this.Y2.draw(canvas);
                }
            } else {
                float f12 = W1;
                ImageReceiver imageReceiver = this.X2;
                imageReceiver.z0(T1, T12, f12, f12);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.a3) {
            float measuredWidth2 = (t2Var.getMeasuredWidth() / 2.0f) + t2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (t2Var.getMeasuredHeight() / 2.0f) + t2Var.getY() + linearLayout.getY();
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
                imageReceiver2.z0(f16, f17, f14, f14);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.C() != null && imageReceiver2.C().A()) {
                    this.a3 = false;
                }
            }
        }
        i2 i2Var = this.L1;
        if (i2Var != null) {
            ee eeVar2 = i2Var.o2;
            ee eeVar3 = i2Var.p2;
            if (i2Var.getAlpha() == 0.0f || (eeVar = i2Var.f1) == null || eeVar.getParent() == null || i2Var.f1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(i2Var.f1.getX() + eeVar2.getX() + eeVar3.getX() + i2Var.getX(), i2Var.f1.getY() + eeVar2.getY() + eeVar3.getY() + i2Var.getY());
            if (i2Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, i2Var.getMeasuredWidth(), i2Var.getMeasuredHeight(), (int) (i2Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            i2Var.f1.draw(canvas2);
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
        i2 i2Var = this.L1;
        Paint paint = this.X1;
        t2 t2Var = this.n0;
        w3 w3Var = this.h1;
        if (view == i2Var) {
            float f10 = this.a2;
            x3 x3Var = this.y1;
            if (f10 > 0.0f && !x3Var.f) {
                w3Var.l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), w3Var.l);
            }
            RectF rectF = w3Var.h;
            RectF rectF2 = w3Var.i;
            RectF rectF3 = w3Var.j;
            rectF.set(this.L1.getX(), this.L1.getY() + this.L1.getAnimatedTop() + org.telegram.messenger.g0.L(1.33f), this.L1.getX() + this.L1.getMeasuredWidth(), this.L1.getY() + this.L1.getMeasuredHeight());
            float L2 = org.telegram.messenger.g0.L(40.0f);
            if (x3Var.f) {
                L = org.telegram.messenger.g0.L(46.0f);
                L2 = org.telegram.messenger.g0.L(46.0f);
                j1 j1Var = this.K1;
                if (j1Var != null && j1Var.getVisibility() == 0) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
            } else {
                if (this.C2) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (this.D2 && this.n1) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (t2Var != null && t2Var.getVisibility() == 0) {
                    L2 = (L2 - org.telegram.messenger.g0.L(40.0f)) + t2Var.getLayoutParams().width;
                }
                L = 0.0f;
            }
            rectF2.set(org.telegram.messenger.g0.L(10.0f) + L, ((this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(38.0f), (getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - L2, (this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f));
            this.L1.setTranslationX((1.0f - this.a2) * L);
            this.L1.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.z(1.0f, this.a2, -org.telegram.messenger.g0.L(2.0f), this.L1.getMeasuredHeight() > org.telegram.messenger.g0.L(50.0f) ? ((1.0f - this.a2) * (this.L1.getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f))) + 0.0f : 0.0f));
            float L3 = org.telegram.messenger.g0.L(50.0f) / 2.0f;
            org.telegram.messenger.g0.Z1(rectF2, w3Var.h, this.a2, rectF3);
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
            if (i2Var != null && i2Var.U0(view)) {
                float L4 = org.telegram.messenger.g0.L(30.0f);
                RectF rectF4 = w3Var.k;
                RectF rectF5 = w3Var.k;
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
                    gVar2.setAlpha(ks.e4);
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
                    view.setTranslationY((this.y0.getY() + (t2Var.getY() + (-(r2.getMeasuredHeight() - this.b3.getPaddingBottom())))) - org.telegram.messenger.g0.L(18.0f));
                } else {
                    c3 c3Var = this.M0;
                    if (view == c3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.r3) != null && !fVar.r) {
                        RecordingCanvas h = fVar.h(getMeasuredWidth(), getMeasuredHeight());
                        h.drawColor(i0.a.f(0.2f, -16777216, -1));
                        h.translate(c3Var.getX(), c3Var.getY());
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
                    T0((o6) arrayList13.get(i10 - arrayList2.size()), imageReceiver, j3);
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
                    o6 t6 = this.C1.t(j10, storyItem2);
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
                        int i19 = (messageMedia == null || !fj.K4(messageMedia.getDocument())) ? i15 : 1;
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
                                imageReceiver.v0(fc.g(storyItem2.attachPath), p5.c.v(j3, "_pframe"), fc.g(storyItem2.firstFramePath), j3, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i17;
                                str2 = null;
                                i13 = 1;
                                String str4 = j3;
                                imageReceiver.s0(fc.g(storyItem2.attachPath), str4, null, null, null, 0L, null, null, 0);
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
                                fc b10 = fc.b(p6.C(this.m2, storyItem2));
                                String v = p5.c.v(j3, "_pframe");
                                fc c10 = fc.c(w10, storyItem2.media.getDocument());
                                storyItem = storyItem2;
                                str = null;
                                i12 = 1;
                                imageReceiver2.v0(b10, v, c10, j3, null, null, null, 0L, null, storyItem, 0);
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
                                    imageReceiver2.v0(null, null, fc.i(w11, photo), j3, null, null, null, 0L, null, storyItem, 0);
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (((messageMedia3 == null || !fj.K4(messageMedia3.getDocument())) ? 0 : i12) != 0) {
                        TLRPC.Document C = p6.C(this.m2, storyItem);
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
                                        if (org.telegram.messenger.c6.h()) {
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
        w8 w8Var = (w8) this.A1;
        f9 f9Var = w8Var.d;
        if (bz.j() && bz.b()) {
            boolean z10 = f9Var.H0;
            ArrayList arrayList16 = f9Var.M0;
            if (z10) {
                return;
            }
            for (int i22 = 0; i22 < arrayList16.size(); i22++) {
                for (int i23 = 0; i23 < arrayList14.size(); i23++) {
                    if (((Uri) arrayList14.get(i23)).equals(((e9) arrayList16.get(i22)).uri)) {
                        arrayList14.remove(i23);
                    }
                }
            }
            for (int i24 = 0; i24 < arrayList14.size(); i24++) {
                Uri uri = (Uri) arrayList14.get(i24);
                e9 e9Var = new e9(f9Var, f9Var.D0, f9Var.C0);
                e9Var.setOnSeekUpdate(new l4(20, w8Var, e9Var));
                e9Var.uri = uri;
                TLRPC.Document document = (TLRPC.Document) arrayList15.get(i24);
                e9Var.document = document;
                if (document != null) {
                    i7 = 0;
                    org.telegram.messenger.r8.J.put(Long.valueOf(document.id), 0);
                } else {
                    i7 = 0;
                    ConcurrentHashMap concurrentHashMap = org.telegram.messenger.r8.I;
                }
                e9Var.preparePlayer(uri, f9.D1, f9.B1);
                arrayList16.add(e9Var);
                if (arrayList16.size() > 2) {
                    ((e9) arrayList16.remove(i7)).release(null);
                }
            }
        }
    }

    public final void f1() {
        if (this.q1) {
            TextView textView = this.R1;
            if (textView != null) {
                textView.setText(gd.N0(2131748630, null));
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
            textView3.setText(gd.N0(this.o1 ? 2131744421 : 2131744249, null));
        }
        TextView textView4 = this.S1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.S1.setText(gd.N0(2131744248, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i7;
        ArrayList arrayList = this.j1;
        f9 f9Var = this.t0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.g1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i7 = 0;
            } else {
                i7 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j3 = ((o6) arrayList2.get(i10)).a;
                    if (((int) (j3 ^ (j3 >>> 32))) == f9Var.P0) {
                        this.t1 = i10;
                        return;
                    }
                }
            }
            int indexOf = this.j1.indexOf(Integer.valueOf(f9Var.P0));
            if (indexOf < 0 && !this.j1.isEmpty()) {
                if (f9Var.P0 > ((Integer) this.j1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (f9Var.P0 < ((Integer) i5.c.h(1, this.j1)).intValue()) {
                    indexOf = this.j1.size() - 1;
                }
            }
            this.t1 = i7 + indexOf;
        } else {
            int i11 = f9Var.e1.get(this.l1, -1);
            this.t1 = i11;
            if (i11 == -1 && !f9Var.N0 && (peerStories = this.e1) != null && peerStories.max_read_id > 0) {
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
        c3 c3Var = this.M0;
        Bitmap createBitmap = Bitmap.createBitmap(c3Var.getWidth(), c3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.t1;
    }

    public p6 getStoriesController() {
        return mp.u1(this.m2).R1();
    }

    public int getStoriesCount() {
        return Math.max(this.n2, this.f1.size()) + this.g1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f1;
    }

    public final void h1() {
        h6 h6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f1;
        arrayList.clear();
        f9 f9Var = this.t0;
        if (!f9Var.N0) {
            ArrayList arrayList2 = this.j1;
            int i7 = 0;
            ArrayList arrayList3 = this.g1;
            if (arrayList2 != null && (h6Var = f9Var.O0) != null) {
                if (h6Var instanceof a6) {
                    arrayList3.clear();
                    ArrayList F = mp.u1(this.m2).R1().F(this.l1);
                    String str = ((a6) f9Var.O0).E;
                    if (F != null) {
                        for (int i10 = 0; i10 < F.size(); i10++) {
                            o6 o6Var = (o6) F.get(i10);
                            hi.x7 x7Var = o6Var.c;
                            if (x7Var != null && !x7Var.g && TextUtils.equals(x7Var.K0, str)) {
                                arrayList3.add(o6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.j1;
                int size = arrayList4.size();
                while (i7 < size) {
                    Object obj = arrayList4.get(i7);
                    i7++;
                    fj f10 = f9Var.O0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (f9Var.O0 != null) {
                while (i7 < f9Var.O0.i.size()) {
                    arrayList.add(((fj) f9Var.O0.i.get(i7)).l);
                    i7++;
                }
            } else {
                TL_stories.PeerStories peerStories = f9Var.Q0;
                if (peerStories == null || org.telegram.messenger.n5.o(peerStories.peer) != this.l1) {
                    TL_stories.PeerStories y10 = this.C1.y(this.l1);
                    this.e1 = y10;
                    if (y10 == null) {
                        this.e1 = this.C1.z(this.l1);
                    }
                } else {
                    this.e1 = f9Var.Q0;
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
        } else if (!f9Var.S0) {
            arrayList.add(f9Var.T0);
        }
        this.k1 = getStoriesCount();
    }

    public final void i0(boolean z10) {
        z3 currentPeerView;
        z40 z40Var = this.t2;
        if (z40Var != null) {
            z40Var.f0 = null;
            z40Var.a(false);
        }
        long j3 = this.l1;
        TL_stories.StoryItem storyItem = this.y1.a;
        f9 f9Var = this.t0;
        f9Var.getClass();
        if (j3 != 0 && storyItem != null) {
            f9.E1.remove(j3 + (j3 >> 16) + (storyItem.id << 16));
        }
        this.S2 = true;
        v8 v8Var = f9Var.o0;
        if (v8Var != null && (currentPeerView = v8Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z10) {
            org.telegram.ui.Components.fc J = new kc(this.M0, this.l0).J(R.raw.forward, gd.N0(2131748290, null), gd.N0(2131743302, null), 5000, false, new r1(this, 2));
            J.r = false;
            J.k(false);
        }
        mp.u1(this.m2).t0(this.l1, 0, null);
    }

    public final void i1(boolean z10) {
        int i7;
        int i10;
        x3 x3Var = this.y1;
        TL_stories.StoryItem storyItem = x3Var.a;
        if (storyItem == null) {
            storyItem = x3Var.c;
        }
        boolean z11 = this.n1;
        if (z11 || this.m1) {
            if (storyItem == null) {
                this.k2.setText("");
                this.p2.setVisibility(8);
                this.l2.setVisibility(8);
                return;
            }
            f9 f9Var = this.t0;
            t2 t2Var = this.n0;
            if (!z11) {
                int i11 = 3;
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.k2.setText(f9Var.O0 == null ? gd.N0(2131747930, null) : gd.N0(2131747929, null));
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
                        TLObject g22 = mp.u1(this.m2).g2(storyItem.views.recent_viewers.get(i12).longValue());
                        if (g22 != null) {
                            this.l2.b(i13, this.m2, g22);
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        kq kqVar = new kq(R.drawable.mini_views_likes, 0);
                        kqVar.y = -53704;
                        kqVar.n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder.setSpan(kqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        kq kqVar2 = new kq(R.drawable.mini_repost_story, 0);
                        kqVar2.y = -14161823;
                        kqVar2.n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder.setSpan(kqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
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
                t2Var.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
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
            org.telegram.ui.Components.m6 m6Var = this.B0;
            if (m6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.F0 = false;
            } else {
                m6Var.t(Integer.toString(i10), z10 && this.F0, true);
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
                org.telegram.ui.Components.c6 c6Var = this.D0;
                if (c6Var != null) {
                    c6Var.e(true, this.F0 ? 1.0f : 0.0f);
                }
            }
            TLRPC.Chat O0 = mp.u1(this.m2).O0(Long.valueOf(-this.l1));
            if (!(this.o1 && (org.telegram.messenger.v3.q(O0) || org.telegram.messenger.v3.s0(O0))) && storyItem.views.views_count > 0) {
                this.k2.setText(f9Var.O0 == null ? gd.N0(2131747930, null) : gd.N0(2131747929, null));
                this.k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new kq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.o0(storyItem.views.views_count, 0));
                this.k2.setText(spannableStringBuilder2);
            } else {
                this.k2.setText("");
            }
            t2Var.getLayoutParams().width = (int) (org.telegram.messenger.g0.L(40.0f) + (this.E0 ? this.A0.d + org.telegram.messenger.g0.L(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + t2Var.getLayoutParams().width;
            t2 t2Var2 = this.z0;
            if (t2Var2 != null) {
                t2Var2.getLayoutParams().width = (int) (org.telegram.messenger.g0.L(40.0f) + (this.F0 ? org.telegram.messenger.g0.L(4.0f) + this.B0.d : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin += t2Var2.getLayoutParams().width;
                t2Var2.requestLayout();
            }
            this.G1.requestLayout();
            t2Var.requestLayout();
            this.l2.setVisibility(8);
            this.p2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = x3Var.a;
            y2 y2Var = this.T0;
            if (storyItem2 == null) {
                y2Var.getClass();
                return;
            }
            for (int i16 = 0; i16 < y2Var.getChildCount(); i16++) {
                if (y2Var.getChildAt(i16) instanceof m8) {
                    ((m8) y2Var.getChildAt(i16)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void j0() {
        u6 u6Var = this.o0;
        u6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new f2(0, u6Var)).setDuration(150L).start();
        int L = org.telegram.messenger.g0.L(8.0f);
        u6 u6Var2 = new u6(getContext(), this.h1);
        this.o0 = u6Var2;
        u6Var2.setPadding(L, L, L, L);
        this.o0.setAlpha(0.0f);
        this.o0.setScaleX(0.8f);
        this.o0.setScaleY(0.8f);
        this.o0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.n0.addView(this.o0, na.e(40, 40, 3));
        this.a3 = false;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    public final void j1() {
        /*
            Method dump skipped, instructions count: 1615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.z3.j1():void");
    }

    public final void k0(boolean z10) {
        ValueAnimator valueAnimator = this.N3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O3, z10 ? 1.0f : 0.0f);
        this.N3 = ofFloat;
        ofFloat.addUpdateListener(new s1(this, 2));
        this.N3.addListener(new d2(this, z10, 1));
        this.N3.setDuration(420L);
        this.N3.setInterpolator(kr.h);
        this.N3.start();
    }

    public final void l0(Runnable runnable) {
        if (mp.u1(this.m2).A2()) {
            org.telegram.ui.b.b(this.m2);
            return;
        }
        int i7 = bz.e0;
        if (i7 <= 0 || !this.U2) {
            runnable.run();
            return;
        }
        int i10 = i7 - 1;
        bz.e0 = i10;
        bz.T(i10);
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(0, getContext(), this.l0);
        t1Var.setTitle(gd.N0(2131744644, null));
        t1Var.n(gd.N0(2131744645, null));
        String N0 = gd.N0(2131746549, null);
        ba.b bVar = new ba.b(runnable);
        t1Var.m0 = N0;
        t1Var.n0 = bVar;
        String N02 = gd.N0(2131752577, null);
        ci.v vVar = new ci.v(26);
        t1Var.o0 = N02;
        t1Var.p0 = vVar;
        t1Var.show();
    }

    public final void m0(int i7) {
        this.o2 = false;
        this.F2 = true;
        this.l3 = false;
        this.n1 = false;
        this.o1 = false;
        long j3 = this.l1;
        v3 v3Var = this.Y0;
        org.telegram.ui.Components.a9 a9Var = this.X0;
        if (j3 >= 0) {
            this.m1 = j3 == i10.i(this.m2).e();
            TLRPC.User c22 = mp.u1(this.m2).c2(Long.valueOf(this.l1));
            TL_account.RequirementToContact P2 = mp.u1(this.m2).P2(this.l1);
            this.p1 = !i10.i(this.m2).q() && (P2 instanceof TL_account.requirementToContactPremium);
            this.r1 = org.telegram.messenger.n5.k(P2);
            a9Var.r(c22);
            v3Var.a.getImageReceiver().j0(c22, a9Var, null);
            U0(this.l1, true, false);
        } else {
            this.m1 = false;
            this.n1 = true;
            if (this.C1.h(j3)) {
                this.l3 = true;
            } else {
                boolean z10 = org.telegram.messenger.s2.a;
            }
            TLRPC.Chat O0 = mp.u1(this.m2).O0(Long.valueOf(-this.l1));
            boolean V = org.telegram.messenger.v3.V(O0);
            this.o1 = !V;
            if (!V && mp.u1(this.m2).P0(-this.l1) == null) {
                tr.a0(this.m2).F0(-this.l1, true, new CountDownLatch(1), false, false, 0);
            }
            this.p1 = this.o1 && !org.telegram.messenger.v3.q(O0);
            this.r1 = mp.u1(this.m2).P1(this.l1);
            a9Var.q(O0);
            v3Var.a.getImageReceiver().j0(O0, a9Var, null);
            U0(this.l1, true, false);
        }
        if (this.u1 && (this.m1 || this.n1)) {
            p6 p6Var = this.C1;
            long j10 = this.l1;
            a0.h hVar = p6Var.m;
            o9 o9Var = (o9) hVar.f(j10);
            if (o9Var == null) {
                o9Var = new o9(p6Var.a, j10, p6Var);
                hVar.k(o9Var, j10);
            }
            o9Var.b(true);
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
        c3 c3Var = this.M0;
        f9 f9Var = this.t0;
        int i10 = 8;
        x3 x3Var = this.y1;
        if (z11) {
            z0();
            if (this.L1 == null && (this.o1 || x3Var.f)) {
                t0();
            }
            if (this.L1 != null) {
                TLRPC.Chat O02 = mp.u1(this.m2).O0(Long.valueOf(-this.l1));
                i2 i2Var = this.L1;
                if (x3Var.f || (!G0() && this.o1 && (org.telegram.messenger.v3.q(O02) || org.telegram.messenger.v3.s0(O02)))) {
                    i10 = 0;
                }
                i2Var.setVisibility(i10);
                i2 i2Var2 = this.L1;
                boolean z12 = x3Var.f;
                B0(true);
                i2Var2.L1(z12);
                this.L1.T1(x3Var.f && !B0(true) && (this.f2 || this.L1.X0), true);
                mt editField = this.L1.getEditField();
                long j11 = this.l1;
                TL_stories.StoryItem storyItem = x3Var.a;
                f9Var.getClass();
                editField.setText(f9.A(j11, storyItem));
                this.L1.E1(this.m2, this.l1);
                this.L1.t2(O02, null);
            }
            org.telegram.ui.Components.m6 m6Var = this.A0;
            org.telegram.ui.ActionBar.i6 i6Var = this.l0;
            if (m6Var == null) {
                org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(false, false, false);
                this.A0 = m6Var2;
                t2 t2Var = this.n0;
                m6Var2.setCallback(t2Var);
                this.A0.u(i6Var.i(org.telegram.ui.ActionBar.n6.G6));
                this.A0.w(org.telegram.messenger.g0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.c6(t2Var);
            }
            t2 t2Var2 = this.z0;
            if (t2Var2 != null && this.B0 == null) {
                org.telegram.ui.Components.m6 m6Var3 = new org.telegram.ui.Components.m6(false, false, false);
                this.B0 = m6Var3;
                m6Var3.setCallback(t2Var2);
                this.B0.u(i6Var.i(org.telegram.ui.ActionBar.n6.G6));
                this.B0.w(org.telegram.messenger.g0.L(14.0f));
                this.D0 = new org.telegram.ui.Components.c6(t2Var2);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            this.k1 = getStoriesCount();
            c3Var.invalidate();
            invalidate();
        } else if (this.m1) {
            z0();
            if (x3Var.f) {
                this.G1.setVisibility(8);
                if (this.L1 == null) {
                    t0();
                }
                this.L1.setVisibility(0);
            } else {
                this.G1.setVisibility(0);
                i2 i2Var3 = this.L1;
                if (i2Var3 != null) {
                    i2Var3.setVisibility(8);
                }
            }
            i2 i2Var4 = this.L1;
            if (i2Var4 != null) {
                boolean z13 = x3Var.f;
                B0(true);
                i2Var4.L1(z13);
                this.L1.T1(x3Var.f && !B0(true) && (this.f2 || this.L1.X0), true);
            }
            if (i7 == -1) {
                ArrayList arrayList = this.j1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(f9Var.P0));
                    if (indexOf < 0 && !this.j1.isEmpty()) {
                        if (f9Var.P0 > ((Integer) this.j1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (f9Var.P0 < ((Integer) i5.c.h(1, this.j1)).intValue()) {
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
            c3Var.invalidate();
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
                this.Q1.setVisibility(((!this.p1 || x3Var.f) && !this.q1) ? 8 : 0);
            }
            d8 d8Var = this.T1;
            if (d8Var != null) {
                d8Var.setVisibility(8);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            i2 i2Var5 = this.L1;
            if (i2Var5 != null) {
                i2Var5.setVisibility((G0() || n10.B(this.l1)) ? 8 : 0);
                i2 i2Var6 = this.L1;
                boolean z14 = x3Var.f;
                B0(true);
                i2Var6.L1(z14);
                this.L1.T1(x3Var.f && !B0(true) && (this.f2 || this.L1.X0), true);
                mt editField2 = this.L1.getEditField();
                long j12 = this.l1;
                TL_stories.StoryItem storyItem2 = x3Var.a;
                f9Var.getClass();
                editField2.setText(f9.A(j12, storyItem2));
                this.L1.E1(this.m2, this.l1);
                TLRPC.UserFull d2 = mp.u1(this.m2).d2(this.l1);
                if (d2 != null) {
                    this.L1.t2(null, d2);
                } else {
                    mp.u1(this.m2).c3(mp.u1(this.m2).c2(Long.valueOf(this.l1)), this.j2, false, null);
                }
            }
            this.k1 = getStoriesCount();
            t2 t2Var3 = this.G1;
            if (t2Var3 != null) {
                t2Var3.setVisibility(8);
            }
            c3Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        g3 g3Var = this.u0;
        if (g3Var.a0.x()) {
            g3Var.a0.f(false);
        }
    }

    public final void o0() {
        if (this.u1) {
            ((w8) this.A1).d.V();
        }
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.O0.Q();
        this.Q0.Q();
        this.P0.Q();
        this.V2.Q();
        this.X2.Q();
        i2 i2Var = this.L1;
        if (i2Var != null) {
            i2Var.g1();
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i7 >= arrayList.size()) {
                ks.f(this.m2).c(this, ks.T);
                ks.f(this.m2).c(this, ks.G2);
                ks.f(this.m2).c(this, ks.y5);
                ks.f(this.m2).c(this, ks.o3);
                ks.f(this.m2).c(this, ks.A5);
                ks.f(this.m2).c(this, ks.G5);
                ks.f(this.m2).c(this, ks.d3);
                ks.f(this.m2).c(this, ks.k3);
                ks.f(this.m2).c(this, ks.F);
                ks.e().c(this, ks.l4);
                return;
            }
            ((ch.g0) arrayList.get(i7)).b(true);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        this.O0.S();
        this.Q0.S();
        this.P0.S();
        this.V2.S();
        this.X2.S();
        i2 i2Var = this.L1;
        if (i2Var != null) {
            i2Var.f1();
        }
        org.telegram.ui.Components.o5 o5Var = this.Y2;
        if (o5Var != null) {
            o5Var.n(this);
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
                ks.f(this.m2).n(this, ks.T);
                ks.f(this.m2).n(this, ks.G2);
                ks.f(this.m2).n(this, ks.y5);
                ks.f(this.m2).n(this, ks.o3);
                ks.f(this.m2).n(this, ks.A5);
                ks.f(this.m2).n(this, ks.G5);
                ks.f(this.m2).n(this, ks.d3);
                ks.f(this.m2).n(this, ks.k3);
                ks.f(this.m2).n(this, ks.F);
                ks.e().n(this, ks.l4);
                return;
            }
            ((ch.g0) arrayList.get(i7)).b(false);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.cu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        z40 z40Var;
        boolean z10;
        float L;
        FrameLayout.LayoutParams layoutParams;
        xi0 xi0Var;
        k2 k2Var;
        f9 f9Var = this.t0;
        if (f9Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        }
        int i11 = 0;
        if (this.u1 && this.J2 == null) {
            this.i2 = ((w8) this.A1).d.q0;
        } else {
            this.i2 = 0;
        }
        int size = f9Var.b ? View.MeasureSpec.getSize(i10) : View.MeasureSpec.getSize(i10) + this.i2;
        int size2 = (int) ((View.MeasureSpec.getSize(i7) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.i2 < org.telegram.messenger.g0.L(20.0f)) {
            this.i2 = 0;
        }
        int i12 = this.i2;
        xi0 xi0Var2 = this.b3;
        if (xi0Var2 == null || xi0Var2.getReactionsWindow() == null || this.b3.getReactionsWindow().q) {
            i2 i2Var = this.L1;
            if (i2Var != null && (i2Var.T0() || this.L1.a4)) {
                if (this.L1.getEmojiView().getMeasuredHeight() == 0) {
                    i12 = this.L1.getEmojiPadding();
                } else {
                    i2 i2Var2 = this.L1;
                    if (i2Var2.p4) {
                        i2Var2.Q();
                        i12 = this.L1.getStickersExpandedHeight();
                    } else {
                        i12 = i2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.b3.getReactionsWindow().c.animate().translationY(-this.i2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
            i12 = 0;
        }
        boolean z11 = this.f2;
        int i13 = this.Y1;
        v3 v3Var = this.Y0;
        int i14 = 1;
        if (i13 != i12) {
            this.f2 = false;
            int i15 = 3;
            x3 x3Var = this.y1;
            f10 = 8.0f;
            if (i12 <= 0 || !this.u1) {
                i2 i2Var3 = this.L1;
                if (i2Var3 != null) {
                    f9.P(this.l1, x3Var.a, i2Var3.getEditText());
                }
            } else {
                this.f2 = true;
                this.S2 = false;
                this.d2 = i12;
                if (this.P1 == null) {
                    xi0 xi0Var3 = new xi0(1, this.m2, getContext(), LaunchActivity.Q(), new g2(i15, this.l0));
                    this.P1 = xi0Var3;
                    xi0Var3.setHint(gd.N0(this.o1 ? 2131744422 : 2131744259, null));
                    xi0 xi0Var4 = this.P1;
                    xi0Var4.O0 = true;
                    addView(xi0Var4, this.s0, na.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.P1.setDelegate(new x2(this));
                    this.P1.p(null, null, true);
                }
                this.P1.setFragment(LaunchActivity.Q());
                this.P1.setHint(gd.N0(this.o1 ? 2131744422 : 2131744259, null));
                ch.l0 l0Var = ch.l0.B;
                if (l0Var != null) {
                    l0Var.l = true;
                }
                ch.l0 l0Var2 = ch.l0.C;
                if (l0Var2 != null) {
                    l0Var2.l = true;
                }
            }
            i2 i2Var4 = this.L1;
            if (i2Var4 != null) {
                i2Var4.T1(x3Var.f && !B0(true) && this.f2, true);
            }
            if (this.f2 && (k2Var = this.N2) != null) {
                k2Var.setVisibility(0);
            }
            if (!this.f2 && (xi0Var = this.P1) != null) {
                xi0Var.n();
            }
            v3Var.setEnabled(!this.f2);
            if (this.L1 != null) {
                org.telegram.messenger.g0.X3(null, !this.f2, 0.1f, true, true);
            }
            if (this.u1 && this.f2) {
                f9 f9Var2 = ((w8) this.A1).d;
                if (!f9Var2.y) {
                    f9Var2.y = true;
                    f9Var2.V();
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
            ofFloat.addUpdateListener(new s1(this, i11));
            this.Z1.addListener(new e2(this, i14));
            if (this.f2) {
                this.Z1.setDuration(250L);
                this.Z1.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                f9Var.m();
            } else {
                this.Z1.setDuration(500L);
                this.Z1.setInterpolator(kr.h);
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
                        canvas.drawColor(i0.a.o(-1, ks.n1));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (x3Var.f) {
                        hi.u3 u3Var = this.N1;
                        if (u3Var != null) {
                            if (!u3Var.W) {
                                removeView(u3Var);
                            }
                        }
                        if (!B0(true) && mp.g1().getInt("taptostoryhighlighthint", 0) < 3) {
                            mp.g1().edit().putInt("taptostoryhighlighthint", mp.g1().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            hi.u3 u3Var2 = new hi.u3(getContext(), 3);
                            this.N1 = u3Var2;
                            u3Var2.v(gd.N0(2131748620, null));
                            this.N1.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            hi.u3 u3Var3 = this.N1;
                            u3Var3.L = Layout.Alignment.ALIGN_OPPOSITE;
                            u3Var3.r0 = new di.f2(27, this, u3Var2);
                            addView(u3Var3, na.e(-1, 100, 87));
                            this.N1.x();
                            j1();
                        }
                    }
                } else {
                    i2 i2Var5 = this.L1;
                    if (i2Var5 != null) {
                        i2Var5.getEditField().clearFocus();
                    }
                    hi.u3 u3Var4 = this.N1;
                    if (u3Var4 != null) {
                        u3Var4.f(true);
                    }
                }
                this.e2 = true;
            } else {
                this.e2 = false;
            }
        } else {
            f10 = 8.0f;
        }
        i2 i2Var6 = this.L1;
        if (i2Var6 != null && i2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.L1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        c3 c3Var = this.M0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c3Var.getLayoutParams();
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
            c3Var.setLayoutParams(layoutParams2);
        }
        t2 t2Var = this.G1;
        if (t2Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) t2Var.getLayoutParams();
            if (this.h2) {
                layoutParams3.topMargin = org.telegram.messenger.g0.L(f10) + L2 + size2;
            } else {
                layoutParams3.topMargin = (L2 + size2) - org.telegram.messenger.g0.L(48.0f);
            }
        }
        xb xbVar = this.L2;
        if (xbVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) xbVar.getLayoutParams();
            if (this.h2) {
                c10 = 0;
                this.L2.setTextColor(i0.a.f(0.5f, -16777216, -1));
                layoutParams4.topMargin = org.telegram.messenger.g0.L(12.0f) + L2 + size2;
                z40Var = this.t2;
                if (z40Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) z40Var.getLayoutParams();
                    if (i12 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.f3.B(64.0f, L2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = org.telegram.messenger.g0.L(64.0f) + i12;
                    }
                }
                z10 = this.h2;
                LinearLayout linearLayout = this.y0;
                g3 g3Var = this.u0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((L2 + size2) - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(40.0f);
                    int L3 = this.m1 ? org.telegram.messenger.g0.L(40.0f) : org.telegram.messenger.g0.L(56.0f);
                    ((FrameLayout.LayoutParams) g3Var.getLayoutParams()).bottomMargin = L3;
                    if (this.g2 != this.h2) {
                        g3Var.setLayoutParams((FrameLayout.LayoutParams) g3Var.getLayoutParams());
                    }
                    g3Var.v0 = L3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f) + L2 + size2;
                    ((FrameLayout.LayoutParams) g3Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(f10);
                    if (this.g2 != this.h2) {
                        g3Var.setLayoutParams((FrameLayout.LayoutParams) g3Var.getLayoutParams());
                    }
                    g3Var.v0 = org.telegram.messenger.g0.L(f10);
                }
                this.F2 = true;
                L = org.telegram.messenger.g0.L(48.0f);
                if (this.m0.getVisibility() == 0) {
                    L += org.telegram.messenger.g0.L(60.0f);
                }
                if (this.i0.getVisibility() == 0) {
                    L += org.telegram.messenger.g0.L(40.0f);
                }
                u3 u3Var5 = v3Var.b;
                TextView[] textViewArr = v3Var.c;
                layoutParams = (FrameLayout.LayoutParams) u3Var5.getLayoutParams();
                if (layoutParams.rightMargin != L) {
                    int i16 = (int) L;
                    layoutParams.rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i16;
                    v3Var.forceLayout();
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.g2 = this.h2;
            }
            this.L2.setTextColor(i0.a.o(-1, ks.V2));
            layoutParams4.topMargin = ((L2 + size2) - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(40.0f);
        }
        c10 = 0;
        z40Var = this.t2;
        if (z40Var != null) {
        }
        z10 = this.h2;
        LinearLayout linearLayout2 = this.y0;
        g3 g3Var2 = this.u0;
        if (z10) {
        }
        this.F2 = true;
        L = org.telegram.messenger.g0.L(48.0f);
        if (this.m0.getVisibility() == 0) {
        }
        if (this.i0.getVisibility() == 0) {
        }
        u3 u3Var52 = v3Var.b;
        TextView[] textViewArr2 = v3Var.c;
        layoutParams = (FrameLayout.LayoutParams) u3Var52.getLayoutParams();
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
            r1 r1Var = this.z3;
            org.telegram.messenger.g0.r(r1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.C1.B;
            this.L1.P(true);
            boolean z11 = this.p1;
            x3 x3Var = this.y1;
            if ((z11 && !x3Var.f) || this.q1) {
                this.U2 = false;
                this.L1.setEnabled(false);
                this.L1.N1(" ", z10);
                return;
            }
            if (this.r1 > 0) {
                this.U2 = false;
                this.L1.setEnabled(true);
                this.L1.N1(pb.T0(gd.a0(null, null, 2131743679, gd.E(this.r1, ','))), z10);
                return;
            }
            if (!x3Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.m2).getCurrentTime();
                int i7 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i7) {
                    this.U2 = true;
                    int currentTime2 = i7 - ConnectionsManager.getInstance(this.m2).getCurrentTime();
                    int i10 = currentTime2 / 60;
                    int i11 = currentTime2 % 60;
                    Locale locale = Locale.US;
                    int measureText = (int) this.L1.getEditField().getPaint().measureText(gd.a0(null, null, 2131744647, String.format(locale, "%02d:%02d", 99, 99)));
                    this.L1.setEnabled(true);
                    if (measureText * 1.2f >= this.L1.getEditField().getMeasuredWidth()) {
                        i2 i2Var = this.L1;
                        String a02 = gd.a0(null, null, 2131744647, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11));
                        i2Var.e = a02;
                        i2Var.f = format;
                        i2Var.p2(z10);
                    } else {
                        this.L1.N1(gd.a0(null, null, 2131744648, String.format(locale, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11))), z10);
                    }
                    org.telegram.messenger.g0.h3(r1Var, 1000L);
                    return;
                }
            }
            this.U2 = false;
            this.L1.setEnabled(true);
            if (!x3Var.f) {
                this.L1.N1(gd.N0(this.o1 ? 2131746054 : 2131746059, null), z10);
                return;
            }
            if (this.L1.getStarsPrice() <= 0) {
                this.L1.N1(gd.N0(2131751993, null), z10);
                return;
            }
            this.L1.N1(pb.Z0(false, gd.a0(null, null, 2131751992, gd.E((int) r0, ',')), this.L1.L6), z10);
            kq kqVar = this.L1.L6[0];
            if (kqVar != null) {
                kqVar.H = 0.9f;
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
        y2 y2Var = this.T0;
        if (y2Var != null) {
            hi.u3 u3Var = y2Var.c;
            if (u3Var != null) {
                u3Var.f(true);
                y2Var.c = null;
            }
            y2Var.b = null;
            y2Var.invalidate();
            y2Var.b(false);
        }
        g3 g3Var = this.u0;
        if (g3Var.a0.x()) {
            g3Var.a0.f(false);
            return true;
        }
        hi.u3 u3Var2 = this.p0;
        if (u3Var2 != null) {
            u3Var2.f(true);
        }
        hi.u3 u3Var3 = this.q0;
        if (u3Var3 != null) {
            u3Var3.f(true);
        }
        j30 j30Var = this.G2;
        if (j30Var != null) {
            j30Var.a();
        }
        r3 r3Var = this.d1;
        if (r3Var != null && r3Var.a) {
            r3Var.a();
            return true;
        }
        i2 i2Var = this.L1;
        if (i2Var != null && i2Var.V0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.l0);
            boolean z10 = this.L1.d1;
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            if (z10) {
                t1Var.S = gd.N0(2131751383, null);
                t1Var.U = gd.N0(2131751384, null);
            } else {
                t1Var.S = gd.N0(2131751380, null);
                t1Var.U = gd.N0(2131751381, null);
            }
            alertDialog$Builder.k(gd.N0(2131751382, null), new o1(this, i7));
            alertDialog$Builder.h(gd.N0(2131751759, null), null);
            ((w8) this.A1).h(t1Var);
            return true;
        }
        xi0 xi0Var = this.P1;
        if (xi0Var != null && xi0Var.getReactionsWindow() != null && !this.P1.getReactionsWindow().q) {
            this.P1.getReactionsWindow().d();
            return true;
        }
        i2 i2Var2 = this.L1;
        if (i2Var2 != null && i2Var2.T0()) {
            if (this.i2 > 0) {
                org.telegram.messenger.g0.v1(this.L1.getEmojiView());
                return true;
            }
            this.L1.K0();
            return true;
        }
        if (getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            if (g3Var.getVisibility() != 0 || g3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            g3Var.D();
            this.Q2 = false;
            this.M0.invalidate();
            return true;
        }
        i2 i2Var3 = this.L1;
        if (i2Var3 != null) {
            long j3 = this.l1;
            TL_stories.StoryItem storyItem = this.y1.a;
            Editable editText = i2Var3.getEditText();
            this.t0.getClass();
            f9.P(j3, storyItem, editText);
        }
        org.telegram.messenger.g0.v1(this.L1);
        return true;
    }

    public final void r0() {
        if (this.s2 == null) {
            n2 n2Var = new n2(this, getContext(), this.l0);
            this.s2 = n2Var;
            n2Var.X3 = new o2(this);
            n2Var.e2.i0();
            n2 n2Var2 = this.s2;
            n2Var2.R1 = true;
            n2Var2.f1();
            n2 n2Var3 = this.s2;
            n2Var3.S1 = new p2(this);
            n2Var3.b1().setText(this.L1.getFieldText());
        }
    }

    public final void s0() {
        if (this.H1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.s3);
        this.H1 = aVar;
        aVar.setOnClickListener(new t1(this, 1));
        addView(this.H1, na.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public void setAccount(int i7) {
        this.m2 = i7;
        this.C1 = mp.u1(i7).i0;
        this.U0.b = i7;
        xi0 xi0Var = this.P1;
        if (xi0Var != null) {
            xi0Var.setCurrentAccount(i7);
            this.P1.p(null, null, true);
        }
        xi0 xi0Var2 = this.b3;
        if (xi0Var2 != null) {
            xi0Var2.setCurrentAccount(i7);
        }
    }

    public void setActive(boolean z10) {
        R0(0L, z10);
    }

    public void setDelegate(s3 s3Var) {
        this.A1 = s3Var;
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
                    org.telegram.messenger.g0.h3(saVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(saVar);
                    f9 f9Var = ((w8) this.A1).d;
                    f9Var.l1 = true;
                    f9Var.V();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.B1 != z10) {
            this.B1 = z10;
            s2 s2Var = this.O0;
            if (z10) {
                s2Var.R0();
                s2Var.u0 = false;
            } else {
                s2Var.Q0(false);
                s2Var.u0 = true;
            }
            this.H0 = 0L;
            this.M0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.i6 i6Var = this.l0;
        i2 i2Var = new i2(this, org.telegram.messenger.g0.W(getContext()), this, new g2(1, i6Var));
        this.L1 = i2Var;
        mt editField = i2Var.getEditField();
        editField.getClass();
        et etVar = new et(editField, 0);
        editField.u0 = etVar;
        etVar.q(true);
        editField.u0.u(editField.y0);
        editField.u0.w(editField.getPaint().getTextSize());
        et etVar2 = new et(editField, 1);
        editField.v0 = etVar2;
        etVar2.b = 5;
        etVar2.u(editField.y0);
        editField.v0.w(editField.getPaint().getTextSize());
        this.L1.getEditField().setScaleX(0.0f);
        this.L1.setOverrideKeyboardAnimation(true);
        this.L1.setClipChildren(false);
        this.L1.setDelegate(new j2(this));
        setDelegate(this.L1);
        i2 i2Var2 = this.L1;
        i2Var2.Y5 = false;
        i2Var2.Z5 = true;
        if (this.y1.f) {
            i2Var2.y1(false, false, false);
        } else {
            i2Var2.y1(true, true, false);
        }
        this.L1.updateColors();
        i2 i2Var3 = this.L1;
        i2Var3.a6 = true;
        addView(i2Var3, na.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.y3 != null) {
            this.L1.z2(false);
        }
        this.L1.w3 = this.j2;
        y3 y3Var = this.w2;
        ((ArrayList) y3Var.g).add(this.M0);
        ((ArrayList) y3Var.g).add(this);
        if (this.K0) {
            this.L1.g1();
        }
        p0(false);
        if (G0()) {
            this.L1.setVisibility(8);
        }
        lh.h hVar = new lh.h(getContext(), i6Var, this.s3, this.p3);
        this.M1 = hVar;
        hVar.setOnClickListener(new o1(this, 1));
        addView(this.M1, na.e(57, ks.X4, 85));
        this.M1.setVisibility(8);
        this.L1.setSideButtonsForAttach(this.M1);
        this.s0 = getChildCount();
    }

    public final void u0() {
        if (this.T1 != null) {
            return;
        }
        d8 d8Var = new d8(getContext(), this.l0);
        this.T1 = d8Var;
        d8Var.setOnClickListener(new t1(this, 4));
        this.T1.setAlpha(0.0f);
        this.T1.setVisibility(8);
        addView(this.T1, na.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        if (this.K1 != null || getContext() == null) {
            return;
        }
        j1 j1Var = new j1(getContext(), this.s3);
        this.K1 = j1Var;
        j1Var.setOnClickListener(new t1(this, 5));
        j1 j1Var2 = this.K1;
        c1 c1Var = c1.X;
        boolean z10 = true;
        j1Var2.b(c1Var != null && c1Var.o(), false);
        j1 j1Var3 = this.K1;
        c1 c1Var2 = c1.X;
        if (c1Var2 != null && !c1Var2.m()) {
            z10 = false;
        }
        j1Var3.a(z10, false);
        addView(this.K1, na.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void w0() {
        if (this.J1 != null || getContext() == null) {
            return;
        }
        this.I1 = new m1(getContext(), this.m2);
        n1 n1Var = new n1(getContext(), this.I1, this.s3);
        this.J1 = n1Var;
        n1Var.setOnClickListener(new t1(this, 6));
        this.J1.setOnLongClickListener(new q1(this, 1));
        addView(this.J1, na.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.I1, na.d(ks.e3, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
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
        this.R1.setText(gd.N0(this.o1 ? 2131744421 : 2131744249, null));
        TextView textView2 = new TextView(getContext());
        this.S1 = textView2;
        textView2.setTextColor(-1);
        this.S1.setTextSize(1, 12.0f);
        TextView textView3 = this.S1;
        int L = org.telegram.messenger.g0.L(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.S1.setGravity(17);
        c8.sa.a(this.S1);
        this.S1.setText(gd.N0(2131744248, null));
        this.S1.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        this.Q1.addView(imageView, na.t(22, 22, 16, 12, 1, 4, 0));
        this.Q1.addView(this.R1, na.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.Q1.addView(this.S1, na.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.L1.addView(this.Q1, na.d(-1, -1.0f, ks.E1, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.L2 != null) {
            return;
        }
        xb xbVar = new xb(getContext(), 1);
        this.L2 = xbVar;
        xbVar.setTextSize(1, 14.0f);
        this.L2.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.L2.setGravity(19);
        this.L2.setText(gd.N0(2131744247, null));
        addView(this.L2, na.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.G1 != null) {
            return;
        }
        t2 t2Var = new t2(this, getContext(), 0);
        this.G1 = t2Var;
        t2Var.setClickable(true);
        addView(this.G1, na.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        u2 u2Var = new u2(this, getContext());
        this.p2 = u2Var;
        u2Var.setOnClickListener(new t1(this, 0));
        this.G1.addView(this.p2, na.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        u uVar = new u(0, getContext(), false);
        this.l2 = uVar;
        uVar.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        this.G1.addView(this.l2, na.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.k2 = textView;
        textView.setTextSize(1, 14.0f);
        this.k2.setTextColor(-1);
        this.G1.addView(this.k2, na.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.h1.s);
        u2 u2Var2 = this.p2;
        int L = org.telegram.messenger.g0.L(15.0f);
        int o4 = i0.a.o(-1, 120);
        u2Var2.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, o4, o4));
        imageView.setBackground(org.telegram.ui.ActionBar.n6.O(i0.a.o(-1, 120), -org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f)));
    }
}
