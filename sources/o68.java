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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class o68 extends wma implements fn7 {
    public static final /* synthetic */ int O3 = 0;
    public hn A0;
    public k68 A1;
    public float A2;
    public final u48 A3;
    public hn B0;
    public boolean B1;
    public long B2;
    public final ArrayList B3;
    public mm C0;
    public c6b C1;
    public boolean C2;
    public final ArrayList C3;
    public mm D0;
    public boolean D1;
    public boolean D2;
    public boolean D3;
    public boolean E0;
    public boolean E1;
    public boolean E2;
    public boolean E3;
    public boolean F0;
    public boolean F1;
    public boolean F2;
    public final li7 F3;
    public long G0;
    public p58 G1;
    public lg5 G2;
    public final mm G3;
    public long H0;
    public dn2 H1;
    public final de8 H2;
    public final mm H3;
    public boolean I0;
    public bv7 I1;
    public boolean I2;
    public final mm I3;
    public boolean J0;
    public cv7 J1;
    public n58 J2;
    public float J3;
    public boolean K0;
    public uj7 K1;
    public FrameLayout K2;
    public final Path K3;
    public boolean L0;
    public h58 L1;
    public xb L2;
    public boolean L3;
    public final u58 M0;
    public vz1 M1;
    public boolean M2;
    public ValueAnimator M3;
    public final FrameLayout N0;
    public kg5 N1;
    public j58 N2;
    public float N3;
    public final nl O0;
    public ValueAnimator O1;
    public float O2;
    public final ImageReceiver P0;
    public i49 P1;
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
    public final s58 T0;
    public d8b T1;
    public boolean T2;
    public final tv3 U0;
    public ViewPropertyAnimator U1;
    public boolean U2;
    public g3a V0;
    public final jl0 V1;
    public final ImageReceiver V2;
    public float W0;
    public final jl0 W1;
    public yl W2;
    public final rb0 X0;
    public final Paint X1;
    public final ImageReceiver X2;
    public final l68 Y0;
    public int Y1;
    public wl Y2;
    public final e8b Z0;
    public ValueAnimator Z1;
    public boolean Z2;
    public ykf a1;
    public float a2;
    public boolean a3;
    public int b1;
    public float b2;
    public i49 b3;
    public b8 c1;
    public float c2;
    public boolean c3;
    public j68 d1;
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
    public final m68 h1;
    public boolean h2;
    public int h3;
    public final b6 i0;
    public final bn9 i1;
    public int i2;
    public int i3;
    public final e29 j0;
    public ArrayList j1;
    public final int j2;
    public u48 j3;
    public final ImageView k0;
    public int k1;
    public TextView k2;
    public float k3;
    public final x53 l0;
    public long l1;
    public mz1 l2;
    public boolean l3;
    public final x9b m0;
    public boolean m1;
    public int m2;
    public rx6 m3;
    public final p58 n0;
    public boolean n1;
    public int n2;
    public b8 n3;
    public h6b o0;
    public boolean o1;
    public boolean o2;
    public b8 o3;
    public kg5 p0;
    public boolean p1;
    public a81 p2;
    public final ll0 p3;
    public kg5 q0;
    public boolean q1;
    public boolean q2;
    public final rz4 q3;
    public kg5 r0;
    public long r1;
    public float r2;
    public final cl0 r3;
    public int s0;
    public final float s1;
    public f41 s2;
    public TL_stories.TL_premium_boostsStatus s3;
    public final lcb t0;
    public int t1;
    public q t2;
    public wg1 t3;
    public final z58 u0;
    public boolean u1;
    public int u2;
    public long u3;
    public final c58 v0;
    public int v1;
    public boolean v2;
    public long v3;
    public final View w0;
    public int w1;
    public final d30 w2;
    public boolean w3;
    public final ImageView x0;
    public int x1;
    public final pn x2;
    public TLRPC.TL_channels_sendAsPeers x3;
    public final LinearLayout y0;
    public final n68 y1;
    public final mm y2;
    public final u48 y3;
    public final p58 z0;
    public final fp z1;
    public final mm z2;
    public int z3;

    /* JADX WARN: Multi-variable type inference failed */
    public o68(Context context, final lcb lcbVar, m68 m68Var, x53 x53Var) {
        super(context, null);
        this.L0 = true;
        this.R0 = new ArrayList();
        this.b1 = -5;
        this.s1 = 1.0f;
        n68 n68Var = new n68(this);
        this.y1 = n68Var;
        this.a2 = -1.0f;
        this.b2 = -1.0f;
        this.c2 = -1.0f;
        this.j2 = ConnectionsManager.generateClassGuid();
        this.y2 = new mm(this);
        this.z2 = new mm(this);
        de8 de8Var = new de8();
        this.H2 = de8Var;
        this.O2 = 1.0f;
        this.y3 = new u48(this, (byte) 0);
        this.A3 = new u48(this, (byte) 1);
        this.B3 = new ArrayList();
        this.C3 = new ArrayList();
        this.F3 = new li7(this, (byte) 6);
        this.G3 = new mm(this);
        this.H3 = new mm(this);
        this.I3 = new mm(this);
        this.K3 = new Path();
        de8Var.E = new v34(this, (byte) 21);
        d30 d30Var = new d30();
        d30Var.g = new ArrayList();
        this.w2 = d30Var;
        this.x2 = new pn(null);
        this.f1 = new ArrayList();
        this.g1 = new ArrayList();
        nl nlVar = new nl(this, (byte) 5);
        this.O0 = nlVar;
        nlVar.B0 = false;
        nlVar.A1 = true;
        nlVar.y = true;
        nlVar.T(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.V2 = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
        imageReceiver.T(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.X2 = imageReceiver2;
        imageReceiver2.A1 = true;
        imageReceiver2.y = true;
        imageReceiver2.T(3);
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.P0 = imageReceiver3;
        imageReceiver3.A1 = true;
        imageReceiver3.y = true;
        imageReceiver3.T(0);
        ImageReceiver imageReceiver4 = new ImageReceiver(null);
        this.Q0 = imageReceiver4;
        imageReceiver4.A1 = true;
        imageReceiver4.y = true;
        imageReceiver4.T(0);
        nlVar.a = Arrays.asList(imageReceiver3, imageReceiver4);
        this.X0 = new rb0((vnb) null);
        this.t0 = lcbVar;
        this.h1 = m68Var;
        this.z1 = m68Var.g;
        this.C1 = uc7.s1(yac.t0).O1();
        m68Var.l.setColor(-16777216);
        this.X1 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.l0 = x53Var;
        setClipChildren(false);
        s58 s58Var = new s58(this, context, this.M0, x53Var, lcbVar);
        this.T0 = s58Var;
        cl0 cl0Var = new cl0(x53Var, aob.Je, 0.8f);
        this.r3 = cl0Var;
        oz4 oz4Var = new oz4();
        oz4Var.a(vm2.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !xea.e()) {
            this.q3 = null;
        } else {
            rz4 rz4Var = new rz4(oz4Var);
            this.q3 = rz4Var;
            rz4Var.l(hl.L(8.0f));
            oz4Var = rz4Var;
        }
        yic yicVar = new yic(this);
        ll0 ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
        ll0Var.h = yicVar;
        ll0Var.i = this;
        this.p3 = ll0Var;
        this.V1 = ll0Var.c(this, cl0Var, false);
        jl0 c = ll0Var.c(this, cl0Var, false);
        this.W1 = c;
        c.u(hl.L(32.0f));
        u58 u58Var = new u58(this, context, m68Var, lcbVar);
        this.M0 = u58Var;
        u58Var.setClipChildren(false);
        this.U0 = new tv3(this.m2, u58Var);
        u58Var.addView(s58Var, tre.c(-1.0f, -1));
        z58 z58Var = new z58(this, getContext(), lcbVar.E, lcbVar, x53Var);
        this.u0 = z58Var;
        z58Var.b0.setOnClickListener(new v48(this, (byte) 1));
        ImageView imageView = new ImageView(context);
        this.x0 = imageView;
        imageView.setImageDrawable(m68Var.m);
        int L = hl.L(8.0f);
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new v48(this, (byte) 2));
        imageView.setContentDescription(ob6.M0(2131745187, null));
        iye.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(m68Var.n);
        imageView2.setPadding(L, L, L, L);
        p58 p58Var = new p58(this, getContext(), (byte) 1);
        this.z0 = p58Var;
        hn hnVar = this.B0;
        if (hnVar != null) {
            hnVar.setCallback(p58Var);
        }
        p58Var.setWillNotDraw(false);
        p58Var.setOnClickListener(new v48(this, (byte) 3));
        p58 p58Var2 = new p58(this, getContext(), (byte) 2);
        this.n0 = p58Var2;
        hn hnVar2 = this.A0;
        if (hnVar2 != null) {
            hnVar2.setCallback(p58Var2);
        }
        p58Var2.setWillNotDraw(false);
        p58Var2.setOnClickListener(new v48(this, (byte) 4));
        p58Var2.setOnLongClickListener(new v0(this, lcbVar, (byte) 3));
        h6b h6bVar = new h6b(context, m68Var);
        this.o0 = h6bVar;
        h6bVar.setPadding(L, L, L, L);
        p58Var2.addView(this.o0, tre.e(40, 40, 3));
        p58Var.addView(imageView2, tre.e(40, 40, 3));
        iye.b(p58Var2, 0.3f, 5.0f);
        iye.b(p58Var, 0.3f, 5.0f);
        final byte b = 1;
        nlVar.A1 = true;
        nlVar.p0(u58Var);
        bn9 bn9Var = new bn9(10);
        this.i1 = bn9Var;
        u58Var.setOutlineProvider(bn9Var);
        u58Var.setClipToOutline(true);
        addView(u58Var);
        l68 l68Var = new l68(context, n68Var);
        this.Y0 = l68Var;
        l68Var.setOnClickListener(new View.OnClickListener(this) { // from class: w48
            public final /* synthetic */ o68 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                lcb lcbVar2 = lcbVar;
                o68 o68Var = this.b;
                switch (b2) {
                    case 0:
                        if (!o68Var.y1.h()) {
                            o68Var.X0(true);
                            break;
                        } else {
                            lcbVar2.T();
                            if (!lcb.D1) {
                                uc7.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            o68Var.i0.setContentDescription(ob6.M0(!lcb.D1 ? 2131748068 : 2131743504, null));
                            break;
                        }
                    default:
                        long j = yac.h(o68Var.m2).n;
                        long j2 = o68Var.l1;
                        if (j != j2) {
                            if (j2 <= 0) {
                                lcbVar2.L(zu1.ha(j2));
                                break;
                            } else {
                                lcbVar2.L(ProfileActivity.Q2(j2));
                                break;
                            }
                        } else {
                            Bundle j3 = qu6.j(1, TeXSymbolParser.TYPE_ATTR);
                            j3.putLong("dialog_id", o68Var.l1);
                            lcbVar2.L(new em6(j3, null));
                            break;
                        }
                }
            }
        });
        u58Var.addView(l68Var, tre.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(imageView, tre.r(40, 40, 5));
        linearLayout.addView(p58Var, tre.r(40, 40, 5));
        linearLayout.addView(p58Var2, tre.r(40, 40, 5));
        addView(linearLayout, tre.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.g0 = imageView3;
        imageView3.setImageDrawable(m68Var.q);
        imageView3.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        imageView3.setBackground(aob.f0(-1, 1, -1));
        imageView3.setContentDescription(ob6.M0(2131754834, null));
        u58Var.addView(imageView3, tre.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.h0 = imageView4;
        imageView4.setImageDrawable(m68Var.r);
        imageView4.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        imageView4.setBackground(aob.f0(-1, 1, -1));
        imageView4.setContentDescription(ob6.M0(2131754803, null));
        u58Var.addView(imageView4, tre.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new am7(lcbVar, (byte) 9));
        imageView3.setOnClickListener(new nh(this, x53Var, lcbVar, context, m68Var, (byte) 11));
        b6 b6Var = new b6(context, (byte) 23);
        this.i0 = b6Var;
        u58Var.addView(b6Var, tre.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        e29 e29Var = new e29(context);
        this.j0 = e29Var;
        e29Var.setPadding(hl.L(6.0f), hl.L(6.0f), hl.L(6.0f), hl.L(6.0f));
        b6Var.addView(e29Var);
        ImageView imageView5 = new ImageView(context);
        this.k0 = imageView5;
        imageView5.setPadding(hl.L(6.0f), hl.L(6.0f), hl.L(6.0f), hl.L(6.0f));
        imageView5.setImageDrawable(m68Var.t);
        b6Var.addView(imageView5);
        imageView5.setVisibility(8);
        x9b x9bVar = new x9b(context);
        this.m0 = x9bVar;
        x9bVar.setOnClickListener(new v48(this, (byte) 0));
        u58Var.addView(x9bVar, tre.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final byte b2 = 0;
        b6Var.setOnClickListener(new View.OnClickListener(this) { // from class: w48
            public final /* synthetic */ o68 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                lcb lcbVar2 = lcbVar;
                o68 o68Var = this.b;
                switch (b22) {
                    case 0:
                        if (!o68Var.y1.h()) {
                            o68Var.X0(true);
                            break;
                        } else {
                            lcbVar2.T();
                            if (!lcb.D1) {
                                uc7.e1().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            o68Var.i0.setContentDescription(ob6.M0(!lcb.D1 ? 2131748068 : 2131743504, null));
                            break;
                        }
                    default:
                        long j = yac.h(o68Var.m2).n;
                        long j2 = o68Var.l1;
                        if (j != j2) {
                            if (j2 <= 0) {
                                lcbVar2.L(zu1.ha(j2));
                                break;
                            } else {
                                lcbVar2.L(ProfileActivity.Q2(j2));
                                break;
                            }
                        } else {
                            Bundle j3 = qu6.j(1, TeXSymbolParser.TYPE_ATTR);
                            j3.putLong("dialog_id", o68Var.l1);
                            lcbVar2.L(new em6(j3, null));
                            break;
                        }
                }
            }
        });
        this.Z0 = new e8b(this, m68Var);
        u58Var.addView(z58Var, tre.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        c58 c58Var = new c58(this, context, lcbVar, lcbVar.w, view, frameLayout, lcbVar);
        this.v0 = c58Var;
        u58Var.addView(view, tre.e(-1, jn7.d3, 87));
        u58Var.addView(c58Var, tre.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        u58Var.addView(frameLayout, tre.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int L2 = hl.L(20.0f);
        int o = vm2.o(-1, 100);
        b6Var.setBackground(aob.i0(L2, L2, L2, L2, 0, o, o));
        int L3 = hl.L(20.0f);
        int o2 = vm2.o(-1, 100);
        imageView3.setBackground(aob.i0(L3, L3, L3, L3, 0, o2, o2));
        int L4 = hl.L(20.0f);
        int o3 = vm2.o(-1, 100);
        imageView4.setBackground(aob.i0(L4, L4, L4, L4, 0, o3, o3));
        int L5 = hl.L(20.0f);
        int o4 = vm2.o(-1, 100);
        imageView.setBackground(aob.i0(L5, L5, L5, L5, 0, o4, o4));
        int L6 = hl.L(20.0f);
        int o5 = vm2.o(-1, 100);
        p58Var2.setBackground(aob.i0(L6, L6, L6, L6, 0, o5, o5));
        int L7 = hl.L(20.0f);
        int o6 = vm2.o(-1, 100);
        p58Var.setBackground(aob.i0(L7, L7, L7, L7, 0, o6, o6));
        jmb jmbVar = z58Var.W;
        View m = jmbVar.m(context);
        hl.B2(m);
        addView(m);
        jmbVar.D = new ur1(this, (byte) 2);
        jmbVar.Q(this);
    }

    public static void Q0(b6b b6bVar, ImageReceiver imageReceiver, String str) {
        if (b6bVar.s) {
            imageReceiver.Y(null, null, jn5.g(b6bVar.f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.Z(jn5.g(b6bVar.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k5 getAccountInstance() {
        return k5.a(this.m2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        float f = 1.0f - this.y2.c;
        g4a g4aVar = this.t0.x;
        return (1.0f - (g4aVar == null ? 0.0f : g4aVar.f)) * f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        lcb lcbVar;
        if (!this.y1.f || (lcbVar = this.t0) == null || lcbVar.B0 == null || v0(true)) {
            return 0L;
        }
        return lcbVar.B0.m();
    }

    public final boolean A0() {
        v5b v5bVar;
        lcb lcbVar = this.t0;
        return (lcbVar == null || (v5bVar = lcbVar.O0) == null || v5bVar.e != 4) ? false : true;
    }

    public final boolean B0() {
        TLRPC.User X1;
        return A0() && (X1 = uc7.s1(this.m2).X1(Long.valueOf(this.t0.O0.d))) != null && X1.bot && X1.bot_can_edit;
    }

    public abstract boolean C0();

    public final void D0(ValueAnimator valueAnimator) {
        this.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = (-hl.L(8.0f)) * this.N3;
        l68 l68Var = this.Y0;
        l68Var.setTranslationY(f);
        l68Var.setAlpha(1.0f - this.N3);
        float f2 = (-hl.L(8.0f)) * this.N3;
        ImageView imageView = this.g0;
        imageView.setTranslationY(f2);
        imageView.setAlpha(1.0f - this.N3);
        float f3 = (-hl.L(8.0f)) * this.N3;
        ImageView imageView2 = this.h0;
        imageView2.setTranslationY(f3);
        imageView2.setAlpha(1.0f - this.N3);
        float f4 = (-hl.L(8.0f)) * this.N3;
        b6 b6Var = this.i0;
        b6Var.setTranslationY(f4);
        b6Var.setAlpha((1.0f - this.N3) * this.O2);
        p58 p58Var = this.G1;
        if (p58Var != null) {
            p58Var.setTranslationY(hl.L(8.0f) * this.N3);
            this.G1.setAlpha(1.0f - this.N3);
        }
        x9b x9bVar = this.m0;
        if (x9bVar != null) {
            x9bVar.setTranslationY((-hl.L(8.0f)) * this.N3);
            x9bVar.setAlpha(1.0f - this.N3);
        }
        this.u0.setAlpha(1.0f - this.N3);
        k68 k68Var = this.A1;
        float f5 = k68Var == null ? 0.0f : ((ccb) k68Var).d.W;
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        p58 p58Var2 = this.n0;
        if (p58Var2 != null) {
            p58Var2.setAlpha((1.0f - this.N3) * (1.0f - f5) * hideInterfaceAlpha);
        }
        ImageView imageView3 = this.x0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - this.N3) * (1.0f - f5) * hideInterfaceAlpha);
        }
        p58 p58Var3 = this.z0;
        if (p58Var3 != null) {
            p58Var3.setAlpha((1.0f - this.N3) * (1.0f - f5) * hideInterfaceAlpha);
        }
        h58 h58Var = this.L1;
        if (h58Var != null) {
            h58Var.setAlpha(1.0f - this.N3);
            invalidate();
        }
        this.M0.invalidate();
    }

    public final void E0(w49 w49Var) {
        boolean z;
        TLRPC.Reaction reaction;
        n68 n68Var = this.y1;
        TL_stories.StoryItem storyItem = n68Var.a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z2 = reaction2 != null;
        if (reaction2 != null && w49Var == null) {
            b0();
            this.C1.i0(this.l1, n68Var.a, null);
        } else if (w49Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(this.m2).r.get("❤");
            if (tL_availableReaction != null) {
                this.Z2 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a = s49.a();
                jn5 b = jn5.b(document);
                ImageReceiver imageReceiver = this.V2;
                imageReceiver.d0(b, a, null, null, null, 0);
                if (imageReceiver.y() != null) {
                    imageReceiver.y().I(0, false, true);
                }
                this.a3 = true;
                this.C1.i0(this.l1, n68Var.a, w49.c(tL_availableReaction));
            }
        } else {
            b0();
            this.C1.i0(this.l1, n68Var.a, w49Var);
        }
        TL_stories.StoryItem storyItem2 = n68Var.a;
        p58 p58Var = this.n0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.o0.setReaction(null);
            p58Var.setContentDescription(ob6.M0(2131754846, null));
            z = false;
        } else {
            z2 = !z2;
            this.o0.setReaction(w49.d(reaction));
            p58Var.setContentDescription(ob6.M0(2131754845, null));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z = true;
        }
        if (this.n1 && z2) {
            TL_stories.StoryItem storyItem3 = n68Var.a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = n68Var.a.views;
            int i = storyViews.reactions_count + (z ? 1 : -1);
            storyViews.reactions_count = i;
            if (i < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = n68Var.a;
        z49.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void F0() {
        w96 w96Var;
        if (this.x3 == null) {
            lcb lcbVar = this.t0;
            if (lcbVar != null && (w96Var = lcbVar.B0) != null) {
                if (w96Var.s == null ? false : !r1.messages_enabled) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers L1 = uc7.s1(this.m2).L1(this.l1, true);
            this.x3 = L1;
            h58 h58Var = this.L1;
            if (h58Var == null || L1 == null) {
                return;
            }
            h58Var.I2(true);
        }
    }

    public final boolean G0() {
        h58 h58Var = this.L1;
        if (h58Var == null) {
            return false;
        }
        boolean z = h58Var.o3;
        if (z) {
            h58Var.h2();
        }
        hl.d3(new u48(this, (byte) 5), 300L);
        return z;
    }

    public final void H0() {
        long j;
        b58 b58Var;
        nx0 nx0Var;
        int i;
        uc7.e1().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.L1.getTextWithEntities();
        long e = yac.h(this.m2).e();
        TLRPC.Peer l = this.t0.B0.l();
        if (l != null) {
            e = wf3.n(l);
        }
        Context context = getContext();
        int i2 = this.m2;
        String r = wf3.r(i2, this.l1);
        long messageMinPrice = getMessageMinPrice();
        long j2 = this.u3;
        b58 b58Var2 = new b58(this, (byte) 0);
        x53 x53Var = new x53();
        nx0 nx0Var2 = new nx0(1, (vnb) x53Var, context, false);
        nx0Var2.J();
        nx0Var2.w0 = false;
        LinearLayout j3 = uh9.j(context, 1);
        nx0Var2.O = j3;
        int[] iArr = uc7.s1(i2).U3;
        CharSequence j0 = r47.j0(textWithEntities, false, false, new TextPaint());
        if (j0 instanceof Spannable) {
            Spannable spannable = (Spannable) j0;
            j = j2;
            b58Var = b58Var2;
            nx0Var = nx0Var2;
            i = ((hm[]) spannable.getSpans(0, j0.length(), hm.class)).length + ((mv3[]) spannable.getSpans(0, j0.length(), mv3.class)).length;
        } else {
            j = j2;
            b58Var = b58Var2;
            nx0Var = nx0Var2;
            i = 0;
        }
        int max = (int) Math.max(messageMinPrice, j <= 0 ? 100L : j);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            int i3 = length * 7;
            int i4 = iArr[i3];
            int[] iArr2 = iArr;
            int i5 = iArr2[i3 + 2];
            if (i <= iArr2[i3 + 3] && j0.length() <= i5) {
                max = Math.max(max, i4);
                break;
            } else {
                length--;
                iArr = iArr2;
            }
        }
        long[] jArr = {max};
        c51 c51Var = new c51(null, context, true);
        m96 m96Var = new m96();
        m96Var.c = e;
        m96Var.f = textWithEntities;
        m96Var.g = jArr[0];
        h96 h96Var = new h96(i2, context, true);
        LinearLayout j4 = uh9.j(context, 0);
        zc zcVar = new zc(context, ob6.M0(2131748568, null), x53Var);
        j4.addView(zcVar, tre.q(-1, -1, 1.0f, jn7.w1, 0, 0, 5, 0));
        zc zcVar2 = new zc(context, ob6.M0(2131748569, null), x53Var);
        j4.addView(zcVar2, tre.q(-1, -1, 1.0f, jn7.w1, 5, 0, 5, 0));
        zc zcVar3 = new zc(context, ob6.M0(2131748570, null), x53Var);
        j4.addView(zcVar3, tre.q(-1, -1, 1.0f, jn7.w1, 5, 0, 0, 0));
        dg5 dg5Var = new dg5(context, x53Var, r6);
        b58 b58Var3 = b58Var;
        pcc[] pccVarArr = {new cg5(jArr, c51Var, new wm2[1], m96Var, h96Var, i2, zcVar, zcVar2, zcVar3, dg5Var, new boolean[]{true})};
        h96Var.set(m96Var);
        int i6 = 9;
        int[] iArr3 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int f = uc7.s1(i2).l4.T2.f();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                break;
            }
            int[] iArr4 = iArr3;
            if (iArr3[i7] >= messageMinPrice) {
                if (i7 > 0 && arrayList.isEmpty() && iArr4[i7] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i8 = iArr4[i7];
                if (i8 > f) {
                    arrayList.add(Integer.valueOf(f));
                    break;
                } else {
                    arrayList.add(Integer.valueOf(i8));
                    if (iArr4[i7] == f) {
                        break;
                    }
                }
            }
            i7++;
            iArr3 = iArr4;
            i6 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) c00.g(1, arrayList)).intValue() < f) {
            arrayList.add(Integer.valueOf(f));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr5[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        dg5Var.f0 = iArr5;
        dg5Var.setValue((int) jArr[0]);
        j3.addView(dg5Var, tre.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        pccVarArr[0].a(Integer.valueOf((int) jArr[0]));
        j3.addView(j4, tre.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i10 = aob.j5;
        TextView b = zze.b(context, 20.0f, i10, true, x53Var);
        uh9.q(b, 17, null, 2131748565);
        j3.addView(b, tre.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b2 = zze.b(context, 14.0f, i10, false, x53Var);
        b2.setGravity(17);
        uh9.r(null, null, 2131748566, new Object[]{r}, b2);
        j3.addView(b2, tre.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        j3.addView(h96Var, tre.t(-2, -2, 17, 42, 22, 42, 20));
        j3.addView(c51Var, tre.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        nx0Var.show();
        c51Var.setOnClickListener(new lw4(b58Var3, jArr, nx0Var, (byte) 4));
    }

    public final void I0() {
        n68 n68Var = this.y1;
        if (n68Var.a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = n68Var.a.id;
        tL_stories_exportStoryLink.peer = uc7.s1(this.m2).j1(this.l1);
        ConnectionsManager.getInstance(this.m2).sendRequest(tL_stories_exportStoryLink, new o58());
    }

    public final void J0() {
        if (this.L1 == null) {
            return;
        }
        j0();
        this.s2.d2.g0();
        this.s2.u1(-1, true);
        f41 f41Var = this.s2;
        f41Var.T1 = this.l1;
        f41Var.a1();
        this.s2.V0().setText(this.L1.getFieldText());
        ((ccb) this.A1).h(this.s2);
    }

    public final void K0() {
        Bundle bundle = new Bundle();
        long j = this.l1;
        if (j < 0) {
            bundle.putLong("chat_id", -j);
        } else {
            bundle.putLong("user_id", j);
        }
        TLRPC.Dialog S0 = uc7.s1(this.m2).S0(this.l1);
        if (S0 != null) {
            bundle.putInt("message_id", S0.top_message);
        }
        this.t0.L(new zu1(bundle));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        if (((kq9) r5).U == r8) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
    
        if (((dq9) r5).b0 == r8) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0(long j) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        w96 w96Var;
        me8 me8Var;
        me8 me8Var2;
        if (!this.u1) {
            this.w2.e = null;
            return;
        }
        n68 n68Var = this.y1;
        if (!n68Var.f) {
            if (!n68Var.e) {
                cc4.b("PeerStoriesView.requestVideoPlayer(" + j + "): null, not a video");
                ((ccb) this.A1).c(null, null, 0L, this.w2);
                d30 d30Var = this.w2;
                d30Var.e = null;
                d30Var.a = false;
                return;
            }
            if (n68Var.c() == null || !new File(this.y1.c()).exists()) {
                TL_stories.StoryItem storyItem = this.y1.a;
                if (storyItem != null) {
                    storyItem.dialogId = this.l1;
                    try {
                        document2 = c6b.B(this.m2, storyItem);
                        try {
                            TL_stories.StoryItem storyItem2 = this.y1.a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = xb4.G(this.m2).F(this.y1.a);
                            }
                            StringBuilder sb = new StringBuilder("?account=");
                            sb.append(this.m2);
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
                            sb.append(this.y1.a.fileReference);
                            sb.append("&name=");
                            sb.append(URLEncoder.encode(xb4.B(document2), "UTF-8"));
                            sb.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb.append(Utilities.f(bArr));
                            sb.append("&sid=");
                            sb.append(this.y1.a.id);
                            sb.append("&did=");
                            sb.append(this.y1.a.dialogId);
                            Uri parse = Uri.parse("tg://" + xb4.r(null, document2) + sb.toString());
                            cc4.b("StoryViewer requestVideoPlayer(" + j + "): playing from " + parse);
                            this.B2 = (long) (r47.H0(document2) * 1000.0d);
                            uri = parse;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                            if (uri == null) {
                            }
                            ((ccb) this.A1).c(document, uri, j, this.w2);
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
                Uri fromFile = Uri.fromFile(new File(this.y1.c()));
                cc4.b("StoryViewer requestVideoPlayer(" + j + "): playing from attachPath " + fromFile);
                this.B2 = 0L;
                uri = fromFile;
                document = null;
            }
            if (uri == null) {
                cc4.b("PeerStoriesView.requestVideoPlayer(" + j + "): playing from null?");
            }
            ((ccb) this.A1).c(document, uri, j, this.w2);
            this.M0.invalidate();
            return;
        }
        k68 k68Var = this.A1;
        TL_stories.StoryItem storyItem3 = n68Var.a;
        long j2 = this.l1;
        int i = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        d30 d30Var2 = this.w2;
        ccb ccbVar = (ccb) k68Var;
        ccbVar.i(true, true);
        w96 w96Var2 = ccbVar.d.B0;
        if (w96Var2 == null || w96Var2.b != j2 || !w96Var2.i(inputGroupCall)) {
            x96 x96Var = ccbVar.d.E0;
            if (x96Var != null) {
                x96Var.e(j2, null);
                x96 x96Var2 = ccbVar.d.E0;
                x96Var2.getClass();
                bnb bnbVar = x96Var2.c;
                if (bnbVar != null) {
                    bnbVar.a();
                }
                ea6 ea6Var = x96Var2.e;
                if (ea6Var != null) {
                    if (ea6Var.d != 0 || ea6Var.e != 0) {
                        ea6Var.e = 0;
                        ea6Var.d = 0;
                        ea6Var.requestLayout();
                    }
                    a81 a81Var = x96Var2.f;
                    a81Var.c = null;
                    a81Var.invalidate();
                }
                x96Var2.y = false;
                x96Var2.f(false, false);
            }
            ba6 ba6Var = ba6.E;
            if (ba6Var == null || ba6Var.b == null || (me8Var2 = ba6Var.a) == null || !me8Var2.g() || !ba6Var.b.i(inputGroupCall)) {
                w96Var = null;
            } else {
                w96Var = ba6Var.b;
                if (ba6Var.a != null) {
                    ke8 ke8Var = ba6Var.e;
                    ba6Var.e = null;
                    aa6 aa6Var = ba6Var.d;
                    if (aa6Var != null) {
                        aa6Var.a = null;
                    }
                    da6 da6Var = ba6Var.f;
                    ba6Var.f = null;
                    ba6Var.a.a(new v35(ke8Var, da6Var, (byte) 7));
                }
            }
            lcb lcbVar = ccbVar.d;
            w96 w96Var3 = lcbVar.B0;
            if (w96Var3 != null && w96Var3 != w96Var) {
                if (w96Var3.n || ba6.a(w96Var3)) {
                    if (w96Var == null) {
                        lcb lcbVar2 = ccbVar.d;
                        x96 x96Var3 = lcbVar2.E0;
                        w96 w96Var4 = lcbVar2.B0;
                        if (w96Var4 instanceof kq9) {
                            ea6 ea6Var2 = x96Var3.e;
                            if (ea6Var2 != null) {
                            }
                        } else if (w96Var4 instanceof dq9) {
                            bnb bnbVar2 = x96Var3.c;
                            if (bnbVar2 == null) {
                                bnbVar2 = null;
                            }
                            if (bnbVar2 != null) {
                            }
                        } else {
                            x96Var3.getClass();
                        }
                    }
                    ccbVar.d.B0.d();
                } else {
                    ccbVar.d.B0.h();
                }
                lcbVar = ccbVar.d;
                lcbVar.B0 = null;
            }
            if (w96Var != null) {
                lcbVar.B0 = w96Var;
            }
            ba6 ba6Var2 = ba6.E;
            if (ba6Var2 != null && (me8Var = ba6Var2.a) != null && me8Var.g()) {
                ba6Var2.a.b();
            }
            lcb lcbVar3 = ccbVar.d;
            kcb kcbVar = lcbVar3.A0;
            if (kcbVar != null) {
                kcbVar.release(null);
                lcbVar3 = ccbVar.d;
                lcbVar3.A0 = null;
            }
            d30 d30Var3 = lcbVar3.G0;
            if (d30Var3 != null) {
                d30Var3.c = null;
                d30Var3.b = null;
                d30Var3.a = false;
                d30Var3.e = null;
                d30Var3.f = null;
                d30Var3.d = null;
                d30Var3.m();
                lcbVar3 = ccbVar.d;
                lcbVar3.G0 = null;
            }
            if (lcbVar3.B0 == null) {
                w96 w96Var5 = w96.N;
                if (w96Var5 == null || !w96Var5.i(inputGroupCall)) {
                    lcb lcbVar4 = ccbVar.d;
                    lcbVar4.B0 = w96.g(ccbVar.c, lcbVar4.h, storyItem3, j2, i, z, inputGroupCall, false, false);
                } else {
                    ccbVar.d.B0 = w96.N;
                }
            }
            lcb lcbVar5 = ccbVar.d;
            lcbVar5.E0.a(lcbVar5.B0);
            lcb lcbVar6 = ccbVar.d;
            w96 w96Var6 = lcbVar6.B0;
            ba6 ba6Var3 = ba6.E;
            if (ba6Var3 == null) {
                ba6Var3 = new ba6();
                ba6.E = ba6Var3;
            }
            me8 me8Var3 = ba6Var3.a;
            if (me8Var3 != null && me8Var3.f()) {
                me8 me8Var4 = ba6Var3.a;
                if (me8Var4.c != 0) {
                    if (ba6Var3.b != w96Var6) {
                        me8Var4.b();
                    }
                    lcb lcbVar7 = ccbVar.d;
                    lcbVar7.G0 = d30Var2;
                    d30Var2.a = false;
                    d30Var2.e = lcbVar7.z0;
                    d30Var2.f = lcbVar7.E0.getVideoTextureView();
                    lcb lcbVar8 = ccbVar.d;
                    d30 d30Var4 = lcbVar8.G0;
                    x96 x96Var4 = lcbVar8.E0;
                    x96Var4.getClass();
                    d30Var4.d = null;
                    d30Var4.b = lcbVar8.B0;
                    x96Var4.e(j2, d30Var4);
                    ccbVar.d.G0.m();
                }
            }
            ba6Var3.c = lcbVar6;
            ba6Var3.c(w96Var6);
            me8 me8Var5 = ba6Var3.a;
            if (me8Var5 == null || !me8Var5.f()) {
                ba6Var3.a = fc3.b().k(ba6Var3);
            }
            y96 y96Var = ba6Var3.w;
            LaunchActivity launchActivity = LaunchActivity.H1;
            LaunchActivity launchActivity2 = ba6Var3.x;
            if (launchActivity2 != launchActivity) {
                if (launchActivity2 != null) {
                    launchActivity2.a1.remove(y96Var);
                }
                ba6Var3.x = launchActivity;
                if (launchActivity != null) {
                    launchActivity.a1.add(y96Var);
                }
            }
            ba6Var3.a.e();
            lcb lcbVar72 = ccbVar.d;
            lcbVar72.G0 = d30Var2;
            d30Var2.a = false;
            d30Var2.e = lcbVar72.z0;
            d30Var2.f = lcbVar72.E0.getVideoTextureView();
            lcb lcbVar82 = ccbVar.d;
            d30 d30Var42 = lcbVar82.G0;
            x96 x96Var42 = lcbVar82.E0;
            x96Var42.getClass();
            d30Var42.d = null;
            d30Var42.b = lcbVar82.B0;
            x96Var42.e(j2, d30Var42);
            ccbVar.d.G0.m();
        }
        this.M0.invalidate();
    }

    public final void M0() {
        n68 n68Var = this.y1;
        TL_stories.StoryItem storyItem = n68Var.a;
        if ((storyItem == null && n68Var.b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File f = n68Var.f();
        boolean z = n68Var.e;
        if (f == null || !f.exists()) {
            V0();
            return;
        }
        MediaController.g0(f.toString(), getContext(), z ? 1 : 0, null, null, new sa((byte) 4, this, z));
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
        if (uri == null || (storyItem = this.y1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String uri2 = uri.toString();
        boolean z = true;
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                str = uri2.split("/1/")[1];
                indexOf = str.indexOf("/ACTUAL");
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (indexOf != -1) {
                parse = Uri.parse(URLDecoder.decode(str.substring(0, indexOf), "UTF-8"));
                String S0 = hl.S0(parse);
                if (f11.b) {
                    if (S0 == null) {
                        String uri3 = parse.toString();
                        String q = MediaController.q(-1L, parse, "file");
                        if (q == null) {
                            U0();
                            return;
                        }
                        str2 = uri3;
                        S0 = q;
                        z = false;
                        if (z) {
                            r7a.S(getAccountInstance(), null, null, parse, null, null, this.l1, null, null, storyItem, null, true, null, null);
                            return;
                        } else {
                            r7a.S(getAccountInstance(), S0, str2, null, null, null, this.l1, null, null, storyItem, null, true, null, null);
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
        String S02 = hl.S0(parse);
        if (f11.b) {
        }
        str2 = S02;
        if (z) {
        }
    }

    public final void O0(long j, boolean z) {
        if (this.u1 != z) {
            this.u1 = z;
            e29 e29Var = this.j0;
            if (z) {
                if (this.t0.a && Build.VERSION.SDK_INT < 33) {
                    lcb lcbVar = ((ccb) this.A1).d;
                    lcbVar.l1 = true;
                    lcbVar.U();
                    li7 li7Var = this.F3;
                    hl.r(li7Var);
                    hl.d3(li7Var, 100L);
                }
                L0(j);
                d1();
                e29Var.setAnimation(this.h1.u);
                this.u1 = true;
                this.Y0.a.getImageReceiver().v0(true, true);
                n68 n68Var = this.y1;
                if (n68Var.a != null) {
                    cc4.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + n68Var.a.id + " " + n68Var.d());
                }
            } else {
                f0();
                e29Var.a();
                this.V0 = null;
                this.v2 = false;
                this.y2.e(true, 0.0f);
                this.M0.invalidate();
                invalidate();
                g0();
                lcb lcbVar2 = ((ccb) this.A1).d;
                lcbVar2.I0 = false;
                lcbVar2.U();
            }
            this.O0.T(this.u1 ? 3 : 2);
            this.P0.T(this.u1 ? 2 : 0);
            this.Q0.T(this.u1 ? 2 : 0);
            if (this.m1 || this.n1) {
                c6b c6bVar = this.C1;
                long j2 = this.l1;
                boolean z2 = this.u1;
                zh6 zh6Var = c6bVar.m;
                hjc hjcVar = (hjc) zh6Var.f(j2);
                if (hjcVar == null) {
                    hjcVar = new hjc(c6bVar.a, j2, c6bVar);
                    zh6Var.k(j2, hjcVar);
                }
                hjcVar.b(z2);
            }
        }
    }

    public final void P0(int i, long j) {
        if (this.l1 != j) {
            n68 n68Var = this.y1;
            n68Var.b = null;
            n68Var.a = null;
        }
        this.l1 = j;
        this.j1 = null;
        e0(i);
        TL_stories.PeerStories peerStories = this.t0.Q0;
        c6b c6bVar = this.C1;
        boolean z = true;
        if (peerStories != null) {
            c6bVar.U(peerStories, true);
            return;
        }
        TL_stories.PeerStories x = c6bVar.x(j);
        if (x == null) {
            x = c6bVar.y(j);
        } else {
            z = false;
        }
        c6bVar.U(x, z);
    }

    public final void R0(long j, boolean z, boolean z2) {
        if (!z && j == this.v3 && this.w3 == z2) {
            return;
        }
        this.v3 = j;
        this.w3 = z2;
        l68 l68Var = this.Y0;
        if (j < 0) {
            TLRPC.Chat M0 = uc7.s1(this.m2).M0(Long.valueOf(-j));
            ff0 ff0Var = l68Var.b;
            ff0 ff0Var2 = l68Var.b;
            ff0Var.l(hl.A2(M0 == null ? "" : M0.title), false);
            if (M0 == null || !M0.verified) {
                ff0Var2.i(null);
                return;
            }
            Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate.setAlpha(jn7.d4);
            zm2 zm2Var = new zm2(mutate, null);
            zm2Var.x = true;
            int L = hl.L(16.0f);
            int L2 = hl.L(16.0f);
            zm2Var.h = L;
            zm2Var.n = L2;
            ff0Var2.i(zm2Var);
            return;
        }
        if (this.m1 && !z2) {
            l68Var.b.l(ob6.M0(2131745369, null), false);
            l68Var.b.i(null);
            return;
        }
        TLRPC.User X1 = uc7.s1(this.m2).X1(Long.valueOf(j));
        if (X1 == null || !X1.verified) {
            l68Var.b.i(null);
        } else {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(jn7.d4);
            zm2 zm2Var2 = new zm2(mutate2, null);
            zm2Var2.x = true;
            int L3 = hl.L(16.0f);
            int L4 = hl.L(16.0f);
            zm2Var2.h = L3;
            zm2Var2.n = L4;
            l68Var.b.i(zm2Var2);
        }
        if (X1 != null) {
            l68Var.b.l(pv3.m(hl.A2(lv2.p(X1)), l68Var.b.getPaint().getFontMetricsInt(), false, null, 0), false);
        } else {
            l68Var.b.l(null, false);
        }
    }

    public final void S0(float f, float f2, g3a g3aVar) {
        this.W0 = f;
        this.k3 = 1.0f / f2;
        if (this.V0 != g3aVar) {
            this.V0 = g3aVar;
            if (g3aVar != null) {
                ImageReceiver imageReceiver = g3aVar.a;
                if (imageReceiver.n() != null) {
                    Bitmap copy = imageReceiver.n().copy(Bitmap.Config.ARGB_8888, false);
                    nl nlVar = this.O0;
                    nlVar.d0 = null;
                    nlVar.a1.setShader(null);
                    nlVar.u0(new BitmapDrawable(copy));
                }
            }
        }
    }

    public final void T0(boolean z) {
        n68 n68Var = this.y1;
        if (n68Var.a != null) {
            lcb lcbVar = this.t0;
            if (lcbVar.f != null) {
                String b = n68Var.b();
                if (!z) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", b);
                    LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                    return;
                }
                n58 n58Var = new n58(this, lcbVar.f.getContext(), b, b, uc7.s1(this.m2).k5() && (!(this.n1 || lbc.C(this.l1)) || xc2.t0(this.n1 ? uc7.s1(this.m2).M0(Long.valueOf(-this.l1)) : null)), new pu0(this.l0, (byte) 5));
                this.J2 = n58Var;
                n58Var.d2 = true;
                TL_stories.StoryItem storyItem = n68Var.a;
                storyItem.dialogId = this.l1;
                n58Var.A2 = storyItem;
                n58Var.n2 = new kj4((Object) this, (byte) 24);
                ((ccb) this.A1).h(n58Var);
            }
        }
    }

    public final void U0() {
        u58 u58Var = this.M0;
        x53 x53Var = this.l0;
        new d31(u58Var, x53Var).t(ob6.M0(2131743488, null), x53Var).j();
    }

    public final void V0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.l0, getContext());
        String M0 = ob6.M0(R.string.AppName, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        idVar.U = ob6.M0(2131746945, null);
        ((ccb) this.A1).h(idVar);
    }

    public final void W0(boolean z) {
        if (this.c3 != z) {
            n68 n68Var = this.y1;
            if (n68Var.a != null) {
                this.c3 = z;
                byte b = 0;
                if (z) {
                    this.b3.setVisibility(0);
                }
                this.b3.setStoryItem(n68Var.a);
                lcb lcbVar = ((ccb) this.A1).d;
                lcbVar.p1 = z;
                lcbVar.U();
                if (!z) {
                    if (this.b3.getReactionsWindow() != null) {
                        this.b3.getReactionsWindow().e();
                    }
                    this.b3.animate().alpha(0.0f).setDuration(150L).setListener(new f58(this, b)).start();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d3, z ? 1.0f : 0.0f);
                this.b3.setTransitionProgress(this.d3);
                ofFloat.addUpdateListener(new y48(this, (byte) 1));
                ofFloat.addListener(new e58(this, z, b));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(k43.g);
                ofFloat.start();
            }
        }
    }

    public final void X0(boolean z) {
        if (this.q0 == null) {
            kg5 kg5Var = new kg5(getContext(), 1);
            kg5Var.n(1.0f, -56.0f);
            this.q0 = kg5Var;
            kg5Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
            this.M0.addView(this.q0, tre.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.q0.t(ob6.M0(z ? 2131744261 : 2131744111, null));
        this.q0.v();
    }

    public final void Y0() {
        if (this.q1) {
            return;
        }
        byte b = 1;
        if (this.o1) {
            if (this.s3 != null && this.t3 != null) {
                l46.o1(new qu0(this, (byte) 9), this.s3, this.t3, this.l1, true);
                return;
            }
            lcb lcbVar = this.t0;
            if (lcbVar != null) {
                lcbVar.k1 = true;
                lcbVar.U();
            }
            uc7.s1(this.m2).G0().a(this.l1, new b58(this, b));
            return;
        }
        h58 h58Var = this.L1;
        int i = -this.b1;
        this.b1 = i;
        hl.A3(i, h58Var, null);
        yw0.E.a();
        String r = this.l1 >= 0 ? lbc.r(uc7.s1(this.m2).X1(Long.valueOf(this.l1))) : "";
        boolean M3 = uc7.s1(this.m2).M3();
        x53 x53Var = this.l0;
        u58 u58Var = this.M0;
        (M3 ? new d31(u58Var, x53Var).Q(R.raw.star_premium_2, 36, hl.S2(ob6.a0(null, null, 2131743413, r))) : new d31(u58Var, x53Var).K(R.raw.star_premium_2, hl.S2(ob6.a0(null, null, 2131743413, r)), ob6.M0(2131743414, null), new u48(this, (byte) 11))).j();
    }

    public final boolean Z0(boolean z) {
        if (this.t0.R0) {
            z = !z;
        }
        int i = this.t1;
        if (z) {
            if (i < getStoriesCount() - 1) {
                this.t1++;
                c1(false);
                return true;
            }
        } else if (i > 0) {
            this.t1 = i - 1;
            c1(false);
            return true;
        }
        return false;
    }

    public final void a0(boolean z) {
        o68 currentPeerView;
        q qVar = this.t2;
        if (qVar != null) {
            qVar.f(false);
        }
        long j = this.l1;
        TL_stories.StoryItem storyItem = this.y1.a;
        lcb lcbVar = this.t0;
        lcbVar.getClass();
        if (j != 0 && storyItem != null) {
            lcb.E1.remove(j + (j >> 16) + (storyItem.id << 16));
        }
        this.S2 = true;
        bcb bcbVar = lcbVar.o0;
        if (bcbVar != null && (currentPeerView = bcbVar.getCurrentPeerView()) != null) {
            currentPeerView.i0();
        }
        if (z) {
            v21 J = new d31(this.M0, this.l0).J(R.raw.forward, ob6.M0(2131748237, null), ob6.M0(2131743204, null), 5000, false, new u48(this, (byte) 4));
            J.s = false;
            J.k(false);
        }
        uc7.s1(this.m2).r0(this.l1, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a1(long j) {
        String str;
        boolean z;
        TLRPC.Chat chat;
        int i = this.m2;
        if (j > 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            str = X1.first_name;
            z = X1.stories_hidden;
            chat = X1;
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            str = M0.title;
            z = M0.stories_hidden;
            chat = M0;
        }
        hl.d3(new us0(this, uc7.s1(this.m2), j, !z, str, chat), 200L);
    }

    public final void b0() {
        h6b h6bVar = this.o0;
        h6bVar.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new vk(h6bVar, (byte) 1)).setDuration(150L).start();
        int L = hl.L(8.0f);
        h6b h6bVar2 = new h6b(getContext(), this.h1);
        this.o0 = h6bVar2;
        h6bVar2.setPadding(L, L, L, L);
        this.o0.setAlpha(0.0f);
        this.o0.setScaleX(0.8f);
        this.o0.setScaleY(0.8f);
        this.o0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.n0.addView(this.o0, tre.e(40, 40, 3));
        this.a3 = false;
    }

    public final void b1() {
        if (uc7.s1(this.m2).k5()) {
            File f = this.y1.f();
            if (f == null || !f.exists()) {
                V0();
                return;
            }
            n58 n58Var = this.J2;
            if (n58Var != null) {
                n58Var.dismiss();
            }
            hl.d3(new u48(this, (byte) 8), 120L);
        }
    }

    public final void c0(boolean z) {
        ValueAnimator valueAnimator = this.M3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N3, z ? 1.0f : 0.0f);
        this.M3 = ofFloat;
        ofFloat.addUpdateListener(new y48(this, (byte) 2));
        this.M3.addListener(new e58(this, z, (byte) 1));
        this.M3.setDuration(420L);
        this.M3.setInterpolator(k43.h);
        this.M3.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x092d, code lost:
    
        if (r1.g == (r6 == null && r6.translated && r6.translatedText != null && android.text.TextUtils.equals(r6.translatedLng, r3c.H0()))) goto L413;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0c58  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0cf4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d6e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0d8d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0da2  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0dbc A[EDGE_INSN: B:315:0x0dbc->B:316:0x0dbc BREAK  A[LOOP:0: B:304:0x0d96->B:313:0x0db9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0dcc  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0ddb  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0e45  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0e8a  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0e99  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0ebe  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0f5c  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0f93  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0fa8  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0fce  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0fef  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x1024  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x1042  */
    /* JADX WARN: Removed duplicated region for block: B:414:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x1004  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0f06  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0e93  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0e58  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0e3c  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0c5f  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0c71  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x090e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(boolean z) {
        TL_stories.StoryItem storyItem;
        b6b b6bVar;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        icb icbVar;
        ImageReceiver imageReceiver;
        boolean z6;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem2;
        TL_stories.StoryItem storyItem3;
        b6b b6bVar2;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem4;
        c8b c8bVar;
        c8b c8bVar2;
        lcb lcbVar;
        boolean z7;
        h58 h58Var;
        b6b b6bVar3;
        v21 v21Var;
        TL_stories.StoryItem storyItem5;
        b6b b6bVar4;
        long j;
        byte b;
        byte b2;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem6;
        int i2;
        w96 w96Var;
        TLRPC.MessageMedia messageMedia2;
        kg5 kg5Var;
        kg5 kg5Var2;
        v5b v5bVar;
        TL_stories.StoryItem storyItem7;
        CharSequence charSequence2;
        TL_stories.StoryItem storyItem8;
        n68 n68Var;
        k68 k68Var;
        boolean z8;
        LinearLayout linearLayout;
        h58 h58Var2;
        byte b3;
        h58 h58Var3;
        vz1 vz1Var;
        dn2 dn2Var;
        uj7 uj7Var;
        n68 n68Var2;
        TL_stories.StoryItem storyItem9;
        boolean z9;
        boolean z10;
        b6b b6bVar5;
        b6b b6bVar6;
        kg5 kg5Var3;
        int i3;
        ImageView imageView;
        ImageView imageView2;
        n68 n68Var3;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem10;
        int i4;
        boolean z11;
        TL_stories.StoryItem storyItem11;
        int i5;
        w96 w96Var2;
        lcb lcbVar2;
        w96 w96Var3;
        String str;
        w96 w96Var4;
        int i6;
        TLRPC.GroupCall groupCall;
        BitmapDrawable bitmapDrawable;
        b6b b6bVar7;
        TLRPC.MessageMedia messageMedia3;
        v5b v5bVar2;
        if (this.f1.isEmpty() && this.g1.isEmpty()) {
            return;
        }
        this.F2 = true;
        n68 n68Var4 = this.y1;
        TL_stories.StoryItem storyItem12 = n68Var4.a;
        b6b b6bVar8 = n68Var4.b;
        String s = t6b.s();
        this.J0 = false;
        this.M2 = false;
        int i7 = this.t1;
        boolean z12 = this.D1;
        boolean z13 = this.E1;
        boolean z14 = this.F1;
        lcb lcbVar3 = this.t0;
        if (lcbVar3 == null || (v5bVar2 = lcbVar3.O0) == null || v5bVar2.e != 4) {
            storyItem = (i7 < 0 || i7 >= this.f1.size()) ? null : (TL_stories.StoryItem) this.f1.get(i7);
            int size = i7 - this.f1.size();
            b6bVar = (size < 0 || size >= this.g1.size()) ? null : (b6b) this.g1.get(size);
        } else {
            b6bVar = (i7 < 0 || i7 >= this.g1.size()) ? null : (b6b) this.g1.get(i7);
            int size2 = i7 - this.g1.size();
            storyItem = (size2 < 0 || size2 >= this.f1.size()) ? null : (TL_stories.StoryItem) this.f1.get(size2);
        }
        TL_stories.StoryItem storyItem13 = storyItem;
        this.y1.c = null;
        if (b6bVar != null) {
            this.E1 = false;
            boolean z15 = b6bVar.J;
            this.F1 = z15;
            this.D1 = !z15;
            nl nlVar = this.O0;
            nlVar.B0 = false;
            nlVar.t1 = (short) 150;
            Bitmap bitmap = b6bVar.c.b1;
            if (bitmap != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(createBitmap, 3);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (b6bVar.s || b6bVar.I) {
                i = i7;
                z2 = z12;
                z3 = z13;
                z4 = z14;
                b6bVar7 = b6bVar;
                this.O0.Y(null, null, jn5.g(b6bVar7.f), s, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                z3 = z13;
                i = i7;
                z2 = z12;
                z4 = z14;
                b6bVar7 = b6bVar;
                this.O0.Y(null, null, jn5.g(b6bVar.e), s, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            n68 n68Var5 = this.y1;
            n68Var5.b = b6bVar7;
            n68Var5.j = null;
            n68Var5.i = null;
            n68Var5.a = null;
            n68Var5.d = false;
            n68Var5.e = n68Var5.j();
            TL_stories.StoryItem storyItem14 = n68Var5.a;
            n68Var5.f = (storyItem14 == null || (messageMedia3 = storyItem14.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            this.T0.d(null, v8b.a(b6bVar7.c), this.U0);
            this.E2 = false;
            this.D2 = false;
            this.C2 = false;
        } else {
            i = i7;
            z2 = z12;
            z3 = z13;
            z4 = z14;
            this.D1 = false;
            this.E1 = false;
            this.F1 = false;
            if (storyItem13 == null) {
                lcb lcbVar4 = this.t0;
                if (lcbVar4 != null) {
                    lcbVar4.o(true);
                    return;
                }
                return;
            }
            b6b s2 = this.C1.s(this.l1, storyItem13);
            if (s2 != null) {
                this.E1 = true;
                nl nlVar2 = this.O0;
                nlVar2.B0 = false;
                nlVar2.t1 = this.S0 != null ? (short) 0 : (short) 150;
                boolean z16 = s2.s;
                String str2 = s2.f;
                if (z16) {
                    b6bVar2 = s2;
                    nlVar2.Z(null, null, jn5.g(str2), s, null, 0L, null, null, 0);
                } else {
                    b6bVar2 = s2;
                    nlVar2.Z(null, null, jn5.g(str2), s, null, 0L, null, null, 0);
                }
                n68 n68Var6 = this.y1;
                n68Var6.b = b6bVar2;
                n68Var6.j = null;
                n68Var6.i = null;
                n68Var6.a = null;
                n68Var6.d = false;
                n68Var6.e = n68Var6.j();
                TL_stories.StoryItem storyItem15 = n68Var6.a;
                n68Var6.f = (storyItem15 == null || (messageMedia = storyItem15.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                this.T0.d(null, v8b.a(b6bVar2.c), this.U0);
                this.y1.c = storyItem13;
                this.E2 = false;
                this.D2 = false;
                this.C2 = false;
            } else {
                TLRPC.MessageMedia messageMedia4 = storyItem13.media;
                boolean z17 = messageMedia4 != null && r47.J4(messageMedia4.getDocument());
                storyItem13.dialogId = this.l1;
                nl nlVar3 = this.O0;
                nlVar3.B0 = z3;
                nlVar3.t1 = (short) 150;
                TLRPC.MessageMedia messageMedia5 = storyItem13.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.M2 = true;
                    uc7.s1(this.m2).O1().o(storyItem13.id, this.l1);
                    z6 = z3;
                } else {
                    String str3 = storyItem13.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            z17 = str3.toLowerCase().endsWith(".mp4");
                        }
                        TLRPC.MessageMedia messageMedia6 = storyItem13.media;
                        if (z17) {
                            BitmapDrawable i8 = messageMedia6 != null ? in5.i(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem13.firstFramePath != null) {
                                if (in5.z().F(jn5.g(storyItem13.firstFramePath).q(null, null, false) + "@" + s, false)) {
                                    z5 = z3;
                                    storyItem2 = storyItem13;
                                    this.O0.Y(null, null, jn5.g(storyItem13.firstFramePath), s, null, null, i8, 0L, null, null, 0);
                                    storyItem13 = storyItem2;
                                }
                            }
                            z5 = z3;
                            storyItem2 = storyItem13;
                            this.O0.Y(null, null, jn5.g(storyItem2.attachPath), s.concat("_pframe"), null, null, i8, 0L, null, null, 0);
                            storyItem13 = storyItem2;
                        } else {
                            z5 = z3;
                            TLRPC.Photo photo = messageMedia6 != null ? messageMedia6.photo : null;
                            BitmapDrawable i9 = photo != null ? in5.i(photo.sizes) : null;
                            nl nlVar4 = this.O0;
                            String str4 = storyItem13.attachPath;
                            if (z5) {
                                nlVar4.Z(jn5.g(str4), s, jn5.g(storyItem13.firstFramePath), s, i9, 0L, null, null, 0);
                            } else {
                                nlVar4.Z(jn5.g(str4), s, null, null, i9, 0L, null, null, 0);
                            }
                        }
                    } else {
                        z5 = z3;
                        lcb lcbVar5 = this.t0;
                        Drawable t = ((lcbVar5.O0 != null || lcbVar5.N0) && (icbVar = lcbVar5.t0) != null && (imageReceiver = icbVar.c) != null && icbVar.o == storyItem13.id) ? imageReceiver.t() : null;
                        storyItem13.dialogId = this.l1;
                        TLRPC.MessageMedia messageMedia7 = storyItem13.media;
                        if (z17) {
                            TLRPC.PhotoSize u = xb4.u(1000, messageMedia7.getDocument().thumbs);
                            if (t == null) {
                                t = in5.i(storyItem13.media.getDocument().thumbs);
                            }
                            this.O0.Y(null, null, jn5.b(c6b.B(this.m2, storyItem13)), s.concat("_pframe"), jn5.c(u, storyItem13.media.getDocument()), s, t, 0L, null, storyItem13, 0);
                        } else {
                            TLRPC.Photo photo2 = messageMedia7 != null ? messageMedia7.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                z6 = z5;
                                this.O0.f();
                            } else {
                                if (t == null) {
                                    t = in5.i(arrayList);
                                }
                                TLRPC.PhotoSize u2 = xb4.u(ConnectionsManager.DEFAULT_DATACENTER_ID, photo2.sizes);
                                xb4.u(800, photo2.sizes);
                                nl nlVar5 = this.O0;
                                jn5 i10 = jn5.i(u2, photo2);
                                z6 = z5;
                                nlVar5.Y(null, null, i10, s, null, null, t, 0L, null, storyItem13, 0);
                            }
                        }
                    }
                    z6 = z5;
                }
                storyItem13.dialogId = this.l1;
                this.T0.c(z ? null : storyItem13, this.U0);
                this.y1.k(storyItem13);
                boolean z18 = (this.M2 || (storyItem3 = this.y1.a) == null || (storyItem3 instanceof TL_stories.TL_storyItemDeleted) || (storyItem3 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.E2 = z18;
                this.C2 = z18;
                if (z18) {
                    z18 = this.y1.a() && this.y1.a.isPublic;
                    this.C2 = z18;
                }
                if (z18) {
                    TL_stories.StoryItem storyItem16 = this.y1.a;
                    z18 = storyItem16.pinned || !t6b.w(this.m2, storyItem16);
                    this.C2 = z18;
                }
                this.D2 = z18;
                if (z18 && this.n1) {
                    TLRPC.Chat M0 = uc7.s1(this.m2).M0(Long.valueOf(-this.l1));
                    this.D2 = M0 != null && xc2.t0(M0);
                }
                if (this.E2) {
                    boolean z19 = this.n1;
                    int i11 = this.m2;
                    if (z19) {
                        TLRPC.Chat M02 = uc7.s1(i11).M0(Long.valueOf(-this.l1));
                        this.E2 = (M02 == null || xc2.K(M02, false) == null) ? false : true;
                    } else {
                        TLRPC.User X1 = uc7.s1(i11).X1(Long.valueOf(this.l1));
                        this.E2 = (X1 == null || lbc.p(X1) == null || !this.y1.a.isPublic) ? false : true;
                    }
                }
                ip7.l0.c(new yo7(ip7.n(this.m2), this.l1, storyItem13.id, (byte) 1));
                storyItem4 = this.y1.a;
                if (storyItem4 != null && !z) {
                    this.t0.P0 = storyItem4.id;
                }
                this.t0.o0.A();
                this.I2 = true;
                if (!this.m1 || this.n1) {
                    i1(false);
                }
                n68 n68Var7 = this.y1;
                TL_stories.StoryItem storyItem17 = n68Var7.a;
                b6b b6bVar9 = n68Var7.b;
                boolean z20 = ((storyItem17 == null ? storyItem17.id : (b6bVar9 == null || (c8bVar = b6bVar9.c) == null) ? 0 : c8bVar.f) == (storyItem12 == null ? storyItem12.id : (b6bVar8 == null || (c8bVar2 = b6bVar8.c) == null) ? 0 : c8bVar2.f) && (b6bVar8 == null || storyItem17 == null || !TextUtils.equals(b6bVar8.e, storyItem17.attachPath))) ? false : true;
                boolean z21 = (z20 || (this.E1 == z6 && this.D1 == z2 && this.F1 == z4)) ? false : true;
                lcbVar = this.t0;
                if (lcbVar != null && (w96Var4 = lcbVar.B0) != null) {
                    i6 = this.z3;
                    groupCall = w96Var4.s;
                    if (i6 != Math.max(1, groupCall != null ? 0 : groupCall.participants_count)) {
                        z7 = true;
                        if ((b6bVar8 != null || (str = b6bVar8.e) == null || !str.equals(this.y1.c())) && (storyItem12 == null || (storyItem5 = this.y1.a) == null || storyItem12.id != storyItem5.id)) {
                            h58Var = this.L1;
                            if (h58Var != null) {
                                if (storyItem12 != null && !TextUtils.isEmpty(h58Var.getEditField().getText())) {
                                    lcb lcbVar6 = this.t0;
                                    long j2 = storyItem12.dialogId;
                                    Editable text = this.L1.getEditField().getText();
                                    lcbVar6.getClass();
                                    lcb.N(j2, storyItem12, text);
                                }
                                xt3 editField = this.L1.getEditField();
                                lcb lcbVar7 = this.t0;
                                long j3 = this.l1;
                                TL_stories.StoryItem storyItem18 = this.y1.a;
                                lcbVar7.getClass();
                                editField.setText(lcb.x(j3, storyItem18));
                                boolean z22 = this.y1.f;
                                h58 h58Var4 = this.L1;
                                if (z22) {
                                    h58Var4.G1(false, false, false);
                                } else {
                                    h58Var4.G1(true, true, false);
                                }
                            }
                            if (this.y1.f) {
                                F0();
                            }
                            this.U0.c();
                            this.G0 = 0L;
                            this.I0 = false;
                            b6bVar3 = this.y1.b;
                            if (b6bVar3 != null) {
                                g29 g29Var = this.Y0.d;
                                if (g29Var != null) {
                                    g29Var.e(false, b6bVar3.h);
                                }
                                this.Y0.a.invalidate();
                            } else if (!z21) {
                                this.Y0.h = 0.0f;
                            }
                            u58 u58Var = this.M0;
                            v21Var = v21.x;
                            if (v21Var != null && v21Var.h == u58Var) {
                                v21Var.b();
                            }
                            this.u0.J();
                            g0();
                            z7 = true;
                        }
                        if (!z7 || (b6bVar8 != null && this.y1.b == null)) {
                            this.Y0.setOnSubtitleClick(null);
                            this.z3 = 0;
                            R0(this.l1, false, this.y1.f);
                            b6bVar4 = this.y1.b;
                            if (b6bVar4 != null) {
                                charSequence2 = b6bVar4.J ? ob6.L0(2131750809) : t6b.u(this.Y0.c[0], this.E1);
                            } else {
                                boolean A0 = A0();
                                n68 n68Var8 = this.y1;
                                if (A0) {
                                    TL_stories.StoryItem storyItem19 = n68Var8.a;
                                    charSequence = "";
                                    if (storyItem19 != null && (messageMedia2 = storyItem19.media) != null) {
                                        if (messageMedia2.document != null) {
                                            charSequence2 = ob6.X(r14.date);
                                        } else {
                                            if (messageMedia2.photo != null) {
                                                charSequence2 = ob6.X(r11.date);
                                            }
                                        }
                                    }
                                    j = 0;
                                    b = 4;
                                    b2 = 2;
                                    if (charSequence != null) {
                                        lcb lcbVar8 = this.t0;
                                        if (lcbVar8 != null && (v5bVar = lcbVar8.O0) != null && (storyItem7 = this.y1.a) != null && v5bVar.m(storyItem7.id)) {
                                            if (!(charSequence instanceof SpannableStringBuilder)) {
                                                charSequence = new SpannableStringBuilder(charSequence);
                                            }
                                            SpannableString spannableString = new SpannableString("p ");
                                            spannableString.setSpan(new wm2(R.drawable.msg_pin_mini), 0, 1, 33);
                                            ((SpannableStringBuilder) charSequence).insert(0, (CharSequence) spannableString);
                                        }
                                        this.Y0.b(charSequence, z21);
                                    }
                                    kg5Var = this.p0;
                                    if (kg5Var != null) {
                                        kg5Var.f(false);
                                    }
                                    kg5Var2 = this.q0;
                                    if (kg5Var2 != null) {
                                        kg5Var2.f(false);
                                    }
                                } else {
                                    TL_stories.StoryItem storyItem20 = n68Var8.a;
                                    if (storyItem20 == null) {
                                        j = 0;
                                        b = 4;
                                        b2 = 2;
                                        charSequence = null;
                                    } else if (storyItem20.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.L0(2131748579));
                                        spannableStringBuilder.setSpan(new e96((byte) 1), 0, spannableStringBuilder.length(), 33);
                                        spannableStringBuilder.append((CharSequence) "  ");
                                        lcb lcbVar9 = this.t0;
                                        if (lcbVar9 == null || (w96Var = lcbVar9.B0) == null) {
                                            i2 = 1;
                                        } else {
                                            TLRPC.GroupCall groupCall2 = w96Var.s;
                                            i2 = 1;
                                            this.z3 = Math.max(1, groupCall2 == null ? 0 : groupCall2.participants_count);
                                        }
                                        spannableStringBuilder.append((CharSequence) ob6.I(Math.max(i2, this.z3), "LiveStoryWatching"));
                                        charSequence2 = spannableStringBuilder;
                                    } else if (storyItem20.date == -1) {
                                        charSequence2 = ob6.L0(2131752625);
                                    } else {
                                        b2 = 2;
                                        if (n68Var8.g() != null) {
                                            b7b g = this.y1.g();
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            j = 0;
                                            SpannableString spannableString2 = new SpannableString("r");
                                            spannableString2.setSpan(new wm2(R.drawable.mini_repost_story), 0, spannableString2.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                            if (g.b != null) {
                                                gc0 gc0Var = new gc0(15.0f, this.m2, this.Y0.c[0]);
                                                SpannableString spannableString3 = new SpannableString("a");
                                                spannableString3.setSpan(gc0Var, 0, 1, 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString3).append((CharSequence) " ");
                                                long longValue = g.b.longValue();
                                                int i12 = this.m2;
                                                if (longValue > 0) {
                                                    TLRPC.User X12 = uc7.s1(i12).X1(g.b);
                                                    gc0Var.e(X12);
                                                    spannableStringBuilder2.append((CharSequence) lbc.r(X12));
                                                } else {
                                                    TLRPC.Chat M03 = uc7.s1(i12).M0(Long.valueOf(-g.b.longValue()));
                                                    gc0Var.b(M03);
                                                    if (M03 != null) {
                                                        spannableStringBuilder2.append((CharSequence) M03.title);
                                                    }
                                                }
                                            } else {
                                                String str5 = this.y1.a.fwd_from.from_name;
                                                if (str5 != null) {
                                                    spannableStringBuilder2.append((CharSequence) str5);
                                                }
                                            }
                                            this.Y0.setOnSubtitleClick(new uv5(this, g, (byte) 17));
                                            SpannableString spannableString4 = new SpannableString(".");
                                            np3 np3Var = new np3();
                                            np3Var.b = hl.L(1.5f);
                                            np3Var.c = 5.0f;
                                            spannableString4.setSpan(np3Var, 0, spannableString4.length(), 33);
                                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString4).append((CharSequence) " ").append((CharSequence) ob6.P(this.y1.a.date));
                                            charSequence = spannableStringBuilder2;
                                            z21 = false;
                                            b = 4;
                                        } else {
                                            j = 0;
                                            if (!this.o1 || (storyItem6 = this.y1.a) == null || storyItem6.from_id == null) {
                                                b = 4;
                                                String X = ob6.X(this.y1.a.date);
                                                String str6 = X;
                                                if (this.y1.a.edited) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X);
                                                    np3 np3Var2 = new np3();
                                                    np3Var2.b = hl.L(1.5f);
                                                    np3Var2.c = 5.0f;
                                                    valueOf.append((CharSequence) " . ").setSpan(np3Var2, valueOf.length() - 2, valueOf.length() - 1, 0);
                                                    valueOf.append((CharSequence) ob6.L0(2131751175));
                                                    str6 = valueOf;
                                                }
                                                charSequence = str6;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                gc0 gc0Var2 = new gc0(15.0f, this.m2, this.Y0.c[0]);
                                                SpannableString spannableString5 = new SpannableString("a");
                                                spannableString5.setSpan(gc0Var2, 0, 1, 33);
                                                spannableStringBuilder3.append((CharSequence) spannableString5).append((CharSequence) " ");
                                                long n = wf3.n(this.y1.a.from_id);
                                                int i13 = this.m2;
                                                if (n > 0) {
                                                    TLRPC.User X13 = uc7.s1(i13).X1(Long.valueOf(n));
                                                    gc0Var2.e(X13);
                                                    spannableStringBuilder3.append((CharSequence) lbc.r(X13));
                                                } else {
                                                    TLRPC.Chat M04 = uc7.s1(i13).M0(Long.valueOf(-n));
                                                    gc0Var2.b(M04);
                                                    if (M04 != null) {
                                                        spannableStringBuilder3.append((CharSequence) M04.title);
                                                    }
                                                }
                                                b = 4;
                                                this.Y0.setOnSubtitleClick(new my(this, n, b));
                                                SpannableString spannableString6 = new SpannableString(".");
                                                np3 np3Var3 = new np3();
                                                np3Var3.b = hl.L(1.5f);
                                                np3Var3.c = 5.0f;
                                                spannableString6.setSpan(np3Var3, 0, spannableString6.length(), 33);
                                                spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString6).append((CharSequence) " ").append((CharSequence) ob6.P(this.y1.a.date));
                                                charSequence = spannableStringBuilder3;
                                                z21 = false;
                                            }
                                        }
                                    }
                                    if (charSequence != null) {
                                    }
                                    kg5Var = this.p0;
                                    if (kg5Var != null) {
                                    }
                                    kg5Var2 = this.q0;
                                    if (kg5Var2 != null) {
                                    }
                                }
                            }
                            j = 0;
                            charSequence = charSequence2;
                            b = 4;
                            b2 = 2;
                            if (charSequence != null) {
                            }
                            kg5Var = this.p0;
                            if (kg5Var != null) {
                            }
                            kg5Var2 = this.q0;
                            if (kg5Var2 != null) {
                            }
                        } else {
                            j = 0;
                            b = 4;
                            b2 = 2;
                        }
                        n68 n68Var9 = this.y1;
                        storyItem8 = n68Var9.a;
                        if (storyItem12 == storyItem8 && b6bVar8 == n68Var9.b) {
                        }
                        this.y1.l();
                        n68Var = this.y1;
                        if ((!n68Var.g || storyItem12 != n68Var.a) && (k68Var = this.A1) != null) {
                            lcb lcbVar10 = ((ccb) k68Var).d;
                            lcbVar10.Z0 = false;
                            lcbVar10.U();
                        }
                        n68 n68Var10 = this.y1;
                        z8 = (n68Var10.f || (lcbVar2 = this.t0) == null || (w96Var3 = lcbVar2.B0) == null || !n68Var10.i(w96Var3.j()) || !this.t0.B0.e()) ? false : true;
                        if (z8 != this.q1) {
                            this.q1 = z8;
                            if (z8) {
                                p0();
                            }
                            if (this.Q1 != null && (this.p1 || this.q1)) {
                                e1();
                            }
                            h58 h58Var5 = this.L1;
                            if (h58Var5 != null) {
                                h58Var5.setEnabled((!this.p1 || this.y1.f) && !this.q1);
                                this.L1.H2();
                            }
                            h0(true);
                        }
                        linearLayout = this.Q1;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(((!this.p1 || this.y1.f) && !this.q1) ? 8 : 0);
                        }
                        if (this.M2) {
                            t0();
                            q0();
                            this.K2.setVisibility(0);
                            this.L2.setVisibility(0);
                            this.E2 = false;
                            this.D2 = false;
                            this.C2 = false;
                            h58 h58Var6 = this.L1;
                            if (h58Var6 != null) {
                                h58Var6.setVisibility(8);
                            }
                            p58 p58Var = this.G1;
                            if (p58Var != null) {
                                p58Var.setVisibility(8);
                            }
                            LinearLayout linearLayout2 = this.y0;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat M05 = this.l1 < j ? uc7.s1(this.m2).M0(Long.valueOf(-this.l1)) : null;
                            if (this.y1.f) {
                                if (this.L1 == null) {
                                    l0();
                                }
                                k0();
                                o0();
                                n0();
                                b3 = 0;
                                this.L1.setVisibility(0);
                            } else {
                                if ((lbc.C(this.l1) || A0()) && (h58Var2 = this.L1) != null) {
                                    h58Var2.setVisibility(8);
                                } else if (!this.m1 && ((!this.n1 || (this.o1 && (xc2.q(M05) || xc2.s0(M05)))) && (h58Var3 = this.L1) != null)) {
                                    b3 = 0;
                                    h58Var3.setVisibility(0);
                                }
                                b3 = 0;
                            }
                            h58 h58Var7 = this.L1;
                            if (h58Var7 != null) {
                                h58Var7.setOnSendButtonLongClick(this.y1.f ? new x48(this, b3) : null);
                                h58 h58Var8 = this.L1;
                                boolean z23 = this.y1.f;
                                v0(true);
                                h58Var8.U1(z23);
                                this.L1.b2(this.y1.f && !v0(true) && (this.f2 || this.L1.X0), true);
                            }
                            if (this.p1 && this.Q1 == null) {
                                p0();
                            }
                            if (this.Q1 != null) {
                                if (this.p1 || this.q1) {
                                    e1();
                                }
                                this.Q1.setVisibility(((!this.p1 || this.y1.f) && !this.q1) ? 8 : 0);
                            }
                            h58 h58Var9 = this.L1;
                            if (h58Var9 != null) {
                                h58Var9.setEnabled((!this.p1 || this.y1.f) && !this.q1);
                            }
                            p58 p58Var2 = this.G1;
                            if (p58Var2 != null) {
                                p58Var2.setVisibility((!this.m1 || this.y1.f) ? 8 : 0);
                            }
                            FrameLayout frameLayout = this.K2;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            if (lbc.C(this.l1)) {
                                q0();
                                this.L2.setVisibility(0);
                            } else {
                                xb xbVar = this.L2;
                                if (xbVar != null) {
                                    xbVar.setVisibility(8);
                                }
                            }
                            LinearLayout linearLayout3 = this.y0;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(A0() ? 8 : 0);
                            }
                        }
                        vz1Var = this.M1;
                        if (vz1Var != null) {
                            h58 h58Var10 = this.L1;
                            vz1Var.setVisibility((h58Var10 == null || h58Var10.getVisibility() != 0 || this.y1.f) ? 8 : 0);
                        }
                        dn2Var = this.H1;
                        if (dn2Var != null) {
                            dn2Var.setVisibility((this.M2 || !this.y1.f) ? 8 : 0);
                            this.H1.a(this.v0.g0, false);
                            this.H1.setCount(this.v0.getUnreadMessagesCount());
                        }
                        uj7Var = this.K1;
                        if (uj7Var != null) {
                            if (!this.M2) {
                                n68 n68Var11 = this.y1;
                                if (n68Var11.f && (w96Var2 = w96.N) != null && n68Var11.i(w96Var2.j())) {
                                    i5 = 0;
                                    uj7Var.setVisibility(i5);
                                    uj7 uj7Var2 = this.K1;
                                    w96 w96Var5 = w96.N;
                                    uj7Var2.b(w96Var5 == null && w96Var5.r(), true);
                                    uj7 uj7Var3 = this.K1;
                                    w96 w96Var6 = w96.N;
                                    uj7Var3.a(w96Var6 != null || w96Var6.G, true);
                                }
                            }
                            i5 = 8;
                            uj7Var.setVisibility(i5);
                            uj7 uj7Var22 = this.K1;
                            w96 w96Var52 = w96.N;
                            uj7Var22.b(w96Var52 == null && w96Var52.r(), true);
                            uj7 uj7Var32 = this.K1;
                            w96 w96Var62 = w96.N;
                            uj7Var32.a(w96Var62 != null || w96Var62.G, true);
                        }
                        if (this.J1 != null) {
                            this.I1.setVisibility((this.M2 || !this.y1.f) ? 8 : 0);
                            this.J1.setVisibility((this.M2 || !this.y1.f) ? 8 : 0);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.J1.getLayoutParams();
                            uj7 uj7Var4 = this.K1;
                            int L = hl.L((uj7Var4 == null || uj7Var4.getVisibility() != 0) ? 7.0f : 54.0f);
                            if (layoutParams.rightMargin != L) {
                                layoutParams.rightMargin = L;
                                this.J1.setLayoutParams(layoutParams);
                            }
                        }
                        n68Var2 = this.y1;
                        if (!n68Var2.f || ((n68Var2.h == null && n68Var2.g() == null && this.y1.e() == null) || this.M2)) {
                            if (this.u1) {
                                lcb lcbVar11 = ((ccb) this.A1).d;
                                lcbVar11.L0 = false;
                                lcbVar11.U();
                                k68 k68Var2 = this.A1;
                                this.T2 = false;
                                ((ccb) k68Var2).e();
                            }
                            this.u0.setVisibility(8);
                        } else {
                            f7b f7bVar = this.u0.b0;
                            n68 n68Var12 = this.y1;
                            CharSequence charSequence3 = n68Var12.h;
                            b7b g2 = n68Var12.g();
                            b7b e = this.y1.e();
                            if (this.t0.Z0) {
                                n68 n68Var13 = this.y1;
                                if (!n68Var13.g && (storyItem11 = n68Var13.a) != null && storyItem11.translated) {
                                    z11 = true;
                                    f7bVar.b(charSequence3, g2, e, z11, storyItem12 != this.y1.a);
                                    this.u0.setVisibility(0);
                                }
                            }
                            z11 = false;
                            f7bVar.b(charSequence3, g2, e, z11, storyItem12 != this.y1.a);
                            this.u0.setVisibility(0);
                        }
                        storyItem9 = this.y1.a;
                        if (storyItem9 != null) {
                            TLRPC.MessageMedia messageMedia8 = storyItem9.media;
                            if (messageMedia8 instanceof TLRPC.TL_messageMediaVideoStream) {
                                if (this.v0.q(this.l1, ((TLRPC.TL_messageMediaVideoStream) messageMedia8).call)) {
                                    this.v0.p(false, false);
                                    this.u3 = j;
                                    h58 h58Var11 = this.L1;
                                    if (h58Var11 != null) {
                                        h58Var11.P(true);
                                        this.L1.K2();
                                        h0(true);
                                    }
                                }
                                this.v0.setVisibility(0);
                                this.M0.invalidate();
                                if (this.A1 != null && C0()) {
                                    ((ccb) this.A1).a(this.t1, this.l1);
                                }
                                z9 = this.n1;
                                ImageView imageView3 = this.x0;
                                boolean z24 = this.C2;
                                if (z9) {
                                    if (z24 && !this.y1.f) {
                                        b = 0;
                                    }
                                    imageView3.setVisibility(b);
                                    p58 p58Var3 = this.z0;
                                    if (p58Var3 != null) {
                                        p58Var3.setVisibility(8);
                                    }
                                    this.n0.setVisibility((this.m1 || this.y1.f) ? 8 : 0);
                                    this.n0.getLayoutParams().width = hl.L(40.0f);
                                } else {
                                    if (z24 && !this.y1.f) {
                                        b = 0;
                                    }
                                    imageView3.setVisibility(b);
                                    p58 p58Var4 = this.z0;
                                    if (p58Var4 != null) {
                                        p58Var4.setVisibility((!this.D2 || this.y1.f) ? 8 : 0);
                                    }
                                    this.n0.setVisibility((this.F1 || this.y1.f) ? 8 : 0);
                                }
                                this.n0.requestLayout();
                                this.t0.e1.append(this.l1, i);
                                if (this.u1) {
                                    L0(0L);
                                    d1();
                                    this.O0.b();
                                }
                                this.v0.setLivePlayer(this.t0.B0);
                                this.v1 = 0;
                                if (this.t0.O0 != null && (storyItem10 = this.y1.a) != null) {
                                    int i14 = storyItem10.id;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < this.t0.O0.i.size()) {
                                            r47 r47Var = (r47) this.t0.O0.i.get(i4);
                                            if (r47Var != null && r47Var.e1() == i14) {
                                                this.v1 = i4;
                                                break;
                                            }
                                            i4++;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                int i15 = this.t1;
                                this.w1 = i15;
                                int i16 = this.k1;
                                this.x1 = i16;
                                if (this.t0.R0) {
                                    this.w1 = (i16 - 1) - i15;
                                }
                                z10 = this.y1.e;
                                b6 b6Var = this.i0;
                                if (z10) {
                                    b6Var.setVisibility(8);
                                } else {
                                    b6Var.setVisibility(0);
                                    this.O2 = this.y1.h() ? 1.0f : 0.5f;
                                    boolean h = this.y1.h();
                                    e29 e29Var = this.j0;
                                    if (h) {
                                        e29Var.setVisibility(0);
                                        this.k0.setVisibility(8);
                                        b6 b6Var2 = this.i0;
                                        this.t0.getClass();
                                        b6Var2.setContentDescription(ob6.L0(!lcb.D1 ? 2131748068 : 2131743504));
                                    } else {
                                        e29Var.setVisibility(8);
                                        this.k0.setVisibility(0);
                                        this.i0.setContentDescription(ob6.L0(2131747882));
                                    }
                                    this.i0.setAlpha((1.0f - this.N3) * this.O2);
                                }
                                n68 n68Var14 = this.y1;
                                b6bVar5 = n68Var14.b;
                                if (b6bVar5 == null) {
                                    this.m0.a(this.m1, b6bVar5, z20 && this.L3);
                                } else {
                                    TL_stories.StoryItem storyItem21 = n68Var14.a;
                                    x9b x9bVar = this.m0;
                                    boolean z25 = this.m1;
                                    if (storyItem21 != null) {
                                        x9bVar.b(z25, storyItem21, z20 && this.L3);
                                    } else {
                                        x9bVar.b(z25, null, z20 && this.L3);
                                    }
                                }
                                this.L3 = false;
                                this.m0.setTranslationX(this.i0.getVisibility() != 0 ? -hl.L(44.0f) : 0.0f);
                                if (z7) {
                                    this.a3 = false;
                                    TL_stories.StoryItem storyItem22 = this.y1.a;
                                    if (storyItem22 == null || (reaction = storyItem22.sent_reaction) == null) {
                                        this.o0.setReaction(null);
                                    } else {
                                        this.o0.setReaction(w49.d(reaction));
                                    }
                                }
                                b6bVar6 = this.y1.b;
                                if (b6bVar6 == null && b6bVar6.J) {
                                    m0();
                                    this.T1.set(this.y1.b.c.x);
                                    this.T1.setVisibility(0);
                                    ViewPropertyAnimator viewPropertyAnimator = this.U1;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.U1 = null;
                                    }
                                    d8b d8bVar = this.T1;
                                    if (z20) {
                                        ViewPropertyAnimator interpolator = d8bVar.animate().alpha(1.0f).setDuration(180L).setInterpolator(k43.h);
                                        this.U1 = interpolator;
                                        interpolator.start();
                                    } else {
                                        d8bVar.setAlpha(1.0f);
                                    }
                                } else if (this.T1 != null) {
                                    ViewPropertyAnimator viewPropertyAnimator2 = this.U1;
                                    if (viewPropertyAnimator2 != null) {
                                        viewPropertyAnimator2.cancel();
                                        this.U1 = null;
                                    }
                                    if (z20 && this.T1.getVisibility() == 0) {
                                        ViewPropertyAnimator withEndAction = this.T1.animate().alpha(0.0f).setDuration(180L).setInterpolator(k43.h).withEndAction(new u48(this, b2));
                                        this.U1 = withEndAction;
                                        withEndAction.start();
                                    } else {
                                        this.T1.setAlpha(0.0f);
                                        this.T1.setVisibility(8);
                                    }
                                }
                                m68 m68Var = this.h1;
                                this.t0.getClass();
                                m68Var.a(lcb.D1, false);
                                if (this.u1 && this.y1.a != null) {
                                    cc4.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + this.y1.a.id + " " + this.y1.d());
                                }
                                if (this.m1) {
                                    z3a.d(this.m2, this.l1, this.y1.a);
                                }
                                ff0 ff0Var = this.Y0.b;
                                v5b v5bVar3 = this.t0.O0;
                                ff0Var.setPadding(0, 0, (v5bVar3 != null || v5bVar3.g() == this.x1) ? 0 : hl.L(56.0f), 0);
                                uc7.s1(this.m2).j4.k(this.y1.a);
                                if (!z && !this.m1 && this.j3 == null && !xea.S && xea.T) {
                                    u48 u48Var = new u48(this, (byte) 3);
                                    this.j3 = u48Var;
                                    hl.d3(u48Var, 500L);
                                }
                                kg5Var3 = this.q0;
                                if ((kg5Var3 != null || !kg5Var3.W) && this.y1.h()) {
                                    this.t0.getClass();
                                    if (lcb.D1) {
                                        i3 = 0;
                                        if (uc7.e1().getInt("taptostorysoundhint", 0) < 2) {
                                            hl.r(this.A3);
                                            hl.d3(this.A3, 250L);
                                        }
                                        imageView = this.g0;
                                        if (imageView != null) {
                                            imageView.setVisibility((!A0() || B0() || ((n68Var3 = this.y1) != null && n68Var3.e)) ? i3 : 8);
                                        }
                                        imageView2 = this.h0;
                                        if (imageView2 != null) {
                                            imageView2.setVisibility((!this.y1.f || this.m0.f) ? 8 : i3);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i3 = 0;
                                imageView = this.g0;
                                if (imageView != null) {
                                }
                                imageView2 = this.h0;
                                if (imageView2 != null) {
                                }
                            }
                        }
                        this.v0.q(this.l1, null);
                        this.v0.setVisibility(8);
                        this.M0.invalidate();
                        if (this.A1 != null) {
                            ((ccb) this.A1).a(this.t1, this.l1);
                        }
                        z9 = this.n1;
                        ImageView imageView32 = this.x0;
                        boolean z242 = this.C2;
                        if (z9) {
                        }
                        this.n0.requestLayout();
                        this.t0.e1.append(this.l1, i);
                        if (this.u1) {
                        }
                        this.v0.setLivePlayer(this.t0.B0);
                        this.v1 = 0;
                        if (this.t0.O0 != null) {
                            int i142 = storyItem10.id;
                            i4 = 0;
                            while (true) {
                                if (i4 < this.t0.O0.i.size()) {
                                }
                                i4++;
                            }
                        }
                        int i152 = this.t1;
                        this.w1 = i152;
                        int i162 = this.k1;
                        this.x1 = i162;
                        if (this.t0.R0) {
                        }
                        z10 = this.y1.e;
                        b6 b6Var3 = this.i0;
                        if (z10) {
                        }
                        n68 n68Var142 = this.y1;
                        b6bVar5 = n68Var142.b;
                        if (b6bVar5 == null) {
                        }
                        this.L3 = false;
                        this.m0.setTranslationX(this.i0.getVisibility() != 0 ? -hl.L(44.0f) : 0.0f);
                        if (z7) {
                        }
                        b6bVar6 = this.y1.b;
                        if (b6bVar6 == null) {
                        }
                        if (this.T1 != null) {
                        }
                        m68 m68Var2 = this.h1;
                        this.t0.getClass();
                        m68Var2.a(lcb.D1, false);
                        if (this.u1) {
                            cc4.b("StoryViewer displayed story dialogId=" + this.l1 + " storyId=" + this.y1.a.id + " " + this.y1.d());
                        }
                        if (this.m1) {
                        }
                        ff0 ff0Var2 = this.Y0.b;
                        v5b v5bVar32 = this.t0.O0;
                        ff0Var2.setPadding(0, 0, (v5bVar32 != null || v5bVar32.g() == this.x1) ? 0 : hl.L(56.0f), 0);
                        uc7.s1(this.m2).j4.k(this.y1.a);
                        if (!z) {
                            u48 u48Var2 = new u48(this, (byte) 3);
                            this.j3 = u48Var2;
                            hl.d3(u48Var2, 500L);
                        }
                        kg5Var3 = this.q0;
                        if (kg5Var3 != null) {
                        }
                        this.t0.getClass();
                        if (lcb.D1) {
                        }
                        i3 = 0;
                        imageView = this.g0;
                        if (imageView != null) {
                        }
                        imageView2 = this.h0;
                        if (imageView2 != null) {
                        }
                    }
                }
                z7 = false;
                if (b6bVar8 != null) {
                }
                h58Var = this.L1;
                if (h58Var != null) {
                }
                if (this.y1.f) {
                }
                this.U0.c();
                this.G0 = 0L;
                this.I0 = false;
                b6bVar3 = this.y1.b;
                if (b6bVar3 != null) {
                }
                u58 u58Var2 = this.M0;
                v21Var = v21.x;
                if (v21Var != null) {
                    v21Var.b();
                }
                this.u0.J();
                g0();
                z7 = true;
                if (z7) {
                }
                this.Y0.setOnSubtitleClick(null);
                this.z3 = 0;
                R0(this.l1, false, this.y1.f);
                b6bVar4 = this.y1.b;
                if (b6bVar4 != null) {
                }
                j = 0;
                charSequence = charSequence2;
                b = 4;
                b2 = 2;
                if (charSequence != null) {
                }
                kg5Var = this.p0;
                if (kg5Var != null) {
                }
                kg5Var2 = this.q0;
                if (kg5Var2 != null) {
                }
                n68 n68Var92 = this.y1;
                storyItem8 = n68Var92.a;
                if (storyItem12 == storyItem8) {
                }
                this.y1.l();
                n68Var = this.y1;
                if (!n68Var.g) {
                }
                lcb lcbVar102 = ((ccb) k68Var).d;
                lcbVar102.Z0 = false;
                lcbVar102.U();
                n68 n68Var102 = this.y1;
                if (n68Var102.f) {
                }
                if (z8 != this.q1) {
                }
                linearLayout = this.Q1;
                if (linearLayout != null) {
                }
                if (this.M2) {
                }
                vz1Var = this.M1;
                if (vz1Var != null) {
                }
                dn2Var = this.H1;
                if (dn2Var != null) {
                }
                uj7Var = this.K1;
                if (uj7Var != null) {
                }
                if (this.J1 != null) {
                }
                n68Var2 = this.y1;
                if (n68Var2.f) {
                }
                if (this.u1) {
                }
                this.u0.setVisibility(8);
                storyItem9 = this.y1.a;
                if (storyItem9 != null) {
                }
                this.v0.q(this.l1, null);
                this.v0.setVisibility(8);
                this.M0.invalidate();
                if (this.A1 != null) {
                }
                z9 = this.n1;
                ImageView imageView322 = this.x0;
                boolean z2422 = this.C2;
                if (z9) {
                }
                this.n0.requestLayout();
                this.t0.e1.append(this.l1, i);
                if (this.u1) {
                }
                this.v0.setLivePlayer(this.t0.B0);
                this.v1 = 0;
                if (this.t0.O0 != null) {
                }
                int i1522 = this.t1;
                this.w1 = i1522;
                int i1622 = this.k1;
                this.x1 = i1622;
                if (this.t0.R0) {
                }
                z10 = this.y1.e;
                b6 b6Var32 = this.i0;
                if (z10) {
                }
                n68 n68Var1422 = this.y1;
                b6bVar5 = n68Var1422.b;
                if (b6bVar5 == null) {
                }
                this.L3 = false;
                this.m0.setTranslationX(this.i0.getVisibility() != 0 ? -hl.L(44.0f) : 0.0f);
                if (z7) {
                }
                b6bVar6 = this.y1.b;
                if (b6bVar6 == null) {
                }
                if (this.T1 != null) {
                }
                m68 m68Var22 = this.h1;
                this.t0.getClass();
                m68Var22.a(lcb.D1, false);
                if (this.u1) {
                }
                if (this.m1) {
                }
                ff0 ff0Var22 = this.Y0.b;
                v5b v5bVar322 = this.t0.O0;
                ff0Var22.setPadding(0, 0, (v5bVar322 != null || v5bVar322.g() == this.x1) ? 0 : hl.L(56.0f), 0);
                uc7.s1(this.m2).j4.k(this.y1.a);
                if (!z) {
                }
                kg5Var3 = this.q0;
                if (kg5Var3 != null) {
                }
                this.t0.getClass();
                if (lcb.D1) {
                }
                i3 = 0;
                imageView = this.g0;
                if (imageView != null) {
                }
                imageView2 = this.h0;
                if (imageView2 != null) {
                }
            }
        }
        z6 = z3;
        storyItem4 = this.y1.a;
        if (storyItem4 != null) {
            this.t0.P0 = storyItem4.id;
        }
        this.t0.o0.A();
        this.I2 = true;
        if (!this.m1) {
        }
        i1(false);
        n68 n68Var72 = this.y1;
        TL_stories.StoryItem storyItem172 = n68Var72.a;
        b6b b6bVar92 = n68Var72.b;
        if ((storyItem172 == null ? storyItem172.id : (b6bVar92 == null || (c8bVar = b6bVar92.c) == null) ? 0 : c8bVar.f) == (storyItem12 == null ? storyItem12.id : (b6bVar8 == null || (c8bVar2 = b6bVar8.c) == null) ? 0 : c8bVar2.f)) {
        }
        if (z20) {
        }
        lcbVar = this.t0;
        if (lcbVar != null) {
            i6 = this.z3;
            groupCall = w96Var4.s;
            if (i6 != Math.max(1, groupCall != null ? 0 : groupCall.participants_count)) {
            }
        }
        z7 = false;
        if (b6bVar8 != null) {
        }
        h58Var = this.L1;
        if (h58Var != null) {
        }
        if (this.y1.f) {
        }
        this.U0.c();
        this.G0 = 0L;
        this.I0 = false;
        b6bVar3 = this.y1.b;
        if (b6bVar3 != null) {
        }
        u58 u58Var22 = this.M0;
        v21Var = v21.x;
        if (v21Var != null) {
        }
        this.u0.J();
        g0();
        z7 = true;
        if (z7) {
        }
        this.Y0.setOnSubtitleClick(null);
        this.z3 = 0;
        R0(this.l1, false, this.y1.f);
        b6bVar4 = this.y1.b;
        if (b6bVar4 != null) {
        }
        j = 0;
        charSequence = charSequence2;
        b = 4;
        b2 = 2;
        if (charSequence != null) {
        }
        kg5Var = this.p0;
        if (kg5Var != null) {
        }
        kg5Var2 = this.q0;
        if (kg5Var2 != null) {
        }
        n68 n68Var922 = this.y1;
        storyItem8 = n68Var922.a;
        if (storyItem12 == storyItem8) {
        }
        this.y1.l();
        n68Var = this.y1;
        if (!n68Var.g) {
        }
        lcb lcbVar1022 = ((ccb) k68Var).d;
        lcbVar1022.Z0 = false;
        lcbVar1022.U();
        n68 n68Var1022 = this.y1;
        if (n68Var1022.f) {
        }
        if (z8 != this.q1) {
        }
        linearLayout = this.Q1;
        if (linearLayout != null) {
        }
        if (this.M2) {
        }
        vz1Var = this.M1;
        if (vz1Var != null) {
        }
        dn2Var = this.H1;
        if (dn2Var != null) {
        }
        uj7Var = this.K1;
        if (uj7Var != null) {
        }
        if (this.J1 != null) {
        }
        n68Var2 = this.y1;
        if (n68Var2.f) {
        }
        if (this.u1) {
        }
        this.u0.setVisibility(8);
        storyItem9 = this.y1.a;
        if (storyItem9 != null) {
        }
        this.v0.q(this.l1, null);
        this.v0.setVisibility(8);
        this.M0.invalidate();
        if (this.A1 != null) {
        }
        z9 = this.n1;
        ImageView imageView3222 = this.x0;
        boolean z24222 = this.C2;
        if (z9) {
        }
        this.n0.requestLayout();
        this.t0.e1.append(this.l1, i);
        if (this.u1) {
        }
        this.v0.setLivePlayer(this.t0.B0);
        this.v1 = 0;
        if (this.t0.O0 != null) {
        }
        int i15222 = this.t1;
        this.w1 = i15222;
        int i16222 = this.k1;
        this.x1 = i16222;
        if (this.t0.R0) {
        }
        z10 = this.y1.e;
        b6 b6Var322 = this.i0;
        if (z10) {
        }
        n68 n68Var14222 = this.y1;
        b6bVar5 = n68Var14222.b;
        if (b6bVar5 == null) {
        }
        this.L3 = false;
        this.m0.setTranslationX(this.i0.getVisibility() != 0 ? -hl.L(44.0f) : 0.0f);
        if (z7) {
        }
        b6bVar6 = this.y1.b;
        if (b6bVar6 == null) {
        }
        if (this.T1 != null) {
        }
        m68 m68Var222 = this.h1;
        this.t0.getClass();
        m68Var222.a(lcb.D1, false);
        if (this.u1) {
        }
        if (this.m1) {
        }
        ff0 ff0Var222 = this.Y0.b;
        v5b v5bVar3222 = this.t0.O0;
        ff0Var222.setPadding(0, 0, (v5bVar3222 != null || v5bVar3222.g() == this.x1) ? 0 : hl.L(56.0f), 0);
        uc7.s1(this.m2).j4.k(this.y1.a);
        if (!z) {
        }
        kg5Var3 = this.q0;
        if (kg5Var3 != null) {
        }
        this.t0.getClass();
        if (lcb.D1) {
        }
        i3 = 0;
        imageView = this.g0;
        if (imageView != null) {
        }
        imageView2 = this.h0;
        if (imageView2 != null) {
        }
    }

    public final void d0(Runnable runnable) {
        if (uc7.s1(this.m2).x2()) {
            i5.b(this.m2);
            return;
        }
        int i = xea.b0;
        if (i <= 0 || !this.U2) {
            runnable.run();
            return;
        }
        int i2 = i - 1;
        xea.b0 = i2;
        xea.Q(i2);
        id idVar = new id(0, this.l0, getContext());
        idVar.setTitle(ob6.M0(2131744542, null));
        idVar.m(ob6.M0(2131744543, null));
        String M0 = ob6.M0(2131746472, null);
        td tdVar = new td(runnable, (byte) 15);
        idVar.m0 = M0;
        idVar.n0 = tdVar;
        String M02 = ob6.M0(2131752570, null);
        ku7 ku7Var = new ku7((byte) 18);
        idVar.o0 = M02;
        idVar.p0 = ku7Var;
        idVar.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1() {
        ArrayList arrayList;
        byte b;
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
        int max = (int) (Math.max(hl.b1().x, hl.b1().y) / hl.p);
        String m = qd4.m(max, max, "_");
        ArrayList arrayList11 = this.B3;
        arrayList11.clear();
        ArrayList arrayList12 = this.C3;
        arrayList12.clear();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList = this.R0;
            if (i6 >= arrayList.size()) {
                break;
            }
            ((p39) arrayList.get(i6)).b(false);
            i6++;
        }
        arrayList.clear();
        int i7 = 0;
        while (true) {
            b = 1;
            if (i7 >= 2) {
                break;
            }
            int i8 = this.t1;
            if (i7 == 0) {
                i = i8 - 1;
                imageReceiver = this.P0;
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
                ArrayList arrayList14 = this.g1;
                isEmpty = arrayList14.isEmpty();
                arrayList2 = this.f1;
                if (isEmpty && i >= arrayList2.size()) {
                    Q0((b6b) arrayList14.get(i - arrayList2.size()), imageReceiver, m);
                } else if (!arrayList2.isEmpty()) {
                    if (i < 0) {
                        i = i5;
                    }
                    if (i >= arrayList2.size()) {
                        i = arrayList2.size() - 1;
                    }
                    TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList2.get(i);
                    long j = this.l1;
                    storyItem3.dialogId = j;
                    b6b s = this.C1.s(j, storyItem3);
                    if (s != null) {
                        Q0(s, imageReceiver, m);
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        i4 = i5;
                        arrayList5 = arrayList;
                        i2 = i7;
                        str = null;
                        storyItem = storyItem3;
                    } else {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        int i10 = (messageMedia == null || !r47.J4(messageMedia.getDocument())) ? i5 : 1;
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
                                imageReceiver.Y(jn5.g(str4), m.concat("_pframe"), jn5.g(storyItem3.firstFramePath), m, null, null, null, 0L, null, null, 0);
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                i3 = i5;
                                arrayList5 = arrayList;
                                i2 = i7;
                                str2 = null;
                                storyItem2 = storyItem3;
                                String str5 = m;
                                imageReceiver.Z(jn5.g(str4), str5, null, null, null, 0L, null, null, 0);
                                m = str5;
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
                                TLRPC.PhotoSize w = xb4.w(messageMedia2.getDocument().thumbs, 1000, z, null, z);
                                jn5 b2 = jn5.b(c6b.B(this.m2, storyItem3));
                                String concat = m.concat("_pframe");
                                jn5 c = jn5.c(w, storyItem3.media.getDocument());
                                storyItem = storyItem3;
                                str = null;
                                imageReceiver2.Y(b2, concat, c, m, null, null, null, 0L, null, storyItem, 0);
                                i4 = z;
                            } else {
                                str = null;
                                storyItem = storyItem3;
                                TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
                                if (photo == null || (arrayList6 = photo.sizes) == null) {
                                    imageReceiver2.f();
                                    i4 = z;
                                } else {
                                    TLRPC.PhotoSize w2 = xb4.w(arrayList6, ConnectionsManager.DEFAULT_DATACENTER_ID, z, null, z);
                                    xb4.u(800, photo.sizes);
                                    imageReceiver2.Y(null, null, jn5.i(w2, photo), m, null, null, null, 0L, null, storyItem, 0);
                                    i4 = z;
                                }
                            }
                        }
                    }
                    TLRPC.MessageMedia messageMedia3 = storyItem.media;
                    if (messageMedia3 == null || !r47.J4(messageMedia3.getDocument())) {
                        arrayList7 = arrayList3;
                        i7 = i2;
                        arrayList8 = arrayList4;
                    } else {
                        TLRPC.Document B = c6b.B(this.m2, storyItem);
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = xb4.G(this.m2).F(storyItem);
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("?account=");
                            sb2.append(this.m2);
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
                            sb2.append(URLEncoder.encode(xb4.B(B), "UTF-8"));
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
                            arrayList7.add(Uri.parse("tg://" + xb4.r(str, B) + sb));
                            arrayList8 = arrayList4;
                            try {
                                arrayList8.add(B);
                                i7 = i2;
                                if (i7 == 1) {
                                    try {
                                        if (pq3.d()) {
                                            xb4.G(this.m2).X(B, storyItem, 1, 1);
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
                                p39 p39Var = new p39(this);
                                p39Var.e(w49.d(tL_mediaAreaSuggestedReaction.reaction));
                                p39Var.b(this.K0);
                                arrayList10 = arrayList5;
                                arrayList10.add(p39Var);
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
                ImageReceiver imageReceiver3 = this.Q0;
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
                    ArrayList arrayList142 = this.g1;
                    isEmpty = arrayList142.isEmpty();
                    arrayList2 = this.f1;
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
        ccb ccbVar = (ccb) this.A1;
        lcb lcbVar = ccbVar.d;
        if (xea.j() && xea.b()) {
            boolean z2 = lcbVar.H0;
            ArrayList arrayList17 = lcbVar.M0;
            if (z2) {
                return;
            }
            for (int i14 = i13; i14 < arrayList17.size(); i14++) {
                for (int i15 = i13; i15 < arrayList15.size(); i15++) {
                    if (((Uri) arrayList15.get(i15)).equals(((kcb) arrayList17.get(i14)).uri)) {
                        arrayList15.remove(i15);
                    }
                }
            }
            for (int i16 = i13; i16 < arrayList15.size(); i16++) {
                Uri uri = (Uri) arrayList15.get(i16);
                kcb kcbVar = new kcb(lcbVar, lcbVar.D0, lcbVar.C0);
                kcbVar.setOnSeekUpdate(new hab(ccbVar, kcbVar, b));
                kcbVar.uri = uri;
                TLRPC.Document document = (TLRPC.Document) arrayList16.get(i16);
                kcbVar.document = document;
                if (document != null) {
                    hd4.J.put(Long.valueOf(document.id), Integer.valueOf(i13));
                } else {
                    ConcurrentHashMap concurrentHashMap = hd4.I;
                }
                kcbVar.preparePlayer(uri, lcb.D1, lcb.B1);
                arrayList17.add(kcbVar);
                if (arrayList17.size() > 2) {
                    ((kcb) arrayList17.remove(i13)).release(null);
                }
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        w96 w96Var;
        int i3 = jn7.y5;
        lcb lcbVar = this.t0;
        boolean z = false;
        if (i == i3 || (i == jn7.A5 && lcbVar.O0 == objArr[0])) {
            k68 k68Var = this.A1;
            if (k68Var == null || !((ccb) k68Var).d.H0) {
                if (this.u1) {
                    h1();
                    if (this.k1 == 0) {
                        if (this.o2) {
                            return;
                        }
                        this.o2 = true;
                        ((ccb) this.A1).j();
                        return;
                    }
                    int i4 = this.t1;
                    ArrayList arrayList = this.f1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.g1;
                    if (i4 >= arrayList2.size() + size) {
                        this.t1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    c1(false);
                    if (this.m1 || this.n1) {
                        i1(true);
                    }
                }
                TL_stories.PeerStories peerStories = lcbVar.Q0;
                if (peerStories != null) {
                    this.C1.U(peerStories, true);
                } else {
                    long j = this.l1;
                    if (j != 0) {
                        c6b c6bVar = this.C1;
                        TL_stories.PeerStories x = c6bVar.x(j);
                        if (x == null) {
                            x = c6bVar.y(j);
                            z = true;
                        }
                        c6bVar.U(x, z);
                    }
                }
                b8 b8Var = this.c1;
                if (b8Var != null) {
                    b8Var.animate().alpha((this.C1.L(this.l1) && this.y1.e && !xea.b()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.o3) {
            c1(false);
            return;
        }
        if (i == jn7.l4) {
            this.u0.b0.invalidate();
            return;
        }
        if (i == jn7.G5) {
            h0(true);
            return;
        }
        if (i == jn7.d3) {
            xx n = uc7.s1(this.m2).O1().n();
            if (n == null || !n.a(this.m2, 1) || this.A1 == null) {
                return;
            }
            qu0 qu0Var = new qu0(this, (byte) 9);
            Context W = hl.W(getContext());
            if (W == null) {
                W = LaunchActivity.H1;
            }
            ((ccb) this.A1).h(new l46(n.b(), this.m2, null, W, qu0Var));
            return;
        }
        if (i == jn7.k3) {
            TL_account.RequirementToContact P2 = uc7.s1(this.m2).P2(this.l1);
            boolean z2 = this.l1 >= 0 && !yac.h(this.m2).p() && (P2 instanceof TL_account.requirementToContactPremium);
            if (this.p1 == z2 && this.r1 == wf3.j(P2)) {
                return;
            }
            this.p1 = z2;
            this.r1 = wf3.j(P2);
            c1(false);
            h0(true);
            return;
        }
        if (i == jn7.T) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.l1 == (-((TLRPC.ChatFull) obj).id)) {
                c1(false);
                return;
            }
            return;
        }
        if (i != jn7.G2) {
            if (i == jn7.E && ((Boolean) objArr[2]).booleanValue()) {
                F0();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        if (lcbVar == null || (w96Var = lcbVar.B0) == null || w96Var.j() != longValue) {
            return;
        }
        c1(false);
        h58 h58Var = this.L1;
        if (h58Var != null) {
            h58Var.P(true);
            this.L1.I2(true);
            h0(true);
        }
        c58 c58Var = this.v0;
        if (c58Var != null) {
            w96 w96Var2 = c58Var.Q;
            if (c58Var.I != (w96Var2 != null ? w96Var2.m() : 0L)) {
                c58Var.e.O(true);
            }
        }
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        rw1 rw1Var;
        Canvas canvas2;
        hn hnVar;
        hn hnVar2;
        j1();
        if (this.n1 && (hnVar2 = this.A0) != null) {
            hnVar2.setBounds(0, 0, getMeasuredWidth(), hl.L(40.0f));
        }
        if (this.n1 && (hnVar = this.B0) != null) {
            hnVar.setBounds(0, 0, getMeasuredWidth(), hl.L(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z = this.e3;
        LinearLayout linearLayout = this.y0;
        p58 p58Var = this.n0;
        if (z) {
            float measuredWidth = (p58Var.getMeasuredWidth() / 2.0f) + p58Var.getX() + linearLayout.getX();
            float measuredHeight = (p58Var.getMeasuredHeight() / 2.0f) + p58Var.getY() + linearLayout.getY();
            int L = hl.L(24.0f);
            float f = L / 2.0f;
            float R1 = hl.R1(this.g3, measuredWidth - f, k43.g.getInterpolation(this.f3));
            float R12 = hl.R1(this.h3, measuredHeight - f, this.f3);
            int U1 = hl.U1(this.f3, this.i3, L);
            if (this.Z2) {
                wl wlVar = this.Y2;
                if (wlVar != null) {
                    float f2 = U1;
                    wlVar.setBounds((int) R1, (int) R12, (int) (R1 + f2), (int) (R12 + f2));
                    this.Y2.draw(canvas);
                }
            } else {
                float f3 = U1;
                ImageReceiver imageReceiver = this.X2;
                imageReceiver.i0(R1, R12, f3, f3);
                imageReceiver.h(canvas, null);
            }
        }
        if (this.a3) {
            float measuredWidth2 = (p58Var.getMeasuredWidth() / 2.0f) + p58Var.getX() + linearLayout.getX();
            float measuredHeight2 = (p58Var.getMeasuredHeight() / 2.0f) + p58Var.getY() + linearLayout.getY();
            int L2 = hl.L(120.0f);
            if (this.Z2) {
                yl ylVar = this.W2;
                if (ylVar != null) {
                    float f4 = L2 / 2.0f;
                    ylVar.e((int) (measuredWidth2 - f4), (int) (measuredHeight2 - f4), (int) (measuredWidth2 + f4), (int) (measuredHeight2 + f4));
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
                float f5 = L2;
                float f6 = f5 / 2.0f;
                float f7 = measuredWidth2 - f6;
                float f8 = measuredHeight2 - f6;
                ImageReceiver imageReceiver2 = this.V2;
                imageReceiver2.i0(f7, f8, f5, f5);
                imageReceiver2.h(canvas, null);
                if (imageReceiver2.y() != null && imageReceiver2.y().v()) {
                    this.a3 = false;
                }
            }
        }
        h58 h58Var = this.L1;
        if (h58Var != null) {
            rw1 rw1Var2 = h58Var.n2;
            rw1 rw1Var3 = h58Var.o2;
            if (h58Var.getAlpha() == 0.0f || (rw1Var = h58Var.f1) == null || rw1Var.getParent() == null || h58Var.f1.getVisibility() != 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(h58Var.f1.getX() + rw1Var2.getX() + rw1Var3.getX() + h58Var.getX(), h58Var.f1.getY() + rw1Var2.getY() + rw1Var3.getY() + h58Var.getY());
            if (h58Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, h58Var.getMeasuredWidth(), h58Var.getMeasuredHeight(), (int) (h58Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            h58Var.f1.draw(canvas2);
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        rz4 rz4Var;
        float L;
        if (view == this.N2) {
            canvas.save();
            canvas.clipRect(0.0f, this.N2.getY(), getMeasuredWidth(), this.N2.getY() + this.N2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        h58 h58Var = this.L1;
        Paint paint = this.X1;
        p58 p58Var = this.n0;
        m68 m68Var = this.h1;
        if (view == h58Var) {
            float f = this.a2;
            n68 n68Var = this.y1;
            if (f > 0.0f && !n68Var.f) {
                m68Var.l.setAlpha((int) (f * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), m68Var.l);
            }
            RectF rectF = m68Var.h;
            RectF rectF2 = m68Var.i;
            RectF rectF3 = m68Var.j;
            rectF.set(this.L1.getX(), this.L1.getY() + this.L1.getAnimatedTop() + hl.L(1.33f), this.L1.getX() + this.L1.getMeasuredWidth(), this.L1.getY() + this.L1.getMeasuredHeight());
            float L2 = hl.L(40.0f);
            if (n68Var.f) {
                L = hl.L(46.0f);
                L2 = hl.L(46.0f);
                uj7 uj7Var = this.K1;
                if (uj7Var != null && uj7Var.getVisibility() == 0) {
                    L2 += hl.L(46.0f);
                }
            } else {
                if (this.C2) {
                    L2 += hl.L(46.0f);
                }
                if (this.D2 && this.n1) {
                    L2 += hl.L(46.0f);
                }
                if (p58Var != null && p58Var.getVisibility() == 0) {
                    L2 = (L2 - hl.L(40.0f)) + p58Var.getLayoutParams().width;
                }
                L = 0.0f;
            }
            rectF2.set(hl.L(10.0f) + L, ((this.L1.getY() + this.L1.getMeasuredHeight()) - hl.L(5.0f)) - hl.L(38.0f), (getMeasuredWidth() - hl.L(10.0f)) - L2, (this.L1.getY() + this.L1.getMeasuredHeight()) - hl.L(5.0f));
            this.L1.setTranslationX((1.0f - this.a2) * L);
            this.L1.getEditField().setTranslationY(qd4.A(1.0f, this.a2, -hl.L(2.0f), this.L1.getMeasuredHeight() > hl.L(50.0f) ? ((1.0f - this.a2) * (this.L1.getMeasuredHeight() - hl.L(50.0f))) + 0.0f : 0.0f));
            float L3 = hl.L(50.0f) / 2.0f;
            hl.X1(rectF2, m68Var.h, this.a2, rectF3);
            jl0 jl0Var = this.V1;
            if (jl0Var != null) {
                jl0Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                jl0Var.r(L3);
                jl0Var.setAlpha((int) ((1.0f - this.N3) * (1.0f - this.b2) * 255.0f * getHideInterfaceAlpha()));
                jl0Var.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, L3, L3, paint);
            }
            if (this.a2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (h58Var != null && h58Var.V0(view)) {
                float L4 = hl.L(30.0f);
                RectF rectF4 = m68Var.k;
                RectF rectF5 = m68Var.k;
                rectF4.set(0.0f, view.getY() + hl.L(1.0f), getWidth(), hl.L(20.0f) + getHeight());
                Path path = this.K3;
                path.rewind();
                path.addRoundRect(rectF5, L4, L4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                jl0 jl0Var2 = this.W1;
                if (jl0Var2 != null) {
                    jl0Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    jl0Var2.s(L4, L4, L4, L4);
                    jl0Var2.setAlpha(jn7.d4);
                    jl0Var2.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, L4, L4, paint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild3;
            }
            if (view != this.P1 || this.L1 == null) {
                if (view == this.b3) {
                    view.setTranslationY((this.y0.getY() + (p58Var.getY() + (-(r2.getMeasuredHeight() - this.b3.getPaddingBottom())))) - hl.L(18.0f));
                } else {
                    u58 u58Var = this.M0;
                    if (view == u58Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (rz4Var = this.q3) != null && !rz4Var.r) {
                        RecordingCanvas i = rz4Var.i(getMeasuredWidth(), getMeasuredHeight());
                        i.drawColor(vm2.f(0.2f, -16777216, -1));
                        i.translate(u58Var.getX(), u58Var.getY());
                        view.draw(i);
                        rz4Var.j();
                    }
                }
            } else {
                view.setTranslationY(((this.L1.getY() + this.L1.getAnimatedTop()) + (-r2.getMeasuredHeight())) - hl.L(18.0f));
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i) {
        this.o2 = false;
        this.F2 = true;
        this.l3 = false;
        this.n1 = false;
        this.o1 = false;
        long j = this.l1;
        l68 l68Var = this.Y0;
        rb0 rb0Var = this.X0;
        if (j >= 0) {
            this.m1 = j == yac.h(this.m2).e();
            TLRPC.User X1 = uc7.s1(this.m2).X1(Long.valueOf(this.l1));
            TL_account.RequirementToContact P2 = uc7.s1(this.m2).P2(this.l1);
            this.p1 = !yac.h(this.m2).p() && (P2 instanceof TL_account.requirementToContactPremium);
            this.r1 = wf3.j(P2);
            rb0Var.q(X1);
            l68Var.a.getImageReceiver().U(X1, rb0Var, null);
            R0(this.l1, true, false);
        } else {
            this.m1 = false;
            this.n1 = true;
            if (this.C1.g(j)) {
                this.l3 = true;
            } else {
                boolean z = f11.a;
            }
            TLRPC.Chat M0 = uc7.s1(this.m2).M0(Long.valueOf(-this.l1));
            boolean V = xc2.V(M0);
            this.o1 = !V;
            if (!V && uc7.s1(this.m2).N0(-this.l1) == null) {
                kf7.a0(this.m2).F0(-this.l1, true, new CountDownLatch(1), false, false, 0);
            }
            this.p1 = this.o1 && !xc2.q(M0);
            this.r1 = uc7.s1(this.m2).M1(this.l1);
            rb0Var.p(M0);
            l68Var.a.getImageReceiver().U(M0, rb0Var, null);
            R0(this.l1, true, false);
        }
        if (this.u1 && (this.m1 || this.n1)) {
            c6b c6bVar = this.C1;
            long j2 = this.l1;
            zh6 zh6Var = c6bVar.m;
            hjc hjcVar = (hjc) zh6Var.f(j2);
            if (hjcVar == null) {
                hjcVar = new hjc(c6bVar.a, j2, c6bVar);
                zh6Var.k(j2, hjcVar);
            }
            hjcVar.b(true);
        }
        h1();
        this.t1 = i;
        if (i < 0) {
            this.t1 = 0;
        }
        this.G0 = 0L;
        this.I0 = false;
        this.s3 = null;
        this.t3 = null;
        boolean z2 = this.n1;
        u58 u58Var = this.M0;
        lcb lcbVar = this.t0;
        int i2 = 8;
        n68 n68Var = this.y1;
        if (z2) {
            r0();
            if (this.L1 == null && (this.o1 || n68Var.f)) {
                l0();
            }
            if (this.L1 != null) {
                TLRPC.Chat M02 = uc7.s1(this.m2).M0(Long.valueOf(-this.l1));
                h58 h58Var = this.L1;
                if (n68Var.f || (!A0() && this.o1 && (xc2.q(M02) || xc2.s0(M02)))) {
                    i2 = 0;
                }
                h58Var.setVisibility(i2);
                h58 h58Var2 = this.L1;
                boolean z3 = n68Var.f;
                v0(true);
                h58Var2.U1(z3);
                this.L1.b2(n68Var.f && !v0(true) && (this.f2 || this.L1.X0), true);
                xt3 editField = this.L1.getEditField();
                long j3 = this.l1;
                TL_stories.StoryItem storyItem = n68Var.a;
                lcbVar.getClass();
                editField.setText(lcb.x(j3, storyItem));
                this.L1.M1(this.m2, this.l1);
                this.L1.C2(M02, null);
            }
            hn hnVar = this.A0;
            x53 x53Var = this.l0;
            if (hnVar == null) {
                hn hnVar2 = new hn(false, false, false);
                this.A0 = hnVar2;
                p58 p58Var = this.n0;
                hnVar2.setCallback(p58Var);
                this.A0.u(x53Var.h(aob.G6));
                this.A0.w(hl.L(14.0f));
                this.C0 = new mm(p58Var);
            }
            p58 p58Var2 = this.z0;
            if (p58Var2 != null && this.B0 == null) {
                hn hnVar3 = new hn(false, false, false);
                this.B0 = hnVar3;
                hnVar3.setCallback(p58Var2);
                this.B0.u(x53Var.h(aob.G6));
                this.B0.w(hl.L(14.0f));
                this.D0 = new mm(p58Var2);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            this.k1 = getStoriesCount();
            u58Var.invalidate();
            invalidate();
        } else if (this.m1) {
            r0();
            boolean z4 = n68Var.f;
            p58 p58Var3 = this.G1;
            if (z4) {
                p58Var3.setVisibility(8);
                if (this.L1 == null) {
                    l0();
                }
                this.L1.setVisibility(0);
            } else {
                p58Var3.setVisibility(0);
                h58 h58Var3 = this.L1;
                if (h58Var3 != null) {
                    h58Var3.setVisibility(8);
                }
            }
            h58 h58Var4 = this.L1;
            if (h58Var4 != null) {
                boolean z5 = n68Var.f;
                v0(true);
                h58Var4.U1(z5);
                this.L1.b2(n68Var.f && !v0(true) && (this.f2 || this.L1.X0), true);
            }
            if (i == -1) {
                ArrayList arrayList = this.j1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(lcbVar.P0));
                    if (indexOf < 0 && !this.j1.isEmpty()) {
                        if (lcbVar.P0 > ((Integer) this.j1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (lcbVar.P0 < ((Integer) c00.g(1, this.j1)).intValue()) {
                            indexOf = this.j1.size() - 1;
                        }
                    }
                    this.t1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.g1.isEmpty();
                    ArrayList arrayList2 = this.f1;
                    if (isEmpty) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i3)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i3)).id > this.C1.f.get(this.l1)) {
                                this.t1 = i3;
                                break;
                            }
                        }
                    } else {
                        this.t1 = arrayList2.size();
                    }
                }
            }
            c1(false);
            u58Var.invalidate();
            invalidate();
        } else {
            if (this.L1 == null) {
                l0();
            }
            if (this.p1 && this.Q1 == null) {
                p0();
            }
            if (this.Q1 != null) {
                if (this.p1 || this.q1) {
                    e1();
                }
                this.Q1.setVisibility(((!this.p1 || n68Var.f) && !this.q1) ? 8 : 0);
            }
            d8b d8bVar = this.T1;
            if (d8bVar != null) {
                d8bVar.setVisibility(8);
            }
            if (i == -1) {
                f1();
            }
            c1(false);
            h58 h58Var5 = this.L1;
            if (h58Var5 != null) {
                h58Var5.setVisibility((A0() || lbc.C(this.l1)) ? 8 : 0);
                h58 h58Var6 = this.L1;
                boolean z6 = n68Var.f;
                v0(true);
                h58Var6.U1(z6);
                this.L1.b2(n68Var.f && !v0(true) && (this.f2 || this.L1.X0), true);
                xt3 editField2 = this.L1.getEditField();
                long j4 = this.l1;
                TL_stories.StoryItem storyItem2 = n68Var.a;
                lcbVar.getClass();
                editField2.setText(lcb.x(j4, storyItem2));
                this.L1.M1(this.m2, this.l1);
                TLRPC.UserFull Y1 = uc7.s1(this.m2).Y1(this.l1);
                if (Y1 != null) {
                    this.L1.C2(null, Y1);
                } else {
                    uc7.s1(this.m2).f3(uc7.s1(this.m2).X1(Long.valueOf(this.l1)), this.j2, false, null);
                }
            }
            this.k1 = getStoriesCount();
            p58 p58Var4 = this.G1;
            if (p58Var4 != null) {
                p58Var4.setVisibility(8);
            }
            u58Var.invalidate();
            invalidate();
        }
        h0(false);
    }

    public final void e1() {
        boolean z = this.q1;
        TextView textView = this.R1;
        if (z) {
            if (textView != null) {
                textView.setText(ob6.M0(2131748577, null));
            }
            TextView textView2 = this.S1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setText(ob6.M0(this.o1 ? 2131744319 : 2131744147, null));
        }
        TextView textView3 = this.S1;
        if (textView3 != null) {
            textView3.setVisibility(0);
            this.S1.setText(ob6.M0(2131744146, null));
        }
    }

    public final void f0() {
        z58 z58Var = this.u0;
        if (z58Var.W.w()) {
            z58Var.W.e(false);
        }
    }

    public final void f1() {
        TL_stories.PeerStories peerStories;
        int i;
        ArrayList arrayList = this.j1;
        lcb lcbVar = this.t0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.g1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                i = 0;
            } else {
                i = arrayList2.size();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    long j = ((b6b) arrayList2.get(i2)).a;
                    if (((int) (j ^ (j >>> 32))) == lcbVar.P0) {
                        this.t1 = i2;
                        return;
                    }
                }
            }
            int indexOf = this.j1.indexOf(Integer.valueOf(lcbVar.P0));
            if (indexOf < 0 && !this.j1.isEmpty()) {
                if (lcbVar.P0 > ((Integer) this.j1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (lcbVar.P0 < ((Integer) c00.g(1, this.j1)).intValue()) {
                    indexOf = this.j1.size() - 1;
                }
            }
            this.t1 = i + indexOf;
        } else {
            int i3 = lcbVar.e1.get(this.l1, -1);
            this.t1 = i3;
            if (i3 == -1 && !lcbVar.N0 && (peerStories = this.e1) != null && peerStories.max_read_id > 0) {
                int i4 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f1;
                    if (i4 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i4)).id > this.e1.max_read_id) {
                        this.t1 = i4;
                        break;
                    }
                    i4++;
                }
            }
        }
        if (this.t1 == -1) {
            this.t1 = 0;
        }
    }

    public final void g0() {
        if (this.u1) {
            ((ccb) this.A1).d.U();
        }
    }

    public final void g1(boolean z) {
        b8 b8Var = this.n3;
        if (b8Var == null || this.m3 == null || b8Var.getVisibility() != 0) {
            return;
        }
        if (z) {
            if (Math.abs(lcb.B1 - 0.2f) < 0.05f) {
                this.n3.setSubtext(ob6.M0(2131743226, null));
            } else if (Math.abs(lcb.B1 - 0.5f) < 0.05f) {
                this.n3.setSubtext(ob6.M0(2131743228, null));
            } else if (Math.abs(lcb.B1 - 1.0f) < 0.05f) {
                this.n3.setSubtext(ob6.M0(2131743229, null));
            } else if (Math.abs(lcb.B1 - 1.5f) < 0.05f) {
                this.n3.setSubtext(ob6.M0(2131743230, null));
            } else {
                float abs = Math.abs(lcb.B1 - 2.0f);
                b8 b8Var2 = this.n3;
                if (abs < 0.05f) {
                    b8Var2.setSubtext(ob6.M0(2131743227, null));
                } else {
                    b8Var2.setSubtext(ob6.a0(null, null, 2131743231, zoa.a(lcb.B1).concat("x")));
                }
            }
        }
        this.m3.C0(z, lcb.B1);
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
        u58 u58Var = this.M0;
        Bitmap createBitmap = Bitmap.createBitmap(u58Var.getWidth(), u58Var.getHeight(), Bitmap.Config.ARGB_8888);
        w0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.t1;
    }

    public c6b getStoriesController() {
        return uc7.s1(this.m2).O1();
    }

    public int getStoriesCount() {
        return Math.max(this.n2, this.f1.size()) + this.g1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f1;
    }

    public final void h0(boolean z) {
        if (this.L1 != null && this.P2 && this.K0) {
            u48 u48Var = this.y3;
            hl.r(u48Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.C1.B;
            this.L1.P(true);
            boolean z2 = this.p1;
            n68 n68Var = this.y1;
            if ((z2 && !n68Var.f) || this.q1) {
                this.U2 = false;
                this.L1.setEnabled(false);
                this.L1.W1(" ", z);
                return;
            }
            if (this.r1 > 0) {
                this.U2 = false;
                this.L1.setEnabled(true);
                this.L1.W1(nza.T0(ob6.a0(null, null, 2131743581, ob6.E(this.r1, ','))), z);
                return;
            }
            if (!n68Var.f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.m2).getCurrentTime();
                int i = tL_storiesStealthMode.active_until_date;
                if (currentTime < i) {
                    this.U2 = true;
                    int currentTime2 = i - ConnectionsManager.getInstance(this.m2).getCurrentTime();
                    int i2 = currentTime2 / 60;
                    int i3 = currentTime2 % 60;
                    Locale locale = Locale.US;
                    int measureText = (int) this.L1.getEditField().getPaint().measureText(ob6.a0(null, null, 2131744545, String.format(locale, "%02d:%02d", 99, 99)));
                    this.L1.setEnabled(true);
                    float f = measureText * 1.2f;
                    float measuredWidth = this.L1.getEditField().getMeasuredWidth();
                    h58 h58Var = this.L1;
                    if (f >= measuredWidth) {
                        String a0 = ob6.a0(null, null, 2131744545, "");
                        String format = String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3));
                        h58Var.e = a0;
                        h58Var.f = format;
                        h58Var.y2(z);
                    } else {
                        h58Var.W1(ob6.a0(null, null, 2131744546, String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3))), z);
                    }
                    hl.d3(u48Var, 1000L);
                    return;
                }
            }
            this.U2 = false;
            this.L1.setEnabled(true);
            boolean z3 = n68Var.f;
            h58 h58Var2 = this.L1;
            if (!z3) {
                h58Var2.W1(ob6.M0(this.o1 ? 2131745977 : 2131745982, null), z);
                return;
            }
            long starsPrice = h58Var2.getStarsPrice();
            h58 h58Var3 = this.L1;
            if (starsPrice <= 0) {
                h58Var3.W1(ob6.M0(2131751970, null), z);
                return;
            }
            h58Var3.W1(nza.Z0(false, ob6.a0(null, null, 2131751969, ob6.E((int) starsPrice, ',')), this.L1.j7), z);
            wm2 wm2Var = this.L1.j7[0];
            if (wm2Var != null) {
                wm2Var.H = 0.9f;
            }
        }
    }

    public final void h1() {
        TL_stories.PeerStories x;
        v5b v5bVar;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f1;
        arrayList.clear();
        lcb lcbVar = this.t0;
        if (!lcbVar.N0) {
            ArrayList arrayList2 = this.j1;
            int i = 0;
            ArrayList arrayList3 = this.g1;
            if (arrayList2 != null && (v5bVar = lcbVar.O0) != null) {
                if (v5bVar instanceof p5b) {
                    arrayList3.clear();
                    ArrayList E = uc7.s1(this.m2).O1().E(this.l1);
                    String str = ((p5b) lcbVar.O0).E;
                    if (E != null) {
                        for (int i2 = 0; i2 < E.size(); i2++) {
                            b6b b6bVar = (b6b) E.get(i2);
                            c8b c8bVar = b6bVar.c;
                            if (c8bVar != null && !c8bVar.g && TextUtils.equals(c8bVar.K0, str)) {
                                arrayList3.add(b6bVar);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.j1;
                int size = arrayList4.size();
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    r47 f = lcbVar.O0.f(((Integer) obj).intValue());
                    if (f != null && (storyItem = f.l) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (lcbVar.O0 != null) {
                while (i < lcbVar.O0.i.size()) {
                    arrayList.add(((r47) lcbVar.O0.i.get(i)).l);
                    i++;
                }
            } else {
                TL_stories.PeerStories peerStories = lcbVar.Q0;
                if (peerStories == null || wf3.n(peerStories.peer) != this.l1) {
                    x = this.C1.x(this.l1);
                    this.e1 = x;
                    if (x == null) {
                        x = this.C1.y(this.l1);
                        this.e1 = x;
                    }
                } else {
                    x = lcbVar.Q0;
                    this.e1 = x;
                }
                this.n2 = 0;
                if (x != null) {
                    this.n2 = x.stories.size();
                    arrayList.addAll(this.e1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.C1.E(this.l1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        } else if (!lcbVar.S0) {
            arrayList.add(lcbVar.T0);
        }
        this.k1 = getStoriesCount();
    }

    public final boolean i0() {
        byte b = 1;
        if (this.c3) {
            if (this.b3.getReactionsWindow() == null) {
                W0(false);
                return true;
            }
            int i = this.i2;
            i49 i49Var = this.b3;
            if (i > 0) {
                hl.t1(i49Var.getReactionsWindow().c);
                return true;
            }
            i49Var.getReactionsWindow().d();
            return true;
        }
        s58 s58Var = this.T0;
        if (s58Var != null) {
            kg5 kg5Var = s58Var.c;
            if (kg5Var != null) {
                kg5Var.f(true);
                s58Var.c = null;
            }
            s58Var.b = null;
            s58Var.invalidate();
            s58Var.b(false);
        }
        z58 z58Var = this.u0;
        if (z58Var.W.w()) {
            z58Var.W.e(false);
            return true;
        }
        kg5 kg5Var2 = this.p0;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
        kg5 kg5Var3 = this.q0;
        if (kg5Var3 != null) {
            kg5Var3.f(true);
        }
        lg5 lg5Var = this.G2;
        if (lg5Var != null) {
            lg5Var.a();
        }
        j68 j68Var = this.d1;
        if (j68Var != null && j68Var.a) {
            j68Var.a();
            return true;
        }
        h58 h58Var = this.L1;
        if (h58Var != null && h58Var.W0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.l0, getContext());
            boolean z = this.L1.d1;
            id idVar = alertDialog$Builder.a;
            if (z) {
                idVar.S = ob6.M0(2131751360, null);
                idVar.U = ob6.M0(2131751361, null);
            } else {
                idVar.S = ob6.M0(2131751357, null);
                idVar.U = ob6.M0(2131751358, null);
            }
            alertDialog$Builder.j(ob6.M0(2131751359, null), new s48(this, b));
            alertDialog$Builder.g(ob6.M0(2131751736, null), null);
            ((ccb) this.A1).h(idVar);
            return true;
        }
        i49 i49Var2 = this.P1;
        if (i49Var2 != null && i49Var2.getReactionsWindow() != null && !this.P1.getReactionsWindow().q) {
            this.P1.getReactionsWindow().d();
            return true;
        }
        h58 h58Var2 = this.L1;
        if (h58Var2 != null && h58Var2.U0()) {
            int i2 = this.i2;
            h58 h58Var3 = this.L1;
            if (i2 > 0) {
                hl.t1(h58Var3.getEmojiView());
                return true;
            }
            h58Var3.O0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < hl.L(20.0f)) {
            if (z58Var.getVisibility() != 0 || z58Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            z58Var.D();
            this.Q2 = false;
            this.M0.invalidate();
            return true;
        }
        h58 h58Var4 = this.L1;
        if (h58Var4 != null) {
            long j = this.l1;
            TL_stories.StoryItem storyItem = this.y1.a;
            Editable editText = h58Var4.getEditText();
            this.t0.getClass();
            lcb.N(j, storyItem, editText);
        }
        hl.t1(this.L1);
        return true;
    }

    public final void i1(boolean z) {
        int i;
        mz1 mz1Var;
        boolean z2;
        int i2;
        n68 n68Var = this.y1;
        TL_stories.StoryItem storyItem = n68Var.a;
        if (storyItem == null) {
            storyItem = n68Var.c;
        }
        boolean z3 = this.n1;
        if (z3 || this.m1) {
            if (storyItem == null) {
                this.k2.setText("");
                this.p2.setVisibility(8);
                this.l2.setVisibility(8);
                return;
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            lcb lcbVar = this.t0;
            p58 p58Var = this.n0;
            if (!z3) {
                int i3 = 3;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.k2.setText(lcbVar.O0 == null ? ob6.M0(2131747854, null) : ob6.M0(2131747853, null));
                    this.k2.setTranslationX(hl.L(16.0f));
                    this.l2.setVisibility(8);
                    this.p2.setVisibility(8);
                } else {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 >= storyItem.views.recent_viewers.size()) {
                            i = i3;
                            break;
                        }
                        TLObject b2 = uc7.s1(this.m2).b2(storyItem.views.recent_viewers.get(i4).longValue());
                        if (b2 != null) {
                            this.l2.b(i5, this.m2, b2);
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
                        mz1Var = this.l2;
                        if (i6 >= i) {
                            break;
                        }
                        mz1Var.b(i6, this.m2, null);
                        i6++;
                    }
                    mz1Var.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.H(',', "Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        wm2 wm2Var = new wm2(R.drawable.mini_views_likes, 0);
                        wm2Var.y = -53704;
                        wm2Var.n = hl.L(0.2f);
                        spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        wm2 wm2Var2 = new wm2(R.drawable.mini_repost_story, 0);
                        wm2Var2.y = -14161823;
                        wm2Var2.n = hl.L(0.2f);
                        spannableStringBuilder.setSpan(wm2Var2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.k2.setText(spannableStringBuilder);
                    mz1 mz1Var2 = this.l2;
                    if (i5 == 0) {
                        mz1Var2.setVisibility(8);
                        this.k2.setTranslationX(hl.L(16.0f));
                    } else {
                        mz1Var2.setVisibility(0);
                        this.k2.setTranslationX(hl.L(10.0f) + bp1.h(i5, 1, hl.L(20.0f), hl.L(24.0f) + hl.L(13.0f)));
                    }
                    this.p2.setVisibility(0);
                }
                p58Var.getLayoutParams().width = hl.L(40.0f);
                this.y0.requestLayout();
                return;
            }
            if (storyViews == null) {
                storyViews = new TL_stories.TL_storyViews();
                storyItem.views = storyViews;
            }
            if (storyViews.views_count <= 0) {
                storyViews.views_count = 1;
            }
            hn hnVar = this.B0;
            if (hnVar == null || (i2 = storyViews.forwards_count) <= 0) {
                this.F0 = false;
            } else {
                hnVar.t(Integer.toString(i2), z && this.F0, true);
                this.F0 = true;
            }
            int i7 = storyItem.views.reactions_count;
            if (i7 > 0) {
                this.A0.t(Integer.toString(i7), z && this.E0, true);
                this.E0 = true;
                z2 = true;
            } else {
                this.E0 = false;
                z2 = false;
            }
            if (!z) {
                this.C0.e(true, z2 ? 1.0f : 0.0f);
                mm mmVar = this.D0;
                if (mmVar != null) {
                    mmVar.e(true, this.F0 ? 1.0f : 0.0f);
                }
            }
            TLRPC.Chat M0 = uc7.s1(this.m2).M0(Long.valueOf(-this.l1));
            if (!(this.o1 && (xc2.q(M0) || xc2.s0(M0))) && storyItem.views.views_count > 0) {
                this.k2.setText(lcbVar.O0 == null ? ob6.M0(2131747854, null) : ob6.M0(2131747853, null));
                this.k2.setTranslationX(hl.L(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new wm2(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) hl.o0(storyItem.views.views_count, 0));
                this.k2.setText(spannableStringBuilder2);
            } else {
                this.k2.setText("");
            }
            p58Var.getLayoutParams().width = (int) (hl.L(40.0f) + (this.E0 ? this.A0.d + hl.L(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin = hl.L(40.0f) + p58Var.getLayoutParams().width;
            p58 p58Var2 = this.z0;
            if (p58Var2 != null) {
                p58Var2.getLayoutParams().width = (int) (hl.L(40.0f) + (this.F0 ? this.B0.d + hl.L(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.G1.getLayoutParams()).rightMargin += p58Var2.getLayoutParams().width;
                p58Var2.requestLayout();
            }
            this.G1.requestLayout();
            p58Var.requestLayout();
            this.l2.setVisibility(8);
            this.p2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = n68Var.a;
            s58 s58Var = this.T0;
            if (storyItem2 == null) {
                s58Var.getClass();
                return;
            }
            for (int i8 = 0; i8 < s58Var.getChildCount(); i8++) {
                if (s58Var.getChildAt(i8) instanceof aab) {
                    ((aab) s58Var.getChildAt(i8)).c(storyItem2.views, z);
                }
            }
        }
    }

    public final void j0() {
        if (this.s2 == null) {
            f41 f41Var = new f41(this, getContext(), this.l0);
            this.s2 = f41Var;
            f41Var.W3 = new l58(this);
            f41Var.d2.g0();
            f41 f41Var2 = this.s2;
            f41Var2.Q1 = true;
            f41Var2.a1();
            f41 f41Var3 = this.s2;
            f41Var3.R1 = new m58(this);
            f41Var3.V0().setText(this.L1.getFieldText());
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final void j1() {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o68.j1():void");
    }

    public final void k0() {
        if (this.H1 != null || getContext() == null) {
            return;
        }
        dn2 dn2Var = new dn2(getContext(), this.r3);
        this.H1 = dn2Var;
        dn2Var.setOnClickListener(new v48(this, (byte) 5));
        addView(this.H1, tre.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void l0() {
        x53 x53Var = this.l0;
        h58 h58Var = new h58(this, hl.W(getContext()), this, new pu0(x53Var, (byte) 4));
        this.L1 = h58Var;
        xt3 editField = h58Var.getEditField();
        editField.getClass();
        pt3 pt3Var = new pt3(editField, (byte) 0);
        editField.u0 = pt3Var;
        pt3Var.q(true);
        editField.u0.u(editField.y0);
        editField.u0.w(editField.getPaint().getTextSize());
        pt3 pt3Var2 = new pt3(editField, (byte) 1);
        editField.v0 = pt3Var2;
        pt3Var2.b = 5;
        pt3Var2.u(editField.y0);
        editField.v0.w(editField.getPaint().getTextSize());
        this.L1.getEditField().setScaleX(0.0f);
        this.L1.setOverrideKeyboardAnimation(true);
        this.L1.setClipChildren(false);
        this.L1.setDelegate(new i58(this));
        setDelegate(this.L1);
        h58 h58Var2 = this.L1;
        h58Var2.i6 = false;
        h58Var2.j6 = true;
        if (this.y1.f) {
            h58Var2.G1(false, false, false);
        } else {
            h58Var2.G1(true, true, false);
        }
        this.L1.updateColors();
        h58 h58Var3 = this.L1;
        h58Var3.k6 = true;
        addView(h58Var3, tre.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.x3 != null) {
            this.L1.I2(false);
        }
        this.L1.v3 = this.j2;
        d30 d30Var = this.w2;
        ((ArrayList) d30Var.g).add(this.M0);
        ((ArrayList) d30Var.g).add(this);
        if (this.K0) {
            this.L1.j1();
        }
        h0(false);
        if (A0()) {
            this.L1.setVisibility(8);
        }
        vz1 vz1Var = new vz1(getContext(), x53Var, this.r3, this.p3);
        this.M1 = vz1Var;
        vz1Var.setOnClickListener(new s48(this, (byte) 2));
        addView(this.M1, tre.e(57, jn7.W4, 85));
        this.M1.setVisibility(8);
        this.L1.setSideButtonsForAttach(this.M1);
        this.s0 = getChildCount();
    }

    public final void m0() {
        if (this.T1 != null) {
            return;
        }
        d8b d8bVar = new d8b(getContext(), this.l0);
        this.T1 = d8bVar;
        d8bVar.setOnClickListener(new v48(this, (byte) 7));
        this.T1.setAlpha(0.0f);
        this.T1.setVisibility(8);
        addView(this.T1, tre.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void n0() {
        if (this.K1 != null || getContext() == null) {
            return;
        }
        uj7 uj7Var = new uj7(getContext(), this.r3);
        this.K1 = uj7Var;
        uj7Var.setOnClickListener(new v48(this, (byte) 9));
        uj7 uj7Var2 = this.K1;
        w96 w96Var = w96.N;
        boolean z = true;
        uj7Var2.b(w96Var != null && w96Var.r(), false);
        uj7 uj7Var3 = this.K1;
        w96 w96Var2 = w96.N;
        if (w96Var2 != null && !w96Var2.G) {
            z = false;
        }
        uj7Var3.a(z, false);
        addView(this.K1, tre.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void o0() {
        if (this.J1 != null || getContext() == null) {
            return;
        }
        this.I1 = new bv7(getContext(), this.m2);
        cv7 cv7Var = new cv7(getContext(), this.I1, this.r3);
        this.J1 = cv7Var;
        cv7Var.setOnClickListener(new v48(this, (byte) 10));
        this.J1.setOnLongClickListener(new x48(this, (byte) 1));
        addView(this.J1, tre.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.I1, tre.d(jn7.d3, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.O0.I();
        this.Q0.I();
        this.P0.I();
        this.V2.I();
        this.X2.I();
        h58 h58Var = this.L1;
        if (h58Var != null) {
            h58Var.j1();
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i >= arrayList.size()) {
                jn7.f(this.m2).b(this, jn7.T);
                jn7.f(this.m2).b(this, jn7.G2);
                jn7.f(this.m2).b(this, jn7.y5);
                jn7.f(this.m2).b(this, jn7.o3);
                jn7.f(this.m2).b(this, jn7.A5);
                jn7.f(this.m2).b(this, jn7.G5);
                jn7.f(this.m2).b(this, jn7.d3);
                jn7.f(this.m2).b(this, jn7.k3);
                jn7.f(this.m2).b(this, jn7.E);
                jn7.e().b(this, jn7.l4);
                return;
            }
            ((p39) arrayList.get(i)).b(true);
            i++;
        }
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        this.O0.K();
        this.Q0.K();
        this.P0.K();
        this.V2.K();
        this.X2.K();
        h58 h58Var = this.L1;
        if (h58Var != null) {
            h58Var.i1();
        }
        wl wlVar = this.Y2;
        if (wlVar != null) {
            wlVar.o(this);
            this.Y2 = null;
        }
        yl ylVar = this.W2;
        if (ylVar != null) {
            ylVar.d(this);
            this.W2 = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i >= arrayList.size()) {
                jn7.f(this.m2).n(this, jn7.T);
                jn7.f(this.m2).n(this, jn7.G2);
                jn7.f(this.m2).n(this, jn7.y5);
                jn7.f(this.m2).n(this, jn7.o3);
                jn7.f(this.m2).n(this, jn7.A5);
                jn7.f(this.m2).n(this, jn7.G5);
                jn7.f(this.m2).n(this, jn7.d3);
                jn7.f(this.m2).n(this, jn7.k3);
                jn7.f(this.m2).n(this, jn7.E);
                jn7.e().n(this, jn7.l4);
                return;
            }
            ((p39) arrayList.get(i)).b(false);
            i++;
        }
    }

    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h1.d.setBounds(0, 0, getMeasuredWidth(), hl.L(72.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042c  */
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
        i49 i49Var;
        j58 j58Var;
        lcb lcbVar = this.t0;
        if (lcbVar.b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = hl.m;
        }
        byte b = 0;
        if (this.u1 && this.J2 == null) {
            this.i2 = ((ccb) this.A1).d.q0;
        } else {
            this.i2 = 0;
        }
        int size = lcbVar.b ? View.MeasureSpec.getSize(i2) : View.MeasureSpec.getSize(i2) + this.i2;
        int size2 = (int) ((View.MeasureSpec.getSize(i) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.i2 < hl.L(20.0f)) {
            this.i2 = 0;
        }
        int i3 = this.i2;
        i49 i49Var2 = this.b3;
        if (i49Var2 == null || i49Var2.getReactionsWindow() == null || this.b3.getReactionsWindow().q) {
            h58 h58Var = this.L1;
            if (h58Var != null && (h58Var.U0() || this.L1.Z3)) {
                int measuredHeight = this.L1.getEmojiView().getMeasuredHeight();
                h58 h58Var2 = this.L1;
                if (measuredHeight == 0) {
                    i3 = h58Var2.getEmojiPadding();
                } else if (h58Var2.o4) {
                    h58Var2.Q();
                    i3 = this.L1.getStickersExpandedHeight();
                } else {
                    i3 = h58Var2.getVisibleEmojiPadding();
                }
            }
        } else {
            this.b3.getReactionsWindow().c.animate().translationY(-this.i2).setDuration(250L).setInterpolator(hb.w).start();
            i3 = 0;
        }
        boolean z2 = this.f2;
        int i4 = this.Y1;
        l68 l68Var = this.Y0;
        byte b2 = 1;
        if (i4 != i3) {
            this.f2 = false;
            n68 n68Var = this.y1;
            if (i3 <= 0 || !this.u1) {
                f = 8.0f;
                h58 h58Var3 = this.L1;
                if (h58Var3 != null) {
                    lcb.N(this.l1, n68Var.a, h58Var3.getEditText());
                }
            } else {
                this.f2 = true;
                this.S2 = false;
                this.d2 = i3;
                if (this.P1 == null) {
                    f = 8.0f;
                    i49 i49Var3 = new i49(1, this.m2, new pu0(this.l0, (byte) 6), getContext(), LaunchActivity.Q());
                    this.P1 = i49Var3;
                    i49Var3.setHint(ob6.M0(this.o1 ? 2131744320 : 2131744157, null));
                    i49 i49Var4 = this.P1;
                    i49Var4.O0 = true;
                    addView(i49Var4, this.s0, tre.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.P1.setDelegate(new r58(this));
                    this.P1.m(null, null, true);
                } else {
                    f = 8.0f;
                }
                this.P1.setFragment(LaunchActivity.Q());
                this.P1.setHint(ob6.M0(this.o1 ? 2131744320 : 2131744157, null));
                s49 s49Var = s49.B;
                if (s49Var != null) {
                    s49Var.l = true;
                }
                s49 s49Var2 = s49.C;
                if (s49Var2 != null) {
                    s49Var2.l = true;
                }
            }
            h58 h58Var4 = this.L1;
            if (h58Var4 != null) {
                h58Var4.b2(n68Var.f && !v0(true) && this.f2, true);
            }
            if (this.f2 && (j58Var = this.N2) != null) {
                j58Var.setVisibility(0);
            }
            if (!this.f2 && (i49Var = this.P1) != null) {
                i49Var.k();
            }
            l68Var.setEnabled(!this.f2);
            if (this.L1 != null) {
                hl.T3(null, !this.f2, 0.1f, true, true);
            }
            if (this.u1 && this.f2) {
                lcb lcbVar2 = ((ccb) this.A1).d;
                if (!lcbVar2.y) {
                    lcbVar2.y = true;
                    lcbVar2.U();
                }
            }
            this.Y1 = i3;
            ValueAnimator valueAnimator = this.Z1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.x2.d();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r2, i3);
            this.Z1 = ofFloat;
            ofFloat.addUpdateListener(new y48(this, b));
            this.Z1.addListener(new f58(this, b2));
            boolean z3 = this.f2;
            ValueAnimator valueAnimator2 = this.Z1;
            if (z3) {
                valueAnimator2.setDuration(250L);
                this.Z1.setInterpolator(hb.w);
                lcbVar.i();
            } else {
                valueAnimator2.setDuration(500L);
                this.Z1.setInterpolator(k43.h);
            }
            this.Z1.start();
            boolean z4 = this.f2;
            if (z4 != z2) {
                if (z4) {
                    fp fpVar = this.z1;
                    Canvas canvas = (Canvas) fpVar.b;
                    Bitmap bitmap = (Bitmap) fpVar.c;
                    w0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (hl.B(hl.I0(bitmap)) < 0.15f) {
                        canvas.drawColor(vm2.o(-1, jn7.m1));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (n68Var.f) {
                        kg5 kg5Var = this.N1;
                        if (kg5Var != null) {
                            if (!kg5Var.W) {
                                removeView(kg5Var);
                            }
                        }
                        if (!v0(true) && uc7.e1().getInt("taptostoryhighlighthint", 0) < 3) {
                            uc7.e1().edit().putInt("taptostoryhighlighthint", uc7.e1().getInt("taptostoryhighlighthint", 0) + 1).apply();
                            kg5 kg5Var2 = new kg5(getContext(), 3);
                            this.N1 = kg5Var2;
                            kg5Var2.t(ob6.M0(2131748567, null));
                            this.N1.setPadding(hl.L(f), 0, hl.L(f), 0);
                            kg5 kg5Var3 = this.N1;
                            kg5Var3.L = Layout.Alignment.ALIGN_OPPOSITE;
                            kg5Var3.r0 = new ql7(this, kg5Var2, (byte) 29);
                            addView(kg5Var3, tre.e(-1, 100, 87));
                            this.N1.v();
                            j1();
                        }
                    }
                } else {
                    h58 h58Var5 = this.L1;
                    if (h58Var5 != null) {
                        h58Var5.getEditField().clearFocus();
                    }
                    kg5 kg5Var4 = this.N1;
                    if (kg5Var4 != null) {
                        kg5Var4.f(true);
                    }
                }
                this.e2 = true;
            } else {
                this.e2 = false;
            }
        } else {
            f = 8.0f;
        }
        h58 h58Var6 = this.L1;
        if (h58Var6 != null && h58Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.L1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        u58 u58Var = this.M0;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) u58Var.getLayoutParams();
        layoutParams2.height = size2;
        boolean z5 = size - size2 > hl.L(64.0f);
        this.h2 = z5;
        int L2 = (size - ((z5 ? hl.L(64.0f) : 0) + size2)) >> 1;
        layoutParams2.topMargin = L2;
        if (this.h2) {
            this.u2 = (((-L2) + size) - size2) - hl.L(64.0f);
        } else {
            this.u2 = ((-L2) + size) - size2;
        }
        if (this.h2 != this.g2) {
            u58Var.setLayoutParams(layoutParams2);
        }
        p58 p58Var = this.G1;
        if (p58Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) p58Var.getLayoutParams();
            if (this.h2) {
                layoutParams3.topMargin = hl.L(f) + L2 + size2;
            } else {
                layoutParams3.topMargin = (L2 + size2) - hl.L(48.0f);
            }
        }
        xb xbVar = this.L2;
        if (xbVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) xbVar.getLayoutParams();
            boolean z6 = this.h2;
            xb xbVar2 = this.L2;
            if (z6) {
                c = 0;
                xbVar2.setTextColor(vm2.f(0.5f, -16777216, -1));
                layoutParams4.topMargin = hl.L(12.0f) + L2 + size2;
                qVar = this.t2;
                if (qVar != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) qVar.getLayoutParams();
                    if (i3 == 0) {
                        layoutParams5.bottomMargin = uh9.f(64.0f, L2 + size2, size);
                    } else {
                        layoutParams5.bottomMargin = hl.L(64.0f) + i3;
                    }
                }
                z = this.h2;
                z58 z58Var = this.u0;
                LinearLayout linearLayout = this.y0;
                if (z) {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((L2 + size2) - hl.L(12.0f)) - hl.L(40.0f);
                    int L3 = this.m1 ? hl.L(40.0f) : hl.L(56.0f);
                    ((FrameLayout.LayoutParams) z58Var.getLayoutParams()).bottomMargin = L3;
                    if (this.g2 != this.h2) {
                        z58Var.setLayoutParams((FrameLayout.LayoutParams) z58Var.getLayoutParams());
                    }
                    z58Var.u0 = L3;
                } else {
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = hl.L(12.0f) + L2 + size2;
                    ((FrameLayout.LayoutParams) z58Var.getLayoutParams()).bottomMargin = hl.L(f);
                    if (this.g2 != this.h2) {
                        z58Var.setLayoutParams((FrameLayout.LayoutParams) z58Var.getLayoutParams());
                    }
                    z58Var.u0 = hl.L(f);
                }
                this.F2 = true;
                L = hl.L(48.0f);
                if (this.m0.getVisibility() == 0) {
                    L += hl.L(60.0f);
                }
                if (this.i0.getVisibility() == 0) {
                    L += hl.L(40.0f);
                }
                ff0 ff0Var = l68Var.b;
                TextView[] textViewArr = l68Var.c;
                layoutParams = (FrameLayout.LayoutParams) ff0Var.getLayoutParams();
                if (layoutParams.rightMargin != L) {
                    int i5 = (int) L;
                    layoutParams.rightMargin = i5;
                    ((FrameLayout.LayoutParams) textViewArr[c].getLayoutParams()).rightMargin = i5;
                    ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i5;
                    l68Var.forceLayout();
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                this.g2 = this.h2;
            }
            xbVar2.setTextColor(vm2.o(-1, jn7.U2));
            layoutParams4.topMargin = ((L2 + size2) - hl.L(12.0f)) - hl.L(40.0f);
        }
        c = 0;
        qVar = this.t2;
        if (qVar != null) {
        }
        z = this.h2;
        z58 z58Var2 = this.u0;
        LinearLayout linearLayout2 = this.y0;
        if (z) {
        }
        this.F2 = true;
        L = hl.L(48.0f);
        if (this.m0.getVisibility() == 0) {
        }
        if (this.i0.getVisibility() == 0) {
        }
        ff0 ff0Var2 = l68Var.b;
        TextView[] textViewArr2 = l68Var.c;
        layoutParams = (FrameLayout.LayoutParams) ff0Var2.getLayoutParams();
        if (layoutParams.rightMargin != L) {
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.g2 = this.h2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a2 = -1.0f;
        this.F2 = true;
        invalidate();
    }

    public final void p0() {
        if (this.Q1 != null) {
            return;
        }
        if (this.L1 == null) {
            l0();
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
        this.R1.setText(ob6.M0(this.o1 ? 2131744319 : 2131744147, null));
        TextView textView2 = new TextView(getContext());
        this.S1 = textView2;
        textView2.setTextColor(-1);
        this.S1.setTextSize(1, 12.0f);
        TextView textView3 = this.S1;
        int L = hl.L(40.0f);
        textView3.setBackground(aob.i0(L, L, L, L, 452984831, 855638015, 855638015));
        this.S1.setGravity(17);
        iye.a(this.S1);
        this.S1.setText(ob6.M0(2131744146, null));
        this.S1.setPadding(hl.L(7.0f), 0, hl.L(7.0f), 0);
        this.Q1.addView(imageView, tre.t(22, 22, 16, 12, 1, 4, 0));
        this.Q1.addView(this.R1, tre.s(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.Q1.addView(this.S1, tre.s(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.L1.addView(this.Q1, tre.d(-1, -1.0f, jn7.D1, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void q0() {
        if (this.L2 != null) {
            return;
        }
        xb xbVar = new xb(getContext(), (byte) 29);
        this.L2 = xbVar;
        xbVar.setTextSize(1, 14.0f);
        this.L2.setTextColor(vm2.f(0.5f, -16777216, -1));
        this.L2.setGravity(19);
        this.L2.setText(ob6.M0(2131744145, null));
        addView(this.L2, tre.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0() {
        if (this.G1 != null) {
            return;
        }
        p58 p58Var = new p58(this, getContext(), (byte) 0);
        this.G1 = p58Var;
        p58Var.setClickable(true);
        addView(this.G1, tre.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        a81 a81Var = new a81(this, getContext());
        this.p2 = a81Var;
        a81Var.setOnClickListener(new v48(this, (byte) 8));
        this.G1.addView(this.p2, tre.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        mz1 mz1Var = new mz1((byte) 1, getContext(), 0 == true ? 1 : 0);
        this.l2 = mz1Var;
        mz1Var.setAvatarsTextSize(hl.L(18.0f));
        this.G1.addView(this.l2, tre.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.k2 = textView;
        textView.setTextSize(1, 14.0f);
        this.k2.setTextColor(-1);
        this.G1.addView(this.k2, tre.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.h1.s);
        a81 a81Var2 = this.p2;
        int L = hl.L(15.0f);
        int o = vm2.o(-1, jn7.E1);
        a81Var2.setBackground(aob.i0(L, L, L, L, 0, o, o));
        imageView.setBackground(aob.N(vm2.o(-1, jn7.E1), -hl.L(2.0f), -hl.L(2.0f)));
    }

    public final void s0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (A0() || this.y1.f) {
            return;
        }
        boolean p = yac.h(this.m2).p();
        x53 x53Var = this.l0;
        if (p) {
            s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, ob6.M0(2131744544, null), false, x53Var).setOnClickListener(new v48(this, (byte) 12));
            return;
        }
        Drawable drawable = getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(vm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        d58 d58Var = new d58(getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, (byte) 0);
        b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, ob6.M0(2131744544, null), false, x53Var);
        c.setOnClickListener(new v48(this, (byte) 13));
        c.setIcon(d58Var);
    }

    public void setAccount(int i) {
        this.m2 = i;
        this.C1 = uc7.s1(i).e0;
        this.U0.b = i;
        i49 i49Var = this.P1;
        if (i49Var != null) {
            i49Var.setCurrentAccount(i);
            this.P1.m(null, null, true);
        }
        i49 i49Var2 = this.b3;
        if (i49Var2 != null) {
            i49Var2.setCurrentAccount(i);
        }
    }

    public void setActive(boolean z) {
        O0(0L, z);
    }

    public void setDelegate(k68 k68Var) {
        this.A1 = k68Var;
    }

    public void setIsVisible(boolean z) {
        if (this.P2 != z) {
            this.P2 = z;
            if (z) {
                this.O0.i1 = 1.0f;
                h0(false);
            }
        }
    }

    public void setLongpressed(boolean z) {
        if (this.u1) {
            this.v2 = z;
            invalidate();
        }
    }

    public void setOffset(float f) {
        boolean z = f == 0.0f;
        if (this.L0 != z) {
            this.L0 = z;
            this.M0.invalidate();
            if (this.u1 && this.t0.a && Build.VERSION.SDK_INT < 33) {
                li7 li7Var = this.F3;
                if (z) {
                    hl.r(li7Var);
                    hl.d3(li7Var, 250L);
                } else {
                    hl.r(li7Var);
                    lcb lcbVar = ((ccb) this.A1).d;
                    lcbVar.l1 = true;
                    lcbVar.U();
                }
            }
        }
    }

    public void setPaused(boolean z) {
        if (this.B1 != z) {
            this.B1 = z;
            nl nlVar = this.O0;
            if (z) {
                nlVar.x0();
                nlVar.u0 = false;
            } else {
                nlVar.w0(false);
                nlVar.u0 = true;
            }
            this.H0 = 0L;
            this.M0.invalidate();
        }
    }

    public final void t0() {
        if (this.K2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0(2131744107, null));
        int i = aob.G6;
        x53 x53Var = this.l0;
        yob.X(textView, i, x53Var);
        TextView textView2 = new TextView(getContext());
        iye.a(textView2);
        textView2.setText(ob6.M0(2131754223, null));
        int i2 = aob.Ji;
        yob.X(textView2, i2, x53Var);
        textView2.setPadding(hl.L(16.0f), hl.L(12.0f), hl.L(16.0f), hl.L(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(hl.o());
        textView2.setTextSize(1, 15.0f);
        int L = hl.L(8.0f);
        int i3 = aob.Fi;
        int v0 = aob.v0(i3, x53Var);
        int o = vm2.o(aob.v0(i2, x53Var), 30);
        hf0 i0 = aob.i0(L, L, L, L, v0, o, o);
        uob M = yob.M(i3);
        uob g = yob.g(i2, 30);
        textView2.setBackground(i0);
        yob.j(textView2, i0, M, g, x53Var);
        textView2.setOnClickListener(new v48(this, (byte) 6));
        linearLayout.addView(textView, tre.o(-1, -2));
        linearLayout.addView(textView2, tre.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, tre.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.M0.addView(frameLayout);
        this.K2 = frameLayout;
    }

    public final void u0() {
        byte b = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.l0, getContext());
        String M0 = ob6.M0(A0() ? 2131751529 : 2131751452, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(A0() ? 2131751530 : 2131751453, null);
        alertDialog$Builder.j(ob6.M0(2131751563, null), new s48(this, b));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new ku7((byte) 17));
        ((ccb) this.A1).h(idVar);
        idVar.h();
    }

    public final boolean v0(boolean z) {
        w96 w96Var;
        TLRPC.Peer l;
        long e = yac.h(this.m2).e();
        long j = this.l1;
        lcb lcbVar = this.t0;
        if (j >= 0) {
            if (lcbVar == null || (w96Var = lcbVar.B0) == null || !w96Var.o()) {
                return false;
            }
            return !z || (l = lcbVar.B0.l()) == null || this.l1 == wf3.n(l) || wf3.n(l) == e || this.l1 == e;
        }
        w96 w96Var2 = lcbVar.B0;
        if (w96Var2 == null || !z) {
            return false;
        }
        TLRPC.Peer l2 = w96Var2.l();
        TLRPC.Chat M0 = uc7.s1(this.m2).M0(Long.valueOf(-this.l1));
        if (lcbVar.B0.o() || xc2.w(14, M0)) {
            return l2 == null || this.l1 == wf3.n(l2) || wf3.n(l2) == yac.h(this.m2).e();
        }
        return false;
    }

    public final void w0(Canvas canvas, int i, int i2) {
        d30 d30Var = this.w2;
        if (((jx) d30Var.e) != null) {
            if (((SurfaceView) d30Var.d) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                if (Build.VERSION.SDK_INT >= 24) {
                    hl.y0((SurfaceView) d30Var.d, createBitmap);
                }
                if (createBitmap != null) {
                    canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                    return;
                }
                return;
            }
            TextureView textureView = (TextureView) d30Var.f;
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
        u58 u58Var = this.M0;
        canvas.scale(i / u58Var.getMeasuredWidth(), i2 / u58Var.getMeasuredHeight());
        this.O0.h(canvas, null);
        canvas.restore();
    }

    public final void x0(u9b u9bVar, TL_stories.StoryItem storyItem) {
        k68 k68Var = this.A1;
        w9b w9bVar = new w9b(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.l0);
        w9bVar.S0(u9bVar);
        ir1 ir1Var = w9bVar.l1;
        if (ir1Var != null) {
            for (View view : ir1Var.getViewPages()) {
                if (view instanceof r9b) {
                    ((r9b) view).f(false);
                }
            }
        }
        w9bVar.M0(true);
        w9bVar.N1 = new rm6(this, storyItem, (byte) 27);
        ((ccb) k68Var).h(w9bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x017b, code lost:
    
        if (r3 == r10.P1) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y0(ViewGroup viewGroup, float f, float f2, boolean z) {
        kg5 kg5Var;
        d30 d30Var;
        jx jxVar;
        if (viewGroup != null) {
            kg5 kg5Var2 = this.p0;
            if ((kg5Var2 == null || !kg5Var2.W) && ((kg5Var = this.q0) == null || !kg5Var.W)) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        z58 z58Var = this.u0;
                        if (childAt == z58Var) {
                            Rect rect = hl.Q;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f, (int) f2)) {
                                float top = f2 - childAt.getTop();
                                f7b f7bVar = z58Var.b0;
                                if (f7bVar.x == 1.0f && !z58Var.s0) {
                                    if (top > f7bVar.getTranslationY() + (z58Var.r0.getTop() - z58Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = hl.Q;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.M0 || (d30Var = this.w2) == null || (jxVar = (jx) d30Var.e) == null || !y0(jxVar, f - childAt.getX(), f2 - childAt.getY(), z)) && (!childAt.isClickable() || !rect2.contains((int) f, (int) f2))) {
                            s58 s58Var = this.T0;
                            if (childAt == s58Var && s58Var.b == null && (f < hl.L(60.0f) || f > viewGroup.getMeasuredWidth() - hl.L(60.0f))) {
                                Matrix matrix = s58Var.e;
                                float[] fArr = s58Var.f;
                                for (int i2 = 0; i2 < s58Var.getChildCount(); i2++) {
                                    View childAt2 = s58Var.getChildAt(i2);
                                    if (childAt2 != s58Var.d && (childAt2 instanceof aab)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f;
                                        fArr[1] = f2;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] >= childAt2.getLeft() && fArr[0] <= childAt2.getRight() && fArr[1] >= childAt2.getTop() && fArr[1] <= childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                c58 c58Var = this.v0;
                                if (childAt == c58Var) {
                                    qob qobVar = c58Var.f;
                                    gu guVar = c58Var.c;
                                    qob qobVar2 = c58Var.f;
                                    qobVar.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f - c58Var.getX()) - qobVar2.getX()), (int) ((f2 - c58Var.getY()) - qobVar2.getY()))) {
                                        if (c58Var.g0) {
                                            continue;
                                        } else if (!this.f2) {
                                            if (f2 <= c58Var.r() + c58Var.getY() && guVar.F(f, (f2 - c58Var.getY()) - guVar.getY()) == null) {
                                            }
                                        }
                                    }
                                } else {
                                    if (this.f2) {
                                        if (childAt == this.L1 && f2 > rect2.top) {
                                        }
                                    }
                                    if (!z) {
                                        if (rect2.contains((int) f, (int) f2)) {
                                            if (!childAt.isClickable()) {
                                            }
                                            if (childAt.isEnabled()) {
                                            }
                                            h58 h58Var = this.L1;
                                            if (h58Var != null && childAt == h58Var.getRecordCircle()) {
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
        u58 u58Var = this.M0;
        float x2 = view.getX() + u58Var.getX() + x;
        float y = view.getY() + u58Var.getY() + getY();
        return motionEvent.getX() >= x2 && motionEvent.getX() <= x2 + ((float) view.getWidth()) && motionEvent.getY() >= y && motionEvent.getY() <= y + ((float) view.getHeight());
    }
}
