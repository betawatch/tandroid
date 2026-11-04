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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ey extends FrameLayout implements org.telegram.ui.ActionBar.z5, qe.b, org.telegram.messenger.cs, sh.a {
    public static final /* synthetic */ int V2 = 0;
    public final yx A0;
    public final LongSparseArray A1;
    public final GradientDrawable A2;
    public final ev B0;
    public int B1;
    public int B2;
    public final sv C0;
    public final wt C1;
    public ArrayList C2;
    public final tv D0;
    public final int D1;
    public int D2;
    public final ImageView E;
    public final ov E0;
    public final int[] E1;
    public long E2;
    public final ImageView F;
    public final pv F0;
    public int F1;
    public final qe.a F2;
    public AnimatorSet G;
    public cy G0;
    public int G1;
    public ArrayList G2;
    public AnimatorSet H;
    public final rv H0;
    public int H1;
    public Drawable H2;
    public float I;
    public final qh.c I0;
    public int I1;
    public int I2;
    public final jw J;
    public boolean J0;
    public int J1;
    public int J2;
    public final ew K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final org.telegram.ui.n61 L;
    public boolean L0;
    public boolean L1;
    public int L2;
    public final qh.a M;
    public final yw M0;
    public int M1;
    public boolean M2;
    public final org.telegram.ui.n61 N;
    public AnimatorSet N0;
    public final cg.q0 N1;
    public za.p N2;
    public final qh.a O;
    public final ci.ec O0;
    public boolean O1;
    public za.p O2;
    public final View P;
    public lw P0;
    public int P1;
    public boolean P2;
    public final rw Q;
    public boolean Q0;
    public boolean Q1;
    public AnimatorSet Q2;
    public final fw R;
    public final int[] R0;
    public boolean R1;
    public g2.o0 R2;
    public final ow S;
    public final ObjectAnimator[] S0;
    public nx S1;
    public final av S2;
    public final ex T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public cy U;
    public kg.a1 U0;
    public float U1;
    public boolean U2;
    public final qh.c V;
    public boolean V0;
    public float V1;
    public final gv W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.d2 Z1;
    public final qe.a a;
    public AnimatorSet a0;
    public final Drawable[] a1;
    public final org.telegram.ui.ActionBar.e6 a2;
    public final qe.a b;
    public final vi0 b0;
    public final String[] b1;
    public final org.telegram.ui.ActionBar.t5 b2;
    public int c;
    public final vi0 c0;
    public final int c1;
    public final org.telegram.ui.ActionBar.t5 c2;
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
    public final lt g2;
    public final uv h;
    public final iv h0;
    public boolean h1;
    public final aw h2;
    public final jv i0;
    public TLRPC.TL_messages_stickerSet i1;
    public boolean i2;
    public final kx j0;
    public ArrayList j1;
    public final boolean j2;
    public final jx k0;
    public ArrayList k1;
    public final eh.g k2;
    public final mx l0;
    public ArrayList l1;
    public final rg l2;
    public final HashMap m0;
    public ArrayList m1;
    public final si.c m2;
    public final FrameLayout n;
    public final ev n0;
    public final ArrayList n1;
    public final eh.c n2;
    public final jx o0;
    public final ArrayList o1;
    public final pi.q o2;
    public final lv p0;
    public final ArrayList p1;
    public boolean p2;
    public final mw q0;
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
    public fx u1;
    public int u2;
    public boolean v0;
    public long v1;
    public int v2;
    public final View w;
    public boolean w0;
    public boolean w1;
    public long w2;
    public final lb0 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final vv y;
    public final mv y0;
    public final TLRPC.StickerSetCovered[] y1;
    public boolean y2;
    public final vx z0;
    public final LongSparseArray z1;
    public final Rect z2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [org.telegram.ui.Components.ev, org.telegram.ui.Components.fj0] */
    /* JADX WARN: Type inference failed for: r4v90, types: [org.telegram.ui.Components.ev, org.telegram.ui.Components.fj0] */
    public ey(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.e6 e6Var, boolean z15, boolean z16) {
        super(context);
        int i3;
        av avVar;
        boolean z17;
        ew ewVar;
        boolean z18;
        Context context2;
        final org.telegram.ui.ActionBar.e6 e6Var2;
        pi.q qVar;
        ow owVar;
        int i10;
        int i11;
        int i12;
        boolean z19;
        Field field;
        boolean z20;
        ow owVar2;
        boolean z21;
        xq xqVar = xq.h;
        this.a = new qe.a(0, this, xqVar, 320L, false);
        this.b = new qe.a(1, this, xqVar, 320L, false);
        this.c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.d0 = true;
        this.l0 = new mx(this);
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
        int i13 = org.telegram.messenger.h10.t0;
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
        this.g2 = new lt(this, 1);
        this.h2 = new aw(this);
        this.i2 = true;
        pi.q qVar2 = new pi.q();
        this.o2 = qVar2;
        this.s2 = -1.0f;
        this.u2 = -1;
        this.v2 = -1;
        this.w2 = -1L;
        this.x2 = false;
        this.y2 = true;
        this.z2 = new Rect();
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new qe.a(0, new bv(this, 3), xqVar, 380L, true);
        this.S2 = new av(this, 1);
        this.T2 = false;
        this.v0 = z14;
        this.Z1 = d2Var;
        this.d2 = z10;
        this.a2 = e6Var;
        this.j2 = z16;
        si.c cVar = new si.c();
        this.m2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.k6.d6));
        if (z15) {
            u(true);
        }
        i0.a.o(z(org.telegram.ui.ActionBar.k6.Kl), 30);
        int L = org.telegram.messenger.g0.L(50.0f);
        this.c1 = L;
        this.e0 = z13;
        this.Y0 = new Drawable[]{org.telegram.ui.ActionBar.k6.W(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df))};
        org.telegram.ui.ActionBar.t5 W = org.telegram.ui.ActionBar.k6.W(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.t5 W2 = org.telegram.ui.ActionBar.k6.W(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.t5 W3 = org.telegram.ui.ActionBar.k6.W(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.t5 W4 = org.telegram.ui.ActionBar.k6.W(context, R.drawable.emoji_tabs_new1, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        this.b2 = W4;
        int i14 = org.telegram.ui.ActionBar.k6.Ff;
        org.telegram.ui.ActionBar.t5 W5 = org.telegram.ui.ActionBar.k6.W(context, R.drawable.emoji_tabs_new2, z(i14), z(i14));
        this.c2 = W5;
        this.Z0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.a1 = new Drawable[]{org.telegram.ui.ActionBar.k6.W(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df))};
        this.b1 = new String[]{org.telegram.messenger.bd.M0(2131751196, null), org.telegram.messenger.bd.M0(2131751195, null), org.telegram.messenger.bd.M0(2131751194, null), org.telegram.messenger.bd.M0(2131751193, null), org.telegram.messenger.bd.M0(2131751192, null), org.telegram.messenger.bd.M0(2131751191, null), org.telegram.messenger.bd.M0(2131751190, null), org.telegram.messenger.bd.M0(2131751189, null)};
        this.K1 = chatFull;
        Paint paint = new Paint(1);
        this.t1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.k6.Pf));
        float L2 = org.telegram.messenger.g0.L(6.0f);
        cg.p0 p0Var = cg.t0.a;
        this.N1 = new cg.q0(L2);
        ew ewVar2 = new ew(this, context);
        this.K = ewVar2;
        zx zxVar = new zx();
        zxVar.a = 0;
        zxVar.b = ewVar2;
        arrayList.add(zxVar);
        if (z10) {
            org.telegram.messenger.li.b0(i13).B(5);
            org.telegram.messenger.li.b0(i13).w();
            this.f2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.k6.Ci), PorterDuff.Mode.SRC_IN);
        }
        rw rwVar = new rw(this, context);
        this.Q = rwVar;
        qVar2.b(rwVar);
        u4.k kVar = new u4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = xq.g;
        rwVar.setItemAnimator(kVar);
        final int i15 = 0;
        rwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.cv
            public final /* synthetic */ ey b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i15) {
                    case 0:
                        org.telegram.ui.is p10 = org.telegram.ui.is.p();
                        ey eyVar = this.b;
                        rw rwVar2 = eyVar.Q;
                        eyVar.getMeasuredHeight();
                        return p10.r(motionEvent, rwVar2, null, eyVar.h2, e6Var);
                    case 1:
                        org.telegram.ui.is p11 = org.telegram.ui.is.p();
                        ey eyVar2 = this.b;
                        return p11.r(motionEvent, eyVar2.i0, eyVar2.n0, eyVar2.h2, e6Var);
                    default:
                        org.telegram.ui.is p12 = org.telegram.ui.is.p();
                        ey eyVar3 = this.b;
                        ov ovVar = eyVar3.E0;
                        eyVar3.getMeasuredHeight();
                        return p12.r(motionEvent, ovVar, eyVar3.B0, eyVar3.h2, e6Var);
                }
            }
        });
        rwVar.setOnItemLongClickListener(new bv(this, 1));
        rwVar.setInstantClick(true);
        fw fwVar = new fw(this);
        this.R = fwVar;
        rwVar.setLayoutManager(fwVar);
        rwVar.setTopGlowOffset(org.telegram.messenger.g0.L(38.0f));
        rwVar.setBottomGlowOffset(org.telegram.messenger.g0.L(36.0f));
        rwVar.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f));
        int i16 = org.telegram.ui.ActionBar.k6.wf;
        org.telegram.ui.ActionBar.r6.m(rwVar, 21, i16, e6Var);
        rwVar.setItemSelectorColorProvider(new a3(15));
        rwVar.setClipToPadding(false);
        fwVar.O = new gw(this);
        ow owVar3 = new ow(this);
        this.S = owVar3;
        rwVar.setAdapter(owVar3);
        rwVar.i(new gi.o1(this, 3));
        this.T = new ex(this, context);
        ewVar2.addView(rwVar, b8.mf.c(-1.0f, -1));
        vi0 vi0Var = new vi0(rwVar, fwVar);
        this.c0 = vi0Var;
        vi0Var.i = new hw(this);
        rwVar.setOnScrollListener(new iw(this));
        if (d2Var != null) {
            i3 = -1;
            avVar = new av(this, 2);
            ewVar = ewVar2;
            z18 = z16;
            context2 = context;
            e6Var2 = e6Var;
            qVar = qVar2;
            owVar = owVar3;
            i10 = i14;
            i11 = 5;
            z17 = z10;
        } else {
            i3 = -1;
            avVar = null;
            z17 = z10;
            ewVar = ewVar2;
            z18 = z16;
            context2 = context;
            e6Var2 = e6Var;
            qVar = qVar2;
            owVar = owVar3;
            i10 = i14;
            i11 = 5;
        }
        jw jwVar = new jw(this, context2, e6Var2, z17, avVar, z18);
        this.J = jwVar;
        if (z13) {
            gv gvVar = new gv(this, context2);
            this.W = gvVar;
            ewVar.addView(gvVar, new FrameLayout.LayoutParams(i3, org.telegram.messenger.g0.f1() + L));
            gvVar.d.setOnFocusChangeListener(new hv(this));
            qh.c cVar2 = new qh.c(context2, e6Var2);
            this.V = cVar2;
            cVar2.setVisibility(8);
            final int i17 = 0;
            cVar2.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dv
                public final /* synthetic */ ey b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            ex exVar = this.b.T;
                            ax axVar = exVar.c;
                            int childCount = axVar.getChildCount();
                            for (int i18 = 0; i18 < childCount; i18++) {
                                ((qh.b) axVar.getChildAt(i18)).a(false, true);
                            }
                            exVar.d = 0L;
                            exVar.G.b.a(false, true);
                            exVar.f();
                            break;
                        case 1:
                            yx yxVar = this.b.A0;
                            ax axVar2 = yxVar.c;
                            int childCount2 = axVar2.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((qh.b) axVar2.getChildAt(i19)).a(false, true);
                            }
                            yxVar.d = 0L;
                            yxVar.R.a.a(false, true);
                            yxVar.f();
                            break;
                        case 2:
                            fx fxVar = this.b.u1;
                            if (fxVar != null) {
                                fxVar.w();
                                break;
                            }
                            break;
                        default:
                            ey eyVar = this.b;
                            int currentItem = eyVar.h.getCurrentItem();
                            rx rxVar = currentItem == 0 ? eyVar.W : currentItem == 1 ? eyVar.p0 : eyVar.H0;
                            if (rxVar != null) {
                                rp rpVar = rxVar.d;
                                rpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            ewVar.addView(cVar2, new FrameLayout.LayoutParams(i3, L));
        }
        if (Color.alpha(z(i16)) >= 255) {
            org.telegram.ui.ActionBar.r6.i(i16, jwVar, e6Var2);
        }
        owVar.G(true);
        jwVar.p(getEmojipacks());
        ewVar.addView(jwVar, b8.mf.c(36.0f, i3));
        View view = new View(context2);
        this.P = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i18 = org.telegram.ui.ActionBar.k6.zf;
        org.telegram.ui.ActionBar.r6.i(i18, view, e6Var2);
        ow owVar4 = owVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(36.0f);
        ewVar.addView(view, layoutParams);
        qh.a aVar = new qh.a(context2, e6Var2);
        this.M = aVar;
        org.telegram.ui.n61 n61Var = new org.telegram.ui.n61(context2, e6Var2);
        this.L = n61Var;
        n61Var.setVisibility(8);
        n61Var.addView(aVar, b8.mf.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        ewVar.addView(n61Var, b8.mf.e(i3, -2, 80));
        if (z11) {
            uk0 uk0Var = uk0.b;
            if (z12) {
                iv ivVar = new iv(this, context2);
                this.h0 = ivVar;
                zx zxVar2 = new zx();
                zxVar2.a = 1;
                zxVar2.b = ivVar;
                this.d.add(zxVar2);
                jv jvVar = new jv(this, context2);
                this.i0 = jvVar;
                qVar.b(jvVar);
                jvVar.setClipToPadding(false);
                kx kxVar = new kx(this);
                this.j0 = kxVar;
                jvVar.setLayoutManager(kxVar);
                jvVar.i(new kv(this));
                jvVar.setPadding(0, L, 0, org.telegram.messenger.g0.L(44.0f) + this.r2);
                ((u4.f1) jvVar.getItemAnimator()).m = false;
                final int i19 = 1;
                jx jxVar = new jx(this, context2, true, ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.o0 = jxVar;
                jvVar.setAdapter(jxVar);
                this.k0 = new jx(this, context2, false, 0);
                jvVar.setOnScrollListener(new dy(this, 2));
                jvVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.cv
                    public final /* synthetic */ ey b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i19) {
                            case 0:
                                org.telegram.ui.is p10 = org.telegram.ui.is.p();
                                ey eyVar = this.b;
                                rw rwVar2 = eyVar.Q;
                                eyVar.getMeasuredHeight();
                                return p10.r(motionEvent, rwVar2, null, eyVar.h2, e6Var2);
                            case 1:
                                org.telegram.ui.is p11 = org.telegram.ui.is.p();
                                ey eyVar2 = this.b;
                                return p11.r(motionEvent, eyVar2.i0, eyVar2.n0, eyVar2.h2, e6Var2);
                            default:
                                org.telegram.ui.is p12 = org.telegram.ui.is.p();
                                ey eyVar3 = this.b;
                                ov ovVar = eyVar3.E0;
                                eyVar3.getMeasuredHeight();
                                return p12.r(motionEvent, ovVar, eyVar3.B0, eyVar3.h2, e6Var2);
                        }
                    }
                });
                final int i20 = 0;
                ?? r10 = new fj0(this) { // from class: org.telegram.ui.Components.ev
                    public final /* synthetic */ ey b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.fj0
                    public final void f(int i21, View view2) {
                        switch (i20) {
                            case 0:
                                ey eyVar = this.b;
                                jv jvVar2 = eyVar.i0;
                                jx jxVar2 = eyVar.k0;
                                jx jxVar3 = eyVar.o0;
                                if (eyVar.u1 != null) {
                                    jxVar3.getClass();
                                    ArrayList arrayList2 = jxVar3.y;
                                    if (jvVar2.getAdapter() != jxVar3) {
                                        if (jvVar2.getAdapter() == jxVar2 && i21 >= 0 && i21 < jxVar2.y.size()) {
                                            eyVar.u1.v(view2, jxVar2.y.get(i21), jxVar2.x, jxVar2.n, true, 0, 0);
                                            eyVar.W();
                                            break;
                                        }
                                    } else if (i21 >= 0) {
                                        int i22 = jxVar3.I;
                                        if (i21 >= i22) {
                                            int i23 = i22 > 0 ? (i21 - i22) - 1 : i21;
                                            if (i23 >= 0 && i23 < arrayList2.size()) {
                                                eyVar.u1.v(view2, arrayList2.get(i23), null, jxVar3.n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            eyVar.u1.v(view2, eyVar.j1.get(i21), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                ey eyVar2 = this.b;
                                u4.h0 adapter = eyVar2.E0.getAdapter();
                                yx yxVar = eyVar2.A0;
                                String str = adapter == yxVar ? yxVar.O : null;
                                if (view2 instanceof org.telegram.ui.Cells.y7) {
                                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view2;
                                    if (y7Var.getSticker() != null && org.telegram.messenger.zi.Y3(y7Var.getSticker()) && !org.telegram.messenger.h10.i(org.telegram.messenger.c.a(eyVar2.d1).a).q()) {
                                        org.telegram.ui.is.p().x(y7Var);
                                        break;
                                    } else {
                                        org.telegram.ui.is.p().t();
                                        if (!y7Var.r) {
                                            y7Var.r = true;
                                            y7Var.n = 0.5f;
                                            y7Var.y = 0L;
                                            org.telegram.ui.Cells.x7 x7Var = y7Var.a;
                                            x7Var.setAlpha(0.5f * y7Var.I);
                                            x7Var.invalidate();
                                            y7Var.s = System.currentTimeMillis();
                                            y7Var.invalidate();
                                            eyVar2.u1.m(y7Var, y7Var.getSticker(), str, y7Var.getParentObject(), y7Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.n0 = r10;
                jvVar.setOnItemClickListener((fj0) r10);
                ivVar.addView(jvVar, b8.mf.c(-1.0f, -1));
                lv lvVar = new lv(this, context2);
                this.p0 = lvVar;
                ivVar.addView(lvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
                mw mwVar = new mw(this, context2, e6Var2);
                this.q0 = mwVar;
                mwVar.setType(uk0Var);
                mwVar.setUnderlineHeight(org.telegram.messenger.g0.f1());
                mwVar.setIndicatorColor(z(i10));
                mwVar.setUnderlineColor(z(i18));
                org.telegram.ui.ActionBar.r6.i(i16, mwVar, e6Var2);
                V();
                mwVar.setDelegate(new bv(this, 2));
                jxVar.F("", "", true, true, true);
            }
            mv mvVar = new mv(this, context2, z14);
            this.y0 = mvVar;
            org.telegram.messenger.li.b0(this.d1).B(0);
            org.telegram.messenger.li.b0(this.d1).x();
            ov ovVar = new ov(this, context2);
            this.E0 = ovVar;
            this.o2.b(ovVar);
            pv pvVar = new pv(this);
            this.F0 = pvVar;
            ovVar.setLayoutManager(pvVar);
            pvVar.O = new qv(this);
            ovVar.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f));
            ovVar.setClipToPadding(false);
            zx zxVar3 = new zx();
            zxVar3.a = 2;
            zxVar3.b = mvVar;
            this.d.add(zxVar3);
            this.A0 = new yx(this, context2);
            vx vxVar = new vx(this, context2);
            this.z0 = vxVar;
            ovVar.setAdapter(vxVar);
            final int i21 = 2;
            ovVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.Components.cv
                public final /* synthetic */ ey b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i21) {
                        case 0:
                            org.telegram.ui.is p10 = org.telegram.ui.is.p();
                            ey eyVar = this.b;
                            rw rwVar2 = eyVar.Q;
                            eyVar.getMeasuredHeight();
                            return p10.r(motionEvent, rwVar2, null, eyVar.h2, e6Var2);
                        case 1:
                            org.telegram.ui.is p11 = org.telegram.ui.is.p();
                            ey eyVar2 = this.b;
                            return p11.r(motionEvent, eyVar2.i0, eyVar2.n0, eyVar2.h2, e6Var2);
                        default:
                            org.telegram.ui.is p12 = org.telegram.ui.is.p();
                            ey eyVar3 = this.b;
                            ov ovVar2 = eyVar3.E0;
                            eyVar3.getMeasuredHeight();
                            return p12.r(motionEvent, ovVar2, eyVar3.B0, eyVar3.h2, e6Var2);
                    }
                }
            });
            final int i22 = 1;
            ?? r42 = new fj0(this) { // from class: org.telegram.ui.Components.ev
                public final /* synthetic */ ey b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.Components.fj0
                public final void f(int i212, View view2) {
                    switch (i22) {
                        case 0:
                            ey eyVar = this.b;
                            jv jvVar2 = eyVar.i0;
                            jx jxVar2 = eyVar.k0;
                            jx jxVar3 = eyVar.o0;
                            if (eyVar.u1 != null) {
                                jxVar3.getClass();
                                ArrayList arrayList2 = jxVar3.y;
                                if (jvVar2.getAdapter() != jxVar3) {
                                    if (jvVar2.getAdapter() == jxVar2 && i212 >= 0 && i212 < jxVar2.y.size()) {
                                        eyVar.u1.v(view2, jxVar2.y.get(i212), jxVar2.x, jxVar2.n, true, 0, 0);
                                        eyVar.W();
                                        break;
                                    }
                                } else if (i212 >= 0) {
                                    int i222 = jxVar3.I;
                                    if (i212 >= i222) {
                                        int i23 = i222 > 0 ? (i212 - i222) - 1 : i212;
                                        if (i23 >= 0 && i23 < arrayList2.size()) {
                                            eyVar.u1.v(view2, arrayList2.get(i23), null, jxVar3.n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        eyVar.u1.v(view2, eyVar.j1.get(i212), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            ey eyVar2 = this.b;
                            u4.h0 adapter = eyVar2.E0.getAdapter();
                            yx yxVar = eyVar2.A0;
                            String str = adapter == yxVar ? yxVar.O : null;
                            if (view2 instanceof org.telegram.ui.Cells.y7) {
                                org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view2;
                                if (y7Var.getSticker() != null && org.telegram.messenger.zi.Y3(y7Var.getSticker()) && !org.telegram.messenger.h10.i(org.telegram.messenger.c.a(eyVar2.d1).a).q()) {
                                    org.telegram.ui.is.p().x(y7Var);
                                    break;
                                } else {
                                    org.telegram.ui.is.p().t();
                                    if (!y7Var.r) {
                                        y7Var.r = true;
                                        y7Var.n = 0.5f;
                                        y7Var.y = 0L;
                                        org.telegram.ui.Cells.x7 x7Var = y7Var.a;
                                        x7Var.setAlpha(0.5f * y7Var.I);
                                        x7Var.invalidate();
                                        y7Var.s = System.currentTimeMillis();
                                        y7Var.invalidate();
                                        eyVar2.u1.m(y7Var, y7Var.getSticker(), str, y7Var.getParentObject(), y7Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.B0 = r42;
            ovVar.setOnItemClickListener((fj0) r42);
            org.telegram.ui.ActionBar.r6.m(ovVar, 21, i16, e6Var2);
            mvVar.addView(ovVar);
            this.b0 = new vi0(ovVar, pvVar);
            rv rvVar = new rv(this, context2);
            this.H0 = rvVar;
            mvVar.addView(rvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            qh.c cVar3 = new qh.c(context2, e6Var2);
            this.I0 = cVar3;
            cVar3.setVisibility(8);
            final int i23 = 1;
            cVar3.setOnBackClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dv
                public final /* synthetic */ ey b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i23) {
                        case 0:
                            ex exVar = this.b.T;
                            ax axVar = exVar.c;
                            int childCount = axVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((qh.b) axVar.getChildAt(i182)).a(false, true);
                            }
                            exVar.d = 0L;
                            exVar.G.b.a(false, true);
                            exVar.f();
                            break;
                        case 1:
                            yx yxVar = this.b.A0;
                            ax axVar2 = yxVar.c;
                            int childCount2 = axVar2.getChildCount();
                            for (int i192 = 0; i192 < childCount2; i192++) {
                                ((qh.b) axVar2.getChildAt(i192)).a(false, true);
                            }
                            yxVar.d = 0L;
                            yxVar.R.a.a(false, true);
                            yxVar.f();
                            break;
                        case 2:
                            fx fxVar = this.b.u1;
                            if (fxVar != null) {
                                fxVar.w();
                                break;
                            }
                            break;
                        default:
                            ey eyVar = this.b;
                            int currentItem = eyVar.h.getCurrentItem();
                            rx rxVar = currentItem == 0 ? eyVar.W : currentItem == 1 ? eyVar.p0 : eyVar.H0;
                            if (rxVar != null) {
                                rp rpVar = rxVar.d;
                                rpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            mvVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z19 = z14;
            i12 = 80;
            sv svVar = new sv(this, context2, e6Var2, d2Var, z19);
            this.C0 = svVar;
            svVar.setDragEnabled(true);
            svVar.setWillNotDraw(false);
            svVar.setType(uk0Var);
            svVar.setUnderlineHeight(ovVar.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
            svVar.setIndicatorColor(z(i10));
            svVar.setUnderlineColor(z(i18));
            if (viewGroup == null || !z19) {
                mvVar.addView(svVar, b8.mf.e(-1, 36, 51));
            } else {
                tv tvVar = new tv(this, context2);
                this.D0 = tvVar;
                tvVar.addView(svVar, b8.mf.e(-1, 36, 51));
                viewGroup.addView(tvVar, b8.mf.c(-2.0f, -1));
            }
            X(true);
            svVar.setDelegate(new bv(this, 4));
            ovVar.setOnScrollListener(new dy(this, 0));
            qh.a aVar2 = new qh.a(context2, e6Var2);
            this.O = aVar2;
            org.telegram.ui.n61 n61Var2 = new org.telegram.ui.n61(context2, e6Var2);
            this.N = n61Var2;
            n61Var2.setVisibility(8);
            n61Var2.addView(aVar2, b8.mf.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            mvVar.addView(n61Var2, b8.mf.e(-1, -2, 80));
        } else {
            i12 = 80;
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        uv uvVar = new uv(this, context2);
        this.h = uvVar;
        pi.q qVar3 = this.o2;
        qVar3.getClass();
        uvVar.b(new pi.i(qVar3, uvVar));
        uvVar.setOverScrollMode(2);
        yw ywVar = new yw(this);
        this.M0 = ywVar;
        uvVar.setAdapter(ywVar);
        vv vvVar = new vv(this, context2);
        this.y = vvVar;
        vvVar.setHapticFeedbackEnabled(true);
        vvVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        vvVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        vvVar.setScaleType(scaleType);
        vvVar.setContentDescription(org.telegram.messenger.bd.M0(2131754920, null));
        vvVar.setFocusable(true);
        vvVar.setOnClickListener(new wv());
        b8.pf.a(vvVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        if (z13) {
            addView(frameLayout, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.p) + 40.0f));
        } else {
            addView(frameLayout, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.s = frameLayout2;
        addView(frameLayout2, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.n = frameLayout3;
        View view2 = new View(context2);
        this.w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(40.0f), 83));
        if (z13) {
            addView(frameLayout3, b8.mf.e(-1, 48, i12));
            frameLayout3.addView(vvVar, b8.mf.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.E = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.bd.M0(2131745505, null));
                b8.pf.a(imageView);
                frameLayout3.addView(imageView, b8.mf.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i24 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dv
                    public final /* synthetic */ ey b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i24) {
                            case 0:
                                ex exVar = this.b.T;
                                ax axVar = exVar.c;
                                int childCount = axVar.getChildCount();
                                for (int i182 = 0; i182 < childCount; i182++) {
                                    ((qh.b) axVar.getChildAt(i182)).a(false, true);
                                }
                                exVar.d = 0L;
                                exVar.G.b.a(false, true);
                                exVar.f();
                                break;
                            case 1:
                                yx yxVar = this.b.A0;
                                ax axVar2 = yxVar.c;
                                int childCount2 = axVar2.getChildCount();
                                for (int i192 = 0; i192 < childCount2; i192++) {
                                    ((qh.b) axVar2.getChildAt(i192)).a(false, true);
                                }
                                yxVar.d = 0L;
                                yxVar.R.a.a(false, true);
                                yxVar.f();
                                break;
                            case 2:
                                fx fxVar = this.b.u1;
                                if (fxVar != null) {
                                    fxVar.w();
                                    break;
                                }
                                break;
                            default:
                                ey eyVar = this.b;
                                int currentItem = eyVar.h.getCurrentItem();
                                rx rxVar = currentItem == 0 ? eyVar.W : currentItem == 1 ? eyVar.p0 : eyVar.H0;
                                if (rxVar != null) {
                                    rp rpVar = rxVar.d;
                                    rpVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    rpVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    rpVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            lb0 lb0Var = new lb0(context2, e6Var2);
            this.x = lb0Var;
            lb0Var.setViewPager(uvVar);
            lb0Var.setShouldExpand(false);
            lb0Var.setIndicatorHeight(org.telegram.messenger.g0.L(3.0f));
            lb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.k6.Df), 20));
            lb0Var.setUnderlineHeight(0);
            lb0Var.setTabPaddingLeftRight(org.telegram.messenger.g0.L(11.0f));
            lb0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
            frameLayout3.addView(lb0Var, b8.mf.e(-2, 48, 81));
            lb0Var.setOnPageChangeListener(new xv(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.F = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, b8.mf.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i25 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dv
                public final /* synthetic */ ey b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i25) {
                        case 0:
                            ex exVar = this.b.T;
                            ax axVar = exVar.c;
                            int childCount = axVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((qh.b) axVar.getChildAt(i182)).a(false, true);
                            }
                            exVar.d = 0L;
                            exVar.G.b.a(false, true);
                            exVar.f();
                            break;
                        case 1:
                            yx yxVar = this.b.A0;
                            ax axVar2 = yxVar.c;
                            int childCount2 = axVar2.getChildCount();
                            for (int i192 = 0; i192 < childCount2; i192++) {
                                ((qh.b) axVar2.getChildAt(i192)).a(false, true);
                            }
                            yxVar.d = 0L;
                            yxVar.R.a.a(false, true);
                            yxVar.f();
                            break;
                        case 2:
                            fx fxVar = this.b.u1;
                            if (fxVar != null) {
                                fxVar.w();
                                break;
                            }
                            break;
                        default:
                            ey eyVar = this.b;
                            int currentItem = eyVar.h.getCurrentItem();
                            rx rxVar = currentItem == 0 ? eyVar.W : currentItem == 1 ? eyVar.p0 : eyVar.H0;
                            if (rxVar != null) {
                                rp rpVar = rxVar.d;
                                rpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, b8.mf.d(56, 48.0f, (org.telegram.messenger.bd.a0 ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), z(i16), z(i16));
            b8.pf.a(vvVar);
            vvVar.setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
            vvVar.setBackground(j02);
            vvVar.setContentDescription(org.telegram.messenger.bd.M0(2131754920, null));
            vvVar.setFocusable(true);
            frameLayout3.addView(vvVar, b8.mf.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(uvVar, 0, b8.mf.e(-1, -1, 51));
        ci.ec ecVar = new ci.ec(context2, 24);
        this.O0 = ecVar;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int i26 = org.telegram.ui.ActionBar.k6.eg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L3, z(i26));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i26);
        ecVar.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(ecVar, d02, N, null, e6Var2);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.dg, e6Var2);
        ecVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        char c2 = 16;
        ecVar.setGravity(16);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setVisibility(4);
        addView(ecVar, b8.mf.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.D1 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        Field field2 = wt.f;
        wt wtVar = new wt(new vt(context2, e6Var2));
        if (wt.f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            wt.f = field;
        }
        Field field3 = wt.f;
        if (field3 != null) {
            try {
                wtVar.a = (ViewTreeObserver.OnScrollChangedListener) field3.get(wtVar);
                wt.f.set(wtVar, wt.g);
            } catch (Exception unused3) {
                wtVar.a = null;
            }
        }
        this.C1 = wtVar;
        wtVar.c.setOnSelectionUpdateListener(new e(this, 10));
        this.B1 = org.telegram.messenger.hp.d1().getInt("selected_page", 0);
        HashMap hashMap = org.telegram.messenger.i6.h;
        if (!org.telegram.messenger.i6.k) {
            org.telegram.messenger.i6.k = true;
            SharedPreferences d12 = org.telegram.messenger.hp.d1();
            try {
                hashMap.clear();
                if (d12.contains("emojis")) {
                    String string = d12.getString("emojis", "");
                    if (string != null && string.length() > 0) {
                        String[] split = string.split(",");
                        int length = split.length;
                        int i27 = 0;
                        while (i27 < length) {
                            String[] split2 = split[i27].split("=");
                            long longValue = Utilities.A(split2[0]).longValue();
                            StringBuilder sb2 = new StringBuilder();
                            char c10 = c2;
                            String[] strArr = split;
                            int i28 = 0;
                            while (i28 < 4) {
                                int i29 = i28;
                                sb2.insert(0, (char) longValue);
                                longValue >>= c10;
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
                            c2 = c10;
                            split = strArr;
                        }
                    }
                    d12.edit().remove("emojis").commit();
                    org.telegram.messenger.i6.r();
                } else {
                    String string2 = d12.getString("emojis2", "");
                    if (string2 != null && string2.length() > 0) {
                        for (String str : string2.split(",")) {
                            String[] split3 = str.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !d12.getBoolean("filled_default", false)) {
                    int i30 = 0;
                    while (true) {
                        String[] strArr2 = org.telegram.messenger.i6.o;
                        if (i30 >= strArr2.length) {
                            break;
                        }
                        hashMap.put(strArr2[i30], Integer.valueOf(strArr2.length - i30));
                        i30++;
                    }
                    d12.edit().putBoolean("filled_default", true).commit();
                    org.telegram.messenger.i6.r();
                }
                org.telegram.messenger.i6.s();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                String string3 = d12.getString("color", "");
                if (string3 != null && string3.length() > 0) {
                    for (String str2 : string3.split(",")) {
                        String[] split4 = str2.split("=");
                        org.telegram.messenger.i6.j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e11) {
                z20 = true;
                org.telegram.messenger.a8.g(e11, true);
                owVar2 = owVar4;
                z21 = false;
            }
        }
        owVar2 = owVar4;
        z21 = false;
        z20 = true;
        owVar2.F(z21);
        I(z20, z11, z12, z21);
        if (Build.VERSION.SDK_INT >= 31) {
            eh.g gVar = new eh.g(z21);
            this.k2 = gVar;
            this.o2.a(gVar);
            si.f fVar = new si.f(null);
            fVar.f = cVar;
            fVar.d = gVar;
            fVar.e = -2;
            eh.c cVar4 = new eh.c(fVar, fVar, fVar);
            this.n2 = cVar4;
            cVar4.k = true;
            int L4 = org.telegram.messenger.g0.L(org.telegram.messenger.lc.e(262144) ? 8.0f : 48.0f);
            cVar4.d = L4;
            cVar4.e = L4;
            cVar4.j = this.o2;
        } else {
            eh.c cVar5 = new eh.c(cVar, cVar, cVar);
            this.n2 = cVar5;
            cVar5.j = this.o2;
            this.k2 = null;
        }
        this.l2 = new rg(this, 1);
        setBlurredBackgroundDrawableFactory(this.n2);
        this.o2.i(this);
        this.o2.a = new bv(this, 0);
    }

    public static void a(ey eyVar, boolean z10) {
        jv jvVar = eyVar.i0;
        if (jvVar == null) {
            return;
        }
        int childCount = jvVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = jvVar.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.h2) {
                ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
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

    public static void b(ey eyVar, nx nxVar, String str) {
        String str2;
        fx fxVar;
        org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
        int i3 = eyVar.d1;
        ArrayList arrayList = eyVar.r1;
        if (nxVar == null) {
            return;
        }
        if (nxVar.getSpan() == null) {
            eyVar.E2 = SystemClock.elapsedRealtime();
            eyVar.M(true);
            String str3 = str != null ? str : (String) nxVar.getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str != null) {
                fx fxVar2 = eyVar.u1;
                if (fxVar2 != null) {
                    fxVar2.l(org.telegram.messenger.i6.c(str));
                    return;
                }
                return;
            }
            if (!nxVar.c && (str2 = (String) org.telegram.messenger.i6.j.get(str3)) != null) {
                str3 = g(str3, str2);
            }
            eyVar.h(str3);
            fx fxVar3 = eyVar.u1;
            if (fxVar3 != null) {
                fxVar3.l(org.telegram.messenger.i6.c(str3));
                return;
            }
            return;
        }
        if (eyVar.u1 != null) {
            long j10 = nxVar.getSpan().documentId;
            TLRPC.Document document = nxVar.getSpan().document;
            sw swVar = nxVar.e;
            boolean z10 = swVar != null && swVar.i;
            if (document == null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    sw swVar2 = (sw) arrayList.get(i10);
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = swVar2.c;
                        if (arrayList2 != null && i11 < arrayList2.size()) {
                            if (((TLRPC.Document) swVar2.c.get(i11)).id == j10) {
                                document = (TLRPC.Document) swVar2.c.get(i11);
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
            if (document == null) {
                document = g5.e(i3, j10);
            }
            TLRPC.Document document2 = document;
            String U = document2 != null ? org.telegram.messenger.zi.U(document2) : null;
            if (org.telegram.messenger.zi.n3(document2) || org.telegram.messenger.h10.i(i3).q() || (((fxVar = eyVar.u1) != null && fxVar.g()) || eyVar.V0 || z10)) {
                eyVar.E2 = SystemClock.elapsedRealtime();
                eyVar.M(true);
                eyVar.h("animated_" + j10);
                eyVar.u1.x(j10, document2, U, nxVar.c);
                return;
            }
            eyVar.M(false);
            fc a02 = d2Var != null ? fc.a0(d2Var) : new fc(eyVar.r, eyVar.a2);
            if (eyVar.i2 || d2Var == null) {
                a02.r(document2, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131743874, null)), org.telegram.messenger.bd.M0(2131747041, null), new av(eyVar, 3)).j();
            } else {
                a02.K(R.raw.saved_messages, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131743873, null)), org.telegram.messenger.bd.M0(2131747825, null), new av(eyVar, 4)).j();
            }
            eyVar.i2 = !eyVar.i2;
        }
    }

    public static void e(ey eyVar, int i3, int i10) {
        u4.d1 K;
        int[] iArr = eyVar.R0;
        if (i3 == 1) {
            eyVar.n(i10, eyVar.Q);
            return;
        }
        fx fxVar = eyVar.u1;
        if ((fxVar == null || !fxVar.z()) && !eyVar.K0) {
            tj0 x10 = eyVar.x(i3);
            if (i10 <= 0 || x10 == null || x10.getVisibility() != 0 || (K = x10.K(0)) == null || K.a.getTop() + eyVar.c1 < x10.getPaddingTop()) {
                int i11 = iArr[i3] - i10;
                iArr[i3] = i11;
                if (i11 > 0) {
                    iArr[i3] = 0;
                } else if (i11 < (-org.telegram.messenger.g0.L(288.0f))) {
                    iArr[i3] = -org.telegram.messenger.g0.L(288.0f);
                }
                if (i3 == 0) {
                    eyVar.Z();
                } else {
                    eyVar.y(i3).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i3]));
                }
            }
        }
    }

    public static void f(ey eyVar, boolean z10) {
        int N0;
        kx kxVar = eyVar.j0;
        lv lvVar = eyVar.p0;
        jv jvVar = eyVar.i0;
        if (jvVar != null && (jvVar.getAdapter() instanceof jx)) {
            jx jxVar = (jx) jvVar.getAdapter();
            if (!jxVar.s && jxVar.h == 0 && !jxVar.y.isEmpty() && (N0 = kxVar.N0()) != -1 && N0 > kxVar.B() - 5) {
                String str = jxVar.x;
                String str2 = jxVar.r;
                boolean z11 = jxVar.w;
                jxVar.F(str, str2, true, z11, z11);
            }
        }
        fx fxVar = eyVar.u1;
        if (fxVar == null || !fxVar.z()) {
            if (lvVar == null || jvVar == null) {
                return;
            }
            lvVar.a.a(true, !z10);
            return;
        }
        u4.d1 K = jvVar.K(0);
        if (K == null) {
            rx.a(lvVar, true, !z10);
        } else {
            rx.a(lvVar, K.a.getTop() < jvVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        String str3;
        boolean z10 = true;
        if (org.telegram.messenger.h4.c(str) != null) {
            if (org.telegram.messenger.h4.c(str) == null) {
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
        if (org.telegram.messenger.i6.b(str)) {
            str = com.google.android.recaptcha.internal.a.j(str, 2, 0);
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.recaptcha.internal.a.j(str, 2, 0);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.recaptcha.internal.a.j(str, 3, 0);
        }
        String q10 = t4.c.q(str, str2);
        if (str3 != null) {
            q10 = t4.c.q(q10, str3);
        }
        return z10 ? t4.c.q(q10, "\u200d➡") : q10;
    }

    public static void j(int i3, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i3);
    }

    public final void A() {
        rv rvVar = this.H0;
        if (rvVar != null) {
            rvVar.b();
        }
        lv lvVar = this.p0;
        if (lvVar != null) {
            lvVar.b();
        }
        gv gvVar = this.W;
        if (gvVar != null) {
            gvVar.b();
        }
    }

    public final void B() {
        za.p pVar = this.N2;
        if (pVar != null) {
            pVar.a();
            this.N2 = null;
        }
        za.p pVar2 = this.O2;
        if (pVar2 != null) {
            pVar2.a();
            this.O2 = null;
            this.P2 = false;
        }
    }

    public final void C(boolean z10, boolean z11) {
        qx qxVar;
        if (this.B1 != 0 && this.x1) {
            this.B1 = 0;
        }
        if (this.B1 == 0 && this.w1) {
            this.B1 = 1;
        }
        int i3 = this.B1;
        uv uvVar = this.h;
        if (i3 == 0 || z10 || this.e.size() == 1) {
            L(true, false);
            Q(false, false);
            if (uvVar.getCurrentItem() != 0) {
                uvVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.g0.i3(new av(this, 5), 350L);
            }
        } else {
            int i10 = this.B1;
            if (i10 == 1) {
                L(false, false);
                Q(this.v0 || this.w0, false);
                if (uvVar.getCurrentItem() != 2) {
                    uvVar.x(2, false);
                }
                sv svVar = this.C0;
                if (svVar != null) {
                    this.T0 = true;
                    int i11 = this.H1;
                    if (i11 >= 0) {
                        svVar.m(i11);
                    } else {
                        int i12 = this.G1;
                        if (i12 >= 0) {
                            svVar.m(i12);
                        } else {
                            svVar.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.h1(0, 0);
                }
            } else if (i10 == 2) {
                L(false, false);
                Q(false, false);
                if (uvVar.getCurrentItem() != 1) {
                    uvVar.x(1, false);
                }
                mw mwVar = this.q0;
                if (mwVar != null) {
                    mwVar.m(0);
                }
                lv lvVar = this.p0;
                if (lvVar != null && (qxVar = lvVar.r) != null) {
                    qxVar.I1(null);
                }
            }
        }
        M(true);
    }

    public final void D() {
        vx vxVar = this.z0;
        if (vxVar != null) {
            vxVar.f();
        }
        yx yxVar = this.A0;
        if (yxVar != null) {
            yxVar.f();
        }
        if (org.telegram.ui.is.p().E) {
            org.telegram.ui.is.p().m();
        }
        org.telegram.ui.is.p().t();
    }

    public final void E(int i3) {
        fx fxVar = this.u1;
        if ((fxVar == null || !fxVar.z()) && i3 != 0) {
            HorizontalScrollView y9 = y(i3);
            this.R0[i3] = 0;
            y9.setTranslationY(0);
        }
    }

    public final void G(int i3, int i10) {
        fw fwVar = this.R;
        View m10 = fwVar.m(i3);
        int L0 = fwVar.L0();
        if ((m10 == null && Math.abs(i3 - L0) > fwVar.J * 9.0f) || !org.telegram.messenger.az.c()) {
            int i11 = fwVar.L0() < i3 ? 0 : 1;
            vi0 vi0Var = this.c0;
            vi0Var.b = i11;
            vi0Var.d(i3, i10, false, false);
            return;
        }
        this.K0 = true;
        gi.j1 j1Var = new gi.j1(1, this.Q.getContext(), this);
        j1Var.a = i3;
        j1Var.p = i10;
        fwVar.w0(j1Var);
    }

    public final void H(int i3, int i10) {
        pv pvVar = this.F0;
        View m10 = pvVar.m(i3);
        int L0 = pvVar.L0();
        if (m10 != null || Math.abs(i3 - L0) <= 40) {
            this.K0 = true;
            this.E0.y0(i3);
        } else {
            int i11 = pvVar.L0() < i3 ? 0 : 1;
            vi0 vi0Var = this.b0;
            vi0Var.b = i11;
            vi0Var.d(i3, i10, false, false);
        }
    }

    public final void I(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i3 >= arrayList2.size()) {
                break;
            }
            if (((zx) arrayList2.get(i3)).a == 0 && z10) {
                arrayList.add((zx) arrayList2.get(i3));
            }
            if (((zx) arrayList2.get(i3)).a == 1 && z12) {
                arrayList.add((zx) arrayList2.get(i3));
            }
            if (((zx) arrayList2.get(i3)).a == 2 && z11) {
                arrayList.add((zx) arrayList2.get(i3));
            }
            i3++;
        }
        lb0 lb0Var = this.x;
        if (lb0Var != null) {
            org.telegram.messenger.g0.Z3(lb0Var, arrayList.size() > 1, 1.0f, true, z13);
        }
        uv uvVar = this.h;
        if (uvVar != null) {
            uvVar.setAdapter(null);
            uvVar.setAdapter(this.M0);
            if (lb0Var != null) {
                lb0Var.setViewPager(uvVar);
            }
        }
    }

    public final void J(final qh.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        yx yxVar;
        ex exVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (exVar = this.T) == null || exVar.d == stickerSet.id) {
            if (z10 || (yxVar = this.A0) == null || yxVar.d == stickerSet.id) {
                final boolean B0 = org.telegram.messenger.li.b0(this.d1).B0(stickerSet.id, true);
                aVar.i(B0 ? stickerSet.masks ? org.telegram.messenger.bd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.bd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.bd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]) : stickerSet.masks ? org.telegram.messenger.bd.G(stickerSet.count, "AddManyMasksCount", new Object[0]) : stickerSet.emojis ? org.telegram.messenger.bd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]) : org.telegram.messenger.bd.G(stickerSet.count, "AddManyStickersCount", new Object[0]), z11, true);
                aVar.l0.a(!B0, z11);
                aVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.fv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ey eyVar = ey.this;
                        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(eyVar.d1);
                        Context context = eyVar.getContext();
                        int i3 = B0 ? 0 : 2;
                        org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
                        FrameLayout frameLayout = eyVar.s;
                        qh.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        b02.g2(context, tLObject2, document2, i3, d2Var, frameLayout, false, true, new ci.v3(eyVar, aVar2, tLObject2, stickerSet2, document2, z12), false);
                        eyVar.J(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j10, boolean z10, boolean z11) {
        lb0 lb0Var = this.x;
        if (lb0Var == null) {
            return;
        }
        this.w1 = z10;
        this.x1 = z11;
        if (z11 || z10) {
            this.v1 = j10;
        } else {
            this.v1 = 0L;
        }
        int i3 = z11 ? 2 : 0;
        LinearLayout linearLayout = lb0Var.d;
        View childAt = i3 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i3);
        if (childAt != null) {
            childAt.setAlpha(this.v1 != 0 ? 0.15f : 1.0f);
            uv uvVar = this.h;
            if (z11) {
                if (this.v1 == 0 || uvVar.getCurrentItem() == 0) {
                    return;
                }
                L(true, true);
                Q(false, true);
                uvVar.x(0, false);
                return;
            }
            if (this.v1 == 0 || uvVar.getCurrentItem() == 1) {
                return;
            }
            L(false, true);
            Q(false, true);
            uvVar.x(1, false);
        }
    }

    public final void L(boolean z10, boolean z11) {
        vv vvVar = this.y;
        if (z10 && vvVar.getTag() == null) {
            return;
        }
        if ((z10 || vvVar.getTag() == null) && !this.p2) {
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            vvVar.setTag(z10 ? null : 1);
            if (!z11) {
                vvVar.setAlpha(z10 ? 1.0f : 0.0f);
                vvVar.setScaleX(z10 ? 1.0f : 0.0f);
                vvVar.setScaleY(z10 ? 1.0f : 0.0f);
                vvVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                vvVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(vvVar, (Property<vv, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(vvVar, (Property<vv, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(vvVar, (Property<vv, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.G.setDuration(200L);
            this.G.setInterpolator(xq.g);
            this.G.addListener(new bw(this, z10, r2));
            this.G.start();
        }
    }

    public final void M(boolean z10) {
        this.I = 0.0f;
        fx fxVar = this.u1;
        if (fxVar != null && fxVar.z()) {
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

    public final void N(boolean z10, boolean z11) {
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
            this.a0.setInterpolator(xq.g);
            this.a0.addListener(new x5(this, 24));
            this.a0.start();
        }
    }

    public final void O(boolean z10) {
        for (int i3 = 0; i3 < 3; i3++) {
            u4.s w10 = w(i3);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    E(i3);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void P(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.d1).M0(Long.valueOf(this.v1));
        if (M0 == null) {
            return;
        }
        ci.ec ecVar = this.O0;
        if (z10) {
            if (org.telegram.messenger.t3.N(M0) || (tL_chatBannedRights = M0.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = M0.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.D1(tL_chatBannedRights2)) {
                    if (z11) {
                        ecVar.setText(org.telegram.messenger.bd.a0("AttachPlainRestricted", null, 2131753944, org.telegram.messenger.bd.v(M0.banned_rights.until_date)));
                    }
                    if (z12) {
                        ecVar.setText(org.telegram.messenger.bd.a0("AttachGifRestricted", null, 2131753970, org.telegram.messenger.bd.v(M0.banned_rights.until_date)));
                    } else {
                        ecVar.setText(org.telegram.messenger.bd.a0("AttachStickersRestricted", null, 2131753935, org.telegram.messenger.bd.v(M0.banned_rights.until_date)));
                    }
                } else if (z11) {
                    ecVar.setText(org.telegram.messenger.bd.M0(2131753943, null));
                } else if (z12) {
                    ecVar.setText(org.telegram.messenger.bd.M0(2131753969, null));
                } else {
                    ecVar.setText(org.telegram.messenger.bd.M0(2131753934, null));
                }
            } else {
                org.telegram.ui.ActionBar.d2 d2Var = this.Z1;
                if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).Y6()) {
                    return;
                }
                if (z11) {
                    ecVar.setText(org.telegram.messenger.bd.M0(2131749554, null));
                } else if (z12) {
                    ecVar.setText(org.telegram.messenger.bd.M0(2131749553, null));
                } else {
                    ecVar.setText(org.telegram.messenger.bd.M0(2131749547, null));
                }
            }
            ecVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.Q2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Q2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Q2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ecVar, (Property<ci.ec, Float>) View.ALPHA, z10 ? ecVar.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(ecVar, (Property<ci.ec, Float>) View.TRANSLATION_Y, z10 ? org.telegram.messenger.g0.L(12.0f) : ecVar.getTranslationY(), z10 ? 0.0f : org.telegram.messenger.g0.L(12.0f)));
        g2.o0 o0Var = this.R2;
        if (o0Var != null) {
            org.telegram.messenger.g0.r(o0Var);
        }
        if (z10) {
            g2.o0 o0Var2 = new g2.o0(this, z11, z12, 4);
            this.R2 = o0Var2;
            org.telegram.messenger.g0.i3(o0Var2, 3500L);
        }
        this.Q2.setDuration(320L);
        this.Q2.setInterpolator(xq.h);
        this.Q2.start();
    }

    public final void Q(boolean z10, boolean z11) {
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
            int i3 = 1;
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
            this.H.setInterpolator(xq.g);
            this.H.addListener(new bw(this, z10, i3));
            this.H.start();
        }
    }

    public final void R() {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (((View) getParent()) != null) {
            float y9 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((org.telegram.messenger.g0.E || ((d2Var = this.Z1) != null && d2Var.isInBubbleMode())) && !this.W0) ? org.telegram.messenger.g0.L(1.0f) : r0.getHeight());
            float f10 = this.s2;
            FrameLayout frameLayout = this.n;
            if (f10 >= 0.0f) {
                y9 += getMeasuredHeight() - this.s2;
            } else if (frameLayout.getTop() - y9 < 0.0f || !this.y2) {
                y9 = 0.0f;
            }
            float W1 = (-y9) + org.telegram.messenger.g0.W1(this.F2.e, org.telegram.messenger.g0.L(50.0f), -this.r2);
            frameLayout.setTranslationY(W1);
            if (this.e0) {
                this.r.setTranslationY(W1);
            }
        }
    }

    public final void S() {
        rx rxVar;
        boolean z10;
        vu vuVar;
        boolean z11 = this.v0;
        View view = this.w;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (org.telegram.messenger.g0.E || this.O1) {
            Drawable background = getBackground();
            int z12 = z(org.telegram.ui.ActionBar.k6.wf);
            if (background != null && (background != this.H2 || z12 != this.I2)) {
                this.H2 = background;
                this.I2 = z12;
                background.setColorFilter(new PorterDuffColorFilter(z12, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i3 = org.telegram.ui.ActionBar.k6.wf;
            setBackgroundColor(z(i3));
            if (this.e0) {
                view.setBackgroundColor(z(i3));
            }
        }
        jw jwVar = this.J;
        if (jwVar != null) {
            if (this.v0) {
                jwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.wf));
                this.P.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.zf));
            } else {
                jwVar.setBackground(null);
            }
        }
        wt wtVar = this.C1;
        if (wtVar != null) {
            wtVar.c.a();
        }
        int i10 = 0;
        while (true) {
            rxVar = this.W;
            z10 = this.j2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                rxVar = this.H0;
            } else if (i10 != 1) {
                rxVar = this.p0;
            }
            if (rxVar != null) {
                rp rpVar = rxVar.d;
                FrameLayout frameLayout = rxVar.n;
                View view2 = rxVar.f;
                if (this.v0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.wf));
                } else {
                    view2.setBackground(null);
                }
                rxVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.zf));
                rxVar.c.a(z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.yf));
                org.telegram.ui.ActionBar.k6.C1(z10 ? v(0.06f) : z(org.telegram.ui.ActionBar.k6.xf), frameLayout.getBackground());
                frameLayout.invalidate();
                rpVar.setHintTextColor(z10 ? v(0.45f) : z(org.telegram.ui.ActionBar.k6.yf));
                rpVar.setTextColor(z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.G6));
            }
            i10++;
        }
        Paint paint = this.t1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.k6.Pf));
        }
        rw rwVar = this.Q;
        if (rwVar != null) {
            rwVar.setGlowColor(z(org.telegram.ui.ActionBar.k6.wf));
        }
        ov ovVar = this.E0;
        if (ovVar != null) {
            ovVar.setGlowColor(z(org.telegram.ui.ActionBar.k6.wf));
        }
        sv svVar = this.C0;
        if (svVar != null) {
            svVar.setIndicatorColor(z(org.telegram.ui.ActionBar.k6.Ff));
            svVar.setUnderlineColor(z(org.telegram.ui.ActionBar.k6.zf));
            if (this.v0) {
                svVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.wf));
            } else {
                svVar.setBackground(null);
            }
        }
        mw mwVar = this.q0;
        if (mwVar != null) {
            mwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.k6.Ff));
            mwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.k6.zf));
            if (this.v0) {
                mwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.wf));
            } else {
                mwVar.setBackground(null);
            }
        }
        int v = z10 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf);
        boolean z13 = v != this.J2;
        this.J2 = v;
        vv vvVar = this.y;
        if (vvVar != null) {
            if (z13) {
                vvVar.setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
            }
            if (rxVar == null) {
                Drawable background2 = vvVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.k6.wf;
                org.telegram.ui.ActionBar.k6.H1(background2, z(i11), false);
                org.telegram.ui.ActionBar.k6.H1(vvVar.getBackground(), z(i11), true);
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
        ci.ec ecVar = this.O0;
        if (ecVar != null) {
            if (ecVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) ecVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.k6.eg));
                ecVar.invalidate();
            }
            ecVar.setTextColor(z(org.telegram.ui.ActionBar.k6.dg));
        }
        jx jxVar = this.k0;
        if (jxVar != null) {
            lx lxVar = jxVar.e;
            int i12 = org.telegram.ui.ActionBar.k6.Af;
            int z14 = z(i12);
            if (z14 != this.K2) {
                this.K2 = z14;
                lxVar.a.setColorFilter(new PorterDuffColorFilter(z14, PorterDuff.Mode.MULTIPLY));
            }
            lxVar.b.setTextColor(z(i12));
            lxVar.c.setProgressColor(z(org.telegram.ui.ActionBar.k6.h6));
        }
        int z15 = z(org.telegram.ui.ActionBar.k6.Ci);
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
            org.telegram.ui.ActionBar.k6.E1(drawableArr[i13], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Cf), false);
            org.telegram.ui.ActionBar.k6.E1(drawableArr[i13], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df), true);
            i13++;
        }
        if (jwVar != null && (vuVar = jwVar.E) != null) {
            vuVar.d();
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Z0;
            if (i14 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.E1(drawableArr2[i14], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), false);
            org.telegram.ui.ActionBar.k6.E1(drawableArr2[i14], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df), true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.a1;
            if (i15 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.k6.E1(drawableArr3[i15], z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), false);
            org.telegram.ui.ActionBar.k6.E1(drawableArr3[i15], z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df), true);
            i15++;
        }
        org.telegram.ui.ActionBar.t5 t5Var = this.b2;
        if (t5Var != null) {
            org.telegram.ui.ActionBar.k6.E1(t5Var, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Cf), false);
            org.telegram.ui.ActionBar.k6.E1(t5Var, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df), true);
        }
        org.telegram.ui.ActionBar.t5 t5Var2 = this.c2;
        if (t5Var2 != null) {
            org.telegram.ui.ActionBar.k6.E1(t5Var2, z10 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Ff), false);
            org.telegram.ui.ActionBar.k6.E1(t5Var2, z10 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Ff), true);
        }
    }

    public final void T() {
        rw rwVar = this.Q;
        if (rwVar == null) {
            return;
        }
        for (int i3 = 0; i3 < rwVar.getChildCount(); i3++) {
            View childAt = rwVar.getChildAt(i3);
            if (childAt instanceof ww) {
                ((ww) childAt).a(true);
            }
        }
    }

    public final void U(int i3) {
        if (this.g0) {
            return;
        }
        int i10 = -1;
        if (i3 != -1) {
            int size = getRecentEmoji().size() + (this.e0 ? 1 : 0);
            ow owVar = this.S;
            int i11 = owVar.c;
            ArrayList arrayList = owVar.y;
            int i12 = 0;
            int i13 = size + (i11 >= 0 ? 3 : 0);
            if (i3 >= i13) {
                int i14 = 0;
                while (true) {
                    String[][] strArr = org.telegram.messenger.j6.f;
                    if (i14 >= 8) {
                        break;
                    }
                    i13 += strArr[i14].length + 1;
                    if (i3 < i13) {
                        i10 = i14 + 1;
                        break;
                    }
                    i14++;
                }
                if (i10 < 0) {
                    ArrayList<sw> emojipacks = getEmojipacks();
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((Integer) arrayList.get(size2)).intValue() <= i3) {
                            sw swVar = (sw) this.r1.get(size2);
                            while (i12 < emojipacks.size()) {
                                long j10 = emojipacks.get(i12).b.id;
                                long j11 = swVar.b.id;
                                if (j10 == j11 && (!swVar.g || (!swVar.f && !this.q1.contains(Long.valueOf(j11))))) {
                                    char[] cArr = org.telegram.messenger.j6.a;
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

    public final void V() {
        int i3;
        qx qxVar;
        int i10;
        boolean z10;
        mw mwVar = this.q0;
        int currentPosition = mwVar.getCurrentPosition();
        int i11 = this.s0;
        boolean z11 = currentPosition == i11;
        boolean z12 = i11 >= 0;
        boolean isEmpty = this.j1.isEmpty();
        mwVar.d(false);
        this.s0 = -2;
        this.t0 = -2;
        this.u0 = -2;
        Drawable[] drawableArr = this.a1;
        if (isEmpty) {
            i3 = 0;
        } else {
            this.s0 = 0;
            mwVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.bd.M0(2131746372, null));
            i3 = 1;
        }
        this.t0 = i3;
        mwVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.bd.M0(2131750835, null));
        this.u0 = i3 + 1;
        org.telegram.messenger.g0.L(13.0f);
        org.telegram.messenger.g0.L(11.0f);
        int i12 = this.d1;
        ArrayList arrayList = org.telegram.messenger.hp.s1(i12).c4;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = (String) arrayList.get(i13);
            org.telegram.messenger.e6 g7 = org.telegram.messenger.i6.g(str);
            if (g7 != null) {
                TLRPC.Document T = org.telegram.messenger.li.b0(i12).T(str);
                String i14 = k2.p1.i(i13 + 3, "tab");
                int i15 = mwVar.y;
                mwVar.y = i15 + 1;
                ev0 ev0Var = (ev0) mwVar.n.get(i14);
                if (ev0Var != null) {
                    mwVar.g(i14, ev0Var, i15);
                    i10 = currentPosition;
                    z10 = z12;
                } else {
                    i10 = currentPosition;
                    z10 = z12;
                    ev0Var = new ev0(mwVar.getContext(), 2);
                    ev0Var.setFocusable(true);
                    ev0Var.setOnClickListener(new ok0(mwVar, 2));
                    ev0Var.setExpanded(mwVar.g0);
                    ev0Var.a(mwVar.j0);
                    mwVar.e.addView(ev0Var, i15);
                }
                ev0Var.d = false;
                ev0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                ev0Var.setTag(R.id.parent_tag, g7);
                ev0Var.setTag(R.id.object_tag, T);
                ev0Var.setSelected(i15 == mwVar.E);
                mwVar.h.put(i14, ev0Var);
                ev0Var.setContentDescription(str);
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
        mwVar.h();
        mwVar.q();
        if (z11 && isEmpty) {
            mwVar.m(this.t0);
            lv lvVar = this.p0;
            if (lvVar == null || (qxVar = lvVar.r) == null) {
                return;
            }
            qxVar.I1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        if (mwVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                mwVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                mwVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        jx jxVar;
        int size = this.j1.size();
        long n4 = org.telegram.messenger.li.n(ConnectionsManager.DEFAULT_DATACENTER_ID, this.j1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.li.b0(this.d1).j0);
        this.j1 = arrayList;
        long n10 = org.telegram.messenger.li.n(ConnectionsManager.DEFAULT_DATACENTER_ID, arrayList);
        if ((this.q0 != null && size == 0 && !this.j1.isEmpty()) || (size != 0 && this.j1.isEmpty())) {
            V();
        }
        if ((size == this.j1.size() && n4 == n10) || (jxVar = this.o0) == null) {
            return;
        }
        jxVar.f();
    }

    public final void X(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        sv svVar = this.C0;
        if (svVar != null) {
            org.telegram.ui.s51 s51Var = svVar.e;
            if (svVar.s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            int i10 = 0;
            this.f0 = false;
            this.F1 = 0;
            int currentPosition = svVar.getCurrentPosition();
            svVar.d((getParent() == null || getVisibility() != 0 || (this.z1.size() == 0 && this.A1.size() == 0)) ? false : true);
            int i11 = this.d1;
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i11);
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i11).f7;
            ArrayList arrayList3 = this.n1;
            arrayList3.clear();
            ArrayList arrayList4 = b02.t0[0];
            int size = arrayList4.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i12);
                if (!b02.B0(stickerSetCovered.set.id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            cy cyVar = this.G0;
            if (cyVar != null) {
                cyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Z0;
            org.telegram.ui.ActionBar.e6 e6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.id)) {
                int i13 = b02.v0[0].isEmpty() ? 2 : 3;
                ev0 c2 = svVar.c(i13, drawableArr[i13]);
                c2.h.setText(org.telegram.messenger.bd.M0(2131750832, null));
                c2.setContentDescription(org.telegram.messenger.bd.M0(2131750834, null));
                int i14 = this.F1;
                this.I1 = i14;
                this.F1 = i14 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i15 = this.F1;
                this.H1 = i15;
                this.F1 = i15 + 1;
                ev0 c10 = svVar.c(1, drawableArr[1]);
                c10.h.setText(org.telegram.messenger.bd.M0(2131750839, null));
                c10.setContentDescription(org.telegram.messenger.bd.M0(2131750842, null));
            }
            if (!this.k1.isEmpty()) {
                int i16 = this.F1;
                this.G1 = i16;
                this.F1 = i16 + 1;
                ev0 c11 = svVar.c(0, drawableArr[0]);
                c11.h.setText(org.telegram.messenger.bd.M0(2131746371, null));
                c11.setContentDescription(org.telegram.messenger.bd.M0(2131746372, null));
            }
            ArrayList arrayList5 = this.e1;
            arrayList5.clear();
            this.i1 = null;
            this.g1 = -1;
            this.f1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(b02.s0(0));
            }
            ArrayList arrayList6 = this.G2;
            int i17 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.y1;
                if (i17 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i17];
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
                        stickerSetCoveredArr[i17] = null;
                    }
                }
                i17++;
                j10 = j11;
            }
            long j12 = j10;
            ArrayList w02 = org.telegram.messenger.hp.s1(i11).w0(arrayList6);
            for (int i18 = 0; i18 < w02.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) w02.get(i18);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j13 = org.telegram.messenger.hp.s1(i11).f7.getLong("group_hide_stickers_" + this.K1.id, -1L);
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(this.K1.id));
                if (M0 == null || this.K1.stickerset == null || !org.telegram.messenger.t3.N(M0)) {
                    this.h1 = j13 != -1;
                } else {
                    TLRPC.StickerSet stickerSet3 = this.K1.stickerset;
                    if (stickerSet3 != null) {
                        this.h1 = j13 == stickerSet3.id;
                    }
                }
                TLRPC.ChatFull chatFull = this.K1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet Y = b02.Y(stickerSet4);
                    if (Y != null && (arrayList = Y.documents) != null && !arrayList.isEmpty() && Y.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = Y.documents;
                        tL_messages_stickerSet3.packs = Y.packs;
                        tL_messages_stickerSet3.set = Y.set;
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
                    TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(this.K1.id));
                    if (M02 == null) {
                        arrayList5.remove(i10);
                        i19--;
                    } else {
                        this.f0 = true;
                        String str = "chat" + M02.id;
                        int i20 = svVar.y;
                        svVar.y = i20 + 1;
                        ev0 ev0Var = (ev0) svVar.n.get(str);
                        if (ev0Var != null) {
                            svVar.g(str, ev0Var, i20);
                        } else {
                            ev0Var = new ev0(svVar.getContext(), i10);
                            ev0Var.setFocusable(true);
                            ev0Var.setOnClickListener(new ok0(svVar, i10));
                            s51Var.addView(ev0Var, i20);
                            ev0Var.x = true;
                            u8 u8Var = new u8(e6Var2);
                            u8Var.u(org.telegram.messenger.g0.L(14.0f));
                            u8Var.q(M02);
                            int i21 = svVar.a;
                            k9 k9Var = ev0Var.e;
                            k9Var.setLayerNum(i21);
                            k9Var.e(M02, u8Var);
                            k9Var.setAspectFit(true);
                            ev0Var.setExpanded(svVar.g0);
                            ev0Var.a(svVar.j0);
                            ev0Var.h.setText(M02.title);
                        }
                        ev0Var.d = true;
                        ev0Var.setTag(R.id.index_tag, Integer.valueOf(i20));
                        ev0Var.setSelected(i20 == svVar.E);
                        svVar.h.put(str, ev0Var);
                    }
                    i3 = 0;
                    e6Var = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i19);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
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
                    int i23 = svVar.y;
                    svVar.y = i23 + 1;
                    ev0 ev0Var2 = (ev0) svVar.n.get(str2);
                    if (ev0Var2 != null) {
                        svVar.g(str2, ev0Var2, i23);
                    } else {
                        ev0Var2 = new ev0(svVar.getContext(), 0);
                        ev0Var2.setFocusable(true);
                        ev0Var2.setOnClickListener(new ok0(svVar, 1));
                        ev0Var2.setExpanded(svVar.g0);
                        ev0Var2.a(svVar.j0);
                        s51Var.addView(ev0Var2, i23);
                    }
                    ev0Var2.e.setLayerNum(svVar.a);
                    i3 = 0;
                    ev0Var2.d = false;
                    ev0Var2.setTag(w10);
                    ev0Var2.setTag(R.id.index_tag, Integer.valueOf(i23));
                    ev0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    ev0Var2.setTag(R.id.object_tag, document);
                    ev0Var2.setSelected(i23 == svVar.E);
                    svVar.h.put(str2, ev0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    e6Var = null;
                    sb2.append(org.telegram.messenger.bd.M0(2131754757, null));
                    ev0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i10 = i3;
                e6Var2 = e6Var;
            }
            svVar.h();
            svVar.q();
            if (currentPosition != 0) {
                svVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            q(false);
            float f12 = 1.0f - this.a.e;
            rv rvVar = this.H0;
            rvVar.setAlpha(f12);
            rvVar.setVisibility(f12 > 0.0f ? 0 : 4);
            float f13 = 1.0f - f12;
            qh.c cVar2 = this.I0;
            cVar2.setAlpha(f13);
            cVar2.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f12);
            cVar2.setVisibility(f13 > 0.0f ? 0 : 4);
            org.telegram.ui.n61 n61Var = this.N;
            n61Var.setAlpha(f13);
            n61Var.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f12);
            n61Var.setVisibility(f13 > 0.0f ? 0 : 4);
            R();
            this.y0.invalidate();
            return;
        }
        if (i3 == 1) {
            l(false);
            float f14 = 1.0f - this.b.e;
            gv gvVar = this.W;
            gvVar.setAlpha(f14);
            gvVar.setVisibility(f14 > 0.0f ? 0 : 4);
            float f15 = 1.0f - f14;
            qh.c cVar3 = this.V;
            cVar3.setAlpha(f15);
            cVar3.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f14);
            cVar3.setVisibility(f15 > 0.0f ? 0 : 4);
            org.telegram.ui.n61 n61Var2 = this.L;
            n61Var2.setAlpha(f15);
            n61Var2.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f14);
            n61Var2.setVisibility(f15 > 0.0f ? 0 : 4);
            R();
            this.K.invalidate();
        }
    }

    public final void Z() {
        tv tvVar = this.D0;
        sv svVar = this.C0;
        if (svVar != null && tvVar == null && this.u1 != null) {
            svVar.setTranslationY(this.u1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (tvVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.L0 && this.u1.p() != 1.0f;
        tvVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.z2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.y0, rect, null);
            float p10 = this.u1.p() * org.telegram.messenger.g0.L(50.0f);
            int i3 = rect.left;
            if (i3 != 0 || p10 != 0.0f) {
                this.Y1 = false;
            }
            tvVar.setTranslationX(i3);
            float translationY = (((getTranslationY() + getTop()) - tvVar.getTop()) - svVar.getExpandedOffset()) - p10;
            if (tvVar.getTranslationY() != translationY) {
                tvVar.setTranslationY(translationY);
                tvVar.invalidate();
            }
        }
        if (this.Y1 && z10 && this.Q0) {
            svVar.i(true, this.X1);
        } else {
            this.Y1 = false;
            svVar.i(false, this.X1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    public final void a0() {
        int i3;
        boolean z10;
        LongSparseArray longSparseArray = this.A1;
        LongSparseArray longSparseArray2 = this.z1;
        int i10 = this.d1;
        ov ovVar = this.E0;
        if (ovVar == null) {
            return;
        }
        try {
            int childCount = ovVar.getChildCount();
            ?? r72 = 0;
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = ovVar.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u3) || ((bj0) ovVar.T(childAt)) == null) {
                    i3 = i11;
                } else {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                    ArrayList arrayList = org.telegram.messenger.li.b0(i10).v0[r72];
                    TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                    boolean z11 = (arrayList == null || !arrayList.contains(Long.valueOf(stickerSet.set.id))) ? r72 : true;
                    int i12 = r72;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.y1;
                        if (i12 >= stickerSetCoveredArr.length) {
                            i3 = i11;
                            z10 = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                        if (stickerSetCovered != null) {
                            i3 = i11;
                            if (stickerSetCovered.set.id == stickerSet.set.id) {
                                z10 = true;
                                break;
                            }
                        } else {
                            i3 = i11;
                        }
                        i12++;
                        i11 = i3;
                    }
                    u3Var.c(stickerSet, z11, true, 0, 0, z10);
                    if (z11) {
                        org.telegram.messenger.li.b0(i10).e1(stickerSet.set.id);
                    }
                    boolean z12 = longSparseArray2.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z13 = longSparseArray.indexOfKey(stickerSet.set.id) >= 0;
                    if (z12 || z13) {
                        if (z12 && u3Var.r) {
                            longSparseArray2.remove(stickerSet.set.id);
                            z12 = false;
                        } else if (z13 && !u3Var.r) {
                            longSparseArray.remove(stickerSet.set.id);
                        }
                    }
                    u3Var.b(!z10 && z12, true);
                }
                i11 = i3 + 1;
                r72 = 0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // sh.a
    public final void c(int i3) {
        setBottomInset(i3);
    }

    @Override // sh.a
    public final void d(float f10) {
        this.s2 = f10;
        R();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.messenger.u10 u10Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.hs.x0;
        ow owVar = this.S;
        av avVar = this.S2;
        if (i3 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.z0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    a0();
                    D();
                    o();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    owVar.F(false);
                    return;
                } else {
                    org.telegram.messenger.g0.r(avVar);
                    org.telegram.messenger.g0.i3(avVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.q3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.id == longValue && booleanValue) {
                owVar.F(true);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.z0) {
            a0();
            lb0 lb0Var = this.x;
            if (lb0Var != null) {
                int childCount = lb0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    lb0Var.getChildAt(i12).invalidate();
                }
            }
            X(false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.A0) {
            if (owVar != null) {
                owVar.F(false);
                return;
            }
            return;
        }
        int i13 = org.telegram.messenger.hs.B0;
        ex exVar = this.T;
        if (i3 == i13) {
            Long l10 = (Long) objArr[0];
            long longValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                yx yxVar = this.A0;
                if (yxVar != null && yxVar.d == longValue2 && yxVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    yxVar.f = tL_messages_stickerSet.documents;
                    yxVar.f();
                }
                if (exVar != null && exVar.d == longValue2 && exVar.f.size() < tL_messages_stickerSet.documents.size()) {
                    exVar.f = tL_messages_stickerSet.documents;
                    exVar.f();
                }
            }
            TLRPC.ChatFull chatFull2 = this.K1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == longValue2) {
                X(false);
            }
            HashMap hashMap = this.s1;
            if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.u10) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (u10Var = (org.telegram.messenger.u10) hashMap.remove(l10)) != null) {
                u10Var.a(tL_messages_stickerSet);
            }
            org.telegram.messenger.g0.r(avVar);
            org.telegram.messenger.g0.i3(avVar, 100L);
            return;
        }
        int i14 = org.telegram.messenger.hs.i4;
        rw rwVar = this.Q;
        if (i3 != i14) {
            if (i3 != org.telegram.messenger.hs.L2) {
                if (i3 == org.telegram.messenger.hs.f5) {
                    if (owVar != null) {
                        owVar.F(false);
                    }
                    T();
                    X(false);
                    return;
                }
                return;
            }
            if (rwVar == null || !this.e0) {
                return;
            }
            if ((this.W.c.k == 2 || rwVar.getAdapter() == exVar) && !TextUtils.isEmpty(exVar.w)) {
                exVar.F(exVar.w, true);
                return;
            }
            return;
        }
        ov ovVar = this.E0;
        if (ovVar != null) {
            int childCount2 = ovVar.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt = ovVar.getChildAt(i15);
                if ((childAt instanceof org.telegram.ui.Cells.i8) || (childAt instanceof org.telegram.ui.Cells.y7)) {
                    childAt.invalidate();
                }
            }
        }
        if (rwVar != null) {
            rwVar.invalidate();
            int childCount3 = rwVar.getChildCount();
            for (int i16 = 0; i16 < childCount3; i16++) {
                View childAt2 = rwVar.getChildAt(i16);
                if (childAt2 instanceof nx) {
                    childAt2.invalidate();
                }
            }
        }
        wt wtVar = this.C1;
        if (wtVar != null) {
            wtVar.c.invalidate();
        }
        mw mwVar = this.q0;
        if (mwVar != null) {
            org.telegram.ui.s51 s51Var = mwVar.e;
            int childCount4 = s51Var.getChildCount();
            for (int i17 = 0; i17 < childCount4; i17++) {
                s51Var.getChildAt(i17).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        R();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.h) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (this.n.getVisibility() != 8 && !this.v0 && this.x0) {
            canvas.drawColor(i0.a.o(-1, 25));
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        float R0 = org.telegram.messenger.g0.R0(this.r2);
        if (R0 > 0.0f) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(R0, z(org.telegram.ui.ActionBar.k6.wf));
            int i3 = this.B2;
            GradientDrawable gradientDrawable = this.A2;
            if (i3 != r12) {
                gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.k6.r1(0.66f, r12), i0.a.o(r12, 0)});
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

    public ArrayList<sw> getEmojipacks() {
        ArrayList<sw> arrayList = new ArrayList<>();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.r1;
            if (i3 >= arrayList2.size()) {
                return arrayList;
            }
            sw swVar = (sw) arrayList2.get(i3);
            boolean z10 = swVar.g;
            ArrayList arrayList3 = this.q1;
            if ((!z10 && (swVar.f || arrayList3.contains(Long.valueOf(swVar.b.id)))) || (swVar.g && !swVar.f && !arrayList3.contains(Long.valueOf(swVar.b.id)))) {
                arrayList.add(swVar);
            }
            i3++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.d2) {
            return org.telegram.messenger.i6.i;
        }
        if (this.C2 == null) {
            this.C2 = new ArrayList();
        }
        if (org.telegram.messenger.i6.i.size() != this.D2) {
            this.C2.clear();
            int i3 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.i6.i;
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (!((String) arrayList.get(i3)).startsWith("animated_")) {
                    this.C2.add((String) arrayList.get(i3));
                }
                i3++;
            }
            this.D2 = this.C2.size();
        }
        return this.C2;
    }

    public float getStickersExpandOffset() {
        sv svVar = this.C0;
        if (svVar == null) {
            return 0.0f;
        }
        return svVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str == null) {
            return;
        }
        if (!str.startsWith("animated_") && !org.telegram.messenger.i6.h(str)) {
            return;
        }
        org.telegram.messenger.i6.a(str);
        int i3 = 0;
        if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
            org.telegram.messenger.i6.s();
            this.S.F(false);
        }
        org.telegram.messenger.i6.r();
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
            ArrayList arrayList2 = org.telegram.messenger.i6.i;
            if (i3 >= arrayList2.size()) {
                this.D2 = this.C2.size();
                return;
            } else {
                if (!((String) arrayList2.get(i3)).startsWith("animated_")) {
                    this.C2.add((String) arrayList2.get(i3));
                }
                i3++;
            }
        }
    }

    public final void i(int i3, int i10, boolean z10) {
        if (i3 == 2 || x(i3).K(0) == null) {
            return;
        }
        cw cwVar = new cw(getContext(), i10);
        cwVar.a = !z10 ? 1 : 0;
        w(i3).w0(cwVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.k1.size();
        int size2 = this.l1.size();
        int i3 = this.d1;
        this.k1 = org.telegram.messenger.li.b0(i3).i0(0, true);
        this.l1 = org.telegram.messenger.li.b0(i3).i0(2, false);
        if (org.telegram.messenger.h10.i(i3).q()) {
            this.m1 = org.telegram.messenger.li.b0(i3).i0(7, false);
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
        if (org.telegram.messenger.hp.s1(i3).D3()) {
            int i12 = 0;
            while (i12 < this.l1.size()) {
                if (org.telegram.messenger.zi.Y3((TLRPC.Document) this.l1.get(i12))) {
                    this.l1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.k1.size()) {
                if (org.telegram.messenger.zi.Y3((TLRPC.Document) this.k1.get(i13))) {
                    this.k1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.k1.size() || size2 != this.l1.size()) {
            X(false);
        }
        vx vxVar = this.z0;
        if (vxVar != null) {
            vxVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        fx fxVar = this.u1;
        qe.a aVar = this.b;
        rw rwVar = this.Q;
        gv gvVar = this.W;
        if (fxVar != null && fxVar.z()) {
            u4.d1 K = rwVar.K(0);
            if (K == null) {
                rx.a(gvVar, true, !z10);
            } else {
                rx.a(gvVar, K.a.getTop() < rwVar.getPaddingTop(), !z10);
            }
            N(false, !z10);
            gvVar.setTranslationY(aVar.e * org.telegram.messenger.g0.L(15.0f));
            return;
        }
        if (gvVar == null || rwVar == null) {
            return;
        }
        gvVar.setTranslationY((aVar.e * org.telegram.messenger.g0.L(15.0f)) + (rwVar.K(0) != null ? r0.a.getTop() : -this.c1));
        gvVar.a.a(false, !z10);
        m(Math.round(this.J.getTranslationY()));
    }

    public final void m(int i3) {
        ObjectAnimator objectAnimator = this.S0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            u4.d1 K = this.Q.K(0);
            int L = org.telegram.messenger.g0.L(38.0f) + i3;
            if (L > 0 && (K == null || K.a.getBottom() < L)) {
                z10 = true;
            }
            N(z10, !this.L1);
        }
    }

    public final void n(int i3, View view) {
        rw rwVar;
        u4.d1 K;
        jw jwVar = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            jwVar.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.g0) {
            return;
        }
        fx fxVar = this.u1;
        if (fxVar == null || !fxVar.z()) {
            if (i3 > 0 && (rwVar = this.Q) != null && rwVar.getVisibility() == 0 && (K = rwVar.K(0)) != null) {
                if (K.a.getTop() + (this.e0 ? this.c1 : 0) >= rwVar.getPaddingTop()) {
                    return;
                }
            }
            int i10 = iArr[1] - i3;
            iArr[1] = i10;
            if (i10 > 0) {
                iArr[1] = 0;
            } else if (i10 < (-org.telegram.messenger.g0.L(108.0f))) {
                iArr[1] = -org.telegram.messenger.g0.L(108.0f);
            }
            jwVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
        }
    }

    public final void o() {
        int L0;
        sv svVar = this.C0;
        if (svVar == null || (L0 = this.F0.L0()) == -1) {
            return;
        }
        int i3 = this.H1;
        if (i3 <= 0 && (i3 = this.G1) <= 0) {
            i3 = this.F1;
        }
        svVar.k(this.z0.F(L0), i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        za.p pVar = this.N2;
        if (pVar != null) {
            pVar.a();
            this.N2 = null;
        }
        za.p pVar2 = (za.p) new org.telegram.messenger.gs(org.telegram.messenger.hs.f(this.d1), this).b;
        pVar2.d(org.telegram.messenger.hs.i4);
        pVar2.b(org.telegram.messenger.hs.L2);
        pVar2.b(org.telegram.messenger.hs.q3);
        this.N2 = pVar2;
        if (this.z0 != null) {
            pVar2.b(org.telegram.messenger.hs.x0);
            pVar2.b(org.telegram.messenger.hs.X0);
            pVar2.b(org.telegram.messenger.hs.z0);
            pVar2.b(org.telegram.messenger.hs.B0);
            pVar2.b(org.telegram.messenger.hs.f5);
            org.telegram.messenger.g0.h3(new av(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wt wtVar = this.C1;
        if (wtVar != null && wtVar.isShowing()) {
            wtVar.dismiss();
        }
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
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
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        if (this.P1 != i13) {
            this.P1 = i13;
            D();
        }
        super.onLayout(z10, i3, i10, i11, i12);
        R();
        Z();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
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
                int i11 = org.telegram.ui.ActionBar.k6.wf;
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
                int i12 = org.telegram.ui.ActionBar.k6.wf;
                setBackgroundColor(z(i12));
                if (z11) {
                    view.setBackgroundColor(z(i12));
                }
            }
            this.M1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
        this.L1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i3) {
        int L0;
        int L02;
        if (i3 == 0) {
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
        if (i3 == 2) {
            u4.h0 adapter = this.i0.getAdapter();
            jx jxVar = this.o0;
            if (adapter != jxVar || jxVar.J < 0 || this.t0 < 0 || this.s0 < 0 || (L0 = this.j0.L0()) == -1) {
                return;
            }
            this.q0.k(L0 >= jxVar.J ? this.t0 : this.s0, 0);
        }
    }

    public final void q(boolean z10) {
        fx fxVar = this.u1;
        qe.a aVar = this.a;
        ov ovVar = this.E0;
        rv rvVar = this.H0;
        if (fxVar != null && fxVar.z()) {
            u4.d1 K = ovVar.K(0);
            if (K == null) {
                rx.a(rvVar, true, !z10);
            } else {
                rx.a(rvVar, K.a.getTop() < ovVar.getPaddingTop(), !z10);
            }
            rvVar.setTranslationY(aVar.e * org.telegram.messenger.g0.L(15.0f));
            return;
        }
        if (rvVar == null || ovVar == null) {
            return;
        }
        rvVar.setTranslationY((aVar.e * org.telegram.messenger.g0.L(15.0f)) + (ovVar.K(0) != null ? r0.a.getTop() : -this.c1));
        rvVar.a.a(false, !z10);
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.i6.a;
        org.telegram.messenger.hp.d1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.i6.h.clear();
        org.telegram.messenger.i6.i.clear();
        org.telegram.messenger.i6.r();
        this.S.F(false);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.L1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j10, boolean z10) {
        rx rxVar;
        u4.b0 b0Var;
        View view;
        tj0 tj0Var;
        int i3;
        int i10;
        TLRPC.TL_messages_stickerSet o02;
        vx vxVar;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j10 != -1 && (o02 = org.telegram.messenger.li.b0(this.d1).o0(j10)) != null && (E = (vxVar = this.z0).E(o02)) >= 0 && E < vxVar.b()) {
            H(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        jx jxVar = this.k0;
        if (jxVar != null) {
            jxVar.L = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            tj0 tj0Var2 = this.E0;
            tj0 tj0Var3 = this.i0;
            lv lvVar = this.p0;
            tj0 tj0Var4 = this.Q;
            if (i13 == 0) {
                rxVar = this.W;
                b0Var = this.R;
                view = this.J;
                tj0Var = tj0Var4;
            } else if (i13 == 1) {
                b0Var = this.j0;
                view = this.q0;
                tj0Var = tj0Var3;
                rxVar = lvVar;
            } else {
                rxVar = this.H0;
                b0Var = this.F0;
                view = this.C0;
                tj0Var = tj0Var2;
            }
            if (rxVar == null) {
                i10 = i12;
                i3 = i11;
            } else {
                int i14 = i12;
                qx qxVar = rxVar.r;
                int i15 = i11;
                rxVar.d.setText("");
                if (qxVar != null) {
                    qxVar.I1(null);
                    qxVar.G1();
                }
                int i16 = this.c1;
                if (i13 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.N0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i13 == 1) {
                        float[] fArr = new float[1];
                        fArr[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tj0Var, (Property<tj0, Float>) property, fArr);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[i14] = ofFloat;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr2 = new float[1];
                        fArr2[i14] = 0.0f;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tj0Var, (Property<tj0, Float>) property, fArr3);
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(rxVar, (Property<rx, Float>) property, fArr4);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[i14] = ofFloat2;
                        animatorArr2[1] = ofFloat3;
                        animatorArr2[i15] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(xq.h);
                    this.N0.addListener(new ei.k3(this, b0Var, tj0Var, 6));
                    this.N0.start();
                    i10 = i14;
                    i3 = i15;
                } else {
                    if (rxVar != lvVar) {
                        rxVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i3 = i15;
                    if (view != null && i13 != i3) {
                        view.setTranslationY(0.0f);
                    }
                    if (tj0Var == tj0Var2) {
                        i10 = i14;
                        tj0Var.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.r2);
                    } else {
                        i10 = i14;
                        if (tj0Var == tj0Var3) {
                            tj0Var.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.r2);
                        } else {
                            if (tj0Var == tj0Var4) {
                                tj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.r2);
                            }
                            i10 = 0;
                        }
                    }
                    b0Var.h1(i10, i10);
                }
            }
            i13++;
            i11 = i3;
            i12 = i10;
        }
        int i17 = i12;
        if (z10) {
            return;
        }
        this.u1.i(i17);
    }

    public void setBlurredBackgroundDrawableFactory(eh.c cVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.a2;
        vv vvVar = this.y;
        if (vvVar != null) {
            gh.g c2 = cVar.c(vvVar, null, false);
            c2.p(b8.cd.d(e6Var));
            c2.r(org.telegram.messenger.g0.L(18.0f));
            c2.q(org.telegram.messenger.g0.L(6.0f));
            vvVar.setBackground(c2);
        }
        ImageView imageView = this.F;
        if (imageView != null) {
            gh.g c10 = cVar.c(imageView, null, false);
            c10.p(b8.cd.d(e6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            imageView.setBackground(c10);
        }
        lb0 lb0Var = this.x;
        if (lb0Var != null) {
            gh.g c11 = cVar.c(lb0Var, null, false);
            c11.p(b8.cd.d(e6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            lb0Var.setBackground(c11);
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            gh.g c12 = cVar.c(imageView2, null, false);
            c12.p(b8.cd.d(e6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            imageView2.setBackground(c12);
        }
    }

    public void setBottomInset(int i3) {
        if (this.r2 != i3) {
            this.r2 = i3;
            j(i3, this.L);
            j(i3, this.N);
            j(org.telegram.messenger.g0.L(44.0f) + i3, this.Q);
            j(org.telegram.messenger.g0.L(44.0f) + i3, this.E0);
            j(org.telegram.messenger.g0.L(44.0f) + i3, this.i0);
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i3);
            }
            R();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.K1 = chatFull;
        X(false);
    }

    public void setDelegate(fx fxVar) {
        this.u1 = fxVar;
    }

    public void setDragListener(lw lwVar) {
        this.P0 = lwVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        rv rvVar = this.H0;
        if (rvVar != null) {
            rvVar.d.setEnabled(z10);
        }
        lv lvVar = this.p0;
        if (lvVar != null) {
            lvVar.d.setEnabled(z10);
        }
        gv gvVar = this.W;
        if (gvVar != null) {
            gvVar.d.setEnabled(z10);
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
        R();
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        boolean z10 = getVisibility() != i3;
        super.setVisibility(i3);
        if (z10) {
            if (i3 != 8) {
                org.telegram.messenger.i6.s();
                this.S.F(false);
                za.p pVar = this.O2;
                int i10 = this.d1;
                if (pVar == null) {
                    za.p pVar2 = (za.p) new org.telegram.messenger.gs(org.telegram.messenger.hs.f(i10), this).b;
                    pVar2.b(org.telegram.messenger.hs.x0);
                    this.O2 = pVar2;
                }
                if (this.z0 != null) {
                    if (!this.P2) {
                        this.P2 = true;
                        this.O2.b(org.telegram.messenger.hs.X0);
                    }
                    X(false);
                    D();
                }
                k(true);
                k(false);
                org.telegram.messenger.li.b0(i10).V0(0, true, true, false);
                org.telegram.messenger.li.b0(i10).V0(0, false, true, false);
                org.telegram.messenger.li.b0(i10).V0(2, false, true, false);
            }
            kg.a1 a1Var = this.U0;
            if (a1Var != null) {
                a1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        vx vxVar;
        boolean z11 = this.U2;
        this.U2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i3 = this.B1;
        if (i3 == 0) {
            ow owVar = this.S;
            if (owVar != null) {
                owVar.F(false);
                return;
            }
            return;
        }
        if (i3 == 1) {
            jx jxVar = this.o0;
            if (jxVar != null) {
                jxVar.f();
                return;
            }
            return;
        }
        if (i3 != 2 || (vxVar = this.z0) == null) {
            return;
        }
        vxVar.f();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            S();
            si.c cVar = this.m2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.k6.d6));
            }
            lb0 lb0Var = this.x;
            if (lb0Var != null) {
                lb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.k6.Df), 20));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int v(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, this.a2), (int) (f10 * 255.0f));
    }

    public final u4.s w(int i3) {
        if (i3 == 0) {
            return this.F0;
        }
        if (i3 == 1) {
            return this.R;
        }
        if (i3 == 2) {
            return this.j0;
        }
        throw new IllegalArgumentException(k2.p1.i(i3, "Unexpected argument: "));
    }

    public final tj0 x(int i3) {
        if (i3 == 0) {
            return this.E0;
        }
        if (i3 == 1) {
            return this.Q;
        }
        if (i3 == 2) {
            return this.i0;
        }
        throw new IllegalArgumentException(k2.p1.i(i3, "Unexpected argument: "));
    }

    public final HorizontalScrollView y(int i3) {
        if (i3 == 0) {
            return this.C0;
        }
        if (i3 == 1) {
            return this.J;
        }
        if (i3 == 2) {
            return this.q0;
        }
        throw new IllegalArgumentException(k2.p1.i(i3, "Unexpected argument: "));
    }

    public final int z(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.a2;
        return e6Var != null ? e6Var.h(i3) : org.telegram.ui.ActionBar.k6.x0(null, i3, false);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // qe.b
    public final void F(float f10, int i3) {
    }
}
