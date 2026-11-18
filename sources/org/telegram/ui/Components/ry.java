package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class ry extends FrameLayout implements org.telegram.ui.ActionBar.c6, te.b, org.telegram.messenger.fs, rh.a {
    public static final /* synthetic */ int V2 = 0;
    public final my A0;
    public final LongSparseArray A1;
    public final GradientDrawable A2;
    public final qv B0;
    public int B1;
    public int B2;
    public final fw C0;
    public final iu C1;
    public ArrayList C2;
    public final gw D0;
    public final int D1;
    public int D2;
    public final ImageView E;
    public final aw E0;
    public final int[] E1;
    public long E2;
    public final ImageView F;
    public final bw F0;
    public int F1;
    public final te.a F2;
    public AnimatorSet G;
    public py G0;
    public int G1;
    public ArrayList G2;
    public AnimatorSet H;
    public final ew H0;
    public int H1;
    public Drawable H2;
    public float I;
    public final ph.c I0;
    public int I1;
    public int I2;
    public final ww J;
    public boolean J0;
    public int J1;
    public int J2;
    public final rw K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final org.telegram.ui.y61 L;
    public boolean L0;
    public boolean L1;
    public int L2;
    public final ph.a M;
    public final lx M0;
    public int M1;
    public boolean M2;
    public final org.telegram.ui.y61 N;
    public AnimatorSet N0;
    public final bg.r0 N1;
    public xi.e N2;
    public final ph.a O;
    public final di.xb O0;
    public boolean O1;
    public xi.e O2;
    public final View P;
    public yw P0;
    public int P1;
    public boolean P2;
    public final ex Q;
    public boolean Q0;
    public boolean Q1;
    public AnimatorSet Q2;
    public final sw R;
    public final int[] R0;
    public boolean R1;
    public h2.m0 R2;
    public final bx S;
    public final ObjectAnimator[] S0;
    public zx S1;
    public final mv S2;
    public final qx T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public py U;
    public jg.d1 U0;
    public float U1;
    public boolean U2;
    public final ph.c V;
    public boolean V0;
    public float V1;
    public final sv W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.h2 Z1;
    public final te.a a;
    public AnimatorSet a0;
    public final Drawable[] a1;
    public final org.telegram.ui.ActionBar.i6 a2;
    public final te.a b;
    public final org.telegram.ui.ActionBar.l5 b0;
    public final String[] b1;
    public final org.telegram.ui.ActionBar.w5 b2;
    public int c;
    public final org.telegram.ui.ActionBar.l5 c0;
    public final int c1;
    public final org.telegram.ui.ActionBar.w5 c2;
    public final ArrayList d;
    public boolean d0;
    public final int d1;
    public final boolean d2;
    public final ArrayList e;
    public final boolean e0;
    public final ArrayList e1;
    public LongSparseArray e2;
    public boolean f;
    public boolean f0;
    public int f1;
    public PorterDuffColorFilter f2;
    public boolean g0;
    public int g1;
    public final gk g2;
    public final hw h;
    public final uv h0;
    public boolean h1;
    public final nw h2;
    public final vv i0;
    public TLRPC.TL_messages_stickerSet i1;
    public boolean i2;
    public final wx j0;
    public ArrayList j1;
    public final boolean j2;
    public final vx k0;
    public ArrayList k1;
    public final dh.g k2;
    public final yx l0;
    public ArrayList l1;
    public final ih l2;
    public final HashMap m0;
    public ArrayList m1;
    public final ui.c m2;
    public final FrameLayout n;
    public final qv n0;
    public final ArrayList n1;
    public final dh.c n2;
    public final vx o0;
    public final ArrayList o1;
    public final ri.q o2;
    public final xv p0;
    public final ArrayList p1;
    public boolean p2;
    public final zw q0;
    public final ArrayList q1;
    public boolean q2;
    public final FrameLayout r;
    public boolean r0;
    public final ArrayList r1;
    public int r2;
    public final FrameLayout s;
    public int s0;
    public final HashMap s1;
    public float s2;
    public int t0;
    public final Paint t1;
    public View t2;
    public int u0;
    public rx u1;
    public int u2;
    public boolean v0;
    public long v1;
    public int v2;
    public final View w;
    public boolean w0;
    public boolean w1;
    public long w2;
    public final bc0 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final iw y;
    public final yv y0;
    public final TLRPC.StickerSetCovered[] y1;
    public boolean y2;
    public final jy z0;
    public final LongSparseArray z1;
    public final Rect z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [org.telegram.ui.Components.oj0, org.telegram.ui.Components.qv] */
    /* JADX WARN: Type inference failed for: r4v84, types: [org.telegram.ui.Components.oj0, org.telegram.ui.Components.qv] */
    public ry(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.i6 i6Var, boolean z15, boolean z16) {
        super(context);
        mv mvVar;
        boolean z17;
        rw rwVar;
        int i7;
        boolean z18;
        Context context2;
        final org.telegram.ui.ActionBar.i6 i6Var2;
        ri.q qVar;
        bx bxVar;
        int i10;
        int i11;
        int i12;
        boolean z19;
        Field field;
        boolean z20;
        bx bxVar2;
        boolean z21;
        lr lrVar = lr.h;
        this.a = new te.a(0, this, lrVar, 320L, false);
        this.b = new te.a(1, this, lrVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.d0 = true;
        this.l0 = new yx(this);
        this.m0 = new HashMap();
        this.r0 = true;
        this.s0 = -2;
        this.t0 = -2;
        this.u0 = -2;
        this.v0 = true;
        this.x0 = true;
        this.J0 = true;
        this.R0 = new int[3];
        this.S0 = new ObjectAnimator[3];
        int i13 = org.telegram.messenger.j10.t0;
        this.d1 = i13;
        this.e1 = new ArrayList();
        this.j1 = new ArrayList();
        this.k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        this.n1 = new ArrayList();
        this.o1 = new ArrayList();
        new ArrayList();
        this.p1 = new ArrayList();
        this.q1 = new ArrayList();
        this.r1 = new ArrayList();
        this.s1 = new HashMap();
        this.y1 = new TLRPC.StickerSetCovered[10];
        this.z1 = new LongSparseArray();
        this.A1 = new LongSparseArray();
        this.E1 = new int[2];
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.J1 = -2;
        this.M1 = -1;
        this.g2 = new gk(this, 5);
        this.h2 = new nw(this);
        this.i2 = true;
        ri.q qVar2 = new ri.q();
        this.o2 = qVar2;
        this.s2 = -1.0f;
        this.u2 = -1;
        this.v2 = -1;
        this.w2 = -1L;
        this.x2 = false;
        this.y2 = true;
        this.z2 = new Rect();
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new te.a(0, new nv(this, 3), lrVar, 380L, true);
        this.S2 = new mv(this, 1);
        this.T2 = false;
        this.v0 = z14;
        this.Z1 = h2Var;
        this.d2 = z10;
        this.a2 = i6Var;
        this.j2 = z16;
        ui.c cVar = new ui.c();
        this.m2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.n6.d6));
        if (z15) {
            u(true);
        }
        i0.a.o(z(org.telegram.ui.ActionBar.n6.Nl), 30);
        int L = org.telegram.messenger.g0.L(50.0f);
        this.c1 = L;
        this.e0 = z13;
        this.Y0 = new Drawable[]{org.telegram.ui.ActionBar.n6.W(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf)), org.telegram.ui.ActionBar.n6.W(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf)), org.telegram.ui.ActionBar.n6.W(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf))};
        org.telegram.ui.ActionBar.w5 W = org.telegram.ui.ActionBar.n6.W(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf));
        org.telegram.ui.ActionBar.w5 W2 = org.telegram.ui.ActionBar.n6.W(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf));
        org.telegram.ui.ActionBar.w5 W3 = org.telegram.ui.ActionBar.n6.W(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf));
        org.telegram.ui.ActionBar.w5 W4 = org.telegram.ui.ActionBar.n6.W(context, R.drawable.emoji_tabs_new1, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf));
        this.b2 = W4;
        int i14 = org.telegram.ui.ActionBar.n6.If;
        org.telegram.ui.ActionBar.w5 W5 = org.telegram.ui.ActionBar.n6.W(context, R.drawable.emoji_tabs_new2, z(i14), z(i14));
        this.c2 = W5;
        this.Z0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.a1 = new Drawable[]{org.telegram.ui.ActionBar.n6.W(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf)), org.telegram.ui.ActionBar.n6.W(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf))};
        this.b1 = new String[]{org.telegram.messenger.gd.M0(2131751184, null), org.telegram.messenger.gd.M0(2131751183, null), org.telegram.messenger.gd.M0(2131751182, null), org.telegram.messenger.gd.M0(2131751181, null), org.telegram.messenger.gd.M0(2131751180, null), org.telegram.messenger.gd.M0(2131751179, null), org.telegram.messenger.gd.M0(2131751178, null), org.telegram.messenger.gd.M0(2131751177, null)};
        this.K1 = chatFull;
        Paint paint = new Paint(1);
        this.t1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.n6.Sf));
        float L2 = org.telegram.messenger.g0.L(6.0f);
        bg.q0 q0Var = bg.u0.a;
        this.N1 = new bg.r0(L2);
        rw rwVar2 = new rw(this, context);
        this.K = rwVar2;
        ny nyVar = new ny();
        nyVar.a = 0;
        nyVar.b = rwVar2;
        arrayList.add(nyVar);
        if (z10) {
            org.telegram.messenger.ri.d0(i13).D(5);
            org.telegram.messenger.ri.d0(i13).y();
            this.f2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.n6.Fi), PorterDuff.Mode.SRC_IN);
        }
        ex exVar = new ex(this, context);
        this.Q = exVar;
        qVar2.b(exVar);
        v4.k kVar = new v4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = lr.g;
        exVar.setItemAnimator(kVar);
        final int i15 = 0;
        exVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ov
            public final /* synthetic */ ry b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i15) {
                    case 0:
                        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                        ry ryVar = this.b;
                        ex exVar2 = ryVar.Q;
                        ryVar.getMeasuredHeight();
                        return p10.r(motionEvent, exVar2, null, ryVar.h2, i6Var);
                    case 1:
                        org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                        ry ryVar2 = this.b;
                        return p11.r(motionEvent, ryVar2.i0, ryVar2.n0, ryVar2.h2, i6Var);
                    default:
                        org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                        ry ryVar3 = this.b;
                        aw awVar = ryVar3.E0;
                        ryVar3.getMeasuredHeight();
                        return p12.r(motionEvent, awVar, ryVar3.B0, ryVar3.h2, i6Var);
                }
            }
        });
        exVar.setOnItemLongClickListener(new nv(this, 1));
        exVar.setInstantClick(true);
        sw swVar = new sw(this);
        this.R = swVar;
        exVar.setLayoutManager(swVar);
        exVar.setTopGlowOffset(org.telegram.messenger.g0.L(38.0f));
        exVar.setBottomGlowOffset(org.telegram.messenger.g0.L(36.0f));
        exVar.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f));
        int i16 = org.telegram.ui.ActionBar.n6.zf;
        org.telegram.ui.ActionBar.u6.l(exVar, 21, i16, i6Var);
        exVar.setItemSelectorColorProvider(new k2(23));
        exVar.setClipToPadding(false);
        swVar.O = new tw(this);
        bx bxVar3 = new bx(this);
        this.S = bxVar3;
        exVar.setAdapter(bxVar3);
        exVar.i(new ai.i0(this, 4));
        this.T = new qx(this, context);
        rwVar2.addView(exVar, c8.ma.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(exVar, swVar);
        this.c0 = l5Var;
        l5Var.r = new uw(this);
        exVar.setOnScrollListener(new vw(this));
        if (h2Var != null) {
            mvVar = new mv(this, 2);
            rwVar = rwVar2;
            i7 = -1;
            z18 = z16;
            context2 = context;
            i6Var2 = i6Var;
            qVar = qVar2;
            bxVar = bxVar3;
            i10 = i14;
            i11 = 5;
            z17 = z10;
        } else {
            mvVar = null;
            z17 = z10;
            rwVar = rwVar2;
            i7 = -1;
            z18 = z16;
            context2 = context;
            i6Var2 = i6Var;
            qVar = qVar2;
            bxVar = bxVar3;
            i10 = i14;
            i11 = 5;
        }
        ww wwVar = new ww(this, context2, i6Var2, z17, mvVar, z18);
        this.J = wwVar;
        if (z13) {
            sv svVar = new sv(this, context2);
            this.W = svVar;
            rwVar.addView(svVar, new FrameLayout.LayoutParams(i7, org.telegram.messenger.g0.f1() + L));
            svVar.d.setOnFocusChangeListener(new tv(this));
            ph.c cVar2 = new ph.c(context2, i6Var2);
            this.V = cVar2;
            cVar2.setVisibility(8);
            final int i17 = 0;
            cVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pv
                public final /* synthetic */ ry b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            qx qxVar = this.b.T;
                            mx mxVar = qxVar.c;
                            int childCount = mxVar.getChildCount();
                            for (int i18 = 0; i18 < childCount; i18++) {
                                ((ph.b) mxVar.getChildAt(i18)).a(false, true);
                            }
                            qxVar.d = 0L;
                            qxVar.G.b.a(false, true);
                            qxVar.f();
                            break;
                        case 1:
                            my myVar = this.b.A0;
                            mx mxVar2 = myVar.c;
                            int childCount2 = mxVar2.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((ph.b) mxVar2.getChildAt(i19)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.R.a.a(false, true);
                            myVar.f();
                            break;
                        case 2:
                            rx rxVar = this.b.u1;
                            if (rxVar != null) {
                                rxVar.w();
                                break;
                            }
                            break;
                        default:
                            ry ryVar = this.b;
                            int currentItem = ryVar.h.getCurrentItem();
                            ey eyVar = currentItem == 0 ? ryVar.W : currentItem == 1 ? ryVar.p0 : ryVar.H0;
                            if (eyVar != null) {
                                gq gqVar = eyVar.d;
                                gqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            rwVar.addView(cVar2, new FrameLayout.LayoutParams(i7, L));
        }
        if (Color.alpha(z(i16)) >= 255) {
            org.telegram.ui.ActionBar.u6.h(i16, wwVar, i6Var2);
        }
        bxVar.G(true);
        wwVar.p(getEmojipacks());
        rwVar.addView(wwVar, c8.ma.c(36.0f, i7));
        View view = new View(context2);
        this.P = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i18 = org.telegram.ui.ActionBar.n6.Cf;
        org.telegram.ui.ActionBar.u6.h(i18, view, i6Var2);
        bx bxVar4 = bxVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(36.0f);
        rwVar.addView(view, layoutParams);
        ph.a aVar = new ph.a(context2, i6Var2);
        this.M = aVar;
        org.telegram.ui.y61 y61Var = new org.telegram.ui.y61(context2, i6Var2);
        this.L = y61Var;
        y61Var.setVisibility(8);
        y61Var.addView(aVar, c8.ma.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        rwVar.addView(y61Var, c8.ma.e(i7, -2, 80));
        if (z11) {
            dl0 dl0Var = dl0.b;
            if (z12) {
                uv uvVar = new uv(this, context2);
                this.h0 = uvVar;
                ny nyVar2 = new ny();
                nyVar2.a = 1;
                nyVar2.b = uvVar;
                this.d.add(nyVar2);
                vv vvVar = new vv(this, context2);
                this.i0 = vvVar;
                qVar.b(vvVar);
                vvVar.setClipToPadding(false);
                wx wxVar = new wx(this);
                this.j0 = wxVar;
                vvVar.setLayoutManager(wxVar);
                vvVar.i(new wv(this));
                vvVar.setPadding(0, L, 0, org.telegram.messenger.g0.L(44.0f) + this.r2);
                ((v4.h1) vvVar.getItemAnimator()).m = false;
                final int i19 = 1;
                vx vxVar = new vx(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.o0 = vxVar;
                vvVar.setAdapter(vxVar);
                this.k0 = new vx(this, context2, false, 0);
                vvVar.setOnScrollListener(new qy(this, 2));
                vvVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ov
                    public final /* synthetic */ ry b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                                ry ryVar = this.b;
                                ex exVar2 = ryVar.Q;
                                ryVar.getMeasuredHeight();
                                return p10.r(motionEvent, exVar2, null, ryVar.h2, i6Var2);
                            case 1:
                                org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                                ry ryVar2 = this.b;
                                return p11.r(motionEvent, ryVar2.i0, ryVar2.n0, ryVar2.h2, i6Var2);
                            default:
                                org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                                ry ryVar3 = this.b;
                                aw awVar = ryVar3.E0;
                                ryVar3.getMeasuredHeight();
                                return p12.r(motionEvent, awVar, ryVar3.B0, ryVar3.h2, i6Var2);
                        }
                    }
                });
                final int i20 = 0;
                ?? r10 = new oj0(this) { // from class: org.telegram.ui.Components.qv
                    public final /* synthetic */ ry b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.oj0
                    public final void c(int i21, View view2) {
                        switch (i20) {
                            case 0:
                                ry ryVar = this.b;
                                vv vvVar2 = ryVar.i0;
                                vx vxVar2 = ryVar.k0;
                                vx vxVar3 = ryVar.o0;
                                if (ryVar.u1 != null) {
                                    vxVar3.getClass();
                                    ArrayList arrayList2 = vxVar3.y;
                                    if (vvVar2.getAdapter() != vxVar3) {
                                        if (vvVar2.getAdapter() == vxVar2 && i21 >= 0 && i21 < vxVar2.y.size()) {
                                            ryVar.u1.v(view2, vxVar2.y.get(i21), vxVar2.x, vxVar2.n, true, 0, 0);
                                            ryVar.X();
                                            break;
                                        }
                                    } else if (i21 >= 0) {
                                        int i22 = vxVar3.I;
                                        if (i21 >= i22) {
                                            int i23 = i22 > 0 ? (i21 - i22) - 1 : i21;
                                            if (i23 >= 0 && i23 < arrayList2.size()) {
                                                ryVar.u1.v(view2, arrayList2.get(i23), null, vxVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            ryVar.u1.v(view2, ryVar.j1.get(i21), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                ry ryVar2 = this.b;
                                v4.i0 adapter = ryVar2.E0.getAdapter();
                                my myVar = ryVar2.A0;
                                String str = adapter == myVar ? myVar.O : null;
                                if (view2 instanceof org.telegram.ui.Cells.a8) {
                                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                    if (a8Var.getSticker() != null && org.telegram.messenger.fj.X3(a8Var.getSticker()) && !org.telegram.messenger.j10.i(org.telegram.messenger.c.a(ryVar2.d1).a).q()) {
                                        org.telegram.ui.ns.p().x(a8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.ns.p().t();
                                        if (!a8Var.r) {
                                            a8Var.r = true;
                                            a8Var.n = 0.5f;
                                            a8Var.y = 0L;
                                            org.telegram.ui.Cells.z7 z7Var = a8Var.a;
                                            z7Var.setAlpha(0.5f * a8Var.I);
                                            z7Var.invalidate();
                                            a8Var.s = System.currentTimeMillis();
                                            a8Var.invalidate();
                                            ryVar2.u1.m(a8Var, a8Var.getSticker(), str, a8Var.getParentObject(), a8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.n0 = r10;
                vvVar.setOnItemClickListener((oj0) r10);
                uvVar.addView(vvVar, c8.ma.c(-1.0f, -1));
                xv xvVar = new xv(this, context2);
                this.p0 = xvVar;
                uvVar.addView(xvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
                zw zwVar = new zw(this, context2, i6Var2);
                this.q0 = zwVar;
                zwVar.setType(dl0Var);
                zwVar.setUnderlineHeight(org.telegram.messenger.g0.f1());
                zwVar.setIndicatorColor(z(i10));
                zwVar.setUnderlineColor(z(i18));
                org.telegram.ui.ActionBar.u6.h(i16, zwVar, i6Var2);
                W();
                zwVar.setDelegate(new nv(this, 2));
                vxVar.F("", "", true, true, true);
            }
            yv yvVar = new yv(this, context2, z14);
            this.y0 = yvVar;
            org.telegram.messenger.ri.d0(this.d1).D(0);
            org.telegram.messenger.ri.d0(this.d1).z();
            aw awVar = new aw(this, context2);
            this.E0 = awVar;
            this.o2.b(awVar);
            bw bwVar = new bw(this);
            this.F0 = bwVar;
            awVar.setLayoutManager(bwVar);
            bwVar.O = new cw(this);
            awVar.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f));
            awVar.setClipToPadding(false);
            ny nyVar3 = new ny();
            nyVar3.a = 2;
            nyVar3.b = yvVar;
            this.d.add(nyVar3);
            this.A0 = new my(this, context2);
            jy jyVar = new jy(this, context2);
            this.z0 = jyVar;
            awVar.setAdapter(jyVar);
            final int i21 = 2;
            awVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ov
                public final /* synthetic */ ry b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i21) {
                        case 0:
                            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                            ry ryVar = this.b;
                            ex exVar2 = ryVar.Q;
                            ryVar.getMeasuredHeight();
                            return p10.r(motionEvent, exVar2, null, ryVar.h2, i6Var2);
                        case 1:
                            org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                            ry ryVar2 = this.b;
                            return p11.r(motionEvent, ryVar2.i0, ryVar2.n0, ryVar2.h2, i6Var2);
                        default:
                            org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                            ry ryVar3 = this.b;
                            aw awVar2 = ryVar3.E0;
                            ryVar3.getMeasuredHeight();
                            return p12.r(motionEvent, awVar2, ryVar3.B0, ryVar3.h2, i6Var2);
                    }
                }
            });
            final int i22 = 1;
            ?? r42 = new oj0(this) { // from class: org.telegram.ui.Components.qv
                public final /* synthetic */ ry b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.oj0
                public final void c(int i212, View view2) {
                    switch (i22) {
                        case 0:
                            ry ryVar = this.b;
                            vv vvVar2 = ryVar.i0;
                            vx vxVar2 = ryVar.k0;
                            vx vxVar3 = ryVar.o0;
                            if (ryVar.u1 != null) {
                                vxVar3.getClass();
                                ArrayList arrayList2 = vxVar3.y;
                                if (vvVar2.getAdapter() != vxVar3) {
                                    if (vvVar2.getAdapter() == vxVar2 && i212 >= 0 && i212 < vxVar2.y.size()) {
                                        ryVar.u1.v(view2, vxVar2.y.get(i212), vxVar2.x, vxVar2.n, true, 0, 0);
                                        ryVar.X();
                                        break;
                                    }
                                } else if (i212 >= 0) {
                                    int i222 = vxVar3.I;
                                    if (i212 >= i222) {
                                        int i23 = i222 > 0 ? (i212 - i222) - 1 : i212;
                                        if (i23 >= 0 && i23 < arrayList2.size()) {
                                            ryVar.u1.v(view2, arrayList2.get(i23), null, vxVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        ryVar.u1.v(view2, ryVar.j1.get(i212), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            ry ryVar2 = this.b;
                            v4.i0 adapter = ryVar2.E0.getAdapter();
                            my myVar = ryVar2.A0;
                            String str = adapter == myVar ? myVar.O : null;
                            if (view2 instanceof org.telegram.ui.Cells.a8) {
                                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                if (a8Var.getSticker() != null && org.telegram.messenger.fj.X3(a8Var.getSticker()) && !org.telegram.messenger.j10.i(org.telegram.messenger.c.a(ryVar2.d1).a).q()) {
                                    org.telegram.ui.ns.p().x(a8Var);
                                    break;
                                } else {
                                    org.telegram.ui.ns.p().t();
                                    if (!a8Var.r) {
                                        a8Var.r = true;
                                        a8Var.n = 0.5f;
                                        a8Var.y = 0L;
                                        org.telegram.ui.Cells.z7 z7Var = a8Var.a;
                                        z7Var.setAlpha(0.5f * a8Var.I);
                                        z7Var.invalidate();
                                        a8Var.s = System.currentTimeMillis();
                                        a8Var.invalidate();
                                        ryVar2.u1.m(a8Var, a8Var.getSticker(), str, a8Var.getParentObject(), a8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.B0 = r42;
            awVar.setOnItemClickListener((oj0) r42);
            org.telegram.ui.ActionBar.u6.l(awVar, 21, i16, i6Var2);
            yvVar.addView(awVar);
            this.b0 = new org.telegram.ui.ActionBar.l5(awVar, bwVar);
            ew ewVar = new ew(this, context2);
            this.H0 = ewVar;
            yvVar.addView(ewVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            ph.c cVar3 = new ph.c(context2, i6Var2);
            this.I0 = cVar3;
            cVar3.setVisibility(8);
            final int i23 = 1;
            cVar3.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pv
                public final /* synthetic */ ry b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i23) {
                        case 0:
                            qx qxVar = this.b.T;
                            mx mxVar = qxVar.c;
                            int childCount = mxVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((ph.b) mxVar.getChildAt(i182)).a(false, true);
                            }
                            qxVar.d = 0L;
                            qxVar.G.b.a(false, true);
                            qxVar.f();
                            break;
                        case 1:
                            my myVar = this.b.A0;
                            mx mxVar2 = myVar.c;
                            int childCount2 = mxVar2.getChildCount();
                            for (int i192 = 0; i192 < childCount2; i192++) {
                                ((ph.b) mxVar2.getChildAt(i192)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.R.a.a(false, true);
                            myVar.f();
                            break;
                        case 2:
                            rx rxVar = this.b.u1;
                            if (rxVar != null) {
                                rxVar.w();
                                break;
                            }
                            break;
                        default:
                            ry ryVar = this.b;
                            int currentItem = ryVar.h.getCurrentItem();
                            ey eyVar = currentItem == 0 ? ryVar.W : currentItem == 1 ? ryVar.p0 : ryVar.H0;
                            if (eyVar != null) {
                                gq gqVar = eyVar.d;
                                gqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            yvVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z19 = z14;
            i12 = 80;
            fw fwVar = new fw(this, context2, i6Var2, h2Var, z19);
            this.C0 = fwVar;
            fwVar.setDragEnabled(true);
            fwVar.setWillNotDraw(false);
            fwVar.setType(dl0Var);
            fwVar.setUnderlineHeight(awVar.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
            fwVar.setIndicatorColor(z(i10));
            fwVar.setUnderlineColor(z(i18));
            if (viewGroup == null || !z19) {
                yvVar.addView(fwVar, c8.ma.e(-1, 36, 51));
            } else {
                gw gwVar = new gw(this, context2);
                this.D0 = gwVar;
                gwVar.addView(fwVar, c8.ma.e(-1, 36, 51));
                viewGroup.addView(gwVar, c8.ma.c(-2.0f, -1));
            }
            Y(true);
            fwVar.setDelegate(new nv(this, 4));
            awVar.setOnScrollListener(new qy(this, 0));
            ph.a aVar2 = new ph.a(context2, i6Var2);
            this.O = aVar2;
            org.telegram.ui.y61 y61Var2 = new org.telegram.ui.y61(context2, i6Var2);
            this.N = y61Var2;
            y61Var2.setVisibility(8);
            y61Var2.addView(aVar2, c8.ma.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            yvVar.addView(y61Var2, c8.ma.e(-1, -2, 80));
        } else {
            i12 = 80;
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        hw hwVar = new hw(this, context2);
        this.h = hwVar;
        ri.q qVar3 = this.o2;
        qVar3.getClass();
        hwVar.b(new ri.i(qVar3, hwVar));
        hwVar.setOverScrollMode(2);
        lx lxVar = new lx(this);
        this.M0 = lxVar;
        hwVar.setAdapter(lxVar);
        iw iwVar = new iw(this, context2);
        this.y = iwVar;
        iwVar.setHapticFeedbackEnabled(true);
        iwVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        iwVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        iwVar.setScaleType(scaleType);
        iwVar.setContentDescription(org.telegram.messenger.gd.M0(2131754920, null));
        iwVar.setFocusable(true);
        iwVar.setOnClickListener(new jw());
        c8.ra.a(iwVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.p) + 40.0f));
        } else {
            addView(frameLayout, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(40.0f), 83));
        if (z13) {
            addView(frameLayout3, c8.ma.e(-1, 48, i12));
            frameLayout3.addView(iwVar, c8.ma.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.E = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.gd.M0(2131745300, null));
                c8.ra.a(imageView);
                frameLayout3.addView(imageView, c8.ma.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i24 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pv
                    public final /* synthetic */ ry b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i24) {
                            case 0:
                                qx qxVar = this.b.T;
                                mx mxVar = qxVar.c;
                                int childCount = mxVar.getChildCount();
                                for (int i182 = 0; i182 < childCount; i182++) {
                                    ((ph.b) mxVar.getChildAt(i182)).a(false, true);
                                }
                                qxVar.d = 0L;
                                qxVar.G.b.a(false, true);
                                qxVar.f();
                                break;
                            case 1:
                                my myVar = this.b.A0;
                                mx mxVar2 = myVar.c;
                                int childCount2 = mxVar2.getChildCount();
                                for (int i192 = 0; i192 < childCount2; i192++) {
                                    ((ph.b) mxVar2.getChildAt(i192)).a(false, true);
                                }
                                myVar.d = 0L;
                                myVar.R.a.a(false, true);
                                myVar.f();
                                break;
                            case 2:
                                rx rxVar = this.b.u1;
                                if (rxVar != null) {
                                    rxVar.w();
                                    break;
                                }
                                break;
                            default:
                                ry ryVar = this.b;
                                int currentItem = ryVar.h.getCurrentItem();
                                ey eyVar = currentItem == 0 ? ryVar.W : currentItem == 1 ? ryVar.p0 : ryVar.H0;
                                if (eyVar != null) {
                                    gq gqVar = eyVar.d;
                                    gqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    gqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    gqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            bc0 bc0Var = new bc0(context2, i6Var2);
            this.x = bc0Var;
            bc0Var.setViewPager(hwVar);
            bc0Var.setShouldExpand(false);
            bc0Var.setIndicatorHeight(org.telegram.messenger.g0.L(3.0f));
            bc0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.n6.Gf), 20));
            bc0Var.setUnderlineHeight(0);
            bc0Var.setTabPaddingLeftRight(org.telegram.messenger.g0.L(11.0f));
            bc0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
            frameLayout3.addView(bc0Var, c8.ma.e(-2, 48, 81));
            bc0Var.setOnPageChangeListener(new kw(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.F = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.gd.M0(2131745641, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, c8.ma.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i25 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pv
                public final /* synthetic */ ry b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i25) {
                        case 0:
                            qx qxVar = this.b.T;
                            mx mxVar = qxVar.c;
                            int childCount = mxVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((ph.b) mxVar.getChildAt(i182)).a(false, true);
                            }
                            qxVar.d = 0L;
                            qxVar.G.b.a(false, true);
                            qxVar.f();
                            break;
                        case 1:
                            my myVar = this.b.A0;
                            mx mxVar2 = myVar.c;
                            int childCount2 = mxVar2.getChildCount();
                            for (int i192 = 0; i192 < childCount2; i192++) {
                                ((ph.b) mxVar2.getChildAt(i192)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.R.a.a(false, true);
                            myVar.f();
                            break;
                        case 2:
                            rx rxVar = this.b.u1;
                            if (rxVar != null) {
                                rxVar.w();
                                break;
                            }
                            break;
                        default:
                            ry ryVar = this.b;
                            int currentItem = ryVar.h.getCurrentItem();
                            ey eyVar = currentItem == 0 ? ryVar.W : currentItem == 1 ? ryVar.p0 : ryVar.H0;
                            if (eyVar != null) {
                                gq gqVar = eyVar.d;
                                gqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, c8.ma.d(56, 48.0f, (org.telegram.messenger.gd.a0 ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(56.0f), z(i16), z(i16));
            c8.ra.a(iwVar);
            iwVar.setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
            iwVar.setBackground(j02);
            iwVar.setContentDescription(org.telegram.messenger.gd.M0(2131754920, null));
            iwVar.setFocusable(true);
            frameLayout3.addView(iwVar, c8.ma.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(hwVar, 0, c8.ma.e(-1, -1, 51));
        di.xb xbVar = new di.xb(context2, 24);
        this.O0 = xbVar;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int i26 = org.telegram.ui.ActionBar.n6.hg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L3, z(i26));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i26);
        xbVar.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(xbVar, d02, M, null, i6Var2);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.gg, i6Var2);
        xbVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        char c10 = 16;
        xbVar.setGravity(16);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setVisibility(4);
        addView(xbVar, c8.ma.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.D1 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        Field field2 = iu.f;
        iu iuVar = new iu(new hu(context2, i6Var2));
        if (iu.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            iu.f = field;
        }
        Field field3 = iu.f;
        if (field3 != null) {
            try {
                iuVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(iuVar);
                iu.f.set(iuVar, iu.g);
            } catch (Exception unused3) {
                iuVar.a = null;
            }
        }
        this.C1 = iuVar;
        iuVar.c.setOnSelectionUpdateListener(new d(this, 11));
        this.B1 = org.telegram.messenger.mp.f1().getInt("selected_page", 0);
        HashMap hashMap = org.telegram.messenger.j6.h;
        if (!org.telegram.messenger.j6.k) {
            org.telegram.messenger.j6.k = true;
            SharedPreferences f12 = org.telegram.messenger.mp.f1();
            try {
                hashMap.clear();
                if (f12.contains("emojis")) {
                    String string = f12.getString("emojis", "");
                    if (string != null && string.length() > 0) {
                        String[] split = string.split(",");
                        int length = split.length;
                        int i27 = 0;
                        while (i27 < length) {
                            String[] split2 = split[i27].split("=");
                            long longValue = Utilities.A(split2[0]).longValue();
                            StringBuilder sb2 = new StringBuilder();
                            char c11 = c10;
                            String[] strArr = split;
                            int i28 = 0;
                            while (i28 < 4) {
                                int i29 = i28;
                                sb2.insert(0, (char) longValue);
                                longValue >>= c11;
                                if (longValue == 0) {
                                    break;
                                } else {
                                    i28 = i29 + 1;
                                }
                            }
                            if (sb2.length() > 0) {
                                hashMap.put(sb2.toString(), Utilities.z(split2[1]));
                            }
                            i27++;
                            c10 = c11;
                            split = strArr;
                        }
                    }
                    f12.edit().remove("emojis").commit();
                    org.telegram.messenger.j6.r();
                } else {
                    String string2 = f12.getString("emojis2", "");
                    if (string2 != null && string2.length() > 0) {
                        for (String str : string2.split(",")) {
                            String[] split3 = str.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !f12.getBoolean("filled_default", false)) {
                    int i30 = 0;
                    while (true) {
                        String[] strArr2 = org.telegram.messenger.j6.o;
                        if (i30 >= strArr2.length) {
                            break;
                        }
                        hashMap.put(strArr2[i30], Integer.valueOf(strArr2.length - i30));
                        i30++;
                    }
                    f12.edit().putBoolean("filled_default", true).commit();
                    org.telegram.messenger.j6.r();
                }
                org.telegram.messenger.j6.s();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                String string3 = f12.getString("color", "");
                if (string3 != null && string3.length() > 0) {
                    for (String str2 : string3.split(",")) {
                        String[] split4 = str2.split("=");
                        org.telegram.messenger.j6.j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e11) {
                z20 = true;
                org.telegram.messenger.a8.g(e11, true);
                bxVar2 = bxVar4;
                z21 = false;
            }
        }
        bxVar2 = bxVar4;
        z21 = false;
        z20 = true;
        bxVar2.F(z21);
        J(z20, z11, z12, z21);
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(z21);
            this.k2 = gVar;
            this.o2.a(gVar);
            ui.f fVar = new ui.f(null);
            fVar.f = cVar;
            fVar.d = gVar;
            fVar.e = -2;
            dh.c cVar4 = new dh.c(fVar, fVar, fVar);
            this.n2 = cVar4;
            cVar4.k = true;
            int L4 = org.telegram.messenger.g0.L(org.telegram.messenger.pc.e(262144) ? 8.0f : 48.0f);
            cVar4.d = L4;
            cVar4.e = L4;
            cVar4.j = this.o2;
        } else {
            dh.c cVar5 = new dh.c(cVar, cVar, cVar);
            this.n2 = cVar5;
            cVar5.j = this.o2;
            this.k2 = null;
        }
        this.l2 = new ih(this, 1);
        setBlurredBackgroundDrawableFactory(this.n2);
        this.o2.i(this);
        this.o2.a = new nv(this, 0);
    }

    public static void a(ry ryVar, boolean z10) {
        vv vvVar = ryVar.i0;
        if (vvVar == null) {
            return;
        }
        int childCount = vvVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = vvVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.i2) {
                ImageReceiver photoImage = ((org.telegram.ui.Cells.i2) childAt).getPhotoImage();
                if (z10) {
                    photoImage.u0 = true;
                    photoImage.P0(false);
                } else {
                    photoImage.u0 = false;
                    photoImage.Q0();
                }
            }
        }
    }

    public static void d(ry ryVar, zx zxVar, String str) {
        String str2;
        rx rxVar;
        org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
        int i7 = ryVar.d1;
        ArrayList arrayList = ryVar.r1;
        if (zxVar == null) {
            return;
        }
        if (zxVar.getSpan() == null) {
            ryVar.E2 = SystemClock.elapsedRealtime();
            ryVar.N(true);
            String str3 = str != null ? str : (String) zxVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                rx rxVar2 = ryVar.u1;
                if (rxVar2 != null) {
                    rxVar2.l(org.telegram.messenger.j6.c(str));
                    return;
                }
                return;
            }
            if (!zxVar.c && (str2 = (String) org.telegram.messenger.j6.j.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            ryVar.h(str3);
            rx rxVar3 = ryVar.u1;
            if (rxVar3 != null) {
                rxVar3.l(org.telegram.messenger.j6.c(str3));
                return;
            }
            return;
        }
        if (ryVar.u1 != null) {
            long j3 = zxVar.getSpan().documentId;
            TLRPC.Document document = zxVar.getSpan().document;
            fx fxVar = zxVar.e;
            boolean z10 = fxVar != null && fxVar.i;
            if (document == null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    fx fxVar2 = (fx) arrayList.get(i10);
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = fxVar2.c;
                        if (arrayList2 != null && i11 < arrayList2.size()) {
                            if (((TLRPC.Document) fxVar2.c.get(i11)).id == j3) {
                                document = (TLRPC.Document) fxVar2.c.get(i11);
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
            if (document == null) {
                document = o5.e(i7, j3);
            }
            TLRPC.Document document2 = document;
            String U = document2 != null ? org.telegram.messenger.fj.U(document2) : null;
            if (org.telegram.messenger.fj.m3(document2) || org.telegram.messenger.j10.i(i7).q() || (((rxVar = ryVar.u1) != null && rxVar.g()) || ryVar.V0 || z10)) {
                ryVar.E2 = SystemClock.elapsedRealtime();
                ryVar.N(true);
                ryVar.h("animated_" + j3);
                ryVar.u1.x(j3, document2, U, zxVar.c);
                return;
            }
            ryVar.N(false);
            lc b02 = h2Var != null ? lc.b0(h2Var) : new lc(ryVar.r, ryVar.a2);
            if (ryVar.i2 || h2Var == null) {
                b02.r(document2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743627, null)), org.telegram.messenger.gd.M0(2131746840, null), new mv(ryVar, 3)).j();
            } else {
                b02.K(R.raw.saved_messages, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743626, null)), org.telegram.messenger.gd.M0(2131747624, null), new mv(ryVar, 4)).j();
            }
            ryVar.i2 = !ryVar.i2;
        }
    }

    public static void e(ry ryVar, int i7, int i10) {
        v4.f1 K;
        int[] iArr = ryVar.R0;
        if (i7 == 1) {
            ryVar.n(i10, ryVar.Q);
            return;
        }
        rx rxVar = ryVar.u1;
        if ((rxVar == null || !rxVar.z()) && !ryVar.K0) {
            ck0 x10 = ryVar.x(i7);
            if (i10 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + ryVar.c1 < x10.getPaddingTop()) {
                int i11 = iArr[i7] - i10;
                iArr[i7] = i11;
                if (i11 > 0) {
                    iArr[i7] = 0;
                } else if (i11 < (-org.telegram.messenger.g0.L(288.0f))) {
                    iArr[i7] = -org.telegram.messenger.g0.L(288.0f);
                }
                if (i7 == 0) {
                    ryVar.Z();
                } else {
                    ryVar.y(i7).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i7]));
                }
            }
        }
    }

    public static void f(ry ryVar, boolean z10) {
        int N0;
        wx wxVar = ryVar.j0;
        xv xvVar = ryVar.p0;
        vv vvVar = ryVar.i0;
        if (vvVar != null && (vvVar.getAdapter() instanceof vx)) {
            vx vxVar = (vx) vvVar.getAdapter();
            if (!vxVar.s && vxVar.h == 0 && !vxVar.y.isEmpty() && (N0 = wxVar.N0()) != -1 && N0 > wxVar.B() - 5) {
                String str = vxVar.x;
                String str2 = vxVar.r;
                boolean z11 = vxVar.w;
                vxVar.F(str, str2, true, z11, z11);
            }
        }
        rx rxVar = ryVar.u1;
        if (rxVar == null || !rxVar.z()) {
            if (xvVar == null || vvVar == null) {
                return;
            }
            xvVar.a.a(true, !z10);
            return;
        }
        v4.f1 K = vvVar.K(0);
        if (K == null) {
            ey.a(xvVar, true, !z10);
        } else {
            ey.a(xvVar, K.a.getTop() < vvVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        String str3;
        boolean z10 = true;
        if (org.telegram.messenger.j4.c(str) != null) {
            if (org.telegram.messenger.j4.c(str) == null) {
                return str;
            }
            if (str2 == null) {
                return "🤝";
            }
            if (!str2.contains("\u200d")) {
                return "🤝".concat(str2);
            }
            String[] split = str2.split("\u200d");
            StringBuilder sb2 = new StringBuilder("🫱");
            sb2.append(split.length >= 1 ? split[0] : "");
            sb2.append("\u200d🫲");
            sb2.append(split.length >= 2 ? split[1] : "");
            return sb2.toString();
        }
        if (org.telegram.messenger.j6.b(str)) {
            str = com.google.android.gms.internal.vision.e2.k(str, 2, 0);
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.vision.e2.k(str, 2, 0);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.vision.e2.k(str, 3, 0);
        }
        String v = p5.c.v(str, str2);
        if (str3 != null) {
            v = p5.c.v(v, str3);
        }
        return z10 ? p5.c.v(v, "\u200d➡") : v;
    }

    public static void j(int i7, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i7);
    }

    public final void A() {
        ew ewVar = this.H0;
        if (ewVar != null) {
            ewVar.b();
        }
        xv xvVar = this.p0;
        if (xvVar != null) {
            xvVar.b();
        }
        sv svVar = this.W;
        if (svVar != null) {
            svVar.b();
        }
    }

    public final void B() {
        xi.e eVar = this.N2;
        if (eVar != null) {
            eVar.b();
            this.N2 = null;
        }
        xi.e eVar2 = this.O2;
        if (eVar2 != null) {
            eVar2.b();
            this.O2 = null;
            this.P2 = false;
        }
    }

    public final void C(boolean z10, boolean z11) {
        dy dyVar;
        if (this.B1 != 0 && this.x1) {
            this.B1 = 0;
        }
        if (this.B1 == 0 && this.w1) {
            this.B1 = 1;
        }
        int i7 = this.B1;
        hw hwVar = this.h;
        if (i7 == 0 || z10 || this.e.size() == 1) {
            M(true, false);
            R(false, false);
            if (hwVar.getCurrentItem() != 0) {
                hwVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.g0.h3(new mv(this, 5), 350L);
            }
        } else {
            int i10 = this.B1;
            if (i10 == 1) {
                M(false, false);
                R(this.v0 || this.w0, false);
                if (hwVar.getCurrentItem() != 2) {
                    hwVar.x(2, false);
                }
                fw fwVar = this.C0;
                if (fwVar != null) {
                    this.T0 = true;
                    int i11 = this.H1;
                    if (i11 >= 0) {
                        fwVar.m(i11);
                    } else {
                        int i12 = this.G1;
                        if (i12 >= 0) {
                            fwVar.m(i12);
                        } else {
                            fwVar.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.h1(0, 0);
                }
            } else if (i10 == 2) {
                M(false, false);
                R(false, false);
                if (hwVar.getCurrentItem() != 1) {
                    hwVar.x(1, false);
                }
                zw zwVar = this.q0;
                if (zwVar != null) {
                    zwVar.m(0);
                }
                xv xvVar = this.p0;
                if (xvVar != null && (dyVar = xvVar.r) != null) {
                    dyVar.I1(null);
                }
            }
        }
        N(true);
    }

    public final void E() {
        jy jyVar = this.z0;
        if (jyVar != null) {
            jyVar.f();
        }
        my myVar = this.A0;
        if (myVar != null) {
            myVar.f();
        }
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().m();
        }
        org.telegram.ui.ns.p().t();
    }

    public final void F(int i7) {
        rx rxVar = this.u1;
        if ((rxVar == null || !rxVar.z()) && i7 != 0) {
            HorizontalScrollView y10 = y(i7);
            this.R0[i7] = 0;
            y10.setTranslationY(0);
        }
    }

    public final void G(int i7, int i10) {
        sw swVar = this.R;
        View m10 = swVar.m(i7);
        int L0 = swVar.L0();
        if ((m10 == null && Math.abs(i7 - L0) > swVar.J * 9.0f) || !org.telegram.messenger.bz.c()) {
            int i11 = swVar.L0() < i7 ? 0 : 1;
            org.telegram.ui.ActionBar.l5 l5Var = this.c0;
            l5Var.b = i11;
            l5Var.k(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        hi.l1 l1Var = new hi.l1(1, this.Q.getContext(), this);
        l1Var.a = i7;
        l1Var.p = i10;
        swVar.w0(l1Var);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            q(false);
            float f12 = 1.0f - this.a.e;
            ew ewVar = this.H0;
            ewVar.setAlpha(f12);
            ewVar.setVisibility(f12 > 0.0f ? 0 : 4);
            float f13 = 1.0f - f12;
            ph.c cVar2 = this.I0;
            cVar2.setAlpha(f13);
            cVar2.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f12);
            cVar2.setVisibility(f13 > 0.0f ? 0 : 4);
            org.telegram.ui.y61 y61Var = this.N;
            y61Var.setAlpha(f13);
            y61Var.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f12);
            y61Var.setVisibility(f13 > 0.0f ? 0 : 4);
            S();
            this.y0.invalidate();
            return;
        }
        if (i7 == 1) {
            l(false);
            float f14 = 1.0f - this.b.e;
            sv svVar = this.W;
            svVar.setAlpha(f14);
            svVar.setVisibility(f14 > 0.0f ? 0 : 4);
            float f15 = 1.0f - f14;
            ph.c cVar3 = this.V;
            cVar3.setAlpha(f15);
            cVar3.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f14);
            cVar3.setVisibility(f15 > 0.0f ? 0 : 4);
            org.telegram.ui.y61 y61Var2 = this.L;
            y61Var2.setAlpha(f15);
            y61Var2.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f14);
            y61Var2.setVisibility(f15 > 0.0f ? 0 : 4);
            S();
            this.K.invalidate();
        }
    }

    public final void I(int i7, int i10) {
        bw bwVar = this.F0;
        View m10 = bwVar.m(i7);
        int L0 = bwVar.L0();
        if (m10 != null || Math.abs(i7 - L0) <= 40) {
            this.K0 = true;
            this.E0.y0(i7);
        } else {
            int i11 = bwVar.L0() < i7 ? 0 : 1;
            org.telegram.ui.ActionBar.l5 l5Var = this.b0;
            l5Var.b = i11;
            l5Var.k(i7, i10, false, false);
        }
    }

    public final void J(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i7 >= arrayList2.size()) {
                break;
            }
            if (((ny) arrayList2.get(i7)).a == 0 && z10) {
                arrayList.add((ny) arrayList2.get(i7));
            }
            if (((ny) arrayList2.get(i7)).a == 1 && z12) {
                arrayList.add((ny) arrayList2.get(i7));
            }
            if (((ny) arrayList2.get(i7)).a == 2 && z11) {
                arrayList.add((ny) arrayList2.get(i7));
            }
            i7++;
        }
        bc0 bc0Var = this.x;
        if (bc0Var != null) {
            org.telegram.messenger.g0.X3(bc0Var, arrayList.size() > 1, 1.0f, true, z13);
        }
        hw hwVar = this.h;
        if (hwVar != null) {
            hwVar.setAdapter(null);
            hwVar.setAdapter(this.M0);
            if (bc0Var != null) {
                bc0Var.setViewPager(hwVar);
            }
        }
    }

    public final void K(final ph.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        my myVar;
        qx qxVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (qxVar = this.T) == null || qxVar.d == stickerSet.id) {
            if (z10 || (myVar = this.A0) == null || myVar.d == stickerSet.id) {
                final boolean E0 = org.telegram.messenger.ri.d0(this.d1).E0(stickerSet.id, true);
                aVar.i(E0 ? stickerSet.masks ? org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]) : stickerSet.masks ? org.telegram.messenger.gd.G(stickerSet.count, "AddManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.gd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]) : org.telegram.messenger.gd.G(stickerSet.count, "AddManyStickersCount", new Object[0]), z11, true);
                aVar.m0.a(!E0, z11);
                aVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.rv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ry ryVar = ry.this;
                        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(ryVar.d1);
                        Context context = ryVar.getContext();
                        int i7 = E0 ? 0 : 2;
                        org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
                        FrameLayout frameLayout = ryVar.s;
                        ph.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        d02.l2(context, tLObject2, document2, i7, h2Var, frameLayout, false, true, new di.o3(ryVar, aVar2, tLObject2, stickerSet2, document2, z12), false);
                        ryVar.K(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void L(long j3, boolean z10, boolean z11) {
        bc0 bc0Var = this.x;
        if (bc0Var == null) {
            return;
        }
        this.w1 = z10;
        this.x1 = z11;
        if (z11 || z10) {
            this.v1 = j3;
        } else {
            this.v1 = 0L;
        }
        int i7 = z11 ? 2 : 0;
        LinearLayout linearLayout = bc0Var.d;
        View childAt = i7 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i7);
        if (childAt != null) {
            childAt.setAlpha(this.v1 != 0 ? 0.15f : 1.0f);
            hw hwVar = this.h;
            if (z11) {
                if (this.v1 == 0 || hwVar.getCurrentItem() == 0) {
                    return;
                }
                M(true, true);
                R(false, true);
                hwVar.x(0, false);
                return;
            }
            if (this.v1 == 0 || hwVar.getCurrentItem() == 1) {
                return;
            }
            M(false, true);
            R(false, true);
            hwVar.x(1, false);
        }
    }

    public final void M(boolean z10, boolean z11) {
        iw iwVar = this.y;
        if (z10 && iwVar.getTag() == null) {
            return;
        }
        if ((z10 || iwVar.getTag() == null) && !this.p2) {
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            iwVar.setTag(z10 ? null : 1);
            if (!z11) {
                iwVar.setAlpha(z10 ? 1.0f : 0.0f);
                iwVar.setScaleX(z10 ? 1.0f : 0.0f);
                iwVar.setScaleY(z10 ? 1.0f : 0.0f);
                iwVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                iwVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(iwVar, (Property<iw, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(iwVar, (Property<iw, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(iwVar, (Property<iw, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.G.setDuration(200L);
            this.G.setInterpolator(lr.g);
            this.G.addListener(new ow(this, z10, r2));
            this.G.start();
        }
    }

    public final void N(boolean z10) {
        this.I = 0.0f;
        rx rxVar = this.u1;
        if (rxVar != null && rxVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.n;
        if (z10 && frameLayout.getTag() == null) {
            return;
        }
        if (z10 || frameLayout.getTag() == null) {
            frameLayout.setTag(z10 ? null : 1);
            this.F2.a(z10, true);
        }
    }

    public final void O(boolean z10, boolean z11) {
        View view = this.P;
        if (z10 && view.getTag() == null) {
            return;
        }
        if (z10 || view.getTag() == null) {
            AnimatorSet animatorSet = this.a0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.a0 = null;
            }
            view.setTag(z10 ? null : 1);
            if (!z11) {
                view.setAlpha(z10 ? 1.0f : 0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.a0 = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
            this.a0.setDuration(200L);
            this.a0.setInterpolator(lr.g);
            this.a0.addListener(new x(this, 25));
            this.a0.start();
        }
    }

    public final void P(boolean z10) {
        for (int i7 = 0; i7 < 3; i7++) {
            v4.t w10 = w(i7);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    F(i7);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void Q(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.d1).O0(Long.valueOf(this.v1));
        if (O0 == null) {
            return;
        }
        di.xb xbVar = this.O0;
        if (z10) {
            if (org.telegram.messenger.v3.N(O0) || (tL_chatBannedRights = O0.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = O0.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.D1(tL_chatBannedRights2)) {
                    if (z11) {
                        xbVar.setText(org.telegram.messenger.gd.a0("AttachPlainRestricted", null, 2131753942, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                    }
                    if (z12) {
                        xbVar.setText(org.telegram.messenger.gd.a0("AttachGifRestricted", null, 2131753968, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                    } else {
                        xbVar.setText(org.telegram.messenger.gd.a0("AttachStickersRestricted", null, 2131753933, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                    }
                } else if (z11) {
                    xbVar.setText(org.telegram.messenger.gd.M0(2131753941, null));
                } else if (z12) {
                    xbVar.setText(org.telegram.messenger.gd.M0(2131753967, null));
                } else {
                    xbVar.setText(org.telegram.messenger.gd.M0(2131753932, null));
                }
            } else {
                org.telegram.ui.ActionBar.h2 h2Var = this.Z1;
                if ((h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).Z6()) {
                    return;
                }
                if (z11) {
                    xbVar.setText(org.telegram.messenger.gd.M0(2131749371, null));
                } else if (z12) {
                    xbVar.setText(org.telegram.messenger.gd.M0(2131749370, null));
                } else {
                    xbVar.setText(org.telegram.messenger.gd.M0(2131749364, null));
                }
            }
            xbVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.Q2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Q2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Q2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(xbVar, (Property<di.xb, Float>) View.ALPHA, z10 ? xbVar.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(xbVar, (Property<di.xb, Float>) View.TRANSLATION_Y, z10 ? org.telegram.messenger.g0.L(12.0f) : xbVar.getTranslationY(), z10 ? 0.0f : org.telegram.messenger.g0.L(12.0f)));
        h2.m0 m0Var = this.R2;
        if (m0Var != null) {
            org.telegram.messenger.g0.r(m0Var);
        }
        if (z10) {
            h2.m0 m0Var2 = new h2.m0(this, z11, z12, 4);
            this.R2 = m0Var2;
            org.telegram.messenger.g0.h3(m0Var2, 3500L);
        }
        this.Q2.setDuration(320L);
        this.Q2.setInterpolator(lr.h);
        this.Q2.start();
    }

    public final void R(boolean z10, boolean z11) {
        ImageView imageView = this.E;
        if (imageView == null || this.q2) {
            return;
        }
        if (z10 && imageView.getTag() == null) {
            return;
        }
        if (z10 || imageView.getTag() == null) {
            AnimatorSet animatorSet = this.H;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.H = null;
            }
            int i7 = 1;
            imageView.setTag(z10 ? null : 1);
            if (!z11) {
                imageView.setAlpha(z10 ? 1.0f : 0.0f);
                imageView.setScaleX(z10 ? 1.0f : 0.0f);
                imageView.setScaleY(z10 ? 1.0f : 0.0f);
                imageView.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                imageView.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.H = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.H.setDuration(200L);
            this.H.setInterpolator(lr.g);
            this.H.addListener(new ow(this, z10, i7));
            this.H.start();
        }
    }

    public final void S() {
        org.telegram.ui.ActionBar.h2 h2Var;
        if (((View) getParent()) != null) {
            float y10 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((org.telegram.messenger.g0.E || ((h2Var = this.Z1) != null && h2Var.isInBubbleMode())) && !this.W0) ? org.telegram.messenger.g0.L(1.0f) : r0.getHeight());
            float f10 = this.s2;
            FrameLayout frameLayout = this.n;
            if (f10 >= 0.0f) {
                y10 += getMeasuredHeight() - this.s2;
            } else if (frameLayout.getTop() - y10 < 0.0f || !this.y2) {
                y10 = 0.0f;
            }
            float W1 = (-y10) + org.telegram.messenger.g0.W1(this.F2.e, org.telegram.messenger.g0.L(50.0f), -this.r2);
            frameLayout.setTranslationY(W1);
            if (this.e0) {
                this.r.setTranslationY(W1);
            }
        }
    }

    public final void T() {
        ey eyVar;
        boolean z10;
        hv hvVar;
        boolean z11 = this.v0;
        View view = this.w;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (org.telegram.messenger.g0.E || this.O1) {
            Drawable background = getBackground();
            int z12 = z(org.telegram.ui.ActionBar.n6.zf);
            if (background != null && (background != this.H2 || z12 != this.I2)) {
                this.H2 = background;
                this.I2 = z12;
                background.setColorFilter(new PorterDuffColorFilter(z12, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i7 = org.telegram.ui.ActionBar.n6.zf;
            setBackgroundColor(z(i7));
            if (this.e0) {
                view.setBackgroundColor(z(i7));
            }
        }
        ww wwVar = this.J;
        if (wwVar != null) {
            if (this.v0) {
                wwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.zf));
                this.P.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.Cf));
            } else {
                wwVar.setBackground(null);
            }
        }
        iu iuVar = this.C1;
        if (iuVar != null) {
            iuVar.c.a();
        }
        int i10 = 0;
        while (true) {
            eyVar = this.W;
            z10 = this.j2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                eyVar = this.H0;
            } else if (i10 != 1) {
                eyVar = this.p0;
            }
            if (eyVar != null) {
                gq gqVar = eyVar.d;
                FrameLayout frameLayout = eyVar.n;
                View view2 = eyVar.f;
                if (this.v0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.zf));
                } else {
                    view2.setBackground(null);
                }
                eyVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.Cf));
                eyVar.c.a(z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Bf));
                org.telegram.ui.ActionBar.n6.C1(z10 ? v(0.06f) : z(org.telegram.ui.ActionBar.n6.Af), frameLayout.getBackground());
                frameLayout.invalidate();
                gqVar.setHintTextColor(z10 ? v(0.45f) : z(org.telegram.ui.ActionBar.n6.Bf));
                gqVar.setTextColor(z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.G6));
            }
            i10++;
        }
        Paint paint = this.t1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.n6.Sf));
        }
        ex exVar = this.Q;
        if (exVar != null) {
            exVar.setGlowColor(z(org.telegram.ui.ActionBar.n6.zf));
        }
        aw awVar = this.E0;
        if (awVar != null) {
            awVar.setGlowColor(z(org.telegram.ui.ActionBar.n6.zf));
        }
        fw fwVar = this.C0;
        if (fwVar != null) {
            fwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.n6.If));
            fwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.n6.Cf));
            if (this.v0) {
                fwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.zf));
            } else {
                fwVar.setBackground(null);
            }
        }
        zw zwVar = this.q0;
        if (zwVar != null) {
            zwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.n6.If));
            zwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.n6.Cf));
            if (this.v0) {
                zwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.zf));
            } else {
                zwVar.setBackground(null);
            }
        }
        int v = z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf);
        boolean z13 = v != this.J2;
        this.J2 = v;
        iw iwVar = this.y;
        if (iwVar != null) {
            if (z13) {
                iwVar.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
            }
            if (eyVar == null) {
                Drawable background2 = iwVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.n6.zf;
                org.telegram.ui.ActionBar.n6.H1(background2, z(i11), false);
                org.telegram.ui.ActionBar.n6.H1(iwVar.getBackground(), z(i11), true);
            }
        }
        ImageView imageView = this.E;
        if (imageView != null && z13) {
            imageView.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.F;
        if (imageView2 != null && z13) {
            imageView2.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
        }
        di.xb xbVar = this.O0;
        if (xbVar != null) {
            if (xbVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) xbVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.n6.hg));
                xbVar.invalidate();
            }
            xbVar.setTextColor(z(org.telegram.ui.ActionBar.n6.gg));
        }
        vx vxVar = this.k0;
        if (vxVar != null) {
            xx xxVar = vxVar.e;
            int i12 = org.telegram.ui.ActionBar.n6.Df;
            int z14 = z(i12);
            if (z14 != this.K2) {
                this.K2 = z14;
                xxVar.a.setColorFilter(new PorterDuffColorFilter(z14, PorterDuff.Mode.MULTIPLY));
            }
            xxVar.b.setTextColor(z(i12));
            xxVar.c.setProgressColor(z(org.telegram.ui.ActionBar.n6.h6));
        }
        int z15 = z(org.telegram.ui.ActionBar.n6.Fi);
        if (this.f2 == null || z15 != this.L2) {
            this.L2 = z15;
            this.f2 = new PorterDuffColorFilter(z15, PorterDuff.Mode.SRC_IN);
        }
        int i13 = 0;
        while (true) {
            Drawable[] drawableArr = this.Y0;
            if (i13 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.n6.E1(drawableArr[i13], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ff), false);
            org.telegram.ui.ActionBar.n6.E1(drawableArr[i13], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf), true);
            i13++;
        }
        if (wwVar != null && (hvVar = wwVar.E) != null) {
            hvVar.d();
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Z0;
            if (i14 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.n6.E1(drawableArr2[i14], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), false);
            org.telegram.ui.ActionBar.n6.E1(drawableArr2[i14], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf), true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.a1;
            if (i15 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.n6.E1(drawableArr3[i15], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), false);
            org.telegram.ui.ActionBar.n6.E1(drawableArr3[i15], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf), true);
            i15++;
        }
        org.telegram.ui.ActionBar.w5 w5Var = this.b2;
        if (w5Var != null) {
            org.telegram.ui.ActionBar.n6.E1(w5Var, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ff), false);
            org.telegram.ui.ActionBar.n6.E1(w5Var, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf), true);
        }
        org.telegram.ui.ActionBar.w5 w5Var2 = this.c2;
        if (w5Var2 != null) {
            org.telegram.ui.ActionBar.n6.E1(w5Var2, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.If), false);
            org.telegram.ui.ActionBar.n6.E1(w5Var2, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.If), true);
        }
    }

    public final void U() {
        ex exVar = this.Q;
        if (exVar == null) {
            return;
        }
        for (int i7 = 0; i7 < exVar.getChildCount(); i7++) {
            View childAt = exVar.getChildAt(i7);
            if (childAt instanceof jx) {
                ((jx) childAt).a(true);
            }
        }
    }

    public final void V(int i7) {
        if (this.g0) {
            return;
        }
        int i10 = -1;
        if (i7 != -1) {
            int size = getRecentEmoji().size() + (this.e0 ? 1 : 0);
            bx bxVar = this.S;
            int i11 = bxVar.c;
            ArrayList arrayList = bxVar.y;
            int i12 = 0;
            int i13 = size + (i11 >= 0 ? 3 : 0);
            if (i7 >= i13) {
                int i14 = 0;
                while (true) {
                    String[][] strArr = org.telegram.messenger.k6.f;
                    if (i14 >= 8) {
                        break;
                    }
                    i13 += strArr[i14].length + 1;
                    if (i7 < i13) {
                        i10 = i14 + 1;
                        break;
                    }
                    i14++;
                }
                if (i10 < 0) {
                    ArrayList<fx> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i7) {
                            fx fxVar = (fx) this.r1.get(size2);
                            while (i12 < emojipacks.size()) {
                                long j3 = emojipacks.get(i12).b.id;
                                long j10 = fxVar.b.id;
                                if (j3 == j10 && (!fxVar.g || (!fxVar.f && !this.q1.contains(Long.valueOf(j10))))) {
                                    char[] cArr = org.telegram.messenger.k6.a;
                                    i12 = 9 + i12;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            size2--;
                        }
                    }
                }
                i12 = i10;
            }
            if (i12 >= 0) {
                this.J.j(i12, true);
            }
        }
    }

    public final void W() {
        int i7;
        dy dyVar;
        int i10;
        boolean z10;
        zw zwVar = this.q0;
        int currentPosition = zwVar.getCurrentPosition();
        int i11 = this.s0;
        boolean z11 = currentPosition == i11;
        boolean z12 = i11 >= 0;
        boolean isEmpty = this.j1.isEmpty();
        zwVar.d(false);
        this.s0 = -2;
        this.t0 = -2;
        this.u0 = -2;
        Drawable[] drawableArr = this.a1;
        if (isEmpty) {
            i7 = 0;
        } else {
            this.s0 = 0;
            zwVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.gd.M0(2131746169, null));
            i7 = 1;
        }
        this.t0 = i7;
        zwVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.gd.M0(2131750823, null));
        this.u0 = i7 + 1;
        org.telegram.messenger.g0.L(13.0f);
        org.telegram.messenger.g0.L(11.0f);
        int i12 = this.d1;
        ArrayList arrayList = org.telegram.messenger.mp.u1(i12).e4;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = (String) arrayList.get(i13);
            org.telegram.messenger.f6 g10 = org.telegram.messenger.j6.g(str);
            if (g10 != null) {
                TLRPC.Document V = org.telegram.messenger.ri.d0(i12).V(str);
                String i14 = i5.c.i(i13 + 3, "tab");
                int i15 = zwVar.y;
                zwVar.y = i15 + 1;
                pv0 pv0Var = (pv0) zwVar.n.get(i14);
                if (pv0Var != null) {
                    zwVar.g(i14, pv0Var, i15);
                    i10 = currentPosition;
                    z10 = z12;
                } else {
                    i10 = currentPosition;
                    z10 = z12;
                    pv0Var = new pv0(zwVar.getContext(), 2);
                    pv0Var.setFocusable(true);
                    pv0Var.setOnClickListener(new xk0(zwVar, 2));
                    pv0Var.setExpanded(zwVar.g0);
                    pv0Var.a(zwVar.j0);
                    zwVar.e.addView(pv0Var, i15);
                }
                pv0Var.d = false;
                pv0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                pv0Var.setTag(R.id.parent_tag, g10);
                pv0Var.setTag(R.id.object_tag, V);
                pv0Var.setSelected(i15 == zwVar.E);
                zwVar.h.put(i14, pv0Var);
                pv0Var.setContentDescription(str);
            } else {
                i10 = currentPosition;
                z10 = z12;
            }
            i13++;
            currentPosition = i10;
            z12 = z10;
        }
        int i16 = currentPosition;
        boolean z13 = z12;
        zwVar.h();
        zwVar.q();
        if (z11 && isEmpty) {
            zwVar.m(this.t0);
            xv xvVar = this.p0;
            if (xvVar == null || (dyVar = xvVar.r) == null) {
                return;
            }
            dyVar.I1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (zwVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                zwVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                zwVar.k(i16 - 1, 0);
            }
        }
    }

    public final void X() {
        vx vxVar;
        int size = this.j1.size();
        long p10 = org.telegram.messenger.ri.p(ConnectionsManager.DEFAULT_DATACENTER_ID, this.j1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(this.d1).j0);
        this.j1 = arrayList;
        long p11 = org.telegram.messenger.ri.p(ConnectionsManager.DEFAULT_DATACENTER_ID, arrayList);
        if ((this.q0 != null && size == 0 && !this.j1.isEmpty()) || (size != 0 && this.j1.isEmpty())) {
            W();
        }
        if ((size == this.j1.size() && p10 == p11) || (vxVar = this.o0) == null) {
            return;
        }
        vxVar.f();
    }

    public final void Y(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        fw fwVar = this.C0;
        if (fwVar != null) {
            org.telegram.ui.d61 d61Var = fwVar.e;
            if (fwVar.s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            int i10 = 0;
            this.f0 = false;
            this.F1 = 0;
            int currentPosition = fwVar.getCurrentPosition();
            fwVar.d((getParent() == null || getVisibility() != 0 || (this.z1.size() == 0 && this.A1.size() == 0)) ? false : true);
            int i11 = this.d1;
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i11);
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i11).i7;
            ArrayList arrayList3 = this.n1;
            arrayList3.clear();
            ArrayList arrayList4 = d02.t0[0];
            int size = arrayList4.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i12);
                if (!d02.E0(stickerSetCovered.set.id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            py pyVar = this.G0;
            if (pyVar != null) {
                pyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Z0;
            org.telegram.ui.ActionBar.i6 i6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id)) {
                int i13 = d02.v0[0].isEmpty() ? 2 : 3;
                pv0 c10 = fwVar.c(i13, drawableArr[i13]);
                c10.h.setText(org.telegram.messenger.gd.M0(2131750820, null));
                c10.setContentDescription(org.telegram.messenger.gd.M0(2131750822, null));
                int i14 = this.F1;
                this.I1 = i14;
                this.F1 = i14 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i15 = this.F1;
                this.H1 = i15;
                this.F1 = i15 + 1;
                pv0 c11 = fwVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.gd.M0(2131750827, null));
                c11.setContentDescription(org.telegram.messenger.gd.M0(2131750830, null));
            }
            if (!this.k1.isEmpty()) {
                int i16 = this.F1;
                this.G1 = i16;
                this.F1 = i16 + 1;
                pv0 c12 = fwVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.gd.M0(2131746168, null));
                c12.setContentDescription(org.telegram.messenger.gd.M0(2131746169, null));
            }
            ArrayList arrayList5 = this.e1;
            arrayList5.clear();
            this.i1 = null;
            this.g1 = -1;
            this.f1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(d02.u0(0));
            }
            ArrayList arrayList6 = this.G2;
            int i17 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.y1;
                if (i17 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i17];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet q02 = d02.q0(stickerSetCovered2.set.id);
                    if (q02 == null || (stickerSet = q02.set) == null || stickerSet.archived) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet.set = stickerSetCovered2.set;
                        TLRPC.Document document2 = stickerSetCovered2.cover;
                        if (document2 != null) {
                            tL_messages_stickerSet.documents.add(document2);
                        } else if (!stickerSetCovered2.covers.isEmpty()) {
                            tL_messages_stickerSet.documents.addAll(stickerSetCovered2.covers);
                        }
                        if (!tL_messages_stickerSet.documents.isEmpty()) {
                            arrayList5.add(tL_messages_stickerSet);
                        }
                    } else {
                        stickerSetCoveredArr[i17] = null;
                    }
                }
                i17++;
                j3 = j10;
            }
            long j11 = j3;
            ArrayList y02 = org.telegram.messenger.mp.u1(i11).y0(arrayList6);
            for (int i18 = 0; i18 < y02.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) y02.get(i18);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j12 = org.telegram.messenger.mp.u1(i11).i7.getLong("group_hide_stickers_" + this.K1.id, -1L);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(this.K1.id));
                if (O0 == null || this.K1.stickerset == null || !org.telegram.messenger.v3.N(O0)) {
                    this.h1 = j12 != -1;
                } else {
                    TLRPC.StickerSet stickerSet3 = this.K1.stickerset;
                    if (stickerSet3 != null) {
                        this.h1 = j12 == stickerSet3.id;
                    }
                }
                TLRPC.ChatFull chatFull = this.K1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet a02 = d02.a0(stickerSet4);
                    if (a02 != null && (arrayList = a02.documents) != null && !arrayList.isEmpty() && a02.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = a02.documents;
                        tL_messages_stickerSet3.packs = a02.packs;
                        tL_messages_stickerSet3.set = a02.set;
                        if (this.h1) {
                            this.f1 = arrayList5.size();
                            arrayList5.add(tL_messages_stickerSet3);
                        } else {
                            this.f1 = 0;
                            arrayList5.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.K1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.i1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.h1) {
                        this.f1 = arrayList5.size();
                        arrayList5.add(tL_messages_stickerSet4);
                    } else {
                        this.f1 = 0;
                        arrayList5.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i19 = 0;
            while (i19 < arrayList5.size()) {
                if (i19 == this.f1) {
                    TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(this.K1.id));
                    if (O02 == null) {
                        arrayList5.remove(i10);
                        i19--;
                    } else {
                        this.f0 = true;
                        String str = "chat" + O02.id;
                        int i20 = fwVar.y;
                        fwVar.y = i20 + 1;
                        pv0 pv0Var = (pv0) fwVar.n.get(str);
                        if (pv0Var != null) {
                            fwVar.g(str, pv0Var, i20);
                        } else {
                            pv0Var = new pv0(fwVar.getContext(), i10);
                            pv0Var.setFocusable(true);
                            pv0Var.setOnClickListener(new xk0(fwVar, i10));
                            d61Var.addView(pv0Var, i20);
                            pv0Var.x = true;
                            b9 b9Var = new b9(i6Var2);
                            b9Var.u(org.telegram.messenger.g0.L(14.0f));
                            b9Var.q(O02);
                            int i21 = fwVar.a;
                            q9 q9Var = pv0Var.e;
                            q9Var.setLayerNum(i21);
                            q9Var.f(O02, b9Var);
                            q9Var.setAspectFit(true);
                            pv0Var.setExpanded(fwVar.g0);
                            pv0Var.a(fwVar.j0);
                            pv0Var.h.setText(O02.title);
                        }
                        pv0Var.d = true;
                        pv0Var.setTag(R.id.index_tag, Integer.valueOf(i20));
                        pv0Var.setSelected(i20 == fwVar.E);
                        fwVar.h.put(str, pv0Var);
                    }
                    i7 = 0;
                    i6Var = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i19);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i22 = 0; i22 < tL_messages_stickerSet5.documents.size(); i22++) {
                            document = tL_messages_stickerSet5.documents.get(i22);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.id) {
                                break;
                            }
                        }
                    }
                    document = null;
                    if (document == null) {
                        z11 = false;
                        document = tL_messages_stickerSet5.documents.get(0);
                    } else {
                        z11 = false;
                    }
                    Object w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet5.set.thumbs, 90, z11, null, z11);
                    if (w10 == null || tL_messages_stickerSet5.set.gifs) {
                        w10 = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.id;
                    int i23 = fwVar.y;
                    fwVar.y = i23 + 1;
                    pv0 pv0Var2 = (pv0) fwVar.n.get(str2);
                    if (pv0Var2 != null) {
                        fwVar.g(str2, pv0Var2, i23);
                    } else {
                        pv0Var2 = new pv0(fwVar.getContext(), 0);
                        pv0Var2.setFocusable(true);
                        pv0Var2.setOnClickListener(new xk0(fwVar, 1));
                        pv0Var2.setExpanded(fwVar.g0);
                        pv0Var2.a(fwVar.j0);
                        d61Var.addView(pv0Var2, i23);
                    }
                    pv0Var2.e.setLayerNum(fwVar.a);
                    i7 = 0;
                    pv0Var2.d = false;
                    pv0Var2.setTag(w10);
                    pv0Var2.setTag(R.id.index_tag, Integer.valueOf(i23));
                    pv0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    pv0Var2.setTag(R.id.object_tag, document);
                    pv0Var2.setSelected(i23 == fwVar.E);
                    fwVar.h.put(str2, pv0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    i6Var = null;
                    sb2.append(org.telegram.messenger.gd.M0(2131754757, null));
                    pv0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i10 = i7;
                i6Var2 = i6Var;
            }
            fwVar.h();
            fwVar.q();
            if (currentPosition != 0) {
                fwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        gw gwVar = this.D0;
        fw fwVar = this.C0;
        if (fwVar != null && gwVar == null && this.u1 != null) {
            fwVar.setTranslationY(this.u1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (gwVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.L0 && this.u1.p() != 1.0f;
        gwVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.z2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.y0, rect, null);
            float p10 = this.u1.p() * org.telegram.messenger.g0.L(50.0f);
            int i7 = rect.left;
            if (i7 != 0 || p10 != 0.0f) {
                this.Y1 = false;
            }
            gwVar.setTranslationX(i7);
            float translationY = (((getTranslationY() + getTop()) - gwVar.getTop()) - fwVar.getExpandedOffset()) - p10;
            if (gwVar.getTranslationY() != translationY) {
                gwVar.setTranslationY(translationY);
                gwVar.invalidate();
            }
        }
        if (this.Y1 && z10 && this.Q0) {
            fwVar.i(true, this.X1);
        } else {
            this.Y1 = false;
            fwVar.i(false, this.X1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    public final void a0() {
        int i7;
        boolean z10;
        LongSparseArray longSparseArray = this.A1;
        LongSparseArray longSparseArray2 = this.z1;
        int i10 = this.d1;
        aw awVar = this.E0;
        if (awVar == null) {
            return;
        }
        try {
            int childCount = awVar.getChildCount();
            ?? r72 = 0;
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = awVar.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.v3) || ((kj0) awVar.T(childAt)) == null) {
                    i7 = i11;
                } else {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    ArrayList arrayList = org.telegram.messenger.ri.d0(i10).v0[r72];
                    TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                    boolean z11 = (arrayList == null || !arrayList.contains(Long.valueOf(stickerSet.set.id))) ? r72 : true;
                    int i12 = r72;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.y1;
                        if (i12 >= stickerSetCoveredArr.length) {
                            i7 = i11;
                            z10 = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                        if (stickerSetCovered != null) {
                            i7 = i11;
                            if (stickerSetCovered.set.id == stickerSet.set.id) {
                                z10 = true;
                                break;
                            }
                        } else {
                            i7 = i11;
                        }
                        i12++;
                        i11 = i7;
                    }
                    v3Var.c(stickerSet, z11, true, 0, 0, z10);
                    if (z11) {
                        org.telegram.messenger.ri.d0(i10).h1(stickerSet.set.id);
                    }
                    boolean z12 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z13 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    if (z12 || z13) {
                        if (z12 && v3Var.r) {
                            longSparseArray2.remove(stickerSet.set.id);
                            z12 = false;
                        } else if (z13 && !v3Var.r) {
                            longSparseArray.remove(stickerSet.set.id);
                        }
                    }
                    v3Var.b(!z10 && z12, true);
                }
                i11 = i7 + 1;
                r72 = 0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // rh.a
    public final void b(int i7) {
        setBottomInset(i7);
    }

    @Override // rh.a
    public final void c(float f10) {
        this.s2 = f10;
        S();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.x10 x10Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.ks.x0;
        bx bxVar = this.S;
        mv mvVar = this.S2;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.z0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    E();
                    o();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    bxVar.F(false);
                    return;
                } else {
                    org.telegram.messenger.g0.r(mvVar);
                    org.telegram.messenger.g0.h3(mvVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.s3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                bxVar.F(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.z0) {
            a0();
            bc0 bc0Var = this.x;
            if (bc0Var != null) {
                int childCount = bc0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    bc0Var.getChildAt(i12).invalidate();
                }
            }
            Y(false);
            return;
        }
        if (i7 == org.telegram.messenger.ks.A0) {
            if (bxVar != null) {
                bxVar.F(false);
                return;
            }
            return;
        }
        int i13 = org.telegram.messenger.ks.B0;
        qx qxVar = this.T;
        if (i7 == i13) {
            Long l10 = (Long) objArr[0];
            long longValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                my myVar = this.A0;
                if (myVar != null && myVar.d == longValue2 && myVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    myVar.f = tL_messages_stickerSet.documents;
                    myVar.f();
                }
                if (qxVar != null && qxVar.d == longValue2 && qxVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    qxVar.f = tL_messages_stickerSet.documents;
                    qxVar.f();
                }
            }
            TLRPC.ChatFull chatFull2 = this.K1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                Y(false);
            }
            HashMap hashMap = this.s1;
            if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.x10) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (x10Var = (org.telegram.messenger.x10) hashMap.remove(l10)) != null) {
                x10Var.a(tL_messages_stickerSet);
            }
            org.telegram.messenger.g0.r(mvVar);
            org.telegram.messenger.g0.h3(mvVar, 100L);
            return;
        }
        int i14 = org.telegram.messenger.ks.l4;
        ex exVar = this.Q;
        if (i7 != i14) {
            if (i7 != org.telegram.messenger.ks.L2) {
                if (i7 == org.telegram.messenger.ks.i5) {
                    if (bxVar != null) {
                        bxVar.F(false);
                    }
                    U();
                    Y(false);
                    return;
                }
                return;
            }
            if (exVar == null || !this.e0) {
                return;
            }
            if ((this.W.c.k == 2 || exVar.getAdapter() == qxVar) && !TextUtils.isEmpty(qxVar.w)) {
                qxVar.F(qxVar.w, true);
                return;
            }
            return;
        }
        aw awVar = this.E0;
        if (awVar != null) {
            int childCount2 = awVar.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt = awVar.getChildAt(i15);
                if ((childAt instanceof org.telegram.ui.Cells.k8) || (childAt instanceof org.telegram.ui.Cells.a8)) {
                    childAt.invalidate();
                }
            }
        }
        if (exVar != null) {
            exVar.invalidate();
            int childCount3 = exVar.getChildCount();
            for (int i16 = 0; i16 < childCount3; i16++) {
                View childAt2 = exVar.getChildAt(i16);
                if (childAt2 instanceof zx) {
                    childAt2.invalidate();
                }
            }
        }
        iu iuVar = this.C1;
        if (iuVar != null) {
            iuVar.c.invalidate();
        }
        zw zwVar = this.q0;
        if (zwVar != null) {
            org.telegram.ui.d61 d61Var = zwVar.e;
            int childCount4 = d61Var.getChildCount();
            for (int i17 = 0; i17 < childCount4; i17++) {
                d61Var.getChildAt(i17).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        S();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.h) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (this.n.getVisibility() != 8 && !this.v0 && this.x0) {
            canvas.drawColor(i0.a.o(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        float R0 = org.telegram.messenger.g0.R0(this.r2);
        if (R0 > 0.0f) {
            int r12 = org.telegram.ui.ActionBar.n6.r1(R0, z(org.telegram.ui.ActionBar.n6.zf));
            int i7 = this.B2;
            GradientDrawable gradientDrawable = this.A2;
            if (i7 != r12) {
                gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.n6.r1(0.66f, r12), i0.a.o(r12, 0)});
                this.B2 = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.r2, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
        return drawChild;
    }

    public int getCurrentPage() {
        return this.B1;
    }

    public ArrayList<fx> getEmojipacks() {
        ArrayList<fx> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.r1;
            if (i7 >= arrayList2.size()) {
                return arrayList;
            }
            fx fxVar = (fx) arrayList2.get(i7);
            boolean z10 = fxVar.g;
            ArrayList arrayList3 = this.q1;
            if ((!z10 && (fxVar.f || arrayList3.contains(Long.valueOf(fxVar.b.id)))) || (fxVar.g && !fxVar.f && !arrayList3.contains(Long.valueOf(fxVar.b.id)))) {
                arrayList.add(fxVar);
            }
            i7++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.d2) {
            return org.telegram.messenger.j6.i;
        }
        if (this.C2 == null) {
            this.C2 = new ArrayList();
        }
        if (org.telegram.messenger.j6.i.size() != this.D2) {
            this.C2.clear();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.j6.i;
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (!((String) arrayList.get(i7)).startsWith("animated_")) {
                    this.C2.add((String) arrayList.get(i7));
                }
                i7++;
            }
            this.D2 = this.C2.size();
        }
        return this.C2;
    }

    public float getStickersExpandOffset() {
        fw fwVar = this.C0;
        if (fwVar == null) {
            return 0.0f;
        }
        return fwVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str == null) {
            return;
        }
        if (!str.startsWith("animated_") && !org.telegram.messenger.j6.h(str)) {
            return;
        }
        org.telegram.messenger.j6.a(str);
        int i7 = 0;
        if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
            org.telegram.messenger.j6.s();
            this.S.F(false);
        }
        org.telegram.messenger.j6.r();
        if (this.d2) {
            return;
        }
        ArrayList arrayList = this.C2;
        if (arrayList == null) {
            this.C2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        while (true) {
            ArrayList arrayList2 = org.telegram.messenger.j6.i;
            if (i7 >= arrayList2.size()) {
                this.D2 = this.C2.size();
                return;
            } else {
                if (!((String) arrayList2.get(i7)).startsWith("animated_")) {
                    this.C2.add((String) arrayList2.get(i7));
                }
                i7++;
            }
        }
    }

    public final void i(int i7, int i10, boolean z10) {
        if (i7 == 2 || x(i7).K(0) == null) {
            return;
        }
        pw pwVar = new pw(getContext(), i10);
        pwVar.a = !z10 ? 1 : 0;
        w(i7).w0(pwVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            X();
            return;
        }
        int size = this.k1.size();
        int size2 = this.l1.size();
        int i7 = this.d1;
        this.k1 = org.telegram.messenger.ri.d0(i7).k0(0, true);
        this.l1 = org.telegram.messenger.ri.d0(i7).k0(2, false);
        if (org.telegram.messenger.j10.i(i7).q()) {
            this.m1 = org.telegram.messenger.ri.d0(i7).k0(7, false);
        } else {
            this.m1 = new ArrayList();
        }
        for (int i10 = 0; i10 < this.l1.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) this.l1.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.k1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.k1.get(i11);
                    if (document2.dc_id == document.dc_id && document2.id == document.id) {
                        this.k1.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (org.telegram.messenger.mp.u1(i7).K3()) {
            int i12 = 0;
            while (i12 < this.l1.size()) {
                if (org.telegram.messenger.fj.X3((TLRPC.Document) this.l1.get(i12))) {
                    this.l1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.k1.size()) {
                if (org.telegram.messenger.fj.X3((TLRPC.Document) this.k1.get(i13))) {
                    this.k1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.k1.size() || size2 != this.l1.size()) {
            Y(false);
        }
        jy jyVar = this.z0;
        if (jyVar != null) {
            jyVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        rx rxVar = this.u1;
        te.a aVar = this.b;
        ex exVar = this.Q;
        sv svVar = this.W;
        if (rxVar != null && rxVar.z()) {
            v4.f1 K = exVar.K(0);
            if (K == null) {
                ey.a(svVar, true, !z10);
            } else {
                ey.a(svVar, K.a.getTop() < exVar.getPaddingTop(), !z10);
            }
            O(false, !z10);
            svVar.setTranslationY(aVar.e * org.telegram.messenger.g0.L(15.0f));
            return;
        }
        if (svVar == null || exVar == null) {
            return;
        }
        svVar.setTranslationY((aVar.e * org.telegram.messenger.g0.L(15.0f)) + (exVar.K(0) != null ? r0.a.getTop() : -this.c1));
        svVar.a.a(false, !z10);
        m(Math.round(this.J.getTranslationY()));
    }

    public final void m(int i7) {
        ObjectAnimator objectAnimator = this.S0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            v4.f1 K = this.Q.K(0);
            int L = org.telegram.messenger.g0.L(38.0f) + i7;
            if (L > 0 && (K == null || K.a.getBottom() < L)) {
                z10 = true;
            }
            O(z10, !this.L1);
        }
    }

    public final void n(int i7, View view) {
        ex exVar;
        v4.f1 K;
        ww wwVar = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            wwVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.g0) {
            return;
        }
        rx rxVar = this.u1;
        if (rxVar == null || !rxVar.z()) {
            if (i7 > 0 && (exVar = this.Q) != null && exVar.getVisibility() == 0 && (K = exVar.K(0)) != null) {
                if (K.a.getTop() + (this.e0 ? this.c1 : 0) >= exVar.getPaddingTop()) {
                    return;
                }
            }
            int i10 = iArr[1] - i7;
            iArr[1] = i10;
            if (i10 > 0) {
                iArr[1] = 0;
            } else if (i10 < (-org.telegram.messenger.g0.L(108.0f))) {
                iArr[1] = -org.telegram.messenger.g0.L(108.0f);
            }
            wwVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        fw fwVar = this.C0;
        if (fwVar == null || (L0 = this.F0.L0()) == -1) {
            return;
        }
        int i7 = this.H1;
        if (i7 <= 0 && (i7 = this.G1) <= 0) {
            i7 = this.F1;
        }
        fwVar.k(this.z0.F(L0), i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xi.e eVar = this.N2;
        if (eVar != null) {
            eVar.b();
            this.N2 = null;
        }
        xi.e eVar2 = (xi.e) new org.telegram.messenger.js(org.telegram.messenger.ks.f(this.d1), this).b;
        eVar2.f(org.telegram.messenger.ks.l4);
        eVar2.c(org.telegram.messenger.ks.L2);
        eVar2.c(org.telegram.messenger.ks.s3);
        this.N2 = eVar2;
        if (this.z0 != null) {
            eVar2.c(org.telegram.messenger.ks.x0);
            eVar2.c(org.telegram.messenger.ks.X0);
            eVar2.c(org.telegram.messenger.ks.z0);
            eVar2.c(org.telegram.messenger.ks.B0);
            eVar2.c(org.telegram.messenger.ks.i5);
            org.telegram.messenger.g0.g3(new mv(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iu iuVar = this.C1;
        if (iuVar != null && iuVar.isShowing()) {
            iuVar.dismiss();
        }
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        if (p10.l == this.h2) {
            p10.W = null;
            p10.a0 = null;
            p10.Y = null;
            p10.l = null;
            p10.c0 = null;
            p10.t();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.P1 != i13) {
            this.P1 = i13;
            E();
        }
        super.onLayout(z10, i7, i10, i11, i12);
        S();
        Z();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.L1 = true;
        boolean z10 = org.telegram.messenger.g0.E;
        View view = this.w;
        boolean z11 = this.e0;
        if (z10 || this.O1) {
            if (this.M1 != 1) {
                if (!this.M2) {
                    setOutlineProvider(this.N1);
                    setClipToOutline(true);
                    setElevation(org.telegram.messenger.g0.L(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i11 = org.telegram.ui.ActionBar.n6.zf;
                background.setColorFilter(new PorterDuffColorFilter(z(i11), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.v0) {
                    view.setBackgroundColor(z(i11));
                }
                this.M1 = 1;
            }
        } else if (this.M1 != 0) {
            if (!this.M2) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.v0) {
                int i12 = org.telegram.ui.ActionBar.n6.zf;
                setBackgroundColor(z(i12));
                if (z11) {
                    view.setBackgroundColor(z(i12));
                }
            }
            this.M1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
        this.L1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i7) {
        int L0;
        int L02;
        if (i7 == 0) {
            if (this.K0 || (L02 = this.F0.L0()) == -1 || this.E0 == null) {
                return;
            }
            int i10 = this.H1;
            if (i10 <= 0 && (i10 = this.G1) <= 0) {
                i10 = this.F1;
            }
            this.C0.k(this.z0.F(L02), i10);
            return;
        }
        if (i7 == 2) {
            v4.i0 adapter = this.i0.getAdapter();
            vx vxVar = this.o0;
            if (adapter != vxVar || vxVar.J < 0 || this.t0 < 0 || this.s0 < 0 || (L0 = this.j0.L0()) == -1) {
                return;
            }
            this.q0.k(L0 >= vxVar.J ? this.t0 : this.s0, 0);
        }
    }

    public final void q(boolean z10) {
        rx rxVar = this.u1;
        te.a aVar = this.a;
        aw awVar = this.E0;
        ew ewVar = this.H0;
        if (rxVar != null && rxVar.z()) {
            v4.f1 K = awVar.K(0);
            if (K == null) {
                ey.a(ewVar, true, !z10);
            } else {
                ey.a(ewVar, K.a.getTop() < awVar.getPaddingTop(), !z10);
            }
            ewVar.setTranslationY(aVar.e * org.telegram.messenger.g0.L(15.0f));
            return;
        }
        if (ewVar == null || awVar == null) {
            return;
        }
        ewVar.setTranslationY((aVar.e * org.telegram.messenger.g0.L(15.0f)) + (awVar.K(0) != null ? r0.a.getTop() : -this.c1));
        ewVar.a.a(false, !z10);
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.j6.a;
        org.telegram.messenger.mp.f1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.j6.h.clear();
        org.telegram.messenger.j6.i.clear();
        org.telegram.messenger.j6.r();
        this.S.F(false);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.L1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j3, boolean z10) {
        ey eyVar;
        v4.c0 c0Var;
        View view;
        ck0 ck0Var;
        int i7;
        int i10;
        TLRPC.TL_messages_stickerSet q02;
        jy jyVar;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j3 != -1 && (q02 = org.telegram.messenger.ri.d0(this.d1).q0(j3)) != null && (E = (jyVar = this.z0).E(q02)) >= 0 && E < jyVar.b()) {
            I(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        vx vxVar = this.k0;
        if (vxVar != null) {
            vxVar.L = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            ck0 ck0Var2 = this.E0;
            ck0 ck0Var3 = this.i0;
            xv xvVar = this.p0;
            ck0 ck0Var4 = this.Q;
            if (i13 == 0) {
                eyVar = this.W;
                c0Var = this.R;
                view = this.J;
                ck0Var = ck0Var4;
            } else if (i13 == 1) {
                c0Var = this.j0;
                view = this.q0;
                ck0Var = ck0Var3;
                eyVar = xvVar;
            } else {
                eyVar = this.H0;
                c0Var = this.F0;
                view = this.C0;
                ck0Var = ck0Var2;
            }
            if (eyVar == null) {
                i10 = i12;
                i7 = i11;
            } else {
                int i14 = i12;
                dy dyVar = eyVar.r;
                int i15 = i11;
                eyVar.d.setText("");
                if (dyVar != null) {
                    dyVar.I1(null);
                    dyVar.G1();
                }
                int i16 = this.c1;
                if (i13 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.N0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i13 == 1) {
                        float[] fArr = new float[1];
                        fArr[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ck0Var, (Property<ck0, Float>) property, fArr);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[i14] = ofFloat;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr2 = new float[1];
                        fArr2[i14] = 0.0f;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ck0Var, (Property<ck0, Float>) property, fArr3);
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(eyVar, (Property<ey, Float>) property, fArr4);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[i14] = ofFloat2;
                        animatorArr2[1] = ofFloat3;
                        animatorArr2[i15] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(lr.h);
                    this.N0.addListener(new fi.a3(this, c0Var, ck0Var, 6));
                    this.N0.start();
                    i10 = i14;
                    i7 = i15;
                } else {
                    if (eyVar != xvVar) {
                        eyVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i7 = i15;
                    if (view != null && i13 != i7) {
                        view.setTranslationY(0.0f);
                    }
                    if (ck0Var == ck0Var2) {
                        i10 = i14;
                        ck0Var.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.r2);
                    } else {
                        i10 = i14;
                        if (ck0Var == ck0Var3) {
                            ck0Var.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.r2);
                        } else {
                            if (ck0Var == ck0Var4) {
                                ck0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.r2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
            i13++;
            i11 = i7;
            i12 = i10;
        }
        int i17 = i12;
        if (z10) {
            return;
        }
        this.u1.i(i17);
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        org.telegram.ui.ActionBar.i6 i6Var = this.a2;
        iw iwVar = this.y;
        if (iwVar != null) {
            fh.g c10 = cVar.c(iwVar, null, false);
            c10.p(c8.i0.e(i6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            iwVar.setBackground(c10);
        }
        ImageView imageView = this.F;
        if (imageView != null) {
            fh.g c11 = cVar.c(imageView, null, false);
            c11.p(c8.i0.e(i6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            imageView.setBackground(c11);
        }
        bc0 bc0Var = this.x;
        if (bc0Var != null) {
            fh.g c12 = cVar.c(bc0Var, null, false);
            c12.p(c8.i0.e(i6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            bc0Var.setBackground(c12);
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            fh.g c13 = cVar.c(imageView2, null, false);
            c13.p(c8.i0.e(i6Var));
            c13.r(org.telegram.messenger.g0.L(18.0f));
            c13.q(org.telegram.messenger.g0.L(6.0f));
            imageView2.setBackground(c13);
        }
    }

    public void setBottomInset(int i7) {
        if (this.r2 != i7) {
            this.r2 = i7;
            j(i7, this.L);
            j(i7, this.N);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.Q);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.E0);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.i0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i7);
            }
            S();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.K1 = chatFull;
        Y(false);
    }

    public void setDelegate(rx rxVar) {
        this.u1 = rxVar;
    }

    public void setDragListener(yw ywVar) {
        this.P0 = ywVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ew ewVar = this.H0;
        if (ewVar != null) {
            ewVar.d.setEnabled(z10);
        }
        xv xvVar = this.p0;
        if (xvVar != null) {
            xvVar.d.setEnabled(z10);
        }
        sv svVar = this.W;
        if (svVar != null) {
            svVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.O1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.v0 != z10) {
            this.v0 = z10;
            updateColors();
        }
    }

    public void setShowing(boolean z10) {
        this.Q0 = z10;
        Z();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        Z();
        S();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        boolean z10 = getVisibility() != i7;
        super.setVisibility(i7);
        if (z10) {
            if (i7 != 8) {
                org.telegram.messenger.j6.s();
                this.S.F(false);
                xi.e eVar = this.O2;
                int i10 = this.d1;
                if (eVar == null) {
                    xi.e eVar2 = (xi.e) new org.telegram.messenger.js(org.telegram.messenger.ks.f(i10), this).b;
                    eVar2.c(org.telegram.messenger.ks.x0);
                    this.O2 = eVar2;
                }
                if (this.z0 != null) {
                    if (!this.P2) {
                        this.P2 = true;
                        this.O2.c(org.telegram.messenger.ks.X0);
                    }
                    Y(false);
                    E();
                }
                k(true);
                k(false);
                org.telegram.messenger.ri.d0(i10).Y0(0, true, true, false);
                org.telegram.messenger.ri.d0(i10).Y0(0, false, true, false);
                org.telegram.messenger.ri.d0(i10).Y0(2, false, true, false);
            }
            jg.d1 d1Var = this.U0;
            if (d1Var != null) {
                d1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        jy jyVar;
        boolean z11 = this.U2;
        this.U2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i7 = this.B1;
        if (i7 == 0) {
            bx bxVar = this.S;
            if (bxVar != null) {
                bxVar.F(false);
                return;
            }
            return;
        }
        if (i7 == 1) {
            vx vxVar = this.o0;
            if (vxVar != null) {
                vxVar.f();
                return;
            }
            return;
        }
        if (i7 != 2 || (jyVar = this.z0) == null) {
            return;
        }
        jyVar.f();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            T();
            ui.c cVar = this.m2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.n6.d6));
            }
            bc0 bc0Var = this.x;
            if (bc0Var != null) {
                bc0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.n6.Gf), 20));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int v(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, this.a2), (int) (f10 * 255.0f));
    }

    public final v4.t w(int i7) {
        if (i7 == 0) {
            return this.F0;
        }
        if (i7 == 1) {
            return this.R;
        }
        if (i7 == 2) {
            return this.j0;
        }
        throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
    }

    public final ck0 x(int i7) {
        if (i7 == 0) {
            return this.E0;
        }
        if (i7 == 1) {
            return this.Q;
        }
        if (i7 == 2) {
            return this.i0;
        }
        throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
    }

    public final HorizontalScrollView y(int i7) {
        if (i7 == 0) {
            return this.C0;
        }
        if (i7 == 1) {
            return this.J;
        }
        if (i7 == 2) {
            return this.q0;
        }
        throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
    }

    public final int z(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.a2;
        return i6Var != null ? i6Var.k(i7) : org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final void D(float f10, int i7) {
    }
}
