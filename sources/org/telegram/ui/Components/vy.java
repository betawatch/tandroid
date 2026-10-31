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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class vy extends FrameLayout implements org.telegram.ui.ActionBar.k6, fe.e, org.telegram.messenger.us, hh.a {
    public static final /* synthetic */ int U2 = 0;
    public final rv A0;
    public int A1;
    public int A2;
    public final gw B0;
    public final ju B1;
    public ArrayList B2;
    public final hw C0;
    public final int C1;
    public int C2;
    public final ImageView D;
    public final bw D0;
    public final int[] D1;
    public long D2;
    public final ImageView E;
    public final cw E0;
    public int E1;
    public final fe.b E2;
    public AnimatorSet F;
    public ty F0;
    public int F1;
    public ArrayList F2;
    public AnimatorSet G;
    public final fw G0;
    public int G1;
    public Drawable G2;
    public float H;
    public final fh.c H0;
    public int H1;
    public int H2;
    public final zw I;
    public boolean I0;
    public int I1;
    public int I2;
    public final uw J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public int J2;
    public final fg.i K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public final fh.a L;
    public final ox L0;
    public int L1;
    public boolean L2;
    public final fg.i M;
    public AnimatorSet M0;
    public final rf.b0 M1;
    public xa.n M2;
    public final fh.a N;
    public final ag.j3 N0;
    public boolean N1;
    public xa.n N2;
    public final View O;
    public bx O0;
    public int O1;
    public boolean O2;
    public final hx P;
    public boolean P0;
    public boolean P1;
    public AnimatorSet P2;
    public final vw Q;
    public final int[] Q0;
    public boolean Q1;
    public e2.m0 Q2;
    public final ex R;
    public final ObjectAnimator[] R0;
    public ey R1;
    public final nv R2;
    public final ux S;
    public boolean S0;
    public float S1;
    public boolean S2;
    public ty T;
    public mw T0;
    public float T1;
    public boolean T2;
    public final fh.c U;
    public boolean U0;
    public float U1;
    public final tv V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.k2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.p6 Z1;
    public final fe.b a;
    public final vj0 a0;
    public final String[] a1;
    public final org.telegram.ui.ActionBar.e6 a2;
    public final fe.b b;
    public final vj0 b0;
    public final int b1;
    public final org.telegram.ui.ActionBar.e6 b2;
    public int c;
    public boolean c0;
    public final int c1;
    public final boolean c2;
    public final ArrayList d;
    public final boolean d0;
    public final ArrayList d1;
    public LongSparseArray d2;
    public final ArrayList e;
    public boolean e0;
    public int e1;
    public PorterDuffColorFilter e2;
    public boolean f;
    public boolean f0;
    public int f1;
    public final ew f2;
    public final vv g0;
    public boolean g1;
    public final pw g2;
    public final iw h;
    public final wv h0;
    public TLRPC.TL_messages_stickerSet h1;
    public boolean h2;
    public final ay i0;
    public ArrayList i1;
    public final boolean i2;
    public final zx j0;
    public ArrayList j1;
    public final tg.f j2;
    public final dy k0;
    public ArrayList k1;
    public final qg k2;
    public final HashMap l0;
    public ArrayList l1;
    public final hi.c l2;
    public final rv m0;
    public final ArrayList m1;
    public final tg.b m2;
    public final FrameLayout n;
    public final zx n0;
    public final ArrayList n1;
    public final ei.r n2;
    public final yv o0;
    public final ArrayList o1;
    public boolean o2;
    public final cx p0;
    public final ArrayList p1;
    public boolean p2;
    public boolean q0;
    public final ArrayList q1;
    public int q2;
    public final FrameLayout r;
    public int r0;
    public final HashMap r1;
    public float r2;
    public final FrameLayout s;
    public int s0;
    public final Paint s1;
    public View s2;
    public int t0;
    public vx t1;
    public int t2;
    public boolean u0;
    public long u1;
    public int u2;
    public boolean v0;
    public boolean v1;
    public long v2;
    public final View w;
    public boolean w0;
    public boolean w1;
    public boolean w2;
    public final jc0 x;
    public final zv x0;
    public final TLRPC.StickerSetCovered[] x1;
    public boolean x2;
    public final jw y;
    public final ny y0;
    public final LongSparseArray y1;
    public final Rect y2;
    public final qy z0;
    public final LongSparseArray z1;
    public final GradientDrawable z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v80, types: [org.telegram.ui.Components.gk0, org.telegram.ui.Components.rv] */
    /* JADX WARN: Type inference failed for: r9v15, types: [org.telegram.ui.Components.gk0, org.telegram.ui.Components.rv] */
    public vy(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.p6 p6Var, boolean z15, boolean z16) {
        super(context);
        ex exVar;
        nv nvVar;
        boolean z17;
        int i10;
        boolean z18;
        final org.telegram.ui.ActionBar.p6 p6Var2;
        ei.r rVar;
        int i11;
        boolean z19;
        float f7;
        Field field;
        boolean z20;
        gr grVar = gr.h;
        this.a = new fe.b(0, this, grVar, 320L, false);
        this.b = new fe.b(1, this, grVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.c0 = true;
        this.k0 = new dy(this);
        this.l0 = new HashMap();
        this.q0 = true;
        this.r0 = -2;
        this.s0 = -2;
        this.t0 = -2;
        this.u0 = true;
        this.w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i12 = org.telegram.messenger.d20.s0;
        this.c1 = i12;
        this.d1 = new ArrayList();
        this.i1 = new ArrayList();
        this.j1 = new ArrayList();
        this.k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.m1 = new ArrayList();
        this.n1 = new ArrayList();
        new ArrayList();
        this.o1 = new ArrayList();
        this.p1 = new ArrayList();
        this.q1 = new ArrayList();
        this.r1 = new HashMap();
        this.x1 = new TLRPC.StickerSetCovered[10];
        this.y1 = new LongSparseArray();
        this.z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f2 = new ew(this, 0);
        this.g2 = new pw(this);
        this.h2 = true;
        ei.r rVar2 = new ei.r();
        this.n2 = rVar2;
        this.r2 = -1.0f;
        this.t2 = -1;
        this.u2 = -1;
        this.v2 = -1L;
        this.w2 = false;
        this.x2 = true;
        this.y2 = new Rect();
        this.z2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.E2 = new fe.b(0, new ov(this, 3), grVar, 380L, true);
        this.R2 = new nv(this, 1);
        this.S2 = false;
        this.u0 = z14;
        this.Y1 = k2Var;
        this.c2 = z10;
        this.Z1 = p6Var;
        this.i2 = z16;
        hi.c cVar = new hi.c();
        this.l2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.t6.d6));
        if (z15) {
            u(true);
        }
        i0.b.o(A(org.telegram.ui.ActionBar.t6.Kl), 30);
        int L = org.telegram.messenger.i0.L(50.0f);
        this.b1 = L;
        this.d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.t6.W(context, R.drawable.smiles_tab_smiles, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Gf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df)), org.telegram.ui.ActionBar.t6.W(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Gf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df)), org.telegram.ui.ActionBar.t6.W(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Gf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df))};
        org.telegram.ui.ActionBar.e6 W = org.telegram.ui.ActionBar.t6.W(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df));
        org.telegram.ui.ActionBar.e6 W2 = org.telegram.ui.ActionBar.t6.W(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df));
        org.telegram.ui.ActionBar.e6 W3 = org.telegram.ui.ActionBar.t6.W(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df));
        org.telegram.ui.ActionBar.e6 W4 = org.telegram.ui.ActionBar.t6.W(context, R.drawable.emoji_tabs_new1, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df));
        this.a2 = W4;
        int i13 = org.telegram.ui.ActionBar.t6.Ff;
        org.telegram.ui.ActionBar.e6 W5 = org.telegram.ui.ActionBar.t6.W(context, R.drawable.emoji_tabs_new2, A(i13), A(i13));
        this.b2 = W5;
        this.Y0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.t6.W(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df)), org.telegram.ui.ActionBar.t6.W(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df))};
        this.a1 = new String[]{org.telegram.messenger.cd.L0(2131751196, null), org.telegram.messenger.cd.L0(2131751195, null), org.telegram.messenger.cd.L0(2131751194, null), org.telegram.messenger.cd.L0(2131751193, null), org.telegram.messenger.cd.L0(2131751192, null), org.telegram.messenger.cd.L0(2131751191, null), org.telegram.messenger.cd.L0(2131751190, null), org.telegram.messenger.cd.L0(2131751189, null)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.t6.Pf));
        float L2 = org.telegram.messenger.i0.L(6.0f);
        bi.d2 d2Var = rf.e0.a;
        this.M1 = new rf.b0(L2);
        uw uwVar = new uw(this, context);
        this.J = uwVar;
        ry ryVar = new ry();
        ryVar.a = 0;
        ryVar.b = uwVar;
        arrayList.add(ryVar);
        if (z10) {
            org.telegram.messenger.ui.b0(i12).B(5);
            org.telegram.messenger.ui.b0(i12).w();
            this.e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.t6.Ci), PorterDuff.Mode.SRC_IN);
        }
        hx hxVar = new hx(this, context);
        this.P = hxVar;
        rVar2.b(hxVar);
        s4.j jVar = new s4.j();
        jVar.c = 220L;
        jVar.e = 220L;
        jVar.f = 160L;
        jVar.g = 160L;
        jVar.i = gr.g;
        hxVar.setItemAnimator(jVar);
        final int i14 = 0;
        hxVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.pv
            public final /* synthetic */ vy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i14) {
                    case 0:
                        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
                        vy vyVar = this.b;
                        hx hxVar2 = vyVar.P;
                        vyVar.getMeasuredHeight();
                        return p5.r(motionEvent, hxVar2, null, vyVar.g2, p6Var);
                    case 1:
                        org.telegram.ui.lt p9 = org.telegram.ui.lt.p();
                        vy vyVar2 = this.b;
                        return p9.r(motionEvent, vyVar2.h0, vyVar2.m0, vyVar2.g2, p6Var);
                    default:
                        org.telegram.ui.lt p10 = org.telegram.ui.lt.p();
                        vy vyVar3 = this.b;
                        bw bwVar = vyVar3.D0;
                        vyVar3.getMeasuredHeight();
                        return p10.r(motionEvent, bwVar, vyVar3.A0, vyVar3.g2, p6Var);
                }
            }
        });
        hxVar.setOnItemLongClickListener(new ov(this, 1));
        hxVar.setInstantClick(true);
        vw vwVar = new vw(this);
        this.Q = vwVar;
        hxVar.setLayoutManager(vwVar);
        hxVar.setTopGlowOffset(org.telegram.messenger.i0.L(38.0f));
        hxVar.setBottomGlowOffset(org.telegram.messenger.i0.L(36.0f));
        hxVar.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(44.0f));
        int i15 = org.telegram.ui.ActionBar.t6.wf;
        org.telegram.ui.ActionBar.a7.m(hxVar, 21, i15, p6Var);
        hxVar.setItemSelectorColorProvider(new au(1));
        hxVar.setClipToPadding(false);
        vwVar.O = new ww(this);
        ex exVar2 = new ex(this);
        this.R = exVar2;
        hxVar.setAdapter(exVar2);
        hxVar.i(new mg.u1(this, 4));
        this.S = new ux(this, context);
        uwVar.addView(hxVar, w7.b6.c(-1.0f, -1));
        vj0 vj0Var = new vj0(hxVar, vwVar);
        this.b0 = vj0Var;
        vj0Var.i = new xw(this);
        hxVar.setOnScrollListener(new yw(this));
        if (k2Var != null) {
            exVar = exVar2;
            nvVar = new nv(this, 2);
            z17 = z10;
            i10 = -1;
            z18 = z16;
            rVar = rVar2;
            i11 = 5;
            p6Var2 = p6Var;
        } else {
            exVar = exVar2;
            nvVar = null;
            z17 = z10;
            i10 = -1;
            z18 = z16;
            p6Var2 = p6Var;
            rVar = rVar2;
            i11 = 5;
        }
        zw zwVar = new zw(this, context, p6Var2, z17, nvVar, z18);
        this.I = zwVar;
        if (z13) {
            tv tvVar = new tv(this, context);
            this.V = tvVar;
            uwVar.addView(tvVar, new FrameLayout.LayoutParams(i10, org.telegram.messenger.i0.f1() + L));
            tvVar.d.setOnFocusChangeListener(new uv(this));
            fh.c cVar2 = new fh.c(context, p6Var2);
            this.U = cVar2;
            cVar2.setVisibility(8);
            final int i16 = 0;
            cVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qv
                public final /* synthetic */ vy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            ux uxVar = this.b.S;
                            qx qxVar = uxVar.c;
                            int childCount = qxVar.getChildCount();
                            for (int i17 = 0; i17 < childCount; i17++) {
                                ((fh.b) qxVar.getChildAt(i17)).a(false, true);
                            }
                            uxVar.d = 0L;
                            uxVar.F.b.a(false, true);
                            uxVar.f();
                            break;
                        case 1:
                            qy qyVar = this.b.z0;
                            qx qxVar2 = qyVar.c;
                            int childCount2 = qxVar2.getChildCount();
                            for (int i18 = 0; i18 < childCount2; i18++) {
                                ((fh.b) qxVar2.getChildAt(i18)).a(false, true);
                            }
                            qyVar.d = 0L;
                            qyVar.Q.a.a(false, true);
                            qyVar.f();
                            break;
                        case 2:
                            vx vxVar = this.b.t1;
                            if (vxVar != null) {
                                vxVar.w();
                                break;
                            }
                            break;
                        default:
                            vy vyVar = this.b;
                            int currentItem = vyVar.h.getCurrentItem();
                            iy iyVar = currentItem == 0 ? vyVar.V : currentItem == 1 ? vyVar.o0 : vyVar.G0;
                            if (iyVar != null) {
                                yp ypVar = iyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            uwVar.addView(cVar2, new FrameLayout.LayoutParams(i10, L));
        }
        if (Color.alpha(A(i15)) >= 255) {
            org.telegram.ui.ActionBar.a7.i(i15, zwVar, p6Var2);
        }
        exVar.G(true);
        zwVar.p(getEmojipacks());
        uwVar.addView(zwVar, w7.b6.c(36.0f, i10));
        View view = new View(context);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i17 = org.telegram.ui.ActionBar.t6.zf;
        org.telegram.ui.ActionBar.a7.i(i17, view, p6Var2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, org.telegram.messenger.i0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.i0.L(36.0f);
        uwVar.addView(view, layoutParams);
        fh.a aVar = new fh.a(context, p6Var2);
        this.L = aVar;
        fg.i iVar = new fg.i(context, p6Var2);
        this.K = iVar;
        iVar.setVisibility(8);
        iVar.addView(aVar, w7.b6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        uwVar.addView(iVar, w7.b6.e(i10, -2, 80));
        if (z11) {
            tl0 tl0Var = tl0.b;
            if (z12) {
                vv vvVar = new vv(this, context);
                this.g0 = vvVar;
                ry ryVar2 = new ry();
                ryVar2.a = 1;
                ryVar2.b = vvVar;
                this.d.add(ryVar2);
                wv wvVar = new wv(this, context);
                this.h0 = wvVar;
                rVar.b(wvVar);
                wvVar.setClipToPadding(false);
                ay ayVar = new ay(this);
                this.i0 = ayVar;
                wvVar.setLayoutManager(ayVar);
                wvVar.i(new xv(this));
                wvVar.setPadding(0, L, 0, org.telegram.messenger.i0.L(44.0f) + this.q2);
                ((s4.f1) wvVar.getItemAnimator()).m = false;
                final int i18 = 1;
                zx zxVar = new zx(this, context, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.n0 = zxVar;
                wvVar.setAdapter(zxVar);
                this.j0 = new zx(this, context, false, 0);
                wvVar.setOnScrollListener(new uy(this, 2));
                wvVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.pv
                    public final /* synthetic */ vy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i18) {
                            case 0:
                                org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
                                vy vyVar = this.b;
                                hx hxVar2 = vyVar.P;
                                vyVar.getMeasuredHeight();
                                return p5.r(motionEvent, hxVar2, null, vyVar.g2, p6Var2);
                            case 1:
                                org.telegram.ui.lt p9 = org.telegram.ui.lt.p();
                                vy vyVar2 = this.b;
                                return p9.r(motionEvent, vyVar2.h0, vyVar2.m0, vyVar2.g2, p6Var2);
                            default:
                                org.telegram.ui.lt p10 = org.telegram.ui.lt.p();
                                vy vyVar3 = this.b;
                                bw bwVar = vyVar3.D0;
                                vyVar3.getMeasuredHeight();
                                return p10.r(motionEvent, bwVar, vyVar3.A0, vyVar3.g2, p6Var2);
                        }
                    }
                });
                final int i19 = 0;
                ?? r92 = new gk0(this) { // from class: org.telegram.ui.Components.rv
                    public final /* synthetic */ vy b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.gk0
                    public final void f(int i20, View view2) {
                        switch (i19) {
                            case 0:
                                vy vyVar = this.b;
                                wv wvVar2 = vyVar.h0;
                                zx zxVar2 = vyVar.j0;
                                zx zxVar3 = vyVar.n0;
                                if (vyVar.t1 != null) {
                                    zxVar3.getClass();
                                    ArrayList arrayList2 = zxVar3.y;
                                    if (wvVar2.getAdapter() != zxVar3) {
                                        if (wvVar2.getAdapter() == zxVar2 && i20 >= 0 && i20 < zxVar2.y.size()) {
                                            vyVar.t1.v(view2, zxVar2.y.get(i20), zxVar2.x, zxVar2.n, true, 0, 0);
                                            vyVar.X();
                                            break;
                                        }
                                    } else if (i20 >= 0) {
                                        int i21 = zxVar3.H;
                                        if (i20 >= i21) {
                                            int i22 = i21 > 0 ? (i20 - i21) - 1 : i20;
                                            if (i22 >= 0 && i22 < arrayList2.size()) {
                                                vyVar.t1.v(view2, arrayList2.get(i22), null, zxVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            vyVar.t1.v(view2, vyVar.i1.get(i20), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                vy vyVar2 = this.b;
                                s4.g0 adapter = vyVar2.D0.getAdapter();
                                qy qyVar = vyVar2.z0;
                                String str = adapter == qyVar ? qyVar.N : null;
                                if (view2 instanceof org.telegram.ui.Cells.d8) {
                                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                    if (d8Var.getSticker() != null && org.telegram.messenger.jj.X3(d8Var.getSticker()) && !org.telegram.messenger.d20.i(org.telegram.messenger.c.a(vyVar2.c1).a).q()) {
                                        org.telegram.ui.lt.p().x(d8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.lt.p().t();
                                        if (!d8Var.r) {
                                            d8Var.r = true;
                                            d8Var.n = 0.5f;
                                            d8Var.y = 0L;
                                            org.telegram.ui.Cells.c8 c8Var = d8Var.a;
                                            c8Var.setAlpha(0.5f * d8Var.H);
                                            c8Var.invalidate();
                                            d8Var.s = System.currentTimeMillis();
                                            d8Var.invalidate();
                                            vyVar2.t1.m(d8Var, d8Var.getSticker(), str, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.m0 = r92;
                wvVar.setOnItemClickListener((gk0) r92);
                vvVar.addView(wvVar, w7.b6.c(-1.0f, -1));
                yv yvVar = new yv(this, context);
                this.o0 = yvVar;
                vvVar.addView(yvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1() + L));
                cx cxVar = new cx(this, context, p6Var2);
                this.p0 = cxVar;
                cxVar.setType(tl0Var);
                cxVar.setUnderlineHeight(org.telegram.messenger.i0.f1());
                cxVar.setIndicatorColor(A(i13));
                cxVar.setUnderlineColor(A(i17));
                org.telegram.ui.ActionBar.a7.i(i15, cxVar, p6Var2);
                W();
                cxVar.setDelegate(new ov(this, 2));
                zxVar.F("", "", true, true, true);
            }
            zv zvVar = new zv(this, context, z14);
            this.x0 = zvVar;
            org.telegram.messenger.ui.b0(this.c1).B(0);
            org.telegram.messenger.ui.b0(this.c1).x();
            bw bwVar = new bw(this, context);
            this.D0 = bwVar;
            this.n2.b(bwVar);
            cw cwVar = new cw(this);
            this.E0 = cwVar;
            bwVar.setLayoutManager(cwVar);
            cwVar.O = new dw(this);
            bwVar.setPadding(0, org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(44.0f));
            bwVar.setClipToPadding(false);
            ry ryVar3 = new ry();
            ryVar3.a = 2;
            ryVar3.b = zvVar;
            this.d.add(ryVar3);
            this.z0 = new qy(this, context);
            ny nyVar = new ny(this, context);
            this.y0 = nyVar;
            bwVar.setAdapter(nyVar);
            final int i20 = 2;
            bwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.pv
                public final /* synthetic */ vy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i20) {
                        case 0:
                            org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
                            vy vyVar = this.b;
                            hx hxVar2 = vyVar.P;
                            vyVar.getMeasuredHeight();
                            return p5.r(motionEvent, hxVar2, null, vyVar.g2, p6Var2);
                        case 1:
                            org.telegram.ui.lt p9 = org.telegram.ui.lt.p();
                            vy vyVar2 = this.b;
                            return p9.r(motionEvent, vyVar2.h0, vyVar2.m0, vyVar2.g2, p6Var2);
                        default:
                            org.telegram.ui.lt p10 = org.telegram.ui.lt.p();
                            vy vyVar3 = this.b;
                            bw bwVar2 = vyVar3.D0;
                            vyVar3.getMeasuredHeight();
                            return p10.r(motionEvent, bwVar2, vyVar3.A0, vyVar3.g2, p6Var2);
                    }
                }
            });
            final int i21 = 1;
            ?? r42 = new gk0(this) { // from class: org.telegram.ui.Components.rv
                public final /* synthetic */ vy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.gk0
                public final void f(int i202, View view2) {
                    switch (i21) {
                        case 0:
                            vy vyVar = this.b;
                            wv wvVar2 = vyVar.h0;
                            zx zxVar2 = vyVar.j0;
                            zx zxVar3 = vyVar.n0;
                            if (vyVar.t1 != null) {
                                zxVar3.getClass();
                                ArrayList arrayList2 = zxVar3.y;
                                if (wvVar2.getAdapter() != zxVar3) {
                                    if (wvVar2.getAdapter() == zxVar2 && i202 >= 0 && i202 < zxVar2.y.size()) {
                                        vyVar.t1.v(view2, zxVar2.y.get(i202), zxVar2.x, zxVar2.n, true, 0, 0);
                                        vyVar.X();
                                        break;
                                    }
                                } else if (i202 >= 0) {
                                    int i212 = zxVar3.H;
                                    if (i202 >= i212) {
                                        int i22 = i212 > 0 ? (i202 - i212) - 1 : i202;
                                        if (i22 >= 0 && i22 < arrayList2.size()) {
                                            vyVar.t1.v(view2, arrayList2.get(i22), null, zxVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        vyVar.t1.v(view2, vyVar.i1.get(i202), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            vy vyVar2 = this.b;
                            s4.g0 adapter = vyVar2.D0.getAdapter();
                            qy qyVar = vyVar2.z0;
                            String str = adapter == qyVar ? qyVar.N : null;
                            if (view2 instanceof org.telegram.ui.Cells.d8) {
                                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                if (d8Var.getSticker() != null && org.telegram.messenger.jj.X3(d8Var.getSticker()) && !org.telegram.messenger.d20.i(org.telegram.messenger.c.a(vyVar2.c1).a).q()) {
                                    org.telegram.ui.lt.p().x(d8Var);
                                    break;
                                } else {
                                    org.telegram.ui.lt.p().t();
                                    if (!d8Var.r) {
                                        d8Var.r = true;
                                        d8Var.n = 0.5f;
                                        d8Var.y = 0L;
                                        org.telegram.ui.Cells.c8 c8Var = d8Var.a;
                                        c8Var.setAlpha(0.5f * d8Var.H);
                                        c8Var.invalidate();
                                        d8Var.s = System.currentTimeMillis();
                                        d8Var.invalidate();
                                        vyVar2.t1.m(d8Var, d8Var.getSticker(), str, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.A0 = r42;
            bwVar.setOnItemClickListener((gk0) r42);
            org.telegram.ui.ActionBar.a7.m(bwVar, 21, i15, p6Var2);
            zvVar.addView(bwVar);
            this.a0 = new vj0(bwVar, cwVar);
            fw fwVar = new fw(this, context);
            this.G0 = fwVar;
            zvVar.addView(fwVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1() + L));
            fh.c cVar3 = new fh.c(context, p6Var2);
            this.H0 = cVar3;
            cVar3.setVisibility(8);
            final int i22 = 1;
            cVar3.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qv
                public final /* synthetic */ vy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i22) {
                        case 0:
                            ux uxVar = this.b.S;
                            qx qxVar = uxVar.c;
                            int childCount = qxVar.getChildCount();
                            for (int i172 = 0; i172 < childCount; i172++) {
                                ((fh.b) qxVar.getChildAt(i172)).a(false, true);
                            }
                            uxVar.d = 0L;
                            uxVar.F.b.a(false, true);
                            uxVar.f();
                            break;
                        case 1:
                            qy qyVar = this.b.z0;
                            qx qxVar2 = qyVar.c;
                            int childCount2 = qxVar2.getChildCount();
                            for (int i182 = 0; i182 < childCount2; i182++) {
                                ((fh.b) qxVar2.getChildAt(i182)).a(false, true);
                            }
                            qyVar.d = 0L;
                            qyVar.Q.a.a(false, true);
                            qyVar.f();
                            break;
                        case 2:
                            vx vxVar = this.b.t1;
                            if (vxVar != null) {
                                vxVar.w();
                                break;
                            }
                            break;
                        default:
                            vy vyVar = this.b;
                            int currentItem = vyVar.h.getCurrentItem();
                            iy iyVar = currentItem == 0 ? vyVar.V : currentItem == 1 ? vyVar.o0 : vyVar.G0;
                            if (iyVar != null) {
                                yp ypVar = iyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            zvVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z19 = z14;
            gw gwVar = new gw(this, context, p6Var2, k2Var, z19);
            this.B0 = gwVar;
            gwVar.setDragEnabled(true);
            gwVar.setWillNotDraw(false);
            gwVar.setType(tl0Var);
            gwVar.setUnderlineHeight(bwVar.canScrollVertically(-1) ? org.telegram.messenger.i0.f1() : 0);
            gwVar.setIndicatorColor(A(i13));
            gwVar.setUnderlineColor(A(i17));
            if (viewGroup == null || !z19) {
                zvVar.addView(gwVar, w7.b6.e(-1, 36, 51));
            } else {
                hw hwVar = new hw(this, context);
                this.C0 = hwVar;
                hwVar.addView(gwVar, w7.b6.e(-1, 36, 51));
                viewGroup.addView(hwVar, w7.b6.c(-2.0f, -1));
            }
            Y(true);
            gwVar.setDelegate(new ov(this, 4));
            bwVar.setOnScrollListener(new uy(this, 0));
            fh.a aVar2 = new fh.a(context, p6Var2);
            this.N = aVar2;
            fg.i iVar2 = new fg.i(context, p6Var2);
            this.M = iVar2;
            iVar2.setVisibility(8);
            iVar2.addView(aVar2, w7.b6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            zvVar.addView(iVar2, w7.b6.e(-1, -2, 80));
        } else {
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        iw iwVar = new iw(this, context);
        this.h = iwVar;
        ei.r rVar3 = this.n2;
        rVar3.getClass();
        iwVar.b(new ei.j(rVar3, iwVar));
        iwVar.setOverScrollMode(2);
        ox oxVar = new ox(this);
        this.L0 = oxVar;
        iwVar.setAdapter(oxVar);
        jw jwVar = new jw(this, context);
        this.y = jwVar;
        jwVar.setHapticFeedbackEnabled(true);
        jwVar.setImageResource(R.drawable.smiles_tab_clear);
        int w9 = z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.t6.Gf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        jwVar.setColorFilter(new PorterDuffColorFilter(w9, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        jwVar.setScaleType(scaleType);
        jwVar.setContentDescription(org.telegram.messenger.cd.L0(2131754920, null));
        jwVar.setFocusable(true);
        jwVar.setOnClickListener(new kw());
        w7.e6.a(jwVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        if (z13) {
            f7 = 40.0f;
            addView(frameLayout, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.i0.f1() / org.telegram.messenger.i0.p) + 40.0f));
        } else {
            f7 = 40.0f;
            addView(frameLayout, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        addView(frameLayout2, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.n = frameLayout3;
        View view2 = new View(context);
        this.w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.L(f7), 83));
        if (z13) {
            addView(frameLayout3, w7.b6.e(-1, 48, 80));
            frameLayout3.addView(jwVar, w7.b6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context);
                this.D = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.t6.Gf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.cd.L0(2131745512, null));
                w7.e6.a(imageView);
                frameLayout3.addView(imageView, w7.b6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i23 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qv
                    public final /* synthetic */ vy b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i23) {
                            case 0:
                                ux uxVar = this.b.S;
                                qx qxVar = uxVar.c;
                                int childCount = qxVar.getChildCount();
                                for (int i172 = 0; i172 < childCount; i172++) {
                                    ((fh.b) qxVar.getChildAt(i172)).a(false, true);
                                }
                                uxVar.d = 0L;
                                uxVar.F.b.a(false, true);
                                uxVar.f();
                                break;
                            case 1:
                                qy qyVar = this.b.z0;
                                qx qxVar2 = qyVar.c;
                                int childCount2 = qxVar2.getChildCount();
                                for (int i182 = 0; i182 < childCount2; i182++) {
                                    ((fh.b) qxVar2.getChildAt(i182)).a(false, true);
                                }
                                qyVar.d = 0L;
                                qyVar.Q.a.a(false, true);
                                qyVar.f();
                                break;
                            case 2:
                                vx vxVar = this.b.t1;
                                if (vxVar != null) {
                                    vxVar.w();
                                    break;
                                }
                                break;
                            default:
                                vy vyVar = this.b;
                                int currentItem = vyVar.h.getCurrentItem();
                                iy iyVar = currentItem == 0 ? vyVar.V : currentItem == 1 ? vyVar.o0 : vyVar.G0;
                                if (iyVar != null) {
                                    yp ypVar = iyVar.d;
                                    ypVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    ypVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    ypVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            jc0 jc0Var = new jc0(context, p6Var2);
            this.x = jc0Var;
            jc0Var.setViewPager(iwVar);
            jc0Var.setShouldExpand(false);
            jc0Var.setIndicatorHeight(org.telegram.messenger.i0.L(3.0f));
            jc0Var.setIndicatorColor(i0.b.o(A(org.telegram.ui.ActionBar.t6.Df), 20));
            jc0Var.setUnderlineHeight(0);
            jc0Var.setTabPaddingLeftRight(org.telegram.messenger.i0.L(11.0f));
            jc0Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(11.0f));
            frameLayout3.addView(jc0Var, w7.b6.e(-2, 48, 81));
            jc0Var.setOnPageChangeListener(new lw(this, z19));
            ImageView imageView2 = new ImageView(context);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.t6.Gf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.b6.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i24 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qv
                public final /* synthetic */ vy b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i24) {
                        case 0:
                            ux uxVar = this.b.S;
                            qx qxVar = uxVar.c;
                            int childCount = qxVar.getChildCount();
                            for (int i172 = 0; i172 < childCount; i172++) {
                                ((fh.b) qxVar.getChildAt(i172)).a(false, true);
                            }
                            uxVar.d = 0L;
                            uxVar.F.b.a(false, true);
                            uxVar.f();
                            break;
                        case 1:
                            qy qyVar = this.b.z0;
                            qx qxVar2 = qyVar.c;
                            int childCount2 = qxVar2.getChildCount();
                            for (int i182 = 0; i182 < childCount2; i182++) {
                                ((fh.b) qxVar2.getChildAt(i182)).a(false, true);
                            }
                            qyVar.d = 0L;
                            qyVar.Q.a.a(false, true);
                            qyVar.f();
                            break;
                        case 2:
                            vx vxVar = this.b.t1;
                            if (vxVar != null) {
                                vxVar.w();
                                break;
                            }
                            break;
                        default:
                            vy vyVar = this.b;
                            int currentItem = vyVar.h.getCurrentItem();
                            iy iyVar = currentItem == 0 ? vyVar.V : currentItem == 1 ? vyVar.o0 : vyVar.G0;
                            if (iyVar != null) {
                                yp ypVar = iyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.b6.d(56, 48.0f, (org.telegram.messenger.cd.X ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(56.0f), A(i15), A(i15));
            w7.e6.a(jwVar);
            jwVar.setPadding(0, 0, org.telegram.messenger.i0.L(2.0f), 0);
            jwVar.setBackground(j02);
            jwVar.setContentDescription(org.telegram.messenger.cd.L0(2131754920, null));
            jwVar.setFocusable(true);
            frameLayout3.addView(jwVar, w7.b6.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(iwVar, 0, w7.b6.e(-1, -1, 51));
        ag.j3 j3Var = new ag.j3(context, 21);
        this.N0 = j3Var;
        int L3 = org.telegram.messenger.i0.L(6.0f);
        int i25 = org.telegram.ui.ActionBar.t6.eg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L3, A(i25));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i25);
        j3Var.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(j3Var, d02, N, null, p6Var2);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.dg, p6Var2);
        j3Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(7.0f));
        char c10 = 16;
        j3Var.setGravity(16);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setVisibility(4);
        addView(j3Var, w7.b6.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? f7 : 32.0f);
        Field field2 = ju.f;
        ju juVar = new ju(new iu(context, p6Var2));
        if (ju.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            ju.f = field;
        }
        Field field3 = ju.f;
        if (field3 != null) {
            try {
                juVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(juVar);
                ju.f.set(juVar, ju.g);
            } catch (Exception unused3) {
                juVar.a = null;
            }
        }
        this.B1 = juVar;
        juVar.c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = org.telegram.messenger.vp.c1().getInt("selected_page", 0);
        HashMap hashMap = org.telegram.messenger.k6.h;
        if (!org.telegram.messenger.k6.k) {
            org.telegram.messenger.k6.k = true;
            SharedPreferences c12 = org.telegram.messenger.vp.c1();
            try {
                hashMap.clear();
                if (c12.contains("emojis")) {
                    String string = c12.getString("emojis", "");
                    if (string != null && string.length() > 0) {
                        String[] split = string.split(",");
                        int length = split.length;
                        int i26 = 0;
                        while (i26 < length) {
                            String[] split2 = split[i26].split("=");
                            long longValue = Utilities.A(split2[0]).longValue();
                            char c11 = c10;
                            StringBuilder sb2 = new StringBuilder();
                            String[] strArr = split;
                            int i27 = length;
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
                            i26++;
                            c10 = c11;
                            split = strArr;
                            length = i27;
                        }
                    }
                    c12.edit().remove("emojis").commit();
                    org.telegram.messenger.k6.r();
                } else {
                    String string2 = c12.getString("emojis2", "");
                    if (string2 != null && string2.length() > 0) {
                        for (String str : string2.split(",")) {
                            String[] split3 = str.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !c12.getBoolean("filled_default", false)) {
                    int i30 = 0;
                    while (true) {
                        String[] strArr2 = org.telegram.messenger.k6.o;
                        if (i30 >= strArr2.length) {
                            break;
                        }
                        hashMap.put(strArr2[i30], Integer.valueOf(strArr2.length - i30));
                        i30++;
                    }
                    c12.edit().putBoolean("filled_default", true).commit();
                    org.telegram.messenger.k6.r();
                }
                org.telegram.messenger.k6.s();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            try {
                String string3 = c12.getString("color", "");
                if (string3 != null && string3.length() > 0) {
                    for (String str2 : string3.split(",")) {
                        String[] split4 = str2.split("=");
                        org.telegram.messenger.k6.j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e7) {
                z20 = true;
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        z20 = true;
        exVar.F(false);
        J(z20, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            tg.f fVar = new tg.f(false);
            this.j2 = fVar;
            this.n2.a(fVar);
            hi.f fVar2 = new hi.f(null);
            fVar2.f = cVar;
            fVar2.d = fVar;
            fVar2.e = -2;
            tg.b bVar = new tg.b(fVar2);
            this.m2 = bVar;
            bVar.i = true;
            int L4 = org.telegram.messenger.i0.L(org.telegram.messenger.sc.e(262144) ? 8.0f : 48.0f);
            bVar.b = L4;
            bVar.c = L4;
            bVar.h = this.n2;
        } else {
            tg.b bVar2 = new tg.b(cVar);
            this.m2 = bVar2;
            bVar2.h = this.n2;
            this.j2 = null;
        }
        this.k2 = new qg(this, 1);
        setBlurredBackgroundDrawableFactory(this.m2);
        this.n2.i(this);
        this.n2.a = new ov(this, 0);
    }

    public static void a(vy vyVar, boolean z10) {
        wv wvVar = vyVar.h0;
        if (wvVar == null) {
            return;
        }
        int childCount = wvVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wvVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.h2) {
                ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                if (z10) {
                    photoImage.t0 = true;
                    photoImage.P0(false);
                } else {
                    photoImage.t0 = false;
                    photoImage.Q0();
                }
            }
        }
    }

    public static void b(vy vyVar, ey eyVar, String str) {
        String str2;
        vx vxVar;
        org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
        int i10 = vyVar.c1;
        ArrayList arrayList = vyVar.q1;
        if (eyVar == null) {
            return;
        }
        if (eyVar.getSpan() == null) {
            vyVar.D2 = SystemClock.elapsedRealtime();
            vyVar.N(true);
            String str3 = str != null ? str : (String) eyVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                vx vxVar2 = vyVar.t1;
                if (vxVar2 != null) {
                    vxVar2.l(org.telegram.messenger.k6.c(str));
                    return;
                }
                return;
            }
            if (!eyVar.c && (str2 = (String) org.telegram.messenger.k6.j.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            vyVar.h(str3);
            vx vxVar3 = vyVar.t1;
            if (vxVar3 != null) {
                vxVar3.l(org.telegram.messenger.k6.c(str3));
                return;
            }
            return;
        }
        if (vyVar.t1 != null) {
            long j10 = eyVar.getSpan().documentId;
            TLRPC.Document document = eyVar.getSpan().document;
            ix ixVar = eyVar.e;
            boolean z10 = ixVar != null && ixVar.i;
            if (document == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ix ixVar2 = (ix) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = ixVar2.c;
                        if (arrayList2 != null && i12 < arrayList2.size()) {
                            if (((TLRPC.Document) ixVar2.c.get(i12)).id == j10) {
                                document = (TLRPC.Document) ixVar2.c.get(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            if (document == null) {
                document = f5.e(i10, j10);
            }
            TLRPC.Document document2 = document;
            String U = document2 != null ? org.telegram.messenger.jj.U(document2) : null;
            if (org.telegram.messenger.jj.m3(document2) || org.telegram.messenger.d20.i(i10).q() || (((vxVar = vyVar.t1) != null && vxVar.g()) || vyVar.U0 || z10)) {
                vyVar.D2 = SystemClock.elapsedRealtime();
                vyVar.N(true);
                vyVar.h("animated_" + j10);
                vyVar.t1.x(j10, document2, U, eyVar.c);
                return;
            }
            vyVar.N(false);
            cc a02 = k2Var != null ? cc.a0(k2Var) : new cc(vyVar.r, vyVar.Z1);
            if (vyVar.h2 || k2Var == null) {
                a02.r(document2, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131743889, null)), org.telegram.messenger.cd.L0(2131747048, null), new nv(vyVar, 3)).j();
            } else {
                a02.K(R.raw.saved_messages, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131743888, null)), org.telegram.messenger.cd.L0(2131747833, null), new nv(vyVar, 4)).j();
            }
            vyVar.h2 = !vyVar.h2;
        }
    }

    public static void e(vy vyVar, int i10, int i11) {
        s4.c1 K;
        int[] iArr = vyVar.Q0;
        if (i10 == 1) {
            vyVar.n(i11, vyVar.P);
            return;
        }
        vx vxVar = vyVar.t1;
        if ((vxVar == null || !vxVar.z()) && !vyVar.J0) {
            tk0 y3 = vyVar.y(i10);
            if (i11 <= 0 || y3 == null || y3.getVisibility() != 0 || (K = y3.K(0)) == null || K.a.getTop() + vyVar.b1 < y3.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-org.telegram.messenger.i0.L(288.0f))) {
                    iArr[i10] = -org.telegram.messenger.i0.L(288.0f);
                }
                if (i10 == 0) {
                    vyVar.Z();
                } else {
                    vyVar.z(i10).setTranslationY(Math.max(-org.telegram.messenger.i0.L(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(vy vyVar, boolean z10) {
        int N0;
        ay ayVar = vyVar.i0;
        yv yvVar = vyVar.o0;
        wv wvVar = vyVar.h0;
        if (wvVar != null && (wvVar.getAdapter() instanceof zx)) {
            zx zxVar = (zx) wvVar.getAdapter();
            if (!zxVar.s && zxVar.h == 0 && !zxVar.y.isEmpty() && (N0 = ayVar.N0()) != -1 && N0 > ayVar.B() - 5) {
                String str = zxVar.x;
                String str2 = zxVar.r;
                boolean z11 = zxVar.w;
                zxVar.F(str, str2, true, z11, z11);
            }
        }
        vx vxVar = vyVar.t1;
        if (vxVar == null || !vxVar.z()) {
            if (yvVar == null || wvVar == null) {
                return;
            }
            yvVar.a.a(true, !z10);
            return;
        }
        s4.c1 K = wvVar.K(0);
        if (K == null) {
            iy.a(yvVar, true, !z10);
        } else {
            iy.a(yvVar, K.a.getTop() < wvVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        String str3;
        boolean z10 = true;
        if (org.telegram.messenger.k4.c(str) != null) {
            if (org.telegram.messenger.k4.c(str) == null) {
                return str;
            }
            if (str2 == null) {
                return "🤝";
            }
            if (!str2.contains("\u200d")) {
                return "🤝".concat(str2);
            }
            String[] split = str2.split("\u200d");
            StringBuilder sb2 = new StringBuilder("\u1faf1");
            sb2.append(split.length >= 1 ? split[0] : "");
            sb2.append("\u200d\u1faf2");
            sb2.append(split.length >= 2 ? split[1] : "");
            return sb2.toString();
        }
        if (org.telegram.messenger.k6.b(str)) {
            str = c3.i0.m(2, 0, str);
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = c3.i0.m(2, 0, str);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = c3.i0.m(3, 0, str);
        }
        String A = sc.e.A(str, str2);
        if (str3 != null) {
            A = sc.e.A(A, str3);
        }
        return z10 ? sc.e.A(A, "\u200d➡") : A;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.Z1;
        return p6Var != null ? p6Var.h(i10) : org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public final void B() {
        fw fwVar = this.G0;
        if (fwVar != null) {
            fwVar.b();
        }
        yv yvVar = this.o0;
        if (yvVar != null) {
            yvVar.b();
        }
        tv tvVar = this.V;
        if (tvVar != null) {
            tvVar.b();
        }
    }

    public final void C() {
        xa.n nVar = this.M2;
        if (nVar != null) {
            nVar.a();
            this.M2 = null;
        }
        xa.n nVar2 = this.N2;
        if (nVar2 != null) {
            nVar2.a();
            this.N2 = null;
            this.O2 = false;
        }
    }

    public final void D(boolean z10, boolean z11) {
        hy hyVar;
        if (this.A1 != 0 && this.w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        iw iwVar = this.h;
        if (i10 == 0 || z10 || this.e.size() == 1) {
            M(true, false);
            R(false, false);
            if (iwVar.getCurrentItem() != 0) {
                iwVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.i0.h3(new nv(this, 5), 350L);
            }
        } else {
            int i11 = this.A1;
            if (i11 == 1) {
                M(false, false);
                R(this.u0 || this.v0, false);
                if (iwVar.getCurrentItem() != 2) {
                    iwVar.x(2, false);
                }
                gw gwVar = this.B0;
                if (gwVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        gwVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            gwVar.m(i13);
                        } else {
                            gwVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                M(false, false);
                R(false, false);
                if (iwVar.getCurrentItem() != 1) {
                    iwVar.x(1, false);
                }
                cx cxVar = this.p0;
                if (cxVar != null) {
                    cxVar.m(0);
                }
                yv yvVar = this.o0;
                if (yvVar != null && (hyVar = yvVar.r) != null) {
                    hyVar.I1(null);
                }
            }
        }
        N(true);
    }

    public final void F() {
        ny nyVar = this.y0;
        if (nyVar != null) {
            nyVar.f();
        }
        qy qyVar = this.z0;
        if (qyVar != null) {
            qyVar.f();
        }
        if (org.telegram.ui.lt.p().E) {
            org.telegram.ui.lt.p().m();
        }
        org.telegram.ui.lt.p().t();
    }

    public final void G(int i10) {
        vx vxVar = this.t1;
        if ((vxVar == null || !vxVar.z()) && i10 != 0) {
            HorizontalScrollView z10 = z(i10);
            this.Q0[i10] = 0;
            z10.setTranslationY(0);
        }
    }

    public final void H(int i10, int i11) {
        vw vwVar = this.Q;
        View m10 = vwVar.m(i10);
        int L0 = vwVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > vwVar.J * 9.0f) || !org.telegram.messenger.tz.c()) {
            int i12 = vwVar.L0() < i10 ? 0 : 1;
            vj0 vj0Var = this.b0;
            vj0Var.b = i12;
            vj0Var.d(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        qw qwVar = new qw(this, this.P.getContext(), 0);
        qwVar.a = i10;
        qwVar.p = i11;
        vwVar.w0(qwVar);
    }

    public final void I(int i10, int i11) {
        cw cwVar = this.E0;
        View m10 = cwVar.m(i10);
        int L0 = cwVar.L0();
        if (m10 != null || Math.abs(i10 - L0) <= 40) {
            this.J0 = true;
            this.D0.y0(i10);
        } else {
            int i12 = cwVar.L0() < i10 ? 0 : 1;
            vj0 vj0Var = this.a0;
            vj0Var.b = i12;
            vj0Var.d(i10, i11, false, false);
        }
    }

    public final void J(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((ry) arrayList2.get(i10)).a == 0 && z10) {
                arrayList.add((ry) arrayList2.get(i10));
            }
            if (((ry) arrayList2.get(i10)).a == 1 && z12) {
                arrayList.add((ry) arrayList2.get(i10));
            }
            if (((ry) arrayList2.get(i10)).a == 2 && z11) {
                arrayList.add((ry) arrayList2.get(i10));
            }
            i10++;
        }
        jc0 jc0Var = this.x;
        if (jc0Var != null) {
            org.telegram.messenger.i0.Y3(jc0Var, arrayList.size() > 1, 1.0f, true, z13);
        }
        iw iwVar = this.h;
        if (iwVar != null) {
            iwVar.setAdapter(null);
            iwVar.setAdapter(this.L0);
            if (jc0Var != null) {
                jc0Var.setViewPager(iwVar);
            }
        }
    }

    public final void K(final fh.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        qy qyVar;
        ux uxVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (uxVar = this.S) == null || uxVar.d == stickerSet.id) {
            if (z10 || (qyVar = this.z0) == null || qyVar.d == stickerSet.id) {
                final boolean B0 = org.telegram.messenger.ui.b0(this.c1).B0(stickerSet.id, true);
                aVar.i(B0 ? stickerSet.masks ? org.telegram.messenger.cd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.cd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.cd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]) : stickerSet.masks ? org.telegram.messenger.cd.G(stickerSet.count, "AddManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.cd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]) : org.telegram.messenger.cd.G(stickerSet.count, "AddManyStickersCount", new Object[0]), z11, true);
                aVar.k0.a(!B0, z11);
                aVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.sv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        vy vyVar = vy.this;
                        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(vyVar.c1);
                        Context context = vyVar.getContext();
                        int i10 = B0 ? 0 : 2;
                        org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
                        FrameLayout frameLayout = vyVar.s;
                        fh.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        b02.g2(context, tLObject2, document2, i10, k2Var, frameLayout, false, true, new i2.h1(vyVar, aVar2, tLObject2, stickerSet2, document2, z12, 6), false);
                        vyVar.K(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void L(long j10, boolean z10, boolean z11) {
        jc0 jc0Var = this.x;
        if (jc0Var == null) {
            return;
        }
        this.v1 = z10;
        this.w1 = z11;
        if (z11 || z10) {
            this.u1 = j10;
        } else {
            this.u1 = 0L;
        }
        int i10 = z11 ? 2 : 0;
        LinearLayout linearLayout = jc0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.u1 != 0 ? 0.15f : 1.0f);
            iw iwVar = this.h;
            if (z11) {
                if (this.u1 == 0 || iwVar.getCurrentItem() == 0) {
                    return;
                }
                M(true, true);
                R(false, true);
                iwVar.x(0, false);
                return;
            }
            if (this.u1 == 0 || iwVar.getCurrentItem() == 1) {
                return;
            }
            M(false, true);
            R(false, true);
            iwVar.x(1, false);
        }
    }

    public final void M(boolean z10, boolean z11) {
        jw jwVar = this.y;
        if (z10 && jwVar.getTag() == null) {
            return;
        }
        if ((z10 || jwVar.getTag() == null) && !this.o2) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            jwVar.setTag(z10 ? null : 1);
            if (!z11) {
                jwVar.setAlpha(z10 ? 1.0f : 0.0f);
                jwVar.setScaleX(z10 ? 1.0f : 0.0f);
                jwVar.setScaleY(z10 ? 1.0f : 0.0f);
                jwVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                jwVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(jwVar, (Property<jw, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(jwVar, (Property<jw, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(jwVar, (Property<jw, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.F.setDuration(200L);
            this.F.setInterpolator(gr.g);
            this.F.addListener(new rw(this, z10, r2));
            this.F.start();
        }
    }

    public final void N(boolean z10) {
        this.H = 0.0f;
        vx vxVar = this.t1;
        if (vxVar != null && vxVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.n;
        if (z10 && frameLayout.getTag() == null) {
            return;
        }
        if (z10 || frameLayout.getTag() == null) {
            frameLayout.setTag(z10 ? null : 1);
            this.E2.a(z10, true);
        }
    }

    public final void O(boolean z10, boolean z11) {
        View view = this.O;
        if (z10 && view.getTag() == null) {
            return;
        }
        if (z10 || view.getTag() == null) {
            AnimatorSet animatorSet = this.W;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W = null;
            }
            view.setTag(z10 ? null : 1);
            if (!z11) {
                view.setAlpha(z10 ? 1.0f : 0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.W = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
            this.W.setDuration(200L);
            this.W.setInterpolator(gr.g);
            this.W.addListener(new w5(this, 24));
            this.W.start();
        }
    }

    public final void P(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            s4.r x10 = x(i10);
            int L0 = x10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    x10.n0(0);
                    G(i10);
                }
            } else if (L0 == 0) {
                x10.h1(0, 0);
            }
        }
    }

    public final void Q(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.c1).L0(Long.valueOf(this.u1));
        if (L0 == null) {
            return;
        }
        ag.j3 j3Var = this.N0;
        if (z10) {
            if (org.telegram.messenger.w3.N(L0) || (tL_chatBannedRights = L0.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = L0.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!org.telegram.messenger.i0.D1(tL_chatBannedRights2)) {
                    if (z11) {
                        j3Var.setText(org.telegram.messenger.cd.a0("AttachPlainRestricted", null, 2131753944, org.telegram.messenger.cd.v(L0.banned_rights.until_date)));
                    }
                    if (z12) {
                        j3Var.setText(org.telegram.messenger.cd.a0("AttachGifRestricted", null, 2131753970, org.telegram.messenger.cd.v(L0.banned_rights.until_date)));
                    } else {
                        j3Var.setText(org.telegram.messenger.cd.a0("AttachStickersRestricted", null, 2131753935, org.telegram.messenger.cd.v(L0.banned_rights.until_date)));
                    }
                } else if (z11) {
                    j3Var.setText(org.telegram.messenger.cd.L0(2131753943, null));
                } else if (z12) {
                    j3Var.setText(org.telegram.messenger.cd.L0(2131753969, null));
                } else {
                    j3Var.setText(org.telegram.messenger.cd.L0(2131753934, null));
                }
            } else {
                org.telegram.ui.ActionBar.k2 k2Var = this.Y1;
                if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).S6()) {
                    return;
                }
                if (z11) {
                    j3Var.setText(org.telegram.messenger.cd.L0(2131749555, null));
                } else if (z12) {
                    j3Var.setText(org.telegram.messenger.cd.L0(2131749554, null));
                } else {
                    j3Var.setText(org.telegram.messenger.cd.L0(2131749548, null));
                }
            }
            j3Var.setVisibility(0);
        }
        AnimatorSet animatorSet = this.P2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(j3Var, (Property<ag.j3, Float>) View.ALPHA, z10 ? j3Var.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(j3Var, (Property<ag.j3, Float>) View.TRANSLATION_Y, z10 ? org.telegram.messenger.i0.L(12.0f) : j3Var.getTranslationY(), z10 ? 0.0f : org.telegram.messenger.i0.L(12.0f)));
        e2.m0 m0Var = this.Q2;
        if (m0Var != null) {
            org.telegram.messenger.i0.r(m0Var);
        }
        if (z10) {
            e2.m0 m0Var2 = new e2.m0(this, z11, z12, 4);
            this.Q2 = m0Var2;
            org.telegram.messenger.i0.h3(m0Var2, 3500L);
        }
        this.P2.setDuration(320L);
        this.P2.setInterpolator(gr.h);
        this.P2.start();
    }

    public final void R(boolean z10, boolean z11) {
        ImageView imageView = this.D;
        if (imageView == null || this.p2) {
            return;
        }
        if (z10 && imageView.getTag() == null) {
            return;
        }
        if (z10 || imageView.getTag() == null) {
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            int i10 = 1;
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
            this.G = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.G.setDuration(200L);
            this.G.setInterpolator(gr.g);
            this.G.addListener(new rw(this, z10, i10));
            this.G.start();
        }
    }

    public final void S() {
        org.telegram.ui.ActionBar.k2 k2Var;
        if (((View) getParent()) != null) {
            float y3 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((org.telegram.messenger.i0.E || ((k2Var = this.Y1) != null && k2Var.isInBubbleMode())) && !this.V0) ? org.telegram.messenger.i0.L(1.0f) : r0.getHeight());
            float f7 = this.r2;
            FrameLayout frameLayout = this.n;
            if (f7 >= 0.0f) {
                y3 += getMeasuredHeight() - this.r2;
            } else if (frameLayout.getTop() - y3 < 0.0f || !this.x2) {
                y3 = 0.0f;
            }
            float W1 = (-y3) + org.telegram.messenger.i0.W1(this.E2.e, org.telegram.messenger.i0.L(50.0f), -this.q2);
            frameLayout.setTranslationY(W1);
            if (this.d0) {
                this.r.setTranslationY(W1);
            }
        }
    }

    public final void T() {
        iy iyVar;
        boolean z10;
        iv ivVar;
        boolean z11 = this.u0;
        View view = this.w;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (org.telegram.messenger.i0.E || this.N1) {
            Drawable background = getBackground();
            int A = A(org.telegram.ui.ActionBar.t6.wf);
            if (background != null && (background != this.G2 || A != this.H2)) {
                this.G2 = background;
                this.H2 = A;
                background.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.t6.wf;
            setBackgroundColor(A(i10));
            if (this.d0) {
                view.setBackgroundColor(A(i10));
            }
        }
        zw zwVar = this.I;
        if (zwVar != null) {
            if (this.u0) {
                zwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.wf));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.zf));
            } else {
                zwVar.setBackground(null);
            }
        }
        ju juVar = this.B1;
        if (juVar != null) {
            juVar.c.a();
        }
        int i11 = 0;
        while (true) {
            iyVar = this.V;
            z10 = this.i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                iyVar = this.G0;
            } else if (i11 != 1) {
                iyVar = this.o0;
            }
            if (iyVar != null) {
                yp ypVar = iyVar.d;
                FrameLayout frameLayout = iyVar.n;
                View view2 = iyVar.f;
                if (this.u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.wf));
                } else {
                    view2.setBackground(null);
                }
                iyVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.zf));
                iyVar.c.a(z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.yf));
                org.telegram.ui.ActionBar.t6.C1(z10 ? w(0.06f) : A(org.telegram.ui.ActionBar.t6.xf), frameLayout.getBackground());
                frameLayout.invalidate();
                ypVar.setHintTextColor(z10 ? w(0.45f) : A(org.telegram.ui.ActionBar.t6.yf));
                ypVar.setTextColor(z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.G6));
            }
            i11++;
        }
        Paint paint = this.s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.t6.Pf));
        }
        hx hxVar = this.P;
        if (hxVar != null) {
            hxVar.setGlowColor(A(org.telegram.ui.ActionBar.t6.wf));
        }
        bw bwVar = this.D0;
        if (bwVar != null) {
            bwVar.setGlowColor(A(org.telegram.ui.ActionBar.t6.wf));
        }
        gw gwVar = this.B0;
        if (gwVar != null) {
            gwVar.setIndicatorColor(A(org.telegram.ui.ActionBar.t6.Ff));
            gwVar.setUnderlineColor(A(org.telegram.ui.ActionBar.t6.zf));
            if (this.u0) {
                gwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.wf));
            } else {
                gwVar.setBackground(null);
            }
        }
        cx cxVar = this.p0;
        if (cxVar != null) {
            cxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.t6.Ff));
            cxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.t6.zf));
            if (this.u0) {
                cxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.wf));
            } else {
                cxVar.setBackground(null);
            }
        }
        int w9 = z10 ? w(0.6f) : A(org.telegram.ui.ActionBar.t6.Gf);
        boolean z12 = w9 != this.I2;
        this.I2 = w9;
        jw jwVar = this.y;
        if (jwVar != null) {
            if (z12) {
                jwVar.setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
            }
            if (iyVar == null) {
                Drawable background2 = jwVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.t6.wf;
                org.telegram.ui.ActionBar.t6.H1(background2, A(i12), false);
                org.telegram.ui.ActionBar.t6.H1(jwVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.D;
        if (imageView != null && z12) {
            imageView.setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null && z12) {
            imageView2.setColorFilter(new PorterDuffColorFilter(w9, PorterDuff.Mode.MULTIPLY));
        }
        ag.j3 j3Var = this.N0;
        if (j3Var != null) {
            if (j3Var.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) j3Var.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.t6.eg));
                j3Var.invalidate();
            }
            j3Var.setTextColor(A(org.telegram.ui.ActionBar.t6.dg));
        }
        zx zxVar = this.j0;
        if (zxVar != null) {
            cy cyVar = zxVar.e;
            int i13 = org.telegram.ui.ActionBar.t6.Af;
            int A2 = A(i13);
            if (A2 != this.J2) {
                this.J2 = A2;
                cyVar.a.setColorFilter(new PorterDuffColorFilter(A2, PorterDuff.Mode.MULTIPLY));
            }
            cyVar.b.setTextColor(A(i13));
            cyVar.c.setProgressColor(A(org.telegram.ui.ActionBar.t6.h6));
        }
        int A3 = A(org.telegram.ui.ActionBar.t6.Ci);
        if (this.e2 == null || A3 != this.K2) {
            this.K2 = A3;
            this.e2 = new PorterDuffColorFilter(A3, PorterDuff.Mode.SRC_IN);
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.t6.E1(drawableArr[i14], z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Cf), false);
            org.telegram.ui.ActionBar.t6.E1(drawableArr[i14], z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df), true);
            i14++;
        }
        if (zwVar != null && (ivVar = zwVar.D) != null) {
            ivVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.t6.E1(drawableArr2[i15], z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), false);
            org.telegram.ui.ActionBar.t6.E1(drawableArr2[i15], z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.t6.E1(drawableArr3[i16], z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), false);
            org.telegram.ui.ActionBar.t6.E1(drawableArr3[i16], z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df), true);
            i16++;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.a2;
        if (e6Var != null) {
            org.telegram.ui.ActionBar.t6.E1(e6Var, z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Cf), false);
            org.telegram.ui.ActionBar.t6.E1(e6Var, z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df), true);
        }
        org.telegram.ui.ActionBar.e6 e6Var2 = this.b2;
        if (e6Var2 != null) {
            org.telegram.ui.ActionBar.t6.E1(e6Var2, z10 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Ff), false);
            org.telegram.ui.ActionBar.t6.E1(e6Var2, z10 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Ff), true);
        }
    }

    public final void U() {
        hx hxVar = this.P;
        if (hxVar == null) {
            return;
        }
        for (int i10 = 0; i10 < hxVar.getChildCount(); i10++) {
            View childAt = hxVar.getChildAt(i10);
            if (childAt instanceof mx) {
                ((mx) childAt).a(true);
            }
        }
    }

    public final void V(int i10) {
        if (this.f0) {
            return;
        }
        int i11 = -1;
        if (i10 != -1) {
            int size = getRecentEmoji().size() + (this.d0 ? 1 : 0);
            ex exVar = this.R;
            int i12 = exVar.c;
            ArrayList arrayList = exVar.y;
            int i13 = 0;
            int i14 = size + (i12 >= 0 ? 3 : 0);
            if (i10 >= i14) {
                int i15 = 0;
                while (true) {
                    String[][] strArr = org.telegram.messenger.l6.f;
                    if (i15 >= 8) {
                        break;
                    }
                    i14 += strArr[i15].length + 1;
                    if (i10 < i14) {
                        i11 = i15 + 1;
                        break;
                    }
                    i15++;
                }
                if (i11 < 0) {
                    ArrayList<ix> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            ix ixVar = (ix) this.q1.get(size2);
                            while (i13 < emojipacks.size()) {
                                long j10 = emojipacks.get(i13).b.id;
                                long j11 = ixVar.b.id;
                                if (j10 == j11 && (!ixVar.g || (!ixVar.f && !this.p1.contains(Long.valueOf(j11))))) {
                                    char[] cArr = org.telegram.messenger.l6.a;
                                    i13 = 9 + i13;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            size2--;
                        }
                    }
                }
                i13 = i11;
            }
            if (i13 >= 0) {
                this.I.j(i13, true);
            }
        }
    }

    public final void W() {
        int i10;
        hy hyVar;
        int i11;
        boolean z10;
        cx cxVar = this.p0;
        int currentPosition = cxVar.getCurrentPosition();
        int i12 = this.r0;
        boolean z11 = currentPosition == i12;
        boolean z12 = i12 >= 0;
        boolean isEmpty = this.i1.isEmpty();
        cxVar.d(false);
        this.r0 = -2;
        this.s0 = -2;
        this.t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (isEmpty) {
            i10 = 0;
        } else {
            this.r0 = 0;
            cxVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.cd.L0(2131746379, null));
            i10 = 1;
        }
        this.s0 = i10;
        cxVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.cd.L0(2131750835, null));
        this.t0 = i10 + 1;
        org.telegram.messenger.i0.L(13.0f);
        org.telegram.messenger.i0.L(11.0f);
        int i13 = this.c1;
        ArrayList arrayList = org.telegram.messenger.vp.r1(i13).d4;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = (String) arrayList.get(i14);
            org.telegram.messenger.g6 g10 = org.telegram.messenger.k6.g(str);
            if (g10 != null) {
                TLRPC.Document T = org.telegram.messenger.ui.b0(i13).T(str);
                String i15 = i0.a.i(i14 + 3, "tab");
                int i16 = cxVar.y;
                cxVar.y = i16 + 1;
                jw0 jw0Var = (jw0) cxVar.n.get(i15);
                if (jw0Var != null) {
                    cxVar.g(i15, jw0Var, i16);
                    i11 = currentPosition;
                    z10 = z12;
                } else {
                    i11 = currentPosition;
                    z10 = z12;
                    jw0Var = new jw0(cxVar.getContext(), 2);
                    jw0Var.setFocusable(true);
                    jw0Var.setOnClickListener(new ol0(cxVar, 2));
                    jw0Var.setExpanded(cxVar.f0);
                    jw0Var.a(cxVar.i0);
                    cxVar.e.addView(jw0Var, i16);
                }
                jw0Var.d = false;
                jw0Var.setTag(R.id.index_tag, Integer.valueOf(i16));
                jw0Var.setTag(R.id.parent_tag, g10);
                jw0Var.setTag(R.id.object_tag, T);
                jw0Var.setSelected(i16 == cxVar.D);
                cxVar.h.put(i15, jw0Var);
                jw0Var.setContentDescription(str);
            } else {
                i11 = currentPosition;
                z10 = z12;
            }
            i14++;
            currentPosition = i11;
            z12 = z10;
        }
        int i17 = currentPosition;
        boolean z13 = z12;
        cxVar.h();
        cxVar.q();
        if (z11 && isEmpty) {
            cxVar.m(this.s0);
            yv yvVar = this.o0;
            if (yvVar == null || (hyVar = yvVar.r) == null) {
                return;
            }
            hyVar.I1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.h0.a;
        if (cxVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                cxVar.k(i17 + 1, 0);
            } else if (isEmpty && z13) {
                cxVar.k(i17 - 1, 0);
            }
        }
    }

    public final void X() {
        zx zxVar;
        int size = this.i1.size();
        long n10 = org.telegram.messenger.ui.n(ConnectionsManager.DEFAULT_DATACENTER_ID, this.i1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(this.c1).i0);
        this.i1 = arrayList;
        long n11 = org.telegram.messenger.ui.n(ConnectionsManager.DEFAULT_DATACENTER_ID, arrayList);
        if ((this.p0 != null && size == 0 && !this.i1.isEmpty()) || (size != 0 && this.i1.isEmpty())) {
            W();
        }
        if ((size == this.i1.size() && n10 == n11) || (zxVar = this.n0) == null) {
            return;
        }
        zxVar.f();
    }

    public final void Y(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        gw gwVar = this.B0;
        if (gwVar != null) {
            org.telegram.ui.u71 u71Var = gwVar.e;
            if (gwVar.s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            int i11 = 0;
            this.e0 = false;
            this.E1 = 0;
            int currentPosition = gwVar.getCurrentPosition();
            gwVar.d((getParent() == null || getVisibility() != 0 || (this.y1.size() == 0 && this.z1.size() == 0)) ? false : true);
            int i12 = this.c1;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i12);
            SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i12).g7;
            ArrayList arrayList3 = this.m1;
            arrayList3.clear();
            ArrayList arrayList4 = b02.s0[0];
            int size = arrayList4.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i13);
                if (!b02.B0(stickerSetCovered.set.id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            ty tyVar = this.F0;
            if (tyVar != null) {
                tyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Y0;
            org.telegram.ui.ActionBar.p6 p6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id)) {
                int i14 = b02.u0[0].isEmpty() ? 2 : 3;
                jw0 c10 = gwVar.c(i14, drawableArr[i14]);
                c10.h.setText(org.telegram.messenger.cd.L0(2131750832, null));
                c10.setContentDescription(org.telegram.messenger.cd.L0(2131750834, null));
                int i15 = this.E1;
                this.H1 = i15;
                this.E1 = i15 + 1;
            }
            if (!this.k1.isEmpty()) {
                int i16 = this.E1;
                this.G1 = i16;
                this.E1 = i16 + 1;
                jw0 c11 = gwVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.cd.L0(2131750839, null));
                c11.setContentDescription(org.telegram.messenger.cd.L0(2131750842, null));
            }
            if (!this.j1.isEmpty()) {
                int i17 = this.E1;
                this.F1 = i17;
                this.E1 = i17 + 1;
                jw0 c12 = gwVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.cd.L0(2131746378, null));
                c12.setContentDescription(org.telegram.messenger.cd.L0(2131746379, null));
            }
            ArrayList arrayList5 = this.d1;
            arrayList5.clear();
            this.h1 = null;
            this.f1 = -1;
            this.e1 = -10;
            if (this.F2 == null || z10) {
                this.F2 = new ArrayList(b02.s0(0));
            }
            ArrayList arrayList6 = this.F2;
            int i18 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.x1;
                if (i18 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i18];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet o02 = b02.o0(stickerSetCovered2.set.id);
                    if (o02 == null || (stickerSet = o02.set) == null || stickerSet.archived) {
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
                        stickerSetCoveredArr[i18] = null;
                    }
                }
                i18++;
                j10 = j11;
            }
            long j12 = j10;
            ArrayList w02 = org.telegram.messenger.vp.r1(i12).w0(arrayList6);
            for (int i19 = 0; i19 < w02.size(); i19++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) w02.get(i19);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.J1 != null) {
                long j13 = org.telegram.messenger.vp.r1(i12).g7.getLong("group_hide_stickers_" + this.J1.id, -1L);
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(this.J1.id));
                if (L0 == null || this.J1.stickerset == null || !org.telegram.messenger.w3.N(L0)) {
                    this.g1 = j13 != -1;
                } else {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        this.g1 = j13 == stickerSet3.id;
                    }
                }
                TLRPC.ChatFull chatFull = this.J1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet Y = b02.Y(stickerSet4);
                    if (Y != null && (arrayList = Y.documents) != null && !arrayList.isEmpty() && Y.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = Y.documents;
                        tL_messages_stickerSet3.packs = Y.packs;
                        tL_messages_stickerSet3.set = Y.set;
                        if (this.g1) {
                            this.e1 = arrayList5.size();
                            arrayList5.add(tL_messages_stickerSet3);
                        } else {
                            this.e1 = 0;
                            arrayList5.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.g1) {
                        this.e1 = arrayList5.size();
                        arrayList5.add(tL_messages_stickerSet4);
                    } else {
                        this.e1 = 0;
                        arrayList5.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i20 = 0;
            while (i20 < arrayList5.size()) {
                if (i20 == this.e1) {
                    TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(this.J1.id));
                    if (L02 == null) {
                        arrayList5.remove(i11);
                        i20--;
                    } else {
                        this.e0 = true;
                        String str = "chat" + L02.id;
                        int i21 = gwVar.y;
                        gwVar.y = i21 + 1;
                        jw0 jw0Var = (jw0) gwVar.n.get(str);
                        if (jw0Var != null) {
                            gwVar.g(str, jw0Var, i21);
                        } else {
                            jw0Var = new jw0(gwVar.getContext(), i11);
                            jw0Var.setFocusable(true);
                            jw0Var.setOnClickListener(new ol0(gwVar, i11));
                            u71Var.addView(jw0Var, i21);
                            jw0Var.x = true;
                            r8 r8Var = new r8(p6Var2);
                            r8Var.u(org.telegram.messenger.i0.L(14.0f));
                            r8Var.q(L02);
                            int i22 = gwVar.a;
                            g9 g9Var = jw0Var.e;
                            g9Var.setLayerNum(i22);
                            g9Var.e(L02, r8Var);
                            g9Var.setAspectFit(true);
                            jw0Var.setExpanded(gwVar.f0);
                            jw0Var.a(gwVar.i0);
                            jw0Var.h.setText(L02.title);
                        }
                        jw0Var.d = true;
                        jw0Var.setTag(R.id.index_tag, Integer.valueOf(i21));
                        jw0Var.setSelected(i21 == gwVar.D);
                        gwVar.h.put(str, jw0Var);
                    }
                    i10 = 0;
                    p6Var = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i20);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i23 = 0; i23 < tL_messages_stickerSet5.documents.size(); i23++) {
                            document = tL_messages_stickerSet5.documents.get(i23);
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
                    Object w9 = org.telegram.messenger.b8.w(tL_messages_stickerSet5.set.thumbs, 90, z11, null, z11);
                    if (w9 == null || tL_messages_stickerSet5.set.gifs) {
                        w9 = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.id;
                    int i24 = gwVar.y;
                    gwVar.y = i24 + 1;
                    jw0 jw0Var2 = (jw0) gwVar.n.get(str2);
                    if (jw0Var2 != null) {
                        gwVar.g(str2, jw0Var2, i24);
                    } else {
                        jw0Var2 = new jw0(gwVar.getContext(), 0);
                        jw0Var2.setFocusable(true);
                        jw0Var2.setOnClickListener(new ol0(gwVar, 1));
                        jw0Var2.setExpanded(gwVar.f0);
                        jw0Var2.a(gwVar.i0);
                        u71Var.addView(jw0Var2, i24);
                    }
                    jw0Var2.e.setLayerNum(gwVar.a);
                    i10 = 0;
                    jw0Var2.d = false;
                    jw0Var2.setTag(w9);
                    jw0Var2.setTag(R.id.index_tag, Integer.valueOf(i24));
                    jw0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    jw0Var2.setTag(R.id.object_tag, document);
                    jw0Var2.setSelected(i24 == gwVar.D);
                    gwVar.h.put(str2, jw0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    p6Var = null;
                    sb2.append(org.telegram.messenger.cd.L0(2131754757, null));
                    jw0Var2.setContentDescription(sb2.toString());
                }
                i20++;
                i11 = i10;
                p6Var2 = p6Var;
            }
            gwVar.h();
            gwVar.q();
            if (currentPosition != 0) {
                gwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        hw hwVar = this.C0;
        gw gwVar = this.B0;
        if (gwVar != null && hwVar == null && this.t1 != null) {
            gwVar.setTranslationY(this.t1.p() * (-org.telegram.messenger.i0.L(50.0f)));
        }
        if (hwVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.K0 && this.t1.p() != 1.0f;
        hwVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.x0, rect, null);
            float p5 = this.t1.p() * org.telegram.messenger.i0.L(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            hwVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - hwVar.getTop()) - gwVar.getExpandedOffset()) - p5;
            if (hwVar.getTranslationY() != translationY) {
                hwVar.setTranslationY(translationY);
                hwVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            gwVar.i(true, this.W1);
        } else {
            this.X1 = false;
            gwVar.i(false, this.W1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    public final void a0() {
        int i10;
        boolean z10;
        LongSparseArray longSparseArray = this.z1;
        LongSparseArray longSparseArray2 = this.y1;
        int i11 = this.c1;
        bw bwVar = this.D0;
        if (bwVar == null) {
            return;
        }
        try {
            int childCount = bwVar.getChildCount();
            ?? r72 = 0;
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = bwVar.getChildAt(i12);
                if (!(childAt instanceof org.telegram.ui.Cells.w3) || ((ck0) bwVar.T(childAt)) == null) {
                    i10 = i12;
                } else {
                    org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                    ArrayList arrayList = org.telegram.messenger.ui.b0(i11).u0[r72];
                    TLRPC.StickerSetCovered stickerSet = w3Var.getStickerSet();
                    boolean z11 = (arrayList == null || !arrayList.contains(Long.valueOf(stickerSet.set.id))) ? r72 : true;
                    int i13 = r72;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.x1;
                        if (i13 >= stickerSetCoveredArr.length) {
                            i10 = i12;
                            z10 = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i13];
                        if (stickerSetCovered != null) {
                            i10 = i12;
                            if (stickerSetCovered.set.id == stickerSet.set.id) {
                                z10 = true;
                                break;
                            }
                        } else {
                            i10 = i12;
                        }
                        i13++;
                        i12 = i10;
                    }
                    w3Var.c(stickerSet, z11, true, 0, 0, z10);
                    if (z11) {
                        org.telegram.messenger.ui.b0(i11).e1(stickerSet.set.id);
                    }
                    boolean z12 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z13 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    if (z12 || z13) {
                        if (z12 && w3Var.r) {
                            longSparseArray2.remove(stickerSet.set.id);
                            z12 = false;
                        } else if (z13 && !w3Var.r) {
                            longSparseArray.remove(stickerSet.set.id);
                        }
                    }
                    w3Var.b(!z10 && z12, true);
                }
                i12 = i10 + 1;
                r72 = 0;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // hh.a
    public final void c(int i10) {
        setBottomInset(i10);
    }

    @Override // hh.a
    public final void d(float f7) {
        this.r2 = f7;
        S();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.messenger.q20 q20Var;
        TLRPC.StickerSet stickerSet;
        int i12 = org.telegram.messenger.zs.x0;
        ex exVar = this.R;
        nv nvVar = this.R2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.y0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    F();
                    o();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    exVar.F(false);
                    return;
                } else {
                    org.telegram.messenger.i0.r(nvVar);
                    org.telegram.messenger.i0.h3(nvVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.q3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                exVar.F(true);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.z0) {
            a0();
            jc0 jc0Var = this.x;
            if (jc0Var != null) {
                int childCount = jc0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    jc0Var.getChildAt(i13).invalidate();
                }
            }
            Y(false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.A0) {
            if (exVar != null) {
                exVar.F(false);
                return;
            }
            return;
        }
        int i14 = org.telegram.messenger.zs.B0;
        ux uxVar = this.S;
        if (i10 == i14) {
            Long l4 = (Long) objArr[0];
            long longValue2 = l4.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                qy qyVar = this.z0;
                if (qyVar != null && qyVar.d == longValue2 && qyVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    qyVar.f = tL_messages_stickerSet.documents;
                    qyVar.f();
                }
                if (uxVar != null && uxVar.d == longValue2 && uxVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    uxVar.f = tL_messages_stickerSet.documents;
                    uxVar.f();
                }
            }
            TLRPC.ChatFull chatFull2 = this.J1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                Y(false);
            }
            HashMap hashMap = this.r1;
            if (hashMap.containsKey(l4) && objArr.length >= 2 && ((org.telegram.messenger.q20) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (q20Var = (org.telegram.messenger.q20) hashMap.remove(l4)) != null) {
                q20Var.a(tL_messages_stickerSet);
            }
            org.telegram.messenger.i0.r(nvVar);
            org.telegram.messenger.i0.h3(nvVar, 100L);
            return;
        }
        int i15 = org.telegram.messenger.zs.i4;
        hx hxVar = this.P;
        if (i10 != i15) {
            if (i10 != org.telegram.messenger.zs.L2) {
                if (i10 == org.telegram.messenger.zs.f5) {
                    if (exVar != null) {
                        exVar.F(false);
                    }
                    U();
                    Y(false);
                    return;
                }
                return;
            }
            if (hxVar == null || !this.d0) {
                return;
            }
            if ((this.V.c.k == 2 || hxVar.getAdapter() == uxVar) && !TextUtils.isEmpty(uxVar.w)) {
                uxVar.F(uxVar.w, true);
                return;
            }
            return;
        }
        bw bwVar = this.D0;
        if (bwVar != null) {
            int childCount2 = bwVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = bwVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.n8) || (childAt instanceof org.telegram.ui.Cells.d8)) {
                    childAt.invalidate();
                }
            }
        }
        if (hxVar != null) {
            hxVar.invalidate();
            int childCount3 = hxVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = hxVar.getChildAt(i17);
                if (childAt2 instanceof ey) {
                    childAt2.invalidate();
                }
            }
        }
        ju juVar = this.B1;
        if (juVar != null) {
            juVar.c.invalidate();
        }
        cx cxVar = this.p0;
        if (cxVar != null) {
            org.telegram.ui.u71 u71Var = cxVar.e;
            int childCount4 = u71Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                u71Var.getChildAt(i18).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        S();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.h) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (this.n.getVisibility() != 8 && !this.u0 && this.w0) {
            canvas.drawColor(i0.b.o(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        float R0 = org.telegram.messenger.i0.R0(this.q2);
        if (R0 > 0.0f) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(R0, A(org.telegram.ui.ActionBar.t6.wf));
            int i10 = this.A2;
            GradientDrawable gradientDrawable = this.z2;
            if (i10 != r12) {
                gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.t6.r1(0.66f, r12), i0.b.o(r12, 0)});
                this.A2 = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.q2, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
        return drawChild;
    }

    public int getCurrentPage() {
        return this.A1;
    }

    public ArrayList<ix> getEmojipacks() {
        ArrayList<ix> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.q1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            ix ixVar = (ix) arrayList2.get(i10);
            boolean z10 = ixVar.g;
            ArrayList arrayList3 = this.p1;
            if ((!z10 && (ixVar.f || arrayList3.contains(Long.valueOf(ixVar.b.id)))) || (ixVar.g && !ixVar.f && !arrayList3.contains(Long.valueOf(ixVar.b.id)))) {
                arrayList.add(ixVar);
            }
            i10++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.c2) {
            return org.telegram.messenger.k6.i;
        }
        if (this.B2 == null) {
            this.B2 = new ArrayList();
        }
        if (org.telegram.messenger.k6.i.size() != this.C2) {
            this.B2.clear();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.k6.i;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!((String) arrayList.get(i10)).startsWith("animated_")) {
                    this.B2.add((String) arrayList.get(i10));
                }
                i10++;
            }
            this.C2 = this.B2.size();
        }
        return this.B2;
    }

    public float getStickersExpandOffset() {
        gw gwVar = this.B0;
        if (gwVar == null) {
            return 0.0f;
        }
        return gwVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str == null) {
            return;
        }
        if (!str.startsWith("animated_") && !org.telegram.messenger.k6.h(str)) {
            return;
        }
        org.telegram.messenger.k6.a(str);
        int i10 = 0;
        if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
            org.telegram.messenger.k6.s();
            this.R.F(false);
        }
        org.telegram.messenger.k6.r();
        if (this.c2) {
            return;
        }
        ArrayList arrayList = this.B2;
        if (arrayList == null) {
            this.B2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        while (true) {
            ArrayList arrayList2 = org.telegram.messenger.k6.i;
            if (i10 >= arrayList2.size()) {
                this.C2 = this.B2.size();
                return;
            } else {
                if (!((String) arrayList2.get(i10)).startsWith("animated_")) {
                    this.B2.add((String) arrayList2.get(i10));
                }
                i10++;
            }
        }
    }

    public final void i(int i10, int i11, boolean z10) {
        if (i10 == 2 || y(i10).K(0) == null) {
            return;
        }
        sw swVar = new sw(getContext(), i11);
        swVar.a = !z10 ? 1 : 0;
        x(i10).w0(swVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            X();
            return;
        }
        int size = this.j1.size();
        int size2 = this.k1.size();
        int i10 = this.c1;
        this.j1 = org.telegram.messenger.ui.b0(i10).i0(0, true);
        this.k1 = org.telegram.messenger.ui.b0(i10).i0(2, false);
        if (org.telegram.messenger.d20.i(i10).q()) {
            this.l1 = org.telegram.messenger.ui.b0(i10).i0(7, false);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.id == document.id) {
                        this.j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (org.telegram.messenger.vp.r1(i10).A3()) {
            int i13 = 0;
            while (i13 < this.k1.size()) {
                if (org.telegram.messenger.jj.X3((TLRPC.Document) this.k1.get(i13))) {
                    this.k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.j1.size()) {
                if (org.telegram.messenger.jj.X3((TLRPC.Document) this.j1.get(i14))) {
                    this.j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.j1.size() || size2 != this.k1.size()) {
            Y(false);
        }
        ny nyVar = this.y0;
        if (nyVar != null) {
            nyVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        vx vxVar = this.t1;
        fe.b bVar = this.b;
        hx hxVar = this.P;
        tv tvVar = this.V;
        if (vxVar != null && vxVar.z()) {
            s4.c1 K = hxVar.K(0);
            if (K == null) {
                iy.a(tvVar, true, !z10);
            } else {
                iy.a(tvVar, K.a.getTop() < hxVar.getPaddingTop(), !z10);
            }
            O(false, !z10);
            tvVar.setTranslationY(bVar.e * org.telegram.messenger.i0.L(15.0f));
            return;
        }
        if (tvVar == null || hxVar == null) {
            return;
        }
        tvVar.setTranslationY((bVar.e * org.telegram.messenger.i0.L(15.0f)) + (hxVar.K(0) != null ? r0.a.getTop() : -this.b1));
        tvVar.a.a(false, !z10);
        m(Math.round(this.I.getTranslationY()));
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            s4.c1 K = this.P.K(0);
            int L = org.telegram.messenger.i0.L(38.0f) + i10;
            if (L > 0 && (K == null || K.a.getBottom() < L)) {
                z10 = true;
            }
            O(z10, !this.K1);
        }
    }

    public final void n(int i10, View view) {
        hx hxVar;
        s4.c1 K;
        zw zwVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            zwVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.f0) {
            return;
        }
        vx vxVar = this.t1;
        if (vxVar == null || !vxVar.z()) {
            if (i10 > 0 && (hxVar = this.P) != null && hxVar.getVisibility() == 0 && (K = hxVar.K(0)) != null) {
                if (K.a.getTop() + (this.d0 ? this.b1 : 0) >= hxVar.getPaddingTop()) {
                    return;
                }
            }
            int i11 = iArr[1] - i10;
            iArr[1] = i11;
            if (i11 > 0) {
                iArr[1] = 0;
            } else if (i11 < (-org.telegram.messenger.i0.L(108.0f))) {
                iArr[1] = -org.telegram.messenger.i0.L(108.0f);
            }
            zwVar.setTranslationY(Math.max(-org.telegram.messenger.i0.L(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        gw gwVar = this.B0;
        if (gwVar == null || (L0 = this.E0.L0()) == -1) {
            return;
        }
        int i10 = this.G1;
        if (i10 <= 0 && (i10 = this.F1) <= 0) {
            i10 = this.E1;
        }
        gwVar.k(this.y0.F(L0), i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xa.n nVar = this.M2;
        if (nVar != null) {
            nVar.a();
            this.M2 = null;
        }
        xa.n nVar2 = (xa.n) new org.telegram.messenger.ys(org.telegram.messenger.zs.f(this.c1), this).b;
        nVar2.h(org.telegram.messenger.zs.i4);
        nVar2.e(org.telegram.messenger.zs.L2);
        nVar2.e(org.telegram.messenger.zs.q3);
        this.M2 = nVar2;
        if (this.y0 != null) {
            nVar2.e(org.telegram.messenger.zs.x0);
            nVar2.e(org.telegram.messenger.zs.X0);
            nVar2.e(org.telegram.messenger.zs.z0);
            nVar2.e(org.telegram.messenger.zs.B0);
            nVar2.e(org.telegram.messenger.zs.f5);
            org.telegram.messenger.i0.g3(new nv(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ju juVar = this.B1;
        if (juVar != null && juVar.isShowing()) {
            juVar.dismiss();
        }
        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
        if (p5.l == this.g2) {
            p5.W = null;
            p5.a0 = null;
            p5.Y = null;
            p5.l = null;
            p5.c0 = null;
            p5.t();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.O1 != i14) {
            this.O1 = i14;
            F();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        S();
        Z();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.K1 = true;
        boolean z10 = org.telegram.messenger.i0.E;
        View view = this.w;
        boolean z11 = this.d0;
        if (z10 || this.N1) {
            if (this.L1 != 1) {
                if (!this.L2) {
                    setOutlineProvider(this.M1);
                    setClipToOutline(true);
                    setElevation(org.telegram.messenger.i0.L(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i12 = org.telegram.ui.ActionBar.t6.wf;
                background.setColorFilter(new PorterDuffColorFilter(A(i12), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.u0) {
                    view.setBackgroundColor(A(i12));
                }
                this.L1 = 1;
            }
        } else if (this.L1 != 0) {
            if (!this.L2) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.u0) {
                int i13 = org.telegram.ui.ActionBar.t6.wf;
                setBackgroundColor(A(i13));
                if (z11) {
                    view.setBackgroundColor(A(i13));
                }
            }
            this.L1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
        this.K1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i10) {
        int L0;
        int L02;
        if (i10 == 0) {
            if (this.J0 || (L02 = this.E0.L0()) == -1 || this.D0 == null) {
                return;
            }
            int i11 = this.G1;
            if (i11 <= 0 && (i11 = this.F1) <= 0) {
                i11 = this.E1;
            }
            this.B0.k(this.y0.F(L02), i11);
            return;
        }
        if (i10 == 2) {
            s4.g0 adapter = this.h0.getAdapter();
            zx zxVar = this.n0;
            if (adapter != zxVar || zxVar.I < 0 || this.s0 < 0 || this.r0 < 0 || (L0 = this.i0.L0()) == -1) {
                return;
            }
            this.p0.k(L0 >= zxVar.I ? this.s0 : this.r0, 0);
        }
    }

    public final void q(boolean z10) {
        vx vxVar = this.t1;
        fe.b bVar = this.a;
        bw bwVar = this.D0;
        fw fwVar = this.G0;
        if (vxVar != null && vxVar.z()) {
            s4.c1 K = bwVar.K(0);
            if (K == null) {
                iy.a(fwVar, true, !z10);
            } else {
                iy.a(fwVar, K.a.getTop() < bwVar.getPaddingTop(), !z10);
            }
            fwVar.setTranslationY(bVar.e * org.telegram.messenger.i0.L(15.0f));
            return;
        }
        if (fwVar == null || bwVar == null) {
            return;
        }
        fwVar.setTranslationY((bVar.e * org.telegram.messenger.i0.L(15.0f)) + (bwVar.K(0) != null ? r0.a.getTop() : -this.b1));
        fwVar.a.a(false, !z10);
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.k6.a;
        org.telegram.messenger.vp.c1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.k6.h.clear();
        org.telegram.messenger.k6.i.clear();
        org.telegram.messenger.k6.r();
        this.R.F(false);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.K1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j10, boolean z10) {
        iy iyVar;
        s4.a0 a0Var;
        View view;
        tk0 tk0Var;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet o02;
        ny nyVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j10 != -1 && (o02 = org.telegram.messenger.ui.b0(this.c1).o0(j10)) != null && (E = (nyVar = this.y0).E(o02)) >= 0 && E < nyVar.b()) {
            I(E, org.telegram.messenger.i0.L(48.0f));
        }
        int i13 = 0;
        zx zxVar = this.j0;
        if (zxVar != null) {
            zxVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            tk0 tk0Var2 = this.D0;
            tk0 tk0Var3 = this.h0;
            yv yvVar = this.o0;
            tk0 tk0Var4 = this.P;
            if (i14 == 0) {
                iyVar = this.V;
                a0Var = this.Q;
                view = this.I;
                tk0Var = tk0Var4;
            } else if (i14 == 1) {
                a0Var = this.i0;
                view = this.p0;
                tk0Var = tk0Var3;
                iyVar = yvVar;
            } else {
                iyVar = this.G0;
                a0Var = this.E0;
                view = this.B0;
                tk0Var = tk0Var2;
            }
            if (iyVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                hy hyVar = iyVar.r;
                int i16 = i12;
                iyVar.d.setText("");
                if (hyVar != null) {
                    hyVar.I1(null);
                    hyVar.G1();
                }
                int i17 = this.b1;
                if (i14 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i14 == 1) {
                        float[] fArr = new float[1];
                        fArr[i15] = org.telegram.messenger.i0.L(36.0f) - i17;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tk0Var, (Property<tk0, Float>) property, fArr);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[i15] = ofFloat;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr2 = new float[1];
                        fArr2[i15] = 0.0f;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i15] = org.telegram.messenger.i0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tk0Var, (Property<tk0, Float>) property, fArr3);
                        float[] fArr4 = new float[1];
                        fArr4[i15] = org.telegram.messenger.i0.L(36.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(iyVar, (Property<iy, Float>) property, fArr4);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[i15] = ofFloat2;
                        animatorArr2[1] = ofFloat3;
                        animatorArr2[i16] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(gr.h);
                    this.M0.addListener(new org.telegram.ui.ActionBar.g1(this, a0Var, tk0Var, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (iyVar != yvVar) {
                        iyVar.setTranslationY(org.telegram.messenger.i0.L(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (tk0Var == tk0Var2) {
                        i11 = i15;
                        tk0Var.setPadding(i11, org.telegram.messenger.i0.L(36.0f), i11, org.telegram.messenger.i0.L(44.0f) + this.q2);
                    } else {
                        i11 = i15;
                        if (tk0Var == tk0Var3) {
                            tk0Var.setPadding(i11, org.telegram.messenger.i0.L(40.0f), i11, org.telegram.messenger.i0.L(44.0f) + this.q2);
                        } else {
                            if (tk0Var == tk0Var4) {
                                tk0Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(44.0f) + this.q2);
                            }
                            i11 = 0;
                        }
                    }
                    a0Var.h1(i11, i11);
                }
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        int i18 = i13;
        if (z10) {
            return;
        }
        this.t1.i(i18);
    }

    public void setBlurredBackgroundDrawableFactory(tg.b bVar) {
        org.telegram.ui.ActionBar.p6 p6Var = this.Z1;
        jw jwVar = this.y;
        if (jwVar != null) {
            vg.f c10 = bVar.c(jwVar, null, false);
            c10.o(w7.b9.d(p6Var));
            c10.q(org.telegram.messenger.i0.L(18.0f));
            c10.p(org.telegram.messenger.i0.L(6.0f));
            jwVar.setBackground(c10);
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            vg.f c11 = bVar.c(imageView, null, false);
            c11.o(w7.b9.d(p6Var));
            c11.q(org.telegram.messenger.i0.L(18.0f));
            c11.p(org.telegram.messenger.i0.L(6.0f));
            imageView.setBackground(c11);
        }
        jc0 jc0Var = this.x;
        if (jc0Var != null) {
            vg.f c12 = bVar.c(jc0Var, null, false);
            c12.o(w7.b9.d(p6Var));
            c12.q(org.telegram.messenger.i0.L(18.0f));
            c12.p(org.telegram.messenger.i0.L(6.0f));
            jc0Var.setBackground(c12);
        }
        ImageView imageView2 = this.D;
        if (imageView2 != null) {
            vg.f c13 = bVar.c(imageView2, null, false);
            c13.o(w7.b9.d(p6Var));
            c13.q(org.telegram.messenger.i0.L(18.0f));
            c13.p(org.telegram.messenger.i0.L(6.0f));
            imageView2.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.q2 != i10) {
            this.q2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(org.telegram.messenger.i0.L(44.0f) + i10, this.P);
            j(org.telegram.messenger.i0.L(44.0f) + i10, this.D0);
            j(org.telegram.messenger.i0.L(44.0f) + i10, this.h0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            S();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.J1 = chatFull;
        Y(false);
    }

    public void setDelegate(vx vxVar) {
        this.t1 = vxVar;
    }

    public void setDragListener(bx bxVar) {
        this.O0 = bxVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        fw fwVar = this.G0;
        if (fwVar != null) {
            fwVar.d.setEnabled(z10);
        }
        yv yvVar = this.o0;
        if (yvVar != null) {
            yvVar.d.setEnabled(z10);
        }
        tv tvVar = this.V;
        if (tvVar != null) {
            tvVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.u0 != z10) {
            this.u0 = z10;
            updateColors();
        }
    }

    public void setShowing(boolean z10) {
        this.P0 = z10;
        Z();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        Z();
        S();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10 = getVisibility() != i10;
        super.setVisibility(i10);
        if (z10) {
            if (i10 != 8) {
                org.telegram.messenger.k6.s();
                this.R.F(false);
                xa.n nVar = this.N2;
                int i11 = this.c1;
                if (nVar == null) {
                    xa.n nVar2 = (xa.n) new org.telegram.messenger.ys(org.telegram.messenger.zs.f(i11), this).b;
                    nVar2.e(org.telegram.messenger.zs.x0);
                    this.N2 = nVar2;
                }
                if (this.y0 != null) {
                    if (!this.O2) {
                        this.O2 = true;
                        this.N2.e(org.telegram.messenger.zs.X0);
                    }
                    Y(false);
                    F();
                }
                k(true);
                k(false);
                org.telegram.messenger.ui.b0(i11).V0(0, true, true, false);
                org.telegram.messenger.ui.b0(i11).V0(0, false, true, false);
                org.telegram.messenger.ui.b0(i11).V0(2, false, true, false);
            }
            mw mwVar = this.T0;
            if (mwVar != null) {
                mwVar.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        ny nyVar;
        boolean z11 = this.T2;
        this.T2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.A1;
        if (i10 == 0) {
            ex exVar = this.R;
            if (exVar != null) {
                exVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            zx zxVar = this.n0;
            if (zxVar != null) {
                zxVar.f();
                return;
            }
            return;
        }
        if (i10 != 2 || (nyVar = this.y0) == null) {
            return;
        }
        nyVar.f();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            T();
            hi.c cVar = this.l2;
            if (cVar != null) {
                cVar.a(A(org.telegram.ui.ActionBar.t6.d6));
            }
            jc0 jc0Var = this.x;
            if (jc0Var != null) {
                jc0Var.setIndicatorColor(i0.b.o(A(org.telegram.ui.ActionBar.t6.Df), 20));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.a.e;
            fw fwVar = this.G0;
            fwVar.setAlpha(f11);
            fwVar.setVisibility(f11 > 0.0f ? 0 : 4);
            float f12 = 1.0f - f11;
            fh.c cVar = this.H0;
            cVar.setAlpha(f12);
            cVar.setTranslationY((-org.telegram.messenger.i0.L(15.0f)) * f11);
            cVar.setVisibility(f12 > 0.0f ? 0 : 4);
            fg.i iVar = this.M;
            iVar.setAlpha(f12);
            iVar.setTranslationY(org.telegram.messenger.i0.L(30.0f) * f11);
            iVar.setVisibility(f12 > 0.0f ? 0 : 4);
            S();
            this.x0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.b.e;
            tv tvVar = this.V;
            tvVar.setAlpha(f13);
            tvVar.setVisibility(f13 > 0.0f ? 0 : 4);
            float f14 = 1.0f - f13;
            fh.c cVar2 = this.U;
            cVar2.setAlpha(f14);
            cVar2.setTranslationY((-org.telegram.messenger.i0.L(15.0f)) * f13);
            cVar2.setVisibility(f14 > 0.0f ? 0 : 4);
            fg.i iVar2 = this.K;
            iVar2.setAlpha(f14);
            iVar2.setTranslationY(org.telegram.messenger.i0.L(30.0f) * f13);
            iVar2.setVisibility(f14 > 0.0f ? 0 : 4);
            S();
            this.J.invalidate();
        }
    }

    public final int w(float f7) {
        return i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.r x(int i10) {
        if (i10 == 0) {
            return this.E0;
        }
        if (i10 == 1) {
            return this.Q;
        }
        if (i10 == 2) {
            return this.i0;
        }
        throw new IllegalArgumentException(i0.a.i(i10, "Unexpected argument: "));
    }

    public final tk0 y(int i10) {
        if (i10 == 0) {
            return this.D0;
        }
        if (i10 == 1) {
            return this.P;
        }
        if (i10 == 2) {
            return this.h0;
        }
        throw new IllegalArgumentException(i0.a.i(i10, "Unexpected argument: "));
    }

    public final HorizontalScrollView z(int i10) {
        if (i10 == 0) {
            return this.B0;
        }
        if (i10 == 1) {
            return this.I;
        }
        if (i10 == 2) {
            return this.p0;
        }
        throw new IllegalArgumentException(i0.a.i(i10, "Unexpected argument: "));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // fe.e
    public final void E(float f7, int i10) {
    }
}
