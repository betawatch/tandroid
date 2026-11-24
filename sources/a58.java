// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class a58 extends ela implements jm7 {
    public static final /* synthetic */ int U3 = 0;
    public final l48 A0;
    public boolean A1;
    public int A2;
    public long A3;
    public final n38 B0;
    public int B1;
    public boolean B2;
    public long B3;
    public final View C0;
    public int C1;
    public final c40 C2;
    public boolean C3;
    public final ImageView D0;
    public int D1;
    public final po D2;
    public TLRPC.TL_channels_sendAsPeers D3;
    public final LinearLayout E0;
    public final z48 E1;
    public final ln E2;
    public final h38 E3;
    public final b48 F0;
    public final eq F1;
    public final ln F2;
    public int F3;
    public ho G0;
    public w48 G1;
    public float G2;
    public final h38 G3;
    public ho H0;
    public boolean H1;
    public long H2;
    public final ArrayList H3;
    public ln I0;
    public h4b I1;
    public boolean I2;
    public final ArrayList I3;
    public ln J0;
    public boolean J1;
    public boolean J2;
    public boolean J3;
    public boolean K0;
    public boolean K1;
    public boolean K2;
    public boolean K3;
    public boolean L0;
    public boolean L1;
    public boolean L2;
    public final ei7 L3;
    public long M0;
    public b48 M1;
    public ig5 M2;
    public final ln M3;
    public long N0;
    public vn2 N1;
    public final pc8 N2;
    public final ln N3;
    public boolean O0;
    public wt7 O1;
    public boolean O2;
    public final ln O3;
    public boolean P0;
    public xt7 P1;
    public z38 P2;
    public float P3;
    public boolean Q0;
    public nj7 Q1;
    public FrameLayout Q2;
    public final Path Q3;
    public boolean R0;
    public t38 R1;
    public wb R2;
    public boolean R3;
    public final g48 S0;
    public q02 S1;
    public boolean S2;
    public ValueAnimator S3;
    public final FrameLayout T0;
    public hg5 T1;
    public v38 T2;
    public float T3;
    public final mm U0;
    public ValueAnimator U1;
    public float U2;
    public final ImageReceiver V0;
    public v29 V1;
    public boolean V2;
    public final ImageReceiver W0;
    public LinearLayout W1;
    public boolean W2;
    public final ArrayList X0;
    public TextView X1;
    public boolean X2;
    public Runnable Y0;
    public TextView Y1;
    public boolean Y2;
    public final e48 Z0;
    public h6b Z1;
    public boolean Z2;
    public final kw3 a1;
    public ViewPropertyAnimator a2;
    public boolean a3;
    public o1a b1;
    public final im0 b2;
    public final ImageReceiver b3;
    public float c1;
    public final im0 c2;
    public xm c3;
    public final pc0 d1;
    public final Paint d2;
    public final ImageReceiver d3;
    public final x48 e1;
    public int e2;
    public vm e3;
    public final i6b f1;
    public ValueAnimator f2;
    public boolean f3;
    public jif g1;
    public float g2;
    public boolean g3;
    public int h1;
    public float h2;
    public v29 h3;
    public a8 i1;
    public float i2;
    public boolean i3;
    public v48 j1;
    public int j2;
    public float j3;
    public TL_stories.PeerStories k1;
    public boolean k2;
    public boolean k3;
    public final ArrayList l1;
    public boolean l2;
    public float l3;
    public final ImageView m0;
    public final ArrayList m1;
    public boolean m2;
    public int m3;
    public final ImageView n0;
    public final y48 n1;
    public boolean n2;
    public int n3;
    public final a6 o0;
    public final pl9 o1;
    public int o2;
    public int o3;
    public final s09 p0;
    public ArrayList p1;
    public final int p2;
    public h38 p3;
    public final ImageView q0;
    public int q1;
    public TextView q2;
    public float q3;
    public final r63 r0;
    public long r1;
    public h02 r2;
    public boolean r3;
    public final b8b s0;
    public boolean s1;
    public int s2;
    public mx6 s3;
    public final b48 t0;
    public boolean t1;
    public int t2;
    public a8 t3;
    public m4b u0;
    public boolean u1;
    public boolean u2;
    public a8 u3;
    public hg5 v0;
    public boolean v1;
    public a91 v2;
    public final km0 v3;
    public hg5 w0;
    public boolean w1;
    public boolean w2;
    public final nz4 w3;
    public hg5 x0;
    public long x1;
    public float x2;
    public final bm0 x3;
    public int y0;
    public final float y1;
    public e51 y2;
    public TL_stories.TL_premium_boostsStatus y3;
    public final oab z0;
    public int z1;
    public q z2;
    public vh1 z3;

    /* JADX WARN: Multi-variable type inference failed */
    public a58(Context context, final oab oabVar, y48 y48Var, r63 r63Var) {
        super(context, null);
        this.R0 = true;
        this.X0 = new ArrayList();
        this.h1 = -5;
        this.y1 = 1.0f;
        z48 z48Var = new z48(this);
        this.E1 = z48Var;
        this.g2 = -1.0f;
        this.h2 = -1.0f;
        this.i2 = -1.0f;
        this.p2 = ConnectionsManager.generateClassGuid();
        this.E2 = new ln(this);
        this.F2 = new ln(this);
        pc8 pc8Var = new pc8();
        this.N2 = pc8Var;
        this.U2 = 1.0f;
        this.E3 = new h38(this, (byte) 4);
        this.G3 = new h38(this, (byte) 11);
        this.H3 = new ArrayList();
        this.I3 = new ArrayList();
        this.L3 = new ei7(this, (byte) 6);
        this.M3 = new ln(this);
        this.N3 = new ln(this);
        this.O3 = new ln(this);
        this.Q3 = new Path();
        pc8Var.E = new fk3(this);
        c40 c40Var = new c40();
        c40Var.g = new ArrayList();
        this.C2 = c40Var;
        this.D2 = new po(null);
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        mm mmVar = new mm(this, (byte) 5);
        this.U0 = mmVar;
        final byte b = 0;
        mmVar.B0 = false;
        mmVar.A1 = true;
        mmVar.y = true;
        mmVar.T(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b3 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
        imageReceiver.T(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d3 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.y = true;
        imageReceiver2.T(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.V0 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.y = true;
        imageReceiver3.T(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.W0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.y = true;
        imageReceiver4.T(0);
        mmVar.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.d1 = new pc0((ylb) null);
        this.z0 = oabVar;
        this.n1 = y48Var;
        this.F1 = y48Var.g;
        this.I1 = oc7.r1(z8c.t0).N1();
        y48Var.l.setColor(-16777216);
        this.d2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.r0 = r63Var;
        setClipChildren(false);
        e48 e48Var = new e48(this, context, this.S0, r63Var, oabVar);
        this.Z0 = e48Var;
        bm0 bm0Var = new bm0(r63Var, cmb.Ie, 0.8f);
        this.x3 = bm0Var;
        kz4 kz4Var = new kz4();
        kz4Var.a(on2.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !gda.e()) {
            this.w3 = null;
        } else {
            nz4 nz4Var = new nz4(kz4Var);
            this.w3 = nz4Var;
            nz4Var.l(gm.L(8.0f));
            kz4Var = nz4Var;
        }
        zgc zgcVar = new zgc(this);
        km0 km0Var = new km0(kz4Var, kz4Var, kz4Var);
        km0Var.h = zgcVar;
        km0Var.i = this;
        this.v3 = km0Var;
        this.b2 = km0Var.c(this, bm0Var, false);
        im0 c = km0Var.c(this, bm0Var, false);
        this.c2 = c;
        c.u(gm.L(32.0f));
        g48 g48Var = new g48(this, context, y48Var, oabVar);
        this.S0 = g48Var;
        g48Var.setClipChildren(false);
        this.a1 = new kw3(this.s2, g48Var);
        g48Var.addView(e48Var, qoe.c(-1.0f, -1));
        l48 l48Var = new l48(this, getContext(), oabVar.E, oabVar, r63Var);
        this.A0 = l48Var;
        l48Var.b0.setOnClickListener(new j38(this, (byte) 10));
        ImageView imageView = new ImageView(context);
        this.D0 = imageView;
        imageView.setImageDrawable(y48Var.m);
        int L = gm.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new j38(this, (byte) 11));
        imageView.setContentDescription(jb6.M0(2131745193, null));
        rve.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(y48Var.n);
        imageView2.setPadding(L, L, L, L);
        b48 b48Var = new b48(this, getContext(), (byte) 1);
        this.F0 = b48Var;
        ho hoVar = this.H0;
        if (hoVar != null) {
            hoVar.setCallback(b48Var);
        }
        b48Var.setWillNotDraw(false);
        b48Var.setOnClickListener(new j38(this, (byte) 12));
        b48 b48Var2 = new b48(this, getContext(), (byte) 2);
        this.t0 = b48Var2;
        ho hoVar2 = this.G0;
        if (hoVar2 != null) {
            hoVar2.setCallback(b48Var2);
        }
        b48Var2.setWillNotDraw(false);
        b48Var2.setOnClickListener(new j38(this, (byte) 13));
        b48Var2.setOnLongClickListener(new u0(this, oabVar, (byte) 3));
        m4b m4bVar = new m4b(context, y48Var);
        this.u0 = m4bVar;
        m4bVar.setPadding(L, L, L, L);
        b48Var2.addView(this.u0, qoe.e(40, 40, 3));
        b48Var.addView(imageView2, qoe.e(40, 40, 3));
        rve.b(b48Var2, 0.3f, 5.0f);
        rve.b(b48Var, 0.3f, 5.0f);
        mmVar.A1 = true;
        mmVar.p0(g48Var);
        pl9 pl9Var = new pl9(10);
        this.o1 = pl9Var;
        g48Var.setOutlineProvider(pl9Var);
        g48Var.setClipToOutline(true);
        addView(g48Var);
        x48 x48Var = new x48(context, z48Var);
        this.e1 = x48Var;
        x48Var.setOnClickListener(new View.OnClickListener(this) { // from class: f38
            public final /* synthetic */ a58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                oab oabVar2 = oabVar;
                a58 a58Var = this.b;
                switch (b2) {
                    case 0:
                        long j = z8c.h(a58Var.s2).n;
                        long j2 = a58Var.r1;
                        if (j != j2) {
                            if (j2 <= 0) {
                                oabVar2.L(yv1.ga(j2));
                                break;
                            } else {
                                oabVar2.L(ProfileActivity.S2(j2));
                                break;
                            }
                        } else {
                            Bundle j3 = kt6.j(1, TeXSymbolParser.TYPE_ATTR);
                            j3.putLong("dialog_id", a58Var.r1);
                            oabVar2.L(new cm6(j3, null));
                            break;
                        }
                    default:
                        if (!a58Var.E1.h()) {
                            a58Var.X0(true);
                            break;
                        } else {
                            oabVar2.T();
                            if (!oab.D1) {
                                oc7.d1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            a58Var.o0.setContentDescription(jb6.M0(!oab.D1 ? 2131748071 : 2131743536, null));
                            break;
                        }
                }
            }
        });
        g48Var.addView(x48Var, qoe.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, qoe.r(40, 40, 5));
        linearLayout.addView(b48Var, qoe.r(40, 40, 5));
        linearLayout.addView(b48Var2, qoe.r(40, 40, 5));
        addView(linearLayout, qoe.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.m0 = imageView3;
        imageView3.setImageDrawable(y48Var.q);
        imageView3.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        imageView3.setBackground(cmb.f0(-1, 1, -1));
        imageView3.setContentDescription(jb6.M0(2131754838, null));
        g48Var.addView(imageView3, qoe.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.n0 = imageView4;
        imageView4.setImageDrawable(y48Var.r);
        imageView4.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        imageView4.setBackground(cmb.f0(-1, 1, -1));
        imageView4.setContentDescription(jb6.M0(2131754807, null));
        g48Var.addView(imageView4, qoe.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new m67(oabVar, (byte) 10));
        imageView3.setOnClickListener(new oh(this, r63Var, oabVar, context, y48Var, (byte) 11));
        a6 a6Var = new a6(context, (byte) 22);
        this.o0 = a6Var;
        g48Var.addView(a6Var, qoe.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        s09 s09Var = new s09(context);
        this.p0 = s09Var;
        s09Var.setPadding(gm.L(6.0f), gm.L(6.0f), gm.L(6.0f), gm.L(6.0f));
        a6Var.addView(s09Var);
        ImageView imageView5 = new ImageView(context);
        this.q0 = imageView5;
        imageView5.setPadding(gm.L(6.0f), gm.L(6.0f), gm.L(6.0f), gm.L(6.0f));
        imageView5.setImageDrawable(y48Var.t);
        a6Var.addView(imageView5);
        imageView5.setVisibility(8);
        b8b b8bVar = new b8b(context);
        this.s0 = b8bVar;
        b8bVar.setOnClickListener(new j38(this, (byte) 2));
        g48Var.addView(b8bVar, qoe.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final byte b2 = 1;
        a6Var.setOnClickListener(new View.OnClickListener(this) { // from class: f38
            public final /* synthetic */ a58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                oab oabVar2 = oabVar;
                a58 a58Var = this.b;
                switch (b22) {
                    case 0:
                        long j = z8c.h(a58Var.s2).n;
                        long j2 = a58Var.r1;
                        if (j != j2) {
                            if (j2 <= 0) {
                                oabVar2.L(yv1.ga(j2));
                                break;
                            } else {
                                oabVar2.L(ProfileActivity.S2(j2));
                                break;
                            }
                        } else {
                            Bundle j3 = kt6.j(1, TeXSymbolParser.TYPE_ATTR);
                            j3.putLong("dialog_id", a58Var.r1);
                            oabVar2.L(new cm6(j3, null));
                            break;
                        }
                    default:
                        if (!a58Var.E1.h()) {
                            a58Var.X0(true);
                            break;
                        } else {
                            oabVar2.T();
                            if (!oab.D1) {
                                oc7.d1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            a58Var.o0.setContentDescription(jb6.M0(!oab.D1 ? 2131748071 : 2131743536, null));
                            break;
                        }
                }
            }
        });
        this.f1 = new i6b(this, y48Var);
        g48Var.addView(l48Var, qoe.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.C0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        n38 n38Var = new n38(this, context, oabVar, oabVar.w, view, frameLayout, oabVar);
        this.B0 = n38Var;
        g48Var.addView(view, qoe.e(-1, nm7.d3, 87));
        g48Var.addView(n38Var, qoe.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        g48Var.addView(frameLayout, qoe.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = gm.L(20.0f);
        int p = on2.p(-1, 100);
        a6Var.setBackground(cmb.i0(L2, L2, L2, L2, 0, p, p));
        int L3 = gm.L(20.0f);
        int p2 = on2.p(-1, 100);
        imageView3.setBackground(cmb.i0(L3, L3, L3, L3, 0, p2, p2));
        int L4 = gm.L(20.0f);
        int p3 = on2.p(-1, 100);
        imageView4.setBackground(cmb.i0(L4, L4, L4, L4, 0, p3, p3));
        int L5 = gm.L(20.0f);
        int p4 = on2.p(-1, 100);
        imageView.setBackground(cmb.i0(L5, L5, L5, L5, 0, p4, p4));
        int L6 = gm.L(20.0f);
        int p5 = on2.p(-1, 100);
        b48Var2.setBackground(cmb.i0(L6, L6, L6, L6, 0, p5, p5));
        int L7 = gm.L(20.0f);
        int p6 = on2.p(-1, 100);
        b48Var.setBackground(cmb.i0(L7, L7, L7, L7, 0, p6, p6));
        pkb pkbVar = l48Var.W;
        View m = pkbVar.m(context);
        gm.B2(m);
        addView(m);
        pkbVar.D = new ts1(this, (byte) 2);
        pkbVar.Q(this);
    }

    public static void Q0(g4b g4bVar, ImageReceiver imageReceiver, String str) {
        if (g4bVar.s) {
            imageReceiver.Y(null, null, gn5.g(g4bVar.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.Z(gn5.g(g4bVar.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j5 getAccountInstance() {
        return j5.a(this.s2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f = 1.0f - this.E2.c;
        p2a p2aVar = this.z0.x;
        return (1.0f - (p2aVar == null ? 0.0f : p2aVar.f)) * f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        oab oabVar;
        if (!this.E1.f || (oabVar = this.z0) == null || oabVar.B0 == null || v0(true)) {
            return 0L;
        }
        return oabVar.B0.m();
    }

    public final boolean A0() {
        z3b z3bVar;
        oab oabVar = this.z0;
        return (oabVar == null || (z3bVar = oabVar.O0) == null || z3bVar.e != 4) ? false : true;
    }

    public final boolean B0() {
        TLRPC.User W1;
        return A0() && (W1 = oc7.r1(this.s2).W1(Long.valueOf(this.z0.O0.d))) != null && W1.bot && W1.bot_can_edit;
    }

    public abstract boolean C0();

    public final void D0(ValueAnimator valueAnimator) {
        this.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = (-gm.L(8.0f)) * this.T3;
        x48 x48Var = this.e1;
        x48Var.setTranslationY(f);
        x48Var.setAlpha(1.0f - this.T3);
        float f2 = (-gm.L(8.0f)) * this.T3;
        ImageView imageView = this.m0;
        imageView.setTranslationY(f2);
        imageView.setAlpha(1.0f - this.T3);
        float f3 = (-gm.L(8.0f)) * this.T3;
        ImageView imageView2 = this.n0;
        imageView2.setTranslationY(f3);
        imageView2.setAlpha(1.0f - this.T3);
        float f4 = (-gm.L(8.0f)) * this.T3;
        a6 a6Var = this.o0;
        a6Var.setTranslationY(f4);
        a6Var.setAlpha((1.0f - this.T3) * this.U2);
        b48 b48Var = this.M1;
        if (b48Var != null) {
            b48Var.setTranslationY(gm.L(8.0f) * this.T3);
            this.M1.setAlpha(1.0f - this.T3);
        }
        b8b b8bVar = this.s0;
        if (b8bVar != null) {
            b8bVar.setTranslationY((-gm.L(8.0f)) * this.T3);
            b8bVar.setAlpha(1.0f - this.T3);
        }
        this.A0.setAlpha(1.0f - this.T3);
        w48 w48Var = this.G1;
        float f5 = w48Var == null ? 0.0f : ((fab) w48Var).d.W;
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        b48 b48Var2 = this.t0;
        if (b48Var2 != null) {
            b48Var2.setAlpha((1.0f - this.T3) * (1.0f - f5) * hideInterfaceAlpha);
        }
        ImageView imageView3 = this.D0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - this.T3) * (1.0f - f5) * hideInterfaceAlpha);
        }
        b48 b48Var3 = this.F0;
        if (b48Var3 != null) {
            b48Var3.setAlpha((1.0f - this.T3) * (1.0f - f5) * hideInterfaceAlpha);
        }
        t38 t38Var = this.R1;
        if (t38Var != null) {
            t38Var.setAlpha(1.0f - this.T3);
            invalidate();
        }
        this.S0.invalidate();
    }

    public final void E0(k39 k39Var) {
        boolean z;
        TLRPC.Reaction reaction;
        z48 z48Var = this.E1;
        TL_stories.StoryItem storyItem = z48Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z2 = reaction2 != null;
        if (reaction2 != null && k39Var == null) {
            b0();
            this.I1.i0(this.r1, z48Var.a, null);
        } else if (k39Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(this.s2).r.get("❤");
            if (tL_availableReaction != null) {
                this.f3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a = g39.a();
                gn5 b = gn5.b(document);
                ImageReceiver imageReceiver = this.b3;
                imageReceiver.d0(b, a, null, null, null, 0);
                if (imageReceiver.y() != null) {
                    imageReceiver.y().I(0, false, true);
                }
                this.g3 = true;
                this.I1.i0(this.r1, z48Var.a, k39.c(tL_availableReaction));
            }
        } else {
            b0();
            this.I1.i0(this.r1, z48Var.a, k39Var);
        }
        TL_stories.StoryItem storyItem2 = z48Var.a;
        b48 b48Var = this.t0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.u0.setReaction(null);
            b48Var.setContentDescription(jb6.M0(2131754850, null));
            z = false;
        } else {
            z2 = !z2;
            this.u0.setReaction(k39.d(reaction));
            b48Var.setContentDescription(jb6.M0(2131754849, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z = true;
        }
        if (this.t1 && z2) {
            TL_stories.StoryItem storyItem3 = z48Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = z48Var.a.views;
            int i = storyViews.reactions_count + (z ? 1 : -1);
            storyViews.reactions_count = i;
            if (i < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = z48Var.a;
        n39.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void F0() {
        s96 s96Var;
        if (this.D3 == null) {
            oab oabVar = this.z0;
            if (oabVar != null && (s96Var = oabVar.B0) != null) {
                if (s96Var.s == null ? false : !r1.messages_enabled) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers K1 = oc7.r1(this.s2).K1(this.r1, true);
            this.D3 = K1;
            t38 t38Var = this.R1;
            if (t38Var == null || K1 == null) {
                return;
            }
            t38Var.A2(true);
        }
    }

    public final boolean G0() {
        t38 t38Var = this.R1;
        if (t38Var == null) {
            return false;
        }
        boolean z = t38Var.p3;
        if (z) {
            t38Var.Y1();
        }
        gm.d3(new h38(this, (byte) 3), 300L);
        return z;
    }

    public final void H0() {
        long j;
        k38 k38Var;
        CharSequence charSequence;
        int i;
        byte b = 3;
        oc7.d1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.R1.getTextWithEntities();
        long e = z8c.h(this.s2).e();
        TLRPC.Peer l = this.z0.B0.l();
        if (l != null) {
            e = pg3.n(l);
        }
        Context context = getContext();
        int i2 = this.s2;
        String r = pg3.r(i2, this.r1);
        long messageMinPrice = getMessageMinPrice();
        long j2 = this.A3;
        k38 k38Var2 = new k38(this, (byte) 1);
        r63 r63Var = new r63();
        my0 my0Var = new my0(1, (ylb) r63Var, context, false);
        my0Var.J();
        my0Var.w0 = false;
        LinearLayout i3 = hg9.i(context, 1);
        my0Var.O = i3;
        int[] iArr = oc7.r1(i2).T3;
        CharSequence j0 = k47.j0(textWithEntities, false, false, new TextPaint());
        if (j0 instanceof Spannable) {
            Spannable spannable = (Spannable) j0;
            j = j2;
            k38Var = k38Var2;
            charSequence = j0;
            i = ((gn[]) spannable.getSpans(0, j0.length(), gn.class)).length + ((dw3[]) spannable.getSpans(0, j0.length(), dw3.class)).length;
        } else {
            j = j2;
            k38Var = k38Var2;
            charSequence = j0;
            i = 0;
        }
        int max = (int) Math.max(messageMinPrice, j <= 0 ? 100L : j);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            int i4 = length * 7;
            int i5 = iArr[i4];
            int[] iArr2 = iArr;
            int i6 = iArr2[i4 + 2];
            if (i <= iArr2[i4 + 3] && charSequence.length() <= i6) {
                max = Math.max(max, i5);
                break;
            } else {
                length--;
                iArr = iArr2;
            }
        }
        long[] jArr = {max};
        b61 b61Var = new b61(null, context, true);
        i96 i96Var = new i96();
        i96Var.c = e;
        i96Var.f = textWithEntities;
        i96Var.g = jArr[0];
        d96 d96Var = new d96(i2, context, true);
        LinearLayout i7 = hg9.i(context, 0);
        yd ydVar = new yd(context, jb6.M0(2131748571, null), r63Var);
        i7.addView(ydVar, qoe.q(-1, -1, 1.0f, nm7.w1, 0, 0, 5, 0));
        yd ydVar2 = new yd(context, jb6.M0(2131748572, null), r63Var);
        i7.addView(ydVar2, qoe.q(-1, -1, 1.0f, nm7.w1, 5, 0, 5, 0));
        yd ydVar3 = new yd(context, jb6.M0(2131748573, null), r63Var);
        i7.addView(ydVar3, qoe.q(-1, -1, 1.0f, nm7.w1, 5, 0, 0, 0));
        ag5 ag5Var = new ag5(context, r63Var, r3);
        k38 k38Var3 = k38Var;
        qac[] qacVarArr = {new zf5(jArr, b61Var, new pn2[1], i96Var, d96Var, i2, ydVar, ydVar2, ydVar3, ag5Var, new boolean[]{true})};
        d96Var.set(i96Var);
        int i8 = 9;
        int[] iArr3 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int f = oc7.r1(i2).l4.L2.f();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                break;
            }
            int[] iArr4 = iArr3;
            if (iArr3[i9] >= messageMinPrice) {
                if (i9 > 0 && arrayList.isEmpty() && iArr4[i9] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i10 = iArr4[i9];
                if (i10 > f) {
                    arrayList.add(Integer.valueOf(f));
                    break;
                } else {
                    arrayList.add(Integer.valueOf(i10));
                    if (iArr4[i9] == f) {
                        break;
                    }
                }
            }
            i9++;
            iArr3 = iArr4;
            i8 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) b10.f(1, arrayList)).intValue() < f) {
            arrayList.add(Integer.valueOf(f));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            iArr5[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        ag5Var.f0 = iArr5;
        ag5Var.setValue((int) jArr[0]);
        i3.addView(ag5Var, qoe.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        qacVarArr[0].a(Integer.valueOf((int) jArr[0]));
        i3.addView(i7, qoe.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i12 = cmb.i5;
        TextView b2 = jxe.b(context, 20.0f, i12, true, r63Var);
        hg9.p(b2, 17, null, 2131748568);
        i3.addView(b2, qoe.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b3 = jxe.b(context, 14.0f, i12, false, r63Var);
        b3.setGravity(17);
        hg9.q(null, null, 2131748569, new Object[]{r}, b3);
        i3.addView(b3, qoe.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        i3.addView(d96Var, qoe.t(-2, -2, 17, 42, 22, 42, 20));
        i3.addView(b61Var, qoe.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        my0Var.show();
        b61Var.setOnClickListener(new jw4(k38Var3, jArr, my0Var, b));
    }

    public final void I0() {
        z48 z48Var = this.E1;
        if (z48Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = z48Var.a.id;
        tL_stories_exportStoryLink.peer = oc7.r1(this.s2).i1(this.r1);
        ConnectionsManager.getInstance(this.s2).sendRequest(tL_stories_exportStoryLink, new a48());
    }

    public final void J0() {
        if (this.R1 == null) {
            return;
        }
        j0();
        this.y2.d2.h0();
        this.y2.t1(-1, true);
        e51 e51Var = this.y2;
        e51Var.T1 = this.r1;
        e51Var.Z0();
        this.y2.U0().setText(this.R1.getFieldText());
        ((fab) this.G1).h(this.y2);
    }

    public final void K0() {
        Bundle bundle = new Bundle();
        long j = this.r1;
        if (j < 0) {
            bundle.putLong("chat_id", -j);
        } else {
            bundle.putLong("user_id", j);
        }
        TLRPC.Dialog R0 = oc7.r1(this.s2).R0(this.r1);
        if (R0 != null) {
            bundle.putInt("message_id", R0.top_message);
        }
        this.z0.L(new yv1(bundle));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        if (((vo9) r5).U == r8) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
    
        if (((oo9) r5).b0 == r8) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0(long j) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        s96 s96Var;
        ad8 ad8Var;
        ad8 ad8Var2;
        if (!this.A1) {
            this.C2.e = null;
            return;
        }
        z48 z48Var = this.E1;
        if (!z48Var.f) {
            if (!z48Var.e) {
                fc4.b("PeerStoriesView.requestVideoPlayer(" + j + "): null, not a video");
                ((fab) this.G1).c(null, null, 0L, this.C2);
                c40 c40Var = this.C2;
                c40Var.e = null;
                c40Var.a = false;
                return;
            }
            if (z48Var.c() == null || !new File(this.E1.c()).exists()) {
                TL_stories.StoryItem storyItem = this.E1.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.r1;
                    try {
                        document2 = h4b.B(this.s2, storyItem);
                        try {
                            TL_stories.StoryItem storyItem2 = this.E1.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = bc4.G(this.s2).F(this.E1.a);
                            }
                            StringBuilder sb = new StringBuilder("?account=");
                            sb.append(this.s2);
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
                            sb.append(this.E1.a.fileReference);
                            sb.append("&name=");
                            sb.append(URLEncoder.encode(bc4.B(document2), "UTF-8"));
                            sb.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb.append(Utilities.f(bArr));
                            sb.append("&sid=");
                            sb.append(this.E1.a.id);
                            sb.append("&did=");
                            sb.append(this.E1.a.dialogId);
                            Uri parse = Uri.parse("tg://" + bc4.r(null, document2) + sb.toString());
                            fc4.b("StoryViewer requestVideoPlayer(" + j + "): playing from " + parse);
                            this.H2 = (long) (k47.H0(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((fab) this.G1).c(document, uri, j, this.C2);
                            this.S0.invalidate();
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
                Uri fromFile = Uri.fromFile(new File(this.E1.c()));
                fc4.b("StoryViewer requestVideoPlayer(" + j + "): playing from attachPath " + fromFile);
                this.H2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                fc4.b("PeerStoriesView.requestVideoPlayer(" + j + "): playing from null?");
            }
            ((fab) this.G1).c(document, uri, j, this.C2);
            this.S0.invalidate();
            return;
        }
        w48 w48Var = this.G1;
        TL_stories.StoryItem storyItem3 = z48Var.a;
        long j2 = this.r1;
        int i = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        c40 c40Var2 = this.C2;
        fab fabVar = (fab) w48Var;
        fabVar.i(true, true);
        s96 s96Var2 = fabVar.d.B0;
        if (s96Var2 == null || s96Var2.b != j2 || !s96Var2.i(inputGroupCall)) {
            t96 t96Var = fabVar.d.E0;
            if (t96Var != null) {
                t96Var.e(j2, null);
                t96 t96Var2 = fabVar.d.E0;
                t96Var2.getClass();
                TextureViewRenderer textureViewRenderer = t96Var2.c;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                z96 z96Var = t96Var2.e;
                if (z96Var != null) {
                    if (z96Var.d != 0 || z96Var.e != 0) {
                        z96Var.e = 0;
                        z96Var.d = 0;
                        z96Var.requestLayout();
                    }
                    a91 a91Var = t96Var2.f;
                    a91Var.c = null;
                    a91Var.invalidate();
                }
                t96Var2.y = false;
                t96Var2.f(false, false);
            }
            w96 w96Var = w96.E;
            if (w96Var == null || w96Var.b == null || (ad8Var2 = w96Var.a) == null || !ad8Var2.f() || !w96Var.b.i(inputGroupCall)) {
                s96Var = null;
            } else {
                s96Var = w96Var.b;
                if (w96Var.a != null) {
                    wc8 wc8Var = w96Var.e;
                    w96Var.e = null;
                    v96 v96Var = w96Var.d;
                    if (v96Var != null) {
                        v96Var.a = null;
                    }
                    y96 y96Var = w96Var.f;
                    w96Var.f = null;
                    w96Var.a.a(new u35(wc8Var, y96Var, (byte) 7));
                }
            }
            oab oabVar = fabVar.d;
            s96 s96Var3 = oabVar.B0;
            if (s96Var3 != null && s96Var3 != s96Var) {
                if (s96Var3.n || w96.a(s96Var3)) {
                    if (s96Var == null) {
                        oab oabVar2 = fabVar.d;
                        t96 t96Var3 = oabVar2.E0;
                        s96 s96Var4 = oabVar2.B0;
                        if (s96Var4 instanceof vo9) {
                            z96 z96Var2 = t96Var3.e;
                            if (z96Var2 != null) {
                            }
                        } else if (s96Var4 instanceof oo9) {
                            TextureViewRenderer textureViewRenderer2 = t96Var3.c;
                            if (textureViewRenderer2 == null) {
                                textureViewRenderer2 = null;
                            }
                            if (textureViewRenderer2 != null) {
                            }
                        } else {
                            t96Var3.getClass();
                        }
                    }
                    fabVar.d.B0.d();
                } else {
                    fabVar.d.B0.h();
                }
                oabVar = fabVar.d;
                oabVar.B0 = null;
            }
            if (s96Var != null) {
                oabVar.B0 = s96Var;
            }
            w96 w96Var2 = w96.E;
            if (w96Var2 != null && (ad8Var = w96Var2.a) != null && ad8Var.f()) {
                w96Var2.a.b();
            }
            oab oabVar3 = fabVar.d;
            nab nabVar = oabVar3.A0;
            if (nabVar != null) {
                nabVar.release(null);
                oabVar3 = fabVar.d;
                oabVar3.A0 = null;
            }
            c40 c40Var3 = oabVar3.G0;
            if (c40Var3 != null) {
                c40Var3.c = null;
                c40Var3.b = null;
                c40Var3.a = false;
                c40Var3.e = null;
                c40Var3.f = null;
                c40Var3.d = null;
                c40Var3.m();
                oabVar3 = fabVar.d;
                oabVar3.G0 = null;
            }
            if (oabVar3.B0 == null) {
                s96 s96Var5 = s96.N;
                if (s96Var5 == null || !s96Var5.i(inputGroupCall)) {
                    oab oabVar4 = fabVar.d;
                    oabVar4.B0 = s96.g(fabVar.c, oabVar4.h, storyItem3, j2, i, z, inputGroupCall, false, false);
                } else {
                    fabVar.d.B0 = s96.N;
                }
            }
            oab oabVar5 = fabVar.d;
            oabVar5.E0.a(oabVar5.B0);
            oab oabVar6 = fabVar.d;
            s96 s96Var6 = oabVar6.B0;
            w96 w96Var3 = w96.E;
            if (w96Var3 == null) {
                w96Var3 = new w96();
                w96.E = w96Var3;
            }
            ad8 ad8Var3 = w96Var3.a;
            if (ad8Var3 != null && ad8Var3.e()) {
                ad8 ad8Var4 = w96Var3.a;
                if (ad8Var4.c != 0) {
                    if (w96Var3.b != s96Var6) {
                        ad8Var4.b();
                    }
                    oab oabVar7 = fabVar.d;
                    oabVar7.G0 = c40Var2;
                    c40Var2.a = false;
                    c40Var2.e = oabVar7.z0;
                    c40Var2.f = oabVar7.E0.getVideoTextureView();
                    oab oabVar8 = fabVar.d;
                    c40 c40Var4 = oabVar8.G0;
                    t96 t96Var4 = oabVar8.E0;
                    t96Var4.getClass();
                    c40Var4.d = null;
                    c40Var4.b = oabVar8.B0;
                    t96Var4.e(j2, c40Var4);
                    fabVar.d.G0.m();
                }
            }
            w96Var3.c = oabVar6;
            w96Var3.b(s96Var6);
            ad8 ad8Var5 = w96Var3.a;
            if (ad8Var5 == null || !ad8Var5.e()) {
                w96Var3.a = yc3.c().k(w96Var3);
            }
            u96 u96Var = w96Var3.w;
            LaunchActivity launchActivity = LaunchActivity.H1;
            LaunchActivity launchActivity2 = w96Var3.x;
            if (launchActivity2 != launchActivity) {
                if (launchActivity2 != null) {
                    launchActivity2.a1.remove(u96Var);
                }
                w96Var3.x = launchActivity;
                if (launchActivity != null) {
                    launchActivity.a1.add(u96Var);
                }
            }
            w96Var3.a.d();
            oab oabVar72 = fabVar.d;
            oabVar72.G0 = c40Var2;
            c40Var2.a = false;
            c40Var2.e = oabVar72.z0;
            c40Var2.f = oabVar72.E0.getVideoTextureView();
            oab oabVar82 = fabVar.d;
            c40 c40Var42 = oabVar82.G0;
            t96 t96Var42 = oabVar82.E0;
            t96Var42.getClass();
            c40Var42.d = null;
            c40Var42.b = oabVar82.B0;
            t96Var42.e(j2, c40Var42);
            fabVar.d.G0.m();
        }
        this.S0.invalidate();
    }

    public final void M0() {
        z48 z48Var = this.E1;
        TL_stories.StoryItem storyItem = z48Var.a;
        if ((storyItem == null && z48Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File f = z48Var.f();
        boolean z = z48Var.e;
        if (f == null || !f.exists()) {
            V0();
            return;
        }
        MediaController.d0(f.toString(), getContext(), z ? 1 : 0, null, null, new ra((byte) 4, this, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(Uri uri) {
        TL_stories.StoryItem storyItem;
        String str;
        int indexOf;
        Uri parse;
        String str2;
        if (uri == null || (storyItem = this.E1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String uri2 = uri.toString();
        boolean z = true;
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                str = uri2.split("/1/")[1];
                indexOf = str.indexOf("/ACTUAL");
            } catch (Exception e) {
                fc4.g(e, true);
            }
            if (indexOf != -1) {
                parse = Uri.parse(URLDecoder.decode(str.substring(0, indexOf), "UTF-8"));
                String S0 = gm.S0(parse);
                if (e21.b) {
                    if (S0 == null) {
                        String uri3 = parse.toString();
                        String o = MediaController.o(-1L, parse, "file");
                        if (o == null) {
                            U0();
                            return;
                        }
                        str2 = uri3;
                        S0 = o;
                        z = false;
                        if (z) {
                            a6a.S(getAccountInstance(), null, null, parse, null, null, this.r1, null, null, storyItem, null, true, null, null);
                            return;
                        } else {
                            a6a.S(getAccountInstance(), S0, str2, null, null, null, this.r1, null, null, storyItem, null, true, null, null);
                            return;
                        }
                    }
                    z = false;
                }
                str2 = S0;
                if (z) {
                }
            }
        }
        parse = uri;
        String S02 = gm.S0(parse);
        if (e21.b) {
        }
        str2 = S02;
        if (z) {
        }
    }

    public final void O0(long j, boolean z) {
        if (this.A1 != z) {
            this.A1 = z;
            s09 s09Var = this.p0;
            if (z) {
                if (this.z0.a && Build.VERSION.SDK_INT < 33) {
                    oab oabVar = ((fab) this.G1).d;
                    oabVar.l1 = true;
                    oabVar.U();
                    ei7 ei7Var = this.L3;
                    gm.r(ei7Var);
                    gm.d3(ei7Var, 100L);
                }
                L0(j);
                d1();
                s09Var.setAnimation(this.n1.u);
                this.A1 = true;
                this.e1.a.getImageReceiver().v0(true, true);
                z48 z48Var = this.E1;
                if (z48Var.a != null) {
                    fc4.b("StoryViewer displayed story dialogId=" + this.r1 + " storyId=" + z48Var.a.id + " " + z48Var.d());
                }
            } else {
                f0();
                s09Var.a();
                this.b1 = null;
                this.B2 = false;
                this.E2.e(true, 0.0f);
                this.S0.invalidate();
                invalidate();
                g0();
                oab oabVar2 = ((fab) this.G1).d;
                oabVar2.I0 = false;
                oabVar2.U();
            }
            this.U0.T(this.A1 ? 3 : 2);
            this.V0.T(this.A1 ? 2 : 0);
            this.W0.T(this.A1 ? 2 : 0);
            if (this.s1 || this.t1) {
                h4b h4bVar = this.I1;
                long j2 = this.r1;
                boolean z2 = this.A1;
                vh6 vh6Var = h4bVar.m;
                ihc ihcVar = (ihc) vh6Var.f(j2);
                if (ihcVar == null) {
                    ihcVar = new ihc(h4bVar.a, j2, h4bVar);
                    vh6Var.k(ihcVar, j2);
                }
                ihcVar.b(z2);
            }
        }
    }

    public final void P0(int i, long j) {
        if (this.r1 != j) {
            z48 z48Var = this.E1;
            z48Var.b = null;
            z48Var.a = null;
        }
        this.r1 = j;
        this.p1 = null;
        e0(i);
        TL_stories.PeerStories peerStories = this.z0.Q0;
        h4b h4bVar = this.I1;
        boolean z = true;
        if (peerStories != null) {
            h4bVar.U(peerStories, true);
            return;
        }
        TL_stories.PeerStories x = h4bVar.x(j);
        if (x == null) {
            x = h4bVar.y(j);
        } else {
            z = false;
        }
        h4bVar.U(x, z);
    }

    public final void R0(long j, boolean z, boolean z2) {
        if (!z && j == this.B3 && this.C3 == z2) {
            return;
        }
        this.B3 = j;
        this.C3 = z2;
        x48 x48Var = this.e1;
        if (j < 0) {
            TLRPC.Chat L0 = oc7.r1(this.s2).L0(Long.valueOf(-j));
            dg0 dg0Var = x48Var.b;
            dg0 dg0Var2 = x48Var.b;
            dg0Var.l(gm.A2(L0 == null ? "" : L0.title), false);
            if (L0 == null || !L0.verified) {
                dg0Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(nm7.d4);
            sn2 sn2Var = new sn2(mutate, null);
            sn2Var.x = true;
            int L = gm.L(16.0f);
            int L2 = gm.L(16.0f);
            sn2Var.h = L;
            sn2Var.n = L2;
            dg0Var2.i(sn2Var);
            return;
        }
        if (this.s1 && !z2) {
            x48Var.b.l(jb6.M0(2131745375, null), false);
            x48Var.b.i(null);
            return;
        }
        TLRPC.User W1 = oc7.r1(this.s2).W1(Long.valueOf(j));
        if (W1 == null || !W1.verified) {
            x48Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(nm7.d4);
            sn2 sn2Var2 = new sn2(mutate2, null);
            sn2Var2.x = true;
            int L3 = gm.L(16.0f);
            int L4 = gm.L(16.0f);
            sn2Var2.h = L3;
            sn2Var2.n = L4;
            x48Var.b.i(sn2Var2);
        }
        if (W1 != null) {
            x48Var.b.l(gw3.m(gm.A2(bw2.p(W1)), x48Var.b.getPaint().getFontMetricsInt(), false, null, 0), false);
        } else {
            x48Var.b.l(null, false);
        }
    }

    public final void S0(float f, float f2, o1a o1aVar) {
        this.c1 = f;
        this.q3 = 1.0f / f2;
        if (this.b1 != o1aVar) {
            this.b1 = o1aVar;
            if (o1aVar != null) {
                ImageReceiver imageReceiver = o1aVar.a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    mm mmVar = this.U0;
                    mmVar.d0 = null;
                    mmVar.a1.setShader(null);
                    mmVar.u0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void T0(boolean z) {
        z48 z48Var = this.E1;
        if (z48Var.a != null) {
            oab oabVar = this.z0;
            if (oabVar.f != null) {
                String b = z48Var.b();
                if (!z) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", b);
                    LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                    return;
                }
                z38 z38Var = new z38(this, oabVar.f.getContext(), b, b, oc7.r1(this.s2).e5() && (!(this.t1 || m9c.C(this.r1)) || sd2.t0(this.t1 ? oc7.r1(this.s2).L0(Long.valueOf(-this.r1)) : null)), new pv0(this.r0, (byte) 5));
                this.P2 = z38Var;
                z38Var.d2 = true;
                TL_stories.StoryItem storyItem = z48Var.a;
                storyItem.dialogId = this.r1;
                z38Var.A2 = storyItem;
                z38Var.n2 = new k44(this, (byte) 23);
                ((fab) this.G1).h(z38Var);
            }
        }
    }

    public final void U0() {
        g48 g48Var = this.S0;
        r63 r63Var = this.r0;
        new c41(g48Var, r63Var).t(jb6.M0(2131743520, null), r63Var).j();
    }

    public final void V0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
        String M0 = jb6.M0(R.string.AppName, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        heVar.U = jb6.M0(2131746951, null);
        ((fab) this.G1).h(heVar);
    }

    public final void W0(boolean z) {
        if (this.i3 != z) {
            z48 z48Var = this.E1;
            if (z48Var.a != null) {
                this.i3 = z;
                byte b = 0;
                if (z) {
                    this.h3.setVisibility(0);
                }
                this.h3.setStoryItem(z48Var.a);
                oab oabVar = ((fab) this.G1).d;
                oabVar.p1 = z;
                oabVar.U();
                if (!z) {
                    if (this.h3.getReactionsWindow() != null) {
                        this.h3.getReactionsWindow().e();
                    }
                    this.h3.animate().alpha(0.0f).setDuration(150L).setListener(new q38(this, b)).start();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j3, z ? 1.0f : 0.0f);
                this.h3.setTransitionProgress(this.j3);
                ofFloat.addUpdateListener(new i38(this, (byte) 1));
                ofFloat.addListener(new p38(this, z, b));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(d53.g);
                ofFloat.start();
            }
        }
    }

    public final void X0(boolean z) {
        if (this.w0 == null) {
            hg5 hg5Var = new hg5(getContext(), 1);
            hg5Var.n(1.0f, -56.0f);
            this.w0 = hg5Var;
            hg5Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
            this.S0.addView(this.w0, qoe.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.w0.t(jb6.M0(z ? 2131744293 : 2131744143, null));
        this.w0.v();
    }

    public final void Y0() {
        if (this.w1) {
            return;
        }
        byte b = 0;
        if (this.u1) {
            if (this.y3 != null && this.z3 != null) {
                i46.n1(new qv0(this, (byte) 9), this.y3, this.z3, this.r1, true);
                return;
            }
            oab oabVar = this.z0;
            if (oabVar != null) {
                oabVar.k1 = true;
                oabVar.U();
            }
            oc7.r1(this.s2).F0().a(this.r1, new k38(this, b));
            return;
        }
        t38 t38Var = this.R1;
        int i = -this.h1;
        this.h1 = i;
        gm.A3(i, t38Var, null);
        xx0.E.a();
        String r = this.r1 >= 0 ? m9c.r(oc7.r1(this.s2).W1(Long.valueOf(this.r1))) : "";
        boolean H3 = oc7.r1(this.s2).H3();
        r63 r63Var = this.r0;
        g48 g48Var = this.S0;
        (H3 ? new c41(g48Var, r63Var).Q(R.raw.star_premium_2, 36, gm.S2(jb6.a0(null, null, 2131743445, r))) : new c41(g48Var, r63Var).K(R.raw.star_premium_2, gm.S2(jb6.a0(null, null, 2131743445, r)), jb6.M0(2131743446, null), new h38(this, (byte) 5))).j();
    }

    public final boolean Z0(boolean z) {
        if (this.z0.R0) {
            z = !z;
        }
        int i = this.z1;
        if (z) {
            if (i < getStoriesCount() - 1) {
                this.z1++;
                c1(false);
                return true;
            }
        } else if (i > 0) {
            this.z1 = i - 1;
            c1(false);
            return true;
        }
        return false;
    }

    public final void a0(boolean z) {
        a58 currentPeerView;
        q qVar = this.z2;
        if (qVar != null) {
            qVar.f(false);
        }
        long j = this.r1;
        TL_stories.StoryItem storyItem = this.E1.a;
        oab oabVar = this.z0;
        oabVar.getClass();
        if (j != 0 && storyItem != null) {
            oab.E1.remove(j + (j >> 16) + (storyItem.id << 16));
        }
        this.Y2 = true;
        eab eabVar = oabVar.o0;
        if (eabVar != null && (currentPeerView = eabVar.getCurrentPeerView()) != null) {
            currentPeerView.i0();
        }
        if (z) {
            u31 J = new c41(this.S0, this.r0).J(R.raw.forward, jb6.M0(2131748240, null), jb6.M0(2131743236, null), 5000, false, new h38(this, (byte) 2));
            J.s = false;
            J.k(false);
        }
        oc7.r1(this.s2).p0(this.r1, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a1(long j) {
        String str;
        boolean z;
        TLRPC.Chat chat;
        int i = this.s2;
        if (j > 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            str = W1.first_name;
            z = W1.stories_hidden;
            chat = W1;
        } else {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            str = L0.title;
            z = L0.stories_hidden;
            chat = L0;
        }
        gm.d3(new ut0(this, oc7.r1(this.s2), j, !z, str, chat), 200L);
    }

    public final void b0() {
        m4b m4bVar = this.u0;
        m4bVar.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new ul(m4bVar, (byte) 1)).setDuration(150L).start();
        int L = gm.L(8.0f);
        m4b m4bVar2 = new m4b(getContext(), this.n1);
        this.u0 = m4bVar2;
        m4bVar2.setPadding(L, L, L, L);
        this.u0.setAlpha(0.0f);
        this.u0.setScaleX(0.8f);
        this.u0.setScaleY(0.8f);
        this.u0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.t0.addView(this.u0, qoe.e(40, 40, 3));
        this.g3 = false;
    }

    public final void b1() {
        if (oc7.r1(this.s2).e5()) {
            File f = this.E1.f();
            if (f == null || !f.exists()) {
                V0();
                return;
            }
            z38 z38Var = this.P2;
            if (z38Var != null) {
                z38Var.dismiss();
            }
            gm.d3(new h38(this, (byte) 8), 120L);
        }
    }

    public final void c0(boolean z) {
        ValueAnimator valueAnimator = this.S3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T3, z ? 1.0f : 0.0f);
        this.S3 = ofFloat;
        ofFloat.addUpdateListener(new i38(this, (byte) 2));
        this.S3.addListener(new p38(this, z, (byte) 1));
        this.S3.setDuration(420L);
        this.S3.setInterpolator(d53.h);
        this.S3.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x092e, code lost:
    
        if (r1.g == (r6 == null && r6.translated && r6.translatedText != null && android.text.TextUtils.equals(r6.translatedLng, s1c.G0()))) goto L413;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b54  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b7d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0c93  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0cf7  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0dbf A[EDGE_INSN: B:316:0x0dbf->B:317:0x0dbf BREAK  A[LOOP:0: B:305:0x0d99->B:314:0x0dbc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0dcd  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0dde  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0e48  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0e8a  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0e99  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0ebe  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0f5b  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0f92  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0fa7  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0fcd  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0fee  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x1024  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x1042  */
    /* JADX WARN: Removed duplicated region for block: B:415:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x1003  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0f06  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0e93  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0e5a  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0e3f  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0c62  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0c74  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x090f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(boolean z) {
        TL_stories.StoryItem storyItem;
        g4b g4bVar;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        lab labVar;
        ImageReceiver imageReceiver;
        boolean z6;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem2;
        TL_stories.StoryItem storyItem3;
        g4b g4bVar2;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem4;
        g6b g6bVar;
        g6b g6bVar2;
        oab oabVar;
        boolean z7;
        t38 t38Var;
        g4b g4bVar3;
        u31 u31Var;
        TL_stories.StoryItem storyItem5;
        g4b g4bVar4;
        long j;
        byte b;
        int i2;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem6;
        int i3;
        s96 s96Var;
        TLRPC.MessageMedia messageMedia2;
        hg5 hg5Var;
        hg5 hg5Var2;
        z3b z3bVar;
        TL_stories.StoryItem storyItem7;
        CharSequence charSequence2;
        TL_stories.StoryItem storyItem8;
        z48 z48Var;
        w48 w48Var;
        boolean z8;
        LinearLayout linearLayout;
        t38 t38Var2;
        byte b2;
        t38 t38Var3;
        q02 q02Var;
        vn2 vn2Var;
        nj7 nj7Var;
        z48 z48Var2;
        TL_stories.StoryItem storyItem9;
        boolean z9;
        boolean z10;
        g4b g4bVar5;
        g4b g4bVar6;
        hg5 hg5Var3;
        int i4;
        ImageView imageView;
        ImageView imageView2;
        z48 z48Var3;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem10;
        int i5;
        boolean z11;
        TL_stories.StoryItem storyItem11;
        int i6;
        s96 s96Var2;
        boolean z12;
        oab oabVar2;
        s96 s96Var3;
        String str;
        s96 s96Var4;
        int i7;
        TLRPC.GroupCall groupCall;
        BitmapDrawable bitmapDrawable;
        g4b g4bVar7;
        TLRPC.MessageMedia messageMedia3;
        z3b z3bVar2;
        if (this.l1.isEmpty() && this.m1.isEmpty()) {
            return;
        }
        this.L2 = true;
        z48 z48Var4 = this.E1;
        TL_stories.StoryItem storyItem12 = z48Var4.a;
        g4b g4bVar8 = z48Var4.b;
        String s = y4b.s();
        this.P0 = false;
        this.S2 = false;
        int i8 = this.z1;
        boolean z13 = this.J1;
        boolean z14 = this.K1;
        boolean z15 = this.L1;
        oab oabVar3 = this.z0;
        if (oabVar3 == null || (z3bVar2 = oabVar3.O0) == null || z3bVar2.e != 4) {
            storyItem = (i8 < 0 || i8 >= this.l1.size()) ? null : (TL_stories.StoryItem) this.l1.get(i8);
            int size = i8 - this.l1.size();
            g4bVar = (size < 0 || size >= this.m1.size()) ? null : (g4b) this.m1.get(size);
        } else {
            g4bVar = (i8 < 0 || i8 >= this.m1.size()) ? null : (g4b) this.m1.get(i8);
            int size2 = i8 - this.m1.size();
            storyItem = (size2 < 0 || size2 >= this.l1.size()) ? null : (TL_stories.StoryItem) this.l1.get(size2);
        }
        TL_stories.StoryItem storyItem13 = storyItem;
        this.E1.c = null;
        if (g4bVar != null) {
            this.K1 = false;
            boolean z16 = g4bVar.J;
            this.L1 = z16;
            this.J1 = !z16;
            mm mmVar = this.U0;
            mmVar.B0 = false;
            mmVar.t1 = (short) 150;
            Bitmap bitmap = g4bVar.c.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (g4bVar.s || g4bVar.I) {
                i = i8;
                z2 = z13;
                z3 = z14;
                z4 = z15;
                g4bVar7 = g4bVar;
                this.U0.Y(null, null, gn5.g(g4bVar7.f), s, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                z3 = z14;
                i = i8;
                z2 = z13;
                z4 = z15;
                g4bVar7 = g4bVar;
                this.U0.Y(null, null, gn5.g(g4bVar.e), s, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            z48 z48Var5 = this.E1;
            z48Var5.b = g4bVar7;
            z48Var5.j = null;
            z48Var5.i = null;
            z48Var5.a = null;
            z48Var5.d = false;
            z48Var5.e = z48Var5.j();
            TL_stories.StoryItem storyItem14 = z48Var5.a;
            z48Var5.f = (storyItem14 == null || (messageMedia3 = storyItem14.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            this.Z0.d(null, x6b.a(g4bVar7.c), this.a1);
            this.K2 = false;
            this.J2 = false;
            this.I2 = false;
        } else {
            i = i8;
            z2 = z13;
            z3 = z14;
            z4 = z15;
            this.J1 = false;
            this.K1 = false;
            this.L1 = false;
            if (storyItem13 == null) {
                oab oabVar4 = this.z0;
                if (oabVar4 != null) {
                    oabVar4.o(true);
                    return;
                }
                return;
            }
            g4b s2 = this.I1.s(this.r1, storyItem13);
            if (s2 != null) {
                this.K1 = true;
                mm mmVar2 = this.U0;
                mmVar2.B0 = false;
                mmVar2.t1 = this.Y0 != null ? (short) 0 : (short) 150;
                boolean z17 = s2.s;
                String str2 = s2.f;
                if (z17) {
                    g4bVar2 = s2;
                    mmVar2.Z(null, null, gn5.g(str2), s, null, 0L, null, null, 0);
                } else {
                    g4bVar2 = s2;
                    mmVar2.Z(null, null, gn5.g(str2), s, null, 0L, null, null, 0);
                }
                z48 z48Var6 = this.E1;
                z48Var6.b = g4bVar2;
                z48Var6.j = null;
                z48Var6.i = null;
                z48Var6.a = null;
                z48Var6.d = false;
                z48Var6.e = z48Var6.j();
                TL_stories.StoryItem storyItem15 = z48Var6.a;
                z48Var6.f = (storyItem15 == null || (messageMedia = storyItem15.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                this.Z0.d(null, x6b.a(g4bVar2.c), this.a1);
                this.E1.c = storyItem13;
                this.K2 = false;
                this.J2 = false;
                this.I2 = false;
            } else {
                TLRPC.MessageMedia messageMedia4 = storyItem13.media;
                boolean z18 = messageMedia4 != null && k47.J4(messageMedia4.getDocument());
                storyItem13.dialogId = this.r1;
                mm mmVar3 = this.U0;
                mmVar3.B0 = z3;
                mmVar3.t1 = (short) 150;
                TLRPC.MessageMedia messageMedia5 = storyItem13.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.S2 = true;
                    oc7.r1(this.s2).N1().o(storyItem13.id, this.r1);
                    z6 = z3;
                } else {
                    String str3 = storyItem13.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            z18 = str3.toLowerCase().endsWith(".mp4");
                        }
                        TLRPC.MessageMedia messageMedia6 = storyItem13.media;
                        if (z18) {
                            BitmapDrawable i9 = messageMedia6 != null ? fn5.i(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem13.firstFramePath != null) {
                                if (fn5.z().F(gn5.g(storyItem13.firstFramePath).q(null, null, false) + "@" + s, false)) {
                                    z5 = z3;
                                    storyItem2 = storyItem13;
                                    this.U0.Y(null, null, gn5.g(storyItem13.firstFramePath), s, null, null, i9, 0L, null, null, 0);
                                    storyItem13 = storyItem2;
                                }
                            }
                            z5 = z3;
                            storyItem2 = storyItem13;
                            this.U0.Y(null, null, gn5.g(storyItem2.attachPath), s.concat("_pframe"), null, null, i9, 0L, null, null, 0);
                            storyItem13 = storyItem2;
                        } else {
                            z5 = z3;
                            TLRPC.Photo photo = messageMedia6 != null ? messageMedia6.photo : null;
                            BitmapDrawable i10 = photo != null ? fn5.i(photo.sizes) : null;
                            mm mmVar4 = this.U0;
                            String str4 = storyItem13.attachPath;
                            if (z5) {
                                mmVar4.Z(gn5.g(str4), s, gn5.g(storyItem13.firstFramePath), s, i10, 0L, null, null, 0);
                            } else {
                                mmVar4.Z(gn5.g(str4), s, null, null, i10, 0L, null, null, 0);
                            }
                        }
                    } else {
                        z5 = z3;
                        oab oabVar5 = this.z0;
                        Drawable t = ((oabVar5.O0 != null || oabVar5.N0) && (labVar = oabVar5.t0) != null && (imageReceiver = labVar.c) != null && labVar.o == storyItem13.id) ? imageReceiver.t() : null;
                        storyItem13.dialogId = this.r1;
                        TLRPC.MessageMedia messageMedia7 = storyItem13.media;
                        if (z18) {
                            TLRPC.PhotoSize u = bc4.u(1000, messageMedia7.getDocument().thumbs);
                            if (t == null) {
                                t = fn5.i(storyItem13.media.getDocument().thumbs);
                            }
                            this.U0.Y(null, null, gn5.b(h4b.B(this.s2, storyItem13)), s.concat("_pframe"), gn5.c(u, storyItem13.media.getDocument()), s, t, 0L, null, storyItem13, 0);
                        } else {
                            TLRPC.Photo photo2 = messageMedia7 != null ? messageMedia7.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                z6 = z5;
                                this.U0.f();
                            } else {
                                if (t == null) {
                                    t = fn5.i(arrayList);
                                }
                                TLRPC.PhotoSize u2 = bc4.u(ConnectionsManager.DEFAULT_DATACENTER_ID, photo2.sizes);
                                bc4.u(800, photo2.sizes);
                                mm mmVar5 = this.U0;
                                gn5 i11 = gn5.i(u2, photo2);
                                z6 = z5;
                                mmVar5.Y(null, null, i11, s, null, null, t, 0L, null, storyItem13, 0);
                            }
                        }
                    }
                    z6 = z5;
                }
                storyItem13.dialogId = this.r1;
                this.Z0.c(z ? null : storyItem13, this.a1);
                this.E1.k(storyItem13);
                boolean z19 = (this.S2 || (storyItem3 = this.E1.a) == null || (storyItem3 instanceof TL_stories.TL_storyItemDeleted) || (storyItem3 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.K2 = z19;
                this.I2 = z19;
                if (z19) {
                    z19 = this.E1.a() && this.E1.a.isPublic;
                    this.I2 = z19;
                }
                if (z19) {
                    TL_stories.StoryItem storyItem16 = this.E1.a;
                    z19 = storyItem16.pinned || !y4b.w(this.s2, storyItem16);
                    this.I2 = z19;
                }
                this.J2 = z19;
                if (z19 && this.t1) {
                    TLRPC.Chat L0 = oc7.r1(this.s2).L0(Long.valueOf(-this.r1));
                    this.J2 = L0 != null && sd2.t0(L0);
                }
                if (this.K2) {
                    boolean z20 = this.t1;
                    int i12 = this.s2;
                    if (z20) {
                        TLRPC.Chat L02 = oc7.r1(i12).L0(Long.valueOf(-this.r1));
                        this.K2 = (L02 == null || sd2.K(L02, false) == null) ? false : true;
                    } else {
                        TLRPC.User W1 = oc7.r1(i12).W1(Long.valueOf(this.r1));
                        this.K2 = (W1 == null || m9c.p(W1) == null || !this.E1.a.isPublic) ? false : true;
                    }
                }
                lo7.l0.c(new co7(lo7.n(this.s2), this.r1, storyItem13.id, (byte) 1));
                storyItem4 = this.E1.a;
                if (storyItem4 != null && !z) {
                    this.z0.P0 = storyItem4.id;
                }
                this.z0.o0.A();
                this.O2 = true;
                if (!this.s1 || this.t1) {
                    i1(false);
                }
                z48 z48Var7 = this.E1;
                TL_stories.StoryItem storyItem17 = z48Var7.a;
                g4b g4bVar9 = z48Var7.b;
                boolean z21 = ((storyItem17 == null ? storyItem17.id : (g4bVar9 == null || (g6bVar = g4bVar9.c) == null) ? 0 : g6bVar.f) == (storyItem12 == null ? storyItem12.id : (g4bVar8 == null || (g6bVar2 = g4bVar8.c) == null) ? 0 : g6bVar2.f) && (g4bVar8 == null || storyItem17 == null || !TextUtils.equals(g4bVar8.e, storyItem17.attachPath))) ? false : true;
                boolean z22 = (z21 || (this.K1 == z6 && this.J1 == z2 && this.L1 == z4)) ? false : true;
                oabVar = this.z0;
                if (oabVar != null && (s96Var4 = oabVar.B0) != null) {
                    i7 = this.F3;
                    groupCall = s96Var4.s;
                    if (i7 != Math.max(1, groupCall != null ? 0 : groupCall.participants_count)) {
                        z7 = true;
                        if ((g4bVar8 != null || (str = g4bVar8.e) == null || !str.equals(this.E1.c())) && (storyItem12 == null || (storyItem5 = this.E1.a) == null || storyItem12.id != storyItem5.id)) {
                            t38Var = this.R1;
                            if (t38Var != null) {
                                if (storyItem12 != null && !TextUtils.isEmpty(t38Var.getEditField().getText())) {
                                    oab oabVar6 = this.z0;
                                    long j2 = storyItem12.dialogId;
                                    Editable text = this.R1.getEditField().getText();
                                    oabVar6.getClass();
                                    oab.N(j2, storyItem12, text);
                                }
                                qu3 editField = this.R1.getEditField();
                                oab oabVar7 = this.z0;
                                long j3 = this.r1;
                                TL_stories.StoryItem storyItem18 = this.E1.a;
                                oabVar7.getClass();
                                editField.setText(oab.x(j3, storyItem18));
                                boolean z23 = this.E1.f;
                                t38 t38Var4 = this.R1;
                                if (z23) {
                                    t38Var4.y1(false, false);
                                } else {
                                    t38Var4.y1(true, true);
                                }
                            }
                            if (this.E1.f) {
                                F0();
                            }
                            this.a1.c();
                            this.M0 = 0L;
                            this.O0 = false;
                            g4bVar3 = this.E1.b;
                            if (g4bVar3 != null) {
                                u09 u09Var = this.e1.d;
                                if (u09Var != null) {
                                    u09Var.e(false, g4bVar3.h);
                                }
                                this.e1.a.invalidate();
                            } else if (!z22) {
                                this.e1.h = 0.0f;
                            }
                            g48 g48Var = this.S0;
                            u31Var = u31.x;
                            if (u31Var != null && u31Var.h == g48Var) {
                                u31Var.b();
                            }
                            this.A0.J();
                            g0();
                            z7 = true;
                        }
                        if (!z7 || (g4bVar8 != null && this.E1.b == null)) {
                            this.e1.setOnSubtitleClick(null);
                            this.F3 = 0;
                            R0(this.r1, false, this.E1.f);
                            g4bVar4 = this.E1.b;
                            if (g4bVar4 != null) {
                                charSequence2 = g4bVar4.J ? jb6.L0(2131750781) : y4b.u(this.e1.c[0], this.K1);
                            } else {
                                boolean A0 = A0();
                                z48 z48Var8 = this.E1;
                                if (A0) {
                                    TL_stories.StoryItem storyItem19 = z48Var8.a;
                                    charSequence = "";
                                    if (storyItem19 != null && (messageMedia2 = storyItem19.media) != null) {
                                        if (messageMedia2.document != null) {
                                            charSequence2 = jb6.X(r14.date);
                                        } else {
                                            if (messageMedia2.photo != null) {
                                                charSequence2 = jb6.X(r11.date);
                                            }
                                        }
                                    }
                                    j = 0;
                                    b = 4;
                                    i2 = 2;
                                    if (charSequence != null) {
                                        oab oabVar8 = this.z0;
                                        if (oabVar8 != null && (z3bVar = oabVar8.O0) != null && (storyItem7 = this.E1.a) != null && z3bVar.m(storyItem7.id)) {
                                            if (!(charSequence instanceof SpannableStringBuilder)) {
                                                charSequence = new SpannableStringBuilder(charSequence);
                                            }
                                            SpannableString spannableString = new SpannableString("p ");
                                            spannableString.setSpan(new pn2(R.drawable.msg_pin_mini), 0, 1, 33);
                                            ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString);
                                        }
                                        this.e1.b(charSequence, z22);
                                    }
                                    hg5Var = this.v0;
                                    if (hg5Var != null) {
                                        hg5Var.f(false);
                                    }
                                    hg5Var2 = this.w0;
                                    if (hg5Var2 != null) {
                                        hg5Var2.f(false);
                                    }
                                } else {
                                    TL_stories.StoryItem storyItem20 = z48Var8.a;
                                    if (storyItem20 == null) {
                                        j = 0;
                                        b = 4;
                                        i2 = 2;
                                        charSequence = null;
                                    } else if (storyItem20.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.L0(2131748582));
                                        spannableStringBuilder.setSpan(new a96((byte) 1), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        oab oabVar9 = this.z0;
                                        if (oabVar9 == null || (s96Var = oabVar9.B0) == null) {
                                            i3 = 1;
                                        } else {
                                            TLRPC.GroupCall groupCall2 = s96Var.s;
                                            i3 = 1;
                                            this.F3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                                        }
                                        spannableStringBuilder.append((CharSequence) jb6.I(Math.max(i3, this.F3), "LiveStoryWatching"));
                                        charSequence2 = spannableStringBuilder;
                                    } else if (storyItem20.date == -1) {
                                        charSequence2 = jb6.L0(2131752597);
                                    } else {
                                        i2 = 2;
                                        if (z48Var8.g() != null) {
                                            g5b g = this.E1.g();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            j = 0;
                                            SpannableString spannableString2 = new SpannableString("r");
                                            spannableString2.setSpan(new pn2(R.drawable.mini_repost_story), 0, spannableString2.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                            if (g.b != null) {
                                                ed0 ed0Var = new ed0(15.0f, this.s2, this.e1.c[0]);
                                                SpannableString spannableString3 = new SpannableString("a");
                                                spannableString3.setSpan(ed0Var, 0, 1, 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString3).append((CharSequence) " ");
                                                long longValue = g.b.longValue();
                                                int i13 = this.s2;
                                                if (longValue > 0) {
                                                    TLRPC.User W12 = oc7.r1(i13).W1(g.b);
                                                    ed0Var.e(W12);
                                                    spannableStringBuilder2.append((CharSequence) m9c.r(W12));
                                                } else {
                                                    TLRPC.Chat L03 = oc7.r1(i13).L0(Long.valueOf(-g.b.longValue()));
                                                    ed0Var.b(L03);
                                                    if (L03 != null) {
                                                        spannableStringBuilder2.append((CharSequence) L03.title);
                                                    }
                                                }
                                            } else {
                                                String str5 = this.E1.a.fwd_from.from_name;
                                                if (str5 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str5);
                                                }
                                            }
                                            this.e1.setOnSubtitleClick(new n06(this, g, (byte) 14));
                                            SpannableString spannableString4 = new SpannableString(".");
                                            gq3 gq3Var = new gq3();
                                            gq3Var.b = gm.L(1.5f);
                                            gq3Var.c = 5.0f;
                                            spannableString4.setSpan(gq3Var, 0, spannableString4.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString4).append((CharSequence) " ").append((CharSequence) jb6.P(this.E1.a.date));
                                            charSequence = spannableStringBuilder2;
                                            z22 = false;
                                            b = 4;
                                        } else {
                                            j = 0;
                                            if (!this.u1 || (storyItem6 = this.E1.a) == null || storyItem6.from_id == null) {
                                                b = 4;
                                                String X = jb6.X(this.E1.a.date);
                                                String str6 = X;
                                                if (this.E1.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X);
                                                    gq3 gq3Var2 = new gq3();
                                                    gq3Var2.b = gm.L(1.5f);
                                                    gq3Var2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(gq3Var2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                                    valueOf.append((CharSequence) jb6.L0(2131751147));
                                                    str6 = valueOf;
                                                }
                                                charSequence = str6;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                ed0 ed0Var2 = new ed0(15.0f, this.s2, this.e1.c[0]);
                                                SpannableString spannableString5 = new SpannableString("a");
                                                spannableString5.setSpan(ed0Var2, 0, 1, 33);
                                                spannableStringBuilder3.append((CharSequence) spannableString5).append((CharSequence) " ");
                                                long n = pg3.n(this.E1.a.from_id);
                                                int i14 = this.s2;
                                                if (n > 0) {
                                                    TLRPC.User W13 = oc7.r1(i14).W1(Long.valueOf(n));
                                                    ed0Var2.e(W13);
                                                    spannableStringBuilder3.append((CharSequence) m9c.r(W13));
                                                } else {
                                                    TLRPC.Chat L04 = oc7.r1(i14).L0(Long.valueOf(-n));
                                                    ed0Var2.b(L04);
                                                    if (L04 != null) {
                                                        spannableStringBuilder3.append((CharSequence) L04.title);
                                                    }
                                                }
                                                b = 4;
                                                this.e1.setOnSubtitleClick(new lz(this, n, b));
                                                SpannableString spannableString6 = new SpannableString(".");
                                                gq3 gq3Var3 = new gq3();
                                                gq3Var3.b = gm.L(1.5f);
                                                gq3Var3.c = 5.0f;
                                                spannableString6.setSpan(gq3Var3, 0, spannableString6.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString6).append((CharSequence) " ").append((CharSequence) jb6.P(this.E1.a.date));
                                                charSequence = spannableStringBuilder3;
                                                z22 = false;
                                            }
                                        }
                                    }
                                    if (charSequence != null) {
                                    }
                                    hg5Var = this.v0;
                                    if (hg5Var != null) {
                                    }
                                    hg5Var2 = this.w0;
                                    if (hg5Var2 != null) {
                                    }
                                }
                            }
                            j = 0;
                            charSequence = charSequence2;
                            b = 4;
                            i2 = 2;
                            if (charSequence != null) {
                            }
                            hg5Var = this.v0;
                            if (hg5Var != null) {
                            }
                            hg5Var2 = this.w0;
                            if (hg5Var2 != null) {
                            }
                        } else {
                            j = 0;
                            b = 4;
                            i2 = 2;
                        }
                        z48 z48Var9 = this.E1;
                        storyItem8 = z48Var9.a;
                        if (storyItem12 == storyItem8 && g4bVar8 == z48Var9.b) {
                        }
                        this.E1.l();
                        z48Var = this.E1;
                        if ((!z48Var.g || storyItem12 != z48Var.a) && (w48Var = this.G1) != null) {
                            oab oabVar10 = ((fab) w48Var).d;
                            oabVar10.Z0 = false;
                            oabVar10.U();
                        }
                        z48 z48Var10 = this.E1;
                        z8 = (z48Var10.f || (oabVar2 = this.z0) == null || (s96Var3 = oabVar2.B0) == null || !z48Var10.i(s96Var3.j()) || !this.z0.B0.e()) ? false : true;
                        if (z8 != this.w1) {
                            this.w1 = z8;
                            if (z8) {
                                p0();
                            }
                            if (this.W1 != null && (this.v1 || this.w1)) {
                                e1();
                            }
                            t38 t38Var5 = this.R1;
                            if (t38Var5 != null) {
                                t38Var5.setEnabled((!this.v1 || this.E1.f) && !this.w1);
                                z12 = true;
                                this.R1.A2(true);
                            } else {
                                z12 = true;
                            }
                            h0(z12);
                        }
                        linearLayout = this.W1;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(((!this.v1 || this.E1.f) && !this.w1) ? 8 : 0);
                        }
                        if (this.S2) {
                            t0();
                            q0();
                            this.Q2.setVisibility(0);
                            this.R2.setVisibility(0);
                            this.K2 = false;
                            this.J2 = false;
                            this.I2 = false;
                            t38 t38Var6 = this.R1;
                            if (t38Var6 != null) {
                                t38Var6.setVisibility(8);
                            }
                            b48 b48Var = this.M1;
                            if (b48Var != null) {
                                b48Var.setVisibility(8);
                            }
                            LinearLayout linearLayout2 = this.E0;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat L05 = this.r1 < j ? oc7.r1(this.s2).L0(Long.valueOf(-this.r1)) : null;
                            if (this.E1.f) {
                                if (this.R1 == null) {
                                    l0();
                                }
                                k0();
                                o0();
                                n0();
                                b2 = 0;
                                this.R1.setVisibility(0);
                            } else {
                                if ((m9c.C(this.r1) || A0()) && (t38Var2 = this.R1) != null) {
                                    t38Var2.setVisibility(8);
                                } else if (!this.s1 && ((!this.t1 || (this.u1 && (sd2.q(L05) || sd2.s0(L05)))) && (t38Var3 = this.R1) != null)) {
                                    b2 = 0;
                                    t38Var3.setVisibility(0);
                                }
                                b2 = 0;
                            }
                            t38 t38Var7 = this.R1;
                            if (t38Var7 != null) {
                                t38Var7.setOnSendButtonLongClick(this.E1.f ? new g38(this, b2) : null);
                                t38 t38Var8 = this.R1;
                                boolean z24 = this.E1.f;
                                v0(true);
                                t38Var8.M1(z24);
                                this.R1.T1(this.E1.f && !v0(true) && (this.l2 || this.R1.X0), true);
                            }
                            if (this.v1 && this.W1 == null) {
                                p0();
                            }
                            if (this.W1 != null) {
                                if (this.v1 || this.w1) {
                                    e1();
                                }
                                this.W1.setVisibility(((!this.v1 || this.E1.f) && !this.w1) ? 8 : 0);
                            }
                            t38 t38Var9 = this.R1;
                            if (t38Var9 != null) {
                                t38Var9.setEnabled((!this.v1 || this.E1.f) && !this.w1);
                            }
                            b48 b48Var2 = this.M1;
                            if (b48Var2 != null) {
                                b48Var2.setVisibility((!this.s1 || this.E1.f) ? 8 : 0);
                            }
                            FrameLayout frameLayout = this.Q2;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (m9c.C(this.r1)) {
                                q0();
                                this.R2.setVisibility(0);
                            } else {
                                wb wbVar = this.R2;
                                if (wbVar != null) {
                                    wbVar.setVisibility(8);
                                }
                            }
                            LinearLayout linearLayout3 = this.E0;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(A0() ? 8 : 0);
                            }
                        }
                        q02Var = this.S1;
                        if (q02Var != null) {
                            t38 t38Var10 = this.R1;
                            q02Var.setVisibility((t38Var10 == null || t38Var10.getVisibility() != 0 || this.E1.f) ? 8 : 0);
                        }
                        vn2Var = this.N1;
                        if (vn2Var != null) {
                            vn2Var.setVisibility((this.S2 || !this.E1.f) ? 8 : 0);
                            this.N1.a(this.B0.g0, false);
                            this.N1.setCount(this.B0.getUnreadMessagesCount());
                        }
                        nj7Var = this.Q1;
                        if (nj7Var != null) {
                            if (!this.S2) {
                                z48 z48Var11 = this.E1;
                                if (z48Var11.f && (s96Var2 = s96.N) != null && z48Var11.i(s96Var2.j())) {
                                    i6 = 0;
                                    nj7Var.setVisibility(i6);
                                    nj7 nj7Var2 = this.Q1;
                                    s96 s96Var5 = s96.N;
                                    nj7Var2.b(s96Var5 == null && s96Var5.r(), true);
                                    nj7 nj7Var3 = this.Q1;
                                    s96 s96Var6 = s96.N;
                                    nj7Var3.a(s96Var6 != null || s96Var6.G, true);
                                }
                            }
                            i6 = 8;
                            nj7Var.setVisibility(i6);
                            nj7 nj7Var22 = this.Q1;
                            s96 s96Var52 = s96.N;
                            nj7Var22.b(s96Var52 == null && s96Var52.r(), true);
                            nj7 nj7Var32 = this.Q1;
                            s96 s96Var62 = s96.N;
                            nj7Var32.a(s96Var62 != null || s96Var62.G, true);
                        }
                        if (this.P1 != null) {
                            this.O1.setVisibility((this.S2 || !this.E1.f) ? 8 : 0);
                            this.P1.setVisibility((this.S2 || !this.E1.f) ? 8 : 0);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P1.getLayoutParams();
                            nj7 nj7Var4 = this.Q1;
                            int L = gm.L((nj7Var4 == null || nj7Var4.getVisibility() != 0) ? 7.0f : 54.0f);
                            if (layoutParams.rightMargin != L) {
                                layoutParams.rightMargin = L;
                                this.P1.setLayoutParams(layoutParams);
                            }
                        }
                        z48Var2 = this.E1;
                        if (!z48Var2.f || ((z48Var2.h == null && z48Var2.g() == null && this.E1.e() == null) || this.S2)) {
                            if (this.A1) {
                                oab oabVar11 = ((fab) this.G1).d;
                                oabVar11.L0 = false;
                                oabVar11.U();
                                w48 w48Var2 = this.G1;
                                this.Z2 = false;
                                ((fab) w48Var2).e();
                            }
                            this.A0.setVisibility(8);
                        } else {
                            k5b k5bVar = this.A0.b0;
                            z48 z48Var12 = this.E1;
                            CharSequence charSequence3 = z48Var12.h;
                            g5b g2 = z48Var12.g();
                            g5b e = this.E1.e();
                            if (this.z0.Z0) {
                                z48 z48Var13 = this.E1;
                                if (!z48Var13.g && (storyItem11 = z48Var13.a) != null && storyItem11.translated) {
                                    z11 = true;
                                    k5bVar.b(charSequence3, g2, e, z11, storyItem12 != this.E1.a);
                                    this.A0.setVisibility(0);
                                }
                            }
                            z11 = false;
                            k5bVar.b(charSequence3, g2, e, z11, storyItem12 != this.E1.a);
                            this.A0.setVisibility(0);
                        }
                        storyItem9 = this.E1.a;
                        if (storyItem9 != null) {
                            TLRPC.MessageMedia messageMedia8 = storyItem9.media;
                            if (messageMedia8 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (this.B0.q(this.r1, ((TLRPC.TL_messageMediaVideoStream) messageMedia8).call)) {
                                    this.B0.p(false, false);
                                    this.A3 = j;
                                    t38 t38Var11 = this.R1;
                                    if (t38Var11 != null) {
                                        t38Var11.M(true);
                                        this.R1.C2();
                                        h0(true);
                                    }
                                }
                                this.B0.setVisibility(0);
                                this.S0.invalidate();
                                if (this.G1 != null && C0()) {
                                    ((fab) this.G1).a(this.z1, this.r1);
                                }
                                z9 = this.t1;
                                ImageView imageView3 = this.D0;
                                boolean z25 = this.I2;
                                if (z9) {
                                    if (z25 && !this.E1.f) {
                                        b = 0;
                                    }
                                    imageView3.setVisibility(b);
                                    b48 b48Var3 = this.F0;
                                    if (b48Var3 != null) {
                                        b48Var3.setVisibility(8);
                                    }
                                    this.t0.setVisibility((this.s1 || this.E1.f) ? 8 : 0);
                                    this.t0.getLayoutParams().width = gm.L(40.0f);
                                } else {
                                    if (z25 && !this.E1.f) {
                                        b = 0;
                                    }
                                    imageView3.setVisibility(b);
                                    b48 b48Var4 = this.F0;
                                    if (b48Var4 != null) {
                                        b48Var4.setVisibility((!this.J2 || this.E1.f) ? 8 : 0);
                                    }
                                    this.t0.setVisibility((this.L1 || this.E1.f) ? 8 : 0);
                                }
                                this.t0.requestLayout();
                                this.z0.e1.append(this.r1, i);
                                if (this.A1) {
                                    L0(0L);
                                    d1();
                                    this.U0.b();
                                }
                                this.B0.setLivePlayer(this.z0.B0);
                                this.B1 = 0;
                                if (this.z0.O0 != null && (storyItem10 = this.E1.a) != null) {
                                    int i15 = storyItem10.id;
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < this.z0.O0.i.size()) {
                                            k47 k47Var = (k47) this.z0.O0.i.get(i5);
                                            if (k47Var != null && k47Var.e1() == i15) {
                                                this.B1 = i5;
                                                break;
                                            }
                                            i5++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                int i16 = this.z1;
                                this.C1 = i16;
                                int i17 = this.q1;
                                this.D1 = i17;
                                if (this.z0.R0) {
                                    this.C1 = (i17 - 1) - i16;
                                }
                                z10 = this.E1.e;
                                a6 a6Var = this.o0;
                                if (z10) {
                                    a6Var.setVisibility(8);
                                } else {
                                    a6Var.setVisibility(0);
                                    this.U2 = this.E1.h() ? 1.0f : 0.5f;
                                    boolean h = this.E1.h();
                                    s09 s09Var = this.p0;
                                    if (h) {
                                        s09Var.setVisibility(0);
                                        this.q0.setVisibility(8);
                                        a6 a6Var2 = this.o0;
                                        this.z0.getClass();
                                        a6Var2.setContentDescription(jb6.L0(!oab.D1 ? 2131748071 : 2131743536));
                                    } else {
                                        s09Var.setVisibility(8);
                                        this.q0.setVisibility(0);
                                        this.o0.setContentDescription(jb6.L0(2131747885));
                                    }
                                    this.o0.setAlpha((1.0f - this.T3) * this.U2);
                                }
                                z48 z48Var14 = this.E1;
                                g4bVar5 = z48Var14.b;
                                if (g4bVar5 == null) {
                                    this.s0.a(this.s1, g4bVar5, z21 && this.R3);
                                } else {
                                    TL_stories.StoryItem storyItem21 = z48Var14.a;
                                    b8b b8bVar = this.s0;
                                    boolean z26 = this.s1;
                                    if (storyItem21 != null) {
                                        b8bVar.b(z26, storyItem21, z21 && this.R3);
                                    } else {
                                        b8bVar.b(z26, null, z21 && this.R3);
                                    }
                                }
                                this.R3 = false;
                                this.s0.setTranslationX(this.o0.getVisibility() != 0 ? -gm.L(44.0f) : 0.0f);
                                if (z7) {
                                    this.g3 = false;
                                    TL_stories.StoryItem storyItem22 = this.E1.a;
                                    if (storyItem22 == null || (reaction = storyItem22.sent_reaction) == null) {
                                        this.u0.setReaction(null);
                                    } else {
                                        this.u0.setReaction(k39.d(reaction));
                                    }
                                }
                                g4bVar6 = this.E1.b;
                                if (g4bVar6 == null && g4bVar6.J) {
                                    m0();
                                    this.Z1.set(this.E1.b.c.x);
                                    this.Z1.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.a2;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.a2 = null;
                                    }
                                    h6b h6bVar = this.Z1;
                                    if (z21) {
                                        ViewPropertyAnimator interpolator = h6bVar.animate().alpha(1.0f).setDuration(180L).setInterpolator(d53.h);
                                        this.a2 = interpolator;
                                        interpolator.start();
                                    } else {
                                        h6bVar.setAlpha(1.0f);
                                    }
                                } else if (this.Z1 != null) {
                                    ViewPropertyAnimator viewPropertyAnimator2 = this.a2;
                                    if (viewPropertyAnimator2 != null) {
                                        viewPropertyAnimator2.cancel();
                                        this.a2 = null;
                                    }
                                    if (z21 && this.Z1.getVisibility() == 0) {
                                        ViewPropertyAnimator withEndAction = this.Z1.animate().alpha(0.0f).setDuration(180L).setInterpolator(d53.h).withEndAction(new h38(this, (byte) 0));
                                        this.a2 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.Z1.setAlpha(0.0f);
                                        this.Z1.setVisibility(8);
                                    }
                                }
                                y48 y48Var = this.n1;
                                this.z0.getClass();
                                y48Var.a(oab.D1, false);
                                if (this.A1 && this.E1.a != null) {
                                    fc4.b("StoryViewer displayed story dialogId=" + this.r1 + " storyId=" + this.E1.a.id + " " + this.E1.d());
                                }
                                if (this.s1) {
                                    i2a.d(this.s2, this.r1, this.E1.a);
                                }
                                dg0 dg0Var = this.e1.b;
                                z3b z3bVar3 = this.z0.O0;
                                dg0Var.setPadding(0, 0, (z3bVar3 != null || z3bVar3.g() == this.D1) ? 0 : gm.L(56.0f), 0);
                                oc7.r1(this.s2).i4.k(this.E1.a);
                                if (!z && !this.s1 && this.p3 == null && !gda.S && gda.T) {
                                    h38 h38Var = new h38(this, (byte) 1);
                                    this.p3 = h38Var;
                                    gm.d3(h38Var, 500L);
                                }
                                hg5Var3 = this.w0;
                                if ((hg5Var3 != null || !hg5Var3.W) && this.E1.h()) {
                                    this.z0.getClass();
                                    if (oab.D1) {
                                        i4 = 0;
                                        if (oc7.d1().getInt("taptostorysoundhint", 0) < i2) {
                                            gm.r(this.G3);
                                            gm.d3(this.G3, 250L);
                                        }
                                        imageView = this.m0;
                                        if (imageView != null) {
                                            imageView.setVisibility((!A0() || B0() || ((z48Var3 = this.E1) != null && z48Var3.e)) ? i4 : 8);
                                        }
                                        imageView2 = this.n0;
                                        if (imageView2 != null) {
                                            imageView2.setVisibility((!this.E1.f || this.s0.f) ? 8 : i4);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i4 = 0;
                                imageView = this.m0;
                                if (imageView != null) {
                                }
                                imageView2 = this.n0;
                                if (imageView2 != null) {
                                }
                            }
                        }
                        this.B0.q(this.r1, null);
                        this.B0.setVisibility(8);
                        this.S0.invalidate();
                        if (this.G1 != null) {
                            ((fab) this.G1).a(this.z1, this.r1);
                        }
                        z9 = this.t1;
                        ImageView imageView32 = this.D0;
                        boolean z252 = this.I2;
                        if (z9) {
                        }
                        this.t0.requestLayout();
                        this.z0.e1.append(this.r1, i);
                        if (this.A1) {
                        }
                        this.B0.setLivePlayer(this.z0.B0);
                        this.B1 = 0;
                        if (this.z0.O0 != null) {
                            int i152 = storyItem10.id;
                            i5 = 0;
                            while (true) {
                                if (i5 < this.z0.O0.i.size()) {
                                }
                                i5++;
                            }
                        }
                        int i162 = this.z1;
                        this.C1 = i162;
                        int i172 = this.q1;
                        this.D1 = i172;
                        if (this.z0.R0) {
                        }
                        z10 = this.E1.e;
                        a6 a6Var3 = this.o0;
                        if (z10) {
                        }
                        z48 z48Var142 = this.E1;
                        g4bVar5 = z48Var142.b;
                        if (g4bVar5 == null) {
                        }
                        this.R3 = false;
                        this.s0.setTranslationX(this.o0.getVisibility() != 0 ? -gm.L(44.0f) : 0.0f);
                        if (z7) {
                        }
                        g4bVar6 = this.E1.b;
                        if (g4bVar6 == null) {
                        }
                        if (this.Z1 != null) {
                        }
                        y48 y48Var2 = this.n1;
                        this.z0.getClass();
                        y48Var2.a(oab.D1, false);
                        if (this.A1) {
                            fc4.b("StoryViewer displayed story dialogId=" + this.r1 + " storyId=" + this.E1.a.id + " " + this.E1.d());
                        }
                        if (this.s1) {
                        }
                        dg0 dg0Var2 = this.e1.b;
                        z3b z3bVar32 = this.z0.O0;
                        dg0Var2.setPadding(0, 0, (z3bVar32 != null || z3bVar32.g() == this.D1) ? 0 : gm.L(56.0f), 0);
                        oc7.r1(this.s2).i4.k(this.E1.a);
                        if (!z) {
                            h38 h38Var2 = new h38(this, (byte) 1);
                            this.p3 = h38Var2;
                            gm.d3(h38Var2, 500L);
                        }
                        hg5Var3 = this.w0;
                        if (hg5Var3 != null) {
                        }
                        this.z0.getClass();
                        if (oab.D1) {
                        }
                        i4 = 0;
                        imageView = this.m0;
                        if (imageView != null) {
                        }
                        imageView2 = this.n0;
                        if (imageView2 != null) {
                        }
                    }
                }
                z7 = false;
                if (g4bVar8 != null) {
                }
                t38Var = this.R1;
                if (t38Var != null) {
                }
                if (this.E1.f) {
                }
                this.a1.c();
                this.M0 = 0L;
                this.O0 = false;
                g4bVar3 = this.E1.b;
                if (g4bVar3 != null) {
                }
                g48 g48Var2 = this.S0;
                u31Var = u31.x;
                if (u31Var != null) {
                    u31Var.b();
                }
                this.A0.J();
                g0();
                z7 = true;
                if (z7) {
                }
                this.e1.setOnSubtitleClick(null);
                this.F3 = 0;
                R0(this.r1, false, this.E1.f);
                g4bVar4 = this.E1.b;
                if (g4bVar4 != null) {
                }
                j = 0;
                charSequence = charSequence2;
                b = 4;
                i2 = 2;
                if (charSequence != null) {
                }
                hg5Var = this.v0;
                if (hg5Var != null) {
                }
                hg5Var2 = this.w0;
                if (hg5Var2 != null) {
                }
                z48 z48Var92 = this.E1;
                storyItem8 = z48Var92.a;
                if (storyItem12 == storyItem8) {
                }
                this.E1.l();
                z48Var = this.E1;
                if (!z48Var.g) {
                }
                oab oabVar102 = ((fab) w48Var).d;
                oabVar102.Z0 = false;
                oabVar102.U();
                z48 z48Var102 = this.E1;
                if (z48Var102.f) {
                }
                if (z8 != this.w1) {
                }
                linearLayout = this.W1;
                if (linearLayout != null) {
                }
                if (this.S2) {
                }
                q02Var = this.S1;
                if (q02Var != null) {
                }
                vn2Var = this.N1;
                if (vn2Var != null) {
                }
                nj7Var = this.Q1;
                if (nj7Var != null) {
                }
                if (this.P1 != null) {
                }
                z48Var2 = this.E1;
                if (z48Var2.f) {
                }
                if (this.A1) {
                }
                this.A0.setVisibility(8);
                storyItem9 = this.E1.a;
                if (storyItem9 != null) {
                }
                this.B0.q(this.r1, null);
                this.B0.setVisibility(8);
                this.S0.invalidate();
                if (this.G1 != null) {
                }
                z9 = this.t1;
                ImageView imageView322 = this.D0;
                boolean z2522 = this.I2;
                if (z9) {
                }
                this.t0.requestLayout();
                this.z0.e1.append(this.r1, i);
                if (this.A1) {
                }
                this.B0.setLivePlayer(this.z0.B0);
                this.B1 = 0;
                if (this.z0.O0 != null) {
                }
                int i1622 = this.z1;
                this.C1 = i1622;
                int i1722 = this.q1;
                this.D1 = i1722;
                if (this.z0.R0) {
                }
                z10 = this.E1.e;
                a6 a6Var32 = this.o0;
                if (z10) {
                }
                z48 z48Var1422 = this.E1;
                g4bVar5 = z48Var1422.b;
                if (g4bVar5 == null) {
                }
                this.R3 = false;
                this.s0.setTranslationX(this.o0.getVisibility() != 0 ? -gm.L(44.0f) : 0.0f);
                if (z7) {
                }
                g4bVar6 = this.E1.b;
                if (g4bVar6 == null) {
                }
                if (this.Z1 != null) {
                }
                y48 y48Var22 = this.n1;
                this.z0.getClass();
                y48Var22.a(oab.D1, false);
                if (this.A1) {
                }
                if (this.s1) {
                }
                dg0 dg0Var22 = this.e1.b;
                z3b z3bVar322 = this.z0.O0;
                dg0Var22.setPadding(0, 0, (z3bVar322 != null || z3bVar322.g() == this.D1) ? 0 : gm.L(56.0f), 0);
                oc7.r1(this.s2).i4.k(this.E1.a);
                if (!z) {
                }
                hg5Var3 = this.w0;
                if (hg5Var3 != null) {
                }
                this.z0.getClass();
                if (oab.D1) {
                }
                i4 = 0;
                imageView = this.m0;
                if (imageView != null) {
                }
                imageView2 = this.n0;
                if (imageView2 != null) {
                }
            }
        }
        z6 = z3;
        storyItem4 = this.E1.a;
        if (storyItem4 != null) {
            this.z0.P0 = storyItem4.id;
        }
        this.z0.o0.A();
        this.O2 = true;
        if (!this.s1) {
        }
        i1(false);
        z48 z48Var72 = this.E1;
        TL_stories.StoryItem storyItem172 = z48Var72.a;
        g4b g4bVar92 = z48Var72.b;
        if ((storyItem172 == null ? storyItem172.id : (g4bVar92 == null || (g6bVar = g4bVar92.c) == null) ? 0 : g6bVar.f) == (storyItem12 == null ? storyItem12.id : (g4bVar8 == null || (g6bVar2 = g4bVar8.c) == null) ? 0 : g6bVar2.f)) {
        }
        if (z21) {
        }
        oabVar = this.z0;
        if (oabVar != null) {
            i7 = this.F3;
            groupCall = s96Var4.s;
            if (i7 != Math.max(1, groupCall != null ? 0 : groupCall.participants_count)) {
            }
        }
        z7 = false;
        if (g4bVar8 != null) {
        }
        t38Var = this.R1;
        if (t38Var != null) {
        }
        if (this.E1.f) {
        }
        this.a1.c();
        this.M0 = 0L;
        this.O0 = false;
        g4bVar3 = this.E1.b;
        if (g4bVar3 != null) {
        }
        g48 g48Var22 = this.S0;
        u31Var = u31.x;
        if (u31Var != null) {
        }
        this.A0.J();
        g0();
        z7 = true;
        if (z7) {
        }
        this.e1.setOnSubtitleClick(null);
        this.F3 = 0;
        R0(this.r1, false, this.E1.f);
        g4bVar4 = this.E1.b;
        if (g4bVar4 != null) {
        }
        j = 0;
        charSequence = charSequence2;
        b = 4;
        i2 = 2;
        if (charSequence != null) {
        }
        hg5Var = this.v0;
        if (hg5Var != null) {
        }
        hg5Var2 = this.w0;
        if (hg5Var2 != null) {
        }
        z48 z48Var922 = this.E1;
        storyItem8 = z48Var922.a;
        if (storyItem12 == storyItem8) {
        }
        this.E1.l();
        z48Var = this.E1;
        if (!z48Var.g) {
        }
        oab oabVar1022 = ((fab) w48Var).d;
        oabVar1022.Z0 = false;
        oabVar1022.U();
        z48 z48Var1022 = this.E1;
        if (z48Var1022.f) {
        }
        if (z8 != this.w1) {
        }
        linearLayout = this.W1;
        if (linearLayout != null) {
        }
        if (this.S2) {
        }
        q02Var = this.S1;
        if (q02Var != null) {
        }
        vn2Var = this.N1;
        if (vn2Var != null) {
        }
        nj7Var = this.Q1;
        if (nj7Var != null) {
        }
        if (this.P1 != null) {
        }
        z48Var2 = this.E1;
        if (z48Var2.f) {
        }
        if (this.A1) {
        }
        this.A0.setVisibility(8);
        storyItem9 = this.E1.a;
        if (storyItem9 != null) {
        }
        this.B0.q(this.r1, null);
        this.B0.setVisibility(8);
        this.S0.invalidate();
        if (this.G1 != null) {
        }
        z9 = this.t1;
        ImageView imageView3222 = this.D0;
        boolean z25222 = this.I2;
        if (z9) {
        }
        this.t0.requestLayout();
        this.z0.e1.append(this.r1, i);
        if (this.A1) {
        }
        this.B0.setLivePlayer(this.z0.B0);
        this.B1 = 0;
        if (this.z0.O0 != null) {
        }
        int i16222 = this.z1;
        this.C1 = i16222;
        int i17222 = this.q1;
        this.D1 = i17222;
        if (this.z0.R0) {
        }
        z10 = this.E1.e;
        a6 a6Var322 = this.o0;
        if (z10) {
        }
        z48 z48Var14222 = this.E1;
        g4bVar5 = z48Var14222.b;
        if (g4bVar5 == null) {
        }
        this.R3 = false;
        this.s0.setTranslationX(this.o0.getVisibility() != 0 ? -gm.L(44.0f) : 0.0f);
        if (z7) {
        }
        g4bVar6 = this.E1.b;
        if (g4bVar6 == null) {
        }
        if (this.Z1 != null) {
        }
        y48 y48Var222 = this.n1;
        this.z0.getClass();
        y48Var222.a(oab.D1, false);
        if (this.A1) {
        }
        if (this.s1) {
        }
        dg0 dg0Var222 = this.e1.b;
        z3b z3bVar3222 = this.z0.O0;
        dg0Var222.setPadding(0, 0, (z3bVar3222 != null || z3bVar3222.g() == this.D1) ? 0 : gm.L(56.0f), 0);
        oc7.r1(this.s2).i4.k(this.E1.a);
        if (!z) {
        }
        hg5Var3 = this.w0;
        if (hg5Var3 != null) {
        }
        this.z0.getClass();
        if (oab.D1) {
        }
        i4 = 0;
        imageView = this.m0;
        if (imageView != null) {
        }
        imageView2 = this.n0;
        if (imageView2 != null) {
        }
    }

    public final void d0(Runnable runnable) {
        if (oc7.r1(this.s2).u2()) {
            h5.b(this.s2);
            return;
        }
        int i = gda.b0;
        if (i <= 0 || !this.a3) {
            runnable.run();
            return;
        }
        int i2 = i - 1;
        gda.b0 = i2;
        gda.Q(i2);
        he heVar = new he(0, this.r0, getContext());
        heVar.setTitle(jb6.M0(2131744574, null));
        heVar.m(jb6.M0(2131744575, null));
        String M0 = jb6.M0(2131746478, null);
        cf cfVar = new cf(runnable, (byte) 15);
        heVar.m0 = M0;
        heVar.n0 = cfVar;
        String M02 = jb6.M0(2131752542, null);
        bh7 bh7Var = new bh7((byte) 27);
        heVar.o0 = M02;
        heVar.p0 = bh7Var;
        heVar.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1() {
        ArrayList arrayList;
        int i;
        ImageReceiver imageReceiver;
        boolean isEmpty;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i2;
        String str;
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        int i3;
        String str2;
        TL_stories.StoryItem storyItem2;
        int i4;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String sb;
        int max = (int) (Math.max(gm.b1().x, gm.b1().y) / gm.p);
        String n = td4.n(max, max, "_");
        ArrayList arrayList11 = this.H3;
        arrayList11.clear();
        ArrayList arrayList12 = this.I3;
        arrayList12.clear();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList = this.X0;
            if (i6 >= arrayList.size()) {
                break;
            }
            ((d29) arrayList.get(i6)).b(false);
            i6++;
        }
        arrayList.clear();
        int i7 = 0;
        while (i7 < 2) {
            int i8 = this.z1;
            if (i7 == 0) {
                i = i8 - 1;
                imageReceiver = this.V0;
                if (i < 0) {
                    imageReceiver.f();
                    int i9 = i5;
                    arrayList7 = arrayList11;
                    i4 = i9;
                    arrayList9 = arrayList;
                    arrayList8 = arrayList12;
                    i7++;
                    ArrayList arrayList13 = arrayList7;
                    i5 = i4;
                    arrayList11 = arrayList13;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                }
                ArrayList arrayList14 = this.m1;
                isEmpty = arrayList14.isEmpty();
                arrayList2 = this.l1;
                if (isEmpty && i >= arrayList2.size()) {
                    Q0((g4b) arrayList14.get(i - arrayList2.size()), imageReceiver, n);
                } else if (!arrayList2.isEmpty()) {
                    if (i < 0) {
                        i = i5;
                    }
                    if (i >= arrayList2.size()) {
                        i = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList2.get(i);
                    long j = this.r1;
                    storyItem3.dialogId = j;
                    g4b s = this.I1.s(j, storyItem3);
                    if (s != null) {
                        Q0(s, imageReceiver, n);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        i4 = i5;
                        arrayList5 = arrayList;
                        i2 = i7;
                        str = null;
                        storyItem = storyItem3;
                    } else {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        int i10 = (messageMedia == null || !k47.J4(messageMedia.getDocument())) ? i5 : 1;
                        String str3 = storyItem3.attachPath;
                        TLRPC.MessageMedia messageMedia2 = storyItem3.media;
                        int i11 = i10;
                        if (str3 != null) {
                            if (messageMedia2 == null) {
                                i11 = str3.toLowerCase().endsWith(".mp4");
                            }
                            String str4 = storyItem3.attachPath;
                            if (i11 != 0) {
                                str2 = null;
                                arrayList3 = arrayList11;
                                i2 = i7;
                                arrayList4 = arrayList12;
                                storyItem2 = storyItem3;
                                arrayList5 = arrayList;
                                i3 = i5;
                                imageReceiver.Y(gn5.g(str4), n.concat("_pframe"), gn5.g(storyItem3.firstFramePath), n, null, null, null, 0L, null, null, 0);
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                i3 = i5;
                                arrayList5 = arrayList;
                                i2 = i7;
                                str2 = null;
                                storyItem2 = storyItem3;
                                String str5 = n;
                                imageReceiver.Z(gn5.g(str4), str5, null, null, null, 0L, null, null, 0);
                                n = str5;
                            }
                            str = str2;
                            storyItem = storyItem2;
                            i4 = i3;
                        } else {
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            boolean z = i5;
                            arrayList5 = arrayList;
                            i2 = i7;
                            ImageReceiver imageReceiver2 = imageReceiver;
                            if (i10 != 0) {
                                TLRPC.PhotoSize w = bc4.w(messageMedia2.getDocument().thumbs, 1000, z, null, z);
                                gn5 b = gn5.b(h4b.B(this.s2, storyItem3));
                                String concat = n.concat("_pframe");
                                gn5 c = gn5.c(w, storyItem3.media.getDocument());
                                storyItem = storyItem3;
                                str = null;
                                imageReceiver2.Y(b, concat, c, n, null, null, null, 0L, null, storyItem, 0);
                                i4 = z;
                            } else {
                                str = null;
                                storyItem = storyItem3;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.f();
                                    i4 = z;
                                } else {
                                    TLRPC.PhotoSize w2 = bc4.w(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID, z, null, z);
                                    bc4.u(800, photo.sizes);
                                    imageReceiver2.Y(null, null, gn5.i(w2, photo), n, null, null, null, 0L, null, storyItem, 0);
                                    i4 = z;
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (messageMedia3 == null || !k47.J4(messageMedia3.getDocument())) {
                        arrayList7 = arrayList3;
                        i7 = i2;
                        arrayList8 = arrayList4;
                    } else {
                        TLRPC.Document B = h4b.B(this.s2, storyItem);
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = bc4.G(this.s2).F(storyItem);
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("?account=");
                            sb2.append(this.s2);
                            sb2.append("&id=");
                            sb2.append(B.id);
                            sb2.append("&hash=");
                            sb2.append(B.access_hash);
                            sb2.append("&dc=");
                            sb2.append(B.dc_id);
                            sb2.append("&size=");
                            sb2.append(B.size);
                            sb2.append("&mime=");
                            sb2.append(URLEncoder.encode(B.mime_type, "UTF-8"));
                            sb2.append("&rid=");
                            sb2.append(storyItem.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(bc4.B(B), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = B.file_reference;
                            if (bArr == null) {
                                bArr = new byte[i4];
                            }
                            sb2.append(Utilities.f(bArr));
                            sb2.append("&sid=");
                            sb2.append(storyItem.id);
                            sb2.append("&did=");
                            sb2.append(storyItem.dialogId);
                            sb = sb2.toString();
                            arrayList7 = arrayList3;
                        } catch (UnsupportedEncodingException e) {
                            e = e;
                            arrayList7 = arrayList3;
                        }
                        try {
                            arrayList7.add(Uri.parse("tg://" + bc4.r(str, B) + sb));
                            arrayList8 = arrayList4;
                            try {
                                arrayList8.add(B);
                                i7 = i2;
                                if (i7 == 1) {
                                    try {
                                        if (ir3.d()) {
                                            bc4.G(this.s2).X(B, storyItem, 1, 1);
                                        }
                                    } catch (UnsupportedEncodingException e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        if (storyItem.media_areas != null) {
                                        }
                                        arrayList9 = arrayList5;
                                        i7++;
                                        ArrayList arrayList132 = arrayList7;
                                        i5 = i4;
                                        arrayList11 = arrayList132;
                                        arrayList12 = arrayList8;
                                        arrayList = arrayList9;
                                    }
                                }
                            } catch (UnsupportedEncodingException e3) {
                                e = e3;
                                i7 = i2;
                            }
                        } catch (UnsupportedEncodingException e4) {
                            e = e4;
                            i7 = i2;
                            arrayList8 = arrayList4;
                            e.printStackTrace();
                            if (storyItem.media_areas != null) {
                            }
                            arrayList9 = arrayList5;
                            i7++;
                            ArrayList arrayList1322 = arrayList7;
                            i5 = i4;
                            arrayList11 = arrayList1322;
                            arrayList12 = arrayList8;
                            arrayList = arrayList9;
                        }
                    }
                    if (storyItem.media_areas != null) {
                        int i12 = i4;
                        while (i12 < storyItem.media_areas.size()) {
                            if (storyItem.media_areas.get(i12) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i12);
                                d29 d29Var = new d29(this);
                                d29Var.e(k39.d(tL_mediaAreaSuggestedReaction.reaction));
                                d29Var.b(this.Q0);
                                arrayList10 = arrayList5;
                                arrayList10.add(d29Var);
                            } else {
                                arrayList10 = arrayList5;
                            }
                            i12++;
                            arrayList5 = arrayList10;
                        }
                    }
                    arrayList9 = arrayList5;
                    i7++;
                    ArrayList arrayList13222 = arrayList7;
                    i5 = i4;
                    arrayList11 = arrayList13222;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                }
                int i92 = i5;
                arrayList7 = arrayList11;
                i4 = i92;
                arrayList9 = arrayList;
                arrayList8 = arrayList12;
                i7++;
                ArrayList arrayList132222 = arrayList7;
                i5 = i4;
                arrayList11 = arrayList132222;
                arrayList12 = arrayList8;
                arrayList = arrayList9;
            } else {
                i = i8 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.W0;
                if (i >= storiesCount) {
                    imageReceiver3.f();
                    int i922 = i5;
                    arrayList7 = arrayList11;
                    i4 = i922;
                    arrayList9 = arrayList;
                    arrayList8 = arrayList12;
                    i7++;
                    ArrayList arrayList1322222 = arrayList7;
                    i5 = i4;
                    arrayList11 = arrayList1322222;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                } else {
                    imageReceiver = imageReceiver3;
                    ArrayList arrayList142 = this.m1;
                    isEmpty = arrayList142.isEmpty();
                    arrayList2 = this.l1;
                    if (isEmpty) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    int i9222 = i5;
                    arrayList7 = arrayList11;
                    i4 = i9222;
                    arrayList9 = arrayList;
                    arrayList8 = arrayList12;
                    i7++;
                    ArrayList arrayList13222222 = arrayList7;
                    i5 = i4;
                    arrayList11 = arrayList13222222;
                    arrayList12 = arrayList8;
                    arrayList = arrayList9;
                }
            }
        }
        int i13 = i5;
        ArrayList arrayList15 = arrayList11;
        ArrayList arrayList16 = arrayList12;
        fab fabVar = (fab) this.G1;
        oab oabVar = fabVar.d;
        if (gda.j() && gda.b()) {
            boolean z2 = oabVar.H0;
            ArrayList arrayList17 = oabVar.M0;
            if (z2) {
                return;
            }
            for (int i14 = i13; i14 < arrayList17.size(); i14++) {
                for (int i15 = i13; i15 < arrayList15.size(); i15++) {
                    if (((Uri) arrayList15.get(i15)).equals(((nab) arrayList17.get(i14)).uri)) {
                        arrayList15.remove(i15);
                    }
                }
            }
            for (int i16 = i13; i16 < arrayList15.size(); i16++) {
                Uri uri = (Uri) arrayList15.get(i16);
                nab nabVar = new nab(oabVar, oabVar.D0, oabVar.C0);
                nabVar.setOnSeekUpdate(new b7b((Object) fabVar, (Object) nabVar, (byte) 5));
                nabVar.uri = uri;
                TLRPC.Document document = (TLRPC.Document) arrayList16.get(i16);
                nabVar.document = document;
                if (document != null) {
                    kd4.J.put(Long.valueOf(document.id), Integer.valueOf(i13));
                } else {
                    ConcurrentHashMap concurrentHashMap = kd4.I;
                }
                nabVar.preparePlayer(uri, oab.D1, oab.B1);
                arrayList17.add(nabVar);
                if (arrayList17.size() > 2) {
                    ((nab) arrayList17.remove(i13)).release(null);
                }
            }
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        s96 s96Var;
        int i3 = nm7.z5;
        oab oabVar = this.z0;
        boolean z = false;
        if (i == i3 || (i == nm7.B5 && oabVar.O0 == objArr[0])) {
            w48 w48Var = this.G1;
            if (w48Var == null || !((fab) w48Var).d.H0) {
                if (this.A1) {
                    h1();
                    if (this.q1 == 0) {
                        if (this.u2) {
                            return;
                        }
                        this.u2 = true;
                        ((fab) this.G1).j();
                        return;
                    }
                    int i4 = this.z1;
                    ArrayList arrayList = this.l1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.m1;
                    if (i4 >= arrayList2.size() + size) {
                        this.z1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    c1(false);
                    if (this.s1 || this.t1) {
                        i1(true);
                    }
                }
                TL_stories.PeerStories peerStories = oabVar.Q0;
                if (peerStories != null) {
                    this.I1.U(peerStories, true);
                } else {
                    long j = this.r1;
                    if (j != 0) {
                        h4b h4bVar = this.I1;
                        TL_stories.PeerStories x = h4bVar.x(j);
                        if (x == null) {
                            x = h4bVar.y(j);
                            z = true;
                        }
                        h4bVar.U(x, z);
                    }
                }
                a8 a8Var = this.i1;
                if (a8Var != null) {
                    a8Var.animate().alpha((this.I1.L(this.r1) && this.E1.e && !gda.b()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.o3) {
            c1(false);
            return;
        }
        if (i == nm7.m4) {
            this.A0.b0.invalidate();
            return;
        }
        if (i == nm7.H5) {
            h0(true);
            return;
        }
        if (i == nm7.d3) {
            xy n = oc7.r1(this.s2).N1().n();
            if (n == null || !n.a(this.s2, 1) || this.G1 == null) {
                return;
            }
            qv0 qv0Var = new qv0(this, (byte) 9);
            Context W = gm.W(getContext());
            if (W == null) {
                W = LaunchActivity.H1;
            }
            ((fab) this.G1).h(new i46(n.b(), this.s2, null, W, qv0Var));
            return;
        }
        if (i == nm7.k3) {
            TL_account.RequirementToContact L2 = oc7.r1(this.s2).L2(this.r1);
            boolean z2 = this.r1 >= 0 && !z8c.h(this.s2).p() && (L2 instanceof TL_account.requirementToContactPremium);
            if (this.v1 == z2 && this.x1 == pg3.j(L2)) {
                return;
            }
            this.v1 = z2;
            this.x1 = pg3.j(L2);
            c1(false);
            h0(true);
            return;
        }
        if (i == nm7.T) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.r1 == (-((TLRPC.ChatFull) obj).id)) {
                c1(false);
                return;
            }
            return;
        }
        if (i != nm7.G2) {
            if (i == nm7.E && ((Boolean) objArr[2]).booleanValue()) {
                F0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (oabVar == null || (s96Var = oabVar.B0) == null || s96Var.j() != longValue) {
            return;
        }
        c1(false);
        t38 t38Var = this.R1;
        if (t38Var != null) {
            t38Var.M(true);
            this.R1.A2(true);
            h0(true);
        }
        n38 n38Var = this.B0;
        if (n38Var != null) {
            s96 s96Var2 = n38Var.Q;
            if (n38Var.I != (s96Var2 != null ? s96Var2.m() : 0L)) {
                n38Var.e.O(true);
            }
        }
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        px1 px1Var;
        Canvas canvas2;
        ho hoVar;
        ho hoVar2;
        j1();
        if (this.t1 && (hoVar2 = this.G0) != null) {
            hoVar2.setBounds(0, 0, getMeasuredWidth(), gm.L(40.0f));
        }
        if (this.t1 && (hoVar = this.H0) != null) {
            hoVar.setBounds(0, 0, getMeasuredWidth(), gm.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z = this.k3;
        LinearLayout linearLayout = this.E0;
        b48 b48Var = this.t0;
        if (z) {
            float measuredWidth = (b48Var.getMeasuredWidth() / 2.0f) + b48Var.getX() + linearLayout.getX();
            float measuredHeight = (b48Var.getMeasuredHeight() / 2.0f) + b48Var.getY() + linearLayout.getY();
            int L = gm.L(24.0f);
            float f = L / 2.0f;
            float R1 = gm.R1(this.m3, measuredWidth - f, d53.g.getInterpolation(this.l3));
            float R12 = gm.R1(this.n3, measuredHeight - f, this.l3);
            int U1 = gm.U1(this.l3, this.o3, L);
            if (this.f3) {
                vm vmVar = this.e3;
                if (vmVar != null) {
                    float f2 = U1;
                    vmVar.setBounds((int) R1, (int) R12, (int) (R1 + f2), (int) (R12 + f2));
                    this.e3.draw(canvas);
                }
            } else {
                float f3 = U1;
                ImageReceiver imageReceiver = this.d3;
                imageReceiver.i0(R1, R12, f3, f3);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.g3) {
            float measuredWidth2 = (b48Var.getMeasuredWidth() / 2.0f) + b48Var.getX() + linearLayout.getX();
            float measuredHeight2 = (b48Var.getMeasuredHeight() / 2.0f) + b48Var.getY() + linearLayout.getY();
            int L2 = gm.L(120.0f);
            if (this.f3) {
                xm xmVar = this.c3;
                if (xmVar != null) {
                    float f4 = L2 / 2.0f;
                    xmVar.e((int) (measuredWidth2 - f4), (int) (measuredHeight2 - f4), (int) (measuredWidth2 + f4), (int) (measuredHeight2 + f4));
                    this.c3.b(canvas);
                    if (this.c3.c()) {
                        this.c3.d(this);
                        this.c3 = null;
                        this.g3 = false;
                    }
                } else {
                    this.g3 = false;
                }
            } else {
                float f5 = L2;
                float f6 = f5 / 2.0f;
                float f7 = measuredWidth2 - f6;
                float f8 = measuredHeight2 - f6;
                ImageReceiver imageReceiver2 = this.b3;
                imageReceiver2.i0(f7, f8, f5, f5);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.y() != null && imageReceiver2.y().v()) {
                    this.g3 = false;
                }
            }
        }
        t38 t38Var = this.R1;
        if (t38Var != null) {
            px1 px1Var2 = t38Var.o2;
            px1 px1Var3 = t38Var.p2;
            if (t38Var.getAlpha() == 0.0f || (px1Var = t38Var.f1) == null || px1Var.getParent() == null || t38Var.f1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(t38Var.f1.getX() + px1Var2.getX() + px1Var3.getX() + t38Var.getX(), t38Var.f1.getY() + px1Var2.getY() + px1Var3.getY() + t38Var.getY());
            if (t38Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, t38Var.getMeasuredWidth(), t38Var.getMeasuredHeight(), (int) (t38Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            t38Var.f1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        nz4 nz4Var;
        float L;
        if (view == this.T2) {
            canvas.save();
            canvas.clipRect(0.0f, this.T2.getY(), getMeasuredWidth(), this.T2.getY() + this.T2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        t38 t38Var = this.R1;
        Paint paint = this.d2;
        b48 b48Var = this.t0;
        y48 y48Var = this.n1;
        if (view == t38Var) {
            float f = this.g2;
            z48 z48Var = this.E1;
            if (f > 0.0f && !z48Var.f) {
                y48Var.l.setAlpha((int) (f * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y48Var.l);
            }
            RectF rectF = y48Var.h;
            RectF rectF2 = y48Var.i;
            RectF rectF3 = y48Var.j;
            rectF.set(this.R1.getX(), this.R1.getY() + this.R1.getAnimatedTop() + gm.L(1.33f), this.R1.getX() + this.R1.getMeasuredWidth(), this.R1.getY() + this.R1.getMeasuredHeight());
            float L2 = gm.L(40.0f);
            if (z48Var.f) {
                L = gm.L(46.0f);
                L2 = gm.L(46.0f);
                nj7 nj7Var = this.Q1;
                if (nj7Var != null && nj7Var.getVisibility() == 0) {
                    L2 += gm.L(46.0f);
                }
            } else {
                if (this.I2) {
                    L2 += gm.L(46.0f);
                }
                if (this.J2 && this.t1) {
                    L2 += gm.L(46.0f);
                }
                if (b48Var != null && b48Var.getVisibility() == 0) {
                    L2 = (L2 - gm.L(40.0f)) + b48Var.getLayoutParams().width;
                }
                L = 0.0f;
            }
            rectF2.set(gm.L(10.0f) + L, ((this.R1.getY() + this.R1.getMeasuredHeight()) - gm.L(5.0f)) - gm.L(38.0f), (getMeasuredWidth() - gm.L(10.0f)) - L2, (this.R1.getY() + this.R1.getMeasuredHeight()) - gm.L(5.0f));
            this.R1.setTranslationX((1.0f - this.g2) * L);
            this.R1.getEditField().setTranslationY(td4.A(1.0f, this.g2, -gm.L(2.0f), this.R1.getMeasuredHeight() > gm.L(50.0f) ? ((1.0f - this.g2) * (this.R1.getMeasuredHeight() - gm.L(50.0f))) + 0.0f : 0.0f));
            float L3 = gm.L(50.0f) / 2.0f;
            gm.X1(rectF2, y48Var.h, this.g2, rectF3);
            im0 im0Var = this.b2;
            if (im0Var != null) {
                im0Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                im0Var.r(L3);
                im0Var.setAlpha((int) ((1.0f - this.T3) * (1.0f - this.h2) * 255.0f * getHideInterfaceAlpha()));
                im0Var.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.g2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (t38Var != null && t38Var.S0(view)) {
                float L4 = gm.L(30.0f);
                RectF rectF4 = y48Var.k;
                RectF rectF5 = y48Var.k;
                rectF4.set(0.0f, view.getY() + gm.L(1.0f), getWidth(), gm.L(20.0f) + getHeight());
                Path path = this.Q3;
                path.rewind();
                path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                im0 im0Var2 = this.c2;
                if (im0Var2 != null) {
                    im0Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    im0Var2.s(L4, L4, L4, L4);
                    im0Var2.setAlpha(nm7.d4);
                    im0Var2.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, L4, L4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.V1 || this.R1 == null) {
                if (view == this.h3) {
                    view.setTranslationY((this.E0.getY() + (b48Var.getY() + (-(r2.getMeasuredHeight() - this.h3.getPaddingBottom())))) - gm.L(18.0f));
                } else {
                    g48 g48Var = this.S0;
                    if (view == g48Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (nz4Var = this.w3) != null && !nz4Var.r) {
                        RecordingCanvas i = nz4Var.i(getMeasuredWidth(), getMeasuredHeight());
                        i.drawColor(on2.f(0.2f, -16777216, -1));
                        i.translate(g48Var.getX(), g48Var.getY());
                        view.draw(i);
                        nz4Var.j();
                    }
                }
            } else {
                view.setTranslationY(((this.R1.getY() + this.R1.getAnimatedTop()) + (-r2.getMeasuredHeight())) - gm.L(18.0f));
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i) {
        this.u2 = false;
        this.L2 = true;
        this.r3 = false;
        this.t1 = false;
        this.u1 = false;
        long j = this.r1;
        x48 x48Var = this.e1;
        pc0 pc0Var = this.d1;
        if (j >= 0) {
            this.s1 = j == z8c.h(this.s2).e();
            TLRPC.User W1 = oc7.r1(this.s2).W1(Long.valueOf(this.r1));
            TL_account.RequirementToContact L2 = oc7.r1(this.s2).L2(this.r1);
            this.v1 = !z8c.h(this.s2).p() && (L2 instanceof TL_account.requirementToContactPremium);
            this.x1 = pg3.j(L2);
            pc0Var.q(W1);
            x48Var.a.getImageReceiver().U(W1, pc0Var, null);
            R0(this.r1, true, false);
        } else {
            this.s1 = false;
            this.t1 = true;
            if (this.I1.g(j)) {
                this.r3 = true;
            } else {
                boolean z = e21.a;
            }
            TLRPC.Chat L0 = oc7.r1(this.s2).L0(Long.valueOf(-this.r1));
            boolean V = sd2.V(L0);
            this.u1 = !V;
            if (!V && oc7.r1(this.s2).M0(-this.r1) == null) {
                cf7.Y(this.s2).C0(-this.r1, true, new CountDownLatch(1), false, false, 0);
            }
            this.v1 = this.u1 && !sd2.q(L0);
            this.x1 = oc7.r1(this.s2).L1(this.r1);
            pc0Var.p(L0);
            x48Var.a.getImageReceiver().U(L0, pc0Var, null);
            R0(this.r1, true, false);
        }
        if (this.A1 && (this.s1 || this.t1)) {
            h4b h4bVar = this.I1;
            long j2 = this.r1;
            vh6 vh6Var = h4bVar.m;
            ihc ihcVar = (ihc) vh6Var.f(j2);
            if (ihcVar == null) {
                ihcVar = new ihc(h4bVar.a, j2, h4bVar);
                vh6Var.k(ihcVar, j2);
            }
            ihcVar.b(true);
        }
        h1();
        this.z1 = i;
        if (i < 0) {
            this.z1 = 0;
        }
        this.M0 = 0L;
        this.O0 = false;
        this.y3 = null;
        this.z3 = null;
        boolean z2 = this.t1;
        g48 g48Var = this.S0;
        oab oabVar = this.z0;
        int i2 = 8;
        z48 z48Var = this.E1;
        if (z2) {
            r0();
            if (this.R1 == null && (this.u1 || z48Var.f)) {
                l0();
            }
            if (this.R1 != null) {
                TLRPC.Chat L02 = oc7.r1(this.s2).L0(Long.valueOf(-this.r1));
                t38 t38Var = this.R1;
                if (z48Var.f || (!A0() && this.u1 && (sd2.q(L02) || sd2.s0(L02)))) {
                    i2 = 0;
                }
                t38Var.setVisibility(i2);
                t38 t38Var2 = this.R1;
                boolean z3 = z48Var.f;
                v0(true);
                t38Var2.M1(z3);
                this.R1.T1(z48Var.f && !v0(true) && (this.l2 || this.R1.X0), true);
                qu3 editField = this.R1.getEditField();
                long j3 = this.r1;
                TL_stories.StoryItem storyItem = z48Var.a;
                oabVar.getClass();
                editField.setText(oab.x(j3, storyItem));
                this.R1.F1(this.s2, this.r1);
                this.R1.v2(L02, null);
            }
            ho hoVar = this.G0;
            r63 r63Var = this.r0;
            if (hoVar == null) {
                ho hoVar2 = new ho(false, false, false);
                this.G0 = hoVar2;
                b48 b48Var = this.t0;
                hoVar2.setCallback(b48Var);
                this.G0.u(r63Var.h(cmb.F6));
                this.G0.w(gm.L(14.0f));
                this.I0 = new ln(b48Var);
            }
            b48 b48Var2 = this.F0;
            if (b48Var2 != null && this.H0 == null) {
                ho hoVar3 = new ho(false, false, false);
                this.H0 = hoVar3;
                hoVar3.setCallback(b48Var2);
                this.H0.u(r63Var.h(cmb.F6));
                this.H0.w(gm.L(14.0f));
                this.J0 = new ln(b48Var2);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            this.q1 = getStoriesCount();
            g48Var.invalidate();
            invalidate();
        } else if (this.s1) {
            r0();
            boolean z4 = z48Var.f;
            b48 b48Var3 = this.M1;
            if (z4) {
                b48Var3.setVisibility(8);
                if (this.R1 == null) {
                    l0();
                }
                this.R1.setVisibility(0);
            } else {
                b48Var3.setVisibility(0);
                t38 t38Var3 = this.R1;
                if (t38Var3 != null) {
                    t38Var3.setVisibility(8);
                }
            }
            t38 t38Var4 = this.R1;
            if (t38Var4 != null) {
                boolean z5 = z48Var.f;
                v0(true);
                t38Var4.M1(z5);
                this.R1.T1(z48Var.f && !v0(true) && (this.l2 || this.R1.X0), true);
            }
            if (i == -1) {
                ArrayList arrayList = this.p1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(oabVar.P0));
                    if (indexOf < 0 && !this.p1.isEmpty()) {
                        if (oabVar.P0 > ((Integer) this.p1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (oabVar.P0 < ((Integer) b10.f(1, this.p1)).intValue()) {
                            indexOf = this.p1.size() - 1;
                        }
                    }
                    this.z1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.m1.isEmpty();
                    ArrayList arrayList2 = this.l1;
                    if (isEmpty) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i3)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i3)).id > this.I1.f.get(this.r1)) {
                                this.z1 = i3;
                                break;
                            }
                        }
                    } else {
                        this.z1 = arrayList2.size();
                    }
                }
            }
            c1(false);
            g48Var.invalidate();
            invalidate();
        } else {
            if (this.R1 == null) {
                l0();
            }
            if (this.v1 && this.W1 == null) {
                p0();
            }
            if (this.W1 != null) {
                if (this.v1 || this.w1) {
                    e1();
                }
                this.W1.setVisibility(((!this.v1 || z48Var.f) && !this.w1) ? 8 : 0);
            }
            h6b h6bVar = this.Z1;
            if (h6bVar != null) {
                h6bVar.setVisibility(8);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            t38 t38Var5 = this.R1;
            if (t38Var5 != null) {
                t38Var5.setVisibility((A0() || m9c.C(this.r1)) ? 8 : 0);
                t38 t38Var6 = this.R1;
                boolean z6 = z48Var.f;
                v0(true);
                t38Var6.M1(z6);
                this.R1.T1(z48Var.f && !v0(true) && (this.l2 || this.R1.X0), true);
                qu3 editField2 = this.R1.getEditField();
                long j4 = this.r1;
                TL_stories.StoryItem storyItem2 = z48Var.a;
                oabVar.getClass();
                editField2.setText(oab.x(j4, storyItem2));
                this.R1.F1(this.s2, this.r1);
                TLRPC.UserFull X1 = oc7.r1(this.s2).X1(this.r1);
                if (X1 != null) {
                    this.R1.v2(null, X1);
                } else {
                    oc7.r1(this.s2).b3(oc7.r1(this.s2).W1(Long.valueOf(this.r1)), this.p2, false, null);
                }
            }
            this.q1 = getStoriesCount();
            b48 b48Var4 = this.M1;
            if (b48Var4 != null) {
                b48Var4.setVisibility(8);
            }
            g48Var.invalidate();
            invalidate();
        }
        h0(false);
    }

    public final void e1() {
        boolean z = this.w1;
        TextView textView = this.X1;
        if (z) {
            if (textView != null) {
                textView.setText(jb6.M0(2131748580, null));
            }
            TextView textView2 = this.Y1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setText(jb6.M0(this.u1 ? 2131744351 : 2131744179, null));
        }
        TextView textView3 = this.Y1;
        if (textView3 != null) {
            textView3.setVisibility(0);
            this.Y1.setText(jb6.M0(2131744178, null));
        }
    }

    public final void f0() {
        l48 l48Var = this.A0;
        if (l48Var.W.w()) {
            l48Var.W.e(false);
        }
    }

    public final void f1() {
        TL_stories.PeerStories peerStories;
        int i;
        ArrayList arrayList = this.p1;
        oab oabVar = this.z0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.m1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i = 0;
            } else {
                i = arrayList2.size();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    long j = ((g4b) arrayList2.get(i2)).a;
                    if (((int) (j ^ (j >>> 32))) == oabVar.P0) {
                        this.z1 = i2;
                        return;
                    }
                }
            }
            int indexOf = this.p1.indexOf(Integer.valueOf(oabVar.P0));
            if (indexOf < 0 && !this.p1.isEmpty()) {
                if (oabVar.P0 > ((Integer) this.p1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (oabVar.P0 < ((Integer) b10.f(1, this.p1)).intValue()) {
                    indexOf = this.p1.size() - 1;
                }
            }
            this.z1 = i + indexOf;
        } else {
            int i3 = oabVar.e1.get(this.r1, -1);
            this.z1 = i3;
            if (i3 == -1 && !oabVar.N0 && (peerStories = this.k1) != null && peerStories.max_read_id > 0) {
                int i4 = 0;
                while (true) {
                    ArrayList arrayList3 = this.l1;
                    if (i4 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i4)).id > this.k1.max_read_id) {
                        this.z1 = i4;
                        break;
                    }
                    i4++;
                }
            }
        }
        if (this.z1 == -1) {
            this.z1 = 0;
        }
    }

    public final void g0() {
        if (this.A1) {
            ((fab) this.G1).d.U();
        }
    }

    public final void g1(boolean z) {
        a8 a8Var = this.t3;
        if (a8Var == null || this.s3 == null || a8Var.getVisibility() != 0) {
            return;
        }
        if (z) {
            if (Math.abs(oab.B1 - 0.2f) < 0.05f) {
                this.t3.setSubtext(jb6.M0(2131743258, null));
            } else if (Math.abs(oab.B1 - 0.5f) < 0.05f) {
                this.t3.setSubtext(jb6.M0(2131743260, null));
            } else if (Math.abs(oab.B1 - 1.0f) < 0.05f) {
                this.t3.setSubtext(jb6.M0(2131743261, null));
            } else if (Math.abs(oab.B1 - 1.5f) < 0.05f) {
                this.t3.setSubtext(jb6.M0(2131743262, null));
            } else {
                float abs = Math.abs(oab.B1 - 2.0f);
                a8 a8Var2 = this.t3;
                if (abs < 0.05f) {
                    a8Var2.setSubtext(jb6.M0(2131743259, null));
                } else {
                    a8Var2.setSubtext(jb6.a0(null, null, 2131743263, dna.a(oab.B1).concat("x")));
                }
            }
        }
        this.s3.B0(z, oab.B1);
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.p1;
    }

    public long getCurrentPeer() {
        return this.r1;
    }

    public int getListPosition() {
        return this.B1;
    }

    public Bitmap getPlayingBitmap() {
        g48 g48Var = this.S0;
        Bitmap createBitmap = Bitmap.createBitmap(g48Var.getWidth(), g48Var.getHeight(), Bitmap.Config.ARGB_8888);
        w0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.z1;
    }

    public h4b getStoriesController() {
        return oc7.r1(this.s2).N1();
    }

    public int getStoriesCount() {
        return Math.max(this.t2, this.l1.size()) + this.m1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.l1;
    }

    public final void h0(boolean z) {
        if (this.R1 != null && this.V2 && this.Q0) {
            h38 h38Var = this.E3;
            gm.r(h38Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.I1.B;
            this.R1.M(true);
            boolean z2 = this.v1;
            z48 z48Var = this.E1;
            if ((z2 && !z48Var.f) || this.w1) {
                this.a3 = false;
                this.R1.setEnabled(false);
                this.R1.O1(" ", z);
                return;
            }
            if (this.x1 > 0) {
                this.a3 = false;
                this.R1.setEnabled(true);
                this.R1.O1(nxa.T0(jb6.a0(null, null, 2131743613, jb6.E(this.x1, ','))), z);
                return;
            }
            if (!z48Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.s2).getCurrentTime();
                int i = tL_storiesStealthMode.active_until_date;
                if (currentTime < i) {
                    this.a3 = true;
                    int currentTime2 = i - ConnectionsManager.getInstance(this.s2).getCurrentTime();
                    int i2 = currentTime2 / 60;
                    int i3 = currentTime2 % 60;
                    Locale locale = Locale.US;
                    int measureText = (int) this.R1.getEditField().getPaint().measureText(jb6.a0(null, null, 2131744577, String.format(locale, "%02d:%02d", 99, 99)));
                    this.R1.setEnabled(true);
                    float f = measureText * 1.2f;
                    float measuredWidth = this.R1.getEditField().getMeasuredWidth();
                    t38 t38Var = this.R1;
                    if (f >= measuredWidth) {
                        String a0 = jb6.a0(null, null, 2131744577, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3));
                        t38Var.e = a0;
                        t38Var.f = format;
                        t38Var.r2(z);
                    } else {
                        t38Var.O1(jb6.a0(null, null, 2131744578, String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3))), z);
                    }
                    gm.d3(h38Var, 1000L);
                    return;
                }
            }
            this.a3 = false;
            this.R1.setEnabled(true);
            boolean z3 = z48Var.f;
            t38 t38Var2 = this.R1;
            if (!z3) {
                t38Var2.O1(jb6.M0(this.u1 ? 2131745983 : 2131745988, null), z);
                return;
            }
            long starsPrice = t38Var2.getStarsPrice();
            t38 t38Var3 = this.R1;
            if (starsPrice <= 0) {
                t38Var3.O1(jb6.M0(2131751942, null), z);
                return;
            }
            t38Var3.O1(nxa.Z0(false, jb6.a0(null, null, 2131751941, jb6.E((int) starsPrice, ',')), this.R1.S6), z);
            pn2 pn2Var = this.R1.S6[0];
            if (pn2Var != null) {
                pn2Var.H = 0.9f;
            }
        }
    }

    public final void h1() {
        TL_stories.PeerStories x;
        z3b z3bVar;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.l1;
        arrayList.clear();
        oab oabVar = this.z0;
        if (!oabVar.N0) {
            ArrayList arrayList2 = this.p1;
            int i = 0;
            ArrayList arrayList3 = this.m1;
            if (arrayList2 != null && (z3bVar = oabVar.O0) != null) {
                if (z3bVar instanceof t3b) {
                    arrayList3.clear();
                    ArrayList E = oc7.r1(this.s2).N1().E(this.r1);
                    String str = ((t3b) oabVar.O0).E;
                    if (E != null) {
                        for (int i2 = 0; i2 < E.size(); i2++) {
                            g4b g4bVar = (g4b) E.get(i2);
                            g6b g6bVar = g4bVar.c;
                            if (g6bVar != null && !g6bVar.g && TextUtils.equals(g6bVar.K0, str)) {
                                arrayList3.add(g4bVar);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.p1;
                int size = arrayList4.size();
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    k47 f = oabVar.O0.f(((Integer) obj).intValue());
                    if (f != null && (storyItem = f.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (oabVar.O0 != null) {
                while (i < oabVar.O0.i.size()) {
                    arrayList.add(((k47) oabVar.O0.i.get(i)).l);
                    i++;
                }
            } else {
                TL_stories.PeerStories peerStories = oabVar.Q0;
                if (peerStories == null || pg3.n(peerStories.peer) != this.r1) {
                    x = this.I1.x(this.r1);
                    this.k1 = x;
                    if (x == null) {
                        x = this.I1.y(this.r1);
                        this.k1 = x;
                    }
                } else {
                    x = oabVar.Q0;
                    this.k1 = x;
                }
                this.t2 = 0;
                if (x != null) {
                    this.t2 = x.stories.size();
                    arrayList.addAll(this.k1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.I1.E(this.r1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        } else if (!oabVar.S0) {
            arrayList.add(oabVar.T0);
        }
        this.q1 = getStoriesCount();
    }

    public final boolean i0() {
        byte b = 0;
        if (this.i3) {
            if (this.h3.getReactionsWindow() == null) {
                W0(false);
                return true;
            }
            int i = this.o2;
            v29 v29Var = this.h3;
            if (i > 0) {
                gm.t1(v29Var.getReactionsWindow().c);
                return true;
            }
            v29Var.getReactionsWindow().d();
            return true;
        }
        e48 e48Var = this.Z0;
        if (e48Var != null) {
            hg5 hg5Var = e48Var.c;
            if (hg5Var != null) {
                hg5Var.f(true);
                e48Var.c = null;
            }
            e48Var.b = null;
            e48Var.invalidate();
            e48Var.b(false);
        }
        l48 l48Var = this.A0;
        if (l48Var.W.w()) {
            l48Var.W.e(false);
            return true;
        }
        hg5 hg5Var2 = this.v0;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
        hg5 hg5Var3 = this.w0;
        if (hg5Var3 != null) {
            hg5Var3.f(true);
        }
        ig5 ig5Var = this.M2;
        if (ig5Var != null) {
            ig5Var.a();
        }
        v48 v48Var = this.j1;
        if (v48Var != null && v48Var.a) {
            v48Var.a();
            return true;
        }
        t38 t38Var = this.R1;
        if (t38Var != null && t38Var.T0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
            boolean z = this.R1.d1;
            he heVar = alertDialog$Builder.a;
            if (z) {
                heVar.S = jb6.M0(2131751332, null);
                heVar.U = jb6.M0(2131751333, null);
            } else {
                heVar.S = jb6.M0(2131751329, null);
                heVar.U = jb6.M0(2131751330, null);
            }
            alertDialog$Builder.j(jb6.M0(2131751331, null), new e38(this, b));
            alertDialog$Builder.g(jb6.M0(2131751708, null), null);
            ((fab) this.G1).h(heVar);
            return true;
        }
        v29 v29Var2 = this.V1;
        if (v29Var2 != null && v29Var2.getReactionsWindow() != null && !this.V1.getReactionsWindow().q) {
            this.V1.getReactionsWindow().d();
            return true;
        }
        t38 t38Var2 = this.R1;
        if (t38Var2 != null && t38Var2.R0()) {
            int i2 = this.o2;
            t38 t38Var3 = this.R1;
            if (i2 > 0) {
                gm.t1(t38Var3.getEmojiView());
                return true;
            }
            t38Var3.K0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < gm.L(20.0f)) {
            if (l48Var.getVisibility() != 0 || l48Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            l48Var.D();
            this.W2 = false;
            this.S0.invalidate();
            return true;
        }
        t38 t38Var4 = this.R1;
        if (t38Var4 != null) {
            long j = this.r1;
            TL_stories.StoryItem storyItem = this.E1.a;
            Editable editText = t38Var4.getEditText();
            this.z0.getClass();
            oab.N(j, storyItem, editText);
        }
        gm.t1(this.R1);
        return true;
    }

    public final void i1(boolean z) {
        int i;
        h02 h02Var;
        boolean z2;
        int i2;
        z48 z48Var = this.E1;
        TL_stories.StoryItem storyItem = z48Var.a;
        if (storyItem == null) {
            storyItem = z48Var.c;
        }
        boolean z3 = this.t1;
        if (z3 || this.s1) {
            if (storyItem == null) {
                this.q2.setText("");
                this.v2.setVisibility(8);
                this.r2.setVisibility(8);
                return;
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            oab oabVar = this.z0;
            b48 b48Var = this.t0;
            if (!z3) {
                int i3 = 3;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.q2.setText(oabVar.O0 == null ? jb6.M0(2131747857, null) : jb6.M0(2131747856, null));
                    this.q2.setTranslationX(gm.L(16.0f));
                    this.r2.setVisibility(8);
                    this.v2.setVisibility(8);
                } else {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 >= storyItem.views.recent_viewers.size()) {
                            i = i3;
                            break;
                        }
                        TLObject a2 = oc7.r1(this.s2).a2(storyItem.views.recent_viewers.get(i4).longValue());
                        if (a2 != null) {
                            this.r2.b(i5, this.s2, a2);
                            i5++;
                        }
                        i = i3;
                        if (i5 >= i) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                    int i6 = i5;
                    while (true) {
                        h02Var = this.r2;
                        if (i6 >= i) {
                            break;
                        }
                        h02Var.b(i6, this.s2, null);
                        i6++;
                    }
                    h02Var.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        pn2 pn2Var = new pn2(R.drawable.mini_views_likes, 0);
                        pn2Var.y = -53704;
                        pn2Var.n = gm.L(0.2f);
                        spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        pn2 pn2Var2 = new pn2(R.drawable.mini_repost_story, 0);
                        pn2Var2.y = -14161823;
                        pn2Var2.n = gm.L(0.2f);
                        spannableStringBuilder.setSpan(pn2Var2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.q2.setText(spannableStringBuilder);
                    h02 h02Var2 = this.r2;
                    if (i5 == 0) {
                        h02Var2.setVisibility(8);
                        this.q2.setTranslationX(gm.L(16.0f));
                    } else {
                        h02Var2.setVisibility(0);
                        this.q2.setTranslationX(gm.L(10.0f) + aq1.h(i5, 1, gm.L(20.0f), gm.L(24.0f) + gm.L(13.0f)));
                    }
                    this.v2.setVisibility(0);
                }
                b48Var.getLayoutParams().width = gm.L(40.0f);
                this.E0.requestLayout();
                return;
            }
            if (storyViews == null) {
                storyViews = new TL_stories.TL_storyViews();
                storyItem.views = storyViews;
            }
            if (storyViews.views_count <= 0) {
                storyViews.views_count = 1;
            }
            ho hoVar = this.H0;
            if (hoVar == null || (i2 = storyViews.forwards_count) <= 0) {
                this.L0 = false;
            } else {
                hoVar.t(Integer.toString(i2), z && this.L0, true);
                this.L0 = true;
            }
            int i7 = storyItem.views.reactions_count;
            if (i7 > 0) {
                this.G0.t(Integer.toString(i7), z && this.K0, true);
                this.K0 = true;
                z2 = true;
            } else {
                this.K0 = false;
                z2 = false;
            }
            if (!z) {
                this.I0.e(true, z2 ? 1.0f : 0.0f);
                ln lnVar = this.J0;
                if (lnVar != null) {
                    lnVar.e(true, this.L0 ? 1.0f : 0.0f);
                }
            }
            TLRPC.Chat L0 = oc7.r1(this.s2).L0(Long.valueOf(-this.r1));
            if (!(this.u1 && (sd2.q(L0) || sd2.s0(L0))) && storyItem.views.views_count > 0) {
                this.q2.setText(oabVar.O0 == null ? jb6.M0(2131747857, null) : jb6.M0(2131747856, null));
                this.q2.setTranslationX(gm.L(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new pn2(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) gm.o0(storyItem.views.views_count, 0));
                this.q2.setText(spannableStringBuilder2);
            } else {
                this.q2.setText("");
            }
            b48Var.getLayoutParams().width = (int) (gm.L(40.0f) + (this.K0 ? this.G0.d + gm.L(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.M1.getLayoutParams()).rightMargin = gm.L(40.0f) + b48Var.getLayoutParams().width;
            b48 b48Var2 = this.F0;
            if (b48Var2 != null) {
                b48Var2.getLayoutParams().width = (int) (gm.L(40.0f) + (this.L0 ? this.H0.d + gm.L(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.M1.getLayoutParams()).rightMargin += b48Var2.getLayoutParams().width;
                b48Var2.requestLayout();
            }
            this.M1.requestLayout();
            b48Var.requestLayout();
            this.r2.setVisibility(8);
            this.v2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = z48Var.a;
            e48 e48Var = this.Z0;
            if (storyItem2 == null) {
                e48Var.getClass();
                return;
            }
            for (int i8 = 0; i8 < e48Var.getChildCount(); i8++) {
                if (e48Var.getChildAt(i8) instanceof e8b) {
                    ((e8b) e48Var.getChildAt(i8)).c(storyItem2.views, z);
                }
            }
        }
    }

    public final void j0() {
        if (this.y2 == null) {
            e51 e51Var = new e51(this, getContext(), this.r0);
            this.y2 = e51Var;
            e51Var.W3 = new x38(this);
            e51Var.d2.h0();
            e51 e51Var2 = this.y2;
            e51Var2.Q1 = true;
            e51Var2.Z0();
            e51 e51Var3 = this.y2;
            e51Var3.R1 = new y38(this);
            e51Var3.U0().setText(this.R1.getFieldText());
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void j1() {
        /*
            Method dump skipped, instructions count: 1589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a58.j1():void");
    }

    public final void k0() {
        if (this.N1 != null || getContext() == null) {
            return;
        }
        vn2 vn2Var = new vn2(getContext(), this.x3);
        this.N1 = vn2Var;
        vn2Var.setOnClickListener(new j38(this, (byte) 1));
        addView(this.N1, qoe.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void l0() {
        r63 r63Var = this.r0;
        t38 t38Var = new t38(this, gm.W(getContext()), this, new pv0(r63Var, (byte) 4));
        this.R1 = t38Var;
        qu3 editField = t38Var.getEditField();
        editField.getClass();
        hu3 hu3Var = new hu3(editField, (byte) 0);
        editField.u0 = hu3Var;
        byte b = 1;
        hu3Var.q(true);
        editField.u0.u(editField.y0);
        editField.u0.w(editField.getPaint().getTextSize());
        hu3 hu3Var2 = new hu3(editField, b);
        editField.v0 = hu3Var2;
        hu3Var2.b = 5;
        hu3Var2.u(editField.y0);
        editField.v0.w(editField.getPaint().getTextSize());
        this.R1.getEditField().setScaleX(0.0f);
        this.R1.setOverrideKeyboardAnimation(true);
        this.R1.setClipChildren(false);
        this.R1.setDelegate(new u38(this));
        setDelegate(this.R1);
        t38 t38Var2 = this.R1;
        t38Var2.X5 = false;
        t38Var2.Y5 = true;
        if (this.E1.f) {
            t38Var2.z1(false, false, false);
        } else {
            t38Var2.z1(true, true, false);
        }
        this.R1.updateColors();
        t38 t38Var3 = this.R1;
        t38Var3.Z5 = true;
        addView(t38Var3, qoe.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.D3 != null) {
            this.R1.A2(false);
        }
        this.R1.w3 = this.p2;
        c40 c40Var = this.C2;
        ((ArrayList) c40Var.g).add(this.S0);
        ((ArrayList) c40Var.g).add(this);
        if (this.Q0) {
            this.R1.g1();
        }
        h0(false);
        if (A0()) {
            this.R1.setVisibility(8);
        }
        q02 q02Var = new q02(getContext(), r63Var, this.x3, this.v3);
        this.S1 = q02Var;
        q02Var.setOnClickListener(new e38(this, b));
        addView(this.S1, qoe.e(57, nm7.W4, 85));
        this.S1.setVisibility(8);
        this.R1.setSideButtonsForAttach(this.S1);
        this.y0 = getChildCount();
    }

    public final void m0() {
        if (this.Z1 != null) {
            return;
        }
        h6b h6bVar = new h6b(getContext(), this.r0);
        this.Z1 = h6bVar;
        h6bVar.setOnClickListener(new j38(this, (byte) 4));
        this.Z1.setAlpha(0.0f);
        this.Z1.setVisibility(8);
        addView(this.Z1, qoe.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void n0() {
        if (this.Q1 != null || getContext() == null) {
            return;
        }
        nj7 nj7Var = new nj7(getContext(), this.x3);
        this.Q1 = nj7Var;
        nj7Var.setOnClickListener(new j38(this, (byte) 5));
        nj7 nj7Var2 = this.Q1;
        s96 s96Var = s96.N;
        boolean z = true;
        nj7Var2.b(s96Var != null && s96Var.r(), false);
        nj7 nj7Var3 = this.Q1;
        s96 s96Var2 = s96.N;
        if (s96Var2 != null && !s96Var2.G) {
            z = false;
        }
        nj7Var3.a(z, false);
        addView(this.Q1, qoe.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void o0() {
        if (this.P1 != null || getContext() == null) {
            return;
        }
        this.O1 = new wt7(getContext(), this.s2);
        xt7 xt7Var = new xt7(getContext(), this.O1, this.x3);
        this.P1 = xt7Var;
        xt7Var.setOnClickListener(new j38(this, (byte) 6));
        this.P1.setOnLongClickListener(new g38(this, (byte) 1));
        addView(this.P1, qoe.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.O1, qoe.d(nm7.d3, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q0 = true;
        this.U0.I();
        this.W0.I();
        this.V0.I();
        this.b3.I();
        this.d3.I();
        t38 t38Var = this.R1;
        if (t38Var != null) {
            t38Var.g1();
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.X0;
            if (i >= arrayList.size()) {
                nm7.f(this.s2).b(this, nm7.T);
                nm7.f(this.s2).b(this, nm7.G2);
                nm7.f(this.s2).b(this, nm7.z5);
                nm7.f(this.s2).b(this, nm7.o3);
                nm7.f(this.s2).b(this, nm7.B5);
                nm7.f(this.s2).b(this, nm7.H5);
                nm7.f(this.s2).b(this, nm7.d3);
                nm7.f(this.s2).b(this, nm7.k3);
                nm7.f(this.s2).b(this, nm7.E);
                nm7.e().b(this, nm7.m4);
                return;
            }
            ((d29) arrayList.get(i)).b(true);
            i++;
        }
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q0 = false;
        this.U0.K();
        this.W0.K();
        this.V0.K();
        this.b3.K();
        this.d3.K();
        t38 t38Var = this.R1;
        if (t38Var != null) {
            t38Var.f1();
        }
        vm vmVar = this.e3;
        if (vmVar != null) {
            vmVar.o(this);
            this.e3 = null;
        }
        xm xmVar = this.c3;
        if (xmVar != null) {
            xmVar.d(this);
            this.c3 = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.X0;
            if (i >= arrayList.size()) {
                nm7.f(this.s2).n(this, nm7.T);
                nm7.f(this.s2).n(this, nm7.G2);
                nm7.f(this.s2).n(this, nm7.z5);
                nm7.f(this.s2).n(this, nm7.o3);
                nm7.f(this.s2).n(this, nm7.B5);
                nm7.f(this.s2).n(this, nm7.H5);
                nm7.f(this.s2).n(this, nm7.d3);
                nm7.f(this.s2).n(this, nm7.k3);
                nm7.f(this.s2).n(this, nm7.E);
                nm7.e().n(this, nm7.m4);
                return;
            }
            ((d29) arrayList.get(i)).b(false);
            i++;
        }
    }

    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.n1.d.setBounds(0, 0, getMeasuredWidth(), gm.L(72.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        char c;
        q qVar;
        boolean z;
        float L;
        FrameLayout.LayoutParams layoutParams;
        v29 v29Var;
        v38 v38Var;
        oab oabVar = this.z0;
        if (oabVar.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = gm.m;
        }
        byte b = 0;
        if (this.A1 && this.P2 == null) {
            this.o2 = ((fab) this.G1).d.q0;
        } else {
            this.o2 = 0;
        }
        int size = oabVar.b ? View.MeasureSpec.getSize(i2) : View.MeasureSpec.getSize(i2) + this.o2;
        int size2 = (int) ((View.MeasureSpec.getSize(i) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.o2 < gm.L(20.0f)) {
            this.o2 = 0;
        }
        int i3 = this.o2;
        v29 v29Var2 = this.h3;
        if (v29Var2 == null || v29Var2.getReactionsWindow() == null || this.h3.getReactionsWindow().q) {
            t38 t38Var = this.R1;
            if (t38Var != null && (t38Var.R0() || this.R1.a4)) {
                int measuredHeight = this.R1.getEmojiView().getMeasuredHeight();
                t38 t38Var2 = this.R1;
                if (measuredHeight == 0) {
                    i3 = t38Var2.getEmojiPadding();
                } else if (t38Var2.p4) {
                    t38Var2.N();
                    i3 = this.R1.getStickersExpandedHeight();
                } else {
                    i3 = t38Var2.getVisibleEmojiPadding();
                }
            }
        } else {
            this.h3.getReactionsWindow().c.animate().translationY(-this.o2).setDuration(250L).setInterpolator(gb.w).start();
            i3 = 0;
        }
        boolean z2 = this.l2;
        int i4 = this.e2;
        x48 x48Var = this.e1;
        byte b2 = 1;
        if (i4 != i3) {
            this.l2 = false;
            z48 z48Var = this.E1;
            if (i3 <= 0 || !this.A1) {
                f = 8.0f;
                t38 t38Var3 = this.R1;
                if (t38Var3 != null) {
                    oab.N(this.r1, z48Var.a, t38Var3.getEditText());
                }
            } else {
                this.l2 = true;
                this.Y2 = false;
                this.j2 = i3;
                if (this.V1 == null) {
                    f = 8.0f;
                    v29 v29Var3 = new v29(1, this.s2, new pv0(this.r0, (byte) 6), getContext(), LaunchActivity.Q());
                    this.V1 = v29Var3;
                    v29Var3.setHint(jb6.M0(this.u1 ? 2131744352 : 2131744189, null));
                    v29 v29Var4 = this.V1;
                    v29Var4.O0 = true;
                    addView(v29Var4, this.y0, qoe.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.V1.setDelegate(new d48(this));
                    this.V1.m(null, null, true);
                } else {
                    f = 8.0f;
                }
                this.V1.setFragment(LaunchActivity.Q());
                this.V1.setHint(jb6.M0(this.u1 ? 2131744352 : 2131744189, null));
                g39 g39Var = g39.B;
                if (g39Var != null) {
                    g39Var.l = true;
                }
                g39 g39Var2 = g39.C;
                if (g39Var2 != null) {
                    g39Var2.l = true;
                }
            }
            t38 t38Var4 = this.R1;
            if (t38Var4 != null) {
                t38Var4.T1(z48Var.f && !v0(true) && this.l2, true);
            }
            if (this.l2 && (v38Var = this.T2) != null) {
                v38Var.setVisibility(0);
            }
            if (!this.l2 && (v29Var = this.V1) != null) {
                v29Var.k();
            }
            x48Var.setEnabled(!this.l2);
            if (this.R1 != null) {
                gm.T3(null, !this.l2, 0.1f, true, true);
            }
            if (this.A1 && this.l2) {
                oab oabVar2 = ((fab) this.G1).d;
                if (!oabVar2.y) {
                    oabVar2.y = true;
                    oabVar2.U();
                }
            }
            this.e2 = i3;
            ValueAnimator valueAnimator = this.f2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.D2.d();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x2, i3);
            this.f2 = ofFloat;
            ofFloat.addUpdateListener(new i38(this, b));
            this.f2.addListener(new q38(this, b2));
            boolean z3 = this.l2;
            ValueAnimator valueAnimator2 = this.f2;
            if (z3) {
                valueAnimator2.setDuration(250L);
                this.f2.setInterpolator(gb.w);
                oabVar.i();
            } else {
                valueAnimator2.setDuration(500L);
                this.f2.setInterpolator(d53.h);
            }
            this.f2.start();
            boolean z4 = this.l2;
            if (z4 != z2) {
                if (z4) {
                    eq eqVar = this.F1;
                    Canvas canvas = (Canvas) eqVar.b;
                    Bitmap bitmap = (Bitmap) eqVar.c;
                    w0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (gm.B(gm.I0(bitmap)) < 0.15f) {
                        canvas.drawColor(on2.p(-1, nm7.m1));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (z48Var.f) {
                        hg5 hg5Var = this.T1;
                        if (hg5Var != null) {
                            if (!hg5Var.W) {
                                removeView(hg5Var);
                            }
                        }
                        if (!v0(true) && oc7.d1().getInt("taptostoryhighlighthint", 0) < 3) {
                            oc7.d1().edit().putInt("taptostoryhighlighthint", oc7.d1().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            hg5 hg5Var2 = new hg5(getContext(), 3);
                            this.T1 = hg5Var2;
                            hg5Var2.t(jb6.M0(2131748570, null));
                            this.T1.setPadding(gm.L(f), 0, gm.L(f), 0);
                            hg5 hg5Var3 = this.T1;
                            hg5Var3.L = Layout.Alignment.ALIGN_OPPOSITE;
                            hg5Var3.r0 = new a18(this, hg5Var2, b2);
                            addView(hg5Var3, qoe.e(-1, 100, 87));
                            this.T1.v();
                            j1();
                        }
                    }
                } else {
                    t38 t38Var5 = this.R1;
                    if (t38Var5 != null) {
                        t38Var5.getEditField().clearFocus();
                    }
                    hg5 hg5Var4 = this.T1;
                    if (hg5Var4 != null) {
                        hg5Var4.f(true);
                    }
                }
                this.k2 = true;
            } else {
                this.k2 = false;
            }
        } else {
            f = 8.0f;
        }
        t38 t38Var6 = this.R1;
        if (t38Var6 != null && t38Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.R1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        g48 g48Var = this.S0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g48Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z5 = size - size2 > gm.L(64.0f);
        this.n2 = z5;
        int L2 = (size - ((z5 ? gm.L(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = L2;
        if (this.n2) {
            this.A2 = (((-L2) + size) - size2) - gm.L(64.0f);
        } else {
            this.A2 = ((-L2) + size) - size2;
        }
        if (this.n2 != this.m2) {
            g48Var.setLayoutParams(layoutParams2);
        }
        b48 b48Var = this.M1;
        if (b48Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) b48Var.getLayoutParams();
            if (this.n2) {
                layoutParams3.topMargin = gm.L(f) + L2 + size2;
            } else {
                layoutParams3.topMargin = (L2 + size2) - gm.L(48.0f);
            }
        }
        wb wbVar = this.R2;
        if (wbVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) wbVar.getLayoutParams();
            boolean z6 = this.n2;
            wb wbVar2 = this.R2;
            if (z6) {
                c = 0;
                wbVar2.setTextColor(on2.f(0.5f, -16777216, -1));
                layoutParams4.topMargin = gm.L(12.0f) + L2 + size2;
                qVar = this.z2;
                if (qVar != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) qVar.getLayoutParams();
                    if (i3 == 0) {
                        layoutParams5.bottomMargin = hg9.f(64.0f, L2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = gm.L(64.0f) + i3;
                    }
                }
                z = this.n2;
                l48 l48Var = this.A0;
                LinearLayout linearLayout = this.E0;
                if (z) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((L2 + size2) - gm.L(12.0f)) - gm.L(40.0f);
                    int L3 = this.s1 ? gm.L(40.0f) : gm.L(56.0f);
                    ((FrameLayout.LayoutParams) l48Var.getLayoutParams()).bottomMargin = L3;
                    if (this.m2 != this.n2) {
                        l48Var.setLayoutParams((FrameLayout.LayoutParams) l48Var.getLayoutParams());
                    }
                    l48Var.u0 = L3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = gm.L(12.0f) + L2 + size2;
                    ((FrameLayout.LayoutParams) l48Var.getLayoutParams()).bottomMargin = gm.L(f);
                    if (this.m2 != this.n2) {
                        l48Var.setLayoutParams((FrameLayout.LayoutParams) l48Var.getLayoutParams());
                    }
                    l48Var.u0 = gm.L(f);
                }
                this.L2 = true;
                L = gm.L(48.0f);
                if (this.s0.getVisibility() == 0) {
                    L += gm.L(60.0f);
                }
                if (this.o0.getVisibility() == 0) {
                    L += gm.L(40.0f);
                }
                dg0 dg0Var = x48Var.b;
                TextView[] textViewArr = x48Var.c;
                layoutParams = (FrameLayout.LayoutParams) dg0Var.getLayoutParams();
                if (layoutParams.rightMargin != L) {
                    int i5 = (int) L;
                    layoutParams.rightMargin = i5;
                    ((FrameLayout.LayoutParams) textViewArr[c].getLayoutParams()).rightMargin = i5;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i5;
                    x48Var.forceLayout();
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.m2 = this.n2;
            }
            wbVar2.setTextColor(on2.p(-1, nm7.U2));
            layoutParams4.topMargin = ((L2 + size2) - gm.L(12.0f)) - gm.L(40.0f);
        }
        c = 0;
        qVar = this.z2;
        if (qVar != null) {
        }
        z = this.n2;
        l48 l48Var2 = this.A0;
        LinearLayout linearLayout2 = this.E0;
        if (z) {
        }
        this.L2 = true;
        L = gm.L(48.0f);
        if (this.s0.getVisibility() == 0) {
        }
        if (this.o0.getVisibility() == 0) {
        }
        dg0 dg0Var2 = x48Var.b;
        TextView[] textViewArr2 = x48Var.c;
        layoutParams = (FrameLayout.LayoutParams) dg0Var2.getLayoutParams();
        if (layoutParams.rightMargin != L) {
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.m2 = this.n2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g2 = -1.0f;
        this.L2 = true;
        invalidate();
    }

    public final void p0() {
        if (this.W1 != null) {
            return;
        }
        if (this.R1 == null) {
            l0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.W1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.X1 = textView;
        textView.setTextColor(-8026747);
        this.X1.setTextSize(1, 16.0f);
        this.X1.setText(jb6.M0(this.u1 ? 2131744351 : 2131744179, null));
        TextView textView2 = new TextView(getContext());
        this.Y1 = textView2;
        textView2.setTextColor(-1);
        this.Y1.setTextSize(1, 12.0f);
        TextView textView3 = this.Y1;
        int L = gm.L(40.0f);
        textView3.setBackground(cmb.i0(L, L, L, L, 452984831, 855638015, 855638015));
        this.Y1.setGravity(17);
        rve.a(this.Y1);
        this.Y1.setText(jb6.M0(2131744178, null));
        this.Y1.setPadding(gm.L(7.0f), 0, gm.L(7.0f), 0);
        this.W1.addView(imageView, qoe.t(22, 22, 16, 12, 1, 4, 0));
        this.W1.addView(this.X1, qoe.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.W1.addView(this.Y1, qoe.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.R1.addView(this.W1, qoe.d(-1, -1.0f, nm7.D1, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void q0() {
        if (this.R2 != null) {
            return;
        }
        wb wbVar = new wb(getContext(), (byte) 29);
        this.R2 = wbVar;
        wbVar.setTextSize(1, 14.0f);
        this.R2.setTextColor(on2.f(0.5f, -16777216, -1));
        this.R2.setGravity(19);
        this.R2.setText(jb6.M0(2131744177, null));
        addView(this.R2, qoe.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0() {
        if (this.M1 != null) {
            return;
        }
        b48 b48Var = new b48(this, getContext(), (byte) 0);
        this.M1 = b48Var;
        b48Var.setClickable(true);
        addView(this.M1, qoe.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        a91 a91Var = new a91(this, getContext());
        this.v2 = a91Var;
        a91Var.setOnClickListener(new j38(this, 0 == true ? 1 : 0));
        this.M1.addView(this.v2, qoe.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        h02 h02Var = new h02((byte) 1, getContext(), 0 == true ? 1 : 0);
        this.r2 = h02Var;
        h02Var.setAvatarsTextSize(gm.L(18.0f));
        this.M1.addView(this.r2, qoe.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.q2 = textView;
        textView.setTextSize(1, 14.0f);
        this.q2.setTextColor(-1);
        this.M1.addView(this.q2, qoe.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.n1.s);
        a91 a91Var2 = this.v2;
        int L = gm.L(15.0f);
        int p = on2.p(-1, nm7.E1);
        a91Var2.setBackground(cmb.i0(L, L, L, L, 0, p, p));
        imageView.setBackground(cmb.N(on2.p(-1, nm7.E1), -gm.L(2.0f), -gm.L(2.0f)));
    }

    public final void s0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (A0() || this.E1.f) {
            return;
        }
        boolean p = z8c.h(this.s2).p();
        r63 r63Var = this.r0;
        if (p) {
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, jb6.M0(2131744576, null), false, r63Var).setOnClickListener(new j38(this, (byte) 8));
            return;
        }
        Drawable drawable = getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(on2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        o38 o38Var = new o38(getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, (byte) 0);
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, jb6.M0(2131744576, null), false, r63Var);
        c.setOnClickListener(new j38(this, (byte) 9));
        c.setIcon(o38Var);
    }

    public void setAccount(int i) {
        this.s2 = i;
        this.I1 = oc7.r1(i).e0;
        this.a1.b = i;
        v29 v29Var = this.V1;
        if (v29Var != null) {
            v29Var.setCurrentAccount(i);
            this.V1.m(null, null, true);
        }
        v29 v29Var2 = this.h3;
        if (v29Var2 != null) {
            v29Var2.setCurrentAccount(i);
        }
    }

    public void setActive(boolean z) {
        O0(0L, z);
    }

    public void setDelegate(w48 w48Var) {
        this.G1 = w48Var;
    }

    public void setIsVisible(boolean z) {
        if (this.V2 != z) {
            this.V2 = z;
            if (z) {
                this.U0.i1 = 1.0f;
                h0(false);
            }
        }
    }

    public void setLongpressed(boolean z) {
        if (this.A1) {
            this.B2 = z;
            invalidate();
        }
    }

    public void setOffset(float f) {
        boolean z = f == 0.0f;
        if (this.R0 != z) {
            this.R0 = z;
            this.S0.invalidate();
            if (this.A1 && this.z0.a && Build.VERSION.SDK_INT < 33) {
                ei7 ei7Var = this.L3;
                if (z) {
                    gm.r(ei7Var);
                    gm.d3(ei7Var, 250L);
                } else {
                    gm.r(ei7Var);
                    oab oabVar = ((fab) this.G1).d;
                    oabVar.l1 = true;
                    oabVar.U();
                }
            }
        }
    }

    public void setPaused(boolean z) {
        if (this.H1 != z) {
            this.H1 = z;
            mm mmVar = this.U0;
            if (z) {
                mmVar.x0();
                mmVar.u0 = false;
            } else {
                mmVar.w0(false);
                mmVar.u0 = true;
            }
            this.N0 = 0L;
            this.S0.invalidate();
        }
    }

    public final void t0() {
        if (this.Q2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(gm.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(jb6.M0(2131744139, null));
        int i = cmb.F6;
        r63 r63Var = this.r0;
        anb.X(textView, i, r63Var);
        TextView textView2 = new TextView(getContext());
        rve.a(textView2);
        textView2.setText(jb6.M0(2131754195, null));
        int i2 = cmb.Ii;
        anb.X(textView2, i2, r63Var);
        textView2.setPadding(gm.L(16.0f), gm.L(12.0f), gm.L(16.0f), gm.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(gm.o());
        textView2.setTextSize(1, 15.0f);
        int L = gm.L(8.0f);
        int i3 = cmb.Ei;
        int v0 = cmb.v0(i3, r63Var);
        int p = on2.p(cmb.v0(i2, r63Var), 30);
        fg0 i0 = cmb.i0(L, L, L, L, v0, p, p);
        wmb M = anb.M(i3);
        wmb g = anb.g(i2, 30);
        textView2.setBackground(i0);
        anb.j(textView2, i0, M, g, r63Var);
        textView2.setOnClickListener(new j38(this, (byte) 3));
        linearLayout.addView(textView, qoe.o(-1, -2));
        linearLayout.addView(textView2, qoe.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, qoe.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.S0.addView(frameLayout);
        this.Q2 = frameLayout;
    }

    public final void u0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.r0, getContext());
        String M0 = jb6.M0(A0() ? 2131751501 : 2131751424, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(A0() ? 2131751502 : 2131751425, null);
        alertDialog$Builder.j(jb6.M0(2131751535, null), new e38(this, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new bh7((byte) 28));
        ((fab) this.G1).h(heVar);
        heVar.h();
    }

    public final boolean v0(boolean z) {
        s96 s96Var;
        TLRPC.Peer l;
        long e = z8c.h(this.s2).e();
        long j = this.r1;
        oab oabVar = this.z0;
        if (j >= 0) {
            if (oabVar == null || (s96Var = oabVar.B0) == null || !s96Var.o()) {
                return false;
            }
            return !z || (l = oabVar.B0.l()) == null || this.r1 == pg3.n(l) || pg3.n(l) == e || this.r1 == e;
        }
        s96 s96Var2 = oabVar.B0;
        if (s96Var2 == null || !z) {
            return false;
        }
        TLRPC.Peer l2 = s96Var2.l();
        TLRPC.Chat L0 = oc7.r1(this.s2).L0(Long.valueOf(-this.r1));
        if (oabVar.B0.o() || sd2.w(14, L0)) {
            return l2 == null || this.r1 == pg3.n(l2) || pg3.n(l2) == z8c.h(this.s2).e();
        }
        return false;
    }

    public final void w0(Canvas canvas, int i, int i2) {
        c40 c40Var = this.C2;
        if (((jy) c40Var.e) != null) {
            if (((SurfaceView) c40Var.d) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                if (Build.VERSION.SDK_INT >= 24) {
                    gm.y0((SurfaceView) c40Var.d, createBitmap);
                }
                if (createBitmap != null) {
                    canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            }
            TextureView textureView = (TextureView) c40Var.f;
            if (textureView != null) {
                Bitmap bitmap = textureView.getBitmap(i, i2);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            }
        }
        canvas.save();
        g48 g48Var = this.S0;
        canvas.scale(i / g48Var.getMeasuredWidth(), i2 / g48Var.getMeasuredHeight());
        this.U0.h(canvas, null);
        canvas.restore();
    }

    public final void x0(y7b y7bVar, TL_stories.StoryItem storyItem) {
        w48 w48Var = this.G1;
        a8b a8bVar = new a8b(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.r0);
        a8bVar.R0(y7bVar);
        hs1 hs1Var = a8bVar.l1;
        if (hs1Var != null) {
            for (View view : hs1Var.getViewPages()) {
                if (view instanceof v7b) {
                    ((v7b) view).f(false);
                }
            }
        }
        a8bVar.L0(true);
        a8bVar.N1 = new cz6((Object) this, (Object) storyItem, (byte) 13);
        ((fab) w48Var).h(a8bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x017b, code lost:
    
        if (r3 == r10.V1) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y0(ViewGroup viewGroup, float f, float f2, boolean z) {
        hg5 hg5Var;
        c40 c40Var;
        jy jyVar;
        if (viewGroup != null) {
            hg5 hg5Var2 = this.v0;
            if ((hg5Var2 == null || !hg5Var2.W) && ((hg5Var = this.w0) == null || !hg5Var.W)) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        l48 l48Var = this.A0;
                        if (childAt == l48Var) {
                            Rect rect = gm.Q;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f, (int) f2)) {
                                float top = f2 - childAt.getTop();
                                k5b k5bVar = l48Var.b0;
                                if (k5bVar.x == 1.0f && !l48Var.s0) {
                                    if (top > k5bVar.getTranslationY() + (l48Var.r0.getTop() - l48Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = gm.Q;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.S0 || (c40Var = this.C2) == null || (jyVar = (jy) c40Var.e) == null || !y0(jyVar, f - childAt.getX(), f2 - childAt.getY(), z)) && (!childAt.isClickable() || !rect2.contains((int) f, (int) f2))) {
                            e48 e48Var = this.Z0;
                            if (childAt == e48Var && e48Var.b == null && (f < gm.L(60.0f) || f > viewGroup.getMeasuredWidth() - gm.L(60.0f))) {
                                Matrix matrix = e48Var.e;
                                float[] fArr = e48Var.f;
                                for (int i2 = 0; i2 < e48Var.getChildCount(); i2++) {
                                    View childAt2 = e48Var.getChildAt(i2);
                                    if (childAt2 != e48Var.d && (childAt2 instanceof e8b)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f;
                                        fArr[1] = f2;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                n38 n38Var = this.B0;
                                if (childAt == n38Var) {
                                    smb smbVar = n38Var.f;
                                    fv fvVar = n38Var.c;
                                    smb smbVar2 = n38Var.f;
                                    smbVar.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f - n38Var.getX()) - smbVar2.getX()), (int) ((f2 - n38Var.getY()) - smbVar2.getY()))) {
                                        if (n38Var.g0) {
                                            continue;
                                        } else if (!this.l2) {
                                            if (f2 <= n38Var.r() + n38Var.getY() && fvVar.E(f, (f2 - n38Var.getY()) - fvVar.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.l2) {
                                        if (childAt == this.R1 && f2 > rect2.top) {
                                        }
                                    }
                                    if (!z) {
                                        if (rect2.contains((int) f, (int) f2)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            t38 t38Var = this.R1;
                                            if (t38Var != null && childAt == t38Var.getRecordCircle()) {
                                            }
                                        }
                                    }
                                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && y0((ViewGroup) childAt, f - childAt.getX(), f2 - childAt.getY(), z)) {
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

    public final boolean z0(View view, MotionEvent motionEvent) {
        float x = getX();
        g48 g48Var = this.S0;
        float x2 = view.getX() + g48Var.getX() + x;
        float y = view.getY() + g48Var.getY() + getY();
        return motionEvent.getX() >= x2 && motionEvent.getX() <= x2 + ((float) view.getWidth()) && motionEvent.getY() >= y && motionEvent.getY() <= y + ((float) view.getHeight());
    }
}
