package ei;

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
import b8.mf;
import b8.pf;
import b8.rf;
import ci.ec;
import ci.wb;
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
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.ls;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.us;
import org.telegram.messenger.yy;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fx;
import org.telegram.ui.u51;
import org.telegram.ui.vq0;
import org.telegram.ui.wm;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class j4 extends qt0 implements cs {
    public org.telegram.ui.Components.g6 A0;
    public c4 A1;
    public float A2;
    public int A3;
    public org.telegram.ui.Components.g6 B0;
    public boolean B1;
    public long B2;
    public final a2 B3;
    public org.telegram.ui.Components.u5 C0;
    public z6 C1;
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
    public d3 G1;
    public u20 G2;
    public final a3.o G3;
    public long H0;
    public a H1;
    public final vq0 H2;
    public final org.telegram.ui.Components.u5 H3;
    public boolean I0;
    public v1 I1;
    public boolean I2;
    public final org.telegram.ui.Components.u5 I3;
    public boolean J0;
    public w1 J1;
    public a3 J2;
    public final org.telegram.ui.Components.u5 J3;
    public boolean K0;
    public s1 K1;
    public FrameLayout K2;
    public float K3;
    public boolean L0;
    public s2 L1;
    public ec L2;
    public final Path L3;
    public final m3 M0;
    public mh.h M1;
    public boolean M2;
    public boolean M3;
    public final FrameLayout N0;
    public gi.l3 N1;
    public u2 N2;
    public ValueAnimator N3;
    public final c3 O0;
    public ValueAnimator O1;
    public float O2;
    public float O3;
    public final ImageReceiver P0;
    public li0 P1;
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
    public final i3 T0;
    public n8 T1;
    public boolean T2;
    public final fx U0;
    public ViewPropertyAnimator U1;
    public boolean U2;
    public o4 V0;
    public final gh.g V1;
    public final ImageReceiver V2;
    public float W0;
    public final gh.g W1;
    public dh.d W2;
    public final org.telegram.ui.Components.u8 X0;
    public final Paint X1;
    public final ImageReceiver X2;
    public final f4 Y0;
    public int Y1;
    public org.telegram.ui.Components.g5 Y2;
    public final o8 Z0;
    public ValueAnimator Z1;
    public boolean Z2;
    public l6.n a1;
    public float a2;
    public boolean a3;
    public int b1;
    public float b2;
    public li0 b3;
    public org.telegram.ui.ActionBar.y0 c1;
    public float c2;
    public boolean c3;
    public b4 d1;
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
    public final g4 h1;
    public boolean h2;
    public int h3;
    public final ai.d2 i0;
    public final cg.q0 i1;
    public int i2;
    public int i3;
    public final fh0 j0;
    public ArrayList j1;
    public final int j2;
    public a2 j3;
    public final ImageView k0;
    public int k1;
    public TextView k2;
    public float k3;
    public final org.telegram.ui.ActionBar.e6 l0;
    public long l1;
    public v l2;
    public boolean l3;
    public final u8 m0;
    public boolean m1;
    public int m2;
    public k4.j m3;
    public final d3 n0;
    public boolean n1;
    public int n2;
    public org.telegram.ui.ActionBar.y0 n3;
    public e7 o0;
    public boolean o1;
    public boolean o2;
    public org.telegram.ui.ActionBar.y0 o3;
    public gi.l3 p0;
    public boolean p1;
    public e3 p2;
    public final eh.c p3;
    public gi.l3 q0;
    public boolean q1;
    public boolean q2;
    public final si.a q3;
    public gi.l3 r0;
    public long r1;
    public float r2;
    public final si.f r3;
    public int s0;
    public final float s1;
    public x2 s2;
    public final hh.b s3;
    public final r9 t0;
    public int t1;
    public k40 t2;
    public TL_stories.TL_premium_boostsStatus t3;
    public final q3 u0;
    public boolean u1;
    public int u2;
    public org.telegram.messenger.e3 u3;
    public final k2 v0;
    public int v1;
    public boolean v2;
    public long v3;
    public final View w0;
    public int w1;
    public final i4 w2;
    public long w3;
    public final ImageView x0;
    public int x1;
    public final g2.g x2;
    public boolean x3;
    public final LinearLayout y0;
    public final h4 y1;
    public final org.telegram.ui.Components.u5 y2;
    public TLRPC.TL_channels_sendAsPeers y3;
    public final d3 z0;
    public final l2.e z1;
    public final org.telegram.ui.Components.u5 z2;
    public final a2 z3;

    public j4(Context context, final r9 r9Var, g4 g4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.L0 = true;
        this.R0 = new ArrayList();
        this.b1 = -5;
        this.s1 = 1.0f;
        h4 h4Var = new h4(this);
        this.y1 = h4Var;
        this.a2 = -1.0f;
        this.b2 = -1.0f;
        this.c2 = -1.0f;
        this.j2 = ConnectionsManager.generateClassGuid();
        this.y2 = new org.telegram.ui.Components.u5(this);
        this.z2 = new org.telegram.ui.Components.u5(this);
        vq0 vq0Var = new vq0();
        this.H2 = vq0Var;
        this.O2 = 1.0f;
        this.z3 = new a2(this, 4);
        this.B3 = new a2(this, 11);
        this.C3 = new ArrayList();
        this.D3 = new ArrayList();
        this.G3 = new a3.o(this, 20);
        this.H3 = new org.telegram.ui.Components.u5(this);
        this.I3 = new org.telegram.ui.Components.u5(this);
        this.J3 = new org.telegram.ui.Components.u5(this);
        this.L3 = new Path();
        vq0Var.E = new android.support.v4.media.c(this, 21);
        i4 i4Var = new i4();
        i4Var.g = new ArrayList();
        this.w2 = i4Var;
        this.x2 = new g2.g((int[]) null);
        this.f1 = new ArrayList();
        this.g1 = new ArrayList();
        final int i3 = 0;
        c3 c3Var = new c3(this, i3);
        this.O0 = c3Var;
        c3Var.B0 = false;
        c3Var.A1 = true;
        c3Var.y = true;
        c3Var.h0(0);
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
        c3Var.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.X0 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.t0 = r9Var;
        this.h1 = g4Var;
        this.z1 = g4Var.g;
        this.C1 = hp.s1(h10.t0).P1();
        g4Var.l.setColor(-16777216);
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
        i3 i3Var = new i3(this, context, this.M0, e6Var, r9Var);
        this.T0 = i3Var;
        hh.b bVar = new hh.b(e6Var, org.telegram.ui.ActionBar.k6.Ge, 0.8f);
        this.s3 = bVar;
        si.c cVar = new si.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !az.e()) {
            this.r3 = null;
            this.q3 = cVar;
        } else {
            si.f fVar = new si.f(cVar);
            this.r3 = fVar;
            fVar.k(org.telegram.messenger.g0.L(8.0f));
            this.q3 = fVar;
        }
        kh.k kVar = new kh.k(this);
        si.a aVar = this.q3;
        eh.c cVar2 = new eh.c(aVar, aVar, aVar);
        cVar2.h = kVar;
        cVar2.i = this;
        this.p3 = cVar2;
        this.V1 = cVar2.c(this, bVar, false);
        gh.g c2 = cVar2.c(this, bVar, false);
        this.W1 = c2;
        c2.u(org.telegram.messenger.g0.L(32.0f));
        m3 m3Var = new m3(this, context, g4Var, r9Var);
        this.M0 = m3Var;
        m3Var.setClipChildren(false);
        this.U0 = new fx(this.m2, m3Var);
        m3Var.addView(i3Var, mf.c(-1.0f, -1));
        q3 q3Var = new q3(this, getContext(), r9Var.E, r9Var, e6Var);
        this.u0 = q3Var;
        q3Var.c0.setOnClickListener(new c2(this, 10));
        ImageView imageView = new ImageView(context);
        this.x0 = imageView;
        imageView.setImageDrawable(g4Var.m);
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new c2(this, 11));
        imageView.setContentDescription(bd.M0(2131745469, null));
        pf.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(g4Var.n);
        imageView2.setPadding(L, L, L, L);
        d3 d3Var = new d3(this, getContext(), 1);
        this.z0 = d3Var;
        org.telegram.ui.Components.g6 g6Var = this.B0;
        if (g6Var != null) {
            g6Var.setCallback(d3Var);
        }
        d3Var.setWillNotDraw(false);
        d3Var.setOnClickListener(new c2(this, 12));
        d3 d3Var2 = new d3(this, getContext(), 2);
        this.n0 = d3Var2;
        org.telegram.ui.Components.g6 g6Var2 = this.A0;
        if (g6Var2 != null) {
            g6Var2.setCallback(d3Var2);
        }
        d3Var2.setWillNotDraw(false);
        d3Var2.setOnClickListener(new c2(this, 13));
        d3Var2.setOnLongClickListener(new j2(i3, this, r9Var));
        e7 e7Var = new e7(context, g4Var);
        this.o0 = e7Var;
        e7Var.setPadding(L, L, L, L);
        d3Var2.addView(this.o0, mf.e(40, 40, 3));
        d3Var.addView(imageView2, mf.e(40, 40, 3));
        pf.b(d3Var2, 0.3f, 5.0f);
        pf.b(d3Var, 0.3f, 5.0f);
        c3Var.A1 = true;
        c3Var.H0(m3Var);
        cg.q0 q0Var = new cg.q0(10);
        this.i1 = q0Var;
        m3Var.setOutlineProvider(q0Var);
        m3Var.setClipToOutline(true);
        addView(m3Var);
        f4 f4Var = new f4(context, h4Var);
        this.Y0 = f4Var;
        f4Var.setOnClickListener(new View.OnClickListener(this) { // from class: ei.y1
            public final /* synthetic */ j4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i3;
                r9 r9Var2 = r9Var;
                j4 j4Var = this.b;
                switch (i10) {
                    case 0:
                        long j10 = h10.i(j4Var.m2).n;
                        long j11 = j4Var.l1;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                r9Var2.V(wm.ra(j11));
                                break;
                            } else {
                                r9Var2.V(ProfileActivity.A4(j11));
                                break;
                            }
                        } else {
                            Bundle k10 = org.telegram.ui.Cells.f1.k(1, TeXSymbolParser.TYPE_ATTR);
                            k10.putLong("dialog_id", j4Var.l1);
                            r9Var2.V(new r80(k10, null));
                            break;
                        }
                    default:
                        if (!j4Var.y1.j()) {
                            j4Var.a1(true);
                            break;
                        } else {
                            r9Var2.c0();
                            if (!r9.E1) {
                                hp.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            j4Var.i0.setContentDescription(bd.M0(!r9.E1 ? 2131748322 : 2131743859, null));
                            break;
                        }
                }
            }
        });
        m3Var.addView(f4Var, mf.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(imageView, mf.r(40, 40, 5));
        linearLayout.addView(d3Var, mf.r(40, 40, 5));
        linearLayout.addView(d3Var2, mf.r(40, 40, 5));
        addView(linearLayout, mf.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.g0 = imageView3;
        imageView3.setImageDrawable(g4Var.q);
        imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(-1, 1, -1));
        imageView3.setContentDescription(bd.M0(2131754839, null));
        m3Var.addView(imageView3, mf.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.h0 = imageView4;
        imageView4.setImageDrawable(g4Var.r);
        imageView4.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.h0(-1, 1, -1));
        imageView4.setContentDescription(bd.M0(2131754808, null));
        m3Var.addView(imageView4, mf.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ai.b(r9Var, 18));
        imageView3.setOnClickListener(new f0(this, e6Var, r9Var, context, g4Var, 1));
        ai.d2 d2Var = new ai.d2(context, 2);
        this.i0 = d2Var;
        m3Var.addView(d2Var, mf.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        fh0 fh0Var = new fh0(context);
        this.j0 = fh0Var;
        fh0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        d2Var.addView(fh0Var);
        ImageView imageView5 = new ImageView(context);
        this.k0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        imageView5.setImageDrawable(g4Var.t);
        d2Var.addView(imageView5);
        imageView5.setVisibility(8);
        u8 u8Var = new u8(context);
        this.m0 = u8Var;
        u8Var.setOnClickListener(new c2(this, 2));
        m3Var.addView(u8Var, mf.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i10 = 1;
        d2Var.setOnClickListener(new View.OnClickListener(this) { // from class: ei.y1
            public final /* synthetic */ j4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i10;
                r9 r9Var2 = r9Var;
                j4 j4Var = this.b;
                switch (i102) {
                    case 0:
                        long j10 = h10.i(j4Var.m2).n;
                        long j11 = j4Var.l1;
                        if (j10 != j11) {
                            if (j11 <= 0) {
                                r9Var2.V(wm.ra(j11));
                                break;
                            } else {
                                r9Var2.V(ProfileActivity.A4(j11));
                                break;
                            }
                        } else {
                            Bundle k10 = org.telegram.ui.Cells.f1.k(1, TeXSymbolParser.TYPE_ATTR);
                            k10.putLong("dialog_id", j4Var.l1);
                            r9Var2.V(new r80(k10, null));
                            break;
                        }
                    default:
                        if (!j4Var.y1.j()) {
                            j4Var.a1(true);
                            break;
                        } else {
                            r9Var2.c0();
                            if (!r9.E1) {
                                hp.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            j4Var.i0.setContentDescription(bd.M0(!r9.E1 ? 2131748322 : 2131743859, null));
                            break;
                        }
                }
            }
        });
        this.Z0 = new o8(this, g4Var);
        m3Var.addView(q3Var, mf.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        k2 k2Var = new k2(this, context, r9Var, r9Var.w, view, frameLayout, r9Var);
        this.v0 = k2Var;
        m3Var.addView(view, mf.e(-1, hs.e3, 87));
        m3Var.addView(k2Var, mf.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        m3Var.addView(frameLayout, mf.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        d2Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o10, o10));
        int L3 = org.telegram.messenger.g0.L(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o11, o11));
        int L4 = org.telegram.messenger.g0.L(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.k0(L4, L4, L4, L4, 0, o12, o12));
        int L5 = org.telegram.messenger.g0.L(20.0f);
        int o13 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.k0(L5, L5, L5, L5, 0, o13, o13));
        int L6 = org.telegram.messenger.g0.L(20.0f);
        int o14 = i0.a.o(-1, 100);
        d3Var2.setBackground(org.telegram.ui.ActionBar.k6.k0(L6, L6, L6, L6, 0, o14, o14));
        int L7 = org.telegram.messenger.g0.L(20.0f);
        int o15 = i0.a.o(-1, 100);
        d3Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L7, L7, L7, L7, 0, o15, o15));
        org.telegram.ui.Cells.r9 r9Var2 = q3Var.a0;
        View n4 = r9Var2.n(context);
        if (n4 != null) {
            org.telegram.messenger.g0.E2(n4);
            addView(n4);
        }
        r9Var2.D = new l2(this, 0);
        r9Var2.S(this);
    }

    public static void T0(y6 y6Var, ImageReceiver imageReceiver, String str) {
        if (y6Var.s) {
            imageReceiver.u0(null, null, ac.g(y6Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.r0(ac.g(y6Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(j4 j4Var, ValueAnimator valueAnimator) {
        u8 u8Var = j4Var.m0;
        j4Var.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f4 f4Var = j4Var.Y0;
        f4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.O3);
        f4Var.setAlpha(1.0f - j4Var.O3);
        ImageView imageView = j4Var.g0;
        imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.O3);
        imageView.setAlpha(1.0f - j4Var.O3);
        ImageView imageView2 = j4Var.h0;
        imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.O3);
        imageView2.setAlpha(1.0f - j4Var.O3);
        ai.d2 d2Var = j4Var.i0;
        d2Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.O3);
        d2Var.setAlpha((1.0f - j4Var.O3) * j4Var.O2);
        d3 d3Var = j4Var.G1;
        if (d3Var != null) {
            d3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * j4Var.O3);
            j4Var.G1.setAlpha(1.0f - j4Var.O3);
        }
        if (u8Var != null) {
            u8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.O3);
            u8Var.setAlpha(1.0f - j4Var.O3);
        }
        j4Var.u0.setAlpha(1.0f - j4Var.O3);
        c4 c4Var = j4Var.A1;
        float f10 = c4Var == null ? 0.0f : ((i9) c4Var).d.W;
        float hideInterfaceAlpha = j4Var.getHideInterfaceAlpha();
        d3 d3Var2 = j4Var.n0;
        if (d3Var2 != null) {
            d3Var2.setAlpha((1.0f - j4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = j4Var.x0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - j4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        d3 d3Var3 = j4Var.z0;
        if (d3Var3 != null) {
            d3Var3.setAlpha((1.0f - j4Var.O3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        s2 s2Var = j4Var.L1;
        if (s2Var != null) {
            s2Var.setAlpha(1.0f - j4Var.O3);
            j4Var.invalidate();
        }
        j4Var.M0.invalidate();
    }

    public static void Y(j4 j4Var, boolean z10) {
        org.telegram.ui.ActionBar.y0 y0Var = j4Var.n3;
        if (y0Var == null || j4Var.m3 == null || y0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(r9.C1 - 0.2f) < 0.05f) {
                j4Var.n3.setSubtext(bd.M0(2131743584, null));
            } else if (Math.abs(r9.C1 - 0.5f) < 0.05f) {
                j4Var.n3.setSubtext(bd.M0(2131743586, null));
            } else if (Math.abs(r9.C1 - 1.0f) < 0.05f) {
                j4Var.n3.setSubtext(bd.M0(2131743587, null));
            } else if (Math.abs(r9.C1 - 1.5f) < 0.05f) {
                j4Var.n3.setSubtext(bd.M0(2131743588, null));
            } else if (Math.abs(r9.C1 - 2.0f) < 0.05f) {
                j4Var.n3.setSubtext(bd.M0(2131743585, null));
            } else {
                j4Var.n3.setSubtext(bd.a0(null, null, 2131743589, cu0.a(r9.C1) + "x"));
            }
        }
        j4Var.m3.K(z10, r9.C1);
    }

    public static void Z(j4 j4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (j4Var.G0() || j4Var.y1.f) {
            return;
        }
        if (h10.i(j4Var.m2).q()) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, bd.M0(2131744897, null), false, j4Var.l0).setOnClickListener(new c2(j4Var, 8));
            return;
        }
        Drawable drawable = j4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        m2 m2Var = new m2(j4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, bd.M0(2131744897, null), false, j4Var.l0);
        c2.setOnClickListener(new c2(j4Var, 9));
        c2.setIcon(m2Var);
    }

    public static void b0(j4 j4Var) {
        h4 h4Var = j4Var.y1;
        TL_stories.StoryItem storyItem = h4Var.a;
        if ((storyItem == null && h4Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = h4Var.h();
        boolean z10 = h4Var.e;
        if (h == null || !h.exists()) {
            j4Var.Y0();
            return;
        }
        MediaController.d0(h.toString(), j4Var.getContext(), z10 ? 1 : 0, null, null, new ci.b8(1, j4Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c0(j4 j4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.Chat chat;
        if (j10 > 0) {
            TLRPC.User a22 = hp.s1(j4Var.m2).a2(Long.valueOf(j10));
            str = a22.first_name;
            z10 = a22.stories_hidden;
            chat = a22;
        } else {
            TLRPC.Chat M0 = hp.s1(j4Var.m2).M0(Long.valueOf(-j10));
            str = M0.title;
            z10 = M0.stories_hidden;
            chat = M0;
        }
        org.telegram.messenger.g0.i3(new ci.n(j4Var, hp.s1(j4Var.m2), j10, !z10, str, chat), 200L);
    }

    public static void d0(j4 j4Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, j4Var.getContext(), j4Var.l0);
        String M0 = bd.M0(j4Var.G0() ? 2131751565 : 2131751488, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = bd.M0(j4Var.G0() ? 2131751566 : 2131751489, null);
        alertDialog$Builder.k(bd.M0(2131751599, null), new x1(j4Var, 2));
        alertDialog$Builder.h(bd.M0(2131752589, null), new d2.t1(20));
        ((i9) j4Var.A1).h(s1Var);
        s1Var.i();
    }

    public static void f0(j4 j4Var) {
        org.telegram.ui.ActionBar.e6 e6Var = j4Var.l0;
        m3 m3Var = j4Var.M0;
        if (j4Var.q1) {
            return;
        }
        int i3 = 0;
        if (!j4Var.o1) {
            s2 s2Var = j4Var.L1;
            int i10 = -j4Var.b1;
            j4Var.b1 = i10;
            org.telegram.messenger.g0.G3(i10, s2Var, null);
            org.telegram.messenger.p2.E.a();
            String p10 = j4Var.l1 >= 0 ? l10.p(hp.s1(j4Var.m2).a2(Long.valueOf(j4Var.l1))) : "";
            (hp.s1(j4Var.m2).D3() ? new fc(m3Var, e6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131743768, p10))) : new fc(m3Var, e6Var).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131743768, p10)), bd.M0(2131743769, null), new a2(j4Var, 5))).j();
            return;
        }
        if (j4Var.t3 != null && j4Var.u3 != null) {
            vg.i0.w1(new ai.c7(j4Var, 2), j4Var.t3, j4Var.u3, j4Var.l1, true);
            return;
        }
        r9 r9Var = j4Var.t0;
        if (r9Var != null) {
            r9Var.l1 = true;
            r9Var.d0();
        }
        hp.s1(j4Var.m2).G0().a(j4Var.l1, new d2(j4Var, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.m2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f10 = 1.0f - this.y2.c;
        s5 s5Var = this.t0.x;
        return (1.0f - (s5Var == null ? 0.0f : s5Var.f)) * f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        r9 r9Var;
        if (!this.y1.f || (r9Var = this.t0) == null || r9Var.B0 == null || B0(true)) {
            return 0L;
        }
        return r9Var.B0.j();
    }

    public static void h0(j4 j4Var) {
        h4 h4Var = j4Var.y1;
        if (h4Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = h4Var.a.id;
        tL_stories_exportStoryLink.peer = hp.s1(j4Var.m2).j1(j4Var.l1);
        ConnectionsManager.getInstance(j4Var.m2).sendRequest(tL_stories_exportStoryLink, new b3());
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
        textView.setText(bd.M0(2131744463, null));
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.l0;
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        TextView textView2 = new TextView(getContext());
        pf.a(textView2);
        textView2.setText(bd.M0(2131754230, null));
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, o10, o10);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView2, k02, N, h, e6Var);
        textView2.setOnClickListener(new c2(this, 3));
        linearLayout.addView(textView, mf.o(-1, -2));
        linearLayout.addView(textView2, mf.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, mf.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.M0.addView(frameLayout);
        this.K2 = frameLayout;
    }

    public final boolean B0(boolean z10) {
        g1 g1Var;
        TLRPC.Peer i3;
        g1 g1Var2;
        long e10 = h10.i(this.m2).e();
        long j10 = this.l1;
        r9 r9Var = this.t0;
        if (j10 >= 0 || (g1Var2 = r9Var.B0) == null) {
            if (j10 < 0 || r9Var == null || (g1Var = r9Var.B0) == null || !g1Var.l()) {
                return false;
            }
            return !z10 || (i3 = r9Var.B0.i()) == null || this.l1 == org.telegram.messenger.m5.o(i3) || org.telegram.messenger.m5.o(i3) == e10 || this.l1 == e10;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer i10 = g1Var2.i();
        TLRPC.Chat M0 = hp.s1(this.m2).M0(Long.valueOf(-this.l1));
        if (r9Var.B0.l() || org.telegram.messenger.t3.w(14, M0)) {
            return i10 == null || this.l1 == org.telegram.messenger.m5.o(i10) || org.telegram.messenger.m5.o(i10) == h10.i(this.m2).e();
        }
        return false;
    }

    public final void C0(Canvas canvas, int i3, int i10) {
        TextureView textureView;
        i4 i4Var = this.w2;
        org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) i4Var.e;
        if (l4Var != null && ((SurfaceView) i4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i3, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.g0.z0((SurfaceView) i4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (l4Var != null && (textureView = (TextureView) i4Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i3, i10);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        m3 m3Var = this.M0;
        canvas.scale(i3 / m3Var.getMeasuredWidth(), i10 / m3Var.getMeasuredHeight());
        this.O0.h(canvas, null);
        canvas.restore();
    }

    public final void D0(gi.r8 r8Var, TL_stories.StoryItem storyItem) {
        c4 c4Var = this.A1;
        gi.t8 t8Var = new gi.t8(storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, getContext(), this.l0);
        t8Var.W0(r8Var);
        gi.g1 g1Var = t8Var.j1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof gi.o8) {
                    ((gi.o8) view).f(false);
                }
            }
        }
        t8Var.Q0(true);
        t8Var.L1 = new ai.n(14, this, storyItem);
        ((i9) c4Var).h(t8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r3 == r10.P1) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(ViewGroup viewGroup, float f10, float f11, boolean z10) {
        gi.l3 l3Var;
        i4 i4Var;
        org.telegram.ui.l4 l4Var;
        if (viewGroup != null) {
            gi.l3 l3Var2 = this.p0;
            if ((l3Var2 == null || !l3Var2.W) && ((l3Var = this.q0) == null || !l3Var.W)) {
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        q3 q3Var = this.u0;
                        if (childAt == q3Var) {
                            Rect rect = org.telegram.messenger.g0.Q;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f10, (int) f11)) {
                                float top = f11 - childAt.getTop();
                                g8 g8Var = q3Var.c0;
                                if (g8Var.x == 1.0f && !q3Var.t0) {
                                    if (top > g8Var.getTranslationY() + (q3Var.s0.getTop() - q3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.M0 || (i4Var = this.w2) == null || (l4Var = (org.telegram.ui.l4) i4Var.e) == null || !E0(l4Var, f10 - childAt.getX(), f11 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f10, (int) f11))) {
                            i3 i3Var = this.T0;
                            if (childAt == i3Var && i3Var.b == null && (f10 < org.telegram.messenger.g0.L(60.0f) || f10 > viewGroup.getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f))) {
                                Matrix matrix = i3Var.e;
                                float[] fArr = i3Var.f;
                                for (int i10 = 0; i10 < i3Var.getChildCount(); i10++) {
                                    View childAt2 = i3Var.getChildAt(i10);
                                    if (childAt2 != i3Var.d && (childAt2 instanceof w8)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f10;
                                        fArr[1] = f11;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                k2 k2Var = this.v0;
                                if (childAt == k2Var) {
                                    u51 u51Var = k2Var.f;
                                    ci.j1 j1Var = k2Var.c;
                                    u51 u51Var2 = k2Var.f;
                                    u51Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f10 - k2Var.getX()) - u51Var2.getX()), (int) ((f11 - k2Var.getY()) - u51Var2.getY()))) {
                                        if (k2Var.g0) {
                                            continue;
                                        } else if (!this.f2) {
                                            if (f11 <= k2Var.s() + k2Var.getY() && j1Var.E(f10, (f11 - k2Var.getY()) - j1Var.getY()) == null) {
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
                                            s2 s2Var = this.L1;
                                            if (s2Var != null && childAt == s2Var.getRecordCircle()) {
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
        m3 m3Var = this.M0;
        float x11 = view.getX() + m3Var.getX() + x10;
        float y9 = view.getY() + m3Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y9 && motionEvent.getY() <= y9 + ((float) view.getHeight());
    }

    public final boolean G0() {
        r6 r6Var;
        r9 r9Var = this.t0;
        return (r9Var == null || (r6Var = r9Var.P0) == null || r6Var.e != 4) ? false : true;
    }

    public final boolean H0() {
        TLRPC.User a22;
        return G0() && (a22 = hp.s1(this.m2).a2(Long.valueOf(this.t0.P0.d))) != null && a22.bot && a22.bot_can_edit;
    }

    public abstract boolean I0();

    public final void J0(dh.n0 n0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        h4 h4Var = this.y1;
        TL_stories.StoryItem storyItem = h4Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && n0Var == null) {
            j0();
            this.C1.j0(this.l1, h4Var.a, null);
        } else if (n0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(this.m2).r.get("❤");
            if (tL_availableReaction != null) {
                this.Z2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a10 = dh.j0.a();
                ac b10 = ac.b(document);
                ImageReceiver imageReceiver = this.V2;
                imageReceiver.q0(b10, a10, null, null, null, 0);
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                this.a3 = true;
                this.C1.j0(this.l1, h4Var.a, dh.n0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.C1.j0(this.l1, h4Var.a, n0Var);
        }
        TL_stories.StoryItem storyItem2 = h4Var.a;
        d3 d3Var = this.n0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.o0.setReaction(null);
            d3Var.setContentDescription(bd.M0(2131754851, null));
            z10 = false;
        } else {
            z11 = !z11;
            this.o0.setReaction(dh.n0.d(reaction));
            d3Var.setContentDescription(bd.M0(2131754850, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.n1 && z11) {
            TL_stories.StoryItem storyItem3 = h4Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = h4Var.a.views;
            int i3 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i3;
            if (i3 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = h4Var.a;
        dh.p0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        g1 g1Var;
        if (this.y3 != null) {
            return;
        }
        r9 r9Var = this.t0;
        if (r9Var != null && (g1Var = r9Var.B0) != null) {
            if (g1Var.w == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers M1 = hp.s1(this.m2).M1(this.l1, true);
        this.y3 = M1;
        s2 s2Var = this.L1;
        if (s2Var == null || M1 == null) {
            return;
        }
        s2Var.Q1(true);
    }

    public final boolean L0() {
        s2 s2Var = this.L1;
        if (s2Var == null) {
            return false;
        }
        boolean z10 = s2Var.A2;
        if (z10) {
            s2Var.r1();
        }
        org.telegram.messenger.g0.i3(new a2(this, 3), 300L);
        return z10;
    }

    public final void M0() {
        CharSequence charSequence;
        long j10;
        d2 d2Var;
        int i3;
        long j11;
        hp.e1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.L1.getTextWithEntities();
        long e10 = h10.i(this.m2).e();
        TLRPC.Peer i10 = this.t0.B0.i();
        if (i10 != null) {
            e10 = org.telegram.messenger.m5.o(i10);
        }
        Context context = getContext();
        int i11 = this.m2;
        String s6 = org.telegram.messenger.m5.s(i11, this.l1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.v3;
        d2 d2Var2 = new d2(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, context, (org.telegram.ui.ActionBar.e6) bVar, false);
        t2Var.N();
        t2Var.w0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        t2Var.O = f10;
        int[] iArr = hp.s1(i11).X6;
        CharSequence j02 = zi.j0(textWithEntities, false, false, new TextPaint());
        if (j02 instanceof Spannable) {
            Spannable spannable = (Spannable) j02;
            charSequence = j02;
            j10 = j12;
            d2Var = d2Var2;
            i3 = ((org.telegram.ui.Components.p5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.p5.class)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(0, charSequence.length(), org.telegram.messenger.f6.class)).length;
        } else {
            charSequence = j02;
            j10 = j12;
            d2Var = d2Var2;
            i3 = 0;
        }
        int max = (int) Math.max(messageMinPrice, j10 <= 0 ? 100L : j10);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                j11 = messageMinPrice;
                break;
            }
            int i12 = length * 7;
            int i13 = iArr[i12];
            j11 = messageMinPrice;
            int i14 = iArr[i12 + 2];
            if (i3 <= iArr[i12 + 3] && charSequence.length() <= i14) {
                max = Math.max(max, i13);
                break;
            } else {
                length--;
                messageMinPrice = j11;
            }
        }
        long[] jArr = {max};
        gi.d dVar = new gi.d(context, null, true);
        u0 u0Var = new u0();
        u0Var.c = e10;
        u0Var.f = textWithEntities;
        u0Var.g = jArr[0];
        p0 p0Var = new p0(i11, context, true);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        ai.o2 o2Var = new ai.o2(context, bd.M0(2131748822, null), bVar);
        f11.addView(o2Var, mf.q(-1, -1, 1.0f, hs.x1, 0, 0, 5, 0));
        ai.o2 o2Var2 = new ai.o2(context, bd.M0(2131748823, null), bVar);
        f11.addView(o2Var2, mf.q(-1, -1, 1.0f, hs.x1, 5, 0, 5, 0));
        ai.o2 o2Var3 = new ai.o2(context, bd.M0(2131748824, null), bVar);
        f11.addView(o2Var3, mf.q(-1, -1, 1.0f, hs.x1, 5, 0, 0, 0));
        t tVar = new t(context, bVar, r1);
        d2 d2Var3 = d2Var;
        long j13 = j11;
        u10[] u10VarArr = {new s(jArr, dVar, new wp[1], u0Var, p0Var, i11, o2Var, o2Var2, o2Var3, tVar, new boolean[]{true})};
        p0Var.set(u0Var);
        int i15 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i16 = hp.s1(i11).Y6;
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        while (true) {
            if (i17 >= i15) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i17] >= j13) {
                if (i17 > 0 && arrayList.isEmpty() && iArr3[i17] > j13) {
                    arrayList.add(Integer.valueOf((int) j13));
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
        if (arrayList.isEmpty() || ((Integer) k2.p1.h(1, arrayList)).intValue() < i16) {
            arrayList.add(Integer.valueOf(i16));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            iArr4[i19] = ((Integer) arrayList.get(i19)).intValue();
        }
        tVar.f0 = iArr4;
        tVar.setValue((int) jArr[0]);
        f10.addView(tVar, mf.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        u10VarArr[0].a(Integer.valueOf((int) jArr[0]));
        f10.addView(f11, mf.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.k6.j5;
        TextView b10 = rf.b(context, 20.0f, i20, true, bVar);
        org.telegram.messenger.k5.m(b10, 17, null, 2131748819);
        f10.addView(b10, mf.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = rf.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.k5.r(null, null, 2131748820, new Object[]{s6}, b11);
        f10.addView(b11, mf.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        f10.addView(p0Var, mf.t(-2, -2, 17, 42, 22, 42, 20));
        f10.addView(dVar, mf.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        t2Var.show();
        dVar.setOnClickListener(new ai.h(d2Var3, jArr, t2Var, 9));
    }

    public final void N0() {
        if (this.L1 == null) {
            return;
        }
        r0();
        this.s2.b2.i0();
        this.s2.y1(-1, true);
        x2 x2Var = this.s2;
        x2Var.R1 = this.l1;
        x2Var.e1();
        this.s2.a1().setText(this.L1.getFieldText());
        ((i9) this.A1).h(this.s2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j10 = this.l1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog S0 = hp.s1(this.m2).S0(this.l1);
        if (S0 != null) {
            bundle.putInt("message_id", S0.top_message);
        }
        this.t0.V(new wm(bundle));
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
        gi.r3 r3Var;
        g1 g1Var;
        boolean z10 = this.u1;
        i4 i4Var = this.w2;
        if (!z10) {
            i4Var.e = null;
            return;
        }
        h4 h4Var = this.y1;
        boolean z11 = h4Var.f;
        m3 m3Var = this.M0;
        if (!z11) {
            if (!h4Var.e) {
                org.telegram.messenger.a8.b("PeerStoriesView.requestVideoPlayer(" + j10 + "): null, not a video");
                ((i9) this.A1).c(null, null, 0L, this.w2);
                i4Var.e = null;
                i4Var.a = false;
                return;
            }
            if (h4Var.f() == null || !new File(h4Var.f()).exists()) {
                TL_stories.StoryItem storyItem = h4Var.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.l1;
                    try {
                        document2 = z6.C(this.m2, storyItem);
                        try {
                            TL_stories.StoryItem storyItem2 = h4Var.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = org.telegram.messenger.w7.G(this.m2).F(h4Var.a);
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
                            sb2.append(h4Var.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(org.telegram.messenger.w7.B(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.f(bArr));
                            sb2.append("&sid=");
                            sb2.append(h4Var.a.id);
                            sb2.append("&did=");
                            sb2.append(h4Var.a.dialogId);
                            Uri parse = Uri.parse("tg://" + org.telegram.messenger.w7.r(null, document2) + sb2.toString());
                            org.telegram.messenger.a8.b("StoryViewer requestVideoPlayer(" + j10 + "): playing from " + parse);
                            this.B2 = (long) (zi.H0(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((i9) this.A1).c(document, uri, j10, this.w2);
                            m3Var.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(h4Var.f()));
                org.telegram.messenger.a8.b("StoryViewer requestVideoPlayer(" + j10 + "): playing from attachPath " + fromFile);
                this.B2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                org.telegram.messenger.a8.b("PeerStoriesView.requestVideoPlayer(" + j10 + "): playing from null?");
            }
            ((i9) this.A1).c(document, uri, j10, this.w2);
            m3Var.invalidate();
            return;
        }
        c4 c4Var = this.A1;
        TL_stories.StoryItem storyItem3 = h4Var.a;
        long j12 = this.l1;
        int i3 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        i9 i9Var = (i9) c4Var;
        i9Var.i(true, true);
        r9 r9Var = i9Var.d;
        g1 g1Var2 = r9Var.B0;
        if (g1Var2 == null || g1Var2.b != j12 || !g1Var2.f(inputGroupCall)) {
            gi.r3 r3Var2 = r9Var.E0;
            if (r3Var2 != null) {
                r3Var2.d(j12, null);
                gi.r3 r3Var3 = r9Var.E0;
                SurfaceViewRenderer surfaceViewRenderer = r3Var3.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = r3Var3.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                r3Var3.r = false;
                r3Var3.e(false, false);
            }
            n1 n1Var = n1.a0;
            if (n1Var.T && (g1Var = n1Var.w) != null && g1Var.f(inputGroupCall)) {
                g1 g1Var3 = n1Var.w;
                n1Var.w = null;
                r9Var.B0 = g1Var3;
                n1Var.d(false);
            } else {
                g1 g1Var4 = r9Var.B0;
                if (g1Var4 != null) {
                    if (!g1Var4.n && (!n1Var.T || n1Var.w != g1Var4)) {
                        g1Var4.e();
                    } else if (g1Var4.P != r9Var.E0.getSink()) {
                        r9Var.B0.s(null);
                    }
                    r9Var.B0 = null;
                }
            }
            if (n1Var.T) {
                n1.b();
            }
            q9 q9Var = r9Var.A0;
            if (q9Var != null) {
                q9Var.release(null);
                r9Var.A0 = null;
            }
            i4 i4Var2 = r9Var.H0;
            if (i4Var2 != null) {
                i4Var2.c = null;
                i4Var2.b = null;
                i4Var2.a = false;
                i4Var2.e = null;
                i4Var2.f = null;
                i4Var2.d = null;
                i4Var2.b();
                r9Var.H0 = null;
            }
            if (r9Var.B0 == null) {
                g1 g1Var5 = g1.X;
                if (g1Var5 == null || !g1Var5.f(inputGroupCall)) {
                    g1 g1Var6 = new g1(i9Var.c, r9Var.h, storyItem3, j12, i3, z12, inputGroupCall, false, false);
                    j11 = j12;
                    r9Var.B0 = g1Var6;
                    r3Var = r9Var.F0;
                    if (r3Var == null) {
                        r9Var.B0.s(r3Var.getSink());
                    } else {
                        r9Var.B0.s(r9Var.E0.getSink());
                    }
                    r9Var.H0 = i4Var;
                    i4Var.a = false;
                    i4Var.e = r9Var.z0;
                    gi.r3 r3Var4 = r9Var.E0;
                    i4Var.f = r3Var4.d;
                    i4Var.d = r3Var4.c;
                    i4Var.b = r9Var.B0;
                    r3Var4.d(j11, i4Var);
                    r9Var.H0.b();
                } else {
                    r9Var.B0 = g1.X;
                }
            }
            j11 = j12;
            r3Var = r9Var.F0;
            if (r3Var == null) {
            }
            r9Var.H0 = i4Var;
            i4Var.a = false;
            i4Var.e = r9Var.z0;
            gi.r3 r3Var42 = r9Var.E0;
            i4Var.f = r3Var42.d;
            i4Var.d = r3Var42.c;
            i4Var.b = r9Var.B0;
            r3Var42.d(j11, i4Var);
            r9Var.H0.b();
        }
        m3Var.invalidate();
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
                String t10 = MediaController.t(-1L, parse, "file");
                if (t10 == null) {
                    X0();
                    return;
                } else {
                    str = uri3;
                    z10 = false;
                    str2 = t10;
                }
            } else {
                str = T0;
                z10 = false;
                str2 = str;
            }
            if (z10) {
                yy.T(getAccountInstance(), str2, str, null, null, null, this.l1, null, null, storyItem, null, true, null, null);
                return;
            } else {
                yy.T(getAccountInstance(), null, null, parse, null, null, this.l1, null, null, storyItem, null, true, null, null);
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

    public final void R0(long j10, boolean z10) {
        if (this.u1 != z10) {
            this.u1 = z10;
            fh0 fh0Var = this.j0;
            if (z10) {
                if (this.t0.a && Build.VERSION.SDK_INT < 33) {
                    r9 r9Var = ((i9) this.A1).d;
                    r9Var.m1 = true;
                    r9Var.d0();
                    a3.o oVar = this.G3;
                    org.telegram.messenger.g0.r(oVar);
                    org.telegram.messenger.g0.i3(oVar, 100L);
                }
                P0(j10);
                e1();
                fh0Var.setAnimation(this.h1.u);
                this.u1 = true;
                this.Y0.a.getImageReceiver().O0(true, true);
                h4 h4Var = this.y1;
                if (h4Var.a != null) {
                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + h4Var.a.id + " " + h4.c(h4Var));
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
                r9 r9Var2 = ((i9) this.A1).d;
                r9Var2.J0 = false;
                r9Var2.d0();
            }
            this.O0.h0(this.u1 ? 3 : 2);
            this.P0.h0(this.u1 ? 2 : 0);
            this.Q0.h0(this.u1 ? 2 : 0);
            if (this.m1 || this.n1) {
                z6 z6Var = this.C1;
                long j11 = this.l1;
                boolean z11 = this.u1;
                a0.h hVar = z6Var.m;
                aa aaVar = (aa) hVar.f(j11);
                if (aaVar == null) {
                    aaVar = new aa(z6Var.a, j11, z6Var);
                    hVar.k(aaVar, j11);
                }
                aaVar.b(z11);
            }
        }
    }

    public final void S0(int i3, long j10) {
        if (this.l1 != j10) {
            h4 h4Var = this.y1;
            h4Var.b = null;
            h4Var.a = null;
        }
        this.l1 = j10;
        this.j1 = null;
        m0(i3);
        TL_stories.PeerStories peerStories = this.t0.R0;
        boolean z10 = true;
        if (peerStories != null) {
            this.C1.V(peerStories, true);
            return;
        }
        z6 z6Var = this.C1;
        TL_stories.PeerStories y9 = z6Var.y(j10);
        if (y9 == null) {
            y9 = z6Var.z(j10);
        } else {
            z10 = false;
        }
        z6Var.V(y9, z10);
    }

    public final void U0(long j10, boolean z10, boolean z11) {
        if (!z10 && j10 == this.w3 && this.x3 == z11) {
            return;
        }
        this.w3 = j10;
        this.x3 = z11;
        f4 f4Var = this.Y0;
        if (j10 < 0) {
            TLRPC.Chat M0 = hp.s1(this.m2).M0(Long.valueOf(-j10));
            e4 e4Var = f4Var.b;
            e4 e4Var2 = f4Var.b;
            e4Var.l(org.telegram.messenger.g0.D2(M0 == null ? "" : M0.title), false);
            if (M0 == null || !M0.verified) {
                e4Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(hs.e4);
            xp xpVar = new xp(mutate, null);
            xpVar.x = true;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            xpVar.h = L;
            xpVar.n = L2;
            e4Var2.i(xpVar);
            return;
        }
        if (this.m1 && !z11) {
            f4Var.b.l(bd.M0(2131745651, null), false);
            f4Var.b.i(null);
            return;
        }
        TLRPC.User a22 = hp.s1(this.m2).a2(Long.valueOf(j10));
        if (a22 == null || !a22.verified) {
            f4Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(hs.e4);
            xp xpVar2 = new xp(mutate2, null);
            xpVar2.x = true;
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            xpVar2.h = L3;
            xpVar2.n = L4;
            f4Var.b.i(xpVar2);
        }
        if (a22 != null) {
            f4Var.b.l(org.telegram.messenger.i6.m(org.telegram.messenger.g0.D2(org.telegram.messenger.g5.p(a22)), f4Var.b.getPaint().getFontMetricsInt(), false, null, 0), false);
        } else {
            f4Var.b.l(null, false);
        }
    }

    public final void V0(float f10, float f11, o4 o4Var) {
        this.W0 = f10;
        this.k3 = 1.0f / f11;
        if (this.V0 == o4Var) {
            return;
        }
        this.V0 = o4Var;
        if (o4Var != null) {
            ImageReceiver imageReceiver = o4Var.a;
            if (imageReceiver.n() != null) {
                Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                c3 c3Var = this.O0;
                c3Var.d0 = null;
                c3Var.a1.setShader(null);
                c3Var.N0(new BitmapDrawable(copy));
            }
        }
    }

    public final void W0(boolean z10) {
        h4 h4Var = this.y1;
        if (h4Var.a != null) {
            r9 r9Var = this.t0;
            if (r9Var.f != null) {
                String e10 = h4Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e10);
                    LaunchActivity.K1.startActivityForResult(Intent.createChooser(intent, bd.M0(2131744856, null)), 500);
                    return;
                }
                a3 a3Var = new a3(this, r9Var.f.getContext(), e10, e10, hp.s1(this.m2).W4() && (!(this.n1 || l10.A(this.l1)) || org.telegram.messenger.t3.t0(this.n1 ? hp.s1(this.m2).M0(Long.valueOf(-this.l1)) : null)), new q2(2, this.l0));
                this.J2 = a3Var;
                a3Var.b2 = true;
                TL_stories.StoryItem storyItem = h4Var.a;
                storyItem.dialogId = this.l1;
                a3Var.y2 = storyItem;
                a3Var.l2 = new bb.c(this, 22);
                ((i9) this.A1).h(a3Var);
            }
        }
    }

    public final void X0() {
        m3 m3Var = this.M0;
        org.telegram.ui.ActionBar.e6 e6Var = this.l0;
        org.telegram.messenger.k5.p(null, 2131743843, new fc(m3Var, e6Var), e6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.l0);
        String M0 = bd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        alertDialog$Builder.k(bd.M0(2131747839, null), null);
        s1Var.U = bd.M0(2131747226, null);
        ((i9) this.A1).h(s1Var);
    }

    public final void Z0(boolean z10) {
        if (this.c3 != z10) {
            h4 h4Var = this.y1;
            if (h4Var.a == null) {
                return;
            }
            this.c3 = z10;
            int i3 = 0;
            if (z10) {
                this.b3.setVisibility(0);
            }
            this.b3.setStoryItem(h4Var.a);
            r9 r9Var = ((i9) this.A1).d;
            r9Var.q1 = z10;
            r9Var.d0();
            if (!z10) {
                if (this.b3.getReactionsWindow() != null) {
                    this.b3.getReactionsWindow().e();
                }
                this.b3.animate().alpha(0.0f).setDuration(150L).setListener(new o2(this, i3)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d3, z10 ? 1.0f : 0.0f);
            this.b3.setTransitionProgress(this.d3);
            ofFloat.addUpdateListener(new b2(this, 1));
            ofFloat.addListener(new n2(this, z10, i3));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(xq.g);
            ofFloat.start();
        }
    }

    public final void a1(boolean z10) {
        if (this.q0 == null) {
            gi.l3 l3Var = new gi.l3(getContext(), 1);
            l3Var.o(1.0f, -56.0f);
            this.q0 = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.M0.addView(this.q0, mf.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.q0.u(bd.M0(z10 ? 2131744617 : 2131744467, null));
        this.q0.w();
    }

    public final boolean b1(boolean z10) {
        if (this.t0.S0) {
            z10 = !z10;
        }
        if (!z10) {
            int i3 = this.t1;
            if (i3 > 0) {
                this.t1 = i3 - 1;
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
        if (hp.s1(this.m2).W4()) {
            File h = this.y1.h();
            if (h == null || !h.exists()) {
                Y0();
                return;
            }
            a3 a3Var = this.J2;
            if (a3Var != null) {
                a3Var.dismiss();
            }
            org.telegram.messenger.g0.i3(new a2(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x095a, code lost:
    
        if (r15.g == (r2 == null && r2.translated && r2.translatedText != null && android.text.TextUtils.equals(r2.translatedLng, org.telegram.ui.Components.f21.M0()))) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x09ba, code lost:
    
        if (r3 != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x09df, code lost:
    
        if (r3 != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0af2, code lost:
    
        if (r4 != false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0b0a, code lost:
    
        if (r4 != false) goto L558;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0c2c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0caa  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d79  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0db9 A[EDGE_INSN: B:311:0x0db9->B:312:0x0db9 BREAK  A[LOOP:0: B:300:0x0d97->B:309:0x0db6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0dc5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0dd6  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0e2e  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0e7a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0e9c  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0f32  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0f63  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0f72  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0fb9  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0fe6  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x1002  */
    /* JADX WARN: Removed duplicated region for block: B:406:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0fd8  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0ee4  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0e74  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e3e  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0e25  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0d4a  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0d51  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x0408  */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73, types: [ei.c8, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(boolean z10) {
        y6 y6Var;
        TL_stories.StoryItem storyItem;
        y6 y6Var2;
        boolean z11;
        boolean z12;
        int i3;
        fx fxVar;
        int i10;
        TL_stories.StoryItem storyItem2;
        c3 c3Var;
        boolean z13;
        o9 o9Var;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem3;
        r9 r9Var;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem4;
        boolean z14;
        boolean z15;
        TL_stories.StoryItem storyItem5;
        r9 r9Var2;
        y6 y6Var3;
        TLRPC.MessageMedia messageMedia;
        gi.f7 f7Var;
        TL_stories.StoryItem storyItem6;
        y6 y6Var4;
        int i11;
        gi.f7 f7Var2;
        boolean z16;
        m3 m3Var;
        q3 q3Var;
        f4 f4Var;
        s2 s2Var;
        boolean z17;
        y6 y6Var5;
        org.telegram.ui.Components.ac acVar;
        boolean z18;
        TL_stories.StoryItem storyItem7;
        c3 c3Var2;
        boolean z19;
        y6 y6Var6;
        h4 h4Var;
        boolean z20;
        boolean z21;
        m3 m3Var2;
        q3 q3Var2;
        boolean z22;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        CharSequence charSequence2;
        TLRPC.MessageMedia messageMedia2;
        boolean z23;
        gi.l3 l3Var;
        gi.l3 l3Var2;
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
        s2 s2Var2;
        int i13;
        s2 s2Var3;
        int i14;
        boolean z28;
        boolean z29;
        boolean z30;
        int i15;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        mh.h hVar;
        a aVar;
        s1 s1Var;
        boolean z35;
        TL_stories.StoryItem storyItem11;
        boolean z36;
        int i16;
        int i17;
        boolean z37;
        boolean z38;
        boolean l10;
        y6 y6Var7;
        y6 y6Var8;
        gi.l3 l3Var3;
        int i18;
        ImageView imageView;
        ImageView imageView2;
        boolean z39;
        int i19;
        boolean z40;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i20;
        int i21;
        int i22;
        boolean z41;
        int i23;
        boolean z42;
        boolean z43;
        TL_stories.StoryItem storyItem13;
        int i24;
        int i25;
        FrameLayout.LayoutParams layoutParams;
        int L;
        boolean z44;
        boolean z45;
        int i26;
        boolean z46;
        g1 g1Var;
        int i27;
        boolean z47;
        int i28;
        boolean z48;
        int i29;
        boolean z49;
        boolean z50;
        boolean z51;
        boolean z52;
        g1 g1Var2;
        String str;
        BitmapDrawable bitmapDrawable;
        c3 c3Var3;
        boolean z53;
        r9 r9Var3;
        fx fxVar2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        r6 r6Var;
        ArrayList arrayList2 = this.f1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.g1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.F2 = true;
        h4 h4Var2 = this.y1;
        TL_stories.StoryItem storyItem14 = h4Var2.a;
        y6 y6Var9 = h4Var2.b;
        String s6 = s7.s();
        this.J0 = false;
        this.M2 = false;
        int i30 = this.t1;
        boolean z54 = this.D1;
        boolean z55 = this.E1;
        boolean z56 = this.F1;
        r9 r9Var4 = this.t0;
        if (r9Var4 == null || (r6Var = r9Var4.P0) == null || r6Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i30 < 0 || i30 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i30);
            int size = i30 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            y6Var = (size < 0 || size >= arrayList3.size()) ? null : (y6) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            y6Var = (i30 < 0 || i30 >= arrayList3.size()) ? null : (y6) arrayList3.get(i30);
            int size2 = i30 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        h4Var2.c = null;
        i3 i3Var = this.T0;
        int i31 = hs.g2;
        fx fxVar3 = this.U0;
        c3 c3Var4 = this.O0;
        if (y6Var != null) {
            gi.f7 f7Var3 = y6Var.c;
            this.E1 = false;
            boolean z57 = y6Var.J;
            this.F1 = z57;
            this.D1 = !z57;
            c3Var4.c0(false);
            c3Var4.b0(hs.g2);
            Bitmap bitmap = f7Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (y6Var.s || y6Var.I) {
                y6Var2 = y6Var9;
                c3Var3 = c3Var4;
                z11 = z54;
                z53 = z55;
                z12 = z56;
                r9Var3 = r9Var4;
                i3 = i30;
                fxVar2 = fxVar3;
                r62 = 0;
                i10 = 4;
                this.O0.u0(null, null, ac.g(y6Var.f), s6, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                i10 = 4;
                y6Var2 = y6Var9;
                fxVar2 = fxVar3;
                r62 = 0;
                c3Var3 = c3Var4;
                z11 = z54;
                z12 = z56;
                z53 = z55;
                r9Var3 = r9Var4;
                i3 = i30;
                this.O0.u0(null, null, ac.g(y6Var.e), s6, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            h4Var2.b = y6Var;
            h4Var2.j = r62;
            h4Var2.i = r62;
            h4Var2.a = r62;
            h4Var2.d = false;
            h4Var2.e = h4Var2.m();
            TL_stories.StoryItem storyItem17 = h4Var2.a;
            h4Var2.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            fxVar = fxVar2;
            i3Var.c(r62, t8.a(f7Var3), fxVar);
            this.E2 = false;
            this.D2 = false;
            this.C2 = false;
            storyItem2 = storyItem14;
            z13 = z53;
            c3Var = c3Var3;
            r9Var = r9Var3;
        } else {
            y6Var2 = y6Var9;
            z11 = z54;
            z12 = z56;
            i3 = i30;
            fxVar = fxVar3;
            i10 = 4;
            this.D1 = false;
            this.E1 = false;
            this.F1 = false;
            if (storyItem == null) {
                if (r9Var4 != null) {
                    r9Var4.D(true);
                    return;
                }
                return;
            }
            y6 t10 = this.C1.t(this.l1, storyItem);
            if (t10 != null) {
                String str2 = t10.f;
                this.E1 = true;
                c3Var4.c0(false);
                if (this.S0 != null) {
                    i31 = 0;
                }
                c3Var4.b0(i31);
                if (t10.s) {
                    storyItem2 = storyItem14;
                    y6Var3 = t10;
                    c3Var = c3Var4;
                    r9Var2 = r9Var4;
                    this.O0.r0(null, null, ac.g(str2), s6, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    r9Var2 = r9Var4;
                    c3Var = c3Var4;
                    y6Var3 = t10;
                    this.O0.r0(null, null, ac.g(str2), s6, null, 0L, null, null, 0);
                }
                h4Var2.b = y6Var3;
                h4Var2.j = null;
                h4Var2.i = null;
                h4Var2.a = null;
                h4Var2.d = false;
                h4Var2.e = h4Var2.m();
                TL_stories.StoryItem storyItem18 = h4Var2.a;
                h4Var2.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                i3Var.c(null, t8.a(y6Var3.c), fxVar);
                h4Var2.c = storyItem;
                this.E2 = false;
                this.D2 = false;
                this.C2 = false;
                z13 = z55;
                r9Var = r9Var2;
            } else {
                storyItem2 = storyItem14;
                c3Var = c3Var4;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z58 = messageMedia4 != null && zi.L4(messageMedia4.getDocument());
                storyItem.dialogId = this.l1;
                z13 = z55;
                c3Var.c0(z13);
                c3Var.b0(hs.g2);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.M2 = true;
                    hp.s1(this.m2).P1().p(storyItem.id, this.l1);
                } else {
                    String str3 = storyItem.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            z58 = str3.toLowerCase().endsWith(".mp4");
                        }
                        if (z58) {
                            TLRPC.MessageMedia messageMedia6 = storyItem.media;
                            BitmapDrawable m10 = messageMedia6 != null ? zb.m(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                if (zb.D().J(ac.g(storyItem.firstFramePath).q(null, null, false) + "@" + s6, false)) {
                                    this.O0.u0(null, null, ac.g(storyItem.firstFramePath), s6, null, null, m10, 0L, null, null, 0);
                                }
                            }
                            this.O0.u0(null, null, ac.g(storyItem.attachPath), t4.c.q(s6, "_pframe"), null, null, m10, 0L, null, null, 0);
                        } else {
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            BitmapDrawable m11 = photo != null ? zb.m(photo.sizes) : null;
                            if (z13) {
                                this.O0.r0(ac.g(storyItem.attachPath), s6, ac.g(storyItem.firstFramePath), s6, m11, 0L, null, null, 0);
                            } else {
                                this.O0.r0(ac.g(storyItem.attachPath), s6, null, null, m11, 0L, null, null, 0);
                            }
                        }
                    } else {
                        Drawable t11 = ((r9Var4.P0 != null || r9Var4.O0) && (o9Var = r9Var4.t0) != null && (imageReceiver = o9Var.c) != null && o9Var.o == storyItem.id) ? imageReceiver.t() : null;
                        storyItem.dialogId = this.l1;
                        if (z58) {
                            TLRPC.PhotoSize u10 = org.telegram.messenger.w7.u(1000, storyItem.media.getDocument().thumbs);
                            if (t11 == null) {
                                t11 = zb.m(storyItem.media.getDocument().thumbs);
                            }
                            ac b10 = ac.b(z6.C(this.m2, storyItem));
                            String q10 = t4.c.q(s6, "_pframe");
                            ac c2 = ac.c(u10, storyItem.media.getDocument());
                            storyItem4 = storyItem;
                            r9Var = r9Var4;
                            this.O0.u0(null, null, b10, q10, c2, s6, t11, 0L, null, storyItem4, 0);
                        } else {
                            storyItem3 = storyItem;
                            r9Var = r9Var4;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                c3Var.f();
                                storyItem3.dialogId = this.l1;
                                i3Var.d(z10 ? null : storyItem3, fxVar);
                                h4Var2.n(storyItem3);
                                z14 = (!this.M2 || (storyItem5 = h4Var2.a) == null || (storyItem5 instanceof TL_stories.TL_storyItemDeleted) || (storyItem5 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                                this.E2 = z14;
                                this.C2 = z14;
                                if (z14) {
                                    this.C2 = h4Var2.d() && h4Var2.a.isPublic;
                                }
                                if (this.C2) {
                                    TL_stories.StoryItem storyItem19 = h4Var2.a;
                                    this.C2 = storyItem19.pinned || !s7.w(this.m2, storyItem19);
                                }
                                z15 = this.C2;
                                this.D2 = z15;
                                if (z15 && this.n1) {
                                    TLRPC.Chat M0 = hp.s1(this.m2).M0(Long.valueOf(-this.l1));
                                    this.D2 = M0 == null && org.telegram.messenger.t3.t0(M0);
                                }
                                if (this.E2) {
                                    if (this.n1) {
                                        TLRPC.Chat M02 = hp.s1(this.m2).M0(Long.valueOf(-this.l1));
                                        this.E2 = (M02 == null || org.telegram.messenger.t3.K(M02, false) == null) ? false : true;
                                    } else {
                                        TLRPC.User a22 = hp.s1(this.m2).a2(Long.valueOf(this.l1));
                                        this.E2 = (a22 == null || l10.n(a22) == null || !h4Var2.a.isPublic) ? false : true;
                                    }
                                }
                                us.l0.c(new ls(us.t(this.m2), this.l1, storyItem3.id, 1));
                            } else {
                                if (t11 == null) {
                                    t11 = zb.m(arrayList);
                                }
                                TLRPC.PhotoSize u11 = org.telegram.messenger.w7.u(ConnectionsManager.DEFAULT_DATACENTER_ID, photo2.sizes);
                                org.telegram.messenger.w7.u(800, photo2.sizes);
                                storyItem4 = storyItem3;
                                this.O0.u0(null, null, ac.i(u11, photo2), s6, null, null, t11, 0L, null, storyItem4, 0);
                            }
                        }
                        storyItem3 = storyItem4;
                        storyItem3.dialogId = this.l1;
                        i3Var.d(z10 ? null : storyItem3, fxVar);
                        h4Var2.n(storyItem3);
                        if (!this.M2) {
                        }
                        this.E2 = z14;
                        this.C2 = z14;
                        if (z14) {
                        }
                        if (this.C2) {
                        }
                        z15 = this.C2;
                        this.D2 = z15;
                        if (z15) {
                            TLRPC.Chat M03 = hp.s1(this.m2).M0(Long.valueOf(-this.l1));
                            this.D2 = M03 == null && org.telegram.messenger.t3.t0(M03);
                        }
                        if (this.E2) {
                        }
                        us.l0.c(new ls(us.t(this.m2), this.l1, storyItem3.id, 1));
                    }
                }
                storyItem3 = storyItem;
                r9Var = r9Var4;
                storyItem3.dialogId = this.l1;
                i3Var.d(z10 ? null : storyItem3, fxVar);
                h4Var2.n(storyItem3);
                if (!this.M2) {
                }
                this.E2 = z14;
                this.C2 = z14;
                if (z14) {
                }
                if (this.C2) {
                }
                z15 = this.C2;
                this.D2 = z15;
                if (z15) {
                }
                if (this.E2) {
                }
                us.l0.c(new ls(us.t(this.m2), this.l1, storyItem3.id, 1));
            }
        }
        TL_stories.StoryItem storyItem20 = h4Var2.a;
        if (storyItem20 != null && !z10) {
            r9Var.Q0 = storyItem20.id;
        }
        r9Var.o0.A();
        this.I2 = true;
        if (this.m1 || this.n1) {
            i1(false);
        }
        TL_stories.StoryItem storyItem21 = h4Var2.a;
        y6 y6Var10 = h4Var2.b;
        int i32 = storyItem21 != null ? storyItem21.id : (y6Var10 == null || (f7Var = y6Var10.c) == null) ? 0 : f7Var.f;
        if (storyItem2 != null) {
            storyItem6 = storyItem2;
            i11 = storyItem6.id;
            y6Var4 = y6Var2;
        } else {
            storyItem6 = storyItem2;
            y6Var4 = y6Var2;
            i11 = (y6Var2 == null || (f7Var2 = y6Var4.c) == null) ? 0 : f7Var2.f;
        }
        boolean z59 = i32 == i11 || !(y6Var4 == null || storyItem21 == null || !TextUtils.equals(y6Var4.e, storyItem21.attachPath));
        boolean z60 = z59 && !(this.E1 == z13 && this.D1 == z11 && this.F1 == z12);
        g1 g1Var3 = r9Var.B0;
        if (g1Var3 != null) {
            int i33 = this.A3;
            TLRPC.GroupCall groupCall = g1Var3.w;
            if (i33 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                z16 = true;
                m3Var = this.M0;
                q3Var = this.u0;
                f4Var = this.Y0;
                if ((y6Var4 != null || (str = y6Var4.e) == null || !str.equals(h4Var2.f())) && (storyItem6 == null || (storyItem7 = h4Var2.a) == null || storyItem6.id != storyItem7.id)) {
                    s2Var = this.L1;
                    if (s2Var != null) {
                        if (storyItem6 != null && !TextUtils.isEmpty(s2Var.getEditField().getText())) {
                            r9.X(storyItem6.dialogId, storyItem6, this.L1.getEditField().getText());
                        }
                        this.L1.getEditField().setText(r9.I(this.l1, h4Var2.a));
                        z18 = h4Var2.f;
                        if (z18) {
                            this.L1.T0(false, false);
                        } else {
                            this.L1.T0(true, true);
                        }
                    }
                    z17 = h4Var2.f;
                    if (z17) {
                        K0();
                    }
                    fxVar.c();
                    this.G0 = 0L;
                    this.I0 = false;
                    y6Var5 = h4Var2.b;
                    if (y6Var5 == null) {
                        gh0 gh0Var = f4Var.d;
                        if (gh0Var != null) {
                            gh0Var.e(false, y6Var5.h);
                        }
                        f4Var.a.invalidate();
                    } else if (!z60) {
                        f4Var.h = 0.0f;
                    }
                    acVar = org.telegram.ui.Components.ac.w;
                    if (acVar != null && acVar.h == m3Var) {
                        acVar.b();
                    }
                    q3Var.J();
                    o0();
                    z16 = true;
                }
                if (!z16 || (y6Var4 != null && h4Var2.b == null)) {
                    f4Var.setOnSubtitleClick(null);
                    TextView[] textViewArr = f4Var.c;
                    this.A3 = 0;
                    boolean z61 = z60;
                    long j10 = this.l1;
                    c3Var2 = c3Var;
                    z19 = h4Var2.f;
                    U0(j10, false, z19);
                    y6Var6 = h4Var2.b;
                    if (y6Var6 == null) {
                        h4Var = h4Var2;
                        charSequence2 = y6Var6.J ? bd.L0(2131750845) : s7.u(textViewArr[0], this.E1);
                    } else if (G0()) {
                        TL_stories.StoryItem storyItem22 = h4Var2.a;
                        if (storyItem22 == null || (messageMedia2 = storyItem22.media) == null) {
                            h4Var = h4Var2;
                        } else {
                            if (messageMedia2.document != null) {
                                h4Var = h4Var2;
                                charSequence2 = bd.X(r13.date);
                            } else {
                                h4Var = h4Var2;
                                if (messageMedia2.photo != null) {
                                    charSequence2 = bd.X(r2.date);
                                }
                            }
                        }
                        charSequence2 = "";
                    } else {
                        h4Var = h4Var2;
                        TL_stories.StoryItem storyItem23 = h4Var.a;
                        if (storyItem23 == null) {
                            z20 = z16;
                            z21 = z59;
                            m3Var2 = m3Var;
                            q3Var2 = q3Var;
                            z22 = z61;
                            charSequence = null;
                        } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.L0(2131748833));
                            spannableStringBuilder2.setSpan(new m0(1), 0, spannableStringBuilder2.length(), 33);
                            spannableStringBuilder2.append((CharSequence) "  ");
                            g1 g1Var4 = r9Var.B0;
                            if (g1Var4 != null) {
                                TLRPC.GroupCall groupCall2 = g1Var4.w;
                                i12 = 1;
                                this.A3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                            } else {
                                i12 = 1;
                            }
                            spannableStringBuilder2.append((CharSequence) bd.I(Math.max(i12, this.A3), "LiveStoryWatching"));
                            charSequence2 = spannableStringBuilder2;
                        } else if (storyItem23.date == -1) {
                            charSequence2 = bd.L0(2131752644);
                        } else {
                            if (h4Var.i() != null) {
                                c8 i34 = h4Var.i();
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                z20 = z16;
                                z21 = z59;
                                SpannableString spannableString = new SpannableString("r");
                                m3Var2 = m3Var;
                                q3Var2 = q3Var;
                                spannableString.setSpan(new wp(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                spannableStringBuilder3.append((CharSequence) spannableString).append((CharSequence) " ");
                                if (i34.b != null) {
                                    org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(15.0f, this.m2, textViewArr[0]);
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(h5Var, 0, 1, 33);
                                    spannableStringBuilder3.append((CharSequence) spannableString2).append((CharSequence) " ");
                                    if (i34.b.longValue() > 0) {
                                        TLRPC.User a23 = hp.s1(this.m2).a2(i34.b);
                                        h5Var.e(a23);
                                        spannableStringBuilder3.append((CharSequence) l10.p(a23));
                                    } else {
                                        TLRPC.Chat M04 = hp.s1(this.m2).M0(Long.valueOf(-i34.b.longValue()));
                                        h5Var.b(M04);
                                        if (M04 != null) {
                                            spannableStringBuilder3.append((CharSequence) M04.title);
                                        }
                                    }
                                } else {
                                    String str4 = h4Var.a.fwd_from.from_name;
                                    if (str4 != null) {
                                        spannableStringBuilder3.append((CharSequence) str4);
                                    }
                                }
                                f4Var.setOnSubtitleClick(new ai.d(16, this, i34));
                                SpannableString spannableString3 = new SpannableString(".");
                                fs fsVar = new fs();
                                fsVar.b = org.telegram.messenger.g0.L(1.5f);
                                fsVar.c = 5.0f;
                                spannableString3.setSpan(fsVar, 0, spannableString3.length(), 33);
                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) bd.P(h4Var.a.date));
                                spannableStringBuilder = spannableStringBuilder3;
                            } else {
                                z20 = z16;
                                z21 = z59;
                                m3Var2 = m3Var;
                                q3Var2 = q3Var;
                                if (!this.o1 || (storyItem8 = h4Var.a) == null || storyItem8.from_id == null) {
                                    String X = bd.X(h4Var.a.date);
                                    charSequence4 = X;
                                    if (h4Var.a.edited) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X);
                                        fs fsVar2 = new fs();
                                        fsVar2.b = org.telegram.messenger.g0.L(1.5f);
                                        fsVar2.c = 5.0f;
                                        valueOf.append((CharSequence) " . ").setSpan(fsVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                        valueOf.append((CharSequence) bd.L0(2131751211));
                                        charSequence4 = valueOf;
                                    }
                                    z22 = z61;
                                    charSequence = charSequence4;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                    org.telegram.ui.h5 h5Var2 = new org.telegram.ui.h5(15.0f, this.m2, textViewArr[0]);
                                    SpannableString spannableString4 = new SpannableString("a");
                                    spannableString4.setSpan(h5Var2, 0, 1, 33);
                                    spannableStringBuilder4.append((CharSequence) spannableString4).append((CharSequence) " ");
                                    long o10 = org.telegram.messenger.m5.o(h4Var.a.from_id);
                                    if (o10 > 0) {
                                        TLRPC.User a24 = hp.s1(this.m2).a2(Long.valueOf(o10));
                                        h5Var2.e(a24);
                                        spannableStringBuilder4.append((CharSequence) l10.p(a24));
                                    } else {
                                        TLRPC.Chat M05 = hp.s1(this.m2).M0(Long.valueOf(-o10));
                                        h5Var2.b(M05);
                                        if (M05 != null) {
                                            spannableStringBuilder4.append((CharSequence) M05.title);
                                        }
                                    }
                                    f4Var.setOnSubtitleClick(new ai.v(this, o10, 2));
                                    SpannableString spannableString5 = new SpannableString(".");
                                    fs fsVar3 = new fs();
                                    fsVar3.b = org.telegram.messenger.g0.L(1.5f);
                                    fsVar3.c = 5.0f;
                                    spannableString5.setSpan(fsVar3, 0, spannableString5.length(), 33);
                                    spannableStringBuilder4.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) bd.P(h4Var.a.date));
                                    spannableStringBuilder = spannableStringBuilder4;
                                }
                            }
                            z22 = false;
                            charSequence = spannableStringBuilder;
                        }
                        if (charSequence != null) {
                            r6 r6Var2 = r9Var.P0;
                            if (r6Var2 == null || (storyItem9 = h4Var.a) == null || !r6Var2.m(storyItem9.id)) {
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
                                spannableString6.setSpan(new wp(R.drawable.msg_pin_mini), 0, 1, 33);
                                ((SpannableStringBuilder) charSequence5).insert(0, (CharSequence) spannableString6);
                                charSequence3 = charSequence5;
                            }
                            f4Var.c(charSequence3, z22);
                        } else {
                            z23 = false;
                        }
                        l3Var = this.p0;
                        if (l3Var != null) {
                            l3Var.f(z23);
                        }
                        l3Var2 = this.q0;
                        if (l3Var2 != null) {
                            l3Var2.f(z23);
                        }
                    }
                    z20 = z16;
                    z21 = z59;
                    m3Var2 = m3Var;
                    q3Var2 = q3Var;
                    charSequence4 = charSequence2;
                    z22 = z61;
                    charSequence = charSequence4;
                    if (charSequence != null) {
                    }
                    l3Var = this.p0;
                    if (l3Var != null) {
                    }
                    l3Var2 = this.q0;
                    if (l3Var2 != null) {
                    }
                } else {
                    h4Var = h4Var2;
                    c3Var2 = c3Var;
                    z20 = z16;
                    z21 = z59;
                    m3Var2 = m3Var;
                    q3Var2 = q3Var;
                }
                storyItem10 = h4Var.a;
                if (storyItem6 == storyItem10 && y6Var4 == h4Var.b) {
                }
                h4Var.o();
                if ((!h4Var.g || storyItem6 != h4Var.a) && (c4Var = this.A1) != null) {
                    r9 r9Var5 = ((i9) c4Var).d;
                    r9Var5.a1 = false;
                    r9Var5.d0();
                }
                z24 = h4Var.f;
                z25 = !z24 && (g1Var2 = r9Var.B0) != null && h4Var.k(g1Var2.g()) && r9Var.B0.b();
                if (z25 != this.q1) {
                    this.q1 = z25;
                    if (z25) {
                        x0();
                    }
                    if (this.Q1 != null && (this.p1 || this.q1)) {
                        f1();
                    }
                    s2 s2Var4 = this.L1;
                    if (s2Var4 != null) {
                        if (this.p1) {
                            z52 = h4Var.f;
                        }
                        if (!this.q1) {
                            z51 = true;
                            s2Var4.setEnabled(z51);
                            z50 = true;
                            this.L1.Q1(true);
                        }
                        z51 = false;
                        s2Var4.setEnabled(z51);
                        z50 = true;
                        this.L1.Q1(true);
                    } else {
                        z50 = true;
                    }
                    p0(z50);
                }
                linearLayout = this.Q1;
                int i35 = 8;
                if (linearLayout != null) {
                    if (this.p1) {
                        z49 = h4Var.f;
                    }
                    if (!this.q1) {
                        i29 = 8;
                        linearLayout.setVisibility(i29);
                    }
                    i29 = 0;
                    linearLayout.setVisibility(i29);
                }
                z26 = this.M2;
                LinearLayout linearLayout2 = this.y0;
                if (z26) {
                    TLRPC.Chat M06 = this.l1 < 0 ? hp.s1(this.m2).M0(Long.valueOf(-this.l1)) : null;
                    z27 = h4Var.f;
                    if (z27) {
                        if (this.L1 == null) {
                            t0();
                        }
                        s0();
                        w0();
                        v0();
                        i13 = 0;
                        this.L1.setVisibility(0);
                    } else {
                        if ((l10.A(this.l1) || G0()) && (s2Var2 = this.L1) != null) {
                            s2Var2.setVisibility(8);
                        } else if (!this.m1 && ((!this.n1 || (this.o1 && (org.telegram.messenger.t3.q(M06) || org.telegram.messenger.t3.s0(M06)))) && (s2Var3 = this.L1) != null)) {
                            i13 = 0;
                            s2Var3.setVisibility(0);
                        }
                        i13 = 0;
                    }
                    s2 s2Var5 = this.L1;
                    if (s2Var5 != null) {
                        z32 = h4Var.f;
                        s2Var5.setOnSendButtonLongClick(z32 ? new z1(this, i13) : null);
                        s2 s2Var6 = this.L1;
                        z33 = h4Var.f;
                        B0(true);
                        s2Var6.h1(z33);
                        s2 s2Var7 = this.L1;
                        z34 = h4Var.f;
                        s2Var7.n1(z34 && !B0(true) && (this.f2 || this.L1.X0), true);
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
                            z31 = h4Var.f;
                        }
                        if (!this.q1) {
                            i15 = 8;
                            linearLayout3.setVisibility(i15);
                        }
                        i15 = 0;
                        linearLayout3.setVisibility(i15);
                    }
                    s2 s2Var8 = this.L1;
                    if (s2Var8 != null) {
                        if (this.p1) {
                            z30 = h4Var.f;
                        }
                        if (!this.q1) {
                            z29 = true;
                            s2Var8.setEnabled(z29);
                        }
                        z29 = false;
                        s2Var8.setEnabled(z29);
                    }
                    d3 d3Var = this.G1;
                    if (d3Var != null) {
                        if (this.m1) {
                            z28 = h4Var.f;
                            if (!z28) {
                                i14 = 0;
                                d3Var.setVisibility(i14);
                            }
                        }
                        i14 = 8;
                        d3Var.setVisibility(i14);
                    }
                    FrameLayout frameLayout = this.K2;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (l10.A(this.l1)) {
                        y0();
                        this.L2.setVisibility(0);
                    } else {
                        ec ecVar = this.L2;
                        if (ecVar != null) {
                            ecVar.setVisibility(8);
                        }
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(G0() ? 8 : 0);
                    }
                } else {
                    A0();
                    y0();
                    this.K2.setVisibility(0);
                    this.L2.setVisibility(0);
                    this.E2 = false;
                    this.D2 = false;
                    this.C2 = false;
                    s2 s2Var9 = this.L1;
                    if (s2Var9 != null) {
                        s2Var9.setVisibility(8);
                    }
                    d3 d3Var2 = this.G1;
                    if (d3Var2 != null) {
                        d3Var2.setVisibility(8);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                }
                hVar = this.M1;
                if (hVar != null) {
                    s2 s2Var10 = this.L1;
                    if (s2Var10 != null && s2Var10.getVisibility() == 0) {
                        z48 = h4Var.f;
                        if (!z48) {
                            i28 = 0;
                            hVar.setVisibility(i28);
                        }
                    }
                    i28 = 8;
                    hVar.setVisibility(i28);
                }
                aVar = this.H1;
                k2 k2Var = this.v0;
                if (aVar != null) {
                    if (!this.M2) {
                        z47 = h4Var.f;
                        if (z47) {
                            i27 = 0;
                            aVar.setVisibility(i27);
                            this.H1.a(k2Var.g(), false);
                            this.H1.setCount(k2Var.getUnreadMessagesCount());
                        }
                    }
                    i27 = 8;
                    aVar.setVisibility(i27);
                    this.H1.a(k2Var.g(), false);
                    this.H1.setCount(k2Var.getUnreadMessagesCount());
                }
                s1Var = this.K1;
                if (s1Var != null) {
                    if (!this.M2) {
                        z46 = h4Var.f;
                        if (z46 && (g1Var = g1.X) != null && h4Var.k(g1Var.g())) {
                            i26 = 0;
                            s1Var.setVisibility(i26);
                            s1 s1Var2 = this.K1;
                            g1 g1Var5 = g1.X;
                            s1Var2.b(g1Var5 == null && g1Var5.o(), true);
                            s1 s1Var3 = this.K1;
                            g1 g1Var6 = g1.X;
                            s1Var3.a(g1Var6 != null || g1Var6.m(), true);
                        }
                    }
                    i26 = 8;
                    s1Var.setVisibility(i26);
                    s1 s1Var22 = this.K1;
                    g1 g1Var52 = g1.X;
                    s1Var22.b(g1Var52 == null && g1Var52.o(), true);
                    s1 s1Var32 = this.K1;
                    g1 g1Var62 = g1.X;
                    s1Var32.a(g1Var62 != null || g1Var62.m(), true);
                }
                if (this.J1 != null) {
                    v1 v1Var = this.I1;
                    if (!this.M2) {
                        z45 = h4Var.f;
                        if (z45) {
                            i24 = 0;
                            v1Var.setVisibility(i24);
                            w1 w1Var = this.J1;
                            if (!this.M2) {
                                z44 = h4Var.f;
                                if (z44) {
                                    i25 = 0;
                                    w1Var.setVisibility(i25);
                                    layoutParams = (FrameLayout.LayoutParams) this.J1.getLayoutParams();
                                    s1 s1Var4 = this.K1;
                                    L = org.telegram.messenger.g0.L((s1Var4 == null && s1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != L) {
                                        layoutParams.rightMargin = L;
                                        this.J1.setLayoutParams(layoutParams);
                                    }
                                }
                            }
                            i25 = 8;
                            w1Var.setVisibility(i25);
                            layoutParams = (FrameLayout.LayoutParams) this.J1.getLayoutParams();
                            s1 s1Var42 = this.K1;
                            L = org.telegram.messenger.g0.L((s1Var42 == null && s1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != L) {
                            }
                        }
                    }
                    i24 = 8;
                    v1Var.setVisibility(i24);
                    w1 w1Var2 = this.J1;
                    if (!this.M2) {
                    }
                    i25 = 8;
                    w1Var2.setVisibility(i25);
                    layoutParams = (FrameLayout.LayoutParams) this.J1.getLayoutParams();
                    s1 s1Var422 = this.K1;
                    L = org.telegram.messenger.g0.L((s1Var422 == null && s1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                    if (layoutParams.rightMargin != L) {
                    }
                }
                z35 = h4Var.f;
                if (!z35 || ((h4Var.h == null && h4Var.i() == null && h4Var.g() == null) || this.M2)) {
                    q3 q3Var3 = q3Var2;
                    if (this.u1) {
                        r9 r9Var6 = ((i9) this.A1).d;
                        r9Var6.M0 = false;
                        r9Var6.d0();
                        c4 c4Var2 = this.A1;
                        this.T2 = false;
                        ((i9) c4Var2).e();
                    }
                    q3Var3.setVisibility(8);
                } else {
                    q3 q3Var4 = q3Var2;
                    q3Var4.c0.b(h4Var.h, h4Var.i(), h4Var.g(), r9Var.a1 && !h4Var.g && (storyItem13 = h4Var.a) != null && storyItem13.translated, storyItem6 == h4Var.a);
                    q3Var4.setVisibility(0);
                }
                storyItem11 = h4Var.a;
                if (storyItem11 != null) {
                    TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                    if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                        if (k2Var.r(this.l1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                            k2Var.q(false, false);
                            this.v3 = 0L;
                            s2 s2Var11 = this.L1;
                            if (s2Var11 != null) {
                                s2Var11.E(true);
                                this.L1.S1();
                                p0(true);
                            }
                        }
                        k2Var.setVisibility(0);
                        m3Var2.invalidate();
                        if (this.A1 != null && I0()) {
                            ((i9) this.A1).a(this.t1, this.l1);
                        }
                        z36 = this.n1;
                        d3 d3Var3 = this.z0;
                        ImageView imageView3 = this.x0;
                        d3 d3Var4 = this.n0;
                        if (z36) {
                            if (this.C2) {
                                z43 = h4Var.f;
                                if (!z43) {
                                    i21 = 0;
                                    imageView3.setVisibility(i21);
                                    if (d3Var3 != null) {
                                        if (this.D2) {
                                            z42 = h4Var.f;
                                            if (!z42) {
                                                i23 = 0;
                                                d3Var3.setVisibility(i23);
                                            }
                                        }
                                        i23 = 8;
                                        d3Var3.setVisibility(i23);
                                    }
                                    if (!this.F1) {
                                        z41 = h4Var.f;
                                        if (!z41) {
                                            i22 = 0;
                                            d3Var4.setVisibility(i22);
                                        }
                                    }
                                    i22 = 8;
                                    d3Var4.setVisibility(i22);
                                }
                            }
                            i21 = i10;
                            imageView3.setVisibility(i21);
                            if (d3Var3 != null) {
                            }
                            if (!this.F1) {
                            }
                            i22 = 8;
                            d3Var4.setVisibility(i22);
                        } else {
                            if (this.C2) {
                                z38 = h4Var.f;
                                if (!z38) {
                                    i16 = 0;
                                    imageView3.setVisibility(i16);
                                    if (d3Var3 != null) {
                                        d3Var3.setVisibility(8);
                                    }
                                    if (!this.m1) {
                                        z37 = h4Var.f;
                                        if (!z37) {
                                            i17 = 0;
                                            d3Var4.setVisibility(i17);
                                            d3Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                        }
                                    }
                                    i17 = 8;
                                    d3Var4.setVisibility(i17);
                                    d3Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                }
                            }
                            i16 = i10;
                            imageView3.setVisibility(i16);
                            if (d3Var3 != null) {
                            }
                            if (!this.m1) {
                            }
                            i17 = 8;
                            d3Var4.setVisibility(i17);
                            d3Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                        }
                        d3Var4.requestLayout();
                        r9Var.f1.append(this.l1, i3);
                        if (this.u1) {
                            P0(0L);
                            e1();
                            c3Var2.b();
                        }
                        k2Var.setLivePlayer(r9Var.B0);
                        this.v1 = 0;
                        if (r9Var.P0 != null && (storyItem12 = h4Var.a) != null) {
                            int i36 = storyItem12.id;
                            i20 = 0;
                            while (true) {
                                if (i20 < r9Var.P0.i.size()) {
                                    zi ziVar = (zi) r9Var.P0.i.get(i20);
                                    if (ziVar != null && ziVar.f1() == i36) {
                                        this.v1 = i20;
                                        break;
                                    }
                                    i20++;
                                } else {
                                    break;
                                }
                            }
                        }
                        int i37 = this.t1;
                        this.w1 = i37;
                        int i38 = this.k1;
                        this.x1 = i38;
                        if (r9Var.S0) {
                            this.w1 = (i38 - 1) - i37;
                        }
                        l10 = h4Var.l();
                        ai.d2 d2Var = this.i0;
                        if (l10) {
                            d2Var.setVisibility(0);
                            this.O2 = h4Var.j() ? 1.0f : 0.5f;
                            boolean j11 = h4Var.j();
                            ImageView imageView4 = this.k0;
                            fh0 fh0Var = this.j0;
                            if (j11) {
                                fh0Var.setVisibility(0);
                                imageView4.setVisibility(8);
                                d2Var.setContentDescription(bd.L0(!r9.E1 ? 2131748322 : 2131743859));
                            } else {
                                fh0Var.setVisibility(8);
                                imageView4.setVisibility(0);
                                d2Var.setContentDescription(bd.L0(2131748159));
                            }
                            d2Var.setAlpha((1.0f - this.O3) * this.O2);
                        } else {
                            d2Var.setVisibility(8);
                        }
                        y6Var7 = h4Var.b;
                        u8 u8Var = this.m0;
                        if (y6Var7 != null) {
                            u8Var.a(this.m1, y6Var7, z21 && this.M3);
                        } else {
                            TL_stories.StoryItem storyItem24 = h4Var.a;
                            if (storyItem24 != null) {
                                u8Var.b(this.m1, storyItem24, z21 && this.M3);
                            } else {
                                u8Var.b(this.m1, null, z21 && this.M3);
                            }
                        }
                        this.M3 = false;
                        u8Var.setTranslationX(d2Var.getVisibility() == 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                        if (z20) {
                            this.a3 = false;
                            TL_stories.StoryItem storyItem25 = h4Var.a;
                            if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                this.o0.setReaction(null);
                            } else {
                                this.o0.setReaction(dh.n0.d(reaction));
                            }
                        }
                        y6Var8 = h4Var.b;
                        if (y6Var8 == null && y6Var8.J) {
                            u0();
                            this.T1.set(h4Var.b.c.x);
                            this.T1.setVisibility(0);
                            ViewPropertyAnimator viewPropertyAnimator = this.U1;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.U1 = null;
                            }
                            if (z21) {
                                ViewPropertyAnimator interpolator = this.T1.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.h);
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
                            if (z21 && this.T1.getVisibility() == 0) {
                                ViewPropertyAnimator withEndAction = this.T1.animate().alpha(0.0f).setDuration(180L).setInterpolator(xq.h).withEndAction(new a2(this, 0));
                                this.U1 = withEndAction;
                                withEndAction.start();
                            } else {
                                this.T1.setAlpha(0.0f);
                                this.T1.setVisibility(8);
                            }
                        }
                        this.h1.a(r9.E1, false);
                        if (this.u1 && h4Var.a != null) {
                            org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + h4Var.a.id + " " + h4.c(h4Var));
                        }
                        if (this.m1) {
                            k5.f(this.m2, this.l1, h4Var.a);
                        }
                        e4 e4Var = f4Var.b;
                        r6 r6Var3 = r9Var.P0;
                        e4Var.setPadding(0, 0, (r6Var3 != null || r6Var3.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                        hp.s1(this.m2).T1().l(h4Var.a);
                        if (!z10 && !this.m1 && this.j3 == null && !az.T && az.U) {
                            a2 a2Var = new a2(this, 1);
                            this.j3 = a2Var;
                            org.telegram.messenger.g0.i3(a2Var, 500L);
                        }
                        l3Var3 = this.q0;
                        if (!(l3Var3 == null && l3Var3.W) && h4Var.j() && r9.E1) {
                            i18 = 0;
                            if (hp.e1().getInt("taptostorysoundhint", 0) < 2) {
                                a2 a2Var2 = this.B3;
                                org.telegram.messenger.g0.r(a2Var2);
                                org.telegram.messenger.g0.i3(a2Var2, 250L);
                            }
                        } else {
                            i18 = 0;
                        }
                        imageView = this.g0;
                        if (imageView != null) {
                            if (G0() && !H0()) {
                                z40 = h4Var.e;
                                if (!z40) {
                                    i19 = 8;
                                    imageView.setVisibility(i19);
                                }
                            }
                            i19 = i18;
                            imageView.setVisibility(i19);
                        }
                        imageView2 = this.h0;
                        if (imageView2 != null) {
                            z39 = h4Var.f;
                            if (z39 && !u8Var.f) {
                                i35 = i18;
                            }
                            imageView2.setVisibility(i35);
                            return;
                        }
                        return;
                    }
                }
                k2Var.r(this.l1, null);
                k2Var.setVisibility(8);
                m3Var2.invalidate();
                if (this.A1 != null) {
                    ((i9) this.A1).a(this.t1, this.l1);
                }
                z36 = this.n1;
                d3 d3Var32 = this.z0;
                ImageView imageView32 = this.x0;
                d3 d3Var42 = this.n0;
                if (z36) {
                }
                d3Var42.requestLayout();
                r9Var.f1.append(this.l1, i3);
                if (this.u1) {
                }
                k2Var.setLivePlayer(r9Var.B0);
                this.v1 = 0;
                if (r9Var.P0 != null) {
                    int i362 = storyItem12.id;
                    i20 = 0;
                    while (true) {
                        if (i20 < r9Var.P0.i.size()) {
                        }
                        i20++;
                    }
                }
                int i372 = this.t1;
                this.w1 = i372;
                int i382 = this.k1;
                this.x1 = i382;
                if (r9Var.S0) {
                }
                l10 = h4Var.l();
                ai.d2 d2Var2 = this.i0;
                if (l10) {
                }
                y6Var7 = h4Var.b;
                u8 u8Var2 = this.m0;
                if (y6Var7 != null) {
                }
                this.M3 = false;
                u8Var2.setTranslationX(d2Var2.getVisibility() == 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                if (z20) {
                }
                y6Var8 = h4Var.b;
                if (y6Var8 == null) {
                }
                if (this.T1 != null) {
                }
                this.h1.a(r9.E1, false);
                if (this.u1) {
                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + h4Var.a.id + " " + h4.c(h4Var));
                }
                if (this.m1) {
                }
                e4 e4Var2 = f4Var.b;
                r6 r6Var32 = r9Var.P0;
                e4Var2.setPadding(0, 0, (r6Var32 != null || r6Var32.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                hp.s1(this.m2).T1().l(h4Var.a);
                if (!z10) {
                    a2 a2Var3 = new a2(this, 1);
                    this.j3 = a2Var3;
                    org.telegram.messenger.g0.i3(a2Var3, 500L);
                }
                l3Var3 = this.q0;
                if (l3Var3 == null) {
                }
                i18 = 0;
                if (hp.e1().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.g0;
                if (imageView != null) {
                }
                imageView2 = this.h0;
                if (imageView2 != null) {
                }
            }
        }
        z16 = false;
        m3Var = this.M0;
        q3Var = this.u0;
        f4Var = this.Y0;
        if (y6Var4 != null) {
        }
        s2Var = this.L1;
        if (s2Var != null) {
        }
        z17 = h4Var2.f;
        if (z17) {
        }
        fxVar.c();
        this.G0 = 0L;
        this.I0 = false;
        y6Var5 = h4Var2.b;
        if (y6Var5 == null) {
        }
        acVar = org.telegram.ui.Components.ac.w;
        if (acVar != null) {
            acVar.b();
        }
        q3Var.J();
        o0();
        z16 = true;
        if (z16) {
        }
        f4Var.setOnSubtitleClick(null);
        TextView[] textViewArr2 = f4Var.c;
        this.A3 = 0;
        boolean z612 = z60;
        long j102 = this.l1;
        c3Var2 = c3Var;
        z19 = h4Var2.f;
        U0(j102, false, z19);
        y6Var6 = h4Var2.b;
        if (y6Var6 == null) {
        }
        z20 = z16;
        z21 = z59;
        m3Var2 = m3Var;
        q3Var2 = q3Var;
        charSequence4 = charSequence2;
        z22 = z612;
        charSequence = charSequence4;
        if (charSequence != null) {
        }
        l3Var = this.p0;
        if (l3Var != null) {
        }
        l3Var2 = this.q0;
        if (l3Var2 != null) {
        }
        storyItem10 = h4Var.a;
        if (storyItem6 == storyItem10) {
        }
        h4Var.o();
        if (!h4Var.g) {
        }
        r9 r9Var52 = ((i9) c4Var).d;
        r9Var52.a1 = false;
        r9Var52.d0();
        z24 = h4Var.f;
        if (z24) {
        }
        if (z25 != this.q1) {
        }
        linearLayout = this.Q1;
        int i352 = 8;
        if (linearLayout != null) {
        }
        z26 = this.M2;
        LinearLayout linearLayout22 = this.y0;
        if (z26) {
        }
        hVar = this.M1;
        if (hVar != null) {
        }
        aVar = this.H1;
        k2 k2Var2 = this.v0;
        if (aVar != null) {
        }
        s1Var = this.K1;
        if (s1Var != null) {
        }
        if (this.J1 != null) {
        }
        z35 = h4Var.f;
        if (z35) {
        }
        q3 q3Var32 = q3Var2;
        if (this.u1) {
        }
        q3Var32.setVisibility(8);
        storyItem11 = h4Var.a;
        if (storyItem11 != null) {
        }
        k2Var2.r(this.l1, null);
        k2Var2.setVisibility(8);
        m3Var2.invalidate();
        if (this.A1 != null) {
        }
        z36 = this.n1;
        d3 d3Var322 = this.z0;
        ImageView imageView322 = this.x0;
        d3 d3Var422 = this.n0;
        if (z36) {
        }
        d3Var422.requestLayout();
        r9Var.f1.append(this.l1, i3);
        if (this.u1) {
        }
        k2Var2.setLivePlayer(r9Var.B0);
        this.v1 = 0;
        if (r9Var.P0 != null) {
        }
        int i3722 = this.t1;
        this.w1 = i3722;
        int i3822 = this.k1;
        this.x1 = i3822;
        if (r9Var.S0) {
        }
        l10 = h4Var.l();
        ai.d2 d2Var22 = this.i0;
        if (l10) {
        }
        y6Var7 = h4Var.b;
        u8 u8Var22 = this.m0;
        if (y6Var7 != null) {
        }
        this.M3 = false;
        u8Var22.setTranslationX(d2Var22.getVisibility() == 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
        if (z20) {
        }
        y6Var8 = h4Var.b;
        if (y6Var8 == null) {
        }
        if (this.T1 != null) {
        }
        this.h1.a(r9.E1, false);
        if (this.u1) {
        }
        if (this.m1) {
        }
        e4 e4Var22 = f4Var.b;
        r6 r6Var322 = r9Var.P0;
        e4Var22.setPadding(0, 0, (r6Var322 != null || r6Var322.g() == this.x1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
        hp.s1(this.m2).T1().l(h4Var.a);
        if (!z10) {
        }
        l3Var3 = this.q0;
        if (l3Var3 == null) {
        }
        i18 = 0;
        if (hp.e1().getInt("taptostorysoundhint", 0) < 2) {
        }
        imageView = this.g0;
        if (imageView != null) {
        }
        imageView2 = this.h0;
        if (imageView2 != null) {
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        g1 g1Var;
        int i11 = hs.v5;
        r9 r9Var = this.t0;
        boolean z10 = false;
        if (i3 == i11 || (i3 == hs.x5 && r9Var.P0 == objArr[0])) {
            c4 c4Var = this.A1;
            if (c4Var == null || !((i9) c4Var).d.I0) {
                if (this.u1) {
                    h1();
                    if (this.k1 == 0) {
                        if (this.o2) {
                            return;
                        }
                        this.o2 = true;
                        ((i9) this.A1).j();
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
                TL_stories.PeerStories peerStories = r9Var.R0;
                if (peerStories != null) {
                    this.C1.V(peerStories, true);
                } else {
                    long j10 = this.l1;
                    if (j10 != 0) {
                        z6 z6Var = this.C1;
                        TL_stories.PeerStories y9 = z6Var.y(j10);
                        if (y9 == null) {
                            y9 = z6Var.z(j10);
                            z10 = true;
                        }
                        z6Var.V(y9, z10);
                    }
                }
                org.telegram.ui.ActionBar.y0 y0Var = this.c1;
                if (y0Var != null) {
                    y0Var.animate().alpha((this.C1.M(this.l1) && this.y1.e && !az.b()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == hs.m3) {
            d1(false);
            return;
        }
        if (i3 == hs.i4) {
            this.u0.c0.invalidate();
            return;
        }
        if (i3 == hs.D5) {
            p0(true);
            return;
        }
        if (i3 == hs.b3) {
            t6 o10 = hp.s1(this.m2).P1().o();
            if (o10 == null || !o10.a(this.m2, 1) || this.A1 == null) {
                return;
            }
            ai.c7 c7Var = new ai.c7(this, 2);
            Context W = org.telegram.messenger.g0.W(getContext());
            if (W == null) {
                W = LaunchActivity.K1;
            }
            ((i9) this.A1).h(new vg.i0(o10.b(), this.m2, W, c7Var, null));
            return;
        }
        if (i3 == hs.i3) {
            TL_account.RequirementToContact J2 = hp.s1(this.m2).J2(this.l1);
            boolean z11 = this.l1 >= 0 && !h10.i(this.m2).q() && (J2 instanceof TL_account.requirementToContactPremium);
            if (this.p1 == z11 && this.r1 == org.telegram.messenger.m5.k(J2)) {
                return;
            }
            this.p1 = z11;
            this.r1 = org.telegram.messenger.m5.k(J2);
            d1(false);
            p0(true);
            return;
        }
        if (i3 == hs.T) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.l1 == (-((TLRPC.ChatFull) obj).id)) {
                d1(false);
                return;
            }
            return;
        }
        if (i3 != hs.G2) {
            if (i3 == hs.F && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (r9Var == null || (g1Var = r9Var.B0) == null || g1Var.g() != longValue) {
            return;
        }
        d1(false);
        s2 s2Var = this.L1;
        if (s2Var != null) {
            s2Var.E(true);
            this.L1.Q1(true);
            p0(true);
        }
        k2 k2Var = this.v0;
        if (k2Var != null) {
            g1 g1Var2 = k2Var.Q;
            if (k2Var.I != (g1Var2 != null ? g1Var2.j() : 0L)) {
                k2Var.e.O(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sd sdVar;
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
        d3 d3Var = this.n0;
        if (z10) {
            float measuredWidth = (d3Var.getMeasuredWidth() / 2.0f) + d3Var.getX() + linearLayout.getX();
            float measuredHeight = (d3Var.getMeasuredHeight() / 2.0f) + d3Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.g0.L(24.0f);
            float f10 = L / 2.0f;
            float T1 = org.telegram.messenger.g0.T1(this.g3, measuredWidth - f10, xq.g.getInterpolation(this.f3));
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
            float measuredWidth2 = (d3Var.getMeasuredWidth() / 2.0f) + d3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (d3Var.getMeasuredHeight() / 2.0f) + d3Var.getY() + linearLayout.getY();
            int L2 = org.telegram.messenger.g0.L(120.0f);
            if (this.Z2) {
                dh.d dVar = this.W2;
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
        s2 s2Var = this.L1;
        if (s2Var != null) {
            sd sdVar2 = s2Var.z1;
            sd sdVar3 = s2Var.A1;
            if (s2Var.getAlpha() == 0.0f || (sdVar = s2Var.f1) == null || sdVar.getParent() == null || s2Var.f1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(s2Var.f1.getX() + sdVar2.getX() + sdVar3.getX() + s2Var.getX(), s2Var.f1.getY() + sdVar2.getY() + sdVar3.getY() + s2Var.getY());
            if (s2Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, s2Var.getMeasuredWidth(), s2Var.getMeasuredHeight(), (int) (s2Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            s2Var.f1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        si.f fVar;
        float L;
        if (view == this.N2) {
            canvas.save();
            canvas.clipRect(0.0f, this.N2.getY(), getMeasuredWidth(), this.N2.getY() + this.N2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        s2 s2Var = this.L1;
        Paint paint = this.X1;
        d3 d3Var = this.n0;
        g4 g4Var = this.h1;
        if (view == s2Var) {
            float f10 = this.a2;
            h4 h4Var = this.y1;
            if (f10 > 0.0f && !h4Var.f) {
                g4Var.l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), g4Var.l);
            }
            RectF rectF = g4Var.h;
            RectF rectF2 = g4Var.i;
            RectF rectF3 = g4Var.j;
            rectF.set(this.L1.getX(), this.L1.getY() + this.L1.getAnimatedTop() + org.telegram.messenger.g0.L(1.33f), this.L1.getX() + this.L1.getMeasuredWidth(), this.L1.getY() + this.L1.getMeasuredHeight());
            float L2 = org.telegram.messenger.g0.L(40.0f);
            if (h4Var.f) {
                L = org.telegram.messenger.g0.L(46.0f);
                L2 = org.telegram.messenger.g0.L(46.0f);
                s1 s1Var = this.K1;
                if (s1Var != null && s1Var.getVisibility() == 0) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
            } else {
                if (this.C2) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (this.D2 && this.n1) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (d3Var != null && d3Var.getVisibility() == 0) {
                    L2 = (L2 - org.telegram.messenger.g0.L(40.0f)) + d3Var.getLayoutParams().width;
                }
                L = 0.0f;
            }
            rectF2.set(org.telegram.messenger.g0.L(10.0f) + L, ((this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(38.0f), (getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - L2, (this.L1.getY() + this.L1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f));
            this.L1.setTranslationX((1.0f - this.a2) * L);
            this.L1.getEditField().setTranslationY(com.google.android.recaptcha.internal.a.y(1.0f, this.a2, -org.telegram.messenger.g0.L(2.0f), this.L1.getMeasuredHeight() > org.telegram.messenger.g0.L(50.0f) ? ((1.0f - this.a2) * (this.L1.getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f))) + 0.0f : 0.0f));
            float L3 = org.telegram.messenger.g0.L(50.0f) / 2.0f;
            org.telegram.messenger.g0.Z1(rectF2, g4Var.h, this.a2, rectF3);
            gh.g gVar = this.V1;
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
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (s2Var != null && s2Var.s0(view)) {
                float L4 = org.telegram.messenger.g0.L(30.0f);
                RectF rectF4 = g4Var.k;
                RectF rectF5 = g4Var.k;
                rectF4.set(0.0f, view.getY() + org.telegram.messenger.g0.L(1.0f), getWidth(), org.telegram.messenger.g0.L(20.0f) + getHeight());
                Path path = this.L3;
                path.rewind();
                path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                gh.g gVar2 = this.W1;
                if (gVar2 != null) {
                    gVar2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    gVar2.s(L4, L4, L4, L4);
                    gVar2.setAlpha(hs.e4);
                    gVar2.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, L4, L4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.P1 || this.L1 == null) {
                if (view == this.b3) {
                    view.setTranslationY((this.y0.getY() + (d3Var.getY() + (-(r2.getMeasuredHeight() - this.b3.getPaddingBottom())))) - org.telegram.messenger.g0.L(18.0f));
                } else {
                    m3 m3Var = this.M0;
                    if (view == m3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.r3) != null && !fVar.r) {
                        RecordingCanvas h = fVar.h(getMeasuredWidth(), getMeasuredHeight());
                        h.drawColor(i0.a.f(0.2f, -16777216, -1));
                        h.translate(m3Var.getX(), m3Var.getY());
                        view.draw(h);
                        fVar.i();
                    }
                }
            } else {
                view.setTranslationY(((this.L1.getY() + this.L1.getAnimatedTop()) + (-r2.getMeasuredHeight())) - org.telegram.messenger.g0.L(18.0f));
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1() {
        ArrayList arrayList;
        int i3;
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
        String i15 = com.google.android.recaptcha.internal.a.i(max, "_", max);
        ArrayList arrayList11 = this.C3;
        arrayList11.clear();
        ArrayList arrayList12 = this.D3;
        arrayList12.clear();
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.R0;
            if (i17 >= arrayList.size()) {
                break;
            }
            ((dh.e0) arrayList.get(i17)).b(false);
            i17++;
        }
        arrayList.clear();
        int i18 = 0;
        while (i18 < 2) {
            int i19 = this.t1;
            if (i18 == 0) {
                i10 = i19 - 1;
                imageReceiver = this.P0;
                if (i10 < 0) {
                    imageReceiver.f();
                    arrayList7 = arrayList11;
                    arrayList9 = arrayList;
                    i14 = i18;
                    arrayList8 = arrayList12;
                    i18 = i14 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i16 = 0;
                }
                ArrayList arrayList13 = this.g1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.f1;
                if (isEmpty && i10 >= arrayList2.size()) {
                    T0((y6) arrayList13.get(i10 - arrayList2.size()), imageReceiver, i15);
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < 0) {
                        i10 = i16;
                    }
                    if (i10 >= arrayList2.size()) {
                        i10 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i10);
                    long j10 = this.l1;
                    storyItem2.dialogId = j10;
                    y6 t10 = this.C1.t(j10, storyItem2);
                    if (t10 != null) {
                        T0(t10, imageReceiver, i15);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList;
                        i11 = i18;
                        str = null;
                        storyItem = storyItem2;
                        i12 = 1;
                    } else {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        int i20 = (messageMedia == null || !zi.L4(messageMedia.getDocument())) ? i16 : 1;
                        String str3 = storyItem2.attachPath;
                        if (str3 != null) {
                            int i21 = i20;
                            if (storyItem2.media == null) {
                                i21 = str3.toLowerCase().endsWith(".mp4");
                            }
                            if (i21 != 0) {
                                str2 = null;
                                i13 = 1;
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i18;
                                imageReceiver.u0(ac.g(storyItem2.attachPath), t4.c.q(i15, "_pframe"), ac.g(storyItem2.firstFramePath), i15, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i18;
                                str2 = null;
                                i13 = 1;
                                String str4 = i15;
                                imageReceiver.r0(ac.g(storyItem2.attachPath), str4, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                                i15 = str4;
                            }
                            str = str2;
                            i12 = i13;
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i11 = i18;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (i20 != 0) {
                                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(storyItem2.media.getDocument().thumbs, 1000, false, null, false);
                                ac b10 = ac.b(z6.C(this.m2, storyItem2));
                                String q10 = t4.c.q(i15, "_pframe");
                                ac c2 = ac.c(w10, storyItem2.media.getDocument());
                                storyItem = storyItem2;
                                str = null;
                                i12 = 1;
                                imageReceiver2.u0(b10, q10, c2, i15, null, null, null, 0L, null, storyItem, 0);
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
                                    imageReceiver2.u0(null, null, ac.i(w11, photo), i15, null, null, null, 0L, null, storyItem, 0);
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (((messageMedia3 == null || !zi.L4(messageMedia3.getDocument())) ? 0 : i12) != 0) {
                        TLRPC.Document C = z6.C(this.m2, storyItem);
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
                                        if (org.telegram.messenger.b6.g()) {
                                            org.telegram.messenger.w7.G(this.m2).X(C, storyItem, i12, i12);
                                        }
                                    } catch (UnsupportedEncodingException e11) {
                                        e = e11;
                                        e.printStackTrace();
                                        if (storyItem.media_areas != null) {
                                        }
                                        arrayList9 = arrayList5;
                                        i18 = i14 + 1;
                                        arrayList11 = arrayList7;
                                        arrayList12 = arrayList8;
                                        arrayList = arrayList9;
                                        i16 = 0;
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
                            i18 = i14 + 1;
                            arrayList11 = arrayList7;
                            arrayList12 = arrayList8;
                            arrayList = arrayList9;
                            i16 = 0;
                        }
                    } else {
                        arrayList7 = arrayList3;
                        i14 = i11;
                        arrayList8 = arrayList4;
                    }
                    if (storyItem.media_areas != null) {
                        int i22 = 0;
                        while (i22 < storyItem.media_areas.size()) {
                            if (storyItem.media_areas.get(i22) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i22);
                                dh.e0 e0Var = new dh.e0(this);
                                e0Var.e(dh.n0.d(tL_mediaAreaSuggestedReaction.reaction));
                                e0Var.b(this.K0);
                                arrayList10 = arrayList5;
                                arrayList10.add(e0Var);
                            } else {
                                arrayList10 = arrayList5;
                            }
                            i22++;
                            arrayList5 = arrayList10;
                        }
                    }
                    arrayList9 = arrayList5;
                    i18 = i14 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i16 = 0;
                }
                arrayList7 = arrayList11;
                arrayList9 = arrayList;
                i14 = i18;
                arrayList8 = arrayList12;
                i18 = i14 + 1;
                arrayList11 = arrayList7;
                arrayList12 = arrayList8;
                arrayList = arrayList9;
                i16 = 0;
            } else {
                i10 = i19 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.Q0;
                if (i10 >= storiesCount) {
                    imageReceiver3.f();
                    arrayList7 = arrayList11;
                    arrayList9 = arrayList;
                    i14 = i18;
                    arrayList8 = arrayList12;
                    i18 = i14 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i16 = 0;
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
                    i14 = i18;
                    arrayList8 = arrayList12;
                    i18 = i14 + 1;
                    arrayList11 = arrayList7;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                    i16 = 0;
                }
            }
        }
        ArrayList arrayList14 = arrayList11;
        ArrayList arrayList15 = arrayList12;
        i9 i9Var = (i9) this.A1;
        r9 r9Var = i9Var.d;
        if (az.j() && az.b()) {
            boolean z10 = r9Var.I0;
            ArrayList arrayList16 = r9Var.N0;
            if (z10) {
                return;
            }
            for (int i23 = 0; i23 < arrayList16.size(); i23++) {
                for (int i24 = 0; i24 < arrayList14.size(); i24++) {
                    if (((Uri) arrayList14.get(i24)).equals(((q9) arrayList16.get(i23)).uri)) {
                        arrayList14.remove(i24);
                    }
                }
            }
            for (int i25 = 0; i25 < arrayList14.size(); i25++) {
                Uri uri = (Uri) arrayList14.get(i25);
                q9 q9Var = new q9(r9Var, r9Var.D0, r9Var.C0);
                q9Var.setOnSeekUpdate(new b0(28, i9Var, q9Var));
                q9Var.uri = uri;
                TLRPC.Document document = (TLRPC.Document) arrayList15.get(i25);
                q9Var.document = document;
                if (document != null) {
                    i3 = 0;
                    org.telegram.messenger.s8.J.put(Long.valueOf(document.id), 0);
                } else {
                    i3 = 0;
                    ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.I;
                }
                q9Var.preparePlayer(uri, r9.E1, r9.C1);
                arrayList16.add(q9Var);
                if (arrayList16.size() > 2) {
                    ((q9) arrayList16.remove(i3)).release(null);
                }
            }
        }
    }

    public final void f1() {
        if (this.q1) {
            TextView textView = this.R1;
            if (textView != null) {
                textView.setText(bd.M0(2131748831, null));
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
            textView3.setText(bd.M0(this.o1 ? 2131744675 : 2131744503, null));
        }
        TextView textView4 = this.S1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.S1.setText(bd.M0(2131744502, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i3;
        ArrayList arrayList = this.j1;
        r9 r9Var = this.t0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.g1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i3 = 0;
            } else {
                i3 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j10 = ((y6) arrayList2.get(i10)).a;
                    if (((int) (j10 ^ (j10 >>> 32))) == r9Var.Q0) {
                        this.t1 = i10;
                        return;
                    }
                }
            }
            int indexOf = this.j1.indexOf(Integer.valueOf(r9Var.Q0));
            if (indexOf < 0 && !this.j1.isEmpty()) {
                if (r9Var.Q0 > ((Integer) this.j1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (r9Var.Q0 < ((Integer) k2.p1.h(1, this.j1)).intValue()) {
                    indexOf = this.j1.size() - 1;
                }
            }
            this.t1 = i3 + indexOf;
        } else {
            int i11 = r9Var.f1.get(this.l1, -1);
            this.t1 = i11;
            if (i11 == -1 && !r9Var.O0 && (peerStories = this.e1) != null && peerStories.max_read_id > 0) {
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
        m3 m3Var = this.M0;
        Bitmap createBitmap = Bitmap.createBitmap(m3Var.getWidth(), m3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.t1;
    }

    public z6 getStoriesController() {
        return hp.s1(this.m2).P1();
    }

    public int getStoriesCount() {
        return Math.max(this.n2, this.f1.size()) + this.g1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f1;
    }

    public final void h1() {
        r6 r6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f1;
        arrayList.clear();
        r9 r9Var = this.t0;
        if (!r9Var.O0) {
            ArrayList arrayList2 = this.j1;
            int i3 = 0;
            ArrayList arrayList3 = this.g1;
            if (arrayList2 != null && (r6Var = r9Var.P0) != null) {
                if (r6Var instanceof k6) {
                    arrayList3.clear();
                    ArrayList F = hp.s1(this.m2).P1().F(this.l1);
                    String str = ((k6) r9Var.P0).E;
                    if (F != null) {
                        for (int i10 = 0; i10 < F.size(); i10++) {
                            y6 y6Var = (y6) F.get(i10);
                            gi.f7 f7Var = y6Var.c;
                            if (f7Var != null && !f7Var.g && TextUtils.equals(f7Var.K0, str)) {
                                arrayList3.add(y6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.j1;
                int size = arrayList4.size();
                while (i3 < size) {
                    Object obj = arrayList4.get(i3);
                    i3++;
                    zi f10 = r9Var.P0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (r9Var.P0 != null) {
                while (i3 < r9Var.P0.i.size()) {
                    arrayList.add(((zi) r9Var.P0.i.get(i3)).l);
                    i3++;
                }
            } else {
                TL_stories.PeerStories peerStories = r9Var.R0;
                if (peerStories == null || org.telegram.messenger.m5.o(peerStories.peer) != this.l1) {
                    TL_stories.PeerStories y9 = this.C1.y(this.l1);
                    this.e1 = y9;
                    if (y9 == null) {
                        this.e1 = this.C1.z(this.l1);
                    }
                } else {
                    this.e1 = r9Var.R0;
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
        } else if (!r9Var.T0) {
            arrayList.add(r9Var.U0);
        }
        this.k1 = getStoriesCount();
    }

    public final void i0(boolean z10) {
        j4 currentPeerView;
        k40 k40Var = this.t2;
        if (k40Var != null) {
            k40Var.f0 = null;
            k40Var.a(false);
        }
        long j10 = this.l1;
        TL_stories.StoryItem storyItem = this.y1.a;
        r9 r9Var = this.t0;
        r9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            r9.F1.remove(j10 + (j10 >> 16) + (storyItem.id << 16));
        }
        this.S2 = true;
        g9 g9Var = r9Var.o0;
        if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z10) {
            org.telegram.ui.Components.ac J = new fc(this.M0, this.l0).J(R.raw.forward, bd.M0(2131748491, null), bd.M0(2131743562, null), 5000, false, new a2(this, 2));
            J.r = false;
            J.k(false);
        }
        hp.s1(this.m2).s0(this.l1, 0, null);
    }

    public final void i1(boolean z10) {
        int i3;
        int i10;
        h4 h4Var = this.y1;
        TL_stories.StoryItem storyItem = h4Var.a;
        if (storyItem == null) {
            storyItem = h4Var.c;
        }
        boolean z11 = this.n1;
        if (z11 || this.m1) {
            if (storyItem == null) {
                this.k2.setText("");
                this.p2.setVisibility(8);
                this.l2.setVisibility(8);
                return;
            }
            r9 r9Var = this.t0;
            d3 d3Var = this.n0;
            if (!z11) {
                int i11 = 3;
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.k2.setText(r9Var.P0 == null ? bd.M0(2131748131, null) : bd.M0(2131748130, null));
                    this.k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    this.l2.setVisibility(8);
                    this.p2.setVisibility(8);
                } else {
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i12 >= storyItem.views.recent_viewers.size()) {
                            i3 = i11;
                            break;
                        }
                        TLObject e22 = hp.s1(this.m2).e2(storyItem.views.recent_viewers.get(i12).longValue());
                        if (e22 != null) {
                            this.l2.b(i13, this.m2, e22);
                            i13++;
                        }
                        i3 = i11;
                        if (i13 >= i3) {
                            break;
                        }
                        i12++;
                        i11 = i3;
                    }
                    for (int i14 = i13; i14 < i3; i14++) {
                        this.l2.b(i14, this.m2, null);
                    }
                    this.l2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        wp wpVar = new wp(R.drawable.mini_views_likes, 0);
                        wpVar.y = -53704;
                        wpVar.n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        wp wpVar2 = new wp(R.drawable.mini_repost_story, 0);
                        wpVar2.y = -14161823;
                        wpVar2.n = org.telegram.messenger.g0.L(0.2f);
                        spannableStringBuilder.setSpan(wpVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.k2.setText(spannableStringBuilder);
                    if (i13 == 0) {
                        this.l2.setVisibility(8);
                        this.k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    } else {
                        this.l2.setVisibility(0);
                        this.k2.setTranslationX(org.telegram.messenger.g0.L(10.0f) + com.google.android.recaptcha.internal.a.e(i13, 1, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(13.0f)));
                    }
                    this.p2.setVisibility(0);
                }
                d3Var.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
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
            TLRPC.Chat M0 = hp.s1(this.m2).M0(Long.valueOf(-this.l1));
            if (!(this.o1 && (org.telegram.messenger.t3.q(M0) || org.telegram.messenger.t3.s0(M0))) && storyItem.views.views_count > 0) {
                this.k2.setText(r9Var.P0 == null ? bd.M0(2131748131, null) : bd.M0(2131748130, null));
                this.k2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new wp(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.o0(storyItem.views.views_count, 0));
                this.k2.setText(spannableStringBuilder2);
            } else {
                this.k2.setText("");
            }
            d3Var.getLayoutParams().width = (int) (org.telegram.messenger.g0.L(40.0f) + (this.E0 ? this.A0.d + org.telegram.messenger.g0.L(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + d3Var.getLayoutParams().width;
            d3 d3Var2 = this.z0;
            if (d3Var2 != null) {
                d3Var2.getLayoutParams().width = (int) (org.telegram.messenger.g0.L(40.0f) + (this.F0 ? org.telegram.messenger.g0.L(4.0f) + this.B0.d : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin += d3Var2.getLayoutParams().width;
                d3Var2.requestLayout();
            }
            this.G1.requestLayout();
            d3Var.requestLayout();
            this.l2.setVisibility(8);
            this.p2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = h4Var.a;
            i3 i3Var = this.T0;
            if (storyItem2 == null) {
                i3Var.getClass();
                return;
            }
            for (int i16 = 0; i16 < i3Var.getChildCount(); i16++) {
                if (i3Var.getChildAt(i16) instanceof w8) {
                    ((w8) i3Var.getChildAt(i16)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void j0() {
        e7 e7Var = this.o0;
        e7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new p2(0, e7Var)).setDuration(150L).start();
        int L = org.telegram.messenger.g0.L(8.0f);
        e7 e7Var2 = new e7(getContext(), this.h1);
        this.o0 = e7Var2;
        e7Var2.setPadding(L, L, L, L);
        this.o0.setAlpha(0.0f);
        this.o0.setScaleX(0.8f);
        this.o0.setScaleY(0.8f);
        this.o0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.n0.addView(this.o0, mf.e(40, 40, 3));
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
        throw new UnsupportedOperationException("Method not decompiled: ei.j4.j1():void");
    }

    public final void k0(boolean z10) {
        ValueAnimator valueAnimator = this.N3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O3, z10 ? 1.0f : 0.0f);
        this.N3 = ofFloat;
        ofFloat.addUpdateListener(new b2(this, 2));
        this.N3.addListener(new n2(this, z10, 1));
        this.N3.setDuration(420L);
        this.N3.setInterpolator(xq.h);
        this.N3.start();
    }

    public final void l0(Runnable runnable) {
        if (hp.s1(this.m2).v2()) {
            org.telegram.ui.b.b(this.m2);
            return;
        }
        int i3 = az.e0;
        if (i3 <= 0 || !this.U2) {
            runnable.run();
            return;
        }
        int i10 = i3 - 1;
        az.e0 = i10;
        az.T(i10);
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(0, getContext(), this.l0);
        s1Var.setTitle(bd.M0(2131744895, null));
        s1Var.n(bd.M0(2131744896, null));
        String M0 = bd.M0(2131746751, null);
        aa.c cVar = new aa.c(runnable);
        s1Var.o0 = M0;
        s1Var.p0 = cVar;
        String M02 = bd.M0(2131752589, null);
        d2.t1 t1Var = new d2.t1(19);
        s1Var.q0 = M02;
        s1Var.r0 = t1Var;
        s1Var.show();
    }

    public final void m0(int i3) {
        this.o2 = false;
        this.F2 = true;
        this.l3 = false;
        this.n1 = false;
        this.o1 = false;
        long j10 = this.l1;
        f4 f4Var = this.Y0;
        org.telegram.ui.Components.u8 u8Var = this.X0;
        if (j10 >= 0) {
            this.m1 = j10 == h10.i(this.m2).e();
            TLRPC.User a22 = hp.s1(this.m2).a2(Long.valueOf(this.l1));
            TL_account.RequirementToContact J2 = hp.s1(this.m2).J2(this.l1);
            this.p1 = !h10.i(this.m2).q() && (J2 instanceof TL_account.requirementToContactPremium);
            this.r1 = org.telegram.messenger.m5.k(J2);
            u8Var.r(a22);
            f4Var.a.getImageReceiver().i0(a22, u8Var, null);
            U0(this.l1, true, false);
        } else {
            this.m1 = false;
            this.n1 = true;
            if (this.C1.h(j10)) {
                this.l3 = true;
            } else {
                boolean z10 = org.telegram.messenger.r2.a;
            }
            TLRPC.Chat M0 = hp.s1(this.m2).M0(Long.valueOf(-this.l1));
            boolean V = org.telegram.messenger.t3.V(M0);
            this.o1 = !V;
            if (!V && hp.s1(this.m2).N0(-this.l1) == null) {
                qr.a0(this.m2).F0(-this.l1, true, new CountDownLatch(1), false, false, 0);
            }
            this.p1 = this.o1 && !org.telegram.messenger.t3.q(M0);
            this.r1 = hp.s1(this.m2).N1(this.l1);
            u8Var.q(M0);
            f4Var.a.getImageReceiver().i0(M0, u8Var, null);
            U0(this.l1, true, false);
        }
        if (this.u1 && (this.m1 || this.n1)) {
            z6 z6Var = this.C1;
            long j11 = this.l1;
            a0.h hVar = z6Var.m;
            aa aaVar = (aa) hVar.f(j11);
            if (aaVar == null) {
                aaVar = new aa(z6Var.a, j11, z6Var);
                hVar.k(aaVar, j11);
            }
            aaVar.b(true);
        }
        h1();
        this.t1 = i3;
        if (i3 < 0) {
            this.t1 = 0;
        }
        this.G0 = 0L;
        this.I0 = false;
        this.t3 = null;
        this.u3 = null;
        boolean z11 = this.n1;
        m3 m3Var = this.M0;
        r9 r9Var = this.t0;
        int i10 = 8;
        h4 h4Var = this.y1;
        if (z11) {
            z0();
            if (this.L1 == null && (this.o1 || h4Var.f)) {
                t0();
            }
            if (this.L1 != null) {
                TLRPC.Chat M02 = hp.s1(this.m2).M0(Long.valueOf(-this.l1));
                s2 s2Var = this.L1;
                if (h4Var.f || (!G0() && this.o1 && (org.telegram.messenger.t3.q(M02) || org.telegram.messenger.t3.s0(M02)))) {
                    i10 = 0;
                }
                s2Var.setVisibility(i10);
                s2 s2Var2 = this.L1;
                boolean z12 = h4Var.f;
                B0(true);
                s2Var2.h1(z12);
                this.L1.n1(h4Var.f && !B0(true) && (this.f2 || this.L1.X0), true);
                xs editField = this.L1.getEditField();
                long j12 = this.l1;
                TL_stories.StoryItem storyItem = h4Var.a;
                r9Var.getClass();
                editField.setText(r9.I(j12, storyItem));
                this.L1.a1(this.m2, this.l1);
                this.L1.L1(M02, null);
            }
            org.telegram.ui.Components.g6 g6Var = this.A0;
            org.telegram.ui.ActionBar.e6 e6Var = this.l0;
            if (g6Var == null) {
                org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, false, false);
                this.A0 = g6Var2;
                d3 d3Var = this.n0;
                g6Var2.setCallback(d3Var);
                this.A0.u(e6Var.h(org.telegram.ui.ActionBar.k6.G6));
                this.A0.w(org.telegram.messenger.g0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.u5(d3Var);
            }
            d3 d3Var2 = this.z0;
            if (d3Var2 != null && this.B0 == null) {
                org.telegram.ui.Components.g6 g6Var3 = new org.telegram.ui.Components.g6(false, false, false);
                this.B0 = g6Var3;
                g6Var3.setCallback(d3Var2);
                this.B0.u(e6Var.h(org.telegram.ui.ActionBar.k6.G6));
                this.B0.w(org.telegram.messenger.g0.L(14.0f));
                this.D0 = new org.telegram.ui.Components.u5(d3Var2);
            }
            if (i3 == -1) {
                g1();
            }
            d1(false);
            this.k1 = getStoriesCount();
            m3Var.invalidate();
            invalidate();
        } else if (this.m1) {
            z0();
            if (h4Var.f) {
                this.G1.setVisibility(8);
                if (this.L1 == null) {
                    t0();
                }
                this.L1.setVisibility(0);
            } else {
                this.G1.setVisibility(0);
                s2 s2Var3 = this.L1;
                if (s2Var3 != null) {
                    s2Var3.setVisibility(8);
                }
            }
            s2 s2Var4 = this.L1;
            if (s2Var4 != null) {
                boolean z13 = h4Var.f;
                B0(true);
                s2Var4.h1(z13);
                this.L1.n1(h4Var.f && !B0(true) && (this.f2 || this.L1.X0), true);
            }
            if (i3 == -1) {
                ArrayList arrayList = this.j1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(r9Var.Q0));
                    if (indexOf < 0 && !this.j1.isEmpty()) {
                        if (r9Var.Q0 > ((Integer) this.j1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (r9Var.Q0 < ((Integer) k2.p1.h(1, this.j1)).intValue()) {
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
            m3Var.invalidate();
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
                this.Q1.setVisibility(((!this.p1 || h4Var.f) && !this.q1) ? 8 : 0);
            }
            n8 n8Var = this.T1;
            if (n8Var != null) {
                n8Var.setVisibility(8);
            }
            if (i3 == -1) {
                g1();
            }
            d1(false);
            s2 s2Var5 = this.L1;
            if (s2Var5 != null) {
                s2Var5.setVisibility((G0() || l10.A(this.l1)) ? 8 : 0);
                s2 s2Var6 = this.L1;
                boolean z14 = h4Var.f;
                B0(true);
                s2Var6.h1(z14);
                this.L1.n1(h4Var.f && !B0(true) && (this.f2 || this.L1.X0), true);
                xs editField2 = this.L1.getEditField();
                long j13 = this.l1;
                TL_stories.StoryItem storyItem2 = h4Var.a;
                r9Var.getClass();
                editField2.setText(r9.I(j13, storyItem2));
                this.L1.a1(this.m2, this.l1);
                TLRPC.UserFull b22 = hp.s1(this.m2).b2(this.l1);
                if (b22 != null) {
                    this.L1.L1(null, b22);
                } else {
                    hp.s1(this.m2).W2(hp.s1(this.m2).a2(Long.valueOf(this.l1)), this.j2, false, null);
                }
            }
            this.k1 = getStoriesCount();
            d3 d3Var3 = this.G1;
            if (d3Var3 != null) {
                d3Var3.setVisibility(8);
            }
            m3Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        q3 q3Var = this.u0;
        if (q3Var.a0.x()) {
            q3Var.a0.f(false);
        }
    }

    public final void o0() {
        if (this.u1) {
            ((i9) this.A1).d.d0();
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.O0.P();
        this.Q0.P();
        this.P0.P();
        this.V2.P();
        this.X2.P();
        s2 s2Var = this.L1;
        if (s2Var != null) {
            s2Var.D0();
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i3 >= arrayList.size()) {
                hs.f(this.m2).c(this, hs.T);
                hs.f(this.m2).c(this, hs.G2);
                hs.f(this.m2).c(this, hs.v5);
                hs.f(this.m2).c(this, hs.m3);
                hs.f(this.m2).c(this, hs.x5);
                hs.f(this.m2).c(this, hs.D5);
                hs.f(this.m2).c(this, hs.b3);
                hs.f(this.m2).c(this, hs.i3);
                hs.f(this.m2).c(this, hs.F);
                hs.e().c(this, hs.i4);
                return;
            }
            ((dh.e0) arrayList.get(i3)).b(true);
            i3++;
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        this.O0.R();
        this.Q0.R();
        this.P0.R();
        this.V2.R();
        this.X2.R();
        s2 s2Var = this.L1;
        if (s2Var != null) {
            s2Var.C0();
        }
        org.telegram.ui.Components.g5 g5Var = this.Y2;
        if (g5Var != null) {
            g5Var.n(this);
            this.Y2 = null;
        }
        dh.d dVar = this.W2;
        if (dVar != null) {
            dVar.d(this);
            this.W2 = null;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i3 >= arrayList.size()) {
                hs.f(this.m2).n(this, hs.T);
                hs.f(this.m2).n(this, hs.G2);
                hs.f(this.m2).n(this, hs.v5);
                hs.f(this.m2).n(this, hs.m3);
                hs.f(this.m2).n(this, hs.x5);
                hs.f(this.m2).n(this, hs.D5);
                hs.f(this.m2).n(this, hs.b3);
                hs.f(this.m2).n(this, hs.i3);
                hs.f(this.m2).n(this, hs.F);
                hs.e().n(this, hs.i4);
                return;
            }
            ((dh.e0) arrayList.get(i3)).b(false);
            i3++;
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.h1.d.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(72.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042e  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        float f10;
        char c2;
        k40 k40Var;
        boolean z10;
        float L;
        FrameLayout.LayoutParams layoutParams;
        li0 li0Var;
        u2 u2Var;
        r9 r9Var = this.t0;
        if (r9Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        }
        int i11 = 0;
        if (this.u1 && this.J2 == null) {
            this.i2 = ((i9) this.A1).d.q0;
        } else {
            this.i2 = 0;
        }
        int size = r9Var.b ? View.MeasureSpec.getSize(i10) : View.MeasureSpec.getSize(i10) + this.i2;
        int size2 = (int) ((View.MeasureSpec.getSize(i3) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.i2 < org.telegram.messenger.g0.L(20.0f)) {
            this.i2 = 0;
        }
        int i12 = this.i2;
        li0 li0Var2 = this.b3;
        if (li0Var2 == null || li0Var2.getReactionsWindow() == null || this.b3.getReactionsWindow().q) {
            s2 s2Var = this.L1;
            if (s2Var != null && (s2Var.r0() || this.L1.l3)) {
                if (this.L1.getEmojiView().getMeasuredHeight() == 0) {
                    i12 = this.L1.getEmojiPadding();
                } else {
                    s2 s2Var2 = this.L1;
                    if (s2Var2.A3) {
                        s2Var2.G();
                        i12 = this.L1.getStickersExpandedHeight();
                    } else {
                        i12 = s2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.b3.getReactionsWindow().c.animate().translationY(-this.i2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.w).start();
            i12 = 0;
        }
        boolean z11 = this.f2;
        int i13 = this.Y1;
        f4 f4Var = this.Y0;
        int i14 = 1;
        if (i13 != i12) {
            this.f2 = false;
            int i15 = 3;
            h4 h4Var = this.y1;
            f10 = 8.0f;
            if (i12 <= 0 || !this.u1) {
                s2 s2Var3 = this.L1;
                if (s2Var3 != null) {
                    r9.X(this.l1, h4Var.a, s2Var3.getEditText());
                }
            } else {
                this.f2 = true;
                this.S2 = false;
                this.d2 = i12;
                if (this.P1 == null) {
                    li0 li0Var3 = new li0(1, this.m2, getContext(), LaunchActivity.Q(), new q2(i15, this.l0));
                    this.P1 = li0Var3;
                    li0Var3.setHint(bd.M0(this.o1 ? 2131744676 : 2131744513, null));
                    li0 li0Var4 = this.P1;
                    li0Var4.O0 = true;
                    addView(li0Var4, this.s0, mf.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.P1.setDelegate(new h3(this));
                    this.P1.p(null, null, true);
                }
                this.P1.setFragment(LaunchActivity.Q());
                this.P1.setHint(bd.M0(this.o1 ? 2131744676 : 2131744513, null));
                dh.j0 j0Var = dh.j0.B;
                if (j0Var != null) {
                    j0Var.l = true;
                }
                dh.j0 j0Var2 = dh.j0.C;
                if (j0Var2 != null) {
                    j0Var2.l = true;
                }
            }
            s2 s2Var4 = this.L1;
            if (s2Var4 != null) {
                s2Var4.n1(h4Var.f && !B0(true) && this.f2, true);
            }
            if (this.f2 && (u2Var = this.N2) != null) {
                u2Var.setVisibility(0);
            }
            if (!this.f2 && (li0Var = this.P1) != null) {
                li0Var.n();
            }
            f4Var.setEnabled(!this.f2);
            if (this.L1 != null) {
                org.telegram.messenger.g0.Z3(null, !this.f2, 0.1f, true, true);
            }
            if (this.u1 && this.f2) {
                r9 r9Var2 = ((i9) this.A1).d;
                if (!r9Var2.y) {
                    r9Var2.y = true;
                    r9Var2.d0();
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
            ofFloat.addUpdateListener(new b2(this, i11));
            this.Z1.addListener(new o2(this, i14));
            if (this.f2) {
                this.Z1.setDuration(250L);
                this.Z1.setInterpolator(org.telegram.ui.ActionBar.h1.w);
                r9Var.z();
            } else {
                this.Z1.setDuration(500L);
                this.Z1.setInterpolator(xq.h);
            }
            this.Z1.start();
            boolean z12 = this.f2;
            if (z12 != z11) {
                if (z12) {
                    l2.e eVar = this.z1;
                    Canvas canvas = (Canvas) eVar.b;
                    Bitmap bitmap = (Bitmap) eVar.c;
                    C0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (org.telegram.messenger.g0.B(org.telegram.messenger.g0.J0(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.a.o(-1, hs.n1));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (h4Var.f) {
                        gi.l3 l3Var = this.N1;
                        if (l3Var != null) {
                            if (!l3Var.W) {
                                removeView(l3Var);
                            }
                        }
                        if (!B0(true) && hp.e1().getInt("taptostoryhighlighthint", 0) < 3) {
                            hp.e1().edit().putInt("taptostoryhighlighthint", hp.e1().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            gi.l3 l3Var2 = new gi.l3(getContext(), 3);
                            this.N1 = l3Var2;
                            l3Var2.u(bd.M0(2131748821, null));
                            this.N1.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            gi.l3 l3Var3 = this.N1;
                            l3Var3.L = Layout.Alignment.ALIGN_OPPOSITE;
                            l3Var3.r0 = new b0(5, this, l3Var2);
                            addView(l3Var3, mf.e(-1, 100, 87));
                            this.N1.w();
                            j1();
                        }
                    }
                } else {
                    s2 s2Var5 = this.L1;
                    if (s2Var5 != null) {
                        s2Var5.getEditField().clearFocus();
                    }
                    gi.l3 l3Var4 = this.N1;
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
        s2 s2Var6 = this.L1;
        if (s2Var6 != null && s2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.L1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        m3 m3Var = this.M0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) m3Var.getLayoutParams();
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
            m3Var.setLayoutParams(layoutParams2);
        }
        d3 d3Var = this.G1;
        if (d3Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) d3Var.getLayoutParams();
            if (this.h2) {
                layoutParams3.topMargin = org.telegram.messenger.g0.L(f10) + L2 + size2;
            } else {
                layoutParams3.topMargin = (L2 + size2) - org.telegram.messenger.g0.L(48.0f);
            }
        }
        ec ecVar = this.L2;
        if (ecVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ecVar.getLayoutParams();
            if (this.h2) {
                c2 = 0;
                this.L2.setTextColor(i0.a.f(0.5f, -16777216, -1));
                layoutParams4.topMargin = org.telegram.messenger.g0.L(12.0f) + L2 + size2;
                k40Var = this.t2;
                if (k40Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) k40Var.getLayoutParams();
                    if (i12 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.k5.B(64.0f, L2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = org.telegram.messenger.g0.L(64.0f) + i12;
                    }
                }
                z10 = this.h2;
                LinearLayout linearLayout = this.y0;
                q3 q3Var = this.u0;
                if (z10) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((L2 + size2) - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(40.0f);
                    int L3 = this.m1 ? org.telegram.messenger.g0.L(40.0f) : org.telegram.messenger.g0.L(56.0f);
                    ((FrameLayout.LayoutParams) q3Var.getLayoutParams()).bottomMargin = L3;
                    if (this.g2 != this.h2) {
                        q3Var.setLayoutParams((FrameLayout.LayoutParams) q3Var.getLayoutParams());
                    }
                    q3Var.v0 = L3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f) + L2 + size2;
                    ((FrameLayout.LayoutParams) q3Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(f10);
                    if (this.g2 != this.h2) {
                        q3Var.setLayoutParams((FrameLayout.LayoutParams) q3Var.getLayoutParams());
                    }
                    q3Var.v0 = org.telegram.messenger.g0.L(f10);
                }
                this.F2 = true;
                L = org.telegram.messenger.g0.L(48.0f);
                if (this.m0.getVisibility() == 0) {
                    L += org.telegram.messenger.g0.L(60.0f);
                }
                if (this.i0.getVisibility() == 0) {
                    L += org.telegram.messenger.g0.L(40.0f);
                }
                e4 e4Var = f4Var.b;
                TextView[] textViewArr = f4Var.c;
                layoutParams = (FrameLayout.LayoutParams) e4Var.getLayoutParams();
                if (layoutParams.rightMargin != L) {
                    int i16 = (int) L;
                    layoutParams.rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[c2].getLayoutParams()).rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i16;
                    f4Var.forceLayout();
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.g2 = this.h2;
            }
            this.L2.setTextColor(i0.a.o(-1, hs.V2));
            layoutParams4.topMargin = ((L2 + size2) - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(40.0f);
        }
        c2 = 0;
        k40Var = this.t2;
        if (k40Var != null) {
        }
        z10 = this.h2;
        LinearLayout linearLayout2 = this.y0;
        q3 q3Var2 = this.u0;
        if (z10) {
        }
        this.F2 = true;
        L = org.telegram.messenger.g0.L(48.0f);
        if (this.m0.getVisibility() == 0) {
        }
        if (this.i0.getVisibility() == 0) {
        }
        e4 e4Var2 = f4Var.b;
        TextView[] textViewArr2 = f4Var.c;
        layoutParams = (FrameLayout.LayoutParams) e4Var2.getLayoutParams();
        if (layoutParams.rightMargin != L) {
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.g2 = this.h2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        this.a2 = -1.0f;
        this.F2 = true;
        invalidate();
    }

    public final void p0(boolean z10) {
        if (this.L1 != null && this.P2 && this.K0) {
            a2 a2Var = this.z3;
            org.telegram.messenger.g0.r(a2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.C1.B;
            this.L1.E(true);
            boolean z11 = this.p1;
            h4 h4Var = this.y1;
            if ((z11 && !h4Var.f) || this.q1) {
                this.U2 = false;
                this.L1.setEnabled(false);
                this.L1.i1(" ", z10);
                return;
            }
            if (this.r1 > 0) {
                this.U2 = false;
                this.L1.setEnabled(true);
                this.L1.i1(wb.T0(bd.a0(null, null, 2131743936, bd.E(this.r1, ','))), z10);
                return;
            }
            if (!h4Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.m2).getCurrentTime();
                int i3 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i3) {
                    this.U2 = true;
                    int currentTime2 = i3 - ConnectionsManager.getInstance(this.m2).getCurrentTime();
                    int i10 = currentTime2 / 60;
                    int i11 = currentTime2 % 60;
                    Locale locale = Locale.US;
                    int measureText = (int) this.L1.getEditField().getPaint().measureText(bd.a0(null, null, 2131744898, String.format(locale, "%02d:%02d", 99, 99)));
                    this.L1.setEnabled(true);
                    if (measureText * 1.2f >= this.L1.getEditField().getMeasuredWidth()) {
                        s2 s2Var = this.L1;
                        String a02 = bd.a0(null, null, 2131744898, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11));
                        s2Var.e = a02;
                        s2Var.f = format;
                        s2Var.H1(z10);
                    } else {
                        this.L1.i1(bd.a0(null, null, 2131744899, String.format(locale, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11))), z10);
                    }
                    org.telegram.messenger.g0.i3(a2Var, 1000L);
                    return;
                }
            }
            this.U2 = false;
            this.L1.setEnabled(true);
            if (!h4Var.f) {
                this.L1.i1(bd.M0(this.o1 ? 2131746260 : 2131746265, null), z10);
                return;
            }
            if (this.L1.getStarsPrice() <= 0) {
                this.L1.i1(bd.M0(2131752005, null), z10);
                return;
            }
            this.L1.i1(wb.Y0(false, bd.a0(null, null, 2131752004, bd.E((int) r0, ',')), this.L1.P4), z10);
            wp wpVar = this.L1.P4[0];
            if (wpVar != null) {
                wpVar.H = 0.9f;
            }
        }
    }

    public final boolean q0() {
        int i3 = 0;
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
        i3 i3Var = this.T0;
        if (i3Var != null) {
            gi.l3 l3Var = i3Var.c;
            if (l3Var != null) {
                l3Var.f(true);
                i3Var.c = null;
            }
            i3Var.b = null;
            i3Var.invalidate();
            i3Var.b(false);
        }
        q3 q3Var = this.u0;
        if (q3Var.a0.x()) {
            q3Var.a0.f(false);
            return true;
        }
        gi.l3 l3Var2 = this.p0;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
        gi.l3 l3Var3 = this.q0;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        u20 u20Var = this.G2;
        if (u20Var != null) {
            u20Var.a();
        }
        b4 b4Var = this.d1;
        if (b4Var != null && b4Var.a) {
            b4Var.a();
            return true;
        }
        s2 s2Var = this.L1;
        if (s2Var != null && s2Var.t0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.l0);
            boolean z10 = this.L1.d1;
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            if (z10) {
                s1Var.S = bd.M0(2131751396, null);
                s1Var.U = bd.M0(2131751397, null);
            } else {
                s1Var.S = bd.M0(2131751393, null);
                s1Var.U = bd.M0(2131751394, null);
            }
            alertDialog$Builder.k(bd.M0(2131751395, null), new x1(this, i3));
            alertDialog$Builder.h(bd.M0(2131751771, null), null);
            ((i9) this.A1).h(s1Var);
            return true;
        }
        li0 li0Var = this.P1;
        if (li0Var != null && li0Var.getReactionsWindow() != null && !this.P1.getReactionsWindow().q) {
            this.P1.getReactionsWindow().d();
            return true;
        }
        s2 s2Var2 = this.L1;
        if (s2Var2 != null && s2Var2.r0()) {
            if (this.i2 > 0) {
                org.telegram.messenger.g0.v1(this.L1.getEmojiView());
                return true;
            }
            this.L1.k0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            if (q3Var.getVisibility() != 0 || q3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            q3Var.D();
            this.Q2 = false;
            this.M0.invalidate();
            return true;
        }
        s2 s2Var3 = this.L1;
        if (s2Var3 != null) {
            long j10 = this.l1;
            TL_stories.StoryItem storyItem = this.y1.a;
            Editable editText = s2Var3.getEditText();
            this.t0.getClass();
            r9.X(j10, storyItem, editText);
        }
        org.telegram.messenger.g0.v1(this.L1);
        return true;
    }

    public final void r0() {
        if (this.s2 == null) {
            x2 x2Var = new x2(this, getContext(), this.l0);
            this.s2 = x2Var;
            x2Var.U3 = new y2(this);
            x2Var.b2.i0();
            x2 x2Var2 = this.s2;
            x2Var2.O1 = true;
            x2Var2.e1();
            x2 x2Var3 = this.s2;
            x2Var3.P1 = new z2(this);
            x2Var3.a1().setText(this.L1.getFieldText());
        }
    }

    public final void s0() {
        if (this.H1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.s3);
        this.H1 = aVar;
        aVar.setOnClickListener(new c2(this, 1));
        addView(this.H1, mf.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public void setAccount(int i3) {
        this.m2 = i3;
        this.C1 = hp.s1(i3).i0;
        this.U0.b = i3;
        li0 li0Var = this.P1;
        if (li0Var != null) {
            li0Var.setCurrentAccount(i3);
            this.P1.p(null, null, true);
        }
        li0 li0Var2 = this.b3;
        if (li0Var2 != null) {
            li0Var2.setCurrentAccount(i3);
        }
    }

    public void setActive(boolean z10) {
        R0(0L, z10);
    }

    public void setDelegate(c4 c4Var) {
        this.A1 = c4Var;
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
                a3.o oVar = this.G3;
                if (z10) {
                    org.telegram.messenger.g0.r(oVar);
                    org.telegram.messenger.g0.i3(oVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(oVar);
                    r9 r9Var = ((i9) this.A1).d;
                    r9Var.m1 = true;
                    r9Var.d0();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.B1 != z10) {
            this.B1 = z10;
            c3 c3Var = this.O0;
            if (z10) {
                c3Var.Q0();
                c3Var.u0 = false;
            } else {
                c3Var.P0(false);
                c3Var.u0 = true;
            }
            this.H0 = 0L;
            this.M0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.l0;
        s2 s2Var = new s2(this, org.telegram.messenger.g0.W(getContext()), this, new q2(1, e6Var));
        this.L1 = s2Var;
        xs editField = s2Var.getEditField();
        editField.getClass();
        rs rsVar = new rs(editField, 0);
        editField.u0 = rsVar;
        rsVar.q(true);
        editField.u0.u(editField.y0);
        editField.u0.w(editField.getPaint().getTextSize());
        rs rsVar2 = new rs(editField, 1);
        editField.v0 = rsVar2;
        rsVar2.b = 5;
        rsVar2.u(editField.y0);
        editField.v0.w(editField.getPaint().getTextSize());
        this.L1.getEditField().setScaleX(0.0f);
        this.L1.setOverrideKeyboardAnimation(true);
        this.L1.setClipChildren(false);
        this.L1.setDelegate(new t2(this));
        setDelegate(this.L1);
        s2 s2Var2 = this.L1;
        s2Var2.z4 = false;
        s2Var2.A4 = true;
        if (this.y1.f) {
            s2Var2.U0(false, false, false);
        } else {
            s2Var2.U0(true, true, false);
        }
        this.L1.updateColors();
        s2 s2Var3 = this.L1;
        s2Var3.B4 = true;
        addView(s2Var3, mf.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.y3 != null) {
            this.L1.Q1(false);
        }
        this.L1.H2 = this.j2;
        i4 i4Var = this.w2;
        ((ArrayList) i4Var.g).add(this.M0);
        ((ArrayList) i4Var.g).add(this);
        if (this.K0) {
            this.L1.D0();
        }
        p0(false);
        if (G0()) {
            this.L1.setVisibility(8);
        }
        mh.h hVar = new mh.h(getContext(), e6Var, this.s3, this.p3);
        this.M1 = hVar;
        hVar.setOnClickListener(new x1(this, 1));
        addView(this.M1, mf.e(57, hs.X4, 85));
        this.M1.setVisibility(8);
        this.L1.setSideButtonsForAttach(this.M1);
        this.s0 = getChildCount();
    }

    public final void u0() {
        if (this.T1 != null) {
            return;
        }
        n8 n8Var = new n8(getContext(), this.l0);
        this.T1 = n8Var;
        n8Var.setOnClickListener(new c2(this, 4));
        this.T1.setAlpha(0.0f);
        this.T1.setVisibility(8);
        addView(this.T1, mf.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        if (this.K1 != null || getContext() == null) {
            return;
        }
        s1 s1Var = new s1(getContext(), this.s3);
        this.K1 = s1Var;
        s1Var.setOnClickListener(new c2(this, 5));
        s1 s1Var2 = this.K1;
        g1 g1Var = g1.X;
        boolean z10 = true;
        s1Var2.b(g1Var != null && g1Var.o(), false);
        s1 s1Var3 = this.K1;
        g1 g1Var2 = g1.X;
        if (g1Var2 != null && !g1Var2.m()) {
            z10 = false;
        }
        s1Var3.a(z10, false);
        addView(this.K1, mf.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void w0() {
        if (this.J1 != null || getContext() == null) {
            return;
        }
        this.I1 = new v1(getContext(), this.m2);
        w1 w1Var = new w1(getContext(), this.I1, this.s3);
        this.J1 = w1Var;
        w1Var.setOnClickListener(new c2(this, 6));
        this.J1.setOnLongClickListener(new z1(this, 1));
        addView(this.J1, mf.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.I1, mf.d(hs.e3, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
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
        this.R1.setText(bd.M0(this.o1 ? 2131744675 : 2131744503, null));
        TextView textView2 = new TextView(getContext());
        this.S1 = textView2;
        textView2.setTextColor(-1);
        this.S1.setTextSize(1, 12.0f);
        TextView textView3 = this.S1;
        int L = org.telegram.messenger.g0.L(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.S1.setGravity(17);
        pf.a(this.S1);
        this.S1.setText(bd.M0(2131744502, null));
        this.S1.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        this.Q1.addView(imageView, mf.t(22, 22, 16, 12, 1, 4, 0));
        this.Q1.addView(this.R1, mf.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.Q1.addView(this.S1, mf.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.L1.addView(this.Q1, mf.d(-1, -1.0f, hs.E1, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.L2 != null) {
            return;
        }
        ec ecVar = new ec(getContext(), 1);
        this.L2 = ecVar;
        ecVar.setTextSize(1, 14.0f);
        this.L2.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.L2.setGravity(19);
        this.L2.setText(bd.M0(2131744501, null));
        addView(this.L2, mf.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.G1 != null) {
            return;
        }
        d3 d3Var = new d3(this, getContext(), 0);
        this.G1 = d3Var;
        d3Var.setClickable(true);
        addView(this.G1, mf.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        e3 e3Var = new e3(this, getContext());
        this.p2 = e3Var;
        e3Var.setOnClickListener(new c2(this, 0));
        this.G1.addView(this.p2, mf.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        v vVar = new v(0, getContext(), false);
        this.l2 = vVar;
        vVar.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        this.G1.addView(this.l2, mf.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.k2 = textView;
        textView.setTextSize(1, 14.0f);
        this.k2.setTextColor(-1);
        this.G1.addView(this.k2, mf.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.h1.s);
        e3 e3Var2 = this.p2;
        int L = org.telegram.messenger.g0.L(15.0f);
        int o10 = i0.a.o(-1, 120);
        e3Var2.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o10, o10));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.O(i0.a.o(-1, 120), -org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f)));
    }
}
