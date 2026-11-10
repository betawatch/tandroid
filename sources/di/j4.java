package di;

import a8.ra;
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
import bi.ab;
import bi.dd;
import bi.md;
import c8.ha;
import c8.ka;
import c8.qa;
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
import org.telegram.messenger.c20;
import org.telegram.messenger.dt;
import org.telegram.messenger.gz;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.g61;
import org.telegram.ui.ir0;
import org.telegram.ui.lx;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class j4 extends st0 implements ls {
    public org.telegram.ui.Components.h6 A0;
    public boolean A1;
    public long A2;
    public final w1 A3;
    public org.telegram.ui.Components.v5 B0;
    public z6 B1;
    public boolean B2;
    public final ArrayList B3;
    public org.telegram.ui.Components.v5 C0;
    public boolean C1;
    public boolean C2;
    public final ArrayList C3;
    public boolean D0;
    public boolean D1;
    public boolean D2;
    public boolean D3;
    public boolean E0;
    public boolean E1;
    public boolean E2;
    public boolean E3;
    public long F0;
    public a3 F1;
    public y20 F2;
    public final ra F3;
    public long G0;
    public a G1;
    public final ir0 G2;
    public final org.telegram.ui.Components.v5 G3;
    public boolean H0;
    public q1 H1;
    public boolean H2;
    public final org.telegram.ui.Components.v5 H3;
    public boolean I0;
    public r1 I1;
    public x2 I2;
    public final org.telegram.ui.Components.v5 I3;
    public boolean J0;
    public n1 J1;
    public FrameLayout J2;
    public float J3;
    public boolean K0;
    public o2 K1;
    public md K2;
    public final Path K3;
    public final j3 L0;
    public lh.h L1;
    public boolean L2;
    public boolean L3;
    public final FrameLayout M0;
    public fi.m3 M1;
    public q2 M2;
    public ValueAnimator M3;
    public final z2 N0;
    public ValueAnimator N1;
    public float N2;
    public float N3;
    public final ImageReceiver O0;
    public ii0 O1;
    public boolean O2;
    public final ImageReceiver P0;
    public LinearLayout P1;
    public boolean P2;
    public final ArrayList Q0;
    public TextView Q1;
    public boolean Q2;
    public Runnable R0;
    public TextView R1;
    public boolean R2;
    public final f3 S0;
    public o8 S1;
    public boolean S2;
    public final lx T0;
    public ViewPropertyAnimator T1;
    public boolean T2;
    public o4 U0;
    public final fh.g U1;
    public final ImageReceiver U2;
    public float V0;
    public final fh.g V1;
    public ch.d V2;
    public final org.telegram.ui.Components.v8 W0;
    public final Paint W1;
    public final ImageReceiver W2;
    public final f4 X0;
    public int X1;
    public org.telegram.ui.Components.h5 X2;
    public final p8 Y0;
    public ValueAnimator Y1;
    public boolean Y2;
    public m6.n Z0;
    public float Z1;
    public boolean Z2;
    public int a1;
    public float a2;
    public ii0 a3;
    public org.telegram.ui.ActionBar.z0 b1;
    public float b2;
    public boolean b3;
    public a4 c1;
    public int c2;
    public float c3;
    public TL_stories.PeerStories d1;
    public boolean d2;
    public boolean d3;
    public final ArrayList e1;
    public boolean e2;
    public float e3;
    public final ImageView f0;
    public final ArrayList f1;
    public boolean f2;
    public int f3;
    public final ImageView g0;
    public final g4 g1;
    public boolean g2;
    public int g3;
    public final b4 h0;
    public final bg.r0 h1;
    public int h2;
    public int h3;
    public final ch0 i0;
    public ArrayList i1;
    public final int i2;
    public w1 i3;
    public final ImageView j0;
    public int j1;
    public TextView j2;
    public float j3;
    public final org.telegram.ui.ActionBar.h6 k0;
    public long k1;
    public u k2;
    public boolean k3;
    public final v8 l0;
    public boolean l1;
    public int l2;
    public h6.m l3;
    public final a3 m0;
    public boolean m1;
    public int m2;
    public org.telegram.ui.ActionBar.z0 m3;
    public e7 n0;
    public boolean n1;
    public boolean n2;
    public org.telegram.ui.ActionBar.z0 n3;
    public fi.m3 o0;
    public boolean o1;
    public b3 o2;
    public final dh.c o3;
    public fi.m3 p0;
    public boolean p1;
    public boolean p2;
    public final ri.a p3;
    public fi.m3 q0;
    public long q1;
    public float q2;
    public final ri.f q3;
    public int r0;
    public final float r1;
    public u2 r2;
    public final gh.b r3;
    public final q9 s0;
    public int s1;
    public o40 s2;
    public TL_stories.TL_premium_boostsStatus s3;
    public final n3 t0;
    public boolean t1;
    public int t2;
    public org.telegram.messenger.e3 t3;
    public final g2 u0;
    public int u1;
    public boolean u2;
    public long u3;
    public final View v0;
    public int v1;
    public final i4 v2;
    public long v3;
    public final ImageView w0;
    public int w1;
    public final h2.f w2;
    public boolean w3;
    public final LinearLayout x0;
    public final h4 x1;
    public final org.telegram.ui.Components.v5 x2;
    public TLRPC.TL_channels_sendAsPeers x3;
    public final a3 y0;
    public final a8.b8 y1;
    public final org.telegram.ui.Components.v5 y2;
    public final w1 y3;
    public org.telegram.ui.Components.h6 z0;
    public c4 z1;
    public float z2;
    public int z3;

    public j4(Context context, final q9 q9Var, g4 g4Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null);
        this.K0 = true;
        this.Q0 = new ArrayList();
        this.a1 = -5;
        this.r1 = 1.0f;
        h4 h4Var = new h4(this);
        this.x1 = h4Var;
        this.Z1 = -1.0f;
        this.a2 = -1.0f;
        this.b2 = -1.0f;
        this.i2 = ConnectionsManager.generateClassGuid();
        this.x2 = new org.telegram.ui.Components.v5(this);
        this.y2 = new org.telegram.ui.Components.v5(this);
        ir0 ir0Var = new ir0();
        this.G2 = ir0Var;
        this.N2 = 1.0f;
        this.y3 = new w1(this, 4);
        this.A3 = new w1(this, 11);
        this.B3 = new ArrayList();
        this.C3 = new ArrayList();
        this.F3 = new ra(this, 20);
        this.G3 = new org.telegram.ui.Components.v5(this);
        this.H3 = new org.telegram.ui.Components.v5(this);
        this.I3 = new org.telegram.ui.Components.v5(this);
        this.K3 = new Path();
        ir0Var.E = new cb.c(this, 19);
        i4 i4Var = new i4();
        i4Var.g = new ArrayList();
        this.v2 = i4Var;
        this.w2 = new h2.f((int[]) null);
        this.e1 = new ArrayList();
        this.f1 = new ArrayList();
        final int i7 = 0;
        z2 z2Var = new z2(this, i7);
        this.N0 = z2Var;
        z2Var.A0 = false;
        z2Var.z1 = true;
        z2Var.y = true;
        z2Var.h0(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U2 = imageReceiver;
        imageReceiver.z1 = true;
        imageReceiver.y = true;
        imageReceiver.h0(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.W2 = imageReceiver2;
        imageReceiver2.z1 = true;
        imageReceiver2.y = true;
        imageReceiver2.h0(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.O0 = imageReceiver3;
        imageReceiver3.z1 = true;
        imageReceiver3.y = true;
        imageReceiver3.h0(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.P0 = imageReceiver4;
        imageReceiver4.z1 = true;
        imageReceiver4.y = true;
        imageReceiver4.h0(0);
        z2Var.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.W0 = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.s0 = q9Var;
        this.g1 = g4Var;
        this.y1 = g4Var.g;
        this.B1 = qp.s1(p10.s0).P1();
        g4Var.l.setColor(-16777216);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.k0 = h6Var;
        setClipChildren(false);
        f3 f3Var = new f3(this, context, this.L0, h6Var, q9Var);
        this.S0 = f3Var;
        gh.b bVar = new gh.b(h6Var, org.telegram.ui.ActionBar.m6.Ge, 0.8f);
        this.r3 = bVar;
        ri.c cVar = new ri.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !iz.e()) {
            this.q3 = null;
            this.p3 = cVar;
        } else {
            ri.f fVar = new ri.f(cVar);
            this.q3 = fVar;
            fVar.l(org.telegram.messenger.g0.L(8.0f));
            this.p3 = fVar;
        }
        jh.k kVar = new jh.k(this);
        ri.a aVar = this.p3;
        dh.c cVar2 = new dh.c(aVar, aVar, aVar);
        cVar2.h = kVar;
        cVar2.i = this;
        this.o3 = cVar2;
        this.U1 = cVar2.c(this, bVar, false);
        fh.g c10 = cVar2.c(this, bVar, false);
        this.V1 = c10;
        c10.u(org.telegram.messenger.g0.L(32.0f));
        j3 j3Var = new j3(this, context, g4Var, q9Var);
        this.L0 = j3Var;
        j3Var.setClipChildren(false);
        this.T0 = new lx(this.l2, j3Var);
        j3Var.addView(f3Var, ha.c(-1.0f, -1));
        n3 n3Var = new n3(this, getContext(), q9Var.D, q9Var, h6Var);
        this.t0 = n3Var;
        n3Var.b0.setOnClickListener(new y1(this, 10));
        ImageView imageView = new ImageView(context);
        this.w0 = imageView;
        imageView.setImageDrawable(g4Var.m);
        int L = org.telegram.messenger.g0.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new y1(this, 11));
        imageView.setContentDescription(id.M0(2131745459, null));
        ka.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(g4Var.n);
        imageView2.setPadding(L, L, L, L);
        a3 a3Var = new a3(this, getContext(), 1);
        this.y0 = a3Var;
        org.telegram.ui.Components.h6 h6Var2 = this.A0;
        if (h6Var2 != null) {
            h6Var2.setCallback(a3Var);
        }
        a3Var.setWillNotDraw(false);
        a3Var.setOnClickListener(new y1(this, 12));
        a3 a3Var2 = new a3(this, getContext(), 2);
        this.m0 = a3Var2;
        org.telegram.ui.Components.h6 h6Var3 = this.z0;
        if (h6Var3 != null) {
            h6Var3.setCallback(a3Var2);
        }
        a3Var2.setWillNotDraw(false);
        a3Var2.setOnClickListener(new y1(this, 13));
        a3Var2.setOnLongClickListener(new f2(i7, this, q9Var));
        e7 e7Var = new e7(context, g4Var);
        this.n0 = e7Var;
        e7Var.setPadding(L, L, L, L);
        a3Var2.addView(this.n0, ha.e(40, 40, 3));
        a3Var.addView(imageView2, ha.e(40, 40, 3));
        ka.b(a3Var2, 0.3f, 5.0f);
        ka.b(a3Var, 0.3f, 5.0f);
        z2Var.z1 = true;
        z2Var.H0(j3Var);
        bg.r0 r0Var = new bg.r0(10);
        this.h1 = r0Var;
        j3Var.setOutlineProvider(r0Var);
        j3Var.setClipToOutline(true);
        addView(j3Var);
        f4 f4Var = new f4(context, h4Var);
        this.X0 = f4Var;
        f4Var.setOnClickListener(new View.OnClickListener(this) { // from class: di.t1
            public final /* synthetic */ j4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i7;
                q9 q9Var2 = q9Var;
                j4 j4Var = this.b;
                switch (i10) {
                    case 0:
                        long j3 = p10.i(j4Var.l2).n;
                        long j10 = j4Var.k1;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                q9Var2.N(cn.ta(j10));
                                break;
                            } else {
                                q9Var2.N(ProfileActivity.D4(j10));
                                break;
                            }
                        } else {
                            Bundle f10 = rf.b.f(1, TeXSymbolParser.TYPE_ATTR);
                            f10.putLong("dialog_id", j4Var.k1);
                            q9Var2.N(new v80(f10, null));
                            break;
                        }
                    default:
                        if (!j4Var.x1.j()) {
                            j4Var.a1(true);
                            break;
                        } else {
                            q9Var2.U();
                            if (!q9.C1) {
                                qp.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            j4Var.h0.setContentDescription(id.M0(!q9.C1 ? 2131748314 : 2131743849, null));
                            break;
                        }
                }
            }
        });
        j3Var.addView(f4Var, ha.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.M0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.x0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, ha.r(40, 40, 5));
        linearLayout.addView(a3Var, ha.r(40, 40, 5));
        linearLayout.addView(a3Var2, ha.r(40, 40, 5));
        addView(linearLayout, ha.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f0 = imageView3;
        imageView3.setImageDrawable(g4Var.q);
        imageView3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.m6.h0(-1, 1, -1));
        imageView3.setContentDescription(id.M0(2131754839, null));
        j3Var.addView(imageView3, ha.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.g0 = imageView4;
        imageView4.setImageDrawable(g4Var.r);
        imageView4.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.m6.h0(-1, 1, -1));
        imageView4.setContentDescription(id.M0(2131754808, null));
        j3Var.addView(imageView4, ha.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.d(q9Var, 15));
        imageView3.setOnClickListener(new d0(this, h6Var, q9Var, context, g4Var, 1));
        b4 b4Var = new b4(context, 0);
        this.h0 = b4Var;
        j3Var.addView(b4Var, ha.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ch0 ch0Var = new ch0(context);
        this.i0 = ch0Var;
        ch0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        b4Var.addView(ch0Var);
        ImageView imageView5 = new ImageView(context);
        this.j0 = imageView5;
        imageView5.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        imageView5.setImageDrawable(g4Var.t);
        b4Var.addView(imageView5);
        imageView5.setVisibility(8);
        v8 v8Var = new v8(context);
        this.l0 = v8Var;
        v8Var.setOnClickListener(new y1(this, 2));
        j3Var.addView(v8Var, ha.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i10 = 1;
        b4Var.setOnClickListener(new View.OnClickListener(this) { // from class: di.t1
            public final /* synthetic */ j4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i10;
                q9 q9Var2 = q9Var;
                j4 j4Var = this.b;
                switch (i102) {
                    case 0:
                        long j3 = p10.i(j4Var.l2).n;
                        long j10 = j4Var.k1;
                        if (j3 != j10) {
                            if (j10 <= 0) {
                                q9Var2.N(cn.ta(j10));
                                break;
                            } else {
                                q9Var2.N(ProfileActivity.D4(j10));
                                break;
                            }
                        } else {
                            Bundle f10 = rf.b.f(1, TeXSymbolParser.TYPE_ATTR);
                            f10.putLong("dialog_id", j4Var.k1);
                            q9Var2.N(new v80(f10, null));
                            break;
                        }
                    default:
                        if (!j4Var.x1.j()) {
                            j4Var.a1(true);
                            break;
                        } else {
                            q9Var2.U();
                            if (!q9.C1) {
                                qp.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            j4Var.h0.setContentDescription(id.M0(!q9.C1 ? 2131748314 : 2131743849, null));
                            break;
                        }
                }
            }
        });
        this.Y0 = new p8(this, g4Var);
        j3Var.addView(n3Var, ha.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        g2 g2Var = new g2(this, context, q9Var, q9Var.w, view, frameLayout, q9Var);
        this.u0 = g2Var;
        j3Var.addView(view, ha.e(-1, qs.e3, 87));
        j3Var.addView(g2Var, ha.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        j3Var.addView(frameLayout, ha.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        b4Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, o4, o4));
        int L3 = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, o10, o10));
        int L4 = org.telegram.messenger.g0.L(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.m6.k0(L4, L4, L4, L4, 0, o11, o11));
        int L5 = org.telegram.messenger.g0.L(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.k0(L5, L5, L5, L5, 0, o12, o12));
        int L6 = org.telegram.messenger.g0.L(20.0f);
        int o13 = i0.a.o(-1, 100);
        a3Var2.setBackground(org.telegram.ui.ActionBar.m6.k0(L6, L6, L6, L6, 0, o13, o13));
        int L7 = org.telegram.messenger.g0.L(20.0f);
        int o14 = i0.a.o(-1, 100);
        a3Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L7, L7, L7, L7, 0, o14, o14));
        org.telegram.ui.Cells.s9 s9Var = n3Var.W;
        View n10 = s9Var.n(context);
        if (n10 != null) {
            org.telegram.messenger.g0.E2(n10);
            addView(n10);
        }
        s9Var.D = new h2(this, 0);
        s9Var.S(this);
    }

    public static void T0(y6 y6Var, ImageReceiver imageReceiver, String str) {
        if (y6Var.s) {
            imageReceiver.u0(null, null, hc.g(y6Var.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.r0(hc.g(y6Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(j4 j4Var, ValueAnimator valueAnimator) {
        v8 v8Var = j4Var.l0;
        j4Var.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f4 f4Var = j4Var.X0;
        f4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.N3);
        f4Var.setAlpha(1.0f - j4Var.N3);
        ImageView imageView = j4Var.f0;
        imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.N3);
        imageView.setAlpha(1.0f - j4Var.N3);
        ImageView imageView2 = j4Var.g0;
        imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.N3);
        imageView2.setAlpha(1.0f - j4Var.N3);
        b4 b4Var = j4Var.h0;
        b4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.N3);
        b4Var.setAlpha((1.0f - j4Var.N3) * j4Var.N2);
        a3 a3Var = j4Var.F1;
        if (a3Var != null) {
            a3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * j4Var.N3);
            j4Var.F1.setAlpha(1.0f - j4Var.N3);
        }
        if (v8Var != null) {
            v8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var.N3);
            v8Var.setAlpha(1.0f - j4Var.N3);
        }
        j4Var.t0.setAlpha(1.0f - j4Var.N3);
        c4 c4Var = j4Var.z1;
        float f10 = c4Var == null ? 0.0f : ((h9) c4Var).d.V;
        float hideInterfaceAlpha = j4Var.getHideInterfaceAlpha();
        a3 a3Var2 = j4Var.m0;
        if (a3Var2 != null) {
            a3Var2.setAlpha((1.0f - j4Var.N3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = j4Var.w0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - j4Var.N3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        a3 a3Var3 = j4Var.y0;
        if (a3Var3 != null) {
            a3Var3.setAlpha((1.0f - j4Var.N3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        o2 o2Var = j4Var.K1;
        if (o2Var != null) {
            o2Var.setAlpha(1.0f - j4Var.N3);
            j4Var.invalidate();
        }
        j4Var.L0.invalidate();
    }

    public static void Y(j4 j4Var, boolean z9) {
        org.telegram.ui.ActionBar.z0 z0Var = j4Var.m3;
        if (z0Var == null || j4Var.l3 == null || z0Var.getVisibility() != 0) {
            return;
        }
        if (z9) {
            if (Math.abs(q9.A1 - 0.2f) < 0.05f) {
                j4Var.m3.setSubtext(id.M0(2131743574, null));
            } else if (Math.abs(q9.A1 - 0.5f) < 0.05f) {
                j4Var.m3.setSubtext(id.M0(2131743576, null));
            } else if (Math.abs(q9.A1 - 1.0f) < 0.05f) {
                j4Var.m3.setSubtext(id.M0(2131743577, null));
            } else if (Math.abs(q9.A1 - 1.5f) < 0.05f) {
                j4Var.m3.setSubtext(id.M0(2131743578, null));
            } else if (Math.abs(q9.A1 - 2.0f) < 0.05f) {
                j4Var.m3.setSubtext(id.M0(2131743575, null));
            } else {
                j4Var.m3.setSubtext(id.a0(null, null, 2131743579, eu0.a(q9.A1) + "x"));
            }
        }
        j4Var.l3.H(z9, q9.A1);
    }

    public static void Z(j4 j4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (j4Var.G0() || j4Var.x1.f) {
            return;
        }
        if (p10.i(j4Var.l2).q()) {
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, id.M0(2131744887, null), false, j4Var.k0).setOnClickListener(new y1(j4Var, 8));
            return;
        }
        Drawable drawable = j4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        i2 i2Var = new i2(j4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, id.M0(2131744887, null), false, j4Var.k0);
        c10.setOnClickListener(new y1(j4Var, 9));
        c10.setIcon(i2Var);
    }

    public static void b0(j4 j4Var) {
        h4 h4Var = j4Var.x1;
        TL_stories.StoryItem storyItem = h4Var.a;
        if ((storyItem == null && h4Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = h4Var.h();
        boolean z9 = h4Var.e;
        if (h == null || !h.exists()) {
            j4Var.Y0();
            return;
        }
        MediaController.d0(h.toString(), j4Var.getContext(), z9 ? 1 : 0, null, null, new bi.b9(1, j4Var, z9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c0(j4 j4Var, long j3) {
        String str;
        boolean z9;
        TLRPC.Chat chat;
        if (j3 > 0) {
            TLRPC.User a22 = qp.s1(j4Var.l2).a2(Long.valueOf(j3));
            str = a22.first_name;
            z9 = a22.stories_hidden;
            chat = a22;
        } else {
            TLRPC.Chat M0 = qp.s1(j4Var.l2).M0(Long.valueOf(-j3));
            str = M0.title;
            z9 = M0.stories_hidden;
            chat = M0;
        }
        org.telegram.messenger.g0.i3(new bi.o(j4Var, qp.s1(j4Var.l2), j3, !z9, str, chat), 200L);
    }

    public static void d0(j4 j4Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, j4Var.getContext(), j4Var.k0);
        String M0 = id.M0(j4Var.G0() ? 2131751564 : 2131751487, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = id.M0(j4Var.G0() ? 2131751565 : 2131751488, null);
        int i7 = 2;
        alertDialog$Builder.k(id.M0(2131751598, null), new s1(j4Var, i7));
        alertDialog$Builder.h(id.M0(2131752589, null), new a1(i7));
        ((h9) j4Var.z1).h(u1Var);
        u1Var.i();
    }

    public static void f0(j4 j4Var) {
        org.telegram.ui.ActionBar.h6 h6Var = j4Var.k0;
        j3 j3Var = j4Var.L0;
        if (j4Var.p1) {
            return;
        }
        int i7 = 0;
        int i10 = 1;
        if (!j4Var.n1) {
            o2 o2Var = j4Var.K1;
            int i11 = -j4Var.a1;
            j4Var.a1 = i11;
            org.telegram.messenger.g0.G3(i11, o2Var, null);
            org.telegram.messenger.p2.D.a();
            String p10 = j4Var.k1 >= 0 ? t10.p(qp.s1(j4Var.l2).a2(Long.valueOf(j4Var.k1))) : "";
            (qp.s1(j4Var.l2).D3() ? new gc(j3Var, h6Var).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(id.a0(null, null, 2131743758, p10))) : new gc(j3Var, h6Var).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(id.a0(null, null, 2131743758, p10)), id.M0(2131743759, null), new w1(j4Var, 5))).j();
            return;
        }
        if (j4Var.s3 != null && j4Var.t3 != null) {
            ug.i0.w1(new bi.w4(j4Var, i10), j4Var.s3, j4Var.t3, j4Var.k1, true);
            return;
        }
        q9 q9Var = j4Var.s0;
        if (q9Var != null) {
            q9Var.j1 = true;
            q9Var.V();
        }
        qp.s1(j4Var.l2).G0().a(j4Var.k1, new z1(j4Var, i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f10 = 1.0f - this.x2.c;
        t5 t5Var = this.s0.x;
        return (1.0f - (t5Var == null ? 0.0f : t5Var.f)) * f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        q9 q9Var;
        if (!this.x1.f || (q9Var = this.s0) == null || q9Var.A0 == null || B0(true)) {
            return 0L;
        }
        return q9Var.A0.j();
    }

    public static void h0(j4 j4Var) {
        h4 h4Var = j4Var.x1;
        if (h4Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = h4Var.a.id;
        tL_stories_exportStoryLink.peer = qp.s1(j4Var.l2).j1(j4Var.k1);
        ConnectionsManager.getInstance(j4Var.l2).sendRequest(tL_stories_exportStoryLink, new y2());
    }

    public final void A0() {
        if (this.J2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(id.M0(2131744453, null));
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.k0;
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        TextView textView2 = new TextView(getContext());
        ka.a(textView2);
        textView2.setText(id.M0(2131754230, null));
        int i10 = org.telegram.ui.ActionBar.m6.Gi;
        org.telegram.ui.ActionBar.t6.U(textView2, i10, h6Var);
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 15.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.m6.Ci;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 30);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, o4, o4);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i10, 30);
        textView2.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView2, k02, M, g10, h6Var);
        textView2.setOnClickListener(new y1(this, 3));
        linearLayout.addView(textView, ha.o(-1, -2));
        linearLayout.addView(textView2, ha.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, ha.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.L0.addView(frameLayout);
        this.J2 = frameLayout;
    }

    public final boolean B0(boolean z9) {
        g1 g1Var;
        TLRPC.Peer i7;
        g1 g1Var2;
        long e10 = p10.i(this.l2).e();
        long j3 = this.k1;
        q9 q9Var = this.s0;
        if (j3 >= 0 || (g1Var2 = q9Var.A0) == null) {
            if (j3 < 0 || q9Var == null || (g1Var = q9Var.A0) == null || !g1Var.l()) {
                return false;
            }
            return !z9 || (i7 = q9Var.A0.i()) == null || this.k1 == org.telegram.messenger.m5.o(i7) || org.telegram.messenger.m5.o(i7) == e10 || this.k1 == e10;
        }
        if (!z9) {
            return false;
        }
        TLRPC.Peer i10 = g1Var2.i();
        TLRPC.Chat M0 = qp.s1(this.l2).M0(Long.valueOf(-this.k1));
        if (q9Var.A0.l() || org.telegram.messenger.t3.w(14, M0)) {
            return i10 == null || this.k1 == org.telegram.messenger.m5.o(i10) || org.telegram.messenger.m5.o(i10) == p10.i(this.l2).e();
        }
        return false;
    }

    public final void C0(Canvas canvas, int i7, int i10) {
        TextureView textureView;
        i4 i4Var = this.v2;
        org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) i4Var.e;
        if (j4Var != null && ((SurfaceView) i4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                org.telegram.messenger.g0.z0((SurfaceView) i4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (j4Var != null && (textureView = (TextureView) i4Var.f) != null) {
            Bitmap bitmap = textureView.getBitmap(i7, i10);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        j3 j3Var = this.L0;
        canvas.scale(i7 / j3Var.getMeasuredWidth(), i10 / j3Var.getMeasuredHeight());
        this.N0.h(canvas, null);
        canvas.restore();
    }

    public final void D0(fi.q8 q8Var, TL_stories.StoryItem storyItem) {
        c4 c4Var = this.z1;
        fi.s8 s8Var = new fi.s8(storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, getContext(), this.k0);
        s8Var.W0(q8Var);
        fi.g1 g1Var = s8Var.l1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof fi.n8) {
                    ((fi.n8) view).f(false);
                }
            }
        }
        s8Var.Q0(true);
        s8Var.N1 = new ab.g(11, this, storyItem);
        ((h9) c4Var).h(s8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r3 == r10.O1) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(ViewGroup viewGroup, float f10, float f11, boolean z9) {
        fi.m3 m3Var;
        i4 i4Var;
        org.telegram.ui.j4 j4Var;
        if (viewGroup != null) {
            fi.m3 m3Var2 = this.o0;
            if ((m3Var2 == null || !m3Var2.V) && ((m3Var = this.p0) == null || !m3Var.V)) {
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        n3 n3Var = this.t0;
                        if (childAt == n3Var) {
                            Rect rect = org.telegram.messenger.g0.Q;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f10, (int) f11)) {
                                float top = f11 - childAt.getTop();
                                h8 h8Var = n3Var.b0;
                                if (h8Var.x == 1.0f && !n3Var.s0) {
                                    if (top > h8Var.getTranslationY() + (n3Var.r0.getTop() - n3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.L0 || (i4Var = this.v2) == null || (j4Var = (org.telegram.ui.j4) i4Var.e) == null || !E0(j4Var, f10 - childAt.getX(), f11 - childAt.getY(), z9)) && (!childAt.isClickable() || !rect2.contains((int) f10, (int) f11))) {
                            f3 f3Var = this.S0;
                            if (childAt == f3Var && f3Var.b == null && (f10 < org.telegram.messenger.g0.L(60.0f) || f10 > viewGroup.getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f))) {
                                Matrix matrix = f3Var.e;
                                float[] fArr = f3Var.f;
                                for (int i10 = 0; i10 < f3Var.getChildCount(); i10++) {
                                    View childAt2 = f3Var.getChildAt(i10);
                                    if (childAt2 != f3Var.d && (childAt2 instanceof x8)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f10;
                                        fArr[1] = f11;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                g2 g2Var = this.u0;
                                if (childAt == g2Var) {
                                    g61 g61Var = g2Var.f;
                                    bi.q1 q1Var = g2Var.c;
                                    g61 g61Var2 = g2Var.f;
                                    g61Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f10 - g2Var.getX()) - g61Var2.getX()), (int) ((f11 - g2Var.getY()) - g61Var2.getY()))) {
                                        if (g2Var.f0) {
                                            continue;
                                        } else if (!this.e2) {
                                            if (f11 <= g2Var.s() + g2Var.getY() && q1Var.E(f10, (f11 - g2Var.getY()) - q1Var.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.e2) {
                                        if (childAt == this.K1 && f11 > rect2.top) {
                                        }
                                    }
                                    if (!z9) {
                                        if (rect2.contains((int) f10, (int) f11)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            o2 o2Var = this.K1;
                                            if (o2Var != null && childAt == o2Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && E0((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), z9)) {
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
        j3 j3Var = this.L0;
        float x11 = view.getX() + j3Var.getX() + x10;
        float y10 = view.getY() + j3Var.getY() + getY();
        return motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + ((float) view.getWidth()) && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + ((float) view.getHeight());
    }

    public final boolean G0() {
        r6 r6Var;
        q9 q9Var = this.s0;
        return (q9Var == null || (r6Var = q9Var.N0) == null || r6Var.e != 4) ? false : true;
    }

    public final boolean H0() {
        TLRPC.User a22;
        return G0() && (a22 = qp.s1(this.l2).a2(Long.valueOf(this.s0.N0.d))) != null && a22.bot && a22.bot_can_edit;
    }

    public abstract boolean I0();

    public final void J0(ch.o0 o0Var) {
        boolean z9;
        TLRPC.Reaction reaction;
        h4 h4Var = this.x1;
        TL_stories.StoryItem storyItem = h4Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z10 = reaction2 != null;
        if (reaction2 != null && o0Var == null) {
            j0();
            this.B1.j0(this.k1, h4Var.a, null);
        } else if (o0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.l2).r.get("❤");
            if (tL_availableReaction != null) {
                this.Y2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a10 = ch.k0.a();
                hc b10 = hc.b(document);
                ImageReceiver imageReceiver = this.U2;
                imageReceiver.q0(b10, a10, null, null, null, 0);
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                this.Z2 = true;
                this.B1.j0(this.k1, h4Var.a, ch.o0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.B1.j0(this.k1, h4Var.a, o0Var);
        }
        TL_stories.StoryItem storyItem2 = h4Var.a;
        a3 a3Var = this.m0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.n0.setReaction(null);
            a3Var.setContentDescription(id.M0(2131754851, null));
            z9 = false;
        } else {
            z10 = !z10;
            this.n0.setReaction(ch.o0.d(reaction));
            a3Var.setContentDescription(id.M0(2131754850, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z9 = true;
        }
        if (this.m1 && z10) {
            TL_stories.StoryItem storyItem3 = h4Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = h4Var.a.views;
            int i7 = storyViews.reactions_count + (z9 ? 1 : -1);
            storyViews.reactions_count = i7;
            if (i7 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = h4Var.a;
        ch.q0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        g1 g1Var;
        if (this.x3 != null) {
            return;
        }
        q9 q9Var = this.s0;
        if (q9Var != null && (g1Var = q9Var.A0) != null) {
            if (g1Var.w == null ? false : !r1.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers M1 = qp.s1(this.l2).M1(this.k1, true);
        this.x3 = M1;
        o2 o2Var = this.K1;
        if (o2Var == null || M1 == null) {
            return;
        }
        o2Var.R1(true);
    }

    public final boolean L0() {
        o2 o2Var = this.K1;
        if (o2Var == null) {
            return false;
        }
        boolean z9 = o2Var.z2;
        if (z9) {
            o2Var.s1();
        }
        org.telegram.messenger.g0.i3(new w1(this, 3), 300L);
        return z9;
    }

    public final void M0() {
        CharSequence charSequence;
        long j3;
        z1 z1Var;
        int i7;
        long j10;
        qp.e1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.K1.getTextWithEntities();
        long e10 = p10.i(this.l2).e();
        TLRPC.Peer i10 = this.s0.A0.i();
        if (i10 != null) {
            e10 = org.telegram.messenger.m5.o(i10);
        }
        Context context = getContext();
        int i11 = this.l2;
        String s5 = org.telegram.messenger.m5.s(i11, this.k1);
        long messageMinPrice = getMessageMinPrice();
        long j11 = this.u3;
        z1 z1Var2 = new z1(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, (org.telegram.ui.ActionBar.h6) bVar, false);
        w2Var.N();
        w2Var.v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        w2Var.N = f10;
        int[] iArr = qp.s1(i11).X6;
        CharSequence j02 = ij.j0(textWithEntities, false, false, new TextPaint());
        if (j02 instanceof Spannable) {
            Spannable spannable = (Spannable) j02;
            charSequence = j02;
            j3 = j11;
            z1Var = z1Var2;
            i7 = ((org.telegram.ui.Components.q5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.q5.class)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(0, charSequence.length(), org.telegram.messenger.f6.class)).length;
        } else {
            charSequence = j02;
            j3 = j11;
            z1Var = z1Var2;
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
        fi.d dVar = new fi.d(context, null, true);
        s0 s0Var = new s0();
        s0Var.c = e10;
        s0Var.f = textWithEntities;
        s0Var.g = jArr[0];
        n0 n0Var = new n0(i11, context, true);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        bi.e5 e5Var = new bi.e5(context, id.M0(2131748814, null), bVar);
        f11.addView(e5Var, ha.q(-1, -1, 1.0f, qs.x1, 0, 0, 5, 0));
        bi.e5 e5Var2 = new bi.e5(context, id.M0(2131748815, null), bVar);
        f11.addView(e5Var2, ha.q(-1, -1, 1.0f, qs.x1, 5, 0, 5, 0));
        bi.e5 e5Var3 = new bi.e5(context, id.M0(2131748816, null), bVar);
        f11.addView(e5Var3, ha.q(-1, -1, 1.0f, qs.x1, 5, 0, 0, 0));
        s sVar = new s(context, bVar, r1);
        z1 z1Var3 = z1Var;
        long j12 = j10;
        c20[] c20VarArr = {new r(jArr, dVar, new wp[1], s0Var, n0Var, i11, e5Var, e5Var2, e5Var3, sVar, new boolean[]{true})};
        n0Var.set(s0Var);
        int i15 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i16 = qp.s1(i11).Y6;
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
        if (arrayList.isEmpty() || ((Integer) jg.g.i(1, arrayList)).intValue() < i16) {
            arrayList.add(Integer.valueOf(i16));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            iArr4[i19] = ((Integer) arrayList.get(i19)).intValue();
        }
        sVar.e0 = iArr4;
        sVar.setValue((int) jArr[0]);
        f10.addView(sVar, ha.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        c20VarArr[0].a(Integer.valueOf((int) jArr[0]));
        f10.addView(f11, ha.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.m6.j5;
        TextView b10 = qa.b(context, 20.0f, i20, true, bVar);
        org.telegram.messenger.k5.m(b10, 17, null, 2131748811);
        f10.addView(b10, ha.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = qa.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        org.telegram.messenger.k5.r(null, null, 2131748812, new Object[]{s5}, b11);
        f10.addView(b11, ha.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        f10.addView(n0Var, ha.t(-2, -2, 17, 42, 22, 42, 20));
        f10.addView(dVar, ha.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        w2Var.show();
        dVar.setOnClickListener(new ah.g(z1Var3, jArr, w2Var, 4));
    }

    public final void N0() {
        if (this.K1 == null) {
            return;
        }
        r0();
        this.r2.d2.i0();
        this.r2.y1(-1, true);
        u2 u2Var = this.r2;
        u2Var.T1 = this.k1;
        u2Var.e1();
        this.r2.a1().setText(this.K1.getFieldText());
        ((h9) this.z1).h(this.r2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j3 = this.k1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog S0 = qp.s1(this.l2).S0(this.k1);
        if (S0 != null) {
            bundle.putInt("message_id", S0.top_message);
        }
        this.s0.N(new cn(bundle));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r6.A0.O == r6.D0.getSink()) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(long j3) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        g1 g1Var;
        ti.o oVar;
        ti.o oVar2;
        if (!this.t1) {
            this.v2.e = null;
            return;
        }
        h4 h4Var = this.x1;
        if (!h4Var.f) {
            if (!h4Var.e) {
                org.telegram.messenger.a8.b("PeerStoriesView.requestVideoPlayer(" + j3 + "): null, not a video");
                ((h9) this.z1).c(null, null, 0L, this.v2);
                i4 i4Var = this.v2;
                i4Var.e = null;
                i4Var.a = false;
                return;
            }
            if (h4Var.f() == null || !new File(this.x1.f()).exists()) {
                TL_stories.StoryItem storyItem = this.x1.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.k1;
                    try {
                        document2 = z6.C(this.l2, storyItem);
                        try {
                            TL_stories.StoryItem storyItem2 = this.x1.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = org.telegram.messenger.w7.G(this.l2).F(this.x1.a);
                            }
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(this.l2);
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
                            sb2.append(this.x1.a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(org.telegram.messenger.w7.B(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.f(bArr));
                            sb2.append("&sid=");
                            sb2.append(this.x1.a.id);
                            sb2.append("&did=");
                            sb2.append(this.x1.a.dialogId);
                            Uri parse = Uri.parse("tg://" + org.telegram.messenger.w7.r(null, document2) + sb2.toString());
                            org.telegram.messenger.a8.b("StoryViewer requestVideoPlayer(" + j3 + "): playing from " + parse);
                            this.A2 = (long) (ij.H0(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((h9) this.z1).c(document, uri, j3, this.v2);
                            this.L0.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(this.x1.f()));
                org.telegram.messenger.a8.b("StoryViewer requestVideoPlayer(" + j3 + "): playing from attachPath " + fromFile);
                this.A2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                org.telegram.messenger.a8.b("PeerStoriesView.requestVideoPlayer(" + j3 + "): playing from null?");
            }
            ((h9) this.z1).c(document, uri, j3, this.v2);
            this.L0.invalidate();
            return;
        }
        c4 c4Var = this.z1;
        TL_stories.StoryItem storyItem3 = h4Var.a;
        long j10 = this.k1;
        int i7 = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z9 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        i4 i4Var2 = this.v2;
        h9 h9Var = (h9) c4Var;
        h9Var.i(true, true);
        g1 g1Var2 = h9Var.d.A0;
        if (g1Var2 == null || g1Var2.b != j10 || !g1Var2.f(inputGroupCall)) {
            fi.s3 s3Var = h9Var.d.D0;
            if (s3Var != null) {
                s3Var.b(j10, null);
                fi.s3 s3Var2 = h9Var.d.D0;
                SurfaceViewRenderer surfaceViewRenderer = s3Var2.c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = s3Var2.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                s3Var2.r = false;
                s3Var2.c(false, false);
            }
            i1 i1Var = i1.w;
            if (i1Var == null || i1Var.b == null || (oVar2 = i1Var.a) == null || !oVar2.e() || !i1Var.b.f(inputGroupCall)) {
                g1Var = null;
            } else {
                g1Var = i1Var.b;
                if (i1Var.a != null) {
                    org.telegram.ui.Components.voip.q0 q0Var = i1Var.e;
                    i1Var.e = null;
                    i1Var.d.a = null;
                    i1Var.a.a(new ai.i(q0Var, 11));
                }
            }
            g1 g1Var3 = h9Var.d.A0;
            if (g1Var3 != null && g1Var3 != g1Var) {
                if (g1Var3.n || i1.a(g1Var3)) {
                    if (g1Var == null) {
                        q9 q9Var = h9Var.d;
                    }
                    h9Var.d.A0.s(null);
                } else {
                    h9Var.d.A0.e();
                }
                h9Var.d.A0 = null;
            }
            if (g1Var != null) {
                h9Var.d.A0 = g1Var;
            }
            i1 i1Var2 = i1.w;
            if (i1Var2 != null && (oVar = i1Var2.a) != null && oVar.e()) {
                i1Var2.a.b();
            }
            p9 p9Var = h9Var.d.z0;
            if (p9Var != null) {
                p9Var.release(null);
                h9Var.d.z0 = null;
            }
            i4 i4Var3 = h9Var.d.F0;
            if (i4Var3 != null) {
                i4Var3.c = null;
                i4Var3.b = null;
                i4Var3.a = false;
                i4Var3.e = null;
                i4Var3.f = null;
                i4Var3.d = null;
                i4Var3.b();
                h9Var.d.F0 = null;
            }
            if (h9Var.d.A0 == null) {
                g1 g1Var4 = g1.W;
                if (g1Var4 == null || !g1Var4.f(inputGroupCall)) {
                    q9 q9Var2 = h9Var.d;
                    q9Var2.A0 = new g1(h9Var.c, q9Var2.h, storyItem3, j10, i7, z9, inputGroupCall, false, false);
                } else {
                    h9Var.d.A0 = g1.W;
                }
            }
            q9 q9Var3 = h9Var.d;
            q9Var3.A0.s(q9Var3.D0.getSink());
            q9 q9Var4 = h9Var.d;
            g1 g1Var5 = q9Var4.A0;
            if (i1.w == null) {
                i1.w = new i1();
            }
            i1 i1Var3 = i1.w;
            ti.o oVar3 = i1Var3.a;
            if (oVar3 != null && oVar3.d()) {
                ti.o oVar4 = i1Var3.a;
                if (oVar4.c != 0) {
                    if (i1Var3.b != g1Var5) {
                        oVar4.b();
                    }
                    q9 q9Var5 = h9Var.d;
                    q9Var5.F0 = i4Var2;
                    i4Var2.a = false;
                    i4Var2.e = q9Var5.y0;
                    fi.s3 s3Var3 = q9Var5.D0;
                    i4Var2.f = s3Var3.d;
                    i4Var2.d = s3Var3.c;
                    i4Var2.b = q9Var5.A0;
                    s3Var3.b(j10, i4Var2);
                    h9Var.d.F0.b();
                }
            }
            i1Var3.c = q9Var4;
            i1Var3.b = g1Var5;
            ti.o oVar5 = i1Var3.a;
            if (oVar5 == null || !oVar5.d()) {
                i1Var3.a = l2.i.d().k(i1Var3);
            }
            ab abVar = i1Var3.n;
            LaunchActivity launchActivity = LaunchActivity.G1;
            LaunchActivity launchActivity2 = i1Var3.r;
            if (launchActivity2 != launchActivity) {
                if (launchActivity2 != null) {
                    launchActivity2.Z0.remove(abVar);
                }
                i1Var3.r = launchActivity;
                if (launchActivity != null) {
                    launchActivity.Z0.add(abVar);
                }
            }
            i1Var3.a.c();
            q9 q9Var52 = h9Var.d;
            q9Var52.F0 = i4Var2;
            i4Var2.a = false;
            i4Var2.e = q9Var52.y0;
            fi.s3 s3Var32 = q9Var52.D0;
            i4Var2.f = s3Var32.d;
            i4Var2.d = s3Var32.c;
            i4Var2.b = q9Var52.A0;
            s3Var32.b(j10, i4Var2);
            h9Var.d.F0.b();
        }
        this.L0.invalidate();
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
        boolean z9;
        String str2;
        if (uri == null || (storyItem = this.x1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
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
                z9 = true;
                str = str2;
            } else if (T0 == null) {
                String uri3 = parse.toString();
                String t6 = MediaController.t(-1L, parse, "file");
                if (t6 == null) {
                    X0();
                    return;
                } else {
                    str = uri3;
                    z9 = false;
                    str2 = t6;
                }
            } else {
                str = T0;
                z9 = false;
                str2 = str;
            }
            if (z9) {
                gz.T(getAccountInstance(), str2, str, null, null, null, this.k1, null, null, storyItem, null, true, null, null);
                return;
            } else {
                gz.T(getAccountInstance(), null, null, parse, null, null, this.k1, null, null, storyItem, null, true, null, null);
                return;
            }
        }
        parse = uri;
        String T02 = org.telegram.messenger.g0.T0(parse);
        if (org.telegram.messenger.r2.b) {
        }
        if (z9) {
        }
    }

    public final void R0(long j3, boolean z9) {
        if (this.t1 != z9) {
            this.t1 = z9;
            ch0 ch0Var = this.i0;
            if (z9) {
                if (this.s0.a && Build.VERSION.SDK_INT < 33) {
                    q9 q9Var = ((h9) this.z1).d;
                    q9Var.k1 = true;
                    q9Var.V();
                    ra raVar = this.F3;
                    org.telegram.messenger.g0.r(raVar);
                    org.telegram.messenger.g0.i3(raVar, 100L);
                }
                P0(j3);
                e1();
                ch0Var.setAnimation(this.g1.u);
                this.t1 = true;
                this.X0.a.getImageReceiver().O0(true, true);
                h4 h4Var = this.x1;
                if (h4Var.a != null) {
                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.k1 + " storyId=" + h4Var.a.id + " " + h4.c(h4Var));
                }
            } else {
                n0();
                ch0Var.a();
                this.U0 = null;
                this.u2 = false;
                this.x2.e(true, 0.0f);
                this.L0.invalidate();
                invalidate();
                o0();
                q9 q9Var2 = ((h9) this.z1).d;
                q9Var2.H0 = false;
                q9Var2.V();
            }
            this.N0.h0(this.t1 ? 3 : 2);
            this.O0.h0(this.t1 ? 2 : 0);
            this.P0.h0(this.t1 ? 2 : 0);
            if (this.l1 || this.m1) {
                z6 z6Var = this.B1;
                long j10 = this.k1;
                boolean z10 = this.t1;
                a0.h hVar = z6Var.m;
                z9 z9Var = (z9) hVar.f(j10);
                if (z9Var == null) {
                    z9Var = new z9(z6Var.a, j10, z6Var);
                    hVar.k(z9Var, j10);
                }
                z9Var.b(z10);
            }
        }
    }

    public final void S0(int i7, long j3) {
        if (this.k1 != j3) {
            h4 h4Var = this.x1;
            h4Var.b = null;
            h4Var.a = null;
        }
        this.k1 = j3;
        this.i1 = null;
        m0(i7);
        TL_stories.PeerStories peerStories = this.s0.P0;
        boolean z9 = true;
        if (peerStories != null) {
            this.B1.V(peerStories, true);
            return;
        }
        z6 z6Var = this.B1;
        TL_stories.PeerStories y10 = z6Var.y(j3);
        if (y10 == null) {
            y10 = z6Var.z(j3);
        } else {
            z9 = false;
        }
        z6Var.V(y10, z9);
    }

    public final void U0(long j3, boolean z9, boolean z10) {
        if (!z9 && j3 == this.v3 && this.w3 == z10) {
            return;
        }
        this.v3 = j3;
        this.w3 = z10;
        f4 f4Var = this.X0;
        if (j3 < 0) {
            TLRPC.Chat M0 = qp.s1(this.l2).M0(Long.valueOf(-j3));
            e4 e4Var = f4Var.b;
            e4 e4Var2 = f4Var.b;
            e4Var.l(org.telegram.messenger.g0.D2(M0 == null ? "" : M0.title), false);
            if (M0 == null || !M0.verified) {
                e4Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(qs.e4);
            xp xpVar = new xp(mutate, null);
            xpVar.x = true;
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            xpVar.h = L;
            xpVar.n = L2;
            e4Var2.i(xpVar);
            return;
        }
        if (this.l1 && !z10) {
            f4Var.b.l(id.M0(2131745641, null), false);
            f4Var.b.i(null);
            return;
        }
        TLRPC.User a22 = qp.s1(this.l2).a2(Long.valueOf(j3));
        if (a22 == null || !a22.verified) {
            f4Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(qs.e4);
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
        this.V0 = f10;
        this.j3 = 1.0f / f11;
        if (this.U0 == o4Var) {
            return;
        }
        this.U0 = o4Var;
        if (o4Var != null) {
            ImageReceiver imageReceiver = o4Var.a;
            if (imageReceiver.n() != null) {
                Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                z2 z2Var = this.N0;
                z2Var.c0 = null;
                z2Var.Z0.setShader(null);
                z2Var.N0(new BitmapDrawable(copy));
            }
        }
    }

    public final void W0(boolean z9) {
        h4 h4Var = this.x1;
        if (h4Var.a != null) {
            q9 q9Var = this.s0;
            if (q9Var.f != null) {
                String e10 = h4Var.e();
                if (!z9) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", e10);
                    LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, id.M0(2131744846, null)), 500);
                    return;
                }
                x2 x2Var = new x2(this, q9Var.f.getContext(), e10, e10, qp.s1(this.l2).W4() && (!(this.m1 || t10.A(this.k1)) || org.telegram.messenger.t3.t0(this.m1 ? qp.s1(this.l2).M0(Long.valueOf(-this.k1)) : null)), new m2(2, this.k0));
                this.I2 = x2Var;
                x2Var.d2 = true;
                TL_stories.StoryItem storyItem = h4Var.a;
                storyItem.dialogId = this.k1;
                x2Var.A2 = storyItem;
                x2Var.n2 = new d6.i(this, 18);
                ((h9) this.z1).h(x2Var);
            }
        }
    }

    public final void X0() {
        j3 j3Var = this.L0;
        org.telegram.ui.ActionBar.h6 h6Var = this.k0;
        org.telegram.messenger.k5.p(null, 2131743833, new gc(j3Var, h6Var), h6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.k0);
        String M0 = id.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        alertDialog$Builder.k(id.M0(2131747831, null), null);
        u1Var.T = id.M0(2131747218, null);
        ((h9) this.z1).h(u1Var);
    }

    public final void Z0(boolean z9) {
        if (this.b3 != z9) {
            h4 h4Var = this.x1;
            if (h4Var.a == null) {
                return;
            }
            this.b3 = z9;
            int i7 = 0;
            if (z9) {
                this.a3.setVisibility(0);
            }
            this.a3.setStoryItem(h4Var.a);
            q9 q9Var = ((h9) this.z1).d;
            q9Var.o1 = z9;
            q9Var.V();
            if (!z9) {
                if (this.a3.getReactionsWindow() != null) {
                    this.a3.getReactionsWindow().e();
                }
                this.a3.animate().alpha(0.0f).setDuration(150L).setListener(new k2(this, i7)).start();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c3, z9 ? 1.0f : 0.0f);
            this.a3.setTransitionProgress(this.c3);
            ofFloat.addUpdateListener(new x1(this, 1));
            ofFloat.addListener(new j2(this, z9, i7));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(wq.g);
            ofFloat.start();
        }
    }

    public final void a1(boolean z9) {
        if (this.p0 == null) {
            fi.m3 m3Var = new fi.m3(getContext(), 1);
            m3Var.o(1.0f, -56.0f);
            this.p0 = m3Var;
            m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.L0.addView(this.p0, ha.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.p0.u(id.M0(z9 ? 2131744607 : 2131744457, null));
        this.p0.w();
    }

    public final boolean b1(boolean z9) {
        if (this.s0.Q0) {
            z9 = !z9;
        }
        if (!z9) {
            int i7 = this.s1;
            if (i7 > 0) {
                this.s1 = i7 - 1;
                d1(false);
                return true;
            }
        } else if (this.s1 < getStoriesCount() - 1) {
            this.s1++;
            d1(false);
            return true;
        }
        return false;
    }

    public final void c1() {
        if (qp.s1(this.l2).W4()) {
            File h = this.x1.h();
            if (h == null || !h.exists()) {
                Y0();
                return;
            }
            x2 x2Var = this.I2;
            if (x2Var != null) {
                x2Var.dismiss();
            }
            org.telegram.messenger.g0.i3(new w1(this, 8), 120L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0954, code lost:
    
        if (r4.g == (r1 == null && r1.translated && r1.translatedText != null && android.text.TextUtils.equals(r1.translatedLng, org.telegram.ui.Components.k21.M0()))) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x09b4, code lost:
    
        if (r2 != false) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x09d9, code lost:
    
        if (r3 != false) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0aec, code lost:
    
        if (r6 != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0b04, code lost:
    
        if (r6 != false) goto L557;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b99  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0c26  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0c33  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ca4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0ce2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d73  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d8a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0db3 A[EDGE_INSN: B:312:0x0db3->B:313:0x0db3 BREAK  A[LOOP:0: B:301:0x0d91->B:310:0x0db0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0dbf  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0dd0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0e28  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0e65  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0e74  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0e96  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0f2c  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0f5d  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0f6c  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0f92  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0fb3  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0fe1  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0ffd  */
    /* JADX WARN: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0fd3  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0ede  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e6e  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0e38  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0e1f  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d31  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0c89  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0935  */
    /* JADX WARN: Type inference failed for: r6v186 */
    /* JADX WARN: Type inference failed for: r6v187, types: [di.c8, org.telegram.tgnet.tl.TL_stories$StoryItem] */
    /* JADX WARN: Type inference failed for: r6v188 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(boolean z9) {
        y6 y6Var;
        TL_stories.StoryItem storyItem;
        y6 y6Var2;
        lx lxVar;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem2;
        q9 q9Var;
        n9 n9Var;
        ImageReceiver imageReceiver2;
        TL_stories.StoryItem storyItem3;
        boolean z13;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z14;
        TL_stories.StoryItem storyItem4;
        y6 y6Var3;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem5;
        fi.e7 e7Var;
        TL_stories.StoryItem storyItem6;
        y6 y6Var4;
        int i11;
        fi.e7 e7Var2;
        g1 g1Var;
        boolean z15;
        j3 j3Var;
        n3 n3Var;
        f4 f4Var;
        o2 o2Var;
        boolean z16;
        y6 y6Var5;
        bc bcVar;
        boolean z17;
        TL_stories.StoryItem storyItem7;
        boolean z18;
        int i12;
        boolean z19;
        y6 y6Var6;
        boolean z20;
        ImageReceiver imageReceiver3;
        j3 j3Var2;
        n3 n3Var2;
        f4 f4Var2;
        boolean z21;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem8;
        int i13;
        TLRPC.MessageMedia messageMedia2;
        boolean z22;
        fi.m3 m3Var;
        fi.m3 m3Var2;
        TL_stories.StoryItem storyItem9;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem10;
        c4 c4Var;
        boolean z23;
        boolean z24;
        LinearLayout linearLayout;
        boolean z25;
        boolean z26;
        o2 o2Var2;
        int i14;
        o2 o2Var3;
        int i15;
        boolean z27;
        boolean z28;
        boolean z29;
        int i16;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        lh.h hVar;
        a aVar;
        n1 n1Var;
        boolean z34;
        TL_stories.StoryItem storyItem11;
        boolean z35;
        int i17;
        int i18;
        boolean z36;
        boolean z37;
        boolean l10;
        y6 y6Var7;
        y6 y6Var8;
        fi.m3 m3Var3;
        int i19;
        ImageView imageView;
        ImageView imageView2;
        boolean z38;
        int i20;
        boolean z39;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem12;
        int i21;
        int i22;
        int i23;
        boolean z40;
        int i24;
        boolean z41;
        boolean z42;
        TL_stories.StoryItem storyItem13;
        int i25;
        int i26;
        FrameLayout.LayoutParams layoutParams;
        int L;
        boolean z43;
        boolean z44;
        int i27;
        boolean z45;
        g1 g1Var2;
        int i28;
        boolean z46;
        int i29;
        boolean z47;
        int i30;
        boolean z48;
        boolean z49;
        boolean z50;
        boolean z51;
        g1 g1Var3;
        String str;
        BitmapDrawable bitmapDrawable;
        lx lxVar2;
        q9 q9Var2;
        ?? r62;
        TLRPC.MessageMedia messageMedia3;
        r6 r6Var;
        ArrayList arrayList2 = this.e1;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f1;
        if (isEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.E2 = true;
        h4 h4Var = this.x1;
        TL_stories.StoryItem storyItem14 = h4Var.a;
        y6 y6Var9 = h4Var.b;
        String s5 = s7.s();
        this.I0 = false;
        this.L2 = false;
        int i31 = this.s1;
        boolean z52 = this.C1;
        boolean z53 = this.D1;
        boolean z54 = this.E1;
        q9 q9Var3 = this.s0;
        if (q9Var3 == null || (r6Var = q9Var3.N0) == null || r6Var.e != 4) {
            TL_stories.StoryItem storyItem15 = (i31 < 0 || i31 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i31);
            int size = i31 - arrayList2.size();
            TL_stories.StoryItem storyItem16 = storyItem15;
            y6Var = (size < 0 || size >= arrayList3.size()) ? null : (y6) arrayList3.get(size);
            storyItem = storyItem16;
        } else {
            y6Var = (i31 < 0 || i31 >= arrayList3.size()) ? null : (y6) arrayList3.get(i31);
            int size2 = i31 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        h4Var.c = null;
        f3 f3Var = this.S0;
        lx lxVar3 = this.T0;
        z2 z2Var = this.N0;
        if (y6Var != null) {
            fi.e7 e7Var3 = y6Var.c;
            this.D1 = false;
            boolean z55 = y6Var.I;
            this.E1 = z55;
            this.C1 = !z55;
            z2Var.c0(false);
            z2Var.b0(qs.g2);
            Bitmap bitmap = e7Var3.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (y6Var.s || y6Var.H) {
                BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                imageReceiver = z2Var;
                y6Var2 = y6Var9;
                lxVar2 = lxVar3;
                z10 = z52;
                z11 = z53;
                z12 = z54;
                q9Var2 = q9Var3;
                i7 = i31;
                r62 = 0;
                i10 = 4;
                imageReceiver.u0(null, null, hc.g(y6Var.f), s5, null, null, bitmapDrawable2, 0L, null, null, 0);
            } else {
                BitmapDrawable bitmapDrawable3 = bitmapDrawable;
                imageReceiver = z2Var;
                y6Var2 = y6Var9;
                r62 = 0;
                lxVar2 = lxVar3;
                z10 = z52;
                z12 = z54;
                z11 = z53;
                i10 = 4;
                q9Var2 = q9Var3;
                i7 = i31;
                imageReceiver.u0(null, null, hc.g(y6Var.e), s5, null, null, bitmapDrawable3, 0L, null, null, 0);
            }
            h4Var.b = y6Var;
            h4Var.j = r62;
            h4Var.i = r62;
            h4Var.a = r62;
            h4Var.d = false;
            h4Var.e = h4Var.m();
            TL_stories.StoryItem storyItem17 = h4Var.a;
            h4Var.f = (storyItem17 == null || (messageMedia3 = storyItem17.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            lxVar = lxVar2;
            f3Var.c(r62, u8.a(e7Var3), lxVar);
            this.D2 = false;
            this.C2 = false;
            this.B2 = false;
            q9 q9Var4 = q9Var2;
            storyItem2 = storyItem14;
            q9Var = q9Var4;
        } else {
            y6Var2 = y6Var9;
            lxVar = lxVar3;
            z10 = z52;
            z11 = z53;
            z12 = z54;
            i7 = i31;
            i10 = 4;
            imageReceiver = z2Var;
            this.C1 = false;
            this.D1 = false;
            this.E1 = false;
            if (storyItem == null) {
                if (q9Var3 != null) {
                    q9Var3.u(true);
                    return;
                }
                return;
            }
            y6 t6 = this.B1.t(this.k1, storyItem);
            if (t6 != null) {
                String str2 = t6.f;
                this.D1 = true;
                imageReceiver.c0(false);
                imageReceiver.b0(this.R0 == null ? qs.g2 : 0);
                if (t6.s) {
                    storyItem2 = storyItem14;
                    q9Var = q9Var3;
                    y6Var3 = t6;
                    imageReceiver.r0(null, null, hc.g(str2), s5, null, 0L, null, null, 0);
                } else {
                    storyItem2 = storyItem14;
                    q9Var = q9Var3;
                    y6Var3 = t6;
                    imageReceiver.r0(null, null, hc.g(str2), s5, null, 0L, null, null, 0);
                }
                h4Var.b = y6Var3;
                h4Var.j = null;
                h4Var.i = null;
                h4Var.a = null;
                h4Var.d = false;
                h4Var.e = h4Var.m();
                TL_stories.StoryItem storyItem18 = h4Var.a;
                h4Var.f = (storyItem18 == null || (messageMedia = storyItem18.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                f3Var.c(null, u8.a(y6Var3.c), lxVar);
                h4Var.c = storyItem;
                this.D2 = false;
                this.C2 = false;
                this.B2 = false;
            } else {
                storyItem2 = storyItem14;
                q9Var = q9Var3;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean z56 = messageMedia4 != null && ij.K4(messageMedia4.getDocument());
                storyItem.dialogId = this.k1;
                imageReceiver.c0(z11);
                imageReceiver.b0(qs.g2);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.L2 = true;
                    qp.s1(this.l2).P1().p(storyItem.id, this.k1);
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
                            BitmapDrawable m10 = messageMedia6 != null ? org.telegram.messenger.gc.m(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                if (org.telegram.messenger.gc.D().J(hc.g(storyItem.firstFramePath).q(null, null, false) + "@" + s5, false)) {
                                    z14 = z11;
                                    imageReceiver.u0(null, null, hc.g(storyItem.firstFramePath), s5, null, null, m10, 0L, null, null, 0);
                                }
                            }
                            z14 = z11;
                            imageReceiver.u0(null, null, hc.g(storyItem.attachPath), rf.b.r(s5, "_pframe"), null, null, m10, 0L, null, null, 0);
                        } else {
                            z14 = z11;
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            BitmapDrawable m11 = photo != null ? org.telegram.messenger.gc.m(photo.sizes) : null;
                            if (z14) {
                                imageReceiver.r0(hc.g(storyItem.attachPath), s5, hc.g(storyItem.firstFramePath), s5, m11, 0L, null, null, 0);
                            } else {
                                imageReceiver.r0(hc.g(storyItem.attachPath), s5, null, null, m11, 0L, null, null, 0);
                            }
                        }
                        storyItem3 = storyItem;
                        z13 = z14;
                    } else {
                        Drawable t10 = ((q9Var.N0 != null || q9Var.M0) && (n9Var = q9Var.s0) != null && (imageReceiver2 = n9Var.c) != null && n9Var.o == storyItem.id) ? imageReceiver2.t() : null;
                        storyItem.dialogId = this.k1;
                        if (z56) {
                            TLRPC.PhotoSize u10 = org.telegram.messenger.w7.u(1000, storyItem.media.getDocument().thumbs);
                            if (t10 == null) {
                                t10 = org.telegram.messenger.gc.m(storyItem.media.getDocument().thumbs);
                            }
                            hc b10 = hc.b(z6.C(this.l2, storyItem));
                            String r10 = rf.b.r(s5, "_pframe");
                            hc c10 = hc.c(u10, storyItem.media.getDocument());
                            TL_stories.StoryItem storyItem19 = storyItem;
                            z13 = z11;
                            imageReceiver.u0(null, null, b10, r10, c10, s5, t10, 0L, null, storyItem19, 0);
                            storyItem3 = storyItem19;
                        } else {
                            storyItem3 = storyItem;
                            z13 = z11;
                            TLRPC.MessageMedia messageMedia8 = storyItem3.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                imageReceiver.f();
                            } else {
                                if (t10 == null) {
                                    t10 = org.telegram.messenger.gc.m(arrayList);
                                }
                                TLRPC.PhotoSize u11 = org.telegram.messenger.w7.u(ConnectionsManager.DEFAULT_DATACENTER_ID, photo2.sizes);
                                org.telegram.messenger.w7.u(800, photo2.sizes);
                                imageReceiver.u0(null, null, hc.i(u11, photo2), s5, null, null, t10, 0L, null, storyItem3, 0);
                            }
                        }
                    }
                }
                storyItem3.dialogId = this.k1;
                f3Var.d(z9 ? null : storyItem3, lxVar);
                h4Var.n(storyItem3);
                boolean z57 = (this.L2 || (storyItem4 = h4Var.a) == null || (storyItem4 instanceof TL_stories.TL_storyItemDeleted) || (storyItem4 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.D2 = z57;
                this.B2 = z57;
                if (z57) {
                    this.B2 = h4Var.d() && h4Var.a.isPublic;
                }
                if (this.B2) {
                    TL_stories.StoryItem storyItem20 = h4Var.a;
                    this.B2 = storyItem20.pinned || !s7.w(this.l2, storyItem20);
                }
                boolean z58 = this.B2;
                this.C2 = z58;
                if (z58 && this.m1) {
                    TLRPC.Chat M0 = qp.s1(this.l2).M0(Long.valueOf(-this.k1));
                    this.C2 = M0 != null && org.telegram.messenger.t3.t0(M0);
                }
                if (this.D2) {
                    if (this.m1) {
                        TLRPC.Chat M02 = qp.s1(this.l2).M0(Long.valueOf(-this.k1));
                        this.D2 = (M02 == null || org.telegram.messenger.t3.K(M02, false) == null) ? false : true;
                    } else {
                        TLRPC.User a22 = qp.s1(this.l2).a2(Long.valueOf(this.k1));
                        this.D2 = (a22 == null || t10.n(a22) == null || !h4Var.a.isPublic) ? false : true;
                    }
                }
                dt.k0.c(new us(dt.t(this.l2), this.k1, storyItem3.id, 1));
                storyItem5 = h4Var.a;
                if (storyItem5 != null && !z9) {
                    q9Var.O0 = storyItem5.id;
                }
                q9Var.n0.A();
                this.H2 = true;
                if (!this.l1 || this.m1) {
                    i1(false);
                }
                TL_stories.StoryItem storyItem21 = h4Var.a;
                y6 y6Var10 = h4Var.b;
                int i32 = storyItem21 == null ? storyItem21.id : (y6Var10 == null || (e7Var = y6Var10.c) == null) ? 0 : e7Var.f;
                if (storyItem2 == null) {
                    storyItem6 = storyItem2;
                    i11 = storyItem6.id;
                    y6Var4 = y6Var2;
                } else {
                    storyItem6 = storyItem2;
                    y6Var4 = y6Var2;
                    i11 = (y6Var2 == null || (e7Var2 = y6Var4.c) == null) ? 0 : e7Var2.f;
                }
                boolean z59 = (i32 == i11 && (y6Var4 == null || storyItem21 == null || !TextUtils.equals(y6Var4.e, storyItem21.attachPath))) ? false : true;
                boolean z60 = (z59 || (this.D1 == z13 && this.C1 == z10 && this.E1 == z12)) ? false : true;
                g1Var = q9Var.A0;
                if (g1Var != null) {
                    int i33 = this.z3;
                    TLRPC.GroupCall groupCall = g1Var.w;
                    if (i33 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                        z15 = true;
                        j3Var = this.L0;
                        n3Var = this.t0;
                        f4Var = this.X0;
                        if ((y6Var4 != null || (str = y6Var4.e) == null || !str.equals(h4Var.f())) && (storyItem6 == null || (storyItem7 = h4Var.a) == null || storyItem6.id != storyItem7.id)) {
                            o2Var = this.K1;
                            if (o2Var != null) {
                                if (storyItem6 != null && !TextUtils.isEmpty(o2Var.getEditField().getText())) {
                                    q9.P(storyItem6.dialogId, storyItem6, this.K1.getEditField().getText());
                                }
                                this.K1.getEditField().setText(q9.A(this.k1, h4Var.a));
                                z17 = h4Var.f;
                                if (z17) {
                                    this.K1.U0(false, false);
                                } else {
                                    this.K1.U0(true, true);
                                }
                            }
                            z16 = h4Var.f;
                            if (z16) {
                                K0();
                            }
                            lxVar.c();
                            this.F0 = 0L;
                            this.H0 = false;
                            y6Var5 = h4Var.b;
                            if (y6Var5 != null) {
                                dh0 dh0Var = f4Var.d;
                                if (dh0Var != null) {
                                    dh0Var.e(false, y6Var5.h);
                                }
                                f4Var.a.invalidate();
                            } else if (!z60) {
                                f4Var.h = 0.0f;
                            }
                            bcVar = bc.w;
                            if (bcVar != null && bcVar.h == j3Var) {
                                bcVar.b();
                            }
                            n3Var.J();
                            o0();
                            z15 = true;
                        }
                        if (!z15 || (y6Var4 != null && h4Var.b == null)) {
                            f4Var.setOnSubtitleClick(null);
                            TextView[] textViewArr = f4Var.c;
                            this.z3 = 0;
                            z18 = z59;
                            i12 = 2;
                            long j3 = this.k1;
                            boolean z61 = z60;
                            z19 = h4Var.f;
                            U0(j3, false, z19);
                            y6Var6 = h4Var.b;
                            if (y6Var6 != null) {
                                charSequence3 = y6Var6.I ? id.L0(2131750844) : s7.u(textViewArr[0], this.D1);
                            } else {
                                if (G0()) {
                                    TL_stories.StoryItem storyItem22 = h4Var.a;
                                    if (storyItem22 != null && (messageMedia2 = storyItem22.media) != null) {
                                        if (messageMedia2.document != null) {
                                            charSequence3 = id.X(r13.date);
                                        } else {
                                            if (messageMedia2.photo != null) {
                                                charSequence3 = id.X(r1.date);
                                            }
                                        }
                                    }
                                    z20 = z15;
                                    imageReceiver3 = imageReceiver;
                                    j3Var2 = j3Var;
                                    n3Var2 = n3Var;
                                    f4Var2 = f4Var;
                                    z21 = z61;
                                    charSequence = "";
                                } else {
                                    TL_stories.StoryItem storyItem23 = h4Var.a;
                                    if (storyItem23 == null) {
                                        z20 = z15;
                                        imageReceiver3 = imageReceiver;
                                        j3Var2 = j3Var;
                                        n3Var2 = n3Var;
                                        f4Var2 = f4Var;
                                        z21 = z61;
                                        charSequence = null;
                                    } else if (storyItem23.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.L0(2131748825));
                                        spannableStringBuilder.setSpan(new k0(1), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        g1 g1Var4 = q9Var.A0;
                                        if (g1Var4 != null) {
                                            TLRPC.GroupCall groupCall2 = g1Var4.w;
                                            i13 = 1;
                                            this.z3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                                        } else {
                                            i13 = 1;
                                        }
                                        spannableStringBuilder.append((CharSequence) id.I(Math.max(i13, this.z3), "LiveStoryWatching"));
                                        charSequence3 = spannableStringBuilder;
                                    } else if (storyItem23.date == -1) {
                                        charSequence3 = id.L0(2131752644);
                                    } else {
                                        if (h4Var.i() != null) {
                                            c8 i34 = h4Var.i();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            z20 = z15;
                                            imageReceiver3 = imageReceiver;
                                            SpannableString spannableString = new SpannableString("r");
                                            j3Var2 = j3Var;
                                            n3Var2 = n3Var;
                                            spannableString.setSpan(new wp(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) spannableString).append((CharSequence) " ");
                                            if (i34.b != null) {
                                                org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(15.0f, this.l2, textViewArr[0]);
                                                SpannableString spannableString2 = new SpannableString("a");
                                                spannableString2.setSpan(f5Var, 0, 1, 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                                if (i34.b.longValue() > 0) {
                                                    TLRPC.User a23 = qp.s1(this.l2).a2(i34.b);
                                                    f5Var.e(a23);
                                                    spannableStringBuilder2.append((CharSequence) t10.p(a23));
                                                } else {
                                                    TLRPC.Chat M03 = qp.s1(this.l2).M0(Long.valueOf(-i34.b.longValue()));
                                                    f5Var.b(M03);
                                                    if (M03 != null) {
                                                        spannableStringBuilder2.append((CharSequence) M03.title);
                                                    }
                                                }
                                            } else {
                                                String str4 = h4Var.a.fwd_from.from_name;
                                                if (str4 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str4);
                                                }
                                            }
                                            f4Var.setOnSubtitleClick(new bi.r(10, this, i34));
                                            SpannableString spannableString3 = new SpannableString(".");
                                            es esVar = new es();
                                            esVar.b = org.telegram.messenger.g0.L(1.5f);
                                            esVar.c = 5.0f;
                                            spannableString3.setSpan(esVar, 0, spannableString3.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) id.P(h4Var.a.date));
                                            f4Var2 = f4Var;
                                            charSequence = spannableStringBuilder2;
                                        } else {
                                            z20 = z15;
                                            imageReceiver3 = imageReceiver;
                                            j3Var2 = j3Var;
                                            n3Var2 = n3Var;
                                            if (!this.n1 || (storyItem8 = h4Var.a) == null || storyItem8.from_id == null) {
                                                f4Var2 = f4Var;
                                                String X = id.X(h4Var.a.date);
                                                charSequence2 = X;
                                                if (h4Var.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X);
                                                    es esVar2 = new es();
                                                    esVar2.b = org.telegram.messenger.g0.L(1.5f);
                                                    esVar2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(esVar2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                                    valueOf.append((CharSequence) id.L0(2131751210));
                                                    charSequence2 = valueOf;
                                                }
                                                charSequence = charSequence2;
                                                z21 = z61;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(15.0f, this.l2, textViewArr[0]);
                                                SpannableString spannableString4 = new SpannableString("a");
                                                spannableString4.setSpan(f5Var2, 0, 1, 33);
                                                spannableStringBuilder3.append((CharSequence) spannableString4).append((CharSequence) " ");
                                                long o4 = org.telegram.messenger.m5.o(h4Var.a.from_id);
                                                if (o4 > 0) {
                                                    TLRPC.User a24 = qp.s1(this.l2).a2(Long.valueOf(o4));
                                                    f5Var2.e(a24);
                                                    spannableStringBuilder3.append((CharSequence) t10.p(a24));
                                                    f4Var2 = f4Var;
                                                } else {
                                                    f4Var2 = f4Var;
                                                    TLRPC.Chat M04 = qp.s1(this.l2).M0(Long.valueOf(-o4));
                                                    f5Var2.b(M04);
                                                    if (M04 != null) {
                                                        spannableStringBuilder3.append((CharSequence) M04.title);
                                                    }
                                                }
                                                f4Var2.setOnSubtitleClick(new u1(this, o4, 0));
                                                SpannableString spannableString5 = new SpannableString(".");
                                                es esVar3 = new es();
                                                esVar3.b = org.telegram.messenger.g0.L(1.5f);
                                                esVar3.c = 5.0f;
                                                spannableString5.setSpan(esVar3, 0, spannableString5.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) id.P(h4Var.a.date));
                                                charSequence = spannableStringBuilder3;
                                            }
                                        }
                                        z21 = false;
                                    }
                                }
                                if (charSequence == null) {
                                    r6 r6Var2 = q9Var.N0;
                                    if (r6Var2 == null || (storyItem9 = h4Var.a) == null || !r6Var2.m(storyItem9.id)) {
                                        z22 = false;
                                    } else {
                                        if (!(charSequence instanceof SpannableStringBuilder)) {
                                            charSequence = new SpannableStringBuilder(charSequence);
                                        }
                                        SpannableString spannableString6 = new SpannableString("p ");
                                        z22 = false;
                                        spannableString6.setSpan(new wp(R.drawable.msg_pin_mini), 0, 1, 33);
                                        ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString6);
                                    }
                                    f4Var2.c(charSequence, z21);
                                } else {
                                    z22 = false;
                                }
                                m3Var = this.o0;
                                if (m3Var != null) {
                                    m3Var.f(z22);
                                }
                                m3Var2 = this.p0;
                                if (m3Var2 != null) {
                                    m3Var2.f(z22);
                                }
                            }
                            z20 = z15;
                            imageReceiver3 = imageReceiver;
                            j3Var2 = j3Var;
                            n3Var2 = n3Var;
                            f4Var2 = f4Var;
                            charSequence2 = charSequence3;
                            charSequence = charSequence2;
                            z21 = z61;
                            if (charSequence == null) {
                            }
                            m3Var = this.o0;
                            if (m3Var != null) {
                            }
                            m3Var2 = this.p0;
                            if (m3Var2 != null) {
                            }
                        } else {
                            z18 = z59;
                            z20 = z15;
                            imageReceiver3 = imageReceiver;
                            j3Var2 = j3Var;
                            n3Var2 = n3Var;
                            f4Var2 = f4Var;
                            i12 = 2;
                        }
                        storyItem10 = h4Var.a;
                        if (storyItem6 == storyItem10 && y6Var4 == h4Var.b) {
                        }
                        h4Var.o();
                        if ((!h4Var.g || storyItem6 != h4Var.a) && (c4Var = this.z1) != null) {
                            q9 q9Var5 = ((h9) c4Var).d;
                            q9Var5.Y0 = false;
                            q9Var5.V();
                        }
                        z23 = h4Var.f;
                        z24 = !z23 && (g1Var3 = q9Var.A0) != null && h4Var.k(g1Var3.g()) && q9Var.A0.b();
                        if (z24 != this.p1) {
                            this.p1 = z24;
                            if (z24) {
                                x0();
                            }
                            if (this.P1 != null && (this.o1 || this.p1)) {
                                f1();
                            }
                            o2 o2Var4 = this.K1;
                            if (o2Var4 != null) {
                                if (this.o1) {
                                    z51 = h4Var.f;
                                }
                                if (!this.p1) {
                                    z50 = true;
                                    o2Var4.setEnabled(z50);
                                    z49 = true;
                                    this.K1.R1(true);
                                }
                                z50 = false;
                                o2Var4.setEnabled(z50);
                                z49 = true;
                                this.K1.R1(true);
                            } else {
                                z49 = true;
                            }
                            p0(z49);
                        }
                        linearLayout = this.P1;
                        if (linearLayout != null) {
                            if (this.o1) {
                                z48 = h4Var.f;
                            }
                            if (!this.p1) {
                                i30 = 8;
                                linearLayout.setVisibility(i30);
                            }
                            i30 = 0;
                            linearLayout.setVisibility(i30);
                        }
                        z25 = this.L2;
                        LinearLayout linearLayout2 = this.x0;
                        if (z25) {
                            A0();
                            y0();
                            this.J2.setVisibility(0);
                            this.K2.setVisibility(0);
                            this.D2 = false;
                            this.C2 = false;
                            this.B2 = false;
                            o2 o2Var5 = this.K1;
                            if (o2Var5 != null) {
                                o2Var5.setVisibility(8);
                            }
                            a3 a3Var = this.F1;
                            if (a3Var != null) {
                                a3Var.setVisibility(8);
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat M05 = this.k1 < 0 ? qp.s1(this.l2).M0(Long.valueOf(-this.k1)) : null;
                            z26 = h4Var.f;
                            if (z26) {
                                if (this.K1 == null) {
                                    t0();
                                }
                                s0();
                                w0();
                                v0();
                                i14 = 0;
                                this.K1.setVisibility(0);
                            } else {
                                if ((t10.A(this.k1) || G0()) && (o2Var2 = this.K1) != null) {
                                    o2Var2.setVisibility(8);
                                } else if (!this.l1 && ((!this.m1 || (this.n1 && (org.telegram.messenger.t3.q(M05) || org.telegram.messenger.t3.s0(M05)))) && (o2Var3 = this.K1) != null)) {
                                    i14 = 0;
                                    o2Var3.setVisibility(0);
                                }
                                i14 = 0;
                            }
                            o2 o2Var6 = this.K1;
                            if (o2Var6 != null) {
                                z31 = h4Var.f;
                                o2Var6.setOnSendButtonLongClick(z31 ? new v1(this, i14) : null);
                                o2 o2Var7 = this.K1;
                                z32 = h4Var.f;
                                B0(true);
                                o2Var7.i1(z32);
                                o2 o2Var8 = this.K1;
                                z33 = h4Var.f;
                                o2Var8.o1(z33 && !B0(true) && (this.e2 || this.K1.W0), true);
                            }
                            if (this.o1 && this.P1 == null) {
                                x0();
                            }
                            if (this.P1 != null) {
                                if (this.o1 || this.p1) {
                                    f1();
                                }
                                LinearLayout linearLayout3 = this.P1;
                                if (this.o1) {
                                    z30 = h4Var.f;
                                }
                                if (!this.p1) {
                                    i16 = 8;
                                    linearLayout3.setVisibility(i16);
                                }
                                i16 = 0;
                                linearLayout3.setVisibility(i16);
                            }
                            o2 o2Var9 = this.K1;
                            if (o2Var9 != null) {
                                if (this.o1) {
                                    z29 = h4Var.f;
                                }
                                if (!this.p1) {
                                    z28 = true;
                                    o2Var9.setEnabled(z28);
                                }
                                z28 = false;
                                o2Var9.setEnabled(z28);
                            }
                            a3 a3Var2 = this.F1;
                            if (a3Var2 != null) {
                                if (this.l1) {
                                    z27 = h4Var.f;
                                    if (!z27) {
                                        i15 = 0;
                                        a3Var2.setVisibility(i15);
                                    }
                                }
                                i15 = 8;
                                a3Var2.setVisibility(i15);
                            }
                            FrameLayout frameLayout = this.J2;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (t10.A(this.k1)) {
                                y0();
                                this.K2.setVisibility(0);
                            } else {
                                md mdVar = this.K2;
                                if (mdVar != null) {
                                    mdVar.setVisibility(8);
                                }
                            }
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(G0() ? 8 : 0);
                            }
                        }
                        hVar = this.L1;
                        if (hVar != null) {
                            o2 o2Var10 = this.K1;
                            if (o2Var10 != null && o2Var10.getVisibility() == 0) {
                                z47 = h4Var.f;
                                if (!z47) {
                                    i29 = 0;
                                    hVar.setVisibility(i29);
                                }
                            }
                            i29 = 8;
                            hVar.setVisibility(i29);
                        }
                        aVar = this.G1;
                        g2 g2Var = this.u0;
                        if (aVar != null) {
                            if (!this.L2) {
                                z46 = h4Var.f;
                                if (z46) {
                                    i28 = 0;
                                    aVar.setVisibility(i28);
                                    this.G1.a(g2Var.g(), false);
                                    this.G1.setCount(g2Var.getUnreadMessagesCount());
                                }
                            }
                            i28 = 8;
                            aVar.setVisibility(i28);
                            this.G1.a(g2Var.g(), false);
                            this.G1.setCount(g2Var.getUnreadMessagesCount());
                        }
                        n1Var = this.J1;
                        if (n1Var != null) {
                            if (!this.L2) {
                                z45 = h4Var.f;
                                if (z45 && (g1Var2 = g1.W) != null && h4Var.k(g1Var2.g())) {
                                    i27 = 0;
                                    n1Var.setVisibility(i27);
                                    n1 n1Var2 = this.J1;
                                    g1 g1Var5 = g1.W;
                                    n1Var2.b(g1Var5 == null && g1Var5.o(), true);
                                    n1 n1Var3 = this.J1;
                                    g1 g1Var6 = g1.W;
                                    n1Var3.a(g1Var6 != null || g1Var6.m(), true);
                                }
                            }
                            i27 = 8;
                            n1Var.setVisibility(i27);
                            n1 n1Var22 = this.J1;
                            g1 g1Var52 = g1.W;
                            n1Var22.b(g1Var52 == null && g1Var52.o(), true);
                            n1 n1Var32 = this.J1;
                            g1 g1Var62 = g1.W;
                            n1Var32.a(g1Var62 != null || g1Var62.m(), true);
                        }
                        if (this.I1 != null) {
                            q1 q1Var = this.H1;
                            if (!this.L2) {
                                z44 = h4Var.f;
                                if (z44) {
                                    i25 = 0;
                                    q1Var.setVisibility(i25);
                                    r1 r1Var = this.I1;
                                    if (!this.L2) {
                                        z43 = h4Var.f;
                                        if (z43) {
                                            i26 = 0;
                                            r1Var.setVisibility(i26);
                                            layoutParams = (FrameLayout.LayoutParams) this.I1.getLayoutParams();
                                            n1 n1Var4 = this.J1;
                                            L = org.telegram.messenger.g0.L((n1Var4 == null && n1Var4.getVisibility() == 0) ? 54.0f : 7.0f);
                                            if (layoutParams.rightMargin != L) {
                                                layoutParams.rightMargin = L;
                                                this.I1.setLayoutParams(layoutParams);
                                            }
                                        }
                                    }
                                    i26 = 8;
                                    r1Var.setVisibility(i26);
                                    layoutParams = (FrameLayout.LayoutParams) this.I1.getLayoutParams();
                                    n1 n1Var42 = this.J1;
                                    L = org.telegram.messenger.g0.L((n1Var42 == null && n1Var42.getVisibility() == 0) ? 54.0f : 7.0f);
                                    if (layoutParams.rightMargin != L) {
                                    }
                                }
                            }
                            i25 = 8;
                            q1Var.setVisibility(i25);
                            r1 r1Var2 = this.I1;
                            if (!this.L2) {
                            }
                            i26 = 8;
                            r1Var2.setVisibility(i26);
                            layoutParams = (FrameLayout.LayoutParams) this.I1.getLayoutParams();
                            n1 n1Var422 = this.J1;
                            L = org.telegram.messenger.g0.L((n1Var422 == null && n1Var422.getVisibility() == 0) ? 54.0f : 7.0f);
                            if (layoutParams.rightMargin != L) {
                            }
                        }
                        z34 = h4Var.f;
                        if (!z34 || ((h4Var.h == null && h4Var.i() == null && h4Var.g() == null) || this.L2)) {
                            n3 n3Var3 = n3Var2;
                            if (this.t1) {
                                q9 q9Var6 = ((h9) this.z1).d;
                                q9Var6.K0 = false;
                                q9Var6.V();
                                c4 c4Var2 = this.z1;
                                this.S2 = false;
                                ((h9) c4Var2).e();
                            }
                            n3Var3.setVisibility(8);
                        } else {
                            n3 n3Var4 = n3Var2;
                            n3Var4.b0.b(h4Var.h, h4Var.i(), h4Var.g(), q9Var.Y0 && !h4Var.g && (storyItem13 = h4Var.a) != null && storyItem13.translated, storyItem6 == h4Var.a);
                            n3Var4.setVisibility(0);
                        }
                        storyItem11 = h4Var.a;
                        if (storyItem11 != null) {
                            TLRPC.MessageMedia messageMedia9 = storyItem11.media;
                            if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (g2Var.r(this.k1, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                                    g2Var.q(false, false);
                                    this.u3 = 0L;
                                    o2 o2Var11 = this.K1;
                                    if (o2Var11 != null) {
                                        o2Var11.E(true);
                                        this.K1.T1();
                                        p0(true);
                                    }
                                }
                                g2Var.setVisibility(0);
                                j3Var2.invalidate();
                                if (this.z1 != null && I0()) {
                                    ((h9) this.z1).a(this.s1, this.k1);
                                }
                                z35 = this.m1;
                                a3 a3Var3 = this.y0;
                                ImageView imageView3 = this.w0;
                                a3 a3Var4 = this.m0;
                                if (z35) {
                                    if (this.B2) {
                                        z37 = h4Var.f;
                                        if (!z37) {
                                            i17 = 0;
                                            imageView3.setVisibility(i17);
                                            if (a3Var3 != null) {
                                                a3Var3.setVisibility(8);
                                            }
                                            if (!this.l1) {
                                                z36 = h4Var.f;
                                                if (!z36) {
                                                    i18 = 0;
                                                    a3Var4.setVisibility(i18);
                                                    a3Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                                }
                                            }
                                            i18 = 8;
                                            a3Var4.setVisibility(i18);
                                            a3Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                        }
                                    }
                                    i17 = i10;
                                    imageView3.setVisibility(i17);
                                    if (a3Var3 != null) {
                                    }
                                    if (!this.l1) {
                                    }
                                    i18 = 8;
                                    a3Var4.setVisibility(i18);
                                    a3Var4.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                                } else {
                                    if (this.B2) {
                                        z42 = h4Var.f;
                                        if (!z42) {
                                            i22 = 0;
                                            imageView3.setVisibility(i22);
                                            if (a3Var3 != null) {
                                                if (this.C2) {
                                                    z41 = h4Var.f;
                                                    if (!z41) {
                                                        i24 = 0;
                                                        a3Var3.setVisibility(i24);
                                                    }
                                                }
                                                i24 = 8;
                                                a3Var3.setVisibility(i24);
                                            }
                                            if (!this.E1) {
                                                z40 = h4Var.f;
                                                if (!z40) {
                                                    i23 = 0;
                                                    a3Var4.setVisibility(i23);
                                                }
                                            }
                                            i23 = 8;
                                            a3Var4.setVisibility(i23);
                                        }
                                    }
                                    i22 = i10;
                                    imageView3.setVisibility(i22);
                                    if (a3Var3 != null) {
                                    }
                                    if (!this.E1) {
                                    }
                                    i23 = 8;
                                    a3Var4.setVisibility(i23);
                                }
                                a3Var4.requestLayout();
                                q9Var.d1.append(this.k1, i7);
                                if (this.t1) {
                                    P0(0L);
                                    e1();
                                    imageReceiver3.b();
                                }
                                g2Var.setLivePlayer(q9Var.A0);
                                this.u1 = 0;
                                if (q9Var.N0 != null && (storyItem12 = h4Var.a) != null) {
                                    int i35 = storyItem12.id;
                                    i21 = 0;
                                    while (true) {
                                        if (i21 < q9Var.N0.i.size()) {
                                            ij ijVar = (ij) q9Var.N0.i.get(i21);
                                            if (ijVar != null && ijVar.e1() == i35) {
                                                this.u1 = i21;
                                                break;
                                            }
                                            i21++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                int i36 = this.s1;
                                this.v1 = i36;
                                int i37 = this.j1;
                                this.w1 = i37;
                                if (q9Var.Q0) {
                                    this.v1 = (i37 - 1) - i36;
                                }
                                l10 = h4Var.l();
                                b4 b4Var = this.h0;
                                if (l10) {
                                    b4Var.setVisibility(8);
                                } else {
                                    b4Var.setVisibility(0);
                                    this.N2 = h4Var.j() ? 1.0f : 0.5f;
                                    boolean j10 = h4Var.j();
                                    ImageView imageView4 = this.j0;
                                    ch0 ch0Var = this.i0;
                                    if (j10) {
                                        ch0Var.setVisibility(0);
                                        imageView4.setVisibility(8);
                                        b4Var.setContentDescription(id.L0(!q9.C1 ? 2131748314 : 2131743849));
                                    } else {
                                        ch0Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        b4Var.setContentDescription(id.L0(2131748151));
                                    }
                                    b4Var.setAlpha((1.0f - this.N3) * this.N2);
                                }
                                y6Var7 = h4Var.b;
                                v8 v8Var = this.l0;
                                if (y6Var7 == null) {
                                    v8Var.a(this.l1, y6Var7, z18 && this.L3);
                                } else {
                                    TL_stories.StoryItem storyItem24 = h4Var.a;
                                    if (storyItem24 != null) {
                                        v8Var.b(this.l1, storyItem24, z18 && this.L3);
                                    } else {
                                        v8Var.b(this.l1, null, z18 && this.L3);
                                    }
                                }
                                this.L3 = false;
                                v8Var.setTranslationX(b4Var.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                                if (z20) {
                                    this.Z2 = false;
                                    TL_stories.StoryItem storyItem25 = h4Var.a;
                                    if (storyItem25 == null || (reaction = storyItem25.sent_reaction) == null) {
                                        this.n0.setReaction(null);
                                    } else {
                                        this.n0.setReaction(ch.o0.d(reaction));
                                    }
                                }
                                y6Var8 = h4Var.b;
                                if (y6Var8 == null && y6Var8.I) {
                                    u0();
                                    this.S1.set(h4Var.b.c.x);
                                    this.S1.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.T1;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.T1 = null;
                                    }
                                    if (z18) {
                                        ViewPropertyAnimator interpolator = this.S1.animate().alpha(1.0f).setDuration(180L).setInterpolator(wq.h);
                                        this.T1 = interpolator;
                                        interpolator.start();
                                    } else {
                                        this.S1.setAlpha(1.0f);
                                    }
                                } else if (this.S1 != null) {
                                    ViewPropertyAnimator viewPropertyAnimator2 = this.T1;
                                    if (viewPropertyAnimator2 != null) {
                                        viewPropertyAnimator2.cancel();
                                        this.T1 = null;
                                    }
                                    if (z18 && this.S1.getVisibility() == 0) {
                                        ViewPropertyAnimator withEndAction = this.S1.animate().alpha(0.0f).setDuration(180L).setInterpolator(wq.h).withEndAction(new w1(this, 0));
                                        this.T1 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.S1.setAlpha(0.0f);
                                        this.S1.setVisibility(8);
                                    }
                                }
                                this.g1.a(q9.C1, false);
                                if (this.t1 && h4Var.a != null) {
                                    org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.k1 + " storyId=" + h4Var.a.id + " " + h4.c(h4Var));
                                }
                                if (this.l1) {
                                    l5.f(this.l2, this.k1, h4Var.a);
                                }
                                e4 e4Var = f4Var2.b;
                                r6 r6Var3 = q9Var.N0;
                                e4Var.setPadding(0, 0, (r6Var3 != null || r6Var3.g() == this.w1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                                qp.s1(this.l2).T1().l(h4Var.a);
                                if (!z9 && !this.l1 && this.i3 == null && !iz.T && iz.U) {
                                    w1 w1Var = new w1(this, 1);
                                    this.i3 = w1Var;
                                    org.telegram.messenger.g0.i3(w1Var, 500L);
                                }
                                m3Var3 = this.p0;
                                if (!(m3Var3 == null && m3Var3.V) && h4Var.j() && q9.C1) {
                                    i19 = 0;
                                    if (qp.e1().getInt("taptostorysoundhint", 0) < i12) {
                                        w1 w1Var2 = this.A3;
                                        org.telegram.messenger.g0.r(w1Var2);
                                        org.telegram.messenger.g0.i3(w1Var2, 250L);
                                    }
                                } else {
                                    i19 = 0;
                                }
                                imageView = this.f0;
                                if (imageView != null) {
                                    if (G0() && !H0()) {
                                        z39 = h4Var.e;
                                        if (!z39) {
                                            i20 = 8;
                                            imageView.setVisibility(i20);
                                        }
                                    }
                                    i20 = i19;
                                    imageView.setVisibility(i20);
                                }
                                imageView2 = this.g0;
                                if (imageView2 == null) {
                                    z38 = h4Var.f;
                                    imageView2.setVisibility((!z38 || v8Var.f) ? 8 : i19);
                                    return;
                                }
                                return;
                            }
                        }
                        g2Var.r(this.k1, null);
                        g2Var.setVisibility(8);
                        j3Var2.invalidate();
                        if (this.z1 != null) {
                            ((h9) this.z1).a(this.s1, this.k1);
                        }
                        z35 = this.m1;
                        a3 a3Var32 = this.y0;
                        ImageView imageView32 = this.w0;
                        a3 a3Var42 = this.m0;
                        if (z35) {
                        }
                        a3Var42.requestLayout();
                        q9Var.d1.append(this.k1, i7);
                        if (this.t1) {
                        }
                        g2Var.setLivePlayer(q9Var.A0);
                        this.u1 = 0;
                        if (q9Var.N0 != null) {
                            int i352 = storyItem12.id;
                            i21 = 0;
                            while (true) {
                                if (i21 < q9Var.N0.i.size()) {
                                }
                                i21++;
                            }
                        }
                        int i362 = this.s1;
                        this.v1 = i362;
                        int i372 = this.j1;
                        this.w1 = i372;
                        if (q9Var.Q0) {
                        }
                        l10 = h4Var.l();
                        b4 b4Var2 = this.h0;
                        if (l10) {
                        }
                        y6Var7 = h4Var.b;
                        v8 v8Var2 = this.l0;
                        if (y6Var7 == null) {
                        }
                        this.L3 = false;
                        v8Var2.setTranslationX(b4Var2.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                        if (z20) {
                        }
                        y6Var8 = h4Var.b;
                        if (y6Var8 == null) {
                        }
                        if (this.S1 != null) {
                        }
                        this.g1.a(q9.C1, false);
                        if (this.t1) {
                            org.telegram.messenger.a8.b("StoryViewer displayed story dialogId=" + this.k1 + " storyId=" + h4Var.a.id + " " + h4.c(h4Var));
                        }
                        if (this.l1) {
                        }
                        e4 e4Var2 = f4Var2.b;
                        r6 r6Var32 = q9Var.N0;
                        e4Var2.setPadding(0, 0, (r6Var32 != null || r6Var32.g() == this.w1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                        qp.s1(this.l2).T1().l(h4Var.a);
                        if (!z9) {
                            w1 w1Var3 = new w1(this, 1);
                            this.i3 = w1Var3;
                            org.telegram.messenger.g0.i3(w1Var3, 500L);
                        }
                        m3Var3 = this.p0;
                        if (m3Var3 == null) {
                        }
                        i19 = 0;
                        if (qp.e1().getInt("taptostorysoundhint", 0) < i12) {
                        }
                        imageView = this.f0;
                        if (imageView != null) {
                        }
                        imageView2 = this.g0;
                        if (imageView2 == null) {
                        }
                    }
                }
                z15 = false;
                j3Var = this.L0;
                n3Var = this.t0;
                f4Var = this.X0;
                if (y6Var4 != null) {
                }
                o2Var = this.K1;
                if (o2Var != null) {
                }
                z16 = h4Var.f;
                if (z16) {
                }
                lxVar.c();
                this.F0 = 0L;
                this.H0 = false;
                y6Var5 = h4Var.b;
                if (y6Var5 != null) {
                }
                bcVar = bc.w;
                if (bcVar != null) {
                    bcVar.b();
                }
                n3Var.J();
                o0();
                z15 = true;
                if (z15) {
                }
                f4Var.setOnSubtitleClick(null);
                TextView[] textViewArr2 = f4Var.c;
                this.z3 = 0;
                z18 = z59;
                i12 = 2;
                long j32 = this.k1;
                boolean z612 = z60;
                z19 = h4Var.f;
                U0(j32, false, z19);
                y6Var6 = h4Var.b;
                if (y6Var6 != null) {
                }
                z20 = z15;
                imageReceiver3 = imageReceiver;
                j3Var2 = j3Var;
                n3Var2 = n3Var;
                f4Var2 = f4Var;
                charSequence2 = charSequence3;
                charSequence = charSequence2;
                z21 = z612;
                if (charSequence == null) {
                }
                m3Var = this.o0;
                if (m3Var != null) {
                }
                m3Var2 = this.p0;
                if (m3Var2 != null) {
                }
                storyItem10 = h4Var.a;
                if (storyItem6 == storyItem10) {
                }
                h4Var.o();
                if (!h4Var.g) {
                }
                q9 q9Var52 = ((h9) c4Var).d;
                q9Var52.Y0 = false;
                q9Var52.V();
                z23 = h4Var.f;
                if (z23) {
                }
                if (z24 != this.p1) {
                }
                linearLayout = this.P1;
                if (linearLayout != null) {
                }
                z25 = this.L2;
                LinearLayout linearLayout22 = this.x0;
                if (z25) {
                }
                hVar = this.L1;
                if (hVar != null) {
                }
                aVar = this.G1;
                g2 g2Var2 = this.u0;
                if (aVar != null) {
                }
                n1Var = this.J1;
                if (n1Var != null) {
                }
                if (this.I1 != null) {
                }
                z34 = h4Var.f;
                if (z34) {
                }
                n3 n3Var32 = n3Var2;
                if (this.t1) {
                }
                n3Var32.setVisibility(8);
                storyItem11 = h4Var.a;
                if (storyItem11 != null) {
                }
                g2Var2.r(this.k1, null);
                g2Var2.setVisibility(8);
                j3Var2.invalidate();
                if (this.z1 != null) {
                }
                z35 = this.m1;
                a3 a3Var322 = this.y0;
                ImageView imageView322 = this.w0;
                a3 a3Var422 = this.m0;
                if (z35) {
                }
                a3Var422.requestLayout();
                q9Var.d1.append(this.k1, i7);
                if (this.t1) {
                }
                g2Var2.setLivePlayer(q9Var.A0);
                this.u1 = 0;
                if (q9Var.N0 != null) {
                }
                int i3622 = this.s1;
                this.v1 = i3622;
                int i3722 = this.j1;
                this.w1 = i3722;
                if (q9Var.Q0) {
                }
                l10 = h4Var.l();
                b4 b4Var22 = this.h0;
                if (l10) {
                }
                y6Var7 = h4Var.b;
                v8 v8Var22 = this.l0;
                if (y6Var7 == null) {
                }
                this.L3 = false;
                v8Var22.setTranslationX(b4Var22.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
                if (z20) {
                }
                y6Var8 = h4Var.b;
                if (y6Var8 == null) {
                }
                if (this.S1 != null) {
                }
                this.g1.a(q9.C1, false);
                if (this.t1) {
                }
                if (this.l1) {
                }
                e4 e4Var22 = f4Var2.b;
                r6 r6Var322 = q9Var.N0;
                e4Var22.setPadding(0, 0, (r6Var322 != null || r6Var322.g() == this.w1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
                qp.s1(this.l2).T1().l(h4Var.a);
                if (!z9) {
                }
                m3Var3 = this.p0;
                if (m3Var3 == null) {
                }
                i19 = 0;
                if (qp.e1().getInt("taptostorysoundhint", 0) < i12) {
                }
                imageView = this.f0;
                if (imageView != null) {
                }
                imageView2 = this.g0;
                if (imageView2 == null) {
                }
            }
        }
        z13 = z11;
        storyItem5 = h4Var.a;
        if (storyItem5 != null) {
            q9Var.O0 = storyItem5.id;
        }
        q9Var.n0.A();
        this.H2 = true;
        if (!this.l1) {
        }
        i1(false);
        TL_stories.StoryItem storyItem212 = h4Var.a;
        y6 y6Var102 = h4Var.b;
        if (storyItem212 == null) {
        }
        if (storyItem2 == null) {
        }
        if (i32 == i11) {
        }
        if (z59) {
        }
        g1Var = q9Var.A0;
        if (g1Var != null) {
        }
        z15 = false;
        j3Var = this.L0;
        n3Var = this.t0;
        f4Var = this.X0;
        if (y6Var4 != null) {
        }
        o2Var = this.K1;
        if (o2Var != null) {
        }
        z16 = h4Var.f;
        if (z16) {
        }
        lxVar.c();
        this.F0 = 0L;
        this.H0 = false;
        y6Var5 = h4Var.b;
        if (y6Var5 != null) {
        }
        bcVar = bc.w;
        if (bcVar != null) {
        }
        n3Var.J();
        o0();
        z15 = true;
        if (z15) {
        }
        f4Var.setOnSubtitleClick(null);
        TextView[] textViewArr22 = f4Var.c;
        this.z3 = 0;
        z18 = z59;
        i12 = 2;
        long j322 = this.k1;
        boolean z6122 = z60;
        z19 = h4Var.f;
        U0(j322, false, z19);
        y6Var6 = h4Var.b;
        if (y6Var6 != null) {
        }
        z20 = z15;
        imageReceiver3 = imageReceiver;
        j3Var2 = j3Var;
        n3Var2 = n3Var;
        f4Var2 = f4Var;
        charSequence2 = charSequence3;
        charSequence = charSequence2;
        z21 = z6122;
        if (charSequence == null) {
        }
        m3Var = this.o0;
        if (m3Var != null) {
        }
        m3Var2 = this.p0;
        if (m3Var2 != null) {
        }
        storyItem10 = h4Var.a;
        if (storyItem6 == storyItem10) {
        }
        h4Var.o();
        if (!h4Var.g) {
        }
        q9 q9Var522 = ((h9) c4Var).d;
        q9Var522.Y0 = false;
        q9Var522.V();
        z23 = h4Var.f;
        if (z23) {
        }
        if (z24 != this.p1) {
        }
        linearLayout = this.P1;
        if (linearLayout != null) {
        }
        z25 = this.L2;
        LinearLayout linearLayout222 = this.x0;
        if (z25) {
        }
        hVar = this.L1;
        if (hVar != null) {
        }
        aVar = this.G1;
        g2 g2Var22 = this.u0;
        if (aVar != null) {
        }
        n1Var = this.J1;
        if (n1Var != null) {
        }
        if (this.I1 != null) {
        }
        z34 = h4Var.f;
        if (z34) {
        }
        n3 n3Var322 = n3Var2;
        if (this.t1) {
        }
        n3Var322.setVisibility(8);
        storyItem11 = h4Var.a;
        if (storyItem11 != null) {
        }
        g2Var22.r(this.k1, null);
        g2Var22.setVisibility(8);
        j3Var2.invalidate();
        if (this.z1 != null) {
        }
        z35 = this.m1;
        a3 a3Var3222 = this.y0;
        ImageView imageView3222 = this.w0;
        a3 a3Var4222 = this.m0;
        if (z35) {
        }
        a3Var4222.requestLayout();
        q9Var.d1.append(this.k1, i7);
        if (this.t1) {
        }
        g2Var22.setLivePlayer(q9Var.A0);
        this.u1 = 0;
        if (q9Var.N0 != null) {
        }
        int i36222 = this.s1;
        this.v1 = i36222;
        int i37222 = this.j1;
        this.w1 = i37222;
        if (q9Var.Q0) {
        }
        l10 = h4Var.l();
        b4 b4Var222 = this.h0;
        if (l10) {
        }
        y6Var7 = h4Var.b;
        v8 v8Var222 = this.l0;
        if (y6Var7 == null) {
        }
        this.L3 = false;
        v8Var222.setTranslationX(b4Var222.getVisibility() != 0 ? -org.telegram.messenger.g0.L(44.0f) : 0.0f);
        if (z20) {
        }
        y6Var8 = h4Var.b;
        if (y6Var8 == null) {
        }
        if (this.S1 != null) {
        }
        this.g1.a(q9.C1, false);
        if (this.t1) {
        }
        if (this.l1) {
        }
        e4 e4Var222 = f4Var2.b;
        r6 r6Var3222 = q9Var.N0;
        e4Var222.setPadding(0, 0, (r6Var3222 != null || r6Var3222.g() == this.w1) ? 0 : org.telegram.messenger.g0.L(56.0f), 0);
        qp.s1(this.l2).T1().l(h4Var.a);
        if (!z9) {
        }
        m3Var3 = this.p0;
        if (m3Var3 == null) {
        }
        i19 = 0;
        if (qp.e1().getInt("taptostorysoundhint", 0) < i12) {
        }
        imageView = this.f0;
        if (imageView != null) {
        }
        imageView2 = this.g0;
        if (imageView2 == null) {
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g1 g1Var;
        int i11 = qs.v5;
        q9 q9Var = this.s0;
        boolean z9 = false;
        if (i7 == i11 || (i7 == qs.x5 && q9Var.N0 == objArr[0])) {
            c4 c4Var = this.z1;
            if (c4Var == null || !((h9) c4Var).d.G0) {
                if (this.t1) {
                    h1();
                    if (this.j1 == 0) {
                        if (this.n2) {
                            return;
                        }
                        this.n2 = true;
                        ((h9) this.z1).j();
                        return;
                    }
                    int i12 = this.s1;
                    ArrayList arrayList = this.e1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.f1;
                    if (i12 >= arrayList2.size() + size) {
                        this.s1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    d1(false);
                    if (this.l1 || this.m1) {
                        i1(true);
                    }
                }
                TL_stories.PeerStories peerStories = q9Var.P0;
                if (peerStories != null) {
                    this.B1.V(peerStories, true);
                } else {
                    long j3 = this.k1;
                    if (j3 != 0) {
                        z6 z6Var = this.B1;
                        TL_stories.PeerStories y10 = z6Var.y(j3);
                        if (y10 == null) {
                            y10 = z6Var.z(j3);
                            z9 = true;
                        }
                        z6Var.V(y10, z9);
                    }
                }
                org.telegram.ui.ActionBar.z0 z0Var = this.b1;
                if (z0Var != null) {
                    z0Var.animate().alpha((this.B1.M(this.k1) && this.x1.e && !iz.b()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == qs.m3) {
            d1(false);
            return;
        }
        if (i7 == qs.i4) {
            this.t0.b0.invalidate();
            return;
        }
        if (i7 == qs.D5) {
            p0(true);
            return;
        }
        if (i7 == qs.b3) {
            t6 o4 = qp.s1(this.l2).P1().o();
            if (o4 == null || !o4.a(this.l2, 1) || this.z1 == null) {
                return;
            }
            bi.w4 w4Var = new bi.w4(this, 1);
            Context W = org.telegram.messenger.g0.W(getContext());
            if (W == null) {
                W = LaunchActivity.G1;
            }
            ((h9) this.z1).h(new ug.i0(o4.b(), this.l2, W, w4Var, null));
            return;
        }
        if (i7 == qs.i3) {
            TL_account.RequirementToContact J2 = qp.s1(this.l2).J2(this.k1);
            boolean z10 = this.k1 >= 0 && !p10.i(this.l2).q() && (J2 instanceof TL_account.requirementToContactPremium);
            if (this.o1 == z10 && this.q1 == org.telegram.messenger.m5.k(J2)) {
                return;
            }
            this.o1 = z10;
            this.q1 = org.telegram.messenger.m5.k(J2);
            d1(false);
            p0(true);
            return;
        }
        if (i7 == qs.T) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.k1 == (-((TLRPC.ChatFull) obj).id)) {
                d1(false);
                return;
            }
            return;
        }
        if (i7 != qs.G2) {
            if (i7 == qs.F && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (q9Var == null || (g1Var = q9Var.A0) == null || g1Var.g() != longValue) {
            return;
        }
        d1(false);
        o2 o2Var = this.K1;
        if (o2Var != null) {
            o2Var.E(true);
            this.K1.R1(true);
            p0(true);
        }
        g2 g2Var = this.u0;
        if (g2Var != null) {
            g1 g1Var2 = g2Var.P;
            if (g2Var.H != (g1Var2 != null ? g1Var2.j() : 0L)) {
                g2Var.e.O(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        td tdVar;
        Canvas canvas2;
        org.telegram.ui.Components.h6 h6Var;
        org.telegram.ui.Components.h6 h6Var2;
        j1();
        if (this.m1 && (h6Var2 = this.z0) != null) {
            h6Var2.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        if (this.m1 && (h6Var = this.A0) != null) {
            h6Var.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z9 = this.d3;
        LinearLayout linearLayout = this.x0;
        a3 a3Var = this.m0;
        if (z9) {
            float measuredWidth = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int L = org.telegram.messenger.g0.L(24.0f);
            float f10 = L / 2.0f;
            float T1 = org.telegram.messenger.g0.T1(this.f3, measuredWidth - f10, wq.g.getInterpolation(this.e3));
            float T12 = org.telegram.messenger.g0.T1(this.g3, measuredHeight - f10, this.e3);
            int W1 = org.telegram.messenger.g0.W1(this.e3, this.h3, L);
            if (this.Y2) {
                org.telegram.ui.Components.h5 h5Var = this.X2;
                if (h5Var != null) {
                    float f11 = W1;
                    h5Var.setBounds((int) T1, (int) T12, (int) (T1 + f11), (int) (T12 + f11));
                    this.X2.draw(canvas);
                }
            } else {
                float f12 = W1;
                ImageReceiver imageReceiver = this.W2;
                imageReceiver.y0(T1, T12, f12, f12);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.Z2) {
            float measuredWidth2 = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int L2 = org.telegram.messenger.g0.L(120.0f);
            if (this.Y2) {
                ch.d dVar = this.V2;
                if (dVar != null) {
                    float f13 = L2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f13), (int) (measuredHeight2 - f13), (int) (measuredWidth2 + f13), (int) (measuredHeight2 + f13));
                    this.V2.b(canvas);
                    if (this.V2.c()) {
                        this.V2.d(this);
                        this.V2 = null;
                        this.Z2 = false;
                    }
                } else {
                    this.Z2 = false;
                }
            } else {
                float f14 = L2;
                float f15 = f14 / 2.0f;
                float f16 = measuredWidth2 - f15;
                float f17 = measuredHeight2 - f15;
                ImageReceiver imageReceiver2 = this.U2;
                imageReceiver2.y0(f16, f17, f14, f14);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.B() != null && imageReceiver2.B().A()) {
                    this.Z2 = false;
                }
            }
        }
        o2 o2Var = this.K1;
        if (o2Var != null) {
            td tdVar2 = o2Var.y1;
            td tdVar3 = o2Var.z1;
            if (o2Var.getAlpha() == 0.0f || (tdVar = o2Var.e1) == null || tdVar.getParent() == null || o2Var.e1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(o2Var.e1.getX() + tdVar2.getX() + tdVar3.getX() + o2Var.getX(), o2Var.e1.getY() + tdVar2.getY() + tdVar3.getY() + o2Var.getY());
            if (o2Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight(), (int) (o2Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            o2Var.e1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ri.f fVar;
        float L;
        if (view == this.M2) {
            canvas.save();
            canvas.clipRect(0.0f, this.M2.getY(), getMeasuredWidth(), this.M2.getY() + this.M2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        o2 o2Var = this.K1;
        Paint paint = this.W1;
        a3 a3Var = this.m0;
        g4 g4Var = this.g1;
        if (view == o2Var) {
            float f10 = this.Z1;
            h4 h4Var = this.x1;
            if (f10 > 0.0f && !h4Var.f) {
                g4Var.l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), g4Var.l);
            }
            RectF rectF = g4Var.h;
            RectF rectF2 = g4Var.i;
            RectF rectF3 = g4Var.j;
            rectF.set(this.K1.getX(), this.K1.getY() + this.K1.getAnimatedTop() + org.telegram.messenger.g0.L(1.33f), this.K1.getX() + this.K1.getMeasuredWidth(), this.K1.getY() + this.K1.getMeasuredHeight());
            float L2 = org.telegram.messenger.g0.L(40.0f);
            if (h4Var.f) {
                L = org.telegram.messenger.g0.L(46.0f);
                L2 = org.telegram.messenger.g0.L(46.0f);
                n1 n1Var = this.J1;
                if (n1Var != null && n1Var.getVisibility() == 0) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
            } else {
                if (this.B2) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (this.C2 && this.m1) {
                    L2 += org.telegram.messenger.g0.L(46.0f);
                }
                if (a3Var != null && a3Var.getVisibility() == 0) {
                    L2 = (L2 - org.telegram.messenger.g0.L(40.0f)) + a3Var.getLayoutParams().width;
                }
                L = 0.0f;
            }
            rectF2.set(org.telegram.messenger.g0.L(10.0f) + L, ((this.K1.getY() + this.K1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.messenger.g0.L(38.0f), (getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - L2, (this.K1.getY() + this.K1.getMeasuredHeight()) - org.telegram.messenger.g0.L(5.0f));
            this.K1.setTranslationX((1.0f - this.Z1) * L);
            this.K1.getEditField().setTranslationY(com.google.android.recaptcha.internal.a.z(1.0f, this.Z1, -org.telegram.messenger.g0.L(2.0f), this.K1.getMeasuredHeight() > org.telegram.messenger.g0.L(50.0f) ? ((1.0f - this.Z1) * (this.K1.getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f))) + 0.0f : 0.0f));
            float L3 = org.telegram.messenger.g0.L(50.0f) / 2.0f;
            org.telegram.messenger.g0.Z1(rectF2, g4Var.h, this.Z1, rectF3);
            fh.g gVar = this.U1;
            if (gVar != null) {
                gVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                gVar.r(L3);
                gVar.setAlpha((int) ((1.0f - this.N3) * (1.0f - this.a2) * 255.0f * getHideInterfaceAlpha()));
                gVar.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.Z1 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (o2Var != null && o2Var.t0(view)) {
                float L4 = org.telegram.messenger.g0.L(30.0f);
                RectF rectF4 = g4Var.k;
                RectF rectF5 = g4Var.k;
                rectF4.set(0.0f, view.getY() + org.telegram.messenger.g0.L(1.0f), getWidth(), org.telegram.messenger.g0.L(20.0f) + getHeight());
                Path path = this.K3;
                path.rewind();
                path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                fh.g gVar2 = this.V1;
                if (gVar2 != null) {
                    gVar2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    gVar2.s(L4, L4, L4, L4);
                    gVar2.setAlpha(qs.e4);
                    gVar2.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, L4, L4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.O1 || this.K1 == null) {
                if (view == this.a3) {
                    view.setTranslationY((this.x0.getY() + (a3Var.getY() + (-(r2.getMeasuredHeight() - this.a3.getPaddingBottom())))) - org.telegram.messenger.g0.L(18.0f));
                } else {
                    j3 j3Var = this.L0;
                    if (view == j3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.q3) != null && !fVar.r) {
                        RecordingCanvas i7 = fVar.i(getMeasuredWidth(), getMeasuredHeight());
                        i7.drawColor(i0.a.f(0.2f, -16777216, -1));
                        i7.translate(j3Var.getX(), j3Var.getY());
                        view.draw(i7);
                        fVar.j();
                    }
                }
            } else {
                view.setTranslationY(((this.K1.getY() + this.K1.getAnimatedTop()) + (-r2.getMeasuredHeight())) - org.telegram.messenger.g0.L(18.0f));
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
        String j3 = com.google.android.recaptcha.internal.a.j(max, "_", max);
        ArrayList arrayList11 = this.B3;
        arrayList11.clear();
        ArrayList arrayList12 = this.C3;
        arrayList12.clear();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.Q0;
            if (i16 >= arrayList.size()) {
                break;
            }
            ((ch.f0) arrayList.get(i16)).b(false);
            i16++;
        }
        arrayList.clear();
        int i17 = 0;
        while (i17 < 2) {
            int i18 = this.s1;
            if (i17 == 0) {
                i10 = i18 - 1;
                imageReceiver = this.O0;
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
                ArrayList arrayList13 = this.f1;
                isEmpty = arrayList13.isEmpty();
                arrayList2 = this.e1;
                if (isEmpty && i10 >= arrayList2.size()) {
                    T0((y6) arrayList13.get(i10 - arrayList2.size()), imageReceiver, j3);
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < 0) {
                        i10 = i15;
                    }
                    if (i10 >= arrayList2.size()) {
                        i10 = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList2.get(i10);
                    long j10 = this.k1;
                    storyItem2.dialogId = j10;
                    y6 t6 = this.B1.t(j10, storyItem2);
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
                        int i19 = (messageMedia == null || !ij.K4(messageMedia.getDocument())) ? i15 : 1;
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
                                imageReceiver.u0(hc.g(storyItem2.attachPath), rf.b.r(j3, "_pframe"), hc.g(storyItem2.firstFramePath), j3, null, null, null, 0L, null, null, 0);
                                storyItem = storyItem2;
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i11 = i17;
                                str2 = null;
                                i13 = 1;
                                String str4 = j3;
                                imageReceiver.r0(hc.g(storyItem2.attachPath), str4, null, null, null, 0L, null, null, 0);
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
                                hc b10 = hc.b(z6.C(this.l2, storyItem2));
                                String r10 = rf.b.r(j3, "_pframe");
                                hc c10 = hc.c(w10, storyItem2.media.getDocument());
                                storyItem = storyItem2;
                                str = null;
                                i12 = 1;
                                imageReceiver2.u0(b10, r10, c10, j3, null, null, null, 0L, null, storyItem, 0);
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
                                    imageReceiver2.u0(null, null, hc.i(w11, photo), j3, null, null, null, 0L, null, storyItem, 0);
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (((messageMedia3 == null || !ij.K4(messageMedia3.getDocument())) ? 0 : i12) != 0) {
                        TLRPC.Document C = z6.C(this.l2, storyItem);
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = org.telegram.messenger.w7.G(this.l2).F(storyItem);
                        }
                        try {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("?account=");
                            sb3.append(this.l2);
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
                                            org.telegram.messenger.w7.G(this.l2).W(C, storyItem, i12, i12);
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
                                ch.f0 f0Var = new ch.f0(this);
                                f0Var.e(ch.o0.d(tL_mediaAreaSuggestedReaction.reaction));
                                f0Var.b(this.J0);
                                arrayList10 = arrayList5;
                                arrayList10.add(f0Var);
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
                ImageReceiver imageReceiver3 = this.P0;
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
                    ArrayList arrayList132 = this.f1;
                    isEmpty = arrayList132.isEmpty();
                    arrayList2 = this.e1;
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
        h9 h9Var = (h9) this.z1;
        q9 q9Var = h9Var.d;
        if (iz.j() && iz.b()) {
            boolean z9 = q9Var.G0;
            ArrayList arrayList16 = q9Var.L0;
            if (z9) {
                return;
            }
            for (int i22 = 0; i22 < arrayList16.size(); i22++) {
                for (int i23 = 0; i23 < arrayList14.size(); i23++) {
                    if (((Uri) arrayList14.get(i23)).equals(((p9) arrayList16.get(i22)).uri)) {
                        arrayList14.remove(i23);
                    }
                }
            }
            for (int i24 = 0; i24 < arrayList14.size(); i24++) {
                Uri uri = (Uri) arrayList14.get(i24);
                p9 p9Var = new p9(q9Var, q9Var.C0, q9Var.B0);
                p9Var.setOnSeekUpdate(new z0(25, h9Var, p9Var));
                p9Var.uri = uri;
                TLRPC.Document document = (TLRPC.Document) arrayList15.get(i24);
                p9Var.document = document;
                if (document != null) {
                    i7 = 0;
                    org.telegram.messenger.s8.I.put(Long.valueOf(document.id), 0);
                } else {
                    i7 = 0;
                    ConcurrentHashMap concurrentHashMap = org.telegram.messenger.s8.H;
                }
                p9Var.preparePlayer(uri, q9.C1, q9.A1);
                arrayList16.add(p9Var);
                if (arrayList16.size() > 2) {
                    ((p9) arrayList16.remove(i7)).release(null);
                }
            }
        }
    }

    public final void f1() {
        if (this.p1) {
            TextView textView = this.Q1;
            if (textView != null) {
                textView.setText(id.M0(2131748823, null));
            }
            TextView textView2 = this.R1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.Q1;
        if (textView3 != null) {
            textView3.setText(id.M0(this.n1 ? 2131744665 : 2131744493, null));
        }
        TextView textView4 = this.R1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.R1.setText(id.M0(2131744492, null));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i7;
        ArrayList arrayList = this.i1;
        q9 q9Var = this.s0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i7 = 0;
            } else {
                i7 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j3 = ((y6) arrayList2.get(i10)).a;
                    if (((int) (j3 ^ (j3 >>> 32))) == q9Var.O0) {
                        this.s1 = i10;
                        return;
                    }
                }
            }
            int indexOf = this.i1.indexOf(Integer.valueOf(q9Var.O0));
            if (indexOf < 0 && !this.i1.isEmpty()) {
                if (q9Var.O0 > ((Integer) this.i1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (q9Var.O0 < ((Integer) jg.g.i(1, this.i1)).intValue()) {
                    indexOf = this.i1.size() - 1;
                }
            }
            this.s1 = i7 + indexOf;
        } else {
            int i11 = q9Var.d1.get(this.k1, -1);
            this.s1 = i11;
            if (i11 == -1 && !q9Var.M0 && (peerStories = this.d1) != null && peerStories.max_read_id > 0) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.e1;
                    if (i12 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i12)).id > this.d1.max_read_id) {
                        this.s1 = i12;
                        break;
                    }
                    i12++;
                }
            }
        }
        if (this.s1 == -1) {
            this.s1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.i1;
    }

    public long getCurrentPeer() {
        return this.k1;
    }

    public int getListPosition() {
        return this.u1;
    }

    public Bitmap getPlayingBitmap() {
        j3 j3Var = this.L0;
        Bitmap createBitmap = Bitmap.createBitmap(j3Var.getWidth(), j3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.s1;
    }

    public z6 getStoriesController() {
        return qp.s1(this.l2).P1();
    }

    public int getStoriesCount() {
        return Math.max(this.m2, this.e1.size()) + this.f1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.e1;
    }

    public final void h1() {
        r6 r6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.e1;
        arrayList.clear();
        q9 q9Var = this.s0;
        if (!q9Var.M0) {
            ArrayList arrayList2 = this.i1;
            int i7 = 0;
            ArrayList arrayList3 = this.f1;
            if (arrayList2 != null && (r6Var = q9Var.N0) != null) {
                if (r6Var instanceof k6) {
                    arrayList3.clear();
                    ArrayList F = qp.s1(this.l2).P1().F(this.k1);
                    String str = ((k6) q9Var.N0).E;
                    if (F != null) {
                        for (int i10 = 0; i10 < F.size(); i10++) {
                            y6 y6Var = (y6) F.get(i10);
                            fi.e7 e7Var = y6Var.c;
                            if (e7Var != null && !e7Var.g && TextUtils.equals(e7Var.K0, str)) {
                                arrayList3.add(y6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.i1;
                int size = arrayList4.size();
                while (i7 < size) {
                    Object obj = arrayList4.get(i7);
                    i7++;
                    ij f10 = q9Var.N0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (q9Var.N0 != null) {
                while (i7 < q9Var.N0.i.size()) {
                    arrayList.add(((ij) q9Var.N0.i.get(i7)).l);
                    i7++;
                }
            } else {
                TL_stories.PeerStories peerStories = q9Var.P0;
                if (peerStories == null || org.telegram.messenger.m5.o(peerStories.peer) != this.k1) {
                    TL_stories.PeerStories y10 = this.B1.y(this.k1);
                    this.d1 = y10;
                    if (y10 == null) {
                        this.d1 = this.B1.z(this.k1);
                    }
                } else {
                    this.d1 = q9Var.P0;
                }
                this.m2 = 0;
                TL_stories.PeerStories peerStories2 = this.d1;
                if (peerStories2 != null) {
                    this.m2 = peerStories2.stories.size();
                    arrayList.addAll(this.d1.stories);
                }
                arrayList3.clear();
                ArrayList F2 = this.B1.F(this.k1);
                if (F2 != null) {
                    arrayList3.addAll(F2);
                }
            }
        } else if (!q9Var.R0) {
            arrayList.add(q9Var.S0);
        }
        this.j1 = getStoriesCount();
    }

    public final void i0(boolean z9) {
        j4 currentPeerView;
        o40 o40Var = this.s2;
        if (o40Var != null) {
            o40Var.e0 = null;
            o40Var.a(false);
        }
        long j3 = this.k1;
        TL_stories.StoryItem storyItem = this.x1.a;
        q9 q9Var = this.s0;
        q9Var.getClass();
        if (j3 != 0 && storyItem != null) {
            q9.D1.remove(j3 + (j3 >> 16) + (storyItem.id << 16));
        }
        this.R2 = true;
        g9 g9Var = q9Var.n0;
        if (g9Var != null && (currentPeerView = g9Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z9) {
            bc J = new gc(this.L0, this.k0).J(R.raw.forward, id.M0(2131748483, null), id.M0(2131743552, null), 5000, false, new w1(this, 2));
            J.r = false;
            J.k(false);
        }
        qp.s1(this.l2).s0(this.k1, 0, null);
    }

    public final void i1(boolean z9) {
        int i7;
        int i10;
        h4 h4Var = this.x1;
        TL_stories.StoryItem storyItem = h4Var.a;
        if (storyItem == null) {
            storyItem = h4Var.c;
        }
        boolean z10 = this.m1;
        if (z10 || this.l1) {
            if (storyItem == null) {
                this.j2.setText("");
                this.o2.setVisibility(8);
                this.k2.setVisibility(8);
                return;
            }
            q9 q9Var = this.s0;
            a3 a3Var = this.m0;
            if (!z10) {
                int i11 = 3;
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.j2.setText(q9Var.N0 == null ? id.M0(2131748123, null) : id.M0(2131748122, null));
                    this.j2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    this.k2.setVisibility(8);
                    this.o2.setVisibility(8);
                } else {
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i12 >= storyItem.views.recent_viewers.size()) {
                            i7 = i11;
                            break;
                        }
                        TLObject e22 = qp.s1(this.l2).e2(storyItem.views.recent_viewers.get(i12).longValue());
                        if (e22 != null) {
                            this.k2.b(i13, this.l2, e22);
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
                        this.k2.b(i14, this.l2, null);
                    }
                    this.k2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.H(',', "Views", storyItem.views.views_count));
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
                    this.j2.setText(spannableStringBuilder);
                    if (i13 == 0) {
                        this.k2.setVisibility(8);
                        this.j2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                    } else {
                        this.k2.setVisibility(0);
                        this.j2.setTranslationX(org.telegram.messenger.g0.L(10.0f) + com.google.android.recaptcha.internal.a.e(i13, 1, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(13.0f)));
                    }
                    this.o2.setVisibility(0);
                }
                a3Var.getLayoutParams().width = org.telegram.messenger.g0.L(40.0f);
                this.x0.requestLayout();
                return;
            }
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2.views_count <= 0) {
                storyViews2.views_count = 1;
            }
            org.telegram.ui.Components.h6 h6Var = this.A0;
            if (h6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.E0 = false;
            } else {
                h6Var.t(Integer.toString(i10), z9 && this.E0, true);
                this.E0 = true;
            }
            int i15 = storyItem.views.reactions_count;
            if (i15 > 0) {
                this.z0.t(Integer.toString(i15), z9 && this.D0, true);
                this.D0 = true;
            } else {
                this.D0 = false;
            }
            if (!z9) {
                this.B0.e(true, this.D0 ? 1.0f : 0.0f);
                org.telegram.ui.Components.v5 v5Var = this.C0;
                if (v5Var != null) {
                    v5Var.e(true, this.E0 ? 1.0f : 0.0f);
                }
            }
            TLRPC.Chat M0 = qp.s1(this.l2).M0(Long.valueOf(-this.k1));
            if (!(this.n1 && (org.telegram.messenger.t3.q(M0) || org.telegram.messenger.t3.s0(M0))) && storyItem.views.views_count > 0) {
                this.j2.setText(q9Var.N0 == null ? id.M0(2131748123, null) : id.M0(2131748122, null));
                this.j2.setTranslationX(org.telegram.messenger.g0.L(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new wp(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.o0(storyItem.views.views_count, 0));
                this.j2.setText(spannableStringBuilder2);
            } else {
                this.j2.setText("");
            }
            a3Var.getLayoutParams().width = (int) (org.telegram.messenger.g0.L(40.0f) + (this.D0 ? this.z0.d + org.telegram.messenger.g0.L(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.F1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + a3Var.getLayoutParams().width;
            a3 a3Var2 = this.y0;
            if (a3Var2 != null) {
                a3Var2.getLayoutParams().width = (int) (org.telegram.messenger.g0.L(40.0f) + (this.E0 ? org.telegram.messenger.g0.L(4.0f) + this.A0.d : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.F1.getLayoutParams()).rightMargin += a3Var2.getLayoutParams().width;
                a3Var2.requestLayout();
            }
            this.F1.requestLayout();
            a3Var.requestLayout();
            this.k2.setVisibility(8);
            this.o2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = h4Var.a;
            f3 f3Var = this.S0;
            if (storyItem2 == null) {
                f3Var.getClass();
                return;
            }
            for (int i16 = 0; i16 < f3Var.getChildCount(); i16++) {
                if (f3Var.getChildAt(i16) instanceof x8) {
                    ((x8) f3Var.getChildAt(i16)).c(storyItem2.views, z9);
                }
            }
        }
    }

    public final void j0() {
        e7 e7Var = this.n0;
        e7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new l2(0, e7Var)).setDuration(150L).start();
        int L = org.telegram.messenger.g0.L(8.0f);
        e7 e7Var2 = new e7(getContext(), this.g1);
        this.n0 = e7Var2;
        e7Var2.setPadding(L, L, L, L);
        this.n0.setAlpha(0.0f);
        this.n0.setScaleX(0.8f);
        this.n0.setScaleY(0.8f);
        this.n0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.m0.addView(this.n0, ha.e(40, 40, 3));
        this.Z2 = false;
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
        throw new UnsupportedOperationException("Method not decompiled: di.j4.j1():void");
    }

    public final void k0(boolean z9) {
        ValueAnimator valueAnimator = this.M3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N3, z9 ? 1.0f : 0.0f);
        this.M3 = ofFloat;
        ofFloat.addUpdateListener(new x1(this, 2));
        this.M3.addListener(new j2(this, z9, 1));
        this.M3.setDuration(420L);
        this.M3.setInterpolator(wq.h);
        this.M3.start();
    }

    public final void l0(Runnable runnable) {
        if (qp.s1(this.l2).v2()) {
            org.telegram.ui.b.b(this.l2);
            return;
        }
        int i7 = iz.e0;
        if (i7 <= 0 || !this.T2) {
            runnable.run();
            return;
        }
        int i10 = i7 - 1;
        iz.e0 = i10;
        iz.T(i10);
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(0, getContext(), this.k0);
        u1Var.setTitle(id.M0(2131744885, null));
        u1Var.n(id.M0(2131744886, null));
        String M0 = id.M0(2131746743, null);
        ba.b bVar = new ba.b(runnable);
        u1Var.l0 = M0;
        u1Var.m0 = bVar;
        String M02 = id.M0(2131752589, null);
        a1 a1Var = new a1(1);
        u1Var.n0 = M02;
        u1Var.o0 = a1Var;
        u1Var.show();
    }

    public final void m0(int i7) {
        this.n2 = false;
        this.E2 = true;
        this.k3 = false;
        this.m1 = false;
        this.n1 = false;
        long j3 = this.k1;
        f4 f4Var = this.X0;
        org.telegram.ui.Components.v8 v8Var = this.W0;
        if (j3 >= 0) {
            this.l1 = j3 == p10.i(this.l2).e();
            TLRPC.User a22 = qp.s1(this.l2).a2(Long.valueOf(this.k1));
            TL_account.RequirementToContact J2 = qp.s1(this.l2).J2(this.k1);
            this.o1 = !p10.i(this.l2).q() && (J2 instanceof TL_account.requirementToContactPremium);
            this.q1 = org.telegram.messenger.m5.k(J2);
            v8Var.r(a22);
            f4Var.a.getImageReceiver().i0(a22, v8Var, null);
            U0(this.k1, true, false);
        } else {
            this.l1 = false;
            this.m1 = true;
            if (this.B1.h(j3)) {
                this.k3 = true;
            } else {
                boolean z9 = org.telegram.messenger.r2.a;
            }
            TLRPC.Chat M0 = qp.s1(this.l2).M0(Long.valueOf(-this.k1));
            boolean V = org.telegram.messenger.t3.V(M0);
            this.n1 = !V;
            if (!V && qp.s1(this.l2).N0(-this.k1) == null) {
                yr.a0(this.l2).F0(-this.k1, true, new CountDownLatch(1), false, false, 0);
            }
            this.o1 = this.n1 && !org.telegram.messenger.t3.q(M0);
            this.q1 = qp.s1(this.l2).N1(this.k1);
            v8Var.q(M0);
            f4Var.a.getImageReceiver().i0(M0, v8Var, null);
            U0(this.k1, true, false);
        }
        if (this.t1 && (this.l1 || this.m1)) {
            z6 z6Var = this.B1;
            long j10 = this.k1;
            a0.h hVar = z6Var.m;
            z9 z9Var = (z9) hVar.f(j10);
            if (z9Var == null) {
                z9Var = new z9(z6Var.a, j10, z6Var);
                hVar.k(z9Var, j10);
            }
            z9Var.b(true);
        }
        h1();
        this.s1 = i7;
        if (i7 < 0) {
            this.s1 = 0;
        }
        this.F0 = 0L;
        this.H0 = false;
        this.s3 = null;
        this.t3 = null;
        boolean z10 = this.m1;
        j3 j3Var = this.L0;
        q9 q9Var = this.s0;
        int i10 = 8;
        h4 h4Var = this.x1;
        if (z10) {
            z0();
            if (this.K1 == null && (this.n1 || h4Var.f)) {
                t0();
            }
            if (this.K1 != null) {
                TLRPC.Chat M02 = qp.s1(this.l2).M0(Long.valueOf(-this.k1));
                o2 o2Var = this.K1;
                if (h4Var.f || (!G0() && this.n1 && (org.telegram.messenger.t3.q(M02) || org.telegram.messenger.t3.s0(M02)))) {
                    i10 = 0;
                }
                o2Var.setVisibility(i10);
                o2 o2Var2 = this.K1;
                boolean z11 = h4Var.f;
                B0(true);
                o2Var2.i1(z11);
                this.K1.o1(h4Var.f && !B0(true) && (this.e2 || this.K1.W0), true);
                ys editField = this.K1.getEditField();
                long j11 = this.k1;
                TL_stories.StoryItem storyItem = h4Var.a;
                q9Var.getClass();
                editField.setText(q9.A(j11, storyItem));
                this.K1.b1(this.l2, this.k1);
                this.K1.M1(M02, null);
            }
            org.telegram.ui.Components.h6 h6Var = this.z0;
            org.telegram.ui.ActionBar.h6 h6Var2 = this.k0;
            if (h6Var == null) {
                org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(false, false, false);
                this.z0 = h6Var3;
                a3 a3Var = this.m0;
                h6Var3.setCallback(a3Var);
                this.z0.u(h6Var2.h(org.telegram.ui.ActionBar.m6.G6));
                this.z0.w(org.telegram.messenger.g0.L(14.0f));
                this.B0 = new org.telegram.ui.Components.v5(a3Var);
            }
            a3 a3Var2 = this.y0;
            if (a3Var2 != null && this.A0 == null) {
                org.telegram.ui.Components.h6 h6Var4 = new org.telegram.ui.Components.h6(false, false, false);
                this.A0 = h6Var4;
                h6Var4.setCallback(a3Var2);
                this.A0.u(h6Var2.h(org.telegram.ui.ActionBar.m6.G6));
                this.A0.w(org.telegram.messenger.g0.L(14.0f));
                this.C0 = new org.telegram.ui.Components.v5(a3Var2);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            this.j1 = getStoriesCount();
            j3Var.invalidate();
            invalidate();
        } else if (this.l1) {
            z0();
            if (h4Var.f) {
                this.F1.setVisibility(8);
                if (this.K1 == null) {
                    t0();
                }
                this.K1.setVisibility(0);
            } else {
                this.F1.setVisibility(0);
                o2 o2Var3 = this.K1;
                if (o2Var3 != null) {
                    o2Var3.setVisibility(8);
                }
            }
            o2 o2Var4 = this.K1;
            if (o2Var4 != null) {
                boolean z12 = h4Var.f;
                B0(true);
                o2Var4.i1(z12);
                this.K1.o1(h4Var.f && !B0(true) && (this.e2 || this.K1.W0), true);
            }
            if (i7 == -1) {
                ArrayList arrayList = this.i1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(q9Var.O0));
                    if (indexOf < 0 && !this.i1.isEmpty()) {
                        if (q9Var.O0 > ((Integer) this.i1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (q9Var.O0 < ((Integer) jg.g.i(1, this.i1)).intValue()) {
                            indexOf = this.i1.size() - 1;
                        }
                    }
                    this.s1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f1.isEmpty();
                    ArrayList arrayList2 = this.e1;
                    if (isEmpty) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i11)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i11)).id > this.B1.f.get(this.k1)) {
                                this.s1 = i11;
                                break;
                            }
                        }
                    } else {
                        this.s1 = arrayList2.size();
                    }
                }
            }
            d1(false);
            j3Var.invalidate();
            invalidate();
        } else {
            if (this.K1 == null) {
                t0();
            }
            if (this.o1 && this.P1 == null) {
                x0();
            }
            if (this.P1 != null) {
                if (this.o1 || this.p1) {
                    f1();
                }
                this.P1.setVisibility(((!this.o1 || h4Var.f) && !this.p1) ? 8 : 0);
            }
            o8 o8Var = this.S1;
            if (o8Var != null) {
                o8Var.setVisibility(8);
            }
            if (i7 == -1) {
                g1();
            }
            d1(false);
            o2 o2Var5 = this.K1;
            if (o2Var5 != null) {
                o2Var5.setVisibility((G0() || t10.A(this.k1)) ? 8 : 0);
                o2 o2Var6 = this.K1;
                boolean z13 = h4Var.f;
                B0(true);
                o2Var6.i1(z13);
                this.K1.o1(h4Var.f && !B0(true) && (this.e2 || this.K1.W0), true);
                ys editField2 = this.K1.getEditField();
                long j12 = this.k1;
                TL_stories.StoryItem storyItem2 = h4Var.a;
                q9Var.getClass();
                editField2.setText(q9.A(j12, storyItem2));
                this.K1.b1(this.l2, this.k1);
                TLRPC.UserFull b22 = qp.s1(this.l2).b2(this.k1);
                if (b22 != null) {
                    this.K1.M1(null, b22);
                } else {
                    qp.s1(this.l2).W2(qp.s1(this.l2).a2(Long.valueOf(this.k1)), this.i2, false, null);
                }
            }
            this.j1 = getStoriesCount();
            a3 a3Var3 = this.F1;
            if (a3Var3 != null) {
                a3Var3.setVisibility(8);
            }
            j3Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        n3 n3Var = this.t0;
        if (n3Var.W.x()) {
            n3Var.W.f(false);
        }
    }

    public final void o0() {
        if (this.t1) {
            ((h9) this.z1).d.V();
        }
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J0 = true;
        this.N0.P();
        this.P0.P();
        this.O0.P();
        this.U2.P();
        this.W2.P();
        o2 o2Var = this.K1;
        if (o2Var != null) {
            o2Var.E0();
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q0;
            if (i7 >= arrayList.size()) {
                qs.f(this.l2).c(this, qs.T);
                qs.f(this.l2).c(this, qs.G2);
                qs.f(this.l2).c(this, qs.v5);
                qs.f(this.l2).c(this, qs.m3);
                qs.f(this.l2).c(this, qs.x5);
                qs.f(this.l2).c(this, qs.D5);
                qs.f(this.l2).c(this, qs.b3);
                qs.f(this.l2).c(this, qs.i3);
                qs.f(this.l2).c(this, qs.F);
                qs.e().c(this, qs.i4);
                return;
            }
            ((ch.f0) arrayList.get(i7)).b(true);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J0 = false;
        this.N0.R();
        this.P0.R();
        this.O0.R();
        this.U2.R();
        this.W2.R();
        o2 o2Var = this.K1;
        if (o2Var != null) {
            o2Var.D0();
        }
        org.telegram.ui.Components.h5 h5Var = this.X2;
        if (h5Var != null) {
            h5Var.n(this);
            this.X2 = null;
        }
        ch.d dVar = this.V2;
        if (dVar != null) {
            dVar.d(this);
            this.V2 = null;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q0;
            if (i7 >= arrayList.size()) {
                qs.f(this.l2).n(this, qs.T);
                qs.f(this.l2).n(this, qs.G2);
                qs.f(this.l2).n(this, qs.v5);
                qs.f(this.l2).n(this, qs.m3);
                qs.f(this.l2).n(this, qs.x5);
                qs.f(this.l2).n(this, qs.D5);
                qs.f(this.l2).n(this, qs.b3);
                qs.f(this.l2).n(this, qs.i3);
                qs.f(this.l2).n(this, qs.F);
                qs.e().n(this, qs.i4);
                return;
            }
            ((ch.f0) arrayList.get(i7)).b(false);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.g1.d.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(72.0f));
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
    public final void onMeasure(int i7, int i10) {
        float f10;
        char c10;
        o40 o40Var;
        boolean z9;
        float L;
        FrameLayout.LayoutParams layoutParams;
        ii0 ii0Var;
        q2 q2Var;
        q9 q9Var = this.s0;
        if (q9Var.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        }
        int i11 = 0;
        if (this.t1 && this.I2 == null) {
            this.h2 = ((h9) this.z1).d.p0;
        } else {
            this.h2 = 0;
        }
        int size = q9Var.b ? View.MeasureSpec.getSize(i10) : View.MeasureSpec.getSize(i10) + this.h2;
        int size2 = (int) ((View.MeasureSpec.getSize(i7) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.h2 < org.telegram.messenger.g0.L(20.0f)) {
            this.h2 = 0;
        }
        int i12 = this.h2;
        ii0 ii0Var2 = this.a3;
        if (ii0Var2 == null || ii0Var2.getReactionsWindow() == null || this.a3.getReactionsWindow().q) {
            o2 o2Var = this.K1;
            if (o2Var != null && (o2Var.s0() || this.K1.k3)) {
                if (this.K1.getEmojiView().getMeasuredHeight() == 0) {
                    i12 = this.K1.getEmojiPadding();
                } else {
                    o2 o2Var2 = this.K1;
                    if (o2Var2.z3) {
                        o2Var2.G();
                        i12 = this.K1.getStickersExpandedHeight();
                    } else {
                        i12 = o2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.a3.getReactionsWindow().c.animate().translationY(-this.h2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
            i12 = 0;
        }
        boolean z10 = this.e2;
        int i13 = this.X1;
        f4 f4Var = this.X0;
        int i14 = 1;
        if (i13 != i12) {
            this.e2 = false;
            int i15 = 3;
            h4 h4Var = this.x1;
            f10 = 8.0f;
            if (i12 <= 0 || !this.t1) {
                o2 o2Var3 = this.K1;
                if (o2Var3 != null) {
                    q9.P(this.k1, h4Var.a, o2Var3.getEditText());
                }
            } else {
                this.e2 = true;
                this.R2 = false;
                this.c2 = i12;
                if (this.O1 == null) {
                    ii0 ii0Var3 = new ii0(1, this.l2, getContext(), LaunchActivity.Q(), new m2(i15, this.k0));
                    this.O1 = ii0Var3;
                    ii0Var3.setHint(id.M0(this.n1 ? 2131744666 : 2131744503, null));
                    ii0 ii0Var4 = this.O1;
                    ii0Var4.N0 = true;
                    addView(ii0Var4, this.r0, ha.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.O1.setDelegate(new e3(this));
                    this.O1.p(null, null, true);
                }
                this.O1.setFragment(LaunchActivity.Q());
                this.O1.setHint(id.M0(this.n1 ? 2131744666 : 2131744503, null));
                ch.k0 k0Var = ch.k0.B;
                if (k0Var != null) {
                    k0Var.l = true;
                }
                ch.k0 k0Var2 = ch.k0.C;
                if (k0Var2 != null) {
                    k0Var2.l = true;
                }
            }
            o2 o2Var4 = this.K1;
            if (o2Var4 != null) {
                o2Var4.o1(h4Var.f && !B0(true) && this.e2, true);
            }
            if (this.e2 && (q2Var = this.M2) != null) {
                q2Var.setVisibility(0);
            }
            if (!this.e2 && (ii0Var = this.O1) != null) {
                ii0Var.n();
            }
            f4Var.setEnabled(!this.e2);
            if (this.K1 != null) {
                org.telegram.messenger.g0.Z3(null, !this.e2, 0.1f, true, true);
            }
            if (this.t1 && this.e2) {
                q9 q9Var2 = ((h9) this.z1).d;
                if (!q9Var2.y) {
                    q9Var2.y = true;
                    q9Var2.V();
                }
            }
            this.X1 = i12;
            ValueAnimator valueAnimator = this.Y1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.w2.d();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.q2, i12);
            this.Y1 = ofFloat;
            ofFloat.addUpdateListener(new x1(this, i11));
            this.Y1.addListener(new k2(this, i14));
            if (this.e2) {
                this.Y1.setDuration(250L);
                this.Y1.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                q9Var.m();
            } else {
                this.Y1.setDuration(500L);
                this.Y1.setInterpolator(wq.h);
            }
            this.Y1.start();
            boolean z11 = this.e2;
            if (z11 != z10) {
                if (z11) {
                    a8.b8 b8Var = this.y1;
                    Canvas canvas = (Canvas) b8Var.b;
                    Bitmap bitmap = (Bitmap) b8Var.c;
                    C0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (org.telegram.messenger.g0.B(org.telegram.messenger.g0.J0(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.a.o(-1, qs.n1));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (h4Var.f) {
                        fi.m3 m3Var = this.M1;
                        if (m3Var != null) {
                            if (!m3Var.V) {
                                removeView(m3Var);
                            }
                        }
                        if (!B0(true) && qp.e1().getInt("taptostoryhighlighthint", 0) < 3) {
                            qp.e1().edit().putInt("taptostoryhighlighthint", qp.e1().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            fi.m3 m3Var2 = new fi.m3(getContext(), 3);
                            this.M1 = m3Var2;
                            m3Var2.u(id.M0(2131748813, null));
                            this.M1.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            fi.m3 m3Var3 = this.M1;
                            m3Var3.K = Layout.Alignment.ALIGN_OPPOSITE;
                            m3Var3.q0 = new z0(2, this, m3Var2);
                            addView(m3Var3, ha.e(-1, 100, 87));
                            this.M1.w();
                            j1();
                        }
                    }
                } else {
                    o2 o2Var5 = this.K1;
                    if (o2Var5 != null) {
                        o2Var5.getEditField().clearFocus();
                    }
                    fi.m3 m3Var4 = this.M1;
                    if (m3Var4 != null) {
                        m3Var4.f(true);
                    }
                }
                this.d2 = true;
            } else {
                this.d2 = false;
            }
        } else {
            f10 = 8.0f;
        }
        o2 o2Var6 = this.K1;
        if (o2Var6 != null && o2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.K1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        j3 j3Var = this.L0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j3Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z12 = size - size2 > org.telegram.messenger.g0.L(64.0f);
        this.g2 = z12;
        int L2 = (size - ((z12 ? org.telegram.messenger.g0.L(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = L2;
        if (this.g2) {
            this.t2 = (((-L2) + size) - size2) - org.telegram.messenger.g0.L(64.0f);
        } else {
            this.t2 = ((-L2) + size) - size2;
        }
        if (this.g2 != this.f2) {
            j3Var.setLayoutParams(layoutParams2);
        }
        a3 a3Var = this.F1;
        if (a3Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) a3Var.getLayoutParams();
            if (this.g2) {
                layoutParams3.topMargin = org.telegram.messenger.g0.L(f10) + L2 + size2;
            } else {
                layoutParams3.topMargin = (L2 + size2) - org.telegram.messenger.g0.L(48.0f);
            }
        }
        md mdVar = this.K2;
        if (mdVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) mdVar.getLayoutParams();
            if (this.g2) {
                c10 = 0;
                this.K2.setTextColor(i0.a.f(0.5f, -16777216, -1));
                layoutParams4.topMargin = org.telegram.messenger.g0.L(12.0f) + L2 + size2;
                o40Var = this.s2;
                if (o40Var != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) o40Var.getLayoutParams();
                    if (i12 == 0) {
                        layoutParams5.bottomMargin = org.telegram.messenger.k5.B(64.0f, L2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = org.telegram.messenger.g0.L(64.0f) + i12;
                    }
                }
                z9 = this.g2;
                LinearLayout linearLayout = this.x0;
                n3 n3Var = this.t0;
                if (z9) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((L2 + size2) - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(40.0f);
                    int L3 = this.l1 ? org.telegram.messenger.g0.L(40.0f) : org.telegram.messenger.g0.L(56.0f);
                    ((FrameLayout.LayoutParams) n3Var.getLayoutParams()).bottomMargin = L3;
                    if (this.f2 != this.g2) {
                        n3Var.setLayoutParams((FrameLayout.LayoutParams) n3Var.getLayoutParams());
                    }
                    n3Var.u0 = L3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f) + L2 + size2;
                    ((FrameLayout.LayoutParams) n3Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(f10);
                    if (this.f2 != this.g2) {
                        n3Var.setLayoutParams((FrameLayout.LayoutParams) n3Var.getLayoutParams());
                    }
                    n3Var.u0 = org.telegram.messenger.g0.L(f10);
                }
                this.E2 = true;
                L = org.telegram.messenger.g0.L(48.0f);
                if (this.l0.getVisibility() == 0) {
                    L += org.telegram.messenger.g0.L(60.0f);
                }
                if (this.h0.getVisibility() == 0) {
                    L += org.telegram.messenger.g0.L(40.0f);
                }
                e4 e4Var = f4Var.b;
                TextView[] textViewArr = f4Var.c;
                layoutParams = (FrameLayout.LayoutParams) e4Var.getLayoutParams();
                if (layoutParams.rightMargin != L) {
                    int i16 = (int) L;
                    layoutParams.rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i16;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i16;
                    f4Var.forceLayout();
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.f2 = this.g2;
            }
            this.K2.setTextColor(i0.a.o(-1, qs.V2));
            layoutParams4.topMargin = ((L2 + size2) - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(40.0f);
        }
        c10 = 0;
        o40Var = this.s2;
        if (o40Var != null) {
        }
        z9 = this.g2;
        LinearLayout linearLayout2 = this.x0;
        n3 n3Var2 = this.t0;
        if (z9) {
        }
        this.E2 = true;
        L = org.telegram.messenger.g0.L(48.0f);
        if (this.l0.getVisibility() == 0) {
        }
        if (this.h0.getVisibility() == 0) {
        }
        e4 e4Var2 = f4Var.b;
        TextView[] textViewArr2 = f4Var.c;
        layoutParams = (FrameLayout.LayoutParams) e4Var2.getLayoutParams();
        if (layoutParams.rightMargin != L) {
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.f2 = this.g2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.Z1 = -1.0f;
        this.E2 = true;
        invalidate();
    }

    public final void p0(boolean z9) {
        if (this.K1 != null && this.O2 && this.J0) {
            w1 w1Var = this.y3;
            org.telegram.messenger.g0.r(w1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.B1.B;
            this.K1.E(true);
            boolean z10 = this.o1;
            h4 h4Var = this.x1;
            if ((z10 && !h4Var.f) || this.p1) {
                this.T2 = false;
                this.K1.setEnabled(false);
                this.K1.j1(" ", z9);
                return;
            }
            if (this.q1 > 0) {
                this.T2 = false;
                this.K1.setEnabled(true);
                this.K1.j1(dd.T0(id.a0(null, null, 2131743926, id.E(this.q1, ','))), z9);
                return;
            }
            if (!h4Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.l2).getCurrentTime();
                int i7 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i7) {
                    this.T2 = true;
                    int currentTime2 = i7 - ConnectionsManager.getInstance(this.l2).getCurrentTime();
                    int i10 = currentTime2 / 60;
                    int i11 = currentTime2 % 60;
                    Locale locale = Locale.US;
                    int measureText = (int) this.K1.getEditField().getPaint().measureText(id.a0(null, null, 2131744888, String.format(locale, "%02d:%02d", 99, 99)));
                    this.K1.setEnabled(true);
                    if (measureText * 1.2f >= this.K1.getEditField().getMeasuredWidth()) {
                        o2 o2Var = this.K1;
                        String a02 = id.a0(null, null, 2131744888, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11));
                        o2Var.e = a02;
                        o2Var.f = format;
                        o2Var.I1(z9);
                    } else {
                        this.K1.j1(id.a0(null, null, 2131744889, String.format(locale, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11))), z9);
                    }
                    org.telegram.messenger.g0.i3(w1Var, 1000L);
                    return;
                }
            }
            this.T2 = false;
            this.K1.setEnabled(true);
            if (!h4Var.f) {
                this.K1.j1(id.M0(this.n1 ? 2131746250 : 2131746255, null), z9);
                return;
            }
            if (this.K1.getStarsPrice() <= 0) {
                this.K1.j1(id.M0(2131752005, null), z9);
                return;
            }
            this.K1.j1(dd.Y0(false, id.a0(null, null, 2131752004, id.E((int) r0, ',')), this.K1.O4), z9);
            wp wpVar = this.K1.O4[0];
            if (wpVar != null) {
                wpVar.G = 0.9f;
            }
        }
    }

    public final boolean q0() {
        int i7 = 0;
        if (this.b3) {
            if (this.a3.getReactionsWindow() == null) {
                Z0(false);
                return true;
            }
            if (this.h2 > 0) {
                org.telegram.messenger.g0.v1(this.a3.getReactionsWindow().c);
                return true;
            }
            this.a3.getReactionsWindow().d();
            return true;
        }
        f3 f3Var = this.S0;
        if (f3Var != null) {
            fi.m3 m3Var = f3Var.c;
            if (m3Var != null) {
                m3Var.f(true);
                f3Var.c = null;
            }
            f3Var.b = null;
            f3Var.invalidate();
            f3Var.b(false);
        }
        n3 n3Var = this.t0;
        if (n3Var.W.x()) {
            n3Var.W.f(false);
            return true;
        }
        fi.m3 m3Var2 = this.o0;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
        fi.m3 m3Var3 = this.p0;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        y20 y20Var = this.F2;
        if (y20Var != null) {
            y20Var.a();
        }
        a4 a4Var = this.c1;
        if (a4Var != null && a4Var.a) {
            a4Var.a();
            return true;
        }
        o2 o2Var = this.K1;
        if (o2Var != null && o2Var.u0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.k0);
            boolean z9 = this.K1.c1;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            if (z9) {
                u1Var.R = id.M0(2131751395, null);
                u1Var.T = id.M0(2131751396, null);
            } else {
                u1Var.R = id.M0(2131751392, null);
                u1Var.T = id.M0(2131751393, null);
            }
            alertDialog$Builder.k(id.M0(2131751394, null), new s1(this, i7));
            alertDialog$Builder.h(id.M0(2131751771, null), null);
            ((h9) this.z1).h(u1Var);
            return true;
        }
        ii0 ii0Var = this.O1;
        if (ii0Var != null && ii0Var.getReactionsWindow() != null && !this.O1.getReactionsWindow().q) {
            this.O1.getReactionsWindow().d();
            return true;
        }
        o2 o2Var2 = this.K1;
        if (o2Var2 != null && o2Var2.s0()) {
            if (this.h2 > 0) {
                org.telegram.messenger.g0.v1(this.K1.getEmojiView());
                return true;
            }
            this.K1.j0();
            return true;
        }
        if (getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
            if (n3Var.getVisibility() != 0 || n3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            n3Var.D();
            this.P2 = false;
            this.L0.invalidate();
            return true;
        }
        o2 o2Var3 = this.K1;
        if (o2Var3 != null) {
            long j3 = this.k1;
            TL_stories.StoryItem storyItem = this.x1.a;
            Editable editText = o2Var3.getEditText();
            this.s0.getClass();
            q9.P(j3, storyItem, editText);
        }
        org.telegram.messenger.g0.v1(this.K1);
        return true;
    }

    public final void r0() {
        if (this.r2 == null) {
            u2 u2Var = new u2(this, getContext(), this.k0);
            this.r2 = u2Var;
            u2Var.W3 = new v2(this);
            u2Var.d2.i0();
            u2 u2Var2 = this.r2;
            u2Var2.Q1 = true;
            u2Var2.e1();
            u2 u2Var3 = this.r2;
            u2Var3.R1 = new w2(this);
            u2Var3.a1().setText(this.K1.getFieldText());
        }
    }

    public final void s0() {
        if (this.G1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.r3);
        this.G1 = aVar;
        aVar.setOnClickListener(new y1(this, 1));
        addView(this.G1, ha.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public void setAccount(int i7) {
        this.l2 = i7;
        this.B1 = qp.s1(i7).h0;
        this.T0.b = i7;
        ii0 ii0Var = this.O1;
        if (ii0Var != null) {
            ii0Var.setCurrentAccount(i7);
            this.O1.p(null, null, true);
        }
        ii0 ii0Var2 = this.a3;
        if (ii0Var2 != null) {
            ii0Var2.setCurrentAccount(i7);
        }
    }

    public void setActive(boolean z9) {
        R0(0L, z9);
    }

    public void setDelegate(c4 c4Var) {
        this.z1 = c4Var;
    }

    public void setIsVisible(boolean z9) {
        if (this.O2 == z9) {
            return;
        }
        this.O2 = z9;
        if (z9) {
            this.N0.h1 = 1.0f;
            p0(false);
        }
    }

    public void setLongpressed(boolean z9) {
        if (this.t1) {
            this.u2 = z9;
            invalidate();
        }
    }

    public void setOffset(float f10) {
        boolean z9 = f10 == 0.0f;
        if (this.K0 != z9) {
            this.K0 = z9;
            this.L0.invalidate();
            if (this.t1 && this.s0.a && Build.VERSION.SDK_INT < 33) {
                ra raVar = this.F3;
                if (z9) {
                    org.telegram.messenger.g0.r(raVar);
                    org.telegram.messenger.g0.i3(raVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(raVar);
                    q9 q9Var = ((h9) this.z1).d;
                    q9Var.k1 = true;
                    q9Var.V();
                }
            }
        }
    }

    public void setPaused(boolean z9) {
        if (this.A1 != z9) {
            this.A1 = z9;
            z2 z2Var = this.N0;
            if (z9) {
                z2Var.Q0();
                z2Var.t0 = false;
            } else {
                z2Var.P0(false);
                z2Var.t0 = true;
            }
            this.G0 = 0L;
            this.L0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.h6 h6Var = this.k0;
        o2 o2Var = new o2(this, org.telegram.messenger.g0.W(getContext()), this, new m2(1, h6Var));
        this.K1 = o2Var;
        ys editField = o2Var.getEditField();
        editField.getClass();
        org.telegram.ui.Components.qs qsVar = new org.telegram.ui.Components.qs(editField, 0);
        editField.t0 = qsVar;
        qsVar.q(true);
        editField.t0.u(editField.x0);
        editField.t0.w(editField.getPaint().getTextSize());
        org.telegram.ui.Components.qs qsVar2 = new org.telegram.ui.Components.qs(editField, 1);
        editField.u0 = qsVar2;
        qsVar2.b = 5;
        qsVar2.u(editField.x0);
        editField.u0.w(editField.getPaint().getTextSize());
        this.K1.getEditField().setScaleX(0.0f);
        this.K1.setOverrideKeyboardAnimation(true);
        this.K1.setClipChildren(false);
        this.K1.setDelegate(new p2(this));
        setDelegate(this.K1);
        o2 o2Var2 = this.K1;
        o2Var2.y4 = false;
        o2Var2.z4 = true;
        if (this.x1.f) {
            o2Var2.V0(false, false, false);
        } else {
            o2Var2.V0(true, true, false);
        }
        this.K1.updateColors();
        o2 o2Var3 = this.K1;
        o2Var3.A4 = true;
        addView(o2Var3, ha.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.x3 != null) {
            this.K1.R1(false);
        }
        this.K1.G2 = this.i2;
        i4 i4Var = this.v2;
        ((ArrayList) i4Var.g).add(this.L0);
        ((ArrayList) i4Var.g).add(this);
        if (this.J0) {
            this.K1.E0();
        }
        p0(false);
        if (G0()) {
            this.K1.setVisibility(8);
        }
        lh.h hVar = new lh.h(getContext(), h6Var, this.r3, this.o3);
        this.L1 = hVar;
        hVar.setOnClickListener(new s1(this, 1));
        addView(this.L1, ha.e(57, qs.X4, 85));
        this.L1.setVisibility(8);
        this.K1.setSideButtonsForAttach(this.L1);
        this.r0 = getChildCount();
    }

    public final void u0() {
        if (this.S1 != null) {
            return;
        }
        o8 o8Var = new o8(getContext(), this.k0);
        this.S1 = o8Var;
        o8Var.setOnClickListener(new y1(this, 4));
        this.S1.setAlpha(0.0f);
        this.S1.setVisibility(8);
        addView(this.S1, ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        if (this.J1 != null || getContext() == null) {
            return;
        }
        n1 n1Var = new n1(getContext(), this.r3);
        this.J1 = n1Var;
        n1Var.setOnClickListener(new y1(this, 5));
        n1 n1Var2 = this.J1;
        g1 g1Var = g1.W;
        boolean z9 = true;
        n1Var2.b(g1Var != null && g1Var.o(), false);
        n1 n1Var3 = this.J1;
        g1 g1Var2 = g1.W;
        if (g1Var2 != null && !g1Var2.m()) {
            z9 = false;
        }
        n1Var3.a(z9, false);
        addView(this.J1, ha.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void w0() {
        if (this.I1 != null || getContext() == null) {
            return;
        }
        this.H1 = new q1(getContext(), this.l2);
        r1 r1Var = new r1(getContext(), this.H1, this.r3);
        this.I1 = r1Var;
        r1Var.setOnClickListener(new y1(this, 6));
        this.I1.setOnLongClickListener(new v1(this, 1));
        addView(this.I1, ha.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.H1, ha.d(qs.e3, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.P1 != null) {
            return;
        }
        if (this.K1 == null) {
            t0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.P1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.Q1 = textView;
        textView.setTextColor(-8026747);
        this.Q1.setTextSize(1, 16.0f);
        this.Q1.setText(id.M0(this.n1 ? 2131744665 : 2131744493, null));
        TextView textView2 = new TextView(getContext());
        this.R1 = textView2;
        textView2.setTextColor(-1);
        this.R1.setTextSize(1, 12.0f);
        TextView textView3 = this.R1;
        int L = org.telegram.messenger.g0.L(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 452984831, 855638015, 855638015));
        this.R1.setGravity(17);
        ka.a(this.R1);
        this.R1.setText(id.M0(2131744492, null));
        this.R1.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        this.P1.addView(imageView, ha.t(22, 22, 16, 12, 1, 4, 0));
        this.P1.addView(this.Q1, ha.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.P1.addView(this.R1, ha.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.K1.addView(this.P1, ha.d(-1, -1.0f, qs.E1, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.K2 != null) {
            return;
        }
        md mdVar = new md(getContext(), 1);
        this.K2 = mdVar;
        mdVar.setTextSize(1, 14.0f);
        this.K2.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.K2.setGravity(19);
        this.K2.setText(id.M0(2131744491, null));
        addView(this.K2, ha.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.F1 != null) {
            return;
        }
        a3 a3Var = new a3(this, getContext(), 0);
        this.F1 = a3Var;
        a3Var.setClickable(true);
        addView(this.F1, ha.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        b3 b3Var = new b3(this, getContext());
        this.o2 = b3Var;
        b3Var.setOnClickListener(new y1(this, 0));
        this.F1.addView(this.o2, ha.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        u uVar = new u(0, getContext(), false);
        this.k2 = uVar;
        uVar.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        this.F1.addView(this.k2, ha.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.j2 = textView;
        textView.setTextSize(1, 14.0f);
        this.j2.setTextColor(-1);
        this.F1.addView(this.j2, ha.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.g1.s);
        b3 b3Var2 = this.o2;
        int L = org.telegram.messenger.g0.L(15.0f);
        int o4 = i0.a.o(-1, 120);
        b3Var2.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, o4, o4));
        imageView.setBackground(org.telegram.ui.ActionBar.m6.O(i0.a.o(-1, 120), -org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f)));
    }
}
