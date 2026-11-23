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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class qy extends FrameLayout implements org.telegram.ui.ActionBar.c6, te.b, org.telegram.messenger.fs, rh.a {
    public static final /* synthetic */ int V2 = 0;
    public final ly A0;
    public final LongSparseArray A1;
    public final GradientDrawable A2;
    public final qv B0;
    public int B1;
    public int B2;
    public final ew C0;
    public final iu C1;
    public ArrayList C2;
    public final fw D0;
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
    public oy G0;
    public int G1;
    public ArrayList G2;
    public AnimatorSet H;
    public final dw H0;
    public int H1;
    public Drawable H2;
    public float I;
    public final ph.c I0;
    public int I1;
    public int I2;
    public final vw J;
    public boolean J0;
    public int J1;
    public int J2;
    public final qw K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final org.telegram.ui.w61 L;
    public boolean L0;
    public boolean L1;
    public int L2;
    public final ph.a M;
    public final kx M0;
    public int M1;
    public boolean M2;
    public final org.telegram.ui.w61 N;
    public AnimatorSet N0;
    public final bg.r0 N1;
    public xi.e N2;
    public final ph.a O;
    public final di.xb O0;
    public boolean O1;
    public xi.e O2;
    public final View P;
    public xw P0;
    public int P1;
    public boolean P2;
    public final dx Q;
    public boolean Q0;
    public boolean Q1;
    public AnimatorSet Q2;
    public final rw R;
    public final int[] R0;
    public boolean R1;
    public h2.m0 R2;
    public final ax S;
    public final ObjectAnimator[] S0;
    public yx S1;
    public final mv S2;
    public final px T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public oy U;
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
    public final org.telegram.ui.ActionBar.g2 Z1;
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
    public final rc g2;
    public final gw h;
    public final uv h0;
    public boolean h1;
    public final mw h2;
    public final vv i0;
    public TLRPC.TL_messages_stickerSet i1;
    public boolean i2;
    public final vx j0;
    public ArrayList j1;
    public final boolean j2;
    public final ux k0;
    public ArrayList k1;
    public final dh.g k2;
    public final xx l0;
    public ArrayList l1;
    public final jh l2;
    public final HashMap m0;
    public ArrayList m1;
    public final ui.c m2;
    public final FrameLayout n;
    public final qv n0;
    public final ArrayList n1;
    public final dh.c n2;
    public final ux o0;
    public final ArrayList o1;
    public final ri.q o2;
    public final xv p0;
    public final ArrayList p1;
    public boolean p2;
    public final yw q0;
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
    public qx u1;
    public int u2;
    public boolean v0;
    public long v1;
    public int v2;
    public final View w;
    public boolean w0;
    public boolean w1;
    public long w2;
    public final zb0 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final hw y;
    public final yv y0;
    public final TLRPC.StickerSetCovered[] y1;
    public boolean y2;
    public final iy z0;
    public final LongSparseArray z1;
    public final Rect z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0cc6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0c57 A[Catch: Exception -> 0x0c6d, TRY_LEAVE, TryCatch #1 {Exception -> 0x0c6d, blocks: (B:155:0x0c41, B:157:0x0c49, B:159:0x0c4f, B:160:0x0c54, B:162:0x0c57), top: B:154:0x0c41 }] */
    /* JADX WARN: Type inference failed for: r12v23, types: [org.telegram.ui.Components.qj0, org.telegram.ui.Components.qv] */
    /* JADX WARN: Type inference failed for: r4v72, types: [org.telegram.ui.Components.qj0, org.telegram.ui.Components.qv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qy(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.i6 i6Var, boolean z15, boolean z16) {
        super(context);
        int i7;
        boolean z17;
        Field field;
        boolean z18;
        ax axVar;
        String string;
        String str;
        kr krVar = kr.h;
        this.a = new te.a(0, this, krVar, 320L, false);
        this.b = new te.a(1, this, krVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.d0 = true;
        this.l0 = new xx(this);
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
        int i10 = org.telegram.messenger.i10.t0;
        this.d1 = i10;
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
        this.g2 = new rc(this, 6);
        this.h2 = new mw(this);
        this.i2 = true;
        ri.q qVar = new ri.q();
        this.o2 = qVar;
        this.s2 = -1.0f;
        this.u2 = -1;
        this.v2 = -1;
        this.w2 = -1L;
        this.x2 = false;
        this.y2 = true;
        this.z2 = new Rect();
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new te.a(0, new nv(this, 3), krVar, 380L, true);
        this.S2 = new mv(this, 1);
        this.T2 = false;
        this.v0 = z14;
        this.Z1 = g2Var;
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
        int i11 = org.telegram.ui.ActionBar.n6.If;
        org.telegram.ui.ActionBar.w5 W5 = org.telegram.ui.ActionBar.n6.W(context, R.drawable.emoji_tabs_new2, z(i11), z(i11));
        this.c2 = W5;
        this.Z0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.a1 = new Drawable[]{org.telegram.ui.ActionBar.n6.W(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf)), org.telegram.ui.ActionBar.n6.W(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf))};
        this.b1 = new String[]{org.telegram.messenger.gd.N0(2131751183, null), org.telegram.messenger.gd.N0(2131751182, null), org.telegram.messenger.gd.N0(2131751181, null), org.telegram.messenger.gd.N0(2131751180, null), org.telegram.messenger.gd.N0(2131751179, null), org.telegram.messenger.gd.N0(2131751178, null), org.telegram.messenger.gd.N0(2131751177, null), org.telegram.messenger.gd.N0(2131751176, null)};
        this.K1 = chatFull;
        Paint paint = new Paint(1);
        this.t1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.n6.Sf));
        float L2 = org.telegram.messenger.g0.L(6.0f);
        bg.q0 q0Var = bg.u0.a;
        this.N1 = new bg.r0(L2);
        qw qwVar = new qw(this, context);
        this.K = qwVar;
        my myVar = new my();
        myVar.a = 0;
        myVar.b = qwVar;
        arrayList.add(myVar);
        if (z10) {
            org.telegram.messenger.ri.d0(i10).D(5);
            org.telegram.messenger.ri.d0(i10).y();
            this.f2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.n6.Fi), PorterDuff.Mode.SRC_IN);
        }
        dx dxVar = new dx(this, context);
        this.Q = dxVar;
        qVar.b(dxVar);
        v4.l lVar = new v4.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = kr.g;
        dxVar.setItemAnimator(lVar);
        final int i12 = 0;
        dxVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ov
            public final /* synthetic */ qy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i12) {
                    case 0:
                        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                        qy qyVar = this.b;
                        dx dxVar2 = qyVar.Q;
                        qyVar.getMeasuredHeight();
                        return p10.r(motionEvent, dxVar2, null, qyVar.h2, i6Var);
                    case 1:
                        org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                        qy qyVar2 = this.b;
                        return p11.r(motionEvent, qyVar2.i0, qyVar2.n0, qyVar2.h2, i6Var);
                    default:
                        org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                        qy qyVar3 = this.b;
                        aw awVar = qyVar3.E0;
                        qyVar3.getMeasuredHeight();
                        return p12.r(motionEvent, awVar, qyVar3.B0, qyVar3.h2, i6Var);
                }
            }
        });
        dxVar.setOnItemLongClickListener(new nv(this, 1));
        dxVar.setInstantClick(true);
        rw rwVar = new rw(this);
        this.R = rwVar;
        dxVar.setLayoutManager(rwVar);
        dxVar.setTopGlowOffset(org.telegram.messenger.g0.L(38.0f));
        dxVar.setBottomGlowOffset(org.telegram.messenger.g0.L(36.0f));
        dxVar.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f));
        int i13 = org.telegram.ui.ActionBar.n6.zf;
        org.telegram.ui.ActionBar.u6.l(dxVar, 21, i13, i6Var);
        dxVar.setItemSelectorColorProvider(new k2(23));
        dxVar.setClipToPadding(false);
        rwVar.O = new sw(this);
        ax axVar2 = new ax(this);
        this.S = axVar2;
        dxVar.setAdapter(axVar2);
        dxVar.i(new ai.f0(this, 4));
        this.T = new px(this, context);
        qwVar.addView(dxVar, c8.na.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(dxVar, rwVar);
        this.c0 = l5Var;
        l5Var.r = new tw(this);
        dxVar.setOnScrollListener(new uw(this));
        vw vwVar = new vw(this, context, i6Var, z10, g2Var != null ? new mv(this, 2) : null, z16);
        this.J = vwVar;
        if (z13) {
            sv svVar = new sv(this, context);
            this.W = svVar;
            qwVar.addView(svVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            svVar.d.setOnFocusChangeListener(new tv(this));
            ph.c cVar2 = new ph.c(context, i6Var);
            this.V = cVar2;
            cVar2.setVisibility(8);
            final int i14 = 0;
            cVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pv
                public final /* synthetic */ qy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            px pxVar = this.b.T;
                            lx lxVar = pxVar.c;
                            int childCount = lxVar.getChildCount();
                            for (int i15 = 0; i15 < childCount; i15++) {
                                ((ph.b) lxVar.getChildAt(i15)).a(false, true);
                            }
                            pxVar.d = 0L;
                            pxVar.G.b.a(false, true);
                            pxVar.f();
                            break;
                        case 1:
                            ly lyVar = this.b.A0;
                            lx lxVar2 = lyVar.c;
                            int childCount2 = lxVar2.getChildCount();
                            for (int i16 = 0; i16 < childCount2; i16++) {
                                ((ph.b) lxVar2.getChildAt(i16)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.R.a.a(false, true);
                            lyVar.f();
                            break;
                        case 2:
                            qx qxVar = this.b.u1;
                            if (qxVar != null) {
                                qxVar.w();
                                break;
                            }
                            break;
                        default:
                            qy qyVar = this.b;
                            int currentItem = qyVar.h.getCurrentItem();
                            dy dyVar = currentItem == 0 ? qyVar.W : currentItem == 1 ? qyVar.p0 : qyVar.H0;
                            if (dyVar != null) {
                                fq fqVar = dyVar.d;
                                fqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                fqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                fqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            qwVar.addView(cVar2, new FrameLayout.LayoutParams(-1, L));
        }
        if (Color.alpha(z(i13)) >= 255) {
            org.telegram.ui.ActionBar.u6.h(i13, vwVar, i6Var);
        }
        axVar2.G(true);
        vwVar.p(getEmojipacks());
        qwVar.addView(vwVar, c8.na.c(36.0f, -1));
        View view = new View(context);
        this.P = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i15 = org.telegram.ui.ActionBar.n6.Cf;
        org.telegram.ui.ActionBar.u6.h(i15, view, i6Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(36.0f);
        qwVar.addView(view, layoutParams);
        ph.a aVar = new ph.a(context, i6Var);
        this.M = aVar;
        org.telegram.ui.w61 w61Var = new org.telegram.ui.w61(context, i6Var);
        this.L = w61Var;
        w61Var.setVisibility(8);
        w61Var.addView(aVar, c8.na.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        qwVar.addView(w61Var, c8.na.e(-1, -2, 80));
        if (z11) {
            fl0 fl0Var = fl0.b;
            if (z12) {
                uv uvVar = new uv(this, context);
                this.h0 = uvVar;
                my myVar2 = new my();
                myVar2.a = 1;
                myVar2.b = uvVar;
                this.d.add(myVar2);
                vv vvVar = new vv(this, context);
                this.i0 = vvVar;
                qVar.b(vvVar);
                vvVar.setClipToPadding(false);
                vx vxVar = new vx(this);
                this.j0 = vxVar;
                vvVar.setLayoutManager(vxVar);
                vvVar.i(new wv(this));
                vvVar.setPadding(0, L, 0, org.telegram.messenger.g0.L(44.0f) + this.r2);
                ((v4.h1) vvVar.getItemAnimator()).m = false;
                final int i16 = 1;
                ux uxVar = new ux(this, context, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.o0 = uxVar;
                vvVar.setAdapter(uxVar);
                this.k0 = new ux(this, context, false, 0);
                vvVar.setOnScrollListener(new py(this, 2));
                vvVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ov
                    public final /* synthetic */ qy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i16) {
                            case 0:
                                org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                                qy qyVar = this.b;
                                dx dxVar2 = qyVar.Q;
                                qyVar.getMeasuredHeight();
                                return p10.r(motionEvent, dxVar2, null, qyVar.h2, i6Var);
                            case 1:
                                org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                                qy qyVar2 = this.b;
                                return p11.r(motionEvent, qyVar2.i0, qyVar2.n0, qyVar2.h2, i6Var);
                            default:
                                org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                                qy qyVar3 = this.b;
                                aw awVar = qyVar3.E0;
                                qyVar3.getMeasuredHeight();
                                return p12.r(motionEvent, awVar, qyVar3.B0, qyVar3.h2, i6Var);
                        }
                    }
                });
                final int i17 = 0;
                ?? r12 = new qj0(this) { // from class: org.telegram.ui.Components.qv
                    public final /* synthetic */ qy b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.qj0
                    public final void b(int i18, View view2) {
                        switch (i17) {
                            case 0:
                                qy qyVar = this.b;
                                vv vvVar2 = qyVar.i0;
                                ux uxVar2 = qyVar.k0;
                                ux uxVar3 = qyVar.o0;
                                if (qyVar.u1 != null) {
                                    uxVar3.getClass();
                                    ArrayList arrayList2 = uxVar3.y;
                                    if (vvVar2.getAdapter() != uxVar3) {
                                        if (vvVar2.getAdapter() == uxVar2 && i18 >= 0 && i18 < uxVar2.y.size()) {
                                            qyVar.u1.v(view2, uxVar2.y.get(i18), uxVar2.x, uxVar2.n, true, 0, 0);
                                            qyVar.X();
                                            break;
                                        }
                                    } else if (i18 >= 0) {
                                        int i19 = uxVar3.I;
                                        if (i18 >= i19) {
                                            int i20 = i19 > 0 ? (i18 - i19) - 1 : i18;
                                            if (i20 >= 0 && i20 < arrayList2.size()) {
                                                qyVar.u1.v(view2, arrayList2.get(i20), null, uxVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            qyVar.u1.v(view2, qyVar.j1.get(i18), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                qy qyVar2 = this.b;
                                v4.i0 adapter = qyVar2.E0.getAdapter();
                                ly lyVar = qyVar2.A0;
                                String str2 = adapter == lyVar ? lyVar.O : null;
                                if (view2 instanceof org.telegram.ui.Cells.z7) {
                                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view2;
                                    if (z7Var.getSticker() != null && org.telegram.messenger.fj.X3(z7Var.getSticker()) && !org.telegram.messenger.i10.i(org.telegram.messenger.c.a(qyVar2.d1).a).q()) {
                                        org.telegram.ui.ns.p().x(z7Var);
                                        break;
                                    } else {
                                        org.telegram.ui.ns.p().t();
                                        if (!z7Var.r) {
                                            z7Var.r = true;
                                            z7Var.n = 0.5f;
                                            z7Var.y = 0L;
                                            org.telegram.ui.Cells.y7 y7Var = z7Var.a;
                                            y7Var.setAlpha(0.5f * z7Var.I);
                                            y7Var.invalidate();
                                            z7Var.s = System.currentTimeMillis();
                                            z7Var.invalidate();
                                            qyVar2.u1.m(z7Var, z7Var.getSticker(), str2, z7Var.getParentObject(), z7Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.n0 = r12;
                vvVar.setOnItemClickListener((qj0) r12);
                uvVar.addView(vvVar, c8.na.c(-1.0f, -1));
                xv xvVar = new xv(this, context);
                this.p0 = xvVar;
                uvVar.addView(xvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
                yw ywVar = new yw(this, context, i6Var);
                this.q0 = ywVar;
                ywVar.setType(fl0Var);
                ywVar.setUnderlineHeight(org.telegram.messenger.g0.f1());
                ywVar.setIndicatorColor(z(i11));
                ywVar.setUnderlineColor(z(i15));
                org.telegram.ui.ActionBar.u6.h(i13, ywVar, i6Var);
                W();
                ywVar.setDelegate(new nv(this, 2));
                uxVar.F("", "", true, true, true);
            }
            yv yvVar = new yv(this, context, z14);
            this.y0 = yvVar;
            org.telegram.messenger.ri.d0(this.d1).D(0);
            org.telegram.messenger.ri.d0(this.d1).z();
            aw awVar = new aw(this, context);
            this.E0 = awVar;
            this.o2.b(awVar);
            bw bwVar = new bw(this);
            this.F0 = bwVar;
            awVar.setLayoutManager(bwVar);
            bwVar.O = new cw(this);
            awVar.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f));
            awVar.setClipToPadding(false);
            my myVar3 = new my();
            myVar3.a = 2;
            myVar3.b = yvVar;
            this.d.add(myVar3);
            this.A0 = new ly(this, context);
            iy iyVar = new iy(this, context);
            this.z0 = iyVar;
            awVar.setAdapter(iyVar);
            final int i18 = 2;
            awVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.ov
                public final /* synthetic */ qy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i18) {
                        case 0:
                            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                            qy qyVar = this.b;
                            dx dxVar2 = qyVar.Q;
                            qyVar.getMeasuredHeight();
                            return p10.r(motionEvent, dxVar2, null, qyVar.h2, i6Var);
                        case 1:
                            org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                            qy qyVar2 = this.b;
                            return p11.r(motionEvent, qyVar2.i0, qyVar2.n0, qyVar2.h2, i6Var);
                        default:
                            org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                            qy qyVar3 = this.b;
                            aw awVar2 = qyVar3.E0;
                            qyVar3.getMeasuredHeight();
                            return p12.r(motionEvent, awVar2, qyVar3.B0, qyVar3.h2, i6Var);
                    }
                }
            });
            final int i19 = 1;
            ?? r42 = new qj0(this) { // from class: org.telegram.ui.Components.qv
                public final /* synthetic */ qy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.qj0
                public final void b(int i182, View view2) {
                    switch (i19) {
                        case 0:
                            qy qyVar = this.b;
                            vv vvVar2 = qyVar.i0;
                            ux uxVar2 = qyVar.k0;
                            ux uxVar3 = qyVar.o0;
                            if (qyVar.u1 != null) {
                                uxVar3.getClass();
                                ArrayList arrayList2 = uxVar3.y;
                                if (vvVar2.getAdapter() != uxVar3) {
                                    if (vvVar2.getAdapter() == uxVar2 && i182 >= 0 && i182 < uxVar2.y.size()) {
                                        qyVar.u1.v(view2, uxVar2.y.get(i182), uxVar2.x, uxVar2.n, true, 0, 0);
                                        qyVar.X();
                                        break;
                                    }
                                } else if (i182 >= 0) {
                                    int i192 = uxVar3.I;
                                    if (i182 >= i192) {
                                        int i20 = i192 > 0 ? (i182 - i192) - 1 : i182;
                                        if (i20 >= 0 && i20 < arrayList2.size()) {
                                            qyVar.u1.v(view2, arrayList2.get(i20), null, uxVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        qyVar.u1.v(view2, qyVar.j1.get(i182), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            qy qyVar2 = this.b;
                            v4.i0 adapter = qyVar2.E0.getAdapter();
                            ly lyVar = qyVar2.A0;
                            String str2 = adapter == lyVar ? lyVar.O : null;
                            if (view2 instanceof org.telegram.ui.Cells.z7) {
                                org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view2;
                                if (z7Var.getSticker() != null && org.telegram.messenger.fj.X3(z7Var.getSticker()) && !org.telegram.messenger.i10.i(org.telegram.messenger.c.a(qyVar2.d1).a).q()) {
                                    org.telegram.ui.ns.p().x(z7Var);
                                    break;
                                } else {
                                    org.telegram.ui.ns.p().t();
                                    if (!z7Var.r) {
                                        z7Var.r = true;
                                        z7Var.n = 0.5f;
                                        z7Var.y = 0L;
                                        org.telegram.ui.Cells.y7 y7Var = z7Var.a;
                                        y7Var.setAlpha(0.5f * z7Var.I);
                                        y7Var.invalidate();
                                        z7Var.s = System.currentTimeMillis();
                                        z7Var.invalidate();
                                        qyVar2.u1.m(z7Var, z7Var.getSticker(), str2, z7Var.getParentObject(), z7Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.B0 = r42;
            awVar.setOnItemClickListener((qj0) r42);
            org.telegram.ui.ActionBar.u6.l(awVar, 21, i13, i6Var);
            yvVar.addView(awVar);
            this.b0 = new org.telegram.ui.ActionBar.l5(awVar, bwVar);
            dw dwVar = new dw(this, context);
            this.H0 = dwVar;
            yvVar.addView(dwVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            ph.c cVar3 = new ph.c(context, i6Var);
            this.I0 = cVar3;
            cVar3.setVisibility(8);
            final int i20 = 1;
            cVar3.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pv
                public final /* synthetic */ qy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i20) {
                        case 0:
                            px pxVar = this.b.T;
                            lx lxVar = pxVar.c;
                            int childCount = lxVar.getChildCount();
                            for (int i152 = 0; i152 < childCount; i152++) {
                                ((ph.b) lxVar.getChildAt(i152)).a(false, true);
                            }
                            pxVar.d = 0L;
                            pxVar.G.b.a(false, true);
                            pxVar.f();
                            break;
                        case 1:
                            ly lyVar = this.b.A0;
                            lx lxVar2 = lyVar.c;
                            int childCount2 = lxVar2.getChildCount();
                            for (int i162 = 0; i162 < childCount2; i162++) {
                                ((ph.b) lxVar2.getChildAt(i162)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.R.a.a(false, true);
                            lyVar.f();
                            break;
                        case 2:
                            qx qxVar = this.b.u1;
                            if (qxVar != null) {
                                qxVar.w();
                                break;
                            }
                            break;
                        default:
                            qy qyVar = this.b;
                            int currentItem = qyVar.h.getCurrentItem();
                            dy dyVar = currentItem == 0 ? qyVar.W : currentItem == 1 ? qyVar.p0 : qyVar.H0;
                            if (dyVar != null) {
                                fq fqVar = dyVar.d;
                                fqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                fqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                fqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            yvVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z17 = z14;
            i7 = 80;
            ew ewVar = new ew(this, context, i6Var, g2Var, z17);
            this.C0 = ewVar;
            ewVar.setDragEnabled(true);
            ewVar.setWillNotDraw(false);
            ewVar.setType(fl0Var);
            ewVar.setUnderlineHeight(awVar.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
            ewVar.setIndicatorColor(z(i11));
            ewVar.setUnderlineColor(z(i15));
            if (viewGroup == null || !z17) {
                yvVar.addView(ewVar, c8.na.e(-1, 36, 51));
            } else {
                fw fwVar = new fw(this, context);
                this.D0 = fwVar;
                fwVar.addView(ewVar, c8.na.e(-1, 36, 51));
                viewGroup.addView(fwVar, c8.na.c(-2.0f, -1));
            }
            Y(true);
            ewVar.setDelegate(new nv(this, 4));
            awVar.setOnScrollListener(new py(this, 0));
            ph.a aVar2 = new ph.a(context, i6Var);
            this.O = aVar2;
            org.telegram.ui.w61 w61Var2 = new org.telegram.ui.w61(context, i6Var);
            this.N = w61Var2;
            w61Var2.setVisibility(8);
            w61Var2.addView(aVar2, c8.na.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            yvVar.addView(w61Var2, c8.na.e(-1, -2, 80));
        } else {
            i7 = 80;
            z17 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        gw gwVar = new gw(this, context);
        this.h = gwVar;
        ri.q qVar2 = this.o2;
        qVar2.getClass();
        gwVar.b(new ri.i(qVar2, gwVar));
        gwVar.setOverScrollMode(2);
        kx kxVar = new kx(this);
        this.M0 = kxVar;
        gwVar.setAdapter(kxVar);
        hw hwVar = new hw(this, context);
        this.y = hwVar;
        hwVar.setHapticFeedbackEnabled(true);
        hwVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        hwVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        hwVar.setScaleType(scaleType);
        hwVar.setContentDescription(org.telegram.messenger.gd.N0(2131754920, null));
        hwVar.setFocusable(true);
        hwVar.setOnClickListener(new iw());
        c8.sa.a(hwVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, c8.na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.p) + 40.0f));
        } else {
            addView(frameLayout, c8.na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        addView(frameLayout2, c8.na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n = frameLayout3;
        View view2 = new View(context);
        this.w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(40.0f), 83));
        if (z13) {
            addView(frameLayout3, c8.na.e(-1, 48, i7));
            frameLayout3.addView(hwVar, c8.na.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context);
                this.E = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.gd.N0(2131745299, null));
                c8.sa.a(imageView);
                frameLayout3.addView(imageView, c8.na.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i21 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pv
                    public final /* synthetic */ qy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i21) {
                            case 0:
                                px pxVar = this.b.T;
                                lx lxVar = pxVar.c;
                                int childCount = lxVar.getChildCount();
                                for (int i152 = 0; i152 < childCount; i152++) {
                                    ((ph.b) lxVar.getChildAt(i152)).a(false, true);
                                }
                                pxVar.d = 0L;
                                pxVar.G.b.a(false, true);
                                pxVar.f();
                                break;
                            case 1:
                                ly lyVar = this.b.A0;
                                lx lxVar2 = lyVar.c;
                                int childCount2 = lxVar2.getChildCount();
                                for (int i162 = 0; i162 < childCount2; i162++) {
                                    ((ph.b) lxVar2.getChildAt(i162)).a(false, true);
                                }
                                lyVar.d = 0L;
                                lyVar.R.a.a(false, true);
                                lyVar.f();
                                break;
                            case 2:
                                qx qxVar = this.b.u1;
                                if (qxVar != null) {
                                    qxVar.w();
                                    break;
                                }
                                break;
                            default:
                                qy qyVar = this.b;
                                int currentItem = qyVar.h.getCurrentItem();
                                dy dyVar = currentItem == 0 ? qyVar.W : currentItem == 1 ? qyVar.p0 : qyVar.H0;
                                if (dyVar != null) {
                                    fq fqVar = dyVar.d;
                                    fqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    fqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    fqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            zb0 zb0Var = new zb0(context, i6Var);
            this.x = zb0Var;
            zb0Var.setViewPager(gwVar);
            zb0Var.setShouldExpand(false);
            zb0Var.setIndicatorHeight(org.telegram.messenger.g0.L(3.0f));
            zb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.n6.Gf), 20));
            zb0Var.setUnderlineHeight(0);
            zb0Var.setTabPaddingLeftRight(org.telegram.messenger.g0.L(11.0f));
            zb0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
            frameLayout3.addView(zb0Var, c8.na.e(-2, 48, 81));
            zb0Var.setOnPageChangeListener(new jw(this, z17));
            ImageView imageView2 = new ImageView(context);
            this.F = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, c8.na.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i22 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pv
                public final /* synthetic */ qy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i22) {
                        case 0:
                            px pxVar = this.b.T;
                            lx lxVar = pxVar.c;
                            int childCount = lxVar.getChildCount();
                            for (int i152 = 0; i152 < childCount; i152++) {
                                ((ph.b) lxVar.getChildAt(i152)).a(false, true);
                            }
                            pxVar.d = 0L;
                            pxVar.G.b.a(false, true);
                            pxVar.f();
                            break;
                        case 1:
                            ly lyVar = this.b.A0;
                            lx lxVar2 = lyVar.c;
                            int childCount2 = lxVar2.getChildCount();
                            for (int i162 = 0; i162 < childCount2; i162++) {
                                ((ph.b) lxVar2.getChildAt(i162)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.R.a.a(false, true);
                            lyVar.f();
                            break;
                        case 2:
                            qx qxVar = this.b.u1;
                            if (qxVar != null) {
                                qxVar.w();
                                break;
                            }
                            break;
                        default:
                            qy qyVar = this.b;
                            int currentItem = qyVar.h.getCurrentItem();
                            dy dyVar = currentItem == 0 ? qyVar.W : currentItem == 1 ? qyVar.p0 : qyVar.H0;
                            if (dyVar != null) {
                                fq fqVar = dyVar.d;
                                fqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                fqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                fqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, c8.na.d(56, 48.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(56.0f), z(i13), z(i13));
            c8.sa.a(hwVar);
            hwVar.setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
            hwVar.setBackground(j02);
            hwVar.setContentDescription(org.telegram.messenger.gd.N0(2131754920, null));
            hwVar.setFocusable(true);
            frameLayout3.addView(hwVar, c8.na.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(gwVar, 0, c8.na.e(-1, -1, 51));
        di.xb xbVar = new di.xb(context, 24);
        this.O0 = xbVar;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int i23 = org.telegram.ui.ActionBar.n6.hg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L3, z(i23));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i23);
        xbVar.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(xbVar, d02, M, null, i6Var);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.gg, i6Var);
        xbVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        char c10 = 16;
        xbVar.setGravity(16);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setVisibility(4);
        addView(xbVar, c8.na.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.D1 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        Field field2 = iu.f;
        iu iuVar = new iu(new hu(context, i6Var));
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
        String str2 = "";
        HashMap hashMap = org.telegram.messenger.j6.h;
        if (!org.telegram.messenger.j6.k) {
            org.telegram.messenger.j6.k = true;
            SharedPreferences f12 = org.telegram.messenger.mp.f1();
            try {
                hashMap.clear();
                if (f12.contains("emojis")) {
                    try {
                        String string2 = f12.getString("emojis", "");
                        if (string2 != null && string2.length() > 0) {
                            String[] split = string2.split(",");
                            int length = split.length;
                            int i24 = 0;
                            while (i24 < length) {
                                String[] split2 = split[i24].split("=");
                                long longValue = Utilities.A(split2[0]).longValue();
                                StringBuilder sb2 = new StringBuilder();
                                char c11 = c10;
                                str = str2;
                                long j3 = longValue;
                                for (int i25 = 0; i25 < 4; i25++) {
                                    long j10 = j3;
                                    try {
                                        sb2.insert(0, (char) j3);
                                        j3 = j10 >> c11;
                                        if (j3 == 0) {
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        str2 = str;
                                        org.telegram.messenger.a8.g(e, true);
                                        string = f12.getString("color", str2);
                                        if (string != null) {
                                            while (r5 < r0.length) {
                                            }
                                        }
                                        axVar = axVar2;
                                        z18 = true;
                                        axVar.F(false);
                                        I(z18, z11, z12, false);
                                        if (Build.VERSION.SDK_INT < 31) {
                                        }
                                        this.l2 = new jh(this, 1);
                                        setBlurredBackgroundDrawableFactory(this.n2);
                                        this.o2.i(this);
                                        this.o2.a = new nv(this, 0);
                                    }
                                }
                                if (sb2.length() > 0) {
                                    hashMap.put(sb2.toString(), Utilities.z(split2[1]));
                                }
                                i24++;
                                c10 = c11;
                                str2 = str;
                            }
                        }
                        str = str2;
                        f12.edit().remove("emojis").commit();
                        org.telegram.messenger.j6.r();
                        str2 = str;
                    } catch (Exception e11) {
                        e = e11;
                    }
                } else {
                    String string3 = f12.getString("emojis2", "");
                    if (string3 != null && string3.length() > 0) {
                        for (String str3 : string3.split(",")) {
                            String[] split3 = str3.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !f12.getBoolean("filled_default", false)) {
                    int i26 = 0;
                    while (true) {
                        String[] strArr = org.telegram.messenger.j6.o;
                        if (i26 >= strArr.length) {
                            break;
                        }
                        hashMap.put(strArr[i26], Integer.valueOf(strArr.length - i26));
                        i26++;
                    }
                    f12.edit().putBoolean("filled_default", true).commit();
                    org.telegram.messenger.j6.r();
                }
                org.telegram.messenger.j6.s();
            } catch (Exception e12) {
                e = e12;
            }
            try {
                string = f12.getString("color", str2);
                if (string != null && string.length() > 0) {
                    for (String str4 : string.split(",")) {
                        String[] split4 = str4.split("=");
                        org.telegram.messenger.j6.j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e13) {
                z18 = true;
                org.telegram.messenger.a8.g(e13, true);
                axVar = axVar2;
            }
        }
        axVar = axVar2;
        z18 = true;
        axVar.F(false);
        I(z18, z11, z12, false);
        if (Build.VERSION.SDK_INT < 31) {
            dh.g gVar = new dh.g(false);
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
        this.l2 = new jh(this, 1);
        setBlurredBackgroundDrawableFactory(this.n2);
        this.o2.i(this);
        this.o2.a = new nv(this, 0);
    }

    public static void a(qy qyVar, boolean z10) {
        vv vvVar = qyVar.i0;
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
                    photoImage.Q0(false);
                } else {
                    photoImage.u0 = false;
                    photoImage.R0();
                }
            }
        }
    }

    public static void d(qy qyVar, yx yxVar, String str) {
        String str2;
        qx qxVar;
        org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
        int i7 = qyVar.d1;
        ArrayList arrayList = qyVar.r1;
        if (yxVar == null) {
            return;
        }
        if (yxVar.getSpan() == null) {
            qyVar.E2 = SystemClock.elapsedRealtime();
            qyVar.N(true);
            String str3 = str != null ? str : (String) yxVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                qx qxVar2 = qyVar.u1;
                if (qxVar2 != null) {
                    qxVar2.l(org.telegram.messenger.j6.c(str));
                    return;
                }
                return;
            }
            if (!yxVar.c && (str2 = (String) org.telegram.messenger.j6.j.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            qyVar.h(str3);
            qx qxVar3 = qyVar.u1;
            if (qxVar3 != null) {
                qxVar3.l(org.telegram.messenger.j6.c(str3));
                return;
            }
            return;
        }
        if (qyVar.u1 != null) {
            long j3 = yxVar.getSpan().documentId;
            TLRPC.Document document = yxVar.getSpan().document;
            ex exVar = yxVar.e;
            boolean z10 = exVar != null && exVar.i;
            if (document == null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ex exVar2 = (ex) arrayList.get(i10);
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = exVar2.c;
                        if (arrayList2 != null && i11 < arrayList2.size()) {
                            if (((TLRPC.Document) exVar2.c.get(i11)).id == j3) {
                                document = (TLRPC.Document) exVar2.c.get(i11);
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
            if (org.telegram.messenger.fj.m3(document2) || org.telegram.messenger.i10.i(i7).q() || (((qxVar = qyVar.u1) != null && qxVar.g()) || qyVar.V0 || z10)) {
                qyVar.E2 = SystemClock.elapsedRealtime();
                qyVar.N(true);
                qyVar.h("animated_" + j3);
                qyVar.u1.x(j3, document2, U, yxVar.c);
                return;
            }
            qyVar.N(false);
            kc b02 = g2Var != null ? kc.b0(g2Var) : new kc(qyVar.r, qyVar.a2);
            if (qyVar.i2 || g2Var == null) {
                b02.r(document2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743617, null)), org.telegram.messenger.gd.N0(2131746839, null), new mv(qyVar, 3)).j();
            } else {
                b02.K(R.raw.saved_messages, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743616, null)), org.telegram.messenger.gd.N0(2131747623, null), new mv(qyVar, 4)).j();
            }
            qyVar.i2 = !qyVar.i2;
        }
    }

    public static void e(qy qyVar, int i7, int i10) {
        v4.f1 K;
        int[] iArr = qyVar.R0;
        if (i7 == 1) {
            qyVar.n(i10, qyVar.Q);
            return;
        }
        qx qxVar = qyVar.u1;
        if ((qxVar == null || !qxVar.z()) && !qyVar.K0) {
            ek0 x10 = qyVar.x(i7);
            if (i10 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + qyVar.c1 < x10.getPaddingTop()) {
                int i11 = iArr[i7] - i10;
                iArr[i7] = i11;
                if (i11 > 0) {
                    iArr[i7] = 0;
                } else if (i11 < (-org.telegram.messenger.g0.L(288.0f))) {
                    iArr[i7] = -org.telegram.messenger.g0.L(288.0f);
                }
                if (i7 == 0) {
                    qyVar.Z();
                } else {
                    qyVar.y(i7).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i7]));
                }
            }
        }
    }

    public static void f(qy qyVar, boolean z10) {
        int N0;
        vx vxVar = qyVar.j0;
        xv xvVar = qyVar.p0;
        vv vvVar = qyVar.i0;
        if (vvVar != null && (vvVar.getAdapter() instanceof ux)) {
            ux uxVar = (ux) vvVar.getAdapter();
            if (!uxVar.s && uxVar.h == 0 && !uxVar.y.isEmpty() && (N0 = vxVar.N0()) != -1 && N0 > vxVar.B() - 5) {
                String str = uxVar.x;
                String str2 = uxVar.r;
                boolean z11 = uxVar.w;
                uxVar.F(str, str2, true, z11, z11);
            }
        }
        qx qxVar = qyVar.u1;
        if (qxVar == null || !qxVar.z()) {
            if (xvVar == null || vvVar == null) {
                return;
            }
            xvVar.a.a(true, !z10);
            return;
        }
        v4.f1 K = vvVar.K(0);
        if (K == null) {
            dy.a(xvVar, true, !z10);
        } else {
            dy.a(xvVar, K.a.getTop() < vvVar.getPaddingTop(), !z10);
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
        dw dwVar = this.H0;
        if (dwVar != null) {
            dwVar.b();
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
        cy cyVar;
        if (this.B1 != 0 && this.x1) {
            this.B1 = 0;
        }
        if (this.B1 == 0 && this.w1) {
            this.B1 = 1;
        }
        int i7 = this.B1;
        gw gwVar = this.h;
        if (i7 == 0 || z10 || this.e.size() == 1) {
            M(true, false);
            R(false, false);
            if (gwVar.getCurrentItem() != 0) {
                gwVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.g0.h3(new mv(this, 5), 350L);
            }
        } else {
            int i10 = this.B1;
            if (i10 == 1) {
                M(false, false);
                R(this.v0 || this.w0, false);
                if (gwVar.getCurrentItem() != 2) {
                    gwVar.x(2, false);
                }
                ew ewVar = this.C0;
                if (ewVar != null) {
                    this.T0 = true;
                    int i11 = this.H1;
                    if (i11 >= 0) {
                        ewVar.m(i11);
                    } else {
                        int i12 = this.G1;
                        if (i12 >= 0) {
                            ewVar.m(i12);
                        } else {
                            ewVar.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.h1(0, 0);
                }
            } else if (i10 == 2) {
                M(false, false);
                R(false, false);
                if (gwVar.getCurrentItem() != 1) {
                    gwVar.x(1, false);
                }
                yw ywVar = this.q0;
                if (ywVar != null) {
                    ywVar.m(0);
                }
                xv xvVar = this.p0;
                if (xvVar != null && (cyVar = xvVar.r) != null) {
                    cyVar.I1(null);
                }
            }
        }
        N(true);
    }

    public final void D() {
        iy iyVar = this.z0;
        if (iyVar != null) {
            iyVar.f();
        }
        ly lyVar = this.A0;
        if (lyVar != null) {
            lyVar.f();
        }
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().m();
        }
        org.telegram.ui.ns.p().t();
    }

    public final void E(int i7) {
        qx qxVar = this.u1;
        if ((qxVar == null || !qxVar.z()) && i7 != 0) {
            HorizontalScrollView y10 = y(i7);
            this.R0[i7] = 0;
            y10.setTranslationY(0);
        }
    }

    public final void F(int i7, int i10) {
        rw rwVar = this.R;
        View m10 = rwVar.m(i7);
        int L0 = rwVar.L0();
        if ((m10 == null && Math.abs(i7 - L0) > rwVar.J * 9.0f) || !org.telegram.messenger.bz.c()) {
            int i11 = rwVar.L0() < i7 ? 0 : 1;
            org.telegram.ui.ActionBar.l5 l5Var = this.c0;
            l5Var.b = i11;
            l5Var.k(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        hi.t1 t1Var = new hi.t1(1, this.Q.getContext(), this);
        t1Var.a = i7;
        t1Var.p = i10;
        rwVar.w0(t1Var);
    }

    public final void H(int i7, int i10) {
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

    public final void I(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i7 >= arrayList2.size()) {
                break;
            }
            if (((my) arrayList2.get(i7)).a == 0 && z10) {
                arrayList.add((my) arrayList2.get(i7));
            }
            if (((my) arrayList2.get(i7)).a == 1 && z12) {
                arrayList.add((my) arrayList2.get(i7));
            }
            if (((my) arrayList2.get(i7)).a == 2 && z11) {
                arrayList.add((my) arrayList2.get(i7));
            }
            i7++;
        }
        zb0 zb0Var = this.x;
        if (zb0Var != null) {
            org.telegram.messenger.g0.X3(zb0Var, arrayList.size() > 1, 1.0f, true, z13);
        }
        gw gwVar = this.h;
        if (gwVar != null) {
            gwVar.setAdapter(null);
            gwVar.setAdapter(this.M0);
            if (zb0Var != null) {
                zb0Var.setViewPager(gwVar);
            }
        }
    }

    public final void J(final ph.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        ly lyVar;
        px pxVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (pxVar = this.T) == null || pxVar.d == stickerSet.id) {
            if (z10 || (lyVar = this.A0) == null || lyVar.d == stickerSet.id) {
                final boolean E0 = org.telegram.messenger.ri.d0(this.d1).E0(stickerSet.id, true);
                aVar.i(E0 ? stickerSet.masks ? org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]) : stickerSet.masks ? org.telegram.messenger.gd.G(stickerSet.count, "AddManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.gd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]) : org.telegram.messenger.gd.G(stickerSet.count, "AddManyStickersCount", new Object[0]), z11, true);
                aVar.m0.a(!E0, z11);
                aVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.rv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        qy qyVar = qy.this;
                        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(qyVar.d1);
                        Context context = qyVar.getContext();
                        int i7 = E0 ? 0 : 2;
                        org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
                        FrameLayout frameLayout = qyVar.s;
                        ph.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        d02.l2(context, tLObject2, document2, i7, g2Var, frameLayout, false, true, new di.o3(qyVar, aVar2, tLObject2, stickerSet2, document2, z12), false);
                        qyVar.J(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            q(false);
            float f12 = 1.0f - this.a.e;
            dw dwVar = this.H0;
            dwVar.setAlpha(f12);
            dwVar.setVisibility(f12 > 0.0f ? 0 : 4);
            float f13 = 1.0f - f12;
            ph.c cVar2 = this.I0;
            cVar2.setAlpha(f13);
            cVar2.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f12);
            cVar2.setVisibility(f13 > 0.0f ? 0 : 4);
            org.telegram.ui.w61 w61Var = this.N;
            w61Var.setAlpha(f13);
            w61Var.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f12);
            w61Var.setVisibility(f13 > 0.0f ? 0 : 4);
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
            org.telegram.ui.w61 w61Var2 = this.L;
            w61Var2.setAlpha(f15);
            w61Var2.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f14);
            w61Var2.setVisibility(f15 > 0.0f ? 0 : 4);
            S();
            this.K.invalidate();
        }
    }

    public final void L(long j3, boolean z10, boolean z11) {
        zb0 zb0Var = this.x;
        if (zb0Var == null) {
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
        LinearLayout linearLayout = zb0Var.d;
        View childAt = i7 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i7);
        if (childAt != null) {
            childAt.setAlpha(this.v1 != 0 ? 0.15f : 1.0f);
            gw gwVar = this.h;
            if (z11) {
                if (this.v1 == 0 || gwVar.getCurrentItem() == 0) {
                    return;
                }
                M(true, true);
                R(false, true);
                gwVar.x(0, false);
                return;
            }
            if (this.v1 == 0 || gwVar.getCurrentItem() == 1) {
                return;
            }
            M(false, true);
            R(false, true);
            gwVar.x(1, false);
        }
    }

    public final void M(boolean z10, boolean z11) {
        hw hwVar = this.y;
        if (z10 && hwVar.getTag() == null) {
            return;
        }
        if ((z10 || hwVar.getTag() == null) && !this.p2) {
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            hwVar.setTag(z10 ? null : 1);
            if (!z11) {
                hwVar.setAlpha(z10 ? 1.0f : 0.0f);
                hwVar.setScaleX(z10 ? 1.0f : 0.0f);
                hwVar.setScaleY(z10 ? 1.0f : 0.0f);
                hwVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                hwVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(hwVar, (Property<hw, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(hwVar, (Property<hw, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(hwVar, (Property<hw, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.G.setDuration(200L);
            this.G.setInterpolator(kr.g);
            this.G.addListener(new nw(this, z10, r2));
            this.G.start();
        }
    }

    public final void N(boolean z10) {
        this.I = 0.0f;
        qx qxVar = this.u1;
        if (qxVar != null && qxVar.z()) {
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
            this.a0.setInterpolator(kr.g);
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
                    E(i7);
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
                        xbVar.setText(org.telegram.messenger.gd.a0("AttachPlainRestricted", null, 2131753941, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                    }
                    if (z12) {
                        xbVar.setText(org.telegram.messenger.gd.a0("AttachGifRestricted", null, 2131753967, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                    } else {
                        xbVar.setText(org.telegram.messenger.gd.a0("AttachStickersRestricted", null, 2131753932, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                    }
                } else if (z11) {
                    xbVar.setText(org.telegram.messenger.gd.N0(2131753940, null));
                } else if (z12) {
                    xbVar.setText(org.telegram.messenger.gd.N0(2131753966, null));
                } else {
                    xbVar.setText(org.telegram.messenger.gd.N0(2131753931, null));
                }
            } else {
                org.telegram.ui.ActionBar.g2 g2Var = this.Z1;
                if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).Z6()) {
                    return;
                }
                if (z11) {
                    xbVar.setText(org.telegram.messenger.gd.N0(2131749370, null));
                } else if (z12) {
                    xbVar.setText(org.telegram.messenger.gd.N0(2131749369, null));
                } else {
                    xbVar.setText(org.telegram.messenger.gd.N0(2131749363, null));
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
        this.Q2.setInterpolator(kr.h);
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
            this.H.setInterpolator(kr.g);
            this.H.addListener(new nw(this, z10, i7));
            this.H.start();
        }
    }

    public final void S() {
        org.telegram.ui.ActionBar.g2 g2Var;
        if (((View) getParent()) != null) {
            float y10 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((org.telegram.messenger.g0.E || ((g2Var = this.Z1) != null && g2Var.isInBubbleMode())) && !this.W0) ? org.telegram.messenger.g0.L(1.0f) : r0.getHeight());
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
        dy dyVar;
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
        vw vwVar = this.J;
        if (vwVar != null) {
            if (this.v0) {
                vwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.zf));
                this.P.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.Cf));
            } else {
                vwVar.setBackground(null);
            }
        }
        iu iuVar = this.C1;
        if (iuVar != null) {
            iuVar.c.a();
        }
        int i10 = 0;
        while (true) {
            dyVar = this.W;
            z10 = this.j2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                dyVar = this.H0;
            } else if (i10 != 1) {
                dyVar = this.p0;
            }
            if (dyVar != null) {
                fq fqVar = dyVar.d;
                FrameLayout frameLayout = dyVar.n;
                View view2 = dyVar.f;
                if (this.v0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.zf));
                } else {
                    view2.setBackground(null);
                }
                dyVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.Cf));
                dyVar.c.a(z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Bf));
                org.telegram.ui.ActionBar.n6.C1(z10 ? v(0.06f) : z(org.telegram.ui.ActionBar.n6.Af), frameLayout.getBackground());
                frameLayout.invalidate();
                fqVar.setHintTextColor(z10 ? v(0.45f) : z(org.telegram.ui.ActionBar.n6.Bf));
                fqVar.setTextColor(z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.G6));
            }
            i10++;
        }
        Paint paint = this.t1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.n6.Sf));
        }
        dx dxVar = this.Q;
        if (dxVar != null) {
            dxVar.setGlowColor(z(org.telegram.ui.ActionBar.n6.zf));
        }
        aw awVar = this.E0;
        if (awVar != null) {
            awVar.setGlowColor(z(org.telegram.ui.ActionBar.n6.zf));
        }
        ew ewVar = this.C0;
        if (ewVar != null) {
            ewVar.setIndicatorColor(z(org.telegram.ui.ActionBar.n6.If));
            ewVar.setUnderlineColor(z(org.telegram.ui.ActionBar.n6.Cf));
            if (this.v0) {
                ewVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.zf));
            } else {
                ewVar.setBackground(null);
            }
        }
        yw ywVar = this.q0;
        if (ywVar != null) {
            ywVar.setIndicatorColor(z(org.telegram.ui.ActionBar.n6.If));
            ywVar.setUnderlineColor(z(org.telegram.ui.ActionBar.n6.Cf));
            if (this.v0) {
                ywVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.zf));
            } else {
                ywVar.setBackground(null);
            }
        }
        int v = z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf);
        boolean z13 = v != this.J2;
        this.J2 = v;
        hw hwVar = this.y;
        if (hwVar != null) {
            if (z13) {
                hwVar.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
            }
            if (dyVar == null) {
                Drawable background2 = hwVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.n6.zf;
                org.telegram.ui.ActionBar.n6.H1(background2, z(i11), false);
                org.telegram.ui.ActionBar.n6.H1(hwVar.getBackground(), z(i11), true);
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
        ux uxVar = this.k0;
        if (uxVar != null) {
            wx wxVar = uxVar.e;
            int i12 = org.telegram.ui.ActionBar.n6.Df;
            int z14 = z(i12);
            if (z14 != this.K2) {
                this.K2 = z14;
                wxVar.a.setColorFilter(new PorterDuffColorFilter(z14, PorterDuff.Mode.MULTIPLY));
            }
            wxVar.b.setTextColor(z(i12));
            wxVar.c.setProgressColor(z(org.telegram.ui.ActionBar.n6.h6));
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
        if (vwVar != null && (hvVar = vwVar.E) != null) {
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
        dx dxVar = this.Q;
        if (dxVar == null) {
            return;
        }
        for (int i7 = 0; i7 < dxVar.getChildCount(); i7++) {
            View childAt = dxVar.getChildAt(i7);
            if (childAt instanceof ix) {
                ((ix) childAt).a(true);
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
            ax axVar = this.S;
            int i11 = axVar.c;
            ArrayList arrayList = axVar.y;
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
                    ArrayList<ex> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i7) {
                            ex exVar = (ex) this.r1.get(size2);
                            while (i12 < emojipacks.size()) {
                                long j3 = emojipacks.get(i12).b.id;
                                long j10 = exVar.b.id;
                                if (j3 == j10 && (!exVar.g || (!exVar.f && !this.q1.contains(Long.valueOf(j10))))) {
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
        cy cyVar;
        int i10;
        boolean z10;
        yw ywVar = this.q0;
        int currentPosition = ywVar.getCurrentPosition();
        int i11 = this.s0;
        boolean z11 = currentPosition == i11;
        boolean z12 = i11 >= 0;
        boolean isEmpty = this.j1.isEmpty();
        ywVar.d(false);
        this.s0 = -2;
        this.t0 = -2;
        this.u0 = -2;
        Drawable[] drawableArr = this.a1;
        if (isEmpty) {
            i7 = 0;
        } else {
            this.s0 = 0;
            ywVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.gd.N0(2131746168, null));
            i7 = 1;
        }
        this.t0 = i7;
        ywVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.gd.N0(2131750822, null));
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
                int i15 = ywVar.y;
                ywVar.y = i15 + 1;
                rv0 rv0Var = (rv0) ywVar.n.get(i14);
                if (rv0Var != null) {
                    ywVar.g(i14, rv0Var, i15);
                    i10 = currentPosition;
                    z10 = z12;
                } else {
                    i10 = currentPosition;
                    z10 = z12;
                    rv0Var = new rv0(ywVar.getContext(), 2);
                    rv0Var.setFocusable(true);
                    rv0Var.setOnClickListener(new zk0(ywVar, 2));
                    rv0Var.setExpanded(ywVar.g0);
                    rv0Var.a(ywVar.j0);
                    ywVar.e.addView(rv0Var, i15);
                }
                rv0Var.d = false;
                rv0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                rv0Var.setTag(R.id.parent_tag, g10);
                rv0Var.setTag(R.id.object_tag, V);
                rv0Var.setSelected(i15 == ywVar.E);
                ywVar.h.put(i14, rv0Var);
                rv0Var.setContentDescription(str);
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
        ywVar.h();
        ywVar.q();
        if (z11 && isEmpty) {
            ywVar.m(this.t0);
            xv xvVar = this.p0;
            if (xvVar == null || (cyVar = xvVar.r) == null) {
                return;
            }
            cyVar.I1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (ywVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                ywVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                ywVar.k(i16 - 1, 0);
            }
        }
    }

    public final void X() {
        ux uxVar;
        int size = this.j1.size();
        long p10 = org.telegram.messenger.ri.p(ConnectionsManager.DEFAULT_DATACENTER_ID, this.j1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(this.d1).j0);
        this.j1 = arrayList;
        long p11 = org.telegram.messenger.ri.p(ConnectionsManager.DEFAULT_DATACENTER_ID, arrayList);
        if ((this.q0 != null && size == 0 && !this.j1.isEmpty()) || (size != 0 && this.j1.isEmpty())) {
            W();
        }
        if ((size == this.j1.size() && p10 == p11) || (uxVar = this.o0) == null) {
            return;
        }
        uxVar.f();
    }

    public final void Y(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        ew ewVar = this.C0;
        if (ewVar != null) {
            org.telegram.ui.b61 b61Var = ewVar.e;
            if (ewVar.s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            int i10 = 0;
            this.f0 = false;
            this.F1 = 0;
            int currentPosition = ewVar.getCurrentPosition();
            ewVar.d((getParent() == null || getVisibility() != 0 || (this.z1.size() == 0 && this.A1.size() == 0)) ? false : true);
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
            oy oyVar = this.G0;
            if (oyVar != null) {
                oyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Z0;
            org.telegram.ui.ActionBar.i6 i6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id)) {
                int i13 = d02.v0[0].isEmpty() ? 2 : 3;
                rv0 c10 = ewVar.c(i13, drawableArr[i13]);
                c10.h.setText(org.telegram.messenger.gd.N0(2131750819, null));
                c10.setContentDescription(org.telegram.messenger.gd.N0(2131750821, null));
                int i14 = this.F1;
                this.I1 = i14;
                this.F1 = i14 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i15 = this.F1;
                this.H1 = i15;
                this.F1 = i15 + 1;
                rv0 c11 = ewVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.gd.N0(2131750826, null));
                c11.setContentDescription(org.telegram.messenger.gd.N0(2131750829, null));
            }
            if (!this.k1.isEmpty()) {
                int i16 = this.F1;
                this.G1 = i16;
                this.F1 = i16 + 1;
                rv0 c12 = ewVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.gd.N0(2131746167, null));
                c12.setContentDescription(org.telegram.messenger.gd.N0(2131746168, null));
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
                        int i20 = ewVar.y;
                        ewVar.y = i20 + 1;
                        rv0 rv0Var = (rv0) ewVar.n.get(str);
                        if (rv0Var != null) {
                            ewVar.g(str, rv0Var, i20);
                        } else {
                            rv0Var = new rv0(ewVar.getContext(), i10);
                            rv0Var.setFocusable(true);
                            rv0Var.setOnClickListener(new zk0(ewVar, i10));
                            b61Var.addView(rv0Var, i20);
                            rv0Var.x = true;
                            a9 a9Var = new a9(i6Var2);
                            a9Var.u(org.telegram.messenger.g0.L(14.0f));
                            a9Var.q(O02);
                            int i21 = ewVar.a;
                            p9 p9Var = rv0Var.e;
                            p9Var.setLayerNum(i21);
                            p9Var.f(O02, a9Var);
                            p9Var.setAspectFit(true);
                            rv0Var.setExpanded(ewVar.g0);
                            rv0Var.a(ewVar.j0);
                            rv0Var.h.setText(O02.title);
                        }
                        rv0Var.d = true;
                        rv0Var.setTag(R.id.index_tag, Integer.valueOf(i20));
                        rv0Var.setSelected(i20 == ewVar.E);
                        ewVar.h.put(str, rv0Var);
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
                    int i23 = ewVar.y;
                    ewVar.y = i23 + 1;
                    rv0 rv0Var2 = (rv0) ewVar.n.get(str2);
                    if (rv0Var2 != null) {
                        ewVar.g(str2, rv0Var2, i23);
                    } else {
                        rv0Var2 = new rv0(ewVar.getContext(), 0);
                        rv0Var2.setFocusable(true);
                        rv0Var2.setOnClickListener(new zk0(ewVar, 1));
                        rv0Var2.setExpanded(ewVar.g0);
                        rv0Var2.a(ewVar.j0);
                        b61Var.addView(rv0Var2, i23);
                    }
                    rv0Var2.e.setLayerNum(ewVar.a);
                    i7 = 0;
                    rv0Var2.d = false;
                    rv0Var2.setTag(w10);
                    rv0Var2.setTag(R.id.index_tag, Integer.valueOf(i23));
                    rv0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    rv0Var2.setTag(R.id.object_tag, document);
                    rv0Var2.setSelected(i23 == ewVar.E);
                    ewVar.h.put(str2, rv0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    i6Var = null;
                    sb2.append(org.telegram.messenger.gd.N0(2131754756, null));
                    rv0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i10 = i7;
                i6Var2 = i6Var;
            }
            ewVar.h();
            ewVar.q();
            if (currentPosition != 0) {
                ewVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        fw fwVar = this.D0;
        ew ewVar = this.C0;
        if (ewVar != null && fwVar == null && this.u1 != null) {
            ewVar.setTranslationY(this.u1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (fwVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.L0 && this.u1.p() != 1.0f;
        fwVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.z2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.y0, rect, null);
            float p10 = this.u1.p() * org.telegram.messenger.g0.L(50.0f);
            int i7 = rect.left;
            if (i7 != 0 || p10 != 0.0f) {
                this.Y1 = false;
            }
            fwVar.setTranslationX(i7);
            float translationY = (((getTranslationY() + getTop()) - fwVar.getTop()) - ewVar.getExpandedOffset()) - p10;
            if (fwVar.getTranslationY() != translationY) {
                fwVar.setTranslationY(translationY);
                fwVar.invalidate();
            }
        }
        if (this.Y1 && z10 && this.Q0) {
            ewVar.i(true, this.X1);
        } else {
            this.Y1 = false;
            ewVar.i(false, this.X1);
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
                if (!(childAt instanceof org.telegram.ui.Cells.v3) || ((mj0) awVar.T(childAt)) == null) {
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
        org.telegram.messenger.w10 w10Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.ks.x0;
        ax axVar = this.S;
        mv mvVar = this.S2;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.z0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    D();
                    o();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    axVar.F(false);
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
                axVar.F(true);
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
            zb0 zb0Var = this.x;
            if (zb0Var != null) {
                int childCount = zb0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    zb0Var.getChildAt(i12).invalidate();
                }
            }
            Y(false);
            return;
        }
        if (i7 == org.telegram.messenger.ks.A0) {
            if (axVar != null) {
                axVar.F(false);
                return;
            }
            return;
        }
        int i13 = org.telegram.messenger.ks.B0;
        px pxVar = this.T;
        if (i7 == i13) {
            Long l10 = (Long) objArr[0];
            long longValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                ly lyVar = this.A0;
                if (lyVar != null && lyVar.d == longValue2 && lyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    lyVar.f = tL_messages_stickerSet.documents;
                    lyVar.f();
                }
                if (pxVar != null && pxVar.d == longValue2 && pxVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    pxVar.f = tL_messages_stickerSet.documents;
                    pxVar.f();
                }
            }
            TLRPC.ChatFull chatFull2 = this.K1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                Y(false);
            }
            HashMap hashMap = this.s1;
            if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.w10) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (w10Var = (org.telegram.messenger.w10) hashMap.remove(l10)) != null) {
                w10Var.a(tL_messages_stickerSet);
            }
            org.telegram.messenger.g0.r(mvVar);
            org.telegram.messenger.g0.h3(mvVar, 100L);
            return;
        }
        int i14 = org.telegram.messenger.ks.l4;
        dx dxVar = this.Q;
        if (i7 != i14) {
            if (i7 != org.telegram.messenger.ks.L2) {
                if (i7 == org.telegram.messenger.ks.i5) {
                    if (axVar != null) {
                        axVar.F(false);
                    }
                    U();
                    Y(false);
                    return;
                }
                return;
            }
            if (dxVar == null || !this.e0) {
                return;
            }
            if ((this.W.c.k == 2 || dxVar.getAdapter() == pxVar) && !TextUtils.isEmpty(pxVar.w)) {
                pxVar.F(pxVar.w, true);
                return;
            }
            return;
        }
        aw awVar = this.E0;
        if (awVar != null) {
            int childCount2 = awVar.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt = awVar.getChildAt(i15);
                if ((childAt instanceof org.telegram.ui.Cells.j8) || (childAt instanceof org.telegram.ui.Cells.z7)) {
                    childAt.invalidate();
                }
            }
        }
        if (dxVar != null) {
            dxVar.invalidate();
            int childCount3 = dxVar.getChildCount();
            for (int i16 = 0; i16 < childCount3; i16++) {
                View childAt2 = dxVar.getChildAt(i16);
                if (childAt2 instanceof yx) {
                    childAt2.invalidate();
                }
            }
        }
        iu iuVar = this.C1;
        if (iuVar != null) {
            iuVar.c.invalidate();
        }
        yw ywVar = this.q0;
        if (ywVar != null) {
            org.telegram.ui.b61 b61Var = ywVar.e;
            int childCount4 = b61Var.getChildCount();
            for (int i17 = 0; i17 < childCount4; i17++) {
                b61Var.getChildAt(i17).invalidate();
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

    public ArrayList<ex> getEmojipacks() {
        ArrayList<ex> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.r1;
            if (i7 >= arrayList2.size()) {
                return arrayList;
            }
            ex exVar = (ex) arrayList2.get(i7);
            boolean z10 = exVar.g;
            ArrayList arrayList3 = this.q1;
            if ((!z10 && (exVar.f || arrayList3.contains(Long.valueOf(exVar.b.id)))) || (exVar.g && !exVar.f && !arrayList3.contains(Long.valueOf(exVar.b.id)))) {
                arrayList.add(exVar);
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
        ew ewVar = this.C0;
        if (ewVar == null) {
            return 0.0f;
        }
        return ewVar.getExpandedOffset();
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
        ow owVar = new ow(getContext(), i10);
        owVar.a = !z10 ? 1 : 0;
        w(i7).w0(owVar);
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
        if (org.telegram.messenger.i10.i(i7).q()) {
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
        iy iyVar = this.z0;
        if (iyVar != null) {
            iyVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        qx qxVar = this.u1;
        te.a aVar = this.b;
        dx dxVar = this.Q;
        sv svVar = this.W;
        if (qxVar != null && qxVar.z()) {
            v4.f1 K = dxVar.K(0);
            if (K == null) {
                dy.a(svVar, true, !z10);
            } else {
                dy.a(svVar, K.a.getTop() < dxVar.getPaddingTop(), !z10);
            }
            O(false, !z10);
            svVar.setTranslationY(aVar.e * org.telegram.messenger.g0.L(15.0f));
            return;
        }
        if (svVar == null || dxVar == null) {
            return;
        }
        svVar.setTranslationY((aVar.e * org.telegram.messenger.g0.L(15.0f)) + (dxVar.K(0) != null ? r0.a.getTop() : -this.c1));
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
        dx dxVar;
        v4.f1 K;
        vw vwVar = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            vwVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.g0) {
            return;
        }
        qx qxVar = this.u1;
        if (qxVar == null || !qxVar.z()) {
            if (i7 > 0 && (dxVar = this.Q) != null && dxVar.getVisibility() == 0 && (K = dxVar.K(0)) != null) {
                if (K.a.getTop() + (this.e0 ? this.c1 : 0) >= dxVar.getPaddingTop()) {
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
            vwVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        ew ewVar = this.C0;
        if (ewVar == null || (L0 = this.F0.L0()) == -1) {
            return;
        }
        int i7 = this.H1;
        if (i7 <= 0 && (i7 = this.G1) <= 0) {
            i7 = this.F1;
        }
        ewVar.k(this.z0.F(L0), i7);
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
            D();
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
            ux uxVar = this.o0;
            if (adapter != uxVar || uxVar.J < 0 || this.t0 < 0 || this.s0 < 0 || (L0 = this.j0.L0()) == -1) {
                return;
            }
            this.q0.k(L0 >= uxVar.J ? this.t0 : this.s0, 0);
        }
    }

    public final void q(boolean z10) {
        qx qxVar = this.u1;
        te.a aVar = this.a;
        aw awVar = this.E0;
        dw dwVar = this.H0;
        if (qxVar != null && qxVar.z()) {
            v4.f1 K = awVar.K(0);
            if (K == null) {
                dy.a(dwVar, true, !z10);
            } else {
                dy.a(dwVar, K.a.getTop() < awVar.getPaddingTop(), !z10);
            }
            dwVar.setTranslationY(aVar.e * org.telegram.messenger.g0.L(15.0f));
            return;
        }
        if (dwVar == null || awVar == null) {
            return;
        }
        dwVar.setTranslationY((aVar.e * org.telegram.messenger.g0.L(15.0f)) + (awVar.K(0) != null ? r0.a.getTop() : -this.c1));
        dwVar.a.a(false, !z10);
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
        dy dyVar;
        v4.c0 c0Var;
        View view;
        ek0 ek0Var;
        int i7;
        int i10;
        TLRPC.TL_messages_stickerSet q02;
        iy iyVar;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j3 != -1 && (q02 = org.telegram.messenger.ri.d0(this.d1).q0(j3)) != null && (E = (iyVar = this.z0).E(q02)) >= 0 && E < iyVar.b()) {
            H(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        ux uxVar = this.k0;
        if (uxVar != null) {
            uxVar.L = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            ek0 ek0Var2 = this.E0;
            ek0 ek0Var3 = this.i0;
            xv xvVar = this.p0;
            ek0 ek0Var4 = this.Q;
            if (i13 == 0) {
                dyVar = this.W;
                c0Var = this.R;
                view = this.J;
                ek0Var = ek0Var4;
            } else if (i13 == 1) {
                c0Var = this.j0;
                view = this.q0;
                ek0Var = ek0Var3;
                dyVar = xvVar;
            } else {
                dyVar = this.H0;
                c0Var = this.F0;
                view = this.C0;
                ek0Var = ek0Var2;
            }
            if (dyVar == null) {
                i10 = i12;
                i7 = i11;
            } else {
                int i14 = i12;
                cy cyVar = dyVar.r;
                int i15 = i11;
                dyVar.d.setText("");
                if (cyVar != null) {
                    cyVar.I1(null);
                    cyVar.G1();
                }
                int i16 = this.c1;
                if (i13 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.N0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i13 == 1) {
                        float[] fArr = new float[1];
                        fArr[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ek0Var, (Property<ek0, Float>) property, fArr);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[i14] = ofFloat;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr2 = new float[1];
                        fArr2[i14] = 0.0f;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ek0Var, (Property<ek0, Float>) property, fArr3);
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(dyVar, (Property<dy, Float>) property, fArr4);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[i14] = ofFloat2;
                        animatorArr2[1] = ofFloat3;
                        animatorArr2[i15] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(kr.h);
                    this.N0.addListener(new fi.a3(this, c0Var, ek0Var, 6));
                    this.N0.start();
                    i10 = i14;
                    i7 = i15;
                } else {
                    if (dyVar != xvVar) {
                        dyVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i7 = i15;
                    if (view != null && i13 != i7) {
                        view.setTranslationY(0.0f);
                    }
                    if (ek0Var == ek0Var2) {
                        i10 = i14;
                        ek0Var.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.r2);
                    } else {
                        i10 = i14;
                        if (ek0Var == ek0Var3) {
                            ek0Var.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.r2);
                        } else {
                            if (ek0Var == ek0Var4) {
                                ek0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.r2);
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
        hw hwVar = this.y;
        if (hwVar != null) {
            fh.g c10 = cVar.c(hwVar, null, false);
            c10.p(c8.j0.e(i6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            hwVar.setBackground(c10);
        }
        ImageView imageView = this.F;
        if (imageView != null) {
            fh.g c11 = cVar.c(imageView, null, false);
            c11.p(c8.j0.e(i6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            imageView.setBackground(c11);
        }
        zb0 zb0Var = this.x;
        if (zb0Var != null) {
            fh.g c12 = cVar.c(zb0Var, null, false);
            c12.p(c8.j0.e(i6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            zb0Var.setBackground(c12);
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            fh.g c13 = cVar.c(imageView2, null, false);
            c13.p(c8.j0.e(i6Var));
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

    public void setDelegate(qx qxVar) {
        this.u1 = qxVar;
    }

    public void setDragListener(xw xwVar) {
        this.P0 = xwVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        dw dwVar = this.H0;
        if (dwVar != null) {
            dwVar.d.setEnabled(z10);
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
                    D();
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
        iy iyVar;
        boolean z11 = this.U2;
        this.U2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i7 = this.B1;
        if (i7 == 0) {
            ax axVar = this.S;
            if (axVar != null) {
                axVar.F(false);
                return;
            }
            return;
        }
        if (i7 == 1) {
            ux uxVar = this.o0;
            if (uxVar != null) {
                uxVar.f();
                return;
            }
            return;
        }
        if (i7 != 2 || (iyVar = this.z0) == null) {
            return;
        }
        iyVar.f();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            T();
            ui.c cVar = this.m2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.n6.d6));
            }
            zb0 zb0Var = this.x;
            if (zb0Var != null) {
                zb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.n6.Gf), 20));
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

    public final ek0 x(int i7) {
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
        return i6Var != null ? i6Var.i(i7) : org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final void G(float f10, int i7) {
    }
}
